package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "create", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "onPullDistanceCompat", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "Ld6/s;", "onAbsorbCompat", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "Landroidx/compose/ui/unit/Density;", "density", "absorbToRelaxIfNeeded", "(Landroid/widget/EdgeEffect;FFLandroidx/compose/ui/unit/Density;)F", "delta", "onReleaseWithOppositeDelta", "(Landroid/widget/EdgeEffect;F)V", "getDistanceCompat", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    public static final int $stable = 0;

    @NotNull
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final float absorbToRelaxIfNeeded(@NotNull EdgeEffect edgeEffect, float f, float f7, @NotNull Density density) {
        if (EdgeEffectCompat_androidKt.flingDistance(density, f) > getDistanceCompat(edgeEffect) * f7) {
            return 0.0f;
        }
        onAbsorbCompat(edgeEffect, AbstractC6600a.m6241q(f));
        return f;
    }

    @NotNull
    public final EdgeEffect create(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.INSTANCE.create(context, null) : new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(@NotNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(@NotNull EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float onPullDistanceCompat(@NotNull EdgeEffect edgeEffect, float f, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f, f7);
        }
        edgeEffect.onPull(f, f7);
        return f;
    }

    public final void onReleaseWithOppositeDelta(@NotNull EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
