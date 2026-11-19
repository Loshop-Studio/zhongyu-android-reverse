.class public final Landroidx/compose/material/icons/twotone/PoolKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPool",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/twotone/PoolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,200:1\n212#2,12:201\n233#2,18:214\n253#2:251\n233#2,18:252\n253#2:289\n233#2,18:290\n253#2:327\n233#2,18:328\n253#2:365\n174#3:213\n705#4,2:232\n717#4,2:234\n719#4,11:240\n705#4,2:270\n717#4,2:272\n719#4,11:278\n705#4,2:308\n717#4,2:310\n719#4,11:316\n705#4,2:346\n717#4,2:348\n719#4,11:354\n72#5,4:236\n72#5,4:274\n72#5,4:312\n72#5,4:350\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nandroidx/compose/material/icons/twotone/PoolKt\n*L\n29#1:201,12\n30#1:214,18\n30#1:251\n105#1:252,18\n105#1:289\n111#1:290,18\n111#1:327\n189#1:328,18\n189#1:365\n29#1:213\n30#1:232,2\n30#1:234,2\n30#1:240,11\n105#1:270,2\n105#1:272,2\n105#1:278,11\n111#1:308,2\n111#1:310,2\n111#1:316,11\n189#1:346,2\n189#1:348,2\n189#1:354,11\n30#1:236,4\n105#1:274,4\n111#1:312,4\n189#1:350,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPool(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Pool"

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
    const v4, -0x3ff47ae1    # -2.18f

    .line 159
    .line 160
    .line 161
    const v6, -0x40dc28f6    # -0.64f

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
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, -0x406ccccd    # -1.15f

    .line 236
    .line 237
    .line 238
    const v26, -0x4147ae14    # -0.36f

    .line 239
    .line 240
    .line 241
    const v21, -0x41428f5c    # -0.37f

    .line 242
    .line 243
    .line 244
    const v22, -0x41947ae1    # -0.23f

    .line 245
    .line 246
    .line 247
    const v23, -0x40e66666    # -0.6f

    .line 248
    .line 249
    .line 250
    const v24, -0x4147ae14    # -0.36f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x3eb851ec    # 0.36f

    .line 257
    .line 258
    .line 259
    const v6, 0x3e051eb8    # 0.13f

    .line 260
    .line 261
    .line 262
    const v7, -0x406ccccd    # -1.15f

    .line 263
    .line 264
    .line 265
    const v8, -0x40b851ec    # -0.78f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, -0x3ff3d70a    # -2.19f

    .line 272
    .line 273
    .line 274
    const v26, 0x3f23d70a    # 0.64f

    .line 275
    .line 276
    .line 277
    const v21, -0x41147ae1    # -0.46f

    .line 278
    .line 279
    .line 280
    const v22, 0x3e8a3d71    # 0.27f

    .line 281
    .line 282
    .line 283
    const v23, -0x4075c28f    # -1.08f

    .line 284
    .line 285
    .line 286
    const v24, 0x3f23d70a    # 0.64f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, -0x40000000    # -2.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v25, 0x3f933333    # 1.15f

    .line 298
    .line 299
    .line 300
    const v26, -0x4147ae14    # -0.36f

    .line 301
    .line 302
    .line 303
    const v21, 0x3f0f5c29    # 0.56f

    .line 304
    .line 305
    .line 306
    const/16 v22, 0x0

    .line 307
    .line 308
    const v23, 0x3f47ae14    # 0.78f

    .line 309
    .line 310
    .line 311
    const v24, -0x41fae148    # -0.13f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v25, 0x400c28f6    # 2.19f

    .line 318
    .line 319
    .line 320
    const v26, -0x40dc28f6    # -0.64f

    .line 321
    .line 322
    .line 323
    const v21, 0x3eeb851f    # 0.46f

    .line 324
    .line 325
    .line 326
    const v22, -0x4175c28f    # -0.27f

    .line 327
    .line 328
    .line 329
    const v23, 0x3f8a3d71    # 1.08f

    .line 330
    .line 331
    .line 332
    const v24, -0x40dc28f6    # -0.64f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x400b851f    # 2.18f

    .line 339
    .line 340
    .line 341
    const v6, 0x3fdd70a4    # 1.73f

    .line 342
    .line 343
    .line 344
    const v7, 0x3f23d70a    # 0.64f

    .line 345
    .line 346
    .line 347
    const v8, 0x3ebd70a4    # 0.37f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v25, 0x3f933333    # 1.15f

    .line 354
    .line 355
    .line 356
    const v26, 0x3eb851ec    # 0.36f

    .line 357
    .line 358
    .line 359
    const v21, 0x3ebd70a4    # 0.37f

    .line 360
    .line 361
    .line 362
    const v22, 0x3e6b851f    # 0.23f

    .line 363
    .line 364
    .line 365
    const v23, 0x3f170a3d    # 0.59f

    .line 366
    .line 367
    .line 368
    const v24, 0x3eb851ec    # 0.36f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v26, -0x4147ae14    # -0.36f

    .line 375
    .line 376
    .line 377
    const v21, 0x3f0f5c29    # 0.56f

    .line 378
    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    const v23, 0x3f47ae14    # 0.78f

    .line 383
    .line 384
    .line 385
    const v24, -0x41fae148    # -0.13f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v25, 0x400c28f6    # 2.19f

    .line 392
    .line 393
    .line 394
    const v26, -0x40dc28f6    # -0.64f

    .line 395
    .line 396
    .line 397
    const v21, 0x3eeb851f    # 0.46f

    .line 398
    .line 399
    .line 400
    const v22, -0x4175c28f    # -0.27f

    .line 401
    .line 402
    .line 403
    const v23, 0x3f8a3d71    # 1.08f

    .line 404
    .line 405
    .line 406
    const v24, -0x40dc28f6    # -0.64f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, 0x3f933333    # 1.15f

    .line 416
    .line 417
    .line 418
    const v26, 0x3eb851ec    # 0.36f

    .line 419
    .line 420
    .line 421
    const v21, 0x3ebd70a4    # 0.37f

    .line 422
    .line 423
    .line 424
    const v22, 0x3e6147ae    # 0.22f

    .line 425
    .line 426
    .line 427
    const v23, 0x3f19999a    # 0.6f

    .line 428
    .line 429
    .line 430
    const v24, 0x3eb851ec    # 0.36f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x3f933333    # 1.15f

    .line 437
    .line 438
    .line 439
    const v6, 0x3f47ae14    # 0.78f

    .line 440
    .line 441
    .line 442
    const v7, -0x41fae148    # -0.13f

    .line 443
    .line 444
    .line 445
    const v8, -0x4147ae14    # -0.36f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, 0x400b851f    # 2.18f

    .line 452
    .line 453
    .line 454
    const v26, -0x40dc28f6    # -0.64f

    .line 455
    .line 456
    .line 457
    const v21, 0x3ee66666    # 0.45f

    .line 458
    .line 459
    .line 460
    const v22, -0x4175c28f    # -0.27f

    .line 461
    .line 462
    .line 463
    const v23, 0x3f88f5c3    # 1.07f

    .line 464
    .line 465
    .line 466
    const v24, -0x40dc28f6    # -0.64f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, 0x400b851f    # 2.18f

    .line 473
    .line 474
    .line 475
    const v6, 0x3fdd70a4    # 1.73f

    .line 476
    .line 477
    .line 478
    const v7, 0x3f23d70a    # 0.64f

    .line 479
    .line 480
    .line 481
    const v8, 0x3ebd70a4    # 0.37f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v25, 0x3f933333    # 1.15f

    .line 488
    .line 489
    .line 490
    const v26, 0x3eb851ec    # 0.36f

    .line 491
    .line 492
    .line 493
    const v21, 0x3ebd70a4    # 0.37f

    .line 494
    .line 495
    .line 496
    const v22, 0x3e6b851f    # 0.23f

    .line 497
    .line 498
    .line 499
    const v23, 0x3f170a3d    # 0.59f

    .line 500
    .line 501
    .line 502
    const v24, 0x3eb851ec    # 0.36f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x40000000    # 2.0f

    .line 509
    .line 510
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v4, 0x41b00000    # 22.0f

    .line 517
    .line 518
    const/high16 v6, 0x41840000    # 16.5f

    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v25, -0x3ff47ae1    # -2.18f

    .line 524
    .line 525
    .line 526
    const v26, -0x40dc28f6    # -0.64f

    .line 527
    .line 528
    .line 529
    const v21, -0x4071eb85    # -1.11f

    .line 530
    .line 531
    .line 532
    const/16 v22, 0x0

    .line 533
    .line 534
    const v23, -0x40228f5c    # -1.73f

    .line 535
    .line 536
    .line 537
    const v24, -0x41428f5c    # -0.37f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v25, -0x406ccccd    # -1.15f

    .line 544
    .line 545
    .line 546
    const v26, -0x4147ae14    # -0.36f

    .line 547
    .line 548
    .line 549
    const v21, -0x41428f5c    # -0.37f

    .line 550
    .line 551
    .line 552
    const v22, -0x419eb852    # -0.22f

    .line 553
    .line 554
    .line 555
    const v23, -0x40e66666    # -0.6f

    .line 556
    .line 557
    .line 558
    const v24, -0x4147ae14    # -0.36f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v26, 0x3eb851ec    # 0.36f

    .line 565
    .line 566
    .line 567
    const v21, -0x40f0a3d7    # -0.56f

    .line 568
    .line 569
    .line 570
    const/16 v22, 0x0

    .line 571
    .line 572
    const v23, -0x40b851ec    # -0.78f

    .line 573
    .line 574
    .line 575
    const v24, 0x3e051eb8    # 0.13f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v25, -0x3ff47ae1    # -2.18f

    .line 582
    .line 583
    .line 584
    const v26, 0x3f23d70a    # 0.64f

    .line 585
    .line 586
    .line 587
    const v21, -0x4119999a    # -0.45f

    .line 588
    .line 589
    .line 590
    const v22, 0x3e8a3d71    # 0.27f

    .line 591
    .line 592
    .line 593
    const v23, -0x40770a3d    # -1.07f

    .line 594
    .line 595
    .line 596
    const v24, 0x3f23d70a    # 0.64f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v4, -0x3ff47ae1    # -2.18f

    .line 603
    .line 604
    .line 605
    const v6, -0x40dc28f6    # -0.64f

    .line 606
    .line 607
    .line 608
    const v7, -0x41428f5c    # -0.37f

    .line 609
    .line 610
    .line 611
    const v8, -0x40228f5c    # -1.73f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v25, -0x406ccccd    # -1.15f

    .line 618
    .line 619
    .line 620
    const v26, -0x4147ae14    # -0.36f

    .line 621
    .line 622
    .line 623
    const v21, -0x41428f5c    # -0.37f

    .line 624
    .line 625
    .line 626
    const v22, -0x419eb852    # -0.22f

    .line 627
    .line 628
    .line 629
    const v23, -0x40e66666    # -0.6f

    .line 630
    .line 631
    .line 632
    const v24, -0x4147ae14    # -0.36f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v26, 0x3eb851ec    # 0.36f

    .line 639
    .line 640
    .line 641
    const v21, -0x40f0a3d7    # -0.56f

    .line 642
    .line 643
    .line 644
    const/16 v22, 0x0

    .line 645
    .line 646
    const v23, -0x40b851ec    # -0.78f

    .line 647
    .line 648
    .line 649
    const v24, 0x3e051eb8    # 0.13f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v25, -0x3ff47ae1    # -2.18f

    .line 656
    .line 657
    .line 658
    const v26, 0x3f23d70a    # 0.64f

    .line 659
    .line 660
    .line 661
    const v21, -0x4119999a    # -0.45f

    .line 662
    .line 663
    .line 664
    const v22, 0x3e8a3d71    # 0.27f

    .line 665
    .line 666
    .line 667
    const v23, -0x40770a3d    # -1.07f

    .line 668
    .line 669
    .line 670
    const v24, 0x3f23d70a    # 0.64f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v25, -0x406ccccd    # -1.15f

    .line 680
    .line 681
    .line 682
    const v26, -0x4147ae14    # -0.36f

    .line 683
    .line 684
    .line 685
    const v21, -0x41428f5c    # -0.37f

    .line 686
    .line 687
    .line 688
    const v22, -0x419eb852    # -0.22f

    .line 689
    .line 690
    .line 691
    const v23, -0x40e66666    # -0.6f

    .line 692
    .line 693
    .line 694
    const v24, -0x4147ae14    # -0.36f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x3eb851ec    # 0.36f

    .line 701
    .line 702
    .line 703
    const v6, 0x3e051eb8    # 0.13f

    .line 704
    .line 705
    .line 706
    const v7, -0x406ccccd    # -1.15f

    .line 707
    .line 708
    .line 709
    const v8, -0x40b851ec    # -0.78f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v25, -0x3ff33333    # -2.2f

    .line 716
    .line 717
    .line 718
    const v26, 0x3f23d70a    # 0.64f

    .line 719
    .line 720
    .line 721
    const v21, -0x410f5c29    # -0.47f

    .line 722
    .line 723
    .line 724
    const v22, 0x3e8a3d71    # 0.27f

    .line 725
    .line 726
    .line 727
    const v23, -0x40747ae1    # -1.09f

    .line 728
    .line 729
    .line 730
    const v24, 0x3f23d70a    # 0.64f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v4, -0x40000000    # -2.0f

    .line 737
    .line 738
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v25, 0x3f933333    # 1.15f

    .line 742
    .line 743
    .line 744
    const v26, -0x4147ae14    # -0.36f

    .line 745
    .line 746
    .line 747
    const v21, 0x3f0f5c29    # 0.56f

    .line 748
    .line 749
    .line 750
    const/16 v22, 0x0

    .line 751
    .line 752
    const v23, 0x3f47ae14    # 0.78f

    .line 753
    .line 754
    .line 755
    const v24, -0x41fae148    # -0.13f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v25, 0x400b851f    # 2.18f

    .line 762
    .line 763
    .line 764
    const v26, -0x40dc28f6    # -0.64f

    .line 765
    .line 766
    .line 767
    const v21, 0x3ee66666    # 0.45f

    .line 768
    .line 769
    .line 770
    const v22, -0x4175c28f    # -0.27f

    .line 771
    .line 772
    .line 773
    const v23, 0x3f88f5c3    # 1.07f

    .line 774
    .line 775
    .line 776
    const v24, -0x40dc28f6    # -0.64f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v4, 0x400b851f    # 2.18f

    .line 783
    .line 784
    .line 785
    const v6, 0x3fdd70a4    # 1.73f

    .line 786
    .line 787
    .line 788
    const v7, 0x3f23d70a    # 0.64f

    .line 789
    .line 790
    .line 791
    const v8, 0x3ebd70a4    # 0.37f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v25, 0x3f933333    # 1.15f

    .line 798
    .line 799
    .line 800
    const v26, 0x3eb851ec    # 0.36f

    .line 801
    .line 802
    .line 803
    const v21, 0x3ebd70a4    # 0.37f

    .line 804
    .line 805
    .line 806
    const v22, 0x3e6147ae    # 0.22f

    .line 807
    .line 808
    .line 809
    const v23, 0x3f19999a    # 0.6f

    .line 810
    .line 811
    .line 812
    const v24, 0x3eb851ec    # 0.36f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v26, -0x4147ae14    # -0.36f

    .line 819
    .line 820
    .line 821
    const v21, 0x3f0f5c29    # 0.56f

    .line 822
    .line 823
    .line 824
    const/16 v22, 0x0

    .line 825
    .line 826
    const v23, 0x3f47ae14    # 0.78f

    .line 827
    .line 828
    .line 829
    const v24, -0x41fae148    # -0.13f

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v25, 0x400b851f    # 2.18f

    .line 836
    .line 837
    .line 838
    const v26, -0x40dc28f6    # -0.64f

    .line 839
    .line 840
    .line 841
    const v21, 0x3ee66666    # 0.45f

    .line 842
    .line 843
    .line 844
    const v22, -0x4175c28f    # -0.27f

    .line 845
    .line 846
    .line 847
    const v23, 0x3f88f5c3    # 1.07f

    .line 848
    .line 849
    .line 850
    const v24, -0x40dc28f6    # -0.64f

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v25, 0x3f933333    # 1.15f

    .line 860
    .line 861
    .line 862
    const v26, 0x3eb851ec    # 0.36f

    .line 863
    .line 864
    .line 865
    const v21, 0x3ebd70a4    # 0.37f

    .line 866
    .line 867
    .line 868
    const v22, 0x3e6147ae    # 0.22f

    .line 869
    .line 870
    .line 871
    const v23, 0x3f19999a    # 0.6f

    .line 872
    .line 873
    .line 874
    const v24, 0x3eb851ec    # 0.36f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v4, 0x3f933333    # 1.15f

    .line 881
    .line 882
    .line 883
    const v6, 0x3f47ae14    # 0.78f

    .line 884
    .line 885
    .line 886
    const v7, -0x41fae148    # -0.13f

    .line 887
    .line 888
    .line 889
    const v8, -0x4147ae14    # -0.36f

    .line 890
    .line 891
    .line 892
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const v25, 0x400b851f    # 2.18f

    .line 896
    .line 897
    .line 898
    const v26, -0x40dc28f6    # -0.64f

    .line 899
    .line 900
    .line 901
    const v21, 0x3ee66666    # 0.45f

    .line 902
    .line 903
    .line 904
    const v22, -0x4175c28f    # -0.27f

    .line 905
    .line 906
    .line 907
    const v23, 0x3f88f5c3    # 1.07f

    .line 908
    .line 909
    .line 910
    const v24, -0x40dc28f6    # -0.64f

    .line 911
    .line 912
    .line 913
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v4, 0x400b851f    # 2.18f

    .line 917
    .line 918
    .line 919
    const v6, 0x3fdd70a4    # 1.73f

    .line 920
    .line 921
    .line 922
    const v7, 0x3f23d70a    # 0.64f

    .line 923
    .line 924
    .line 925
    const v8, 0x3ebd70a4    # 0.37f

    .line 926
    .line 927
    .line 928
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v25, 0x3f933333    # 1.15f

    .line 932
    .line 933
    .line 934
    const v26, 0x3eb851ec    # 0.36f

    .line 935
    .line 936
    .line 937
    const v21, 0x3ebd70a4    # 0.37f

    .line 938
    .line 939
    .line 940
    const v22, 0x3e6147ae    # 0.22f

    .line 941
    .line 942
    .line 943
    const v23, 0x3f19999a    # 0.6f

    .line 944
    .line 945
    .line 946
    const v24, 0x3eb851ec    # 0.36f

    .line 947
    .line 948
    .line 949
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const/high16 v4, 0x40000000    # 2.0f

    .line 953
    .line 954
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v4, 0x41b00000    # 22.0f

    .line 958
    .line 959
    const/high16 v6, 0x41840000    # 16.5f

    .line 960
    .line 961
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v4, 0x410ab852    # 8.67f

    .line 968
    .line 969
    .line 970
    const/high16 v6, 0x41400000    # 12.0f

    .line 971
    .line 972
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v26, -0x4147ae14    # -0.36f

    .line 976
    .line 977
    .line 978
    const v21, 0x3f0f5c29    # 0.56f

    .line 979
    .line 980
    .line 981
    const/16 v22, 0x0

    .line 982
    .line 983
    const v23, 0x3f47ae14    # 0.78f

    .line 984
    .line 985
    .line 986
    const v24, -0x41fae148    # -0.13f

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v25, 0x400c28f6    # 2.19f

    .line 993
    .line 994
    .line 995
    const v26, -0x40dc28f6    # -0.64f

    .line 996
    .line 997
    .line 998
    const v21, 0x3eeb851f    # 0.46f

    .line 999
    .line 1000
    .line 1001
    const v22, -0x4175c28f    # -0.27f

    .line 1002
    .line 1003
    .line 1004
    const v23, 0x3f8a3d71    # 1.08f

    .line 1005
    .line 1006
    .line 1007
    const v24, -0x40dc28f6    # -0.64f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v4, 0x400b851f    # 2.18f

    .line 1014
    .line 1015
    .line 1016
    const v6, 0x3fdd70a4    # 1.73f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v25, 0x3f933333    # 1.15f

    .line 1023
    .line 1024
    .line 1025
    const v26, 0x3eb851ec    # 0.36f

    .line 1026
    .line 1027
    .line 1028
    const v21, 0x3ebd70a4    # 0.37f

    .line 1029
    .line 1030
    .line 1031
    const v22, 0x3e6147ae    # 0.22f

    .line 1032
    .line 1033
    .line 1034
    const v23, 0x3f19999a    # 0.6f

    .line 1035
    .line 1036
    .line 1037
    const v24, 0x3eb851ec    # 0.36f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v4, 0x3f933333    # 1.15f

    .line 1044
    .line 1045
    .line 1046
    const v6, 0x3f47ae14    # 0.78f

    .line 1047
    .line 1048
    .line 1049
    const v7, -0x41fae148    # -0.13f

    .line 1050
    .line 1051
    .line 1052
    const v8, -0x4147ae14    # -0.36f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v25, 0x3ed1eb85    # 0.41f

    .line 1059
    .line 1060
    .line 1061
    const v26, -0x41947ae1    # -0.23f

    .line 1062
    .line 1063
    .line 1064
    const v21, 0x3df5c28f    # 0.12f

    .line 1065
    .line 1066
    .line 1067
    const v22, -0x4270a3d7    # -0.07f

    .line 1068
    .line 1069
    .line 1070
    const v23, 0x3e851eb8    # 0.26f

    .line 1071
    .line 1072
    .line 1073
    const v24, -0x41e66666    # -0.15f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v4, 0x4127ae14    # 10.48f

    .line 1080
    .line 1081
    .line 1082
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1083
    .line 1084
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const/high16 v25, 0x40a00000    # 5.0f

    .line 1088
    .line 1089
    const/high16 v26, 0x40400000    # 3.0f

    .line 1090
    .line 1091
    const v21, 0x410ee148    # 8.93f

    .line 1092
    .line 1093
    .line 1094
    const v22, 0x405ccccd    # 3.45f

    .line 1095
    .line 1096
    .line 1097
    const/high16 v23, 0x40f00000    # 7.5f

    .line 1098
    .line 1099
    const v24, 0x403f5c29    # 2.99f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v4, 0x40200000    # 2.5f

    .line 1106
    .line 1107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    const/high16 v25, 0x40800000    # 4.0f

    .line 1111
    .line 1112
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 1113
    .line 1114
    const v21, 0x3fe8f5c3    # 1.82f

    .line 1115
    .line 1116
    .line 1117
    const v22, -0x43dc28f6    # -0.01f

    .line 1118
    .line 1119
    .line 1120
    const v23, 0x4038f5c3    # 2.89f

    .line 1121
    .line 1122
    .line 1123
    const v24, 0x3ec7ae14    # 0.39f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1130
    .line 1131
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 1135
    .line 1136
    const/high16 v6, 0x40500000    # 3.25f

    .line 1137
    .line 1138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v25, 0x3f451eb8    # 0.77f

    .line 1142
    .line 1143
    .line 1144
    const v26, 0x3ec7ae14    # 0.39f

    .line 1145
    .line 1146
    .line 1147
    const v21, 0x3e9eb852    # 0.31f

    .line 1148
    .line 1149
    .line 1150
    const v22, 0x3df5c28f    # 0.12f

    .line 1151
    .line 1152
    .line 1153
    const v23, 0x3f0f5c29    # 0.56f

    .line 1154
    .line 1155
    .line 1156
    const v24, 0x3e8a3d71    # 0.27f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const v25, 0x3f933333    # 1.15f

    .line 1163
    .line 1164
    .line 1165
    const v26, 0x3eb851ec    # 0.36f

    .line 1166
    .line 1167
    .line 1168
    const v21, 0x3ebd70a4    # 0.37f

    .line 1169
    .line 1170
    .line 1171
    const v22, 0x3e6b851f    # 0.23f

    .line 1172
    .line 1173
    .line 1174
    const v23, 0x3f170a3d    # 0.59f

    .line 1175
    .line 1176
    .line 1177
    const v24, 0x3eb851ec    # 0.36f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    const/16 v16, 0x3800

    .line 1191
    .line 1192
    const/16 v17, 0x0

    .line 1193
    .line 1194
    const v6, 0x3e99999a    # 0.3f

    .line 1195
    .line 1196
    .line 1197
    const v8, 0x3e99999a    # 0.3f

    .line 1198
    .line 1199
    .line 1200
    const/4 v7, 0x0

    .line 1201
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1202
    .line 1203
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1204
    .line 1205
    const/4 v13, 0x0

    .line 1206
    const/4 v14, 0x0

    .line 1207
    const/4 v15, 0x0

    .line 1208
    const-string v4, ""

    .line 1209
    .line 1210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1211
    .line 1212
    .line 1213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1214
    .line 1215
    .line 1216
    move-result v3

    .line 1217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1218
    .line 1219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v6

    .line 1223
    const/4 v2, 0x0

    .line 1224
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1228
    .line 1229
    .line 1230
    move-result v10

    .line 1231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1232
    .line 1233
    .line 1234
    move-result v11

    .line 1235
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1238
    .line 1239
    .line 1240
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1241
    .line 1242
    const/high16 v6, 0x41840000    # 16.5f

    .line 1243
    .line 1244
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1245
    .line 1246
    .line 1247
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 1248
    .line 1249
    const/4 v6, 0x0

    .line 1250
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1251
    .line 1252
    .line 1253
    const/high16 v26, 0x40a00000    # 5.0f

    .line 1254
    .line 1255
    const/16 v27, 0x0

    .line 1256
    .line 1257
    const/high16 v21, 0x40200000    # 2.5f

    .line 1258
    .line 1259
    const/high16 v22, 0x40200000    # 2.5f

    .line 1260
    .line 1261
    const/16 v23, 0x0

    .line 1262
    .line 1263
    const/16 v24, 0x1

    .line 1264
    .line 1265
    const/16 v25, 0x1

    .line 1266
    .line 1267
    move-object/from16 v20, v2

    .line 1268
    .line 1269
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    const/high16 v26, -0x3f600000    # -5.0f

    .line 1273
    .line 1274
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v2

    .line 1281
    const v6, 0x3e99999a    # 0.3f

    .line 1282
    .line 1283
    .line 1284
    const/4 v7, 0x0

    .line 1285
    const-string v4, ""

    .line 1286
    .line 1287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1288
    .line 1289
    .line 1290
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1291
    .line 1292
    .line 1293
    move-result v3

    .line 1294
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1295
    .line 1296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1297
    .line 1298
    .line 1299
    move-result-wide v6

    .line 1300
    const/4 v2, 0x0

    .line 1301
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1305
    .line 1306
    .line 1307
    move-result v10

    .line 1308
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1309
    .line 1310
    .line 1311
    move-result v11

    .line 1312
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1313
    .line 1314
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1315
    .line 1316
    .line 1317
    const/high16 v4, 0x41b00000    # 22.0f

    .line 1318
    .line 1319
    const/high16 v6, 0x41840000    # 16.5f

    .line 1320
    .line 1321
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    const v4, -0x435c28f6    # -0.02f

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1328
    .line 1329
    .line 1330
    const v4, 0x3ca3d70a    # 0.02f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1337
    .line 1338
    .line 1339
    const/high16 v4, 0x41200000    # 10.0f

    .line 1340
    .line 1341
    const/high16 v6, 0x41000000    # 8.0f

    .line 1342
    .line 1343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1344
    .line 1345
    .line 1346
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 1347
    .line 1348
    const/high16 v6, 0x40500000    # 3.25f

    .line 1349
    .line 1350
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1351
    .line 1352
    .line 1353
    const v25, 0x3f451eb8    # 0.77f

    .line 1354
    .line 1355
    .line 1356
    const v26, 0x3ec7ae14    # 0.39f

    .line 1357
    .line 1358
    .line 1359
    const v21, 0x3e9eb852    # 0.31f

    .line 1360
    .line 1361
    .line 1362
    const v22, 0x3df5c28f    # 0.12f

    .line 1363
    .line 1364
    .line 1365
    const v23, 0x3f0f5c29    # 0.56f

    .line 1366
    .line 1367
    .line 1368
    const v24, 0x3e8a3d71    # 0.27f

    .line 1369
    .line 1370
    .line 1371
    move-object/from16 v20, v2

    .line 1372
    .line 1373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1374
    .line 1375
    .line 1376
    const v25, 0x3f933333    # 1.15f

    .line 1377
    .line 1378
    .line 1379
    const v26, 0x3eb851ec    # 0.36f

    .line 1380
    .line 1381
    .line 1382
    const v21, 0x3ebd70a4    # 0.37f

    .line 1383
    .line 1384
    .line 1385
    const v22, 0x3e6b851f    # 0.23f

    .line 1386
    .line 1387
    .line 1388
    const v23, 0x3f170a3d    # 0.59f

    .line 1389
    .line 1390
    .line 1391
    const v24, 0x3eb851ec    # 0.36f

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    .line 1397
    const v4, 0x3f933333    # 1.15f

    .line 1398
    .line 1399
    .line 1400
    const v6, 0x3f47ae14    # 0.78f

    .line 1401
    .line 1402
    .line 1403
    const v7, -0x41fae148    # -0.13f

    .line 1404
    .line 1405
    .line 1406
    const v8, -0x4147ae14    # -0.36f

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    const v25, 0x400c28f6    # 2.19f

    .line 1413
    .line 1414
    .line 1415
    const v26, -0x40dc28f6    # -0.64f

    .line 1416
    .line 1417
    .line 1418
    const v21, 0x3eeb851f    # 0.46f

    .line 1419
    .line 1420
    .line 1421
    const v22, -0x4175c28f    # -0.27f

    .line 1422
    .line 1423
    .line 1424
    const v23, 0x3f8a3d71    # 1.08f

    .line 1425
    .line 1426
    .line 1427
    const v24, -0x40dc28f6    # -0.64f

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1431
    .line 1432
    .line 1433
    const v4, 0x400b851f    # 2.18f

    .line 1434
    .line 1435
    .line 1436
    const v6, 0x3fdd70a4    # 1.73f

    .line 1437
    .line 1438
    .line 1439
    const v7, 0x3f23d70a    # 0.64f

    .line 1440
    .line 1441
    .line 1442
    const v8, 0x3ebd70a4    # 0.37f

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1446
    .line 1447
    .line 1448
    const v25, 0x3f933333    # 1.15f

    .line 1449
    .line 1450
    .line 1451
    const v26, 0x3eb851ec    # 0.36f

    .line 1452
    .line 1453
    .line 1454
    const v21, 0x3ebd70a4    # 0.37f

    .line 1455
    .line 1456
    .line 1457
    const v22, 0x3e6147ae    # 0.22f

    .line 1458
    .line 1459
    .line 1460
    const v23, 0x3f19999a    # 0.6f

    .line 1461
    .line 1462
    .line 1463
    const v24, 0x3eb851ec    # 0.36f

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1467
    .line 1468
    .line 1469
    const v26, -0x4147ae14    # -0.36f

    .line 1470
    .line 1471
    .line 1472
    const v21, 0x3f0ccccd    # 0.55f

    .line 1473
    .line 1474
    .line 1475
    const/16 v22, 0x0

    .line 1476
    .line 1477
    const v23, 0x3f47ae14    # 0.78f

    .line 1478
    .line 1479
    .line 1480
    const v24, -0x41fae148    # -0.13f

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1484
    .line 1485
    .line 1486
    const v25, 0x3ed1eb85    # 0.41f

    .line 1487
    .line 1488
    .line 1489
    const v26, -0x41947ae1    # -0.23f

    .line 1490
    .line 1491
    .line 1492
    const v21, 0x3df5c28f    # 0.12f

    .line 1493
    .line 1494
    .line 1495
    const v22, -0x4270a3d7    # -0.07f

    .line 1496
    .line 1497
    .line 1498
    const v23, 0x3e851eb8    # 0.26f

    .line 1499
    .line 1500
    .line 1501
    const v24, -0x41e66666    # -0.15f

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1505
    .line 1506
    .line 1507
    const v4, 0x4127ae14    # 10.48f

    .line 1508
    .line 1509
    .line 1510
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1511
    .line 1512
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1513
    .line 1514
    .line 1515
    const/high16 v25, 0x40a00000    # 5.0f

    .line 1516
    .line 1517
    const/high16 v26, 0x40400000    # 3.0f

    .line 1518
    .line 1519
    const v21, 0x410ee148    # 8.93f

    .line 1520
    .line 1521
    .line 1522
    const v22, 0x405ccccd    # 3.45f

    .line 1523
    .line 1524
    .line 1525
    const/high16 v23, 0x40f00000    # 7.5f

    .line 1526
    .line 1527
    const v24, 0x403f5c29    # 2.99f

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1531
    .line 1532
    .line 1533
    const/high16 v4, 0x40200000    # 2.5f

    .line 1534
    .line 1535
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1536
    .line 1537
    .line 1538
    const/high16 v25, 0x40800000    # 4.0f

    .line 1539
    .line 1540
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 1541
    .line 1542
    const v21, 0x3fe8f5c3    # 1.82f

    .line 1543
    .line 1544
    .line 1545
    const v22, -0x43dc28f6    # -0.01f

    .line 1546
    .line 1547
    .line 1548
    const v23, 0x4038f5c3    # 2.89f

    .line 1549
    .line 1550
    .line 1551
    const v24, 0x3ec7ae14    # 0.39f

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1555
    .line 1556
    .line 1557
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1558
    .line 1559
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1563
    .line 1564
    .line 1565
    const v4, 0x40ab3333    # 5.35f

    .line 1566
    .line 1567
    .line 1568
    const/high16 v6, 0x41780000    # 15.5f

    .line 1569
    .line 1570
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1571
    .line 1572
    .line 1573
    const v25, 0x3f933333    # 1.15f

    .line 1574
    .line 1575
    .line 1576
    const v26, 0x3eb851ec    # 0.36f

    .line 1577
    .line 1578
    .line 1579
    const v21, 0x3f0ccccd    # 0.55f

    .line 1580
    .line 1581
    .line 1582
    const/16 v22, 0x0

    .line 1583
    .line 1584
    const v23, 0x3f47ae14    # 0.78f

    .line 1585
    .line 1586
    .line 1587
    const v24, 0x3e0f5c29    # 0.14f

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1591
    .line 1592
    .line 1593
    const v25, 0x400b851f    # 2.18f

    .line 1594
    .line 1595
    .line 1596
    const v26, 0x3f23d70a    # 0.64f

    .line 1597
    .line 1598
    .line 1599
    const v21, 0x3ee66666    # 0.45f

    .line 1600
    .line 1601
    .line 1602
    const v22, 0x3e8a3d71    # 0.27f

    .line 1603
    .line 1604
    .line 1605
    const v23, 0x3f88f5c3    # 1.07f

    .line 1606
    .line 1607
    .line 1608
    const v24, 0x3f23d70a    # 0.64f

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1612
    .line 1613
    .line 1614
    const v4, -0x40dc28f6    # -0.64f

    .line 1615
    .line 1616
    .line 1617
    const v6, -0x41428f5c    # -0.37f

    .line 1618
    .line 1619
    .line 1620
    const v7, 0x400b851f    # 2.18f

    .line 1621
    .line 1622
    .line 1623
    const v8, 0x3fdd70a4    # 1.73f

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1627
    .line 1628
    .line 1629
    const v25, 0x3f933333    # 1.15f

    .line 1630
    .line 1631
    .line 1632
    const v26, -0x4147ae14    # -0.36f

    .line 1633
    .line 1634
    .line 1635
    const v21, 0x3ebd70a4    # 0.37f

    .line 1636
    .line 1637
    .line 1638
    const v22, -0x41947ae1    # -0.23f

    .line 1639
    .line 1640
    .line 1641
    const v23, 0x3f170a3d    # 0.59f

    .line 1642
    .line 1643
    .line 1644
    const v24, -0x4147ae14    # -0.36f

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1648
    .line 1649
    .line 1650
    const v26, 0x3eb851ec    # 0.36f

    .line 1651
    .line 1652
    .line 1653
    const v21, 0x3f0ccccd    # 0.55f

    .line 1654
    .line 1655
    .line 1656
    const/16 v22, 0x0

    .line 1657
    .line 1658
    const v23, 0x3f47ae14    # 0.78f

    .line 1659
    .line 1660
    .line 1661
    const v24, 0x3e0f5c29    # 0.14f

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1665
    .line 1666
    .line 1667
    const v25, 0x400b851f    # 2.18f

    .line 1668
    .line 1669
    .line 1670
    const v26, 0x3f23d70a    # 0.64f

    .line 1671
    .line 1672
    .line 1673
    const v21, 0x3ee66666    # 0.45f

    .line 1674
    .line 1675
    .line 1676
    const v22, 0x3e8a3d71    # 0.27f

    .line 1677
    .line 1678
    .line 1679
    const v23, 0x3f88f5c3    # 1.07f

    .line 1680
    .line 1681
    .line 1682
    const v24, 0x3f23d70a    # 0.64f

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1689
    .line 1690
    .line 1691
    const v25, 0x3f933333    # 1.15f

    .line 1692
    .line 1693
    .line 1694
    const v26, -0x4147ae14    # -0.36f

    .line 1695
    .line 1696
    .line 1697
    const v21, 0x3ebd70a4    # 0.37f

    .line 1698
    .line 1699
    .line 1700
    const v22, -0x41947ae1    # -0.23f

    .line 1701
    .line 1702
    .line 1703
    const v23, 0x3f170a3d    # 0.59f

    .line 1704
    .line 1705
    .line 1706
    const v24, -0x4147ae14    # -0.36f

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1710
    .line 1711
    .line 1712
    const v26, 0x3eb851ec    # 0.36f

    .line 1713
    .line 1714
    .line 1715
    const v21, 0x3f0ccccd    # 0.55f

    .line 1716
    .line 1717
    .line 1718
    const/16 v22, 0x0

    .line 1719
    .line 1720
    const v23, 0x3f47ae14    # 0.78f

    .line 1721
    .line 1722
    .line 1723
    const v24, 0x3e0f5c29    # 0.14f

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1727
    .line 1728
    .line 1729
    const v25, 0x400a3d71    # 2.16f

    .line 1730
    .line 1731
    .line 1732
    const v26, 0x3f23d70a    # 0.64f

    .line 1733
    .line 1734
    .line 1735
    const v21, 0x3ee66666    # 0.45f

    .line 1736
    .line 1737
    .line 1738
    const v22, 0x3e8a3d71    # 0.27f

    .line 1739
    .line 1740
    .line 1741
    const v23, 0x3f87ae14    # 1.06f

    .line 1742
    .line 1743
    .line 1744
    const v24, 0x3f2147ae    # 0.63f

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1748
    .line 1749
    .line 1750
    const/high16 v4, -0x40000000    # -2.0f

    .line 1751
    .line 1752
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1753
    .line 1754
    .line 1755
    const v25, -0x406ccccd    # -1.15f

    .line 1756
    .line 1757
    .line 1758
    const v26, -0x4147ae14    # -0.36f

    .line 1759
    .line 1760
    .line 1761
    const v21, -0x40f33333    # -0.55f

    .line 1762
    .line 1763
    .line 1764
    const/16 v22, 0x0

    .line 1765
    .line 1766
    const v23, -0x40b851ec    # -0.78f

    .line 1767
    .line 1768
    .line 1769
    const v24, -0x41f0a3d7    # -0.14f

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1773
    .line 1774
    .line 1775
    const v25, -0x3ff47ae1    # -2.18f

    .line 1776
    .line 1777
    .line 1778
    const v26, -0x40dc28f6    # -0.64f

    .line 1779
    .line 1780
    .line 1781
    const v21, -0x4119999a    # -0.45f

    .line 1782
    .line 1783
    .line 1784
    const v22, -0x4175c28f    # -0.27f

    .line 1785
    .line 1786
    .line 1787
    const v23, -0x40770a3d    # -1.07f

    .line 1788
    .line 1789
    .line 1790
    const v24, -0x40dc28f6    # -0.64f

    .line 1791
    .line 1792
    .line 1793
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1794
    .line 1795
    .line 1796
    const v4, -0x3ff47ae1    # -2.18f

    .line 1797
    .line 1798
    .line 1799
    const v6, -0x40228f5c    # -1.73f

    .line 1800
    .line 1801
    .line 1802
    const v7, 0x3f23d70a    # 0.64f

    .line 1803
    .line 1804
    .line 1805
    const v8, 0x3ebd70a4    # 0.37f

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1809
    .line 1810
    .line 1811
    const v25, -0x406ccccd    # -1.15f

    .line 1812
    .line 1813
    .line 1814
    const v26, 0x3eb851ec    # 0.36f

    .line 1815
    .line 1816
    .line 1817
    const v21, -0x41428f5c    # -0.37f

    .line 1818
    .line 1819
    .line 1820
    const v22, 0x3e6b851f    # 0.23f

    .line 1821
    .line 1822
    .line 1823
    const v23, -0x40e66666    # -0.6f

    .line 1824
    .line 1825
    .line 1826
    const v24, 0x3eb851ec    # 0.36f

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1830
    .line 1831
    .line 1832
    const v4, -0x41f0a3d7    # -0.14f

    .line 1833
    .line 1834
    .line 1835
    const v6, -0x406ccccd    # -1.15f

    .line 1836
    .line 1837
    .line 1838
    const v7, -0x40b851ec    # -0.78f

    .line 1839
    .line 1840
    .line 1841
    const v8, -0x4147ae14    # -0.36f

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1845
    .line 1846
    .line 1847
    const v25, -0x3ff47ae1    # -2.18f

    .line 1848
    .line 1849
    .line 1850
    const v26, -0x40dc28f6    # -0.64f

    .line 1851
    .line 1852
    .line 1853
    const v21, -0x4119999a    # -0.45f

    .line 1854
    .line 1855
    .line 1856
    const v22, -0x4175c28f    # -0.27f

    .line 1857
    .line 1858
    .line 1859
    const v23, -0x40770a3d    # -1.07f

    .line 1860
    .line 1861
    .line 1862
    const v24, -0x40dc28f6    # -0.64f

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1866
    .line 1867
    .line 1868
    const v4, -0x3ff47ae1    # -2.18f

    .line 1869
    .line 1870
    .line 1871
    const v6, -0x40228f5c    # -1.73f

    .line 1872
    .line 1873
    .line 1874
    const v7, 0x3f23d70a    # 0.64f

    .line 1875
    .line 1876
    .line 1877
    const v8, 0x3ebd70a4    # 0.37f

    .line 1878
    .line 1879
    .line 1880
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1881
    .line 1882
    .line 1883
    const v25, -0x406ccccd    # -1.15f

    .line 1884
    .line 1885
    .line 1886
    const v26, 0x3eb851ec    # 0.36f

    .line 1887
    .line 1888
    .line 1889
    const v21, -0x41428f5c    # -0.37f

    .line 1890
    .line 1891
    .line 1892
    const v22, 0x3e6b851f    # 0.23f

    .line 1893
    .line 1894
    .line 1895
    const v23, -0x40e8f5c3    # -0.59f

    .line 1896
    .line 1897
    .line 1898
    const v24, 0x3eb851ec    # 0.36f

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1902
    .line 1903
    .line 1904
    const v26, -0x4147ae14    # -0.36f

    .line 1905
    .line 1906
    .line 1907
    const v21, -0x40f33333    # -0.55f

    .line 1908
    .line 1909
    .line 1910
    const/16 v22, 0x0

    .line 1911
    .line 1912
    const v23, -0x40b851ec    # -0.78f

    .line 1913
    .line 1914
    .line 1915
    const v24, -0x41f0a3d7    # -0.14f

    .line 1916
    .line 1917
    .line 1918
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1919
    .line 1920
    .line 1921
    const v25, -0x3ff47ae1    # -2.18f

    .line 1922
    .line 1923
    .line 1924
    const v26, -0x40dc28f6    # -0.64f

    .line 1925
    .line 1926
    .line 1927
    const v21, -0x4119999a    # -0.45f

    .line 1928
    .line 1929
    .line 1930
    const v22, -0x4175c28f    # -0.27f

    .line 1931
    .line 1932
    .line 1933
    const v23, -0x40770a3d    # -1.07f

    .line 1934
    .line 1935
    .line 1936
    const v24, -0x40dc28f6    # -0.64f

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1940
    .line 1941
    .line 1942
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1943
    .line 1944
    .line 1945
    const v25, -0x406ccccd    # -1.15f

    .line 1946
    .line 1947
    .line 1948
    const v26, 0x3eb851ec    # 0.36f

    .line 1949
    .line 1950
    .line 1951
    const v21, -0x41428f5c    # -0.37f

    .line 1952
    .line 1953
    .line 1954
    const v22, 0x3e6b851f    # 0.23f

    .line 1955
    .line 1956
    .line 1957
    const v23, -0x40e8f5c3    # -0.59f

    .line 1958
    .line 1959
    .line 1960
    const v24, 0x3eb851ec    # 0.36f

    .line 1961
    .line 1962
    .line 1963
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1964
    .line 1965
    .line 1966
    const/high16 v4, 0x40000000    # 2.0f

    .line 1967
    .line 1968
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1969
    .line 1970
    .line 1971
    const v25, 0x400ccccd    # 2.2f

    .line 1972
    .line 1973
    .line 1974
    const v26, -0x40dc28f6    # -0.64f

    .line 1975
    .line 1976
    .line 1977
    const v21, 0x3f8e147b    # 1.11f

    .line 1978
    .line 1979
    .line 1980
    const/16 v22, 0x0

    .line 1981
    .line 1982
    const v23, 0x3fdd70a4    # 1.73f

    .line 1983
    .line 1984
    .line 1985
    const v24, -0x41428f5c    # -0.37f

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1989
    .line 1990
    .line 1991
    const v25, 0x3f933333    # 1.15f

    .line 1992
    .line 1993
    .line 1994
    const v26, -0x4147ae14    # -0.36f

    .line 1995
    .line 1996
    .line 1997
    const v21, 0x3ebd70a4    # 0.37f

    .line 1998
    .line 1999
    .line 2000
    const v22, -0x41947ae1    # -0.23f

    .line 2001
    .line 2002
    .line 2003
    const v23, 0x3f19999a    # 0.6f

    .line 2004
    .line 2005
    .line 2006
    const v24, -0x4147ae14    # -0.36f

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2013
    .line 2014
    .line 2015
    const v4, 0x41955c29    # 18.67f

    .line 2016
    .line 2017
    .line 2018
    const/high16 v6, 0x41900000    # 18.0f

    .line 2019
    .line 2020
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2021
    .line 2022
    .line 2023
    const v25, -0x3ff47ae1    # -2.18f

    .line 2024
    .line 2025
    .line 2026
    const v26, 0x3f23d70a    # 0.64f

    .line 2027
    .line 2028
    .line 2029
    const v21, -0x4071eb85    # -1.11f

    .line 2030
    .line 2031
    .line 2032
    const/16 v22, 0x0

    .line 2033
    .line 2034
    const v23, -0x40228f5c    # -1.73f

    .line 2035
    .line 2036
    .line 2037
    const v24, 0x3ebd70a4    # 0.37f

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2041
    .line 2042
    .line 2043
    const v25, -0x406ccccd    # -1.15f

    .line 2044
    .line 2045
    .line 2046
    const v26, 0x3eb851ec    # 0.36f

    .line 2047
    .line 2048
    .line 2049
    const v21, -0x41428f5c    # -0.37f

    .line 2050
    .line 2051
    .line 2052
    const v22, 0x3e6b851f    # 0.23f

    .line 2053
    .line 2054
    .line 2055
    const v23, -0x40e66666    # -0.6f

    .line 2056
    .line 2057
    .line 2058
    const v24, 0x3eb851ec    # 0.36f

    .line 2059
    .line 2060
    .line 2061
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2062
    .line 2063
    .line 2064
    const v26, -0x4147ae14    # -0.36f

    .line 2065
    .line 2066
    .line 2067
    const v21, -0x40f33333    # -0.55f

    .line 2068
    .line 2069
    .line 2070
    const/16 v22, 0x0

    .line 2071
    .line 2072
    const v23, -0x40b851ec    # -0.78f

    .line 2073
    .line 2074
    .line 2075
    const v24, -0x41f0a3d7    # -0.14f

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2079
    .line 2080
    .line 2081
    const v25, -0x3ff47ae1    # -2.18f

    .line 2082
    .line 2083
    .line 2084
    const v26, -0x40dc28f6    # -0.64f

    .line 2085
    .line 2086
    .line 2087
    const v21, -0x4119999a    # -0.45f

    .line 2088
    .line 2089
    .line 2090
    const v22, -0x4175c28f    # -0.27f

    .line 2091
    .line 2092
    .line 2093
    const v23, -0x40770a3d    # -1.07f

    .line 2094
    .line 2095
    .line 2096
    const v24, -0x40dc28f6    # -0.64f

    .line 2097
    .line 2098
    .line 2099
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2100
    .line 2101
    .line 2102
    const v4, -0x3ff3d70a    # -2.19f

    .line 2103
    .line 2104
    .line 2105
    const v6, -0x40228f5c    # -1.73f

    .line 2106
    .line 2107
    .line 2108
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2109
    .line 2110
    .line 2111
    const v25, -0x406ccccd    # -1.15f

    .line 2112
    .line 2113
    .line 2114
    const v26, 0x3eb851ec    # 0.36f

    .line 2115
    .line 2116
    .line 2117
    const v21, -0x41428f5c    # -0.37f

    .line 2118
    .line 2119
    .line 2120
    const v22, 0x3e6b851f    # 0.23f

    .line 2121
    .line 2122
    .line 2123
    const v23, -0x40e8f5c3    # -0.59f

    .line 2124
    .line 2125
    .line 2126
    const v24, 0x3eb851ec    # 0.36f

    .line 2127
    .line 2128
    .line 2129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2130
    .line 2131
    .line 2132
    const v4, -0x406ccccd    # -1.15f

    .line 2133
    .line 2134
    .line 2135
    const v6, -0x40b851ec    # -0.78f

    .line 2136
    .line 2137
    .line 2138
    const v7, -0x41fae148    # -0.13f

    .line 2139
    .line 2140
    .line 2141
    const v8, -0x4147ae14    # -0.36f

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2145
    .line 2146
    .line 2147
    const v25, -0x3ff47ae1    # -2.18f

    .line 2148
    .line 2149
    .line 2150
    const v26, -0x40dc28f6    # -0.64f

    .line 2151
    .line 2152
    .line 2153
    const v21, -0x4119999a    # -0.45f

    .line 2154
    .line 2155
    .line 2156
    const v22, -0x4175c28f    # -0.27f

    .line 2157
    .line 2158
    .line 2159
    const v23, -0x40770a3d    # -1.07f

    .line 2160
    .line 2161
    .line 2162
    const v24, -0x40dc28f6    # -0.64f

    .line 2163
    .line 2164
    .line 2165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2166
    .line 2167
    .line 2168
    const v4, -0x3ff3d70a    # -2.19f

    .line 2169
    .line 2170
    .line 2171
    const v6, -0x40228f5c    # -1.73f

    .line 2172
    .line 2173
    .line 2174
    const v7, 0x3f23d70a    # 0.64f

    .line 2175
    .line 2176
    .line 2177
    const v8, 0x3ebd70a4    # 0.37f

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2181
    .line 2182
    .line 2183
    const v25, -0x406ccccd    # -1.15f

    .line 2184
    .line 2185
    .line 2186
    const v26, 0x3eb851ec    # 0.36f

    .line 2187
    .line 2188
    .line 2189
    const v21, -0x41428f5c    # -0.37f

    .line 2190
    .line 2191
    .line 2192
    const v22, 0x3e6b851f    # 0.23f

    .line 2193
    .line 2194
    .line 2195
    const v23, -0x40e8f5c3    # -0.59f

    .line 2196
    .line 2197
    .line 2198
    const v24, 0x3eb851ec    # 0.36f

    .line 2199
    .line 2200
    .line 2201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2202
    .line 2203
    .line 2204
    const/high16 v4, 0x40000000    # 2.0f

    .line 2205
    .line 2206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2207
    .line 2208
    .line 2209
    const v25, 0x400c28f6    # 2.19f

    .line 2210
    .line 2211
    .line 2212
    const v26, -0x40dc28f6    # -0.64f

    .line 2213
    .line 2214
    .line 2215
    const v21, 0x3f8e147b    # 1.11f

    .line 2216
    .line 2217
    .line 2218
    const/16 v22, 0x0

    .line 2219
    .line 2220
    const v23, 0x3fdd70a4    # 1.73f

    .line 2221
    .line 2222
    .line 2223
    const v24, -0x41428f5c    # -0.37f

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2227
    .line 2228
    .line 2229
    const v25, 0x3f933333    # 1.15f

    .line 2230
    .line 2231
    .line 2232
    const v26, -0x4147ae14    # -0.36f

    .line 2233
    .line 2234
    .line 2235
    const v21, 0x3ebd70a4    # 0.37f

    .line 2236
    .line 2237
    .line 2238
    const v22, -0x41947ae1    # -0.23f

    .line 2239
    .line 2240
    .line 2241
    const v23, 0x3f19999a    # 0.6f

    .line 2242
    .line 2243
    .line 2244
    const v24, -0x4147ae14    # -0.36f

    .line 2245
    .line 2246
    .line 2247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2248
    .line 2249
    .line 2250
    const v26, 0x3eb851ec    # 0.36f

    .line 2251
    .line 2252
    .line 2253
    const v21, 0x3f0ccccd    # 0.55f

    .line 2254
    .line 2255
    .line 2256
    const/16 v22, 0x0

    .line 2257
    .line 2258
    const v23, 0x3f47ae14    # 0.78f

    .line 2259
    .line 2260
    .line 2261
    const v24, 0x3e051eb8    # 0.13f

    .line 2262
    .line 2263
    .line 2264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2265
    .line 2266
    .line 2267
    const v25, 0x400b851f    # 2.18f

    .line 2268
    .line 2269
    .line 2270
    const v26, 0x3f23d70a    # 0.64f

    .line 2271
    .line 2272
    .line 2273
    const v21, 0x3ee66666    # 0.45f

    .line 2274
    .line 2275
    .line 2276
    const v22, 0x3e8a3d71    # 0.27f

    .line 2277
    .line 2278
    .line 2279
    const v23, 0x3f88f5c3    # 1.07f

    .line 2280
    .line 2281
    .line 2282
    const v24, 0x3f23d70a    # 0.64f

    .line 2283
    .line 2284
    .line 2285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2286
    .line 2287
    .line 2288
    const v4, 0x400c28f6    # 2.19f

    .line 2289
    .line 2290
    .line 2291
    const v6, -0x40dc28f6    # -0.64f

    .line 2292
    .line 2293
    .line 2294
    const v7, -0x41428f5c    # -0.37f

    .line 2295
    .line 2296
    .line 2297
    const v8, 0x3fdd70a4    # 1.73f

    .line 2298
    .line 2299
    .line 2300
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2301
    .line 2302
    .line 2303
    const v25, 0x3f933333    # 1.15f

    .line 2304
    .line 2305
    .line 2306
    const v26, -0x4147ae14    # -0.36f

    .line 2307
    .line 2308
    .line 2309
    const v21, 0x3ebd70a4    # 0.37f

    .line 2310
    .line 2311
    .line 2312
    const v22, -0x41947ae1    # -0.23f

    .line 2313
    .line 2314
    .line 2315
    const v23, 0x3f170a3d    # 0.59f

    .line 2316
    .line 2317
    .line 2318
    const v24, -0x4147ae14    # -0.36f

    .line 2319
    .line 2320
    .line 2321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2322
    .line 2323
    .line 2324
    const v26, 0x3eb851ec    # 0.36f

    .line 2325
    .line 2326
    .line 2327
    const v21, 0x3f0ccccd    # 0.55f

    .line 2328
    .line 2329
    .line 2330
    const/16 v22, 0x0

    .line 2331
    .line 2332
    const v23, 0x3f47ae14    # 0.78f

    .line 2333
    .line 2334
    .line 2335
    const v24, 0x3e0f5c29    # 0.14f

    .line 2336
    .line 2337
    .line 2338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2339
    .line 2340
    .line 2341
    const v25, 0x400b851f    # 2.18f

    .line 2342
    .line 2343
    .line 2344
    const v26, 0x3f23d70a    # 0.64f

    .line 2345
    .line 2346
    .line 2347
    const v21, 0x3ee66666    # 0.45f

    .line 2348
    .line 2349
    .line 2350
    const v22, 0x3e8a3d71    # 0.27f

    .line 2351
    .line 2352
    .line 2353
    const v23, 0x3f88f5c3    # 1.07f

    .line 2354
    .line 2355
    .line 2356
    const v24, 0x3f23d70a    # 0.64f

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2360
    .line 2361
    .line 2362
    const v4, 0x3fdc28f6    # 1.72f

    .line 2363
    .line 2364
    .line 2365
    const v8, 0x400b851f    # 2.18f

    .line 2366
    .line 2367
    .line 2368
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2369
    .line 2370
    .line 2371
    const v25, 0x3f933333    # 1.15f

    .line 2372
    .line 2373
    .line 2374
    const v26, -0x4147ae14    # -0.36f

    .line 2375
    .line 2376
    .line 2377
    const v21, 0x3ebd70a4    # 0.37f

    .line 2378
    .line 2379
    .line 2380
    const v22, -0x41947ae1    # -0.23f

    .line 2381
    .line 2382
    .line 2383
    const v23, 0x3f170a3d    # 0.59f

    .line 2384
    .line 2385
    .line 2386
    const v24, -0x4147ae14    # -0.36f

    .line 2387
    .line 2388
    .line 2389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2390
    .line 2391
    .line 2392
    const v26, 0x3eb851ec    # 0.36f

    .line 2393
    .line 2394
    .line 2395
    const v21, 0x3f0ccccd    # 0.55f

    .line 2396
    .line 2397
    .line 2398
    const/16 v22, 0x0

    .line 2399
    .line 2400
    const v23, 0x3f47ae14    # 0.78f

    .line 2401
    .line 2402
    .line 2403
    const v24, 0x3e0f5c29    # 0.14f

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2407
    .line 2408
    .line 2409
    const v25, 0x400b851f    # 2.18f

    .line 2410
    .line 2411
    .line 2412
    const v26, 0x3f23d70a    # 0.64f

    .line 2413
    .line 2414
    .line 2415
    const v21, 0x3ee66666    # 0.45f

    .line 2416
    .line 2417
    .line 2418
    const v22, 0x3e8a3d71    # 0.27f

    .line 2419
    .line 2420
    .line 2421
    const v23, 0x3f88f5c3    # 1.07f

    .line 2422
    .line 2423
    .line 2424
    const v24, 0x3f23d70a    # 0.64f

    .line 2425
    .line 2426
    .line 2427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2428
    .line 2429
    .line 2430
    const/high16 v4, -0x40000000    # -2.0f

    .line 2431
    .line 2432
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2433
    .line 2434
    .line 2435
    const v25, -0x406ccccd    # -1.15f

    .line 2436
    .line 2437
    .line 2438
    const v26, -0x4147ae14    # -0.36f

    .line 2439
    .line 2440
    .line 2441
    const v21, -0x40f0a3d7    # -0.56f

    .line 2442
    .line 2443
    .line 2444
    const/16 v22, 0x0

    .line 2445
    .line 2446
    const v23, -0x40b851ec    # -0.78f

    .line 2447
    .line 2448
    .line 2449
    const v24, -0x41fae148    # -0.13f

    .line 2450
    .line 2451
    .line 2452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2453
    .line 2454
    .line 2455
    const v25, -0x3ff47ae1    # -2.18f

    .line 2456
    .line 2457
    .line 2458
    const v26, -0x40dc28f6    # -0.64f

    .line 2459
    .line 2460
    .line 2461
    const v21, -0x4119999a    # -0.45f

    .line 2462
    .line 2463
    .line 2464
    const v22, -0x4175c28f    # -0.27f

    .line 2465
    .line 2466
    .line 2467
    const v23, -0x40770a3d    # -1.07f

    .line 2468
    .line 2469
    .line 2470
    const v24, -0x40dc28f6    # -0.64f

    .line 2471
    .line 2472
    .line 2473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2474
    .line 2475
    .line 2476
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2477
    .line 2478
    .line 2479
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v2

    .line 2483
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2484
    .line 2485
    const/high16 v8, 0x3f800000    # 1.0f

    .line 2486
    .line 2487
    const/4 v7, 0x0

    .line 2488
    const-string v4, ""

    .line 2489
    .line 2490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2491
    .line 2492
    .line 2493
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2494
    .line 2495
    .line 2496
    move-result v3

    .line 2497
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2498
    .line 2499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2500
    .line 2501
    .line 2502
    move-result-wide v6

    .line 2503
    const/4 v0, 0x0

    .line 2504
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2505
    .line 2506
    .line 2507
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2508
    .line 2509
    .line 2510
    move-result v10

    .line 2511
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2512
    .line 2513
    .line 2514
    move-result v11

    .line 2515
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2516
    .line 2517
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2518
    .line 2519
    .line 2520
    const/high16 v0, 0x40b00000    # 5.5f

    .line 2521
    .line 2522
    const/high16 v2, 0x41840000    # 16.5f

    .line 2523
    .line 2524
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2525
    .line 2526
    .line 2527
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 2528
    .line 2529
    const/4 v2, 0x0

    .line 2530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2531
    .line 2532
    .line 2533
    const/high16 v18, 0x40a00000    # 5.0f

    .line 2534
    .line 2535
    const/16 v19, 0x0

    .line 2536
    .line 2537
    const/high16 v13, 0x40200000    # 2.5f

    .line 2538
    .line 2539
    const/high16 v14, 0x40200000    # 2.5f

    .line 2540
    .line 2541
    const/16 v16, 0x1

    .line 2542
    .line 2543
    const/16 v17, 0x1

    .line 2544
    .line 2545
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2546
    .line 2547
    .line 2548
    const/high16 v18, -0x3f600000    # -5.0f

    .line 2549
    .line 2550
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2551
    .line 2552
    .line 2553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v2

    .line 2557
    const/16 v16, 0x3800

    .line 2558
    .line 2559
    const/16 v17, 0x0

    .line 2560
    .line 2561
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2562
    .line 2563
    const/4 v7, 0x0

    .line 2564
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2565
    .line 2566
    const/4 v13, 0x0

    .line 2567
    const/4 v14, 0x0

    .line 2568
    const-string v4, ""

    .line 2569
    .line 2570
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v0

    .line 2574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v0

    .line 2578
    sput-object v0, Landroidx/compose/material/icons/twotone/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2579
    .line 2580
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2581
    .line 2582
    .line 2583
    return-object v0
.end method
