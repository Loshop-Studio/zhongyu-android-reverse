.class public final Landroidx/compose/material/icons/filled/DirtyLensKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getDirtyLens",
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
        "SMAP\nDirtyLens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/filled/DirtyLensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/filled/DirtyLensKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirtyLens(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DirtyLens"

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
    const v0, 0x414f3333    # 12.95f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41980000    # 19.0f

    .line 79
    .line 80
    const/high16 v2, 0x41a00000    # 20.0f

    .line 81
    .line 82
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x40e00000    # 7.0f

    .line 86
    .line 87
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x40800000    # 4.0f

    .line 91
    .line 92
    const/high16 v2, 0x40e00000    # 7.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x40e7ae14    # 7.24f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, -0x41dc28f6    # -0.16f

    .line 109
    .line 110
    .line 111
    const v18, -0x3fe47ae1    # -2.43f

    .line 112
    .line 113
    .line 114
    const v13, 0x3e0f5c29    # 0.14f

    .line 115
    .line 116
    .line 117
    const v14, -0x40851eb8    # -0.98f

    .line 118
    .line 119
    .line 120
    const v15, 0x3ed70a3d    # 0.42f

    .line 121
    .line 122
    .line 123
    const v16, -0x3ffccccd    # -2.05f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, -0x3fcccccd    # -2.8f

    .line 130
    .line 131
    .line 132
    const v18, 0x3faccccd    # 1.35f

    .line 133
    .line 134
    .line 135
    const v13, -0x409c28f6    # -0.89f

    .line 136
    .line 137
    .line 138
    const v14, -0x40e8f5c3    # -0.59f

    .line 139
    .line 140
    .line 141
    const v15, -0x405d70a4    # -1.27f

    .line 142
    .line 143
    .line 144
    const v16, 0x4003d70a    # 2.06f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x3f000000    # 0.5f

    .line 151
    .line 152
    const v18, -0x3faeb852    # -3.27f

    .line 153
    .line 154
    .line 155
    const v13, -0x404e147b    # -1.39f

    .line 156
    .line 157
    .line 158
    const v14, -0x4070a3d7    # -1.12f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f866666    # 1.05f

    .line 162
    .line 163
    .line 164
    const v16, -0x405ae148    # -1.29f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x3fe66666    # -2.4f

    .line 171
    .line 172
    .line 173
    const v18, -0x406147ae    # -1.24f

    .line 174
    .line 175
    .line 176
    const v13, -0x419eb852    # -0.22f

    .line 177
    .line 178
    .line 179
    const v14, -0x40b5c28f    # -0.79f

    .line 180
    .line 181
    .line 182
    const v15, -0x3fee147b    # -2.28f

    .line 183
    .line 184
    .line 185
    const v16, 0x3eb851ec    # 0.36f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3fc147ae    # 1.51f

    .line 192
    .line 193
    .line 194
    const v18, -0x404147ae    # -1.49f

    .line 195
    .line 196
    .line 197
    const v13, -0x425c28f6    # -0.08f

    .line 198
    .line 199
    .line 200
    const/high16 v14, -0x40800000    # -1.0f

    .line 201
    .line 202
    const v15, 0x3fbeb852    # 1.49f

    .line 203
    .line 204
    .line 205
    const v16, -0x40c28f5c    # -0.74f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x41800000    # -0.25f

    .line 212
    .line 213
    const v18, -0x400b851f    # -1.91f

    .line 214
    .line 215
    .line 216
    const v13, 0x3cf5c28f    # 0.03f

    .line 217
    .line 218
    .line 219
    const/high16 v14, -0x40c00000    # -0.75f

    .line 220
    .line 221
    const v15, -0x407c28f6    # -1.03f

    .line 222
    .line 223
    .line 224
    const v16, -0x4079999a    # -1.05f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f68f5c3    # 0.91f

    .line 231
    .line 232
    .line 233
    const v18, -0x41bd70a4    # -0.19f

    .line 234
    .line 235
    .line 236
    const v13, 0x3e6147ae    # 0.22f

    .line 237
    .line 238
    .line 239
    const v14, -0x418a3d71    # -0.24f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f35c28f    # 0.71f

    .line 243
    .line 244
    .line 245
    const v16, -0x417ae148    # -0.26f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x4020a3d7    # 2.51f

    .line 252
    .line 253
    .line 254
    const v18, 0x3f9851ec    # 1.19f

    .line 255
    .line 256
    .line 257
    const v13, 0x3f4a3d71    # 0.79f

    .line 258
    .line 259
    .line 260
    const v14, 0x3e8a3d71    # 0.27f

    .line 261
    .line 262
    .line 263
    const v15, 0x3fc66666    # 1.55f

    .line 264
    .line 265
    .line 266
    const v16, 0x3fe8f5c3    # 1.82f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const v18, -0x3fc8f5c3    # -2.86f

    .line 275
    .line 276
    .line 277
    const v13, 0x3f83d70a    # 1.03f

    .line 278
    .line 279
    .line 280
    const v14, -0x40d70a3d    # -0.66f

    .line 281
    .line 282
    .line 283
    const v15, -0x400f5c29    # -1.88f

    .line 284
    .line 285
    .line 286
    const v16, -0x3fe9999a    # -2.35f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x4029999a    # 2.65f

    .line 293
    .line 294
    .line 295
    const v18, 0x401c28f6    # 2.44f

    .line 296
    .line 297
    .line 298
    const v13, 0x3fd1eb85    # 1.64f

    .line 299
    .line 300
    .line 301
    const v14, -0x411eb852    # -0.44f

    .line 302
    .line 303
    .line 304
    const v15, 0x3fa7ae14    # 1.31f

    .line 305
    .line 306
    .line 307
    const v16, 0x40051eb8    # 2.08f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, 0x408d1eb8    # 4.41f

    .line 314
    .line 315
    .line 316
    const v18, -0x3feae148    # -2.33f

    .line 317
    .line 318
    .line 319
    const v13, 0x3ff851ec    # 1.94f

    .line 320
    .line 321
    .line 322
    const v14, 0x3f051eb8    # 0.52f

    .line 323
    .line 324
    .line 325
    const v15, 0x4029999a    # 2.65f

    .line 326
    .line 327
    .line 328
    const v16, -0x3f6e6666    # -4.55f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x3fc9999a    # -2.85f

    .line 335
    .line 336
    .line 337
    const v18, 0x408051ec    # 4.01f

    .line 338
    .line 339
    .line 340
    const v13, 0x3feccccd    # 1.85f

    .line 341
    .line 342
    .line 343
    const v14, 0x40151eb8    # 2.33f

    .line 344
    .line 345
    .line 346
    const v15, -0x3fa47ae1    # -3.43f

    .line 347
    .line 348
    .line 349
    const v16, 0x401147ae    # 2.27f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x4030a3d7    # 2.76f

    .line 356
    .line 357
    .line 358
    const v18, 0x3f07ae14    # 0.53f

    .line 359
    .line 360
    .line 361
    const v13, 0x3eae147b    # 0.34f

    .line 362
    .line 363
    .line 364
    const v14, 0x3f8147ae    # 1.01f

    .line 365
    .line 366
    .line 367
    const v15, 0x4009999a    # 2.15f

    .line 368
    .line 369
    .line 370
    const v16, -0x40666666    # -1.2f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x3fbd70a4    # -3.04f

    .line 377
    .line 378
    .line 379
    const v18, 0x3fd47ae1    # 1.66f

    .line 380
    .line 381
    .line 382
    const v13, 0x3f23d70a    # 0.64f

    .line 383
    .line 384
    .line 385
    const v14, 0x3fea3d71    # 1.83f

    .line 386
    .line 387
    .line 388
    const v15, -0x3fba3d71    # -3.09f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f51eb85    # 0.82f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x3fd1eb85    # 1.64f

    .line 398
    .line 399
    .line 400
    const v18, 0x4007ae14    # 2.12f

    .line 401
    .line 402
    .line 403
    const v13, 0x3d75c28f    # 0.06f

    .line 404
    .line 405
    .line 406
    const v14, 0x3f547ae1    # 0.83f

    .line 407
    .line 408
    .line 409
    const v15, 0x401a3d71    # 2.41f

    .line 410
    .line 411
    .line 412
    const v16, 0x3f0ccccd    # 0.55f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x3f8c28f6    # -3.81f

    .line 419
    .line 420
    .line 421
    const v18, 0x3db851ec    # 0.09f

    .line 422
    .line 423
    .line 424
    const v13, -0x406e147b    # -1.14f

    .line 425
    .line 426
    .line 427
    const v14, 0x3fee147b    # 1.86f

    .line 428
    .line 429
    .line 430
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 431
    .line 432
    const v16, -0x407c28f6    # -1.03f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x3e051eb8    # 0.13f

    .line 439
    .line 440
    .line 441
    const v18, 0x40151eb8    # 2.33f

    .line 442
    .line 443
    .line 444
    const v13, -0x413851ec    # -0.39f

    .line 445
    .line 446
    .line 447
    const v14, 0x3f11eb85    # 0.57f

    .line 448
    .line 449
    .line 450
    const v15, -0x4247ae14    # -0.09f

    .line 451
    .line 452
    .line 453
    const v16, 0x3fbeb852    # 1.49f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40a00000    # 5.0f

    .line 463
    .line 464
    const/high16 v2, 0x41a00000    # 20.0f

    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x40000000    # 2.0f

    .line 470
    .line 471
    const/high16 v18, 0x40000000    # 2.0f

    .line 472
    .line 473
    const v13, 0x3f8ccccd    # 1.1f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const/high16 v15, 0x40000000    # 2.0f

    .line 478
    .line 479
    const v16, 0x3f666666    # 0.9f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41400000    # 12.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40000000    # -2.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, 0x3f8ccccd    # 1.1f

    .line 494
    .line 495
    .line 496
    const v15, -0x4099999a    # -0.9f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x40000000    # 2.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41a80000    # 21.0f

    .line 505
    .line 506
    const/high16 v2, 0x40800000    # 4.0f

    .line 507
    .line 508
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v18, -0x40000000    # -2.0f

    .line 512
    .line 513
    const v13, -0x40733333    # -1.1f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const/high16 v15, -0x40000000    # -2.0f

    .line 518
    .line 519
    const v16, -0x4099999a    # -0.9f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/high16 v2, 0x40e00000    # 7.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x40000000    # 2.0f

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, -0x40733333    # -1.1f

    .line 536
    .line 537
    .line 538
    const v15, 0x3f666666    # 0.9f

    .line 539
    .line 540
    .line 541
    const/high16 v16, -0x40000000    # -2.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x404ae148    # 3.17f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41100000    # 9.0f

    .line 553
    .line 554
    const/high16 v2, 0x40400000    # 3.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40c00000    # 6.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x3fea3d71    # 1.83f

    .line 565
    .line 566
    .line 567
    const/high16 v2, 0x40000000    # 2.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x40a00000    # 5.0f

    .line 573
    .line 574
    const/high16 v2, 0x41a00000    # 20.0f

    .line 575
    .line 576
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x41911eb8    # 18.14f

    .line 583
    .line 584
    .line 585
    const v2, 0x4190147b    # 18.01f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x40a3d70a    # -0.86f

    .line 592
    .line 593
    .line 594
    const v18, -0x40a3d70a    # -0.86f

    .line 595
    .line 596
    .line 597
    const v13, -0x410f5c29    # -0.47f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const v15, -0x40a3d70a    # -0.86f

    .line 602
    .line 603
    .line 604
    const v16, -0x413d70a4    # -0.38f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x3ec28f5c    # 0.38f

    .line 611
    .line 612
    .line 613
    const v2, 0x3f5c28f6    # 0.86f

    .line 614
    .line 615
    .line 616
    const v4, -0x40a3d70a    # -0.86f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x3f5c28f6    # 0.86f

    .line 623
    .line 624
    .line 625
    const v18, 0x3f5c28f6    # 0.86f

    .line 626
    .line 627
    .line 628
    const v13, 0x3ef0a3d7    # 0.47f

    .line 629
    .line 630
    .line 631
    const v15, 0x3f5c28f6    # 0.86f

    .line 632
    .line 633
    .line 634
    const v16, 0x3ec28f5c    # 0.38f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, -0x413d70a4    # -0.38f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/high16 v8, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v15, 0x0

    .line 668
    const-string v4, ""

    .line 669
    .line 670
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    sput-object v0, Landroidx/compose/material/icons/filled/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    return-object v0
.end method
