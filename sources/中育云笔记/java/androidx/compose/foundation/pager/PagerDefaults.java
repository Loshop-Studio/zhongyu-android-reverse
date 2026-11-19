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
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.C9978t;
import p181hd.InterfaceC9545q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    @Composable
    public final TargetedFlingBehavior flingBehavior(final PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) final float f10, Composer composer, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.Companion.atMost(1);
        }
        if ((i11 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i11 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(C9978t.f23425a)), 1, null);
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
            z10 = false;
        }
        boolean zChanged2 = zChanged | z10 | composer.changed(obj) | composer.changed(layoutDirection);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, new InterfaceC9545q() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue(), ((Number) obj4).floatValue());
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
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(orientation)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
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
