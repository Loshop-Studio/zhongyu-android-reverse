.class public final Landroidx/compose/material/icons/twotone/CycloneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCyclone(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Cyclone"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const v21, -0x3fac28f6    # -3.31f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const v24, 0x402c28f6    # 2.69f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x402c28f6    # 2.69f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40c00000    # 6.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3fd3d70a    # -2.69f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f400000    # -6.0f

    .line 108
    .line 109
    const/high16 v7, 0x40c00000    # 6.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4174f5c3    # 15.31f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41800000    # 16.0f

    .line 128
    .line 129
    const/high16 v6, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, -0x3f800000    # -4.0f

    .line 135
    .line 136
    const/high16 v26, -0x3f800000    # -4.0f

    .line 137
    .line 138
    const v21, -0x3ff28f5c    # -2.21f

    .line 139
    .line 140
    .line 141
    const/high16 v23, -0x3f800000    # -4.0f

    .line 142
    .line 143
    const v24, -0x401ae148    # -1.79f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, 0x40800000    # 4.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, -0x3ff28f5c    # -2.21f

    .line 154
    .line 155
    .line 156
    const v23, 0x3fe51eb8    # 1.79f

    .line 157
    .line 158
    .line 159
    const/high16 v24, -0x3f800000    # -4.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v26, 0x40800000    # 4.0f

    .line 165
    .line 166
    const v21, 0x400d70a4    # 2.21f

    .line 167
    .line 168
    .line 169
    const/16 v22, 0x0

    .line 170
    .line 171
    const/high16 v23, 0x40800000    # 4.0f

    .line 172
    .line 173
    const v24, 0x3fe51eb8    # 1.79f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, 0x41400000    # 12.0f

    .line 180
    .line 181
    const/high16 v26, 0x41800000    # 16.0f

    .line 182
    .line 183
    const/high16 v21, 0x41800000    # 16.0f

    .line 184
    .line 185
    const v22, 0x41635c29    # 14.21f

    .line 186
    .line 187
    .line 188
    const v23, 0x41635c29    # 14.21f

    .line 189
    .line 190
    .line 191
    const/high16 v24, 0x41800000    # 16.0f

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const v6, 0x3e99999a    # 0.3f

    .line 208
    .line 209
    .line 210
    const v8, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    const/high16 v9, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v12, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const-string v4, ""

    .line 222
    .line 223
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const/4 v2, 0x0

    .line 237
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, -0x40000000    # -2.0f

    .line 259
    .line 260
    const/4 v6, 0x0

    .line 261
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v26, 0x40800000    # 4.0f

    .line 265
    .line 266
    const/16 v27, 0x0

    .line 267
    .line 268
    const/high16 v21, 0x40000000    # 2.0f

    .line 269
    .line 270
    const/high16 v22, 0x40000000    # 2.0f

    .line 271
    .line 272
    const/16 v23, 0x0

    .line 273
    .line 274
    const/16 v24, 0x1

    .line 275
    .line 276
    const/16 v25, 0x1

    .line 277
    .line 278
    move-object/from16 v20, v2

    .line 279
    .line 280
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v26, -0x3f800000    # -4.0f

    .line 284
    .line 285
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const v6, 0x3e99999a    # 0.3f

    .line 293
    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41000000    # 8.0f

    .line 329
    .line 330
    const/high16 v6, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, -0x3f800000    # -4.0f

    .line 336
    .line 337
    const/high16 v26, 0x40800000    # 4.0f

    .line 338
    .line 339
    const v21, -0x3ff28f5c    # -2.21f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/high16 v23, -0x3f800000    # -4.0f

    .line 345
    .line 346
    const v24, 0x3fe51eb8    # 1.79f

    .line 347
    .line 348
    .line 349
    move-object/from16 v20, v2

    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v25, 0x40800000    # 4.0f

    .line 355
    .line 356
    const/16 v21, 0x0

    .line 357
    .line 358
    const v22, 0x400d70a4    # 2.21f

    .line 359
    .line 360
    .line 361
    const v23, 0x3fe51eb8    # 1.79f

    .line 362
    .line 363
    .line 364
    const/high16 v24, 0x40800000    # 4.0f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v26, -0x3f800000    # -4.0f

    .line 370
    .line 371
    const v21, 0x400d70a4    # 2.21f

    .line 372
    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const/high16 v23, 0x40800000    # 4.0f

    .line 377
    .line 378
    const v24, -0x401ae148    # -1.79f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v25, 0x41400000    # 12.0f

    .line 385
    .line 386
    const/high16 v26, 0x41000000    # 8.0f

    .line 387
    .line 388
    const/high16 v21, 0x41800000    # 16.0f

    .line 389
    .line 390
    const v22, 0x411ca3d7    # 9.79f

    .line 391
    .line 392
    .line 393
    const v23, 0x41635c29    # 14.21f

    .line 394
    .line 395
    .line 396
    const/high16 v24, 0x41000000    # 8.0f

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x41600000    # 14.0f

    .line 405
    .line 406
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v25, -0x40000000    # -2.0f

    .line 410
    .line 411
    const/high16 v26, -0x40000000    # -2.0f

    .line 412
    .line 413
    const v21, -0x40733333    # -1.1f

    .line 414
    .line 415
    .line 416
    const/16 v22, 0x0

    .line 417
    .line 418
    const/high16 v23, -0x40000000    # -2.0f

    .line 419
    .line 420
    const v24, -0x4099999a    # -0.9f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x40000000    # 2.0f

    .line 427
    .line 428
    const/16 v21, 0x0

    .line 429
    .line 430
    const v22, -0x40733333    # -1.1f

    .line 431
    .line 432
    .line 433
    const v23, 0x3f666666    # 0.9f

    .line 434
    .line 435
    .line 436
    const/high16 v24, -0x40000000    # -2.0f

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v4, 0x3f666666    # 0.9f

    .line 442
    .line 443
    .line 444
    const/high16 v6, 0x40000000    # 2.0f

    .line 445
    .line 446
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v25, 0x41400000    # 12.0f

    .line 450
    .line 451
    const/high16 v26, 0x41600000    # 14.0f

    .line 452
    .line 453
    const/high16 v21, 0x41600000    # 14.0f

    .line 454
    .line 455
    const v22, 0x4151999a    # 13.1f

    .line 456
    .line 457
    .line 458
    const v23, 0x4151999a    # 13.1f

    .line 459
    .line 460
    .line 461
    const/high16 v24, 0x41600000    # 14.0f

    .line 462
    .line 463
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 488
    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    const/4 v0, 0x0

    .line 494
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41b00000    # 22.0f

    .line 511
    .line 512
    const v2, 0x40ab3333    # 5.35f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x41400000    # 12.0f

    .line 519
    .line 520
    const/high16 v18, 0x40800000    # 4.0f

    .line 521
    .line 522
    const v13, 0x41a06666    # 20.05f

    .line 523
    .line 524
    .line 525
    const v14, 0x4098a3d7    # 4.77f

    .line 526
    .line 527
    .line 528
    const v15, 0x41847ae1    # 16.56f

    .line 529
    .line 530
    .line 531
    const/high16 v16, 0x40800000    # 4.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x40ceb852    # 6.46f

    .line 537
    .line 538
    .line 539
    const v18, 0x40c7ae14    # 6.24f

    .line 540
    .line 541
    .line 542
    const v13, 0x411d999a    # 9.85f

    .line 543
    .line 544
    .line 545
    const/high16 v14, 0x40800000    # 4.0f

    .line 546
    .line 547
    const v15, 0x40fc7ae1    # 7.89f

    .line 548
    .line 549
    .line 550
    const v16, 0x409b851f    # 4.86f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, 0x40ef0a3d    # 7.47f

    .line 557
    .line 558
    .line 559
    const/high16 v18, 0x40000000    # 2.0f

    .line 560
    .line 561
    const v13, 0x40d2e148    # 6.59f

    .line 562
    .line 563
    .line 564
    const v14, 0x40ac7ae1    # 5.39f

    .line 565
    .line 566
    .line 567
    const v15, 0x40db851f    # 6.86f

    .line 568
    .line 569
    .line 570
    const v16, 0x4075c28f    # 3.84f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x40ab3333    # 5.35f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, 0x40800000    # 4.0f

    .line 583
    .line 584
    const/high16 v18, 0x41400000    # 12.0f

    .line 585
    .line 586
    const v13, 0x4098a3d7    # 4.77f

    .line 587
    .line 588
    .line 589
    const v14, 0x407ccccd    # 3.95f

    .line 590
    .line 591
    .line 592
    const/high16 v15, 0x40800000    # 4.0f

    .line 593
    .line 594
    const v16, 0x40ee147b    # 7.44f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, 0x400f5c29    # 2.24f

    .line 601
    .line 602
    .line 603
    const v18, 0x40b147ae    # 5.54f

    .line 604
    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const v14, 0x4009999a    # 2.15f

    .line 608
    .line 609
    .line 610
    const v15, 0x3f5c28f6    # 0.86f

    .line 611
    .line 612
    .line 613
    const v16, 0x4083851f    # 4.11f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, -0x3f7851ec    # -4.24f

    .line 620
    .line 621
    .line 622
    const v18, -0x407eb852    # -1.01f

    .line 623
    .line 624
    .line 625
    const v13, -0x40a66666    # -0.85f

    .line 626
    .line 627
    .line 628
    const v14, -0x41f0a3d7    # -0.14f

    .line 629
    .line 630
    .line 631
    const v15, -0x3fe66666    # -2.4f

    .line 632
    .line 633
    .line 634
    const v16, -0x41333333    # -0.4f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x4007ae14    # 2.12f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v17, 0x41400000    # 12.0f

    .line 647
    .line 648
    const/high16 v18, 0x41a00000    # 20.0f

    .line 649
    .line 650
    const v13, 0x407ccccd    # 3.95f

    .line 651
    .line 652
    .line 653
    const v14, 0x4199d70a    # 19.23f

    .line 654
    .line 655
    .line 656
    const v15, 0x40ee147b    # 7.44f

    .line 657
    .line 658
    .line 659
    const/high16 v16, 0x41a00000    # 20.0f

    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x40b147ae    # 5.54f

    .line 665
    .line 666
    .line 667
    const v18, -0x3ff0a3d7    # -2.24f

    .line 668
    .line 669
    .line 670
    const v13, 0x4009999a    # 2.15f

    .line 671
    .line 672
    .line 673
    const/4 v14, 0x0

    .line 674
    const v15, 0x4083851f    # 4.11f

    .line 675
    .line 676
    .line 677
    const v16, -0x40a3d70a    # -0.86f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, -0x407eb852    # -1.01f

    .line 684
    .line 685
    .line 686
    const v18, 0x4087ae14    # 4.24f

    .line 687
    .line 688
    .line 689
    const v13, -0x41f0a3d7    # -0.14f

    .line 690
    .line 691
    .line 692
    const v14, 0x3f59999a    # 0.85f

    .line 693
    .line 694
    .line 695
    const v15, -0x41333333    # -0.4f

    .line 696
    .line 697
    .line 698
    const v16, 0x4019999a    # 2.4f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, 0x41a00000    # 20.0f

    .line 708
    .line 709
    const/high16 v18, 0x41400000    # 12.0f

    .line 710
    .line 711
    const v13, 0x4199d70a    # 19.23f

    .line 712
    .line 713
    .line 714
    const v14, 0x41a06666    # 20.05f

    .line 715
    .line 716
    .line 717
    const/high16 v15, 0x41a00000    # 20.0f

    .line 718
    .line 719
    const v16, 0x41847ae1    # 16.56f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v17, -0x3ff0a3d7    # -2.24f

    .line 726
    .line 727
    .line 728
    const v18, -0x3f4eb852    # -5.54f

    .line 729
    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    const v14, -0x3ff66666    # -2.15f

    .line 733
    .line 734
    .line 735
    const v15, -0x40a3d70a    # -0.86f

    .line 736
    .line 737
    .line 738
    const v16, -0x3f7c7ae1    # -4.11f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v17, 0x4087ae14    # 4.24f

    .line 745
    .line 746
    .line 747
    const v18, 0x3f8147ae    # 1.01f

    .line 748
    .line 749
    .line 750
    const v13, 0x3f59999a    # 0.85f

    .line 751
    .line 752
    .line 753
    const v14, 0x3e0f5c29    # 0.14f

    .line 754
    .line 755
    .line 756
    const v15, 0x4019999a    # 2.4f

    .line 757
    .line 758
    .line 759
    const v16, 0x3ecccccd    # 0.4f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x40ab3333    # 5.35f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v0, 0x41900000    # 18.0f

    .line 775
    .line 776
    const/high16 v2, 0x41400000    # 12.0f

    .line 777
    .line 778
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, -0x3f400000    # -6.0f

    .line 782
    .line 783
    const/high16 v18, 0x40c00000    # 6.0f

    .line 784
    .line 785
    const/4 v13, 0x0

    .line 786
    const v14, 0x4053d70a    # 3.31f

    .line 787
    .line 788
    .line 789
    const v15, -0x3fd3d70a    # -2.69f

    .line 790
    .line 791
    .line 792
    const/high16 v16, 0x40c00000    # 6.0f

    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v0, -0x3fd3d70a    # -2.69f

    .line 798
    .line 799
    .line 800
    const/high16 v2, -0x3f400000    # -6.0f

    .line 801
    .line 802
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, 0x402c28f6    # 2.69f

    .line 806
    .line 807
    .line 808
    const/high16 v4, 0x40c00000    # 6.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x410b0a3d    # 8.69f

    .line 814
    .line 815
    .line 816
    const/high16 v2, 0x41900000    # 18.0f

    .line 817
    .line 818
    const/high16 v4, 0x41400000    # 12.0f

    .line 819
    .line 820
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    const/16 v16, 0x3800

    .line 831
    .line 832
    const/16 v17, 0x0

    .line 833
    .line 834
    const/high16 v6, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    const/high16 v12, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v14, 0x0

    .line 840
    const/4 v15, 0x0

    .line 841
    const-string v4, ""

    .line 842
    .line 843
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    sput-object v0, Landroidx/compose/material/icons/twotone/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0
.end method
