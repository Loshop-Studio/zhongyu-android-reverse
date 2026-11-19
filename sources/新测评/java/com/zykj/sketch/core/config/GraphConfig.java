package com.zykj.sketch.core.config;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/sketch/core/config/GraphConfig;", "", "width", "", TypedValues.Custom.S_COLOR, "", "(FI)V", "getColor", "()I", "setColor", "(I)V", "getWidth", "()F", "setWidth", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GraphConfig {
    private int color;
    private float width;

    public GraphConfig(float f10, int i10) {
        this.width = f10;
        this.color = i10;
    }

    public static /* synthetic */ GraphConfig copy$default(GraphConfig graphConfig, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = graphConfig.width;
        }
        if ((i11 & 2) != 0) {
            i10 = graphConfig.color;
        }
        return graphConfig.copy(f10, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final GraphConfig copy(float width, int color) {
        return new GraphConfig(width, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphConfig)) {
            return false;
        }
        GraphConfig graphConfig = (GraphConfig) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.width), (Object) Float.valueOf(graphConfig.width)) && this.color == graphConfig.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Float.hashCode(this.width) * 31) + Integer.hashCode(this.color);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setWidth(float f10) {
        this.width = f10;
    }

    public String toString() {
        return "GraphConfig(width=" + this.width + ", color=" + this.color + ')';
    }
}
