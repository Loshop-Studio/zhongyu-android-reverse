package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006&"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "", "", "id", "", "lineColor", "", "lineSpace", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "lineType", "lineWidth", "<init>", "(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V", "", "f", "()V", "J", "a", "()J", "g", "(J)V", "I", "b", "()I", "setLineColor", "(I)V", "F", "c", "()F", "setLineSpace", "(F)V", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "d", "()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "setLineType", "(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V", "e", "setLineWidth", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
@Entity
/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntity {
    private long id;
    private int lineColor;
    private float lineSpace;
    private EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType;
    private float lineWidth;

    public BackgroundLineConfigEntity() {
        this(0L, 0, 0.0f, null, 0.0f, 31, null);
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final int getLineColor() {
        return this.lineColor;
    }

    /* renamed from: c, reason: from getter */
    public final float getLineSpace() {
        return this.lineSpace;
    }

    /* renamed from: d, reason: from getter */
    public final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum getLineType() {
        return this.lineType;
    }

    /* renamed from: e, reason: from getter */
    public final float getLineWidth() {
        return this.lineWidth;
    }

    /* renamed from: f */
    public final void m6311f() {
        C7342c.f11908a.m11744b().m12981h(BackgroundLineConfigEntity.class).m15045l(this);
    }

    /* renamed from: g */
    public final void m6312g(long j10) {
        this.id = j10;
    }

    public BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType, float f11) {
        Intrinsics.checkNotNullParameter(lineType, "lineType");
        this.id = j10;
        this.lineColor = i10;
        this.lineSpace = f10;
        this.lineType = lineType;
        this.lineWidth = f11;
    }

    public /* synthetic */ BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 20.0f : f10, (i11 & 8) != 0 ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL : backgroundLineTypeEnum, (i11 & 16) != 0 ? 3.0f : f11);
    }
}
