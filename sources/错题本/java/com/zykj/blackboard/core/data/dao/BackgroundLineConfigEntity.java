package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006&"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "", "", "id", "", "lineColor", "", "lineSpace", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "lineType", "lineWidth", "<init>", "(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V", "Ld6/s;", "put", "()V", "J", "getId", "()J", "setId", "(J)V", "I", "getLineColor", "()I", "setLineColor", "(I)V", "F", "getLineSpace", "()F", "setLineSpace", "(F)V", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "getLineType", "()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "setLineType", "(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V", "getLineWidth", "setLineWidth", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final class BackgroundLineConfigEntity {

    @InterfaceC5697Id
    private long id;
    private int lineColor;
    private float lineSpace;

    @Convert(converter = BackgroundLineTypeEnumConverter.class, dbType = int.class)
    @NotNull
    private EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum lineType;
    private float lineWidth;

    public BackgroundLineConfigEntity() {
        this(0L, 0, 0.0f, null, 0.0f, 31, null);
    }

    public final long getId() {
        return this.id;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    @NotNull
    public final EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum getLineType() {
        return this.lineType;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(BackgroundLineConfigEntity.class).m5034e(this);
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setLineSpace(float f) {
        this.lineSpace = f;
    }

    public final void setLineType(@NotNull EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum) {
        AbstractC5830k.m5330g(ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum, "<set-?>");
        this.lineType = ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    }

    public final void setLineWidth(float f) {
        this.lineWidth = f;
    }

    public BackgroundLineConfigEntity(long j7, int i, float f, @NotNull EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum lineType, float f7) {
        AbstractC5830k.m5330g(lineType, "lineType");
        this.id = j7;
        this.lineColor = i;
        this.lineSpace = f;
        this.lineType = lineType;
        this.lineWidth = f7;
    }

    public /* synthetic */ BackgroundLineConfigEntity(long j7, int i, float f, EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum, float f7, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? 20.0f : f, (i8 & 8) != 0 ? EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.HORIZONTAL : ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum, (i8 & 16) != 0 ? 3.0f : f7);
    }
}
