package neo4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import properties.AbstractProperties;
import org.neo4j.driver.v1.*;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
@Configuration
public class Neo4jDriver {
    @Autowired
    private AbstractProperties properties;

    @Bean
    public Driver getDriver() {
        return GraphDatabase.driver(properties.getPath(),AuthTokens.basic( properties.getUsername(),properties.getPassword()));
    }

    @Bean
    public Session getSession() {
        return getDriver().session();
    }
}
