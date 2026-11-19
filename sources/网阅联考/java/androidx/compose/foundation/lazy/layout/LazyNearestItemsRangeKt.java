package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m5175d2 = {"calculateNearestItemsRange", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "", "slidingWindowSize", "extraItemCount", "rememberLazyNearestItemsRangeState", "Landroidx/compose/runtime/State;", "firstVisibleItemIndex", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyNearestItemsRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,89:1\n67#2,3:90\n66#2:93\n83#2,3:110\n1114#3,3:94\n1117#3,3:107\n1114#3,6:113\n480#4,4:97\n485#4:106\n122#5,5:101\n*S KotlinDebug\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n*L\n47#1:90,3\n47#1:93\n59#1:110,3\n47#1:94,3\n47#1:107,3\n59#1:113,6\n48#1:97,4\n48#1:106\n48#1:101,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyNearestItemsRangeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange calculateNearestItemsRange(int i4, int i5, int i6) {
        int i7 = (i4 / i5) * i5;
        return RangesKt___RangesKt.until(Math.max(i7 - i6, 0), i7 + i5 + i6);
    }

    @Composable
    @ExperimentalFoundationApi
    public static final State<IntRange> rememberLazyNearestItemsRangeState(Function0<Integer> firstVisibleItemIndex, Function0<Integer> slidingWindowSize, Function0<Integer> extraItemCount, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(firstVisibleItemIndex, "firstVisibleItemIndex");
        Intrinsics.checkNotNullParameter(slidingWindowSize, "slidingWindowSize");
        Intrinsics.checkNotNullParameter(extraItemCount, "extraItemCount");
        composer.startReplaceableGroup(429733345);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(429733345, i4, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(firstVisibleItemIndex) | composer.changed(slidingWindowSize) | composer.changed(extraItemCount);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateNearestItemsRange(firstVisibleItemIndex.invoke().intValue(), slidingWindowSize.invoke().intValue(), extraItemCount.invoke().intValue()), null, 2, null);
                    snapshotCreateNonObservableSnapshot.dispose();
                    composer.updateRememberedValue(objMutableStateOf$default);
                    objRememberedValue = objMutableStateOf$default;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th;
            }
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Object[] objArr = {firstVisibleItemIndex, slidingWindowSize, extraItemCount, mutableState};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged2 = false;
        for (int i5 = 0; i5 < 4; i5++) {
            zChanged2 |= composer.changed(objArr[i5]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(firstVisibleItemIndex, slidingWindowSize, extraItemCount, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(mutableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
