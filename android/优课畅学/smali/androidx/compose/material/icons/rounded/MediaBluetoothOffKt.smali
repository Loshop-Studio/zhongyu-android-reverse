.class public final Landroidx/compose/material/icons/rounded/MediaBluetoothOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mediaBluetoothOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMediaBluetoothOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MediaBluetoothOffKt;->_mediaBluetoothOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MediaBluetoothOff"

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
    const v0, 0x40c570a4    # 6.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41100000    # 9.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40a00000    # 5.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v18, -0x40000000    # -2.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f666666    # 0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x40000000    # -2.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x40000000    # 2.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x40000000    # 2.0f

    .line 105
    .line 106
    const v13, 0x3f8ccccd    # 1.1f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, 0x40000000    # 2.0f

    .line 111
    .line 112
    const v16, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, -0x40000000    # -2.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const v14, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const v15, -0x4099999a    # -0.9f

    .line 129
    .line 130
    .line 131
    const/high16 v16, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, -0x40000000    # -2.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x3f95c28f    # 1.17f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x40c570a4    # 6.17f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41700000    # 15.0f

    .line 157
    .line 158
    const v2, 0x419b5c29    # 19.42f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x400b851f    # 2.18f

    .line 165
    .line 166
    .line 167
    const v2, 0x400ae148    # 2.17f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const v18, 0x3f4ccccd    # 0.8f

    .line 176
    .line 177
    .line 178
    const v13, 0x3e6147ae    # 0.22f

    .line 179
    .line 180
    .line 181
    const v14, 0x3e6147ae    # 0.22f

    .line 182
    .line 183
    .line 184
    const v15, 0x3e6147ae    # 0.22f

    .line 185
    .line 186
    .line 187
    const v16, 0x3f147ae1    # 0.58f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x40b33333    # -0.8f

    .line 198
    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const v13, -0x419eb852    # -0.22f

    .line 203
    .line 204
    .line 205
    const v15, -0x40eb851f    # -0.58f

    .line 206
    .line 207
    .line 208
    const v16, 0x3e6147ae    # 0.22f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, -0x3f40a3d7    # -5.98f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const v18, -0x40b33333    # -0.8f

    .line 223
    .line 224
    .line 225
    const v14, -0x419eb852    # -0.22f

    .line 226
    .line 227
    .line 228
    const v15, -0x419eb852    # -0.22f

    .line 229
    .line 230
    .line 231
    const v16, -0x40eb851f    # -0.58f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3f4ccccd    # 0.8f

    .line 242
    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    const v13, 0x3e6147ae    # 0.22f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f147ae1    # 0.58f

    .line 250
    .line 251
    .line 252
    const v16, -0x419eb852    # -0.22f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x40166666    # 2.35f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x4119c28f    # 9.61f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3f59999a    # 0.85f

    .line 271
    .line 272
    .line 273
    const v18, -0x414ccccd    # -0.35f

    .line 274
    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const v14, -0x4119999a    # -0.45f

    .line 278
    .line 279
    .line 280
    const v15, 0x3f0a3d71    # 0.54f

    .line 281
    .line 282
    .line 283
    const v16, -0x40d47ae1    # -0.67f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x40347ae1    # 2.82f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const v18, 0x3f35c28f    # 0.71f

    .line 298
    .line 299
    .line 300
    const v13, 0x3e4ccccd    # 0.2f

    .line 301
    .line 302
    .line 303
    const v14, 0x3e4ccccd    # 0.2f

    .line 304
    .line 305
    .line 306
    const v15, 0x3e4ccccd    # 0.2f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f028f5c    # 0.51f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41700000    # 15.0f

    .line 316
    .line 317
    const v2, 0x419b5c29    # 19.42f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x41995c29    # 19.17f

    .line 327
    .line 328
    .line 329
    const v2, 0x4158cccd    # 13.55f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3f90a3d7    # 1.13f

    .line 336
    .line 337
    .line 338
    const v2, -0x406f5c29    # -1.13f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, -0x406f5c29    # -1.13f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x4158cccd    # 13.55f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x41a3eb85    # 20.49f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v18, 0x3fb47ae1    # 1.41f

    .line 366
    .line 367
    .line 368
    const v13, 0x3ec7ae14    # 0.39f

    .line 369
    .line 370
    .line 371
    const v14, 0x3ec7ae14    # 0.39f

    .line 372
    .line 373
    .line 374
    const v15, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    const v16, 0x3f828f5c    # 1.02f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, -0x404b851f    # -1.41f

    .line 388
    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const v13, -0x413851ec    # -0.39f

    .line 393
    .line 394
    .line 395
    const v15, -0x407d70a4    # -1.02f

    .line 396
    .line 397
    .line 398
    const v16, 0x3ec7ae14    # 0.39f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, -0x3fae147b    # -3.28f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x3e23d70a    # 0.16f

    .line 411
    .line 412
    .line 413
    const v2, -0x41dc28f6    # -0.16f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, -0x40a66666    # -0.85f

    .line 420
    .line 421
    .line 422
    const v13, -0x41947ae1    # -0.23f

    .line 423
    .line 424
    .line 425
    const v14, 0x3e6b851f    # 0.23f

    .line 426
    .line 427
    .line 428
    const v15, -0x40e147ae    # -0.62f

    .line 429
    .line 430
    .line 431
    const v16, 0x3e6b851f    # 0.23f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/4 v0, 0x0

    .line 438
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    const v18, -0x40a66666    # -0.85f

    .line 444
    .line 445
    .line 446
    const v14, -0x41947ae1    # -0.23f

    .line 447
    .line 448
    .line 449
    const v15, -0x41947ae1    # -0.23f

    .line 450
    .line 451
    .line 452
    const v16, -0x40e147ae    # -0.62f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3e23d70a    # 0.16f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41300000    # 11.0f

    .line 465
    .line 466
    const v2, 0x415d47ae    # 13.83f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x404147ae    # 3.02f

    .line 473
    .line 474
    .line 475
    const/4 v2, 0x0

    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, -0x3f90a3d7    # -3.74f

    .line 480
    .line 481
    .line 482
    const v18, 0x40847ae1    # 4.14f

    .line 483
    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    const v14, 0x40047ae1    # 2.07f

    .line 487
    .line 488
    .line 489
    const v15, -0x4028f5c3    # -1.68f

    .line 490
    .line 491
    .line 492
    const v16, 0x408051ec    # 4.01f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x40400000    # 3.0f

    .line 499
    .line 500
    const/high16 v18, 0x41880000    # 17.0f

    .line 501
    .line 502
    const v13, 0x409e147b    # 4.94f

    .line 503
    .line 504
    .line 505
    const v14, 0x41a90a3d    # 21.13f

    .line 506
    .line 507
    .line 508
    const/high16 v15, 0x40400000    # 3.0f

    .line 509
    .line 510
    const v16, 0x419a51ec    # 19.29f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x408051ec    # 4.01f

    .line 517
    .line 518
    .line 519
    const/high16 v18, -0x3f800000    # -4.0f

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const v14, -0x3ff28f5c    # -2.21f

    .line 523
    .line 524
    .line 525
    const v15, 0x3fe51eb8    # 1.79f

    .line 526
    .line 527
    .line 528
    const/high16 v16, -0x3f800000    # -4.0f

    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x40000000    # 2.0f

    .line 534
    .line 535
    const v18, 0x3f0ccccd    # 0.55f

    .line 536
    .line 537
    .line 538
    const v13, 0x3f3ae148    # 0.73f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const v15, 0x3fb47ae1    # 1.41f

    .line 543
    .line 544
    .line 545
    const v16, 0x3e570a3d    # 0.21f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x4023d70a    # -1.72f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x40066666    # 2.1f

    .line 558
    .line 559
    .line 560
    const v2, 0x409d70a4    # 4.92f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const v18, -0x404b851f    # -1.41f

    .line 569
    .line 570
    .line 571
    const v13, -0x413851ec    # -0.39f

    .line 572
    .line 573
    .line 574
    const v14, -0x413851ec    # -0.39f

    .line 575
    .line 576
    .line 577
    const v15, -0x413851ec    # -0.39f

    .line 578
    .line 579
    .line 580
    const v16, -0x407d70a4    # -1.02f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/4 v0, 0x0

    .line 587
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, 0x3fb47ae1    # 1.41f

    .line 591
    .line 592
    .line 593
    const/16 v18, 0x0

    .line 594
    .line 595
    const v13, 0x3ec7ae14    # 0.39f

    .line 596
    .line 597
    .line 598
    const v15, 0x3f828f5c    # 1.02f

    .line 599
    .line 600
    .line 601
    const v16, -0x413851ec    # -0.39f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x41a3eb85    # 20.49f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const/16 v16, 0x3800

    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/high16 v8, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    const/high16 v9, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/high16 v12, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v13, 0x0

    .line 634
    const/4 v14, 0x0

    .line 635
    const/4 v15, 0x0

    .line 636
    const-string v4, ""

    .line 637
    .line 638
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    sput-object v0, Landroidx/compose/material/icons/rounded/MediaBluetoothOffKt;->_mediaBluetoothOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 647
    .line 648
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    return-object v0
.end method
