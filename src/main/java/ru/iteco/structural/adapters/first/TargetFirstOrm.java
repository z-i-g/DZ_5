package ru.iteco.structural.adapters.first;

import ru.iteco.structural.DbUserEntity;
import ru.iteco.structural.DbUserInfoEntity;

/**
 * Target.
 *
 * @author Ilya_Sukhachev
 */
public interface TargetFirstOrm {

    void createUser(DbUserEntity entity);

    DbUserEntity readUser(Long id);

    void updateUser(DbUserEntity entity);

    void deleteUser(DbUserEntity entity);

    void createUserInfo(DbUserInfoEntity entity);

    DbUserInfoEntity readUserInfo(Long id);

    void updateUserInfo(DbUserInfoEntity entity);

    void deleteUserInfo(DbUserInfoEntity entity);
}
