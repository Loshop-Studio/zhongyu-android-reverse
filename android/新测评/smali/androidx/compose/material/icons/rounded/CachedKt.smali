.class public final Landroidx/compose/material/icons/rounded/CachedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cached",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cached",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCached",
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
        "SMAP\nCached.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cached.kt\nandroidx/compose/material/icons/rounded/CachedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 Cached.kt\nandroidx/compose/material/icons/rounded/CachedKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cached:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCached(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CachedKt;->_cached:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cached"

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
    const v0, 0x41953333    # 18.65f

    .line 71
    .line 72
    .line 73
    const v2, 0x4105999a    # 8.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40328f5c    # 2.79f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fcd70a4    # -2.79f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3eb33333    # 0.35f

    .line 89
    .line 90
    .line 91
    const v18, 0x3f5c28f6    # 0.86f

    .line 92
    .line 93
    .line 94
    const v13, -0x415c28f6    # -0.32f

    .line 95
    .line 96
    .line 97
    const v14, 0x3ea3d70a    # 0.32f

    .line 98
    .line 99
    .line 100
    const v15, -0x42333333    # -0.1f

    .line 101
    .line 102
    .line 103
    const v16, 0x3f5c28f6    # 0.86f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x41900000    # 18.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, -0x3f400000    # -6.0f

    .line 115
    .line 116
    const/high16 v18, 0x40c00000    # 6.0f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, 0x4053d70a    # 3.31f

    .line 120
    .line 121
    .line 122
    const v15, -0x3fd3d70a    # -2.69f

    .line 123
    .line 124
    .line 125
    const/high16 v16, 0x40c00000    # 6.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 131
    .line 132
    const v18, -0x411eb852    # -0.44f

    .line 133
    .line 134
    .line 135
    const v13, -0x40b5c28f    # -0.79f

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const v15, -0x403851ec    # -1.56f

    .line 140
    .line 141
    .line 142
    const v16, -0x41e66666    # -0.15f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x407ae148    # -1.04f

    .line 149
    .line 150
    .line 151
    const v18, 0x3e6b851f    # 0.23f

    .line 152
    .line 153
    .line 154
    const v13, -0x4147ae14    # -0.36f

    .line 155
    .line 156
    .line 157
    const v14, -0x41e66666    # -0.15f

    .line 158
    .line 159
    .line 160
    const v15, -0x40bae148    # -0.77f

    .line 161
    .line 162
    .line 163
    const v16, -0x42dc28f6    # -0.04f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x3eae147b    # 0.34f

    .line 170
    .line 171
    .line 172
    const v18, 0x3fd1eb85    # 1.64f

    .line 173
    .line 174
    .line 175
    const v13, -0x40fd70a4    # -0.51f

    .line 176
    .line 177
    .line 178
    const v14, 0x3f028f5c    # 0.51f

    .line 179
    .line 180
    .line 181
    const v15, -0x41570a3d    # -0.33f

    .line 182
    .line 183
    .line 184
    const v16, 0x3faf5c29    # 1.37f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x403ccccd    # 2.95f

    .line 191
    .line 192
    .line 193
    const v18, 0x3f11eb85    # 0.57f

    .line 194
    .line 195
    .line 196
    const v13, 0x3f68f5c3    # 0.91f

    .line 197
    .line 198
    .line 199
    const v14, 0x3ebd70a4    # 0.37f

    .line 200
    .line 201
    .line 202
    const v15, 0x3ff47ae1    # 1.91f

    .line 203
    .line 204
    .line 205
    const v16, 0x3f11eb85    # 0.57f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x41000000    # 8.0f

    .line 212
    .line 213
    const/high16 v18, -0x3f000000    # -8.0f

    .line 214
    .line 215
    const v13, 0x408d70a4    # 4.42f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, 0x41000000    # 8.0f

    .line 220
    .line 221
    const v16, -0x3f9ae148    # -3.58f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x3fe51eb8    # 1.79f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x3eb33333    # 0.35f

    .line 234
    .line 235
    .line 236
    const v18, -0x40a66666    # -0.85f

    .line 237
    .line 238
    .line 239
    const v13, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f2b851f    # 0.67f

    .line 243
    .line 244
    .line 245
    const v16, -0x40f5c28f    # -0.54f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x3fcd70a4    # -2.79f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x40cccccd    # -0.7f

    .line 258
    .line 259
    .line 260
    const v18, -0x43dc28f6    # -0.01f

    .line 261
    .line 262
    .line 263
    const v13, -0x41bd70a4    # -0.19f

    .line 264
    .line 265
    .line 266
    const v14, -0x41b33333    # -0.2f

    .line 267
    .line 268
    .line 269
    const v15, -0x40fd70a4    # -0.51f

    .line 270
    .line 271
    .line 272
    const v16, -0x41b33333    # -0.2f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41400000    # 12.0f

    .line 282
    .line 283
    const/high16 v2, 0x40c00000    # 6.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x40c00000    # 6.0f

    .line 289
    .line 290
    const/high16 v18, -0x3f400000    # -6.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x3fac28f6    # -3.31f

    .line 294
    .line 295
    .line 296
    const v15, 0x402c28f6    # 2.69f

    .line 297
    .line 298
    .line 299
    const/high16 v16, -0x3f400000    # -6.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x40100000    # 2.25f

    .line 305
    .line 306
    const v18, 0x3ee147ae    # 0.44f

    .line 307
    .line 308
    .line 309
    const v13, 0x3f4a3d71    # 0.79f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const v15, 0x3fc7ae14    # 1.56f

    .line 314
    .line 315
    .line 316
    const v16, 0x3e19999a    # 0.15f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3f851eb8    # 1.04f

    .line 323
    .line 324
    .line 325
    const v18, -0x41947ae1    # -0.23f

    .line 326
    .line 327
    .line 328
    const v13, 0x3eb851ec    # 0.36f

    .line 329
    .line 330
    .line 331
    const v14, 0x3e19999a    # 0.15f

    .line 332
    .line 333
    .line 334
    const v15, 0x3f451eb8    # 0.77f

    .line 335
    .line 336
    .line 337
    const v16, 0x3d23d70a    # 0.04f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x4151eb85    # -0.34f

    .line 344
    .line 345
    .line 346
    const v18, -0x402e147b    # -1.64f

    .line 347
    .line 348
    .line 349
    const v13, 0x3f028f5c    # 0.51f

    .line 350
    .line 351
    .line 352
    const v14, -0x40fd70a4    # -0.51f

    .line 353
    .line 354
    .line 355
    const v15, 0x3ea8f5c3    # 0.33f

    .line 356
    .line 357
    .line 358
    const v16, -0x4050a3d7    # -1.37f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41400000    # 12.0f

    .line 365
    .line 366
    const/high16 v18, 0x40800000    # 4.0f

    .line 367
    .line 368
    const v13, 0x4160a3d7    # 14.04f

    .line 369
    .line 370
    .line 371
    const v14, 0x40866666    # 4.2f

    .line 372
    .line 373
    .line 374
    const v15, 0x4150a3d7    # 13.04f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x40800000    # 4.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, -0x3f000000    # -8.0f

    .line 383
    .line 384
    const/high16 v18, 0x41000000    # 8.0f

    .line 385
    .line 386
    const v13, -0x3f728f5c    # -4.42f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const/high16 v15, -0x3f000000    # -8.0f

    .line 391
    .line 392
    const v16, 0x40651eb8    # 3.58f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x400d70a4    # 2.21f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x414ccccd    # -0.35f

    .line 405
    .line 406
    .line 407
    const v18, 0x3f59999a    # 0.85f

    .line 408
    .line 409
    .line 410
    const v13, -0x4119999a    # -0.45f

    .line 411
    .line 412
    .line 413
    const v15, -0x40d47ae1    # -0.67f

    .line 414
    .line 415
    .line 416
    const v16, 0x3f0a3d71    # 0.54f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40328f5c    # 2.79f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x3f35c28f    # 0.71f

    .line 429
    .line 430
    .line 431
    const/16 v18, 0x0

    .line 432
    .line 433
    const v13, 0x3e4ccccd    # 0.2f

    .line 434
    .line 435
    .line 436
    const v14, 0x3e4ccccd    # 0.2f

    .line 437
    .line 438
    .line 439
    const v15, 0x3f028f5c    # 0.51f

    .line 440
    .line 441
    .line 442
    const v16, 0x3e4ccccd    # 0.2f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v2, -0x3fcd70a4    # -2.79f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x4147ae14    # -0.36f

    .line 455
    .line 456
    .line 457
    const v18, -0x40a66666    # -0.85f

    .line 458
    .line 459
    .line 460
    const v13, 0x3e9eb852    # 0.31f

    .line 461
    .line 462
    .line 463
    const v14, -0x416147ae    # -0.31f

    .line 464
    .line 465
    .line 466
    const v15, 0x3db851ec    # 0.09f

    .line 467
    .line 468
    .line 469
    const v16, -0x40a66666    # -0.85f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40c00000    # 6.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/rounded/CachedKt;->_cached:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method
