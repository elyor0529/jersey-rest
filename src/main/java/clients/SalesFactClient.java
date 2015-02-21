package clients;

import clients.models.EmployeeResponseModel;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import utils.RestSettings;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by elyor on 2/21/2015.
 */
public class SalesFactClient {

    public static EmployeeResponseModel getEmployeeResponse(Long start, Long length) {

        final ClientConfig config = new ClientConfig().register(EmployeeResponseModel.class);
        final JerseyClient client = JerseyClientBuilder.createClient(config);
        final String targetPath = "/db/sales_fact/" + start + "-" + length;
        final Response response = client.target(RestSettings.BASE_URI).path(targetPath)
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get();
        final EmployeeResponseModel model = response.readEntity(EmployeeResponseModel.class);

        return model;
    }
}
