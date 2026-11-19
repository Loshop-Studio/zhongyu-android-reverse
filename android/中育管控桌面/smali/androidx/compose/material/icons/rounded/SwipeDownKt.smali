.class public final Landroidx/compose/material/icons/rounded/SwipeDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_swipeDown",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SwipeDown",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSwipeDown",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSwipeDown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeDown.kt\nandroidx/compose/material/icons/rounded/SwipeDownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 SwipeDown.kt\nandroidx/compose/material/icons/rounded/SwipeDownKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeDown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwipeDownKt;->_swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Rounded.SwipeDown"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x410d47ae    # 8.83f

    .line 71
    .line 72
    .line 73
    const v2, 0x4198cccd    # 19.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f3ae148    # 0.73f

    .line 80
    .line 81
    .line 82
    const v18, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const v13, -0x417ae148    # -0.26f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e66666    # -0.6f

    .line 89
    .line 90
    .line 91
    const v15, 0x3db851ec    # 0.09f

    .line 92
    .line 93
    .line 94
    const v16, -0x405c28f6    # -1.28f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x40651eb8    # 3.58f

    .line 101
    .line 102
    .line 103
    const v2, -0x40ca3d71    # -0.71f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x410ca3d7    # 8.79f

    .line 110
    .line 111
    .line 112
    const v2, 0x40e570a4    # 7.17f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3f428f5c    # 0.76f

    .line 119
    .line 120
    .line 121
    const v18, -0x40028f5c    # -1.98f

    .line 122
    .line 123
    .line 124
    const v13, -0x4151eb85    # -0.34f

    .line 125
    .line 126
    .line 127
    const v14, -0x40bd70a4    # -0.76f

    .line 128
    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    const v16, -0x402e147b    # -1.64f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3ffd70a4    # 1.98f

    .line 138
    .line 139
    .line 140
    const v18, 0x3f428f5c    # 0.76f

    .line 141
    .line 142
    .line 143
    const v13, 0x3f428f5c    # 0.76f

    .line 144
    .line 145
    .line 146
    const v14, -0x4151eb85    # -0.34f

    .line 147
    .line 148
    .line 149
    const v15, 0x3fd1eb85    # 1.64f

    .line 150
    .line 151
    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x401b851f    # 2.43f

    .line 158
    .line 159
    .line 160
    const v2, 0x40afae14    # 5.49f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3f570a3d    # 0.84f

    .line 167
    .line 168
    .line 169
    const v2, -0x41428f5c    # -0.37f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    const v18, -0x41d1eb85    # -0.17f

    .line 179
    .line 180
    .line 181
    const v13, 0x3e8f5c29    # 0.28f

    .line 182
    .line 183
    .line 184
    const v14, -0x41fae148    # -0.13f

    .line 185
    .line 186
    .line 187
    const v15, 0x3f170a3d    # 0.59f

    .line 188
    .line 189
    .line 190
    const v16, -0x41c7ae14    # -0.18f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x4091eb85    # 4.56f

    .line 197
    .line 198
    .line 199
    const v2, 0x3e570a3d    # 0.21f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3fea3d71    # 1.83f

    .line 206
    .line 207
    .line 208
    const v18, 0x3fb9999a    # 1.45f

    .line 209
    .line 210
    .line 211
    const v13, 0x3f5c28f6    # 0.86f

    .line 212
    .line 213
    .line 214
    const v14, 0x3d23d70a    # 0.04f

    .line 215
    .line 216
    .line 217
    const v15, 0x3fcccccd    # 1.6f

    .line 218
    .line 219
    .line 220
    const v16, 0x3f2147ae    # 0.63f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f9d70a4    # 1.23f

    .line 227
    .line 228
    .line 229
    const v2, 0x408a8f5c    # 4.33f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4071eb85    # -1.11f

    .line 236
    .line 237
    .line 238
    const v18, 0x4017ae14    # 2.37f

    .line 239
    .line 240
    .line 241
    const v13, 0x3e8a3d71    # 0.27f

    .line 242
    .line 243
    .line 244
    const v14, 0x3f75c28f    # 0.96f

    .line 245
    .line 246
    .line 247
    const v15, -0x41b33333    # -0.2f

    .line 248
    .line 249
    .line 250
    const v16, 0x3ffc28f6    # 1.97f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x3f4bd70a    # -5.63f

    .line 257
    .line 258
    .line 259
    const v2, 0x401f5c29    # 2.49f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x401eb852    # -1.76f

    .line 266
    .line 267
    .line 268
    const v18, 0x3e0f5c29    # 0.14f

    .line 269
    .line 270
    .line 271
    const v13, -0x410a3d71    # -0.48f

    .line 272
    .line 273
    .line 274
    const v14, 0x3e570a3d    # 0.21f

    .line 275
    .line 276
    .line 277
    const v15, -0x405eb852    # -1.26f

    .line 278
    .line 279
    .line 280
    const v16, 0x3ea8f5c3    # 0.33f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3f51999a    # -5.45f

    .line 287
    .line 288
    .line 289
    const v2, -0x3feeb852    # -2.27f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x410d47ae    # 8.83f

    .line 296
    .line 297
    .line 298
    const v18, 0x4198cccd    # 19.1f

    .line 299
    .line 300
    .line 301
    const v13, 0x4112147b    # 9.13f

    .line 302
    .line 303
    .line 304
    const v14, 0x419c3d71    # 19.53f

    .line 305
    .line 306
    .line 307
    const v15, 0x410ee148    # 8.93f

    .line 308
    .line 309
    .line 310
    const v16, 0x419ab852    # 19.34f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x40b2e148    # 5.59f

    .line 320
    .line 321
    .line 322
    const v2, 0x402eb852    # 2.73f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x40600000    # 3.5f

    .line 329
    .line 330
    const/high16 v18, 0x41180000    # 9.5f

    .line 331
    .line 332
    const v13, 0x4088a3d7    # 4.27f

    .line 333
    .line 334
    .line 335
    const v14, 0x4094cccd    # 4.65f

    .line 336
    .line 337
    .line 338
    const/high16 v15, 0x40600000    # 3.5f

    .line 339
    .line 340
    const v16, 0x40dfae14    # 6.99f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x3e99999a    # 0.3f

    .line 347
    .line 348
    .line 349
    const v18, 0x402b851f    # 2.68f

    .line 350
    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const v14, 0x3f6b851f    # 0.92f

    .line 354
    .line 355
    .line 356
    const v15, 0x3dcccccd    # 0.1f

    .line 357
    .line 358
    .line 359
    const v16, 0x3fe8f5c3    # 1.82f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x4067ae14    # -1.19f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x40770a3d    # -1.07f

    .line 372
    .line 373
    .line 374
    const v18, -0x42dc28f6    # -0.04f

    .line 375
    .line 376
    .line 377
    const v13, -0x416b851f    # -0.29f

    .line 378
    .line 379
    .line 380
    const v14, -0x416b851f    # -0.29f

    .line 381
    .line 382
    .line 383
    const v15, -0x40bae148    # -0.77f

    .line 384
    .line 385
    .line 386
    const v16, -0x415c28f6    # -0.32f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x435c28f6    # -0.02f

    .line 393
    .line 394
    .line 395
    const v18, 0x3f8a3d71    # 1.08f

    .line 396
    .line 397
    .line 398
    const v13, -0x416147ae    # -0.31f

    .line 399
    .line 400
    .line 401
    const v14, 0x3e947ae1    # 0.29f

    .line 402
    .line 403
    .line 404
    const v15, -0x416147ae    # -0.31f

    .line 405
    .line 406
    .line 407
    const v16, 0x3f47ae14    # 0.78f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x4010a3d7    # 2.26f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3fb47ae1    # 1.41f

    .line 420
    .line 421
    .line 422
    const/16 v18, 0x0

    .line 423
    .line 424
    const v13, 0x3ec7ae14    # 0.39f

    .line 425
    .line 426
    .line 427
    const v14, 0x3ec7ae14    # 0.39f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f828f5c    # 1.02f

    .line 431
    .line 432
    .line 433
    const v16, 0x3ec7ae14    # 0.39f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x400f5c29    # 2.24f

    .line 440
    .line 441
    .line 442
    const v2, -0x3ff0a3d7    # -2.24f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3d23d70a    # 0.04f

    .line 449
    .line 450
    .line 451
    const v18, -0x40770a3d    # -1.07f

    .line 452
    .line 453
    .line 454
    const v13, 0x3e947ae1    # 0.29f

    .line 455
    .line 456
    .line 457
    const v14, -0x416b851f    # -0.29f

    .line 458
    .line 459
    .line 460
    const v15, 0x3ea3d70a    # 0.32f

    .line 461
    .line 462
    .line 463
    const v16, -0x40bae148    # -0.77f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x4075c28f    # -1.08f

    .line 470
    .line 471
    .line 472
    const v18, -0x435c28f6    # -0.02f

    .line 473
    .line 474
    .line 475
    const v13, -0x416b851f    # -0.29f

    .line 476
    .line 477
    .line 478
    const v14, -0x416147ae    # -0.31f

    .line 479
    .line 480
    .line 481
    const v15, -0x40b851ec    # -0.78f

    .line 482
    .line 483
    .line 484
    const v16, -0x416147ae    # -0.31f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x40747ae1    # -1.09f

    .line 491
    .line 492
    .line 493
    const v2, 0x3f8b851f    # 1.09f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x40a00000    # 5.0f

    .line 500
    .line 501
    const/high16 v18, 0x41180000    # 9.5f

    .line 502
    .line 503
    const v13, 0x40a3851f    # 5.11f

    .line 504
    .line 505
    .line 506
    const v14, 0x4133d70a    # 11.24f

    .line 507
    .line 508
    .line 509
    const/high16 v15, 0x40a00000    # 5.0f

    .line 510
    .line 511
    const v16, 0x4126147b    # 10.38f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x3fea3d71    # 1.83f

    .line 518
    .line 519
    .line 520
    const v18, -0x3f423d71    # -5.93f

    .line 521
    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const v14, -0x3ff33333    # -2.2f

    .line 525
    .line 526
    .line 527
    const v15, 0x3f2e147b    # 0.68f

    .line 528
    .line 529
    .line 530
    const v16, -0x3f7851ec    # -4.24f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, -0x4247ae14    # -0.09f

    .line 537
    .line 538
    .line 539
    const v18, -0x408ccccd    # -0.95f

    .line 540
    .line 541
    .line 542
    const v13, 0x3e4ccccd    # 0.2f

    .line 543
    .line 544
    .line 545
    const v14, -0x41666666    # -0.3f

    .line 546
    .line 547
    .line 548
    const v15, 0x3e2e147b    # 0.17f

    .line 549
    .line 550
    .line 551
    const v16, -0x40cccccd    # -0.7f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, 0x40b2e148    # 5.59f

    .line 558
    .line 559
    .line 560
    const v18, 0x402eb852    # 2.73f

    .line 561
    .line 562
    .line 563
    const v13, 0x40cd1eb8    # 6.41f

    .line 564
    .line 565
    .line 566
    const v14, 0x4011eb85    # 2.28f

    .line 567
    .line 568
    .line 569
    const v15, 0x40bb851f    # 5.86f

    .line 570
    .line 571
    .line 572
    const v16, 0x4015c28f    # 2.34f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/16 v16, 0x3800

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v8, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v9, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v12, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/rounded/SwipeDownKt;->_swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
