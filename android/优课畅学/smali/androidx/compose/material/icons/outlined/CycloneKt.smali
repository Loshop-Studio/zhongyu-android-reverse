.class public final Landroidx/compose/material/icons/outlined/CycloneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCyclone(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Cyclone"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x3fe51eb8    # 1.79f

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
    const/high16 v25, 0x40800000    # 4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x400d70a4    # 2.21f

    .line 101
    .line 102
    .line 103
    const v23, 0x3fe51eb8    # 1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, -0x3f800000    # -4.0f

    .line 112
    .line 113
    const v21, 0x400d70a4    # 2.21f

    .line 114
    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    const/high16 v23, 0x40800000    # 4.0f

    .line 119
    .line 120
    const v24, -0x401ae148    # -1.79f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x41400000    # 12.0f

    .line 127
    .line 128
    const/high16 v26, 0x41000000    # 8.0f

    .line 129
    .line 130
    const/high16 v21, 0x41800000    # 16.0f

    .line 131
    .line 132
    const v22, 0x411ca3d7    # 9.79f

    .line 133
    .line 134
    .line 135
    const v23, 0x41635c29    # 14.21f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41600000    # 14.0f

    .line 147
    .line 148
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, -0x40000000    # -2.0f

    .line 152
    .line 153
    const/high16 v26, -0x40000000    # -2.0f

    .line 154
    .line 155
    const v21, -0x40733333    # -1.1f

    .line 156
    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    const/high16 v23, -0x40000000    # -2.0f

    .line 161
    .line 162
    const v24, -0x4099999a    # -0.9f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40000000    # 2.0f

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const v22, -0x40733333    # -1.1f

    .line 173
    .line 174
    .line 175
    const v23, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    const/high16 v24, -0x40000000    # -2.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x3f666666    # 0.9f

    .line 184
    .line 185
    .line 186
    const/high16 v6, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, 0x41400000    # 12.0f

    .line 192
    .line 193
    const/high16 v26, 0x41600000    # 14.0f

    .line 194
    .line 195
    const/high16 v21, 0x41600000    # 14.0f

    .line 196
    .line 197
    const v22, 0x4151999a    # 13.1f

    .line 198
    .line 199
    .line 200
    const v23, 0x4151999a    # 13.1f

    .line 201
    .line 202
    .line 203
    const/high16 v24, 0x41600000    # 14.0f

    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    const/16 v16, 0x3800

    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const/high16 v6, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v8, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const/high16 v9, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/high16 v12, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const-string v4, ""

    .line 232
    .line 233
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 243
    .line 244
    .line 245
    move-result-wide v6

    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x41b00000    # 22.0f

    .line 264
    .line 265
    const v2, 0x40ef0a3d    # 7.47f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40ab3333    # 5.35f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x41400000    # 12.0f

    .line 278
    .line 279
    const/high16 v18, 0x40800000    # 4.0f

    .line 280
    .line 281
    const v13, 0x41a06666    # 20.05f

    .line 282
    .line 283
    .line 284
    const v14, 0x4098a3d7    # 4.77f

    .line 285
    .line 286
    .line 287
    const v15, 0x41847ae1    # 16.56f

    .line 288
    .line 289
    .line 290
    const/high16 v16, 0x40800000    # 4.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x40ceb852    # 6.46f

    .line 296
    .line 297
    .line 298
    const v18, 0x40c7ae14    # 6.24f

    .line 299
    .line 300
    .line 301
    const v13, 0x411d999a    # 9.85f

    .line 302
    .line 303
    .line 304
    const/high16 v14, 0x40800000    # 4.0f

    .line 305
    .line 306
    const v15, 0x40fc7ae1    # 7.89f

    .line 307
    .line 308
    .line 309
    const v16, 0x409b851f    # 4.86f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x40ef0a3d    # 7.47f

    .line 316
    .line 317
    .line 318
    const/high16 v18, 0x40000000    # 2.0f

    .line 319
    .line 320
    const v13, 0x40d2e148    # 6.59f

    .line 321
    .line 322
    .line 323
    const v14, 0x40ac7ae1    # 5.39f

    .line 324
    .line 325
    .line 326
    const v15, 0x40db851f    # 6.86f

    .line 327
    .line 328
    .line 329
    const v16, 0x4075c28f    # 3.84f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x40800000    # 4.0f

    .line 339
    .line 340
    const/high16 v18, 0x41400000    # 12.0f

    .line 341
    .line 342
    const v13, 0x4098a3d7    # 4.77f

    .line 343
    .line 344
    .line 345
    const v14, 0x407ccccd    # 3.95f

    .line 346
    .line 347
    .line 348
    const/high16 v15, 0x40800000    # 4.0f

    .line 349
    .line 350
    const v16, 0x40ee147b    # 7.44f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x400f5c29    # 2.24f

    .line 357
    .line 358
    .line 359
    const v18, 0x40b147ae    # 5.54f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, 0x4009999a    # 2.15f

    .line 364
    .line 365
    .line 366
    const v15, 0x3f5c28f6    # 0.86f

    .line 367
    .line 368
    .line 369
    const v16, 0x4083851f    # 4.11f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x3f7851ec    # -4.24f

    .line 376
    .line 377
    .line 378
    const v18, -0x407eb852    # -1.01f

    .line 379
    .line 380
    .line 381
    const v13, -0x40a66666    # -0.85f

    .line 382
    .line 383
    .line 384
    const v14, -0x41f0a3d7    # -0.14f

    .line 385
    .line 386
    .line 387
    const v15, -0x3fe66666    # -2.4f

    .line 388
    .line 389
    .line 390
    const v16, -0x41333333    # -0.4f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x4007ae14    # 2.12f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x41400000    # 12.0f

    .line 403
    .line 404
    const/high16 v18, 0x41a00000    # 20.0f

    .line 405
    .line 406
    const v13, 0x407ccccd    # 3.95f

    .line 407
    .line 408
    .line 409
    const v14, 0x4199d70a    # 19.23f

    .line 410
    .line 411
    .line 412
    const v15, 0x40ee147b    # 7.44f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x41a00000    # 20.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x40b147ae    # 5.54f

    .line 421
    .line 422
    .line 423
    const v18, -0x3ff0a3d7    # -2.24f

    .line 424
    .line 425
    .line 426
    const v13, 0x4009999a    # 2.15f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const v15, 0x4083851f    # 4.11f

    .line 431
    .line 432
    .line 433
    const v16, -0x40a3d70a    # -0.86f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x407eb852    # -1.01f

    .line 440
    .line 441
    .line 442
    const v18, 0x4087ae14    # 4.24f

    .line 443
    .line 444
    .line 445
    const v13, -0x41f0a3d7    # -0.14f

    .line 446
    .line 447
    .line 448
    const v14, 0x3f59999a    # 0.85f

    .line 449
    .line 450
    .line 451
    const v15, -0x41333333    # -0.4f

    .line 452
    .line 453
    .line 454
    const v16, 0x4019999a    # 2.4f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v17, 0x41a00000    # 20.0f

    .line 464
    .line 465
    const/high16 v18, 0x41400000    # 12.0f

    .line 466
    .line 467
    const v13, 0x4199d70a    # 19.23f

    .line 468
    .line 469
    .line 470
    const v14, 0x41a06666    # 20.05f

    .line 471
    .line 472
    .line 473
    const/high16 v15, 0x41a00000    # 20.0f

    .line 474
    .line 475
    const v16, 0x41847ae1    # 16.56f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, -0x3ff0a3d7    # -2.24f

    .line 482
    .line 483
    .line 484
    const v18, -0x3f4eb852    # -5.54f

    .line 485
    .line 486
    .line 487
    const/4 v13, 0x0

    .line 488
    const v14, -0x3ff66666    # -2.15f

    .line 489
    .line 490
    .line 491
    const v15, -0x40a3d70a    # -0.86f

    .line 492
    .line 493
    .line 494
    const v16, -0x3f7c7ae1    # -4.11f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x41b00000    # 22.0f

    .line 501
    .line 502
    const v18, 0x40ef0a3d    # 7.47f

    .line 503
    .line 504
    .line 505
    const v13, 0x4194e148    # 18.61f

    .line 506
    .line 507
    .line 508
    const v14, 0x40d2e148    # 6.59f

    .line 509
    .line 510
    .line 511
    const v15, 0x41a147ae    # 20.16f

    .line 512
    .line 513
    .line 514
    const v16, 0x40db851f    # 6.86f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41900000    # 18.0f

    .line 524
    .line 525
    const/high16 v2, 0x41400000    # 12.0f

    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, -0x3f400000    # -6.0f

    .line 531
    .line 532
    const/high16 v18, -0x3f400000    # -6.0f

    .line 533
    .line 534
    const v13, -0x3fac28f6    # -3.31f

    .line 535
    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    const/high16 v15, -0x3f400000    # -6.0f

    .line 539
    .line 540
    const v16, -0x3fd3d70a    # -2.69f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, -0x3f400000    # -6.0f

    .line 547
    .line 548
    const v2, 0x402c28f6    # 2.69f

    .line 549
    .line 550
    .line 551
    const/high16 v4, 0x40c00000    # 6.0f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x402c28f6    # 2.69f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x40c00000    # 6.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x4174f5c3    # 15.31f

    .line 565
    .line 566
    .line 567
    const/high16 v2, 0x41900000    # 18.0f

    .line 568
    .line 569
    const/high16 v4, 0x41400000    # 12.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const/16 v16, 0x3800

    .line 582
    .line 583
    const/16 v17, 0x0

    .line 584
    .line 585
    const/high16 v6, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/high16 v12, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const/4 v15, 0x0

    .line 592
    const-string v4, ""

    .line 593
    .line 594
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    sput-object v0, Landroidx/compose/material/icons/outlined/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 603
    .line 604
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    return-object v0
.end method
