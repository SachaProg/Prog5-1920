package service.mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMapper<D, E> implements Mapper<D, E> {

    @Override
    public List<D> toDTO(List<E> es) {
        List<D> ds = new ArrayList<>();
        es.forEach(e -> ds.add(toDTO(e)));
        return ds;
    }

    @Override
    public List<E> toEntity(List<D> ds) {
        List<E> es = new ArrayList<>();
        ds.forEach(d -> es.add(toEntity(d)));
        return es;
    }
}
