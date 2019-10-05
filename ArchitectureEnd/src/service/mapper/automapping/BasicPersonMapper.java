package service.mapper.automapping;

import business.domain.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import service.dto.Person;

@Mapper
public interface BasicPersonMapper {

    BasicPersonMapper MAPPER = Mappers.getMapper(BasicPersonMapper.class);

    Person toDto(PersonEntity addressEntity);
    PersonEntity toEntity(Person person);
}
