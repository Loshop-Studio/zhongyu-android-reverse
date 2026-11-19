.class public final Landroidx/compose/material/icons/twotone/NoiseAwareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noiseAware:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoiseAware(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoiseAwareKt;->_noiseAware:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoiseAware"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, 0x3f0ccccd    # 0.55f

    .line 89
    .line 90
    .line 91
    const v23, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v24, 0x3f800000    # 1.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, -0x408ccccd    # -0.95f

    .line 102
    .line 103
    .line 104
    const v26, -0x40d1eb85    # -0.68f

    .line 105
    .line 106
    .line 107
    const v21, -0x4123d70a    # -0.43f

    .line 108
    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const v23, -0x40b0a3d7    # -0.81f

    .line 113
    .line 114
    .line 115
    const v24, -0x4175c28f    # -0.27f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, -0x4091eb85    # -0.93f

    .line 122
    .line 123
    .line 124
    const v26, -0x4031eb85    # -1.61f

    .line 125
    .line 126
    .line 127
    const v21, -0x41e66666    # -0.15f

    .line 128
    .line 129
    .line 130
    const v22, -0x411eb852    # -0.44f

    .line 131
    .line 132
    .line 133
    const v23, -0x41333333    # -0.4f

    .line 134
    .line 135
    .line 136
    const v24, -0x4075c28f    # -1.08f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x4051eb85    # -1.36f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x41100000    # 9.0f

    .line 149
    .line 150
    const/high16 v26, 0x41280000    # 10.5f

    .line 151
    .line 152
    const v21, 0x41147ae1    # 9.28f

    .line 153
    .line 154
    .line 155
    const v22, 0x413deb85    # 11.87f

    .line 156
    .line 157
    .line 158
    const/high16 v23, 0x41100000    # 9.0f

    .line 159
    .line 160
    const v24, 0x41330a3d    # 11.19f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41380000    # 11.5f

    .line 167
    .line 168
    const/high16 v26, 0x41000000    # 8.0f

    .line 169
    .line 170
    const/high16 v21, 0x41100000    # 9.0f

    .line 171
    .line 172
    const v22, 0x4111eb85    # 9.12f

    .line 173
    .line 174
    .line 175
    const v23, 0x4121eb85    # 10.12f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x41000000    # 8.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, 0x401ccccd    # 2.45f

    .line 184
    .line 185
    .line 186
    const/high16 v26, 0x40000000    # 2.0f

    .line 187
    .line 188
    const v21, 0x3f9ae148    # 1.21f

    .line 189
    .line 190
    .line 191
    const/16 v22, 0x0

    .line 192
    .line 193
    const v23, 0x400e147b    # 2.22f

    .line 194
    .line 195
    .line 196
    const v24, 0x3f5c28f6    # 0.86f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x400147ae    # 2.02f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, -0x3f70f5c3    # -4.47f

    .line 209
    .line 210
    .line 211
    const/high16 v26, -0x3f800000    # -4.0f

    .line 212
    .line 213
    const/high16 v21, -0x41800000    # -0.25f

    .line 214
    .line 215
    const/high16 v22, -0x3ff00000    # -2.25f

    .line 216
    .line 217
    const v23, -0x3ff5c28f    # -2.16f

    .line 218
    .line 219
    .line 220
    const/high16 v24, -0x3f800000    # -4.0f

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v25, 0x40e00000    # 7.0f

    .line 226
    .line 227
    const/high16 v26, 0x41280000    # 10.5f

    .line 228
    .line 229
    const v21, 0x411051ec    # 9.02f

    .line 230
    .line 231
    .line 232
    const/high16 v22, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const/high16 v23, 0x40e00000    # 7.0f

    .line 235
    .line 236
    const v24, 0x410051ec    # 8.02f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v25, 0x3faccccd    # 1.35f

    .line 243
    .line 244
    .line 245
    const v26, 0x405147ae    # 3.27f

    .line 246
    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const v22, 0x3f9c28f6    # 1.22f

    .line 251
    .line 252
    .line 253
    const v23, 0x3efae148    # 0.49f

    .line 254
    .line 255
    .line 256
    const v24, 0x401a3d71    # 2.41f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, 0x3fae147b    # 1.36f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, 0x3ee147ae    # 0.44f

    .line 269
    .line 270
    .line 271
    const v26, 0x3f51eb85    # 0.82f

    .line 272
    .line 273
    .line 274
    const v21, 0x3e2e147b    # 0.17f

    .line 275
    .line 276
    .line 277
    const v22, 0x3e2e147b    # 0.17f

    .line 278
    .line 279
    .line 280
    const v23, 0x3e9eb852    # 0.31f

    .line 281
    .line 282
    .line 283
    const v24, 0x3ee147ae    # 0.44f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x41500000    # 13.0f

    .line 290
    .line 291
    const/high16 v26, 0x41900000    # 18.0f

    .line 292
    .line 293
    const v21, 0x4128f5c3    # 10.56f

    .line 294
    .line 295
    .line 296
    const v22, 0x41895c29    # 17.17f

    .line 297
    .line 298
    .line 299
    const v23, 0x413b5c29    # 11.71f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x41900000    # 18.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x41800000    # 16.0f

    .line 308
    .line 309
    const/high16 v26, 0x41700000    # 15.0f

    .line 310
    .line 311
    const v21, 0x416a6666    # 14.65f

    .line 312
    .line 313
    .line 314
    const/high16 v22, 0x41900000    # 18.0f

    .line 315
    .line 316
    const/high16 v23, 0x41800000    # 16.0f

    .line 317
    .line 318
    const v24, 0x41853333    # 16.65f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    sget-object v2, Lqc/q;->a:Lqc/q;

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const/16 v16, 0x3800

    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const/high16 v6, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/high16 v8, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v7, 0x0

    .line 342
    const/high16 v9, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/high16 v12, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const/4 v14, 0x0

    .line 348
    const/4 v15, 0x0

    .line 349
    const-string v4, ""

    .line 350
    .line 351
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 352
    .line 353
    .line 354
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 359
    .line 360
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 361
    .line 362
    .line 363
    move-result-wide v6

    .line 364
    const/4 v2, 0x0

    .line 365
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41580000    # 13.5f

    .line 382
    .line 383
    const/high16 v6, 0x41480000    # 12.5f

    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, -0x40400000    # -1.5f

    .line 389
    .line 390
    const/4 v6, 0x0

    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v26, 0x40400000    # 3.0f

    .line 395
    .line 396
    const/16 v27, 0x0

    .line 397
    .line 398
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 399
    .line 400
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 401
    .line 402
    const/16 v23, 0x0

    .line 403
    .line 404
    const/16 v24, 0x1

    .line 405
    .line 406
    const/16 v25, 0x1

    .line 407
    .line 408
    move-object/from16 v20, v2

    .line 409
    .line 410
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const/high16 v6, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    const-string v4, ""

    .line 426
    .line 427
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 428
    .line 429
    .line 430
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 435
    .line 436
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v6

    .line 440
    const/4 v2, 0x0

    .line 441
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    const v4, 0x40d28f5c    # 6.58f

    .line 458
    .line 459
    .line 460
    const v6, 0x40666666    # 3.6f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v4, 0x3fa147ae    # 1.26f

    .line 467
    .line 468
    .line 469
    const v6, 0x3fca3d71    # 1.58f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v25, 0x3f9eb852    # 1.24f

    .line 476
    .line 477
    .line 478
    const v26, -0x40370a3d    # -1.57f

    .line 479
    .line 480
    .line 481
    const v21, 0x3eb33333    # 0.35f

    .line 482
    .line 483
    .line 484
    const v22, -0x40ee147b    # -0.57f

    .line 485
    .line 486
    .line 487
    const v23, 0x3f451eb8    # 0.77f

    .line 488
    .line 489
    .line 490
    const v24, -0x40733333    # -1.1f

    .line 491
    .line 492
    .line 493
    move-object/from16 v20, v2

    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v4, 0x409b3333    # 4.85f

    .line 499
    .line 500
    .line 501
    const v6, 0x40a0a3d7    # 5.02f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v25, 0x40666666    # 3.6f

    .line 508
    .line 509
    .line 510
    const v26, 0x40d28f5c    # 6.58f

    .line 511
    .line 512
    .line 513
    const v21, 0x408c28f6    # 4.38f

    .line 514
    .line 515
    .line 516
    const v22, 0x40afae14    # 5.49f

    .line 517
    .line 518
    .line 519
    const v23, 0x407e147b    # 3.97f

    .line 520
    .line 521
    .line 522
    const v24, 0x40c0a3d7    # 6.02f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 548
    .line 549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 550
    .line 551
    .line 552
    move-result-wide v6

    .line 553
    const/4 v2, 0x0

    .line 554
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 558
    .line 559
    .line 560
    move-result v10

    .line 561
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 568
    .line 569
    .line 570
    const v4, 0x41175c29    # 9.46f

    .line 571
    .line 572
    .line 573
    const v6, 0x408d70a4    # 4.42f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v4, 0x410970a4    # 8.59f

    .line 580
    .line 581
    .line 582
    const v6, 0x40270a3d    # 2.61f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v25, -0x4019999a    # -1.8f

    .line 589
    .line 590
    .line 591
    const v26, 0x3f5eb852    # 0.87f

    .line 592
    .line 593
    .line 594
    const v21, -0x40deb852    # -0.63f

    .line 595
    .line 596
    .line 597
    const v22, 0x3e6b851f    # 0.23f

    .line 598
    .line 599
    .line 600
    const v23, -0x406147ae    # -1.24f

    .line 601
    .line 602
    .line 603
    const v24, 0x3f051eb8    # 0.52f

    .line 604
    .line 605
    .line 606
    move-object/from16 v20, v2

    .line 607
    .line 608
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v4, 0x3fe7ae14    # 1.81f

    .line 612
    .line 613
    .line 614
    const v6, 0x3f5eb852    # 0.87f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v25, 0x41175c29    # 9.46f

    .line 621
    .line 622
    .line 623
    const v26, 0x408d70a4    # 4.42f

    .line 624
    .line 625
    .line 626
    const v21, 0x4103851f    # 8.22f

    .line 627
    .line 628
    .line 629
    const v22, 0x409dc28f    # 4.93f

    .line 630
    .line 631
    .line 632
    const v23, 0x410d1eb8    # 8.82f

    .line 633
    .line 634
    .line 635
    const v24, 0x40947ae1    # 4.64f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    const/high16 v6, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const-string v4, ""

    .line 652
    .line 653
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 654
    .line 655
    .line 656
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 661
    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 663
    .line 664
    .line 665
    move-result-wide v6

    .line 666
    const/4 v2, 0x0

    .line 667
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 675
    .line 676
    .line 677
    move-result v11

    .line 678
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    const v4, 0x408fae14    # 4.49f

    .line 684
    .line 685
    .line 686
    const v6, 0x411428f6    # 9.26f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v4, 0x4021eb85    # 2.53f

    .line 693
    .line 694
    .line 695
    const v6, 0x410cf5c3    # 8.81f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v25, -0x411eb852    # -0.44f

    .line 702
    .line 703
    .line 704
    const v26, 0x3ff9999a    # 1.95f

    .line 705
    .line 706
    .line 707
    const v21, -0x41a8f5c3    # -0.21f

    .line 708
    .line 709
    .line 710
    const v22, 0x3f2147ae    # 0.63f

    .line 711
    .line 712
    .line 713
    const v23, -0x4147ae14    # -0.36f

    .line 714
    .line 715
    .line 716
    const v24, 0x3fa3d70a    # 1.28f

    .line 717
    .line 718
    .line 719
    move-object/from16 v20, v2

    .line 720
    .line 721
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v4, 0x3ffae148    # 1.96f

    .line 725
    .line 726
    .line 727
    const v6, 0x3ee66666    # 0.45f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v25, 0x408fae14    # 4.49f

    .line 734
    .line 735
    .line 736
    const v26, 0x411428f6    # 9.26f

    .line 737
    .line 738
    .line 739
    const v21, 0x4083851f    # 4.11f

    .line 740
    .line 741
    .line 742
    const v22, 0x41287ae1    # 10.53f

    .line 743
    .line 744
    .line 745
    const v23, 0x4088a3d7    # 4.27f

    .line 746
    .line 747
    .line 748
    const v24, 0x411e147b    # 9.88f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/high16 v6, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v7, 0x0

    .line 764
    const-string v4, ""

    .line 765
    .line 766
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 767
    .line 768
    .line 769
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 774
    .line 775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 776
    .line 777
    .line 778
    move-result-wide v6

    .line 779
    const/4 v2, 0x0

    .line 780
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 784
    .line 785
    .line 786
    move-result v10

    .line 787
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 788
    .line 789
    .line 790
    move-result v11

    .line 791
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 794
    .line 795
    .line 796
    const v4, 0x41a33333    # 20.4f

    .line 797
    .line 798
    .line 799
    const v6, 0x40d28f5c    # 6.58f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v25, -0x40600000    # -1.25f

    .line 806
    .line 807
    const v26, -0x403851ec    # -1.56f

    .line 808
    .line 809
    .line 810
    const v21, -0x4147ae14    # -0.36f

    .line 811
    .line 812
    .line 813
    const v22, -0x40f0a3d7    # -0.56f

    .line 814
    .line 815
    .line 816
    const v23, -0x40b851ec    # -0.78f

    .line 817
    .line 818
    .line 819
    const v24, -0x40747ae1    # -1.09f

    .line 820
    .line 821
    .line 822
    move-object/from16 v20, v2

    .line 823
    .line 824
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v4, -0x4035c28f    # -1.58f

    .line 828
    .line 829
    .line 830
    const v6, 0x3fa147ae    # 1.26f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v25, 0x3f9eb852    # 1.24f

    .line 837
    .line 838
    .line 839
    const v26, 0x3fc8f5c3    # 1.57f

    .line 840
    .line 841
    .line 842
    const v21, 0x3ef5c28f    # 0.48f

    .line 843
    .line 844
    .line 845
    const v22, 0x3ef0a3d7    # 0.47f

    .line 846
    .line 847
    .line 848
    const v23, 0x3f63d70a    # 0.89f

    .line 849
    .line 850
    .line 851
    const v24, 0x3f7d70a4    # 0.99f

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v4, 0x41a33333    # 20.4f

    .line 858
    .line 859
    .line 860
    const v6, 0x40d28f5c    # 6.58f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    const/high16 v6, 0x3f800000    # 1.0f

    .line 874
    .line 875
    const/4 v7, 0x0

    .line 876
    const-string v4, ""

    .line 877
    .line 878
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 879
    .line 880
    .line 881
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 882
    .line 883
    .line 884
    move-result v3

    .line 885
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 886
    .line 887
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 888
    .line 889
    .line 890
    move-result-wide v6

    .line 891
    const/4 v2, 0x0

    .line 892
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 896
    .line 897
    .line 898
    move-result v10

    .line 899
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 900
    .line 901
    .line 902
    move-result v11

    .line 903
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 906
    .line 907
    .line 908
    const v4, 0x408147ae    # 4.04f

    .line 909
    .line 910
    .line 911
    const v6, 0x414ca3d7    # 12.79f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v4, -0x40051eb8    # -1.96f

    .line 918
    .line 919
    .line 920
    const v6, 0x3ee66666    # 0.45f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v25, 0x3ee147ae    # 0.44f

    .line 927
    .line 928
    .line 929
    const v26, 0x3ff9999a    # 1.95f

    .line 930
    .line 931
    .line 932
    const v21, 0x3da3d70a    # 0.08f

    .line 933
    .line 934
    .line 935
    const v22, 0x3f2b851f    # 0.67f

    .line 936
    .line 937
    .line 938
    const v23, 0x3e6b851f    # 0.23f

    .line 939
    .line 940
    .line 941
    const v24, 0x3faa3d71    # 1.33f

    .line 942
    .line 943
    .line 944
    move-object/from16 v20, v2

    .line 945
    .line 946
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v4, 0x3ffc28f6    # 1.97f

    .line 950
    .line 951
    .line 952
    const v6, -0x4119999a    # -0.45f

    .line 953
    .line 954
    .line 955
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v25, 0x408147ae    # 4.04f

    .line 959
    .line 960
    .line 961
    const v26, 0x414ca3d7    # 12.79f

    .line 962
    .line 963
    .line 964
    const v21, 0x4088a3d7    # 4.27f

    .line 965
    .line 966
    .line 967
    const v22, 0x4161eb85    # 14.12f

    .line 968
    .line 969
    .line 970
    const v23, 0x4083851f    # 4.11f

    .line 971
    .line 972
    .line 973
    const v24, 0x4157851f    # 13.47f

    .line 974
    .line 975
    .line 976
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    const/high16 v6, 0x3f800000    # 1.0f

    .line 987
    .line 988
    const/4 v7, 0x0

    .line 989
    const-string v4, ""

    .line 990
    .line 991
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 992
    .line 993
    .line 994
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 999
    .line 1000
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v6

    .line 1004
    const/4 v2, 0x0

    .line 1005
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1009
    .line 1010
    .line 1011
    move-result v10

    .line 1012
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1013
    .line 1014
    .line 1015
    move-result v11

    .line 1016
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1019
    .line 1020
    .line 1021
    const v4, 0x405eb852    # 3.48f

    .line 1022
    .line 1023
    .line 1024
    const v6, 0x4189ae14    # 17.21f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v25, -0x4019999a    # -1.8f

    .line 1031
    .line 1032
    .line 1033
    const v26, -0x40a147ae    # -0.87f

    .line 1034
    .line 1035
    .line 1036
    const v21, -0x40ee147b    # -0.57f

    .line 1037
    .line 1038
    .line 1039
    const v22, -0x414ccccd    # -0.35f

    .line 1040
    .line 1041
    .line 1042
    const v23, -0x406a3d71    # -1.17f

    .line 1043
    .line 1044
    .line 1045
    const v24, -0x40dc28f6    # -0.64f

    .line 1046
    .line 1047
    .line 1048
    move-object/from16 v20, v2

    .line 1049
    .line 1050
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v4, -0x40a147ae    # -0.87f

    .line 1054
    .line 1055
    .line 1056
    const v6, 0x3fe7ae14    # 1.81f

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1060
    .line 1061
    .line 1062
    const v25, 0x3fe66666    # 1.8f

    .line 1063
    .line 1064
    .line 1065
    const v26, 0x3f5eb852    # 0.87f

    .line 1066
    .line 1067
    .line 1068
    const v21, 0x3f23d70a    # 0.64f

    .line 1069
    .line 1070
    .line 1071
    const v22, 0x3e6147ae    # 0.22f

    .line 1072
    .line 1073
    .line 1074
    const v23, 0x3f9eb852    # 1.24f

    .line 1075
    .line 1076
    .line 1077
    const v24, 0x3f028f5c    # 0.51f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const v4, 0x405eb852    # 3.48f

    .line 1084
    .line 1085
    .line 1086
    const v6, 0x4189ae14    # 17.21f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1100
    .line 1101
    const/4 v7, 0x0

    .line 1102
    const-string v4, ""

    .line 1103
    .line 1104
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1105
    .line 1106
    .line 1107
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1108
    .line 1109
    .line 1110
    move-result v3

    .line 1111
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1112
    .line 1113
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1114
    .line 1115
    .line 1116
    move-result-wide v6

    .line 1117
    const/4 v2, 0x0

    .line 1118
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1122
    .line 1123
    .line 1124
    move-result v10

    .line 1125
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1126
    .line 1127
    .line 1128
    move-result v11

    .line 1129
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    const v4, 0x40823d71    # 4.07f

    .line 1135
    .line 1136
    .line 1137
    const/high16 v6, 0x41500000    # 13.0f

    .line 1138
    .line 1139
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    const v4, 0x40033333    # 2.05f

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    const/high16 v25, 0x41400000    # 12.0f

    .line 1149
    .line 1150
    const/high16 v26, 0x40000000    # 2.0f

    .line 1151
    .line 1152
    const v21, 0x414ab852    # 12.67f

    .line 1153
    .line 1154
    .line 1155
    const v22, 0x400147ae    # 2.02f

    .line 1156
    .line 1157
    .line 1158
    const v23, 0x414570a4    # 12.34f

    .line 1159
    .line 1160
    .line 1161
    const/high16 v24, 0x40000000    # 2.0f

    .line 1162
    .line 1163
    move-object/from16 v20, v2

    .line 1164
    .line 1165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    const/high16 v4, -0x40800000    # -1.0f

    .line 1169
    .line 1170
    const v6, 0x3d4ccccd    # 0.05f

    .line 1171
    .line 1172
    .line 1173
    const v7, -0x40d47ae1    # -0.67f

    .line 1174
    .line 1175
    .line 1176
    const v8, 0x3ca3d70a    # 0.02f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v4, 0x400147ae    # 2.02f

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const/high16 v26, 0x40800000    # 4.0f

    .line 1189
    .line 1190
    const v21, 0x413547ae    # 11.33f

    .line 1191
    .line 1192
    .line 1193
    const v22, 0x4080f5c3    # 4.03f

    .line 1194
    .line 1195
    .line 1196
    const v23, 0x413a8f5c    # 11.66f

    .line 1197
    .line 1198
    .line 1199
    const/high16 v24, 0x40800000    # 4.0f

    .line 1200
    .line 1201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v4, 0x414ab852    # 12.67f

    .line 1205
    .line 1206
    .line 1207
    const v6, 0x4080f5c3    # 4.03f

    .line 1208
    .line 1209
    .line 1210
    const v7, 0x40823d71    # 4.07f

    .line 1211
    .line 1212
    .line 1213
    const/high16 v8, 0x41500000    # 13.0f

    .line 1214
    .line 1215
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1226
    .line 1227
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1228
    .line 1229
    const/4 v7, 0x0

    .line 1230
    const-string v4, ""

    .line 1231
    .line 1232
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1233
    .line 1234
    .line 1235
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1236
    .line 1237
    .line 1238
    move-result v3

    .line 1239
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1240
    .line 1241
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v6

    .line 1245
    const/4 v2, 0x0

    .line 1246
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1250
    .line 1251
    .line 1252
    move-result v10

    .line 1253
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1254
    .line 1255
    .line 1256
    move-result v11

    .line 1257
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1260
    .line 1261
    .line 1262
    const v4, 0x419f70a4    # 19.93f

    .line 1263
    .line 1264
    .line 1265
    const/high16 v6, 0x41300000    # 11.0f

    .line 1266
    .line 1267
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1268
    .line 1269
    .line 1270
    const v4, 0x400147ae    # 2.02f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const/high16 v25, 0x3f800000    # 1.0f

    .line 1277
    .line 1278
    const v26, 0x3d4ccccd    # 0.05f

    .line 1279
    .line 1280
    .line 1281
    const v21, 0x3ea8f5c3    # 0.33f

    .line 1282
    .line 1283
    .line 1284
    const v22, 0x3cf5c28f    # 0.03f

    .line 1285
    .line 1286
    .line 1287
    const v23, 0x3f28f5c3    # 0.66f

    .line 1288
    .line 1289
    .line 1290
    const v24, 0x3d4ccccd    # 0.05f

    .line 1291
    .line 1292
    .line 1293
    move-object/from16 v20, v2

    .line 1294
    .line 1295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1299
    .line 1300
    const v6, -0x42b33333    # -0.05f

    .line 1301
    .line 1302
    .line 1303
    const v7, 0x3f2b851f    # 0.67f

    .line 1304
    .line 1305
    .line 1306
    const v8, -0x435c28f6    # -0.02f

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const v4, -0x3ffeb852    # -2.02f

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1316
    .line 1317
    .line 1318
    const/high16 v25, 0x41400000    # 12.0f

    .line 1319
    .line 1320
    const/high16 v26, 0x41a00000    # 20.0f

    .line 1321
    .line 1322
    const v21, 0x414ab852    # 12.67f

    .line 1323
    .line 1324
    .line 1325
    const v22, 0x419fc28f    # 19.97f

    .line 1326
    .line 1327
    .line 1328
    const v23, 0x414570a4    # 12.34f

    .line 1329
    .line 1330
    .line 1331
    const/high16 v24, 0x41a00000    # 20.0f

    .line 1332
    .line 1333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    const v4, 0x413547ae    # 11.33f

    .line 1337
    .line 1338
    .line 1339
    const v6, 0x419fc28f    # 19.97f

    .line 1340
    .line 1341
    .line 1342
    const v7, 0x419f70a4    # 19.93f

    .line 1343
    .line 1344
    .line 1345
    const/high16 v8, 0x41300000    # 11.0f

    .line 1346
    .line 1347
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v2

    .line 1357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1358
    .line 1359
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1360
    .line 1361
    const/4 v7, 0x0

    .line 1362
    const-string v4, ""

    .line 1363
    .line 1364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1365
    .line 1366
    .line 1367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1368
    .line 1369
    .line 1370
    move-result v3

    .line 1371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1372
    .line 1373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v6

    .line 1377
    const/4 v2, 0x0

    .line 1378
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1382
    .line 1383
    .line 1384
    move-result v10

    .line 1385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1386
    .line 1387
    .line 1388
    move-result v11

    .line 1389
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1390
    .line 1391
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1392
    .line 1393
    .line 1394
    const v4, 0x419c147b    # 19.51f

    .line 1395
    .line 1396
    .line 1397
    const v6, 0x416bd70a    # 14.74f

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1401
    .line 1402
    .line 1403
    const v4, 0x3ffc28f6    # 1.97f

    .line 1404
    .line 1405
    .line 1406
    const v6, 0x3ee66666    # 0.45f

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    const v25, 0x3ee147ae    # 0.44f

    .line 1413
    .line 1414
    .line 1415
    const v26, -0x40066666    # -1.95f

    .line 1416
    .line 1417
    .line 1418
    const v21, 0x3e570a3d    # 0.21f

    .line 1419
    .line 1420
    .line 1421
    const v22, -0x40deb852    # -0.63f

    .line 1422
    .line 1423
    .line 1424
    const v23, 0x3eb851ec    # 0.36f

    .line 1425
    .line 1426
    .line 1427
    const v24, -0x405c28f6    # -1.28f

    .line 1428
    .line 1429
    .line 1430
    move-object/from16 v20, v2

    .line 1431
    .line 1432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1433
    .line 1434
    .line 1435
    const v4, -0x40051eb8    # -1.96f

    .line 1436
    .line 1437
    .line 1438
    const v6, -0x4119999a    # -0.45f

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1442
    .line 1443
    .line 1444
    const v25, 0x419c147b    # 19.51f

    .line 1445
    .line 1446
    .line 1447
    const v26, 0x416bd70a    # 14.74f

    .line 1448
    .line 1449
    .line 1450
    const v21, 0x419f1eb8    # 19.89f

    .line 1451
    .line 1452
    .line 1453
    const v22, 0x4157851f    # 13.47f

    .line 1454
    .line 1455
    .line 1456
    const v23, 0x419dd70a    # 19.73f

    .line 1457
    .line 1458
    .line 1459
    const v24, 0x4161eb85    # 14.12f

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1463
    .line 1464
    .line 1465
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1473
    .line 1474
    const/4 v7, 0x0

    .line 1475
    const-string v4, ""

    .line 1476
    .line 1477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1478
    .line 1479
    .line 1480
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1481
    .line 1482
    .line 1483
    move-result v3

    .line 1484
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1485
    .line 1486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1487
    .line 1488
    .line 1489
    move-result-wide v6

    .line 1490
    const/4 v2, 0x0

    .line 1491
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1495
    .line 1496
    .line 1497
    move-result v10

    .line 1498
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1499
    .line 1500
    .line 1501
    move-result v11

    .line 1502
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1503
    .line 1504
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1505
    .line 1506
    .line 1507
    const v4, 0x419fae14    # 19.96f

    .line 1508
    .line 1509
    .line 1510
    const v6, 0x41335c29    # 11.21f

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1514
    .line 1515
    .line 1516
    const v4, 0x3ffae148    # 1.96f

    .line 1517
    .line 1518
    .line 1519
    const v6, -0x4119999a    # -0.45f

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1523
    .line 1524
    .line 1525
    const v25, -0x411eb852    # -0.44f

    .line 1526
    .line 1527
    .line 1528
    const v26, -0x40066666    # -1.95f

    .line 1529
    .line 1530
    .line 1531
    const v21, -0x425c28f6    # -0.08f

    .line 1532
    .line 1533
    .line 1534
    const v22, -0x40d47ae1    # -0.67f

    .line 1535
    .line 1536
    .line 1537
    const v23, -0x41947ae1    # -0.23f

    .line 1538
    .line 1539
    .line 1540
    const v24, -0x4055c28f    # -1.33f

    .line 1541
    .line 1542
    .line 1543
    move-object/from16 v20, v2

    .line 1544
    .line 1545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1546
    .line 1547
    .line 1548
    const v4, -0x4003d70a    # -1.97f

    .line 1549
    .line 1550
    .line 1551
    const v6, 0x3ee66666    # 0.45f

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1555
    .line 1556
    .line 1557
    const v25, 0x419fae14    # 19.96f

    .line 1558
    .line 1559
    .line 1560
    const v26, 0x41335c29    # 11.21f

    .line 1561
    .line 1562
    .line 1563
    const v21, 0x419dd70a    # 19.73f

    .line 1564
    .line 1565
    .line 1566
    const v22, 0x411e147b    # 9.88f

    .line 1567
    .line 1568
    .line 1569
    const v23, 0x419f1eb8    # 19.89f

    .line 1570
    .line 1571
    .line 1572
    const v24, 0x41287ae1    # 10.53f

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1576
    .line 1577
    .line 1578
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v2

    .line 1585
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1586
    .line 1587
    const/4 v7, 0x0

    .line 1588
    const-string v4, ""

    .line 1589
    .line 1590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1591
    .line 1592
    .line 1593
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1598
    .line 1599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1600
    .line 1601
    .line 1602
    move-result-wide v6

    .line 1603
    const/4 v2, 0x0

    .line 1604
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1608
    .line 1609
    .line 1610
    move-result v10

    .line 1611
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1612
    .line 1613
    .line 1614
    move-result v11

    .line 1615
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1616
    .line 1617
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1618
    .line 1619
    .line 1620
    const v4, 0x418ca3d7    # 17.58f

    .line 1621
    .line 1622
    .line 1623
    const v6, 0x418dd70a    # 17.73f

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1627
    .line 1628
    .line 1629
    const v4, 0x3fa147ae    # 1.26f

    .line 1630
    .line 1631
    .line 1632
    const v6, 0x3fca3d71    # 1.58f

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1636
    .line 1637
    .line 1638
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 1639
    .line 1640
    const v26, -0x403851ec    # -1.56f

    .line 1641
    .line 1642
    .line 1643
    const v21, 0x3ef0a3d7    # 0.47f

    .line 1644
    .line 1645
    .line 1646
    const v22, -0x410a3d71    # -0.48f

    .line 1647
    .line 1648
    .line 1649
    const v23, 0x3f6147ae    # 0.88f

    .line 1650
    .line 1651
    .line 1652
    const/high16 v24, -0x40800000    # -1.0f

    .line 1653
    .line 1654
    move-object/from16 v20, v2

    .line 1655
    .line 1656
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1657
    .line 1658
    .line 1659
    const v4, -0x405eb852    # -1.26f

    .line 1660
    .line 1661
    .line 1662
    const v6, -0x4035c28f    # -1.58f

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1666
    .line 1667
    .line 1668
    const v25, 0x418ca3d7    # 17.58f

    .line 1669
    .line 1670
    .line 1671
    const v26, 0x418dd70a    # 17.73f

    .line 1672
    .line 1673
    .line 1674
    const v21, 0x4193c28f    # 18.47f

    .line 1675
    .line 1676
    .line 1677
    const v22, 0x4185d70a    # 16.73f

    .line 1678
    .line 1679
    .line 1680
    const v23, 0x41906666    # 18.05f

    .line 1681
    .line 1682
    .line 1683
    const v24, 0x418a147b    # 17.26f

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v2

    .line 1696
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1697
    .line 1698
    const/4 v7, 0x0

    .line 1699
    const-string v4, ""

    .line 1700
    .line 1701
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1702
    .line 1703
    .line 1704
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1705
    .line 1706
    .line 1707
    move-result v3

    .line 1708
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1709
    .line 1710
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1711
    .line 1712
    .line 1713
    move-result-wide v6

    .line 1714
    const/4 v2, 0x0

    .line 1715
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1719
    .line 1720
    .line 1721
    move-result v10

    .line 1722
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1723
    .line 1724
    .line 1725
    move-result v11

    .line 1726
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1727
    .line 1728
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1729
    .line 1730
    .line 1731
    const v4, 0x41a428f6    # 20.52f

    .line 1732
    .line 1733
    .line 1734
    const v6, 0x40d947ae    # 6.79f

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1738
    .line 1739
    .line 1740
    const v25, 0x3fe66666    # 1.8f

    .line 1741
    .line 1742
    .line 1743
    const v26, 0x3f5eb852    # 0.87f

    .line 1744
    .line 1745
    .line 1746
    const v21, 0x3f11eb85    # 0.57f

    .line 1747
    .line 1748
    .line 1749
    const v22, 0x3eb33333    # 0.35f

    .line 1750
    .line 1751
    .line 1752
    const v23, 0x3f95c28f    # 1.17f

    .line 1753
    .line 1754
    .line 1755
    const v24, 0x3f23d70a    # 0.64f

    .line 1756
    .line 1757
    .line 1758
    move-object/from16 v20, v2

    .line 1759
    .line 1760
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1761
    .line 1762
    .line 1763
    const v4, -0x401851ec    # -1.81f

    .line 1764
    .line 1765
    .line 1766
    const v6, 0x3f5eb852    # 0.87f

    .line 1767
    .line 1768
    .line 1769
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1770
    .line 1771
    .line 1772
    const v25, -0x4019999a    # -1.8f

    .line 1773
    .line 1774
    .line 1775
    const v26, -0x40a147ae    # -0.87f

    .line 1776
    .line 1777
    .line 1778
    const v21, -0x40dc28f6    # -0.64f

    .line 1779
    .line 1780
    .line 1781
    const v22, -0x419eb852    # -0.22f

    .line 1782
    .line 1783
    .line 1784
    const v23, -0x406147ae    # -1.24f

    .line 1785
    .line 1786
    .line 1787
    const v24, -0x40fd70a4    # -0.51f

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1791
    .line 1792
    .line 1793
    const v4, 0x41a428f6    # 20.52f

    .line 1794
    .line 1795
    .line 1796
    const v6, 0x40d947ae    # 6.79f

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1800
    .line 1801
    .line 1802
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1803
    .line 1804
    .line 1805
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v2

    .line 1809
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1810
    .line 1811
    const/4 v7, 0x0

    .line 1812
    const-string v4, ""

    .line 1813
    .line 1814
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1815
    .line 1816
    .line 1817
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1818
    .line 1819
    .line 1820
    move-result v3

    .line 1821
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1822
    .line 1823
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1824
    .line 1825
    .line 1826
    move-result-wide v6

    .line 1827
    const/4 v2, 0x0

    .line 1828
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1832
    .line 1833
    .line 1834
    move-result v10

    .line 1835
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1836
    .line 1837
    .line 1838
    move-result v11

    .line 1839
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1840
    .line 1841
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1842
    .line 1843
    .line 1844
    const v4, 0x4168a3d7    # 14.54f

    .line 1845
    .line 1846
    .line 1847
    const v6, 0x419ca3d7    # 19.58f

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1851
    .line 1852
    .line 1853
    const v4, 0x3fe7ae14    # 1.81f

    .line 1854
    .line 1855
    .line 1856
    const v6, 0x3f5eb852    # 0.87f

    .line 1857
    .line 1858
    .line 1859
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1860
    .line 1861
    .line 1862
    const v25, 0x3fe66666    # 1.8f

    .line 1863
    .line 1864
    .line 1865
    const v21, 0x3f2147ae    # 0.63f

    .line 1866
    .line 1867
    .line 1868
    const v22, -0x41947ae1    # -0.23f

    .line 1869
    .line 1870
    .line 1871
    const v23, 0x3f9eb852    # 1.24f

    .line 1872
    .line 1873
    .line 1874
    const v24, -0x40fae148    # -0.52f

    .line 1875
    .line 1876
    .line 1877
    move-object/from16 v20, v2

    .line 1878
    .line 1879
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1880
    .line 1881
    .line 1882
    const v4, -0x401851ec    # -1.81f

    .line 1883
    .line 1884
    .line 1885
    const v6, -0x40a147ae    # -0.87f

    .line 1886
    .line 1887
    .line 1888
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1889
    .line 1890
    .line 1891
    const v25, 0x4168a3d7    # 14.54f

    .line 1892
    .line 1893
    .line 1894
    const v26, 0x419ca3d7    # 19.58f

    .line 1895
    .line 1896
    .line 1897
    const v21, 0x417c7ae1    # 15.78f

    .line 1898
    .line 1899
    .line 1900
    const v22, 0x41988f5c    # 19.07f

    .line 1901
    .line 1902
    .line 1903
    const v23, 0x4172e148    # 15.18f

    .line 1904
    .line 1905
    .line 1906
    const v24, 0x419ae148    # 19.36f

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v2

    .line 1919
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1920
    .line 1921
    const/4 v7, 0x0

    .line 1922
    const-string v4, ""

    .line 1923
    .line 1924
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1925
    .line 1926
    .line 1927
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1928
    .line 1929
    .line 1930
    move-result v3

    .line 1931
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1932
    .line 1933
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1934
    .line 1935
    .line 1936
    move-result-wide v6

    .line 1937
    const/4 v0, 0x0

    .line 1938
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1942
    .line 1943
    .line 1944
    move-result v10

    .line 1945
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1946
    .line 1947
    .line 1948
    move-result v11

    .line 1949
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1950
    .line 1951
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1952
    .line 1953
    .line 1954
    const v0, 0x418b5c29    # 17.42f

    .line 1955
    .line 1956
    .line 1957
    const v2, 0x40666666    # 3.6f

    .line 1958
    .line 1959
    .line 1960
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1961
    .line 1962
    .line 1963
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 1964
    .line 1965
    const v18, 0x3fc7ae14    # 1.56f

    .line 1966
    .line 1967
    .line 1968
    const v13, 0x3eb851ec    # 0.36f

    .line 1969
    .line 1970
    .line 1971
    const v14, 0x3f0f5c29    # 0.56f

    .line 1972
    .line 1973
    .line 1974
    const v15, 0x3f47ae14    # 0.78f

    .line 1975
    .line 1976
    .line 1977
    const v16, 0x3f8b851f    # 1.09f

    .line 1978
    .line 1979
    .line 1980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1981
    .line 1982
    .line 1983
    const v0, -0x405eb852    # -1.26f

    .line 1984
    .line 1985
    .line 1986
    const v2, 0x3fca3d71    # 1.58f

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1990
    .line 1991
    .line 1992
    const v17, -0x406147ae    # -1.24f

    .line 1993
    .line 1994
    .line 1995
    const v18, -0x40370a3d    # -1.57f

    .line 1996
    .line 1997
    .line 1998
    const v13, -0x410a3d71    # -0.48f

    .line 1999
    .line 2000
    .line 2001
    const v14, -0x410f5c29    # -0.47f

    .line 2002
    .line 2003
    .line 2004
    const v15, -0x409c28f6    # -0.89f

    .line 2005
    .line 2006
    .line 2007
    const v16, -0x40828f5c    # -0.99f

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2011
    .line 2012
    .line 2013
    const v0, 0x418b5c29    # 17.42f

    .line 2014
    .line 2015
    .line 2016
    const v2, 0x40666666    # 3.6f

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2023
    .line 2024
    .line 2025
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v2

    .line 2029
    const/16 v16, 0x3800

    .line 2030
    .line 2031
    const/16 v17, 0x0

    .line 2032
    .line 2033
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2034
    .line 2035
    const/4 v7, 0x0

    .line 2036
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2037
    .line 2038
    const/4 v13, 0x0

    .line 2039
    const/4 v14, 0x0

    .line 2040
    const/4 v15, 0x0

    .line 2041
    const-string v4, ""

    .line 2042
    .line 2043
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v0

    .line 2047
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v0

    .line 2051
    sput-object v0, Landroidx/compose/material/icons/twotone/NoiseAwareKt;->_noiseAware:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2052
    .line 2053
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2054
    .line 2055
    .line 2056
    return-object v0
.end method
