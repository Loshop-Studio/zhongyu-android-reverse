package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata(m13557d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\b*\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m13558d2 = {"DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/unit/Dp;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "OutgoingSpecEasing", "Landroidx/compose/animation/core/Easing;", "animateElevation", "", "Landroidx/compose/animation/core/Animatable;", TypedValues.AttributesType.S_TARGET, TypedValues.TransitionType.S_FROM, "Landroidx/compose/foundation/interaction/Interaction;", TypedValues.TransitionType.S_TO, "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ElevationKt {
    private static final TweenSpec<C3127Dp> DefaultIncomingSpec;
    private static final TweenSpec<C3127Dp> DefaultOutgoingSpec;
    private static final TweenSpec<C3127Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec<>(150, 0, cubicBezierEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec<>(120, 0, cubicBezierEasing, 2, null);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m19637animateElevationrAjV9yQ(Animatable<C3127Dp, ?> animatable, float f10, Interaction interaction, Interaction interaction2, Continuation<? super Unit> continuation) {
        AnimationSpec<C3127Dp> animationSpecIncomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        if (animationSpecIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, C3127Dp.m23559boximpl(f10), animationSpecIncomingAnimationSpecForInteraction, null, null, continuation, 12, null);
            return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
        }
        Object objSnapTo = animatable.snapTo(C3127Dp.m23559boximpl(f10), continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m19638animateElevationrAjV9yQ$default(Animatable animatable, float f10, Interaction interaction, Interaction interaction2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interaction = null;
        }
        if ((i10 & 4) != 0) {
            interaction2 = null;
        }
        return m19637animateElevationrAjV9yQ(animatable, f10, interaction, interaction2, continuation);
    }
}
