package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002\u001aR\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m13413d2 = {"MarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "repeatDelayMillis", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,535:1\n1#2:536\n*E\n"})
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m17626MarqueeSpacing0680j_4(final float f10) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.a
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i9, int i10) {
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f10, density, i9, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f10, Density density, int i9, int i10) {
        return density.mo17759roundToPx0680j_4(f10);
    }

    @Stable
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m17628basicMarquee1Mj1MLw(Modifier modifier, int i9, int i10, int i11, int i12, MarqueeSpacing marqueeSpacing, float f10) {
        return modifier.then(new MarqueeModifierElement(i9, i10, i11, i12, marqueeSpacing, f10, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m17629basicMarquee1Mj1MLw$default(Modifier modifier, int i9, int i10, int i11, int i12, MarqueeSpacing marqueeSpacing, float f10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i13 & 2) != 0) {
            i10 = MarqueeAnimationMode.INSTANCE.m17702getImmediatelyZbEOnfQ();
        }
        if ((i13 & 4) != 0) {
            i11 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i13 & 8) != 0) {
            i12 = MarqueeAnimationMode.m17698equalsimpl0(i10, MarqueeAnimationMode.INSTANCE.m17702getImmediatelyZbEOnfQ()) ? i11 : 0;
        }
        if ((i13 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i13 & 32) != 0) {
            f10 = MarqueeDefaults.INSTANCE.m17704getVelocityD9Ej5fM();
        }
        return m17628basicMarquee1Mj1MLw(modifier, i9, i10, i11, i12, marqueeSpacing, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m17630createMarqueeAnimationSpecZ4HSEVQ(int i9, float f10, int i10, int i11, float f11, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo17765toPx0680j_4(f11)), f10, i11);
        long jM17556constructorimpl$default = StartOffset.m17556constructorimpl$default((-i11) + i10, 0, 2, null);
        return i9 == Integer.MAX_VALUE ? AnimationSpecKt.m17524infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM17556constructorimpl$default, 2, null) : AnimationSpecKt.m17526repeatable91I0pcU$default(i9, tweenSpecVelocityBasedTween, null, jM17556constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f10, float f11, int i9) {
        return AnimationSpecKt.tween((int) Math.ceil(f11 / (f10 / 1000.0f)), i9, EasingKt.getLinearEasing());
    }
}
