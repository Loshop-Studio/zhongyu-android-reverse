package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;

/* loaded from: classes.dex */
public final class ScrollingContainerKt {
    public static final Modifier scrollingContainer(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, boolean z12, OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec) {
        return ClipScrollableContainerKt.clipScrollableContainer(modifier, orientation).then(new ScrollingContainerElement(scrollableState, orientation, z10, z11, flingBehavior, mutableInteractionSource, bringIntoViewSpec, z12, overscrollEffect));
    }
}
