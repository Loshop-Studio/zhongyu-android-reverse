.class public final Landroidx/compose/material/icons/outlined/DoNotDisturbOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotDisturbOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DoNotDisturbOffKt;->_doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DoNotDisturbOff"

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
    const v4, 0x40a3d70a    # 5.12f

    .line 71
    .line 72
    .line 73
    const v6, 0x40fe147b    # 7.94f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x40800000    # 4.0f

    .line 82
    .line 83
    const v21, 0x41123d71    # 9.14f

    .line 84
    .line 85
    .line 86
    const v22, 0x408d1eb8    # 4.41f

    .line 87
    .line 88
    .line 89
    const v23, 0x412851ec    # 10.52f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40800000    # 4.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x41000000    # 8.0f

    .line 100
    .line 101
    const/high16 v26, 0x41000000    # 8.0f

    .line 102
    .line 103
    const v21, 0x408d1eb8    # 4.41f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x41000000    # 8.0f

    .line 109
    .line 110
    const v24, 0x4065c28f    # 3.59f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, -0x4070a3d7    # -1.12f

    .line 117
    .line 118
    .line 119
    const v26, 0x4081eb85    # 4.06f

    .line 120
    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const v22, 0x3fbd70a4    # 1.48f

    .line 125
    .line 126
    .line 127
    const v23, -0x412e147b    # -0.41f

    .line 128
    .line 129
    .line 130
    const v24, 0x40370a3d    # 2.86f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x3fbae148    # 1.46f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, 0x41b00000    # 22.0f

    .line 143
    .line 144
    const/high16 v26, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v21, 0x41ab1eb8    # 21.39f

    .line 147
    .line 148
    .line 149
    const v22, 0x417ee148    # 15.93f

    .line 150
    .line 151
    .line 152
    const/high16 v23, 0x41b00000    # 22.0f

    .line 153
    .line 154
    const v24, 0x4160a3d7    # 14.04f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v25, -0x3ee00000    # -10.0f

    .line 161
    .line 162
    const/high16 v26, -0x3ee00000    # -10.0f

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    const v22, -0x3f4f5c29    # -5.52f

    .line 167
    .line 168
    .line 169
    const v23, -0x3f70a3d7    # -4.48f

    .line 170
    .line 171
    .line 172
    const/high16 v24, -0x3ee00000    # -10.0f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x40cfae14    # 6.49f

    .line 178
    .line 179
    .line 180
    const v26, 0x406a3d71    # 3.66f

    .line 181
    .line 182
    .line 183
    const v21, 0x411f5c29    # 9.96f

    .line 184
    .line 185
    .line 186
    const/high16 v22, 0x40000000    # 2.0f

    .line 187
    .line 188
    const v23, 0x41011eb8    # 8.07f

    .line 189
    .line 190
    .line 191
    const v24, 0x40270a3d    # 2.61f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x40a3d70a    # 5.12f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/high16 v6, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v8, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const v4, 0x4033d70a    # 2.81f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x3fb1eb85    # 1.39f

    .line 265
    .line 266
    .line 267
    const v6, 0x40870a3d    # 4.22f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x401147ae    # 2.27f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v25, 0x40000000    # 2.0f

    .line 280
    .line 281
    const/high16 v26, 0x41400000    # 12.0f

    .line 282
    .line 283
    const v21, 0x40270a3d    # 2.61f

    .line 284
    .line 285
    .line 286
    const v22, 0x41011eb8    # 8.07f

    .line 287
    .line 288
    .line 289
    const/high16 v23, 0x40000000    # 2.0f

    .line 290
    .line 291
    const v24, 0x411f5c29    # 9.96f

    .line 292
    .line 293
    .line 294
    move-object/from16 v20, v2

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x41200000    # 10.0f

    .line 300
    .line 301
    const/high16 v26, 0x41200000    # 10.0f

    .line 302
    .line 303
    const/16 v21, 0x0

    .line 304
    .line 305
    const v22, 0x40b0a3d7    # 5.52f

    .line 306
    .line 307
    .line 308
    const v23, 0x408f5c29    # 4.48f

    .line 309
    .line 310
    .line 311
    const/high16 v24, 0x41200000    # 10.0f

    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, 0x40b051ec    # 5.51f

    .line 317
    .line 318
    .line 319
    const v26, -0x402b851f    # -1.66f

    .line 320
    .line 321
    .line 322
    const v21, 0x40028f5c    # 2.04f

    .line 323
    .line 324
    .line 325
    const/16 v22, 0x0

    .line 326
    .line 327
    const v23, 0x407b851f    # 3.93f

    .line 328
    .line 329
    .line 330
    const v24, -0x40e3d70a    # -0.61f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x3fb47ae1    # 1.41f

    .line 340
    .line 341
    .line 342
    const v6, -0x404b851f    # -1.41f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v4, 0x4033d70a    # 2.81f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, 0x41400000    # 12.0f

    .line 358
    .line 359
    const/high16 v6, 0x41a00000    # 20.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v25, -0x3f000000    # -8.0f

    .line 365
    .line 366
    const/high16 v26, -0x3f000000    # -8.0f

    .line 367
    .line 368
    const v21, -0x3f72e148    # -4.41f

    .line 369
    .line 370
    .line 371
    const/high16 v23, -0x3f000000    # -8.0f

    .line 372
    .line 373
    const v24, -0x3f9a3d71    # -3.59f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x3f8f5c29    # 1.12f

    .line 380
    .line 381
    .line 382
    const v26, -0x3f7e147b    # -4.06f

    .line 383
    .line 384
    .line 385
    const/16 v21, 0x0

    .line 386
    .line 387
    const v22, -0x40428f5c    # -1.48f

    .line 388
    .line 389
    .line 390
    const v23, 0x3ed1eb85    # 0.41f

    .line 391
    .line 392
    .line 393
    const v24, -0x3fc8f5c3    # -2.86f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v4, 0x4102b852    # 8.17f

    .line 400
    .line 401
    .line 402
    const/high16 v6, 0x41300000    # 11.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x40e00000    # 7.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x40000000    # 2.0f

    .line 413
    .line 414
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x404ae148    # 3.17f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, 0x40bc28f6    # 5.88f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v25, 0x41400000    # 12.0f

    .line 430
    .line 431
    const/high16 v26, 0x41a00000    # 20.0f

    .line 432
    .line 433
    const v21, 0x416dc28f    # 14.86f

    .line 434
    .line 435
    .line 436
    const v22, 0x419cb852    # 19.59f

    .line 437
    .line 438
    .line 439
    const v23, 0x4157ae14    # 13.48f

    .line 440
    .line 441
    .line 442
    const/high16 v24, 0x41a00000    # 20.0f

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 467
    .line 468
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 469
    .line 470
    .line 471
    move-result-wide v6

    .line 472
    const/4 v0, 0x0

    .line 473
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 477
    .line 478
    .line 479
    move-result v10

    .line 480
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 487
    .line 488
    .line 489
    const v2, 0x415d47ae    # 13.83f

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x41300000    # 11.0f

    .line 493
    .line 494
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x40000000    # 2.0f

    .line 498
    .line 499
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v2, 0x3f95c28f    # 1.17f

    .line 503
    .line 504
    .line 505
    const/4 v4, 0x0

    .line 506
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v2, -0x40000000    # -2.0f

    .line 510
    .line 511
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const/high16 v6, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const-string v4, ""

    .line 525
    .line 526
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    sput-object v0, Landroidx/compose/material/icons/outlined/DoNotDisturbOffKt;->_doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    return-object v0
.end method
