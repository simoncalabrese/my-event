package dto.base;

import java.util.List;

/**
 * Created by simon.calabrese on 28/08/2017.
 */
public abstract class BaseDTO {

    private UserDTO userDTO;

    private List<Message> message;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}
