.class public final Landroidx/compose/material/icons/rounded/AttachEmailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _attachEmail:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachEmail(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AttachEmailKt;->_attachEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AttachEmail"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v23, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x40000000    # -2.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40400000    # 3.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x3f8147ae    # 1.01f

    .line 107
    .line 108
    .line 109
    const/high16 v26, 0x40800000    # 4.0f

    .line 110
    .line 111
    const v21, 0x3ff33333    # 1.9f

    .line 112
    .line 113
    .line 114
    const/high16 v22, 0x40000000    # 2.0f

    .line 115
    .line 116
    const v23, 0x3f8147ae    # 1.01f

    .line 117
    .line 118
    .line 119
    const v24, 0x4039999a    # 2.9f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41800000    # 16.0f

    .line 126
    .line 127
    const/high16 v6, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/high16 v26, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    const v22, 0x3f8ccccd    # 1.1f

    .line 139
    .line 140
    .line 141
    const v23, 0x3f666666    # 0.9f

    .line 142
    .line 143
    .line 144
    const/high16 v24, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41300000    # 11.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, -0x3f600000    # -5.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x40400000    # 3.0f

    .line 160
    .line 161
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 162
    .line 163
    const v22, -0x402b851f    # -1.66f

    .line 164
    .line 165
    .line 166
    const v23, 0x3fab851f    # 1.34f

    .line 167
    .line 168
    .line 169
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x41a80000    # 21.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x412ab852    # 10.67f

    .line 183
    .line 184
    .line 185
    const v6, 0x41387ae1    # 11.53f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, -0x407851ec    # -1.06f

    .line 192
    .line 193
    .line 194
    const/16 v26, 0x0

    .line 195
    .line 196
    const v21, -0x415c28f6    # -0.32f

    .line 197
    .line 198
    .line 199
    const v22, 0x3e4ccccd    # 0.2f

    .line 200
    .line 201
    .line 202
    const v23, -0x40c28f5c    # -0.74f

    .line 203
    .line 204
    .line 205
    const v24, 0x3e4ccccd    # 0.2f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x4059999a    # 3.4f

    .line 212
    .line 213
    .line 214
    const/high16 v6, 0x40c80000    # 6.25f

    .line 215
    .line 216
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v25, 0x40400000    # 3.0f

    .line 220
    .line 221
    const v26, 0x40b0f5c3    # 5.53f

    .line 222
    .line 223
    .line 224
    const v21, 0x4049999a    # 3.15f

    .line 225
    .line 226
    .line 227
    const v22, 0x40c2e148    # 6.09f

    .line 228
    .line 229
    .line 230
    const/high16 v23, 0x40400000    # 3.0f

    .line 231
    .line 232
    const v24, 0x40ba3d71    # 5.82f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3fa66666    # 1.3f

    .line 239
    .line 240
    .line 241
    const v26, -0x40c7ae14    # -0.72f

    .line 242
    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const v22, -0x40d47ae1    # -0.67f

    .line 247
    .line 248
    .line 249
    const v23, 0x3f3ae148    # 0.73f

    .line 250
    .line 251
    .line 252
    const v24, -0x40770a3d    # -1.07f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41100000    # 9.0f

    .line 259
    .line 260
    const/high16 v6, 0x41300000    # 11.0f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, 0x40d66666    # 6.7f

    .line 266
    .line 267
    .line 268
    const v6, -0x3f79eb85    # -4.19f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v25, 0x41980000    # 19.0f

    .line 275
    .line 276
    const v26, 0x40b0f5c3    # 5.53f

    .line 277
    .line 278
    .line 279
    const v21, 0x419228f6    # 18.27f

    .line 280
    .line 281
    .line 282
    const v22, 0x408eb852    # 4.46f

    .line 283
    .line 284
    .line 285
    const/high16 v23, 0x41980000    # 19.0f

    .line 286
    .line 287
    const v24, 0x409b851f    # 4.86f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v25, -0x41333333    # -0.4f

    .line 294
    .line 295
    .line 296
    const v26, 0x3f3851ec    # 0.72f

    .line 297
    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const v22, 0x3e947ae1    # 0.29f

    .line 302
    .line 303
    .line 304
    const v23, -0x41e66666    # -0.15f

    .line 305
    .line 306
    .line 307
    const v24, 0x3f0f5c29    # 0.56f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x412ab852    # 10.67f

    .line 314
    .line 315
    .line 316
    const v6, 0x41387ae1    # 11.53f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/high16 v8, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    const/high16 v9, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v12, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const/4 v14, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    const-string v4, ""

    .line 346
    .line 347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 348
    .line 349
    .line 350
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 357
    .line 358
    .line 359
    move-result-wide v6

    .line 360
    const/4 v0, 0x0

    .line 361
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41b00000    # 22.0f

    .line 378
    .line 379
    const/high16 v2, 0x41600000    # 14.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, -0x40800000    # -1.0f

    .line 385
    .line 386
    const/high16 v18, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const v13, -0x40f33333    # -0.55f

    .line 389
    .line 390
    .line 391
    const/high16 v15, -0x40800000    # -1.0f

    .line 392
    .line 393
    const v16, 0x3ee66666    # 0.45f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40400000    # 3.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, -0x40000000    # -2.0f

    .line 405
    .line 406
    const/high16 v18, 0x40000000    # 2.0f

    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const v14, 0x3f8ccccd    # 1.1f

    .line 410
    .line 411
    .line 412
    const v15, -0x4099999a    # -0.9f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x40000000    # 2.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x4099999a    # -0.9f

    .line 421
    .line 422
    .line 423
    const/high16 v2, -0x40000000    # -2.0f

    .line 424
    .line 425
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, -0x3f700000    # -4.5f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x3f000000    # 0.5f

    .line 434
    .line 435
    const/high16 v18, -0x41000000    # -0.5f

    .line 436
    .line 437
    const v14, -0x4170a3d7    # -0.28f

    .line 438
    .line 439
    .line 440
    const v15, 0x3e6147ae    # 0.22f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x41000000    # -0.5f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3e6147ae    # 0.22f

    .line 449
    .line 450
    .line 451
    const/high16 v2, 0x3f000000    # 0.5f

    .line 452
    .line 453
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41880000    # 17.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v18, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const v14, 0x3f0ccccd    # 0.55f

    .line 466
    .line 467
    .line 468
    const v15, 0x3ee66666    # 0.45f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x3f800000    # 1.0f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, -0x4119999a    # -0.45f

    .line 477
    .line 478
    .line 479
    const/high16 v2, -0x40800000    # -1.0f

    .line 480
    .line 481
    const/high16 v4, 0x3f800000    # 1.0f

    .line 482
    .line 483
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 492
    .line 493
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 494
    .line 495
    const v14, -0x404f5c29    # -1.38f

    .line 496
    .line 497
    .line 498
    const v15, -0x4070a3d7    # -1.12f

    .line 499
    .line 500
    .line 501
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4141eb85    # 12.12f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41580000    # 13.5f

    .line 510
    .line 511
    const/high16 v4, 0x41700000    # 15.0f

    .line 512
    .line 513
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41900000    # 18.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x40800000    # 4.0f

    .line 522
    .line 523
    const/high16 v18, 0x40800000    # 4.0f

    .line 524
    .line 525
    const v14, 0x400d70a4    # 2.21f

    .line 526
    .line 527
    .line 528
    const v15, 0x3fe51eb8    # 1.79f

    .line 529
    .line 530
    .line 531
    const/high16 v16, 0x40800000    # 4.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, -0x401ae148    # -1.79f

    .line 537
    .line 538
    .line 539
    const/high16 v2, -0x3f800000    # -4.0f

    .line 540
    .line 541
    const/high16 v4, 0x40800000    # 4.0f

    .line 542
    .line 543
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x41b00000    # 22.0f

    .line 552
    .line 553
    const/high16 v18, 0x41600000    # 14.0f

    .line 554
    .line 555
    const/high16 v13, 0x41b80000    # 23.0f

    .line 556
    .line 557
    const v14, 0x41673333    # 14.45f

    .line 558
    .line 559
    .line 560
    const v15, 0x41b46666    # 22.55f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x41600000    # 14.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

    .line 586
    const/4 v15, 0x0

    .line 587
    const-string v4, ""

    .line 588
    .line 589
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    sput-object v0, Landroidx/compose/material/icons/rounded/AttachEmailKt;->_attachEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    return-object v0
.end method
