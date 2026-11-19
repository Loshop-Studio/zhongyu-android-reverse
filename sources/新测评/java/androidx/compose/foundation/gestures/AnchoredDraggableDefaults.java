package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0002\u0010\u001aR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m13558d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "()V", "DecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "PositionalThreshold", "Lkotlin/Function1;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function1;", "SnapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", ExifInterface.GPS_DIRECTION_TRUE, "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "positionalThreshold", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "animationSpec", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1753:1\n75#2:1754\n1247#3,6:1755\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n*L\n1522#1:1754\n1523#1:1755,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final AnimationSpec<Float> SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
    private static final Function1<Float, Float> PositionalThreshold = new Function1<Float, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$PositionalThreshold$1
        public final Float invoke(float f10) {
            return Float.valueOf(f10 / 2.0f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }
    };
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    private AnchoredDraggableDefaults() {
    }

    @Composable
    public final <T> TargetedFlingBehavior flingBehavior(AnchoredDraggableState<T> anchoredDraggableState, Function1<? super Float, Float> function1, AnimationSpec<Float> animationSpec, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = PositionalThreshold;
        }
        if ((i11 & 4) != 0) {
            animationSpec = SnapAnimationSpec;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952742024, i10, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1520)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i10 & 6) == 4) | composer.changed(density) | ((((i10 & 112) ^ 48) > 32 && composer.changed(function1)) || (i10 & 48) == 32) | composer.changed(animationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, function1, animationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    public final Function1<Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }
}
