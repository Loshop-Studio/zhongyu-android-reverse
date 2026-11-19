package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class TouchInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    /* renamed from: id */
    private long f18475id;
    public ToOne<TouchEventEntity> record;

    /* renamed from: x */
    private float f18476x;

    /* renamed from: y */
    private float f18477y;

    public TouchInfoEntity() {
        this(0L, 0L, 0.0f, 0.0f, 15, null);
    }

    /* renamed from: a */
    public final long m14331a() {
        return this.eventTime;
    }

    /* renamed from: b */
    public final long m14332b() {
        return this.f18475id;
    }

    /* renamed from: c */
    public final ToOne m14333c() {
        ToOne<TouchEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: d */
    public final float m14334d() {
        return this.f18476x;
    }

    /* renamed from: e */
    public final float m14335e() {
        return this.f18477y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchInfoEntity)) {
            return false;
        }
        TouchInfoEntity touchInfoEntity = (TouchInfoEntity) obj;
        return this.f18475id == touchInfoEntity.f18475id && this.eventTime == touchInfoEntity.eventTime && AbstractC9979u.m20289b(Float.valueOf(this.f18476x), Float.valueOf(touchInfoEntity.f18476x)) && AbstractC9979u.m20289b(Float.valueOf(this.f18477y), Float.valueOf(touchInfoEntity.f18477y));
    }

    /* renamed from: f */
    public final void m14336f() {
        C10341d.f24644a.m21626f().m18954g(TouchInfoEntity.class).m19227m(this);
    }

    /* renamed from: g */
    public final void m14337g(long j10) {
        this.f18475id = j10;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f18475id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.f18476x)) * 31) + Float.hashCode(this.f18477y);
    }

    public String toString() {
        return "TouchInfoEntity(id=" + this.f18475id + ", eventTime=" + this.eventTime + ", x=" + this.f18476x + ", y=" + this.f18477y + ')';
    }

    public TouchInfoEntity(long j10, long j11, float f10, float f11) {
        this.record = new ToOne<>(this, TouchInfoEntity_.f18494n);
        this.f18475id = j10;
        this.eventTime = j11;
        this.f18476x = f10;
        this.f18477y = f11;
    }

    public /* synthetic */ TouchInfoEntity(long j10, long j11, float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }
}
