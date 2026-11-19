.class public final Landroidx/compose/material/icons/rounded/ShutterSpeedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShutterSpeed(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ShutterSpeedKt;->_shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ShutterSpeed"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x4119999a    # -0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, -0x40800000    # -1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x3f800000    # -4.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x40800000    # -1.0f

    .line 112
    .line 113
    const/high16 v18, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v13, -0x40f33333    # -0.55f

    .line 116
    .line 117
    .line 118
    const/high16 v15, -0x40800000    # -1.0f

    .line 119
    .line 120
    const v16, 0x3ee66666    # 0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3ee66666    # 0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x41983d71    # 19.03f

    .line 138
    .line 139
    .line 140
    const v2, 0x40ec7ae1    # 7.39f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, -0x40c00000    # -0.75f

    .line 147
    .line 148
    const/high16 v2, 0x3f400000    # 0.75f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const v18, -0x404ccccd    # -1.4f

    .line 156
    .line 157
    .line 158
    const v13, 0x3ec28f5c    # 0.38f

    .line 159
    .line 160
    .line 161
    const v14, -0x413d70a4    # -0.38f

    .line 162
    .line 163
    .line 164
    const v15, 0x3ec7ae14    # 0.39f

    .line 165
    .line 166
    .line 167
    const v16, -0x407eb852    # -1.01f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x43dc28f6    # -0.01f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x404ccccd    # -1.4f

    .line 180
    .line 181
    .line 182
    const/16 v18, 0x0

    .line 183
    .line 184
    const v13, -0x413851ec    # -0.39f

    .line 185
    .line 186
    .line 187
    const v14, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    const v15, -0x407eb852    # -1.01f

    .line 191
    .line 192
    .line 193
    const v16, -0x413d70a4    # -0.38f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, -0x40c00000    # -0.75f

    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41400000    # 12.0f

    .line 205
    .line 206
    const/high16 v18, 0x40800000    # 4.0f

    .line 207
    .line 208
    const v13, 0x41808f5c    # 16.07f

    .line 209
    .line 210
    .line 211
    const v14, 0x4097ae14    # 4.74f

    .line 212
    .line 213
    .line 214
    const v15, 0x4161eb85    # 14.12f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x40800000    # 4.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 223
    .line 224
    const v18, 0x410c28f6    # 8.76f

    .line 225
    .line 226
    .line 227
    const v13, -0x3f666666    # -4.8f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const v15, -0x3ef1eb85    # -8.88f

    .line 232
    .line 233
    .line 234
    const v16, 0x407d70a4    # 3.96f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x41400000    # 12.0f

    .line 241
    .line 242
    const/high16 v18, 0x41b00000    # 22.0f

    .line 243
    .line 244
    const v13, 0x4037ae14    # 2.87f

    .line 245
    .line 246
    .line 247
    const v14, 0x418eb852    # 17.84f

    .line 248
    .line 249
    .line 250
    const v15, 0x40de147b    # 6.94f

    .line 251
    .line 252
    .line 253
    const/high16 v16, 0x41b00000    # 22.0f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x41100000    # 9.0f

    .line 259
    .line 260
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 261
    .line 262
    const v13, 0x409f5c29    # 4.98f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, 0x41100000    # 9.0f

    .line 267
    .line 268
    const v16, -0x3f7f0a3d    # -4.03f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x4003d70a    # -1.97f

    .line 275
    .line 276
    .line 277
    const v18, -0x3f4c7ae1    # -5.61f

    .line 278
    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x3ff851ec    # -2.12f

    .line 282
    .line 283
    .line 284
    const v15, -0x40c28f5c    # -0.74f

    .line 285
    .line 286
    .line 287
    const v16, -0x3f7dc28f    # -4.07f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x41400000    # 12.0f

    .line 297
    .line 298
    const/high16 v2, 0x41a00000    # 20.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x3f200000    # -7.0f

    .line 304
    .line 305
    const/high16 v18, -0x3f200000    # -7.0f

    .line 306
    .line 307
    const v13, -0x3f8851ec    # -3.87f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const/high16 v15, -0x3f200000    # -7.0f

    .line 312
    .line 313
    const v16, -0x3fb7ae14    # -3.13f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x404851ec    # 3.13f

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x3f200000    # -7.0f

    .line 323
    .line 324
    const/high16 v4, 0x40e00000    # 7.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x40e00000    # 7.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x3fb7ae14    # -3.13f

    .line 335
    .line 336
    .line 337
    const/high16 v2, -0x3f200000    # -7.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x412cf5c3    # 10.81f

    .line 346
    .line 347
    .line 348
    const/high16 v2, 0x41700000    # 15.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, -0x3f933333    # -3.7f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    const v18, 0x3f3d70a4    # 0.74f

    .line 363
    .line 364
    .line 365
    const v13, -0x413d70a4    # -0.38f

    .line 366
    .line 367
    .line 368
    const v15, -0x40e147ae    # -0.62f

    .line 369
    .line 370
    .line 371
    const v16, 0x3ecccccd    # 0.4f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x40247ae1    # 2.57f

    .line 378
    .line 379
    .line 380
    const v18, 0x40247ae1    # 2.57f

    .line 381
    .line 382
    .line 383
    const v13, 0x3f0f5c29    # 0.56f

    .line 384
    .line 385
    .line 386
    const v14, 0x3f8f5c29    # 1.12f

    .line 387
    .line 388
    .line 389
    const v15, 0x3fb851ec    # 1.44f

    .line 390
    .line 391
    .line 392
    const v16, 0x4000a3d7    # 2.01f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3f266666    # 0.65f

    .line 399
    .line 400
    .line 401
    const v18, -0x41a8f5c3    # -0.21f

    .line 402
    .line 403
    .line 404
    const v13, 0x3e6b851f    # 0.23f

    .line 405
    .line 406
    .line 407
    const v14, 0x3de147ae    # 0.11f

    .line 408
    .line 409
    .line 410
    const v15, 0x3f051eb8    # 0.52f

    .line 411
    .line 412
    .line 413
    const v16, 0x3ca3d70a    # 0.02f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3faf5c29    # 1.37f

    .line 420
    .line 421
    .line 422
    const v2, -0x3fe9999a    # -2.35f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x411eb852    # -0.44f

    .line 429
    .line 430
    .line 431
    const/high16 v18, -0x40c00000    # -0.75f

    .line 432
    .line 433
    const v13, 0x3e428f5c    # 0.19f

    .line 434
    .line 435
    .line 436
    const v14, -0x41570a3d    # -0.33f

    .line 437
    .line 438
    .line 439
    const v15, -0x42b33333    # -0.05f

    .line 440
    .line 441
    .line 442
    const/high16 v16, -0x40c00000    # -0.75f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x416bae14    # 14.73f

    .line 451
    .line 452
    .line 453
    const v2, 0x40f4cccd    # 7.65f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x40d9999a    # -0.65f

    .line 460
    .line 461
    .line 462
    const v18, 0x3e4ccccd    # 0.2f

    .line 463
    .line 464
    .line 465
    const v13, -0x41947ae1    # -0.23f

    .line 466
    .line 467
    .line 468
    const v14, -0x420a3d71    # -0.12f

    .line 469
    .line 470
    .line 471
    const v15, -0x40fae148    # -0.52f

    .line 472
    .line 473
    .line 474
    const v16, -0x435c28f6    # -0.02f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, -0x404f5c29    # -1.38f

    .line 481
    .line 482
    .line 483
    const v2, 0x4018f5c3    # 2.39f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x3edc28f6    # 0.43f

    .line 490
    .line 491
    .line 492
    const v18, 0x3f428f5c    # 0.76f

    .line 493
    .line 494
    .line 495
    const v13, -0x41b33333    # -0.2f

    .line 496
    .line 497
    .line 498
    const v14, 0x3eae147b    # 0.34f

    .line 499
    .line 500
    .line 501
    const v15, 0x3d23d70a    # 0.04f

    .line 502
    .line 503
    .line 504
    const v16, 0x3f428f5c    # 0.76f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x4070a3d7    # 3.76f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x3ee66666    # 0.45f

    .line 517
    .line 518
    .line 519
    const v18, -0x40c51eb8    # -0.73f

    .line 520
    .line 521
    .line 522
    const v13, 0x3ec28f5c    # 0.38f

    .line 523
    .line 524
    .line 525
    const/4 v14, 0x0

    .line 526
    const v15, 0x3f1eb852    # 0.62f

    .line 527
    .line 528
    .line 529
    const v16, -0x41333333    # -0.4f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x3fd8f5c3    # -2.61f

    .line 536
    .line 537
    .line 538
    const v18, -0x3fd851ec    # -2.62f

    .line 539
    .line 540
    .line 541
    const v13, -0x40eb851f    # -0.58f

    .line 542
    .line 543
    .line 544
    const v14, -0x406f5c29    # -1.13f

    .line 545
    .line 546
    .line 547
    const v15, -0x404147ae    # -1.49f

    .line 548
    .line 549
    .line 550
    const v16, -0x3ffd70a4    # -2.04f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x415e147b    # 13.88f

    .line 560
    .line 561
    .line 562
    const v2, 0x416b3333    # 14.7f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x40a147ae    # -0.87f

    .line 569
    .line 570
    .line 571
    const v18, -0x43dc28f6    # -0.01f

    .line 572
    .line 573
    .line 574
    const v13, -0x41bd70a4    # -0.19f

    .line 575
    .line 576
    .line 577
    const v14, -0x4151eb85    # -0.34f

    .line 578
    .line 579
    .line 580
    const v15, -0x40d1eb85    # -0.68f

    .line 581
    .line 582
    .line 583
    const v16, -0x414ccccd    # -0.35f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, -0x3ffd70a4    # -2.04f

    .line 590
    .line 591
    .line 592
    const v2, 0x406147ae    # 3.52f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x3ec7ae14    # 0.39f

    .line 599
    .line 600
    .line 601
    const/high16 v18, 0x3f400000    # 0.75f

    .line 602
    .line 603
    const v13, -0x41c7ae14    # -0.18f

    .line 604
    .line 605
    .line 606
    const v14, 0x3ea3d70a    # 0.32f

    .line 607
    .line 608
    .line 609
    const v15, 0x3ca3d70a    # 0.02f

    .line 610
    .line 611
    .line 612
    const v16, 0x3f3851ec    # 0.72f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x40751eb8    # 3.83f

    .line 619
    .line 620
    .line 621
    const v18, -0x409c28f6    # -0.89f

    .line 622
    .line 623
    .line 624
    const v13, 0x3fab851f    # 1.34f

    .line 625
    .line 626
    .line 627
    const v14, 0x3e0f5c29    # 0.14f

    .line 628
    .line 629
    .line 630
    const v15, 0x402c28f6    # 2.69f

    .line 631
    .line 632
    .line 633
    const v16, -0x41c7ae14    # -0.18f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3e23d70a    # 0.16f

    .line 640
    .line 641
    .line 642
    const v18, -0x40d70a3d    # -0.66f

    .line 643
    .line 644
    .line 645
    const v13, 0x3e6147ae    # 0.22f

    .line 646
    .line 647
    .line 648
    const v14, -0x41f0a3d7    # -0.14f

    .line 649
    .line 650
    .line 651
    const v15, 0x3e8f5c29    # 0.28f

    .line 652
    .line 653
    .line 654
    const v16, -0x4123d70a    # -0.43f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, -0x4043d70a    # -1.47f

    .line 661
    .line 662
    .line 663
    const v2, -0x3fd28f5c    # -2.71f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, 0x4124f5c3    # 10.31f

    .line 673
    .line 674
    .line 675
    const v2, 0x4153ae14    # 13.23f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x40fdc28f    # 7.93f

    .line 682
    .line 683
    .line 684
    const v2, 0x41191eb8    # 9.57f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, -0x40a8f5c3    # -0.84f

    .line 691
    .line 692
    .line 693
    const/16 v18, 0x0

    .line 694
    .line 695
    const v13, -0x41b33333    # -0.2f

    .line 696
    .line 697
    .line 698
    const v14, -0x41666666    # -0.3f

    .line 699
    .line 700
    .line 701
    const v15, -0x40dc28f6    # -0.64f

    .line 702
    .line 703
    .line 704
    const v16, -0x41666666    # -0.3f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, -0x4079999a    # -1.05f

    .line 711
    .line 712
    .line 713
    const v18, 0x407eb852    # 3.98f

    .line 714
    .line 715
    .line 716
    const v13, -0x40b0a3d7    # -0.81f

    .line 717
    .line 718
    .line 719
    const v14, 0x3f947ae1    # 1.16f

    .line 720
    .line 721
    .line 722
    const v15, -0x406a3d71    # -1.17f

    .line 723
    .line 724
    .line 725
    const v16, 0x40247ae1    # 2.57f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v17, 0x3f000000    # 0.5f

    .line 732
    .line 733
    const v18, 0x3ee66666    # 0.45f

    .line 734
    .line 735
    .line 736
    const v13, 0x3ca3d70a    # 0.02f

    .line 737
    .line 738
    .line 739
    const v14, 0x3e851eb8    # 0.26f

    .line 740
    .line 741
    .line 742
    const v15, 0x3e75c28f    # 0.24f

    .line 743
    .line 744
    .line 745
    const v16, 0x3ee66666    # 0.45f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x40566666    # 3.35f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, 0x3ed70a3d    # 0.42f

    .line 758
    .line 759
    .line 760
    const v18, -0x40bae148    # -0.77f

    .line 761
    .line 762
    .line 763
    const v13, 0x3ec7ae14    # 0.39f

    .line 764
    .line 765
    .line 766
    const/4 v14, 0x0

    .line 767
    const v15, 0x3f2147ae    # 0.63f

    .line 768
    .line 769
    .line 770
    const v16, -0x411eb852    # -0.44f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x415f851f    # 13.97f

    .line 780
    .line 781
    .line 782
    const v2, 0x414bd70a    # 12.74f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, 0x400147ae    # 2.02f

    .line 789
    .line 790
    .line 791
    const v2, 0x406f5c29    # 3.74f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x3f5c28f6    # 0.86f

    .line 798
    .line 799
    .line 800
    const v18, 0x3d4ccccd    # 0.05f

    .line 801
    .line 802
    .line 803
    const v13, 0x3e3851ec    # 0.18f

    .line 804
    .line 805
    .line 806
    const v14, 0x3ea8f5c3    # 0.33f

    .line 807
    .line 808
    .line 809
    const v15, 0x3f23d70a    # 0.64f

    .line 810
    .line 811
    .line 812
    const v16, 0x3eb33333    # 0.35f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v17, 0x3f8f5c29    # 1.12f

    .line 819
    .line 820
    .line 821
    const v18, -0x3f7d70a4    # -4.08f

    .line 822
    .line 823
    .line 824
    const v13, 0x3f5c28f6    # 0.86f

    .line 825
    .line 826
    .line 827
    const v14, -0x4068f5c3    # -1.18f

    .line 828
    .line 829
    .line 830
    const v15, 0x3f9eb852    # 1.24f

    .line 831
    .line 832
    .line 833
    const v16, -0x3fd851ec    # -2.62f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v17, -0x41000000    # -0.5f

    .line 840
    .line 841
    const v18, -0x4119999a    # -0.45f

    .line 842
    .line 843
    .line 844
    const v13, -0x435c28f6    # -0.02f

    .line 845
    .line 846
    .line 847
    const v14, -0x417ae148    # -0.26f

    .line 848
    .line 849
    .line 850
    const/high16 v15, -0x41800000    # -0.25f

    .line 851
    .line 852
    const v16, -0x4119999a    # -0.45f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, -0x3fbccccd    # -3.05f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, -0x4119999a    # -0.45f

    .line 865
    .line 866
    .line 867
    const v18, 0x3f3d70a4    # 0.74f

    .line 868
    .line 869
    .line 870
    const v13, -0x413851ec    # -0.39f

    .line 871
    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    const v15, -0x40deb852    # -0.63f

    .line 875
    .line 876
    .line 877
    const v16, 0x3ecccccd    # 0.4f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v0, 0x4122b852    # 10.17f

    .line 887
    .line 888
    .line 889
    const v2, 0x4132b852    # 11.17f

    .line 890
    .line 891
    .line 892
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const v17, 0x3f59999a    # 0.85f

    .line 896
    .line 897
    .line 898
    const v18, -0x435c28f6    # -0.02f

    .line 899
    .line 900
    .line 901
    const v13, 0x3e4ccccd    # 0.2f

    .line 902
    .line 903
    .line 904
    const v14, 0x3e9eb852    # 0.31f

    .line 905
    .line 906
    .line 907
    const v15, 0x3f28f5c3    # 0.66f

    .line 908
    .line 909
    .line 910
    const v16, 0x3e99999a    # 0.3f

    .line 911
    .line 912
    .line 913
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v0, 0x3ff851ec    # 1.94f

    .line 917
    .line 918
    .line 919
    const v2, -0x3fa9999a    # -3.35f

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v17, -0x41333333    # -0.4f

    .line 926
    .line 927
    .line 928
    const v18, -0x40bd70a4    # -0.76f

    .line 929
    .line 930
    .line 931
    const v13, 0x3e428f5c    # 0.19f

    .line 932
    .line 933
    .line 934
    const v14, -0x415c28f6    # -0.32f

    .line 935
    .line 936
    .line 937
    const v15, -0x430a3d71    # -0.03f

    .line 938
    .line 939
    .line 940
    const v16, -0x40c7ae14    # -0.72f

    .line 941
    .line 942
    .line 943
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const v17, -0x3f87ae14    # -3.88f

    .line 947
    .line 948
    .line 949
    const v18, 0x3f7851ec    # 0.97f

    .line 950
    .line 951
    .line 952
    const v13, -0x4051eb85    # -1.36f

    .line 953
    .line 954
    .line 955
    const v14, -0x420a3d71    # -0.12f

    .line 956
    .line 957
    .line 958
    const v15, -0x3fd147ae    # -2.73f

    .line 959
    .line 960
    .line 961
    const v16, 0x3e570a3d    # 0.21f

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v17, -0x41fae148    # -0.13f

    .line 968
    .line 969
    .line 970
    const v18, 0x3f2e147b    # 0.68f

    .line 971
    .line 972
    .line 973
    const v13, -0x419eb852    # -0.22f

    .line 974
    .line 975
    .line 976
    const v14, 0x3e19999a    # 0.15f

    .line 977
    .line 978
    .line 979
    const v15, -0x4175c28f    # -0.27f

    .line 980
    .line 981
    .line 982
    const v16, 0x3eeb851f    # 0.46f

    .line 983
    .line 984
    .line 985
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const v0, 0x3fcf5c29    # 1.62f

    .line 989
    .line 990
    .line 991
    const v2, 0x401eb852    # 2.48f

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    const/16 v16, 0x3800

    .line 1005
    .line 1006
    const/16 v17, 0x0

    .line 1007
    .line 1008
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1009
    .line 1010
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1011
    .line 1012
    const/4 v7, 0x0

    .line 1013
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1014
    .line 1015
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1016
    .line 1017
    const/4 v13, 0x0

    .line 1018
    const/4 v14, 0x0

    .line 1019
    const/4 v15, 0x0

    .line 1020
    const-string v4, ""

    .line 1021
    .line 1022
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    sput-object v0, Landroidx/compose/material/icons/rounded/ShutterSpeedKt;->_shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1031
    .line 1032
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    return-object v0
.end method
