.class public final Landroidx/compose/material/icons/twotone/LoyaltyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLoyalty(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LoyaltyKt;->_loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Loyalty"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x411028f6    # 9.01f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x41100000    # 9.0f

    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x41a00000    # 20.0f

    .line 96
    .line 97
    const/high16 v6, 0x41500000    # 13.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x41000000    # 8.0f

    .line 111
    .line 112
    const/high16 v6, 0x40d00000    # 6.5f

    .line 113
    .line 114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40a00000    # 5.0f

    .line 118
    .line 119
    const/high16 v26, 0x40d00000    # 6.5f

    .line 120
    .line 121
    const v21, 0x40b570a4    # 5.67f

    .line 122
    .line 123
    .line 124
    const/high16 v22, 0x41000000    # 8.0f

    .line 125
    .line 126
    const/high16 v23, 0x40a00000    # 5.0f

    .line 127
    .line 128
    const v24, 0x40ea8f5c    # 7.33f

    .line 129
    .line 130
    .line 131
    move-object/from16 v20, v2

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x40a00000    # 5.0f

    .line 137
    .line 138
    const v6, 0x40b570a4    # 5.67f

    .line 139
    .line 140
    .line 141
    const/high16 v7, 0x40d00000    # 6.5f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v4, 0x40b570a4    # 5.67f

    .line 147
    .line 148
    .line 149
    const/high16 v6, 0x41000000    # 8.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x40ea8f5c    # 7.33f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x413b3333    # 11.7f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41500000    # 13.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, -0x40e66666    # -0.6f

    .line 172
    .line 173
    .line 174
    const v6, 0x3f19999a    # 0.6f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x3fb9999a    # 1.45f

    .line 181
    .line 182
    .line 183
    const v26, -0x40e66666    # -0.6f

    .line 184
    .line 185
    .line 186
    const v21, 0x3ebd70a4    # 0.37f

    .line 187
    .line 188
    .line 189
    const v22, -0x41428f5c    # -0.37f

    .line 190
    .line 191
    .line 192
    const v23, 0x3f63d70a    # 0.89f

    .line 193
    .line 194
    .line 195
    const v24, -0x40e66666    # -0.6f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x40033333    # 2.05f

    .line 202
    .line 203
    .line 204
    const v26, 0x40033333    # 2.05f

    .line 205
    .line 206
    .line 207
    const v21, 0x3f90a3d7    # 1.13f

    .line 208
    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const v23, 0x40033333    # 2.05f

    .line 213
    .line 214
    .line 215
    const v24, 0x3f6b851f    # 0.92f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x40e66666    # -0.6f

    .line 222
    .line 223
    .line 224
    const v26, 0x3fb9999a    # 1.45f

    .line 225
    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    const v22, 0x3f11eb85    # 0.57f

    .line 230
    .line 231
    .line 232
    const v23, -0x41947ae1    # -0.23f

    .line 233
    .line 234
    .line 235
    const v24, 0x3f8a3d71    # 1.08f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x418c0000    # 17.5f

    .line 242
    .line 243
    const/high16 v6, 0x41500000    # 13.0f

    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x41180000    # 9.5f

    .line 249
    .line 250
    const/high16 v6, 0x41600000    # 14.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v26, -0x40466666    # -1.45f

    .line 256
    .line 257
    .line 258
    const v21, -0x41428f5c    # -0.37f

    .line 259
    .line 260
    .line 261
    const v22, -0x413d70a4    # -0.38f

    .line 262
    .line 263
    .line 264
    const v23, -0x40e66666    # -0.6f

    .line 265
    .line 266
    .line 267
    const v24, -0x409c28f6    # -0.89f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, 0x40033333    # 2.05f

    .line 274
    .line 275
    .line 276
    const v26, -0x3ffccccd    # -2.05f

    .line 277
    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, -0x406f5c29    # -1.13f

    .line 282
    .line 283
    .line 284
    const v23, 0x3f6b851f    # 0.92f

    .line 285
    .line 286
    .line 287
    const v24, -0x3ffccccd    # -2.05f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v25, 0x3fb9999a    # 1.45f

    .line 294
    .line 295
    .line 296
    const v26, 0x3f1c28f6    # 0.61f

    .line 297
    .line 298
    .line 299
    const v21, 0x3f11eb85    # 0.57f

    .line 300
    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    const v23, 0x3f8a3d71    # 1.08f

    .line 305
    .line 306
    .line 307
    const v24, 0x3e6b851f    # 0.23f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x3f170a3d    # 0.59f

    .line 314
    .line 315
    .line 316
    const v6, 0x3f19999a    # 0.6f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/16 v16, 0x3800

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    const v6, 0x3e99999a    # 0.3f

    .line 334
    .line 335
    .line 336
    const v8, 0x3e99999a    # 0.3f

    .line 337
    .line 338
    .line 339
    const/4 v7, 0x0

    .line 340
    const/high16 v9, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v12, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const/4 v14, 0x0

    .line 346
    const/4 v15, 0x0

    .line 347
    const-string v4, ""

    .line 348
    .line 349
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 350
    .line 351
    .line 352
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 357
    .line 358
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 359
    .line 360
    .line 361
    move-result-wide v6

    .line 362
    const/4 v2, 0x0

    .line 363
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    const v4, 0x41ab47ae    # 21.41f

    .line 380
    .line 381
    .line 382
    const v6, 0x413947ae    # 11.58f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v25, 0x41300000    # 11.0f

    .line 394
    .line 395
    const/high16 v26, 0x40000000    # 2.0f

    .line 396
    .line 397
    const v21, 0x4140cccd    # 12.05f

    .line 398
    .line 399
    .line 400
    const v22, 0x400e147b    # 2.22f

    .line 401
    .line 402
    .line 403
    const v23, 0x4138cccd    # 11.55f

    .line 404
    .line 405
    .line 406
    const/high16 v24, 0x40000000    # 2.0f

    .line 407
    .line 408
    move-object/from16 v20, v2

    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x40800000    # 4.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, -0x40000000    # -2.0f

    .line 419
    .line 420
    const v21, -0x40733333    # -1.1f

    .line 421
    .line 422
    .line 423
    const/16 v22, 0x0

    .line 424
    .line 425
    const/high16 v23, -0x40000000    # -2.0f

    .line 426
    .line 427
    const v24, 0x3f666666    # 0.9f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x40e00000    # 7.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v25, 0x3f170a3d    # 0.59f

    .line 439
    .line 440
    .line 441
    const v26, 0x3fb5c28f    # 1.42f

    .line 442
    .line 443
    .line 444
    const/16 v21, 0x0

    .line 445
    .line 446
    const v22, 0x3f0ccccd    # 0.55f

    .line 447
    .line 448
    .line 449
    const v23, 0x3e6147ae    # 0.22f

    .line 450
    .line 451
    .line 452
    const v24, 0x3f866666    # 1.05f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v4, 0x41100000    # 9.0f

    .line 459
    .line 460
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x3fb47ae1    # 1.41f

    .line 464
    .line 465
    .line 466
    const v26, 0x3f147ae1    # 0.58f

    .line 467
    .line 468
    .line 469
    const v21, 0x3eb851ec    # 0.36f

    .line 470
    .line 471
    .line 472
    const v22, 0x3eb851ec    # 0.36f

    .line 473
    .line 474
    .line 475
    const v23, 0x3f5c28f6    # 0.86f

    .line 476
    .line 477
    .line 478
    const v24, 0x3f147ae1    # 0.58f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v4, -0x419eb852    # -0.22f

    .line 485
    .line 486
    .line 487
    const v6, 0x3fb47ae1    # 1.41f

    .line 488
    .line 489
    .line 490
    const v7, -0x40e8f5c3    # -0.59f

    .line 491
    .line 492
    .line 493
    const v8, 0x3f866666    # 1.05f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, -0x3f200000    # -7.0f

    .line 500
    .line 501
    const/high16 v6, 0x40e00000    # 7.0f

    .line 502
    .line 503
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v25, 0x3f170a3d    # 0.59f

    .line 507
    .line 508
    .line 509
    const v26, -0x404b851f    # -1.41f

    .line 510
    .line 511
    .line 512
    const v21, 0x3ebd70a4    # 0.37f

    .line 513
    .line 514
    .line 515
    const v22, -0x4147ae14    # -0.36f

    .line 516
    .line 517
    .line 518
    const v23, 0x3f170a3d    # 0.59f

    .line 519
    .line 520
    .line 521
    const v24, -0x40a3d70a    # -0.86f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v4, -0x407851ec    # -1.06f

    .line 528
    .line 529
    .line 530
    const v6, -0x404a3d71    # -1.42f

    .line 531
    .line 532
    .line 533
    const v8, -0x41947ae1    # -0.23f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v4, 0x41a0147b    # 20.01f

    .line 543
    .line 544
    .line 545
    const/high16 v6, 0x41500000    # 13.0f

    .line 546
    .line 547
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x41300000    # 11.0f

    .line 551
    .line 552
    const/high16 v6, 0x40800000    # 4.0f

    .line 553
    .line 554
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v4, 0x40800000    # 4.0f

    .line 558
    .line 559
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x40e00000    # 7.0f

    .line 563
    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v4, -0x43dc28f6    # -0.01f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x41100000    # 9.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v4, 0x40e0a3d7    # 7.02f

    .line 579
    .line 580
    .line 581
    const/high16 v6, -0x3f200000    # -7.0f

    .line 582
    .line 583
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    const/high16 v6, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v8, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const-string v4, ""

    .line 599
    .line 600
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 601
    .line 602
    .line 603
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 608
    .line 609
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 610
    .line 611
    .line 612
    move-result-wide v6

    .line 613
    const/4 v2, 0x0

    .line 614
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 618
    .line 619
    .line 620
    move-result v10

    .line 621
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 622
    .line 623
    .line 624
    move-result v11

    .line 625
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 628
    .line 629
    .line 630
    const/high16 v4, 0x40d00000    # 6.5f

    .line 631
    .line 632
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v4, -0x40400000    # -1.5f

    .line 636
    .line 637
    const/4 v6, 0x0

    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v26, 0x40400000    # 3.0f

    .line 642
    .line 643
    const/16 v27, 0x0

    .line 644
    .line 645
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 646
    .line 647
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 648
    .line 649
    const/16 v23, 0x0

    .line 650
    .line 651
    const/16 v24, 0x1

    .line 652
    .line 653
    const/16 v25, 0x1

    .line 654
    .line 655
    move-object/from16 v20, v2

    .line 656
    .line 657
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 661
    .line 662
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/high16 v6, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 682
    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 684
    .line 685
    .line 686
    move-result-wide v6

    .line 687
    const/4 v0, 0x0

    .line 688
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 702
    .line 703
    .line 704
    const v0, 0x410e6666    # 8.9f

    .line 705
    .line 706
    .line 707
    const v2, 0x4148cccd    # 12.55f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v17, 0x3f19999a    # 0.6f

    .line 714
    .line 715
    .line 716
    const v18, 0x3fb9999a    # 1.45f

    .line 717
    .line 718
    .line 719
    const v14, 0x3f11eb85    # 0.57f

    .line 720
    .line 721
    .line 722
    const v15, 0x3e6b851f    # 0.23f

    .line 723
    .line 724
    .line 725
    const v16, 0x3f88f5c3    # 1.07f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x40600000    # 3.5f

    .line 732
    .line 733
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 737
    .line 738
    const/high16 v2, 0x40600000    # 3.5f

    .line 739
    .line 740
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v18, -0x40466666    # -1.45f

    .line 744
    .line 745
    .line 746
    const v13, 0x3ebd70a4    # 0.37f

    .line 747
    .line 748
    .line 749
    const v14, -0x41428f5c    # -0.37f

    .line 750
    .line 751
    .line 752
    const v15, 0x3f19999a    # 0.6f

    .line 753
    .line 754
    .line 755
    const v16, -0x409c28f6    # -0.89f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x3ffccccd    # -2.05f

    .line 762
    .line 763
    .line 764
    const v18, -0x3ffccccd    # -2.05f

    .line 765
    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    const v14, -0x406f5c29    # -1.13f

    .line 769
    .line 770
    .line 771
    const v15, -0x40947ae1    # -0.92f

    .line 772
    .line 773
    .line 774
    const v16, -0x3ffccccd    # -2.05f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, -0x40466666    # -1.45f

    .line 781
    .line 782
    .line 783
    const v18, 0x3f19999a    # 0.6f

    .line 784
    .line 785
    .line 786
    const v13, -0x40ee147b    # -0.57f

    .line 787
    .line 788
    .line 789
    const/4 v14, 0x0

    .line 790
    const v15, -0x4075c28f    # -1.08f

    .line 791
    .line 792
    .line 793
    const v16, 0x3e6b851f    # 0.23f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v0, -0x40e66666    # -0.6f

    .line 800
    .line 801
    .line 802
    const v2, 0x3f19999a    # 0.6f

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v0, -0x40e8f5c3    # -0.59f

    .line 809
    .line 810
    .line 811
    const v2, -0x40e66666    # -0.6f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v18, -0x40e3d70a    # -0.61f

    .line 818
    .line 819
    .line 820
    const v13, -0x41428f5c    # -0.37f

    .line 821
    .line 822
    .line 823
    const v14, -0x413d70a4    # -0.38f

    .line 824
    .line 825
    .line 826
    const v15, -0x409c28f6    # -0.89f

    .line 827
    .line 828
    .line 829
    const v16, -0x40e3d70a    # -0.61f

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v17, -0x3ffccccd    # -2.05f

    .line 836
    .line 837
    .line 838
    const v18, 0x40033333    # 2.05f

    .line 839
    .line 840
    .line 841
    const v13, -0x406f5c29    # -1.13f

    .line 842
    .line 843
    .line 844
    const/4 v14, 0x0

    .line 845
    const v15, -0x3ffccccd    # -2.05f

    .line 846
    .line 847
    .line 848
    const v16, 0x3f6b851f    # 0.92f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v15, 0x0

    .line 872
    const-string v4, ""

    .line 873
    .line 874
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    sput-object v0, Landroidx/compose/material/icons/twotone/LoyaltyKt;->_loyalty:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 883
    .line 884
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    return-object v0
.end method
