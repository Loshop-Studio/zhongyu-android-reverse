.class public final Landroidx/compose/material/icons/rounded/WavesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_waves",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Waves",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWaves",
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
        "SMAP\nWaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/rounded/WavesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,133:1\n212#2,12:134\n233#2,18:147\n253#2:184\n174#3:146\n705#4,2:165\n717#4,2:167\n719#4,11:173\n72#5,4:169\n*S KotlinDebug\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/rounded/WavesKt\n*L\n29#1:134,12\n30#1:147,18\n30#1:184\n29#1:146\n30#1:165,2\n30#1:167,2\n30#1:173,11\n30#1:169,4\n*E\n"
    }
.end annotation


# static fields
.field private static _waves:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaves(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WavesKt;->_waves:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Waves"

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
    const v0, 0x4187eb85    # 16.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3fc33333    # -2.95f

    .line 79
    .line 80
    .line 81
    const v18, 0x3f4ccccd    # 0.8f

    .line 82
    .line 83
    .line 84
    const v13, -0x40533333    # -1.35f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x3ff33333    # -2.2f

    .line 89
    .line 90
    .line 91
    const v16, 0x3ed70a3d    # 0.42f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3ffccccd    # -2.05f

    .line 98
    .line 99
    .line 100
    const v18, 0x3f19999a    # 0.6f

    .line 101
    .line 102
    .line 103
    const v13, -0x40d9999a    # -0.65f

    .line 104
    .line 105
    .line 106
    const v14, 0x3ea8f5c3    # 0.33f

    .line 107
    .line 108
    .line 109
    const v15, -0x4068f5c3    # -1.18f

    .line 110
    .line 111
    .line 112
    const v16, 0x3f19999a    # 0.6f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v18, -0x40e66666    # -0.6f

    .line 119
    .line 120
    .line 121
    const v13, -0x4099999a    # -0.9f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const v15, -0x404ccccd    # -1.4f

    .line 126
    .line 127
    .line 128
    const/high16 v16, -0x41800000    # -0.25f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x3fc33333    # -2.95f

    .line 134
    .line 135
    .line 136
    const v18, -0x40b33333    # -0.8f

    .line 137
    .line 138
    .line 139
    const/high16 v13, -0x40c00000    # -0.75f

    .line 140
    .line 141
    const v14, -0x413d70a4    # -0.38f

    .line 142
    .line 143
    .line 144
    const v15, -0x40370a3d    # -1.57f

    .line 145
    .line 146
    .line 147
    const v16, -0x40b33333    # -0.8f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x3ed70a3d    # 0.42f

    .line 154
    .line 155
    .line 156
    const v2, 0x3f4ccccd    # 0.8f

    .line 157
    .line 158
    .line 159
    const v4, -0x3fc33333    # -2.95f

    .line 160
    .line 161
    .line 162
    const v6, -0x3ff33333    # -2.2f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, -0x405d70a4    # -1.27f

    .line 169
    .line 170
    .line 171
    const v18, 0x3f051eb8    # 0.52f

    .line 172
    .line 173
    .line 174
    const v13, -0x4123d70a    # -0.43f

    .line 175
    .line 176
    .line 177
    const v14, 0x3e6147ae    # 0.22f

    .line 178
    .line 179
    .line 180
    const v15, -0x40b0a3d7    # -0.81f

    .line 181
    .line 182
    .line 183
    const v16, 0x3ed1eb85    # 0.41f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x40b851ec    # -0.78f

    .line 190
    .line 191
    .line 192
    const v18, 0x3f68f5c3    # 0.91f

    .line 193
    .line 194
    .line 195
    const v13, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    const v14, 0x3dcccccd    # 0.1f

    .line 199
    .line 200
    .line 201
    const v15, -0x40b851ec    # -0.78f

    .line 202
    .line 203
    .line 204
    const v16, 0x3eeb851f    # 0.46f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x3dcccccd    # 0.1f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x3f91eb85    # 1.14f

    .line 217
    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const v14, 0x3f19999a    # 0.6f

    .line 221
    .line 222
    .line 223
    const v15, 0x3f0f5c29    # 0.56f

    .line 224
    .line 225
    .line 226
    const v16, 0x3f83d70a    # 1.03f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x3fe7ae14    # 1.81f

    .line 233
    .line 234
    .line 235
    const v18, -0x40cf5c29    # -0.69f

    .line 236
    .line 237
    .line 238
    const v13, 0x3f3d70a4    # 0.74f

    .line 239
    .line 240
    .line 241
    const v14, -0x41e66666    # -0.15f

    .line 242
    .line 243
    .line 244
    const v15, 0x3fa66666    # 1.3f

    .line 245
    .line 246
    .line 247
    const v16, -0x4123d70a    # -0.43f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x40033333    # 2.05f

    .line 254
    .line 255
    .line 256
    const v18, -0x40e66666    # -0.6f

    .line 257
    .line 258
    .line 259
    const v13, 0x3f266666    # 0.65f

    .line 260
    .line 261
    .line 262
    const v14, -0x41570a3d    # -0.33f

    .line 263
    .line 264
    .line 265
    const v15, 0x3f95c28f    # 1.17f

    .line 266
    .line 267
    .line 268
    const v16, -0x40e66666    # -0.6f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x3f19999a    # 0.6f

    .line 275
    .line 276
    .line 277
    const v2, 0x40033333    # 2.05f

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x3e800000    # 0.25f

    .line 281
    .line 282
    const v6, 0x3fb33333    # 1.4f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x403ccccd    # 2.95f

    .line 289
    .line 290
    .line 291
    const v18, 0x3f4ccccd    # 0.8f

    .line 292
    .line 293
    .line 294
    const/high16 v13, 0x3f400000    # 0.75f

    .line 295
    .line 296
    const v14, 0x3ec28f5c    # 0.38f

    .line 297
    .line 298
    .line 299
    const v15, 0x3fc8f5c3    # 1.57f

    .line 300
    .line 301
    .line 302
    const v16, 0x3f4ccccd    # 0.8f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x4128f5c3    # -0.42f

    .line 309
    .line 310
    .line 311
    const v2, -0x40b33333    # -0.8f

    .line 312
    .line 313
    .line 314
    const v4, 0x403ccccd    # 2.95f

    .line 315
    .line 316
    .line 317
    const v6, 0x400ccccd    # 2.2f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x40033333    # 2.05f

    .line 324
    .line 325
    .line 326
    const v18, -0x40e66666    # -0.6f

    .line 327
    .line 328
    .line 329
    const v13, 0x3f266666    # 0.65f

    .line 330
    .line 331
    .line 332
    const v14, -0x41570a3d    # -0.33f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f970a3d    # 1.18f

    .line 336
    .line 337
    .line 338
    const v16, -0x40e66666    # -0.6f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v18, 0x3f19999a    # 0.6f

    .line 345
    .line 346
    .line 347
    const v13, 0x3f666666    # 0.9f

    .line 348
    .line 349
    .line 350
    const/4 v14, 0x0

    .line 351
    const v15, 0x3fb33333    # 1.4f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x3e800000    # 0.25f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x3fea3d71    # 1.83f

    .line 360
    .line 361
    .line 362
    const v18, 0x3f333333    # 0.7f

    .line 363
    .line 364
    .line 365
    const v13, 0x3f051eb8    # 0.52f

    .line 366
    .line 367
    .line 368
    const v14, 0x3e851eb8    # 0.26f

    .line 369
    .line 370
    .line 371
    const v15, 0x3f8a3d71    # 1.08f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f0ccccd    # 0.55f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3f8f5c29    # 1.12f

    .line 381
    .line 382
    .line 383
    const v18, -0x40970a3d    # -0.91f

    .line 384
    .line 385
    .line 386
    const v13, 0x3f147ae1    # 0.58f

    .line 387
    .line 388
    .line 389
    const v14, 0x3de147ae    # 0.11f

    .line 390
    .line 391
    .line 392
    const v15, 0x3f8f5c29    # 1.12f

    .line 393
    .line 394
    .line 395
    const v16, -0x41570a3d    # -0.33f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x4247ae14    # -0.09f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x40b5c28f    # -0.79f

    .line 408
    .line 409
    .line 410
    const v18, -0x40947ae1    # -0.92f

    .line 411
    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, -0x41147ae1    # -0.46f

    .line 415
    .line 416
    .line 417
    const v15, -0x4151eb85    # -0.34f

    .line 418
    .line 419
    .line 420
    const v16, -0x40ae147b    # -0.82f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, -0x405eb852    # -1.26f

    .line 427
    .line 428
    .line 429
    const v18, -0x40fae148    # -0.52f

    .line 430
    .line 431
    .line 432
    const v13, -0x41147ae1    # -0.46f

    .line 433
    .line 434
    .line 435
    const v14, -0x42333333    # -0.1f

    .line 436
    .line 437
    .line 438
    const v15, -0x40ab851f    # -0.83f

    .line 439
    .line 440
    .line 441
    const v16, -0x416b851f    # -0.29f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x3fc33333    # -2.95f

    .line 448
    .line 449
    .line 450
    const v18, -0x40b0a3d7    # -0.81f

    .line 451
    .line 452
    .line 453
    const/high16 v13, -0x40c00000    # -0.75f

    .line 454
    .line 455
    const v14, -0x413851ec    # -0.39f

    .line 456
    .line 457
    .line 458
    const v15, -0x40333333    # -1.6f

    .line 459
    .line 460
    .line 461
    const v16, -0x40b0a3d7    # -0.81f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x4148a3d7    # 12.54f

    .line 471
    .line 472
    .line 473
    const/high16 v2, 0x41880000    # 17.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v18, 0x3f4ccccd    # 0.8f

    .line 479
    .line 480
    .line 481
    const v13, -0x40533333    # -1.35f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const v15, -0x3ff33333    # -2.2f

    .line 486
    .line 487
    .line 488
    const v16, 0x3edc28f6    # 0.43f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x3ffccccd    # -2.05f

    .line 495
    .line 496
    .line 497
    const v18, 0x3f19999a    # 0.6f

    .line 498
    .line 499
    .line 500
    const v13, -0x40d9999a    # -0.65f

    .line 501
    .line 502
    .line 503
    const v14, 0x3ea3d70a    # 0.32f

    .line 504
    .line 505
    .line 506
    const v15, -0x4068f5c3    # -1.18f

    .line 507
    .line 508
    .line 509
    const v16, 0x3f19999a    # 0.6f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v18, -0x40e66666    # -0.6f

    .line 516
    .line 517
    .line 518
    const v13, -0x4099999a    # -0.9f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const v15, -0x404ccccd    # -1.4f

    .line 523
    .line 524
    .line 525
    const/high16 v16, -0x41800000    # -0.25f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x3fc33333    # -2.95f

    .line 531
    .line 532
    .line 533
    const v18, -0x40b33333    # -0.8f

    .line 534
    .line 535
    .line 536
    const/high16 v13, -0x40c00000    # -0.75f

    .line 537
    .line 538
    const v14, -0x413d70a4    # -0.38f

    .line 539
    .line 540
    .line 541
    const v15, -0x40370a3d    # -1.57f

    .line 542
    .line 543
    .line 544
    const v16, -0x40b33333    # -0.8f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x3edc28f6    # 0.43f

    .line 551
    .line 552
    .line 553
    const v2, 0x3f4ccccd    # 0.8f

    .line 554
    .line 555
    .line 556
    const v4, -0x3fc33333    # -2.95f

    .line 557
    .line 558
    .line 559
    const v6, -0x3ff33333    # -2.2f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, -0x405c28f6    # -1.28f

    .line 566
    .line 567
    .line 568
    const v18, 0x3f051eb8    # 0.52f

    .line 569
    .line 570
    .line 571
    const v13, -0x4123d70a    # -0.43f

    .line 572
    .line 573
    .line 574
    const v14, 0x3e570a3d    # 0.21f

    .line 575
    .line 576
    .line 577
    const v15, -0x40b0a3d7    # -0.81f

    .line 578
    .line 579
    .line 580
    const v16, 0x3ed1eb85    # 0.41f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, -0x40bae148    # -0.77f

    .line 587
    .line 588
    .line 589
    const v18, 0x3f68f5c3    # 0.91f

    .line 590
    .line 591
    .line 592
    const v13, -0x411eb852    # -0.44f

    .line 593
    .line 594
    .line 595
    const v14, 0x3dcccccd    # 0.1f

    .line 596
    .line 597
    .line 598
    const v15, -0x40bae148    # -0.77f

    .line 599
    .line 600
    .line 601
    const v16, 0x3eeb851f    # 0.46f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x3dcccccd    # 0.1f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x3f8f5c29    # 1.12f

    .line 614
    .line 615
    .line 616
    const/4 v13, 0x0

    .line 617
    const v14, 0x3f170a3d    # 0.59f

    .line 618
    .line 619
    .line 620
    const v15, 0x3f0a3d71    # 0.54f

    .line 621
    .line 622
    .line 623
    const v16, 0x3f83d70a    # 1.03f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, 0x3fea3d71    # 1.83f

    .line 630
    .line 631
    .line 632
    const v18, -0x40cf5c29    # -0.69f

    .line 633
    .line 634
    .line 635
    const/high16 v13, 0x3f400000    # 0.75f

    .line 636
    .line 637
    const v14, -0x41e66666    # -0.15f

    .line 638
    .line 639
    .line 640
    const v15, 0x3fa7ae14    # 1.31f

    .line 641
    .line 642
    .line 643
    const v16, -0x411eb852    # -0.44f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, 0x40033333    # 2.05f

    .line 650
    .line 651
    .line 652
    const v18, -0x40e66666    # -0.6f

    .line 653
    .line 654
    .line 655
    const v13, 0x3f266666    # 0.65f

    .line 656
    .line 657
    .line 658
    const v14, -0x414ccccd    # -0.35f

    .line 659
    .line 660
    .line 661
    const v15, 0x3f933333    # 1.15f

    .line 662
    .line 663
    .line 664
    const v16, -0x40e66666    # -0.6f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x3f19999a    # 0.6f

    .line 671
    .line 672
    .line 673
    const v2, 0x40033333    # 2.05f

    .line 674
    .line 675
    .line 676
    const/high16 v4, 0x3e800000    # 0.25f

    .line 677
    .line 678
    const v6, 0x3fb33333    # 1.4f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, 0x403ccccd    # 2.95f

    .line 685
    .line 686
    .line 687
    const v18, 0x3f4ccccd    # 0.8f

    .line 688
    .line 689
    .line 690
    const/high16 v13, 0x3f400000    # 0.75f

    .line 691
    .line 692
    const v14, 0x3ec28f5c    # 0.38f

    .line 693
    .line 694
    .line 695
    const v15, 0x3fc8f5c3    # 1.57f

    .line 696
    .line 697
    .line 698
    const v16, 0x3f4ccccd    # 0.8f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, -0x4123d70a    # -0.43f

    .line 705
    .line 706
    .line 707
    const v2, -0x40b33333    # -0.8f

    .line 708
    .line 709
    .line 710
    const v4, 0x403ccccd    # 2.95f

    .line 711
    .line 712
    .line 713
    const v6, 0x400ccccd    # 2.2f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, 0x40033333    # 2.05f

    .line 720
    .line 721
    .line 722
    const v18, -0x40e66666    # -0.6f

    .line 723
    .line 724
    .line 725
    const v13, 0x3f266666    # 0.65f

    .line 726
    .line 727
    .line 728
    const v14, -0x414ccccd    # -0.35f

    .line 729
    .line 730
    .line 731
    const v15, 0x3f933333    # 1.15f

    .line 732
    .line 733
    .line 734
    const v16, -0x40e66666    # -0.6f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, 0x3f19999a    # 0.6f

    .line 741
    .line 742
    .line 743
    const v2, 0x40033333    # 2.05f

    .line 744
    .line 745
    .line 746
    const/high16 v4, 0x3e800000    # 0.25f

    .line 747
    .line 748
    const v6, 0x3fb33333    # 1.4f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, 0x3fea3d71    # 1.83f

    .line 755
    .line 756
    .line 757
    const v18, 0x3f333333    # 0.7f

    .line 758
    .line 759
    .line 760
    const v13, 0x3f051eb8    # 0.52f

    .line 761
    .line 762
    .line 763
    const v14, 0x3e851eb8    # 0.26f

    .line 764
    .line 765
    .line 766
    const v15, 0x3f8a3d71    # 1.08f

    .line 767
    .line 768
    .line 769
    const v16, 0x3f0ccccd    # 0.55f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v17, 0x3f8f5c29    # 1.12f

    .line 776
    .line 777
    .line 778
    const v18, -0x40947ae1    # -0.92f

    .line 779
    .line 780
    .line 781
    const v13, 0x3f147ae1    # 0.58f

    .line 782
    .line 783
    .line 784
    const v14, 0x3de147ae    # 0.11f

    .line 785
    .line 786
    .line 787
    const v15, 0x3f8f5c29    # 1.12f

    .line 788
    .line 789
    .line 790
    const v16, -0x41570a3d    # -0.33f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, -0x4247ae14    # -0.09f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v17, -0x40b5c28f    # -0.79f

    .line 803
    .line 804
    .line 805
    const/4 v13, 0x0

    .line 806
    const v14, -0x41147ae1    # -0.46f

    .line 807
    .line 808
    .line 809
    const v15, -0x4151eb85    # -0.34f

    .line 810
    .line 811
    .line 812
    const v16, -0x40ae147b    # -0.82f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v17, -0x405eb852    # -1.26f

    .line 819
    .line 820
    .line 821
    const v18, -0x40fae148    # -0.52f

    .line 822
    .line 823
    .line 824
    const v13, -0x41147ae1    # -0.46f

    .line 825
    .line 826
    .line 827
    const v14, -0x42333333    # -0.1f

    .line 828
    .line 829
    .line 830
    const v15, -0x40ab851f    # -0.83f

    .line 831
    .line 832
    .line 833
    const v16, -0x416b851f    # -0.29f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v17, -0x3fc33333    # -2.95f

    .line 840
    .line 841
    .line 842
    const v18, -0x40b33333    # -0.8f

    .line 843
    .line 844
    .line 845
    const/high16 v13, -0x40c00000    # -0.75f

    .line 846
    .line 847
    const v14, -0x413d70a4    # -0.38f

    .line 848
    .line 849
    .line 850
    const v15, -0x40333333    # -1.6f

    .line 851
    .line 852
    .line 853
    const v16, -0x40b33333    # -0.8f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const v0, 0x419f999a    # 19.95f

    .line 863
    .line 864
    .line 865
    const v2, 0x408eb852    # 4.46f

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v15, -0x4035c28f    # -1.58f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const v0, 0x3ed70a3d    # 0.42f

    .line 878
    .line 879
    .line 880
    const v2, 0x3f4ccccd    # 0.8f

    .line 881
    .line 882
    .line 883
    const v4, -0x3fc33333    # -2.95f

    .line 884
    .line 885
    .line 886
    const v6, -0x3ff33333    # -2.2f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v17, -0x3ffccccd    # -2.05f

    .line 893
    .line 894
    .line 895
    const v18, 0x3f19999a    # 0.6f

    .line 896
    .line 897
    .line 898
    const v13, -0x40d9999a    # -0.65f

    .line 899
    .line 900
    .line 901
    const v14, 0x3ea3d70a    # 0.32f

    .line 902
    .line 903
    .line 904
    const v15, -0x4068f5c3    # -1.18f

    .line 905
    .line 906
    .line 907
    const v16, 0x3f19999a    # 0.6f

    .line 908
    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v18, -0x40e66666    # -0.6f

    .line 914
    .line 915
    .line 916
    const v13, -0x4099999a    # -0.9f

    .line 917
    .line 918
    .line 919
    const/4 v14, 0x0

    .line 920
    const v15, -0x404ccccd    # -1.4f

    .line 921
    .line 922
    .line 923
    const/high16 v16, -0x41800000    # -0.25f

    .line 924
    .line 925
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v17, -0x3fc33333    # -2.95f

    .line 929
    .line 930
    .line 931
    const v18, -0x40b33333    # -0.8f

    .line 932
    .line 933
    .line 934
    const/high16 v13, -0x40c00000    # -0.75f

    .line 935
    .line 936
    const v14, -0x41428f5c    # -0.37f

    .line 937
    .line 938
    .line 939
    const v15, -0x40370a3d    # -1.57f

    .line 940
    .line 941
    .line 942
    const v16, -0x40b33333    # -0.8f

    .line 943
    .line 944
    .line 945
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v17, -0x405d70a4    # -1.27f

    .line 952
    .line 953
    .line 954
    const v18, 0x3f051eb8    # 0.52f

    .line 955
    .line 956
    .line 957
    const v13, -0x4123d70a    # -0.43f

    .line 958
    .line 959
    .line 960
    const v14, 0x3e6147ae    # 0.22f

    .line 961
    .line 962
    .line 963
    const v15, -0x40b0a3d7    # -0.81f

    .line 964
    .line 965
    .line 966
    const v16, 0x3ed1eb85    # 0.41f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v17, -0x40b851ec    # -0.78f

    .line 973
    .line 974
    .line 975
    const v18, 0x3f68f5c3    # 0.91f

    .line 976
    .line 977
    .line 978
    const v13, -0x4119999a    # -0.45f

    .line 979
    .line 980
    .line 981
    const v14, 0x3dcccccd    # 0.1f

    .line 982
    .line 983
    .line 984
    const v15, -0x40b851ec    # -0.78f

    .line 985
    .line 986
    .line 987
    const v16, 0x3eeb851f    # 0.46f

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const v0, 0x3d8f5c29    # 0.07f

    .line 994
    .line 995
    .line 996
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v17, 0x3f8f5c29    # 1.12f

    .line 1000
    .line 1001
    .line 1002
    const v18, 0x3f6b851f    # 0.92f

    .line 1003
    .line 1004
    .line 1005
    const/4 v13, 0x0

    .line 1006
    const v14, 0x3f19999a    # 0.6f

    .line 1007
    .line 1008
    .line 1009
    const v15, 0x3f0a3d71    # 0.54f

    .line 1010
    .line 1011
    .line 1012
    const v16, 0x3f851eb8    # 1.04f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const v17, 0x3fea3d71    # 1.83f

    .line 1019
    .line 1020
    .line 1021
    const v18, -0x40cf5c29    # -0.69f

    .line 1022
    .line 1023
    .line 1024
    const/high16 v13, 0x3f400000    # 0.75f

    .line 1025
    .line 1026
    const v14, -0x41e66666    # -0.15f

    .line 1027
    .line 1028
    .line 1029
    const v15, 0x3fa7ae14    # 1.31f

    .line 1030
    .line 1031
    .line 1032
    const v16, -0x411eb852    # -0.44f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const v17, 0x40033333    # 2.05f

    .line 1039
    .line 1040
    .line 1041
    const v18, -0x40e66666    # -0.6f

    .line 1042
    .line 1043
    .line 1044
    const v13, 0x3f266666    # 0.65f

    .line 1045
    .line 1046
    .line 1047
    const v14, -0x41570a3d    # -0.33f

    .line 1048
    .line 1049
    .line 1050
    const v15, 0x3f95c28f    # 1.17f

    .line 1051
    .line 1052
    .line 1053
    const v16, -0x40e66666    # -0.6f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v0, 0x3f19999a    # 0.6f

    .line 1060
    .line 1061
    .line 1062
    const v2, 0x40033333    # 2.05f

    .line 1063
    .line 1064
    .line 1065
    const/high16 v4, 0x3e800000    # 0.25f

    .line 1066
    .line 1067
    const v6, 0x3fb33333    # 1.4f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v17, 0x403ccccd    # 2.95f

    .line 1074
    .line 1075
    .line 1076
    const v18, 0x3f4ccccd    # 0.8f

    .line 1077
    .line 1078
    .line 1079
    const/high16 v13, 0x3f400000    # 0.75f

    .line 1080
    .line 1081
    const v14, 0x3ec28f5c    # 0.38f

    .line 1082
    .line 1083
    .line 1084
    const v15, 0x3fc8f5c3    # 1.57f

    .line 1085
    .line 1086
    .line 1087
    const v16, 0x3f4ccccd    # 0.8f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v0, -0x4123d70a    # -0.43f

    .line 1094
    .line 1095
    .line 1096
    const v2, -0x40b33333    # -0.8f

    .line 1097
    .line 1098
    .line 1099
    const v4, 0x403ccccd    # 2.95f

    .line 1100
    .line 1101
    .line 1102
    const v6, 0x400ccccd    # 2.2f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const v17, 0x40033333    # 2.05f

    .line 1109
    .line 1110
    .line 1111
    const v18, -0x40e66666    # -0.6f

    .line 1112
    .line 1113
    .line 1114
    const v13, 0x3f266666    # 0.65f

    .line 1115
    .line 1116
    .line 1117
    const v14, -0x415c28f6    # -0.32f

    .line 1118
    .line 1119
    .line 1120
    const v15, 0x3f970a3d    # 1.18f

    .line 1121
    .line 1122
    .line 1123
    const v16, -0x40e66666    # -0.6f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const v18, 0x3f19999a    # 0.6f

    .line 1130
    .line 1131
    .line 1132
    const v13, 0x3f666666    # 0.9f

    .line 1133
    .line 1134
    .line 1135
    const/4 v14, 0x0

    .line 1136
    const v15, 0x3fb33333    # 1.4f

    .line 1137
    .line 1138
    .line 1139
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1140
    .line 1141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v17, 0x3fea3d71    # 1.83f

    .line 1145
    .line 1146
    .line 1147
    const v18, 0x3f333333    # 0.7f

    .line 1148
    .line 1149
    .line 1150
    const v13, 0x3f051eb8    # 0.52f

    .line 1151
    .line 1152
    .line 1153
    const v14, 0x3e851eb8    # 0.26f

    .line 1154
    .line 1155
    .line 1156
    const v15, 0x3f8a3d71    # 1.08f

    .line 1157
    .line 1158
    .line 1159
    const v16, 0x3f0ccccd    # 0.55f

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v17, 0x3f8f5c29    # 1.12f

    .line 1166
    .line 1167
    .line 1168
    const v18, -0x40947ae1    # -0.92f

    .line 1169
    .line 1170
    .line 1171
    const v13, 0x3f147ae1    # 0.58f

    .line 1172
    .line 1173
    .line 1174
    const v14, 0x3de147ae    # 0.11f

    .line 1175
    .line 1176
    .line 1177
    const v15, 0x3f8f5c29    # 1.12f

    .line 1178
    .line 1179
    .line 1180
    const v16, -0x41570a3d    # -0.33f

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const v0, -0x4247ae14    # -0.09f

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1190
    .line 1191
    .line 1192
    const v17, -0x40b5c28f    # -0.79f

    .line 1193
    .line 1194
    .line 1195
    const/4 v13, 0x0

    .line 1196
    const v14, -0x41147ae1    # -0.46f

    .line 1197
    .line 1198
    .line 1199
    const v15, -0x4151eb85    # -0.34f

    .line 1200
    .line 1201
    .line 1202
    const v16, -0x40ae147b    # -0.82f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v17, -0x405eb852    # -1.26f

    .line 1209
    .line 1210
    .line 1211
    const/high16 v18, -0x41000000    # -0.5f

    .line 1212
    .line 1213
    const v13, -0x41147ae1    # -0.46f

    .line 1214
    .line 1215
    .line 1216
    const v14, -0x42333333    # -0.1f

    .line 1217
    .line 1218
    .line 1219
    const v15, -0x40ab851f    # -0.83f

    .line 1220
    .line 1221
    .line 1222
    const v16, -0x4170a3d7    # -0.28f

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    const v0, 0x410170a4    # 8.09f

    .line 1232
    .line 1233
    .line 1234
    const/high16 v2, 0x41880000    # 17.0f

    .line 1235
    .line 1236
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    const v17, -0x3fc33333    # -2.95f

    .line 1240
    .line 1241
    .line 1242
    const v18, 0x3f4ccccd    # 0.8f

    .line 1243
    .line 1244
    .line 1245
    const v13, -0x40533333    # -1.35f

    .line 1246
    .line 1247
    .line 1248
    const/4 v14, 0x0

    .line 1249
    const v15, -0x3ff33333    # -2.2f

    .line 1250
    .line 1251
    .line 1252
    const v16, 0x3edc28f6    # 0.43f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const v17, -0x3ffccccd    # -2.05f

    .line 1259
    .line 1260
    .line 1261
    const v18, 0x3f19999a    # 0.6f

    .line 1262
    .line 1263
    .line 1264
    const v13, -0x40d9999a    # -0.65f

    .line 1265
    .line 1266
    .line 1267
    const v14, 0x3eb33333    # 0.35f

    .line 1268
    .line 1269
    .line 1270
    const v15, -0x406ccccd    # -1.15f

    .line 1271
    .line 1272
    .line 1273
    const v16, 0x3f19999a    # 0.6f

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const v0, -0x3ffccccd    # -2.05f

    .line 1280
    .line 1281
    .line 1282
    const v2, -0x40e66666    # -0.6f

    .line 1283
    .line 1284
    .line 1285
    const v4, -0x404ccccd    # -1.4f

    .line 1286
    .line 1287
    .line 1288
    const/high16 v6, -0x41800000    # -0.25f

    .line 1289
    .line 1290
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, -0x3fc33333    # -2.95f

    .line 1294
    .line 1295
    .line 1296
    const v18, -0x40b33333    # -0.8f

    .line 1297
    .line 1298
    .line 1299
    const/high16 v13, -0x40c00000    # -0.75f

    .line 1300
    .line 1301
    const v14, -0x413d70a4    # -0.38f

    .line 1302
    .line 1303
    .line 1304
    const v15, -0x40370a3d    # -1.57f

    .line 1305
    .line 1306
    .line 1307
    const v16, -0x40b33333    # -0.8f

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    const v0, 0x3edc28f6    # 0.43f

    .line 1314
    .line 1315
    .line 1316
    const v2, 0x3f4ccccd    # 0.8f

    .line 1317
    .line 1318
    .line 1319
    const v4, -0x3fc33333    # -2.95f

    .line 1320
    .line 1321
    .line 1322
    const v6, -0x3ff33333    # -2.2f

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1326
    .line 1327
    .line 1328
    const v17, -0x405eb852    # -1.26f

    .line 1329
    .line 1330
    .line 1331
    const v18, 0x3f051eb8    # 0.52f

    .line 1332
    .line 1333
    .line 1334
    const v13, -0x4123d70a    # -0.43f

    .line 1335
    .line 1336
    .line 1337
    const v14, 0x3e6b851f    # 0.23f

    .line 1338
    .line 1339
    .line 1340
    const v15, -0x40b33333    # -0.8f

    .line 1341
    .line 1342
    .line 1343
    const v16, 0x3ed70a3d    # 0.42f

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1347
    .line 1348
    .line 1349
    const v17, -0x40b5c28f    # -0.79f

    .line 1350
    .line 1351
    .line 1352
    const v18, 0x3f6b851f    # 0.92f

    .line 1353
    .line 1354
    .line 1355
    const v13, -0x4119999a    # -0.45f

    .line 1356
    .line 1357
    .line 1358
    const v14, 0x3dcccccd    # 0.1f

    .line 1359
    .line 1360
    .line 1361
    const v15, -0x40b5c28f    # -0.79f

    .line 1362
    .line 1363
    .line 1364
    const v16, 0x3eeb851f    # 0.46f

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1368
    .line 1369
    .line 1370
    const v0, 0x3db851ec    # 0.09f

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1374
    .line 1375
    .line 1376
    const v17, 0x3f8f5c29    # 1.12f

    .line 1377
    .line 1378
    .line 1379
    const v18, 0x3f68f5c3    # 0.91f

    .line 1380
    .line 1381
    .line 1382
    const/4 v13, 0x0

    .line 1383
    const v14, 0x3f170a3d    # 0.59f

    .line 1384
    .line 1385
    .line 1386
    const v15, 0x3f0a3d71    # 0.54f

    .line 1387
    .line 1388
    .line 1389
    const v16, 0x3f83d70a    # 1.03f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v17, 0x3fea3d71    # 1.83f

    .line 1396
    .line 1397
    .line 1398
    const v18, -0x40cf5c29    # -0.69f

    .line 1399
    .line 1400
    .line 1401
    const/high16 v13, 0x3f400000    # 0.75f

    .line 1402
    .line 1403
    const v14, -0x41e66666    # -0.15f

    .line 1404
    .line 1405
    .line 1406
    const v15, 0x3fa7ae14    # 1.31f

    .line 1407
    .line 1408
    .line 1409
    const v16, -0x411eb852    # -0.44f

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const v17, 0x40033333    # 2.05f

    .line 1416
    .line 1417
    .line 1418
    const v18, -0x40e66666    # -0.6f

    .line 1419
    .line 1420
    .line 1421
    const v13, 0x3f266666    # 0.65f

    .line 1422
    .line 1423
    .line 1424
    const v14, -0x415c28f6    # -0.32f

    .line 1425
    .line 1426
    .line 1427
    const v15, 0x3f970a3d    # 1.18f

    .line 1428
    .line 1429
    .line 1430
    const v16, -0x40e66666    # -0.6f

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1434
    .line 1435
    .line 1436
    const v0, 0x3f19999a    # 0.6f

    .line 1437
    .line 1438
    .line 1439
    const v2, 0x40033333    # 2.05f

    .line 1440
    .line 1441
    .line 1442
    const/high16 v4, 0x3e800000    # 0.25f

    .line 1443
    .line 1444
    const v6, 0x3fb33333    # 1.4f

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1448
    .line 1449
    .line 1450
    const v17, 0x403ccccd    # 2.95f

    .line 1451
    .line 1452
    .line 1453
    const v18, 0x3f4ccccd    # 0.8f

    .line 1454
    .line 1455
    .line 1456
    const/high16 v13, 0x3f400000    # 0.75f

    .line 1457
    .line 1458
    const v14, 0x3ec28f5c    # 0.38f

    .line 1459
    .line 1460
    .line 1461
    const v15, 0x3fc8f5c3    # 1.57f

    .line 1462
    .line 1463
    .line 1464
    const v16, 0x3f4ccccd    # 0.8f

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    .line 1470
    const v0, -0x4123d70a    # -0.43f

    .line 1471
    .line 1472
    .line 1473
    const v2, -0x40b33333    # -0.8f

    .line 1474
    .line 1475
    .line 1476
    const v4, 0x403ccccd    # 2.95f

    .line 1477
    .line 1478
    .line 1479
    const v6, 0x400ccccd    # 2.2f

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1483
    .line 1484
    .line 1485
    const v17, 0x40033333    # 2.05f

    .line 1486
    .line 1487
    .line 1488
    const v18, -0x40e66666    # -0.6f

    .line 1489
    .line 1490
    .line 1491
    const v13, 0x3f266666    # 0.65f

    .line 1492
    .line 1493
    .line 1494
    const v14, -0x415c28f6    # -0.32f

    .line 1495
    .line 1496
    .line 1497
    const v15, 0x3f970a3d    # 1.18f

    .line 1498
    .line 1499
    .line 1500
    const v16, -0x40e66666    # -0.6f

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1504
    .line 1505
    .line 1506
    const v18, 0x3f19999a    # 0.6f

    .line 1507
    .line 1508
    .line 1509
    const v13, 0x3f666666    # 0.9f

    .line 1510
    .line 1511
    .line 1512
    const/4 v14, 0x0

    .line 1513
    const v15, 0x3fb33333    # 1.4f

    .line 1514
    .line 1515
    .line 1516
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1517
    .line 1518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1519
    .line 1520
    .line 1521
    const v17, 0x3fea3d71    # 1.83f

    .line 1522
    .line 1523
    .line 1524
    const v18, 0x3f333333    # 0.7f

    .line 1525
    .line 1526
    .line 1527
    const v13, 0x3f051eb8    # 0.52f

    .line 1528
    .line 1529
    .line 1530
    const v14, 0x3e851eb8    # 0.26f

    .line 1531
    .line 1532
    .line 1533
    const v15, 0x3f8a3d71    # 1.08f

    .line 1534
    .line 1535
    .line 1536
    const v16, 0x3f0ccccd    # 0.55f

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1540
    .line 1541
    .line 1542
    const v17, 0x3f8f5c29    # 1.12f

    .line 1543
    .line 1544
    .line 1545
    const v18, -0x40970a3d    # -0.91f

    .line 1546
    .line 1547
    .line 1548
    const v13, 0x3f147ae1    # 0.58f

    .line 1549
    .line 1550
    .line 1551
    const v14, 0x3de147ae    # 0.11f

    .line 1552
    .line 1553
    .line 1554
    const v15, 0x3f8f5c29    # 1.12f

    .line 1555
    .line 1556
    .line 1557
    const v16, -0x41570a3d    # -0.33f

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1561
    .line 1562
    .line 1563
    const v0, -0x4247ae14    # -0.09f

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1567
    .line 1568
    .line 1569
    const v17, -0x40b5c28f    # -0.79f

    .line 1570
    .line 1571
    .line 1572
    const v18, -0x40947ae1    # -0.92f

    .line 1573
    .line 1574
    .line 1575
    const/4 v13, 0x0

    .line 1576
    const v14, -0x41147ae1    # -0.46f

    .line 1577
    .line 1578
    .line 1579
    const v15, -0x4151eb85    # -0.34f

    .line 1580
    .line 1581
    .line 1582
    const v16, -0x40ae147b    # -0.82f

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1586
    .line 1587
    .line 1588
    const v17, -0x405eb852    # -1.26f

    .line 1589
    .line 1590
    .line 1591
    const v18, -0x40fae148    # -0.52f

    .line 1592
    .line 1593
    .line 1594
    const v13, -0x41147ae1    # -0.46f

    .line 1595
    .line 1596
    .line 1597
    const v14, -0x42333333    # -0.1f

    .line 1598
    .line 1599
    .line 1600
    const v15, -0x40ab851f    # -0.83f

    .line 1601
    .line 1602
    .line 1603
    const v16, -0x416b851f    # -0.29f

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1607
    .line 1608
    .line 1609
    const v17, -0x3fc33333    # -2.95f

    .line 1610
    .line 1611
    .line 1612
    const v18, -0x40b0a3d7    # -0.81f

    .line 1613
    .line 1614
    .line 1615
    const/high16 v13, -0x40c00000    # -0.75f

    .line 1616
    .line 1617
    const v14, -0x413851ec    # -0.39f

    .line 1618
    .line 1619
    .line 1620
    const v15, -0x40333333    # -1.6f

    .line 1621
    .line 1622
    .line 1623
    const v16, -0x40b0a3d7    # -0.81f

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v2

    .line 1636
    const/16 v16, 0x3800

    .line 1637
    .line 1638
    const/16 v17, 0x0

    .line 1639
    .line 1640
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1641
    .line 1642
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1643
    .line 1644
    const/4 v7, 0x0

    .line 1645
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1646
    .line 1647
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1648
    .line 1649
    const/4 v13, 0x0

    .line 1650
    const/4 v14, 0x0

    .line 1651
    const/4 v15, 0x0

    .line 1652
    const-string v4, ""

    .line 1653
    .line 1654
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    sput-object v0, Landroidx/compose/material/icons/rounded/WavesKt;->_waves:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1663
    .line 1664
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1665
    .line 1666
    .line 1667
    return-object v0
.end method
