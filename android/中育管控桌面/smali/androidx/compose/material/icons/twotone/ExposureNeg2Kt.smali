.class public final Landroidx/compose/material/icons/twotone/ExposureNeg2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_exposureNeg2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ExposureNeg2",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getExposureNeg2",
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
        "SMAP\nExposureNeg2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposureNeg2.kt\nandroidx/compose/material/icons/twotone/ExposureNeg2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 ExposureNeg2.kt\nandroidx/compose/material/icons/twotone/ExposureNeg2Kt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"
    }
.end annotation


# static fields
.field private static _exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposureNeg2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExposureNeg2Kt;->_exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ExposureNeg2"

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
    const v0, 0x418fd70a    # 17.98f

    .line 71
    .line 72
    .line 73
    const v2, 0x4121999a    # 10.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40f0a3d7    # -0.56f

    .line 80
    .line 81
    .line 82
    const v18, 0x3f547ae1    # 0.83f

    .line 83
    .line 84
    .line 85
    const v13, -0x41f0a3d7    # -0.14f

    .line 86
    .line 87
    .line 88
    const/high16 v14, 0x3e800000    # 0.25f

    .line 89
    .line 90
    const v15, -0x415c28f6    # -0.32f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f07ae14    # 0.53f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x409eb852    # -0.88f

    .line 100
    .line 101
    .line 102
    const v18, 0x3f83d70a    # 1.03f

    .line 103
    .line 104
    .line 105
    const v13, -0x41947ae1    # -0.23f

    .line 106
    .line 107
    .line 108
    const v14, 0x3e99999a    # 0.3f

    .line 109
    .line 110
    .line 111
    const v15, -0x40fae148    # -0.52f

    .line 112
    .line 113
    .line 114
    const v16, 0x3f266666    # 0.65f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, -0x3f7a8f5c    # -4.17f

    .line 121
    .line 122
    .line 123
    const v2, 0x4091999a    # 4.55f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41900000    # 18.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41a80000    # 21.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x40251eb8    # -1.71f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x3f41999a    # -5.95f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x40370a3d    # 2.86f

    .line 152
    .line 153
    .line 154
    const v2, -0x3fbb851f    # -3.07f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x3f851eb8    # 1.04f

    .line 161
    .line 162
    .line 163
    const v18, -0x4068f5c3    # -1.18f

    .line 164
    .line 165
    .line 166
    const v13, 0x3ec28f5c    # 0.38f

    .line 167
    .line 168
    .line 169
    const v14, -0x413851ec    # -0.39f

    .line 170
    .line 171
    .line 172
    const v15, 0x3f3851ec    # 0.72f

    .line 173
    .line 174
    .line 175
    const v16, -0x40b5c28f    # -0.79f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3f51eb85    # 0.82f

    .line 182
    .line 183
    .line 184
    const v2, -0x406a3d71    # -1.17f

    .line 185
    .line 186
    .line 187
    const v4, -0x40b851ec    # -0.78f

    .line 188
    .line 189
    .line 190
    const v6, 0x3f170a3d    # 0.59f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x3f0a3d71    # 0.54f

    .line 197
    .line 198
    .line 199
    const v18, -0x406a3d71    # -1.17f

    .line 200
    .line 201
    .line 202
    const v13, 0x3e6b851f    # 0.23f

    .line 203
    .line 204
    .line 205
    const v15, 0x3ed1eb85    # 0.41f

    .line 206
    .line 207
    .line 208
    const v16, -0x40b851ec    # -0.78f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x3e428f5c    # 0.19f

    .line 215
    .line 216
    .line 217
    const v18, -0x4068f5c3    # -1.18f

    .line 218
    .line 219
    .line 220
    const v13, 0x3e051eb8    # 0.13f

    .line 221
    .line 222
    .line 223
    const v15, 0x3e428f5c    # 0.19f

    .line 224
    .line 225
    .line 226
    const v16, -0x40b5c28f    # -0.79f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x4175c28f    # -0.27f

    .line 233
    .line 234
    .line 235
    const v18, -0x40451eb8    # -1.46f

    .line 236
    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, -0x40f851ec    # -0.53f

    .line 240
    .line 241
    .line 242
    const v15, -0x4247ae14    # -0.09f

    .line 243
    .line 244
    .line 245
    const v16, -0x407d70a4    # -1.02f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x40b0a3d7    # -0.81f

    .line 252
    .line 253
    .line 254
    const v2, -0x4071eb85    # -1.11f

    .line 255
    .line 256
    .line 257
    const v6, -0x411eb852    # -0.44f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x405eb852    # -1.26f

    .line 264
    .line 265
    .line 266
    const v18, -0x40ca3d71    # -0.71f

    .line 267
    .line 268
    .line 269
    const v13, -0x4151eb85    # -0.34f

    .line 270
    .line 271
    .line 272
    const v14, -0x416147ae    # -0.31f

    .line 273
    .line 274
    .line 275
    const v15, -0x40bae148    # -0.77f

    .line 276
    .line 277
    .line 278
    const v16, -0x40f5c28f    # -0.54f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x4023d70a    # -1.72f

    .line 285
    .line 286
    .line 287
    const v18, -0x418a3d71    # -0.24f

    .line 288
    .line 289
    .line 290
    const v13, -0x40fd70a4    # -0.51f

    .line 291
    .line 292
    .line 293
    const v14, -0x41dc28f6    # -0.16f

    .line 294
    .line 295
    .line 296
    const v15, -0x4075c28f    # -1.08f

    .line 297
    .line 298
    .line 299
    const v16, -0x418a3d71    # -0.24f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x40133333    # -1.85f

    .line 306
    .line 307
    .line 308
    const v18, 0x3ea3d70a    # 0.32f

    .line 309
    .line 310
    .line 311
    const v13, -0x40cf5c29    # -0.69f

    .line 312
    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const v15, -0x405851ec    # -1.31f

    .line 316
    .line 317
    .line 318
    const v16, 0x3de147ae    # 0.11f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x4051eb85    # -1.36f

    .line 325
    .line 326
    .line 327
    const v18, 0x3f6147ae    # 0.88f

    .line 328
    .line 329
    .line 330
    const v13, -0x40f5c28f    # -0.54f

    .line 331
    .line 332
    .line 333
    const v14, 0x3e570a3d    # 0.21f

    .line 334
    .line 335
    .line 336
    const/high16 v15, -0x40800000    # -1.0f

    .line 337
    .line 338
    const v16, 0x3f028f5c    # 0.51f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x40a8f5c3    # -0.84f

    .line 345
    .line 346
    .line 347
    const v18, 0x3fa66666    # 1.3f

    .line 348
    .line 349
    .line 350
    const v13, -0x41428f5c    # -0.37f

    .line 351
    .line 352
    .line 353
    const v14, 0x3ebd70a4    # 0.37f

    .line 354
    .line 355
    .line 356
    const v15, -0x40d9999a    # -0.65f

    .line 357
    .line 358
    .line 359
    const v16, 0x3f4ccccd    # 0.8f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, -0x4170a3d7    # -0.28f

    .line 366
    .line 367
    .line 368
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 369
    .line 370
    const v13, -0x41c7ae14    # -0.18f

    .line 371
    .line 372
    .line 373
    const v14, 0x3ef0a3d7    # 0.47f

    .line 374
    .line 375
    .line 376
    const v15, -0x4175c28f    # -0.27f

    .line 377
    .line 378
    .line 379
    const v16, 0x3f7851ec    # 0.97f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x4008f5c3    # 2.14f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3e051eb8    # 0.13f

    .line 392
    .line 393
    .line 394
    const v18, -0x40a147ae    # -0.87f

    .line 395
    .line 396
    .line 397
    const v13, 0x3c23d70a    # 0.01f

    .line 398
    .line 399
    .line 400
    const v14, -0x416147ae    # -0.31f

    .line 401
    .line 402
    .line 403
    const v15, 0x3d4ccccd    # 0.05f

    .line 404
    .line 405
    .line 406
    const v16, -0x40e66666    # -0.6f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3ecccccd    # 0.4f

    .line 413
    .line 414
    .line 415
    const/high16 v18, -0x40c00000    # -0.75f

    .line 416
    .line 417
    const v13, 0x3db851ec    # 0.09f

    .line 418
    .line 419
    .line 420
    const v14, -0x416b851f    # -0.29f

    .line 421
    .line 422
    .line 423
    const v15, 0x3e6b851f    # 0.23f

    .line 424
    .line 425
    .line 426
    const v16, -0x40f5c28f    # -0.54f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x3f2e147b    # 0.68f

    .line 433
    .line 434
    .line 435
    const v18, -0x41051eb8    # -0.49f

    .line 436
    .line 437
    .line 438
    const v13, 0x3e3851ec    # 0.18f

    .line 439
    .line 440
    .line 441
    const v14, -0x41a8f5c3    # -0.21f

    .line 442
    .line 443
    .line 444
    const v15, 0x3ed1eb85    # 0.41f

    .line 445
    .line 446
    .line 447
    const v16, -0x41428f5c    # -0.37f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3f75c28f    # 0.96f

    .line 454
    .line 455
    .line 456
    const v18, -0x41c7ae14    # -0.18f

    .line 457
    .line 458
    .line 459
    const v13, 0x3e8a3d71    # 0.27f

    .line 460
    .line 461
    .line 462
    const v14, -0x420a3d71    # -0.12f

    .line 463
    .line 464
    .line 465
    const v15, 0x3f19999a    # 0.6f

    .line 466
    .line 467
    .line 468
    const v16, -0x41c7ae14    # -0.18f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3f4f5c29    # 0.81f

    .line 475
    .line 476
    .line 477
    const v18, 0x3e19999a    # 0.15f

    .line 478
    .line 479
    .line 480
    const v13, 0x3e9eb852    # 0.31f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const v15, 0x3f147ae1    # 0.58f

    .line 485
    .line 486
    .line 487
    const v16, 0x3d4ccccd    # 0.05f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x3e800000    # 0.25f

    .line 494
    .line 495
    const v2, 0x3edc28f6    # 0.43f

    .line 496
    .line 497
    .line 498
    const v4, 0x3f170a3d    # 0.59f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v2, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x3ebd70a4    # 0.37f

    .line 505
    .line 506
    .line 507
    const v18, 0x3f266666    # 0.65f

    .line 508
    .line 509
    .line 510
    const v13, 0x3e23d70a    # 0.16f

    .line 511
    .line 512
    .line 513
    const v14, 0x3e3851ec    # 0.18f

    .line 514
    .line 515
    .line 516
    const v15, 0x3e8f5c29    # 0.28f

    .line 517
    .line 518
    .line 519
    const v16, 0x3ecccccd    # 0.4f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3e051eb8    # 0.13f

    .line 526
    .line 527
    .line 528
    const v18, 0x3f4f5c29    # 0.81f

    .line 529
    .line 530
    .line 531
    const v13, 0x3da3d70a    # 0.08f

    .line 532
    .line 533
    .line 534
    const/high16 v14, 0x3e800000    # 0.25f

    .line 535
    .line 536
    const v15, 0x3e051eb8    # 0.13f

    .line 537
    .line 538
    .line 539
    const v16, 0x3f051eb8    # 0.52f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, -0x425c28f6    # -0.08f

    .line 546
    .line 547
    .line 548
    const v18, 0x3f266666    # 0.65f

    .line 549
    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const v14, 0x3e6147ae    # 0.22f

    .line 553
    .line 554
    .line 555
    const v15, -0x430a3d71    # -0.03f

    .line 556
    .line 557
    .line 558
    const v16, 0x3edc28f6    # 0.43f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x416b851f    # -0.29f

    .line 565
    .line 566
    .line 567
    const v18, 0x3f333333    # 0.7f

    .line 568
    .line 569
    .line 570
    const v13, -0x428a3d71    # -0.06f

    .line 571
    .line 572
    .line 573
    const v15, -0x41e66666    # -0.15f

    .line 574
    .line 575
    .line 576
    const v16, 0x3ee66666    # 0.45f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x41300000    # 11.0f

    .line 586
    .line 587
    const/high16 v2, 0x40000000    # 2.0f

    .line 588
    .line 589
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41000000    # 8.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40000000    # 2.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/16 v16, 0x3800

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const/high16 v6, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v8, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const/high16 v9, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v12, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const/4 v14, 0x0

    .line 627
    const/4 v15, 0x0

    .line 628
    const-string v4, ""

    .line 629
    .line 630
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    sput-object v0, Landroidx/compose/material/icons/twotone/ExposureNeg2Kt;->_exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    return-object v0
.end method
