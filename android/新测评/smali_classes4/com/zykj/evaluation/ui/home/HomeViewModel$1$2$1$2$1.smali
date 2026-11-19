.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Ln5/a;",
        ">;",
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
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Ln5/a;",
        "list",
        "",
        "<anonymous>",
        "(Ljava/util/List;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:721\n1869#3,2:719\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1\n*L\n165#1:716,3\n165#1:721,2\n167#1:719,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {v0, v1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_8

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->w(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Ljava/util/Map;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_7

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ln5/a;

    .line 47
    .line 48
    invoke-virtual {v4}, Ln5/a;->d()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    sget-object v6, Lm5/e$c;->b:Lm5/e$c;

    .line 53
    .line 54
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-ne v5, v6, :cond_1

    .line 59
    .line 60
    sget-object v5, Lt6/q0$b$c;->d:Lt6/q0$b$c;

    .line 61
    .line 62
    :goto_1
    move-object v8, v5

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    sget-object v6, Lm5/e$b;->b:Lm5/e$b;

    .line 65
    .line 66
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v5, v6, :cond_2

    .line 71
    .line 72
    sget-object v5, Lt6/q0$b$b;->d:Lt6/q0$b$b;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    sget-object v6, Lm5/e$a;->b:Lm5/e$a;

    .line 76
    .line 77
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/4 v7, 0x0

    .line 82
    if-ne v5, v6, :cond_4

    .line 83
    .line 84
    invoke-virtual {v4}, Ln5/a;->f()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    move-object v5, v7

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    sget-object v5, Lt6/q0$b$a;->d:Lt6/q0$b$a;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move-object v8, v7

    .line 96
    :goto_2
    invoke-virtual {v4}, Ln5/a;->h()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v4}, Ln5/a;->h()J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-object v6, v4

    .line 117
    check-cast v6, Lt6/p0;

    .line 118
    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    const/4 v10, 0x5

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    invoke-static/range {v6 .. v11}, Lt6/p0;->b(Lt6/p0;Ljava/lang/Boolean;Lt6/q0;Ljava/lang/Boolean;ILjava/lang/Object;)Lt6/p0;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-nez v4, :cond_6

    .line 130
    .line 131
    :cond_5
    new-instance v6, Lt6/p0;

    .line 132
    .line 133
    const/4 v10, 0x5

    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v9, 0x0

    .line 137
    invoke-direct/range {v6 .. v11}, Lt6/p0;-><init>(Ljava/lang/Boolean;Lt6/q0;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 138
    .line 139
    .line 140
    move-object v4, v6

    .line 141
    :cond_6
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_7
    invoke-interface {p1, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_0

    .line 150
    .line 151
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1
.end method
