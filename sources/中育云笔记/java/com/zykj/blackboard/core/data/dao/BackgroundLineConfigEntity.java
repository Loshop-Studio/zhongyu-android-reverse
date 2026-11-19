package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class BackgroundLineConfigEntity {

    /* renamed from: id */
    private long f18073id;
    private int lineColor;
    private float lineSpace;
    private EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType;
    private float lineWidth;

    public BackgroundLineConfigEntity() {
        this(0L, 0, 0.0f, null, 0.0f, 31, null);
    }

    /* renamed from: a */
    public final long m14029a() {
        return this.f18073id;
    }

    /* renamed from: b */
    public final int m14030b() {
        return this.lineColor;
    }

    /* renamed from: c */
    public final float m14031c() {
        return this.lineSpace;
    }

    /* renamed from: d */
    public final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum m14032d() {
        return this.lineType;
    }

    /* renamed from: e */
    public final float m14033e() {
        return this.lineWidth;
    }

    /* renamed from: f */
    public final void m14034f() {
        C10341d.f24644a.m21626f().m18954g(BackgroundLineConfigEntity.class).m19227m(this);
    }

    /* renamed from: g */
    public final void m14035g(long j10) {
        this.f18073id = j10;
    }

    public BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType, float f11) {
        AbstractC9979u.m20294g(lineType, "lineType");
        this.f18073id = j10;
        this.lineColor = i10;
        this.lineSpace = f10;
        this.lineType = lineType;
        this.lineWidth = f11;
    }

    public /* synthetic */ BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum, float f11, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 20.0f : f10, (i11 & 8) != 0 ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL : backgroundLineTypeEnum, (i11 & 16) != 0 ? 3.0f : f11);
    }
}
