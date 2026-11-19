.class public final Landroidx/compose/material/icons/filled/ExposurePlus2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_exposurePlus2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ExposurePlus2",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getExposurePlus2",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nExposurePlus2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposurePlus2.kt\nandroidx/compose/material/icons/filled/ExposurePlus2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n72#5,4:120\n*S KotlinDebug\n*F\n+ 1 ExposurePlus2.kt\nandroidx/compose/material/icons/filled/ExposurePlus2Kt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n30#1:120,4\n*E\n"
    }
.end annotation


# static fields
.field private static _exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposurePlus2(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ExposurePlus2Kt;->_exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ExposurePlus2"

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
    const v0, 0x41806666    # 16.05f

    .line 71
    .line 72
    .line 73
    const v2, 0x418251ec    # 16.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40370a3d    # 2.86f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fbb851f    # -3.07f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3f851eb8    # 1.04f

    .line 89
    .line 90
    .line 91
    const v18, -0x4068f5c3    # -1.18f

    .line 92
    .line 93
    .line 94
    const v13, 0x3ec28f5c    # 0.38f

    .line 95
    .line 96
    .line 97
    const v14, -0x413851ec    # -0.39f

    .line 98
    .line 99
    .line 100
    const v15, 0x3f3851ec    # 0.72f

    .line 101
    .line 102
    .line 103
    const v16, -0x40b5c28f    # -0.79f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3f51eb85    # 0.82f

    .line 110
    .line 111
    .line 112
    const v18, -0x406a3d71    # -1.17f

    .line 113
    .line 114
    .line 115
    const v13, 0x3ea3d70a    # 0.32f

    .line 116
    .line 117
    .line 118
    const v15, 0x3f170a3d    # 0.59f

    .line 119
    .line 120
    .line 121
    const v16, -0x40b851ec    # -0.78f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3f0a3d71    # 0.54f

    .line 128
    .line 129
    .line 130
    const v13, 0x3e6b851f    # 0.23f

    .line 131
    .line 132
    .line 133
    const v15, 0x3ed1eb85    # 0.41f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3e428f5c    # 0.19f

    .line 140
    .line 141
    .line 142
    const v18, -0x4068f5c3    # -1.18f

    .line 143
    .line 144
    .line 145
    const v13, 0x3e051eb8    # 0.13f

    .line 146
    .line 147
    .line 148
    const v15, 0x3e428f5c    # 0.19f

    .line 149
    .line 150
    .line 151
    const v16, -0x40b5c28f    # -0.79f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x4175c28f    # -0.27f

    .line 158
    .line 159
    .line 160
    const v18, -0x40451eb8    # -1.46f

    .line 161
    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, -0x40f851ec    # -0.53f

    .line 165
    .line 166
    .line 167
    const v15, -0x4247ae14    # -0.09f

    .line 168
    .line 169
    .line 170
    const v16, -0x407d70a4    # -1.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x40b851ec    # -0.78f

    .line 177
    .line 178
    .line 179
    const v18, -0x4071eb85    # -1.11f

    .line 180
    .line 181
    .line 182
    const v13, -0x41c7ae14    # -0.18f

    .line 183
    .line 184
    .line 185
    const v14, -0x411eb852    # -0.44f

    .line 186
    .line 187
    .line 188
    const v15, -0x411eb852    # -0.44f

    .line 189
    .line 190
    .line 191
    const v16, -0x40b0a3d7    # -0.81f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x405eb852    # -1.26f

    .line 198
    .line 199
    .line 200
    const v18, -0x40ca3d71    # -0.71f

    .line 201
    .line 202
    .line 203
    const v13, -0x4151eb85    # -0.34f

    .line 204
    .line 205
    .line 206
    const v14, -0x416147ae    # -0.31f

    .line 207
    .line 208
    .line 209
    const v15, -0x40bae148    # -0.77f

    .line 210
    .line 211
    .line 212
    const v16, -0x40f5c28f    # -0.54f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x4023d70a    # -1.72f

    .line 219
    .line 220
    .line 221
    const v18, -0x418a3d71    # -0.24f

    .line 222
    .line 223
    .line 224
    const v13, -0x40fd70a4    # -0.51f

    .line 225
    .line 226
    .line 227
    const v14, -0x41dc28f6    # -0.16f

    .line 228
    .line 229
    .line 230
    const v15, -0x4075c28f    # -1.08f

    .line 231
    .line 232
    .line 233
    const v16, -0x418a3d71    # -0.24f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x40133333    # -1.85f

    .line 240
    .line 241
    .line 242
    const v18, 0x3ea3d70a    # 0.32f

    .line 243
    .line 244
    .line 245
    const v13, -0x40cf5c29    # -0.69f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, -0x405851ec    # -1.31f

    .line 250
    .line 251
    .line 252
    const v16, 0x3de147ae    # 0.11f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x4051eb85    # -1.36f

    .line 259
    .line 260
    .line 261
    const v18, 0x3f6147ae    # 0.88f

    .line 262
    .line 263
    .line 264
    const v13, -0x40f5c28f    # -0.54f

    .line 265
    .line 266
    .line 267
    const v14, 0x3e570a3d    # 0.21f

    .line 268
    .line 269
    .line 270
    const/high16 v15, -0x40800000    # -1.0f

    .line 271
    .line 272
    const v16, 0x3f028f5c    # 0.51f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x40a8f5c3    # -0.84f

    .line 279
    .line 280
    .line 281
    const v18, 0x3fa66666    # 1.3f

    .line 282
    .line 283
    .line 284
    const v13, -0x41428f5c    # -0.37f

    .line 285
    .line 286
    .line 287
    const v14, 0x3ebd70a4    # 0.37f

    .line 288
    .line 289
    .line 290
    const v15, -0x40d9999a    # -0.65f

    .line 291
    .line 292
    .line 293
    const v16, 0x3f4ccccd    # 0.8f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x4170a3d7    # -0.28f

    .line 300
    .line 301
    .line 302
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 303
    .line 304
    const v13, -0x41c7ae14    # -0.18f

    .line 305
    .line 306
    .line 307
    const v14, 0x3ef0a3d7    # 0.47f

    .line 308
    .line 309
    .line 310
    const v15, -0x4175c28f    # -0.27f

    .line 311
    .line 312
    .line 313
    const v16, 0x3f7851ec    # 0.97f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x4008f5c3    # 2.14f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3e051eb8    # 0.13f

    .line 326
    .line 327
    .line 328
    const v18, -0x40a147ae    # -0.87f

    .line 329
    .line 330
    .line 331
    const v13, 0x3c23d70a    # 0.01f

    .line 332
    .line 333
    .line 334
    const v14, -0x416147ae    # -0.31f

    .line 335
    .line 336
    .line 337
    const v15, 0x3d4ccccd    # 0.05f

    .line 338
    .line 339
    .line 340
    const v16, -0x40e66666    # -0.6f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x3ecccccd    # 0.4f

    .line 347
    .line 348
    .line 349
    const/high16 v18, -0x40c00000    # -0.75f

    .line 350
    .line 351
    const v13, 0x3db851ec    # 0.09f

    .line 352
    .line 353
    .line 354
    const v14, -0x416b851f    # -0.29f

    .line 355
    .line 356
    .line 357
    const v15, 0x3e6b851f    # 0.23f

    .line 358
    .line 359
    .line 360
    const v16, -0x40f5c28f    # -0.54f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x3f2e147b    # 0.68f

    .line 367
    .line 368
    .line 369
    const v18, -0x41051eb8    # -0.49f

    .line 370
    .line 371
    .line 372
    const v13, 0x3e3851ec    # 0.18f

    .line 373
    .line 374
    .line 375
    const v14, -0x41a8f5c3    # -0.21f

    .line 376
    .line 377
    .line 378
    const v15, 0x3ed1eb85    # 0.41f

    .line 379
    .line 380
    .line 381
    const v16, -0x41428f5c    # -0.37f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3f75c28f    # 0.96f

    .line 388
    .line 389
    .line 390
    const v18, -0x41c7ae14    # -0.18f

    .line 391
    .line 392
    .line 393
    const v13, 0x3e8a3d71    # 0.27f

    .line 394
    .line 395
    .line 396
    const v14, -0x420a3d71    # -0.12f

    .line 397
    .line 398
    .line 399
    const v15, 0x3f19999a    # 0.6f

    .line 400
    .line 401
    .line 402
    const v16, -0x41c7ae14    # -0.18f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x3f4f5c29    # 0.81f

    .line 409
    .line 410
    .line 411
    const v18, 0x3e19999a    # 0.15f

    .line 412
    .line 413
    .line 414
    const v13, 0x3e9eb852    # 0.31f

    .line 415
    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const v15, 0x3f147ae1    # 0.58f

    .line 419
    .line 420
    .line 421
    const v16, 0x3d4ccccd    # 0.05f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x3f170a3d    # 0.59f

    .line 428
    .line 429
    .line 430
    const v18, 0x3edc28f6    # 0.43f

    .line 431
    .line 432
    .line 433
    const v13, 0x3e6b851f    # 0.23f

    .line 434
    .line 435
    .line 436
    const v14, 0x3dcccccd    # 0.1f

    .line 437
    .line 438
    .line 439
    const v15, 0x3edc28f6    # 0.43f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x3e800000    # 0.25f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x3ebd70a4    # 0.37f

    .line 448
    .line 449
    .line 450
    const v18, 0x3f266666    # 0.65f

    .line 451
    .line 452
    .line 453
    const v13, 0x3e23d70a    # 0.16f

    .line 454
    .line 455
    .line 456
    const v14, 0x3e3851ec    # 0.18f

    .line 457
    .line 458
    .line 459
    const v15, 0x3e8f5c29    # 0.28f

    .line 460
    .line 461
    .line 462
    const v16, 0x3ecccccd    # 0.4f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x3e051eb8    # 0.13f

    .line 469
    .line 470
    .line 471
    const v18, 0x3f4f5c29    # 0.81f

    .line 472
    .line 473
    .line 474
    const v13, 0x3da3d70a    # 0.08f

    .line 475
    .line 476
    .line 477
    const/high16 v14, 0x3e800000    # 0.25f

    .line 478
    .line 479
    const v15, 0x3e051eb8    # 0.13f

    .line 480
    .line 481
    .line 482
    const v16, 0x3f051eb8    # 0.52f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, -0x425c28f6    # -0.08f

    .line 489
    .line 490
    .line 491
    const v18, 0x3f266666    # 0.65f

    .line 492
    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, 0x3e6147ae    # 0.22f

    .line 496
    .line 497
    .line 498
    const v15, -0x430a3d71    # -0.03f

    .line 499
    .line 500
    .line 501
    const v16, 0x3edc28f6    # 0.43f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x416b851f    # -0.29f

    .line 508
    .line 509
    .line 510
    const v18, 0x3f333333    # 0.7f

    .line 511
    .line 512
    .line 513
    const v13, -0x428a3d71    # -0.06f

    .line 514
    .line 515
    .line 516
    const v15, -0x41e66666    # -0.15f

    .line 517
    .line 518
    .line 519
    const v16, 0x3ee66666    # 0.45f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, -0x40f0a3d7    # -0.56f

    .line 526
    .line 527
    .line 528
    const v18, 0x3f547ae1    # 0.83f

    .line 529
    .line 530
    .line 531
    const v13, -0x41f0a3d7    # -0.14f

    .line 532
    .line 533
    .line 534
    const/high16 v14, 0x3e800000    # 0.25f

    .line 535
    .line 536
    const v15, -0x415c28f6    # -0.32f

    .line 537
    .line 538
    .line 539
    const v16, 0x3f07ae14    # 0.53f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, -0x409eb852    # -0.88f

    .line 546
    .line 547
    .line 548
    const v18, 0x3f83d70a    # 1.03f

    .line 549
    .line 550
    .line 551
    const v13, -0x41947ae1    # -0.23f

    .line 552
    .line 553
    .line 554
    const v14, 0x3e99999a    # 0.3f

    .line 555
    .line 556
    .line 557
    const v15, -0x40fae148    # -0.52f

    .line 558
    .line 559
    .line 560
    const v16, 0x3f266666    # 0.65f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, -0x3f7a8f5c    # -4.17f

    .line 567
    .line 568
    .line 569
    const v2, 0x4091999a    # 4.55f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x41900000    # 18.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, 0x41b00000    # 22.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x40251eb8    # -1.71f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x3f41999a    # -5.95f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x40e00000    # 7.0f

    .line 601
    .line 602
    const/high16 v2, 0x41000000    # 8.0f

    .line 603
    .line 604
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40c00000    # 6.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v0, 0x40800000    # 4.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x40000000    # 2.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x40800000    # 4.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x40000000    # 2.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, -0x3f800000    # -4.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x40800000    # 4.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, -0x40000000    # -2.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41000000    # 8.0f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x40e00000    # 7.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/16 v16, 0x3800

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/high16 v8, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const/high16 v9, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v12, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const/4 v14, 0x0

    .line 685
    const/4 v15, 0x0

    .line 686
    const-string v4, ""

    .line 687
    .line 688
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    sput-object v0, Landroidx/compose/material/icons/filled/ExposurePlus2Kt;->_exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 697
    .line 698
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    return-object v0
.end method
