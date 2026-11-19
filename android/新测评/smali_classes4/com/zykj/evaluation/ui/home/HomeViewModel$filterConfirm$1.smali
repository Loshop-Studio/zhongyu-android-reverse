.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->K()V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$filterConfirm$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {
        0x274
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:727\n230#2,3:729\n233#2,2:739\n1563#3:719\n1634#3,2:720\n1563#3:722\n1634#3,3:723\n1636#3:726\n1563#3:732\n1634#3,3:733\n774#3:736\n865#3,2:737\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1\n*L\n597#1:716,3\n597#1:727,2\n617#1:729,3\n617#1:739,2\n599#1:719\n599#1:720,2\n601#1:722\n601#1:723,3\n599#1:726\n619#1:732\n619#1:733,3\n621#1:736\n621#1:737,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->a:I

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
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_2
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v3, v1

    .line 39
    check-cast v3, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v6, 0xa

    .line 48
    .line 49
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_5

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    move-object v8, v7

    .line 71
    check-cast v8, Ls6/d;

    .line 72
    .line 73
    invoke-virtual {v8}, Ls6/d;->d()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    new-instance v10, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    check-cast v9, Lcom/zykj/evaluation/ui/home/c;

    .line 101
    .line 102
    instance-of v11, v9, Lcom/zykj/evaluation/ui/home/c$e$a;

    .line 103
    .line 104
    if-eqz v11, :cond_3

    .line 105
    .line 106
    move-object v11, v9

    .line 107
    check-cast v11, Lcom/zykj/evaluation/ui/home/c$e$a;

    .line 108
    .line 109
    invoke-virtual {v11}, Lcom/zykj/evaluation/ui/home/c$e$a;->d()Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-nez v11, :cond_3

    .line 114
    .line 115
    invoke-virtual {v8}, Ls6/d;->c()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-interface {v11, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-nez v11, :cond_3

    .line 124
    .line 125
    new-instance v9, Lcom/zykj/evaluation/ui/home/c$e$a;

    .line 126
    .line 127
    const/4 v11, 0x3

    .line 128
    const/4 v12, 0x0

    .line 129
    invoke-direct {v9, v12, v12, v11, v12}, Lcom/zykj/evaluation/ui/home/c$e$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-interface {v10, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 v12, 0x5

    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v11, 0x0

    .line 140
    invoke-static/range {v8 .. v13}, Ls6/d;->b(Ls6/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ls6/d;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_5
    invoke-virtual {v3, v5}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {p1, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_2

    .line 157
    .line 158
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 159
    .line 160
    invoke-static {p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->v(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-object v3, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 165
    .line 166
    :cond_6
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    move-object v7, p1

    .line 171
    check-cast v7, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 172
    .line 173
    invoke-static {v3}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-interface {v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 182
    .line 183
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    new-instance v5, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-eqz v8, :cond_7

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    check-cast v8, Ls6/d;

    .line 211
    .line 212
    new-instance v9, Lkotlin/Pair;

    .line 213
    .line 214
    invoke-virtual {v8}, Ls6/d;->e()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v8}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    new-instance v9, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    const/4 v8, 0x0

    .line 239
    :cond_8
    :goto_3
    if-ge v8, v4, :cond_9

    .line 240
    .line 241
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    add-int/lit8 v8, v8, 0x1

    .line 246
    .line 247
    move-object v11, v10

    .line 248
    check-cast v11, Lkotlin/Pair;

    .line 249
    .line 250
    invoke-virtual {v11}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    check-cast v11, Ljava/lang/CharSequence;

    .line 255
    .line 256
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-lez v11, :cond_8

    .line 261
    .line 262
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_9
    const/16 v12, 0xd

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v8, 0x0

    .line 270
    const/4 v10, 0x0

    .line 271
    const/4 v11, 0x0

    .line 272
    invoke-static/range {v7 .. v13}, Lcom/zykj/evaluation/ui/home/HomeViewState;->copy$default(Lcom/zykj/evaluation/ui/home/HomeViewState;Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-interface {v1, p1, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-eqz p1, :cond_6

    .line 281
    .line 282
    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 283
    .line 284
    iput v2, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;->a:I

    .line 285
    .line 286
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->B(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-ne p1, v0, :cond_a

    .line 291
    .line 292
    return-object v0

    .line 293
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p1
.end method
