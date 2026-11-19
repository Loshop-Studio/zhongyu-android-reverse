package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.Stable;

@Stable
@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridItemScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i10, Object obj) {
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
        return lazyStaggeredGridItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    Modifier animateItem(Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3);
}
