.class public final Landroidx/compose/material/icons/twotone/ChangeCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChangeCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ChangeCircleKt;->_changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ChangeCircle"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, 0x408d1eb8    # 4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x41000000    # 8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41000000    # 8.0f

    .line 97
    .line 98
    const v6, -0x3f9a3d71    # -3.59f

    .line 99
    .line 100
    .line 101
    const/high16 v7, -0x3f000000    # -8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, -0x3f9a3d71    # -3.59f

    .line 107
    .line 108
    .line 109
    const/high16 v6, -0x3f000000    # -8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x40f2e148    # 7.59f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x415570a4    # 13.34f

    .line 125
    .line 126
    .line 127
    const v6, 0x4140f5c3    # 12.06f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x4008f5c3    # 2.14f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, -0x3fdd70a4    # -2.54f

    .line 140
    .line 141
    .line 142
    const v26, -0x407eb852    # -1.01f

    .line 143
    .line 144
    .line 145
    const v21, -0x40947ae1    # -0.92f

    .line 146
    .line 147
    .line 148
    const v22, 0x3ca3d70a    # 0.02f

    .line 149
    .line 150
    .line 151
    const v23, -0x40147ae1    # -1.84f

    .line 152
    .line 153
    .line 154
    const v24, -0x416147ae    # -0.31f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x40e8f5c3    # -0.59f

    .line 161
    .line 162
    .line 163
    const v26, -0x3f7bd70a    # -4.13f

    .line 164
    .line 165
    .line 166
    const v21, -0x4070a3d7    # -1.12f

    .line 167
    .line 168
    .line 169
    const v22, -0x4070a3d7    # -1.12f

    .line 170
    .line 171
    .line 172
    const v23, -0x4059999a    # -1.3f

    .line 173
    .line 174
    .line 175
    const v24, -0x3fcccccd    # -2.8f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, -0x40733333    # -1.1f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, 0x3f23d70a    # 0.64f

    .line 188
    .line 189
    .line 190
    const v26, 0x40c947ae    # 6.29f

    .line 191
    .line 192
    .line 193
    const v21, -0x405c28f6    # -1.28f

    .line 194
    .line 195
    .line 196
    const v22, 0x3ff851ec    # 1.94f

    .line 197
    .line 198
    .line 199
    const v23, -0x40770a3d    # -1.07f

    .line 200
    .line 201
    .line 202
    const v24, 0x4092e148    # 4.59f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v26, 0x41880000    # 17.0f

    .line 211
    .line 212
    const v21, 0x41170a3d    # 9.44f

    .line 213
    .line 214
    .line 215
    const v22, 0x4184147b    # 16.51f

    .line 216
    .line 217
    .line 218
    const v23, 0x412b851f    # 10.72f

    .line 219
    .line 220
    .line 221
    const/high16 v24, 0x41880000    # 17.0f

    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v25, 0x3d75c28f    # 0.06f

    .line 227
    .line 228
    .line 229
    const/16 v26, 0x0

    .line 230
    .line 231
    const v21, 0x3ca3d70a    # 0.02f

    .line 232
    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const v23, 0x3d23d70a    # 0.04f

    .line 237
    .line 238
    .line 239
    const/16 v24, 0x0

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41980000    # 19.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, -0x3fcae148    # -2.83f

    .line 250
    .line 251
    .line 252
    const v6, 0x40351eb8    # 2.83f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x415570a4    # 13.34f

    .line 259
    .line 260
    .line 261
    const v6, 0x4140f5c3    # 12.06f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x41075c29    # 8.46f

    .line 271
    .line 272
    .line 273
    const v6, 0x4178a3d7    # 15.54f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, -0x3f99999a    # -3.6f

    .line 280
    .line 281
    .line 282
    const v26, -0x40466666    # -1.45f

    .line 283
    .line 284
    .line 285
    const v21, -0x40828f5c    # -0.99f

    .line 286
    .line 287
    .line 288
    const v22, -0x40828f5c    # -0.99f

    .line 289
    .line 290
    .line 291
    const v23, -0x3feccccd    # -2.3f

    .line 292
    .line 293
    .line 294
    const v24, -0x40451eb8    # -1.46f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x40a00000    # 5.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, 0x40fa8f5c    # 7.83f

    .line 306
    .line 307
    .line 308
    const v6, 0x4111c28f    # 9.11f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x40351eb8    # 2.83f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x410828f6    # 8.51f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x3d75c28f    # 0.06f

    .line 327
    .line 328
    .line 329
    const/16 v26, 0x0

    .line 330
    .line 331
    const v21, 0x3ca3d70a    # 0.02f

    .line 332
    .line 333
    .line 334
    const/16 v22, 0x0

    .line 335
    .line 336
    const v23, 0x3d23d70a    # 0.04f

    .line 337
    .line 338
    .line 339
    const/16 v24, 0x0

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, 0x401eb852    # 2.48f

    .line 345
    .line 346
    .line 347
    const v26, 0x3f828f5c    # 1.02f

    .line 348
    .line 349
    .line 350
    const v21, 0x3f666666    # 0.9f

    .line 351
    .line 352
    .line 353
    const v23, 0x3fe51eb8    # 1.79f

    .line 354
    .line 355
    .line 356
    const v24, 0x3eae147b    # 0.34f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, 0x3f170a3d    # 0.59f

    .line 363
    .line 364
    .line 365
    const v26, 0x408428f6    # 4.13f

    .line 366
    .line 367
    .line 368
    const v21, 0x3f8f5c29    # 1.12f

    .line 369
    .line 370
    .line 371
    const v22, 0x3f8f5c29    # 1.12f

    .line 372
    .line 373
    .line 374
    const v23, 0x3fa66666    # 1.3f

    .line 375
    .line 376
    .line 377
    const v24, 0x40333333    # 2.8f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x3f8ccccd    # 1.1f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v25, 0x4178a3d7    # 15.54f

    .line 390
    .line 391
    .line 392
    const v26, 0x41075c29    # 8.46f

    .line 393
    .line 394
    .line 395
    const v21, 0x418b999a    # 17.45f

    .line 396
    .line 397
    .line 398
    const v22, 0x414d1eb8    # 12.82f

    .line 399
    .line 400
    .line 401
    const v23, 0x4189eb85    # 17.24f

    .line 402
    .line 403
    .line 404
    const v24, 0x4122b852    # 10.17f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const/16 v16, 0x3800

    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const v6, 0x3e99999a    # 0.3f

    .line 422
    .line 423
    .line 424
    const v8, 0x3e99999a    # 0.3f

    .line 425
    .line 426
    .line 427
    const/4 v7, 0x0

    .line 428
    const/high16 v9, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/high16 v12, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const/4 v14, 0x0

    .line 434
    const/4 v15, 0x0

    .line 435
    const-string v4, ""

    .line 436
    .line 437
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 438
    .line 439
    .line 440
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 445
    .line 446
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 447
    .line 448
    .line 449
    move-result-wide v6

    .line 450
    const/4 v0, 0x0

    .line 451
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40800000    # 4.0f

    .line 468
    .line 469
    const/high16 v2, 0x41400000    # 12.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41000000    # 8.0f

    .line 475
    .line 476
    const/high16 v18, 0x41000000    # 8.0f

    .line 477
    .line 478
    const v13, 0x408d1eb8    # 4.41f

    .line 479
    .line 480
    .line 481
    const/high16 v15, 0x41000000    # 8.0f

    .line 482
    .line 483
    const v16, 0x4065c28f    # 3.59f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41000000    # 8.0f

    .line 490
    .line 491
    const v2, -0x3f9a3d71    # -3.59f

    .line 492
    .line 493
    .line 494
    const/high16 v4, -0x3f000000    # -8.0f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x3f9a3d71    # -3.59f

    .line 500
    .line 501
    .line 502
    const/high16 v2, -0x3f000000    # -8.0f

    .line 503
    .line 504
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x40f2e148    # 7.59f

    .line 508
    .line 509
    .line 510
    const/high16 v2, 0x40800000    # 4.0f

    .line 511
    .line 512
    const/high16 v4, 0x41400000    # 12.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40000000    # 2.0f

    .line 518
    .line 519
    const/high16 v2, 0x41400000    # 12.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x40000000    # 2.0f

    .line 525
    .line 526
    const/high16 v18, 0x41400000    # 12.0f

    .line 527
    .line 528
    const v13, 0x40cf5c29    # 6.48f

    .line 529
    .line 530
    .line 531
    const/high16 v14, 0x40000000    # 2.0f

    .line 532
    .line 533
    const/high16 v15, 0x40000000    # 2.0f

    .line 534
    .line 535
    const v16, 0x40cf5c29    # 6.48f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x408f5c29    # 4.48f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x41200000    # 10.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, -0x3f70a3d7    # -4.48f

    .line 550
    .line 551
    .line 552
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 553
    .line 554
    const/high16 v4, 0x41200000    # 10.0f

    .line 555
    .line 556
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x418c28f6    # 17.52f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x40000000    # 2.0f

    .line 563
    .line 564
    const/high16 v4, 0x41400000    # 12.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x40000000    # 2.0f

    .line 570
    .line 571
    const/high16 v2, 0x41400000    # 12.0f

    .line 572
    .line 573
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x415570a4    # 13.34f

    .line 580
    .line 581
    .line 582
    const v2, 0x4140f5c3    # 12.06f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x4008f5c3    # 2.14f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, -0x3fdd70a4    # -2.54f

    .line 595
    .line 596
    .line 597
    const v18, -0x407eb852    # -1.01f

    .line 598
    .line 599
    .line 600
    const v13, -0x40947ae1    # -0.92f

    .line 601
    .line 602
    .line 603
    const v14, 0x3ca3d70a    # 0.02f

    .line 604
    .line 605
    .line 606
    const v15, -0x40147ae1    # -1.84f

    .line 607
    .line 608
    .line 609
    const v16, -0x416147ae    # -0.31f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x40e8f5c3    # -0.59f

    .line 616
    .line 617
    .line 618
    const v18, -0x3f7bd70a    # -4.13f

    .line 619
    .line 620
    .line 621
    const v13, -0x4070a3d7    # -1.12f

    .line 622
    .line 623
    .line 624
    const v14, -0x4070a3d7    # -1.12f

    .line 625
    .line 626
    .line 627
    const v15, -0x4059999a    # -1.3f

    .line 628
    .line 629
    .line 630
    const v16, -0x3fcccccd    # -2.8f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, -0x40733333    # -1.1f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3f23d70a    # 0.64f

    .line 643
    .line 644
    .line 645
    const v18, 0x40c947ae    # 6.29f

    .line 646
    .line 647
    .line 648
    const v13, -0x405c28f6    # -1.28f

    .line 649
    .line 650
    .line 651
    const v14, 0x3ff851ec    # 1.94f

    .line 652
    .line 653
    .line 654
    const v15, -0x40770a3d    # -1.07f

    .line 655
    .line 656
    .line 657
    const v16, 0x4092e148    # 4.59f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v17, 0x41400000    # 12.0f

    .line 664
    .line 665
    const/high16 v18, 0x41880000    # 17.0f

    .line 666
    .line 667
    const v13, 0x41170a3d    # 9.44f

    .line 668
    .line 669
    .line 670
    const v14, 0x4184147b    # 16.51f

    .line 671
    .line 672
    .line 673
    const v15, 0x412b851f    # 10.72f

    .line 674
    .line 675
    .line 676
    const/high16 v16, 0x41880000    # 17.0f

    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x3d75c28f    # 0.06f

    .line 682
    .line 683
    .line 684
    const/16 v18, 0x0

    .line 685
    .line 686
    const v13, 0x3ca3d70a    # 0.02f

    .line 687
    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    const v15, 0x3d23d70a    # 0.04f

    .line 691
    .line 692
    .line 693
    const/16 v16, 0x0

    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x41980000    # 19.0f

    .line 699
    .line 700
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, -0x3fcae148    # -2.83f

    .line 704
    .line 705
    .line 706
    const v2, 0x40351eb8    # 2.83f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x415570a4    # 13.34f

    .line 713
    .line 714
    .line 715
    const v2, 0x4140f5c3    # 12.06f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, 0x41075c29    # 8.46f

    .line 725
    .line 726
    .line 727
    const v2, 0x4178a3d7    # 15.54f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, -0x3f99999a    # -3.6f

    .line 734
    .line 735
    .line 736
    const v18, -0x40466666    # -1.45f

    .line 737
    .line 738
    .line 739
    const v13, -0x40828f5c    # -0.99f

    .line 740
    .line 741
    .line 742
    const v14, -0x40828f5c    # -0.99f

    .line 743
    .line 744
    .line 745
    const v15, -0x3feccccd    # -2.3f

    .line 746
    .line 747
    .line 748
    const v16, -0x40451eb8    # -1.46f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v0, 0x40a00000    # 5.0f

    .line 755
    .line 756
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, 0x40fa8f5c    # 7.83f

    .line 760
    .line 761
    .line 762
    const v2, 0x4111c28f    # 9.11f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, 0x40351eb8    # 2.83f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x410828f6    # 8.51f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3d75c28f    # 0.06f

    .line 781
    .line 782
    .line 783
    const/16 v18, 0x0

    .line 784
    .line 785
    const v13, 0x3ca3d70a    # 0.02f

    .line 786
    .line 787
    .line 788
    const/4 v14, 0x0

    .line 789
    const v15, 0x3d23d70a    # 0.04f

    .line 790
    .line 791
    .line 792
    const/16 v16, 0x0

    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x401eb852    # 2.48f

    .line 798
    .line 799
    .line 800
    const v18, 0x3f828f5c    # 1.02f

    .line 801
    .line 802
    .line 803
    const v13, 0x3f666666    # 0.9f

    .line 804
    .line 805
    .line 806
    const v15, 0x3fe51eb8    # 1.79f

    .line 807
    .line 808
    .line 809
    const v16, 0x3eae147b    # 0.34f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v17, 0x3f170a3d    # 0.59f

    .line 816
    .line 817
    .line 818
    const v18, 0x408428f6    # 4.13f

    .line 819
    .line 820
    .line 821
    const v13, 0x3f8f5c29    # 1.12f

    .line 822
    .line 823
    .line 824
    const v14, 0x3f8f5c29    # 1.12f

    .line 825
    .line 826
    .line 827
    const v15, 0x3fa66666    # 1.3f

    .line 828
    .line 829
    .line 830
    const v16, 0x40333333    # 2.8f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, 0x3f8ccccd    # 1.1f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v17, 0x4178a3d7    # 15.54f

    .line 843
    .line 844
    .line 845
    const v18, 0x41075c29    # 8.46f

    .line 846
    .line 847
    .line 848
    const v13, 0x418b999a    # 17.45f

    .line 849
    .line 850
    .line 851
    const v14, 0x414d1eb8    # 12.82f

    .line 852
    .line 853
    .line 854
    const v15, 0x4189eb85    # 17.24f

    .line 855
    .line 856
    .line 857
    const v16, 0x4122b852    # 10.17f

    .line 858
    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const/16 v16, 0x3800

    .line 871
    .line 872
    const/16 v17, 0x0

    .line 873
    .line 874
    const/high16 v6, 0x3f800000    # 1.0f

    .line 875
    .line 876
    const/high16 v8, 0x3f800000    # 1.0f

    .line 877
    .line 878
    const/4 v7, 0x0

    .line 879
    const/high16 v12, 0x3f800000    # 1.0f

    .line 880
    .line 881
    const/4 v13, 0x0

    .line 882
    const/4 v14, 0x0

    .line 883
    const/4 v15, 0x0

    .line 884
    const-string v4, ""

    .line 885
    .line 886
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    sput-object v0, Landroidx/compose/material/icons/twotone/ChangeCircleKt;->_changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 895
    .line 896
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    return-object v0
.end method
