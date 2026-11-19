.class public final Landroidx/compose/material/icons/twotone/NoPhotographyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoPhotography(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoPhotography"

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
    const v4, 0x412f0a3d    # 10.94f

    .line 71
    .line 72
    .line 73
    const v6, 0x4101eb85    # 8.12f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40c23d71    # 6.07f

    .line 80
    .line 81
    .line 82
    const v6, 0x410e6666    # 8.9f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x40a00000    # 5.0f

    .line 89
    .line 90
    const v6, 0x411e147b    # 9.88f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4087ae14    # 4.24f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x40000000    # 2.0f

    .line 103
    .line 104
    const v6, 0x3fea3d71    # 1.83f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x41a00000    # 20.0f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x4122b852    # 10.17f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, -0x3fb851ec    # -3.12f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x41880000    # 17.0f

    .line 128
    .line 129
    const/high16 v26, 0x41500000    # 13.0f

    .line 130
    .line 131
    const v21, 0x4187ae14    # 16.96f

    .line 132
    .line 133
    .line 134
    const v22, 0x415b5c29    # 13.71f

    .line 135
    .line 136
    .line 137
    const/high16 v23, 0x41880000    # 17.0f

    .line 138
    .line 139
    const v24, 0x4155c28f    # 13.36f

    .line 140
    .line 141
    .line 142
    move-object/from16 v20, v2

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, -0x3f600000    # -5.0f

    .line 148
    .line 149
    const/high16 v26, -0x3f600000    # -5.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, -0x3fcf5c29    # -2.76f

    .line 154
    .line 155
    .line 156
    const v23, -0x3ff0a3d7    # -2.24f

    .line 157
    .line 158
    .line 159
    const/high16 v24, -0x3f600000    # -5.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x412f0a3d    # 10.94f

    .line 165
    .line 166
    .line 167
    const v26, 0x4101eb85    # 8.12f

    .line 168
    .line 169
    .line 170
    const v21, 0x413a3d71    # 11.64f

    .line 171
    .line 172
    .line 173
    const/high16 v22, 0x41000000    # 8.0f

    .line 174
    .line 175
    const v23, 0x4134a3d7    # 11.29f

    .line 176
    .line 177
    .line 178
    const v24, 0x4100a3d7    # 8.04f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x41900000    # 18.0f

    .line 188
    .line 189
    const/high16 v6, 0x41400000    # 12.0f

    .line 190
    .line 191
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, -0x3f600000    # -5.0f

    .line 195
    .line 196
    const/high16 v26, -0x3f600000    # -5.0f

    .line 197
    .line 198
    const v21, -0x3fcf5c29    # -2.76f

    .line 199
    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    const/high16 v23, -0x3f600000    # -5.0f

    .line 204
    .line 205
    const v24, -0x3ff0a3d7    # -2.24f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v25, 0x3f2e147b    # 0.68f

    .line 212
    .line 213
    .line 214
    const v26, -0x3fe0a3d7    # -2.49f

    .line 215
    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, -0x40970a3d    # -0.91f

    .line 220
    .line 221
    .line 222
    const/high16 v23, 0x3e800000    # 0.25f

    .line 223
    .line 224
    const v24, -0x401eb852    # -1.76f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x408570a4    # 4.17f

    .line 231
    .line 232
    .line 233
    const/high16 v6, 0x40e00000    # 7.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x40800000    # 4.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x4142b852    # 12.17f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, -0x4028f5c3    # -1.68f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v26, 0x41900000    # 18.0f

    .line 263
    .line 264
    const v21, 0x415c28f6    # 13.76f

    .line 265
    .line 266
    .line 267
    const/high16 v22, 0x418e0000    # 17.75f

    .line 268
    .line 269
    const v23, 0x414e8f5c    # 12.91f

    .line 270
    .line 271
    .line 272
    const/high16 v24, 0x41900000    # 18.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/16 v16, 0x3800

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const v6, 0x3e99999a    # 0.3f

    .line 289
    .line 290
    .line 291
    const v8, 0x3e99999a    # 0.3f

    .line 292
    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/high16 v9, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v12, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    const-string v4, ""

    .line 303
    .line 304
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 312
    .line 313
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    const/4 v0, 0x0

    .line 318
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const v0, 0x40c23d71    # 6.07f

    .line 335
    .line 336
    .line 337
    const v2, 0x410e6666    # 8.9f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x40ef5c29    # 7.48f

    .line 344
    .line 345
    .line 346
    const v2, 0x40951eb8    # 4.66f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41100000    # 9.0f

    .line 353
    .line 354
    const/high16 v2, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x40c00000    # 6.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40000000    # 2.0f

    .line 365
    .line 366
    const v2, 0x3fea3d71    # 1.83f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41a00000    # 20.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x40000000    # 2.0f

    .line 378
    .line 379
    const/high16 v18, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v13, 0x3f8ccccd    # 1.1f

    .line 382
    .line 383
    .line 384
    const/high16 v15, 0x40000000    # 2.0f

    .line 385
    .line 386
    const v16, 0x3f666666    # 0.9f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41400000    # 12.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x435c28f6    # -0.02f

    .line 398
    .line 399
    .line 400
    const v18, 0x3e23d70a    # 0.16f

    .line 401
    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, 0x3d4ccccd    # 0.05f

    .line 405
    .line 406
    .line 407
    const v15, -0x43dc28f6    # -0.01f

    .line 408
    .line 409
    .line 410
    const v16, 0x3dcccccd    # 0.1f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x41895c29    # 17.17f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x41a00000    # 20.0f

    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x40e00000    # 7.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x3f7e6666    # -4.05f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x4015c28f    # -1.83f

    .line 436
    .line 437
    .line 438
    const/high16 v2, -0x40000000    # -2.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x411e147b    # 9.88f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x40c23d71    # 6.07f

    .line 450
    .line 451
    .line 452
    const v2, 0x410e6666    # 8.9f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x41ba7ae1    # 23.31f

    .line 462
    .line 463
    .line 464
    const v2, 0x41a3eb85    # 20.49f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x41915c29    # 18.17f

    .line 471
    .line 472
    .line 473
    const/high16 v2, 0x41a80000    # 21.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x40800000    # 4.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, -0x40000000    # -2.0f

    .line 484
    .line 485
    const/high16 v18, -0x40000000    # -2.0f

    .line 486
    .line 487
    const v13, -0x40733333    # -1.1f

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const/high16 v15, -0x40000000    # -2.0f

    .line 492
    .line 493
    const v16, -0x4099999a    # -0.9f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x40e00000    # 7.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x3f2e147b    # 0.68f

    .line 505
    .line 506
    .line 507
    const v18, -0x404147ae    # -1.49f

    .line 508
    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x40e8f5c3    # -0.59f

    .line 512
    .line 513
    .line 514
    const v15, 0x3e8a3d71    # 0.27f

    .line 515
    .line 516
    .line 517
    const v16, -0x4070a3d7    # -1.12f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, -0x40000000    # -2.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x40066666    # 2.1f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40e00000    # 7.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x4000a3d7    # 2.01f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x3fb70a3d    # 1.43f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x40833333    # 4.1f

    .line 552
    .line 553
    .line 554
    const v2, 0x40833333    # 4.1f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3fb70a3d    # 1.43f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x41980000    # 19.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x3fe8f5c3    # 1.82f

    .line 572
    .line 573
    .line 574
    const v2, 0x3fe8f5c3    # 1.82f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x3f8a3d71    # 1.08f

    .line 581
    .line 582
    .line 583
    const v2, 0x3f8a3d71    # 1.08f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x41ba7ae1    # 23.31f

    .line 590
    .line 591
    .line 592
    const v2, 0x41a3eb85    # 20.49f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x41130a3d    # 9.19f

    .line 602
    .line 603
    .line 604
    const v2, 0x414051ec    # 12.02f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x41100000    # 9.0f

    .line 611
    .line 612
    const/high16 v18, 0x41500000    # 13.0f

    .line 613
    .line 614
    const v13, 0x411147ae    # 9.08f

    .line 615
    .line 616
    .line 617
    const v14, 0x414547ae    # 12.33f

    .line 618
    .line 619
    .line 620
    const/high16 v15, 0x41100000    # 9.0f

    .line 621
    .line 622
    const v16, 0x414a6666    # 12.65f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, 0x40400000    # 3.0f

    .line 629
    .line 630
    const/high16 v18, 0x40400000    # 3.0f

    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const v14, 0x3fd33333    # 1.65f

    .line 634
    .line 635
    .line 636
    const v15, 0x3faccccd    # 1.35f

    .line 637
    .line 638
    .line 639
    const/high16 v16, 0x40400000    # 3.0f

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, 0x3f7ae148    # 0.98f

    .line 645
    .line 646
    .line 647
    const v18, -0x41bd70a4    # -0.19f

    .line 648
    .line 649
    .line 650
    const v13, 0x3eb33333    # 0.35f

    .line 651
    .line 652
    .line 653
    const/4 v14, 0x0

    .line 654
    const v15, 0x3f2b851f    # 0.67f

    .line 655
    .line 656
    .line 657
    const v16, -0x425c28f6    # -0.08f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x41815c29    # 16.17f

    .line 670
    .line 671
    .line 672
    const/high16 v2, 0x41980000    # 19.0f

    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, -0x4028f5c3    # -1.68f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x41400000    # 12.0f

    .line 684
    .line 685
    const/high16 v18, 0x41900000    # 18.0f

    .line 686
    .line 687
    const v13, 0x415c28f6    # 13.76f

    .line 688
    .line 689
    .line 690
    const/high16 v14, 0x418e0000    # 17.75f

    .line 691
    .line 692
    const v15, 0x414e8f5c    # 12.91f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x41900000    # 18.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v17, -0x3f600000    # -5.0f

    .line 701
    .line 702
    const/high16 v18, -0x3f600000    # -5.0f

    .line 703
    .line 704
    const v13, -0x3fcf5c29    # -2.76f

    .line 705
    .line 706
    .line 707
    const/4 v14, 0x0

    .line 708
    const/high16 v15, -0x3f600000    # -5.0f

    .line 709
    .line 710
    const v16, -0x3ff0a3d7    # -2.24f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, 0x3f2e147b    # 0.68f

    .line 717
    .line 718
    .line 719
    const v18, -0x3fe0a3d7    # -2.49f

    .line 720
    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const v14, -0x40970a3d    # -0.91f

    .line 724
    .line 725
    .line 726
    const/high16 v15, 0x3e800000    # 0.25f

    .line 727
    .line 728
    const v16, -0x401eb852    # -1.76f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x408570a4    # 4.17f

    .line 735
    .line 736
    .line 737
    const/high16 v2, 0x40e00000    # 7.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x40800000    # 4.0f

    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v0, 0x41400000    # 12.0f

    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x41815c29    # 16.17f

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x416cf5c3    # 14.81f

    .line 762
    .line 763
    .line 764
    const v2, 0x413fae14    # 11.98f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, 0x40051eb8    # 2.08f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v17, 0x41880000    # 17.0f

    .line 777
    .line 778
    const/high16 v18, 0x41500000    # 13.0f

    .line 779
    .line 780
    const v13, 0x4187ae14    # 16.96f

    .line 781
    .line 782
    .line 783
    const v14, 0x415b5c29    # 13.71f

    .line 784
    .line 785
    .line 786
    const/high16 v15, 0x41880000    # 17.0f

    .line 787
    .line 788
    const v16, 0x4155c28f    # 13.36f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v17, -0x3f600000    # -5.0f

    .line 795
    .line 796
    const/high16 v18, -0x3f600000    # -5.0f

    .line 797
    .line 798
    const/4 v13, 0x0

    .line 799
    const v14, -0x3fcf5c29    # -2.76f

    .line 800
    .line 801
    .line 802
    const v15, -0x3ff0a3d7    # -2.24f

    .line 803
    .line 804
    .line 805
    const/high16 v16, -0x3f600000    # -5.0f

    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v17, -0x407851ec    # -1.06f

    .line 811
    .line 812
    .line 813
    const v18, 0x3df5c28f    # 0.12f

    .line 814
    .line 815
    .line 816
    const v13, -0x4147ae14    # -0.36f

    .line 817
    .line 818
    .line 819
    const/4 v14, 0x0

    .line 820
    const v15, -0x40ca3d71    # -0.71f

    .line 821
    .line 822
    .line 823
    const v16, 0x3d23d70a    # 0.04f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v17, 0x416cf5c3    # 14.81f

    .line 833
    .line 834
    .line 835
    const v18, 0x413fae14    # 11.98f

    .line 836
    .line 837
    .line 838
    const v13, 0x415d999a    # 13.85f

    .line 839
    .line 840
    .line 841
    const/high16 v14, 0x41280000    # 10.5f

    .line 842
    .line 843
    const/high16 v15, 0x41680000    # 14.5f

    .line 844
    .line 845
    const v16, 0x41326666    # 11.15f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    const/16 v16, 0x3800

    .line 859
    .line 860
    const/16 v17, 0x0

    .line 861
    .line 862
    const/high16 v6, 0x3f800000    # 1.0f

    .line 863
    .line 864
    const/high16 v8, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/4 v7, 0x0

    .line 867
    const/high16 v12, 0x3f800000    # 1.0f

    .line 868
    .line 869
    const/4 v13, 0x0

    .line 870
    const/4 v14, 0x0

    .line 871
    const/4 v15, 0x0

    .line 872
    const-string v4, ""

    .line 873
    .line 874
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    sput-object v0, Landroidx/compose/material/icons/twotone/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 883
    .line 884
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    return-object v0
.end method
