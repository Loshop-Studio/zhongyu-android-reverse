.class public final Landroidx/compose/material/icons/outlined/SpaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_spa",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Spa",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSpa",
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
        "SMAP\nSpa.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/outlined/SpaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/outlined/SpaKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _spa:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpa(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Spa"

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
    const v0, 0x4177d70a    # 15.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x411a147b    # 9.63f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3fa47ae1    # -3.43f

    .line 80
    .line 81
    .line 82
    const v18, -0x3f0bd70a    # -7.63f

    .line 83
    .line 84
    .line 85
    const v13, -0x41c7ae14    # -0.18f

    .line 86
    .line 87
    .line 88
    const v14, -0x3fcd70a4    # -2.79f

    .line 89
    .line 90
    .line 91
    const v15, -0x405851ec    # -1.31f

    .line 92
    .line 93
    .line 94
    const v16, -0x3f4fae14    # -5.51f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3f9ccccd    # -3.55f

    .line 101
    .line 102
    .line 103
    const v18, 0x40f428f6    # 7.63f

    .line 104
    .line 105
    .line 106
    const v13, -0x3ff70a3d    # -2.14f

    .line 107
    .line 108
    .line 109
    const v14, 0x4008f5c3    # 2.14f

    .line 110
    .line 111
    .line 112
    const v15, -0x3fab851f    # -3.32f

    .line 113
    .line 114
    .line 115
    const v16, 0x409b851f    # 4.86f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x405f5c29    # 3.49f

    .line 122
    .line 123
    .line 124
    const v18, 0x402851ec    # 2.63f

    .line 125
    .line 126
    .line 127
    const v13, 0x3fa3d70a    # 1.28f

    .line 128
    .line 129
    .line 130
    const v14, 0x3f2e147b    # 0.68f

    .line 131
    .line 132
    .line 133
    const v15, 0x401d70a4    # 2.46f

    .line 134
    .line 135
    .line 136
    const v16, 0x3fc7ae14    # 1.56f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v18, -0x3fd7ae14    # -2.63f

    .line 143
    .line 144
    .line 145
    const v13, 0x3f83d70a    # 1.03f

    .line 146
    .line 147
    .line 148
    const v14, -0x407851ec    # -1.06f

    .line 149
    .line 150
    .line 151
    const v15, 0x400d70a4    # 2.21f

    .line 152
    .line 153
    .line 154
    const v16, -0x4007ae14    # -1.94f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x4140cccd    # 12.05f

    .line 164
    .line 165
    .line 166
    const v2, 0x40a6147b    # 5.19f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x3fa66666    # 1.3f

    .line 173
    .line 174
    .line 175
    const v18, 0x405851ec    # 3.38f

    .line 176
    .line 177
    .line 178
    const v13, 0x3f2147ae    # 0.63f

    .line 179
    .line 180
    .line 181
    const v14, 0x3f83d70a    # 1.03f

    .line 182
    .line 183
    .line 184
    const v15, 0x3f88f5c3    # 1.07f

    .line 185
    .line 186
    .line 187
    const v16, 0x400b851f    # 2.18f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x40547ae1    # -1.34f

    .line 194
    .line 195
    .line 196
    const v18, 0x3f7ae148    # 0.98f

    .line 197
    .line 198
    .line 199
    const v13, -0x410f5c29    # -0.47f

    .line 200
    .line 201
    .line 202
    const v14, 0x3e99999a    # 0.3f

    .line 203
    .line 204
    .line 205
    const v15, -0x40970a3d    # -0.91f

    .line 206
    .line 207
    .line 208
    const v16, 0x3f2147ae    # 0.63f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x4055c28f    # -1.33f

    .line 215
    .line 216
    .line 217
    const v18, -0x4087ae14    # -0.97f

    .line 218
    .line 219
    .line 220
    const v13, -0x4128f5c3    # -0.42f

    .line 221
    .line 222
    .line 223
    const v14, -0x4151eb85    # -0.34f

    .line 224
    .line 225
    .line 226
    const v15, -0x40a147ae    # -0.87f

    .line 227
    .line 228
    .line 229
    const v16, -0x40d47ae1    # -0.67f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3faf5c29    # 1.37f

    .line 236
    .line 237
    .line 238
    const v18, -0x3fa70a3d    # -3.39f

    .line 239
    .line 240
    .line 241
    const/high16 v13, 0x3e800000    # 0.25f

    .line 242
    .line 243
    const v14, -0x40666666    # -1.2f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f35c28f    # 0.71f

    .line 247
    .line 248
    .line 249
    const v16, -0x3fe9999a    # -2.35f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x41773333    # 15.45f

    .line 259
    .line 260
    .line 261
    const/high16 v2, 0x41400000    # 12.0f

    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, -0x3fbc28f6    # -3.06f

    .line 267
    .line 268
    .line 269
    const v18, -0x3fb33333    # -3.2f

    .line 270
    .line 271
    .line 272
    const v13, -0x40ae147b    # -0.82f

    .line 273
    .line 274
    .line 275
    const/high16 v14, -0x40600000    # -1.25f

    .line 276
    .line 277
    const v15, -0x4011eb85    # -1.86f

    .line 278
    .line 279
    .line 280
    const v16, -0x3fea3d71    # -2.34f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x41333333    # -0.4f

    .line 287
    .line 288
    .line 289
    const v18, -0x417ae148    # -0.26f

    .line 290
    .line 291
    .line 292
    const v13, -0x41fae148    # -0.13f

    .line 293
    .line 294
    .line 295
    const v14, -0x4247ae14    # -0.09f

    .line 296
    .line 297
    .line 298
    const v15, -0x4175c28f    # -0.27f

    .line 299
    .line 300
    .line 301
    const v16, -0x41dc28f6    # -0.16f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x3ec7ae14    # 0.39f

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x3e800000    # 0.25f

    .line 311
    .line 312
    const v13, 0x3e051eb8    # 0.13f

    .line 313
    .line 314
    .line 315
    const v14, 0x3db851ec    # 0.09f

    .line 316
    .line 317
    .line 318
    const v15, 0x3e8a3d71    # 0.27f

    .line 319
    .line 320
    .line 321
    const v16, 0x3e2e147b    # 0.17f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/high16 v18, 0x41200000    # 10.0f

    .line 330
    .line 331
    const v13, 0x40df5c29    # 6.98f

    .line 332
    .line 333
    .line 334
    const v14, 0x412d47ae    # 10.83f

    .line 335
    .line 336
    .line 337
    const v15, 0x4092e148    # 4.59f

    .line 338
    .line 339
    .line 340
    const/high16 v16, 0x41200000    # 10.0f

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, 0x41007ae1    # 8.03f

    .line 346
    .line 347
    .line 348
    const v18, 0x4137d70a    # 11.49f

    .line 349
    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const v14, 0x40aa3d71    # 5.32f

    .line 353
    .line 354
    .line 355
    const v15, 0x40570a3d    # 3.36f

    .line 356
    .line 357
    .line 358
    const v16, 0x411d1eb8    # 9.82f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x3ffc28f6    # 1.97f

    .line 365
    .line 366
    .line 367
    const v18, 0x3f028f5c    # 0.51f

    .line 368
    .line 369
    .line 370
    const v13, 0x3f2147ae    # 0.63f

    .line 371
    .line 372
    .line 373
    const v14, 0x3e6b851f    # 0.23f

    .line 374
    .line 375
    .line 376
    const v15, 0x3fa51eb8    # 1.29f

    .line 377
    .line 378
    .line 379
    const v16, 0x3ecccccd    # 0.4f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v18, -0x40fd70a4    # -0.51f

    .line 386
    .line 387
    .line 388
    const v13, 0x3f2e147b    # 0.68f

    .line 389
    .line 390
    .line 391
    const v14, -0x420a3d71    # -0.12f

    .line 392
    .line 393
    .line 394
    const v15, 0x3faa3d71    # 1.33f

    .line 395
    .line 396
    .line 397
    const v16, -0x416b851f    # -0.29f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41b00000    # 22.0f

    .line 404
    .line 405
    const/high16 v18, 0x41200000    # 10.0f

    .line 406
    .line 407
    const v13, 0x41951eb8    # 18.64f

    .line 408
    .line 409
    .line 410
    const v14, 0x419e8f5c    # 19.82f

    .line 411
    .line 412
    .line 413
    const/high16 v15, 0x41b00000    # 22.0f

    .line 414
    .line 415
    const v16, 0x41751eb8    # 15.32f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 422
    .line 423
    const v18, 0x40ae6666    # 5.45f

    .line 424
    .line 425
    .line 426
    const v13, -0x3f7a3d71    # -4.18f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const v15, -0x3f04cccd    # -7.85f

    .line 431
    .line 432
    .line 433
    const v16, 0x400ae148    # 2.17f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x41551eb8    # 13.32f

    .line 443
    .line 444
    .line 445
    const v2, 0x419ccccd    # 19.6f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, -0x4055c28f    # -1.33f

    .line 452
    .line 453
    .line 454
    const v18, 0x3ebd70a4    # 0.37f

    .line 455
    .line 456
    .line 457
    const v13, -0x411eb852    # -0.44f

    .line 458
    .line 459
    .line 460
    const v14, 0x3e19999a    # 0.15f

    .line 461
    .line 462
    .line 463
    const v15, -0x409eb852    # -0.88f

    .line 464
    .line 465
    .line 466
    const v16, 0x3e8a3d71    # 0.27f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, -0x405c28f6    # -1.28f

    .line 473
    .line 474
    .line 475
    const v18, -0x4147ae14    # -0.36f

    .line 476
    .line 477
    .line 478
    const v14, -0x4247ae14    # -0.09f

    .line 479
    .line 480
    .line 481
    const v15, -0x40a147ae    # -0.87f

    .line 482
    .line 483
    .line 484
    const v16, -0x41a8f5c3    # -0.21f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x3f31999a    # -6.45f

    .line 491
    .line 492
    .line 493
    const v18, -0x3f14cccd    # -7.35f

    .line 494
    .line 495
    .line 496
    const v13, -0x3fad70a4    # -3.29f

    .line 497
    .line 498
    .line 499
    const v14, -0x4068f5c3    # -1.18f

    .line 500
    .line 501
    .line 502
    const v15, -0x3f49999a    # -5.7f

    .line 503
    .line 504
    .line 505
    const v16, -0x3f80a3d7    # -3.99f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x4047ae14    # 3.12f

    .line 512
    .line 513
    .line 514
    const v18, 0x3faa3d71    # 1.33f

    .line 515
    .line 516
    .line 517
    const v13, 0x3f8ccccd    # 1.1f

    .line 518
    .line 519
    .line 520
    const v14, 0x3e851eb8    # 0.26f

    .line 521
    .line 522
    .line 523
    const v15, 0x4009999a    # 2.15f

    .line 524
    .line 525
    .line 526
    const v16, 0x3f35c28f    # 0.71f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, 0x3c23d70a    # 0.01f

    .line 533
    .line 534
    .line 535
    const v2, -0x435c28f6    # -0.02f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3ec7ae14    # 0.39f

    .line 542
    .line 543
    .line 544
    const/high16 v18, 0x3e800000    # 0.25f

    .line 545
    .line 546
    const v13, 0x3e051eb8    # 0.13f

    .line 547
    .line 548
    .line 549
    const v14, 0x3db851ec    # 0.09f

    .line 550
    .line 551
    .line 552
    const v15, 0x3e851eb8    # 0.26f

    .line 553
    .line 554
    .line 555
    const v16, 0x3e3851ec    # 0.18f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3d23d70a    # 0.04f

    .line 562
    .line 563
    .line 564
    const v2, 0x3d8f5c29    # 0.07f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x4020a3d7    # 2.51f

    .line 571
    .line 572
    .line 573
    const v18, 0x4029999a    # 2.65f

    .line 574
    .line 575
    .line 576
    const v13, 0x3f7d70a4    # 0.99f

    .line 577
    .line 578
    .line 579
    const v14, 0x3f3851ec    # 0.72f

    .line 580
    .line 581
    .line 582
    const v15, 0x3feb851f    # 1.84f

    .line 583
    .line 584
    .line 585
    const v16, 0x3fce147b    # 1.61f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x4198cccd    # 19.1f

    .line 592
    .line 593
    .line 594
    const/high16 v2, 0x41400000    # 12.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3fd5c28f    # 1.67f

    .line 600
    .line 601
    .line 602
    const v2, -0x3fdccccd    # -2.55f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x4021eb85    # 2.53f

    .line 609
    .line 610
    .line 611
    const v18, -0x3fd5c28f    # -2.66f

    .line 612
    .line 613
    .line 614
    const v13, 0x3f30a3d7    # 0.69f

    .line 615
    .line 616
    .line 617
    const v14, -0x4079999a    # -1.05f

    .line 618
    .line 619
    .line 620
    const v15, 0x3fc66666    # 1.55f

    .line 621
    .line 622
    .line 623
    const v16, -0x40066666    # -1.95f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x42b33333    # -0.05f

    .line 630
    .line 631
    .line 632
    const v2, 0x3d8f5c29    # 0.07f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x3e8a3d71    # 0.27f

    .line 639
    .line 640
    .line 641
    const v18, -0x41d1eb85    # -0.17f

    .line 642
    .line 643
    .line 644
    const v13, 0x3db851ec    # 0.09f

    .line 645
    .line 646
    .line 647
    const v14, -0x42b33333    # -0.05f

    .line 648
    .line 649
    .line 650
    const v15, 0x3e3851ec    # 0.18f

    .line 651
    .line 652
    .line 653
    const v16, -0x421eb852    # -0.11f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, -0x43dc28f6    # -0.01f

    .line 660
    .line 661
    .line 662
    const v2, -0x435c28f6    # -0.02f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, 0x404d70a4    # 3.21f

    .line 669
    .line 670
    .line 671
    const v18, -0x404ccccd    # -1.4f

    .line 672
    .line 673
    .line 674
    const v13, 0x3f7ae148    # 0.98f

    .line 675
    .line 676
    .line 677
    const v14, -0x40d9999a    # -0.65f

    .line 678
    .line 679
    .line 680
    const v15, 0x40047ae1    # 2.07f

    .line 681
    .line 682
    .line 683
    const v16, -0x406f5c29    # -1.13f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x3f328f5c    # -6.42f

    .line 690
    .line 691
    .line 692
    const v18, 0x40eb3333    # 7.35f

    .line 693
    .line 694
    .line 695
    const/high16 v13, -0x40c00000    # -0.75f

    .line 696
    .line 697
    const v14, 0x4057ae14    # 3.37f

    .line 698
    .line 699
    .line 700
    const v15, -0x3fb66666    # -3.15f

    .line 701
    .line 702
    .line 703
    const v16, 0x40c5c28f    # 6.18f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x410fd70a    # 8.99f

    .line 713
    .line 714
    .line 715
    const v2, 0x41447ae1    # 12.28f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, -0x42b33333    # -0.05f

    .line 722
    .line 723
    .line 724
    const v18, -0x42dc28f6    # -0.04f

    .line 725
    .line 726
    .line 727
    const v13, -0x435c28f6    # -0.02f

    .line 728
    .line 729
    .line 730
    const v14, -0x43dc28f6    # -0.01f

    .line 731
    .line 732
    .line 733
    const v15, -0x42dc28f6    # -0.04f

    .line 734
    .line 735
    .line 736
    const v16, -0x430a3d71    # -0.03f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x3c23d70a    # 0.01f

    .line 743
    .line 744
    .line 745
    const v18, 0x3c23d70a    # 0.01f

    .line 746
    .line 747
    .line 748
    const/4 v13, 0x0

    .line 749
    const/4 v14, 0x0

    .line 750
    const v15, 0x3c23d70a    # 0.01f

    .line 751
    .line 752
    .line 753
    const/16 v16, 0x0

    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v17, 0x3d23d70a    # 0.04f

    .line 759
    .line 760
    .line 761
    const v18, 0x3cf5c28f    # 0.03f

    .line 762
    .line 763
    .line 764
    const v13, 0x3c23d70a    # 0.01f

    .line 765
    .line 766
    .line 767
    const v14, 0x3c23d70a    # 0.01f

    .line 768
    .line 769
    .line 770
    const v15, 0x3ca3d70a    # 0.02f

    .line 771
    .line 772
    .line 773
    const v16, 0x3ca3d70a    # 0.02f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    const/16 v16, 0x3800

    .line 787
    .line 788
    const/16 v17, 0x0

    .line 789
    .line 790
    const/high16 v6, 0x3f800000    # 1.0f

    .line 791
    .line 792
    const/high16 v8, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/4 v7, 0x0

    .line 795
    const/high16 v9, 0x3f800000    # 1.0f

    .line 796
    .line 797
    const/high16 v12, 0x3f800000    # 1.0f

    .line 798
    .line 799
    const/4 v13, 0x0

    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const-string v4, ""

    .line 803
    .line 804
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    sput-object v0, Landroidx/compose/material/icons/outlined/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 813
    .line 814
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    return-object v0
.end method
