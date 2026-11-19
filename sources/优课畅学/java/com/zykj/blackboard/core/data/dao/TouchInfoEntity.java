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
public final class TouchInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    /* renamed from: id */
    private long f8756id;
    public ToOne<TouchEventEntity> record;

    /* renamed from: x */
    private float f8757x;

    /* renamed from: y */
    private float f8758y;

    public TouchInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ TouchInfoEntity copy$default(TouchInfoEntity touchInfoEntity, long j10, long j11, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = touchInfoEntity.f8756id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = touchInfoEntity.eventTime;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = touchInfoEntity.f8757x;
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            f11 = touchInfoEntity.f8758y;
        }
        return touchInfoEntity.copy(j12, j13, f12, f11);
    }

    public final long component1() {
        return this.f8756id;
    }

    public final long component2() {
        return this.eventTime;
    }

    public final float component3() {
        return this.f8757x;
    }

    public final float component4() {
        return this.f8758y;
    }

    public final TouchInfoEntity copy(long j10, long j11, float f10, float f11) {
        return new TouchInfoEntity(j10, j11, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchInfoEntity)) {
            return false;
        }
        TouchInfoEntity touchInfoEntity = (TouchInfoEntity) obj;
        return this.f8756id == touchInfoEntity.f8756id && this.eventTime == touchInfoEntity.eventTime && AbstractC9133u.m16128b(Float.valueOf(this.f8757x), Float.valueOf(touchInfoEntity.f8757x)) && AbstractC9133u.m16128b(Float.valueOf(this.f8758y), Float.valueOf(touchInfoEntity.f8758y));
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final long getId() {
        return this.f8756id;
    }

    public final ToOne<TouchEventEntity> getRecord() {
        ToOne<TouchEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final float getX() {
        return this.f8757x;
    }

    public final float getY() {
        return this.f8758y;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f8756id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.f8757x)) * 31) + Float.hashCode(this.f8758y);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchInfoEntity.class).m15422t(this);
    }

    public final void setEventTime(long j10) {
        this.eventTime = j10;
    }

    public final void setId(long j10) {
        this.f8756id = j10;
    }

    public final void setRecord(ToOne<TouchEventEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setX(float f10) {
        this.f8757x = f10;
    }

    public final void setY(float f10) {
        this.f8758y = f10;
    }

    public String toString() {
        return "TouchInfoEntity(id=" + this.f8756id + ", eventTime=" + this.eventTime + ", x=" + this.f8757x + ", y=" + this.f8758y + ')';
    }

    public TouchInfoEntity(long j10, long j11, float f10, float f11) {
        this.record = new ToOne<>(this, TouchInfoEntity_.record);
        this.f8756id = j10;
        this.eventTime = j11;
        this.f8757x = f10;
        this.f8758y = f11;
    }

    public /* synthetic */ TouchInfoEntity(long j10, long j11, float f10, float f11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }
}
