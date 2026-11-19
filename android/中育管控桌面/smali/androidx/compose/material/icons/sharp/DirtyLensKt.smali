.class public final Landroidx/compose/material/icons/sharp/DirtyLensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_dirtyLens",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirtyLens",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getDirtyLens",
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
        "SMAP\nDirtyLens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/sharp/DirtyLensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/sharp/DirtyLensKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"
    }
.end annotation


# static fields
.field private static _dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirtyLens(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.DirtyLens"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f5a8f5c    # -5.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x41700000    # 15.0f

    .line 84
    .line 85
    const/high16 v2, 0x40400000    # 3.0f

    .line 86
    .line 87
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x41100000    # 9.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x40e570a4    # 7.17f

    .line 96
    .line 97
    .line 98
    const/high16 v2, 0x40a00000    # 5.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41800000    # 16.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, 0x41a00000    # 20.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v0, 0x40a00000    # 5.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x418547ae    # 16.66f

    .line 127
    .line 128
    .line 129
    const v2, 0x4184a3d7    # 16.58f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x3f8c28f6    # -3.81f

    .line 136
    .line 137
    .line 138
    const v18, 0x3db851ec    # 0.09f

    .line 139
    .line 140
    .line 141
    const v13, -0x406e147b    # -1.14f

    .line 142
    .line 143
    .line 144
    const v14, 0x3fee147b    # 1.86f

    .line 145
    .line 146
    .line 147
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 148
    .line 149
    const v16, -0x407c28f6    # -1.03f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3e051eb8    # 0.13f

    .line 156
    .line 157
    .line 158
    const v18, 0x40151eb8    # 2.33f

    .line 159
    .line 160
    .line 161
    const v13, -0x413851ec    # -0.39f

    .line 162
    .line 163
    .line 164
    const v14, 0x3f11eb85    # 0.57f

    .line 165
    .line 166
    .line 167
    const v15, -0x4247ae14    # -0.09f

    .line 168
    .line 169
    .line 170
    const v16, 0x3fbeb852    # 1.49f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x40a66666    # -0.85f

    .line 177
    .line 178
    .line 179
    const v18, 0x3f59999a    # 0.85f

    .line 180
    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const v14, 0x3ef0a3d7    # 0.47f

    .line 184
    .line 185
    .line 186
    const v15, -0x413d70a4    # -0.38f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f59999a    # 0.85f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, -0x40a3d70a    # -0.86f

    .line 196
    .line 197
    .line 198
    const v18, -0x40a66666    # -0.85f

    .line 199
    .line 200
    .line 201
    const v13, -0x410f5c29    # -0.47f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const v15, -0x40a3d70a    # -0.86f

    .line 206
    .line 207
    .line 208
    const v16, -0x413d70a4    # -0.38f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x41dc28f6    # -0.16f

    .line 215
    .line 216
    .line 217
    const v18, -0x3fe47ae1    # -2.43f

    .line 218
    .line 219
    .line 220
    const v13, 0x3e0f5c29    # 0.14f

    .line 221
    .line 222
    .line 223
    const v14, -0x40851eb8    # -0.98f

    .line 224
    .line 225
    .line 226
    const v15, 0x3ed70a3d    # 0.42f

    .line 227
    .line 228
    .line 229
    const v16, -0x3ffccccd    # -2.05f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x3fcccccd    # -2.8f

    .line 236
    .line 237
    .line 238
    const v18, 0x3faccccd    # 1.35f

    .line 239
    .line 240
    .line 241
    const v13, -0x409c28f6    # -0.89f

    .line 242
    .line 243
    .line 244
    const v14, -0x40e8f5c3    # -0.59f

    .line 245
    .line 246
    .line 247
    const v15, -0x405d70a4    # -1.27f

    .line 248
    .line 249
    .line 250
    const v16, 0x4003d70a    # 2.06f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x3f000000    # 0.5f

    .line 257
    .line 258
    const v18, -0x3faeb852    # -3.27f

    .line 259
    .line 260
    .line 261
    const v13, -0x404e147b    # -1.39f

    .line 262
    .line 263
    .line 264
    const v14, -0x4070a3d7    # -1.12f

    .line 265
    .line 266
    .line 267
    const v15, 0x3f866666    # 1.05f

    .line 268
    .line 269
    .line 270
    const v16, -0x405ae148    # -1.29f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x3fe66666    # -2.4f

    .line 277
    .line 278
    .line 279
    const v18, -0x406147ae    # -1.24f

    .line 280
    .line 281
    .line 282
    const v13, -0x419eb852    # -0.22f

    .line 283
    .line 284
    .line 285
    const v14, -0x40b5c28f    # -0.79f

    .line 286
    .line 287
    .line 288
    const v15, -0x3fee147b    # -2.28f

    .line 289
    .line 290
    .line 291
    const v16, 0x3eb851ec    # 0.36f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3fc147ae    # 1.51f

    .line 298
    .line 299
    .line 300
    const v18, -0x404147ae    # -1.49f

    .line 301
    .line 302
    .line 303
    const v13, -0x425c28f6    # -0.08f

    .line 304
    .line 305
    .line 306
    const/high16 v14, -0x40800000    # -1.0f

    .line 307
    .line 308
    const v15, 0x3fbeb852    # 1.49f

    .line 309
    .line 310
    .line 311
    const v16, -0x40c28f5c    # -0.74f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, -0x41800000    # -0.25f

    .line 318
    .line 319
    const v18, -0x400b851f    # -1.91f

    .line 320
    .line 321
    .line 322
    const v13, 0x3cf5c28f    # 0.03f

    .line 323
    .line 324
    .line 325
    const/high16 v14, -0x40c00000    # -0.75f

    .line 326
    .line 327
    const v15, -0x407c28f6    # -1.03f

    .line 328
    .line 329
    .line 330
    const v16, -0x4079999a    # -1.05f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3f68f5c3    # 0.91f

    .line 337
    .line 338
    .line 339
    const v18, -0x41bd70a4    # -0.19f

    .line 340
    .line 341
    .line 342
    const v13, 0x3e6147ae    # 0.22f

    .line 343
    .line 344
    .line 345
    const v14, -0x418a3d71    # -0.24f

    .line 346
    .line 347
    .line 348
    const v15, 0x3f35c28f    # 0.71f

    .line 349
    .line 350
    .line 351
    const v16, -0x417ae148    # -0.26f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x4020a3d7    # 2.51f

    .line 358
    .line 359
    .line 360
    const v18, 0x3f9851ec    # 1.19f

    .line 361
    .line 362
    .line 363
    const v13, 0x3f4a3d71    # 0.79f

    .line 364
    .line 365
    .line 366
    const v14, 0x3e8a3d71    # 0.27f

    .line 367
    .line 368
    .line 369
    const v15, 0x3fc66666    # 1.55f

    .line 370
    .line 371
    .line 372
    const v16, 0x3fe8f5c3    # 1.82f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, -0x3fc8f5c3    # -2.86f

    .line 381
    .line 382
    .line 383
    const v13, 0x3f83d70a    # 1.03f

    .line 384
    .line 385
    .line 386
    const v14, -0x40d70a3d    # -0.66f

    .line 387
    .line 388
    .line 389
    const v15, -0x400f5c29    # -1.88f

    .line 390
    .line 391
    .line 392
    const v16, -0x3fe9999a    # -2.35f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x4029999a    # 2.65f

    .line 399
    .line 400
    .line 401
    const v18, 0x401c28f6    # 2.44f

    .line 402
    .line 403
    .line 404
    const v13, 0x3fd1eb85    # 1.64f

    .line 405
    .line 406
    .line 407
    const v14, -0x411eb852    # -0.44f

    .line 408
    .line 409
    .line 410
    const v15, 0x3fa7ae14    # 1.31f

    .line 411
    .line 412
    .line 413
    const v16, 0x40051eb8    # 2.08f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x408d1eb8    # 4.41f

    .line 420
    .line 421
    .line 422
    const v18, -0x3feae148    # -2.33f

    .line 423
    .line 424
    .line 425
    const v13, 0x3ff851ec    # 1.94f

    .line 426
    .line 427
    .line 428
    const v14, 0x3f051eb8    # 0.52f

    .line 429
    .line 430
    .line 431
    const v15, 0x4029999a    # 2.65f

    .line 432
    .line 433
    .line 434
    const v16, -0x3f6e6666    # -4.55f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x3fc9999a    # -2.85f

    .line 441
    .line 442
    .line 443
    const v18, 0x408051ec    # 4.01f

    .line 444
    .line 445
    .line 446
    const v13, 0x3feccccd    # 1.85f

    .line 447
    .line 448
    .line 449
    const v14, 0x40151eb8    # 2.33f

    .line 450
    .line 451
    .line 452
    const v15, -0x3fa47ae1    # -3.43f

    .line 453
    .line 454
    .line 455
    const v16, 0x401147ae    # 2.27f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, 0x4030a3d7    # 2.76f

    .line 462
    .line 463
    .line 464
    const v18, 0x3f07ae14    # 0.53f

    .line 465
    .line 466
    .line 467
    const v13, 0x3eae147b    # 0.34f

    .line 468
    .line 469
    .line 470
    const v14, 0x3f8147ae    # 1.01f

    .line 471
    .line 472
    .line 473
    const v15, 0x4009999a    # 2.15f

    .line 474
    .line 475
    .line 476
    const v16, -0x40666666    # -1.2f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x3fbd70a4    # -3.04f

    .line 483
    .line 484
    .line 485
    const v18, 0x3fd47ae1    # 1.66f

    .line 486
    .line 487
    .line 488
    const v13, 0x3f23d70a    # 0.64f

    .line 489
    .line 490
    .line 491
    const v14, 0x3fea3d71    # 1.83f

    .line 492
    .line 493
    .line 494
    const v15, -0x3fba3d71    # -3.09f

    .line 495
    .line 496
    .line 497
    const v16, 0x3f51eb85    # 0.82f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x418547ae    # 16.66f

    .line 504
    .line 505
    .line 506
    const v18, 0x4184a3d7    # 16.58f

    .line 507
    .line 508
    .line 509
    const v13, 0x417147ae    # 15.08f

    .line 510
    .line 511
    .line 512
    const v14, 0x4174a3d7    # 15.29f

    .line 513
    .line 514
    .line 515
    const v15, 0x418b70a4    # 17.43f

    .line 516
    .line 517
    .line 518
    const v16, 0x417028f6    # 15.01f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x41911eb8    # 18.14f

    .line 528
    .line 529
    .line 530
    const v2, 0x4190147b    # 18.01f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, -0x40a3d70a    # -0.86f

    .line 537
    .line 538
    .line 539
    const v18, -0x40a3d70a    # -0.86f

    .line 540
    .line 541
    .line 542
    const v13, -0x410f5c29    # -0.47f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const v15, -0x40a3d70a    # -0.86f

    .line 547
    .line 548
    .line 549
    const v16, -0x413d70a4    # -0.38f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3ec28f5c    # 0.38f

    .line 556
    .line 557
    .line 558
    const v2, 0x3f5c28f6    # 0.86f

    .line 559
    .line 560
    .line 561
    const v4, -0x40a3d70a    # -0.86f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x3f5c28f6    # 0.86f

    .line 568
    .line 569
    .line 570
    const v18, 0x3f5c28f6    # 0.86f

    .line 571
    .line 572
    .line 573
    const v13, 0x3ef0a3d7    # 0.47f

    .line 574
    .line 575
    .line 576
    const v15, 0x3f5c28f6    # 0.86f

    .line 577
    .line 578
    .line 579
    const v16, 0x3ec28f5c    # 0.38f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x4194f5c3    # 18.62f

    .line 586
    .line 587
    .line 588
    const v2, 0x41911eb8    # 18.14f

    .line 589
    .line 590
    .line 591
    const v4, 0x4190147b    # 18.01f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    const/16 v16, 0x3800

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const/high16 v6, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/high16 v8, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v7, 0x0

    .line 613
    const/high16 v9, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v12, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    const/4 v15, 0x0

    .line 619
    const-string v4, ""

    .line 620
    .line 621
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    sput-object v0, Landroidx/compose/material/icons/sharp/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    return-object v0
.end method
