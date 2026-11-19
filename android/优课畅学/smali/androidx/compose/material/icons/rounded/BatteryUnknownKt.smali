.class public final Landroidx/compose/material/icons/rounded/BatteryUnknownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBatteryUnknown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BatteryUnknownKt;->_batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BatteryUnknown"

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
    const v0, 0x417ab852    # 15.67f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41600000    # 14.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/high16 v2, 0x41600000    # 14.0f

    .line 86
    .line 87
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v17, -0x40800000    # -1.0f

    .line 91
    .line 92
    const/high16 v18, -0x40800000    # -1.0f

    .line 93
    .line 94
    const/4 v13, 0x0

    .line 95
    const v14, -0x40f33333    # -0.55f

    .line 96
    .line 97
    .line 98
    const v15, -0x4119999a    # -0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v16, -0x40800000    # -1.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v18, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v13, -0x40f33333    # -0.55f

    .line 114
    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    const/high16 v15, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v16, 0x3ee66666    # 0.45f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x3f800000    # 1.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x410547ae    # 8.33f

    .line 131
    .line 132
    .line 133
    const/high16 v2, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x40e00000    # 7.0f

    .line 139
    .line 140
    const v18, 0x40aa8f5c    # 5.33f

    .line 141
    .line 142
    .line 143
    const v13, 0x40f33333    # 7.6f

    .line 144
    .line 145
    .line 146
    const/high16 v14, 0x40800000    # 4.0f

    .line 147
    .line 148
    const/high16 v15, 0x40e00000    # 7.0f

    .line 149
    .line 150
    const v16, 0x40933333    # 4.6f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x417547ae    # 15.33f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x410570a4    # 8.34f

    .line 163
    .line 164
    .line 165
    const/high16 v18, 0x41b00000    # 22.0f

    .line 166
    .line 167
    const/high16 v13, 0x40e00000    # 7.0f

    .line 168
    .line 169
    const v14, 0x41ab3333    # 21.4f

    .line 170
    .line 171
    .line 172
    const v15, 0x40f33333    # 7.6f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x41b00000    # 22.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x40ea3d71    # 7.32f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3fab851f    # 1.34f

    .line 187
    .line 188
    .line 189
    const v18, -0x4055c28f    # -1.33f

    .line 190
    .line 191
    .line 192
    const v13, 0x3f3d70a4    # 0.74f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const v15, 0x3fab851f    # 1.34f

    .line 197
    .line 198
    .line 199
    const v16, -0x40e66666    # -0.6f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41880000    # 17.0f

    .line 206
    .line 207
    const v2, 0x40aa8f5c    # 5.33f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x417ab852    # 15.67f

    .line 214
    .line 215
    .line 216
    const/high16 v18, 0x40800000    # 4.0f

    .line 217
    .line 218
    const/high16 v13, 0x41880000    # 17.0f

    .line 219
    .line 220
    const v14, 0x40933333    # 4.6f

    .line 221
    .line 222
    .line 223
    const v15, 0x41833333    # 16.4f

    .line 224
    .line 225
    .line 226
    const/high16 v16, 0x40800000    # 4.0f

    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41500000    # 13.0f

    .line 235
    .line 236
    const/high16 v2, 0x41900000    # 18.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, -0x40000000    # -2.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x4164cccd    # 14.3f

    .line 261
    .line 262
    .line 263
    const v2, 0x414b0a3d    # 12.69f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x40d47ae1    # -0.67f

    .line 270
    .line 271
    .line 272
    const v2, 0x3f35c28f    # 0.71f

    .line 273
    .line 274
    .line 275
    const v4, -0x413d70a4    # -0.38f

    .line 276
    .line 277
    .line 278
    const v6, 0x3ed70a3d    # 0.42f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x413851ec    # -0.39f

    .line 285
    .line 286
    .line 287
    const v18, 0x3ef0a3d7    # 0.47f

    .line 288
    .line 289
    .line 290
    const v13, -0x41f0a3d7    # -0.14f

    .line 291
    .line 292
    .line 293
    const v14, 0x3e0f5c29    # 0.14f

    .line 294
    .line 295
    .line 296
    const v15, -0x4175c28f    # -0.27f

    .line 297
    .line 298
    .line 299
    const v16, 0x3e9eb852    # 0.31f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x4247ae14    # -0.09f

    .line 306
    .line 307
    .line 308
    const v2, 0x3e19999a    # 0.15f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, -0x41bd70a4    # -0.19f

    .line 315
    .line 316
    .line 317
    const v18, 0x3ebd70a4    # 0.37f

    .line 318
    .line 319
    .line 320
    const v13, -0x425c28f6    # -0.08f

    .line 321
    .line 322
    .line 323
    const v14, 0x3df5c28f    # 0.12f

    .line 324
    .line 325
    .line 326
    const v15, -0x41f0a3d7    # -0.14f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x3e800000    # 0.25f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x41dc28f6    # -0.16f

    .line 335
    .line 336
    .line 337
    const v18, 0x3f1c28f6    # 0.61f

    .line 338
    .line 339
    .line 340
    const v13, -0x4247ae14    # -0.09f

    .line 341
    .line 342
    .line 343
    const v14, 0x3e6147ae    # 0.22f

    .line 344
    .line 345
    .line 346
    const v15, -0x41dc28f6    # -0.16f

    .line 347
    .line 348
    .line 349
    const v16, 0x3edc28f6    # 0.43f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x40333333    # -1.6f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3e947ae1    # 0.29f

    .line 362
    .line 363
    .line 364
    const v18, -0x406f5c29    # -1.13f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x4128f5c3    # -0.42f

    .line 369
    .line 370
    .line 371
    const v15, 0x3df5c28f    # 0.12f

    .line 372
    .line 373
    .line 374
    const v16, -0x40b33333    # -0.8f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3e4ccccd    # 0.2f

    .line 381
    .line 382
    .line 383
    const v18, -0x416147ae    # -0.31f

    .line 384
    .line 385
    .line 386
    const v13, 0x3d75c28f    # 0.06f

    .line 387
    .line 388
    .line 389
    const v14, -0x421eb852    # -0.11f

    .line 390
    .line 391
    .line 392
    const v15, 0x3e051eb8    # 0.13f

    .line 393
    .line 394
    .line 395
    const v16, -0x41a8f5c3    # -0.21f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3dcccccd    # 0.1f

    .line 402
    .line 403
    .line 404
    const v18, -0x41dc28f6    # -0.16f

    .line 405
    .line 406
    .line 407
    const v13, 0x3cf5c28f    # 0.03f

    .line 408
    .line 409
    .line 410
    const v14, -0x42b33333    # -0.05f

    .line 411
    .line 412
    .line 413
    const v15, 0x3d75c28f    # 0.06f

    .line 414
    .line 415
    .line 416
    const v16, -0x421eb852    # -0.11f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x3eae147b    # 0.34f

    .line 423
    .line 424
    .line 425
    const v18, -0x41333333    # -0.4f

    .line 426
    .line 427
    .line 428
    const v13, 0x3de147ae    # 0.11f

    .line 429
    .line 430
    .line 431
    const v14, -0x41f0a3d7    # -0.14f

    .line 432
    .line 433
    .line 434
    const v15, 0x3e6b851f    # 0.23f

    .line 435
    .line 436
    .line 437
    const v16, -0x4170a3d7    # -0.28f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3f6e147b    # 0.93f

    .line 444
    .line 445
    .line 446
    const v2, -0x408f5c29    # -0.94f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3ee147ae    # 0.44f

    .line 453
    .line 454
    .line 455
    const v18, -0x407851ec    # -1.06f

    .line 456
    .line 457
    .line 458
    const v13, 0x3e8a3d71    # 0.27f

    .line 459
    .line 460
    .line 461
    const v14, -0x4175c28f    # -0.27f

    .line 462
    .line 463
    .line 464
    const v15, 0x3ee147ae    # 0.44f

    .line 465
    .line 466
    .line 467
    const v16, -0x40d9999a    # -0.65f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x40400000    # -1.5f

    .line 474
    .line 475
    const/high16 v18, -0x40400000    # -1.5f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, -0x40ab851f    # -0.83f

    .line 479
    .line 480
    .line 481
    const v15, -0x40d47ae1    # -0.67f

    .line 482
    .line 483
    .line 484
    const/high16 v16, -0x40400000    # -1.5f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x404b851f    # -1.41f

    .line 490
    .line 491
    .line 492
    const v18, 0x3f7d70a4    # 0.99f

    .line 493
    .line 494
    .line 495
    const v13, -0x40d9999a    # -0.65f

    .line 496
    .line 497
    .line 498
    const/4 v14, 0x0

    .line 499
    const v15, -0x40651eb8    # -1.21f

    .line 500
    .line 501
    .line 502
    const v16, 0x3ed1eb85    # 0.41f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, -0x40ca3d71    # -0.71f

    .line 509
    .line 510
    .line 511
    const v18, 0x3f028f5c    # 0.51f

    .line 512
    .line 513
    .line 514
    const v13, -0x421eb852    # -0.11f

    .line 515
    .line 516
    .line 517
    const v14, 0x3e9eb852    # 0.31f

    .line 518
    .line 519
    .line 520
    const v15, -0x413851ec    # -0.39f

    .line 521
    .line 522
    .line 523
    const v16, 0x3f028f5c    # 0.51f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v18, -0x407eb852    # -1.01f

    .line 530
    .line 531
    .line 532
    const v13, -0x40fae148    # -0.52f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const v15, -0x409eb852    # -0.88f

    .line 537
    .line 538
    .line 539
    const v16, -0x40fae148    # -0.52f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x41400000    # 12.0f

    .line 546
    .line 547
    const/high16 v18, 0x41000000    # 8.0f

    .line 548
    .line 549
    const v13, 0x411970a4    # 9.59f

    .line 550
    .line 551
    .line 552
    const v14, 0x410d47ae    # 8.83f

    .line 553
    .line 554
    .line 555
    const v15, 0x412b0a3d    # 10.69f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x41000000    # 8.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x40400000    # 3.0f

    .line 564
    .line 565
    const/high16 v18, 0x40400000    # 3.0f

    .line 566
    .line 567
    const v13, 0x3fd47ae1    # 1.66f

    .line 568
    .line 569
    .line 570
    const/4 v14, 0x0

    .line 571
    const/high16 v15, 0x40400000    # 3.0f

    .line 572
    .line 573
    const v16, 0x3fab851f    # 1.34f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, -0x40cccccd    # -0.7f

    .line 580
    .line 581
    .line 582
    const v18, 0x3fd851ec    # 1.69f

    .line 583
    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const v14, 0x3f28f5c3    # 0.66f

    .line 587
    .line 588
    .line 589
    const v15, -0x4175c28f    # -0.27f

    .line 590
    .line 591
    .line 592
    const v16, 0x3fa147ae    # 1.26f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const/16 v16, 0x3800

    .line 606
    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    const/high16 v6, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/high16 v8, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/4 v7, 0x0

    .line 614
    const/high16 v9, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/high16 v12, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v14, 0x0

    .line 619
    const/4 v15, 0x0

    .line 620
    const-string v4, ""

    .line 621
    .line 622
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    sput-object v0, Landroidx/compose/material/icons/rounded/BatteryUnknownKt;->_batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    return-object v0
.end method

.method public static synthetic getBatteryUnknown$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method
