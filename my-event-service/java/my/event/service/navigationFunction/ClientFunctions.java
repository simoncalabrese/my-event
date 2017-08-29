package my.event.service.navigationFunction;

import my.event.dao.client.ClientNode;
import my.event.service.dto.ClientDTO;

import java.util.function.Function;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public class ClientFunctions {

    public static final Function<ClientDTO, ClientNode> clientDtoTONode =
            e -> {
                ClientNode c = new ClientNode();
                c.setNome(e.getNome());
                c.setCognome(e.getCognome());
                c.setSesso(e.getSesso());
                return c;
            };
}
