.class public final Landroidx/compose/material/icons/twotone/PsychologyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _psychology:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychology(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PsychologyKt;->_psychology:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Psychology"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f60f5c3    # -4.97f

    .line 78
    .line 79
    .line 80
    const v26, 0x409570a4    # 4.67f

    .line 81
    .line 82
    .line 83
    const v21, -0x3fd66666    # -2.65f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x3f66b852    # -4.79f

    .line 89
    .line 90
    .line 91
    const v24, 0x4003d70a    # 2.06f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v6, 0x40d66666    # 6.7f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41000000    # 8.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40400000    # 3.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x3f833333    # -3.95f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x3f63d70a    # 0.89f

    .line 135
    .line 136
    .line 137
    const v6, -0x4123d70a    # -0.43f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41900000    # 18.0f

    .line 144
    .line 145
    const/high16 v26, 0x41200000    # 10.0f

    .line 146
    .line 147
    const v21, 0x4185ae14    # 16.71f

    .line 148
    .line 149
    .line 150
    const v22, 0x415e147b    # 13.88f

    .line 151
    .line 152
    .line 153
    const/high16 v23, 0x41900000    # 18.0f

    .line 154
    .line 155
    const v24, 0x414170a4    # 12.09f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x41500000    # 13.0f

    .line 162
    .line 163
    const/high16 v26, 0x40a00000    # 5.0f

    .line 164
    .line 165
    const/high16 v21, 0x41900000    # 18.0f

    .line 166
    .line 167
    const v22, 0x40e7ae14    # 7.24f

    .line 168
    .line 169
    .line 170
    const v23, 0x417c28f6    # 15.76f

    .line 171
    .line 172
    .line 173
    const/high16 v24, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, 0x41868f5c    # 16.82f

    .line 182
    .line 183
    .line 184
    const v6, 0x410f3333    # 8.95f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, -0x40a66666    # -0.85f

    .line 191
    .line 192
    .line 193
    const v6, 0x3f28f5c3    # 0.66f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, 0x41800000    # 16.0f

    .line 200
    .line 201
    const/high16 v26, 0x41200000    # 10.0f

    .line 202
    .line 203
    const v21, 0x417fd70a    # 15.99f

    .line 204
    .line 205
    .line 206
    const v22, 0x411bae14    # 9.73f

    .line 207
    .line 208
    .line 209
    const/high16 v23, 0x41800000    # 16.0f

    .line 210
    .line 211
    const v24, 0x411dc28f    # 9.86f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, -0x435c28f6    # -0.02f

    .line 218
    .line 219
    .line 220
    const v26, 0x3ec7ae14    # 0.39f

    .line 221
    .line 222
    .line 223
    const/16 v21, 0x0

    .line 224
    .line 225
    const v22, 0x3e051eb8    # 0.13f

    .line 226
    .line 227
    .line 228
    const v23, -0x43dc28f6    # -0.01f

    .line 229
    .line 230
    .line 231
    const v24, 0x3e851eb8    # 0.26f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x3f547ae1    # 0.83f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x3d4ccccd    # 0.05f

    .line 244
    .line 245
    .line 246
    const/high16 v26, 0x3e800000    # 0.25f

    .line 247
    .line 248
    const v21, 0x3da3d70a    # 0.08f

    .line 249
    .line 250
    .line 251
    const v22, 0x3d75c28f    # 0.06f

    .line 252
    .line 253
    .line 254
    const v23, 0x3dcccccd    # 0.1f

    .line 255
    .line 256
    .line 257
    const v24, 0x3e23d70a    # 0.16f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x3fb1eb85    # 1.39f

    .line 264
    .line 265
    .line 266
    const v6, -0x40b33333    # -0.8f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v25, -0x418a3d71    # -0.24f

    .line 273
    .line 274
    .line 275
    const v26, 0x3db851ec    # 0.09f

    .line 276
    .line 277
    .line 278
    const v21, -0x42b33333    # -0.05f

    .line 279
    .line 280
    .line 281
    const v22, 0x3db851ec    # 0.09f

    .line 282
    .line 283
    .line 284
    const v23, -0x41dc28f6    # -0.16f

    .line 285
    .line 286
    .line 287
    const v24, 0x3df5c28f    # 0.12f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, -0x40828f5c    # -0.99f

    .line 294
    .line 295
    .line 296
    const v6, -0x41333333    # -0.4f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, -0x40d47ae1    # -0.67f

    .line 303
    .line 304
    .line 305
    const v26, 0x3ec7ae14    # 0.39f

    .line 306
    .line 307
    .line 308
    const v21, -0x41a8f5c3    # -0.21f

    .line 309
    .line 310
    .line 311
    const v22, 0x3e23d70a    # 0.16f

    .line 312
    .line 313
    .line 314
    const v23, -0x4123d70a    # -0.43f

    .line 315
    .line 316
    .line 317
    const v24, 0x3e947ae1    # 0.29f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v4, 0x415d47ae    # 13.83f

    .line 324
    .line 325
    .line 326
    const/high16 v6, 0x41600000    # 14.0f

    .line 327
    .line 328
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x41b33333    # -0.2f

    .line 332
    .line 333
    .line 334
    const v26, 0x3e2e147b    # 0.17f

    .line 335
    .line 336
    .line 337
    const v21, -0x43dc28f6    # -0.01f

    .line 338
    .line 339
    .line 340
    const v22, 0x3dcccccd    # 0.1f

    .line 341
    .line 342
    .line 343
    const v23, -0x42333333    # -0.1f

    .line 344
    .line 345
    .line 346
    const v24, 0x3e2e147b    # 0.17f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, -0x40333333    # -1.6f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v26, -0x41d1eb85    # -0.17f

    .line 359
    .line 360
    .line 361
    const v21, -0x42333333    # -0.1f

    .line 362
    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    const v23, -0x41c7ae14    # -0.18f

    .line 367
    .line 368
    .line 369
    const v24, -0x4270a3d7    # -0.07f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v4, -0x41e66666    # -0.15f

    .line 376
    .line 377
    .line 378
    const v6, -0x407851ec    # -1.06f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v25, -0x40d1eb85    # -0.68f

    .line 385
    .line 386
    .line 387
    const v26, -0x413851ec    # -0.39f

    .line 388
    .line 389
    .line 390
    const/high16 v21, -0x41800000    # -0.25f

    .line 391
    .line 392
    const v22, -0x42333333    # -0.1f

    .line 393
    .line 394
    .line 395
    const v23, -0x410f5c29    # -0.47f

    .line 396
    .line 397
    .line 398
    const v24, -0x41947ae1    # -0.23f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, -0x40828f5c    # -0.99f

    .line 405
    .line 406
    .line 407
    const v6, 0x3ecccccd    # 0.4f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, -0x41800000    # -0.25f

    .line 414
    .line 415
    const v26, -0x4247ae14    # -0.09f

    .line 416
    .line 417
    .line 418
    const v21, -0x4247ae14    # -0.09f

    .line 419
    .line 420
    .line 421
    const v22, 0x3cf5c28f    # 0.03f

    .line 422
    .line 423
    .line 424
    const v23, -0x41b33333    # -0.2f

    .line 425
    .line 426
    .line 427
    const/16 v24, 0x0

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, -0x404e147b    # -1.39f

    .line 433
    .line 434
    .line 435
    const v6, -0x40b33333    # -0.8f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v25, 0x3d4ccccd    # 0.05f

    .line 442
    .line 443
    .line 444
    const/high16 v26, -0x41800000    # -0.25f

    .line 445
    .line 446
    const v21, -0x42b33333    # -0.05f

    .line 447
    .line 448
    .line 449
    const v22, -0x425c28f6    # -0.08f

    .line 450
    .line 451
    .line 452
    const v23, -0x430a3d71    # -0.03f

    .line 453
    .line 454
    .line 455
    const v24, -0x41bd70a4    # -0.19f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v4, 0x3f570a3d    # 0.84f

    .line 462
    .line 463
    .line 464
    const v6, -0x40d70a3d    # -0.66f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v25, 0x41200000    # 10.0f

    .line 471
    .line 472
    const/high16 v26, 0x41200000    # 10.0f

    .line 473
    .line 474
    const v21, 0x412028f6    # 10.01f

    .line 475
    .line 476
    .line 477
    const v22, 0x412428f6    # 10.26f

    .line 478
    .line 479
    .line 480
    const/high16 v23, 0x41200000    # 10.0f

    .line 481
    .line 482
    const v24, 0x4122147b    # 10.13f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v25, 0x3d23d70a    # 0.04f

    .line 489
    .line 490
    .line 491
    const v26, -0x413851ec    # -0.39f

    .line 492
    .line 493
    .line 494
    const/16 v21, 0x0

    .line 495
    .line 496
    const v22, -0x41fae148    # -0.13f

    .line 497
    .line 498
    .line 499
    const v23, 0x3ca3d70a    # 0.02f

    .line 500
    .line 501
    .line 502
    const v24, -0x4175c28f    # -0.27f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v4, 0x41130a3d    # 9.19f

    .line 509
    .line 510
    .line 511
    const v6, 0x410f3333    # 8.95f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v25, -0x42b33333    # -0.05f

    .line 518
    .line 519
    .line 520
    const v26, -0x417ae148    # -0.26f

    .line 521
    .line 522
    .line 523
    const v21, -0x425c28f6    # -0.08f

    .line 524
    .line 525
    .line 526
    const v22, -0x428a3d71    # -0.06f

    .line 527
    .line 528
    .line 529
    const v23, -0x42333333    # -0.1f

    .line 530
    .line 531
    .line 532
    const v24, -0x41dc28f6    # -0.16f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v4, -0x404f5c29    # -1.38f

    .line 539
    .line 540
    .line 541
    const v6, 0x3f4ccccd    # 0.8f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v25, 0x3e75c28f    # 0.24f

    .line 548
    .line 549
    .line 550
    const v26, -0x4247ae14    # -0.09f

    .line 551
    .line 552
    .line 553
    const v21, 0x3d4ccccd    # 0.05f

    .line 554
    .line 555
    .line 556
    const v22, -0x4247ae14    # -0.09f

    .line 557
    .line 558
    .line 559
    const v23, 0x3e19999a    # 0.15f

    .line 560
    .line 561
    .line 562
    const v24, -0x420a3d71    # -0.12f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const v6, 0x3ecccccd    # 0.4f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v25, 0x3f2b851f    # 0.67f

    .line 577
    .line 578
    .line 579
    const v26, -0x413851ec    # -0.39f

    .line 580
    .line 581
    .line 582
    const v21, 0x3e4ccccd    # 0.2f

    .line 583
    .line 584
    .line 585
    const v22, -0x41e66666    # -0.15f

    .line 586
    .line 587
    .line 588
    const v23, 0x3edc28f6    # 0.43f

    .line 589
    .line 590
    .line 591
    const v24, -0x416b851f    # -0.29f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v4, 0x3e19999a    # 0.15f

    .line 598
    .line 599
    .line 600
    const v6, -0x407851ec    # -1.06f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v25, 0x41433333    # 12.2f

    .line 607
    .line 608
    .line 609
    const/high16 v26, 0x40c00000    # 6.0f

    .line 610
    .line 611
    const v21, 0x414051ec    # 12.02f

    .line 612
    .line 613
    .line 614
    const v22, 0x40c23d71    # 6.07f

    .line 615
    .line 616
    .line 617
    const v23, 0x4141999a    # 12.1f

    .line 618
    .line 619
    .line 620
    const/high16 v24, 0x40c00000    # 6.0f

    .line 621
    .line 622
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v4, 0x3fcccccd    # 1.6f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v25, 0x3e4ccccd    # 0.2f

    .line 632
    .line 633
    .line 634
    const v26, 0x3e2e147b    # 0.17f

    .line 635
    .line 636
    .line 637
    const v21, 0x3dcccccd    # 0.1f

    .line 638
    .line 639
    .line 640
    const/16 v22, 0x0

    .line 641
    .line 642
    const v23, 0x3e3851ec    # 0.18f

    .line 643
    .line 644
    .line 645
    const v24, 0x3d8f5c29    # 0.07f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v4, 0x3f87ae14    # 1.06f

    .line 652
    .line 653
    .line 654
    const v6, 0x3e19999a    # 0.15f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v25, 0x3f2b851f    # 0.67f

    .line 661
    .line 662
    .line 663
    const v26, 0x3ec7ae14    # 0.39f

    .line 664
    .line 665
    .line 666
    const v21, 0x3e75c28f    # 0.24f

    .line 667
    .line 668
    .line 669
    const v22, 0x3dcccccd    # 0.1f

    .line 670
    .line 671
    .line 672
    const v23, 0x3eeb851f    # 0.46f

    .line 673
    .line 674
    .line 675
    const v24, 0x3e6b851f    # 0.23f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v4, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const v6, -0x41333333    # -0.4f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v25, 0x3e75c28f    # 0.24f

    .line 690
    .line 691
    .line 692
    const v26, 0x3db851ec    # 0.09f

    .line 693
    .line 694
    .line 695
    const v21, 0x3db851ec    # 0.09f

    .line 696
    .line 697
    .line 698
    const v22, -0x430a3d71    # -0.03f

    .line 699
    .line 700
    .line 701
    const v23, 0x3e4ccccd    # 0.2f

    .line 702
    .line 703
    .line 704
    const/16 v24, 0x0

    .line 705
    .line 706
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v4, 0x3fb0a3d7    # 1.38f

    .line 710
    .line 711
    .line 712
    const v6, 0x3f4ccccd    # 0.8f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v25, 0x41868f5c    # 16.82f

    .line 719
    .line 720
    .line 721
    const v26, 0x410f3333    # 8.95f

    .line 722
    .line 723
    .line 724
    const v21, 0x418747ae    # 16.91f

    .line 725
    .line 726
    .line 727
    const v22, 0x410c7ae1    # 8.78f

    .line 728
    .line 729
    .line 730
    const v23, 0x41871eb8    # 16.89f

    .line 731
    .line 732
    .line 733
    const v24, 0x410e3d71    # 8.89f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/16 v16, 0x3800

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const v6, 0x3e99999a    # 0.3f

    .line 751
    .line 752
    .line 753
    const v8, 0x3e99999a    # 0.3f

    .line 754
    .line 755
    .line 756
    const/4 v7, 0x0

    .line 757
    const/high16 v9, 0x3f800000    # 1.0f

    .line 758
    .line 759
    const/high16 v12, 0x3f800000    # 1.0f

    .line 760
    .line 761
    const/4 v13, 0x0

    .line 762
    const/4 v14, 0x0

    .line 763
    const/4 v15, 0x0

    .line 764
    const-string v4, ""

    .line 765
    .line 766
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 767
    .line 768
    .line 769
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 774
    .line 775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 776
    .line 777
    .line 778
    move-result-wide v6

    .line 779
    const/4 v2, 0x0

    .line 780
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 784
    .line 785
    .line 786
    move-result v10

    .line 787
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 788
    .line 789
    .line 790
    move-result v11

    .line 791
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 794
    .line 795
    .line 796
    const v4, 0x417d1eb8    # 15.82f

    .line 797
    .line 798
    .line 799
    const v6, 0x40e70a3d    # 7.22f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v4, -0x40800000    # -1.0f

    .line 806
    .line 807
    const v6, 0x3ecccccd    # 0.4f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v25, -0x40d47ae1    # -0.67f

    .line 814
    .line 815
    .line 816
    const v26, -0x413851ec    # -0.39f

    .line 817
    .line 818
    .line 819
    const v21, -0x41a8f5c3    # -0.21f

    .line 820
    .line 821
    .line 822
    const v22, -0x41dc28f6    # -0.16f

    .line 823
    .line 824
    .line 825
    const v23, -0x4123d70a    # -0.43f

    .line 826
    .line 827
    .line 828
    const v24, -0x416b851f    # -0.29f

    .line 829
    .line 830
    .line 831
    move-object/from16 v20, v2

    .line 832
    .line 833
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v4, 0x40c570a4    # 6.17f

    .line 837
    .line 838
    .line 839
    const/high16 v6, 0x41600000    # 14.0f

    .line 840
    .line 841
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v25, 0x415ccccd    # 13.8f

    .line 845
    .line 846
    .line 847
    const/high16 v26, 0x40c00000    # 6.0f

    .line 848
    .line 849
    const v21, 0x415fae14    # 13.98f

    .line 850
    .line 851
    .line 852
    const v22, 0x40c23d71    # 6.07f

    .line 853
    .line 854
    .line 855
    const v23, 0x415e6666    # 13.9f

    .line 856
    .line 857
    .line 858
    const/high16 v24, 0x40c00000    # 6.0f

    .line 859
    .line 860
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v4, -0x40333333    # -1.6f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v25, -0x41bd70a4    # -0.19f

    .line 870
    .line 871
    .line 872
    const v26, 0x3e2e147b    # 0.17f

    .line 873
    .line 874
    .line 875
    const v21, -0x42333333    # -0.1f

    .line 876
    .line 877
    .line 878
    const/16 v22, 0x0

    .line 879
    .line 880
    const v23, -0x41c7ae14    # -0.18f

    .line 881
    .line 882
    .line 883
    const v24, 0x3d8f5c29    # 0.07f

    .line 884
    .line 885
    .line 886
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v4, -0x41e66666    # -0.15f

    .line 890
    .line 891
    .line 892
    const v6, 0x3f87ae14    # 1.06f

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v25, -0x40d47ae1    # -0.67f

    .line 899
    .line 900
    .line 901
    const v26, 0x3ec7ae14    # 0.39f

    .line 902
    .line 903
    .line 904
    const v21, -0x418a3d71    # -0.24f

    .line 905
    .line 906
    .line 907
    const v22, 0x3dcccccd    # 0.1f

    .line 908
    .line 909
    .line 910
    const v23, -0x410f5c29    # -0.47f

    .line 911
    .line 912
    .line 913
    const v24, 0x3e6b851f    # 0.23f

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const/high16 v4, -0x40800000    # -1.0f

    .line 920
    .line 921
    const v6, -0x41333333    # -0.4f

    .line 922
    .line 923
    .line 924
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v25, -0x418a3d71    # -0.24f

    .line 928
    .line 929
    .line 930
    const v26, 0x3db851ec    # 0.09f

    .line 931
    .line 932
    .line 933
    const v21, -0x4247ae14    # -0.09f

    .line 934
    .line 935
    .line 936
    const v22, -0x430a3d71    # -0.03f

    .line 937
    .line 938
    .line 939
    const v23, -0x41b33333    # -0.2f

    .line 940
    .line 941
    .line 942
    const/16 v24, 0x0

    .line 943
    .line 944
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v4, 0x3fb0a3d7    # 1.38f

    .line 948
    .line 949
    .line 950
    const v6, -0x40b33333    # -0.8f

    .line 951
    .line 952
    .line 953
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v25, 0x3d4ccccd    # 0.05f

    .line 957
    .line 958
    .line 959
    const v26, 0x3e851eb8    # 0.26f

    .line 960
    .line 961
    .line 962
    const v21, -0x42b33333    # -0.05f

    .line 963
    .line 964
    .line 965
    const v22, 0x3db851ec    # 0.09f

    .line 966
    .line 967
    .line 968
    const v23, -0x430a3d71    # -0.03f

    .line 969
    .line 970
    .line 971
    const v24, 0x3e4ccccd    # 0.2f

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v4, 0x3f59999a    # 0.85f

    .line 978
    .line 979
    .line 980
    const v6, 0x3f28f5c3    # 0.66f

    .line 981
    .line 982
    .line 983
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v25, 0x41200000    # 10.0f

    .line 987
    .line 988
    const/high16 v26, 0x41200000    # 10.0f

    .line 989
    .line 990
    const v21, 0x412051ec    # 10.02f

    .line 991
    .line 992
    .line 993
    const v22, 0x411bae14    # 9.73f

    .line 994
    .line 995
    .line 996
    const/high16 v23, 0x41200000    # 10.0f

    .line 997
    .line 998
    const v24, 0x411deb85    # 9.87f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v25, 0x3cf5c28f    # 0.03f

    .line 1005
    .line 1006
    .line 1007
    const v26, 0x3ec7ae14    # 0.39f

    .line 1008
    .line 1009
    .line 1010
    const/16 v21, 0x0

    .line 1011
    .line 1012
    const v22, 0x3e051eb8    # 0.13f

    .line 1013
    .line 1014
    .line 1015
    const v23, 0x3c23d70a    # 0.01f

    .line 1016
    .line 1017
    .line 1018
    const v24, 0x3e851eb8    # 0.26f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v4, -0x40a8f5c3    # -0.84f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v25, -0x42b33333    # -0.05f

    .line 1031
    .line 1032
    .line 1033
    const/high16 v26, 0x3e800000    # 0.25f

    .line 1034
    .line 1035
    const v21, -0x425c28f6    # -0.08f

    .line 1036
    .line 1037
    .line 1038
    const v22, 0x3d75c28f    # 0.06f

    .line 1039
    .line 1040
    .line 1041
    const v23, -0x42333333    # -0.1f

    .line 1042
    .line 1043
    .line 1044
    const v24, 0x3e2e147b    # 0.17f

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v4, 0x3fb1eb85    # 1.39f

    .line 1051
    .line 1052
    .line 1053
    const v6, 0x3f4ccccd    # 0.8f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const/high16 v25, 0x3e800000    # 0.25f

    .line 1060
    .line 1061
    const v26, 0x3db851ec    # 0.09f

    .line 1062
    .line 1063
    .line 1064
    const v21, 0x3d4ccccd    # 0.05f

    .line 1065
    .line 1066
    .line 1067
    const v22, 0x3db851ec    # 0.09f

    .line 1068
    .line 1069
    .line 1070
    const v23, 0x3e19999a    # 0.15f

    .line 1071
    .line 1072
    .line 1073
    const v24, 0x3df5c28f    # 0.12f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v4, 0x3f7d70a4    # 0.99f

    .line 1080
    .line 1081
    .line 1082
    const v6, -0x41333333    # -0.4f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v25, 0x3f2e147b    # 0.68f

    .line 1089
    .line 1090
    .line 1091
    const v26, 0x3ec7ae14    # 0.39f

    .line 1092
    .line 1093
    .line 1094
    const v21, 0x3e570a3d    # 0.21f

    .line 1095
    .line 1096
    .line 1097
    const v22, 0x3e23d70a    # 0.16f

    .line 1098
    .line 1099
    .line 1100
    const v23, 0x3edc28f6    # 0.43f

    .line 1101
    .line 1102
    .line 1103
    const v24, 0x3e947ae1    # 0.29f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const v4, 0x415d47ae    # 13.83f

    .line 1110
    .line 1111
    .line 1112
    const/high16 v6, 0x41400000    # 12.0f

    .line 1113
    .line 1114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v25, 0x3e4ccccd    # 0.2f

    .line 1118
    .line 1119
    .line 1120
    const v26, 0x3e2e147b    # 0.17f

    .line 1121
    .line 1122
    .line 1123
    const v21, 0x3ca3d70a    # 0.02f

    .line 1124
    .line 1125
    .line 1126
    const v22, 0x3dcccccd    # 0.1f

    .line 1127
    .line 1128
    .line 1129
    const v23, 0x3dcccccd    # 0.1f

    .line 1130
    .line 1131
    .line 1132
    const v24, 0x3e2e147b    # 0.17f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const v4, 0x3fcccccd    # 1.6f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v26, -0x41d1eb85    # -0.17f

    .line 1145
    .line 1146
    .line 1147
    const v21, 0x3dcccccd    # 0.1f

    .line 1148
    .line 1149
    .line 1150
    const/16 v22, 0x0

    .line 1151
    .line 1152
    const v23, 0x3e3851ec    # 0.18f

    .line 1153
    .line 1154
    .line 1155
    const v24, -0x4270a3d7    # -0.07f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const v4, 0x3e19999a    # 0.15f

    .line 1162
    .line 1163
    .line 1164
    const v6, -0x407851ec    # -1.06f

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1168
    .line 1169
    .line 1170
    const v25, 0x3f2b851f    # 0.67f

    .line 1171
    .line 1172
    .line 1173
    const v26, -0x413851ec    # -0.39f

    .line 1174
    .line 1175
    .line 1176
    const v21, 0x3e75c28f    # 0.24f

    .line 1177
    .line 1178
    .line 1179
    const v22, -0x42333333    # -0.1f

    .line 1180
    .line 1181
    .line 1182
    const v23, 0x3ef0a3d7    # 0.47f

    .line 1183
    .line 1184
    .line 1185
    const v24, -0x41947ae1    # -0.23f

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const v4, 0x3f7d70a4    # 0.99f

    .line 1192
    .line 1193
    .line 1194
    const v6, 0x3ecccccd    # 0.4f

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const v25, 0x3e75c28f    # 0.24f

    .line 1201
    .line 1202
    .line 1203
    const v26, -0x4247ae14    # -0.09f

    .line 1204
    .line 1205
    .line 1206
    const v21, 0x3db851ec    # 0.09f

    .line 1207
    .line 1208
    .line 1209
    const v22, 0x3d23d70a    # 0.04f

    .line 1210
    .line 1211
    .line 1212
    const v23, 0x3e4ccccd    # 0.2f

    .line 1213
    .line 1214
    .line 1215
    const/16 v24, 0x0

    .line 1216
    .line 1217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v4, -0x404e147b    # -1.39f

    .line 1221
    .line 1222
    .line 1223
    const v6, 0x3f4ccccd    # 0.8f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v25, -0x42b33333    # -0.05f

    .line 1230
    .line 1231
    .line 1232
    const/high16 v26, -0x41800000    # -0.25f

    .line 1233
    .line 1234
    const v21, 0x3d4ccccd    # 0.05f

    .line 1235
    .line 1236
    .line 1237
    const v22, -0x4247ae14    # -0.09f

    .line 1238
    .line 1239
    .line 1240
    const v23, 0x3cf5c28f    # 0.03f

    .line 1241
    .line 1242
    .line 1243
    const v24, -0x41bd70a4    # -0.19f

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const v4, -0x40ab851f    # -0.83f

    .line 1250
    .line 1251
    .line 1252
    const v6, -0x40d70a3d    # -0.66f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const/high16 v25, 0x41800000    # 16.0f

    .line 1259
    .line 1260
    const/high16 v26, 0x41200000    # 10.0f

    .line 1261
    .line 1262
    const v21, 0x417fd70a    # 15.99f

    .line 1263
    .line 1264
    .line 1265
    const v22, 0x412428f6    # 10.26f

    .line 1266
    .line 1267
    .line 1268
    const/high16 v23, 0x41800000    # 16.0f

    .line 1269
    .line 1270
    const v24, 0x4122147b    # 10.13f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const v25, -0x430a3d71    # -0.03f

    .line 1277
    .line 1278
    .line 1279
    const v26, -0x413851ec    # -0.39f

    .line 1280
    .line 1281
    .line 1282
    const/16 v21, 0x0

    .line 1283
    .line 1284
    const v22, -0x41f0a3d7    # -0.14f

    .line 1285
    .line 1286
    .line 1287
    const v23, -0x43dc28f6    # -0.01f

    .line 1288
    .line 1289
    .line 1290
    const v24, -0x4175c28f    # -0.27f

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    const v4, 0x3f59999a    # 0.85f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    const v25, 0x3d4ccccd    # 0.05f

    .line 1303
    .line 1304
    .line 1305
    const v26, -0x417ae148    # -0.26f

    .line 1306
    .line 1307
    .line 1308
    const v21, 0x3da3d70a    # 0.08f

    .line 1309
    .line 1310
    .line 1311
    const v22, -0x428a3d71    # -0.06f

    .line 1312
    .line 1313
    .line 1314
    const v23, 0x3dcccccd    # 0.1f

    .line 1315
    .line 1316
    .line 1317
    const v24, -0x41d1eb85    # -0.17f

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1321
    .line 1322
    .line 1323
    const v4, -0x404f5c29    # -1.38f

    .line 1324
    .line 1325
    .line 1326
    const v6, -0x40b33333    # -0.8f

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1330
    .line 1331
    .line 1332
    const v25, 0x417d1eb8    # 15.82f

    .line 1333
    .line 1334
    .line 1335
    const v26, 0x40e70a3d    # 7.22f

    .line 1336
    .line 1337
    .line 1338
    const v21, 0x418028f6    # 16.02f

    .line 1339
    .line 1340
    .line 1341
    const v22, 0x40e70a3d    # 7.22f

    .line 1342
    .line 1343
    .line 1344
    const v23, 0x417e8f5c    # 15.91f

    .line 1345
    .line 1346
    .line 1347
    const v24, 0x40e6147b    # 7.19f

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v4, 0x4136e148    # 11.43f

    .line 1357
    .line 1358
    .line 1359
    const/high16 v6, 0x41500000    # 13.0f

    .line 1360
    .line 1361
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1362
    .line 1363
    .line 1364
    const v25, -0x4048f5c3    # -1.43f

    .line 1365
    .line 1366
    .line 1367
    const v26, -0x4048f5c3    # -1.43f

    .line 1368
    .line 1369
    .line 1370
    const v21, -0x40b5c28f    # -0.79f

    .line 1371
    .line 1372
    .line 1373
    const/16 v22, 0x0

    .line 1374
    .line 1375
    const v23, -0x4048f5c3    # -1.43f

    .line 1376
    .line 1377
    .line 1378
    const v24, -0x40dc28f6    # -0.64f

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1382
    .line 1383
    .line 1384
    const v4, 0x41091eb8    # 8.57f

    .line 1385
    .line 1386
    .line 1387
    const v6, 0x41091eb8    # 8.57f

    .line 1388
    .line 1389
    .line 1390
    const/high16 v7, 0x41500000    # 13.0f

    .line 1391
    .line 1392
    const v8, 0x41435c29    # 12.21f

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1396
    .line 1397
    .line 1398
    const v4, 0x3f23d70a    # 0.64f

    .line 1399
    .line 1400
    .line 1401
    const v6, 0x3fb70a3d    # 1.43f

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1405
    .line 1406
    .line 1407
    const v4, 0x415ca3d7    # 13.79f

    .line 1408
    .line 1409
    .line 1410
    const v6, 0x4136e148    # 11.43f

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v2

    .line 1423
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1424
    .line 1425
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1426
    .line 1427
    const/4 v7, 0x0

    .line 1428
    const-string v4, ""

    .line 1429
    .line 1430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1431
    .line 1432
    .line 1433
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1434
    .line 1435
    .line 1436
    move-result v3

    .line 1437
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v6

    .line 1443
    const/4 v0, 0x0

    .line 1444
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1448
    .line 1449
    .line 1450
    move-result v10

    .line 1451
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1452
    .line 1453
    .line 1454
    move-result v11

    .line 1455
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1456
    .line 1457
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1458
    .line 1459
    .line 1460
    const v0, 0x419f851f    # 19.94f

    .line 1461
    .line 1462
    .line 1463
    const v2, 0x4110f5c3    # 9.06f

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1467
    .line 1468
    .line 1469
    const v17, -0x3f2f0a3d    # -6.53f

    .line 1470
    .line 1471
    .line 1472
    const v18, -0x3f3e6666    # -6.05f

    .line 1473
    .line 1474
    .line 1475
    const v13, -0x4123d70a    # -0.43f

    .line 1476
    .line 1477
    .line 1478
    const v14, -0x3faeb852    # -3.27f

    .line 1479
    .line 1480
    .line 1481
    const v15, -0x3fb147ae    # -3.23f

    .line 1482
    .line 1483
    .line 1484
    const v16, -0x3f447ae1    # -5.86f

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1488
    .line 1489
    .line 1490
    const/high16 v17, 0x41500000    # 13.0f

    .line 1491
    .line 1492
    const/high16 v18, 0x40400000    # 3.0f

    .line 1493
    .line 1494
    const v13, 0x415451ec    # 13.27f

    .line 1495
    .line 1496
    .line 1497
    const/high16 v14, 0x40400000    # 3.0f

    .line 1498
    .line 1499
    const v15, 0x41523d71    # 13.14f

    .line 1500
    .line 1501
    .line 1502
    const/high16 v16, 0x40400000    # 3.0f

    .line 1503
    .line 1504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1505
    .line 1506
    .line 1507
    const v17, 0x40c28f5c    # 6.08f

    .line 1508
    .line 1509
    .line 1510
    const/high16 v18, 0x41100000    # 9.0f

    .line 1511
    .line 1512
    const v13, 0x4117851f    # 9.47f

    .line 1513
    .line 1514
    .line 1515
    const v15, 0x40d23d71    # 6.57f

    .line 1516
    .line 1517
    .line 1518
    const v16, 0x40b3851f    # 5.61f

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1522
    .line 1523
    .line 1524
    const v0, -0x4008f5c3    # -1.93f

    .line 1525
    .line 1526
    .line 1527
    const v2, 0x405eb852    # 3.48f

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1531
    .line 1532
    .line 1533
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1534
    .line 1535
    const/high16 v18, 0x41600000    # 14.0f

    .line 1536
    .line 1537
    const v13, 0x406f5c29    # 3.74f

    .line 1538
    .line 1539
    .line 1540
    const v14, 0x41523d71    # 13.14f

    .line 1541
    .line 1542
    .line 1543
    const v15, 0x40870a3d    # 4.22f

    .line 1544
    .line 1545
    .line 1546
    const/high16 v16, 0x41600000    # 14.0f

    .line 1547
    .line 1548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1549
    .line 1550
    .line 1551
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1552
    .line 1553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1554
    .line 1555
    .line 1556
    const/high16 v0, 0x40000000    # 2.0f

    .line 1557
    .line 1558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1559
    .line 1560
    .line 1561
    const/high16 v17, 0x40000000    # 2.0f

    .line 1562
    .line 1563
    const/high16 v18, 0x40000000    # 2.0f

    .line 1564
    .line 1565
    const/4 v13, 0x0

    .line 1566
    const v14, 0x3f8ccccd    # 1.1f

    .line 1567
    .line 1568
    .line 1569
    const v15, 0x3f666666    # 0.9f

    .line 1570
    .line 1571
    .line 1572
    const/high16 v16, 0x40000000    # 2.0f

    .line 1573
    .line 1574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1575
    .line 1576
    .line 1577
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1578
    .line 1579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1580
    .line 1581
    .line 1582
    const/high16 v0, 0x40400000    # 3.0f

    .line 1583
    .line 1584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1585
    .line 1586
    .line 1587
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1588
    .line 1589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1590
    .line 1591
    .line 1592
    const v0, -0x3f6a3d71    # -4.68f

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1596
    .line 1597
    .line 1598
    const v17, 0x419f851f    # 19.94f

    .line 1599
    .line 1600
    .line 1601
    const v18, 0x4110f5c3    # 9.06f

    .line 1602
    .line 1603
    .line 1604
    const v13, 0x4194f5c3    # 18.62f

    .line 1605
    .line 1606
    .line 1607
    const v14, 0x41711eb8    # 15.07f

    .line 1608
    .line 1609
    .line 1610
    const v15, 0x41a2cccd    # 20.35f

    .line 1611
    .line 1612
    .line 1613
    const v16, 0x4143d70a    # 12.24f

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1620
    .line 1621
    .line 1622
    const v0, 0x416e3d71    # 14.89f

    .line 1623
    .line 1624
    .line 1625
    const v2, 0x416a147b    # 14.63f

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1629
    .line 1630
    .line 1631
    const v0, 0x4170cccd    # 15.05f

    .line 1632
    .line 1633
    .line 1634
    const/high16 v2, 0x41600000    # 14.0f

    .line 1635
    .line 1636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1637
    .line 1638
    .line 1639
    const/high16 v0, 0x41980000    # 19.0f

    .line 1640
    .line 1641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1642
    .line 1643
    .line 1644
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1645
    .line 1646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1650
    .line 1651
    .line 1652
    const/high16 v0, 0x41000000    # 8.0f

    .line 1653
    .line 1654
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1655
    .line 1656
    .line 1657
    const/high16 v0, -0x3f800000    # -4.0f

    .line 1658
    .line 1659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1660
    .line 1661
    .line 1662
    const v0, 0x40d66666    # 6.7f

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1666
    .line 1667
    .line 1668
    const v0, 0x3faa3d71    # 1.33f

    .line 1669
    .line 1670
    .line 1671
    const v2, -0x3feae148    # -2.33f

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1675
    .line 1676
    .line 1677
    const/high16 v17, 0x41500000    # 13.0f

    .line 1678
    .line 1679
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1680
    .line 1681
    const v13, 0x41035c29    # 8.21f

    .line 1682
    .line 1683
    .line 1684
    const v14, 0x40e1eb85    # 7.06f

    .line 1685
    .line 1686
    .line 1687
    const v15, 0x4125999a    # 10.35f

    .line 1688
    .line 1689
    .line 1690
    const/high16 v16, 0x40a00000    # 5.0f

    .line 1691
    .line 1692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1693
    .line 1694
    .line 1695
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1696
    .line 1697
    const v13, 0x4030a3d7    # 2.76f

    .line 1698
    .line 1699
    .line 1700
    const/4 v14, 0x0

    .line 1701
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1702
    .line 1703
    const v16, 0x400f5c29    # 2.24f

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1707
    .line 1708
    .line 1709
    const v17, 0x416e3d71    # 14.89f

    .line 1710
    .line 1711
    .line 1712
    const v18, 0x416a147b    # 14.63f

    .line 1713
    .line 1714
    .line 1715
    const/high16 v13, 0x41900000    # 18.0f

    .line 1716
    .line 1717
    const v14, 0x414170a4    # 12.09f

    .line 1718
    .line 1719
    .line 1720
    const v15, 0x4185ae14    # 16.71f

    .line 1721
    .line 1722
    .line 1723
    const v16, 0x415e147b    # 13.88f

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v2

    .line 1736
    const/16 v16, 0x3800

    .line 1737
    .line 1738
    const/16 v17, 0x0

    .line 1739
    .line 1740
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1741
    .line 1742
    const/4 v7, 0x0

    .line 1743
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1744
    .line 1745
    const/4 v13, 0x0

    .line 1746
    const/4 v14, 0x0

    .line 1747
    const/4 v15, 0x0

    .line 1748
    const-string v4, ""

    .line 1749
    .line 1750
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v0

    .line 1758
    sput-object v0, Landroidx/compose/material/icons/twotone/PsychologyKt;->_psychology:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1759
    .line 1760
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1761
    .line 1762
    .line 1763
    return-object v0
.end method
