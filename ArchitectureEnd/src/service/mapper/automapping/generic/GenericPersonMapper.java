package service.mapper.automapping.generic;

import business.domain.PersonEntity;
import org.mapstruct.Mapper;
import service.dto.Person;

@Mapper
public interface GenericPersonMapper extends GenericMapper<Person, PersonEntity>{
}
