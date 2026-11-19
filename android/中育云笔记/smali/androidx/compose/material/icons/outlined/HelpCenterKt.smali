.class public final Landroidx/compose/material/icons/outlined/HelpCenterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHelpCenter(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.HelpCenter"

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
    const/high16 v0, 0x41540000    # 13.25f

    .line 71
    .line 72
    const v2, 0x4185eb85    # 16.74f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x40600000    # -1.25f

    .line 79
    .line 80
    const v18, 0x3fa147ae    # 1.26f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, 0x3f30a3d7    # 0.69f

    .line 85
    .line 86
    .line 87
    const v15, -0x40f851ec    # -0.53f

    .line 88
    .line 89
    .line 90
    const v16, 0x3fa147ae    # 1.26f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x405eb852    # -1.26f

    .line 97
    .line 98
    .line 99
    const v18, -0x405eb852    # -1.26f

    .line 100
    .line 101
    .line 102
    const v13, -0x40cccccd    # -0.7f

    .line 103
    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    const v15, -0x405eb852    # -1.26f

    .line 107
    .line 108
    .line 109
    const v16, -0x40f0a3d7    # -0.56f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x3fa147ae    # 1.26f

    .line 116
    .line 117
    .line 118
    const/high16 v18, -0x40600000    # -1.25f

    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const v14, -0x40ca3d71    # -0.71f

    .line 122
    .line 123
    .line 124
    const v15, 0x3f0f5c29    # 0.56f

    .line 125
    .line 126
    .line 127
    const/high16 v16, -0x40600000    # -1.25f

    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x41540000    # 13.25f

    .line 133
    .line 134
    const v18, 0x4185eb85    # 16.74f

    .line 135
    .line 136
    .line 137
    const v13, 0x414b5c29    # 12.71f

    .line 138
    .line 139
    .line 140
    const v14, 0x4177d70a    # 15.49f

    .line 141
    .line 142
    .line 143
    const/high16 v15, 0x41540000    # 13.25f

    .line 144
    .line 145
    const v16, 0x418051ec    # 16.04f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x413fd70a    # 11.99f

    .line 155
    .line 156
    .line 157
    const/high16 v2, 0x40c00000    # 6.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x3fa47ae1    # -3.43f

    .line 163
    .line 164
    .line 165
    const v18, 0x401f5c29    # 2.49f

    .line 166
    .line 167
    .line 168
    const v13, -0x401d70a4    # -1.77f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, -0x3fc147ae    # -2.98f

    .line 173
    .line 174
    .line 175
    const v16, 0x3f933333    # 1.15f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3fd1eb85    # 1.64f

    .line 182
    .line 183
    .line 184
    const v2, 0x3f30a3d7    # 0.69f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3fe66666    # 1.8f

    .line 191
    .line 192
    .line 193
    const v18, -0x40428f5c    # -1.48f

    .line 194
    .line 195
    .line 196
    const v13, 0x3e6147ae    # 0.22f

    .line 197
    .line 198
    .line 199
    const v14, -0x40d47ae1    # -0.67f

    .line 200
    .line 201
    .line 202
    const v15, 0x3f3d70a4    # 0.74f

    .line 203
    .line 204
    .line 205
    const v16, -0x40428f5c    # -1.48f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3faf5c29    # 1.37f

    .line 212
    .line 213
    .line 214
    const v18, 0x40151eb8    # 2.33f

    .line 215
    .line 216
    .line 217
    const v13, 0x3fcf5c29    # 1.62f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const v15, 0x3ff851ec    # 1.94f

    .line 222
    .line 223
    .line 224
    const v16, 0x3fc28f5c    # 1.52f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x40051eb8    # -1.96f

    .line 231
    .line 232
    .line 233
    const v18, 0x400a3d71    # 2.16f

    .line 234
    .line 235
    .line 236
    const v13, -0x40f5c28f    # -0.54f

    .line 237
    .line 238
    .line 239
    const v14, 0x3f451eb8    # 0.77f

    .line 240
    .line 241
    .line 242
    const v15, -0x4043d70a    # -1.47f

    .line 243
    .line 244
    .line 245
    const v16, 0x3fa51eb8    # 1.29f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, -0x416147ae    # -0.31f

    .line 252
    .line 253
    .line 254
    const v18, 0x3ffd70a4    # 1.98f

    .line 255
    .line 256
    .line 257
    const v13, -0x413851ec    # -0.39f

    .line 258
    .line 259
    .line 260
    const v14, 0x3f30a3d7    # 0.69f

    .line 261
    .line 262
    .line 263
    const v15, -0x416147ae    # -0.31f

    .line 264
    .line 265
    .line 266
    const v16, 0x3fbeb852    # 1.49f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x3fe8f5c3    # 1.82f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3e6147ae    # 0.22f

    .line 279
    .line 280
    .line 281
    const v18, -0x404b851f    # -1.41f

    .line 282
    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    const v14, -0x4091eb85    # -0.93f

    .line 286
    .line 287
    .line 288
    const v15, 0x3d8f5c29    # 0.07f

    .line 289
    .line 290
    .line 291
    const v16, -0x4070a3d7    # -1.12f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3fef5c29    # 1.87f

    .line 298
    .line 299
    .line 300
    const v18, -0x3ff51eb8    # -2.17f

    .line 301
    .line 302
    .line 303
    const v13, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    const v14, -0x40c7ae14    # -0.72f

    .line 307
    .line 308
    .line 309
    const v15, 0x3f8e147b    # 1.11f

    .line 310
    .line 311
    .line 312
    const v16, -0x407851ec    # -1.06f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x435c28f6    # -0.02f

    .line 319
    .line 320
    .line 321
    const v18, -0x3fbae148    # -3.08f

    .line 322
    .line 323
    .line 324
    const v13, 0x3f2e147b    # 0.68f

    .line 325
    .line 326
    .line 327
    const/high16 v14, -0x40800000    # -1.0f

    .line 328
    .line 329
    const v15, 0x3ed70a3d    # 0.42f

    .line 330
    .line 331
    .line 332
    const v16, -0x3fe8f5c3    # -2.36f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x413fd70a    # 11.99f

    .line 339
    .line 340
    .line 341
    const/high16 v18, 0x40c00000    # 6.0f

    .line 342
    .line 343
    const v13, 0x4167ae14    # 14.48f

    .line 344
    .line 345
    .line 346
    const v14, 0x40d570a4    # 6.67f

    .line 347
    .line 348
    .line 349
    const v15, 0x4157851f    # 13.47f

    .line 350
    .line 351
    .line 352
    const/high16 v16, 0x40c00000    # 6.0f

    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41980000    # 19.0f

    .line 361
    .line 362
    const/high16 v2, 0x40a00000    # 5.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40a00000    # 5.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41600000    # 14.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40a00000    # 5.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40400000    # 3.0f

    .line 386
    .line 387
    const/high16 v2, 0x41980000    # 19.0f

    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v18, 0x40000000    # 2.0f

    .line 395
    .line 396
    const v13, 0x3f8ccccd    # 1.1f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const/high16 v15, 0x40000000    # 2.0f

    .line 401
    .line 402
    const v16, 0x3f666666    # 0.9f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41600000    # 14.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, -0x40000000    # -2.0f

    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    const v14, 0x3f8ccccd    # 1.1f

    .line 417
    .line 418
    .line 419
    const v15, -0x4099999a    # -0.9f

    .line 420
    .line 421
    .line 422
    const/high16 v16, 0x40000000    # 2.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x40a00000    # 5.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v18, -0x40000000    # -2.0f

    .line 433
    .line 434
    const v13, -0x40733333    # -1.1f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, -0x40000000    # -2.0f

    .line 439
    .line 440
    const v16, -0x4099999a    # -0.9f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x40000000    # 2.0f

    .line 450
    .line 451
    const/4 v13, 0x0

    .line 452
    const v14, -0x40733333    # -1.1f

    .line 453
    .line 454
    .line 455
    const v15, 0x3f666666    # 0.9f

    .line 456
    .line 457
    .line 458
    const/high16 v16, -0x40000000    # -2.0f

    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41980000    # 19.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x40400000    # 3.0f

    .line 469
    .line 470
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/16 v16, 0x3800

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v8, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/high16 v9, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
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
    sput-object v0, Landroidx/compose/material/icons/outlined/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 506
    .line 507
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    return-object v0
.end method

.method public static synthetic getHelpCenter$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
