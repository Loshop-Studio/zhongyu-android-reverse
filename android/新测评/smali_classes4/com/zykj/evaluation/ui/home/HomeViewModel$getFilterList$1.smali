.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->M()V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$getFilterList$1"
    f = "HomeViewModel.kt"
    i = {
        0x1
    }
    l = {
        0xd0,
        0xd9
    }
    m = "invokeSuspend"
    n = {
        "subjectList"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n1563#2:716\n1634#2,3:717\n1563#2:720\n1634#2,3:721\n1563#2:727\n1634#2,3:728\n230#3,3:724\n233#3,2:731\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1\n*L\n208#1:716\n208#1:717,3\n217#1:720\n217#1:721,3\n228#1:727\n228#1:728,3\n226#1:724,3\n226#1:731,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

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
    iget v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->b:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/16 v5, 0xa

    .line 12
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
    iget-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v3, p1

    .line 27
    .line 28
    move-object v8, v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object/from16 v2, p1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 48
    .line 49
    invoke-static {v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->q(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lp5/j;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput v4, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->b:I

    .line 54
    .line 55
    invoke-interface {v2, v0}, Lp5/j;->w(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-ne v2, v1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_0
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 63
    .line 64
    invoke-static {v2}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/Iterable;

    .line 69
    .line 70
    new-instance v4, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lcom/zykj/evaluation/bean/GetTopicList;

    .line 94
    .line 95
    new-instance v7, Lcom/zykj/evaluation/ui/home/c$d;

    .line 96
    .line 97
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/GetTopicList;->getId()J

    .line 98
    .line 99
    .line 100
    move-result-wide v8

    .line 101
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/GetTopicList;->getContent()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-direct {v7, v8, v9, v6}, Lcom/zykj/evaluation/ui/home/c$d;-><init>(JLjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    sget-object v2, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v4, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 123
    .line 124
    invoke-static {v4}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->q(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lp5/j;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    iput-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->a:Ljava/lang/Object;

    .line 129
    .line 130
    iput v3, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->b:I

    .line 131
    .line 132
    invoke-interface {v4, v0}, Lp5/j;->k(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-ne v3, v1, :cond_5

    .line 137
    .line 138
    :goto_2
    return-object v1

    .line 139
    :cond_5
    move-object v8, v2

    .line 140
    :goto_3
    check-cast v3, Lcom/zykj/http/bean/ApiResp;

    .line 141
    .line 142
    invoke-static {v3}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Iterable;

    .line 147
    .line 148
    new-instance v2, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_6

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lcom/zykj/evaluation/bean/ClassItem;

    .line 172
    .line 173
    new-instance v4, Lcom/zykj/evaluation/ui/home/c$b;

    .line 174
    .line 175
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/ClassItem;->getId()J

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/ClassItem;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-direct {v4, v6, v3}, Lcom/zykj/evaluation/ui/home/c$b;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_6
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$b$a;->d:Lcom/zykj/evaluation/ui/home/c$b$a;

    .line 195
    .line 196
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;->c:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 205
    .line 206
    invoke-static {v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :goto_5
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    move-object v4, v3

    .line 215
    check-cast v4, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 216
    .line 217
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    new-instance v15, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v16

    .line 234
    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-eqz v6, :cond_9

    .line 239
    .line 240
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    check-cast v6, Ls6/d;

    .line 245
    .line 246
    invoke-virtual {v6}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    instance-of v9, v7, Lcom/zykj/evaluation/ui/home/c$d;

    .line 251
    .line 252
    if-eqz v9, :cond_8

    .line 253
    .line 254
    const/4 v10, 0x5

    .line 255
    const/4 v11, 0x0

    .line 256
    const/4 v7, 0x0

    .line 257
    const/4 v9, 0x0

    .line 258
    invoke-static/range {v6 .. v11}, Ls6/d;->b(Ls6/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ls6/d;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    :cond_7
    move-object v11, v1

    .line 263
    goto :goto_7

    .line 264
    :cond_8
    instance-of v7, v7, Lcom/zykj/evaluation/ui/home/c$b;

    .line 265
    .line 266
    if-eqz v7, :cond_7

    .line 267
    .line 268
    const/4 v13, 0x5

    .line 269
    const/4 v14, 0x0

    .line 270
    const/4 v10, 0x0

    .line 271
    const/4 v12, 0x0

    .line 272
    move-object v11, v1

    .line 273
    move-object v9, v6

    .line 274
    invoke-static/range {v9 .. v14}, Ls6/d;->b(Ls6/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ls6/d;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    :goto_7
    invoke-interface {v15, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-object v1, v11

    .line 282
    goto :goto_6

    .line 283
    :cond_9
    move-object v11, v1

    .line 284
    invoke-virtual {v4, v15}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-interface {v2, v3, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_a

    .line 293
    .line 294
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 295
    .line 296
    return-object v1

    .line 297
    :cond_a
    move-object v1, v11

    .line 298
    goto :goto_5
.end method
