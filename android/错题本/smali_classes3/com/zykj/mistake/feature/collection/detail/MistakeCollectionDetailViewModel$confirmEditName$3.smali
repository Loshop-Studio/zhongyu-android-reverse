.class final Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;
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
    c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmEditName$3"
    f = "MistakeCollectionDetailViewModel.kt"
    i = {}
    l = {
        0x1fc
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n230#2,5:664\n230#2,5:669\n230#2,5:674\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3\n*L\n515#1:664,5\n528#1:669,5\n535#1:674,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $name:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->$name:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
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
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->$name:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Ljava/lang/String;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lkotlin/Result;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->$name:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v2, v4, v5, v6}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Ljava/lang/String;Lh6/c;)V

    .line 43
    .line 44
    .line 45
    iput v3, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->label:I

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
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    move-object v3, v1

    .line 64
    check-cast v3, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;

    .line 65
    .line 66
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    move-object v6, v5

    .line 73
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;->getResult()Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    const v43, 0x1ffffffd

    .line 84
    .line 85
    .line 86
    const/16 v44, 0x1e

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    const/4 v14, 0x0

    .line 95
    const/4 v15, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x0

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const/16 v23, 0x0

    .line 111
    .line 112
    const/16 v24, 0x0

    .line 113
    .line 114
    const/16 v25, 0x0

    .line 115
    .line 116
    const/16 v26, 0x0

    .line 117
    .line 118
    const/16 v27, 0x0

    .line 119
    .line 120
    const/16 v28, 0x0

    .line 121
    .line 122
    const/16 v29, 0x0

    .line 123
    .line 124
    const/16 v30, 0x0

    .line 125
    .line 126
    const/16 v31, 0x0

    .line 127
    .line 128
    const/16 v32, 0x0

    .line 129
    .line 130
    const/16 v33, 0x0

    .line 131
    .line 132
    const/16 v34, 0x0

    .line 133
    .line 134
    const/16 v35, 0x0

    .line 135
    .line 136
    const-string v36, ""

    .line 137
    .line 138
    const-string v37, ""

    .line 139
    .line 140
    const/16 v38, 0x0

    .line 141
    .line 142
    const/16 v39, 0x0

    .line 143
    .line 144
    const/16 v40, 0x0

    .line 145
    .line 146
    const/16 v41, 0x0

    .line 147
    .line 148
    const/16 v42, 0x0

    .line 149
    .line 150
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_3

    .line 159
    .line 160
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/k;->a:Lcom/zykj/mistake/feature/collection/detail/k;

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 166
    .line 167
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_9

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    const-string v5, ""

    .line 183
    .line 184
    if-nez v4, :cond_5

    .line 185
    .line 186
    move-object v4, v5

    .line 187
    :cond_5
    const-string v6, "\u8be5\u540d\u79f0\u5df2\u5b58\u5728"

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    invoke-static {v4, v6, v7}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_7

    .line 195
    .line 196
    :cond_6
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    move-object v4, v1

    .line 201
    check-cast v4, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 202
    .line 203
    const v41, 0x7fffffff

    .line 204
    .line 205
    .line 206
    const/16 v42, 0x1e

    .line 207
    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v6, 0x0

    .line 210
    const/4 v7, 0x0

    .line 211
    const/4 v8, 0x0

    .line 212
    const/4 v9, 0x0

    .line 213
    const/4 v10, 0x0

    .line 214
    const/4 v11, 0x0

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    const/16 v21, 0x0

    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    const/16 v24, 0x0

    .line 236
    .line 237
    const/16 v25, 0x0

    .line 238
    .line 239
    const/16 v26, 0x0

    .line 240
    .line 241
    const/16 v27, 0x0

    .line 242
    .line 243
    const/16 v28, 0x0

    .line 244
    .line 245
    const/16 v29, 0x0

    .line 246
    .line 247
    const/16 v30, 0x0

    .line 248
    .line 249
    const/16 v31, 0x0

    .line 250
    .line 251
    const/16 v32, 0x0

    .line 252
    .line 253
    const/16 v33, 0x0

    .line 254
    .line 255
    const/16 v34, 0x0

    .line 256
    .line 257
    const-string v35, "\u8be5\u540d\u79f0\u5df2\u5b58\u5728"

    .line 258
    .line 259
    const/16 v36, 0x0

    .line 260
    .line 261
    const/16 v37, 0x0

    .line 262
    .line 263
    const/16 v38, 0x0

    .line 264
    .line 265
    const/16 v39, 0x0

    .line 266
    .line 267
    const/16 v40, 0x0

    .line 268
    .line 269
    invoke-static/range {v4 .. v42}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_6

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_7
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    move-object v6, v4

    .line 285
    check-cast v6, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 286
    .line 287
    const/16 v43, -0x1

    .line 288
    .line 289
    const/16 v44, 0x1e

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const/4 v8, 0x0

    .line 293
    const/4 v9, 0x0

    .line 294
    const/4 v10, 0x0

    .line 295
    const/4 v11, 0x0

    .line 296
    const/4 v12, 0x0

    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const/16 v16, 0x0

    .line 301
    .line 302
    const/16 v17, 0x0

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v20, 0x0

    .line 309
    .line 310
    const/16 v21, 0x0

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/16 v23, 0x0

    .line 315
    .line 316
    const/16 v24, 0x0

    .line 317
    .line 318
    const/16 v25, 0x0

    .line 319
    .line 320
    const/16 v26, 0x0

    .line 321
    .line 322
    const/16 v27, 0x0

    .line 323
    .line 324
    const/16 v28, 0x0

    .line 325
    .line 326
    const/16 v29, 0x0

    .line 327
    .line 328
    const/16 v30, 0x0

    .line 329
    .line 330
    const/16 v31, 0x0

    .line 331
    .line 332
    const/16 v32, 0x0

    .line 333
    .line 334
    const/16 v33, 0x0

    .line 335
    .line 336
    const/16 v34, 0x0

    .line 337
    .line 338
    const/16 v35, 0x0

    .line 339
    .line 340
    const/16 v36, 0x0

    .line 341
    .line 342
    const/16 v37, 0x0

    .line 343
    .line 344
    const/16 v38, 0x0

    .line 345
    .line 346
    const/16 v39, 0x0

    .line 347
    .line 348
    const/16 v40, 0x0

    .line 349
    .line 350
    const/16 v41, 0x0

    .line 351
    .line 352
    const/16 v42, 0x0

    .line 353
    .line 354
    invoke-static/range {v6 .. v44}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v3, v4, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_7

    .line 363
    .line 364
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/l;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    if-nez v1, :cond_8

    .line 371
    .line 372
    goto :goto_1

    .line 373
    :cond_8
    move-object v5, v1

    .line 374
    :goto_1
    invoke-direct {v3, v5}, Lcom/zykj/mistake/feature/collection/detail/l;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 378
    .line 379
    .line 380
    :cond_9
    :goto_2
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 381
    .line 382
    return-object v1
.end method
