.class public final Landroidx/compose/material/icons/rounded/BrowseGalleryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrowseGallery(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BrowseGalleryKt;->_browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BrowseGallery"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 78
    .line 79
    const/high16 v26, 0x41100000    # 9.0f

    .line 80
    .line 81
    const v21, -0x3f60f5c3    # -4.97f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 87
    .line 88
    const v24, 0x4080f5c3    # 4.03f

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
    const v4, 0x4080f5c3    # 4.03f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, -0x3f7f0a3d    # -4.03f

    .line 103
    .line 104
    .line 105
    const/high16 v6, -0x3ef00000    # -9.0f

    .line 106
    .line 107
    const/high16 v7, 0x41100000    # 9.0f

    .line 108
    .line 109
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x415f851f    # 13.97f

    .line 113
    .line 114
    .line 115
    const/high16 v6, 0x40400000    # 3.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x413170a4    # 11.09f

    .line 124
    .line 125
    .line 126
    const/high16 v6, 0x41780000    # 15.5f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x410970a4    # 8.59f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x41500000    # 13.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x41000000    # 8.0f

    .line 140
    .line 141
    const v26, 0x413970a4    # 11.59f

    .line 142
    .line 143
    .line 144
    const v21, 0x41035c29    # 8.21f

    .line 145
    .line 146
    .line 147
    const v22, 0x4149eb85    # 12.62f

    .line 148
    .line 149
    .line 150
    const/high16 v23, 0x41000000    # 8.0f

    .line 151
    .line 152
    const v24, 0x4141eb85    # 12.12f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41000000    # 8.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/high16 v26, -0x40800000    # -1.0f

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const v22, -0x40f33333    # -0.55f

    .line 170
    .line 171
    .line 172
    const v23, 0x3ee66666    # 0.45f

    .line 173
    .line 174
    .line 175
    const/high16 v24, -0x40800000    # -1.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v26, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const v21, 0x3f0ccccd    # 0.55f

    .line 187
    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const/high16 v23, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const v24, 0x3ee66666    # 0.45f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x4065c28f    # 3.59f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x40200000    # 2.5f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/16 v25, 0x0

    .line 211
    .line 212
    const v26, 0x3fb47ae1    # 1.41f

    .line 213
    .line 214
    .line 215
    const v21, 0x3ec7ae14    # 0.39f

    .line 216
    .line 217
    .line 218
    const v22, 0x3ec7ae14    # 0.39f

    .line 219
    .line 220
    .line 221
    const v23, 0x3ec7ae14    # 0.39f

    .line 222
    .line 223
    .line 224
    const v24, 0x3f828f5c    # 1.02f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x413170a4    # 11.09f

    .line 235
    .line 236
    .line 237
    const/high16 v26, 0x41780000    # 15.5f

    .line 238
    .line 239
    const v21, 0x4141c28f    # 12.11f

    .line 240
    .line 241
    .line 242
    const v22, 0x417e3d71    # 15.89f

    .line 243
    .line 244
    .line 245
    const v23, 0x4137ae14    # 11.48f

    .line 246
    .line 247
    .line 248
    const v24, 0x417e3d71    # 15.89f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const/16 v16, 0x3800

    .line 262
    .line 263
    const/16 v17, 0x0

    .line 264
    .line 265
    const/high16 v6, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/high16 v8, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/4 v7, 0x0

    .line 270
    const/high16 v9, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/high16 v12, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const/4 v14, 0x0

    .line 276
    const/4 v15, 0x0

    .line 277
    const-string v4, ""

    .line 278
    .line 279
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 280
    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 287
    .line 288
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 289
    .line 290
    .line 291
    move-result-wide v6

    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    const v0, 0x40a28f5c    # 5.08f

    .line 310
    .line 311
    .line 312
    const v2, 0x418feb85    # 17.99f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3f07ae14    # 0.53f

    .line 322
    .line 323
    .line 324
    const v18, 0x3f6147ae    # 0.88f

    .line 325
    .line 326
    .line 327
    const v14, 0x3ebd70a4    # 0.37f

    .line 328
    .line 329
    .line 330
    const v15, 0x3e570a3d    # 0.21f

    .line 331
    .line 332
    .line 333
    const v16, 0x3f30a3d7    # 0.69f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x41b00000    # 22.0f

    .line 340
    .line 341
    const/high16 v18, 0x41400000    # 12.0f

    .line 342
    .line 343
    const v13, 0x41a4cccd    # 20.6f

    .line 344
    .line 345
    .line 346
    const v14, 0x40e570a4    # 7.17f

    .line 347
    .line 348
    .line 349
    const/high16 v15, 0x41b00000    # 22.0f

    .line 350
    .line 351
    const v16, 0x4116b852    # 9.42f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x3fa147ae    # -3.48f

    .line 358
    .line 359
    .line 360
    const v18, 0x40c147ae    # 6.04f

    .line 361
    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x40251eb8    # 2.58f

    .line 365
    .line 366
    .line 367
    const v15, -0x404ccccd    # -1.4f

    .line 368
    .line 369
    .line 370
    const v16, 0x409a8f5c    # 4.83f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x40f851ec    # -0.53f

    .line 377
    .line 378
    .line 379
    const v18, 0x3f6147ae    # 0.88f

    .line 380
    .line 381
    .line 382
    const v13, -0x415c28f6    # -0.32f

    .line 383
    .line 384
    .line 385
    const v14, 0x3e428f5c    # 0.19f

    .line 386
    .line 387
    .line 388
    const v15, -0x40f851ec    # -0.53f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f028f5c    # 0.51f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/4 v0, 0x0

    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3fc147ae    # 1.51f

    .line 402
    .line 403
    .line 404
    const v18, 0x3f5c28f6    # 0.86f

    .line 405
    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, 0x3f451eb8    # 0.77f

    .line 409
    .line 410
    .line 411
    const v15, 0x3f570a3d    # 0.84f

    .line 412
    .line 413
    .line 414
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, 0x41c00000    # 24.0f

    .line 420
    .line 421
    const/high16 v18, 0x41400000    # 12.0f

    .line 422
    .line 423
    const v13, 0x41b170a4    # 22.18f

    .line 424
    .line 425
    .line 426
    const v14, 0x4191c28f    # 18.22f

    .line 427
    .line 428
    .line 429
    const/high16 v15, 0x41c00000    # 24.0f

    .line 430
    .line 431
    const v16, 0x41751eb8    # 15.32f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, -0x3f700000    # -4.5f

    .line 438
    .line 439
    const v18, -0x3f070a3d    # -7.78f

    .line 440
    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, -0x3fab851f    # -3.32f

    .line 444
    .line 445
    .line 446
    const v15, -0x40170a3d    # -1.82f

    .line 447
    .line 448
    .line 449
    const v16, -0x3f38f5c3    # -6.22f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x418feb85    # 17.99f

    .line 456
    .line 457
    .line 458
    const v18, 0x40a28f5c    # 5.08f

    .line 459
    .line 460
    .line 461
    const v13, 0x4196a3d7    # 18.83f

    .line 462
    .line 463
    .line 464
    const v14, 0x40751eb8    # 3.83f

    .line 465
    .line 466
    .line 467
    const v15, 0x418feb85    # 17.99f

    .line 468
    .line 469
    .line 470
    const v16, 0x4089eb85    # 4.31f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const/16 v16, 0x3800

    .line 484
    .line 485
    const/16 v17, 0x0

    .line 486
    .line 487
    const/high16 v6, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/high16 v12, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    const/4 v15, 0x0

    .line 495
    const-string v4, ""

    .line 496
    .line 497
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    sput-object v0, Landroidx/compose/material/icons/rounded/BrowseGalleryKt;->_browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 506
    .line 507
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    return-object v0
.end method
