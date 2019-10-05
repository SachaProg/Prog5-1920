package service.impl;

import business.domain.Entity;
import business.repo.Repository;
import service.mapper.Mapper;

import java.util.List;

public class AbstractServiceImpl<D, E extends Entity> {

    private Repository<E> repo;
    private Mapper<D, E> mapper;

    protected AbstractServiceImpl(Repository<E> repo, Mapper<D, E> mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public void save(D d) {
        E e = mapper.toEntity(d);
        repo.save(e);
    }

    public List<D> getAll() {
        List<E> es = repo.getAll();
        return mapper.toDTO(es);
    }

    public D getById(long id) {
        return mapper.toDTO(repo.getByID(id));
    }
}
