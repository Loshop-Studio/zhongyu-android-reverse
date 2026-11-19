.class public final Landroidx/compose/material/icons/rounded/BikeScooterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBikeScooter(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BikeScooter"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, 0x40400000    # 3.0f

    .line 119
    .line 120
    const/high16 v26, 0x40a00000    # 5.0f

    .line 121
    .line 122
    const v21, 0x405ccccd    # 3.45f

    .line 123
    .line 124
    .line 125
    const/high16 v22, 0x40800000    # 4.0f

    .line 126
    .line 127
    const/high16 v23, 0x40400000    # 3.0f

    .line 128
    .line 129
    const v24, 0x408e6666    # 4.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v26, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/16 v21, 0x0

    .line 144
    .line 145
    const v22, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const v23, 0x3ee66666    # 0.45f

    .line 149
    .line 150
    .line 151
    const/high16 v24, 0x3f800000    # 1.0f

    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x4037ae14    # 2.87f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x3fb5c28f    # 1.42f

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x40c80000    # 6.25f

    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, -0x43dc28f6    # -0.01f

    .line 171
    .line 172
    .line 173
    const/16 v26, 0x0

    .line 174
    .line 175
    const/16 v22, 0x0

    .line 176
    .line 177
    const v23, -0x43dc28f6    # -0.01f

    .line 178
    .line 179
    .line 180
    const/16 v24, 0x0

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v25, 0x4082e148    # 4.09f

    .line 186
    .line 187
    .line 188
    const/high16 v26, 0x41880000    # 17.0f

    .line 189
    .line 190
    const v21, 0x40c3d70a    # 6.12f

    .line 191
    .line 192
    .line 193
    const v22, 0x414e6666    # 12.9f

    .line 194
    .line 195
    .line 196
    const v23, 0x408f0a3d    # 4.47f

    .line 197
    .line 198
    .line 199
    const v24, 0x416bae14    # 14.73f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40c00000    # 6.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, -0x40800000    # -1.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, 0x41200000    # 10.0f

    .line 225
    .line 226
    const/high16 v26, 0x41600000    # 14.0f

    .line 227
    .line 228
    const/high16 v21, 0x40c00000    # 6.0f

    .line 229
    .line 230
    const v22, 0x417ca3d7    # 15.79f

    .line 231
    .line 232
    .line 233
    const v23, 0x40f947ae    # 7.79f

    .line 234
    .line 235
    .line 236
    const/high16 v24, 0x41600000    # 14.0f

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const/16 v16, 0x3800

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v8, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    const/high16 v9, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v12, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41960000    # 18.75f

    .line 297
    .line 298
    const/high16 v6, 0x41000000    # 8.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, -0x40f0a3d7    # -0.56f

    .line 304
    .line 305
    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, -0x40533333    # -1.35f

    .line 311
    .line 312
    .line 313
    const v6, -0x3f93d70a    # -3.69f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x416f5c29    # 14.96f

    .line 320
    .line 321
    .line 322
    const/high16 v26, 0x40400000    # 3.0f

    .line 323
    .line 324
    const v21, 0x41846666    # 16.55f

    .line 325
    .line 326
    .line 327
    const v22, 0x406147ae    # 3.52f

    .line 328
    .line 329
    .line 330
    const v23, 0x417ccccd    # 15.8f

    .line 331
    .line 332
    .line 333
    const/high16 v24, 0x40400000    # 3.0f

    .line 334
    .line 335
    move-object/from16 v20, v2

    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41400000    # 12.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, -0x40800000    # -1.0f

    .line 346
    .line 347
    const/high16 v26, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const v21, -0x40f33333    # -0.55f

    .line 350
    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const/high16 v23, -0x40800000    # -1.0f

    .line 355
    .line 356
    const v24, 0x3ee66666    # 0.45f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/4 v4, 0x0

    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/16 v21, 0x0

    .line 369
    .line 370
    const v22, 0x3f0ccccd    # 0.55f

    .line 371
    .line 372
    .line 373
    const v23, 0x3ee66666    # 0.45f

    .line 374
    .line 375
    .line 376
    const/high16 v24, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x403d70a4    # 2.96f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, 0x3f8ccccd    # 1.1f

    .line 388
    .line 389
    .line 390
    const/high16 v6, 0x40400000    # 3.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x41266666    # 10.4f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x3eeb851f    # 0.46f

    .line 402
    .line 403
    .line 404
    const/high16 v6, 0x40000000    # 2.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v4, 0x41700000    # 15.0f

    .line 410
    .line 411
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v25, -0x4099999a    # -0.9f

    .line 415
    .line 416
    .line 417
    const/high16 v26, 0x40000000    # 2.0f

    .line 418
    .line 419
    const v21, -0x4123d70a    # -0.43f

    .line 420
    .line 421
    .line 422
    const v22, 0x3f147ae1    # 0.58f

    .line 423
    .line 424
    .line 425
    const/high16 v23, -0x40c00000    # -0.75f

    .line 426
    .line 427
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, -0x3fcd70a4    # -2.79f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x3eeb851f    # 0.46f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x40151eb8    # 2.33f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v25, 0x4094cccd    # 4.65f

    .line 451
    .line 452
    .line 453
    const v26, 0x407f5c29    # 3.99f

    .line 454
    .line 455
    .line 456
    const v21, 0x3ee147ae    # 0.44f

    .line 457
    .line 458
    .line 459
    const v22, 0x400eb852    # 2.23f

    .line 460
    .line 461
    .line 462
    const v23, 0x4013d70a    # 2.31f

    .line 463
    .line 464
    .line 465
    const v24, 0x407851ec    # 3.88f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v25, 0x40a3d70a    # 5.12f

    .line 472
    .line 473
    .line 474
    const v26, -0x3f3ccccd    # -6.1f

    .line 475
    .line 476
    .line 477
    const v21, 0x404a3d71    # 3.16f

    .line 478
    .line 479
    .line 480
    const v22, 0x3e19999a    # 0.15f

    .line 481
    .line 482
    .line 483
    const v23, 0x40bc28f6    # 5.88f

    .line 484
    .line 485
    .line 486
    const v24, -0x3fcae148    # -2.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v25, 0x41960000    # 18.75f

    .line 493
    .line 494
    const/high16 v26, 0x41000000    # 8.0f

    .line 495
    .line 496
    const v21, 0x41bab852    # 23.34f

    .line 497
    .line 498
    .line 499
    const v22, 0x41191eb8    # 9.57f

    .line 500
    .line 501
    .line 502
    const v23, 0x41a90a3d    # 21.13f

    .line 503
    .line 504
    .line 505
    const/high16 v24, 0x41000000    # 8.0f

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v4, 0x41970a3d    # 18.88f

    .line 514
    .line 515
    .line 516
    const/high16 v6, 0x41800000    # 16.0f

    .line 517
    .line 518
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v25, -0x3fc7ae14    # -2.88f

    .line 522
    .line 523
    .line 524
    const v26, -0x3fc51eb8    # -2.92f

    .line 525
    .line 526
    .line 527
    const v21, -0x403ae148    # -1.54f

    .line 528
    .line 529
    .line 530
    const v22, -0x428a3d71    # -0.06f

    .line 531
    .line 532
    .line 533
    const v23, -0x3fca3d71    # -2.84f

    .line 534
    .line 535
    .line 536
    const v24, -0x4050a3d7    # -1.37f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v25, 0x3f866666    # 1.05f

    .line 543
    .line 544
    .line 545
    const v26, -0x3fe8f5c3    # -2.36f

    .line 546
    .line 547
    .line 548
    const v21, -0x435c28f6    # -0.02f

    .line 549
    .line 550
    .line 551
    const v22, -0x408a3d71    # -0.96f

    .line 552
    .line 553
    .line 554
    const v23, 0x3ec7ae14    # 0.39f

    .line 555
    .line 556
    .line 557
    const v24, -0x4019999a    # -1.8f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v4, 0x3f1eb852    # 0.62f

    .line 564
    .line 565
    .line 566
    const v6, 0x3fd9999a    # 1.7f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v25, 0x3fa3d70a    # 1.28f

    .line 573
    .line 574
    .line 575
    const v26, 0x3f19999a    # 0.6f

    .line 576
    .line 577
    .line 578
    const v21, 0x3e428f5c    # 0.19f

    .line 579
    .line 580
    .line 581
    const v22, 0x3f051eb8    # 0.52f

    .line 582
    .line 583
    .line 584
    const v23, 0x3f428f5c    # 0.76f

    .line 585
    .line 586
    .line 587
    const v24, 0x3f4a3d71    # 0.79f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/4 v4, 0x0

    .line 594
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v25, 0x3f19999a    # 0.6f

    .line 598
    .line 599
    .line 600
    const v26, -0x405c28f6    # -1.28f

    .line 601
    .line 602
    .line 603
    const v21, 0x3f051eb8    # 0.52f

    .line 604
    .line 605
    .line 606
    const v22, -0x41bd70a4    # -0.19f

    .line 607
    .line 608
    .line 609
    const v23, 0x3f4a3d71    # 0.79f

    .line 610
    .line 611
    .line 612
    const v24, -0x40bd70a4    # -0.76f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v4, -0x40deb852    # -0.63f

    .line 619
    .line 620
    .line 621
    const v6, -0x40228f5c    # -1.73f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v25, 0x3c23d70a    # 0.01f

    .line 628
    .line 629
    .line 630
    const v26, -0x43dc28f6    # -0.01f

    .line 631
    .line 632
    .line 633
    const/16 v21, 0x0

    .line 634
    .line 635
    const/16 v22, 0x0

    .line 636
    .line 637
    const/16 v23, 0x0

    .line 638
    .line 639
    const/16 v24, 0x0

    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v25, 0x41b00000    # 22.0f

    .line 645
    .line 646
    const/high16 v26, 0x41500000    # 13.0f

    .line 647
    .line 648
    const v21, 0x41a51eb8    # 20.64f

    .line 649
    .line 650
    .line 651
    const v22, 0x411f5c29    # 9.96f

    .line 652
    .line 653
    .line 654
    const/high16 v23, 0x41b00000    # 22.0f

    .line 655
    .line 656
    const v24, 0x4134a3d7    # 11.29f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v25, 0x41970a3d    # 18.88f

    .line 663
    .line 664
    .line 665
    const/high16 v26, 0x41800000    # 16.0f

    .line 666
    .line 667
    const/high16 v21, 0x41b00000    # 22.0f

    .line 668
    .line 669
    const v22, 0x416b851f    # 14.72f

    .line 670
    .line 671
    .line 672
    const v23, 0x41a4f5c3    # 20.62f

    .line 673
    .line 674
    .line 675
    const v24, 0x41807ae1    # 16.06f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    const/high16 v6, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/4 v7, 0x0

    .line 691
    const-string v4, ""

    .line 692
    .line 693
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 694
    .line 695
    .line 696
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 701
    .line 702
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 703
    .line 704
    .line 705
    move-result-wide v6

    .line 706
    const/4 v0, 0x0

    .line 707
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 711
    .line 712
    .line 713
    move-result v10

    .line 714
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 715
    .line 716
    .line 717
    move-result v11

    .line 718
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 721
    .line 722
    .line 723
    const/high16 v0, 0x41700000    # 15.0f

    .line 724
    .line 725
    const/high16 v2, 0x41200000    # 10.0f

    .line 726
    .line 727
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 731
    .line 732
    const/high16 v18, 0x40400000    # 3.0f

    .line 733
    .line 734
    const v13, -0x402b851f    # -1.66f

    .line 735
    .line 736
    .line 737
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 738
    .line 739
    const v16, 0x3fab851f    # 1.34f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x3fab851f    # 1.34f

    .line 746
    .line 747
    .line 748
    const/high16 v2, 0x40400000    # 3.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, -0x40547ae1    # -1.34f

    .line 754
    .line 755
    .line 756
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 757
    .line 758
    const/high16 v4, 0x40400000    # 3.0f

    .line 759
    .line 760
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x413a8f5c    # 11.66f

    .line 764
    .line 765
    .line 766
    const/high16 v2, 0x41700000    # 15.0f

    .line 767
    .line 768
    const/high16 v4, 0x41200000    # 10.0f

    .line 769
    .line 770
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v0, 0x41980000    # 19.0f

    .line 777
    .line 778
    const/high16 v2, 0x41200000    # 10.0f

    .line 779
    .line 780
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v17, -0x40800000    # -1.0f

    .line 784
    .line 785
    const/high16 v18, -0x40800000    # -1.0f

    .line 786
    .line 787
    const v13, -0x40f33333    # -0.55f

    .line 788
    .line 789
    .line 790
    const/high16 v15, -0x40800000    # -1.0f

    .line 791
    .line 792
    const v16, -0x4119999a    # -0.45f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x3ee66666    # 0.45f

    .line 799
    .line 800
    .line 801
    const/high16 v2, -0x40800000    # -1.0f

    .line 802
    .line 803
    const/high16 v4, 0x3f800000    # 1.0f

    .line 804
    .line 805
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const/high16 v2, 0x3f800000    # 1.0f

    .line 809
    .line 810
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x4128cccd    # 10.55f

    .line 814
    .line 815
    .line 816
    const/high16 v2, 0x41980000    # 19.0f

    .line 817
    .line 818
    const/high16 v4, 0x41200000    # 10.0f

    .line 819
    .line 820
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    const/16 v16, 0x3800

    .line 831
    .line 832
    const/16 v17, 0x0

    .line 833
    .line 834
    const/high16 v6, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    const/high16 v12, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v13, 0x0

    .line 840
    const/4 v15, 0x0

    .line 841
    const-string v4, ""

    .line 842
    .line 843
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    sput-object v0, Landroidx/compose/material/icons/rounded/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0
.end method
