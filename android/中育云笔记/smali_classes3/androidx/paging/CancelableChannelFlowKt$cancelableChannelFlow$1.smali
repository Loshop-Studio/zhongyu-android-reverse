.class final Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/CancelableChannelFlowKt;->cancelableChannelFlow(Lkotlinx/coroutines/g;Lhd/p;)Lvd/c;
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
    c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1"
    f = "CancelableChannelFlow.kt"
    l = {
        0x1f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $block:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $controller:Lkotlinx/coroutines/g;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/g;Lhd/p;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/g;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$controller:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$block:Lhd/p;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic g(Landroidx/paging/SimpleProducerScope;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->invokeSuspend$lambda$0(Landroidx/paging/SimpleProducerScope;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/paging/SimpleProducerScope;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    invoke-static {p0, p1, v0, p1}, Lkotlinx/coroutines/channels/f$a;->a(Lkotlinx/coroutines/channels/f;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3
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
    new-instance v0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$controller:Lkotlinx/coroutines/g;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$block:Lhd/p;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;-><init>(Lkotlinx/coroutines/g;Lhd/p;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Landroidx/paging/SimpleProducerScope;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/SimpleProducerScope<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/paging/SimpleProducerScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->invoke(Landroidx/paging/SimpleProducerScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->label:I

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
    iget-object p1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroidx/paging/SimpleProducerScope;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$controller:Lkotlinx/coroutines/g;

    .line 32
    .line 33
    new-instance v3, Landroidx/paging/h;

    .line 34
    .line 35
    invoke-direct {v3, p1}, Landroidx/paging/h;-><init>(Landroidx/paging/SimpleProducerScope;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v3}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->$block:Lhd/p;

    .line 42
    .line 43
    iput v2, p0, Landroidx/paging/CancelableChannelFlowKt$cancelableChannelFlow$1;->label:I

    .line 44
    .line 45
    invoke-interface {v1, p1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 53
    .line 54
    return-object p1
.end method
