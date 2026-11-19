.class public final Landroidx/compose/material/icons/sharp/EarbudsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _earbuds:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEarbuds(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/EarbudsKt;->_earbuds:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Earbuds"

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
    const v4, 0x40c66666    # 6.2f

    .line 71
    .line 72
    .line 73
    const v6, 0x4040a3d7    # 3.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v26, 0x40c6147b    # 6.19f

    .line 82
    .line 83
    .line 84
    const v21, 0x408e147b    # 4.44f

    .line 85
    .line 86
    .line 87
    const v22, 0x4038f5c3    # 2.89f

    .line 88
    .line 89
    .line 90
    const/high16 v23, 0x40400000    # 3.0f

    .line 91
    .line 92
    const v24, 0x408d70a4    # 4.42f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41800000    # 16.0f

    .line 101
    .line 102
    const/high16 v6, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v25, 0x40a00000    # 5.0f

    .line 108
    .line 109
    const/high16 v26, 0x40a00000    # 5.0f

    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const v22, 0x4030a3d7    # 2.76f

    .line 114
    .line 115
    .line 116
    const v23, 0x400f5c29    # 2.24f

    .line 117
    .line 118
    .line 119
    const/high16 v24, 0x40a00000    # 5.0f

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v26, -0x3f600000    # -5.0f

    .line 129
    .line 130
    const v21, 0x4030a3d7    # 2.76f

    .line 131
    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const/high16 v23, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const v24, -0x3ff0a3d7    # -2.24f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41000000    # 8.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x40400000    # 3.0f

    .line 149
    .line 150
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const v22, -0x402b851f    # -1.66f

    .line 155
    .line 156
    .line 157
    const v23, 0x3fab851f    # 1.34f

    .line 158
    .line 159
    .line 160
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v26, 0x40400000    # 3.0f

    .line 170
    .line 171
    const v21, 0x3fd47ae1    # 1.66f

    .line 172
    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const/high16 v23, 0x40400000    # 3.0f

    .line 177
    .line 178
    const v24, 0x3fab851f    # 1.34f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40e00000    # 7.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, -0x40ab851f    # -0.83f

    .line 190
    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, -0x3fb51eb8    # -3.17f

    .line 197
    .line 198
    .line 199
    const v26, 0x40328f5c    # 2.79f

    .line 200
    .line 201
    .line 202
    const v21, -0x4031eb85    # -1.61f

    .line 203
    .line 204
    .line 205
    const v23, -0x3fbc28f6    # -3.06f

    .line 206
    .line 207
    .line 208
    const v24, 0x3f970a3d    # 1.18f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, 0x40333333    # 2.8f

    .line 215
    .line 216
    .line 217
    const v26, 0x404d70a4    # 3.21f

    .line 218
    .line 219
    .line 220
    const v21, -0x420a3d71    # -0.12f

    .line 221
    .line 222
    .line 223
    const v22, 0x3fd851ec    # 1.69f

    .line 224
    .line 225
    .line 226
    const v23, 0x3f947ae1    # 1.16f

    .line 227
    .line 228
    .line 229
    const v24, 0x40466666    # 3.1f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, 0x404ccccd    # 3.2f

    .line 236
    .line 237
    .line 238
    const v26, -0x3fb47ae1    # -3.18f

    .line 239
    .line 240
    .line 241
    const v21, 0x3fe147ae    # 1.76f

    .line 242
    .line 243
    .line 244
    const v22, 0x3df5c28f    # 0.12f

    .line 245
    .line 246
    .line 247
    const v23, 0x404ccccd    # 3.2f

    .line 248
    .line 249
    .line 250
    const v24, -0x404a3d71    # -1.42f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41a80000    # 21.0f

    .line 257
    .line 258
    const/high16 v6, 0x41000000    # 8.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v25, -0x3f600000    # -5.0f

    .line 264
    .line 265
    const/high16 v26, -0x3f600000    # -5.0f

    .line 266
    .line 267
    const/16 v21, 0x0

    .line 268
    .line 269
    const v22, -0x3fcf5c29    # -2.76f

    .line 270
    .line 271
    .line 272
    const v23, -0x3ff0a3d7    # -2.24f

    .line 273
    .line 274
    .line 275
    const/high16 v24, -0x3f600000    # -5.0f

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/4 v4, 0x0

    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v26, 0x40a00000    # 5.0f

    .line 285
    .line 286
    const v21, -0x3fcf5c29    # -2.76f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/high16 v23, -0x3f600000    # -5.0f

    .line 292
    .line 293
    const v24, 0x400f5c29    # 2.24f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x41000000    # 8.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 305
    .line 306
    const/high16 v26, 0x40400000    # 3.0f

    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const v22, 0x3fd47ae1    # 1.66f

    .line 311
    .line 312
    .line 313
    const v23, -0x40547ae1    # -1.34f

    .line 314
    .line 315
    .line 316
    const/high16 v24, 0x40400000    # 3.0f

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 326
    .line 327
    const v21, -0x402b851f    # -1.66f

    .line 328
    .line 329
    .line 330
    const/16 v22, 0x0

    .line 331
    .line 332
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 333
    .line 334
    const v24, -0x40547ae1    # -1.34f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41100000    # 9.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x3f547ae1    # 0.83f

    .line 346
    .line 347
    .line 348
    const/4 v6, 0x0

    .line 349
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x41100000    # 9.0f

    .line 353
    .line 354
    const v26, 0x40c6b852    # 6.21f

    .line 355
    .line 356
    .line 357
    const v21, 0x40ee147b    # 7.44f

    .line 358
    .line 359
    .line 360
    const/high16 v22, 0x41100000    # 9.0f

    .line 361
    .line 362
    const v23, 0x410e3d71    # 8.89f

    .line 363
    .line 364
    .line 365
    const v24, 0x40fa3d71    # 7.82f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v25, 0x40c66666    # 6.2f

    .line 372
    .line 373
    .line 374
    const v26, 0x4040a3d7    # 3.01f

    .line 375
    .line 376
    .line 377
    const v21, 0x4111c28f    # 9.11f

    .line 378
    .line 379
    .line 380
    const v22, 0x4090f5c3    # 4.53f

    .line 381
    .line 382
    .line 383
    const v23, 0x40fa8f5c    # 7.83f

    .line 384
    .line 385
    .line 386
    const v24, 0x40470a3d    # 3.11f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    const/16 v16, 0x3800

    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const/high16 v6, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v8, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const/high16 v9, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v12, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const/4 v14, 0x0

    .line 414
    const/4 v15, 0x0

    .line 415
    const-string v4, ""

    .line 416
    .line 417
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 418
    .line 419
    .line 420
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 425
    .line 426
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 427
    .line 428
    .line 429
    move-result-wide v6

    .line 430
    const/4 v2, 0x0

    .line 431
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x40c00000    # 6.0f

    .line 448
    .line 449
    const/high16 v6, 0x40400000    # 3.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x40400000    # 3.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x40c00000    # 6.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    const/high16 v6, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v7, 0x0

    .line 479
    const-string v4, ""

    .line 480
    .line 481
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 482
    .line 483
    .line 484
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 489
    .line 490
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 491
    .line 492
    .line 493
    move-result-wide v6

    .line 494
    const/4 v0, 0x0

    .line 495
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 499
    .line 500
    .line 501
    move-result v10

    .line 502
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 503
    .line 504
    .line 505
    move-result v11

    .line 506
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 509
    .line 510
    .line 511
    const/high16 v2, 0x41700000    # 15.0f

    .line 512
    .line 513
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v2, 0x40400000    # 3.0f

    .line 517
    .line 518
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v2, 0x40c00000    # 6.0f

    .line 522
    .line 523
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 527
    .line 528
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/high16 v6, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const-string v4, ""

    .line 542
    .line 543
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, Landroidx/compose/material/icons/sharp/EarbudsKt;->_earbuds:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 552
    .line 553
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-object v0
.end method
