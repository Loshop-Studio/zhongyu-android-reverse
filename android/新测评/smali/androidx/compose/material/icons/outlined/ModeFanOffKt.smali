.class public final Landroidx/compose/material/icons/outlined/ModeFanOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_modeFanOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ModeFanOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getModeFanOff",
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
        "SMAP\nModeFanOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/outlined/ModeFanOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n72#5,4:135\n72#5,4:173\n*S KotlinDebug\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/outlined/ModeFanOffKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n59#1:151,18\n59#1:188\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n59#1:169,2\n59#1:171,2\n59#1:177,11\n30#1:135,4\n59#1:173,4\n*E\n"
    }
.end annotation


# static fields
.field private static _modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getModeFanOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ModeFanOff"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f85c28f    # -3.91f

    .line 78
    .line 79
    .line 80
    const v26, 0x3f9851ec    # 1.19f

    .line 81
    .line 82
    .line 83
    const v21, -0x407851ec    # -1.06f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x402e147b    # -1.64f

    .line 89
    .line 90
    .line 91
    const v24, 0x3e947ae1    # 0.29f

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
    const v25, -0x40e147ae    # -0.62f

    .line 100
    .line 101
    .line 102
    const v26, -0x41428f5c    # -0.37f

    .line 103
    .line 104
    .line 105
    const v21, -0x41bd70a4    # -0.19f

    .line 106
    .line 107
    .line 108
    const v22, -0x41f0a3d7    # -0.14f

    .line 109
    .line 110
    .line 111
    const v23, -0x41333333    # -0.4f

    .line 112
    .line 113
    .line 114
    const v24, -0x4175c28f    # -0.27f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x3faa3d71    # 1.33f

    .line 121
    .line 122
    .line 123
    const v26, -0x3ffd70a4    # -2.04f

    .line 124
    .line 125
    .line 126
    const/high16 v21, 0x3e800000    # 0.25f

    .line 127
    .line 128
    const v22, -0x407c28f6    # -1.03f

    .line 129
    .line 130
    .line 131
    const v23, 0x3f1c28f6    # 0.61f

    .line 132
    .line 133
    .line 134
    const v24, -0x403c28f6    # -1.53f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41800000    # 16.0f

    .line 141
    .line 142
    const/high16 v26, 0x40900000    # 4.5f

    .line 143
    .line 144
    const v21, 0x4179c28f    # 15.61f

    .line 145
    .line 146
    .line 147
    const v22, 0x40c6b852    # 6.21f

    .line 148
    .line 149
    .line 150
    const/high16 v23, 0x41800000    # 16.0f

    .line 151
    .line 152
    const v24, 0x40ae147b    # 5.44f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v25, 0x41566666    # 13.4f

    .line 159
    .line 160
    .line 161
    const/high16 v26, 0x40000000    # 2.0f

    .line 162
    .line 163
    const/high16 v21, 0x41800000    # 16.0f

    .line 164
    .line 165
    const v22, 0x4051eb85    # 3.28f

    .line 166
    .line 167
    .line 168
    const v23, 0x4170cccd    # 15.05f

    .line 169
    .line 170
    .line 171
    const/high16 v24, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, -0x3f55c28f    # -5.32f

    .line 177
    .line 178
    .line 179
    const v26, 0x4050a3d7    # 3.26f

    .line 180
    .line 181
    .line 182
    const v21, -0x3fbae148    # -3.08f

    .line 183
    .line 184
    .line 185
    const/16 v22, 0x0

    .line 186
    .line 187
    const v23, -0x3f628f5c    # -4.92f

    .line 188
    .line 189
    .line 190
    const v24, 0x3fbc28f6    # 1.47f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x40151eb8    # 2.33f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x41200000    # 10.0f

    .line 203
    .line 204
    const/high16 v26, 0x40c00000    # 6.0f

    .line 205
    .line 206
    const v21, 0x41211eb8    # 10.07f

    .line 207
    .line 208
    .line 209
    const v22, 0x40d6147b    # 6.69f

    .line 210
    .line 211
    .line 212
    const/high16 v23, 0x41200000    # 10.0f

    .line 213
    .line 214
    const v24, 0x40cc28f6    # 6.38f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x4059999a    # 3.4f

    .line 221
    .line 222
    .line 223
    const/high16 v26, -0x40000000    # -2.0f

    .line 224
    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    const v22, -0x4068f5c3    # -1.18f

    .line 228
    .line 229
    .line 230
    const v23, 0x3fb33333    # 1.4f

    .line 231
    .line 232
    .line 233
    const/high16 v24, -0x40000000    # -2.0f

    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, 0x41600000    # 14.0f

    .line 239
    .line 240
    const/high16 v26, 0x40900000    # 4.5f

    .line 241
    .line 242
    const v21, 0x415f851f    # 13.97f

    .line 243
    .line 244
    .line 245
    const/high16 v22, 0x40800000    # 4.0f

    .line 246
    .line 247
    const/high16 v23, 0x41600000    # 14.0f

    .line 248
    .line 249
    const v24, 0x408d70a4    # 4.42f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, -0x414ccccd    # -0.35f

    .line 256
    .line 257
    .line 258
    const v26, 0x3f266666    # 0.65f

    .line 259
    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    const v22, 0x3e8a3d71    # 0.27f

    .line 264
    .line 265
    .line 266
    const v23, -0x42b33333    # -0.05f

    .line 267
    .line 268
    .line 269
    const v24, 0x3edc28f6    # 0.43f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, -0x3ff5c28f    # -2.16f

    .line 276
    .line 277
    .line 278
    const v26, 0x4058f5c3    # 3.39f

    .line 279
    .line 280
    .line 281
    const v21, -0x405d70a4    # -1.27f

    .line 282
    .line 283
    .line 284
    const v22, 0x3f666666    # 0.9f

    .line 285
    .line 286
    .line 287
    const v23, -0x4015c28f    # -1.83f

    .line 288
    .line 289
    .line 290
    const v24, 0x3ff47ae1    # 1.91f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, -0x435c28f6    # -0.02f

    .line 297
    .line 298
    .line 299
    const v6, 0x3dcccccd    # 0.1f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40e80000    # 7.25f

    .line 306
    .line 307
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v25, 0x419c0000    # 19.5f

    .line 311
    .line 312
    const/high16 v26, 0x41800000    # 16.0f

    .line 313
    .line 314
    const v21, 0x4197ae14    # 18.96f

    .line 315
    .line 316
    .line 317
    const v22, 0x417f3333    # 15.95f

    .line 318
    .line 319
    .line 320
    const v23, 0x4199c28f    # 19.22f

    .line 321
    .line 322
    .line 323
    const/high16 v24, 0x41800000    # 16.0f

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v25, 0x40200000    # 2.5f

    .line 329
    .line 330
    const v26, -0x3fd9999a    # -2.6f

    .line 331
    .line 332
    .line 333
    const v21, 0x3f9c28f6    # 1.22f

    .line 334
    .line 335
    .line 336
    const/16 v22, 0x0

    .line 337
    .line 338
    const/high16 v23, 0x40200000    # 2.5f

    .line 339
    .line 340
    const v24, -0x408ccccd    # -0.95f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x41900000    # 18.0f

    .line 347
    .line 348
    const/high16 v26, 0x41000000    # 8.0f

    .line 349
    .line 350
    const/high16 v21, 0x41b00000    # 22.0f

    .line 351
    .line 352
    const v22, 0x411e8f5c    # 9.91f

    .line 353
    .line 354
    .line 355
    const v23, 0x41a0e148    # 20.11f

    .line 356
    .line 357
    .line 358
    const/high16 v24, 0x41000000    # 8.0f

    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x419c0000    # 19.5f

    .line 367
    .line 368
    const/high16 v6, 0x41600000    # 14.0f

    .line 369
    .line 370
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, -0x40d9999a    # -0.65f

    .line 374
    .line 375
    .line 376
    const v26, -0x414ccccd    # -0.35f

    .line 377
    .line 378
    .line 379
    const v21, -0x4175c28f    # -0.27f

    .line 380
    .line 381
    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    const v23, -0x4123d70a    # -0.43f

    .line 385
    .line 386
    .line 387
    const v24, -0x42b33333    # -0.05f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, -0x3fa70a3d    # -3.39f

    .line 394
    .line 395
    .line 396
    const v26, -0x3ff5c28f    # -2.16f

    .line 397
    .line 398
    .line 399
    const v21, -0x4099999a    # -0.9f

    .line 400
    .line 401
    .line 402
    const v22, -0x405d70a4    # -1.27f

    .line 403
    .line 404
    .line 405
    const v23, -0x400b851f    # -1.91f

    .line 406
    .line 407
    .line 408
    const v24, -0x4015c28f    # -1.83f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v25, -0x41e66666    # -0.15f

    .line 415
    .line 416
    .line 417
    const v26, -0x40e147ae    # -0.62f

    .line 418
    .line 419
    .line 420
    const v21, -0x430a3d71    # -0.03f

    .line 421
    .line 422
    .line 423
    const v22, -0x419eb852    # -0.22f

    .line 424
    .line 425
    .line 426
    const v23, -0x425c28f6    # -0.08f

    .line 427
    .line 428
    .line 429
    const v24, -0x4128f5c3    # -0.42f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x41900000    # 18.0f

    .line 436
    .line 437
    const/high16 v26, 0x41200000    # 10.0f

    .line 438
    .line 439
    const v21, 0x4188e148    # 17.11f

    .line 440
    .line 441
    .line 442
    const v22, 0x4121eb85    # 10.12f

    .line 443
    .line 444
    .line 445
    const v23, 0x418beb85    # 17.49f

    .line 446
    .line 447
    .line 448
    const/high16 v24, 0x41200000    # 10.0f

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v25, 0x40000000    # 2.0f

    .line 454
    .line 455
    const v26, 0x4059999a    # 3.4f

    .line 456
    .line 457
    .line 458
    const v21, 0x3f970a3d    # 1.18f

    .line 459
    .line 460
    .line 461
    const/16 v22, 0x0

    .line 462
    .line 463
    const/high16 v23, 0x40000000    # 2.0f

    .line 464
    .line 465
    const v24, 0x3fb33333    # 1.4f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v25, 0x419c0000    # 19.5f

    .line 472
    .line 473
    const/high16 v26, 0x41600000    # 14.0f

    .line 474
    .line 475
    const/high16 v21, 0x41a00000    # 20.0f

    .line 476
    .line 477
    const v22, 0x415f851f    # 13.97f

    .line 478
    .line 479
    .line 480
    const v23, 0x419ca3d7    # 19.58f

    .line 481
    .line 482
    .line 483
    const/high16 v24, 0x41600000    # 14.0f

    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const/16 v16, 0x3800

    .line 496
    .line 497
    const/16 v17, 0x0

    .line 498
    .line 499
    const/high16 v6, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v8, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const/high16 v9, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/high16 v12, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const/4 v14, 0x0

    .line 510
    const/4 v15, 0x0

    .line 511
    const-string v4, ""

    .line 512
    .line 513
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 514
    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 521
    .line 522
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 523
    .line 524
    .line 525
    move-result-wide v6

    .line 526
    const/4 v0, 0x0

    .line 527
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 531
    .line 532
    .line 533
    move-result v10

    .line 534
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 535
    .line 536
    .line 537
    move-result v11

    .line 538
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 541
    .line 542
    .line 543
    const v0, 0x40870a3d    # 4.22f

    .line 544
    .line 545
    .line 546
    const v2, 0x3fb1eb85    # 1.39f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x4078f5c3    # 3.89f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x40900000    # 4.5f

    .line 559
    .line 560
    const/high16 v18, 0x41000000    # 8.0f

    .line 561
    .line 562
    const v13, 0x40a147ae    # 5.04f

    .line 563
    .line 564
    .line 565
    const v14, 0x4100cccd    # 8.05f

    .line 566
    .line 567
    .line 568
    const v15, 0x4098f5c3    # 4.78f

    .line 569
    .line 570
    .line 571
    const/high16 v16, 0x41000000    # 8.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, 0x40000000    # 2.0f

    .line 577
    .line 578
    const v18, 0x4129999a    # 10.6f

    .line 579
    .line 580
    .line 581
    const v13, 0x4051eb85    # 3.28f

    .line 582
    .line 583
    .line 584
    const/high16 v14, 0x41000000    # 8.0f

    .line 585
    .line 586
    const/high16 v15, 0x40000000    # 2.0f

    .line 587
    .line 588
    const v16, 0x410f3333    # 8.95f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v17, 0x40c00000    # 6.0f

    .line 595
    .line 596
    const/high16 v18, 0x41800000    # 16.0f

    .line 597
    .line 598
    const/high16 v13, 0x40000000    # 2.0f

    .line 599
    .line 600
    const v14, 0x416170a4    # 14.09f

    .line 601
    .line 602
    .line 603
    const v15, 0x4078f5c3    # 3.89f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x41800000    # 16.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x407a3d71    # 3.91f

    .line 612
    .line 613
    .line 614
    const v18, -0x4067ae14    # -1.19f

    .line 615
    .line 616
    .line 617
    const v13, 0x3f87ae14    # 1.06f

    .line 618
    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const v15, 0x3fd1eb85    # 1.64f

    .line 622
    .line 623
    .line 624
    const v16, -0x416b851f    # -0.29f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v17, 0x3f1eb852    # 0.62f

    .line 631
    .line 632
    .line 633
    const v18, 0x3ebd70a4    # 0.37f

    .line 634
    .line 635
    .line 636
    const v13, 0x3e428f5c    # 0.19f

    .line 637
    .line 638
    .line 639
    const v14, 0x3e0f5c29    # 0.14f

    .line 640
    .line 641
    .line 642
    const v15, 0x3ecccccd    # 0.4f

    .line 643
    .line 644
    .line 645
    const v16, 0x3e8a3d71    # 0.27f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, -0x4055c28f    # -1.33f

    .line 652
    .line 653
    .line 654
    const v18, 0x40028f5c    # 2.04f

    .line 655
    .line 656
    .line 657
    const/high16 v13, -0x41800000    # -0.25f

    .line 658
    .line 659
    const v14, 0x3f83d70a    # 1.03f

    .line 660
    .line 661
    .line 662
    const v15, -0x40e3d70a    # -0.61f

    .line 663
    .line 664
    .line 665
    const v16, 0x3fc3d70a    # 1.53f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, 0x41000000    # 8.0f

    .line 672
    .line 673
    const/high16 v18, 0x419c0000    # 19.5f

    .line 674
    .line 675
    const v13, 0x41063d71    # 8.39f

    .line 676
    .line 677
    .line 678
    const v14, 0x418e51ec    # 17.79f

    .line 679
    .line 680
    .line 681
    const/high16 v15, 0x41000000    # 8.0f

    .line 682
    .line 683
    const v16, 0x41947ae1    # 18.56f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x40266666    # 2.6f

    .line 690
    .line 691
    .line 692
    const/high16 v18, 0x40200000    # 2.5f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const v14, 0x3f9c28f6    # 1.22f

    .line 696
    .line 697
    .line 698
    const v15, 0x3f733333    # 0.95f

    .line 699
    .line 700
    .line 701
    const/high16 v16, 0x40200000    # 2.5f

    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x40aa3d71    # 5.32f

    .line 707
    .line 708
    .line 709
    const v18, -0x3faf5c29    # -3.26f

    .line 710
    .line 711
    .line 712
    const v13, 0x40451eb8    # 3.08f

    .line 713
    .line 714
    .line 715
    const/4 v14, 0x0

    .line 716
    const v15, 0x409d70a4    # 4.92f

    .line 717
    .line 718
    .line 719
    const v16, -0x4043d70a    # -1.47f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x40770a3d    # 3.86f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x3fb47ae1    # 1.41f

    .line 732
    .line 733
    .line 734
    const v2, -0x404b851f    # -1.41f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, 0x4033d70a    # 2.81f

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x40870a3d    # 4.22f

    .line 747
    .line 748
    .line 749
    const v2, 0x3fb1eb85    # 1.39f

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v0, 0x41775c29    # 15.46f

    .line 759
    .line 760
    .line 761
    const v2, 0x414851ec    # 12.52f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x3db851ec    # 0.09f

    .line 768
    .line 769
    .line 770
    const v18, -0x435c28f6    # -0.02f

    .line 771
    .line 772
    .line 773
    const v13, 0x3cf5c28f    # 0.03f

    .line 774
    .line 775
    .line 776
    const v15, 0x3d75c28f    # 0.06f

    .line 777
    .line 778
    .line 779
    const v16, -0x435c28f6    # -0.02f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x3f7851ec    # 0.97f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v17, 0x41600000    # 14.0f

    .line 792
    .line 793
    const/high16 v18, 0x41900000    # 18.0f

    .line 794
    .line 795
    const v13, 0x415ee148    # 13.93f

    .line 796
    .line 797
    .line 798
    const v14, 0x418a7ae1    # 17.31f

    .line 799
    .line 800
    .line 801
    const/high16 v15, 0x41600000    # 14.0f

    .line 802
    .line 803
    const v16, 0x418cf5c3    # 17.62f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, -0x3fa66666    # -3.4f

    .line 810
    .line 811
    .line 812
    const/high16 v18, 0x40000000    # 2.0f

    .line 813
    .line 814
    const/4 v13, 0x0

    .line 815
    const v14, 0x3f970a3d    # 1.18f

    .line 816
    .line 817
    .line 818
    const v15, -0x404ccccd    # -1.4f

    .line 819
    .line 820
    .line 821
    const/high16 v16, 0x40000000    # 2.0f

    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, -0x40e66666    # -0.6f

    .line 827
    .line 828
    .line 829
    const/high16 v18, -0x41000000    # -0.5f

    .line 830
    .line 831
    const v13, -0x40ee147b    # -0.57f

    .line 832
    .line 833
    .line 834
    const/4 v14, 0x0

    .line 835
    const v15, -0x40e66666    # -0.6f

    .line 836
    .line 837
    .line 838
    const v16, -0x4128f5c3    # -0.42f

    .line 839
    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v17, 0x3eb33333    # 0.35f

    .line 845
    .line 846
    .line 847
    const v18, -0x40d9999a    # -0.65f

    .line 848
    .line 849
    .line 850
    const/4 v13, 0x0

    .line 851
    const v14, -0x4175c28f    # -0.27f

    .line 852
    .line 853
    .line 854
    const v15, 0x3d4ccccd    # 0.05f

    .line 855
    .line 856
    .line 857
    const v16, -0x4123d70a    # -0.43f

    .line 858
    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v17, 0x414851ec    # 12.52f

    .line 864
    .line 865
    .line 866
    const v18, 0x41775c29    # 15.46f

    .line 867
    .line 868
    .line 869
    const v13, 0x413a147b    # 11.63f

    .line 870
    .line 871
    .line 872
    const v14, 0x418fae14    # 17.96f

    .line 873
    .line 874
    .line 875
    const v15, 0x4142e148    # 12.18f

    .line 876
    .line 877
    .line 878
    const v16, 0x4187851f    # 16.94f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, 0x4108a3d7    # 8.54f

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v17, 0x3e19999a    # 0.15f

    .line 894
    .line 895
    .line 896
    const v18, 0x3f1eb852    # 0.62f

    .line 897
    .line 898
    .line 899
    const v13, 0x3cf5c28f    # 0.03f

    .line 900
    .line 901
    .line 902
    const v14, 0x3e6147ae    # 0.22f

    .line 903
    .line 904
    .line 905
    const v15, 0x3da3d70a    # 0.08f

    .line 906
    .line 907
    .line 908
    const v16, 0x3ed70a3d    # 0.42f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v17, 0x40c00000    # 6.0f

    .line 915
    .line 916
    const/high16 v18, 0x41600000    # 14.0f

    .line 917
    .line 918
    const v13, 0x40dc7ae1    # 6.89f

    .line 919
    .line 920
    .line 921
    const v14, 0x415e147b    # 13.88f

    .line 922
    .line 923
    .line 924
    const v15, 0x40d051ec    # 6.51f

    .line 925
    .line 926
    .line 927
    const/high16 v16, 0x41600000    # 14.0f

    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v17, -0x40000000    # -2.0f

    .line 933
    .line 934
    const v18, -0x3fa66666    # -3.4f

    .line 935
    .line 936
    .line 937
    const v13, -0x4068f5c3    # -1.18f

    .line 938
    .line 939
    .line 940
    const/4 v14, 0x0

    .line 941
    const/high16 v15, -0x40000000    # -2.0f

    .line 942
    .line 943
    const v16, -0x404ccccd    # -1.4f

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v17, 0x40900000    # 4.5f

    .line 950
    .line 951
    const/high16 v18, 0x41200000    # 10.0f

    .line 952
    .line 953
    const/high16 v13, 0x40800000    # 4.0f

    .line 954
    .line 955
    const v14, 0x41207ae1    # 10.03f

    .line 956
    .line 957
    .line 958
    const v15, 0x408d70a4    # 4.42f

    .line 959
    .line 960
    .line 961
    const/high16 v16, 0x41200000    # 10.0f

    .line 962
    .line 963
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const v17, 0x3f266666    # 0.65f

    .line 967
    .line 968
    .line 969
    const v18, 0x3eb33333    # 0.35f

    .line 970
    .line 971
    .line 972
    const v13, 0x3e8a3d71    # 0.27f

    .line 973
    .line 974
    .line 975
    const/4 v14, 0x0

    .line 976
    const v15, 0x3edc28f6    # 0.43f

    .line 977
    .line 978
    .line 979
    const v16, 0x3d4ccccd    # 0.05f

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v17, 0x4108a3d7    # 8.54f

    .line 986
    .line 987
    .line 988
    const v18, 0x414851ec    # 12.52f

    .line 989
    .line 990
    .line 991
    const v13, 0x40c147ae    # 6.04f

    .line 992
    .line 993
    .line 994
    const v14, 0x413a147b    # 11.63f

    .line 995
    .line 996
    .line 997
    const v15, 0x40e1eb85    # 7.06f

    .line 998
    .line 999
    .line 1000
    const v16, 0x4142e148    # 12.18f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    const/16 v16, 0x3800

    .line 1014
    .line 1015
    const/16 v17, 0x0

    .line 1016
    .line 1017
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1018
    .line 1019
    const/4 v7, 0x0

    .line 1020
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1021
    .line 1022
    const/4 v13, 0x0

    .line 1023
    const/4 v14, 0x0

    .line 1024
    const/4 v15, 0x0

    .line 1025
    const-string v4, ""

    .line 1026
    .line 1027
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    sput-object v0, Landroidx/compose/material/icons/outlined/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1036
    .line 1037
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    return-object v0
.end method
