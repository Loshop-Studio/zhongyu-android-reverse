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
public final class MatrixRecordEntity {
    transient BoxStore __boxStore;
    private String fileName;

    /* renamed from: id */
    private long f8742id;
    public ToMany<MatrixEventEntity> matrixEventEntity;
    public ToOne<RecordEntity> record;
    private String validate;

    public MatrixRecordEntity() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ MatrixRecordEntity copy$default(MatrixRecordEntity matrixRecordEntity, long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = matrixRecordEntity.f8742id;
        }
        if ((i10 & 2) != 0) {
            str = matrixRecordEntity.fileName;
        }
        if ((i10 & 4) != 0) {
            str2 = matrixRecordEntity.validate;
        }
        return matrixRecordEntity.copy(j10, str, str2);
    }

    public final long component1() {
        return this.f8742id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.validate;
    }

    public final MatrixRecordEntity copy(long j10, String fileName, String validate) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        return new MatrixRecordEntity(j10, fileName, validate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatrixRecordEntity)) {
            return false;
        }
        MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) obj;
        return this.f8742id == matrixRecordEntity.f8742id && AbstractC9133u.m16128b(this.fileName, matrixRecordEntity.fileName) && AbstractC9133u.m16128b(this.validate, matrixRecordEntity.validate);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getId() {
        return this.f8742id;
    }

    public final ToMany<MatrixEventEntity> getMatrixEventEntity() {
        ToMany<MatrixEventEntity> toMany = this.matrixEventEntity;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("matrixEventEntity");
        return null;
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

    public int hashCode() {
        return (((Long.hashCode(this.f8742id) * 31) + this.fileName.hashCode()) * 31) + this.validate.hashCode();
    }

    public final void put() {
        C8957a box = BoardBox.INSTANCE.getBoxStore().m15370d(MatrixRecordEntity.class);
        try {
            box.m15414l(this);
        } catch (UniqueViolationException unused) {
            AbstractC9133u.m16132f(box, "box");
            QueryBuilder builder = box.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(MatrixRecordEntity_.fileName, this.fileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "box.query {\n            …ame)\n            }.find()");
            box.m15420r(listM15478j);
            box.m15414l(this);
        }
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixRecordEntity.class).m15422t(this);
    }

    public final void setFileName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.fileName = str;
    }

    public final void setId(long j10) {
        this.f8742id = j10;
    }

    public final void setMatrixEventEntity(ToMany<MatrixEventEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.matrixEventEntity = toMany;
    }

    public final void setRecord(ToOne<RecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setValidate(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.validate = str;
    }

    public String toString() {
        return "MatrixRecordEntity(id=" + this.f8742id + ", fileName=" + this.fileName + ", validate=" + this.validate + ')';
    }

    public MatrixRecordEntity(long j10, String fileName, String validate) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        this.matrixEventEntity = new ToMany<>(this, MatrixRecordEntity_.matrixEventEntity);
        this.record = new ToOne<>(this, MatrixRecordEntity_.record);
        this.f8742id = j10;
        this.fileName = fileName;
        this.validate = validate;
    }

    public /* synthetic */ MatrixRecordEntity(long j10, String str, String str2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
