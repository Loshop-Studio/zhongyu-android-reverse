package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material3.MenuKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/foundation/interaction/Interaction;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Ld6/s;", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lh6/c;)Ljava/lang/Object;", "animateElevation", "Landroidx/compose/animation/core/Easing;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/Easing;", "Landroidx/compose/animation/core/TweenSpec;", "DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ElevationKt {

    @NotNull
    private static final TweenSpec<C2331Dp> DefaultIncomingSpec;

    @NotNull
    private static final TweenSpec<C2331Dp> DefaultOutgoingSpec;

    @NotNull
    private static final TweenSpec<C2331Dp> HoveredOutgoingSpec;

    @NotNull
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(MenuKt.InTransitionDuration, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec<>(150, 0, cubicBezierEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec<>(MenuKt.InTransitionDuration, 0, cubicBezierEasing, 2, null);
    }

    @Nullable
    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m9319animateElevationrAjV9yQ(@NotNull Animatable<C2331Dp, ?> animatable, float f, @Nullable Interaction interaction, @Nullable Interaction interaction2, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        AnimationSpec<C2331Dp> animationSpecIncomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        C5443s c5443s = C5443s.f8405a;
        if (animationSpecIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, C2331Dp.m13303boximpl(f), animationSpecIncomingAnimationSpecForInteraction, null, null, interfaceC5631c, 12, null);
            return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : c5443s;
        }
        Object objSnapTo = animatable.snapTo(C2331Dp.m13303boximpl(f), interfaceC5631c);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : c5443s;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m9320animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m9319animateElevationrAjV9yQ(animatable, f, interaction, interaction2, interfaceC5631c);
    }
}
