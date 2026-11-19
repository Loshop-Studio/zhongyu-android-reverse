.class public final Landroidx/compose/material/icons/sharp/GroupsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _groups:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroups(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Groups"

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
    const/high16 v0, 0x414c0000    # 12.75f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x4087ae14    # 4.24f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f666666    # 0.9f

    .line 81
    .line 82
    .line 83
    const v13, 0x3fd0a3d7    # 1.63f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x40447ae1    # 3.07f

    .line 88
    .line 89
    .line 90
    const v16, 0x3ec7ae14    # 0.39f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3fe147ae    # 1.76f

    .line 97
    .line 98
    .line 99
    const v18, 0x402eb852    # 2.73f

    .line 100
    .line 101
    .line 102
    const v13, 0x3f8a3d71    # 1.08f

    .line 103
    .line 104
    .line 105
    const v14, 0x3ef5c28f    # 0.48f

    .line 106
    .line 107
    .line 108
    const v15, 0x3fe147ae    # 1.76f

    .line 109
    .line 110
    .line 111
    const v16, 0x3fc7ae14    # 1.56f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41900000    # 18.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40c00000    # 6.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, -0x4031eb85    # -1.61f

    .line 128
    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v18, -0x3fd147ae    # -2.73f

    .line 135
    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, -0x4068f5c3    # -1.18f

    .line 139
    .line 140
    .line 141
    const v15, 0x3f2e147b    # 0.68f

    .line 142
    .line 143
    .line 144
    const v16, -0x3fef5c29    # -2.26f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41400000    # 12.0f

    .line 151
    .line 152
    const/high16 v18, 0x414c0000    # 12.75f

    .line 153
    .line 154
    const v13, 0x410ee148    # 8.93f

    .line 155
    .line 156
    .line 157
    const v14, 0x41523d71    # 13.14f

    .line 158
    .line 159
    .line 160
    const v15, 0x4125eb85    # 10.37f

    .line 161
    .line 162
    .line 163
    const/high16 v16, 0x414c0000    # 12.75f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40800000    # 4.0f

    .line 172
    .line 173
    const/high16 v2, 0x41500000    # 13.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, 0x40000000    # 2.0f

    .line 179
    .line 180
    const/high16 v18, -0x40000000    # -2.0f

    .line 181
    .line 182
    const v13, 0x3f8ccccd    # 1.1f

    .line 183
    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const/high16 v15, 0x40000000    # 2.0f

    .line 187
    .line 188
    const v16, -0x4099999a    # -0.9f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, -0x40000000    # -2.0f

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const v14, -0x40733333    # -1.1f

    .line 198
    .line 199
    .line 200
    const v15, -0x4099999a    # -0.9f

    .line 201
    .line 202
    .line 203
    const/high16 v16, -0x40000000    # -2.0f

    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40000000    # 2.0f

    .line 209
    .line 210
    const v2, 0x3f666666    # 0.9f

    .line 211
    .line 212
    .line 213
    const/high16 v4, -0x40000000    # -2.0f

    .line 214
    .line 215
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x40800000    # 4.0f

    .line 219
    .line 220
    const/high16 v18, 0x41500000    # 13.0f

    .line 221
    .line 222
    const/high16 v13, 0x40000000    # 2.0f

    .line 223
    .line 224
    const v14, 0x4141999a    # 12.1f

    .line 225
    .line 226
    .line 227
    const v15, 0x4039999a    # 2.9f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x41500000    # 13.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x40a428f6    # 5.13f

    .line 239
    .line 240
    .line 241
    const v2, 0x4161999a    # 14.1f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v18, 0x41600000    # 14.0f

    .line 248
    .line 249
    const v13, 0x409851ec    # 4.76f

    .line 250
    .line 251
    .line 252
    const v14, 0x4160a3d7    # 14.04f

    .line 253
    .line 254
    .line 255
    const v15, 0x408c7ae1    # 4.39f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x41600000    # 14.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x3fce147b    # -2.78f

    .line 264
    .line 265
    .line 266
    const v18, 0x3f147ae1    # 0.58f

    .line 267
    .line 268
    .line 269
    const v13, -0x40828f5c    # -0.99f

    .line 270
    .line 271
    .line 272
    const/4 v14, 0x0

    .line 273
    const v15, -0x4008f5c3    # -1.93f

    .line 274
    .line 275
    .line 276
    const v16, 0x3e570a3d    # 0.21f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const v18, 0x418370a4    # 16.43f

    .line 285
    .line 286
    .line 287
    const v13, 0x3ef5c28f    # 0.48f

    .line 288
    .line 289
    .line 290
    const v14, 0x416e6666    # 14.9f

    .line 291
    .line 292
    .line 293
    const/4 v15, 0x0

    .line 294
    const v16, 0x4179eb85    # 15.62f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41900000    # 18.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x40900000    # 4.5f

    .line 306
    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, -0x4031eb85    # -1.61f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x40a428f6    # 5.13f

    .line 318
    .line 319
    .line 320
    const v18, 0x4161999a    # 14.1f

    .line 321
    .line 322
    .line 323
    const/high16 v13, 0x40900000    # 4.5f

    .line 324
    .line 325
    const v14, 0x4178f5c3    # 15.56f

    .line 326
    .line 327
    .line 328
    const v15, 0x40975c29    # 4.73f

    .line 329
    .line 330
    .line 331
    const v16, 0x416c7ae1    # 14.78f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41a00000    # 20.0f

    .line 341
    .line 342
    const/high16 v2, 0x41500000    # 13.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x40000000    # 2.0f

    .line 348
    .line 349
    const/high16 v18, -0x40000000    # -2.0f

    .line 350
    .line 351
    const v13, 0x3f8ccccd    # 1.1f

    .line 352
    .line 353
    .line 354
    const/4 v14, 0x0

    .line 355
    const/high16 v15, 0x40000000    # 2.0f

    .line 356
    .line 357
    const v16, -0x4099999a    # -0.9f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x40000000    # -2.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x40733333    # -1.1f

    .line 367
    .line 368
    .line 369
    const v15, -0x4099999a    # -0.9f

    .line 370
    .line 371
    .line 372
    const/high16 v16, -0x40000000    # -2.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v2, 0x3f666666    # 0.9f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x41a00000    # 20.0f

    .line 386
    .line 387
    const/high16 v18, 0x41500000    # 13.0f

    .line 388
    .line 389
    const/high16 v13, 0x41900000    # 18.0f

    .line 390
    .line 391
    const v14, 0x4141999a    # 12.1f

    .line 392
    .line 393
    .line 394
    const v15, 0x41973333    # 18.9f

    .line 395
    .line 396
    .line 397
    const/high16 v16, 0x41500000    # 13.0f

    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x418370a4    # 16.43f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x41c00000    # 24.0f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x4063d70a    # -1.22f

    .line 414
    .line 415
    .line 416
    const v18, -0x40133333    # -1.85f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, -0x40b0a3d7    # -0.81f

    .line 421
    .line 422
    .line 423
    const v15, -0x410a3d71    # -0.48f

    .line 424
    .line 425
    .line 426
    const v16, -0x403c28f6    # -1.53f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41a00000    # 20.0f

    .line 433
    .line 434
    const/high16 v18, 0x41600000    # 14.0f

    .line 435
    .line 436
    const v13, 0x41af70a4    # 21.93f

    .line 437
    .line 438
    .line 439
    const v14, 0x41635c29    # 14.21f

    .line 440
    .line 441
    .line 442
    const v15, 0x41a7eb85    # 20.99f

    .line 443
    .line 444
    .line 445
    const/high16 v16, 0x41600000    # 14.0f

    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x406f5c29    # -1.13f

    .line 451
    .line 452
    .line 453
    const v18, 0x3dcccccd    # 0.1f

    .line 454
    .line 455
    .line 456
    const v13, -0x413851ec    # -0.39f

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    const v15, -0x40bd70a4    # -0.76f

    .line 461
    .line 462
    .line 463
    const v16, 0x3d23d70a    # 0.04f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x3f2147ae    # 0.63f

    .line 470
    .line 471
    .line 472
    const v18, 0x40128f5c    # 2.29f

    .line 473
    .line 474
    .line 475
    const v13, 0x3ecccccd    # 0.4f

    .line 476
    .line 477
    .line 478
    const v14, 0x3f2e147b    # 0.68f

    .line 479
    .line 480
    .line 481
    const v15, 0x3f2147ae    # 0.63f

    .line 482
    .line 483
    .line 484
    const v16, 0x3fbae148    # 1.46f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41900000    # 18.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40900000    # 4.5f

    .line 496
    .line 497
    const/4 v2, 0x0

    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x418370a4    # 16.43f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40c00000    # 6.0f

    .line 511
    .line 512
    const/high16 v2, 0x41400000    # 12.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x40400000    # 3.0f

    .line 518
    .line 519
    const/high16 v18, 0x40400000    # 3.0f

    .line 520
    .line 521
    const v13, 0x3fd47ae1    # 1.66f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, 0x40400000    # 3.0f

    .line 526
    .line 527
    const v16, 0x3fab851f    # 1.34f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, 0x3fd47ae1    # 1.66f

    .line 537
    .line 538
    .line 539
    const v15, -0x40547ae1    # -1.34f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x40400000    # 3.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x40547ae1    # -1.34f

    .line 548
    .line 549
    .line 550
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 551
    .line 552
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x41400000    # 12.0f

    .line 556
    .line 557
    const/high16 v18, 0x40c00000    # 6.0f

    .line 558
    .line 559
    const/high16 v13, 0x41100000    # 9.0f

    .line 560
    .line 561
    const v14, 0x40eae148    # 7.34f

    .line 562
    .line 563
    .line 564
    const v15, 0x412570a4    # 10.34f

    .line 565
    .line 566
    .line 567
    const/high16 v16, 0x40c00000    # 6.0f

    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/16 v16, 0x3800

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/high16 v8, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/high16 v9, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v12, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const/4 v14, 0x0

    .line 594
    const/4 v15, 0x0

    .line 595
    const-string v4, ""

    .line 596
    .line 597
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    sput-object v0, Landroidx/compose/material/icons/sharp/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    return-object v0
.end method
