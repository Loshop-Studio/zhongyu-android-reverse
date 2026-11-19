.class public final Landroidx/compose/material/icons/rounded/EvStationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _evStation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEvStation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EvStationKt;->_evStation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EvStation"

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
    const v0, 0x419e28f6    # 19.77f

    .line 71
    .line 72
    .line 73
    const v2, 0x40e75c29    # 7.23f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3c23d70a    # 0.01f

    .line 80
    .line 81
    .line 82
    const v2, -0x43dc28f6    # -0.01f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, -0x3fb3d70a    # -3.19f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, -0x407851ec    # -1.06f

    .line 95
    .line 96
    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    const v13, -0x416b851f    # -0.29f

    .line 100
    .line 101
    .line 102
    const v14, -0x416b851f    # -0.29f

    .line 103
    .line 104
    .line 105
    const v15, -0x40bae148    # -0.77f

    .line 106
    .line 107
    .line 108
    const v16, -0x416b851f    # -0.29f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const v18, 0x3f87ae14    # 1.06f

    .line 117
    .line 118
    .line 119
    const v14, 0x3e947ae1    # 0.29f

    .line 120
    .line 121
    .line 122
    const v15, -0x416b851f    # -0.29f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f451eb8    # 0.77f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x3fca3d71    # 1.58f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x4035c28f    # -1.58f

    .line 138
    .line 139
    .line 140
    const v18, 0x402d70a4    # 2.71f

    .line 141
    .line 142
    .line 143
    const v13, -0x4079999a    # -1.05f

    .line 144
    .line 145
    .line 146
    const v14, 0x3ecccccd    # 0.4f

    .line 147
    .line 148
    .line 149
    const v15, -0x401eb852    # -1.76f

    .line 150
    .line 151
    .line 152
    const v16, 0x3fbc28f6    # 1.47f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x400ccccd    # 2.2f

    .line 159
    .line 160
    .line 161
    const v18, 0x40070a3d    # 2.11f

    .line 162
    .line 163
    .line 164
    const v13, 0x3e23d70a    # 0.16f

    .line 165
    .line 166
    .line 167
    const v14, 0x3f8ccccd    # 1.1f

    .line 168
    .line 169
    .line 170
    const v15, 0x3f8ccccd    # 1.1f

    .line 171
    .line 172
    .line 173
    const v16, 0x3ffeb852    # 1.99f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x3fa28f5c    # 1.27f

    .line 180
    .line 181
    .line 182
    const v18, -0x41b33333    # -0.2f

    .line 183
    .line 184
    .line 185
    const v13, 0x3ef0a3d7    # 0.47f

    .line 186
    .line 187
    .line 188
    const v14, 0x3d4ccccd    # 0.05f

    .line 189
    .line 190
    .line 191
    const v15, 0x3f6147ae    # 0.88f

    .line 192
    .line 193
    .line 194
    const v16, -0x430a3d71    # -0.03f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x40e6b852    # 7.21f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, -0x40800000    # -1.0f

    .line 207
    .line 208
    const/high16 v18, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, 0x3f0ccccd    # 0.55f

    .line 212
    .line 213
    .line 214
    const v15, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x3f800000    # 1.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x4119999a    # -0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v2, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41600000    # 14.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, -0x40000000    # -2.0f

    .line 236
    .line 237
    const/high16 v18, -0x40000000    # -2.0f

    .line 238
    .line 239
    const v14, -0x40733333    # -1.1f

    .line 240
    .line 241
    .line 242
    const v15, -0x4099999a    # -0.9f

    .line 243
    .line 244
    .line 245
    const/high16 v16, -0x40000000    # -2.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, -0x40800000    # -1.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x40a00000    # 5.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40c00000    # 6.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v18, 0x40000000    # 2.0f

    .line 269
    .line 270
    const v13, -0x40733333    # -1.1f

    .line 271
    .line 272
    .line 273
    const/4 v14, 0x0

    .line 274
    const/high16 v15, -0x40000000    # -2.0f

    .line 275
    .line 276
    const v16, 0x3f666666    # 0.9f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41700000    # 15.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/high16 v18, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    const v14, 0x3f0ccccd    # 0.55f

    .line 293
    .line 294
    .line 295
    const v15, 0x3ee66666    # 0.45f

    .line 296
    .line 297
    .line 298
    const/high16 v16, 0x3f800000    # 1.0f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41000000    # 8.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v18, -0x40800000    # -1.0f

    .line 309
    .line 310
    const v13, 0x3f0ccccd    # 0.55f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const/high16 v15, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const v16, -0x4119999a    # -0.45f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, -0x3f300000    # -6.5f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x409b851f    # 4.86f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x400f5c29    # 2.24f

    .line 339
    .line 340
    .line 341
    const v18, 0x402851ec    # 2.63f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, 0x3fa7ae14    # 1.31f

    .line 346
    .line 347
    .line 348
    const v15, 0x3f70a3d7    # 0.94f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x40200000    # 2.5f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x4030a3d7    # 2.76f

    .line 357
    .line 358
    .line 359
    const v18, -0x3fe0a3d7    # -2.49f

    .line 360
    .line 361
    .line 362
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 363
    .line 364
    const v14, 0x3e19999a    # 0.15f

    .line 365
    .line 366
    .line 367
    const v15, 0x4030a3d7    # 2.76f

    .line 368
    .line 369
    .line 370
    const v16, -0x407d70a4    # -1.02f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41100000    # 9.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x40c51eb8    # -0.73f

    .line 382
    .line 383
    .line 384
    const v18, -0x401d70a4    # -1.77f

    .line 385
    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    const v14, -0x40cf5c29    # -0.69f

    .line 389
    .line 390
    .line 391
    const v15, -0x4170a3d7    # -0.28f

    .line 392
    .line 393
    .line 394
    const v16, -0x40570a3d    # -1.32f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41900000    # 18.0f

    .line 404
    .line 405
    const/high16 v2, 0x41200000    # 10.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, -0x40800000    # -1.0f

    .line 411
    .line 412
    const/high16 v18, -0x40800000    # -1.0f

    .line 413
    .line 414
    const v13, -0x40f33333    # -0.55f

    .line 415
    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const/high16 v15, -0x40800000    # -1.0f

    .line 419
    .line 420
    const v16, -0x4119999a    # -0.45f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    const/high16 v2, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/high16 v4, -0x40800000    # -1.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, -0x4119999a    # -0.45f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x4180f5c3    # 16.12f

    .line 449
    .line 450
    .line 451
    const/high16 v2, 0x41000000    # 8.0f

    .line 452
    .line 453
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41580000    # 13.5f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x40da8f5c    # 6.83f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, -0x411eb852    # -0.44f

    .line 468
    .line 469
    .line 470
    const v18, -0x40c28f5c    # -0.74f

    .line 471
    .line 472
    .line 473
    const v13, -0x413d70a4    # -0.38f

    .line 474
    .line 475
    .line 476
    const v15, -0x40e147ae    # -0.62f

    .line 477
    .line 478
    .line 479
    const v16, -0x41333333    # -0.4f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x402ae148    # 2.67f

    .line 486
    .line 487
    .line 488
    const/high16 v2, -0x3f600000    # -5.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x3f70a3d7    # 0.94f

    .line 494
    .line 495
    .line 496
    const v18, 0x3e75c28f    # 0.24f

    .line 497
    .line 498
    .line 499
    const v13, 0x3e75c28f    # 0.24f

    .line 500
    .line 501
    .line 502
    const v14, -0x4119999a    # -0.45f

    .line 503
    .line 504
    .line 505
    const v15, 0x3f70a3d7    # 0.94f

    .line 506
    .line 507
    .line 508
    const v16, -0x4170a3d7    # -0.28f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40400000    # 3.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x3f91eb85    # 1.14f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3edc28f6    # 0.43f

    .line 526
    .line 527
    .line 528
    const/high16 v18, 0x3f400000    # 0.75f

    .line 529
    .line 530
    const v13, 0x3ec28f5c    # 0.38f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const v15, 0x3f1eb852    # 0.62f

    .line 535
    .line 536
    .line 537
    const v16, 0x3ed1eb85    # 0.41f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, -0x3fd70a3d    # -2.64f

    .line 544
    .line 545
    .line 546
    const v2, 0x4093d70a    # 4.62f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x4091eb85    # -0.93f

    .line 553
    .line 554
    .line 555
    const/high16 v18, -0x41800000    # -0.25f

    .line 556
    .line 557
    const/high16 v13, -0x41800000    # -0.25f

    .line 558
    .line 559
    const v14, 0x3ee147ae    # 0.44f

    .line 560
    .line 561
    .line 562
    const v15, -0x4091eb85    # -0.93f

    .line 563
    .line 564
    .line 565
    const v16, 0x3e851eb8    # 0.26f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/16 v16, 0x3800

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v8, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v7, 0x0

    .line 587
    const/high16 v9, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v12, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v14, 0x0

    .line 593
    const/4 v15, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    sput-object v0, Landroidx/compose/material/icons/rounded/EvStationKt;->_evStation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    return-object v0
.end method
