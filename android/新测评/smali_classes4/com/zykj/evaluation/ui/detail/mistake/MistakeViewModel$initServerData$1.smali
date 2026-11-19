.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->I()V
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
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$initServerData$1"
    f = "MistakeViewModel.kt"
    i = {
        0x1,
        0x2,
        0x2
    }
    l = {
        0x7a,
        0x84,
        0x86
    }
    m = "invokeSuspend"
    n = {
        "topicList",
        "topicList",
        "tagList"
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,585:1\n1563#2:586\n1634#2,3:587\n1563#2:593\n1634#2,3:594\n230#3,3:590\n233#3,2:597\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1\n*L\n122#1:586\n122#1:587,3\n143#1:593\n143#1:594,3\n136#1:590,3\n136#1:597,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

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
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->c:I

    .line 8
    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    if-eq v2, v6, :cond_2

    .line 17
    .line 18
    if-eq v2, v5, :cond_1

    .line 19
    .line 20
    if-ne v2, v4, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/util/List;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v4, p1

    .line 34
    .line 35
    move-object v6, v2

    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/List;

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v6, v2

    .line 54
    move-object/from16 v2, p1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v2, p1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 67
    .line 68
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->c:I

    .line 73
    .line 74
    invoke-interface {v2, v0}, Lp5/j;->w(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v1, :cond_4

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_4
    :goto_0
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 83
    .line 84
    invoke-static {v2}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/Iterable;

    .line 89
    .line 90
    new-instance v6, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, Lcom/zykj/evaluation/bean/GetTopicList;

    .line 114
    .line 115
    new-instance v8, Lz5/t1;

    .line 116
    .line 117
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/GetTopicList;->getId()J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/GetTopicList;->getContent()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-direct {v8, v9, v10, v7}, Lz5/t1;-><init>(JLjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_6

    .line 137
    .line 138
    sget-object v1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 139
    .line 140
    const-string v2, "\u79d1\u76ee\u52a0\u8f7d\u5931\u8d25\uff0c\u8bf7\u8fd4\u56de\u540e\u91cd\u8bd5"

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_6
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 149
    .line 150
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iput-object v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->a:Ljava/lang/Object;

    .line 155
    .line 156
    iput v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->c:I

    .line 157
    .line 158
    invoke-interface {v2, v0}, Lp5/j;->e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-ne v2, v1, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    :goto_2
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 166
    .line 167
    invoke-static {v2}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/util/List;

    .line 172
    .line 173
    if-nez v2, :cond_8

    .line 174
    .line 175
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    :cond_8
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 180
    .line 181
    invoke-static {v5}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    iput-object v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->a:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->b:Ljava/lang/Object;

    .line 188
    .line 189
    iput v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->c:I

    .line 190
    .line 191
    const-string v4, "com.zykj.mistake"

    .line 192
    .line 193
    invoke-interface {v5, v4, v0}, Lp5/j;->p(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    if-ne v4, v1, :cond_9

    .line 198
    .line 199
    :goto_3
    return-object v1

    .line 200
    :cond_9
    move-object v1, v2

    .line 201
    :goto_4
    check-cast v4, Lcom/zykj/http/bean/ApiResp;

    .line 202
    .line 203
    invoke-static {v4}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;->d:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 214
    .line 215
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->u(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    :cond_a
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    move-object v5, v4

    .line 224
    check-cast v5, Lz5/l1;

    .line 225
    .line 226
    new-instance v7, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    new-instance v13, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 232
    .line 233
    const/16 v18, 0x7

    .line 234
    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    const-wide/16 v14, 0x0

    .line 238
    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    const/16 v17, 0x0

    .line 242
    .line 243
    invoke-direct/range {v13 .. v19}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    new-instance v8, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-eqz v10, :cond_b

    .line 267
    .line 268
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    check-cast v10, Lcom/zykj/evaluation/bean/TagInfo;

    .line 273
    .line 274
    new-instance v13, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 275
    .line 276
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/TagInfo;->getId()J

    .line 277
    .line 278
    .line 279
    move-result-wide v14

    .line 280
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/TagInfo;->getName()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    const/16 v18, 0x4

    .line 285
    .line 286
    const/16 v19, 0x0

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    invoke-direct/range {v13 .. v19}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_b
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 298
    .line 299
    .line 300
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 301
    .line 302
    const/16 v18, 0x5de

    .line 303
    .line 304
    const/16 v19, 0x0

    .line 305
    .line 306
    move-object/from16 v16, v7

    .line 307
    .line 308
    const-wide/16 v7, 0x0

    .line 309
    .line 310
    const/4 v9, 0x0

    .line 311
    const/4 v10, 0x0

    .line 312
    const/4 v11, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    const/4 v14, 0x0

    .line 315
    const/4 v15, 0x0

    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    invoke-static/range {v5 .. v19}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-interface {v2, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eqz v4, :cond_a

    .line 327
    .line 328
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v1
.end method
