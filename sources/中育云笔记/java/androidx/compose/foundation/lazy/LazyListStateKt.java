package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final LazyListMeasureResult EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
        private final Map<AlignmentLine, Integer> alignmentLines = AbstractC9925a.m20088h();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public void placeChildren() {
        }
    }, 0.0f, false, AbstractC10006d.m20744a(EmptyCoroutineContext.f23351c), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), AbstractC10978w.m24136n(), 0, 0, 0, false, Orientation.Vertical, 0, 0, null);
    private static final int NumberOfItemsToTeleport = 100;

    @Composable
    public static final LazyListState rememberLazyListState(final int i10, final int i11, Composer composer, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:74)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyListState invoke() {
                    return new LazyListState(i10, i11);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final LazyListState rememberLazyListState(int i10, int i11, LazyListPrefetchStrategy lazyListPrefetchStrategy, Composer composer, int i12, int i13) {
        final LazyListPrefetchStrategy lazyListPrefetchStrategy2;
        final int i14 = (i13 & 1) != 0 ? 0 : i10;
        final int i15 = (i13 & 2) != 0 ? 0 : i11;
        if ((i13 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            lazyListPrefetchStrategy2 = (LazyListPrefetchStrategy) objRememberedValue;
        } else {
            lazyListPrefetchStrategy2 = lazyListPrefetchStrategy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:98)");
        }
        Object[] objArr = {lazyListPrefetchStrategy2};
        Saver<LazyListState, ?> saverSaver$foundation_release = LazyListState.Companion.saver$foundation_release(lazyListPrefetchStrategy2);
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i14)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i15)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changedInstance(lazyListPrefetchStrategy2)) || (i12 & 384) == 256);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyListState invoke() {
                    return new LazyListState(i14, i15, lazyListPrefetchStrategy2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saverSaver$foundation_release, (String) null, (InterfaceC9529a) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }
}
