.class public final Landroidx/compose/material/icons/twotone/TimerOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimerOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TimerOffKt;->_timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TimerOff"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x407ccccd    # 3.95f

    .line 78
    .line 79
    .line 80
    const v26, -0x4063d70a    # -1.22f

    .line 81
    .line 82
    .line 83
    const v21, 0x3fbc28f6    # 1.47f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x40351eb8    # 2.83f

    .line 89
    .line 90
    .line 91
    const v24, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40c70a3d    # 6.22f

    .line 100
    .line 101
    .line 102
    const v6, 0x4110cccd    # 9.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x40a00000    # 5.0f

    .line 109
    .line 110
    const/high16 v26, 0x41500000    # 13.0f

    .line 111
    .line 112
    const v21, 0x40ae6666    # 5.45f

    .line 113
    .line 114
    .line 115
    const v22, 0x4122b852    # 10.17f

    .line 116
    .line 117
    .line 118
    const/high16 v23, 0x40a00000    # 5.0f

    .line 119
    .line 120
    const v24, 0x41387ae1    # 11.53f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x41400000    # 12.0f

    .line 127
    .line 128
    const/high16 v26, 0x41a00000    # 20.0f

    .line 129
    .line 130
    const/high16 v21, 0x40a00000    # 5.0f

    .line 131
    .line 132
    const v22, 0x4186f5c3    # 16.87f

    .line 133
    .line 134
    .line 135
    const v23, 0x4102147b    # 8.13f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x41a00000    # 20.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/16 v16, 0x3800

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const v6, 0x3e99999a    # 0.3f

    .line 155
    .line 156
    .line 157
    const v8, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    const/high16 v9, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v12, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const-string v4, ""

    .line 169
    .line 170
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    const/4 v2, 0x0

    .line 184
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x40c00000    # 6.0f

    .line 201
    .line 202
    const/high16 v6, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, -0x3fd66666    # -2.65f

    .line 208
    .line 209
    .line 210
    const v26, 0x3f051eb8    # 0.52f

    .line 211
    .line 212
    .line 213
    const v21, -0x408f5c29    # -0.94f

    .line 214
    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    const v23, -0x4015c28f    # -1.83f

    .line 219
    .line 220
    .line 221
    const v24, 0x3e428f5c    # 0.19f

    .line 222
    .line 223
    .line 224
    move-object/from16 v20, v2

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x4102b852    # 8.17f

    .line 230
    .line 231
    .line 232
    const/high16 v6, 0x41300000    # 11.0f

    .line 233
    .line 234
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x41000000    # 8.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x40000000    # 2.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x400ae148    # 2.17f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x40af5c29    # 5.48f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, 0x41980000    # 19.0f

    .line 260
    .line 261
    const/high16 v26, 0x41500000    # 13.0f

    .line 262
    .line 263
    const v21, 0x41967ae1    # 18.81f

    .line 264
    .line 265
    .line 266
    const v22, 0x416d47ae    # 14.83f

    .line 267
    .line 268
    .line 269
    const/high16 v23, 0x41980000    # 19.0f

    .line 270
    .line 271
    const v24, 0x415f0a3d    # 13.94f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, 0x41400000    # 12.0f

    .line 278
    .line 279
    const/high16 v26, 0x40c00000    # 6.0f

    .line 280
    .line 281
    const/high16 v21, 0x41980000    # 19.0f

    .line 282
    .line 283
    const v22, 0x4112147b    # 9.13f

    .line 284
    .line 285
    .line 286
    const v23, 0x417deb85    # 15.87f

    .line 287
    .line 288
    .line 289
    const/high16 v24, 0x40c00000    # 6.0f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    const v6, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const/4 v7, 0x0

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
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x41100000    # 9.0f

    .line 338
    .line 339
    const/high16 v6, 0x3f800000    # 1.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x40c00000    # 6.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x40000000    # 2.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, -0x3f400000    # -6.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const/high16 v8, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const-string v4, ""

    .line 370
    .line 371
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 381
    .line 382
    .line 383
    move-result-wide v6

    .line 384
    const/4 v2, 0x0

    .line 385
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40c00000    # 6.0f

    .line 402
    .line 403
    const/high16 v6, 0x41400000    # 12.0f

    .line 404
    .line 405
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v25, 0x40e00000    # 7.0f

    .line 409
    .line 410
    const/high16 v26, 0x40e00000    # 7.0f

    .line 411
    .line 412
    const v21, 0x4077ae14    # 3.87f

    .line 413
    .line 414
    .line 415
    const/16 v22, 0x0

    .line 416
    .line 417
    const/high16 v23, 0x40e00000    # 7.0f

    .line 418
    .line 419
    const v24, 0x404851ec    # 3.13f

    .line 420
    .line 421
    .line 422
    move-object/from16 v20, v2

    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v25, -0x40fae148    # -0.52f

    .line 428
    .line 429
    .line 430
    const v26, 0x4029999a    # 2.65f

    .line 431
    .line 432
    .line 433
    const/16 v21, 0x0

    .line 434
    .line 435
    const v22, 0x3f70a3d7    # 0.94f

    .line 436
    .line 437
    .line 438
    const v23, -0x41bd70a4    # -0.19f

    .line 439
    .line 440
    .line 441
    const v24, 0x3fea3d71    # 1.83f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 448
    .line 449
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v25, 0x41a80000    # 21.0f

    .line 453
    .line 454
    const/high16 v26, 0x41500000    # 13.0f

    .line 455
    .line 456
    const v21, 0x41a50a3d    # 20.63f

    .line 457
    .line 458
    .line 459
    const v22, 0x417e8f5c    # 15.91f

    .line 460
    .line 461
    .line 462
    const/high16 v23, 0x41a80000    # 21.0f

    .line 463
    .line 464
    const/high16 v24, 0x41680000    # 14.5f

    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v25, -0x4003d70a    # -1.97f

    .line 470
    .line 471
    .line 472
    const v26, -0x3f4c7ae1    # -5.61f

    .line 473
    .line 474
    .line 475
    const/16 v21, 0x0

    .line 476
    .line 477
    const v22, -0x3ff851ec    # -2.12f

    .line 478
    .line 479
    .line 480
    const v23, -0x40c28f5c    # -0.74f

    .line 481
    .line 482
    .line 483
    const v24, -0x3f7dc28f    # -4.07f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v4, -0x404a3d71    # -1.42f

    .line 490
    .line 491
    .line 492
    const v6, 0x3fb5c28f    # 1.42f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v25, -0x404b851f    # -1.41f

    .line 499
    .line 500
    .line 501
    const v26, -0x404b851f    # -1.41f

    .line 502
    .line 503
    .line 504
    const v21, -0x4123d70a    # -0.43f

    .line 505
    .line 506
    .line 507
    const v22, -0x40fd70a4    # -0.51f

    .line 508
    .line 509
    .line 510
    const v23, -0x4099999a    # -0.9f

    .line 511
    .line 512
    .line 513
    const v24, -0x40828f5c    # -0.99f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v25, 0x41400000    # 12.0f

    .line 523
    .line 524
    const/high16 v26, 0x40800000    # 4.0f

    .line 525
    .line 526
    const v21, 0x41808f5c    # 16.07f

    .line 527
    .line 528
    .line 529
    const v22, 0x4097ae14    # 4.74f

    .line 530
    .line 531
    .line 532
    const v23, 0x4161eb85    # 14.12f

    .line 533
    .line 534
    .line 535
    const/high16 v24, 0x40800000    # 4.0f

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, -0x3f7b3333    # -4.15f

    .line 541
    .line 542
    .line 543
    const v26, 0x3f828f5c    # 1.02f

    .line 544
    .line 545
    .line 546
    const/high16 v21, -0x40400000    # -1.5f

    .line 547
    .line 548
    const/16 v22, 0x0

    .line 549
    .line 550
    const v23, -0x3fc5c28f    # -2.91f

    .line 551
    .line 552
    .line 553
    const v24, 0x3ebd70a4    # 0.37f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 560
    .line 561
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v25, 0x41400000    # 12.0f

    .line 565
    .line 566
    const/high16 v26, 0x40c00000    # 6.0f

    .line 567
    .line 568
    const v21, 0x4122b852    # 10.17f

    .line 569
    .line 570
    .line 571
    const v22, 0x40c6147b    # 6.19f

    .line 572
    .line 573
    .line 574
    const v23, 0x4130f5c3    # 11.06f

    .line 575
    .line 576
    .line 577
    const/high16 v24, 0x40c00000    # 6.0f

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const-string v4, ""

    .line 593
    .line 594
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 595
    .line 596
    .line 597
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 602
    .line 603
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 604
    .line 605
    .line 606
    move-result-wide v6

    .line 607
    const/4 v2, 0x0

    .line 608
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 612
    .line 613
    .line 614
    move-result v10

    .line 615
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    const/high16 v4, 0x41000000    # 8.0f

    .line 625
    .line 626
    const/high16 v6, 0x41300000    # 11.0f

    .line 627
    .line 628
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v4, 0x3e2e147b    # 0.17f

    .line 632
    .line 633
    .line 634
    const/4 v6, 0x0

    .line 635
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v4, 0x40000000    # 2.0f

    .line 639
    .line 640
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v4, -0x3ff51eb8    # -2.17f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    const/high16 v6, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    const-string v4, ""

    .line 660
    .line 661
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 662
    .line 663
    .line 664
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 669
    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 671
    .line 672
    .line 673
    move-result-wide v6

    .line 674
    const/4 v0, 0x0

    .line 675
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 689
    .line 690
    .line 691
    const v0, 0x4033d70a    # 2.81f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, 0x3fb1eb85    # 1.39f

    .line 698
    .line 699
    .line 700
    const v2, 0x40870a3d    # 4.22f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x4059999a    # 3.4f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v17, 0x40400000    # 3.0f

    .line 713
    .line 714
    const/high16 v18, 0x41500000    # 13.0f

    .line 715
    .line 716
    const v13, 0x406ae148    # 3.67f

    .line 717
    .line 718
    .line 719
    const v14, 0x4111eb85    # 9.12f

    .line 720
    .line 721
    .line 722
    const/high16 v15, 0x40400000    # 3.0f

    .line 723
    .line 724
    const v16, 0x412fae14    # 10.98f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x41100000    # 9.0f

    .line 731
    .line 732
    const/high16 v18, 0x41100000    # 9.0f

    .line 733
    .line 734
    const/4 v13, 0x0

    .line 735
    const v14, 0x409f0a3d    # 4.97f

    .line 736
    .line 737
    .line 738
    const v15, 0x4080a3d7    # 4.02f

    .line 739
    .line 740
    .line 741
    const/high16 v16, 0x41100000    # 9.0f

    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v17, 0x40ac28f6    # 5.38f

    .line 747
    .line 748
    .line 749
    const v18, -0x401ae148    # -1.79f

    .line 750
    .line 751
    .line 752
    const v13, 0x400147ae    # 2.02f

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const v15, 0x407851ec    # 3.88f

    .line 757
    .line 758
    .line 759
    const v16, -0x40d47ae1    # -0.67f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x4019999a    # 2.4f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, 0x3fb47ae1    # 1.41f

    .line 772
    .line 773
    .line 774
    const v2, -0x404b851f    # -1.41f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x4033d70a    # 2.81f

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v0, 0x41a00000    # 20.0f

    .line 790
    .line 791
    const/high16 v2, 0x41400000    # 12.0f

    .line 792
    .line 793
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v17, -0x3f200000    # -7.0f

    .line 797
    .line 798
    const/high16 v18, -0x3f200000    # -7.0f

    .line 799
    .line 800
    const v13, -0x3f8851ec    # -3.87f

    .line 801
    .line 802
    .line 803
    const/high16 v15, -0x3f200000    # -7.0f

    .line 804
    .line 805
    const v16, -0x3fb7ae14    # -3.13f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, 0x3f9c28f6    # 1.22f

    .line 812
    .line 813
    .line 814
    const v18, -0x3f833333    # -3.95f

    .line 815
    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const v14, -0x4043d70a    # -1.47f

    .line 819
    .line 820
    .line 821
    const v15, 0x3ee66666    # 0.45f

    .line 822
    .line 823
    .line 824
    const v16, -0x3fcae148    # -2.83f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, 0x411bae14    # 9.73f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v17, 0x41400000    # 12.0f

    .line 837
    .line 838
    const/high16 v18, 0x41a00000    # 20.0f

    .line 839
    .line 840
    const v13, 0x416d47ae    # 14.83f

    .line 841
    .line 842
    .line 843
    const v14, 0x419c6666    # 19.55f

    .line 844
    .line 845
    .line 846
    const v15, 0x4157851f    # 13.47f

    .line 847
    .line 848
    .line 849
    const/high16 v16, 0x41a00000    # 20.0f

    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    const/16 v16, 0x3800

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/high16 v6, 0x3f800000    # 1.0f

    .line 866
    .line 867
    const/4 v7, 0x0

    .line 868
    const/high16 v12, 0x3f800000    # 1.0f

    .line 869
    .line 870
    const/4 v13, 0x0

    .line 871
    const/4 v14, 0x0

    .line 872
    const/4 v15, 0x0

    .line 873
    const-string v4, ""

    .line 874
    .line 875
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    sput-object v0, Landroidx/compose/material/icons/twotone/TimerOffKt;->_timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    return-object v0
.end method
