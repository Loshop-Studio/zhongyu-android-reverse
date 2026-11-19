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
public final class GeometryPointFEntity {
    transient BoxStore __boxStore;

    /* renamed from: id */
    private long f8728id;
    public ToOne<GeometryInfoEntity> record;

    /* renamed from: x */
    private float f8729x;

    /* renamed from: y */
    private float f8730y;

    public GeometryPointFEntity() {
        this(0L, 0.0f, 0.0f, 7, null);
    }

    public final long getId() {
        return this.f8728id;
    }

    public final ToOne<GeometryInfoEntity> getRecord() {
        ToOne<GeometryInfoEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public final float getX() {
        return this.f8729x;
    }

    public final float getY() {
        return this.f8730y;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryPointFEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryPointFEntity.class).m15422t(this);
    }

    public final void setId(long j10) {
        this.f8728id = j10;
    }

    public final void setRecord(ToOne<GeometryInfoEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public final void setX(float f10) {
        this.f8729x = f10;
    }

    public final void setY(float f10) {
        this.f8730y = f10;
    }

    public GeometryPointFEntity(long j10, float f10, float f11) {
        this.record = new ToOne<>(this, GeometryPointFEntity_.record);
        this.f8728id = j10;
        this.f8729x = f10;
        this.f8730y = f11;
    }

    public /* synthetic */ GeometryPointFEntity(long j10, float f10, float f11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }
}
