.class public final Landroidx/compose/material/icons/twotone/ElectricCarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricCar(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ElectricCarKt;->_electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ElectricCar"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41000000    # 8.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41500000    # 13.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41100000    # 9.0f

    .line 101
    .line 102
    const/high16 v6, 0x41840000    # 16.5f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 108
    .line 109
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 110
    .line 111
    const v21, 0x3f547ae1    # 0.83f

    .line 112
    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    const v24, 0x3f2b851f    # 0.67f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, -0x40400000    # -1.5f

    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, 0x3f547ae1    # 0.83f

    .line 131
    .line 132
    .line 133
    const v23, -0x40d47ae1    # -0.67f

    .line 134
    .line 135
    .line 136
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x413547ae    # 11.33f

    .line 142
    .line 143
    .line 144
    const/high16 v6, 0x41700000    # 15.0f

    .line 145
    .line 146
    const/high16 v7, 0x41280000    # 10.5f

    .line 147
    .line 148
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, 0x41840000    # 16.5f

    .line 152
    .line 153
    const/high16 v26, 0x41100000    # 9.0f

    .line 154
    .line 155
    const/high16 v21, 0x41700000    # 15.0f

    .line 156
    .line 157
    const v22, 0x411ab852    # 9.67f

    .line 158
    .line 159
    .line 160
    const v23, 0x417ab852    # 15.67f

    .line 161
    .line 162
    .line 163
    const/high16 v24, 0x41100000    # 9.0f

    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x40f00000    # 7.5f

    .line 172
    .line 173
    const/high16 v6, 0x41100000    # 9.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v25, 0x41100000    # 9.0f

    .line 179
    .line 180
    const/high16 v26, 0x41280000    # 10.5f

    .line 181
    .line 182
    const v21, 0x410547ae    # 8.33f

    .line 183
    .line 184
    .line 185
    const/high16 v22, 0x41100000    # 9.0f

    .line 186
    .line 187
    const/high16 v23, 0x41100000    # 9.0f

    .line 188
    .line 189
    const v24, 0x411ab852    # 9.67f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, 0x40f00000    # 7.5f

    .line 196
    .line 197
    const/high16 v26, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v21, 0x41100000    # 9.0f

    .line 200
    .line 201
    const v22, 0x413547ae    # 11.33f

    .line 202
    .line 203
    .line 204
    const v23, 0x410547ae    # 8.33f

    .line 205
    .line 206
    .line 207
    const/high16 v24, 0x41400000    # 12.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x413547ae    # 11.33f

    .line 213
    .line 214
    .line 215
    const/high16 v6, 0x40c00000    # 6.0f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v26, 0x41100000    # 9.0f

    .line 221
    .line 222
    const/high16 v21, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const v22, 0x411ab852    # 9.67f

    .line 225
    .line 226
    .line 227
    const v23, 0x40d570a4    # 6.67f

    .line 228
    .line 229
    .line 230
    const/high16 v24, 0x41100000    # 9.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const/16 v16, 0x3800

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const v6, 0x3e99999a    # 0.3f

    .line 247
    .line 248
    .line 249
    const v8, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const v4, 0x4000a3d7    # 2.01f

    .line 293
    .line 294
    .line 295
    const v6, 0x41975c29    # 18.92f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v25, 0x418c0000    # 17.5f

    .line 302
    .line 303
    const/high16 v26, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const v21, 0x4195c28f    # 18.72f

    .line 306
    .line 307
    .line 308
    const v22, 0x3fb5c28f    # 1.42f

    .line 309
    .line 310
    .line 311
    const v23, 0x419147ae    # 18.16f

    .line 312
    .line 313
    .line 314
    const/high16 v24, 0x3f800000    # 1.0f

    .line 315
    .line 316
    move-object/from16 v20, v2

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x40a28f5c    # 5.08f

    .line 327
    .line 328
    .line 329
    const v26, 0x4000a3d7    # 2.01f

    .line 330
    .line 331
    .line 332
    const v21, 0x40bae148    # 5.84f

    .line 333
    .line 334
    .line 335
    const/high16 v22, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const v23, 0x40a947ae    # 5.29f

    .line 338
    .line 339
    .line 340
    const v24, 0x3fb5c28f    # 1.42f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v4, 0x40400000    # 3.0f

    .line 347
    .line 348
    const/high16 v6, 0x41000000    # 8.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x41000000    # 8.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v26, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/16 v21, 0x0

    .line 363
    .line 364
    const v22, 0x3f0ccccd    # 0.55f

    .line 365
    .line 366
    .line 367
    const v23, 0x3ee66666    # 0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v24, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v26, -0x40800000    # -1.0f

    .line 381
    .line 382
    const v21, 0x3f0ccccd    # 0.55f

    .line 383
    .line 384
    .line 385
    const/16 v22, 0x0

    .line 386
    .line 387
    const/high16 v23, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const v24, -0x4119999a    # -0.45f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, -0x40800000    # -1.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41400000    # 12.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x3f800000    # 1.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v26, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    const v22, 0x3f0ccccd    # 0.55f

    .line 415
    .line 416
    .line 417
    const v23, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    const/high16 v24, 0x3f800000    # 1.0f

    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v26, -0x40800000    # -1.0f

    .line 429
    .line 430
    const v21, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    const/high16 v23, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const v24, -0x4119999a    # -0.45f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x41000000    # 8.0f

    .line 444
    .line 445
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v4, 0x4000a3d7    # 2.01f

    .line 449
    .line 450
    .line 451
    const v6, 0x41975c29    # 18.92f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, 0x40db3333    # 6.85f

    .line 461
    .line 462
    .line 463
    const/high16 v6, 0x40400000    # 3.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v4, 0x4124a3d7    # 10.29f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v4, 0x3f8a3d71    # 1.08f

    .line 475
    .line 476
    .line 477
    const v6, 0x40470a3d    # 3.11f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, 0x40b8a3d7    # 5.77f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v4, 0x40db3333    # 6.85f

    .line 490
    .line 491
    .line 492
    const/high16 v6, 0x40400000    # 3.0f

    .line 493
    .line 494
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x41980000    # 19.0f

    .line 501
    .line 502
    const/high16 v6, 0x41500000    # 13.0f

    .line 503
    .line 504
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x40a00000    # 5.0f

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x41000000    # 8.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x41600000    # 14.0f

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x41500000    # 13.0f

    .line 523
    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/high16 v6, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/high16 v8, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v7, 0x0

    .line 539
    const-string v4, ""

    .line 540
    .line 541
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 542
    .line 543
    .line 544
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 549
    .line 550
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 551
    .line 552
    .line 553
    move-result-wide v6

    .line 554
    const/4 v2, 0x0

    .line 555
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 559
    .line 560
    .line 561
    move-result v10

    .line 562
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 569
    .line 570
    .line 571
    const/high16 v4, 0x40f00000    # 7.5f

    .line 572
    .line 573
    const/high16 v6, 0x41280000    # 10.5f

    .line 574
    .line 575
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v4, -0x40400000    # -1.5f

    .line 579
    .line 580
    const/4 v6, 0x0

    .line 581
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v26, 0x40400000    # 3.0f

    .line 585
    .line 586
    const/16 v27, 0x0

    .line 587
    .line 588
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 589
    .line 590
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 591
    .line 592
    const/16 v23, 0x0

    .line 593
    .line 594
    const/16 v24, 0x1

    .line 595
    .line 596
    const/16 v25, 0x1

    .line 597
    .line 598
    move-object/from16 v20, v2

    .line 599
    .line 600
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/high16 v6, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v7, 0x0

    .line 615
    const-string v4, ""

    .line 616
    .line 617
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 618
    .line 619
    .line 620
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 625
    .line 626
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 627
    .line 628
    .line 629
    move-result-wide v6

    .line 630
    const/4 v2, 0x0

    .line 631
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 635
    .line 636
    .line 637
    move-result v10

    .line 638
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 639
    .line 640
    .line 641
    move-result v11

    .line 642
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 645
    .line 646
    .line 647
    const/high16 v4, 0x41840000    # 16.5f

    .line 648
    .line 649
    const/high16 v6, 0x41280000    # 10.5f

    .line 650
    .line 651
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v4, -0x40400000    # -1.5f

    .line 655
    .line 656
    const/4 v6, 0x0

    .line 657
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v26, 0x40400000    # 3.0f

    .line 661
    .line 662
    move-object/from16 v20, v2

    .line 663
    .line 664
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 668
    .line 669
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    const/high16 v6, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 689
    .line 690
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 691
    .line 692
    .line 693
    move-result-wide v6

    .line 694
    const/4 v0, 0x0

    .line 695
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 699
    .line 700
    .line 701
    move-result v10

    .line 702
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 703
    .line 704
    .line 705
    move-result v11

    .line 706
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 709
    .line 710
    .line 711
    const/high16 v2, 0x40e00000    # 7.0f

    .line 712
    .line 713
    const/high16 v4, 0x41a00000    # 20.0f

    .line 714
    .line 715
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v2, 0x40800000    # 4.0f

    .line 719
    .line 720
    const/4 v4, 0x0

    .line 721
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v2, -0x40000000    # -2.0f

    .line 725
    .line 726
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x40c00000    # 6.0f

    .line 730
    .line 731
    const/high16 v4, 0x40400000    # 3.0f

    .line 732
    .line 733
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v2, -0x3f800000    # -4.0f

    .line 737
    .line 738
    const/4 v4, 0x0

    .line 739
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v2, 0x40000000    # 2.0f

    .line 743
    .line 744
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    const/high16 v6, 0x3f800000    # 1.0f

    .line 755
    .line 756
    const/4 v7, 0x0

    .line 757
    const-string v4, ""

    .line 758
    .line 759
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    sput-object v0, Landroidx/compose/material/icons/twotone/ElectricCarKt;->_electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 768
    .line 769
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    return-object v0
.end method
