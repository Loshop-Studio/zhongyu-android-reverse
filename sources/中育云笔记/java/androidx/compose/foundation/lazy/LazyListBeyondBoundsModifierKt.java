package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    public static final LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState(LazyListState lazyListState, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(i10)) || (i11 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyListBeyondBoundsState(lazyListState, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListBeyondBoundsState;
    }
}
