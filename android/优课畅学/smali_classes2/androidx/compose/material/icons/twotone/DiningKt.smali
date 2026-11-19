.class public final Landroidx/compose/material/icons/twotone/DiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DiningKt;->_dining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Dining"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41a00000    # 20.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x416c0000    # 14.75f

    .line 99
    .line 100
    const/high16 v6, 0x40c00000    # 6.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x40200000    # 2.5f

    .line 106
    .line 107
    const v26, 0x405a3d71    # 3.41f

    .line 108
    .line 109
    .line 110
    const v21, 0x3fb0a3d7    # 1.38f

    .line 111
    .line 112
    .line 113
    const/16 v22, 0x0

    .line 114
    .line 115
    const/high16 v23, 0x40200000    # 2.5f

    .line 116
    .line 117
    const v24, 0x3fc3d70a    # 1.53f

    .line 118
    .line 119
    .line 120
    move-object/from16 v20, v2

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v25, -0x402a3d71    # -1.67f

    .line 126
    .line 127
    .line 128
    const v26, 0x404b851f    # 3.18f

    .line 129
    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const v22, 0x3fbd70a4    # 1.48f

    .line 134
    .line 135
    .line 136
    const v23, -0x40cccccd    # -0.7f

    .line 137
    .line 138
    .line 139
    const v24, 0x402d70a4    # 2.71f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x3cf5c28f    # 0.03f

    .line 146
    .line 147
    .line 148
    const v6, -0x425c28f6    # -0.08f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41980000    # 19.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41600000    # 14.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, -0x3f33d70a    # -6.38f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, -0x42dc28f6    # -0.04f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v26, -0x3fb47ae1    # -3.18f

    .line 177
    .line 178
    .line 179
    const v21, -0x4087ae14    # -0.97f

    .line 180
    .line 181
    .line 182
    const v22, -0x410f5c29    # -0.47f

    .line 183
    .line 184
    .line 185
    const v23, -0x402a3d71    # -1.67f

    .line 186
    .line 187
    .line 188
    const v24, -0x40266666    # -1.7f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x416c0000    # 14.75f

    .line 195
    .line 196
    const/high16 v26, 0x40c00000    # 6.0f

    .line 197
    .line 198
    const/high16 v21, 0x41440000    # 12.25f

    .line 199
    .line 200
    const v22, 0x40f0a3d7    # 7.52f

    .line 201
    .line 202
    .line 203
    const v23, 0x4156147b    # 13.38f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x40c00000    # 6.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40d00000    # 6.5f

    .line 215
    .line 216
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v25, 0x40e00000    # 7.0f

    .line 220
    .line 221
    const/high16 v21, 0x40d00000    # 6.5f

    .line 222
    .line 223
    const v22, 0x40c70a3d    # 6.22f

    .line 224
    .line 225
    .line 226
    const v23, 0x40d70a3d    # 6.72f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, 0x3e6147ae    # 0.22f

    .line 233
    .line 234
    .line 235
    const/high16 v6, 0x3f000000    # 0.5f

    .line 236
    .line 237
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41100000    # 9.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x3f400000    # 0.75f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x40d00000    # 6.5f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x3f000000    # 0.5f

    .line 256
    .line 257
    const/high16 v26, -0x41000000    # -0.5f

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const v22, -0x4170a3d7    # -0.28f

    .line 262
    .line 263
    .line 264
    const v23, 0x3e6147ae    # 0.22f

    .line 265
    .line 266
    .line 267
    const/high16 v24, -0x41000000    # -0.5f

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x3e6147ae    # 0.22f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41100000    # 9.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41200000    # 10.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x40d00000    # 6.5f

    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v25, 0x41280000    # 10.5f

    .line 294
    .line 295
    const/high16 v26, 0x40c00000    # 6.0f

    .line 296
    .line 297
    const/high16 v21, 0x41200000    # 10.0f

    .line 298
    .line 299
    const v22, 0x40c70a3d    # 6.22f

    .line 300
    .line 301
    .line 302
    const v23, 0x4123ae14    # 10.23f

    .line 303
    .line 304
    .line 305
    const/high16 v24, 0x40c00000    # 6.0f

    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v25, 0x41300000    # 11.0f

    .line 311
    .line 312
    const/high16 v26, 0x40d00000    # 6.5f

    .line 313
    .line 314
    const v21, 0x412c7ae1    # 10.78f

    .line 315
    .line 316
    .line 317
    const/high16 v22, 0x40c00000    # 6.0f

    .line 318
    .line 319
    const/high16 v23, 0x41300000    # 11.0f

    .line 320
    .line 321
    const v24, 0x40c70a3d    # 6.22f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x40733333    # 3.8f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v25, -0x40400000    # -1.5f

    .line 334
    .line 335
    const v26, 0x3ff70a3d    # 1.93f

    .line 336
    .line 337
    .line 338
    const/16 v21, 0x0

    .line 339
    .line 340
    const v22, 0x3f6e147b    # 0.93f

    .line 341
    .line 342
    .line 343
    const v23, -0x40dc28f6    # -0.64f

    .line 344
    .line 345
    .line 346
    const v24, 0x3fdae148    # 1.71f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, 0x41980000    # 19.0f

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, 0x41000000    # 8.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, -0x3f275c29    # -6.77f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v26, -0x4008f5c3    # -1.93f

    .line 369
    .line 370
    .line 371
    const v21, -0x40a3d70a    # -0.86f

    .line 372
    .line 373
    .line 374
    const v22, -0x419eb852    # -0.22f

    .line 375
    .line 376
    .line 377
    const/high16 v23, -0x40400000    # -1.5f

    .line 378
    .line 379
    const/high16 v24, -0x40800000    # -1.0f

    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x40d00000    # 6.5f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    const/16 v16, 0x3800

    .line 397
    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    const v6, 0x3e99999a    # 0.3f

    .line 401
    .line 402
    .line 403
    const v8, 0x3e99999a    # 0.3f

    .line 404
    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    const/high16 v9, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/high16 v12, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 424
    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 426
    .line 427
    .line 428
    move-result-wide v6

    .line 429
    const/4 v2, 0x0

    .line 430
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x40000000    # 2.0f

    .line 447
    .line 448
    const/high16 v6, 0x41a00000    # 20.0f

    .line 449
    .line 450
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x40800000    # 4.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v25, 0x40000000    # 2.0f

    .line 459
    .line 460
    const/high16 v26, 0x40800000    # 4.0f

    .line 461
    .line 462
    const v21, 0x4039999a    # 2.9f

    .line 463
    .line 464
    .line 465
    const/high16 v22, 0x40000000    # 2.0f

    .line 466
    .line 467
    const/high16 v23, 0x40000000    # 2.0f

    .line 468
    .line 469
    const v24, 0x4039999a    # 2.9f

    .line 470
    .line 471
    .line 472
    move-object/from16 v20, v2

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x41800000    # 16.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v26, 0x40000000    # 2.0f

    .line 483
    .line 484
    const/16 v21, 0x0

    .line 485
    .line 486
    const v22, 0x3f8ccccd    # 1.1f

    .line 487
    .line 488
    .line 489
    const v23, 0x3f666666    # 0.9f

    .line 490
    .line 491
    .line 492
    const/high16 v24, 0x40000000    # 2.0f

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
    const/high16 v26, -0x40000000    # -2.0f

    .line 501
    .line 502
    const v21, 0x3f8ccccd    # 1.1f

    .line 503
    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/high16 v23, 0x40000000    # 2.0f

    .line 508
    .line 509
    const v24, -0x4099999a    # -0.9f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v4, 0x40800000    # 4.0f

    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v25, 0x41a00000    # 20.0f

    .line 521
    .line 522
    const/high16 v26, 0x40000000    # 2.0f

    .line 523
    .line 524
    const/high16 v21, 0x41b00000    # 22.0f

    .line 525
    .line 526
    const v22, 0x4039999a    # 2.9f

    .line 527
    .line 528
    .line 529
    const v23, 0x41a8cccd    # 21.1f

    .line 530
    .line 531
    .line 532
    const/high16 v24, 0x40000000    # 2.0f

    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v4, 0x41a00000    # 20.0f

    .line 541
    .line 542
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v4, 0x40800000    # 4.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v4, 0x41800000    # 16.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x41a00000    # 20.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v8, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v7, 0x0

    .line 575
    const-string v4, ""

    .line 576
    .line 577
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 578
    .line 579
    .line 580
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 585
    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 587
    .line 588
    .line 589
    move-result-wide v6

    .line 590
    const/4 v2, 0x0

    .line 591
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 595
    .line 596
    .line 597
    move-result v10

    .line 598
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 599
    .line 600
    .line 601
    move-result v11

    .line 602
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 605
    .line 606
    .line 607
    const v4, 0x4143ae14    # 12.23f

    .line 608
    .line 609
    .line 610
    const/high16 v6, 0x41000000    # 8.0f

    .line 611
    .line 612
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v4, 0x41980000    # 19.0f

    .line 616
    .line 617
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 621
    .line 622
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v4, -0x3f275c29    # -6.77f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 632
    .line 633
    const v26, -0x4008f5c3    # -1.93f

    .line 634
    .line 635
    .line 636
    const v21, 0x3f5c28f6    # 0.86f

    .line 637
    .line 638
    .line 639
    const v22, -0x419eb852    # -0.22f

    .line 640
    .line 641
    .line 642
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 643
    .line 644
    const/high16 v24, -0x40800000    # -1.0f

    .line 645
    .line 646
    move-object/from16 v20, v2

    .line 647
    .line 648
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v4, 0x40d00000    # 6.5f

    .line 652
    .line 653
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v25, 0x41280000    # 10.5f

    .line 657
    .line 658
    const/high16 v26, 0x40c00000    # 6.0f

    .line 659
    .line 660
    const/high16 v21, 0x41300000    # 11.0f

    .line 661
    .line 662
    const v22, 0x40c70a3d    # 6.22f

    .line 663
    .line 664
    .line 665
    const v23, 0x412c7ae1    # 10.78f

    .line 666
    .line 667
    .line 668
    const/high16 v24, 0x40c00000    # 6.0f

    .line 669
    .line 670
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v25, 0x41200000    # 10.0f

    .line 674
    .line 675
    const/high16 v26, 0x40d00000    # 6.5f

    .line 676
    .line 677
    const v21, 0x4123ae14    # 10.23f

    .line 678
    .line 679
    .line 680
    const/high16 v22, 0x40c00000    # 6.0f

    .line 681
    .line 682
    const/high16 v23, 0x41200000    # 10.0f

    .line 683
    .line 684
    const v24, 0x40c70a3d    # 6.22f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41100000    # 9.0f

    .line 691
    .line 692
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, 0x41140000    # 9.25f

    .line 696
    .line 697
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v4, 0x40d00000    # 6.5f

    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v25, -0x41000000    # -0.5f

    .line 706
    .line 707
    const/high16 v26, -0x41000000    # -0.5f

    .line 708
    .line 709
    const/16 v21, 0x0

    .line 710
    .line 711
    const v22, -0x4170a3d7    # -0.28f

    .line 712
    .line 713
    .line 714
    const v23, -0x419eb852    # -0.22f

    .line 715
    .line 716
    .line 717
    const/high16 v24, -0x41000000    # -0.5f

    .line 718
    .line 719
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v4, -0x41000000    # -0.5f

    .line 723
    .line 724
    const v6, 0x3e6147ae    # 0.22f

    .line 725
    .line 726
    .line 727
    const/high16 v7, 0x3f000000    # 0.5f

    .line 728
    .line 729
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v4, 0x41100000    # 9.0f

    .line 733
    .line 734
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v4, 0x40f00000    # 7.5f

    .line 738
    .line 739
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v4, 0x40d00000    # 6.5f

    .line 743
    .line 744
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v25, 0x40e00000    # 7.0f

    .line 748
    .line 749
    const/high16 v26, 0x40c00000    # 6.0f

    .line 750
    .line 751
    const/high16 v21, 0x40f00000    # 7.5f

    .line 752
    .line 753
    const v22, 0x40c70a3d    # 6.22f

    .line 754
    .line 755
    .line 756
    const v23, 0x40e8f5c3    # 7.28f

    .line 757
    .line 758
    .line 759
    const/high16 v24, 0x40c00000    # 6.0f

    .line 760
    .line 761
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v4, 0x40c70a3d    # 6.22f

    .line 765
    .line 766
    .line 767
    const/high16 v6, 0x40d00000    # 6.5f

    .line 768
    .line 769
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v4, 0x40733333    # 3.8f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v25, 0x41000000    # 8.0f

    .line 779
    .line 780
    const v26, 0x4143ae14    # 12.23f

    .line 781
    .line 782
    .line 783
    const/high16 v21, 0x40d00000    # 6.5f

    .line 784
    .line 785
    const v22, 0x4133ae14    # 11.23f

    .line 786
    .line 787
    .line 788
    const v23, 0x40e47ae1    # 7.14f

    .line 789
    .line 790
    .line 791
    const v24, 0x414028f6    # 12.01f

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const/high16 v6, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 817
    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 819
    .line 820
    .line 821
    move-result-wide v6

    .line 822
    const/4 v0, 0x0

    .line 823
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 831
    .line 832
    .line 833
    move-result v11

    .line 834
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    const v0, 0x415eb852    # 13.92f

    .line 840
    .line 841
    .line 842
    const v2, 0x414947ae    # 12.58f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, 0x4149eb85    # 12.62f

    .line 849
    .line 850
    .line 851
    const/high16 v2, 0x41600000    # 14.0f

    .line 852
    .line 853
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v0, 0x41980000    # 19.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 862
    .line 863
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v0, -0x3f33d70a    # -6.38f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x3da3d70a    # 0.08f

    .line 873
    .line 874
    .line 875
    const v2, -0x430a3d71    # -0.03f

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v17, 0x3fd5c28f    # 1.67f

    .line 882
    .line 883
    .line 884
    const v18, -0x3fb47ae1    # -3.18f

    .line 885
    .line 886
    .line 887
    const v13, 0x3f7851ec    # 0.97f

    .line 888
    .line 889
    .line 890
    const v14, -0x410f5c29    # -0.47f

    .line 891
    .line 892
    .line 893
    const v15, 0x3fd5c28f    # 1.67f

    .line 894
    .line 895
    .line 896
    const v16, -0x40266666    # -1.7f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 903
    .line 904
    const v18, -0x3fa5c28f    # -3.41f

    .line 905
    .line 906
    .line 907
    const/4 v13, 0x0

    .line 908
    const v14, -0x400f5c29    # -1.88f

    .line 909
    .line 910
    .line 911
    const v15, -0x4070a3d7    # -1.12f

    .line 912
    .line 913
    .line 914
    const v16, -0x3fa5c28f    # -3.41f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const v18, 0x4059999a    # 3.4f

    .line 921
    .line 922
    .line 923
    const v13, -0x4050a3d7    # -1.37f

    .line 924
    .line 925
    .line 926
    const/4 v14, 0x0

    .line 927
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 928
    .line 929
    const v16, 0x3fc28f5c    # 1.52f

    .line 930
    .line 931
    .line 932
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v17, 0x415eb852    # 13.92f

    .line 936
    .line 937
    .line 938
    const v18, 0x414947ae    # 12.58f

    .line 939
    .line 940
    .line 941
    const/high16 v13, 0x41440000    # 12.25f

    .line 942
    .line 943
    const v14, 0x412e147b    # 10.88f

    .line 944
    .line 945
    .line 946
    const v15, 0x414f3333    # 12.95f

    .line 947
    .line 948
    .line 949
    const v16, 0x4141c28f    # 12.11f

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    const/16 v16, 0x3800

    .line 963
    .line 964
    const/16 v17, 0x0

    .line 965
    .line 966
    const/high16 v6, 0x3f800000    # 1.0f

    .line 967
    .line 968
    const/4 v7, 0x0

    .line 969
    const/high16 v12, 0x3f800000    # 1.0f

    .line 970
    .line 971
    const/4 v13, 0x0

    .line 972
    const/4 v14, 0x0

    .line 973
    const/4 v15, 0x0

    .line 974
    const-string v4, ""

    .line 975
    .line 976
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    sput-object v0, Landroidx/compose/material/icons/twotone/DiningKt;->_dining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 985
    .line 986
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 987
    .line 988
    .line 989
    return-object v0
.end method
