.class public final Landroidx/compose/material/icons/rounded/PinchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pinch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPinch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PinchKt;->_pinch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Pinch"

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
    const v0, 0x41033333    # 8.2f

    .line 71
    .line 72
    .line 73
    const v2, 0x418b70a4    # 17.43f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f9eb852    # 1.24f

    .line 80
    .line 81
    .line 82
    const v18, -0x40828f5c    # -0.99f

    .line 83
    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const v14, -0x40d9999a    # -0.65f

    .line 87
    .line 88
    .line 89
    const v15, 0x3f19999a    # 0.6f

    .line 90
    .line 91
    .line 92
    const v16, -0x406f5c29    # -1.13f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41500000    # 13.0f

    .line 99
    .line 100
    const v2, 0x4189eb85    # 17.24f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40d00000    # 6.5f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x41680000    # 14.5f

    .line 112
    .line 113
    const/high16 v18, 0x40a00000    # 5.0f

    .line 114
    .line 115
    const/high16 v13, 0x41500000    # 13.0f

    .line 116
    .line 117
    const v14, 0x40b570a4    # 5.67f

    .line 118
    .line 119
    .line 120
    const v15, 0x415ab852    # 13.67f

    .line 121
    .line 122
    .line 123
    const/high16 v16, 0x40a00000    # 5.0f

    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x40b570a4    # 5.67f

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x41800000    # 16.0f

    .line 132
    .line 133
    const/high16 v4, 0x40d00000    # 6.5f

    .line 134
    .line 135
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x3f68f5c3    # 0.91f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x3f63d70a    # 0.89f

    .line 150
    .line 151
    .line 152
    const v18, 0x3e570a3d    # 0.21f

    .line 153
    .line 154
    .line 155
    const v13, 0x3e9eb852    # 0.31f

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const v15, 0x3f1eb852    # 0.62f

    .line 160
    .line 161
    .line 162
    const v16, 0x3d8f5c29    # 0.07f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x4082e148    # 4.09f

    .line 169
    .line 170
    .line 171
    const v2, 0x40028f5c    # 2.04f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f8b851f    # 1.09f

    .line 178
    .line 179
    .line 180
    const v18, 0x40047ae1    # 2.07f

    .line 181
    .line 182
    .line 183
    const v13, 0x3f451eb8    # 0.77f

    .line 184
    .line 185
    .line 186
    const v14, 0x3ec28f5c    # 0.38f

    .line 187
    .line 188
    .line 189
    const v15, 0x3f9ae148    # 1.21f

    .line 190
    .line 191
    .line 192
    const v16, 0x3f9c28f6    # 1.22f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x40deb852    # -0.63f

    .line 199
    .line 200
    .line 201
    const v2, 0x408eb852    # 4.46f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x41a2f5c3    # 20.37f

    .line 208
    .line 209
    .line 210
    const/high16 v18, 0x41b80000    # 23.0f

    .line 211
    .line 212
    const v13, 0x41b1ae14    # 22.21f

    .line 213
    .line 214
    .line 215
    const v14, 0x41b228f6    # 22.27f

    .line 216
    .line 217
    .line 218
    const v15, 0x41aae148    # 21.36f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x41b80000    # 23.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, -0x3f3ae148    # -6.16f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x402b851f    # -1.66f

    .line 233
    .line 234
    .line 235
    const v18, -0x40e8f5c3    # -0.59f

    .line 236
    .line 237
    .line 238
    const v13, -0x40f851ec    # -0.53f

    .line 239
    .line 240
    .line 241
    const/4 v14, 0x0

    .line 242
    const v15, -0x405ae148    # -1.29f

    .line 243
    .line 244
    .line 245
    const v16, -0x41a8f5c3    # -0.21f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x3f7dc28f    # -4.07f

    .line 252
    .line 253
    .line 254
    const v2, -0x3f76b852    # -4.29f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x41033333    # 8.2f

    .line 261
    .line 262
    .line 263
    const v18, 0x418b70a4    # 17.43f

    .line 264
    .line 265
    .line 266
    const v13, 0x4104cccd    # 8.3f

    .line 267
    .line 268
    .line 269
    const v14, 0x418f851f    # 17.94f

    .line 270
    .line 271
    .line 272
    const v15, 0x41033333    # 8.2f

    .line 273
    .line 274
    .line 275
    const v16, 0x418d851f    # 17.69f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x40a80000    # 5.25f

    .line 285
    .line 286
    const/high16 v2, 0x41180000    # 9.5f

    .line 287
    .line 288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x41240000    # 10.25f

    .line 292
    .line 293
    const/high16 v18, 0x40c00000    # 6.0f

    .line 294
    .line 295
    const/high16 v13, 0x41180000    # 9.5f

    .line 296
    .line 297
    const v14, 0x40b51eb8    # 5.66f

    .line 298
    .line 299
    .line 300
    const v15, 0x411d70a4    # 9.84f

    .line 301
    .line 302
    .line 303
    const/high16 v16, 0x40c00000    # 6.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40b51eb8    # 5.66f

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x41300000    # 11.0f

    .line 312
    .line 313
    const/high16 v4, 0x40a80000    # 5.25f

    .line 314
    .line 315
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, -0x40800000    # -1.0f

    .line 324
    .line 325
    const/high16 v18, -0x40800000    # -1.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, -0x40f33333    # -0.55f

    .line 329
    .line 330
    .line 331
    const v15, -0x4119999a    # -0.45f

    .line 332
    .line 333
    .line 334
    const/high16 v16, -0x40800000    # -1.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x40d80000    # 6.75f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x40c00000    # 6.0f

    .line 345
    .line 346
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 347
    .line 348
    const v13, 0x40cae148    # 6.34f

    .line 349
    .line 350
    .line 351
    const/high16 v14, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v15, 0x40c00000    # 6.0f

    .line 354
    .line 355
    const v16, 0x3fab851f    # 1.34f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x40cae148    # 6.34f

    .line 362
    .line 363
    .line 364
    const/high16 v2, 0x40200000    # 2.5f

    .line 365
    .line 366
    const/high16 v4, 0x40d80000    # 6.75f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x3fd851ec    # 1.69f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x41070a3d    # 8.44f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40d80000    # 6.75f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 389
    .line 390
    const/high16 v18, 0x40c00000    # 6.0f

    .line 391
    .line 392
    const/high16 v13, 0x40200000    # 2.5f

    .line 393
    .line 394
    const v14, 0x40cae148    # 6.34f

    .line 395
    .line 396
    .line 397
    const v15, 0x400a3d71    # 2.16f

    .line 398
    .line 399
    .line 400
    const/high16 v16, 0x40c00000    # 6.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const v2, 0x40cae148    # 6.34f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41200000    # 10.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/high16 v18, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/4 v13, 0x0

    .line 423
    const v14, 0x3f0ccccd    # 0.55f

    .line 424
    .line 425
    .line 426
    const v15, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x3f800000    # 1.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40500000    # 3.25f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x40c00000    # 6.0f

    .line 440
    .line 441
    const/high16 v18, 0x41240000    # 10.25f

    .line 442
    .line 443
    const v13, 0x40b51eb8    # 5.66f

    .line 444
    .line 445
    .line 446
    const/high16 v14, 0x41300000    # 11.0f

    .line 447
    .line 448
    const/high16 v15, 0x40c00000    # 6.0f

    .line 449
    .line 450
    const v16, 0x412a8f5c    # 10.66f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x40b51eb8    # 5.66f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x40a80000    # 5.25f

    .line 460
    .line 461
    const/high16 v4, 0x41180000    # 9.5f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x4063d70a    # 3.56f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v2, 0x41180000    # 9.5f

    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40a80000    # 5.25f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    const/16 v16, 0x3800

    .line 490
    .line 491
    const/16 v17, 0x0

    .line 492
    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v8, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v7, 0x0

    .line 498
    const/high16 v9, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/high16 v12, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const/4 v14, 0x0

    .line 504
    const/4 v15, 0x0

    .line 505
    const-string v4, ""

    .line 506
    .line 507
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    sput-object v0, Landroidx/compose/material/icons/rounded/PinchKt;->_pinch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 516
    .line 517
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    return-object v0
.end method
