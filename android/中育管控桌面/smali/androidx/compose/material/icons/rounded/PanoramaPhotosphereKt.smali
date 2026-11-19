.class public final Landroidx/compose/material/icons/rounded/PanoramaPhotosphereKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_panoramaPhotosphere",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PanoramaPhotosphere",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPanoramaPhotosphere",
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
        "SMAP\nPanoramaPhotosphere.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaPhotosphere.kt\nandroidx/compose/material/icons/rounded/PanoramaPhotosphereKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 PanoramaPhotosphere.kt\nandroidx/compose/material/icons/rounded/PanoramaPhotosphereKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaPhotosphere(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PanoramaPhotosphere"

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
    const v0, 0x41af999a    # 21.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x41026666    # 8.15f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4091eb85    # -0.93f

    .line 80
    .line 81
    .line 82
    const v18, -0x41147ae1    # -0.46f

    .line 83
    .line 84
    .line 85
    const v13, -0x416b851f    # -0.29f

    .line 86
    .line 87
    .line 88
    const v14, -0x41dc28f6    # -0.16f

    .line 89
    .line 90
    .line 91
    const v15, -0x40e3d70a    # -0.61f

    .line 92
    .line 93
    .line 94
    const v16, -0x416147ae    # -0.31f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41400000    # 12.0f

    .line 101
    .line 102
    const/high16 v18, 0x40000000    # 2.0f

    .line 103
    .line 104
    const v13, 0x419b3333    # 19.4f

    .line 105
    .line 106
    .line 107
    const v14, 0x408a8f5c    # 4.33f

    .line 108
    .line 109
    .line 110
    const v15, 0x417fae14    # 15.98f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x403f5c29    # 2.99f

    .line 119
    .line 120
    .line 121
    const v18, 0x40f5c28f    # 7.68f

    .line 122
    .line 123
    .line 124
    const v13, 0x410051ec    # 8.02f

    .line 125
    .line 126
    .line 127
    const/high16 v14, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v15, 0x40933333    # 4.6f

    .line 130
    .line 131
    .line 132
    const v16, 0x408a8f5c    # 4.33f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x4091eb85    # -0.93f

    .line 139
    .line 140
    .line 141
    const v18, 0x3eeb851f    # 0.46f

    .line 142
    .line 143
    .line 144
    const v13, -0x41570a3d    # -0.33f

    .line 145
    .line 146
    .line 147
    const v14, 0x3e19999a    # 0.15f

    .line 148
    .line 149
    .line 150
    const v15, -0x40dc28f6    # -0.64f

    .line 151
    .line 152
    .line 153
    const v16, 0x3e99999a    # 0.3f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const v18, 0x411e8f5c    # 9.91f

    .line 162
    .line 163
    .line 164
    const v13, 0x3fb47ae1    # 1.41f

    .line 165
    .line 166
    .line 167
    const/high16 v14, 0x41080000    # 8.5f

    .line 168
    .line 169
    const/high16 v15, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v16, 0x4112b852    # 9.17f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x4085c28f    # 4.18f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x3f866666    # 1.05f

    .line 184
    .line 185
    .line 186
    const v18, 0x3fe28f5c    # 1.77f

    .line 187
    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    const v14, 0x3f3d70a4    # 0.74f

    .line 191
    .line 192
    .line 193
    const v15, 0x3ed1eb85    # 0.41f

    .line 194
    .line 195
    .line 196
    const v16, 0x3fb47ae1    # 1.41f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x3f6e147b    # 0.93f

    .line 203
    .line 204
    .line 205
    const v18, 0x3eeb851f    # 0.46f

    .line 206
    .line 207
    .line 208
    const v13, 0x3e947ae1    # 0.29f

    .line 209
    .line 210
    .line 211
    const v14, 0x3e23d70a    # 0.16f

    .line 212
    .line 213
    .line 214
    const v15, 0x3f1c28f6    # 0.61f

    .line 215
    .line 216
    .line 217
    const v16, 0x3e9eb852    # 0.31f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41400000    # 12.0f

    .line 224
    .line 225
    const/high16 v18, 0x41b00000    # 22.0f

    .line 226
    .line 227
    const v13, 0x40933333    # 4.6f

    .line 228
    .line 229
    .line 230
    const v14, 0x419d5c29    # 19.67f

    .line 231
    .line 232
    .line 233
    const v15, 0x410051ec    # 8.02f

    .line 234
    .line 235
    .line 236
    const/high16 v16, 0x41b00000    # 22.0f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x411028f6    # 9.01f

    .line 242
    .line 243
    .line 244
    const v18, -0x3f4a3d71    # -5.68f

    .line 245
    .line 246
    .line 247
    const v13, 0x407eb852    # 3.98f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const v15, 0x40eccccd    # 7.4f

    .line 252
    .line 253
    .line 254
    const v16, -0x3feae148    # -2.33f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x3f6e147b    # 0.93f

    .line 261
    .line 262
    .line 263
    const v18, -0x41147ae1    # -0.46f

    .line 264
    .line 265
    .line 266
    const v13, 0x3ea8f5c3    # 0.33f

    .line 267
    .line 268
    .line 269
    const v14, -0x41e66666    # -0.15f

    .line 270
    .line 271
    .line 272
    const v15, 0x3f23d70a    # 0.64f

    .line 273
    .line 274
    .line 275
    const v16, -0x41666666    # -0.3f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x41b80000    # 23.0f

    .line 282
    .line 283
    const v18, 0x416170a4    # 14.09f

    .line 284
    .line 285
    .line 286
    const v13, 0x41b4b852    # 22.59f

    .line 287
    .line 288
    .line 289
    const/high16 v14, 0x41780000    # 15.5f

    .line 290
    .line 291
    const/high16 v15, 0x41b80000    # 23.0f

    .line 292
    .line 293
    const v16, 0x416d47ae    # 14.83f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x411e8f5c    # 9.91f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x41af999a    # 21.95f

    .line 306
    .line 307
    .line 308
    const v18, 0x41026666    # 8.15f

    .line 309
    .line 310
    .line 311
    const/high16 v13, 0x41b80000    # 23.0f

    .line 312
    .line 313
    const v14, 0x4112b852    # 9.17f

    .line 314
    .line 315
    .line 316
    const v15, 0x41b4b852    # 22.59f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41080000    # 8.5f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x40800000    # 4.0f

    .line 328
    .line 329
    const/high16 v2, 0x41400000    # 12.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x40be6666    # 5.95f

    .line 335
    .line 336
    .line 337
    const v18, 0x402b851f    # 2.68f

    .line 338
    .line 339
    .line 340
    const v13, 0x4017ae14    # 2.37f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const v15, 0x408fae14    # 4.49f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f851eb8    # 1.04f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x41400000    # 12.0f

    .line 354
    .line 355
    const/high16 v18, 0x40c00000    # 6.0f

    .line 356
    .line 357
    const v13, 0x41815c29    # 16.17f

    .line 358
    .line 359
    .line 360
    const/high16 v14, 0x40c80000    # 6.25f

    .line 361
    .line 362
    const v15, 0x41626666    # 14.15f

    .line 363
    .line 364
    .line 365
    const/high16 v16, 0x40c00000    # 6.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x40c1999a    # 6.05f

    .line 371
    .line 372
    .line 373
    const v18, 0x40d5c28f    # 6.68f

    .line 374
    .line 375
    .line 376
    const v13, 0x411d999a    # 9.85f

    .line 377
    .line 378
    .line 379
    const/high16 v14, 0x40c00000    # 6.0f

    .line 380
    .line 381
    const v15, 0x40fa8f5c    # 7.83f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x40c80000    # 6.25f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x41400000    # 12.0f

    .line 390
    .line 391
    const/high16 v18, 0x40800000    # 4.0f

    .line 392
    .line 393
    const v13, 0x40f051ec    # 7.51f

    .line 394
    .line 395
    .line 396
    const v14, 0x40a147ae    # 5.04f

    .line 397
    .line 398
    .line 399
    const v15, 0x411a147b    # 9.63f

    .line 400
    .line 401
    .line 402
    const/high16 v16, 0x40800000    # 4.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41a00000    # 20.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x3f41999a    # -5.95f

    .line 416
    .line 417
    .line 418
    const v18, -0x3fd47ae1    # -2.68f

    .line 419
    .line 420
    .line 421
    const v13, -0x3fe851ec    # -2.37f

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const v15, -0x3f7051ec    # -4.49f

    .line 426
    .line 427
    .line 428
    const v16, -0x407ae148    # -1.04f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x41400000    # 12.0f

    .line 435
    .line 436
    const/high16 v18, 0x41900000    # 18.0f

    .line 437
    .line 438
    const v13, 0x40fa8f5c    # 7.83f

    .line 439
    .line 440
    .line 441
    const/high16 v14, 0x418e0000    # 17.75f

    .line 442
    .line 443
    const v15, 0x411d999a    # 9.85f

    .line 444
    .line 445
    .line 446
    const/high16 v16, 0x41900000    # 18.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40be6666    # 5.95f

    .line 452
    .line 453
    .line 454
    const v2, -0x40d1eb85    # -0.68f

    .line 455
    .line 456
    .line 457
    const v4, 0x408570a4    # 4.17f

    .line 458
    .line 459
    .line 460
    const/high16 v6, -0x41800000    # -0.25f

    .line 461
    .line 462
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v18, 0x41a00000    # 20.0f

    .line 466
    .line 467
    const v13, 0x4183eb85    # 16.49f

    .line 468
    .line 469
    .line 470
    const v14, 0x4197ae14    # 18.96f

    .line 471
    .line 472
    .line 473
    const v15, 0x4165eb85    # 14.37f

    .line 474
    .line 475
    .line 476
    const/high16 v16, 0x41a00000    # 20.0f

    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const/16 v16, 0x3800

    .line 489
    .line 490
    const/16 v17, 0x0

    .line 491
    .line 492
    const/high16 v6, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/high16 v8, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/high16 v9, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/high16 v12, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    const/4 v14, 0x0

    .line 503
    const/4 v15, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    sput-object v0, Landroidx/compose/material/icons/rounded/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    return-object v0
.end method
