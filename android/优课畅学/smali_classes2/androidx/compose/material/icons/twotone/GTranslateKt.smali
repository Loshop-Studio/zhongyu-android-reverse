.class public final Landroidx/compose/material/icons/twotone/GTranslateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGTranslate(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GTranslateKt;->_gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.GTranslate"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3eee147b    # -9.12f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x41200000    # 10.0f

    .line 84
    .line 85
    const/high16 v2, 0x40000000    # 2.0f

    .line 86
    .line 87
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x40800000    # 4.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, -0x40000000    # -2.0f

    .line 96
    .line 97
    const/high16 v18, 0x40000000    # 2.0f

    .line 98
    .line 99
    const v13, -0x40733333    # -1.1f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/high16 v15, -0x40000000    # -2.0f

    .line 104
    .line 105
    const v16, 0x3f666666    # 0.9f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x41500000    # 13.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x40000000    # 2.0f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, 0x3f8ccccd    # 1.1f

    .line 120
    .line 121
    .line 122
    const v15, 0x3f666666    # 0.9f

    .line 123
    .line 124
    .line 125
    const/high16 v16, 0x40000000    # 2.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v2, 0x40400000    # 3.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x41000000    # 8.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v18, -0x40000000    # -2.0f

    .line 148
    .line 149
    const v13, 0x3f8ccccd    # 1.1f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const/high16 v15, 0x40000000    # 2.0f

    .line 154
    .line 155
    const v16, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41b00000    # 22.0f

    .line 162
    .line 163
    const/high16 v2, 0x40e00000    # 7.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x40000000    # -2.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x40733333    # -1.1f

    .line 172
    .line 173
    .line 174
    const v15, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40e570a4    # 7.17f

    .line 186
    .line 187
    .line 188
    const v2, 0x416970a4    # 14.59f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x3f7d1eb8    # -4.09f

    .line 195
    .line 196
    .line 197
    const v18, -0x3f7d1eb8    # -4.09f

    .line 198
    .line 199
    .line 200
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, -0x3f7d1eb8    # -4.09f

    .line 204
    .line 205
    .line 206
    const v16, -0x4015c28f    # -1.83f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3fea3d71    # 1.83f

    .line 213
    .line 214
    .line 215
    const v2, 0x4082e148    # 4.09f

    .line 216
    .line 217
    .line 218
    const v4, -0x3f7d1eb8    # -4.09f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x402f5c29    # 2.74f

    .line 225
    .line 226
    .line 227
    const v18, 0x3f88f5c3    # 1.07f

    .line 228
    .line 229
    .line 230
    const v13, 0x3f851eb8    # 1.04f

    .line 231
    .line 232
    .line 233
    const v15, 0x3ffeb852    # 1.99f

    .line 234
    .line 235
    .line 236
    const v16, 0x3ebd70a4    # 0.37f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x3d75c28f    # 0.06f

    .line 243
    .line 244
    .line 245
    const v2, 0x3d8f5c29    # 0.07f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x40628f5c    # -1.23f

    .line 252
    .line 253
    .line 254
    const v2, 0x3f970a3d    # 1.18f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x428a3d71    # -0.06f

    .line 261
    .line 262
    .line 263
    const v2, -0x42b33333    # -0.05f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x403d70a4    # -1.52f

    .line 270
    .line 271
    .line 272
    const v18, -0x40e8f5c3    # -0.59f

    .line 273
    .line 274
    .line 275
    const v13, -0x416b851f    # -0.29f

    .line 276
    .line 277
    .line 278
    const v14, -0x4175c28f    # -0.27f

    .line 279
    .line 280
    .line 281
    const v15, -0x40b851ec    # -0.78f

    .line 282
    .line 283
    .line 284
    const v16, -0x40e8f5c3    # -0.59f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x3fe7ae14    # -2.38f

    .line 291
    .line 292
    .line 293
    const v18, 0x401ae148    # 2.42f

    .line 294
    .line 295
    .line 296
    const v13, -0x405851ec    # -1.31f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const v15, -0x3fe7ae14    # -2.38f

    .line 301
    .line 302
    .line 303
    const v16, 0x3f8b851f    # 1.09f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x401851ec    # 2.38f

    .line 310
    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, 0x3faa3d71    # 1.33f

    .line 314
    .line 315
    .line 316
    const v15, 0x3f88f5c3    # 1.07f

    .line 317
    .line 318
    .line 319
    const v16, 0x401ae148    # 2.42f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x4007ae14    # 2.12f

    .line 326
    .line 327
    .line 328
    const v18, -0x40451eb8    # -1.46f

    .line 329
    .line 330
    .line 331
    const v13, 0x3faf5c29    # 1.37f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const v15, 0x3ffae148    # 1.96f

    .line 336
    .line 337
    .line 338
    const v16, -0x40a147ae    # -0.87f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x41375c29    # 11.46f

    .line 345
    .line 346
    .line 347
    const v2, 0x40e28f5c    # 7.08f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x411e8f5c    # 9.91f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x407ccccd    # 3.95f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3c23d70a    # 0.01f

    .line 366
    .line 367
    .line 368
    const v2, 0x3d8f5c29    # 0.07f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x3d4ccccd    # 0.05f

    .line 375
    .line 376
    .line 377
    const v18, 0x3f1c28f6    # 0.61f

    .line 378
    .line 379
    .line 380
    const v13, 0x3d23d70a    # 0.04f

    .line 381
    .line 382
    .line 383
    const v14, 0x3e570a3d    # 0.21f

    .line 384
    .line 385
    .line 386
    const v15, 0x3d4ccccd    # 0.05f

    .line 387
    .line 388
    .line 389
    const v16, 0x3ecccccd    # 0.4f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x3f851eb8    # -3.92f

    .line 396
    .line 397
    .line 398
    const/high16 v18, 0x40800000    # 4.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v14, 0x40166666    # 2.35f

    .line 402
    .line 403
    .line 404
    const v15, -0x4031eb85    # -1.61f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x40800000    # 4.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x414ab852    # 12.67f

    .line 416
    .line 417
    .line 418
    const v2, 0x413147ae    # 11.08f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x407f5c29    # 3.99f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, -0x403851ec    # -1.56f

    .line 431
    .line 432
    .line 433
    const v2, 0x402f5c29    # 2.74f

    .line 434
    .line 435
    .line 436
    const v4, -0x4151eb85    # -0.34f

    .line 437
    .line 438
    .line 439
    const v6, 0x3fa7ae14    # 1.31f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x406f5c29    # -1.13f

    .line 446
    .line 447
    .line 448
    const v18, -0x40266666    # -1.7f

    .line 449
    .line 450
    .line 451
    const v13, -0x40fae148    # -0.52f

    .line 452
    .line 453
    .line 454
    const v14, -0x40e147ae    # -0.62f

    .line 455
    .line 456
    .line 457
    const v15, -0x409c28f6    # -0.89f

    .line 458
    .line 459
    .line 460
    const v16, -0x40628f5c    # -1.23f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, -0x40828f5c    # -0.99f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x416147ae    # -0.31f

    .line 473
    .line 474
    .line 475
    const v2, -0x407ae148    # -1.04f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x41663d71    # 14.39f

    .line 485
    .line 486
    .line 487
    const v2, 0x416947ae    # 14.58f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, -0x40f5c28f    # -0.54f

    .line 494
    .line 495
    .line 496
    const v2, 0x3f07ae14    # 0.53f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, -0x40d9999a    # -0.65f

    .line 503
    .line 504
    .line 505
    const v2, -0x3ff147ae    # -2.23f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x3f9851ec    # 1.19f

    .line 512
    .line 513
    .line 514
    const v18, 0x3fd9999a    # 1.7f

    .line 515
    .line 516
    .line 517
    const v13, 0x3ea8f5c3    # 0.33f

    .line 518
    .line 519
    .line 520
    const v14, 0x3f19999a    # 0.6f

    .line 521
    .line 522
    .line 523
    const v15, 0x3f3d70a4    # 0.74f

    .line 524
    .line 525
    .line 526
    const v16, 0x3f970a3d    # 1.18f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41a80000    # 21.0f

    .line 536
    .line 537
    const/high16 v2, 0x41a00000    # 20.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x40800000    # -1.0f

    .line 543
    .line 544
    const/high16 v18, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const v14, 0x3f0ccccd    # 0.55f

    .line 548
    .line 549
    .line 550
    const v15, -0x4119999a    # -0.45f

    .line 551
    .line 552
    .line 553
    const/high16 v16, 0x3f800000    # 1.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x3f200000    # -7.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, -0x40000000    # -2.0f

    .line 564
    .line 565
    const/high16 v2, 0x40000000    # 2.0f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x40b0a3d7    # -0.81f

    .line 571
    .line 572
    .line 573
    const v2, -0x3fceb852    # -2.77f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x3f6b851f    # 0.92f

    .line 580
    .line 581
    .line 582
    const v2, -0x40947ae1    # -0.92f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x418e51ec    # 17.79f

    .line 589
    .line 590
    .line 591
    const/high16 v2, 0x41900000    # 18.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x3f3ae148    # 0.73f

    .line 597
    .line 598
    .line 599
    const v2, -0x40c51eb8    # -0.73f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x3fd28f5c    # -2.71f

    .line 606
    .line 607
    .line 608
    const v2, -0x3fd47ae1    # -2.68f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, 0x3ff5c28f    # 1.92f

    .line 615
    .line 616
    .line 617
    const v18, -0x3f9f5c29    # -3.51f

    .line 618
    .line 619
    .line 620
    const v13, 0x3f666666    # 0.9f

    .line 621
    .line 622
    .line 623
    const v14, -0x407c28f6    # -1.03f

    .line 624
    .line 625
    .line 626
    const v15, 0x3fcccccd    # 1.6f

    .line 627
    .line 628
    .line 629
    const/high16 v16, -0x3ff00000    # -2.25f

    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x41980000    # 19.0f

    .line 635
    .line 636
    const v2, 0x413147ae    # 11.08f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, -0x407ae148    # -1.04f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, -0x3f970a3d    # -3.64f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x4175c28f    # 15.36f

    .line 655
    .line 656
    .line 657
    const/high16 v2, 0x41100000    # 9.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x407ae148    # -1.04f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x3f851eb8    # 1.04f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x40051eb8    # -1.96f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, 0x4132e148    # 11.18f

    .line 681
    .line 682
    .line 683
    const/high16 v2, 0x40c00000    # 6.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x40c00000    # 6.0f

    .line 689
    .line 690
    const/high16 v2, 0x41a00000    # 20.0f

    .line 691
    .line 692
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v17, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/high16 v18, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const v13, 0x3f0ccccd    # 0.55f

    .line 700
    .line 701
    .line 702
    const/4 v14, 0x0

    .line 703
    const/high16 v15, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const v16, 0x3ee66666    # 0.45f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, 0x41500000    # 13.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    const/16 v16, 0x3800

    .line 724
    .line 725
    const/16 v17, 0x0

    .line 726
    .line 727
    const/high16 v6, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v8, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v7, 0x0

    .line 732
    const/high16 v9, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v12, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v13, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const-string v4, ""

    .line 739
    .line 740
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    sput-object v0, Landroidx/compose/material/icons/twotone/GTranslateKt;->_gTranslate:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v0
.end method
