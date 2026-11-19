package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.geometry.Rect;

@ExperimentalSharedTransitionApi
/* loaded from: classes.dex */
public interface BoundsTransform {
    FiniteAnimationSpec<Rect> transform(Rect rect, Rect rect2);
}
