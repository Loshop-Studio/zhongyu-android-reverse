package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class MatrixEventEntity {
    transient BoxStore __boxStore;

    /* renamed from: id */
    private long f8738id;
    public ToMany<MatrixInfoEntity> matrixInfo;
    public ToOne<MatrixRecordEntity> record;

    public MatrixEventEntity() {
        this(0L, 1, null);
    }

    public static /* synthetic */ MatrixEventEntity copy$default(MatrixEventEntity matrixEventEntity, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = matrixEventEntity.f8738id;
        }
        return matrixEventEntity.copy(j10);
    }

    public final long component1() {
        return this.f8738id;
    }

    public final MatrixEventEntity copy(long j10) {
        return new MatrixEventEntity(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatrixEventEntity) && this.f8738id == ((MatrixEventEntity) obj).f8738id;
    }

    public final long getId() {
        return this.f8738id;
    }

    public final ToMany<MatrixInfoEntity> getMatrixInfo() {
        ToMany<MatrixInfoEntity> toMany = this.matrixInfo;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("matrixInfo");
        return null;
    }

    public final ToOne<MatrixRecordEntity> getRecord() {
        ToOne<MatrixRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public int hashCode() {
        return Long.hashCode(this.f8738id);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixEventEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixEventEntity.class).m15422t(this);
    }

    public final void setId(long j10) {
        this.f8738id = j10;
    }

    public final void setMatrixInfo(ToMany<MatrixInfoEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.matrixInfo = toMany;
    }

    public final void setRecord(ToOne<MatrixRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public String toString() {
        return "MatrixEventEntity(id=" + this.f8738id + ')';
    }

    public MatrixEventEntity(long j10) {
        this.matrixInfo = new ToMany<>(this, MatrixEventEntity_.matrixInfo);
        this.record = new ToOne<>(this, MatrixEventEntity_.record);
        this.f8738id = j10;
    }

    public /* synthetic */ MatrixEventEntity(long j10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10);
    }
}
