package service.mapper;

import java.util.ArrayList;
import java.util.List;

public interface Mapper<D, E> {

    D toDto(E e);
    E toEntity(D e);

    default List<D> toDto(List<E> es) {
        List<D> ds = new ArrayList<>();
        es.forEach(e -> ds.add(toDto(e)));
        return ds;
    }

    default List<E> toEntity(List<D> ds) {
        List<E> es = new ArrayList<>();
        ds.forEach(d -> es.add(toEntity(d)));
        return es;
    }
}
