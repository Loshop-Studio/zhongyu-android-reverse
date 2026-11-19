package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.p013ui.layout.Remeasurement;
import androidx.compose.p013ui.layout.RemeasurementModifier;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Stable
@Metadata(m13557d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¨\u00012\u00020\u0001:\u0002¨\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B!\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\"\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0081\u0001J,\u0010\u0082\u0001\u001a\u00020~2\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020\u001b2\t\b\u0002\u0010\u0085\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u00020~2\u0007\u0010\u0088\u0001\u001a\u00020FH\u0002J\u0019\u0010\u0089\u0001\u001a\u00020~2\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u008b\u0001H\u0002J\u0012\u0010\u008c\u0001\u001a\u00020t2\u0007\u0010\u008d\u0001\u001a\u00020tH\u0016J\u001a\u0010\u008e\u0001\u001a\u00020\u00072\u0007\u0010\u008f\u0001\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0003H\u0002J\u001d\u0010\u0090\u0001\u001a\u00020~2\u0007\u0010\u008d\u0001\u001a\u00020t2\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u000fH\u0002J\u0012\u0010\u0091\u0001\u001a\u00020t2\u0007\u0010\u0092\u0001\u001a\u00020tH\u0002J\u001c\u0010\u0093\u0001\u001a\u00020~2\b\b\u0001\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003JI\u0010\u0094\u0001\u001a\u00020~2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012-\u0010\u0097\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020~0\u009a\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u009b\u00010\u0098\u0001¢\u0006\u0003\b\u009c\u0001H\u0096@¢\u0006\u0003\u0010\u009d\u0001J\u0017\u0010{\u001a\u00020t2\u0007\u0010\u0084\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u009e\u0001J#\u0010\u009f\u0001\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0081\u0001J)\u0010 \u0001\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u00032\u0007\u0010¡\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b¢\u0001J\"\u0010£\u0001\u001a\u00020\u00072\b\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010¦\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b§\u0001R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001e\u0010/\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010,R\u0014\u0010=\u001a\u00020>X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001eR\u0014\u0010C\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001eR\u0011\u0010E\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u00020PX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001b\u0010W\u001a\u00020X8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b[\u0010\\*\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020^X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001c\u0010a\u001a\u00020PX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\bb\u0010RR\u000e\u0010c\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001e\"\u0004\bj\u0010 R\"\u0010l\u001a\u0004\u0018\u00010k2\b\u0010\u000e\u001a\u0004\u0018\u00010k@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020pX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020xX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u000e\u0010{\u001a\u00020tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, m13558d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemOffset", "(II)V", "initialFirstVisibleItems", "", "initialFirstVisibleOffsets", "prefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "_lazyLayoutScrollDeltaBetweenPasses", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "<set-?>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "approachLayoutInfo", "getApproachLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentItemPrefetchHandles", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "hasLookaheadOccurred", "getHasLookaheadOccurred$foundation_release", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "laneCount", "getLaneCount$foundation_release", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "layoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "measurePassCount", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "measurementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "prefetchBaseIndex", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollDeltaBetweenPasses", "", "getScrollDeltaBetweenPasses$foundation_release", "()F", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollToBeConsumed", "scrollableState", "animateScrollToItem", "", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "clearLeftoverPrefetchHandles", "prefetchHandlesUsed", "", "dispatchRawDelta", "delta", "fillNearestIndices", "itemIndex", "notifyPrefetch", "onScroll", "distance", "requestScrollToItem", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToBeConsumed$foundation_release", "scrollToItem", "snapToItemInternal", "forceRemeasure", "snapToItemInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "Companion", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n85#2:640\n113#2,2:641\n85#2:643\n113#2,2:644\n85#2:646\n50#3,5:647\n96#3,5:654\n1855#4,2:652\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n157#1:640\n157#1:641,2\n160#1:643\n160#1:644,2\n235#1:646\n267#1:647,5\n598#1:654,5\n535#1:652,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            return CollectionsKt.listOf((Object[]) new int[][]{lazyStaggeredGridState.getScrollPosition().getIndices(), lazyStaggeredGridState.getScrollPosition().getScrollOffsets()});
        }
    }, new Function1<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyStaggeredGridState invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyStaggeredGridState invoke2(List<int[]> list) {
            return new LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<Unit> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<Unit> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    @Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", m13596f = "LazyStaggeredGridState.kt", m13597i = {}, m13598l = {364}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2 */
    public static final class C15762 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
        final /* synthetic */ int $numOfItemsToTeleport;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15762(int i10, int i11, int i12, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, Continuation<? super C15762> continuation) {
            super(2, continuation);
            this.$index = i10;
            this.$scrollOffset = i11;
            this.$numOfItemsToTeleport = i12;
            this.$layoutInfo = lazyStaggeredGridMeasureResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C15762 c15762 = LazyStaggeredGridState.this.new C15762(this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, continuation);
            c15762.L$0 = obj;
            return c15762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C15762) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(LazyStaggeredGridState.this, (ScrollScope) this.L$0);
                int i11 = this.$index;
                int i12 = this.$scrollOffset;
                int i13 = this.$numOfItemsToTeleport;
                Density density = this.$layoutInfo.getDensity();
                this.label = 1;
                if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i11, i12, i13, density, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", m13596f = "LazyStaggeredGridState.kt", m13597i = {}, m13598l = {388}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1 */
    public static final class C15771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C15771(Continuation<? super C15771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyStaggeredGridState.this.new C15771(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LazyStaggeredGridState lazyStaggeredGridState = LazyStaggeredGridState.this;
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(lazyStaggeredGridState, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", m13596f = "LazyStaggeredGridState.kt", m13597i = {0, 0, 0}, m13598l = {251, 252}, m13599m = "scroll", m13600n = {"this", "scrollPriority", "block"}, m13601s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 */
    public static final class C15781 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C15781(Continuation<? super C15781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyStaggeredGridState.this.scroll(null, null, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", m13596f = "LazyStaggeredGridState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2 */
    public static final class C15792 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15792(int i10, int i11, Continuation<? super C15792> continuation) {
            super(2, continuation);
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyStaggeredGridState.this.new C15792(this.$index, this.$scrollOffset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C15792) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return Unit.INSTANCE;
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.p013ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f10) {
                return Float.valueOf(-this.this$0.onScroll(-f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m17863constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m17863constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i10, i11, continuation);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z9, z10);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo info) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first((List) visibleItemsInfo)).getIndex();
        int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt.last((List) visibleItemsInfo)).getIndex();
        int i10 = this.prefetchBaseIndex;
        if (index > i10 || i10 > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
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
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(itemIndex)) {
            ArraysKt.fill$default(iArr, itemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int lane = this.laneInfo.getLane(itemIndex);
        if (lane != -2 && lane != -1) {
            if ((lane >= 0 ? 1 : 0) == 0) {
                InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + lane + " instead.");
            }
            iMin = Math.min(lane, laneCount);
        }
        int i10 = iMin;
        int i11 = i10 - 1;
        int iFindPreviousItemIndex = itemIndex;
        while (true) {
            if (-1 >= i11) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i11);
            iArr[i11] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                ArraysKt.fill$default(iArr, -1, 0, i11, 2, (Object) null);
                break;
            }
            i11--;
        }
        iArr[i10] = itemIndex;
        for (int i12 = i10 + 1; i12 < laneCount; i12++) {
            itemIndex = this.laneInfo.findNextItemIndex(itemIndex, i12);
            iArr[i12] = itemIndex;
        }
        return iArr;
    }

    private final void notifyPrefetch(float delta, LazyStaggeredGridMeasureResult info) {
        int i10;
        if (!this.prefetchingEnabled || info.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z9 = delta < 0.0f;
        int index = z9 ? ((LazyStaggeredGridMeasuredItem) CollectionsKt.last((List) info.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) CollectionsKt.first((List) info.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = info.getSlots();
        int length = slots.getSizes().length;
        for (int i11 = 0; i11 < length; i11++) {
            index = z9 ? this.laneInfo.findNextItemIndex(index, i11) : this.laneInfo.findPreviousItemIndex(index, i11);
            if (index < 0 || index >= info.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                boolean zIsFullSpan = info.getSpanProvider().isFullSpan(index);
                int i12 = zIsFullSpan ? 0 : i11;
                int i13 = zIsFullSpan ? length : 1;
                if (i13 == 1) {
                    i10 = slots.getSizes()[i12];
                } else {
                    int i14 = slots.getPositions()[i12];
                    int i15 = (i12 + i13) - 1;
                    i10 = (slots.getPositions()[i15] + slots.getSizes()[i15]) - i14;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m17858schedulePrefetch0kLqBqw(index, info.getOrientation() == Orientation.Vertical ? Constraints.INSTANCE.m23526fixedWidthOenEA2s(i10) : Constraints.INSTANCE.m23525fixedHeightOenEA2s(i10)));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    public static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f10, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f10, lazyStaggeredGridMeasureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float distance) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = this.scrollToBeConsumed;
            int iRoundToInt = MathKt.roundToInt(f11);
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(iRoundToInt, !this.hasLookaheadOccurred);
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(iRoundToInt, true) : null;
                if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                } else {
                    lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m17867invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f11 - this.scrollToBeConsumed, lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f11 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i10, i11);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i10, i11, continuation);
    }

    private void setCanScrollBackward(boolean z9) {
        this.canScrollBackward.setValue(Boolean.valueOf(z9));
    }

    private void setCanScrollForward(boolean z9) {
        this.canScrollForward.setValue(Boolean.valueOf(z9));
    }

    public final Object animateScrollToItem(int i10, int i11, Continuation<? super Unit> continuation) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C15762(i10, i11, value.getSlots().getSizes().length * 100, value, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateScrollOffset(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    /* renamed from: getApproachLayoutInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
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

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    /* renamed from: getHasLookaheadOccurred$foundation_release, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final int getLaneCount$foundation_release() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    /* renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m17906getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    /* renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m17907getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation_release();
    }

    /* renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void requestScrollToItem(@androidx.annotation.IntRange(from = 0) int index, int scrollOffset) {
        if (isScrollInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new C15771(null), 3, null);
        }
        snapToItemInternal$foundation_release(index, scrollOffset, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C15781
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C15781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            goto L6b
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
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float scrollToBeConsumed$foundation_release(boolean isLookingAhead) {
        return (isLookingAhead || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : getScrollDeltaBetweenPasses$foundation_release();
    }

    public final Object scrollToItem(int i10, int i11, Continuation<? super Unit> continuation) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C15792(i10, i11, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public final void setMeasurePassCount$foundation_release(int i10) {
        this.measurePassCount = i10;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z9) {
        this.prefetchingEnabled = z9;
    }

    public final void snapToItemInternal$foundation_release(int index, int scrollOffset, boolean forceRemeasure) {
        boolean z9 = (this.scrollPosition.getIndex() == index && this.scrollPosition.getScrollOffset() == scrollOffset) ? false : true;
        if (z9) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, index);
        if (lazyStaggeredGridItemInfoFindVisibleItem == null || !z9) {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(index, scrollOffset);
        } else {
            int iM23690getYimpl = (value.getOrientation() == Orientation.Vertical ? IntOffset.m23690getYimpl(lazyStaggeredGridItemInfoFindVisibleItem.getOffset()) : IntOffset.m23689getXimpl(lazyStaggeredGridItemInfoFindVisibleItem.getOffset())) + scrollOffset;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = value.getFirstVisibleItemScrollOffsets()[i10] + iM23690getYimpl;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        }
        if (!forceRemeasure) {
            ObservableScopeInvalidator.m17867invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    public /* synthetic */ LazyStaggeredGridState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public LazyStaggeredGridState(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11}, null);
    }
}
