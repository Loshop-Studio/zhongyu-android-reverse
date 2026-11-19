.class final Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Lcom/zykj/huiwei/launcher/bean/HomeTime;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "Lcom/zykj/huiwei/launcher/bean/HomeTime;"
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
    c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1$1"
    f = "HomeViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xc2,
        0xc5
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "homeTime",
        "it",
        "time",
        "$i$a$-let-HomeViewModel$startShowHomeTime$1$1$1",
        "$this$flow",
        "homeTime",
        "time"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "I$0",
        "L$0",
        "L$1",
        "J$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:J

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;

    invoke-direct {v0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->e:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/HomeTime;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-wide v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->c:J

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/HomeTime;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lcom/zykj/huiwei/launcher/bean/HomeTime;

    .line 53
    .line 54
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/bean/HomeTime;-><init>()V

    .line 55
    .line 56
    .line 57
    move-object v2, p1

    .line 58
    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, Lu3/d;->b(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/HomeTime;->getTime()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2, p1}, Lcom/zykj/huiwei/launcher/bean/HomeTime;->setTime(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v6}, Lu3/d;->a(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v5, v6}, Lu3/d;->c(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    new-instance v9, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v7, "/"

    .line 96
    .line 97
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v2, v7}, Lcom/zykj/huiwei/launcher/bean/HomeTime;->setDate(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->f:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->a:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->b:Ljava/lang/Object;

    .line 119
    .line 120
    iput-wide v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->c:J

    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    iput p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->d:I

    .line 124
    .line 125
    iput v4, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->e:I

    .line 126
    .line 127
    invoke-interface {v0, v2, p0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v1, :cond_4

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    :goto_1
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->f:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->a:Ljava/lang/Object;

    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->b:Ljava/lang/Object;

    .line 140
    .line 141
    iput-wide v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->c:J

    .line 142
    .line 143
    iput v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1;->e:I

    .line 144
    .line 145
    const-wide/16 v5, 0x3e8

    .line 146
    .line 147
    invoke-static {v5, v6, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v1, :cond_3

    .line 152
    .line 153
    :goto_2
    return-object v1
.end method
