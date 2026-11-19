.class public final Landroidx/compose/material/icons/rounded/DatasetLinkedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDatasetLinked(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DatasetLinkedKt;->_datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DatasetLinked"

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
    const v4, 0x410170a4    # 8.09f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40e00000    # 7.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x3f800000    # -4.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x406c28f6    # 3.69f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v25, 0x4053d70a    # 3.31f

    .line 95
    .line 96
    .line 97
    const/high16 v26, -0x40800000    # -1.0f

    .line 98
    .line 99
    const v21, 0x3f733333    # 0.95f

    .line 100
    .line 101
    .line 102
    const v22, -0x40deb852    # -0.63f

    .line 103
    .line 104
    .line 105
    const v23, 0x4005c28f    # 2.09f

    .line 106
    .line 107
    .line 108
    const/high16 v24, -0x40800000    # -1.0f

    .line 109
    .line 110
    move-object/from16 v20, v2

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40c00000    # 6.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const v26, 0x3db851ec    # 0.09f

    .line 123
    .line 124
    .line 125
    const v21, 0x3eae147b    # 0.34f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const v23, 0x3f2b851f    # 0.67f

    .line 131
    .line 132
    .line 133
    const v24, 0x3d23d70a    # 0.04f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40a00000    # 5.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, -0x40000000    # -2.0f

    .line 145
    .line 146
    const/high16 v26, -0x40000000    # -2.0f

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, -0x40733333    # -1.1f

    .line 151
    .line 152
    .line 153
    const v23, -0x4099999a    # -0.9f

    .line 154
    .line 155
    .line 156
    const/high16 v24, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, 0x40400000    # 3.0f

    .line 165
    .line 166
    const/high16 v26, 0x40a00000    # 5.0f

    .line 167
    .line 168
    const v21, 0x4079999a    # 3.9f

    .line 169
    .line 170
    .line 171
    const/high16 v22, 0x40400000    # 3.0f

    .line 172
    .line 173
    const/high16 v23, 0x40400000    # 3.0f

    .line 174
    .line 175
    const v24, 0x4079999a    # 3.9f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41600000    # 14.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x40000000    # 2.0f

    .line 187
    .line 188
    const/high16 v26, 0x40000000    # 2.0f

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    const v22, 0x3f8ccccd    # 1.1f

    .line 193
    .line 194
    .line 195
    const v23, 0x3f666666    # 0.9f

    .line 196
    .line 197
    .line 198
    const/high16 v24, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x4073d70a    # 3.81f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, 0x41000000    # 8.0f

    .line 210
    .line 211
    const/high16 v26, 0x41900000    # 18.0f

    .line 212
    .line 213
    const v21, 0x4104cccd    # 8.3f

    .line 214
    .line 215
    .line 216
    const v22, 0x41a0f5c3    # 20.12f

    .line 217
    .line 218
    .line 219
    const/high16 v23, 0x41000000    # 8.0f

    .line 220
    .line 221
    const v24, 0x4198b852    # 19.09f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x410170a4    # 8.09f

    .line 228
    .line 229
    .line 230
    const/high16 v26, 0x41880000    # 17.0f

    .line 231
    .line 232
    const/high16 v21, 0x41000000    # 8.0f

    .line 233
    .line 234
    const v22, 0x418d47ae    # 17.66f

    .line 235
    .line 236
    .line 237
    const v23, 0x4100a3d7    # 8.04f

    .line 238
    .line 239
    .line 240
    const v24, 0x418aa3d7    # 17.33f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x41500000    # 13.0f

    .line 250
    .line 251
    const/high16 v6, 0x40e00000    # 7.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x40800000    # 4.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, -0x3f800000    # -4.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x40e00000    # 7.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40800000    # 4.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x40e00000    # 7.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/16 v16, 0x3800

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const/high16 v6, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v8, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const/high16 v9, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/high16 v12, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const/4 v14, 0x0

    .line 318
    const/4 v15, 0x0

    .line 319
    const-string v4, ""

    .line 320
    .line 321
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 331
    .line 332
    .line 333
    move-result-wide v6

    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const v4, 0x41407ae1    # 12.03f

    .line 352
    .line 353
    .line 354
    const v6, 0x418d47ae    # 17.66f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, 0x40051eb8    # 2.08f

    .line 361
    .line 362
    .line 363
    const v26, -0x402b851f    # -1.66f

    .line 364
    .line 365
    .line 366
    const v21, 0x3e23d70a    # 0.16f

    .line 367
    .line 368
    .line 369
    const v22, -0x40851eb8    # -0.98f

    .line 370
    .line 371
    .line 372
    const v23, 0x3f8b851f    # 1.09f

    .line 373
    .line 374
    .line 375
    const v24, -0x402b851f    # -1.66f

    .line 376
    .line 377
    .line 378
    move-object/from16 v20, v2

    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v4, 0x41800000    # 16.0f

    .line 384
    .line 385
    const/high16 v6, 0x41700000    # 15.0f

    .line 386
    .line 387
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v25, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v26, -0x40800000    # -1.0f

    .line 393
    .line 394
    const v21, 0x3f0ccccd    # 0.55f

    .line 395
    .line 396
    .line 397
    const/16 v22, 0x0

    .line 398
    .line 399
    const/high16 v23, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const v24, -0x4119999a    # -0.45f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/4 v4, 0x0

    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v25, -0x40800000    # -1.0f

    .line 412
    .line 413
    const/16 v21, 0x0

    .line 414
    .line 415
    const v22, -0x40f33333    # -0.55f

    .line 416
    .line 417
    .line 418
    const v23, -0x4119999a    # -0.45f

    .line 419
    .line 420
    .line 421
    const/high16 v24, -0x40800000    # -1.0f

    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v4, -0x40ab851f    # -0.83f

    .line 427
    .line 428
    .line 429
    const/4 v6, 0x0

    .line 430
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v25, -0x3f7b3333    # -4.15f

    .line 434
    .line 435
    .line 436
    const v26, 0x40670a3d    # 3.61f

    .line 437
    .line 438
    .line 439
    const v21, -0x3ffa3d71    # -2.09f

    .line 440
    .line 441
    .line 442
    const/16 v22, 0x0

    .line 443
    .line 444
    const v23, -0x3f833333    # -3.95f

    .line 445
    .line 446
    .line 447
    const v24, 0x3fc3d70a    # 1.53f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v25, 0x41600000    # 14.0f

    .line 454
    .line 455
    const/high16 v26, 0x41b00000    # 22.0f

    .line 456
    .line 457
    const v21, 0x411ca3d7    # 9.79f

    .line 458
    .line 459
    .line 460
    const v22, 0x419feb85    # 19.99f

    .line 461
    .line 462
    .line 463
    const v23, 0x413a8f5c    # 11.66f

    .line 464
    .line 465
    .line 466
    const/high16 v24, 0x41b00000    # 22.0f

    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v4, 0x3f800000    # 1.0f

    .line 472
    .line 473
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v26, -0x40800000    # -1.0f

    .line 479
    .line 480
    const v21, 0x3f0ccccd    # 0.55f

    .line 481
    .line 482
    .line 483
    const/16 v22, 0x0

    .line 484
    .line 485
    const/high16 v23, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const v24, -0x4119999a    # -0.45f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/4 v4, 0x0

    .line 494
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v25, -0x40800000    # -1.0f

    .line 498
    .line 499
    const/16 v21, 0x0

    .line 500
    .line 501
    const v22, -0x40f33333    # -0.55f

    .line 502
    .line 503
    .line 504
    const v23, -0x4119999a    # -0.45f

    .line 505
    .line 506
    .line 507
    const/high16 v24, -0x40800000    # -1.0f

    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, -0x40800000    # -1.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v25, 0x41407ae1    # 12.03f

    .line 518
    .line 519
    .line 520
    const v26, 0x418d47ae    # 17.66f

    .line 521
    .line 522
    .line 523
    const v21, 0x414ca3d7    # 12.79f

    .line 524
    .line 525
    .line 526
    const/high16 v22, 0x41a00000    # 20.0f

    .line 527
    .line 528
    const v23, 0x413d1eb8    # 11.82f

    .line 529
    .line 530
    .line 531
    const v24, 0x419747ae    # 18.91f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/high16 v6, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 557
    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 559
    .line 560
    .line 561
    move-result-wide v6

    .line 562
    const/4 v2, 0x0

    .line 563
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 571
    .line 572
    .line 573
    move-result v11

    .line 574
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 577
    .line 578
    .line 579
    const v4, 0x419ea3d7    # 19.83f

    .line 580
    .line 581
    .line 582
    const/high16 v6, 0x41600000    # 14.0f

    .line 583
    .line 584
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x41980000    # 19.0f

    .line 588
    .line 589
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v25, -0x40800000    # -1.0f

    .line 593
    .line 594
    const/high16 v26, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const v21, -0x40f33333    # -0.55f

    .line 597
    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const/high16 v23, -0x40800000    # -1.0f

    .line 602
    .line 603
    const v24, 0x3ee66666    # 0.45f

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
    const/4 v4, 0x0

    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v25, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/16 v21, 0x0

    .line 618
    .line 619
    const v22, 0x3f0ccccd    # 0.55f

    .line 620
    .line 621
    .line 622
    const v23, 0x3ee66666    # 0.45f

    .line 623
    .line 624
    .line 625
    const/high16 v24, 0x3f800000    # 1.0f

    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v4, 0x3f63d70a    # 0.89f

    .line 631
    .line 632
    .line 633
    const/4 v6, 0x0

    .line 634
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v25, 0x40051eb8    # 2.08f

    .line 638
    .line 639
    .line 640
    const v26, 0x3fd47ae1    # 1.66f

    .line 641
    .line 642
    .line 643
    const/high16 v21, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const/16 v22, 0x0

    .line 646
    .line 647
    const v23, 0x3ff5c28f    # 1.92f

    .line 648
    .line 649
    .line 650
    const v24, 0x3f2e147b    # 0.68f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v25, 0x41a00000    # 20.0f

    .line 657
    .line 658
    const/high16 v26, 0x41a00000    # 20.0f

    .line 659
    .line 660
    const v21, 0x41b170a4    # 22.18f

    .line 661
    .line 662
    .line 663
    const v22, 0x419747ae    # 18.91f

    .line 664
    .line 665
    .line 666
    const v23, 0x41a9ae14    # 21.21f

    .line 667
    .line 668
    .line 669
    const/high16 v24, 0x41a00000    # 20.0f

    .line 670
    .line 671
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v4, -0x40800000    # -1.0f

    .line 675
    .line 676
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v25, -0x40800000    # -1.0f

    .line 680
    .line 681
    const/high16 v26, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const v21, -0x40f33333    # -0.55f

    .line 684
    .line 685
    .line 686
    const/16 v22, 0x0

    .line 687
    .line 688
    const/high16 v23, -0x40800000    # -1.0f

    .line 689
    .line 690
    const v24, 0x3ee66666    # 0.45f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/4 v4, 0x0

    .line 697
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v25, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/16 v21, 0x0

    .line 703
    .line 704
    const v22, 0x3f0ccccd    # 0.55f

    .line 705
    .line 706
    .line 707
    const v23, 0x3ee66666    # 0.45f

    .line 708
    .line 709
    .line 710
    const/high16 v24, 0x3f800000    # 1.0f

    .line 711
    .line 712
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v4, 0x3f800000    # 1.0f

    .line 716
    .line 717
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v25, 0x407eb852    # 3.98f

    .line 721
    .line 722
    .line 723
    const v26, -0x3f73851f    # -4.39f

    .line 724
    .line 725
    .line 726
    const v21, 0x4015c28f    # 2.34f

    .line 727
    .line 728
    .line 729
    const/16 v22, 0x0

    .line 730
    .line 731
    const v23, 0x4086b852    # 4.21f

    .line 732
    .line 733
    .line 734
    const v24, -0x3fff5c29    # -2.01f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v25, 0x419ea3d7    # 19.83f

    .line 741
    .line 742
    .line 743
    const/high16 v26, 0x41600000    # 14.0f

    .line 744
    .line 745
    const v21, 0x41be3d71    # 23.78f

    .line 746
    .line 747
    .line 748
    const v22, 0x41787ae1    # 15.53f

    .line 749
    .line 750
    .line 751
    const v23, 0x41af5c29    # 21.92f

    .line 752
    .line 753
    .line 754
    const/high16 v24, 0x41600000    # 14.0f

    .line 755
    .line 756
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    const/high16 v6, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/4 v7, 0x0

    .line 769
    const-string v4, ""

    .line 770
    .line 771
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 772
    .line 773
    .line 774
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 779
    .line 780
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 781
    .line 782
    .line 783
    move-result-wide v6

    .line 784
    const/4 v0, 0x0

    .line 785
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 789
    .line 790
    .line 791
    move-result v10

    .line 792
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 793
    .line 794
    .line 795
    move-result v11

    .line 796
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 799
    .line 800
    .line 801
    const/high16 v0, 0x41980000    # 19.0f

    .line 802
    .line 803
    const/high16 v2, 0x41700000    # 15.0f

    .line 804
    .line 805
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const/high16 v0, 0x40800000    # 4.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v17, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/high16 v18, -0x40800000    # -1.0f

    .line 816
    .line 817
    const v13, 0x3f0ccccd    # 0.55f

    .line 818
    .line 819
    .line 820
    const/high16 v15, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const v16, -0x4119999a    # -0.45f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/4 v0, 0x0

    .line 829
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v17, -0x40800000    # -1.0f

    .line 833
    .line 834
    const/4 v13, 0x0

    .line 835
    const v14, -0x40f33333    # -0.55f

    .line 836
    .line 837
    .line 838
    const v15, -0x4119999a    # -0.45f

    .line 839
    .line 840
    .line 841
    const/high16 v16, -0x40800000    # -1.0f

    .line 842
    .line 843
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v0, -0x3f800000    # -4.0f

    .line 847
    .line 848
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v18, 0x3f800000    # 1.0f

    .line 852
    .line 853
    const v13, -0x40f33333    # -0.55f

    .line 854
    .line 855
    .line 856
    const/4 v14, 0x0

    .line 857
    const/high16 v15, -0x40800000    # -1.0f

    .line 858
    .line 859
    const v16, 0x3ee66666    # 0.45f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const/4 v0, 0x0

    .line 866
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const/high16 v17, 0x41700000    # 15.0f

    .line 870
    .line 871
    const/high16 v18, 0x41980000    # 19.0f

    .line 872
    .line 873
    const/high16 v13, 0x41600000    # 14.0f

    .line 874
    .line 875
    const v14, 0x41946666    # 18.55f

    .line 876
    .line 877
    .line 878
    const v15, 0x41673333    # 14.45f

    .line 879
    .line 880
    .line 881
    const/high16 v16, 0x41980000    # 19.0f

    .line 882
    .line 883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    const/16 v16, 0x3800

    .line 894
    .line 895
    const/16 v17, 0x0

    .line 896
    .line 897
    const/high16 v6, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v7, 0x0

    .line 900
    const/high16 v12, 0x3f800000    # 1.0f

    .line 901
    .line 902
    const/4 v13, 0x0

    .line 903
    const/4 v14, 0x0

    .line 904
    const/4 v15, 0x0

    .line 905
    const-string v4, ""

    .line 906
    .line 907
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    sput-object v0, Landroidx/compose/material/icons/rounded/DatasetLinkedKt;->_datasetLinked:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 916
    .line 917
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    return-object v0
.end method
