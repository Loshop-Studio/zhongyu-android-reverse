.class public final Landroidx/compose/material/icons/sharp/WebhookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _webhook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWebhook(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WebhookKt;->_webhook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Webhook"

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
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x40bc28f6    # 5.88f

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, 0x3f8f5c29    # 1.12f

    .line 85
    .line 86
    .line 87
    const/high16 v18, -0x41000000    # -0.5f

    .line 88
    .line 89
    const v13, 0x3e8a3d71    # 0.27f

    .line 90
    .line 91
    .line 92
    const v14, -0x416147ae    # -0.31f

    .line 93
    .line 94
    .line 95
    const v15, 0x3f2b851f    # 0.67f

    .line 96
    .line 97
    .line 98
    const/high16 v16, -0x41000000    # -0.5f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 104
    .line 105
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 106
    .line 107
    const v13, 0x3f547ae1    # 0.83f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 112
    .line 113
    const v16, 0x3f2b851f    # 0.67f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, -0x40400000    # -1.5f

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const v14, 0x3f547ae1    # 0.83f

    .line 123
    .line 124
    .line 125
    const v15, -0x40d47ae1    # -0.67f

    .line 126
    .line 127
    .line 128
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x4070a3d7    # -1.12f

    .line 134
    .line 135
    .line 136
    const/high16 v18, -0x41000000    # -0.5f

    .line 137
    .line 138
    const v13, -0x411eb852    # -0.44f

    .line 139
    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const v15, -0x40a8f5c3    # -0.84f

    .line 143
    .line 144
    .line 145
    const v16, -0x41bd70a4    # -0.19f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, -0x3f8147ae    # -3.98f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x3f633333    # -4.9f

    .line 158
    .line 159
    .line 160
    const/high16 v18, 0x40800000    # 4.0f

    .line 161
    .line 162
    const v13, -0x41147ae1    # -0.46f

    .line 163
    .line 164
    .line 165
    const v14, 0x4011eb85    # 2.28f

    .line 166
    .line 167
    .line 168
    const v15, -0x3fe147ae    # -2.48f

    .line 169
    .line 170
    .line 171
    const/high16 v16, 0x40800000    # 4.0f

    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, -0x3f600000    # -5.0f

    .line 177
    .line 178
    const/high16 v18, -0x3f600000    # -5.0f

    .line 179
    .line 180
    const v13, -0x3fcf5c29    # -2.76f

    .line 181
    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/high16 v15, -0x3f600000    # -5.0f

    .line 185
    .line 186
    const v16, -0x3ff0a3d7    # -2.24f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v17, 0x40800000    # 4.0f

    .line 193
    .line 194
    const v18, -0x3f633333    # -4.9f

    .line 195
    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, -0x3fe51eb8    # -2.42f

    .line 199
    .line 200
    .line 201
    const v15, 0x3fdc28f6    # 1.72f

    .line 202
    .line 203
    .line 204
    const v16, -0x3f71eb85    # -4.44f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x40047ae1    # 2.07f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v18, 0x41800000    # 16.0f

    .line 217
    .line 218
    const v13, 0x409ae148    # 4.84f

    .line 219
    .line 220
    .line 221
    const v14, 0x415947ae    # 13.58f

    .line 222
    .line 223
    .line 224
    const/high16 v15, 0x40800000    # 4.0f

    .line 225
    .line 226
    const v16, 0x416b3333    # 14.7f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40400000    # 3.0f

    .line 233
    .line 234
    const/high16 v18, 0x40400000    # 3.0f

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const v14, 0x3fd33333    # 1.65f

    .line 238
    .line 239
    .line 240
    const v15, 0x3faccccd    # 1.35f

    .line 241
    .line 242
    .line 243
    const/high16 v16, 0x40400000    # 3.0f

    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, -0x40533333    # -1.35f

    .line 249
    .line 250
    .line 251
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 252
    .line 253
    const/high16 v4, 0x40400000    # 3.0f

    .line 254
    .line 255
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x41700000    # 15.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41480000    # 12.5f

    .line 267
    .line 268
    const/high16 v2, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v13, 0x3fd33333    # 1.65f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, 0x40400000    # 3.0f

    .line 278
    .line 279
    const v16, 0x3faccccd    # 1.35f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, -0x3f600000    # -5.0f

    .line 291
    .line 292
    const/high16 v18, -0x3f600000    # -5.0f

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const v14, -0x3fcf5c29    # -2.76f

    .line 296
    .line 297
    .line 298
    const v15, -0x3ff0a3d7    # -2.24f

    .line 299
    .line 300
    .line 301
    const/high16 v16, -0x3f600000    # -5.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/4 v0, 0x0

    .line 307
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const v13, -0x3fcf5c29    # -2.76f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/high16 v15, -0x3f600000    # -5.0f

    .line 317
    .line 318
    const v16, 0x400f5c29    # 2.24f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3fc66666    # 1.55f

    .line 325
    .line 326
    .line 327
    const v18, 0x4067ae14    # 3.62f

    .line 328
    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x3fb70a3d    # 1.43f

    .line 332
    .line 333
    .line 334
    const v15, 0x3f19999a    # 0.6f

    .line 335
    .line 336
    .line 337
    const v16, 0x402d70a4    # 2.71f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, -0x3fe9999a    # -2.35f

    .line 344
    .line 345
    .line 346
    const v2, 0x4079999a    # 3.9f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x40b00000    # 5.5f

    .line 353
    .line 354
    const/high16 v18, 0x41800000    # 16.0f

    .line 355
    .line 356
    const v13, 0x40c0a3d7    # 6.02f

    .line 357
    .line 358
    .line 359
    const v14, 0x416a8f5c    # 14.66f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x40b00000    # 5.5f

    .line 363
    .line 364
    const v16, 0x417451ec    # 15.27f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 371
    .line 372
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x3f547ae1    # 0.83f

    .line 376
    .line 377
    .line 378
    const v15, 0x3f2b851f    # 0.67f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x40d47ae1    # -0.67f

    .line 387
    .line 388
    .line 389
    const/high16 v2, -0x40400000    # -1.5f

    .line 390
    .line 391
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 392
    .line 393
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x4270a3d7    # -0.07f

    .line 397
    .line 398
    .line 399
    const v18, -0x4119999a    # -0.45f

    .line 400
    .line 401
    .line 402
    const v14, -0x41dc28f6    # -0.16f

    .line 403
    .line 404
    .line 405
    const v15, -0x435c28f6    # -0.02f

    .line 406
    .line 407
    .line 408
    const v16, -0x416147ae    # -0.31f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x405851ec    # 3.38f

    .line 415
    .line 416
    .line 417
    const v2, -0x3f4bd70a    # -5.63f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41180000    # 9.5f

    .line 424
    .line 425
    const/high16 v18, 0x40e00000    # 7.0f

    .line 426
    .line 427
    const v13, 0x4127d70a    # 10.49f

    .line 428
    .line 429
    .line 430
    const v14, 0x4119c28f    # 9.61f

    .line 431
    .line 432
    .line 433
    const/high16 v15, 0x41180000    # 9.5f

    .line 434
    .line 435
    const v16, 0x4106b852    # 8.42f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x41480000    # 12.5f

    .line 442
    .line 443
    const/high16 v18, 0x40800000    # 4.0f

    .line 444
    .line 445
    const/high16 v13, 0x41180000    # 9.5f

    .line 446
    .line 447
    const v14, 0x40ab3333    # 5.35f

    .line 448
    .line 449
    .line 450
    const v15, 0x412d999a    # 10.85f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40800000    # 4.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41880000    # 17.0f

    .line 462
    .line 463
    const/high16 v2, 0x41500000    # 13.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, -0x4023d70a    # -1.72f

    .line 469
    .line 470
    .line 471
    const v18, 0x3f0a3d71    # 0.54f

    .line 472
    .line 473
    .line 474
    const v13, -0x40dc28f6    # -0.64f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const v15, -0x40628f5c    # -1.23f

    .line 479
    .line 480
    .line 481
    const v16, 0x3e4ccccd    # 0.2f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x3fbccccd    # -3.05f

    .line 488
    .line 489
    .line 490
    const v2, -0x3f5dc28f    # -5.07f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x41300000    # 11.0f

    .line 497
    .line 498
    const/high16 v18, 0x40e00000    # 7.0f

    .line 499
    .line 500
    const v13, 0x41387ae1    # 11.53f

    .line 501
    .line 502
    .line 503
    const v14, 0x4105999a    # 8.35f

    .line 504
    .line 505
    .line 506
    const/high16 v15, 0x41300000    # 11.0f

    .line 507
    .line 508
    const v16, 0x40f7ae14    # 7.74f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 515
    .line 516
    const/high16 v18, -0x40400000    # -1.5f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, -0x40ab851f    # -0.83f

    .line 520
    .line 521
    .line 522
    const v15, 0x3f2b851f    # 0.67f

    .line 523
    .line 524
    .line 525
    const/high16 v16, -0x40400000    # -1.5f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x40c570a4    # 6.17f

    .line 531
    .line 532
    .line 533
    const/high16 v2, 0x40e00000    # 7.0f

    .line 534
    .line 535
    const/high16 v4, 0x41600000    # 14.0f

    .line 536
    .line 537
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, -0x428a3d71    # -0.06f

    .line 541
    .line 542
    .line 543
    const v18, 0x3edc28f6    # 0.43f

    .line 544
    .line 545
    .line 546
    const v14, 0x3e19999a    # 0.15f

    .line 547
    .line 548
    .line 549
    const v15, -0x435c28f6    # -0.02f

    .line 550
    .line 551
    .line 552
    const v16, 0x3e947ae1    # 0.29f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x400c28f6    # 2.19f

    .line 559
    .line 560
    .line 561
    const v2, 0x4069999a    # 3.65f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x41880000    # 17.0f

    .line 568
    .line 569
    const/high16 v18, 0x41300000    # 11.0f

    .line 570
    .line 571
    const v13, 0x418347ae    # 16.41f

    .line 572
    .line 573
    .line 574
    const v14, 0x41307ae1    # 11.03f

    .line 575
    .line 576
    .line 577
    const v15, 0x4185999a    # 16.7f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x41300000    # 11.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/4 v0, 0x0

    .line 586
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x40a00000    # 5.0f

    .line 590
    .line 591
    const/high16 v18, 0x40a00000    # 5.0f

    .line 592
    .line 593
    const v13, 0x4030a3d7    # 2.76f

    .line 594
    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    const/high16 v15, 0x40a00000    # 5.0f

    .line 598
    .line 599
    const v16, 0x400f5c29    # 2.24f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, -0x3f600000    # -5.0f

    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const v14, 0x4030a3d7    # 2.76f

    .line 609
    .line 610
    .line 611
    const v15, -0x3ff0a3d7    # -2.24f

    .line 612
    .line 613
    .line 614
    const/high16 v16, 0x40a00000    # 5.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, -0x3f7570a4    # -4.33f

    .line 620
    .line 621
    .line 622
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 623
    .line 624
    const v13, -0x40133333    # -1.85f

    .line 625
    .line 626
    .line 627
    const/4 v14, 0x0

    .line 628
    const v15, -0x3fa1eb85    # -3.47f

    .line 629
    .line 630
    .line 631
    const v16, -0x407eb852    # -1.01f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x402ae148    # 2.67f

    .line 638
    .line 639
    .line 640
    const/4 v2, 0x0

    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v17, 0x41880000    # 17.0f

    .line 645
    .line 646
    const/high16 v18, 0x41980000    # 19.0f

    .line 647
    .line 648
    const v13, 0x417d1eb8    # 15.82f

    .line 649
    .line 650
    .line 651
    const v14, 0x41968f5c    # 18.82f

    .line 652
    .line 653
    .line 654
    const v15, 0x41831eb8    # 16.39f

    .line 655
    .line 656
    .line 657
    const/high16 v16, 0x41980000    # 19.0f

    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x40400000    # 3.0f

    .line 663
    .line 664
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 665
    .line 666
    const v13, 0x3fd33333    # 1.65f

    .line 667
    .line 668
    .line 669
    const/4 v14, 0x0

    .line 670
    const/high16 v15, 0x40400000    # 3.0f

    .line 671
    .line 672
    const v16, -0x40533333    # -1.35f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x41953333    # 18.65f

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x41880000    # 17.0f

    .line 682
    .line 683
    const/high16 v4, 0x41500000    # 13.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    const/16 v16, 0x3800

    .line 696
    .line 697
    const/16 v17, 0x0

    .line 698
    .line 699
    const/high16 v6, 0x3f800000    # 1.0f

    .line 700
    .line 701
    const/high16 v8, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v7, 0x0

    .line 704
    const/high16 v9, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v12, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v13, 0x0

    .line 709
    const/4 v15, 0x0

    .line 710
    const-string v4, ""

    .line 711
    .line 712
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    sput-object v0, Landroidx/compose/material/icons/sharp/WebhookKt;->_webhook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    return-object v0
.end method
