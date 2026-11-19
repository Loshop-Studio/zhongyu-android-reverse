.class public final Landroidx/compose/material/icons/rounded/Forward5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_forward5",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Forward5",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getForward5",
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
        "SMAP\nForward5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward5.kt\nandroidx/compose/material/icons/rounded/Forward5Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 Forward5.kt\nandroidx/compose/material/icons/rounded/Forward5Kt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _forward5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward5(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Forward5Kt;->_forward5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Forward5"

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
    const v0, 0x4196f5c3    # 18.87f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40851eb8    # -0.98f

    .line 79
    .line 80
    .line 81
    const v18, 0x3f5c28f6    # 0.86f

    .line 82
    .line 83
    .line 84
    const/high16 v13, -0x41000000    # -0.5f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x40970a3d    # -0.91f

    .line 88
    .line 89
    .line 90
    const v16, 0x3ebd70a4    # 0.37f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x3f128f5c    # -7.42f

    .line 97
    .line 98
    .line 99
    const v18, 0x409eb852    # 4.96f

    .line 100
    .line 101
    .line 102
    const v13, -0x410a3d71    # -0.48f

    .line 103
    .line 104
    .line 105
    const v14, 0x4057ae14    # 3.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x3f8eb852    # -3.77f

    .line 109
    .line 110
    .line 111
    const v16, 0x40bae148    # 5.84f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3f73851f    # -4.39f

    .line 118
    .line 119
    .line 120
    const v18, -0x3f6f0a3d    # -4.53f

    .line 121
    .line 122
    .line 123
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 124
    .line 125
    const v14, -0x40f5c28f    # -0.54f

    .line 126
    .line 127
    .line 128
    const v15, -0x3f85c28f    # -3.91f

    .line 129
    .line 130
    .line 131
    const v16, -0x3feeb852    # -2.27f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x413f3333    # 11.95f

    .line 138
    .line 139
    .line 140
    const/high16 v18, 0x40e00000    # 7.0f

    .line 141
    .line 142
    const v13, 0x40a8a3d7    # 5.27f

    .line 143
    .line 144
    .line 145
    const v14, 0x4126b852    # 10.42f

    .line 146
    .line 147
    .line 148
    const v15, 0x4103851f    # 8.22f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x40e00000    # 7.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x40328f5c    # 2.79f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x3f59999a    # 0.85f

    .line 163
    .line 164
    .line 165
    const v18, 0x3eb33333    # 0.35f

    .line 166
    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const v14, 0x3ee66666    # 0.45f

    .line 170
    .line 171
    .line 172
    const v15, 0x3f0a3d71    # 0.54f

    .line 173
    .line 174
    .line 175
    const v16, 0x3f2b851f    # 0.67f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x40728f5c    # 3.79f

    .line 182
    .line 183
    .line 184
    const v2, -0x3f8d70a4    # -3.79f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const v18, -0x40ca3d71    # -0.71f

    .line 193
    .line 194
    .line 195
    const v13, 0x3e4ccccd    # 0.2f

    .line 196
    .line 197
    .line 198
    const v14, -0x41b33333    # -0.2f

    .line 199
    .line 200
    .line 201
    const v15, 0x3e4ccccd    # 0.2f

    .line 202
    .line 203
    .line 204
    const v16, -0x40fd70a4    # -0.51f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x414ccccd    # 12.8f

    .line 211
    .line 212
    .line 213
    const v2, 0x3feccccd    # 1.85f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, -0x40a66666    # -0.85f

    .line 220
    .line 221
    .line 222
    const v18, 0x3eb33333    # 0.35f

    .line 223
    .line 224
    .line 225
    const v13, -0x416147ae    # -0.31f

    .line 226
    .line 227
    .line 228
    const v14, -0x416147ae    # -0.31f

    .line 229
    .line 230
    .line 231
    const v15, -0x40a66666    # -0.85f

    .line 232
    .line 233
    .line 234
    const v16, -0x4247ae14    # -0.09f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x413f3333    # 11.95f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x40a00000    # 5.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x3f051eb8    # -7.84f

    .line 249
    .line 250
    .line 251
    const v18, 0x4119999a    # 9.6f

    .line 252
    .line 253
    .line 254
    const v13, -0x3f61eb85    # -4.94f

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const v15, -0x3ef28f5c    # -8.84f

    .line 259
    .line 260
    .line 261
    const v16, 0x408f5c29    # 4.48f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x40bfae14    # 5.99f

    .line 268
    .line 269
    .line 270
    const v18, 0x40c6147b    # 6.19f

    .line 271
    .line 272
    .line 273
    const v13, 0x3f19999a    # 0.6f

    .line 274
    .line 275
    .line 276
    const v14, 0x40470a3d    # 3.11f

    .line 277
    .line 278
    .line 279
    const v15, 0x4039999a    # 2.9f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x40b00000    # 5.5f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x411c51ec    # 9.77f

    .line 288
    .line 289
    .line 290
    const v18, -0x3f2a8f5c    # -6.67f

    .line 291
    .line 292
    .line 293
    const v13, 0x409a8f5c    # 4.83f

    .line 294
    .line 295
    .line 296
    const v14, 0x3f8a3d71    # 1.08f

    .line 297
    .line 298
    .line 299
    const v15, 0x41126666    # 9.15f

    .line 300
    .line 301
    .line 302
    const v16, -0x3ff33333    # -2.2f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, -0x40800000    # -1.0f

    .line 309
    .line 310
    const v18, -0x4070a3d7    # -1.12f

    .line 311
    .line 312
    .line 313
    const v13, 0x3db851ec    # 0.09f

    .line 314
    .line 315
    .line 316
    const v14, -0x40e8f5c3    # -0.59f

    .line 317
    .line 318
    .line 319
    const v15, -0x41333333    # -0.4f

    .line 320
    .line 321
    .line 322
    const v16, -0x4070a3d7    # -1.12f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x4146e148    # 12.43f

    .line 332
    .line 333
    .line 334
    const v2, 0x41726666    # 15.15f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, -0x41c7ae14    # -0.18f

    .line 341
    .line 342
    .line 343
    const v18, 0x3e2e147b    # 0.17f

    .line 344
    .line 345
    .line 346
    const v13, -0x42b33333    # -0.05f

    .line 347
    .line 348
    .line 349
    const v14, 0x3d8f5c29    # 0.07f

    .line 350
    .line 351
    .line 352
    const v15, -0x421eb852    # -0.11f

    .line 353
    .line 354
    .line 355
    const v16, 0x3e051eb8    # 0.13f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, -0x4175c28f    # -0.27f

    .line 362
    .line 363
    .line 364
    const v2, 0x3d75c28f    # 0.06f

    .line 365
    .line 366
    .line 367
    const v4, -0x41d1eb85    # -0.17f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x4128f5c3    # -0.42f

    .line 374
    .line 375
    .line 376
    const v18, -0x41e66666    # -0.15f

    .line 377
    .line 378
    .line 379
    const v13, -0x41d1eb85    # -0.17f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const v15, -0x416147ae    # -0.31f

    .line 384
    .line 385
    .line 386
    const v16, -0x42b33333    # -0.05f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x418a3d71    # -0.24f

    .line 393
    .line 394
    .line 395
    const v2, -0x41bd70a4    # -0.19f

    .line 396
    .line 397
    .line 398
    const v4, -0x412e147b    # -0.41f

    .line 399
    .line 400
    .line 401
    const v6, -0x41d1eb85    # -0.17f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x40a8f5c3    # -0.84f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3e051eb8    # 0.13f

    .line 414
    .line 415
    .line 416
    const v18, 0x3f07ae14    # 0.53f

    .line 417
    .line 418
    .line 419
    const v13, 0x3c23d70a    # 0.01f

    .line 420
    .line 421
    .line 422
    const v14, 0x3e4ccccd    # 0.2f

    .line 423
    .line 424
    .line 425
    const v15, 0x3d4ccccd    # 0.05f

    .line 426
    .line 427
    .line 428
    const v16, 0x3ebd70a4    # 0.37f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x3ea3d70a    # 0.32f

    .line 435
    .line 436
    .line 437
    const v2, 0x3ec7ae14    # 0.39f

    .line 438
    .line 439
    .line 440
    const v4, 0x3e428f5c    # 0.19f

    .line 441
    .line 442
    .line 443
    const v6, 0x3e8f5c29    # 0.28f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x3e947ae1    # 0.29f

    .line 450
    .line 451
    .line 452
    const v2, 0x3eeb851f    # 0.46f

    .line 453
    .line 454
    .line 455
    const v4, 0x3e75c28f    # 0.24f

    .line 456
    .line 457
    .line 458
    const v6, 0x3e428f5c    # 0.19f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3eb33333    # 0.35f

    .line 465
    .line 466
    .line 467
    const v2, 0x3f07ae14    # 0.53f

    .line 468
    .line 469
    .line 470
    const v4, 0x3da3d70a    # 0.08f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x3f23d70a    # 0.64f

    .line 477
    .line 478
    .line 479
    const v18, -0x420a3d71    # -0.12f

    .line 480
    .line 481
    .line 482
    const v13, 0x3e75c28f    # 0.24f

    .line 483
    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    const v15, 0x3eeb851f    # 0.46f

    .line 487
    .line 488
    .line 489
    const v16, -0x42dc28f6    # -0.04f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x3ee66666    # 0.45f

    .line 496
    .line 497
    .line 498
    const v2, -0x416147ae    # -0.31f

    .line 499
    .line 500
    .line 501
    const v4, -0x41c7ae14    # -0.18f

    .line 502
    .line 503
    .line 504
    const v6, 0x3ea8f5c3    # 0.33f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3e8a3d71    # 0.27f

    .line 511
    .line 512
    .line 513
    const v2, -0x4119999a    # -0.45f

    .line 514
    .line 515
    .line 516
    const v4, -0x4170a3d7    # -0.28f

    .line 517
    .line 518
    .line 519
    const v6, 0x3e570a3d    # 0.21f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, -0x414ccccd    # -0.35f

    .line 526
    .line 527
    .line 528
    const v2, -0x40f5c28f    # -0.54f

    .line 529
    .line 530
    .line 531
    const v4, 0x3db851ec    # 0.09f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x4247ae14    # -0.09f

    .line 538
    .line 539
    .line 540
    const v18, -0x40e66666    # -0.6f

    .line 541
    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    const v14, -0x419eb852    # -0.22f

    .line 545
    .line 546
    .line 547
    const v15, -0x430a3d71    # -0.03f

    .line 548
    .line 549
    .line 550
    const v16, -0x4123d70a    # -0.43f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, -0x41f0a3d7    # -0.14f

    .line 557
    .line 558
    .line 559
    const v2, -0x41570a3d    # -0.33f

    .line 560
    .line 561
    .line 562
    const v4, -0x4119999a    # -0.45f

    .line 563
    .line 564
    .line 565
    const/high16 v6, -0x41800000    # -0.25f

    .line 566
    .line 567
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x419eb852    # -0.22f

    .line 571
    .line 572
    .line 573
    const v2, -0x4170a3d7    # -0.28f

    .line 574
    .line 575
    .line 576
    const v4, -0x412e147b    # -0.41f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x4151eb85    # -0.34f

    .line 583
    .line 584
    .line 585
    const v2, -0x40f33333    # -0.55f

    .line 586
    .line 587
    .line 588
    const v4, -0x42333333    # -0.1f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, -0x41b33333    # -0.2f

    .line 595
    .line 596
    .line 597
    const v18, 0x3ca3d70a    # 0.02f

    .line 598
    .line 599
    .line 600
    const v13, -0x4270a3d7    # -0.07f

    .line 601
    .line 602
    .line 603
    const/4 v14, 0x0

    .line 604
    const v15, -0x41f0a3d7    # -0.14f

    .line 605
    .line 606
    .line 607
    const v16, 0x3c23d70a    # 0.01f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, -0x41fae148    # -0.13f

    .line 614
    .line 615
    .line 616
    const v2, 0x3ca3d70a    # 0.02f

    .line 617
    .line 618
    .line 619
    const v4, -0x41c7ae14    # -0.18f

    .line 620
    .line 621
    .line 622
    const v6, 0x3d23d70a    # 0.04f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x3cf5c28f    # 0.03f

    .line 629
    .line 630
    .line 631
    const v2, -0x41e66666    # -0.15f

    .line 632
    .line 633
    .line 634
    const v4, 0x3d4ccccd    # 0.05f

    .line 635
    .line 636
    .line 637
    const v6, -0x42333333    # -0.1f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, -0x425c28f6    # -0.08f

    .line 644
    .line 645
    .line 646
    const v2, -0x421eb852    # -0.11f

    .line 647
    .line 648
    .line 649
    const v6, 0x3d23d70a    # 0.04f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x3de147ae    # 0.11f

    .line 656
    .line 657
    .line 658
    const v2, -0x40947ae1    # -0.92f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, 0x3fd9999a    # 1.7f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, -0x40ca3d71    # -0.71f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x412e6666    # 10.9f

    .line 677
    .line 678
    .line 679
    const v2, 0x413bd70a    # 11.74f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v0, 0x400ae148    # 2.17f

    .line 686
    .line 687
    .line 688
    const/high16 v2, -0x41800000    # -0.25f

    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, 0x3f2b851f    # 0.67f

    .line 694
    .line 695
    .line 696
    const v2, 0x3e2e147b    # 0.17f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x3dcccccd    # 0.1f

    .line 703
    .line 704
    .line 705
    const v18, -0x4247ae14    # -0.09f

    .line 706
    .line 707
    .line 708
    const v13, 0x3cf5c28f    # 0.03f

    .line 709
    .line 710
    .line 711
    const v14, -0x430a3d71    # -0.03f

    .line 712
    .line 713
    .line 714
    const v15, 0x3d75c28f    # 0.06f

    .line 715
    .line 716
    .line 717
    const v16, -0x428a3d71    # -0.06f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x3df5c28f    # 0.12f

    .line 724
    .line 725
    .line 726
    const v2, -0x4270a3d7    # -0.07f

    .line 727
    .line 728
    .line 729
    const v4, -0x42b33333    # -0.05f

    .line 730
    .line 731
    .line 732
    const v6, 0x3d8f5c29    # 0.07f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, -0x42dc28f6    # -0.04f

    .line 739
    .line 740
    .line 741
    const v2, 0x3e19999a    # 0.15f

    .line 742
    .line 743
    .line 744
    const v4, 0x3dcccccd    # 0.1f

    .line 745
    .line 746
    .line 747
    const v6, -0x42b33333    # -0.05f

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x3e4ccccd    # 0.2f

    .line 754
    .line 755
    .line 756
    const v2, -0x435c28f6    # -0.02f

    .line 757
    .line 758
    .line 759
    const v4, 0x3e051eb8    # 0.13f

    .line 760
    .line 761
    .line 762
    const v6, -0x435c28f6    # -0.02f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x3e99999a    # 0.3f

    .line 769
    .line 770
    .line 771
    const v18, 0x3d4ccccd    # 0.05f

    .line 772
    .line 773
    .line 774
    const v13, 0x3df5c28f    # 0.12f

    .line 775
    .line 776
    .line 777
    const/4 v14, 0x0

    .line 778
    const v15, 0x3e6147ae    # 0.22f

    .line 779
    .line 780
    .line 781
    const v16, 0x3ca3d70a    # 0.02f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x3e23d70a    # 0.16f

    .line 788
    .line 789
    .line 790
    const v2, 0x3e19999a    # 0.15f

    .line 791
    .line 792
    .line 793
    const v4, 0x3e570a3d    # 0.21f

    .line 794
    .line 795
    .line 796
    const v6, 0x3db851ec    # 0.09f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v0, 0x3e0f5c29    # 0.14f

    .line 803
    .line 804
    .line 805
    const v2, 0x3e051eb8    # 0.13f

    .line 806
    .line 807
    .line 808
    const v4, 0x3dcccccd    # 0.1f

    .line 809
    .line 810
    .line 811
    const v6, 0x3e75c28f    # 0.24f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v0, 0x3e9eb852    # 0.31f

    .line 818
    .line 819
    .line 820
    const v2, 0x3e428f5c    # 0.19f

    .line 821
    .line 822
    .line 823
    const v4, 0x3d23d70a    # 0.04f

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, -0x430a3d71    # -0.03f

    .line 830
    .line 831
    .line 832
    const v2, 0x3e9eb852    # 0.31f

    .line 833
    .line 834
    .line 835
    const v4, -0x43dc28f6    # -0.01f

    .line 836
    .line 837
    .line 838
    const v6, 0x3e6147ae    # 0.22f

    .line 839
    .line 840
    .line 841
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v0, -0x428a3d71    # -0.06f

    .line 845
    .line 846
    .line 847
    const v2, 0x3e2e147b    # 0.17f

    .line 848
    .line 849
    .line 850
    const v4, -0x421eb852    # -0.11f

    .line 851
    .line 852
    .line 853
    const v6, 0x3e75c28f    # 0.24f

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    const/16 v16, 0x3800

    .line 867
    .line 868
    const/16 v17, 0x0

    .line 869
    .line 870
    const/high16 v6, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const/high16 v8, 0x3f800000    # 1.0f

    .line 873
    .line 874
    const/4 v7, 0x0

    .line 875
    const/high16 v9, 0x3f800000    # 1.0f

    .line 876
    .line 877
    const/high16 v12, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/4 v13, 0x0

    .line 880
    const/4 v15, 0x0

    .line 881
    const-string v4, ""

    .line 882
    .line 883
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    sput-object v0, Landroidx/compose/material/icons/rounded/Forward5Kt;->_forward5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    return-object v0
.end method
