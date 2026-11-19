.class public final Landroidx/paging/PageFetcherSnapshotState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcherSnapshotState$Holder;,
        Landroidx/paging/PageFetcherSnapshotState$WhenMappings;
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
.field private final _pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;"
        }
    .end annotation
.end field

.field private _placeholdersAfter:I

.field private _placeholdersBefore:I

.field private appendGenerationId:I

.field private final appendGenerationIdCh:Lkotlinx/coroutines/channels/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/a;"
        }
    .end annotation
.end field

.field private final config:Landroidx/paging/PagingConfig;

.field private final failedHintsByLoadType:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/ViewportHint;",
            ">;"
        }
    .end annotation
.end field

.field private initialPageIndex:I

.field private final pageKeys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "TKey;>;"
        }
    .end annotation
.end field

.field private final pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;"
        }
    .end annotation
.end field

.field private prependGenerationId:I

.field private final prependGenerationIdCh:Lkotlinx/coroutines/channels/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/a;"
        }
    .end annotation
.end field

.field private sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;


# direct methods
.method private constructor <init>(Landroidx/paging/PagingConfig;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 5
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    const/4 p1, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x6

    .line 7
    invoke-static {p1, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/b;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lhd/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/a;

    move-result-object v2

    iput-object v2, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 8
    invoke-static {p1, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/b;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lhd/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/a;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->failedHintsByLoadType:Ljava/util/Map;

    .line 10
    new-instance p1, Landroidx/paging/MutableLoadStateCollection;

    invoke-direct {p1}, Landroidx/paging/MutableLoadStateCollection;-><init>()V

    .line 11
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    sget-object v1, Landroidx/paging/LoadState$Loading;->INSTANCE:Landroidx/paging/LoadState$Loading;

    invoke-virtual {p1, v0, v1}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 12
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/paging/PagingConfig;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;-><init>(Landroidx/paging/PagingConfig;)V

    return-void
.end method

.method public static final synthetic access$getAppendGenerationId$p(Landroidx/paging/PageFetcherSnapshotState;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getAppendGenerationIdCh$p(Landroidx/paging/PageFetcherSnapshotState;)Lkotlinx/coroutines/channels/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPrependGenerationId$p(Landroidx/paging/PageFetcherSnapshotState;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getPrependGenerationIdCh$p(Landroidx/paging/PageFetcherSnapshotState;)Lkotlinx/coroutines/channels/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final consumeAppendGenerationIdAsFlow()Lvd/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-static {v0}, Lvd/e;->l(Lud/l;)Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroidx/paging/PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Landroidx/paging/PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1;-><init>(Landroidx/paging/PageFetcherSnapshotState;Lvc/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lvd/e;->L(Lvd/c;Lhd/p;)Lvd/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final consumePrependGenerationIdAsFlow()Lvd/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-static {v0}, Lvd/e;->l(Lud/l;)Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroidx/paging/PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Landroidx/paging/PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1;-><init>(Landroidx/paging/PageFetcherSnapshotState;Lvc/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lvd/e;->L(Lvd/c;Lhd/p;)Lvd/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final currentPagingState$paging_common(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ViewportHint$Access;",
            ")",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-static {v0}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget v2, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 16
    .line 17
    neg-int v2, v2

    .line 18
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v3}, Lrc/w;->p(Ljava/util/List;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iget v4, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 25
    .line 26
    sub-int/2addr v3, v4

    .line 27
    invoke-virtual {p1}, Landroidx/paging/ViewportHint$Access;->getPageOffset()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    move v5, v2

    .line 32
    :goto_0
    if-ge v5, v4, :cond_1

    .line 33
    .line 34
    if-le v5, v3, :cond_0

    .line 35
    .line 36
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 37
    .line 38
    iget v6, v6, Landroidx/paging/PagingConfig;->pageSize:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 42
    .line 43
    iget v7, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 44
    .line 45
    add-int/2addr v7, v5

    .line 46
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 51
    .line 52
    invoke-virtual {v6}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    :goto_1
    add-int/2addr v1, v6

    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/ViewportHint;->getPresentedItemsAfter()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-gez v3, :cond_2

    .line 69
    .line 70
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/paging/ViewportHint$Access;->getPageOffset()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iget v5, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 77
    .line 78
    add-int/2addr v4, v5

    .line 79
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    add-int/lit8 v3, v3, -0x1

    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/paging/ViewportHint;->getPresentedItemsAfter()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    add-int/2addr v3, v4

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/ViewportHint;->getPresentedItemsBefore()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-gez v3, :cond_3

    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/paging/ViewportHint;->getPresentedItemsBefore()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/ViewportHint$Access;->getIndexInPage()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    :goto_2
    add-int/2addr v1, v3

    .line 121
    invoke-virtual {p1}, Landroidx/paging/ViewportHint$Access;->getPageOffset()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ge p1, v2, :cond_4

    .line 126
    .line 127
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 128
    .line 129
    iget p1, p1, Landroidx/paging/PagingConfig;->pageSize:I

    .line 130
    .line 131
    sub-int/2addr v1, p1

    .line 132
    :cond_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    const/4 p1, 0x0

    .line 138
    :goto_3
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    new-instance v3, Landroidx/paging/PagingState;

    .line 145
    .line 146
    invoke-direct {v3, v0, p1, v1, v2}, Landroidx/paging/PagingState;-><init>(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/PagingConfig;I)V

    .line 147
    .line 148
    .line 149
    return-object v3
.end method

.method public final drop(Landroidx/paging/PageEvent$Drop;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Drop<",
            "TValue;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPageCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gt v0, v1, :cond_4

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->failedHintsByLoadType:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v1, v2}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    aget v0, v1, v0

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    const/4 v2, 0x0

    .line 56
    if-eq v0, v1, :cond_2

    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    if-ne v0, v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPageCount()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :goto_0
    if-ge v2, v0, :cond_0

    .line 66
    .line 67
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 68
    .line 69
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    add-int/lit8 v3, v3, -0x1

    .line 76
    .line 77
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 82
    .line 83
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersAfter$paging_common(I)V

    .line 104
    .line 105
    .line 106
    iget p1, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationId:I

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x1

    .line 109
    .line 110
    iput p1, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationId:I

    .line 111
    .line 112
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 113
    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v2, "cannot drop "

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPageCount()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    move v1, v2

    .line 154
    :goto_1
    if-ge v1, v0, :cond_3

    .line 155
    .line 156
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 163
    .line 164
    iget-object v4, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 165
    .line 166
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_3
    iget v0, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 181
    .line 182
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPageCount()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    sub-int/2addr v0, v1

    .line 187
    iput v0, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 188
    .line 189
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersBefore$paging_common(I)V

    .line 194
    .line 195
    .line 196
    iget p1, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationId:I

    .line 197
    .line 198
    add-int/lit8 p1, p1, 0x1

    .line 199
    .line 200
    iput p1, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationId:I

    .line 201
    .line 202
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationIdCh:Lkotlinx/coroutines/channels/a;

    .line 203
    .line 204
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v1, "invalid drop count. have "

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 223
    .line 224
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v1, " but wanted to drop "

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPageCount()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0
.end method

.method public final dropEventOrNull(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)Landroidx/paging/PageEvent$Drop;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/ViewportHint;",
            ")",
            "Landroidx/paging/PageEvent$Drop<",
            "TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "hint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 12
    .line 13
    iget v0, v0, Landroidx/paging/PagingConfig;->maxSize:I

    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x2

    .line 29
    if-gt v0, v1, :cond_1

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getStorageCount$paging_common()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v3, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 37
    .line 38
    iget v3, v3, Landroidx/paging/PagingConfig;->maxSize:I

    .line 39
    .line 40
    if-gt v0, v3, :cond_2

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_2
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 44
    .line 45
    if-eq p1, v0, :cond_b

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    move v3, v0

    .line 49
    move v4, v3

    .line 50
    :goto_0
    iget-object v5, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ge v3, v5, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getStorageCount$paging_common()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    sub-int/2addr v5, v4

    .line 63
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 64
    .line 65
    iget v6, v6, Landroidx/paging/PagingConfig;->maxSize:I

    .line 66
    .line 67
    if-le v5, v6, :cond_5

    .line 68
    .line 69
    sget-object v5, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    aget v6, v5, v6

    .line 76
    .line 77
    if-ne v6, v1, :cond_3

    .line 78
    .line 79
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 86
    .line 87
    invoke-virtual {v6}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 97
    .line 98
    invoke-static {v6}, Lrc/w;->p(Ljava/util/List;)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    sub-int/2addr v7, v3

    .line 103
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 108
    .line 109
    invoke-virtual {v6}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    aget v5, v5, v7

    .line 122
    .line 123
    if-ne v5, v1, :cond_4

    .line 124
    .line 125
    invoke-virtual {p2}, Landroidx/paging/ViewportHint;->getPresentedItemsBefore()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    :goto_2
    sub-int/2addr v5, v4

    .line 130
    sub-int/2addr v5, v6

    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-virtual {p2}, Landroidx/paging/ViewportHint;->getPresentedItemsAfter()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    goto :goto_2

    .line 137
    :goto_3
    iget-object v7, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 138
    .line 139
    iget v7, v7, Landroidx/paging/PagingConfig;->prefetchDistance:I

    .line 140
    .line 141
    if-lt v5, v7, :cond_5

    .line 142
    .line 143
    add-int/2addr v4, v6

    .line 144
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_5
    if-nez v3, :cond_6

    .line 148
    .line 149
    return-object v2

    .line 150
    :cond_6
    new-instance p2, Landroidx/paging/PageEvent$Drop;

    .line 151
    .line 152
    sget-object v2, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    aget v5, v2, v5

    .line 159
    .line 160
    if-ne v5, v1, :cond_7

    .line 161
    .line 162
    iget v5, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 163
    .line 164
    neg-int v5, v5

    .line 165
    goto :goto_4

    .line 166
    :cond_7
    iget-object v5, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 167
    .line 168
    invoke-static {v5}, Lrc/w;->p(Ljava/util/List;)I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    iget v6, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 173
    .line 174
    sub-int/2addr v5, v6

    .line 175
    add-int/lit8 v6, v3, -0x1

    .line 176
    .line 177
    sub-int/2addr v5, v6

    .line 178
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    aget v2, v2, v6

    .line 183
    .line 184
    if-ne v2, v1, :cond_8

    .line 185
    .line 186
    add-int/lit8 v3, v3, -0x1

    .line 187
    .line 188
    iget v1, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 189
    .line 190
    sub-int/2addr v3, v1

    .line 191
    goto :goto_5

    .line 192
    :cond_8
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 193
    .line 194
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iget v2, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 199
    .line 200
    sub-int v3, v1, v2

    .line 201
    .line 202
    :goto_5
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 203
    .line 204
    iget-boolean v1, v1, Landroidx/paging/PagingConfig;->enablePlaceholders:Z

    .line 205
    .line 206
    if-nez v1, :cond_9

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_9
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 210
    .line 211
    if-ne p1, v0, :cond_a

    .line 212
    .line 213
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    :goto_6
    add-int/2addr v0, v4

    .line 218
    goto :goto_7

    .line 219
    :cond_a
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersAfter$paging_common()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    goto :goto_6

    .line 224
    :goto_7
    invoke-direct {p2, p1, v5, v3, v0}, Landroidx/paging/PageEvent$Drop;-><init>(Landroidx/paging/LoadType;III)V

    .line 225
    .line 226
    .line 227
    return-object p2

    .line 228
    :cond_b
    new-instance p2, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string v0, "Drop LoadType must be PREPEND or APPEND, but got "

    .line 234
    .line 235
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p2
.end method

.method public final generationId$paging_common(Landroidx/paging/LoadType;)I
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

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
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget p1, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationId:I

    .line 24
    .line 25
    return p1

    .line 26
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 27
    .line 28
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget p1, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationId:I

    .line 33
    .line 34
    return p1

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string v0, "Cannot get loadId for loadType: REFRESH"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public final getFailedHintsByLoadType$paging_common()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/ViewportHint;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->failedHintsByLoadType:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInitialPageIndex$paging_common()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLoadKey(Landroidx/paging/PagingSource$LoadResult$Page;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;)TKey;"
        }
    .end annotation

    .line 1
    const-string v0, "page"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "Load key not found for Page "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, ". This likely indicates an error in the library. Please file a bug in the Buganizer."

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method public final getPages$paging_common()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholdersAfter$paging_common()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/paging/PagingConfig;->enablePlaceholders:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Landroidx/paging/PageFetcherSnapshotState;->_placeholdersAfter:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final getPlaceholdersBefore$paging_common()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/paging/PagingConfig;->enablePlaceholders:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Landroidx/paging/PageFetcherSnapshotState;->_placeholdersBefore:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final getSourceLoadStates$paging_common()Landroidx/paging/MutableLoadStateCollection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStorageCount$paging_common()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return v1
.end method

.method public final insert(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)Z
    .locals 4
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;TKey;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "page"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    aget p2, v0, p2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-eq p2, v1, :cond_8

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    const/high16 v3, -0x80000000

    .line 25
    .line 26
    if-eq p2, v2, :cond_4

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    if-ne p2, v2, :cond_3

    .line 30
    .line 31
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 32
    .line 33
    check-cast p2, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    iget p2, p0, Landroidx/paging/PageFetcherSnapshotState;->appendGenerationId:I

    .line 42
    .line 43
    if-eq p1, p2, :cond_0

    .line 44
    .line 45
    return v0

    .line 46
    :cond_0
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 52
    .line 53
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsAfter()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ne p1, v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersAfter$paging_common()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    sub-int/2addr p1, p2

    .line 83
    invoke-static {p1, v0}, Lnd/o;->e(II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsAfter()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersAfter$paging_common(I)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->failedHintsByLoadType:Ljava/util/Map;

    .line 96
    .line 97
    sget-object p2, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 98
    .line 99
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    const-string p2, "should\'ve received an init before append"

    .line 107
    .line 108
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 113
    .line 114
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_4
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 119
    .line 120
    check-cast p2, Ljava/util/Collection;

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-nez p2, :cond_7

    .line 127
    .line 128
    iget p2, p0, Landroidx/paging/PageFetcherSnapshotState;->prependGenerationId:I

    .line 129
    .line 130
    if-eq p1, p2, :cond_5

    .line 131
    .line 132
    return v0

    .line 133
    :cond_5
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {p1, v0, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 139
    .line 140
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    iget p1, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 152
    .line 153
    add-int/2addr p1, v1

    .line 154
    iput p1, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 155
    .line 156
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsBefore()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-ne p1, v3, :cond_6

    .line 161
    .line 162
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    sub-int/2addr p1, p2

    .line 175
    invoke-static {p1, v0}, Lnd/o;->e(II)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    goto :goto_1

    .line 180
    :cond_6
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsBefore()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersBefore$paging_common(I)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->failedHintsByLoadType:Ljava/util/Map;

    .line 188
    .line 189
    sget-object p2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 190
    .line 191
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 196
    .line 197
    const-string p2, "should\'ve received an init before prepend"

    .line 198
    .line 199
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_8
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-eqz p2, :cond_a

    .line 210
    .line 211
    if-nez p1, :cond_9

    .line 212
    .line 213
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_pages:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->pageKeys:Ljava/util/Map;

    .line 219
    .line 220
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->hashCode()I

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    iput v0, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 232
    .line 233
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsAfter()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersAfter$paging_common(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p3}, Landroidx/paging/PagingSource$LoadResult$Page;->getItemsBefore()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-virtual {p0, p1}, Landroidx/paging/PageFetcherSnapshotState;->setPlaceholdersBefore$paging_common(I)V

    .line 245
    .line 246
    .line 247
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 248
    .line 249
    :goto_2
    return v1

    .line 250
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    const-string p2, "init loadId must be the initial value, 0"

    .line 253
    .line 254
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 259
    .line 260
    const-string p2, "cannot receive multiple init calls"

    .line 261
    .line 262
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1
.end method

.method public final setPlaceholdersAfter$paging_common(I)V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    iput p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_placeholdersAfter:I

    .line 7
    .line 8
    return-void
.end method

.method public final setPlaceholdersBefore$paging_common(I)V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    iput p1, p0, Landroidx/paging/PageFetcherSnapshotState;->_placeholdersBefore:I

    .line 7
    .line 8
    return-void
.end method

.method public final toPageEvent$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            ")",
            "Landroidx/paging/PageEvent<",
            "TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "loadType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/PageFetcherSnapshotState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aget v1, v0, v1

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v1, v5, :cond_2

    .line 24
    .line 25
    if-eq v1, v4, :cond_1

    .line 26
    .line 27
    if-ne v1, v3, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->pages:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v2, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 36
    .line 37
    sub-int/2addr v1, v2

    .line 38
    add-int/lit8 v2, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 42
    .line 43
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    iget v1, p0, Landroidx/paging/PageFetcherSnapshotState;->initialPageIndex:I

    .line 48
    .line 49
    sub-int/2addr v2, v1

    .line 50
    :cond_2
    :goto_0
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v1, v2, p1}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    aget p1, v0, p1

    .line 68
    .line 69
    if-eq p1, v5, :cond_5

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    if-eq p1, v4, :cond_4

    .line 73
    .line 74
    if-ne p1, v3, :cond_3

    .line 75
    .line 76
    sget-object p1, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersAfter$paging_common()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p1, v7, v0, v1, p2}, Landroidx/paging/PageEvent$Insert$Companion;->Append(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 94
    .line 95
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_4
    sget-object p1, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p1, v7, v0, v1, p2}, Landroidx/paging/PageEvent$Insert$Companion;->Prepend(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :cond_5
    sget-object v6, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersBefore$paging_common()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshotState;->getPlaceholdersAfter$paging_common()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    iget-object p1, p0, Landroidx/paging/PageFetcherSnapshotState;->sourceLoadStates:Landroidx/paging/MutableLoadStateCollection;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    const/4 v11, 0x0

    .line 133
    invoke-virtual/range {v6 .. v11}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1
.end method
