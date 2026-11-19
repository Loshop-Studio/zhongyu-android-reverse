.class public final Landroidx/compose/material/icons/outlined/FilterVintageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_filterVintage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FilterVintage",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFilterVintage",
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
        "SMAP\nFilterVintage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterVintage.kt\nandroidx/compose/material/icons/outlined/FilterVintageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,127:1\n212#2,12:128\n233#2,18:141\n253#2:178\n174#3:140\n705#4,2:159\n717#4,2:161\n719#4,11:167\n72#5,4:163\n*S KotlinDebug\n*F\n+ 1 FilterVintage.kt\nandroidx/compose/material/icons/outlined/FilterVintageKt\n*L\n29#1:128,12\n30#1:141,18\n30#1:178\n29#1:140\n30#1:159,2\n30#1:161,2\n30#1:167,11\n30#1:163,4\n*E\n"
    }
.end annotation


# static fields
.field private static _filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterVintage(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FilterVintage"

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
    const v0, 0x4195999a    # 18.7f

    .line 71
    .line 72
    .line 73
    const v2, 0x41466666    # 12.4f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40a3d70a    # -0.86f

    .line 80
    .line 81
    .line 82
    const v18, -0x41333333    # -0.4f

    .line 83
    .line 84
    .line 85
    const v13, -0x4170a3d7    # -0.28f

    .line 86
    .line 87
    .line 88
    const v14, -0x41dc28f6    # -0.16f

    .line 89
    .line 90
    .line 91
    const v15, -0x40ee147b    # -0.57f

    .line 92
    .line 93
    .line 94
    const v16, -0x416b851f    # -0.29f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f5c28f6    # 0.86f

    .line 101
    .line 102
    .line 103
    const v13, 0x3e947ae1    # 0.29f

    .line 104
    .line 105
    .line 106
    const v14, -0x421eb852    # -0.11f

    .line 107
    .line 108
    .line 109
    const v15, 0x3f147ae1    # 0.58f

    .line 110
    .line 111
    .line 112
    const v16, -0x418a3d71    # -0.24f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, 0x40400000    # 3.0f

    .line 119
    .line 120
    const v18, -0x3f59eb85    # -5.19f

    .line 121
    .line 122
    .line 123
    const v13, 0x3ff5c28f    # 1.92f

    .line 124
    .line 125
    .line 126
    const v14, -0x4071eb85    # -1.11f

    .line 127
    .line 128
    .line 129
    const v15, 0x403f5c29    # 2.99f

    .line 130
    .line 131
    .line 132
    const v16, -0x3fb851ec    # -3.12f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x3fbf5c29    # -3.01f

    .line 139
    .line 140
    .line 141
    const v18, -0x40b33333    # -0.8f

    .line 142
    .line 143
    .line 144
    const v13, -0x40970a3d    # -0.91f

    .line 145
    .line 146
    .line 147
    const v14, -0x40fae148    # -0.52f

    .line 148
    .line 149
    .line 150
    const v15, -0x40066666    # -1.95f

    .line 151
    .line 152
    .line 153
    const v16, -0x40b33333    # -0.8f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, -0x3fc0a3d7    # -2.99f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f4ccccd    # 0.8f

    .line 163
    .line 164
    .line 165
    const v13, -0x407d70a4    # -1.02f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const v15, -0x3ffccccd    # -2.05f

    .line 170
    .line 171
    .line 172
    const v16, 0x3e851eb8    # 0.26f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x40b851ec    # -0.78f

    .line 179
    .line 180
    .line 181
    const v18, 0x3f0a3d71    # 0.54f

    .line 182
    .line 183
    .line 184
    const v13, -0x4170a3d7    # -0.28f

    .line 185
    .line 186
    .line 187
    const v14, 0x3e23d70a    # 0.16f

    .line 188
    .line 189
    .line 190
    const v15, -0x40f5c28f    # -0.54f

    .line 191
    .line 192
    .line 193
    const v16, 0x3eb33333    # 0.35f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3da3d70a    # 0.08f

    .line 200
    .line 201
    .line 202
    const v18, -0x408ccccd    # -0.95f

    .line 203
    .line 204
    .line 205
    const v13, 0x3d4ccccd    # 0.05f

    .line 206
    .line 207
    .line 208
    const v14, -0x416147ae    # -0.31f

    .line 209
    .line 210
    .line 211
    const v15, 0x3da3d70a    # 0.08f

    .line 212
    .line 213
    .line 214
    const v16, -0x40deb852    # -0.63f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 221
    .line 222
    const v18, -0x3f59eb85    # -5.19f

    .line 223
    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const v14, -0x3ff1eb85    # -2.22f

    .line 227
    .line 228
    .line 229
    const v15, -0x40651eb8    # -1.21f

    .line 230
    .line 231
    .line 232
    const v16, -0x3f7b3333    # -4.15f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41100000    # 9.0f

    .line 239
    .line 240
    const/high16 v18, 0x40c00000    # 6.0f

    .line 241
    .line 242
    const v13, 0x41235c29    # 10.21f

    .line 243
    .line 244
    .line 245
    const v14, 0x3feccccd    # 1.85f

    .line 246
    .line 247
    .line 248
    const/high16 v15, 0x41100000    # 9.0f

    .line 249
    .line 250
    const v16, 0x4071eb85    # 3.78f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3da3d70a    # 0.08f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f733333    # 0.95f

    .line 260
    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, 0x3ea3d70a    # 0.32f

    .line 264
    .line 265
    .line 266
    const v15, 0x3cf5c28f    # 0.03f

    .line 267
    .line 268
    .line 269
    const v16, 0x3f23d70a    # 0.64f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x40b851ec    # -0.78f

    .line 276
    .line 277
    .line 278
    const v18, -0x40f33333    # -0.55f

    .line 279
    .line 280
    .line 281
    const v13, -0x418a3d71    # -0.24f

    .line 282
    .line 283
    .line 284
    const v14, -0x41b33333    # -0.2f

    .line 285
    .line 286
    .line 287
    const/high16 v15, -0x41000000    # -0.5f

    .line 288
    .line 289
    const v16, -0x413851ec    # -0.39f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x3fc0a3d7    # -2.99f

    .line 296
    .line 297
    .line 298
    const v18, -0x40b33333    # -0.8f

    .line 299
    .line 300
    .line 301
    const v13, -0x408f5c29    # -0.94f

    .line 302
    .line 303
    .line 304
    const v14, -0x40f5c28f    # -0.54f

    .line 305
    .line 306
    .line 307
    const v15, -0x4003d70a    # -1.97f

    .line 308
    .line 309
    .line 310
    const v16, -0x40b33333    # -0.8f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x3fbf5c29    # -3.01f

    .line 317
    .line 318
    .line 319
    const v18, 0x3f4ccccd    # 0.8f

    .line 320
    .line 321
    .line 322
    const v13, -0x4079999a    # -1.05f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const v15, -0x3ff9999a    # -2.1f

    .line 327
    .line 328
    .line 329
    const v16, 0x3e8f5c29    # 0.28f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x40400000    # 3.0f

    .line 336
    .line 337
    const v18, 0x40a6147b    # 5.19f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x40047ae1    # 2.07f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f88f5c3    # 1.07f

    .line 345
    .line 346
    .line 347
    const v16, 0x40828f5c    # 4.08f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3f5c28f6    # 0.86f

    .line 354
    .line 355
    .line 356
    const v18, 0x3ecccccd    # 0.4f

    .line 357
    .line 358
    .line 359
    const v13, 0x3e8f5c29    # 0.28f

    .line 360
    .line 361
    .line 362
    const v14, 0x3e23d70a    # 0.16f

    .line 363
    .line 364
    .line 365
    const v15, 0x3f11eb85    # 0.57f

    .line 366
    .line 367
    .line 368
    const v16, 0x3e947ae1    # 0.29f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x40a3d70a    # -0.86f

    .line 375
    .line 376
    .line 377
    const v13, -0x416b851f    # -0.29f

    .line 378
    .line 379
    .line 380
    const v14, 0x3de147ae    # 0.11f

    .line 381
    .line 382
    .line 383
    const v15, -0x40eb851f    # -0.58f

    .line 384
    .line 385
    .line 386
    const v16, 0x3e75c28f    # 0.24f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 393
    .line 394
    const v18, 0x40a6147b    # 5.19f

    .line 395
    .line 396
    .line 397
    const v13, -0x400a3d71    # -1.92f

    .line 398
    .line 399
    .line 400
    const v14, 0x3f8e147b    # 1.11f

    .line 401
    .line 402
    .line 403
    const v15, -0x3fc0a3d7    # -2.99f

    .line 404
    .line 405
    .line 406
    const v16, 0x4047ae14    # 3.12f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x4040a3d7    # 3.01f

    .line 413
    .line 414
    .line 415
    const v18, 0x3f4ccccd    # 0.8f

    .line 416
    .line 417
    .line 418
    const v13, 0x3f68f5c3    # 0.91f

    .line 419
    .line 420
    .line 421
    const v14, 0x3f051eb8    # 0.52f

    .line 422
    .line 423
    .line 424
    const v15, 0x3ff9999a    # 1.95f

    .line 425
    .line 426
    .line 427
    const v16, 0x3f4ccccd    # 0.8f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x403f5c29    # 2.99f

    .line 434
    .line 435
    .line 436
    const v18, -0x40b33333    # -0.8f

    .line 437
    .line 438
    .line 439
    const v13, 0x3f828f5c    # 1.02f

    .line 440
    .line 441
    .line 442
    const/4 v14, 0x0

    .line 443
    const v15, 0x40033333    # 2.05f

    .line 444
    .line 445
    .line 446
    const v16, -0x417ae148    # -0.26f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3f47ae14    # 0.78f

    .line 453
    .line 454
    .line 455
    const v18, -0x40f5c28f    # -0.54f

    .line 456
    .line 457
    .line 458
    const v13, 0x3e8f5c29    # 0.28f

    .line 459
    .line 460
    .line 461
    const v14, -0x41dc28f6    # -0.16f

    .line 462
    .line 463
    .line 464
    const v15, 0x3f0a3d71    # 0.54f

    .line 465
    .line 466
    .line 467
    const v16, -0x414ccccd    # -0.35f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, -0x425c28f6    # -0.08f

    .line 474
    .line 475
    .line 476
    const v18, 0x3f75c28f    # 0.96f

    .line 477
    .line 478
    .line 479
    const v13, -0x42b33333    # -0.05f

    .line 480
    .line 481
    .line 482
    const v14, 0x3ea3d70a    # 0.32f

    .line 483
    .line 484
    .line 485
    const v15, -0x425c28f6    # -0.08f

    .line 486
    .line 487
    .line 488
    const v16, 0x3f23d70a    # 0.64f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x40400000    # 3.0f

    .line 495
    .line 496
    const v18, 0x40a6147b    # 5.19f

    .line 497
    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const v14, 0x400e147b    # 2.22f

    .line 501
    .line 502
    .line 503
    const v15, 0x3f9ae148    # 1.21f

    .line 504
    .line 505
    .line 506
    const v16, 0x4084cccd    # 4.15f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v18, -0x3f59eb85    # -5.19f

    .line 513
    .line 514
    .line 515
    const v13, 0x3fe51eb8    # 1.79f

    .line 516
    .line 517
    .line 518
    const v14, -0x407ae148    # -1.04f

    .line 519
    .line 520
    .line 521
    const/high16 v15, 0x40400000    # 3.0f

    .line 522
    .line 523
    const v16, -0x3fc1eb85    # -2.97f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, -0x425c28f6    # -0.08f

    .line 530
    .line 531
    .line 532
    const v18, -0x408ccccd    # -0.95f

    .line 533
    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, -0x415c28f6    # -0.32f

    .line 537
    .line 538
    .line 539
    const v15, -0x430a3d71    # -0.03f

    .line 540
    .line 541
    .line 542
    const v16, -0x40dc28f6    # -0.64f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, 0x3f47ae14    # 0.78f

    .line 549
    .line 550
    .line 551
    const v18, 0x3f0a3d71    # 0.54f

    .line 552
    .line 553
    .line 554
    const v13, 0x3e75c28f    # 0.24f

    .line 555
    .line 556
    .line 557
    const v14, 0x3e4ccccd    # 0.2f

    .line 558
    .line 559
    .line 560
    const/high16 v15, 0x3f000000    # 0.5f

    .line 561
    .line 562
    const v16, 0x3ec28f5c    # 0.38f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x403f5c29    # 2.99f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f4ccccd    # 0.8f

    .line 572
    .line 573
    .line 574
    const v13, 0x3f70a3d7    # 0.94f

    .line 575
    .line 576
    .line 577
    const v14, 0x3f0a3d71    # 0.54f

    .line 578
    .line 579
    .line 580
    const v15, 0x3ffc28f6    # 1.97f

    .line 581
    .line 582
    .line 583
    const v16, 0x3f4ccccd    # 0.8f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x4040a3d7    # 3.01f

    .line 590
    .line 591
    .line 592
    const v18, -0x40b33333    # -0.8f

    .line 593
    .line 594
    .line 595
    const v13, 0x3f866666    # 1.05f

    .line 596
    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    const v15, 0x40066666    # 2.1f

    .line 600
    .line 601
    .line 602
    const v16, -0x4170a3d7    # -0.28f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 609
    .line 610
    const v18, -0x3f59eb85    # -5.19f

    .line 611
    .line 612
    .line 613
    const v13, -0x43dc28f6    # -0.01f

    .line 614
    .line 615
    .line 616
    const v14, -0x3ffb851f    # -2.07f

    .line 617
    .line 618
    .line 619
    const v15, -0x4075c28f    # -1.08f

    .line 620
    .line 621
    .line 622
    const v16, -0x3f7d70a4    # -4.08f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x418147ae    # 16.16f

    .line 632
    .line 633
    .line 634
    const v2, 0x410851ec    # 8.52f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, 0x3f0a3d71    # 0.54f

    .line 641
    .line 642
    .line 643
    const v18, -0x41428f5c    # -0.37f

    .line 644
    .line 645
    .line 646
    const v13, 0x3e570a3d    # 0.21f

    .line 647
    .line 648
    .line 649
    const v14, -0x41d1eb85    # -0.17f

    .line 650
    .line 651
    .line 652
    const v15, 0x3ec28f5c    # 0.38f

    .line 653
    .line 654
    .line 655
    const v16, -0x416b851f    # -0.29f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x40000000    # 2.0f

    .line 662
    .line 663
    const v18, -0x40f5c28f    # -0.54f

    .line 664
    .line 665
    .line 666
    const v13, 0x3f1c28f6    # 0.61f

    .line 667
    .line 668
    .line 669
    const v14, -0x414ccccd    # -0.35f

    .line 670
    .line 671
    .line 672
    const v15, 0x3fa66666    # 1.3f

    .line 673
    .line 674
    .line 675
    const v16, -0x40f5c28f    # -0.54f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x3f4a3d71    # 0.79f

    .line 682
    .line 683
    .line 684
    const v18, 0x3da3d70a    # 0.08f

    .line 685
    .line 686
    .line 687
    const v13, 0x3e8a3d71    # 0.27f

    .line 688
    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const v15, 0x3f07ae14    # 0.53f

    .line 692
    .line 693
    .line 694
    const v16, 0x3cf5c28f    # 0.03f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, -0x401c28f6    # -1.78f

    .line 701
    .line 702
    .line 703
    const v18, 0x400b851f    # 2.18f

    .line 704
    .line 705
    .line 706
    const v13, -0x416147ae    # -0.31f

    .line 707
    .line 708
    .line 709
    const v14, 0x3f68f5c3    # 0.91f

    .line 710
    .line 711
    .line 712
    const v15, -0x408f5c29    # -0.94f

    .line 713
    .line 714
    .line 715
    const v16, 0x3fd851ec    # 1.69f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, -0x40eb851f    # -0.58f

    .line 722
    .line 723
    .line 724
    const v18, 0x3e8a3d71    # 0.27f

    .line 725
    .line 726
    .line 727
    const v13, -0x41d1eb85    # -0.17f

    .line 728
    .line 729
    .line 730
    const v14, 0x3dcccccd    # 0.1f

    .line 731
    .line 732
    .line 733
    const v15, -0x4147ae14    # -0.36f

    .line 734
    .line 735
    .line 736
    const v16, 0x3e3851ec    # 0.18f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x3f051eb8    # 0.52f

    .line 743
    .line 744
    .line 745
    const v2, -0x404f5c29    # -1.38f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v17, -0x40c7ae14    # -0.72f

    .line 752
    .line 753
    .line 754
    const v18, -0x406147ae    # -1.24f

    .line 755
    .line 756
    .line 757
    const v14, -0x41147ae1    # -0.46f

    .line 758
    .line 759
    .line 760
    const v15, -0x412e147b    # -0.41f

    .line 761
    .line 762
    .line 763
    const v16, -0x40a147ae    # -0.87f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3f90a3d7    # 1.13f

    .line 770
    .line 771
    .line 772
    const v2, -0x4099999a    # -0.9f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x4057ae14    # 3.37f

    .line 782
    .line 783
    .line 784
    const/high16 v2, 0x41400000    # 12.0f

    .line 785
    .line 786
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v17, 0x3f800000    # 1.0f

    .line 790
    .line 791
    const v18, 0x402851ec    # 2.63f

    .line 792
    .line 793
    .line 794
    const v13, 0x3f2147ae    # 0.63f

    .line 795
    .line 796
    .line 797
    const v14, 0x3f3851ec    # 0.72f

    .line 798
    .line 799
    .line 800
    const/high16 v15, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const v16, 0x3fd47ae1    # 1.66f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v17, -0x42b33333    # -0.05f

    .line 809
    .line 810
    .line 811
    const v18, 0x3f2147ae    # 0.63f

    .line 812
    .line 813
    .line 814
    const/4 v13, 0x0

    .line 815
    const v14, 0x3e428f5c    # 0.19f

    .line 816
    .line 817
    .line 818
    const v15, -0x435c28f6    # -0.02f

    .line 819
    .line 820
    .line 821
    const v16, 0x3ed1eb85    # 0.41f

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v0, 0x3fb851ec    # 1.44f

    .line 828
    .line 829
    .line 830
    const v2, -0x41947ae1    # -0.23f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v17, 0x41400000    # 12.0f

    .line 837
    .line 838
    const/high16 v18, 0x41000000    # 8.0f

    .line 839
    .line 840
    const v13, 0x4147ae14    # 12.48f

    .line 841
    .line 842
    .line 843
    const v14, 0x41007ae1    # 8.03f

    .line 844
    .line 845
    .line 846
    const v15, 0x4143d70a    # 12.24f

    .line 847
    .line 848
    .line 849
    const/high16 v16, 0x41000000    # 8.0f

    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, -0x40ca3d71    # -0.71f

    .line 855
    .line 856
    .line 857
    const v2, 0x3d8f5c29    # 0.07f

    .line 858
    .line 859
    .line 860
    const v4, -0x410a3d71    # -0.48f

    .line 861
    .line 862
    .line 863
    const v6, 0x3cf5c28f    # 0.03f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v0, -0x4047ae14    # -1.44f

    .line 870
    .line 871
    .line 872
    const v2, -0x41947ae1    # -0.23f

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v17, 0x41300000    # 11.0f

    .line 879
    .line 880
    const/high16 v18, 0x40c00000    # 6.0f

    .line 881
    .line 882
    const v13, 0x413051ec    # 11.02f

    .line 883
    .line 884
    .line 885
    const v14, 0x40cd1eb8    # 6.41f

    .line 886
    .line 887
    .line 888
    const/high16 v15, 0x41300000    # 11.0f

    .line 889
    .line 890
    const v16, 0x40c6147b    # 6.19f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v17, 0x3f800000    # 1.0f

    .line 897
    .line 898
    const v18, -0x3fd7ae14    # -2.63f

    .line 899
    .line 900
    .line 901
    const/4 v13, 0x0

    .line 902
    const v14, -0x40851eb8    # -0.98f

    .line 903
    .line 904
    .line 905
    const v15, 0x3ebd70a4    # 0.37f

    .line 906
    .line 907
    .line 908
    const v16, -0x400b851f    # -1.91f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v0, 0x409051ec    # 4.51f

    .line 918
    .line 919
    .line 920
    const v2, 0x40f5c28f    # 7.68f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v17, 0x3f4ccccd    # 0.8f

    .line 927
    .line 928
    .line 929
    const v18, -0x425c28f6    # -0.08f

    .line 930
    .line 931
    .line 932
    const v13, 0x3e851eb8    # 0.26f

    .line 933
    .line 934
    .line 935
    const v14, -0x428a3d71    # -0.06f

    .line 936
    .line 937
    .line 938
    const v15, 0x3f07ae14    # 0.53f

    .line 939
    .line 940
    .line 941
    const v16, -0x425c28f6    # -0.08f

    .line 942
    .line 943
    .line 944
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v17, 0x3ffeb852    # 1.99f

    .line 948
    .line 949
    .line 950
    const v18, 0x3f0a3d71    # 0.54f

    .line 951
    .line 952
    .line 953
    const v13, 0x3f30a3d7    # 0.69f

    .line 954
    .line 955
    .line 956
    const/4 v14, 0x0

    .line 957
    const v15, 0x3fb0a3d7    # 1.38f

    .line 958
    .line 959
    .line 960
    const v16, 0x3e3851ec    # 0.18f

    .line 961
    .line 962
    .line 963
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const v17, 0x3efae148    # 0.49f

    .line 967
    .line 968
    .line 969
    const v18, 0x3eb33333    # 0.35f

    .line 970
    .line 971
    .line 972
    const v13, 0x3e19999a    # 0.15f

    .line 973
    .line 974
    .line 975
    const v14, 0x3db851ec    # 0.09f

    .line 976
    .line 977
    .line 978
    const v15, 0x3ea3d70a    # 0.32f

    .line 979
    .line 980
    .line 981
    const v16, 0x3e4ccccd    # 0.2f

    .line 982
    .line 983
    .line 984
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const v0, 0x3f933333    # 1.15f

    .line 988
    .line 989
    .line 990
    const v2, 0x3f75c28f    # 0.96f

    .line 991
    .line 992
    .line 993
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, -0x40cccccd    # -0.7f

    .line 997
    .line 998
    .line 999
    const v18, 0x3f99999a    # 1.2f

    .line 1000
    .line 1001
    .line 1002
    const v13, -0x41666666    # -0.3f

    .line 1003
    .line 1004
    .line 1005
    const v14, 0x3eb851ec    # 0.36f

    .line 1006
    .line 1007
    .line 1008
    const v15, -0x40f851ec    # -0.53f

    .line 1009
    .line 1010
    .line 1011
    const v16, 0x3f428f5c    # 0.76f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v0, -0x40fae148    # -0.52f

    .line 1018
    .line 1019
    .line 1020
    const v2, -0x404f5c29    # -1.38f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const v17, -0x40f0a3d7    # -0.56f

    .line 1027
    .line 1028
    .line 1029
    const v18, -0x4175c28f    # -0.27f

    .line 1030
    .line 1031
    .line 1032
    const v13, -0x41a8f5c3    # -0.21f

    .line 1033
    .line 1034
    .line 1035
    const v14, -0x4247ae14    # -0.09f

    .line 1036
    .line 1037
    .line 1038
    const v15, -0x41333333    # -0.4f

    .line 1039
    .line 1040
    .line 1041
    const v16, -0x41c7ae14    # -0.18f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const v17, -0x401ae148    # -1.79f

    .line 1048
    .line 1049
    .line 1050
    const v18, -0x3ff47ae1    # -2.18f

    .line 1051
    .line 1052
    .line 1053
    const v13, -0x40a147ae    # -0.87f

    .line 1054
    .line 1055
    .line 1056
    const/high16 v14, -0x41000000    # -0.5f

    .line 1057
    .line 1058
    const v15, -0x404147ae    # -1.49f

    .line 1059
    .line 1060
    .line 1061
    const v16, -0x405d70a4    # -1.27f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v0, 0x40fae148    # 7.84f

    .line 1071
    .line 1072
    .line 1073
    const v2, 0x4177851f    # 15.47f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v17, -0x40f5c28f    # -0.54f

    .line 1080
    .line 1081
    .line 1082
    const v18, 0x3ebd70a4    # 0.37f

    .line 1083
    .line 1084
    .line 1085
    const v13, -0x41a8f5c3    # -0.21f

    .line 1086
    .line 1087
    .line 1088
    const v14, 0x3e2e147b    # 0.17f

    .line 1089
    .line 1090
    .line 1091
    const v15, -0x413d70a4    # -0.38f

    .line 1092
    .line 1093
    .line 1094
    const v16, 0x3e947ae1    # 0.29f

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const/high16 v17, -0x40000000    # -2.0f

    .line 1101
    .line 1102
    const v18, 0x3f0a3d71    # 0.54f

    .line 1103
    .line 1104
    .line 1105
    const v13, -0x40e3d70a    # -0.61f

    .line 1106
    .line 1107
    .line 1108
    const v14, 0x3eb33333    # 0.35f

    .line 1109
    .line 1110
    .line 1111
    const v15, -0x4059999a    # -1.3f

    .line 1112
    .line 1113
    .line 1114
    const v16, 0x3f0a3d71    # 0.54f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v17, -0x40b5c28f    # -0.79f

    .line 1121
    .line 1122
    .line 1123
    const v18, -0x425c28f6    # -0.08f

    .line 1124
    .line 1125
    .line 1126
    const v13, -0x4175c28f    # -0.27f

    .line 1127
    .line 1128
    .line 1129
    const/4 v14, 0x0

    .line 1130
    const v15, -0x40f851ec    # -0.53f

    .line 1131
    .line 1132
    .line 1133
    const v16, -0x430a3d71    # -0.03f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v17, 0x3fe3d70a    # 1.78f

    .line 1140
    .line 1141
    .line 1142
    const v18, -0x3ff47ae1    # -2.18f

    .line 1143
    .line 1144
    .line 1145
    const v13, 0x3e9eb852    # 0.31f

    .line 1146
    .line 1147
    .line 1148
    const v14, -0x40970a3d    # -0.91f

    .line 1149
    .line 1150
    .line 1151
    const v15, 0x3f70a3d7    # 0.94f

    .line 1152
    .line 1153
    .line 1154
    const v16, -0x4027ae14    # -1.69f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const v17, 0x3f147ae1    # 0.58f

    .line 1161
    .line 1162
    .line 1163
    const v18, -0x4175c28f    # -0.27f

    .line 1164
    .line 1165
    .line 1166
    const v13, 0x3e2e147b    # 0.17f

    .line 1167
    .line 1168
    .line 1169
    const v14, -0x42333333    # -0.1f

    .line 1170
    .line 1171
    .line 1172
    const v15, 0x3eb851ec    # 0.36f

    .line 1173
    .line 1174
    .line 1175
    const v16, -0x41c7ae14    # -0.18f

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const v0, 0x3fb0a3d7    # 1.38f

    .line 1182
    .line 1183
    .line 1184
    const v2, -0x40fae148    # -0.52f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v17, 0x3f3851ec    # 0.72f

    .line 1191
    .line 1192
    .line 1193
    const v18, 0x3f9eb852    # 1.24f

    .line 1194
    .line 1195
    .line 1196
    const v13, 0x3e23d70a    # 0.16f

    .line 1197
    .line 1198
    .line 1199
    const v14, 0x3eeb851f    # 0.46f

    .line 1200
    .line 1201
    .line 1202
    const v15, 0x3ed1eb85    # 0.41f

    .line 1203
    .line 1204
    .line 1205
    const v16, 0x3f6147ae    # 0.88f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v0, -0x406f5c29    # -1.13f

    .line 1212
    .line 1213
    .line 1214
    const v2, 0x3f666666    # 0.9f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    const v0, 0x41a50a3d    # 20.63f

    .line 1224
    .line 1225
    .line 1226
    const/high16 v2, 0x41400000    # 12.0f

    .line 1227
    .line 1228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    const/high16 v17, -0x40800000    # -1.0f

    .line 1232
    .line 1233
    const v18, -0x3fd7ae14    # -2.63f

    .line 1234
    .line 1235
    .line 1236
    const v13, -0x40deb852    # -0.63f

    .line 1237
    .line 1238
    .line 1239
    const v14, -0x40c7ae14    # -0.72f

    .line 1240
    .line 1241
    .line 1242
    const/high16 v15, -0x40800000    # -1.0f

    .line 1243
    .line 1244
    const v16, -0x402b851f    # -1.66f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v17, 0x3d75c28f    # 0.06f

    .line 1251
    .line 1252
    .line 1253
    const v18, -0x40d9999a    # -0.65f

    .line 1254
    .line 1255
    .line 1256
    const/4 v13, 0x0

    .line 1257
    const v14, -0x41b33333    # -0.2f

    .line 1258
    .line 1259
    .line 1260
    const v15, 0x3ca3d70a    # 0.02f

    .line 1261
    .line 1262
    .line 1263
    const v16, -0x412e147b    # -0.41f

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1267
    .line 1268
    .line 1269
    const v0, 0x3e6147ae    # 0.22f

    .line 1270
    .line 1271
    .line 1272
    const v2, -0x404a3d71    # -1.42f

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1276
    .line 1277
    .line 1278
    const v17, 0x3f3851ec    # 0.72f

    .line 1279
    .line 1280
    .line 1281
    const v18, 0x3d8f5c29    # 0.07f

    .line 1282
    .line 1283
    .line 1284
    const v13, 0x3e6b851f    # 0.23f

    .line 1285
    .line 1286
    .line 1287
    const v14, 0x3d23d70a    # 0.04f

    .line 1288
    .line 1289
    .line 1290
    const v15, 0x3ef0a3d7    # 0.47f

    .line 1291
    .line 1292
    .line 1293
    const v16, 0x3d8f5c29    # 0.07f

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1297
    .line 1298
    .line 1299
    const v17, 0x3f35c28f    # 0.71f

    .line 1300
    .line 1301
    .line 1302
    const v18, -0x4270a3d7    # -0.07f

    .line 1303
    .line 1304
    .line 1305
    const v13, 0x3e75c28f    # 0.24f

    .line 1306
    .line 1307
    .line 1308
    const/4 v14, 0x0

    .line 1309
    const v15, 0x3ef5c28f    # 0.48f

    .line 1310
    .line 1311
    .line 1312
    const v16, -0x430a3d71    # -0.03f

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1316
    .line 1317
    .line 1318
    const v0, 0x3e6b851f    # 0.23f

    .line 1319
    .line 1320
    .line 1321
    const v2, 0x3fb851ec    # 1.44f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v17, 0x3d75c28f    # 0.06f

    .line 1328
    .line 1329
    .line 1330
    const v18, 0x3f2147ae    # 0.63f

    .line 1331
    .line 1332
    .line 1333
    const v13, 0x3d23d70a    # 0.04f

    .line 1334
    .line 1335
    .line 1336
    const v14, 0x3e6147ae    # 0.22f

    .line 1337
    .line 1338
    .line 1339
    const v15, 0x3d75c28f    # 0.06f

    .line 1340
    .line 1341
    .line 1342
    const v16, 0x3ee147ae    # 0.44f

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    const/high16 v17, -0x40800000    # -1.0f

    .line 1349
    .line 1350
    const v18, 0x402851ec    # 2.63f

    .line 1351
    .line 1352
    .line 1353
    const/4 v13, 0x0

    .line 1354
    const v14, 0x3f7ae148    # 0.98f

    .line 1355
    .line 1356
    .line 1357
    const v15, -0x41428f5c    # -0.37f

    .line 1358
    .line 1359
    .line 1360
    const v16, 0x3ff47ae1    # 1.91f

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    const v0, 0x4195851f    # 18.69f

    .line 1370
    .line 1371
    .line 1372
    const v2, 0x41831eb8    # 16.39f

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1376
    .line 1377
    .line 1378
    const v17, -0x400147ae    # -1.99f

    .line 1379
    .line 1380
    .line 1381
    const v18, -0x40f5c28f    # -0.54f

    .line 1382
    .line 1383
    .line 1384
    const v13, -0x40cf5c29    # -0.69f

    .line 1385
    .line 1386
    .line 1387
    const/4 v14, 0x0

    .line 1388
    const v15, -0x404f5c29    # -1.38f

    .line 1389
    .line 1390
    .line 1391
    const v16, -0x41c7ae14    # -0.18f

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    .line 1397
    const v17, -0x41051eb8    # -0.49f

    .line 1398
    .line 1399
    .line 1400
    const v18, -0x4151eb85    # -0.34f

    .line 1401
    .line 1402
    .line 1403
    const v13, -0x41c7ae14    # -0.18f

    .line 1404
    .line 1405
    .line 1406
    const v14, -0x42333333    # -0.1f

    .line 1407
    .line 1408
    .line 1409
    const v15, -0x4151eb85    # -0.34f

    .line 1410
    .line 1411
    .line 1412
    const v16, -0x419eb852    # -0.22f

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1416
    .line 1417
    .line 1418
    const v0, -0x406ccccd    # -1.15f

    .line 1419
    .line 1420
    .line 1421
    const v2, -0x408a3d71    # -0.96f

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1425
    .line 1426
    .line 1427
    const v17, 0x3f333333    # 0.7f

    .line 1428
    .line 1429
    .line 1430
    const v18, -0x40651eb8    # -1.21f

    .line 1431
    .line 1432
    .line 1433
    const v13, 0x3e99999a    # 0.3f

    .line 1434
    .line 1435
    .line 1436
    const v14, -0x4147ae14    # -0.36f

    .line 1437
    .line 1438
    .line 1439
    const v15, 0x3f0a3d71    # 0.54f

    .line 1440
    .line 1441
    .line 1442
    const v16, -0x40bd70a4    # -0.76f

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1446
    .line 1447
    .line 1448
    const v0, 0x3fb0a3d7    # 1.38f

    .line 1449
    .line 1450
    .line 1451
    const v2, 0x3f051eb8    # 0.52f

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1455
    .line 1456
    .line 1457
    const v17, 0x3f11eb85    # 0.57f

    .line 1458
    .line 1459
    .line 1460
    const v18, 0x3e851eb8    # 0.26f

    .line 1461
    .line 1462
    .line 1463
    const v13, 0x3e6147ae    # 0.22f

    .line 1464
    .line 1465
    .line 1466
    const v14, 0x3da3d70a    # 0.08f

    .line 1467
    .line 1468
    .line 1469
    const v15, 0x3ed1eb85    # 0.41f

    .line 1470
    .line 1471
    .line 1472
    const v16, 0x3e2e147b    # 0.17f

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const v17, 0x3fe3d70a    # 1.78f

    .line 1479
    .line 1480
    .line 1481
    const v18, 0x400b851f    # 2.18f

    .line 1482
    .line 1483
    .line 1484
    const v13, 0x3f59999a    # 0.85f

    .line 1485
    .line 1486
    .line 1487
    const v14, 0x3efae148    # 0.49f

    .line 1488
    .line 1489
    .line 1490
    const v15, 0x3fbc28f6    # 1.47f

    .line 1491
    .line 1492
    .line 1493
    const v16, 0x3fa28f5c    # 1.27f

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1497
    .line 1498
    .line 1499
    const v17, -0x40b33333    # -0.8f

    .line 1500
    .line 1501
    .line 1502
    const v18, 0x3db851ec    # 0.09f

    .line 1503
    .line 1504
    .line 1505
    const v13, -0x4175c28f    # -0.27f

    .line 1506
    .line 1507
    .line 1508
    const v14, 0x3d8f5c29    # 0.07f

    .line 1509
    .line 1510
    .line 1511
    const v15, -0x40f5c28f    # -0.54f

    .line 1512
    .line 1513
    .line 1514
    const v16, 0x3db851ec    # 0.09f

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v2

    .line 1527
    const/16 v16, 0x3800

    .line 1528
    .line 1529
    const/16 v17, 0x0

    .line 1530
    .line 1531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1532
    .line 1533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1534
    .line 1535
    const/4 v7, 0x0

    .line 1536
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1537
    .line 1538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1539
    .line 1540
    const/4 v13, 0x0

    .line 1541
    const/4 v14, 0x0

    .line 1542
    const/4 v15, 0x0

    .line 1543
    const-string v4, ""

    .line 1544
    .line 1545
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    sput-object v0, Landroidx/compose/material/icons/outlined/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1554
    .line 1555
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1556
    .line 1557
    .line 1558
    return-object v0
.end method
