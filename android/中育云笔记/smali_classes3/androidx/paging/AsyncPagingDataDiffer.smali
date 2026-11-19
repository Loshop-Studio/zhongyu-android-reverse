.class public final Landroidx/paging/AsyncPagingDataDiffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final LoadStateListenerHandler$delegate:Lqc/d;

.field private final LoadStateListenerRunnable:Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

.field private final childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lhd/l;",
            ">;"
        }
    .end annotation
.end field

.field private final diffCallback:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final inGetItem:Lvd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/l;"
        }
    .end annotation
.end field

.field private final internalLoadStateListener:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private lastAccessedIndex:I

.field private final loadStateFlow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final mainDispatcher:Lkotlin/coroutines/d;

.field private final onPagesUpdatedFlow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final parentLoadStateListener:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lhd/l;",
            ">;"
        }
    .end annotation
.end field

.field private final presenter:Landroidx/paging/PagingDataPresenter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/paging/PlaceholderPaddedList<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final submitDataId:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final updateCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

.field private final workerDispatcher:Lkotlin/coroutines/d;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;",
            "Landroidx/recyclerview/widget/ListUpdateCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;",
            "Landroidx/recyclerview/widget/ListUpdateCallback;",
            "Lkotlin/coroutines/d;",
            ")V"
        }
    .end annotation

    .line 2
    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;",
            "Landroidx/recyclerview/widget/ListUpdateCallback;",
            "Lkotlin/coroutines/d;",
            "Lkotlin/coroutines/d;",
            ")V"
        }
    .end annotation

    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->diffCallback:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 5
    iput-object p2, p0, Landroidx/paging/AsyncPagingDataDiffer;->updateCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 6
    iput-object p3, p0, Landroidx/paging/AsyncPagingDataDiffer;->mainDispatcher:Lkotlin/coroutines/d;

    .line 7
    iput-object p4, p0, Landroidx/paging/AsyncPagingDataDiffer;->workerDispatcher:Lkotlin/coroutines/d;

    .line 8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    new-instance p1, Landroidx/paging/AsyncPagingDataDiffer$presenter$1;

    invoke-direct {p1, p0, p3}, Landroidx/paging/AsyncPagingDataDiffer$presenter$1;-><init>(Landroidx/paging/AsyncPagingDataDiffer;Lkotlin/coroutines/d;)V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 11
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Landroidx/paging/AsyncPagingDataDiffer;->submitDataId:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    invoke-virtual {p1}, Landroidx/paging/PagingDataPresenter;->getLoadStateFlow()Lvd/u;

    move-result-object p3

    .line 13
    invoke-static {p3}, Lvd/e;->v(Lvd/c;)Lvd/c;

    move-result-object p3

    const/4 p4, -0x1

    const/4 v0, 0x2

    .line 14
    invoke-static {p3, p4, p2, v0, p2}, Lvd/e;->d(Lvd/c;ILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/c;

    move-result-object p3

    .line 15
    new-instance p4, Landroidx/paging/AsyncPagingDataDiffer$special$$inlined$transform$1;

    invoke-direct {p4, p3, p2, p0}, Landroidx/paging/AsyncPagingDataDiffer$special$$inlined$transform$1;-><init>(Lvd/c;Lvc/c;Landroidx/paging/AsyncPagingDataDiffer;)V

    invoke-static {p4}, Lvd/e;->B(Lhd/p;)Lvd/c;

    move-result-object p3

    .line 16
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object p4

    invoke-static {p3, p4}, Lvd/e;->E(Lvd/c;Lkotlin/coroutines/d;)Lvd/c;

    move-result-object p3

    iput-object p3, p0, Landroidx/paging/AsyncPagingDataDiffer;->loadStateFlow:Lvd/c;

    .line 17
    invoke-virtual {p1}, Landroidx/paging/PagingDataPresenter;->getOnPagesUpdatedFlow()Lvd/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->onPagesUpdatedFlow:Lvd/c;

    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->parentLoadStateListener:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    new-instance p1, Landroidx/paging/e;

    invoke-direct {p1, p0}, Landroidx/paging/e;-><init>(Landroidx/paging/AsyncPagingDataDiffer;)V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->internalLoadStateListener:Lhd/l;

    .line 21
    new-instance p1, Landroidx/paging/f;

    invoke-direct {p1}, Landroidx/paging/f;-><init>()V

    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerHandler$delegate:Lqc/d;

    .line 22
    new-instance p1, Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

    invoke-direct {p1, p0}, Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;-><init>(Landroidx/paging/AsyncPagingDataDiffer;)V

    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerRunnable:Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 23
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 24
    invoke-static {}, Lsd/r0;->a()Lsd/e0;

    move-result-object p4

    .line 25
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;)V
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {}, Lsd/r0;->a()Lsd/e0;

    move-result-object v0

    .line 29
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 26
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object p3

    .line 27
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;Lsd/e0;)V
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;Lsd/e0;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 30
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 31
    invoke-static {}, Lsd/r0;->a()Lsd/e0;

    move-result-object p4

    .line 32
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/AsyncPagingDataDiffer;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lsd/e0;Lsd/e0;)V

    return-void
.end method

.method private static final LoadStateListenerHandler_delegate$lambda$0()Landroid/os/Handler;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic a()Landroid/os/Handler;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerHandler_delegate$lambda$0()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getChildLoadStateListeners$p(Landroidx/paging/AsyncPagingDataDiffer;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDiffCallback$p(Landroidx/paging/AsyncPagingDataDiffer;)Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->diffCallback:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLastAccessedIndex$p(Landroidx/paging/AsyncPagingDataDiffer;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->lastAccessedIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getPreviousPresenter$p(Landroidx/paging/AsyncPagingDataDiffer;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSubmitDataId$p(Landroidx/paging/AsyncPagingDataDiffer;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->submitDataId:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getUpdateCallback$p(Landroidx/paging/AsyncPagingDataDiffer;)Landroidx/recyclerview/widget/ListUpdateCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->updateCallback:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getWorkerDispatcher$p(Landroidx/paging/AsyncPagingDataDiffer;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->workerDispatcher:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setLastAccessedIndex$p(Landroidx/paging/AsyncPagingDataDiffer;I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->lastAccessedIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Landroidx/paging/AsyncPagingDataDiffer;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/AsyncPagingDataDiffer;->internalLoadStateListener$lambda$0(Landroidx/paging/AsyncPagingDataDiffer;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final getLoadStateListenerHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerHandler$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final internalLoadStateListener$lambda$0(Landroidx/paging/AsyncPagingDataDiffer;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "loadState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 7
    .line 8
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lhd/l;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-direct {p0}, Landroidx/paging/AsyncPagingDataDiffer;->getLoadStateListenerHandler()Landroid/os/Handler;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerRunnable:Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerRunnable:Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;->getLoadState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Landroidx/paging/AsyncPagingDataDiffer;->LoadStateListenerRunnable:Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p0
.end method


# virtual methods
.method public final addLoadStateListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
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
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->parentLoadStateListener:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->internalLoadStateListener:Lhd/l;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/paging/AsyncPagingDataDiffer;->addLoadStateListenerInternal$paging_runtime(Lhd/l;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final addLoadStateListenerInternal$paging_runtime(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
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
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->parentLoadStateListener:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->addLoadStateListener(Lhd/l;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final addOnPagesUpdatedListener(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
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
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->addOnPagesUpdatedListener(Lhd/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getInGetItem$paging_runtime()Lvd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInternalLoadStateListener$paging_runtime()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->internalLoadStateListener:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->lastAccessedIndex:I

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroidx/paging/PlaceholderPaddedList;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {v0, p1}, Landroidx/paging/AsyncPagingDataDifferKt;->access$get(Landroidx/paging/PlaceholderPaddedList;I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :goto_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 47
    .line 48
    :cond_2
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    move-object v2, v1

    .line 53
    check-cast v2, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    return-object p1

    .line 67
    :goto_1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->inGetItem:Lvd/l;

    .line 68
    .line 69
    :goto_2
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object v2, v1

    .line 74
    check-cast v2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    throw p1
.end method

.method public final getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/PlaceholderPaddedList;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/paging/PlaceholderPaddedList;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->getSize()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public final getLoadStateFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->loadStateFlow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnPagesUpdatedFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->onPagesUpdatedFlow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPresenter$paging_runtime()Landroidx/paging/PagingDataPresenter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final peek(I)Ljava/lang/Object;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/PlaceholderPaddedList;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0, p1}, Landroidx/paging/AsyncPagingDataDifferKt;->access$peek(Landroidx/paging/PlaceholderPaddedList;I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->peek(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->refresh()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final removeLoadStateListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
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
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->childLoadStateListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer;->parentLoadStateListener:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lhd/l;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->removeLoadStateListener(Lhd/l;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final removeOnPagesUpdatedListener(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
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
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/PagingDataPresenter;->removeOnPagesUpdatedListener(Lhd/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final retry()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->retry()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final snapshot()Landroidx/paging/ItemSnapshotList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/ItemSnapshotList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->previousPresenter:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/PlaceholderPaddedList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/paging/AsyncPagingDataDifferKt;->access$snapshot(Landroidx/paging/PlaceholderPaddedList;)Landroidx/paging/ItemSnapshotList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final submitData(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->submitDataId:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 2
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->presenter:Landroidx/paging/PagingDataPresenter;

    invoke-virtual {v0, p1, p2}, Landroidx/paging/PagingDataPresenter;->collectFrom(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final submitData(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/Lifecycle;",
            "Landroidx/paging/PagingData<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer;->submitDataId:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 4
    invoke-static {p1}, Landroidx/lifecycle/LifecycleKt;->getCoroutineScope(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Landroidx/paging/AsyncPagingDataDiffer$submitData$2;

    const/4 p1, 0x0

    invoke-direct {v4, p0, v0, p2, p1}, Landroidx/paging/AsyncPagingDataDiffer$submitData$2;-><init>(Landroidx/paging/AsyncPagingDataDiffer;ILandroidx/paging/PagingData;Lvc/c;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void
.end method
