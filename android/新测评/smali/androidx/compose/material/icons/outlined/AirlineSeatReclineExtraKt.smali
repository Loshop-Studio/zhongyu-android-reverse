.class public final Landroidx/compose/material/icons/outlined/AirlineSeatReclineExtraKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAirlineSeatReclineExtra",
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
        "SMAP\nAirlineSeatReclineExtra.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatReclineExtra.kt\nandroidx/compose/material/icons/outlined/AirlineSeatReclineExtraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 AirlineSeatReclineExtra.kt\nandroidx/compose/material/icons/outlined/AirlineSeatReclineExtraKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatReclineExtra(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatReclineExtraKt;->_airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AirlineSeatReclineExtra"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 167
    .line 168
    const/high16 v2, 0x41800000    # 16.0f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x410ee148    # 8.93f

    .line 174
    .line 175
    .line 176
    const/high16 v2, 0x41980000    # 19.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x3fc28f5c    # -2.96f

    .line 182
    .line 183
    .line 184
    const v18, -0x3fdd70a4    # -2.54f

    .line 185
    .line 186
    .line 187
    const v13, -0x40428f5c    # -1.48f

    .line 188
    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    const v15, -0x3fd0a3d7    # -2.74f

    .line 192
    .line 193
    .line 194
    const v16, -0x4075c28f    # -1.08f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40800000    # 4.0f

    .line 201
    .line 202
    const/high16 v2, 0x40e00000    # 7.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x40000000    # 2.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3ffeb852    # 1.99f

    .line 213
    .line 214
    .line 215
    const v2, 0x411c28f6    # 9.76f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x410f0a3d    # 8.94f

    .line 222
    .line 223
    .line 224
    const/high16 v18, 0x41a80000    # 21.0f

    .line 225
    .line 226
    const v13, 0x408bd70a    # 4.37f

    .line 227
    .line 228
    .line 229
    const v14, 0x4199999a    # 19.2f

    .line 230
    .line 231
    .line 232
    const v15, 0x40cf0a3d    # 6.47f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x41a80000    # 21.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x41a80000    # 21.0f

    .line 241
    .line 242
    const/high16 v2, 0x41800000    # 16.0f

    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, -0x40000000    # -2.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x4181d70a    # 16.23f

    .line 256
    .line 257
    .line 258
    const/high16 v2, 0x41700000    # 15.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x3f63d70a    # -4.88f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x407c28f6    # -1.03f

    .line 270
    .line 271
    .line 272
    const v2, -0x3f7ccccd    # -4.1f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x40a4cccd    # 5.15f

    .line 279
    .line 280
    .line 281
    const v18, 0x3f9c28f6    # 1.22f

    .line 282
    .line 283
    .line 284
    const v13, 0x3fca3d71    # 1.58f

    .line 285
    .line 286
    .line 287
    const v14, 0x3f63d70a    # 0.89f

    .line 288
    .line 289
    .line 290
    const v15, 0x4051eb85    # 3.28f

    .line 291
    .line 292
    .line 293
    const v16, 0x3fc51eb8    # 1.54f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x4177851f    # 15.47f

    .line 300
    .line 301
    .line 302
    const v2, 0x411fd70a    # 9.99f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x3f69eb85    # -4.69f

    .line 309
    .line 310
    .line 311
    const/high16 v18, -0x40600000    # -1.25f

    .line 312
    .line 313
    const v13, -0x402f5c29    # -1.63f

    .line 314
    .line 315
    .line 316
    const v14, 0x3e9eb852    # 0.31f

    .line 317
    .line 318
    .line 319
    const v15, -0x3fa3d70a    # -3.44f

    .line 320
    .line 321
    .line 322
    const v16, -0x4175c28f    # -0.27f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x41123d71    # 9.14f

    .line 329
    .line 330
    .line 331
    const v2, 0x40ef0a3d    # 7.47f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x40bd70a4    # -0.76f

    .line 338
    .line 339
    .line 340
    const v18, -0x413d70a4    # -0.38f

    .line 341
    .line 342
    .line 343
    const v13, -0x41947ae1    # -0.23f

    .line 344
    .line 345
    .line 346
    const v14, -0x41c7ae14    # -0.18f

    .line 347
    .line 348
    .line 349
    const v15, -0x41051eb8    # -0.49f

    .line 350
    .line 351
    .line 352
    const v16, -0x41666666    # -0.3f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x40828f5c    # -0.99f

    .line 359
    .line 360
    .line 361
    const v18, -0x428a3d71    # -0.06f

    .line 362
    .line 363
    .line 364
    const v13, -0x415c28f6    # -0.32f

    .line 365
    .line 366
    .line 367
    const v14, -0x4247ae14    # -0.09f

    .line 368
    .line 369
    .line 370
    const v15, -0x40d70a3d    # -0.66f

    .line 371
    .line 372
    .line 373
    const v16, -0x420a3d71    # -0.12f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x435c28f6    # -0.02f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, -0x40147ae1    # -1.84f

    .line 386
    .line 387
    .line 388
    const v18, 0x40270a3d    # 2.61f

    .line 389
    .line 390
    .line 391
    const v13, -0x40628f5c    # -1.23f

    .line 392
    .line 393
    .line 394
    const v14, 0x3e6147ae    # 0.22f

    .line 395
    .line 396
    .line 397
    const v15, -0x3ffccccd    # -2.05f

    .line 398
    .line 399
    .line 400
    const v16, 0x3fb1eb85    # 1.39f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3faccccd    # 1.35f

    .line 407
    .line 408
    .line 409
    const v2, 0x40bd70a4    # 5.92f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x411d47ae    # 9.83f

    .line 416
    .line 417
    .line 418
    const/high16 v18, 0x41900000    # 18.0f

    .line 419
    .line 420
    const v13, 0x40e51eb8    # 7.16f

    .line 421
    .line 422
    .line 423
    const v14, 0x4187d70a    # 16.98f

    .line 424
    .line 425
    .line 426
    const v15, 0x41063d71    # 8.39f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x41900000    # 18.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x40db3333    # 6.85f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x40747ae1    # 3.82f

    .line 441
    .line 442
    .line 443
    const/high16 v2, 0x40400000    # 3.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 449
    .line 450
    const/high16 v2, -0x40400000    # -1.5f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, -0x3f475c29    # -5.77f

    .line 456
    .line 457
    .line 458
    const/high16 v2, -0x3f700000    # -4.5f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    const/16 v16, 0x3800

    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const/high16 v6, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v8, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v7, 0x0

    .line 479
    const/high16 v9, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v12, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const/4 v14, 0x0

    .line 485
    const/4 v15, 0x0

    .line 486
    const-string v4, ""

    .line 487
    .line 488
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sput-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatReclineExtraKt;->_airlineSeatReclineExtra:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 497
    .line 498
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    return-object v0
.end method
