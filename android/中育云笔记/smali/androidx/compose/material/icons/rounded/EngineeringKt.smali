.class public final Landroidx/compose/material/icons/rounded/EngineeringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _engineering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEngineering(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Engineering"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3fd51eb8    # -2.67f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x3fab851f    # 1.34f

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
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v26, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, 0x3f0ccccd    # 0.55f

    .line 108
    .line 109
    .line 110
    const v23, 0x3ee66666    # 0.45f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41600000    # 14.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v26, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v21, 0x3f0ccccd    # 0.55f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v24, -0x4119999a    # -0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x40800000    # -1.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41100000    # 9.0f

    .line 144
    .line 145
    const/high16 v26, 0x41700000    # 15.0f

    .line 146
    .line 147
    const/high16 v21, 0x41880000    # 17.0f

    .line 148
    .line 149
    const v22, 0x4182b852    # 16.34f

    .line 150
    .line 151
    .line 152
    const v23, 0x413ab852    # 11.67f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x41700000    # 15.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const v4, 0x4097ae14    # 4.74f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x41100000    # 9.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x41087ae1    # 8.53f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v25, 0x3efae148    # 0.49f

    .line 230
    .line 231
    .line 232
    const v26, -0x41051eb8    # -0.49f

    .line 233
    .line 234
    .line 235
    const v21, 0x3e8a3d71    # 0.27f

    .line 236
    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const v23, 0x3efae148    # 0.49f

    .line 241
    .line 242
    .line 243
    const v24, -0x419eb852    # -0.22f

    .line 244
    .line 245
    .line 246
    move-object/from16 v20, v2

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x4107d70a    # 8.49f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, -0x41051eb8    # -0.49f

    .line 258
    .line 259
    .line 260
    const/16 v21, 0x0

    .line 261
    .line 262
    const v22, -0x4175c28f    # -0.27f

    .line 263
    .line 264
    .line 265
    const v23, -0x419eb852    # -0.22f

    .line 266
    .line 267
    .line 268
    const v24, -0x41051eb8    # -0.49f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x41500000    # 13.0f

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v25, -0x40000000    # -2.0f

    .line 280
    .line 281
    const v26, -0x3fa33333    # -3.45f

    .line 282
    .line 283
    .line 284
    const v22, -0x40428f5c    # -1.48f

    .line 285
    .line 286
    .line 287
    const v23, -0x40b0a3d7    # -0.81f

    .line 288
    .line 289
    .line 290
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40b00000    # 5.5f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v25, 0x41280000    # 10.5f

    .line 301
    .line 302
    const/high16 v26, 0x40c00000    # 6.0f

    .line 303
    .line 304
    const/high16 v21, 0x41300000    # 11.0f

    .line 305
    .line 306
    const v22, 0x40b8f5c3    # 5.78f

    .line 307
    .line 308
    .line 309
    const v23, 0x412c7ae1    # 10.78f

    .line 310
    .line 311
    .line 312
    const/high16 v24, 0x40c00000    # 6.0f

    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x40b8f5c3    # 5.78f

    .line 318
    .line 319
    .line 320
    const/high16 v6, 0x41200000    # 10.0f

    .line 321
    .line 322
    const/high16 v7, 0x40b00000    # 5.5f

    .line 323
    .line 324
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x40847ae1    # 4.14f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v25, 0x41100000    # 9.0f

    .line 334
    .line 335
    const/high16 v26, 0x40800000    # 4.0f

    .line 336
    .line 337
    const v21, 0x411ae148    # 9.68f

    .line 338
    .line 339
    .line 340
    const v22, 0x4081eb85    # 4.06f

    .line 341
    .line 342
    .line 343
    const v23, 0x4115999a    # 9.35f

    .line 344
    .line 345
    .line 346
    const/high16 v24, 0x40800000    # 4.0f

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, 0x4081eb85    # 4.06f

    .line 352
    .line 353
    .line 354
    const/high16 v6, 0x41000000    # 8.0f

    .line 355
    .line 356
    const v7, 0x40847ae1    # 4.14f

    .line 357
    .line 358
    .line 359
    const v8, 0x41051eb8    # 8.32f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x40b00000    # 5.5f

    .line 366
    .line 367
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v25, 0x40f00000    # 7.5f

    .line 371
    .line 372
    const/high16 v26, 0x40c00000    # 6.0f

    .line 373
    .line 374
    const/high16 v21, 0x41000000    # 8.0f

    .line 375
    .line 376
    const v22, 0x40b8f5c3    # 5.78f

    .line 377
    .line 378
    .line 379
    const v23, 0x40f8f5c3    # 7.78f

    .line 380
    .line 381
    .line 382
    const/high16 v24, 0x40c00000    # 6.0f

    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x40e00000    # 7.0f

    .line 388
    .line 389
    const v6, 0x40b8f5c3    # 5.78f

    .line 390
    .line 391
    .line 392
    const/high16 v7, 0x40b00000    # 5.5f

    .line 393
    .line 394
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v4, 0x4091999a    # 4.55f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v25, 0x40a00000    # 5.0f

    .line 404
    .line 405
    const/high16 v26, 0x41000000    # 8.0f

    .line 406
    .line 407
    const v21, 0x40b9eb85    # 5.81f

    .line 408
    .line 409
    .line 410
    const/high16 v22, 0x40a80000    # 5.25f

    .line 411
    .line 412
    const/high16 v23, 0x40a00000    # 5.0f

    .line 413
    .line 414
    const v24, 0x40d0a3d7    # 6.52f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, 0x4097ae14    # 4.74f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x40880000    # 4.25f

    .line 427
    .line 428
    const v26, 0x4107d70a    # 8.49f

    .line 429
    .line 430
    .line 431
    const v21, 0x408f0a3d    # 4.47f

    .line 432
    .line 433
    .line 434
    const/high16 v22, 0x41000000    # 8.0f

    .line 435
    .line 436
    const/high16 v23, 0x40880000    # 4.25f

    .line 437
    .line 438
    const v24, 0x4103851f    # 8.22f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x3cf5c28f    # 0.03f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v25, 0x4097ae14    # 4.74f

    .line 451
    .line 452
    .line 453
    const/high16 v26, 0x41100000    # 9.0f

    .line 454
    .line 455
    const/high16 v21, 0x40880000    # 4.25f

    .line 456
    .line 457
    const v22, 0x410c7ae1    # 8.78f

    .line 458
    .line 459
    .line 460
    const v23, 0x408f0a3d    # 4.47f

    .line 461
    .line 462
    .line 463
    const/high16 v24, 0x41100000    # 9.0f

    .line 464
    .line 465
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/high16 v6, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v8, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    const/4 v2, 0x0

    .line 496
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x41500000    # 13.0f

    .line 513
    .line 514
    const/high16 v6, 0x41100000    # 9.0f

    .line 515
    .line 516
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v25, 0x40770a3d    # 3.86f

    .line 520
    .line 521
    .line 522
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 523
    .line 524
    const v21, 0x3fee147b    # 1.86f

    .line 525
    .line 526
    .line 527
    const/16 v22, 0x0

    .line 528
    .line 529
    const v23, 0x405a3d71    # 3.41f

    .line 530
    .line 531
    .line 532
    const v24, -0x405c28f6    # -1.28f

    .line 533
    .line 534
    .line 535
    move-object/from16 v20, v2

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x40a47ae1    # 5.14f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v25, 0x41100000    # 9.0f

    .line 547
    .line 548
    const/high16 v26, 0x41500000    # 13.0f

    .line 549
    .line 550
    const v21, 0x40b2e148    # 5.59f

    .line 551
    .line 552
    .line 553
    const v22, 0x413b851f    # 11.72f

    .line 554
    .line 555
    .line 556
    const v23, 0x40e47ae1    # 7.14f

    .line 557
    .line 558
    .line 559
    const/high16 v24, 0x41500000    # 13.0f

    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const-string v4, ""

    .line 575
    .line 576
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 577
    .line 578
    .line 579
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 584
    .line 585
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 586
    .line 587
    .line 588
    move-result-wide v6

    .line 589
    const/4 v2, 0x0

    .line 590
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 598
    .line 599
    .line 600
    move-result v11

    .line 601
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 604
    .line 605
    .line 606
    const v4, 0x41afd70a    # 21.98f

    .line 607
    .line 608
    .line 609
    const v6, 0x40c75c29    # 6.23f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v4, -0x40ab851f    # -0.83f

    .line 616
    .line 617
    .line 618
    const v6, 0x3f6e147b    # 0.93f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v4, -0x4059999a    # -1.3f

    .line 625
    .line 626
    .line 627
    const/high16 v6, -0x40c00000    # -0.75f

    .line 628
    .line 629
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v4, -0x4067ae14    # -1.19f

    .line 633
    .line 634
    .line 635
    const v6, 0x3ec7ae14    # 0.39f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v25, -0x410f5c29    # -0.47f

    .line 642
    .line 643
    .line 644
    const v26, -0x4175c28f    # -0.27f

    .line 645
    .line 646
    .line 647
    const v21, -0x41f0a3d7    # -0.14f

    .line 648
    .line 649
    .line 650
    const v22, -0x421eb852    # -0.11f

    .line 651
    .line 652
    .line 653
    const v23, -0x41666666    # -0.3f

    .line 654
    .line 655
    .line 656
    const v24, -0x41b33333    # -0.2f

    .line 657
    .line 658
    .line 659
    move-object/from16 v20, v2

    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v4, 0x41a20000    # 20.25f

    .line 665
    .line 666
    const/high16 v6, 0x40400000    # 3.0f

    .line 667
    .line 668
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v4, -0x40400000    # -1.5f

    .line 672
    .line 673
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v4, 0x41940000    # 18.5f

    .line 677
    .line 678
    const v6, 0x40870a3d    # 4.22f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v25, -0x410a3d71    # -0.48f

    .line 685
    .line 686
    .line 687
    const v26, 0x3e8a3d71    # 0.27f

    .line 688
    .line 689
    .line 690
    const v21, -0x41d1eb85    # -0.17f

    .line 691
    .line 692
    .line 693
    const v22, 0x3d8f5c29    # 0.07f

    .line 694
    .line 695
    .line 696
    const v23, -0x41570a3d    # -0.33f

    .line 697
    .line 698
    .line 699
    const v24, 0x3e23d70a    # 0.16f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v4, 0x4186b852    # 16.84f

    .line 706
    .line 707
    .line 708
    const v6, 0x40833333    # 4.1f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v4, 0x3fa66666    # 1.3f

    .line 715
    .line 716
    .line 717
    const/high16 v6, -0x40c00000    # -0.75f

    .line 718
    .line 719
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v4, 0x3f547ae1    # 0.83f

    .line 723
    .line 724
    .line 725
    const v6, 0x3f6e147b    # 0.93f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v25, 0x418828f6    # 17.02f

    .line 732
    .line 733
    .line 734
    const/high16 v26, 0x40d80000    # 6.75f

    .line 735
    .line 736
    const/high16 v21, 0x41880000    # 17.0f

    .line 737
    .line 738
    const v22, 0x40cccccd    # 6.4f

    .line 739
    .line 740
    .line 741
    const/high16 v23, 0x41880000    # 17.0f

    .line 742
    .line 743
    const v24, 0x40d28f5c    # 6.58f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v4, 0x4180b852    # 16.09f

    .line 750
    .line 751
    .line 752
    const v6, 0x40f33333    # 7.6f

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v4, 0x3f400000    # 0.75f

    .line 759
    .line 760
    const v6, 0x3fa66666    # 1.3f

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v4, 0x3f99999a    # 1.2f

    .line 767
    .line 768
    .line 769
    const v6, -0x413d70a4    # -0.38f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v25, 0x3edc28f6    # 0.43f

    .line 776
    .line 777
    .line 778
    const/high16 v26, 0x3e800000    # 0.25f

    .line 779
    .line 780
    const v21, 0x3e051eb8    # 0.13f

    .line 781
    .line 782
    .line 783
    const v22, 0x3dcccccd    # 0.1f

    .line 784
    .line 785
    .line 786
    const v23, 0x3e8f5c29    # 0.28f

    .line 787
    .line 788
    .line 789
    const v24, 0x3e3851ec    # 0.18f

    .line 790
    .line 791
    .line 792
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v4, 0x41960000    # 18.75f

    .line 796
    .line 797
    const/high16 v6, 0x41200000    # 10.0f

    .line 798
    .line 799
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 803
    .line 804
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v4, -0x4063d70a    # -1.22f

    .line 808
    .line 809
    .line 810
    const v6, 0x3e8a3d71    # 0.27f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v25, 0x3ee147ae    # 0.44f

    .line 817
    .line 818
    .line 819
    const/high16 v26, -0x41800000    # -0.25f

    .line 820
    .line 821
    const v21, 0x3e23d70a    # 0.16f

    .line 822
    .line 823
    .line 824
    const v22, -0x4270a3d7    # -0.07f

    .line 825
    .line 826
    .line 827
    const v23, 0x3e99999a    # 0.3f

    .line 828
    .line 829
    .line 830
    const v24, -0x41e66666    # -0.15f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v4, 0x3f9851ec    # 1.19f

    .line 837
    .line 838
    .line 839
    const v6, 0x3ec28f5c    # 0.38f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v4, 0x3f400000    # 0.75f

    .line 846
    .line 847
    const v6, -0x4059999a    # -1.3f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v4, -0x40a66666    # -0.85f

    .line 854
    .line 855
    .line 856
    const v6, -0x4091eb85    # -0.93f

    .line 857
    .line 858
    .line 859
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const v25, 0x41afd70a    # 21.98f

    .line 863
    .line 864
    .line 865
    const v26, 0x40c75c29    # 6.23f

    .line 866
    .line 867
    .line 868
    const/high16 v21, 0x41b00000    # 22.0f

    .line 869
    .line 870
    const v22, 0x40d23d71    # 6.57f

    .line 871
    .line 872
    .line 873
    const v23, 0x41afeb85    # 21.99f

    .line 874
    .line 875
    .line 876
    const v24, 0x40cccccd    # 6.4f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v4, 0x419c0000    # 19.5f

    .line 886
    .line 887
    const/high16 v6, 0x40f80000    # 7.75f

    .line 888
    .line 889
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v25, -0x40600000    # -1.25f

    .line 893
    .line 894
    const/high16 v26, -0x40600000    # -1.25f

    .line 895
    .line 896
    const v21, -0x40cf5c29    # -0.69f

    .line 897
    .line 898
    .line 899
    const/16 v22, 0x0

    .line 900
    .line 901
    const/high16 v23, -0x40600000    # -1.25f

    .line 902
    .line 903
    const v24, -0x40f0a3d7    # -0.56f

    .line 904
    .line 905
    .line 906
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v4, -0x40600000    # -1.25f

    .line 910
    .line 911
    const/high16 v6, -0x40600000    # -1.25f

    .line 912
    .line 913
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 914
    .line 915
    const v8, 0x3f0f5c29    # 0.56f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v4, 0x3f0f5c29    # 0.56f

    .line 922
    .line 923
    .line 924
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 925
    .line 926
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v4, 0x41a1851f    # 20.19f

    .line 930
    .line 931
    .line 932
    const/high16 v6, 0x419c0000    # 19.5f

    .line 933
    .line 934
    const/high16 v7, 0x40f80000    # 7.75f

    .line 935
    .line 936
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    const/high16 v6, 0x3f800000    # 1.0f

    .line 947
    .line 948
    const/high16 v8, 0x3f800000    # 1.0f

    .line 949
    .line 950
    const/4 v7, 0x0

    .line 951
    const-string v4, ""

    .line 952
    .line 953
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 954
    .line 955
    .line 956
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 961
    .line 962
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 963
    .line 964
    .line 965
    move-result-wide v6

    .line 966
    const/4 v0, 0x0

    .line 967
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 968
    .line 969
    .line 970
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 971
    .line 972
    .line 973
    move-result v10

    .line 974
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 975
    .line 976
    .line 977
    move-result v11

    .line 978
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 981
    .line 982
    .line 983
    const v0, 0x419b3333    # 19.4f

    .line 984
    .line 985
    .line 986
    const v2, 0x412ca3d7    # 10.79f

    .line 987
    .line 988
    .line 989
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v0, 0x3e8f5c29    # 0.28f

    .line 993
    .line 994
    .line 995
    const v2, -0x40a66666    # -0.85f

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const v17, -0x41570a3d    # -0.33f

    .line 1002
    .line 1003
    .line 1004
    const v18, -0x41bd70a4    # -0.19f

    .line 1005
    .line 1006
    .line 1007
    const v13, -0x42333333    # -0.1f

    .line 1008
    .line 1009
    .line 1010
    const v14, -0x425c28f6    # -0.08f

    .line 1011
    .line 1012
    .line 1013
    const v15, -0x41a8f5c3    # -0.21f

    .line 1014
    .line 1015
    .line 1016
    const v16, -0x41f0a3d7    # -0.14f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x419051ec    # 18.04f

    .line 1023
    .line 1024
    .line 1025
    const/high16 v2, 0x41200000    # 10.0f

    .line 1026
    .line 1027
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v0, -0x40770a3d    # -1.07f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v0, -0x41c7ae14    # -0.18f

    .line 1037
    .line 1038
    .line 1039
    const v2, 0x3f5eb852    # 0.87f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v17, -0x4151eb85    # -0.34f

    .line 1046
    .line 1047
    .line 1048
    const v18, 0x3e428f5c    # 0.19f

    .line 1049
    .line 1050
    .line 1051
    const v13, -0x420a3d71    # -0.12f

    .line 1052
    .line 1053
    .line 1054
    const v14, 0x3d4ccccd    # 0.05f

    .line 1055
    .line 1056
    .line 1057
    const v15, -0x418a3d71    # -0.24f

    .line 1058
    .line 1059
    .line 1060
    const v16, 0x3df5c28f    # 0.12f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v0, -0x40a8f5c3    # -0.84f

    .line 1067
    .line 1068
    .line 1069
    const v2, -0x4170a3d7    # -0.28f

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    .line 1075
    const v0, -0x40f5c28f    # -0.54f

    .line 1076
    .line 1077
    .line 1078
    const v2, 0x3f6e147b    # 0.93f

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v0, 0x3f28f5c3    # 0.66f

    .line 1085
    .line 1086
    .line 1087
    const v2, 0x3f170a3d    # 0.59f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const/16 v17, 0x0

    .line 1094
    .line 1095
    const v18, 0x3ebd70a4    # 0.37f

    .line 1096
    .line 1097
    .line 1098
    const v13, -0x43dc28f6    # -0.01f

    .line 1099
    .line 1100
    .line 1101
    const v14, 0x3e051eb8    # 0.13f

    .line 1102
    .line 1103
    .line 1104
    const v15, -0x43dc28f6    # -0.01f

    .line 1105
    .line 1106
    .line 1107
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1108
    .line 1109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v0, -0x40d70a3d    # -0.66f

    .line 1113
    .line 1114
    .line 1115
    const v2, 0x3f1c28f6    # 0.61f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v0, 0x3f0a3d71    # 0.54f

    .line 1122
    .line 1123
    .line 1124
    const v2, 0x3f6e147b    # 0.93f

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const v0, 0x3f5c28f6    # 0.86f

    .line 1131
    .line 1132
    .line 1133
    const v2, -0x4175c28f    # -0.27f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v17, 0x3e9eb852    # 0.31f

    .line 1140
    .line 1141
    .line 1142
    const v18, 0x3e3851ec    # 0.18f

    .line 1143
    .line 1144
    .line 1145
    const v13, 0x3dcccccd    # 0.1f

    .line 1146
    .line 1147
    .line 1148
    const v14, 0x3d8f5c29    # 0.07f

    .line 1149
    .line 1150
    .line 1151
    const v15, 0x3e4ccccd    # 0.2f

    .line 1152
    .line 1153
    .line 1154
    const v16, 0x3e051eb8    # 0.13f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const v0, 0x4187ae14    # 16.96f

    .line 1161
    .line 1162
    .line 1163
    const/high16 v2, 0x41700000    # 15.0f

    .line 1164
    .line 1165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    const v0, 0x3f88f5c3    # 1.07f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const v0, 0x3e428f5c    # 0.19f

    .line 1175
    .line 1176
    .line 1177
    const v2, -0x40a147ae    # -0.87f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v17, 0x3ea3d70a    # 0.32f

    .line 1184
    .line 1185
    .line 1186
    const v18, -0x41c7ae14    # -0.18f

    .line 1187
    .line 1188
    .line 1189
    const v13, 0x3de147ae    # 0.11f

    .line 1190
    .line 1191
    .line 1192
    const v14, -0x42b33333    # -0.05f

    .line 1193
    .line 1194
    .line 1195
    const v15, 0x3e6147ae    # 0.22f

    .line 1196
    .line 1197
    .line 1198
    const v16, -0x421eb852    # -0.11f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v0, 0x3f59999a    # 0.85f

    .line 1205
    .line 1206
    .line 1207
    const v2, 0x3e8a3d71    # 0.27f

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1211
    .line 1212
    .line 1213
    const v0, 0x3f0a3d71    # 0.54f

    .line 1214
    .line 1215
    .line 1216
    const v2, -0x4091eb85    # -0.93f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v0, -0x40d70a3d    # -0.66f

    .line 1223
    .line 1224
    .line 1225
    const v2, -0x40e3d70a    # -0.61f

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    const/16 v17, 0x0

    .line 1232
    .line 1233
    const v18, -0x41428f5c    # -0.37f

    .line 1234
    .line 1235
    .line 1236
    const v13, 0x3c23d70a    # 0.01f

    .line 1237
    .line 1238
    .line 1239
    const v14, -0x41fae148    # -0.13f

    .line 1240
    .line 1241
    .line 1242
    const v15, 0x3c23d70a    # 0.01f

    .line 1243
    .line 1244
    .line 1245
    const/high16 v16, -0x41800000    # -0.25f

    .line 1246
    .line 1247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v0, 0x3f28f5c3    # 0.66f

    .line 1251
    .line 1252
    .line 1253
    const v2, -0x40e8f5c3    # -0.59f

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1257
    .line 1258
    .line 1259
    const v0, 0x419b3333    # 19.4f

    .line 1260
    .line 1261
    .line 1262
    const v2, 0x412ca3d7    # 10.79f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1272
    .line 1273
    const v2, 0x41563d71    # 13.39f

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const v17, -0x409c28f6    # -0.89f

    .line 1280
    .line 1281
    .line 1282
    const v18, -0x409c28f6    # -0.89f

    .line 1283
    .line 1284
    .line 1285
    const v13, -0x41051eb8    # -0.49f

    .line 1286
    .line 1287
    .line 1288
    const/4 v14, 0x0

    .line 1289
    const v15, -0x409c28f6    # -0.89f

    .line 1290
    .line 1291
    .line 1292
    const v16, -0x41333333    # -0.4f

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    const v17, 0x3f63d70a    # 0.89f

    .line 1299
    .line 1300
    .line 1301
    const/4 v13, 0x0

    .line 1302
    const v14, -0x41051eb8    # -0.49f

    .line 1303
    .line 1304
    .line 1305
    const v15, 0x3ecccccd    # 0.4f

    .line 1306
    .line 1307
    .line 1308
    const v16, -0x409c28f6    # -0.89f

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1312
    .line 1313
    .line 1314
    const v0, 0x3ecccccd    # 0.4f

    .line 1315
    .line 1316
    .line 1317
    const v2, 0x3f63d70a    # 0.89f

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1321
    .line 1322
    .line 1323
    const/high16 v17, 0x418c0000    # 17.5f

    .line 1324
    .line 1325
    const v18, 0x41563d71    # 13.39f

    .line 1326
    .line 1327
    .line 1328
    const v13, 0x41931eb8    # 18.39f

    .line 1329
    .line 1330
    .line 1331
    const v14, 0x414fd70a    # 12.99f

    .line 1332
    .line 1333
    .line 1334
    const v15, 0x418feb85    # 17.99f

    .line 1335
    .line 1336
    .line 1337
    const v16, 0x41563d71    # 13.39f

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    const/16 v16, 0x3800

    .line 1351
    .line 1352
    const/16 v17, 0x0

    .line 1353
    .line 1354
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1355
    .line 1356
    const/4 v7, 0x0

    .line 1357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1358
    .line 1359
    const/4 v13, 0x0

    .line 1360
    const/4 v14, 0x0

    .line 1361
    const/4 v15, 0x0

    .line 1362
    const-string v4, ""

    .line 1363
    .line 1364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    sput-object v0, Landroidx/compose/material/icons/rounded/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1373
    .line 1374
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    return-object v0
.end method
