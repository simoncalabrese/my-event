package my.event.service.services;

import my.event.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@Service
public class TestService {

    @Autowired
    private TestDao dao;

    public void getAll(){
        dao.getAllNodes();
    }
}
