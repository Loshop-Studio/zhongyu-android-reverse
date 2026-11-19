.class public final Landroidx/compose/material/icons/rounded/NetworkCheckKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_networkCheck",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NetworkCheck",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNetworkCheck",
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
        "SMAP\nNetworkCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkCheck.kt\nandroidx/compose/material/icons/rounded/NetworkCheckKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 NetworkCheck.kt\nandroidx/compose/material/icons/rounded/NetworkCheckKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNetworkCheck(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NetworkCheckKt;->_networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NetworkCheck"

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
    const v0, 0x417e6666    # 15.9f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x412e147b    # -0.41f

    .line 79
    .line 80
    .line 81
    const v18, 0x3e6b851f    # 0.23f

    .line 82
    .line 83
    .line 84
    const v13, -0x41d1eb85    # -0.17f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x415c28f6    # -0.32f

    .line 89
    .line 90
    .line 91
    const v16, 0x3db851ec    # 0.09f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, -0x4270a3d7    # -0.07f

    .line 98
    .line 99
    .line 100
    const v2, 0x3e19999a    # 0.15f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, -0x3f5a3d71    # -5.18f

    .line 107
    .line 108
    .line 109
    const v2, 0x413a6666    # 11.65f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, -0x417ae148    # -0.26f

    .line 116
    .line 117
    .line 118
    const v18, 0x3f75c28f    # 0.96f

    .line 119
    .line 120
    .line 121
    const v13, -0x41dc28f6    # -0.16f

    .line 122
    .line 123
    .line 124
    const v14, 0x3e947ae1    # 0.29f

    .line 125
    .line 126
    .line 127
    const v15, -0x417ae148    # -0.26f

    .line 128
    .line 129
    .line 130
    const v16, 0x3f1c28f6    # 0.61f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x4000a3d7    # 2.01f

    .line 137
    .line 138
    .line 139
    const v18, 0x4000a3d7    # 2.01f

    .line 140
    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8e147b    # 1.11f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const v16, 0x4000a3d7    # 2.01f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3ffae148    # 1.96f

    .line 156
    .line 157
    .line 158
    const v18, -0x40347ae1    # -1.59f

    .line 159
    .line 160
    .line 161
    const v13, 0x3f75c28f    # 0.96f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, 0x3fe28f5c    # 1.77f

    .line 166
    .line 167
    .line 168
    const v16, -0x40d1eb85    # -0.68f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3c23d70a    # 0.01f

    .line 175
    .line 176
    .line 177
    const v2, -0x430a3d71    # -0.03f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x41833333    # 16.4f

    .line 184
    .line 185
    .line 186
    const/high16 v2, 0x40b00000    # 5.5f

    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, -0x41000000    # -0.5f

    .line 192
    .line 193
    const/high16 v18, -0x41000000    # -0.5f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, -0x4170a3d7    # -0.28f

    .line 197
    .line 198
    .line 199
    const v15, -0x419eb852    # -0.22f

    .line 200
    .line 201
    .line 202
    const/high16 v16, -0x41000000    # -0.5f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x4003d70a    # 2.06f

    .line 211
    .line 212
    .line 213
    const v2, 0x4120f5c3    # 10.06f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3ff1eb85    # 1.89f

    .line 220
    .line 221
    .line 222
    const v18, 0x3db851ec    # 0.09f

    .line 223
    .line 224
    .line 225
    const v13, 0x3f028f5c    # 0.51f

    .line 226
    .line 227
    .line 228
    const v14, 0x3f028f5c    # 0.51f

    .line 229
    .line 230
    .line 231
    const v15, 0x3faa3d71    # 1.33f

    .line 232
    .line 233
    .line 234
    const v16, 0x3f0ccccd    # 0.55f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x411947ae    # 9.58f

    .line 241
    .line 242
    .line 243
    const v18, -0x3fcf5c29    # -2.76f

    .line 244
    .line 245
    .line 246
    const v13, 0x4030a3d7    # 2.76f

    .line 247
    .line 248
    .line 249
    const v14, -0x3fef5c29    # -2.26f

    .line 250
    .line 251
    .line 252
    const v15, 0x40c7ae14    # 6.24f

    .line 253
    .line 254
    .line 255
    const v16, -0x3fb47ae1    # -3.18f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x3f9851ec    # 1.19f

    .line 262
    .line 263
    .line 264
    const v2, -0x3fd47ae1    # -2.68f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x3eb6e148    # -12.57f

    .line 271
    .line 272
    .line 273
    const/high16 v18, 0x40500000    # 3.25f

    .line 274
    .line 275
    const v13, -0x3f74cccd    # -4.35f

    .line 276
    .line 277
    .line 278
    const v14, -0x40b851ec    # -0.78f

    .line 279
    .line 280
    .line 281
    const v15, -0x3ef0a3d7    # -8.96f

    .line 282
    .line 283
    .line 284
    const v16, 0x3e99999a    # 0.3f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x4247ae14    # -0.09f

    .line 291
    .line 292
    .line 293
    const v18, 0x40066666    # 2.1f

    .line 294
    .line 295
    .line 296
    const v13, -0x40dc28f6    # -0.64f

    .line 297
    .line 298
    .line 299
    const v14, 0x3f07ae14    # 0.53f

    .line 300
    .line 301
    .line 302
    const v15, -0x40d1eb85    # -0.68f

    .line 303
    .line 304
    .line 305
    const v16, 0x3fc147ae    # 1.51f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x41af851f    # 21.94f

    .line 315
    .line 316
    .line 317
    const v2, 0x4120f5c3    # 10.06f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, -0x42333333    # -0.1f

    .line 324
    .line 325
    .line 326
    const v18, -0x3ff9999a    # -2.1f

    .line 327
    .line 328
    .line 329
    const v13, 0x3f170a3d    # 0.59f

    .line 330
    .line 331
    .line 332
    const v14, -0x40e8f5c3    # -0.59f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f0ccccd    # 0.55f

    .line 336
    .line 337
    .line 338
    const v16, -0x40370a3d    # -1.57f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x3f71eb85    # -4.44f

    .line 345
    .line 346
    .line 347
    const v18, -0x3fde147b    # -2.53f

    .line 348
    .line 349
    .line 350
    const v13, -0x4051eb85    # -1.36f

    .line 351
    .line 352
    .line 353
    const v14, -0x4071eb85    # -1.11f

    .line 354
    .line 355
    .line 356
    const v15, -0x3fc8f5c3    # -2.86f

    .line 357
    .line 358
    .line 359
    const v16, -0x40066666    # -1.95f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x40f851ec    # -0.53f

    .line 366
    .line 367
    .line 368
    const v2, 0x40347ae1    # 2.82f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x404ae148    # 3.17f

    .line 375
    .line 376
    .line 377
    const v18, 0x3ff1eb85    # 1.89f

    .line 378
    .line 379
    .line 380
    const v13, 0x3f90a3d7    # 1.13f

    .line 381
    .line 382
    .line 383
    const v14, 0x3ef0a3d7    # 0.47f

    .line 384
    .line 385
    .line 386
    const v15, 0x400c28f6    # 2.19f

    .line 387
    .line 388
    .line 389
    const v16, 0x3f8b851f    # 1.09f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x3ff33333    # 1.9f

    .line 396
    .line 397
    .line 398
    const v18, -0x425c28f6    # -0.08f

    .line 399
    .line 400
    .line 401
    const v13, 0x3f147ae1    # 0.58f

    .line 402
    .line 403
    .line 404
    const v14, 0x3eeb851f    # 0.46f

    .line 405
    .line 406
    .line 407
    const v15, 0x3fb1eb85    # 1.39f

    .line 408
    .line 409
    .line 410
    const v16, 0x3edc28f6    # 0.43f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x418f47ae    # 17.91f

    .line 420
    .line 421
    .line 422
    const v2, 0x416170a4    # 14.09f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x41f0a3d7    # -0.14f

    .line 429
    .line 430
    .line 431
    const v18, -0x3ff851ec    # -2.12f

    .line 432
    .line 433
    .line 434
    const v13, 0x3f19999a    # 0.6f

    .line 435
    .line 436
    .line 437
    const v14, -0x40e66666    # -0.6f

    .line 438
    .line 439
    .line 440
    const v15, 0x3f0f5c29    # 0.56f

    .line 441
    .line 442
    .line 443
    const v16, -0x402f5c29    # -1.63f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x4047ae14    # -1.44f

    .line 450
    .line 451
    .line 452
    const v18, -0x40a3d70a    # -0.86f

    .line 453
    .line 454
    .line 455
    const v13, -0x41147ae1    # -0.46f

    .line 456
    .line 457
    .line 458
    const v14, -0x41570a3d    # -0.33f

    .line 459
    .line 460
    .line 461
    const v15, -0x408f5c29    # -0.94f

    .line 462
    .line 463
    .line 464
    const v16, -0x40e3d70a    # -0.61f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x40f33333    # -0.55f

    .line 471
    .line 472
    .line 473
    const v2, 0x403ae148    # 2.92f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, 0x3ea3d70a    # 0.32f

    .line 480
    .line 481
    .line 482
    const v18, 0x3e6147ae    # 0.22f

    .line 483
    .line 484
    .line 485
    const v13, 0x3de147ae    # 0.11f

    .line 486
    .line 487
    .line 488
    const v14, 0x3d8f5c29    # 0.07f

    .line 489
    .line 490
    .line 491
    const v15, 0x3e6147ae    # 0.22f

    .line 492
    .line 493
    .line 494
    const v16, 0x3e0f5c29    # 0.14f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3fe7ae14    # 1.81f

    .line 501
    .line 502
    .line 503
    const v18, -0x41dc28f6    # -0.16f

    .line 504
    .line 505
    .line 506
    const v13, 0x3f11eb85    # 0.57f

    .line 507
    .line 508
    .line 509
    const v14, 0x3ecccccd    # 0.4f

    .line 510
    .line 511
    .line 512
    const v15, 0x3faa3d71    # 1.33f

    .line 513
    .line 514
    .line 515
    const v16, 0x3ea3d70a    # 0.32f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x40c28f5c    # 6.08f

    .line 525
    .line 526
    .line 527
    const v2, 0x416147ae    # 14.08f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3feccccd    # 1.85f

    .line 534
    .line 535
    .line 536
    const v18, 0x3e051eb8    # 0.13f

    .line 537
    .line 538
    .line 539
    const/high16 v13, 0x3f000000    # 0.5f

    .line 540
    .line 541
    const/high16 v14, 0x3f000000    # 0.5f

    .line 542
    .line 543
    const v15, 0x3fa28f5c    # 1.27f

    .line 544
    .line 545
    .line 546
    const v16, 0x3f0a3d71    # 0.54f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x40466666    # 3.1f

    .line 553
    .line 554
    .line 555
    const v18, -0x4063d70a    # -1.22f

    .line 556
    .line 557
    .line 558
    const v13, 0x3f70a3d7    # 0.94f

    .line 559
    .line 560
    .line 561
    const v14, -0x40d70a3d    # -0.66f

    .line 562
    .line 563
    .line 564
    const v15, 0x4000a3d7    # 2.01f

    .line 565
    .line 566
    .line 567
    const v16, -0x407851ec    # -1.06f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3fa3d70a    # 1.28f

    .line 574
    .line 575
    .line 576
    const v2, -0x3fc7ae14    # -2.88f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, -0x3f3d1eb8    # -6.09f

    .line 583
    .line 584
    .line 585
    const v18, 0x3feb851f    # 1.84f

    .line 586
    .line 587
    .line 588
    const v13, -0x3ff7ae14    # -2.13f

    .line 589
    .line 590
    .line 591
    const v14, -0x428a3d71    # -0.06f

    .line 592
    .line 593
    .line 594
    const v15, -0x3f770a3d    # -4.28f

    .line 595
    .line 596
    .line 597
    const v16, 0x3f0a3d71    # 0.54f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x41f0a3d7    # -0.14f

    .line 604
    .line 605
    .line 606
    const v18, 0x400851ec    # 2.13f

    .line 607
    .line 608
    .line 609
    const v13, -0x40cf5c29    # -0.69f

    .line 610
    .line 611
    .line 612
    const v14, 0x3f028f5c    # 0.51f

    .line 613
    .line 614
    .line 615
    const v15, -0x40c28f5c    # -0.74f

    .line 616
    .line 617
    .line 618
    const v16, 0x3fc3d70a    # 1.53f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v9, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v12, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/4 v13, 0x0

    .line 645
    const/4 v14, 0x0

    .line 646
    const/4 v15, 0x0

    .line 647
    const-string v4, ""

    .line 648
    .line 649
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    sput-object v0, Landroidx/compose/material/icons/rounded/NetworkCheckKt;->_networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    return-object v0
.end method
