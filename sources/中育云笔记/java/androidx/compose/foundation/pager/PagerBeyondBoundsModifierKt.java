package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class PagerBeyondBoundsModifierKt {
    @Composable
    public static final LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState(PagerState pagerState, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(i10)) || (i11 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PagerBeyondBoundsState(pagerState, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        PagerBeyondBoundsState pagerBeyondBoundsState = (PagerBeyondBoundsState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pagerBeyondBoundsState;
    }
}
