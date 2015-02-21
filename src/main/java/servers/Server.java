package servers;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import utils.RestSettings;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static void main(String[] args) {
        try {

            final ResourceConfig resourceConfig = new ResourceConfig(DbServer.class);
            final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(RestSettings.BASE_URI, resourceConfig);

            server.start();

            System.out.println("Application started.");
            System.in.read();

            server.shutdownNow();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
