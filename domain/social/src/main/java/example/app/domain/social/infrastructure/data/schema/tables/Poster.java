/*
 * This file is generated by jOOQ.
 */
package example.app.domain.social.infrastructure.data.schema.tables;


import example.app.domain.social.infrastructure.data.schema.Keys;
import example.app.domain.social.infrastructure.data.schema.Test;
import example.app.domain.social.infrastructure.data.schema.tables.records.PosterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Poster extends TableImpl<PosterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>test.poster</code>
     */
    public static final Poster POSTER = new Poster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PosterRecord> getRecordType() {
        return PosterRecord.class;
    }

    /**
     * The column <code>test.poster.id</code>. id
     */
    public final TableField<PosterRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "id");

    /**
     * The column <code>test.poster.name</code>. poster name
     */
    public final TableField<PosterRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "poster name");

    /**
     * The column <code>test.poster.account</code>. poster account
     */
    public final TableField<PosterRecord, String> ACCOUNT = createField(DSL.name("account"), SQLDataType.VARCHAR(255).nullable(false), this, "poster account");

    /**
     * The column <code>test.poster.deleted_at</code>. the time when the poster was deleted, may be null, means the poster not been deleted yet.
     */
    public final TableField<PosterRecord, Long> DELETED_AT = createField(DSL.name("deleted_at"), SQLDataType.BIGINT, this, "the time when the poster was deleted, may be null, means the poster not been deleted yet.");

    private Poster(Name alias, Table<PosterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Poster(Name alias, Table<PosterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>test.poster</code> table reference
     */
    public Poster(String alias) {
        this(DSL.name(alias), POSTER);
    }

    /**
     * Create an aliased <code>test.poster</code> table reference
     */
    public Poster(Name alias) {
        this(alias, POSTER);
    }

    /**
     * Create a <code>test.poster</code> table reference
     */
    public Poster() {
        this(DSL.name("poster"), null);
    }

    public <O extends Record> Poster(Table<O> child, ForeignKey<O, PosterRecord> key) {
        super(child, key, POSTER);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public UniqueKey<PosterRecord> getPrimaryKey() {
        return Keys.KEY_POSTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<PosterRecord>> getKeys() {
        return Arrays.<UniqueKey<PosterRecord>>asList(Keys.KEY_POSTER_PRIMARY, Keys.KEY_POSTER_POSTER_UN);
    }

    @Override
    public Poster as(String alias) {
        return new Poster(DSL.name(alias), this);
    }

    @Override
    public Poster as(Name alias) {
        return new Poster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Poster rename(String name) {
        return new Poster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Poster rename(Name name) {
        return new Poster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
