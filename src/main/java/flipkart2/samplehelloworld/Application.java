package flipkart2.samplehelloworld;

import com.manywho.sdk.services.BaseApplication;
import com.manywho.sdk.services.ServiceBinder;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends BaseApplication {
    public Application() {
        registerSdk()
                .packages("flipkart2.samplehelloworld")
                .register(new ApplicationBinder());
    }

    public static void main(String[] args) {
        startServer(new Application(), "api/1/samplehelloworld");
    }
}
