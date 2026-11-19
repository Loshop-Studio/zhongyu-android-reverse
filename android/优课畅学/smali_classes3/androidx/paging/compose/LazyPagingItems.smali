.class public final Landroidx/paging/compose/LazyPagingItems;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final flow:Ll8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/c;"
        }
    .end annotation
.end field

.field private final itemSnapshotList$delegate:Landroidx/compose/runtime/MutableState;

.field private final loadState$delegate:Landroidx/compose/runtime/MutableState;

.field private final mainDispatcher:Lkotlin/coroutines/d;

.field private final pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll8/c;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "flow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/paging/compose/LazyPagingItems;->flow:Ll8/c;

    .line 10
    .line 11
    sget-object v0, Landroidx/compose/ui/platform/AndroidUiDispatcher;->Companion:Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;->getMain()Lkotlin/coroutines/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->mainDispatcher:Lkotlin/coroutines/d;

    .line 18
    .line 19
    instance-of v1, p1, Ll8/l;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast p1, Ll8/l;

    .line 25
    .line 26
    invoke-interface {p1}, Ll8/l;->d()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroidx/paging/PagingData;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p1, v2

    .line 38
    :goto_0
    new-instance v1, Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 39
    .line 40
    invoke-direct {v1, p0, v0, p1}, Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;-><init>(Landroidx/paging/compose/LazyPagingItems;Lkotlin/coroutines/d;Landroidx/paging/PagingData;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/paging/PagingDataPresenter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-static {p1, v2, v0, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Landroidx/paging/compose/LazyPagingItems;->itemSnapshotList$delegate:Landroidx/compose/runtime/MutableState;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroidx/paging/PagingDataPresenter;->getLoadStateFlow()Ll8/q;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Ll8/q;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Landroidx/paging/CombinedLoadStates;

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    new-instance v3, Landroidx/paging/CombinedLoadStates;

    .line 69
    .line 70
    invoke-static {}, Landroidx/paging/compose/LazyPagingItemsKt;->access$getInitialLoadStates$p()Landroidx/paging/LoadStates;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {}, Landroidx/paging/compose/LazyPagingItemsKt;->access$getInitialLoadStates$p()Landroidx/paging/LoadStates;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {}, Landroidx/paging/compose/LazyPagingItemsKt;->access$getInitialLoadStates$p()Landroidx/paging/LoadStates;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static {}, Landroidx/paging/compose/LazyPagingItemsKt;->access$getInitialLoadStates$p()Landroidx/paging/LoadStates;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const/16 v9, 0x10

    .line 99
    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v8, 0x0

    .line 102
    invoke-direct/range {v3 .. v10}, Landroidx/paging/CombinedLoadStates;-><init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;ILkotlin/jvm/internal/n;)V

    .line 103
    .line 104
    .line 105
    move-object p1, v3

    .line 106
    :cond_1
    invoke-static {p1, v2, v0, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Landroidx/paging/compose/LazyPagingItems;->loadState$delegate:Landroidx/compose/runtime/MutableState;

    .line 111
    .line 112
    return-void
.end method

.method public static final synthetic access$getPagingDataPresenter$p(Landroidx/paging/compose/LazyPagingItems;)Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setLoadState(Landroidx/paging/compose/LazyPagingItems;Landroidx/paging/CombinedLoadStates;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/compose/LazyPagingItems;->setLoadState(Landroidx/paging/CombinedLoadStates;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateItemSnapshotList(Landroidx/paging/compose/LazyPagingItems;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/paging/compose/LazyPagingItems;->updateItemSnapshotList()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final setItemSnapshotList(Landroidx/paging/ItemSnapshotList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemSnapshotList<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->itemSnapshotList$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final setLoadState(Landroidx/paging/CombinedLoadStates;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->loadState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final updateItemSnapshotList()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Landroidx/paging/compose/LazyPagingItems;->setItemSnapshotList(Landroidx/paging/ItemSnapshotList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final collectLoadState$paging_compose_release(Lm7/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->getLoadStateFlow()Ll8/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ll8/e;->w(Ll8/c;)Ll8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Landroidx/paging/compose/LazyPagingItems$collectLoadState$2;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Landroidx/paging/compose/LazyPagingItems$collectLoadState$2;-><init>(Landroidx/paging/compose/LazyPagingItems;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 28
    .line 29
    return-object p1
.end method

.method public final collectPagingData$paging_compose_release(Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->flow:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/compose/LazyPagingItems$collectPagingData$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Landroidx/paging/compose/LazyPagingItems$collectPagingData$2;-><init>(Landroidx/paging/compose/LazyPagingItems;Lm7/c;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Ll8/e;->i(Ll8/c;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/paging/compose/LazyPagingItems;->getItemSnapshotList()Landroidx/paging/ItemSnapshotList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroidx/paging/ItemSnapshotList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final getItemCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/compose/LazyPagingItems;->getItemSnapshotList()Landroidx/paging/ItemSnapshotList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li7/b;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final getItemSnapshotList()Landroidx/paging/ItemSnapshotList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/ItemSnapshotList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->itemSnapshotList$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/ItemSnapshotList;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getLoadState()Landroidx/paging/CombinedLoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->loadState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/CombinedLoadStates;

    .line 8
    .line 9
    return-object v0
.end method

.method public final peek(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/paging/compose/LazyPagingItems;->getItemSnapshotList()Landroidx/paging/ItemSnapshotList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/paging/ItemSnapshotList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->refresh()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final retry()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/compose/LazyPagingItems;->pagingDataPresenter:Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->retry()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
