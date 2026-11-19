.class public final Landroidx/compose/material/icons/rounded/SensorsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sensorsOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SensorsOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSensorsOff",
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
        "SMAP\nSensorsOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorsOff.kt\nandroidx/compose/material/icons/rounded/SensorsOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 SensorsOff.kt\nandroidx/compose/material/icons/rounded/SensorsOffKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSensorsOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SensorsOffKt;->_sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SensorsOff"

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
    const v0, 0x41928f5c    # 18.32f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b5c28f    # 5.68f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v18, -0x425c28f6    # -0.08f

    .line 82
    .line 83
    .line 84
    const v13, -0x4128f5c3    # -0.42f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ed70a3d    # 0.42f

    .line 88
    .line 89
    .line 90
    const v15, -0x4070a3d7    # -1.12f

    .line 91
    .line 92
    .line 93
    const v16, 0x3ec7ae14    # 0.39f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x40000000    # 2.0f

    .line 100
    .line 101
    const/high16 v18, 0x41400000    # 12.0f

    .line 102
    .line 103
    const v13, 0x40347ae1    # 2.82f

    .line 104
    .line 105
    .line 106
    const v14, 0x41843d71    # 16.53f

    .line 107
    .line 108
    .line 109
    const/high16 v15, 0x40000000    # 2.0f

    .line 110
    .line 111
    const v16, 0x4165c28f    # 14.36f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3fd47ae1    # 1.66f

    .line 118
    .line 119
    .line 120
    const v18, -0x3f4fae14    # -5.51f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, -0x3ffd70a4    # -2.04f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f1c28f6    # 0.61f

    .line 128
    .line 129
    .line 130
    const v16, -0x3f847ae1    # -3.93f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40066666    # 2.1f

    .line 137
    .line 138
    .line 139
    const v2, 0x409dc28f    # 4.93f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const v18, -0x404b851f    # -1.41f

    .line 148
    .line 149
    .line 150
    const v13, -0x413851ec    # -0.39f

    .line 151
    .line 152
    .line 153
    const v14, -0x413851ec    # -0.39f

    .line 154
    .line 155
    .line 156
    const v15, -0x413851ec    # -0.39f

    .line 157
    .line 158
    .line 159
    const v16, -0x407d70a4    # -1.02f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3fb47ae1    # 1.41f

    .line 166
    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const v13, 0x3ec7ae14    # 0.39f

    .line 171
    .line 172
    .line 173
    const v15, 0x3f828f5c    # 1.02f

    .line 174
    .line 175
    .line 176
    const v16, -0x413851ec    # -0.39f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x4187c28f    # 16.97f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const v18, 0x3fb47ae1    # 1.41f

    .line 191
    .line 192
    .line 193
    const v14, 0x3ec7ae14    # 0.39f

    .line 194
    .line 195
    .line 196
    const v15, 0x3ec7ae14    # 0.39f

    .line 197
    .line 198
    .line 199
    const v16, 0x3f828f5c    # 1.02f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x404b851f    # -1.41f

    .line 206
    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    const v4, -0x407d70a4    # -1.02f

    .line 210
    .line 211
    .line 212
    const v6, 0x3ec7ae14    # 0.39f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x41023d71    # 8.14f

    .line 219
    .line 220
    .line 221
    const v2, 0x412f5c29    # 10.96f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v17, 0x41000000    # 8.0f

    .line 228
    .line 229
    const/high16 v18, 0x41400000    # 12.0f

    .line 230
    .line 231
    const v13, 0x4100cccd    # 8.05f

    .line 232
    .line 233
    .line 234
    const v14, 0x4134a3d7    # 11.29f

    .line 235
    .line 236
    .line 237
    const/high16 v15, 0x41000000    # 8.0f

    .line 238
    .line 239
    const v16, 0x413a3d71    # 11.64f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, 0x3f23d70a    # 0.64f

    .line 246
    .line 247
    .line 248
    const v18, 0x400ae148    # 2.17f

    .line 249
    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, 0x3f4ccccd    # 0.8f

    .line 253
    .line 254
    .line 255
    const v15, 0x3e75c28f    # 0.24f

    .line 256
    .line 257
    .line 258
    const v16, 0x3fc66666    # 1.55f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, -0x42333333    # -0.1f

    .line 265
    .line 266
    .line 267
    const v18, 0x3fa51eb8    # 1.29f

    .line 268
    .line 269
    .line 270
    const v13, 0x3e8a3d71    # 0.27f

    .line 271
    .line 272
    .line 273
    const v14, 0x3ed1eb85    # 0.41f

    .line 274
    .line 275
    .line 276
    const v16, 0x3f70a3d7    # 0.94f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, -0x403eb852    # -1.51f

    .line 283
    .line 284
    .line 285
    const v18, -0x421eb852    # -0.11f

    .line 286
    .line 287
    .line 288
    const v13, -0x4123d70a    # -0.43f

    .line 289
    .line 290
    .line 291
    const v14, 0x3edc28f6    # 0.43f

    .line 292
    .line 293
    .line 294
    const v15, -0x406a3d71    # -1.17f

    .line 295
    .line 296
    .line 297
    const v16, 0x3ecccccd    # 0.4f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40c00000    # 6.0f

    .line 304
    .line 305
    const/high16 v18, 0x41400000    # 12.0f

    .line 306
    .line 307
    const v13, 0x40cc28f6    # 6.38f

    .line 308
    .line 309
    .line 310
    const v14, 0x41666666    # 14.4f

    .line 311
    .line 312
    .line 313
    const/high16 v15, 0x40c00000    # 6.0f

    .line 314
    .line 315
    const v16, 0x4153d70a    # 13.24f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3f147ae1    # 0.58f

    .line 322
    .line 323
    .line 324
    const v18, -0x3fda3d71    # -2.59f

    .line 325
    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, -0x4091eb85    # -0.93f

    .line 329
    .line 330
    .line 331
    const v15, 0x3e570a3d    # 0.21f

    .line 332
    .line 333
    .line 334
    const v16, -0x4019999a    # -1.8f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x40a3851f    # 5.11f

    .line 341
    .line 342
    .line 343
    const v2, 0x40fe147b    # 7.94f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x40800000    # 4.0f

    .line 350
    .line 351
    const/high16 v18, 0x41400000    # 12.0f

    .line 352
    .line 353
    const v13, 0x408ccccd    # 4.4f

    .line 354
    .line 355
    .line 356
    const v14, 0x4112147b    # 9.13f

    .line 357
    .line 358
    .line 359
    const/high16 v15, 0x40800000    # 4.0f

    .line 360
    .line 361
    const v16, 0x412851ec    # 10.52f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x3fe147ae    # 1.76f

    .line 368
    .line 369
    .line 370
    const/high16 v18, 0x40a00000    # 5.0f

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, 0x3ff1eb85    # 1.89f

    .line 374
    .line 375
    .line 376
    const v15, 0x3f28f5c3    # 0.66f

    .line 377
    .line 378
    .line 379
    const v16, 0x406851ec    # 3.63f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x40b5c28f    # 5.68f

    .line 386
    .line 387
    .line 388
    const v18, 0x41928f5c    # 18.32f

    .line 389
    .line 390
    .line 391
    const v13, 0x40c28f5c    # 6.08f

    .line 392
    .line 393
    .line 394
    const v14, 0x418b1eb8    # 17.39f

    .line 395
    .line 396
    .line 397
    const v15, 0x40c147ae    # 6.04f

    .line 398
    .line 399
    .line 400
    const v16, 0x418fae14    # 17.96f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x41775c29    # 15.46f

    .line 410
    .line 411
    .line 412
    const v2, 0x4108a3d7    # 8.54f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x421eb852    # -0.11f

    .line 419
    .line 420
    .line 421
    const v18, 0x3fa51eb8    # 1.29f

    .line 422
    .line 423
    .line 424
    const v13, -0x414ccccd    # -0.35f

    .line 425
    .line 426
    .line 427
    const v14, 0x3eb33333    # 0.35f

    .line 428
    .line 429
    .line 430
    const v15, -0x41428f5c    # -0.37f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f6147ae    # 0.88f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x41800000    # 16.0f

    .line 440
    .line 441
    const/high16 v18, 0x41400000    # 12.0f

    .line 442
    .line 443
    const v13, 0x417c28f6    # 15.76f

    .line 444
    .line 445
    .line 446
    const v14, 0x41273333    # 10.45f

    .line 447
    .line 448
    .line 449
    const/high16 v15, 0x41800000    # 16.0f

    .line 450
    .line 451
    const v16, 0x41333333    # 11.2f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, -0x41f0a3d7    # -0.14f

    .line 458
    .line 459
    .line 460
    const v18, 0x3f851eb8    # 1.04f

    .line 461
    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const v14, 0x3eb851ec    # 0.36f

    .line 465
    .line 466
    .line 467
    const v15, -0x42b33333    # -0.05f

    .line 468
    .line 469
    .line 470
    const v16, 0x3f35c28f    # 0.71f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3fc66666    # 1.55f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x41900000    # 18.0f

    .line 483
    .line 484
    const/high16 v18, 0x41400000    # 12.0f

    .line 485
    .line 486
    const v13, 0x418e51ec    # 17.79f

    .line 487
    .line 488
    .line 489
    const v14, 0x415ccccd    # 13.8f

    .line 490
    .line 491
    .line 492
    const/high16 v15, 0x41900000    # 18.0f

    .line 493
    .line 494
    const v16, 0x414ee148    # 12.93f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, -0x407c28f6    # -1.03f

    .line 501
    .line 502
    .line 503
    const v18, -0x3fa8f5c3    # -3.36f

    .line 504
    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const v14, -0x406147ae    # -1.24f

    .line 508
    .line 509
    .line 510
    const v15, -0x413d70a4    # -0.38f

    .line 511
    .line 512
    .line 513
    const v16, -0x3fe66666    # -2.4f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x41775c29    # 15.46f

    .line 520
    .line 521
    .line 522
    const v18, 0x4108a3d7    # 8.54f

    .line 523
    .line 524
    .line 525
    const v13, 0x41850a3d    # 16.63f

    .line 526
    .line 527
    .line 528
    const v14, 0x41023d71    # 8.14f

    .line 529
    .line 530
    .line 531
    const v15, 0x417e6666    # 15.9f

    .line 532
    .line 533
    .line 534
    const v16, 0x4101999a    # 8.1f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x41928f5c    # 18.32f

    .line 544
    .line 545
    .line 546
    const v2, 0x40b5c28f    # 5.68f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x425c28f6    # -0.08f

    .line 553
    .line 554
    .line 555
    const v18, 0x3fa8f5c3    # 1.32f

    .line 556
    .line 557
    .line 558
    const v13, -0x4147ae14    # -0.36f

    .line 559
    .line 560
    .line 561
    const v14, 0x3eb851ec    # 0.36f

    .line 562
    .line 563
    .line 564
    const v15, -0x41333333    # -0.4f

    .line 565
    .line 566
    .line 567
    const v16, 0x3f6b851f    # 0.92f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x3fe147ae    # 1.76f

    .line 574
    .line 575
    .line 576
    const/high16 v18, 0x40a00000    # 5.0f

    .line 577
    .line 578
    const v13, 0x3f8ccccd    # 1.1f

    .line 579
    .line 580
    .line 581
    const v14, 0x3faf5c29    # 1.37f

    .line 582
    .line 583
    .line 584
    const v15, 0x3fe147ae    # 1.76f

    .line 585
    .line 586
    .line 587
    const v16, 0x40470a3d    # 3.11f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x4071eb85    # -1.11f

    .line 594
    .line 595
    .line 596
    const v18, 0x4081eb85    # 4.06f

    .line 597
    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const v14, 0x3fbd70a4    # 1.48f

    .line 601
    .line 602
    .line 603
    const v15, -0x41333333    # -0.4f

    .line 604
    .line 605
    .line 606
    const v16, 0x4037ae14    # 2.87f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x3fb9999a    # 1.45f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x41b00000    # 22.0f

    .line 619
    .line 620
    const/high16 v18, 0x41400000    # 12.0f

    .line 621
    .line 622
    const v13, 0x41ab1eb8    # 21.39f

    .line 623
    .line 624
    .line 625
    const v14, 0x417ee148    # 15.93f

    .line 626
    .line 627
    .line 628
    const/high16 v15, 0x41b00000    # 22.0f

    .line 629
    .line 630
    const v16, 0x4160a3d7    # 14.04f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, -0x3ff47ae1    # -2.18f

    .line 637
    .line 638
    .line 639
    const v18, -0x3f3851ec    # -6.24f

    .line 640
    .line 641
    .line 642
    const/4 v13, 0x0

    .line 643
    const v14, -0x3fe8f5c3    # -2.36f

    .line 644
    .line 645
    .line 646
    const v15, -0x40ae147b    # -0.82f

    .line 647
    .line 648
    .line 649
    const v16, -0x3f6f0a3d    # -4.53f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x41928f5c    # 18.32f

    .line 656
    .line 657
    .line 658
    const v18, 0x40b5c28f    # 5.68f

    .line 659
    .line 660
    .line 661
    const v13, 0x419b851f    # 19.44f

    .line 662
    .line 663
    .line 664
    const v14, 0x40a947ae    # 5.29f

    .line 665
    .line 666
    .line 667
    const v15, 0x4195eb85    # 18.74f

    .line 668
    .line 669
    .line 670
    const v16, 0x40a851ec    # 5.26f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    const/16 v16, 0x3800

    .line 684
    .line 685
    const/16 v17, 0x0

    .line 686
    .line 687
    const/high16 v6, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/high16 v8, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/4 v7, 0x0

    .line 692
    const/high16 v9, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/high16 v12, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const/4 v14, 0x0

    .line 698
    const/4 v15, 0x0

    .line 699
    const-string v4, ""

    .line 700
    .line 701
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sput-object v0, Landroidx/compose/material/icons/rounded/SensorsOffKt;->_sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 710
    .line 711
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    return-object v0
.end method
