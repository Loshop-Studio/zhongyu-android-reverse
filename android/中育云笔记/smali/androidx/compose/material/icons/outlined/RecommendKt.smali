.class public final Landroidx/compose/material/icons/outlined/RecommendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _recommend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRecommend(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RecommendKt;->_recommend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Recommend"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x408f5c29    # 4.48f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41200000    # 10.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f70a3d7    # -4.48f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 108
    .line 109
    const/high16 v7, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x418c28f6    # 17.52f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40000000    # 2.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41a00000    # 20.0f

    .line 128
    .line 129
    const/high16 v6, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const/high16 v26, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const v21, -0x3f72e148    # -4.41f

    .line 139
    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const/high16 v23, -0x3f000000    # -8.0f

    .line 144
    .line 145
    const v24, -0x3f9a3d71    # -3.59f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x3f000000    # -8.0f

    .line 152
    .line 153
    const v6, 0x4065c28f    # 3.59f

    .line 154
    .line 155
    .line 156
    const/high16 v7, 0x41000000    # 8.0f

    .line 157
    .line 158
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x4065c28f    # 3.59f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x41000000    # 8.0f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x418347ae    # 16.41f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x41a00000    # 20.0f

    .line 173
    .line 174
    const/high16 v7, 0x41400000    # 12.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/16 v16, 0x3800

    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const/high16 v6, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v8, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    const/high16 v9, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/high16 v12, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    const-string v4, ""

    .line 203
    .line 204
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 214
    .line 215
    .line 216
    move-result-wide v6

    .line 217
    const/4 v0, 0x0

    .line 218
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41880000    # 17.0f

    .line 235
    .line 236
    const/high16 v2, 0x41200000    # 10.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x3f6d1eb8    # -4.59f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x3f147ae1    # 0.58f

    .line 248
    .line 249
    .line 250
    const v2, -0x3fa5c28f    # -3.41f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x41b33333    # -0.2f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, -0x41666666    # -0.3f

    .line 263
    .line 264
    .line 265
    const v18, -0x40cccccd    # -0.7f

    .line 266
    .line 267
    .line 268
    const v13, -0x43dc28f6    # -0.01f

    .line 269
    .line 270
    .line 271
    const v14, -0x417ae148    # -0.26f

    .line 272
    .line 273
    .line 274
    const v15, -0x420a3d71    # -0.12f

    .line 275
    .line 276
    .line 277
    const v16, -0x40fd70a4    # -0.51f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40a00000    # 5.0f

    .line 284
    .line 285
    const/high16 v2, 0x41400000    # 12.0f

    .line 286
    .line 287
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x3f6ccccd    # -4.6f

    .line 291
    .line 292
    .line 293
    const/high16 v2, 0x40a00000    # 5.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x41333333    # -0.4f

    .line 299
    .line 300
    .line 301
    const/high16 v18, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const v13, -0x4175c28f    # -0.27f

    .line 304
    .line 305
    .line 306
    const v14, 0x3e851eb8    # 0.26f

    .line 307
    .line 308
    .line 309
    const v15, -0x4128f5c3    # -0.42f

    .line 310
    .line 311
    .line 312
    const v16, 0x3f1eb852    # 0.62f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40a00000    # 5.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40000000    # 2.0f

    .line 324
    .line 325
    const/high16 v18, 0x40000000    # 2.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, 0x3f8ccccd    # 1.1f

    .line 329
    .line 330
    .line 331
    const v15, 0x3f666666    # 0.9f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x40000000    # 2.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x40b00000    # 5.5f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3fa66666    # 1.3f

    .line 345
    .line 346
    .line 347
    const v18, -0x40b33333    # -0.8f

    .line 348
    .line 349
    .line 350
    const v13, 0x3f0f5c29    # 0.56f

    .line 351
    .line 352
    .line 353
    const v14, 0x3cf5c28f    # 0.03f

    .line 354
    .line 355
    .line 356
    const v15, 0x3f8a3d71    # 1.08f

    .line 357
    .line 358
    .line 359
    const v16, -0x416b851f    # -0.29f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x40066666    # 2.1f

    .line 366
    .line 367
    .line 368
    const v2, -0x3f633333    # -4.9f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x3dcccccd    # 0.1f

    .line 375
    .line 376
    .line 377
    const/high16 v18, -0x41000000    # -0.5f

    .line 378
    .line 379
    const v13, 0x3da3d70a    # 0.08f

    .line 380
    .line 381
    .line 382
    const v14, -0x41e66666    # -0.15f

    .line 383
    .line 384
    .line 385
    const v15, 0x3df5c28f    # 0.12f

    .line 386
    .line 387
    .line 388
    const v16, -0x41570a3d    # -0.33f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41300000    # 11.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41880000    # 17.0f

    .line 400
    .line 401
    const/high16 v18, 0x41200000    # 10.0f

    .line 402
    .line 403
    const/high16 v13, 0x41900000    # 18.0f

    .line 404
    .line 405
    const v14, 0x41273333    # 10.45f

    .line 406
    .line 407
    .line 408
    const v15, 0x418c6666    # 17.55f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x41200000    # 10.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/16 v16, 0x3800

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/high16 v6, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v7, 0x0

    .line 430
    const/high16 v12, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const/4 v14, 0x0

    .line 434
    const/4 v15, 0x0

    .line 435
    const-string v4, ""

    .line 436
    .line 437
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    sput-object v0, Landroidx/compose/material/icons/outlined/RecommendKt;->_recommend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 446
    .line 447
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    return-object v0
.end method
