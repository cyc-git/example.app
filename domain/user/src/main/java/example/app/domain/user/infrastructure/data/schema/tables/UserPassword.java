/*
 * This file is generated by jOOQ.
 */
package example.app.domain.user.infrastructure.data.schema.tables;


import example.app.domain.user.infrastructure.data.schema.Keys;
import example.app.domain.user.infrastructure.data.schema.Test;
import example.app.domain.user.infrastructure.data.schema.tables.records.UserPasswordRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPassword extends TableImpl<UserPasswordRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>test.user_password</code>
     */
    public static final UserPassword USER_PASSWORD = new UserPassword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPasswordRecord> getRecordType() {
        return UserPasswordRecord.class;
    }

    /**
     * The column <code>test.user_password.user_id</code>.
     */
    public final TableField<UserPasswordRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>test.user_password.password</code>.
     */
    public final TableField<UserPasswordRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    private UserPassword(Name alias, Table<UserPasswordRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserPassword(Name alias, Table<UserPasswordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>test.user_password</code> table reference
     */
    public UserPassword(String alias) {
        this(DSL.name(alias), USER_PASSWORD);
    }

    /**
     * Create an aliased <code>test.user_password</code> table reference
     */
    public UserPassword(Name alias) {
        this(alias, USER_PASSWORD);
    }

    /**
     * Create a <code>test.user_password</code> table reference
     */
    public UserPassword() {
        this(DSL.name("user_password"), null);
    }

    public <O extends Record> UserPassword(Table<O> child, ForeignKey<O, UserPasswordRecord> key) {
        super(child, key, USER_PASSWORD);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public UniqueKey<UserPasswordRecord> getPrimaryKey() {
        return Keys.KEY_USER_PASSWORD_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserPasswordRecord>> getKeys() {
        return Arrays.<UniqueKey<UserPasswordRecord>>asList(Keys.KEY_USER_PASSWORD_PRIMARY);
    }

    @Override
    public List<ForeignKey<UserPasswordRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserPasswordRecord, ?>>asList(Keys.USER_PASSWORD_FK);
    }

    private transient User _user;

    public User user() {
        if (_user == null)
            _user = new User(this, Keys.USER_PASSWORD_FK);

        return _user;
    }

    @Override
    public UserPassword as(String alias) {
        return new UserPassword(DSL.name(alias), this);
    }

    @Override
    public UserPassword as(Name alias) {
        return new UserPassword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPassword rename(String name) {
        return new UserPassword(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPassword rename(Name name) {
        return new UserPassword(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}