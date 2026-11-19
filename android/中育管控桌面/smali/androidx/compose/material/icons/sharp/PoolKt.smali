.class public final Landroidx/compose/material/icons/sharp/PoolKt;
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
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getPool",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/sharp/PoolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/sharp/PoolKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n108#1:171,18\n108#1:208\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n108#1:189,2\n108#1:191,2\n108#1:197,11\n30#1:155,4\n108#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPool(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Pool"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 78
    .line 79
    const/high16 v6, 0x40500000    # 3.25f

    .line 80
    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x3f451eb8    # 0.77f

    .line 85
    .line 86
    .line 87
    const v26, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v21, 0x3e9eb852    # 0.31f

    .line 91
    .line 92
    .line 93
    const v22, 0x3df5c28f    # 0.12f

    .line 94
    .line 95
    .line 96
    const v23, 0x3f0f5c29    # 0.56f

    .line 97
    .line 98
    .line 99
    const v24, 0x3e8a3d71    # 0.27f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x3f933333    # 1.15f

    .line 108
    .line 109
    .line 110
    const v26, 0x3eb851ec    # 0.36f

    .line 111
    .line 112
    .line 113
    const v21, 0x3ebd70a4    # 0.37f

    .line 114
    .line 115
    .line 116
    const v22, 0x3e6b851f    # 0.23f

    .line 117
    .line 118
    .line 119
    const v23, 0x3f170a3d    # 0.59f

    .line 120
    .line 121
    .line 122
    const v24, 0x3eb851ec    # 0.36f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3f47ae14    # 0.78f

    .line 129
    .line 130
    .line 131
    const v6, 0x3f933333    # 1.15f

    .line 132
    .line 133
    .line 134
    const v7, -0x41fae148    # -0.13f

    .line 135
    .line 136
    .line 137
    const v8, -0x4147ae14    # -0.36f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x400c28f6    # 2.19f

    .line 144
    .line 145
    .line 146
    const v26, -0x40dc28f6    # -0.64f

    .line 147
    .line 148
    .line 149
    const v21, 0x3eeb851f    # 0.46f

    .line 150
    .line 151
    .line 152
    const v22, -0x4175c28f    # -0.27f

    .line 153
    .line 154
    .line 155
    const v23, 0x3f8a3d71    # 1.08f

    .line 156
    .line 157
    .line 158
    const v24, -0x40dc28f6    # -0.64f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x400b851f    # 2.18f

    .line 165
    .line 166
    .line 167
    const v6, 0x3fdd70a4    # 1.73f

    .line 168
    .line 169
    .line 170
    const v7, 0x3f23d70a    # 0.64f

    .line 171
    .line 172
    .line 173
    const v8, 0x3ebd70a4    # 0.37f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x3f933333    # 1.15f

    .line 180
    .line 181
    .line 182
    const v26, 0x3eb851ec    # 0.36f

    .line 183
    .line 184
    .line 185
    const v21, 0x3ebd70a4    # 0.37f

    .line 186
    .line 187
    .line 188
    const v22, 0x3e6147ae    # 0.22f

    .line 189
    .line 190
    .line 191
    const v23, 0x3f19999a    # 0.6f

    .line 192
    .line 193
    .line 194
    const v24, 0x3eb851ec    # 0.36f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v26, -0x4147ae14    # -0.36f

    .line 201
    .line 202
    .line 203
    const v21, 0x3f0ccccd    # 0.55f

    .line 204
    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const v23, 0x3f47ae14    # 0.78f

    .line 209
    .line 210
    .line 211
    const v24, -0x41fae148    # -0.13f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3ed1eb85    # 0.41f

    .line 218
    .line 219
    .line 220
    const v26, -0x41947ae1    # -0.23f

    .line 221
    .line 222
    .line 223
    const v21, 0x3df5c28f    # 0.12f

    .line 224
    .line 225
    .line 226
    const v22, -0x4270a3d7    # -0.07f

    .line 227
    .line 228
    .line 229
    const v23, 0x3e851eb8    # 0.26f

    .line 230
    .line 231
    .line 232
    const v24, -0x41e66666    # -0.15f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x4127ae14    # 10.48f

    .line 239
    .line 240
    .line 241
    const/high16 v6, 0x40a00000    # 5.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x40400000    # 3.0f

    .line 247
    .line 248
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40200000    # 2.5f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41100000    # 9.0f

    .line 257
    .line 258
    const/high16 v6, 0x40e00000    # 7.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x41b00000    # 22.0f

    .line 272
    .line 273
    const/high16 v6, 0x41840000    # 16.5f

    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, -0x435c28f6    # -0.02f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x3ca3d70a    # 0.02f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, 0x40ab3333    # 5.35f

    .line 294
    .line 295
    .line 296
    const/high16 v6, 0x41780000    # 15.5f

    .line 297
    .line 298
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v25, 0x3f933333    # 1.15f

    .line 302
    .line 303
    .line 304
    const v26, 0x3eb851ec    # 0.36f

    .line 305
    .line 306
    .line 307
    const v21, 0x3f0ccccd    # 0.55f

    .line 308
    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const v23, 0x3f47ae14    # 0.78f

    .line 313
    .line 314
    .line 315
    const v24, 0x3e0f5c29    # 0.14f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v25, 0x400b851f    # 2.18f

    .line 322
    .line 323
    .line 324
    const v26, 0x3f23d70a    # 0.64f

    .line 325
    .line 326
    .line 327
    const v21, 0x3ee66666    # 0.45f

    .line 328
    .line 329
    .line 330
    const v22, 0x3e8a3d71    # 0.27f

    .line 331
    .line 332
    .line 333
    const v23, 0x3f88f5c3    # 1.07f

    .line 334
    .line 335
    .line 336
    const v24, 0x3f23d70a    # 0.64f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v4, -0x40dc28f6    # -0.64f

    .line 343
    .line 344
    .line 345
    const v6, -0x41428f5c    # -0.37f

    .line 346
    .line 347
    .line 348
    const v7, 0x400b851f    # 2.18f

    .line 349
    .line 350
    .line 351
    const v8, 0x3fdd70a4    # 1.73f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, 0x3f933333    # 1.15f

    .line 358
    .line 359
    .line 360
    const v26, -0x4147ae14    # -0.36f

    .line 361
    .line 362
    .line 363
    const v21, 0x3ebd70a4    # 0.37f

    .line 364
    .line 365
    .line 366
    const v22, -0x41947ae1    # -0.23f

    .line 367
    .line 368
    .line 369
    const v23, 0x3f170a3d    # 0.59f

    .line 370
    .line 371
    .line 372
    const v24, -0x4147ae14    # -0.36f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v26, 0x3eb851ec    # 0.36f

    .line 379
    .line 380
    .line 381
    const v21, 0x3f0ccccd    # 0.55f

    .line 382
    .line 383
    .line 384
    const/16 v22, 0x0

    .line 385
    .line 386
    const v23, 0x3f47ae14    # 0.78f

    .line 387
    .line 388
    .line 389
    const v24, 0x3e0f5c29    # 0.14f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v25, 0x400b851f    # 2.18f

    .line 396
    .line 397
    .line 398
    const v26, 0x3f23d70a    # 0.64f

    .line 399
    .line 400
    .line 401
    const v21, 0x3ee66666    # 0.45f

    .line 402
    .line 403
    .line 404
    const v22, 0x3e8a3d71    # 0.27f

    .line 405
    .line 406
    .line 407
    const v23, 0x3f88f5c3    # 1.07f

    .line 408
    .line 409
    .line 410
    const v24, 0x3f23d70a    # 0.64f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v25, 0x3f933333    # 1.15f

    .line 420
    .line 421
    .line 422
    const v26, -0x4147ae14    # -0.36f

    .line 423
    .line 424
    .line 425
    const v21, 0x3ebd70a4    # 0.37f

    .line 426
    .line 427
    .line 428
    const v22, -0x41947ae1    # -0.23f

    .line 429
    .line 430
    .line 431
    const v23, 0x3f170a3d    # 0.59f

    .line 432
    .line 433
    .line 434
    const v24, -0x4147ae14    # -0.36f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v26, 0x3eb851ec    # 0.36f

    .line 441
    .line 442
    .line 443
    const v21, 0x3f0ccccd    # 0.55f

    .line 444
    .line 445
    .line 446
    const/16 v22, 0x0

    .line 447
    .line 448
    const v23, 0x3f47ae14    # 0.78f

    .line 449
    .line 450
    .line 451
    const v24, 0x3e0f5c29    # 0.14f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v25, 0x400a3d71    # 2.16f

    .line 458
    .line 459
    .line 460
    const v26, 0x3f23d70a    # 0.64f

    .line 461
    .line 462
    .line 463
    const v21, 0x3ee66666    # 0.45f

    .line 464
    .line 465
    .line 466
    const v22, 0x3e8a3d71    # 0.27f

    .line 467
    .line 468
    .line 469
    const v23, 0x3f87ae14    # 1.06f

    .line 470
    .line 471
    .line 472
    const v24, 0x3f2147ae    # 0.63f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, -0x40000000    # -2.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v25, -0x406ccccd    # -1.15f

    .line 484
    .line 485
    .line 486
    const v26, -0x4147ae14    # -0.36f

    .line 487
    .line 488
    .line 489
    const v21, -0x40f33333    # -0.55f

    .line 490
    .line 491
    .line 492
    const/16 v22, 0x0

    .line 493
    .line 494
    const v23, -0x40b851ec    # -0.78f

    .line 495
    .line 496
    .line 497
    const v24, -0x41f0a3d7    # -0.14f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v25, -0x3ff47ae1    # -2.18f

    .line 504
    .line 505
    .line 506
    const v26, -0x40dc28f6    # -0.64f

    .line 507
    .line 508
    .line 509
    const v21, -0x4119999a    # -0.45f

    .line 510
    .line 511
    .line 512
    const v22, -0x4175c28f    # -0.27f

    .line 513
    .line 514
    .line 515
    const v23, -0x40770a3d    # -1.07f

    .line 516
    .line 517
    .line 518
    const v24, -0x40dc28f6    # -0.64f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v4, -0x3ff47ae1    # -2.18f

    .line 525
    .line 526
    .line 527
    const v6, -0x40228f5c    # -1.73f

    .line 528
    .line 529
    .line 530
    const v7, 0x3f23d70a    # 0.64f

    .line 531
    .line 532
    .line 533
    const v8, 0x3ebd70a4    # 0.37f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v25, -0x406ccccd    # -1.15f

    .line 540
    .line 541
    .line 542
    const v26, 0x3eb851ec    # 0.36f

    .line 543
    .line 544
    .line 545
    const v21, -0x41428f5c    # -0.37f

    .line 546
    .line 547
    .line 548
    const v22, 0x3e6b851f    # 0.23f

    .line 549
    .line 550
    .line 551
    const v23, -0x40e66666    # -0.6f

    .line 552
    .line 553
    .line 554
    const v24, 0x3eb851ec    # 0.36f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, -0x41f0a3d7    # -0.14f

    .line 561
    .line 562
    .line 563
    const v6, -0x406ccccd    # -1.15f

    .line 564
    .line 565
    .line 566
    const v7, -0x40b851ec    # -0.78f

    .line 567
    .line 568
    .line 569
    const v8, -0x4147ae14    # -0.36f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v25, -0x3ff47ae1    # -2.18f

    .line 576
    .line 577
    .line 578
    const v26, -0x40dc28f6    # -0.64f

    .line 579
    .line 580
    .line 581
    const v21, -0x4119999a    # -0.45f

    .line 582
    .line 583
    .line 584
    const v22, -0x4175c28f    # -0.27f

    .line 585
    .line 586
    .line 587
    const v23, -0x40770a3d    # -1.07f

    .line 588
    .line 589
    .line 590
    const v24, -0x40dc28f6    # -0.64f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v4, -0x3ff47ae1    # -2.18f

    .line 597
    .line 598
    .line 599
    const v6, -0x40228f5c    # -1.73f

    .line 600
    .line 601
    .line 602
    const v7, 0x3f23d70a    # 0.64f

    .line 603
    .line 604
    .line 605
    const v8, 0x3ebd70a4    # 0.37f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v25, -0x406ccccd    # -1.15f

    .line 612
    .line 613
    .line 614
    const v26, 0x3eb851ec    # 0.36f

    .line 615
    .line 616
    .line 617
    const v21, -0x41428f5c    # -0.37f

    .line 618
    .line 619
    .line 620
    const v22, 0x3e6b851f    # 0.23f

    .line 621
    .line 622
    .line 623
    const v23, -0x40e8f5c3    # -0.59f

    .line 624
    .line 625
    .line 626
    const v24, 0x3eb851ec    # 0.36f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v26, -0x4147ae14    # -0.36f

    .line 633
    .line 634
    .line 635
    const v21, -0x40f33333    # -0.55f

    .line 636
    .line 637
    .line 638
    const/16 v22, 0x0

    .line 639
    .line 640
    const v23, -0x40b851ec    # -0.78f

    .line 641
    .line 642
    .line 643
    const v24, -0x41f0a3d7    # -0.14f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v25, -0x3ff47ae1    # -2.18f

    .line 650
    .line 651
    .line 652
    const v26, -0x40dc28f6    # -0.64f

    .line 653
    .line 654
    .line 655
    const v21, -0x4119999a    # -0.45f

    .line 656
    .line 657
    .line 658
    const v22, -0x4175c28f    # -0.27f

    .line 659
    .line 660
    .line 661
    const v23, -0x40770a3d    # -1.07f

    .line 662
    .line 663
    .line 664
    const v24, -0x40dc28f6    # -0.64f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v25, -0x406ccccd    # -1.15f

    .line 674
    .line 675
    .line 676
    const v26, 0x3eb851ec    # 0.36f

    .line 677
    .line 678
    .line 679
    const v21, -0x41428f5c    # -0.37f

    .line 680
    .line 681
    .line 682
    const v22, 0x3e6b851f    # 0.23f

    .line 683
    .line 684
    .line 685
    const v23, -0x40e8f5c3    # -0.59f

    .line 686
    .line 687
    .line 688
    const v24, 0x3eb851ec    # 0.36f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v4, 0x40000000    # 2.0f

    .line 695
    .line 696
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v25, 0x400ccccd    # 2.2f

    .line 700
    .line 701
    .line 702
    const v26, -0x40dc28f6    # -0.64f

    .line 703
    .line 704
    .line 705
    const v21, 0x3f8e147b    # 1.11f

    .line 706
    .line 707
    .line 708
    const/16 v22, 0x0

    .line 709
    .line 710
    const v23, 0x3fdd70a4    # 1.73f

    .line 711
    .line 712
    .line 713
    const v24, -0x41428f5c    # -0.37f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v25, 0x3f933333    # 1.15f

    .line 720
    .line 721
    .line 722
    const v26, -0x4147ae14    # -0.36f

    .line 723
    .line 724
    .line 725
    const v21, 0x3ebd70a4    # 0.37f

    .line 726
    .line 727
    .line 728
    const v22, -0x41947ae1    # -0.23f

    .line 729
    .line 730
    .line 731
    const v23, 0x3f19999a    # 0.6f

    .line 732
    .line 733
    .line 734
    const v24, -0x4147ae14    # -0.36f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v4, 0x41955c29    # 18.67f

    .line 744
    .line 745
    .line 746
    const/high16 v6, 0x41900000    # 18.0f

    .line 747
    .line 748
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v25, -0x3ff47ae1    # -2.18f

    .line 752
    .line 753
    .line 754
    const v26, 0x3f23d70a    # 0.64f

    .line 755
    .line 756
    .line 757
    const v21, -0x4071eb85    # -1.11f

    .line 758
    .line 759
    .line 760
    const/16 v22, 0x0

    .line 761
    .line 762
    const v23, -0x40228f5c    # -1.73f

    .line 763
    .line 764
    .line 765
    const v24, 0x3ebd70a4    # 0.37f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v25, -0x406ccccd    # -1.15f

    .line 772
    .line 773
    .line 774
    const v26, 0x3eb851ec    # 0.36f

    .line 775
    .line 776
    .line 777
    const v21, -0x41428f5c    # -0.37f

    .line 778
    .line 779
    .line 780
    const v22, 0x3e6b851f    # 0.23f

    .line 781
    .line 782
    .line 783
    const v23, -0x40e66666    # -0.6f

    .line 784
    .line 785
    .line 786
    const v24, 0x3eb851ec    # 0.36f

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v26, -0x4147ae14    # -0.36f

    .line 793
    .line 794
    .line 795
    const v21, -0x40f33333    # -0.55f

    .line 796
    .line 797
    .line 798
    const/16 v22, 0x0

    .line 799
    .line 800
    const v23, -0x40b851ec    # -0.78f

    .line 801
    .line 802
    .line 803
    const v24, -0x41f0a3d7    # -0.14f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v25, -0x3ff47ae1    # -2.18f

    .line 810
    .line 811
    .line 812
    const v26, -0x40dc28f6    # -0.64f

    .line 813
    .line 814
    .line 815
    const v21, -0x4119999a    # -0.45f

    .line 816
    .line 817
    .line 818
    const v22, -0x4175c28f    # -0.27f

    .line 819
    .line 820
    .line 821
    const v23, -0x40770a3d    # -1.07f

    .line 822
    .line 823
    .line 824
    const v24, -0x40dc28f6    # -0.64f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v4, -0x3ff3d70a    # -2.19f

    .line 831
    .line 832
    .line 833
    const v6, -0x40228f5c    # -1.73f

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v25, -0x406ccccd    # -1.15f

    .line 840
    .line 841
    .line 842
    const v26, 0x3eb851ec    # 0.36f

    .line 843
    .line 844
    .line 845
    const v21, -0x41428f5c    # -0.37f

    .line 846
    .line 847
    .line 848
    const v22, 0x3e6b851f    # 0.23f

    .line 849
    .line 850
    .line 851
    const v23, -0x40e8f5c3    # -0.59f

    .line 852
    .line 853
    .line 854
    const v24, 0x3eb851ec    # 0.36f

    .line 855
    .line 856
    .line 857
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v4, -0x406ccccd    # -1.15f

    .line 861
    .line 862
    .line 863
    const v6, -0x40b851ec    # -0.78f

    .line 864
    .line 865
    .line 866
    const v7, -0x41fae148    # -0.13f

    .line 867
    .line 868
    .line 869
    const v8, -0x4147ae14    # -0.36f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v25, -0x3ff47ae1    # -2.18f

    .line 876
    .line 877
    .line 878
    const v26, -0x40dc28f6    # -0.64f

    .line 879
    .line 880
    .line 881
    const v21, -0x4119999a    # -0.45f

    .line 882
    .line 883
    .line 884
    const v22, -0x4175c28f    # -0.27f

    .line 885
    .line 886
    .line 887
    const v23, -0x40770a3d    # -1.07f

    .line 888
    .line 889
    .line 890
    const v24, -0x40dc28f6    # -0.64f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v4, -0x3ff3d70a    # -2.19f

    .line 897
    .line 898
    .line 899
    const v6, -0x40228f5c    # -1.73f

    .line 900
    .line 901
    .line 902
    const v7, 0x3f23d70a    # 0.64f

    .line 903
    .line 904
    .line 905
    const v8, 0x3ebd70a4    # 0.37f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v25, -0x406ccccd    # -1.15f

    .line 912
    .line 913
    .line 914
    const v26, 0x3eb851ec    # 0.36f

    .line 915
    .line 916
    .line 917
    const v21, -0x41428f5c    # -0.37f

    .line 918
    .line 919
    .line 920
    const v22, 0x3e6b851f    # 0.23f

    .line 921
    .line 922
    .line 923
    const v23, -0x40e8f5c3    # -0.59f

    .line 924
    .line 925
    .line 926
    const v24, 0x3eb851ec    # 0.36f

    .line 927
    .line 928
    .line 929
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v4, 0x40000000    # 2.0f

    .line 933
    .line 934
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v25, 0x400c28f6    # 2.19f

    .line 938
    .line 939
    .line 940
    const v26, -0x40dc28f6    # -0.64f

    .line 941
    .line 942
    .line 943
    const v21, 0x3f8e147b    # 1.11f

    .line 944
    .line 945
    .line 946
    const/16 v22, 0x0

    .line 947
    .line 948
    const v23, 0x3fdd70a4    # 1.73f

    .line 949
    .line 950
    .line 951
    const v24, -0x41428f5c    # -0.37f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const v25, 0x3f933333    # 1.15f

    .line 958
    .line 959
    .line 960
    const v26, -0x4147ae14    # -0.36f

    .line 961
    .line 962
    .line 963
    const v21, 0x3ebd70a4    # 0.37f

    .line 964
    .line 965
    .line 966
    const v22, -0x41947ae1    # -0.23f

    .line 967
    .line 968
    .line 969
    const v23, 0x3f19999a    # 0.6f

    .line 970
    .line 971
    .line 972
    const v24, -0x4147ae14    # -0.36f

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v26, 0x3eb851ec    # 0.36f

    .line 979
    .line 980
    .line 981
    const v21, 0x3f0ccccd    # 0.55f

    .line 982
    .line 983
    .line 984
    const/16 v22, 0x0

    .line 985
    .line 986
    const v23, 0x3f47ae14    # 0.78f

    .line 987
    .line 988
    .line 989
    const v24, 0x3e051eb8    # 0.13f

    .line 990
    .line 991
    .line 992
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v25, 0x400b851f    # 2.18f

    .line 996
    .line 997
    .line 998
    const v26, 0x3f23d70a    # 0.64f

    .line 999
    .line 1000
    .line 1001
    const v21, 0x3ee66666    # 0.45f

    .line 1002
    .line 1003
    .line 1004
    const v22, 0x3e8a3d71    # 0.27f

    .line 1005
    .line 1006
    .line 1007
    const v23, 0x3f88f5c3    # 1.07f

    .line 1008
    .line 1009
    .line 1010
    const v24, 0x3f23d70a    # 0.64f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v4, 0x400c28f6    # 2.19f

    .line 1017
    .line 1018
    .line 1019
    const v6, -0x40dc28f6    # -0.64f

    .line 1020
    .line 1021
    .line 1022
    const v7, -0x41428f5c    # -0.37f

    .line 1023
    .line 1024
    .line 1025
    const v8, 0x3fdd70a4    # 1.73f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v25, 0x3f933333    # 1.15f

    .line 1032
    .line 1033
    .line 1034
    const v26, -0x4147ae14    # -0.36f

    .line 1035
    .line 1036
    .line 1037
    const v21, 0x3ebd70a4    # 0.37f

    .line 1038
    .line 1039
    .line 1040
    const v22, -0x41947ae1    # -0.23f

    .line 1041
    .line 1042
    .line 1043
    const v23, 0x3f170a3d    # 0.59f

    .line 1044
    .line 1045
    .line 1046
    const v24, -0x4147ae14    # -0.36f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v26, 0x3eb851ec    # 0.36f

    .line 1053
    .line 1054
    .line 1055
    const v21, 0x3f0ccccd    # 0.55f

    .line 1056
    .line 1057
    .line 1058
    const/16 v22, 0x0

    .line 1059
    .line 1060
    const v23, 0x3f47ae14    # 0.78f

    .line 1061
    .line 1062
    .line 1063
    const v24, 0x3e0f5c29    # 0.14f

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const v25, 0x400b851f    # 2.18f

    .line 1070
    .line 1071
    .line 1072
    const v26, 0x3f23d70a    # 0.64f

    .line 1073
    .line 1074
    .line 1075
    const v21, 0x3ee66666    # 0.45f

    .line 1076
    .line 1077
    .line 1078
    const v22, 0x3e8a3d71    # 0.27f

    .line 1079
    .line 1080
    .line 1081
    const v23, 0x3f88f5c3    # 1.07f

    .line 1082
    .line 1083
    .line 1084
    const v24, 0x3f23d70a    # 0.64f

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const v4, 0x3fdc28f6    # 1.72f

    .line 1091
    .line 1092
    .line 1093
    const v8, 0x400b851f    # 2.18f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const v25, 0x3f933333    # 1.15f

    .line 1100
    .line 1101
    .line 1102
    const v26, -0x4147ae14    # -0.36f

    .line 1103
    .line 1104
    .line 1105
    const v21, 0x3ebd70a4    # 0.37f

    .line 1106
    .line 1107
    .line 1108
    const v22, -0x41947ae1    # -0.23f

    .line 1109
    .line 1110
    .line 1111
    const v23, 0x3f170a3d    # 0.59f

    .line 1112
    .line 1113
    .line 1114
    const v24, -0x4147ae14    # -0.36f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v26, 0x3eb851ec    # 0.36f

    .line 1121
    .line 1122
    .line 1123
    const v21, 0x3f0ccccd    # 0.55f

    .line 1124
    .line 1125
    .line 1126
    const/16 v22, 0x0

    .line 1127
    .line 1128
    const v23, 0x3f47ae14    # 0.78f

    .line 1129
    .line 1130
    .line 1131
    const v24, 0x3e0f5c29    # 0.14f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const v25, 0x400b851f    # 2.18f

    .line 1138
    .line 1139
    .line 1140
    const v26, 0x3f23d70a    # 0.64f

    .line 1141
    .line 1142
    .line 1143
    const v21, 0x3ee66666    # 0.45f

    .line 1144
    .line 1145
    .line 1146
    const v22, 0x3e8a3d71    # 0.27f

    .line 1147
    .line 1148
    .line 1149
    const v23, 0x3f88f5c3    # 1.07f

    .line 1150
    .line 1151
    .line 1152
    const v24, 0x3f23d70a    # 0.64f

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const/high16 v4, -0x40000000    # -2.0f

    .line 1159
    .line 1160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v25, -0x406ccccd    # -1.15f

    .line 1164
    .line 1165
    .line 1166
    const v26, -0x4147ae14    # -0.36f

    .line 1167
    .line 1168
    .line 1169
    const v21, -0x40f0a3d7    # -0.56f

    .line 1170
    .line 1171
    .line 1172
    const/16 v22, 0x0

    .line 1173
    .line 1174
    const v23, -0x40b851ec    # -0.78f

    .line 1175
    .line 1176
    .line 1177
    const v24, -0x41fae148    # -0.13f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v25, -0x3ff47ae1    # -2.18f

    .line 1184
    .line 1185
    .line 1186
    const v26, -0x40dc28f6    # -0.64f

    .line 1187
    .line 1188
    .line 1189
    const v21, -0x4119999a    # -0.45f

    .line 1190
    .line 1191
    .line 1192
    const v22, -0x4175c28f    # -0.27f

    .line 1193
    .line 1194
    .line 1195
    const v23, -0x40770a3d    # -1.07f

    .line 1196
    .line 1197
    .line 1198
    const v24, -0x40dc28f6    # -0.64f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    const/16 v16, 0x3800

    .line 1212
    .line 1213
    const/16 v17, 0x0

    .line 1214
    .line 1215
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1216
    .line 1217
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1218
    .line 1219
    const/4 v7, 0x0

    .line 1220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1221
    .line 1222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1223
    .line 1224
    const/4 v13, 0x0

    .line 1225
    const/4 v14, 0x0

    .line 1226
    const/4 v15, 0x0

    .line 1227
    const-string v4, ""

    .line 1228
    .line 1229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1230
    .line 1231
    .line 1232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1233
    .line 1234
    .line 1235
    move-result v3

    .line 1236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1237
    .line 1238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1239
    .line 1240
    .line 1241
    move-result-wide v6

    .line 1242
    const/4 v0, 0x0

    .line 1243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1247
    .line 1248
    .line 1249
    move-result v10

    .line 1250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1251
    .line 1252
    .line 1253
    move-result v11

    .line 1254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1255
    .line 1256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1257
    .line 1258
    .line 1259
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1260
    .line 1261
    const/high16 v2, 0x41840000    # 16.5f

    .line 1262
    .line 1263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1267
    .line 1268
    const/4 v2, 0x0

    .line 1269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1273
    .line 1274
    const/16 v19, 0x0

    .line 1275
    .line 1276
    const/high16 v13, 0x40200000    # 2.5f

    .line 1277
    .line 1278
    const/high16 v14, 0x40200000    # 2.5f

    .line 1279
    .line 1280
    const/16 v16, 0x1

    .line 1281
    .line 1282
    const/16 v17, 0x1

    .line 1283
    .line 1284
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1288
    .line 1289
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    const/16 v16, 0x3800

    .line 1297
    .line 1298
    const/16 v17, 0x0

    .line 1299
    .line 1300
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1301
    .line 1302
    const/4 v7, 0x0

    .line 1303
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1304
    .line 1305
    const/4 v13, 0x0

    .line 1306
    const/4 v14, 0x0

    .line 1307
    const-string v4, ""

    .line 1308
    .line 1309
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    sput-object v0, Landroidx/compose/material/icons/sharp/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1318
    .line 1319
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1320
    .line 1321
    .line 1322
    return-object v0
.end method
