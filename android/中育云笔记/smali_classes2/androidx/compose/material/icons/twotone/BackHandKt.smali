.class public final Landroidx/compose/material/icons/twotone/BackHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _backHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBackHand(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BackHand"

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
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x4053d70a    # 3.31f

    .line 84
    .line 85
    .line 86
    const v23, -0x3fd3d70a    # -2.69f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40c00000    # 6.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x3f42e148    # -5.91f

    .line 101
    .line 102
    .line 103
    const v26, -0x3f7fae14    # -4.01f

    .line 104
    .line 105
    .line 106
    const v21, -0x3fd8f5c3    # -2.61f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const v23, -0x3f61999a    # -4.95f

    .line 112
    .line 113
    .line 114
    const v24, -0x40347ae1    # -1.59f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x3f2eb852    # -6.54f

    .line 121
    .line 122
    .line 123
    const v6, -0x3fd9999a    # -2.6f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, 0x3e0f5c29    # 0.14f

    .line 130
    .line 131
    .line 132
    const v6, 0x3f07ae14    # 0.53f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const v26, 0x3f666666    # 0.9f

    .line 141
    .line 142
    .line 143
    const v21, 0x3eeb851f    # 0.46f

    .line 144
    .line 145
    .line 146
    const v22, 0x3df5c28f    # 0.12f

    .line 147
    .line 148
    .line 149
    const v23, 0x3f547ae1    # 0.83f

    .line 150
    .line 151
    .line 152
    const v24, 0x3eeb851f    # 0.46f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41700000    # 15.0f

    .line 159
    .line 160
    const/high16 v6, 0x40e00000    # 7.0f

    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x40900000    # 4.5f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v25, 0x41180000    # 9.5f

    .line 176
    .line 177
    const/high16 v26, 0x40800000    # 4.0f

    .line 178
    .line 179
    const/high16 v21, 0x41100000    # 9.0f

    .line 180
    .line 181
    const v22, 0x40870a3d    # 4.22f

    .line 182
    .line 183
    .line 184
    const v23, 0x4113851f    # 9.22f

    .line 185
    .line 186
    .line 187
    const/high16 v24, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x40870a3d    # 4.22f

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41200000    # 10.0f

    .line 196
    .line 197
    const/high16 v7, 0x40900000    # 4.5f

    .line 198
    .line 199
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x40000000    # 2.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40200000    # 2.5f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x41480000    # 12.5f

    .line 218
    .line 219
    const/high16 v26, 0x40000000    # 2.0f

    .line 220
    .line 221
    const/high16 v21, 0x41400000    # 12.0f

    .line 222
    .line 223
    const v22, 0x400e147b    # 2.22f

    .line 224
    .line 225
    .line 226
    const v23, 0x4143851f    # 12.22f

    .line 227
    .line 228
    .line 229
    const/high16 v24, 0x40000000    # 2.0f

    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x400e147b    # 2.22f

    .line 235
    .line 236
    .line 237
    const/high16 v6, 0x41500000    # 13.0f

    .line 238
    .line 239
    const/high16 v7, 0x40200000    # 2.5f

    .line 240
    .line 241
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41400000    # 12.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40800000    # 4.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, 0x3f000000    # 0.5f

    .line 260
    .line 261
    const/high16 v26, -0x41000000    # -0.5f

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    const v22, -0x4170a3d7    # -0.28f

    .line 266
    .line 267
    .line 268
    const v23, 0x3e6147ae    # 0.22f

    .line 269
    .line 270
    .line 271
    const/high16 v24, -0x41000000    # -0.5f

    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x406e147b    # 3.72f

    .line 277
    .line 278
    .line 279
    const/high16 v6, 0x40800000    # 4.0f

    .line 280
    .line 281
    const/high16 v7, 0x41800000    # 16.0f

    .line 282
    .line 283
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x41000000    # 8.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x40000000    # 2.0f

    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x40e00000    # 7.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v4, 0x40d70a3d    # 6.72f

    .line 305
    .line 306
    .line 307
    const/high16 v6, 0x40e00000    # 7.0f

    .line 308
    .line 309
    const/high16 v7, 0x41980000    # 19.0f

    .line 310
    .line 311
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x41800000    # 16.0f

    .line 315
    .line 316
    const/high16 v6, 0x41980000    # 19.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    const/16 v16, 0x3800

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v6, 0x3e99999a    # 0.3f

    .line 333
    .line 334
    .line 335
    const v8, 0x3e99999a    # 0.3f

    .line 336
    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const/high16 v9, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v12, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const/4 v15, 0x0

    .line 346
    const-string v4, ""

    .line 347
    .line 348
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    const/4 v0, 0x0

    .line 362
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41a80000    # 21.0f

    .line 379
    .line 380
    const/high16 v2, 0x40e00000    # 7.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 386
    .line 387
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 388
    .line 389
    const v14, -0x404f5c29    # -1.38f

    .line 390
    .line 391
    .line 392
    const v15, -0x4070a3d7    # -1.12f

    .line 393
    .line 394
    .line 395
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, -0x41000000    # -0.5f

    .line 401
    .line 402
    const v18, 0x3d4ccccd    # 0.05f

    .line 403
    .line 404
    .line 405
    const v13, -0x41d1eb85    # -0.17f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, -0x4151eb85    # -0.34f

    .line 410
    .line 411
    .line 412
    const v16, 0x3ca3d70a    # 0.02f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40800000    # 4.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 424
    .line 425
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, -0x404f5c29    # -1.38f

    .line 429
    .line 430
    .line 431
    const v15, -0x4070a3d7    # -1.12f

    .line 432
    .line 433
    .line 434
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x40d47ae1    # -0.67f

    .line 440
    .line 441
    .line 442
    const v18, 0x3db851ec    # 0.09f

    .line 443
    .line 444
    .line 445
    const v13, -0x41947ae1    # -0.23f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x41147ae1    # -0.46f

    .line 450
    .line 451
    .line 452
    const v16, 0x3cf5c28f    # 0.03f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x41480000    # 12.5f

    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    const v13, 0x41675c29    # 14.46f

    .line 463
    .line 464
    .line 465
    const v14, 0x3f28f5c3    # 0.66f

    .line 466
    .line 467
    .line 468
    const v15, 0x4158f5c3    # 13.56f

    .line 469
    .line 470
    .line 471
    const/16 v16, 0x0

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, -0x3fe28f5c    # -2.46f

    .line 477
    .line 478
    .line 479
    const v18, 0x4003d70a    # 2.06f

    .line 480
    .line 481
    .line 482
    const v13, -0x40628f5c    # -1.23f

    .line 483
    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    const/high16 v15, -0x3ff00000    # -2.25f

    .line 487
    .line 488
    const v16, 0x3f63d70a    # 0.89f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x41180000    # 9.5f

    .line 495
    .line 496
    const/high16 v18, 0x40000000    # 2.0f

    .line 497
    .line 498
    const v13, 0x411deb85    # 9.87f

    .line 499
    .line 500
    .line 501
    const v14, 0x400147ae    # 2.02f

    .line 502
    .line 503
    .line 504
    const v15, 0x411b0a3d    # 9.69f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x40000000    # 2.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x40e00000    # 7.0f

    .line 513
    .line 514
    const/high16 v18, 0x40900000    # 4.5f

    .line 515
    .line 516
    const v13, 0x4101eb85    # 8.12f

    .line 517
    .line 518
    .line 519
    const/high16 v14, 0x40000000    # 2.0f

    .line 520
    .line 521
    const/high16 v15, 0x40e00000    # 7.0f

    .line 522
    .line 523
    const v16, 0x4047ae14    # 3.12f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x40bc7ae1    # 5.89f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x4063d70a    # -1.22f

    .line 536
    .line 537
    .line 538
    const v18, -0x40d70a3d    # -0.66f

    .line 539
    .line 540
    .line 541
    const v13, -0x4151eb85    # -0.34f

    .line 542
    .line 543
    .line 544
    const v14, -0x416147ae    # -0.31f

    .line 545
    .line 546
    .line 547
    const v15, -0x40bd70a4    # -0.76f

    .line 548
    .line 549
    .line 550
    const v16, -0x40f5c28f    # -0.54f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x40a051ec    # 5.01f

    .line 557
    .line 558
    .line 559
    const v2, 0x411851ec    # 9.52f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, -0x3ff3d70a    # -2.19f

    .line 566
    .line 567
    .line 568
    const v18, 0x3f547ae1    # 0.83f

    .line 569
    .line 570
    .line 571
    const v13, -0x40ab851f    # -0.83f

    .line 572
    .line 573
    .line 574
    const v14, -0x41947ae1    # -0.23f

    .line 575
    .line 576
    .line 577
    const v15, -0x40266666    # -1.7f

    .line 578
    .line 579
    .line 580
    const v16, 0x3db851ec    # 0.09f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, -0x41e66666    # -0.15f

    .line 587
    .line 588
    .line 589
    const v18, 0x3ff9999a    # 1.95f

    .line 590
    .line 591
    .line 592
    const v13, -0x413d70a4    # -0.38f

    .line 593
    .line 594
    .line 595
    const v14, 0x3f11eb85    # 0.57f

    .line 596
    .line 597
    .line 598
    const v15, -0x41333333    # -0.4f

    .line 599
    .line 600
    .line 601
    const v16, 0x3fa7ae14    # 1.31f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x4023d70a    # 2.56f

    .line 608
    .line 609
    .line 610
    const v2, 0x40cdc28f    # 6.43f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v17, 0x41500000    # 13.0f

    .line 617
    .line 618
    const/high16 v18, 0x41c00000    # 24.0f

    .line 619
    .line 620
    const v13, 0x40cfae14    # 6.49f

    .line 621
    .line 622
    .line 623
    const v14, 0x41af47ae    # 21.91f

    .line 624
    .line 625
    .line 626
    const v15, 0x41191eb8    # 9.57f

    .line 627
    .line 628
    .line 629
    const/high16 v16, 0x41c00000    # 24.0f

    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/4 v0, 0x0

    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, 0x41000000    # 8.0f

    .line 639
    .line 640
    const/high16 v18, -0x3f000000    # -8.0f

    .line 641
    .line 642
    const v13, 0x408d70a4    # 4.42f

    .line 643
    .line 644
    .line 645
    const/4 v14, 0x0

    .line 646
    const/high16 v15, 0x41000000    # 8.0f

    .line 647
    .line 648
    const v16, -0x3f9ae148    # -3.58f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v0, 0x40e00000    # 7.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x41800000    # 16.0f

    .line 663
    .line 664
    const/high16 v2, 0x41980000    # 19.0f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v17, -0x3f400000    # -6.0f

    .line 670
    .line 671
    const/high16 v18, 0x40c00000    # 6.0f

    .line 672
    .line 673
    const/4 v13, 0x0

    .line 674
    const v14, 0x4053d70a    # 3.31f

    .line 675
    .line 676
    .line 677
    const v15, -0x3fd3d70a    # -2.69f

    .line 678
    .line 679
    .line 680
    const/high16 v16, 0x40c00000    # 6.0f

    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/4 v0, 0x0

    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x3f42e148    # -5.91f

    .line 690
    .line 691
    .line 692
    const v18, -0x3f7fae14    # -4.01f

    .line 693
    .line 694
    .line 695
    const v13, -0x3fd8f5c3    # -2.61f

    .line 696
    .line 697
    .line 698
    const/4 v14, 0x0

    .line 699
    const v15, -0x3f61999a    # -4.95f

    .line 700
    .line 701
    .line 702
    const v16, -0x40347ae1    # -1.59f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, -0x3f2eb852    # -6.54f

    .line 709
    .line 710
    .line 711
    const v2, -0x3fd9999a    # -2.6f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3e0f5c29    # 0.14f

    .line 718
    .line 719
    .line 720
    const v2, 0x3f07ae14    # 0.53f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v17, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const v18, 0x3f666666    # 0.9f

    .line 729
    .line 730
    .line 731
    const v13, 0x3eeb851f    # 0.46f

    .line 732
    .line 733
    .line 734
    const v14, 0x3df5c28f    # 0.12f

    .line 735
    .line 736
    .line 737
    const v15, 0x3f547ae1    # 0.83f

    .line 738
    .line 739
    .line 740
    const v16, 0x3eeb851f    # 0.46f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v0, 0x41700000    # 15.0f

    .line 747
    .line 748
    const/high16 v2, 0x40e00000    # 7.0f

    .line 749
    .line 750
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x40000000    # 2.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v0, 0x40900000    # 4.5f

    .line 759
    .line 760
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x41180000    # 9.5f

    .line 764
    .line 765
    const/high16 v18, 0x40800000    # 4.0f

    .line 766
    .line 767
    const/high16 v13, 0x41100000    # 9.0f

    .line 768
    .line 769
    const v14, 0x40870a3d    # 4.22f

    .line 770
    .line 771
    .line 772
    const v15, 0x4113851f    # 9.22f

    .line 773
    .line 774
    .line 775
    const/high16 v16, 0x40800000    # 4.0f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x40870a3d    # 4.22f

    .line 781
    .line 782
    .line 783
    const/high16 v2, 0x41200000    # 10.0f

    .line 784
    .line 785
    const/high16 v4, 0x40900000    # 4.5f

    .line 786
    .line 787
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v0, 0x41400000    # 12.0f

    .line 791
    .line 792
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v0, 0x40000000    # 2.0f

    .line 796
    .line 797
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x40200000    # 2.5f

    .line 801
    .line 802
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v17, 0x41480000    # 12.5f

    .line 806
    .line 807
    const/high16 v18, 0x40000000    # 2.0f

    .line 808
    .line 809
    const/high16 v13, 0x41400000    # 12.0f

    .line 810
    .line 811
    const v14, 0x400e147b    # 2.22f

    .line 812
    .line 813
    .line 814
    const v15, 0x4143851f    # 12.22f

    .line 815
    .line 816
    .line 817
    const/high16 v16, 0x40000000    # 2.0f

    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x400e147b    # 2.22f

    .line 823
    .line 824
    .line 825
    const/high16 v2, 0x41500000    # 13.0f

    .line 826
    .line 827
    const/high16 v4, 0x40200000    # 2.5f

    .line 828
    .line 829
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v0, 0x41400000    # 12.0f

    .line 833
    .line 834
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v0, 0x40000000    # 2.0f

    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v0, 0x40800000    # 4.0f

    .line 843
    .line 844
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v17, 0x3f000000    # 0.5f

    .line 848
    .line 849
    const/high16 v18, -0x41000000    # -0.5f

    .line 850
    .line 851
    const/4 v13, 0x0

    .line 852
    const v14, -0x4170a3d7    # -0.28f

    .line 853
    .line 854
    .line 855
    const v15, 0x3e6147ae    # 0.22f

    .line 856
    .line 857
    .line 858
    const/high16 v16, -0x41000000    # -0.5f

    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v0, 0x406e147b    # 3.72f

    .line 864
    .line 865
    .line 866
    const/high16 v2, 0x40800000    # 4.0f

    .line 867
    .line 868
    const/high16 v4, 0x41800000    # 16.0f

    .line 869
    .line 870
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v0, 0x41000000    # 8.0f

    .line 874
    .line 875
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v0, 0x40000000    # 2.0f

    .line 879
    .line 880
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v0, 0x40e00000    # 7.0f

    .line 884
    .line 885
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x40d70a3d    # 6.72f

    .line 892
    .line 893
    .line 894
    const/high16 v2, 0x40e00000    # 7.0f

    .line 895
    .line 896
    const/high16 v4, 0x41980000    # 19.0f

    .line 897
    .line 898
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v0, 0x41800000    # 16.0f

    .line 902
    .line 903
    const/high16 v2, 0x41980000    # 19.0f

    .line 904
    .line 905
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    const/16 v16, 0x3800

    .line 916
    .line 917
    const/16 v17, 0x0

    .line 918
    .line 919
    const/high16 v6, 0x3f800000    # 1.0f

    .line 920
    .line 921
    const/high16 v8, 0x3f800000    # 1.0f

    .line 922
    .line 923
    const/4 v7, 0x0

    .line 924
    const/high16 v12, 0x3f800000    # 1.0f

    .line 925
    .line 926
    const/4 v14, 0x0

    .line 927
    const/4 v15, 0x0

    .line 928
    const-string v4, ""

    .line 929
    .line 930
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    sput-object v0, Landroidx/compose/material/icons/twotone/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 939
    .line 940
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    return-object v0
.end method
