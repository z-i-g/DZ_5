package ru.iteco.structural.orm.first;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;
import ru.iteco.structural.IDbEntity;
import ru.iteco.structural.adapters.first.OrmAdapter;

public class FirstOrm implements IFirstOrm {

    OrmAdapter ormAdapter;

    public FirstOrm(OrmAdapter ormAdapter) {
        this.ormAdapter = ormAdapter;
    }

    @Override
    public void create(IDbEntity entity) {
        if (entity instanceof DbUserEntity) {
            ormAdapter.createUser((DbUserEntity)entity);
        }
        ormAdapter.createUserInfo((DbUserInfoEntity)entity);
    }

    @Override
    public IDbEntity read(int id) {
        return ormAdapter.readUser((long) id) != null ? ormAdapter.readUser((long) id) : ormAdapter.readUserInfo((long) id);
    }

    @Override
    public void update(IDbEntity entity) {
        if (entity instanceof DbUserEntity) {
            ormAdapter.updateUser((DbUserEntity)entity);
        }
        ormAdapter.updateUserInfo((DbUserInfoEntity)entity);
    }

    @Override
    public void delete(IDbEntity entity) {
        if (entity instanceof DbUserEntity) {
            ormAdapter.deleteUser((DbUserEntity)entity);
        }
        ormAdapter.deleteUserInfo((DbUserInfoEntity)entity);
    }
}
