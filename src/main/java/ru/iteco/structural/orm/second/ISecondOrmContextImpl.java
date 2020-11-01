package ru.iteco.structural.orm.second;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;

import java.util.HashSet;
import java.util.Set;

public class ISecondOrmContextImpl implements ISecondOrmContext{

    private Set<DbUserEntity> userEntities = new HashSet<>();
    private Set<DbUserInfoEntity> userInfoEntities = new HashSet<>();

    @Override
    public Set<DbUserEntity> getUsers() {
        return userEntities;
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfos() {
        return userInfoEntities;
    }
}
