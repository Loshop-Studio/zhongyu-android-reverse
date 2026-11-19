.class public final Landroidx/compose/material/icons/filled/PoolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pool",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Pool",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPool",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/filled/PoolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/filled/PoolKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n104#1:167,18\n104#1:204\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n104#1:185,2\n104#1:187,2\n104#1:193,11\n30#1:151,4\n104#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPool(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Pool"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x41b00000    # 22.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3ff47ae1    # -2.18f

    .line 78
    .line 79
    .line 80
    const v26, -0x40dc28f6    # -0.64f

    .line 81
    .line 82
    .line 83
    const v21, -0x4071eb85    # -1.11f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x40228f5c    # -1.73f

    .line 89
    .line 90
    .line 91
    const v24, -0x41428f5c    # -0.37f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x406ccccd    # -1.15f

    .line 100
    .line 101
    .line 102
    const v26, -0x4147ae14    # -0.36f

    .line 103
    .line 104
    .line 105
    const v21, -0x41428f5c    # -0.37f

    .line 106
    .line 107
    .line 108
    const v22, -0x419eb852    # -0.22f

    .line 109
    .line 110
    .line 111
    const v23, -0x40e66666    # -0.6f

    .line 112
    .line 113
    .line 114
    const v24, -0x4147ae14    # -0.36f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v26, 0x3eb851ec    # 0.36f

    .line 121
    .line 122
    .line 123
    const v21, -0x40f0a3d7    # -0.56f

    .line 124
    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const v23, -0x40b851ec    # -0.78f

    .line 129
    .line 130
    .line 131
    const v24, 0x3e051eb8    # 0.13f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, -0x3ff47ae1    # -2.18f

    .line 138
    .line 139
    .line 140
    const v26, 0x3f23d70a    # 0.64f

    .line 141
    .line 142
    .line 143
    const v21, -0x41147ae1    # -0.46f

    .line 144
    .line 145
    .line 146
    const v22, 0x3e8a3d71    # 0.27f

    .line 147
    .line 148
    .line 149
    const v23, -0x40770a3d    # -1.07f

    .line 150
    .line 151
    .line 152
    const v24, 0x3f23d70a    # 0.64f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x40dc28f6    # -0.64f

    .line 159
    .line 160
    .line 161
    const v6, -0x3ff47ae1    # -2.18f

    .line 162
    .line 163
    .line 164
    const v7, -0x41428f5c    # -0.37f

    .line 165
    .line 166
    .line 167
    const v8, -0x40228f5c    # -1.73f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v25, -0x406ccccd    # -1.15f

    .line 174
    .line 175
    .line 176
    const v26, -0x4147ae14    # -0.36f

    .line 177
    .line 178
    .line 179
    const v21, -0x41428f5c    # -0.37f

    .line 180
    .line 181
    .line 182
    const v22, -0x419eb852    # -0.22f

    .line 183
    .line 184
    .line 185
    const v23, -0x40e66666    # -0.6f

    .line 186
    .line 187
    .line 188
    const v24, -0x4147ae14    # -0.36f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v26, 0x3eb851ec    # 0.36f

    .line 195
    .line 196
    .line 197
    const v21, -0x40f0a3d7    # -0.56f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const v23, -0x40b851ec    # -0.78f

    .line 203
    .line 204
    .line 205
    const v24, 0x3e051eb8    # 0.13f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v25, -0x3ff3d70a    # -2.19f

    .line 212
    .line 213
    .line 214
    const v26, 0x3f23d70a    # 0.64f

    .line 215
    .line 216
    .line 217
    const v21, -0x41147ae1    # -0.46f

    .line 218
    .line 219
    .line 220
    const v22, 0x3e8a3d71    # 0.27f

    .line 221
    .line 222
    .line 223
    const v23, -0x4075c28f    # -1.08f

    .line 224
    .line 225
    .line 226
    const v24, 0x3f23d70a    # 0.64f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, -0x3ff47ae1    # -2.18f

    .line 233
    .line 234
    .line 235
    const v26, -0x40dc28f6    # -0.64f

    .line 236
    .line 237
    .line 238
    const v21, -0x4071eb85    # -1.11f

    .line 239
    .line 240
    .line 241
    const/16 v22, 0x0

    .line 242
    .line 243
    const v23, -0x40228f5c    # -1.73f

    .line 244
    .line 245
    .line 246
    const v24, -0x41428f5c    # -0.37f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, -0x406ccccd    # -1.15f

    .line 253
    .line 254
    .line 255
    const v26, -0x4147ae14    # -0.36f

    .line 256
    .line 257
    .line 258
    const v21, -0x41428f5c    # -0.37f

    .line 259
    .line 260
    .line 261
    const v22, -0x41947ae1    # -0.23f

    .line 262
    .line 263
    .line 264
    const v23, -0x40e66666    # -0.6f

    .line 265
    .line 266
    .line 267
    const v24, -0x4147ae14    # -0.36f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x3eb851ec    # 0.36f

    .line 274
    .line 275
    .line 276
    const v6, -0x406ccccd    # -1.15f

    .line 277
    .line 278
    .line 279
    const v7, 0x3e051eb8    # 0.13f

    .line 280
    .line 281
    .line 282
    const v8, -0x40b851ec    # -0.78f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v25, -0x3ff3d70a    # -2.19f

    .line 289
    .line 290
    .line 291
    const v26, 0x3f23d70a    # 0.64f

    .line 292
    .line 293
    .line 294
    const v21, -0x41147ae1    # -0.46f

    .line 295
    .line 296
    .line 297
    const v22, 0x3e8a3d71    # 0.27f

    .line 298
    .line 299
    .line 300
    const v23, -0x4075c28f    # -1.08f

    .line 301
    .line 302
    .line 303
    const v24, 0x3f23d70a    # 0.64f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, -0x40000000    # -2.0f

    .line 310
    .line 311
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x3f933333    # 1.15f

    .line 315
    .line 316
    .line 317
    const v26, -0x4147ae14    # -0.36f

    .line 318
    .line 319
    .line 320
    const v21, 0x3f0f5c29    # 0.56f

    .line 321
    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const v23, 0x3f47ae14    # 0.78f

    .line 326
    .line 327
    .line 328
    const v24, -0x41fae148    # -0.13f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, 0x400c28f6    # 2.19f

    .line 335
    .line 336
    .line 337
    const v26, -0x40dc28f6    # -0.64f

    .line 338
    .line 339
    .line 340
    const v21, 0x3eeb851f    # 0.46f

    .line 341
    .line 342
    .line 343
    const v22, -0x4175c28f    # -0.27f

    .line 344
    .line 345
    .line 346
    const v23, 0x3f8a3d71    # 1.08f

    .line 347
    .line 348
    .line 349
    const v24, -0x40dc28f6    # -0.64f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v4, 0x3f23d70a    # 0.64f

    .line 356
    .line 357
    .line 358
    const v6, 0x400b851f    # 2.18f

    .line 359
    .line 360
    .line 361
    const v7, 0x3ebd70a4    # 0.37f

    .line 362
    .line 363
    .line 364
    const v8, 0x3fdd70a4    # 1.73f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, 0x3f933333    # 1.15f

    .line 371
    .line 372
    .line 373
    const v26, 0x3eb851ec    # 0.36f

    .line 374
    .line 375
    .line 376
    const v21, 0x3ebd70a4    # 0.37f

    .line 377
    .line 378
    .line 379
    const v22, 0x3e6b851f    # 0.23f

    .line 380
    .line 381
    .line 382
    const v23, 0x3f170a3d    # 0.59f

    .line 383
    .line 384
    .line 385
    const v24, 0x3eb851ec    # 0.36f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v26, -0x4147ae14    # -0.36f

    .line 392
    .line 393
    .line 394
    const v21, 0x3f0f5c29    # 0.56f

    .line 395
    .line 396
    .line 397
    const/16 v22, 0x0

    .line 398
    .line 399
    const v23, 0x3f47ae14    # 0.78f

    .line 400
    .line 401
    .line 402
    const v24, -0x41fae148    # -0.13f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x400c28f6    # 2.19f

    .line 409
    .line 410
    .line 411
    const v26, -0x40dc28f6    # -0.64f

    .line 412
    .line 413
    .line 414
    const v21, 0x3eeb851f    # 0.46f

    .line 415
    .line 416
    .line 417
    const v22, -0x4175c28f    # -0.27f

    .line 418
    .line 419
    .line 420
    const v23, 0x3f8a3d71    # 1.08f

    .line 421
    .line 422
    .line 423
    const v24, -0x40dc28f6    # -0.64f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, 0x400b851f    # 2.18f

    .line 430
    .line 431
    .line 432
    const v26, 0x3f23d70a    # 0.64f

    .line 433
    .line 434
    .line 435
    const v21, 0x3f8e147b    # 1.11f

    .line 436
    .line 437
    .line 438
    const/16 v22, 0x0

    .line 439
    .line 440
    const v23, 0x3fdd70a4    # 1.73f

    .line 441
    .line 442
    .line 443
    const v24, 0x3ebd70a4    # 0.37f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, 0x3f933333    # 1.15f

    .line 450
    .line 451
    .line 452
    const v26, 0x3eb851ec    # 0.36f

    .line 453
    .line 454
    .line 455
    const v21, 0x3ebd70a4    # 0.37f

    .line 456
    .line 457
    .line 458
    const v22, 0x3e6147ae    # 0.22f

    .line 459
    .line 460
    .line 461
    const v23, 0x3f19999a    # 0.6f

    .line 462
    .line 463
    .line 464
    const v24, 0x3eb851ec    # 0.36f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, -0x4147ae14    # -0.36f

    .line 471
    .line 472
    .line 473
    const v6, 0x3f933333    # 1.15f

    .line 474
    .line 475
    .line 476
    const v7, -0x41fae148    # -0.13f

    .line 477
    .line 478
    .line 479
    const v8, 0x3f47ae14    # 0.78f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v25, 0x400b851f    # 2.18f

    .line 486
    .line 487
    .line 488
    const v26, -0x40dc28f6    # -0.64f

    .line 489
    .line 490
    .line 491
    const v21, 0x3ee66666    # 0.45f

    .line 492
    .line 493
    .line 494
    const v22, -0x4175c28f    # -0.27f

    .line 495
    .line 496
    .line 497
    const v23, 0x3f88f5c3    # 1.07f

    .line 498
    .line 499
    .line 500
    const v24, -0x40dc28f6    # -0.64f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v4, 0x3f23d70a    # 0.64f

    .line 507
    .line 508
    .line 509
    const v6, 0x400b851f    # 2.18f

    .line 510
    .line 511
    .line 512
    const v7, 0x3ebd70a4    # 0.37f

    .line 513
    .line 514
    .line 515
    const v8, 0x3fdd70a4    # 1.73f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v25, 0x3f933333    # 1.15f

    .line 522
    .line 523
    .line 524
    const v26, 0x3eb851ec    # 0.36f

    .line 525
    .line 526
    .line 527
    const v21, 0x3ebd70a4    # 0.37f

    .line 528
    .line 529
    .line 530
    const v22, 0x3e6b851f    # 0.23f

    .line 531
    .line 532
    .line 533
    const v23, 0x3f170a3d    # 0.59f

    .line 534
    .line 535
    .line 536
    const v24, 0x3eb851ec    # 0.36f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v4, 0x40000000    # 2.0f

    .line 543
    .line 544
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x41840000    # 16.5f

    .line 551
    .line 552
    const/high16 v6, 0x41b00000    # 22.0f

    .line 553
    .line 554
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v25, -0x3ff47ae1    # -2.18f

    .line 558
    .line 559
    .line 560
    const v26, -0x40dc28f6    # -0.64f

    .line 561
    .line 562
    .line 563
    const v21, -0x4071eb85    # -1.11f

    .line 564
    .line 565
    .line 566
    const/16 v22, 0x0

    .line 567
    .line 568
    const v23, -0x40228f5c    # -1.73f

    .line 569
    .line 570
    .line 571
    const v24, -0x41428f5c    # -0.37f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v25, -0x406ccccd    # -1.15f

    .line 578
    .line 579
    .line 580
    const v26, -0x4147ae14    # -0.36f

    .line 581
    .line 582
    .line 583
    const v21, -0x41428f5c    # -0.37f

    .line 584
    .line 585
    .line 586
    const v22, -0x419eb852    # -0.22f

    .line 587
    .line 588
    .line 589
    const v23, -0x40e66666    # -0.6f

    .line 590
    .line 591
    .line 592
    const v24, -0x4147ae14    # -0.36f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v26, 0x3eb851ec    # 0.36f

    .line 599
    .line 600
    .line 601
    const v21, -0x40f0a3d7    # -0.56f

    .line 602
    .line 603
    .line 604
    const/16 v22, 0x0

    .line 605
    .line 606
    const v23, -0x40b851ec    # -0.78f

    .line 607
    .line 608
    .line 609
    const v24, 0x3e051eb8    # 0.13f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v25, -0x3ff47ae1    # -2.18f

    .line 616
    .line 617
    .line 618
    const v26, 0x3f23d70a    # 0.64f

    .line 619
    .line 620
    .line 621
    const v21, -0x4119999a    # -0.45f

    .line 622
    .line 623
    .line 624
    const v22, 0x3e8a3d71    # 0.27f

    .line 625
    .line 626
    .line 627
    const v23, -0x40770a3d    # -1.07f

    .line 628
    .line 629
    .line 630
    const v24, 0x3f23d70a    # 0.64f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v4, -0x40dc28f6    # -0.64f

    .line 637
    .line 638
    .line 639
    const v6, -0x3ff47ae1    # -2.18f

    .line 640
    .line 641
    .line 642
    const v7, -0x41428f5c    # -0.37f

    .line 643
    .line 644
    .line 645
    const v8, -0x40228f5c    # -1.73f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v25, -0x406ccccd    # -1.15f

    .line 652
    .line 653
    .line 654
    const v26, -0x4147ae14    # -0.36f

    .line 655
    .line 656
    .line 657
    const v21, -0x41428f5c    # -0.37f

    .line 658
    .line 659
    .line 660
    const v22, -0x419eb852    # -0.22f

    .line 661
    .line 662
    .line 663
    const v23, -0x40e66666    # -0.6f

    .line 664
    .line 665
    .line 666
    const v24, -0x4147ae14    # -0.36f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v26, 0x3eb851ec    # 0.36f

    .line 673
    .line 674
    .line 675
    const v21, -0x40f0a3d7    # -0.56f

    .line 676
    .line 677
    .line 678
    const/16 v22, 0x0

    .line 679
    .line 680
    const v23, -0x40b851ec    # -0.78f

    .line 681
    .line 682
    .line 683
    const v24, 0x3e051eb8    # 0.13f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v25, -0x3ff47ae1    # -2.18f

    .line 690
    .line 691
    .line 692
    const v26, 0x3f23d70a    # 0.64f

    .line 693
    .line 694
    .line 695
    const v21, -0x4119999a    # -0.45f

    .line 696
    .line 697
    .line 698
    const v22, 0x3e8a3d71    # 0.27f

    .line 699
    .line 700
    .line 701
    const v23, -0x40770a3d    # -1.07f

    .line 702
    .line 703
    .line 704
    const v24, 0x3f23d70a    # 0.64f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v25, -0x406ccccd    # -1.15f

    .line 714
    .line 715
    .line 716
    const v26, -0x4147ae14    # -0.36f

    .line 717
    .line 718
    .line 719
    const v21, -0x41428f5c    # -0.37f

    .line 720
    .line 721
    .line 722
    const v22, -0x419eb852    # -0.22f

    .line 723
    .line 724
    .line 725
    const v23, -0x40e66666    # -0.6f

    .line 726
    .line 727
    .line 728
    const v24, -0x4147ae14    # -0.36f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v4, 0x3eb851ec    # 0.36f

    .line 735
    .line 736
    .line 737
    const v6, -0x406ccccd    # -1.15f

    .line 738
    .line 739
    .line 740
    const v7, 0x3e051eb8    # 0.13f

    .line 741
    .line 742
    .line 743
    const v8, -0x40b851ec    # -0.78f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v25, -0x3ff33333    # -2.2f

    .line 750
    .line 751
    .line 752
    const v26, 0x3f23d70a    # 0.64f

    .line 753
    .line 754
    .line 755
    const v21, -0x410f5c29    # -0.47f

    .line 756
    .line 757
    .line 758
    const v22, 0x3e8a3d71    # 0.27f

    .line 759
    .line 760
    .line 761
    const v23, -0x40747ae1    # -1.09f

    .line 762
    .line 763
    .line 764
    const v24, 0x3f23d70a    # 0.64f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v4, -0x40000000    # -2.0f

    .line 771
    .line 772
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v25, 0x3f933333    # 1.15f

    .line 776
    .line 777
    .line 778
    const v26, -0x4147ae14    # -0.36f

    .line 779
    .line 780
    .line 781
    const v21, 0x3f0f5c29    # 0.56f

    .line 782
    .line 783
    .line 784
    const/16 v22, 0x0

    .line 785
    .line 786
    const v23, 0x3f47ae14    # 0.78f

    .line 787
    .line 788
    .line 789
    const v24, -0x41fae148    # -0.13f

    .line 790
    .line 791
    .line 792
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v25, 0x400b851f    # 2.18f

    .line 796
    .line 797
    .line 798
    const v26, -0x40dc28f6    # -0.64f

    .line 799
    .line 800
    .line 801
    const v21, 0x3ee66666    # 0.45f

    .line 802
    .line 803
    .line 804
    const v22, -0x4175c28f    # -0.27f

    .line 805
    .line 806
    .line 807
    const v23, 0x3f88f5c3    # 1.07f

    .line 808
    .line 809
    .line 810
    const v24, -0x40dc28f6    # -0.64f

    .line 811
    .line 812
    .line 813
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v4, 0x3f23d70a    # 0.64f

    .line 817
    .line 818
    .line 819
    const v6, 0x400b851f    # 2.18f

    .line 820
    .line 821
    .line 822
    const v7, 0x3ebd70a4    # 0.37f

    .line 823
    .line 824
    .line 825
    const v8, 0x3fdd70a4    # 1.73f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v25, 0x3f933333    # 1.15f

    .line 832
    .line 833
    .line 834
    const v26, 0x3eb851ec    # 0.36f

    .line 835
    .line 836
    .line 837
    const v21, 0x3ebd70a4    # 0.37f

    .line 838
    .line 839
    .line 840
    const v22, 0x3e6147ae    # 0.22f

    .line 841
    .line 842
    .line 843
    const v23, 0x3f19999a    # 0.6f

    .line 844
    .line 845
    .line 846
    const v24, 0x3eb851ec    # 0.36f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v26, -0x4147ae14    # -0.36f

    .line 853
    .line 854
    .line 855
    const v21, 0x3f0f5c29    # 0.56f

    .line 856
    .line 857
    .line 858
    const/16 v22, 0x0

    .line 859
    .line 860
    const v23, 0x3f47ae14    # 0.78f

    .line 861
    .line 862
    .line 863
    const v24, -0x41fae148    # -0.13f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v25, 0x400b851f    # 2.18f

    .line 870
    .line 871
    .line 872
    const v26, -0x40dc28f6    # -0.64f

    .line 873
    .line 874
    .line 875
    const v21, 0x3ee66666    # 0.45f

    .line 876
    .line 877
    .line 878
    const v22, -0x4175c28f    # -0.27f

    .line 879
    .line 880
    .line 881
    const v23, 0x3f88f5c3    # 1.07f

    .line 882
    .line 883
    .line 884
    const v24, -0x40dc28f6    # -0.64f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v25, 0x3f933333    # 1.15f

    .line 894
    .line 895
    .line 896
    const v26, 0x3eb851ec    # 0.36f

    .line 897
    .line 898
    .line 899
    const v21, 0x3ebd70a4    # 0.37f

    .line 900
    .line 901
    .line 902
    const v22, 0x3e6147ae    # 0.22f

    .line 903
    .line 904
    .line 905
    const v23, 0x3f19999a    # 0.6f

    .line 906
    .line 907
    .line 908
    const v24, 0x3eb851ec    # 0.36f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v4, -0x4147ae14    # -0.36f

    .line 915
    .line 916
    .line 917
    const v6, 0x3f933333    # 1.15f

    .line 918
    .line 919
    .line 920
    const v7, -0x41fae148    # -0.13f

    .line 921
    .line 922
    .line 923
    const v8, 0x3f47ae14    # 0.78f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v25, 0x400b851f    # 2.18f

    .line 930
    .line 931
    .line 932
    const v26, -0x40dc28f6    # -0.64f

    .line 933
    .line 934
    .line 935
    const v21, 0x3ee66666    # 0.45f

    .line 936
    .line 937
    .line 938
    const v22, -0x4175c28f    # -0.27f

    .line 939
    .line 940
    .line 941
    const v23, 0x3f88f5c3    # 1.07f

    .line 942
    .line 943
    .line 944
    const v24, -0x40dc28f6    # -0.64f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v4, 0x3f23d70a    # 0.64f

    .line 951
    .line 952
    .line 953
    const v6, 0x400b851f    # 2.18f

    .line 954
    .line 955
    .line 956
    const v7, 0x3ebd70a4    # 0.37f

    .line 957
    .line 958
    .line 959
    const v8, 0x3fdd70a4    # 1.73f

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v25, 0x3f933333    # 1.15f

    .line 966
    .line 967
    .line 968
    const v26, 0x3eb851ec    # 0.36f

    .line 969
    .line 970
    .line 971
    const v21, 0x3ebd70a4    # 0.37f

    .line 972
    .line 973
    .line 974
    const v22, 0x3e6147ae    # 0.22f

    .line 975
    .line 976
    .line 977
    const v23, 0x3f19999a    # 0.6f

    .line 978
    .line 979
    .line 980
    const v24, 0x3eb851ec    # 0.36f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v4, 0x40000000    # 2.0f

    .line 987
    .line 988
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v4, 0x410ab852    # 8.67f

    .line 995
    .line 996
    .line 997
    const/high16 v6, 0x41400000    # 12.0f

    .line 998
    .line 999
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v26, -0x4147ae14    # -0.36f

    .line 1003
    .line 1004
    .line 1005
    const v21, 0x3f0f5c29    # 0.56f

    .line 1006
    .line 1007
    .line 1008
    const/16 v22, 0x0

    .line 1009
    .line 1010
    const v23, 0x3f47ae14    # 0.78f

    .line 1011
    .line 1012
    .line 1013
    const v24, -0x41fae148    # -0.13f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const v25, 0x400c28f6    # 2.19f

    .line 1020
    .line 1021
    .line 1022
    const v26, -0x40dc28f6    # -0.64f

    .line 1023
    .line 1024
    .line 1025
    const v21, 0x3eeb851f    # 0.46f

    .line 1026
    .line 1027
    .line 1028
    const v22, -0x4175c28f    # -0.27f

    .line 1029
    .line 1030
    .line 1031
    const v23, 0x3f8a3d71    # 1.08f

    .line 1032
    .line 1033
    .line 1034
    const v24, -0x40dc28f6    # -0.64f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const v25, 0x400b851f    # 2.18f

    .line 1041
    .line 1042
    .line 1043
    const v26, 0x3f23d70a    # 0.64f

    .line 1044
    .line 1045
    .line 1046
    const v21, 0x3f8e147b    # 1.11f

    .line 1047
    .line 1048
    .line 1049
    const/16 v22, 0x0

    .line 1050
    .line 1051
    const v23, 0x3fdd70a4    # 1.73f

    .line 1052
    .line 1053
    .line 1054
    const v24, 0x3ebd70a4    # 0.37f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v25, 0x3f933333    # 1.15f

    .line 1061
    .line 1062
    .line 1063
    const v26, 0x3eb851ec    # 0.36f

    .line 1064
    .line 1065
    .line 1066
    const v21, 0x3ebd70a4    # 0.37f

    .line 1067
    .line 1068
    .line 1069
    const v22, 0x3e6147ae    # 0.22f

    .line 1070
    .line 1071
    .line 1072
    const v23, 0x3f19999a    # 0.6f

    .line 1073
    .line 1074
    .line 1075
    const v24, 0x3eb851ec    # 0.36f

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v4, -0x4147ae14    # -0.36f

    .line 1082
    .line 1083
    .line 1084
    const v6, 0x3f933333    # 1.15f

    .line 1085
    .line 1086
    .line 1087
    const v7, -0x41fae148    # -0.13f

    .line 1088
    .line 1089
    .line 1090
    const v8, 0x3f47ae14    # 0.78f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v25, 0x3ed1eb85    # 0.41f

    .line 1097
    .line 1098
    .line 1099
    const v26, -0x41947ae1    # -0.23f

    .line 1100
    .line 1101
    .line 1102
    const v21, 0x3df5c28f    # 0.12f

    .line 1103
    .line 1104
    .line 1105
    const v22, -0x4270a3d7    # -0.07f

    .line 1106
    .line 1107
    .line 1108
    const v23, 0x3e851eb8    # 0.26f

    .line 1109
    .line 1110
    .line 1111
    const v24, -0x41e66666    # -0.15f

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v4, 0x4127ae14    # 10.48f

    .line 1118
    .line 1119
    .line 1120
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1121
    .line 1122
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v25, 0x40a00000    # 5.0f

    .line 1126
    .line 1127
    const/high16 v26, 0x40400000    # 3.0f

    .line 1128
    .line 1129
    const v21, 0x410ee148    # 8.93f

    .line 1130
    .line 1131
    .line 1132
    const v22, 0x405ccccd    # 3.45f

    .line 1133
    .line 1134
    .line 1135
    const/high16 v23, 0x40f00000    # 7.5f

    .line 1136
    .line 1137
    const v24, 0x403f5c29    # 2.99f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const/high16 v4, 0x40200000    # 2.5f

    .line 1144
    .line 1145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    const/high16 v25, 0x40800000    # 4.0f

    .line 1149
    .line 1150
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 1151
    .line 1152
    const v21, 0x3fe8f5c3    # 1.82f

    .line 1153
    .line 1154
    .line 1155
    const v22, -0x43dc28f6    # -0.01f

    .line 1156
    .line 1157
    .line 1158
    const v23, 0x4038f5c3    # 2.89f

    .line 1159
    .line 1160
    .line 1161
    const v24, 0x3ec7ae14    # 0.39f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1168
    .line 1169
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1170
    .line 1171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 1175
    .line 1176
    const/high16 v6, 0x40500000    # 3.25f

    .line 1177
    .line 1178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const v25, 0x3f451eb8    # 0.77f

    .line 1182
    .line 1183
    .line 1184
    const v26, 0x3ec7ae14    # 0.39f

    .line 1185
    .line 1186
    .line 1187
    const v21, 0x3e9eb852    # 0.31f

    .line 1188
    .line 1189
    .line 1190
    const v22, 0x3df5c28f    # 0.12f

    .line 1191
    .line 1192
    .line 1193
    const v23, 0x3f0f5c29    # 0.56f

    .line 1194
    .line 1195
    .line 1196
    const v24, 0x3e8a3d71    # 0.27f

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1200
    .line 1201
    .line 1202
    const v25, 0x3f933333    # 1.15f

    .line 1203
    .line 1204
    .line 1205
    const v26, 0x3eb851ec    # 0.36f

    .line 1206
    .line 1207
    .line 1208
    const v21, 0x3ebd70a4    # 0.37f

    .line 1209
    .line 1210
    .line 1211
    const v22, 0x3e6b851f    # 0.23f

    .line 1212
    .line 1213
    .line 1214
    const v23, 0x3f170a3d    # 0.59f

    .line 1215
    .line 1216
    .line 1217
    const v24, 0x3eb851ec    # 0.36f

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    const/16 v16, 0x3800

    .line 1231
    .line 1232
    const/16 v17, 0x0

    .line 1233
    .line 1234
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1235
    .line 1236
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1237
    .line 1238
    const/4 v7, 0x0

    .line 1239
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1240
    .line 1241
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1242
    .line 1243
    const/4 v13, 0x0

    .line 1244
    const/4 v14, 0x0

    .line 1245
    const/4 v15, 0x0

    .line 1246
    const-string v4, ""

    .line 1247
    .line 1248
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1249
    .line 1250
    .line 1251
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1252
    .line 1253
    .line 1254
    move-result v3

    .line 1255
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1256
    .line 1257
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1258
    .line 1259
    .line 1260
    move-result-wide v6

    .line 1261
    const/4 v0, 0x0

    .line 1262
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1266
    .line 1267
    .line 1268
    move-result v10

    .line 1269
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1270
    .line 1271
    .line 1272
    move-result v11

    .line 1273
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1276
    .line 1277
    .line 1278
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1279
    .line 1280
    const/high16 v2, 0x41840000    # 16.5f

    .line 1281
    .line 1282
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1286
    .line 1287
    const/4 v2, 0x0

    .line 1288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1292
    .line 1293
    const/16 v19, 0x0

    .line 1294
    .line 1295
    const/high16 v13, 0x40200000    # 2.5f

    .line 1296
    .line 1297
    const/high16 v14, 0x40200000    # 2.5f

    .line 1298
    .line 1299
    const/16 v16, 0x1

    .line 1300
    .line 1301
    const/16 v17, 0x1

    .line 1302
    .line 1303
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1304
    .line 1305
    .line 1306
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1307
    .line 1308
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    const/16 v16, 0x3800

    .line 1316
    .line 1317
    const/16 v17, 0x0

    .line 1318
    .line 1319
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1320
    .line 1321
    const/4 v7, 0x0

    .line 1322
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1323
    .line 1324
    const/4 v13, 0x0

    .line 1325
    const/4 v14, 0x0

    .line 1326
    const-string v4, ""

    .line 1327
    .line 1328
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    sput-object v0, Landroidx/compose/material/icons/filled/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1337
    .line 1338
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    return-object v0
.end method
