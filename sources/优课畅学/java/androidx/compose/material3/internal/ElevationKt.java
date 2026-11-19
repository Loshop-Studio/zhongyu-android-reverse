package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p013ui.unit.C3156Dp;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes2.dex */
public final class ElevationKt {
    private static final TweenSpec<C3156Dp> DefaultIncomingSpec;
    private static final TweenSpec<C3156Dp> DefaultOutgoingSpec;
    private static final TweenSpec<C3156Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec<>(150, 0, cubicBezierEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec<>(120, 0, cubicBezierEasing, 2, null);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m22913animateElevationrAjV9yQ(Animatable<C3156Dp, ?> animatable, float f10, Interaction interaction, Interaction interaction2, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        AnimationSpec<C3156Dp> animationSpecIncomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        if (animationSpecIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, C3156Dp.m26897boximpl(f10), animationSpecIncomingAnimationSpecForInteraction, null, null, interfaceC9324c, 12, null);
            return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
        }
        Object objSnapTo = animatable.snapTo(C3156Dp.m26897boximpl(f10), interfaceC9324c);
        return objSnapTo == AbstractC9434a.m17291f() ? objSnapTo : C8736p.f16368a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m22914animateElevationrAjV9yQ$default(Animatable animatable, float f10, Interaction interaction, Interaction interaction2, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interaction = null;
        }
        if ((i10 & 4) != 0) {
            interaction2 = null;
        }
        return m22913animateElevationrAjV9yQ(animatable, f10, interaction, interaction2, interfaceC9324c);
    }
}
