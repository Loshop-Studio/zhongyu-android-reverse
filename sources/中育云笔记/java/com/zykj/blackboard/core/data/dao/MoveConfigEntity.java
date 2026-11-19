package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p307q9.C10764d;

@Entity
/* loaded from: classes5.dex */
public final class MoveConfigEntity {
    private boolean horizontalTranslate;

    /* renamed from: id */
    private long f18343id;
    private boolean isEnable;
    private int maxHeightTimes;
    private int maxWidthTimes;
    private boolean rotate;
    private boolean scale;
    private boolean verticalTranslate;

    public MoveConfigEntity() {
        this(0L, false, false, false, false, false, 0, 0, 255, null);
    }

    /* renamed from: a */
    public final boolean m14222a() {
        return this.horizontalTranslate;
    }

    /* renamed from: b */
    public final long m14223b() {
        return this.f18343id;
    }

    /* renamed from: c */
    public final int m14224c() {
        return this.maxHeightTimes;
    }

    /* renamed from: d */
    public final int m14225d() {
        return this.maxWidthTimes;
    }

    /* renamed from: e */
    public final boolean m14226e() {
        return this.rotate;
    }

    /* renamed from: f */
    public final boolean m14227f() {
        return this.scale;
    }

    /* renamed from: g */
    public final boolean m14228g() {
        return this.verticalTranslate;
    }

    /* renamed from: h */
    public final boolean m14229h() {
        return this.isEnable;
    }

    /* renamed from: i */
    public final void m14230i() {
        C10341d.f24644a.m21626f().m18954g(MoveConfigEntity.class).m19227m(this);
    }

    /* renamed from: j */
    public final void m14231j(C10764d moveActionConfig) {
        AbstractC9979u.m20294g(moveActionConfig, "moveActionConfig");
        this.isEnable = moveActionConfig.m22928g();
        this.verticalTranslate = moveActionConfig.m22927f();
        this.horizontalTranslate = moveActionConfig.m22922a();
        this.scale = moveActionConfig.m22926e();
        this.rotate = moveActionConfig.m22925d();
        this.maxWidthTimes = moveActionConfig.m22924c();
        this.maxHeightTimes = moveActionConfig.m22923b();
    }

    /* renamed from: k */
    public final void m14232k(long j10) {
        this.f18343id = j10;
    }

    public MoveConfigEntity(long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11) {
        this.f18343id = j10;
        this.isEnable = z10;
        this.verticalTranslate = z11;
        this.horizontalTranslate = z12;
        this.scale = z13;
        this.rotate = z14;
        this.maxHeightTimes = i10;
        this.maxWidthTimes = i11;
    }

    public /* synthetic */ MoveConfigEntity(long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? false : z14, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? 0 : i11);
    }
}
