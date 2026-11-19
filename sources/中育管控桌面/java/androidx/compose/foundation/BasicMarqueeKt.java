package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002\u001aR\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7880d2 = {"MarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "repeatDelayMillis", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,535:1\n1#2:536\n*E\n"})
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m10116MarqueeSpacing0680j_4(final float f6) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.a
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i6, int i7) {
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f6, density, i6, i7);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f6, Density density, int i6, int i7) {
        return density.mo10249roundToPx0680j_4(f6);
    }

    @Stable
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m10118basicMarquee1Mj1MLw(Modifier modifier, int i6, int i7, int i8, int i9, MarqueeSpacing marqueeSpacing, float f6) {
        return modifier.then(new MarqueeModifierElement(i6, i7, i8, i9, marqueeSpacing, f6, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10119basicMarquee1Mj1MLw$default(Modifier modifier, int i6, int i7, int i8, int i9, MarqueeSpacing marqueeSpacing, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i10 & 2) != 0) {
            i7 = MarqueeAnimationMode.INSTANCE.m10192getImmediatelyZbEOnfQ();
        }
        if ((i10 & 4) != 0) {
            i8 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i10 & 8) != 0) {
            i9 = MarqueeAnimationMode.m10188equalsimpl0(i7, MarqueeAnimationMode.INSTANCE.m10192getImmediatelyZbEOnfQ()) ? i8 : 0;
        }
        if ((i10 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i10 & 32) != 0) {
            f6 = MarqueeDefaults.INSTANCE.m10194getVelocityD9Ej5fM();
        }
        return m10118basicMarquee1Mj1MLw(modifier, i6, i7, i8, i9, marqueeSpacing, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m10120createMarqueeAnimationSpecZ4HSEVQ(int i6, float f6, int i7, int i8, float f7, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo10255toPx0680j_4(f7)), f6, i8);
        long jM10046constructorimpl$default = StartOffset.m10046constructorimpl$default((-i8) + i7, 0, 2, null);
        return i6 == Integer.MAX_VALUE ? AnimationSpecKt.m10014infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM10046constructorimpl$default, 2, null) : AnimationSpecKt.m10016repeatable91I0pcU$default(i6, tweenSpecVelocityBasedTween, null, jM10046constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f6, float f7, int i6) {
        return AnimationSpecKt.tween((int) Math.ceil(f7 / (f6 / 1000.0f)), i6, EasingKt.getLinearEasing());
    }
}
