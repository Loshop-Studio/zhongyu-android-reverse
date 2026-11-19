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
public final class TouchEventEntity {
    transient BoxStore __boxStore;
    private int color;

    /* renamed from: id */
    private long f18450id;
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

    /* renamed from: a */
    public final int m14314a() {
        return this.color;
    }

    /* renamed from: b */
    public final long m14315b() {
        return this.f18450id;
    }

    /* renamed from: c */
    public final float m14316c() {
        return this.itemLength;
    }

    /* renamed from: d */
    public final ToOne m14317d() {
        ToOne<TouchRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: e */
    public final float m14318e() {
        return this.spacing;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEventEntity)) {
            return false;
        }
        TouchEventEntity touchEventEntity = (TouchEventEntity) obj;
        return this.f18450id == touchEventEntity.f18450id && AbstractC9979u.m20289b(Float.valueOf(this.width), Float.valueOf(touchEventEntity.width)) && this.color == touchEventEntity.color && AbstractC9979u.m20289b(Float.valueOf(this.spacing), Float.valueOf(touchEventEntity.spacing)) && AbstractC9979u.m20289b(Float.valueOf(this.itemLength), Float.valueOf(touchEventEntity.itemLength)) && this.style == touchEventEntity.style && AbstractC9979u.m20289b(Float.valueOf(this.textSize), Float.valueOf(touchEventEntity.textSize));
    }

    /* renamed from: f */
    public final int m14319f() {
        return this.style;
    }

    /* renamed from: g */
    public final float m14320g() {
        return this.textSize;
    }

    /* renamed from: h */
    public final ToMany m14321h() {
        ToMany<TouchInfoEntity> toMany = this.touchInfoList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("touchInfoList");
        return null;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f18450id) * 31) + Float.hashCode(this.width)) * 31) + Integer.hashCode(this.color)) * 31) + Float.hashCode(this.spacing)) * 31) + Float.hashCode(this.itemLength)) * 31) + Integer.hashCode(this.style)) * 31) + Float.hashCode(this.textSize);
    }

    /* renamed from: i */
    public final float m14322i() {
        return this.width;
    }

    /* renamed from: j */
    public final void m14323j() {
        C10341d.f24644a.m21626f().m18954g(TouchEventEntity.class).m19227m(this);
    }

    /* renamed from: k */
    public final void m14324k(long j10) {
        this.f18450id = j10;
    }

    public String toString() {
        return "TouchEventEntity(id=" + this.f18450id + ", width=" + this.width + ", color=" + this.color + ", spacing=" + this.spacing + ", itemLength=" + this.itemLength + ", style=" + this.style + ", textSize=" + this.textSize + ')';
    }

    public TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13) {
        this.touchInfoList = new ToMany<>(this, TouchEventEntity_.f18474r);
        this.record = new ToOne<>(this, TouchEventEntity_.f18473q);
        this.f18450id = j10;
        this.width = f10;
        this.color = i10;
        this.spacing = f11;
        this.itemLength = f12;
        this.style = i11;
        this.textSize = f13;
    }

    public /* synthetic */ TouchEventEntity(long j10, float f10, int i10, float f11, float f12, int i11, float f13, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0.0f : f10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0.0f : f11, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? 0.0f : f13);
    }
}
