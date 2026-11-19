.class public final Landroidx/compose/material/icons/rounded/PermCameraMicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermCameraMic(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PermCameraMicKt;->_permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PermCameraMic"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x406147ae    # -1.24f

    .line 84
    .line 85
    .line 86
    const v2, -0x40533333    # -1.35f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, -0x4043d70a    # -1.47f

    .line 93
    .line 94
    .line 95
    const v18, -0x40d9999a    # -0.65f

    .line 96
    .line 97
    .line 98
    const v13, -0x41428f5c    # -0.37f

    .line 99
    .line 100
    .line 101
    const v14, -0x412e147b    # -0.41f

    .line 102
    .line 103
    .line 104
    const v15, -0x40970a3d    # -0.91f

    .line 105
    .line 106
    .line 107
    const v16, -0x40d9999a    # -0.65f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x411e147b    # 9.88f

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x40400000    # 3.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x40428f5c    # -1.48f

    .line 122
    .line 123
    .line 124
    const v18, 0x3f266666    # 0.65f

    .line 125
    .line 126
    .line 127
    const v13, -0x40f0a3d7    # -0.56f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, -0x40733333    # -1.1f

    .line 132
    .line 133
    .line 134
    const v16, 0x3e75c28f    # 0.24f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x40e570a4    # 7.17f

    .line 141
    .line 142
    .line 143
    const/high16 v2, 0x40a00000    # 5.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40800000    # 4.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, -0x40000000    # -2.0f

    .line 154
    .line 155
    const/high16 v18, 0x40000000    # 2.0f

    .line 156
    .line 157
    const v13, -0x40733333    # -1.1f

    .line 158
    .line 159
    .line 160
    const/high16 v15, -0x40000000    # -2.0f

    .line 161
    .line 162
    const v16, 0x3f666666    # 0.9f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41400000    # 12.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x40000000    # 2.0f

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const v14, 0x3f8ccccd    # 1.1f

    .line 177
    .line 178
    .line 179
    const v15, 0x3f666666    # 0.9f

    .line 180
    .line 181
    .line 182
    const/high16 v16, 0x40000000    # 2.0f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x40e00000    # 7.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, -0x3ffa3d71    # -2.09f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3f63851f    # -4.89f

    .line 199
    .line 200
    .line 201
    const/high16 v18, -0x3f680000    # -4.75f

    .line 202
    .line 203
    const v13, -0x3fe33333    # -2.45f

    .line 204
    .line 205
    .line 206
    const v14, -0x4128f5c3    # -0.42f

    .line 207
    .line 208
    .line 209
    const v15, -0x3f72e148    # -4.41f

    .line 210
    .line 211
    .line 212
    const v16, -0x3feb851f    # -2.32f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3f7d70a4    # 0.99f

    .line 219
    .line 220
    .line 221
    const v18, -0x406b851f    # -1.16f

    .line 222
    .line 223
    .line 224
    const v13, -0x420a3d71    # -0.12f

    .line 225
    .line 226
    .line 227
    const v14, -0x40e3d70a    # -0.61f

    .line 228
    .line 229
    .line 230
    const v15, 0x3ec28f5c    # 0.38f

    .line 231
    .line 232
    .line 233
    const v16, -0x406b851f    # -1.16f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x3f7ae148    # 0.98f

    .line 240
    .line 241
    .line 242
    const v18, 0x3f547ae1    # 0.83f

    .line 243
    .line 244
    .line 245
    const v13, 0x3efae148    # 0.49f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, 0x3f6147ae    # 0.88f

    .line 250
    .line 251
    .line 252
    const v16, 0x3eb33333    # 0.35f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x41400000    # 12.0f

    .line 259
    .line 260
    const/high16 v18, 0x41880000    # 17.0f

    .line 261
    .line 262
    const v13, 0x4107851f    # 8.47f

    .line 263
    .line 264
    .line 265
    const v14, 0x417a3d71    # 15.64f

    .line 266
    .line 267
    .line 268
    const v15, 0x41211eb8    # 10.07f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x41880000    # 17.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, -0x4051eb85    # -1.36f

    .line 277
    .line 278
    .line 279
    const v2, 0x407a3d71    # 3.91f

    .line 280
    .line 281
    .line 282
    const v4, -0x3fb51eb8    # -3.17f

    .line 283
    .line 284
    .line 285
    const v6, 0x4061eb85    # 3.53f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, 0x3f7ae148    # 0.98f

    .line 292
    .line 293
    .line 294
    const v18, -0x40ab851f    # -0.83f

    .line 295
    .line 296
    .line 297
    const v13, 0x3dcccccd    # 0.1f

    .line 298
    .line 299
    .line 300
    const v14, -0x410a3d71    # -0.48f

    .line 301
    .line 302
    .line 303
    const/high16 v15, 0x3f000000    # 0.5f

    .line 304
    .line 305
    const v16, -0x40ab851f    # -0.83f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3f7d70a4    # 0.99f

    .line 312
    .line 313
    .line 314
    const v18, 0x3f947ae1    # 1.16f

    .line 315
    .line 316
    .line 317
    const v13, 0x3f1c28f6    # 0.61f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const v15, 0x3f8e147b    # 1.11f

    .line 322
    .line 323
    .line 324
    const v16, 0x3f0ccccd    # 0.55f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, -0x3f63851f    # -4.89f

    .line 331
    .line 332
    .line 333
    const/high16 v18, 0x40980000    # 4.75f

    .line 334
    .line 335
    const v13, -0x410a3d71    # -0.48f

    .line 336
    .line 337
    .line 338
    const v14, 0x401b851f    # 2.43f

    .line 339
    .line 340
    .line 341
    const v15, -0x3fe3d70a    # -2.44f

    .line 342
    .line 343
    .line 344
    const v16, 0x408ae148    # 4.34f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x414fd70a    # 12.99f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x41a80000    # 21.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40e00000    # 7.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x40000000    # 2.0f

    .line 364
    .line 365
    const/high16 v18, -0x40000000    # -2.0f

    .line 366
    .line 367
    const v13, 0x3f8ccccd    # 1.1f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/high16 v15, 0x40000000    # 2.0f

    .line 372
    .line 373
    const v16, -0x4099999a    # -0.9f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x41afeb85    # 21.99f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x40e00000    # 7.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x41a00000    # 20.0f

    .line 388
    .line 389
    const/high16 v18, 0x40a00000    # 5.0f

    .line 390
    .line 391
    const/high16 v13, 0x41b00000    # 22.0f

    .line 392
    .line 393
    const v14, 0x40bccccd    # 5.9f

    .line 394
    .line 395
    .line 396
    const v15, 0x41a8cccd    # 21.1f

    .line 397
    .line 398
    .line 399
    const/high16 v16, 0x40a00000    # 5.0f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41600000    # 14.0f

    .line 408
    .line 409
    const/high16 v2, 0x41500000    # 13.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, -0x40000000    # -2.0f

    .line 415
    .line 416
    const/high16 v18, 0x40000000    # 2.0f

    .line 417
    .line 418
    const/4 v13, 0x0

    .line 419
    const v14, 0x3f8ccccd    # 1.1f

    .line 420
    .line 421
    .line 422
    const v15, -0x4099999a    # -0.9f

    .line 423
    .line 424
    .line 425
    const/high16 v16, 0x40000000    # 2.0f

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, -0x4099999a    # -0.9f

    .line 431
    .line 432
    .line 433
    const/high16 v2, -0x40000000    # -2.0f

    .line 434
    .line 435
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41200000    # 10.0f

    .line 439
    .line 440
    const/high16 v2, 0x41100000    # 9.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x40000000    # 2.0f

    .line 446
    .line 447
    const/high16 v18, -0x40000000    # -2.0f

    .line 448
    .line 449
    const v14, -0x40733333    # -1.1f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f666666    # 0.9f

    .line 453
    .line 454
    .line 455
    const/high16 v16, -0x40000000    # -2.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f666666    # 0.9f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x40000000    # 2.0f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/16 v16, 0x3800

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v8, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/high16 v9, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v14, 0x0

    .line 494
    const/4 v15, 0x0

    .line 495
    const-string v4, ""

    .line 496
    .line 497
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    sput-object v0, Landroidx/compose/material/icons/rounded/PermCameraMicKt;->_permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 506
    .line 507
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    return-object v0
.end method
