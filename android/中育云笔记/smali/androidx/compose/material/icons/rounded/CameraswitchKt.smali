.class public final Landroidx/compose/material/icons/rounded/CameraswitchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCameraswitch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CameraswitchKt;->_cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cameraswitch"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x3f800000    # -4.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41100000    # 9.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x41000000    # 8.0f

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v25, 0x40c00000    # 6.0f

    .line 101
    .line 102
    const/high16 v26, 0x41100000    # 9.0f

    .line 103
    .line 104
    const v21, 0x40dccccd    # 6.9f

    .line 105
    .line 106
    .line 107
    const/high16 v22, 0x40e00000    # 7.0f

    .line 108
    .line 109
    const/high16 v23, 0x40c00000    # 6.0f

    .line 110
    .line 111
    const v24, 0x40fccccd    # 7.9f

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x40c00000    # 6.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x40000000    # 2.0f

    .line 125
    .line 126
    const/high16 v26, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, 0x3f8ccccd    # 1.1f

    .line 131
    .line 132
    .line 133
    const v23, 0x3f666666    # 0.9f

    .line 134
    .line 135
    .line 136
    const/high16 v24, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41000000    # 8.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v26, -0x40000000    # -2.0f

    .line 147
    .line 148
    const v21, 0x3f8ccccd    # 1.1f

    .line 149
    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const/high16 v23, 0x40000000    # 2.0f

    .line 154
    .line 155
    const v24, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41100000    # 9.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41800000    # 16.0f

    .line 167
    .line 168
    const/high16 v26, 0x40e00000    # 7.0f

    .line 169
    .line 170
    const/high16 v21, 0x41900000    # 18.0f

    .line 171
    .line 172
    const v22, 0x40fccccd    # 7.9f

    .line 173
    .line 174
    .line 175
    const v23, 0x4188cccd    # 17.1f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x40e00000    # 7.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41400000    # 12.0f

    .line 187
    .line 188
    const/high16 v6, 0x41600000    # 14.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, -0x40000000    # -2.0f

    .line 194
    .line 195
    const/high16 v26, -0x40000000    # -2.0f

    .line 196
    .line 197
    const v21, -0x40733333    # -1.1f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const/high16 v23, -0x40000000    # -2.0f

    .line 203
    .line 204
    const v24, -0x4099999a    # -0.9f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    const v22, -0x40733333    # -1.1f

    .line 215
    .line 216
    .line 217
    const v23, 0x3f666666    # 0.9f

    .line 218
    .line 219
    .line 220
    const/high16 v24, -0x40000000    # -2.0f

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x3f666666    # 0.9f

    .line 226
    .line 227
    .line 228
    const/high16 v6, 0x40000000    # 2.0f

    .line 229
    .line 230
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, 0x41400000    # 12.0f

    .line 234
    .line 235
    const/high16 v26, 0x41600000    # 14.0f

    .line 236
    .line 237
    const/high16 v21, 0x41600000    # 14.0f

    .line 238
    .line 239
    const v22, 0x4151999a    # 13.1f

    .line 240
    .line 241
    .line 242
    const v23, 0x4151999a    # 13.1f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x41600000    # 14.0f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const/16 v16, 0x3800

    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    const/high16 v6, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/high16 v8, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/4 v7, 0x0

    .line 266
    const/high16 v9, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/high16 v12, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    const/4 v15, 0x0

    .line 273
    const-string v4, ""

    .line 274
    .line 275
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const v4, 0x41173333    # 9.45f

    .line 306
    .line 307
    .line 308
    const v6, 0x3e8f5c29    # 0.28f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x41130a3d    # 9.19f

    .line 315
    .line 316
    .line 317
    const v26, 0x3f8f5c29    # 1.12f

    .line 318
    .line 319
    .line 320
    const v21, 0x4110cccd    # 9.05f

    .line 321
    .line 322
    .line 323
    const v22, 0x3eb851ec    # 0.36f

    .line 324
    .line 325
    .line 326
    const v23, 0x410e6666    # 8.9f

    .line 327
    .line 328
    .line 329
    const v24, 0x3f570a3d    # 0.84f

    .line 330
    .line 331
    .line 332
    move-object/from16 v20, v2

    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x4040a3d7    # 3.01f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v25, 0x3f59999a    # 0.85f

    .line 344
    .line 345
    .line 346
    const v26, -0x414ccccd    # -0.35f

    .line 347
    .line 348
    .line 349
    const v21, 0x3ea3d70a    # 0.32f

    .line 350
    .line 351
    .line 352
    const v22, 0x3e9eb852    # 0.31f

    .line 353
    .line 354
    .line 355
    const v23, 0x3f59999a    # 0.85f

    .line 356
    .line 357
    .line 358
    const v24, 0x3db851ec    # 0.09f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v4, 0x40028f5c    # 2.04f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, 0x410d70a4    # 8.84f

    .line 371
    .line 372
    .line 373
    const v26, 0x4102b852    # 8.17f

    .line 374
    .line 375
    .line 376
    const v21, 0x408e6666    # 4.45f

    .line 377
    .line 378
    .line 379
    const v22, 0x3ee147ae    # 0.44f

    .line 380
    .line 381
    .line 382
    const v23, 0x4100f5c3    # 8.06f

    .line 383
    .line 384
    .line 385
    const v24, 0x40747ae1    # 3.82f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v25, 0x3f7851ec    # 0.97f

    .line 392
    .line 393
    .line 394
    const v26, 0x3f47ae14    # 0.78f

    .line 395
    .line 396
    .line 397
    const v21, 0x3da3d70a    # 0.08f

    .line 398
    .line 399
    .line 400
    const v22, 0x3eeb851f    # 0.46f

    .line 401
    .line 402
    .line 403
    const/high16 v23, 0x3f000000    # 0.5f

    .line 404
    .line 405
    const v24, 0x3f47ae14    # 0.78f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, 0x3f7ae148    # 0.98f

    .line 412
    .line 413
    .line 414
    const v26, -0x4068f5c3    # -1.18f

    .line 415
    .line 416
    .line 417
    const v21, 0x3f1eb852    # 0.62f

    .line 418
    .line 419
    .line 420
    const/16 v22, 0x0

    .line 421
    .line 422
    const v23, 0x3f8b851f    # 1.09f

    .line 423
    .line 424
    .line 425
    const v24, -0x40ee147b    # -0.57f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v25, 0x41173333    # 9.45f

    .line 432
    .line 433
    .line 434
    const v26, 0x3e8f5c29    # 0.28f

    .line 435
    .line 436
    .line 437
    const v21, 0x41b4e148    # 22.61f

    .line 438
    .line 439
    .line 440
    const v22, 0x4038f5c3    # 2.89f

    .line 441
    .line 442
    .line 443
    const v23, 0x417ca3d7    # 15.79f

    .line 444
    .line 445
    .line 446
    const v24, -0x4070a3d7    # -1.12f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const-string v4, ""

    .line 463
    .line 464
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 465
    .line 466
    .line 467
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 474
    .line 475
    .line 476
    move-result-wide v6

    .line 477
    const/4 v0, 0x0

    .line 478
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 482
    .line 483
    .line 484
    move-result v10

    .line 485
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    const v0, 0x419ef5c3    # 19.87f

    .line 495
    .line 496
    .line 497
    const v2, 0x413ccccd    # 11.8f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x40a66666    # -0.85f

    .line 504
    .line 505
    .line 506
    const v18, 0x3eb33333    # 0.35f

    .line 507
    .line 508
    .line 509
    const v13, -0x415c28f6    # -0.32f

    .line 510
    .line 511
    .line 512
    const v14, -0x415c28f6    # -0.32f

    .line 513
    .line 514
    .line 515
    const v15, -0x40a66666    # -0.85f

    .line 516
    .line 517
    .line 518
    const v16, -0x4247ae14    # -0.09f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3fdeb852    # 1.74f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x3ef28f5c    # -8.84f

    .line 531
    .line 532
    .line 533
    const v18, -0x3efd47ae    # -8.17f

    .line 534
    .line 535
    .line 536
    const v13, -0x3f71999a    # -4.45f

    .line 537
    .line 538
    .line 539
    const v14, -0x411eb852    # -0.44f

    .line 540
    .line 541
    .line 542
    const v15, -0x3eff0a3d    # -8.06f

    .line 543
    .line 544
    .line 545
    const v16, -0x3f8b851f    # -3.82f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x4087ae14    # -0.97f

    .line 552
    .line 553
    .line 554
    const v18, -0x40b851ec    # -0.78f

    .line 555
    .line 556
    .line 557
    const v13, -0x425c28f6    # -0.08f

    .line 558
    .line 559
    .line 560
    const v14, -0x41147ae1    # -0.46f

    .line 561
    .line 562
    .line 563
    const/high16 v15, -0x41000000    # -0.5f

    .line 564
    .line 565
    const v16, -0x40b851ec    # -0.78f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x40851eb8    # -0.98f

    .line 572
    .line 573
    .line 574
    const v18, 0x3f970a3d    # 1.18f

    .line 575
    .line 576
    .line 577
    const v13, -0x40e147ae    # -0.62f

    .line 578
    .line 579
    .line 580
    const/4 v14, 0x0

    .line 581
    const v15, -0x40747ae1    # -1.09f

    .line 582
    .line 583
    .line 584
    const v16, 0x3f11eb85    # 0.57f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, 0x41666666    # 14.4f

    .line 591
    .line 592
    .line 593
    const v18, 0x41187ae1    # 9.53f

    .line 594
    .line 595
    .line 596
    const v13, 0x3f9eb852    # 1.24f

    .line 597
    .line 598
    .line 599
    const v14, 0x40dd70a4    # 6.92f

    .line 600
    .line 601
    .line 602
    const v15, 0x4100f5c3    # 8.06f

    .line 603
    .line 604
    .line 605
    const v16, 0x412ee148    # 10.93f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3e851eb8    # 0.26f

    .line 612
    .line 613
    .line 614
    const v18, -0x40a66666    # -0.85f

    .line 615
    .line 616
    .line 617
    const v13, 0x3ec7ae14    # 0.39f

    .line 618
    .line 619
    .line 620
    const v14, -0x4247ae14    # -0.09f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f0ccccd    # 0.55f

    .line 624
    .line 625
    .line 626
    const v16, -0x40f0a3d7    # -0.56f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x419ef5c3    # 19.87f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/16 v16, 0x3800

    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    const/high16 v6, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v7, 0x0

    .line 652
    const/high16 v12, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v13, 0x0

    .line 655
    const/4 v14, 0x0

    .line 656
    const/4 v15, 0x0

    .line 657
    const-string v4, ""

    .line 658
    .line 659
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    sput-object v0, Landroidx/compose/material/icons/rounded/CameraswitchKt;->_cameraswitch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    return-object v0
.end method
