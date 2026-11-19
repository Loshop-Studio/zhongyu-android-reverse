package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "", "", "id", "<init>", "(J)V", "", "d", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "a", "()J", "e", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "c", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "Lio/objectbox/relation/ToMany;", "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;", "matrixInfo", "Lio/objectbox/relation/ToMany;", "b", "()Lio/objectbox/relation/ToMany;", "setMatrixInfo", "(Lio/objectbox/relation/ToMany;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class MatrixEventEntity {
    transient BoxStore __boxStore;
    private long id;
    public ToMany<MatrixInfoEntity> matrixInfo;
    public ToOne<MatrixRecordEntity> record;

    public MatrixEventEntity() {
        this(0L, 1, null);
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: b */
    public final ToMany m7553b() {
        ToMany<MatrixInfoEntity> toMany = this.matrixInfo;
        if (toMany != null) {
            return toMany;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matrixInfo");
        return null;
    }

    /* renamed from: c */
    public final ToOne m7554c() {
        ToOne<MatrixRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: d */
    public final void m7555d() {
        C9685d.f17121a.m16165f().m13101h(MatrixEventEntity.class).m2255l(this);
    }

    /* renamed from: e */
    public final void m7556e(long j9) {
        this.id = j9;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatrixEventEntity) && this.id == ((MatrixEventEntity) other).id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    public String toString() {
        return "MatrixEventEntity(id=" + this.id + ')';
    }

    public MatrixEventEntity(long j9) {
        this.matrixInfo = new ToMany<>(this, MatrixEventEntity_.f8732j);
        this.record = new ToOne<>(this, MatrixEventEntity_.f8731i);
        this.id = j9;
    }

    public /* synthetic */ MatrixEventEntity(long j9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j9);
    }
}
