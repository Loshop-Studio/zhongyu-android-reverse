.class public final Landroidx/compose/material/icons/filled/MacroOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMacroOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.MacroOff"

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
    const v4, 0x41893333    # 17.15f

    .line 71
    .line 72
    .line 73
    const v6, 0x419fd70a    # 19.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41a80000    # 21.0f

    .line 80
    .line 81
    const/high16 v26, 0x41500000    # 13.0f

    .line 82
    .line 83
    const v21, 0x41a50a3d    # 20.63f

    .line 84
    .line 85
    .line 86
    const v22, 0x417e8f5c    # 15.91f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x41a80000    # 21.0f

    .line 90
    .line 91
    const/high16 v24, 0x41680000    # 14.5f

    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, -0x3f7b3333    # -4.15f

    .line 99
    .line 100
    .line 101
    const v26, 0x3f828f5c    # 1.02f

    .line 102
    .line 103
    .line 104
    const/high16 v21, -0x40400000    # -1.5f

    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const v23, -0x3fc5c28f    # -2.91f

    .line 109
    .line 110
    .line 111
    const v24, 0x3ebd70a4    # 0.37f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const/16 v16, 0x3800

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/high16 v6, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/high16 v8, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    const/high16 v9, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/high16 v12, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const-string v4, ""

    .line 144
    .line 145
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40400000    # 3.0f

    .line 176
    .line 177
    const/high16 v6, 0x41500000    # 13.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x41100000    # 9.0f

    .line 183
    .line 184
    const/high16 v26, 0x41100000    # 9.0f

    .line 185
    .line 186
    const/16 v21, 0x0

    .line 187
    .line 188
    const v22, 0x409f0a3d    # 4.97f

    .line 189
    .line 190
    .line 191
    const v23, 0x4080f5c3    # 4.03f

    .line 192
    .line 193
    .line 194
    const/high16 v24, 0x41100000    # 9.0f

    .line 195
    .line 196
    move-object/from16 v20, v2

    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, 0x40400000    # 3.0f

    .line 202
    .line 203
    const/high16 v26, 0x41500000    # 13.0f

    .line 204
    .line 205
    const/high16 v21, 0x41400000    # 12.0f

    .line 206
    .line 207
    const v22, 0x41883d71    # 17.03f

    .line 208
    .line 209
    .line 210
    const v23, 0x40ff0a3d    # 7.97f

    .line 211
    .line 212
    .line 213
    const/high16 v24, 0x41500000    # 13.0f

    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/high16 v6, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v2, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v6, 0x40b00000    # 5.5f

    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v25, 0x40200000    # 2.5f

    .line 268
    .line 269
    const/high16 v26, 0x40200000    # 2.5f

    .line 270
    .line 271
    const v21, 0x3fb0a3d7    # 1.38f

    .line 272
    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    const/high16 v23, 0x40200000    # 2.5f

    .line 277
    .line 278
    const v24, 0x3f8f5c29    # 1.12f

    .line 279
    .line 280
    .line 281
    move-object/from16 v20, v2

    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v25, -0x404a3d71    # -1.42f

    .line 287
    .line 288
    .line 289
    const/high16 v26, 0x40100000    # 2.25f

    .line 290
    .line 291
    const/16 v21, 0x0

    .line 292
    .line 293
    const v22, 0x3f7d70a4    # 0.99f

    .line 294
    .line 295
    .line 296
    const v23, -0x40eb851f    # -0.58f

    .line 297
    .line 298
    .line 299
    const v24, 0x3feb851f    # 1.84f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, 0x401eb852    # 2.48f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x3eb33333    # 0.35f

    .line 312
    .line 313
    .line 314
    const v26, 0x3cf5c28f    # 0.03f

    .line 315
    .line 316
    .line 317
    const v21, 0x3de147ae    # 0.11f

    .line 318
    .line 319
    .line 320
    const v22, 0x3ca3d70a    # 0.02f

    .line 321
    .line 322
    .line 323
    const v23, 0x3e6b851f    # 0.23f

    .line 324
    .line 325
    .line 326
    const v24, 0x3cf5c28f    # 0.03f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, 0x40200000    # 2.5f

    .line 333
    .line 334
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 335
    .line 336
    const v21, 0x3fb0a3d7    # 1.38f

    .line 337
    .line 338
    .line 339
    const/16 v22, 0x0

    .line 340
    .line 341
    const/high16 v23, 0x40200000    # 2.5f

    .line 342
    .line 343
    const v24, -0x4070a3d7    # -1.12f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v25, -0x4048f5c3    # -1.43f

    .line 350
    .line 351
    .line 352
    const/high16 v26, -0x3ff00000    # -2.25f

    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const/high16 v22, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v23, -0x40e8f5c3    # -0.59f

    .line 359
    .line 360
    .line 361
    const v24, -0x40133333    # -1.85f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x3fb70a3d    # 1.43f

    .line 368
    .line 369
    .line 370
    const v21, 0x3f570a3d    # 0.84f

    .line 371
    .line 372
    .line 373
    const v22, -0x41333333    # -0.4f

    .line 374
    .line 375
    .line 376
    const v23, 0x3fb70a3d    # 1.43f

    .line 377
    .line 378
    .line 379
    const/high16 v24, -0x40600000    # -1.25f

    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 385
    .line 386
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const v22, -0x404f5c29    # -1.38f

    .line 391
    .line 392
    .line 393
    const v23, -0x4070a3d7    # -1.12f

    .line 394
    .line 395
    .line 396
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v25, -0x404a3d71    # -1.42f

    .line 402
    .line 403
    .line 404
    const v26, 0x3ee147ae    # 0.44f

    .line 405
    .line 406
    .line 407
    const v21, -0x40f851ec    # -0.53f

    .line 408
    .line 409
    .line 410
    const/16 v22, 0x0

    .line 411
    .line 412
    const v23, -0x407eb852    # -1.01f

    .line 413
    .line 414
    .line 415
    const v24, 0x3e23d70a    # 0.16f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x41680000    # 14.5f

    .line 422
    .line 423
    const/high16 v6, 0x40600000    # 3.5f

    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v25, 0x41400000    # 12.0f

    .line 429
    .line 430
    const/high16 v26, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v21, 0x41680000    # 14.5f

    .line 433
    .line 434
    const v22, 0x4007ae14    # 2.12f

    .line 435
    .line 436
    .line 437
    const v23, 0x4156147b    # 13.38f

    .line 438
    .line 439
    .line 440
    const/high16 v24, 0x3f800000    # 1.0f

    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x4007ae14    # 2.12f

    .line 446
    .line 447
    .line 448
    const/high16 v7, 0x41180000    # 9.5f

    .line 449
    .line 450
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, 0x3e428f5c    # 0.19f

    .line 454
    .line 455
    .line 456
    const v6, 0x3ca3d70a    # 0.02f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v25, 0x4101999a    # 8.1f

    .line 463
    .line 464
    .line 465
    const/high16 v26, 0x40500000    # 3.25f

    .line 466
    .line 467
    const v21, 0x4111eb85    # 9.12f

    .line 468
    .line 469
    .line 470
    const v22, 0x405a3d71    # 3.41f

    .line 471
    .line 472
    .line 473
    const v23, 0x410a147b    # 8.63f

    .line 474
    .line 475
    .line 476
    const/high16 v24, 0x40500000    # 3.25f

    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v25, -0x403eb852    # -1.51f

    .line 482
    .line 483
    .line 484
    const v26, 0x3f051eb8    # 0.52f

    .line 485
    .line 486
    .line 487
    const v21, -0x40ee147b    # -0.57f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const v23, -0x40747ae1    # -1.09f

    .line 493
    .line 494
    .line 495
    const v24, 0x3e4ccccd    # 0.2f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, 0x404a3d71    # 3.16f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v25, 0x41400000    # 12.0f

    .line 508
    .line 509
    const/high16 v26, 0x40b00000    # 5.5f

    .line 510
    .line 511
    const v21, 0x41228f5c    # 10.16f

    .line 512
    .line 513
    .line 514
    const v22, 0x40c28f5c    # 6.08f

    .line 515
    .line 516
    .line 517
    const v23, 0x413028f6    # 11.01f

    .line 518
    .line 519
    .line 520
    const/high16 v24, 0x40b00000    # 5.5f

    .line 521
    .line 522
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    const/high16 v6, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 547
    .line 548
    .line 549
    move-result-wide v6

    .line 550
    const/4 v0, 0x0

    .line 551
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 555
    .line 556
    .line 557
    move-result v10

    .line 558
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 565
    .line 566
    .line 567
    const v0, 0x4033d70a    # 2.81f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3fb1eb85    # 1.39f

    .line 574
    .line 575
    .line 576
    const v2, 0x40870a3d    # 4.22f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x40947ae1    # 4.64f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x40b33333    # 5.6f

    .line 589
    .line 590
    .line 591
    const/high16 v18, 0x41240000    # 10.25f

    .line 592
    .line 593
    const v13, 0x40b851ec    # 5.76f

    .line 594
    .line 595
    .line 596
    const v14, 0x411428f6    # 9.26f

    .line 597
    .line 598
    .line 599
    const v15, 0x40b33333    # 5.6f

    .line 600
    .line 601
    .line 602
    const v16, 0x411bae14    # 9.73f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x40200000    # 2.5f

    .line 609
    .line 610
    const/high16 v18, 0x40200000    # 2.5f

    .line 611
    .line 612
    const/4 v13, 0x0

    .line 613
    const v14, 0x3fb0a3d7    # 1.38f

    .line 614
    .line 615
    .line 616
    const v15, 0x3f8f5c29    # 1.12f

    .line 617
    .line 618
    .line 619
    const/high16 v16, 0x40200000    # 2.5f

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x3fb33333    # 1.4f

    .line 625
    .line 626
    .line 627
    const v18, -0x4123d70a    # -0.43f

    .line 628
    .line 629
    .line 630
    const v13, 0x3f051eb8    # 0.52f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const v15, 0x3f7d70a4    # 0.99f

    .line 635
    .line 636
    .line 637
    const v16, -0x41dc28f6    # -0.16f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3ca3d70a    # 0.02f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41480000    # 12.5f

    .line 650
    .line 651
    const/high16 v2, 0x41180000    # 9.5f

    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, 0x40200000    # 2.5f

    .line 657
    .line 658
    const/high16 v18, 0x40200000    # 2.5f

    .line 659
    .line 660
    const/4 v13, 0x0

    .line 661
    const v14, 0x3fb0a3d7    # 1.38f

    .line 662
    .line 663
    .line 664
    const v15, 0x3f8f5c29    # 1.12f

    .line 665
    .line 666
    .line 667
    const/high16 v16, 0x40200000    # 2.5f

    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x3e23d70a    # 0.16f

    .line 673
    .line 674
    .line 675
    const v18, -0x435c28f6    # -0.02f

    .line 676
    .line 677
    .line 678
    const v13, 0x3d4ccccd    # 0.05f

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x0

    .line 682
    const v15, 0x3dcccccd    # 0.1f

    .line 683
    .line 684
    .line 685
    const v16, -0x43dc28f6    # -0.01f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3fd1eb85    # 1.64f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v17, 0x41400000    # 12.0f

    .line 698
    .line 699
    const/high16 v18, 0x41b00000    # 22.0f

    .line 700
    .line 701
    const v13, 0x414ab852    # 12.67f

    .line 702
    .line 703
    .line 704
    const v14, 0x4190f5c3    # 18.12f

    .line 705
    .line 706
    .line 707
    const/high16 v15, 0x41400000    # 12.0f

    .line 708
    .line 709
    const v16, 0x419fd70a    # 19.98f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v17, 0x40ac28f6    # 5.38f

    .line 716
    .line 717
    .line 718
    const v18, -0x4019999a    # -1.8f

    .line 719
    .line 720
    .line 721
    const v13, 0x400147ae    # 2.02f

    .line 722
    .line 723
    .line 724
    const/4 v14, 0x0

    .line 725
    const v15, 0x407851ec    # 3.88f

    .line 726
    .line 727
    .line 728
    const v16, -0x40d47ae1    # -0.67f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x4019999a    # 2.4f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, 0x3fb47ae1    # 1.41f

    .line 741
    .line 742
    .line 743
    const v2, -0x404b851f    # -1.41f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v0, 0x4033d70a    # 2.81f

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const/16 v16, 0x3800

    .line 763
    .line 764
    const/16 v17, 0x0

    .line 765
    .line 766
    const/high16 v6, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/4 v7, 0x0

    .line 769
    const/high16 v12, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/4 v13, 0x0

    .line 772
    const/4 v15, 0x0

    .line 773
    const-string v4, ""

    .line 774
    .line 775
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    sput-object v0, Landroidx/compose/material/icons/filled/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 784
    .line 785
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    return-object v0
.end method
