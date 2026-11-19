package com.zykj.blackboard.bean;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006$"}, m5110d2 = {"Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "", "lineColor", "", "lineSpace", "", "lineType", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "lineWidth", "(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V", "getLineColor", "()I", "setLineColor", "(I)V", "getLineSpace", "()F", "setLineSpace", "(F)V", "getLineType", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "setLineType", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V", "getLineWidth", "setLineWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "BackgroundLineType", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class BackgroundLineConfig {
    private int lineColor;
    private float lineSpace;

    @NotNull
    private BackgroundLineType lineType;
    private float lineWidth;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "", "(Ljava/lang/String;I)V", "Horizontal", "Interweave", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum BackgroundLineType {
        Horizontal,
        Interweave
    }

    public BackgroundLineConfig() {
        this(0, 0.0f, null, 0.0f, 15, null);
    }

    public static /* synthetic */ BackgroundLineConfig copy$default(BackgroundLineConfig backgroundLineConfig, int i, float f, BackgroundLineType backgroundLineType, float f7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = backgroundLineConfig.lineColor;
        }
        if ((i8 & 2) != 0) {
            f = backgroundLineConfig.lineSpace;
        }
        if ((i8 & 4) != 0) {
            backgroundLineType = backgroundLineConfig.lineType;
        }
        if ((i8 & 8) != 0) {
            f7 = backgroundLineConfig.lineWidth;
        }
        return backgroundLineConfig.copy(i, f, backgroundLineType, f7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLineColor() {
        return this.lineColor;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLineSpace() {
        return this.lineSpace;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BackgroundLineType getLineType() {
        return this.lineType;
    }

    /* renamed from: component4, reason: from getter */
    public final float getLineWidth() {
        return this.lineWidth;
    }

    @NotNull
    public final BackgroundLineConfig copy(int lineColor, float lineSpace, @NotNull BackgroundLineType lineType, float lineWidth) {
        AbstractC5830k.m5330g(lineType, "lineType");
        return new BackgroundLineConfig(lineColor, lineSpace, lineType, lineWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundLineConfig)) {
            return false;
        }
        BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) other;
        return this.lineColor == backgroundLineConfig.lineColor && Float.valueOf(this.lineSpace).equals(Float.valueOf(backgroundLineConfig.lineSpace)) && this.lineType == backgroundLineConfig.lineType && Float.valueOf(this.lineWidth).equals(Float.valueOf(backgroundLineConfig.lineWidth));
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    @NotNull
    public final BackgroundLineType getLineType() {
        return this.lineType;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public int hashCode() {
        return Float.hashCode(this.lineWidth) + ((this.lineType.hashCode() + AbstractC0584a.m901b(this.lineSpace, Integer.hashCode(this.lineColor) * 31, 31)) * 31);
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setLineSpace(float f) {
        this.lineSpace = f;
    }

    public final void setLineType(@NotNull BackgroundLineType backgroundLineType) {
        AbstractC5830k.m5330g(backgroundLineType, "<set-?>");
        this.lineType = backgroundLineType;
    }

    public final void setLineWidth(float f) {
        this.lineWidth = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BackgroundLineConfig(lineColor=");
        sb.append(this.lineColor);
        sb.append(", lineSpace=");
        sb.append(this.lineSpace);
        sb.append(", lineType=");
        sb.append(this.lineType);
        sb.append(", lineWidth=");
        return AbstractC0584a.m915p(sb, this.lineWidth, ')');
    }

    public BackgroundLineConfig(int i, float f, @NotNull BackgroundLineType lineType, float f7) {
        AbstractC5830k.m5330g(lineType, "lineType");
        this.lineColor = i;
        this.lineSpace = f;
        this.lineType = lineType;
        this.lineWidth = f7;
    }

    public /* synthetic */ BackgroundLineConfig(int i, float f, BackgroundLineType backgroundLineType, float f7, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 96.0f : f, (i8 & 4) != 0 ? BackgroundLineType.Horizontal : backgroundLineType, (i8 & 8) != 0 ? 3.0f : f7);
    }
}
