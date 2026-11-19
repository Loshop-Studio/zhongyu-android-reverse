.class public final Landroidx/compose/material/icons/outlined/PaidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _paid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPaid(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Paid"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x418c28f6    # 17.52f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v4, 0x41400000    # 12.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const/high16 v2, 0x41400000    # 12.0f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, -0x3f000000    # -8.0f

    .line 133
    .line 134
    const/high16 v18, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const v13, -0x3f72e148    # -4.41f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, -0x3f000000    # -8.0f

    .line 141
    .line 142
    const v16, -0x3f9a3d71    # -3.59f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x41000000    # 8.0f

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const v14, -0x3f72e148    # -4.41f

    .line 152
    .line 153
    .line 154
    const v15, 0x4065c28f    # 3.59f

    .line 155
    .line 156
    .line 157
    const/high16 v16, -0x3f000000    # -8.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x4065c28f    # 3.59f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41000000    # 8.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x41400000    # 12.0f

    .line 171
    .line 172
    const/high16 v18, 0x41a00000    # 20.0f

    .line 173
    .line 174
    const/high16 v13, 0x41a00000    # 20.0f

    .line 175
    .line 176
    const v14, 0x418347ae    # 16.41f

    .line 177
    .line 178
    .line 179
    const v15, 0x418347ae    # 16.41f

    .line 180
    .line 181
    .line 182
    const/high16 v16, 0x41a00000    # 20.0f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x414e3d71    # 12.89f

    .line 191
    .line 192
    .line 193
    const v2, 0x4131999a    # 11.1f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, -0x3fd70a3d    # -2.64f

    .line 200
    .line 201
    .line 202
    const v18, -0x400ccccd    # -1.9f

    .line 203
    .line 204
    .line 205
    const v13, -0x401c28f6    # -1.78f

    .line 206
    .line 207
    .line 208
    const v14, -0x40e8f5c3    # -0.59f

    .line 209
    .line 210
    .line 211
    const v15, -0x3fd70a3d    # -2.64f

    .line 212
    .line 213
    .line 214
    const v16, -0x408a3d71    # -0.96f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3fe7ae14    # 1.81f

    .line 221
    .line 222
    .line 223
    const v18, -0x404e147b    # -1.39f

    .line 224
    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, -0x407d70a4    # -1.02f

    .line 228
    .line 229
    .line 230
    const v15, 0x3f8e147b    # 1.11f

    .line 231
    .line 232
    .line 233
    const v16, -0x404e147b    # -1.39f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x3ff33333    # 1.9f

    .line 240
    .line 241
    .line 242
    const v18, 0x3fab851f    # 1.34f

    .line 243
    .line 244
    .line 245
    const v13, 0x3fa7ae14    # 1.31f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, 0x3fe51eb8    # 1.79f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f7d70a4    # 0.99f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x3fca3d71    # 1.58f

    .line 259
    .line 260
    .line 261
    const v2, -0x40d47ae1    # -0.67f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x3fd5c28f    # -2.66f

    .line 268
    .line 269
    .line 270
    const v18, -0x3ff147ae    # -2.23f

    .line 271
    .line 272
    .line 273
    const v13, -0x41e66666    # -0.15f

    .line 274
    .line 275
    .line 276
    const v14, -0x411eb852    # -0.44f

    .line 277
    .line 278
    .line 279
    const v15, -0x40ae147b    # -0.82f

    .line 280
    .line 281
    .line 282
    const v16, -0x400b851f    # -1.91f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40a00000    # 5.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, -0x40200000    # -1.75f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3fa147ae    # 1.26f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, -0x3fd851ec    # -2.62f

    .line 305
    .line 306
    .line 307
    const v18, 0x403d70a4    # 2.96f

    .line 308
    .line 309
    .line 310
    const v13, -0x3fd9999a    # -2.6f

    .line 311
    .line 312
    .line 313
    const v14, 0x3f0f5c29    # 0.56f

    .line 314
    .line 315
    .line 316
    const v15, -0x3fd851ec    # -2.62f

    .line 317
    .line 318
    .line 319
    const v16, 0x40366666    # 2.85f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x40566666    # 3.35f

    .line 326
    .line 327
    .line 328
    const v18, 0x4053d70a    # 3.31f

    .line 329
    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, 0x401147ae    # 2.27f

    .line 333
    .line 334
    .line 335
    const/high16 v15, 0x40100000    # 2.25f

    .line 336
    .line 337
    const v16, 0x403a3d71    # 2.91f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x4011eb85    # 2.28f

    .line 344
    .line 345
    .line 346
    const v18, 0x4001eb85    # 2.03f

    .line 347
    .line 348
    .line 349
    const v13, 0x3fca3d71    # 1.58f

    .line 350
    .line 351
    .line 352
    const v14, 0x3f0f5c29    # 0.56f

    .line 353
    .line 354
    .line 355
    const v15, 0x4011eb85    # 2.28f

    .line 356
    .line 357
    .line 358
    const v16, 0x3f88f5c3    # 1.07f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x40028f5c    # -1.98f

    .line 365
    .line 366
    .line 367
    const v18, 0x3fce147b    # 1.61f

    .line 368
    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    const v14, 0x3f90a3d7    # 1.13f

    .line 372
    .line 373
    .line 374
    const v15, -0x4079999a    # -1.05f

    .line 375
    .line 376
    .line 377
    const v16, 0x3fce147b    # 1.61f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, -0x3fe66666    # -2.4f

    .line 384
    .line 385
    .line 386
    const v18, -0x3ffa3d71    # -2.09f

    .line 387
    .line 388
    .line 389
    const v13, -0x40170a3d    # -1.82f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const v15, -0x3fea3d71    # -2.34f

    .line 394
    .line 395
    .line 396
    const v16, -0x4010a3d7    # -1.87f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x4101999a    # 8.1f

    .line 403
    .line 404
    .line 405
    const/high16 v2, 0x416c0000    # 14.75f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x404147ae    # 3.02f

    .line 411
    .line 412
    .line 413
    const v18, 0x403d70a4    # 2.96f

    .line 414
    .line 415
    .line 416
    const v13, 0x3f2147ae    # 0.63f

    .line 417
    .line 418
    .line 419
    const v14, 0x400c28f6    # 2.19f

    .line 420
    .line 421
    .line 422
    const v15, 0x4011eb85    # 2.28f

    .line 423
    .line 424
    .line 425
    const v16, 0x4031eb85    # 2.78f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41980000    # 19.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x406147ae    # -1.24f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v18, -0x3fb1eb85    # -3.22f

    .line 448
    .line 449
    .line 450
    const v13, 0x3f051eb8    # 0.52f

    .line 451
    .line 452
    .line 453
    const v14, -0x4247ae14    # -0.09f

    .line 454
    .line 455
    .line 456
    const v15, 0x404147ae    # 3.02f

    .line 457
    .line 458
    .line 459
    const v16, -0x40e8f5c3    # -0.59f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, 0x414e3d71    # 12.89f

    .line 466
    .line 467
    .line 468
    const v18, 0x4131999a    # 11.1f

    .line 469
    .line 470
    .line 471
    const v13, 0x417e6666    # 15.9f

    .line 472
    .line 473
    .line 474
    const v14, 0x41526666    # 13.15f

    .line 475
    .line 476
    .line 477
    const v15, 0x4174a3d7    # 15.29f

    .line 478
    .line 479
    .line 480
    const v16, 0x413ee148    # 11.93f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/16 v16, 0x3800

    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const/high16 v6, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/high16 v8, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/4 v7, 0x0

    .line 502
    const/high16 v9, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/high16 v12, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const/4 v14, 0x0

    .line 508
    const/4 v15, 0x0

    .line 509
    const-string v4, ""

    .line 510
    .line 511
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    sput-object v0, Landroidx/compose/material/icons/outlined/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 520
    .line 521
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    return-object v0
.end method
