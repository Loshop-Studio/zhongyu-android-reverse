.class public final Landroidx/compose/material/icons/filled/StormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_storm",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Storm",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getStorm",
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
        "SMAP\nStorm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storm.kt\nandroidx/compose/material/icons/filled/StormKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 Storm.kt\nandroidx/compose/material/icons/filled/StormKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _storm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStorm(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/StormKt;->_storm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Storm"

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
    const v0, 0x419770a4    # 18.93f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x41000000    # 8.0f

    .line 79
    .line 80
    const v18, 0x40a23d71    # 5.07f

    .line 81
    .line 82
    .line 83
    const v13, 0x4185c28f    # 16.72f

    .line 84
    .line 85
    .line 86
    const v14, 0x4085c28f    # 4.18f

    .line 87
    .line 88
    .line 89
    const v15, 0x413d1eb8    # 11.82f

    .line 90
    .line 91
    .line 92
    const v16, 0x4037ae14    # 2.87f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3fb5c28f    # -3.16f

    .line 99
    .line 100
    .line 101
    const v18, 0x4057ae14    # 3.37f

    .line 102
    .line 103
    .line 104
    const v13, -0x404b851f    # -1.41f

    .line 105
    .line 106
    .line 107
    const v14, 0x3f51eb85    # 0.82f

    .line 108
    .line 109
    .line 110
    const v15, -0x3fe147ae    # -2.48f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x40bb851f    # 5.86f

    .line 119
    .line 120
    .line 121
    const/high16 v18, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v13, 0x4096b852    # 4.71f

    .line 124
    .line 125
    .line 126
    const v14, 0x40c7ae14    # 6.24f

    .line 127
    .line 128
    .line 129
    const v15, 0x40a1eb85    # 5.06f

    .line 130
    .line 131
    .line 132
    const v16, 0x408147ae    # 4.04f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x406f5c29    # 3.74f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x40a23d71    # 5.07f

    .line 145
    .line 146
    .line 147
    const/high16 v18, 0x41800000    # 16.0f

    .line 148
    .line 149
    const v13, 0x400ccccd    # 2.2f

    .line 150
    .line 151
    .line 152
    const v14, 0x40cfae14    # 6.49f

    .line 153
    .line 154
    .line 155
    const v15, 0x402147ae    # 2.52f

    .line 156
    .line 157
    .line 158
    const v16, 0x413947ae    # 11.58f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x409b851f    # 4.86f

    .line 165
    .line 166
    .line 167
    const v18, 0x406e147b    # 3.72f

    .line 168
    .line 169
    .line 170
    const v13, 0x3f8ccccd    # 1.1f

    .line 171
    .line 172
    .line 173
    const v14, 0x3ff47ae1    # 1.91f

    .line 174
    .line 175
    .line 176
    const v15, 0x403851ec    # 2.88f

    .line 177
    .line 178
    .line 179
    const v16, 0x404c28f6    # 3.19f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, 0x40c23d71    # 6.07f

    .line 186
    .line 187
    .line 188
    const v18, -0x40b5c28f    # -0.79f

    .line 189
    .line 190
    .line 191
    const v13, 0x3ffd70a4    # 1.98f

    .line 192
    .line 193
    .line 194
    const v14, 0x3f07ae14    # 0.53f

    .line 195
    .line 196
    .line 197
    const v15, 0x40851eb8    # 4.16f

    .line 198
    .line 199
    .line 200
    const v16, 0x3e9eb852    # 0.31f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x404a3d71    # 3.16f

    .line 207
    .line 208
    .line 209
    const v18, -0x3fa851ec    # -3.37f

    .line 210
    .line 211
    .line 212
    const v13, 0x3fb47ae1    # 1.41f

    .line 213
    .line 214
    .line 215
    const v14, -0x40ae147b    # -0.82f

    .line 216
    .line 217
    .line 218
    const v15, 0x401eb852    # 2.48f

    .line 219
    .line 220
    .line 221
    const/high16 v16, -0x40000000    # -2.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x407eb852    # -1.01f

    .line 227
    .line 228
    .line 229
    const v18, 0x40ce147b    # 6.44f

    .line 230
    .line 231
    .line 232
    const v13, 0x3e051eb8    # 0.13f

    .line 233
    .line 234
    .line 235
    const v14, 0x400ccccd    # 2.2f

    .line 236
    .line 237
    .line 238
    const v15, -0x41a8f5c3    # -0.21f

    .line 239
    .line 240
    .line 241
    const v16, 0x408ccccd    # 4.4f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x40070a3d    # 2.11f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x419770a4    # 18.93f

    .line 254
    .line 255
    .line 256
    const/high16 v18, 0x41000000    # 8.0f

    .line 257
    .line 258
    const v13, 0x41ae51ec    # 21.79f

    .line 259
    .line 260
    .line 261
    const v14, 0x418c147b    # 17.51f

    .line 262
    .line 263
    .line 264
    const v15, 0x41abd70a    # 21.48f

    .line 265
    .line 266
    .line 267
    const v16, 0x4146b852    # 12.42f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41700000    # 15.0f

    .line 277
    .line 278
    const v2, 0x4189999a    # 17.2f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x3efccccd    # -8.2f

    .line 285
    .line 286
    .line 287
    const v18, -0x3ff33333    # -2.2f

    .line 288
    .line 289
    .line 290
    const v13, -0x3fc851ec    # -2.87f

    .line 291
    .line 292
    .line 293
    const v14, 0x3fd33333    # 1.65f

    .line 294
    .line 295
    .line 296
    const v15, -0x3f2eb852    # -6.54f

    .line 297
    .line 298
    .line 299
    const v16, 0x3f2b851f    # 0.67f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x41666666    # -0.3f

    .line 306
    .line 307
    .line 308
    const v18, -0x40e66666    # -0.6f

    .line 309
    .line 310
    .line 311
    const v13, -0x421eb852    # -0.11f

    .line 312
    .line 313
    .line 314
    const v14, -0x41b33333    # -0.2f

    .line 315
    .line 316
    .line 317
    const v15, -0x41a8f5c3    # -0.21f

    .line 318
    .line 319
    .line 320
    const v16, -0x41333333    # -0.4f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x41100000    # 9.0f

    .line 327
    .line 328
    const v18, 0x40d9999a    # 6.8f

    .line 329
    .line 330
    .line 331
    const v13, 0x40a9999a    # 5.3f

    .line 332
    .line 333
    .line 334
    const v14, 0x413a3d71    # 11.64f

    .line 335
    .line 336
    .line 337
    const v15, 0x40ca8f5c    # 6.33f

    .line 338
    .line 339
    .line 340
    const v16, 0x410570a4    # 8.34f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x41033333    # 8.2f

    .line 347
    .line 348
    .line 349
    const v18, 0x400ccccd    # 2.2f

    .line 350
    .line 351
    .line 352
    const v13, 0x40370a3d    # 2.86f

    .line 353
    .line 354
    .line 355
    const v14, -0x402ccccd    # -1.65f

    .line 356
    .line 357
    .line 358
    const v15, 0x40d147ae    # 6.54f

    .line 359
    .line 360
    .line 361
    const v16, -0x40d47ae1    # -0.67f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x3e99999a    # 0.3f

    .line 368
    .line 369
    .line 370
    const v18, 0x3f19999a    # 0.6f

    .line 371
    .line 372
    .line 373
    const v13, 0x3de147ae    # 0.11f

    .line 374
    .line 375
    .line 376
    const v14, 0x3e4ccccd    # 0.2f

    .line 377
    .line 378
    .line 379
    const v15, 0x3e570a3d    # 0.21f

    .line 380
    .line 381
    .line 382
    const v16, 0x3ecccccd    # 0.4f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x41700000    # 15.0f

    .line 389
    .line 390
    const v18, 0x4189999a    # 17.2f

    .line 391
    .line 392
    .line 393
    const v13, 0x4195999a    # 18.7f

    .line 394
    .line 395
    .line 396
    const v14, 0x4145c28f    # 12.36f

    .line 397
    .line 398
    .line 399
    const v15, 0x418d5c29    # 17.67f

    .line 400
    .line 401
    .line 402
    const v16, 0x417a8f5c    # 15.66f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x41200000    # 10.0f

    .line 412
    .line 413
    const/high16 v2, 0x41400000    # 12.0f

    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, 0x40000000    # 2.0f

    .line 419
    .line 420
    const/high16 v18, 0x40000000    # 2.0f

    .line 421
    .line 422
    const v13, 0x3f8ccccd    # 1.1f

    .line 423
    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const/high16 v15, 0x40000000    # 2.0f

    .line 427
    .line 428
    const v16, 0x3f666666    # 0.9f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40000000    # 2.0f

    .line 435
    .line 436
    const v2, -0x4099999a    # -0.9f

    .line 437
    .line 438
    .line 439
    const/high16 v4, -0x40000000    # -2.0f

    .line 440
    .line 441
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x4099999a    # -0.9f

    .line 445
    .line 446
    .line 447
    const/high16 v2, -0x40000000    # -2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x412e6666    # 10.9f

    .line 453
    .line 454
    .line 455
    const/high16 v2, 0x41200000    # 10.0f

    .line 456
    .line 457
    const/high16 v4, 0x41400000    # 12.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41400000    # 12.0f

    .line 463
    .line 464
    const/high16 v2, 0x41000000    # 8.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x3f800000    # -4.0f

    .line 470
    .line 471
    const/high16 v18, 0x40800000    # 4.0f

    .line 472
    .line 473
    const v13, -0x3ff28f5c    # -2.21f

    .line 474
    .line 475
    .line 476
    const/high16 v15, -0x3f800000    # -4.0f

    .line 477
    .line 478
    const v16, 0x3fe51eb8    # 1.79f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x3fe51eb8    # 1.79f

    .line 485
    .line 486
    .line 487
    const/high16 v2, 0x40800000    # 4.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x401ae148    # -1.79f

    .line 493
    .line 494
    .line 495
    const/high16 v2, -0x3f800000    # -4.0f

    .line 496
    .line 497
    const/high16 v4, 0x40800000    # 4.0f

    .line 498
    .line 499
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x41635c29    # 14.21f

    .line 503
    .line 504
    .line 505
    const/high16 v2, 0x41400000    # 12.0f

    .line 506
    .line 507
    const/high16 v4, 0x41000000    # 8.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/16 v16, 0x3800

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v8, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/high16 v9, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v12, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const/4 v15, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sput-object v0, Landroidx/compose/material/icons/filled/StormKt;->_storm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    return-object v0
.end method
