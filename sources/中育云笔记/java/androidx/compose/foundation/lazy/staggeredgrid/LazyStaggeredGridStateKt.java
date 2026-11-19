package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class LazyStaggeredGridStateKt {
    @Composable
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(final int i10, final int i11, Composer composer, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:76)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.Companion.getSaver();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyStaggeredGridState invoke() {
                    return new LazyStaggeredGridState(i10, i11);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridState;
    }
}
