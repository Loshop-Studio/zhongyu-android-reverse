.class public final Landroidx/concurrent/futures/SuspendToFutureAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;
    }
.end annotation


# static fields
.field private static final GlobalListenableFutureAwaitContext:Lsd/e0;

.field private static final GlobalListenableFutureScope:Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;

.field public static final INSTANCE:Landroidx/concurrent/futures/SuspendToFutureAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/concurrent/futures/SuspendToFutureAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->INSTANCE:Landroidx/concurrent/futures/SuspendToFutureAdapter;

    .line 7
    .line 8
    new-instance v0, Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->GlobalListenableFutureScope:Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;

    .line 14
    .line 15
    invoke-static {}, Lsd/r0;->d()Lsd/e0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->GlobalListenableFutureAwaitContext:Lsd/e0;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getGlobalListenableFutureAwaitContext$p()Lsd/e0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->GlobalListenableFutureAwaitContext:Lsd/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic launchFuture$default(Landroidx/concurrent/futures/SuspendToFutureAdapter;Lkotlin/coroutines/d;ZLhd/p;ILjava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/concurrent/futures/SuspendToFutureAdapter;->launchFuture(Lkotlin/coroutines/d;ZLhd/p;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final launchFuture(Lkotlin/coroutines/d;ZLhd/p;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/d;",
            "Z",
            "Lhd/p;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->GlobalListenableFutureScope:Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->f:Lkotlinx/coroutines/CoroutineStart;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->c:Lkotlinx/coroutines/CoroutineStart;

    .line 9
    .line 10
    :goto_0
    invoke-static {v0, p1, p2, p3}, Lsd/f;->a(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)Lsd/m0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;-><init>(Lsd/m0;)V

    .line 17
    .line 18
    .line 19
    new-instance p3, Landroidx/concurrent/futures/SuspendToFutureAdapter$launchFuture$1$1;

    .line 20
    .line 21
    invoke-direct {p3, p1}, Landroidx/concurrent/futures/SuspendToFutureAdapter$launchFuture$1$1;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p3, p2}, Lvc/d;->a(Lhd/l;Lvc/c;)Lvc/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object p3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 29
    .line 30
    sget-object p3, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    invoke-static {p3}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-interface {p1, p3}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object p2
.end method
