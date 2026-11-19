.class public final Landroidx/compose/material/icons/rounded/EmergencyShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergencyShare(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EmergencyShare"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const v18, 0x40c4cccd    # 6.15f

    .line 80
    .line 81
    .line 82
    const v13, -0x3fb66666    # -3.15f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const v16, 0x401a3d71    # 2.41f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, 0x40aae148    # 5.34f

    .line 95
    .line 96
    .line 97
    const v18, 0x410451ec    # 8.27f

    .line 98
    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x40166666    # 2.35f

    .line 102
    .line 103
    .line 104
    const v15, 0x3fe3d70a    # 1.78f

    .line 105
    .line 106
    .line 107
    const v16, 0x40a3851f    # 5.11f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x3faa3d71    # 1.33f

    .line 114
    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    const v13, 0x3ebd70a4    # 0.37f

    .line 119
    .line 120
    .line 121
    const v14, 0x3ea8f5c3    # 0.33f

    .line 122
    .line 123
    .line 124
    const v15, 0x3f733333    # 0.95f

    .line 125
    .line 126
    .line 127
    const v16, 0x3ea8f5c3    # 0.33f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x41900000    # 18.0f

    .line 134
    .line 135
    const v18, 0x41726666    # 15.15f

    .line 136
    .line 137
    .line 138
    const v13, 0x4181c28f    # 16.22f

    .line 139
    .line 140
    .line 141
    const/high16 v14, 0x41a20000    # 20.25f

    .line 142
    .line 143
    const/high16 v15, 0x41900000    # 18.0f

    .line 144
    .line 145
    const/high16 v16, 0x418c0000    # 17.5f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41400000    # 12.0f

    .line 151
    .line 152
    const/high16 v18, 0x41100000    # 9.0f

    .line 153
    .line 154
    const/high16 v13, 0x41900000    # 18.0f

    .line 155
    .line 156
    const v14, 0x41368f5c    # 11.41f

    .line 157
    .line 158
    .line 159
    const v15, 0x41726666    # 15.15f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x41100000    # 9.0f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41840000    # 16.5f

    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, -0x40400000    # -1.5f

    .line 176
    .line 177
    const/high16 v18, -0x40400000    # -1.5f

    .line 178
    .line 179
    const v13, -0x40ab851f    # -0.83f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, -0x40400000    # -1.5f

    .line 184
    .line 185
    const v16, -0x40d47ae1    # -0.67f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, -0x40400000    # -1.5f

    .line 192
    .line 193
    const v2, 0x3f2b851f    # 0.67f

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x3f2b851f    # 0.67f

    .line 202
    .line 203
    .line 204
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x414d47ae    # 12.83f

    .line 210
    .line 211
    .line 212
    const/high16 v2, 0x41840000    # 16.5f

    .line 213
    .line 214
    const/high16 v4, 0x41400000    # 12.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x418170a4    # 16.18f

    .line 223
    .line 224
    .line 225
    const v2, 0x40da3d71    # 6.82f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x4059999a    # -1.3f

    .line 232
    .line 233
    .line 234
    const v18, 0x3db851ec    # 0.09f

    .line 235
    .line 236
    .line 237
    const v13, -0x414ccccd    # -0.35f

    .line 238
    .line 239
    .line 240
    const v14, 0x3eb33333    # 0.35f

    .line 241
    .line 242
    .line 243
    const v15, -0x409c28f6    # -0.89f

    .line 244
    .line 245
    .line 246
    const v16, 0x3ec28f5c    # 0.38f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x41400000    # 12.0f

    .line 253
    .line 254
    const/high16 v18, 0x40c00000    # 6.0f

    .line 255
    .line 256
    const v13, 0x41611eb8    # 14.07f

    .line 257
    .line 258
    .line 259
    const v14, 0x40cae148    # 6.34f

    .line 260
    .line 261
    .line 262
    const v15, 0x41511eb8    # 13.07f

    .line 263
    .line 264
    .line 265
    const/high16 v16, 0x40c00000    # 6.0f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x4111eb85    # 9.12f

    .line 271
    .line 272
    .line 273
    const v2, 0x40dd1eb8    # 6.91f

    .line 274
    .line 275
    .line 276
    const v4, 0x411ee148    # 9.93f

    .line 277
    .line 278
    .line 279
    const v6, 0x40cae148    # 6.34f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, -0x4059999a    # -1.3f

    .line 286
    .line 287
    .line 288
    const v18, -0x4247ae14    # -0.09f

    .line 289
    .line 290
    .line 291
    const v13, -0x412e147b    # -0.41f

    .line 292
    .line 293
    .line 294
    const v14, 0x3e8f5c29    # 0.28f

    .line 295
    .line 296
    .line 297
    const v15, -0x408ccccd    # -0.95f

    .line 298
    .line 299
    .line 300
    const v16, 0x3e851eb8    # 0.26f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3db851ec    # 0.09f

    .line 307
    .line 308
    .line 309
    const/high16 v18, -0x40400000    # -1.5f

    .line 310
    .line 311
    const v13, -0x4123d70a    # -0.43f

    .line 312
    .line 313
    .line 314
    const v14, -0x4123d70a    # -0.43f

    .line 315
    .line 316
    .line 317
    const v15, -0x413851ec    # -0.39f

    .line 318
    .line 319
    .line 320
    const v16, -0x406ccccd    # -1.15f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x41400000    # 12.0f

    .line 327
    .line 328
    const/high16 v18, 0x40800000    # 4.0f

    .line 329
    .line 330
    const v13, 0x4110f5c3    # 9.06f

    .line 331
    .line 332
    .line 333
    const v14, 0x408fae14    # 4.49f

    .line 334
    .line 335
    .line 336
    const v15, 0x4127ae14    # 10.48f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x40800000    # 4.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x4082e148    # 4.09f

    .line 345
    .line 346
    .line 347
    const v2, 0x3fa8f5c3    # 1.32f

    .line 348
    .line 349
    .line 350
    const v4, 0x403c28f6    # 2.94f

    .line 351
    .line 352
    .line 353
    const v6, 0x3efae148    # 0.49f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x418170a4    # 16.18f

    .line 360
    .line 361
    .line 362
    const v18, 0x40da3d71    # 6.82f

    .line 363
    .line 364
    .line 365
    const v13, 0x4184a3d7    # 16.58f

    .line 366
    .line 367
    .line 368
    const v14, 0x40b570a4    # 5.67f

    .line 369
    .line 370
    .line 371
    const v15, 0x4184e148    # 16.61f

    .line 372
    .line 373
    .line 374
    const v16, 0x40cc7ae1    # 6.39f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x409f0a3d    # 4.97f

    .line 384
    .line 385
    .line 386
    const v2, 0x407e147b    # 3.97f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, 0x40a1999a    # 5.05f

    .line 393
    .line 394
    .line 395
    const v18, 0x401e147b    # 2.47f

    .line 396
    .line 397
    .line 398
    const v13, 0x4091999a    # 4.55f

    .line 399
    .line 400
    .line 401
    const v14, 0x40628f5c    # 3.54f

    .line 402
    .line 403
    .line 404
    const v15, 0x4092e148    # 4.59f

    .line 405
    .line 406
    .line 407
    const v16, 0x40366666    # 2.85f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x414028f6    # 12.01f

    .line 414
    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const v13, 0x40de6666    # 6.95f

    .line 419
    .line 420
    .line 421
    const v14, 0x3f6e147b    # 0.93f

    .line 422
    .line 423
    .line 424
    const v15, 0x4115eb85    # 9.37f

    .line 425
    .line 426
    .line 427
    const/16 v16, 0x0

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x40de6666    # 6.95f

    .line 433
    .line 434
    .line 435
    const v18, 0x401eb852    # 2.48f

    .line 436
    .line 437
    .line 438
    const v13, 0x4028f5c3    # 2.64f

    .line 439
    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    const v15, 0x40a1eb85    # 5.06f

    .line 443
    .line 444
    .line 445
    const v16, 0x3f6e147b    # 0.93f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3da3d70a    # 0.08f

    .line 452
    .line 453
    .line 454
    const v18, 0x3fbeb852    # 1.49f

    .line 455
    .line 456
    .line 457
    const v13, 0x3eeb851f    # 0.46f

    .line 458
    .line 459
    .line 460
    const v14, 0x3ec28f5c    # 0.38f

    .line 461
    .line 462
    .line 463
    const/high16 v15, 0x3f000000    # 0.5f

    .line 464
    .line 465
    const v16, 0x3f88f5c3    # 1.07f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, -0x40570a3d    # -1.32f

    .line 472
    .line 473
    .line 474
    const v18, 0x3d8f5c29    # 0.07f

    .line 475
    .line 476
    .line 477
    const v13, -0x4147ae14    # -0.36f

    .line 478
    .line 479
    .line 480
    const v14, 0x3eb851ec    # 0.36f

    .line 481
    .line 482
    .line 483
    const v15, -0x4091eb85    # -0.93f

    .line 484
    .line 485
    .line 486
    const v16, 0x3ec7ae14    # 0.39f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x414028f6    # 12.01f

    .line 493
    .line 494
    .line 495
    const/high16 v18, 0x40000000    # 2.0f

    .line 496
    .line 497
    const v13, 0x418147ae    # 16.16f

    .line 498
    .line 499
    .line 500
    const v14, 0x403147ae    # 2.77f

    .line 501
    .line 502
    .line 503
    const v15, 0x4162b852    # 14.17f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x40000000    # 2.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x40c947ae    # 6.29f

    .line 512
    .line 513
    .line 514
    const v18, 0x408147ae    # 4.04f

    .line 515
    .line 516
    .line 517
    const v13, 0x411d47ae    # 9.83f

    .line 518
    .line 519
    .line 520
    const/high16 v14, 0x40000000    # 2.0f

    .line 521
    .line 522
    const v15, 0x40fae148    # 7.84f

    .line 523
    .line 524
    .line 525
    const v16, 0x403147ae    # 2.77f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x409f0a3d    # 4.97f

    .line 532
    .line 533
    .line 534
    const v18, 0x407e147b    # 3.97f

    .line 535
    .line 536
    .line 537
    const v13, 0x40bccccd    # 5.9f

    .line 538
    .line 539
    .line 540
    const v14, 0x408b851f    # 4.36f

    .line 541
    .line 542
    .line 543
    const v15, 0x40aa8f5c    # 5.33f

    .line 544
    .line 545
    .line 546
    const v16, 0x408a3d71    # 4.32f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/16 v16, 0x3800

    .line 560
    .line 561
    const/16 v17, 0x0

    .line 562
    .line 563
    const/high16 v6, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/high16 v8, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v7, 0x0

    .line 568
    const/high16 v9, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v12, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const/4 v14, 0x0

    .line 574
    const/4 v15, 0x0

    .line 575
    const-string v4, ""

    .line 576
    .line 577
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sput-object v0, Landroidx/compose/material/icons/rounded/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 586
    .line 587
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-object v0
.end method
