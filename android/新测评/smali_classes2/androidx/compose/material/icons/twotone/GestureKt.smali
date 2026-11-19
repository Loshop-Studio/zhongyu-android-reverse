.class public final Landroidx/compose/material/icons/twotone/GestureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_gesture",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Gesture",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getGesture",
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
        "SMAP\nGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gesture.kt\nandroidx/compose/material/icons/twotone/GestureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 Gesture.kt\nandroidx/compose/material/icons/twotone/GestureKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _gesture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGesture(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GestureKt;->_gesture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Gesture"

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
    const v0, 0x4092e148    # 4.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x40dc7ae1    # 6.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fdae148    # 1.71f

    .line 80
    .line 81
    .line 82
    const v18, -0x4063d70a    # -1.22f

    .line 83
    .line 84
    .line 85
    const v13, 0x3f333333    # 0.7f

    .line 86
    .line 87
    .line 88
    const v14, -0x40ca3d71    # -0.71f

    .line 89
    .line 90
    .line 91
    const v15, 0x3fb33333    # 1.4f

    .line 92
    .line 93
    .line 94
    const v16, -0x40533333    # -1.35f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x41666666    # -0.3f

    .line 101
    .line 102
    .line 103
    const v18, 0x3fc28f5c    # 1.52f

    .line 104
    .line 105
    .line 106
    const/high16 v13, 0x3f000000    # 0.5f

    .line 107
    .line 108
    const v14, 0x3e4ccccd    # 0.2f

    .line 109
    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    const v16, 0x3f83d70a    # 1.03f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3fc8f5c3    # -2.86f

    .line 119
    .line 120
    .line 121
    const v18, 0x40c9eb85    # 6.31f

    .line 122
    .line 123
    .line 124
    const/high16 v13, -0x41800000    # -0.25f

    .line 125
    .line 126
    const v14, 0x3ed70a3d    # 0.42f

    .line 127
    .line 128
    .line 129
    const v15, -0x3fc8f5c3    # -2.86f

    .line 130
    .line 131
    .line 132
    const v16, 0x4078f5c3    # 3.89f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3fab851f    # 1.34f

    .line 139
    .line 140
    .line 141
    const v18, 0x403eb852    # 2.98f

    .line 142
    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const v14, 0x3fa3d70a    # 1.28f

    .line 146
    .line 147
    .line 148
    const v15, 0x3ef5c28f    # 0.48f

    .line 149
    .line 150
    .line 151
    const v16, 0x4015c28f    # 2.34f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x4028f5c3    # 2.64f

    .line 158
    .line 159
    .line 160
    const v18, 0x3eeb851f    # 0.46f

    .line 161
    .line 162
    .line 163
    const/high16 v13, 0x3f400000    # 0.75f

    .line 164
    .line 165
    const v14, 0x3f0f5c29    # 0.56f

    .line 166
    .line 167
    .line 168
    const v15, 0x3fdeb852    # 1.74f

    .line 169
    .line 170
    .line 171
    const v16, 0x3f3ae148    # 0.73f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x4043d70a    # 3.06f

    .line 178
    .line 179
    .line 180
    const v18, -0x3fceb852    # -2.77f

    .line 181
    .line 182
    .line 183
    const v13, 0x3f88f5c3    # 1.07f

    .line 184
    .line 185
    .line 186
    const v14, -0x416147ae    # -0.31f

    .line 187
    .line 188
    .line 189
    const v15, 0x3ff9999a    # 1.95f

    .line 190
    .line 191
    .line 192
    const v16, -0x404ccccd    # -1.4f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x40828f5c    # 4.08f

    .line 199
    .line 200
    .line 201
    const v18, -0x3fa3d70a    # -3.44f

    .line 202
    .line 203
    .line 204
    const v13, 0x3f9ae148    # 1.21f

    .line 205
    .line 206
    .line 207
    const v14, -0x404147ae    # -1.49f

    .line 208
    .line 209
    .line 210
    const v15, 0x40351eb8    # 2.83f

    .line 211
    .line 212
    .line 213
    const v16, -0x3fa3d70a    # -3.44f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3fe147ae    # 1.76f

    .line 220
    .line 221
    .line 222
    const v18, 0x3fe51eb8    # 1.79f

    .line 223
    .line 224
    .line 225
    const v13, 0x3fd0a3d7    # 1.63f

    .line 226
    .line 227
    .line 228
    const/4 v14, 0x0

    .line 229
    const v15, 0x3fd33333    # 1.65f

    .line 230
    .line 231
    .line 232
    const v16, 0x3f8147ae    # 1.01f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x3f53d70a    # -5.38f

    .line 239
    .line 240
    .line 241
    const v18, 0x40abd70a    # 5.37f

    .line 242
    .line 243
    .line 244
    const v13, -0x3f8e147b    # -3.78f

    .line 245
    .line 246
    .line 247
    const v14, 0x3f23d70a    # 0.64f

    .line 248
    .line 249
    .line 250
    const v15, -0x3f53d70a    # -5.38f

    .line 251
    .line 252
    .line 253
    const v16, 0x406ae148    # 3.67f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x404d70a4    # 3.21f

    .line 260
    .line 261
    .line 262
    const v18, 0x4045c28f    # 3.09f

    .line 263
    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const v14, 0x3fd9999a    # 1.7f

    .line 267
    .line 268
    .line 269
    const v15, 0x3fb851ec    # 1.44f

    .line 270
    .line 271
    .line 272
    const v16, 0x4045c28f    # 3.09f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x4096147b    # 4.69f

    .line 279
    .line 280
    .line 281
    const v18, -0x3f3ccccd    # -6.1f

    .line 282
    .line 283
    .line 284
    const v13, 0x3fd0a3d7    # 1.63f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, 0x408947ae    # 4.29f

    .line 289
    .line 290
    .line 291
    const v16, -0x4055c28f    # -1.33f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x41a80000    # 21.0f

    .line 298
    .line 299
    const v2, 0x416e147b    # 14.88f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, -0x3fe1eb85    # -2.47f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x3f7f0a3d    # -4.03f

    .line 317
    .line 318
    .line 319
    const v18, -0x3f79999a    # -4.2f

    .line 320
    .line 321
    .line 322
    const v13, -0x41e66666    # -0.15f

    .line 323
    .line 324
    .line 325
    const v14, -0x402ccccd    # -1.65f

    .line 326
    .line 327
    .line 328
    const v15, -0x40747ae1    # -1.09f

    .line 329
    .line 330
    .line 331
    const v16, -0x3f79999a    # -4.2f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x3f61eb85    # -4.94f

    .line 338
    .line 339
    .line 340
    const v18, 0x4035c28f    # 2.84f

    .line 341
    .line 342
    .line 343
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const v15, -0x3f7a3d71    # -4.18f

    .line 347
    .line 348
    .line 349
    const v16, 0x3ff47ae1    # 1.91f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3fed70a4    # -2.29f

    .line 356
    .line 357
    .line 358
    const v18, 0x402e147b    # 2.72f

    .line 359
    .line 360
    .line 361
    const v13, -0x40eb851f    # -0.58f

    .line 362
    .line 363
    .line 364
    const v14, 0x3f3ae148    # 0.73f

    .line 365
    .line 366
    .line 367
    const v15, -0x3ffc28f6    # -2.06f

    .line 368
    .line 369
    .line 370
    const v16, 0x401eb852    # 2.48f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x4071eb85    # -1.11f

    .line 377
    .line 378
    .line 379
    const v18, 0x3f570a3d    # 0.84f

    .line 380
    .line 381
    .line 382
    const/high16 v13, -0x41800000    # -0.25f

    .line 383
    .line 384
    const v14, 0x3e99999a    # 0.3f

    .line 385
    .line 386
    .line 387
    const v15, -0x40d1eb85    # -0.68f

    .line 388
    .line 389
    .line 390
    const v16, 0x3f570a3d    # 0.84f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x4147ae14    # -0.36f

    .line 397
    .line 398
    .line 399
    const v18, -0x400a3d71    # -1.92f

    .line 400
    .line 401
    .line 402
    const v13, -0x4119999a    # -0.45f

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    const v15, -0x40c7ae14    # -0.72f

    .line 407
    .line 408
    .line 409
    const v16, -0x40ab851f    # -0.83f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x3feccccd    # 1.85f

    .line 416
    .line 417
    .line 418
    const v18, -0x3f9eb852    # -3.52f

    .line 419
    .line 420
    .line 421
    const v13, 0x3eb33333    # 0.35f

    .line 422
    .line 423
    .line 424
    const v14, -0x40747ae1    # -1.09f

    .line 425
    .line 426
    .line 427
    const v15, 0x3fb33333    # 1.4f

    .line 428
    .line 429
    .line 430
    const v16, -0x3fc8f5c3    # -2.86f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, 0x3fa66666    # 1.3f

    .line 437
    .line 438
    .line 439
    const v18, -0x3fae147b    # -3.28f

    .line 440
    .line 441
    .line 442
    const v13, 0x3f47ae14    # 0.78f

    .line 443
    .line 444
    .line 445
    const v14, -0x406e147b    # -1.14f

    .line 446
    .line 447
    .line 448
    const v15, 0x3fa66666    # 1.3f

    .line 449
    .line 450
    .line 451
    const v16, -0x400a3d71    # -1.92f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x40ce147b    # 6.44f

    .line 458
    .line 459
    .line 460
    const/high16 v18, 0x40400000    # 3.0f

    .line 461
    .line 462
    const v13, 0x410f3333    # 8.95f

    .line 463
    .line 464
    .line 465
    const v14, 0x406c28f6    # 3.69f

    .line 466
    .line 467
    .line 468
    const v15, 0x40e9eb85    # 7.31f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x40400000    # 3.0f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x406e147b    # 3.72f

    .line 477
    .line 478
    .line 479
    const/high16 v18, 0x40880000    # 4.25f

    .line 480
    .line 481
    const v13, 0x40a3d70a    # 5.12f

    .line 482
    .line 483
    .line 484
    const/high16 v14, 0x40400000    # 3.0f

    .line 485
    .line 486
    const v15, 0x407e147b    # 3.97f

    .line 487
    .line 488
    .line 489
    const/high16 v16, 0x40800000    # 4.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x409eb852    # -0.88f

    .line 495
    .line 496
    .line 497
    const v18, 0x3f6e147b    # 0.93f

    .line 498
    .line 499
    .line 500
    const v13, -0x4147ae14    # -0.36f

    .line 501
    .line 502
    .line 503
    const v14, 0x3eb851ec    # 0.36f

    .line 504
    .line 505
    .line 506
    const v15, -0x40d70a3d    # -0.66f

    .line 507
    .line 508
    .line 509
    const v16, 0x3f28f5c3    # 0.66f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 516
    .line 517
    const v2, 0x3fdae148    # 1.71f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x415e147b    # 13.88f

    .line 527
    .line 528
    .line 529
    const v2, 0x41946666    # 18.55f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x40c28f5c    # -0.74f

    .line 536
    .line 537
    .line 538
    const v18, -0x40c7ae14    # -0.72f

    .line 539
    .line 540
    .line 541
    const v13, -0x416147ae    # -0.31f

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const v15, -0x40c28f5c    # -0.74f

    .line 546
    .line 547
    .line 548
    const v16, -0x417ae148    # -0.26f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x4037ae14    # 2.87f

    .line 555
    .line 556
    .line 557
    const v18, -0x3fcf5c29    # -2.76f

    .line 558
    .line 559
    .line 560
    const/4 v13, 0x0

    .line 561
    const v14, -0x40e66666    # -0.6f

    .line 562
    .line 563
    .line 564
    const v15, 0x3f3ae148    # 0.73f

    .line 565
    .line 566
    .line 567
    const v16, -0x3ff33333    # -2.2f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, -0x3ff7ae14    # -2.13f

    .line 574
    .line 575
    .line 576
    const v18, 0x405eb852    # 3.48f

    .line 577
    .line 578
    .line 579
    const v13, -0x41666666    # -0.3f

    .line 580
    .line 581
    .line 582
    const v14, 0x402c28f6    # 2.69f

    .line 583
    .line 584
    .line 585
    const v15, -0x4048f5c3    # -1.43f

    .line 586
    .line 587
    .line 588
    const v16, 0x405eb852    # 3.48f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    const/16 v16, 0x3800

    .line 602
    .line 603
    const/16 v17, 0x0

    .line 604
    .line 605
    const/high16 v6, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/high16 v8, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v7, 0x0

    .line 610
    const/high16 v9, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/high16 v12, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v13, 0x0

    .line 615
    const/4 v14, 0x0

    .line 616
    const/4 v15, 0x0

    .line 617
    const-string v4, ""

    .line 618
    .line 619
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    sput-object v0, Landroidx/compose/material/icons/twotone/GestureKt;->_gesture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 628
    .line 629
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    return-object v0
.end method
