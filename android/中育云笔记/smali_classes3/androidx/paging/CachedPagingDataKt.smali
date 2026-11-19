.class public final Landroidx/paging/CachedPagingDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final cachedIn(Lvd/c;Lsd/i0;)Lvd/c;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lsd/i0;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;)Lvd/c;

    move-result-object p0

    return-object p0
.end method

.method public static final cachedIn(Lvd/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;)Lvd/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lsd/i0;",
            "Landroidx/paging/ActiveFlowTracker;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Landroidx/paging/CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1;-><init>(Lvc/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;)V

    invoke-static {p0, v0}, Landroidx/paging/FlowExtKt;->simpleTransformLatest(Lvd/c;Lhd/q;)Lvd/c;

    move-result-object p0

    .line 3
    new-instance v0, Landroidx/paging/CachedPagingDataKt$cachedIn$2;

    invoke-direct {v0, v1}, Landroidx/paging/CachedPagingDataKt$cachedIn$2;-><init>(Lvc/c;)V

    invoke-static {p0, v0}, Landroidx/paging/FlowExtKt;->simpleRunningReduce(Lvd/c;Lhd/q;)Lvd/c;

    move-result-object p0

    .line 4
    new-instance v0, Landroidx/paging/CachedPagingDataKt$cachedIn$$inlined$map$1;

    invoke-direct {v0, p0}, Landroidx/paging/CachedPagingDataKt$cachedIn$$inlined$map$1;-><init>(Lvd/c;)V

    .line 5
    new-instance p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;

    invoke-direct {p0, p2, v1}, Landroidx/paging/CachedPagingDataKt$cachedIn$4;-><init>(Landroidx/paging/ActiveFlowTracker;Lvc/c;)V

    invoke-static {v0, p0}, Lvd/e;->L(Lvd/c;Lhd/p;)Lvd/c;

    move-result-object p0

    .line 6
    new-instance v0, Landroidx/paging/CachedPagingDataKt$cachedIn$5;

    invoke-direct {v0, p2, v1}, Landroidx/paging/CachedPagingDataKt$cachedIn$5;-><init>(Landroidx/paging/ActiveFlowTracker;Lvc/c;)V

    invoke-static {p0, v0}, Lvd/e;->J(Lvd/c;Lhd/q;)Lvd/c;

    move-result-object p0

    .line 7
    sget-object p2, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    invoke-virtual {p2}, Lkotlinx/coroutines/flow/a$a;->d()Lkotlinx/coroutines/flow/a;

    move-result-object p2

    const/4 v0, 0x1

    .line 8
    invoke-static {p0, p1, p2, v0}, Lvd/e;->P(Lvd/c;Lsd/i0;Lkotlinx/coroutines/flow/a;I)Lvd/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic cachedIn$default(Lvd/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;ILjava/lang/Object;)Lvd/c;
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
    invoke-static {p0, p1, p2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;)Lvd/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
