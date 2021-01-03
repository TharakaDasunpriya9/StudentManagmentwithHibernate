package lk.ijse.royal.dao;

import lk.ijse.royal.entity.SuperEntity;

import java.util.List;

public interface CrudDAO<T extends SuperEntity,ID> extends SupperDAO{
    public boolean save(T entity) throws Exception;

    public boolean update(T entity) throws Exception;

    public boolean delete(T entity) throws Exception;

    public T search(ID id) throws Exception;

    public List<T> getAll() throws Exception;
}
