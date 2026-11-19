.class final Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;
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
    c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$requestCollectionItems$3"
    f = "MistakeCollectionDetailViewModel.kt"
    i = {}
    l = {
        0x195
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n1573#2:664\n1604#2,4:665\n230#3,5:669\n230#3,5:674\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3\n*L\n408#1:664\n408#1:665,4\n412#1:669,5\n426#1:674,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isRefresh:Z

.field final synthetic $req:Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

.field final synthetic $skipCount:I

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;IZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
            "Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;",
            "IZ",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$req:Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$skipCount:I

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$isRefresh:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$req:Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$skipCount:I

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$isRefresh:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;IZLh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->label:I

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
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3$1;

    .line 37
    .line 38
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 39
    .line 40
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$req:Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    .line 41
    .line 42
    invoke-direct {v2, v5, v6, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;Lh6/c;)V

    .line 43
    .line 44
    .line 45
    iput v4, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->label:I

    .line 46
    .line 47
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-ne v2, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    move-object v1, v2

    .line 55
    :goto_0
    iget v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$skipCount:I

    .line 56
    .line 57
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 58
    .line 59
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->$isRefresh:Z

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_a

    .line 66
    .line 67
    move-object v7, v1

    .line 68
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeListResp;

    .line 69
    .line 70
    div-int/lit8 v2, v2, 0x14

    .line 71
    .line 72
    add-int/2addr v2, v4

    .line 73
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getItems()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    new-instance v9, Ljava/util/ArrayList;

    .line 82
    .line 83
    const/16 v10, 0xa

    .line 84
    .line 85
    invoke-static {v8, v10}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const/4 v10, 0x0

    .line 97
    move v11, v10

    .line 98
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_4

    .line 103
    .line 104
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    add-int/lit8 v13, v11, 0x1

    .line 109
    .line 110
    if-ltz v11, :cond_3

    .line 111
    .line 112
    check-cast v12, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 113
    .line 114
    invoke-static {v12, v2, v11}, Lcom/zykj/mistake/data/d;->c(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;II)Lp4/b;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move v11, v13

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 124
    .line 125
    .line 126
    throw v3

    .line 127
    :cond_4
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getTotalCount()I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    iget-object v2, v5, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 136
    .line 137
    :cond_5
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    move-object v11, v3

    .line 142
    check-cast v11, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 143
    .line 144
    if-eqz v6, :cond_6

    .line 145
    .line 146
    move-object/from16 v18, v9

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    iget-object v5, v11, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 150
    .line 151
    invoke-static {v5, v9}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    move-object/from16 v18, v5

    .line 156
    .line 157
    :goto_2
    iget-boolean v5, v11, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 158
    .line 159
    if-nez v5, :cond_8

    .line 160
    .line 161
    if-eqz v6, :cond_7

    .line 162
    .line 163
    if-nez v14, :cond_7

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    move/from16 v16, v10

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    :goto_3
    move/from16 v16, v4

    .line 170
    .line 171
    :goto_4
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-ge v5, v14, :cond_9

    .line 176
    .line 177
    move/from16 v23, v4

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    move/from16 v23, v10

    .line 181
    .line 182
    :goto_5
    const/16 v48, -0x1ea5

    .line 183
    .line 184
    const/16 v49, 0x1f

    .line 185
    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x1

    .line 194
    .line 195
    const/16 v21, 0x0

    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const/16 v24, 0x0

    .line 200
    .line 201
    const/16 v25, 0x0

    .line 202
    .line 203
    const/16 v26, 0x0

    .line 204
    .line 205
    const/16 v27, 0x0

    .line 206
    .line 207
    const/16 v28, 0x0

    .line 208
    .line 209
    const/16 v29, 0x0

    .line 210
    .line 211
    const/16 v30, 0x0

    .line 212
    .line 213
    const/16 v31, 0x0

    .line 214
    .line 215
    const/16 v32, 0x0

    .line 216
    .line 217
    const/16 v33, 0x0

    .line 218
    .line 219
    const/16 v34, 0x0

    .line 220
    .line 221
    const/16 v35, 0x0

    .line 222
    .line 223
    const/16 v36, 0x0

    .line 224
    .line 225
    const/16 v37, 0x0

    .line 226
    .line 227
    const/16 v38, 0x0

    .line 228
    .line 229
    const/16 v39, 0x0

    .line 230
    .line 231
    const/16 v40, 0x0

    .line 232
    .line 233
    const/16 v41, 0x0

    .line 234
    .line 235
    const/16 v42, 0x0

    .line 236
    .line 237
    const/16 v43, 0x0

    .line 238
    .line 239
    const/16 v44, 0x0

    .line 240
    .line 241
    const/16 v45, 0x0

    .line 242
    .line 243
    const/16 v46, 0x0

    .line 244
    .line 245
    const/16 v47, 0x0

    .line 246
    .line 247
    invoke-static/range {v11 .. v49}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v2, v3, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_5

    .line 256
    .line 257
    :cond_a
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 258
    .line 259
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-eqz v1, :cond_d

    .line 264
    .line 265
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 266
    .line 267
    :cond_b
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    move-object v5, v4

    .line 272
    check-cast v5, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 273
    .line 274
    const/16 v42, -0xc01

    .line 275
    .line 276
    const/16 v43, 0x1f

    .line 277
    .line 278
    const/4 v6, 0x0

    .line 279
    const/4 v7, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    const/4 v9, 0x0

    .line 282
    const/4 v10, 0x0

    .line 283
    const/4 v11, 0x0

    .line 284
    const/4 v12, 0x0

    .line 285
    const/4 v13, 0x0

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x0

    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/16 v18, 0x0

    .line 293
    .line 294
    const/16 v19, 0x0

    .line 295
    .line 296
    const/16 v20, 0x0

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    const/16 v23, 0x0

    .line 303
    .line 304
    const/16 v24, 0x0

    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    const/16 v26, 0x0

    .line 309
    .line 310
    const/16 v27, 0x0

    .line 311
    .line 312
    const/16 v28, 0x0

    .line 313
    .line 314
    const/16 v29, 0x0

    .line 315
    .line 316
    const/16 v30, 0x0

    .line 317
    .line 318
    const/16 v31, 0x0

    .line 319
    .line 320
    const/16 v32, 0x0

    .line 321
    .line 322
    const/16 v33, 0x0

    .line 323
    .line 324
    const/16 v34, 0x0

    .line 325
    .line 326
    const/16 v35, 0x0

    .line 327
    .line 328
    const/16 v36, 0x0

    .line 329
    .line 330
    const/16 v37, 0x0

    .line 331
    .line 332
    const/16 v38, 0x0

    .line 333
    .line 334
    const/16 v39, 0x0

    .line 335
    .line 336
    const/16 v40, 0x0

    .line 337
    .line 338
    const/16 v41, 0x0

    .line 339
    .line 340
    invoke-static/range {v5 .. v43}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_b

    .line 349
    .line 350
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/l;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    if-nez v1, :cond_c

    .line 357
    .line 358
    const-string v1, ""

    .line 359
    .line 360
    :cond_c
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/collection/detail/l;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 364
    .line 365
    .line 366
    :cond_d
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 367
    .line 368
    return-object v1
.end method
