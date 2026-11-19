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
.field private final downstreamFlow:Ll8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/c;"
        }
    .end annotation
.end field

.field private final job:Lkotlinx/coroutines/n;

.field private final mutableSharedSrc:Ll8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/g;"
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

.field private final sharedForDownstream:Ll8/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll8/c;Li8/b0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/c;",
            "Li8/b0;",
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
    sget-object v1, Lkotlinx/coroutines/channels/BufferOverflow;->a:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {v2, v0, v1}, Ll8/m;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Ll8/g;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Landroidx/paging/CachedPageEventFlow;->mutableSharedSrc:Ll8/g;

    .line 32
    .line 33
    new-instance v1, Landroidx/paging/CachedPageEventFlow$sharedForDownstream$1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, Landroidx/paging/CachedPageEventFlow$sharedForDownstream$1;-><init>(Landroidx/paging/CachedPageEventFlow;Lm7/c;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Ll8/e;->N(Ll8/l;Lx7/p;)Ll8/l;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Landroidx/paging/CachedPageEventFlow;->sharedForDownstream:Ll8/l;

    .line 44
    .line 45
    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->b:Lkotlinx/coroutines/CoroutineStart;

    .line 46
    .line 47
    new-instance v6, Landroidx/paging/CachedPageEventFlow$job$1;

    .line 48
    .line 49
    invoke-direct {v6, p1, p0, v2}, Landroidx/paging/CachedPageEventFlow$job$1;-><init>(Ll8/c;Landroidx/paging/CachedPageEventFlow;Lm7/c;)V

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
    invoke-static/range {v3 .. v8}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Landroidx/paging/CachedPageEventFlow$job$2$1;

    .line 61
    .line 62
    invoke-direct {p2, p0}, Landroidx/paging/CachedPageEventFlow$job$2$1;-><init>(Landroidx/paging/CachedPageEventFlow;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, Lkotlinx/coroutines/n;->k(Lx7/l;)Li8/k0;

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/n;

    .line 69
    .line 70
    new-instance p1, Landroidx/paging/CachedPageEventFlow$downstreamFlow$1;

    .line 71
    .line 72
    invoke-direct {p1, p0, v2}, Landroidx/paging/CachedPageEventFlow$downstreamFlow$1;-><init>(Landroidx/paging/CachedPageEventFlow;Lm7/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Ll8/e;->B(Lx7/p;)Ll8/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Landroidx/paging/CachedPageEventFlow;->downstreamFlow:Ll8/c;

    .line 80
    .line 81
    return-void
.end method

.method public static final synthetic access$getJob$p(Landroidx/paging/CachedPageEventFlow;)Lkotlinx/coroutines/n;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMutableSharedSrc$p(Landroidx/paging/CachedPageEventFlow;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->mutableSharedSrc:Ll8/g;

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

.method public static final synthetic access$getSharedForDownstream$p(Landroidx/paging/CachedPageEventFlow;)Ll8/l;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/CachedPageEventFlow;->sharedForDownstream:Ll8/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/CachedPageEventFlow;->job:Lkotlinx/coroutines/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/n$a;->a(Lkotlinx/coroutines/n;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getCachedEvent$paging_common_release()Landroidx/paging/PageEvent$Insert;
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

.method public final getDownstreamFlow()Ll8/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/CachedPageEventFlow;->downstreamFlow:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method
