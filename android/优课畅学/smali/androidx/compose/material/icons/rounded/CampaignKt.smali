.class public final Landroidx/compose/material/icons/rounded/CampaignKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _campaign:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCampaign(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CampaignKt;->_campaign:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Campaign"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v26, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const v23, 0x3ee66666    # 0.45f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x3f800000    # 1.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40000000    # 2.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v26, -0x40800000    # -1.0f

    .line 105
    .line 106
    const v21, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const/high16 v23, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v24, -0x4119999a    # -0.45f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, -0x40800000    # -1.0f

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x40f33333    # -0.55f

    .line 128
    .line 129
    .line 130
    const v23, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v24, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x40000000    # -2.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41900000    # 18.0f

    .line 144
    .line 145
    const/high16 v26, 0x41400000    # 12.0f

    .line 146
    .line 147
    const v21, 0x4193999a    # 18.45f

    .line 148
    .line 149
    .line 150
    const/high16 v22, 0x41300000    # 11.0f

    .line 151
    .line 152
    const/high16 v23, 0x41900000    # 18.0f

    .line 153
    .line 154
    const v24, 0x41373333    # 11.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const v4, 0x4184b852    # 16.59f

    .line 216
    .line 217
    .line 218
    const v6, 0x41868f5c    # 16.82f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x3e4ccccd    # 0.2f

    .line 225
    .line 226
    .line 227
    const v26, 0x3faf5c29    # 1.37f

    .line 228
    .line 229
    .line 230
    const v21, -0x41570a3d    # -0.33f

    .line 231
    .line 232
    .line 233
    const v22, 0x3ee147ae    # 0.44f

    .line 234
    .line 235
    .line 236
    const v23, -0x418a3d71    # -0.24f

    .line 237
    .line 238
    .line 239
    const v24, 0x3f866666    # 1.05f

    .line 240
    .line 241
    .line 242
    move-object/from16 v20, v2

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, 0x3fcf5c29    # 1.62f

    .line 248
    .line 249
    .line 250
    const v26, 0x3f9ae148    # 1.21f

    .line 251
    .line 252
    .line 253
    const v21, 0x3f07ae14    # 0.53f

    .line 254
    .line 255
    .line 256
    const v22, 0x3ec7ae14    # 0.39f

    .line 257
    .line 258
    .line 259
    const v23, 0x3f8b851f    # 1.09f

    .line 260
    .line 261
    .line 262
    const v24, 0x3f4f5c29    # 0.81f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, 0x3fb0a3d7    # 1.38f

    .line 269
    .line 270
    .line 271
    const v26, -0x41b33333    # -0.2f

    .line 272
    .line 273
    .line 274
    const v21, 0x3ee147ae    # 0.44f

    .line 275
    .line 276
    .line 277
    const v22, 0x3ea8f5c3    # 0.33f

    .line 278
    .line 279
    .line 280
    const v23, 0x3f87ae14    # 1.06f

    .line 281
    .line 282
    .line 283
    const v24, 0x3e75c28f    # 0.24f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, 0x3c23d70a    # 0.01f

    .line 290
    .line 291
    .line 292
    const v26, -0x435c28f6    # -0.02f

    .line 293
    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const v22, -0x43dc28f6    # -0.01f

    .line 298
    .line 299
    .line 300
    const v23, 0x3c23d70a    # 0.01f

    .line 301
    .line 302
    .line 303
    const v24, -0x43dc28f6    # -0.01f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, -0x41b33333    # -0.2f

    .line 310
    .line 311
    .line 312
    const v26, -0x404f5c29    # -1.38f

    .line 313
    .line 314
    .line 315
    const v21, 0x3ea8f5c3    # 0.33f

    .line 316
    .line 317
    .line 318
    const v22, -0x411eb852    # -0.44f

    .line 319
    .line 320
    .line 321
    const v23, 0x3e75c28f    # 0.24f

    .line 322
    .line 323
    .line 324
    const v24, -0x407851ec    # -1.06f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, -0x4031eb85    # -1.61f

    .line 331
    .line 332
    .line 333
    const v26, -0x40651eb8    # -1.21f

    .line 334
    .line 335
    .line 336
    const v21, -0x40f851ec    # -0.53f

    .line 337
    .line 338
    .line 339
    const v22, -0x41333333    # -0.4f

    .line 340
    .line 341
    .line 342
    const v23, -0x40747ae1    # -1.09f

    .line 343
    .line 344
    .line 345
    const v24, -0x40ae147b    # -0.82f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v25, -0x404e147b    # -1.39f

    .line 352
    .line 353
    .line 354
    const v26, 0x3e570a3d    # 0.21f

    .line 355
    .line 356
    .line 357
    const v21, -0x411eb852    # -0.44f

    .line 358
    .line 359
    .line 360
    const v22, -0x41570a3d    # -0.33f

    .line 361
    .line 362
    .line 363
    const v23, -0x407851ec    # -1.06f

    .line 364
    .line 365
    .line 366
    const v24, -0x41947ae1    # -0.23f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, 0x4184b852    # 16.59f

    .line 373
    .line 374
    .line 375
    const v26, 0x41868f5c    # 16.82f

    .line 376
    .line 377
    .line 378
    const v21, 0x4184cccd    # 16.6f

    .line 379
    .line 380
    .line 381
    const v22, 0x41867ae1    # 16.81f

    .line 382
    .line 383
    .line 384
    const v23, 0x4184b852    # 16.59f

    .line 385
    .line 386
    .line 387
    const v24, 0x41868f5c    # 16.82f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const/high16 v6, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const-string v4, ""

    .line 404
    .line 405
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 406
    .line 407
    .line 408
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 413
    .line 414
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 415
    .line 416
    .line 417
    move-result-wide v6

    .line 418
    const/4 v2, 0x0

    .line 419
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 433
    .line 434
    .line 435
    const v4, 0x419e7ae1    # 19.81f

    .line 436
    .line 437
    .line 438
    const v6, 0x4099eb85    # 4.81f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v25, -0x43dc28f6    # -0.01f

    .line 445
    .line 446
    .line 447
    const v26, -0x435c28f6    # -0.02f

    .line 448
    .line 449
    .line 450
    const/16 v21, 0x0

    .line 451
    .line 452
    const v22, -0x43dc28f6    # -0.01f

    .line 453
    .line 454
    .line 455
    const v23, -0x43dc28f6    # -0.01f

    .line 456
    .line 457
    .line 458
    const v24, -0x43dc28f6    # -0.01f

    .line 459
    .line 460
    .line 461
    move-object/from16 v20, v2

    .line 462
    .line 463
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v25, -0x404f5c29    # -1.38f

    .line 467
    .line 468
    .line 469
    const v26, -0x41b33333    # -0.2f

    .line 470
    .line 471
    .line 472
    const v21, -0x41570a3d    # -0.33f

    .line 473
    .line 474
    .line 475
    const v22, -0x411eb852    # -0.44f

    .line 476
    .line 477
    .line 478
    const v23, -0x408ccccd    # -0.95f

    .line 479
    .line 480
    .line 481
    const v24, -0x40f851ec    # -0.53f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v25, -0x4030a3d7    # -1.62f

    .line 488
    .line 489
    .line 490
    const v26, 0x3f9c28f6    # 1.22f

    .line 491
    .line 492
    .line 493
    const v21, -0x40f851ec    # -0.53f

    .line 494
    .line 495
    .line 496
    const v22, 0x3ecccccd    # 0.4f

    .line 497
    .line 498
    .line 499
    const v23, -0x40733333    # -1.1f

    .line 500
    .line 501
    .line 502
    const v24, 0x3f51eb85    # 0.82f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v25, -0x41bd70a4    # -0.19f

    .line 509
    .line 510
    .line 511
    const v26, 0x3fb0a3d7    # 1.38f

    .line 512
    .line 513
    .line 514
    const v21, -0x411eb852    # -0.44f

    .line 515
    .line 516
    .line 517
    const v22, 0x3ea8f5c3    # 0.33f

    .line 518
    .line 519
    .line 520
    const v23, -0x40fae148    # -0.52f

    .line 521
    .line 522
    .line 523
    const v24, 0x3f733333    # 0.95f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v25, 0x3c23d70a    # 0.01f

    .line 530
    .line 531
    .line 532
    const v26, 0x3ca3d70a    # 0.02f

    .line 533
    .line 534
    .line 535
    const/16 v21, 0x0

    .line 536
    .line 537
    const v22, 0x3c23d70a    # 0.01f

    .line 538
    .line 539
    .line 540
    const v23, 0x3c23d70a    # 0.01f

    .line 541
    .line 542
    .line 543
    const v24, 0x3c23d70a    # 0.01f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v25, 0x3fb0a3d7    # 1.38f

    .line 550
    .line 551
    .line 552
    const v26, 0x3e4ccccd    # 0.2f

    .line 553
    .line 554
    .line 555
    const v21, 0x3ea8f5c3    # 0.33f

    .line 556
    .line 557
    .line 558
    const v22, 0x3ee147ae    # 0.44f

    .line 559
    .line 560
    .line 561
    const v23, 0x3f70a3d7    # 0.94f

    .line 562
    .line 563
    .line 564
    const v24, 0x3f07ae14    # 0.53f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v25, 0x3fcf5c29    # 1.62f

    .line 571
    .line 572
    .line 573
    const v26, -0x4063d70a    # -1.22f

    .line 574
    .line 575
    .line 576
    const v21, 0x3f07ae14    # 0.53f

    .line 577
    .line 578
    .line 579
    const v22, -0x413851ec    # -0.39f

    .line 580
    .line 581
    .line 582
    const v23, 0x3f8b851f    # 1.09f

    .line 583
    .line 584
    .line 585
    const v24, -0x40ae147b    # -0.82f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v25, 0x419e7ae1    # 19.81f

    .line 592
    .line 593
    .line 594
    const v26, 0x4099eb85    # 4.81f

    .line 595
    .line 596
    .line 597
    const v21, 0x41a06666    # 20.05f

    .line 598
    .line 599
    .line 600
    const v22, 0x40bbd70a    # 5.87f

    .line 601
    .line 602
    .line 603
    const v23, 0x41a10a3d    # 20.13f

    .line 604
    .line 605
    .line 606
    const/high16 v24, 0x40a80000    # 5.25f

    .line 607
    .line 608
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const-string v4, ""

    .line 622
    .line 623
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 624
    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 633
    .line 634
    .line 635
    move-result-wide v6

    .line 636
    const/4 v2, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const/high16 v4, 0x41100000    # 9.0f

    .line 654
    .line 655
    const/high16 v6, 0x41000000    # 8.0f

    .line 656
    .line 657
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, 0x40800000    # 4.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v25, -0x40000000    # -2.0f

    .line 666
    .line 667
    const/high16 v26, 0x40000000    # 2.0f

    .line 668
    .line 669
    const v21, -0x40733333    # -1.1f

    .line 670
    .line 671
    .line 672
    const/16 v22, 0x0

    .line 673
    .line 674
    const/high16 v23, -0x40000000    # -2.0f

    .line 675
    .line 676
    const v24, 0x3f666666    # 0.9f

    .line 677
    .line 678
    .line 679
    move-object/from16 v20, v2

    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x40000000    # 2.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v25, 0x40000000    # 2.0f

    .line 690
    .line 691
    const/16 v21, 0x0

    .line 692
    .line 693
    const v22, 0x3f8ccccd    # 1.1f

    .line 694
    .line 695
    .line 696
    const v23, 0x3f666666    # 0.9f

    .line 697
    .line 698
    .line 699
    const/high16 v24, 0x40000000    # 2.0f

    .line 700
    .line 701
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v4, 0x3f800000    # 1.0f

    .line 705
    .line 706
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v4, 0x40400000    # 3.0f

    .line 710
    .line 711
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v25, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/high16 v26, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const v22, 0x3f0ccccd    # 0.55f

    .line 719
    .line 720
    .line 721
    const v23, 0x3ee66666    # 0.45f

    .line 722
    .line 723
    .line 724
    const/high16 v24, 0x3f800000    # 1.0f

    .line 725
    .line 726
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/4 v4, 0x0

    .line 730
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v26, -0x40800000    # -1.0f

    .line 734
    .line 735
    const v21, 0x3f0ccccd    # 0.55f

    .line 736
    .line 737
    .line 738
    const/16 v22, 0x0

    .line 739
    .line 740
    const/high16 v23, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const v24, -0x4119999a    # -0.45f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 749
    .line 750
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v4, 0x3f800000    # 1.0f

    .line 754
    .line 755
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v4, 0x40a00000    # 5.0f

    .line 759
    .line 760
    const/high16 v6, 0x40400000    # 3.0f

    .line 761
    .line 762
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v4, 0x40c00000    # 6.0f

    .line 766
    .line 767
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v4, 0x41100000    # 9.0f

    .line 771
    .line 772
    const/high16 v6, 0x41000000    # 8.0f

    .line 773
    .line 774
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    const/high16 v6, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const-string v4, ""

    .line 788
    .line 789
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 790
    .line 791
    .line 792
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 797
    .line 798
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 799
    .line 800
    .line 801
    move-result-wide v6

    .line 802
    const/4 v0, 0x0

    .line 803
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 807
    .line 808
    .line 809
    move-result v10

    .line 810
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    const/high16 v0, 0x41780000    # 15.5f

    .line 820
    .line 821
    const/high16 v2, 0x41400000    # 12.0f

    .line 822
    .line 823
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v17, -0x40400000    # -1.5f

    .line 827
    .line 828
    const v18, -0x3fa9999a    # -3.35f

    .line 829
    .line 830
    .line 831
    const v14, -0x4055c28f    # -1.33f

    .line 832
    .line 833
    .line 834
    const v15, -0x40eb851f    # -0.58f

    .line 835
    .line 836
    .line 837
    const v16, -0x3fde147b    # -2.53f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x40d6147b    # 6.69f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const/high16 v17, 0x41780000    # 15.5f

    .line 850
    .line 851
    const/high16 v18, 0x41400000    # 12.0f

    .line 852
    .line 853
    const v13, 0x416eb852    # 14.92f

    .line 854
    .line 855
    .line 856
    const v14, 0x41687ae1    # 14.53f

    .line 857
    .line 858
    .line 859
    const/high16 v15, 0x41780000    # 15.5f

    .line 860
    .line 861
    const v16, 0x415547ae    # 13.33f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    const/16 v16, 0x3800

    .line 875
    .line 876
    const/16 v17, 0x0

    .line 877
    .line 878
    const/high16 v6, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const/4 v7, 0x0

    .line 881
    const/high16 v12, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const/4 v14, 0x0

    .line 885
    const/4 v15, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    sput-object v0, Landroidx/compose/material/icons/rounded/CampaignKt;->_campaign:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 897
    .line 898
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    return-object v0
.end method
