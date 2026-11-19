.class public final Landroidx/compose/material/icons/twotone/AirlineSeatFlatAngledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatFlatAngled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AirlineSeatFlatAngled"

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
    const v4, 0x41851eb8    # 16.64f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x40466666    # -1.45f

    .line 79
    .line 80
    .line 81
    const/high16 v6, -0x3f800000    # -4.0f

    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, 0x41880000    # 17.0f

    .line 87
    .line 88
    const/high16 v6, 0x41200000    # 10.0f

    .line 89
    .line 90
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41080000    # 8.5f

    .line 102
    .line 103
    const/high16 v6, 0x40c00000    # 6.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, 0x3ee147ae    # 0.44f

    .line 109
    .line 110
    .line 111
    const v26, -0x42333333    # -0.1f

    .line 112
    .line 113
    .line 114
    const v21, 0x3e19999a    # 0.15f

    .line 115
    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const v23, 0x3e99999a    # 0.3f

    .line 120
    .line 121
    .line 122
    const v24, -0x430a3d71    # -0.03f

    .line 123
    .line 124
    .line 125
    move-object/from16 v20, v2

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v25, 0x3eeb851f    # 0.46f

    .line 131
    .line 132
    .line 133
    const v26, -0x40547ae1    # -1.34f

    .line 134
    .line 135
    .line 136
    const v21, 0x3efae148    # 0.49f

    .line 137
    .line 138
    .line 139
    const v22, -0x418a3d71    # -0.24f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f333333    # 0.7f

    .line 143
    .line 144
    .line 145
    const v24, -0x40a8f5c3    # -0.84f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, -0x4099999a    # -0.9f

    .line 152
    .line 153
    .line 154
    const v26, -0x40f0a3d7    # -0.56f

    .line 155
    .line 156
    .line 157
    const v21, -0x41bd70a4    # -0.19f

    .line 158
    .line 159
    .line 160
    const v22, -0x412e147b    # -0.41f

    .line 161
    .line 162
    .line 163
    const v23, -0x40e8f5c3    # -0.59f

    .line 164
    .line 165
    .line 166
    const v24, -0x40f0a3d7    # -0.56f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x411eb852    # -0.44f

    .line 173
    .line 174
    .line 175
    const v26, 0x3dcccccd    # 0.1f

    .line 176
    .line 177
    .line 178
    const v21, -0x41e66666    # -0.15f

    .line 179
    .line 180
    .line 181
    const/16 v22, 0x0

    .line 182
    .line 183
    const v23, -0x41666666    # -0.3f

    .line 184
    .line 185
    .line 186
    const v24, 0x3cf5c28f    # 0.03f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, -0x41000000    # -0.5f

    .line 193
    .line 194
    const v26, 0x3f0f5c29    # 0.56f

    .line 195
    .line 196
    .line 197
    const v21, -0x415c28f6    # -0.32f

    .line 198
    .line 199
    .line 200
    const v22, 0x3e23d70a    # 0.16f

    .line 201
    .line 202
    .line 203
    const v23, -0x4119999a    # -0.45f

    .line 204
    .line 205
    .line 206
    const v24, 0x3ed70a3d    # 0.42f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, 0x3d23d70a    # 0.04f

    .line 213
    .line 214
    .line 215
    const v26, 0x3f451eb8    # 0.77f

    .line 216
    .line 217
    .line 218
    const v21, -0x42b33333    # -0.05f

    .line 219
    .line 220
    .line 221
    const v22, 0x3e19999a    # 0.15f

    .line 222
    .line 223
    .line 224
    const v23, -0x420a3d71    # -0.12f

    .line 225
    .line 226
    .line 227
    const v24, 0x3ee147ae    # 0.44f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x3f666666    # 0.9f

    .line 234
    .line 235
    .line 236
    const v26, 0x3f11eb85    # 0.57f

    .line 237
    .line 238
    .line 239
    const v21, 0x3e4ccccd    # 0.2f

    .line 240
    .line 241
    .line 242
    const v22, 0x3ed70a3d    # 0.42f

    .line 243
    .line 244
    .line 245
    const v23, 0x3f170a3d    # 0.59f

    .line 246
    .line 247
    .line 248
    const v24, 0x3f11eb85    # 0.57f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x419947ae    # 19.16f

    .line 258
    .line 259
    .line 260
    const v6, 0x413051ec    # 11.02f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, -0x3f29eb85    # -6.69f

    .line 267
    .line 268
    .line 269
    const v6, -0x3fe5c28f    # -2.41f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, -0x40cccccd    # -0.7f

    .line 276
    .line 277
    .line 278
    const v6, 0x3ff47ae1    # 1.91f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x410970a4    # 8.59f

    .line 285
    .line 286
    .line 287
    const v6, 0x40470a3d    # 3.11f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, 0x3c23d70a    # 0.01f

    .line 294
    .line 295
    .line 296
    const v6, -0x435c28f6    # -0.02f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, -0x428a3d71    # -0.06f

    .line 303
    .line 304
    .line 305
    const v26, -0x403c28f6    # -1.53f

    .line 306
    .line 307
    .line 308
    const v21, 0x3e428f5c    # 0.19f

    .line 309
    .line 310
    .line 311
    const v22, -0x40fd70a4    # -0.51f

    .line 312
    .line 313
    .line 314
    const v23, 0x3e2e147b    # 0.17f

    .line 315
    .line 316
    .line 317
    const v24, -0x4079999a    # -1.05f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v25, -0x406ccccd    # -1.15f

    .line 324
    .line 325
    .line 326
    const v26, -0x407851ec    # -1.06f

    .line 327
    .line 328
    .line 329
    const v21, -0x41947ae1    # -0.23f

    .line 330
    .line 331
    .line 332
    const/high16 v22, -0x41000000    # -0.5f

    .line 333
    .line 334
    const v23, -0x40deb852    # -0.63f

    .line 335
    .line 336
    .line 337
    const v24, -0x40a147ae    # -0.87f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    const/16 v16, 0x3800

    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const v6, 0x3e99999a    # 0.3f

    .line 355
    .line 356
    .line 357
    const v8, 0x3e99999a    # 0.3f

    .line 358
    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    const/high16 v9, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v12, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const-string v4, ""

    .line 369
    .line 370
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v6

    .line 383
    const/4 v0, 0x0

    .line 384
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 401
    .line 402
    const v2, 0x41423d71    # 12.14f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x4167ae14    # 14.48f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x41000000    # 8.0f

    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41980000    # 19.0f

    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41000000    # 8.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x402f5c29    # -1.63f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x41a428f6    # 20.52f

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x41980000    # 19.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x400e147b    # -1.89f

    .line 441
    .line 442
    .line 443
    const v2, 0x3f30a3d7    # 0.69f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x3e67d70a    # -19.02f

    .line 450
    .line 451
    .line 452
    const v2, -0x3f247ae1    # -6.86f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x40cf5c29    # -0.69f

    .line 459
    .line 460
    .line 461
    const v2, 0x3ff1eb85    # 1.89f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x41730a3d    # 15.19f

    .line 471
    .line 472
    .line 473
    const/high16 v2, 0x41200000    # 10.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3fb851ec    # 1.44f

    .line 479
    .line 480
    .line 481
    const/high16 v2, 0x40800000    # 4.0f

    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41880000    # 17.0f

    .line 487
    .line 488
    const/high16 v2, 0x41600000    # 14.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x3f800000    # -4.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x401851ec    # -1.81f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x419eb852    # 19.84f

    .line 508
    .line 509
    .line 510
    const v2, 0x41123d71    # 9.14f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x3ef70a3d    # -8.56f

    .line 517
    .line 518
    .line 519
    const v2, -0x3fba3d71    # -3.09f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, -0x3ffae148    # -2.08f

    .line 526
    .line 527
    .line 528
    const v2, 0x40b51eb8    # 5.66f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x4145c28f    # 12.36f

    .line 535
    .line 536
    .line 537
    const v2, 0x408f0a3d    # 4.47f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, -0x400e147b    # -1.89f

    .line 544
    .line 545
    .line 546
    const v2, 0x3f30a3d7    # 0.69f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x3fe5c28f    # -2.41f

    .line 553
    .line 554
    .line 555
    const v18, -0x3f5b3333    # -5.15f

    .line 556
    .line 557
    .line 558
    const v13, 0x3f451eb8    # 0.77f

    .line 559
    .line 560
    .line 561
    const v14, -0x3ffa3d71    # -2.09f

    .line 562
    .line 563
    .line 564
    const v15, -0x416147ae    # -0.31f

    .line 565
    .line 566
    .line 567
    const v16, -0x3f73851f    # -4.39f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x41a2f5c3    # 20.37f

    .line 577
    .line 578
    .line 579
    const v2, 0x4159999a    # 13.6f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x43dc28f6    # -0.01f

    .line 586
    .line 587
    .line 588
    const v2, 0x3ca3d70a    # 0.02f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x3ef68f5c    # -8.59f

    .line 595
    .line 596
    .line 597
    const v2, -0x3fb8f5c3    # -3.11f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x3f333333    # 0.7f

    .line 604
    .line 605
    .line 606
    const v2, -0x400b851f    # -1.91f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x40d6147b    # 6.69f

    .line 613
    .line 614
    .line 615
    const v2, 0x401a3d71    # 2.41f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v17, 0x3f933333    # 1.15f

    .line 622
    .line 623
    .line 624
    const v18, 0x3f866666    # 1.05f

    .line 625
    .line 626
    .line 627
    const v13, 0x3f051eb8    # 0.52f

    .line 628
    .line 629
    .line 630
    const v14, 0x3e428f5c    # 0.19f

    .line 631
    .line 632
    .line 633
    const v15, 0x3f6e147b    # 0.93f

    .line 634
    .line 635
    .line 636
    const v16, 0x3f0f5c29    # 0.56f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3d75c28f    # 0.06f

    .line 643
    .line 644
    .line 645
    const v18, 0x3fc51eb8    # 1.54f

    .line 646
    .line 647
    .line 648
    const v13, 0x3e6b851f    # 0.23f

    .line 649
    .line 650
    .line 651
    const v14, 0x3efae148    # 0.49f

    .line 652
    .line 653
    .line 654
    const/high16 v15, 0x3e800000    # 0.25f

    .line 655
    .line 656
    const v16, 0x3f851eb8    # 1.04f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x41280000    # 10.5f

    .line 666
    .line 667
    const/high16 v2, 0x40c00000    # 6.0f

    .line 668
    .line 669
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x3fa66666    # 1.3f

    .line 673
    .line 674
    .line 675
    const v18, -0x41666666    # -0.3f

    .line 676
    .line 677
    .line 678
    const v13, 0x3ee147ae    # 0.44f

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x0

    .line 682
    const v15, 0x3f6147ae    # 0.88f

    .line 683
    .line 684
    .line 685
    const v16, -0x42333333    # -0.1f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, 0x3fb47ae1    # 1.41f

    .line 692
    .line 693
    .line 694
    const/high16 v18, -0x3f800000    # -4.0f

    .line 695
    .line 696
    const v13, 0x3fbeb852    # 1.49f

    .line 697
    .line 698
    .line 699
    const v14, -0x40c7ae14    # -0.72f

    .line 700
    .line 701
    .line 702
    const v15, 0x4007ae14    # 2.12f

    .line 703
    .line 704
    .line 705
    const v16, -0x3fdf5c29    # -2.51f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, 0x40c00000    # 6.0f

    .line 712
    .line 713
    const/high16 v18, 0x40900000    # 4.5f

    .line 714
    .line 715
    const v13, 0x41030a3d    # 8.19f

    .line 716
    .line 717
    .line 718
    const v14, 0x40a428f6    # 5.13f

    .line 719
    .line 720
    .line 721
    const v15, 0x40e3d70a    # 7.12f

    .line 722
    .line 723
    .line 724
    const/high16 v16, 0x40900000    # 4.5f

    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v17, -0x4059999a    # -1.3f

    .line 730
    .line 731
    .line 732
    const v18, 0x3e99999a    # 0.3f

    .line 733
    .line 734
    .line 735
    const v13, -0x411eb852    # -0.44f

    .line 736
    .line 737
    .line 738
    const/4 v14, 0x0

    .line 739
    const v15, -0x409eb852    # -0.88f

    .line 740
    .line 741
    .line 742
    const v16, 0x3dcccccd    # 0.1f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v17, -0x404ccccd    # -1.4f

    .line 749
    .line 750
    .line 751
    const/high16 v18, 0x40800000    # 4.0f

    .line 752
    .line 753
    const v13, -0x404147ae    # -1.49f

    .line 754
    .line 755
    .line 756
    const v14, 0x3f35c28f    # 0.71f

    .line 757
    .line 758
    .line 759
    const v15, -0x3ff851ec    # -2.12f

    .line 760
    .line 761
    .line 762
    const/high16 v16, 0x40200000    # 2.5f

    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x402ccccd    # 2.7f

    .line 768
    .line 769
    .line 770
    const v18, 0x3fd9999a    # 1.7f

    .line 771
    .line 772
    .line 773
    const v13, 0x3f028f5c    # 0.51f

    .line 774
    .line 775
    .line 776
    const v14, 0x3f88f5c3    # 1.07f

    .line 777
    .line 778
    .line 779
    const v15, 0x3fca3d71    # 1.58f

    .line 780
    .line 781
    .line 782
    const v16, 0x3fd9999a    # 1.7f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, 0x40a1eb85    # 5.06f

    .line 792
    .line 793
    .line 794
    const v2, 0x40e51eb8    # 7.16f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v17, 0x3f028f5c    # 0.51f

    .line 801
    .line 802
    .line 803
    const v18, -0x40f0a3d7    # -0.56f

    .line 804
    .line 805
    .line 806
    const v13, 0x3d4ccccd    # 0.05f

    .line 807
    .line 808
    .line 809
    const v14, -0x41f0a3d7    # -0.14f

    .line 810
    .line 811
    .line 812
    const v15, 0x3e3851ec    # 0.18f

    .line 813
    .line 814
    .line 815
    const v16, -0x41333333    # -0.4f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v17, 0x3edc28f6    # 0.43f

    .line 822
    .line 823
    .line 824
    const v18, -0x42333333    # -0.1f

    .line 825
    .line 826
    .line 827
    const v13, 0x3e0f5c29    # 0.14f

    .line 828
    .line 829
    .line 830
    const v14, -0x428a3d71    # -0.06f

    .line 831
    .line 832
    .line 833
    const v15, 0x3e8f5c29    # 0.28f

    .line 834
    .line 835
    .line 836
    const v16, -0x42333333    # -0.1f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v17, 0x3f666666    # 0.9f

    .line 843
    .line 844
    .line 845
    const v18, 0x3f0f5c29    # 0.56f

    .line 846
    .line 847
    .line 848
    const v13, 0x3e9eb852    # 0.31f

    .line 849
    .line 850
    .line 851
    const/4 v14, 0x0

    .line 852
    const v15, 0x3f333333    # 0.7f

    .line 853
    .line 854
    .line 855
    const v16, 0x3e19999a    # 0.15f

    .line 856
    .line 857
    .line 858
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v17, -0x410f5c29    # -0.47f

    .line 862
    .line 863
    .line 864
    const v18, 0x3fab851f    # 1.34f

    .line 865
    .line 866
    .line 867
    const v13, 0x3e75c28f    # 0.24f

    .line 868
    .line 869
    .line 870
    const/high16 v14, 0x3f000000    # 0.5f

    .line 871
    .line 872
    const v15, 0x3ca3d70a    # 0.02f

    .line 873
    .line 874
    .line 875
    const v16, 0x3f8ccccd    # 1.1f

    .line 876
    .line 877
    .line 878
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v17, -0x4123d70a    # -0.43f

    .line 882
    .line 883
    .line 884
    const v18, 0x3dcccccd    # 0.1f

    .line 885
    .line 886
    .line 887
    const v13, -0x41f0a3d7    # -0.14f

    .line 888
    .line 889
    .line 890
    const v14, 0x3d75c28f    # 0.06f

    .line 891
    .line 892
    .line 893
    const v15, -0x4170a3d7    # -0.28f

    .line 894
    .line 895
    .line 896
    const v16, 0x3dcccccd    # 0.1f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, -0x409c28f6    # -0.89f

    .line 903
    .line 904
    .line 905
    const v18, -0x40f0a3d7    # -0.56f

    .line 906
    .line 907
    .line 908
    const v13, -0x41666666    # -0.3f

    .line 909
    .line 910
    .line 911
    const/4 v14, 0x0

    .line 912
    const v15, -0x40cccccd    # -0.7f

    .line 913
    .line 914
    .line 915
    const v16, -0x41e66666    # -0.15f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v17, -0x42b33333    # -0.05f

    .line 922
    .line 923
    .line 924
    const v18, -0x40b851ec    # -0.78f

    .line 925
    .line 926
    .line 927
    const v13, -0x41d1eb85    # -0.17f

    .line 928
    .line 929
    .line 930
    const v14, -0x4151eb85    # -0.34f

    .line 931
    .line 932
    .line 933
    const v15, -0x42333333    # -0.1f

    .line 934
    .line 935
    .line 936
    const v16, -0x40deb852    # -0.63f

    .line 937
    .line 938
    .line 939
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const/16 v16, 0x3800

    .line 950
    .line 951
    const/16 v17, 0x0

    .line 952
    .line 953
    const/high16 v6, 0x3f800000    # 1.0f

    .line 954
    .line 955
    const/high16 v8, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const/4 v7, 0x0

    .line 958
    const/high16 v12, 0x3f800000    # 1.0f

    .line 959
    .line 960
    const/4 v13, 0x0

    .line 961
    const/4 v14, 0x0

    .line 962
    const/4 v15, 0x0

    .line 963
    const-string v4, ""

    .line 964
    .line 965
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    sput-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 974
    .line 975
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0
.end method
