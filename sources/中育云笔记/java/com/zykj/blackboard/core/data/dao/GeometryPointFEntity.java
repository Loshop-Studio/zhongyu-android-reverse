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
public final class GeometryPointFEntity {
    transient BoxStore __boxStore;

    /* renamed from: id */
    private long f18203id;
    public ToOne<GeometryInfoEntity> record;

    /* renamed from: x */
    private float f18204x;

    /* renamed from: y */
    private float f18205y;

    public GeometryPointFEntity() {
        this(0L, 0.0f, 0.0f, 7, null);
    }

    /* renamed from: a */
    public final long m14120a() {
        return this.f18203id;
    }

    /* renamed from: b */
    public final ToOne m14121b() {
        ToOne<GeometryInfoEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: c */
    public final float m14122c() {
        return this.f18204x;
    }

    /* renamed from: d */
    public final float m14123d() {
        return this.f18205y;
    }

    /* renamed from: e */
    public final void m14124e() {
        C10341d.f24644a.m21626f().m18954g(GeometryPointFEntity.class).m19227m(this);
    }

    /* renamed from: f */
    public final void m14125f(long j10) {
        this.f18203id = j10;
    }

    public GeometryPointFEntity(long j10, float f10, float f11) {
        this.record = new ToOne<>(this, GeometryPointFEntity_.f18220m);
        this.f18203id = j10;
        this.f18204x = f10;
        this.f18205y = f11;
    }

    public /* synthetic */ GeometryPointFEntity(long j10, float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }
}
