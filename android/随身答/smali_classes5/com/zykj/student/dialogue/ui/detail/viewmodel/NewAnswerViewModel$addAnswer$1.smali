.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$addAnswer$1"
    f = "NewAnswerViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x43,
        0x4c,
        0x4e,
        0x51
    }
    m = "invokeSuspend"
    n = {
        "$i$a$-runCatching-NewAnswerViewModel$addAnswer$1$1",
        "it",
        "$i$a$-onSuccess-NewAnswerViewModel$addAnswer$1$2",
        "it",
        "$i$a$-onSuccess-NewAnswerViewModel$addAnswer$1$2",
        "it",
        "$i$a$-onFailure-NewAnswerViewModel$addAnswer$1$3"
    }
    s = {
        "I$0",
        "L$1",
        "I$0",
        "L$1",
        "I$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->f:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->g:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->h:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->h:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v4, :cond_2

    .line 15
    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Throwable;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v8, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->h:Ljava/lang/String;

    .line 66
    .line 67
    :try_start_1
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->m(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lk6/g;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v9, Lcom/zykj/student/dialogue/bean/req/AddMessageReq;

    .line 74
    .line 75
    invoke-direct {v9, v1, v7, v8}, Lcom/zykj/student/dialogue/bean/req/AddMessageReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput v6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->a:I

    .line 79
    .line 80
    iput v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->d:I

    .line 81
    .line 82
    invoke-interface {p1, v9, p0}, Lk6/g;->d(Lcom/zykj/student/dialogue/bean/req/AddMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_4

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    :goto_0
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    :goto_1
    move-object v1, p1

    .line 97
    goto :goto_3

    .line 98
    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 99
    .line 100
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    goto :goto_1

    .line 109
    :goto_3
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 110
    .line 111
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_6

    .line 116
    .line 117
    move-object v7, v1

    .line 118
    check-cast v7, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 119
    .line 120
    invoke-virtual {v7}, Lcom/zykj/student/dialogue/network/BaseResponse;->getSuccess()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    const/4 v9, 0x0

    .line 125
    if-eqz v8, :cond_5

    .line 126
    .line 127
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;

    .line 132
    .line 133
    invoke-direct {v3, v4, v9, v5, v9}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;-><init>(ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 134
    .line 135
    .line 136
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->b:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iput-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    iput v6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->a:I

    .line 145
    .line 146
    iput v5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->d:I

    .line 147
    .line 148
    invoke-interface {p1, v3, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v0, :cond_6

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_5
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;

    .line 160
    .line 161
    invoke-direct {v4, v6, v9, v5, v9}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;-><init>(ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->b:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    iput-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->c:Ljava/lang/Object;

    .line 171
    .line 172
    iput v6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->a:I

    .line 173
    .line 174
    iput v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->d:I

    .line 175
    .line 176
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-ne p1, v0, :cond_6

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    :goto_4
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 184
    .line 185
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    if-eqz v3, :cond_7

    .line 190
    .line 191
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;

    .line 196
    .line 197
    invoke-direct {v4, v6, v3}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;-><init>(ZLjava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->b:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->c:Ljava/lang/Object;

    .line 207
    .line 208
    iput v6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->a:I

    .line 209
    .line 210
    iput v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;->d:I

    .line 211
    .line 212
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-ne p1, v0, :cond_7

    .line 217
    .line 218
    :goto_5
    return-object v0

    .line 219
    :cond_7
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p1
.end method
