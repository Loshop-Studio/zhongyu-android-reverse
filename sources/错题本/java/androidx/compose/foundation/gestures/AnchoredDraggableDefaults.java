package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "positionalThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lr6/c;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "SnapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "PositionalThreshold", "Lr6/c;", "getPositionalThreshold", "()Lr6/c;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "DecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1753:1\n75#2:1754\n1247#3,6:1755\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n*L\n1522#1:1754\n1523#1:1755,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {

    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    @NotNull
    private static final AnimationSpec<Float> SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);

    @NotNull
    private static final InterfaceC6471c PositionalThreshold = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$PositionalThreshold$1
        public final Float invoke(float f) {
            return Float.valueOf(f / 2.0f);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    };

    @NotNull
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    private AnchoredDraggableDefaults() {
    }

    @Composable
    @NotNull
    public final <T> TargetedFlingBehavior flingBehavior(@NotNull AnchoredDraggableState<T> anchoredDraggableState, @Nullable InterfaceC6471c interfaceC6471c, @Nullable AnimationSpec<Float> animationSpec, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            interfaceC6471c = PositionalThreshold;
        }
        if ((i8 & 4) != 0) {
            animationSpec = SnapAnimationSpec;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952742024, i, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1520)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i & 6) == 4) | composer.changed(density) | ((((i & 112) ^ 48) > 32 && composer.changed(interfaceC6471c)) || (i & 48) == 32) | composer.changed(animationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, interfaceC6471c, animationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    @NotNull
    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    @NotNull
    public final InterfaceC6471c getPositionalThreshold() {
        return PositionalThreshold;
    }

    @NotNull
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }
}
