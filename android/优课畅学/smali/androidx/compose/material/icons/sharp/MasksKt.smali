.class public final Landroidx/compose/material/icons/sharp/MasksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _masks:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMasks(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Masks"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fe147ae    # -2.48f

    .line 78
    .line 79
    .line 80
    const v18, 0x40133333    # 2.3f

    .line 81
    .line 82
    .line 83
    const v13, -0x405851ec    # -1.31f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fe851ec    # -2.37f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f8147ae    # 1.01f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v18, 0x40d00000    # 6.5f

    .line 99
    .line 100
    const v13, 0x41723d71    # 15.14f

    .line 101
    .line 102
    .line 103
    const v14, 0x40f9999a    # 7.8f

    .line 104
    .line 105
    .line 106
    const v15, 0x4162e148    # 14.18f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40d00000    # 6.5f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x3f5f5c29    # -5.02f

    .line 115
    .line 116
    .line 117
    const v18, 0x3fe66666    # 1.8f

    .line 118
    .line 119
    .line 120
    const v13, -0x3ff3d70a    # -2.19f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x3fb70a3d    # -3.14f

    .line 125
    .line 126
    .line 127
    const v16, 0x3fa66666    # 1.3f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x40900000    # 4.5f

    .line 134
    .line 135
    const/high16 v18, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v13, 0x40dbd70a    # 6.87f

    .line 138
    .line 139
    .line 140
    const v14, 0x40e0a3d7    # 7.02f

    .line 141
    .line 142
    .line 143
    const v15, 0x40b9eb85    # 5.81f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40c00000    # 6.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x40000000    # 2.0f

    .line 152
    .line 153
    const/high16 v18, 0x41080000    # 8.5f

    .line 154
    .line 155
    const v13, 0x4047ae14    # 3.12f

    .line 156
    .line 157
    .line 158
    const/high16 v14, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v15, 0x40000000    # 2.0f

    .line 161
    .line 162
    const v16, 0x40e3d70a    # 7.12f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41100000    # 9.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x40d0a3d7    # 6.52f

    .line 174
    .line 175
    .line 176
    const v18, 0x40ff5c29    # 7.98f

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const v15, 0x40666666    # 3.6f

    .line 181
    .line 182
    .line 183
    const v16, 0x40f9eb85    # 7.81f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41400000    # 12.0f

    .line 190
    .line 191
    const/high16 v18, 0x41900000    # 18.0f

    .line 192
    .line 193
    const v13, 0x41187ae1    # 9.53f

    .line 194
    .line 195
    .line 196
    const v14, 0x418cf5c3    # 17.62f

    .line 197
    .line 198
    .line 199
    const v15, 0x412b851f    # 10.72f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x41900000    # 18.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x405eb852    # 3.48f

    .line 208
    .line 209
    .line 210
    const v2, -0x407d70a4    # -1.02f

    .line 211
    .line 212
    .line 213
    const v4, 0x401e147b    # 2.47f

    .line 214
    .line 215
    .line 216
    const v6, -0x413d70a4    # -0.38f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41b00000    # 22.0f

    .line 223
    .line 224
    const/high16 v18, 0x41100000    # 9.0f

    .line 225
    .line 226
    const v13, 0x41933333    # 18.4f

    .line 227
    .line 228
    .line 229
    const v14, 0x41867ae1    # 16.81f

    .line 230
    .line 231
    .line 232
    const/high16 v15, 0x41b00000    # 22.0f

    .line 233
    .line 234
    const/high16 v16, 0x41700000    # 15.0f

    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41080000    # 8.5f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x419c0000    # 19.5f

    .line 245
    .line 246
    const/high16 v18, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v13, 0x41b00000    # 22.0f

    .line 249
    .line 250
    const v14, 0x40e3d70a    # 7.12f

    .line 251
    .line 252
    .line 253
    const v15, 0x41a70a3d    # 20.88f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x40c00000    # 6.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40600000    # 3.5f

    .line 265
    .line 266
    const/high16 v2, 0x41100000    # 9.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41080000    # 8.5f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v18, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ee66666    # 0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    const/high16 v2, 0x3f800000    # 1.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40400000    # 3.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f8147ae    # 1.01f

    .line 306
    .line 307
    .line 308
    const v18, 0x405eb852    # 3.48f

    .line 309
    .line 310
    .line 311
    const v14, 0x3fa3d70a    # 1.28f

    .line 312
    .line 313
    .line 314
    const v15, 0x3ec28f5c    # 0.38f

    .line 315
    .line 316
    .line 317
    const v16, 0x401e147b    # 2.47f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40600000    # 3.5f

    .line 324
    .line 325
    const/high16 v18, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v13, 0x409fae14    # 4.99f

    .line 328
    .line 329
    .line 330
    const v14, 0x416451ec    # 14.27f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x40600000    # 3.5f

    .line 334
    .line 335
    const v16, 0x414a6666    # 12.65f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41a40000    # 20.5f

    .line 345
    .line 346
    const/high16 v2, 0x41100000    # 9.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x3fbf5c29    # -3.01f

    .line 352
    .line 353
    .line 354
    const v18, 0x40bf5c29    # 5.98f

    .line 355
    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const v14, 0x4069999a    # 3.65f

    .line 359
    .line 360
    .line 361
    const v15, -0x404147ae    # -1.49f

    .line 362
    .line 363
    .line 364
    const v16, 0x40a8a3d7    # 5.27f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3f8147ae    # 1.01f

    .line 371
    .line 372
    .line 373
    const v18, -0x3fa147ae    # -3.48f

    .line 374
    .line 375
    .line 376
    const v13, 0x3f23d70a    # 0.64f

    .line 377
    .line 378
    .line 379
    const v14, -0x407eb852    # -1.01f

    .line 380
    .line 381
    .line 382
    const v15, 0x3f8147ae    # 1.01f

    .line 383
    .line 384
    .line 385
    const v16, -0x3ff33333    # -2.2f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v18, -0x40800000    # -1.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v14, -0x40f33333    # -0.55f

    .line 402
    .line 403
    .line 404
    const v15, 0x3ee66666    # 0.45f

    .line 405
    .line 406
    .line 407
    const/high16 v16, -0x40800000    # -1.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3ee66666    # 0.45f

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x3f800000    # 1.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41100000    # 9.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x412b0a3d    # 10.69f

    .line 429
    .line 430
    .line 431
    const v2, 0x4127ae14    # 10.48f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x4027ae14    # -1.69f

    .line 438
    .line 439
    .line 440
    const v18, 0x3f428f5c    # 0.76f

    .line 441
    .line 442
    .line 443
    const v13, -0x411eb852    # -0.44f

    .line 444
    .line 445
    .line 446
    const v14, 0x3e851eb8    # 0.26f

    .line 447
    .line 448
    .line 449
    const v15, -0x408a3d71    # -0.96f

    .line 450
    .line 451
    .line 452
    const v16, 0x3f0f5c29    # 0.56f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x41233333    # 10.2f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x3f970a3d    # 1.18f

    .line 465
    .line 466
    .line 467
    const v18, -0x40eb851f    # -0.58f

    .line 468
    .line 469
    .line 470
    const v13, 0x3ef5c28f    # 0.48f

    .line 471
    .line 472
    .line 473
    const v14, -0x41d1eb85    # -0.17f

    .line 474
    .line 475
    .line 476
    const v15, 0x3f570a3d    # 0.84f

    .line 477
    .line 478
    .line 479
    const v16, -0x413d70a4    # -0.38f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x41400000    # 12.0f

    .line 486
    .line 487
    const/high16 v18, 0x41100000    # 9.0f

    .line 488
    .line 489
    const v13, 0x412b851f    # 10.72f

    .line 490
    .line 491
    .line 492
    const v14, 0x4114cccd    # 9.3f

    .line 493
    .line 494
    .line 495
    const v15, 0x4133ae14    # 11.23f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x41100000    # 9.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x3fe66666    # 1.8f

    .line 504
    .line 505
    .line 506
    const v2, 0x3f1eb852    # 0.62f

    .line 507
    .line 508
    .line 509
    const v4, 0x3fa28f5c    # 1.27f

    .line 510
    .line 511
    .line 512
    const v6, 0x3e99999a    # 0.3f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x3f99999a    # 1.2f

    .line 519
    .line 520
    .line 521
    const v18, 0x3f170a3d    # 0.59f

    .line 522
    .line 523
    .line 524
    const v13, 0x3eae147b    # 0.34f

    .line 525
    .line 526
    .line 527
    const v14, 0x3e4ccccd    # 0.2f

    .line 528
    .line 529
    .line 530
    const v15, 0x3f35c28f    # 0.71f

    .line 531
    .line 532
    .line 533
    const v16, 0x3ed70a3d    # 0.42f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3f851eb8    # 1.04f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, -0x40251eb8    # -1.71f

    .line 546
    .line 547
    .line 548
    const v18, -0x40b851ec    # -0.78f

    .line 549
    .line 550
    .line 551
    const/high16 v13, -0x40c00000    # -0.75f

    .line 552
    .line 553
    const v14, -0x41a8f5c3    # -0.21f

    .line 554
    .line 555
    .line 556
    const v15, -0x405eb852    # -1.26f

    .line 557
    .line 558
    .line 559
    const v16, -0x40fd70a4    # -0.51f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41400000    # 12.0f

    .line 566
    .line 567
    const/high16 v18, 0x41200000    # 10.0f

    .line 568
    .line 569
    const v13, 0x414d47ae    # 12.83f

    .line 570
    .line 571
    .line 572
    const v14, 0x41233333    # 10.2f

    .line 573
    .line 574
    .line 575
    const v15, 0x4147d70a    # 12.49f

    .line 576
    .line 577
    .line 578
    const/high16 v16, 0x41200000    # 10.0f

    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, 0x412b0a3d    # 10.69f

    .line 584
    .line 585
    .line 586
    const v18, 0x4127ae14    # 10.48f

    .line 587
    .line 588
    .line 589
    const v13, 0x413828f6    # 11.51f

    .line 590
    .line 591
    .line 592
    const/high16 v14, 0x41200000    # 10.0f

    .line 593
    .line 594
    const v15, 0x41328f5c    # 11.16f

    .line 595
    .line 596
    .line 597
    const v16, 0x41233333    # 10.2f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    const/16 v16, 0x3800

    .line 611
    .line 612
    const/16 v17, 0x0

    .line 613
    .line 614
    const/high16 v6, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/high16 v8, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v7, 0x0

    .line 619
    const/high16 v9, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/high16 v12, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const/4 v14, 0x0

    .line 625
    const/4 v15, 0x0

    .line 626
    const-string v4, ""

    .line 627
    .line 628
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    sput-object v0, Landroidx/compose/material/icons/sharp/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-object v0
.end method
