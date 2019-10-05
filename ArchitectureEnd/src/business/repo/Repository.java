package business.repo;

import business.domain.Entity;

import java.util.List;

public interface Repository<E extends Entity> {

    void save(E e);

    List<E> getAll();

    E getByID(Long id);
}
