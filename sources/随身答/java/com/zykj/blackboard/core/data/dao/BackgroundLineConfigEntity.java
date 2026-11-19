package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006&"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "", "", "id", "", "lineColor", "", "lineSpace", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "lineType", "lineWidth", "<init>", "(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V", "", "f", "()V", "J", "a", "()J", "g", "(J)V", "I", "b", "()I", "h", "(I)V", "F", "c", "()F", "i", "(F)V", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "d", "()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "j", "(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V", "e", "k", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public final void m7404f() {
        C9685d.f17121a.m16165f().m13101h(BackgroundLineConfigEntity.class).m2255l(this);
    }

    /* renamed from: g */
    public final void m7405g(long j9) {
        this.id = j9;
    }

    /* renamed from: h */
    public final void m7406h(int i9) {
        this.lineColor = i9;
    }

    /* renamed from: i */
    public final void m7407i(float f10) {
        this.lineSpace = f10;
    }

    /* renamed from: j */
    public final void m7408j(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        Intrinsics.checkNotNullParameter(backgroundLineTypeEnum, "<set-?>");
        this.lineType = backgroundLineTypeEnum;
    }

    /* renamed from: k */
    public final void m7409k(float f10) {
        this.lineWidth = f10;
    }

    public BackgroundLineConfigEntity(long j9, int i9, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType, float f11) {
        Intrinsics.checkNotNullParameter(lineType, "lineType");
        this.id = j9;
        this.lineColor = i9;
        this.lineSpace = f10;
        this.lineType = lineType;
        this.lineWidth = f11;
    }

    public /* synthetic */ BackgroundLineConfigEntity(long j9, int i9, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j9, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? 20.0f : f10, (i10 & 8) != 0 ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL : backgroundLineTypeEnum, (i10 & 16) != 0 ? 3.0f : f11);
    }
}
