.class public final Landroidx/compose/material/icons/outlined/BakeryDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bakeryDining",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BakeryDining",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getBakeryDining",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nBakeryDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BakeryDining.kt\nandroidx/compose/material/icons/outlined/BakeryDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 BakeryDining.kt\nandroidx/compose/material/icons/outlined/BakeryDiningKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBakeryDining(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BakeryDining"

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
    const/high16 v0, 0x41a40000    # 20.5f

    .line 71
    .line 72
    const v2, 0x412f0a3d    # 10.94f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3e19999a    # 0.15f

    .line 79
    .line 80
    .line 81
    const v18, -0x413851ec    # -0.39f

    .line 82
    .line 83
    .line 84
    const v13, 0x3e051eb8    # 0.13f

    .line 85
    .line 86
    .line 87
    const v14, -0x415c28f6    # -0.32f

    .line 88
    .line 89
    .line 90
    const v15, 0x3dcccccd    # 0.1f

    .line 91
    .line 92
    .line 93
    const v16, -0x41947ae1    # -0.23f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, -0x40400000    # -1.5f

    .line 100
    .line 101
    const v18, -0x3fc47ae1    # -2.93f

    .line 102
    .line 103
    .line 104
    const v13, 0x3e99999a    # 0.3f

    .line 105
    .line 106
    .line 107
    const v14, -0x40651eb8    # -1.21f

    .line 108
    .line 109
    .line 110
    const v15, -0x4151eb85    # -0.34f

    .line 111
    .line 112
    .line 113
    const v16, -0x3fe1eb85    # -2.47f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x40b33333    # -0.8f

    .line 120
    .line 121
    .line 122
    const v2, -0x3fff5c29    # -2.01f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x404b851f    # -1.41f

    .line 129
    .line 130
    .line 131
    const v18, -0x420a3d71    # -0.12f

    .line 132
    .line 133
    .line 134
    const v13, -0x41147ae1    # -0.46f

    .line 135
    .line 136
    .line 137
    const v14, -0x41c7ae14    # -0.18f

    .line 138
    .line 139
    .line 140
    const v15, -0x408ccccd    # -0.95f

    .line 141
    .line 142
    .line 143
    const v16, -0x41a8f5c3    # -0.21f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x40fae148    # -0.52f

    .line 150
    .line 151
    .line 152
    const v18, -0x409c28f6    # -0.89f

    .line 153
    .line 154
    .line 155
    const v13, -0x421eb852    # -0.11f

    .line 156
    .line 157
    .line 158
    const v14, -0x41570a3d    # -0.33f

    .line 159
    .line 160
    .line 161
    const v15, -0x416b851f    # -0.29f

    .line 162
    .line 163
    .line 164
    const v16, -0x40deb852    # -0.63f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x4155c28f    # 13.36f

    .line 171
    .line 172
    .line 173
    const/high16 v18, 0x40a00000    # 5.0f

    .line 174
    .line 175
    const v13, 0x416bae14    # 14.73f

    .line 176
    .line 177
    .line 178
    const v14, 0x40a947ae    # 5.29f

    .line 179
    .line 180
    .line 181
    const v15, 0x4160f5c3    # 14.06f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x40a00000    # 5.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x3fd28f5c    # -2.71f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x410ccccd    # 8.8f

    .line 196
    .line 197
    .line 198
    const v18, 0x40b9eb85    # 5.81f

    .line 199
    .line 200
    .line 201
    const v13, 0x411f0a3d    # 9.94f

    .line 202
    .line 203
    .line 204
    const/high16 v14, 0x40a00000    # 5.0f

    .line 205
    .line 206
    const v15, 0x411451ec    # 9.27f

    .line 207
    .line 208
    .line 209
    const v16, 0x40a947ae    # 5.29f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x410451ec    # 8.27f

    .line 216
    .line 217
    .line 218
    const v18, 0x40d6147b    # 6.69f

    .line 219
    .line 220
    .line 221
    const v13, 0x4108f5c3    # 8.56f

    .line 222
    .line 223
    .line 224
    const v14, 0x40c23d71    # 6.07f

    .line 225
    .line 226
    .line 227
    const v15, 0x4106147b    # 8.38f

    .line 228
    .line 229
    .line 230
    const v16, 0x40cbd70a    # 6.37f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x40db851f    # 6.86f

    .line 237
    .line 238
    .line 239
    const v18, 0x40d9eb85    # 6.81f

    .line 240
    .line 241
    .line 242
    const v13, 0x40f9eb85    # 7.81f

    .line 243
    .line 244
    .line 245
    const v14, 0x40d33333    # 6.6f

    .line 246
    .line 247
    .line 248
    const v15, 0x40ea3d71    # 7.32f

    .line 249
    .line 250
    .line 251
    const v16, 0x40d428f6    # 6.63f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x3f4ccccd    # 0.8f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, -0x40400000    # -1.5f

    .line 264
    .line 265
    const v18, 0x403b851f    # 2.93f

    .line 266
    .line 267
    .line 268
    const v13, -0x406b851f    # -1.16f

    .line 269
    .line 270
    .line 271
    const v14, 0x3eeb851f    # 0.46f

    .line 272
    .line 273
    .line 274
    const v15, -0x4019999a    # -1.8f

    .line 275
    .line 276
    .line 277
    const v16, 0x3fdc28f6    # 1.72f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3e19999a    # 0.15f

    .line 284
    .line 285
    .line 286
    const v2, 0x3ec28f5c    # 0.38f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const v18, 0x41830a3d    # 16.38f

    .line 295
    .line 296
    .line 297
    const v13, 0x3f8ccccd    # 1.1f

    .line 298
    .line 299
    .line 300
    const v14, 0x4178cccd    # 15.55f

    .line 301
    .line 302
    .line 303
    const/high16 v15, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const v16, 0x4178cccd    # 15.55f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3f9eb852    # 1.24f

    .line 312
    .line 313
    .line 314
    const v18, 0x400e147b    # 2.22f

    .line 315
    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const v14, 0x3f68f5c3    # 0.91f

    .line 319
    .line 320
    .line 321
    const v15, 0x3eeb851f    # 0.46f

    .line 322
    .line 323
    .line 324
    const v16, 0x3fdeb852    # 1.74f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x40800000    # 4.0f

    .line 331
    .line 332
    const v18, -0x40e3d70a    # -0.61f

    .line 333
    .line 334
    .line 335
    const v13, 0x3fb5c28f    # 1.42f

    .line 336
    .line 337
    .line 338
    const v14, 0x3f6147ae    # 0.88f

    .line 339
    .line 340
    .line 341
    const v15, 0x401f5c29    # 2.49f

    .line 342
    .line 343
    .line 344
    const v16, 0x3e0f5c29    # 0.14f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x41387ae1    # 11.53f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x402851ec    # 2.63f

    .line 357
    .line 358
    .line 359
    const v18, 0x3f8147ae    # 1.01f

    .line 360
    .line 361
    .line 362
    const v13, 0x3fc28f5c    # 1.52f

    .line 363
    .line 364
    .line 365
    const v14, 0x3f428f5c    # 0.76f

    .line 366
    .line 367
    .line 368
    const v15, 0x3fee147b    # 1.86f

    .line 369
    .line 370
    .line 371
    const v16, 0x3f8147ae    # 1.01f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x40270a3d    # 2.61f

    .line 378
    .line 379
    .line 380
    const v18, -0x3fd8f5c3    # -2.61f

    .line 381
    .line 382
    .line 383
    const/high16 v13, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const v15, 0x40270a3d    # 2.61f

    .line 387
    .line 388
    .line 389
    const v16, -0x40bae148    # -0.77f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x41a40000    # 20.5f

    .line 396
    .line 397
    const v18, 0x412f0a3d    # 10.94f

    .line 398
    .line 399
    .line 400
    const/high16 v13, 0x41b80000    # 23.0f

    .line 401
    .line 402
    const v14, 0x4178a3d7    # 15.54f

    .line 403
    .line 404
    .line 405
    const v15, 0x41b70a3d    # 22.88f

    .line 406
    .line 407
    .line 408
    const v16, 0x417828f6    # 15.51f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x41a0f5c3    # 20.12f

    .line 418
    .line 419
    .line 420
    const v2, 0x418770a4    # 16.93f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x40a8f5c3    # -0.84f

    .line 427
    .line 428
    .line 429
    const v2, -0x4028f5c3    # -1.68f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x3fd33333    # -2.7f

    .line 436
    .line 437
    .line 438
    const v2, 0x3f8a3d71    # 1.08f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3fb47ae1    # 1.41f

    .line 445
    .line 446
    .line 447
    const v2, 0x402d70a4    # 2.71f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x41a0f5c3    # 20.12f

    .line 454
    .line 455
    .line 456
    const v18, 0x418770a4    # 16.93f

    .line 457
    .line 458
    .line 459
    const v13, 0x41a9ae14    # 21.21f

    .line 460
    .line 461
    .line 462
    const v14, 0x41850a3d    # 16.63f

    .line 463
    .line 464
    .line 465
    const v15, 0x41a51eb8    # 20.64f

    .line 466
    .line 467
    .line 468
    const v16, 0x4189851f    # 17.19f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x417fd70a    # 15.99f

    .line 478
    .line 479
    .line 480
    const v2, 0x417170a4    # 15.09f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x3f233333    # -6.9f

    .line 487
    .line 488
    .line 489
    const v2, 0x3f1eb852    # 0.62f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x3f2e147b    # 0.68f

    .line 496
    .line 497
    .line 498
    const v18, -0x4128f5c3    # -0.42f

    .line 499
    .line 500
    .line 501
    const v13, 0x3cf5c28f    # 0.03f

    .line 502
    .line 503
    .line 504
    const v14, -0x41570a3d    # -0.33f

    .line 505
    .line 506
    .line 507
    const v15, 0x3ebd70a4    # 0.37f

    .line 508
    .line 509
    .line 510
    const v16, -0x40f5c28f    # -0.54f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x4000a3d7    # 2.01f

    .line 517
    .line 518
    .line 519
    const v2, 0x3f4ccccd    # 0.8f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3e9eb852    # 0.31f

    .line 526
    .line 527
    .line 528
    const v18, 0x3f0a3d71    # 0.54f

    .line 529
    .line 530
    .line 531
    const v13, 0x3e6147ae    # 0.22f

    .line 532
    .line 533
    .line 534
    const v14, 0x3db851ec    # 0.09f

    .line 535
    .line 536
    .line 537
    const v15, 0x3eae147b    # 0.34f

    .line 538
    .line 539
    .line 540
    const v16, 0x3e9eb852    # 0.31f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x40bf5c29    # 5.98f

    .line 547
    .line 548
    .line 549
    const v2, -0x3fe66666    # -2.4f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x417170a4    # 15.09f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x40f5c28f    # 7.68f

    .line 565
    .line 566
    .line 567
    const v2, 0x417fd70a    # 15.99f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x3f40a3d7    # -5.98f

    .line 574
    .line 575
    .line 576
    const v2, -0x3fe66666    # -2.4f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, 0x40b2e148    # 5.59f

    .line 583
    .line 584
    .line 585
    const v18, 0x4117851f    # 9.47f

    .line 586
    .line 587
    .line 588
    const/high16 v13, 0x40a80000    # 5.25f

    .line 589
    .line 590
    const v14, 0x411c7ae1    # 9.78f

    .line 591
    .line 592
    .line 593
    const v15, 0x40abd70a    # 5.37f

    .line 594
    .line 595
    .line 596
    const v16, 0x4118f5c3    # 9.56f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x4000a3d7    # 2.01f

    .line 603
    .line 604
    .line 605
    const v2, -0x40b33333    # -0.8f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3f2e147b    # 0.68f

    .line 612
    .line 613
    .line 614
    const v18, 0x3ed70a3d    # 0.42f

    .line 615
    .line 616
    .line 617
    const v13, 0x3e9eb852    # 0.31f

    .line 618
    .line 619
    .line 620
    const v14, -0x420a3d71    # -0.12f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f266666    # 0.65f

    .line 624
    .line 625
    .line 626
    const v16, 0x3da3d70a    # 0.08f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x40dccccd    # 6.9f

    .line 633
    .line 634
    .line 635
    const v2, 0x3f1eb852    # 0.62f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x40f5c28f    # 7.68f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x40447ae1    # 3.07f

    .line 651
    .line 652
    .line 653
    const v2, 0x4180cccd    # 16.1f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, -0x3fd1eb85    # -2.72f

    .line 660
    .line 661
    .line 662
    const v2, 0x3fb47ae1    # 1.41f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x3f8a3d71    # 1.08f

    .line 669
    .line 670
    .line 671
    const v2, 0x402d70a4    # 2.71f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x3f570a3d    # 0.84f

    .line 678
    .line 679
    .line 680
    const v2, -0x4028f5c3    # -1.68f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v17, 0x40447ae1    # 3.07f

    .line 687
    .line 688
    .line 689
    const v18, 0x4180cccd    # 16.1f

    .line 690
    .line 691
    .line 692
    const v13, 0x40570a3d    # 3.36f

    .line 693
    .line 694
    .line 695
    const v14, 0x4189851f    # 17.19f

    .line 696
    .line 697
    .line 698
    const v15, 0x40328f5c    # 2.79f

    .line 699
    .line 700
    .line 701
    const v16, 0x41850a3d    # 16.63f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, 0x40f147ae    # 7.54f

    .line 711
    .line 712
    .line 713
    const v2, 0x41226666    # 10.15f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v17, 0x3f000000    # 0.5f

    .line 720
    .line 721
    const v18, -0x40f5c28f    # -0.54f

    .line 722
    .line 723
    .line 724
    const v13, -0x430a3d71    # -0.03f

    .line 725
    .line 726
    .line 727
    const v14, -0x416147ae    # -0.31f

    .line 728
    .line 729
    .line 730
    const v15, 0x3e6b851f    # 0.23f

    .line 731
    .line 732
    .line 733
    const v16, -0x40f5c28f    # -0.54f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, 0x402d70a4    # 2.71f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v18, 0x3f0a3d71    # 0.54f

    .line 746
    .line 747
    .line 748
    const v13, 0x3e8a3d71    # 0.27f

    .line 749
    .line 750
    .line 751
    const/4 v14, 0x0

    .line 752
    const v15, 0x3f07ae14    # 0.53f

    .line 753
    .line 754
    .line 755
    const v16, 0x3e6b851f    # 0.23f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, -0x40bae148    # -0.77f

    .line 762
    .line 763
    .line 764
    const v2, 0x41073333    # 8.45f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, -0x3ff51eb8    # -2.17f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x40f147ae    # 7.54f

    .line 777
    .line 778
    .line 779
    const v2, 0x41226666    # 10.15f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const/16 v16, 0x3800

    .line 793
    .line 794
    const/16 v17, 0x0

    .line 795
    .line 796
    const/high16 v6, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/high16 v8, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v7, 0x0

    .line 801
    const/high16 v9, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const/high16 v12, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v13, 0x0

    .line 806
    const/4 v15, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    sput-object v0, Landroidx/compose/material/icons/outlined/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 818
    .line 819
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    return-object v0
.end method
