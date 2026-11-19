.class final Landroidx/paging/RemoteMediatorAccessImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/RemoteMediatorAccessor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/RemoteMediatorAccessImpl$Companion;,
        Landroidx/paging/RemoteMediatorAccessImpl$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/paging/RemoteMediatorAccessor<",
        "TKey;TValue;>;"
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/paging/RemoteMediatorAccessImpl$Companion;

.field private static final PRIORITY_APPEND_PREPEND:I = 0x1

.field private static final PRIORITY_REFRESH:I = 0x2


# instance fields
.field private final accessorState:Landroidx/paging/AccessorStateHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/AccessorStateHolder<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final isolationRunner:Landroidx/paging/SingleRunner;

.field private final remoteMediator:Landroidx/paging/RemoteMediator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/RemoteMediator<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final scope:Lsd/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/paging/RemoteMediatorAccessImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/paging/RemoteMediatorAccessImpl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/paging/RemoteMediatorAccessImpl;->Companion:Landroidx/paging/RemoteMediatorAccessImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lsd/i0;Landroidx/paging/RemoteMediator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroidx/paging/RemoteMediator<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "remoteMediator"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl;->scope:Lsd/i0;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/paging/RemoteMediatorAccessImpl;->remoteMediator:Landroidx/paging/RemoteMediator;

    .line 17
    .line 18
    new-instance p1, Landroidx/paging/AccessorStateHolder;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/paging/AccessorStateHolder;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 24
    .line 25
    new-instance p1, Landroidx/paging/SingleRunner;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p2}, Landroidx/paging/SingleRunner;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl;->isolationRunner:Landroidx/paging/SingleRunner;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Ljava/util/List;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl;->retryFailed$lambda$0(Ljava/util/List;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getIsolationRunner$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/SingleRunner;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->isolationRunner:Landroidx/paging/SingleRunner;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRemoteMediator$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/RemoteMediator;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->remoteMediator:Landroidx/paging/RemoteMediator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$launchBoundary(Landroidx/paging/RemoteMediatorAccessImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/paging/RemoteMediatorAccessImpl;->launchBoundary()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final allowRefresh$lambda$0(Landroidx/paging/AccessorState;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Landroidx/paging/AccessorState;->setRefreshAllowed(Z)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic b(Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/RemoteMediatorAccessImpl;->allowRefresh$lambda$0(Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/RemoteMediatorAccessImpl;->requestRefreshIfAllowed$lambda$0(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/RemoteMediatorAccessImpl;->initialize$lambda$0$0(Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/RemoteMediatorAccessImpl;->requestLoad$lambda$0(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Z

    move-result p0

    return p0
.end method

.method private static final initialize$lambda$0$0(Landroidx/paging/AccessorState;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 7
    .line 8
    sget-object v1, Landroidx/paging/AccessorState$BlockState;->REQUIRES_REFRESH:Landroidx/paging/AccessorState$BlockState;

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method private final launchBoundary()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->scope:Lsd/i0;

    .line 2
    .line 3
    new-instance v3, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, v1}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final launchRefresh()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->scope:Lsd/i0;

    .line 2
    .line 3
    new-instance v3, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, v1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final requestLoad(Landroidx/paging/AccessorStateHolder;Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/AccessorStateHolder<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/paging/d1;

    invoke-direct {v0, p2, p3}, Landroidx/paging/d1;-><init>(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    invoke-virtual {p1, v0}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    sget-object p1, Landroidx/paging/RemoteMediatorAccessImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 4
    invoke-direct {p0}, Landroidx/paging/RemoteMediatorAccessImpl;->launchRefresh()V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Landroidx/paging/RemoteMediatorAccessImpl;->launchBoundary()V

    :cond_1
    return-void
.end method

.method private static final requestLoad$lambda$0(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p0, p1}, Landroidx/paging/AccessorState;->add(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final requestRefreshIfAllowed$lambda$0(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/paging/AccessorState;->getRefreshAllowed()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p2, v0}, Landroidx/paging/AccessorState;->setRefreshAllowed(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 17
    .line 18
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 19
    .line 20
    invoke-direct {p0, p2, v0, p1}, Landroidx/paging/RemoteMediatorAccessImpl;->requestLoad(Landroidx/paging/AccessorStateHolder;Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final retryFailed$lambda$0(Ljava/util/List;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "accessorState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/AccessorState;->computeLoadStates()Landroidx/paging/LoadStates;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v1, v1, Landroidx/paging/LoadState$Error;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/paging/AccessorState;->clearErrors()V

    .line 17
    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 22
    .line 23
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget-object v3, Landroidx/paging/AccessorState$BlockState;->UNBLOCKED:Landroidx/paging/AccessorState$BlockState;

    .line 27
    .line 28
    invoke-virtual {p1, v2, v3}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    instance-of v2, v2, Landroidx/paging/LoadState$Error;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    sget-object v2, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 42
    .line 43
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v2, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    instance-of v0, v0, Landroidx/paging/LoadState$Error;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 62
    .line 63
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_3
    sget-object p0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 72
    .line 73
    return-object p0
.end method


# virtual methods
.method public allowRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/g1;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/paging/g1;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getState()Lvd/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/u;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/AccessorStateHolder;->getLoadStates()Lvd/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public initialize(Lvc/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/paging/RemoteMediator$InitializeAction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;->label:I

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
    iput v1, v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;->label:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl;->remoteMediator:Landroidx/paging/RemoteMediator;

    .line 54
    .line 55
    iput v3, v0, Landroidx/paging/RemoteMediatorAccessImpl$initialize$1;->label:I

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/paging/RemoteMediator;->initialize(Lvc/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    move-object v0, p1

    .line 65
    check-cast v0, Landroidx/paging/RemoteMediator$InitializeAction;

    .line 66
    .line 67
    sget-object v1, Landroidx/paging/RemoteMediator$InitializeAction;->LAUNCH_INITIAL_REFRESH:Landroidx/paging/RemoteMediator$InitializeAction;

    .line 68
    .line 69
    if-ne v0, v1, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 72
    .line 73
    new-instance v1, Landroidx/paging/e1;

    .line 74
    .line 75
    invoke-direct {v1}, Landroidx/paging/e1;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_4
    return-object p1
.end method

.method public requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    const-string v0, "loadType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    invoke-direct {p0, v0, p1, p2}, Landroidx/paging/RemoteMediatorAccessImpl;->requestLoad(Landroidx/paging/AccessorStateHolder;Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    return-void
.end method

.method public requestRefreshIfAllowed(Landroidx/paging/PagingState;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "pagingState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 7
    .line 8
    new-instance v1, Landroidx/paging/f1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Landroidx/paging/f1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public retryFailed(Landroidx/paging/PagingState;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "pagingState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl;->accessorState:Landroidx/paging/AccessorStateHolder;

    .line 12
    .line 13
    new-instance v2, Landroidx/paging/h1;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Landroidx/paging/h1;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    check-cast v3, Landroidx/paging/LoadType;

    .line 35
    .line 36
    invoke-virtual {p0, v3, p1}, Landroidx/paging/RemoteMediatorAccessImpl;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method
