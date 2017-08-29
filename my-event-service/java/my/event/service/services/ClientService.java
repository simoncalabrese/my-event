package my.event.service.services;

import my.event.service.navigationFunction.ClientFunctions;
import my.event.dao.client.ClientDao;
import my.event.service.base.BaseService;
import my.event.service.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@Service
public class ClientService extends BaseService {

    @Autowired
    private ClientDao clientDao;

    public void register() {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setCognome("cappuccio");
        clientDTO.setNome("ciccio");
        clientDTO.setSesso("M");
        clientDao.register(convert(clientDTO, ClientFunctions.clientDtoTONode));
    }
}
