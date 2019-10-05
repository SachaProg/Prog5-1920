package service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class Address extends AbstractDTO{

    private String city;
    private String zip;

}
