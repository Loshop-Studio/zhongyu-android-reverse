.class public final Landroidx/compose/material/icons/rounded/LocalGasStationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localGasStation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalGasStation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalGasStationKt;->_localGasStation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalGasStation"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 231
    .line 232
    const/high16 v2, 0x41600000    # 14.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, -0x40000000    # -2.0f

    .line 238
    .line 239
    const/high16 v18, -0x40000000    # -2.0f

    .line 240
    .line 241
    const v14, -0x40733333    # -1.1f

    .line 242
    .line 243
    .line 244
    const v15, -0x4099999a    # -0.9f

    .line 245
    .line 246
    .line 247
    const/high16 v16, -0x40000000    # -2.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, -0x40800000    # -1.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40a00000    # 5.0f

    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40400000    # 3.0f

    .line 266
    .line 267
    const/high16 v2, 0x40c00000    # 6.0f

    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v18, 0x40000000    # 2.0f

    .line 273
    .line 274
    const v13, -0x40733333    # -1.1f

    .line 275
    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    const/high16 v15, -0x40000000    # -2.0f

    .line 279
    .line 280
    const v16, 0x3f666666    # 0.9f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x41700000    # 15.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v18, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, 0x3f0ccccd    # 0.55f

    .line 297
    .line 298
    .line 299
    const v15, 0x3ee66666    # 0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v16, 0x3f800000    # 1.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x41000000    # 8.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v18, -0x40800000    # -1.0f

    .line 313
    .line 314
    const v13, 0x3f0ccccd    # 0.55f

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const/high16 v15, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v16, -0x4119999a    # -0.45f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, -0x3f300000    # -6.5f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x409b851f    # 4.86f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x400f5c29    # 2.24f

    .line 343
    .line 344
    .line 345
    const v18, 0x402851ec    # 2.63f

    .line 346
    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const v14, 0x3fa7ae14    # 1.31f

    .line 350
    .line 351
    .line 352
    const v15, 0x3f70a3d7    # 0.94f

    .line 353
    .line 354
    .line 355
    const/high16 v16, 0x40200000    # 2.5f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x4030a3d7    # 2.76f

    .line 361
    .line 362
    .line 363
    const v18, -0x3fe0a3d7    # -2.49f

    .line 364
    .line 365
    .line 366
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 367
    .line 368
    const v14, 0x3e19999a    # 0.15f

    .line 369
    .line 370
    .line 371
    const v15, 0x4030a3d7    # 2.76f

    .line 372
    .line 373
    .line 374
    const v16, -0x407d70a4    # -1.02f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41a40000    # 20.5f

    .line 381
    .line 382
    const/high16 v2, 0x41100000    # 9.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, -0x40c51eb8    # -0.73f

    .line 388
    .line 389
    .line 390
    const v18, -0x401d70a4    # -1.77f

    .line 391
    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, -0x40cf5c29    # -0.69f

    .line 395
    .line 396
    .line 397
    const v15, -0x4170a3d7    # -0.28f

    .line 398
    .line 399
    .line 400
    const v16, -0x40570a3d    # -1.32f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41400000    # 12.0f

    .line 410
    .line 411
    const/high16 v2, 0x41200000    # 10.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41200000    # 10.0f

    .line 417
    .line 418
    const/high16 v2, 0x40c00000    # 6.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x40c00000    # 6.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/high16 v18, -0x40800000    # -1.0f

    .line 431
    .line 432
    const v14, -0x40f33333    # -0.55f

    .line 433
    .line 434
    .line 435
    const v15, 0x3ee66666    # 0.45f

    .line 436
    .line 437
    .line 438
    const/high16 v16, -0x40800000    # -1.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40800000    # 4.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v18, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const v13, 0x3f0ccccd    # 0.55f

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const/high16 v15, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const v16, 0x3ee66666    # 0.45f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x41900000    # 18.0f

    .line 469
    .line 470
    const/high16 v2, 0x41200000    # 10.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, -0x40800000    # -1.0f

    .line 476
    .line 477
    const/high16 v18, -0x40800000    # -1.0f

    .line 478
    .line 479
    const v13, -0x40f33333    # -0.55f

    .line 480
    .line 481
    .line 482
    const/high16 v15, -0x40800000    # -1.0f

    .line 483
    .line 484
    const v16, -0x4119999a    # -0.45f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3ee66666    # 0.45f

    .line 491
    .line 492
    .line 493
    const/high16 v2, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v4, -0x40800000    # -1.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x4119999a    # -0.45f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const-string v4, ""

    .line 532
    .line 533
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalGasStationKt;->_localGasStation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-object v0
.end method
