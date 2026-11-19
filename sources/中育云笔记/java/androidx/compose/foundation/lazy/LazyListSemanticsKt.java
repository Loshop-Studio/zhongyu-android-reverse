package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState lazyListState, boolean z10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(z10)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z10);
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutSemanticState;
    }
}
