package ru.iteco.structural.orm.second;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();
    Set<DbUserInfoEntity> getUserInfos();

}
