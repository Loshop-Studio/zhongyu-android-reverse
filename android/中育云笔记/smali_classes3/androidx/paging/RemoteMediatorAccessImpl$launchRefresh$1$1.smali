.class final Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1"
    f = "RemoteMediatorAccessor.kt"
    l = {
        0x123
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $launchAppendPrepend:Lkotlin/jvm/internal/Ref$BooleanRef;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/paging/RemoteMediatorAccessImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/RemoteMediatorAccessImpl<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/RemoteMediatorAccessImpl;Lkotlin/jvm/internal/Ref$BooleanRef;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/RemoteMediatorAccessImpl<",
            "TKey;TValue;>;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->$launchAppendPrepend:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic g(Landroidx/paging/AccessorState;)Landroidx/paging/PagingState;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->invokeSuspend$lambda$0(Landroidx/paging/AccessorState;)Landroidx/paging/PagingState;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/paging/AccessorState;)Landroidx/paging/PagingState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/paging/AccessorState;->getPendingRefresh()Landroidx/paging/PagingState;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final invokeSuspend$lambda$1$0(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z
    .locals 1

    .line 1
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/paging/RemoteMediator$MediatorResult$Success;->endOfPaginationReached()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Landroidx/paging/AccessorState$BlockState;->COMPLETED:Landroidx/paging/AccessorState$BlockState;

    .line 15
    .line 16
    invoke-virtual {p1, v0, p0}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 20
    .line 21
    invoke-virtual {p1, v0, p0}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 25
    .line 26
    invoke-virtual {p1, v0, p0}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/paging/AccessorState;->clearPendingRequests()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 34
    .line 35
    sget-object v0, Landroidx/paging/AccessorState$BlockState;->UNBLOCKED:Landroidx/paging/AccessorState$BlockState;

    .line 36
    .line 37
    invoke-virtual {p1, p0, v0}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 41
    .line 42
    invoke-virtual {p1, p0, v0}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, p0, v0}, Landroidx/paging/AccessorState;->setError(Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 52
    .line 53
    invoke-virtual {p1, p0, v0}, Landroidx/paging/AccessorState;->setError(Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/paging/AccessorState;->getPendingBoundary()Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_1
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method private static final invokeSuspend$lambda$1$1(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z
    .locals 2

    .line 1
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/paging/LoadState$Error;

    .line 7
    .line 8
    check-cast p0, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/paging/RemoteMediator$MediatorResult$Error;->getThrowable()Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Landroidx/paging/AccessorState;->setError(Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/paging/AccessorState;->getPendingBoundary()Lkotlin/Pair;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static synthetic m(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->invokeSuspend$lambda$1$1(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->invokeSuspend$lambda$1$0(Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->$launchAppendPrepend:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Lkotlin/jvm/internal/Ref$BooleanRef;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroidx/paging/RemoteMediatorAccessImpl;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v1, Landroidx/paging/l1;

    .line 42
    .line 43
    invoke-direct {v1}, Landroidx/paging/l1;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroidx/paging/PagingState;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 55
    .line 56
    iget-object v3, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->$launchAppendPrepend:Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 57
    .line 58
    invoke-static {v1}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getRemoteMediator$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/RemoteMediator;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v5, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 63
    .line 64
    iput-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v3, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    iput v2, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchRefresh$1$1;->label:I

    .line 69
    .line 70
    invoke-virtual {v4, v5, p1, p0}, Landroidx/paging/RemoteMediator;->load(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lvc/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_2

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_2
    move-object v0, v3

    .line 78
    :goto_0
    check-cast p1, Landroidx/paging/RemoteMediator$MediatorResult;

    .line 79
    .line 80
    instance-of v2, p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-static {v1}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Landroidx/paging/m1;

    .line 89
    .line 90
    invoke-direct {v2, p1}, Landroidx/paging/m1;-><init>(Landroidx/paging/RemoteMediator$MediatorResult;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    instance-of v2, p1, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 105
    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-static {v1}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    new-instance v2, Landroidx/paging/n1;

    .line 113
    .line 114
    invoke-direct {v2, p1}, Landroidx/paging/n1;-><init>(Landroidx/paging/RemoteMediator$MediatorResult;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    :goto_1
    iput-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 131
    .line 132
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_5
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 137
    .line 138
    return-object p1
.end method
