.class public final Landroidx/compose/material/icons/filled/TimelineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timeline:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimeline(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/TimelineKt;->_timeline:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Timeline"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41b80000    # 23.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x40fd70a4    # -0.51f

    .line 94
    .line 95
    .line 96
    const v18, -0x4270a3d7    # -0.07f

    .line 97
    .line 98
    .line 99
    const v13, -0x41c7ae14    # -0.18f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const v15, -0x414ccccd    # -0.35f

    .line 104
    .line 105
    .line 106
    const v16, -0x435c28f6    # -0.02f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x40633333    # 3.55f

    .line 113
    .line 114
    .line 115
    const v2, -0x3f9c28f6    # -3.56f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, 0x41880000    # 17.0f

    .line 122
    .line 123
    const/high16 v18, 0x41600000    # 14.0f

    .line 124
    .line 125
    const v13, 0x4187d70a    # 16.98f

    .line 126
    .line 127
    .line 128
    const v14, 0x415a3d71    # 13.64f

    .line 129
    .line 130
    .line 131
    const/high16 v15, 0x41880000    # 17.0f

    .line 132
    .line 133
    const v16, 0x415d1eb8    # 13.82f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, -0x40000000    # -2.0f

    .line 140
    .line 141
    const/high16 v18, 0x40000000    # 2.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x3f8ccccd    # 1.1f

    .line 145
    .line 146
    .line 147
    const v15, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x40000000    # 2.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    const/high16 v2, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3d8f5c29    # 0.07f

    .line 164
    .line 165
    .line 166
    const v18, -0x40fae148    # -0.52f

    .line 167
    .line 168
    .line 169
    const v14, -0x41c7ae14    # -0.18f

    .line 170
    .line 171
    .line 172
    const v15, 0x3ca3d70a    # 0.02f

    .line 173
    .line 174
    .line 175
    const v16, -0x4147ae14    # -0.36f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x3fdccccd    # -2.55f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41200000    # 10.0f

    .line 188
    .line 189
    const/high16 v18, 0x41300000    # 11.0f

    .line 190
    .line 191
    const v13, 0x4125c28f    # 10.36f

    .line 192
    .line 193
    .line 194
    const v14, 0x412fae14    # 10.98f

    .line 195
    .line 196
    .line 197
    const v15, 0x4122e148    # 10.18f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x41300000    # 11.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x40fae148    # -0.52f

    .line 206
    .line 207
    .line 208
    const v2, -0x4270a3d7    # -0.07f

    .line 209
    .line 210
    .line 211
    const v4, -0x4147ae14    # -0.36f

    .line 212
    .line 213
    .line 214
    const v6, -0x435c28f6    # -0.02f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x4091eb85    # 4.56f

    .line 221
    .line 222
    .line 223
    const v2, -0x3f6e6666    # -4.55f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x40a00000    # 5.0f

    .line 230
    .line 231
    const/high16 v18, 0x41800000    # 16.0f

    .line 232
    .line 233
    const v13, 0x409f5c29    # 4.98f

    .line 234
    .line 235
    .line 236
    const v14, 0x417a6666    # 15.65f

    .line 237
    .line 238
    .line 239
    const/high16 v15, 0x40a00000    # 5.0f

    .line 240
    .line 241
    const v16, 0x417d1eb8    # 15.82f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40000000    # -2.0f

    .line 248
    .line 249
    const/high16 v18, 0x40000000    # 2.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, 0x3f8ccccd    # 1.1f

    .line 253
    .line 254
    .line 255
    const v15, -0x4099999a    # -0.9f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x4099999a    # -0.9f

    .line 264
    .line 265
    .line 266
    const/high16 v2, -0x40000000    # -2.0f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x3f666666    # 0.9f

    .line 272
    .line 273
    .line 274
    const/high16 v2, 0x40000000    # 2.0f

    .line 275
    .line 276
    const/high16 v4, -0x40000000    # -2.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3f028f5c    # 0.51f

    .line 282
    .line 283
    .line 284
    const v18, 0x3d8f5c29    # 0.07f

    .line 285
    .line 286
    .line 287
    const v13, 0x3e3851ec    # 0.18f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, 0x3eb33333    # 0.35f

    .line 292
    .line 293
    .line 294
    const v16, 0x3ca3d70a    # 0.02f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x4091eb85    # 4.56f

    .line 301
    .line 302
    .line 303
    const v2, -0x3f6e6666    # -4.55f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x41000000    # 8.0f

    .line 310
    .line 311
    const/high16 v18, 0x41100000    # 9.0f

    .line 312
    .line 313
    const v13, 0x410051ec    # 8.02f

    .line 314
    .line 315
    .line 316
    const v14, 0x4115c28f    # 9.36f

    .line 317
    .line 318
    .line 319
    const/high16 v15, 0x41000000    # 8.0f

    .line 320
    .line 321
    const v16, 0x4112e148    # 9.18f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/high16 v18, -0x40000000    # -2.0f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, -0x40733333    # -1.1f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f666666    # 0.9f

    .line 336
    .line 337
    .line 338
    const/high16 v16, -0x40000000    # -2.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x3f666666    # 0.9f

    .line 344
    .line 345
    .line 346
    const/high16 v2, 0x40000000    # 2.0f

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x4270a3d7    # -0.07f

    .line 352
    .line 353
    .line 354
    const v18, 0x3f051eb8    # 0.52f

    .line 355
    .line 356
    .line 357
    const v14, 0x3e3851ec    # 0.18f

    .line 358
    .line 359
    .line 360
    const v15, -0x435c28f6    # -0.02f

    .line 361
    .line 362
    .line 363
    const v16, 0x3eb851ec    # 0.36f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40233333    # 2.55f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, 0x41700000    # 15.0f

    .line 376
    .line 377
    const/high16 v18, 0x41400000    # 12.0f

    .line 378
    .line 379
    const v13, 0x416a3d71    # 14.64f

    .line 380
    .line 381
    .line 382
    const v14, 0x414051ec    # 12.02f

    .line 383
    .line 384
    .line 385
    const v15, 0x416d1eb8    # 14.82f

    .line 386
    .line 387
    .line 388
    const/high16 v16, 0x41400000    # 12.0f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x3f051eb8    # 0.52f

    .line 394
    .line 395
    .line 396
    const v2, 0x3d8f5c29    # 0.07f

    .line 397
    .line 398
    .line 399
    const v4, 0x3eb851ec    # 0.36f

    .line 400
    .line 401
    .line 402
    const v6, 0x3ca3d70a    # 0.02f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x40633333    # 3.55f

    .line 409
    .line 410
    .line 411
    const v2, -0x3f9c28f6    # -3.56f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x41980000    # 19.0f

    .line 418
    .line 419
    const/high16 v18, 0x41000000    # 8.0f

    .line 420
    .line 421
    const v13, 0x419828f6    # 19.02f

    .line 422
    .line 423
    .line 424
    const v14, 0x4105999a    # 8.35f

    .line 425
    .line 426
    .line 427
    const/high16 v15, 0x41980000    # 19.0f

    .line 428
    .line 429
    const v16, 0x4102e148    # 8.18f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x40000000    # 2.0f

    .line 436
    .line 437
    const/high16 v18, -0x40000000    # -2.0f

    .line 438
    .line 439
    const/4 v13, 0x0

    .line 440
    const v14, -0x40733333    # -1.1f

    .line 441
    .line 442
    .line 443
    const v15, 0x3f666666    # 0.9f

    .line 444
    .line 445
    .line 446
    const/high16 v16, -0x40000000    # -2.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40dccccd    # 6.9f

    .line 452
    .line 453
    .line 454
    const/high16 v2, 0x41000000    # 8.0f

    .line 455
    .line 456
    const/high16 v4, 0x41b80000    # 23.0f

    .line 457
    .line 458
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v16, 0x3800

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/high16 v8, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/4 v7, 0x0

    .line 477
    const/high16 v9, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v12, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    const-string v4, ""

    .line 484
    .line 485
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    sput-object v0, Landroidx/compose/material/icons/filled/TimelineKt;->_timeline:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 494
    .line 495
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    return-object v0
.end method
