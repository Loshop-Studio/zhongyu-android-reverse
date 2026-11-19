.class public final Lg7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg7/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lg7/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/k;->a:Lg7/k;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;
    .locals 22

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v0, "webView"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    const/4 v10, 0x0

    .line 49
    if-lez v8, :cond_a

    .line 50
    .line 51
    if-gtz v9, :cond_0

    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_0
    new-instance v11, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v12, "measure -> w:"

    .line 61
    .line 62
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", h:"

    .line 69
    .line 70
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v5, "; view -> w:"

    .line 77
    .line 78
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v5, ",h:"

    .line 85
    .line 86
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v5, "; total -> w:"

    .line 93
    .line 94
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v5, "WebViewUtil"

    .line 111
    .line 112
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    div-int v5, v8, v6

    .line 116
    .line 117
    mul-int v0, v6, v5

    .line 118
    .line 119
    sub-int v11, v8, v0

    .line 120
    .line 121
    div-int v12, v9, v7

    .line 122
    .line 123
    mul-int v0, v7, v12

    .line 124
    .line 125
    sub-int v13, v9, v0

    .line 126
    .line 127
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 128
    .line 129
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 130
    .line 131
    invoke-static {v8, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    goto :goto_0

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    sget-object v14, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_1

    .line 156
    .line 157
    move-object v0, v10

    .line 158
    :cond_1
    check-cast v0, Landroid/graphics/Bitmap;

    .line 159
    .line 160
    if-nez v0, :cond_2

    .line 161
    .line 162
    return-object v10

    .line 163
    :cond_2
    new-instance v10, Landroid/graphics/Canvas;

    .line 164
    .line 165
    invoke-direct {v10, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 166
    .line 167
    .line 168
    new-instance v14, Landroid/graphics/Paint;

    .line 169
    .line 170
    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    .line 171
    .line 172
    .line 173
    move v15, v4

    .line 174
    :goto_1
    if-ge v15, v5, :cond_6

    .line 175
    .line 176
    mul-int v4, v15, v6

    .line 177
    .line 178
    invoke-virtual {v1, v4}, Landroid/view/View;->setScrollX(I)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v16, v0

    .line 182
    .line 183
    const/4 v0, 0x0

    .line 184
    :goto_2
    if-ge v0, v12, :cond_4

    .line 185
    .line 186
    move/from16 v17, v5

    .line 187
    .line 188
    mul-int v5, v0, v7

    .line 189
    .line 190
    invoke-virtual {v1, v5}, Landroid/view/View;->setScrollY(I)V

    .line 191
    .line 192
    .line 193
    sget-object v5, Lg7/k;->a:Lg7/k;

    .line 194
    .line 195
    invoke-virtual {v5, v1}, Lg7/k;->b(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    if-eqz v5, :cond_3

    .line 200
    .line 201
    move/from16 v18, v11

    .line 202
    .line 203
    int-to-float v11, v15

    .line 204
    move/from16 v19, v11

    .line 205
    .line 206
    int-to-float v11, v6

    .line 207
    mul-float v11, v11, v19

    .line 208
    .line 209
    move/from16 v19, v6

    .line 210
    .line 211
    int-to-float v6, v0

    .line 212
    move/from16 v20, v0

    .line 213
    .line 214
    int-to-float v0, v7

    .line 215
    mul-float/2addr v6, v0

    .line 216
    invoke-virtual {v10, v5, v11, v6, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_3
    move/from16 v20, v0

    .line 221
    .line 222
    move/from16 v19, v6

    .line 223
    .line 224
    move/from16 v18, v11

    .line 225
    .line 226
    :goto_3
    add-int/lit8 v0, v20, 0x1

    .line 227
    .line 228
    move/from16 v5, v17

    .line 229
    .line 230
    move/from16 v11, v18

    .line 231
    .line 232
    move/from16 v6, v19

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_4
    move/from16 v17, v5

    .line 236
    .line 237
    move/from16 v19, v6

    .line 238
    .line 239
    move/from16 v18, v11

    .line 240
    .line 241
    sub-int v0, v9, v7

    .line 242
    .line 243
    if-lez v0, :cond_5

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Landroid/view/View;->setScrollY(I)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lg7/k;->a:Lg7/k;

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Lg7/k;->b(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_5

    .line 255
    .line 256
    new-instance v5, Landroid/graphics/Rect;

    .line 257
    .line 258
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    sub-int/2addr v6, v13

    .line 263
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    move/from16 v20, v7

    .line 268
    .line 269
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    move/from16 v21, v13

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    invoke-direct {v5, v13, v6, v11, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 277
    .line 278
    .line 279
    new-instance v6, Landroid/graphics/Rect;

    .line 280
    .line 281
    sub-int v7, v9, v21

    .line 282
    .line 283
    add-int/lit8 v11, v15, 0x1

    .line 284
    .line 285
    mul-int v11, v11, v19

    .line 286
    .line 287
    invoke-direct {v6, v4, v7, v11, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v0, v5, v6, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_5
    move/from16 v20, v7

    .line 295
    .line 296
    move/from16 v21, v13

    .line 297
    .line 298
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 299
    .line 300
    move-object/from16 v0, v16

    .line 301
    .line 302
    move/from16 v5, v17

    .line 303
    .line 304
    move/from16 v11, v18

    .line 305
    .line 306
    move/from16 v6, v19

    .line 307
    .line 308
    move/from16 v7, v20

    .line 309
    .line 310
    move/from16 v13, v21

    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_6
    move-object/from16 v16, v0

    .line 316
    .line 317
    move/from16 v19, v6

    .line 318
    .line 319
    move/from16 v20, v7

    .line 320
    .line 321
    move/from16 v18, v11

    .line 322
    .line 323
    move/from16 v21, v13

    .line 324
    .line 325
    sub-int v0, v8, v19

    .line 326
    .line 327
    if-lez v0, :cond_9

    .line 328
    .line 329
    invoke-virtual {v1, v0}, Landroid/view/View;->setScrollX(I)V

    .line 330
    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    :goto_5
    if-ge v13, v12, :cond_8

    .line 334
    .line 335
    mul-int v7, v13, v20

    .line 336
    .line 337
    invoke-virtual {v1, v7}, Landroid/view/View;->setScrollY(I)V

    .line 338
    .line 339
    .line 340
    sget-object v0, Lg7/k;->a:Lg7/k;

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Lg7/k;->b(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-eqz v0, :cond_7

    .line 347
    .line 348
    new-instance v4, Landroid/graphics/Rect;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    sub-int v5, v5, v18

    .line 355
    .line 356
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    const/4 v15, 0x0

    .line 365
    invoke-direct {v4, v5, v15, v6, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 366
    .line 367
    .line 368
    new-instance v5, Landroid/graphics/Rect;

    .line 369
    .line 370
    sub-int v6, v8, v18

    .line 371
    .line 372
    add-int/lit8 v11, v13, 0x1

    .line 373
    .line 374
    mul-int v11, v11, v20

    .line 375
    .line 376
    invoke-direct {v5, v6, v7, v8, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10, v0, v4, v5, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 380
    .line 381
    .line 382
    goto :goto_6

    .line 383
    :cond_7
    const/4 v15, 0x0

    .line 384
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_8
    sub-int v0, v9, v20

    .line 388
    .line 389
    if-lez v0, :cond_9

    .line 390
    .line 391
    invoke-virtual {v1, v0}, Landroid/view/View;->setScrollY(I)V

    .line 392
    .line 393
    .line 394
    sget-object v0, Lg7/k;->a:Lg7/k;

    .line 395
    .line 396
    invoke-virtual {v0, v1}, Lg7/k;->b(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    if-eqz v0, :cond_9

    .line 401
    .line 402
    new-instance v4, Landroid/graphics/Rect;

    .line 403
    .line 404
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    sub-int v5, v5, v18

    .line 409
    .line 410
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    sub-int v6, v6, v21

    .line 415
    .line 416
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    invoke-direct {v4, v5, v6, v7, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 425
    .line 426
    .line 427
    new-instance v5, Landroid/graphics/Rect;

    .line 428
    .line 429
    sub-int v6, v8, v18

    .line 430
    .line 431
    sub-int v7, v9, v21

    .line 432
    .line 433
    invoke-direct {v5, v6, v7, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v10, v0, v4, v5, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 437
    .line 438
    .line 439
    :cond_9
    invoke-virtual {v1, v2}, Landroid/view/View;->setScrollX(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v3}, Landroid/view/View;->setScrollY(I)V

    .line 443
    .line 444
    .line 445
    return-object v16

    .line 446
    :cond_a
    :goto_7
    return-object v10
.end method

.method public final b(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :cond_0
    check-cast v0, Landroid/graphics/Bitmap;

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
