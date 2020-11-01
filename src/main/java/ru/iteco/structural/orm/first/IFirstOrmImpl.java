package ru.iteco.structural.orm.first;

import ru.iteco.structural.IDbEntity;

import java.util.HashSet;
import java.util.Set;

public class IFirstOrmImpl implements IFirstOrm{

    Set<IDbEntity> entities = new HashSet<>();

    @Override
    public void create(IDbEntity entity) {
        entities.add(entity);
    }

    @Override
    public IDbEntity read(int id) {
        return entities.stream().filter(entity -> entity.getId().intValue() == id).findFirst().orElse(null);
    }

    @Override
    public void update(IDbEntity entity) {
        entities.add(entities.stream().filter(dbEntity -> dbEntity == entity).findAny().orElse(entity));
    }

    @Override
    public void delete(IDbEntity entity) {
        if (!entities.isEmpty()) {
            entities.removeIf(dbEntity -> dbEntity == entity);
        }
    }
}
