.class public final Landroidx/compose/material/icons/filled/MotionPhotosAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motionPhotosAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosAuto(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MotionPhotosAutoKt;->_motionPhotosAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.MotionPhotosAuto"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x403851ec    # 2.88f

    .line 71
    .line 72
    .line 73
    const v2, 0x40fc28f6    # 7.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fc51eb8    # 1.54f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v17, 0x40800000    # 4.0f

    .line 86
    .line 87
    const/high16 v18, 0x41400000    # 12.0f

    .line 88
    .line 89
    const v13, 0x4084cccd    # 4.15f

    .line 90
    .line 91
    .line 92
    const v14, 0x4123ae14    # 10.23f

    .line 93
    .line 94
    .line 95
    const/high16 v15, 0x40800000    # 4.0f

    .line 96
    .line 97
    const v16, 0x4131999a    # 11.1f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x41000000    # 8.0f

    .line 104
    .line 105
    const/high16 v18, 0x41000000    # 8.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x408d1eb8    # 4.41f

    .line 109
    .line 110
    .line 111
    const v15, 0x4065c28f    # 3.59f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x41000000    # 8.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f9a3d71    # -3.59f

    .line 120
    .line 121
    .line 122
    const/high16 v2, 0x41000000    # 8.0f

    .line 123
    .line 124
    const/high16 v4, -0x3f000000    # -8.0f

    .line 125
    .line 126
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v2, -0x3f000000    # -8.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x3fdae148    # -2.58f

    .line 135
    .line 136
    .line 137
    const v18, 0x3ed70a3d    # 0.42f

    .line 138
    .line 139
    .line 140
    const v13, -0x4099999a    # -0.9f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const v15, -0x401d70a4    # -1.77f

    .line 145
    .line 146
    .line 147
    const v16, 0x3e19999a    # 0.15f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x40fc7ae1    # 7.89f

    .line 154
    .line 155
    .line 156
    const v2, 0x4038f5c3    # 2.89f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x41400000    # 12.0f

    .line 163
    .line 164
    const/high16 v18, 0x40000000    # 2.0f

    .line 165
    .line 166
    const v13, 0x41126666    # 9.15f

    .line 167
    .line 168
    .line 169
    const v14, 0x40147ae1    # 2.32f

    .line 170
    .line 171
    .line 172
    const v15, 0x4128a3d7    # 10.54f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x41200000    # 10.0f

    .line 181
    .line 182
    const/high16 v18, 0x41200000    # 10.0f

    .line 183
    .line 184
    const v13, 0x40b0a3d7    # 5.52f

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const/high16 v15, 0x41200000    # 10.0f

    .line 189
    .line 190
    const v16, 0x408f5c29    # 4.48f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, -0x3f70a3d7    # -4.48f

    .line 197
    .line 198
    .line 199
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 200
    .line 201
    const/high16 v4, 0x41200000    # 10.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x418c28f6    # 17.52f

    .line 207
    .line 208
    .line 209
    const/high16 v2, 0x40000000    # 2.0f

    .line 210
    .line 211
    const/high16 v4, 0x41400000    # 12.0f

    .line 212
    .line 213
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x403851ec    # 2.88f

    .line 217
    .line 218
    .line 219
    const v18, 0x40fc28f6    # 7.88f

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x40000000    # 2.0f

    .line 223
    .line 224
    const v14, 0x41287ae1    # 10.53f

    .line 225
    .line 226
    .line 227
    const v15, 0x40147ae1    # 2.32f

    .line 228
    .line 229
    .line 230
    const v16, 0x41123d71    # 9.14f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x40e00000    # 7.0f

    .line 240
    .line 241
    const/high16 v2, 0x40b00000    # 5.5f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40b00000    # 5.5f

    .line 247
    .line 248
    const/high16 v18, 0x40e00000    # 7.0f

    .line 249
    .line 250
    const/high16 v13, 0x40e00000    # 7.0f

    .line 251
    .line 252
    const v14, 0x40ca8f5c    # 6.33f

    .line 253
    .line 254
    .line 255
    const v15, 0x40ca8f5c    # 6.33f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x40e00000    # 7.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x40ca8f5c    # 6.33f

    .line 264
    .line 265
    .line 266
    const/high16 v2, 0x40800000    # 4.0f

    .line 267
    .line 268
    const/high16 v4, 0x40b00000    # 5.5f

    .line 269
    .line 270
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x409570a4    # 4.67f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v2, 0x40e00000    # 7.0f

    .line 280
    .line 281
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x410fd70a    # 8.99f

    .line 288
    .line 289
    .line 290
    const v2, 0x41407ae1    # 12.03f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, -0x4270a3d7    # -0.07f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x406b851f    # -1.16f

    .line 303
    .line 304
    .line 305
    const v2, 0x4053d70a    # 3.31f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x4018f5c3    # 2.39f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x410fd70a    # 8.99f

    .line 318
    .line 319
    .line 320
    const v2, 0x41407ae1    # 12.03f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41900000    # 18.0f

    .line 330
    .line 331
    const/high16 v2, 0x41400000    # 12.0f

    .line 332
    .line 333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x40c00000    # 6.0f

    .line 337
    .line 338
    const/high16 v18, -0x3f400000    # -6.0f

    .line 339
    .line 340
    const v13, 0x4053d70a    # 3.31f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const/high16 v15, 0x40c00000    # 6.0f

    .line 345
    .line 346
    const v16, -0x3fd3d70a    # -2.69f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x3fd3d70a    # -2.69f

    .line 353
    .line 354
    .line 355
    const/high16 v2, -0x3f400000    # -6.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x402c28f6    # 2.69f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x40c00000    # 6.0f

    .line 364
    .line 365
    const/high16 v4, -0x3f400000    # -6.0f

    .line 366
    .line 367
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x410b0a3d    # 8.69f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x41900000    # 18.0f

    .line 374
    .line 375
    const/high16 v4, 0x41400000    # 12.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40f00000    # 7.5f

    .line 384
    .line 385
    const v2, 0x4134a3d7    # 11.29f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3fb70a3d    # 1.43f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x4040a3d7    # 3.01f

    .line 398
    .line 399
    .line 400
    const/high16 v2, 0x41000000    # 8.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, -0x404e147b    # -1.39f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x40c7ae14    # -0.72f

    .line 412
    .line 413
    .line 414
    const v2, -0x3ffd70a4    # -2.04f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x3fb147ae    # -3.23f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x411a8f5c    # 9.66f

    .line 427
    .line 428
    .line 429
    const/high16 v2, 0x41780000    # 15.5f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x41047ae1    # 8.28f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x40f00000    # 7.5f

    .line 441
    .line 442
    const v2, 0x4134a3d7    # 11.29f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/16 v16, 0x3800

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v8, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const/high16 v9, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v12, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const/4 v15, 0x0

    .line 470
    const-string v4, ""

    .line 471
    .line 472
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    sput-object v0, Landroidx/compose/material/icons/filled/MotionPhotosAutoKt;->_motionPhotosAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 481
    .line 482
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-object v0
.end method
