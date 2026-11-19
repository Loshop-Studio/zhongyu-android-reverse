package com.zykj.sketch.core.config;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/sketch/core/config/GraphConfig;", "", "width", "", TypedValues.Custom.S_COLOR, "", "(FI)V", "getColor", "()I", "setColor", "(I)V", "getWidth", "()F", "setWidth", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class GraphConfig {
    private int color;
    private float width;

    public GraphConfig(float f, int i) {
        this.width = f;
        this.color = i;
    }

    public static /* synthetic */ GraphConfig copy$default(GraphConfig graphConfig, float f, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f = graphConfig.width;
        }
        if ((i8 & 2) != 0) {
            i = graphConfig.color;
        }
        return graphConfig.copy(f, i);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final GraphConfig copy(float width, int color) {
        return new GraphConfig(width, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphConfig)) {
            return false;
        }
        GraphConfig graphConfig = (GraphConfig) other;
        return Float.valueOf(this.width).equals(Float.valueOf(graphConfig.width)) && this.color == graphConfig.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.color) + (Float.hashCode(this.width) * 31);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GraphConfig(width=");
        sb.append(this.width);
        sb.append(", color=");
        return AbstractC0037f.m88m(sb, this.color, ')');
    }
}
