.class public final Landroidx/compose/material/icons/twotone/NextPlanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nextPlan:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNextPlan(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NextPlanKt;->_nextPlan:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NextPlan"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

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
    const v4, 0x40651eb8    # 3.58f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9ae148    # -3.58f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x41835c29    # 16.42f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 128
    .line 129
    const/high16 v6, 0x41500000    # 13.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x4010a3d7    # 2.26f

    .line 135
    .line 136
    .line 137
    const v6, -0x3fef5c29    # -2.26f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41380000    # 11.5f

    .line 144
    .line 145
    const/high16 v26, 0x41200000    # 10.0f

    .line 146
    .line 147
    const v21, 0x4165999a    # 14.35f

    .line 148
    .line 149
    .line 150
    const v22, 0x412ae148    # 10.68f

    .line 151
    .line 152
    .line 153
    const v23, 0x415028f6    # 13.01f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x41200000    # 10.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v25, -0x3f647ae1    # -4.86f

    .line 162
    .line 163
    .line 164
    const v26, 0x407851ec    # 3.88f

    .line 165
    .line 166
    .line 167
    const v21, -0x3fe851ec    # -2.37f

    .line 168
    .line 169
    .line 170
    const/16 v22, 0x0

    .line 171
    .line 172
    const v23, -0x3f74cccd    # -4.35f

    .line 173
    .line 174
    .line 175
    const v24, 0x3fd47ae1    # 1.66f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, -0x408a3d71    # -0.96f

    .line 182
    .line 183
    .line 184
    const v6, -0x415c28f6    # -0.32f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x41380000    # 11.5f

    .line 191
    .line 192
    const/high16 v26, 0x41100000    # 9.0f

    .line 193
    .line 194
    const v21, 0x40ca3d71    # 6.32f

    .line 195
    .line 196
    .line 197
    const v22, 0x412f3333    # 10.95f

    .line 198
    .line 199
    .line 200
    const v23, 0x410ae148    # 8.68f

    .line 201
    .line 202
    .line 203
    const/high16 v24, 0x41100000    # 9.0f

    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x408f0a3d    # 4.47f

    .line 209
    .line 210
    .line 211
    const v26, 0x4001eb85    # 2.03f

    .line 212
    .line 213
    .line 214
    const v21, 0x3fe3d70a    # 1.78f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const v23, 0x4057ae14    # 3.37f

    .line 220
    .line 221
    .line 222
    const v24, 0x3f4a3d71    # 0.79f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41900000    # 18.0f

    .line 229
    .line 230
    const/high16 v6, 0x41100000    # 9.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x40a00000    # 5.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41500000    # 13.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const/16 v16, 0x3800

    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const v6, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    const v8, 0x3e99999a    # 0.3f

    .line 260
    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const/high16 v9, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/high16 v12, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/4 v13, 0x0

    .line 268
    const/4 v14, 0x0

    .line 269
    const/4 v15, 0x0

    .line 270
    const-string v4, ""

    .line 271
    .line 272
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 273
    .line 274
    .line 275
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 280
    .line 281
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 282
    .line 283
    .line 284
    move-result-wide v6

    .line 285
    const/4 v2, 0x0

    .line 286
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x40000000    # 2.0f

    .line 303
    .line 304
    const/high16 v6, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x40000000    # 2.0f

    .line 310
    .line 311
    const/high16 v26, 0x41400000    # 12.0f

    .line 312
    .line 313
    const v21, 0x40cf5c29    # 6.48f

    .line 314
    .line 315
    .line 316
    const/high16 v22, 0x40000000    # 2.0f

    .line 317
    .line 318
    const/high16 v23, 0x40000000    # 2.0f

    .line 319
    .line 320
    const v24, 0x40cf5c29    # 6.48f

    .line 321
    .line 322
    .line 323
    move-object/from16 v20, v2

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v25, 0x41200000    # 10.0f

    .line 329
    .line 330
    const/high16 v26, 0x41200000    # 10.0f

    .line 331
    .line 332
    const/16 v21, 0x0

    .line 333
    .line 334
    const v22, 0x40b0a3d7    # 5.52f

    .line 335
    .line 336
    .line 337
    const v23, 0x408f5c29    # 4.48f

    .line 338
    .line 339
    .line 340
    const/high16 v24, 0x41200000    # 10.0f

    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, -0x3f70a3d7    # -4.48f

    .line 346
    .line 347
    .line 348
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 349
    .line 350
    const/high16 v7, 0x41200000    # 10.0f

    .line 351
    .line 352
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v25, 0x41400000    # 12.0f

    .line 356
    .line 357
    const/high16 v26, 0x40000000    # 2.0f

    .line 358
    .line 359
    const/high16 v21, 0x41b00000    # 22.0f

    .line 360
    .line 361
    const v22, 0x40cf5c29    # 6.48f

    .line 362
    .line 363
    .line 364
    const v23, 0x418c28f6    # 17.52f

    .line 365
    .line 366
    .line 367
    const/high16 v24, 0x40000000    # 2.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41a00000    # 20.0f

    .line 376
    .line 377
    const/high16 v6, 0x41400000    # 12.0f

    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, -0x3f000000    # -8.0f

    .line 383
    .line 384
    const/high16 v26, -0x3f000000    # -8.0f

    .line 385
    .line 386
    const v21, -0x3f728f5c    # -4.42f

    .line 387
    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/high16 v23, -0x3f000000    # -8.0f

    .line 392
    .line 393
    const v24, -0x3f9ae148    # -3.58f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, -0x3f000000    # -8.0f

    .line 400
    .line 401
    const v6, 0x40651eb8    # 3.58f

    .line 402
    .line 403
    .line 404
    const/high16 v7, 0x41000000    # 8.0f

    .line 405
    .line 406
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x40651eb8    # 3.58f

    .line 410
    .line 411
    .line 412
    const/high16 v6, 0x41000000    # 8.0f

    .line 413
    .line 414
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x41835c29    # 16.42f

    .line 418
    .line 419
    .line 420
    const/high16 v6, 0x41a00000    # 20.0f

    .line 421
    .line 422
    const/high16 v7, 0x41400000    # 12.0f

    .line 423
    .line 424
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const/high16 v6, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v8, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v7, 0x0

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
    const v0, 0x41307ae1    # 11.03f

    .line 472
    .line 473
    .line 474
    const v2, 0x417f851f    # 15.97f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41380000    # 11.5f

    .line 481
    .line 482
    const/high16 v18, 0x41100000    # 9.0f

    .line 483
    .line 484
    const v13, 0x416deb85    # 14.87f

    .line 485
    .line 486
    .line 487
    const v14, 0x411ca3d7    # 9.79f

    .line 488
    .line 489
    .line 490
    const v15, 0x41547ae1    # 13.28f

    .line 491
    .line 492
    .line 493
    const/high16 v16, 0x41100000    # 9.0f

    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x3f45c28f    # -5.82f

    .line 499
    .line 500
    .line 501
    const v18, 0x4091eb85    # 4.56f

    .line 502
    .line 503
    .line 504
    const v13, -0x3fcb851f    # -2.82f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const v15, -0x3f5a3d71    # -5.18f

    .line 509
    .line 510
    .line 511
    const v16, 0x3ff9999a    # 1.95f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3f75c28f    # 0.96f

    .line 518
    .line 519
    .line 520
    const v2, 0x3ea3d70a    # 0.32f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x41380000    # 11.5f

    .line 527
    .line 528
    const/high16 v18, 0x41200000    # 10.0f

    .line 529
    .line 530
    const v13, 0x40e4cccd    # 7.15f

    .line 531
    .line 532
    .line 533
    const v14, 0x413a8f5c    # 11.66f

    .line 534
    .line 535
    .line 536
    const v15, 0x4112147b    # 9.13f

    .line 537
    .line 538
    .line 539
    const/high16 v16, 0x41200000    # 10.0f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x4070a3d7    # 3.76f

    .line 545
    .line 546
    .line 547
    const v18, 0x3fdeb852    # 1.74f

    .line 548
    .line 549
    .line 550
    const v13, 0x3fc147ae    # 1.51f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const v15, 0x40366666    # 2.85f

    .line 555
    .line 556
    .line 557
    const v16, 0x3f2e147b    # 0.68f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41600000    # 14.0f

    .line 564
    .line 565
    const/high16 v2, 0x41500000    # 13.0f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x40a00000    # 5.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x41100000    # 9.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x41307ae1    # 11.03f

    .line 581
    .line 582
    .line 583
    const v2, 0x417f851f    # 15.97f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const/16 v16, 0x3800

    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    const/high16 v6, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v7, 0x0

    .line 603
    const/high16 v12, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sput-object v0, Landroidx/compose/material/icons/twotone/NextPlanKt;->_nextPlan:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-object v0
.end method

.method public static synthetic getNextPlan$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method
