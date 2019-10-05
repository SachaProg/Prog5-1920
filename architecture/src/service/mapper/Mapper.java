package service.mapper;

import java.util.List;

public interface Mapper<D, E> {

    D toDTO(E e);

    E toEntity(D d);

    List<D> toDTO(List<E> es);

    List<E> toEntity(List<D> ds);


}
