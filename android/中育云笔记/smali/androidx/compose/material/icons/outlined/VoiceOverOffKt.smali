.class public final Landroidx/compose/material/icons/outlined/VoiceOverOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVoiceOverOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VoiceOverOff"

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
    const v0, 0x4186147b    # 16.76f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ab851f    # 5.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4028f5c3    # -1.68f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fd851ec    # 1.69f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3db851ec    # 0.09f

    .line 89
    .line 90
    .line 91
    const v18, 0x406f5c29    # 3.74f

    .line 92
    .line 93
    .line 94
    const v13, 0x3f4ccccd    # 0.8f

    .line 95
    .line 96
    .line 97
    const v14, 0x3f90a3d7    # 1.13f

    .line 98
    .line 99
    .line 100
    const v15, 0x3f547ae1    # 0.83f

    .line 101
    .line 102
    .line 103
    const v16, 0x40251eb8    # 2.58f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x3fd9999a    # 1.7f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, -0x421eb852    # -0.11f

    .line 116
    .line 117
    .line 118
    const v18, -0x3f1bd70a    # -7.13f

    .line 119
    .line 120
    .line 121
    const v13, 0x3ff33333    # 1.9f

    .line 122
    .line 123
    .line 124
    const v14, -0x3ffeb852    # -2.02f

    .line 125
    .line 126
    .line 127
    const v15, 0x3fef5c29    # 1.87f

    .line 128
    .line 129
    .line 130
    const v16, -0x3f60a3d7    # -4.98f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x41a08f5c    # 20.07f

    .line 140
    .line 141
    .line 142
    const/high16 v2, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, -0x402f5c29    # -1.63f

    .line 148
    .line 149
    .line 150
    const v2, 0x3fd0a3d7    # 1.63f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x3e0f5c29    # 0.14f

    .line 157
    .line 158
    .line 159
    const v18, 0x4128f5c3    # 10.56f

    .line 160
    .line 161
    .line 162
    const v13, 0x402e147b    # 2.72f

    .line 163
    .line 164
    .line 165
    const v14, 0x403e147b    # 2.97f

    .line 166
    .line 167
    .line 168
    const v15, 0x4030a3d7    # 2.76f

    .line 169
    .line 170
    .line 171
    const v16, 0x40ec7ae1    # 7.39f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x3fd1eb85    # 1.64f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, -0x41e66666    # -0.15f

    .line 184
    .line 185
    .line 186
    const v18, -0x3ea2b852    # -13.83f

    .line 187
    .line 188
    .line 189
    const v13, 0x406f5c29    # 3.74f

    .line 190
    .line 191
    .line 192
    const v14, -0x3f870a3d    # -3.89f

    .line 193
    .line 194
    .line 195
    const v15, 0x406d70a4    # 3.71f

    .line 196
    .line 197
    .line 198
    const v16, -0x3ee28f5c    # -9.84f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x4116e148    # 9.43f

    .line 208
    .line 209
    .line 210
    const v2, 0x40a147ae    # 5.04f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x4061eb85    # 3.53f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x3f9e147b    # -3.53f

    .line 223
    .line 224
    .line 225
    const v18, -0x3f9e147b    # -3.53f

    .line 226
    .line 227
    .line 228
    const v13, -0x41b33333    # -0.2f

    .line 229
    .line 230
    .line 231
    const v14, -0x4011eb85    # -1.86f

    .line 232
    .line 233
    .line 234
    const v15, -0x402a3d71    # -1.67f

    .line 235
    .line 236
    .line 237
    const v16, -0x3faae148    # -3.33f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x40370a3d    # 2.86f

    .line 247
    .line 248
    .line 249
    const v2, 0x408d1eb8    # 4.41f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x4088a3d7    # 4.27f

    .line 256
    .line 257
    .line 258
    const/high16 v2, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x4027ae14    # 2.62f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x40a00000    # 5.0f

    .line 270
    .line 271
    const/high16 v18, 0x41100000    # 9.0f

    .line 272
    .line 273
    const v13, 0x40a75c29    # 5.23f

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x40f00000    # 7.5f

    .line 277
    .line 278
    const/high16 v15, 0x40a00000    # 5.0f

    .line 279
    .line 280
    const v16, 0x4103851f    # 8.22f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40800000    # 4.0f

    .line 287
    .line 288
    const/high16 v18, 0x40800000    # 4.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, 0x400d70a4    # 2.21f

    .line 292
    .line 293
    .line 294
    const v15, 0x3fe51eb8    # 1.79f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x40800000    # 4.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x40070a3d    # 2.11f

    .line 303
    .line 304
    .line 305
    const v18, -0x40e147ae    # -0.62f

    .line 306
    .line 307
    .line 308
    const v13, 0x3f47ae14    # 0.78f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 313
    .line 314
    const v16, -0x41947ae1    # -0.23f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x408ccccd    # 4.4f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x41100000    # 9.0f

    .line 327
    .line 328
    const/high16 v18, 0x41700000    # 15.0f

    .line 329
    .line 330
    const v13, 0x415bd70a    # 13.74f

    .line 331
    .line 332
    .line 333
    const v14, 0x4179999a    # 15.6f

    .line 334
    .line 335
    .line 336
    const v15, 0x412c7ae1    # 10.78f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x41700000    # 15.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, -0x3f000000    # -8.0f

    .line 345
    .line 346
    const/high16 v18, 0x40800000    # 4.0f

    .line 347
    .line 348
    const v13, -0x3fd51eb8    # -2.67f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const/high16 v15, -0x3f000000    # -8.0f

    .line 353
    .line 354
    const v16, 0x3fab851f    # 1.34f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x40000000    # 2.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41800000    # 16.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, -0x40000000    # -2.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x416b851f    # -0.29f

    .line 376
    .line 377
    .line 378
    const v18, -0x407d70a4    # -1.02f

    .line 379
    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const v14, -0x41428f5c    # -0.37f

    .line 383
    .line 384
    .line 385
    const v15, -0x421eb852    # -0.11f

    .line 386
    .line 387
    .line 388
    const v16, -0x40cccccd    # -0.7f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x419dd70a    # 19.73f

    .line 395
    .line 396
    .line 397
    const/high16 v2, 0x41a80000    # 21.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3fb47ae1    # 1.41f

    .line 403
    .line 404
    .line 405
    const v2, -0x404b851f    # -1.41f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x40370a3d    # 2.86f

    .line 412
    .line 413
    .line 414
    const v2, 0x408d1eb8    # 4.41f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41980000    # 19.0f

    .line 424
    .line 425
    const/high16 v2, 0x40400000    # 3.0f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40c00000    # 6.0f

    .line 431
    .line 432
    const/high16 v18, -0x40000000    # -2.0f

    .line 433
    .line 434
    const v13, 0x3e6147ae    # 0.22f

    .line 435
    .line 436
    .line 437
    const v14, -0x40c7ae14    # -0.72f

    .line 438
    .line 439
    .line 440
    const v15, 0x4053d70a    # 3.31f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x40000000    # -2.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v18, 0x40000000    # 2.0f

    .line 449
    .line 450
    const v13, 0x402ccccd    # 2.7f

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const v15, 0x40b9999a    # 5.8f

    .line 455
    .line 456
    .line 457
    const v16, 0x3fa51eb8    # 1.29f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x41100000    # 9.0f

    .line 470
    .line 471
    const/high16 v2, 0x41300000    # 11.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x40000000    # -2.0f

    .line 477
    .line 478
    const/high16 v18, -0x40000000    # -2.0f

    .line 479
    .line 480
    const v13, -0x40733333    # -1.1f

    .line 481
    .line 482
    .line 483
    const/high16 v15, -0x40000000    # -2.0f

    .line 484
    .line 485
    const v16, -0x4099999a    # -0.9f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3de147ae    # 0.11f

    .line 492
    .line 493
    .line 494
    const v18, -0x40e147ae    # -0.62f

    .line 495
    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x419eb852    # -0.22f

    .line 499
    .line 500
    .line 501
    const v15, 0x3d23d70a    # 0.04f

    .line 502
    .line 503
    .line 504
    const v16, -0x4128f5c3    # -0.42f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x4020a3d7    # 2.51f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, -0x40e147ae    # -0.62f

    .line 517
    .line 518
    .line 519
    const v18, 0x3de147ae    # 0.11f

    .line 520
    .line 521
    .line 522
    const v13, -0x41b33333    # -0.2f

    .line 523
    .line 524
    .line 525
    const v14, 0x3d8f5c29    # 0.07f

    .line 526
    .line 527
    .line 528
    const v15, -0x41333333    # -0.4f

    .line 529
    .line 530
    .line 531
    const v16, 0x3de147ae    # 0.11f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/16 v16, 0x3800

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    const/high16 v6, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v8, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/high16 v9, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v12, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v13, 0x0

    .line 558
    const/4 v14, 0x0

    .line 559
    const/4 v15, 0x0

    .line 560
    const-string v4, ""

    .line 561
    .line 562
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sput-object v0, Landroidx/compose/material/icons/outlined/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    return-object v0
.end method
