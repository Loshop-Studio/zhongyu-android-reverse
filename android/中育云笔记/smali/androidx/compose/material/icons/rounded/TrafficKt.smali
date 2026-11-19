.class public final Landroidx/compose/material/icons/rounded/TrafficKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _traffic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTraffic(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TrafficKt;->_traffic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Traffic"

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
    const v0, 0x419fae14    # 19.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x412970a4    # 10.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v18, -0x40e8f5c3    # -0.59f

    .line 82
    .line 83
    .line 84
    const v13, 0x3d23d70a    # 0.04f

    .line 85
    .line 86
    .line 87
    const v14, -0x416147ae    # -0.31f

    .line 88
    .line 89
    .line 90
    const v15, -0x41bd70a4    # -0.19f

    .line 91
    .line 92
    .line 93
    const v16, -0x40e8f5c3    # -0.59f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41200000    # 10.0f

    .line 100
    .line 101
    const/high16 v2, 0x41880000    # 17.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x410dc28f    # 8.86f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x403d70a4    # 2.96f

    .line 113
    .line 114
    .line 115
    const v18, -0x3faeb852    # -3.27f

    .line 116
    .line 117
    .line 118
    const v13, 0x3fc51eb8    # 1.54f

    .line 119
    .line 120
    .line 121
    const v14, -0x41333333    # -0.4f

    .line 122
    .line 123
    .line 124
    const v15, 0x402e147b    # 2.72f

    .line 125
    .line 126
    .line 127
    const v16, -0x4028f5c3    # -1.68f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, -0x41000000    # -0.5f

    .line 134
    .line 135
    const v18, -0x40e8f5c3    # -0.59f

    .line 136
    .line 137
    .line 138
    const v13, 0x3d23d70a    # 0.04f

    .line 139
    .line 140
    .line 141
    const v14, -0x416147ae    # -0.31f

    .line 142
    .line 143
    .line 144
    const v15, -0x41bd70a4    # -0.19f

    .line 145
    .line 146
    .line 147
    const v16, -0x40e8f5c3    # -0.59f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40a00000    # 5.0f

    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40800000    # 4.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, -0x40800000    # -1.0f

    .line 164
    .line 165
    const/high16 v18, -0x40800000    # -1.0f

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const v14, -0x40f33333    # -0.55f

    .line 169
    .line 170
    .line 171
    const v15, -0x4119999a    # -0.45f

    .line 172
    .line 173
    .line 174
    const/high16 v16, -0x40800000    # -1.0f

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x40400000    # 3.0f

    .line 180
    .line 181
    const/high16 v2, 0x41000000    # 8.0f

    .line 182
    .line 183
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v18, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const v13, -0x40f33333    # -0.55f

    .line 189
    .line 190
    .line 191
    const/4 v14, 0x0

    .line 192
    const/high16 v15, -0x40800000    # -1.0f

    .line 193
    .line 194
    const v16, 0x3ee66666    # 0.45f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40a00000    # 5.0f

    .line 206
    .line 207
    const v2, 0x409147ae    # 4.54f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, -0x41000000    # -0.5f

    .line 214
    .line 215
    const v18, 0x3f170a3d    # 0.59f

    .line 216
    .line 217
    .line 218
    const v13, -0x416147ae    # -0.31f

    .line 219
    .line 220
    .line 221
    const v15, -0x40f5c28f    # -0.54f

    .line 222
    .line 223
    .line 224
    const v16, 0x3e8f5c29    # 0.28f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40e00000    # 7.0f

    .line 231
    .line 232
    const v18, 0x410dc28f    # 8.86f

    .line 233
    .line 234
    .line 235
    const v13, 0x4088f5c3    # 4.28f

    .line 236
    .line 237
    .line 238
    const v14, 0x40e5c28f    # 7.18f

    .line 239
    .line 240
    .line 241
    const v15, 0x40aeb852    # 5.46f

    .line 242
    .line 243
    .line 244
    const v16, 0x41075c29    # 8.46f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x40e00000    # 7.0f

    .line 251
    .line 252
    const/high16 v2, 0x41200000    # 10.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x409147ae    # 4.54f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, -0x41000000    # -0.5f

    .line 264
    .line 265
    const v18, 0x3f170a3d    # 0.59f

    .line 266
    .line 267
    .line 268
    const v13, -0x416147ae    # -0.31f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const v15, -0x40f5c28f    # -0.54f

    .line 273
    .line 274
    .line 275
    const v16, 0x3e8f5c29    # 0.28f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x403d70a4    # 2.96f

    .line 282
    .line 283
    .line 284
    const v18, 0x405147ae    # 3.27f

    .line 285
    .line 286
    .line 287
    const v13, 0x3e75c28f    # 0.24f

    .line 288
    .line 289
    .line 290
    const v14, 0x3fcb851f    # 1.59f

    .line 291
    .line 292
    .line 293
    const v15, 0x3fb5c28f    # 1.42f

    .line 294
    .line 295
    .line 296
    const v16, 0x4037ae14    # 2.87f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41700000    # 15.0f

    .line 303
    .line 304
    const/high16 v2, 0x40e00000    # 7.0f

    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v2, 0x409147ae    # 4.54f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x41000000    # -0.5f

    .line 316
    .line 317
    const v18, 0x3f170a3d    # 0.59f

    .line 318
    .line 319
    .line 320
    const v13, -0x416147ae    # -0.31f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const v15, -0x40f5c28f    # -0.54f

    .line 325
    .line 326
    .line 327
    const v16, 0x3e8f5c29    # 0.28f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x403d70a4    # 2.96f

    .line 334
    .line 335
    .line 336
    const v18, 0x405147ae    # 3.27f

    .line 337
    .line 338
    .line 339
    const v13, 0x3e75c28f    # 0.24f

    .line 340
    .line 341
    .line 342
    const v14, 0x3fcb851f    # 1.59f

    .line 343
    .line 344
    .line 345
    const v15, 0x3fb5c28f    # 1.42f

    .line 346
    .line 347
    .line 348
    const v16, 0x4037ae14    # 2.87f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41a00000    # 20.0f

    .line 355
    .line 356
    const/high16 v2, 0x40e00000    # 7.0f

    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v18, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, 0x3f0ccccd    # 0.55f

    .line 367
    .line 368
    .line 369
    const v15, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41000000    # 8.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v18, -0x40800000    # -1.0f

    .line 383
    .line 384
    const v13, 0x3f0ccccd    # 0.55f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const/high16 v15, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const v16, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x406e147b    # -1.14f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x403d70a4    # 2.96f

    .line 403
    .line 404
    .line 405
    const v18, -0x3faeb852    # -3.27f

    .line 406
    .line 407
    .line 408
    const v13, 0x3fc51eb8    # 1.54f

    .line 409
    .line 410
    .line 411
    const v14, -0x41333333    # -0.4f

    .line 412
    .line 413
    .line 414
    const v15, 0x402e147b    # 2.72f

    .line 415
    .line 416
    .line 417
    const v16, -0x4028f5c3    # -1.68f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, -0x41000000    # -0.5f

    .line 424
    .line 425
    const v18, -0x40e8f5c3    # -0.59f

    .line 426
    .line 427
    .line 428
    const v13, 0x3d23d70a    # 0.04f

    .line 429
    .line 430
    .line 431
    const v14, -0x416147ae    # -0.31f

    .line 432
    .line 433
    .line 434
    const v15, -0x41bd70a4    # -0.19f

    .line 435
    .line 436
    .line 437
    const v16, -0x40e8f5c3    # -0.59f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x41700000    # 15.0f

    .line 444
    .line 445
    const/high16 v2, 0x41880000    # 17.0f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x406e147b    # -1.14f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x403d70a4    # 2.96f

    .line 457
    .line 458
    .line 459
    const v18, -0x3faeb852    # -3.27f

    .line 460
    .line 461
    .line 462
    const v13, 0x3fc51eb8    # 1.54f

    .line 463
    .line 464
    .line 465
    const v14, -0x41333333    # -0.4f

    .line 466
    .line 467
    .line 468
    const v15, 0x402e147b    # 2.72f

    .line 469
    .line 470
    .line 471
    const v16, -0x4028f5c3    # -1.68f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41980000    # 19.0f

    .line 481
    .line 482
    const/high16 v2, 0x41400000    # 12.0f

    .line 483
    .line 484
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, -0x40000000    # -2.0f

    .line 488
    .line 489
    const/high16 v18, -0x40000000    # -2.0f

    .line 490
    .line 491
    const v13, -0x4071eb85    # -1.11f

    .line 492
    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const/high16 v15, -0x40000000    # -2.0f

    .line 496
    .line 497
    const v16, -0x4099999a    # -0.9f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x3f63d70a    # 0.89f

    .line 504
    .line 505
    .line 506
    const/high16 v2, 0x40000000    # 2.0f

    .line 507
    .line 508
    const/high16 v4, -0x40000000    # -2.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x40000000    # 2.0f

    .line 514
    .line 515
    const/high16 v18, 0x40000000    # 2.0f

    .line 516
    .line 517
    const v13, 0x3f8ccccd    # 1.1f

    .line 518
    .line 519
    .line 520
    const/high16 v15, 0x40000000    # 2.0f

    .line 521
    .line 522
    const v16, 0x3f666666    # 0.9f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, -0x409c28f6    # -0.89f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x41600000    # 14.0f

    .line 538
    .line 539
    const/high16 v2, 0x41400000    # 12.0f

    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, -0x40000000    # -2.0f

    .line 545
    .line 546
    const/high16 v18, -0x40000000    # -2.0f

    .line 547
    .line 548
    const v13, -0x4071eb85    # -1.11f

    .line 549
    .line 550
    .line 551
    const/high16 v15, -0x40000000    # -2.0f

    .line 552
    .line 553
    const v16, -0x4099999a    # -0.9f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3f63d70a    # 0.89f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x40000000    # 2.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x40000000    # 2.0f

    .line 568
    .line 569
    const/high16 v18, 0x40000000    # 2.0f

    .line 570
    .line 571
    const v13, 0x3f8ccccd    # 1.1f

    .line 572
    .line 573
    .line 574
    const/high16 v15, 0x40000000    # 2.0f

    .line 575
    .line 576
    const v16, 0x3f666666    # 0.9f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x409c28f6    # -0.89f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x41100000    # 9.0f

    .line 592
    .line 593
    const/high16 v2, 0x41400000    # 12.0f

    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, -0x40000000    # -2.0f

    .line 599
    .line 600
    const/high16 v18, -0x40000000    # -2.0f

    .line 601
    .line 602
    const v13, -0x4071eb85    # -1.11f

    .line 603
    .line 604
    .line 605
    const/high16 v15, -0x40000000    # -2.0f

    .line 606
    .line 607
    const v16, -0x4099999a    # -0.9f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v17, 0x40000000    # 2.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const v14, -0x4071eb85    # -1.11f

    .line 617
    .line 618
    .line 619
    const v15, 0x3f63d70a    # 0.89f

    .line 620
    .line 621
    .line 622
    const/high16 v16, -0x40000000    # -2.0f

    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v18, 0x40000000    # 2.0f

    .line 628
    .line 629
    const v13, 0x3f8ccccd    # 1.1f

    .line 630
    .line 631
    .line 632
    const/4 v14, 0x0

    .line 633
    const/high16 v15, 0x40000000    # 2.0f

    .line 634
    .line 635
    const v16, 0x3f63d70a    # 0.89f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, -0x40000000    # -2.0f

    .line 642
    .line 643
    const/4 v13, 0x0

    .line 644
    const v14, 0x3f8ccccd    # 1.1f

    .line 645
    .line 646
    .line 647
    const v15, -0x409c28f6    # -0.89f

    .line 648
    .line 649
    .line 650
    const/high16 v16, 0x40000000    # 2.0f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    const/16 v16, 0x3800

    .line 663
    .line 664
    const/16 v17, 0x0

    .line 665
    .line 666
    const/high16 v6, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/high16 v8, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/4 v7, 0x0

    .line 671
    const/high16 v9, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/high16 v12, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/4 v14, 0x0

    .line 676
    const/4 v15, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sput-object v0, Landroidx/compose/material/icons/rounded/TrafficKt;->_traffic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method
