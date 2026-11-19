.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->r(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$commit$1"
    f = "NormalViewModel.kt"
    i = {
        0x2
    }
    l = {
        0x2e9,
        0x2f3,
        0x2f9
    }
    m = "invokeSuspend"
    n = {
        "commitTaskAnswerList"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->d:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->e:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->d:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->e:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v11

    .line 5
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->b:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v4, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 57
    .line 58
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 65
    .line 66
    iput v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->b:I

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-ne v0, v11, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->C0()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->d:Lkotlin/jvm/functions/Function0;

    .line 84
    .line 85
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_5
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 92
    .line 93
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->b:I

    .line 94
    .line 95
    invoke-static {v0, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->x0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v11, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-static {v0, v2, v3, v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->h0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 116
    .line 117
    invoke-static {v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->k0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Lcom/zykj/message/server/bean/UserInfo;

    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v3, "getId(...)"

    .line 132
    .line 133
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->c:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 141
    .line 142
    invoke-static {v4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->c0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    iput-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->a:Ljava/lang/Object;

    .line 151
    .line 152
    iput v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->b:I

    .line 153
    .line 154
    move-wide v1, v2

    .line 155
    move-wide v3, v6

    .line 156
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/16 v9, 0x18

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    move-object v8, p0

    .line 162
    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->j(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-ne v0, v11, :cond_7

    .line 167
    .line 168
    :goto_2
    return-object v11

    .line 169
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;->e:Lkotlin/jvm/functions/Function0;

    .line 170
    .line 171
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0
.end method
