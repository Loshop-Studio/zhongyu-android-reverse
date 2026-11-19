.class public final Landroidx/paging/PagedList$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PagedList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u008b\u0001\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0008\u0008\u0001\u0010\u0006*\u00020\u0001\"\u0008\u0008\u0002\u0010\u0005*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\u00082\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u0001H\u0006H\u0007\u00a2\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\u0008\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/paging/PagedList$Companion;",
        "",
        "()V",
        "create",
        "Landroidx/paging/PagedList;",
        "T",
        "K",
        "pagingSource",
        "Landroidx/paging/PagingSource;",
        "initialPage",
        "Landroidx/paging/PagingSource$LoadResult$Page;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "notifyDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "fetchDispatcher",
        "boundaryCallback",
        "Landroidx/paging/PagedList$BoundaryCallback;",
        "config",
        "Landroidx/paging/PagedList$Config;",
        "key",
        "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;",
        "dispatchNaiveUpdatesSinceSnapshot",
        "",
        "currentSize",
        "",
        "snapshotSize",
        "callback",
        "Landroidx/paging/PagedList$Callback;",
        "dispatchNaiveUpdatesSinceSnapshot$paging_common_release",
        "paging-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/paging/PagedList$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;
    .locals 9
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagingSource<",
            "TK;TT;>;",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TK;TT;>;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TT;>;",
            "Landroidx/paging/PagedList$Config;",
            "TK;)",
            "Landroidx/paging/PagedList<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    move-object/from16 v6, p7

    .line 2
    .line 3
    const-string v0, "pagingSource"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "coroutineScope"

    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "notifyDispatcher"

    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "fetchDispatcher"

    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "config"

    .line 24
    .line 25
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    new-instance p2, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 31
    .line 32
    iget v0, v6, Landroidx/paging/PagedList$Config;->initialLoadSizeHint:I

    .line 33
    .line 34
    iget-boolean v1, v6, Landroidx/paging/PagedList$Config;->enablePlaceholders:Z

    .line 35
    .line 36
    move-object/from16 v8, p8

    .line 37
    .line 38
    invoke-direct {p2, v8, v0, v1}, Landroidx/paging/PagingSource$LoadParams$Refresh;-><init>(Ljava/lang/Object;IZ)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Landroidx/paging/PagedList$Companion$create$resolvedInitialPage$1;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, p1, p2, v1}, Landroidx/paging/PagedList$Companion$create$resolvedInitialPage$1;-><init>(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadParams$Refresh;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {v1, v0, p2, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 53
    .line 54
    :goto_0
    move-object v7, p2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    move-object/from16 v8, p8

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    new-instance v0, Landroidx/paging/ContiguousPagedList;

    .line 60
    .line 61
    move-object v1, p1

    .line 62
    move-object v2, p3

    .line 63
    move-object v3, p4

    .line 64
    move-object v4, p5

    .line 65
    move-object v5, p6

    .line 66
    invoke-direct/range {v0 .. v8}, Landroidx/paging/ContiguousPagedList;-><init>(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public final dispatchNaiveUpdatesSinceSnapshot$paging_common_release(IILandroidx/paging/PagedList$Callback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-ge p2, p1, :cond_1

    .line 8
    .line 9
    if-lez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3, v0, p2}, Landroidx/paging/PagedList$Callback;->onChanged(II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    sub-int/2addr p1, p2

    .line 15
    if-lez p1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p3, p2, p1}, Landroidx/paging/PagedList$Callback;->onInserted(II)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    if-lez p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p3, v0, p1}, Landroidx/paging/PagedList$Callback;->onChanged(II)V

    .line 24
    .line 25
    .line 26
    :cond_2
    sub-int/2addr p2, p1

    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p3, p1, p2}, Landroidx/paging/PagedList$Callback;->onRemoved(II)V

    .line 30
    .line 31
    .line 32
    :cond_3
    return-void
.end method
