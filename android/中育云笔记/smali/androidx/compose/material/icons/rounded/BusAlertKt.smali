.class public final Landroidx/compose/material/icons/rounded/BusAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBusAlert(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BusAlertKt;->_busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BusAlert"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, 0x40e947ae    # 7.29f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v26, -0x3f60f5c3    # -4.97f

    .line 92
    .line 93
    .line 94
    const v21, -0x40bae148    # -0.77f

    .line 95
    .line 96
    .line 97
    const v22, -0x3fd9999a    # -2.6f

    .line 98
    .line 99
    .line 100
    const v23, 0x3e570a3d    # 0.21f

    .line 101
    .line 102
    .line 103
    const v24, -0x3f6c7ae1    # -4.61f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v26, 0x40e00000    # 7.0f

    .line 114
    .line 115
    const v21, 0x403e147b    # 2.97f

    .line 116
    .line 117
    .line 118
    const v22, 0x402ae148    # 2.67f

    .line 119
    .line 120
    .line 121
    const/high16 v23, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v24, 0x40a0a3d7    # 5.02f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41180000    # 9.5f

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const v26, 0x401c28f6    # 2.44f

    .line 137
    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const v22, 0x3f733333    # 0.95f

    .line 142
    .line 143
    .line 144
    const v23, 0x3ec28f5c    # 0.38f

    .line 145
    .line 146
    .line 147
    const v24, 0x3fe7ae14    # 1.81f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x3fc7ae14    # 1.56f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x40900000    # 4.5f

    .line 160
    .line 161
    const/high16 v26, 0x41b00000    # 22.0f

    .line 162
    .line 163
    const/high16 v21, 0x40400000    # 3.0f

    .line 164
    .line 165
    const v22, 0x41aaa3d7    # 21.33f

    .line 166
    .line 167
    .line 168
    const v23, 0x406ae148    # 3.67f

    .line 169
    .line 170
    .line 171
    const/high16 v24, 0x41b00000    # 22.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, 0x40c00000    # 6.0f

    .line 181
    .line 182
    const/high16 v26, 0x41a40000    # 20.5f

    .line 183
    .line 184
    const v21, 0x40aa8f5c    # 5.33f

    .line 185
    .line 186
    .line 187
    const/high16 v22, 0x41b00000    # 22.0f

    .line 188
    .line 189
    const/high16 v23, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const v24, 0x41aaa3d7    # 21.33f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41a00000    # 20.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41000000    # 8.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x3f000000    # 0.5f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 213
    .line 214
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const v22, 0x3f51eb85    # 0.82f

    .line 219
    .line 220
    .line 221
    const v23, 0x3f2b851f    # 0.67f

    .line 222
    .line 223
    .line 224
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/4 v4, 0x0

    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v26, -0x40400000    # -1.5f

    .line 234
    .line 235
    const v21, 0x3f51eb85    # 0.82f

    .line 236
    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 241
    .line 242
    const v24, -0x40d47ae1    # -0.67f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, -0x403851ec    # -1.56f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v25, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const v26, -0x3fe3d70a    # -2.44f

    .line 257
    .line 258
    .line 259
    const v21, 0x3f1eb852    # 0.62f

    .line 260
    .line 261
    .line 262
    const v22, -0x40deb852    # -0.63f

    .line 263
    .line 264
    .line 265
    const/high16 v23, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v24, -0x404147ae    # -1.49f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x41500000    # 13.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x3f63851f    # -4.89f

    .line 279
    .line 280
    .line 281
    const/high16 v26, -0x40000000    # -2.0f

    .line 282
    .line 283
    const v21, -0x400b851f    # -1.91f

    .line 284
    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const v23, -0x3f97ae14    # -3.63f

    .line 289
    .line 290
    .line 291
    const v24, -0x40bd70a4    # -0.76f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, 0x40800000    # 4.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x41880000    # 17.0f

    .line 306
    .line 307
    const/high16 v6, 0x40d00000    # 6.5f

    .line 308
    .line 309
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, 0x40a00000    # 5.0f

    .line 313
    .line 314
    const/high16 v26, 0x41780000    # 15.5f

    .line 315
    .line 316
    const v21, 0x40b570a4    # 5.67f

    .line 317
    .line 318
    .line 319
    const/high16 v22, 0x41880000    # 17.0f

    .line 320
    .line 321
    const/high16 v23, 0x40a00000    # 5.0f

    .line 322
    .line 323
    const v24, 0x4182a3d7    # 16.33f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x40b570a4    # 5.67f

    .line 330
    .line 331
    .line 332
    const/high16 v6, 0x41600000    # 14.0f

    .line 333
    .line 334
    const/high16 v7, 0x40d00000    # 6.5f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x416ab852    # 14.67f

    .line 340
    .line 341
    .line 342
    const/high16 v6, 0x41780000    # 15.5f

    .line 343
    .line 344
    const/high16 v7, 0x41000000    # 8.0f

    .line 345
    .line 346
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x40ea8f5c    # 7.33f

    .line 350
    .line 351
    .line 352
    const/high16 v6, 0x41880000    # 17.0f

    .line 353
    .line 354
    const/high16 v7, 0x40d00000    # 6.5f

    .line 355
    .line 356
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x41700000    # 15.0f

    .line 363
    .line 364
    const/high16 v6, 0x41780000    # 15.5f

    .line 365
    .line 366
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, -0x40400000    # -1.5f

    .line 370
    .line 371
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 372
    .line 373
    const/16 v21, 0x0

    .line 374
    .line 375
    const v22, 0x3f547ae1    # 0.83f

    .line 376
    .line 377
    .line 378
    const v23, -0x40d47ae1    # -0.67f

    .line 379
    .line 380
    .line 381
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v4, 0x4182a3d7    # 16.33f

    .line 387
    .line 388
    .line 389
    const/high16 v6, 0x41400000    # 12.0f

    .line 390
    .line 391
    const/high16 v7, 0x41780000    # 15.5f

    .line 392
    .line 393
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x3f2b851f    # 0.67f

    .line 397
    .line 398
    .line 399
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 400
    .line 401
    const/high16 v7, -0x40400000    # -1.5f

    .line 402
    .line 403
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x416ab852    # 14.67f

    .line 407
    .line 408
    .line 409
    const/high16 v6, 0x41700000    # 15.0f

    .line 410
    .line 411
    const/high16 v7, 0x41780000    # 15.5f

    .line 412
    .line 413
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v8, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    const/high16 v9, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/high16 v12, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    const/4 v15, 0x0

    .line 439
    const-string v4, ""

    .line 440
    .line 441
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 442
    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 451
    .line 452
    .line 453
    move-result-wide v6

    .line 454
    const/4 v0, 0x0

    .line 455
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v2, 0x41900000    # 18.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, -0x3f600000    # -5.0f

    .line 479
    .line 480
    const/high16 v18, 0x40a00000    # 5.0f

    .line 481
    .line 482
    const v13, -0x3fcf5c29    # -2.76f

    .line 483
    .line 484
    .line 485
    const/high16 v15, -0x3f600000    # -5.0f

    .line 486
    .line 487
    const v16, 0x400f5c29    # 2.24f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x400f5c29    # 2.24f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x40a00000    # 5.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, -0x3ff0a3d7    # -2.24f

    .line 502
    .line 503
    .line 504
    const/high16 v2, -0x3f600000    # -5.0f

    .line 505
    .line 506
    const/high16 v4, 0x40a00000    # 5.0f

    .line 507
    .line 508
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x41a6147b    # 20.76f

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/high16 v4, 0x41900000    # 18.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41940000    # 18.5f

    .line 525
    .line 526
    const/high16 v2, 0x40d00000    # 6.5f

    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, 0x41900000    # 18.0f

    .line 532
    .line 533
    const/high16 v18, 0x40e00000    # 7.0f

    .line 534
    .line 535
    const/high16 v13, 0x41940000    # 18.5f

    .line 536
    .line 537
    const v14, 0x40d8f5c3    # 6.78f

    .line 538
    .line 539
    .line 540
    const v15, 0x41923d71    # 18.28f

    .line 541
    .line 542
    .line 543
    const/high16 v16, 0x40e00000    # 7.0f

    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, -0x419eb852    # -0.22f

    .line 549
    .line 550
    .line 551
    const/high16 v2, -0x41000000    # -0.5f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v18, 0x40400000    # 3.0f

    .line 562
    .line 563
    const/high16 v13, 0x418c0000    # 17.5f

    .line 564
    .line 565
    const v14, 0x404e147b    # 3.22f

    .line 566
    .line 567
    .line 568
    const v15, 0x418dc28f    # 17.72f

    .line 569
    .line 570
    .line 571
    const/high16 v16, 0x40400000    # 3.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x3e6147ae    # 0.22f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x3f000000    # 0.5f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x40d00000    # 6.5f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41080000    # 8.5f

    .line 593
    .line 594
    const/high16 v2, 0x41940000    # 18.5f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v18, 0x41100000    # 9.0f

    .line 600
    .line 601
    const/high16 v13, 0x41940000    # 18.5f

    .line 602
    .line 603
    const v14, 0x410c7ae1    # 8.78f

    .line 604
    .line 605
    .line 606
    const v15, 0x41923d71    # 18.28f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x41100000    # 9.0f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x419eb852    # -0.22f

    .line 615
    .line 616
    .line 617
    const/high16 v2, -0x41000000    # -0.5f

    .line 618
    .line 619
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x418dc28f    # 17.72f

    .line 623
    .line 624
    .line 625
    const/high16 v2, 0x41900000    # 18.0f

    .line 626
    .line 627
    const/high16 v4, 0x41000000    # 8.0f

    .line 628
    .line 629
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x4103851f    # 8.22f

    .line 633
    .line 634
    .line 635
    const/high16 v2, 0x41080000    # 8.5f

    .line 636
    .line 637
    const/high16 v4, 0x41940000    # 18.5f

    .line 638
    .line 639
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    const/16 v16, 0x3800

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    const/high16 v6, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const/4 v14, 0x0

    .line 660
    const/4 v15, 0x0

    .line 661
    const-string v4, ""

    .line 662
    .line 663
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    sput-object v0, Landroidx/compose/material/icons/rounded/BusAlertKt;->_busAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method
