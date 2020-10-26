package ru.iteco.structural.adapters.first;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;

import java.util.HashSet;
import java.util.Set;

public class OrmAdapter implements TargetFirstOrm {

    Set<DbUserEntity> dbUserEntity = new HashSet<>();
    Set<DbUserInfoEntity> dbUserInfoEntity = new HashSet<>();

    @Override
    public void createUser(DbUserEntity entity) {
        dbUserEntity.add(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        if (!dbUserEntity.isEmpty()) {
            return dbUserEntity.stream().filter(entity -> entity.getId() == id).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        dbUserEntity.add(dbUserEntity.stream().filter(dbEntity -> dbEntity == entity).findAny().orElse(entity));
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        if (!dbUserEntity.isEmpty()) {
            dbUserEntity.removeIf(dbEntity -> dbEntity == entity);
        }
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        dbUserInfoEntity.add(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        if (!dbUserInfoEntity.isEmpty()) {
            return dbUserInfoEntity.stream().filter(entity -> entity.getId() == id).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        dbUserInfoEntity.add(dbUserInfoEntity.stream().filter(dbEntity -> dbEntity == entity).findAny().orElse(entity));
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        if (!dbUserInfoEntity.isEmpty()) {
            dbUserInfoEntity.removeIf(dbEntity -> dbEntity == entity);
        }
    }
}
