.class public abstract Lcom/zykj/evaluation/paging/SimplePagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/paging/SimplePagerKt;->d(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/paging/PagingConfig;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
    .locals 3

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "convert"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/paging/Pager;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lq5/a;

    .line 24
    .line 25
    invoke-direct {v2, p1, p2}, Lq5/a;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/paging/Pager;->getFlow()Lkotlinx/coroutines/flow/Flow;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static synthetic c(Landroidx/paging/PagingConfig;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 9

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/paging/PagingConfig;

    .line 6
    .line 7
    const/16 v7, 0x36

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/16 v1, 0x1e

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/16 v4, 0x5a

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct/range {v0 .. v8}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    move-object p0, v0

    .line 22
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/paging/SimplePagerKt;->b(Landroidx/paging/PagingConfig;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingSource;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
