package business.domain;

import lombok.Data;

@Data
public class AddressEntity extends Entity {

    private String city;
    private int zip;

}
