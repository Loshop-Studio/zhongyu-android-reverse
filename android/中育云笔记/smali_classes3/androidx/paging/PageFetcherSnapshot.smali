.class public final Landroidx/paging/PageFetcherSnapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcherSnapshot$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final cachedInitialState:Landroidx/paging/PagingState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final config:Landroidx/paging/PagingConfig;

.field private final hintHandler:Landroidx/paging/HintHandler;

.field private final initialKey:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKey;"
        }
    .end annotation
.end field

.field private final initialLoadSize:I

.field private final jumpCallback:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final pageEventCh:Lkotlinx/coroutines/channels/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/a;"
        }
    .end annotation
.end field

.field private final pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final pageEventChannelFlowJob:Lsd/v;

.field private final pageEventFlow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final pagingSource:Landroidx/paging/PagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final retryFlow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcherSnapshotState$Holder<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lvd/c;ILandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingConfig;",
            "Lvd/c;",
            "I",
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const-string v0, "pagingSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jumpCallback"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 4
    iput-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 5
    iput-object p4, p0, Landroidx/paging/PageFetcherSnapshot;->retryFlow:Lvd/c;

    .line 6
    iput p5, p0, Landroidx/paging/PageFetcherSnapshot;->initialLoadSize:I

    .line 7
    iput-object p6, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 8
    iput-object p7, p0, Landroidx/paging/PageFetcherSnapshot;->cachedInitialState:Landroidx/paging/PagingState;

    .line 9
    iput-object p8, p0, Landroidx/paging/PageFetcherSnapshot;->jumpCallback:Lhd/a;

    .line 10
    iget p1, p3, Landroidx/paging/PagingConfig;->jumpThreshold:I

    const/high16 p4, -0x80000000

    if-eq p1, p4, :cond_1

    invoke-virtual {p2}, Landroidx/paging/PagingSource;->getJumpingSupported()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_1
    :goto_0
    new-instance p1, Landroidx/paging/HintHandler;

    invoke-direct {p1}, Landroidx/paging/HintHandler;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, -0x2

    const/4 p2, 0x6

    const/4 p4, 0x0

    .line 13
    invoke-static {p1, p4, p4, p2, p4}, Lkotlinx/coroutines/channels/b;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lhd/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 14
    new-instance p1, Landroidx/paging/PageFetcherSnapshotState$Holder;

    invoke-direct {p1, p3}, Landroidx/paging/PageFetcherSnapshotState$Holder;-><init>(Landroidx/paging/PagingConfig;)V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    const/4 p1, 0x1

    .line 15
    invoke-static {p4, p1, p4}, Lsd/o1;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChannelFlowJob:Lsd/v;

    .line 16
    new-instance p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1;

    invoke-direct {p2, p0, p4}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    invoke-static {p1, p2}, Landroidx/paging/CancelableChannelFlowKt;->cancelableChannelFlow(Lkotlinx/coroutines/g;Lhd/p;)Lvd/c;

    move-result-object p1

    .line 17
    new-instance p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$2;

    invoke-direct {p2, p0, p4}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$2;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    invoke-static {p1, p2}, Lvd/e;->L(Lvd/c;Lhd/p;)Lvd/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventFlow:Lvd/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lvd/c;ILandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lhd/a;ILkotlin/jvm/internal/n;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 18
    iget v1, p3, Landroidx/paging/PagingConfig;->initialLoadSize:I

    move v7, v1

    goto :goto_0

    :cond_0
    move/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    .line 19
    new-instance v0, Landroidx/paging/e0;

    invoke-direct {v0}, Landroidx/paging/e0;-><init>()V

    move-object v10, v0

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    goto :goto_4

    :cond_3
    move-object/from16 v10, p8

    goto :goto_3

    .line 20
    :goto_4
    invoke-direct/range {v2 .. v10}, Landroidx/paging/PageFetcherSnapshot;-><init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lvd/c;ILandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lhd/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic a()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/paging/PageFetcherSnapshot;->_init_$lambda$0()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$collectAsGenerationalViewportHints(Landroidx/paging/PageFetcherSnapshot;Lvd/c;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->collectAsGenerationalViewportHints(Lvd/c;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$doInitialLoad(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcherSnapshot;->doInitialLoad(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$doLoad(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->doLoad(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCachedInitialState$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PagingState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->cachedInitialState:Landroidx/paging/PagingState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PagingConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHintHandler$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/HintHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getJumpCallback$p(Landroidx/paging/PageFetcherSnapshot;)Lhd/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->jumpCallback:Lhd/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageEventCh$p(Landroidx/paging/PageFetcherSnapshot;)Lkotlinx/coroutines/channels/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageEventChCollected$p(Landroidx/paging/PageFetcherSnapshot;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRetryFlow$p(Landroidx/paging/PageFetcherSnapshot;)Lvd/c;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->retryFlow:Lvd/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$retryLoadError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->retryLoadError(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setLoading(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$startConsumingHints(Landroidx/paging/PageFetcherSnapshot;Lsd/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcherSnapshot;->startConsumingHints(Lsd/i0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final collectAsGenerationalViewportHints(Lvd/c;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c;",
            "Landroidx/paging/LoadType;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p2}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;-><init>(Lvc/c;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Landroidx/paging/FlowExtKt;->simpleTransformLatest(Lvd/c;Lhd/q;)Lvd/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$3;

    .line 12
    .line 13
    invoke-direct {v0, p2, v1}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$3;-><init>(Landroidx/paging/LoadType;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Landroidx/paging/FlowExtKt;->simpleRunningReduce(Lvd/c;Lhd/q;)Lvd/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lvd/e;->k(Lvd/c;)Lvd/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$4;

    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$4;-><init>(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, p3}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 41
    .line 42
    return-object p1
.end method

.method private final doInitialLoad(Lvc/c;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    invoke-direct {v0, p0, p1}, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    :goto_0
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbe/a;

    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_e

    :catchall_0
    move-exception p1

    goto/16 :goto_f

    :pswitch_1
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PagingSource$LoadResult;

    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_2
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lbe/a;

    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroidx/paging/PagingSource$LoadResult;

    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_3
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v3, Landroidx/paging/PagingSource$LoadResult;

    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_7

    :catchall_1
    move-exception p1

    goto/16 :goto_8

    :pswitch_4
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PagingSource$LoadResult;

    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_7
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    goto/16 :goto_11

    :pswitch_8
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lbe/a;

    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_9
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 3
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    move-result-object p1

    .line 4
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {p1, v5, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_d

    :cond_1
    move-object v2, p1

    .line 5
    :goto_1
    :try_start_3
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p1

    .line 6
    sget-object v6, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-direct {p0, p1, v6, v0}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_d

    :cond_2
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 7
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 8
    sget-object p1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-direct {p0, p1, v2}, Landroidx/paging/PageFetcherSnapshot;->loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;

    move-result-object p1

    .line 9
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 10
    invoke-virtual {v2, v3}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Start REFRESH with loadKey "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " on "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-virtual {v2, v3, v6, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    :cond_3
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-virtual {v2, p1, v0}, Landroidx/paging/PagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_d

    .line 14
    :cond_4
    :goto_3
    check-cast p1, Landroidx/paging/PagingSource$LoadResult;

    .line 15
    instance-of v2, p1, Landroidx/paging/PagingSource$LoadResult$Page;

    if-eqz v2, :cond_10

    .line 16
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 17
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    move-result-object v2

    .line 18
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x4

    iput v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {v2, v5, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_5

    goto/16 :goto_d

    :cond_5
    move-object v7, p1

    .line 19
    :goto_4
    :try_start_4
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p1

    .line 20
    sget-object v6, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    move-object v8, v7

    check-cast v8, Landroidx/paging/PagingSource$LoadResult$Page;

    iget-object v9, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-virtual {p1, v10, v6, v8, v9}, Landroidx/paging/PageFetcherSnapshotState;->insert(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)Z

    move-result v8

    .line 21
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    move-result-object v9

    sget-object v10, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    invoke-virtual {v10}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    move-result-object v11

    invoke-virtual {v9, v6, v11}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 22
    move-object v9, v7

    check-cast v9, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {v9}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_6

    .line 23
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    move-result-object v9

    sget-object v11, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    invoke-virtual {v10}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    goto :goto_5

    :catchall_3
    move-exception p1

    goto/16 :goto_b

    .line 24
    :cond_6
    :goto_5
    move-object v9, v7

    check-cast v9, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {v9}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_7

    .line 25
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    move-result-object p1

    sget-object v9, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    invoke-virtual {v10}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    move-result-object v10

    invoke-virtual {p1, v9, v10}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 26
    :cond_7
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    if-eqz v8, :cond_b

    .line 27
    sget-object p1, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 28
    invoke-virtual {p1, v3}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 29
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-direct {p0, v6, v2, v7}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-virtual {p1, v3, v2, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    :cond_8
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 32
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    move-result-object p1

    .line 33
    iput-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {p1, v5, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto/16 :goto_d

    :cond_9
    move-object v2, p1

    move-object v4, v7

    .line 34
    :goto_6
    :try_start_5
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p1

    .line 35
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    move-object v6, v4

    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Page;

    sget-object v7, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    invoke-virtual {p1, v6, v7}, Landroidx/paging/PageFetcherSnapshotState;->toPageEvent$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;

    move-result-object p1

    iput-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {v3, p1, v0}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_d

    :cond_a
    move-object v3, v4

    .line 36
    :goto_7
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 37
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    goto :goto_9

    :goto_8
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 38
    :cond_b
    sget-object p1, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 39
    invoke-virtual {p1, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 40
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-direct {p0, v6, v2, v5}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    move-result-object v2

    .line 41
    invoke-virtual {p1, v4, v2, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    move-object v3, v7

    .line 42
    :goto_9
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    if-eqz p1, :cond_16

    .line 43
    move-object p1, v3

    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_16

    .line 44
    :cond_d
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 45
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    move-result-object p1

    .line 46
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {p1, v5, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_e

    goto/16 :goto_d

    :cond_e
    move-object v1, p1

    move-object v0, v3

    .line 47
    :goto_a
    :try_start_6
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p1

    .line 48
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    invoke-virtual {v2}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 49
    invoke-interface {v1, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 50
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    .line 51
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    sget-object v2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    invoke-interface {v1, v2, p1}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 52
    :cond_f
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_16

    .line 53
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    invoke-interface {v0, v1, p1}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    goto/16 :goto_10

    :catchall_4
    move-exception p1

    .line 54
    invoke-interface {v1, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 55
    :goto_b
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 56
    :cond_10
    instance-of v2, p1, Landroidx/paging/PagingSource$LoadResult$Error;

    if-eqz v2, :cond_14

    .line 57
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 58
    invoke-virtual {v2, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 59
    sget-object v3, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-direct {p0, v3, v6, p1}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-virtual {v2, v4, v3, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    :cond_11
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 62
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    move-result-object v2

    .line 63
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/16 v4, 0x8

    iput v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-interface {v2, v5, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_12

    goto :goto_d

    :cond_12
    move-object v4, p1

    .line 64
    :goto_c
    :try_start_7
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p1

    .line 65
    new-instance v3, Landroidx/paging/LoadState$Error;

    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Error;

    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Error;->getThrowable()Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 66
    sget-object v4, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    const/16 v6, 0x9

    iput v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    invoke-direct {p0, p1, v4, v3, v0}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lvc/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-ne p1, v1, :cond_13

    :goto_d
    return-object v1

    :cond_13
    move-object v0, v2

    .line 67
    :goto_e
    :try_start_8
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 68
    invoke-interface {v0, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 69
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1

    :catchall_5
    move-exception p1

    move-object v0, v2

    .line 70
    :goto_f
    invoke-interface {v0, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 71
    :cond_14
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadResult$Invalid;

    if-eqz v0, :cond_17

    .line 72
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 73
    invoke-virtual {v0, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 74
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    invoke-direct {p0, v1, v2, p1}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    move-result-object p1

    .line 75
    invoke-virtual {v0, v4, p1, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    :cond_15
    invoke-direct {p0}, Landroidx/paging/PageFetcherSnapshot;->onInvalidLoad()V

    .line 77
    :cond_16
    :goto_10
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1

    .line 78
    :cond_17
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 79
    :goto_11
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final doLoad(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/GenerationalViewportHint;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Landroidx/paging/PageFetcherSnapshot$doLoad$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 38
    .line 39
    const-string v6, "Use doInitialLoad for LoadType == REFRESH"

    .line 40
    .line 41
    const/4 v10, 0x1

    .line 42
    packed-switch v5, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :pswitch_0
    iget v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$1:I

    .line 54
    .line 55
    iget v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$0:I

    .line 56
    .line 57
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v12, Lbe/a;

    .line 60
    .line 61
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v13, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 64
    .line 65
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v14, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 68
    .line 69
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v15, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 72
    .line 73
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 76
    .line 77
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v8, Landroidx/paging/GenerationalViewportHint;

    .line 80
    .line 81
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Landroidx/paging/LoadType;

    .line 84
    .line 85
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v11, v8

    .line 89
    move-object v2, v12

    .line 90
    move-object v12, v14

    .line 91
    move-object v8, v15

    .line 92
    move-object v14, v9

    .line 93
    move-object v9, v7

    .line 94
    goto/16 :goto_1e

    .line 95
    .line 96
    :pswitch_1
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Lbe/a;

    .line 100
    .line 101
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Landroidx/paging/PagingSource$LoadResult;

    .line 104
    .line 105
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Landroidx/paging/PagingSource$LoadParams;

    .line 108
    .line 109
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 112
    .line 113
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 116
    .line 117
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v12, Lkotlin/jvm/internal/Ref$IntRef;

    .line 120
    .line 121
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Landroidx/paging/GenerationalViewportHint;

    .line 124
    .line 125
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v14, Landroidx/paging/LoadType;

    .line 128
    .line 129
    :try_start_0
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    move-object v11, v12

    .line 133
    move-object v12, v8

    .line 134
    move-object v8, v9

    .line 135
    move-object v9, v11

    .line 136
    move-object v11, v13

    .line 137
    goto/16 :goto_1b

    .line 138
    .line 139
    :catchall_0
    move-exception v0

    .line 140
    :goto_1
    const/4 v10, 0x0

    .line 141
    goto/16 :goto_1f

    .line 142
    .line 143
    :pswitch_2
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Landroidx/paging/PageFetcherSnapshotState;

    .line 146
    .line 147
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v5, Lbe/a;

    .line 150
    .line 151
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    .line 154
    .line 155
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v8, Landroidx/paging/PagingSource$LoadParams;

    .line 158
    .line 159
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 162
    .line 163
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 166
    .line 167
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v13, Lkotlin/jvm/internal/Ref$IntRef;

    .line 170
    .line 171
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v14, Landroidx/paging/GenerationalViewportHint;

    .line 174
    .line 175
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v15, Landroidx/paging/LoadType;

    .line 178
    .line 179
    :try_start_1
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    .line 181
    .line 182
    goto/16 :goto_18

    .line 183
    .line 184
    :pswitch_3
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lbe/a;

    .line 187
    .line 188
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 191
    .line 192
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v7, Landroidx/paging/LoadType;

    .line 195
    .line 196
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v8, Landroidx/paging/PagingSource$LoadResult;

    .line 199
    .line 200
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v9, Landroidx/paging/PagingSource$LoadParams;

    .line 203
    .line 204
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v12, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 207
    .line 208
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 211
    .line 212
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    .line 215
    .line 216
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v15, Landroidx/paging/GenerationalViewportHint;

    .line 219
    .line 220
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v11, Landroidx/paging/LoadType;

    .line 223
    .line 224
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v16, v15

    .line 228
    .line 229
    move-object v15, v0

    .line 230
    move-object/from16 v0, v16

    .line 231
    .line 232
    goto/16 :goto_17

    .line 233
    .line 234
    :pswitch_4
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Landroidx/paging/PageFetcherSnapshotState;

    .line 237
    .line 238
    iget-object v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v4, Lbe/a;

    .line 241
    .line 242
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v5, Landroidx/paging/GenerationalViewportHint;

    .line 245
    .line 246
    iget-object v3, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v3, Landroidx/paging/LoadType;

    .line 249
    .line 250
    :try_start_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 251
    .line 252
    .line 253
    goto/16 :goto_22

    .line 254
    .line 255
    :catchall_1
    move-exception v0

    .line 256
    :goto_2
    const/4 v10, 0x0

    .line 257
    goto/16 :goto_23

    .line 258
    .line 259
    :pswitch_5
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lbe/a;

    .line 262
    .line 263
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 266
    .line 267
    iget-object v6, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v6, Landroidx/paging/PagingSource$LoadResult;

    .line 270
    .line 271
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v7, Landroidx/paging/GenerationalViewportHint;

    .line 274
    .line 275
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v8, Landroidx/paging/LoadType;

    .line 278
    .line 279
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object v2, v0

    .line 283
    move-object v0, v3

    .line 284
    move-object v13, v7

    .line 285
    move-object v3, v8

    .line 286
    goto/16 :goto_20

    .line 287
    .line 288
    :pswitch_6
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Lbe/a;

    .line 291
    .line 292
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 295
    .line 296
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    .line 299
    .line 300
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v8, Landroidx/paging/PagingSource$LoadParams;

    .line 303
    .line 304
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 307
    .line 308
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 311
    .line 312
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v12, Lkotlin/jvm/internal/Ref$IntRef;

    .line 315
    .line 316
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v13, Landroidx/paging/GenerationalViewportHint;

    .line 319
    .line 320
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v14, Landroidx/paging/LoadType;

    .line 323
    .line 324
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    move-object v2, v0

    .line 328
    goto/16 :goto_12

    .line 329
    .line 330
    :pswitch_7
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 333
    .line 334
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v5, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 337
    .line 338
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 341
    .line 342
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v8, Lkotlin/jvm/internal/Ref$IntRef;

    .line 345
    .line 346
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v9, Landroidx/paging/GenerationalViewportHint;

    .line 349
    .line 350
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v11, Landroidx/paging/LoadType;

    .line 353
    .line 354
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    move-object v12, v8

    .line 358
    move-object v13, v9

    .line 359
    move-object v14, v11

    .line 360
    move-object v8, v0

    .line 361
    move-object v9, v5

    .line 362
    move-object v11, v7

    .line 363
    goto/16 :goto_e

    .line 364
    .line 365
    :pswitch_8
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 368
    .line 369
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 370
    .line 371
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v7, Lbe/a;

    .line 374
    .line 375
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 378
    .line 379
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 382
    .line 383
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v11, Landroidx/paging/GenerationalViewportHint;

    .line 386
    .line 387
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v12, Landroidx/paging/LoadType;

    .line 390
    .line 391
    :try_start_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 392
    .line 393
    .line 394
    goto/16 :goto_9

    .line 395
    .line 396
    :catchall_2
    move-exception v0

    .line 397
    :goto_3
    const/4 v10, 0x0

    .line 398
    goto/16 :goto_25

    .line 399
    .line 400
    :pswitch_9
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 403
    .line 404
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v5, Lbe/a;

    .line 407
    .line 408
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v7, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 411
    .line 412
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 415
    .line 416
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 419
    .line 420
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v11, Landroidx/paging/GenerationalViewportHint;

    .line 423
    .line 424
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v12, Landroidx/paging/LoadType;

    .line 427
    .line 428
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_8

    .line 432
    .line 433
    :pswitch_a
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, Lbe/a;

    .line 436
    .line 437
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 440
    .line 441
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 444
    .line 445
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v8, Landroidx/paging/GenerationalViewportHint;

    .line 448
    .line 449
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v9, Landroidx/paging/LoadType;

    .line 452
    .line 453
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    move-object v2, v0

    .line 457
    move-object v0, v9

    .line 458
    goto :goto_4

    .line 459
    :pswitch_b
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    sget-object v2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 463
    .line 464
    if-eq v0, v2, :cond_2d

    .line 465
    .line 466
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 467
    .line 468
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 469
    .line 470
    .line 471
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 472
    .line 473
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 478
    .line 479
    move-object/from16 v8, p2

    .line 480
    .line 481
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 482
    .line 483
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 484
    .line 485
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 486
    .line 487
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 488
    .line 489
    iput v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 490
    .line 491
    const/4 v9, 0x0

    .line 492
    invoke-interface {v2, v9, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v11

    .line 496
    if-ne v11, v4, :cond_1

    .line 497
    .line 498
    goto/16 :goto_21

    .line 499
    .line 500
    :cond_1
    :goto_4
    :try_start_4
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    sget-object v9, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 507
    .line 508
    .line 509
    move-result v11

    .line 510
    aget v9, v9, v11

    .line 511
    .line 512
    if-eq v9, v10, :cond_2c

    .line 513
    .line 514
    const/4 v11, 0x2

    .line 515
    if-eq v9, v11, :cond_4

    .line 516
    .line 517
    const/4 v11, 0x3

    .line 518
    if-ne v9, v11, :cond_3

    .line 519
    .line 520
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common()I

    .line 521
    .line 522
    .line 523
    move-result v9

    .line 524
    invoke-virtual {v8}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    invoke-virtual {v11}, Landroidx/paging/ViewportHint;->getOriginalPageOffsetLast()I

    .line 529
    .line 530
    .line 531
    move-result v11

    .line 532
    add-int/2addr v9, v11

    .line 533
    add-int/2addr v9, v10

    .line 534
    if-gez v9, :cond_2

    .line 535
    .line 536
    iget v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 537
    .line 538
    iget-object v12, v1, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 539
    .line 540
    iget v12, v12, Landroidx/paging/PagingConfig;->pageSize:I

    .line 541
    .line 542
    neg-int v9, v9

    .line 543
    mul-int/2addr v12, v9

    .line 544
    add-int/2addr v11, v12

    .line 545
    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 546
    .line 547
    const/4 v9, 0x0

    .line 548
    goto :goto_5

    .line 549
    :catchall_3
    move-exception v0

    .line 550
    const/4 v10, 0x0

    .line 551
    goto/16 :goto_26

    .line 552
    .line 553
    :cond_2
    :goto_5
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    invoke-static {v11}, Lrc/w;->p(Ljava/util/List;)I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    if-gt v9, v11, :cond_6

    .line 562
    .line 563
    :goto_6
    iget v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 564
    .line 565
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v13

    .line 573
    check-cast v13, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 574
    .line 575
    invoke-virtual {v13}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v13

    .line 579
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 580
    .line 581
    .line 582
    move-result v13

    .line 583
    add-int/2addr v12, v13

    .line 584
    iput v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 585
    .line 586
    if-eq v9, v11, :cond_6

    .line 587
    .line 588
    add-int/lit8 v9, v9, 0x1

    .line 589
    .line 590
    goto :goto_6

    .line 591
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 592
    .line 593
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 594
    .line 595
    .line 596
    throw v0

    .line 597
    :cond_4
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common()I

    .line 598
    .line 599
    .line 600
    move-result v9

    .line 601
    invoke-virtual {v8}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    invoke-virtual {v11}, Landroidx/paging/ViewportHint;->getOriginalPageOffsetFirst()I

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    add-int/2addr v9, v11

    .line 610
    sub-int/2addr v9, v10

    .line 611
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-static {v11}, Lrc/w;->p(Ljava/util/List;)I

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    if-le v9, v11, :cond_5

    .line 620
    .line 621
    iget v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 622
    .line 623
    iget-object v12, v1, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 624
    .line 625
    iget v12, v12, Landroidx/paging/PagingConfig;->pageSize:I

    .line 626
    .line 627
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v13

    .line 631
    invoke-static {v13}, Lrc/w;->p(Ljava/util/List;)I

    .line 632
    .line 633
    .line 634
    move-result v13

    .line 635
    sub-int/2addr v9, v13

    .line 636
    mul-int/2addr v12, v9

    .line 637
    add-int/2addr v11, v12

    .line 638
    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 639
    .line 640
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    invoke-static {v9}, Lrc/w;->p(Ljava/util/List;)I

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    :cond_5
    if-ltz v9, :cond_6

    .line 649
    .line 650
    const/4 v11, 0x0

    .line 651
    :goto_7
    iget v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 652
    .line 653
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v13

    .line 657
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v13

    .line 661
    check-cast v13, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 662
    .line 663
    invoke-virtual {v13}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v13

    .line 667
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 668
    .line 669
    .line 670
    move-result v13

    .line 671
    add-int/2addr v12, v13

    .line 672
    iput v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 673
    .line 674
    if-eq v11, v9, :cond_6

    .line 675
    .line 676
    add-int/lit8 v11, v11, 0x1

    .line 677
    .line 678
    goto :goto_7

    .line 679
    :cond_6
    sget-object v5, Lqc/q;->a:Lqc/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 680
    .line 681
    const/4 v9, 0x0

    .line 682
    invoke-interface {v2, v9}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 686
    .line 687
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 688
    .line 689
    .line 690
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 691
    .line 692
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 693
    .line 694
    .line 695
    move-result-object v9

    .line 696
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 697
    .line 698
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 699
    .line 700
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 701
    .line 702
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 703
    .line 704
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 705
    .line 706
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 707
    .line 708
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 709
    .line 710
    const/4 v11, 0x2

    .line 711
    iput v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 712
    .line 713
    const/4 v11, 0x0

    .line 714
    invoke-interface {v9, v11, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v12

    .line 718
    if-ne v12, v4, :cond_7

    .line 719
    .line 720
    goto/16 :goto_21

    .line 721
    .line 722
    :cond_7
    move-object v11, v7

    .line 723
    move-object v7, v5

    .line 724
    move-object v5, v9

    .line 725
    move-object v9, v11

    .line 726
    move-object v12, v0

    .line 727
    move-object v0, v2

    .line 728
    move-object v11, v8

    .line 729
    move-object v8, v0

    .line 730
    :goto_8
    :try_start_5
    invoke-static {v7}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-virtual {v11}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 735
    .line 736
    .line 737
    move-result v7

    .line 738
    invoke-virtual {v11}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 739
    .line 740
    .line 741
    move-result-object v13

    .line 742
    invoke-virtual {v13, v12}, Landroidx/paging/ViewportHint;->presentedItemsBeyondAnchor$paging_common(Landroidx/paging/LoadType;)I

    .line 743
    .line 744
    .line 745
    move-result v13

    .line 746
    iget v14, v9, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 747
    .line 748
    add-int/2addr v13, v14

    .line 749
    invoke-direct {v1, v2, v12, v7, v13}, Landroidx/paging/PageFetcherSnapshot;->nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    if-eqz v7, :cond_9

    .line 754
    .line 755
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 756
    .line 757
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 758
    .line 759
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 760
    .line 761
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 762
    .line 763
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 764
    .line 765
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 766
    .line 767
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 768
    .line 769
    const/4 v13, 0x3

    .line 770
    iput v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 771
    .line 772
    invoke-direct {v1, v2, v12, v3}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 776
    if-ne v2, v4, :cond_8

    .line 777
    .line 778
    goto/16 :goto_21

    .line 779
    .line 780
    :cond_8
    move-object/from16 v16, v7

    .line 781
    .line 782
    move-object v7, v5

    .line 783
    move-object/from16 v5, v16

    .line 784
    .line 785
    :goto_9
    move-object v2, v5

    .line 786
    move-object v5, v7

    .line 787
    :goto_a
    const/4 v7, 0x0

    .line 788
    goto :goto_b

    .line 789
    :catchall_4
    move-exception v0

    .line 790
    move-object v7, v5

    .line 791
    goto/16 :goto_3

    .line 792
    .line 793
    :cond_9
    const/4 v2, 0x0

    .line 794
    goto :goto_a

    .line 795
    :goto_b
    invoke-interface {v5, v7}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 799
    .line 800
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 801
    .line 802
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 803
    .line 804
    .line 805
    :goto_c
    iget-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 806
    .line 807
    if-eqz v2, :cond_2b

    .line 808
    .line 809
    invoke-direct {v1, v12, v2}, Landroidx/paging/PageFetcherSnapshot;->loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    sget-object v5, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 814
    .line 815
    const/4 v13, 0x3

    .line 816
    invoke-virtual {v5, v13}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    if-eqz v7, :cond_a

    .line 821
    .line 822
    new-instance v7, Ljava/lang/StringBuilder;

    .line 823
    .line 824
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 825
    .line 826
    .line 827
    const-string v13, "Start "

    .line 828
    .line 829
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    const-string v13, " with loadKey "

    .line 836
    .line 837
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    iget-object v13, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 841
    .line 842
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    const-string v13, " on "

    .line 846
    .line 847
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    iget-object v13, v1, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 851
    .line 852
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v7

    .line 859
    const/4 v13, 0x3

    .line 860
    const/4 v14, 0x0

    .line 861
    invoke-virtual {v5, v13, v7, v14}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 862
    .line 863
    .line 864
    goto :goto_d

    .line 865
    :cond_a
    const/4 v14, 0x0

    .line 866
    :goto_d
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 867
    .line 868
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 869
    .line 870
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 871
    .line 872
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 873
    .line 874
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 875
    .line 876
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 877
    .line 878
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 879
    .line 880
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 881
    .line 882
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 883
    .line 884
    const/4 v7, 0x4

    .line 885
    iput v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 886
    .line 887
    invoke-virtual {v5, v2, v3}, Landroidx/paging/PagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v5

    .line 891
    if-ne v5, v4, :cond_b

    .line 892
    .line 893
    goto/16 :goto_21

    .line 894
    .line 895
    :cond_b
    move-object v13, v11

    .line 896
    move-object v14, v12

    .line 897
    move-object v11, v8

    .line 898
    move-object v12, v9

    .line 899
    move-object v9, v0

    .line 900
    move-object v8, v2

    .line 901
    move-object v2, v5

    .line 902
    :goto_e
    move-object v0, v2

    .line 903
    check-cast v0, Landroidx/paging/PagingSource$LoadResult;

    .line 904
    .line 905
    instance-of v2, v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 906
    .line 907
    if-eqz v2, :cond_24

    .line 908
    .line 909
    sget-object v2, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 910
    .line 911
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 912
    .line 913
    .line 914
    move-result v5

    .line 915
    aget v2, v2, v5

    .line 916
    .line 917
    const/4 v5, 0x2

    .line 918
    if-eq v2, v5, :cond_d

    .line 919
    .line 920
    const/4 v5, 0x3

    .line 921
    if-ne v2, v5, :cond_c

    .line 922
    .line 923
    move-object v2, v0

    .line 924
    check-cast v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 925
    .line 926
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    goto :goto_f

    .line 931
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 932
    .line 933
    invoke-direct {v0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    throw v0

    .line 937
    :cond_d
    move-object v2, v0

    .line 938
    check-cast v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 939
    .line 940
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v2

    .line 944
    :goto_f
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 945
    .line 946
    invoke-virtual {v5}, Landroidx/paging/PagingSource;->getKeyReuseSupported()Z

    .line 947
    .line 948
    .line 949
    move-result v5

    .line 950
    if-nez v5, :cond_10

    .line 951
    .line 952
    iget-object v5, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 953
    .line 954
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    if-nez v2, :cond_e

    .line 959
    .line 960
    goto :goto_11

    .line 961
    :cond_e
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 962
    .line 963
    if-ne v14, v0, :cond_f

    .line 964
    .line 965
    const-string v0, "prevKey"

    .line 966
    .line 967
    goto :goto_10

    .line 968
    :cond_f
    const-string v0, "nextKey"

    .line 969
    .line 970
    :goto_10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 971
    .line 972
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 973
    .line 974
    .line 975
    const-string v3, "The same value, "

    .line 976
    .line 977
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    iget-object v3, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 981
    .line 982
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    const-string v3, ", was passed as the "

    .line 986
    .line 987
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    const-string v0, " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "

    .line 994
    .line 995
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    const/4 v9, 0x0

    .line 1003
    invoke-static {v0, v9, v10, v9}, Lqd/s;->p(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    throw v2

    .line 1017
    :cond_10
    :goto_11
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1018
    .line 1019
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1024
    .line 1025
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1026
    .line 1027
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1028
    .line 1029
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1030
    .line 1031
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1032
    .line 1033
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1034
    .line 1035
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1036
    .line 1037
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1038
    .line 1039
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1040
    .line 1041
    const/4 v7, 0x5

    .line 1042
    iput v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1043
    .line 1044
    const/4 v7, 0x0

    .line 1045
    invoke-interface {v2, v7, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v15

    .line 1049
    if-ne v15, v4, :cond_11

    .line 1050
    .line 1051
    goto/16 :goto_21

    .line 1052
    .line 1053
    :cond_11
    move-object v7, v0

    .line 1054
    :goto_12
    :try_start_6
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-virtual {v13}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 1059
    .line 1060
    .line 1061
    move-result v5

    .line 1062
    move-object v15, v7

    .line 1063
    check-cast v15, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1064
    .line 1065
    iget-object v10, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1066
    .line 1067
    invoke-virtual {v0, v5, v14, v15, v10}, Landroidx/paging/PageFetcherSnapshotState;->insert(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 1071
    const/4 v5, 0x0

    .line 1072
    invoke-interface {v2, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    if-nez v0, :cond_12

    .line 1076
    .line 1077
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1078
    .line 1079
    const/4 v2, 0x2

    .line 1080
    invoke-virtual {v0, v2}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v3

    .line 1084
    if-eqz v3, :cond_2b

    .line 1085
    .line 1086
    iget-object v3, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1087
    .line 1088
    invoke-direct {v1, v14, v3, v5}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    invoke-virtual {v0, v2, v3, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1093
    .line 1094
    .line 1095
    goto/16 :goto_24

    .line 1096
    .line 1097
    :cond_12
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1098
    .line 1099
    const/4 v2, 0x3

    .line 1100
    invoke-virtual {v0, v2}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v10

    .line 1104
    if-eqz v10, :cond_13

    .line 1105
    .line 1106
    iget-object v10, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1107
    .line 1108
    invoke-direct {v1, v14, v10, v7}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v10

    .line 1112
    invoke-virtual {v0, v2, v10, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_13
    iget v0, v12, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 1116
    .line 1117
    move-object v5, v7

    .line 1118
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1119
    .line 1120
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v10

    .line 1124
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1125
    .line 1126
    .line 1127
    move-result v10

    .line 1128
    add-int/2addr v0, v10

    .line 1129
    iput v0, v12, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 1130
    .line 1131
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1132
    .line 1133
    if-ne v14, v0, :cond_15

    .line 1134
    .line 1135
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v10

    .line 1139
    if-eqz v10, :cond_14

    .line 1140
    .line 1141
    goto :goto_14

    .line 1142
    :cond_14
    :goto_13
    const/4 v5, 0x1

    .line 1143
    goto :goto_15

    .line 1144
    :cond_15
    :goto_14
    sget-object v10, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1145
    .line 1146
    if-ne v14, v10, :cond_16

    .line 1147
    .line 1148
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v5

    .line 1152
    if-nez v5, :cond_16

    .line 1153
    .line 1154
    goto :goto_13

    .line 1155
    :goto_15
    iput-boolean v5, v9, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 1156
    .line 1157
    goto :goto_16

    .line 1158
    :cond_16
    const/4 v5, 0x1

    .line 1159
    :goto_16
    sget-object v10, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 1160
    .line 1161
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 1162
    .line 1163
    .line 1164
    move-result v15

    .line 1165
    aget v10, v10, v15

    .line 1166
    .line 1167
    const/4 v15, 0x2

    .line 1168
    if-ne v10, v15, :cond_17

    .line 1169
    .line 1170
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1171
    .line 1172
    :cond_17
    iget-object v10, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1173
    .line 1174
    invoke-static {v10}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v15

    .line 1178
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1179
    .line 1180
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1181
    .line 1182
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1183
    .line 1184
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1185
    .line 1186
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1187
    .line 1188
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1189
    .line 1190
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1191
    .line 1192
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1193
    .line 1194
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1195
    .line 1196
    iput-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1197
    .line 1198
    const/16 v2, 0x8

    .line 1199
    .line 1200
    iput v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1201
    .line 1202
    const/4 v2, 0x0

    .line 1203
    invoke-interface {v15, v2, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    if-ne v5, v4, :cond_18

    .line 1208
    .line 1209
    goto/16 :goto_21

    .line 1210
    .line 1211
    :cond_18
    move-object v5, v7

    .line 1212
    move-object v7, v0

    .line 1213
    move-object v0, v13

    .line 1214
    move-object v13, v11

    .line 1215
    move-object v11, v14

    .line 1216
    move-object v14, v12

    .line 1217
    move-object v12, v9

    .line 1218
    move-object v9, v8

    .line 1219
    move-object v8, v5

    .line 1220
    move-object v5, v10

    .line 1221
    :goto_17
    :try_start_7
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    invoke-virtual {v0}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v5

    .line 1229
    invoke-virtual {v2, v7, v5}, Landroidx/paging/PageFetcherSnapshotState;->dropEventOrNull(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)Landroidx/paging/PageEvent$Drop;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v5

    .line 1233
    if-eqz v5, :cond_1a

    .line 1234
    .line 1235
    invoke-virtual {v2, v5}, Landroidx/paging/PageFetcherSnapshotState;->drop(Landroidx/paging/PageEvent$Drop;)V

    .line 1236
    .line 1237
    .line 1238
    iget-object v7, v1, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 1239
    .line 1240
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1241
    .line 1242
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1243
    .line 1244
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1245
    .line 1246
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1247
    .line 1248
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1249
    .line 1250
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1251
    .line 1252
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1253
    .line 1254
    iput-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1255
    .line 1256
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1257
    .line 1258
    const/4 v10, 0x0

    .line 1259
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1260
    .line 1261
    const/16 v10, 0x9

    .line 1262
    .line 1263
    iput v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1264
    .line 1265
    invoke-interface {v7, v5, v3}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1269
    if-ne v5, v4, :cond_19

    .line 1270
    .line 1271
    goto/16 :goto_21

    .line 1272
    .line 1273
    :cond_19
    move-object v7, v8

    .line 1274
    move-object v8, v9

    .line 1275
    move-object v9, v12

    .line 1276
    move-object v12, v13

    .line 1277
    move-object v13, v14

    .line 1278
    move-object v5, v15

    .line 1279
    move-object v14, v0

    .line 1280
    move-object v0, v2

    .line 1281
    move-object v15, v11

    .line 1282
    :goto_18
    :try_start_8
    sget-object v2, Lqc/q;->a:Lqc/q;

    .line 1283
    .line 1284
    move-object v2, v0

    .line 1285
    move-object v0, v14

    .line 1286
    move-object v11, v15

    .line 1287
    move-object v14, v13

    .line 1288
    move-object v13, v12

    .line 1289
    move-object v12, v9

    .line 1290
    goto :goto_19

    .line 1291
    :catchall_5
    move-exception v0

    .line 1292
    move-object v5, v15

    .line 1293
    goto/16 :goto_1

    .line 1294
    .line 1295
    :cond_1a
    move-object v7, v8

    .line 1296
    move-object v8, v9

    .line 1297
    move-object v5, v15

    .line 1298
    :goto_19
    invoke-virtual {v0}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 1299
    .line 1300
    .line 1301
    move-result v9

    .line 1302
    invoke-virtual {v0}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v10

    .line 1306
    invoke-virtual {v10, v11}, Landroidx/paging/ViewportHint;->presentedItemsBeyondAnchor$paging_common(Landroidx/paging/LoadType;)I

    .line 1307
    .line 1308
    .line 1309
    move-result v10

    .line 1310
    iget v15, v14, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 1311
    .line 1312
    add-int/2addr v10, v15

    .line 1313
    invoke-direct {v1, v2, v11, v9, v10}, Landroidx/paging/PageFetcherSnapshot;->nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v9

    .line 1317
    iput-object v9, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1318
    .line 1319
    if-nez v9, :cond_1c

    .line 1320
    .line 1321
    invoke-virtual {v2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v9

    .line 1325
    invoke-virtual {v9, v11}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v9

    .line 1329
    instance-of v9, v9, Landroidx/paging/LoadState$Error;

    .line 1330
    .line 1331
    if-nez v9, :cond_1c

    .line 1332
    .line 1333
    invoke-virtual {v2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v9

    .line 1337
    iget-boolean v10, v12, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 1338
    .line 1339
    if-eqz v10, :cond_1b

    .line 1340
    .line 1341
    sget-object v10, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 1342
    .line 1343
    invoke-virtual {v10}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v10

    .line 1347
    goto :goto_1a

    .line 1348
    :cond_1b
    sget-object v10, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 1349
    .line 1350
    invoke-virtual {v10}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v10

    .line 1354
    :goto_1a
    invoke-virtual {v9, v11, v10}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 1355
    .line 1356
    .line 1357
    :cond_1c
    move-object v9, v7

    .line 1358
    check-cast v9, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1359
    .line 1360
    invoke-virtual {v2, v9, v11}, Landroidx/paging/PageFetcherSnapshotState;->toPageEvent$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v2

    .line 1364
    iget-object v9, v1, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 1365
    .line 1366
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1367
    .line 1368
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1369
    .line 1370
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1371
    .line 1372
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1373
    .line 1374
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1375
    .line 1376
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1377
    .line 1378
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1379
    .line 1380
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1381
    .line 1382
    const/4 v10, 0x0

    .line 1383
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1384
    .line 1385
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1386
    .line 1387
    const/16 v10, 0xa

    .line 1388
    .line 1389
    iput v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1390
    .line 1391
    invoke-interface {v9, v2, v3}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v2

    .line 1395
    if-ne v2, v4, :cond_1d

    .line 1396
    .line 1397
    goto/16 :goto_21

    .line 1398
    .line 1399
    :cond_1d
    move-object v9, v14

    .line 1400
    move-object v14, v11

    .line 1401
    move-object v11, v0

    .line 1402
    move-object v0, v7

    .line 1403
    move-object v7, v8

    .line 1404
    move-object v8, v13

    .line 1405
    :goto_1b
    sget-object v2, Lqc/q;->a:Lqc/q;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1406
    .line 1407
    const/4 v10, 0x0

    .line 1408
    invoke-interface {v5, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1409
    .line 1410
    .line 1411
    instance-of v2, v7, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 1412
    .line 1413
    if-eqz v2, :cond_1e

    .line 1414
    .line 1415
    move-object v2, v0

    .line 1416
    check-cast v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1417
    .line 1418
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    if-nez v2, :cond_1e

    .line 1423
    .line 1424
    const/4 v5, 0x1

    .line 1425
    goto :goto_1c

    .line 1426
    :cond_1e
    const/4 v5, 0x0

    .line 1427
    :goto_1c
    instance-of v2, v7, Landroidx/paging/PagingSource$LoadParams$Append;

    .line 1428
    .line 1429
    if-eqz v2, :cond_1f

    .line 1430
    .line 1431
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1432
    .line 1433
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    if-nez v0, :cond_1f

    .line 1438
    .line 1439
    const/4 v0, 0x1

    .line 1440
    goto :goto_1d

    .line 1441
    :cond_1f
    const/4 v0, 0x0

    .line 1442
    :goto_1d
    iget-object v2, v1, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1443
    .line 1444
    if-eqz v2, :cond_23

    .line 1445
    .line 1446
    if-nez v5, :cond_20

    .line 1447
    .line 1448
    if-eqz v0, :cond_23

    .line 1449
    .line 1450
    :cond_20
    iget-object v13, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1451
    .line 1452
    invoke-static {v13}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1457
    .line 1458
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1459
    .line 1460
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1461
    .line 1462
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1463
    .line 1464
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1465
    .line 1466
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1467
    .line 1468
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1469
    .line 1470
    const/4 v10, 0x0

    .line 1471
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1472
    .line 1473
    iput v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$0:I

    .line 1474
    .line 1475
    iput v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$1:I

    .line 1476
    .line 1477
    const/16 v7, 0xb

    .line 1478
    .line 1479
    iput v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1480
    .line 1481
    invoke-interface {v2, v10, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v7

    .line 1485
    if-ne v7, v4, :cond_21

    .line 1486
    .line 1487
    goto/16 :goto_21

    .line 1488
    .line 1489
    :cond_21
    :goto_1e
    :try_start_9
    invoke-static {v13}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v7

    .line 1493
    iget-object v10, v1, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 1494
    .line 1495
    invoke-virtual {v10}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v10

    .line 1499
    invoke-virtual {v7, v10}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1503
    const/4 v10, 0x0

    .line 1504
    invoke-interface {v2, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1505
    .line 1506
    .line 1507
    if-eqz v5, :cond_22

    .line 1508
    .line 1509
    iget-object v2, v1, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1510
    .line 1511
    sget-object v5, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1512
    .line 1513
    invoke-interface {v2, v5, v7}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 1514
    .line 1515
    .line 1516
    :cond_22
    if-eqz v0, :cond_23

    .line 1517
    .line 1518
    iget-object v0, v1, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1519
    .line 1520
    sget-object v2, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1521
    .line 1522
    invoke-interface {v0, v2, v7}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 1523
    .line 1524
    .line 1525
    :cond_23
    move-object v0, v12

    .line 1526
    move-object v12, v14

    .line 1527
    const/4 v10, 0x1

    .line 1528
    goto/16 :goto_c

    .line 1529
    .line 1530
    :catchall_6
    move-exception v0

    .line 1531
    const/4 v10, 0x0

    .line 1532
    invoke-interface {v2, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1533
    .line 1534
    .line 1535
    throw v0

    .line 1536
    :goto_1f
    invoke-interface {v5, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1537
    .line 1538
    .line 1539
    throw v0

    .line 1540
    :catchall_7
    move-exception v0

    .line 1541
    const/4 v10, 0x0

    .line 1542
    invoke-interface {v2, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1543
    .line 1544
    .line 1545
    throw v0

    .line 1546
    :cond_24
    const/4 v10, 0x0

    .line 1547
    instance-of v2, v0, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 1548
    .line 1549
    if-eqz v2, :cond_28

    .line 1550
    .line 1551
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1552
    .line 1553
    const/4 v15, 0x2

    .line 1554
    invoke-virtual {v2, v15}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v5

    .line 1558
    if-eqz v5, :cond_25

    .line 1559
    .line 1560
    iget-object v5, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1561
    .line 1562
    invoke-direct {v1, v14, v5, v0}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v5

    .line 1566
    invoke-virtual {v2, v15, v5, v10}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1567
    .line 1568
    .line 1569
    :cond_25
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1570
    .line 1571
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v2

    .line 1575
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1576
    .line 1577
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1578
    .line 1579
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1580
    .line 1581
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1582
    .line 1583
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1584
    .line 1585
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1586
    .line 1587
    const/4 v6, 0x6

    .line 1588
    iput v6, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1589
    .line 1590
    invoke-interface {v2, v10, v3}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v6

    .line 1594
    if-ne v6, v4, :cond_26

    .line 1595
    .line 1596
    goto :goto_21

    .line 1597
    :cond_26
    move-object v6, v0

    .line 1598
    move-object v0, v3

    .line 1599
    move-object v3, v14

    .line 1600
    :goto_20
    :try_start_a
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v5

    .line 1604
    new-instance v7, Landroidx/paging/LoadState$Error;

    .line 1605
    .line 1606
    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 1607
    .line 1608
    invoke-virtual {v6}, Landroidx/paging/PagingSource$LoadResult$Error;->getThrowable()Ljava/lang/Throwable;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v6

    .line 1612
    invoke-direct {v7, v6}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 1613
    .line 1614
    .line 1615
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1616
    .line 1617
    iput-object v13, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1618
    .line 1619
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1620
    .line 1621
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1622
    .line 1623
    const/4 v10, 0x0

    .line 1624
    iput-object v10, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1625
    .line 1626
    const/4 v6, 0x7

    .line 1627
    iput v6, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1628
    .line 1629
    invoke-direct {v1, v5, v3, v7, v0}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lvc/c;)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1633
    if-ne v0, v4, :cond_27

    .line 1634
    .line 1635
    :goto_21
    return-object v4

    .line 1636
    :cond_27
    move-object v4, v2

    .line 1637
    move-object v0, v5

    .line 1638
    move-object v5, v13

    .line 1639
    :goto_22
    :try_start_b
    invoke-virtual {v0}, Landroidx/paging/PageFetcherSnapshotState;->getFailedHintsByLoadType$paging_common()Ljava/util/Map;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v0

    .line 1643
    invoke-virtual {v5}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v2

    .line 1647
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1651
    .line 1652
    const/4 v10, 0x0

    .line 1653
    invoke-interface {v4, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1654
    .line 1655
    .line 1656
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 1657
    .line 1658
    return-object v0

    .line 1659
    :catchall_8
    move-exception v0

    .line 1660
    move-object v4, v2

    .line 1661
    goto/16 :goto_2

    .line 1662
    .line 1663
    :goto_23
    invoke-interface {v4, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1664
    .line 1665
    .line 1666
    throw v0

    .line 1667
    :cond_28
    instance-of v2, v0, Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 1668
    .line 1669
    if-eqz v2, :cond_2a

    .line 1670
    .line 1671
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1672
    .line 1673
    const/4 v15, 0x2

    .line 1674
    invoke-virtual {v2, v15}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v3

    .line 1678
    if-eqz v3, :cond_29

    .line 1679
    .line 1680
    iget-object v3, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 1681
    .line 1682
    invoke-direct {v1, v14, v3, v0}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-virtual {v2, v15, v0, v10}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1687
    .line 1688
    .line 1689
    :cond_29
    invoke-direct {v1}, Landroidx/paging/PageFetcherSnapshot;->onInvalidLoad()V

    .line 1690
    .line 1691
    .line 1692
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 1693
    .line 1694
    return-object v0

    .line 1695
    :cond_2a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 1696
    .line 1697
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1698
    .line 1699
    .line 1700
    throw v0

    .line 1701
    :cond_2b
    :goto_24
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 1702
    .line 1703
    return-object v0

    .line 1704
    :goto_25
    invoke-interface {v7, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1705
    .line 1706
    .line 1707
    throw v0

    .line 1708
    :cond_2c
    :try_start_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1709
    .line 1710
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 1714
    :goto_26
    invoke-interface {v2, v10}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 1715
    .line 1716
    .line 1717
    throw v0

    .line 1718
    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1719
    .line 1720
    invoke-direct {v0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1721
    .line 1722
    .line 1723
    throw v0

    .line 1724
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "TKey;)",
            "Landroidx/paging/PagingSource$LoadParams<",
            "TKey;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/paging/PagingSource$LoadParams;->Companion:Landroidx/paging/PagingSource$LoadParams$Companion;

    .line 2
    .line 3
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Landroidx/paging/PageFetcherSnapshot;->initialLoadSize:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 11
    .line 12
    iget v1, v1, Landroidx/paging/PagingConfig;->pageSize:I

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 15
    .line 16
    iget-boolean v2, v2, Landroidx/paging/PagingConfig;->enablePlaceholders:Z

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/paging/PagingSource$LoadParams$Companion;->create(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Landroidx/paging/PagingSource$LoadParams;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method private final loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "TKey;",
            "Landroidx/paging/PagingSource$LoadResult<",
            "TKey;TValue;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "End "

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    new-instance p3, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " with loadkey "

    .line 17
    .line 18
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, ". Load CANCELLED."

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " with loadKey "

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, ". Returned "

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method private final nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "II)TKey;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroidx/paging/PageFetcherSnapshotState;->generationId$paging_common(Landroidx/paging/LoadType;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p3, v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    instance-of p3, p3, Landroidx/paging/LoadState$Error;

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    iget-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 23
    .line 24
    iget p3, p3, Landroidx/paging/PagingConfig;->prefetchDistance:I

    .line 25
    .line 26
    if-lt p4, p3, :cond_2

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_2
    sget-object p3, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 30
    .line 31
    if-ne p2, p3, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method private final onInvalidLoad()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshot;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/paging/PagingSource;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final retryLoadError(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/ViewportHint;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0, p3}, Landroidx/paging/PageFetcherSnapshot;->doInitialLoad(Lvc/c;)Ljava/lang/Object;

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

    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    iget-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 29
    .line 30
    invoke-virtual {p3, p1, p2}, Landroidx/paging/HintHandler;->forceSetHint(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method private final setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/LoadState$Error;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p2, p3}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 23
    .line 24
    new-instance p3, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p3, p1, v0}, Landroidx/paging/PageEvent$LoadStateUpdate;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p3, p4}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-ne p1, p2, :cond_0

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 53
    .line 54
    return-object p1
.end method

.method private final setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/paging/LoadState$Loading;->INSTANCE:Landroidx/paging/LoadState$Loading;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p2, v1}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/a;

    .line 25
    .line 26
    new-instance v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p1, v1}, Landroidx/paging/PageEvent$LoadStateUpdate;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0, p3}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-ne p1, p2, :cond_0

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p1
.end method

.method private final startConsumingHints(Lsd/i0;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 4
    .line 5
    iget v1, v1, Landroidx/paging/PagingConfig;->jumpThreshold:I

    .line 6
    .line 7
    const/high16 v2, -0x80000000

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v7, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$1;

    .line 13
    .line 14
    invoke-direct {v7, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object/from16 v4, p1

    .line 22
    .line 23
    invoke-static/range {v4 .. v9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v13, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$2;

    .line 27
    .line 28
    invoke-direct {v13, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$2;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    const/4 v14, 0x3

    .line 32
    const/4 v15, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x0

    .line 35
    move-object/from16 v10, p1

    .line 36
    .line 37
    invoke-static/range {v10 .. v15}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 38
    .line 39
    .line 40
    new-instance v13, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$3;

    .line 41
    .line 42
    invoke-direct {v13, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$3;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 43
    .line 44
    .line 45
    invoke-static/range {v10 .. v15}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChannelFlowJob:Lsd/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final currentPagingState(Lvc/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

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
    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lbe/a;

    .line 42
    .line 43
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 63
    .line 64
    invoke-static {p1}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 73
    .line 74
    invoke-interface {v2, v4, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v0, p1

    .line 82
    move-object v1, v2

    .line 83
    :goto_1
    :try_start_0
    invoke-static {v0}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    invoke-interface {v1, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    invoke-interface {v1, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public final forceSetHint(Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->label:I

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
    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lbe/a;

    .line 42
    .line 43
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroidx/paging/LoadType;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v2, p1

    .line 55
    move-object p1, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object p2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 69
    .line 70
    if-eq p1, p2, :cond_5

    .line 71
    .line 72
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 73
    .line 74
    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p2, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$forceSetHint$1;->label:I

    .line 85
    .line 86
    invoke-interface {v2, v4, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v1, :cond_3

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_3
    move-object v1, p2

    .line 94
    :goto_1
    :try_start_0
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    neg-int v6, v0

    .line 103
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sub-int/2addr v0, v1

    .line 116
    add-int/lit8 v11, v0, -0x1

    .line 117
    .line 118
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 119
    .line 120
    if-ne p1, v0, :cond_4

    .line 121
    .line 122
    new-instance v5, Landroidx/paging/ViewportHint$Access;

    .line 123
    .line 124
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lrc/w;->p(Ljava/util/List;)I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getStorageCount$paging_common()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    add-int/lit8 v8, p2, -0x1

    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    move v0, v11

    .line 150
    move v10, v6

    .line 151
    move v6, v0

    .line 152
    invoke-direct/range {v5 .. v11}, Landroidx/paging/ViewportHint$Access;-><init>(IIIIII)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    move-object p1, v0

    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move v0, v11

    .line 160
    new-instance v5, Landroidx/paging/ViewportHint$Access;

    .line 161
    .line 162
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getStorageCount$paging_common()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    add-int/lit8 v9, p2, -0x1

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    move v10, v6

    .line 171
    move v11, v0

    .line 172
    invoke-direct/range {v5 .. v11}, Landroidx/paging/ViewportHint$Access;-><init>(IIIIII)V

    .line 173
    .line 174
    .line 175
    :goto_2
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 176
    .line 177
    invoke-virtual {p2, p1, v5}, Landroidx/paging/HintHandler;->forceSetHint(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V

    .line 178
    .line 179
    .line 180
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    invoke-interface {v2, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 186
    .line 187
    return-object p1

    .line 188
    :goto_3
    invoke-interface {v2, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 193
    .line 194
    const-string p2, "Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer."

    .line 195
    .line 196
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1
.end method

.method public final getInitialKey$paging_common()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TKey;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLoadKey$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Lvc/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;",
            "Lvc/c<",
            "-TKey;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->label:I

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
    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lbe/a;

    .line 42
    .line 43
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v2, p1

    .line 55
    move-object p1, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 69
    .line 70
    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lbe/a;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p2, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$getLoadKey$1;->label:I

    .line 81
    .line 82
    invoke-interface {v2, v4, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    move-object v1, p2

    .line 90
    :goto_1
    :try_start_0
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2, p1}, Landroidx/paging/PageFetcherSnapshotState;->getLoadKey(Landroidx/paging/PagingSource$LoadResult$Page;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    invoke-interface {v2, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    invoke-interface {v2, v4}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public final getPageEventFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventFlow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPagingSource$paging_common()Landroidx/paging/PagingSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRemoteMediatorConnection()Landroidx/paging/RemoteMediatorConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 2
    .line 3
    return-object v0
.end method

.method public final processHint(Landroidx/paging/ViewportHint;)V
    .locals 1

    .line 1
    const-string v0, "viewportHint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/HintHandler;->processHint(Landroidx/paging/ViewportHint;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
