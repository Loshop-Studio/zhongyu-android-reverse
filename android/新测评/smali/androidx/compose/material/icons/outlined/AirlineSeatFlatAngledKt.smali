.class public final Landroidx/compose/material/icons/outlined/AirlineSeatFlatAngledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_airlineSeatFlatAngled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AirlineSeatFlatAngled",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAirlineSeatFlatAngled",
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
        "SMAP\nAirlineSeatFlatAngled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/outlined/AirlineSeatFlatAngledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/outlined/AirlineSeatFlatAngledKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatFlatAngled(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AirlineSeatFlatAngled"

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
    const/high16 v0, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3f666666    # 0.9f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f0f5c29    # 0.56f

    .line 81
    .line 82
    .line 83
    const v13, 0x3e9eb852    # 0.31f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3f333333    # 0.7f

    .line 88
    .line 89
    .line 90
    const v16, 0x3e19999a    # 0.15f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x410f5c29    # -0.47f

    .line 97
    .line 98
    .line 99
    const v18, 0x3fab851f    # 1.34f

    .line 100
    .line 101
    .line 102
    const v13, 0x3e75c28f    # 0.24f

    .line 103
    .line 104
    .line 105
    const/high16 v14, 0x3f000000    # 0.5f

    .line 106
    .line 107
    const v15, 0x3ca3d70a    # 0.02f

    .line 108
    .line 109
    .line 110
    const v16, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x4123d70a    # -0.43f

    .line 117
    .line 118
    .line 119
    const v18, 0x3dcccccd    # 0.1f

    .line 120
    .line 121
    .line 122
    const v13, -0x41f0a3d7    # -0.14f

    .line 123
    .line 124
    .line 125
    const v14, 0x3d75c28f    # 0.06f

    .line 126
    .line 127
    .line 128
    const v15, -0x4170a3d7    # -0.28f

    .line 129
    .line 130
    .line 131
    const v16, 0x3dcccccd    # 0.1f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x409c28f6    # -0.89f

    .line 138
    .line 139
    .line 140
    const v18, -0x40f0a3d7    # -0.56f

    .line 141
    .line 142
    .line 143
    const v13, -0x41666666    # -0.3f

    .line 144
    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    const v15, -0x40cccccd    # -0.7f

    .line 148
    .line 149
    .line 150
    const v16, -0x41e66666    # -0.15f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x42b33333    # -0.05f

    .line 157
    .line 158
    .line 159
    const v18, -0x40b851ec    # -0.78f

    .line 160
    .line 161
    .line 162
    const v13, -0x41d1eb85    # -0.17f

    .line 163
    .line 164
    .line 165
    const v14, -0x4151eb85    # -0.34f

    .line 166
    .line 167
    .line 168
    const v15, -0x42333333    # -0.1f

    .line 169
    .line 170
    .line 171
    const v16, -0x40deb852    # -0.63f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f028f5c    # 0.51f

    .line 178
    .line 179
    .line 180
    const v18, -0x40f0a3d7    # -0.56f

    .line 181
    .line 182
    .line 183
    const v13, 0x3d4ccccd    # 0.05f

    .line 184
    .line 185
    .line 186
    const v14, -0x41f0a3d7    # -0.14f

    .line 187
    .line 188
    .line 189
    const v15, 0x3e3851ec    # 0.18f

    .line 190
    .line 191
    .line 192
    const v16, -0x41333333    # -0.4f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x3edc28f6    # 0.43f

    .line 199
    .line 200
    .line 201
    const v18, -0x42333333    # -0.1f

    .line 202
    .line 203
    .line 204
    const v13, 0x3e0f5c29    # 0.14f

    .line 205
    .line 206
    .line 207
    const v14, -0x428a3d71    # -0.06f

    .line 208
    .line 209
    .line 210
    const v15, 0x3e8f5c29    # 0.28f

    .line 211
    .line 212
    .line 213
    const v16, -0x42333333    # -0.1f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x40cf0a3d    # 6.47f

    .line 220
    .line 221
    .line 222
    const v2, 0x40070a3d    # 2.11f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x40d6147b    # 6.69f

    .line 229
    .line 230
    .line 231
    const v2, 0x401a3d71    # 2.41f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3f933333    # 1.15f

    .line 238
    .line 239
    .line 240
    const v18, 0x3f866666    # 1.05f

    .line 241
    .line 242
    .line 243
    const v13, 0x3f051eb8    # 0.52f

    .line 244
    .line 245
    .line 246
    const v14, 0x3e428f5c    # 0.19f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f6e147b    # 0.93f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f0f5c29    # 0.56f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x3d75c28f    # 0.06f

    .line 259
    .line 260
    .line 261
    const v18, 0x3fc3d70a    # 1.53f

    .line 262
    .line 263
    .line 264
    const v13, 0x3e6147ae    # 0.22f

    .line 265
    .line 266
    .line 267
    const v14, 0x3ef5c28f    # 0.48f

    .line 268
    .line 269
    .line 270
    const/high16 v15, 0x3e800000    # 0.25f

    .line 271
    .line 272
    const v16, 0x3f83d70a    # 1.03f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x43dc28f6    # -0.01f

    .line 279
    .line 280
    .line 281
    const v2, 0x3ca3d70a    # 0.02f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x3ef68f5c    # -8.59f

    .line 288
    .line 289
    .line 290
    const v2, -0x3fb8f5c3    # -3.11f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3f333333    # 0.7f

    .line 297
    .line 298
    .line 299
    const v2, -0x400ccccd    # -1.9f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41200000    # 10.0f

    .line 306
    .line 307
    const v2, 0x41730a3d    # 15.19f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x40800000    # 4.0f

    .line 314
    .line 315
    const v2, 0x3fb851ec    # 1.44f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41600000    # 14.0f

    .line 322
    .line 323
    const/high16 v2, 0x41880000    # 17.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, -0x3f800000    # -4.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x401851ec    # -1.81f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x40900000    # 4.5f

    .line 340
    .line 341
    const/high16 v2, 0x40c00000    # 6.0f

    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x4059999a    # -1.3f

    .line 347
    .line 348
    .line 349
    const v18, 0x3e99999a    # 0.3f

    .line 350
    .line 351
    .line 352
    const v13, -0x411eb852    # -0.44f

    .line 353
    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    const v15, -0x409eb852    # -0.88f

    .line 357
    .line 358
    .line 359
    const v16, 0x3dcccccd    # 0.1f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, -0x404ccccd    # -1.4f

    .line 366
    .line 367
    .line 368
    const/high16 v18, 0x40800000    # 4.0f

    .line 369
    .line 370
    const v13, -0x404147ae    # -1.49f

    .line 371
    .line 372
    .line 373
    const v14, 0x3f35c28f    # 0.71f

    .line 374
    .line 375
    .line 376
    const v15, -0x3ff851ec    # -2.12f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x40200000    # 2.5f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x402ccccd    # 2.7f

    .line 385
    .line 386
    .line 387
    const v18, 0x3fd9999a    # 1.7f

    .line 388
    .line 389
    .line 390
    const v13, 0x3f028f5c    # 0.51f

    .line 391
    .line 392
    .line 393
    const v14, 0x3f88f5c3    # 1.07f

    .line 394
    .line 395
    .line 396
    const v15, 0x3fca3d71    # 1.58f

    .line 397
    .line 398
    .line 399
    const v16, 0x3fd9999a    # 1.7f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x3fa66666    # 1.3f

    .line 406
    .line 407
    .line 408
    const v18, -0x41666666    # -0.3f

    .line 409
    .line 410
    .line 411
    const v13, 0x3ee147ae    # 0.44f

    .line 412
    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const v15, 0x3f6147ae    # 0.88f

    .line 416
    .line 417
    .line 418
    const v16, -0x42333333    # -0.1f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x3fb47ae1    # 1.41f

    .line 425
    .line 426
    .line 427
    const/high16 v18, -0x3f800000    # -4.0f

    .line 428
    .line 429
    const v13, 0x3fbeb852    # 1.49f

    .line 430
    .line 431
    .line 432
    const v14, -0x40c7ae14    # -0.72f

    .line 433
    .line 434
    .line 435
    const v15, 0x4007ae14    # 2.12f

    .line 436
    .line 437
    .line 438
    const v16, -0x3fdf5c29    # -2.51f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x40c00000    # 6.0f

    .line 445
    .line 446
    const/high16 v18, 0x40900000    # 4.5f

    .line 447
    .line 448
    const v13, 0x41030a3d    # 8.19f

    .line 449
    .line 450
    .line 451
    const v14, 0x40a428f6    # 5.13f

    .line 452
    .line 453
    .line 454
    const v15, 0x40e3d70a    # 7.12f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x40900000    # 4.5f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x41347ae1    # 11.28f

    .line 466
    .line 467
    .line 468
    const v2, 0x40c1999a    # 6.05f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x41133333    # 9.2f

    .line 475
    .line 476
    .line 477
    const v2, 0x413b5c29    # 11.71f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x4145c28f    # 12.36f

    .line 484
    .line 485
    .line 486
    const v2, 0x408f0a3d    # 4.47f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x400e147b    # -1.89f

    .line 493
    .line 494
    .line 495
    const v2, 0x3f30a3d7    # 0.69f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x3fe5c28f    # -2.41f

    .line 502
    .line 503
    .line 504
    const v18, -0x3f5b3333    # -5.15f

    .line 505
    .line 506
    .line 507
    const v13, 0x3f451eb8    # 0.77f

    .line 508
    .line 509
    .line 510
    const v14, -0x3ffa3d71    # -2.09f

    .line 511
    .line 512
    .line 513
    const v15, -0x416147ae    # -0.31f

    .line 514
    .line 515
    .line 516
    const v16, -0x3f73851f    # -4.39f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, -0x3ef70a3d    # -8.56f

    .line 523
    .line 524
    .line 525
    const v2, -0x3fba3d71    # -3.09f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x400c28f6    # 2.19f

    .line 535
    .line 536
    .line 537
    const/high16 v2, 0x41240000    # 10.25f

    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x40cf5c29    # -0.69f

    .line 543
    .line 544
    .line 545
    const v2, 0x3ff1eb85    # 1.89f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x4167ae14    # 14.48f

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x41000000    # 8.0f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x41980000    # 19.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41000000    # 8.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, -0x402f5c29    # -1.63f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x41a428f6    # 20.52f

    .line 576
    .line 577
    .line 578
    const/high16 v2, 0x41980000    # 19.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, -0x400e147b    # -1.89f

    .line 584
    .line 585
    .line 586
    const v2, 0x3f30a3d7    # 0.69f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, -0x3e67d70a    # -19.02f

    .line 593
    .line 594
    .line 595
    const v2, -0x3f247ae1    # -6.86f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    const/16 v16, 0x3800

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    const/high16 v6, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/high16 v8, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v7, 0x0

    .line 617
    const/high16 v9, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const/high16 v12, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const/4 v14, 0x0

    .line 623
    const/4 v15, 0x0

    .line 624
    const-string v4, ""

    .line 625
    .line 626
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    sput-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-object v0
.end method
