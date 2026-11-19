.class public final Landroidx/compose/material/icons/outlined/SportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSports(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsKt;->_sports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Sports"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const v6, 0x4133ae14    # 11.23f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x40dbd70a    # 6.87f

    .line 79
    .line 80
    .line 81
    const v26, 0x40f75c29    # 7.73f

    .line 82
    .line 83
    .line 84
    const v21, 0x41191eb8    # 9.57f

    .line 85
    .line 86
    .line 87
    const/high16 v22, 0x40c00000    # 6.0f

    .line 88
    .line 89
    const v23, 0x410028f6    # 8.01f

    .line 90
    .line 91
    .line 92
    const v24, 0x40d51eb8    # 6.66f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v25, 0x40900000    # 4.5f

    .line 101
    .line 102
    const/high16 v26, 0x40c00000    # 6.0f

    .line 103
    .line 104
    const v21, 0x40d147ae    # 6.54f

    .line 105
    .line 106
    .line 107
    const v22, 0x40d75c29    # 6.73f

    .line 108
    .line 109
    .line 110
    const v23, 0x40b3851f    # 5.61f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x40c00000    # 6.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, 0x40000000    # 2.0f

    .line 119
    .line 120
    const/high16 v26, 0x41080000    # 8.5f

    .line 121
    .line 122
    const v21, 0x4047ae14    # 3.12f

    .line 123
    .line 124
    .line 125
    const/high16 v22, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const/high16 v23, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v24, 0x40e3d70a    # 7.12f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x40900000    # 4.5f

    .line 136
    .line 137
    const/high16 v26, 0x41300000    # 11.0f

    .line 138
    .line 139
    const/high16 v21, 0x40000000    # 2.0f

    .line 140
    .line 141
    const v22, 0x411e147b    # 9.88f

    .line 142
    .line 143
    .line 144
    const v23, 0x4047ae14    # 3.12f

    .line 145
    .line 146
    .line 147
    const/high16 v24, 0x41300000    # 11.0f

    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v25, 0x3f1c28f6    # 0.61f

    .line 153
    .line 154
    .line 155
    const v26, -0x425c28f6    # -0.08f

    .line 156
    .line 157
    .line 158
    const v21, 0x3e570a3d    # 0.21f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const v23, 0x3ed1eb85    # 0.41f

    .line 164
    .line 165
    .line 166
    const v24, -0x430a3d71    # -0.03f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x42333333    # -0.1f

    .line 173
    .line 174
    .line 175
    const v26, 0x3f47ae14    # 0.78f

    .line 176
    .line 177
    .line 178
    const v21, -0x42b33333    # -0.05f

    .line 179
    .line 180
    .line 181
    const/high16 v22, 0x3e800000    # 0.25f

    .line 182
    .line 183
    const v23, -0x4247ae14    # -0.09f

    .line 184
    .line 185
    .line 186
    const v24, 0x3f028f5c    # 0.51f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, 0x40d5c28f    # 6.68f

    .line 193
    .line 194
    .line 195
    const v26, 0x40c8a3d7    # 6.27f

    .line 196
    .line 197
    .line 198
    const v21, -0x41c7ae14    # -0.18f

    .line 199
    .line 200
    .line 201
    const v22, 0x406b851f    # 3.68f

    .line 202
    .line 203
    .line 204
    const v23, 0x403ccccd    # 2.95f

    .line 205
    .line 206
    .line 207
    const v24, 0x40d5c28f    # 6.68f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x40a6147b    # 5.19f

    .line 214
    .line 215
    .line 216
    const v26, -0x3f675c29    # -4.77f

    .line 217
    .line 218
    .line 219
    const v21, 0x40233333    # 2.55f

    .line 220
    .line 221
    .line 222
    const v22, -0x4170a3d7    # -0.28f

    .line 223
    .line 224
    .line 225
    const v23, 0x4095c28f    # 4.68f

    .line 226
    .line 227
    .line 228
    const v24, -0x3fef5c29    # -2.26f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x3d75c28f    # 0.06f

    .line 235
    .line 236
    .line 237
    const v26, -0x3ffc28f6    # -2.06f

    .line 238
    .line 239
    .line 240
    const v21, 0x3e19999a    # 0.15f

    .line 241
    .line 242
    .line 243
    const v22, -0x40ca3d71    # -0.71f

    .line 244
    .line 245
    .line 246
    const v23, 0x3e19999a    # 0.15f

    .line 247
    .line 248
    .line 249
    const v24, -0x404ccccd    # -1.4f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, 0x3f7d70a4    # 0.99f

    .line 256
    .line 257
    .line 258
    const v26, -0x406f5c29    # -1.13f

    .line 259
    .line 260
    .line 261
    const v21, -0x4247ae14    # -0.09f

    .line 262
    .line 263
    .line 264
    const v22, -0x40e66666    # -0.6f

    .line 265
    .line 266
    .line 267
    const v23, 0x3ec28f5c    # 0.38f

    .line 268
    .line 269
    .line 270
    const v24, -0x406f5c29    # -1.13f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x41b00000    # 22.0f

    .line 277
    .line 278
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v4, 0x40c00000    # 6.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x4133ae14    # 11.23f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40900000    # 4.5f

    .line 296
    .line 297
    const/high16 v6, 0x41100000    # 9.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v25, 0x40800000    # 4.0f

    .line 303
    .line 304
    const/high16 v26, 0x41080000    # 8.5f

    .line 305
    .line 306
    const v21, 0x40870a3d    # 4.22f

    .line 307
    .line 308
    .line 309
    const/high16 v22, 0x41100000    # 9.0f

    .line 310
    .line 311
    const/high16 v23, 0x40800000    # 4.0f

    .line 312
    .line 313
    const v24, 0x410c7ae1    # 8.78f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, 0x40900000    # 4.5f

    .line 320
    .line 321
    const/high16 v26, 0x41000000    # 8.0f

    .line 322
    .line 323
    const/high16 v21, 0x40800000    # 4.0f

    .line 324
    .line 325
    const v22, 0x4103851f    # 8.22f

    .line 326
    .line 327
    .line 328
    const v23, 0x40870a3d    # 4.22f

    .line 329
    .line 330
    .line 331
    const/high16 v24, 0x41000000    # 8.0f

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x4103851f    # 8.22f

    .line 337
    .line 338
    .line 339
    const/high16 v6, 0x41080000    # 8.5f

    .line 340
    .line 341
    const/high16 v7, 0x40a00000    # 5.0f

    .line 342
    .line 343
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v26, 0x41100000    # 9.0f

    .line 347
    .line 348
    const/high16 v21, 0x40a00000    # 5.0f

    .line 349
    .line 350
    const v22, 0x410c7ae1    # 8.78f

    .line 351
    .line 352
    .line 353
    const v23, 0x4098f5c3    # 4.78f

    .line 354
    .line 355
    .line 356
    const/high16 v24, 0x41100000    # 9.0f

    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x41700000    # 15.0f

    .line 365
    .line 366
    const/high16 v6, 0x41300000    # 11.0f

    .line 367
    .line 368
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 372
    .line 373
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 374
    .line 375
    const v21, -0x402b851f    # -1.66f

    .line 376
    .line 377
    .line 378
    const/16 v22, 0x0

    .line 379
    .line 380
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 381
    .line 382
    const v24, -0x40547ae1    # -1.34f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 389
    .line 390
    const v6, 0x3fab851f    # 1.34f

    .line 391
    .line 392
    .line 393
    const/high16 v7, 0x40400000    # 3.0f

    .line 394
    .line 395
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x3fab851f    # 1.34f

    .line 399
    .line 400
    .line 401
    const/high16 v6, 0x40400000    # 3.0f

    .line 402
    .line 403
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x414a8f5c    # 12.66f

    .line 407
    .line 408
    .line 409
    const/high16 v6, 0x41700000    # 15.0f

    .line 410
    .line 411
    const/high16 v7, 0x41300000    # 11.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/16 v16, 0x3800

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/high16 v6, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/high16 v8, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    const/high16 v9, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/high16 v12, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    const/4 v15, 0x0

    .line 439
    const-string v4, ""

    .line 440
    .line 441
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 442
    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 451
    .line 452
    .line 453
    move-result-wide v6

    .line 454
    const/4 v0, 0x0

    .line 455
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41400000    # 12.0f

    .line 472
    .line 473
    const/high16 v2, 0x41300000    # 11.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, -0x40000000    # -2.0f

    .line 479
    .line 480
    const/4 v2, 0x0

    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v18, 0x40800000    # 4.0f

    .line 485
    .line 486
    const/16 v19, 0x0

    .line 487
    .line 488
    const/high16 v13, 0x40000000    # 2.0f

    .line 489
    .line 490
    const/high16 v14, 0x40000000    # 2.0f

    .line 491
    .line 492
    const/16 v16, 0x1

    .line 493
    .line 494
    const/16 v17, 0x1

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v18, -0x3f800000    # -4.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/16 v16, 0x3800

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const/high16 v6, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v7, 0x0

    .line 515
    const/high16 v12, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/4 v13, 0x0

    .line 518
    const/4 v14, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsKt;->_sports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object v0
.end method
