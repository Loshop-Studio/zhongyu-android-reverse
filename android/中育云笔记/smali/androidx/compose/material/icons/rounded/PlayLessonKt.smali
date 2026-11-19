.class public final Landroidx/compose/material/icons/rounded/PlayLessonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlayLesson(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PlayLessonKt;->_playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PlayLesson"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const v26, 0x3da3d70a    # 0.08f

    .line 80
    .line 81
    .line 82
    const v21, 0x3eae147b    # 0.34f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v24, 0x3cf5c28f    # 0.03f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x40800000    # 4.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v25, -0x40000000    # -2.0f

    .line 104
    .line 105
    const/high16 v26, -0x40000000    # -2.0f

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, -0x40733333    # -1.1f

    .line 110
    .line 111
    .line 112
    const v23, -0x4099999a    # -0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v24, -0x40000000    # -2.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40a00000    # 5.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x40400000    # 3.0f

    .line 126
    .line 127
    const/high16 v26, 0x40800000    # 4.0f

    .line 128
    .line 129
    const v21, 0x4079999a    # 3.9f

    .line 130
    .line 131
    .line 132
    const/high16 v22, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/high16 v23, 0x40400000    # 3.0f

    .line 135
    .line 136
    const v24, 0x4039999a    # 2.9f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x41800000    # 16.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, 0x40000000    # 2.0f

    .line 148
    .line 149
    const/high16 v26, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, 0x3f8ccccd    # 1.1f

    .line 154
    .line 155
    .line 156
    const v23, 0x3f666666    # 0.9f

    .line 157
    .line 158
    .line 159
    const/high16 v24, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x40e851ec    # 7.26f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, 0x41300000    # 11.0f

    .line 171
    .line 172
    const/high16 v26, 0x41900000    # 18.0f

    .line 173
    .line 174
    const v21, 0x4137851f    # 11.47f

    .line 175
    .line 176
    .line 177
    const v22, 0x41a6f5c3    # 20.87f

    .line 178
    .line 179
    .line 180
    const/high16 v23, 0x41300000    # 11.0f

    .line 181
    .line 182
    const v24, 0x419beb85    # 19.49f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x41900000    # 18.0f

    .line 189
    .line 190
    const/high16 v26, 0x41300000    # 11.0f

    .line 191
    .line 192
    const/high16 v21, 0x41300000    # 11.0f

    .line 193
    .line 194
    const v22, 0x4162147b    # 14.13f

    .line 195
    .line 196
    .line 197
    const v23, 0x4162147b    # 14.13f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x41300000    # 11.0f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v4, 0x4128cccd    # 10.55f

    .line 209
    .line 210
    .line 211
    const v6, 0x40f851ec    # 7.76f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x40e00000    # 7.0f

    .line 218
    .line 219
    const v26, 0x4121eb85    # 10.12f

    .line 220
    .line 221
    .line 222
    const v21, 0x40ed70a4    # 7.42f

    .line 223
    .line 224
    .line 225
    const/high16 v22, 0x412c0000    # 10.75f

    .line 226
    .line 227
    const/high16 v23, 0x40e00000    # 7.0f

    .line 228
    .line 229
    const v24, 0x412828f6    # 10.51f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x40800000    # 4.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x40a00000    # 5.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x40c3d70a    # 6.12f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, -0x40bd70a4    # -0.76f

    .line 252
    .line 253
    .line 254
    const v26, 0x3edc28f6    # 0.43f

    .line 255
    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const v22, 0x3ec7ae14    # 0.39f

    .line 260
    .line 261
    .line 262
    const v23, -0x4128f5c3    # -0.42f

    .line 263
    .line 264
    .line 265
    const v24, 0x3f2147ae    # 0.63f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x41180000    # 9.5f

    .line 272
    .line 273
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x4128cccd    # 10.55f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const/16 v16, 0x3800

    .line 290
    .line 291
    const/16 v17, 0x0

    .line 292
    .line 293
    const/high16 v6, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v8, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/high16 v9, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v0, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41500000    # 13.0f

    .line 338
    .line 339
    const/high16 v2, 0x41900000    # 18.0f

    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, -0x3f600000    # -5.0f

    .line 345
    .line 346
    const/high16 v18, 0x40a00000    # 5.0f

    .line 347
    .line 348
    const v13, -0x3fcf5c29    # -2.76f

    .line 349
    .line 350
    .line 351
    const/high16 v15, -0x3f600000    # -5.0f

    .line 352
    .line 353
    const v16, 0x400f5c29    # 2.24f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x400f5c29    # 2.24f

    .line 360
    .line 361
    .line 362
    const/high16 v2, 0x40a00000    # 5.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3ff0a3d7    # -2.24f

    .line 368
    .line 369
    .line 370
    const/high16 v2, -0x3f600000    # -5.0f

    .line 371
    .line 372
    const/high16 v4, 0x40a00000    # 5.0f

    .line 373
    .line 374
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x41a6147b    # 20.76f

    .line 378
    .line 379
    .line 380
    const/high16 v2, 0x41500000    # 13.0f

    .line 381
    .line 382
    const/high16 v4, 0x41900000    # 18.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41860000    # 16.75f

    .line 391
    .line 392
    const v2, 0x419ccccd    # 19.6f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x3fb33333    # -3.2f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3f428f5c    # 0.76f

    .line 405
    .line 406
    .line 407
    const v18, -0x4128f5c3    # -0.42f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, -0x413851ec    # -0.39f

    .line 412
    .line 413
    .line 414
    const v15, 0x3edc28f6    # 0.43f

    .line 415
    .line 416
    .line 417
    const v16, -0x40deb852    # -0.63f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4023d70a    # 2.56f

    .line 424
    .line 425
    .line 426
    const v2, 0x3fcccccd    # 1.6f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/16 v17, 0x0

    .line 433
    .line 434
    const v18, 0x3f59999a    # 0.85f

    .line 435
    .line 436
    .line 437
    const v13, 0x3e9eb852    # 0.31f

    .line 438
    .line 439
    .line 440
    const v14, 0x3e4ccccd    # 0.2f

    .line 441
    .line 442
    .line 443
    const v15, 0x3e9eb852    # 0.31f

    .line 444
    .line 445
    .line 446
    const v16, 0x3f266666    # 0.65f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, -0x3fdc28f6    # -2.56f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x41860000    # 16.75f

    .line 459
    .line 460
    const v18, 0x419ccccd    # 19.6f

    .line 461
    .line 462
    .line 463
    const v13, 0x418970a4    # 17.18f

    .line 464
    .line 465
    .line 466
    const v14, 0x41a1d70a    # 20.23f

    .line 467
    .line 468
    .line 469
    const/high16 v15, 0x41860000    # 16.75f

    .line 470
    .line 471
    const v16, 0x419feb85    # 19.99f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v7, 0x0

    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const/4 v14, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Landroidx/compose/material/icons/rounded/PlayLessonKt;->_playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v0
.end method
