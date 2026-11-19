.class public final Landroidx/compose/material/icons/outlined/WavingHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wavingHand",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WavingHand",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getWavingHand",
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
        "SMAP\nWavingHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/outlined/WavingHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 WavingHand.kt\nandroidx/compose/material/icons/outlined/WavingHandKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n30#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWavingHand(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.WavingHand"

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
    const v0, 0x40e0f5c3    # 7.03f

    .line 71
    .line 72
    .line 73
    const v2, 0x409e6666    # 4.95f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x405f5c29    # 3.49f

    .line 80
    .line 81
    .line 82
    const v2, 0x4107d70a    # 8.49f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, 0x414051ec    # 12.02f

    .line 91
    .line 92
    .line 93
    const v13, -0x3fab851f    # -3.32f

    .line 94
    .line 95
    .line 96
    const v14, 0x40547ae1    # 3.32f

    .line 97
    .line 98
    .line 99
    const v15, -0x3fab851f    # -3.32f

    .line 100
    .line 101
    .line 102
    const v16, 0x410b3333    # 8.7f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x40547ae1    # 3.32f

    .line 109
    .line 110
    .line 111
    const v2, 0x414051ec    # 12.02f

    .line 112
    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    const v6, 0x410b3333    # 8.7f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, -0x3f3fae14    # -6.01f

    .line 122
    .line 123
    .line 124
    const v2, 0x40c051ec    # 6.01f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v18, -0x3f9d70a4    # -3.54f

    .line 131
    .line 132
    .line 133
    const v13, 0x3f7851ec    # 0.97f

    .line 134
    .line 135
    .line 136
    const v14, -0x4087ae14    # -0.97f

    .line 137
    .line 138
    .line 139
    const v15, 0x3f7851ec    # 0.97f

    .line 140
    .line 141
    .line 142
    const v16, -0x3fdc28f6    # -2.56f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x413851ec    # -0.39f

    .line 149
    .line 150
    .line 151
    const v18, -0x415c28f6    # -0.32f

    .line 152
    .line 153
    .line 154
    const v13, -0x420a3d71    # -0.12f

    .line 155
    .line 156
    .line 157
    const v14, -0x420a3d71    # -0.12f

    .line 158
    .line 159
    .line 160
    const/high16 v15, -0x41800000    # -0.25f

    .line 161
    .line 162
    const v16, -0x41947ae1    # -0.23f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x3ec7ae14    # 0.39f

    .line 169
    .line 170
    .line 171
    const v2, -0x413851ec    # -0.39f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const v18, -0x3f9d70a4    # -3.54f

    .line 180
    .line 181
    .line 182
    const v13, 0x3f7851ec    # 0.97f

    .line 183
    .line 184
    .line 185
    const v14, -0x4087ae14    # -0.97f

    .line 186
    .line 187
    .line 188
    const v15, 0x3f7851ec    # 0.97f

    .line 189
    .line 190
    .line 191
    const v16, -0x3fdc28f6    # -2.56f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x40f5c28f    # -0.54f

    .line 198
    .line 199
    .line 200
    const v18, -0x412e147b    # -0.41f

    .line 201
    .line 202
    .line 203
    const v13, -0x41dc28f6    # -0.16f

    .line 204
    .line 205
    .line 206
    const v14, -0x41dc28f6    # -0.16f

    .line 207
    .line 208
    .line 209
    const v15, -0x414ccccd    # -0.35f

    .line 210
    .line 211
    .line 212
    const v16, -0x41666666    # -0.3f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x40fae148    # -0.52f

    .line 219
    .line 220
    .line 221
    const v18, -0x3fceb852    # -2.77f

    .line 222
    .line 223
    .line 224
    const v13, 0x3ecccccd    # 0.4f

    .line 225
    .line 226
    .line 227
    const v14, -0x40947ae1    # -0.92f

    .line 228
    .line 229
    .line 230
    const v15, 0x3e6b851f    # 0.23f

    .line 231
    .line 232
    .line 233
    const v16, -0x3ffeb852    # -2.02f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x3fb33333    # -3.2f

    .line 240
    .line 241
    .line 242
    const v18, -0x4170a3d7    # -0.28f

    .line 243
    .line 244
    .line 245
    const v13, -0x40a147ae    # -0.87f

    .line 246
    .line 247
    .line 248
    const v14, -0x40a147ae    # -0.87f

    .line 249
    .line 250
    .line 251
    const v15, -0x3ff1eb85    # -2.22f

    .line 252
    .line 253
    .line 254
    const v16, -0x408a3d71    # -0.96f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, -0x4151eb85    # -0.34f

    .line 261
    .line 262
    .line 263
    const v18, -0x4128f5c3    # -0.42f

    .line 264
    .line 265
    .line 266
    const v13, -0x42333333    # -0.1f

    .line 267
    .line 268
    .line 269
    const v14, -0x41e66666    # -0.15f

    .line 270
    .line 271
    .line 272
    const v15, -0x41a8f5c3    # -0.21f

    .line 273
    .line 274
    .line 275
    const v16, -0x416b851f    # -0.29f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x3f9d70a4    # -3.54f

    .line 282
    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const v13, -0x4087ae14    # -0.97f

    .line 287
    .line 288
    .line 289
    const v14, -0x4087ae14    # -0.97f

    .line 290
    .line 291
    .line 292
    const v15, -0x3fdc28f6    # -2.56f

    .line 293
    .line 294
    .line 295
    const v16, -0x4087ae14    # -0.97f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, -0x3fdf5c29    # -2.51f

    .line 302
    .line 303
    .line 304
    const v2, 0x4020a3d7    # 2.51f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x415c28f6    # -0.32f

    .line 311
    .line 312
    .line 313
    const v18, -0x413851ec    # -0.39f

    .line 314
    .line 315
    .line 316
    const v13, -0x4247ae14    # -0.09f

    .line 317
    .line 318
    .line 319
    const v14, -0x41f0a3d7    # -0.14f

    .line 320
    .line 321
    .line 322
    const v15, -0x41b33333    # -0.2f

    .line 323
    .line 324
    .line 325
    const v16, -0x4175c28f    # -0.27f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x40e0f5c3    # 7.03f

    .line 332
    .line 333
    .line 334
    const v18, 0x409e6666    # 4.95f

    .line 335
    .line 336
    .line 337
    const v13, 0x411947ae    # 9.58f

    .line 338
    .line 339
    .line 340
    const v14, 0x407eb852    # 3.98f

    .line 341
    .line 342
    .line 343
    const/high16 v15, 0x41000000    # 8.0f

    .line 344
    .line 345
    const v16, 0x407eb852    # 3.98f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x40cbd70a    # 6.37f

    .line 355
    .line 356
    .line 357
    const v2, 0x41070a3d    # 8.44f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x3f35c28f    # 0.71f

    .line 364
    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const v13, 0x3e4ccccd    # 0.2f

    .line 369
    .line 370
    .line 371
    const v14, -0x41b33333    # -0.2f

    .line 372
    .line 373
    .line 374
    const v15, 0x3f028f5c    # 0.51f

    .line 375
    .line 376
    .line 377
    const v16, -0x41b33333    # -0.2f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v18, 0x3f35c28f    # 0.71f

    .line 386
    .line 387
    .line 388
    const v14, 0x3e4ccccd    # 0.2f

    .line 389
    .line 390
    .line 391
    const v15, 0x3e4ccccd    # 0.2f

    .line 392
    .line 393
    .line 394
    const v16, 0x3f028f5c    # 0.51f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x3fb47ae1    # -3.18f

    .line 401
    .line 402
    .line 403
    const v2, 0x404b851f    # 3.18f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v18, 0x4087ae14    # 4.24f

    .line 410
    .line 411
    .line 412
    const v13, 0x3f95c28f    # 1.17f

    .line 413
    .line 414
    .line 415
    const v14, 0x3f95c28f    # 1.17f

    .line 416
    .line 417
    .line 418
    const v15, 0x3f95c28f    # 1.17f

    .line 419
    .line 420
    .line 421
    const v16, 0x40447ae1    # 3.07f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3fb47ae1    # 1.41f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3f8f5c29    # 1.12f

    .line 434
    .line 435
    .line 436
    const v18, -0x3f547ae1    # -5.36f

    .line 437
    .line 438
    .line 439
    const v13, 0x3fb9999a    # 1.45f

    .line 440
    .line 441
    .line 442
    const v14, -0x40466666    # -1.45f

    .line 443
    .line 444
    .line 445
    const v15, 0x3fe8f5c3    # 1.82f

    .line 446
    .line 447
    .line 448
    const v16, -0x3f9b851f    # -3.57f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x40c9999a    # 6.3f

    .line 455
    .line 456
    .line 457
    const v2, -0x3f366666    # -6.3f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x3f35c28f    # 0.71f

    .line 464
    .line 465
    .line 466
    const/16 v18, 0x0

    .line 467
    .line 468
    const v13, 0x3e4ccccd    # 0.2f

    .line 469
    .line 470
    .line 471
    const v14, -0x41b33333    # -0.2f

    .line 472
    .line 473
    .line 474
    const v15, 0x3f028f5c    # 0.51f

    .line 475
    .line 476
    .line 477
    const v16, -0x41b33333    # -0.2f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x3f028f5c    # 0.51f

    .line 484
    .line 485
    .line 486
    const v2, 0x3f35c28f    # 0.71f

    .line 487
    .line 488
    .line 489
    const v6, 0x3e4ccccd    # 0.2f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x3f6ccccd    # -4.6f

    .line 496
    .line 497
    .line 498
    const v2, 0x40933333    # 4.6f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3fb47ae1    # 1.41f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, -0x3f3fae14    # -6.01f

    .line 511
    .line 512
    .line 513
    const v2, 0x40c051ec    # 6.01f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/16 v17, 0x0

    .line 523
    .line 524
    const v18, 0x3f35c28f    # 0.71f

    .line 525
    .line 526
    .line 527
    const v14, 0x3e4ccccd    # 0.2f

    .line 528
    .line 529
    .line 530
    const v15, 0x3e4ccccd    # 0.2f

    .line 531
    .line 532
    .line 533
    const v16, 0x3f028f5c    # 0.51f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x3fb47ae1    # 1.41f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, -0x3f61999a    # -4.95f

    .line 549
    .line 550
    .line 551
    const v2, 0x409e6666    # 4.95f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, 0x3f35c28f    # 0.71f

    .line 558
    .line 559
    .line 560
    const/16 v18, 0x0

    .line 561
    .line 562
    const v14, -0x41b33333    # -0.2f

    .line 563
    .line 564
    .line 565
    const v15, 0x3f028f5c    # 0.51f

    .line 566
    .line 567
    .line 568
    const v16, -0x41b33333    # -0.2f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/16 v17, 0x0

    .line 575
    .line 576
    const v18, 0x3f35c28f    # 0.71f

    .line 577
    .line 578
    .line 579
    const v14, 0x3e4ccccd    # 0.2f

    .line 580
    .line 581
    .line 582
    const v15, 0x3e4ccccd    # 0.2f

    .line 583
    .line 584
    .line 585
    const v16, 0x3f028f5c    # 0.51f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x3f4ae148    # -5.66f

    .line 592
    .line 593
    .line 594
    const v2, 0x40b51eb8    # 5.66f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x3fb47ae1    # 1.41f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x40628f5c    # 3.54f

    .line 607
    .line 608
    .line 609
    const v2, -0x3f9d70a4    # -3.54f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, 0x3f35c28f    # 0.71f

    .line 616
    .line 617
    .line 618
    const/16 v18, 0x0

    .line 619
    .line 620
    const v14, -0x41b33333    # -0.2f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f028f5c    # 0.51f

    .line 624
    .line 625
    .line 626
    const v16, -0x41b33333    # -0.2f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    const v18, 0x3f35c28f    # 0.71f

    .line 635
    .line 636
    .line 637
    const v14, 0x3e4ccccd    # 0.2f

    .line 638
    .line 639
    .line 640
    const v15, 0x3e4ccccd    # 0.2f

    .line 641
    .line 642
    .line 643
    const v16, 0x3f028f5c    # 0.51f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x4161999a    # 14.1f

    .line 650
    .line 651
    .line 652
    const v2, 0x4198cccd    # 19.1f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, -0x3eecf5c3    # -9.19f

    .line 659
    .line 660
    .line 661
    const/16 v18, 0x0

    .line 662
    .line 663
    const v13, -0x3fdd70a4    # -2.54f

    .line 664
    .line 665
    .line 666
    const v14, 0x40228f5c    # 2.54f

    .line 667
    .line 668
    .line 669
    const v15, -0x3f2b3333    # -6.65f

    .line 670
    .line 671
    .line 672
    const v16, 0x40228f5c    # 2.54f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, -0x3f2b3333    # -6.65f

    .line 679
    .line 680
    .line 681
    const v2, -0x3eecf5c3    # -9.19f

    .line 682
    .line 683
    .line 684
    const v6, -0x3fdd70a4    # -2.54f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x40cbd70a    # 6.37f

    .line 691
    .line 692
    .line 693
    const v2, 0x41070a3d    # 8.44f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x41880000    # 17.0f

    .line 703
    .line 704
    const/high16 v2, 0x41b80000    # 23.0f

    .line 705
    .line 706
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v17, -0x3f400000    # -6.0f

    .line 710
    .line 711
    const/high16 v18, 0x40c00000    # 6.0f

    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    const v14, 0x4053d70a    # 3.31f

    .line 715
    .line 716
    .line 717
    const v15, -0x3fd3d70a    # -2.69f

    .line 718
    .line 719
    .line 720
    const/high16 v16, 0x40c00000    # 6.0f

    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v0, -0x40400000    # -1.5f

    .line 726
    .line 727
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x40900000    # 4.5f

    .line 731
    .line 732
    const/high16 v18, -0x3f700000    # -4.5f

    .line 733
    .line 734
    const v13, 0x401eb852    # 2.48f

    .line 735
    .line 736
    .line 737
    const/4 v14, 0x0

    .line 738
    const/high16 v15, 0x40900000    # 4.5f

    .line 739
    .line 740
    const v16, -0x3ffeb852    # -2.02f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v0, 0x41b80000    # 23.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v0, 0x40e00000    # 7.0f

    .line 755
    .line 756
    const/high16 v2, 0x3f800000    # 1.0f

    .line 757
    .line 758
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v17, 0x40c00000    # 6.0f

    .line 762
    .line 763
    const/high16 v18, -0x3f400000    # -6.0f

    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const v14, -0x3fac28f6    # -3.31f

    .line 767
    .line 768
    .line 769
    const v15, 0x402c28f6    # 2.69f

    .line 770
    .line 771
    .line 772
    const/high16 v16, -0x3f400000    # -6.0f

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 778
    .line 779
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const/high16 v17, 0x40200000    # 2.5f

    .line 783
    .line 784
    const/high16 v18, 0x40e00000    # 7.0f

    .line 785
    .line 786
    const v13, 0x4090a3d7    # 4.52f

    .line 787
    .line 788
    .line 789
    const/high16 v14, 0x40200000    # 2.5f

    .line 790
    .line 791
    const/high16 v15, 0x40200000    # 2.5f

    .line 792
    .line 793
    const v16, 0x4090a3d7    # 4.52f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/high16 v0, 0x3f800000    # 1.0f

    .line 800
    .line 801
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    const/16 v16, 0x3800

    .line 812
    .line 813
    const/16 v17, 0x0

    .line 814
    .line 815
    const/high16 v6, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/high16 v8, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const/4 v7, 0x0

    .line 820
    const/high16 v9, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/high16 v12, 0x3f800000    # 1.0f

    .line 823
    .line 824
    const/4 v13, 0x0

    .line 825
    const/4 v14, 0x0

    .line 826
    const/4 v15, 0x0

    .line 827
    const-string v4, ""

    .line 828
    .line 829
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    sput-object v0, Landroidx/compose/material/icons/outlined/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 838
    .line 839
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    return-object v0
.end method
