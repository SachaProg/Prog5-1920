package business.repo;

import business.domain.Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<E extends Entity> implements Repository<E> {

    private List<E> es;

    public AbstractRepository() {
        this.es = new ArrayList<>();
    }

    public void save(E e) {
        es.add(e);
    }

    public List<E> getAll() {
        return es;
    }

    public E getByID(Long id) {
        for (E e : es) {
            if (e.getId().equals(id))
                return e;
        }
        return null;
    }
}
