.class public final Landroidx/compose/material/icons/twotone/FlutterDashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlutterDash(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FlutterDashKt;->_flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FlutterDash"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3e800000    # 0.25f

    .line 78
    .line 79
    const v26, 0x400d70a4    # 2.21f

    .line 80
    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const v22, 0x3f4f5c29    # 0.81f

    .line 85
    .line 86
    .line 87
    const v23, 0x3dcccccd    # 0.1f

    .line 88
    .line 89
    .line 90
    const v24, 0x3fc3d70a    # 1.53f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x3f547ae1    # 0.83f

    .line 99
    .line 100
    .line 101
    const v26, -0x400a3d71    # -1.92f

    .line 102
    .line 103
    .line 104
    const v21, 0x3e3851ec    # 0.18f

    .line 105
    .line 106
    .line 107
    const v22, -0x40cf5c29    # -0.69f

    .line 108
    .line 109
    .line 110
    const v23, 0x3eeb851f    # 0.46f

    .line 111
    .line 112
    .line 113
    const v24, -0x4055c28f    # -1.33f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x4151eb85    # -0.34f

    .line 120
    .line 121
    .line 122
    const v26, -0x403ae148    # -1.54f

    .line 123
    .line 124
    .line 125
    const v21, -0x41a8f5c3    # -0.21f

    .line 126
    .line 127
    .line 128
    const v22, -0x410f5c29    # -0.47f

    .line 129
    .line 130
    .line 131
    const v23, -0x4151eb85    # -0.34f

    .line 132
    .line 133
    .line 134
    const v24, -0x40828f5c    # -0.99f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41180000    # 9.5f

    .line 141
    .line 142
    const/high16 v26, 0x40c00000    # 6.0f

    .line 143
    .line 144
    const/high16 v21, 0x40b80000    # 5.75f

    .line 145
    .line 146
    const v22, 0x40f5c28f    # 7.68f

    .line 147
    .line 148
    .line 149
    const v23, 0x40edc28f    # 7.43f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x40c00000    # 6.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v25, 0x40200000    # 2.5f

    .line 158
    .line 159
    const v26, 0x3f7851ec    # 0.97f

    .line 160
    .line 161
    .line 162
    const v21, 0x3f75c28f    # 0.96f

    .line 163
    .line 164
    .line 165
    const/16 v22, 0x0

    .line 166
    .line 167
    const v23, 0x3feb851f    # 1.84f

    .line 168
    .line 169
    .line 170
    const v24, 0x3ebd70a4    # 0.37f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x41680000    # 14.5f

    .line 177
    .line 178
    const/high16 v26, 0x40c00000    # 6.0f

    .line 179
    .line 180
    const v21, 0x414a8f5c    # 12.66f

    .line 181
    .line 182
    .line 183
    const v22, 0x40cbd70a    # 6.37f

    .line 184
    .line 185
    .line 186
    const v23, 0x4158a3d7    # 13.54f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x40c00000    # 6.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x40700000    # 3.75f

    .line 195
    .line 196
    const/high16 v26, 0x40700000    # 3.75f

    .line 197
    .line 198
    const v21, 0x40047ae1    # 2.07f

    .line 199
    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    const/high16 v23, 0x40700000    # 3.75f

    .line 204
    .line 205
    const v24, 0x3fd70a3d    # 1.68f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v25, -0x4151eb85    # -0.34f

    .line 212
    .line 213
    .line 214
    const v26, 0x3fc51eb8    # 1.54f

    .line 215
    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, 0x3f0ccccd    # 0.55f

    .line 220
    .line 221
    .line 222
    const v23, -0x420a3d71    # -0.12f

    .line 223
    .line 224
    .line 225
    const v24, 0x3f88f5c3    # 1.07f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x3f570a3d    # 0.84f

    .line 232
    .line 233
    .line 234
    const v26, 0x3ff851ec    # 1.94f

    .line 235
    .line 236
    .line 237
    const v21, 0x3ebd70a4    # 0.37f

    .line 238
    .line 239
    .line 240
    const v22, 0x3f170a3d    # 0.59f

    .line 241
    .line 242
    .line 243
    const v23, 0x3f28f5c3    # 0.66f

    .line 244
    .line 245
    .line 246
    const v24, 0x3f9eb852    # 1.24f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x41980000    # 19.0f

    .line 253
    .line 254
    const/high16 v26, 0x41300000    # 11.0f

    .line 255
    .line 256
    const v21, 0x41973333    # 18.9f

    .line 257
    .line 258
    .line 259
    const v22, 0x4148cccd    # 12.55f

    .line 260
    .line 261
    .line 262
    const/high16 v23, 0x41980000    # 19.0f

    .line 263
    .line 264
    const v24, 0x413d1eb8    # 11.82f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, -0x3f200000    # -7.0f

    .line 271
    .line 272
    const/high16 v26, -0x3f200000    # -7.0f

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const v22, -0x3f88f5c3    # -3.86f

    .line 277
    .line 278
    .line 279
    const v23, -0x3fb70a3d    # -3.14f

    .line 280
    .line 281
    .line 282
    const/high16 v24, -0x3f200000    # -7.0f

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, 0x40a00000    # 5.0f

    .line 288
    .line 289
    const/high16 v26, 0x41300000    # 11.0f

    .line 290
    .line 291
    const v21, 0x41023d71    # 8.14f

    .line 292
    .line 293
    .line 294
    const/high16 v22, 0x40800000    # 4.0f

    .line 295
    .line 296
    const/high16 v23, 0x40a00000    # 5.0f

    .line 297
    .line 298
    const v24, 0x40e47ae1    # 7.14f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/16 v16, 0x3800

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const v6, 0x3e99999a    # 0.3f

    .line 316
    .line 317
    .line 318
    const v8, 0x3e99999a    # 0.3f

    .line 319
    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/high16 v9, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v12, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const/4 v14, 0x0

    .line 328
    const/4 v15, 0x0

    .line 329
    const-string v4, ""

    .line 330
    .line 331
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 339
    .line 340
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 341
    .line 342
    .line 343
    move-result-wide v6

    .line 344
    const/4 v0, 0x0

    .line 345
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    const v0, 0x413b3333    # 11.7f

    .line 362
    .line 363
    .line 364
    const v2, 0x41311eb8    # 11.07f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3fa28f5c    # 1.27f

    .line 371
    .line 372
    .line 373
    const v18, -0x41428f5c    # -0.37f

    .line 374
    .line 375
    .line 376
    const v13, 0x3e947ae1    # 0.29f

    .line 377
    .line 378
    .line 379
    const v14, -0x413851ec    # -0.39f

    .line 380
    .line 381
    .line 382
    const v15, 0x3f4f5c29    # 0.81f

    .line 383
    .line 384
    .line 385
    const v16, -0x40f0a3d7    # -0.56f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3edc28f6    # 0.43f

    .line 392
    .line 393
    .line 394
    const v18, 0x3ea8f5c3    # 0.33f

    .line 395
    .line 396
    .line 397
    const v13, 0x3e2e147b    # 0.17f

    .line 398
    .line 399
    .line 400
    const v14, 0x3d8f5c29    # 0.07f

    .line 401
    .line 402
    .line 403
    const v15, 0x3ea3d70a    # 0.32f

    .line 404
    .line 405
    .line 406
    const v16, 0x3e3851ec    # 0.18f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3e6147ae    # 0.22f

    .line 413
    .line 414
    .line 415
    const v18, 0x3f59999a    # 0.85f

    .line 416
    .line 417
    .line 418
    const v13, 0x3e6147ae    # 0.22f

    .line 419
    .line 420
    .line 421
    const v14, 0x3e8f5c29    # 0.28f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x3e800000    # 0.25f

    .line 425
    .line 426
    const v16, 0x3f170a3d    # 0.59f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, -0x40f5c28f    # -0.54f

    .line 433
    .line 434
    .line 435
    const v18, 0x3f4a3d71    # 0.79f

    .line 436
    .line 437
    .line 438
    const v13, -0x42b33333    # -0.05f

    .line 439
    .line 440
    .line 441
    const v14, 0x3ea8f5c3    # 0.33f

    .line 442
    .line 443
    .line 444
    const/high16 v15, -0x41800000    # -0.25f

    .line 445
    .line 446
    const v16, 0x3f2147ae    # 0.63f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x3f5dc28f    # -5.07f

    .line 453
    .line 454
    .line 455
    const v18, 0x402c28f6    # 2.69f

    .line 456
    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const v15, -0x3f6428f6    # -4.87f

    .line 461
    .line 462
    .line 463
    const v16, 0x403ccccd    # 2.95f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v2, v0, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41b00000    # 22.0f

    .line 476
    .line 477
    const/high16 v2, 0x41200000    # 10.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, -0x40400000    # -1.5f

    .line 483
    .line 484
    const/high16 v18, 0x40400000    # 3.0f

    .line 485
    .line 486
    const/high16 v14, 0x40200000    # 2.5f

    .line 487
    .line 488
    const/high16 v15, -0x40800000    # -1.0f

    .line 489
    .line 490
    const/high16 v16, 0x40400000    # 3.0f

    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, -0x40e147ae    # -0.62f

    .line 496
    .line 497
    .line 498
    const v18, -0x417ae148    # -0.26f

    .line 499
    .line 500
    .line 501
    const v13, -0x41947ae1    # -0.23f

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const v15, -0x411eb852    # -0.44f

    .line 506
    .line 507
    .line 508
    const v16, -0x42333333    # -0.1f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, -0x3f5570a4    # -5.33f

    .line 515
    .line 516
    .line 517
    const v18, 0x40bfae14    # 5.99f

    .line 518
    .line 519
    .line 520
    const v13, -0x410a3d71    # -0.48f

    .line 521
    .line 522
    .line 523
    const v14, 0x40547ae1    # 3.32f

    .line 524
    .line 525
    .line 526
    const v15, -0x3fe8f5c3    # -2.36f

    .line 527
    .line 528
    .line 529
    const v16, 0x40a9eb85    # 5.31f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x3f733333    # 0.95f

    .line 536
    .line 537
    .line 538
    const v18, 0x3f451eb8    # 0.77f

    .line 539
    .line 540
    .line 541
    const v13, 0x3de147ae    # 0.11f

    .line 542
    .line 543
    .line 544
    const v14, 0x3ee147ae    # 0.44f

    .line 545
    .line 546
    .line 547
    const v15, 0x3ef5c28f    # 0.48f

    .line 548
    .line 549
    .line 550
    const v16, 0x3f451eb8    # 0.77f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/4 v0, 0x0

    .line 557
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3f147ae1    # 0.58f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, 0x3ef5c28f    # 0.48f

    .line 567
    .line 568
    .line 569
    const v18, 0x3eb851ec    # 0.36f

    .line 570
    .line 571
    .line 572
    const v13, 0x3e6147ae    # 0.22f

    .line 573
    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const v15, 0x3ed1eb85    # 0.41f

    .line 577
    .line 578
    .line 579
    const v16, 0x3e19999a    # 0.15f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, 0x3f828f5c    # 1.02f

    .line 586
    .line 587
    .line 588
    const v18, 0x3fa8f5c3    # 1.32f

    .line 589
    .line 590
    .line 591
    const v13, 0x3e2e147b    # 0.17f

    .line 592
    .line 593
    .line 594
    const v14, 0x3f051eb8    # 0.52f

    .line 595
    .line 596
    .line 597
    const v15, 0x3f28f5c3    # 0.66f

    .line 598
    .line 599
    .line 600
    const v16, 0x3f828f5c    # 1.02f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, -0x430a3d71    # -0.03f

    .line 607
    .line 608
    .line 609
    const v18, 0x3f47ae14    # 0.78f

    .line 610
    .line 611
    .line 612
    const/high16 v13, 0x3e800000    # 0.25f

    .line 613
    .line 614
    const v14, 0x3e570a3d    # 0.21f

    .line 615
    .line 616
    .line 617
    const v15, 0x3e75c28f    # 0.24f

    .line 618
    .line 619
    .line 620
    const v16, 0x3f170a3d    # 0.59f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, -0x401ae148    # -1.79f

    .line 627
    .line 628
    .line 629
    const v18, 0x3f07ae14    # 0.53f

    .line 630
    .line 631
    .line 632
    const v13, -0x4151eb85    # -0.34f

    .line 633
    .line 634
    .line 635
    const v14, 0x3e75c28f    # 0.24f

    .line 636
    .line 637
    .line 638
    const v15, -0x4099999a    # -0.9f

    .line 639
    .line 640
    .line 641
    const v16, 0x3efae148    # 0.49f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, -0x4119999a    # -0.45f

    .line 648
    .line 649
    .line 650
    const v18, -0x419eb852    # -0.22f

    .line 651
    .line 652
    .line 653
    const v13, -0x41c7ae14    # -0.18f

    .line 654
    .line 655
    .line 656
    const v14, 0x3c23d70a    # 0.01f

    .line 657
    .line 658
    .line 659
    const v15, -0x414ccccd    # -0.35f

    .line 660
    .line 661
    .line 662
    const v16, -0x4270a3d7    # -0.07f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v17, 0x41700000    # 15.0f

    .line 669
    .line 670
    const v18, 0x41aa147b    # 21.26f

    .line 671
    .line 672
    .line 673
    const v13, 0x4172e148    # 15.18f

    .line 674
    .line 675
    .line 676
    const v14, 0x41b08f5c    # 22.07f

    .line 677
    .line 678
    .line 679
    const/high16 v15, 0x41700000    # 15.0f

    .line 680
    .line 681
    const v16, 0x41adae14    # 21.71f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v17, 0x3db851ec    # 0.09f

    .line 688
    .line 689
    .line 690
    const v18, -0x40b33333    # -0.8f

    .line 691
    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const v14, -0x41666666    # -0.3f

    .line 695
    .line 696
    .line 697
    const v15, 0x3d23d70a    # 0.04f

    .line 698
    .line 699
    .line 700
    const v16, -0x40ee147b    # -0.57f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, -0x4039999a    # -1.55f

    .line 707
    .line 708
    .line 709
    const v18, -0x403851ec    # -1.56f

    .line 710
    .line 711
    .line 712
    const v13, -0x40b851ec    # -0.78f

    .line 713
    .line 714
    .line 715
    const v14, -0x41dc28f6    # -0.16f

    .line 716
    .line 717
    .line 718
    const v15, -0x404e147b    # -1.39f

    .line 719
    .line 720
    .line 721
    const v16, -0x40b851ec    # -0.78f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v17, -0x403ae148    # -1.54f

    .line 728
    .line 729
    .line 730
    const v18, 0x3dcccccd    # 0.1f

    .line 731
    .line 732
    .line 733
    const v13, -0x41051eb8    # -0.49f

    .line 734
    .line 735
    .line 736
    const v14, 0x3d75c28f    # 0.06f

    .line 737
    .line 738
    .line 739
    const/high16 v15, -0x40800000    # -1.0f

    .line 740
    .line 741
    const v16, 0x3dcccccd    # 0.1f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, -0x3fe33333    # -2.45f

    .line 748
    .line 749
    .line 750
    const/high16 v18, -0x41800000    # -0.25f

    .line 751
    .line 752
    const v13, -0x409eb852    # -0.88f

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const v15, -0x40266666    # -1.7f

    .line 757
    .line 758
    .line 759
    const v16, -0x4247ae14    # -0.09f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, 0x41180000    # 9.5f

    .line 766
    .line 767
    const/high16 v18, 0x41980000    # 19.0f

    .line 768
    .line 769
    const v13, 0x41187ae1    # 9.53f

    .line 770
    .line 771
    .line 772
    const v14, 0x4196a3d7    # 18.83f

    .line 773
    .line 774
    .line 775
    const/high16 v15, 0x41180000    # 9.5f

    .line 776
    .line 777
    const v16, 0x419747ae    # 18.91f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v17, 0x3f800000    # 1.0f

    .line 784
    .line 785
    const/high16 v18, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    const v14, 0x3f0ccccd    # 0.55f

    .line 789
    .line 790
    .line 791
    const v15, 0x3ee66666    # 0.45f

    .line 792
    .line 793
    .line 794
    const/high16 v16, 0x3f800000    # 1.0f

    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/4 v0, 0x0

    .line 800
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v0, 0x3f147ae1    # 0.58f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, 0x3ef5c28f    # 0.48f

    .line 810
    .line 811
    .line 812
    const v18, 0x3eb851ec    # 0.36f

    .line 813
    .line 814
    .line 815
    const v13, 0x3e6147ae    # 0.22f

    .line 816
    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const v15, 0x3ed1eb85    # 0.41f

    .line 820
    .line 821
    .line 822
    const v16, 0x3e19999a    # 0.15f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v17, 0x3f828f5c    # 1.02f

    .line 829
    .line 830
    .line 831
    const v18, 0x3fa8f5c3    # 1.32f

    .line 832
    .line 833
    .line 834
    const v13, 0x3e2e147b    # 0.17f

    .line 835
    .line 836
    .line 837
    const v14, 0x3f051eb8    # 0.52f

    .line 838
    .line 839
    .line 840
    const v15, 0x3f28f5c3    # 0.66f

    .line 841
    .line 842
    .line 843
    const v16, 0x3f828f5c    # 1.02f

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v17, -0x430a3d71    # -0.03f

    .line 850
    .line 851
    .line 852
    const v18, 0x3f47ae14    # 0.78f

    .line 853
    .line 854
    .line 855
    const/high16 v13, 0x3e800000    # 0.25f

    .line 856
    .line 857
    const v14, 0x3e570a3d    # 0.21f

    .line 858
    .line 859
    .line 860
    const v15, 0x3e75c28f    # 0.24f

    .line 861
    .line 862
    .line 863
    const v16, 0x3f170a3d    # 0.59f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, -0x401ae148    # -1.79f

    .line 870
    .line 871
    .line 872
    const v18, 0x3f07ae14    # 0.53f

    .line 873
    .line 874
    .line 875
    const v13, -0x4151eb85    # -0.34f

    .line 876
    .line 877
    .line 878
    const v14, 0x3e75c28f    # 0.24f

    .line 879
    .line 880
    .line 881
    const v15, -0x4099999a    # -0.9f

    .line 882
    .line 883
    .line 884
    const v16, 0x3efae148    # 0.49f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v17, -0x4119999a    # -0.45f

    .line 891
    .line 892
    .line 893
    const v18, -0x419eb852    # -0.22f

    .line 894
    .line 895
    .line 896
    const v13, -0x41c7ae14    # -0.18f

    .line 897
    .line 898
    .line 899
    const v14, 0x3c23d70a    # 0.01f

    .line 900
    .line 901
    .line 902
    const v15, -0x414ccccd    # -0.35f

    .line 903
    .line 904
    .line 905
    const v16, -0x4270a3d7    # -0.07f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v17, 0x41200000    # 10.0f

    .line 912
    .line 913
    const v18, 0x41ae147b    # 21.76f

    .line 914
    .line 915
    .line 916
    const v13, 0x4122e148    # 10.18f

    .line 917
    .line 918
    .line 919
    const v14, 0x41b48f5c    # 22.57f

    .line 920
    .line 921
    .line 922
    const/high16 v15, 0x41200000    # 10.0f

    .line 923
    .line 924
    const v16, 0x41b1ae14    # 22.21f

    .line 925
    .line 926
    .line 927
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v17, 0x3db851ec    # 0.09f

    .line 931
    .line 932
    .line 933
    const v18, -0x40b33333    # -0.8f

    .line 934
    .line 935
    .line 936
    const/4 v13, 0x0

    .line 937
    const v14, -0x41666666    # -0.3f

    .line 938
    .line 939
    .line 940
    const v15, 0x3d23d70a    # 0.04f

    .line 941
    .line 942
    .line 943
    const v16, -0x40ee147b    # -0.57f

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v17, 0x41080000    # 8.5f

    .line 950
    .line 951
    const/high16 v18, 0x41980000    # 19.0f

    .line 952
    .line 953
    const v13, 0x41130a3d    # 9.19f

    .line 954
    .line 955
    .line 956
    const v14, 0x41a628f6    # 20.77f

    .line 957
    .line 958
    .line 959
    const/high16 v15, 0x41080000    # 8.5f

    .line 960
    .line 961
    const v16, 0x419fae14    # 19.96f

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v17, 0x3da3d70a    # 0.08f

    .line 968
    .line 969
    .line 970
    const v18, -0x40f851ec    # -0.53f

    .line 971
    .line 972
    .line 973
    const/4 v13, 0x0

    .line 974
    const v14, -0x41c7ae14    # -0.18f

    .line 975
    .line 976
    .line 977
    const v15, 0x3cf5c28f    # 0.03f

    .line 978
    .line 979
    .line 980
    const v16, -0x4147ae14    # -0.36f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v17, -0x3f7147ae    # -4.46f

    .line 987
    .line 988
    .line 989
    const v18, -0x3f4851ec    # -5.74f

    .line 990
    .line 991
    .line 992
    const v13, -0x3fe28f5c    # -2.46f

    .line 993
    .line 994
    .line 995
    const v14, -0x40a3d70a    # -0.86f

    .line 996
    .line 997
    .line 998
    const v15, -0x3f7f0a3d    # -4.03f

    .line 999
    .line 1000
    .line 1001
    const v16, -0x3fce147b    # -2.78f

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    const/high16 v17, 0x40600000    # 3.5f

    .line 1008
    .line 1009
    const/high16 v18, 0x41500000    # 13.0f

    .line 1010
    .line 1011
    const v13, 0x407c28f6    # 3.94f

    .line 1012
    .line 1013
    .line 1014
    const v14, 0x414e6666    # 12.9f

    .line 1015
    .line 1016
    .line 1017
    const v15, 0x406f5c29    # 3.74f

    .line 1018
    .line 1019
    .line 1020
    const/high16 v16, 0x41500000    # 13.0f

    .line 1021
    .line 1022
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const/high16 v17, 0x40000000    # 2.0f

    .line 1026
    .line 1027
    const/high16 v18, 0x41200000    # 10.0f

    .line 1028
    .line 1029
    const/high16 v13, 0x40400000    # 3.0f

    .line 1030
    .line 1031
    const/high16 v14, 0x41500000    # 13.0f

    .line 1032
    .line 1033
    const/high16 v15, 0x40000000    # 2.0f

    .line 1034
    .line 1035
    const/high16 v16, 0x41480000    # 12.5f

    .line 1036
    .line 1037
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const/high16 v17, 0x40400000    # 3.0f

    .line 1041
    .line 1042
    const/high16 v18, -0x3f700000    # -4.5f

    .line 1043
    .line 1044
    const/4 v13, 0x0

    .line 1045
    const v14, -0x3feeb852    # -2.27f

    .line 1046
    .line 1047
    .line 1048
    const v15, 0x3fd9999a    # 1.7f

    .line 1049
    .line 1050
    .line 1051
    const/high16 v16, -0x3f700000    # -4.5f

    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1057
    .line 1058
    const v18, 0x3f59999a    # 0.85f

    .line 1059
    .line 1060
    .line 1061
    const v13, 0x3edc28f6    # 0.43f

    .line 1062
    .line 1063
    .line 1064
    const/4 v14, 0x0

    .line 1065
    const v15, 0x3efae148    # 0.49f

    .line 1066
    .line 1067
    .line 1068
    const v16, 0x3efae148    # 0.49f

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const v17, 0x40b1999a    # 5.55f

    .line 1075
    .line 1076
    .line 1077
    const v18, -0x3fad70a4    # -3.29f

    .line 1078
    .line 1079
    .line 1080
    const v13, 0x3fa3d70a    # 1.28f

    .line 1081
    .line 1082
    .line 1083
    const v14, -0x401c28f6    # -1.78f

    .line 1084
    .line 1085
    .line 1086
    const v15, 0x4050a3d7    # 3.26f

    .line 1087
    .line 1088
    .line 1089
    const v16, -0x3fbeb852    # -3.02f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const/high16 v17, 0x41500000    # 13.0f

    .line 1096
    .line 1097
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1098
    .line 1099
    const/high16 v13, 0x41340000    # 11.25f

    .line 1100
    .line 1101
    const v14, 0x40066666    # 2.1f

    .line 1102
    .line 1103
    .line 1104
    const v15, 0x4142147b    # 12.13f

    .line 1105
    .line 1106
    .line 1107
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 1108
    .line 1109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1113
    .line 1114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1118
    .line 1119
    const/high16 v18, -0x41000000    # -0.5f

    .line 1120
    .line 1121
    const/4 v13, 0x0

    .line 1122
    const/4 v14, 0x0

    .line 1123
    const v15, 0x3ea8f5c3    # 0.33f

    .line 1124
    .line 1125
    .line 1126
    const/high16 v16, -0x41000000    # -0.5f

    .line 1127
    .line 1128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1132
    .line 1133
    const v13, 0x3f2b851f    # 0.67f

    .line 1134
    .line 1135
    .line 1136
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1137
    .line 1138
    const/high16 v16, 0x3f000000    # 0.5f

    .line 1139
    .line 1140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const v17, -0x408a3d71    # -0.96f

    .line 1144
    .line 1145
    .line 1146
    const v18, 0x3f451eb8    # 0.77f

    .line 1147
    .line 1148
    .line 1149
    const v13, -0x41051eb8    # -0.49f

    .line 1150
    .line 1151
    .line 1152
    const v15, -0x40a66666    # -0.85f

    .line 1153
    .line 1154
    .line 1155
    const v16, 0x3eb33333    # 0.35f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const v17, 0x408eb852    # 4.46f

    .line 1162
    .line 1163
    .line 1164
    const v18, 0x40451eb8    # 3.08f

    .line 1165
    .line 1166
    .line 1167
    const v13, 0x3fe8f5c3    # 1.82f

    .line 1168
    .line 1169
    .line 1170
    const v14, 0x3ef5c28f    # 0.48f

    .line 1171
    .line 1172
    .line 1173
    const v15, 0x4058f5c3    # 3.39f

    .line 1174
    .line 1175
    .line 1176
    const v16, 0x3fcb851f    # 1.59f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const/high16 v17, 0x41980000    # 19.0f

    .line 1183
    .line 1184
    const/high16 v18, 0x40b00000    # 5.5f

    .line 1185
    .line 1186
    const v13, 0x4194147b    # 18.51f

    .line 1187
    .line 1188
    .line 1189
    const v14, 0x40bfae14    # 5.99f

    .line 1190
    .line 1191
    .line 1192
    const v15, 0x41948f5c    # 18.57f

    .line 1193
    .line 1194
    .line 1195
    const/high16 v16, 0x40b00000    # 5.5f

    .line 1196
    .line 1197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const/high16 v17, 0x41b00000    # 22.0f

    .line 1201
    .line 1202
    const/high16 v18, 0x41200000    # 10.0f

    .line 1203
    .line 1204
    const v13, 0x41a26666    # 20.3f

    .line 1205
    .line 1206
    .line 1207
    const/high16 v14, 0x40b00000    # 5.5f

    .line 1208
    .line 1209
    const/high16 v15, 0x41b00000    # 22.0f

    .line 1210
    .line 1211
    const v16, 0x40f75c29    # 7.73f

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1221
    .line 1222
    const/high16 v2, 0x41300000    # 11.0f

    .line 1223
    .line 1224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1225
    .line 1226
    .line 1227
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1228
    .line 1229
    const v18, 0x400d70a4    # 2.21f

    .line 1230
    .line 1231
    .line 1232
    const/4 v13, 0x0

    .line 1233
    const v14, 0x3f4f5c29    # 0.81f

    .line 1234
    .line 1235
    .line 1236
    const v15, 0x3dcccccd    # 0.1f

    .line 1237
    .line 1238
    .line 1239
    const v16, 0x3fc3d70a    # 1.53f

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const v17, 0x3f547ae1    # 0.83f

    .line 1246
    .line 1247
    .line 1248
    const v18, -0x400a3d71    # -1.92f

    .line 1249
    .line 1250
    .line 1251
    const v13, 0x3e3851ec    # 0.18f

    .line 1252
    .line 1253
    .line 1254
    const v14, -0x40cf5c29    # -0.69f

    .line 1255
    .line 1256
    .line 1257
    const v15, 0x3eeb851f    # 0.46f

    .line 1258
    .line 1259
    .line 1260
    const v16, -0x4055c28f    # -1.33f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const v17, -0x4151eb85    # -0.34f

    .line 1267
    .line 1268
    .line 1269
    const v18, -0x403ae148    # -1.54f

    .line 1270
    .line 1271
    .line 1272
    const v13, -0x41a8f5c3    # -0.21f

    .line 1273
    .line 1274
    .line 1275
    const v14, -0x410f5c29    # -0.47f

    .line 1276
    .line 1277
    .line 1278
    const v15, -0x4151eb85    # -0.34f

    .line 1279
    .line 1280
    .line 1281
    const v16, -0x40828f5c    # -0.99f

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v17, 0x41180000    # 9.5f

    .line 1288
    .line 1289
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1290
    .line 1291
    const/high16 v13, 0x40b80000    # 5.75f

    .line 1292
    .line 1293
    const v14, 0x40f5c28f    # 7.68f

    .line 1294
    .line 1295
    .line 1296
    const v15, 0x40edc28f    # 7.43f

    .line 1297
    .line 1298
    .line 1299
    const/high16 v16, 0x40c00000    # 6.0f

    .line 1300
    .line 1301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1302
    .line 1303
    .line 1304
    const/high16 v17, 0x40200000    # 2.5f

    .line 1305
    .line 1306
    const v18, 0x3f7851ec    # 0.97f

    .line 1307
    .line 1308
    .line 1309
    const v13, 0x3f75c28f    # 0.96f

    .line 1310
    .line 1311
    .line 1312
    const/4 v14, 0x0

    .line 1313
    const v15, 0x3feb851f    # 1.84f

    .line 1314
    .line 1315
    .line 1316
    const v16, 0x3ebd70a4    # 0.37f

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1320
    .line 1321
    .line 1322
    const/high16 v17, 0x41680000    # 14.5f

    .line 1323
    .line 1324
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1325
    .line 1326
    const v13, 0x414a8f5c    # 12.66f

    .line 1327
    .line 1328
    .line 1329
    const v14, 0x40cbd70a    # 6.37f

    .line 1330
    .line 1331
    .line 1332
    const v15, 0x4158a3d7    # 13.54f

    .line 1333
    .line 1334
    .line 1335
    const/high16 v16, 0x40c00000    # 6.0f

    .line 1336
    .line 1337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1338
    .line 1339
    .line 1340
    const/high16 v17, 0x40700000    # 3.75f

    .line 1341
    .line 1342
    const/high16 v18, 0x40700000    # 3.75f

    .line 1343
    .line 1344
    const v13, 0x40047ae1    # 2.07f

    .line 1345
    .line 1346
    .line 1347
    const/4 v14, 0x0

    .line 1348
    const/high16 v15, 0x40700000    # 3.75f

    .line 1349
    .line 1350
    const v16, 0x3fd70a3d    # 1.68f

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v17, -0x4151eb85    # -0.34f

    .line 1357
    .line 1358
    .line 1359
    const v18, 0x3fc51eb8    # 1.54f

    .line 1360
    .line 1361
    .line 1362
    const/4 v13, 0x0

    .line 1363
    const v14, 0x3f0ccccd    # 0.55f

    .line 1364
    .line 1365
    .line 1366
    const v15, -0x420a3d71    # -0.12f

    .line 1367
    .line 1368
    .line 1369
    const v16, 0x3f88f5c3    # 1.07f

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1373
    .line 1374
    .line 1375
    const v17, 0x3f570a3d    # 0.84f

    .line 1376
    .line 1377
    .line 1378
    const v18, 0x3ff851ec    # 1.94f

    .line 1379
    .line 1380
    .line 1381
    const v13, 0x3ebd70a4    # 0.37f

    .line 1382
    .line 1383
    .line 1384
    const v14, 0x3f170a3d    # 0.59f

    .line 1385
    .line 1386
    .line 1387
    const v15, 0x3f28f5c3    # 0.66f

    .line 1388
    .line 1389
    .line 1390
    const v16, 0x3f9eb852    # 1.24f

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1394
    .line 1395
    .line 1396
    const/high16 v17, 0x41980000    # 19.0f

    .line 1397
    .line 1398
    const/high16 v18, 0x41300000    # 11.0f

    .line 1399
    .line 1400
    const v13, 0x41973333    # 18.9f

    .line 1401
    .line 1402
    .line 1403
    const v14, 0x4148cccd    # 12.55f

    .line 1404
    .line 1405
    .line 1406
    const/high16 v15, 0x41980000    # 19.0f

    .line 1407
    .line 1408
    const v16, 0x413d1eb8    # 11.82f

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1412
    .line 1413
    .line 1414
    const/high16 v17, -0x3f200000    # -7.0f

    .line 1415
    .line 1416
    const/high16 v18, -0x3f200000    # -7.0f

    .line 1417
    .line 1418
    const/4 v13, 0x0

    .line 1419
    const v14, -0x3f88f5c3    # -3.86f

    .line 1420
    .line 1421
    .line 1422
    const v15, -0x3fb70a3d    # -3.14f

    .line 1423
    .line 1424
    .line 1425
    const/high16 v16, -0x3f200000    # -7.0f

    .line 1426
    .line 1427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1428
    .line 1429
    .line 1430
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1431
    .line 1432
    const/high16 v18, 0x41300000    # 11.0f

    .line 1433
    .line 1434
    const v13, 0x41023d71    # 8.14f

    .line 1435
    .line 1436
    .line 1437
    const/high16 v14, 0x40800000    # 4.0f

    .line 1438
    .line 1439
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1440
    .line 1441
    const v16, 0x40e47ae1    # 7.14f

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1448
    .line 1449
    .line 1450
    const v0, 0x418fd70a    # 17.98f

    .line 1451
    .line 1452
    .line 1453
    const v2, 0x4174a3d7    # 15.29f

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1457
    .line 1458
    .line 1459
    const v17, 0x3ca3d70a    # 0.02f

    .line 1460
    .line 1461
    .line 1462
    const v18, -0x416b851f    # -0.29f

    .line 1463
    .line 1464
    .line 1465
    const/4 v13, 0x0

    .line 1466
    const v14, -0x42333333    # -0.1f

    .line 1467
    .line 1468
    .line 1469
    const v15, 0x3ca3d70a    # 0.02f

    .line 1470
    .line 1471
    .line 1472
    const v16, -0x41bd70a4    # -0.19f

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const v17, -0x40cccccd    # -0.7f

    .line 1479
    .line 1480
    .line 1481
    const v18, -0x3fce147b    # -2.78f

    .line 1482
    .line 1483
    .line 1484
    const v14, -0x407eb852    # -1.01f

    .line 1485
    .line 1486
    .line 1487
    const v15, -0x417ae148    # -0.26f

    .line 1488
    .line 1489
    .line 1490
    const v16, -0x40066666    # -1.95f

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1494
    .line 1495
    .line 1496
    const v17, -0x3fcccccd    # -2.8f

    .line 1497
    .line 1498
    .line 1499
    const v18, 0x3fa3d70a    # 1.28f

    .line 1500
    .line 1501
    .line 1502
    const v13, -0x40cf5c29    # -0.69f

    .line 1503
    .line 1504
    .line 1505
    const v14, 0x3f47ae14    # 0.78f

    .line 1506
    .line 1507
    .line 1508
    const v15, -0x4028f5c3    # -1.68f

    .line 1509
    .line 1510
    .line 1511
    const v16, 0x3fa3d70a    # 1.28f

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1515
    .line 1516
    .line 1517
    const v17, -0x40b5c28f    # -0.79f

    .line 1518
    .line 1519
    .line 1520
    const v18, -0x4247ae14    # -0.09f

    .line 1521
    .line 1522
    .line 1523
    const v13, -0x4175c28f    # -0.27f

    .line 1524
    .line 1525
    .line 1526
    const/4 v14, 0x0

    .line 1527
    const v15, -0x40f5c28f    # -0.54f

    .line 1528
    .line 1529
    .line 1530
    const v16, -0x430a3d71    # -0.03f

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1534
    .line 1535
    .line 1536
    const v17, 0x3e8a3d71    # 0.27f

    .line 1537
    .line 1538
    .line 1539
    const v18, -0x40bae148    # -0.77f

    .line 1540
    .line 1541
    .line 1542
    const v13, 0x3e0f5c29    # 0.14f

    .line 1543
    .line 1544
    .line 1545
    const v14, -0x41947ae1    # -0.23f

    .line 1546
    .line 1547
    .line 1548
    const v15, 0x3e6b851f    # 0.23f

    .line 1549
    .line 1550
    .line 1551
    const v16, -0x41051eb8    # -0.49f

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1555
    .line 1556
    .line 1557
    const v17, 0x3ca3d70a    # 0.02f

    .line 1558
    .line 1559
    .line 1560
    const v18, -0x41bd70a4    # -0.19f

    .line 1561
    .line 1562
    .line 1563
    const v13, 0x3c23d70a    # 0.01f

    .line 1564
    .line 1565
    .line 1566
    const v14, -0x4270a3d7    # -0.07f

    .line 1567
    .line 1568
    .line 1569
    const v15, 0x3c23d70a    # 0.01f

    .line 1570
    .line 1571
    .line 1572
    const v16, -0x41fae148    # -0.13f

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1576
    .line 1577
    .line 1578
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1579
    .line 1580
    const v18, 0x3d4ccccd    # 0.05f

    .line 1581
    .line 1582
    .line 1583
    const v13, 0x3e2e147b    # 0.17f

    .line 1584
    .line 1585
    .line 1586
    const v14, 0x3cf5c28f    # 0.03f

    .line 1587
    .line 1588
    .line 1589
    const v15, 0x3ea8f5c3    # 0.33f

    .line 1590
    .line 1591
    .line 1592
    const v16, 0x3d4ccccd    # 0.05f

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1596
    .line 1597
    .line 1598
    const/high16 v17, 0x40300000    # 2.75f

    .line 1599
    .line 1600
    const/high16 v18, -0x3fd00000    # -2.75f

    .line 1601
    .line 1602
    const v13, 0x3fc28f5c    # 1.52f

    .line 1603
    .line 1604
    .line 1605
    const/4 v14, 0x0

    .line 1606
    const/high16 v15, 0x40300000    # 2.75f

    .line 1607
    .line 1608
    const v16, -0x40628f5c    # -1.23f

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1612
    .line 1613
    .line 1614
    const v0, 0x418028f6    # 16.02f

    .line 1615
    .line 1616
    .line 1617
    const/high16 v2, 0x40e00000    # 7.0f

    .line 1618
    .line 1619
    const/high16 v4, 0x41680000    # 14.5f

    .line 1620
    .line 1621
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1622
    .line 1623
    .line 1624
    const v17, -0x4015c28f    # -1.83f

    .line 1625
    .line 1626
    .line 1627
    const v18, 0x3f3851ec    # 0.72f

    .line 1628
    .line 1629
    .line 1630
    const v13, -0x40d47ae1    # -0.67f

    .line 1631
    .line 1632
    .line 1633
    const v15, -0x40570a3d    # -1.32f

    .line 1634
    .line 1635
    .line 1636
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1637
    .line 1638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1639
    .line 1640
    .line 1641
    const/high16 v0, 0x41400000    # 12.0f

    .line 1642
    .line 1643
    const v2, 0x41051eb8    # 8.32f

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1647
    .line 1648
    .line 1649
    const v0, -0x40d47ae1    # -0.67f

    .line 1650
    .line 1651
    .line 1652
    const v2, -0x40e66666    # -0.6f

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1656
    .line 1657
    .line 1658
    const/high16 v17, 0x41180000    # 9.5f

    .line 1659
    .line 1660
    const/high16 v18, 0x40e00000    # 7.0f

    .line 1661
    .line 1662
    const v13, 0x412d1eb8    # 10.82f

    .line 1663
    .line 1664
    .line 1665
    const/high16 v14, 0x40e80000    # 7.25f

    .line 1666
    .line 1667
    const v15, 0x4122b852    # 10.17f

    .line 1668
    .line 1669
    .line 1670
    const/high16 v16, 0x40e00000    # 7.0f

    .line 1671
    .line 1672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1673
    .line 1674
    .line 1675
    const/high16 v17, 0x40d80000    # 6.75f

    .line 1676
    .line 1677
    const/high16 v18, 0x411c0000    # 9.75f

    .line 1678
    .line 1679
    const v13, 0x40ff5c29    # 7.98f

    .line 1680
    .line 1681
    .line 1682
    const/high16 v14, 0x40e00000    # 7.0f

    .line 1683
    .line 1684
    const/high16 v15, 0x40d80000    # 6.75f

    .line 1685
    .line 1686
    const v16, 0x4103ae14    # 8.23f

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1690
    .line 1691
    .line 1692
    const v17, 0x400eb852    # 2.23f

    .line 1693
    .line 1694
    .line 1695
    const v18, 0x402ccccd    # 2.7f

    .line 1696
    .line 1697
    .line 1698
    const/4 v13, 0x0

    .line 1699
    const v14, 0x3fab851f    # 1.34f

    .line 1700
    .line 1701
    .line 1702
    const v15, 0x3f75c28f    # 0.96f

    .line 1703
    .line 1704
    .line 1705
    const v16, 0x401d70a4    # 2.46f

    .line 1706
    .line 1707
    .line 1708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1709
    .line 1710
    .line 1711
    const v0, -0x40bd70a4    # -0.76f

    .line 1712
    .line 1713
    .line 1714
    const v2, 0x3f547ae1    # 0.83f

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1718
    .line 1719
    .line 1720
    const v17, -0x403c28f6    # -1.53f

    .line 1721
    .line 1722
    .line 1723
    const v18, -0x4079999a    # -1.05f

    .line 1724
    .line 1725
    .line 1726
    const v13, -0x40e66666    # -0.6f

    .line 1727
    .line 1728
    .line 1729
    const v14, -0x419eb852    # -0.22f

    .line 1730
    .line 1731
    .line 1732
    const v15, -0x4070a3d7    # -1.12f

    .line 1733
    .line 1734
    .line 1735
    const v16, -0x40e8f5c3    # -0.59f

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1739
    .line 1740
    .line 1741
    const/high16 v17, 0x40c00000    # 6.0f

    .line 1742
    .line 1743
    const/high16 v18, 0x41700000    # 15.0f

    .line 1744
    .line 1745
    const v13, 0x40c851ec    # 6.26f

    .line 1746
    .line 1747
    .line 1748
    const v14, 0x4150f5c3    # 13.06f

    .line 1749
    .line 1750
    .line 1751
    const/high16 v15, 0x40c00000    # 6.0f

    .line 1752
    .line 1753
    const/high16 v16, 0x41600000    # 14.0f

    .line 1754
    .line 1755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1756
    .line 1757
    .line 1758
    const v17, 0x3c23d70a    # 0.01f

    .line 1759
    .line 1760
    .line 1761
    const v18, 0x3e75c28f    # 0.24f

    .line 1762
    .line 1763
    .line 1764
    const/4 v13, 0x0

    .line 1765
    const v14, 0x3da3d70a    # 0.08f

    .line 1766
    .line 1767
    .line 1768
    const v15, 0x3c23d70a    # 0.01f

    .line 1769
    .line 1770
    .line 1771
    const v16, 0x3e19999a    # 0.15f

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1775
    .line 1776
    .line 1777
    const/high16 v17, 0x41400000    # 12.0f

    .line 1778
    .line 1779
    const/high16 v18, 0x41900000    # 18.0f

    .line 1780
    .line 1781
    const v13, 0x40e428f6    # 7.13f

    .line 1782
    .line 1783
    .line 1784
    const v14, 0x41887ae1    # 17.06f

    .line 1785
    .line 1786
    .line 1787
    const v15, 0x41123d71    # 9.14f

    .line 1788
    .line 1789
    .line 1790
    const/high16 v16, 0x41900000    # 18.0f

    .line 1791
    .line 1792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1793
    .line 1794
    .line 1795
    const v17, 0x418fd70a    # 17.98f

    .line 1796
    .line 1797
    .line 1798
    const v18, 0x4174a3d7    # 15.29f

    .line 1799
    .line 1800
    .line 1801
    const v13, 0x416e147b    # 14.88f

    .line 1802
    .line 1803
    .line 1804
    const/high16 v14, 0x41900000    # 18.0f

    .line 1805
    .line 1806
    const v15, 0x41870a3d    # 16.88f

    .line 1807
    .line 1808
    .line 1809
    const v16, 0x4188b852    # 17.09f

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1816
    .line 1817
    .line 1818
    const/high16 v0, 0x41800000    # 16.0f

    .line 1819
    .line 1820
    const/high16 v2, 0x411c0000    # 9.75f

    .line 1821
    .line 1822
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1823
    .line 1824
    .line 1825
    const/high16 v17, -0x40400000    # -1.5f

    .line 1826
    .line 1827
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 1828
    .line 1829
    const/4 v13, 0x0

    .line 1830
    const v14, 0x3f7851ec    # 0.97f

    .line 1831
    .line 1832
    .line 1833
    const v15, -0x40d47ae1    # -0.67f

    .line 1834
    .line 1835
    .line 1836
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 1837
    .line 1838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1839
    .line 1840
    .line 1841
    const v0, 0x412b851f    # 10.72f

    .line 1842
    .line 1843
    .line 1844
    const/high16 v2, 0x41500000    # 13.0f

    .line 1845
    .line 1846
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1847
    .line 1848
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1849
    .line 1850
    .line 1851
    const v0, 0x415ab852    # 13.67f

    .line 1852
    .line 1853
    .line 1854
    const/high16 v2, 0x41680000    # 14.5f

    .line 1855
    .line 1856
    const/high16 v4, 0x41000000    # 8.0f

    .line 1857
    .line 1858
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1859
    .line 1860
    .line 1861
    const v0, 0x410c7ae1    # 8.78f

    .line 1862
    .line 1863
    .line 1864
    const/high16 v2, 0x41800000    # 16.0f

    .line 1865
    .line 1866
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1867
    .line 1868
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1872
    .line 1873
    .line 1874
    const/high16 v0, 0x41740000    # 15.25f

    .line 1875
    .line 1876
    const v2, 0x410e147b    # 8.88f

    .line 1877
    .line 1878
    .line 1879
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1880
    .line 1881
    .line 1882
    const v17, -0x413d70a4    # -0.38f

    .line 1883
    .line 1884
    .line 1885
    const v18, -0x413d70a4    # -0.38f

    .line 1886
    .line 1887
    .line 1888
    const v14, -0x41a8f5c3    # -0.21f

    .line 1889
    .line 1890
    .line 1891
    const v15, -0x41d1eb85    # -0.17f

    .line 1892
    .line 1893
    .line 1894
    const v16, -0x413d70a4    # -0.38f

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1898
    .line 1899
    .line 1900
    const v0, 0x410ab852    # 8.67f

    .line 1901
    .line 1902
    .line 1903
    const/high16 v2, 0x41680000    # 14.5f

    .line 1904
    .line 1905
    const v4, 0x410e147b    # 8.88f

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1909
    .line 1910
    .line 1911
    const v0, 0x3e2e147b    # 0.17f

    .line 1912
    .line 1913
    .line 1914
    const v2, 0x3ec28f5c    # 0.38f

    .line 1915
    .line 1916
    .line 1917
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1918
    .line 1919
    .line 1920
    const v0, 0x411147ae    # 9.08f

    .line 1921
    .line 1922
    .line 1923
    const/high16 v2, 0x41740000    # 15.25f

    .line 1924
    .line 1925
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1926
    .line 1927
    .line 1928
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1929
    .line 1930
    .line 1931
    const/high16 v0, 0x41300000    # 11.0f

    .line 1932
    .line 1933
    const/high16 v2, 0x411c0000    # 9.75f

    .line 1934
    .line 1935
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1936
    .line 1937
    .line 1938
    const/high16 v17, -0x40400000    # -1.5f

    .line 1939
    .line 1940
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 1941
    .line 1942
    const v14, 0x3f7851ec    # 0.97f

    .line 1943
    .line 1944
    .line 1945
    const v15, -0x40d47ae1    # -0.67f

    .line 1946
    .line 1947
    .line 1948
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 1949
    .line 1950
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1951
    .line 1952
    .line 1953
    const v0, 0x412b851f    # 10.72f

    .line 1954
    .line 1955
    .line 1956
    const/high16 v2, 0x41000000    # 8.0f

    .line 1957
    .line 1958
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1959
    .line 1960
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1961
    .line 1962
    .line 1963
    const/high16 v0, 0x41180000    # 9.5f

    .line 1964
    .line 1965
    const v2, 0x410ab852    # 8.67f

    .line 1966
    .line 1967
    .line 1968
    const/high16 v4, 0x41000000    # 8.0f

    .line 1969
    .line 1970
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1971
    .line 1972
    .line 1973
    const v0, 0x410c7ae1    # 8.78f

    .line 1974
    .line 1975
    .line 1976
    const/high16 v2, 0x41300000    # 11.0f

    .line 1977
    .line 1978
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1979
    .line 1980
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1981
    .line 1982
    .line 1983
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1984
    .line 1985
    .line 1986
    const/high16 v0, 0x41240000    # 10.25f

    .line 1987
    .line 1988
    const v2, 0x410e147b    # 8.88f

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1992
    .line 1993
    .line 1994
    const v17, -0x413d70a4    # -0.38f

    .line 1995
    .line 1996
    .line 1997
    const v18, -0x413d70a4    # -0.38f

    .line 1998
    .line 1999
    .line 2000
    const v14, -0x41a8f5c3    # -0.21f

    .line 2001
    .line 2002
    .line 2003
    const v15, -0x41d1eb85    # -0.17f

    .line 2004
    .line 2005
    .line 2006
    const v16, -0x413d70a4    # -0.38f

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2010
    .line 2011
    .line 2012
    const/high16 v0, 0x41180000    # 9.5f

    .line 2013
    .line 2014
    const v2, 0x410ab852    # 8.67f

    .line 2015
    .line 2016
    .line 2017
    const v4, 0x410e147b    # 8.88f

    .line 2018
    .line 2019
    .line 2020
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2021
    .line 2022
    .line 2023
    const v0, 0x3e2e147b    # 0.17f

    .line 2024
    .line 2025
    .line 2026
    const v2, 0x3ec28f5c    # 0.38f

    .line 2027
    .line 2028
    .line 2029
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2030
    .line 2031
    .line 2032
    const v0, 0x411147ae    # 9.08f

    .line 2033
    .line 2034
    .line 2035
    const/high16 v2, 0x41240000    # 10.25f

    .line 2036
    .line 2037
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v2

    .line 2047
    const/16 v16, 0x3800

    .line 2048
    .line 2049
    const/16 v17, 0x0

    .line 2050
    .line 2051
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2052
    .line 2053
    const/high16 v8, 0x3f800000    # 1.0f

    .line 2054
    .line 2055
    const/4 v7, 0x0

    .line 2056
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2057
    .line 2058
    const/4 v14, 0x0

    .line 2059
    const/4 v15, 0x0

    .line 2060
    const-string v4, ""

    .line 2061
    .line 2062
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v0

    .line 2066
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    sput-object v0, Landroidx/compose/material/icons/twotone/FlutterDashKt;->_flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2071
    .line 2072
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2073
    .line 2074
    .line 2075
    return-object v0
.end method
