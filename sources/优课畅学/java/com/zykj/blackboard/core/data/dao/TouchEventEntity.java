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
public final class TouchEventEntity {
    transient BoxStore __boxStore;
    private int color;

    /* renamed from: id */
    private long f8754id;
    private float itemLength;
    public ToOne<TouchRecordEntity> record;
    private float spacing;
    private int style;
    private float textSize;
    public ToMany<TouchInfoEntity> touchInfoList;
    private float width;

    public TouchEventEntity() {
        this(0L, 0.0f, 0, 0.0f, 0.0f, 0, 0.0f, 127, null);
    }

    public static /* synthetic */ TouchEventEntity copy$default(TouchEventEntity touchEventEntity, long j10, float f10, int i10, float f11, float f12, int i11, float f13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = touchEventEntity.f8754id;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            f10 = touchEventEntity.width;
        }
        float f14 = f10;
        if ((i12 & 4) != 0) {
            i10 = touchEventEntity.color;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            f11 = touchEventEntity.spacing;
        }
        float f15 = f11;
        if ((i12 & 16) != 0) {
            f12 = touchEventEntity.itemLength;
        }
        return touchEventEntity.copy(j11, f14, i13, f15, f12, (i12 & 32) != 0 ? touchEventEntity.style : i11, (i12 & 64) != 0 ? touchEventEntity.textSize : f13);
    }

    public final long component1() {
        return this.f8754id;
    }

    public final float component2() {
        return this.width;
    }

    public final int component3() {
        return this.color;
    }

    public final float component4() {
        return this.spacing;
    }

    public final float component5() {
        return this.itemLength;
    }

    public final int component6() {
        return this.style;
    }

    public final float component7() {
        return this.textSize;
    }

    public final TouchEventEntity copy(long j10, float f10, int i10, float f11, float f12, int i11, float f13) {
        return new TouchEventEntity(j10, f10, i10, f11, f12, i11, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEventEntity)) {
            return false;
        }
        TouchEventEntity touchEventEntity = (TouchEventEntity) obj;
        return this.f8754id == touchEventEntity.f8754id && AbstractC9133u.m16128b(Float.valueOf(this.width), Float.valueOf(touchEventEntity.width)) && this.color == touchEventEntity.color && AbstractC9133u.m16128b(Float.valueOf(this.spacing), Float.valueOf(touchEventEntity.spacing)) && AbstractC9133u.m16128b(Float.valueOf(this.itemLength), Float.valueOf(touchEventEntity.itemLength)) && this.style == touchEventEntity.style && AbstractC9133u.m16128b(Float.valueOf(this.textSize), Float.valueOf(touchEventEntity.textSize));
    }

    public final int getColor() {
        return this.color;
    }

    public final long getId() {
        return this.f8754id;
    }

    public final float getItemLength() {
        return this.itemLength;
    }

    public final ToOne<TouchRecordEntity> getRecord() {
        ToOne<TouchRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getStyle() {
        return this.style;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final ToMany<TouchInfoEntity> getTouchInfoList() {
        ToMany<TouchInfoEntity> toMany = this.touchInfoList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("touchInfoList");
        return null;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f8754id) * 31) + Float.hashCode(this.width)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.spacing)) * 31) + Float.hashCode(this.itemLength)) * 31) + Integer.hashCode(this.style)) * 31) + Float.hashCode(this.textSize);
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchEventEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchEventEntity.class).m15422t(this);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setId(long j10) {
        this.f8754id = j10;
    }

    public final void setItemLength(float f10) {
        this.itemLength = f10;
    }

    public final void setRecord(ToOne<TouchRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setSpacing(float f10) {
        this.spacing = f10;
    }

    public final void setStyle(int i10) {
        this.style = i10;
    }

    public final void setTextSize(float f10) {
        this.textSize = f10;
    }

    public final void setTouchInfoList(ToMany<TouchInfoEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.touchInfoList = toMany;
    }

    public final void setWidth(float f10) {
        this.width = f10;
    }

    public String toString() {
        return "TouchEventEntity(id=" + this.f8754id + ", width=" + this.width + ", color=" + this.color + ", spacing=" + this.spacing + ", itemLength=" + this.itemLength + ", style=" + this.style + ", textSize=" + this.textSize + ')';
    }

    public TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13) {
        this.touchInfoList = new ToMany<>(this, TouchEventEntity_.touchInfoList);
        this.record = new ToOne<>(this, TouchEventEntity_.record);
        this.f8754id = j10;
        this.width = f10;
        this.color = i10;
        this.spacing = f11;
        this.itemLength = f12;
        this.style = i11;
        this.textSize = f13;
    }

    public /* synthetic */ TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0.0f : f11, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? 0.0f : f13);
    }
}
