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
public final class GeometryInfoEntity {
    transient BoxStore __boxStore;
    private int color;
    private int geometryType;

    /* renamed from: id */
    private long f18180id;
    public ToMany<GeometryPointFEntity> pointList;
    public ToOne<GeometryRecordEntity> record;
    private int style;
    private float textSize;
    private float width;

    public GeometryInfoEntity() {
        this(0L, 0.0f, 0, 0.0f, 0, 0, 63, null);
    }

    /* renamed from: a */
    public final int m14104a() {
        return this.color;
    }

    /* renamed from: b */
    public final int m14105b() {
        return this.geometryType;
    }

    /* renamed from: c */
    public final long m14106c() {
        return this.f18180id;
    }

    /* renamed from: d */
    public final ToMany m14107d() {
        ToMany<GeometryPointFEntity> toMany = this.pointList;
        if (toMany != null) {
            return toMany;
        }
        AbstractC9979u.m20312y("pointList");
        return null;
    }

    /* renamed from: e */
    public final ToOne m14108e() {
        ToOne<GeometryRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: f */
    public final int m14109f() {
        return this.style;
    }

    /* renamed from: g */
    public final float m14110g() {
        return this.textSize;
    }

    /* renamed from: h */
    public final float m14111h() {
        return this.width;
    }

    /* renamed from: i */
    public final void m14112i() {
        C10341d.f24644a.m21626f().m18954g(GeometryInfoEntity.class).m19227m(this);
    }

    /* renamed from: j */
    public final void m14113j(long j10) {
        this.f18180id = j10;
    }

    public GeometryInfoEntity(long j10, float f10, int i10, float f11, int i11, int i12) {
        this.pointList = new ToMany<>(this, GeometryInfoEntity_.f18202q);
        this.record = new ToOne<>(this, GeometryInfoEntity_.f18201p);
        this.f18180id = j10;
        this.width = f10;
        this.color = i10;
        this.textSize = f11;
        this.style = i11;
        this.geometryType = i12;
    }

    public /* synthetic */ GeometryInfoEntity(long j10, float f10, int i10, float f11, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? 0.0f : f10, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
