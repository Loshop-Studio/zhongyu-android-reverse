.class public final Landroidx/compose/material/icons/rounded/AirlineSeatReclineExtraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_airlineSeatReclineExtra",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AirlineSeatReclineExtra",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAirlineSeatReclineExtra",
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
        "SMAP\nAirlineSeatReclineExtra.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatReclineExtra.kt\nandroidx/compose/material/icons/rounded/AirlineSeatReclineExtraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 AirlineSeatReclineExtra.kt\nandroidx/compose/material/icons/rounded/AirlineSeatReclineExtraKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatReclineExtra(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatReclineExtraKt;->_airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AirlineSeatReclineExtra"

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
    const v0, 0x40ab3333    # 5.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b47ae1    # 5.64f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41051eb8    # -0.49f

    .line 80
    .line 81
    .line 82
    const v18, -0x3fcd70a4    # -2.79f

    .line 83
    .line 84
    .line 85
    const v13, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const v14, -0x40dc28f6    # -0.64f

    .line 89
    .line 90
    .line 91
    const v15, -0x4070a3d7    # -1.12f

    .line 92
    .line 93
    .line 94
    const v16, -0x400f5c29    # -1.88f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x40328f5c    # 2.79f

    .line 101
    .line 102
    .line 103
    const v18, -0x41051eb8    # -0.49f

    .line 104
    .line 105
    .line 106
    const v13, 0x3f2147ae    # 0.63f

    .line 107
    .line 108
    .line 109
    const v14, -0x4099999a    # -0.9f

    .line 110
    .line 111
    .line 112
    const v15, 0x3ff0a3d7    # 1.88f

    .line 113
    .line 114
    .line 115
    const v16, -0x4070a3d7    # -1.12f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3efae148    # 0.49f

    .line 122
    .line 123
    .line 124
    const v18, 0x40328f5c    # 2.79f

    .line 125
    .line 126
    .line 127
    const v13, 0x3f666666    # 0.9f

    .line 128
    .line 129
    .line 130
    const v14, 0x3f23d70a    # 0.64f

    .line 131
    .line 132
    .line 133
    const v15, 0x3f8f5c29    # 1.12f

    .line 134
    .line 135
    .line 136
    const v16, 0x3ff0a3d7    # 1.88f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, -0x3fcd70a4    # -2.79f

    .line 143
    .line 144
    .line 145
    const v18, 0x3efae148    # 0.49f

    .line 146
    .line 147
    .line 148
    const v13, -0x40dc28f6    # -0.64f

    .line 149
    .line 150
    .line 151
    const v14, 0x3f666666    # 0.9f

    .line 152
    .line 153
    .line 154
    const v15, -0x400f5c29    # -1.88f

    .line 155
    .line 156
    .line 157
    const v16, 0x3f8f5c29    # 1.12f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41800000    # 16.0f

    .line 167
    .line 168
    const/high16 v2, 0x41a00000    # 20.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, -0x40800000    # -1.0f

    .line 174
    .line 175
    const/high16 v18, -0x40800000    # -1.0f

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const v14, -0x40f33333    # -0.55f

    .line 179
    .line 180
    .line 181
    const v15, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const/high16 v16, -0x40800000    # -1.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x410ee148    # 8.93f

    .line 190
    .line 191
    .line 192
    const/high16 v2, 0x41980000    # 19.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x3fc28f5c    # -2.96f

    .line 198
    .line 199
    .line 200
    const v18, -0x3fdd70a4    # -2.54f

    .line 201
    .line 202
    .line 203
    const v13, -0x40428f5c    # -1.48f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const v15, -0x3fd0a3d7    # -2.74f

    .line 208
    .line 209
    .line 210
    const v16, -0x4075c28f    # -1.08f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x40851eb8    # 4.16f

    .line 217
    .line 218
    .line 219
    const v2, 0x40f8f5c3    # 7.78f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x404ccccd    # 3.2f

    .line 226
    .line 227
    .line 228
    const/high16 v18, 0x40e00000    # 7.0f

    .line 229
    .line 230
    const v13, 0x40823d71    # 4.07f

    .line 231
    .line 232
    .line 233
    const v14, 0x40ea8f5c    # 7.33f

    .line 234
    .line 235
    .line 236
    const v15, 0x406ae148    # 3.67f

    .line 237
    .line 238
    .line 239
    const/high16 v16, 0x40e00000    # 7.0f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x408a3d71    # -0.96f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f970a3d    # 1.18f

    .line 248
    .line 249
    .line 250
    const v13, -0x40e147ae    # -0.62f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const v15, -0x4075c28f    # -1.08f

    .line 255
    .line 256
    .line 257
    const v16, 0x3f11eb85    # 0.57f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 264
    .line 265
    const v2, 0x410947ae    # 8.58f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x410f0a3d    # 8.94f

    .line 272
    .line 273
    .line 274
    const/high16 v18, 0x41a80000    # 21.0f

    .line 275
    .line 276
    const v13, 0x408bd70a    # 4.37f

    .line 277
    .line 278
    .line 279
    const v14, 0x4199999a    # 19.2f

    .line 280
    .line 281
    .line 282
    const v15, 0x40cf0a3d    # 6.47f

    .line 283
    .line 284
    .line 285
    const/high16 v16, 0x41a80000    # 21.0f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x41a80000    # 21.0f

    .line 291
    .line 292
    const/high16 v2, 0x41700000    # 15.0f

    .line 293
    .line 294
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v18, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v13, 0x3f0ccccd    # 0.55f

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const/high16 v15, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const v16, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4178a3d7    # 15.54f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x3f79eb85    # -4.19f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, -0x407c28f6    # -1.03f

    .line 329
    .line 330
    .line 331
    const v2, -0x3f7ccccd    # -4.1f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40833333    # 4.1f

    .line 338
    .line 339
    .line 340
    const v18, 0x3fa66666    # 1.3f

    .line 341
    .line 342
    .line 343
    const v13, 0x3fa3d70a    # 1.28f

    .line 344
    .line 345
    .line 346
    const v14, 0x3f3851ec    # 0.72f

    .line 347
    .line 348
    .line 349
    const v15, 0x402851ec    # 2.63f

    .line 350
    .line 351
    .line 352
    const v16, 0x3fa3d70a    # 1.28f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x3f866666    # 1.05f

    .line 359
    .line 360
    .line 361
    const v18, -0x40770a3d    # -1.07f

    .line 362
    .line 363
    .line 364
    const v13, 0x3f147ae1    # 0.58f

    .line 365
    .line 366
    .line 367
    const v14, 0x3c23d70a    # 0.01f

    .line 368
    .line 369
    .line 370
    const v15, 0x3f866666    # 1.05f

    .line 371
    .line 372
    .line 373
    const v16, -0x41051eb8    # -0.49f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x4075c28f    # -1.08f

    .line 380
    .line 381
    .line 382
    const v18, -0x407851ec    # -1.06f

    .line 383
    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const v14, -0x40e8f5c3    # -0.59f

    .line 387
    .line 388
    .line 389
    const v15, -0x41051eb8    # -0.49f

    .line 390
    .line 391
    .line 392
    const v16, -0x407ae148    # -1.04f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x3f98f5c3    # -3.61f

    .line 399
    .line 400
    .line 401
    const v18, -0x4055c28f    # -1.33f

    .line 402
    .line 403
    .line 404
    const v13, -0x405851ec    # -1.31f

    .line 405
    .line 406
    .line 407
    const v14, -0x42dc28f6    # -0.04f

    .line 408
    .line 409
    .line 410
    const v15, -0x3fd7ae14    # -2.63f

    .line 411
    .line 412
    .line 413
    const v16, -0x40f0a3d7    # -0.56f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x41123d71    # 9.14f

    .line 420
    .line 421
    .line 422
    const v2, 0x40ef0a3d    # 7.47f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x40bd70a4    # -0.76f

    .line 429
    .line 430
    .line 431
    const v18, -0x413d70a4    # -0.38f

    .line 432
    .line 433
    .line 434
    const v13, -0x41947ae1    # -0.23f

    .line 435
    .line 436
    .line 437
    const v14, -0x41c7ae14    # -0.18f

    .line 438
    .line 439
    .line 440
    const v15, -0x41051eb8    # -0.49f

    .line 441
    .line 442
    .line 443
    const v16, -0x41666666    # -0.3f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x40828f5c    # -0.99f

    .line 450
    .line 451
    .line 452
    const v18, -0x428a3d71    # -0.06f

    .line 453
    .line 454
    .line 455
    const v13, -0x415c28f6    # -0.32f

    .line 456
    .line 457
    .line 458
    const v14, -0x4247ae14    # -0.09f

    .line 459
    .line 460
    .line 461
    const v15, -0x40d70a3d    # -0.66f

    .line 462
    .line 463
    .line 464
    const v16, -0x420a3d71    # -0.12f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x435c28f6    # -0.02f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, -0x40147ae1    # -1.84f

    .line 477
    .line 478
    .line 479
    const v18, 0x40270a3d    # 2.61f

    .line 480
    .line 481
    .line 482
    const v13, -0x40628f5c    # -1.23f

    .line 483
    .line 484
    .line 485
    const v14, 0x3e6147ae    # 0.22f

    .line 486
    .line 487
    .line 488
    const v15, -0x3ffccccd    # -2.05f

    .line 489
    .line 490
    .line 491
    const v16, 0x3fb1eb85    # 1.39f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3faccccd    # 1.35f

    .line 498
    .line 499
    .line 500
    const v2, 0x40bd70a4    # 5.92f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x411d47ae    # 9.83f

    .line 507
    .line 508
    .line 509
    const/high16 v18, 0x41900000    # 18.0f

    .line 510
    .line 511
    const v13, 0x40e51eb8    # 7.16f

    .line 512
    .line 513
    .line 514
    const v14, 0x4187d70a    # 16.98f

    .line 515
    .line 516
    .line 517
    const v15, 0x41063d71    # 8.39f

    .line 518
    .line 519
    .line 520
    const/high16 v16, 0x41900000    # 18.0f

    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x40db3333    # 6.85f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x4045c28f    # 3.09f

    .line 532
    .line 533
    .line 534
    const v2, 0x401ae148    # 2.42f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3fb1eb85    # 1.39f

    .line 541
    .line 542
    .line 543
    const v18, -0x425c28f6    # -0.08f

    .line 544
    .line 545
    .line 546
    const v13, 0x3ed70a3d    # 0.42f

    .line 547
    .line 548
    .line 549
    const v14, 0x3ea8f5c3    # 0.33f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f828f5c    # 1.02f

    .line 553
    .line 554
    .line 555
    const v16, 0x3e947ae1    # 0.29f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, -0x42333333    # -0.1f

    .line 562
    .line 563
    .line 564
    const v18, -0x40370a3d    # -1.57f

    .line 565
    .line 566
    .line 567
    const v13, 0x3ee66666    # 0.45f

    .line 568
    .line 569
    .line 570
    const v14, -0x4119999a    # -0.45f

    .line 571
    .line 572
    .line 573
    const v15, 0x3ecccccd    # 0.4f

    .line 574
    .line 575
    .line 576
    const v16, -0x4068f5c3    # -1.18f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x3f76b852    # -4.29f

    .line 583
    .line 584
    .line 585
    const v2, -0x3fa9999a    # -3.35f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x40628f5c    # -1.23f

    .line 592
    .line 593
    .line 594
    const v18, -0x4128f5c3    # -0.42f

    .line 595
    .line 596
    .line 597
    const v13, -0x414ccccd    # -0.35f

    .line 598
    .line 599
    .line 600
    const v14, -0x4175c28f    # -0.27f

    .line 601
    .line 602
    .line 603
    const v15, -0x40b851ec    # -0.78f

    .line 604
    .line 605
    .line 606
    const v16, -0x4128f5c3    # -0.42f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    const/16 v16, 0x3800

    .line 620
    .line 621
    const/16 v17, 0x0

    .line 622
    .line 623
    const/high16 v6, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v8, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v7, 0x0

    .line 628
    const/high16 v9, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/high16 v12, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const/4 v14, 0x0

    .line 634
    const/4 v15, 0x0

    .line 635
    const-string v4, ""

    .line 636
    .line 637
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    sput-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatReclineExtraKt;->_airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 646
    .line 647
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    return-object v0
.end method
