.class public final Landroidx/paging/PageFetcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcher$GenerationInfo;,
        Landroidx/paging/PageFetcher$LoadRequest;,
        Landroidx/paging/PageFetcher$PagerHintReceiver;,
        Landroidx/paging/PageFetcher$PagerUiReceiver;,
        Landroidx/paging/PageFetcher$RefreshType;,
        Landroidx/paging/PageFetcher$WhenMappings;
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
.field private final config:Landroidx/paging/PagingConfig;

.field private final flow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final initialKey:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKey;"
        }
    .end annotation
.end field

.field private final loadRequests:Landroidx/paging/ConflatedEventBus;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/ConflatedEventBus<",
            "Landroidx/paging/PageFetcher$LoadRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final pagingSourceFactory:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final retryEvents:Landroidx/paging/ConflatedEventBus;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/ConflatedEventBus<",
            "Lqc/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "TKey;",
            "Landroidx/paging/PagingConfig;",
            "Landroidx/paging/RemoteMediator<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    const-string v0, "pagingSourceFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/paging/PageFetcher;->pagingSourceFactory:Lhd/l;

    .line 3
    iput-object p2, p0, Landroidx/paging/PageFetcher;->initialKey:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Landroidx/paging/PageFetcher;->config:Landroidx/paging/PagingConfig;

    .line 5
    new-instance p1, Landroidx/paging/ConflatedEventBus;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3, p2}, Landroidx/paging/ConflatedEventBus;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/n;)V

    iput-object p1, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 6
    new-instance p1, Landroidx/paging/ConflatedEventBus;

    invoke-direct {p1, p2, p3, p2}, Landroidx/paging/ConflatedEventBus;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/n;)V

    iput-object p1, p0, Landroidx/paging/PageFetcher;->retryEvents:Landroidx/paging/ConflatedEventBus;

    .line 7
    new-instance p1, Landroidx/paging/PageFetcher$flow$1;

    invoke-direct {p1, p4, p0, p2}, Landroidx/paging/PageFetcher$flow$1;-><init>(Landroidx/paging/RemoteMediator;Landroidx/paging/PageFetcher;Lvc/c;)V

    invoke-static {p1}, Landroidx/paging/SimpleChannelFlowKt;->simpleChannelFlow(Lhd/p;)Lvd/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcher;->flow:Lvd/c;

    return-void
.end method

.method public synthetic constructor <init>(Lhd/l;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/PageFetcher;-><init>(Lhd/l;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V

    return-void
.end method

.method public static final synthetic access$generateNewPagingSource(Landroidx/paging/PageFetcher;Landroidx/paging/PagingSource;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PageFetcher;->generateNewPagingSource(Landroidx/paging/PagingSource;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Landroidx/paging/PageFetcher;)Landroidx/paging/PagingConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcher;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getInitialKey$p(Landroidx/paging/PageFetcher;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcher;->initialKey:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLoadRequests$p(Landroidx/paging/PageFetcher;)Landroidx/paging/ConflatedEventBus;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRetryEvents$p(Landroidx/paging/PageFetcher;)Landroidx/paging/ConflatedEventBus;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcher;->retryEvents:Landroidx/paging/ConflatedEventBus;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$injectRemoteEvents(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;Lkotlinx/coroutines/g;Landroidx/paging/RemoteMediatorAccessor;)Lvd/c;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcher;->injectRemoteEvents(Landroidx/paging/PageFetcherSnapshot;Lkotlinx/coroutines/g;Landroidx/paging/RemoteMediatorAccessor;)Lvd/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$invalidate(Landroidx/paging/PageFetcher;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/paging/PageFetcher;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final generateNewPagingSource(Landroidx/paging/PagingSource;Lvc/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageFetcher$generateNewPagingSource$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->label:I

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
    iput v1, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageFetcher$generateNewPagingSource$1;-><init>(Landroidx/paging/PageFetcher;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroidx/paging/PagingSource;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Landroidx/paging/PageFetcher;->pagingSourceFactory:Lhd/l;

    .line 58
    .line 59
    iput-object p1, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, Landroidx/paging/PageFetcher$generateNewPagingSource$1;->label:I

    .line 62
    .line 63
    invoke-interface {p2, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p2, Landroidx/paging/PagingSource;

    .line 71
    .line 72
    instance-of v0, p2, Landroidx/paging/CompatLegacyPagingSource;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    move-object v0, p2

    .line 77
    check-cast v0, Landroidx/paging/CompatLegacyPagingSource;

    .line 78
    .line 79
    iget-object v1, p0, Landroidx/paging/PageFetcher;->config:Landroidx/paging/PagingConfig;

    .line 80
    .line 81
    iget v1, v1, Landroidx/paging/PagingConfig;->pageSize:I

    .line 82
    .line 83
    invoke-interface {v0, v1}, Landroidx/paging/CompatLegacyPagingSource;->setPageSize(I)V

    .line 84
    .line 85
    .line 86
    :cond_4
    if-eq p2, p1, :cond_8

    .line 87
    .line 88
    new-instance v0, Landroidx/paging/PageFetcher$generateNewPagingSource$3;

    .line 89
    .line 90
    invoke-direct {v0, p0}, Landroidx/paging/PageFetcher$generateNewPagingSource$3;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroidx/paging/PagingSource;->registerInvalidatedCallback(Lhd/a;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    new-instance v0, Landroidx/paging/PageFetcher$generateNewPagingSource$4;

    .line 99
    .line 100
    invoke-direct {v0, p0}, Landroidx/paging/PageFetcher$generateNewPagingSource$4;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroidx/paging/PagingSource;->unregisterInvalidatedCallback(Lhd/a;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    if-eqz p1, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, Landroidx/paging/PagingSource;->invalidate()V

    .line 109
    .line 110
    .line 111
    :cond_6
    sget-object p1, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 112
    .line 113
    const/4 v0, 0x3

    .line 114
    invoke-virtual {p1, v0}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v2, "Generated new PagingSource "

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-virtual {p1, v0, v1, v2}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    return-object p2

    .line 142
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    const-string p2, "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method

.method private final injectRemoteEvents(Landroidx/paging/PageFetcherSnapshot;Lkotlinx/coroutines/g;Landroidx/paging/RemoteMediatorAccessor;)Lvd/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshot<",
            "TKey;TValue;>;",
            "Lkotlinx/coroutines/g;",
            "Landroidx/paging/RemoteMediatorAccessor<",
            "TKey;TValue;>;)",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshot;->getPageEventFlow()Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v0, Landroidx/paging/MutableLoadStateCollection;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/paging/MutableLoadStateCollection;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroidx/paging/PageFetcher$injectRemoteEvents$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p3, p1, v0, v2}, Landroidx/paging/PageFetcher$injectRemoteEvents$1;-><init>(Landroidx/paging/RemoteMediatorAccessor;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/MutableLoadStateCollection;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p2, v1}, Landroidx/paging/CancelableChannelFlowKt;->cancelableChannelFlow(Lkotlinx/coroutines/g;Lhd/p;)Lvd/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method private final invalidate()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Landroidx/paging/PageFetcher$RefreshType$Anchor;->INSTANCE:Landroidx/paging/PageFetcher$RefreshType$Anchor;

    .line 7
    .line 8
    invoke-direct {v1, v2, v3}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;-><init>(ZLandroidx/paging/PageFetcher$RefreshType;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/paging/ConflatedEventBus;->send(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic refresh$default(Landroidx/paging/PageFetcher;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcher;->refresh(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher;->flow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final load(Landroidx/paging/LoadType;)V
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/PageFetcher$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 24
    .line 25
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Load only applies to APPEND or PREPEND"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    sget-object p1, Landroidx/paging/PageFetcher$LoadRequest$Prepend;->INSTANCE:Landroidx/paging/PageFetcher$LoadRequest$Prepend;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    sget-object p1, Landroidx/paging/PageFetcher$LoadRequest$Append;->INSTANCE:Landroidx/paging/PageFetcher$LoadRequest$Append;

    .line 41
    .line 42
    :goto_0
    iget-object v0, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroidx/paging/ConflatedEventBus;->send(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final refresh(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Landroidx/paging/PageFetcher$RefreshType$Anchor;->INSTANCE:Landroidx/paging/PageFetcher$RefreshType$Anchor;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcher$RefreshType$Item;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/paging/PageFetcher$RefreshType$Item;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :goto_0
    iget-object v0, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 13
    .line 14
    new-instance v1, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, v2, p1}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;-><init>(ZLandroidx/paging/PageFetcher$RefreshType;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/paging/ConflatedEventBus;->send(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final refreshAll()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher;->loadRequests:Landroidx/paging/ConflatedEventBus;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Landroidx/paging/PageFetcher$RefreshType$All;->INSTANCE:Landroidx/paging/PageFetcher$RefreshType$All;

    .line 7
    .line 8
    invoke-direct {v1, v2, v3}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;-><init>(ZLandroidx/paging/PageFetcher$RefreshType;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/paging/ConflatedEventBus;->send(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final retry()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcher;->retryEvents:Landroidx/paging/ConflatedEventBus;

    .line 2
    .line 3
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/paging/ConflatedEventBus;->send(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
