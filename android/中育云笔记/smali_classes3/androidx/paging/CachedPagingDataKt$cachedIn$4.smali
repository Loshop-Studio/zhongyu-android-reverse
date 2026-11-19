.class final Landroidx/paging/CachedPagingDataKt$cachedIn$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;Landroidx/paging/ActiveFlowTracker;)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.CachedPagingDataKt$cachedIn$4"
    f = "CachedPagingData.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $tracker:Landroidx/paging/ActiveFlowTracker;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/paging/ActiveFlowTracker;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ActiveFlowTracker;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/CachedPagingDataKt$cachedIn$4;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->$tracker:Landroidx/paging/ActiveFlowTracker;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/paging/CachedPagingDataKt$cachedIn$4;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->$tracker:Landroidx/paging/ActiveFlowTracker;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/paging/CachedPagingDataKt$cachedIn$4;-><init>(Landroidx/paging/ActiveFlowTracker;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/d;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->invoke(Lvd/d;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/d;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/CachedPagingDataKt$cachedIn$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->label:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->$tracker:Landroidx/paging/ActiveFlowTracker;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    sget-object v1, Landroidx/paging/ActiveFlowTracker$FlowType;->PAGED_DATA_FLOW:Landroidx/paging/ActiveFlowTracker$FlowType;

    .line 32
    .line 33
    iput v2, p0, Landroidx/paging/CachedPagingDataKt$cachedIn$4;->label:I

    .line 34
    .line 35
    invoke-interface {p1, v1, p0}, Landroidx/paging/ActiveFlowTracker;->onStart(Landroidx/paging/ActiveFlowTracker$FlowType;Lvc/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 43
    .line 44
    return-object p1
.end method
