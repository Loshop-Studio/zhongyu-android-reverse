.class public final Landroidx/compose/material/icons/twotone/AddIcCallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddIcCall(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AddIcCallKt;->_addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AddIcCall"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const v6, 0x418b47ae    # 17.41f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3fd9999a    # -2.6f

    .line 79
    .line 80
    .line 81
    const v26, -0x4119999a    # -0.45f

    .line 82
    .line 83
    .line 84
    const v21, -0x409eb852    # -0.88f

    .line 85
    .line 86
    .line 87
    const v22, -0x4270a3d7    # -0.07f

    .line 88
    .line 89
    .line 90
    const/high16 v23, -0x40200000    # -1.75f

    .line 91
    .line 92
    const v24, -0x419eb852    # -0.22f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x40666666    # -1.2f

    .line 101
    .line 102
    .line 103
    const v6, 0x3f99999a    # 1.2f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v25, 0x40733333    # 3.8f

    .line 110
    .line 111
    .line 112
    const v26, 0x3f428f5c    # 0.76f

    .line 113
    .line 114
    .line 115
    const v21, 0x3f9ae148    # 1.21f

    .line 116
    .line 117
    .line 118
    const v22, 0x3ed1eb85    # 0.41f

    .line 119
    .line 120
    .line 121
    const v23, 0x401eb852    # 2.48f

    .line 122
    .line 123
    .line 124
    const v24, 0x3f2b851f    # 0.67f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x403eb852    # -1.51f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x40d147ae    # 6.54f

    .line 140
    .line 141
    .line 142
    const v6, 0x409e6666    # 4.95f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, -0x40400000    # -1.5f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x3f400000    # 0.75f

    .line 154
    .line 155
    const v26, 0x40728f5c    # 3.79f

    .line 156
    .line 157
    .line 158
    const v21, 0x3db851ec    # 0.09f

    .line 159
    .line 160
    .line 161
    const v22, 0x3fa8f5c3    # 1.32f

    .line 162
    .line 163
    .line 164
    const v23, 0x3eae147b    # 0.34f

    .line 165
    .line 166
    .line 167
    const v24, 0x40251eb8    # 2.58f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, -0x40651eb8    # -1.21f

    .line 174
    .line 175
    .line 176
    const v6, 0x3f99999a    # 1.2f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v25, -0x4119999a    # -0.45f

    .line 183
    .line 184
    .line 185
    const v26, -0x3fdae148    # -2.58f

    .line 186
    .line 187
    .line 188
    const v21, -0x418a3d71    # -0.24f

    .line 189
    .line 190
    .line 191
    const v22, -0x40ab851f    # -0.83f

    .line 192
    .line 193
    .line 194
    const v23, -0x413851ec    # -0.39f

    .line 195
    .line 196
    .line 197
    const v24, -0x40266666    # -1.7f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const v6, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const v8, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41a00000    # 20.0f

    .line 261
    .line 262
    const v2, 0x41a7999a    # 20.95f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/high16 v18, -0x40800000    # -1.0f

    .line 271
    .line 272
    const v13, 0x3f0ccccd    # 0.55f

    .line 273
    .line 274
    .line 275
    const/high16 v15, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const v16, -0x4119999a    # -0.45f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, -0x40800000    # -1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v15, -0x4119999a    # -0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x3f9b851f    # -3.57f

    .line 303
    .line 304
    .line 305
    const v18, -0x40ee147b    # -0.57f

    .line 306
    .line 307
    .line 308
    const/high16 v13, -0x40600000    # -1.25f

    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const v15, -0x3fe33333    # -2.45f

    .line 312
    .line 313
    .line 314
    const v16, -0x41b33333    # -0.2f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x416147ae    # -0.31f

    .line 321
    .line 322
    .line 323
    const v18, -0x42b33333    # -0.05f

    .line 324
    .line 325
    .line 326
    const v13, -0x42333333    # -0.1f

    .line 327
    .line 328
    .line 329
    const v14, -0x430a3d71    # -0.03f

    .line 330
    .line 331
    .line 332
    const v15, -0x41a8f5c3    # -0.21f

    .line 333
    .line 334
    .line 335
    const v16, -0x42b33333    # -0.05f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x40ca3d71    # -0.71f

    .line 342
    .line 343
    .line 344
    const v18, 0x3e947ae1    # 0.29f

    .line 345
    .line 346
    .line 347
    const v13, -0x417ae148    # -0.26f

    .line 348
    .line 349
    .line 350
    const/4 v14, 0x0

    .line 351
    const v15, -0x40fd70a4    # -0.51f

    .line 352
    .line 353
    .line 354
    const v16, 0x3dcccccd    # 0.1f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x3ff33333    # -2.2f

    .line 361
    .line 362
    .line 363
    const v2, 0x400ccccd    # 2.2f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x3f2d1eb8    # -6.59f

    .line 370
    .line 371
    .line 372
    const v18, -0x3f2d1eb8    # -6.59f

    .line 373
    .line 374
    .line 375
    const v13, -0x3fcae148    # -2.83f

    .line 376
    .line 377
    .line 378
    const v14, -0x4047ae14    # -1.44f

    .line 379
    .line 380
    .line 381
    const v15, -0x3f5b3333    # -5.15f

    .line 382
    .line 383
    .line 384
    const/high16 v16, -0x3f900000    # -3.75f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, -0x3ff28f5c    # -2.21f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x3e800000    # 0.25f

    .line 396
    .line 397
    const/high16 v18, -0x40800000    # -1.0f

    .line 398
    .line 399
    const v13, 0x3e8f5c29    # 0.28f

    .line 400
    .line 401
    .line 402
    const v14, -0x417ae148    # -0.26f

    .line 403
    .line 404
    .line 405
    const v15, 0x3eb851ec    # 0.36f

    .line 406
    .line 407
    .line 408
    const v16, -0x40d9999a    # -0.65f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41080000    # 8.5f

    .line 415
    .line 416
    const v18, 0x407ccccd    # 3.95f

    .line 417
    .line 418
    .line 419
    const v13, 0x410b3333    # 8.7f

    .line 420
    .line 421
    .line 422
    const v14, 0x40cccccd    # 6.4f

    .line 423
    .line 424
    .line 425
    const/high16 v15, 0x41080000    # 8.5f

    .line 426
    .line 427
    const v16, 0x40a66666    # 5.2f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, -0x40800000    # -1.0f

    .line 434
    .line 435
    const/high16 v18, -0x40800000    # -1.0f

    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const v14, -0x40f33333    # -0.55f

    .line 439
    .line 440
    .line 441
    const v15, -0x4119999a    # -0.45f

    .line 442
    .line 443
    .line 444
    const/high16 v16, -0x40800000    # -1.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x40800000    # 4.0f

    .line 450
    .line 451
    const v2, 0x403ccccd    # 2.95f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v18, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const v13, -0x40f33333    # -0.55f

    .line 460
    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const/high16 v15, -0x40800000    # -1.0f

    .line 464
    .line 465
    const v16, 0x3ee66666    # 0.45f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x41880000    # 17.0f

    .line 472
    .line 473
    const/high16 v18, 0x41880000    # 17.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x41163d71    # 9.39f

    .line 477
    .line 478
    .line 479
    const v15, 0x40f3851f    # 7.61f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x41880000    # 17.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x41833333    # 16.4f

    .line 491
    .line 492
    .line 493
    const v2, 0x4187ae14    # 16.96f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x40266666    # 2.6f

    .line 500
    .line 501
    .line 502
    const v18, 0x3ee66666    # 0.45f

    .line 503
    .line 504
    .line 505
    const v13, 0x3f59999a    # 0.85f

    .line 506
    .line 507
    .line 508
    const v14, 0x3e75c28f    # 0.24f

    .line 509
    .line 510
    .line 511
    const v15, 0x3fdc28f6    # 1.72f

    .line 512
    .line 513
    .line 514
    const v16, 0x3ec7ae14    # 0.39f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, -0x3f8ccccd    # -3.8f

    .line 526
    .line 527
    .line 528
    const v18, -0x40bd70a4    # -0.76f

    .line 529
    .line 530
    .line 531
    const v13, -0x40570a3d    # -1.32f

    .line 532
    .line 533
    .line 534
    const v14, -0x4247ae14    # -0.09f

    .line 535
    .line 536
    .line 537
    const v15, -0x3fd9999a    # -2.6f

    .line 538
    .line 539
    .line 540
    const v16, -0x414ccccd    # -0.35f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, -0x4067ae14    # -1.19f

    .line 547
    .line 548
    .line 549
    const v2, 0x3f99999a    # 1.2f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x40a0f5c3    # 5.03f

    .line 559
    .line 560
    .line 561
    const v2, 0x409e6666    # 4.95f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x3ee66666    # 0.45f

    .line 573
    .line 574
    .line 575
    const v18, 0x40251eb8    # 2.58f

    .line 576
    .line 577
    .line 578
    const v13, 0x3d8f5c29    # 0.07f

    .line 579
    .line 580
    .line 581
    const v14, 0x3f6147ae    # 0.88f

    .line 582
    .line 583
    .line 584
    const v15, 0x3e6147ae    # 0.22f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x3f9ae148    # 1.21f

    .line 593
    .line 594
    .line 595
    const v2, -0x40666666    # -1.2f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, -0x40c00000    # -0.75f

    .line 602
    .line 603
    const v18, -0x3f8d70a4    # -3.79f

    .line 604
    .line 605
    .line 606
    const v13, -0x41333333    # -0.4f

    .line 607
    .line 608
    .line 609
    const v14, -0x40651eb8    # -1.21f

    .line 610
    .line 611
    .line 612
    const v15, -0x40d70a3d    # -0.66f

    .line 613
    .line 614
    .line 615
    const v16, -0x3fe1eb85    # -2.47f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x41800000    # 16.0f

    .line 625
    .line 626
    const v2, 0x412f3333    # 10.95f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x40000000    # 2.0f

    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x40400000    # 3.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, -0x40000000    # -2.0f

    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, -0x40000000    # -2.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x40400000    # 3.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v0, 0x40000000    # 2.0f

    .line 676
    .line 677
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v0, 0x40400000    # 3.0f

    .line 681
    .line 682
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    const/16 v16, 0x3800

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const/high16 v6, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/high16 v8, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v12, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const/4 v14, 0x0

    .line 705
    const/4 v15, 0x0

    .line 706
    const-string v4, ""

    .line 707
    .line 708
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sput-object v0, Landroidx/compose/material/icons/twotone/AddIcCallKt;->_addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 717
    .line 718
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    return-object v0
.end method
