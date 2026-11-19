.class public final Landroidx/compose/material/icons/twotone/PhoneForwardedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneForwarded(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhoneForwarded"

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
    const v4, 0x41733333    # 15.2f

    .line 71
    .line 72
    .line 73
    const v6, 0x4191ae14    # 18.21f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40733333    # 3.8f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f428f5c    # 0.76f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f9ae148    # 1.21f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ed1eb85    # 0.41f

    .line 89
    .line 90
    .line 91
    const v23, 0x401eb852    # 2.48f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f2b851f    # 0.67f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, -0x40400000    # -1.5f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, -0x3fd9999a    # -2.6f

    .line 108
    .line 109
    .line 110
    const v26, -0x4119999a    # -0.45f

    .line 111
    .line 112
    .line 113
    const v21, -0x409eb852    # -0.88f

    .line 114
    .line 115
    .line 116
    const v22, -0x4270a3d7    # -0.07f

    .line 117
    .line 118
    .line 119
    const/high16 v23, -0x40200000    # -1.75f

    .line 120
    .line 121
    const v24, -0x419eb852    # -0.22f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x3f9851ec    # 1.19f

    .line 128
    .line 129
    .line 130
    const v6, -0x40666666    # -1.2f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, -0x40400000    # -1.5f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x3f400000    # 0.75f

    .line 153
    .line 154
    const v26, 0x40728f5c    # 3.79f

    .line 155
    .line 156
    .line 157
    const v21, 0x3db851ec    # 0.09f

    .line 158
    .line 159
    .line 160
    const v22, 0x3fa8f5c3    # 1.32f

    .line 161
    .line 162
    .line 163
    const v23, 0x3eae147b    # 0.34f

    .line 164
    .line 165
    .line 166
    const v24, 0x40251eb8    # 2.58f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, -0x40651eb8    # -1.21f

    .line 173
    .line 174
    .line 175
    const v6, 0x3f99999a    # 1.2f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const v26, -0x3fdae148    # -2.58f

    .line 185
    .line 186
    .line 187
    const v21, -0x418a3d71    # -0.24f

    .line 188
    .line 189
    .line 190
    const v22, -0x40ab851f    # -0.83f

    .line 191
    .line 192
    .line 193
    const v23, -0x413851ec    # -0.39f

    .line 194
    .line 195
    .line 196
    const v24, -0x40266666    # -1.7f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 260
    .line 261
    const/high16 v2, 0x41780000    # 15.5f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, -0x3f9b851f    # -3.57f

    .line 267
    .line 268
    .line 269
    const v18, -0x40ee147b    # -0.57f

    .line 270
    .line 271
    .line 272
    const/high16 v13, -0x40600000    # -1.25f

    .line 273
    .line 274
    const v15, -0x3fe33333    # -2.45f

    .line 275
    .line 276
    .line 277
    const v16, -0x41b33333    # -0.2f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x416147ae    # -0.31f

    .line 284
    .line 285
    .line 286
    const v18, -0x42b33333    # -0.05f

    .line 287
    .line 288
    .line 289
    const v13, -0x42333333    # -0.1f

    .line 290
    .line 291
    .line 292
    const v14, -0x430a3d71    # -0.03f

    .line 293
    .line 294
    .line 295
    const v15, -0x41a8f5c3    # -0.21f

    .line 296
    .line 297
    .line 298
    const v16, -0x42b33333    # -0.05f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, -0x40ca3d71    # -0.71f

    .line 305
    .line 306
    .line 307
    const v18, 0x3e947ae1    # 0.29f

    .line 308
    .line 309
    .line 310
    const v13, -0x417ae148    # -0.26f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const v15, -0x40fd70a4    # -0.51f

    .line 315
    .line 316
    .line 317
    const v16, 0x3dcccccd    # 0.1f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, -0x3ff33333    # -2.2f

    .line 324
    .line 325
    .line 326
    const v2, 0x400ccccd    # 2.2f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x3f2d1eb8    # -6.59f

    .line 333
    .line 334
    .line 335
    const v18, -0x3f2d1eb8    # -6.59f

    .line 336
    .line 337
    .line 338
    const v13, -0x3fcae148    # -2.83f

    .line 339
    .line 340
    .line 341
    const v14, -0x4047ae14    # -1.44f

    .line 342
    .line 343
    .line 344
    const v15, -0x3f5b3333    # -5.15f

    .line 345
    .line 346
    .line 347
    const/high16 v16, -0x3f900000    # -3.75f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x3ff28f5c    # -2.21f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x3e800000    # 0.25f

    .line 359
    .line 360
    const/high16 v18, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v13, 0x3e8f5c29    # 0.28f

    .line 363
    .line 364
    .line 365
    const v14, -0x417ae148    # -0.26f

    .line 366
    .line 367
    .line 368
    const v15, 0x3eb851ec    # 0.36f

    .line 369
    .line 370
    .line 371
    const v16, -0x40d9999a    # -0.65f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x41080000    # 8.5f

    .line 378
    .line 379
    const/high16 v18, 0x40800000    # 4.0f

    .line 380
    .line 381
    const v13, 0x410b3333    # 8.7f

    .line 382
    .line 383
    .line 384
    const v14, 0x40ce6666    # 6.45f

    .line 385
    .line 386
    .line 387
    const/high16 v15, 0x41080000    # 8.5f

    .line 388
    .line 389
    const/high16 v16, 0x40a80000    # 5.25f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, -0x40800000    # -1.0f

    .line 395
    .line 396
    const/high16 v18, -0x40800000    # -1.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, -0x40f33333    # -0.55f

    .line 400
    .line 401
    .line 402
    const v15, -0x4119999a    # -0.45f

    .line 403
    .line 404
    .line 405
    const/high16 v16, -0x40800000    # -1.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x40800000    # 4.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v18, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const v13, -0x40f33333    # -0.55f

    .line 418
    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/high16 v15, -0x40800000    # -1.0f

    .line 422
    .line 423
    const v16, 0x3ee66666    # 0.45f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41880000    # 17.0f

    .line 430
    .line 431
    const/high16 v18, 0x41880000    # 17.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const v14, 0x41163d71    # 9.39f

    .line 435
    .line 436
    .line 437
    const v15, 0x40f3851f    # 7.61f

    .line 438
    .line 439
    .line 440
    const/high16 v16, 0x41880000    # 17.0f

    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v18, -0x40800000    # -1.0f

    .line 448
    .line 449
    const v13, 0x3f0ccccd    # 0.55f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const/high16 v15, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const v16, -0x4119999a    # -0.45f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, -0x40800000    # -1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const v14, -0x40f33333    # -0.55f

    .line 470
    .line 471
    .line 472
    const v15, -0x4119999a    # -0.45f

    .line 473
    .line 474
    .line 475
    const/high16 v16, -0x40800000    # -1.0f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x40a0f5c3    # 5.03f

    .line 484
    .line 485
    .line 486
    const/high16 v2, 0x40a00000    # 5.0f

    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3ee66666    # 0.45f

    .line 497
    .line 498
    .line 499
    const v18, 0x40251eb8    # 2.58f

    .line 500
    .line 501
    .line 502
    const v13, 0x3d8f5c29    # 0.07f

    .line 503
    .line 504
    .line 505
    const v14, 0x3f6147ae    # 0.88f

    .line 506
    .line 507
    .line 508
    const v15, 0x3e6147ae    # 0.22f

    .line 509
    .line 510
    .line 511
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x3f9ae148    # 1.21f

    .line 517
    .line 518
    .line 519
    const v2, -0x40666666    # -1.2f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x40c00000    # -0.75f

    .line 526
    .line 527
    const v18, -0x3f8d70a4    # -3.79f

    .line 528
    .line 529
    .line 530
    const v13, -0x41333333    # -0.4f

    .line 531
    .line 532
    .line 533
    const v14, -0x40651eb8    # -1.21f

    .line 534
    .line 535
    .line 536
    const v15, -0x40d70a3d    # -0.66f

    .line 537
    .line 538
    .line 539
    const v16, -0x3fe1eb85    # -2.47f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x41980000    # 19.0f

    .line 549
    .line 550
    const v2, 0x4197c28f    # 18.97f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x3f8ccccd    # -3.8f

    .line 557
    .line 558
    .line 559
    const v18, -0x40bd70a4    # -0.76f

    .line 560
    .line 561
    .line 562
    const v13, -0x40570a3d    # -1.32f

    .line 563
    .line 564
    .line 565
    const v14, -0x4247ae14    # -0.09f

    .line 566
    .line 567
    .line 568
    const v15, -0x3fd9999a    # -2.6f

    .line 569
    .line 570
    .line 571
    const v16, -0x414ccccd    # -0.35f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x3f99999a    # 1.2f

    .line 578
    .line 579
    .line 580
    const v2, -0x40666666    # -1.2f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x40266666    # 2.6f

    .line 587
    .line 588
    .line 589
    const v18, 0x3ee66666    # 0.45f

    .line 590
    .line 591
    .line 592
    const v13, 0x3f59999a    # 0.85f

    .line 593
    .line 594
    .line 595
    const v14, 0x3e75c28f    # 0.24f

    .line 596
    .line 597
    .line 598
    const v15, 0x3fdc28f6    # 1.72f

    .line 599
    .line 600
    .line 601
    const v16, 0x3ec7ae14    # 0.39f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x3fc147ae    # 1.51f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x41900000    # 18.0f

    .line 617
    .line 618
    const/high16 v2, 0x41300000    # 11.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, -0x3f600000    # -5.0f

    .line 624
    .line 625
    const/high16 v2, 0x40a00000    # 5.0f

    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x40400000    # 3.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, -0x3f800000    # -4.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x40800000    # 4.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    const/16 v16, 0x3800

    .line 659
    .line 660
    const/16 v17, 0x0

    .line 661
    .line 662
    const/high16 v6, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v8, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const/high16 v12, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    const/4 v14, 0x0

    .line 671
    const/4 v15, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    sput-object v0, Landroidx/compose/material/icons/twotone/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    return-object v0
.end method

.method public static synthetic getPhoneForwarded$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
