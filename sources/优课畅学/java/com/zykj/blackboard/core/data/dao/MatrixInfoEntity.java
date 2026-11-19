package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class MatrixInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    /* renamed from: id */
    private long f8740id;
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

    public final long component1() {
        return this.f8740id;
    }

    public final float component10() {
        return this.perSp1;
    }

    public final float component11() {
        return this.perSp2;
    }

    public final long component2() {
        return this.eventTime;
    }

    public final float component3() {
        return this.scaleX;
    }

    public final float component4() {
        return this.skewX;
    }

    public final float component5() {
        return this.transX;
    }

    public final float component6() {
        return this.skewY;
    }

    public final float component7() {
        return this.scaleY;
    }

    public final float component8() {
        return this.transY;
    }

    public final float component9() {
        return this.perSp0;
    }

    public final MatrixInfoEntity copy(long j10, long j11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return new MatrixInfoEntity(j10, j11, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatrixInfoEntity)) {
            return false;
        }
        MatrixInfoEntity matrixInfoEntity = (MatrixInfoEntity) obj;
        return this.f8740id == matrixInfoEntity.f8740id && this.eventTime == matrixInfoEntity.eventTime && AbstractC9133u.m16128b(Float.valueOf(this.scaleX), Float.valueOf(matrixInfoEntity.scaleX)) && AbstractC9133u.m16128b(Float.valueOf(this.skewX), Float.valueOf(matrixInfoEntity.skewX)) && AbstractC9133u.m16128b(Float.valueOf(this.transX), Float.valueOf(matrixInfoEntity.transX)) && AbstractC9133u.m16128b(Float.valueOf(this.skewY), Float.valueOf(matrixInfoEntity.skewY)) && AbstractC9133u.m16128b(Float.valueOf(this.scaleY), Float.valueOf(matrixInfoEntity.scaleY)) && AbstractC9133u.m16128b(Float.valueOf(this.transY), Float.valueOf(matrixInfoEntity.transY)) && AbstractC9133u.m16128b(Float.valueOf(this.perSp0), Float.valueOf(matrixInfoEntity.perSp0)) && AbstractC9133u.m16128b(Float.valueOf(this.perSp1), Float.valueOf(matrixInfoEntity.perSp1)) && AbstractC9133u.m16128b(Float.valueOf(this.perSp2), Float.valueOf(matrixInfoEntity.perSp2));
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final long getId() {
        return this.f8740id;
    }

    public final float getPerSp0() {
        return this.perSp0;
    }

    public final float getPerSp1() {
        return this.perSp1;
    }

    public final float getPerSp2() {
        return this.perSp2;
    }

    public final ToOne<MatrixEventEntity> getRecord() {
        ToOne<MatrixEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public final float getSkewY() {
        return this.skewY;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.f8740id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.skewX)) * 31) + Float.hashCode(this.transX)) * 31) + Float.hashCode(this.skewY)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.transY)) * 31) + Float.hashCode(this.perSp0)) * 31) + Float.hashCode(this.perSp1)) * 31) + Float.hashCode(this.perSp2);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixInfoEntity.class).m15422t(this);
    }

    public final void setEventTime(long j10) {
        this.eventTime = j10;
    }

    public final void setId(long j10) {
        this.f8740id = j10;
    }

    public final void setPerSp0(float f10) {
        this.perSp0 = f10;
    }

    public final void setPerSp1(float f10) {
        this.perSp1 = f10;
    }

    public final void setPerSp2(float f10) {
        this.perSp2 = f10;
    }

    public final void setRecord(ToOne<MatrixEventEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setScaleX(float f10) {
        this.scaleX = f10;
    }

    public final void setScaleY(float f10) {
        this.scaleY = f10;
    }

    public final void setSkewX(float f10) {
        this.skewX = f10;
    }

    public final void setSkewY(float f10) {
        this.skewY = f10;
    }

    public final void setTransX(float f10) {
        this.transX = f10;
    }

    public final void setTransY(float f10) {
        this.transY = f10;
    }

    public String toString() {
        return "MatrixInfoEntity(id=" + this.f8740id + ", eventTime=" + this.eventTime + ", scaleX=" + this.scaleX + ", skewX=" + this.skewX + ", transX=" + this.transX + ", skewY=" + this.skewY + ", scaleY=" + this.scaleY + ", transY=" + this.transY + ", perSp0=" + this.perSp0 + ", perSp1=" + this.perSp1 + ", perSp2=" + this.perSp2 + ')';
    }

    public MatrixInfoEntity(long j10, long j11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.record = new ToOne<>(this, MatrixInfoEntity_.record);
        this.f8740id = j10;
        this.eventTime = j11;
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

    public /* synthetic */ MatrixInfoEntity(long j10, long j11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) == 0 ? j11 : 0L, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11, (i10 & 16) != 0 ? 0.0f : f12, (i10 & 32) != 0 ? 0.0f : f13, (i10 & 64) != 0 ? 0.0f : f14, (i10 & 128) != 0 ? 0.0f : f15, (i10 & 256) != 0 ? 0.0f : f16, (i10 & 512) != 0 ? 0.0f : f17, (i10 & 1024) != 0 ? 0.0f : f18);
    }
}
