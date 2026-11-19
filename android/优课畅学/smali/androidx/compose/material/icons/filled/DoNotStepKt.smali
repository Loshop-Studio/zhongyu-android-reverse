.class public final Landroidx/compose/material/icons/filled/DoNotStepKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotStep(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DoNotStep"

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
    const v0, 0x40870a3d    # 4.22f

    .line 71
    .line 72
    .line 73
    const v2, 0x3fb1eb85    # 1.39f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40fccccd    # 7.9f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x43dc28f6    # -0.01f

    .line 86
    .line 87
    .line 88
    const v18, 0x3f333333    # 0.7f

    .line 89
    .line 90
    .line 91
    const v13, 0x3e3851ec    # 0.18f

    .line 92
    .line 93
    .line 94
    const v14, 0x3e4ccccd    # 0.2f

    .line 95
    .line 96
    .line 97
    const v15, 0x3e3851ec    # 0.18f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x3f000000    # 0.5f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, -0x414ccccd    # -0.35f

    .line 106
    .line 107
    .line 108
    const v18, 0x3e19999a    # 0.15f

    .line 109
    .line 110
    .line 111
    const v13, -0x42333333    # -0.1f

    .line 112
    .line 113
    .line 114
    const v14, 0x3dcccccd    # 0.1f

    .line 115
    .line 116
    .line 117
    const v15, -0x41947ae1    # -0.23f

    .line 118
    .line 119
    .line 120
    const v16, 0x3e19999a    # 0.15f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x41e66666    # -0.15f

    .line 127
    .line 128
    .line 129
    const v2, -0x414ccccd    # -0.35f

    .line 130
    .line 131
    .line 132
    const v4, -0x42b33333    # -0.05f

    .line 133
    .line 134
    .line 135
    const v6, -0x417ae148    # -0.26f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x40dbd70a    # 6.87f

    .line 142
    .line 143
    .line 144
    const v2, 0x4131999a    # 11.1f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    const v18, 0x3f8f5c29    # 1.12f

    .line 154
    .line 155
    .line 156
    const v13, -0x421eb852    # -0.11f

    .line 157
    .line 158
    .line 159
    const v14, 0x3ecccccd    # 0.4f

    .line 160
    .line 161
    .line 162
    const v15, -0x417ae148    # -0.26f

    .line 163
    .line 164
    .line 165
    const v16, 0x3f47ae14    # 0.78f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x3fb33333    # 1.4f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const v18, 0x3f35c28f    # 0.71f

    .line 180
    .line 181
    .line 182
    const v13, 0x3e4ccccd    # 0.2f

    .line 183
    .line 184
    .line 185
    const v14, 0x3e4ccccd    # 0.2f

    .line 186
    .line 187
    .line 188
    const v15, 0x3e4ccccd    # 0.2f

    .line 189
    .line 190
    .line 191
    const v16, 0x3f028f5c    # 0.51f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x414ccccd    # -0.35f

    .line 198
    .line 199
    .line 200
    const v18, 0x3e19999a    # 0.15f

    .line 201
    .line 202
    .line 203
    const v13, -0x42333333    # -0.1f

    .line 204
    .line 205
    .line 206
    const v14, 0x3dcccccd    # 0.1f

    .line 207
    .line 208
    .line 209
    const v15, -0x41947ae1    # -0.23f

    .line 210
    .line 211
    .line 212
    const v16, 0x3e19999a    # 0.15f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, -0x41e66666    # -0.15f

    .line 219
    .line 220
    .line 221
    const v2, -0x414ccccd    # -0.35f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, -0x405d70a4    # -1.27f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x40bae148    # -0.77f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f4ccccd    # 0.8f

    .line 237
    .line 238
    .line 239
    const v13, -0x418a3d71    # -0.24f

    .line 240
    .line 241
    .line 242
    const v14, 0x3e947ae1    # 0.29f

    .line 243
    .line 244
    .line 245
    const/high16 v15, -0x41000000    # -0.5f

    .line 246
    .line 247
    const v16, 0x3f0f5c29    # 0.56f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3fa3d70a    # 1.28f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    const v18, 0x3f35c28f    # 0.71f

    .line 262
    .line 263
    .line 264
    const v13, 0x3e4ccccd    # 0.2f

    .line 265
    .line 266
    .line 267
    const v14, 0x3e4ccccd    # 0.2f

    .line 268
    .line 269
    .line 270
    const v15, 0x3e4ccccd    # 0.2f

    .line 271
    .line 272
    .line 273
    const v16, 0x3f028f5c    # 0.51f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x40c00000    # 6.0f

    .line 280
    .line 281
    const/high16 v18, 0x41800000    # 16.0f

    .line 282
    .line 283
    const v13, 0x40c851ec    # 6.26f

    .line 284
    .line 285
    .line 286
    const v14, 0x417f3333    # 15.95f

    .line 287
    .line 288
    .line 289
    const v15, 0x40c428f6    # 6.13f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x41800000    # 16.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x41e66666    # -0.15f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, -0x404f5c29    # -1.38f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x4003d70a    # -1.97f

    .line 310
    .line 311
    .line 312
    const v18, 0x3f828f5c    # 1.02f

    .line 313
    .line 314
    .line 315
    const v13, -0x40cf5c29    # -0.69f

    .line 316
    .line 317
    .line 318
    const v14, 0x3eeb851f    # 0.46f

    .line 319
    .line 320
    .line 321
    const v15, -0x404e147b    # -1.39f

    .line 322
    .line 323
    .line 324
    const v16, 0x3f4a3d71    # 0.79f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const v18, 0x418af5c3    # 17.37f

    .line 333
    .line 334
    .line 335
    const v13, 0x3fc28f5c    # 1.52f

    .line 336
    .line 337
    .line 338
    const v14, 0x417ccccd    # 15.8f

    .line 339
    .line 340
    .line 341
    const/high16 v15, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v16, 0x41843d71    # 16.53f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41a00000    # 20.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41180000    # 9.5f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x40551eb8    # 3.33f

    .line 360
    .line 361
    .line 362
    const v2, -0x3faae148    # -3.33f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x40be147b    # 5.94f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x3fb47ae1    # 1.41f

    .line 375
    .line 376
    .line 377
    const v2, -0x404b851f    # -1.41f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x4033d70a    # 2.81f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40870a3d    # 4.22f

    .line 390
    .line 391
    .line 392
    const v2, 0x3fb1eb85    # 1.39f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x417ae148    # 15.68f

    .line 402
    .line 403
    .line 404
    const v2, 0x4194147b    # 18.51f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x404b851f    # -1.41f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, -0x3f70a3d7    # -4.48f

    .line 417
    .line 418
    .line 419
    const v2, 0x408f5c29    # 4.48f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41b80000    # 23.0f

    .line 426
    .line 427
    const v2, 0x41333333    # 11.2f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x417ae148    # 15.68f

    .line 434
    .line 435
    .line 436
    const v2, 0x4194147b    # 18.51f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x411147ae    # 9.08f

    .line 446
    .line 447
    .line 448
    const v2, 0x41a70a3d    # 20.88f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x3f70a3d7    # -4.48f

    .line 455
    .line 456
    .line 457
    const v2, 0x408f5c29    # 4.48f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x4114cccd    # 9.3f

    .line 464
    .line 465
    .line 466
    const v2, 0x40cf0a3d    # 6.47f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x415ccccd    # 13.8f

    .line 473
    .line 474
    .line 475
    const/high16 v2, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x411147ae    # 9.08f

    .line 481
    .line 482
    .line 483
    const v2, 0x41a70a3d    # 20.88f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    const/16 v16, 0x3800

    .line 497
    .line 498
    const/16 v17, 0x0

    .line 499
    .line 500
    const/high16 v6, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/high16 v8, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    const/high16 v9, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/high16 v12, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const/4 v13, 0x0

    .line 510
    const/4 v14, 0x0

    .line 511
    const/4 v15, 0x0

    .line 512
    const-string v4, ""

    .line 513
    .line 514
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    sput-object v0, Landroidx/compose/material/icons/filled/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 523
    .line 524
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    return-object v0
.end method
