package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "BeyondViewportPageCount", "", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapPositionalThreshold", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,592:1\n96#2,5:593\n75#3:598\n75#3:599\n1247#4,6:600\n1247#4,6:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n385#1:593,5\n389#1:598\n390#1:599\n391#1:600,6\n434#1:606,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    @Composable
    public final TargetedFlingBehavior flingBehavior(final PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) final float f10, Composer composer, int i10, int i11) {
        boolean z9 = true;
        if ((i11 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.INSTANCE.atMost(1);
        }
        if ((i11 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i11 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10);
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i10 & 6) == 4) | composer.changed(decayAnimationSpec) | composer.changed(animationSpec);
        if ((((i10 & 112) ^ 48) <= 32 || !composer.changed(pagerSnapDistance)) && (i10 & 48) != 32) {
            z9 = false;
        }
        boolean zChanged2 = zChanged | z9 | composer.changed(obj) | composer.changed(layoutDirection);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, new Function3<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12, Float f13) {
                    return invoke(f11.floatValue(), f12.floatValue(), f13.floatValue());
                }

                public final Float invoke(float f11, float f12, float f13) {
                    return Float.valueOf(PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(pagerState, layoutDirection, f10, f11, f12, f13));
                }
            }), decayAnimationSpec, animationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    @Composable
    public final NestedScrollConnection pageNestedScrollConnection(PagerState pagerState, Orientation orientation, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z9 = ((((i10 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(orientation)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerNestedScrollConnection;
    }
}
