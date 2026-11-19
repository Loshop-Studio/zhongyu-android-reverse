package com.zykj.blackboard.core.canvas.view;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "", "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "backgroundLayer", "Lcom/zykj/blackboard/core/canvas/view/FixLayer;", "fixLayer", "Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;", "activeLayer", "Lcom/zykj/blackboard/core/canvas/view/MaskLayer;", "maskLayer", "<init>", "(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V", "Landroid/graphics/Rect;", "getRenderRect", "()Landroid/graphics/Rect;", "Ld6/s;", "reset", "()V", "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "getBackgroundLayer", "()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "Lcom/zykj/blackboard/core/canvas/view/FixLayer;", "getFixLayer", "()Lcom/zykj/blackboard/core/canvas/view/FixLayer;", "Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;", "getActiveLayer", "()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;", "Lcom/zykj/blackboard/core/canvas/view/MaskLayer;", "getMaskLayer", "()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RenderLayer {

    @Nullable
    private final ActiveLayer activeLayer;

    @NotNull
    private final BackgroundLayer backgroundLayer;

    @NotNull
    private final FixLayer fixLayer;

    @Nullable
    private final MaskLayer maskLayer;

    public RenderLayer(@NotNull BackgroundLayer backgroundLayer, @NotNull FixLayer fixLayer, @Nullable ActiveLayer activeLayer, @Nullable MaskLayer maskLayer) {
        AbstractC5830k.m5330g(backgroundLayer, "backgroundLayer");
        AbstractC5830k.m5330g(fixLayer, "fixLayer");
        this.backgroundLayer = backgroundLayer;
        this.fixLayer = fixLayer;
        this.activeLayer = activeLayer;
        this.maskLayer = maskLayer;
    }

    @Nullable
    public final ActiveLayer getActiveLayer() {
        return this.activeLayer;
    }

    @NotNull
    public final BackgroundLayer getBackgroundLayer() {
        return this.backgroundLayer;
    }

    @NotNull
    public final FixLayer getFixLayer() {
        return this.fixLayer;
    }

    @Nullable
    public final MaskLayer getMaskLayer() {
        return this.maskLayer;
    }

    @NotNull
    public final Rect getRenderRect() {
        return this.fixLayer.rect();
    }

    public final void reset() {
        this.fixLayer.reset();
        ActiveLayer activeLayer = this.activeLayer;
        if (activeLayer != null) {
            activeLayer.clear();
        }
    }
}
