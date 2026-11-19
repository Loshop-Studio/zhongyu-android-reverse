package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m26954MarqueeSpacing0680j_4(final float f10) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.a
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i10, int i11) {
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f10, density, i10, i11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f10, Density density, int i10, int i11) {
        return density.mo27093roundToPx0680j_4(f10);
    }

    @Stable
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m26956basicMarquee1Mj1MLw(Modifier modifier, int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10) {
        return modifier.then(new MarqueeModifierElement(i10, i11, i12, i13, marqueeSpacing, f10, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26957basicMarquee1Mj1MLw$default(Modifier modifier, int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i14 & 2) != 0) {
            i11 = MarqueeAnimationMode.Companion.m27033getImmediatelyZbEOnfQ();
        }
        if ((i14 & 4) != 0) {
            i12 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i14 & 8) != 0) {
            i13 = MarqueeAnimationMode.m27029equalsimpl0(i11, MarqueeAnimationMode.Companion.m27033getImmediatelyZbEOnfQ()) ? i12 : 0;
        }
        if ((i14 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i14 & 32) != 0) {
            f10 = MarqueeDefaults.INSTANCE.m27035getVelocityD9Ej5fM();
        }
        return m26956basicMarquee1Mj1MLw(modifier, i10, i11, i12, i13, marqueeSpacing, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m26958createMarqueeAnimationSpecZ4HSEVQ(int i10, float f10, int i11, int i12, float f11, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo27099toPx0680j_4(f11)), f10, i12);
        long jM26881constructorimpl$default = StartOffset.m26881constructorimpl$default((-i12) + i11, 0, 2, null);
        return i10 == Integer.MAX_VALUE ? AnimationSpecKt.m26847infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM26881constructorimpl$default, 2, null) : AnimationSpecKt.m26849repeatable91I0pcU$default(i10, tweenSpecVelocityBasedTween, null, jM26881constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f10, float f11, int i10) {
        return AnimationSpecKt.tween((int) Math.ceil(f11 / (f10 / 1000.0f)), i10, EasingKt.getLinearEasing());
    }
}
