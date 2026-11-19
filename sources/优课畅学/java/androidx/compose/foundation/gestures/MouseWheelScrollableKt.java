package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.C3156Dp;

/* loaded from: classes.dex */
public final class MouseWheelScrollableKt {
    private static final int MaxAnimationDuration = 100;
    private static final long ScrollProgressTimeout = 50;
    private static final float AnimationThreshold = C3156Dp.m26899constructorimpl(6);
    private static final float AnimationSpeed = C3156Dp.m26899constructorimpl(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowScrollingDelta(float f10) {
        return Float.isNaN(f10) || Math.abs(f10) < 0.5f;
    }
}
