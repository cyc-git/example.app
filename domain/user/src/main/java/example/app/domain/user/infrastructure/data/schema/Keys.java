/*
 * This file is generated by jOOQ.
 */
package example.app.domain.user.infrastructure.data.schema;


import example.app.domain.user.infrastructure.data.schema.tables.User;
import example.app.domain.user.infrastructure.data.schema.tables.UserPassword;
import example.app.domain.user.infrastructure.data.schema.tables.records.UserPasswordRecord;
import example.app.domain.user.infrastructure.data.schema.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * test.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_USER_UN = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_user_un"), new TableField[] { User.USER.ACCOUNT }, true);
    public static final UniqueKey<UserPasswordRecord> KEY_USER_PASSWORD_PRIMARY = Internal.createUniqueKey(UserPassword.USER_PASSWORD, DSL.name("KEY_user_password_PRIMARY"), new TableField[] { UserPassword.USER_PASSWORD.USER_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<UserPasswordRecord, UserRecord> USER_PASSWORD_FK = Internal.createForeignKey(UserPassword.USER_PASSWORD, DSL.name("user_password_FK"), new TableField[] { UserPassword.USER_PASSWORD.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
}
