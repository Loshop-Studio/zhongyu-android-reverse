.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2"
    f = "HomeViewModel.kt"
    i = {}
    l = {
        0xa3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->c:Lcom/zykj/message/server/bean/UserInfo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->c:Lcom/zykj/message/server/bean/UserInfo;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->o(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lcom/zykj/evaluation/di/AppDatabase;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "getId(...)"

    .line 44
    .line 45
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    invoke-interface {p1, v3, v4}, Ln5/b;->e(J)Lkotlinx/coroutines/flow/Flow;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {v1, v3, v4}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 62
    .line 63
    .line 64
    iput v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->a:I

    .line 65
    .line 66
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p1
.end method
