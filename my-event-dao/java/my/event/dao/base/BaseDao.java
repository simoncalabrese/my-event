package my.event.dao.base;

import my.event.commons.commonUtils.FunctionUtils;
import my.event.commons.commonUtils.enums.CommandEnum;
import org.neo4j.driver.v1.Session;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public class BaseDao {

    @Autowired
    private Session session;

    public<T extends Node> void insertNode(T node) {
        final String cypher = FunctionUtils.nodeElementToNeo4jQuery(node, CommandEnum.CREATE);
        session.run(cypher);
    }
}
