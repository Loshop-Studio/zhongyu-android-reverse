.class public final Landroidx/compose/material/icons/rounded/JoinRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _joinRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJoinRight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/JoinRightKt;->_joinRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.JoinRight"

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
    const v4, 0x41351eb8    # 11.32f

    .line 71
    .line 72
    .line 73
    const v6, 0x4189999a    # 17.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3faf5c29    # 1.37f

    .line 80
    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const v21, 0x3ec7ae14    # 0.39f

    .line 85
    .line 86
    .line 87
    const v22, 0x3eb33333    # 0.35f

    .line 88
    .line 89
    .line 90
    const v23, 0x3f7ae148    # 0.98f

    .line 91
    .line 92
    .line 93
    const v24, 0x3eb33333    # 0.35f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x41700000    # 15.0f

    .line 102
    .line 103
    const/high16 v26, 0x41400000    # 12.0f

    .line 104
    .line 105
    const v21, 0x416a6666    # 14.65f

    .line 106
    .line 107
    .line 108
    const v22, 0x41770a3d    # 15.44f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x41700000    # 15.0f

    .line 112
    .line 113
    const v24, 0x41528f5c    # 13.16f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x3feb851f    # -2.32f

    .line 120
    .line 121
    .line 122
    const v26, -0x3f59999a    # -5.2f

    .line 123
    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x406ccccd    # -1.15f

    .line 128
    .line 129
    .line 130
    const v23, -0x414ccccd    # -0.35f

    .line 131
    .line 132
    .line 133
    const v24, -0x3fa3d70a    # -3.44f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, -0x4050a3d7    # -1.37f

    .line 140
    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const v21, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    const v22, -0x414ccccd    # -0.35f

    .line 148
    .line 149
    .line 150
    const v23, -0x40851eb8    # -0.98f

    .line 151
    .line 152
    .line 153
    const v24, -0x414ccccd    # -0.35f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x41100000    # 9.0f

    .line 160
    .line 161
    const/high16 v26, 0x41400000    # 12.0f

    .line 162
    .line 163
    const v21, 0x4115999a    # 9.35f

    .line 164
    .line 165
    .line 166
    const v22, 0x4108f5c3    # 8.56f

    .line 167
    .line 168
    .line 169
    const/high16 v23, 0x41100000    # 9.0f

    .line 170
    .line 171
    const v24, 0x412d70a4    # 10.84f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x41351eb8    # 11.32f

    .line 178
    .line 179
    .line 180
    const v26, 0x4189999a    # 17.2f

    .line 181
    .line 182
    .line 183
    const/high16 v21, 0x41100000    # 9.0f

    .line 184
    .line 185
    const v22, 0x41526666    # 13.15f

    .line 186
    .line 187
    .line 188
    const v23, 0x4115999a    # 9.35f

    .line 189
    .line 190
    .line 191
    const v24, 0x41770a3d    # 15.44f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/16 v16, 0x3800

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/high16 v6, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v8, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/high16 v9, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v12, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v15, 0x0

    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x41840000    # 16.5f

    .line 253
    .line 254
    const/high16 v6, 0x41400000    # 12.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, -0x3fbe147b    # -3.03f

    .line 260
    .line 261
    .line 262
    const/high16 v26, 0x40d00000    # 6.5f

    .line 263
    .line 264
    const/16 v21, 0x0

    .line 265
    .line 266
    const v22, 0x3f7851ec    # 0.97f

    .line 267
    .line 268
    .line 269
    const v23, -0x41947ae1    # -0.23f

    .line 270
    .line 271
    .line 272
    const v24, 0x40851eb8    # 4.16f

    .line 273
    .line 274
    .line 275
    move-object/from16 v20, v2

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, 0x41800000    # 16.0f

    .line 281
    .line 282
    const/high16 v26, 0x41980000    # 19.0f

    .line 283
    .line 284
    const/high16 v21, 0x41640000    # 14.25f

    .line 285
    .line 286
    const v22, 0x41967ae1    # 18.81f

    .line 287
    .line 288
    .line 289
    const v23, 0x4171999a    # 15.1f

    .line 290
    .line 291
    .line 292
    const/high16 v24, 0x41980000    # 19.0f

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, 0x40e00000    # 7.0f

    .line 298
    .line 299
    const/high16 v26, -0x3f200000    # -7.0f

    .line 300
    .line 301
    const v21, 0x40770a3d    # 3.86f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/high16 v23, 0x40e00000    # 7.0f

    .line 307
    .line 308
    const v24, -0x3fb70a3d    # -3.14f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, -0x3fb70a3d    # -3.14f

    .line 315
    .line 316
    .line 317
    const/high16 v6, -0x3f200000    # -7.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v25, -0x3fde147b    # -2.53f

    .line 323
    .line 324
    .line 325
    const/high16 v26, 0x3f000000    # 0.5f

    .line 326
    .line 327
    const v21, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    const/high16 v23, -0x40200000    # -1.75f

    .line 331
    .line 332
    const v24, 0x3e428f5c    # 0.19f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x41840000    # 16.5f

    .line 339
    .line 340
    const/high16 v26, 0x41400000    # 12.0f

    .line 341
    .line 342
    const v21, 0x418228f6    # 16.27f

    .line 343
    .line 344
    .line 345
    const v22, 0x40fae148    # 7.84f

    .line 346
    .line 347
    .line 348
    const/high16 v23, 0x41840000    # 16.5f

    .line 349
    .line 350
    const v24, 0x41307ae1    # 11.03f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const-string v4, ""

    .line 367
    .line 368
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    const/4 v0, 0x0

    .line 382
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41000000    # 8.0f

    .line 399
    .line 400
    const/high16 v2, 0x41980000    # 19.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x4021eb85    # 2.53f

    .line 406
    .line 407
    .line 408
    const/high16 v18, -0x41000000    # -0.5f

    .line 409
    .line 410
    const v13, 0x3f666666    # 0.9f

    .line 411
    .line 412
    .line 413
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 414
    .line 415
    const v16, -0x41bd70a4    # -0.19f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, -0x404147ae    # -1.49f

    .line 422
    .line 423
    .line 424
    const v18, -0x402f5c29    # -1.63f

    .line 425
    .line 426
    .line 427
    const v13, -0x40e3d70a    # -0.61f

    .line 428
    .line 429
    .line 430
    const v14, -0x40fd70a4    # -0.51f

    .line 431
    .line 432
    .line 433
    const v15, -0x40733333    # -1.1f

    .line 434
    .line 435
    .line 436
    const v16, -0x40770a3d    # -1.07f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, 0x41000000    # 8.0f

    .line 443
    .line 444
    const/high16 v18, 0x41880000    # 17.0f

    .line 445
    .line 446
    const v13, 0x410b5c29    # 8.71f

    .line 447
    .line 448
    .line 449
    const v14, 0x4187999a    # 16.95f

    .line 450
    .line 451
    .line 452
    const v15, 0x4105c28f    # 8.36f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x41880000    # 17.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x3f600000    # -5.0f

    .line 461
    .line 462
    const/high16 v18, -0x3f600000    # -5.0f

    .line 463
    .line 464
    const v13, -0x3fcf5c29    # -2.76f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, -0x3f600000    # -5.0f

    .line 469
    .line 470
    const v16, -0x3ff0a3d7    # -2.24f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x400f5c29    # 2.24f

    .line 477
    .line 478
    .line 479
    const/high16 v2, 0x40a00000    # 5.0f

    .line 480
    .line 481
    const/high16 v4, -0x3f600000    # -5.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x3f851eb8    # 1.04f

    .line 487
    .line 488
    .line 489
    const v18, 0x3e051eb8    # 0.13f

    .line 490
    .line 491
    .line 492
    const v13, 0x3eb851ec    # 0.36f

    .line 493
    .line 494
    .line 495
    const v15, 0x3f35c28f    # 0.71f

    .line 496
    .line 497
    .line 498
    const v16, 0x3d4ccccd    # 0.05f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x3fbeb852    # 1.49f

    .line 505
    .line 506
    .line 507
    const v18, -0x402f5c29    # -1.63f

    .line 508
    .line 509
    .line 510
    const v13, 0x3ec7ae14    # 0.39f

    .line 511
    .line 512
    .line 513
    const v14, -0x40f0a3d7    # -0.56f

    .line 514
    .line 515
    .line 516
    const v15, 0x3f6147ae    # 0.88f

    .line 517
    .line 518
    .line 519
    const v16, -0x4070a3d7    # -1.12f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x41000000    # 8.0f

    .line 526
    .line 527
    const/high16 v18, 0x40a00000    # 5.0f

    .line 528
    .line 529
    const/high16 v13, 0x411c0000    # 9.75f

    .line 530
    .line 531
    const v14, 0x40a6147b    # 5.19f

    .line 532
    .line 533
    .line 534
    const v15, 0x410e6666    # 8.9f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x40a00000    # 5.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x3f200000    # -7.0f

    .line 543
    .line 544
    const/high16 v18, 0x40e00000    # 7.0f

    .line 545
    .line 546
    const v13, -0x3f88f5c3    # -3.86f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/high16 v15, -0x3f200000    # -7.0f

    .line 551
    .line 552
    const v16, 0x4048f5c3    # 3.14f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x40847ae1    # 4.14f

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x41000000    # 8.0f

    .line 562
    .line 563
    const/high16 v4, 0x41980000    # 19.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const/16 v16, 0x3800

    .line 576
    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/high16 v6, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    const/high16 v12, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    const/4 v15, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    sput-object v0, Landroidx/compose/material/icons/rounded/JoinRightKt;->_joinRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 597
    .line 598
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    return-object v0
.end method
