.class public final Landroidx/compose/material/icons/twotone/HotelClassKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hotelClass:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHotelClass(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HotelClassKt;->_hotelClass:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HotelClass"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x41300000    # 11.0f

    .line 71
    .line 72
    const v7, 0x410e3d71    # 8.89f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v8, 0x3f70a3d7    # 0.94f

    .line 79
    .line 80
    .line 81
    const v9, 0x40470a3d    # 3.11f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v8, 0x40347ae1    # 2.82f

    .line 88
    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v12, -0x3feeb852    # -2.27f

    .line 95
    .line 96
    .line 97
    const v13, 0x3fcf5c29    # 1.62f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v14, 0x3f6e147b    # 0.93f

    .line 104
    .line 105
    .line 106
    const v15, 0x4040a3d7    # 3.01f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v14, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v2, -0x40147ae1    # -1.84f

    .line 113
    .line 114
    .line 115
    const v6, -0x3fe51eb8    # -2.42f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v2, 0x3feb851f    # 1.84f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v6, -0x3fbf5c29    # -3.01f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v14, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v2, -0x4030a3d7    # -1.62f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const/high16 v4, 0x41300000    # 11.0f

    .line 150
    .line 151
    const/16 v16, 0x3800

    .line 152
    .line 153
    const v9, -0x3fe51eb8    # -2.42f

    .line 154
    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    move/from16 v20, v4

    .line 159
    .line 160
    const-string v4, ""

    .line 161
    .line 162
    move/from16 v21, v6

    .line 163
    .line 164
    const v6, 0x3e99999a    # 0.3f

    .line 165
    .line 166
    .line 167
    move/from16 v22, v7

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    move/from16 v23, v8

    .line 171
    .line 172
    const v8, 0x3e99999a    # 0.3f

    .line 173
    .line 174
    .line 175
    move/from16 v24, v9

    .line 176
    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    move/from16 v25, v12

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    move/from16 v26, v13

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    move/from16 v27, v14

    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    move/from16 v28, v15

    .line 190
    .line 191
    const/4 v15, 0x0

    .line 192
    move-object/from16 v29, v0

    .line 193
    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 203
    .line 204
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const v2, 0x410e3d71    # 8.89f

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41300000    # 11.0f

    .line 228
    .line 229
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v6, 0x413f0a3d    # 11.94f

    .line 233
    .line 234
    .line 235
    const/high16 v7, 0x41400000    # 12.0f

    .line 236
    .line 237
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v6, 0x40347ae1    # 2.82f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v8, 0x3fcf5c29    # 1.62f

    .line 247
    .line 248
    .line 249
    const v9, -0x3feeb852    # -2.27f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v8, 0x4040a3d7    # 3.01f

    .line 256
    .line 257
    .line 258
    const v9, 0x3f6e147b    # 0.93f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v8, 0x416ca3d7    # 14.79f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v8, 0x3feb851f    # 1.84f

    .line 271
    .line 272
    .line 273
    const v12, -0x3fe51eb8    # -2.42f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v8, -0x3fbf5c29    # -3.01f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v8, 0x40e7ae14    # 7.24f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v2, 0x410947ae    # 8.58f

    .line 301
    .line 302
    .line 303
    const/high16 v6, 0x41200000    # 10.0f

    .line 304
    .line 305
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v7, 0x3f800000    # 1.0f

    .line 309
    .line 310
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v7, 0x40c570a4    # 6.17f

    .line 314
    .line 315
    .line 316
    const v8, 0x408d1eb8    # 4.41f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v7, 0x409a8f5c    # 4.83f

    .line 323
    .line 324
    .line 325
    const/high16 v8, 0x41b00000    # 22.0f

    .line 326
    .line 327
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v7, 0x418a7ae1    # 17.31f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v7, 0x418970a4    # 17.18f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v7, -0x3fe9999a    # -2.35f

    .line 343
    .line 344
    .line 345
    const v9, -0x3f0d1eb8    # -7.59f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v7, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v7, 0x41a80000    # 21.0f

    .line 352
    .line 353
    invoke-virtual {v0, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v7, -0x3f0d70a4    # -7.58f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v7, 0x40000000    # 2.0f

    .line 363
    .line 364
    invoke-virtual {v0, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v2, 0x41aae148    # 21.36f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, -0x4011eb85    # -1.86f

    .line 380
    .line 381
    .line 382
    const v6, -0x3f3fae14    # -6.01f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, 0x41bd70a4    # 23.68f

    .line 389
    .line 390
    .line 391
    const/high16 v6, 0x41500000    # 13.0f

    .line 392
    .line 393
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, -0x3fa3d70a    # -3.44f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v4, -0x3fbae148    # -3.08f

    .line 403
    .line 404
    .line 405
    const v6, 0x400ccccd    # 2.2f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, 0x3fbae148    # 1.46f

    .line 412
    .line 413
    .line 414
    const v6, 0x40970a3d    # 4.72f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x41880000    # 17.0f

    .line 427
    .line 428
    const/high16 v4, 0x41000000    # 8.0f

    .line 429
    .line 430
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v6, -0x40170a3d    # -1.82f

    .line 434
    .line 435
    .line 436
    const/high16 v7, -0x3f400000    # -6.0f

    .line 437
    .line 438
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v6, -0x407ae148    # -1.04f

    .line 442
    .line 443
    .line 444
    const v7, 0x405ccccd    # 3.45f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v6, 0x416e8f5c    # 14.91f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    const/high16 v6, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    const/high16 v8, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v9, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v12, 0x3f800000    # 1.0f

    .line 476
    .line 477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sput-object v0, Landroidx/compose/material/icons/twotone/HotelClassKt;->_hotelClass:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 486
    .line 487
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    return-object v0
.end method
