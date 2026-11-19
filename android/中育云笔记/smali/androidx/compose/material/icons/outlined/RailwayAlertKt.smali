.class public final Landroidx/compose/material/icons/outlined/RailwayAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRailwayAlert(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RailwayAlertKt;->_railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.RailwayAlert"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40400000    # -1.5f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 88
    .line 89
    const/high16 v22, 0x3fc00000    # 1.5f

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
    const/high16 v26, -0x3fc00000    # -3.0f

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 160
    .line 161
    const/high16 v6, 0x40800000    # 4.0f

    .line 162
    .line 163
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41000000    # 8.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x40e947ae    # 7.29f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v25, 0x41300000    # 11.0f

    .line 178
    .line 179
    const/high16 v26, 0x40c00000    # 6.0f

    .line 180
    .line 181
    const v21, 0x4131999a    # 11.1f

    .line 182
    .line 183
    .line 184
    const v22, 0x40ebd70a    # 7.37f

    .line 185
    .line 186
    .line 187
    const/high16 v23, 0x41300000    # 11.0f

    .line 188
    .line 189
    const v24, 0x40d66666    # 6.7f

    .line 190
    .line 191
    .line 192
    move-object/from16 v20, v2

    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x408dc28f    # 4.43f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v25, 0x40d4cccd    # 6.65f

    .line 204
    .line 205
    .line 206
    const v26, -0x40851eb8    # -0.98f

    .line 207
    .line 208
    .line 209
    const v21, 0x3f666666    # 0.9f

    .line 210
    .line 211
    .line 212
    const v22, -0x40bae148    # -0.77f

    .line 213
    .line 214
    .line 215
    const v23, 0x4051eb85    # 3.28f

    .line 216
    .line 217
    .line 218
    const v24, -0x4075c28f    # -1.08f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x3f170a3d    # 0.59f

    .line 225
    .line 226
    .line 227
    const v26, -0x400147ae    # -1.99f

    .line 228
    .line 229
    .line 230
    const v21, 0x3dcccccd    # 0.1f

    .line 231
    .line 232
    .line 233
    const v22, -0x40cccccd    # -0.7f

    .line 234
    .line 235
    .line 236
    const v23, 0x3e99999a    # 0.3f

    .line 237
    .line 238
    .line 239
    const v24, -0x4050a3d7    # -1.37f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x40000000    # 2.0f

    .line 246
    .line 247
    const/high16 v26, 0x40e00000    # 7.0f

    .line 248
    .line 249
    const v21, 0x403e147b    # 2.97f

    .line 250
    .line 251
    .line 252
    const v22, 0x402ae148    # 2.67f

    .line 253
    .line 254
    .line 255
    const/high16 v23, 0x40000000    # 2.0f

    .line 256
    .line 257
    const v24, 0x40a0a3d7    # 5.02f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41180000    # 9.5f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x40b00000    # 5.5f

    .line 269
    .line 270
    const/high16 v26, 0x41a00000    # 20.0f

    .line 271
    .line 272
    const/high16 v21, 0x40000000    # 2.0f

    .line 273
    .line 274
    const v22, 0x419370a4    # 18.43f

    .line 275
    .line 276
    .line 277
    const v23, 0x40647ae1    # 3.57f

    .line 278
    .line 279
    .line 280
    const/high16 v24, 0x41a00000    # 20.0f

    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41a80000    # 21.0f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x3f800000    # 1.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41400000    # 12.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, -0x40800000    # -1.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, -0x40400000    # -1.5f

    .line 306
    .line 307
    const/high16 v6, -0x40800000    # -1.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, 0x40600000    # 3.5f

    .line 313
    .line 314
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 315
    .line 316
    const v21, 0x3ff70a3d    # 1.93f

    .line 317
    .line 318
    .line 319
    const/16 v22, 0x0

    .line 320
    .line 321
    const/high16 v23, 0x40600000    # 3.5f

    .line 322
    .line 323
    const v24, -0x40370a3d    # -1.57f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41500000    # 13.0f

    .line 330
    .line 331
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, -0x3f63851f    # -4.89f

    .line 335
    .line 336
    .line 337
    const/high16 v26, -0x40000000    # -2.0f

    .line 338
    .line 339
    const v21, -0x400b851f    # -1.91f

    .line 340
    .line 341
    .line 342
    const v23, -0x3f97ae14    # -3.63f

    .line 343
    .line 344
    .line 345
    const v24, -0x40bd70a4    # -0.76f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x40800000    # 4.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, 0x41800000    # 16.0f

    .line 360
    .line 361
    const/high16 v6, 0x41840000    # 16.5f

    .line 362
    .line 363
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, -0x40400000    # -1.5f

    .line 367
    .line 368
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 369
    .line 370
    const/16 v21, 0x0

    .line 371
    .line 372
    const v22, 0x3f547ae1    # 0.83f

    .line 373
    .line 374
    .line 375
    const v23, -0x40d47ae1    # -0.67f

    .line 376
    .line 377
    .line 378
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 384
    .line 385
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v25, 0x40800000    # 4.0f

    .line 389
    .line 390
    const/high16 v26, 0x41840000    # 16.5f

    .line 391
    .line 392
    const v21, 0x409570a4    # 4.67f

    .line 393
    .line 394
    .line 395
    const/high16 v22, 0x41900000    # 18.0f

    .line 396
    .line 397
    const/high16 v23, 0x40800000    # 4.0f

    .line 398
    .line 399
    const v24, 0x418aa3d7    # 17.33f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41500000    # 13.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41400000    # 12.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v4, 0x41840000    # 16.5f

    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const/high16 v6, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v7, 0x0

    .line 430
    const-string v4, ""

    .line 431
    .line 432
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 433
    .line 434
    .line 435
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 442
    .line 443
    .line 444
    move-result-wide v6

    .line 445
    const/4 v0, 0x0

    .line 446
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 450
    .line 451
    .line 452
    move-result v10

    .line 453
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 454
    .line 455
    .line 456
    move-result v11

    .line 457
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41900000    # 18.0f

    .line 463
    .line 464
    const/high16 v2, 0x3f800000    # 1.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x3f600000    # -5.0f

    .line 470
    .line 471
    const/high16 v18, 0x40a00000    # 5.0f

    .line 472
    .line 473
    const v13, -0x3fcf5c29    # -2.76f

    .line 474
    .line 475
    .line 476
    const/high16 v15, -0x3f600000    # -5.0f

    .line 477
    .line 478
    const v16, 0x400f5c29    # 2.24f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x400f5c29    # 2.24f

    .line 485
    .line 486
    .line 487
    const/high16 v2, 0x40a00000    # 5.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x3ff0a3d7    # -2.24f

    .line 493
    .line 494
    .line 495
    const/high16 v2, -0x3f600000    # -5.0f

    .line 496
    .line 497
    const/high16 v4, 0x40a00000    # 5.0f

    .line 498
    .line 499
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x41a6147b    # 20.76f

    .line 503
    .line 504
    .line 505
    const/high16 v2, 0x41900000    # 18.0f

    .line 506
    .line 507
    const/high16 v4, 0x3f800000    # 1.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41100000    # 9.0f

    .line 516
    .line 517
    const/high16 v2, 0x41940000    # 18.5f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, -0x40800000    # -1.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41000000    # 8.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x3f800000    # 1.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x41100000    # 9.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, 0x40e00000    # 7.0f

    .line 546
    .line 547
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, -0x40800000    # -1.0f

    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x40400000    # 3.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x3f800000    # 1.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x40e00000    # 7.0f

    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const/16 v16, 0x3800

    .line 578
    .line 579
    const/16 v17, 0x0

    .line 580
    .line 581
    const/high16 v6, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    const/high16 v12, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v13, 0x0

    .line 587
    const/4 v15, 0x0

    .line 588
    const-string v4, ""

    .line 589
    .line 590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    sput-object v0, Landroidx/compose/material/icons/outlined/RailwayAlertKt;->_railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 599
    .line 600
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-object v0
.end method
