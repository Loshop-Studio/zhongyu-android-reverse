package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p013ui.unit.AndroidDensity_androidKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/foundation/GlowEdgeEffectCompat;", "Landroid/widget/EdgeEffect;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "oppositeReleaseDelta", "", "oppositeReleaseDeltaThreshold", "onAbsorb", "", "velocity", "", "onPull", "deltaDistance", "displacement", "onRelease", "releaseWithOppositeDelta", "delta", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,208:1\n1#2:209\n113#3:210\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n121#1:210\n*E\n"})
/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo17332toPx0680j_4(C3127Dp.m23561constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int velocity) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(velocity);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance, float displacement) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(deltaDistance, displacement);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float delta) {
        float f10 = this.oppositeReleaseDelta + delta;
        this.oppositeReleaseDelta = f10;
        if (Math.abs(f10) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(deltaDistance);
    }
}
