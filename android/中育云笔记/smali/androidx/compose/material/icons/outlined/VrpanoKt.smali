.class public final Landroidx/compose/material/icons/outlined/VrpanoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVrpano(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Vrpano"

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
    const v4, 0x41a8147b    # 21.01f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x41400000    # 12.0f

    .line 79
    .line 80
    const/high16 v26, 0x40b00000    # 5.5f

    .line 81
    .line 82
    const v21, 0x41a3999a    # 20.45f

    .line 83
    .line 84
    .line 85
    const/high16 v22, 0x40800000    # 4.0f

    .line 86
    .line 87
    const v23, 0x418b3333    # 17.4f

    .line 88
    .line 89
    .line 90
    const/high16 v24, 0x40b00000    # 5.5f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v25, -0x3eefd70a    # -9.01f

    .line 98
    .line 99
    .line 100
    const v26, -0x404147ae    # -1.49f

    .line 101
    .line 102
    .line 103
    const v21, -0x3f56147b    # -5.31f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const v23, -0x3ef828f6    # -8.49f

    .line 109
    .line 110
    .line 111
    const v24, -0x404147ae    # -1.49f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v26, 0x40a0a3d7    # 5.02f

    .line 120
    .line 121
    .line 122
    const v21, 0x401d70a4    # 2.46f

    .line 123
    .line 124
    .line 125
    const v22, 0x408051ec    # 4.01f

    .line 126
    .line 127
    .line 128
    const/high16 v23, 0x40000000    # 2.0f

    .line 129
    .line 130
    const v24, 0x408e6666    # 4.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41980000    # 19.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v25, 0x3f7d70a4    # 0.99f

    .line 142
    .line 143
    .line 144
    const/high16 v26, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/16 v21, 0x0

    .line 147
    .line 148
    const v22, 0x3f11eb85    # 0.57f

    .line 149
    .line 150
    .line 151
    const v23, 0x3eeb851f    # 0.46f

    .line 152
    .line 153
    .line 154
    const/high16 v24, 0x3f800000    # 1.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x411028f6    # 9.01f

    .line 160
    .line 161
    .line 162
    const/high16 v26, -0x40400000    # -1.5f

    .line 163
    .line 164
    const v21, 0x3f11eb85    # 0.57f

    .line 165
    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const v23, 0x40633333    # 3.55f

    .line 170
    .line 171
    .line 172
    const/high16 v24, -0x40400000    # -1.5f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 178
    .line 179
    const v21, 0x40ad70a4    # 5.42f

    .line 180
    .line 181
    .line 182
    const v23, 0x41070a3d    # 8.44f

    .line 183
    .line 184
    .line 185
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, 0x3f7d70a4    # 0.99f

    .line 191
    .line 192
    .line 193
    const/high16 v26, -0x40800000    # -1.0f

    .line 194
    .line 195
    const v21, 0x3f07ae14    # 0.53f

    .line 196
    .line 197
    .line 198
    const v23, 0x3f7d70a4    # 0.99f

    .line 199
    .line 200
    .line 201
    const v24, -0x4123d70a    # -0.43f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x40a00000    # 5.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, 0x41a8147b    # 21.01f

    .line 213
    .line 214
    .line 215
    const/high16 v26, 0x40800000    # 4.0f

    .line 216
    .line 217
    const/high16 v21, 0x41b00000    # 22.0f

    .line 218
    .line 219
    const v22, 0x408dc28f    # 4.43f

    .line 220
    .line 221
    .line 222
    const v23, 0x41ac51ec    # 21.54f

    .line 223
    .line 224
    .line 225
    const/high16 v24, 0x40800000    # 4.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41a00000    # 20.0f

    .line 234
    .line 235
    const v6, 0x418d0a3d    # 17.63f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, -0x3f000000    # -8.0f

    .line 242
    .line 243
    const v26, -0x406f5c29    # -1.13f

    .line 244
    .line 245
    .line 246
    const v21, -0x3fff5c29    # -2.01f

    .line 247
    .line 248
    .line 249
    const v22, -0x40e8f5c3    # -0.59f

    .line 250
    .line 251
    .line 252
    const v23, -0x3f6c28f6    # -4.62f

    .line 253
    .line 254
    .line 255
    const v24, -0x406f5c29    # -1.13f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v26, 0x3f90a3d7    # 1.13f

    .line 262
    .line 263
    .line 264
    const v21, -0x3fa70a3d    # -3.39f

    .line 265
    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const v23, -0x3f4051ec    # -5.99f

    .line 270
    .line 271
    .line 272
    const v24, 0x3f0a3d71    # 0.54f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x40cc28f6    # 6.38f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v25, 0x41400000    # 12.0f

    .line 285
    .line 286
    const/high16 v26, 0x40f00000    # 7.5f

    .line 287
    .line 288
    const v21, 0x40d28f5c    # 6.58f

    .line 289
    .line 290
    .line 291
    const v22, 0x40e3851f    # 7.11f

    .line 292
    .line 293
    .line 294
    const v23, 0x41151eb8    # 9.32f

    .line 295
    .line 296
    .line 297
    const/high16 v24, 0x40f00000    # 7.5f

    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v25, 0x41000000    # 8.0f

    .line 303
    .line 304
    const v26, -0x406f5c29    # -1.13f

    .line 305
    .line 306
    .line 307
    const v21, 0x405851ec    # 3.38f

    .line 308
    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const v23, 0x40bfae14    # 5.99f

    .line 313
    .line 314
    .line 315
    const v24, -0x40f5c28f    # -0.54f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x418d0a3d    # 17.63f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    const/16 v16, 0x3800

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const/high16 v6, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v8, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const/high16 v9, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v12, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const/4 v14, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    const-string v4, ""

    .line 351
    .line 352
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 353
    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 360
    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    const/4 v0, 0x0

    .line 366
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    const v0, 0x412fd70a    # 10.99f

    .line 383
    .line 384
    .line 385
    const v2, 0x4112b852    # 9.17f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, -0x3f93d70a    # -3.69f

    .line 392
    .line 393
    .line 394
    const v2, 0x408d70a4    # 4.42f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x41400000    # 12.0f

    .line 401
    .line 402
    const/high16 v18, 0x41700000    # 15.0f

    .line 403
    .line 404
    const v13, 0x40ef5c29    # 7.48f

    .line 405
    .line 406
    .line 407
    const v14, 0x41726666    # 15.15f

    .line 408
    .line 409
    .line 410
    const v15, 0x411a8f5c    # 9.66f

    .line 411
    .line 412
    .line 413
    const/high16 v16, 0x41700000    # 15.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x40d051ec    # 6.51f

    .line 419
    .line 420
    .line 421
    const v18, 0x3ecccccd    # 0.4f

    .line 422
    .line 423
    .line 424
    const v13, 0x40133333    # 2.3f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const v15, 0x4090a3d7    # 4.52f

    .line 429
    .line 430
    .line 431
    const v16, 0x3e19999a    # 0.15f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41600000    # 14.0f

    .line 438
    .line 439
    const/high16 v2, 0x41200000    # 10.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x3fcae148    # -2.83f

    .line 445
    .line 446
    .line 447
    const v2, 0x4058f5c3    # 3.39f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x412fd70a    # 10.99f

    .line 454
    .line 455
    .line 456
    const v2, 0x4112b852    # 9.17f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const/4 v15, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    sput-object v0, Landroidx/compose/material/icons/outlined/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    return-object v0
.end method
