.class final Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->o(Lcom/zykj/student/dialogue/bean/resp/CollectSession;)V
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
    c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$changeCollect$1"
    f = "SearchQuestionViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x28
    }
    m = "invokeSuspend"
    n = {
        "isCollectNow"
    }
    s = {
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n230#2,3:111\n233#2,2:118\n1563#3:114\n1634#3,3:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1\n*L\n43#1:111,3\n43#1:118,2\n44#1:114\n44#1:115,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public final synthetic c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;-><init>(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->b:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget v1, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->a:I

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object/from16 v4, p1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->isCollect()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    xor-int/2addr v2, v3

    .line 40
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 41
    .line 42
    invoke-static {v4}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->m(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lk6/g;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, Lcom/zykj/student/dialogue/bean/req/CollectReq;

    .line 47
    .line 48
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 49
    .line 50
    invoke-virtual {v6}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-direct {v5, v6, v2}, Lcom/zykj/student/dialogue/bean/req/CollectReq;-><init>(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    iput v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->a:I

    .line 58
    .line 59
    iput v3, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->b:I

    .line 60
    .line 61
    invoke-interface {v4, v5, v0}, Lk6/g;->f(Lcom/zykj/student/dialogue/bean/req/CollectReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-ne v4, v1, :cond_2

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_2
    move v1, v2

    .line 69
    :goto_0
    check-cast v4, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 70
    .line 71
    invoke-static {v4}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 75
    .line 76
    new-instance v4, Lh6/b$a$b;

    .line 77
    .line 78
    iget-object v5, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 79
    .line 80
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->isCollect()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    const-string v5, "\u53d6\u6d88\u6536\u85cf\u6210\u529f"

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-string v5, "\u6536\u85cf\u6210\u529f"

    .line 90
    .line 91
    :goto_1
    invoke-direct {v4, v5}, Lh6/b$a$b;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4}, Lcom/zykj/student/dialogue/base/BaseViewModel;->g(Lh6/b;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->d:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 98
    .line 99
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->n(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;->c:Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 104
    .line 105
    :cond_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object v6, v5

    .line 110
    check-cast v6, Lm6/k0;

    .line 111
    .line 112
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 113
    .line 114
    invoke-virtual {v6}, Lm6/k0;->b()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-static {v7}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_5

    .line 127
    .line 128
    move-object v7, v8

    .line 129
    :cond_5
    check-cast v7, Ljava/lang/Iterable;

    .line 130
    .line 131
    new-instance v8, Ljava/util/ArrayList;

    .line 132
    .line 133
    const/16 v9, 0xa

    .line 134
    .line 135
    invoke-static {v7, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_8

    .line 151
    .line 152
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    move-object v10, v9

    .line 157
    check-cast v10, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 158
    .line 159
    invoke-virtual {v10}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_7

    .line 172
    .line 173
    if-eqz v1, :cond_6

    .line 174
    .line 175
    move/from16 v20, v3

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_6
    const/4 v9, 0x0

    .line 179
    move/from16 v20, v9

    .line 180
    .line 181
    :goto_3
    const/16 v22, 0x5ff

    .line 182
    .line 183
    const/16 v23, 0x0

    .line 184
    .line 185
    const/4 v11, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    const/16 v16, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const/16 v19, 0x0

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    invoke-static/range {v10 .. v23}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->copy$default(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    :cond_7
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_8
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-virtual {v6, v7}, Lm6/k0;->a(Ljava/lang/Object;)Lm6/k0;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-interface {v2, v5, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_4

    .line 221
    .line 222
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v1
.end method
