package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material3.MenuKt;
import androidx.compose.p014ui.unit.C3186Dp;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class ElevationKt {
    private static final TweenSpec<C3186Dp> DefaultIncomingSpec;
    private static final TweenSpec<C3186Dp> DefaultOutgoingSpec;
    private static final TweenSpec<C3186Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(MenuKt.InTransitionDuration, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec<>(150, 0, cubicBezierEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec<>(MenuKt.InTransitionDuration, 0, cubicBezierEasing, 2, null);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m29515animateElevationrAjV9yQ(Animatable<C3186Dp, ?> animatable, float f10, Interaction interaction, Interaction interaction2, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        AnimationSpec<C3186Dp> animationSpecIncomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        if (animationSpecIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, C3186Dp.m33499boximpl(f10), animationSpecIncomingAnimationSpecForInteraction, null, null, interfaceC11588c, 12, null);
            return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
        }
        Object objSnapTo = animatable.snapTo(C3186Dp.m33499boximpl(f10), interfaceC11588c);
        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m29516animateElevationrAjV9yQ$default(Animatable animatable, float f10, Interaction interaction, Interaction interaction2, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interaction = null;
        }
        if ((i10 & 4) != 0) {
            interaction2 = null;
        }
        return m29515animateElevationrAjV9yQ(animatable, f10, interaction, interaction2, interfaceC11588c);
    }
}
