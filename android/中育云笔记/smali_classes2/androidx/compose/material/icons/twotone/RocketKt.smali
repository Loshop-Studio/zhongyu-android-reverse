.class public final Landroidx/compose/material/icons/twotone/RocketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rocket:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRocket(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RocketKt;->_rocket:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Rocket"

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
    const/high16 v4, 0x41920000    # 18.25f

    .line 71
    .line 72
    const v6, 0x40ff5c29    # 7.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x40bd70a4    # -0.76f

    .line 79
    .line 80
    .line 81
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 82
    .line 83
    const v21, -0x416b851f    # -0.29f

    .line 84
    .line 85
    .line 86
    const v22, -0x4099999a    # -0.9f

    .line 87
    .line 88
    .line 89
    const v23, -0x40ee147b    # -0.57f

    .line 90
    .line 91
    .line 92
    const v24, -0x4007ae14    # -1.94f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x41808f5c    # 16.07f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x40c00000    # 6.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, 0x403eb852    # 2.98f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x41920000    # 18.25f

    .line 115
    .line 116
    const v6, 0x40ff5c29    # 7.98f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x408b851f    # 4.36f

    .line 126
    .line 127
    .line 128
    const/high16 v6, 0x41400000    # 12.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 134
    .line 135
    const v26, 0x410a3d71    # 8.64f

    .line 136
    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const/16 v22, 0x0

    .line 141
    .line 142
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 143
    .line 144
    const v24, 0x400147ae    # 2.02f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v26, 0x40a00000    # 5.0f

    .line 153
    .line 154
    const/high16 v22, 0x40100000    # 2.25f

    .line 155
    .line 156
    const/high16 v23, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v24, 0x40a00000    # 5.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x40800000    # 4.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v26, -0x3f600000    # -5.0f

    .line 169
    .line 170
    const/16 v22, 0x0

    .line 171
    .line 172
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v25, 0x41400000    # 12.0f

    .line 178
    .line 179
    const v26, 0x408b851f    # 4.36f

    .line 180
    .line 181
    .line 182
    const/high16 v21, 0x41700000    # 15.0f

    .line 183
    .line 184
    const v22, 0x40cc28f6    # 6.38f

    .line 185
    .line 186
    .line 187
    const/high16 v23, 0x41400000    # 12.0f

    .line 188
    .line 189
    const v24, 0x408b851f    # 4.36f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x41500000    # 13.0f

    .line 199
    .line 200
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v25, -0x40000000    # -2.0f

    .line 204
    .line 205
    const/high16 v26, -0x40000000    # -2.0f

    .line 206
    .line 207
    const v21, -0x40733333    # -1.1f

    .line 208
    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const/high16 v23, -0x40000000    # -2.0f

    .line 213
    .line 214
    const v24, -0x4099999a    # -0.9f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x40000000    # 2.0f

    .line 221
    .line 222
    const/16 v21, 0x0

    .line 223
    .line 224
    const v22, -0x40733333    # -1.1f

    .line 225
    .line 226
    .line 227
    const v23, 0x3f666666    # 0.9f

    .line 228
    .line 229
    .line 230
    const/high16 v24, -0x40000000    # -2.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3f666666    # 0.9f

    .line 236
    .line 237
    .line 238
    const/high16 v6, 0x40000000    # 2.0f

    .line 239
    .line 240
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, 0x41400000    # 12.0f

    .line 244
    .line 245
    const/high16 v26, 0x41500000    # 13.0f

    .line 246
    .line 247
    const/high16 v21, 0x41600000    # 14.0f

    .line 248
    .line 249
    const v22, 0x4141999a    # 12.1f

    .line 250
    .line 251
    .line 252
    const v23, 0x4151999a    # 13.1f

    .line 253
    .line 254
    .line 255
    const/high16 v24, 0x41500000    # 13.0f

    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x41986666    # 19.05f

    .line 264
    .line 265
    .line 266
    const/high16 v6, 0x41900000    # 18.0f

    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, -0x3fc147ae    # -2.98f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, -0x40b0a3d7    # -0.81f

    .line 278
    .line 279
    .line 280
    const v6, -0x4063d70a    # -1.22f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v25, -0x40bd70a4    # -0.76f

    .line 287
    .line 288
    .line 289
    const/high16 v26, 0x40400000    # 3.0f

    .line 290
    .line 291
    const v21, -0x41bd70a4    # -0.19f

    .line 292
    .line 293
    .line 294
    const v22, 0x3f866666    # 1.05f

    .line 295
    .line 296
    .line 297
    const v23, -0x410f5c29    # -0.47f

    .line 298
    .line 299
    .line 300
    const v24, 0x40066666    # 2.1f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x41986666    # 19.05f

    .line 307
    .line 308
    .line 309
    const/high16 v6, 0x41900000    # 18.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/16 v16, 0x3800

    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    const v6, 0x3e99999a    # 0.3f

    .line 326
    .line 327
    .line 328
    const v8, 0x3e99999a    # 0.3f

    .line 329
    .line 330
    .line 331
    const/4 v7, 0x0

    .line 332
    const/high16 v9, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v12, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const/4 v14, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    const-string v4, ""

    .line 340
    .line 341
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v6

    .line 354
    const/4 v0, 0x0

    .line 355
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41300000    # 11.0f

    .line 372
    .line 373
    const/high16 v2, 0x41600000    # 14.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x40000000    # -2.0f

    .line 379
    .line 380
    const/high16 v18, -0x40000000    # -2.0f

    .line 381
    .line 382
    const v14, -0x40733333    # -1.1f

    .line 383
    .line 384
    .line 385
    const v15, -0x4099999a    # -0.9f

    .line 386
    .line 387
    .line 388
    const/high16 v16, -0x40000000    # -2.0f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, -0x40000000    # -2.0f

    .line 394
    .line 395
    const v2, 0x3f666666    # 0.9f

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x3f666666    # 0.9f

    .line 404
    .line 405
    .line 406
    const/high16 v2, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x4141999a    # 12.1f

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x41300000    # 11.0f

    .line 415
    .line 416
    const/high16 v4, 0x41600000    # 14.0f

    .line 417
    .line 418
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41920000    # 18.25f

    .line 425
    .line 426
    const v2, 0x40ff5c29    # 7.98f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, -0x40bd70a4    # -0.76f

    .line 433
    .line 434
    .line 435
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 436
    .line 437
    const v13, -0x416b851f    # -0.29f

    .line 438
    .line 439
    .line 440
    const v14, -0x4099999a    # -0.9f

    .line 441
    .line 442
    .line 443
    const v15, -0x40ee147b    # -0.57f

    .line 444
    .line 445
    .line 446
    const v16, -0x4007ae14    # -1.94f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x41808f5c    # 16.07f

    .line 453
    .line 454
    .line 455
    const/high16 v2, 0x40c00000    # 6.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x403eb852    # 2.98f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41920000    # 18.25f

    .line 467
    .line 468
    const v2, 0x40ff5c29    # 7.98f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41400000    # 12.0f

    .line 478
    .line 479
    const/high16 v2, 0x40000000    # 2.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x40a00000    # 5.0f

    .line 485
    .line 486
    const/high16 v18, 0x41300000    # 11.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const/4 v14, 0x0

    .line 490
    const/high16 v15, 0x40a00000    # 5.0f

    .line 491
    .line 492
    const/high16 v16, 0x40000000    # 2.0f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40070a3d    # 2.11f

    .line 498
    .line 499
    .line 500
    const v2, 0x3fb47ae1    # 1.41f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x3f63d70a    # 0.89f

    .line 507
    .line 508
    .line 509
    const v18, 0x3fd47ae1    # 1.66f

    .line 510
    .line 511
    .line 512
    const v13, 0x3f0f5c29    # 0.56f

    .line 513
    .line 514
    .line 515
    const v14, 0x3ebd70a4    # 0.37f

    .line 516
    .line 517
    .line 518
    const v15, 0x3f63d70a    # 0.89f

    .line 519
    .line 520
    .line 521
    const/high16 v16, 0x3f800000    # 1.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41b00000    # 22.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, -0x3f600000    # -5.0f

    .line 532
    .line 533
    const/high16 v2, -0x40000000    # -2.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x41100000    # 9.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, -0x3f600000    # -5.0f

    .line 544
    .line 545
    const/high16 v2, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, -0x3f423d71    # -5.93f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v18, -0x402b851f    # -1.66f

    .line 557
    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const v14, -0x40d47ae1    # -0.67f

    .line 561
    .line 562
    .line 563
    const v15, 0x3ea8f5c3    # 0.33f

    .line 564
    .line 565
    .line 566
    const v16, -0x405ae148    # -1.29f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x40e00000    # 7.0f

    .line 573
    .line 574
    const/high16 v2, 0x41500000    # 13.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x41400000    # 12.0f

    .line 580
    .line 581
    const/high16 v18, 0x40000000    # 2.0f

    .line 582
    .line 583
    const/high16 v13, 0x40e00000    # 7.0f

    .line 584
    .line 585
    const/high16 v14, 0x40800000    # 4.0f

    .line 586
    .line 587
    const/high16 v15, 0x41400000    # 12.0f

    .line 588
    .line 589
    const/high16 v16, 0x40000000    # 2.0f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, 0x408b851f    # 4.36f

    .line 598
    .line 599
    .line 600
    const/high16 v2, 0x41400000    # 12.0f

    .line 601
    .line 602
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 606
    .line 607
    const v18, 0x410a3d71    # 8.64f

    .line 608
    .line 609
    .line 610
    const/4 v13, 0x0

    .line 611
    const/4 v14, 0x0

    .line 612
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 613
    .line 614
    const v16, 0x400147ae    # 2.02f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v18, 0x40a00000    # 5.0f

    .line 623
    .line 624
    const/high16 v14, 0x40100000    # 2.25f

    .line 625
    .line 626
    const/high16 v15, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v16, 0x40a00000    # 5.0f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x40800000    # 4.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v18, -0x3f600000    # -5.0f

    .line 639
    .line 640
    const/4 v14, 0x0

    .line 641
    const/high16 v16, -0x3fd00000    # -2.75f

    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v17, 0x41400000    # 12.0f

    .line 647
    .line 648
    const v18, 0x408b851f    # 4.36f

    .line 649
    .line 650
    .line 651
    const/high16 v13, 0x41700000    # 15.0f

    .line 652
    .line 653
    const v14, 0x40cc28f6    # 6.38f

    .line 654
    .line 655
    .line 656
    const/high16 v15, 0x41400000    # 12.0f

    .line 657
    .line 658
    const v16, 0x408b851f    # 4.36f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x41986666    # 19.05f

    .line 668
    .line 669
    .line 670
    const/high16 v2, 0x41900000    # 18.0f

    .line 671
    .line 672
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, -0x3fc147ae    # -2.98f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, -0x40b0a3d7    # -0.81f

    .line 682
    .line 683
    .line 684
    const v2, -0x4063d70a    # -1.22f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, -0x40bd70a4    # -0.76f

    .line 691
    .line 692
    .line 693
    const/high16 v18, 0x40400000    # 3.0f

    .line 694
    .line 695
    const v13, -0x41bd70a4    # -0.19f

    .line 696
    .line 697
    .line 698
    const v14, 0x3f866666    # 1.05f

    .line 699
    .line 700
    .line 701
    const v15, -0x410f5c29    # -0.47f

    .line 702
    .line 703
    .line 704
    const v16, 0x40066666    # 2.1f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, 0x41986666    # 19.05f

    .line 711
    .line 712
    .line 713
    const/high16 v2, 0x41900000    # 18.0f

    .line 714
    .line 715
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    const/16 v16, 0x3800

    .line 726
    .line 727
    const/16 v17, 0x0

    .line 728
    .line 729
    const/high16 v6, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/high16 v8, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/4 v7, 0x0

    .line 734
    const/high16 v12, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v13, 0x0

    .line 737
    const/4 v14, 0x0

    .line 738
    const/4 v15, 0x0

    .line 739
    const-string v4, ""

    .line 740
    .line 741
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    sput-object v0, Landroidx/compose/material/icons/twotone/RocketKt;->_rocket:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    return-object v0
.end method
