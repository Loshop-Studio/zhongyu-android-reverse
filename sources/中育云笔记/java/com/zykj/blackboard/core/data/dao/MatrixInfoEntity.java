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
public final class MatrixInfoEntity {
    transient BoxStore __boxStore;
    private long eventTime;

    /* renamed from: id */
    private long f18294id;
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

    /* renamed from: a */
    public final long m14190a() {
        return this.eventTime;
    }

    /* renamed from: b */
    public final long m14191b() {
        return this.f18294id;
    }

    /* renamed from: c */
    public final float m14192c() {
        return this.perSp0;
    }

    /* renamed from: d */
    public final float m14193d() {
        return this.perSp1;
    }

    /* renamed from: e */
    public final float m14194e() {
        return this.perSp2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatrixInfoEntity)) {
            return false;
        }
        MatrixInfoEntity matrixInfoEntity = (MatrixInfoEntity) obj;
        return this.f18294id == matrixInfoEntity.f18294id && this.eventTime == matrixInfoEntity.eventTime && AbstractC9979u.m20289b(Float.valueOf(this.scaleX), Float.valueOf(matrixInfoEntity.scaleX)) && AbstractC9979u.m20289b(Float.valueOf(this.skewX), Float.valueOf(matrixInfoEntity.skewX)) && AbstractC9979u.m20289b(Float.valueOf(this.transX), Float.valueOf(matrixInfoEntity.transX)) && AbstractC9979u.m20289b(Float.valueOf(this.skewY), Float.valueOf(matrixInfoEntity.skewY)) && AbstractC9979u.m20289b(Float.valueOf(this.scaleY), Float.valueOf(matrixInfoEntity.scaleY)) && AbstractC9979u.m20289b(Float.valueOf(this.transY), Float.valueOf(matrixInfoEntity.transY)) && AbstractC9979u.m20289b(Float.valueOf(this.perSp0), Float.valueOf(matrixInfoEntity.perSp0)) && AbstractC9979u.m20289b(Float.valueOf(this.perSp1), Float.valueOf(matrixInfoEntity.perSp1)) && AbstractC9979u.m20289b(Float.valueOf(this.perSp2), Float.valueOf(matrixInfoEntity.perSp2));
    }

    /* renamed from: f */
    public final ToOne m14195f() {
        ToOne<MatrixEventEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: g */
    public final float m14196g() {
        return this.scaleX;
    }

    /* renamed from: h */
    public final float m14197h() {
        return this.scaleY;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.f18294id) * 31) + Long.hashCode(this.eventTime)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.skewX)) * 31) + Float.hashCode(this.transX)) * 31) + Float.hashCode(this.skewY)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.transY)) * 31) + Float.hashCode(this.perSp0)) * 31) + Float.hashCode(this.perSp1)) * 31) + Float.hashCode(this.perSp2);
    }

    /* renamed from: i */
    public final float m14198i() {
        return this.skewX;
    }

    /* renamed from: j */
    public final float m14199j() {
        return this.skewY;
    }

    /* renamed from: k */
    public final float m14200k() {
        return this.transX;
    }

    /* renamed from: l */
    public final float m14201l() {
        return this.transY;
    }

    /* renamed from: m */
    public final void m14202m() {
        C10341d.f24644a.m21626f().m18954g(MatrixInfoEntity.class).m19227m(this);
    }

    /* renamed from: n */
    public final void m14203n(long j10) {
        this.f18294id = j10;
    }

    public String toString() {
        return "MatrixInfoEntity(id=" + this.f18294id + ", eventTime=" + this.eventTime + ", scaleX=" + this.scaleX + ", skewX=" + this.skewX + ", transX=" + this.transX + ", skewY=" + this.skewY + ", scaleY=" + this.scaleY + ", transY=" + this.transY + ", perSp0=" + this.perSp0 + ", perSp1=" + this.perSp1 + ", perSp2=" + this.perSp2 + ')';
    }

    public MatrixInfoEntity(long j10, long j11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.record = new ToOne<>(this, MatrixInfoEntity_.f18325u);
        this.f18294id = j10;
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

    public /* synthetic */ MatrixInfoEntity(long j10, long j11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) == 0 ? j11 : 0L, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11, (i10 & 16) != 0 ? 0.0f : f12, (i10 & 32) != 0 ? 0.0f : f13, (i10 & 64) != 0 ? 0.0f : f14, (i10 & 128) != 0 ? 0.0f : f15, (i10 & 256) != 0 ? 0.0f : f16, (i10 & 512) != 0 ? 0.0f : f17, (i10 & 1024) != 0 ? 0.0f : f18);
    }
}
