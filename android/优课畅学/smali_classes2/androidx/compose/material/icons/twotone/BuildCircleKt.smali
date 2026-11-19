.class public final Landroidx/compose/material/icons/twotone/BuildCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuildCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BuildCircle"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x408d1eb8    # 4.41f

    .line 101
    .line 102
    .line 103
    const v23, 0x4065c28f    # 3.59f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, -0x3f000000    # -8.0f

    .line 112
    .line 113
    const v21, 0x408d1eb8    # 4.41f

    .line 114
    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    const/high16 v23, 0x41000000    # 8.0f

    .line 119
    .line 120
    const v24, -0x3f9a3d71    # -3.59f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x41400000    # 12.0f

    .line 127
    .line 128
    const/high16 v26, 0x40800000    # 4.0f

    .line 129
    .line 130
    const/high16 v21, 0x41a00000    # 20.0f

    .line 131
    .line 132
    const v22, 0x40f2e148    # 7.59f

    .line 133
    .line 134
    .line 135
    const v23, 0x418347ae    # 16.41f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x40800000    # 4.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/16 v16, 0x3800

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const v6, 0x3e99999a    # 0.3f

    .line 155
    .line 156
    .line 157
    const v8, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    const/high16 v9, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v12, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const-string v4, ""

    .line 169
    .line 170
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    const/4 v2, 0x0

    .line 184
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x40000000    # 2.0f

    .line 201
    .line 202
    const/high16 v6, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v25, 0x40000000    # 2.0f

    .line 208
    .line 209
    const/high16 v26, 0x41400000    # 12.0f

    .line 210
    .line 211
    const v21, 0x40cf5c29    # 6.48f

    .line 212
    .line 213
    .line 214
    const/high16 v22, 0x40000000    # 2.0f

    .line 215
    .line 216
    const/high16 v23, 0x40000000    # 2.0f

    .line 217
    .line 218
    const v24, 0x40cf5c29    # 6.48f

    .line 219
    .line 220
    .line 221
    move-object/from16 v20, v2

    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x41200000    # 10.0f

    .line 227
    .line 228
    const/high16 v26, 0x41200000    # 10.0f

    .line 229
    .line 230
    const/16 v21, 0x0

    .line 231
    .line 232
    const v22, 0x40b0a3d7    # 5.52f

    .line 233
    .line 234
    .line 235
    const v23, 0x408f5c29    # 4.48f

    .line 236
    .line 237
    .line 238
    const/high16 v24, 0x41200000    # 10.0f

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, -0x3f70a3d7    # -4.48f

    .line 244
    .line 245
    .line 246
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 247
    .line 248
    const/high16 v7, 0x41200000    # 10.0f

    .line 249
    .line 250
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41400000    # 12.0f

    .line 254
    .line 255
    const/high16 v26, 0x40000000    # 2.0f

    .line 256
    .line 257
    const/high16 v21, 0x41b00000    # 22.0f

    .line 258
    .line 259
    const v22, 0x40cf5c29    # 6.48f

    .line 260
    .line 261
    .line 262
    const v23, 0x418c28f6    # 17.52f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x40000000    # 2.0f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x41a00000    # 20.0f

    .line 274
    .line 275
    const/high16 v6, 0x41400000    # 12.0f

    .line 276
    .line 277
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, -0x3f000000    # -8.0f

    .line 281
    .line 282
    const/high16 v26, -0x3f000000    # -8.0f

    .line 283
    .line 284
    const v21, -0x3f72e148    # -4.41f

    .line 285
    .line 286
    .line 287
    const/16 v22, 0x0

    .line 288
    .line 289
    const/high16 v23, -0x3f000000    # -8.0f

    .line 290
    .line 291
    const v24, -0x3f9a3d71    # -3.59f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, 0x41000000    # 8.0f

    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const v22, -0x3f72e148    # -4.41f

    .line 302
    .line 303
    .line 304
    const v23, 0x4065c28f    # 3.59f

    .line 305
    .line 306
    .line 307
    const/high16 v24, -0x3f000000    # -8.0f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v26, 0x41000000    # 8.0f

    .line 313
    .line 314
    const v21, 0x408d1eb8    # 4.41f

    .line 315
    .line 316
    .line 317
    const/16 v22, 0x0

    .line 318
    .line 319
    const/high16 v23, 0x41000000    # 8.0f

    .line 320
    .line 321
    const v24, 0x4065c28f    # 3.59f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x41400000    # 12.0f

    .line 328
    .line 329
    const/high16 v26, 0x41a00000    # 20.0f

    .line 330
    .line 331
    const/high16 v21, 0x41a00000    # 20.0f

    .line 332
    .line 333
    const v22, 0x418347ae    # 16.41f

    .line 334
    .line 335
    .line 336
    const v23, 0x418347ae    # 16.41f

    .line 337
    .line 338
    .line 339
    const/high16 v24, 0x41a00000    # 20.0f

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const/high16 v6, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v8, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v7, 0x0

    .line 356
    const-string v4, ""

    .line 357
    .line 358
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 359
    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const v0, 0x414ae148    # 12.68f

    .line 389
    .line 390
    .line 391
    const v2, 0x40f851ec    # 7.76f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x3f7ccccd    # -4.1f

    .line 398
    .line 399
    .line 400
    const v18, -0x40e8f5c3    # -0.59f

    .line 401
    .line 402
    .line 403
    const v13, -0x4071eb85    # -1.11f

    .line 404
    .line 405
    .line 406
    const v14, -0x4071eb85    # -1.11f

    .line 407
    .line 408
    .line 409
    const v15, -0x3fcd70a4    # -2.79f

    .line 410
    .line 411
    .line 412
    const v16, -0x4059999a    # -1.3f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x40166666    # 2.35f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x404b851f    # -1.41f

    .line 425
    .line 426
    .line 427
    const v2, 0x3fb47ae1    # 1.41f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40e570a4    # 7.17f

    .line 434
    .line 435
    .line 436
    const v2, 0x410947ae    # 8.58f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3f170a3d    # 0.59f

    .line 443
    .line 444
    .line 445
    const v18, 0x40833333    # 4.1f

    .line 446
    .line 447
    .line 448
    const v13, -0x40ca3d71    # -0.71f

    .line 449
    .line 450
    .line 451
    const v14, 0x3fa8f5c3    # 1.32f

    .line 452
    .line 453
    .line 454
    const v15, -0x40fae148    # -0.52f

    .line 455
    .line 456
    .line 457
    const v16, 0x403f5c29    # 2.99f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x4067ae14    # 3.62f

    .line 464
    .line 465
    .line 466
    const v18, 0x3f4f5c29    # 0.81f

    .line 467
    .line 468
    .line 469
    const v13, 0x3f7ae148    # 0.98f

    .line 470
    .line 471
    .line 472
    const v14, 0x3f7ae148    # 0.98f

    .line 473
    .line 474
    .line 475
    const v15, 0x4019999a    # 2.4f

    .line 476
    .line 477
    .line 478
    const v16, 0x3f9eb852    # 1.24f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x405a3d71    # 3.41f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, 0x3f35c28f    # 0.71f

    .line 491
    .line 492
    .line 493
    const/16 v18, 0x0

    .line 494
    .line 495
    const v13, 0x3e4ccccd    # 0.2f

    .line 496
    .line 497
    .line 498
    const v14, 0x3e4ccccd    # 0.2f

    .line 499
    .line 500
    .line 501
    const v15, 0x3f028f5c    # 0.51f

    .line 502
    .line 503
    .line 504
    const v16, 0x3e4ccccd    # 0.2f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3fb33333    # 1.4f

    .line 511
    .line 512
    .line 513
    const v2, -0x404ccccd    # -1.4f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const v18, -0x40ca3d71    # -0.71f

    .line 522
    .line 523
    .line 524
    const v14, -0x41b33333    # -0.2f

    .line 525
    .line 526
    .line 527
    const v15, 0x3e4ccccd    # 0.2f

    .line 528
    .line 529
    .line 530
    const v16, -0x40fd70a4    # -0.51f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, -0x3fa5c28f    # -3.41f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x414ae148    # 12.68f

    .line 543
    .line 544
    .line 545
    const v18, 0x40f851ec    # 7.76f

    .line 546
    .line 547
    .line 548
    const v13, 0x415eb852    # 13.92f

    .line 549
    .line 550
    .line 551
    const v14, 0x41226666    # 10.15f

    .line 552
    .line 553
    .line 554
    const v15, 0x415a8f5c    # 13.66f

    .line 555
    .line 556
    .line 557
    const v16, 0x410bd70a    # 8.74f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/16 v16, 0x3800

    .line 571
    .line 572
    const/16 v17, 0x0

    .line 573
    .line 574
    const/high16 v6, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/4 v7, 0x0

    .line 577
    const/high16 v12, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const/4 v14, 0x0

    .line 581
    const/4 v15, 0x0

    .line 582
    const-string v4, ""

    .line 583
    .line 584
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    sput-object v0, Landroidx/compose/material/icons/twotone/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    return-object v0
.end method
