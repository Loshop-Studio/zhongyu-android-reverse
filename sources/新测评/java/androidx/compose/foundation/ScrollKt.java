package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a<\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001aJ\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a<\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a2\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b¨\u0006\u0014"}, m13558d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "isVertical", "useLocalOverscrollFactory", "verticalScroll", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n1247#2,6:486\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n70#1:486,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollKt {
    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10) {
        return scroll$default(modifier, scrollState, z10, flingBehavior, z9, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return horizontalScroll(modifier, scrollState, z9, flingBehavior, z10);
    }

    @Composable
    public static final ScrollState rememberScrollState(final int i10, Composer composer, int i11, int i12) {
        boolean z9 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.INSTANCE.getSaver();
        if ((((i11 & 14) ^ 6) <= 4 || !composer.changed(i10)) && (i11 & 6) != 4) {
            z9 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ScrollState invoke() {
                    return new ScrollState(i10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m20533rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10, boolean z11, boolean z12, OverscrollEffect overscrollEffect) {
        return ScrollingContainerKt.scrollingContainer(modifier, scrollState, z11 ? Orientation.Vertical : Orientation.Horizontal, z10, z9, flingBehavior, scrollState.getInternalInteractionSource(), z12, overscrollEffect, (256 & 256) != 0 ? null : null).then(new ScrollingLayoutElement(scrollState, z9, z11));
    }

    public static /* synthetic */ Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10, boolean z11, boolean z12, OverscrollEffect overscrollEffect, int i10, Object obj) {
        return scroll(modifier, scrollState, z9, flingBehavior, z10, z11, z12, (i10 & 64) != 0 ? null : overscrollEffect);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10) {
        return scroll$default(modifier, scrollState, z10, flingBehavior, z9, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z9, FlingBehavior flingBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return verticalScroll(modifier, scrollState, z9, flingBehavior, z10);
    }

    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z9, FlingBehavior flingBehavior, boolean z10) {
        return scroll(modifier, scrollState, z10, flingBehavior, z9, false, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z9, FlingBehavior flingBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        boolean z11 = z9;
        if ((i10 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return horizontalScroll(modifier, scrollState, overscrollEffect, z11, flingBehavior2, z10);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z9, FlingBehavior flingBehavior, boolean z10) {
        return scroll(modifier, scrollState, z10, flingBehavior, z9, true, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z9, FlingBehavior flingBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        boolean z11 = z9;
        if ((i10 & 8) != 0) {
            flingBehavior = null;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return verticalScroll(modifier, scrollState, overscrollEffect, z11, flingBehavior2, z10);
    }
}
