package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.annotation.Entity;
import io.objectbox.exception.UniqueViolationException;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class GeometryRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;
    public ToMany<GeometryInfoEntity> geometryInfoEntityList;

    /* renamed from: id */
    private long f8734id;
    public ToOne<RecordEntity> record;
    private String validate;

    public GeometryRecordEntity() {
        this(0L, null, null, 7, null);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final ToMany<GeometryInfoEntity> getGeometryInfoEntityList() {
        ToMany<GeometryInfoEntity> toMany = this.geometryInfoEntityList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("geometryInfoEntityList");
        return null;
    }

    public final long getId() {
        return this.f8734id;
    }

    public final ToOne<RecordEntity> getRecord() {
        ToOne<RecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final String getValidate() {
        return this.validate;
    }

    public final void put() {
        C8957a box = BoardBox.INSTANCE.getBoxStore().m15370d(GeometryRecordEntity.class);
        try {
            box.m15414l(this);
        } catch (UniqueViolationException unused) {
            AbstractC9133u.m16132f(box, "box");
            QueryBuilder builder = box.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(GeometryRecordEntity_.fileName, this.fileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "box.query {\n            …ame)\n            }.find()");
            box.m15420r(listM15478j);
            box.m15414l(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryRecordEntity.class).m15422t(this);
    }

    public final void setFileName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setGeometryInfoEntityList(ToMany<GeometryInfoEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.geometryInfoEntityList = toMany;
    }

    public final void setId(long j10) {
        this.f8734id = j10;
    }

    public final void setRecord(ToOne<RecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setValidate(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.validate = str;
    }

    public GeometryRecordEntity(long j10, String fileName, String validate) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        this.geometryInfoEntityList = new ToMany<>(this, GeometryRecordEntity_.geometryInfoEntityList);
        this.record = new ToOne<>(this, GeometryRecordEntity_.record);
        this.f8734id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ GeometryRecordEntity(long j10, String str, String str2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
