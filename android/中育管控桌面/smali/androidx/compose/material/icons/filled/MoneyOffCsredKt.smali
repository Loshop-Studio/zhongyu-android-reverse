.class public final Landroidx/compose/material/icons/filled/MoneyOffCsredKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_moneyOffCsred",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MoneyOffCsred",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getMoneyOffCsred",
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
        "SMAP\nMoneyOffCsred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoneyOffCsred.kt\nandroidx/compose/material/icons/filled/MoneyOffCsredKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 MoneyOffCsred.kt\nandroidx/compose/material/icons/filled/MoneyOffCsredKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"
    }
.end annotation


# static fields
.field private static _moneyOffCsred:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoneyOffCsred(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MoneyOffCsredKt;->_moneyOffCsred:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.MoneyOffCsred"

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
    const v0, 0x41287ae1    # 10.53f

    .line 71
    .line 72
    .line 73
    const v2, 0x40edc28f    # 7.43f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fc51eb8    # 1.54f

    .line 80
    .line 81
    .line 82
    const v18, -0x410f5c29    # -0.47f

    .line 83
    .line 84
    .line 85
    const v13, 0x3ed70a3d    # 0.42f

    .line 86
    .line 87
    .line 88
    const v14, -0x416147ae    # -0.31f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f6e147b    # 0.93f

    .line 92
    .line 93
    .line 94
    const v16, -0x410f5c29    # -0.47f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 101
    .line 102
    const v2, 0x3efae148    # 0.49f

    .line 103
    .line 104
    .line 105
    const v4, 0x3f8e147b    # 1.11f

    .line 106
    .line 107
    .line 108
    const v6, 0x3e23d70a    # 0.16f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3f4a3d71    # 0.79f

    .line 115
    .line 116
    .line 117
    const v18, 0x3f8f5c29    # 1.12f

    .line 118
    .line 119
    .line 120
    const v13, 0x3ec7ae14    # 0.39f

    .line 121
    .line 122
    .line 123
    const v14, 0x3ea3d70a    # 0.32f

    .line 124
    .line 125
    .line 126
    const v15, 0x3f266666    # 0.65f

    .line 127
    .line 128
    .line 129
    const v16, 0x3f333333    # 0.7f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x3ff1eb85    # 1.89f

    .line 136
    .line 137
    .line 138
    const v2, -0x40b33333    # -0.8f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x404ccccd    # -1.4f

    .line 145
    .line 146
    .line 147
    const v18, -0x400a3d71    # -1.92f

    .line 148
    .line 149
    .line 150
    const v13, -0x418a3d71    # -0.24f

    .line 151
    .line 152
    .line 153
    const v14, -0x40ca3d71    # -0.71f

    .line 154
    .line 155
    .line 156
    const v15, -0x40ca3d71    # -0.71f

    .line 157
    .line 158
    .line 159
    const v16, -0x40533333    # -1.35f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x40133333    # -1.85f

    .line 166
    .line 167
    .line 168
    const v18, -0x40bae148    # -0.77f

    .line 169
    .line 170
    .line 171
    const/high16 v13, -0x41000000    # -0.5f

    .line 172
    .line 173
    const v14, -0x41333333    # -0.4f

    .line 174
    .line 175
    .line 176
    const v15, -0x4070a3d7    # -1.12f

    .line 177
    .line 178
    .line 179
    const v16, -0x40d9999a    # -0.65f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x40400000    # 3.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, -0x40000000    # -2.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x40070a3d    # 2.11f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x406e147b    # -1.14f

    .line 202
    .line 203
    .line 204
    const v18, 0x3ec7ae14    # 0.39f

    .line 205
    .line 206
    .line 207
    const v13, -0x412e147b    # -0.41f

    .line 208
    .line 209
    .line 210
    const v14, 0x3da3d70a    # 0.08f

    .line 211
    .line 212
    .line 213
    const v15, -0x40b5c28f    # -0.79f

    .line 214
    .line 215
    .line 216
    const v16, 0x3e570a3d    # 0.21f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x4099999a    # -0.9f

    .line 223
    .line 224
    .line 225
    const v18, 0x3f2147ae    # 0.63f

    .line 226
    .line 227
    .line 228
    const v13, -0x414ccccd    # -0.35f

    .line 229
    .line 230
    .line 231
    const v14, 0x3e3851ec    # 0.18f

    .line 232
    .line 233
    .line 234
    const v15, -0x40dc28f6    # -0.64f

    .line 235
    .line 236
    .line 237
    const v16, 0x3ec7ae14    # 0.39f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x3fb70a3d    # 1.43f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x41287ae1    # 10.53f

    .line 250
    .line 251
    .line 252
    const v18, 0x40edc28f    # 7.43f

    .line 253
    .line 254
    .line 255
    const v13, 0x4126e148    # 10.43f

    .line 256
    .line 257
    .line 258
    const v14, 0x40f0a3d7    # 7.52f

    .line 259
    .line 260
    .line 261
    const v15, 0x4127ae14    # 10.48f

    .line 262
    .line 263
    .line 264
    const v16, 0x40ef0a3d    # 7.47f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x4033d70a    # 2.81f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3fb1eb85    # 1.39f

    .line 280
    .line 281
    .line 282
    const v2, 0x40870a3d    # 4.22f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x4145999a    # 12.35f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x41430a3d    # 12.19f

    .line 295
    .line 296
    .line 297
    const/high16 v18, 0x41880000    # 17.0f

    .line 298
    .line 299
    const v13, 0x4154f5c3    # 13.31f

    .line 300
    .line 301
    .line 302
    const v14, 0x4186cccd    # 16.85f

    .line 303
    .line 304
    .line 305
    const v15, 0x414ca3d7    # 12.79f

    .line 306
    .line 307
    .line 308
    const/high16 v16, 0x41880000    # 17.0f

    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x4015c28f    # -1.83f

    .line 314
    .line 315
    .line 316
    const v18, -0x40cccccd    # -0.7f

    .line 317
    .line 318
    .line 319
    const v13, -0x40ca3d71    # -0.71f

    .line 320
    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    const v15, -0x40570a3d    # -1.32f

    .line 324
    .line 325
    .line 326
    const v16, -0x41947ae1    # -0.23f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x407851ec    # -1.06f

    .line 333
    .line 334
    .line 335
    const v18, -0x401851ec    # -1.81f

    .line 336
    .line 337
    .line 338
    const/high16 v13, -0x41000000    # -0.5f

    .line 339
    .line 340
    const v14, -0x410f5c29    # -0.47f

    .line 341
    .line 342
    .line 343
    const v15, -0x40a3d70a    # -0.86f

    .line 344
    .line 345
    .line 346
    const v16, -0x40770a3d    # -1.07f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x40028f5c    # -1.98f

    .line 353
    .line 354
    .line 355
    const v2, 0x3f4ccccd    # 0.8f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3fea3d71    # 1.83f

    .line 362
    .line 363
    .line 364
    const v18, 0x402eb852    # 2.73f

    .line 365
    .line 366
    .line 367
    const v13, 0x3eae147b    # 0.34f

    .line 368
    .line 369
    .line 370
    const v14, 0x3f95c28f    # 1.17f

    .line 371
    .line 372
    .line 373
    const v15, 0x3f733333    # 0.95f

    .line 374
    .line 375
    .line 376
    const v16, 0x40051eb8    # 2.08f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x3feccccd    # 1.85f

    .line 383
    .line 384
    .line 385
    const v18, 0x3f547ae1    # 0.83f

    .line 386
    .line 387
    .line 388
    const v13, 0x3f11eb85    # 0.57f

    .line 389
    .line 390
    .line 391
    const v14, 0x3ed70a3d    # 0.42f

    .line 392
    .line 393
    .line 394
    const v15, 0x3f9851ec    # 1.19f

    .line 395
    .line 396
    .line 397
    const v16, 0x3f2e147b    # 0.68f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41a80000    # 21.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40000000    # 2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, -0x3ffae148    # -2.08f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3fa51eb8    # 1.29f

    .line 420
    .line 421
    .line 422
    const v18, -0x414ccccd    # -0.35f

    .line 423
    .line 424
    .line 425
    const v13, 0x3ee147ae    # 0.44f

    .line 426
    .line 427
    .line 428
    const v14, -0x4270a3d7    # -0.07f

    .line 429
    .line 430
    .line 431
    const v15, 0x3f5eb852    # 0.87f

    .line 432
    .line 433
    .line 434
    const v16, -0x41d1eb85    # -0.17f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x3f6b851f    # 0.92f

    .line 441
    .line 442
    .line 443
    const v18, -0x40f851ec    # -0.53f

    .line 444
    .line 445
    .line 446
    const v13, 0x3eae147b    # 0.34f

    .line 447
    .line 448
    .line 449
    const v14, -0x41f0a3d7    # -0.14f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f23d70a    # 0.64f

    .line 453
    .line 454
    .line 455
    const v16, -0x415c28f6    # -0.32f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x40923d71    # 4.57f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3fb47ae1    # 1.41f

    .line 468
    .line 469
    .line 470
    const v2, -0x404b851f    # -1.41f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x4033d70a    # 2.81f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    const/16 v16, 0x3800

    .line 490
    .line 491
    const/16 v17, 0x0

    .line 492
    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v8, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v7, 0x0

    .line 498
    const/high16 v9, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/high16 v12, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const/4 v14, 0x0

    .line 504
    const/4 v15, 0x0

    .line 505
    const-string v4, ""

    .line 506
    .line 507
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    sput-object v0, Landroidx/compose/material/icons/filled/MoneyOffCsredKt;->_moneyOffCsred:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 516
    .line 517
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    return-object v0
.end method
