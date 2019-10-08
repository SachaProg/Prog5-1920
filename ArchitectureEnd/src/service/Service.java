package service;

import java.util.List;

public interface Service<D> {

    void save(D d);

    List<D> getAll();

    D getById(long i);
}
