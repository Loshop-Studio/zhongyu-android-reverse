.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/message/server/bean/UserInfo;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "userInfo",
        "Lcom/zykj/message/server/bean/UserInfo;"
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n230#2,5:716\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1\n*L\n153#1:716,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic d:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->d:Lkotlinx/coroutines/CoroutineScope;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->d:Lkotlinx/coroutines/CoroutineScope;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->a(Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "getId(...)"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-static {p1, v1, v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->A(Lcom/zykj/evaluation/ui/home/HomeViewModel;J)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->v(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v2, v1

    .line 44
    check-cast v2, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 45
    .line 46
    new-instance v3, Ls6/d1;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->b()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const-string v5, "getPhoto(...)"

    .line 53
    .line 54
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->c()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-string v6, "getRealName(...)"

    .line 62
    .line 63
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v4, v5}, Ls6/d1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/16 v7, 0xe

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-static/range {v2 .. v8}, Lcom/zykj/evaluation/ui/home/HomeViewState;->copy$default(Lcom/zykj/evaluation/ui/home/HomeViewState;Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {p1, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_0

    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->p(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/Job;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 v1, 0x0

    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    invoke-interface {p1}, Lkotlinx/coroutines/Job;->isActive()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/4 v2, 0x1

    .line 99
    if-ne p1, v2, :cond_1

    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->p(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/Job;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    invoke-static {p1, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 113
    .line 114
    iget-object v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1;->d:Lkotlinx/coroutines/CoroutineScope;

    .line 115
    .line 116
    new-instance v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;

    .line 117
    .line 118
    invoke-direct {v5, p1, v0, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)V

    .line 119
    .line 120
    .line 121
    const/4 v6, 0x3

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {p1, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->z(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlinx/coroutines/Job;)V

    .line 130
    .line 131
    .line 132
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 138
    .line 139
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1
.end method
