.class public final Landroidx/compose/material/icons/twotone/ChildFriendlyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChildFriendly(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ChildFriendlyKt;->_childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ChildFriendly"

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
    const v4, 0x408ae148    # 4.34f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41700000    # 15.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41000000    # 8.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x406a3d71    # 3.66f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v25, 0x41700000    # 15.0f

    .line 90
    .line 91
    const v26, 0x408ae148    # 4.34f

    .line 92
    .line 93
    .line 94
    const v21, 0x41906666    # 18.05f

    .line 95
    .line 96
    .line 97
    const v22, 0x40c9999a    # 6.3f

    .line 98
    .line 99
    .line 100
    const v23, 0x4185999a    # 16.7f

    .line 101
    .line 102
    .line 103
    const v24, 0x409e6666    # 4.95f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4100a3d7    # 8.04f

    .line 115
    .line 116
    .line 117
    const v6, 0x4165c28f    # 14.36f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x3ee147ae    # 0.44f

    .line 124
    .line 125
    .line 126
    const v6, 0x3f2b851f    # 0.67f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, 0x402b851f    # 2.68f

    .line 133
    .line 134
    .line 135
    const v26, 0x3ffc28f6    # 1.97f

    .line 136
    .line 137
    .line 138
    const v21, 0x3f9851ec    # 1.19f

    .line 139
    .line 140
    .line 141
    const v22, 0x3e23d70a    # 0.16f

    .line 142
    .line 143
    .line 144
    const v23, 0x400c28f6    # 2.19f

    .line 145
    .line 146
    .line 147
    const v24, 0x3f6b851f    # 0.92f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x402b851f    # 2.68f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x404a3d71    # 3.16f

    .line 160
    .line 161
    .line 162
    const/high16 v26, -0x40000000    # -2.0f

    .line 163
    .line 164
    const v21, 0x3f0f5c29    # 0.56f

    .line 165
    .line 166
    .line 167
    const v22, -0x4068f5c3    # -1.18f

    .line 168
    .line 169
    .line 170
    const v23, 0x3fe28f5c    # 1.77f

    .line 171
    .line 172
    .line 173
    const/high16 v24, -0x40000000    # -2.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x3eeb851f    # 0.46f

    .line 179
    .line 180
    .line 181
    const v26, 0x3cf5c28f    # 0.03f

    .line 182
    .line 183
    .line 184
    const v21, 0x3e19999a    # 0.15f

    .line 185
    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const v23, 0x3e9eb852    # 0.31f

    .line 190
    .line 191
    .line 192
    const v24, 0x3c23d70a    # 0.01f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x3e947ae1    # 0.29f

    .line 199
    .line 200
    .line 201
    const v6, -0x41428f5c    # -0.37f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f6b851f    # 0.92f

    .line 208
    .line 209
    .line 210
    const v26, -0x402b851f    # -1.66f

    .line 211
    .line 212
    .line 213
    const v21, 0x3ecccccd    # 0.4f

    .line 214
    .line 215
    .line 216
    const v22, -0x40fd70a4    # -0.51f

    .line 217
    .line 218
    .line 219
    const v23, 0x3f333333    # 0.7f

    .line 220
    .line 221
    .line 222
    const v24, -0x40770a3d    # -1.07f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x40ebd70a    # 7.37f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x3f2b851f    # 0.67f

    .line 235
    .line 236
    .line 237
    const v26, 0x3fae147b    # 1.36f

    .line 238
    .line 239
    .line 240
    const v21, 0x3ea3d70a    # 0.32f

    .line 241
    .line 242
    .line 243
    const v22, 0x3f2b851f    # 0.67f

    .line 244
    .line 245
    .line 246
    const v23, 0x3f11eb85    # 0.57f

    .line 247
    .line 248
    .line 249
    const v24, 0x3f9851ec    # 1.19f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const/16 v16, 0x3800

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const v6, 0x3e99999a    # 0.3f

    .line 267
    .line 268
    .line 269
    const v8, 0x3e99999a    # 0.3f

    .line 270
    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const/high16 v9, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v12, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const/4 v14, 0x0

    .line 279
    const/4 v15, 0x0

    .line 280
    const-string v4, ""

    .line 281
    .line 282
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 290
    .line 291
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    const/4 v0, 0x0

    .line 296
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41500000    # 13.0f

    .line 313
    .line 314
    const/high16 v2, 0x40000000    # 2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41000000    # 8.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, -0x3f000000    # -8.0f

    .line 328
    .line 329
    const/high16 v18, -0x3f000000    # -8.0f

    .line 330
    .line 331
    const v14, -0x3f728f5c    # -4.42f

    .line 332
    .line 333
    .line 334
    const v15, -0x3f9ae148    # -3.58f

    .line 335
    .line 336
    .line 337
    const/high16 v16, -0x3f000000    # -8.0f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41700000    # 15.0f

    .line 346
    .line 347
    const/high16 v2, 0x41000000    # 8.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x408ae148    # 4.34f

    .line 353
    .line 354
    .line 355
    const/high16 v2, 0x41700000    # 15.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x406a3d71    # 3.66f

    .line 361
    .line 362
    .line 363
    const v18, 0x406a3d71    # 3.66f

    .line 364
    .line 365
    .line 366
    const v13, 0x3fd9999a    # 1.7f

    .line 367
    .line 368
    .line 369
    const v14, 0x3f19999a    # 0.6f

    .line 370
    .line 371
    .line 372
    const v15, 0x40433333    # 3.05f

    .line 373
    .line 374
    .line 375
    const v16, 0x3ff9999a    # 1.95f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41700000    # 15.0f

    .line 382
    .line 383
    const/high16 v2, 0x41000000    # 8.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41300000    # 11.0f

    .line 392
    .line 393
    const v2, 0x40ce147b    # 6.44f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x408ccccd    # -0.95f

    .line 400
    .line 401
    .line 402
    const/high16 v2, -0x40000000    # -2.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41100000    # 9.0f

    .line 408
    .line 409
    const/high16 v2, 0x40000000    # 2.0f

    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x40000000    # 2.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x400e147b    # 2.22f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x4007ae14    # 2.12f

    .line 426
    .line 427
    .line 428
    const v2, 0x408d70a4    # 4.42f

    .line 429
    .line 430
    .line 431
    const v4, 0x3ff1eb85    # 1.89f

    .line 432
    .line 433
    .line 434
    const v6, 0x40823d71    # 4.07f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x40147ae1    # -1.84f

    .line 441
    .line 442
    .line 443
    const v18, 0x40451eb8    # 3.08f

    .line 444
    .line 445
    .line 446
    const v13, -0x40733333    # -1.1f

    .line 447
    .line 448
    .line 449
    const v14, 0x3f170a3d    # 0.59f

    .line 450
    .line 451
    .line 452
    const v15, -0x40147ae1    # -1.84f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x41000000    # 8.0f

    .line 461
    .line 462
    const/high16 v18, 0x41b00000    # 22.0f

    .line 463
    .line 464
    const/high16 v13, 0x40900000    # 4.5f

    .line 465
    .line 466
    const v14, 0x41a370a4    # 20.43f

    .line 467
    .line 468
    .line 469
    const v15, 0x40c23d71    # 6.07f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x41b00000    # 22.0f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x405d70a4    # 3.46f

    .line 478
    .line 479
    .line 480
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 481
    .line 482
    const v13, 0x3fe147ae    # 1.76f

    .line 483
    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    const v15, 0x404e147b    # 3.22f

    .line 487
    .line 488
    .line 489
    const v16, -0x4059999a    # -1.3f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x40051eb8    # 2.08f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v18, 0x40400000    # 3.0f

    .line 502
    .line 503
    const v13, 0x3e75c28f    # 0.24f

    .line 504
    .line 505
    .line 506
    const v14, 0x3fd9999a    # 1.7f

    .line 507
    .line 508
    .line 509
    const v15, 0x3fd9999a    # 1.7f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x40400000    # 3.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x40600000    # 3.5f

    .line 518
    .line 519
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 520
    .line 521
    const v13, 0x3ff70a3d    # 1.93f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, 0x40600000    # 3.5f

    .line 526
    .line 527
    const v16, -0x40370a3d    # -1.57f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, -0x4068f5c3    # -1.18f

    .line 534
    .line 535
    .line 536
    const v18, -0x3fd8f5c3    # -2.61f

    .line 537
    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const v14, -0x407ae148    # -1.04f

    .line 541
    .line 542
    .line 543
    const v15, -0x41147ae1    # -0.46f

    .line 544
    .line 545
    .line 546
    const v16, -0x4003d70a    # -1.97f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41a80000    # 21.0f

    .line 553
    .line 554
    const/high16 v18, 0x41300000    # 11.0f

    .line 555
    .line 556
    const v13, 0x41a2f5c3    # 20.37f

    .line 557
    .line 558
    .line 559
    const v14, 0x4168a3d7    # 14.54f

    .line 560
    .line 561
    .line 562
    const/high16 v15, 0x41a80000    # 21.0f

    .line 563
    .line 564
    const v16, 0x414d70a4    # 12.84f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x41300000    # 11.0f

    .line 571
    .line 572
    const v2, 0x40ce147b    # 6.44f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v0, 0x41a00000    # 20.0f

    .line 582
    .line 583
    const/high16 v2, 0x41000000    # 8.0f

    .line 584
    .line 585
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v17, -0x40400000    # -1.5f

    .line 589
    .line 590
    const/high16 v18, -0x40400000    # -1.5f

    .line 591
    .line 592
    const v13, -0x40ab851f    # -0.83f

    .line 593
    .line 594
    .line 595
    const/4 v14, 0x0

    .line 596
    const/high16 v15, -0x40400000    # -1.5f

    .line 597
    .line 598
    const v16, -0x40d47ae1    # -0.67f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x40e570a4    # 7.17f

    .line 605
    .line 606
    .line 607
    const/high16 v2, 0x41880000    # 17.0f

    .line 608
    .line 609
    const/high16 v4, 0x41000000    # 8.0f

    .line 610
    .line 611
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x3f2b851f    # 0.67f

    .line 615
    .line 616
    .line 617
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 618
    .line 619
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x410d47ae    # 8.83f

    .line 623
    .line 624
    .line 625
    const/high16 v2, 0x41a00000    # 20.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x41a00000    # 20.0f

    .line 634
    .line 635
    const/high16 v2, 0x41880000    # 17.0f

    .line 636
    .line 637
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x41815c29    # 16.17f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x3f2b851f    # 0.67f

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 653
    .line 654
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x418ea3d7    # 17.83f

    .line 658
    .line 659
    .line 660
    const/high16 v2, 0x41a00000    # 20.0f

    .line 661
    .line 662
    const/high16 v4, 0x41880000    # 17.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x418deb85    # 17.74f

    .line 671
    .line 672
    .line 673
    const v2, 0x416a8f5c    # 14.66f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, -0x416b851f    # -0.29f

    .line 680
    .line 681
    .line 682
    const v2, 0x3ebd70a4    # 0.37f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, -0x4119999a    # -0.45f

    .line 689
    .line 690
    .line 691
    const v18, -0x430a3d71    # -0.03f

    .line 692
    .line 693
    .line 694
    const v13, -0x41f0a3d7    # -0.14f

    .line 695
    .line 696
    .line 697
    const v14, -0x435c28f6    # -0.02f

    .line 698
    .line 699
    .line 700
    const v15, -0x41666666    # -0.3f

    .line 701
    .line 702
    .line 703
    const v16, -0x430a3d71    # -0.03f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, -0x3fb5c28f    # -3.16f

    .line 710
    .line 711
    .line 712
    const/high16 v18, 0x40000000    # 2.0f

    .line 713
    .line 714
    const v13, -0x404e147b    # -1.39f

    .line 715
    .line 716
    .line 717
    const/4 v14, 0x0

    .line 718
    const v15, -0x3fd9999a    # -2.6f

    .line 719
    .line 720
    .line 721
    const v16, 0x3f51eb85    # 0.82f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, -0x3fd47ae1    # -2.68f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, -0x3fd47ae1    # -2.68f

    .line 734
    .line 735
    .line 736
    const v18, -0x4003d70a    # -1.97f

    .line 737
    .line 738
    .line 739
    const/high16 v13, -0x41000000    # -0.5f

    .line 740
    .line 741
    const v14, -0x407ae148    # -1.04f

    .line 742
    .line 743
    .line 744
    const/high16 v15, -0x40400000    # -1.5f

    .line 745
    .line 746
    const v16, -0x4019999a    # -1.8f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, -0x411eb852    # -0.44f

    .line 753
    .line 754
    .line 755
    const v2, -0x40d47ae1    # -0.67f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x40d47ae1    # -0.67f

    .line 762
    .line 763
    .line 764
    const v18, -0x4051eb85    # -1.36f

    .line 765
    .line 766
    .line 767
    const v13, -0x42333333    # -0.1f

    .line 768
    .line 769
    .line 770
    const v14, -0x41d1eb85    # -0.17f

    .line 771
    .line 772
    .line 773
    const v15, -0x4151eb85    # -0.34f

    .line 774
    .line 775
    .line 776
    const v16, -0x40cf5c29    # -0.69f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x4134a3d7    # 11.29f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v17, -0x40947ae1    # -0.92f

    .line 789
    .line 790
    .line 791
    const v18, 0x3fd47ae1    # 1.66f

    .line 792
    .line 793
    .line 794
    const v13, -0x41a8f5c3    # -0.21f

    .line 795
    .line 796
    .line 797
    const v14, 0x3f170a3d    # 0.59f

    .line 798
    .line 799
    .line 800
    const v15, -0x40fae148    # -0.52f

    .line 801
    .line 802
    .line 803
    const v16, 0x3f933333    # 1.15f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    const/16 v16, 0x3800

    .line 817
    .line 818
    const/16 v17, 0x0

    .line 819
    .line 820
    const/high16 v6, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/high16 v8, 0x3f800000    # 1.0f

    .line 823
    .line 824
    const/4 v7, 0x0

    .line 825
    const/high16 v12, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/4 v13, 0x0

    .line 828
    const/4 v14, 0x0

    .line 829
    const/4 v15, 0x0

    .line 830
    const-string v4, ""

    .line 831
    .line 832
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    sput-object v0, Landroidx/compose/material/icons/twotone/ChildFriendlyKt;->_childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 841
    .line 842
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    return-object v0
.end method
