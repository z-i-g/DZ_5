package ru.iteco.structural.orm.first;

import ru.iteco.structural.IDbEntity;

/**
 * IFirstOrm.
 *
 * @author Ilya_Sukhachev
 */
public interface IFirstOrm<T extends IDbEntity> {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}
