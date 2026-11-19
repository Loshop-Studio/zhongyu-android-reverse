.class public final Landroidx/compose/material/icons/twotone/TokenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _token:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getToken(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TokenKt;->_token:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Token"

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
    const v4, 0x408947ae    # 4.29f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x4051eb85    # 3.28f

    .line 79
    .line 80
    .line 81
    const v6, 0x40bd1eb8    # 5.91f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x416e6666    # 14.9f

    .line 88
    .line 89
    .line 90
    const v6, 0x4113d70a    # 9.24f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v26, 0x41000000    # 8.0f

    .line 99
    .line 100
    const v21, 0x4162b852    # 14.17f

    .line 101
    .line 102
    .line 103
    const v22, 0x4107ae14    # 8.48f

    .line 104
    .line 105
    .line 106
    const v23, 0x41523d71    # 13.14f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x41000000    # 8.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x4111999a    # 9.1f

    .line 117
    .line 118
    .line 119
    const v6, 0x4107ae14    # 8.48f

    .line 120
    .line 121
    .line 122
    const v7, 0x411d47ae    # 9.83f

    .line 123
    .line 124
    .line 125
    const v8, 0x4113d70a    # 9.24f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v7, v6, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x40f23d71    # 7.57f

    .line 132
    .line 133
    .line 134
    const v6, 0x40c2e148    # 6.09f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x408947ae    # 4.29f

    .line 141
    .line 142
    .line 143
    const/high16 v6, 0x41400000    # 12.0f

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x41300000    # 11.0f

    .line 152
    .line 153
    const v6, 0x419947ae    # 19.16f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x3faae148    # -3.33f

    .line 160
    .line 161
    .line 162
    const/high16 v6, -0x3f400000    # -6.0f

    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x411428f6    # 9.26f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x404851ec    # 3.13f

    .line 174
    .line 175
    .line 176
    const v6, 0x3fdeb852    # 1.74f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x41000000    # 8.0f

    .line 183
    .line 184
    const/high16 v26, 0x41400000    # 12.0f

    .line 185
    .line 186
    const v21, 0x4100a3d7    # 8.04f

    .line 187
    .line 188
    .line 189
    const v22, 0x4134f5c3    # 11.31f

    .line 190
    .line 191
    .line 192
    const/high16 v23, 0x41000000    # 8.0f

    .line 193
    .line 194
    const v24, 0x413a6666    # 11.65f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, 0x40400000    # 3.0f

    .line 201
    .line 202
    const v26, 0x4077ae14    # 3.87f

    .line 203
    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, 0x3fee147b    # 1.86f

    .line 208
    .line 209
    .line 210
    const v23, 0x3fa28f5c    # 1.27f

    .line 211
    .line 212
    .line 213
    const v24, 0x405b851f    # 3.43f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x419947ae    # 19.16f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41200000    # 10.0f

    .line 229
    .line 230
    const/high16 v6, 0x41400000    # 12.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v25, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/high16 v26, -0x40000000    # -2.0f

    .line 238
    .line 239
    const v22, -0x40733333    # -1.1f

    .line 240
    .line 241
    .line 242
    const v23, 0x3f666666    # 0.9f

    .line 243
    .line 244
    .line 245
    const/high16 v24, -0x40000000    # -2.0f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v4, 0x3f666666    # 0.9f

    .line 251
    .line 252
    .line 253
    const/high16 v6, 0x40000000    # 2.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, -0x4099999a    # -0.9f

    .line 259
    .line 260
    .line 261
    const/high16 v6, -0x40000000    # -2.0f

    .line 262
    .line 263
    const/high16 v7, 0x40000000    # 2.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x4151999a    # 13.1f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x41200000    # 10.0f

    .line 272
    .line 273
    const/high16 v7, 0x41400000    # 12.0f

    .line 274
    .line 275
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v4, 0x41500000    # 13.0f

    .line 282
    .line 283
    const v6, 0x419947ae    # 19.16f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, -0x3fae147b    # -3.28f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x40400000    # 3.0f

    .line 296
    .line 297
    const v26, -0x3f8851ec    # -3.87f

    .line 298
    .line 299
    .line 300
    const v21, 0x3fdd70a4    # 1.73f

    .line 301
    .line 302
    .line 303
    const v22, -0x411eb852    # -0.44f

    .line 304
    .line 305
    .line 306
    const/high16 v23, 0x40400000    # 3.0f

    .line 307
    .line 308
    const v24, -0x3fff5c29    # -2.01f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, -0x41fae148    # -0.13f

    .line 315
    .line 316
    .line 317
    const v26, -0x407eb852    # -1.01f

    .line 318
    .line 319
    .line 320
    const/16 v21, 0x0

    .line 321
    .line 322
    const v22, -0x414ccccd    # -0.35f

    .line 323
    .line 324
    .line 325
    const v23, -0x42dc28f6    # -0.04f

    .line 326
    .line 327
    .line 328
    const v24, -0x40cf5c29    # -0.69f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x41980000    # 19.0f

    .line 335
    .line 336
    const v6, 0x411428f6    # 9.26f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/4 v4, 0x0

    .line 343
    const v6, 0x40d23d71    # 6.57f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x41500000    # 13.0f

    .line 350
    .line 351
    const v6, 0x419947ae    # 19.16f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const/16 v16, 0x3800

    .line 365
    .line 366
    const/16 v17, 0x0

    .line 367
    .line 368
    const v6, 0x3e99999a    # 0.3f

    .line 369
    .line 370
    .line 371
    const v8, 0x3e99999a    # 0.3f

    .line 372
    .line 373
    .line 374
    const/4 v7, 0x0

    .line 375
    const/high16 v9, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/high16 v12, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const/4 v14, 0x0

    .line 381
    const/4 v15, 0x0

    .line 382
    const-string v4, ""

    .line 383
    .line 384
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 385
    .line 386
    .line 387
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 392
    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 394
    .line 395
    .line 396
    move-result-wide v6

    .line 397
    const/4 v0, 0x0

    .line 398
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41a80000    # 21.0f

    .line 415
    .line 416
    const/high16 v2, 0x40e00000    # 7.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 422
    .line 423
    const/high16 v2, -0x3f600000    # -5.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x40400000    # 3.0f

    .line 429
    .line 430
    const/high16 v2, 0x40e00000    # 7.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41200000    # 10.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x41100000    # 9.0f

    .line 441
    .line 442
    const/high16 v2, 0x40a00000    # 5.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v2, -0x3f600000    # -5.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41a80000    # 21.0f

    .line 453
    .line 454
    const/high16 v2, 0x40e00000    # 7.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x408947ae    # 4.29f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x41400000    # 12.0f

    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x4051eb85    # 3.28f

    .line 471
    .line 472
    .line 473
    const v2, 0x40bd1eb8    # 5.91f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x416e6666    # 14.9f

    .line 480
    .line 481
    .line 482
    const v2, 0x4113d70a    # 9.24f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x41400000    # 12.0f

    .line 489
    .line 490
    const/high16 v18, 0x41000000    # 8.0f

    .line 491
    .line 492
    const v13, 0x4162b852    # 14.17f

    .line 493
    .line 494
    .line 495
    const v14, 0x4107ae14    # 8.48f

    .line 496
    .line 497
    .line 498
    const v15, 0x41523d71    # 13.14f

    .line 499
    .line 500
    .line 501
    const/high16 v16, 0x41000000    # 8.0f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4111999a    # 9.1f

    .line 507
    .line 508
    .line 509
    const v2, 0x4107ae14    # 8.48f

    .line 510
    .line 511
    .line 512
    const v4, 0x411d47ae    # 9.83f

    .line 513
    .line 514
    .line 515
    const v6, 0x4113d70a    # 9.24f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x40f23d71    # 7.57f

    .line 522
    .line 523
    .line 524
    const v2, 0x40c2e148    # 6.09f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x408947ae    # 4.29f

    .line 531
    .line 532
    .line 533
    const/high16 v2, 0x41400000    # 12.0f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41300000    # 11.0f

    .line 542
    .line 543
    const v2, 0x419947ae    # 19.16f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, -0x3faae148    # -3.33f

    .line 550
    .line 551
    .line 552
    const/high16 v2, -0x3f400000    # -6.0f

    .line 553
    .line 554
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x411428f6    # 9.26f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x404851ec    # 3.13f

    .line 564
    .line 565
    .line 566
    const v2, 0x3fdeb852    # 1.74f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, 0x41000000    # 8.0f

    .line 573
    .line 574
    const/high16 v18, 0x41400000    # 12.0f

    .line 575
    .line 576
    const v13, 0x4100a3d7    # 8.04f

    .line 577
    .line 578
    .line 579
    const v14, 0x4134f5c3    # 11.31f

    .line 580
    .line 581
    .line 582
    const/high16 v15, 0x41000000    # 8.0f

    .line 583
    .line 584
    const v16, 0x413a6666    # 11.65f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x40400000    # 3.0f

    .line 591
    .line 592
    const v18, 0x4077ae14    # 3.87f

    .line 593
    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const v14, 0x3fee147b    # 1.86f

    .line 597
    .line 598
    .line 599
    const v15, 0x3fa28f5c    # 1.27f

    .line 600
    .line 601
    .line 602
    const v16, 0x405b851f    # 3.43f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x419947ae    # 19.16f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41200000    # 10.0f

    .line 618
    .line 619
    const/high16 v2, 0x41400000    # 12.0f

    .line 620
    .line 621
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x40000000    # 2.0f

    .line 625
    .line 626
    const/high16 v18, -0x40000000    # -2.0f

    .line 627
    .line 628
    const v14, -0x40733333    # -1.1f

    .line 629
    .line 630
    .line 631
    const v15, 0x3f666666    # 0.9f

    .line 632
    .line 633
    .line 634
    const/high16 v16, -0x40000000    # -2.0f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x3f666666    # 0.9f

    .line 640
    .line 641
    .line 642
    const/high16 v2, 0x40000000    # 2.0f

    .line 643
    .line 644
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, -0x4099999a    # -0.9f

    .line 648
    .line 649
    .line 650
    const/high16 v2, -0x40000000    # -2.0f

    .line 651
    .line 652
    const/high16 v4, 0x40000000    # 2.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x4151999a    # 13.1f

    .line 658
    .line 659
    .line 660
    const/high16 v2, 0x41200000    # 10.0f

    .line 661
    .line 662
    const/high16 v4, 0x41400000    # 12.0f

    .line 663
    .line 664
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x41500000    # 13.0f

    .line 671
    .line 672
    const v2, 0x419947ae    # 19.16f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, -0x3fae147b    # -3.28f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, 0x40400000    # 3.0f

    .line 685
    .line 686
    const v18, -0x3f8851ec    # -3.87f

    .line 687
    .line 688
    .line 689
    const v13, 0x3fdd70a4    # 1.73f

    .line 690
    .line 691
    .line 692
    const v14, -0x411eb852    # -0.44f

    .line 693
    .line 694
    .line 695
    const/high16 v15, 0x40400000    # 3.0f

    .line 696
    .line 697
    const v16, -0x3fff5c29    # -2.01f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, -0x41fae148    # -0.13f

    .line 704
    .line 705
    .line 706
    const v18, -0x407eb852    # -1.01f

    .line 707
    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const v14, -0x414ccccd    # -0.35f

    .line 711
    .line 712
    .line 713
    const v15, -0x42dc28f6    # -0.04f

    .line 714
    .line 715
    .line 716
    const v16, -0x40cf5c29    # -0.69f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x41980000    # 19.0f

    .line 723
    .line 724
    const v2, 0x411428f6    # 9.26f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/4 v0, 0x0

    .line 731
    const v2, 0x40d23d71    # 6.57f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x41500000    # 13.0f

    .line 738
    .line 739
    const v2, 0x419947ae    # 19.16f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/16 v16, 0x3800

    .line 753
    .line 754
    const/16 v17, 0x0

    .line 755
    .line 756
    const/high16 v6, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/high16 v8, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/4 v7, 0x0

    .line 761
    const/high16 v12, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v14, 0x0

    .line 764
    const/4 v15, 0x0

    .line 765
    const-string v4, ""

    .line 766
    .line 767
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    sput-object v0, Landroidx/compose/material/icons/twotone/TokenKt;->_token:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 776
    .line 777
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    return-object v0
.end method
