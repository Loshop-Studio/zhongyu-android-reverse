.class public final Landroidx/compose/material/icons/sharp/StrikethroughSKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_strikethroughS",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "StrikethroughS",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getStrikethroughS",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nStrikethroughS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/sharp/StrikethroughSKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/sharp/StrikethroughSKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"
    }
.end annotation


# static fields
.field private static _strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStrikethroughS(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.StrikethroughS"

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
    const v0, 0x40e7ae14    # 7.24f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x410c0000    # 8.75f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x413851ec    # -0.39f

    .line 79
    .line 80
    .line 81
    const v18, -0x402a3d71    # -1.67f

    .line 82
    .line 83
    .line 84
    const v13, -0x417ae148    # -0.26f

    .line 85
    .line 86
    .line 87
    const v14, -0x410a3d71    # -0.48f

    .line 88
    .line 89
    .line 90
    const v15, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v16, -0x407c28f6    # -1.03f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x3ecccccd    # 0.4f

    .line 100
    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x40e3d70a    # -0.61f

    .line 104
    .line 105
    .line 106
    const v15, 0x3e051eb8    # 0.13f

    .line 107
    .line 108
    .line 109
    const v16, -0x406b851f    # -1.16f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x3f8e147b    # 1.11f

    .line 116
    .line 117
    .line 118
    const v18, -0x405ae148    # -1.29f

    .line 119
    .line 120
    .line 121
    const v13, 0x3e851eb8    # 0.26f

    .line 122
    .line 123
    .line 124
    const/high16 v14, -0x41000000    # -0.5f

    .line 125
    .line 126
    const v15, 0x3f2147ae    # 0.63f

    .line 127
    .line 128
    .line 129
    const v16, -0x4091eb85    # -0.93f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3fd9999a    # 1.7f

    .line 136
    .line 137
    .line 138
    const v18, -0x40ab851f    # -0.83f

    .line 139
    .line 140
    .line 141
    const v13, 0x3ef5c28f    # 0.48f

    .line 142
    .line 143
    .line 144
    const v14, -0x414ccccd    # -0.35f

    .line 145
    .line 146
    .line 147
    const v15, 0x3f866666    # 1.05f

    .line 148
    .line 149
    .line 150
    const v16, -0x40deb852    # -0.63f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x400b851f    # 2.18f

    .line 157
    .line 158
    .line 159
    const v18, -0x416b851f    # -0.29f

    .line 160
    .line 161
    .line 162
    const v13, 0x3f28f5c3    # 0.66f

    .line 163
    .line 164
    .line 165
    const v14, -0x41bd70a4    # -0.19f

    .line 166
    .line 167
    .line 168
    const v15, 0x3fb1eb85    # 1.39f

    .line 169
    .line 170
    .line 171
    const v16, -0x416b851f    # -0.29f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x400d70a4    # 2.21f

    .line 178
    .line 179
    .line 180
    const v18, 0x3eae147b    # 0.34f

    .line 181
    .line 182
    .line 183
    const v13, 0x3f4f5c29    # 0.81f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const v15, 0x3fc51eb8    # 1.54f

    .line 188
    .line 189
    .line 190
    const v16, 0x3de147ae    # 0.11f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x3fd851ec    # 1.69f

    .line 197
    .line 198
    .line 199
    const v18, 0x3f70a3d7    # 0.94f

    .line 200
    .line 201
    .line 202
    const v13, 0x3f28f5c3    # 0.66f

    .line 203
    .line 204
    .line 205
    const v14, 0x3e6147ae    # 0.22f

    .line 206
    .line 207
    .line 208
    const v15, 0x3f9d70a4    # 1.23f

    .line 209
    .line 210
    .line 211
    const v16, 0x3f0a3d71    # 0.54f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x3f8a3d71    # 1.08f

    .line 218
    .line 219
    .line 220
    const v18, 0x3fb70a3d    # 1.43f

    .line 221
    .line 222
    .line 223
    const v13, 0x3ef0a3d7    # 0.47f

    .line 224
    .line 225
    .line 226
    const v14, 0x3ecccccd    # 0.4f

    .line 227
    .line 228
    .line 229
    const v15, 0x3f547ae1    # 0.83f

    .line 230
    .line 231
    .line 232
    const v16, 0x3f6147ae    # 0.88f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3f933333    # 1.15f

    .line 239
    .line 240
    .line 241
    const v2, 0x3fe7ae14    # 1.81f

    .line 242
    .line 243
    .line 244
    const v4, 0x3ec28f5c    # 0.38f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x3fbf5c29    # -3.01f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x41e66666    # -0.15f

    .line 257
    .line 258
    .line 259
    const v18, -0x40a66666    # -0.85f

    .line 260
    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, -0x416147ae    # -0.31f

    .line 264
    .line 265
    .line 266
    const v15, -0x42b33333    # -0.05f

    .line 267
    .line 268
    .line 269
    const v16, -0x40e8f5c3    # -0.59f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x411eb852    # -0.44f

    .line 276
    .line 277
    .line 278
    const v18, -0x40d1eb85    # -0.68f

    .line 279
    .line 280
    .line 281
    const v13, -0x4247ae14    # -0.09f

    .line 282
    .line 283
    .line 284
    const v14, -0x4175c28f    # -0.27f

    .line 285
    .line 286
    .line 287
    const v15, -0x418a3d71    # -0.24f

    .line 288
    .line 289
    .line 290
    const v16, -0x41051eb8    # -0.49f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, -0x40c00000    # -0.75f

    .line 297
    .line 298
    const v18, -0x411eb852    # -0.44f

    .line 299
    .line 300
    .line 301
    const v13, -0x41b33333    # -0.2f

    .line 302
    .line 303
    .line 304
    const v14, -0x41bd70a4    # -0.19f

    .line 305
    .line 306
    .line 307
    const v15, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    const v16, -0x41570a3d    # -0.33f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x407851ec    # -1.06f

    .line 317
    .line 318
    .line 319
    const v18, -0x41dc28f6    # -0.16f

    .line 320
    .line 321
    .line 322
    const v13, -0x41666666    # -0.3f

    .line 323
    .line 324
    .line 325
    const v14, -0x42333333    # -0.1f

    .line 326
    .line 327
    .line 328
    const v15, -0x40d70a3d    # -0.66f

    .line 329
    .line 330
    .line 331
    const v16, -0x41dc28f6    # -0.16f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x407c28f6    # -1.03f

    .line 338
    .line 339
    .line 340
    const v18, 0x3e051eb8    # 0.13f

    .line 341
    .line 342
    .line 343
    const v13, -0x413851ec    # -0.39f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const v15, -0x40c28f5c    # -0.74f

    .line 348
    .line 349
    .line 350
    const v16, 0x3d23d70a    # 0.04f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x3e570a3d    # 0.21f

    .line 357
    .line 358
    .line 359
    const v2, -0x40c7ae14    # -0.72f

    .line 360
    .line 361
    .line 362
    const v4, 0x3eb851ec    # 0.36f

    .line 363
    .line 364
    .line 365
    const v6, -0x40f851ec    # -0.53f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x411eb852    # -0.44f

    .line 372
    .line 373
    .line 374
    const v18, 0x3f0ccccd    # 0.55f

    .line 375
    .line 376
    .line 377
    const v13, -0x41bd70a4    # -0.19f

    .line 378
    .line 379
    .line 380
    const v14, 0x3e23d70a    # 0.16f

    .line 381
    .line 382
    .line 383
    const v15, -0x4151eb85    # -0.34f

    .line 384
    .line 385
    .line 386
    const v16, 0x3eae147b    # 0.34f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x41e66666    # -0.15f

    .line 393
    .line 394
    .line 395
    const v18, 0x3f28f5c3    # 0.66f

    .line 396
    .line 397
    .line 398
    const v13, -0x42333333    # -0.1f

    .line 399
    .line 400
    .line 401
    const v14, 0x3e570a3d    # 0.21f

    .line 402
    .line 403
    .line 404
    const v15, -0x41e66666    # -0.15f

    .line 405
    .line 406
    .line 407
    const v16, 0x3edc28f6    # 0.43f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3f3d70a4    # 0.74f

    .line 414
    .line 415
    .line 416
    const v18, 0x3f9ae148    # 1.21f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3ef5c28f    # 0.48f

    .line 421
    .line 422
    .line 423
    const/high16 v15, 0x3e800000    # 0.25f

    .line 424
    .line 425
    const v16, 0x3f6147ae    # 0.88f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3fb47ae1    # 1.41f

    .line 432
    .line 433
    .line 434
    const v18, 0x3f333333    # 0.7f

    .line 435
    .line 436
    .line 437
    const v13, 0x3ec28f5c    # 0.38f

    .line 438
    .line 439
    .line 440
    const/high16 v14, 0x3e800000    # 0.25f

    .line 441
    .line 442
    const v15, 0x3f451eb8    # 0.77f

    .line 443
    .line 444
    .line 445
    const v16, 0x3ef5c28f    # 0.48f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40ec7ae1    # 7.39f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, -0x41e66666    # -0.15f

    .line 458
    .line 459
    .line 460
    const/high16 v18, -0x41800000    # -0.25f

    .line 461
    .line 462
    const v13, -0x42b33333    # -0.05f

    .line 463
    .line 464
    .line 465
    const v14, -0x425c28f6    # -0.08f

    .line 466
    .line 467
    .line 468
    const v15, -0x421eb852    # -0.11f

    .line 469
    .line 470
    .line 471
    const v16, -0x41d1eb85    # -0.17f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41400000    # 12.0f

    .line 481
    .line 482
    const/high16 v2, 0x41a80000    # 21.0f

    .line 483
    .line 484
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, -0x40000000    # -2.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x40400000    # 3.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x40000000    # 2.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x4119eb85    # 9.62f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, 0x3f0ccccd    # 0.55f

    .line 509
    .line 510
    .line 511
    const v18, 0x3e4ccccd    # 0.2f

    .line 512
    .line 513
    .line 514
    const v13, 0x3e3851ec    # 0.18f

    .line 515
    .line 516
    .line 517
    const v14, 0x3d8f5c29    # 0.07f

    .line 518
    .line 519
    .line 520
    const v15, 0x3ecccccd    # 0.4f

    .line 521
    .line 522
    .line 523
    const v16, 0x3e0f5c29    # 0.14f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x3f5eb852    # 0.87f

    .line 530
    .line 531
    .line 532
    const v18, 0x3f028f5c    # 0.51f

    .line 533
    .line 534
    .line 535
    const v13, 0x3ebd70a4    # 0.37f

    .line 536
    .line 537
    .line 538
    const v14, 0x3e2e147b    # 0.17f

    .line 539
    .line 540
    .line 541
    const v15, 0x3f28f5c3    # 0.66f

    .line 542
    .line 543
    .line 544
    const v16, 0x3eae147b    # 0.34f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x3edc28f6    # 0.43f

    .line 551
    .line 552
    .line 553
    const v2, 0x3f11eb85    # 0.57f

    .line 554
    .line 555
    .line 556
    const v6, 0x3eb33333    # 0.35f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3de147ae    # 0.11f

    .line 563
    .line 564
    .line 565
    const v18, 0x3f30a3d7    # 0.69f

    .line 566
    .line 567
    .line 568
    const v13, 0x3d8f5c29    # 0.07f

    .line 569
    .line 570
    .line 571
    const v14, 0x3e4ccccd    # 0.2f

    .line 572
    .line 573
    .line 574
    const v15, 0x3de147ae    # 0.11f

    .line 575
    .line 576
    .line 577
    const v16, 0x3edc28f6    # 0.43f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x41f0a3d7    # -0.14f

    .line 584
    .line 585
    .line 586
    const v18, 0x3f28f5c3    # 0.66f

    .line 587
    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    const v14, 0x3e6b851f    # 0.23f

    .line 591
    .line 592
    .line 593
    const v15, -0x42b33333    # -0.05f

    .line 594
    .line 595
    .line 596
    const v16, 0x3ee66666    # 0.45f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, -0x4128f5c3    # -0.42f

    .line 603
    .line 604
    .line 605
    const v18, 0x3f07ae14    # 0.53f

    .line 606
    .line 607
    .line 608
    const v13, -0x4247ae14    # -0.09f

    .line 609
    .line 610
    .line 611
    const v14, 0x3e4ccccd    # 0.2f

    .line 612
    .line 613
    .line 614
    const v15, -0x41947ae1    # -0.23f

    .line 615
    .line 616
    .line 617
    const v16, 0x3ec28f5c    # 0.38f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, -0x40ca3d71    # -0.71f

    .line 624
    .line 625
    .line 626
    const v18, 0x3eb33333    # 0.35f

    .line 627
    .line 628
    .line 629
    const v13, -0x41bd70a4    # -0.19f

    .line 630
    .line 631
    .line 632
    const v14, 0x3e19999a    # 0.15f

    .line 633
    .line 634
    .line 635
    const v15, -0x4128f5c3    # -0.42f

    .line 636
    .line 637
    .line 638
    const v16, 0x3e851eb8    # 0.26f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, -0x407eb852    # -1.01f

    .line 645
    .line 646
    .line 647
    const v18, 0x3e051eb8    # 0.13f

    .line 648
    .line 649
    .line 650
    const v13, -0x416b851f    # -0.29f

    .line 651
    .line 652
    .line 653
    const v14, 0x3da3d70a    # 0.08f

    .line 654
    .line 655
    .line 656
    const v15, -0x40deb852    # -0.63f

    .line 657
    .line 658
    .line 659
    const v16, 0x3e051eb8    # 0.13f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, -0x4068f5c3    # -1.18f

    .line 666
    .line 667
    .line 668
    const v18, -0x41fae148    # -0.13f

    .line 669
    .line 670
    .line 671
    const v13, -0x4123d70a    # -0.43f

    .line 672
    .line 673
    .line 674
    const/4 v14, 0x0

    .line 675
    const v15, -0x40ab851f    # -0.83f

    .line 676
    .line 677
    .line 678
    const v16, -0x42dc28f6    # -0.04f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, -0x40970a3d    # -0.91f

    .line 685
    .line 686
    .line 687
    const v2, -0x4128f5c3    # -0.42f

    .line 688
    .line 689
    .line 690
    const v4, -0x40d70a3d    # -0.66f

    .line 691
    .line 692
    .line 693
    const v6, -0x41947ae1    # -0.23f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v17, -0x40e8f5c3    # -0.59f

    .line 700
    .line 701
    .line 702
    const/high16 v18, -0x40c00000    # -0.75f

    .line 703
    .line 704
    const/high16 v13, -0x41800000    # -0.25f

    .line 705
    .line 706
    const v14, -0x41bd70a4    # -0.19f

    .line 707
    .line 708
    .line 709
    const v15, -0x4119999a    # -0.45f

    .line 710
    .line 711
    .line 712
    const v16, -0x411eb852    # -0.44f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, -0x40bd70a4    # -0.76f

    .line 719
    .line 720
    .line 721
    const v2, -0x40651eb8    # -1.21f

    .line 722
    .line 723
    .line 724
    const/high16 v4, -0x41800000    # -0.25f

    .line 725
    .line 726
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x40cccccd    # 6.4f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v17, 0x3e75c28f    # 0.24f

    .line 736
    .line 737
    .line 738
    const v18, 0x3fca3d71    # 1.58f

    .line 739
    .line 740
    .line 741
    const/4 v13, 0x0

    .line 742
    const v14, 0x3f0ccccd    # 0.55f

    .line 743
    .line 744
    .line 745
    const v15, 0x3da3d70a    # 0.08f

    .line 746
    .line 747
    .line 748
    const v16, 0x3f90a3d7    # 1.13f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, 0x3f59999a    # 0.85f

    .line 755
    .line 756
    .line 757
    const v2, 0x3f266666    # 0.65f

    .line 758
    .line 759
    .line 760
    const v4, 0x3f9ae148    # 1.21f

    .line 761
    .line 762
    .line 763
    const v6, 0x3ebd70a4    # 0.37f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v17, 0x3f7ae148    # 0.98f

    .line 770
    .line 771
    .line 772
    const v18, 0x3f6b851f    # 0.92f

    .line 773
    .line 774
    .line 775
    const v13, 0x3e8f5c29    # 0.28f

    .line 776
    .line 777
    .line 778
    const v14, 0x3eb33333    # 0.35f

    .line 779
    .line 780
    .line 781
    const v15, 0x3f19999a    # 0.6f

    .line 782
    .line 783
    .line 784
    const v16, 0x3f28f5c3    # 0.66f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x3f9c28f6    # 1.22f

    .line 791
    .line 792
    .line 793
    const v18, 0x3f266666    # 0.65f

    .line 794
    .line 795
    .line 796
    const v13, 0x3ebd70a4    # 0.37f

    .line 797
    .line 798
    .line 799
    const v14, 0x3e851eb8    # 0.26f

    .line 800
    .line 801
    .line 802
    const v15, 0x3f47ae14    # 0.78f

    .line 803
    .line 804
    .line 805
    const v16, 0x3ef5c28f    # 0.48f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, 0x3fb0a3d7    # 1.38f

    .line 812
    .line 813
    .line 814
    const v18, 0x3ec7ae14    # 0.39f

    .line 815
    .line 816
    .line 817
    const v13, 0x3ee147ae    # 0.44f

    .line 818
    .line 819
    .line 820
    const v14, 0x3e2e147b    # 0.17f

    .line 821
    .line 822
    .line 823
    const v15, 0x3f666666    # 0.9f

    .line 824
    .line 825
    .line 826
    const v16, 0x3e99999a    # 0.3f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v17, 0x3fb851ec    # 1.44f

    .line 833
    .line 834
    .line 835
    const v18, 0x3e051eb8    # 0.13f

    .line 836
    .line 837
    .line 838
    const v13, 0x3ef5c28f    # 0.48f

    .line 839
    .line 840
    .line 841
    const v14, 0x3da3d70a    # 0.08f

    .line 842
    .line 843
    .line 844
    const v15, 0x3f75c28f    # 0.96f

    .line 845
    .line 846
    .line 847
    const v16, 0x3e051eb8    # 0.13f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v17, 0x400b851f    # 2.18f

    .line 854
    .line 855
    .line 856
    const v18, -0x4170a3d7    # -0.28f

    .line 857
    .line 858
    .line 859
    const v13, 0x3f4ccccd    # 0.8f

    .line 860
    .line 861
    .line 862
    const/4 v14, 0x0

    .line 863
    const v15, 0x3fc3d70a    # 1.53f

    .line 864
    .line 865
    .line 866
    const v16, -0x4247ae14    # -0.09f

    .line 867
    .line 868
    .line 869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x3fd5c28f    # 1.67f

    .line 873
    .line 874
    .line 875
    const v2, -0x40b5c28f    # -0.79f

    .line 876
    .line 877
    .line 878
    const v6, -0x4119999a    # -0.45f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const v17, 0x3f88f5c3    # 1.07f

    .line 885
    .line 886
    .line 887
    const v18, -0x405d70a4    # -1.27f

    .line 888
    .line 889
    .line 890
    const v13, 0x3eeb851f    # 0.46f

    .line 891
    .line 892
    .line 893
    const v14, -0x4151eb85    # -0.34f

    .line 894
    .line 895
    .line 896
    const v15, 0x3f51eb85    # 0.82f

    .line 897
    .line 898
    .line 899
    const v16, -0x40bae148    # -0.77f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v0, -0x40770a3d    # -1.07f

    .line 906
    .line 907
    .line 908
    const v2, -0x40251eb8    # -1.71f

    .line 909
    .line 910
    .line 911
    const v4, 0x3ec28f5c    # 0.38f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v17, -0x416147ae    # -0.31f

    .line 918
    .line 919
    .line 920
    const v18, -0x4031eb85    # -1.61f

    .line 921
    .line 922
    .line 923
    const/4 v13, 0x0

    .line 924
    const v14, -0x40e66666    # -0.6f

    .line 925
    .line 926
    .line 927
    const v15, -0x42333333    # -0.1f

    .line 928
    .line 929
    .line 930
    const v16, -0x406e147b    # -1.14f

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, -0x41d1eb85    # -0.17f

    .line 937
    .line 938
    .line 939
    const v18, -0x41570a3d    # -0.33f

    .line 940
    .line 941
    .line 942
    const v13, -0x42b33333    # -0.05f

    .line 943
    .line 944
    .line 945
    const v14, -0x421eb852    # -0.11f

    .line 946
    .line 947
    .line 948
    const v15, -0x421eb852    # -0.11f

    .line 949
    .line 950
    .line 951
    const v16, -0x41947ae1    # -0.23f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v0, 0x41a80000    # 21.0f

    .line 958
    .line 959
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v0, 0x41400000    # 12.0f

    .line 963
    .line 964
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    const/16 v16, 0x3800

    .line 975
    .line 976
    const/16 v17, 0x0

    .line 977
    .line 978
    const/high16 v6, 0x3f800000    # 1.0f

    .line 979
    .line 980
    const/high16 v8, 0x3f800000    # 1.0f

    .line 981
    .line 982
    const/4 v7, 0x0

    .line 983
    const/high16 v9, 0x3f800000    # 1.0f

    .line 984
    .line 985
    const/high16 v12, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const/4 v13, 0x0

    .line 988
    const/4 v14, 0x0

    .line 989
    const/4 v15, 0x0

    .line 990
    const-string v4, ""

    .line 991
    .line 992
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    sput-object v0, Landroidx/compose/material/icons/sharp/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1001
    .line 1002
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    return-object v0
.end method
