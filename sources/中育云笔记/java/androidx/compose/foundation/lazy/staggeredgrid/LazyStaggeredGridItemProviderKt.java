package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.PropertyReference0Impl;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10479m;

/* loaded from: classes.dex */
public final class LazyStaggeredGridItemProviderKt {
    @Composable
    public static final InterfaceC9529a rememberStaggeredGridItemProviderLambda(final LazyStaggeredGridState lazyStaggeredGridState, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(690901732, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:39)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9540l, composer, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyStaggeredGridIntervalContent invoke() {
                    return new LazyStaggeredGridIntervalContent(stateRememberUpdatedState.getValue());
                }
            });
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyStaggeredGridItemProviderImpl invoke() {
                    LazyStaggeredGridIntervalContent value = stateDerivedStateOf.getValue();
                    return new LazyStaggeredGridItemProviderImpl(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap(lazyStaggeredGridState.getNearestRange$foundation_release(), value));
                }
            });
            objRememberedValue = new PropertyReference0Impl(stateDerivedStateOf2) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, p280od.InterfaceC10479m
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC10479m interfaceC10479m = (InterfaceC10479m) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC10479m;
    }
}
