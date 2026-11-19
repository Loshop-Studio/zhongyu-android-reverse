.class public final Landroidx/compose/material/icons/twotone/PhoneDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneDisabled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhoneDisabled"

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
    const v0, 0x418ab852    # 17.34f

    .line 71
    .line 72
    .line 73
    const v2, 0x4168a3d7    # 14.54f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4048f5c3    # -1.43f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x3fbc28f6    # 1.47f

    .line 86
    .line 87
    .line 88
    const v18, -0x3feb851f    # -2.32f

    .line 89
    .line 90
    .line 91
    const v13, 0x3f0f5c29    # 0.56f

    .line 92
    .line 93
    .line 94
    const v14, -0x40c51eb8    # -0.73f

    .line 95
    .line 96
    .line 97
    const v15, 0x3f866666    # 1.05f

    .line 98
    .line 99
    .line 100
    const/high16 v16, -0x40400000    # -1.5f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x3ff33333    # -2.2f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x41800000    # -0.25f

    .line 112
    .line 113
    const v18, -0x407d70a4    # -1.02f

    .line 114
    .line 115
    .line 116
    const v13, -0x4170a3d7    # -0.28f

    .line 117
    .line 118
    .line 119
    const v14, -0x4170a3d7    # -0.28f

    .line 120
    .line 121
    .line 122
    const v15, -0x4147ae14    # -0.36f

    .line 123
    .line 124
    .line 125
    const v16, -0x40d47ae1    # -0.67f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x41780000    # 15.5f

    .line 132
    .line 133
    const/high16 v18, 0x40800000    # 4.0f

    .line 134
    .line 135
    const v13, 0x4174cccd    # 15.3f

    .line 136
    .line 137
    .line 138
    const v14, 0x40ce6666    # 6.45f

    .line 139
    .line 140
    .line 141
    const/high16 v15, 0x41780000    # 15.5f

    .line 142
    .line 143
    const/high16 v16, 0x40a80000    # 5.25f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const/high16 v18, -0x40800000    # -1.0f

    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const v14, -0x40f33333    # -0.55f

    .line 154
    .line 155
    .line 156
    const v15, 0x3ee66666    # 0.45f

    .line 157
    .line 158
    .line 159
    const/high16 v16, -0x40800000    # -1.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41a00000    # 20.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v18, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v13, 0x3f0ccccd    # 0.55f

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    const/high16 v15, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const v16, 0x3ee66666    # 0.45f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x418ab852    # 17.34f

    .line 184
    .line 185
    .line 186
    const v18, 0x4168a3d7    # 14.54f

    .line 187
    .line 188
    .line 189
    const/high16 v13, 0x41a80000    # 21.0f

    .line 190
    .line 191
    const v14, 0x40ff5c29    # 7.98f

    .line 192
    .line 193
    .line 194
    const v15, 0x419d0a3d    # 19.63f

    .line 195
    .line 196
    .line 197
    const v16, 0x413a3d71    # 11.64f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x418acccd    # 17.35f

    .line 207
    .line 208
    .line 209
    const v2, 0x416851ec    # 14.52f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x40800000    # 4.0f

    .line 216
    .line 217
    const/high16 v18, 0x41a80000    # 21.0f

    .line 218
    .line 219
    const v13, 0x413a147b    # 11.63f

    .line 220
    .line 221
    .line 222
    const v14, 0x419d1eb8    # 19.64f

    .line 223
    .line 224
    .line 225
    const v15, 0x40ff0a3d    # 7.97f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x41a80000    # 21.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, -0x40800000    # -1.0f

    .line 234
    .line 235
    const/high16 v18, -0x40800000    # -1.0f

    .line 236
    .line 237
    const v13, -0x40f33333    # -0.55f

    .line 238
    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const/high16 v15, -0x40800000    # -1.0f

    .line 242
    .line 243
    const v16, -0x4119999a    # -0.45f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, -0x3fa0a3d7    # -3.49f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, -0x40f33333    # -0.55f

    .line 259
    .line 260
    .line 261
    const v15, 0x3ee66666    # 0.45f

    .line 262
    .line 263
    .line 264
    const/high16 v16, -0x40800000    # -1.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x40647ae1    # 3.57f

    .line 270
    .line 271
    .line 272
    const v18, -0x40ee147b    # -0.57f

    .line 273
    .line 274
    .line 275
    const v13, 0x3f9eb852    # 1.24f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, 0x401ccccd    # 2.45f

    .line 280
    .line 281
    .line 282
    const v16, -0x41b33333    # -0.2f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3e9eb852    # 0.31f

    .line 289
    .line 290
    .line 291
    const v18, -0x42b33333    # -0.05f

    .line 292
    .line 293
    .line 294
    const v13, 0x3dcccccd    # 0.1f

    .line 295
    .line 296
    .line 297
    const v14, -0x42dc28f6    # -0.04f

    .line 298
    .line 299
    .line 300
    const v15, 0x3e570a3d    # 0.21f

    .line 301
    .line 302
    .line 303
    const v16, -0x42b33333    # -0.05f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x3f35c28f    # 0.71f

    .line 310
    .line 311
    .line 312
    const v18, 0x3e947ae1    # 0.29f

    .line 313
    .line 314
    .line 315
    const v13, 0x3e851eb8    # 0.26f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const v15, 0x3f028f5c    # 0.51f

    .line 320
    .line 321
    .line 322
    const v16, 0x3dcccccd    # 0.1f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x400ccccd    # 2.2f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x40133333    # 2.3f

    .line 335
    .line 336
    .line 337
    const v18, -0x40451eb8    # -1.46f

    .line 338
    .line 339
    .line 340
    const v13, 0x3f4f5c29    # 0.81f

    .line 341
    .line 342
    .line 343
    const v14, -0x4128f5c3    # -0.42f

    .line 344
    .line 345
    .line 346
    const v15, 0x3fca3d71    # 1.58f

    .line 347
    .line 348
    .line 349
    const v16, -0x4099999a    # -0.9f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3fb1eb85    # 1.39f

    .line 356
    .line 357
    .line 358
    const v2, 0x40870a3d    # 4.22f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fb5c28f    # 1.42f

    .line 365
    .line 366
    .line 367
    const v2, -0x404b851f    # -1.41f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x41a9851f    # 21.19f

    .line 374
    .line 375
    .line 376
    const v2, 0x41a9999a    # 21.2f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3fb47ae1    # 1.41f

    .line 383
    .line 384
    .line 385
    const v2, -0x404b851f    # -1.41f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x418acccd    # 17.35f

    .line 392
    .line 393
    .line 394
    const v2, 0x416851ec    # 14.52f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x40a00000    # 5.0f

    .line 404
    .line 405
    const v2, 0x418bae14    # 17.46f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x4119999a    # -0.45f

    .line 412
    .line 413
    .line 414
    const v18, 0x4025c28f    # 2.59f

    .line 415
    .line 416
    .line 417
    const v13, -0x428a3d71    # -0.06f

    .line 418
    .line 419
    .line 420
    const v14, 0x3f63d70a    # 0.89f

    .line 421
    .line 422
    .line 423
    const v15, -0x41a8f5c3    # -0.21f

    .line 424
    .line 425
    .line 426
    const v16, 0x3fe147ae    # 1.76f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3f99999a    # 1.2f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x3f428f5c    # 0.76f

    .line 439
    .line 440
    .line 441
    const v18, -0x3f8d70a4    # -3.79f

    .line 442
    .line 443
    .line 444
    const v13, 0x3ed1eb85    # 0.41f

    .line 445
    .line 446
    .line 447
    const v14, -0x40666666    # -1.2f

    .line 448
    .line 449
    .line 450
    const v15, 0x3f2b851f    # 0.67f

    .line 451
    .line 452
    .line 453
    const v16, -0x3fe1eb85    # -2.47f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x418bae14    # 17.46f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x418828f6    # 17.02f

    .line 469
    .line 470
    .line 471
    const v2, 0x40f33333    # 7.6f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, -0x3fd9999a    # -2.6f

    .line 478
    .line 479
    .line 480
    const v18, 0x3ee66666    # 0.45f

    .line 481
    .line 482
    .line 483
    const v13, -0x40a66666    # -0.85f

    .line 484
    .line 485
    .line 486
    const v14, 0x3e75c28f    # 0.24f

    .line 487
    .line 488
    .line 489
    const v15, -0x4023d70a    # -1.72f

    .line 490
    .line 491
    .line 492
    const v16, 0x3ec7ae14    # 0.39f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3fbeb852    # 1.49f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40733333    # 3.8f

    .line 505
    .line 506
    .line 507
    const/high16 v18, -0x40c00000    # -0.75f

    .line 508
    .line 509
    const v13, 0x3fa8f5c3    # 1.32f

    .line 510
    .line 511
    .line 512
    const v14, -0x4247ae14    # -0.09f

    .line 513
    .line 514
    .line 515
    const v15, 0x4025c28f    # 2.59f

    .line 516
    .line 517
    .line 518
    const v16, -0x414ccccd    # -0.35f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x418828f6    # 17.02f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v9, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/twotone/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
