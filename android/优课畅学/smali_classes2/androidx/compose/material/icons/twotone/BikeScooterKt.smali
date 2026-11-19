.class public final Landroidx/compose/material/icons/twotone/BikeScooterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBikeScooter(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BikeScooter"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3f3d70a4    # 0.74f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x410d1eb8    # 8.82f

    .line 84
    .line 85
    .line 86
    const v6, 0x40b1eb85    # 5.56f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v25, 0x40dbd70a    # 6.87f

    .line 93
    .line 94
    .line 95
    const/high16 v26, 0x40800000    # 4.0f

    .line 96
    .line 97
    const v21, 0x4109c28f    # 8.61f

    .line 98
    .line 99
    .line 100
    const v22, 0x4094cccd    # 4.65f

    .line 101
    .line 102
    .line 103
    const v23, 0x40f9999a    # 7.8f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40800000    # 4.0f

    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x40400000    # 3.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x4077ae14    # 3.87f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, 0x3fb5c28f    # 1.42f

    .line 130
    .line 131
    .line 132
    const/high16 v6, 0x40c80000    # 6.25f

    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, -0x43dc28f6    # -0.01f

    .line 138
    .line 139
    .line 140
    const/16 v26, 0x0

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const/16 v22, 0x0

    .line 145
    .line 146
    const v23, -0x43dc28f6    # -0.01f

    .line 147
    .line 148
    .line 149
    const/16 v24, 0x0

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x4082e148    # 4.09f

    .line 155
    .line 156
    .line 157
    const/high16 v26, 0x41880000    # 17.0f

    .line 158
    .line 159
    const v21, 0x40c3d70a    # 6.12f

    .line 160
    .line 161
    .line 162
    const v22, 0x414e6666    # 12.9f

    .line 163
    .line 164
    .line 165
    const v23, 0x408f0a3d    # 4.47f

    .line 166
    .line 167
    .line 168
    const v24, 0x416bae14    # 14.73f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/4 v4, 0x0

    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x40000000    # 2.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x40c00000    # 6.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, -0x40800000    # -1.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x41200000    # 10.0f

    .line 194
    .line 195
    const/high16 v26, 0x41600000    # 14.0f

    .line 196
    .line 197
    const/high16 v21, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v22, 0x417ca3d7    # 15.79f

    .line 200
    .line 201
    .line 202
    const v23, 0x40f947ae    # 7.79f

    .line 203
    .line 204
    .line 205
    const/high16 v24, 0x41600000    # 14.0f

    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const/16 v16, 0x3800

    .line 218
    .line 219
    const/16 v17, 0x0

    .line 220
    .line 221
    const/high16 v6, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v8, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    const/high16 v9, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/high16 v12, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const/4 v14, 0x0

    .line 232
    const/4 v15, 0x0

    .line 233
    const-string v4, ""

    .line 234
    .line 235
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 236
    .line 237
    .line 238
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 245
    .line 246
    .line 247
    move-result-wide v6

    .line 248
    const/4 v2, 0x0

    .line 249
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x41000000    # 8.0f

    .line 266
    .line 267
    const/high16 v6, 0x41980000    # 19.0f

    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, -0x40ae147b    # -0.82f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, -0x40533333    # -1.35f

    .line 279
    .line 280
    .line 281
    const v6, -0x3f93d70a    # -3.69f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, 0x416f5c29    # 14.96f

    .line 288
    .line 289
    .line 290
    const/high16 v26, 0x40400000    # 3.0f

    .line 291
    .line 292
    const v21, 0x41846666    # 16.55f

    .line 293
    .line 294
    .line 295
    const v22, 0x406147ae    # 3.52f

    .line 296
    .line 297
    .line 298
    const v23, 0x417ccccd    # 15.8f

    .line 299
    .line 300
    .line 301
    const/high16 v24, 0x40400000    # 3.0f

    .line 302
    .line 303
    move-object/from16 v20, v2

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x41300000    # 11.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x40000000    # 2.0f

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x407d70a4    # 3.96f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x3f8ccccd    # 1.1f

    .line 325
    .line 326
    .line 327
    const/high16 v6, 0x40400000    # 3.0f

    .line 328
    .line 329
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, 0x41266666    # 10.4f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x3eeb851f    # 0.46f

    .line 339
    .line 340
    .line 341
    const/high16 v6, 0x40000000    # 2.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v4, 0x41700000    # 15.0f

    .line 347
    .line 348
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v25, -0x4099999a    # -0.9f

    .line 352
    .line 353
    .line 354
    const/high16 v26, 0x40000000    # 2.0f

    .line 355
    .line 356
    const v21, -0x4123d70a    # -0.43f

    .line 357
    .line 358
    .line 359
    const v22, 0x3f147ae1    # 0.58f

    .line 360
    .line 361
    .line 362
    const/high16 v23, -0x40c00000    # -0.75f

    .line 363
    .line 364
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v4, -0x3fcd70a4    # -2.79f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v4, 0x3eeb851f    # 0.46f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x40151eb8    # 2.33f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v25, 0x4094cccd    # 4.65f

    .line 388
    .line 389
    .line 390
    const v26, 0x407f5c29    # 3.99f

    .line 391
    .line 392
    .line 393
    const v21, 0x3ee147ae    # 0.44f

    .line 394
    .line 395
    .line 396
    const v22, 0x400eb852    # 2.23f

    .line 397
    .line 398
    .line 399
    const v23, 0x4013d70a    # 2.31f

    .line 400
    .line 401
    .line 402
    const v24, 0x407851ec    # 3.88f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v25, 0x40a80000    # 5.25f

    .line 409
    .line 410
    const/high16 v26, -0x3f600000    # -5.0f

    .line 411
    .line 412
    const v21, 0x40333333    # 2.8f

    .line 413
    .line 414
    .line 415
    const v22, 0x3e051eb8    # 0.13f

    .line 416
    .line 417
    .line 418
    const/high16 v23, 0x40a80000    # 5.25f

    .line 419
    .line 420
    const v24, -0x3ff3d70a    # -2.19f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x41980000    # 19.0f

    .line 427
    .line 428
    const/high16 v26, 0x41000000    # 8.0f

    .line 429
    .line 430
    const/high16 v21, 0x41c00000    # 24.0f

    .line 431
    .line 432
    const v22, 0x41233333    # 10.2f

    .line 433
    .line 434
    .line 435
    const v23, 0x41ae6666    # 21.8f

    .line 436
    .line 437
    .line 438
    const/high16 v24, 0x41000000    # 8.0f

    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x41800000    # 16.0f

    .line 447
    .line 448
    const/high16 v6, 0x41980000    # 19.0f

    .line 449
    .line 450
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 454
    .line 455
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 456
    .line 457
    const v21, -0x4028f5c3    # -1.68f

    .line 458
    .line 459
    .line 460
    const/16 v22, 0x0

    .line 461
    .line 462
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 463
    .line 464
    const v24, -0x40570a3d    # -1.32f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v25, 0x3f866666    # 1.05f

    .line 471
    .line 472
    .line 473
    const v26, -0x3fee147b    # -2.28f

    .line 474
    .line 475
    .line 476
    const/16 v21, 0x0

    .line 477
    .line 478
    const v22, -0x4091eb85    # -0.93f

    .line 479
    .line 480
    .line 481
    const v23, 0x3ed1eb85    # 0.41f

    .line 482
    .line 483
    .line 484
    const v24, -0x40228f5c    # -1.73f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v4, 0x3f75c28f    # 0.96f

    .line 491
    .line 492
    .line 493
    const v6, 0x4028f5c3    # 2.64f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v4, 0x3ff0a3d7    # 1.88f

    .line 500
    .line 501
    .line 502
    const v6, -0x40d1eb85    # -0.68f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v4, -0x4087ae14    # -0.97f

    .line 509
    .line 510
    .line 511
    const v6, -0x3fd51eb8    # -2.67f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v25, 0x3db851ec    # 0.09f

    .line 518
    .line 519
    .line 520
    const v26, -0x43dc28f6    # -0.01f

    .line 521
    .line 522
    .line 523
    const v21, 0x3cf5c28f    # 0.03f

    .line 524
    .line 525
    .line 526
    const/16 v22, 0x0

    .line 527
    .line 528
    const v23, 0x3d75c28f    # 0.06f

    .line 529
    .line 530
    .line 531
    const v24, -0x43dc28f6    # -0.01f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v25, 0x40400000    # 3.0f

    .line 538
    .line 539
    const/high16 v26, 0x40400000    # 3.0f

    .line 540
    .line 541
    const v21, 0x3fd70a3d    # 1.68f

    .line 542
    .line 543
    .line 544
    const/high16 v23, 0x40400000    # 3.0f

    .line 545
    .line 546
    const v24, 0x3fa8f5c3    # 1.32f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v4, 0x41a570a4    # 20.68f

    .line 553
    .line 554
    .line 555
    const/high16 v6, 0x41800000    # 16.0f

    .line 556
    .line 557
    const/high16 v7, 0x41980000    # 19.0f

    .line 558
    .line 559
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v7, 0x0

    .line 572
    const-string v4, ""

    .line 573
    .line 574
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 575
    .line 576
    .line 577
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 582
    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 584
    .line 585
    .line 586
    move-result-wide v6

    .line 587
    const/4 v0, 0x0

    .line 588
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 592
    .line 593
    .line 594
    move-result v10

    .line 595
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41700000    # 15.0f

    .line 605
    .line 606
    const/high16 v2, 0x41200000    # 10.0f

    .line 607
    .line 608
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 612
    .line 613
    const/high16 v18, 0x40400000    # 3.0f

    .line 614
    .line 615
    const v13, -0x402b851f    # -1.66f

    .line 616
    .line 617
    .line 618
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 619
    .line 620
    const v16, 0x3fab851f    # 1.34f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x3fab851f    # 1.34f

    .line 627
    .line 628
    .line 629
    const/high16 v2, 0x40400000    # 3.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, -0x40547ae1    # -1.34f

    .line 635
    .line 636
    .line 637
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 638
    .line 639
    const/high16 v4, 0x40400000    # 3.0f

    .line 640
    .line 641
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x413a8f5c    # 11.66f

    .line 645
    .line 646
    .line 647
    const/high16 v2, 0x41700000    # 15.0f

    .line 648
    .line 649
    const/high16 v4, 0x41200000    # 10.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x41200000    # 10.0f

    .line 658
    .line 659
    const/high16 v2, 0x41980000    # 19.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v17, -0x40800000    # -1.0f

    .line 665
    .line 666
    const/high16 v18, -0x40800000    # -1.0f

    .line 667
    .line 668
    const v13, -0x40f33333    # -0.55f

    .line 669
    .line 670
    .line 671
    const/high16 v15, -0x40800000    # -1.0f

    .line 672
    .line 673
    const v16, -0x4119999a    # -0.45f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x3ee66666    # 0.45f

    .line 680
    .line 681
    .line 682
    const/high16 v2, -0x40800000    # -1.0f

    .line 683
    .line 684
    const/high16 v4, 0x3f800000    # 1.0f

    .line 685
    .line 686
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v2, 0x3f800000    # 1.0f

    .line 690
    .line 691
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x4128cccd    # 10.55f

    .line 695
    .line 696
    .line 697
    const/high16 v2, 0x41200000    # 10.0f

    .line 698
    .line 699
    const/high16 v4, 0x41980000    # 19.0f

    .line 700
    .line 701
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    const/16 v16, 0x3800

    .line 712
    .line 713
    const/16 v17, 0x0

    .line 714
    .line 715
    const/high16 v6, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/4 v7, 0x0

    .line 718
    const/high16 v12, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/4 v13, 0x0

    .line 721
    const/4 v15, 0x0

    .line 722
    const-string v4, ""

    .line 723
    .line 724
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    sput-object v0, Landroidx/compose/material/icons/twotone/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 733
    .line 734
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    return-object v0
.end method
