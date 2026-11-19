.class public final Landroidx/paging/PagedList$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PagedList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
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

.annotation runtime Lqc/a;
.end annotation


# instance fields
.field private boundaryCallback:Landroidx/paging/PagedList$BoundaryCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;"
        }
    .end annotation
.end field

.field private final config:Landroidx/paging/PagedList$Config;

.field private coroutineScope:Lsd/i0;

.field private dataSource:Landroidx/paging/DataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private fetchDispatcher:Lsd/e0;

.field private initialKey:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKey;"
        }
    .end annotation
.end field

.field private final initialPage:Landroidx/paging/PagingSource$LoadResult$Page;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private notifyDispatcher:Lsd/e0;

.field private final pagingSource:Landroidx/paging/PagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/DataSource;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;I)V"
        }
    .end annotation

    const-string v0, "dataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v1, p2

    .line 7
    invoke-static/range {v1 .. v7}, Landroidx/paging/PagedListConfigKt;->Config$default(IIZIIILjava/lang/Object;)Landroidx/paging/PagedList$Config;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroidx/paging/PagedList$Builder;-><init>(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V

    return-void
.end method

.method public constructor <init>(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagedList$Config;",
            ")V"
        }
    .end annotation

    const-string v0, "dataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lsd/h1;->c:Lsd/h1;

    iput-object v0, p0, Landroidx/paging/PagedList$Builder;->coroutineScope:Lsd/i0;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Landroidx/paging/PagedList$Builder;->pagingSource:Landroidx/paging/PagingSource;

    .line 4
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->dataSource:Landroidx/paging/DataSource;

    .line 5
    iput-object v0, p0, Landroidx/paging/PagedList$Builder;->initialPage:Landroidx/paging/PagingSource$LoadResult$Page;

    .line 6
    iput-object p2, p0, Landroidx/paging/PagedList$Builder;->config:Landroidx/paging/PagedList$Config;

    return-void
.end method

.method public constructor <init>(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;I)V"
        }
    .end annotation

    const-string v0, "pagingSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialPage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v1, p3

    .line 14
    invoke-static/range {v1 .. v7}, Landroidx/paging/PagedListConfigKt;->Config$default(IIZIIILjava/lang/Object;)Landroidx/paging/PagedList$Config;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PagedList$Builder;-><init>(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V

    return-void
.end method

.method public constructor <init>(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagedList$Config;",
            ")V"
        }
    .end annotation

    const-string v0, "pagingSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialPage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lsd/h1;->c:Lsd/h1;

    iput-object v0, p0, Landroidx/paging/PagedList$Builder;->coroutineScope:Lsd/i0;

    .line 10
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->pagingSource:Landroidx/paging/PagingSource;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->dataSource:Landroidx/paging/DataSource;

    .line 12
    iput-object p2, p0, Landroidx/paging/PagedList$Builder;->initialPage:Landroidx/paging/PagingSource$LoadResult$Page;

    .line 13
    iput-object p3, p0, Landroidx/paging/PagedList$Builder;->config:Landroidx/paging/PagedList$Config;

    return-void
.end method

.method private static synthetic getCoroutineScope$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final build()Landroidx/paging/PagedList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagedList<",
            "TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList$Builder;->fetchDispatcher:Lsd/e0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    move-object v6, v0

    .line 10
    iget-object v0, p0, Landroidx/paging/PagedList$Builder;->pagingSource:Landroidx/paging/PagingSource;

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/paging/PagedList$Builder;->dataSource:Landroidx/paging/DataSource;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v1, Landroidx/paging/LegacyPagingSource;

    .line 19
    .line 20
    invoke-direct {v1, v6, v0}, Landroidx/paging/LegacyPagingSource;-><init>(Lkotlin/coroutines/d;Landroidx/paging/DataSource;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :cond_2
    :goto_0
    move-object v2, v0

    .line 27
    nop

    .line 28
    instance-of v0, v2, Landroidx/paging/LegacyPagingSource;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    move-object v0, v2

    .line 33
    check-cast v0, Landroidx/paging/LegacyPagingSource;

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/paging/PagedList$Builder;->config:Landroidx/paging/PagedList$Config;

    .line 36
    .line 37
    iget v1, v1, Landroidx/paging/PagedList$Config;->pageSize:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroidx/paging/LegacyPagingSource;->setPageSize(I)V

    .line 40
    .line 41
    .line 42
    :cond_3
    if-eqz v2, :cond_5

    .line 43
    .line 44
    sget-object v1, Landroidx/paging/PagedList;->Companion:Landroidx/paging/PagedList$Companion;

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/paging/PagedList$Builder;->initialPage:Landroidx/paging/PagingSource$LoadResult$Page;

    .line 47
    .line 48
    iget-object v4, p0, Landroidx/paging/PagedList$Builder;->coroutineScope:Lsd/i0;

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/paging/PagedList$Builder;->notifyDispatcher:Lsd/e0;

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lsd/t1;->i()Lsd/t1;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_4
    move-object v5, v0

    .line 63
    iget-object v7, p0, Landroidx/paging/PagedList$Builder;->boundaryCallback:Landroidx/paging/PagedList$BoundaryCallback;

    .line 64
    .line 65
    iget-object v8, p0, Landroidx/paging/PagedList$Builder;->config:Landroidx/paging/PagedList$Config;

    .line 66
    .line 67
    iget-object v9, p0, Landroidx/paging/PagedList$Builder;->initialKey:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual/range {v1 .. v9}, Landroidx/paging/PagedList$Companion;->create(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lsd/i0;Lsd/e0;Lsd/e0;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "PagedList cannot be built without a PagingSource or DataSource"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method

.method public final setBoundaryCallback(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/PagedList$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;)",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->boundaryCallback:Landroidx/paging/PagedList$BoundaryCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setCoroutineScope(Lsd/i0;)Landroidx/paging/PagedList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            ")",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "coroutineScope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->coroutineScope:Lsd/i0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setFetchDispatcher(Lsd/e0;)Landroidx/paging/PagedList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/e0;",
            ")",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "fetchDispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->fetchDispatcher:Lsd/e0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setFetchExecutor(Ljava/util/concurrent/Executor;)Landroidx/paging/PagedList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    const-string v0, "fetchExecutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->fetchDispatcher:Lsd/e0;

    .line 11
    .line 12
    return-object p0
.end method

.method public final setInitialKey(Ljava/lang/Object;)Landroidx/paging/PagedList$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;)",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->initialKey:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setNotifyDispatcher(Lsd/e0;)Landroidx/paging/PagedList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/e0;",
            ")",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "notifyDispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->notifyDispatcher:Lsd/e0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setNotifyExecutor(Ljava/util/concurrent/Executor;)Landroidx/paging/PagedList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/paging/PagedList$Builder<",
            "TKey;TValue;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    const-string v0, "notifyExecutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/paging/PagedList$Builder;->notifyDispatcher:Lsd/e0;

    .line 11
    .line 12
    return-object p0
.end method
