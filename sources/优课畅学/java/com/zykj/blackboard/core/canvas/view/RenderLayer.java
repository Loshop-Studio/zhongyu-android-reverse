package com.zykj.blackboard.core.canvas.view;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class RenderLayer {
    private final ActiveLayer activeLayer;
    private final BackgroundLayer backgroundLayer;
    private final FixLayer fixLayer;
    private final MaskLayer maskLayer;

    public RenderLayer(BackgroundLayer backgroundLayer, FixLayer fixLayer, ActiveLayer activeLayer, MaskLayer maskLayer) {
        AbstractC9133u.m16133g(backgroundLayer, "backgroundLayer");
        AbstractC9133u.m16133g(fixLayer, "fixLayer");
        this.backgroundLayer = backgroundLayer;
        this.fixLayer = fixLayer;
        this.activeLayer = activeLayer;
        this.maskLayer = maskLayer;
    }

    public final ActiveLayer getActiveLayer() {
        return this.activeLayer;
    }

    public final BackgroundLayer getBackgroundLayer() {
        return this.backgroundLayer;
    }

    public final FixLayer getFixLayer() {
        return this.fixLayer;
    }

    public final MaskLayer getMaskLayer() {
        return this.maskLayer;
    }

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
