package my.event.dao;

import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@Repository
public class TestDao {

    @Autowired
    private Session session;

    public void getAllNodes(){
        final StatementResult run = session.run("MATCH (c:Products) return c");
        final List<Record> list = run.list();
        list.forEach(e -> e.fields().stream().map(Pair::key).forEach(System.out::println));
    }
}
