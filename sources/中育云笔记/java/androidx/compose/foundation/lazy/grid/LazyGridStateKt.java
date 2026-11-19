package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyGridStateKt {
    private static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
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
        };
        List listM24136n = AbstractC10978w.m24136n();
        Orientation orientation = Orientation.Vertical;
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, 0.0f, measureResult, 0.0f, false, AbstractC10006d.m20744a(EmptyCoroutineContext.f23351c), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$2
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final List<Pair<Integer, Constraints>> invoke(int i10) {
                return AbstractC10978w.m24136n();
            }
        }, listM24136n, 0, 0, 0, false, orientation, 0, 0);
    }

    @Composable
    public static final LazyGridState rememberLazyGridState(final int i10, final int i11, Composer composer, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:74)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyGridState, ?> saver = LazyGridState.Companion.getSaver();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyGridState invoke() {
                    return new LazyGridState(i10, i11);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final LazyGridState rememberLazyGridState(int i10, int i11, LazyGridPrefetchStrategy lazyGridPrefetchStrategy, Composer composer, int i12, int i13) {
        final LazyGridPrefetchStrategy lazyGridPrefetchStrategy2;
        final int i14 = (i13 & 1) != 0 ? 0 : i10;
        final int i15 = (i13 & 2) != 0 ? 0 : i11;
        if ((i13 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            lazyGridPrefetchStrategy2 = (LazyGridPrefetchStrategy) objRememberedValue;
        } else {
            lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20335728, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:98)");
        }
        Object[] objArr = {lazyGridPrefetchStrategy2};
        Saver<LazyGridState, ?> saverSaver$foundation_release = LazyGridState.Companion.saver$foundation_release(lazyGridPrefetchStrategy2);
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && composer.changed(i14)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i15)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changedInstance(lazyGridPrefetchStrategy2)) || (i12 & 384) == 256);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LazyGridState invoke() {
                    return new LazyGridState(i14, i15, lazyGridPrefetchStrategy2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        LazyGridState lazyGridState = (LazyGridState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saverSaver$foundation_release, (String) null, (InterfaceC9529a) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }
}
