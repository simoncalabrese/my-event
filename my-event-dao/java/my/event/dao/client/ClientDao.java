package my.event.dao.client;

import my.event.dao.base.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@Repository
public class ClientDao extends BaseDao {
    public void register(ClientNode client) {
        insertNode(client);
    }
}
