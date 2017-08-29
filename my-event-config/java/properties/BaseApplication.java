package properties;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "my-event-controller", "my-event-service", "my-event-dao", "my-event-config", "my-event-commons" })
public abstract class BaseApplication {
}
