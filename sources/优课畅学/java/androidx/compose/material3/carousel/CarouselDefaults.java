package androidx.compose.material3.carousel;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class CarouselDefaults {
    public static final int $stable = 0;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    public static final CarouselDefaults INSTANCE = new CarouselDefaults();
    private static final float MinSmallItemSize = C3156Dp.m26899constructorimpl(40);
    private static final float MaxSmallItemSize = C3156Dp.m26899constructorimpl(56);
    private static final float AnchorSize = C3156Dp.m26899constructorimpl(10);

    private CarouselDefaults() {
    }

    /* renamed from: getAnchorSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m22888getAnchorSizeD9Ej5fM$material3_release() {
        return AnchorSize;
    }

    /* renamed from: getMaxSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m22889getMaxSmallItemSizeD9Ej5fM$material3_release() {
        return MaxSmallItemSize;
    }

    /* renamed from: getMinSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m22890getMinSmallItemSizeD9Ej5fM$material3_release() {
        return MinSmallItemSize;
    }

    @Composable
    public final TargetedFlingBehavior multiBrowseFlingBehavior(CarouselState carouselState, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        DecayAnimationSpec<Float> decayAnimationSpec2 = decayAnimationSpec;
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105043293, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:644)");
        }
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3_release(), new PagerSnapDistance() { // from class: androidx.compose.material3.carousel.CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1
            @Override // androidx.compose.foundation.pager.PagerSnapDistance
            public int calculateTargetPage(int i12, int i13, float f10, int i14, int i15) {
                return i13;
            }
        }, decayAnimationSpec2, animationSpec2, 0.0f, composer, ((i10 << 3) & 8064) | (PagerDefaults.$stable << 15), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehaviorFlingBehavior;
    }

    @Composable
    public final TargetedFlingBehavior noSnapFlingBehavior(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-418415756, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:673)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f10) {
                    return 0.0f;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) objRememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehaviorRememberSnapFlingBehavior;
    }

    @Composable
    public final TargetedFlingBehavior singleAdvanceFlingBehavior(CarouselState carouselState, AnimationSpec<Float> animationSpec, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1701587199, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:611)");
        }
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3_release(), PagerSnapDistance.Companion.atMost(1), null, animationSpec2, 0.0f, composer, ((i10 << 6) & 7168) | (PagerDefaults.$stable << 15), 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehaviorFlingBehavior;
    }
}
