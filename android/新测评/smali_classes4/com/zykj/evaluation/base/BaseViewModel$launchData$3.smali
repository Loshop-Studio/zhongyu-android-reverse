.class final Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/base/BaseViewModel;->e(Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.zykj.evaluation.base.BaseViewModel$launchData$3"
    f = "BaseViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x5
    }
    l = {
        0x4f,
        0x50,
        0x57,
        0x54,
        0x57,
        0x57
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$launch",
        "$this$launch",
        "$this$launch",
        "e",
        "it",
        "$i$a$-let-BaseViewModel$launchData$3$1",
        "$this$launch",
        "$this$launch"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:Lkotlin/jvm/functions/Function3;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;

    iget-object v1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :pswitch_1
    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lkotlin/jvm/functions/Function3;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/lang/Throwable;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :pswitch_3
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :try_start_2
    iget-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->f:Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    iput-object v0, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    iput v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 71
    .line 72
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_0

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->g:Lkotlin/jvm/functions/Function2;

    .line 81
    .line 82
    iput-object v0, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    iput v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 86
    .line 87
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    if-ne p1, v1, :cond_1

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 101
    .line 102
    const/4 v2, 0x3

    .line 103
    iput v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 104
    .line 105
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v1, :cond_4

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->h:Lkotlin/jvm/functions/Function3;

    .line 116
    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    iput-object v0, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iput-object v4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    iput v4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->c:I

    .line 131
    .line 132
    const/4 v4, 0x4

    .line 133
    iput v4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 134
    .line 135
    invoke-interface {v2, v0, p1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v1, :cond_3

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_2
    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->i:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {p1, v2}, Lo5/h;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    .line 146
    .line 147
    :cond_3
    :goto_3
    iget-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    .line 148
    .line 149
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iput-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v2, 0x5

    .line 160
    iput v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 161
    .line 162
    invoke-interface {p1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v1, :cond_4

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_4
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p1

    .line 172
    :goto_5
    iget-object v2, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->j:Lkotlin/jvm/functions/Function2;

    .line 173
    .line 174
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iput-object v4, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->e:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object p1, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->a:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->b:Ljava/lang/Object;

    .line 183
    .line 184
    const/4 v3, 0x6

    .line 185
    iput v3, p0, Lcom/zykj/evaluation/base/BaseViewModel$launchData$3;->d:I

    .line 186
    .line 187
    invoke-interface {v2, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v0, v1, :cond_5

    .line 192
    .line 193
    :goto_6
    return-object v1

    .line 194
    :cond_5
    move-object v0, p1

    .line 195
    :goto_7
    throw v0

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
