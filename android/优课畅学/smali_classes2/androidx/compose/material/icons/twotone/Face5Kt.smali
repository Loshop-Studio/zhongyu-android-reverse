.class public final Landroidx/compose/material/icons/twotone/Face5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _face5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace5(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Face5Kt;->_face5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Face5"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x408f5c29    # 4.48f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41200000    # 10.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f70a3d7    # -4.48f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 108
    .line 109
    const/high16 v7, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x418c28f6    # 17.52f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40000000    # 2.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41a00000    # 20.0f

    .line 128
    .line 129
    const/high16 v6, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const/high16 v26, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const v21, -0x3f72e148    # -4.41f

    .line 139
    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const/high16 v23, -0x3f000000    # -8.0f

    .line 144
    .line 145
    const v24, -0x3f9a3d71    # -3.59f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, 0x3f266666    # 0.65f

    .line 152
    .line 153
    .line 154
    const v26, -0x3fb66666    # -3.15f

    .line 155
    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const v22, -0x4070a3d7    # -1.12f

    .line 160
    .line 161
    .line 162
    const v23, 0x3e6b851f    # 0.23f

    .line 163
    .line 164
    .line 165
    const v24, -0x3ff47ae1    # -2.18f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x40a00000    # 5.0f

    .line 172
    .line 173
    const/high16 v26, 0x41100000    # 9.0f

    .line 174
    .line 175
    const v21, 0x4097ae14    # 4.74f

    .line 176
    .line 177
    .line 178
    const v22, 0x410f0a3d    # 8.94f

    .line 179
    .line 180
    .line 181
    const v23, 0x409b851f    # 4.86f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x41100000    # 9.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, 0x3f000000    # 0.5f

    .line 190
    .line 191
    const/high16 v26, -0x41000000    # -0.5f

    .line 192
    .line 193
    const v21, 0x3e8f5c29    # 0.28f

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/high16 v23, 0x3f000000    # 0.5f

    .line 199
    .line 200
    const v24, -0x419eb852    # -0.22f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v25, -0x4123d70a    # -0.43f

    .line 207
    .line 208
    .line 209
    const v26, -0x41051eb8    # -0.49f

    .line 210
    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    const/high16 v22, -0x41800000    # -0.25f

    .line 215
    .line 216
    const v23, -0x41bd70a4    # -0.19f

    .line 217
    .line 218
    .line 219
    const v24, -0x4119999a    # -0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, 0x3efae148    # 0.49f

    .line 226
    .line 227
    .line 228
    const/high16 v26, -0x40c00000    # -0.75f

    .line 229
    .line 230
    const v21, 0x3e19999a    # 0.15f

    .line 231
    .line 232
    .line 233
    const v22, -0x417ae148    # -0.26f

    .line 234
    .line 235
    .line 236
    const v23, 0x3ea3d70a    # 0.32f

    .line 237
    .line 238
    .line 239
    const v24, -0x40fd70a4    # -0.51f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x40b00000    # 5.5f

    .line 246
    .line 247
    const/high16 v26, 0x40f00000    # 7.5f

    .line 248
    .line 249
    const v21, 0x40b0f5c3    # 5.53f

    .line 250
    .line 251
    .line 252
    const v22, 0x40eae148    # 7.34f

    .line 253
    .line 254
    .line 255
    const/high16 v23, 0x40b00000    # 5.5f

    .line 256
    .line 257
    const v24, 0x40ed1eb8    # 7.41f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v25, 0x40c00000    # 6.0f

    .line 264
    .line 265
    const/high16 v26, 0x41000000    # 8.0f

    .line 266
    .line 267
    const/high16 v21, 0x40b00000    # 5.5f

    .line 268
    .line 269
    const v22, 0x40f8f5c3    # 7.78f

    .line 270
    .line 271
    .line 272
    const v23, 0x40b70a3d    # 5.72f

    .line 273
    .line 274
    .line 275
    const/high16 v24, 0x41000000    # 8.0f

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v4, -0x419eb852    # -0.22f

    .line 281
    .line 282
    .line 283
    const/high16 v6, 0x3f000000    # 0.5f

    .line 284
    .line 285
    const/high16 v7, -0x41000000    # -0.5f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v26, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/high16 v21, 0x40d00000    # 6.5f

    .line 293
    .line 294
    const v22, 0x40e70a3d    # 7.22f

    .line 295
    .line 296
    .line 297
    const v23, 0x40c8f5c3    # 6.28f

    .line 298
    .line 299
    .line 300
    const/high16 v24, 0x40e00000    # 7.0f

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v25, 0x40b51eb8    # 5.66f

    .line 306
    .line 307
    .line 308
    const v26, 0x40e428f6    # 7.13f

    .line 309
    .line 310
    .line 311
    const v21, 0x40bbd70a    # 5.87f

    .line 312
    .line 313
    .line 314
    const/high16 v22, 0x40e00000    # 7.0f

    .line 315
    .line 316
    const/high16 v23, 0x40b80000    # 5.75f

    .line 317
    .line 318
    const v24, 0x40e1999a    # 7.05f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v25, 0x3fee147b    # 1.86f

    .line 325
    .line 326
    .line 327
    const v26, -0x401eb852    # -1.76f

    .line 328
    .line 329
    .line 330
    const v21, 0x3f051eb8    # 0.52f

    .line 331
    .line 332
    .line 333
    const v22, -0x40d1eb85    # -0.68f

    .line 334
    .line 335
    .line 336
    const v23, 0x3f933333    # 1.15f

    .line 337
    .line 338
    .line 339
    const v24, -0x405c28f6    # -1.28f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, 0x40f00000    # 7.5f

    .line 346
    .line 347
    const/high16 v26, 0x40b00000    # 5.5f

    .line 348
    .line 349
    const v21, 0x40f051ec    # 7.51f

    .line 350
    .line 351
    .line 352
    const v22, 0x40ad1eb8    # 5.41f

    .line 353
    .line 354
    .line 355
    const/high16 v23, 0x40f00000    # 7.5f

    .line 356
    .line 357
    const v24, 0x40ae6666    # 5.45f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x41000000    # 8.0f

    .line 364
    .line 365
    const/high16 v26, 0x40c00000    # 6.0f

    .line 366
    .line 367
    const/high16 v21, 0x40f00000    # 7.5f

    .line 368
    .line 369
    const v22, 0x40b8f5c3    # 5.78f

    .line 370
    .line 371
    .line 372
    const v23, 0x40f70a3d    # 7.72f

    .line 373
    .line 374
    .line 375
    const/high16 v24, 0x40c00000    # 6.0f

    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, -0x41333333    # -0.4f

    .line 384
    .line 385
    .line 386
    const v26, -0x410a3d71    # -0.48f

    .line 387
    .line 388
    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    const v22, -0x418a3d71    # -0.24f

    .line 392
    .line 393
    .line 394
    const v23, -0x41d1eb85    # -0.17f

    .line 395
    .line 396
    .line 397
    const v24, -0x4123d70a    # -0.43f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v25, 0x3efae148    # 0.49f

    .line 404
    .line 405
    .line 406
    const/high16 v26, -0x41800000    # -0.25f

    .line 407
    .line 408
    const v21, 0x3e23d70a    # 0.16f

    .line 409
    .line 410
    .line 411
    const v22, -0x4247ae14    # -0.09f

    .line 412
    .line 413
    .line 414
    const v23, 0x3ea3d70a    # 0.32f

    .line 415
    .line 416
    .line 417
    const v24, -0x41d1eb85    # -0.17f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v25, 0x41100000    # 9.0f

    .line 424
    .line 425
    const/high16 v26, 0x40a00000    # 5.0f

    .line 426
    .line 427
    const v21, 0x410ae148    # 8.68f

    .line 428
    .line 429
    .line 430
    const v22, 0x409d1eb8    # 4.91f

    .line 431
    .line 432
    .line 433
    const v23, 0x410d47ae    # 8.83f

    .line 434
    .line 435
    .line 436
    const/high16 v24, 0x40a00000    # 5.0f

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x3f000000    # 0.5f

    .line 442
    .line 443
    const/high16 v26, -0x41000000    # -0.5f

    .line 444
    .line 445
    const v21, 0x3e8f5c29    # 0.28f

    .line 446
    .line 447
    .line 448
    const/16 v22, 0x0

    .line 449
    .line 450
    const/high16 v23, 0x3f000000    # 0.5f

    .line 451
    .line 452
    const v24, -0x419eb852    # -0.22f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v25, -0x435c28f6    # -0.02f

    .line 459
    .line 460
    .line 461
    const v26, -0x4247ae14    # -0.09f

    .line 462
    .line 463
    .line 464
    const/16 v21, 0x0

    .line 465
    .line 466
    const v22, -0x430a3d71    # -0.03f

    .line 467
    .line 468
    .line 469
    const v23, -0x43dc28f6    # -0.01f

    .line 470
    .line 471
    .line 472
    const v24, -0x428a3d71    # -0.06f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v25, 0x3f9ae148    # 1.21f

    .line 479
    .line 480
    .line 481
    const v26, -0x41666666    # -0.3f

    .line 482
    .line 483
    .line 484
    const v21, 0x3ec7ae14    # 0.39f

    .line 485
    .line 486
    .line 487
    const v22, -0x41fae148    # -0.13f

    .line 488
    .line 489
    .line 490
    const v23, 0x3f4a3d71    # 0.79f

    .line 491
    .line 492
    .line 493
    const v24, -0x41947ae1    # -0.23f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v25, 0x41280000    # 10.5f

    .line 500
    .line 501
    const/high16 v26, 0x40900000    # 4.5f

    .line 502
    .line 503
    const v21, 0x412947ae    # 10.58f

    .line 504
    .line 505
    .line 506
    const v22, 0x4086b852    # 4.21f

    .line 507
    .line 508
    .line 509
    const/high16 v23, 0x41280000    # 10.5f

    .line 510
    .line 511
    const v24, 0x408ae148    # 4.34f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v25, 0x41300000    # 11.0f

    .line 518
    .line 519
    const/high16 v26, 0x40a00000    # 5.0f

    .line 520
    .line 521
    const/high16 v21, 0x41280000    # 10.5f

    .line 522
    .line 523
    const v22, 0x4098f5c3    # 4.78f

    .line 524
    .line 525
    .line 526
    const v23, 0x412b851f    # 10.72f

    .line 527
    .line 528
    .line 529
    const/high16 v24, 0x40a00000    # 5.0f

    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, -0x41666666    # -0.3f

    .line 538
    .line 539
    .line 540
    const v26, -0x41147ae1    # -0.46f

    .line 541
    .line 542
    .line 543
    const/16 v21, 0x0

    .line 544
    .line 545
    const v22, -0x41a8f5c3    # -0.21f

    .line 546
    .line 547
    .line 548
    const v23, -0x41fae148    # -0.13f

    .line 549
    .line 550
    .line 551
    const v24, -0x413d70a4    # -0.38f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v25, 0x41400000    # 12.0f

    .line 558
    .line 559
    const/high16 v26, 0x40800000    # 4.0f

    .line 560
    .line 561
    const v21, 0x41375c29    # 11.46f

    .line 562
    .line 563
    .line 564
    const v22, 0x408051ec    # 4.01f

    .line 565
    .line 566
    .line 567
    const v23, 0x413bae14    # 11.73f

    .line 568
    .line 569
    .line 570
    const/high16 v24, 0x40800000    # 4.0f

    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v4, 0x3f4ccccd    # 0.8f

    .line 576
    .line 577
    .line 578
    const v6, 0x3d23d70a    # 0.04f

    .line 579
    .line 580
    .line 581
    const v7, 0x3f0a3d71    # 0.54f

    .line 582
    .line 583
    .line 584
    const v8, 0x3c23d70a    # 0.01f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v25, -0x41666666    # -0.3f

    .line 591
    .line 592
    .line 593
    const v26, 0x3eeb851f    # 0.46f

    .line 594
    .line 595
    .line 596
    const v21, -0x41c7ae14    # -0.18f

    .line 597
    .line 598
    .line 599
    const v22, 0x3da3d70a    # 0.08f

    .line 600
    .line 601
    .line 602
    const v23, -0x41666666    # -0.3f

    .line 603
    .line 604
    .line 605
    const/high16 v24, 0x3e800000    # 0.25f

    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v25, 0x41500000    # 13.0f

    .line 611
    .line 612
    const/high16 v26, 0x40a00000    # 5.0f

    .line 613
    .line 614
    const/high16 v21, 0x41480000    # 12.5f

    .line 615
    .line 616
    const v22, 0x4098f5c3    # 4.78f

    .line 617
    .line 618
    .line 619
    const v23, 0x414b851f    # 12.72f

    .line 620
    .line 621
    .line 622
    const/high16 v24, 0x40a00000    # 5.0f

    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v4, -0x419eb852    # -0.22f

    .line 628
    .line 629
    .line 630
    const/high16 v6, 0x3f000000    # 0.5f

    .line 631
    .line 632
    const/high16 v7, -0x41000000    # -0.5f

    .line 633
    .line 634
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v25, -0x41bd70a4    # -0.19f

    .line 638
    .line 639
    .line 640
    const v26, -0x413d70a4    # -0.38f

    .line 641
    .line 642
    .line 643
    const/16 v21, 0x0

    .line 644
    .line 645
    const v22, -0x41dc28f6    # -0.16f

    .line 646
    .line 647
    .line 648
    const v23, -0x425c28f6    # -0.08f

    .line 649
    .line 650
    .line 651
    const v24, -0x416b851f    # -0.29f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v25, 0x3f9ae148    # 1.21f

    .line 658
    .line 659
    .line 660
    const v26, 0x3e99999a    # 0.3f

    .line 661
    .line 662
    .line 663
    const v21, 0x3ed1eb85    # 0.41f

    .line 664
    .line 665
    .line 666
    const v22, 0x3d8f5c29    # 0.07f

    .line 667
    .line 668
    .line 669
    const v23, 0x3f51eb85    # 0.82f

    .line 670
    .line 671
    .line 672
    const v24, 0x3e2e147b    # 0.17f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v25, 0x41680000    # 14.5f

    .line 679
    .line 680
    const/high16 v26, 0x40900000    # 4.5f

    .line 681
    .line 682
    const v21, 0x416828f6    # 14.51f

    .line 683
    .line 684
    .line 685
    const v22, 0x408e147b    # 4.44f

    .line 686
    .line 687
    .line 688
    const/high16 v23, 0x41680000    # 14.5f

    .line 689
    .line 690
    const v24, 0x408f0a3d    # 4.47f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v25, 0x41700000    # 15.0f

    .line 697
    .line 698
    const/high16 v26, 0x40a00000    # 5.0f

    .line 699
    .line 700
    const/high16 v21, 0x41680000    # 14.5f

    .line 701
    .line 702
    const v22, 0x4098f5c3    # 4.78f

    .line 703
    .line 704
    .line 705
    const v23, 0x416b851f    # 14.72f

    .line 706
    .line 707
    .line 708
    const/high16 v24, 0x40a00000    # 5.0f

    .line 709
    .line 710
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v25, 0x3ed1eb85    # 0.41f

    .line 714
    .line 715
    .line 716
    const v26, -0x41947ae1    # -0.23f

    .line 717
    .line 718
    .line 719
    const v21, 0x3e2e147b    # 0.17f

    .line 720
    .line 721
    .line 722
    const/16 v22, 0x0

    .line 723
    .line 724
    const v23, 0x3ea3d70a    # 0.32f

    .line 725
    .line 726
    .line 727
    const v24, -0x4247ae14    # -0.09f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v25, 0x3efae148    # 0.49f

    .line 734
    .line 735
    .line 736
    const/high16 v26, 0x3e800000    # 0.25f

    .line 737
    .line 738
    const v22, 0x3da3d70a    # 0.08f

    .line 739
    .line 740
    .line 741
    const v23, 0x3ea8f5c3    # 0.33f

    .line 742
    .line 743
    .line 744
    const v24, 0x3e23d70a    # 0.16f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v25, -0x41333333    # -0.4f

    .line 751
    .line 752
    .line 753
    const v26, 0x3ef5c28f    # 0.48f

    .line 754
    .line 755
    .line 756
    const v21, -0x41947ae1    # -0.23f

    .line 757
    .line 758
    .line 759
    const v22, 0x3d4ccccd    # 0.05f

    .line 760
    .line 761
    .line 762
    const v23, -0x41333333    # -0.4f

    .line 763
    .line 764
    .line 765
    const v24, 0x3e75c28f    # 0.24f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v25, 0x41800000    # 16.0f

    .line 772
    .line 773
    const/high16 v26, 0x40c00000    # 6.0f

    .line 774
    .line 775
    const/high16 v21, 0x41780000    # 15.5f

    .line 776
    .line 777
    const v22, 0x40b8f5c3    # 5.78f

    .line 778
    .line 779
    .line 780
    const v23, 0x417b851f    # 15.72f

    .line 781
    .line 782
    .line 783
    const/high16 v24, 0x40c00000    # 6.0f

    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v25, -0x430a3d71    # -0.03f

    .line 792
    .line 793
    .line 794
    const v26, -0x41fae148    # -0.13f

    .line 795
    .line 796
    .line 797
    const/16 v21, 0x0

    .line 798
    .line 799
    const v22, -0x42b33333    # -0.05f

    .line 800
    .line 801
    .line 802
    const v23, -0x43dc28f6    # -0.01f

    .line 803
    .line 804
    .line 805
    const v24, -0x4247ae14    # -0.09f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v25, 0x3fee147b    # 1.86f

    .line 812
    .line 813
    .line 814
    const v26, 0x3fe147ae    # 1.76f

    .line 815
    .line 816
    .line 817
    const v21, 0x3f35c28f    # 0.71f

    .line 818
    .line 819
    .line 820
    const v22, 0x3ef5c28f    # 0.48f

    .line 821
    .line 822
    .line 823
    const v23, 0x3fab851f    # 1.34f

    .line 824
    .line 825
    .line 826
    const v24, 0x3f8a3d71    # 1.08f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v25, 0x41900000    # 18.0f

    .line 833
    .line 834
    const/high16 v26, 0x40e00000    # 7.0f

    .line 835
    .line 836
    const/high16 v21, 0x41920000    # 18.25f

    .line 837
    .line 838
    const v22, 0x40e1999a    # 7.05f

    .line 839
    .line 840
    .line 841
    const v23, 0x41910a3d    # 18.13f

    .line 842
    .line 843
    .line 844
    const/high16 v24, 0x40e00000    # 7.0f

    .line 845
    .line 846
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const/high16 v25, -0x41000000    # -0.5f

    .line 850
    .line 851
    const/high16 v26, 0x3f000000    # 0.5f

    .line 852
    .line 853
    const v21, -0x4170a3d7    # -0.28f

    .line 854
    .line 855
    .line 856
    const/16 v22, 0x0

    .line 857
    .line 858
    const/high16 v23, -0x41000000    # -0.5f

    .line 859
    .line 860
    const v24, 0x3e6147ae    # 0.22f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v25, 0x41900000    # 18.0f

    .line 867
    .line 868
    const/high16 v26, 0x41000000    # 8.0f

    .line 869
    .line 870
    const/high16 v21, 0x418c0000    # 17.5f

    .line 871
    .line 872
    const v22, 0x40f8f5c3    # 7.78f

    .line 873
    .line 874
    .line 875
    const v23, 0x418dc28f    # 17.72f

    .line 876
    .line 877
    .line 878
    const/high16 v24, 0x41000000    # 8.0f

    .line 879
    .line 880
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v25, -0x4270a3d7    # -0.07f

    .line 887
    .line 888
    .line 889
    const v26, -0x41947ae1    # -0.23f

    .line 890
    .line 891
    .line 892
    const/16 v21, 0x0

    .line 893
    .line 894
    const v22, -0x4247ae14    # -0.09f

    .line 895
    .line 896
    .line 897
    const v23, -0x430a3d71    # -0.03f

    .line 898
    .line 899
    .line 900
    const v24, -0x41dc28f6    # -0.16f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v25, 0x3efae148    # 0.49f

    .line 907
    .line 908
    .line 909
    const/high16 v26, 0x3f400000    # 0.75f

    .line 910
    .line 911
    const v21, 0x3e3851ec    # 0.18f

    .line 912
    .line 913
    .line 914
    const v22, 0x3e75c28f    # 0.24f

    .line 915
    .line 916
    .line 917
    const v23, 0x3eae147b    # 0.34f

    .line 918
    .line 919
    .line 920
    const v24, 0x3efae148    # 0.49f

    .line 921
    .line 922
    .line 923
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/high16 v25, 0x41940000    # 18.5f

    .line 927
    .line 928
    const/high16 v26, 0x41080000    # 8.5f

    .line 929
    .line 930
    const v21, 0x4195851f    # 18.69f

    .line 931
    .line 932
    .line 933
    const v22, 0x4100cccd    # 8.05f

    .line 934
    .line 935
    .line 936
    const/high16 v23, 0x41940000    # 18.5f

    .line 937
    .line 938
    const/high16 v24, 0x41040000    # 8.25f

    .line 939
    .line 940
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/high16 v25, 0x41980000    # 19.0f

    .line 944
    .line 945
    const/high16 v26, 0x41100000    # 9.0f

    .line 946
    .line 947
    const/high16 v21, 0x41940000    # 18.5f

    .line 948
    .line 949
    const v22, 0x410c7ae1    # 8.78f

    .line 950
    .line 951
    .line 952
    const v23, 0x4195c28f    # 18.72f

    .line 953
    .line 954
    .line 955
    const/high16 v24, 0x41100000    # 9.0f

    .line 956
    .line 957
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v25, 0x3eb33333    # 0.35f

    .line 961
    .line 962
    .line 963
    const v26, -0x41e66666    # -0.15f

    .line 964
    .line 965
    .line 966
    const v21, 0x3e0f5c29    # 0.14f

    .line 967
    .line 968
    .line 969
    const/16 v22, 0x0

    .line 970
    .line 971
    const v23, 0x3e851eb8    # 0.26f

    .line 972
    .line 973
    .line 974
    const v24, -0x428a3d71    # -0.06f

    .line 975
    .line 976
    .line 977
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const/high16 v25, 0x41a00000    # 20.0f

    .line 981
    .line 982
    const/high16 v26, 0x41400000    # 12.0f

    .line 983
    .line 984
    const v21, 0x419e28f6    # 19.77f

    .line 985
    .line 986
    .line 987
    const v22, 0x411d1eb8    # 9.82f

    .line 988
    .line 989
    .line 990
    const/high16 v23, 0x41a00000    # 20.0f

    .line 991
    .line 992
    const v24, 0x412e147b    # 10.88f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const/high16 v25, 0x41400000    # 12.0f

    .line 999
    .line 1000
    const/high16 v26, 0x41a00000    # 20.0f

    .line 1001
    .line 1002
    const/high16 v21, 0x41a00000    # 20.0f

    .line 1003
    .line 1004
    const v22, 0x418347ae    # 16.41f

    .line 1005
    .line 1006
    .line 1007
    const v23, 0x418347ae    # 16.41f

    .line 1008
    .line 1009
    .line 1010
    const/high16 v24, 0x41a00000    # 20.0f

    .line 1011
    .line 1012
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 1019
    .line 1020
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    const/16 v16, 0x3800

    .line 1025
    .line 1026
    const/16 v17, 0x0

    .line 1027
    .line 1028
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1029
    .line 1030
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1031
    .line 1032
    const/4 v7, 0x0

    .line 1033
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1034
    .line 1035
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1036
    .line 1037
    const/4 v13, 0x0

    .line 1038
    const/4 v14, 0x0

    .line 1039
    const/4 v15, 0x0

    .line 1040
    const-string v4, ""

    .line 1041
    .line 1042
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1043
    .line 1044
    .line 1045
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1046
    .line 1047
    .line 1048
    move-result v3

    .line 1049
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1050
    .line 1051
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v6

    .line 1055
    const/4 v2, 0x0

    .line 1056
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1060
    .line 1061
    .line 1062
    move-result v10

    .line 1063
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1064
    .line 1065
    .line 1066
    move-result v11

    .line 1067
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1070
    .line 1071
    .line 1072
    const/high16 v4, 0x41100000    # 9.0f

    .line 1073
    .line 1074
    const/high16 v6, 0x41500000    # 13.0f

    .line 1075
    .line 1076
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const/high16 v4, -0x40600000    # -1.25f

    .line 1080
    .line 1081
    const/4 v6, 0x0

    .line 1082
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v26, 0x40200000    # 2.5f

    .line 1086
    .line 1087
    const/16 v27, 0x0

    .line 1088
    .line 1089
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 1090
    .line 1091
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 1092
    .line 1093
    const/16 v23, 0x0

    .line 1094
    .line 1095
    const/16 v24, 0x1

    .line 1096
    .line 1097
    const/16 v25, 0x1

    .line 1098
    .line 1099
    move-object/from16 v20, v2

    .line 1100
    .line 1101
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v2

    .line 1113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const/4 v7, 0x0

    .line 1116
    const-string v4, ""

    .line 1117
    .line 1118
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1119
    .line 1120
    .line 1121
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1128
    .line 1129
    .line 1130
    move-result-wide v6

    .line 1131
    const/4 v2, 0x0

    .line 1132
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1136
    .line 1137
    .line 1138
    move-result v10

    .line 1139
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1140
    .line 1141
    .line 1142
    move-result v11

    .line 1143
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1149
    .line 1150
    const/high16 v6, 0x41400000    # 12.0f

    .line 1151
    .line 1152
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const/4 v4, 0x0

    .line 1156
    const/high16 v6, -0x41000000    # -0.5f

    .line 1157
    .line 1158
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1162
    .line 1163
    const/high16 v21, 0x3f000000    # 0.5f

    .line 1164
    .line 1165
    const/high16 v22, 0x3f000000    # 0.5f

    .line 1166
    .line 1167
    move-object/from16 v20, v2

    .line 1168
    .line 1169
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1170
    .line 1171
    .line 1172
    const/high16 v26, -0x40800000    # -1.0f

    .line 1173
    .line 1174
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1182
    .line 1183
    const/4 v7, 0x0

    .line 1184
    const-string v4, ""

    .line 1185
    .line 1186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1187
    .line 1188
    .line 1189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1190
    .line 1191
    .line 1192
    move-result v3

    .line 1193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1194
    .line 1195
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1196
    .line 1197
    .line 1198
    move-result-wide v6

    .line 1199
    const/4 v2, 0x0

    .line 1200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1204
    .line 1205
    .line 1206
    move-result v10

    .line 1207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1208
    .line 1209
    .line 1210
    move-result v11

    .line 1211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1212
    .line 1213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1214
    .line 1215
    .line 1216
    const/high16 v4, 0x41600000    # 14.0f

    .line 1217
    .line 1218
    const/high16 v6, 0x40b00000    # 5.5f

    .line 1219
    .line 1220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    const/4 v4, 0x0

    .line 1224
    const/high16 v6, -0x41000000    # -0.5f

    .line 1225
    .line 1226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1230
    .line 1231
    move-object/from16 v20, v2

    .line 1232
    .line 1233
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    const/high16 v26, -0x40800000    # -1.0f

    .line 1237
    .line 1238
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1246
    .line 1247
    const/4 v7, 0x0

    .line 1248
    const-string v4, ""

    .line 1249
    .line 1250
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1251
    .line 1252
    .line 1253
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1254
    .line 1255
    .line 1256
    move-result v3

    .line 1257
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1258
    .line 1259
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1260
    .line 1261
    .line 1262
    move-result-wide v6

    .line 1263
    const/4 v2, 0x0

    .line 1264
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1268
    .line 1269
    .line 1270
    move-result v10

    .line 1271
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1272
    .line 1273
    .line 1274
    move-result v11

    .line 1275
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1276
    .line 1277
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1278
    .line 1279
    .line 1280
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1281
    .line 1282
    const/high16 v6, 0x41200000    # 10.0f

    .line 1283
    .line 1284
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/4 v4, 0x0

    .line 1288
    const/high16 v6, -0x41000000    # -0.5f

    .line 1289
    .line 1290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1294
    .line 1295
    move-object/from16 v20, v2

    .line 1296
    .line 1297
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1298
    .line 1299
    .line 1300
    const/high16 v26, -0x40800000    # -1.0f

    .line 1301
    .line 1302
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v2

    .line 1309
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1310
    .line 1311
    const/4 v7, 0x0

    .line 1312
    const-string v4, ""

    .line 1313
    .line 1314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1318
    .line 1319
    .line 1320
    move-result v3

    .line 1321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1322
    .line 1323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v6

    .line 1327
    const/4 v2, 0x0

    .line 1328
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1332
    .line 1333
    .line 1334
    move-result v10

    .line 1335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1336
    .line 1337
    .line 1338
    move-result v11

    .line 1339
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1342
    .line 1343
    .line 1344
    const/high16 v4, 0x41880000    # 17.0f

    .line 1345
    .line 1346
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1347
    .line 1348
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1349
    .line 1350
    .line 1351
    const/4 v4, 0x0

    .line 1352
    const/high16 v6, -0x41000000    # -0.5f

    .line 1353
    .line 1354
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1355
    .line 1356
    .line 1357
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1358
    .line 1359
    move-object/from16 v20, v2

    .line 1360
    .line 1361
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1362
    .line 1363
    .line 1364
    const/high16 v26, -0x40800000    # -1.0f

    .line 1365
    .line 1366
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v2

    .line 1373
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1374
    .line 1375
    const/4 v7, 0x0

    .line 1376
    const-string v4, ""

    .line 1377
    .line 1378
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1379
    .line 1380
    .line 1381
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1382
    .line 1383
    .line 1384
    move-result v3

    .line 1385
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1386
    .line 1387
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1388
    .line 1389
    .line 1390
    move-result-wide v6

    .line 1391
    const/4 v2, 0x0

    .line 1392
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1396
    .line 1397
    .line 1398
    move-result v10

    .line 1399
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1400
    .line 1401
    .line 1402
    move-result v11

    .line 1403
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1404
    .line 1405
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1406
    .line 1407
    .line 1408
    const/high16 v4, 0x41100000    # 9.0f

    .line 1409
    .line 1410
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1411
    .line 1412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const/4 v4, 0x0

    .line 1416
    const/high16 v6, -0x41000000    # -0.5f

    .line 1417
    .line 1418
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1419
    .line 1420
    .line 1421
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1422
    .line 1423
    move-object/from16 v20, v2

    .line 1424
    .line 1425
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    const/high16 v26, -0x40800000    # -1.0f

    .line 1429
    .line 1430
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v2

    .line 1437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1438
    .line 1439
    const/4 v7, 0x0

    .line 1440
    const-string v4, ""

    .line 1441
    .line 1442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1443
    .line 1444
    .line 1445
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1446
    .line 1447
    .line 1448
    move-result v3

    .line 1449
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1450
    .line 1451
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1452
    .line 1453
    .line 1454
    move-result-wide v6

    .line 1455
    const/4 v2, 0x0

    .line 1456
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1460
    .line 1461
    .line 1462
    move-result v10

    .line 1463
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1464
    .line 1465
    .line 1466
    move-result v11

    .line 1467
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1470
    .line 1471
    .line 1472
    const/high16 v4, 0x40e00000    # 7.0f

    .line 1473
    .line 1474
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1475
    .line 1476
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1477
    .line 1478
    .line 1479
    const/4 v4, 0x0

    .line 1480
    const/high16 v6, -0x41000000    # -0.5f

    .line 1481
    .line 1482
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1483
    .line 1484
    .line 1485
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1486
    .line 1487
    move-object/from16 v20, v2

    .line 1488
    .line 1489
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1490
    .line 1491
    .line 1492
    const/high16 v26, -0x40800000    # -1.0f

    .line 1493
    .line 1494
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1502
    .line 1503
    const/4 v7, 0x0

    .line 1504
    const-string v4, ""

    .line 1505
    .line 1506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1507
    .line 1508
    .line 1509
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1510
    .line 1511
    .line 1512
    move-result v3

    .line 1513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1514
    .line 1515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1516
    .line 1517
    .line 1518
    move-result-wide v6

    .line 1519
    const/4 v2, 0x0

    .line 1520
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1524
    .line 1525
    .line 1526
    move-result v10

    .line 1527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1528
    .line 1529
    .line 1530
    move-result v11

    .line 1531
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1534
    .line 1535
    .line 1536
    const/high16 v4, 0x41300000    # 11.0f

    .line 1537
    .line 1538
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1539
    .line 1540
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1541
    .line 1542
    .line 1543
    const/4 v4, 0x0

    .line 1544
    const/high16 v6, -0x41000000    # -0.5f

    .line 1545
    .line 1546
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1547
    .line 1548
    .line 1549
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1550
    .line 1551
    move-object/from16 v20, v2

    .line 1552
    .line 1553
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1554
    .line 1555
    .line 1556
    const/high16 v26, -0x40800000    # -1.0f

    .line 1557
    .line 1558
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v2

    .line 1565
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1566
    .line 1567
    const/4 v7, 0x0

    .line 1568
    const-string v4, ""

    .line 1569
    .line 1570
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1571
    .line 1572
    .line 1573
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1574
    .line 1575
    .line 1576
    move-result v3

    .line 1577
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1578
    .line 1579
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1580
    .line 1581
    .line 1582
    move-result-wide v6

    .line 1583
    const/4 v2, 0x0

    .line 1584
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1588
    .line 1589
    .line 1590
    move-result v10

    .line 1591
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1592
    .line 1593
    .line 1594
    move-result v11

    .line 1595
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1596
    .line 1597
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1598
    .line 1599
    .line 1600
    const/high16 v4, 0x41500000    # 13.0f

    .line 1601
    .line 1602
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1603
    .line 1604
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1605
    .line 1606
    .line 1607
    const/4 v4, 0x0

    .line 1608
    const/high16 v6, -0x41000000    # -0.5f

    .line 1609
    .line 1610
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1611
    .line 1612
    .line 1613
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1614
    .line 1615
    move-object/from16 v20, v2

    .line 1616
    .line 1617
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1618
    .line 1619
    .line 1620
    const/high16 v26, -0x40800000    # -1.0f

    .line 1621
    .line 1622
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v2

    .line 1629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1630
    .line 1631
    const/4 v7, 0x0

    .line 1632
    const-string v4, ""

    .line 1633
    .line 1634
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1635
    .line 1636
    .line 1637
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1638
    .line 1639
    .line 1640
    move-result v3

    .line 1641
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1642
    .line 1643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1644
    .line 1645
    .line 1646
    move-result-wide v6

    .line 1647
    const/4 v2, 0x0

    .line 1648
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1652
    .line 1653
    .line 1654
    move-result v10

    .line 1655
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1656
    .line 1657
    .line 1658
    move-result v11

    .line 1659
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1660
    .line 1661
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1662
    .line 1663
    .line 1664
    const/high16 v4, 0x41700000    # 15.0f

    .line 1665
    .line 1666
    const/high16 v6, 0x40d00000    # 6.5f

    .line 1667
    .line 1668
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1669
    .line 1670
    .line 1671
    const/4 v4, 0x0

    .line 1672
    const/high16 v6, -0x41000000    # -0.5f

    .line 1673
    .line 1674
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1675
    .line 1676
    .line 1677
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1678
    .line 1679
    move-object/from16 v20, v2

    .line 1680
    .line 1681
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1682
    .line 1683
    .line 1684
    const/high16 v26, -0x40800000    # -1.0f

    .line 1685
    .line 1686
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v2

    .line 1693
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1694
    .line 1695
    const/4 v7, 0x0

    .line 1696
    const-string v4, ""

    .line 1697
    .line 1698
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1699
    .line 1700
    .line 1701
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1702
    .line 1703
    .line 1704
    move-result v3

    .line 1705
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1706
    .line 1707
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1708
    .line 1709
    .line 1710
    move-result-wide v6

    .line 1711
    const/4 v2, 0x0

    .line 1712
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1716
    .line 1717
    .line 1718
    move-result v10

    .line 1719
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1720
    .line 1721
    .line 1722
    move-result v11

    .line 1723
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1724
    .line 1725
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1726
    .line 1727
    .line 1728
    const/high16 v4, 0x40f00000    # 7.5f

    .line 1729
    .line 1730
    const/high16 v6, 0x41400000    # 12.0f

    .line 1731
    .line 1732
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1733
    .line 1734
    .line 1735
    const/4 v4, 0x0

    .line 1736
    const/high16 v6, -0x41000000    # -0.5f

    .line 1737
    .line 1738
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1739
    .line 1740
    .line 1741
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1742
    .line 1743
    move-object/from16 v20, v2

    .line 1744
    .line 1745
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1746
    .line 1747
    .line 1748
    const/high16 v26, -0x40800000    # -1.0f

    .line 1749
    .line 1750
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v2

    .line 1757
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1758
    .line 1759
    const/4 v7, 0x0

    .line 1760
    const-string v4, ""

    .line 1761
    .line 1762
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1763
    .line 1764
    .line 1765
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1766
    .line 1767
    .line 1768
    move-result v3

    .line 1769
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1770
    .line 1771
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1772
    .line 1773
    .line 1774
    move-result-wide v6

    .line 1775
    const/4 v2, 0x0

    .line 1776
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1780
    .line 1781
    .line 1782
    move-result v10

    .line 1783
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1784
    .line 1785
    .line 1786
    move-result v11

    .line 1787
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1788
    .line 1789
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1790
    .line 1791
    .line 1792
    const/high16 v4, 0x41600000    # 14.0f

    .line 1793
    .line 1794
    const/high16 v6, 0x40f00000    # 7.5f

    .line 1795
    .line 1796
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1797
    .line 1798
    .line 1799
    const/4 v4, 0x0

    .line 1800
    const/high16 v6, -0x41000000    # -0.5f

    .line 1801
    .line 1802
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1803
    .line 1804
    .line 1805
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1806
    .line 1807
    move-object/from16 v20, v2

    .line 1808
    .line 1809
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1810
    .line 1811
    .line 1812
    const/high16 v26, -0x40800000    # -1.0f

    .line 1813
    .line 1814
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1815
    .line 1816
    .line 1817
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v2

    .line 1821
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1822
    .line 1823
    const/4 v7, 0x0

    .line 1824
    const-string v4, ""

    .line 1825
    .line 1826
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1827
    .line 1828
    .line 1829
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1830
    .line 1831
    .line 1832
    move-result v3

    .line 1833
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1834
    .line 1835
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1836
    .line 1837
    .line 1838
    move-result-wide v6

    .line 1839
    const/4 v2, 0x0

    .line 1840
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1841
    .line 1842
    .line 1843
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1844
    .line 1845
    .line 1846
    move-result v10

    .line 1847
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1848
    .line 1849
    .line 1850
    move-result v11

    .line 1851
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1852
    .line 1853
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1854
    .line 1855
    .line 1856
    const/high16 v4, 0x41800000    # 16.0f

    .line 1857
    .line 1858
    const/high16 v6, 0x40f00000    # 7.5f

    .line 1859
    .line 1860
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1861
    .line 1862
    .line 1863
    const/4 v4, 0x0

    .line 1864
    const/high16 v6, -0x41000000    # -0.5f

    .line 1865
    .line 1866
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1867
    .line 1868
    .line 1869
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1870
    .line 1871
    move-object/from16 v20, v2

    .line 1872
    .line 1873
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1874
    .line 1875
    .line 1876
    const/high16 v26, -0x40800000    # -1.0f

    .line 1877
    .line 1878
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1879
    .line 1880
    .line 1881
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v2

    .line 1885
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1886
    .line 1887
    const/4 v7, 0x0

    .line 1888
    const-string v4, ""

    .line 1889
    .line 1890
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1891
    .line 1892
    .line 1893
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1894
    .line 1895
    .line 1896
    move-result v3

    .line 1897
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1898
    .line 1899
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1900
    .line 1901
    .line 1902
    move-result-wide v6

    .line 1903
    const/4 v2, 0x0

    .line 1904
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1908
    .line 1909
    .line 1910
    move-result v10

    .line 1911
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1912
    .line 1913
    .line 1914
    move-result v11

    .line 1915
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1916
    .line 1917
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1918
    .line 1919
    .line 1920
    const/high16 v4, 0x40f00000    # 7.5f

    .line 1921
    .line 1922
    const/high16 v6, 0x41200000    # 10.0f

    .line 1923
    .line 1924
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1925
    .line 1926
    .line 1927
    const/4 v4, 0x0

    .line 1928
    const/high16 v6, -0x41000000    # -0.5f

    .line 1929
    .line 1930
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1931
    .line 1932
    .line 1933
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1934
    .line 1935
    move-object/from16 v20, v2

    .line 1936
    .line 1937
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1938
    .line 1939
    .line 1940
    const/high16 v26, -0x40800000    # -1.0f

    .line 1941
    .line 1942
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v2

    .line 1949
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1950
    .line 1951
    const/4 v7, 0x0

    .line 1952
    const-string v4, ""

    .line 1953
    .line 1954
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1955
    .line 1956
    .line 1957
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1958
    .line 1959
    .line 1960
    move-result v3

    .line 1961
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1962
    .line 1963
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1964
    .line 1965
    .line 1966
    move-result-wide v6

    .line 1967
    const/4 v2, 0x0

    .line 1968
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1969
    .line 1970
    .line 1971
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1972
    .line 1973
    .line 1974
    move-result v10

    .line 1975
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1976
    .line 1977
    .line 1978
    move-result v11

    .line 1979
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1980
    .line 1981
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1982
    .line 1983
    .line 1984
    const/high16 v4, 0x41000000    # 8.0f

    .line 1985
    .line 1986
    const/high16 v6, 0x40f00000    # 7.5f

    .line 1987
    .line 1988
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1989
    .line 1990
    .line 1991
    const/4 v4, 0x0

    .line 1992
    const/high16 v6, -0x41000000    # -0.5f

    .line 1993
    .line 1994
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1995
    .line 1996
    .line 1997
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1998
    .line 1999
    move-object/from16 v20, v2

    .line 2000
    .line 2001
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2002
    .line 2003
    .line 2004
    const/high16 v26, -0x40800000    # -1.0f

    .line 2005
    .line 2006
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v2

    .line 2013
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2014
    .line 2015
    const/4 v7, 0x0

    .line 2016
    const-string v4, ""

    .line 2017
    .line 2018
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2019
    .line 2020
    .line 2021
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2022
    .line 2023
    .line 2024
    move-result v3

    .line 2025
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2026
    .line 2027
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2028
    .line 2029
    .line 2030
    move-result-wide v6

    .line 2031
    const/4 v2, 0x0

    .line 2032
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2036
    .line 2037
    .line 2038
    move-result v10

    .line 2039
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2040
    .line 2041
    .line 2042
    move-result v11

    .line 2043
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2044
    .line 2045
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2046
    .line 2047
    .line 2048
    const/high16 v4, 0x41100000    # 9.0f

    .line 2049
    .line 2050
    const/high16 v6, 0x41080000    # 8.5f

    .line 2051
    .line 2052
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2053
    .line 2054
    .line 2055
    const/4 v4, 0x0

    .line 2056
    const/high16 v6, -0x41000000    # -0.5f

    .line 2057
    .line 2058
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2059
    .line 2060
    .line 2061
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2062
    .line 2063
    move-object/from16 v20, v2

    .line 2064
    .line 2065
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2066
    .line 2067
    .line 2068
    const/high16 v26, -0x40800000    # -1.0f

    .line 2069
    .line 2070
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v2

    .line 2077
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2078
    .line 2079
    const/4 v7, 0x0

    .line 2080
    const-string v4, ""

    .line 2081
    .line 2082
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2083
    .line 2084
    .line 2085
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2086
    .line 2087
    .line 2088
    move-result v3

    .line 2089
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2090
    .line 2091
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2092
    .line 2093
    .line 2094
    move-result-wide v6

    .line 2095
    const/4 v2, 0x0

    .line 2096
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2097
    .line 2098
    .line 2099
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2100
    .line 2101
    .line 2102
    move-result v10

    .line 2103
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2104
    .line 2105
    .line 2106
    move-result v11

    .line 2107
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2108
    .line 2109
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2110
    .line 2111
    .line 2112
    const/high16 v4, 0x40e00000    # 7.0f

    .line 2113
    .line 2114
    const/high16 v6, 0x41080000    # 8.5f

    .line 2115
    .line 2116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2117
    .line 2118
    .line 2119
    const/4 v4, 0x0

    .line 2120
    const/high16 v6, -0x41000000    # -0.5f

    .line 2121
    .line 2122
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2123
    .line 2124
    .line 2125
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2126
    .line 2127
    move-object/from16 v20, v2

    .line 2128
    .line 2129
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2130
    .line 2131
    .line 2132
    const/high16 v26, -0x40800000    # -1.0f

    .line 2133
    .line 2134
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2135
    .line 2136
    .line 2137
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v2

    .line 2141
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2142
    .line 2143
    const/4 v7, 0x0

    .line 2144
    const-string v4, ""

    .line 2145
    .line 2146
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2147
    .line 2148
    .line 2149
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2150
    .line 2151
    .line 2152
    move-result v3

    .line 2153
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2154
    .line 2155
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2156
    .line 2157
    .line 2158
    move-result-wide v6

    .line 2159
    const/4 v2, 0x0

    .line 2160
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2164
    .line 2165
    .line 2166
    move-result v10

    .line 2167
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2168
    .line 2169
    .line 2170
    move-result v11

    .line 2171
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2172
    .line 2173
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2174
    .line 2175
    .line 2176
    const/high16 v4, 0x41300000    # 11.0f

    .line 2177
    .line 2178
    const/high16 v6, 0x41080000    # 8.5f

    .line 2179
    .line 2180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2181
    .line 2182
    .line 2183
    const/4 v4, 0x0

    .line 2184
    const/high16 v6, -0x41000000    # -0.5f

    .line 2185
    .line 2186
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2187
    .line 2188
    .line 2189
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2190
    .line 2191
    move-object/from16 v20, v2

    .line 2192
    .line 2193
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2194
    .line 2195
    .line 2196
    const/high16 v26, -0x40800000    # -1.0f

    .line 2197
    .line 2198
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2199
    .line 2200
    .line 2201
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v2

    .line 2205
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2206
    .line 2207
    const/4 v7, 0x0

    .line 2208
    const-string v4, ""

    .line 2209
    .line 2210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2211
    .line 2212
    .line 2213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2214
    .line 2215
    .line 2216
    move-result v3

    .line 2217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2218
    .line 2219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2220
    .line 2221
    .line 2222
    move-result-wide v6

    .line 2223
    const/4 v2, 0x0

    .line 2224
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2225
    .line 2226
    .line 2227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2228
    .line 2229
    .line 2230
    move-result v10

    .line 2231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2232
    .line 2233
    .line 2234
    move-result v11

    .line 2235
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2236
    .line 2237
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2238
    .line 2239
    .line 2240
    const/high16 v4, 0x41500000    # 13.0f

    .line 2241
    .line 2242
    const/high16 v6, 0x41080000    # 8.5f

    .line 2243
    .line 2244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2245
    .line 2246
    .line 2247
    const/4 v4, 0x0

    .line 2248
    const/high16 v6, -0x41000000    # -0.5f

    .line 2249
    .line 2250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2251
    .line 2252
    .line 2253
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2254
    .line 2255
    move-object/from16 v20, v2

    .line 2256
    .line 2257
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2258
    .line 2259
    .line 2260
    const/high16 v26, -0x40800000    # -1.0f

    .line 2261
    .line 2262
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v2

    .line 2269
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2270
    .line 2271
    const/4 v7, 0x0

    .line 2272
    const-string v4, ""

    .line 2273
    .line 2274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2275
    .line 2276
    .line 2277
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2278
    .line 2279
    .line 2280
    move-result v3

    .line 2281
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2282
    .line 2283
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2284
    .line 2285
    .line 2286
    move-result-wide v6

    .line 2287
    const/4 v2, 0x0

    .line 2288
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2292
    .line 2293
    .line 2294
    move-result v10

    .line 2295
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2296
    .line 2297
    .line 2298
    move-result v11

    .line 2299
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2300
    .line 2301
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2302
    .line 2303
    .line 2304
    const/high16 v4, 0x41700000    # 15.0f

    .line 2305
    .line 2306
    const/high16 v6, 0x41080000    # 8.5f

    .line 2307
    .line 2308
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2309
    .line 2310
    .line 2311
    const/4 v4, 0x0

    .line 2312
    const/high16 v6, -0x41000000    # -0.5f

    .line 2313
    .line 2314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2315
    .line 2316
    .line 2317
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2318
    .line 2319
    move-object/from16 v20, v2

    .line 2320
    .line 2321
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2322
    .line 2323
    .line 2324
    const/high16 v26, -0x40800000    # -1.0f

    .line 2325
    .line 2326
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2327
    .line 2328
    .line 2329
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v2

    .line 2333
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2334
    .line 2335
    const/4 v7, 0x0

    .line 2336
    const-string v4, ""

    .line 2337
    .line 2338
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2339
    .line 2340
    .line 2341
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2342
    .line 2343
    .line 2344
    move-result v3

    .line 2345
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2346
    .line 2347
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2348
    .line 2349
    .line 2350
    move-result-wide v6

    .line 2351
    const/4 v2, 0x0

    .line 2352
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2353
    .line 2354
    .line 2355
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2356
    .line 2357
    .line 2358
    move-result v10

    .line 2359
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2360
    .line 2361
    .line 2362
    move-result v11

    .line 2363
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2364
    .line 2365
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2366
    .line 2367
    .line 2368
    const/high16 v4, 0x41880000    # 17.0f

    .line 2369
    .line 2370
    const/high16 v6, 0x41080000    # 8.5f

    .line 2371
    .line 2372
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2373
    .line 2374
    .line 2375
    const/4 v4, 0x0

    .line 2376
    const/high16 v6, -0x41000000    # -0.5f

    .line 2377
    .line 2378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2379
    .line 2380
    .line 2381
    const/high16 v26, 0x3f800000    # 1.0f

    .line 2382
    .line 2383
    move-object/from16 v20, v2

    .line 2384
    .line 2385
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2386
    .line 2387
    .line 2388
    const/high16 v26, -0x40800000    # -1.0f

    .line 2389
    .line 2390
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2391
    .line 2392
    .line 2393
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v2

    .line 2397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2398
    .line 2399
    const/4 v7, 0x0

    .line 2400
    const-string v4, ""

    .line 2401
    .line 2402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2403
    .line 2404
    .line 2405
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 2406
    .line 2407
    .line 2408
    move-result v3

    .line 2409
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 2410
    .line 2411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 2412
    .line 2413
    .line 2414
    move-result-wide v6

    .line 2415
    const/4 v0, 0x0

    .line 2416
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 2417
    .line 2418
    .line 2419
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 2420
    .line 2421
    .line 2422
    move-result v10

    .line 2423
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 2424
    .line 2425
    .line 2426
    move-result v11

    .line 2427
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2428
    .line 2429
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 2430
    .line 2431
    .line 2432
    const/high16 v0, 0x41700000    # 15.0f

    .line 2433
    .line 2434
    const/high16 v2, 0x41500000    # 13.0f

    .line 2435
    .line 2436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2437
    .line 2438
    .line 2439
    const/high16 v0, -0x40600000    # -1.25f

    .line 2440
    .line 2441
    const/4 v2, 0x0

    .line 2442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2443
    .line 2444
    .line 2445
    const/high16 v18, 0x40200000    # 2.5f

    .line 2446
    .line 2447
    const/16 v19, 0x0

    .line 2448
    .line 2449
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 2450
    .line 2451
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 2452
    .line 2453
    const/16 v16, 0x1

    .line 2454
    .line 2455
    const/16 v17, 0x1

    .line 2456
    .line 2457
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2458
    .line 2459
    .line 2460
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 2461
    .line 2462
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2463
    .line 2464
    .line 2465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v2

    .line 2469
    const/16 v16, 0x3800

    .line 2470
    .line 2471
    const/16 v17, 0x0

    .line 2472
    .line 2473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2474
    .line 2475
    const/4 v7, 0x0

    .line 2476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2477
    .line 2478
    const/4 v13, 0x0

    .line 2479
    const/4 v14, 0x0

    .line 2480
    const-string v4, ""

    .line 2481
    .line 2482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v0

    .line 2486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v0

    .line 2490
    sput-object v0, Landroidx/compose/material/icons/twotone/Face5Kt;->_face5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2491
    .line 2492
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2493
    .line 2494
    .line 2495
    return-object v0
.end method
