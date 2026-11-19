.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/ScrollableState;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;

.field private static final Saver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final _lazyLayoutScrollDeltaBetweenPasses:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;

.field private approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

.field private final awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

.field private final beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

.field private final canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

.field private final canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

.field private final currentItemPrefetchHandles:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
            ">;"
        }
    .end annotation
.end field

.field private hasLookaheadOccurred:Z

.field private final itemAnimator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation
.end field

.field private final laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

.field private final layoutInfoState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
            ">;"
        }
    .end annotation
.end field

.field private measurePassCount:I

.field private final measurementScopeInvalidator:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;"
        }
    .end annotation
.end field

.field private final mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private final pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

.field private final placementScopeInvalidator:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;"
        }
    .end annotation
.end field

.field private prefetchBaseIndex:I

.field private final prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

.field private prefetchingEnabled:Z

.field private remeasurement:Landroidx/compose/ui/layout/Remeasurement;

.field private final remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

.field private final scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

.field private scrollToBeConsumed:F

.field private final scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Companion:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$1;

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$2;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$2;

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/ListSaverKt;->listSaver(Lhd/p;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 25
    filled-new-array {p1}, [I

    move-result-object p1

    .line 26
    filled-new-array {p2}, [I

    move-result-object p2

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;-><init>([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 24
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;-><init>(II)V

    return-void
.end method

.method public constructor <init>([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 3
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;-><init>(Ljava/lang/Object;)V

    .line 4
    invoke-direct {v0, p1, p2, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;-><init>([I[ILhd/p;)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 5
    invoke-static {}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt;->getEmptyLazyStaggeredGridLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object p1

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 6
    new-instance p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 8
    invoke-static {p1, p2, v1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 9
    new-instance p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$remeasurementModifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$remeasurementModifier$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 10
    new-instance p1, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 11
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 13
    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    invoke-direct {v2, p3, p2, v1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;-><init>(Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;Lhd/l;ILkotlin/jvm/internal/n;)V

    iput-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 14
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollableState$1;

    invoke-direct {p3, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollableState$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V

    invoke-static {p3}, Landroidx/compose/foundation/gestures/ScrollableStateKt;->ScrollableState(Lhd/l;)Landroidx/compose/foundation/gestures/ScrollableState;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    const/4 p3, -0x1

    .line 15
    iput p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 16
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 17
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 18
    new-instance p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    invoke-direct {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;-><init>()V

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 19
    new-instance p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->itemAnimator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 21
    invoke-static {p2, p1, p2}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->constructor-impl$default(Landroidx/compose/runtime/MutableState;ILkotlin/jvm/internal/n;)Landroidx/compose/runtime/MutableState;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 22
    invoke-static {p2, p1, p2}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->constructor-impl$default(Landroidx/compose/runtime/MutableState;ILkotlin/jvm/internal/n;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 23
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->_lazyLayoutScrollDeltaBetweenPasses:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;

    return-void
.end method

.method public static final synthetic access$fillNearestIndices(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;II)[I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->fillNearestIndices(II)[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getSaver$cp()Landroidx/compose/runtime/saveable/Saver;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$onScroll(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;F)F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->onScroll(F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$setRemeasurement$p(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic animateScrollToItem$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->animateScrollToItem(IILvc/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 24
    .line 25
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 34
    .line 35
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 40
    .line 41
    if-gt v0, v2, :cond_0

    .line 42
    .line 43
    if-gt v2, p1, :cond_0

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 71
    .line 72
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method private final clearLeftoverPrefetchHandles(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 38
    .line 39
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method private final fillNearestIndices(II)[I
    .locals 8

    .line 1
    new-array v0, p2, [I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getSpanProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x6

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    move v1, p1

    .line 26
    invoke-static/range {v0 .. v5}, Lrc/p;->D([IIIIILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 31
    .line 32
    add-int v2, p1, p2

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->ensureValidIndex(I)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, -0x2

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v6, 0x1

    .line 46
    const/4 v4, -0x1

    .line 47
    if-eq v1, v2, :cond_3

    .line 48
    .line 49
    if-eq v1, v4, :cond_3

    .line 50
    .line 51
    if-ltz v1, :cond_1

    .line 52
    .line 53
    move v3, v6

    .line 54
    :cond_1
    if-nez v3, :cond_2

    .line 55
    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v3, "Expected positive lane number, got "

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, " instead."

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :cond_3
    move v7, v3

    .line 86
    add-int/lit8 v1, v7, -0x1

    .line 87
    .line 88
    move v3, v1

    .line 89
    move v1, p1

    .line 90
    :goto_0
    if-ge v4, v3, :cond_5

    .line 91
    .line 92
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 93
    .line 94
    invoke-virtual {v2, v1, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    aput v1, v0, v3

    .line 99
    .line 100
    if-ne v1, v4, :cond_4

    .line 101
    .line 102
    const/4 v4, 0x2

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v1, -0x1

    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-static/range {v0 .. v5}, Lrc/p;->D([IIIIILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    add-int/lit8 v3, v3, -0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    :goto_1
    aput p1, v0, v7

    .line 114
    .line 115
    add-int/2addr v7, v6

    .line 116
    :goto_2
    if-ge v7, p2, :cond_6

    .line 117
    .line 118
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 119
    .line 120
    invoke-virtual {v1, p1, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findNextItemIndex(II)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    aput p1, v0, v7

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    return-object v0
.end method

.method private static getNearestRange$foundation_release$delegate(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private final notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_b

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    cmpg-float p1, p1, v0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-gez p1, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getVisibleItemsInfo()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    :goto_1
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 59
    .line 60
    if-ne v2, v3, :cond_2

    .line 61
    .line 62
    goto/16 :goto_a

    .line 63
    .line 64
    :cond_2
    iput v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 65
    .line 66
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getSlots()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    array-length v5, v5

    .line 80
    move v6, v0

    .line 81
    :goto_2
    if-ge v6, v5, :cond_a

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    iget-object v7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 86
    .line 87
    invoke-virtual {v7, v2, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findNextItemIndex(II)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    iget-object v7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 93
    .line 94
    invoke-virtual {v7, v2, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :goto_3
    if-ltz v2, :cond_a

    .line 99
    .line 100
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getTotalItemsCount()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-ge v2, v7, :cond_a

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    goto/16 :goto_9

    .line 117
    .line 118
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    iget-object v8, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 130
    .line 131
    invoke-interface {v8, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_5

    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_5
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getSpanProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_6

    .line 147
    .line 148
    move v8, v0

    .line 149
    goto :goto_4

    .line 150
    :cond_6
    move v8, v6

    .line 151
    :goto_4
    if-eqz v7, :cond_7

    .line 152
    .line 153
    move v7, v5

    .line 154
    goto :goto_5

    .line 155
    :cond_7
    move v7, v1

    .line 156
    :goto_5
    if-ne v7, v1, :cond_8

    .line 157
    .line 158
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    aget v7, v7, v8

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_8
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getPositions()[I

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    aget v9, v9, v8

    .line 170
    .line 171
    add-int/2addr v8, v7

    .line 172
    sub-int/2addr v8, v1

    .line 173
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getPositions()[I

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    aget v7, v7, v8

    .line 178
    .line 179
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    aget v8, v10, v8

    .line 184
    .line 185
    add-int/2addr v7, v8

    .line 186
    sub-int/2addr v7, v9

    .line 187
    :goto_6
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget-object v9, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 192
    .line 193
    if-ne v8, v9, :cond_9

    .line 194
    .line 195
    sget-object v8, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 196
    .line 197
    invoke-virtual {v8, v7}, Landroidx/compose/ui/unit/Constraints$Companion;->fixedWidth-OenEA2s(I)J

    .line 198
    .line 199
    .line 200
    move-result-wide v7

    .line 201
    goto :goto_7

    .line 202
    :cond_9
    sget-object v8, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 203
    .line 204
    invoke-virtual {v8, v7}, Landroidx/compose/ui/unit/Constraints$Companion;->fixedHeight-OenEA2s(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v7

    .line 208
    :goto_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    iget-object v10, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 213
    .line 214
    iget-object v11, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 215
    .line 216
    invoke-virtual {v11, v2, v7, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v10, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_a
    :goto_9
    invoke-direct {p0, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->clearLeftoverPrefetchHandles(Ljava/util/Set;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    :goto_a
    return-void
.end method

.method public static synthetic notifyPrefetch$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 6
    .line 7
    invoke-interface {p2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final onScroll(F)F
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getCanScrollForward()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    :cond_0
    cmpl-float v1, p1, v0

    .line 13
    .line 14
    if-lez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getCanScrollBackward()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    :cond_1
    return v0

    .line 23
    :cond_2
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    cmpg-float v1, v1, v2

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-gtz v1, :cond_3

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-nez v1, :cond_4

    .line 40
    .line 41
    const-string v1, "entered drag with non-zero pending scroll"

    .line 42
    .line 43
    invoke-static {v1}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_4
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 47
    .line 48
    add-float/2addr v1, p1

    .line 49
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    cmpl-float v1, v1, v2

    .line 56
    .line 57
    if-lez v1, :cond_a

    .line 58
    .line 59
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 60
    .line 61
    invoke-static {v1}, Ljd/c;->d(F)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    iget-object v5, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 66
    .line 67
    invoke-interface {v5}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 72
    .line 73
    iget-boolean v6, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 74
    .line 75
    xor-int/2addr v6, v3

    .line 76
    invoke-virtual {v5, v4, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->copyWithScrollDeltaWithoutRemeasure(IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_7

    .line 82
    .line 83
    iget-object v7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 84
    .line 85
    if-eqz v7, :cond_7

    .line 86
    .line 87
    if-eqz v7, :cond_5

    .line 88
    .line 89
    invoke-virtual {v7, v4, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->copyWithScrollDeltaWithoutRemeasure(IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    move-object v4, v6

    .line 95
    :goto_1
    if-eqz v4, :cond_6

    .line 96
    .line 97
    iput-object v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move-object v5, v6

    .line 101
    :cond_7
    :goto_2
    if-eqz v5, :cond_8

    .line 102
    .line 103
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 104
    .line 105
    invoke-virtual {p0, v5, v4, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZZ)V

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 109
    .line 110
    invoke-static {v3}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->invalidateScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 111
    .line 112
    .line 113
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 114
    .line 115
    sub-float/2addr v1, v3

    .line 116
    invoke-direct {p0, v1, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    iget-object v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 121
    .line 122
    if-eqz v3, :cond_9

    .line 123
    .line 124
    invoke-interface {v3}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 125
    .line 126
    .line 127
    :cond_9
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 128
    .line 129
    sub-float/2addr v1, v3

    .line 130
    const/4 v3, 0x2

    .line 131
    invoke-static {p0, v1, v6, v3, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_a
    :goto_3
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    cmpg-float v1, v1, v2

    .line 141
    .line 142
    if-gtz v1, :cond_b

    .line 143
    .line 144
    return p1

    .line 145
    :cond_b
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 146
    .line 147
    sub-float/2addr p1, v1

    .line 148
    iput v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 149
    .line 150
    return p1
.end method

.method public static synthetic requestScrollToItem$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IIILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->requestScrollToItem(II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic scrollToItem$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToItem(IILvc/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private setCanScrollBackward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private setCanScrollForward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final animateScrollToItem(IILvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v5, v1

    .line 8
    check-cast v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 9
    .line 10
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getSlots()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v1, v1

    .line 19
    mul-int/lit8 v4, v1, 0x64

    .line 20
    .line 21
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$animateScrollToItem$2;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v3, p2

    .line 26
    move-object v0, v2

    .line 27
    move v2, p1

    .line 28
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$animateScrollToItem$2;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IIILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    move-object v3, p3

    .line 35
    move-object v2, v0

    .line 36
    move-object v0, p0

    .line 37
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll$default(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v1, v0, :cond_0

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_0
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object v0
.end method

.method public final applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZZ)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 14
    .line 15
    :cond_1
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getConsumedScroll()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    iget-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getFirstVisibleItemScrollOffsets()[I

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p3, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateScrollOffset([I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 42
    .line 43
    invoke-virtual {p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateFromMeasureResult(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCanScrollBackward()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-direct {p0, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setCanScrollBackward(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCanScrollForward()Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-direct {p0, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setCanScrollForward(Z)V

    .line 61
    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    iget-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->_lazyLayoutScrollDeltaBetweenPasses:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getScrollBackAmount()F

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCoroutineScope()Lsd/i0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p2, p3, v1, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;->updateScrollDeltaForApproach$foundation_release(FLandroidx/compose/ui/unit/Density;Lsd/i0;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    .line 83
    .line 84
    add-int/2addr p1, v0

    .line 85
    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    .line 86
    .line 87
    return-void
.end method

.method public dispatchRawDelta(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getApproachLayoutInfo$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCanScrollBackward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public getCanScrollForward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final getFirstVisibleItemIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getFirstVisibleItemScrollOffset()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getScrollOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getHasLookaheadOccurred$foundation_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getInteractionSource()Landroidx/compose/foundation/interaction/InteractionSource;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->itemAnimator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLaneCount$foundation_release()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getSlots()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v0, v0

    .line 18
    return v0
.end method

.method public final getLaneInfo$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastScrolledBackward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->getLastScrolledBackward()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getLastScrolledForward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->getLastScrolledForward()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getMeasurePassCount$foundation_release()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMeasurementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMutableInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNearestRange$foundation_release()Lnd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnd/j;

    .line 12
    .line 13
    return-object v0
.end method

.method public final getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrefetchingEnabled$foundation_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScrollDeltaBetweenPasses$foundation_release()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->_lazyLayoutScrollDeltaBetweenPasses:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;->getScrollDeltaBetweenPasses$foundation_release()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    return-object v0
.end method

.method public isScrollInProgress()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final requestScrollToItem(II)V
    .locals 7
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->isScrollInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCoroutineScope()Lsd/i0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$requestScrollToItem$1;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$requestScrollToItem$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->snapToItemInternal$foundation_release(IIZ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public scroll(Landroidx/compose/foundation/MutatePriority;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MutatePriority;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lhd/p;

    .line 57
    .line 58
    iget-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Landroidx/compose/foundation/MutatePriority;

    .line 61
    .line 62
    iget-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 65
    .line 66
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 74
    .line 75
    iput-object p0, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    iput v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 82
    .line 83
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;->waitForFirstLayout(Lvc/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-ne p3, v1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v2, p0

    .line 91
    :goto_1
    iget-object p3, v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 101
    .line 102
    invoke-interface {p3, p1, p2, v0}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll(Landroidx/compose/foundation/MutatePriority;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 110
    .line 111
    return-object p1
.end method

.method public final scrollToBeConsumed$foundation_release(Z)F
    .locals 0

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->hasLookaheadOccurred:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollDeltaBetweenPasses$foundation_release()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_1
    :goto_0
    iget p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 14
    .line 15
    return p1
.end method

.method public final scrollToItem(IILvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollToItem$2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, p0, p1, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollToItem$2;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILvc/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p3

    .line 12
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll$default(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p1
.end method

.method public final setMeasurePassCount$foundation_release(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPrefetchingEnabled$foundation_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final snapToItemInternal$foundation_release(IIZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-ne v0, p1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getScrollOffset()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eq v0, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    :goto_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->itemAnimator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->reset()V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 30
    .line 31
    invoke-interface {v2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 36
    .line 37
    invoke-static {v2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt;->findVisibleItem(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 50
    .line 51
    if-ne p1, v0, :cond_3

    .line 52
    .line 53
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getOffset-nOcc-ac()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getOffset-nOcc-ac()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    :goto_2
    add-int/2addr p1, p2

    .line 71
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getFirstVisibleItemScrollOffsets()[I

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    array-length p2, p2

    .line 76
    new-array v0, p2, [I

    .line 77
    .line 78
    :goto_3
    if-ge v1, p2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getFirstVisibleItemScrollOffsets()[I

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    aget v3, v3, v1

    .line 85
    .line 86
    add-int/2addr v3, p1

    .line 87
    aput v3, v0, v1

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateScrollOffset([I)V

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 99
    .line 100
    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->requestPositionAndForgetLastKnownKey(II)V

    .line 101
    .line 102
    .line 103
    :goto_4
    if-eqz p3, :cond_7

    .line 104
    .line 105
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 106
    .line 107
    if-eqz p1, :cond_6

    .line 108
    .line 109
    invoke-interface {p1}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 110
    .line 111
    .line 112
    :cond_6
    return-void

    .line 113
    :cond_7
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 114
    .line 115
    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->invalidateScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateScrollPositionIfTheFirstItemWasMoved(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
