.class public final Landroidx/compose/material/icons/outlined/FingerprintKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_fingerprint",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Fingerprint",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFingerprint",
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
        "SMAP\nFingerprint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fingerprint.kt\nandroidx/compose/material/icons/outlined/FingerprintKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n72#5,4:151\n*S KotlinDebug\n*F\n+ 1 Fingerprint.kt\nandroidx/compose/material/icons/outlined/FingerprintKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n30#1:151,4\n*E\n"
    }
.end annotation


# static fields
.field private static _fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFingerprint(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FingerprintKt;->_fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Fingerprint"

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
    const v0, 0x418e7ae1    # 17.81f

    .line 71
    .line 72
    .line 73
    const v2, 0x408f0a3d    # 4.47f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41947ae1    # -0.23f

    .line 80
    .line 81
    .line 82
    const v18, -0x428a3d71    # -0.06f

    .line 83
    .line 84
    .line 85
    const v13, -0x425c28f6    # -0.08f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, -0x41dc28f6    # -0.16f

    .line 90
    .line 91
    .line 92
    const v16, -0x435c28f6    # -0.02f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x414028f6    # 12.01f

    .line 99
    .line 100
    .line 101
    const/high16 v18, 0x40400000    # 3.0f

    .line 102
    .line 103
    const v13, 0x417a8f5c    # 15.66f

    .line 104
    .line 105
    .line 106
    const v14, 0x405ae148    # 3.42f

    .line 107
    .line 108
    .line 109
    const/high16 v15, 0x41600000    # 14.0f

    .line 110
    .line 111
    const/high16 v16, 0x40400000    # 3.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3f4dc28f    # -5.57f

    .line 117
    .line 118
    .line 119
    const v18, 0x3fb47ae1    # 1.41f

    .line 120
    .line 121
    .line 122
    const v13, -0x40028f5c    # -1.98f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x3f88f5c3    # -3.86f

    .line 127
    .line 128
    .line 129
    const v16, 0x3ef0a3d7    # 0.47f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40d1eb85    # -0.68f

    .line 136
    .line 137
    .line 138
    const v18, -0x41b33333    # -0.2f

    .line 139
    .line 140
    .line 141
    const v13, -0x418a3d71    # -0.24f

    .line 142
    .line 143
    .line 144
    const v14, 0x3e051eb8    # 0.13f

    .line 145
    .line 146
    .line 147
    const v15, -0x40f5c28f    # -0.54f

    .line 148
    .line 149
    .line 150
    const v16, 0x3d23d70a    # 0.04f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x3e4ccccd    # 0.2f

    .line 157
    .line 158
    .line 159
    const v18, -0x40d1eb85    # -0.68f

    .line 160
    .line 161
    .line 162
    const v13, -0x41fae148    # -0.13f

    .line 163
    .line 164
    .line 165
    const v14, -0x418a3d71    # -0.24f

    .line 166
    .line 167
    .line 168
    const v15, -0x42dc28f6    # -0.04f

    .line 169
    .line 170
    .line 171
    const v16, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x414028f6    # 12.01f

    .line 178
    .line 179
    .line 180
    const/high16 v18, 0x40000000    # 2.0f

    .line 181
    .line 182
    const v13, 0x40fa3d71    # 7.82f

    .line 183
    .line 184
    .line 185
    const v14, 0x402147ae    # 2.52f

    .line 186
    .line 187
    .line 188
    const v15, 0x411dc28f    # 9.86f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x40000000    # 2.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x40c0f5c3    # 6.03f

    .line 197
    .line 198
    .line 199
    const v18, 0x3fc28f5c    # 1.52f

    .line 200
    .line 201
    .line 202
    const v13, 0x400851ec    # 2.13f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const v15, 0x407f5c29    # 3.99f

    .line 207
    .line 208
    .line 209
    const v16, 0x3ef0a3d7    # 0.47f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x3e570a3d    # 0.21f

    .line 216
    .line 217
    .line 218
    const v18, 0x3f2b851f    # 0.67f

    .line 219
    .line 220
    .line 221
    const/high16 v13, 0x3e800000    # 0.25f

    .line 222
    .line 223
    const v14, 0x3e051eb8    # 0.13f

    .line 224
    .line 225
    .line 226
    const v15, 0x3eae147b    # 0.34f

    .line 227
    .line 228
    .line 229
    const v16, 0x3edc28f6    # 0.43f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x411eb852    # -0.44f

    .line 236
    .line 237
    .line 238
    const v18, 0x3e8f5c29    # 0.28f

    .line 239
    .line 240
    .line 241
    const v13, -0x4247ae14    # -0.09f

    .line 242
    .line 243
    .line 244
    const v14, 0x3e3851ec    # 0.18f

    .line 245
    .line 246
    .line 247
    const v15, -0x417ae148    # -0.26f

    .line 248
    .line 249
    .line 250
    const v16, 0x3e8f5c29    # 0.28f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40600000    # 3.5f

    .line 260
    .line 261
    const v2, 0x411b851f    # 9.72f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x416b851f    # -0.29f

    .line 268
    .line 269
    .line 270
    const v18, -0x4247ae14    # -0.09f

    .line 271
    .line 272
    .line 273
    const v13, -0x42333333    # -0.1f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const v15, -0x41b33333    # -0.2f

    .line 278
    .line 279
    .line 280
    const v16, -0x430a3d71    # -0.03f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x420a3d71    # -0.12f

    .line 287
    .line 288
    .line 289
    const v18, -0x40cccccd    # -0.7f

    .line 290
    .line 291
    .line 292
    const v13, -0x41947ae1    # -0.23f

    .line 293
    .line 294
    .line 295
    const v14, -0x41dc28f6    # -0.16f

    .line 296
    .line 297
    .line 298
    const v15, -0x4170a3d7    # -0.28f

    .line 299
    .line 300
    .line 301
    const v16, -0x410f5c29    # -0.47f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x40700000    # 3.75f

    .line 308
    .line 309
    const v18, -0x3faeb852    # -3.27f

    .line 310
    .line 311
    .line 312
    const v13, 0x3f7d70a4    # 0.99f

    .line 313
    .line 314
    .line 315
    const v14, -0x404ccccd    # -1.4f

    .line 316
    .line 317
    .line 318
    const/high16 v15, 0x40100000    # 2.25f

    .line 319
    .line 320
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x41893333    # 17.15f

    .line 326
    .line 327
    .line 328
    const v18, 0x40b4cccd    # 5.65f

    .line 329
    .line 330
    .line 331
    const v13, 0x411fae14    # 9.98f

    .line 332
    .line 333
    .line 334
    const v14, 0x408147ae    # 4.04f

    .line 335
    .line 336
    .line 337
    const/high16 v15, 0x41600000    # 14.0f

    .line 338
    .line 339
    const v16, 0x4080f5c3    # 4.03f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40700000    # 3.75f

    .line 346
    .line 347
    const/high16 v18, 0x40500000    # 3.25f

    .line 348
    .line 349
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 350
    .line 351
    const v14, 0x3f451eb8    # 0.77f

    .line 352
    .line 353
    .line 354
    const v15, 0x4030a3d7    # 2.76f

    .line 355
    .line 356
    .line 357
    const v16, 0x3fee147b    # 1.86f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x420a3d71    # -0.12f

    .line 364
    .line 365
    .line 366
    const v18, 0x3f333333    # 0.7f

    .line 367
    .line 368
    .line 369
    const v13, 0x3e23d70a    # 0.16f

    .line 370
    .line 371
    .line 372
    const v14, 0x3e6147ae    # 0.22f

    .line 373
    .line 374
    .line 375
    const v15, 0x3de147ae    # 0.11f

    .line 376
    .line 377
    .line 378
    const v16, 0x3f0a3d71    # 0.54f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x40cccccd    # -0.7f

    .line 385
    .line 386
    .line 387
    const v18, -0x420a3d71    # -0.12f

    .line 388
    .line 389
    .line 390
    const v13, -0x41947ae1    # -0.23f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e23d70a    # 0.16f

    .line 394
    .line 395
    .line 396
    const v15, -0x40f5c28f    # -0.54f

    .line 397
    .line 398
    .line 399
    const v16, 0x3de147ae    # 0.11f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x3fa70a3d    # -3.39f

    .line 406
    .line 407
    .line 408
    const v18, -0x3fc3d70a    # -2.94f

    .line 409
    .line 410
    .line 411
    const v13, -0x4099999a    # -0.9f

    .line 412
    .line 413
    .line 414
    const v14, -0x405eb852    # -1.26f

    .line 415
    .line 416
    .line 417
    const v15, -0x3ffd70a4    # -2.04f

    .line 418
    .line 419
    .line 420
    const/high16 v16, -0x3ff00000    # -2.25f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, -0x3ee9999a    # -9.4f

    .line 426
    .line 427
    .line 428
    const v18, 0x3c23d70a    # 0.01f

    .line 429
    .line 430
    .line 431
    const v13, -0x3fc851ec    # -2.87f

    .line 432
    .line 433
    .line 434
    const v14, -0x4043d70a    # -1.47f

    .line 435
    .line 436
    .line 437
    const v15, -0x3f2eb852    # -6.54f

    .line 438
    .line 439
    .line 440
    const v16, -0x4043d70a    # -1.47f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x3fa66666    # -3.4f

    .line 447
    .line 448
    .line 449
    const v18, 0x403d70a4    # 2.96f

    .line 450
    .line 451
    .line 452
    const v13, -0x4051eb85    # -1.36f

    .line 453
    .line 454
    .line 455
    const v14, 0x3f333333    # 0.7f

    .line 456
    .line 457
    .line 458
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 459
    .line 460
    const v16, 0x3fd9999a    # 1.7f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x413851ec    # -0.39f

    .line 467
    .line 468
    .line 469
    const v18, 0x3e570a3d    # 0.21f

    .line 470
    .line 471
    .line 472
    const v13, -0x425c28f6    # -0.08f

    .line 473
    .line 474
    .line 475
    const v14, 0x3e0f5c29    # 0.14f

    .line 476
    .line 477
    .line 478
    const v15, -0x41947ae1    # -0.23f

    .line 479
    .line 480
    .line 481
    const v16, 0x3e570a3d    # 0.21f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x411c0000    # 9.75f

    .line 491
    .line 492
    const v2, 0x41ae51ec    # 21.79f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x414ccccd    # -0.35f

    .line 499
    .line 500
    .line 501
    const v18, -0x41e66666    # -0.15f

    .line 502
    .line 503
    .line 504
    const v13, -0x41fae148    # -0.13f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const v15, -0x417ae148    # -0.26f

    .line 509
    .line 510
    .line 511
    const v16, -0x42b33333    # -0.05f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x3fff5c29    # -2.01f

    .line 518
    .line 519
    .line 520
    const v18, -0x3fd70a3d    # -2.64f

    .line 521
    .line 522
    .line 523
    const v13, -0x40a147ae    # -0.87f

    .line 524
    .line 525
    .line 526
    const v14, -0x40a147ae    # -0.87f

    .line 527
    .line 528
    .line 529
    const v15, -0x40547ae1    # -1.34f

    .line 530
    .line 531
    .line 532
    const v16, -0x4048f5c3    # -1.43f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, -0x4079999a    # -1.05f

    .line 539
    .line 540
    .line 541
    const v18, -0x3f751eb8    # -4.34f

    .line 542
    .line 543
    .line 544
    const v13, -0x40cf5c29    # -0.69f

    .line 545
    .line 546
    .line 547
    const v14, -0x40628f5c    # -1.23f

    .line 548
    .line 549
    .line 550
    const v15, -0x4079999a    # -1.05f

    .line 551
    .line 552
    .line 553
    const v16, -0x3fd147ae    # -2.73f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x40b51eb8    # 5.66f

    .line 560
    .line 561
    .line 562
    const v18, -0x3f53851f    # -5.39f

    .line 563
    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, -0x3fc1eb85    # -2.97f

    .line 567
    .line 568
    .line 569
    const v15, 0x40228f5c    # 2.54f

    .line 570
    .line 571
    .line 572
    const v16, -0x3f53851f    # -5.39f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x401ae148    # 2.42f

    .line 579
    .line 580
    .line 581
    const v2, 0x40ac7ae1    # 5.39f

    .line 582
    .line 583
    .line 584
    const v4, 0x40b51eb8    # 5.66f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, -0x41000000    # -0.5f

    .line 591
    .line 592
    const/high16 v18, 0x3f000000    # 0.5f

    .line 593
    .line 594
    const v14, 0x3e8f5c29    # 0.28f

    .line 595
    .line 596
    .line 597
    const v15, -0x419eb852    # -0.22f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x3f000000    # 0.5f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x419eb852    # -0.22f

    .line 606
    .line 607
    .line 608
    const/high16 v2, -0x41000000    # -0.5f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x3f6ae148    # -4.66f

    .line 614
    .line 615
    .line 616
    const v18, -0x3f73851f    # -4.39f

    .line 617
    .line 618
    .line 619
    const v14, -0x3fe51eb8    # -2.42f

    .line 620
    .line 621
    .line 622
    const v15, -0x3ffa3d71    # -2.09f

    .line 623
    .line 624
    .line 625
    const v16, -0x3f73851f    # -4.39f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x3ffc28f6    # 1.97f

    .line 632
    .line 633
    .line 634
    const v2, 0x408c7ae1    # 4.39f

    .line 635
    .line 636
    .line 637
    const v4, -0x3f6ae148    # -4.66f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, 0x3f6e147b    # 0.93f

    .line 644
    .line 645
    .line 646
    const v18, 0x40766666    # 3.85f

    .line 647
    .line 648
    .line 649
    const v14, 0x3fb851ec    # 1.44f

    .line 650
    .line 651
    .line 652
    const v15, 0x3ea3d70a    # 0.32f

    .line 653
    .line 654
    .line 655
    const v16, 0x403147ae    # 2.77f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, 0x3feccccd    # 1.85f

    .line 662
    .line 663
    .line 664
    const v18, 0x401ae148    # 2.42f

    .line 665
    .line 666
    .line 667
    const v13, 0x3f23d70a    # 0.64f

    .line 668
    .line 669
    .line 670
    const v14, 0x3f933333    # 1.15f

    .line 671
    .line 672
    .line 673
    const v15, 0x3f8a3d71    # 1.08f

    .line 674
    .line 675
    .line 676
    const v16, 0x3fd1eb85    # 1.64f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/16 v17, 0x0

    .line 683
    .line 684
    const v18, 0x3f35c28f    # 0.71f

    .line 685
    .line 686
    .line 687
    const v13, 0x3e428f5c    # 0.19f

    .line 688
    .line 689
    .line 690
    const v14, 0x3e4ccccd    # 0.2f

    .line 691
    .line 692
    .line 693
    const v15, 0x3e428f5c    # 0.19f

    .line 694
    .line 695
    .line 696
    const v16, 0x3f028f5c    # 0.51f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, -0x41428f5c    # -0.37f

    .line 703
    .line 704
    .line 705
    const v18, 0x3e19999a    # 0.15f

    .line 706
    .line 707
    .line 708
    const v13, -0x421eb852    # -0.11f

    .line 709
    .line 710
    .line 711
    const v14, 0x3dcccccd    # 0.1f

    .line 712
    .line 713
    .line 714
    const v15, -0x418a3d71    # -0.24f

    .line 715
    .line 716
    .line 717
    const v16, 0x3e19999a    # 0.15f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x41875c29    # 16.92f

    .line 727
    .line 728
    .line 729
    const v2, 0x419f851f    # 19.94f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v17, -0x3fb9999a    # -3.1f

    .line 736
    .line 737
    .line 738
    const v18, -0x409c28f6    # -0.89f

    .line 739
    .line 740
    .line 741
    const v13, -0x4067ae14    # -1.19f

    .line 742
    .line 743
    .line 744
    const/4 v14, 0x0

    .line 745
    const v15, -0x3ff0a3d7    # -2.24f

    .line 746
    .line 747
    .line 748
    const v16, -0x41666666    # -0.3f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, -0x3fe7ae14    # -2.38f

    .line 755
    .line 756
    .line 757
    const v18, -0x3f73851f    # -4.39f

    .line 758
    .line 759
    .line 760
    const v13, -0x404147ae    # -1.49f

    .line 761
    .line 762
    .line 763
    const v14, -0x407eb852    # -1.01f

    .line 764
    .line 765
    .line 766
    const v15, -0x3fe7ae14    # -2.38f

    .line 767
    .line 768
    .line 769
    const v16, -0x3fd66666    # -2.65f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v17, 0x3f000000    # 0.5f

    .line 776
    .line 777
    const/high16 v18, -0x41000000    # -0.5f

    .line 778
    .line 779
    const/4 v13, 0x0

    .line 780
    const v14, -0x4170a3d7    # -0.28f

    .line 781
    .line 782
    .line 783
    const v15, 0x3e6147ae    # 0.22f

    .line 784
    .line 785
    .line 786
    const/high16 v16, -0x41000000    # -0.5f

    .line 787
    .line 788
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, 0x3e6147ae    # 0.22f

    .line 792
    .line 793
    .line 794
    const/high16 v2, 0x3f000000    # 0.5f

    .line 795
    .line 796
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v17, 0x3ff851ec    # 1.94f

    .line 800
    .line 801
    .line 802
    const v18, 0x4063d70a    # 3.56f

    .line 803
    .line 804
    .line 805
    const v14, 0x3fb47ae1    # 1.41f

    .line 806
    .line 807
    .line 808
    const v15, 0x3f3851ec    # 0.72f

    .line 809
    .line 810
    .line 811
    const v16, 0x402f5c29    # 2.74f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, 0x40228f5c    # 2.54f

    .line 818
    .line 819
    .line 820
    const v18, 0x3f35c28f    # 0.71f

    .line 821
    .line 822
    .line 823
    const v13, 0x3f35c28f    # 0.71f

    .line 824
    .line 825
    .line 826
    const v14, 0x3ef5c28f    # 0.48f

    .line 827
    .line 828
    .line 829
    const v15, 0x3fc51eb8    # 1.54f

    .line 830
    .line 831
    .line 832
    const v16, 0x3f35c28f    # 0.71f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v17, 0x3f851eb8    # 1.04f

    .line 839
    .line 840
    .line 841
    const v18, -0x42333333    # -0.1f

    .line 842
    .line 843
    .line 844
    const v13, 0x3e75c28f    # 0.24f

    .line 845
    .line 846
    .line 847
    const/4 v14, 0x0

    .line 848
    const v15, 0x3f23d70a    # 0.64f

    .line 849
    .line 850
    .line 851
    const v16, -0x430a3d71    # -0.03f

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v17, 0x3f147ae1    # 0.58f

    .line 858
    .line 859
    .line 860
    const v18, 0x3ed1eb85    # 0.41f

    .line 861
    .line 862
    .line 863
    const v13, 0x3e8a3d71    # 0.27f

    .line 864
    .line 865
    .line 866
    const v14, -0x42b33333    # -0.05f

    .line 867
    .line 868
    .line 869
    const v15, 0x3f07ae14    # 0.53f

    .line 870
    .line 871
    .line 872
    const v16, 0x3e051eb8    # 0.13f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v17, -0x412e147b    # -0.41f

    .line 879
    .line 880
    .line 881
    const v18, 0x3f147ae1    # 0.58f

    .line 882
    .line 883
    .line 884
    const v13, 0x3d4ccccd    # 0.05f

    .line 885
    .line 886
    .line 887
    const v14, 0x3e8a3d71    # 0.27f

    .line 888
    .line 889
    .line 890
    const v15, -0x41fae148    # -0.13f

    .line 891
    .line 892
    .line 893
    const v16, 0x3f07ae14    # 0.53f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v17, -0x40651eb8    # -1.21f

    .line 900
    .line 901
    .line 902
    const v18, 0x3df5c28f    # 0.12f

    .line 903
    .line 904
    .line 905
    const v13, -0x40ee147b    # -0.57f

    .line 906
    .line 907
    .line 908
    const v14, 0x3de147ae    # 0.11f

    .line 909
    .line 910
    .line 911
    const v15, -0x40770a3d    # -1.07f

    .line 912
    .line 913
    .line 914
    const v16, 0x3df5c28f    # 0.12f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v0, 0x416e8f5c    # 14.91f

    .line 924
    .line 925
    .line 926
    const/high16 v2, 0x41b00000    # 22.0f

    .line 927
    .line 928
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v17, -0x41fae148    # -0.13f

    .line 932
    .line 933
    .line 934
    const v18, -0x435c28f6    # -0.02f

    .line 935
    .line 936
    .line 937
    const v13, -0x42dc28f6    # -0.04f

    .line 938
    .line 939
    .line 940
    const/4 v14, 0x0

    .line 941
    const v15, -0x4247ae14    # -0.09f

    .line 942
    .line 943
    .line 944
    const v16, -0x43dc28f6    # -0.01f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v17, -0x3f91eb85    # -3.72f

    .line 951
    .line 952
    .line 953
    const v18, -0x3ff9999a    # -2.1f

    .line 954
    .line 955
    .line 956
    const v13, -0x40347ae1    # -1.59f

    .line 957
    .line 958
    .line 959
    const v14, -0x411eb852    # -0.44f

    .line 960
    .line 961
    .line 962
    const v15, -0x3fd7ae14    # -2.63f

    .line 963
    .line 964
    .line 965
    const v16, -0x407c28f6    # -1.03f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v17, -0x3ff51eb8    # -2.17f

    .line 972
    .line 973
    .line 974
    const v18, -0x3f58f5c3    # -5.22f

    .line 975
    .line 976
    .line 977
    const v13, -0x404ccccd    # -1.4f

    .line 978
    .line 979
    .line 980
    const v14, -0x404e147b    # -1.39f

    .line 981
    .line 982
    .line 983
    const v15, -0x3ff51eb8    # -2.17f

    .line 984
    .line 985
    .line 986
    const v16, -0x3fb0a3d7    # -3.24f

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v17, 0x40451eb8    # 3.08f

    .line 993
    .line 994
    .line 995
    const v18, -0x3fc3d70a    # -2.94f

    .line 996
    .line 997
    .line 998
    const/4 v13, 0x0

    .line 999
    const v14, -0x4030a3d7    # -1.62f

    .line 1000
    .line 1001
    .line 1002
    const v15, 0x3fb0a3d7    # 1.38f

    .line 1003
    .line 1004
    .line 1005
    const v16, -0x3fc3d70a    # -2.94f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const v0, 0x3fa8f5c3    # 1.32f

    .line 1012
    .line 1013
    .line 1014
    const v2, 0x403c28f6    # 2.94f

    .line 1015
    .line 1016
    .line 1017
    const v4, 0x40451eb8    # 3.08f

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const v17, 0x40051eb8    # 2.08f

    .line 1024
    .line 1025
    .line 1026
    const v18, 0x3ff851ec    # 1.94f

    .line 1027
    .line 1028
    .line 1029
    const v14, 0x3f88f5c3    # 1.07f

    .line 1030
    .line 1031
    .line 1032
    const v15, 0x3f6e147b    # 0.93f

    .line 1033
    .line 1034
    .line 1035
    const v16, 0x3ff851ec    # 1.94f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const v0, -0x40a147ae    # -0.87f

    .line 1042
    .line 1043
    .line 1044
    const v2, -0x4007ae14    # -1.94f

    .line 1045
    .line 1046
    .line 1047
    const v4, 0x40051eb8    # 2.08f

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const/high16 v17, -0x3f180000    # -7.25f

    .line 1054
    .line 1055
    const v18, -0x3f2570a4    # -6.83f

    .line 1056
    .line 1057
    .line 1058
    const v14, -0x3f8eb852    # -3.77f

    .line 1059
    .line 1060
    .line 1061
    const/high16 v15, -0x3fb00000    # -3.25f

    .line 1062
    .line 1063
    const v16, -0x3f2570a4    # -6.83f

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const v17, -0x3f2c7ae1    # -6.61f

    .line 1070
    .line 1071
    .line 1072
    const v18, 0x4080f5c3    # 4.03f

    .line 1073
    .line 1074
    .line 1075
    const v13, -0x3fca3d71    # -2.84f

    .line 1076
    .line 1077
    .line 1078
    const/4 v14, 0x0

    .line 1079
    const v15, -0x3f51eb85    # -5.44f

    .line 1080
    .line 1081
    .line 1082
    const v16, 0x3fca3d71    # 1.58f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v17, -0x40e8f5c3    # -0.59f

    .line 1089
    .line 1090
    .line 1091
    const v18, 0x40333333    # 2.8f

    .line 1092
    .line 1093
    .line 1094
    const v13, -0x413851ec    # -0.39f

    .line 1095
    .line 1096
    .line 1097
    const v14, 0x3f4f5c29    # 0.81f

    .line 1098
    .line 1099
    .line 1100
    const v15, -0x40e8f5c3    # -0.59f

    .line 1101
    .line 1102
    .line 1103
    const v16, 0x3fe147ae    # 1.76f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const v17, 0x3f2b851f    # 0.67f

    .line 1110
    .line 1111
    .line 1112
    const v18, 0x40670a3d    # 3.61f

    .line 1113
    .line 1114
    .line 1115
    const/4 v13, 0x0

    .line 1116
    const v14, 0x3f47ae14    # 0.78f

    .line 1117
    .line 1118
    .line 1119
    const v15, 0x3d8f5c29    # 0.07f

    .line 1120
    .line 1121
    .line 1122
    const v16, 0x4000a3d7    # 2.01f

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const v17, -0x416b851f    # -0.29f

    .line 1129
    .line 1130
    .line 1131
    const v18, 0x3f23d70a    # 0.64f

    .line 1132
    .line 1133
    .line 1134
    const v13, 0x3dcccccd    # 0.1f

    .line 1135
    .line 1136
    .line 1137
    const v14, 0x3e851eb8    # 0.26f

    .line 1138
    .line 1139
    .line 1140
    const v15, -0x430a3d71    # -0.03f

    .line 1141
    .line 1142
    .line 1143
    const v16, 0x3f0ccccd    # 0.55f

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const v17, -0x40dc28f6    # -0.64f

    .line 1150
    .line 1151
    .line 1152
    const v18, -0x416b851f    # -0.29f

    .line 1153
    .line 1154
    .line 1155
    const v13, -0x417ae148    # -0.26f

    .line 1156
    .line 1157
    .line 1158
    const v14, 0x3dcccccd    # 0.1f

    .line 1159
    .line 1160
    .line 1161
    const v15, -0x40f33333    # -0.55f

    .line 1162
    .line 1163
    .line 1164
    const v16, -0x42dc28f6    # -0.04f

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1168
    .line 1169
    .line 1170
    const v17, -0x40c51eb8    # -0.73f

    .line 1171
    .line 1172
    .line 1173
    const v18, -0x3f828f5c    # -3.96f

    .line 1174
    .line 1175
    .line 1176
    const v13, -0x41051eb8    # -0.49f

    .line 1177
    .line 1178
    .line 1179
    const v14, -0x405851ec    # -1.31f

    .line 1180
    .line 1181
    .line 1182
    const v15, -0x40c51eb8    # -0.73f

    .line 1183
    .line 1184
    .line 1185
    const v16, -0x3fd8f5c3    # -2.61f

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const v17, 0x3f2e147b    # 0.68f

    .line 1192
    .line 1193
    .line 1194
    const v18, -0x3fb0a3d7    # -3.24f

    .line 1195
    .line 1196
    .line 1197
    const/4 v13, 0x0

    .line 1198
    const v14, -0x40666666    # -1.2f

    .line 1199
    .line 1200
    .line 1201
    const v15, 0x3e6b851f    # 0.23f

    .line 1202
    .line 1203
    .line 1204
    const v16, -0x3fed70a4    # -2.29f

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    const v17, 0x40f051ec    # 7.51f

    .line 1211
    .line 1212
    .line 1213
    const v18, -0x3f6ccccd    # -4.6f

    .line 1214
    .line 1215
    .line 1216
    const v13, 0x3faa3d71    # 1.33f

    .line 1217
    .line 1218
    .line 1219
    const v14, -0x3fcd70a4    # -2.79f

    .line 1220
    .line 1221
    .line 1222
    const v15, 0x4088f5c3    # 4.28f

    .line 1223
    .line 1224
    .line 1225
    const v16, -0x3f6ccccd    # -4.6f

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    const/high16 v17, 0x41040000    # 8.25f

    .line 1232
    .line 1233
    const v18, 0x40fa8f5c    # 7.83f

    .line 1234
    .line 1235
    .line 1236
    const v13, 0x4091999a    # 4.55f

    .line 1237
    .line 1238
    .line 1239
    const/4 v14, 0x0

    .line 1240
    const/high16 v15, 0x41040000    # 8.25f

    .line 1241
    .line 1242
    const v16, 0x4060a3d7    # 3.51f

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v17, -0x3fbae148    # -3.08f

    .line 1249
    .line 1250
    .line 1251
    const v18, 0x403c28f6    # 2.94f

    .line 1252
    .line 1253
    .line 1254
    const/4 v13, 0x0

    .line 1255
    const v14, 0x3fcf5c29    # 1.62f

    .line 1256
    .line 1257
    .line 1258
    const v15, -0x404f5c29    # -1.38f

    .line 1259
    .line 1260
    .line 1261
    const v16, 0x403c28f6    # 2.94f

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const v0, -0x40570a3d    # -1.32f

    .line 1268
    .line 1269
    .line 1270
    const v2, -0x3fc3d70a    # -2.94f

    .line 1271
    .line 1272
    .line 1273
    const v4, -0x3fbae148    # -3.08f

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const v17, -0x3ffae148    # -2.08f

    .line 1280
    .line 1281
    .line 1282
    const v18, -0x4007ae14    # -1.94f

    .line 1283
    .line 1284
    .line 1285
    const v14, -0x40770a3d    # -1.07f

    .line 1286
    .line 1287
    .line 1288
    const v15, -0x4091eb85    # -0.93f

    .line 1289
    .line 1290
    .line 1291
    const v16, -0x4007ae14    # -1.94f

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const v0, 0x3f5eb852    # 0.87f

    .line 1298
    .line 1299
    .line 1300
    const v2, 0x3ff851ec    # 1.94f

    .line 1301
    .line 1302
    .line 1303
    const v4, -0x3ffae148    # -2.08f

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const v17, 0x3fef5c29    # 1.87f

    .line 1310
    .line 1311
    .line 1312
    const v18, 0x409051ec    # 4.51f

    .line 1313
    .line 1314
    .line 1315
    const v14, 0x3fdae148    # 1.71f

    .line 1316
    .line 1317
    .line 1318
    const v15, 0x3f28f5c3    # 0.66f

    .line 1319
    .line 1320
    .line 1321
    const v16, 0x4053d70a    # 3.31f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v17, 0x405147ae    # 3.27f

    .line 1328
    .line 1329
    .line 1330
    const v18, 0x3feccccd    # 1.85f

    .line 1331
    .line 1332
    .line 1333
    const v13, 0x3f733333    # 0.95f

    .line 1334
    .line 1335
    .line 1336
    const v14, 0x3f70a3d7    # 0.94f

    .line 1337
    .line 1338
    .line 1339
    const v15, 0x3fee147b    # 1.86f

    .line 1340
    .line 1341
    .line 1342
    const v16, 0x3fbae148    # 1.46f

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    const v17, 0x3eb33333    # 0.35f

    .line 1349
    .line 1350
    .line 1351
    const v18, 0x3f1c28f6    # 0.61f

    .line 1352
    .line 1353
    .line 1354
    const v13, 0x3e8a3d71    # 0.27f

    .line 1355
    .line 1356
    .line 1357
    const v14, 0x3d8f5c29    # 0.07f

    .line 1358
    .line 1359
    .line 1360
    const v15, 0x3ed70a3d    # 0.42f

    .line 1361
    .line 1362
    .line 1363
    const v16, 0x3eb33333    # 0.35f

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    const v17, -0x410f5c29    # -0.47f

    .line 1370
    .line 1371
    .line 1372
    const v18, 0x3ec28f5c    # 0.38f

    .line 1373
    .line 1374
    .line 1375
    const v13, -0x42b33333    # -0.05f

    .line 1376
    .line 1377
    .line 1378
    const v14, 0x3e6b851f    # 0.23f

    .line 1379
    .line 1380
    .line 1381
    const v15, -0x417ae148    # -0.26f

    .line 1382
    .line 1383
    .line 1384
    const v16, 0x3ec28f5c    # 0.38f

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    const/16 v16, 0x3800

    .line 1398
    .line 1399
    const/16 v17, 0x0

    .line 1400
    .line 1401
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1402
    .line 1403
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1404
    .line 1405
    const/4 v7, 0x0

    .line 1406
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1407
    .line 1408
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1409
    .line 1410
    const/4 v13, 0x0

    .line 1411
    const/4 v14, 0x0

    .line 1412
    const/4 v15, 0x0

    .line 1413
    const-string v4, ""

    .line 1414
    .line 1415
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    sput-object v0, Landroidx/compose/material/icons/outlined/FingerprintKt;->_fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1424
    .line 1425
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    return-object v0
.end method
