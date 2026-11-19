.class public final Landroidx/compose/material/icons/twotone/TramKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tram:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTram(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TramKt;->_tram:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Tram"

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
    const v4, 0x414f851f    # 12.97f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x4007ae14    # -1.94f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x3f866666    # -3.9f

    .line 85
    .line 86
    .line 87
    const/high16 v26, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/high16 v21, -0x3fd00000    # -2.75f

    .line 90
    .line 91
    const v22, 0x3da3d70a    # 0.08f

    .line 92
    .line 93
    .line 94
    const v23, -0x3f9851ec    # -3.62f

    .line 95
    .line 96
    .line 97
    const v24, 0x3f147ae1    # 0.58f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x411bd70a    # 9.74f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v21, -0x4170a3d7    # -0.28f

    .line 114
    .line 115
    .line 116
    const v22, -0x4128f5c3    # -0.42f

    .line 117
    .line 118
    .line 119
    const v23, -0x406ccccd    # -1.15f

    .line 120
    .line 121
    .line 122
    const v24, -0x40947ae1    # -0.92f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41800000    # 16.0f

    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v25, 0x3f3d70a4    # 0.74f

    .line 142
    .line 143
    .line 144
    const v26, 0x3f733333    # 0.95f

    .line 145
    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const v22, 0x3ee66666    # 0.45f

    .line 150
    .line 151
    .line 152
    const v23, 0x3e99999a    # 0.3f

    .line 153
    .line 154
    .line 155
    const v24, 0x3f570a3d    # 0.84f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x40470a3d    # 3.11f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, -0x414ccccd    # -0.35f

    .line 168
    .line 169
    .line 170
    const v26, -0x408ccccd    # -0.95f

    .line 171
    .line 172
    .line 173
    const v21, -0x419eb852    # -0.22f

    .line 174
    .line 175
    .line 176
    const v22, -0x417ae148    # -0.26f

    .line 177
    .line 178
    .line 179
    const v23, -0x414ccccd    # -0.35f

    .line 180
    .line 181
    .line 182
    const v24, -0x40e8f5c3    # -0.59f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, 0x3ec7ae14    # 0.39f

    .line 189
    .line 190
    .line 191
    const/high16 v26, -0x40800000    # -1.0f

    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, -0x413851ec    # -0.39f

    .line 196
    .line 197
    .line 198
    const v23, 0x3e19999a    # 0.15f

    .line 199
    .line 200
    .line 201
    const v24, -0x40c51eb8    # -0.73f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x41800000    # 16.0f

    .line 208
    .line 209
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41580000    # 13.5f

    .line 216
    .line 217
    const/high16 v6, 0x41880000    # 17.0f

    .line 218
    .line 219
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, -0x414ccccd    # -0.35f

    .line 223
    .line 224
    .line 225
    const v26, 0x3f733333    # 0.95f

    .line 226
    .line 227
    .line 228
    const v22, 0x3eb851ec    # 0.36f

    .line 229
    .line 230
    .line 231
    const v23, -0x41fae148    # -0.13f

    .line 232
    .line 233
    .line 234
    const v24, 0x3f30a3d7    # 0.69f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x40470a3d    # 3.11f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, 0x3f3d70a4    # 0.74f

    .line 247
    .line 248
    .line 249
    const v26, -0x408ccccd    # -0.95f

    .line 250
    .line 251
    .line 252
    const v21, 0x3ee147ae    # 0.44f

    .line 253
    .line 254
    .line 255
    const v22, -0x421eb852    # -0.11f

    .line 256
    .line 257
    .line 258
    const v23, 0x3f3d70a4    # 0.74f

    .line 259
    .line 260
    .line 261
    const/high16 v24, -0x41000000    # -0.5f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, -0x40800000    # -1.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, -0x3f870a3d    # -3.89f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v25, 0x3ec7ae14    # 0.39f

    .line 278
    .line 279
    .line 280
    const/high16 v26, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const v21, 0x3e75c28f    # 0.24f

    .line 283
    .line 284
    .line 285
    const v22, 0x3e8a3d71    # 0.27f

    .line 286
    .line 287
    .line 288
    const v23, 0x3ec7ae14    # 0.39f

    .line 289
    .line 290
    .line 291
    const v24, 0x3f1c28f6    # 0.61f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    const/16 v16, 0x3800

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const v6, 0x3e99999a    # 0.3f

    .line 309
    .line 310
    .line 311
    const v8, 0x3e99999a    # 0.3f

    .line 312
    .line 313
    .line 314
    const/4 v7, 0x0

    .line 315
    const/high16 v9, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v12, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const/4 v14, 0x0

    .line 321
    const/4 v15, 0x0

    .line 322
    const-string v4, ""

    .line 323
    .line 324
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 325
    .line 326
    .line 327
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    const/4 v0, 0x0

    .line 338
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 342
    .line 343
    .line 344
    move-result v10

    .line 345
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41500000    # 13.0f

    .line 355
    .line 356
    const/high16 v2, 0x40a00000    # 5.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x3f400000    # 0.75f

    .line 362
    .line 363
    const/high16 v2, -0x40400000    # -1.5f

    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40600000    # 3.5f

    .line 369
    .line 370
    const/high16 v2, 0x41880000    # 17.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40e00000    # 7.0f

    .line 381
    .line 382
    const/high16 v2, 0x40000000    # 2.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x40980000    # 4.75f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x41300000    # 11.0f

    .line 398
    .line 399
    const/high16 v2, 0x40a00000    # 5.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, -0x3f400000    # -6.0f

    .line 405
    .line 406
    const/high16 v18, 0x40600000    # 3.5f

    .line 407
    .line 408
    const v13, -0x3fb7ae14    # -3.13f

    .line 409
    .line 410
    .line 411
    const v14, 0x3db851ec    # 0.09f

    .line 412
    .line 413
    .line 414
    const/high16 v15, -0x3f400000    # -6.0f

    .line 415
    .line 416
    const v16, 0x3f3ae148    # 0.73f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x40a00000    # 5.0f

    .line 423
    .line 424
    const/high16 v2, 0x41880000    # 17.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x40233333    # 2.55f

    .line 430
    .line 431
    .line 432
    const v18, 0x403ccccd    # 2.95f

    .line 433
    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 437
    .line 438
    const v15, 0x3f8e147b    # 1.11f

    .line 439
    .line 440
    .line 441
    const v16, 0x402eb852    # 2.73f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40c00000    # 6.0f

    .line 448
    .line 449
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x3f000000    # 0.5f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x40000000    # 2.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, -0x40000000    # -2.0f

    .line 465
    .line 466
    const/high16 v2, 0x40000000    # 2.0f

    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x40800000    # 4.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x40000000    # 2.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x41000000    # -0.5f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x4039999a    # -1.55f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x43dc28f6    # -0.01f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3c23d70a    # 0.01f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x41980000    # 19.0f

    .line 508
    .line 509
    const/high16 v18, 0x41880000    # 17.0f

    .line 510
    .line 511
    const v13, 0x418f1eb8    # 17.89f

    .line 512
    .line 513
    .line 514
    const v14, 0x419dd70a    # 19.73f

    .line 515
    .line 516
    .line 517
    const/high16 v15, 0x41980000    # 19.0f

    .line 518
    .line 519
    const/high16 v16, 0x41940000    # 18.5f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41980000    # 19.0f

    .line 525
    .line 526
    const/high16 v2, 0x41080000    # 8.5f

    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, -0x3f400000    # -6.0f

    .line 532
    .line 533
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, -0x3fceb852    # -2.77f

    .line 537
    .line 538
    .line 539
    const v15, -0x3fc851ec    # -2.87f

    .line 540
    .line 541
    .line 542
    const v16, -0x3fa5c28f    # -3.41f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x41307ae1    # 11.03f

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x40e00000    # 7.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3ff851ec    # 1.94f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, 0x4079999a    # 3.9f

    .line 566
    .line 567
    .line 568
    const/high16 v18, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v13, 0x40300000    # 2.75f

    .line 571
    .line 572
    const v14, 0x3da3d70a    # 0.08f

    .line 573
    .line 574
    .line 575
    const v15, 0x4067ae14    # 3.62f

    .line 576
    .line 577
    .line 578
    const v16, 0x3f147ae1    # 0.58f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x40e428f6    # 7.13f

    .line 585
    .line 586
    .line 587
    const/high16 v2, 0x41000000    # 8.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v18, -0x40800000    # -1.0f

    .line 593
    .line 594
    const v13, 0x3e8f5c29    # 0.28f

    .line 595
    .line 596
    .line 597
    const v14, -0x4128f5c3    # -0.42f

    .line 598
    .line 599
    .line 600
    const v15, 0x3f933333    # 1.15f

    .line 601
    .line 602
    .line 603
    const v16, -0x40947ae1    # -0.92f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x412d999a    # 10.85f

    .line 613
    .line 614
    .line 615
    const v2, 0x418f999a    # 17.95f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x40f7ae14    # 7.74f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v17, 0x40e00000    # 7.0f

    .line 628
    .line 629
    const/high16 v18, 0x41880000    # 17.0f

    .line 630
    .line 631
    const v13, 0x40e9999a    # 7.3f

    .line 632
    .line 633
    .line 634
    const v14, 0x418eb852    # 17.84f

    .line 635
    .line 636
    .line 637
    const/high16 v15, 0x40e00000    # 7.0f

    .line 638
    .line 639
    const v16, 0x418b999a    # 17.45f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, -0x40800000    # -1.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x4078f5c3    # 3.89f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x413851ec    # -0.39f

    .line 657
    .line 658
    .line 659
    const/high16 v18, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const v13, -0x418a3d71    # -0.24f

    .line 662
    .line 663
    .line 664
    const v14, 0x3e8a3d71    # 0.27f

    .line 665
    .line 666
    .line 667
    const v15, -0x413851ec    # -0.39f

    .line 668
    .line 669
    .line 670
    const v16, 0x3f1c28f6    # 0.61f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, 0x3eb33333    # 0.35f

    .line 677
    .line 678
    .line 679
    const v18, 0x3f733333    # 0.95f

    .line 680
    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const v14, 0x3eb851ec    # 0.36f

    .line 684
    .line 685
    .line 686
    const v15, 0x3e051eb8    # 0.13f

    .line 687
    .line 688
    .line 689
    const v16, 0x3f30a3d7    # 0.69f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x41880000    # 17.0f

    .line 699
    .line 700
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, -0x40c28f5c    # -0.74f

    .line 704
    .line 705
    .line 706
    const v14, 0x3ee66666    # 0.45f

    .line 707
    .line 708
    .line 709
    const v15, -0x41666666    # -0.3f

    .line 710
    .line 711
    .line 712
    const v16, 0x3f570a3d    # 0.84f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, -0x3fb8f5c3    # -3.11f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3eb33333    # 0.35f

    .line 725
    .line 726
    .line 727
    const v18, -0x408ccccd    # -0.95f

    .line 728
    .line 729
    .line 730
    const v13, 0x3e6147ae    # 0.22f

    .line 731
    .line 732
    .line 733
    const v14, -0x417ae148    # -0.26f

    .line 734
    .line 735
    .line 736
    const v15, 0x3eb33333    # 0.35f

    .line 737
    .line 738
    .line 739
    const v16, -0x40e8f5c3    # -0.59f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v17, -0x413851ec    # -0.39f

    .line 746
    .line 747
    .line 748
    const/high16 v18, -0x40800000    # -1.0f

    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    const v14, -0x413851ec    # -0.39f

    .line 752
    .line 753
    .line 754
    const v15, -0x41e66666    # -0.15f

    .line 755
    .line 756
    .line 757
    const v16, -0x40c51eb8    # -0.73f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x41800000    # 16.0f

    .line 764
    .line 765
    const/high16 v2, 0x41880000    # 17.0f

    .line 766
    .line 767
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v0, 0x3f800000    # 1.0f

    .line 771
    .line 772
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v0, 0x41600000    # 14.0f

    .line 779
    .line 780
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v2, 0x40e00000    # 7.0f

    .line 784
    .line 785
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, -0x3f800000    # -4.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v0, 0x41200000    # 10.0f

    .line 794
    .line 795
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, 0x40800000    # 4.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    const/16 v16, 0x3800

    .line 811
    .line 812
    const/16 v17, 0x0

    .line 813
    .line 814
    const/high16 v6, 0x3f800000    # 1.0f

    .line 815
    .line 816
    const/high16 v8, 0x3f800000    # 1.0f

    .line 817
    .line 818
    const/4 v7, 0x0

    .line 819
    const/high16 v12, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const/4 v14, 0x0

    .line 822
    const/4 v15, 0x0

    .line 823
    const-string v4, ""

    .line 824
    .line 825
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    sput-object v0, Landroidx/compose/material/icons/twotone/TramKt;->_tram:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 834
    .line 835
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    return-object v0
.end method
