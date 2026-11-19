.class public final Landroidx/compose/material/icons/twotone/DirtyLensKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirtyLens",
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
        "SMAP\nDirtyLens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/twotone/DirtyLensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,123:1\n212#2,12:124\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n174#3:136\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n72#5,4:159\n72#5,4:197\n72#5,4:235\n*S KotlinDebug\n*F\n+ 1 DirtyLens.kt\nandroidx/compose/material/icons/twotone/DirtyLensKt\n*L\n29#1:124,12\n30#1:137,18\n30#1:174\n66#1:175,18\n66#1:212\n110#1:213,18\n110#1:250\n29#1:136\n30#1:155,2\n30#1:157,2\n30#1:163,11\n66#1:193,2\n66#1:195,2\n66#1:201,11\n110#1:231,2\n110#1:233,2\n110#1:239,11\n30#1:159,4\n66#1:197,4\n110#1:235,4\n*E\n"
    }
.end annotation


# static fields
.field private static _dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirtyLens(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirtyLens"

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
    const v4, 0x4161eb85    # 14.12f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x411e147b    # 9.88f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v4, 0x4100cccd    # 8.05f

    .line 85
    .line 86
    .line 87
    const/high16 v6, 0x40e00000    # 7.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40800000    # 4.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x40e8a3d7    # 7.27f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x41dc28f6    # -0.16f

    .line 109
    .line 110
    .line 111
    const v26, -0x3fe47ae1    # -2.43f

    .line 112
    .line 113
    .line 114
    const v21, 0x3e0f5c29    # 0.14f

    .line 115
    .line 116
    .line 117
    const v22, -0x40851eb8    # -0.98f

    .line 118
    .line 119
    .line 120
    const v23, 0x3ed70a3d    # 0.42f

    .line 121
    .line 122
    .line 123
    const v24, -0x3ffccccd    # -2.05f

    .line 124
    .line 125
    .line 126
    move-object/from16 v20, v2

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, -0x3fcccccd    # -2.8f

    .line 132
    .line 133
    .line 134
    const v26, 0x3faccccd    # 1.35f

    .line 135
    .line 136
    .line 137
    const v21, -0x409c28f6    # -0.89f

    .line 138
    .line 139
    .line 140
    const v22, -0x40e8f5c3    # -0.59f

    .line 141
    .line 142
    .line 143
    const v23, -0x405d70a4    # -1.27f

    .line 144
    .line 145
    .line 146
    const v24, 0x4003d70a    # 2.06f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x3f000000    # 0.5f

    .line 153
    .line 154
    const v26, -0x3faeb852    # -3.27f

    .line 155
    .line 156
    .line 157
    const v21, -0x404e147b    # -1.39f

    .line 158
    .line 159
    .line 160
    const v22, -0x4070a3d7    # -1.12f

    .line 161
    .line 162
    .line 163
    const v23, 0x3f866666    # 1.05f

    .line 164
    .line 165
    .line 166
    const v24, -0x405ae148    # -1.29f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x3fe66666    # -2.4f

    .line 173
    .line 174
    .line 175
    const v26, -0x406147ae    # -1.24f

    .line 176
    .line 177
    .line 178
    const v21, -0x419eb852    # -0.22f

    .line 179
    .line 180
    .line 181
    const v22, -0x40b5c28f    # -0.79f

    .line 182
    .line 183
    .line 184
    const v23, -0x3fee147b    # -2.28f

    .line 185
    .line 186
    .line 187
    const v24, 0x3eb851ec    # 0.36f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v25, 0x3fc147ae    # 1.51f

    .line 194
    .line 195
    .line 196
    const v26, -0x404147ae    # -1.49f

    .line 197
    .line 198
    .line 199
    const v21, -0x425c28f6    # -0.08f

    .line 200
    .line 201
    .line 202
    const/high16 v22, -0x40800000    # -1.0f

    .line 203
    .line 204
    const v23, 0x3fbeb852    # 1.49f

    .line 205
    .line 206
    .line 207
    const v24, -0x40c28f5c    # -0.74f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, -0x41800000    # -0.25f

    .line 214
    .line 215
    const v26, -0x400b851f    # -1.91f

    .line 216
    .line 217
    .line 218
    const v21, 0x3cf5c28f    # 0.03f

    .line 219
    .line 220
    .line 221
    const/high16 v22, -0x40c00000    # -0.75f

    .line 222
    .line 223
    const v23, -0x407c28f6    # -1.03f

    .line 224
    .line 225
    .line 226
    const v24, -0x4079999a    # -1.05f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, 0x3f68f5c3    # 0.91f

    .line 233
    .line 234
    .line 235
    const v26, -0x41bd70a4    # -0.19f

    .line 236
    .line 237
    .line 238
    const v21, 0x3e6147ae    # 0.22f

    .line 239
    .line 240
    .line 241
    const v22, -0x418a3d71    # -0.24f

    .line 242
    .line 243
    .line 244
    const v23, 0x3f35c28f    # 0.71f

    .line 245
    .line 246
    .line 247
    const v24, -0x417ae148    # -0.26f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, 0x4020a3d7    # 2.51f

    .line 254
    .line 255
    .line 256
    const v26, 0x3f9851ec    # 1.19f

    .line 257
    .line 258
    .line 259
    const v21, 0x3f4a3d71    # 0.79f

    .line 260
    .line 261
    .line 262
    const v22, 0x3e8a3d71    # 0.27f

    .line 263
    .line 264
    .line 265
    const v23, 0x3fc66666    # 1.55f

    .line 266
    .line 267
    .line 268
    const v24, 0x3fe8f5c3    # 1.82f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/16 v25, 0x0

    .line 275
    .line 276
    const v26, -0x3fc8f5c3    # -2.86f

    .line 277
    .line 278
    .line 279
    const v21, 0x3f83d70a    # 1.03f

    .line 280
    .line 281
    .line 282
    const v22, -0x40d70a3d    # -0.66f

    .line 283
    .line 284
    .line 285
    const v23, -0x400f5c29    # -1.88f

    .line 286
    .line 287
    .line 288
    const v24, -0x3fe9999a    # -2.35f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v25, 0x4029999a    # 2.65f

    .line 295
    .line 296
    .line 297
    const v26, 0x401c28f6    # 2.44f

    .line 298
    .line 299
    .line 300
    const v21, 0x3fd1eb85    # 1.64f

    .line 301
    .line 302
    .line 303
    const v22, -0x411eb852    # -0.44f

    .line 304
    .line 305
    .line 306
    const v23, 0x3fa7ae14    # 1.31f

    .line 307
    .line 308
    .line 309
    const v24, 0x40051eb8    # 2.08f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, 0x408d1eb8    # 4.41f

    .line 316
    .line 317
    .line 318
    const v26, -0x3feae148    # -2.33f

    .line 319
    .line 320
    .line 321
    const v21, 0x3ff851ec    # 1.94f

    .line 322
    .line 323
    .line 324
    const v22, 0x3f051eb8    # 0.52f

    .line 325
    .line 326
    .line 327
    const v23, 0x4029999a    # 2.65f

    .line 328
    .line 329
    .line 330
    const v24, -0x3f6e6666    # -4.55f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x3fc9999a    # -2.85f

    .line 337
    .line 338
    .line 339
    const v26, 0x408051ec    # 4.01f

    .line 340
    .line 341
    .line 342
    const v21, 0x3feccccd    # 1.85f

    .line 343
    .line 344
    .line 345
    const v22, 0x40151eb8    # 2.33f

    .line 346
    .line 347
    .line 348
    const v23, -0x3fa47ae1    # -3.43f

    .line 349
    .line 350
    .line 351
    const v24, 0x401147ae    # 2.27f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, 0x4030a3d7    # 2.76f

    .line 358
    .line 359
    .line 360
    const v26, 0x3f07ae14    # 0.53f

    .line 361
    .line 362
    .line 363
    const v21, 0x3eae147b    # 0.34f

    .line 364
    .line 365
    .line 366
    const v22, 0x3f8147ae    # 1.01f

    .line 367
    .line 368
    .line 369
    const v23, 0x4009999a    # 2.15f

    .line 370
    .line 371
    .line 372
    const v24, -0x40666666    # -1.2f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v25, -0x3fbd70a4    # -3.04f

    .line 379
    .line 380
    .line 381
    const v26, 0x3fd47ae1    # 1.66f

    .line 382
    .line 383
    .line 384
    const v21, 0x3f23d70a    # 0.64f

    .line 385
    .line 386
    .line 387
    const v22, 0x3fea3d71    # 1.83f

    .line 388
    .line 389
    .line 390
    const v23, -0x3fba3d71    # -3.09f

    .line 391
    .line 392
    .line 393
    const v24, 0x3f51eb85    # 0.82f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x3fd1eb85    # 1.64f

    .line 400
    .line 401
    .line 402
    const v26, 0x4007ae14    # 2.12f

    .line 403
    .line 404
    .line 405
    const v21, 0x3d75c28f    # 0.06f

    .line 406
    .line 407
    .line 408
    const v22, 0x3f547ae1    # 0.83f

    .line 409
    .line 410
    .line 411
    const v23, 0x401a3d71    # 2.41f

    .line 412
    .line 413
    .line 414
    const v24, 0x3f0ccccd    # 0.55f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v25, -0x3f8c28f6    # -3.81f

    .line 421
    .line 422
    .line 423
    const v26, 0x3db851ec    # 0.09f

    .line 424
    .line 425
    .line 426
    const v21, -0x406e147b    # -1.14f

    .line 427
    .line 428
    .line 429
    const v22, 0x3fee147b    # 1.86f

    .line 430
    .line 431
    .line 432
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 433
    .line 434
    const v24, -0x407c28f6    # -1.03f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v25, 0x3e051eb8    # 0.13f

    .line 441
    .line 442
    .line 443
    const v26, 0x40151eb8    # 2.33f

    .line 444
    .line 445
    .line 446
    const v21, -0x413851ec    # -0.39f

    .line 447
    .line 448
    .line 449
    const v22, 0x3f11eb85    # 0.57f

    .line 450
    .line 451
    .line 452
    const v23, -0x4247ae14    # -0.09f

    .line 453
    .line 454
    .line 455
    const v24, 0x3fbeb852    # 1.49f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v4, 0x41a00000    # 20.0f

    .line 462
    .line 463
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v4, 0x40e00000    # 7.0f

    .line 467
    .line 468
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, -0x3f7e6666    # -4.05f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x4161eb85    # 14.12f

    .line 478
    .line 479
    .line 480
    const/high16 v6, 0x40a00000    # 5.0f

    .line 481
    .line 482
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v4, 0x41893333    # 17.15f

    .line 489
    .line 490
    .line 491
    const/high16 v6, 0x41980000    # 19.0f

    .line 492
    .line 493
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v25, -0x40a3d70a    # -0.86f

    .line 497
    .line 498
    .line 499
    const v26, 0x3f5c28f6    # 0.86f

    .line 500
    .line 501
    .line 502
    const/16 v21, 0x0

    .line 503
    .line 504
    const v22, 0x3ef5c28f    # 0.48f

    .line 505
    .line 506
    .line 507
    const v23, -0x413d70a4    # -0.38f

    .line 508
    .line 509
    .line 510
    const v24, 0x3f5c28f6    # 0.86f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v26, -0x40a3d70a    # -0.86f

    .line 517
    .line 518
    .line 519
    const v21, -0x410f5c29    # -0.47f

    .line 520
    .line 521
    .line 522
    const/16 v22, 0x0

    .line 523
    .line 524
    const v23, -0x40a3d70a    # -0.86f

    .line 525
    .line 526
    .line 527
    const v24, -0x413d70a4    # -0.38f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v4, 0x3ec28f5c    # 0.38f

    .line 534
    .line 535
    .line 536
    const v6, 0x3f5c28f6    # 0.86f

    .line 537
    .line 538
    .line 539
    const v7, -0x40a3d70a    # -0.86f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v25, 0x41980000    # 19.0f

    .line 546
    .line 547
    const v26, 0x41893333    # 17.15f

    .line 548
    .line 549
    .line 550
    const v21, 0x4194e148    # 18.61f

    .line 551
    .line 552
    .line 553
    const v22, 0x418251ec    # 16.29f

    .line 554
    .line 555
    .line 556
    const/high16 v23, 0x41980000    # 19.0f

    .line 557
    .line 558
    const v24, 0x41855c29    # 16.67f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/16 v16, 0x3800

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    const v6, 0x3e99999a    # 0.3f

    .line 576
    .line 577
    .line 578
    const v8, 0x3e99999a    # 0.3f

    .line 579
    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    const/high16 v9, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v12, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v13, 0x0

    .line 587
    const/4 v14, 0x0

    .line 588
    const/4 v15, 0x0

    .line 589
    const-string v4, ""

    .line 590
    .line 591
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 592
    .line 593
    .line 594
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 599
    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 601
    .line 602
    .line 603
    move-result-wide v6

    .line 604
    const/4 v2, 0x0

    .line 605
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 619
    .line 620
    .line 621
    const/high16 v4, 0x41a00000    # 20.0f

    .line 622
    .line 623
    const/high16 v6, 0x40a00000    # 5.0f

    .line 624
    .line 625
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v4, -0x3fb51eb8    # -3.17f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v4, 0x41700000    # 15.0f

    .line 635
    .line 636
    const/high16 v6, 0x40400000    # 3.0f

    .line 637
    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v4, 0x41100000    # 9.0f

    .line 642
    .line 643
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v4, 0x40e570a4    # 7.17f

    .line 647
    .line 648
    .line 649
    const/high16 v6, 0x40a00000    # 5.0f

    .line 650
    .line 651
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v4, 0x40800000    # 4.0f

    .line 655
    .line 656
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v25, 0x40000000    # 2.0f

    .line 660
    .line 661
    const/high16 v26, 0x40e00000    # 7.0f

    .line 662
    .line 663
    const v21, 0x4039999a    # 2.9f

    .line 664
    .line 665
    .line 666
    const/high16 v22, 0x40a00000    # 5.0f

    .line 667
    .line 668
    const/high16 v23, 0x40000000    # 2.0f

    .line 669
    .line 670
    const v24, 0x40bccccd    # 5.9f

    .line 671
    .line 672
    .line 673
    move-object/from16 v20, v2

    .line 674
    .line 675
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v4, 0x41400000    # 12.0f

    .line 679
    .line 680
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v26, 0x40000000    # 2.0f

    .line 684
    .line 685
    const/16 v21, 0x0

    .line 686
    .line 687
    const v22, 0x3f8ccccd    # 1.1f

    .line 688
    .line 689
    .line 690
    const v23, 0x3f666666    # 0.9f

    .line 691
    .line 692
    .line 693
    const/high16 v24, 0x40000000    # 2.0f

    .line 694
    .line 695
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v4, 0x41800000    # 16.0f

    .line 699
    .line 700
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v26, -0x40000000    # -2.0f

    .line 704
    .line 705
    const v21, 0x3f8ccccd    # 1.1f

    .line 706
    .line 707
    .line 708
    const/16 v22, 0x0

    .line 709
    .line 710
    const/high16 v23, 0x40000000    # 2.0f

    .line 711
    .line 712
    const v24, -0x4099999a    # -0.9f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v4, 0x40e00000    # 7.0f

    .line 719
    .line 720
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v25, 0x41a00000    # 20.0f

    .line 724
    .line 725
    const/high16 v26, 0x40a00000    # 5.0f

    .line 726
    .line 727
    const/high16 v21, 0x41b00000    # 22.0f

    .line 728
    .line 729
    const v22, 0x40bccccd    # 5.9f

    .line 730
    .line 731
    .line 732
    const v23, 0x41a8cccd    # 21.1f

    .line 733
    .line 734
    .line 735
    const/high16 v24, 0x40a00000    # 5.0f

    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v4, 0x41980000    # 19.0f

    .line 744
    .line 745
    const/high16 v6, 0x41a00000    # 20.0f

    .line 746
    .line 747
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v4, -0x3f1f5c29    # -7.02f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v25, -0x41fae148    # -0.13f

    .line 757
    .line 758
    .line 759
    const v26, -0x3feae148    # -2.33f

    .line 760
    .line 761
    .line 762
    const v21, -0x419eb852    # -0.22f

    .line 763
    .line 764
    .line 765
    const v22, -0x40a8f5c3    # -0.84f

    .line 766
    .line 767
    .line 768
    const v23, -0x40fae148    # -0.52f

    .line 769
    .line 770
    .line 771
    const v24, -0x401eb852    # -1.76f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v25, 0x4073d70a    # 3.81f

    .line 778
    .line 779
    .line 780
    const v26, -0x4247ae14    # -0.09f

    .line 781
    .line 782
    .line 783
    const v21, 0x3f4f5c29    # 0.81f

    .line 784
    .line 785
    .line 786
    const v22, -0x4070a3d7    # -1.12f

    .line 787
    .line 788
    .line 789
    const v23, 0x402ae148    # 2.67f

    .line 790
    .line 791
    .line 792
    const v24, 0x3fe28f5c    # 1.77f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v25, -0x402e147b    # -1.64f

    .line 799
    .line 800
    .line 801
    const v26, -0x3ff851ec    # -2.12f

    .line 802
    .line 803
    .line 804
    const v21, 0x3f451eb8    # 0.77f

    .line 805
    .line 806
    .line 807
    const v22, -0x40370a3d    # -1.57f

    .line 808
    .line 809
    .line 810
    const v23, -0x4035c28f    # -1.58f

    .line 811
    .line 812
    .line 813
    const v24, -0x405ae148    # -1.29f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v25, 0x40428f5c    # 3.04f

    .line 820
    .line 821
    .line 822
    const v26, -0x402b851f    # -1.66f

    .line 823
    .line 824
    .line 825
    const v21, -0x42b33333    # -0.05f

    .line 826
    .line 827
    .line 828
    const v22, -0x40a8f5c3    # -0.84f

    .line 829
    .line 830
    .line 831
    const v23, 0x406b851f    # 3.68f

    .line 832
    .line 833
    .line 834
    const v24, 0x3e2e147b    # 0.17f

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v25, -0x3fcf5c29    # -2.76f

    .line 841
    .line 842
    .line 843
    const v26, -0x40f851ec    # -0.53f

    .line 844
    .line 845
    .line 846
    const v21, -0x40e3d70a    # -0.61f

    .line 847
    .line 848
    .line 849
    const v22, -0x40228f5c    # -1.73f

    .line 850
    .line 851
    .line 852
    const v23, -0x3fe51eb8    # -2.42f

    .line 853
    .line 854
    .line 855
    const v24, 0x3ef5c28f    # 0.48f

    .line 856
    .line 857
    .line 858
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v25, 0x40366666    # 2.85f

    .line 862
    .line 863
    .line 864
    const v26, -0x3f7fae14    # -4.01f

    .line 865
    .line 866
    .line 867
    const v21, -0x40eb851f    # -0.58f

    .line 868
    .line 869
    .line 870
    const v22, -0x402147ae    # -1.74f

    .line 871
    .line 872
    .line 873
    const v23, 0x40966666    # 4.7f

    .line 874
    .line 875
    .line 876
    const v24, -0x4028f5c3    # -1.68f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v25, -0x3f72e148    # -4.41f

    .line 883
    .line 884
    .line 885
    const v26, 0x40151eb8    # 2.33f

    .line 886
    .line 887
    .line 888
    const v21, -0x401eb852    # -1.76f

    .line 889
    .line 890
    .line 891
    const v22, -0x3ff1eb85    # -2.22f

    .line 892
    .line 893
    .line 894
    const v23, -0x3fe1eb85    # -2.47f

    .line 895
    .line 896
    .line 897
    const v24, 0x40366666    # 2.85f

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v25, -0x3fd66666    # -2.65f

    .line 904
    .line 905
    .line 906
    const v26, -0x3fe3d70a    # -2.44f

    .line 907
    .line 908
    .line 909
    const v21, -0x40547ae1    # -1.34f

    .line 910
    .line 911
    .line 912
    const v22, -0x4147ae14    # -0.36f

    .line 913
    .line 914
    .line 915
    const v23, -0x407eb852    # -1.01f

    .line 916
    .line 917
    .line 918
    const v24, -0x3fc7ae14    # -2.88f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/16 v25, 0x0

    .line 925
    .line 926
    const v26, 0x40370a3d    # 2.86f

    .line 927
    .line 928
    .line 929
    const v21, -0x400f5c29    # -1.88f

    .line 930
    .line 931
    .line 932
    const v22, 0x3f028f5c    # 0.51f

    .line 933
    .line 934
    .line 935
    const v23, 0x3f83d70a    # 1.03f

    .line 936
    .line 937
    .line 938
    const v24, 0x400ccccd    # 2.2f

    .line 939
    .line 940
    .line 941
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v25, -0x3fdf5c29    # -2.51f

    .line 945
    .line 946
    .line 947
    const v26, -0x4067ae14    # -1.19f

    .line 948
    .line 949
    .line 950
    const v21, -0x408a3d71    # -0.96f

    .line 951
    .line 952
    .line 953
    const v22, 0x3f2147ae    # 0.63f

    .line 954
    .line 955
    .line 956
    const v23, -0x4023d70a    # -1.72f

    .line 957
    .line 958
    .line 959
    const v24, -0x40947ae1    # -0.92f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v25, -0x40970a3d    # -0.91f

    .line 966
    .line 967
    .line 968
    const v26, 0x3e428f5c    # 0.19f

    .line 969
    .line 970
    .line 971
    const v21, -0x41b33333    # -0.2f

    .line 972
    .line 973
    .line 974
    const v22, -0x4270a3d7    # -0.07f

    .line 975
    .line 976
    .line 977
    const v23, -0x40cf5c29    # -0.69f

    .line 978
    .line 979
    .line 980
    const v24, -0x42b33333    # -0.05f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v25, 0x3e800000    # 0.25f

    .line 987
    .line 988
    const v26, 0x3ff47ae1    # 1.91f

    .line 989
    .line 990
    .line 991
    const v21, -0x40b851ec    # -0.78f

    .line 992
    .line 993
    .line 994
    const v22, 0x3f5c28f6    # 0.86f

    .line 995
    .line 996
    .line 997
    const v23, 0x3e8f5c29    # 0.28f

    .line 998
    .line 999
    .line 1000
    const v24, 0x3f947ae1    # 1.16f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const v25, -0x403eb852    # -1.51f

    .line 1007
    .line 1008
    .line 1009
    const v26, 0x3fbeb852    # 1.49f

    .line 1010
    .line 1011
    .line 1012
    const v21, -0x435c28f6    # -0.02f

    .line 1013
    .line 1014
    .line 1015
    const/high16 v22, 0x3f400000    # 0.75f

    .line 1016
    .line 1017
    const v23, -0x40347ae1    # -1.59f

    .line 1018
    .line 1019
    .line 1020
    const v24, 0x3efae148    # 0.49f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const v25, 0x4019999a    # 2.4f

    .line 1027
    .line 1028
    .line 1029
    const v26, 0x3f9eb852    # 1.24f

    .line 1030
    .line 1031
    .line 1032
    const v21, 0x3df5c28f    # 0.12f

    .line 1033
    .line 1034
    .line 1035
    const v22, 0x3fcccccd    # 1.6f

    .line 1036
    .line 1037
    .line 1038
    const v23, 0x400b851f    # 2.18f

    .line 1039
    .line 1040
    .line 1041
    const v24, 0x3ee66666    # 0.45f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const/high16 v25, -0x41000000    # -0.5f

    .line 1048
    .line 1049
    const v26, 0x405147ae    # 3.27f

    .line 1050
    .line 1051
    .line 1052
    const v21, 0x3f0ccccd    # 0.55f

    .line 1053
    .line 1054
    .line 1055
    const v22, 0x3ffd70a4    # 1.98f

    .line 1056
    .line 1057
    .line 1058
    const v23, -0x400e147b    # -1.89f

    .line 1059
    .line 1060
    .line 1061
    const v24, 0x4009999a    # 2.15f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v25, 0x40333333    # 2.8f

    .line 1068
    .line 1069
    .line 1070
    const v26, -0x40533333    # -1.35f

    .line 1071
    .line 1072
    .line 1073
    const v21, 0x3fc3d70a    # 1.53f

    .line 1074
    .line 1075
    .line 1076
    const v22, 0x3f35c28f    # 0.71f

    .line 1077
    .line 1078
    .line 1079
    const v23, 0x3ff47ae1    # 1.91f

    .line 1080
    .line 1081
    .line 1082
    const v24, -0x4007ae14    # -1.94f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v25, 0x3e23d70a    # 0.16f

    .line 1089
    .line 1090
    .line 1091
    const v26, 0x401b851f    # 2.43f

    .line 1092
    .line 1093
    .line 1094
    const v21, 0x3f147ae1    # 0.58f

    .line 1095
    .line 1096
    .line 1097
    const v22, 0x3ec28f5c    # 0.38f

    .line 1098
    .line 1099
    .line 1100
    const v23, 0x3e99999a    # 0.3f

    .line 1101
    .line 1102
    .line 1103
    const v24, 0x3fb9999a    # 1.45f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const/high16 v4, 0x40800000    # 4.0f

    .line 1110
    .line 1111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    const/high16 v4, 0x40e00000    # 7.0f

    .line 1115
    .line 1116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const v4, 0x4081999a    # 4.05f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v4, -0x40000000    # -2.0f

    .line 1126
    .line 1127
    const v6, 0x3fea3d71    # 1.83f

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const v4, 0x4087ae14    # 4.24f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const/high16 v4, 0x40000000    # 2.0f

    .line 1140
    .line 1141
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const/high16 v4, 0x41a00000    # 20.0f

    .line 1145
    .line 1146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const/high16 v4, 0x41980000    # 19.0f

    .line 1150
    .line 1151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1162
    .line 1163
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1164
    .line 1165
    const/4 v7, 0x0

    .line 1166
    const-string v4, ""

    .line 1167
    .line 1168
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1169
    .line 1170
    .line 1171
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1172
    .line 1173
    .line 1174
    move-result v3

    .line 1175
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1176
    .line 1177
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1178
    .line 1179
    .line 1180
    move-result-wide v6

    .line 1181
    const/4 v0, 0x0

    .line 1182
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1186
    .line 1187
    .line 1188
    move-result v10

    .line 1189
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1190
    .line 1191
    .line 1192
    move-result v11

    .line 1193
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1194
    .line 1195
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1196
    .line 1197
    .line 1198
    const v0, 0x418a3d71    # 17.28f

    .line 1199
    .line 1200
    .line 1201
    const v2, 0x41893333    # 17.15f

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    const v17, 0x3f5c28f6    # 0.86f

    .line 1208
    .line 1209
    .line 1210
    const v18, 0x3f5c28f6    # 0.86f

    .line 1211
    .line 1212
    .line 1213
    const v14, 0x3ef5c28f    # 0.48f

    .line 1214
    .line 1215
    .line 1216
    const v15, 0x3ec7ae14    # 0.39f

    .line 1217
    .line 1218
    .line 1219
    const v16, 0x3f5c28f6    # 0.86f

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1223
    .line 1224
    .line 1225
    const v18, -0x40a3d70a    # -0.86f

    .line 1226
    .line 1227
    .line 1228
    const v13, 0x3ef5c28f    # 0.48f

    .line 1229
    .line 1230
    .line 1231
    const/4 v14, 0x0

    .line 1232
    const v15, 0x3f5c28f6    # 0.86f

    .line 1233
    .line 1234
    .line 1235
    const v16, -0x413d70a4    # -0.38f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const v0, -0x413851ec    # -0.39f

    .line 1242
    .line 1243
    .line 1244
    const v2, -0x40a3d70a    # -0.86f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v17, 0x418a3d71    # 17.28f

    .line 1251
    .line 1252
    .line 1253
    const v18, 0x41893333    # 17.15f

    .line 1254
    .line 1255
    .line 1256
    const v13, 0x418d47ae    # 17.66f

    .line 1257
    .line 1258
    .line 1259
    const v14, 0x418251ec    # 16.29f

    .line 1260
    .line 1261
    .line 1262
    const v15, 0x418a3d71    # 17.28f

    .line 1263
    .line 1264
    .line 1265
    const v16, 0x41855c29    # 16.67f

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v2

    .line 1278
    const/16 v16, 0x3800

    .line 1279
    .line 1280
    const/16 v17, 0x0

    .line 1281
    .line 1282
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1283
    .line 1284
    const/4 v7, 0x0

    .line 1285
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1286
    .line 1287
    const/4 v13, 0x0

    .line 1288
    const/4 v14, 0x0

    .line 1289
    const/4 v15, 0x0

    .line 1290
    const-string v4, ""

    .line 1291
    .line 1292
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    sput-object v0, Landroidx/compose/material/icons/twotone/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1301
    .line 1302
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1303
    .line 1304
    .line 1305
    return-object v0
.end method
