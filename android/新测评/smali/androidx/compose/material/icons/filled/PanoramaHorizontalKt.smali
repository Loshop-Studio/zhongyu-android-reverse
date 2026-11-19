.class public final Landroidx/compose/material/icons/filled/PanoramaHorizontalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_panoramaHorizontal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PanoramaHorizontal",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPanoramaHorizontal",
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
        "SMAP\nPanoramaHorizontal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/filled/PanoramaHorizontalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n72#5,4:96\n*S KotlinDebug\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/filled/PanoramaHorizontalKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaHorizontal(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaHorizontal"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const v2, 0x40d147ae    # 6.54f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x412e8f5c    # 10.91f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x3f000000    # -8.0f

    .line 85
    .line 86
    const v18, -0x406b851f    # -1.16f

    .line 87
    .line 88
    .line 89
    const v13, -0x3fd9999a    # -2.6f

    .line 90
    .line 91
    .line 92
    const v14, -0x40bae148    # -0.77f

    .line 93
    .line 94
    .line 95
    const v15, -0x3f570a3d    # -5.28f

    .line 96
    .line 97
    .line 98
    const v16, -0x406b851f    # -1.16f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v18, 0x3f947ae1    # 1.16f

    .line 105
    .line 106
    .line 107
    const v13, -0x3fd1eb85    # -2.72f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const v15, -0x3f533333    # -5.4f

    .line 112
    .line 113
    .line 114
    const v16, 0x3ec7ae14    # 0.39f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x40d147ae    # 6.54f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x41000000    # 8.0f

    .line 127
    .line 128
    const v13, 0x40266666    # 2.6f

    .line 129
    .line 130
    .line 131
    const v14, 0x3f451eb8    # 0.77f

    .line 132
    .line 133
    .line 134
    const v15, 0x40a8f5c3    # 5.28f

    .line 135
    .line 136
    .line 137
    const v16, 0x3f947ae1    # 1.16f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v18, -0x406b851f    # -1.16f

    .line 144
    .line 145
    .line 146
    const v13, 0x402e147b    # 2.72f

    .line 147
    .line 148
    .line 149
    const v14, 0x3c23d70a    # 0.01f

    .line 150
    .line 151
    .line 152
    const v15, 0x40accccd    # 5.4f

    .line 153
    .line 154
    .line 155
    const v16, -0x413d70a4    # -0.38f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x41ab70a4    # 21.43f

    .line 162
    .line 163
    .line 164
    const/high16 v2, 0x40800000    # 4.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x416147ae    # -0.31f

    .line 170
    .line 171
    .line 172
    const v18, 0x3d75c28f    # 0.06f

    .line 173
    .line 174
    .line 175
    const v13, -0x42333333    # -0.1f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const v15, -0x41b33333    # -0.2f

    .line 180
    .line 181
    .line 182
    const v16, 0x3ca3d70a    # 0.02f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v18, 0x40b66666    # 5.7f

    .line 191
    .line 192
    .line 193
    const v13, 0x419170a4    # 18.18f

    .line 194
    .line 195
    .line 196
    const v14, 0x40a51eb8    # 5.16f

    .line 197
    .line 198
    .line 199
    const v15, 0x417170a4    # 15.09f

    .line 200
    .line 201
    .line 202
    const v16, 0x40b66666    # 5.7f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x3eee147b    # -9.12f

    .line 209
    .line 210
    .line 211
    const v18, -0x402e147b    # -1.64f

    .line 212
    .line 213
    .line 214
    const v13, -0x3fba3d71    # -3.09f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const v15, -0x3f3a3d71    # -6.18f

    .line 219
    .line 220
    .line 221
    const v16, -0x40f33333    # -0.55f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x416147ae    # -0.31f

    .line 228
    .line 229
    .line 230
    const v18, -0x428a3d71    # -0.06f

    .line 231
    .line 232
    .line 233
    const v13, -0x421eb852    # -0.11f

    .line 234
    .line 235
    .line 236
    const v14, -0x42dc28f6    # -0.04f

    .line 237
    .line 238
    .line 239
    const v15, -0x419eb852    # -0.22f

    .line 240
    .line 241
    .line 242
    const v16, -0x428a3d71    # -0.06f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x40ee147b    # -0.57f

    .line 249
    .line 250
    .line 251
    const v18, 0x3f2147ae    # 0.63f

    .line 252
    .line 253
    .line 254
    const v13, -0x4151eb85    # -0.34f

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const v15, -0x40ee147b    # -0.57f

    .line 259
    .line 260
    .line 261
    const v16, 0x3e6b851f    # 0.23f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x416c0000    # 14.75f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3f11eb85    # 0.57f

    .line 273
    .line 274
    .line 275
    const v18, 0x3f1eb852    # 0.62f

    .line 276
    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const v14, 0x3ec7ae14    # 0.39f

    .line 280
    .line 281
    .line 282
    const v15, 0x3e6b851f    # 0.23f

    .line 283
    .line 284
    .line 285
    const v16, 0x3f1eb852    # 0.62f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, 0x3e9eb852    # 0.31f

    .line 292
    .line 293
    .line 294
    const v18, -0x428a3d71    # -0.06f

    .line 295
    .line 296
    .line 297
    const v13, 0x3dcccccd    # 0.1f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const v15, 0x3e4ccccd    # 0.2f

    .line 302
    .line 303
    .line 304
    const v16, -0x435c28f6    # -0.02f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x4111eb85    # 9.12f

    .line 311
    .line 312
    .line 313
    const v18, -0x402e147b    # -1.64f

    .line 314
    .line 315
    .line 316
    const v13, 0x403c28f6    # 2.94f

    .line 317
    .line 318
    .line 319
    const v14, -0x40733333    # -1.1f

    .line 320
    .line 321
    .line 322
    const v15, 0x40c0f5c3    # 6.03f

    .line 323
    .line 324
    .line 325
    const v16, -0x402e147b    # -1.64f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v18, 0x3fd1eb85    # 1.64f

    .line 332
    .line 333
    .line 334
    const v13, 0x4045c28f    # 3.09f

    .line 335
    .line 336
    .line 337
    const/4 v14, 0x0

    .line 338
    const v15, 0x40c5c28f    # 6.18f

    .line 339
    .line 340
    .line 341
    const v16, 0x3f0ccccd    # 0.55f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x3e9eb852    # 0.31f

    .line 348
    .line 349
    .line 350
    const v18, 0x3d75c28f    # 0.06f

    .line 351
    .line 352
    .line 353
    const v13, 0x3de147ae    # 0.11f

    .line 354
    .line 355
    .line 356
    const v14, 0x3d23d70a    # 0.04f

    .line 357
    .line 358
    .line 359
    const v15, 0x3e570a3d    # 0.21f

    .line 360
    .line 361
    .line 362
    const v16, 0x3d75c28f    # 0.06f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3f11eb85    # 0.57f

    .line 369
    .line 370
    .line 371
    const v18, -0x40deb852    # -0.63f

    .line 372
    .line 373
    .line 374
    const v13, 0x3ea8f5c3    # 0.33f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const v15, 0x3f11eb85    # 0.57f

    .line 379
    .line 380
    .line 381
    const v16, -0x41947ae1    # -0.23f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x409428f6    # 4.63f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x40ee147b    # -0.57f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, -0x41333333    # -0.4f

    .line 398
    .line 399
    .line 400
    const v15, -0x418a3d71    # -0.24f

    .line 401
    .line 402
    .line 403
    const v16, -0x40deb852    # -0.63f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const/16 v16, 0x3800

    .line 417
    .line 418
    const/16 v17, 0x0

    .line 419
    .line 420
    const/high16 v6, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v8, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    const/high16 v9, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v12, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/4 v15, 0x0

    .line 431
    const-string v4, ""

    .line 432
    .line 433
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 442
    .line 443
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-object v0
.end method
