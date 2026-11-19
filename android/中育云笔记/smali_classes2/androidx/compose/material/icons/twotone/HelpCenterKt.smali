.class public final Landroidx/compose/material/icons/twotone/HelpCenterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHelpCenter(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HelpCenter"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x41600000    # 14.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40a00000    # 5.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x414028f6    # 12.01f

    .line 95
    .line 96
    .line 97
    const/high16 v6, 0x41900000    # 18.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x405eb852    # -1.26f

    .line 103
    .line 104
    .line 105
    const v26, -0x405eb852    # -1.26f

    .line 106
    .line 107
    .line 108
    const v21, -0x40cccccd    # -0.7f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, -0x405eb852    # -1.26f

    .line 114
    .line 115
    .line 116
    const v24, -0x40f0a3d7    # -0.56f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v25, 0x3fa147ae    # 1.26f

    .line 125
    .line 126
    .line 127
    const/high16 v26, -0x40600000    # -1.25f

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const v22, -0x40ca3d71    # -0.71f

    .line 132
    .line 133
    .line 134
    const v23, 0x3f0f5c29    # 0.56f

    .line 135
    .line 136
    .line 137
    const/high16 v24, -0x40600000    # -1.25f

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 143
    .line 144
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 145
    .line 146
    const v21, 0x3f35c28f    # 0.71f

    .line 147
    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/high16 v23, 0x3fa00000    # 1.25f

    .line 152
    .line 153
    const v24, 0x3f0a3d71    # 0.54f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x414028f6    # 12.01f

    .line 160
    .line 161
    .line 162
    const/high16 v26, 0x41900000    # 18.0f

    .line 163
    .line 164
    const/high16 v21, 0x41540000    # 13.25f

    .line 165
    .line 166
    const v22, 0x418b70a4    # 17.43f

    .line 167
    .line 168
    .line 169
    const v23, 0x414b851f    # 12.72f

    .line 170
    .line 171
    .line 172
    const/high16 v24, 0x41900000    # 18.0f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, 0x417051ec    # 15.02f

    .line 181
    .line 182
    .line 183
    const v6, 0x4129999a    # 10.6f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, -0x4010a3d7    # -1.87f

    .line 190
    .line 191
    .line 192
    const v26, 0x400ae148    # 2.17f

    .line 193
    .line 194
    .line 195
    const v21, -0x40bd70a4    # -0.76f

    .line 196
    .line 197
    .line 198
    const v22, 0x3f8e147b    # 1.11f

    .line 199
    .line 200
    .line 201
    const v23, -0x40428f5c    # -1.48f

    .line 202
    .line 203
    .line 204
    const v24, 0x3fbae148    # 1.46f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, -0x419eb852    # -0.22f

    .line 211
    .line 212
    .line 213
    const v26, 0x3fb47ae1    # 1.41f

    .line 214
    .line 215
    .line 216
    const v21, -0x41dc28f6    # -0.16f

    .line 217
    .line 218
    .line 219
    const v22, 0x3e947ae1    # 0.29f

    .line 220
    .line 221
    .line 222
    const v23, -0x419eb852    # -0.22f

    .line 223
    .line 224
    .line 225
    const v24, 0x3ef5c28f    # 0.48f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, -0x40170a3d    # -1.82f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, 0x3e9eb852    # 0.31f

    .line 238
    .line 239
    .line 240
    const v26, -0x40028f5c    # -1.98f

    .line 241
    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const v22, -0x41051eb8    # -0.49f

    .line 246
    .line 247
    .line 248
    const v23, -0x425c28f6    # -0.08f

    .line 249
    .line 250
    .line 251
    const v24, -0x405ae148    # -1.29f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, 0x3ffae148    # 1.96f

    .line 258
    .line 259
    .line 260
    const v26, -0x3ff5c28f    # -2.16f

    .line 261
    .line 262
    .line 263
    const v21, 0x3efae148    # 0.49f

    .line 264
    .line 265
    .line 266
    const v22, -0x40a147ae    # -0.87f

    .line 267
    .line 268
    .line 269
    const v23, 0x3fb5c28f    # 1.42f

    .line 270
    .line 271
    .line 272
    const v24, -0x404e147b    # -1.39f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x4050a3d7    # -1.37f

    .line 279
    .line 280
    .line 281
    const v26, -0x3feae148    # -2.33f

    .line 282
    .line 283
    .line 284
    const v21, 0x3f11eb85    # 0.57f

    .line 285
    .line 286
    .line 287
    const v22, -0x40b0a3d7    # -0.81f

    .line 288
    .line 289
    .line 290
    const/high16 v23, 0x3e800000    # 0.25f

    .line 291
    .line 292
    const v24, -0x3feae148    # -2.33f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, -0x4019999a    # -1.8f

    .line 299
    .line 300
    .line 301
    const v26, 0x3fbd70a4    # 1.48f

    .line 302
    .line 303
    .line 304
    const v21, -0x407851ec    # -1.06f

    .line 305
    .line 306
    .line 307
    const/16 v22, 0x0

    .line 308
    .line 309
    const v23, -0x4035c28f    # -1.58f

    .line 310
    .line 311
    .line 312
    const v24, 0x3f4ccccd    # 0.8f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x4108f5c3    # 8.56f

    .line 319
    .line 320
    .line 321
    const v6, 0x4107d70a    # 8.49f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v25, 0x413fd70a    # 11.99f

    .line 328
    .line 329
    .line 330
    const/high16 v26, 0x40c00000    # 6.0f

    .line 331
    .line 332
    const v21, 0x411028f6    # 9.01f

    .line 333
    .line 334
    .line 335
    const v22, 0x40e4cccd    # 7.15f

    .line 336
    .line 337
    .line 338
    const v23, 0x4123851f    # 10.22f

    .line 339
    .line 340
    .line 341
    const/high16 v24, 0x40c00000    # 6.0f

    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x4040a3d7    # 3.01f

    .line 347
    .line 348
    .line 349
    const v26, 0x3fc28f5c    # 1.52f

    .line 350
    .line 351
    .line 352
    const v21, 0x3fbd70a4    # 1.48f

    .line 353
    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const v23, 0x401f5c29    # 2.49f

    .line 358
    .line 359
    .line 360
    const v24, 0x3f2b851f    # 0.67f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v25, 0x417051ec    # 15.02f

    .line 367
    .line 368
    .line 369
    const v26, 0x4129999a    # 10.6f

    .line 370
    .line 371
    .line 372
    const v21, 0x41770a3d    # 15.44f

    .line 373
    .line 374
    .line 375
    const v22, 0x4103d70a    # 8.24f

    .line 376
    .line 377
    .line 378
    const v23, 0x417b3333    # 15.7f

    .line 379
    .line 380
    .line 381
    const v24, 0x411970a4    # 9.59f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    const/16 v16, 0x3800

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const v6, 0x3e99999a    # 0.3f

    .line 399
    .line 400
    .line 401
    const v8, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const/4 v7, 0x0

    .line 405
    const/high16 v9, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/high16 v12, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const/4 v14, 0x0

    .line 411
    const/4 v15, 0x0

    .line 412
    const-string v4, ""

    .line 413
    .line 414
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 415
    .line 416
    .line 417
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 422
    .line 423
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 424
    .line 425
    .line 426
    move-result-wide v6

    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41540000    # 13.25f

    .line 445
    .line 446
    const v2, 0x4185eb85    # 16.74f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, -0x40600000    # -1.25f

    .line 453
    .line 454
    const v18, 0x3fa147ae    # 1.26f

    .line 455
    .line 456
    .line 457
    const v14, 0x3f30a3d7    # 0.69f

    .line 458
    .line 459
    .line 460
    const v15, -0x40f851ec    # -0.53f

    .line 461
    .line 462
    .line 463
    const v16, 0x3fa147ae    # 1.26f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x405eb852    # -1.26f

    .line 470
    .line 471
    .line 472
    const v18, -0x405eb852    # -1.26f

    .line 473
    .line 474
    .line 475
    const v13, -0x40cccccd    # -0.7f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const v15, -0x405eb852    # -1.26f

    .line 480
    .line 481
    .line 482
    const v16, -0x40f0a3d7    # -0.56f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3fa147ae    # 1.26f

    .line 489
    .line 490
    .line 491
    const/high16 v18, -0x40600000    # -1.25f

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const v14, -0x40ca3d71    # -0.71f

    .line 495
    .line 496
    .line 497
    const v15, 0x3f0f5c29    # 0.56f

    .line 498
    .line 499
    .line 500
    const/high16 v16, -0x40600000    # -1.25f

    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x41540000    # 13.25f

    .line 506
    .line 507
    const v18, 0x4185eb85    # 16.74f

    .line 508
    .line 509
    .line 510
    const v13, 0x414b5c29    # 12.71f

    .line 511
    .line 512
    .line 513
    const v14, 0x4177d70a    # 15.49f

    .line 514
    .line 515
    .line 516
    const/high16 v15, 0x41540000    # 13.25f

    .line 517
    .line 518
    const v16, 0x418051ec    # 16.04f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x413fd70a    # 11.99f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x40c00000    # 6.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x3fa47ae1    # -3.43f

    .line 536
    .line 537
    .line 538
    const v18, 0x401f5c29    # 2.49f

    .line 539
    .line 540
    .line 541
    const v13, -0x401d70a4    # -1.77f

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const v15, -0x3fc147ae    # -2.98f

    .line 546
    .line 547
    .line 548
    const v16, 0x3f933333    # 1.15f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x3fd1eb85    # 1.64f

    .line 555
    .line 556
    .line 557
    const v2, 0x3f30a3d7    # 0.69f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x3fe66666    # 1.8f

    .line 564
    .line 565
    .line 566
    const v18, -0x40428f5c    # -1.48f

    .line 567
    .line 568
    .line 569
    const v13, 0x3e6147ae    # 0.22f

    .line 570
    .line 571
    .line 572
    const v14, -0x40d47ae1    # -0.67f

    .line 573
    .line 574
    .line 575
    const v15, 0x3f3d70a4    # 0.74f

    .line 576
    .line 577
    .line 578
    const v16, -0x40428f5c    # -1.48f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, 0x3faf5c29    # 1.37f

    .line 585
    .line 586
    .line 587
    const v18, 0x40151eb8    # 2.33f

    .line 588
    .line 589
    .line 590
    const v13, 0x3fcf5c29    # 1.62f

    .line 591
    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const v15, 0x3ff851ec    # 1.94f

    .line 595
    .line 596
    .line 597
    const v16, 0x3fc28f5c    # 1.52f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x40051eb8    # -1.96f

    .line 604
    .line 605
    .line 606
    const v18, 0x400a3d71    # 2.16f

    .line 607
    .line 608
    .line 609
    const v13, -0x40f5c28f    # -0.54f

    .line 610
    .line 611
    .line 612
    const v14, 0x3f451eb8    # 0.77f

    .line 613
    .line 614
    .line 615
    const v15, -0x4043d70a    # -1.47f

    .line 616
    .line 617
    .line 618
    const v16, 0x3fa51eb8    # 1.29f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, -0x416147ae    # -0.31f

    .line 625
    .line 626
    .line 627
    const v18, 0x3ffd70a4    # 1.98f

    .line 628
    .line 629
    .line 630
    const v13, -0x413851ec    # -0.39f

    .line 631
    .line 632
    .line 633
    const v14, 0x3f30a3d7    # 0.69f

    .line 634
    .line 635
    .line 636
    const v15, -0x416147ae    # -0.31f

    .line 637
    .line 638
    .line 639
    const v16, 0x3fbeb852    # 1.49f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x3fe8f5c3    # 1.82f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, 0x3e6147ae    # 0.22f

    .line 652
    .line 653
    .line 654
    const v18, -0x404b851f    # -1.41f

    .line 655
    .line 656
    .line 657
    const/4 v13, 0x0

    .line 658
    const v14, -0x4091eb85    # -0.93f

    .line 659
    .line 660
    .line 661
    const v15, 0x3d8f5c29    # 0.07f

    .line 662
    .line 663
    .line 664
    const v16, -0x4070a3d7    # -1.12f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x3fef5c29    # 1.87f

    .line 671
    .line 672
    .line 673
    const v18, -0x3ff51eb8    # -2.17f

    .line 674
    .line 675
    .line 676
    const v13, 0x3ec7ae14    # 0.39f

    .line 677
    .line 678
    .line 679
    const v14, -0x40c7ae14    # -0.72f

    .line 680
    .line 681
    .line 682
    const v15, 0x3f8e147b    # 1.11f

    .line 683
    .line 684
    .line 685
    const v16, -0x407851ec    # -1.06f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, -0x435c28f6    # -0.02f

    .line 692
    .line 693
    .line 694
    const v18, -0x3fbae148    # -3.08f

    .line 695
    .line 696
    .line 697
    const v13, 0x3f2e147b    # 0.68f

    .line 698
    .line 699
    .line 700
    const/high16 v14, -0x40800000    # -1.0f

    .line 701
    .line 702
    const v15, 0x3ed70a3d    # 0.42f

    .line 703
    .line 704
    .line 705
    const v16, -0x3fe8f5c3    # -2.36f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, 0x413fd70a    # 11.99f

    .line 712
    .line 713
    .line 714
    const/high16 v18, 0x40c00000    # 6.0f

    .line 715
    .line 716
    const v13, 0x4167ae14    # 14.48f

    .line 717
    .line 718
    .line 719
    const v14, 0x40d570a4    # 6.67f

    .line 720
    .line 721
    .line 722
    const v15, 0x4157851f    # 13.47f

    .line 723
    .line 724
    .line 725
    const/high16 v16, 0x40c00000    # 6.0f

    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v0, 0x41980000    # 19.0f

    .line 734
    .line 735
    const/high16 v2, 0x40a00000    # 5.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x40a00000    # 5.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x41600000    # 14.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x40a00000    # 5.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v0, 0x40400000    # 3.0f

    .line 759
    .line 760
    const/high16 v2, 0x41980000    # 19.0f

    .line 761
    .line 762
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, 0x40000000    # 2.0f

    .line 766
    .line 767
    const/high16 v18, 0x40000000    # 2.0f

    .line 768
    .line 769
    const v13, 0x3f8ccccd    # 1.1f

    .line 770
    .line 771
    .line 772
    const/4 v14, 0x0

    .line 773
    const/high16 v15, 0x40000000    # 2.0f

    .line 774
    .line 775
    const v16, 0x3f666666    # 0.9f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v0, 0x41600000    # 14.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v17, -0x40000000    # -2.0f

    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const v14, 0x3f8ccccd    # 1.1f

    .line 790
    .line 791
    .line 792
    const v15, -0x4099999a    # -0.9f

    .line 793
    .line 794
    .line 795
    const/high16 v16, 0x40000000    # 2.0f

    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x40a00000    # 5.0f

    .line 801
    .line 802
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v18, -0x40000000    # -2.0f

    .line 806
    .line 807
    const v13, -0x40733333    # -1.1f

    .line 808
    .line 809
    .line 810
    const/4 v14, 0x0

    .line 811
    const/high16 v15, -0x40000000    # -2.0f

    .line 812
    .line 813
    const v16, -0x4099999a    # -0.9f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v17, 0x40000000    # 2.0f

    .line 823
    .line 824
    const/4 v13, 0x0

    .line 825
    const v14, -0x40733333    # -1.1f

    .line 826
    .line 827
    .line 828
    const v15, 0x3f666666    # 0.9f

    .line 829
    .line 830
    .line 831
    const/high16 v16, -0x40000000    # -2.0f

    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v0, 0x41980000    # 19.0f

    .line 837
    .line 838
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v0, 0x40400000    # 3.0f

    .line 842
    .line 843
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    const/16 v16, 0x3800

    .line 854
    .line 855
    const/16 v17, 0x0

    .line 856
    .line 857
    const/high16 v6, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const/high16 v8, 0x3f800000    # 1.0f

    .line 860
    .line 861
    const/4 v7, 0x0

    .line 862
    const/high16 v12, 0x3f800000    # 1.0f

    .line 863
    .line 864
    const/4 v14, 0x0

    .line 865
    const/4 v15, 0x0

    .line 866
    const-string v4, ""

    .line 867
    .line 868
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sput-object v0, Landroidx/compose/material/icons/twotone/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 877
    .line 878
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-object v0
.end method

.method public static synthetic getHelpCenter$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
