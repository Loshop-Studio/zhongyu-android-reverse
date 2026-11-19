.class final Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1"
    f = "RemoteMediatorAccessor.kt"
    l = {
        0x16f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
.method public constructor <init>(Landroidx/paging/RemoteMediatorAccessImpl;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/RemoteMediatorAccessImpl<",
            "TKey;TValue;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic g(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->invokeSuspend$lambda$2(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/paging/AccessorState;)Lkotlin/Pair;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/paging/AccessorState;->getPendingBoundary()Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p2, p0}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/RemoteMediator$MediatorResult$Success;->endOfPaginationReached()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Landroidx/paging/AccessorState$BlockState;->COMPLETED:Landroidx/paging/AccessorState$BlockState;

    .line 13
    .line 14
    invoke-virtual {p2, p0, p1}, Landroidx/paging/AccessorState;->setBlockState(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$BlockState;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final invokeSuspend$lambda$2(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 1

    .line 1
    invoke-virtual {p2, p0}, Landroidx/paging/AccessorState;->clearPendingRequest(Landroidx/paging/LoadType;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/paging/LoadState$Error;

    .line 5
    .line 6
    check-cast p1, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/paging/RemoteMediator$MediatorResult$Error;->getThrowable()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p0, v0}, Landroidx/paging/AccessorState;->setError(Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method public static synthetic m(Landroidx/paging/AccessorState;)Lkotlin/Pair;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->invokeSuspend$lambda$0(Landroidx/paging/AccessorState;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->invokeSuspend$lambda$1(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 2
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
    new-instance v0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;-><init>(Landroidx/paging/RemoteMediatorAccessImpl;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->invoke(Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->label:I

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
    iget-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/paging/LoadType;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 32
    .line 33
    invoke-static {p1}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Landroidx/paging/i1;

    .line 38
    .line 39
    invoke-direct {v1}, Landroidx/paging/i1;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lkotlin/Pair;

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/paging/LoadType;

    .line 58
    .line 59
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroidx/paging/PagingState;

    .line 64
    .line 65
    iget-object v3, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 66
    .line 67
    invoke-static {v3}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getRemoteMediator$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/RemoteMediator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v1, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    iput v2, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->label:I

    .line 74
    .line 75
    invoke-virtual {v3, v1, p1, p0}, Landroidx/paging/RemoteMediator;->load(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_3

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    :goto_1
    check-cast p1, Landroidx/paging/RemoteMediator$MediatorResult;

    .line 83
    .line 84
    instance-of v3, p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    iget-object v3, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 89
    .line 90
    invoke-static {v3}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, Landroidx/paging/j1;

    .line 95
    .line 96
    invoke-direct {v4, v1, p1}, Landroidx/paging/j1;-><init>(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v4}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    instance-of v3, p1, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    iget-object v3, p0, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->this$0:Landroidx/paging/RemoteMediatorAccessImpl;

    .line 108
    .line 109
    invoke-static {v3}, Landroidx/paging/RemoteMediatorAccessImpl;->access$getAccessorState$p(Landroidx/paging/RemoteMediatorAccessImpl;)Landroidx/paging/AccessorStateHolder;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    new-instance v4, Landroidx/paging/k1;

    .line 114
    .line 115
    invoke-direct {v4, v1, p1}, Landroidx/paging/k1;-><init>(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, Landroidx/paging/AccessorStateHolder;->use(Lhd/l;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 123
    .line 124
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 125
    .line 126
    .line 127
    throw p1
.end method
