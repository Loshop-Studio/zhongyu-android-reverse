.class public final Landroidx/compose/material/icons/twotone/ExposureZeroKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_exposureZero",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ExposureZero",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getExposureZero",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nExposureZero.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposureZero.kt\nandroidx/compose/material/icons/twotone/ExposureZeroKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 ExposureZero.kt\nandroidx/compose/material/icons/twotone/ExposureZeroKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposureZero(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExposureZeroKt;->_exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ExposureZero"

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
    const v0, 0x417028f6    # 15.01f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c70a3d    # 6.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x405851ec    # -1.31f

    .line 80
    .line 81
    .line 82
    const v18, -0x4091eb85    # -0.93f

    .line 83
    .line 84
    .line 85
    const v13, -0x4147ae14    # -0.36f

    .line 86
    .line 87
    .line 88
    const v14, -0x4123d70a    # -0.43f

    .line 89
    .line 90
    .line 91
    const v15, -0x40b33333    # -0.8f

    .line 92
    .line 93
    .line 94
    const v16, -0x40c28f5c    # -0.74f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x414a147b    # 12.63f

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x41400000    # 12.0f

    .line 104
    .line 105
    const/high16 v4, 0x40a00000    # 5.0f

    .line 106
    .line 107
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v17, -0x4027ae14    # -1.69f

    .line 111
    .line 112
    .line 113
    const v18, 0x3e947ae1    # 0.29f

    .line 114
    .line 115
    .line 116
    const v13, -0x40e147ae    # -0.62f

    .line 117
    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    const v15, -0x4067ae14    # -1.19f

    .line 121
    .line 122
    .line 123
    const v16, 0x3dcccccd    # 0.1f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, -0x405851ec    # -1.31f

    .line 130
    .line 131
    .line 132
    const v18, 0x3f6e147b    # 0.93f

    .line 133
    .line 134
    .line 135
    const v13, -0x40fd70a4    # -0.51f

    .line 136
    .line 137
    .line 138
    const v14, 0x3e428f5c    # 0.19f

    .line 139
    .line 140
    .line 141
    const v15, -0x408ccccd    # -0.95f

    .line 142
    .line 143
    .line 144
    const/high16 v16, 0x3f000000    # 0.5f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x40a8f5c3    # -0.84f

    .line 150
    .line 151
    .line 152
    const v2, 0x3fd851ec    # 1.69f

    .line 153
    .line 154
    .line 155
    const v4, -0x40dc28f6    # -0.64f

    .line 156
    .line 157
    .line 158
    const v6, 0x3f7d70a4    # 0.99f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, -0x41666666    # -0.3f

    .line 165
    .line 166
    .line 167
    const v18, 0x40233333    # 2.55f

    .line 168
    .line 169
    .line 170
    const v13, -0x41b33333    # -0.2f

    .line 171
    .line 172
    .line 173
    const v14, 0x3f333333    # 0.7f

    .line 174
    .line 175
    .line 176
    const v15, -0x41666666    # -0.3f

    .line 177
    .line 178
    .line 179
    const v16, 0x3fc66666    # 1.55f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40028f5c    # 2.04f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3e99999a    # 0.3f

    .line 192
    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/high16 v14, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const v15, 0x3dcccccd    # 0.1f

    .line 198
    .line 199
    .line 200
    const v16, 0x3feccccd    # 1.85f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x3f59999a    # 0.85f

    .line 207
    .line 208
    .line 209
    const v18, 0x3fd9999a    # 1.7f

    .line 210
    .line 211
    .line 212
    const v13, 0x3e4ccccd    # 0.2f

    .line 213
    .line 214
    .line 215
    const v14, 0x3f30a3d7    # 0.69f

    .line 216
    .line 217
    .line 218
    const v15, 0x3efae148    # 0.49f

    .line 219
    .line 220
    .line 221
    const v16, 0x3fa147ae    # 1.26f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x3fa7ae14    # 1.31f

    .line 228
    .line 229
    .line 230
    const v2, 0x3f733333    # 0.95f

    .line 231
    .line 232
    .line 233
    const v4, 0x3f4ccccd    # 0.8f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x3f400000    # 0.75f

    .line 237
    .line 238
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3fd851ec    # 1.69f

    .line 242
    .line 243
    .line 244
    const v18, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const v13, 0x3f028f5c    # 0.51f

    .line 248
    .line 249
    .line 250
    const v14, 0x3e4ccccd    # 0.2f

    .line 251
    .line 252
    .line 253
    const v15, 0x3f88f5c3    # 1.07f

    .line 254
    .line 255
    .line 256
    const v16, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x3fd9999a    # 1.7f

    .line 263
    .line 264
    .line 265
    const v18, -0x41666666    # -0.3f

    .line 266
    .line 267
    .line 268
    const v13, 0x3f2147ae    # 0.63f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const v15, 0x3f9851ec    # 1.19f

    .line 273
    .line 274
    .line 275
    const v16, -0x42333333    # -0.1f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3fa66666    # 1.3f

    .line 282
    .line 283
    .line 284
    const v18, -0x408ccccd    # -0.95f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f028f5c    # 0.51f

    .line 288
    .line 289
    .line 290
    const v14, -0x41b33333    # -0.2f

    .line 291
    .line 292
    .line 293
    const v15, 0x3f70a3d7    # 0.94f

    .line 294
    .line 295
    .line 296
    const v16, -0x40fd70a4    # -0.51f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3f547ae1    # 0.83f

    .line 303
    .line 304
    .line 305
    const v18, -0x40266666    # -1.7f

    .line 306
    .line 307
    .line 308
    const v13, 0x3eb33333    # 0.35f

    .line 309
    .line 310
    .line 311
    const v14, -0x4123d70a    # -0.43f

    .line 312
    .line 313
    .line 314
    const v15, 0x3f2147ae    # 0.63f

    .line 315
    .line 316
    .line 317
    const/high16 v16, -0x40800000    # -1.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3e99999a    # 0.3f

    .line 323
    .line 324
    .line 325
    const v18, -0x3fdccccd    # -2.55f

    .line 326
    .line 327
    .line 328
    const v13, 0x3e4ccccd    # 0.2f

    .line 329
    .line 330
    .line 331
    const v14, -0x40cccccd    # -0.7f

    .line 332
    .line 333
    .line 334
    const v15, 0x3e99999a    # 0.3f

    .line 335
    .line 336
    .line 337
    const v16, -0x4039999a    # -1.55f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x3c23d70a    # 0.01f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, -0x3ffd70a4    # -2.04f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x41666666    # -0.3f

    .line 356
    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const v14, -0x407eb852    # -1.01f

    .line 360
    .line 361
    .line 362
    const v15, -0x42333333    # -0.1f

    .line 363
    .line 364
    .line 365
    const v16, -0x40133333    # -1.85f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x40a8f5c3    # -0.84f

    .line 372
    .line 373
    .line 374
    const v18, -0x4027ae14    # -1.69f

    .line 375
    .line 376
    .line 377
    const v13, -0x41b33333    # -0.2f

    .line 378
    .line 379
    .line 380
    const v14, -0x40cccccd    # -0.7f

    .line 381
    .line 382
    .line 383
    const v15, -0x410a3d71    # -0.48f

    .line 384
    .line 385
    .line 386
    const v16, -0x405eb852    # -1.26f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x4160a3d7    # 14.04f

    .line 396
    .line 397
    .line 398
    const v2, 0x414ccccd    # 12.8f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x41fae148    # -0.13f

    .line 405
    .line 406
    .line 407
    const v18, 0x3fcf5c29    # 1.62f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, 0x3f2147ae    # 0.63f

    .line 412
    .line 413
    .line 414
    const v15, -0x42dc28f6    # -0.04f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f95c28f    # 1.17f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x413851ec    # -0.39f

    .line 424
    .line 425
    .line 426
    const v18, 0x3f8b851f    # 1.09f

    .line 427
    .line 428
    .line 429
    const v13, -0x4247ae14    # -0.09f

    .line 430
    .line 431
    .line 432
    const v14, 0x3ee66666    # 0.45f

    .line 433
    .line 434
    .line 435
    const v15, -0x419eb852    # -0.22f

    .line 436
    .line 437
    .line 438
    const v16, 0x3f4f5c29    # 0.81f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3ef5c28f    # 0.48f

    .line 445
    .line 446
    .line 447
    const v2, -0x40deb852    # -0.63f

    .line 448
    .line 449
    .line 450
    const v4, 0x3f1c28f6    # 0.61f

    .line 451
    .line 452
    .line 453
    const v6, -0x413d70a4    # -0.38f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, -0x40f5c28f    # -0.54f

    .line 460
    .line 461
    .line 462
    const v2, -0x40a147ae    # -0.87f

    .line 463
    .line 464
    .line 465
    const v4, 0x3e428f5c    # 0.19f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, -0x40a147ae    # -0.87f

    .line 472
    .line 473
    .line 474
    const v18, -0x41bd70a4    # -0.19f

    .line 475
    .line 476
    .line 477
    const v13, -0x41570a3d    # -0.33f

    .line 478
    .line 479
    .line 480
    const/4 v14, 0x0

    .line 481
    const v15, -0x40e147ae    # -0.62f

    .line 482
    .line 483
    .line 484
    const v16, -0x428a3d71    # -0.06f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x41570a3d    # -0.33f

    .line 491
    .line 492
    .line 493
    const v2, -0x40e3d70a    # -0.61f

    .line 494
    .line 495
    .line 496
    const v4, -0x40dc28f6    # -0.64f

    .line 497
    .line 498
    .line 499
    const v6, -0x410f5c29    # -0.47f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, -0x41333333    # -0.4f

    .line 506
    .line 507
    .line 508
    const v18, -0x40747ae1    # -1.09f

    .line 509
    .line 510
    .line 511
    const v13, -0x41d1eb85    # -0.17f

    .line 512
    .line 513
    .line 514
    const v14, -0x4170a3d7    # -0.28f

    .line 515
    .line 516
    .line 517
    const v15, -0x416147ae    # -0.31f

    .line 518
    .line 519
    .line 520
    const v16, -0x40dc28f6    # -0.64f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, -0x41f0a3d7    # -0.14f

    .line 527
    .line 528
    .line 529
    const v18, -0x4030a3d7    # -1.62f

    .line 530
    .line 531
    .line 532
    const v13, -0x4247ae14    # -0.09f

    .line 533
    .line 534
    .line 535
    const v14, -0x411eb852    # -0.44f

    .line 536
    .line 537
    .line 538
    const v15, -0x41f0a3d7    # -0.14f

    .line 539
    .line 540
    .line 541
    const v16, -0x40851eb8    # -0.98f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x3fd51eb8    # -2.67f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, 0x3e051eb8    # 0.13f

    .line 554
    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const v14, -0x40dc28f6    # -0.64f

    .line 558
    .line 559
    .line 560
    const v15, 0x3d23d70a    # 0.04f

    .line 561
    .line 562
    .line 563
    const v16, -0x4068f5c3    # -1.18f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x3ecccccd    # 0.4f

    .line 570
    .line 571
    .line 572
    const v18, -0x407851ec    # -1.06f

    .line 573
    .line 574
    .line 575
    const v13, 0x3db851ec    # 0.09f

    .line 576
    .line 577
    .line 578
    const v14, -0x411eb852    # -0.44f

    .line 579
    .line 580
    .line 581
    const v15, 0x3e6b851f    # 0.23f

    .line 582
    .line 583
    .line 584
    const v16, -0x40b5c28f    # -0.79f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x3f23d70a    # 0.64f

    .line 591
    .line 592
    .line 593
    const v2, -0x40eb851f    # -0.58f

    .line 594
    .line 595
    .line 596
    const v4, 0x3ec7ae14    # 0.39f

    .line 597
    .line 598
    .line 599
    const v6, -0x41147ae1    # -0.46f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3f0a3d71    # 0.54f

    .line 606
    .line 607
    .line 608
    const v2, 0x3f5c28f6    # 0.86f

    .line 609
    .line 610
    .line 611
    const v4, -0x41c7ae14    # -0.18f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, 0x3d75c28f    # 0.06f

    .line 618
    .line 619
    .line 620
    const v4, 0x3f1c28f6    # 0.61f

    .line 621
    .line 622
    .line 623
    const v6, 0x3e428f5c    # 0.19f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, 0x3f23d70a    # 0.64f

    .line 630
    .line 631
    .line 632
    const v18, 0x3f147ae1    # 0.58f

    .line 633
    .line 634
    .line 635
    const/high16 v13, 0x3e800000    # 0.25f

    .line 636
    .line 637
    const v14, 0x3df5c28f    # 0.12f

    .line 638
    .line 639
    .line 640
    const v15, 0x3ef0a3d7    # 0.47f

    .line 641
    .line 642
    .line 643
    const v16, 0x3e9eb852    # 0.31f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, 0x3ecccccd    # 0.4f

    .line 650
    .line 651
    .line 652
    const v18, 0x3f87ae14    # 1.06f

    .line 653
    .line 654
    .line 655
    const v13, 0x3e3851ec    # 0.18f

    .line 656
    .line 657
    .line 658
    const v14, 0x3e8a3d71    # 0.27f

    .line 659
    .line 660
    .line 661
    const v15, 0x3e9eb852    # 0.31f

    .line 662
    .line 663
    .line 664
    const v16, 0x3f1eb852    # 0.62f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x3e051eb8    # 0.13f

    .line 671
    .line 672
    .line 673
    const v18, 0x3fcf5c29    # 1.62f

    .line 674
    .line 675
    .line 676
    const v13, 0x3da3d70a    # 0.08f

    .line 677
    .line 678
    .line 679
    const v14, 0x3ee147ae    # 0.44f

    .line 680
    .line 681
    .line 682
    const v15, 0x3e051eb8    # 0.13f

    .line 683
    .line 684
    .line 685
    const v16, 0x3f7ae148    # 0.98f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3c23d70a    # 0.01f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, 0x402a3d71    # 2.66f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    const/16 v16, 0x3800

    .line 711
    .line 712
    const/16 v17, 0x0

    .line 713
    .line 714
    const/high16 v6, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/high16 v8, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/4 v7, 0x0

    .line 719
    const/high16 v9, 0x3f800000    # 1.0f

    .line 720
    .line 721
    const/high16 v12, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/4 v13, 0x0

    .line 724
    const/4 v14, 0x0

    .line 725
    const/4 v15, 0x0

    .line 726
    const-string v4, ""

    .line 727
    .line 728
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    sput-object v0, Landroidx/compose/material/icons/twotone/ExposureZeroKt;->_exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 737
    .line 738
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    return-object v0
.end method
