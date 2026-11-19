package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class ScrollKt {
    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11) {
        return scroll$default(modifier, scrollState, z11, flingBehavior, z10, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return horizontalScroll(modifier, scrollState, z10, flingBehavior, z11);
    }

    @Composable
    public static final ScrollState rememberScrollState(final int i10, Composer composer, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        if ((((i11 & 14) ^ 6) <= 4 || !composer.changed(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC10559a() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final ScrollState invoke() {
                    return new ScrollState(i10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m23818rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC10559a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, boolean z12, boolean z13, OverscrollEffect overscrollEffect) {
        return ScrollingContainerKt.scrollingContainer(modifier, scrollState, z12 ? Orientation.Vertical : Orientation.Horizontal, z11, z10, flingBehavior, scrollState.getInternalInteractionSource$foundation_release(), z13, overscrollEffect, (256 & 256) != 0 ? null : null).then(new ScrollingLayoutElement(scrollState, z10, z12));
    }

    public static /* synthetic */ Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, boolean z12, boolean z13, OverscrollEffect overscrollEffect, int i10, Object obj) {
        return scroll(modifier, scrollState, z10, flingBehavior, z11, z12, z13, (i10 & 64) != 0 ? null : overscrollEffect);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11) {
        return scroll$default(modifier, scrollState, z11, flingBehavior, z10, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return verticalScroll(modifier, scrollState, z10, flingBehavior, z11);
    }

    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, boolean z11) {
        return scroll(modifier, scrollState, z11, flingBehavior, z10, false, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return horizontalScroll(modifier, scrollState, overscrollEffect, z12, flingBehavior2, z11);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, boolean z11) {
        return scroll(modifier, scrollState, z11, flingBehavior, z10, true, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return verticalScroll(modifier, scrollState, overscrollEffect, z12, flingBehavior2, z11);
    }
}
