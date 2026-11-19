.class public final Lcom/zykj/mistake/feature/notebook/detail/a5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

.field public b:Landroid/widget/FrameLayout;

.field public c:Z

.field public d:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

.field public e:F

.field public volatile f:I

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/util/List;

.field public j:I

.field public k:Lr6/e;

.field public l:Z

.field public m:Lcom/zykj/mistake/feature/notebook/detail/f;

.field public n:Lcom/zykj/mistake/feature/notebook/detail/f;

.field public o:Z

.field public p:Z

.field public final q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->c:Z

    .line 6
    .line 7
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->PEN:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->d:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->q:Ljava/util/ArrayList;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_a

    .line 10
    .line 11
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_a

    .line 18
    .line 19
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :cond_2
    :goto_0
    if-ge v4, v0, :cond_3

    .line 31
    .line 32
    move-object/from16 v5, p2

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 64
    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-lez v0, :cond_6

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_6
    const/4 v5, 0x0

    .line 79
    :goto_1
    if-eqz v5, :cond_7

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    :goto_2
    move v5, v0

    .line 86
    goto :goto_3

    .line 87
    :cond_7
    invoke-static {v2}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroid/graphics/Bitmap;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    new-instance v6, Ljava/util/ArrayList;

    .line 99
    .line 100
    const/16 v0, 0xa

    .line 101
    .line 102
    invoke-static {v2, v0}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    move v7, v3

    .line 114
    :goto_4
    if-ge v7, v0, :cond_9

    .line 115
    .line 116
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    add-int/lit8 v7, v7, 0x1

    .line 121
    .line 122
    check-cast v8, Landroid/graphics/Bitmap;

    .line 123
    .line 124
    int-to-float v9, v5

    .line 125
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    int-to-float v10, v10

    .line 130
    div-float/2addr v9, v10

    .line 131
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    int-to-float v8, v8

    .line 140
    mul-float/2addr v8, v9

    .line 141
    float-to-int v8, v8

    .line 142
    const/4 v9, 0x1

    .line 143
    if-ge v8, v9, :cond_8

    .line 144
    .line 145
    move v8, v9

    .line 146
    :cond_8
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    new-instance v9, Lkotlin/Pair;

    .line 151
    .line 152
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    move v7, v3

    .line 164
    move v8, v7

    .line 165
    :goto_5
    if-ge v8, v0, :cond_a

    .line 166
    .line 167
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 172
    .line 173
    check-cast v9, Lkotlin/Pair;

    .line 174
    .line 175
    invoke-virtual {v9}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    add-int/2addr v7, v9

    .line 186
    goto :goto_5

    .line 187
    :cond_a
    if-lez v5, :cond_b

    .line 188
    .line 189
    if-gtz v7, :cond_c

    .line 190
    .line 191
    :cond_b
    const/16 p2, 0x0

    .line 192
    .line 193
    goto/16 :goto_8

    .line 194
    .line 195
    :cond_c
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 196
    .line 197
    invoke-static {v5, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    goto :goto_6

    .line 206
    :catchall_0
    move-exception v0

    .line 207
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_d

    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    :cond_d
    check-cast v0, Landroid/graphics/Bitmap;

    .line 223
    .line 224
    if-nez v0, :cond_e

    .line 225
    .line 226
    const/4 v4, 0x0

    .line 227
    goto :goto_9

    .line 228
    :cond_e
    new-instance v7, Landroid/graphics/Canvas;

    .line 229
    .line 230
    invoke-direct {v7, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 231
    .line 232
    .line 233
    const/4 v8, -0x1

    .line 234
    invoke-virtual {v7, v8}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 235
    .line 236
    .line 237
    new-instance v8, Landroid/graphics/Paint;

    .line 238
    .line 239
    const/4 v9, 0x3

    .line 240
    invoke-direct {v8, v9}, Landroid/graphics/Paint;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    move v10, v3

    .line 248
    move v11, v10

    .line 249
    move v12, v11

    .line 250
    :goto_7
    if-ge v12, v9, :cond_10

    .line 251
    .line 252
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    add-int/lit8 v12, v12, 0x1

    .line 257
    .line 258
    add-int/lit8 v14, v10, 0x1

    .line 259
    .line 260
    if-ltz v10, :cond_f

    .line 261
    .line 262
    check-cast v13, Landroid/graphics/Bitmap;

    .line 263
    .line 264
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    check-cast v10, Lkotlin/Pair;

    .line 269
    .line 270
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    check-cast v10, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    new-instance v15, Landroid/graphics/Rect;

    .line 281
    .line 282
    const/16 p2, 0x0

    .line 283
    .line 284
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    move-object/from16 p3, v0

    .line 289
    .line 290
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-direct {v15, v3, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 295
    .line 296
    .line 297
    new-instance v0, Landroid/graphics/Rect;

    .line 298
    .line 299
    add-int/2addr v10, v11

    .line 300
    invoke-direct {v0, v3, v11, v5, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v13, v15, v0, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 304
    .line 305
    .line 306
    move-object/from16 v0, p3

    .line 307
    .line 308
    move v11, v10

    .line 309
    move v10, v14

    .line 310
    goto :goto_7

    .line 311
    :cond_f
    const/16 p2, 0x0

    .line 312
    .line 313
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 314
    .line 315
    .line 316
    throw p2

    .line 317
    :cond_10
    move-object/from16 p3, v0

    .line 318
    .line 319
    move-object/from16 v4, p3

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :goto_8
    move-object/from16 v4, p2

    .line 323
    .line 324
    :goto_9
    if-eqz v4, :cond_11

    .line 325
    .line 326
    move-object/from16 v2, p1

    .line 327
    .line 328
    invoke-virtual {v1, v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/a5;->l(Lcom/zykj/mistake/feature/notebook/detail/f;Landroid/graphics/Bitmap;)V

    .line 329
    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_11
    move-object/from16 v2, p1

    .line 333
    .line 334
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 335
    .line 336
    if-eqz v0, :cond_12

    .line 337
    .line 338
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 339
    .line 340
    .line 341
    :cond_12
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 342
    .line 343
    .line 344
    :goto_a
    return-void
.end method

.method public static b(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/y4;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq p1, v2, :cond_4

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eq p1, v3, :cond_3

    .line 16
    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x5

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 37
    .line 38
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setPenDashed(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 83
    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->l:Z

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->c:Z

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEnableFinger(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->d:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->b(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEnableFinger(Z)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->SELECT:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->b(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->loadStrokeData(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 24
    .line 25
    throw p1
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Ls/k;

    .line 17
    .line 18
    invoke-virtual {v3}, Ls/k;->a()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/io/a;->w(Ljava/io/File;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_1
    iput-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 59
    .line 60
    throw v1
.end method

.method public final g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->j:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final h(Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    sget-object v9, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 6
    .line 7
    iget-object v10, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 8
    .line 9
    if-nez v10, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_1
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-gtz v0, :cond_2

    .line 26
    .line 27
    new-instance v0, La5/h;

    .line 28
    .line 29
    const/16 v3, 0x9

    .line 30
    .line 31
    move-object/from16 v4, p2

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3, v4}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v10, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    move-object/from16 v4, p2

    .line 41
    .line 42
    iput-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v11, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->q:Ljava/util/ArrayList;

    .line 49
    .line 50
    const-string v12, "getContext(...)"

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    if-ne v0, v3, :cond_5

    .line 54
    .line 55
    invoke-static {v4}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_3
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_4
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->e()V

    .line 76
    .line 77
    .line 78
    new-instance v4, Ls/c;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v4, v5}, Ls/c;-><init>(Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, v4, Ls/c;->c:Ljava/lang/Object;

    .line 91
    .line 92
    sget-object v0, Lcoil3/request/CachePolicy;->DISABLED:Lcoil3/request/CachePolicy;

    .line 93
    .line 94
    iput-object v0, v4, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 95
    .line 96
    iput-object v0, v4, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 97
    .line 98
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 99
    .line 100
    invoke-static {v4}, Ls/h;->a(Ls/c;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Lb0/g;

    .line 104
    .line 105
    const/4 v5, 0x6

    .line 106
    invoke-direct {v0, v1, v2, v5, v2}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, v4, Ls/c;->d:Lu/a;

    .line 110
    .line 111
    invoke-virtual {v4}, Ls/c;->a()Ls/f;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v2}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Lcoil3/r;

    .line 127
    .line 128
    invoke-virtual {v2, v0}, Lcoil3/r;->a(Ls/f;)Ls/k;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_5
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->e()V

    .line 137
    .line 138
    .line 139
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    new-instance v3, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    move v6, v5

    .line 150
    :goto_0
    const/4 v13, 0x0

    .line 151
    if-ge v6, v0, :cond_6

    .line 152
    .line 153
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 160
    .line 161
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    move v6, v5

    .line 173
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    add-int/lit8 v15, v6, 0x1

    .line 184
    .line 185
    if-ltz v6, :cond_7

    .line 186
    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    new-instance v5, Ls/c;

    .line 190
    .line 191
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v5, v7}, Ls/c;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    iput-object v4, v5, Ls/c;->c:Ljava/lang/Object;

    .line 202
    .line 203
    sget-object v4, Lcoil3/request/CachePolicy;->DISABLED:Lcoil3/request/CachePolicy;

    .line 204
    .line 205
    iput-object v4, v5, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 206
    .line 207
    iput-object v4, v5, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 208
    .line 209
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 210
    .line 211
    invoke-static {v5}, Ls/h;->a(Ls/c;)V

    .line 212
    .line 213
    .line 214
    move-object v4, v0

    .line 215
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/z4;

    .line 216
    .line 217
    move-object v7, v5

    .line 218
    move-object v5, v3

    .line 219
    move-object v8, v7

    .line 220
    move-object/from16 v7, p1

    .line 221
    .line 222
    move-object/from16 v16, v8

    .line 223
    .line 224
    move-object v8, v4

    .line 225
    move-object/from16 v17, v13

    .line 226
    .line 227
    move-object/from16 v13, v16

    .line 228
    .line 229
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/z4;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 230
    .line 231
    .line 232
    iput-object v0, v13, Ls/c;->d:Lu/a;

    .line 233
    .line 234
    invoke-virtual {v13}, Ls/c;->a()Ls/f;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, Lcoil3/r;

    .line 250
    .line 251
    invoke-virtual {v1, v0}, Lcoil3/r;->a(Ls/f;)Ls/k;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-object/from16 v1, p0

    .line 259
    .line 260
    move-object/from16 v2, p1

    .line 261
    .line 262
    move-object v0, v4

    .line 263
    move v6, v15

    .line 264
    move-object/from16 v13, v17

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_7
    move-object/from16 v17, v13

    .line 268
    .line 269
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 270
    .line 271
    .line 272
    throw v17

    .line 273
    :cond_8
    :goto_2
    return-void
.end method

.method public final i()V
    .locals 9

    .line 1
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 8
    .line 9
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->j:I

    .line 10
    .line 11
    invoke-direct {v5, v0, v1, v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 23
    .line 24
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 31
    .line 32
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_0
    move-object v4, p0

    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iput v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    :cond_3
    move-object v4, p0

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v0, :cond_5

    .line 65
    .line 66
    const-string v0, ""

    .line 67
    .line 68
    :cond_5
    move-object v6, v0

    .line 69
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->b:Landroid/widget/FrameLayout;

    .line 70
    .line 71
    if-nez v7, :cond_6

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_6
    invoke-virtual {p0, v5}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_7
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 82
    .line 83
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->f:I

    .line 84
    .line 85
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 86
    .line 87
    .line 88
    new-instance v3, Lcom/zykj/mistake/widget/StemWebView;

    .line 89
    .line 90
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v2, "getContext(...)"

    .line 95
    .line 96
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v4, 0x6

    .line 101
    const/4 v8, 0x0

    .line 102
    invoke-direct {v3, v0, v2, v4, v8}, Lcom/zykj/mistake/widget/StemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    const/4 v2, -0x1

    .line 108
    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v8}, Lcom/zykj/mistake/widget/StemWebView;->setScaleButtonsVisible(Z)V

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-virtual {v3, v0}, Lcom/zykj/mistake/widget/StemWebView;->setRemoveEmptyStemTopSpacing(Z)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lcom/zykj/mistake/activity/o;

    .line 122
    .line 123
    const/4 v2, 0x1

    .line 124
    move-object v4, p0

    .line 125
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/activity/o;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v0}, Lcom/zykj/mistake/widget/StemWebView;->setPageFinishListener(Lr6/a;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 135
    .line 136
    const/16 v1, 0xc

    .line 137
    .line 138
    invoke-direct {v0, v1, v3, v6}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_1
    iget-object v1, v4, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_8

    .line 152
    .line 153
    iget-object v0, v4, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 154
    .line 155
    invoke-virtual {p0, v5, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->h(Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_8
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v5}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    return-void
.end method

.method public final j(Lcom/zykj/mistake/feature/notebook/detail/f;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/f;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 23
    .line 24
    return-void
.end method

.method public final k(Lr6/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    sget-object v0, Lkotlin/io/FileWalkDirection;->BOTTOM_UP:Lkotlin/io/FileWalkDirection;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lkotlin/io/a;->z(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Ln6/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lcom/zykj/mistake/feature/collection/component/j;

    .line 57
    .line 58
    const/16 v2, 0x18

    .line 59
    .line 60
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Lz6/k;->u(Ln6/i;Lr6/c;)Lz6/f;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Lz6/e;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Lz6/e;-><init>(Lz6/f;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-virtual {v1}, Lz6/e;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-virtual {v1}, Lz6/e;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->saveStrokeData(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    goto :goto_3

    .line 100
    :goto_2
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, Ld6/s;

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    iput-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 119
    .line 120
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-interface {p1, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void

    .line 137
    :cond_7
    :goto_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final l(Lcom/zykj/mistake/feature/notebook/detail/f;Landroid/graphics/Bitmap;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 9
    .line 10
    if-eqz v0, :cond_b

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-virtual {p2, v2, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v2

    .line 25
    invoke-static {v2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object p2, v2

    .line 41
    :goto_1
    check-cast p2, Landroid/graphics/Bitmap;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v4, 0x0

    .line 52
    if-lez v2, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v4

    .line 56
    :goto_2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 57
    .line 58
    if-eqz v3, :cond_a

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-lez v5, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move-object v6, v4

    .line 76
    :goto_3
    if-eqz v6, :cond_a

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    int-to-float v6, v6

    .line 87
    int-to-float v3, v3

    .line 88
    mul-float/2addr v6, v3

    .line 89
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    const/4 v8, 0x1

    .line 94
    if-ge v7, v8, :cond_4

    .line 95
    .line 96
    move v7, v8

    .line 97
    :cond_4
    int-to-float v7, v7

    .line 98
    div-float/2addr v6, v7

    .line 99
    int-to-float v5, v5

    .line 100
    sub-float v7, v5, v2

    .line 101
    .line 102
    cmpl-float v6, v6, v7

    .line 103
    .line 104
    if-ltz v6, :cond_5

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    int-to-float v6, v6

    .line 112
    mul-float/2addr v5, v6

    .line 113
    div-float/2addr v5, v3

    .line 114
    float-to-double v5, v5

    .line 115
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    double-to-float v3, v5

    .line 120
    float-to-int v3, v3

    .line 121
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-ge v3, v5, :cond_6

    .line 126
    .line 127
    move v3, v5

    .line 128
    :cond_6
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-gt v3, v5, :cond_7

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_7
    :try_start_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 140
    .line 141
    invoke-static {v5, v3, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    goto :goto_4

    .line 150
    :catchall_1
    move-exception v3

    .line 151
    invoke-static {v3}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    :goto_4
    invoke-static {v3}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-eqz v5, :cond_8

    .line 164
    .line 165
    move-object v3, v4

    .line 166
    :cond_8
    check-cast v3, Landroid/graphics/Bitmap;

    .line 167
    .line 168
    if-nez v3, :cond_9

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    new-instance v5, Landroid/graphics/Canvas;

    .line 172
    .line 173
    invoke-direct {v5, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 174
    .line 175
    .line 176
    const/4 v6, -0x1

    .line 177
    invoke-virtual {v5, v6}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 178
    .line 179
    .line 180
    new-instance v6, Landroid/graphics/Rect;

    .line 181
    .line 182
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    invoke-direct {v6, v1, v1, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 191
    .line 192
    .line 193
    new-instance v7, Landroid/graphics/Rect;

    .line 194
    .line 195
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    invoke-direct {v7, v1, v1, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, p2, v6, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 207
    .line 208
    .line 209
    move-object p2, v3

    .line 210
    :cond_a
    :goto_5
    invoke-virtual {v0, p2}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setScale(F)Z

    .line 217
    .line 218
    .line 219
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 220
    .line 221
    invoke-virtual {p0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->c()V

    .line 222
    .line 223
    .line 224
    :cond_b
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method
