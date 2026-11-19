package androidx.compose.foundation.lazy;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;

@LazyScopeMarker
@Stable
/* loaded from: classes.dex */
public interface LazyItemScope {

    public static final class DefaultImpls {
        @Deprecated
        public static Modifier animateItem(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
            return LazyItemScope.super.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec2 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec3 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return lazyItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f10);
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f10);
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f10);
    }

    default Modifier animateItem(Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return modifier;
    }

    Modifier fillParentMaxHeight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);

    Modifier fillParentMaxSize(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);

    Modifier fillParentMaxWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);
}
