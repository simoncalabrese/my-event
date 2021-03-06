package my.event.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@Component(value = "MyEventProperties")
@ConfigurationProperties
public class MyEventProperties extends AbstractProperties {

    @Value("${my.event.config.neo4j.path}")
    private String path;
    @Value("${my.event.config.neo4j.username}")
    private String username;
    @Value("${my.event.config.neo4j.password}")
    private String password;

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
