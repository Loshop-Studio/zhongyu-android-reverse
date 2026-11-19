.class public final Landroidx/compose/material/icons/twotone/SportsEsportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsEsports(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsEsportsKt;->_sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsEsports"

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
    const v4, 0x41843d71    # 16.53f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40ef0a3d    # 7.47f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x40afae14    # 5.49f

    .line 85
    .line 86
    .line 87
    const v26, 0x410b851f    # 8.72f

    .line 88
    .line 89
    .line 90
    const v21, 0x40cf5c29    # 6.48f

    .line 91
    .line 92
    .line 93
    const/high16 v22, 0x40e00000    # 7.0f

    .line 94
    .line 95
    const v23, 0x40b428f6    # 5.63f

    .line 96
    .line 97
    .line 98
    const v24, 0x40f7ae14    # 7.74f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x408ccccd    # 4.4f

    .line 107
    .line 108
    .line 109
    const v6, 0x4182f5c3    # 16.37f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, 0x3e051eb8    # 0.13f

    .line 116
    .line 117
    .line 118
    const v26, 0x3ee147ae    # 0.44f

    .line 119
    .line 120
    .line 121
    const v21, -0x430a3d71    # -0.03f

    .line 122
    .line 123
    .line 124
    const v22, 0x3e570a3d    # 0.21f

    .line 125
    .line 126
    .line 127
    const v23, 0x3d4ccccd    # 0.05f

    .line 128
    .line 129
    .line 130
    const v24, 0x3eb33333    # 0.35f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, 0x409e147b    # 4.94f

    .line 137
    .line 138
    .line 139
    const/high16 v26, 0x41880000    # 17.0f

    .line 140
    .line 141
    const v21, 0x40933333    # 4.6f

    .line 142
    .line 143
    .line 144
    const v22, 0x41873333    # 16.9f

    .line 145
    .line 146
    .line 147
    const v23, 0x40975c29    # 4.73f

    .line 148
    .line 149
    .line 150
    const/high16 v24, 0x41880000    # 17.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v25, 0x3ec7ae14    # 0.39f

    .line 156
    .line 157
    .line 158
    const v26, -0x41dc28f6    # -0.16f

    .line 159
    .line 160
    .line 161
    const v21, 0x3e19999a    # 0.15f

    .line 162
    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const v23, 0x3e947ae1    # 0.29f

    .line 167
    .line 168
    .line 169
    const v24, -0x428a3d71    # -0.06f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x41600000    # 14.0f

    .line 176
    .line 177
    const v6, 0x4102b852    # 8.17f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x40f51eb8    # 7.66f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, 0x4035c28f    # 2.84f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v26, 0x3e23d70a    # 0.16f

    .line 196
    .line 197
    .line 198
    const v21, 0x3dcccccd    # 0.1f

    .line 199
    .line 200
    .line 201
    const v22, 0x3dcccccd    # 0.1f

    .line 202
    .line 203
    .line 204
    const v23, 0x3e75c28f    # 0.24f

    .line 205
    .line 206
    .line 207
    const v24, 0x3e23d70a    # 0.16f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x3ed70a3d    # 0.42f

    .line 214
    .line 215
    .line 216
    const v26, -0x41bd70a4    # -0.19f

    .line 217
    .line 218
    .line 219
    const v21, 0x3e570a3d    # 0.21f

    .line 220
    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const v23, 0x3eae147b    # 0.34f

    .line 225
    .line 226
    .line 227
    const v24, -0x42333333    # -0.1f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x3e051eb8    # 0.13f

    .line 234
    .line 235
    .line 236
    const v26, -0x411eb852    # -0.44f

    .line 237
    .line 238
    .line 239
    const v21, 0x3da3d70a    # 0.08f

    .line 240
    .line 241
    .line 242
    const v22, -0x4247ae14    # -0.09f

    .line 243
    .line 244
    .line 245
    const v23, 0x3e23d70a    # 0.16f

    .line 246
    .line 247
    .line 248
    const v24, -0x41947ae1    # -0.23f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, -0x3f0ae148    # -7.66f

    .line 255
    .line 256
    .line 257
    const v6, -0x40747ae1    # -1.09f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v25, 0x41843d71    # 16.53f

    .line 264
    .line 265
    .line 266
    const/high16 v26, 0x40e00000    # 7.0f

    .line 267
    .line 268
    const v21, 0x4192f5c3    # 18.37f

    .line 269
    .line 270
    .line 271
    const v22, 0x40f7ae14    # 7.74f

    .line 272
    .line 273
    .line 274
    const v23, 0x418c28f6    # 17.52f

    .line 275
    .line 276
    .line 277
    const/high16 v24, 0x40e00000    # 7.0f

    .line 278
    .line 279
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41300000    # 11.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41100000    # 9.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40000000    # 2.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x41000000    # 8.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, -0x40000000    # -2.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x40c00000    # 6.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, -0x40800000    # -1.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x40000000    # 2.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x41000000    # 8.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x3f800000    # 1.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v4, 0x41300000    # 11.0f

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x41200000    # 10.0f

    .line 352
    .line 353
    const/high16 v6, 0x41700000    # 15.0f

    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, -0x40800000    # -1.0f

    .line 359
    .line 360
    const/high16 v26, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v21, -0x40f33333    # -0.55f

    .line 363
    .line 364
    .line 365
    const/16 v22, 0x0

    .line 366
    .line 367
    const/high16 v23, -0x40800000    # -1.0f

    .line 368
    .line 369
    const v24, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v25, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/16 v21, 0x0

    .line 378
    .line 379
    const v22, -0x40f33333    # -0.55f

    .line 380
    .line 381
    .line 382
    const v23, 0x3ee66666    # 0.45f

    .line 383
    .line 384
    .line 385
    const/high16 v24, -0x40800000    # -1.0f

    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v4, 0x3ee66666    # 0.45f

    .line 391
    .line 392
    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, 0x41700000    # 15.0f

    .line 399
    .line 400
    const/high16 v26, 0x41200000    # 10.0f

    .line 401
    .line 402
    const/high16 v21, 0x41800000    # 16.0f

    .line 403
    .line 404
    const v22, 0x4118cccd    # 9.55f

    .line 405
    .line 406
    .line 407
    const v23, 0x4178cccd    # 15.55f

    .line 408
    .line 409
    .line 410
    const/high16 v24, 0x41200000    # 10.0f

    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x41500000    # 13.0f

    .line 419
    .line 420
    const/high16 v6, 0x41880000    # 17.0f

    .line 421
    .line 422
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v25, -0x40800000    # -1.0f

    .line 426
    .line 427
    const/high16 v26, -0x40800000    # -1.0f

    .line 428
    .line 429
    const v21, -0x40f33333    # -0.55f

    .line 430
    .line 431
    .line 432
    const/16 v22, 0x0

    .line 433
    .line 434
    const/high16 v23, -0x40800000    # -1.0f

    .line 435
    .line 436
    const v24, -0x4119999a    # -0.45f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v25, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/16 v21, 0x0

    .line 445
    .line 446
    const v22, -0x40f33333    # -0.55f

    .line 447
    .line 448
    .line 449
    const v23, 0x3ee66666    # 0.45f

    .line 450
    .line 451
    .line 452
    const/high16 v24, -0x40800000    # -1.0f

    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, 0x3ee66666    # 0.45f

    .line 458
    .line 459
    .line 460
    const/high16 v6, 0x3f800000    # 1.0f

    .line 461
    .line 462
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, 0x41880000    # 17.0f

    .line 466
    .line 467
    const/high16 v26, 0x41500000    # 13.0f

    .line 468
    .line 469
    const/high16 v21, 0x41900000    # 18.0f

    .line 470
    .line 471
    const v22, 0x4148cccd    # 12.55f

    .line 472
    .line 473
    .line 474
    const v23, 0x418c6666    # 17.55f

    .line 475
    .line 476
    .line 477
    const/high16 v24, 0x41500000    # 13.0f

    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const v6, 0x3e99999a    # 0.3f

    .line 494
    .line 495
    .line 496
    const v8, 0x3e99999a    # 0.3f

    .line 497
    .line 498
    .line 499
    const/4 v7, 0x0

    .line 500
    const/high16 v9, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/high16 v12, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const/4 v14, 0x0

    .line 506
    const/4 v15, 0x0

    .line 507
    const-string v4, ""

    .line 508
    .line 509
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 510
    .line 511
    .line 512
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 517
    .line 518
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 519
    .line 520
    .line 521
    move-result-wide v6

    .line 522
    const/4 v2, 0x0

    .line 523
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 527
    .line 528
    .line 529
    move-result v10

    .line 530
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 537
    .line 538
    .line 539
    const v4, 0x41aca3d7    # 21.58f

    .line 540
    .line 541
    .line 542
    const v6, 0x4180b852    # 16.09f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v4, -0x3f0ae148    # -7.66f

    .line 549
    .line 550
    .line 551
    const v6, -0x40747ae1    # -1.09f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v25, 0x41843d71    # 16.53f

    .line 558
    .line 559
    .line 560
    const/high16 v26, 0x40a00000    # 5.0f

    .line 561
    .line 562
    const v21, 0x41a1ae14    # 20.21f

    .line 563
    .line 564
    .line 565
    const v22, 0x40ceb852    # 6.46f

    .line 566
    .line 567
    .line 568
    const v23, 0x419428f6    # 18.52f

    .line 569
    .line 570
    .line 571
    const/high16 v24, 0x40a00000    # 5.0f

    .line 572
    .line 573
    move-object/from16 v20, v2

    .line 574
    .line 575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v4, 0x40ef0a3d    # 7.47f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v25, 0x4060a3d7    # 3.51f

    .line 585
    .line 586
    .line 587
    const v26, 0x4106e148    # 8.43f

    .line 588
    .line 589
    .line 590
    const v21, 0x40af5c29    # 5.48f

    .line 591
    .line 592
    .line 593
    const/high16 v22, 0x40a00000    # 5.0f

    .line 594
    .line 595
    const v23, 0x40728f5c    # 3.79f

    .line 596
    .line 597
    .line 598
    const v24, 0x40ceb852    # 6.46f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v4, -0x40747ae1    # -1.09f

    .line 605
    .line 606
    .line 607
    const v6, 0x40f51eb8    # 7.66f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v25, 0x409e147b    # 4.94f

    .line 614
    .line 615
    .line 616
    const/high16 v26, 0x41980000    # 19.0f

    .line 617
    .line 618
    const v21, 0x400ccccd    # 2.2f

    .line 619
    .line 620
    .line 621
    const v22, 0x418d0a3d    # 17.63f

    .line 622
    .line 623
    .line 624
    const v23, 0x4058f5c3    # 3.39f

    .line 625
    .line 626
    .line 627
    const/high16 v24, 0x41980000    # 19.0f

    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/4 v4, 0x0

    .line 633
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v25, 0x3fe66666    # 1.8f

    .line 637
    .line 638
    .line 639
    const/high16 v26, -0x40c00000    # -0.75f

    .line 640
    .line 641
    const v21, 0x3f2e147b    # 0.68f

    .line 642
    .line 643
    .line 644
    const/16 v22, 0x0

    .line 645
    .line 646
    const v23, 0x3fa8f5c3    # 1.32f

    .line 647
    .line 648
    .line 649
    const v24, -0x4175c28f    # -0.27f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, 0x41800000    # 16.0f

    .line 656
    .line 657
    const/high16 v6, 0x41100000    # 9.0f

    .line 658
    .line 659
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v4, 0x40c00000    # 6.0f

    .line 663
    .line 664
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v4, 0x40100000    # 2.25f

    .line 668
    .line 669
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v26, 0x3f400000    # 0.75f

    .line 673
    .line 674
    const v21, 0x3ef5c28f    # 0.48f

    .line 675
    .line 676
    .line 677
    const v22, 0x3ef5c28f    # 0.48f

    .line 678
    .line 679
    .line 680
    const v23, 0x3f90a3d7    # 1.13f

    .line 681
    .line 682
    .line 683
    const/high16 v24, 0x3f400000    # 0.75f

    .line 684
    .line 685
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/4 v4, 0x0

    .line 689
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v25, 0x41aca3d7    # 21.58f

    .line 693
    .line 694
    .line 695
    const v26, 0x4180b852    # 16.09f

    .line 696
    .line 697
    .line 698
    const v21, 0x41a4e148    # 20.61f

    .line 699
    .line 700
    .line 701
    const/high16 v22, 0x41980000    # 19.0f

    .line 702
    .line 703
    const v23, 0x41ae6666    # 21.8f

    .line 704
    .line 705
    .line 706
    const v24, 0x418d0a3d    # 17.63f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v4, 0x419bd70a    # 19.48f

    .line 716
    .line 717
    .line 718
    const v6, 0x41867ae1    # 16.81f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v25, 0x41987ae1    # 19.06f

    .line 725
    .line 726
    .line 727
    const/high16 v26, 0x41880000    # 17.0f

    .line 728
    .line 729
    const v21, 0x419b3333    # 19.4f

    .line 730
    .line 731
    .line 732
    const v22, 0x41873333    # 16.9f

    .line 733
    .line 734
    .line 735
    const v23, 0x419a28f6    # 19.27f

    .line 736
    .line 737
    .line 738
    const/high16 v24, 0x41880000    # 17.0f

    .line 739
    .line 740
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v25, -0x413851ec    # -0.39f

    .line 744
    .line 745
    .line 746
    const v26, -0x41dc28f6    # -0.16f

    .line 747
    .line 748
    .line 749
    const v21, -0x41e66666    # -0.15f

    .line 750
    .line 751
    .line 752
    const/16 v22, 0x0

    .line 753
    .line 754
    const v23, -0x416b851f    # -0.29f

    .line 755
    .line 756
    .line 757
    const v24, -0x428a3d71    # -0.06f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v4, 0x417d47ae    # 15.83f

    .line 764
    .line 765
    .line 766
    const/high16 v6, 0x41600000    # 14.0f

    .line 767
    .line 768
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v4, 0x4102b852    # 8.17f

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v4, -0x3fca3d71    # -2.84f

    .line 778
    .line 779
    .line 780
    const v6, 0x4035c28f    # 2.84f

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v25, 0x409e147b    # 4.94f

    .line 787
    .line 788
    .line 789
    const/high16 v26, 0x41880000    # 17.0f

    .line 790
    .line 791
    const v21, 0x40a75c29    # 5.23f

    .line 792
    .line 793
    .line 794
    const v22, 0x4187851f    # 16.94f

    .line 795
    .line 796
    .line 797
    const v23, 0x40a2e148    # 5.09f

    .line 798
    .line 799
    .line 800
    const/high16 v24, 0x41880000    # 17.0f

    .line 801
    .line 802
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v25, -0x4128f5c3    # -0.42f

    .line 806
    .line 807
    .line 808
    const v26, -0x41bd70a4    # -0.19f

    .line 809
    .line 810
    .line 811
    const v21, -0x41a8f5c3    # -0.21f

    .line 812
    .line 813
    .line 814
    const/16 v22, 0x0

    .line 815
    .line 816
    const v23, -0x4151eb85    # -0.34f

    .line 817
    .line 818
    .line 819
    const v24, -0x42333333    # -0.1f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v25, -0x41fae148    # -0.13f

    .line 826
    .line 827
    .line 828
    const v26, -0x411eb852    # -0.44f

    .line 829
    .line 830
    .line 831
    const v21, -0x425c28f6    # -0.08f

    .line 832
    .line 833
    .line 834
    const v22, -0x4247ae14    # -0.09f

    .line 835
    .line 836
    .line 837
    const v23, -0x41dc28f6    # -0.16f

    .line 838
    .line 839
    .line 840
    const v24, -0x41947ae1    # -0.23f

    .line 841
    .line 842
    .line 843
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v4, 0x3f8b851f    # 1.09f

    .line 847
    .line 848
    .line 849
    const v6, -0x3f0ae148    # -7.66f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v25, 0x40ef0a3d    # 7.47f

    .line 856
    .line 857
    .line 858
    const/high16 v26, 0x40e00000    # 7.0f

    .line 859
    .line 860
    const v21, 0x40b428f6    # 5.63f

    .line 861
    .line 862
    .line 863
    const v22, 0x40f7ae14    # 7.74f

    .line 864
    .line 865
    .line 866
    const v23, 0x40cf5c29    # 6.48f

    .line 867
    .line 868
    .line 869
    const/high16 v24, 0x40e00000    # 7.0f

    .line 870
    .line 871
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v4, 0x4110f5c3    # 9.06f

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v25, 0x3ffd70a4    # 1.98f

    .line 881
    .line 882
    .line 883
    const v26, 0x3fdc28f6    # 1.72f

    .line 884
    .line 885
    .line 886
    const v21, 0x3f7d70a4    # 0.99f

    .line 887
    .line 888
    .line 889
    const/16 v22, 0x0

    .line 890
    .line 891
    const v23, 0x3feb851f    # 1.84f

    .line 892
    .line 893
    .line 894
    const v24, 0x3f3d70a4    # 0.74f

    .line 895
    .line 896
    .line 897
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v4, 0x3f8b851f    # 1.09f

    .line 901
    .line 902
    .line 903
    const v6, 0x40f51eb8    # 7.66f

    .line 904
    .line 905
    .line 906
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const v25, 0x419bd70a    # 19.48f

    .line 910
    .line 911
    .line 912
    const v26, 0x41867ae1    # 16.81f

    .line 913
    .line 914
    .line 915
    const v21, 0x419d0a3d    # 19.63f

    .line 916
    .line 917
    .line 918
    const v22, 0x4184a3d7    # 16.58f

    .line 919
    .line 920
    .line 921
    const v23, 0x419c6666    # 19.55f

    .line 922
    .line 923
    .line 924
    const v24, 0x4185c28f    # 16.72f

    .line 925
    .line 926
    .line 927
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    const/high16 v6, 0x3f800000    # 1.0f

    .line 938
    .line 939
    const/high16 v8, 0x3f800000    # 1.0f

    .line 940
    .line 941
    const/4 v7, 0x0

    .line 942
    const-string v4, ""

    .line 943
    .line 944
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 945
    .line 946
    .line 947
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 952
    .line 953
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 954
    .line 955
    .line 956
    move-result-wide v6

    .line 957
    const/4 v2, 0x0

    .line 958
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 962
    .line 963
    .line 964
    move-result v10

    .line 965
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 966
    .line 967
    .line 968
    move-result v11

    .line 969
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 972
    .line 973
    .line 974
    const/high16 v4, 0x41000000    # 8.0f

    .line 975
    .line 976
    const/high16 v6, 0x41100000    # 9.0f

    .line 977
    .line 978
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v4, -0x40800000    # -1.0f

    .line 982
    .line 983
    const/4 v6, 0x0

    .line 984
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const/high16 v4, 0x40000000    # 2.0f

    .line 988
    .line 989
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const/high16 v4, -0x40000000    # -2.0f

    .line 993
    .line 994
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const/high16 v4, 0x3f800000    # 1.0f

    .line 998
    .line 999
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const/high16 v4, 0x40000000    # 2.0f

    .line 1003
    .line 1004
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1011
    .line 1012
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const/high16 v4, -0x40000000    # -2.0f

    .line 1016
    .line 1017
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const/high16 v4, 0x40000000    # 2.0f

    .line 1021
    .line 1022
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const/high16 v4, -0x40800000    # -1.0f

    .line 1026
    .line 1027
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/high16 v4, -0x40000000    # -2.0f

    .line 1031
    .line 1032
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1043
    .line 1044
    const/4 v7, 0x0

    .line 1045
    const-string v4, ""

    .line 1046
    .line 1047
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1048
    .line 1049
    .line 1050
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1051
    .line 1052
    .line 1053
    move-result v3

    .line 1054
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1055
    .line 1056
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1057
    .line 1058
    .line 1059
    move-result-wide v6

    .line 1060
    const/4 v2, 0x0

    .line 1061
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1065
    .line 1066
    .line 1067
    move-result v10

    .line 1068
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1069
    .line 1070
    .line 1071
    move-result v11

    .line 1072
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1075
    .line 1076
    .line 1077
    const/high16 v4, 0x41400000    # 12.0f

    .line 1078
    .line 1079
    const/high16 v6, 0x41880000    # 17.0f

    .line 1080
    .line 1081
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const/high16 v4, -0x40800000    # -1.0f

    .line 1085
    .line 1086
    const/4 v6, 0x0

    .line 1087
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const/high16 v26, 0x40000000    # 2.0f

    .line 1091
    .line 1092
    const/16 v27, 0x0

    .line 1093
    .line 1094
    const/high16 v21, 0x3f800000    # 1.0f

    .line 1095
    .line 1096
    const/high16 v22, 0x3f800000    # 1.0f

    .line 1097
    .line 1098
    const/16 v23, 0x0

    .line 1099
    .line 1100
    const/16 v24, 0x1

    .line 1101
    .line 1102
    const/16 v25, 0x1

    .line 1103
    .line 1104
    move-object/from16 v20, v2

    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const/high16 v26, -0x40000000    # -2.0f

    .line 1110
    .line 1111
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1119
    .line 1120
    const/4 v7, 0x0

    .line 1121
    const-string v4, ""

    .line 1122
    .line 1123
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1124
    .line 1125
    .line 1126
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1127
    .line 1128
    .line 1129
    move-result v3

    .line 1130
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1131
    .line 1132
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1133
    .line 1134
    .line 1135
    move-result-wide v6

    .line 1136
    const/4 v0, 0x0

    .line 1137
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1141
    .line 1142
    .line 1143
    move-result v10

    .line 1144
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1145
    .line 1146
    .line 1147
    move-result v11

    .line 1148
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    const/high16 v0, 0x41700000    # 15.0f

    .line 1154
    .line 1155
    const/high16 v2, 0x41100000    # 9.0f

    .line 1156
    .line 1157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const/high16 v0, -0x40800000    # -1.0f

    .line 1161
    .line 1162
    const/4 v2, 0x0

    .line 1163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const/high16 v18, 0x40000000    # 2.0f

    .line 1167
    .line 1168
    const/16 v19, 0x0

    .line 1169
    .line 1170
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1171
    .line 1172
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1173
    .line 1174
    const/16 v16, 0x1

    .line 1175
    .line 1176
    const/16 v17, 0x1

    .line 1177
    .line 1178
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const/high16 v18, -0x40000000    # -2.0f

    .line 1182
    .line 1183
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    const/16 v16, 0x3800

    .line 1191
    .line 1192
    const/16 v17, 0x0

    .line 1193
    .line 1194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1195
    .line 1196
    const/4 v7, 0x0

    .line 1197
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1198
    .line 1199
    const/4 v13, 0x0

    .line 1200
    const/4 v14, 0x0

    .line 1201
    const-string v4, ""

    .line 1202
    .line 1203
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsEsportsKt;->_sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1212
    .line 1213
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1214
    .line 1215
    .line 1216
    return-object v0
.end method
