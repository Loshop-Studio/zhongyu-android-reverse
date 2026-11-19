.class public final Landroidx/compose/material/icons/filled/FaceRetouchingNaturalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFaceRetouchingNatural(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/FaceRetouchingNaturalKt;->_faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.FaceRetouchingNatural"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40600000    # -1.25f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40200000    # 2.5f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 88
    .line 89
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v4, 0x41a628f6    # 20.77f

    .line 160
    .line 161
    .line 162
    const v6, 0x410947ae    # 8.58f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x40947ae1    # -0.92f

    .line 169
    .line 170
    .line 171
    const v6, 0x4000a3d7    # 2.01f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x3e19999a    # 0.15f

    .line 178
    .line 179
    .line 180
    const v26, 0x3fb47ae1    # 1.41f

    .line 181
    .line 182
    .line 183
    const v21, 0x3db851ec    # 0.09f

    .line 184
    .line 185
    .line 186
    const v22, 0x3eeb851f    # 0.46f

    .line 187
    .line 188
    .line 189
    const v23, 0x3e19999a    # 0.15f

    .line 190
    .line 191
    .line 192
    const v24, 0x3f6e147b    # 0.93f

    .line 193
    .line 194
    .line 195
    move-object/from16 v20, v2

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, -0x3f000000    # -8.0f

    .line 201
    .line 202
    const/high16 v26, 0x41000000    # 8.0f

    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const v22, 0x408d1eb8    # 4.41f

    .line 207
    .line 208
    .line 209
    const v23, -0x3f9a3d71    # -3.59f

    .line 210
    .line 211
    .line 212
    const/high16 v24, 0x41000000    # 8.0f

    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, -0x3f9a3d71    # -3.59f

    .line 218
    .line 219
    .line 220
    const/high16 v6, -0x3f000000    # -8.0f

    .line 221
    .line 222
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/16 v25, 0x0

    .line 226
    .line 227
    const v26, -0x41f0a3d7    # -0.14f

    .line 228
    .line 229
    .line 230
    const v22, -0x42b33333    # -0.05f

    .line 231
    .line 232
    .line 233
    const v23, 0x3c23d70a    # 0.01f

    .line 234
    .line 235
    .line 236
    const v24, -0x42333333    # -0.1f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v25, 0x40b7ae14    # 5.74f

    .line 243
    .line 244
    .line 245
    const v26, -0x3f4e6666    # -5.55f

    .line 246
    .line 247
    .line 248
    const v21, 0x40266666    # 2.6f

    .line 249
    .line 250
    .line 251
    const v22, -0x40851eb8    # -0.98f

    .line 252
    .line 253
    .line 254
    const v23, 0x4096147b    # 4.69f

    .line 255
    .line 256
    .line 257
    const v24, -0x3fc0a3d7    # -2.99f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v25, 0x418c0000    # 17.5f

    .line 264
    .line 265
    const/high16 v26, 0x41200000    # 10.0f

    .line 266
    .line 267
    const v21, 0x413947ae    # 11.58f

    .line 268
    .line 269
    .line 270
    const v22, 0x4108f5c3    # 8.56f

    .line 271
    .line 272
    .line 273
    const v23, 0x4165eb85    # 14.37f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v25, 0x3faa3d71    # 1.33f

    .line 282
    .line 283
    .line 284
    const v26, -0x42333333    # -0.1f

    .line 285
    .line 286
    .line 287
    const v21, 0x3ee66666    # 0.45f

    .line 288
    .line 289
    .line 290
    const/16 v22, 0x0

    .line 291
    .line 292
    const v23, 0x3f63d70a    # 0.89f

    .line 293
    .line 294
    .line 295
    const v24, -0x42dc28f6    # -0.04f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, -0x40e66666    # -0.6f

    .line 302
    .line 303
    .line 304
    const v6, -0x40570a3d    # -1.32f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, -0x4008f5c3    # -1.93f

    .line 311
    .line 312
    .line 313
    const v6, -0x409eb852    # -0.88f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v4, -0x3fcd70a4    # -2.79f

    .line 323
    .line 324
    .line 325
    const v6, -0x405d70a4    # -1.27f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x40328f5c    # 2.79f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, -0x415c28f6    # -0.32f

    .line 338
    .line 339
    .line 340
    const v6, 0x3f35c28f    # 0.71f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x41400000    # 12.0f

    .line 347
    .line 348
    const/high16 v26, 0x40000000    # 2.0f

    .line 349
    .line 350
    const v21, 0x416deb85    # 14.87f

    .line 351
    .line 352
    .line 353
    const v22, 0x40151eb8    # 2.33f

    .line 354
    .line 355
    .line 356
    const v23, 0x4157851f    # 13.47f

    .line 357
    .line 358
    .line 359
    const/high16 v24, 0x40000000    # 2.0f

    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v25, 0x40000000    # 2.0f

    .line 365
    .line 366
    const/high16 v26, 0x41400000    # 12.0f

    .line 367
    .line 368
    const v21, 0x40cf5c29    # 6.48f

    .line 369
    .line 370
    .line 371
    const/high16 v22, 0x40000000    # 2.0f

    .line 372
    .line 373
    const/high16 v23, 0x40000000    # 2.0f

    .line 374
    .line 375
    const v24, 0x40cf5c29    # 6.48f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x408f5c29    # 4.48f

    .line 382
    .line 383
    .line 384
    const/high16 v6, 0x41200000    # 10.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, -0x3f70a3d7    # -4.48f

    .line 390
    .line 391
    .line 392
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 393
    .line 394
    const/high16 v7, 0x41200000    # 10.0f

    .line 395
    .line 396
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, -0x4099999a    # -0.9f

    .line 400
    .line 401
    .line 402
    const v26, -0x3f7bd70a    # -4.13f

    .line 403
    .line 404
    .line 405
    const/16 v21, 0x0

    .line 406
    .line 407
    const v22, -0x4043d70a    # -1.47f

    .line 408
    .line 409
    .line 410
    const v23, -0x41570a3d    # -0.33f

    .line 411
    .line 412
    .line 413
    const v24, -0x3fc851ec    # -2.87f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, -0x41570a3d    # -0.33f

    .line 420
    .line 421
    .line 422
    const v6, 0x3f35c28f    # 0.71f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v7, 0x0

    .line 438
    const-string v4, ""

    .line 439
    .line 440
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 441
    .line 442
    .line 443
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 448
    .line 449
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 450
    .line 451
    .line 452
    move-result-wide v6

    .line 453
    const/4 v2, 0x0

    .line 454
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 462
    .line 463
    .line 464
    move-result v11

    .line 465
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 468
    .line 469
    .line 470
    const/high16 v4, 0x41700000    # 15.0f

    .line 471
    .line 472
    const/high16 v6, 0x41500000    # 13.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/4 v4, 0x0

    .line 478
    const/high16 v6, -0x40600000    # -1.25f

    .line 479
    .line 480
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v26, 0x40200000    # 2.5f

    .line 484
    .line 485
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 486
    .line 487
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 488
    .line 489
    const/16 v23, 0x0

    .line 490
    .line 491
    const/16 v24, 0x1

    .line 492
    .line 493
    const/16 v25, 0x1

    .line 494
    .line 495
    move-object/from16 v20, v2

    .line 496
    .line 497
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 501
    .line 502
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/high16 v6, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/4 v7, 0x0

    .line 512
    const-string v4, ""

    .line 513
    .line 514
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 515
    .line 516
    .line 517
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 522
    .line 523
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 524
    .line 525
    .line 526
    move-result-wide v6

    .line 527
    const/4 v0, 0x0

    .line 528
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 536
    .line 537
    .line 538
    move-result v11

    .line 539
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 542
    .line 543
    .line 544
    const v2, 0x41a4cccd    # 20.6f

    .line 545
    .line 546
    .line 547
    const v4, 0x40b33333    # 5.6f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x41000000    # 8.0f

    .line 554
    .line 555
    const/high16 v4, 0x419c0000    # 19.5f

    .line 556
    .line 557
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v2, -0x3fe66666    # -2.4f

    .line 561
    .line 562
    .line 563
    const v4, -0x40733333    # -1.1f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v2, 0x41800000    # 16.0f

    .line 570
    .line 571
    const/high16 v4, 0x40900000    # 4.5f

    .line 572
    .line 573
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v2, 0x4019999a    # 2.4f

    .line 577
    .line 578
    .line 579
    const v4, -0x40733333    # -1.1f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v2, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/high16 v4, 0x419c0000    # 19.5f

    .line 588
    .line 589
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v2, 0x3f8ccccd    # 1.1f

    .line 593
    .line 594
    .line 595
    const v4, 0x4019999a    # 2.4f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v2, 0x41b80000    # 23.0f

    .line 602
    .line 603
    const/high16 v4, 0x40900000    # 4.5f

    .line 604
    .line 605
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const/high16 v6, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sput-object v0, Landroidx/compose/material/icons/filled/FaceRetouchingNaturalKt;->_faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method
