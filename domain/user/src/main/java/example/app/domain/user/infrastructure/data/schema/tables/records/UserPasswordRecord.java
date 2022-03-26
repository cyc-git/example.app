/*
 * This file is generated by jOOQ.
 */
package example.app.domain.user.infrastructure.data.schema.tables.records;


import example.app.domain.user.infrastructure.data.schema.tables.UserPassword;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPasswordRecord extends UpdatableRecordImpl<UserPasswordRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>test.user_password.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.user_password.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>test.user_password.password</code>.
     */
    public void setPassword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.user_password.password</code>.
     */
    public String getPassword() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserPassword.USER_PASSWORD.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return UserPassword.USER_PASSWORD.PASSWORD;
    }

    @Override
    public Long component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getPassword();
    }

    @Override
    public Long value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getPassword();
    }

    @Override
    public UserPasswordRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserPasswordRecord value2(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserPasswordRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPasswordRecord
     */
    public UserPasswordRecord() {
        super(UserPassword.USER_PASSWORD);
    }

    /**
     * Create a detached, initialised UserPasswordRecord
     */
    public UserPasswordRecord(Long userId, String password) {
        super(UserPassword.USER_PASSWORD);

        setUserId(userId);
        setPassword(password);
    }
}