package be.hogent.b4.service.mapper;

import java.util.ArrayList;
import java.util.List;

public interface IMapper<D, B> {

    public B toObj(D d);

    public D toDTO(B b);

    default List<B> toObj(List<D> ds){
        if(ds == null)
            return null;
        List<B> bs = new ArrayList<>();
        ds.forEach(d -> bs.add(toObj(d)));
        return bs;
    }

    default List<D> toDTO(List<B> bs){
        if(bs == null)
            return null;
        List<D> ds = new ArrayList<>();
        bs.forEach(b -> ds.add(toDTO(b)));
        return ds;
    }
}
