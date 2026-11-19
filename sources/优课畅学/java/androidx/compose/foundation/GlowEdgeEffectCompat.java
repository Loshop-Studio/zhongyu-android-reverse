package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p013ui.unit.AndroidDensity_androidKt;
import androidx.compose.p013ui.unit.C3156Dp;

/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f10) {
        float f11 = this.oppositeReleaseDelta + f10;
        this.oppositeReleaseDelta = f11;
        if (Math.abs(f11) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f10);
    }
}
