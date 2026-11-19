.class public final Landroidx/compose/material/icons/rounded/AutoFixHighKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixHigh(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AutoFixHigh"

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
    const v4, 0x41a3999a    # 20.45f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x407851ec    # -1.06f

    .line 79
    .line 80
    .line 81
    const v6, 0x3efae148    # 0.49f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x408e6666    # 4.45f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x41b00000    # 22.0f

    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/16 v25, 0x0

    .line 96
    .line 97
    const v26, -0x40970a3d    # -0.91f

    .line 98
    .line 99
    .line 100
    const v21, 0x3ec7ae14    # 0.39f

    .line 101
    .line 102
    .line 103
    const v22, -0x41c7ae14    # -0.18f

    .line 104
    .line 105
    .line 106
    const v23, 0x3ec7ae14    # 0.39f

    .line 107
    .line 108
    .line 109
    const v24, -0x40c51eb8    # -0.73f

    .line 110
    .line 111
    .line 112
    move-object/from16 v20, v2

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, -0x41051eb8    # -0.49f

    .line 118
    .line 119
    .line 120
    const v6, -0x407851ec    # -1.06f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40000000    # 2.0f

    .line 127
    .line 128
    const v6, 0x41a3999a    # 20.45f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, -0x40970a3d    # -0.91f

    .line 135
    .line 136
    .line 137
    const/16 v26, 0x0

    .line 138
    .line 139
    const v21, -0x41c7ae14    # -0.18f

    .line 140
    .line 141
    .line 142
    const v22, -0x413851ec    # -0.39f

    .line 143
    .line 144
    .line 145
    const v23, -0x40c51eb8    # -0.73f

    .line 146
    .line 147
    .line 148
    const v24, -0x413851ec    # -0.39f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, -0x41051eb8    # -0.49f

    .line 155
    .line 156
    .line 157
    const v6, 0x3f87ae14    # 1.06f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x40633333    # 3.55f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41900000    # 18.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/16 v25, 0x0

    .line 172
    .line 173
    const v26, 0x3f68f5c3    # 0.91f

    .line 174
    .line 175
    .line 176
    const v21, -0x413851ec    # -0.39f

    .line 177
    .line 178
    .line 179
    const v22, 0x3e3851ec    # 0.18f

    .line 180
    .line 181
    .line 182
    const v23, -0x413851ec    # -0.39f

    .line 183
    .line 184
    .line 185
    const v24, 0x3f3ae148    # 0.73f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x3f87ae14    # 1.06f

    .line 192
    .line 193
    .line 194
    const v6, 0x3efae148    # 0.49f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x419c6666    # 19.55f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x40c00000    # 6.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x41a3999a    # 20.45f

    .line 209
    .line 210
    .line 211
    const/high16 v26, 0x40c00000    # 6.0f

    .line 212
    .line 213
    const v21, 0x419dc28f    # 19.72f

    .line 214
    .line 215
    .line 216
    const v22, 0x40cc7ae1    # 6.39f

    .line 217
    .line 218
    .line 219
    const v23, 0x41a23d71    # 20.28f

    .line 220
    .line 221
    .line 222
    const v24, 0x40cc7ae1    # 6.39f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/16 v16, 0x3800

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/high16 v6, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v8, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const/high16 v9, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v12, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    const-string v4, ""

    .line 252
    .line 253
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    const/4 v2, 0x0

    .line 267
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const v4, 0x410f3333    # 8.95f

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x40c00000    # 6.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, -0x407851ec    # -1.06f

    .line 292
    .line 293
    .line 294
    const v6, 0x3efae148    # 0.49f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, -0x41051eb8    # -0.49f

    .line 301
    .line 302
    .line 303
    const v6, 0x3f87ae14    # 1.06f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/16 v25, 0x0

    .line 310
    .line 311
    const v26, -0x40970a3d    # -0.91f

    .line 312
    .line 313
    .line 314
    const v21, 0x3ec7ae14    # 0.39f

    .line 315
    .line 316
    .line 317
    const v22, -0x41c7ae14    # -0.18f

    .line 318
    .line 319
    .line 320
    const v23, 0x3ec7ae14    # 0.39f

    .line 321
    .line 322
    .line 323
    const v24, -0x40c51eb8    # -0.73f

    .line 324
    .line 325
    .line 326
    move-object/from16 v20, v2

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x41170a3d    # 9.44f

    .line 332
    .line 333
    .line 334
    const v6, 0x4043d70a    # 3.06f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, 0x410f3333    # 8.95f

    .line 341
    .line 342
    .line 343
    const/high16 v6, 0x40000000    # 2.0f

    .line 344
    .line 345
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, 0x4100cccd    # 8.05f

    .line 349
    .line 350
    .line 351
    const/high16 v26, 0x40000000    # 2.0f

    .line 352
    .line 353
    const v21, 0x410c7ae1    # 8.78f

    .line 354
    .line 355
    .line 356
    const v22, 0x3fce147b    # 1.61f

    .line 357
    .line 358
    .line 359
    const v23, 0x4103851f    # 8.22f

    .line 360
    .line 361
    .line 362
    const v24, 0x3fce147b    # 1.61f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x40f1eb85    # 7.56f

    .line 369
    .line 370
    .line 371
    const v6, 0x4043d70a    # 3.06f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v4, 0x40d00000    # 6.5f

    .line 378
    .line 379
    const v6, 0x40633333    # 3.55f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/16 v25, 0x0

    .line 386
    .line 387
    const v26, 0x3f68f5c3    # 0.91f

    .line 388
    .line 389
    .line 390
    const v21, -0x413851ec    # -0.39f

    .line 391
    .line 392
    .line 393
    const v22, 0x3e3851ec    # 0.18f

    .line 394
    .line 395
    .line 396
    const v23, -0x413851ec    # -0.39f

    .line 397
    .line 398
    .line 399
    const v24, 0x3f3ae148    # 0.73f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x3f87ae14    # 1.06f

    .line 406
    .line 407
    .line 408
    const v6, 0x3efae148    # 0.49f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, 0x4100cccd    # 8.05f

    .line 415
    .line 416
    .line 417
    const/high16 v6, 0x40c00000    # 6.0f

    .line 418
    .line 419
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v25, 0x410f3333    # 8.95f

    .line 423
    .line 424
    .line 425
    const/high16 v26, 0x40c00000    # 6.0f

    .line 426
    .line 427
    const v21, 0x4103851f    # 8.22f

    .line 428
    .line 429
    .line 430
    const v22, 0x40cc7ae1    # 6.39f

    .line 431
    .line 432
    .line 433
    const v23, 0x410c7ae1    # 8.78f

    .line 434
    .line 435
    .line 436
    const v24, 0x40cc7ae1    # 6.39f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v7, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 462
    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 464
    .line 465
    .line 466
    move-result-wide v6

    .line 467
    const/4 v2, 0x0

    .line 468
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x41580000    # 13.5f

    .line 485
    .line 486
    const v6, 0x419c6666    # 19.55f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v4, -0x41051eb8    # -0.49f

    .line 493
    .line 494
    .line 495
    const v6, 0x3f87ae14    # 1.06f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, 0x4170cccd    # 15.05f

    .line 502
    .line 503
    .line 504
    const/high16 v6, 0x41900000    # 18.0f

    .line 505
    .line 506
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/16 v25, 0x0

    .line 510
    .line 511
    const v26, 0x3f68f5c3    # 0.91f

    .line 512
    .line 513
    .line 514
    const v21, -0x413851ec    # -0.39f

    .line 515
    .line 516
    .line 517
    const v22, 0x3e3851ec    # 0.18f

    .line 518
    .line 519
    .line 520
    const v23, -0x413851ec    # -0.39f

    .line 521
    .line 522
    .line 523
    const v24, 0x3f3ae148    # 0.73f

    .line 524
    .line 525
    .line 526
    move-object/from16 v20, v2

    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x3f87ae14    # 1.06f

    .line 532
    .line 533
    .line 534
    const v6, 0x3efae148    # 0.49f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v25, 0x3f68f5c3    # 0.91f

    .line 544
    .line 545
    .line 546
    const/16 v26, 0x0

    .line 547
    .line 548
    const v21, 0x3e3851ec    # 0.18f

    .line 549
    .line 550
    .line 551
    const v22, 0x3ec7ae14    # 0.39f

    .line 552
    .line 553
    .line 554
    const v23, 0x3f3ae148    # 0.73f

    .line 555
    .line 556
    .line 557
    const v24, 0x3ec7ae14    # 0.39f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v4, -0x407851ec    # -1.06f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v4, 0x417f3333    # 15.95f

    .line 570
    .line 571
    .line 572
    const/high16 v6, 0x41b00000    # 22.0f

    .line 573
    .line 574
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/16 v25, 0x0

    .line 578
    .line 579
    const v26, -0x40970a3d    # -0.91f

    .line 580
    .line 581
    .line 582
    const v21, 0x3ec7ae14    # 0.39f

    .line 583
    .line 584
    .line 585
    const v22, -0x41c7ae14    # -0.18f

    .line 586
    .line 587
    .line 588
    const v23, 0x3ec7ae14    # 0.39f

    .line 589
    .line 590
    .line 591
    const v24, -0x40c51eb8    # -0.73f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v4, -0x41051eb8    # -0.49f

    .line 598
    .line 599
    .line 600
    const v6, -0x407851ec    # -1.06f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v25, 0x419c6666    # 19.55f

    .line 610
    .line 611
    .line 612
    const/high16 v26, 0x41580000    # 13.5f

    .line 613
    .line 614
    const v21, 0x41a23d71    # 20.28f

    .line 615
    .line 616
    .line 617
    const v22, 0x4151c28f    # 13.11f

    .line 618
    .line 619
    .line 620
    const v23, 0x419dc28f    # 19.72f

    .line 621
    .line 622
    .line 623
    const v24, 0x4151c28f    # 13.11f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    const/high16 v6, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/4 v7, 0x0

    .line 639
    const-string v4, ""

    .line 640
    .line 641
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 642
    .line 643
    .line 644
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 649
    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 651
    .line 652
    .line 653
    move-result-wide v6

    .line 654
    const/4 v0, 0x0

    .line 655
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 659
    .line 660
    .line 661
    move-result v10

    .line 662
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 663
    .line 664
    .line 665
    move-result v11

    .line 666
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    const v0, 0x418dae14    # 17.71f

    .line 672
    .line 673
    .line 674
    const v2, 0x4111eb85    # 9.12f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, -0x3fcae148    # -2.83f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v17, -0x404b851f    # -1.41f

    .line 687
    .line 688
    .line 689
    const/16 v18, 0x0

    .line 690
    .line 691
    const v13, -0x413851ec    # -0.39f

    .line 692
    .line 693
    .line 694
    const v14, -0x413851ec    # -0.39f

    .line 695
    .line 696
    .line 697
    const v15, -0x407d70a4    # -1.02f

    .line 698
    .line 699
    .line 700
    const v16, -0x413851ec    # -0.39f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x40128f5c    # 2.29f

    .line 707
    .line 708
    .line 709
    const v2, 0x418bae14    # 17.46f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/16 v17, 0x0

    .line 716
    .line 717
    const v18, 0x3fb47ae1    # 1.41f

    .line 718
    .line 719
    .line 720
    const v14, 0x3ec7ae14    # 0.39f

    .line 721
    .line 722
    .line 723
    const v15, -0x413851ec    # -0.39f

    .line 724
    .line 725
    .line 726
    const v16, 0x3f828f5c    # 1.02f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x40351eb8    # 2.83f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v17, 0x3fb47ae1    # 1.41f

    .line 739
    .line 740
    .line 741
    const/16 v18, 0x0

    .line 742
    .line 743
    const v13, 0x3ec7ae14    # 0.39f

    .line 744
    .line 745
    .line 746
    const v15, 0x3f828f5c    # 1.02f

    .line 747
    .line 748
    .line 749
    const v16, 0x3ec7ae14    # 0.39f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x4132b852    # 11.17f

    .line 756
    .line 757
    .line 758
    const v2, -0x3ecd47ae    # -11.17f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v17, 0x418dae14    # 17.71f

    .line 765
    .line 766
    .line 767
    const v18, 0x4111eb85    # 9.12f

    .line 768
    .line 769
    .line 770
    const v13, 0x4190cccd    # 18.1f

    .line 771
    .line 772
    .line 773
    const v14, 0x41226666    # 10.15f

    .line 774
    .line 775
    .line 776
    const v15, 0x4190cccd    # 18.1f

    .line 777
    .line 778
    .line 779
    const v16, 0x411828f6    # 9.51f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, 0x41335c29    # 11.21f

    .line 789
    .line 790
    .line 791
    const v2, 0x41635c29    # 14.21f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v0, -0x404b851f    # -1.41f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v0, 0x3fb0a3d7    # 1.38f

    .line 804
    .line 805
    .line 806
    const v2, -0x404f5c29    # -1.38f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, 0x3fb47ae1    # 1.41f

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x41335c29    # 11.21f

    .line 819
    .line 820
    .line 821
    const v2, 0x41635c29    # 14.21f

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    const/16 v16, 0x3800

    .line 835
    .line 836
    const/16 v17, 0x0

    .line 837
    .line 838
    const/high16 v6, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/4 v7, 0x0

    .line 841
    const/high16 v12, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v13, 0x0

    .line 844
    const/4 v14, 0x0

    .line 845
    const/4 v15, 0x0

    .line 846
    const-string v4, ""

    .line 847
    .line 848
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    sput-object v0, Landroidx/compose/material/icons/rounded/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 857
    .line 858
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    return-object v0
.end method
