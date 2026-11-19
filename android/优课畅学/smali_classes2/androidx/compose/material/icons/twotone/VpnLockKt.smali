.class public final Landroidx/compose/material/icons/twotone/VpnLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVpnLock(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VpnLockKt;->_vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VpnLock"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, -0x40800000    # -1.0f

    .line 88
    .line 89
    const/high16 v26, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const/16 v21, 0x0

    .line 92
    .line 93
    const v22, 0x3f0ccccd    # 0.55f

    .line 94
    .line 95
    .line 96
    const v23, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v24, 0x3f800000    # 1.0f

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41300000    # 11.0f

    .line 107
    .line 108
    const/high16 v6, 0x40e00000    # 7.0f

    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x40c00000    # 6.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const v21, 0x3f0ccccd    # 0.55f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v24, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40400000    # 3.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x3f800000    # 1.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, 0x3ff33333    # 1.9f

    .line 149
    .line 150
    .line 151
    const v26, 0x3fb1eb85    # 1.39f

    .line 152
    .line 153
    .line 154
    const v21, 0x3f666666    # 0.9f

    .line 155
    .line 156
    .line 157
    const v23, 0x3fd1eb85    # 1.64f

    .line 158
    .line 159
    .line 160
    const v24, 0x3f147ae1    # 0.58f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41980000    # 19.0f

    .line 167
    .line 168
    const/high16 v26, 0x41500000    # 13.0f

    .line 169
    .line 170
    const v21, 0x4191999a    # 18.2f

    .line 171
    .line 172
    .line 173
    const v22, 0x4187c28f    # 16.97f

    .line 174
    .line 175
    .line 176
    const/high16 v23, 0x41980000    # 19.0f

    .line 177
    .line 178
    const v24, 0x417147ae    # 15.08f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, -0x425c28f6    # -0.08f

    .line 185
    .line 186
    .line 187
    const/high16 v26, -0x40800000    # -1.0f

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const v22, -0x4151eb85    # -0.34f

    .line 192
    .line 193
    .line 194
    const v23, -0x42dc28f6    # -0.04f

    .line 195
    .line 196
    .line 197
    const v24, -0x40d47ae1    # -0.67f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x41400000    # 12.0f

    .line 204
    .line 205
    const/high16 v6, 0x41880000    # 17.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 211
    .line 212
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 213
    .line 214
    const v21, -0x402ccccd    # -1.65f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 220
    .line 221
    const v24, -0x40533333    # -1.35f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41600000    # 14.0f

    .line 228
    .line 229
    const/high16 v6, 0x40c00000    # 6.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v25, -0x40000000    # -2.0f

    .line 235
    .line 236
    const/high16 v26, 0x40000000    # 2.0f

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const v22, 0x3f8ccccd    # 1.1f

    .line 241
    .line 242
    .line 243
    const v23, -0x4099999a    # -0.9f

    .line 244
    .line 245
    .line 246
    const/high16 v24, 0x40000000    # 2.0f

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41000000    # 8.0f

    .line 255
    .line 256
    const/high16 v6, 0x41880000    # 17.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, -0x40800000    # -1.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, -0x3f66b852    # -4.79f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x40400000    # 3.0f

    .line 273
    .line 274
    const/high16 v26, 0x41500000    # 13.0f

    .line 275
    .line 276
    const v21, 0x40451eb8    # 3.08f

    .line 277
    .line 278
    .line 279
    const v22, 0x413ca3d7    # 11.79f

    .line 280
    .line 281
    .line 282
    const/high16 v23, 0x40400000    # 3.0f

    .line 283
    .line 284
    const v24, 0x4146147b    # 12.38f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const v26, 0x40fdc28f    # 7.93f

    .line 293
    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const v22, 0x40828f5c    # 4.08f

    .line 298
    .line 299
    .line 300
    const v23, 0x40433333    # 3.05f

    .line 301
    .line 302
    .line 303
    const v24, 0x40ee147b    # 7.44f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x41980000    # 19.0f

    .line 310
    .line 311
    const/high16 v6, 0x41200000    # 10.0f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v25, -0x40000000    # -2.0f

    .line 317
    .line 318
    const/high16 v26, -0x40000000    # -2.0f

    .line 319
    .line 320
    const v21, -0x40733333    # -1.1f

    .line 321
    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/high16 v23, -0x40000000    # -2.0f

    .line 326
    .line 327
    const v24, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/16 v16, 0x3800

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const v6, 0x3e99999a    # 0.3f

    .line 345
    .line 346
    .line 347
    const v8, 0x3e99999a    # 0.3f

    .line 348
    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    const/high16 v9, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v12, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    const-string v4, ""

    .line 359
    .line 360
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 361
    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 370
    .line 371
    .line 372
    move-result-wide v6

    .line 373
    const/4 v0, 0x0

    .line 374
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 382
    .line 383
    .line 384
    move-result v11

    .line 385
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    const v0, 0x41975c29    # 18.92f

    .line 391
    .line 392
    .line 393
    const/high16 v2, 0x41400000    # 12.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3da3d70a    # 0.08f

    .line 399
    .line 400
    .line 401
    const/high16 v18, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const v13, 0x3d23d70a    # 0.04f

    .line 404
    .line 405
    .line 406
    const v14, 0x3ea8f5c3    # 0.33f

    .line 407
    .line 408
    .line 409
    const v15, 0x3da3d70a    # 0.08f

    .line 410
    .line 411
    .line 412
    const v16, 0x3f28f5c3    # 0.66f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x3ff9999a    # -2.1f

    .line 419
    .line 420
    .line 421
    const v18, 0x40ac7ae1    # 5.39f

    .line 422
    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const v14, 0x40051eb8    # 2.08f

    .line 426
    .line 427
    .line 428
    const v15, -0x40b33333    # -0.8f

    .line 429
    .line 430
    .line 431
    const v16, 0x407e147b    # 3.97f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x400ccccd    # -1.9f

    .line 438
    .line 439
    .line 440
    const v18, -0x404e147b    # -1.39f

    .line 441
    .line 442
    .line 443
    const v13, -0x417ae148    # -0.26f

    .line 444
    .line 445
    .line 446
    const v14, -0x40b0a3d7    # -0.81f

    .line 447
    .line 448
    .line 449
    const/high16 v15, -0x40800000    # -1.0f

    .line 450
    .line 451
    const v16, -0x404e147b    # -1.39f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, -0x40800000    # -1.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, -0x40800000    # -1.0f

    .line 468
    .line 469
    const/high16 v18, -0x40800000    # -1.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const v14, -0x40f33333    # -0.55f

    .line 473
    .line 474
    .line 475
    const v15, -0x4119999a    # -0.45f

    .line 476
    .line 477
    .line 478
    const/high16 v16, -0x40800000    # -1.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41500000    # 13.0f

    .line 484
    .line 485
    const/high16 v2, 0x40e00000    # 7.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, -0x40000000    # -2.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40000000    # 2.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const v13, 0x3f0ccccd    # 0.55f

    .line 503
    .line 504
    .line 505
    const/4 v14, 0x0

    .line 506
    const/high16 v15, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const v16, -0x4119999a    # -0.45f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41000000    # 8.0f

    .line 515
    .line 516
    const/high16 v2, 0x41200000    # 10.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x40000000    # 2.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x40000000    # 2.0f

    .line 527
    .line 528
    const/high16 v18, -0x40000000    # -2.0f

    .line 529
    .line 530
    const v13, 0x3f8ccccd    # 1.1f

    .line 531
    .line 532
    .line 533
    const/high16 v15, 0x40000000    # 2.0f

    .line 534
    .line 535
    const v16, -0x4099999a    # -0.9f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x405d70a4    # 3.46f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x41600000    # 14.0f

    .line 545
    .line 546
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 550
    .line 551
    const v18, -0x41147ae1    # -0.46f

    .line 552
    .line 553
    .line 554
    const v13, -0x408ccccd    # -0.95f

    .line 555
    .line 556
    .line 557
    const v14, -0x41666666    # -0.3f

    .line 558
    .line 559
    .line 560
    const v15, -0x40066666    # -1.95f

    .line 561
    .line 562
    .line 563
    const v16, -0x41147ae1    # -0.46f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v18, 0x41500000    # 13.0f

    .line 572
    .line 573
    const v13, 0x40af5c29    # 5.48f

    .line 574
    .line 575
    .line 576
    const/high16 v14, 0x40400000    # 3.0f

    .line 577
    .line 578
    const/high16 v15, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const v16, 0x40ef5c29    # 7.48f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x408f5c29    # 4.48f

    .line 587
    .line 588
    .line 589
    const/high16 v2, 0x41200000    # 10.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x3f70a3d7    # -4.48f

    .line 595
    .line 596
    .line 597
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 598
    .line 599
    const/high16 v4, 0x41200000    # 10.0f

    .line 600
    .line 601
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, -0x42b33333    # -0.05f

    .line 605
    .line 606
    .line 607
    const/high16 v18, -0x40800000    # -1.0f

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const v14, -0x4151eb85    # -0.34f

    .line 611
    .line 612
    .line 613
    const v15, -0x435c28f6    # -0.02f

    .line 614
    .line 615
    .line 616
    const v16, -0x40d47ae1    # -0.67f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, -0x3ffe147b    # -2.03f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x41a770a4    # 20.93f

    .line 632
    .line 633
    .line 634
    const/high16 v2, 0x41200000    # 10.0f

    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, -0x3f200000    # -7.0f

    .line 640
    .line 641
    const v18, -0x3f023d71    # -7.93f

    .line 642
    .line 643
    .line 644
    const v13, -0x3f833333    # -3.95f

    .line 645
    .line 646
    .line 647
    const v14, -0x41051eb8    # -0.49f

    .line 648
    .line 649
    .line 650
    const/high16 v15, -0x3f200000    # -7.0f

    .line 651
    .line 652
    const v16, -0x3f89999a    # -3.85f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3e570a3d    # 0.21f

    .line 659
    .line 660
    .line 661
    const v18, -0x401ae148    # -1.79f

    .line 662
    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    const v14, -0x40e147ae    # -0.62f

    .line 666
    .line 667
    .line 668
    const v15, 0x3da3d70a    # 0.08f

    .line 669
    .line 670
    .line 671
    const v16, -0x40651eb8    # -1.21f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x41800000    # 16.0f

    .line 678
    .line 679
    const/high16 v2, 0x41000000    # 8.0f

    .line 680
    .line 681
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x3f800000    # 1.0f

    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, 0x40000000    # 2.0f

    .line 690
    .line 691
    const/high16 v18, 0x40000000    # 2.0f

    .line 692
    .line 693
    const v14, 0x3f8ccccd    # 1.1f

    .line 694
    .line 695
    .line 696
    const v15, 0x3f666666    # 0.9f

    .line 697
    .line 698
    .line 699
    const/high16 v16, 0x40000000    # 2.0f

    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, 0x3ff70a3d    # 1.93f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x41b00000    # 22.0f

    .line 714
    .line 715
    const/high16 v2, 0x40800000    # 4.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v0, -0x41000000    # -0.5f

    .line 721
    .line 722
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v17, 0x419c0000    # 19.5f

    .line 726
    .line 727
    const/high16 v18, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v13, 0x41b00000    # 22.0f

    .line 730
    .line 731
    const v14, 0x4007ae14    # 2.12f

    .line 732
    .line 733
    .line 734
    const v15, 0x41a70a3d    # 20.88f

    .line 735
    .line 736
    .line 737
    const/high16 v16, 0x3f800000    # 1.0f

    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x4007ae14    # 2.12f

    .line 743
    .line 744
    .line 745
    const/high16 v2, 0x40600000    # 3.5f

    .line 746
    .line 747
    const/high16 v4, 0x41880000    # 17.0f

    .line 748
    .line 749
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v0, 0x40800000    # 4.0f

    .line 753
    .line 754
    const/high16 v2, 0x41880000    # 17.0f

    .line 755
    .line 756
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v17, -0x40800000    # -1.0f

    .line 760
    .line 761
    const v13, -0x40f33333    # -0.55f

    .line 762
    .line 763
    .line 764
    const/4 v14, 0x0

    .line 765
    const/high16 v15, -0x40800000    # -1.0f

    .line 766
    .line 767
    const v16, 0x3ee66666    # 0.45f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v17, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/4 v13, 0x0

    .line 779
    const v14, 0x3f0ccccd    # 0.55f

    .line 780
    .line 781
    .line 782
    const v15, 0x3ee66666    # 0.45f

    .line 783
    .line 784
    .line 785
    const/high16 v16, 0x3f800000    # 1.0f

    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v0, 0x40a00000    # 5.0f

    .line 791
    .line 792
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v18, -0x40800000    # -1.0f

    .line 796
    .line 797
    const v13, 0x3f0ccccd    # 0.55f

    .line 798
    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const/high16 v15, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const v16, -0x4119999a    # -0.45f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const/high16 v0, 0x41b80000    # 23.0f

    .line 810
    .line 811
    const/high16 v2, 0x40a00000    # 5.0f

    .line 812
    .line 813
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const/high16 v17, -0x40800000    # -1.0f

    .line 817
    .line 818
    const/4 v13, 0x0

    .line 819
    const v14, -0x40f33333    # -0.55f

    .line 820
    .line 821
    .line 822
    const v15, -0x4119999a    # -0.45f

    .line 823
    .line 824
    .line 825
    const/high16 v16, -0x40800000    # -1.0f

    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x41a80000    # 21.0f

    .line 834
    .line 835
    const/high16 v2, 0x40800000    # 4.0f

    .line 836
    .line 837
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 841
    .line 842
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v0, -0x41000000    # -0.5f

    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 851
    .line 852
    const/high16 v18, -0x40400000    # -1.5f

    .line 853
    .line 854
    const v14, -0x40ab851f    # -0.83f

    .line 855
    .line 856
    .line 857
    const v15, 0x3f2b851f    # 0.67f

    .line 858
    .line 859
    .line 860
    const/high16 v16, -0x40400000    # -1.5f

    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v0, 0x3f2b851f    # 0.67f

    .line 866
    .line 867
    .line 868
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 869
    .line 870
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v0, 0x41a80000    # 21.0f

    .line 874
    .line 875
    const/high16 v2, 0x40800000    # 4.0f

    .line 876
    .line 877
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    const/16 v16, 0x3800

    .line 888
    .line 889
    const/16 v17, 0x0

    .line 890
    .line 891
    const/high16 v6, 0x3f800000    # 1.0f

    .line 892
    .line 893
    const/high16 v8, 0x3f800000    # 1.0f

    .line 894
    .line 895
    const/4 v7, 0x0

    .line 896
    const/high16 v12, 0x3f800000    # 1.0f

    .line 897
    .line 898
    const/4 v14, 0x0

    .line 899
    const/4 v15, 0x0

    .line 900
    const-string v4, ""

    .line 901
    .line 902
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    sput-object v0, Landroidx/compose/material/icons/twotone/VpnLockKt;->_vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 911
    .line 912
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    return-object v0
.end method
