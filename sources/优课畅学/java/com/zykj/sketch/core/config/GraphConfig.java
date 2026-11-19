package com.zykj.sketch.core.config;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class GraphConfig {
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

    public final float component1() {
        return this.width;
    }

    public final int component2() {
        return this.color;
    }

    public final GraphConfig copy(float f10, int i10) {
        return new GraphConfig(f10, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphConfig)) {
            return false;
        }
        GraphConfig graphConfig = (GraphConfig) obj;
        return AbstractC9133u.m16128b(Float.valueOf(this.width), Float.valueOf(graphConfig.width)) && this.color == graphConfig.color;
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
