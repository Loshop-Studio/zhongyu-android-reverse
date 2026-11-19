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
public final class GeometryInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private int geometryType;

    /* renamed from: id */
    private long f8726id;
    public ToMany<GeometryPointFEntity> pointList;
    public ToOne<GeometryRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public GeometryInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, 0, 63, null);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getGeometryType() {
        return this.geometryType;
    }

    public final long getId() {
        return this.f8726id;
    }

    public final ToMany<GeometryPointFEntity> getPointList() {
        ToMany<GeometryPointFEntity> toMany = this.pointList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9133u.m16151y("pointList");
        return null;
    }

    public final ToOne<GeometryRecordEntity> getRecord() {
        ToOne<GeometryRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final int getStyle() {
        return this.style;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryInfoEntity.class).m15422t(this);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setGeometryType(int i10) {
        this.geometryType = i10;
    }

    public final void setId(long j10) {
        this.f8726id = j10;
    }

    public final void setPointList(ToMany<GeometryPointFEntity> toMany) {
        AbstractC9133u.m16133g(toMany, "<set-?>");
        this.pointList = toMany;
    }

    public final void setRecord(ToOne<GeometryRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setStyle(int i10) {
        this.style = i10;
    }

    public final void setTextSize(float f10) {
        this.textSize = f10;
    }

    public final void setWidth(float f10) {
        this.width = f10;
    }

    public GeometryInfoEntity(long j10, float f10, int i10, float f11, int i11, int i12) {
        this.pointList = new ToMany<>(this, GeometryInfoEntity_.pointList);
        this.record = new ToOne<>(this, GeometryInfoEntity_.record);
        this.f8726id = j10;
        this.width = f10;
        this.color = i10;
        this.textSize = f11;
        this.style = i11;
        this.geometryType = i12;
    }

    public /* synthetic */ GeometryInfoEntity(long j10, float f10, int i10, float f11, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? 0.0f : f10, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
