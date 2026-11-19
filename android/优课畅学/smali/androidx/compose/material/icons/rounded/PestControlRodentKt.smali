.class public final Landroidx/compose/material/icons/rounded/PestControlRodentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControlRodent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PestControlRodent"

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
    const v0, 0x41aa7ae1    # 21.31f

    .line 71
    .line 72
    .line 73
    const v2, 0x418b0a3d    # 17.38f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fe70a3d    # -2.39f

    .line 80
    .line 81
    .line 82
    const v2, -0x3ff7ae14    # -2.13f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41780000    # 15.5f

    .line 89
    .line 90
    const/high16 v18, 0x41300000    # 11.0f

    .line 91
    .line 92
    const v13, 0x419b851f    # 19.44f

    .line 93
    .line 94
    .line 95
    const v14, 0x414e3d71    # 12.89f

    .line 96
    .line 97
    .line 98
    const v15, 0x418c7ae1    # 17.56f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x41300000    # 11.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 107
    .line 108
    const/high16 v18, 0x40600000    # 3.5f

    .line 109
    .line 110
    const v13, -0x406b851f    # -1.16f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 115
    .line 116
    const v16, 0x3f666666    # 0.9f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x3f3d70a4    # 0.74f

    .line 123
    .line 124
    .line 125
    const v18, 0x4009999a    # 2.15f

    .line 126
    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, 0x3f4f5c29    # 0.81f

    .line 130
    .line 131
    .line 132
    const v15, 0x3e8a3d71    # 0.27f

    .line 133
    .line 134
    .line 135
    const v16, 0x3fc66666    # 1.55f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x42dc28f6    # -0.04f

    .line 142
    .line 143
    .line 144
    const v18, 0x3f28f5c3    # 0.66f

    .line 145
    .line 146
    .line 147
    const v13, 0x3e19999a    # 0.15f

    .line 148
    .line 149
    .line 150
    const v14, 0x3e4ccccd    # 0.2f

    .line 151
    .line 152
    .line 153
    const v15, 0x3e0f5c29    # 0.14f

    .line 154
    .line 155
    .line 156
    const v16, 0x3ef5c28f    # 0.48f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, -0x40c00000    # -0.75f

    .line 167
    .line 168
    const v18, -0x42dc28f6    # -0.04f

    .line 169
    .line 170
    .line 171
    const v13, -0x41a8f5c3    # -0.21f

    .line 172
    .line 173
    .line 174
    const v14, 0x3e570a3d    # 0.21f

    .line 175
    .line 176
    .line 177
    const v15, -0x40f0a3d7    # -0.56f

    .line 178
    .line 179
    .line 180
    const v16, 0x3e428f5c    # 0.19f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v17, 0x41300000    # 11.0f

    .line 187
    .line 188
    const/high16 v18, 0x41680000    # 14.5f

    .line 189
    .line 190
    const v13, 0x4135999a    # 11.35f

    .line 191
    .line 192
    .line 193
    const/high16 v14, 0x41840000    # 16.5f

    .line 194
    .line 195
    const/high16 v15, 0x41300000    # 11.0f

    .line 196
    .line 197
    const v16, 0x4178a3d7    # 15.54f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, 0x40166666    # 2.35f

    .line 204
    .line 205
    .line 206
    const v18, -0x3f847ae1    # -3.93f

    .line 207
    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const v14, -0x40266666    # -1.7f

    .line 211
    .line 212
    .line 213
    const v15, 0x3f75c28f    # 0.96f

    .line 214
    .line 215
    .line 216
    const v16, -0x3fb51eb8    # -3.17f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x3fee147b    # -2.28f

    .line 223
    .line 224
    .line 225
    const v18, -0x40ee147b    # -0.57f

    .line 226
    .line 227
    .line 228
    const v13, -0x40cccccd    # -0.7f

    .line 229
    .line 230
    .line 231
    const v14, -0x4147ae14    # -0.36f

    .line 232
    .line 233
    .line 234
    const v15, -0x40428f5c    # -1.48f

    .line 235
    .line 236
    .line 237
    const v16, -0x40ee147b    # -0.57f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x3f62e148    # -4.91f

    .line 244
    .line 245
    .line 246
    const v18, 0x4077ae14    # 3.87f

    .line 247
    .line 248
    .line 249
    const v13, -0x3fe7ae14    # -2.38f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const v15, -0x3f7428f6    # -4.37f

    .line 254
    .line 255
    .line 256
    const v16, 0x3fd33333    # 1.65f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, -0x3ff66666    # -2.15f

    .line 263
    .line 264
    .line 265
    const v18, -0x3fb70a3d    # -3.14f

    .line 266
    .line 267
    .line 268
    const v13, -0x4055c28f    # -1.33f

    .line 269
    .line 270
    .line 271
    const v14, -0x413851ec    # -0.39f

    .line 272
    .line 273
    .line 274
    const v15, -0x3fee147b    # -2.28f

    .line 275
    .line 276
    .line 277
    const v16, -0x402b851f    # -1.66f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x40e3851f    # 7.11f

    .line 284
    .line 285
    .line 286
    const/high16 v18, 0x41000000    # 8.0f

    .line 287
    .line 288
    const v13, 0x4084cccd    # 4.15f

    .line 289
    .line 290
    .line 291
    const v14, 0x41128f5c    # 9.16f

    .line 292
    .line 293
    .line 294
    const v15, 0x40b147ae    # 5.54f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x41000000    # 8.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40000000    # 2.0f

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x4037ae14    # 2.87f

    .line 309
    .line 310
    .line 311
    const/high16 v18, -0x3ff00000    # -2.25f

    .line 312
    .line 313
    const v13, 0x3fca3d71    # 1.58f

    .line 314
    .line 315
    .line 316
    const/4 v14, 0x0

    .line 317
    const/high16 v15, 0x40300000    # 2.75f

    .line 318
    .line 319
    const v16, -0x408ccccd    # -0.95f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x41180000    # 9.5f

    .line 326
    .line 327
    const/high16 v18, 0x40400000    # 3.0f

    .line 328
    .line 329
    const v13, 0x4142147b    # 12.13f

    .line 330
    .line 331
    .line 332
    const/high16 v14, 0x40880000    # 4.25f

    .line 333
    .line 334
    const v15, 0x412f5c29    # 10.96f

    .line 335
    .line 336
    .line 337
    const/high16 v16, 0x40400000    # 3.0f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x4100cccd    # 8.05f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, -0x407ae148    # -1.04f

    .line 349
    .line 350
    .line 351
    const v18, 0x3f547ae1    # 0.83f

    .line 352
    .line 353
    .line 354
    const/high16 v13, -0x41000000    # -0.5f

    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    const v15, -0x408a3d71    # -0.96f

    .line 358
    .line 359
    .line 360
    const v16, 0x3eae147b    # 0.34f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x41000000    # 8.0f

    .line 367
    .line 368
    const/high16 v18, 0x40a00000    # 5.0f

    .line 369
    .line 370
    const v13, 0x40dd1eb8    # 6.91f

    .line 371
    .line 372
    .line 373
    const v14, 0x408eb852    # 4.46f

    .line 374
    .line 375
    .line 376
    const v15, 0x40ec7ae1    # 7.39f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x40a00000    # 5.0f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x41200000    # 10.0f

    .line 390
    .line 391
    const/high16 v18, 0x40b00000    # 5.5f

    .line 392
    .line 393
    const v13, 0x411c7ae1    # 9.78f

    .line 394
    .line 395
    .line 396
    const/high16 v14, 0x40a00000    # 5.0f

    .line 397
    .line 398
    const/high16 v15, 0x41200000    # 10.0f

    .line 399
    .line 400
    const v16, 0x40a70a3d    # 5.22f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x41180000    # 9.5f

    .line 407
    .line 408
    const/high16 v18, 0x40c00000    # 6.0f

    .line 409
    .line 410
    const/high16 v13, 0x41200000    # 10.0f

    .line 411
    .line 412
    const v14, 0x40b8f5c3    # 5.78f

    .line 413
    .line 414
    .line 415
    const v15, 0x411c7ae1    # 9.78f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x40c00000    # 6.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x40e51eb8    # 7.16f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x40c00000    # 6.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, -0x3f5b3333    # -5.15f

    .line 432
    .line 433
    .line 434
    const v18, 0x40966666    # 4.7f

    .line 435
    .line 436
    .line 437
    const v13, -0x3fd51eb8    # -2.67f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const v15, -0x3f6051ec    # -4.99f

    .line 442
    .line 443
    .line 444
    const v16, 0x4001eb85    # 2.03f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x40c00000    # 6.0f

    .line 451
    .line 452
    const v18, 0x417e6666    # 15.9f

    .line 453
    .line 454
    .line 455
    const v13, 0x3fee147b    # 1.86f

    .line 456
    .line 457
    .line 458
    const/high16 v14, 0x41540000    # 13.25f

    .line 459
    .line 460
    const v15, 0x4067ae14    # 3.62f

    .line 461
    .line 462
    .line 463
    const v16, 0x4176b852    # 15.42f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3cf5c28f    # 0.03f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x41311eb8    # 11.07f

    .line 476
    .line 477
    .line 478
    const/high16 v18, 0x41a80000    # 21.0f

    .line 479
    .line 480
    const/high16 v13, 0x40c00000    # 6.0f

    .line 481
    .line 482
    const v14, 0x4195d70a    # 18.73f

    .line 483
    .line 484
    .line 485
    const v15, 0x410451ec    # 8.27f

    .line 486
    .line 487
    .line 488
    const/high16 v16, 0x41a80000    # 21.0f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x410dc28f    # 8.86f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x41aa7ae1    # 21.31f

    .line 500
    .line 501
    .line 502
    const v18, 0x418b0a3d    # 17.38f

    .line 503
    .line 504
    .line 505
    const v13, 0x41ae6666    # 21.8f

    .line 506
    .line 507
    .line 508
    const/high16 v14, 0x41a80000    # 21.0f

    .line 509
    .line 510
    const v15, 0x41b5eb85    # 22.74f

    .line 511
    .line 512
    .line 513
    const v16, 0x419547ae    # 18.66f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41900000    # 18.0f

    .line 523
    .line 524
    const/high16 v2, 0x41980000    # 19.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, -0x40800000    # -1.0f

    .line 530
    .line 531
    const/high16 v18, -0x40800000    # -1.0f

    .line 532
    .line 533
    const v13, -0x40f33333    # -0.55f

    .line 534
    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    const/high16 v15, -0x40800000    # -1.0f

    .line 538
    .line 539
    const v16, -0x4119999a    # -0.45f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, -0x40f33333    # -0.55f

    .line 549
    .line 550
    .line 551
    const v15, 0x3ee66666    # 0.45f

    .line 552
    .line 553
    .line 554
    const/high16 v16, -0x40800000    # -1.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3ee66666    # 0.45f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x3f800000    # 1.0f

    .line 563
    .line 564
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x41900000    # 18.0f

    .line 568
    .line 569
    const/high16 v18, 0x41980000    # 19.0f

    .line 570
    .line 571
    const/high16 v13, 0x41980000    # 19.0f

    .line 572
    .line 573
    const v14, 0x41946666    # 18.55f

    .line 574
    .line 575
    .line 576
    const v15, 0x41946666    # 18.55f

    .line 577
    .line 578
    .line 579
    const/high16 v16, 0x41980000    # 19.0f

    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const/high16 v9, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sput-object v0, Landroidx/compose/material/icons/rounded/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-object v0
.end method
