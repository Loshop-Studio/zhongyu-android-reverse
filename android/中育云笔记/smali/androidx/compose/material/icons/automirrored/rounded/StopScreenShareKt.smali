.class public final Landroidx/compose/material/icons/automirrored/rounded/StopScreenShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStopScreenShare(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/StopScreenShareKt;->_stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded.StopScreenShare"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x40666666    # -1.2f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, 0x3fe51eb8    # 1.79f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v17, 0x3ed1eb85    # 0.41f

    .line 90
    .line 91
    .line 92
    const v18, -0x40b5c28f    # -0.79f

    .line 93
    .line 94
    .line 95
    const v13, 0x3e75c28f    # 0.24f

    .line 96
    .line 97
    .line 98
    const v14, -0x41c7ae14    # -0.18f

    .line 99
    .line 100
    .line 101
    const v15, 0x3ed1eb85    # 0.41f

    .line 102
    .line 103
    .line 104
    const v16, -0x41147ae1    # -0.46f

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, -0x40800000    # -1.0f

    .line 111
    .line 112
    const/high16 v18, -0x40800000    # -1.0f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const v14, -0x40f33333    # -0.55f

    .line 116
    .line 117
    .line 118
    const v15, -0x4119999a    # -0.45f

    .line 119
    .line 120
    .line 121
    const/high16 v16, -0x40800000    # -1.0f

    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x4011eb85    # 2.28f

    .line 130
    .line 131
    .line 132
    const v2, 0x404eb852    # 3.23f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x404a3d71    # -1.42f

    .line 139
    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const v13, -0x413851ec    # -0.39f

    .line 144
    .line 145
    .line 146
    const v14, -0x413851ec    # -0.39f

    .line 147
    .line 148
    .line 149
    const v15, -0x407c28f6    # -1.03f

    .line 150
    .line 151
    .line 152
    const v16, -0x413851ec    # -0.39f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v18, 0x3fb47ae1    # 1.41f

    .line 161
    .line 162
    .line 163
    const v14, 0x3ec7ae14    # 0.39f

    .line 164
    .line 165
    .line 166
    const v15, -0x413851ec    # -0.39f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f828f5c    # 1.02f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3f570a3d    # 0.84f

    .line 176
    .line 177
    .line 178
    const v2, 0x3f5c28f6    # 0.86f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x3f11eb85    # 0.57f

    .line 185
    .line 186
    .line 187
    const v2, 0x3fbc28f6    # 1.47f

    .line 188
    .line 189
    .line 190
    const v4, -0x40d70a3d    # -0.66f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x40000000    # 2.0f

    .line 197
    .line 198
    const/high16 v18, 0x41800000    # 16.0f

    .line 199
    .line 200
    const/high16 v13, 0x40000000    # 2.0f

    .line 201
    .line 202
    const v14, 0x40dd70a4    # 6.92f

    .line 203
    .line 204
    .line 205
    const/high16 v15, 0x40000000    # 2.0f

    .line 206
    .line 207
    const/high16 v16, 0x41800000    # 16.0f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3c23d70a    # 0.01f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3ffc28f6    # 1.97f

    .line 219
    .line 220
    .line 221
    const v18, 0x3ffeb852    # 1.99f

    .line 222
    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const v14, 0x3f8b851f    # 1.09f

    .line 226
    .line 227
    .line 228
    const v15, 0x3f6147ae    # 0.88f

    .line 229
    .line 230
    .line 231
    const v16, 0x3ffd70a4    # 1.98f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x41900000    # 18.0f

    .line 238
    .line 239
    const/high16 v2, 0x3f800000    # 1.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/high16 v18, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v13, -0x40f33333    # -0.55f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v16, 0x3ee66666    # 0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x3ee66666    # 0.45f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x41890a3d    # 17.13f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40000000    # 2.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3fb47ae1    # 1.41f

    .line 278
    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const v13, 0x3ec7ae14    # 0.39f

    .line 283
    .line 284
    .line 285
    const v14, 0x3ec7ae14    # 0.39f

    .line 286
    .line 287
    .line 288
    const v15, 0x3f828f5c    # 1.02f

    .line 289
    .line 290
    .line 291
    const v16, 0x3ec7ae14    # 0.39f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    const v2, -0x404b851f    # -1.41f

    .line 299
    .line 300
    .line 301
    const v4, 0x3ec7ae14    # 0.39f

    .line 302
    .line 303
    .line 304
    const v6, -0x407d70a4    # -1.02f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x4011eb85    # 2.28f

    .line 311
    .line 312
    .line 313
    const v2, 0x404eb852    # 3.23f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x40e00000    # 7.0f

    .line 323
    .line 324
    const/high16 v2, 0x41700000    # 15.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x40051eb8    # 2.08f

    .line 330
    .line 331
    .line 332
    const v18, -0x3f7e6666    # -4.05f

    .line 333
    .line 334
    .line 335
    const v13, 0x3e9eb852    # 0.31f

    .line 336
    .line 337
    .line 338
    const v14, -0x40428f5c    # -1.48f

    .line 339
    .line 340
    .line 341
    const v15, 0x3f70a3d7    # 0.94f

    .line 342
    .line 343
    .line 344
    const v16, -0x3fc47ae1    # -2.93f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x3fcb851f    # 1.59f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40e00000    # 7.0f

    .line 357
    .line 358
    const/high16 v18, 0x41700000    # 15.0f

    .line 359
    .line 360
    const v13, 0x4112147b    # 9.13f

    .line 361
    .line 362
    .line 363
    const v14, 0x414eb852    # 12.92f

    .line 364
    .line 365
    .line 366
    const v15, 0x40feb852    # 7.96f

    .line 367
    .line 368
    .line 369
    const v16, 0x415b5c29    # 13.71f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41500000    # 13.0f

    .line 379
    .line 380
    const v2, 0x4112147b    # 9.13f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x40851eb8    # -0.98f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, 0x3f570a3d    # 0.84f

    .line 393
    .line 394
    .line 395
    const v18, -0x41428f5c    # -0.37f

    .line 396
    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, -0x411eb852    # -0.44f

    .line 400
    .line 401
    .line 402
    const v15, 0x3f051eb8    # 0.52f

    .line 403
    .line 404
    .line 405
    const v16, -0x40d70a3d    # -0.66f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x410deb85    # 8.87f

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x41700000    # 15.0f

    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3fce147b    # 1.61f

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/16 v17, 0x0

    .line 428
    .line 429
    const v18, 0x3f3ae148    # 0.73f

    .line 430
    .line 431
    .line 432
    const v13, 0x3e570a3d    # 0.21f

    .line 433
    .line 434
    .line 435
    const v14, 0x3e4ccccd    # 0.2f

    .line 436
    .line 437
    .line 438
    const v15, 0x3e570a3d    # 0.21f

    .line 439
    .line 440
    .line 441
    const v16, 0x3f07ae14    # 0.53f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x409c28f6    # -0.89f

    .line 448
    .line 449
    .line 450
    const v2, 0x3f547ae1    # 0.83f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x40b28f5c    # 5.58f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3f333333    # 0.7f

    .line 463
    .line 464
    .line 465
    const v18, -0x403eb852    # -1.51f

    .line 466
    .line 467
    .line 468
    const v13, 0x3edc28f6    # 0.43f

    .line 469
    .line 470
    .line 471
    const v14, -0x41428f5c    # -0.37f

    .line 472
    .line 473
    .line 474
    const v15, 0x3f333333    # 0.7f

    .line 475
    .line 476
    .line 477
    const v16, -0x4099999a    # -0.9f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41b00000    # 22.0f

    .line 484
    .line 485
    const/high16 v2, 0x40c00000    # 6.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x40028f5c    # -1.98f

    .line 491
    .line 492
    .line 493
    const v18, -0x40028f5c    # -1.98f

    .line 494
    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const v14, -0x40747ae1    # -1.09f

    .line 498
    .line 499
    .line 500
    const v15, -0x409c28f6    # -0.89f

    .line 501
    .line 502
    .line 503
    const v16, -0x40028f5c    # -1.98f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x40f9999a    # 7.8f

    .line 510
    .line 511
    .line 512
    const v2, 0x4080a3d7    # 4.02f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x40a47ae1    # 5.14f

    .line 519
    .line 520
    .line 521
    const v2, 0x40a428f6    # 5.13f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x3d75c28f    # 0.06f

    .line 528
    .line 529
    .line 530
    const v18, -0x435c28f6    # -0.02f

    .line 531
    .line 532
    .line 533
    const v13, 0x3ca3d70a    # 0.02f

    .line 534
    .line 535
    .line 536
    const v14, -0x43dc28f6    # -0.01f

    .line 537
    .line 538
    .line 539
    const v15, 0x3d23d70a    # 0.04f

    .line 540
    .line 541
    .line 542
    const v16, -0x435c28f6    # -0.02f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/StopScreenShareKt;->_stopScreenShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-object v0
.end method
