package com.zykj.blackboard.bean;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class BackgroundLineConfig {
    private int lineColor;
    private float lineSpace;
    private BackgroundLineType lineType;
    private float lineWidth;

    public enum BackgroundLineType {
        Horizontal,
        Interweave
    }

    public BackgroundLineConfig() {
        this(0, 0.0f, null, 0.0f, 15, null);
    }

    public static /* synthetic */ BackgroundLineConfig copy$default(BackgroundLineConfig backgroundLineConfig, int i10, float f10, BackgroundLineType backgroundLineType, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = backgroundLineConfig.lineColor;
        }
        if ((i11 & 2) != 0) {
            f10 = backgroundLineConfig.lineSpace;
        }
        if ((i11 & 4) != 0) {
            backgroundLineType = backgroundLineConfig.lineType;
        }
        if ((i11 & 8) != 0) {
            f11 = backgroundLineConfig.lineWidth;
        }
        return backgroundLineConfig.copy(i10, f10, backgroundLineType, f11);
    }

    public final int component1() {
        return this.lineColor;
    }

    public final float component2() {
        return this.lineSpace;
    }

    public final BackgroundLineType component3() {
        return this.lineType;
    }

    public final float component4() {
        return this.lineWidth;
    }

    public final BackgroundLineConfig copy(int i10, float f10, BackgroundLineType lineType, float f11) {
        AbstractC9133u.m16133g(lineType, "lineType");
        return new BackgroundLineConfig(i10, f10, lineType, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundLineConfig)) {
            return false;
        }
        BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) obj;
        return this.lineColor == backgroundLineConfig.lineColor && AbstractC9133u.m16128b(Float.valueOf(this.lineSpace), Float.valueOf(backgroundLineConfig.lineSpace)) && this.lineType == backgroundLineConfig.lineType && AbstractC9133u.m16128b(Float.valueOf(this.lineWidth), Float.valueOf(backgroundLineConfig.lineWidth));
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    public final BackgroundLineType getLineType() {
        return this.lineType;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.lineColor) * 31) + Float.hashCode(this.lineSpace)) * 31) + this.lineType.hashCode()) * 31) + Float.hashCode(this.lineWidth);
    }

    public final void setLineColor(int i10) {
        this.lineColor = i10;
    }

    public final void setLineSpace(float f10) {
        this.lineSpace = f10;
    }

    public final void setLineType(BackgroundLineType backgroundLineType) {
        AbstractC9133u.m16133g(backgroundLineType, "<set-?>");
        this.lineType = backgroundLineType;
    }

    public final void setLineWidth(float f10) {
        this.lineWidth = f10;
    }

    public String toString() {
        return "BackgroundLineConfig(lineColor=" + this.lineColor + ", lineSpace=" + this.lineSpace + ", lineType=" + this.lineType + ", lineWidth=" + this.lineWidth + ')';
    }

    public BackgroundLineConfig(int i10, float f10, BackgroundLineType lineType, float f11) {
        AbstractC9133u.m16133g(lineType, "lineType");
        this.lineColor = i10;
        this.lineSpace = f10;
        this.lineType = lineType;
        this.lineWidth = f11;
    }

    public /* synthetic */ BackgroundLineConfig(int i10, float f10, BackgroundLineType backgroundLineType, float f11, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 96.0f : f10, (i11 & 4) != 0 ? BackgroundLineType.Horizontal : backgroundLineType, (i11 & 8) != 0 ? 3.0f : f11);
    }
}
