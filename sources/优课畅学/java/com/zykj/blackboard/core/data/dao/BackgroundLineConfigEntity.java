package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.annotation.Entity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntity {

    /* renamed from: id */
    private long f8714id;
    private int lineColor;
    private float lineSpace;
    private EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType;
    private float lineWidth;

    public BackgroundLineConfigEntity() {
        this(0L, 0, 0.0f, null, 0.0f, 31, null);
    }

    public final long getId() {
        return this.f8714id;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    public final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum getLineType() {
        return this.lineType;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(BackgroundLineConfigEntity.class).m15414l(this);
    }

    public final void setId(long j10) {
        this.f8714id = j10;
    }

    public final void setLineColor(int i10) {
        this.lineColor = i10;
    }

    public final void setLineSpace(float f10) {
        this.lineSpace = f10;
    }

    public final void setLineType(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        AbstractC9133u.m16133g(backgroundLineTypeEnum, "<set-?>");
        this.lineType = backgroundLineTypeEnum;
    }

    public final void setLineWidth(float f10) {
        this.lineWidth = f10;
    }

    public BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType, float f11) {
        AbstractC9133u.m16133g(lineType, "lineType");
        this.f8714id = j10;
        this.lineColor = i10;
        this.lineSpace = f10;
        this.lineType = lineType;
        this.lineWidth = f11;
    }

    public /* synthetic */ BackgroundLineConfigEntity(long j10, int i10, float f10, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum, float f11, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 20.0f : f10, (i11 & 8) != 0 ? EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.HORIZONTAL : backgroundLineTypeEnum, (i11 & 16) != 0 ? 3.0f : f11);
    }
}
