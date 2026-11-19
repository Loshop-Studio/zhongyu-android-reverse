.class public final Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;
.super Landroidx/paging/PagingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/paging/SimplePagerKt;->b(Landroidx/paging/PagingConfig;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingSource<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J#\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1",
        "Landroidx/paging/PagingSource;",
        "",
        "load",
        "Landroidx/paging/PagingSource$LoadResult;",
        "params",
        "Landroidx/paging/PagingSource$LoadParams;",
        "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getRefreshKey",
        "state",
        "Landroidx/paging/PagingState;",
        "(Landroidx/paging/PagingState;)Ljava/lang/Integer;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimplePager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimplePager.kt\ncom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1563#2:55\n1634#2,3:56\n*S KotlinDebug\n*F\n+ 1 SimplePager.kt\ncom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1\n*L\n34#1:55\n34#1:56,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function3;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->a:Lkotlin/jvm/functions/Function3;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;-><init>(Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->o:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->m:I

    .line 47
    .line 48
    iget v9, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->l:I

    .line 49
    .line 50
    iget v10, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->k:I

    .line 51
    .line 52
    iget-object v11, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v11, Ljava/util/Collection;

    .line 55
    .line 56
    iget-object v12, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v12, Ljava/util/Iterator;

    .line 59
    .line 60
    iget-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v13, Ljava/util/Collection;

    .line 63
    .line 64
    iget-object v14, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v14, Ljava/lang/Iterable;

    .line 67
    .line 68
    iget-object v15, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 71
    .line 72
    iget-object v6, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, Ljava/lang/Iterable;

    .line 75
    .line 76
    iget-object v5, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v7, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v7, Landroidx/paging/PagingSource$LoadParams;

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v16, v15

    .line 86
    .line 87
    move-object v15, v14

    .line 88
    move-object v14, v12

    .line 89
    move-object v12, v13

    .line 90
    const/4 v13, 0x2

    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    iget v4, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->k:I

    .line 102
    .line 103
    iget-object v5, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Landroidx/paging/PagingSource$LoadParams;

    .line 106
    .line 107
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object v7, v5

    .line 113
    goto :goto_4

    .line 114
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p1 .. p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ljava/lang/Integer;

    .line 122
    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    move v4, v0

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move v4, v8

    .line 132
    :goto_1
    iget-object v0, v1, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->a:Lkotlin/jvm/functions/Function3;

    .line 133
    .line 134
    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 135
    .line 136
    if-nez v4, :cond_5

    .line 137
    .line 138
    move v5, v8

    .line 139
    goto :goto_2

    .line 140
    :cond_5
    add-int/lit8 v5, v4, -0x1

    .line 141
    .line 142
    mul-int/lit8 v5, v5, 0x1e

    .line 143
    .line 144
    add-int/lit8 v5, v5, 0x5a

    .line 145
    .line 146
    :goto_2
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual/range {p1 .. p1}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 158
    move-object/from16 v7, p1

    .line 159
    .line 160
    :try_start_2
    iput-object v7, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->a:Ljava/lang/Object;

    .line 161
    .line 162
    iput v4, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->k:I

    .line 163
    .line 164
    iput v8, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->l:I

    .line 165
    .line 166
    const/4 v9, 0x1

    .line 167
    iput v9, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    .line 168
    .line 169
    invoke-interface {v0, v5, v6, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 173
    if-ne v0, v3, :cond_6

    .line 174
    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_6
    move-object v5, v7

    .line 178
    :goto_3
    :try_start_3
    check-cast v0, Ljava/util/List;

    .line 179
    .line 180
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 184
    goto :goto_5

    .line 185
    :catchall_1
    move-exception v0

    .line 186
    goto :goto_4

    .line 187
    :catchall_2
    move-exception v0

    .line 188
    move-object/from16 v7, p1

    .line 189
    .line 190
    :goto_4
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 191
    .line 192
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    move-object v5, v7

    .line 201
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_e

    .line 206
    .line 207
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_7

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    goto :goto_6

    .line 215
    :cond_7
    move-object v6, v0

    .line 216
    :goto_6
    check-cast v6, Ljava/util/List;

    .line 217
    .line 218
    if-nez v6, :cond_8

    .line 219
    .line 220
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    :cond_8
    iget-object v7, v1, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1;->b:Lkotlin/jvm/functions/Function2;

    .line 225
    .line 226
    new-instance v9, Ljava/util/ArrayList;

    .line 227
    .line 228
    const/16 v10, 0xa

    .line 229
    .line 230
    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    move-object v14, v6

    .line 242
    move-object v15, v7

    .line 243
    move-object v11, v9

    .line 244
    move-object v12, v10

    .line 245
    move v10, v4

    .line 246
    move-object v7, v5

    .line 247
    move v4, v8

    .line 248
    move v9, v4

    .line 249
    move-object v5, v0

    .line 250
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_a

    .line 255
    .line 256
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v7, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->a:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    iput-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->b:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    iput-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->c:Ljava/lang/Object;

    .line 273
    .line 274
    iput-object v15, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->d:Ljava/lang/Object;

    .line 275
    .line 276
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    iput-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->e:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v11, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->f:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v12, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->g:Ljava/lang/Object;

    .line 285
    .line 286
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    iput-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->h:Ljava/lang/Object;

    .line 291
    .line 292
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    iput-object v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->i:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v11, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->j:Ljava/lang/Object;

    .line 299
    .line 300
    iput v10, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->k:I

    .line 301
    .line 302
    iput v9, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->l:I

    .line 303
    .line 304
    iput v4, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->m:I

    .line 305
    .line 306
    iput v8, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->n:I

    .line 307
    .line 308
    const/4 v13, 0x2

    .line 309
    iput v13, v2, Lcom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1$load$1;->q:I

    .line 310
    .line 311
    invoke-interface {v15, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v3, :cond_9

    .line 316
    .line 317
    :goto_8
    return-object v3

    .line 318
    :cond_9
    move-object/from16 v16, v15

    .line 319
    .line 320
    move-object v15, v14

    .line 321
    move-object v14, v12

    .line 322
    move-object v12, v11

    .line 323
    :goto_9
    invoke-interface {v11, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-object v11, v12

    .line 327
    move-object v12, v14

    .line 328
    move-object v14, v15

    .line 329
    move-object/from16 v15, v16

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_a
    check-cast v11, Ljava/util/List;

    .line 333
    .line 334
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    invoke-virtual {v7}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-ne v0, v2, :cond_b

    .line 343
    .line 344
    const/4 v8, 0x1

    .line 345
    :cond_b
    add-int/lit8 v0, v10, -0x1

    .line 346
    .line 347
    if-lez v0, :cond_c

    .line 348
    .line 349
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    goto :goto_a

    .line 354
    :cond_c
    const/4 v0, 0x0

    .line 355
    :goto_a
    if-eqz v8, :cond_d

    .line 356
    .line 357
    const/16 v17, 0x1

    .line 358
    .line 359
    add-int/lit8 v10, v10, 0x1

    .line 360
    .line 361
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    goto :goto_b

    .line 366
    :cond_d
    const/4 v6, 0x0

    .line 367
    :goto_b
    new-instance v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 368
    .line 369
    invoke-direct {v2, v11, v0, v6}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto :goto_c

    .line 373
    :cond_e
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-nez v0, :cond_f

    .line 378
    .line 379
    new-instance v0, Ljava/lang/Exception;

    .line 380
    .line 381
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 382
    .line 383
    .line 384
    :cond_f
    new-instance v2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 385
    .line 386
    invoke-direct {v2, v0}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    :goto_c
    return-object v2
.end method
