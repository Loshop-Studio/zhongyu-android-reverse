.class public final Landroidx/compose/material/icons/outlined/Face3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _face3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace3(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Face3Kt;->_face3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Face3"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40600000    # -1.25f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40200000    # 2.5f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 88
    .line 89
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v6, 0x41500000    # 13.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/high16 v6, -0x40600000    # -1.25f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40200000    # 2.5f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const v0, 0x41b747ae    # 22.91f

    .line 224
    .line 225
    .line 226
    const v2, 0x413f5c29    # 11.96f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x41400000    # 12.0f

    .line 233
    .line 234
    const/high16 v18, 0x40000000    # 2.0f

    .line 235
    .line 236
    const v13, 0x41b31eb8    # 22.39f

    .line 237
    .line 238
    .line 239
    const v14, 0x40ca3d71    # 6.32f

    .line 240
    .line 241
    .line 242
    const v15, 0x418d47ae    # 17.66f

    .line 243
    .line 244
    .line 245
    const/high16 v16, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x40ca3d71    # 6.32f

    .line 251
    .line 252
    .line 253
    const v2, 0x3f8b851f    # 1.09f

    .line 254
    .line 255
    .line 256
    const v4, 0x413f5c29    # 11.96f

    .line 257
    .line 258
    .line 259
    const v6, 0x3fce147b    # 1.61f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, -0x4099999a    # -0.9f

    .line 266
    .line 267
    .line 268
    const v2, 0x411dc28f    # 9.86f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, 0x400c28f6    # 2.19f

    .line 275
    .line 276
    .line 277
    const/high16 v18, 0x41c00000    # 24.0f

    .line 278
    .line 279
    const v13, 0x3db851ec    # 0.09f

    .line 280
    .line 281
    .line 282
    const v14, 0x41b7eb85    # 22.99f

    .line 283
    .line 284
    .line 285
    const v15, 0x3f8147ae    # 1.01f

    .line 286
    .line 287
    .line 288
    const/high16 v16, 0x41c00000    # 24.0f

    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x419cf5c3    # 19.62f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3ffeb852    # 1.99f

    .line 300
    .line 301
    .line 302
    const v18, -0x3ff47ae1    # -2.18f

    .line 303
    .line 304
    .line 305
    const v13, 0x3f970a3d    # 1.18f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, 0x40066666    # 2.1f

    .line 310
    .line 311
    .line 312
    const v16, -0x407eb852    # -1.01f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x41b747ae    # 22.91f

    .line 319
    .line 320
    .line 321
    const v2, 0x413f5c29    # 11.96f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x40823d71    # 4.07f

    .line 331
    .line 332
    .line 333
    const/high16 v2, 0x41500000    # 13.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x40afae14    # 5.49f

    .line 339
    .line 340
    .line 341
    const v18, 0x4051eb85    # 3.28f

    .line 342
    .line 343
    .line 344
    const v13, 0x4010a3d7    # 2.26f

    .line 345
    .line 346
    .line 347
    const v14, 0x3e8f5c29    # 0.28f

    .line 348
    .line 349
    .line 350
    const v15, 0x40870a3d    # 4.22f

    .line 351
    .line 352
    .line 353
    const v16, 0x3fc147ae    # 1.51f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x41840000    # 16.5f

    .line 360
    .line 361
    const/high16 v18, 0x41000000    # 8.0f

    .line 362
    .line 363
    const v13, 0x418f47ae    # 17.91f

    .line 364
    .line 365
    .line 366
    const/high16 v14, 0x40f80000    # 7.75f

    .line 367
    .line 368
    const v15, 0x4189d70a    # 17.23f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x41000000    # 8.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x41500000    # 13.0f

    .line 377
    .line 378
    const/high16 v18, 0x40900000    # 4.5f

    .line 379
    .line 380
    const v13, 0x41691eb8    # 14.57f

    .line 381
    .line 382
    .line 383
    const/high16 v14, 0x41000000    # 8.0f

    .line 384
    .line 385
    const/high16 v15, 0x41500000    # 13.0f

    .line 386
    .line 387
    const v16, 0x40cdc28f    # 6.43f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x41300000    # 11.0f

    .line 400
    .line 401
    const v2, 0x40823d71    # 4.07f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40900000    # 4.5f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x40f00000    # 7.5f

    .line 413
    .line 414
    const/high16 v18, 0x41000000    # 8.0f

    .line 415
    .line 416
    const/high16 v13, 0x41300000    # 11.0f

    .line 417
    .line 418
    const v14, 0x40cdc28f    # 6.43f

    .line 419
    .line 420
    .line 421
    const v15, 0x4116e148    # 9.43f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x41000000    # 8.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x40b051ec    # 5.51f

    .line 430
    .line 431
    .line 432
    const v18, 0x40eb3333    # 7.35f

    .line 433
    .line 434
    .line 435
    const v13, 0x40d8a3d7    # 6.77f

    .line 436
    .line 437
    .line 438
    const/high16 v14, 0x41000000    # 8.0f

    .line 439
    .line 440
    const v15, 0x40c2e148    # 6.09f

    .line 441
    .line 442
    .line 443
    const/high16 v16, 0x40f80000    # 7.75f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x41300000    # 11.0f

    .line 449
    .line 450
    const v18, 0x40823d71    # 4.07f

    .line 451
    .line 452
    .line 453
    const v13, 0x40d8f5c3    # 6.78f

    .line 454
    .line 455
    .line 456
    const v14, 0x40b28f5c    # 5.58f

    .line 457
    .line 458
    .line 459
    const v15, 0x410bd70a    # 8.74f

    .line 460
    .line 461
    .line 462
    const v16, 0x408b3333    # 4.35f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x409147ae    # 4.54f

    .line 472
    .line 473
    .line 474
    const v2, 0x4112147b    # 9.13f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x40f00000    # 7.5f

    .line 481
    .line 482
    const/high16 v18, 0x41200000    # 10.0f

    .line 483
    .line 484
    const v13, 0x40ad1eb8    # 5.41f

    .line 485
    .line 486
    .line 487
    const v14, 0x411ae148    # 9.68f

    .line 488
    .line 489
    .line 490
    const v15, 0x40cdc28f    # 6.43f

    .line 491
    .line 492
    .line 493
    const/high16 v16, 0x41200000    # 10.0f

    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x41400000    # 12.0f

    .line 499
    .line 500
    const v18, 0x40f4cccd    # 7.65f

    .line 501
    .line 502
    .line 503
    const v13, 0x4115c28f    # 9.36f

    .line 504
    .line 505
    .line 506
    const/high16 v14, 0x41200000    # 10.0f

    .line 507
    .line 508
    const/high16 v15, 0x41300000    # 11.0f

    .line 509
    .line 510
    const v16, 0x41111eb8    # 9.07f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41840000    # 16.5f

    .line 517
    .line 518
    const/high16 v18, 0x41200000    # 10.0f

    .line 519
    .line 520
    const/high16 v13, 0x41500000    # 13.0f

    .line 521
    .line 522
    const v14, 0x41111eb8    # 9.07f

    .line 523
    .line 524
    .line 525
    const v15, 0x416a3d71    # 14.64f

    .line 526
    .line 527
    .line 528
    const/high16 v16, 0x41200000    # 10.0f

    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x403d70a4    # 2.96f

    .line 534
    .line 535
    .line 536
    const v18, -0x40a147ae    # -0.87f

    .line 537
    .line 538
    .line 539
    const v13, 0x3f88f5c3    # 1.07f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const v15, 0x4005c28f    # 2.09f

    .line 544
    .line 545
    .line 546
    const v16, -0x415c28f6    # -0.32f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41a00000    # 20.0f

    .line 553
    .line 554
    const/high16 v18, 0x41400000    # 12.0f

    .line 555
    .line 556
    const v13, 0x419e6666    # 19.8f

    .line 557
    .line 558
    .line 559
    const v14, 0x412051ec    # 10.02f

    .line 560
    .line 561
    .line 562
    const/high16 v15, 0x41a00000    # 20.0f

    .line 563
    .line 564
    const v16, 0x412fd70a    # 10.99f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, -0x3f000000    # -8.0f

    .line 571
    .line 572
    const/high16 v18, 0x41000000    # 8.0f

    .line 573
    .line 574
    const/4 v13, 0x0

    .line 575
    const v14, 0x408d1eb8    # 4.41f

    .line 576
    .line 577
    .line 578
    const v15, -0x3f9a3d71    # -3.59f

    .line 579
    .line 580
    .line 581
    const/high16 v16, 0x41000000    # 8.0f

    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, -0x3f9a3d71    # -3.59f

    .line 587
    .line 588
    .line 589
    const/high16 v2, -0x3f000000    # -8.0f

    .line 590
    .line 591
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, 0x409147ae    # 4.54f

    .line 595
    .line 596
    .line 597
    const v18, 0x4112147b    # 9.13f

    .line 598
    .line 599
    .line 600
    const/high16 v13, 0x40800000    # 4.0f

    .line 601
    .line 602
    const v14, 0x412fd70a    # 10.99f

    .line 603
    .line 604
    .line 605
    const v15, 0x40866666    # 4.2f

    .line 606
    .line 607
    .line 608
    const v16, 0x412051ec    # 10.02f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41b00000    # 22.0f

    .line 618
    .line 619
    const/high16 v2, 0x41400000    # 12.0f

    .line 620
    .line 621
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, 0x400c28f6    # 2.19f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, -0x3f39999a    # -6.2f

    .line 631
    .line 632
    .line 633
    const v2, 0x3f0f5c29    # 0.56f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41400000    # 12.0f

    .line 640
    .line 641
    const/high16 v18, 0x41b00000    # 22.0f

    .line 642
    .line 643
    const/high16 v13, 0x40880000    # 4.25f

    .line 644
    .line 645
    const v14, 0x419b851f    # 19.44f

    .line 646
    .line 647
    .line 648
    const v15, 0x40fa3d71    # 7.82f

    .line 649
    .line 650
    .line 651
    const/high16 v16, 0x41b00000    # 22.0f

    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, -0x3fdc28f6    # -2.56f

    .line 657
    .line 658
    .line 659
    const/high16 v2, 0x41140000    # 9.25f

    .line 660
    .line 661
    const v4, -0x3f39999a    # -6.2f

    .line 662
    .line 663
    .line 664
    const/high16 v6, 0x40f80000    # 7.75f

    .line 665
    .line 666
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x40c66666    # 6.2f

    .line 670
    .line 671
    .line 672
    const v2, 0x3f0f5c29    # 0.56f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x41400000    # 12.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    const/16 v16, 0x3800

    .line 691
    .line 692
    const/16 v17, 0x0

    .line 693
    .line 694
    const/high16 v6, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/4 v7, 0x0

    .line 697
    const/high16 v12, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const/4 v13, 0x0

    .line 700
    const/4 v14, 0x0

    .line 701
    const/4 v15, 0x0

    .line 702
    const-string v4, ""

    .line 703
    .line 704
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    sput-object v0, Landroidx/compose/material/icons/outlined/Face3Kt;->_face3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 713
    .line 714
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    return-object v0
.end method
