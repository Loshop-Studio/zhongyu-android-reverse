.class public final Landroidx/compose/material/icons/rounded/SolarPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSolarPower(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SolarPowerKt;->_solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SolarPower"

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
    const v4, 0x40551eb8    # 3.33f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41800000    # 16.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41300000    # 11.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x40b33333    # 5.6f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v25, -0x40066666    # -1.95f

    .line 95
    .line 96
    .line 97
    const v26, 0x3fc8f5c3    # 1.57f

    .line 98
    .line 99
    .line 100
    const v21, -0x408f5c29    # -0.94f

    .line 101
    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const/high16 v23, -0x40200000    # -1.75f

    .line 106
    .line 107
    const v24, 0x3f266666    # 0.65f

    .line 108
    .line 109
    .line 110
    move-object/from16 v20, v2

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x40551eb8    # 3.33f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/16 v16, 0x3800

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/high16 v6, 0x3f800000    # 1.0f

    .line 133
    .line 134
    const/high16 v8, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    const/high16 v9, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/high16 v12, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    const-string v4, ""

    .line 145
    .line 146
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41500000    # 13.0f

    .line 177
    .line 178
    const/high16 v6, 0x41800000    # 16.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x40f570a4    # 7.67f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, -0x415c28f6    # -0.32f

    .line 190
    .line 191
    .line 192
    const v6, -0x4048f5c3    # -1.43f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v25, 0x41933333    # 18.4f

    .line 199
    .line 200
    .line 201
    const/high16 v26, 0x41500000    # 13.0f

    .line 202
    .line 203
    const v21, 0x41a11eb8    # 20.14f

    .line 204
    .line 205
    .line 206
    const v22, 0x415a6666    # 13.65f

    .line 207
    .line 208
    .line 209
    const v23, 0x419aa3d7    # 19.33f

    .line 210
    .line 211
    .line 212
    const/high16 v24, 0x41500000    # 13.0f

    .line 213
    .line 214
    move-object/from16 v20, v2

    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x41500000    # 13.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, 0x41800000    # 16.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const/high16 v6, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const-string v4, ""

    .line 240
    .line 241
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 242
    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v6

    .line 254
    const/4 v2, 0x0

    .line 255
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x41900000    # 18.0f

    .line 272
    .line 273
    const v6, 0x41a8e148    # 21.11f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x41500000    # 13.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40800000    # 4.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x40d051ec    # 6.51f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x3ff9999a    # 1.95f

    .line 296
    .line 297
    .line 298
    const v26, -0x3fe47ae1    # -2.43f

    .line 299
    .line 300
    .line 301
    const v21, 0x3fa3d70a    # 1.28f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const v23, 0x400eb852    # 2.23f

    .line 307
    .line 308
    .line 309
    const v24, -0x4068f5c3    # -1.18f

    .line 310
    .line 311
    .line 312
    move-object/from16 v20, v2

    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41900000    # 18.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/high16 v6, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v7, 0x0

    .line 332
    const-string v4, ""

    .line 333
    .line 334
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 335
    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 342
    .line 343
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 344
    .line 345
    .line 346
    move-result-wide v6

    .line 347
    const/4 v2, 0x0

    .line 348
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 356
    .line 357
    .line 358
    move-result v11

    .line 359
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const v4, 0x408fae14    # 4.49f

    .line 365
    .line 366
    .line 367
    const/high16 v6, 0x41b00000    # 22.0f

    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x41300000    # 11.0f

    .line 373
    .line 374
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v4, -0x3f800000    # -4.0f

    .line 378
    .line 379
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, 0x4038f5c3    # 2.89f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, -0x414ccccd    # -0.35f

    .line 389
    .line 390
    .line 391
    const v6, 0x3fc8f5c3    # 1.57f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v25, 0x408fae14    # 4.49f

    .line 398
    .line 399
    .line 400
    const/high16 v26, 0x41b00000    # 22.0f

    .line 401
    .line 402
    const v21, 0x4010a3d7    # 2.26f

    .line 403
    .line 404
    .line 405
    const v22, 0x41a68f5c    # 20.82f

    .line 406
    .line 407
    .line 408
    const v23, 0x404d70a4    # 3.21f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x41b00000    # 22.0f

    .line 412
    .line 413
    move-object/from16 v20, v2

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    const/high16 v6, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/4 v7, 0x0

    .line 428
    const-string v4, ""

    .line 429
    .line 430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 431
    .line 432
    .line 433
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 438
    .line 439
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    const/4 v2, 0x0

    .line 444
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 452
    .line 453
    .line 454
    move-result v11

    .line 455
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 458
    .line 459
    .line 460
    const/high16 v4, 0x41000000    # 8.0f

    .line 461
    .line 462
    const/high16 v6, 0x41400000    # 12.0f

    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v25, -0x40800000    # -1.0f

    .line 471
    .line 472
    const/high16 v26, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const v21, -0x40f33333    # -0.55f

    .line 475
    .line 476
    .line 477
    const/16 v22, 0x0

    .line 478
    .line 479
    const/high16 v23, -0x40800000    # -1.0f

    .line 480
    .line 481
    const v24, 0x3ee66666    # 0.45f

    .line 482
    .line 483
    .line 484
    move-object/from16 v20, v2

    .line 485
    .line 486
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v4, 0x3f800000    # 1.0f

    .line 490
    .line 491
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v25, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/16 v21, 0x0

    .line 497
    .line 498
    const v22, 0x3f0ccccd    # 0.55f

    .line 499
    .line 500
    .line 501
    const v23, 0x3ee66666    # 0.45f

    .line 502
    .line 503
    .line 504
    const/high16 v24, 0x3f800000    # 1.0f

    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/4 v4, 0x0

    .line 510
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v26, -0x40800000    # -1.0f

    .line 514
    .line 515
    const v21, 0x3f0ccccd    # 0.55f

    .line 516
    .line 517
    .line 518
    const/16 v22, 0x0

    .line 519
    .line 520
    const/high16 v23, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const v24, -0x4119999a    # -0.45f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41100000    # 9.0f

    .line 529
    .line 530
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v25, 0x41400000    # 12.0f

    .line 534
    .line 535
    const/high16 v26, 0x41000000    # 8.0f

    .line 536
    .line 537
    const/high16 v21, 0x41500000    # 13.0f

    .line 538
    .line 539
    const v22, 0x41073333    # 8.45f

    .line 540
    .line 541
    .line 542
    const v23, 0x4148cccd    # 12.55f

    .line 543
    .line 544
    .line 545
    const/high16 v24, 0x41000000    # 8.0f

    .line 546
    .line 547
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    const/high16 v6, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/4 v7, 0x0

    .line 560
    const-string v4, ""

    .line 561
    .line 562
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 563
    .line 564
    .line 565
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 570
    .line 571
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 572
    .line 573
    .line 574
    move-result-wide v6

    .line 575
    const/4 v2, 0x0

    .line 576
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 580
    .line 581
    .line 582
    move-result v10

    .line 583
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 584
    .line 585
    .line 586
    move-result v11

    .line 587
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    const v4, 0x4194b852    # 18.59f

    .line 593
    .line 594
    .line 595
    const v6, 0x4109eb85    # 8.62f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/16 v25, 0x0

    .line 605
    .line 606
    const v26, -0x404b851f    # -1.41f

    .line 607
    .line 608
    .line 609
    const v21, 0x3ec7ae14    # 0.39f

    .line 610
    .line 611
    .line 612
    const v22, -0x413851ec    # -0.39f

    .line 613
    .line 614
    .line 615
    const v23, 0x3ec7ae14    # 0.39f

    .line 616
    .line 617
    .line 618
    const v24, -0x407d70a4    # -1.02f

    .line 619
    .line 620
    .line 621
    move-object/from16 v20, v2

    .line 622
    .line 623
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v4, 0x418f0a3d    # 17.88f

    .line 627
    .line 628
    .line 629
    const/high16 v6, 0x40d00000    # 6.5f

    .line 630
    .line 631
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v25, -0x404b851f    # -1.41f

    .line 635
    .line 636
    .line 637
    const/16 v26, 0x0

    .line 638
    .line 639
    const v21, -0x413851ec    # -0.39f

    .line 640
    .line 641
    .line 642
    const v23, -0x407d70a4    # -1.02f

    .line 643
    .line 644
    .line 645
    const v24, -0x413851ec    # -0.39f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/4 v4, 0x0

    .line 652
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/16 v25, 0x0

    .line 656
    .line 657
    const v26, 0x3fb47ae1    # 1.41f

    .line 658
    .line 659
    .line 660
    const v22, 0x3ec7ae14    # 0.39f

    .line 661
    .line 662
    .line 663
    const v23, -0x413851ec    # -0.39f

    .line 664
    .line 665
    .line 666
    const v24, 0x3f828f5c    # 1.02f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v4, 0x3f35c28f    # 0.71f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v25, 0x4194b852    # 18.59f

    .line 679
    .line 680
    .line 681
    const v26, 0x4109eb85    # 8.62f

    .line 682
    .line 683
    .line 684
    const v21, 0x418c8f5c    # 17.57f

    .line 685
    .line 686
    .line 687
    const v22, 0x411028f6    # 9.01f

    .line 688
    .line 689
    .line 690
    const v23, 0x4191999a    # 18.2f

    .line 691
    .line 692
    .line 693
    const v24, 0x411028f6    # 9.01f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    const/high16 v6, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    const-string v4, ""

    .line 710
    .line 711
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 712
    .line 713
    .line 714
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 719
    .line 720
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 721
    .line 722
    .line 723
    move-result-wide v6

    .line 724
    const/4 v2, 0x0

    .line 725
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 729
    .line 730
    .line 731
    move-result v10

    .line 732
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 733
    .line 734
    .line 735
    move-result v11

    .line 736
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 739
    .line 740
    .line 741
    const v4, 0x40da3d71    # 6.82f

    .line 742
    .line 743
    .line 744
    const v6, 0x4109eb85    # 8.62f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v4, -0x40ca3d71    # -0.71f

    .line 751
    .line 752
    .line 753
    const v6, 0x3f35c28f    # 0.71f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/16 v25, 0x0

    .line 760
    .line 761
    const v26, -0x404b851f    # -1.41f

    .line 762
    .line 763
    .line 764
    const v21, 0x3ec7ae14    # 0.39f

    .line 765
    .line 766
    .line 767
    const v22, -0x413851ec    # -0.39f

    .line 768
    .line 769
    .line 770
    const v23, 0x3ec7ae14    # 0.39f

    .line 771
    .line 772
    .line 773
    const v24, -0x407d70a4    # -1.02f

    .line 774
    .line 775
    .line 776
    move-object/from16 v20, v2

    .line 777
    .line 778
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/4 v4, 0x0

    .line 782
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v25, -0x404b851f    # -1.41f

    .line 786
    .line 787
    .line 788
    const/16 v26, 0x0

    .line 789
    .line 790
    const v21, -0x413851ec    # -0.39f

    .line 791
    .line 792
    .line 793
    const v23, -0x407d70a4    # -1.02f

    .line 794
    .line 795
    .line 796
    const v24, -0x413851ec    # -0.39f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v4, 0x40ad1eb8    # 5.41f

    .line 803
    .line 804
    .line 805
    const v6, 0x40e66666    # 7.2f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/16 v25, 0x0

    .line 812
    .line 813
    const v26, 0x3fb47ae1    # 1.41f

    .line 814
    .line 815
    .line 816
    const v22, 0x3ec7ae14    # 0.39f

    .line 817
    .line 818
    .line 819
    const v23, -0x413851ec    # -0.39f

    .line 820
    .line 821
    .line 822
    const v24, 0x3f828f5c    # 1.02f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/4 v4, 0x0

    .line 829
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v25, 0x40da3d71    # 6.82f

    .line 833
    .line 834
    .line 835
    const v26, 0x4109eb85    # 8.62f

    .line 836
    .line 837
    .line 838
    const v21, 0x40b9999a    # 5.8f

    .line 839
    .line 840
    .line 841
    const v22, 0x411028f6    # 9.01f

    .line 842
    .line 843
    .line 844
    const v23, 0x40cdc28f    # 6.43f

    .line 845
    .line 846
    .line 847
    const v24, 0x411028f6    # 9.01f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    const/high16 v6, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/4 v7, 0x0

    .line 863
    const-string v4, ""

    .line 864
    .line 865
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 866
    .line 867
    .line 868
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 873
    .line 874
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 875
    .line 876
    .line 877
    move-result-wide v6

    .line 878
    const/4 v2, 0x0

    .line 879
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 883
    .line 884
    .line 885
    move-result v10

    .line 886
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 887
    .line 888
    .line 889
    move-result v11

    .line 890
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 893
    .line 894
    .line 895
    const/high16 v4, 0x40a00000    # 5.0f

    .line 896
    .line 897
    const/high16 v6, 0x40000000    # 2.0f

    .line 898
    .line 899
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v4, 0x40800000    # 4.0f

    .line 903
    .line 904
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v25, 0x40400000    # 3.0f

    .line 908
    .line 909
    const/high16 v26, 0x40400000    # 3.0f

    .line 910
    .line 911
    const v21, 0x405ccccd    # 3.45f

    .line 912
    .line 913
    .line 914
    const/high16 v22, 0x40000000    # 2.0f

    .line 915
    .line 916
    const/high16 v23, 0x40400000    # 3.0f

    .line 917
    .line 918
    const v24, 0x401ccccd    # 2.45f

    .line 919
    .line 920
    .line 921
    move-object/from16 v20, v2

    .line 922
    .line 923
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/4 v4, 0x0

    .line 927
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v25, 0x3f800000    # 1.0f

    .line 931
    .line 932
    const/high16 v26, 0x3f800000    # 1.0f

    .line 933
    .line 934
    const/16 v21, 0x0

    .line 935
    .line 936
    const v22, 0x3f0ccccd    # 0.55f

    .line 937
    .line 938
    .line 939
    const v23, 0x3ee66666    # 0.45f

    .line 940
    .line 941
    .line 942
    const/high16 v24, 0x3f800000    # 1.0f

    .line 943
    .line 944
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v4, 0x3f800000    # 1.0f

    .line 948
    .line 949
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const/high16 v26, -0x40800000    # -1.0f

    .line 953
    .line 954
    const v21, 0x3f0ccccd    # 0.55f

    .line 955
    .line 956
    .line 957
    const/16 v22, 0x0

    .line 958
    .line 959
    const/high16 v23, 0x3f800000    # 1.0f

    .line 960
    .line 961
    const v24, -0x4119999a    # -0.45f

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/4 v4, 0x0

    .line 968
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v25, 0x40a00000    # 5.0f

    .line 972
    .line 973
    const/high16 v26, 0x40000000    # 2.0f

    .line 974
    .line 975
    const/high16 v21, 0x40c00000    # 6.0f

    .line 976
    .line 977
    const v22, 0x401ccccd    # 2.45f

    .line 978
    .line 979
    .line 980
    const v23, 0x40b1999a    # 5.55f

    .line 981
    .line 982
    .line 983
    const/high16 v24, 0x40000000    # 2.0f

    .line 984
    .line 985
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 992
    .line 993
    .line 994
    move-result-object v2

    .line 995
    const/high16 v6, 0x3f800000    # 1.0f

    .line 996
    .line 997
    const/4 v7, 0x0

    .line 998
    const-string v4, ""

    .line 999
    .line 1000
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1001
    .line 1002
    .line 1003
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1008
    .line 1009
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v6

    .line 1013
    const/4 v2, 0x0

    .line 1014
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1018
    .line 1019
    .line 1020
    move-result v10

    .line 1021
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1022
    .line 1023
    .line 1024
    move-result v11

    .line 1025
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1028
    .line 1029
    .line 1030
    const/high16 v4, 0x41a00000    # 20.0f

    .line 1031
    .line 1032
    const/high16 v6, 0x40000000    # 2.0f

    .line 1033
    .line 1034
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1035
    .line 1036
    .line 1037
    const/high16 v4, -0x40800000    # -1.0f

    .line 1038
    .line 1039
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/high16 v25, -0x40800000    # -1.0f

    .line 1043
    .line 1044
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1045
    .line 1046
    const v21, -0x40f33333    # -0.55f

    .line 1047
    .line 1048
    .line 1049
    const/16 v22, 0x0

    .line 1050
    .line 1051
    const/high16 v23, -0x40800000    # -1.0f

    .line 1052
    .line 1053
    const v24, 0x3ee66666    # 0.45f

    .line 1054
    .line 1055
    .line 1056
    move-object/from16 v20, v2

    .line 1057
    .line 1058
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    const/4 v4, 0x0

    .line 1062
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const/high16 v25, 0x3f800000    # 1.0f

    .line 1066
    .line 1067
    const/16 v21, 0x0

    .line 1068
    .line 1069
    const v22, 0x3f0ccccd    # 0.55f

    .line 1070
    .line 1071
    .line 1072
    const v23, 0x3ee66666    # 0.45f

    .line 1073
    .line 1074
    .line 1075
    const/high16 v24, 0x3f800000    # 1.0f

    .line 1076
    .line 1077
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1081
    .line 1082
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v26, -0x40800000    # -1.0f

    .line 1086
    .line 1087
    const v21, 0x3f0ccccd    # 0.55f

    .line 1088
    .line 1089
    .line 1090
    const/16 v22, 0x0

    .line 1091
    .line 1092
    const/high16 v23, 0x3f800000    # 1.0f

    .line 1093
    .line 1094
    const v24, -0x4119999a    # -0.45f

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const/4 v4, 0x0

    .line 1101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const/high16 v25, 0x41a00000    # 20.0f

    .line 1105
    .line 1106
    const/high16 v26, 0x40000000    # 2.0f

    .line 1107
    .line 1108
    const/high16 v21, 0x41a80000    # 21.0f

    .line 1109
    .line 1110
    const v22, 0x401ccccd    # 2.45f

    .line 1111
    .line 1112
    .line 1113
    const v23, 0x41a46666    # 20.55f

    .line 1114
    .line 1115
    .line 1116
    const/high16 v24, 0x40000000    # 2.0f

    .line 1117
    .line 1118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1129
    .line 1130
    const/4 v7, 0x0

    .line 1131
    const-string v4, ""

    .line 1132
    .line 1133
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1134
    .line 1135
    .line 1136
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1137
    .line 1138
    .line 1139
    move-result v3

    .line 1140
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1141
    .line 1142
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v6

    .line 1146
    const/4 v0, 0x0

    .line 1147
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1151
    .line 1152
    .line 1153
    move-result v10

    .line 1154
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1155
    .line 1156
    .line 1157
    move-result v11

    .line 1158
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1161
    .line 1162
    .line 1163
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1164
    .line 1165
    const/high16 v2, 0x41400000    # 12.0f

    .line 1166
    .line 1167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1168
    .line 1169
    .line 1170
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1171
    .line 1172
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1173
    .line 1174
    const v13, 0x4030a3d7    # 2.76f

    .line 1175
    .line 1176
    .line 1177
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1178
    .line 1179
    const v16, -0x3ff0a3d7    # -2.24f

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const/high16 v17, 0x41400000    # 12.0f

    .line 1189
    .line 1190
    const/high16 v18, 0x40e00000    # 7.0f

    .line 1191
    .line 1192
    const/high16 v13, 0x40e00000    # 7.0f

    .line 1193
    .line 1194
    const v14, 0x409851ec    # 4.76f

    .line 1195
    .line 1196
    .line 1197
    const v15, 0x4113d70a    # 9.24f

    .line 1198
    .line 1199
    .line 1200
    const/high16 v16, 0x40e00000    # 7.0f

    .line 1201
    .line 1202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v2

    .line 1212
    const/16 v16, 0x3800

    .line 1213
    .line 1214
    const/16 v17, 0x0

    .line 1215
    .line 1216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1217
    .line 1218
    const/4 v7, 0x0

    .line 1219
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1220
    .line 1221
    const/4 v13, 0x0

    .line 1222
    const/4 v14, 0x0

    .line 1223
    const/4 v15, 0x0

    .line 1224
    const-string v4, ""

    .line 1225
    .line 1226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    sput-object v0, Landroidx/compose/material/icons/rounded/SolarPowerKt;->_solarPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1235
    .line 1236
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1237
    .line 1238
    .line 1239
    return-object v0
.end method
