.class public final Landroidx/compose/material/icons/twotone/StrollerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stroller:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStroller(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StrollerKt;->_stroller:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Stroller"

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
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3f5c28f6    # 0.86f

    .line 78
    .line 79
    .line 80
    const v26, 0x3d4ccccd    # 0.05f

    .line 81
    .line 82
    .line 83
    const v21, 0x3e947ae1    # 0.29f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3f147ae1    # 0.58f

    .line 89
    .line 90
    .line 91
    const v24, 0x3ca3d70a    # 0.02f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40d51eb8    # 6.66f

    .line 100
    .line 101
    .line 102
    const v6, 0x4117d70a    # 9.49f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, -0x404ccccd    # -1.4f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x41200000    # 10.0f

    .line 115
    .line 116
    const/high16 v26, 0x40a00000    # 5.0f

    .line 117
    .line 118
    const v21, 0x410b5c29    # 8.71f

    .line 119
    .line 120
    .line 121
    const v22, 0x40a2e148    # 5.09f

    .line 122
    .line 123
    .line 124
    const v23, 0x4115999a    # 9.35f

    .line 125
    .line 126
    .line 127
    const/high16 v24, 0x40a00000    # 5.0f

    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x410a8f5c    # 8.66f

    .line 133
    .line 134
    .line 135
    const/high16 v6, 0x41700000    # 15.0f

    .line 136
    .line 137
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x41700000    # 15.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x4119999a    # 9.6f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x410a8f5c    # 8.66f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x40a00000    # 5.0f

    .line 212
    .line 213
    const/high16 v2, 0x41200000    # 10.0f

    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3f5c28f6    # 0.86f

    .line 219
    .line 220
    .line 221
    const v18, 0x3d4ccccd    # 0.05f

    .line 222
    .line 223
    .line 224
    const v13, 0x3e947ae1    # 0.29f

    .line 225
    .line 226
    .line 227
    const v15, 0x3f147ae1    # 0.58f

    .line 228
    .line 229
    .line 230
    const v16, 0x3ca3d70a    # 0.02f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x40d51eb8    # 6.66f

    .line 237
    .line 238
    .line 239
    const v2, 0x4117d70a    # 9.49f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x404ccccd    # -1.4f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x41200000    # 10.0f

    .line 252
    .line 253
    const/high16 v18, 0x40a00000    # 5.0f

    .line 254
    .line 255
    const v13, 0x410b5c29    # 8.71f

    .line 256
    .line 257
    .line 258
    const v14, 0x40a2e148    # 5.09f

    .line 259
    .line 260
    .line 261
    const v15, 0x4115999a    # 9.35f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x40a00000    # 5.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x410a8f5c    # 8.66f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x41700000    # 15.0f

    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41700000    # 15.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, 0x4119999a    # 9.6f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x410a8f5c    # 8.66f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x41953333    # 18.65f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x40400000    # 3.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x3fb47ae1    # -3.18f

    .line 303
    .line 304
    .line 305
    const v18, 0x4001eb85    # 2.03f

    .line 306
    .line 307
    .line 308
    const v13, -0x402b851f    # -1.66f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, -0x3fdd70a4    # -2.54f

    .line 313
    .line 314
    .line 315
    const v16, 0x3fa28f5c    # 1.27f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x3ef33333    # -8.8f

    .line 322
    .line 323
    .line 324
    const v2, 0x41251eb8    # 10.32f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x40edc28f    # 7.43f

    .line 331
    .line 332
    .line 333
    const/high16 v18, 0x41880000    # 17.0f

    .line 334
    .line 335
    const v13, 0x40c3d70a    # 6.12f

    .line 336
    .line 337
    .line 338
    const/high16 v14, 0x41800000    # 16.0f

    .line 339
    .line 340
    const v15, 0x40d28f5c    # 6.58f

    .line 341
    .line 342
    .line 343
    const/high16 v16, 0x41880000    # 17.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41700000    # 15.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x40000000    # 2.0f

    .line 354
    .line 355
    const/high16 v18, -0x40000000    # -2.0f

    .line 356
    .line 357
    const v13, 0x3f8ccccd    # 1.1f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/high16 v15, 0x40000000    # 2.0f

    .line 362
    .line 363
    const v16, -0x4099999a    # -0.9f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40c8a3d7    # 6.27f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x41953333    # 18.65f

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x40a00000    # 5.0f

    .line 379
    .line 380
    const v13, 0x418ca3d7    # 17.58f

    .line 381
    .line 382
    .line 383
    const v14, 0x40b2e148    # 5.59f

    .line 384
    .line 385
    .line 386
    const v15, 0x418fc28f    # 17.97f

    .line 387
    .line 388
    .line 389
    const/high16 v16, 0x40a00000    # 5.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41a00000    # 20.0f

    .line 395
    .line 396
    const v18, 0x40cf5c29    # 6.48f

    .line 397
    .line 398
    .line 399
    const v13, 0x419b5c29    # 19.42f

    .line 400
    .line 401
    .line 402
    const/high16 v14, 0x40a00000    # 5.0f

    .line 403
    .line 404
    const/high16 v15, 0x41a00000    # 20.0f

    .line 405
    .line 406
    const v16, 0x40b51eb8    # 5.66f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x40e00000    # 7.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40000000    # 2.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40cf5c29    # 6.48f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x41953333    # 18.65f

    .line 429
    .line 430
    .line 431
    const/high16 v18, 0x40400000    # 3.0f

    .line 432
    .line 433
    const/high16 v13, 0x41b00000    # 22.0f

    .line 434
    .line 435
    const v14, 0x4091eb85    # 4.56f

    .line 436
    .line 437
    .line 438
    const v15, 0x41a428f6    # 20.52f

    .line 439
    .line 440
    .line 441
    const/high16 v16, 0x40400000    # 3.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x41953333    # 18.65f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x40400000    # 3.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x40400000    # 3.0f

    .line 458
    .line 459
    const/high16 v2, 0x41200000    # 10.0f

    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x40970a3d    # 4.72f

    .line 465
    .line 466
    .line 467
    const v18, 0x40970a3d    # 4.72f

    .line 468
    .line 469
    .line 470
    const v13, 0x41007ae1    # 8.03f

    .line 471
    .line 472
    .line 473
    const/high16 v14, 0x40400000    # 3.0f

    .line 474
    .line 475
    const v15, 0x40c6b852    # 6.21f

    .line 476
    .line 477
    .line 478
    const v16, 0x4068f5c3    # 3.64f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x409c7ae1    # 4.89f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x40966666    # 4.7f

    .line 491
    .line 492
    .line 493
    const v2, -0x3f4fae14    # -5.51f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x41200000    # 10.0f

    .line 500
    .line 501
    const/high16 v18, 0x40400000    # 3.0f

    .line 502
    .line 503
    const v13, 0x41507ae1    # 13.03f

    .line 504
    .line 505
    .line 506
    const v14, 0x4059999a    # 3.4f

    .line 507
    .line 508
    .line 509
    const v15, 0x4138f5c3    # 11.56f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x40400000    # 3.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40400000    # 3.0f

    .line 518
    .line 519
    const/high16 v2, 0x41200000    # 10.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    .line 528
    .line 529
    const/high16 v2, 0x41900000    # 18.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, -0x40000000    # -2.0f

    .line 535
    .line 536
    const/high16 v18, 0x40000000    # 2.0f

    .line 537
    .line 538
    const v13, -0x40733333    # -1.1f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const/high16 v15, -0x40000000    # -2.0f

    .line 543
    .line 544
    const v16, 0x3f666666    # 0.9f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x3f666666    # 0.9f

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x40000000    # 2.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x40000000    # -2.0f

    .line 559
    .line 560
    const v2, -0x4099999a    # -0.9f

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x40000000    # 2.0f

    .line 564
    .line 565
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x4188cccd    # 17.1f

    .line 569
    .line 570
    .line 571
    const/high16 v2, 0x41800000    # 16.0f

    .line 572
    .line 573
    const/high16 v4, 0x41900000    # 18.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41800000    # 16.0f

    .line 579
    .line 580
    const/high16 v2, 0x41900000    # 18.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x40c00000    # 6.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x3f666666    # 0.9f

    .line 597
    .line 598
    .line 599
    const/high16 v2, 0x40000000    # 2.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, -0x40000000    # -2.0f

    .line 605
    .line 606
    const v2, -0x4099999a    # -0.9f

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x40000000    # 2.0f

    .line 610
    .line 611
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x40e33333    # 7.1f

    .line 615
    .line 616
    .line 617
    const/high16 v2, 0x40c00000    # 6.0f

    .line 618
    .line 619
    const/high16 v4, 0x41900000    # 18.0f

    .line 620
    .line 621
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x40c00000    # 6.0f

    .line 625
    .line 626
    const/high16 v2, 0x41900000    # 18.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    const/16 v16, 0x3800

    .line 639
    .line 640
    const/16 v17, 0x0

    .line 641
    .line 642
    const/high16 v6, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/high16 v8, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v12, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const/4 v15, 0x0

    .line 651
    const-string v4, ""

    .line 652
    .line 653
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    sput-object v0, Landroidx/compose/material/icons/twotone/StrollerKt;->_stroller:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 662
    .line 663
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    return-object v0
.end method
