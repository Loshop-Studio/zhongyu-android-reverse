.class public final Landroidx/compose/material/icons/rounded/AirlineSeatReclineNormalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_airlineSeatReclineNormal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AirlineSeatReclineNormal",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAirlineSeatReclineNormal",
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
        "SMAP\nAirlineSeatReclineNormal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatReclineNormal.kt\nandroidx/compose/material/icons/rounded/AirlineSeatReclineNormalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 AirlineSeatReclineNormal.kt\nandroidx/compose/material/icons/rounded/AirlineSeatReclineNormalKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatReclineNormal(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AirlineSeatReclineNormal"

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
    const v0, 0x40f2e148    # 7.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ad1eb8    # 5.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x3fcae148    # -2.83f

    .line 82
    .line 83
    .line 84
    const v13, -0x40b851ec    # -0.78f

    .line 85
    .line 86
    .line 87
    const v14, -0x40b851ec    # -0.78f

    .line 88
    .line 89
    .line 90
    const v15, -0x40b851ec    # -0.78f

    .line 91
    .line 92
    .line 93
    const v16, -0x3ffccccd    # -2.05f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    const v4, 0x40351eb8    # 2.83f

    .line 104
    .line 105
    .line 106
    const v6, 0x40033333    # 2.05f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3f47ae14    # 0.78f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3fcae148    # -2.83f

    .line 119
    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const v13, -0x40b5c28f    # -0.79f

    .line 124
    .line 125
    .line 126
    const v14, 0x3f4a3d71    # 0.79f

    .line 127
    .line 128
    .line 129
    const v15, -0x3ffccccd    # -2.05f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f4a3d71    # 0.79f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41800000    # 16.0f

    .line 142
    .line 143
    const/high16 v2, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x41000000    # 8.0f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, -0x40800000    # -1.0f

    .line 154
    .line 155
    const/high16 v18, -0x40800000    # -1.0f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, -0x40f33333    # -0.55f

    .line 159
    .line 160
    .line 161
    const v15, -0x4119999a    # -0.45f

    .line 162
    .line 163
    .line 164
    const/high16 v16, -0x40800000    # -1.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x3ee66666    # 0.45f

    .line 170
    .line 171
    .line 172
    const/high16 v2, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v4, -0x40800000    # -1.0f

    .line 175
    .line 176
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x41000000    # 8.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x40a00000    # 5.0f

    .line 185
    .line 186
    const/high16 v18, 0x40a00000    # 5.0f

    .line 187
    .line 188
    const v14, 0x4030a3d7    # 2.76f

    .line 189
    .line 190
    .line 191
    const v15, 0x400f5c29    # 2.24f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x40a00000    # 5.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x40a00000    # 5.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/high16 v18, -0x40800000    # -1.0f

    .line 207
    .line 208
    const v13, 0x3f0ccccd    # 0.55f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const/high16 v15, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const v16, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, -0x4119999a    # -0.45f

    .line 221
    .line 222
    .line 223
    const/high16 v2, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41100000    # 9.0f

    .line 229
    .line 230
    const/high16 v2, 0x41980000    # 19.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 236
    .line 237
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 238
    .line 239
    const v13, -0x402b851f    # -1.66f

    .line 240
    .line 241
    .line 242
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 243
    .line 244
    const v16, -0x40547ae1    # -1.34f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x419a3d71    # 19.28f

    .line 254
    .line 255
    .line 256
    const v2, 0x419acccd    # 19.35f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, -0x3f8eb852    # -3.77f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x404b851f    # -1.41f

    .line 269
    .line 270
    .line 271
    const v18, -0x40eb851f    # -0.58f

    .line 272
    .line 273
    .line 274
    const v13, -0x41428f5c    # -0.37f

    .line 275
    .line 276
    .line 277
    const v14, -0x41428f5c    # -0.37f

    .line 278
    .line 279
    .line 280
    const v15, -0x409eb852    # -0.88f

    .line 281
    .line 282
    .line 283
    const v16, -0x40eb851f    # -0.58f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x3fd9999a    # -2.6f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, -0x3f947ae1    # -3.68f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x40866666    # 4.2f

    .line 302
    .line 303
    .line 304
    const v18, 0x400147ae    # 2.02f

    .line 305
    .line 306
    .line 307
    const v13, 0x3f8b851f    # 1.09f

    .line 308
    .line 309
    .line 310
    const v14, 0x3f63d70a    # 0.89f

    .line 311
    .line 312
    .line 313
    const v15, 0x402a3d71    # 2.66f

    .line 314
    .line 315
    .line 316
    const v16, 0x3fd9999a    # 1.7f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3fa66666    # 1.3f

    .line 323
    .line 324
    .line 325
    const v18, -0x407ae148    # -1.04f

    .line 326
    .line 327
    .line 328
    const v13, 0x3f2b851f    # 0.67f

    .line 329
    .line 330
    .line 331
    const v14, 0x3e0f5c29    # 0.14f

    .line 332
    .line 333
    .line 334
    const v15, 0x3fa66666    # 1.3f

    .line 335
    .line 336
    .line 337
    const v16, -0x4147ae14    # -0.36f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x40947ae1    # -0.92f

    .line 344
    .line 345
    .line 346
    const v18, -0x4079999a    # -1.05f

    .line 347
    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, -0x40f851ec    # -0.53f

    .line 351
    .line 352
    .line 353
    const v15, -0x413851ec    # -0.39f

    .line 354
    .line 355
    .line 356
    const v16, -0x408a3d71    # -0.96f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, -0x3f900000    # -3.75f

    .line 363
    .line 364
    const v18, -0x4003d70a    # -1.97f

    .line 365
    .line 366
    .line 367
    const v13, -0x404a3d71    # -1.42f

    .line 368
    .line 369
    .line 370
    const v14, -0x418a3d71    # -0.24f

    .line 371
    .line 372
    .line 373
    const v15, -0x3fc7ae14    # -2.88f

    .line 374
    .line 375
    .line 376
    const v16, -0x407eb852    # -1.01f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x404ccccd    # -1.4f

    .line 383
    .line 384
    .line 385
    const v2, -0x4039999a    # -1.55f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x40cf5c29    # -0.69f

    .line 392
    .line 393
    .line 394
    const/high16 v18, -0x41000000    # -0.5f

    .line 395
    .line 396
    const v13, -0x41bd70a4    # -0.19f

    .line 397
    .line 398
    .line 399
    const v14, -0x41a8f5c3    # -0.21f

    .line 400
    .line 401
    .line 402
    const v15, -0x4123d70a    # -0.43f

    .line 403
    .line 404
    .line 405
    const v16, -0x413d70a4    # -0.38f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x408a3d71    # -0.96f

    .line 412
    .line 413
    .line 414
    const v18, -0x41947ae1    # -0.23f

    .line 415
    .line 416
    .line 417
    const v13, -0x416b851f    # -0.29f

    .line 418
    .line 419
    .line 420
    const v14, -0x41f0a3d7    # -0.14f

    .line 421
    .line 422
    .line 423
    const v15, -0x40e147ae    # -0.62f

    .line 424
    .line 425
    .line 426
    const v16, -0x41947ae1    # -0.23f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x430a3d71    # -0.03f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x40e00000    # 7.0f

    .line 439
    .line 440
    const/high16 v18, 0x41140000    # 9.25f

    .line 441
    .line 442
    const v13, 0x410028f6    # 8.01f

    .line 443
    .line 444
    .line 445
    const/high16 v14, 0x40e00000    # 7.0f

    .line 446
    .line 447
    const/high16 v15, 0x40e00000    # 7.0f

    .line 448
    .line 449
    const v16, 0x410028f6    # 8.01f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40e00000    # 7.0f

    .line 456
    .line 457
    const/high16 v2, 0x41700000    # 15.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x40400000    # 3.0f

    .line 463
    .line 464
    const/high16 v18, 0x40400000    # 3.0f

    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, 0x3fd47ae1    # 1.66f

    .line 468
    .line 469
    .line 470
    const v15, 0x3fab851f    # 1.34f

    .line 471
    .line 472
    .line 473
    const/high16 v16, 0x40400000    # 3.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x40a23d71    # 5.07f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x4031eb85    # 2.78f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, 0x3fb70a3d    # 1.43f

    .line 491
    .line 492
    .line 493
    const/16 v18, 0x0

    .line 494
    .line 495
    const v13, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v14, 0x3ec7ae14    # 0.39f

    .line 499
    .line 500
    .line 501
    const v15, 0x3f851eb8    # 1.04f

    .line 502
    .line 503
    .line 504
    const v16, 0x3ec7ae14    # 0.39f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const v18, -0x4048f5c3    # -1.43f

    .line 513
    .line 514
    .line 515
    const v13, 0x3ecccccd    # 0.4f

    .line 516
    .line 517
    .line 518
    const v14, -0x413851ec    # -0.39f

    .line 519
    .line 520
    .line 521
    const v15, 0x3ecccccd    # 0.4f

    .line 522
    .line 523
    .line 524
    const v16, -0x407c28f6    # -1.03f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v9, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
