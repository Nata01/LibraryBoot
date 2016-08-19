package application.core.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by natad on 17.08.2016.
 */
public interface BaseDao<T> {

    void create(T entity);

    void update(T entity);

    void delete(T entity);

    List<T> findAll();

    List<T> findAllByProperty(String propertyName, Object propertyValue);

    T getByPK(Serializable primaryKey);

}
