package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.AbstractC0506c;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.stateless.C3469b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m5174d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00032\b\b\u0002\u0010w\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010xJ\u0015\u0010y\u001a\u00020u2\u0006\u0010z\u001a\u00020{H\u0000¢\u0006\u0002\b|J\u0010\u0010}\u001a\u00020u2\u0006\u0010~\u001a\u000204H\u0002J\u0011\u0010\u007f\u001a\u00020i2\u0007\u0010\u0080\u0001\u001a\u00020iH\u0016J\u0012\u0010\u0081\u0001\u001a\u00020u2\u0007\u0010\u0080\u0001\u001a\u00020iH\u0002J\u0018\u0010\u0082\u0001\u001a\u00020i2\u0007\u0010\u0083\u0001\u001a\u00020iH\u0000¢\u0006\u0003\b\u0084\u0001JL\u0010\u0085\u0001\u001a\u00020u2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012-\u0010\u0088\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020u0\u008b\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008c\u00010\u0089\u0001¢\u0006\u0003\b\u008d\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u008e\u0001J$\u0010\u008f\u0001\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00032\b\b\u0002\u0010w\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010xJ\u001f\u0010\u0090\u0001\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00032\u0006\u0010w\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020u2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0000¢\u0006\u0003\b\u0095\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001c8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R+\u0010/\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0014\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020408X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R/\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\f\u001a\u0004\u0018\u00010@8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u0014\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0088\u0001\u0010O\u001a/\u0012\u0013\u0012\u00110H¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020N0M0L0G23\u0010\f\u001a/\u0012\u0013\u0012\u00110H¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020N0M0L0G8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bT\u0010\u0014\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020VX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0010\"\u0004\b[\u0010\u0012R/\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010\f\u001a\u0004\u0018\u00010\\8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\u0014\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u000e\u0010g\u001a\u00020hX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010j\u001a\u00020i2\u0006\u0010\f\u001a\u00020i@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u000e\u0010m\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\u0014\u001a\u0004\bo\u0010$\"\u0004\bp\u0010qR\u000e\u0010s\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0097\u0001"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "(II)V", "animateScrollScope", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "getFirstVisibleItemIndex", "()I", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "isVertical$delegate", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "lineToPrefetch", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;)V", "placementAnimator$delegate", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever$delegate", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "slotsPerLine", "getSlotsPerLine$foundation_release", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine$delegate", "wasScrollingForward", "animateScrollToItem", "", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "notifyPrefetch", "onScroll", "distance", "onScroll$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "snapToItemIndexInternal", "snapToItemIndexInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "Companion", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,460:1\n1182#2:461\n1161#2,2:462\n76#3:464\n102#3,2:465\n76#3:467\n102#3,2:468\n76#3:470\n102#3,2:471\n76#3:473\n102#3,2:474\n76#3:476\n102#3,2:477\n76#3:479\n102#3,2:480\n76#3:482\n102#3,2:483\n76#3:485\n102#3,2:486\n460#4,11:488\n460#4,11:505\n33#5,6:499\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n191#1:461\n191#1:462,2\n151#1:464\n151#1:465,2\n156#1:467\n156#1:468,2\n161#1:470\n161#1:471,2\n203#1:473\n203#1:474,2\n224#1:476\n224#1:477,2\n226#1:479\n226#1:480,2\n283#1:482\n283#1:483,2\n285#1:485\n285#1:486,2\n354#1:488,11\n381#1:505,11\n359#1:499,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Integer> invoke(SaverScope listSaver, LazyGridState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }, new Function1<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyGridState invoke2(List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    });
    private final LazyGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;

    /* renamed from: density$delegate, reason: from kotlin metadata */
    private final MutableState density;
    private final MutableInteractionSource internalInteractionSource;

    /* renamed from: isVertical$delegate, reason: from kotlin metadata */
    private final MutableState isVertical;
    private final MutableState<LazyGridLayoutInfo> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;

    /* renamed from: placementAnimator$delegate, reason: from kotlin metadata */
    private final MutableState placementAnimator;

    /* renamed from: prefetchInfoRetriever$delegate, reason: from kotlin metadata */
    private final MutableState prefetchInfoRetriever;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    private final MutableState slotsPerLine;
    private boolean wasScrollingForward;

    @Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.lazy.grid.LazyGridState", m5192f = "LazyGridState.kt", m5193i = {0, 0, 0}, m5194l = {C3469b.f2704a, 274}, m5195m = "scroll", m5196n = {"this", "scrollPriority", "block"}, m5197s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 */
    public static final class C07161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07161(Continuation<? super C07161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyGridState.this.scroll(null, null, this);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", m5192f = "LazyGridState.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2 */
    public static final class C07172 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07172(int i4, int i5, Continuation<? super C07172> continuation) {
            super(2, continuation);
            this.$index = i4;
            this.$scrollOffset = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyGridState.this.new C07172(this.$index, this.$scrollOffset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C07172) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LazyGridState.this.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridState() {
        int i4 = 0;
        this(i4, i4, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i4, int i5, Continuation continuation, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return lazyGridState.animateScrollToItem(i4, i5, continuation);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo info) {
        int row;
        if (this.lineToPrefetch == -1 || !(!info.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) info.getVisibleItemsInfo());
            row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) info.getVisibleItemsInfo());
            row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i4 = 0;
                do {
                    content[i4].cancel();
                    i4++;
                } while (i4 < size);
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    private final Remeasurement getRemeasurement() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    private final void notifyPrefetch(float delta) {
        int row;
        int index;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled) {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                boolean z3 = delta < 0.0f;
                if (z3) {
                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo());
                    row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                    index = ((LazyGridItemInfo) CollectionsKt___CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
                } else {
                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo());
                    row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                    index = ((LazyGridItemInfo) CollectionsKt___CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
                }
                if (row != this.lineToPrefetch) {
                    if (index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                        if (this.wasScrollingForward != z3 && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                            LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                            int i4 = 0;
                            do {
                                content[i4].cancel();
                                i4++;
                            } while (i4 < size);
                        }
                        this.wasScrollingForward = z3;
                        this.lineToPrefetch = row;
                        this.currentLinePrefetchHandles.clear();
                        List<Pair<Integer, Constraints>> listInvoke = getPrefetchInfoRetriever$foundation_release().invoke(LineIndex.m7496boximpl(LineIndex.m7498constructorimpl(row)));
                        int size2 = listInvoke.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            Pair<Integer, Constraints> pair = listInvoke.get(i5);
                            this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m7518schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().getValue()));
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i4, int i5, Continuation continuation, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return lazyGridState.scrollToItem(i4, i5, continuation);
    }

    private void setCanScrollBackward(boolean z3) {
        this.canScrollBackward.setValue(Boolean.valueOf(z3));
    }

    private void setCanScrollForward(boolean z3) {
        this.canScrollForward.setValue(Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final Object animateScrollToItem(int i4, int i5, Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i4, i5, continuation);
        return objAnimateScrollToItem == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        LazyGridMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        setCanScrollBackward(((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? false : true);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
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

    public final Density getDensity$foundation_release() {
        return (Density) this.density.getValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m7487getIndexVZbfaAc();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator.getValue();
    }

    public final Function1<LineIndex, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever.getValue();
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

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSlotsPerLine$foundation_release() {
        return ((Number) this.slotsPerLine.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVertical$foundation_release() {
        return ((Boolean) this.isVertical.getValue()).booleanValue();
    }

    public final float onScroll$foundation_release(float distance) {
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
            Remeasurement remeasurement = getRemeasurement();
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState.C07161
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState.C07161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object scrollToItem(int i4, int i5, Continuation<? super Unit> continuation) {
        Object objM181e = AbstractC0506c.m181e(this, null, new C07172(i4, i5, null), continuation, 1, null);
        return objM181e == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM181e : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density.setValue(density);
    }

    public final void setPlacementAnimator$foundation_release(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyGridItemPlacementAnimator);
    }

    public final void setPrefetchInfoRetriever$foundation_release(Function1<? super LineIndex, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever.setValue(function1);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z3) {
        this.prefetchingEnabled = z3;
    }

    public final void setSlotsPerLine$foundation_release(int i4) {
        this.slotsPerLine.setValue(Integer.valueOf(i4));
    }

    public final void setVertical$foundation_release(boolean z3) {
        this.isVertical.setValue(Boolean.valueOf(z3));
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.m7488requestPositionyO3Fmg4(ItemIndex.m7450constructorimpl(index), scrollOffset);
        LazyGridItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement = getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    public LazyGridState(int i4, int i5) {
        this.scrollPosition = new LazyGridScrollPosition(i4, i5);
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), null, 2, null);
        this.isVertical = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f4) {
                return Float.valueOf(-this.this$0.onScroll$foundation_release(-f4));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                return invoke(f4.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
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
                this.this$0.setRemeasurement(remeasurement);
            }

            @Override // androidx.compose.p006ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return AbstractC1266a.m307a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function1<LineIndex, List<? extends Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                return m7490invokebKFJvoY(lineIndex.m7508unboximpl());
            }

            /* renamed from: invoke-bKFJvoY, reason: not valid java name */
            public final List<Pair<Integer, Constraints>> m7490invokebKFJvoY(int i6) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }, null, 2, null);
        this.placementAnimator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }
}
