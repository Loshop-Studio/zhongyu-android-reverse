.class public final Landroidx/compose/material/icons/twotone/LocalPhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localPhone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalPhone(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalPhoneKt;->_localPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalPhone"

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
    const v6, 0x418bc28f    # 17.47f

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
    const v4, 0x3f9851ec    # 1.19f

    .line 101
    .line 102
    .line 103
    const v6, -0x4067ae14    # -1.19f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v25, 0x40733333    # 3.8f

    .line 110
    .line 111
    .line 112
    const/high16 v26, 0x3f400000    # 0.75f

    .line 113
    .line 114
    const v21, 0x3f99999a    # 1.2f

    .line 115
    .line 116
    .line 117
    const v22, 0x3ed1eb85    # 0.41f

    .line 118
    .line 119
    .line 120
    const v23, 0x401eb852    # 2.48f

    .line 121
    .line 122
    .line 123
    const v24, 0x3f2b851f    # 0.67f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x404147ae    # -1.49f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, 0x40dfae14    # 6.99f

    .line 139
    .line 140
    .line 141
    const v6, 0x40f2e148    # 7.59f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v25, -0x4119999a    # -0.45f

    .line 148
    .line 149
    .line 150
    const v26, -0x3fda3d71    # -2.59f

    .line 151
    .line 152
    .line 153
    const v21, -0x418a3d71    # -0.24f

    .line 154
    .line 155
    .line 156
    const v22, -0x40ab851f    # -0.83f

    .line 157
    .line 158
    .line 159
    const v23, -0x413851ec    # -0.39f

    .line 160
    .line 161
    .line 162
    const v24, -0x40266666    # -1.7f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, -0x40400000    # -1.5f

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x3f400000    # 0.75f

    .line 174
    .line 175
    const v26, 0x40733333    # 3.8f

    .line 176
    .line 177
    .line 178
    const v21, 0x3db851ec    # 0.09f

    .line 179
    .line 180
    .line 181
    const v22, 0x3fa8f5c3    # 1.32f

    .line 182
    .line 183
    .line 184
    const v23, 0x3eb33333    # 0.35f

    .line 185
    .line 186
    .line 187
    const v24, 0x4025c28f    # 2.59f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, -0x40651eb8    # -1.21f

    .line 194
    .line 195
    .line 196
    const v6, 0x3f99999a    # 1.2f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40800000    # 4.0f

    .line 260
    .line 261
    const/high16 v2, 0x40400000    # 3.0f

    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x41880000    # 17.0f

    .line 267
    .line 268
    const/high16 v18, 0x41880000    # 17.0f

    .line 269
    .line 270
    const v14, 0x41163d71    # 9.39f

    .line 271
    .line 272
    .line 273
    const v15, 0x40f3851f    # 7.61f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x41880000    # 17.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/high16 v18, -0x40800000    # -1.0f

    .line 284
    .line 285
    const v13, 0x3f0ccccd    # 0.55f

    .line 286
    .line 287
    .line 288
    const/4 v14, 0x0

    .line 289
    const/high16 v15, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const v16, -0x4119999a    # -0.45f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3fa0a3d7    # -3.49f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x40800000    # -1.0f

    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const v14, -0x40f33333    # -0.55f

    .line 307
    .line 308
    .line 309
    const v15, -0x4119999a    # -0.45f

    .line 310
    .line 311
    .line 312
    const/high16 v16, -0x40800000    # -1.0f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x3f9b851f    # -3.57f

    .line 318
    .line 319
    .line 320
    const v18, -0x40ee147b    # -0.57f

    .line 321
    .line 322
    .line 323
    const v13, -0x406147ae    # -1.24f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const v15, -0x3fe33333    # -2.45f

    .line 328
    .line 329
    .line 330
    const v16, -0x41b33333    # -0.2f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, -0x416147ae    # -0.31f

    .line 337
    .line 338
    .line 339
    const v18, -0x42b33333    # -0.05f

    .line 340
    .line 341
    .line 342
    const v13, -0x42333333    # -0.1f

    .line 343
    .line 344
    .line 345
    const v14, -0x42dc28f6    # -0.04f

    .line 346
    .line 347
    .line 348
    const v15, -0x41a8f5c3    # -0.21f

    .line 349
    .line 350
    .line 351
    const v16, -0x42b33333    # -0.05f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x40ca3d71    # -0.71f

    .line 358
    .line 359
    .line 360
    const v18, 0x3e947ae1    # 0.29f

    .line 361
    .line 362
    .line 363
    const v13, -0x417ae148    # -0.26f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const v15, -0x40fd70a4    # -0.51f

    .line 368
    .line 369
    .line 370
    const v16, 0x3dcccccd    # 0.1f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x400ccccd    # 2.2f

    .line 377
    .line 378
    .line 379
    const v2, -0x3ff33333    # -2.2f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, -0x3f2d1eb8    # -6.59f

    .line 386
    .line 387
    .line 388
    const v18, -0x3f2d1eb8    # -6.59f

    .line 389
    .line 390
    .line 391
    const v13, -0x3fcae148    # -2.83f

    .line 392
    .line 393
    .line 394
    const v14, -0x40466666    # -1.45f

    .line 395
    .line 396
    .line 397
    const v15, -0x3f5b3333    # -5.15f

    .line 398
    .line 399
    .line 400
    const v16, -0x3f8f5c29    # -3.76f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x3e800000    # 0.25f

    .line 410
    .line 411
    const v18, -0x407d70a4    # -1.02f

    .line 412
    .line 413
    .line 414
    const v13, 0x3e8f5c29    # 0.28f

    .line 415
    .line 416
    .line 417
    const v14, -0x4170a3d7    # -0.28f

    .line 418
    .line 419
    .line 420
    const v15, 0x3eb851ec    # 0.36f

    .line 421
    .line 422
    .line 423
    const v16, -0x40d47ae1    # -0.67f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41080000    # 8.5f

    .line 430
    .line 431
    const/high16 v18, 0x40800000    # 4.0f

    .line 432
    .line 433
    const v13, 0x410b3333    # 8.7f

    .line 434
    .line 435
    .line 436
    const v14, 0x40ce6666    # 6.45f

    .line 437
    .line 438
    .line 439
    const/high16 v15, 0x41080000    # 8.5f

    .line 440
    .line 441
    const/high16 v16, 0x40a80000    # 5.25f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, -0x40800000    # -1.0f

    .line 447
    .line 448
    const/high16 v18, -0x40800000    # -1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, -0x40f33333    # -0.55f

    .line 452
    .line 453
    .line 454
    const v15, -0x4119999a    # -0.45f

    .line 455
    .line 456
    .line 457
    const/high16 v16, -0x40800000    # -1.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40800000    # 4.0f

    .line 463
    .line 464
    const/high16 v2, 0x40400000    # 3.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v18, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const v13, -0x40f33333    # -0.55f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const/high16 v15, -0x40800000    # -1.0f

    .line 476
    .line 477
    const v16, 0x3ee66666    # 0.45f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x41833333    # 16.4f

    .line 487
    .line 488
    .line 489
    const v2, 0x418828f6    # 17.02f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x40266666    # 2.6f

    .line 496
    .line 497
    .line 498
    const v18, 0x3ee66666    # 0.45f

    .line 499
    .line 500
    .line 501
    const v13, 0x3f59999a    # 0.85f

    .line 502
    .line 503
    .line 504
    const v14, 0x3e75c28f    # 0.24f

    .line 505
    .line 506
    .line 507
    const v15, 0x3fdc28f6    # 1.72f

    .line 508
    .line 509
    .line 510
    const v16, 0x3ec7ae14    # 0.39f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x3fbeb852    # 1.49f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, -0x3f8ccccd    # -3.8f

    .line 523
    .line 524
    .line 525
    const/high16 v18, -0x40c00000    # -0.75f

    .line 526
    .line 527
    const v13, -0x40570a3d    # -1.32f

    .line 528
    .line 529
    .line 530
    const v14, -0x4247ae14    # -0.09f

    .line 531
    .line 532
    .line 533
    const v15, -0x3fda3d71    # -2.59f

    .line 534
    .line 535
    .line 536
    const v16, -0x414ccccd    # -0.35f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x4067ae14    # -1.19f

    .line 543
    .line 544
    .line 545
    const v2, 0x3f99999a    # 1.2f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x40d147ae    # 6.54f

    .line 555
    .line 556
    .line 557
    const/high16 v2, 0x40a00000    # 5.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3ee66666    # 0.45f

    .line 563
    .line 564
    .line 565
    const v18, 0x4025c28f    # 2.59f

    .line 566
    .line 567
    .line 568
    const v13, 0x3d75c28f    # 0.06f

    .line 569
    .line 570
    .line 571
    const v14, 0x3f63d70a    # 0.89f

    .line 572
    .line 573
    .line 574
    const v15, 0x3e570a3d    # 0.21f

    .line 575
    .line 576
    .line 577
    const v16, 0x3fe147ae    # 1.76f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, -0x40666666    # -1.2f

    .line 584
    .line 585
    .line 586
    const v2, 0x3f99999a    # 1.2f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, -0x40bd70a4    # -0.76f

    .line 593
    .line 594
    .line 595
    const v18, -0x3f8d70a4    # -3.79f

    .line 596
    .line 597
    .line 598
    const v13, -0x412e147b    # -0.41f

    .line 599
    .line 600
    .line 601
    const v14, -0x40666666    # -1.2f

    .line 602
    .line 603
    .line 604
    const v15, -0x40d47ae1    # -0.67f

    .line 605
    .line 606
    .line 607
    const v16, -0x3fe1eb85    # -2.47f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x3fc147ae    # 1.51f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/16 v16, 0x3800

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const/high16 v12, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    const/4 v14, 0x0

    .line 639
    const/4 v15, 0x0

    .line 640
    const-string v4, ""

    .line 641
    .line 642
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalPhoneKt;->_localPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-object v0
.end method
