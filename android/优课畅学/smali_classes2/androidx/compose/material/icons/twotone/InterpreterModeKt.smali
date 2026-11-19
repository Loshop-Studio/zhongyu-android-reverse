.class public final Landroidx/compose/material/icons/twotone/InterpreterModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInterpreterMode(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/InterpreterModeKt;->_interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.InterpreterMode"

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
    const v4, 0x417851ec    # 15.52f

    .line 71
    .line 72
    .line 73
    const v6, 0x417028f6    # 15.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41700000    # 15.0f

    .line 80
    .line 81
    const/high16 v26, 0x41700000    # 15.0f

    .line 82
    .line 83
    const v21, 0x4175999a    # 15.35f

    .line 84
    .line 85
    .line 86
    const/high16 v22, 0x41700000    # 15.0f

    .line 87
    .line 88
    const v23, 0x4172e148    # 15.18f

    .line 89
    .line 90
    .line 91
    const/high16 v24, 0x41700000    # 15.0f

    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, -0x3f50a3d7    # -5.48f

    .line 99
    .line 100
    .line 101
    const v26, 0x3fab851f    # 1.34f

    .line 102
    .line 103
    .line 104
    const v21, -0x3fe851ec    # -2.37f

    .line 105
    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const v23, -0x3f76b852    # -4.29f

    .line 110
    .line 111
    .line 112
    const v24, 0x3f3ae148    # 0.73f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, 0x41100000    # 9.0f

    .line 119
    .line 120
    const v26, 0x4189c28f    # 17.22f

    .line 121
    .line 122
    .line 123
    const v21, 0x41133333    # 9.2f

    .line 124
    .line 125
    .line 126
    const/high16 v22, 0x41840000    # 16.5f

    .line 127
    .line 128
    const/high16 v23, 0x41100000    # 9.0f

    .line 129
    .line 130
    const v24, 0x4186b852    # 16.84f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41900000    # 18.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const v6, 0x40e570a4    # 7.17f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, 0x417851ec    # 15.52f

    .line 149
    .line 150
    .line 151
    const v26, 0x417028f6    # 15.01f

    .line 152
    .line 153
    .line 154
    const v21, 0x417bd70a    # 15.74f

    .line 155
    .line 156
    .line 157
    const v22, 0x418a147b    # 17.26f

    .line 158
    .line 159
    .line 160
    const v23, 0x41766666    # 15.4f

    .line 161
    .line 162
    .line 163
    const v24, 0x4181eb85    # 16.24f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x41000000    # 8.0f

    .line 173
    .line 174
    const/high16 v6, 0x41500000    # 13.0f

    .line 175
    .line 176
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v26, 0x40000000    # 2.0f

    .line 182
    .line 183
    const/16 v21, 0x0

    .line 184
    .line 185
    const v22, 0x3f8ccccd    # 1.1f

    .line 186
    .line 187
    .line 188
    const v23, 0x3f666666    # 0.9f

    .line 189
    .line 190
    .line 191
    const/high16 v24, 0x40000000    # 2.0f

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, -0x40000000    # -2.0f

    .line 197
    .line 198
    const v6, -0x4099999a    # -0.9f

    .line 199
    .line 200
    .line 201
    const/high16 v7, 0x40000000    # 2.0f

    .line 202
    .line 203
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, -0x40000000    # -2.0f

    .line 207
    .line 208
    const/high16 v26, -0x40000000    # -2.0f

    .line 209
    .line 210
    const v22, -0x40733333    # -1.1f

    .line 211
    .line 212
    .line 213
    const v23, -0x4099999a    # -0.9f

    .line 214
    .line 215
    .line 216
    const/high16 v24, -0x40000000    # -2.0f

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x40dccccd    # 6.9f

    .line 222
    .line 223
    .line 224
    const/high16 v6, 0x41000000    # 8.0f

    .line 225
    .line 226
    const/high16 v7, 0x41500000    # 13.0f

    .line 227
    .line 228
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    const/16 v16, 0x3800

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const v6, 0x3e99999a    # 0.3f

    .line 243
    .line 244
    .line 245
    const v8, 0x3e99999a    # 0.3f

    .line 246
    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    const/high16 v9, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v12, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    const-string v4, ""

    .line 257
    .line 258
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 259
    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 266
    .line 267
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 268
    .line 269
    .line 270
    move-result-wide v6

    .line 271
    const/4 v0, 0x0

    .line 272
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41a40000    # 20.5f

    .line 289
    .line 290
    const/high16 v2, 0x41840000    # 16.5f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, -0x40400000    # -1.5f

    .line 296
    .line 297
    const/high16 v18, -0x40400000    # -1.5f

    .line 298
    .line 299
    const v13, -0x40ab851f    # -0.83f

    .line 300
    .line 301
    .line 302
    const/high16 v15, -0x40400000    # -1.5f

    .line 303
    .line 304
    const v16, -0x40d47ae1    # -0.67f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const v14, -0x40ab851f    # -0.83f

    .line 319
    .line 320
    .line 321
    const v15, 0x3f2b851f    # 0.67f

    .line 322
    .line 323
    .line 324
    const/high16 v16, -0x40400000    # -1.5f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3f2b851f    # 0.67f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41700000    # 15.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x41a40000    # 20.5f

    .line 343
    .line 344
    const/high16 v18, 0x41840000    # 16.5f

    .line 345
    .line 346
    const/high16 v13, 0x41b00000    # 22.0f

    .line 347
    .line 348
    const v14, 0x417d47ae    # 15.83f

    .line 349
    .line 350
    .line 351
    const v15, 0x41aaa3d7    # 21.33f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x41840000    # 16.5f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41a00000    # 20.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/16 v17, 0x0

    .line 373
    .line 374
    const v18, -0x403ae148    # -1.54f

    .line 375
    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const/4 v14, 0x0

    .line 379
    const/4 v15, 0x0

    .line 380
    const v16, -0x403ae148    # -1.54f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x40400000    # 3.0f

    .line 387
    .line 388
    const v18, -0x3fa28f5c    # -3.46f

    .line 389
    .line 390
    .line 391
    const v13, 0x3fd851ec    # 1.69f

    .line 392
    .line 393
    .line 394
    const v14, -0x418a3d71    # -0.24f

    .line 395
    .line 396
    .line 397
    const/high16 v15, 0x40400000    # 3.0f

    .line 398
    .line 399
    const v16, -0x40266666    # -1.7f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, -0x40800000    # -1.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 411
    .line 412
    const/high16 v18, 0x40200000    # 2.5f

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const v14, 0x3fb0a3d7    # 1.38f

    .line 416
    .line 417
    .line 418
    const v15, -0x4070a3d7    # -1.12f

    .line 419
    .line 420
    .line 421
    const/high16 v16, 0x40200000    # 2.5f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x41830a3d    # 16.38f

    .line 427
    .line 428
    .line 429
    const/high16 v2, 0x41700000    # 15.0f

    .line 430
    .line 431
    const/high16 v4, 0x41900000    # 18.0f

    .line 432
    .line 433
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, -0x40800000    # -1.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x40400000    # 3.0f

    .line 442
    .line 443
    const v18, 0x405d70a4    # 3.46f

    .line 444
    .line 445
    .line 446
    const v14, 0x3fe147ae    # 1.76f

    .line 447
    .line 448
    .line 449
    const v15, 0x3fa7ae14    # 1.31f

    .line 450
    .line 451
    .line 452
    const v16, 0x404e147b    # 3.22f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x41a00000    # 20.0f

    .line 459
    .line 460
    const/high16 v18, 0x41a00000    # 20.0f

    .line 461
    .line 462
    const/high16 v13, 0x41a00000    # 20.0f

    .line 463
    .line 464
    const v14, 0x4193ae14    # 18.46f

    .line 465
    .line 466
    .line 467
    const/high16 v15, 0x41a00000    # 20.0f

    .line 468
    .line 469
    const/high16 v16, 0x41a00000    # 20.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41100000    # 9.0f

    .line 478
    .line 479
    const/high16 v2, 0x41400000    # 12.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, -0x3f800000    # -4.0f

    .line 485
    .line 486
    const/high16 v18, -0x3f800000    # -4.0f

    .line 487
    .line 488
    const v13, -0x3ff28f5c    # -2.21f

    .line 489
    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/high16 v15, -0x3f800000    # -4.0f

    .line 493
    .line 494
    const v16, -0x401ae148    # -1.79f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x40800000    # 4.0f

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const v14, -0x3ff28f5c    # -2.21f

    .line 504
    .line 505
    .line 506
    const v15, 0x3fe51eb8    # 1.79f

    .line 507
    .line 508
    .line 509
    const/high16 v16, -0x3f800000    # -4.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x3fab851f    # 1.34f

    .line 515
    .line 516
    .line 517
    const v18, 0x3e6b851f    # 0.23f

    .line 518
    .line 519
    .line 520
    const v13, 0x3ef0a3d7    # 0.47f

    .line 521
    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    const v15, 0x3f6b851f    # 0.92f

    .line 525
    .line 526
    .line 527
    const v16, 0x3da3d70a    # 0.08f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41100000    # 9.0f

    .line 534
    .line 535
    const/high16 v18, 0x41000000    # 8.0f

    .line 536
    .line 537
    const/high16 v13, 0x41180000    # 9.5f

    .line 538
    .line 539
    const v14, 0x40a851ec    # 5.26f

    .line 540
    .line 541
    .line 542
    const/high16 v15, 0x41100000    # 9.0f

    .line 543
    .line 544
    const v16, 0x40d23d71    # 6.57f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, 0x3fab851f    # 1.34f

    .line 551
    .line 552
    .line 553
    const v18, 0x407147ae    # 3.77f

    .line 554
    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const v14, 0x3fb70a3d    # 1.43f

    .line 558
    .line 559
    .line 560
    const/high16 v15, 0x3f000000    # 0.5f

    .line 561
    .line 562
    const v16, 0x402f5c29    # 2.74f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x41100000    # 9.0f

    .line 569
    .line 570
    const/high16 v18, 0x41400000    # 12.0f

    .line 571
    .line 572
    const v13, 0x411eb852    # 9.92f

    .line 573
    .line 574
    .line 575
    const v14, 0x413eb852    # 11.92f

    .line 576
    .line 577
    .line 578
    const v15, 0x4117851f    # 9.47f

    .line 579
    .line 580
    .line 581
    const/high16 v16, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40e3851f    # 7.11f

    .line 590
    .line 591
    .line 592
    const v2, 0x4152147b    # 13.13f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x40a00000    # 5.0f

    .line 599
    .line 600
    const v18, 0x4189c28f    # 17.22f

    .line 601
    .line 602
    .line 603
    const v13, 0x40b947ae    # 5.79f

    .line 604
    .line 605
    .line 606
    const v14, 0x4160cccd    # 14.05f

    .line 607
    .line 608
    .line 609
    const/high16 v15, 0x40a00000    # 5.0f

    .line 610
    .line 611
    const v16, 0x41791eb8    # 15.57f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41a00000    # 20.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x3f800000    # 1.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, -0x3fce147b    # -2.78f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v17, 0x3fce147b    # 1.61f

    .line 634
    .line 635
    .line 636
    const v18, -0x3fd5c28f    # -2.66f

    .line 637
    .line 638
    .line 639
    const/4 v13, 0x0

    .line 640
    const v14, -0x4070a3d7    # -1.12f

    .line 641
    .line 642
    .line 643
    const v15, 0x3f1c28f6    # 0.61f

    .line 644
    .line 645
    .line 646
    const v16, -0x3ff66666    # -2.15f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, 0x40e3851f    # 7.11f

    .line 653
    .line 654
    .line 655
    const v18, 0x4152147b    # 13.13f

    .line 656
    .line 657
    .line 658
    const v13, 0x40766666    # 3.85f

    .line 659
    .line 660
    .line 661
    const v14, 0x415eb852    # 13.92f

    .line 662
    .line 663
    .line 664
    const v15, 0x40abd70a    # 5.37f

    .line 665
    .line 666
    .line 667
    const v16, 0x4155eb85    # 13.37f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41300000    # 11.0f

    .line 677
    .line 678
    const/high16 v2, 0x41000000    # 8.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x40800000    # 4.0f

    .line 684
    .line 685
    const/high16 v18, -0x3f800000    # -4.0f

    .line 686
    .line 687
    const/4 v13, 0x0

    .line 688
    const v14, -0x3ff28f5c    # -2.21f

    .line 689
    .line 690
    .line 691
    const v15, 0x3fe51eb8    # 1.79f

    .line 692
    .line 693
    .line 694
    const/high16 v16, -0x3f800000    # -4.0f

    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x3fe51eb8    # 1.79f

    .line 700
    .line 701
    .line 702
    const/high16 v2, 0x40800000    # 4.0f

    .line 703
    .line 704
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, -0x3f800000    # -4.0f

    .line 708
    .line 709
    const/high16 v18, 0x40800000    # 4.0f

    .line 710
    .line 711
    const v14, 0x400d70a4    # 2.21f

    .line 712
    .line 713
    .line 714
    const v15, -0x401ae148    # -1.79f

    .line 715
    .line 716
    .line 717
    const/high16 v16, 0x40800000    # 4.0f

    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x41235c29    # 10.21f

    .line 723
    .line 724
    .line 725
    const/high16 v2, 0x41300000    # 11.0f

    .line 726
    .line 727
    const/high16 v4, 0x41000000    # 8.0f

    .line 728
    .line 729
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x41000000    # 8.0f

    .line 736
    .line 737
    const/high16 v2, 0x41500000    # 13.0f

    .line 738
    .line 739
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v17, 0x40000000    # 2.0f

    .line 743
    .line 744
    const/high16 v18, 0x40000000    # 2.0f

    .line 745
    .line 746
    const v14, 0x3f8ccccd    # 1.1f

    .line 747
    .line 748
    .line 749
    const v15, 0x3f666666    # 0.9f

    .line 750
    .line 751
    .line 752
    const/high16 v16, 0x40000000    # 2.0f

    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v0, -0x40000000    # -2.0f

    .line 758
    .line 759
    const v2, -0x4099999a    # -0.9f

    .line 760
    .line 761
    .line 762
    const/high16 v4, 0x40000000    # 2.0f

    .line 763
    .line 764
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v17, -0x40000000    # -2.0f

    .line 768
    .line 769
    const/high16 v18, -0x40000000    # -2.0f

    .line 770
    .line 771
    const v14, -0x40733333    # -1.1f

    .line 772
    .line 773
    .line 774
    const v15, -0x4099999a    # -0.9f

    .line 775
    .line 776
    .line 777
    const/high16 v16, -0x40000000    # -2.0f

    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x40dccccd    # 6.9f

    .line 783
    .line 784
    .line 785
    const/high16 v2, 0x41000000    # 8.0f

    .line 786
    .line 787
    const/high16 v4, 0x41500000    # 13.0f

    .line 788
    .line 789
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v0, 0x41700000    # 15.0f

    .line 796
    .line 797
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v17, -0x3f50a3d7    # -5.48f

    .line 801
    .line 802
    .line 803
    const v18, 0x3fab851f    # 1.34f

    .line 804
    .line 805
    .line 806
    const v13, -0x3fe851ec    # -2.37f

    .line 807
    .line 808
    .line 809
    const/4 v14, 0x0

    .line 810
    const v15, -0x3f76b852    # -4.29f

    .line 811
    .line 812
    .line 813
    const v16, 0x3f3ae148    # 0.73f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v17, 0x41100000    # 9.0f

    .line 820
    .line 821
    const v18, 0x4189c28f    # 17.22f

    .line 822
    .line 823
    .line 824
    const v13, 0x41133333    # 9.2f

    .line 825
    .line 826
    .line 827
    const/high16 v14, 0x41840000    # 16.5f

    .line 828
    .line 829
    const/high16 v15, 0x41100000    # 9.0f

    .line 830
    .line 831
    const v16, 0x4186b852    # 16.84f

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v0, 0x41900000    # 18.0f

    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/4 v0, 0x0

    .line 843
    const v2, 0x40e570a4    # 7.17f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v17, 0x4009999a    # 2.15f

    .line 850
    .line 851
    .line 852
    const/high16 v18, 0x40000000    # 2.0f

    .line 853
    .line 854
    const/high16 v13, 0x3f000000    # 0.5f

    .line 855
    .line 856
    const v14, 0x3f5c28f6    # 0.86f

    .line 857
    .line 858
    .line 859
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 860
    .line 861
    const v16, 0x3fc7ae14    # 1.56f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x40e00000    # 7.0f

    .line 868
    .line 869
    const/high16 v2, 0x41a00000    # 20.0f

    .line 870
    .line 871
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v0, -0x3fce147b    # -2.78f

    .line 875
    .line 876
    .line 877
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x3fce147b    # 1.61f

    .line 881
    .line 882
    .line 883
    const v18, -0x3fd5c28f    # -2.66f

    .line 884
    .line 885
    .line 886
    const/4 v13, 0x0

    .line 887
    const v14, -0x4070a3d7    # -1.12f

    .line 888
    .line 889
    .line 890
    const v15, 0x3f1c28f6    # 0.61f

    .line 891
    .line 892
    .line 893
    const v16, -0x3ff66666    # -2.15f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const/high16 v17, 0x41700000    # 15.0f

    .line 900
    .line 901
    const/high16 v18, 0x41500000    # 13.0f

    .line 902
    .line 903
    const v13, 0x4124a3d7    # 10.29f

    .line 904
    .line 905
    .line 906
    const v14, 0x415b3333    # 13.7f

    .line 907
    .line 908
    .line 909
    const v15, 0x4147851f    # 12.47f

    .line 910
    .line 911
    .line 912
    const/high16 v16, 0x41500000    # 13.0f

    .line 913
    .line 914
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v17, 0x3f91eb85    # 1.14f

    .line 918
    .line 919
    .line 920
    const v18, 0x3d4ccccd    # 0.05f

    .line 921
    .line 922
    .line 923
    const v13, 0x3ec7ae14    # 0.39f

    .line 924
    .line 925
    .line 926
    const/4 v14, 0x0

    .line 927
    const v15, 0x3f451eb8    # 0.77f

    .line 928
    .line 929
    .line 930
    const v16, 0x3ca3d70a    # 0.02f

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, -0x40e147ae    # -0.62f

    .line 937
    .line 938
    .line 939
    const v18, 0x3ffae148    # 1.96f

    .line 940
    .line 941
    .line 942
    const v13, -0x41570a3d    # -0.33f

    .line 943
    .line 944
    .line 945
    const v14, 0x3f170a3d    # 0.59f

    .line 946
    .line 947
    .line 948
    const v15, -0x40f33333    # -0.55f

    .line 949
    .line 950
    .line 951
    const v16, 0x3fa147ae    # 1.26f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v17, 0x41700000    # 15.0f

    .line 958
    .line 959
    const/high16 v18, 0x41700000    # 15.0f

    .line 960
    .line 961
    const v13, 0x4175999a    # 15.35f

    .line 962
    .line 963
    .line 964
    const/high16 v14, 0x41700000    # 15.0f

    .line 965
    .line 966
    const v15, 0x4172e148    # 15.18f

    .line 967
    .line 968
    .line 969
    const/high16 v16, 0x41700000    # 15.0f

    .line 970
    .line 971
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    const/16 v16, 0x3800

    .line 982
    .line 983
    const/16 v17, 0x0

    .line 984
    .line 985
    const/high16 v6, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const/high16 v8, 0x3f800000    # 1.0f

    .line 988
    .line 989
    const/4 v7, 0x0

    .line 990
    const/high16 v12, 0x3f800000    # 1.0f

    .line 991
    .line 992
    const/4 v13, 0x0

    .line 993
    const/4 v14, 0x0

    .line 994
    const/4 v15, 0x0

    .line 995
    const-string v4, ""

    .line 996
    .line 997
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    sput-object v0, Landroidx/compose/material/icons/twotone/InterpreterModeKt;->_interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1006
    .line 1007
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1008
    .line 1009
    .line 1010
    return-object v0
.end method
