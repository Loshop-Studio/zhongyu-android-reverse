.class public final Landroidx/compose/material/icons/rounded/Replay10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _replay10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay10(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Replay10"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const v2, 0x413fd70a    # 11.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x400d70a4    # 2.21f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, -0x40a66666    # -0.85f

    .line 85
    .line 86
    .line 87
    const v18, -0x414ccccd    # -0.35f

    .line 88
    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const v14, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const v15, -0x40f5c28f    # -0.54f

    .line 95
    .line 96
    .line 97
    const v16, -0x40d47ae1    # -0.67f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x40eb3333    # 7.35f

    .line 104
    .line 105
    .line 106
    const v2, 0x40b4cccd    # 5.65f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const v18, 0x3f35c28f    # 0.71f

    .line 115
    .line 116
    .line 117
    const v13, -0x41b33333    # -0.2f

    .line 118
    .line 119
    .line 120
    const v14, 0x3e4ccccd    # 0.2f

    .line 121
    .line 122
    .line 123
    const v15, -0x41b33333    # -0.2f

    .line 124
    .line 125
    .line 126
    const v16, 0x3f028f5c    # 0.51f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40728f5c    # 3.79f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3f59999a    # 0.85f

    .line 139
    .line 140
    .line 141
    const v18, -0x414ccccd    # -0.35f

    .line 142
    .line 143
    .line 144
    const v13, 0x3e9eb852    # 0.31f

    .line 145
    .line 146
    .line 147
    const v14, 0x3e9eb852    # 0.31f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f59999a    # 0.85f

    .line 151
    .line 152
    .line 153
    const v16, 0x3db851ec    # 0.09f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40e00000    # 7.0f

    .line 160
    .line 161
    const v2, 0x413fd70a    # 11.99f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x40bb851f    # 5.86f

    .line 168
    .line 169
    .line 170
    const v18, 0x40e947ae    # 7.29f

    .line 171
    .line 172
    .line 173
    const v13, 0x406eb852    # 3.73f

    .line 174
    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const v15, 0x40d5c28f    # 6.68f

    .line 178
    .line 179
    .line 180
    const v16, 0x405ae148    # 3.42f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x3f6dc28f    # -4.57f

    .line 187
    .line 188
    .line 189
    const v18, 0x40923d71    # 4.57f

    .line 190
    .line 191
    .line 192
    const v13, -0x410f5c29    # -0.47f

    .line 193
    .line 194
    .line 195
    const v14, 0x401147ae    # 2.27f

    .line 196
    .line 197
    .line 198
    const v15, -0x3fec28f6    # -2.31f

    .line 199
    .line 200
    .line 201
    const v16, 0x40833333    # 4.1f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x3f18a3d7    # -7.23f

    .line 208
    .line 209
    .line 210
    const v18, -0x3f5fae14    # -5.01f

    .line 211
    .line 212
    .line 213
    const v13, -0x3f9b851f    # -3.57f

    .line 214
    .line 215
    .line 216
    const/high16 v14, 0x3f400000    # 0.75f

    .line 217
    .line 218
    const/high16 v15, -0x3f280000    # -6.75f

    .line 219
    .line 220
    const v16, -0x40266666    # -1.7f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x40851eb8    # -0.98f

    .line 227
    .line 228
    .line 229
    const v18, -0x40a66666    # -0.85f

    .line 230
    .line 231
    .line 232
    const v13, -0x428a3d71    # -0.06f

    .line 233
    .line 234
    .line 235
    const v14, -0x410a3d71    # -0.48f

    .line 236
    .line 237
    .line 238
    const v15, -0x410a3d71    # -0.48f

    .line 239
    .line 240
    .line 241
    const v16, -0x40a66666    # -0.85f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40800000    # -1.0f

    .line 248
    .line 249
    const v18, 0x3f90a3d7    # 1.13f

    .line 250
    .line 251
    .line 252
    const v13, -0x40e66666    # -0.6f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, -0x4075c28f    # -1.08f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f07ae14    # 0.53f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x41187ae1    # 9.53f

    .line 266
    .line 267
    .line 268
    const v18, 0x40d70a3d    # 6.72f

    .line 269
    .line 270
    .line 271
    const v13, 0x3f1eb852    # 0.62f

    .line 272
    .line 273
    .line 274
    const v14, 0x408c7ae1    # 4.39f

    .line 275
    .line 276
    .line 277
    const v15, 0x4099999a    # 4.8f

    .line 278
    .line 279
    .line 280
    const v16, 0x40f47ae1    # 7.64f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x40c7ae14    # 6.24f

    .line 287
    .line 288
    .line 289
    const v18, -0x3f3851ec    # -6.24f

    .line 290
    .line 291
    .line 292
    const v13, 0x4047ae14    # 3.12f

    .line 293
    .line 294
    .line 295
    const v14, -0x40e3d70a    # -0.61f

    .line 296
    .line 297
    .line 298
    const v15, 0x40b428f6    # 5.63f

    .line 299
    .line 300
    .line 301
    const v16, -0x3fb851ec    # -3.12f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x3f04cccd    # -7.85f

    .line 308
    .line 309
    .line 310
    const v18, -0x3ee63d71    # -9.61f

    .line 311
    .line 312
    .line 313
    const v13, 0x3f7d70a4    # 0.99f

    .line 314
    .line 315
    .line 316
    const v14, -0x3f5bd70a    # -5.13f

    .line 317
    .line 318
    .line 319
    const v15, -0x3fc66666    # -2.9f

    .line 320
    .line 321
    .line 322
    const v16, -0x3ee63d71    # -9.61f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41800000    # 16.0f

    .line 332
    .line 333
    const v2, 0x412e3d71    # 10.89f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, -0x40a66666    # -0.85f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x3faf5c29    # -3.26f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x407eb852    # -1.01f

    .line 352
    .line 353
    .line 354
    const v2, 0x3e9eb852    # 0.31f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x40cf5c29    # -0.69f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x3fe28f5c    # 1.77f

    .line 367
    .line 368
    .line 369
    const v2, -0x40deb852    # -0.63f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3db851ec    # 0.09f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41800000    # 16.0f

    .line 382
    .line 383
    const v2, 0x412e3d71    # 10.89f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x4172b852    # 15.17f

    .line 393
    .line 394
    .line 395
    const v2, 0x4163d70a    # 14.24f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x42333333    # -0.1f

    .line 402
    .line 403
    .line 404
    const v18, 0x3f51eb85    # 0.82f

    .line 405
    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, 0x3ea3d70a    # 0.32f

    .line 409
    .line 410
    .line 411
    const v15, -0x430a3d71    # -0.03f

    .line 412
    .line 413
    .line 414
    const v16, 0x3f19999a    # 0.6f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3ed70a3d    # 0.42f

    .line 421
    .line 422
    .line 423
    const v2, 0x3f11eb85    # 0.57f

    .line 424
    .line 425
    .line 426
    const v4, -0x416b851f    # -0.29f

    .line 427
    .line 428
    .line 429
    const v6, -0x41d1eb85    # -0.17f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3e851eb8    # 0.26f

    .line 436
    .line 437
    .line 438
    const v2, -0x4119999a    # -0.45f

    .line 439
    .line 440
    .line 441
    const v4, 0x3ea8f5c3    # 0.33f

    .line 442
    .line 443
    .line 444
    const v6, -0x4170a3d7    # -0.28f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x41428f5c    # -0.37f

    .line 451
    .line 452
    .line 453
    const v2, -0x40e8f5c3    # -0.59f

    .line 454
    .line 455
    .line 456
    const v4, 0x3dcccccd    # 0.1f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, -0x412e147b    # -0.41f

    .line 463
    .line 464
    .line 465
    const v2, -0x430a3d71    # -0.03f

    .line 466
    .line 467
    .line 468
    const v4, -0x40e8f5c3    # -0.59f

    .line 469
    .line 470
    .line 471
    const v6, -0x42333333    # -0.1f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, -0x41c7ae14    # -0.18f

    .line 478
    .line 479
    .line 480
    const v2, -0x41147ae1    # -0.46f

    .line 481
    .line 482
    .line 483
    const v4, -0x41570a3d    # -0.33f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x41666666    # -0.3f

    .line 490
    .line 491
    .line 492
    const v2, -0x40ee147b    # -0.57f

    .line 493
    .line 494
    .line 495
    const v4, -0x41947ae1    # -0.23f

    .line 496
    .line 497
    .line 498
    const v6, -0x4151eb85    # -0.34f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, -0x41000000    # -0.5f

    .line 505
    .line 506
    const v2, -0x40ae147b    # -0.82f

    .line 507
    .line 508
    .line 509
    const v4, -0x421eb852    # -0.11f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, -0x40c28f5c    # -0.74f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3dcccccd    # 0.1f

    .line 522
    .line 523
    .line 524
    const v18, -0x40ae147b    # -0.82f

    .line 525
    .line 526
    .line 527
    const v14, -0x415c28f6    # -0.32f

    .line 528
    .line 529
    .line 530
    const v15, 0x3cf5c28f    # 0.03f

    .line 531
    .line 532
    .line 533
    const v16, -0x40e66666    # -0.6f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3e947ae1    # 0.29f

    .line 540
    .line 541
    .line 542
    const v2, -0x40ee147b    # -0.57f

    .line 543
    .line 544
    .line 545
    const v4, 0x3e2e147b    # 0.17f

    .line 546
    .line 547
    .line 548
    const v6, -0x4128f5c3    # -0.42f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x417ae148    # -0.26f

    .line 555
    .line 556
    .line 557
    const v2, 0x3ee66666    # 0.45f

    .line 558
    .line 559
    .line 560
    const v4, -0x41570a3d    # -0.33f

    .line 561
    .line 562
    .line 563
    const v6, 0x3e8f5c29    # 0.28f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x3ebd70a4    # 0.37f

    .line 570
    .line 571
    .line 572
    const v2, 0x3f170a3d    # 0.59f

    .line 573
    .line 574
    .line 575
    const v4, -0x42333333    # -0.1f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x3cf5c28f    # 0.03f

    .line 582
    .line 583
    .line 584
    const v4, 0x3dcccccd    # 0.1f

    .line 585
    .line 586
    .line 587
    const v6, 0x3ed1eb85    # 0.41f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x3eeb851f    # 0.46f

    .line 594
    .line 595
    .line 596
    const v2, 0x3e3851ec    # 0.18f

    .line 597
    .line 598
    .line 599
    const v4, 0x3ea8f5c3    # 0.33f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v4, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3eae147b    # 0.34f

    .line 606
    .line 607
    .line 608
    const v2, 0x3e99999a    # 0.3f

    .line 609
    .line 610
    .line 611
    const v4, 0x3f11eb85    # 0.57f

    .line 612
    .line 613
    .line 614
    const v6, 0x3e6b851f    # 0.23f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x3f000000    # 0.5f

    .line 621
    .line 622
    const v2, 0x3f51eb85    # 0.82f

    .line 623
    .line 624
    .line 625
    const v4, 0x3de147ae    # 0.11f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x3f3d70a4    # 0.74f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x41651eb8    # 14.32f

    .line 641
    .line 642
    .line 643
    const v2, 0x4156147b    # 13.38f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, -0x42dc28f6    # -0.04f

    .line 650
    .line 651
    .line 652
    const v18, -0x410a3d71    # -0.48f

    .line 653
    .line 654
    .line 655
    const v14, -0x41bd70a4    # -0.19f

    .line 656
    .line 657
    .line 658
    const v15, -0x43dc28f6    # -0.01f

    .line 659
    .line 660
    .line 661
    const v16, -0x414ccccd    # -0.35f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, -0x420a3d71    # -0.12f

    .line 668
    .line 669
    .line 670
    const v2, -0x416147ae    # -0.31f

    .line 671
    .line 672
    .line 673
    const v4, -0x4270a3d7    # -0.07f

    .line 674
    .line 675
    .line 676
    const v6, -0x41947ae1    # -0.23f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x41f0a3d7    # -0.14f

    .line 683
    .line 684
    .line 685
    const v2, -0x41bd70a4    # -0.19f

    .line 686
    .line 687
    .line 688
    const v4, -0x421eb852    # -0.11f

    .line 689
    .line 690
    .line 691
    const v6, -0x41d1eb85    # -0.17f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, -0x41dc28f6    # -0.16f

    .line 698
    .line 699
    .line 700
    const/high16 v2, -0x41800000    # -0.25f

    .line 701
    .line 702
    const v4, -0x42b33333    # -0.05f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x3ca3d70a    # 0.02f

    .line 709
    .line 710
    .line 711
    const v4, 0x3d4ccccd    # 0.05f

    .line 712
    .line 713
    .line 714
    const v6, -0x41c7ae14    # -0.18f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, -0x41f0a3d7    # -0.14f

    .line 721
    .line 722
    .line 723
    const v2, -0x41bd70a4    # -0.19f

    .line 724
    .line 725
    .line 726
    const v4, 0x3e2e147b    # 0.17f

    .line 727
    .line 728
    .line 729
    const v6, 0x3db851ec    # 0.09f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, -0x4247ae14    # -0.09f

    .line 736
    .line 737
    .line 738
    const v2, -0x420a3d71    # -0.12f

    .line 739
    .line 740
    .line 741
    const v4, 0x3e9eb852    # 0.31f

    .line 742
    .line 743
    .line 744
    const v6, 0x3e3851ec    # 0.18f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, -0x42dc28f6    # -0.04f

    .line 751
    .line 752
    .line 753
    const v2, 0x3ef5c28f    # 0.48f

    .line 754
    .line 755
    .line 756
    const v4, -0x42dc28f6    # -0.04f

    .line 757
    .line 758
    .line 759
    const v6, 0x3e947ae1    # 0.29f

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x3f7851ec    # 0.97f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v17, 0x3d23d70a    # 0.04f

    .line 772
    .line 773
    .line 774
    const v18, 0x3ef5c28f    # 0.48f

    .line 775
    .line 776
    .line 777
    const v14, 0x3e428f5c    # 0.19f

    .line 778
    .line 779
    .line 780
    const v15, 0x3c23d70a    # 0.01f

    .line 781
    .line 782
    .line 783
    const v16, 0x3eb33333    # 0.35f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x3df5c28f    # 0.12f

    .line 790
    .line 791
    .line 792
    const v2, 0x3ea3d70a    # 0.32f

    .line 793
    .line 794
    .line 795
    const v4, 0x3d8f5c29    # 0.07f

    .line 796
    .line 797
    .line 798
    const v6, 0x3e75c28f    # 0.24f

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x3e0f5c29    # 0.14f

    .line 805
    .line 806
    .line 807
    const v2, 0x3e428f5c    # 0.19f

    .line 808
    .line 809
    .line 810
    const v4, 0x3e2e147b    # 0.17f

    .line 811
    .line 812
    .line 813
    const v6, 0x3de147ae    # 0.11f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, 0x3e23d70a    # 0.16f

    .line 820
    .line 821
    .line 822
    const/high16 v2, 0x3e800000    # 0.25f

    .line 823
    .line 824
    const v4, 0x3d4ccccd    # 0.05f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, -0x435c28f6    # -0.02f

    .line 831
    .line 832
    .line 833
    const v4, -0x42b33333    # -0.05f

    .line 834
    .line 835
    .line 836
    const v6, 0x3e3851ec    # 0.18f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v0, -0x4247ae14    # -0.09f

    .line 843
    .line 844
    .line 845
    const v2, 0x3e428f5c    # 0.19f

    .line 846
    .line 847
    .line 848
    const v4, -0x41d1eb85    # -0.17f

    .line 849
    .line 850
    .line 851
    const v6, 0x3e0f5c29    # 0.14f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v0, -0x415c28f6    # -0.32f

    .line 858
    .line 859
    .line 860
    const v2, -0x41bd70a4    # -0.19f

    .line 861
    .line 862
    .line 863
    const v4, 0x3db851ec    # 0.09f

    .line 864
    .line 865
    .line 866
    const v6, 0x3de147ae    # 0.11f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x3d23d70a    # 0.04f

    .line 873
    .line 874
    .line 875
    const v2, -0x410a3d71    # -0.48f

    .line 876
    .line 877
    .line 878
    const v4, -0x416b851f    # -0.29f

    .line 879
    .line 880
    .line 881
    const v6, 0x3d23d70a    # 0.04f

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, -0x4087ae14    # -0.97f

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    const/16 v16, 0x3800

    .line 901
    .line 902
    const/16 v17, 0x0

    .line 903
    .line 904
    const/high16 v6, 0x3f800000    # 1.0f

    .line 905
    .line 906
    const/high16 v8, 0x3f800000    # 1.0f

    .line 907
    .line 908
    const/4 v7, 0x0

    .line 909
    const/high16 v9, 0x3f800000    # 1.0f

    .line 910
    .line 911
    const/high16 v12, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/4 v14, 0x0

    .line 914
    const/4 v15, 0x0

    .line 915
    const-string v4, ""

    .line 916
    .line 917
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    sput-object v0, Landroidx/compose/material/icons/rounded/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 926
    .line 927
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-object v0
.end method
