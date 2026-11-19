.class public final Landroidx/compose/material/icons/filled/LoyaltyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLoyalty(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LoyaltyKt;->_loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Filled.Loyalty"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const v0, 0x41ab47ae    # 21.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x413947ae    # 11.58f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x41300000    # 11.0f

    .line 85
    .line 86
    const/high16 v18, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v13, 0x4140cccd    # 12.05f

    .line 89
    .line 90
    .line 91
    const v14, 0x400e147b    # 2.22f

    .line 92
    .line 93
    .line 94
    const v15, 0x4138cccd    # 11.55f

    .line 95
    .line 96
    .line 97
    const/high16 v16, 0x40000000    # 2.0f

    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x40000000    # 2.0f

    .line 103
    .line 104
    const/high16 v2, 0x40800000    # 4.0f

    .line 105
    .line 106
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, -0x40000000    # -2.0f

    .line 110
    .line 111
    const v13, -0x40733333    # -1.1f

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const/high16 v15, -0x40000000    # -2.0f

    .line 116
    .line 117
    const v16, 0x3f666666    # 0.9f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40e00000    # 7.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, 0x3f170a3d    # 0.59f

    .line 129
    .line 130
    .line 131
    const v18, 0x3fb5c28f    # 1.42f

    .line 132
    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, 0x3f0ccccd    # 0.55f

    .line 136
    .line 137
    .line 138
    const v15, 0x3e6147ae    # 0.22f

    .line 139
    .line 140
    .line 141
    const v16, 0x3f866666    # 1.05f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41100000    # 9.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x3fb47ae1    # 1.41f

    .line 153
    .line 154
    .line 155
    const v18, 0x3f147ae1    # 0.58f

    .line 156
    .line 157
    .line 158
    const v13, 0x3eb851ec    # 0.36f

    .line 159
    .line 160
    .line 161
    const v14, 0x3eb851ec    # 0.36f

    .line 162
    .line 163
    .line 164
    const v15, 0x3f5c28f6    # 0.86f

    .line 165
    .line 166
    .line 167
    const v16, 0x3f147ae1    # 0.58f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v18, -0x40e8f5c3    # -0.59f

    .line 174
    .line 175
    .line 176
    const v13, 0x3f0ccccd    # 0.55f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const v15, 0x3f866666    # 1.05f

    .line 181
    .line 182
    .line 183
    const v16, -0x419eb852    # -0.22f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, -0x3f200000    # -7.0f

    .line 190
    .line 191
    const/high16 v2, 0x40e00000    # 7.0f

    .line 192
    .line 193
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x3f170a3d    # 0.59f

    .line 197
    .line 198
    .line 199
    const v18, -0x404b851f    # -1.41f

    .line 200
    .line 201
    .line 202
    const v13, 0x3ebd70a4    # 0.37f

    .line 203
    .line 204
    .line 205
    const v14, -0x4147ae14    # -0.36f

    .line 206
    .line 207
    .line 208
    const v15, 0x3f170a3d    # 0.59f

    .line 209
    .line 210
    .line 211
    const v16, -0x40a3d70a    # -0.86f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, -0x40e8f5c3    # -0.59f

    .line 218
    .line 219
    .line 220
    const v18, -0x404a3d71    # -1.42f

    .line 221
    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, -0x40f33333    # -0.55f

    .line 225
    .line 226
    .line 227
    const v15, -0x41947ae1    # -0.23f

    .line 228
    .line 229
    .line 230
    const v16, -0x407851ec    # -1.06f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x40b00000    # 5.5f

    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40800000    # 4.0f

    .line 245
    .line 246
    const/high16 v18, 0x40b00000    # 5.5f

    .line 247
    .line 248
    const v13, 0x409570a4    # 4.67f

    .line 249
    .line 250
    .line 251
    const/high16 v14, 0x40e00000    # 7.0f

    .line 252
    .line 253
    const/high16 v15, 0x40800000    # 4.0f

    .line 254
    .line 255
    const v16, 0x40ca8f5c    # 6.33f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x409570a4    # 4.67f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x40800000    # 4.0f

    .line 265
    .line 266
    const/high16 v4, 0x40b00000    # 5.5f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v2, 0x40b00000    # 5.5f

    .line 272
    .line 273
    const/high16 v4, 0x40e00000    # 7.0f

    .line 274
    .line 275
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x40ca8f5c    # 6.33f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x418a28f6    # 17.27f

    .line 288
    .line 289
    .line 290
    const v2, 0x417451ec    # 15.27f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x41500000    # 13.0f

    .line 297
    .line 298
    const v2, 0x419c51ec    # 19.54f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, -0x3f775c29    # -4.27f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x41000000    # 8.0f

    .line 311
    .line 312
    const/high16 v18, 0x41580000    # 13.5f

    .line 313
    .line 314
    const v13, 0x41047ae1    # 8.28f

    .line 315
    .line 316
    .line 317
    const v14, 0x416cf5c3    # 14.81f

    .line 318
    .line 319
    .line 320
    const/high16 v15, 0x41000000    # 8.0f

    .line 321
    .line 322
    const v16, 0x41630a3d    # 14.19f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x40200000    # 2.5f

    .line 329
    .line 330
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, -0x404f5c29    # -1.38f

    .line 334
    .line 335
    .line 336
    const v15, 0x3f8f5c29    # 1.12f

    .line 337
    .line 338
    .line 339
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3fe28f5c    # 1.77f

    .line 345
    .line 346
    .line 347
    const v18, 0x3f3d70a4    # 0.74f

    .line 348
    .line 349
    .line 350
    const v13, 0x3f30a3d7    # 0.69f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const v15, 0x3fa8f5c3    # 1.32f

    .line 355
    .line 356
    .line 357
    const v16, 0x3e8f5c29    # 0.28f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x3f3851ec    # 0.72f

    .line 364
    .line 365
    .line 366
    const v2, 0x3f3ae148    # 0.73f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, -0x40c51eb8    # -0.73f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v18, -0x40c51eb8    # -0.73f

    .line 379
    .line 380
    .line 381
    const v13, 0x3ee66666    # 0.45f

    .line 382
    .line 383
    .line 384
    const v14, -0x4119999a    # -0.45f

    .line 385
    .line 386
    .line 387
    const v15, 0x3f8a3d71    # 1.08f

    .line 388
    .line 389
    .line 390
    const v16, -0x40c51eb8    # -0.73f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x40200000    # 2.5f

    .line 397
    .line 398
    const/high16 v18, 0x40200000    # 2.5f

    .line 399
    .line 400
    const v13, 0x3fb0a3d7    # 1.38f

    .line 401
    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const/high16 v15, 0x40200000    # 2.5f

    .line 405
    .line 406
    const v16, 0x3f8f5c29    # 1.12f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x40c51eb8    # -0.73f

    .line 413
    .line 414
    .line 415
    const v18, 0x3fe28f5c    # 1.77f

    .line 416
    .line 417
    .line 418
    const/4 v13, 0x0

    .line 419
    const v14, 0x3f30a3d7    # 0.69f

    .line 420
    .line 421
    .line 422
    const v15, -0x4170a3d7    # -0.28f

    .line 423
    .line 424
    .line 425
    const v16, 0x3fa8f5c3    # 1.32f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    const/16 v16, 0x3800

    .line 439
    .line 440
    const/16 v17, 0x0

    .line 441
    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/high16 v8, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    const/high16 v9, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/high16 v12, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Landroidx/compose/material/icons/filled/LoyaltyKt;->_loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v0
.end method
