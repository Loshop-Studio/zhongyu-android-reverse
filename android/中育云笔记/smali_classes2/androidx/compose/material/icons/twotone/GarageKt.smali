.class public final Landroidx/compose/material/icons/twotone/GarageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _garage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGarage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GarageKt;->_garage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Garage"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const v6, 0x413828f6    # 11.51f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41380000    # 11.5f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40e00000    # 7.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x3c23d70a    # 0.01f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x403f5c29    # 2.99f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41200000    # 10.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x413828f6    # 11.51f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v6, 0x41600000    # 14.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/high16 v26, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v21, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v24, -0x4119999a    # -0.45f

    .line 133
    .line 134
    .line 135
    move-object/from16 v20, v2

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const v6, 0x3ee66666    # 0.45f

    .line 143
    .line 144
    .line 145
    const/high16 v7, -0x40800000    # -1.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v26, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const v21, 0x3f0ccccd    # 0.55f

    .line 155
    .line 156
    .line 157
    const/high16 v23, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const v24, 0x3ee66666    # 0.45f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, 0x4118cccd    # 9.55f

    .line 166
    .line 167
    .line 168
    const/high16 v6, 0x41100000    # 9.0f

    .line 169
    .line 170
    const/high16 v7, 0x41600000    # 14.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41700000    # 15.0f

    .line 179
    .line 180
    const/high16 v6, 0x41600000    # 14.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, -0x40800000    # -1.0f

    .line 186
    .line 187
    const/high16 v26, -0x40800000    # -1.0f

    .line 188
    .line 189
    const v21, -0x40f33333    # -0.55f

    .line 190
    .line 191
    .line 192
    const/high16 v23, -0x40800000    # -1.0f

    .line 193
    .line 194
    const v24, -0x4119999a    # -0.45f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const v6, 0x3ee66666    # 0.45f

    .line 203
    .line 204
    .line 205
    const/high16 v7, -0x40800000    # -1.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v26, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const v21, 0x3f0ccccd    # 0.55f

    .line 215
    .line 216
    .line 217
    const/high16 v23, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const v24, 0x3ee66666    # 0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x4178cccd    # 15.55f

    .line 226
    .line 227
    .line 228
    const/high16 v6, 0x41700000    # 15.0f

    .line 229
    .line 230
    const/high16 v7, 0x41600000    # 14.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const/16 v16, 0x3800

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const v6, 0x3e99999a    # 0.3f

    .line 247
    .line 248
    .line 249
    const v8, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41a00000    # 20.0f

    .line 293
    .line 294
    const/high16 v6, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x41800000    # 16.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x40800000    # 4.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x41a00000    # 20.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x40a00000    # 5.0f

    .line 321
    .line 322
    const v6, 0x41330a3d    # 11.19f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v25, 0x40d1eb85    # 6.56f

    .line 329
    .line 330
    .line 331
    const/high16 v26, 0x40d00000    # 6.5f

    .line 332
    .line 333
    const v21, 0x40ba3d71    # 5.82f

    .line 334
    .line 335
    .line 336
    const v22, 0x410b851f    # 8.72f

    .line 337
    .line 338
    .line 339
    const v23, 0x40cae148    # 6.34f

    .line 340
    .line 341
    .line 342
    const v24, 0x40e51eb8    # 7.16f

    .line 343
    .line 344
    .line 345
    move-object/from16 v20, v2

    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x3e428f5c    # 0.19f

    .line 351
    .line 352
    .line 353
    const v26, -0x41333333    # -0.4f

    .line 354
    .line 355
    .line 356
    const v21, 0x3d4ccccd    # 0.05f

    .line 357
    .line 358
    .line 359
    const v22, -0x41dc28f6    # -0.16f

    .line 360
    .line 361
    .line 362
    const v23, 0x3df5c28f    # 0.12f

    .line 363
    .line 364
    .line 365
    const v24, -0x416b851f    # -0.29f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v25, 0x40d9999a    # 6.8f

    .line 372
    .line 373
    .line 374
    const v26, 0x40c147ae    # 6.04f

    .line 375
    .line 376
    .line 377
    const v21, 0x40d8a3d7    # 6.77f

    .line 378
    .line 379
    .line 380
    const v22, 0x40c28f5c    # 6.08f

    .line 381
    .line 382
    .line 383
    const v23, 0x40d8f5c3    # 6.78f

    .line 384
    .line 385
    .line 386
    const v24, 0x40c1eb85    # 6.06f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v25, 0x40f70a3d    # 7.72f

    .line 393
    .line 394
    .line 395
    const/high16 v26, 0x40b00000    # 5.5f

    .line 396
    .line 397
    const v21, 0x40e5c28f    # 7.18f

    .line 398
    .line 399
    .line 400
    const v22, 0x40b051ec    # 5.51f

    .line 401
    .line 402
    .line 403
    const v23, 0x40f70a3d    # 7.72f

    .line 404
    .line 405
    .line 406
    const/high16 v24, 0x40b00000    # 5.5f

    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, 0x4108f5c3    # 8.56f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v25, 0x3f6b851f    # 0.92f

    .line 418
    .line 419
    .line 420
    const v26, 0x3f07ae14    # 0.53f

    .line 421
    .line 422
    .line 423
    const/16 v21, 0x0

    .line 424
    .line 425
    const/16 v22, 0x0

    .line 426
    .line 427
    const v23, 0x3f0a3d71    # 0.54f

    .line 428
    .line 429
    .line 430
    const v24, 0x3c23d70a    # 0.01f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v25, 0x3d4ccccd    # 0.05f

    .line 437
    .line 438
    .line 439
    const v26, 0x3d8f5c29    # 0.07f

    .line 440
    .line 441
    .line 442
    const v21, 0x3ca3d70a    # 0.02f

    .line 443
    .line 444
    .line 445
    const v22, 0x3cf5c28f    # 0.03f

    .line 446
    .line 447
    .line 448
    const v23, 0x3cf5c28f    # 0.03f

    .line 449
    .line 450
    .line 451
    const v24, 0x3d4ccccd    # 0.05f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v25, 0x3e428f5c    # 0.19f

    .line 458
    .line 459
    .line 460
    const v26, 0x3ecccccd    # 0.4f

    .line 461
    .line 462
    .line 463
    const v21, 0x3d8f5c29    # 0.07f

    .line 464
    .line 465
    .line 466
    const v22, 0x3de147ae    # 0.11f

    .line 467
    .line 468
    .line 469
    const v23, 0x3e0f5c29    # 0.14f

    .line 470
    .line 471
    .line 472
    const v24, 0x3e75c28f    # 0.24f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v25, 0x3fc7ae14    # 1.56f

    .line 479
    .line 480
    .line 481
    const v26, 0x4096147b    # 4.69f

    .line 482
    .line 483
    .line 484
    const v21, 0x3e6147ae    # 0.22f

    .line 485
    .line 486
    .line 487
    const v22, 0x3f28f5c3    # 0.66f

    .line 488
    .line 489
    .line 490
    const v23, 0x3f3d70a4    # 0.74f

    .line 491
    .line 492
    .line 493
    const v24, 0x400eb852    # 2.23f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x40d00000    # 6.5f

    .line 500
    .line 501
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v25, -0x40b851ec    # -0.78f

    .line 505
    .line 506
    .line 507
    const v26, 0x3f4f5c29    # 0.81f

    .line 508
    .line 509
    .line 510
    const/16 v21, 0x0

    .line 511
    .line 512
    const v22, 0x3ee66666    # 0.45f

    .line 513
    .line 514
    .line 515
    const v23, -0x414ccccd    # -0.35f

    .line 516
    .line 517
    .line 518
    const v24, 0x3f4f5c29    # 0.81f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v4, -0x411eb852    # -0.44f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v26, -0x40b0a3d7    # -0.81f

    .line 531
    .line 532
    .line 533
    const v21, -0x411eb852    # -0.44f

    .line 534
    .line 535
    .line 536
    const/16 v22, 0x0

    .line 537
    .line 538
    const v23, -0x40b851ec    # -0.78f

    .line 539
    .line 540
    .line 541
    const v24, -0x4147ae14    # -0.36f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v4, 0x41840000    # 16.5f

    .line 548
    .line 549
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v4, 0x40e00000    # 7.0f

    .line 553
    .line 554
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v4, 0x3f9851ec    # 1.19f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v26, 0x3f4f5c29    # 0.81f

    .line 564
    .line 565
    .line 566
    const/16 v21, 0x0

    .line 567
    .line 568
    const v22, 0x3ee66666    # 0.45f

    .line 569
    .line 570
    .line 571
    const v23, -0x414ccccd    # -0.35f

    .line 572
    .line 573
    .line 574
    const v24, 0x3f4f5c29    # 0.81f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v4, 0x40b8f5c3    # 5.78f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v25, 0x40a00000    # 5.0f

    .line 587
    .line 588
    const v26, 0x418d851f    # 17.69f

    .line 589
    .line 590
    .line 591
    const v21, 0x40ab3333    # 5.35f

    .line 592
    .line 593
    .line 594
    const/high16 v22, 0x41940000    # 18.5f

    .line 595
    .line 596
    const/high16 v23, 0x40a00000    # 5.0f

    .line 597
    .line 598
    const v24, 0x41911eb8    # 18.14f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v4, 0x41330a3d    # 11.19f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const v6, 0x3e99999a    # 0.3f

    .line 618
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
    const/high16 v4, 0x40000000    # 2.0f

    .line 654
    .line 655
    const/high16 v6, 0x41a00000    # 20.0f

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
    const/high16 v25, 0x40000000    # 2.0f

    .line 666
    .line 667
    const/high16 v26, 0x40800000    # 4.0f

    .line 668
    .line 669
    const v21, 0x4039999a    # 2.9f

    .line 670
    .line 671
    .line 672
    const/high16 v22, 0x40000000    # 2.0f

    .line 673
    .line 674
    const/high16 v23, 0x40000000    # 2.0f

    .line 675
    .line 676
    const v24, 0x4039999a    # 2.9f

    .line 677
    .line 678
    .line 679
    move-object/from16 v20, v2

    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x41800000    # 16.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v26, 0x40000000    # 2.0f

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
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v26, -0x40000000    # -2.0f

    .line 708
    .line 709
    const v21, 0x3f8ccccd    # 1.1f

    .line 710
    .line 711
    .line 712
    const/16 v22, 0x0

    .line 713
    .line 714
    const/high16 v23, 0x40000000    # 2.0f

    .line 715
    .line 716
    const v24, -0x4099999a    # -0.9f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v4, 0x40800000    # 4.0f

    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v25, 0x41a00000    # 20.0f

    .line 728
    .line 729
    const/high16 v26, 0x40000000    # 2.0f

    .line 730
    .line 731
    const/high16 v21, 0x41b00000    # 22.0f

    .line 732
    .line 733
    const v22, 0x4039999a    # 2.9f

    .line 734
    .line 735
    .line 736
    const v23, 0x41a8cccd    # 21.1f

    .line 737
    .line 738
    .line 739
    const/high16 v24, 0x40000000    # 2.0f

    .line 740
    .line 741
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v4, 0x41a00000    # 20.0f

    .line 748
    .line 749
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v4, 0x40800000    # 4.0f

    .line 753
    .line 754
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v4, 0x41800000    # 16.0f

    .line 761
    .line 762
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v4, 0x41a00000    # 20.0f

    .line 766
    .line 767
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    const/high16 v6, 0x3f800000    # 1.0f

    .line 778
    .line 779
    const/high16 v8, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/4 v7, 0x0

    .line 782
    const-string v4, ""

    .line 783
    .line 784
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 785
    .line 786
    .line 787
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 792
    .line 793
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 794
    .line 795
    .line 796
    move-result-wide v6

    .line 797
    const/4 v2, 0x0

    .line 798
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 806
    .line 807
    .line 808
    move-result v11

    .line 809
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 812
    .line 813
    .line 814
    const/high16 v4, 0x41500000    # 13.0f

    .line 815
    .line 816
    const/high16 v6, 0x41100000    # 9.0f

    .line 817
    .line 818
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/4 v4, 0x0

    .line 822
    const/high16 v6, -0x40800000    # -1.0f

    .line 823
    .line 824
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/16 v27, 0x0

    .line 828
    .line 829
    const/high16 v21, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/high16 v22, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/16 v23, 0x0

    .line 834
    .line 835
    const/16 v24, 0x1

    .line 836
    .line 837
    const/16 v25, 0x1

    .line 838
    .line 839
    move-object/from16 v20, v2

    .line 840
    .line 841
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const/high16 v26, -0x40000000    # -2.0f

    .line 845
    .line 846
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v7, 0x0

    .line 856
    const-string v4, ""

    .line 857
    .line 858
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 859
    .line 860
    .line 861
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 866
    .line 867
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 868
    .line 869
    .line 870
    move-result-wide v6

    .line 871
    const/4 v2, 0x0

    .line 872
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 876
    .line 877
    .line 878
    move-result v10

    .line 879
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 880
    .line 881
    .line 882
    move-result v11

    .line 883
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 886
    .line 887
    .line 888
    const/high16 v4, 0x41500000    # 13.0f

    .line 889
    .line 890
    const/high16 v6, 0x41700000    # 15.0f

    .line 891
    .line 892
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/4 v4, 0x0

    .line 896
    const/high16 v6, -0x40800000    # -1.0f

    .line 897
    .line 898
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v26, 0x40000000    # 2.0f

    .line 902
    .line 903
    move-object/from16 v20, v2

    .line 904
    .line 905
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const/high16 v26, -0x40000000    # -2.0f

    .line 909
    .line 910
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    const/high16 v6, 0x3f800000    # 1.0f

    .line 918
    .line 919
    const/4 v7, 0x0

    .line 920
    const-string v4, ""

    .line 921
    .line 922
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 923
    .line 924
    .line 925
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 930
    .line 931
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 932
    .line 933
    .line 934
    move-result-wide v6

    .line 935
    const/4 v0, 0x0

    .line 936
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 937
    .line 938
    .line 939
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 940
    .line 941
    .line 942
    move-result v10

    .line 943
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 944
    .line 945
    .line 946
    move-result v11

    .line 947
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 950
    .line 951
    .line 952
    const/high16 v0, 0x41940000    # 18.5f

    .line 953
    .line 954
    const v2, 0x40b8f5c3    # 5.78f

    .line 955
    .line 956
    .line 957
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v0, 0x3ee147ae    # 0.44f

    .line 961
    .line 962
    .line 963
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const/high16 v17, 0x40e00000    # 7.0f

    .line 967
    .line 968
    const v18, 0x418d851f    # 17.69f

    .line 969
    .line 970
    .line 971
    const v13, 0x40d4cccd    # 6.65f

    .line 972
    .line 973
    .line 974
    const/high16 v14, 0x41940000    # 18.5f

    .line 975
    .line 976
    const/high16 v15, 0x40e00000    # 7.0f

    .line 977
    .line 978
    const v16, 0x41911eb8    # 18.14f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v0, 0x41840000    # 16.5f

    .line 985
    .line 986
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v0, 0x41200000    # 10.0f

    .line 990
    .line 991
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v0, 0x3f9851ec    # 1.19f

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v17, 0x3f47ae14    # 0.78f

    .line 1001
    .line 1002
    .line 1003
    const v18, 0x3f4f5c29    # 0.81f

    .line 1004
    .line 1005
    .line 1006
    const/4 v13, 0x0

    .line 1007
    const v14, 0x3ee66666    # 0.45f

    .line 1008
    .line 1009
    .line 1010
    const v15, 0x3eae147b    # 0.34f

    .line 1011
    .line 1012
    .line 1013
    const v16, 0x3f4f5c29    # 0.81f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const v0, 0x3ee147ae    # 0.44f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v18, -0x40b0a3d7    # -0.81f

    .line 1026
    .line 1027
    .line 1028
    const v13, 0x3edc28f6    # 0.43f

    .line 1029
    .line 1030
    .line 1031
    const/4 v14, 0x0

    .line 1032
    const v15, 0x3f47ae14    # 0.78f

    .line 1033
    .line 1034
    .line 1035
    const v16, -0x4147ae14    # -0.36f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const/high16 v0, -0x3f300000    # -6.5f

    .line 1042
    .line 1043
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const v17, -0x403851ec    # -1.56f

    .line 1047
    .line 1048
    .line 1049
    const v18, -0x3f69eb85    # -4.69f

    .line 1050
    .line 1051
    .line 1052
    const v13, -0x40ae147b    # -0.82f

    .line 1053
    .line 1054
    .line 1055
    const v14, -0x3fe28f5c    # -2.46f

    .line 1056
    .line 1057
    .line 1058
    const v15, -0x40547ae1    # -1.34f

    .line 1059
    .line 1060
    .line 1061
    const v16, -0x3f7f0a3d    # -4.03f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v17, -0x41bd70a4    # -0.19f

    .line 1068
    .line 1069
    .line 1070
    const v18, -0x41333333    # -0.4f

    .line 1071
    .line 1072
    .line 1073
    const v13, -0x42b33333    # -0.05f

    .line 1074
    .line 1075
    .line 1076
    const v14, -0x41dc28f6    # -0.16f

    .line 1077
    .line 1078
    .line 1079
    const v15, -0x420a3d71    # -0.12f

    .line 1080
    .line 1081
    .line 1082
    const v16, -0x416b851f    # -0.29f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v17, -0x42b33333    # -0.05f

    .line 1089
    .line 1090
    .line 1091
    const v18, -0x4270a3d7    # -0.07f

    .line 1092
    .line 1093
    .line 1094
    const v13, -0x435c28f6    # -0.02f

    .line 1095
    .line 1096
    .line 1097
    const v14, -0x435c28f6    # -0.02f

    .line 1098
    .line 1099
    .line 1100
    const v15, -0x430a3d71    # -0.03f

    .line 1101
    .line 1102
    .line 1103
    const v16, -0x42dc28f6    # -0.04f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const v17, -0x40947ae1    # -0.92f

    .line 1110
    .line 1111
    .line 1112
    const v18, -0x40f851ec    # -0.53f

    .line 1113
    .line 1114
    .line 1115
    const v13, -0x413d70a4    # -0.38f

    .line 1116
    .line 1117
    .line 1118
    const v14, -0x40fae148    # -0.52f

    .line 1119
    .line 1120
    .line 1121
    const v15, -0x40947ae1    # -0.92f

    .line 1122
    .line 1123
    .line 1124
    const v16, -0x40f851ec    # -0.53f

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const v0, 0x40f70a3d    # 7.72f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v18, 0x3f0a3d71    # 0.54f

    .line 1137
    .line 1138
    .line 1139
    const/4 v13, 0x0

    .line 1140
    const/4 v14, 0x0

    .line 1141
    const v15, -0x40f5c28f    # -0.54f

    .line 1142
    .line 1143
    .line 1144
    const v16, 0x3c23d70a    # 0.01f

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const/high16 v17, 0x40d80000    # 6.75f

    .line 1151
    .line 1152
    const v18, 0x40c33333    # 6.1f

    .line 1153
    .line 1154
    .line 1155
    const v13, 0x40d8f5c3    # 6.78f

    .line 1156
    .line 1157
    .line 1158
    const v14, 0x40c1eb85    # 6.06f

    .line 1159
    .line 1160
    .line 1161
    const v15, 0x40d8a3d7    # 6.77f

    .line 1162
    .line 1163
    .line 1164
    const v16, 0x40c28f5c    # 6.08f

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1168
    .line 1169
    .line 1170
    const v17, 0x40d1eb85    # 6.56f

    .line 1171
    .line 1172
    .line 1173
    const/high16 v18, 0x40d00000    # 6.5f

    .line 1174
    .line 1175
    const v13, 0x40d5c28f    # 6.68f

    .line 1176
    .line 1177
    .line 1178
    const v14, 0x40c6b852    # 6.21f

    .line 1179
    .line 1180
    .line 1181
    const v15, 0x40d3851f    # 6.61f

    .line 1182
    .line 1183
    .line 1184
    const v16, 0x40cae148    # 6.34f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1191
    .line 1192
    const v18, 0x41330a3d    # 11.19f

    .line 1193
    .line 1194
    .line 1195
    const v13, 0x40cae148    # 6.34f

    .line 1196
    .line 1197
    .line 1198
    const v14, 0x40e51eb8    # 7.16f

    .line 1199
    .line 1200
    .line 1201
    const v15, 0x40ba3d71    # 5.82f

    .line 1202
    .line 1203
    .line 1204
    const v16, 0x410b851f    # 8.72f

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    const/high16 v0, 0x40d00000    # 6.5f

    .line 1211
    .line 1212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1213
    .line 1214
    .line 1215
    const v17, 0x40b8f5c3    # 5.78f

    .line 1216
    .line 1217
    .line 1218
    const/high16 v18, 0x41940000    # 18.5f

    .line 1219
    .line 1220
    const/high16 v13, 0x40a00000    # 5.0f

    .line 1221
    .line 1222
    const v14, 0x41911eb8    # 18.14f

    .line 1223
    .line 1224
    .line 1225
    const v15, 0x40ab3333    # 5.35f

    .line 1226
    .line 1227
    .line 1228
    const/high16 v16, 0x41940000    # 18.5f

    .line 1229
    .line 1230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    const v0, 0x410547ae    # 8.33f

    .line 1237
    .line 1238
    .line 1239
    const/high16 v2, 0x40f00000    # 7.5f

    .line 1240
    .line 1241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1242
    .line 1243
    .line 1244
    const v0, 0x40eae148    # 7.34f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v0, 0x3e6b851f    # 0.23f

    .line 1251
    .line 1252
    .line 1253
    const v2, 0x3f30a3d7    # 0.69f

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1257
    .line 1258
    .line 1259
    const v0, 0x3edc28f6    # 0.43f

    .line 1260
    .line 1261
    .line 1262
    const v2, 0x3fa7ae14    # 1.31f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    const v0, 0x40f570a4    # 7.67f

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1272
    .line 1273
    .line 1274
    const v0, 0x410547ae    # 8.33f

    .line 1275
    .line 1276
    .line 1277
    const/high16 v2, 0x40f00000    # 7.5f

    .line 1278
    .line 1279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1286
    .line 1287
    const v2, 0x413828f6    # 11.51f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const/high16 v0, 0x41380000    # 11.5f

    .line 1294
    .line 1295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    const/high16 v0, 0x41200000    # 10.0f

    .line 1299
    .line 1300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v0, 0x3c23d70a    # 0.01f

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const v0, 0x403f5c29    # 2.99f

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1313
    .line 1314
    .line 1315
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1316
    .line 1317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    const v0, 0x413828f6    # 11.51f

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    const/16 v16, 0x3800

    .line 1334
    .line 1335
    const/16 v17, 0x0

    .line 1336
    .line 1337
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1338
    .line 1339
    const/4 v7, 0x0

    .line 1340
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1341
    .line 1342
    const/4 v13, 0x0

    .line 1343
    const/4 v14, 0x0

    .line 1344
    const/4 v15, 0x0

    .line 1345
    const-string v4, ""

    .line 1346
    .line 1347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    sput-object v0, Landroidx/compose/material/icons/twotone/GarageKt;->_garage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1356
    .line 1357
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1358
    .line 1359
    .line 1360
    return-object v0
.end method
