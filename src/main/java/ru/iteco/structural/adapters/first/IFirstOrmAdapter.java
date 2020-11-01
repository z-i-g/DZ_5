package ru.iteco.structural.adapters.first;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;
import ru.iteco.structural.adapters.Target;
import ru.iteco.structural.orm.first.IFirstOrm;

public class IFirstOrmAdapter implements Target {

    private IFirstOrm iFirstOrm;

    public IFirstOrmAdapter(IFirstOrm iFirstOrm) {
        this.iFirstOrm = iFirstOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        iFirstOrm.create(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return iFirstOrm.read(id.intValue()) instanceof DbUserEntity ? (DbUserEntity)iFirstOrm.read(id.intValue()) : null;
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        iFirstOrm.update(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        iFirstOrm.delete(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.create(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return iFirstOrm.read(id.intValue()) instanceof DbUserInfoEntity ? (DbUserInfoEntity)iFirstOrm.read(id.intValue()) : null;
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.update(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        iFirstOrm.delete(entity);
    }
}
