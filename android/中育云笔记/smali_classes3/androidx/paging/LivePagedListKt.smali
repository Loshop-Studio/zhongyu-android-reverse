.class public final Landroidx/paging/LivePagedListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final toLiveData(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/DataSource$Factory<",
            "TKey;TValue;>;ITKey;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/paging/PagedList<",
            "TValue;>;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchExecutor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Landroidx/paging/LivePagedListBuilder;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/paging/PagedListConfigKt;->Config$default(IIZIIILjava/lang/Object;)Landroidx/paging/PagedList$Config;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/paging/LivePagedListBuilder;-><init>(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V

    .line 7
    invoke-virtual {v0, p2}, Landroidx/paging/LivePagedListBuilder;->setInitialLoadKey(Ljava/lang/Object;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p3}, Landroidx/paging/LivePagedListBuilder;->setBoundaryCallback(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 9
    invoke-virtual {p0, p4}, Landroidx/paging/LivePagedListBuilder;->setFetchExecutor(Ljava/util/concurrent/Executor;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroidx/paging/LivePagedListBuilder;->build()Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static final toLiveData(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/DataSource$Factory<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagedList$Config;",
            "TKey;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/paging/PagedList<",
            "TValue;>;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchExecutor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/LivePagedListBuilder;

    invoke-direct {v0, p0, p1}, Landroidx/paging/LivePagedListBuilder;-><init>(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V

    .line 2
    invoke-virtual {v0, p2}, Landroidx/paging/LivePagedListBuilder;->setInitialLoadKey(Ljava/lang/Object;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p3}, Landroidx/paging/LivePagedListBuilder;->setBoundaryCallback(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p4}, Landroidx/paging/LivePagedListBuilder;->setFetchExecutor(Ljava/util/concurrent/Executor;)Landroidx/paging/LivePagedListBuilder;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/paging/LivePagedListBuilder;->build()Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static final toLiveData(Lhd/a;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;)Landroidx/lifecycle/LiveData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/a;",
            "ITKey;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;",
            "Lsd/i0;",
            "Lsd/e0;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/paging/PagedList<",
            "TValue;>;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v1, Landroidx/paging/LivePagedList;

    .line 15
    new-instance v0, Landroidx/paging/PagedList$Config$Builder;

    invoke-direct {v0}, Landroidx/paging/PagedList$Config$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/paging/PagedList$Config$Builder;->setPageSize(I)Landroidx/paging/PagedList$Config$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/paging/PagedList$Config$Builder;->build()Landroidx/paging/PagedList$Config;

    move-result-object v4

    .line 16
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getMainThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    const-string v0, "getMainThreadExecutor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    move-result-object v7

    move-object v6, p0

    move-object v3, p2

    move-object v5, p3

    move-object v2, p4

    move-object v8, p5

    .line 17
    invoke-direct/range {v1 .. v8}, Landroidx/paging/LivePagedList;-><init>(Lsd/i0;Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lhd/a;Lsd/e0;Lsd/e0;)V

    return-object v1
.end method

.method public static final toLiveData(Lhd/a;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;)Landroidx/lifecycle/LiveData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Value:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/a;",
            "Landroidx/paging/PagedList$Config;",
            "TKey;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TValue;>;",
            "Lsd/i0;",
            "Lsd/e0;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/paging/PagedList<",
            "TValue;>;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v1, Landroidx/paging/LivePagedList;

    .line 12
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getMainThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v2, "getMainThreadExecutor(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    move-result-object v7

    move-object v6, p0

    move-object v4, p1

    move-object v3, p2

    move-object v5, p3

    move-object v2, p4

    move-object v8, p5

    .line 13
    invoke-direct/range {v1 .. v8}, Landroidx/paging/LivePagedList;-><init>(Lsd/i0;Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lhd/a;Lsd/e0;Lsd/e0;)V

    return-object v1
.end method

.method public static synthetic toLiveData$default(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 3
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getIOThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p4

    const-string p5, "getIOThreadExecutor(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/paging/LivePagedListKt;->toLiveData(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toLiveData$default(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 1
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getIOThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p4

    const-string p5, "getIOThreadExecutor(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/paging/LivePagedListKt;->toLiveData(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toLiveData$default(Lhd/a;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    .line 8
    sget-object p4, Lsd/h1;->c:Lsd/h1;

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    .line 9
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getIOThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p5

    const-string p6, "getIOThreadExecutor(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    move-result-object p5

    .line 10
    :cond_3
    invoke-static/range {p0 .. p5}, Landroidx/paging/LivePagedListKt;->toLiveData(Lhd/a;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toLiveData$default(Lhd/a;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    .line 5
    sget-object p4, Lsd/h1;->c:Lsd/h1;

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    .line 6
    invoke-static {}, Landroidx/arch/core/executor/ArchTaskExecutor;->getIOThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p5

    const-string p6, "getIOThreadExecutor(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    move-result-object p5

    .line 7
    :cond_3
    invoke-static/range {p0 .. p5}, Landroidx/paging/LivePagedListKt;->toLiveData(Lhd/a;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lsd/i0;Lsd/e0;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method
