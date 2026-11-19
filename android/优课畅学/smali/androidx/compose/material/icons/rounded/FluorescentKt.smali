.class public final Landroidx/compose/material/icons/rounded/FluorescentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fluorescent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFluorescent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FluorescentKt;->_fluorescent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Fluorescent"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v26, -0x40000000    # -2.0f

    .line 85
    .line 86
    const v21, 0x3f8ccccd    # 1.1f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v24, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, -0x40000000    # -2.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, -0x40000000    # -2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, -0x40733333    # -1.1f

    .line 111
    .line 112
    .line 113
    const v23, -0x4099999a    # -0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, -0x40000000    # -2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40e00000    # 7.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, 0x40000000    # 2.0f

    .line 127
    .line 128
    const v21, -0x40733333    # -1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, -0x40000000    # -2.0f

    .line 134
    .line 135
    const v24, 0x3f666666    # 0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40000000    # 2.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x40e00000    # 7.0f

    .line 147
    .line 148
    const/high16 v26, 0x41700000    # 15.0f

    .line 149
    .line 150
    const/high16 v21, 0x40a00000    # 5.0f

    .line 151
    .line 152
    const v22, 0x4161999a    # 14.1f

    .line 153
    .line 154
    .line 155
    const v23, 0x40bccccd    # 5.9f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x41700000    # 15.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/high16 v6, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v8, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/high16 v9, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const-string v4, ""

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40000000    # 2.0f

    .line 219
    .line 220
    const/high16 v6, 0x41400000    # 12.0f

    .line 221
    .line 222
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, -0x40800000    # -1.0f

    .line 229
    .line 230
    const/high16 v26, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const v21, -0x40f0a3d7    # -0.56f

    .line 233
    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/high16 v23, -0x40800000    # -1.0f

    .line 238
    .line 239
    const v24, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    move-object/from16 v20, v2

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x40800000    # 4.0f

    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/16 v21, 0x0

    .line 255
    .line 256
    const v22, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const v23, 0x3ee66666    # 0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v24, 0x3f800000    # 1.0f

    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41400000    # 12.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v26, -0x40800000    # -1.0f

    .line 273
    .line 274
    const v21, 0x3f0ccccd    # 0.55f

    .line 275
    .line 276
    .line 277
    const/16 v22, 0x0

    .line 278
    .line 279
    const/high16 v23, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const v24, -0x4119999a    # -0.45f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x40400000    # 3.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x41400000    # 12.0f

    .line 293
    .line 294
    const/high16 v26, 0x40000000    # 2.0f

    .line 295
    .line 296
    const/high16 v21, 0x41500000    # 13.0f

    .line 297
    .line 298
    const v22, 0x401ccccd    # 2.45f

    .line 299
    .line 300
    .line 301
    const v23, 0x4148cccd    # 12.55f

    .line 302
    .line 303
    .line 304
    const/high16 v24, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v7, 0x0

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
    const v4, 0x40a9999a    # 5.3f

    .line 352
    .line 353
    .line 354
    const v6, 0x419e51ec    # 19.79f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v25, -0x404b851f    # -1.41f

    .line 364
    .line 365
    .line 366
    const/16 v26, 0x0

    .line 367
    .line 368
    const v21, -0x413851ec    # -0.39f

    .line 369
    .line 370
    .line 371
    const v22, -0x413851ec    # -0.39f

    .line 372
    .line 373
    .line 374
    const v23, -0x407d70a4    # -1.02f

    .line 375
    .line 376
    .line 377
    const v24, -0x413851ec    # -0.39f

    .line 378
    .line 379
    .line 380
    move-object/from16 v20, v2

    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v4, -0x413d70a4    # -0.38f

    .line 386
    .line 387
    .line 388
    const v6, 0x3ec28f5c    # 0.38f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/16 v25, 0x0

    .line 395
    .line 396
    const v26, 0x3fb47ae1    # 1.41f

    .line 397
    .line 398
    .line 399
    const v22, 0x3ec7ae14    # 0.39f

    .line 400
    .line 401
    .line 402
    const v23, -0x413851ec    # -0.39f

    .line 403
    .line 404
    .line 405
    const v24, 0x3f828f5c    # 1.02f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, 0x3fb47ae1    # 1.41f

    .line 416
    .line 417
    .line 418
    const/16 v26, 0x0

    .line 419
    .line 420
    const v21, 0x3ec7ae14    # 0.39f

    .line 421
    .line 422
    .line 423
    const v23, 0x3f828f5c    # 1.02f

    .line 424
    .line 425
    .line 426
    const v24, 0x3ec7ae14    # 0.39f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, -0x413d70a4    # -0.38f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v25, 0x419e51ec    # 19.79f

    .line 439
    .line 440
    .line 441
    const v26, 0x40a9999a    # 5.3f

    .line 442
    .line 443
    .line 444
    const v21, 0x41a170a4    # 20.18f

    .line 445
    .line 446
    .line 447
    const v22, 0x40ca8f5c    # 6.33f

    .line 448
    .line 449
    .line 450
    const v23, 0x41a170a4    # 20.18f

    .line 451
    .line 452
    .line 453
    const v24, 0x40b6147b    # 5.69f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const/high16 v6, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    const-string v4, ""

    .line 470
    .line 471
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 472
    .line 473
    .line 474
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 479
    .line 480
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 481
    .line 482
    .line 483
    move-result-wide v6

    .line 484
    const/4 v2, 0x0

    .line 485
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 489
    .line 490
    .line 491
    move-result v10

    .line 492
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 493
    .line 494
    .line 495
    move-result v11

    .line 496
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    const/high16 v4, 0x41b00000    # 22.0f

    .line 502
    .line 503
    const/high16 v6, 0x41400000    # 12.0f

    .line 504
    .line 505
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v25, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/high16 v26, -0x40800000    # -1.0f

    .line 514
    .line 515
    const v21, 0x3f0f5c29    # 0.56f

    .line 516
    .line 517
    .line 518
    const/16 v22, 0x0

    .line 519
    .line 520
    const/high16 v23, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const v24, -0x4119999a    # -0.45f

    .line 523
    .line 524
    .line 525
    move-object/from16 v20, v2

    .line 526
    .line 527
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, 0x41a00000    # 20.0f

    .line 531
    .line 532
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v25, -0x40800000    # -1.0f

    .line 536
    .line 537
    const/16 v21, 0x0

    .line 538
    .line 539
    const v22, -0x40f33333    # -0.55f

    .line 540
    .line 541
    .line 542
    const v23, -0x4119999a    # -0.45f

    .line 543
    .line 544
    .line 545
    const/high16 v24, -0x40800000    # -1.0f

    .line 546
    .line 547
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x41400000    # 12.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v26, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const v21, -0x40f33333    # -0.55f

    .line 558
    .line 559
    .line 560
    const/16 v22, 0x0

    .line 561
    .line 562
    const/high16 v23, -0x40800000    # -1.0f

    .line 563
    .line 564
    const v24, 0x3ee66666    # 0.45f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v4, 0x41a80000    # 21.0f

    .line 571
    .line 572
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v25, 0x41400000    # 12.0f

    .line 576
    .line 577
    const/high16 v26, 0x41b00000    # 22.0f

    .line 578
    .line 579
    const/high16 v21, 0x41300000    # 11.0f

    .line 580
    .line 581
    const v22, 0x41ac6666    # 21.55f

    .line 582
    .line 583
    .line 584
    const v23, 0x41373333    # 11.45f

    .line 585
    .line 586
    .line 587
    const/high16 v24, 0x41b00000    # 22.0f

    .line 588
    .line 589
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/high16 v6, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/4 v7, 0x0

    .line 602
    const-string v4, ""

    .line 603
    .line 604
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 605
    .line 606
    .line 607
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 612
    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 614
    .line 615
    .line 616
    move-result-wide v6

    .line 617
    const/4 v2, 0x0

    .line 618
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 622
    .line 623
    .line 624
    move-result v10

    .line 625
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 626
    .line 627
    .line 628
    move-result v11

    .line 629
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    const v4, 0x418feb85    # 17.99f

    .line 635
    .line 636
    .line 637
    const v6, 0x419347ae    # 18.41f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v4, 0x3ec7ae14    # 0.39f

    .line 644
    .line 645
    .line 646
    const v6, 0x3ec28f5c    # 0.38f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v25, 0x3fb47ae1    # 1.41f

    .line 653
    .line 654
    .line 655
    const/16 v26, 0x0

    .line 656
    .line 657
    const v21, 0x3ec7ae14    # 0.39f

    .line 658
    .line 659
    .line 660
    const v22, 0x3ec7ae14    # 0.39f

    .line 661
    .line 662
    .line 663
    const v23, 0x3f828f5c    # 1.02f

    .line 664
    .line 665
    .line 666
    const v24, 0x3ec7ae14    # 0.39f

    .line 667
    .line 668
    .line 669
    move-object/from16 v20, v2

    .line 670
    .line 671
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v4, 0x3c23d70a    # 0.01f

    .line 675
    .line 676
    .line 677
    const v6, -0x43dc28f6    # -0.01f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/16 v25, 0x0

    .line 684
    .line 685
    const v26, -0x404b851f    # -1.41f

    .line 686
    .line 687
    .line 688
    const v22, -0x413851ec    # -0.39f

    .line 689
    .line 690
    .line 691
    const v23, 0x3ec7ae14    # 0.39f

    .line 692
    .line 693
    .line 694
    const v24, -0x407d70a4    # -1.02f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x419b3333    # 19.4f

    .line 701
    .line 702
    .line 703
    const/high16 v6, 0x41880000    # 17.0f

    .line 704
    .line 705
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v25, -0x404b851f    # -1.41f

    .line 709
    .line 710
    .line 711
    const/16 v26, 0x0

    .line 712
    .line 713
    const v21, -0x413851ec    # -0.39f

    .line 714
    .line 715
    .line 716
    const v23, -0x407d70a4    # -1.02f

    .line 717
    .line 718
    .line 719
    const v24, -0x413851ec    # -0.39f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/4 v4, 0x0

    .line 726
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v25, 0x418feb85    # 17.99f

    .line 730
    .line 731
    .line 732
    const v26, 0x419347ae    # 18.41f

    .line 733
    .line 734
    .line 735
    const v21, 0x418ccccd    # 17.6f

    .line 736
    .line 737
    .line 738
    const v22, 0x418b3333    # 17.4f

    .line 739
    .line 740
    .line 741
    const v23, 0x418ccccd    # 17.6f

    .line 742
    .line 743
    .line 744
    const v24, 0x41903d71    # 18.03f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    const/high16 v6, 0x3f800000    # 1.0f

    .line 758
    .line 759
    const/4 v7, 0x0

    .line 760
    const-string v4, ""

    .line 761
    .line 762
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 763
    .line 764
    .line 765
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 770
    .line 771
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 772
    .line 773
    .line 774
    move-result-wide v6

    .line 775
    const/4 v2, 0x0

    .line 776
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 780
    .line 781
    .line 782
    move-result v10

    .line 783
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 784
    .line 785
    .line 786
    move-result v11

    .line 787
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 790
    .line 791
    .line 792
    const v4, 0x40b6147b    # 5.69f

    .line 793
    .line 794
    .line 795
    const/high16 v6, 0x40c00000    # 6.0f

    .line 796
    .line 797
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v4, 0x40b3851f    # 5.61f

    .line 801
    .line 802
    .line 803
    const v6, 0x40a9eb85    # 5.31f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v25, -0x404b851f    # -1.41f

    .line 810
    .line 811
    .line 812
    const/16 v26, 0x0

    .line 813
    .line 814
    const v21, -0x413851ec    # -0.39f

    .line 815
    .line 816
    .line 817
    const v22, -0x413851ec    # -0.39f

    .line 818
    .line 819
    .line 820
    const v23, -0x407d70a4    # -1.02f

    .line 821
    .line 822
    .line 823
    const v24, -0x413851ec    # -0.39f

    .line 824
    .line 825
    .line 826
    move-object/from16 v20, v2

    .line 827
    .line 828
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/4 v4, 0x0

    .line 832
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/16 v25, 0x0

    .line 836
    .line 837
    const v26, 0x3fb47ae1    # 1.41f

    .line 838
    .line 839
    .line 840
    const v22, 0x3ec7ae14    # 0.39f

    .line 841
    .line 842
    .line 843
    const v23, -0x413851ec    # -0.39f

    .line 844
    .line 845
    .line 846
    const v24, 0x3f828f5c    # 1.02f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v4, 0x4092e148    # 4.59f

    .line 853
    .line 854
    .line 855
    const v6, 0x40e33333    # 7.1f

    .line 856
    .line 857
    .line 858
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v25, 0x3fb47ae1    # 1.41f

    .line 862
    .line 863
    .line 864
    const/16 v26, 0x0

    .line 865
    .line 866
    const v21, 0x3ec7ae14    # 0.39f

    .line 867
    .line 868
    .line 869
    const v23, 0x3f828f5c    # 1.02f

    .line 870
    .line 871
    .line 872
    const v24, 0x3ec7ae14    # 0.39f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/4 v4, 0x0

    .line 879
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v25, 0x40c00000    # 6.0f

    .line 883
    .line 884
    const v26, 0x40b6147b    # 5.69f

    .line 885
    .line 886
    .line 887
    const v21, 0x40cc28f6    # 6.38f

    .line 888
    .line 889
    .line 890
    const v22, 0x40d6b852    # 6.71f

    .line 891
    .line 892
    .line 893
    const v23, 0x40cc28f6    # 6.38f

    .line 894
    .line 895
    .line 896
    const v24, 0x40c23d71    # 6.07f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    const/high16 v6, 0x3f800000    # 1.0f

    .line 910
    .line 911
    const/4 v7, 0x0

    .line 912
    const-string v4, ""

    .line 913
    .line 914
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 915
    .line 916
    .line 917
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 922
    .line 923
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 924
    .line 925
    .line 926
    move-result-wide v6

    .line 927
    const/4 v0, 0x0

    .line 928
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 932
    .line 933
    .line 934
    move-result v10

    .line 935
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 936
    .line 937
    .line 938
    move-result v11

    .line 939
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 942
    .line 943
    .line 944
    const v0, 0x419651ec    # 18.79f

    .line 945
    .line 946
    .line 947
    const v2, 0x40866666    # 4.2f

    .line 948
    .line 949
    .line 950
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v17, 0x3fb5c28f    # 1.42f

    .line 957
    .line 958
    .line 959
    const/16 v18, 0x0

    .line 960
    .line 961
    const v13, 0x3ec7ae14    # 0.39f

    .line 962
    .line 963
    .line 964
    const v14, 0x3ecccccd    # 0.4f

    .line 965
    .line 966
    .line 967
    const v15, 0x3f83d70a    # 1.03f

    .line 968
    .line 969
    .line 970
    const v16, 0x3ecccccd    # 0.4f

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v0, 0x41933333    # 18.4f

    .line 977
    .line 978
    .line 979
    const/high16 v2, 0x40c00000    # 6.0f

    .line 980
    .line 981
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/16 v17, 0x0

    .line 985
    .line 986
    const v18, -0x404b851f    # -1.41f

    .line 987
    .line 988
    .line 989
    const v14, -0x413851ec    # -0.39f

    .line 990
    .line 991
    .line 992
    const v15, 0x3ec7ae14    # 0.39f

    .line 993
    .line 994
    .line 995
    const v16, -0x407d70a4    # -1.02f

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/4 v0, 0x0

    .line 1002
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v17, -0x404b851f    # -1.41f

    .line 1006
    .line 1007
    .line 1008
    const/16 v18, 0x0

    .line 1009
    .line 1010
    const v13, -0x413851ec    # -0.39f

    .line 1011
    .line 1012
    .line 1013
    const v15, -0x407d70a4    # -1.02f

    .line 1014
    .line 1015
    .line 1016
    const v16, -0x413851ec    # -0.39f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x418b0a3d    # 17.38f

    .line 1023
    .line 1024
    .line 1025
    const v2, 0x40866666    # 4.2f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, 0x40866666    # 4.2f

    .line 1032
    .line 1033
    .line 1034
    const v18, 0x419651ec    # 18.79f

    .line 1035
    .line 1036
    .line 1037
    const v13, 0x4073d70a    # 3.81f

    .line 1038
    .line 1039
    .line 1040
    const v14, 0x418e28f6    # 17.77f

    .line 1041
    .line 1042
    .line 1043
    const v15, 0x4073d70a    # 3.81f

    .line 1044
    .line 1045
    .line 1046
    const v16, 0x41933333    # 18.4f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    const/16 v16, 0x3800

    .line 1060
    .line 1061
    const/16 v17, 0x0

    .line 1062
    .line 1063
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1064
    .line 1065
    const/4 v7, 0x0

    .line 1066
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1067
    .line 1068
    const/4 v13, 0x0

    .line 1069
    const/4 v14, 0x0

    .line 1070
    const/4 v15, 0x0

    .line 1071
    const-string v4, ""

    .line 1072
    .line 1073
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    sput-object v0, Landroidx/compose/material/icons/rounded/FluorescentKt;->_fluorescent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1082
    .line 1083
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    return-object v0
.end method
