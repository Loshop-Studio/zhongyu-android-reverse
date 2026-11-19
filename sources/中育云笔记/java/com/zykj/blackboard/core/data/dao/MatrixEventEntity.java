package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class MatrixEventEntity {
    transient BoxStore __boxStore;

    /* renamed from: id */
    private long f18281id;
    public ToMany<MatrixInfoEntity> matrixInfo;
    public ToOne<MatrixRecordEntity> record;

    public MatrixEventEntity() {
        this(0L, 1, null);
    }

    /* renamed from: a */
    public final long m14179a() {
        return this.f18281id;
    }

    /* renamed from: b */
    public final ToMany m14180b() {
        ToMany<MatrixInfoEntity> toMany = this.matrixInfo;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("matrixInfo");
        return null;
    }

    /* renamed from: c */
    public final ToOne m14181c() {
        ToOne<MatrixRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: d */
    public final void m14182d() {
        C10341d.f24644a.m21626f().m18954g(MatrixEventEntity.class).m19227m(this);
    }

    /* renamed from: e */
    public final void m14183e(long j10) {
        this.f18281id = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatrixEventEntity) && this.f18281id == ((MatrixEventEntity) obj).f18281id;
    }

    public int hashCode() {
        return Long.hashCode(this.f18281id);
    }

    public String toString() {
        return "MatrixEventEntity(id=" + this.f18281id + ')';
    }

    public MatrixEventEntity(long j10) {
        this.matrixInfo = new ToMany<>(this, MatrixEventEntity_.f18293l);
        this.record = new ToOne<>(this, MatrixEventEntity_.f18292k);
        this.f18281id = j10;
    }

    public /* synthetic */ MatrixEventEntity(long j10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10);
    }
}
