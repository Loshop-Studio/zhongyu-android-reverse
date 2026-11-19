package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.unit.IntOffset;

/* renamed from: androidx.compose.foundation.lazy.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0673a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ Modifier m224a(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i4 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11634boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
    }

    /* renamed from: b */
    public static /* synthetic */ Modifier m225b(LazyItemScope lazyItemScope, Modifier modifier, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f4);
    }

    /* renamed from: c */
    public static /* synthetic */ Modifier m226c(LazyItemScope lazyItemScope, Modifier modifier, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f4);
    }

    /* renamed from: d */
    public static /* synthetic */ Modifier m227d(LazyItemScope lazyItemScope, Modifier modifier, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f4);
    }
}
