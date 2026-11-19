.class public final Landroidx/compose/material/icons/outlined/LocalFloristKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_localFlorist",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocalFlorist",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getLocalFlorist",
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
        "SMAP\nLocalFlorist.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/outlined/LocalFloristKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/outlined/LocalFloristKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n30#1:155,4\n*E\n"
    }
.end annotation


# static fields
.field private static _localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFlorist(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LocalFlorist"

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
    const v0, 0x41511eb8    # 13.07f

    .line 71
    .line 72
    .line 73
    const v2, 0x410a8f5c    # 8.66f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3edc28f6    # 0.43f

    .line 80
    .line 81
    .line 82
    const v18, -0x430a3d71    # -0.03f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e19999a    # 0.15f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, 0x3e947ae1    # 0.29f

    .line 90
    .line 91
    .line 92
    const v16, -0x43dc28f6    # -0.01f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/high16 v18, 0x41700000    # 15.0f

    .line 101
    .line 102
    const v13, 0x4118f5c3    # 9.56f

    .line 103
    .line 104
    .line 105
    const v14, 0x41630a3d    # 14.19f

    .line 106
    .line 107
    .line 108
    const v15, 0x412b0a3d    # 10.69f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x41700000    # 15.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x403a3d71    # 2.91f

    .line 117
    .line 118
    .line 119
    const v2, -0x40051eb8    # -1.96f

    .line 120
    .line 121
    .line 122
    const v4, -0x40b0a3d7    # -0.81f

    .line 123
    .line 124
    .line 125
    const v6, 0x401c28f6    # 2.44f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3edc28f6    # 0.43f

    .line 132
    .line 133
    .line 134
    const v18, 0x3cf5c28f    # 0.03f

    .line 135
    .line 136
    .line 137
    const v13, 0x3e0f5c29    # 0.14f

    .line 138
    .line 139
    .line 140
    const v14, 0x3ca3d70a    # 0.02f

    .line 141
    .line 142
    .line 143
    const v15, 0x3e947ae1    # 0.29f

    .line 144
    .line 145
    .line 146
    const v16, 0x3cf5c28f    # 0.03f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x4048f5c3    # 3.14f

    .line 153
    .line 154
    .line 155
    const v18, -0x3fb70a3d    # -3.14f

    .line 156
    .line 157
    .line 158
    const v13, 0x3fdd70a4    # 1.73f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const v15, 0x4048f5c3    # 3.14f

    .line 163
    .line 164
    .line 165
    const v16, -0x404b851f    # -1.41f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, -0x40d47ae1    # -0.67f

    .line 172
    .line 173
    .line 174
    const v18, -0x4008f5c3    # -1.93f

    .line 175
    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const v14, -0x40ca3d71    # -0.71f

    .line 179
    .line 180
    .line 181
    const/high16 v15, -0x41800000    # -0.25f

    .line 182
    .line 183
    const v16, -0x404e147b    # -1.39f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3f2b851f    # 0.67f

    .line 190
    .line 191
    .line 192
    const v13, 0x3edc28f6    # 0.43f

    .line 193
    .line 194
    .line 195
    const v14, -0x40f5c28f    # -0.54f

    .line 196
    .line 197
    .line 198
    const v15, 0x3f2b851f    # 0.67f

    .line 199
    .line 200
    .line 201
    const v16, -0x4063d70a    # -1.22f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x3fb70a3d    # -3.14f

    .line 208
    .line 209
    .line 210
    const v18, -0x3fb70a3d    # -3.14f

    .line 211
    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const v14, -0x40228f5c    # -1.73f

    .line 215
    .line 216
    .line 217
    const v15, -0x404b851f    # -1.41f

    .line 218
    .line 219
    .line 220
    const v16, -0x3fb70a3d    # -3.14f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x4123d70a    # -0.43f

    .line 227
    .line 228
    .line 229
    const v18, 0x3cf5c28f    # 0.03f

    .line 230
    .line 231
    .line 232
    const v13, -0x41e66666    # -0.15f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const v15, -0x416b851f    # -0.29f

    .line 237
    .line 238
    .line 239
    const v16, 0x3c23d70a    # 0.01f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, 0x41400000    # 12.0f

    .line 246
    .line 247
    const/high16 v18, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const v13, 0x41670a3d    # 14.44f

    .line 250
    .line 251
    .line 252
    const v14, 0x3fe7ae14    # 1.81f

    .line 253
    .line 254
    .line 255
    const v15, 0x4154f5c3    # 13.31f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x3f800000    # 1.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x3fc5c28f    # -2.91f

    .line 264
    .line 265
    .line 266
    const v2, 0x3ffae148    # 1.96f

    .line 267
    .line 268
    .line 269
    const v4, 0x3f4f5c29    # 0.81f

    .line 270
    .line 271
    .line 272
    const v6, -0x3fe3d70a    # -2.44f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x4123d70a    # -0.43f

    .line 279
    .line 280
    .line 281
    const v18, -0x430a3d71    # -0.03f

    .line 282
    .line 283
    .line 284
    const v13, -0x41f0a3d7    # -0.14f

    .line 285
    .line 286
    .line 287
    const v14, -0x435c28f6    # -0.02f

    .line 288
    .line 289
    .line 290
    const v15, -0x416b851f    # -0.29f

    .line 291
    .line 292
    .line 293
    const v16, -0x430a3d71    # -0.03f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x3fb70a3d    # -3.14f

    .line 300
    .line 301
    .line 302
    const v18, 0x4048f5c3    # 3.14f

    .line 303
    .line 304
    .line 305
    const v13, -0x40228f5c    # -1.73f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, -0x3fb70a3d    # -3.14f

    .line 310
    .line 311
    .line 312
    const v16, 0x3fb47ae1    # 1.41f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x3f2b851f    # 0.67f

    .line 319
    .line 320
    .line 321
    const v18, 0x3ff70a3d    # 1.93f

    .line 322
    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, 0x3f35c28f    # 0.71f

    .line 326
    .line 327
    .line 328
    const/high16 v15, 0x3e800000    # 0.25f

    .line 329
    .line 330
    const v16, 0x3fb1eb85    # 1.39f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, -0x40d1eb85    # -0.68f

    .line 337
    .line 338
    .line 339
    const v13, -0x4123d70a    # -0.43f

    .line 340
    .line 341
    .line 342
    const v14, 0x3f0a3d71    # 0.54f

    .line 343
    .line 344
    .line 345
    const v15, -0x40d1eb85    # -0.68f

    .line 346
    .line 347
    .line 348
    const v16, 0x3f9c28f6    # 1.22f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4049999a    # 3.15f

    .line 355
    .line 356
    .line 357
    const v18, 0x4048f5c3    # 3.14f

    .line 358
    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const v14, 0x3fdd70a4    # 1.73f

    .line 362
    .line 363
    .line 364
    const v15, 0x3fb47ae1    # 1.41f

    .line 365
    .line 366
    .line 367
    const v16, 0x4048f5c3    # 3.14f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41500000    # 13.0f

    .line 377
    .line 378
    const/high16 v2, 0x41400000    # 12.0f

    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, -0x406e147b    # -1.14f

    .line 384
    .line 385
    .line 386
    const v18, -0x40733333    # -1.1f

    .line 387
    .line 388
    .line 389
    const v13, -0x40e147ae    # -0.62f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const v15, -0x4070a3d7    # -1.12f

    .line 394
    .line 395
    .line 396
    const v16, -0x41051eb8    # -0.49f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3df5c28f    # 0.12f

    .line 403
    .line 404
    .line 405
    const v2, -0x40747ae1    # -1.09f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x3f828f5c    # 1.02f

    .line 412
    .line 413
    .line 414
    const v18, 0x3e428f5c    # 0.19f

    .line 415
    .line 416
    .line 417
    const v13, 0x3ea3d70a    # 0.32f

    .line 418
    .line 419
    .line 420
    const v14, 0x3df5c28f    # 0.12f

    .line 421
    .line 422
    .line 423
    const v15, 0x3f28f5c3    # 0.66f

    .line 424
    .line 425
    .line 426
    const v16, 0x3e428f5c    # 0.19f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3f83d70a    # 1.03f

    .line 433
    .line 434
    .line 435
    const v2, -0x41bd70a4    # -0.19f

    .line 436
    .line 437
    .line 438
    const v4, 0x3f35c28f    # 0.71f

    .line 439
    .line 440
    .line 441
    const v6, -0x4270a3d7    # -0.07f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x3de147ae    # 0.11f

    .line 448
    .line 449
    .line 450
    const v2, 0x3f8b851f    # 1.09f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, -0x406e147b    # -1.14f

    .line 457
    .line 458
    .line 459
    const v18, 0x3f8ccccd    # 1.1f

    .line 460
    .line 461
    .line 462
    const v13, -0x435c28f6    # -0.02f

    .line 463
    .line 464
    .line 465
    const v14, 0x3f1c28f6    # 0.61f

    .line 466
    .line 467
    .line 468
    const v15, -0x40fae148    # -0.52f

    .line 469
    .line 470
    .line 471
    const v16, 0x3f8ccccd    # 1.1f

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
    const v0, 0x417570a4    # 15.34f

    .line 481
    .line 482
    .line 483
    const v2, 0x41311eb8    # 11.07f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x40dc28f6    # -0.64f

    .line 490
    .line 491
    .line 492
    const v18, -0x41b33333    # -0.2f

    .line 493
    .line 494
    .line 495
    const v13, -0x418a3d71    # -0.24f

    .line 496
    .line 497
    .line 498
    const/4 v14, 0x0

    .line 499
    const v15, -0x41147ae1    # -0.46f

    .line 500
    .line 501
    .line 502
    const v16, -0x4270a3d7    # -0.07f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, -0x40ee147b    # -0.57f

    .line 509
    .line 510
    .line 511
    const v2, -0x40b0a3d7    # -0.81f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x3f87ae14    # 1.06f

    .line 518
    .line 519
    .line 520
    const v18, -0x4015c28f    # -1.83f

    .line 521
    .line 522
    .line 523
    const v13, 0x3f0ccccd    # 0.55f

    .line 524
    .line 525
    .line 526
    const v14, -0x4119999a    # -0.45f

    .line 527
    .line 528
    .line 529
    const v15, 0x3f70a3d7    # 0.94f

    .line 530
    .line 531
    .line 532
    const v16, -0x40747ae1    # -1.09f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x3ed70a3d    # 0.42f

    .line 539
    .line 540
    .line 541
    const v2, 0x3f6147ae    # 0.88f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x3f28f5c3    # 0.66f

    .line 548
    .line 549
    .line 550
    const v18, 0x3f83d70a    # 1.03f

    .line 551
    .line 552
    .line 553
    const v13, 0x3ecccccd    # 0.4f

    .line 554
    .line 555
    .line 556
    const v14, 0x3e428f5c    # 0.19f

    .line 557
    .line 558
    .line 559
    const v15, 0x3f28f5c3    # 0.66f

    .line 560
    .line 561
    .line 562
    const v16, 0x3f170a3d    # 0.59f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x406ccccd    # -1.15f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f933333    # 1.15f

    .line 572
    .line 573
    .line 574
    const/4 v13, 0x0

    .line 575
    const v14, 0x3f23d70a    # 0.64f

    .line 576
    .line 577
    .line 578
    const v15, -0x40fae148    # -0.52f

    .line 579
    .line 580
    .line 581
    const v16, 0x3f933333    # 1.15f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x416b0a3d    # 14.69f

    .line 591
    .line 592
    .line 593
    const v2, 0x40a428f6    # 5.13f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, 0x3f266666    # 0.65f

    .line 600
    .line 601
    .line 602
    const v18, -0x41b33333    # -0.2f

    .line 603
    .line 604
    .line 605
    const v13, 0x3e4ccccd    # 0.2f

    .line 606
    .line 607
    .line 608
    const v14, -0x41fae148    # -0.13f

    .line 609
    .line 610
    .line 611
    const v15, 0x3ed70a3d    # 0.42f

    .line 612
    .line 613
    .line 614
    const v16, -0x41b33333    # -0.2f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, 0x3f91eb85    # 1.14f

    .line 621
    .line 622
    .line 623
    const v18, 0x3f91eb85    # 1.14f

    .line 624
    .line 625
    .line 626
    const v13, 0x3f2147ae    # 0.63f

    .line 627
    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    const v15, 0x3f91eb85    # 1.14f

    .line 631
    .line 632
    .line 633
    const v16, 0x3f028f5c    # 0.51f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, -0x40d70a3d    # -0.66f

    .line 640
    .line 641
    .line 642
    const v18, 0x3f83d70a    # 1.03f

    .line 643
    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, 0x3ee147ae    # 0.44f

    .line 647
    .line 648
    .line 649
    const/high16 v15, -0x41800000    # -0.25f

    .line 650
    .line 651
    const v16, 0x3f547ae1    # 0.83f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x409eb852    # -0.88f

    .line 658
    .line 659
    .line 660
    const v2, 0x3ed70a3d    # 0.42f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v17, -0x40770a3d    # -1.07f

    .line 667
    .line 668
    .line 669
    const v18, -0x4015c28f    # -1.83f

    .line 670
    .line 671
    .line 672
    const v13, -0x420a3d71    # -0.12f

    .line 673
    .line 674
    .line 675
    const v14, -0x40c28f5c    # -0.74f

    .line 676
    .line 677
    .line 678
    const v15, -0x40fd70a4    # -0.51f

    .line 679
    .line 680
    .line 681
    const v16, -0x404f5c29    # -1.38f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x3f51eb85    # 0.82f

    .line 688
    .line 689
    .line 690
    const v2, -0x40f0a3d7    # -0.56f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, 0x40400000    # 3.0f

    .line 700
    .line 701
    const/high16 v2, 0x41400000    # 12.0f

    .line 702
    .line 703
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x3f91eb85    # 1.14f

    .line 707
    .line 708
    .line 709
    const v18, 0x3f8ccccd    # 1.1f

    .line 710
    .line 711
    .line 712
    const v13, 0x3f1eb852    # 0.62f

    .line 713
    .line 714
    .line 715
    const/4 v14, 0x0

    .line 716
    const v15, 0x3f8f5c29    # 1.12f

    .line 717
    .line 718
    .line 719
    const v16, 0x3efae148    # 0.49f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, -0x421eb852    # -0.11f

    .line 726
    .line 727
    .line 728
    const v2, 0x3f8b851f    # 1.09f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v17, 0x41400000    # 12.0f

    .line 735
    .line 736
    const/high16 v18, 0x40a00000    # 5.0f

    .line 737
    .line 738
    const v13, 0x414b5c29    # 12.71f

    .line 739
    .line 740
    .line 741
    const v14, 0x40a23d71    # 5.07f

    .line 742
    .line 743
    .line 744
    const v15, 0x4145c28f    # 12.36f

    .line 745
    .line 746
    .line 747
    const/high16 v16, 0x40a00000    # 5.0f

    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, -0x407d70a4    # -1.02f

    .line 753
    .line 754
    .line 755
    const v2, 0x3e428f5c    # 0.19f

    .line 756
    .line 757
    .line 758
    const v4, -0x40cccccd    # -0.7f

    .line 759
    .line 760
    .line 761
    const v6, 0x3d8f5c29    # 0.07f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v0, -0x420a3d71    # -0.12f

    .line 768
    .line 769
    .line 770
    const v2, -0x40747ae1    # -1.09f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v17, 0x3f91eb85    # 1.14f

    .line 777
    .line 778
    .line 779
    const v18, -0x40733333    # -1.1f

    .line 780
    .line 781
    .line 782
    const v13, 0x3ca3d70a    # 0.02f

    .line 783
    .line 784
    .line 785
    const v14, -0x40e3d70a    # -0.61f

    .line 786
    .line 787
    .line 788
    const v15, 0x3f051eb8    # 0.52f

    .line 789
    .line 790
    .line 791
    const v16, -0x40733333    # -1.1f

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x409dc28f    # 4.93f

    .line 801
    .line 802
    .line 803
    const v2, 0x410a8f5c    # 8.66f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, 0x3f23d70a    # 0.64f

    .line 810
    .line 811
    .line 812
    const v18, 0x3e4ccccd    # 0.2f

    .line 813
    .line 814
    .line 815
    const v13, 0x3e75c28f    # 0.24f

    .line 816
    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const v15, 0x3eeb851f    # 0.46f

    .line 820
    .line 821
    .line 822
    const v16, 0x3d8f5c29    # 0.07f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, 0x3f0f5c29    # 0.56f

    .line 829
    .line 830
    .line 831
    const v2, 0x3f4f5c29    # 0.81f

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v17, -0x407851ec    # -1.06f

    .line 838
    .line 839
    .line 840
    const v18, 0x3fea3d71    # 1.83f

    .line 841
    .line 842
    .line 843
    const v13, -0x40f33333    # -0.55f

    .line 844
    .line 845
    .line 846
    const v14, 0x3ee66666    # 0.45f

    .line 847
    .line 848
    .line 849
    const v15, -0x408f5c29    # -0.94f

    .line 850
    .line 851
    .line 852
    const v16, 0x3f8b851f    # 1.09f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, -0x4128f5c3    # -0.42f

    .line 859
    .line 860
    .line 861
    const v2, -0x409eb852    # -0.88f

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v17, -0x40d70a3d    # -0.66f

    .line 868
    .line 869
    .line 870
    const v18, -0x407c28f6    # -1.03f

    .line 871
    .line 872
    .line 873
    const v13, -0x41333333    # -0.4f

    .line 874
    .line 875
    .line 876
    const v14, -0x41b33333    # -0.2f

    .line 877
    .line 878
    .line 879
    const v15, -0x40d70a3d    # -0.66f

    .line 880
    .line 881
    .line 882
    const v16, -0x40e8f5c3    # -0.59f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v17, 0x3f933333    # 1.15f

    .line 889
    .line 890
    .line 891
    const v18, -0x406e147b    # -1.14f

    .line 892
    .line 893
    .line 894
    const/4 v13, 0x0

    .line 895
    const v14, -0x40deb852    # -0.63f

    .line 896
    .line 897
    .line 898
    const v15, 0x3f051eb8    # 0.52f

    .line 899
    .line 900
    .line 901
    const v16, -0x406e147b    # -1.14f

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v0, 0x4102b852    # 8.17f

    .line 911
    .line 912
    .line 913
    const v2, 0x410e6666    # 8.9f

    .line 914
    .line 915
    .line 916
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const v0, -0x4128f5c3    # -0.42f

    .line 920
    .line 921
    .line 922
    const v2, 0x3f6147ae    # 0.88f

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v17, 0x3f88f5c3    # 1.07f

    .line 929
    .line 930
    .line 931
    const v18, 0x3fea3d71    # 1.83f

    .line 932
    .line 933
    .line 934
    const v13, 0x3df5c28f    # 0.12f

    .line 935
    .line 936
    .line 937
    const v14, 0x3f3d70a4    # 0.74f

    .line 938
    .line 939
    .line 940
    const v15, 0x3f028f5c    # 0.51f

    .line 941
    .line 942
    .line 943
    const v16, 0x3fb0a3d7    # 1.38f

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v0, 0x3f0ccccd    # 0.55f

    .line 950
    .line 951
    .line 952
    const v2, -0x40b0a3d7    # -0.81f

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v17, -0x40d9999a    # -0.65f

    .line 959
    .line 960
    .line 961
    const v18, 0x3e4ccccd    # 0.2f

    .line 962
    .line 963
    .line 964
    const v13, -0x41b33333    # -0.2f

    .line 965
    .line 966
    .line 967
    const v14, 0x3e051eb8    # 0.13f

    .line 968
    .line 969
    .line 970
    const v15, -0x4128f5c3    # -0.42f

    .line 971
    .line 972
    .line 973
    const v16, 0x3e4ccccd    # 0.2f

    .line 974
    .line 975
    .line 976
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const v17, -0x406e147b    # -1.14f

    .line 980
    .line 981
    .line 982
    const v18, -0x406e147b    # -1.14f

    .line 983
    .line 984
    .line 985
    const v13, -0x40deb852    # -0.63f

    .line 986
    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    const v15, -0x406e147b    # -1.14f

    .line 990
    .line 991
    .line 992
    const v16, -0x40fd70a4    # -0.51f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v17, 0x3f266666    # 0.65f

    .line 999
    .line 1000
    .line 1001
    const v18, -0x407d70a4    # -1.02f

    .line 1002
    .line 1003
    .line 1004
    const v13, -0x43dc28f6    # -0.01f

    .line 1005
    .line 1006
    .line 1007
    const v14, -0x4123d70a    # -0.43f

    .line 1008
    .line 1009
    .line 1010
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1011
    .line 1012
    const v16, -0x40ae147b    # -0.82f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const/high16 v0, 0x41b00000    # 22.0f

    .line 1022
    .line 1023
    const/high16 v2, 0x41400000    # 12.0f

    .line 1024
    .line 1025
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    .line 1028
    const/high16 v17, 0x41100000    # 9.0f

    .line 1029
    .line 1030
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 1031
    .line 1032
    const v13, 0x409f0a3d    # 4.97f

    .line 1033
    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    const/high16 v15, 0x41100000    # 9.0f

    .line 1037
    .line 1038
    const v16, -0x3f7f0a3d    # -4.03f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 1045
    .line 1046
    const/high16 v18, 0x41100000    # 9.0f

    .line 1047
    .line 1048
    const v13, -0x3f60f5c3    # -4.97f

    .line 1049
    .line 1050
    .line 1051
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 1052
    .line 1053
    const v16, 0x4080f5c3    # 4.03f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1060
    .line 1061
    .line 1062
    const v0, 0x41670a3d    # 14.44f

    .line 1063
    .line 1064
    .line 1065
    const v2, 0x419c7ae1    # 19.56f

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const v17, 0x4083d70a    # 4.12f

    .line 1072
    .line 1073
    .line 1074
    const v18, -0x3f7c28f6    # -4.12f

    .line 1075
    .line 1076
    .line 1077
    const v13, 0x3f35c28f    # 0.71f

    .line 1078
    .line 1079
    .line 1080
    const v14, -0x400ccccd    # -1.9f

    .line 1081
    .line 1082
    .line 1083
    const v15, 0x400e147b    # 2.22f

    .line 1084
    .line 1085
    .line 1086
    const v16, -0x3fa51eb8    # -3.42f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v17, -0x3f7c28f6    # -4.12f

    .line 1093
    .line 1094
    .line 1095
    const v18, 0x4083d70a    # 4.12f

    .line 1096
    .line 1097
    .line 1098
    const v13, -0x40ca3d71    # -0.71f

    .line 1099
    .line 1100
    .line 1101
    const v14, 0x3ff33333    # 1.9f

    .line 1102
    .line 1103
    .line 1104
    const v15, -0x3ff1eb85    # -2.22f

    .line 1105
    .line 1106
    .line 1107
    const v16, 0x405a3d71    # 3.41f

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    const/high16 v0, 0x40400000    # 3.0f

    .line 1117
    .line 1118
    const/high16 v2, 0x41500000    # 13.0f

    .line 1119
    .line 1120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/high16 v17, 0x41100000    # 9.0f

    .line 1124
    .line 1125
    const/high16 v18, 0x41100000    # 9.0f

    .line 1126
    .line 1127
    const/4 v13, 0x0

    .line 1128
    const v14, 0x409f0a3d    # 4.97f

    .line 1129
    .line 1130
    .line 1131
    const v15, 0x4080f5c3    # 4.03f

    .line 1132
    .line 1133
    .line 1134
    const/high16 v16, 0x41100000    # 9.0f

    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 1140
    .line 1141
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 1142
    .line 1143
    const v14, -0x3f60f5c3    # -4.97f

    .line 1144
    .line 1145
    .line 1146
    const v15, -0x3f7f0a3d    # -4.03f

    .line 1147
    .line 1148
    .line 1149
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 1150
    .line 1151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    const v0, 0x40ae147b    # 5.44f

    .line 1158
    .line 1159
    .line 1160
    const v2, 0x41770a3d    # 15.44f

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const v17, 0x4083d70a    # 4.12f

    .line 1167
    .line 1168
    .line 1169
    const v18, 0x4083d70a    # 4.12f

    .line 1170
    .line 1171
    .line 1172
    const v13, 0x3ff33333    # 1.9f

    .line 1173
    .line 1174
    .line 1175
    const v14, 0x3f35c28f    # 0.71f

    .line 1176
    .line 1177
    .line 1178
    const v15, 0x405ae148    # 3.42f

    .line 1179
    .line 1180
    .line 1181
    const v16, 0x400e147b    # 2.22f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v17, -0x3f7c28f6    # -4.12f

    .line 1188
    .line 1189
    .line 1190
    const v18, -0x3f7c28f6    # -4.12f

    .line 1191
    .line 1192
    .line 1193
    const v13, -0x400ccccd    # -1.9f

    .line 1194
    .line 1195
    .line 1196
    const v14, -0x40ca3d71    # -0.71f

    .line 1197
    .line 1198
    .line 1199
    const v15, -0x3fa5c28f    # -3.41f

    .line 1200
    .line 1201
    .line 1202
    const v16, -0x3ff1eb85    # -2.22f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v2

    .line 1215
    const/16 v16, 0x3800

    .line 1216
    .line 1217
    const/16 v17, 0x0

    .line 1218
    .line 1219
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1220
    .line 1221
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1222
    .line 1223
    const/4 v7, 0x0

    .line 1224
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1225
    .line 1226
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1227
    .line 1228
    const/4 v13, 0x0

    .line 1229
    const/4 v14, 0x0

    .line 1230
    const/4 v15, 0x0

    .line 1231
    const-string v4, ""

    .line 1232
    .line 1233
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    sput-object v0, Landroidx/compose/material/icons/outlined/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1242
    .line 1243
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1244
    .line 1245
    .line 1246
    return-object v0
.end method
