.class public final Landroidx/compose/material/icons/twotone/TranscribeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTranscribe(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Transcribe"

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
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/high16 v6, -0x40000000    # -2.0f

    .line 77
    .line 78
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40800000    # 4.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v22, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x3f800000    # -4.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v6, 0x3e99999a    # 0.3f

    .line 114
    .line 115
    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
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
    const v4, 0x4167ae14    # 14.48f

    .line 160
    .line 161
    .line 162
    const v6, 0x418ab852    # 17.34f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x41100000    # 9.0f

    .line 169
    .line 170
    const/high16 v26, 0x41800000    # 16.0f

    .line 171
    .line 172
    const v21, 0x4154a3d7    # 13.29f

    .line 173
    .line 174
    .line 175
    const v22, 0x4185d70a    # 16.73f

    .line 176
    .line 177
    .line 178
    const v23, 0x4135eb85    # 11.37f

    .line 179
    .line 180
    .line 181
    const/high16 v24, 0x41800000    # 16.0f

    .line 182
    .line 183
    move-object/from16 v20, v2

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, -0x3f50a3d7    # -5.48f

    .line 189
    .line 190
    .line 191
    const v26, 0x3fab851f    # 1.34f

    .line 192
    .line 193
    .line 194
    const v21, -0x3fe851ec    # -2.37f

    .line 195
    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const v23, -0x3f76b852    # -4.29f

    .line 200
    .line 201
    .line 202
    const v24, 0x3f3ae148    # 0.73f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x40400000    # 3.0f

    .line 209
    .line 210
    const v26, 0x4191c28f    # 18.22f

    .line 211
    .line 212
    .line 213
    const v21, 0x404ccccd    # 3.2f

    .line 214
    .line 215
    .line 216
    const/high16 v22, 0x418c0000    # 17.5f

    .line 217
    .line 218
    const/high16 v23, 0x40400000    # 3.0f

    .line 219
    .line 220
    const v24, 0x418eb852    # 17.84f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41980000    # 19.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x41400000    # 12.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, -0x40b851ec    # -0.78f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v25, 0x4167ae14    # 14.48f

    .line 243
    .line 244
    .line 245
    const v26, 0x418ab852    # 17.34f

    .line 246
    .line 247
    .line 248
    const/high16 v21, 0x41700000    # 15.0f

    .line 249
    .line 250
    const v22, 0x418eb852    # 17.84f

    .line 251
    .line 252
    .line 253
    const v23, 0x416ccccd    # 14.8f

    .line 254
    .line 255
    .line 256
    const/high16 v24, 0x418c0000    # 17.5f

    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const v6, 0x3e99999a    # 0.3f

    .line 269
    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const-string v4, ""

    .line 273
    .line 274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 282
    .line 283
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    const/4 v2, 0x0

    .line 288
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x40000000    # 2.0f

    .line 305
    .line 306
    const v6, 0x418f70a4    # 17.93f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/16 v25, 0x0

    .line 313
    .line 314
    const/high16 v26, 0x41600000    # 14.0f

    .line 315
    .line 316
    const v21, -0x3f866666    # -3.9f

    .line 317
    .line 318
    .line 319
    const v22, 0x4078f5c3    # 3.89f

    .line 320
    .line 321
    .line 322
    const v23, -0x3f85c28f    # -3.91f

    .line 323
    .line 324
    .line 325
    const v24, 0x411f3333    # 9.95f

    .line 326
    .line 327
    .line 328
    move-object/from16 v20, v2

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v4, 0x3fd0a3d7    # 1.63f

    .line 334
    .line 335
    .line 336
    const v6, -0x402f5c29    # -1.63f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v26, -0x3ed428f6    # -10.74f

    .line 343
    .line 344
    .line 345
    const v21, -0x3fceb852    # -2.77f

    .line 346
    .line 347
    .line 348
    const v22, -0x3fbeb852    # -3.02f

    .line 349
    .line 350
    .line 351
    const v23, -0x3fceb852    # -2.77f

    .line 352
    .line 353
    .line 354
    const v24, -0x3f0e147b    # -7.56f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v4, 0x40000000    # 2.0f

    .line 361
    .line 362
    const v6, 0x418f70a4    # 17.93f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/high16 v6, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/high16 v8, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const-string v4, ""

    .line 381
    .line 382
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 383
    .line 384
    .line 385
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 390
    .line 391
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    const/4 v2, 0x0

    .line 396
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x41500000    # 13.0f

    .line 413
    .line 414
    const/high16 v6, 0x41100000    # 9.0f

    .line 415
    .line 416
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x40800000    # 4.0f

    .line 420
    .line 421
    const/high16 v26, -0x3f800000    # -4.0f

    .line 422
    .line 423
    const v21, 0x400d70a4    # 2.21f

    .line 424
    .line 425
    .line 426
    const/16 v22, 0x0

    .line 427
    .line 428
    const/high16 v23, 0x40800000    # 4.0f

    .line 429
    .line 430
    const v24, -0x401ae148    # -1.79f

    .line 431
    .line 432
    .line 433
    move-object/from16 v20, v2

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v25, -0x3f800000    # -4.0f

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    const v22, -0x3ff28f5c    # -2.21f

    .line 443
    .line 444
    .line 445
    const v23, -0x401ae148    # -1.79f

    .line 446
    .line 447
    .line 448
    const/high16 v24, -0x3f800000    # -4.0f

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, 0x40d947ae    # 6.79f

    .line 454
    .line 455
    .line 456
    const/high16 v6, 0x40a00000    # 5.0f

    .line 457
    .line 458
    const/high16 v7, 0x41100000    # 9.0f

    .line 459
    .line 460
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v25, 0x41100000    # 9.0f

    .line 464
    .line 465
    const/high16 v26, 0x41500000    # 13.0f

    .line 466
    .line 467
    const/high16 v21, 0x40a00000    # 5.0f

    .line 468
    .line 469
    const v22, 0x41335c29    # 11.21f

    .line 470
    .line 471
    .line 472
    const v23, 0x40d947ae    # 6.79f

    .line 473
    .line 474
    .line 475
    const/high16 v24, 0x41500000    # 13.0f

    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v4, 0x40e00000    # 7.0f

    .line 484
    .line 485
    const/high16 v6, 0x41100000    # 9.0f

    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v25, 0x40000000    # 2.0f

    .line 491
    .line 492
    const/high16 v26, 0x40000000    # 2.0f

    .line 493
    .line 494
    const v21, 0x3f8ccccd    # 1.1f

    .line 495
    .line 496
    .line 497
    const/16 v22, 0x0

    .line 498
    .line 499
    const/high16 v23, 0x40000000    # 2.0f

    .line 500
    .line 501
    const v24, 0x3f666666    # 0.9f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v25, -0x40000000    # -2.0f

    .line 508
    .line 509
    const/16 v21, 0x0

    .line 510
    .line 511
    const v22, 0x3f8ccccd    # 1.1f

    .line 512
    .line 513
    .line 514
    const v23, -0x4099999a    # -0.9f

    .line 515
    .line 516
    .line 517
    const/high16 v24, 0x40000000    # 2.0f

    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v4, -0x4099999a    # -0.9f

    .line 523
    .line 524
    .line 525
    const/high16 v6, -0x40000000    # -2.0f

    .line 526
    .line 527
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v25, 0x41100000    # 9.0f

    .line 531
    .line 532
    const/high16 v26, 0x40e00000    # 7.0f

    .line 533
    .line 534
    const/high16 v21, 0x40e00000    # 7.0f

    .line 535
    .line 536
    const v22, 0x40fccccd    # 7.9f

    .line 537
    .line 538
    .line 539
    const v23, 0x40fccccd    # 7.9f

    .line 540
    .line 541
    .line 542
    const/high16 v24, 0x40e00000    # 7.0f

    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/high16 v6, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const-string v4, ""

    .line 558
    .line 559
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 560
    .line 561
    .line 562
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 567
    .line 568
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 569
    .line 570
    .line 571
    move-result-wide v6

    .line 572
    const/4 v2, 0x0

    .line 573
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 581
    .line 582
    .line 583
    move-result v11

    .line 584
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 587
    .line 588
    .line 589
    const v4, 0x41763d71    # 15.39f

    .line 590
    .line 591
    .line 592
    const v6, 0x4178f5c3    # 15.56f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v26, 0x41600000    # 14.0f

    .line 599
    .line 600
    const v21, 0x415b5c29    # 13.71f

    .line 601
    .line 602
    .line 603
    const v22, 0x416b3333    # 14.7f

    .line 604
    .line 605
    .line 606
    const v23, 0x41387ae1    # 11.53f

    .line 607
    .line 608
    .line 609
    const/high16 v24, 0x41600000    # 14.0f

    .line 610
    .line 611
    move-object/from16 v20, v2

    .line 612
    .line 613
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v25, -0x3f33851f    # -6.39f

    .line 617
    .line 618
    .line 619
    const v26, 0x3fc7ae14    # 1.56f

    .line 620
    .line 621
    .line 622
    const v21, -0x3fde147b    # -2.53f

    .line 623
    .line 624
    .line 625
    const/16 v22, 0x0

    .line 626
    .line 627
    const v23, -0x3f6947ae    # -4.71f

    .line 628
    .line 629
    .line 630
    const v24, 0x3f333333    # 0.7f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v25, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const v26, 0x4191c28f    # 18.22f

    .line 639
    .line 640
    .line 641
    const v21, 0x3fce147b    # 1.61f

    .line 642
    .line 643
    .line 644
    const v22, 0x41808f5c    # 16.07f

    .line 645
    .line 646
    .line 647
    const/high16 v23, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const v24, 0x4188cccd    # 17.1f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, 0x41a80000    # 21.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, 0x41800000    # 16.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v4, -0x3fce147b    # -2.78f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v25, 0x41763d71    # 15.39f

    .line 672
    .line 673
    .line 674
    const v26, 0x4178f5c3    # 15.56f

    .line 675
    .line 676
    .line 677
    const/high16 v21, 0x41880000    # 17.0f

    .line 678
    .line 679
    const v22, 0x4188cccd    # 17.1f

    .line 680
    .line 681
    .line 682
    const v23, 0x41831eb8    # 16.39f

    .line 683
    .line 684
    .line 685
    const v24, 0x41808f5c    # 16.07f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v4, 0x41700000    # 15.0f

    .line 695
    .line 696
    const/high16 v6, 0x41980000    # 19.0f

    .line 697
    .line 698
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v4, 0x40400000    # 3.0f

    .line 702
    .line 703
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v4, -0x40b851ec    # -0.78f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v25, 0x3f051eb8    # 0.52f

    .line 713
    .line 714
    .line 715
    const v26, -0x409eb852    # -0.88f

    .line 716
    .line 717
    .line 718
    const/16 v21, 0x0

    .line 719
    .line 720
    const v22, -0x413d70a4    # -0.38f

    .line 721
    .line 722
    .line 723
    const v23, 0x3e4ccccd    # 0.2f

    .line 724
    .line 725
    .line 726
    const v24, -0x40c7ae14    # -0.72f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v25, 0x41100000    # 9.0f

    .line 733
    .line 734
    const/high16 v26, 0x41800000    # 16.0f

    .line 735
    .line 736
    const v21, 0x4096b852    # 4.71f

    .line 737
    .line 738
    .line 739
    const v22, 0x4185d70a    # 16.73f

    .line 740
    .line 741
    .line 742
    const v23, 0x40d428f6    # 6.63f

    .line 743
    .line 744
    .line 745
    const/high16 v24, 0x41800000    # 16.0f

    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v25, 0x40af5c29    # 5.48f

    .line 751
    .line 752
    .line 753
    const v26, 0x3fab851f    # 1.34f

    .line 754
    .line 755
    .line 756
    const v21, 0x4017ae14    # 2.37f

    .line 757
    .line 758
    .line 759
    const/16 v22, 0x0

    .line 760
    .line 761
    const v23, 0x408947ae    # 4.29f

    .line 762
    .line 763
    .line 764
    const v24, 0x3f3ae148    # 0.73f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v25, 0x41700000    # 15.0f

    .line 771
    .line 772
    const v26, 0x4191c28f    # 18.22f

    .line 773
    .line 774
    .line 775
    const v21, 0x416ccccd    # 14.8f

    .line 776
    .line 777
    .line 778
    const/high16 v22, 0x418c0000    # 17.5f

    .line 779
    .line 780
    const/high16 v23, 0x41700000    # 15.0f

    .line 781
    .line 782
    const v24, 0x418eb852    # 17.84f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v4, 0x41980000    # 19.0f

    .line 789
    .line 790
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    const/high16 v6, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const/4 v7, 0x0

    .line 803
    const-string v4, ""

    .line 804
    .line 805
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 806
    .line 807
    .line 808
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 813
    .line 814
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 815
    .line 816
    .line 817
    move-result-wide v6

    .line 818
    const/4 v0, 0x0

    .line 819
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 823
    .line 824
    .line 825
    move-result v10

    .line 826
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 827
    .line 828
    .line 829
    move-result v11

    .line 830
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 833
    .line 834
    .line 835
    const v0, 0x41b75c29    # 22.92f

    .line 836
    .line 837
    .line 838
    const v2, 0x40e1eb85    # 7.06f

    .line 839
    .line 840
    .line 841
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v0, -0x4028f5c3    # -1.68f

    .line 845
    .line 846
    .line 847
    const v2, -0x4027ae14    # -1.69f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/16 v17, 0x0

    .line 854
    .line 855
    const v18, 0x40e8a3d7    # 7.27f

    .line 856
    .line 857
    .line 858
    const v13, -0x3ffeb852    # -2.02f

    .line 859
    .line 860
    .line 861
    const v14, 0x400147ae    # 2.02f

    .line 862
    .line 863
    .line 864
    const v15, -0x3ffeb852    # -2.02f

    .line 865
    .line 866
    .line 867
    const v16, 0x40a23d71    # 5.07f

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, 0x3fd70a3d    # 1.68f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v17, 0x41b75c29    # 22.92f

    .line 880
    .line 881
    .line 882
    const v18, 0x40e1eb85    # 7.06f

    .line 883
    .line 884
    .line 885
    const v13, 0x41b0a3d7    # 22.08f

    .line 886
    .line 887
    .line 888
    const v14, 0x411c51ec    # 9.77f

    .line 889
    .line 890
    .line 891
    const v15, 0x41b0a3d7    # 22.08f

    .line 892
    .line 893
    .line 894
    const v16, 0x4103d70a    # 8.24f

    .line 895
    .line 896
    .line 897
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    const/16 v16, 0x3800

    .line 908
    .line 909
    const/16 v17, 0x0

    .line 910
    .line 911
    const/high16 v6, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/4 v7, 0x0

    .line 914
    const/high16 v12, 0x3f800000    # 1.0f

    .line 915
    .line 916
    const/4 v13, 0x0

    .line 917
    const/4 v14, 0x0

    .line 918
    const/4 v15, 0x0

    .line 919
    const-string v4, ""

    .line 920
    .line 921
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    sput-object v0, Landroidx/compose/material/icons/twotone/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 930
    .line 931
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    return-object v0
.end method
