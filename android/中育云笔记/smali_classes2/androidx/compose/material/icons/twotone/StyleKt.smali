.class public final Landroidx/compose/material/icons/twotone/StyleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _style:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStyle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StyleKt;->_style:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Style"

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
    const v4, 0x4173851f    # 15.22f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40980000    # 4.75f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40f947ae    # 7.79f

    .line 79
    .line 80
    .line 81
    const v6, 0x40fbd70a    # 7.87f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x413f5c29    # 11.96f

    .line 88
    .line 89
    .line 90
    const v6, 0x409eb852    # 4.96f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3fbccccd    # -3.05f

    .line 97
    .line 98
    .line 99
    const v6, 0x40eb3333    # 7.35f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, -0x3f6147ae    # -4.96f

    .line 106
    .line 107
    .line 108
    const v6, -0x3ec0cccd    # -11.95f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x41200000    # 10.0f

    .line 118
    .line 119
    const/high16 v6, 0x41300000    # 11.0f

    .line 120
    .line 121
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, -0x40800000    # -1.0f

    .line 125
    .line 126
    const/high16 v26, -0x40800000    # -1.0f

    .line 127
    .line 128
    const v21, -0x40f33333    # -0.55f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, -0x40800000    # -1.0f

    .line 134
    .line 135
    const v24, -0x4119999a    # -0.45f

    .line 136
    .line 137
    .line 138
    move-object/from16 v20, v2

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x3ee66666    # 0.45f

    .line 144
    .line 145
    .line 146
    const/high16 v6, -0x40800000    # -1.0f

    .line 147
    .line 148
    const/high16 v7, 0x3f800000    # 1.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v6, 0x3f800000    # 1.0f

    .line 154
    .line 155
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x4119999a    # -0.45f

    .line 159
    .line 160
    .line 161
    const/high16 v6, -0x40800000    # -1.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/16 v16, 0x3800

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const v6, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const v8, 0x3e99999a    # 0.3f

    .line 181
    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const/high16 v9, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/high16 v12, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/4 v13, 0x0

    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v2, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const v4, 0x4077ae14    # 3.87f

    .line 224
    .line 225
    .line 226
    const v6, 0x4132e148    # 11.18f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, -0x3fe47ae1    # -2.43f

    .line 233
    .line 234
    .line 235
    const v6, 0x40bb851f    # 5.86f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x3f8b851f    # 1.09f

    .line 242
    .line 243
    .line 244
    const v26, 0x40270a3d    # 2.61f

    .line 245
    .line 246
    .line 247
    const v21, -0x412e147b    # -0.41f

    .line 248
    .line 249
    .line 250
    const v22, 0x3f828f5c    # 1.02f

    .line 251
    .line 252
    .line 253
    const v23, 0x3da3d70a    # 0.08f

    .line 254
    .line 255
    .line 256
    const v24, 0x400c28f6    # 2.19f

    .line 257
    .line 258
    .line 259
    move-object/from16 v20, v2

    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x3fab851f    # 1.34f

    .line 265
    .line 266
    .line 267
    const v6, 0x3f0f5c29    # 0.56f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, -0x3eef851f    # -9.03f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, 0x41b03d71    # 22.03f

    .line 283
    .line 284
    .line 285
    const v6, 0x417f3333    # 15.95f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x41888f5c    # 17.07f

    .line 292
    .line 293
    .line 294
    const v6, 0x407eb852    # 3.98f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v25, -0x401851ec    # -1.81f

    .line 301
    .line 302
    .line 303
    const v26, -0x40628f5c    # -1.23f

    .line 304
    .line 305
    .line 306
    const v21, -0x416147ae    # -0.31f

    .line 307
    .line 308
    .line 309
    const/high16 v22, -0x40c00000    # -0.75f

    .line 310
    .line 311
    const v23, -0x407ae148    # -1.04f

    .line 312
    .line 313
    .line 314
    const v24, -0x40651eb8    # -1.21f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v25, -0x40b5c28f    # -0.79f

    .line 321
    .line 322
    .line 323
    const v26, 0x3e19999a    # 0.15f

    .line 324
    .line 325
    .line 326
    const v21, -0x417ae148    # -0.26f

    .line 327
    .line 328
    .line 329
    const/16 v22, 0x0

    .line 330
    .line 331
    const v23, -0x40f851ec    # -0.53f

    .line 332
    .line 333
    .line 334
    const v24, 0x3d23d70a    # 0.04f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, 0x40e33333    # 7.1f

    .line 341
    .line 342
    .line 343
    const v6, 0x40be6666    # 5.95f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v25, -0x40628f5c    # -1.23f

    .line 350
    .line 351
    .line 352
    const v26, 0x3fe66666    # 1.8f

    .line 353
    .line 354
    .line 355
    const/high16 v21, -0x40c00000    # -0.75f

    .line 356
    .line 357
    const v22, 0x3e9eb852    # 0.31f

    .line 358
    .line 359
    .line 360
    const v23, -0x40651eb8    # -1.21f

    .line 361
    .line 362
    .line 363
    const v24, 0x3f83d70a    # 1.03f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v25, 0x3e19999a    # 0.15f

    .line 370
    .line 371
    .line 372
    const v26, 0x3f4ccccd    # 0.8f

    .line 373
    .line 374
    .line 375
    const v21, -0x43dc28f6    # -0.01f

    .line 376
    .line 377
    .line 378
    const v22, 0x3e8a3d71    # 0.27f

    .line 379
    .line 380
    .line 381
    const v23, 0x3d23d70a    # 0.04f

    .line 382
    .line 383
    .line 384
    const v24, 0x3f0a3d71    # 0.54f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v4, 0x413f851f    # 11.97f

    .line 391
    .line 392
    .line 393
    const v6, 0x409eb852    # 4.96f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x3fea3d71    # 1.83f

    .line 400
    .line 401
    .line 402
    const v26, 0x3f9d70a4    # 1.23f

    .line 403
    .line 404
    .line 405
    const v21, 0x3e9eb852    # 0.31f

    .line 406
    .line 407
    .line 408
    const v22, 0x3f428f5c    # 0.76f

    .line 409
    .line 410
    .line 411
    const v23, 0x3f866666    # 1.05f

    .line 412
    .line 413
    .line 414
    const v24, 0x3f9c28f6    # 1.22f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v25, 0x3f451eb8    # 0.77f

    .line 421
    .line 422
    .line 423
    const v26, -0x41e66666    # -0.15f

    .line 424
    .line 425
    .line 426
    const v21, 0x3e851eb8    # 0.26f

    .line 427
    .line 428
    .line 429
    const/16 v22, 0x0

    .line 430
    .line 431
    const v23, 0x3f051eb8    # 0.52f

    .line 432
    .line 433
    .line 434
    const v24, -0x42b33333    # -0.05f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x40eb851f    # 7.36f

    .line 441
    .line 442
    .line 443
    const v6, -0x3fbccccd    # -3.05f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, 0x3f8b851f    # 1.09f

    .line 450
    .line 451
    .line 452
    const v26, -0x3fd9999a    # -2.6f

    .line 453
    .line 454
    .line 455
    const v21, 0x3f828f5c    # 1.02f

    .line 456
    .line 457
    .line 458
    const v22, -0x4128f5c3    # -0.42f

    .line 459
    .line 460
    .line 461
    const v23, 0x3fc147ae    # 1.51f

    .line 462
    .line 463
    .line 464
    const v24, -0x40347ae1    # -1.59f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v4, 0x414d47ae    # 12.83f

    .line 474
    .line 475
    .line 476
    const/high16 v6, 0x419e0000    # 19.75f

    .line 477
    .line 478
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x40f947ae    # 7.79f

    .line 482
    .line 483
    .line 484
    const v6, 0x40fbd70a    # 7.87f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v4, -0x3fbd70a4    # -3.04f

    .line 491
    .line 492
    .line 493
    const v6, 0x40eb3333    # 7.35f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v4, 0x3c23d70a    # 0.01f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x409e6666    # 4.95f

    .line 506
    .line 507
    .line 508
    const v6, 0x413f3333    # 11.95f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, -0x3f14cccd    # -7.35f

    .line 515
    .line 516
    .line 517
    const v6, 0x40433333    # 3.05f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/high16 v6, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/high16 v8, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 547
    .line 548
    .line 549
    move-result-wide v6

    .line 550
    const/4 v2, 0x0

    .line 551
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 555
    .line 556
    .line 557
    move-result v10

    .line 558
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 565
    .line 566
    .line 567
    const/high16 v4, 0x41100000    # 9.0f

    .line 568
    .line 569
    const/high16 v6, 0x41300000    # 11.0f

    .line 570
    .line 571
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/4 v4, 0x0

    .line 575
    const/high16 v6, -0x40800000    # -1.0f

    .line 576
    .line 577
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v26, 0x40000000    # 2.0f

    .line 581
    .line 582
    const/16 v27, 0x0

    .line 583
    .line 584
    const/high16 v21, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v22, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/16 v23, 0x0

    .line 589
    .line 590
    const/16 v24, 0x1

    .line 591
    .line 592
    const/16 v25, 0x1

    .line 593
    .line 594
    move-object/from16 v20, v2

    .line 595
    .line 596
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v26, -0x40000000    # -2.0f

    .line 600
    .line 601
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    const/high16 v6, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    const-string v4, ""

    .line 612
    .line 613
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 614
    .line 615
    .line 616
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 621
    .line 622
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 623
    .line 624
    .line 625
    move-result-wide v6

    .line 626
    const/4 v0, 0x0

    .line 627
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 631
    .line 632
    .line 633
    move-result v10

    .line 634
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 635
    .line 636
    .line 637
    move-result v11

    .line 638
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 641
    .line 642
    .line 643
    const v0, 0x411547ae    # 9.33f

    .line 644
    .line 645
    .line 646
    const/high16 v2, 0x41ae0000    # 21.75f

    .line 647
    .line 648
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x3fa33333    # -3.45f

    .line 652
    .line 653
    .line 654
    const v2, -0x3efa8f5c    # -8.34f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x40cae148    # 6.34f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v17, 0x40000000    # 2.0f

    .line 667
    .line 668
    const/high16 v18, 0x40000000    # 2.0f

    .line 669
    .line 670
    const v14, 0x3f8ccccd    # 1.1f

    .line 671
    .line 672
    .line 673
    const v15, 0x3f666666    # 0.9f

    .line 674
    .line 675
    .line 676
    const/high16 v16, 0x40000000    # 2.0f

    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x3fb9999a    # 1.45f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/16 v16, 0x3800

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v12, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v14, 0x0

    .line 704
    const/4 v15, 0x0

    .line 705
    const-string v4, ""

    .line 706
    .line 707
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    sput-object v0, Landroidx/compose/material/icons/twotone/StyleKt;->_style:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    return-object v0
.end method
