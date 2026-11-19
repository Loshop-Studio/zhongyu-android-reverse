.class public final Landroidx/compose/material/icons/twotone/ExploreOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExploreOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ExploreOff"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x4081eb85    # 4.06f

    .line 78
    .line 79
    .line 80
    const v26, -0x4070a3d7    # -1.12f

    .line 81
    .line 82
    .line 83
    const v21, 0x3fbd70a4    # 1.48f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x40370a3d    # 2.86f

    .line 89
    .line 90
    .line 91
    const v24, -0x412e147b    # -0.41f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x3f8147ae    # -3.98f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x40266666    # 2.6f

    .line 106
    .line 107
    .line 108
    const v6, -0x3f4d70a4    # -5.58f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4025c28f    # 2.59f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x3f81eb85    # -3.97f

    .line 121
    .line 122
    .line 123
    const v6, -0x3f8147ae    # -3.98f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x40800000    # 4.0f

    .line 130
    .line 131
    const/high16 v26, 0x41400000    # 12.0f

    .line 132
    .line 133
    const v21, 0x408d1eb8    # 4.41f

    .line 134
    .line 135
    .line 136
    const v22, 0x41123d71    # 9.14f

    .line 137
    .line 138
    .line 139
    const/high16 v23, 0x40800000    # 4.0f

    .line 140
    .line 141
    const v24, 0x412851ec    # 10.52f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, 0x41000000    # 8.0f

    .line 148
    .line 149
    const/high16 v26, 0x41000000    # 8.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, 0x408d1eb8    # 4.41f

    .line 154
    .line 155
    .line 156
    const v23, 0x4065c28f    # 3.59f

    .line 157
    .line 158
    .line 159
    const/high16 v24, 0x41000000    # 8.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40800000    # 4.0f

    .line 168
    .line 169
    const/high16 v6, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, -0x3f7e147b    # -4.06f

    .line 175
    .line 176
    .line 177
    const v26, 0x3f8f5c29    # 1.12f

    .line 178
    .line 179
    .line 180
    const v21, -0x40428f5c    # -1.48f

    .line 181
    .line 182
    .line 183
    const/16 v22, 0x0

    .line 184
    .line 185
    const v23, -0x3fc8f5c3    # -2.86f

    .line 186
    .line 187
    .line 188
    const v24, 0x3ed1eb85    # 0.41f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x407eb852    # 3.98f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, -0x3fd9999a    # -2.6f

    .line 201
    .line 202
    .line 203
    const v6, 0x40b28f5c    # 5.58f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, -0x3fda3d71    # -2.59f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x407eb852    # 3.98f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, 0x3f8e147b    # 1.11f

    .line 222
    .line 223
    .line 224
    const v26, -0x3f7e147b    # -4.06f

    .line 225
    .line 226
    .line 227
    const v21, 0x3f333333    # 0.7f

    .line 228
    .line 229
    .line 230
    const v22, -0x40666666    # -1.2f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f8e147b    # 1.11f

    .line 234
    .line 235
    .line 236
    const v24, -0x3fdae148    # -2.58f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, -0x3f000000    # -8.0f

    .line 243
    .line 244
    const/high16 v26, -0x3f000000    # -8.0f

    .line 245
    .line 246
    const/16 v21, 0x0

    .line 247
    .line 248
    const v22, -0x3f72e148    # -4.41f

    .line 249
    .line 250
    .line 251
    const v23, -0x3f9a3d71    # -3.59f

    .line 252
    .line 253
    .line 254
    const/high16 v24, -0x3f000000    # -8.0f

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/16 v16, 0x3800

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v8, 0x3e99999a    # 0.3f

    .line 274
    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v9, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v12, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x418c0000    # 17.5f

    .line 317
    .line 318
    const/high16 v2, 0x40d00000    # 6.5f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x4025c28f    # 2.59f

    .line 324
    .line 325
    .line 326
    const v2, -0x3f4d70a4    # -5.58f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x403f5c29    # 2.99f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x409dc28f    # 4.93f

    .line 342
    .line 343
    .line 344
    const v2, 0x40066666    # 2.1f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x3fc7ae14    # 1.56f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40000000    # 2.0f

    .line 357
    .line 358
    const/high16 v18, 0x41400000    # 12.0f

    .line 359
    .line 360
    const v13, 0x40270a3d    # 2.61f

    .line 361
    .line 362
    .line 363
    const v14, 0x41011eb8    # 8.07f

    .line 364
    .line 365
    .line 366
    const/high16 v15, 0x40000000    # 2.0f

    .line 367
    .line 368
    const v16, 0x411f5c29    # 9.96f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x41200000    # 10.0f

    .line 375
    .line 376
    const/high16 v18, 0x41200000    # 10.0f

    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, 0x40b0a3d7    # 5.52f

    .line 380
    .line 381
    .line 382
    const v15, 0x408f5c29    # 4.48f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x41200000    # 10.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x40b051ec    # 5.51f

    .line 391
    .line 392
    .line 393
    const v18, -0x402b851f    # -1.66f

    .line 394
    .line 395
    .line 396
    const v13, 0x40028f5c    # 2.04f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const v15, 0x407b851f    # 3.93f

    .line 401
    .line 402
    .line 403
    const v16, -0x40e3d70a    # -0.61f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3fb47ae1    # 1.41f

    .line 413
    .line 414
    .line 415
    const v2, -0x404b851f    # -1.41f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x4060a3d7    # 3.51f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x409dc28f    # 4.93f

    .line 428
    .line 429
    .line 430
    const v2, 0x40066666    # 2.1f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40a3d70a    # 5.12f

    .line 440
    .line 441
    .line 442
    const v2, 0x40fe147b    # 7.94f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x407eb852    # 3.98f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x3fd9999a    # -2.6f

    .line 455
    .line 456
    .line 457
    const v2, 0x40b28f5c    # 5.58f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, -0x3fda3d71    # -2.59f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x407eb852    # 3.98f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, -0x3f7e147b    # -4.06f

    .line 476
    .line 477
    .line 478
    const v18, 0x3f8e147b    # 1.11f

    .line 479
    .line 480
    .line 481
    const v13, -0x40666666    # -1.2f

    .line 482
    .line 483
    .line 484
    const v14, 0x3f333333    # 0.7f

    .line 485
    .line 486
    .line 487
    const v15, -0x3fdae148    # -2.58f

    .line 488
    .line 489
    .line 490
    const v16, 0x3f8e147b    # 1.11f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, -0x3f000000    # -8.0f

    .line 497
    .line 498
    const/high16 v18, -0x3f000000    # -8.0f

    .line 499
    .line 500
    const v13, -0x3f72e148    # -4.41f

    .line 501
    .line 502
    .line 503
    const/4 v14, 0x0

    .line 504
    const/high16 v15, -0x3f000000    # -8.0f

    .line 505
    .line 506
    const v16, -0x3f9a3d71    # -3.59f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x3f8f5c29    # 1.12f

    .line 513
    .line 514
    .line 515
    const v18, -0x3f7e147b    # -4.06f

    .line 516
    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, -0x40428f5c    # -1.48f

    .line 520
    .line 521
    .line 522
    const v15, 0x3ed1eb85    # 0.41f

    .line 523
    .line 524
    .line 525
    const v16, -0x3fc8f5c3    # -2.86f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40800000    # 4.0f

    .line 535
    .line 536
    const/high16 v2, 0x41400000    # 12.0f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41000000    # 8.0f

    .line 542
    .line 543
    const/high16 v18, 0x41000000    # 8.0f

    .line 544
    .line 545
    const v13, 0x408d1eb8    # 4.41f

    .line 546
    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    const/high16 v15, 0x41000000    # 8.0f

    .line 550
    .line 551
    const v16, 0x4065c28f    # 3.59f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, -0x4070a3d7    # -1.12f

    .line 558
    .line 559
    .line 560
    const v18, 0x4081eb85    # 4.06f

    .line 561
    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const v14, 0x3fbd70a4    # 1.48f

    .line 565
    .line 566
    .line 567
    const v15, -0x412e147b    # -0.41f

    .line 568
    .line 569
    .line 570
    const v16, 0x40370a3d    # 2.86f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x3fbae148    # 1.46f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, 0x41b00000    # 22.0f

    .line 583
    .line 584
    const/high16 v18, 0x41400000    # 12.0f

    .line 585
    .line 586
    const v13, 0x41ab1eb8    # 21.39f

    .line 587
    .line 588
    .line 589
    const v14, 0x417ee148    # 15.93f

    .line 590
    .line 591
    .line 592
    const/high16 v15, 0x41b00000    # 22.0f

    .line 593
    .line 594
    const v16, 0x4160a3d7    # 14.04f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 601
    .line 602
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, -0x3f4f5c29    # -5.52f

    .line 606
    .line 607
    .line 608
    const v15, -0x3f70a3d7    # -4.48f

    .line 609
    .line 610
    .line 611
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, -0x3f4fae14    # -5.51f

    .line 617
    .line 618
    .line 619
    const v18, 0x3fd47ae1    # 1.66f

    .line 620
    .line 621
    .line 622
    const v13, -0x3ffd70a4    # -2.04f

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const v15, -0x3f847ae1    # -3.93f

    .line 627
    .line 628
    .line 629
    const v16, 0x3f1c28f6    # 0.61f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, 0x41400000    # 12.0f

    .line 639
    .line 640
    const/high16 v18, 0x40800000    # 4.0f

    .line 641
    .line 642
    const v13, 0x41123d71    # 9.14f

    .line 643
    .line 644
    .line 645
    const v14, 0x408d1eb8    # 4.41f

    .line 646
    .line 647
    .line 648
    const v15, 0x412851ec    # 10.52f

    .line 649
    .line 650
    .line 651
    const/high16 v16, 0x40800000    # 4.0f

    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    const/16 v16, 0x3800

    .line 664
    .line 665
    const/16 v17, 0x0

    .line 666
    .line 667
    const/high16 v6, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v8, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const/high16 v12, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    const/4 v14, 0x0

    .line 676
    const/4 v15, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sput-object v0, Landroidx/compose/material/icons/twotone/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method
