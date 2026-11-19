package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC0506c;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.Remeasurement;
import androidx.compose.p006ui.layout.RemeasurementModifier;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DensityKt;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0092\u00012\u00020\u0001:\u0002\u0092\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ#\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u00032\b\b\u0002\u0010o\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010pJ\u0015\u0010q\u001a\u00020m2\u0006\u0010r\u001a\u00020sH\u0000¢\u0006\u0002\btJ\u0010\u0010u\u001a\u00020m2\u0006\u0010v\u001a\u00020>H\u0002J\u0016\u0010w\u001a\u00020m2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00030yH\u0002J\u0010\u0010z\u001a\u00020a2\u0006\u0010{\u001a\u00020aH\u0016J\u0018\u0010|\u001a\u00020\u00072\u0006\u0010}\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002J\u0010\u0010~\u001a\u00020m2\u0006\u0010{\u001a\u00020aH\u0002J\u0011\u0010\u007f\u001a\u00020a2\u0007\u0010\u0080\u0001\u001a\u00020aH\u0002JL\u0010\u0081\u0001\u001a\u00020m2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012-\u0010\u0084\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020m0\u0087\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u00010\u0085\u0001¢\u0006\u0003\b\u0089\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u008a\u0001J$\u0010\u008b\u0001\u001a\u00020m2\u0006\u0010n\u001a\u00020\u00032\b\b\u0002\u0010o\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010pJ\u0019\u0010\u008c\u0001\u001a\u00020m2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0000¢\u0006\u0003\b\u008f\u0001J$\u0010\u0090\u0001\u001a\u00020m*\u00030\u0086\u00012\u0006\u0010n\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u0091\u0001R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b(\u0010$R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u001a\u0010/\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R\u0014\u00102\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020>0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020HX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020LX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u00020QX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0010\"\u0004\bV\u0010\u0012R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u00020ZX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020^X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001e\u0010b\u001a\u00020a2\u0006\u0010\f\u001a\u00020a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u000e\u0010e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0093\u0001"}, m5175d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemOffset", "(II)V", "initialFirstVisibleItems", "", "initialFirstVisibleOffsets", "([I[I)V", "animateScrollScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentItemPrefetchHandles", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex$delegate", "Landroidx/compose/runtime/State;", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset$delegate", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "laneCount", "getLaneCount$foundation_release", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneWidthsPrefixSum", "getLaneWidthsPrefixSum$foundation_release", "()[I", "setLaneWidthsPrefixSum$foundation_release", "([I)V", "layoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "measurePassCount", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "prefetchBaseIndex", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "animateScrollToItem", "", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "clearLeftoverPrefetchHandles", "prefetchHandlesUsed", "", "dispatchRawDelta", "delta", "fillNearestIndices", "itemIndex", "notifyPrefetch", "onScroll", "distance", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "snapToItemInternal", "snapToItemInternal$foundation_release", "Companion", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n76#2:478\n76#2:479\n76#2:480\n102#2,2:481\n76#2:483\n102#2,2:484\n1855#3,2:486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n101#1:478\n115#1:479\n152#1:480\n152#1:481,2\n154#1:483\n154#1:484,2\n408#1:486,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private Density density;

    /* renamed from: firstVisibleItemIndex$delegate, reason: from kotlin metadata */
    private final State firstVisibleItemIndex;

    /* renamed from: firstVisibleItemScrollOffset$delegate, reason: from kotlin metadata */
    private final State firstVisibleItemScrollOffset;
    private boolean isVertical;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private int[] laneWidthsPrefixSum;
    private final MutableState<LazyStaggeredGridLayoutInfo> layoutInfoState;
    private int measurePassCount;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private LazyStaggeredGridSpanProvider spanProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<int[]> invoke(SaverScope listSaver, LazyStaggeredGridState state) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(state, "state");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new int[][]{state.getScrollPosition().getIndices(), state.getScrollPosition().getOffsets()});
        }
    }, new Function1<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyStaggeredGridState invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyStaggeredGridState invoke2(List<int[]> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyStaggeredGridState(it.get(0), it.get(1), null);
        }
    });

    @Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5175d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", m5192f = "LazyStaggeredGridState.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2 */
    public static final class C07722 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07722(int i4, int i5, Continuation<? super C07722> continuation) {
            super(2, continuation);
            this.$index = i4;
            this.$scrollOffset = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07722 c07722 = LazyStaggeredGridState.this.new C07722(this.$index, this.$scrollOffset, continuation);
            c07722.L$0 = obj;
            return c07722;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C07722) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release((ScrollScope) this.L$0, this.$index, this.$scrollOffset);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i4, int i5, Continuation continuation, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i4, i5, continuation);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo info) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1) {
            if (!visibleItemsInfo.isEmpty()) {
                int index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) visibleItemsInfo)).getIndex();
                int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) visibleItemsInfo)).getIndex();
                int i4 = this.prefetchBaseIndex;
                if (index <= i4 && i4 <= index2) {
                    return;
                }
                this.prefetchBaseIndex = -1;
                Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                while (it.hasNext()) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                }
                this.currentItemPrefetchHandles.clear();
            }
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> prefetchHandlesUsed) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!prefetchHandlesUsed.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int itemIndex, int laneCount) {
        int[] iArr = new int[laneCount];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(itemIndex)) {
            ArraysKt___ArraysJvmKt.fill$default(iArr, itemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int lane = this.laneInfo.getLane(itemIndex);
        int iMin = lane != -1 ? Math.min(lane, laneCount) : 0;
        int i4 = iMin - 1;
        int iFindPreviousItemIndex = itemIndex;
        while (true) {
            if (-1 >= i4) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i4);
            iArr[i4] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, i4, 2, (Object) null);
                break;
            }
            i4--;
        }
        iArr[iMin] = itemIndex;
        for (int i5 = iMin + 1; i5 < laneCount; i5++) {
            itemIndex = this.laneInfo.findNextItemIndex(itemIndex, i5);
            iArr[i5] = itemIndex;
        }
        return iArr;
    }

    private final void notifyPrefetch(float delta) {
        LazyStaggeredGridLayoutInfo value = this.layoutInfoState.getValue();
        if (!value.getVisibleItemsInfo().isEmpty()) {
            boolean z3 = delta < 0.0f;
            int index = z3 ? ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) value.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) value.getVisibleItemsInfo())).getIndex();
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = this.laneWidthsPrefixSum.length;
            for (int i4 = 0; i4 < length; i4++) {
                index = z3 ? this.laneInfo.findNextItemIndex(index, i4) : this.laneInfo.findPreviousItemIndex(index, i4);
                if (!(index >= 0 && index < value.getTotalItemsCount()) || linkedHashSet.contains(Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(index));
                if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                    boolean z4 = lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index);
                    int i5 = z4 ? 0 : i4;
                    int laneCount$foundation_release = z4 ? getLaneCount$foundation_release() : 1;
                    int[] iArr = this.laneWidthsPrefixSum;
                    int i6 = iArr[(laneCount$foundation_release + i5) - 1] - (i5 == 0 ? 0 : iArr[i5 - 1]);
                    this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m7518schedulePrefetch0kLqBqw(index, this.isVertical ? Constraints.INSTANCE.m11503fixedWidthOenEA2s(i6) : Constraints.INSTANCE.m11502fixedHeightOenEA2s(i6)));
                }
            }
            clearLeftoverPrefetchHandles(linkedHashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float distance) {
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f4 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f4;
        if (Math.abs(f4) > 0.5f) {
            float f5 = this.scrollToBeConsumed;
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (this.prefetchingEnabled) {
                notifyPrefetch(f5 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f6 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f6;
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i4, int i5, Continuation continuation, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i4, i5, continuation);
    }

    private void setCanScrollBackward(boolean z3) {
        this.canScrollBackward.setValue(Boolean.valueOf(z3));
    }

    private void setCanScrollForward(boolean z3) {
        this.canScrollForward.setValue(Boolean.valueOf(z3));
    }

    public final Object animateScrollToItem(int i4, int i5, Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i4, i5, continuation);
        return objAnimateScrollToItem == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.layoutInfoState.setValue(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        this.scrollPosition.updateFromMeasureResult(result);
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return ((Number) this.firstVisibleItemIndex.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset.getValue()).intValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        return this.laneWidthsPrefixSum.length;
    }

    /* renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneWidthsPrefixSum$foundation_release, reason: from getter */
    public final int[] getLaneWidthsPrefixSum() {
        return this.laneWidthsPrefixSum;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    /* renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* renamed from: getSpanProvider$foundation_release, reason: from getter */
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    public final Object scrollToItem(int i4, int i5, Continuation<? super Unit> continuation) {
        Object objM181e = AbstractC0506c.m181e(this, null, new C07722(i4, i5, null), continuation, 1, null);
        return objM181e == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM181e : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setLaneWidthsPrefixSum$foundation_release(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.laneWidthsPrefixSum = iArr;
    }

    public final void setMeasurePassCount$foundation_release(int i4) {
        this.measurePassCount = i4;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z3) {
        this.prefetchingEnabled = z3;
    }

    public final void setSpanProvider$foundation_release(LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z3) {
        this.isVertical = z3;
    }

    public final void snapToItemInternal$foundation_release(ScrollScope scrollScope, int i4, int i5) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i4);
        if (lazyStaggeredGridItemInfoFindVisibleItem != null) {
            boolean z3 = this.isVertical;
            long offset = lazyStaggeredGridItemInfoFindVisibleItem.getOffset();
            scrollScope.scrollBy((z3 ? IntOffset.m11644getYimpl(offset) : IntOffset.m11643getXimpl(offset)) + i5);
        } else {
            this.scrollPosition.requestPosition(i4, i5);
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.firstVisibleItemIndex = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemIndex$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                Integer num;
                int[] indices = this.this$0.getScrollPosition().getIndices();
                if (indices.length == 0) {
                    num = null;
                } else {
                    int i4 = indices[0];
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(indices)).iterator();
                    while (it.hasNext()) {
                        int i5 = indices[it.nextInt()];
                        if (i5 == -1) {
                            i5 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(i5);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                }
                Integer num2 = num;
                return Integer.valueOf(num2 != null ? num2.intValue() : 0);
            }
        });
        this.firstVisibleItemScrollOffset = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemScrollOffset$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                int[] offsets = this.this$0.getScrollPosition().getOffsets();
                LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
                int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
                int[] indices = lazyStaggeredGridState.getScrollPosition().getIndices();
                int length = offsets.length;
                int iMin = Integer.MAX_VALUE;
                for (int i4 = 0; i4 < length; i4++) {
                    if (indices[i4] == firstVisibleItemIndex) {
                        iMin = Math.min(iMin, offsets[i4]);
                    }
                }
                return Integer.valueOf(iMin != Integer.MAX_VALUE ? iMin : 0);
            }
        });
        this.scrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
            public /* synthetic */ boolean all(Function1 function1) {
                return AbstractC1267b.m309a(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
            public /* synthetic */ boolean any(Function1 function1) {
                return AbstractC1267b.m310b(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
            public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                return AbstractC1267b.m311c(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
            public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                return AbstractC1267b.m312d(this, obj, function2);
            }

            @Override // androidx.compose.p006ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                this.this$0.remeasurement = remeasurement;
            }

            @Override // androidx.compose.p006ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return AbstractC1266a.m307a(this, modifier);
            }
        };
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f4) {
                return Float.valueOf(-this.this$0.onScroll(-f4));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                return invoke(f4.floatValue());
            }
        });
        this.laneWidthsPrefixSum = new int[0];
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
    }

    public /* synthetic */ LazyStaggeredGridState(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }

    public LazyStaggeredGridState(int i4, int i5) {
        this(new int[]{i4}, new int[]{i5});
    }
}
