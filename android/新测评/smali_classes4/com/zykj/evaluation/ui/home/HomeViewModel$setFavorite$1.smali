.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->R(JZ)V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$setFavorite$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {
        0x13a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n230#2,5:716\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1\n*L\n321#1:716,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:J

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;JZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-wide p2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->c:J

    iput-boolean p4, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-wide v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->c:J

    iget-boolean v4, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->d:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;JZLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->q(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lp5/j;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;

    .line 34
    .line 35
    iget-wide v3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->c:J

    .line 36
    .line 37
    iget-boolean v5, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->d:Z

    .line 38
    .line 39
    invoke-direct {v1, v3, v4, v5}, Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;-><init>(JZ)V

    .line 40
    .line 41
    .line 42
    iput v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->a:I

    .line 43
    .line 44
    invoke-interface {p1, v1, p0}, Lp5/j;->f(Lcom/zykj/evaluation/bean/SetTaskFavoriteReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 52
    .line 53
    invoke-static {p1}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->w(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->c:J

    .line 63
    .line 64
    iget-boolean v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;->d:Z

    .line 65
    .line 66
    :cond_3
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    move-object v4, v3

    .line 71
    check-cast v4, Ljava/util/Map;

    .line 72
    .line 73
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    move-object v7, v6

    .line 90
    check-cast v7, Lt6/p0;

    .line 91
    .line 92
    if-eqz v7, :cond_4

    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    const/4 v11, 0x6

    .line 99
    const/4 v12, 0x0

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    invoke-static/range {v7 .. v12}, Lt6/p0;->b(Lt6/p0;Ljava/lang/Boolean;Lt6/q0;Ljava/lang/Boolean;ILjava/lang/Object;)Lt6/p0;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    if-nez v6, :cond_5

    .line 107
    .line 108
    :cond_4
    new-instance v7, Lt6/p0;

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    const/4 v11, 0x6

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    invoke-direct/range {v7 .. v12}, Lt6/p0;-><init>(Ljava/lang/Boolean;Lt6/q0;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    move-object v6, v7

    .line 122
    :cond_5
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p1
.end method
