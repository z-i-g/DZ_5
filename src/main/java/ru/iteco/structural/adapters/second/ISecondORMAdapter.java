package ru.iteco.structural.adapters.second;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;
import ru.iteco.structural.adapters.Target;
import ru.iteco.structural.orm.second.ISecondOrm;

public class ISecondORMAdapter implements Target  {

    private final ISecondOrm secondOrm;

    public ISecondORMAdapter(ISecondOrm secondOrm) {
        this.secondOrm = secondOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return secondOrm.getContext().getUsers().stream().filter(dbUserEntity -> dbUserEntity.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(secondOrm.getContext().getUsers().stream().filter(dbUserEntity -> dbUserEntity.getId() == entity.getId()).findAny().orElse(entity));
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().removeIf(dbUserEntity -> dbUserEntity.getId() == entity.getId());
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().add(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return secondOrm.getContext().getUserInfos().stream().filter(dbUserEntity -> dbUserEntity.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().add(secondOrm.getContext().getUserInfos().stream().filter(dbUserEntity -> dbUserEntity.getId() == entity.getId()).findAny().orElse(entity));
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().removeIf(dbUserEntity -> dbUserEntity.getId() == entity.getId());
    }
}
