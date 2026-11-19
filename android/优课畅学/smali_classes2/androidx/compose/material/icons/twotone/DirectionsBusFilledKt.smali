.class public final Landroidx/compose/material/icons/twotone/DirectionsBusFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBusFilled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsBusFilledKt;->_directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsBusFilled"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f8ccccd    # 1.1f

    .line 84
    .line 85
    .line 86
    const v23, 0x3f666666    # 0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40000000    # 2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41000000    # 8.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v26, -0x40000000    # -2.0f

    .line 102
    .line 103
    const v21, 0x3f8ccccd    # 1.1f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x40000000    # 2.0f

    .line 109
    .line 110
    const v24, -0x4099999a    # -0.9f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41700000    # 15.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41780000    # 15.5f

    .line 135
    .line 136
    const/high16 v6, 0x41500000    # 13.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 142
    .line 143
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 144
    .line 145
    const v21, 0x3f547ae1    # 0.83f

    .line 146
    .line 147
    .line 148
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 149
    .line 150
    const v24, 0x3f2b851f    # 0.67f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x4182a3d7    # 16.33f

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41800000    # 16.0f

    .line 160
    .line 161
    const/high16 v7, 0x41780000    # 15.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x417547ae    # 15.33f

    .line 167
    .line 168
    .line 169
    const/high16 v6, 0x41600000    # 14.0f

    .line 170
    .line 171
    const/high16 v7, 0x41680000    # 14.5f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x416ab852    # 14.67f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x41780000    # 15.5f

    .line 180
    .line 181
    const/high16 v7, 0x41500000    # 13.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41080000    # 8.5f

    .line 190
    .line 191
    const/high16 v6, 0x41500000    # 13.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x411547ae    # 9.33f

    .line 200
    .line 201
    .line 202
    const/high16 v6, 0x41080000    # 8.5f

    .line 203
    .line 204
    const/high16 v7, 0x41800000    # 16.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x417547ae    # 15.33f

    .line 210
    .line 211
    .line 212
    const/high16 v6, 0x40e00000    # 7.0f

    .line 213
    .line 214
    const/high16 v7, 0x41680000    # 14.5f

    .line 215
    .line 216
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x40f570a4    # 7.67f

    .line 220
    .line 221
    .line 222
    const/high16 v6, 0x41080000    # 8.5f

    .line 223
    .line 224
    const/high16 v7, 0x41500000    # 13.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const/16 v16, 0x3800

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const v6, 0x3e99999a    # 0.3f

    .line 241
    .line 242
    .line 243
    const v8, 0x3e99999a    # 0.3f

    .line 244
    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const-string v4, ""

    .line 255
    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x40800000    # 4.0f

    .line 287
    .line 288
    const/high16 v6, 0x41400000    # 12.0f

    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v25, 0x40cdc28f    # 6.43f

    .line 294
    .line 295
    .line 296
    const/high16 v26, 0x40a00000    # 5.0f

    .line 297
    .line 298
    const v21, 0x4107ae14    # 8.48f

    .line 299
    .line 300
    .line 301
    const/high16 v22, 0x40800000    # 4.0f

    .line 302
    .line 303
    const v23, 0x40e0f5c3    # 7.03f

    .line 304
    .line 305
    .line 306
    const v24, 0x408f5c29    # 4.48f

    .line 307
    .line 308
    .line 309
    move-object/from16 v20, v2

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x4133d70a    # 11.24f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v25, 0x41400000    # 12.0f

    .line 321
    .line 322
    const/high16 v26, 0x40800000    # 4.0f

    .line 323
    .line 324
    const v21, 0x41890a3d    # 17.13f

    .line 325
    .line 326
    .line 327
    const v22, 0x408eb852    # 4.46f

    .line 328
    .line 329
    .line 330
    const v23, 0x417b5c29    # 15.71f

    .line 331
    .line 332
    .line 333
    const/high16 v24, 0x40800000    # 4.0f

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    const v6, 0x3e99999a    # 0.3f

    .line 346
    .line 347
    .line 348
    const/4 v7, 0x0

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/high16 v6, 0x41400000    # 12.0f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v25, 0x40800000    # 4.0f

    .line 389
    .line 390
    const/high16 v26, 0x40c00000    # 6.0f

    .line 391
    .line 392
    const/high16 v21, 0x41000000    # 8.0f

    .line 393
    .line 394
    const/high16 v22, 0x40000000    # 2.0f

    .line 395
    .line 396
    const/high16 v23, 0x40800000    # 4.0f

    .line 397
    .line 398
    const/high16 v24, 0x40200000    # 2.5f

    .line 399
    .line 400
    move-object/from16 v20, v2

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41180000    # 9.5f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const v26, 0x401c28f6    # 2.44f

    .line 413
    .line 414
    .line 415
    const/16 v21, 0x0

    .line 416
    .line 417
    const v22, 0x3f733333    # 0.95f

    .line 418
    .line 419
    .line 420
    const v23, 0x3ec28f5c    # 0.38f

    .line 421
    .line 422
    .line 423
    const v24, 0x3fe7ae14    # 1.81f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v4, 0x41a00000    # 20.0f

    .line 430
    .line 431
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v26, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const v22, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const v23, 0x3ee66666    # 0.45f

    .line 440
    .line 441
    .line 442
    const/high16 v24, 0x3f800000    # 1.0f

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x3f800000    # 1.0f

    .line 448
    .line 449
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v26, -0x40800000    # -1.0f

    .line 453
    .line 454
    const v21, 0x3f0ccccd    # 0.55f

    .line 455
    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    const/high16 v23, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const v24, -0x4119999a    # -0.45f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, -0x40800000    # -1.0f

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41000000    # 8.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x3f800000    # 1.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v26, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/16 v21, 0x0

    .line 485
    .line 486
    const v22, 0x3f0ccccd    # 0.55f

    .line 487
    .line 488
    .line 489
    const v23, 0x3ee66666    # 0.45f

    .line 490
    .line 491
    .line 492
    const/high16 v24, 0x3f800000    # 1.0f

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v26, -0x40800000    # -1.0f

    .line 501
    .line 502
    const v21, 0x3f0ccccd    # 0.55f

    .line 503
    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/high16 v23, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const v24, -0x4119999a    # -0.45f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v4, -0x3ffc28f6    # -2.06f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v26, -0x3fe3d70a    # -2.44f

    .line 522
    .line 523
    .line 524
    const v21, 0x3f1eb852    # 0.62f

    .line 525
    .line 526
    .line 527
    const v22, -0x40deb852    # -0.63f

    .line 528
    .line 529
    .line 530
    const v24, -0x404147ae    # -1.49f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x40c00000    # 6.0f

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v25, 0x41400000    # 12.0f

    .line 542
    .line 543
    const/high16 v26, 0x40000000    # 2.0f

    .line 544
    .line 545
    const/high16 v21, 0x41a00000    # 20.0f

    .line 546
    .line 547
    const/high16 v22, 0x40200000    # 2.5f

    .line 548
    .line 549
    const v23, 0x41835c29    # 16.42f

    .line 550
    .line 551
    .line 552
    const/high16 v24, 0x40000000    # 2.0f

    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v4, 0x40800000    # 4.0f

    .line 561
    .line 562
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v25, 0x40b570a4    # 5.67f

    .line 566
    .line 567
    .line 568
    const/high16 v26, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const v21, 0x406d70a4    # 3.71f

    .line 571
    .line 572
    .line 573
    const/16 v22, 0x0

    .line 574
    .line 575
    const v23, 0x40a428f6    # 5.13f

    .line 576
    .line 577
    .line 578
    const v24, 0x3eeb851f    # 0.46f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v4, 0x40cdc28f    # 6.43f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v25, 0x41400000    # 12.0f

    .line 591
    .line 592
    const/high16 v26, 0x40800000    # 4.0f

    .line 593
    .line 594
    const v21, 0x40e0f5c3    # 7.03f

    .line 595
    .line 596
    .line 597
    const v22, 0x408f5c29    # 4.48f

    .line 598
    .line 599
    .line 600
    const v23, 0x4107ae14    # 8.48f

    .line 601
    .line 602
    .line 603
    const/high16 v24, 0x40800000    # 4.0f

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x41900000    # 18.0f

    .line 612
    .line 613
    const/high16 v6, 0x41700000    # 15.0f

    .line 614
    .line 615
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v25, -0x40000000    # -2.0f

    .line 619
    .line 620
    const/high16 v26, 0x40000000    # 2.0f

    .line 621
    .line 622
    const/16 v21, 0x0

    .line 623
    .line 624
    const v22, 0x3f8ccccd    # 1.1f

    .line 625
    .line 626
    .line 627
    const v23, -0x4099999a    # -0.9f

    .line 628
    .line 629
    .line 630
    const/high16 v24, 0x40000000    # 2.0f

    .line 631
    .line 632
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v4, 0x41000000    # 8.0f

    .line 636
    .line 637
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v26, -0x40000000    # -2.0f

    .line 641
    .line 642
    const v21, -0x40733333    # -1.1f

    .line 643
    .line 644
    .line 645
    const/16 v22, 0x0

    .line 646
    .line 647
    const/high16 v23, -0x40000000    # -2.0f

    .line 648
    .line 649
    const v24, -0x4099999a    # -0.9f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, 0x41400000    # 12.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v4, 0x41700000    # 15.0f

    .line 666
    .line 667
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v4, 0x41200000    # 10.0f

    .line 674
    .line 675
    const/high16 v6, 0x41900000    # 18.0f

    .line 676
    .line 677
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v4, 0x40c00000    # 6.0f

    .line 681
    .line 682
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v4, 0x40e00000    # 7.0f

    .line 686
    .line 687
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41400000    # 12.0f

    .line 691
    .line 692
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, 0x41200000    # 10.0f

    .line 696
    .line 697
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/high16 v6, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/high16 v8, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v7, 0x0

    .line 712
    const-string v4, ""

    .line 713
    .line 714
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 715
    .line 716
    .line 717
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 722
    .line 723
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 724
    .line 725
    .line 726
    move-result-wide v6

    .line 727
    const/4 v2, 0x0

    .line 728
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 732
    .line 733
    .line 734
    move-result v10

    .line 735
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 736
    .line 737
    .line 738
    move-result v11

    .line 739
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 742
    .line 743
    .line 744
    const/high16 v4, 0x41080000    # 8.5f

    .line 745
    .line 746
    const/high16 v6, 0x41680000    # 14.5f

    .line 747
    .line 748
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/4 v4, 0x0

    .line 752
    const/high16 v6, -0x40400000    # -1.5f

    .line 753
    .line 754
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v26, 0x40400000    # 3.0f

    .line 758
    .line 759
    const/16 v27, 0x0

    .line 760
    .line 761
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 762
    .line 763
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 764
    .line 765
    const/16 v23, 0x0

    .line 766
    .line 767
    const/16 v24, 0x1

    .line 768
    .line 769
    const/16 v25, 0x1

    .line 770
    .line 771
    move-object/from16 v20, v2

    .line 772
    .line 773
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 777
    .line 778
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    const/high16 v6, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v7, 0x0

    .line 788
    const-string v4, ""

    .line 789
    .line 790
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 791
    .line 792
    .line 793
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 798
    .line 799
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 800
    .line 801
    .line 802
    move-result-wide v6

    .line 803
    const/4 v0, 0x0

    .line 804
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 808
    .line 809
    .line 810
    move-result v10

    .line 811
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 812
    .line 813
    .line 814
    move-result v11

    .line 815
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 818
    .line 819
    .line 820
    const/high16 v0, 0x41680000    # 14.5f

    .line 821
    .line 822
    const/high16 v2, 0x41780000    # 15.5f

    .line 823
    .line 824
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/4 v0, 0x0

    .line 828
    const/high16 v2, -0x40400000    # -1.5f

    .line 829
    .line 830
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v18, 0x40400000    # 3.0f

    .line 834
    .line 835
    const/16 v19, 0x0

    .line 836
    .line 837
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 838
    .line 839
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 840
    .line 841
    const/16 v16, 0x1

    .line 842
    .line 843
    const/16 v17, 0x1

    .line 844
    .line 845
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 849
    .line 850
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    const/16 v16, 0x3800

    .line 858
    .line 859
    const/16 v17, 0x0

    .line 860
    .line 861
    const/high16 v6, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/4 v7, 0x0

    .line 864
    const/high16 v12, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/4 v13, 0x0

    .line 867
    const/4 v14, 0x0

    .line 868
    const-string v4, ""

    .line 869
    .line 870
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsBusFilledKt;->_directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 879
    .line 880
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    return-object v0
.end method
