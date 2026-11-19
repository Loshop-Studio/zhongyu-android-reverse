.class public final Landroidx/compose/material/icons/twotone/ElectricRickshawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricRickshaw(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ElectricRickshaw"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3e2e147b    # 0.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x40c00000    # 6.0f

    .line 84
    .line 85
    const/high16 v26, 0x41300000    # 11.0f

    .line 86
    .line 87
    const v21, 0x40651eb8    # 3.58f

    .line 88
    .line 89
    .line 90
    const v22, 0x413d70a4    # 11.84f

    .line 91
    .line 92
    .line 93
    const v23, 0x40966666    # 4.7f

    .line 94
    .line 95
    .line 96
    const/high16 v24, 0x41300000    # 11.0f

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v25, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const v26, 0x3e2e147b    # 0.17f

    .line 106
    .line 107
    .line 108
    const v21, 0x3eb33333    # 0.35f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, 0x3f30a3d7    # 0.69f

    .line 114
    .line 115
    .line 116
    const v24, 0x3d75c28f    # 0.06f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x41200000    # 10.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40400000    # 3.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41500000    # 13.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/16 v16, 0x3800

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const v6, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const v8, 0x3e99999a    # 0.3f

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x41980000    # 19.0f

    .line 195
    .line 196
    const/high16 v6, 0x41300000    # 11.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x40000000    # 2.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x3f95c28f    # 1.17f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3fea3d71    # 1.83f

    .line 218
    .line 219
    .line 220
    const v26, -0x4015c28f    # -1.83f

    .line 221
    .line 222
    .line 223
    const v21, 0x3e99999a    # 0.3f

    .line 224
    .line 225
    .line 226
    const v22, -0x40a66666    # -0.85f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f7ae148    # 0.98f

    .line 230
    .line 231
    .line 232
    const v24, -0x403c28f6    # -1.53f

    .line 233
    .line 234
    .line 235
    move-object/from16 v20, v2

    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41300000    # 11.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v6, 0x3e99999a    # 0.3f

    .line 253
    .line 254
    .line 255
    const/4 v7, 0x0

    .line 256
    const-string v4, ""

    .line 257
    .line 258
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 259
    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 266
    .line 267
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 268
    .line 269
    .line 270
    move-result-wide v6

    .line 271
    const/4 v2, 0x0

    .line 272
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x41a80000    # 21.0f

    .line 289
    .line 290
    const v6, 0x4132e148    # 11.18f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, 0x411b851f    # 9.72f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, -0x41147ae1    # -0.46f

    .line 303
    .line 304
    .line 305
    const v26, -0x405c28f6    # -1.28f

    .line 306
    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const v22, -0x410f5c29    # -0.47f

    .line 311
    .line 312
    .line 313
    const v23, -0x41dc28f6    # -0.16f

    .line 314
    .line 315
    .line 316
    const v24, -0x40947ae1    # -0.92f

    .line 317
    .line 318
    .line 319
    move-object/from16 v20, v2

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x4184cccd    # 16.6f

    .line 325
    .line 326
    .line 327
    const v6, 0x406e147b    # 3.72f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, 0x4170f5c3    # 15.06f

    .line 334
    .line 335
    .line 336
    const/high16 v26, 0x40400000    # 3.0f

    .line 337
    .line 338
    const v21, 0x4181c28f    # 16.22f

    .line 339
    .line 340
    .line 341
    const v22, 0x4050a3d7    # 3.26f

    .line 342
    .line 343
    .line 344
    const v23, 0x417a8f5c    # 15.66f

    .line 345
    .line 346
    .line 347
    const/high16 v24, 0x40400000    # 3.0f

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, 0x40400000    # 3.0f

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v26, 0x40a00000    # 5.0f

    .line 360
    .line 361
    const v21, 0x3ff33333    # 1.9f

    .line 362
    .line 363
    .line 364
    const/high16 v22, 0x40400000    # 3.0f

    .line 365
    .line 366
    const/high16 v23, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const v24, 0x4079999a    # 3.9f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x41000000    # 8.0f

    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v25, 0x40000000    # 2.0f

    .line 380
    .line 381
    const/high16 v26, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    const v22, 0x3f8ccccd    # 1.1f

    .line 386
    .line 387
    .line 388
    const v23, 0x3f666666    # 0.9f

    .line 389
    .line 390
    .line 391
    const/high16 v24, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x3e3851ec    # 0.18f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, 0x40c00000    # 6.0f

    .line 403
    .line 404
    const/high16 v26, 0x41880000    # 17.0f

    .line 405
    .line 406
    const v21, 0x40666666    # 3.6f

    .line 407
    .line 408
    .line 409
    const v22, 0x418147ae    # 16.16f

    .line 410
    .line 411
    .line 412
    const v23, 0x40966666    # 4.7f

    .line 413
    .line 414
    .line 415
    const/high16 v24, 0x41880000    # 17.0f

    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, -0x40a8f5c3    # -0.84f

    .line 421
    .line 422
    .line 423
    const v6, 0x40347ae1    # 2.82f

    .line 424
    .line 425
    .line 426
    const/high16 v7, -0x40000000    # -2.0f

    .line 427
    .line 428
    const v8, 0x4019999a    # 2.4f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x4105eb85    # 8.37f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v25, 0x40347ae1    # 2.82f

    .line 441
    .line 442
    .line 443
    const/high16 v26, 0x40000000    # 2.0f

    .line 444
    .line 445
    const v21, 0x3ed1eb85    # 0.41f

    .line 446
    .line 447
    .line 448
    const v22, 0x3f947ae1    # 1.16f

    .line 449
    .line 450
    .line 451
    const v23, 0x3fc147ae    # 1.51f

    .line 452
    .line 453
    .line 454
    const/high16 v24, 0x40000000    # 2.0f

    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v25, 0x40400000    # 3.0f

    .line 460
    .line 461
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 462
    .line 463
    const v21, 0x3fd47ae1    # 1.66f

    .line 464
    .line 465
    .line 466
    const/16 v22, 0x0

    .line 467
    .line 468
    const/high16 v23, 0x40400000    # 3.0f

    .line 469
    .line 470
    const v24, -0x40547ae1    # -1.34f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, 0x41a80000    # 21.0f

    .line 477
    .line 478
    const v26, 0x4132e148    # 11.18f

    .line 479
    .line 480
    .line 481
    const/high16 v21, 0x41b80000    # 23.0f

    .line 482
    .line 483
    const v22, 0x414b3333    # 12.7f

    .line 484
    .line 485
    .line 486
    const v23, 0x41b147ae    # 22.16f

    .line 487
    .line 488
    .line 489
    const v24, 0x4139999a    # 11.6f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x40c00000    # 6.0f

    .line 499
    .line 500
    const/high16 v6, 0x41700000    # 15.0f

    .line 501
    .line 502
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v25, -0x40800000    # -1.0f

    .line 506
    .line 507
    const/high16 v26, -0x40800000    # -1.0f

    .line 508
    .line 509
    const v21, -0x40f33333    # -0.55f

    .line 510
    .line 511
    .line 512
    const/16 v22, 0x0

    .line 513
    .line 514
    const/high16 v23, -0x40800000    # -1.0f

    .line 515
    .line 516
    const v24, -0x4119999a    # -0.45f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, -0x40800000    # -1.0f

    .line 523
    .line 524
    const v6, 0x3ee66666    # 0.45f

    .line 525
    .line 526
    .line 527
    const/high16 v7, 0x3f800000    # 1.0f

    .line 528
    .line 529
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v4, 0x3ee66666    # 0.45f

    .line 533
    .line 534
    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x40d1999a    # 6.55f

    .line 541
    .line 542
    .line 543
    const/high16 v6, 0x40c00000    # 6.0f

    .line 544
    .line 545
    const/high16 v7, 0x41700000    # 15.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v4, 0x4132b852    # 11.17f

    .line 554
    .line 555
    .line 556
    const/high16 v6, 0x40e00000    # 7.0f

    .line 557
    .line 558
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v25, 0x40c00000    # 6.0f

    .line 562
    .line 563
    const/high16 v26, 0x41300000    # 11.0f

    .line 564
    .line 565
    const v21, 0x40d6147b    # 6.69f

    .line 566
    .line 567
    .line 568
    const v22, 0x4130f5c3    # 11.06f

    .line 569
    .line 570
    .line 571
    const v23, 0x40cb3333    # 6.35f

    .line 572
    .line 573
    .line 574
    const/high16 v24, 0x41300000    # 11.0f

    .line 575
    .line 576
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v25, -0x3fcae148    # -2.83f

    .line 580
    .line 581
    .line 582
    const/high16 v26, 0x40000000    # 2.0f

    .line 583
    .line 584
    const v21, -0x4059999a    # -1.3f

    .line 585
    .line 586
    .line 587
    const/16 v22, 0x0

    .line 588
    .line 589
    const v23, -0x3fe51eb8    # -2.42f

    .line 590
    .line 591
    .line 592
    const v24, 0x3f570a3d    # 0.84f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v4, 0x40400000    # 3.0f

    .line 599
    .line 600
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 604
    .line 605
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v4, 0x40800000    # 4.0f

    .line 609
    .line 610
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v4, 0x4132b852    # 11.17f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v4, 0x40e00000    # 7.0f

    .line 623
    .line 624
    const/high16 v6, 0x41000000    # 8.0f

    .line 625
    .line 626
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v4, 0x40400000    # 3.0f

    .line 630
    .line 631
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v4, 0x40a00000    # 5.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v4, 0x40800000    # 4.0f

    .line 640
    .line 641
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v4, 0x41000000    # 8.0f

    .line 645
    .line 646
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v4, 0x41600000    # 14.0f

    .line 653
    .line 654
    const/high16 v6, 0x41500000    # 13.0f

    .line 655
    .line 656
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v4, 0x41100000    # 9.0f

    .line 660
    .line 661
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 665
    .line 666
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v4, 0x40400000    # 3.0f

    .line 670
    .line 671
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v4, 0x41000000    # 8.0f

    .line 675
    .line 676
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v4, 0x41100000    # 9.0f

    .line 680
    .line 681
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x40a00000    # 5.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v4, 0x41500000    # 13.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x40c3d70a    # 6.12f

    .line 701
    .line 702
    .line 703
    const/high16 v6, 0x41800000    # 16.0f

    .line 704
    .line 705
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v4, 0x41933333    # 18.4f

    .line 709
    .line 710
    .line 711
    const/high16 v6, 0x41100000    # 9.0f

    .line 712
    .line 713
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, 0x41800000    # 16.0f

    .line 717
    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v4, 0x40c3d70a    # 6.12f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v4, 0x41895c29    # 17.17f

    .line 731
    .line 732
    .line 733
    const/high16 v6, 0x41500000    # 13.0f

    .line 734
    .line 735
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v4, 0x41800000    # 16.0f

    .line 739
    .line 740
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v4, -0x40000000    # -2.0f

    .line 744
    .line 745
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v4, 0x40400000    # 3.0f

    .line 749
    .line 750
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v4, 0x3e2e147b    # 0.17f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v25, 0x41895c29    # 17.17f

    .line 760
    .line 761
    .line 762
    const/high16 v26, 0x41500000    # 13.0f

    .line 763
    .line 764
    const v21, 0x41913333    # 18.15f

    .line 765
    .line 766
    .line 767
    const v22, 0x4137851f    # 11.47f

    .line 768
    .line 769
    .line 770
    const v23, 0x418bc28f    # 17.47f

    .line 771
    .line 772
    .line 773
    const v24, 0x41426666    # 12.15f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const/high16 v4, 0x41a00000    # 20.0f

    .line 783
    .line 784
    const/high16 v6, 0x41700000    # 15.0f

    .line 785
    .line 786
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v25, -0x40800000    # -1.0f

    .line 790
    .line 791
    const/high16 v26, -0x40800000    # -1.0f

    .line 792
    .line 793
    const v21, -0x40f33333    # -0.55f

    .line 794
    .line 795
    .line 796
    const/16 v22, 0x0

    .line 797
    .line 798
    const/high16 v23, -0x40800000    # -1.0f

    .line 799
    .line 800
    const v24, -0x4119999a    # -0.45f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v4, -0x40800000    # -1.0f

    .line 807
    .line 808
    const v6, 0x3ee66666    # 0.45f

    .line 809
    .line 810
    .line 811
    const/high16 v7, 0x3f800000    # 1.0f

    .line 812
    .line 813
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v4, 0x3ee66666    # 0.45f

    .line 817
    .line 818
    .line 819
    const/high16 v6, 0x3f800000    # 1.0f

    .line 820
    .line 821
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v4, 0x41a46666    # 20.55f

    .line 825
    .line 826
    .line 827
    const/high16 v6, 0x41a00000    # 20.0f

    .line 828
    .line 829
    const/high16 v7, 0x41700000    # 15.0f

    .line 830
    .line 831
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    const/high16 v6, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/high16 v8, 0x3f800000    # 1.0f

    .line 844
    .line 845
    const/4 v7, 0x0

    .line 846
    const-string v4, ""

    .line 847
    .line 848
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 849
    .line 850
    .line 851
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 856
    .line 857
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 858
    .line 859
    .line 860
    move-result-wide v6

    .line 861
    const/4 v0, 0x0

    .line 862
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 866
    .line 867
    .line 868
    move-result v10

    .line 869
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 870
    .line 871
    .line 872
    move-result v11

    .line 873
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 876
    .line 877
    .line 878
    const/high16 v2, 0x41a00000    # 20.0f

    .line 879
    .line 880
    const/high16 v4, 0x40e00000    # 7.0f

    .line 881
    .line 882
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v2, 0x40800000    # 4.0f

    .line 886
    .line 887
    const/4 v4, 0x0

    .line 888
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const/high16 v2, -0x40000000    # -2.0f

    .line 892
    .line 893
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v2, 0x40c00000    # 6.0f

    .line 897
    .line 898
    const/high16 v4, 0x40400000    # 3.0f

    .line 899
    .line 900
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v2, -0x3f800000    # -4.0f

    .line 904
    .line 905
    const/4 v4, 0x0

    .line 906
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v2, 0x40000000    # 2.0f

    .line 910
    .line 911
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    const/high16 v6, 0x3f800000    # 1.0f

    .line 922
    .line 923
    const/4 v7, 0x0

    .line 924
    const-string v4, ""

    .line 925
    .line 926
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    sput-object v0, Landroidx/compose/material/icons/twotone/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 935
    .line 936
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    return-object v0
.end method
