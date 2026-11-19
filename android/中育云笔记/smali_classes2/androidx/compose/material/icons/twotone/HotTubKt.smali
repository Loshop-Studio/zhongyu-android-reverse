.class public final Landroidx/compose/material/icons/twotone/HotTubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHotTub(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HotTubKt;->_hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HotTub"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40000000    # -2.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

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
    const/high16 v26, -0x3f800000    # -4.0f

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
    const/4 v0, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v0, 0x418b5c29    # 17.42f

    .line 160
    .line 161
    .line 162
    const v2, 0x40e6b852    # 7.21f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3f2b851f    # 0.67f

    .line 169
    .line 170
    .line 171
    const v18, 0x400ccccd    # 2.2f

    .line 172
    .line 173
    .line 174
    const v13, 0x3f11eb85    # 0.57f

    .line 175
    .line 176
    .line 177
    const v14, 0x3f1eb852    # 0.62f

    .line 178
    .line 179
    .line 180
    const v15, 0x3f51eb85    # 0.82f

    .line 181
    .line 182
    .line 183
    const v16, 0x3fb47ae1    # 1.41f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x3f170a3d    # 0.59f

    .line 190
    .line 191
    .line 192
    const v2, -0x421eb852    # -0.11f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x3ff47ae1    # 1.91f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, -0x4123d70a    # -0.43f

    .line 205
    .line 206
    .line 207
    const v2, 0x3d75c28f    # 0.06f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x4059999a    # -1.3f

    .line 214
    .line 215
    .line 216
    const v18, -0x3f928f5c    # -3.71f

    .line 217
    .line 218
    .line 219
    const v13, 0x3e570a3d    # 0.21f

    .line 220
    .line 221
    .line 222
    const v14, -0x4051eb85    # -1.36f

    .line 223
    .line 224
    .line 225
    const v15, -0x4175c28f    # -0.27f

    .line 226
    .line 227
    .line 228
    const v16, -0x3fd28f5c    # -2.71f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, -0x4270a3d7    # -0.07f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x40d47ae1    # -0.67f

    .line 241
    .line 242
    .line 243
    const v18, -0x3ff33333    # -2.2f

    .line 244
    .line 245
    .line 246
    const v13, -0x40ee147b    # -0.57f

    .line 247
    .line 248
    .line 249
    const v14, -0x40e147ae    # -0.62f

    .line 250
    .line 251
    .line 252
    const v15, -0x40ae147b    # -0.82f

    .line 253
    .line 254
    .line 255
    const v16, -0x404b851f    # -1.41f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41900000    # 18.0f

    .line 262
    .line 263
    const/high16 v2, 0x40400000    # 3.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x400e147b    # -1.89f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x3edc28f6    # 0.43f

    .line 275
    .line 276
    .line 277
    const v2, -0x428a3d71    # -0.06f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3fa66666    # 1.3f

    .line 284
    .line 285
    .line 286
    const v18, 0x406e147b    # 3.72f

    .line 287
    .line 288
    .line 289
    const v13, -0x41b33333    # -0.2f

    .line 290
    .line 291
    .line 292
    const v14, 0x3fae147b    # 1.36f

    .line 293
    .line 294
    .line 295
    const v15, 0x3e8a3d71    # 0.27f

    .line 296
    .line 297
    .line 298
    const v16, 0x402d70a4    # 2.71f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x3d8f5c29    # 0.07f

    .line 305
    .line 306
    .line 307
    const v2, 0x3d75c28f    # 0.06f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x41326666    # 11.15f

    .line 317
    .line 318
    .line 319
    const/high16 v2, 0x41400000    # 12.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x40ae147b    # -0.82f

    .line 325
    .line 326
    .line 327
    const v18, -0x40c7ae14    # -0.72f

    .line 328
    .line 329
    .line 330
    const v13, -0x416147ae    # -0.31f

    .line 331
    .line 332
    .line 333
    const v14, -0x419eb852    # -0.22f

    .line 334
    .line 335
    .line 336
    const v15, -0x40e8f5c3    # -0.59f

    .line 337
    .line 338
    .line 339
    const v16, -0x41147ae1    # -0.46f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x404ccccd    # -1.4f

    .line 346
    .line 347
    .line 348
    const v2, -0x4039999a    # -1.55f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x40cf5c29    # -0.69f

    .line 355
    .line 356
    .line 357
    const/high16 v18, -0x41000000    # -0.5f

    .line 358
    .line 359
    const v13, -0x41bd70a4    # -0.19f

    .line 360
    .line 361
    .line 362
    const v14, -0x41a8f5c3    # -0.21f

    .line 363
    .line 364
    .line 365
    const v15, -0x4123d70a    # -0.43f

    .line 366
    .line 367
    .line 368
    const v16, -0x413d70a4    # -0.38f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x408a3d71    # -0.96f

    .line 375
    .line 376
    .line 377
    const v18, -0x41947ae1    # -0.23f

    .line 378
    .line 379
    .line 380
    const v13, -0x416b851f    # -0.29f

    .line 381
    .line 382
    .line 383
    const v14, -0x41f0a3d7    # -0.14f

    .line 384
    .line 385
    .line 386
    const v15, -0x40e147ae    # -0.62f

    .line 387
    .line 388
    .line 389
    const v16, -0x41947ae1    # -0.23f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, -0x430a3d71    # -0.03f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x40a00000    # 5.0f

    .line 402
    .line 403
    const/high16 v18, 0x41340000    # 11.25f

    .line 404
    .line 405
    const v13, 0x40c051ec    # 6.01f

    .line 406
    .line 407
    .line 408
    const/high16 v14, 0x41100000    # 9.0f

    .line 409
    .line 410
    const/high16 v15, 0x40a00000    # 5.0f

    .line 411
    .line 412
    const v16, 0x412028f6    # 10.01f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40a00000    # 5.0f

    .line 419
    .line 420
    const/high16 v2, 0x41400000    # 12.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41400000    # 12.0f

    .line 426
    .line 427
    const/high16 v2, 0x40000000    # 2.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41000000    # 8.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x40000000    # 2.0f

    .line 438
    .line 439
    const/high16 v18, 0x40000000    # 2.0f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, 0x3f8ccccd    # 1.1f

    .line 443
    .line 444
    .line 445
    const v15, 0x3f666666    # 0.9f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x40000000    # 2.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41800000    # 16.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v18, -0x40000000    # -2.0f

    .line 459
    .line 460
    const v13, 0x3f8ccccd    # 1.1f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const/high16 v15, 0x40000000    # 2.0f

    .line 465
    .line 466
    const v16, -0x4099999a    # -0.9f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, -0x3f000000    # -8.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x41326666    # 11.15f

    .line 478
    .line 479
    .line 480
    const/high16 v2, 0x41400000    # 12.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40e00000    # 7.0f

    .line 489
    .line 490
    const/high16 v2, 0x41a00000    # 20.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40a00000    # 5.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, -0x3f400000    # -6.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40c00000    # 6.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41300000    # 11.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41100000    # 9.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, -0x3f400000    # -6.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40000000    # 2.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x40c00000    # 6.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41700000    # 15.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, -0x40000000    # -2.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, -0x3f400000    # -6.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40c00000    # 6.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41980000    # 19.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, -0x40000000    # -2.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, -0x3f400000    # -6.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x40000000    # 2.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x40c00000    # 6.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x4156b852    # 13.42f

    .line 603
    .line 604
    .line 605
    const v2, 0x40e6b852    # 7.21f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3f2b851f    # 0.67f

    .line 612
    .line 613
    .line 614
    const v18, 0x400ccccd    # 2.2f

    .line 615
    .line 616
    .line 617
    const v13, 0x3f11eb85    # 0.57f

    .line 618
    .line 619
    .line 620
    const v14, 0x3f1eb852    # 0.62f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f51eb85    # 0.82f

    .line 624
    .line 625
    .line 626
    const v16, 0x3fb47ae1    # 1.41f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x3f170a3d    # 0.59f

    .line 633
    .line 634
    .line 635
    const v2, -0x421eb852    # -0.11f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x3ff47ae1    # 1.91f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, -0x4123d70a    # -0.43f

    .line 648
    .line 649
    .line 650
    const v2, 0x3d75c28f    # 0.06f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x4059999a    # -1.3f

    .line 657
    .line 658
    .line 659
    const v18, -0x3f928f5c    # -3.71f

    .line 660
    .line 661
    .line 662
    const v13, 0x3e570a3d    # 0.21f

    .line 663
    .line 664
    .line 665
    const v14, -0x4051eb85    # -1.36f

    .line 666
    .line 667
    .line 668
    const v15, -0x4175c28f    # -0.27f

    .line 669
    .line 670
    .line 671
    const v16, -0x3fd28f5c    # -2.71f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, -0x4270a3d7    # -0.07f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, -0x40d47ae1    # -0.67f

    .line 684
    .line 685
    .line 686
    const v18, -0x3ff33333    # -2.2f

    .line 687
    .line 688
    .line 689
    const v13, -0x40ee147b    # -0.57f

    .line 690
    .line 691
    .line 692
    const v14, -0x40e147ae    # -0.62f

    .line 693
    .line 694
    .line 695
    const v15, -0x40ae147b    # -0.82f

    .line 696
    .line 697
    .line 698
    const v16, -0x404b851f    # -1.41f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x41600000    # 14.0f

    .line 705
    .line 706
    const/high16 v2, 0x40400000    # 3.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, -0x400e147b    # -1.89f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3edc28f6    # 0.43f

    .line 718
    .line 719
    .line 720
    const v2, -0x428a3d71    # -0.06f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v17, 0x3fa66666    # 1.3f

    .line 727
    .line 728
    .line 729
    const v18, 0x406e147b    # 3.72f

    .line 730
    .line 731
    .line 732
    const v13, -0x41b33333    # -0.2f

    .line 733
    .line 734
    .line 735
    const v14, 0x3fae147b    # 1.36f

    .line 736
    .line 737
    .line 738
    const v15, 0x3e8a3d71    # 0.27f

    .line 739
    .line 740
    .line 741
    const v16, 0x402d70a4    # 2.71f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x3d8f5c29    # 0.07f

    .line 748
    .line 749
    .line 750
    const v2, 0x3d75c28f    # 0.06f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/16 v16, 0x3800

    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    const/high16 v6, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v7, 0x0

    .line 770
    const/high16 v12, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const/4 v14, 0x0

    .line 774
    const/4 v15, 0x0

    .line 775
    const-string v4, ""

    .line 776
    .line 777
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    sput-object v0, Landroidx/compose/material/icons/twotone/HotTubKt;->_hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 786
    .line 787
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    return-object v0
.end method
