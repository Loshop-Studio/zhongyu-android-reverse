.class public final Landroidx/compose/material/icons/rounded/MotionPhotosPausedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_motionPhotosPaused",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MotionPhotosPaused",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMotionPhotosPaused",
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
        "SMAP\nMotionPhotosPaused.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionPhotosPaused.kt\nandroidx/compose/material/icons/rounded/MotionPhotosPausedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 MotionPhotosPaused.kt\nandroidx/compose/material/icons/rounded/MotionPhotosPausedKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"
    }
.end annotation


# static fields
.field private static _motionPhotosPaused:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosPaused(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MotionPhotosPausedKt;->_motionPhotosPaused:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MotionPhotosPaused"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3e800000    # 0.25f

    .line 81
    .line 82
    const v18, 0x3f7ae148    # 0.98f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e851eb8    # 0.26f

    .line 86
    .line 87
    .line 88
    const v14, 0x3e851eb8    # 0.26f

    .line 89
    .line 90
    .line 91
    const v15, 0x3eae147b    # 0.34f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f2147ae    # 0.63f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3dcccccd    # 0.1f

    .line 101
    .line 102
    .line 103
    const v18, 0x408c28f6    # 4.38f

    .line 104
    .line 105
    .line 106
    const v13, -0x414ccccd    # -0.35f

    .line 107
    .line 108
    .line 109
    const v14, 0x3fae147b    # 1.36f

    .line 110
    .line 111
    .line 112
    const v15, -0x4147ae14    # -0.36f

    .line 113
    .line 114
    .line 115
    const v16, 0x4037ae14    # 2.87f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x40ce147b    # 6.44f

    .line 122
    .line 123
    .line 124
    const v18, 0x40b1999a    # 5.55f

    .line 125
    .line 126
    .line 127
    const v13, 0x3f6147ae    # 0.88f

    .line 128
    .line 129
    .line 130
    const v14, 0x403a3d71    # 2.91f

    .line 131
    .line 132
    .line 133
    const v15, 0x405c28f6    # 3.44f

    .line 134
    .line 135
    .line 136
    const v16, 0x40a33333    # 5.1f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x41107ae1    # 9.03f

    .line 143
    .line 144
    .line 145
    const v18, -0x3ee6147b    # -9.62f

    .line 146
    .line 147
    .line 148
    const v13, 0x40b0a3d7    # 5.52f

    .line 149
    .line 150
    .line 151
    const v14, 0x3f4f5c29    # 0.81f

    .line 152
    .line 153
    .line 154
    const v15, 0x41230a3d    # 10.19f

    .line 155
    .line 156
    .line 157
    const v16, -0x3f7e147b    # -4.06f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, -0x3f3428f6    # -6.37f

    .line 164
    .line 165
    .line 166
    const v18, -0x3f3ae148    # -6.16f

    .line 167
    .line 168
    .line 169
    const v13, -0x40d9999a    # -0.65f

    .line 170
    .line 171
    .line 172
    const v14, -0x3fb7ae14    # -3.13f

    .line 173
    .line 174
    .line 175
    const v15, -0x3fb147ae    # -3.23f

    .line 176
    .line 177
    .line 178
    const v16, -0x3f4c7ae1    # -5.61f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x3fa28f5c    # -3.46f

    .line 185
    .line 186
    .line 187
    const v18, 0x3e051eb8    # 0.13f

    .line 188
    .line 189
    .line 190
    const v13, -0x40651eb8    # -1.21f

    .line 191
    .line 192
    .line 193
    const v14, -0x41a8f5c3    # -0.21f

    .line 194
    .line 195
    .line 196
    const v15, -0x3fe7ae14    # -2.38f

    .line 197
    .line 198
    .line 199
    const v16, -0x41e66666    # -0.15f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x411028f6    # 9.01f

    .line 206
    .line 207
    .line 208
    const v18, 0x408051ec    # 4.01f

    .line 209
    .line 210
    .line 211
    const v13, 0x411a3d71    # 9.64f

    .line 212
    .line 213
    .line 214
    const v14, 0x408b3333    # 4.35f

    .line 215
    .line 216
    .line 217
    const v15, 0x411428f6    # 9.26f

    .line 218
    .line 219
    .line 220
    const v16, 0x408851ec    # 4.26f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/4 v0, 0x0

    .line 227
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x4117ae14    # 9.48f

    .line 231
    .line 232
    .line 233
    const v18, 0x40147ae1    # 2.32f

    .line 234
    .line 235
    .line 236
    const v13, 0x41073333    # 8.45f

    .line 237
    .line 238
    .line 239
    const v14, 0x405ccccd    # 3.45f

    .line 240
    .line 241
    .line 242
    const v15, 0x410bae14    # 8.73f

    .line 243
    .line 244
    .line 245
    const v16, 0x402147ae    # 2.52f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x40966666    # 4.7f

    .line 252
    .line 253
    .line 254
    const v18, -0x4247ae14    # -0.09f

    .line 255
    .line 256
    .line 257
    const v13, 0x3fbc28f6    # 1.47f

    .line 258
    .line 259
    .line 260
    const v14, -0x413d70a4    # -0.38f

    .line 261
    .line 262
    .line 263
    const v15, 0x4043d70a    # 3.06f

    .line 264
    .line 265
    .line 266
    const v16, -0x411eb852    # -0.44f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x40f66666    # 7.7f

    .line 273
    .line 274
    .line 275
    const v18, 0x41033333    # 8.2f

    .line 276
    .line 277
    .line 278
    const v13, 0x407eb852    # 3.98f

    .line 279
    .line 280
    .line 281
    const v14, 0x3f5c28f6    # 0.86f

    .line 282
    .line 283
    .line 284
    const v15, 0x40e2e148    # 7.09f

    .line 285
    .line 286
    .line 287
    const v16, 0x4085c28f    # 4.18f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x3ec5c28f    # -11.64f

    .line 294
    .line 295
    .line 296
    const v18, 0x4136b852    # 11.42f

    .line 297
    .line 298
    .line 299
    const v13, 0x3f851eb8    # 1.04f

    .line 300
    .line 301
    .line 302
    const v14, 0x40d9eb85    # 6.81f

    .line 303
    .line 304
    .line 305
    const v15, -0x3f65c28f    # -4.82f

    .line 306
    .line 307
    .line 308
    const v16, 0x414947ae    # 12.58f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x400ccccd    # 2.2f

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x41600000    # 14.0f

    .line 318
    .line 319
    const v13, 0x40c75c29    # 6.23f

    .line 320
    .line 321
    .line 322
    const v14, 0x41a947ae    # 21.16f

    .line 323
    .line 324
    .line 325
    const v15, 0x403eb852    # 2.98f

    .line 326
    .line 327
    .line 328
    const v16, 0x418feb85    # 17.99f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x3df5c28f    # 0.12f

    .line 335
    .line 336
    .line 337
    const v18, -0x3f6f0a3d    # -4.53f

    .line 338
    .line 339
    .line 340
    const v13, -0x416147ae    # -0.31f

    .line 341
    .line 342
    .line 343
    const v14, -0x40347ae1    # -1.59f

    .line 344
    .line 345
    .line 346
    const v15, -0x418a3d71    # -0.24f

    .line 347
    .line 348
    .line 349
    const v16, -0x3fb851ec    # -3.12f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40800000    # 4.0f

    .line 356
    .line 357
    const/high16 v18, 0x41100000    # 9.0f

    .line 358
    .line 359
    const v13, 0x402147ae    # 2.52f

    .line 360
    .line 361
    .line 362
    const v14, 0x410b851f    # 8.72f

    .line 363
    .line 364
    .line 365
    const v15, 0x405ccccd    # 3.45f

    .line 366
    .line 367
    .line 368
    const v16, 0x41073333    # 8.45f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40e00000    # 7.0f

    .line 378
    .line 379
    const/high16 v2, 0x40b00000    # 5.5f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x40b00000    # 5.5f

    .line 385
    .line 386
    const/high16 v18, 0x40e00000    # 7.0f

    .line 387
    .line 388
    const/high16 v13, 0x40e00000    # 7.0f

    .line 389
    .line 390
    const v14, 0x40ca8f5c    # 6.33f

    .line 391
    .line 392
    .line 393
    const v15, 0x40ca8f5c    # 6.33f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x40e00000    # 7.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x40ca8f5c    # 6.33f

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x40800000    # 4.0f

    .line 405
    .line 406
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x409570a4    # 4.67f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x40e00000    # 7.0f

    .line 416
    .line 417
    const/high16 v4, 0x40b00000    # 5.5f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41400000    # 12.0f

    .line 426
    .line 427
    const/high16 v2, 0x40c00000    # 6.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, -0x3f400000    # -6.0f

    .line 433
    .line 434
    const/high16 v18, 0x40c00000    # 6.0f

    .line 435
    .line 436
    const v13, -0x3fac28f6    # -3.31f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/high16 v15, -0x3f400000    # -6.0f

    .line 441
    .line 442
    const v16, 0x402c28f6    # 2.69f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x402c28f6    # 2.69f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x3fd3d70a    # -2.69f

    .line 455
    .line 456
    .line 457
    const/high16 v2, -0x3f400000    # -6.0f

    .line 458
    .line 459
    const/high16 v4, 0x40c00000    # 6.0f

    .line 460
    .line 461
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x4174f5c3    # 15.31f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x41400000    # 12.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41200000    # 10.0f

    .line 476
    .line 477
    const/high16 v2, 0x41700000    # 15.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, -0x40800000    # -1.0f

    .line 486
    .line 487
    const/high16 v18, -0x40800000    # -1.0f

    .line 488
    .line 489
    const v13, -0x40f33333    # -0.55f

    .line 490
    .line 491
    .line 492
    const/high16 v15, -0x40800000    # -1.0f

    .line 493
    .line 494
    const v16, -0x4119999a    # -0.45f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, -0x3f800000    # -4.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const v14, -0x40f33333    # -0.55f

    .line 509
    .line 510
    .line 511
    const v15, 0x3ee66666    # 0.45f

    .line 512
    .line 513
    .line 514
    const/high16 v16, -0x40800000    # -1.0f

    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/4 v0, 0x0

    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v18, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const v13, 0x3f0ccccd    # 0.55f

    .line 526
    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/high16 v15, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const v16, 0x3ee66666    # 0.45f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x40800000    # 4.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41200000    # 10.0f

    .line 543
    .line 544
    const/high16 v18, 0x41700000    # 15.0f

    .line 545
    .line 546
    const/high16 v13, 0x41300000    # 11.0f

    .line 547
    .line 548
    const v14, 0x4168cccd    # 14.55f

    .line 549
    .line 550
    .line 551
    const v15, 0x4128cccd    # 10.55f

    .line 552
    .line 553
    .line 554
    const/high16 v16, 0x41700000    # 15.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41600000    # 14.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, -0x40800000    # -1.0f

    .line 571
    .line 572
    const/high16 v18, -0x40800000    # -1.0f

    .line 573
    .line 574
    const v13, -0x40f33333    # -0.55f

    .line 575
    .line 576
    .line 577
    const/4 v14, 0x0

    .line 578
    const/high16 v15, -0x40800000    # -1.0f

    .line 579
    .line 580
    const v16, -0x4119999a    # -0.45f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v0, -0x3f800000    # -4.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v17, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const v14, -0x40f33333    # -0.55f

    .line 595
    .line 596
    .line 597
    const v15, 0x3ee66666    # 0.45f

    .line 598
    .line 599
    .line 600
    const/high16 v16, -0x40800000    # -1.0f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/4 v0, 0x0

    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v18, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const v13, 0x3f0ccccd    # 0.55f

    .line 612
    .line 613
    .line 614
    const/4 v14, 0x0

    .line 615
    const/high16 v15, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const v16, 0x3ee66666    # 0.45f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x40800000    # 4.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, 0x41600000    # 14.0f

    .line 629
    .line 630
    const/high16 v18, 0x41700000    # 15.0f

    .line 631
    .line 632
    const/high16 v13, 0x41700000    # 15.0f

    .line 633
    .line 634
    const v14, 0x4168cccd    # 14.55f

    .line 635
    .line 636
    .line 637
    const v15, 0x4168cccd    # 14.55f

    .line 638
    .line 639
    .line 640
    const/high16 v16, 0x41700000    # 15.0f

    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    const/16 v16, 0x3800

    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const/high16 v6, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/high16 v8, 0x3f800000    # 1.0f

    .line 659
    .line 660
    const/4 v7, 0x0

    .line 661
    const/high16 v9, 0x3f800000    # 1.0f

    .line 662
    .line 663
    const/high16 v12, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/4 v13, 0x0

    .line 666
    const/4 v14, 0x0

    .line 667
    const/4 v15, 0x0

    .line 668
    const-string v4, ""

    .line 669
    .line 670
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    sput-object v0, Landroidx/compose/material/icons/rounded/MotionPhotosPausedKt;->_motionPhotosPaused:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    return-object v0
.end method
