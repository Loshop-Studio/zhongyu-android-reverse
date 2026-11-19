.class public abstract Landroidx/paging/PagedList;
.super Ljava/util/AbstractList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PagedList$BoundaryCallback;,
        Landroidx/paging/PagedList$Builder;,
        Landroidx/paging/PagedList$Callback;,
        Landroidx/paging/PagedList$Companion;,
        Landroidx/paging/PagedList$Config;,
        Landroidx/paging/PagedList$LoadStateManager;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lqc/a;
.end annotation


# static fields
.field public static final Companion:Landroidx/paging/PagedList$Companion;


# instance fields
.field private final callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/paging/PagedList$Callback;",
            ">;>;"
        }
    .end annotation
.end field

.field private final config:Landroidx/paging/PagedList$Config;

.field private final coroutineScope:Lsd/i0;

.field private final loadStateListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lhd/p;",
            ">;>;"
        }
    .end annotation
.end field

.field private final notifyDispatcher:Lsd/e0;

.field private final pagingSource:Landroidx/paging/PagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource<",
            "*TT;>;"
        }
    .end annotation
.end field

.field private refreshRetryCallback:Ljava/lang/Runnable;

.field private final requiredRemainder:I

.field private final storage:Landroidx/paging/PagedStorage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagedStorage<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/paging/PagedList$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/paging/PagedList$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/paging/PagedList;->Companion:Landroidx/paging/PagedList$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/paging/PagingSource;Lsd/i0;Lsd/e0;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource<",
            "*TT;>;",
            "Lsd/i0;",
            "Lsd/e0;",
            "Landroidx/paging/PagedStorage<",
            "TT;>;",
            "Landroidx/paging/PagedList$Config;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "pagingSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "coroutineScope"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notifyDispatcher"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "storage"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "config"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/paging/PagedList;->pagingSource:Landroidx/paging/PagingSource;

    .line 30
    .line 31
    iput-object p2, p0, Landroidx/paging/PagedList;->coroutineScope:Lsd/i0;

    .line 32
    .line 33
    iput-object p3, p0, Landroidx/paging/PagedList;->notifyDispatcher:Lsd/e0;

    .line 34
    .line 35
    iput-object p4, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 36
    .line 37
    iput-object p5, p0, Landroidx/paging/PagedList;->config:Landroidx/paging/PagedList$Config;

    .line 38
    .line 39
    iget p1, p5, Landroidx/paging/PagedList$Config;->prefetchDistance:I

    .line 40
    .line 41
    mul-int/lit8 p1, p1, 0x2

    .line 42
    .line 43
    iget p2, p5, Landroidx/paging/PagedList$Config;->pageSize:I

    .line 44
    .line 45
    add-int/2addr p1, p2

    .line 46
    iput p1, p0, Landroidx/paging/PagedList;->requiredRemainder:I

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Landroidx/paging/PagedList;->loadStateListeners:Ljava/util/List;

    .line 61
    .line 62
    return-void
.end method

.method public static synthetic a(Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/PagedList;->addWeakCallback$lambda$0(Ljava/lang/ref/WeakReference;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getLoadStateListeners$p(Landroidx/paging/PagedList;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagedList;->loadStateListeners:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final addWeakCallback$lambda$0(Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method private static final addWeakLoadStateListener$lambda$0(Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static synthetic b(Landroidx/paging/PagedList$Callback;Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PagedList;->removeWeakCallback$lambda$0(Landroidx/paging/PagedList$Callback;Ljava/lang/ref/WeakReference;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lhd/p;Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PagedList;->removeWeakLoadStateListener$lambda$0(Lhd/p;Ljava/lang/ref/WeakReference;)Z

    move-result p0

    return p0
.end method

.method public static final create(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lsd/i0;Lsd/e0;Lsd/e0;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;
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
            "Lsd/i0;",
            "Lsd/e0;",
            "Lsd/e0;",
            "Landroidx/paging/PagedList$BoundaryCallback<",
            "TT;>;",
            "Landroidx/paging/PagedList$Config;",
            "TK;)",
            "Landroidx/paging/PagedList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/paging/PagedList;->Companion:Landroidx/paging/PagedList$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Landroidx/paging/PagedList$Companion;->create(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lsd/i0;Lsd/e0;Lsd/e0;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/PagedList;->addWeakLoadStateListener$lambda$0(Ljava/lang/ref/WeakReference;)Z

    move-result p0

    return p0
.end method

.method public static synthetic getDataSource$annotations()V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

.method private static final removeWeakCallback$lambda$0(Landroidx/paging/PagedList$Callback;Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-ne p1, p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method private static final removeWeakLoadStateListener$lambda$0(Lhd/p;Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-ne p1, p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method


# virtual methods
.method public final addWeakCallback(Landroidx/paging/PagedList$Callback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    new-instance v1, Landroidx/paging/l0;

    invoke-direct {v1}, Landroidx/paging/l0;-><init>()V

    invoke-static {v0, v1}, Lrc/b0;->L(Ljava/util/List;Lhd/l;)Z

    .line 4
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addWeakCallback(Ljava/util/List;Landroidx/paging/PagedList$Callback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/PagedList$Callback;",
            ")V"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-eq p1, p0, :cond_0

    .line 1
    sget-object v0, Landroidx/paging/PagedList;->Companion:Landroidx/paging/PagedList$Companion;

    invoke-virtual {p0}, Landroidx/paging/PagedList;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, v1, p1, p2}, Landroidx/paging/PagedList$Companion;->dispatchNaiveUpdatesSinceSnapshot$paging_common(IILandroidx/paging/PagedList$Callback;)V

    .line 2
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/paging/PagedList;->addWeakCallback(Landroidx/paging/PagedList$Callback;)V

    return-void
.end method

.method public final addWeakLoadStateListener(Lhd/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagedList;->loadStateListeners:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Landroidx/paging/i0;

    .line 9
    .line 10
    invoke-direct {v1}, Landroidx/paging/i0;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lrc/b0;->L(Ljava/util/List;Lhd/l;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/paging/PagedList;->loadStateListeners:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroidx/paging/PagedList;->dispatchCurrentLoadState(Lhd/p;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public abstract detach()V
.end method

.method public abstract dispatchCurrentLoadState(Lhd/p;)V
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation
.end method

.method public final dispatchStateChangeAsync$paging_common(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    .locals 7

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "state"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/paging/PagedList;->coroutineScope:Lsd/i0;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/paging/PagedList;->notifyDispatcher:Lsd/e0;

    .line 14
    .line 15
    new-instance v4, Landroidx/paging/PagedList$dispatchStateChangeAsync$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/paging/PagedList$dispatchStateChangeAsync$1;-><init>(Landroidx/paging/PagedList;Landroidx/paging/LoadType;Landroidx/paging/LoadState;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/paging/PagedStorage;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final getConfig()Landroidx/paging/PagedList$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->config:Landroidx/paging/PagedList$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCoroutineScope$paging_common()Lsd/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->coroutineScope:Lsd/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDataSource()Landroidx/paging/DataSource;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/DataSource<",
            "*TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagedList;->getPagingSource()Landroidx/paging/PagingSource;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/paging/LegacyPagingSource;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroidx/paging/LegacyPagingSource;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/paging/LegacyPagingSource;->getDataSource$paging_common()Landroidx/paging/DataSource;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "null cannot be cast to non-null type androidx.paging.DataSource<*, T of androidx.paging.PagedList>"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "Attempt to access dataSource on a PagedList that was instantiated with a "

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, " instead of a DataSource"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1
.end method

.method public abstract getLastKey()Ljava/lang/Object;
.end method

.method public final getLoadedCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagedStorage;->getDataCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getNotifyDispatcher$paging_common()Lsd/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->notifyDispatcher:Lsd/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPagingSource()Landroidx/paging/PagingSource;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagingSource<",
            "*TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->pagingSource:Landroidx/paging/PagingSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholderPaddedList()Landroidx/paging/PlaceholderPaddedList;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PlaceholderPaddedList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPositionOffset()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagedStorage;->getPositionOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getRefreshRetryCallback$paging_common()Ljava/lang/Runnable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->refreshRetryCallback:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRequiredRemainder$paging_common()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PagedList;->requiredRemainder:I

    .line 2
    .line 3
    return v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagedStorage;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getStorage$paging_common()Landroidx/paging/PagedStorage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagedStorage<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract isDetached()Z
.end method

.method public isImmutable()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagedList;->isDetached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final lastLoad()I
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagedStorage;->getLastLoadAroundIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final loadAround(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/paging/PagedList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/paging/PagedList;->storage:Landroidx/paging/PagedStorage;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/paging/PagedStorage;->setLastLoadAroundIndex(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/paging/PagedList;->loadAroundInternal(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "Index: "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, ", Size: "

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/paging/PagedList;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public abstract loadAroundInternal(I)V
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end method

.method public final notifyChanged(II)V
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-static {v0}, Lrc/g0;->J0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/paging/PagedList$Callback;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Landroidx/paging/PagedList$Callback;->onChanged(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final notifyInserted$paging_common(II)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-static {v0}, Lrc/g0;->J0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/paging/PagedList$Callback;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Landroidx/paging/PagedList$Callback;->onInserted(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final notifyRemoved(II)V
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-static {v0}, Lrc/g0;->J0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/paging/PagedList$Callback;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Landroidx/paging/PagedList$Callback;->onRemoved(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/PagedList;->removeAt(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge removeAt(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final removeWeakCallback(Landroidx/paging/PagedList$Callback;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagedList;->callbacks:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Landroidx/paging/k0;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroidx/paging/k0;-><init>(Landroidx/paging/PagedList$Callback;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lrc/b0;->L(Ljava/util/List;Lhd/l;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final removeWeakLoadStateListener(Lhd/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagedList;->loadStateListeners:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Landroidx/paging/j0;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroidx/paging/j0;-><init>(Lhd/p;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lrc/b0;->L(Ljava/util/List;Lhd/l;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public retry()V
    .locals 0

    return-void
.end method

.method public setInitialLoadState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    const-string v0, "loadType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "loadState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setRefreshRetryCallback$paging_common(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/paging/PagedList;->refreshRetryCallback:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-void
.end method

.method public final setRetryCallback(Ljava/lang/Runnable;)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PagedList;->refreshRetryCallback:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-void
.end method

.method public final bridge size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagedList;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final snapshot()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagedList;->isImmutable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Landroidx/paging/SnapshotPagedList;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroidx/paging/SnapshotPagedList;-><init>(Landroidx/paging/PagedList;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
