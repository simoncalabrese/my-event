package dto.base;

import java.util.List;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public class BaseDTOImpl extends BaseDTO {

    public BaseDTOImpl() {}

    public BaseDTOImpl(final List<Message> messages) {
        super.setMessage(messages);
    }
}
