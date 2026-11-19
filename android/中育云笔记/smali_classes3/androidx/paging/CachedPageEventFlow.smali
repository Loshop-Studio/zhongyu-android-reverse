.class public final Landroidx/paging/CachedPageEventFlow;
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
.field private final downstreamFlow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final job:Lkotlinx/coroutines/g;

.field private final mutableSharedSrc:Lvd/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/k;"
        }
    .end annotation
.end field

.field private final pageController:Landroidx/paging/FlattenedPageController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/FlattenedPageController<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final sharedForDownstream:Lvd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvd/c;Lsd/i0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c;",
            "Lsd/i0;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "src"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

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
    new-instance v0, Landroidx/paging/FlattenedPageController;

    .line 15
    .line 16
    invoke-direct {v0}, Landroidx/paging/FlattenedPageController;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/paging/CachedPageEventFlow;->pageController:Landroidx/paging/FlattenedPageController;

    .line 20
    .line 21
    const v0, 0x7fffffff

    .line 22
    .line 23
    .line 24
    sget-object v1, Lkotlinx/coroutines/channels/BufferOverflow;->c:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {v2, v0, v1}, Lvd/q;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lvd/k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Landroidx/paging/CachedPageEventFlow;->mutableSharedSrc:Lvd/k;

    .line 32
    .line 33
    new-instance v1, Landroidx/paging/CachedPageEventFlow$sharedForDownstream$1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, Landroidx/paging/CachedPageEventFlow$sharedForDownstream$1;-><init>(Landroidx/paging/CachedPageEventFlow;Lvc/c;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lvd/e;->M(Lvd/p;Lhd/p;)Lvd/p;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Landroidx/paging/CachedPageEventFlow;->sharedForDownstream:Lvd/p;

    .line 44
    .line 45
    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->d:Lkotlinx/coroutines/CoroutineStart;

    .line 46
    .line 47
    new-instance v6, Landroidx/paging/CachedPageEventFlow$job$1;

    .line 48
    .line 49
    invoke-direct {v6, p1, p0, v2}, Landroidx/paging/CachedPageEventFlow$job$1;-><init>(Lvd/c;Landroidx/paging/CachedPageEventFlow;Lvc/c;)V

    .line 50
    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    move-object v3, p2

    .line 56
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Landroidx/paging/g;

    .line 61
    .line 62
    invoke-direct {p2, p0}, Landroidx/paging/g;-><init>(Landroidx/paging/CachedPageEventFlow;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/g;

    .line 69
    .line 70
    new-instance p1, Landroidx/paging/CachedPageEventFlow$downstreamFlow$1;

    .line 71
    .line 72
    invoke-direct {p1, p0, v2}, Landroidx/paging/CachedPageEventFlow$downstreamFlow$1;-><init>(Landroidx/paging/CachedPageEventFlow;Lvc/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lvd/e;->B(Lhd/p;)Lvd/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Landroidx/paging/CachedPageEventFlow;->downstreamFlow:Lvd/c;

    .line 80
    .line 81
    return-void
.end method

.method public static synthetic a(Landroidx/paging/CachedPageEventFlow;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/CachedPageEventFlow;->job$lambda$0$0(Landroidx/paging/CachedPageEventFlow;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getJob$p(Landroidx/paging/CachedPageEventFlow;)Lkotlinx/coroutines/g;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMutableSharedSrc$p(Landroidx/paging/CachedPageEventFlow;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->mutableSharedSrc:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageController$p(Landroidx/paging/CachedPageEventFlow;)Landroidx/paging/FlattenedPageController;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->pageController:Landroidx/paging/FlattenedPageController;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSharedForDownstream$p(Landroidx/paging/CachedPageEventFlow;)Lvd/p;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->sharedForDownstream:Lvd/p;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final job$lambda$0$0(Landroidx/paging/CachedPageEventFlow;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->mutableSharedSrc:Lvd/k;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-interface {p0, p1}, Lvd/k;->a(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getCachedEvent$paging_common()Landroidx/paging/PageEvent$Insert;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/CachedPageEventFlow;->pageController:Landroidx/paging/FlattenedPageController;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/FlattenedPageController;->getCachedEvent()Landroidx/paging/PageEvent$Insert;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getDownstreamFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/CachedPageEventFlow;->downstreamFlow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method
