package service.mapper.automapping;

import business.domain.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import service.dto.Address;

@Mapper
public interface BasicAddressMapper {

    BasicAddressMapper MAPPER = Mappers.getMapper(BasicAddressMapper.class);

     Address toDto(AddressEntity addressEntity);
     AddressEntity toEntity(Address address);
}
