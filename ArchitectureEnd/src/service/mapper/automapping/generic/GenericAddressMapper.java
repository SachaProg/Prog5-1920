package service.mapper.automapping.generic;

import business.domain.AddressEntity;
import org.mapstruct.Mapper;
import service.dto.Address;

@Mapper
public interface GenericAddressMapper extends GenericMapper<Address, AddressEntity>{

}
