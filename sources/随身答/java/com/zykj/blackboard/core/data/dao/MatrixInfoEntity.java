package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b2\u0010'\"\u0004\b3\u0010)R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010%\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;", "", "", "id", "eventTime", "", "scaleX", "skewX", "transX", "skewY", "scaleY", "transY", "perSp0", "perSp1", "perSp2", "<init>", "(JJFFFFFFFFF)V", "", "m", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "n", "(J)V", "a", "setEventTime", "F", "g", "()F", "setScaleX", "(F)V", "i", "setSkewX", "k", "setTransX", "j", "setSkewY", "h", "setScaleY", "l", "setTransY", "c", "setPerSp0", "d", "setPerSp1", "e", "setPerSp2", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "record", "Lio/objectbox/relation/ToOne;", "f", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class MatrixInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;
    private long id;
    private float perSp0;
    private float perSp1;
    private float perSp2;
    public ToOne<MatrixEventEntity> record;
    private float scaleX;
    private float scaleY;
    private float skewX;
    private float skewY;
    private float transX;
    private float transY;

    public MatrixInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    /* renamed from: a, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final float getPerSp0() {
        return this.perSp0;
    }

    /* renamed from: d, reason: from getter */
    public final float getPerSp1() {
        return this.perSp1;
    }

    /* renamed from: e, reason: from getter */
    public final float getPerSp2() {
        return this.perSp2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatrixInfoEntity)) {
            return false;
        }
        MatrixInfoEntity matrixInfoEntity = (MatrixInfoEntity) other;
        return this.id == matrixInfoEntity.id && this.eventTime == matrixInfoEntity.eventTime && Intrinsics.areEqual((Object) Float.valueOf(this.scaleX), (Object) Float.valueOf(matrixInfoEntity.scaleX)) && Intrinsics.areEqual((Object) Float.valueOf(this.skewX), (Object) Float.valueOf(matrixInfoEntity.skewX)) && Intrinsics.areEqual((Object) Float.valueOf(this.transX), (Object) Float.valueOf(matrixInfoEntity.transX)) && Intrinsics.areEqual((Object) Float.valueOf(this.skewY), (Object) Float.valueOf(matrixInfoEntity.skewY)) && Intrinsics.areEqual((Object) Float.valueOf(this.scaleY), (Object) Float.valueOf(matrixInfoEntity.scaleY)) && Intrinsics.areEqual((Object) Float.valueOf(this.transY), (Object) Float.valueOf(matrixInfoEntity.transY)) && Intrinsics.areEqual((Object) Float.valueOf(this.perSp0), (Object) Float.valueOf(matrixInfoEntity.perSp0)) && Intrinsics.areEqual((Object) Float.valueOf(this.perSp1), (Object) Float.valueOf(matrixInfoEntity.perSp1)) && Intrinsics.areEqual((Object) Float.valueOf(this.perSp2), (Object) Float.valueOf(matrixInfoEntity.perSp2));
    }

    /* renamed from: f */
    public final ToOne m7568f() {
        ToOne<MatrixEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: h, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.skewX)) * 31) + Float.hashCode(this.transX)) * 31) + Float.hashCode(this.skewY)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.transY)) * 31) + Float.hashCode(this.perSp0)) * 31) + Float.hashCode(this.perSp1)) * 31) + Float.hashCode(this.perSp2);
    }

    /* renamed from: i, reason: from getter */
    public final float getSkewX() {
        return this.skewX;
    }

    /* renamed from: j, reason: from getter */
    public final float getSkewY() {
        return this.skewY;
    }

    /* renamed from: k, reason: from getter */
    public final float getTransX() {
        return this.transX;
    }

    /* renamed from: l, reason: from getter */
    public final float getTransY() {
        return this.transY;
    }

    /* renamed from: m */
    public final void m7575m() {
        C9685d.f17121a.m16165f().m13101h(MatrixInfoEntity.class).m2255l(this);
    }

    /* renamed from: n */
    public final void m7576n(long j9) {
        this.id = j9;
    }

    public String toString() {
        return "MatrixInfoEntity(id=" + this.id + ", eventTime=" + this.eventTime + ", scaleX=" + this.scaleX + ", skewX=" + this.skewX + ", transX=" + this.transX + ", skewY=" + this.skewY + ", scaleY=" + this.scaleY + ", transY=" + this.transY + ", perSp0=" + this.perSp0 + ", perSp1=" + this.perSp1 + ", perSp2=" + this.perSp2 + ')';
    }

    public MatrixInfoEntity(long j9, long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.record = new ToOne<>(this, MatrixInfoEntity_.f8764s);
        this.id = j9;
        this.eventTime = j10;
        this.scaleX = f10;
        this.skewX = f11;
        this.transX = f12;
        this.skewY = f13;
        this.scaleY = f14;
        this.transY = f15;
        this.perSp0 = f16;
        this.perSp1 = f17;
        this.perSp2 = f18;
    }

    public /* synthetic */ MatrixInfoEntity(long j9, long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j9, (i9 & 2) == 0 ? j10 : 0L, (i9 & 4) != 0 ? 0.0f : f10, (i9 & 8) != 0 ? 0.0f : f11, (i9 & 16) != 0 ? 0.0f : f12, (i9 & 32) != 0 ? 0.0f : f13, (i9 & 64) != 0 ? 0.0f : f14, (i9 & 128) != 0 ? 0.0f : f15, (i9 & 256) != 0 ? 0.0f : f16, (i9 & 512) != 0 ? 0.0f : f17, (i9 & 1024) != 0 ? 0.0f : f18);
    }
}
