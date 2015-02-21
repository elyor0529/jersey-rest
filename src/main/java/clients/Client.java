package clients;

import clients.models.EmployeeResponseModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by elyor on 2/21/2015.
 */
public class Client {
    public static void main(String[] args) {
        final long start = 100;
        final long length = 50;
        final EmployeeResponseModel model = SalesFactClient.getEmployeeResponse(start, length);
        final GsonBuilder builder = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        final Gson gson = builder.create();
        final String json = gson.toJson(model);

        System.out.println(json);
    }
}
