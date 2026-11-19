.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestMistakes$3"
    f = "MistakeNotebookViewModel.kt"
    i = {}
    l = {
        0x16b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n1573#2:846\n1604#2,4:847\n230#3,5:851\n230#3,5:856\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3\n*L\n366#1:846\n366#1:847,4\n374#1:851,5\n387#1:856,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isRefresh:Z

.field final synthetic $requestSkipCount:I

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;IZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "IZ",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$requestSkipCount:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$isRefresh:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$requestSkipCount:I

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$isRefresh:Z

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;IZLh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Lkotlin/Result;

    .line 19
    .line 20
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3$1;

    .line 37
    .line 38
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 39
    .line 40
    invoke-direct {v2, v5, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iput v4, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->label:I

    .line 44
    .line 45
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-ne v2, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    move-object v1, v2

    .line 53
    :goto_0
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$requestSkipCount:I

    .line 54
    .line 55
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 56
    .line 57
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->$isRefresh:Z

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_8

    .line 64
    .line 65
    move-object v7, v1

    .line 66
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeListResp;

    .line 67
    .line 68
    iget-object v8, v5, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 69
    .line 70
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getMaxResultCount()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    div-int/2addr v2, v8

    .line 75
    add-int/2addr v2, v4

    .line 76
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getItems()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    new-instance v9, Ljava/util/ArrayList;

    .line 85
    .line 86
    const/16 v10, 0xa

    .line 87
    .line 88
    invoke-static {v8, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    const/4 v10, 0x0

    .line 100
    move v11, v10

    .line 101
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_4

    .line 106
    .line 107
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    add-int/lit8 v13, v11, 0x1

    .line 112
    .line 113
    if-ltz v11, :cond_3

    .line 114
    .line 115
    check-cast v12, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 116
    .line 117
    invoke-static {v12, v2, v11}, Lcom/zykj/mistake/data/d;->c(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;II)Lp4/b;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move v11, v13

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 127
    .line 128
    .line 129
    throw v3

    .line 130
    :cond_4
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getTotalCount()I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getMasteredCount()I

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    iget-object v2, v5, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 147
    .line 148
    :cond_5
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    move-object v11, v3

    .line 153
    check-cast v11, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 154
    .line 155
    if-eqz v6, :cond_6

    .line 156
    .line 157
    move-object v15, v9

    .line 158
    goto :goto_2

    .line 159
    :cond_6
    iget-object v5, v11, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 160
    .line 161
    invoke-static {v5, v9}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    move-object v15, v5

    .line 166
    :goto_2
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-ge v5, v12, :cond_7

    .line 171
    .line 172
    move/from16 v18, v4

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_7
    move/from16 v18, v10

    .line 176
    .line 177
    :goto_3
    const/16 v34, 0x0

    .line 178
    .line 179
    const v35, 0x1ffff84

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/16 v17, 0x0

    .line 186
    .line 187
    const/16 v19, 0x0

    .line 188
    .line 189
    const/16 v20, 0x0

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const/16 v22, 0x0

    .line 194
    .line 195
    const/16 v23, 0x0

    .line 196
    .line 197
    const/16 v24, 0x0

    .line 198
    .line 199
    const/16 v25, 0x0

    .line 200
    .line 201
    const/16 v26, 0x0

    .line 202
    .line 203
    const/16 v27, 0x0

    .line 204
    .line 205
    const/16 v28, 0x0

    .line 206
    .line 207
    const/16 v29, 0x0

    .line 208
    .line 209
    const/16 v30, 0x0

    .line 210
    .line 211
    const/16 v31, 0x0

    .line 212
    .line 213
    const/16 v32, 0x0

    .line 214
    .line 215
    const/16 v33, 0x0

    .line 216
    .line 217
    invoke-static/range {v11 .. v35}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v2, v3, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_5

    .line 226
    .line 227
    :cond_8
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 228
    .line 229
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-eqz v1, :cond_b

    .line 234
    .line 235
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 236
    .line 237
    :cond_9
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    move-object v5, v4

    .line 242
    check-cast v5, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 243
    .line 244
    const/16 v28, 0x0

    .line 245
    .line 246
    const v29, 0x1ffffcf

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v8, 0x0

    .line 252
    const/4 v9, 0x0

    .line 253
    const/4 v10, 0x0

    .line 254
    const/4 v11, 0x0

    .line 255
    const/4 v12, 0x0

    .line 256
    const/4 v13, 0x0

    .line 257
    const/4 v14, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    const/16 v16, 0x0

    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    const/16 v19, 0x0

    .line 266
    .line 267
    const/16 v20, 0x0

    .line 268
    .line 269
    const/16 v21, 0x0

    .line 270
    .line 271
    const/16 v22, 0x0

    .line 272
    .line 273
    const/16 v23, 0x0

    .line 274
    .line 275
    const/16 v24, 0x0

    .line 276
    .line 277
    const/16 v25, 0x0

    .line 278
    .line 279
    const/16 v26, 0x0

    .line 280
    .line 281
    const/16 v27, 0x0

    .line 282
    .line 283
    invoke-static/range {v5 .. v29}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_9

    .line 292
    .line 293
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-nez v1, :cond_a

    .line 300
    .line 301
    const-string v1, ""

    .line 302
    .line 303
    :cond_a
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 307
    .line 308
    .line 309
    :cond_b
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 310
    .line 311
    return-object v1
.end method
