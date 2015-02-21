package servers;

import clients.models.EmployeeResponseModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import db.EmployeeEntity;
import manager.DbManager;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.ConvertHelper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("db")
public class DbServer {

    private static SessionFactory sessionFactory;

    static {
        sessionFactory = DbManager.getSessionFactory();
    }

    @GET
    @Produces("application/json")
    @Path("/employee/{offset}-{limit}")
    public Response getEmployee(@PathParam("offset") Long offset, @PathParam("limit") Long limit) {
        final Session session = sessionFactory.openSession();
        final String selectQuery = "from EmployeeEntity";
        final String countQuery = "SELECT COUNT(*) FROM employee";
        final SQLQuery countSqlQuery = session.createSQLQuery(countQuery);
        final long total = ConvertHelper.ToLong(countSqlQuery.uniqueResult());

        if (limit == null)
            limit = total;

        if (offset == null)
            offset = 0L;

        final Query selectSqlQuery = session.createQuery(selectQuery).setFirstResult(offset.intValue())
                .setMaxResults(limit.intValue() - offset.intValue());
        final ArrayList<EmployeeEntity> list = (ArrayList<EmployeeEntity>) selectSqlQuery.list();
        final EmployeeResponseModel model = new EmployeeResponseModel();

        model.setItems(list);
        model.setOffset(limit);
        model.setTotal(total);
        session.close();

        final GsonBuilder builder = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        final Gson gson = builder.create();
        final String json = gson.toJson(model);

        return Response.ok(json, MediaType.APPLICATION_JSON_TYPE).build();
    }

}
