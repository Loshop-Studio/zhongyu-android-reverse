.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$createSession$1"
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
        0x5f,
        0x6a,
        0x6c,
        0x6f
    }
    m = "invokeSuspend"
    n = {
        "$i$a$-runCatching-NewAnswerViewModel$createSession$1$1",
        "it",
        "$i$a$-onSuccess-NewAnswerViewModel$createSession$1$2",
        "it",
        "$i$a$-onSuccess-NewAnswerViewModel$createSession$1$2",
        "it",
        "$i$a$-onFailure-NewAnswerViewModel$createSession$1$3"
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

.field public final synthetic f:[Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->f:[Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->g:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->h:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->i:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->j:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->f:[Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->h:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->i:Ljava/lang/String;

    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->j:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->d:I

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
    const/4 v7, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->c:Ljava/lang/Object;

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
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->b:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->f:[Ljava/lang/String;

    .line 64
    .line 65
    iget-object v10, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->g:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v11, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->h:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v12, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->i:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v13, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->j:Ljava/lang/String;

    .line 72
    .line 73
    :try_start_1
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 74
    .line 75
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->m(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lk6/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v9, v0

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    move-object v9, v6

    .line 88
    :goto_0
    new-instance v8, Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;

    .line 89
    .line 90
    invoke-direct/range {v8 .. v13}, Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->a:I

    .line 94
    .line 95
    iput v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->d:I

    .line 96
    .line 97
    invoke-interface {p1, v8, p0}, Lk6/g;->j(Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v1, :cond_5

    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_5
    :goto_1
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 106
    .line 107
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :goto_2
    move-object v0, p1

    .line 112
    goto :goto_4

    .line 113
    :goto_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    goto :goto_2

    .line 124
    :goto_4
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 125
    .line 126
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_7

    .line 131
    .line 132
    move-object v8, v0

    .line 133
    check-cast v8, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 134
    .line 135
    invoke-virtual {v8}, Lcom/zykj/student/dialogue/network/BaseResponse;->getSuccess()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_6

    .line 140
    .line 141
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;

    .line 146
    .line 147
    invoke-direct {v3, v4, v6, v5, v6}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;-><init>(ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->b:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iput-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->c:Ljava/lang/Object;

    .line 157
    .line 158
    iput v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->a:I

    .line 159
    .line 160
    iput v5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->d:I

    .line 161
    .line 162
    invoke-interface {p1, v3, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v1, :cond_7

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;

    .line 174
    .line 175
    invoke-direct {v4, v7, v6, v5, v6}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;-><init>(ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->b:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    iput-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->c:Ljava/lang/Object;

    .line 185
    .line 186
    iput v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->a:I

    .line 187
    .line 188
    iput v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->d:I

    .line 189
    .line 190
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v1, :cond_7

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_7
    :goto_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->e:Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 198
    .line 199
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-eqz v3, :cond_8

    .line 204
    .line 205
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;

    .line 210
    .line 211
    invoke-direct {v4, v7, v3}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;-><init>(ZLjava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->b:Ljava/lang/Object;

    .line 215
    .line 216
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->c:Ljava/lang/Object;

    .line 221
    .line 222
    iput v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->a:I

    .line 223
    .line 224
    iput v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;->d:I

    .line 225
    .line 226
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-ne p1, v1, :cond_8

    .line 231
    .line 232
    :goto_6
    return-object v1

    .line 233
    :cond_8
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p1
.end method
