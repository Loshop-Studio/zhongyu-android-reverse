.class public final Landroidx/compose/material/icons/twotone/EmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergency(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Emergency"

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
    const v4, 0x4186f5c3    # 16.87f

    .line 71
    .line 72
    .line 73
    const v6, 0x419370a4    # 18.43f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fd33333    # -2.7f

    .line 80
    .line 81
    .line 82
    const v6, -0x3f6a3d71    # -4.68f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x41500000    # 13.0f

    .line 89
    .line 90
    const v26, 0x4169999a    # 14.6f

    .line 91
    .line 92
    .line 93
    const v21, 0x4156b852    # 13.42f

    .line 94
    .line 95
    .line 96
    const v22, 0x415f851f    # 13.97f

    .line 97
    .line 98
    .line 99
    const/high16 v23, 0x41500000    # 13.0f

    .line 100
    .line 101
    const v24, 0x41635c29    # 14.21f

    .line 102
    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v4, 0x41a00000    # 20.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, -0x40000000    # -2.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, -0x3f533333    # -5.4f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, -0x40c00000    # -0.75f

    .line 126
    .line 127
    const v26, -0x4123d70a    # -0.43f

    .line 128
    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    const v22, -0x413d70a4    # -0.38f

    .line 133
    .line 134
    .line 135
    const v23, -0x4128f5c3    # -0.42f

    .line 136
    .line 137
    .line 138
    const v24, -0x40deb852    # -0.63f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x402ccccd    # 2.7f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, -0x40800000    # -1.0f

    .line 151
    .line 152
    const v6, -0x40228f5c    # -1.73f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x4095c28f    # 4.68f

    .line 159
    .line 160
    .line 161
    const v6, -0x3fd33333    # -2.7f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/16 v25, 0x0

    .line 168
    .line 169
    const v26, -0x40a147ae    # -0.87f

    .line 170
    .line 171
    .line 172
    const v21, 0x3ea8f5c3    # 0.33f

    .line 173
    .line 174
    .line 175
    const v22, -0x41bd70a4    # -0.19f

    .line 176
    .line 177
    .line 178
    const v23, 0x3ea8f5c3    # 0.33f

    .line 179
    .line 180
    .line 181
    const v24, -0x40d47ae1    # -0.67f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x3fd33333    # -2.7f

    .line 188
    .line 189
    .line 190
    const v6, -0x3f6a3d71    # -4.68f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const v6, -0x40228f5c    # -1.73f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x4095c28f    # 4.68f

    .line 205
    .line 206
    .line 207
    const v6, 0x402ccccd    # 2.7f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x41300000    # 11.0f

    .line 214
    .line 215
    const v26, 0x41166666    # 9.4f

    .line 216
    .line 217
    .line 218
    const v21, 0x412947ae    # 10.58f

    .line 219
    .line 220
    .line 221
    const v22, 0x41207ae1    # 10.03f

    .line 222
    .line 223
    .line 224
    const/high16 v23, 0x41300000    # 11.0f

    .line 225
    .line 226
    const v24, 0x411ca3d7    # 9.79f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x40800000    # 4.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x40000000    # 2.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, 0x40accccd    # 5.4f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, 0x3f400000    # 0.75f

    .line 249
    .line 250
    const v26, 0x3edc28f6    # 0.43f

    .line 251
    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const v22, 0x3ec28f5c    # 0.38f

    .line 256
    .line 257
    .line 258
    const v23, 0x3ed70a3d    # 0.42f

    .line 259
    .line 260
    .line 261
    const v24, 0x3f2147ae    # 0.63f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, 0x4095c28f    # 4.68f

    .line 268
    .line 269
    .line 270
    const v6, -0x3fd33333    # -2.7f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3fdd70a4    # 1.73f

    .line 277
    .line 278
    .line 279
    const/high16 v6, 0x3f800000    # 1.0f

    .line 280
    .line 281
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x402ccccd    # 2.7f

    .line 285
    .line 286
    .line 287
    const v6, -0x3f6a3d71    # -4.68f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/16 v25, 0x0

    .line 294
    .line 295
    const v26, 0x3f5eb852    # 0.87f

    .line 296
    .line 297
    .line 298
    const v21, -0x41570a3d    # -0.33f

    .line 299
    .line 300
    .line 301
    const v22, 0x3e428f5c    # 0.19f

    .line 302
    .line 303
    .line 304
    const v23, -0x41570a3d    # -0.33f

    .line 305
    .line 306
    .line 307
    const v24, 0x3f2b851f    # 0.67f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x4095c28f    # 4.68f

    .line 314
    .line 315
    .line 316
    const v6, 0x402ccccd    # 2.7f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v4, 0x4186f5c3    # 16.87f

    .line 323
    .line 324
    .line 325
    const v6, 0x419370a4    # 18.43f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/16 v16, 0x3800

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const v6, 0x3e99999a    # 0.3f

    .line 343
    .line 344
    .line 345
    const v8, 0x3e99999a    # 0.3f

    .line 346
    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/high16 v9, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v12, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    const/4 v15, 0x0

    .line 356
    const-string v4, ""

    .line 357
    .line 358
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 359
    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const v0, 0x41aa51ec    # 21.29f

    .line 389
    .line 390
    .line 391
    const v2, 0x415e6666    # 13.9f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x41900000    # 18.0f

    .line 398
    .line 399
    const/high16 v2, 0x41400000    # 12.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, -0x400ccccd    # -1.9f

    .line 405
    .line 406
    .line 407
    const v2, 0x40528f5c    # 3.29f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3ebd70a4    # 0.37f

    .line 414
    .line 415
    .line 416
    const v18, -0x4050a3d7    # -1.37f

    .line 417
    .line 418
    .line 419
    const v13, 0x3ef5c28f    # 0.48f

    .line 420
    .line 421
    .line 422
    const v14, -0x4170a3d7    # -0.28f

    .line 423
    .line 424
    .line 425
    const v15, 0x3f23d70a    # 0.64f

    .line 426
    .line 427
    .line 428
    const v16, -0x409c28f6    # -0.89f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, -0x3fa28f5c    # -3.46f

    .line 435
    .line 436
    .line 437
    const/high16 v2, -0x40000000    # -2.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x4050a3d7    # -1.37f

    .line 443
    .line 444
    .line 445
    const v18, -0x41428f5c    # -0.37f

    .line 446
    .line 447
    .line 448
    const v13, -0x4170a3d7    # -0.28f

    .line 449
    .line 450
    .line 451
    const v14, -0x410a3d71    # -0.48f

    .line 452
    .line 453
    .line 454
    const v15, -0x409c28f6    # -0.89f

    .line 455
    .line 456
    .line 457
    const v16, -0x40dc28f6    # -0.64f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41700000    # 15.0f

    .line 464
    .line 465
    const v2, 0x40d9999a    # 6.8f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x40400000    # 3.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x40800000    # -1.0f

    .line 477
    .line 478
    const/high16 v18, -0x40800000    # -1.0f

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const v14, -0x40f33333    # -0.55f

    .line 482
    .line 483
    .line 484
    const v15, -0x4119999a    # -0.45f

    .line 485
    .line 486
    .line 487
    const/high16 v16, -0x40800000    # -1.0f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, -0x3f800000    # -4.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x41100000    # 9.0f

    .line 498
    .line 499
    const/high16 v18, 0x40400000    # 3.0f

    .line 500
    .line 501
    const v13, 0x41173333    # 9.45f

    .line 502
    .line 503
    .line 504
    const/high16 v14, 0x40000000    # 2.0f

    .line 505
    .line 506
    const/high16 v15, 0x41100000    # 9.0f

    .line 507
    .line 508
    const v16, 0x401ccccd    # 2.45f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x40733333    # 3.8f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, 0x40b6b852    # 5.71f

    .line 521
    .line 522
    .line 523
    const v2, 0x409ccccd    # 4.9f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x408ae148    # 4.34f

    .line 530
    .line 531
    .line 532
    const v18, 0x40a8a3d7    # 5.27f

    .line 533
    .line 534
    .line 535
    const v13, 0x40a75c29    # 5.23f

    .line 536
    .line 537
    .line 538
    const v14, 0x409428f6    # 4.63f

    .line 539
    .line 540
    .line 541
    const v15, 0x4093d70a    # 4.62f

    .line 542
    .line 543
    .line 544
    const v16, 0x409947ae    # 4.79f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x405d70a4    # 3.46f

    .line 551
    .line 552
    .line 553
    const/high16 v2, -0x40000000    # -2.0f

    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, 0x402d70a4    # 2.71f

    .line 559
    .line 560
    .line 561
    const v18, 0x4121999a    # 10.1f

    .line 562
    .line 563
    .line 564
    const v13, 0x4003d70a    # 2.06f

    .line 565
    .line 566
    .line 567
    const v14, 0x41135c29    # 9.21f

    .line 568
    .line 569
    .line 570
    const v15, 0x400eb852    # 2.23f

    .line 571
    .line 572
    .line 573
    const v16, 0x411d1eb8    # 9.82f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x40c00000    # 6.0f

    .line 580
    .line 581
    const/high16 v2, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, -0x3fad70a4    # -3.29f

    .line 587
    .line 588
    .line 589
    const v2, 0x3ff33333    # 1.9f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, -0x41428f5c    # -0.37f

    .line 596
    .line 597
    .line 598
    const v18, 0x3faf5c29    # 1.37f

    .line 599
    .line 600
    .line 601
    const v13, -0x410a3d71    # -0.48f

    .line 602
    .line 603
    .line 604
    const v14, 0x3e8f5c29    # 0.28f

    .line 605
    .line 606
    .line 607
    const v15, -0x40dc28f6    # -0.64f

    .line 608
    .line 609
    .line 610
    const v16, 0x3f63d70a    # 0.89f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x405d70a4    # 3.46f

    .line 617
    .line 618
    .line 619
    const/high16 v2, 0x40000000    # 2.0f

    .line 620
    .line 621
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x3faf5c29    # 1.37f

    .line 625
    .line 626
    .line 627
    const v18, 0x3ebd70a4    # 0.37f

    .line 628
    .line 629
    .line 630
    const v13, 0x3e8f5c29    # 0.28f

    .line 631
    .line 632
    .line 633
    const v14, 0x3ef5c28f    # 0.48f

    .line 634
    .line 635
    .line 636
    const v15, 0x3f63d70a    # 0.89f

    .line 637
    .line 638
    .line 639
    const v16, 0x3f23d70a    # 0.64f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, 0x41100000    # 9.0f

    .line 646
    .line 647
    const v2, 0x4189999a    # 17.2f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41a80000    # 21.0f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v17, 0x3f800000    # 1.0f

    .line 659
    .line 660
    const/high16 v18, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/4 v13, 0x0

    .line 663
    const v14, 0x3f0ccccd    # 0.55f

    .line 664
    .line 665
    .line 666
    const v15, 0x3ee66666    # 0.45f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x3f800000    # 1.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x40800000    # 4.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v18, -0x40800000    # -1.0f

    .line 680
    .line 681
    const v13, 0x3f0ccccd    # 0.55f

    .line 682
    .line 683
    .line 684
    const/4 v14, 0x0

    .line 685
    const/high16 v15, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const v16, -0x4119999a    # -0.45f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x3f8ccccd    # -3.8f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x3ff33333    # 1.9f

    .line 700
    .line 701
    .line 702
    const v2, 0x40528f5c    # 3.29f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v17, 0x3faf5c29    # 1.37f

    .line 709
    .line 710
    .line 711
    const v18, -0x41428f5c    # -0.37f

    .line 712
    .line 713
    .line 714
    const v13, 0x3ef5c28f    # 0.48f

    .line 715
    .line 716
    .line 717
    const v14, 0x3e8f5c29    # 0.28f

    .line 718
    .line 719
    .line 720
    const v15, 0x3f8b851f    # 1.09f

    .line 721
    .line 722
    .line 723
    const v16, 0x3de147ae    # 0.11f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, -0x3fa28f5c    # -3.46f

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x40000000    # 2.0f

    .line 733
    .line 734
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v17, 0x41aa51ec    # 21.29f

    .line 738
    .line 739
    .line 740
    const v18, 0x415e6666    # 13.9f

    .line 741
    .line 742
    .line 743
    const v13, 0x41af851f    # 21.94f

    .line 744
    .line 745
    .line 746
    const v14, 0x416ca3d7    # 14.79f

    .line 747
    .line 748
    .line 749
    const v15, 0x41ae28f6    # 21.77f

    .line 750
    .line 751
    .line 752
    const v16, 0x4162e148    # 14.18f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x4186f5c3    # 16.87f

    .line 762
    .line 763
    .line 764
    const v2, 0x419370a4    # 18.43f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, -0x3fd33333    # -2.7f

    .line 771
    .line 772
    .line 773
    const v2, -0x3f6a3d71    # -4.68f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v17, 0x41500000    # 13.0f

    .line 780
    .line 781
    const v18, 0x4169999a    # 14.6f

    .line 782
    .line 783
    .line 784
    const v13, 0x4156b852    # 13.42f

    .line 785
    .line 786
    .line 787
    const v14, 0x415f851f    # 13.97f

    .line 788
    .line 789
    .line 790
    const/high16 v15, 0x41500000    # 13.0f

    .line 791
    .line 792
    const v16, 0x41635c29    # 14.21f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, 0x41a00000    # 20.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v0, -0x40000000    # -2.0f

    .line 804
    .line 805
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v0, -0x3f533333    # -5.4f

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v17, -0x40c00000    # -0.75f

    .line 815
    .line 816
    const v18, -0x4123d70a    # -0.43f

    .line 817
    .line 818
    .line 819
    const/4 v13, 0x0

    .line 820
    const v14, -0x413d70a4    # -0.38f

    .line 821
    .line 822
    .line 823
    const v15, -0x4128f5c3    # -0.42f

    .line 824
    .line 825
    .line 826
    const v16, -0x40deb852    # -0.63f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v0, 0x402ccccd    # 2.7f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, -0x40800000    # -1.0f

    .line 839
    .line 840
    const v2, -0x40228f5c    # -1.73f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, 0x4095c28f    # 4.68f

    .line 847
    .line 848
    .line 849
    const v2, -0x3fd33333    # -2.7f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/16 v17, 0x0

    .line 856
    .line 857
    const v18, -0x40a147ae    # -0.87f

    .line 858
    .line 859
    .line 860
    const v13, 0x3ea8f5c3    # 0.33f

    .line 861
    .line 862
    .line 863
    const v14, -0x41bd70a4    # -0.19f

    .line 864
    .line 865
    .line 866
    const v15, 0x3ea8f5c3    # 0.33f

    .line 867
    .line 868
    .line 869
    const v16, -0x40d47ae1    # -0.67f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v0, -0x3fd33333    # -2.7f

    .line 876
    .line 877
    .line 878
    const v2, -0x3f6a3d71    # -4.68f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v0, 0x3f800000    # 1.0f

    .line 885
    .line 886
    const v2, -0x40228f5c    # -1.73f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v0, 0x4095c28f    # 4.68f

    .line 893
    .line 894
    .line 895
    const v2, 0x402ccccd    # 2.7f

    .line 896
    .line 897
    .line 898
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v17, 0x41300000    # 11.0f

    .line 902
    .line 903
    const v18, 0x41166666    # 9.4f

    .line 904
    .line 905
    .line 906
    const v13, 0x412947ae    # 10.58f

    .line 907
    .line 908
    .line 909
    const v14, 0x41207ae1    # 10.03f

    .line 910
    .line 911
    .line 912
    const/high16 v15, 0x41300000    # 11.0f

    .line 913
    .line 914
    const v16, 0x411ca3d7    # 9.79f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/high16 v0, 0x40800000    # 4.0f

    .line 921
    .line 922
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v0, 0x40000000    # 2.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, 0x40accccd    # 5.4f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v17, 0x3f400000    # 0.75f

    .line 937
    .line 938
    const v18, 0x3edc28f6    # 0.43f

    .line 939
    .line 940
    .line 941
    const/4 v13, 0x0

    .line 942
    const v14, 0x3ec28f5c    # 0.38f

    .line 943
    .line 944
    .line 945
    const v15, 0x3ed70a3d    # 0.42f

    .line 946
    .line 947
    .line 948
    const v16, 0x3f2147ae    # 0.63f

    .line 949
    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v0, 0x4095c28f    # 4.68f

    .line 955
    .line 956
    .line 957
    const v2, -0x3fd33333    # -2.7f

    .line 958
    .line 959
    .line 960
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v0, 0x3fdd70a4    # 1.73f

    .line 964
    .line 965
    .line 966
    const/high16 v2, 0x3f800000    # 1.0f

    .line 967
    .line 968
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v0, 0x402ccccd    # 2.7f

    .line 972
    .line 973
    .line 974
    const v2, -0x3f6a3d71    # -4.68f

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const/16 v17, 0x0

    .line 981
    .line 982
    const v18, 0x3f5eb852    # 0.87f

    .line 983
    .line 984
    .line 985
    const v13, -0x41570a3d    # -0.33f

    .line 986
    .line 987
    .line 988
    const v14, 0x3e428f5c    # 0.19f

    .line 989
    .line 990
    .line 991
    const v15, -0x41570a3d    # -0.33f

    .line 992
    .line 993
    .line 994
    const v16, 0x3f2b851f    # 0.67f

    .line 995
    .line 996
    .line 997
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v0, 0x4095c28f    # 4.68f

    .line 1001
    .line 1002
    .line 1003
    const v2, 0x402ccccd    # 2.7f

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const v0, 0x4186f5c3    # 16.87f

    .line 1010
    .line 1011
    .line 1012
    const v2, 0x419370a4    # 18.43f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    const/16 v16, 0x3800

    .line 1026
    .line 1027
    const/16 v17, 0x0

    .line 1028
    .line 1029
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1030
    .line 1031
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1032
    .line 1033
    const/4 v7, 0x0

    .line 1034
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1035
    .line 1036
    const/4 v13, 0x0

    .line 1037
    const/4 v14, 0x0

    .line 1038
    const/4 v15, 0x0

    .line 1039
    const-string v4, ""

    .line 1040
    .line 1041
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    sput-object v0, Landroidx/compose/material/icons/twotone/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1050
    .line 1051
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    return-object v0
.end method
