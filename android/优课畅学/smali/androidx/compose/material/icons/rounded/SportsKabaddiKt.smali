.class public final Landroidx/compose/material/icons/rounded/SportsKabaddiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsKabaddi(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsKabaddiKt;->_sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsKabaddi"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41840000    # 16.5f

    .line 71
    .line 72
    const v6, 0x401851ec    # 2.38f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, -0x40000000    # -2.0f

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v26, 0x40800000    # 4.0f

    .line 85
    .line 86
    const/16 v27, 0x0

    .line 87
    .line 88
    const/high16 v21, 0x40000000    # 2.0f

    .line 89
    .line 90
    const/high16 v22, 0x40000000    # 2.0f

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x1

    .line 95
    .line 96
    const/16 v25, 0x1

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v26, -0x3f800000    # -4.0f

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const/16 v16, 0x3800

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const/high16 v6, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/high16 v8, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/high16 v9, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/high16 v12, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    const-string v4, ""

    .line 129
    .line 130
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    const/4 v2, 0x0

    .line 144
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const v4, 0x412e147b    # 10.88f

    .line 161
    .line 162
    .line 163
    const/high16 v6, 0x41c00000    # 24.0f

    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3f933333    # -3.7f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, -0x3f6051ec    # -4.99f

    .line 175
    .line 176
    .line 177
    const v6, -0x3ff8f5c3    # -2.11f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, -0x3fd28f5c    # -2.71f

    .line 184
    .line 185
    .line 186
    const v26, 0x3f4f5c29    # 0.81f

    .line 187
    .line 188
    .line 189
    const v21, -0x40851eb8    # -0.98f

    .line 190
    .line 191
    .line 192
    const v22, -0x412e147b    # -0.41f

    .line 193
    .line 194
    .line 195
    const v23, -0x3ff851ec    # -2.12f

    .line 196
    .line 197
    .line 198
    const v24, -0x4270a3d7    # -0.07f

    .line 199
    .line 200
    .line 201
    move-object/from16 v20, v2

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x40800000    # -1.0f

    .line 211
    .line 212
    const v6, 0x3fcccccd    # 1.6f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3fa5c28f    # -3.41f

    .line 219
    .line 220
    .line 221
    const v26, 0x40147ae1    # 2.32f

    .line 222
    .line 223
    .line 224
    const v21, -0x40d47ae1    # -0.67f

    .line 225
    .line 226
    .line 227
    const v22, 0x3f970a3d    # 1.18f

    .line 228
    .line 229
    .line 230
    const v23, -0x400b851f    # -1.91f

    .line 231
    .line 232
    .line 233
    const v24, 0x4003d70a    # 2.06f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x3d75c28f    # 0.06f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x401d70a4    # 2.46f

    .line 246
    .line 247
    .line 248
    const v26, 0x3f95c28f    # 1.17f

    .line 249
    .line 250
    .line 251
    const v21, 0x3f30a3d7    # 0.69f

    .line 252
    .line 253
    .line 254
    const v22, 0x3f30a3d7    # 0.69f

    .line 255
    .line 256
    .line 257
    const v23, 0x3fc28f5c    # 1.52f

    .line 258
    .line 259
    .line 260
    const v24, 0x3f88f5c3    # 1.07f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x4005c28f    # 2.09f

    .line 267
    .line 268
    .line 269
    const v26, -0x402e147b    # -1.64f

    .line 270
    .line 271
    .line 272
    const v21, 0x3f4ccccd    # 0.8f

    .line 273
    .line 274
    .line 275
    const v22, -0x4128f5c3    # -0.42f

    .line 276
    .line 277
    .line 278
    const v24, -0x40851eb8    # -0.98f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x3f19999a    # 0.6f

    .line 285
    .line 286
    .line 287
    const/high16 v6, 0x40400000    # 3.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, -0x406b851f    # -1.16f

    .line 293
    .line 294
    .line 295
    const v6, 0x3f8ccccd    # 1.1f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41700000    # 15.0f

    .line 302
    .line 303
    const v6, 0x4166147b    # 14.38f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x3f428f5c    # 0.76f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x40b7ae14    # 5.74f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v26, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/16 v21, 0x0

    .line 326
    .line 327
    const v22, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    const v23, 0x3ee66666    # 0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v24, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/4 v4, 0x0

    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v26, -0x40800000    # -1.0f

    .line 343
    .line 344
    const v21, 0x3f0ccccd    # 0.55f

    .line 345
    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const/high16 v23, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v24, -0x4119999a    # -0.45f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, -0x3f600000    # -5.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, 0x40066666    # 2.1f

    .line 363
    .line 364
    .line 365
    const/high16 v6, -0x40000000    # -2.0f

    .line 366
    .line 367
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v4, 0x3fcf5c29    # 1.62f

    .line 371
    .line 372
    .line 373
    const v6, 0x40e6147b    # 7.19f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x3f828f5c    # 1.02f

    .line 380
    .line 381
    .line 382
    const v26, 0x3f4f5c29    # 0.81f

    .line 383
    .line 384
    .line 385
    const v21, 0x3de147ae    # 0.11f

    .line 386
    .line 387
    .line 388
    const v22, 0x3ef0a3d7    # 0.47f

    .line 389
    .line 390
    .line 391
    const v23, 0x3f07ae14    # 0.53f

    .line 392
    .line 393
    .line 394
    const v24, 0x3f4f5c29    # 0.81f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/4 v4, 0x0

    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v26, -0x406147ae    # -1.24f

    .line 405
    .line 406
    .line 407
    const v21, 0x3f28f5c3    # 0.66f

    .line 408
    .line 409
    .line 410
    const/16 v22, 0x0

    .line 411
    .line 412
    const v23, 0x3f933333    # 1.15f

    .line 413
    .line 414
    .line 415
    const v24, -0x40e66666    # -0.6f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v4, -0x4007ae14    # -1.94f

    .line 422
    .line 423
    .line 424
    const v6, -0x3ee3d70a    # -9.76f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, -0x40e147ae    # -0.62f

    .line 431
    .line 432
    .line 433
    const v6, -0x3fb9999a    # -3.1f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v4, 0x3fe66666    # 1.8f

    .line 440
    .line 441
    .line 442
    const v6, 0x3f333333    # 0.7f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v4, 0x4019999a    # 2.4f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v25, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v26, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/16 v21, 0x0

    .line 459
    .line 460
    const v22, 0x3f0ccccd    # 0.55f

    .line 461
    .line 462
    .line 463
    const v23, 0x3ee66666    # 0.45f

    .line 464
    .line 465
    .line 466
    const/high16 v24, 0x3f800000    # 1.0f

    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/4 v4, 0x0

    .line 472
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x41c00000    # 24.0f

    .line 476
    .line 477
    const v26, 0x412e147b    # 10.88f

    .line 478
    .line 479
    .line 480
    const v21, 0x41bc6666    # 23.55f

    .line 481
    .line 482
    .line 483
    const v22, 0x413e147b    # 11.88f

    .line 484
    .line 485
    .line 486
    const/high16 v23, 0x41c00000    # 24.0f

    .line 487
    .line 488
    const v24, 0x4136e148    # 11.43f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const/high16 v6, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 514
    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const v4, 0x4124a3d7    # 10.29f

    .line 537
    .line 538
    .line 539
    const v6, 0x410170a4    # 8.09f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v25, 0x3f3851ec    # 0.72f

    .line 546
    .line 547
    .line 548
    const v26, 0x3e947ae1    # 0.29f

    .line 549
    .line 550
    .line 551
    const v21, 0x3e6147ae    # 0.22f

    .line 552
    .line 553
    .line 554
    const v22, 0x3e19999a    # 0.15f

    .line 555
    .line 556
    .line 557
    const v23, 0x3ef0a3d7    # 0.47f

    .line 558
    .line 559
    .line 560
    const v24, 0x3e75c28f    # 0.24f

    .line 561
    .line 562
    .line 563
    move-object/from16 v20, v2

    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v25, 0x3ec28f5c    # 0.38f

    .line 569
    .line 570
    .line 571
    const v26, 0x3d23d70a    # 0.04f

    .line 572
    .line 573
    .line 574
    const v21, 0x3e051eb8    # 0.13f

    .line 575
    .line 576
    .line 577
    const v22, 0x3ca3d70a    # 0.02f

    .line 578
    .line 579
    .line 580
    const/high16 v23, 0x3e800000    # 0.25f

    .line 581
    .line 582
    const v24, 0x3d23d70a    # 0.04f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v4, -0x43dc28f6    # -0.01f

    .line 589
    .line 590
    .line 591
    const v6, 0x3ec28f5c    # 0.38f

    .line 592
    .line 593
    .line 594
    const v7, -0x42dc28f6    # -0.04f

    .line 595
    .line 596
    .line 597
    const v8, 0x3e851eb8    # 0.26f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v25, 0x3ebd70a4    # 0.37f

    .line 604
    .line 605
    .line 606
    const v26, -0x421eb852    # -0.11f

    .line 607
    .line 608
    .line 609
    const v22, -0x435c28f6    # -0.02f

    .line 610
    .line 611
    .line 612
    const v24, -0x428a3d71    # -0.06f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v25, 0x3f28f5c3    # 0.66f

    .line 619
    .line 620
    .line 621
    const v26, -0x411eb852    # -0.44f

    .line 622
    .line 623
    .line 624
    const v21, 0x3e75c28f    # 0.24f

    .line 625
    .line 626
    .line 627
    const v22, -0x42333333    # -0.1f

    .line 628
    .line 629
    .line 630
    const v23, 0x3ef0a3d7    # 0.47f

    .line 631
    .line 632
    .line 633
    const v24, -0x418a3d71    # -0.24f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v25, 0x3f0ccccd    # 0.55f

    .line 640
    .line 641
    .line 642
    const v26, -0x4019999a    # -1.8f

    .line 643
    .line 644
    .line 645
    const v21, 0x3efae148    # 0.49f

    .line 646
    .line 647
    .line 648
    const v22, -0x41051eb8    # -0.49f

    .line 649
    .line 650
    .line 651
    const v23, 0x3f2b851f    # 0.67f

    .line 652
    .line 653
    .line 654
    const v24, -0x406a3d71    # -1.17f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v25, 0x414ccccd    # 12.8f

    .line 661
    .line 662
    .line 663
    const/high16 v26, 0x40a00000    # 5.0f

    .line 664
    .line 665
    const v21, 0x41547ae1    # 13.28f

    .line 666
    .line 667
    .line 668
    const v22, 0x40b51eb8    # 5.66f

    .line 669
    .line 670
    .line 671
    const v23, 0x4151999a    # 13.1f

    .line 672
    .line 673
    .line 674
    const v24, 0x40a947ae    # 5.29f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v25, -0x40d70a3d    # -0.66f

    .line 681
    .line 682
    .line 683
    const v26, -0x411eb852    # -0.44f

    .line 684
    .line 685
    .line 686
    const v21, -0x41bd70a4    # -0.19f

    .line 687
    .line 688
    .line 689
    const v22, -0x41bd70a4    # -0.19f

    .line 690
    .line 691
    .line 692
    const v23, -0x4128f5c3    # -0.42f

    .line 693
    .line 694
    .line 695
    const v24, -0x4151eb85    # -0.34f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v25, -0x41428f5c    # -0.37f

    .line 702
    .line 703
    .line 704
    const v26, -0x421eb852    # -0.11f

    .line 705
    .line 706
    .line 707
    const v21, -0x420a3d71    # -0.12f

    .line 708
    .line 709
    .line 710
    const v22, -0x42b33333    # -0.05f

    .line 711
    .line 712
    .line 713
    const v23, -0x418a3d71    # -0.24f

    .line 714
    .line 715
    .line 716
    const v24, -0x4247ae14    # -0.09f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v4, -0x41800000    # -0.25f

    .line 723
    .line 724
    const v6, -0x413d70a4    # -0.38f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v25, -0x414ccccd    # -0.35f

    .line 731
    .line 732
    .line 733
    const v26, 0x3cf5c28f    # 0.03f

    .line 734
    .line 735
    .line 736
    const/16 v22, 0x0

    .line 737
    .line 738
    const v23, -0x41947ae1    # -0.23f

    .line 739
    .line 740
    .line 741
    const v24, 0x3c23d70a    # 0.01f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v25, -0x412e147b    # -0.41f

    .line 748
    .line 749
    .line 750
    const v26, 0x3de147ae    # 0.11f

    .line 751
    .line 752
    .line 753
    const v21, -0x41f0a3d7    # -0.14f

    .line 754
    .line 755
    .line 756
    const v22, 0x3ca3d70a    # 0.02f

    .line 757
    .line 758
    .line 759
    const v23, -0x4170a3d7    # -0.28f

    .line 760
    .line 761
    .line 762
    const v24, 0x3d75c28f    # 0.06f

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v25, 0x411fae14    # 9.98f

    .line 769
    .line 770
    .line 771
    const/high16 v26, 0x40a00000    # 5.0f

    .line 772
    .line 773
    const v21, 0x41266666    # 10.4f

    .line 774
    .line 775
    .line 776
    const v22, 0x40951eb8    # 4.66f

    .line 777
    .line 778
    .line 779
    const v23, 0x4122b852    # 10.17f

    .line 780
    .line 781
    .line 782
    const v24, 0x4099eb85    # 4.81f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v25, 0x4116e148    # 9.43f

    .line 789
    .line 790
    .line 791
    const v26, 0x40c0f5c3    # 6.03f

    .line 792
    .line 793
    .line 794
    const v21, 0x411ae148    # 9.68f

    .line 795
    .line 796
    .line 797
    const v22, 0x40a947ae    # 5.29f

    .line 798
    .line 799
    .line 800
    const/high16 v23, 0x41180000    # 9.5f

    .line 801
    .line 802
    const v24, 0x40b51eb8    # 5.66f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v25, 0x3f0ccccd    # 0.55f

    .line 809
    .line 810
    .line 811
    const v26, 0x3fe66666    # 1.8f

    .line 812
    .line 813
    .line 814
    const v21, -0x420a3d71    # -0.12f

    .line 815
    .line 816
    .line 817
    const v22, 0x3f2147ae    # 0.63f

    .line 818
    .line 819
    .line 820
    const v23, 0x3d75c28f    # 0.06f

    .line 821
    .line 822
    .line 823
    const v24, 0x3fa7ae14    # 1.31f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v25, 0x4124a3d7    # 10.29f

    .line 830
    .line 831
    .line 832
    const v26, 0x410170a4    # 8.09f

    .line 833
    .line 834
    .line 835
    const v21, 0x41211eb8    # 10.07f

    .line 836
    .line 837
    .line 838
    const v22, 0x40fdc28f    # 7.93f

    .line 839
    .line 840
    .line 841
    const v23, 0x4122e148    # 10.18f

    .line 842
    .line 843
    .line 844
    const v24, 0x410028f6    # 8.01f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    const/high16 v6, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const/high16 v8, 0x3f800000    # 1.0f

    .line 860
    .line 861
    const/4 v7, 0x0

    .line 862
    const-string v4, ""

    .line 863
    .line 864
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 865
    .line 866
    .line 867
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 872
    .line 873
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 874
    .line 875
    .line 876
    move-result-wide v6

    .line 877
    const/4 v0, 0x0

    .line 878
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 882
    .line 883
    .line 884
    move-result v10

    .line 885
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 886
    .line 887
    .line 888
    move-result v11

    .line 889
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 892
    .line 893
    .line 894
    const v0, 0x4133d70a    # 11.24f

    .line 895
    .line 896
    .line 897
    const v2, 0x4128f5c3    # 10.56f

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v0, -0x40000000    # -2.0f

    .line 904
    .line 905
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v17, -0x416147ae    # -0.31f

    .line 909
    .line 910
    .line 911
    const v18, -0x417ae148    # -0.26f

    .line 912
    .line 913
    .line 914
    const v13, -0x42333333    # -0.1f

    .line 915
    .line 916
    .line 917
    const v14, -0x42333333    # -0.1f

    .line 918
    .line 919
    .line 920
    const v15, -0x41b33333    # -0.2f

    .line 921
    .line 922
    .line 923
    const v16, -0x41c7ae14    # -0.18f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v17, 0x41035c29    # 8.21f

    .line 930
    .line 931
    .line 932
    const v18, 0x410051ec    # 8.02f

    .line 933
    .line 934
    .line 935
    const v13, 0x410b5c29    # 8.71f

    .line 936
    .line 937
    .line 938
    const v14, 0x41028f5c    # 8.16f

    .line 939
    .line 940
    .line 941
    const v15, 0x41075c29    # 8.46f

    .line 942
    .line 943
    .line 944
    const v16, 0x4100f5c3    # 8.06f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v17, 0x40fa8f5c    # 7.83f

    .line 951
    .line 952
    .line 953
    const v18, 0x40ff5c29    # 7.98f

    .line 954
    .line 955
    .line 956
    const v13, 0x410147ae    # 8.08f

    .line 957
    .line 958
    .line 959
    const v14, 0x40ffae14    # 7.99f

    .line 960
    .line 961
    .line 962
    const v15, 0x40feb852    # 7.96f

    .line 963
    .line 964
    .line 965
    const v16, 0x40ff5c29    # 7.98f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v17, -0x404b851f    # -1.41f

    .line 972
    .line 973
    .line 974
    const v18, 0x3f170a3d    # 0.59f

    .line 975
    .line 976
    .line 977
    const v13, -0x40fd70a4    # -0.51f

    .line 978
    .line 979
    .line 980
    const/4 v14, 0x0

    .line 981
    const v15, -0x407d70a4    # -1.02f

    .line 982
    .line 983
    .line 984
    const v16, 0x3e4ccccd    # 0.2f

    .line 985
    .line 986
    .line 987
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    const v0, -0x3faa3d71    # -3.34f

    .line 991
    .line 992
    .line 993
    const v2, 0x4055c28f    # 3.34f

    .line 994
    .line 995
    .line 996
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v17, -0x40eb851f    # -0.58f

    .line 1000
    .line 1001
    .line 1002
    const v18, 0x3fc51eb8    # 1.54f

    .line 1003
    .line 1004
    .line 1005
    const v13, -0x412e147b    # -0.41f

    .line 1006
    .line 1007
    .line 1008
    const v14, 0x3ed1eb85    # 0.41f

    .line 1009
    .line 1010
    .line 1011
    const v15, -0x40e147ae    # -0.62f

    .line 1012
    .line 1013
    .line 1014
    const v16, 0x3f7ae148    # 0.98f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v17, 0x40270a3d    # 2.61f

    .line 1021
    .line 1022
    .line 1023
    const/high16 v18, 0x41600000    # 14.0f

    .line 1024
    .line 1025
    const/high16 v13, 0x40200000    # 2.5f

    .line 1026
    .line 1027
    const v14, 0x415a147b    # 13.63f

    .line 1028
    .line 1029
    .line 1030
    const v15, 0x40228f5c    # 2.54f

    .line 1031
    .line 1032
    .line 1033
    const v16, 0x415d1eb8    # 13.82f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v0, 0x3f88f5c3    # 1.07f

    .line 1040
    .line 1041
    .line 1042
    const v2, 0x403ccccd    # 2.95f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v0, -0x3fc51eb8    # -2.92f

    .line 1049
    .line 1050
    .line 1051
    const v2, 0x403ae148    # 2.92f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/16 v17, 0x0

    .line 1058
    .line 1059
    const v18, 0x3fb47ae1    # 1.41f

    .line 1060
    .line 1061
    .line 1062
    const v13, -0x413851ec    # -0.39f

    .line 1063
    .line 1064
    .line 1065
    const v14, 0x3ec7ae14    # 0.39f

    .line 1066
    .line 1067
    .line 1068
    const v15, -0x413851ec    # -0.39f

    .line 1069
    .line 1070
    .line 1071
    const v16, 0x3f828f5c    # 1.02f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const/4 v0, 0x0

    .line 1078
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v17, 0x3fb47ae1    # 1.41f

    .line 1082
    .line 1083
    .line 1084
    const/16 v18, 0x0

    .line 1085
    .line 1086
    const v13, 0x3ec7ae14    # 0.39f

    .line 1087
    .line 1088
    .line 1089
    const v15, 0x3f828f5c    # 1.02f

    .line 1090
    .line 1091
    .line 1092
    const v16, 0x3ec7ae14    # 0.39f

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v0, 0x40628f5c    # 3.54f

    .line 1099
    .line 1100
    .line 1101
    const v2, -0x3f9d70a4    # -3.54f

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v0, -0x3ff1eb85    # -2.22f

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1114
    .line 1115
    const/high16 v2, 0x41860000    # 16.75f

    .line 1116
    .line 1117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v0, 0x408428f6    # 4.13f

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1124
    .line 1125
    .line 1126
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1127
    .line 1128
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1129
    .line 1130
    const/4 v13, 0x0

    .line 1131
    const v14, 0x3f0ccccd    # 0.55f

    .line 1132
    .line 1133
    .line 1134
    const v15, 0x3ee66666    # 0.45f

    .line 1135
    .line 1136
    .line 1137
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1138
    .line 1139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    const/4 v0, 0x0

    .line 1143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const/high16 v18, -0x40800000    # -1.0f

    .line 1147
    .line 1148
    const v13, 0x3f0ccccd    # 0.55f

    .line 1149
    .line 1150
    .line 1151
    const/4 v14, 0x0

    .line 1152
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1153
    .line 1154
    const v16, -0x4119999a    # -0.45f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const/high16 v0, -0x3f600000    # -5.0f

    .line 1161
    .line 1162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v0, -0x3ff851ec    # -2.12f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const v0, 0x40170a3d    # 2.36f

    .line 1172
    .line 1173
    .line 1174
    const v2, -0x3fe8f5c3    # -2.36f

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    .line 1180
    const v0, 0x3f35c28f    # 0.71f

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const/4 v0, 0x0

    .line 1187
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v17, 0x40728f5c    # 3.79f

    .line 1191
    .line 1192
    .line 1193
    const v18, 0x3ff851ec    # 1.94f

    .line 1194
    .line 1195
    .line 1196
    const v13, 0x3f828f5c    # 1.02f

    .line 1197
    .line 1198
    .line 1199
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1200
    .line 1201
    const v15, 0x4011eb85    # 2.28f

    .line 1202
    .line 1203
    .line 1204
    const v16, 0x3fd851ec    # 1.69f

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    const v17, 0x3f947ae1    # 1.16f

    .line 1211
    .line 1212
    .line 1213
    const v18, -0x40733333    # -1.1f

    .line 1214
    .line 1215
    .line 1216
    const v13, 0x3f23d70a    # 0.64f

    .line 1217
    .line 1218
    .line 1219
    const v14, 0x3de147ae    # 0.11f

    .line 1220
    .line 1221
    .line 1222
    const v15, 0x3f9ae148    # 1.21f

    .line 1223
    .line 1224
    .line 1225
    const v16, -0x4119999a    # -0.45f

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1232
    .line 1233
    .line 1234
    const v17, -0x40a147ae    # -0.87f

    .line 1235
    .line 1236
    .line 1237
    const v18, -0x408f5c29    # -0.94f

    .line 1238
    .line 1239
    .line 1240
    const v13, -0x430a3d71    # -0.03f

    .line 1241
    .line 1242
    .line 1243
    const v14, -0x410a3d71    # -0.48f

    .line 1244
    .line 1245
    .line 1246
    const v15, -0x41333333    # -0.4f

    .line 1247
    .line 1248
    .line 1249
    const v16, -0x40a147ae    # -0.87f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v17, 0x4133d70a    # 11.24f

    .line 1256
    .line 1257
    .line 1258
    const v18, 0x4128f5c3    # 10.56f

    .line 1259
    .line 1260
    .line 1261
    const v13, 0x414e6666    # 12.9f

    .line 1262
    .line 1263
    .line 1264
    const v14, 0x413d47ae    # 11.83f

    .line 1265
    .line 1266
    .line 1267
    const v15, 0x413f851f    # 11.97f

    .line 1268
    .line 1269
    .line 1270
    const v16, 0x4134a3d7    # 11.29f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    const/16 v16, 0x3800

    .line 1284
    .line 1285
    const/16 v17, 0x0

    .line 1286
    .line 1287
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1288
    .line 1289
    const/4 v7, 0x0

    .line 1290
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1291
    .line 1292
    const/4 v13, 0x0

    .line 1293
    const/4 v14, 0x0

    .line 1294
    const/4 v15, 0x0

    .line 1295
    const-string v4, ""

    .line 1296
    .line 1297
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsKabaddiKt;->_sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1306
    .line 1307
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1308
    .line 1309
    .line 1310
    return-object v0
.end method
