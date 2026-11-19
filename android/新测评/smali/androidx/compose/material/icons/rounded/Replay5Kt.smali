.class public final Landroidx/compose/material/icons/rounded/Replay5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay5",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay5",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getReplay5",
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
        "SMAP\nReplay5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay5.kt\nandroidx/compose/material/icons/rounded/Replay5Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 Replay5.kt\nandroidx/compose/material/icons/rounded/Replay5Kt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay5(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Replay5"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x400d70a4    # 2.21f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40a66666    # -0.85f

    .line 84
    .line 85
    .line 86
    const v18, -0x414ccccd    # -0.35f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    const v15, -0x40f5c28f    # -0.54f

    .line 94
    .line 95
    .line 96
    const v16, -0x40d47ae1    # -0.67f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f8ccccd    # -3.8f

    .line 103
    .line 104
    .line 105
    const v2, 0x40728f5c    # 3.79f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v18, 0x3f35c28f    # 0.71f

    .line 114
    .line 115
    .line 116
    const v13, -0x41b33333    # -0.2f

    .line 117
    .line 118
    .line 119
    const v14, 0x3e4ccccd    # 0.2f

    .line 120
    .line 121
    .line 122
    const v15, -0x41b33333    # -0.2f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f028f5c    # 0.51f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x40728f5c    # 3.79f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3f5c28f6    # 0.86f

    .line 138
    .line 139
    .line 140
    const v18, -0x4147ae14    # -0.36f

    .line 141
    .line 142
    .line 143
    const v13, 0x3ea3d70a    # 0.32f

    .line 144
    .line 145
    .line 146
    const v14, 0x3e9eb852    # 0.31f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f5c28f6    # 0.86f

    .line 150
    .line 151
    .line 152
    const v16, 0x3db851ec    # 0.09f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40e00000    # 7.0f

    .line 159
    .line 160
    const/high16 v2, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x40bb851f    # 5.86f

    .line 166
    .line 167
    .line 168
    const v18, 0x40e947ae    # 7.29f

    .line 169
    .line 170
    .line 171
    const v13, 0x406eb852    # 3.73f

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    const v15, 0x40d5c28f    # 6.68f

    .line 176
    .line 177
    .line 178
    const v16, 0x405ae148    # 3.42f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x3f73851f    # -4.39f

    .line 185
    .line 186
    .line 187
    const v18, 0x4090f5c3    # 4.53f

    .line 188
    .line 189
    .line 190
    const v13, -0x410f5c29    # -0.47f

    .line 191
    .line 192
    .line 193
    const v14, 0x4010a3d7    # 2.26f

    .line 194
    .line 195
    .line 196
    const v15, -0x3ff70a3d    # -2.14f

    .line 197
    .line 198
    .line 199
    const v16, 0x407f5c29    # 3.99f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x3f128f5c    # -7.42f

    .line 206
    .line 207
    .line 208
    const v18, -0x3f6147ae    # -4.96f

    .line 209
    .line 210
    .line 211
    const v13, -0x3f970a3d    # -3.64f

    .line 212
    .line 213
    .line 214
    const v14, 0x3f6147ae    # 0.88f

    .line 215
    .line 216
    .line 217
    const v15, -0x3f223d71    # -6.93f

    .line 218
    .line 219
    .line 220
    const v16, -0x40333333    # -1.6f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x4087ae14    # -0.97f

    .line 227
    .line 228
    .line 229
    const v18, -0x40a3d70a    # -0.86f

    .line 230
    .line 231
    .line 232
    const v13, -0x428a3d71    # -0.06f

    .line 233
    .line 234
    .line 235
    const v14, -0x41051eb8    # -0.49f

    .line 236
    .line 237
    .line 238
    const v15, -0x410a3d71    # -0.48f

    .line 239
    .line 240
    .line 241
    const v16, -0x40a3d70a    # -0.86f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40800000    # -1.0f

    .line 248
    .line 249
    const v18, 0x3f90a3d7    # 1.13f

    .line 250
    .line 251
    .line 252
    const v13, -0x40e66666    # -0.6f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, -0x4075c28f    # -1.08f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f07ae14    # 0.53f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x411c51ec    # 9.77f

    .line 266
    .line 267
    .line 268
    const v18, 0x40d570a4    # 6.67f

    .line 269
    .line 270
    .line 271
    const v13, 0x3f2147ae    # 0.63f

    .line 272
    .line 273
    .line 274
    const v14, 0x408f0a3d    # 4.47f

    .line 275
    .line 276
    .line 277
    const v15, 0x409e147b    # 4.94f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x40f80000    # 7.75f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x40bfae14    # 5.99f

    .line 286
    .line 287
    .line 288
    const v18, -0x3f39eb85    # -6.19f

    .line 289
    .line 290
    .line 291
    const v13, 0x4045c28f    # 3.09f

    .line 292
    .line 293
    .line 294
    const v14, -0x40cf5c29    # -0.69f

    .line 295
    .line 296
    .line 297
    const v15, 0x40ac7ae1    # 5.39f

    .line 298
    .line 299
    .line 300
    const v16, -0x3fbae148    # -3.08f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x41400000    # 12.0f

    .line 307
    .line 308
    const/high16 v18, 0x40a00000    # 5.0f

    .line 309
    .line 310
    const v13, 0x41a6b852    # 20.84f

    .line 311
    .line 312
    .line 313
    const v14, 0x4117ae14    # 9.48f

    .line 314
    .line 315
    .line 316
    const v15, 0x4187851f    # 16.94f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x40a00000    # 5.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x412b0a3d    # 10.69f

    .line 328
    .line 329
    .line 330
    const v2, 0x415e6666    # 13.9f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, -0x3ff51eb8    # -2.17f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x3e800000    # 0.25f

    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x4018f5c3    # 2.39f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x3f35c28f    # 0.71f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, -0x40266666    # -1.7f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x3f6b851f    # 0.92f

    .line 363
    .line 364
    .line 365
    const v2, -0x421eb852    # -0.11f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x3de147ae    # 0.11f

    .line 372
    .line 373
    .line 374
    const v18, -0x42b33333    # -0.05f

    .line 375
    .line 376
    .line 377
    const v13, 0x3cf5c28f    # 0.03f

    .line 378
    .line 379
    .line 380
    const v14, -0x435c28f6    # -0.02f

    .line 381
    .line 382
    .line 383
    const v15, 0x3d8f5c29    # 0.07f

    .line 384
    .line 385
    .line 386
    const v16, -0x430a3d71    # -0.03f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x42b33333    # -0.05f

    .line 393
    .line 394
    .line 395
    const v2, 0x3e19999a    # 0.15f

    .line 396
    .line 397
    .line 398
    const v4, -0x42dc28f6    # -0.04f

    .line 399
    .line 400
    .line 401
    const v6, 0x3db851ec    # 0.09f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x430a3d71    # -0.03f

    .line 408
    .line 409
    .line 410
    const v2, 0x3e3851ec    # 0.18f

    .line 411
    .line 412
    .line 413
    const v4, 0x3df5c28f    # 0.12f

    .line 414
    .line 415
    .line 416
    const v6, -0x42dc28f6    # -0.04f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3e051eb8    # 0.13f

    .line 423
    .line 424
    .line 425
    const v2, 0x3e4ccccd    # 0.2f

    .line 426
    .line 427
    .line 428
    const v4, -0x435c28f6    # -0.02f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x3f0ccccd    # 0.55f

    .line 435
    .line 436
    .line 437
    const v18, 0x3dcccccd    # 0.1f

    .line 438
    .line 439
    .line 440
    const v13, 0x3e570a3d    # 0.21f

    .line 441
    .line 442
    .line 443
    const/4 v14, 0x0

    .line 444
    const v15, 0x3ec7ae14    # 0.39f

    .line 445
    .line 446
    .line 447
    const v16, 0x3cf5c28f    # 0.03f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3ed1eb85    # 0.41f

    .line 454
    .line 455
    .line 456
    const v2, 0x3e8f5c29    # 0.28f

    .line 457
    .line 458
    .line 459
    const v4, 0x3e99999a    # 0.3f

    .line 460
    .line 461
    .line 462
    const v6, 0x3e23d70a    # 0.16f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x3e8a3d71    # 0.27f

    .line 469
    .line 470
    .line 471
    const v2, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    const v4, 0x3e4ccccd    # 0.2f

    .line 475
    .line 476
    .line 477
    const/high16 v6, 0x3e800000    # 0.25f

    .line 478
    .line 479
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3ec28f5c    # 0.38f

    .line 483
    .line 484
    .line 485
    const v2, 0x3f19999a    # 0.6f

    .line 486
    .line 487
    .line 488
    const v4, 0x3db851ec    # 0.09f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x4247ae14    # -0.09f

    .line 495
    .line 496
    .line 497
    const v18, 0x3f0a3d71    # 0.54f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, 0x3e428f5c    # 0.19f

    .line 502
    .line 503
    .line 504
    const v15, -0x430a3d71    # -0.03f

    .line 505
    .line 506
    .line 507
    const v16, 0x3ebd70a4    # 0.37f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x3ea3d70a    # 0.32f

    .line 514
    .line 515
    .line 516
    const v2, -0x4175c28f    # -0.27f

    .line 517
    .line 518
    .line 519
    const v4, 0x3ee66666    # 0.45f

    .line 520
    .line 521
    .line 522
    const v6, -0x41e66666    # -0.15f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    const v2, 0x3e9eb852    # 0.31f

    .line 532
    .line 533
    .line 534
    const v4, -0x4175c28f    # -0.27f

    .line 535
    .line 536
    .line 537
    const v6, 0x3e75c28f    # 0.24f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, -0x40dc28f6    # -0.64f

    .line 544
    .line 545
    .line 546
    const v2, -0x413851ec    # -0.39f

    .line 547
    .line 548
    .line 549
    const v4, 0x3df5c28f    # 0.12f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, -0x40f851ec    # -0.53f

    .line 556
    .line 557
    .line 558
    const v18, -0x425c28f6    # -0.08f

    .line 559
    .line 560
    .line 561
    const v13, -0x41c7ae14    # -0.18f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const v15, -0x4147ae14    # -0.36f

    .line 566
    .line 567
    .line 568
    const v16, -0x430a3d71    # -0.03f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, -0x41f0a3d7    # -0.14f

    .line 575
    .line 576
    .line 577
    const v2, -0x41147ae1    # -0.46f

    .line 578
    .line 579
    .line 580
    const v4, -0x415c28f6    # -0.32f

    .line 581
    .line 582
    .line 583
    const v6, -0x418a3d71    # -0.24f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, -0x415c28f6    # -0.32f

    .line 590
    .line 591
    .line 592
    const v2, -0x413851ec    # -0.39f

    .line 593
    .line 594
    .line 595
    const v4, -0x418a3d71    # -0.24f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, -0x41570a3d    # -0.33f

    .line 602
    .line 603
    .line 604
    const v2, -0x40f851ec    # -0.53f

    .line 605
    .line 606
    .line 607
    const v4, -0x41fae148    # -0.13f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x3f570a3d    # 0.84f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, 0x3e428f5c    # 0.19f

    .line 620
    .line 621
    .line 622
    const v18, 0x3ed1eb85    # 0.41f

    .line 623
    .line 624
    .line 625
    const v13, 0x3ca3d70a    # 0.02f

    .line 626
    .line 627
    .line 628
    const v14, 0x3e3851ec    # 0.18f

    .line 629
    .line 630
    .line 631
    const v15, 0x3da3d70a    # 0.08f

    .line 632
    .line 633
    .line 634
    const v16, 0x3ea3d70a    # 0.32f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x3ed70a3d    # 0.42f

    .line 641
    .line 642
    .line 643
    const v2, 0x3e19999a    # 0.15f

    .line 644
    .line 645
    .line 646
    const/high16 v4, 0x3e800000    # 0.25f

    .line 647
    .line 648
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, 0x3e8a3d71    # 0.27f

    .line 652
    .line 653
    .line 654
    const v18, -0x428a3d71    # -0.06f

    .line 655
    .line 656
    .line 657
    const v13, 0x3de147ae    # 0.11f

    .line 658
    .line 659
    .line 660
    const/4 v14, 0x0

    .line 661
    const v15, 0x3e4ccccd    # 0.2f

    .line 662
    .line 663
    .line 664
    const v16, -0x435c28f6    # -0.02f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x3e0f5c29    # 0.14f

    .line 671
    .line 672
    .line 673
    const v2, -0x41d1eb85    # -0.17f

    .line 674
    .line 675
    .line 676
    const v4, -0x42333333    # -0.1f

    .line 677
    .line 678
    .line 679
    const v6, 0x3e3851ec    # 0.18f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v0, 0x3de147ae    # 0.11f

    .line 686
    .line 687
    .line 688
    const/high16 v2, -0x41800000    # -0.25f

    .line 689
    .line 690
    const v4, -0x41e66666    # -0.15f

    .line 691
    .line 692
    .line 693
    const v6, 0x3da3d70a    # 0.08f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, -0x41b33333    # -0.2f

    .line 700
    .line 701
    .line 702
    const v2, -0x416147ae    # -0.31f

    .line 703
    .line 704
    .line 705
    const v4, 0x3cf5c28f    # 0.03f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, -0x41a8f5c3    # -0.21f

    .line 712
    .line 713
    .line 714
    const v4, -0x42dc28f6    # -0.04f

    .line 715
    .line 716
    .line 717
    const v6, -0x43dc28f6    # -0.01f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, -0x4270a3d7    # -0.07f

    .line 724
    .line 725
    .line 726
    const v2, -0x41d1eb85    # -0.17f

    .line 727
    .line 728
    .line 729
    const v4, -0x41fae148    # -0.13f

    .line 730
    .line 731
    .line 732
    const v6, -0x418a3d71    # -0.24f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, -0x420a3d71    # -0.12f

    .line 739
    .line 740
    .line 741
    const v2, -0x41a8f5c3    # -0.21f

    .line 742
    .line 743
    .line 744
    const v6, -0x41e66666    # -0.15f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, -0x41bd70a4    # -0.19f

    .line 751
    .line 752
    .line 753
    const v2, -0x41666666    # -0.3f

    .line 754
    .line 755
    .line 756
    const v4, -0x42b33333    # -0.05f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v17, -0x41b33333    # -0.2f

    .line 763
    .line 764
    .line 765
    const v18, 0x3ca3d70a    # 0.02f

    .line 766
    .line 767
    .line 768
    const v13, -0x425c28f6    # -0.08f

    .line 769
    .line 770
    .line 771
    const v15, -0x41e66666    # -0.15f

    .line 772
    .line 773
    .line 774
    const v16, 0x3c23d70a    # 0.01f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x3d4ccccd    # 0.05f

    .line 781
    .line 782
    .line 783
    const v2, -0x421eb852    # -0.11f

    .line 784
    .line 785
    .line 786
    const v4, 0x3cf5c28f    # 0.03f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v0, -0x420a3d71    # -0.12f

    .line 793
    .line 794
    .line 795
    const v2, 0x3d8f5c29    # 0.07f

    .line 796
    .line 797
    .line 798
    const v4, -0x425c28f6    # -0.08f

    .line 799
    .line 800
    .line 801
    const v6, 0x3d4ccccd    # 0.05f

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v0, -0x4270a3d7    # -0.07f

    .line 808
    .line 809
    .line 810
    const v2, 0x3d75c28f    # 0.06f

    .line 811
    .line 812
    .line 813
    const v4, -0x42333333    # -0.1f

    .line 814
    .line 815
    .line 816
    const v6, 0x3db851ec    # 0.09f

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, -0x40d47ae1    # -0.67f

    .line 823
    .line 824
    .line 825
    const v2, -0x41dc28f6    # -0.16f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    const/16 v16, 0x3800

    .line 839
    .line 840
    const/16 v17, 0x0

    .line 841
    .line 842
    const/high16 v6, 0x3f800000    # 1.0f

    .line 843
    .line 844
    const/high16 v8, 0x3f800000    # 1.0f

    .line 845
    .line 846
    const/4 v7, 0x0

    .line 847
    const/high16 v9, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/high16 v12, 0x3f800000    # 1.0f

    .line 850
    .line 851
    const/4 v13, 0x0

    .line 852
    const/4 v15, 0x0

    .line 853
    const-string v4, ""

    .line 854
    .line 855
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    sput-object v0, Landroidx/compose/material/icons/rounded/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 864
    .line 865
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    return-object v0
.end method
