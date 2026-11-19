.class public final Landroidx/compose/material/icons/sharp/CrisisAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrisisAlert(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/CrisisAlertKt;->_crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.CrisisAlert"

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
    const/high16 v0, 0x40200000    # 2.5f

    .line 71
    .line 72
    const/high16 v2, 0x41680000    # 14.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x4067ae14    # -1.19f

    .line 78
    .line 79
    .line 80
    const v18, 0x40a147ae    # 5.04f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, 0x3f87ae14    # 1.06f

    .line 85
    .line 86
    .line 87
    const/high16 v15, -0x40c00000    # -0.75f

    .line 88
    .line 89
    const v16, 0x4068f5c3    # 3.64f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, 0x41400000    # 12.0f

    .line 96
    .line 97
    const/high16 v18, 0x41080000    # 8.5f

    .line 98
    .line 99
    const v13, 0x4152147b    # 13.13f

    .line 100
    .line 101
    .line 102
    const v14, 0x4101c28f    # 8.11f

    .line 103
    .line 104
    .line 105
    const v15, 0x4149999a    # 12.6f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x41080000    # 8.5f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x405851ec    # -1.31f

    .line 118
    .line 119
    .line 120
    const v18, -0x408a3d71    # -0.96f

    .line 121
    .line 122
    .line 123
    const v13, -0x40e66666    # -0.6f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x406f5c29    # -1.13f

    .line 128
    .line 129
    .line 130
    const v16, -0x413851ec    # -0.39f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x41180000    # 9.5f

    .line 137
    .line 138
    const/high16 v18, 0x40200000    # 2.5f

    .line 139
    .line 140
    const/high16 v13, 0x41240000    # 10.25f

    .line 141
    .line 142
    const v14, 0x40c47ae1    # 6.14f

    .line 143
    .line 144
    .line 145
    const/high16 v15, 0x41180000    # 9.5f

    .line 146
    .line 147
    const v16, 0x4063d70a    # 3.56f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x41400000    # 12.0f

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const/high16 v13, 0x41180000    # 9.5f

    .line 158
    .line 159
    const v14, 0x3f8f5c29    # 1.12f

    .line 160
    .line 161
    .line 162
    const v15, 0x4129eb85    # 10.62f

    .line 163
    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x3f8f5c29    # 1.12f

    .line 171
    .line 172
    .line 173
    const/high16 v2, 0x40200000    # 2.5f

    .line 174
    .line 175
    const/high16 v4, 0x41680000    # 14.5f

    .line 176
    .line 177
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x41200000    # 10.0f

    .line 184
    .line 185
    const/high16 v2, 0x41400000    # 12.0f

    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, -0x40000000    # -2.0f

    .line 191
    .line 192
    const/high16 v18, 0x40000000    # 2.0f

    .line 193
    .line 194
    const v13, -0x40733333    # -1.1f

    .line 195
    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const/high16 v15, -0x40000000    # -2.0f

    .line 199
    .line 200
    const v16, 0x3f666666    # 0.9f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x3f666666    # 0.9f

    .line 207
    .line 208
    .line 209
    const/high16 v2, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, -0x4099999a    # -0.9f

    .line 215
    .line 216
    .line 217
    const/high16 v2, -0x40000000    # -2.0f

    .line 218
    .line 219
    const/high16 v4, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x4151999a    # 13.1f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x41200000    # 10.0f

    .line 228
    .line 229
    const/high16 v4, 0x41400000    # 12.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x4180a3d7    # 16.08f

    .line 238
    .line 239
    .line 240
    const v2, 0x40a3851f    # 5.11f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x3ec7ae14    # 0.39f

    .line 247
    .line 248
    .line 249
    const v18, -0x3ffc28f6    # -2.06f

    .line 250
    .line 251
    .line 252
    const v13, 0x3e3851ec    # 0.18f

    .line 253
    .line 254
    .line 255
    const/high16 v14, -0x40c00000    # -0.75f

    .line 256
    .line 257
    const v15, 0x3ea8f5c3    # 0.33f

    .line 258
    .line 259
    .line 260
    const v16, -0x4043d70a    # -1.47f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x41b00000    # 22.0f

    .line 267
    .line 268
    const/high16 v18, 0x41400000    # 12.0f

    .line 269
    .line 270
    const/high16 v13, 0x419e0000    # 19.75f

    .line 271
    .line 272
    const v14, 0x4096147b    # 4.69f

    .line 273
    .line 274
    .line 275
    const/high16 v15, 0x41b00000    # 22.0f

    .line 276
    .line 277
    const v16, 0x410147ae    # 8.08f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 284
    .line 285
    const/high16 v18, 0x41200000    # 10.0f

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, 0x40b0a3d7    # 5.52f

    .line 289
    .line 290
    .line 291
    const v15, -0x3f70a3d7    # -4.48f

    .line 292
    .line 293
    .line 294
    const/high16 v16, 0x41200000    # 10.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x418c28f6    # 17.52f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x41400000    # 12.0f

    .line 303
    .line 304
    const/high16 v4, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x40b0f5c3    # 5.53f

    .line 310
    .line 311
    .line 312
    const v18, -0x3ef0cccd    # -8.95f

    .line 313
    .line 314
    .line 315
    const v14, -0x3f851eb8    # -3.92f

    .line 316
    .line 317
    .line 318
    const/high16 v15, 0x40100000    # 2.25f

    .line 319
    .line 320
    const v16, -0x3f16147b    # -7.31f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x40fd70a4    # 7.92f

    .line 327
    .line 328
    .line 329
    const v18, 0x40a3851f    # 5.11f

    .line 330
    .line 331
    .line 332
    const v13, 0x40f33333    # 7.6f

    .line 333
    .line 334
    .line 335
    const v14, 0x4068f5c3    # 3.64f

    .line 336
    .line 337
    .line 338
    const v15, 0x40f7ae14    # 7.74f

    .line 339
    .line 340
    .line 341
    const v16, 0x408bd70a    # 4.37f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x40800000    # 4.0f

    .line 348
    .line 349
    const/high16 v18, 0x41400000    # 12.0f

    .line 350
    .line 351
    const v13, 0x40b28f5c    # 5.58f

    .line 352
    .line 353
    .line 354
    const v14, 0x40d051ec    # 6.51f

    .line 355
    .line 356
    .line 357
    const/high16 v15, 0x40800000    # 4.0f

    .line 358
    .line 359
    const v16, 0x41111eb8    # 9.07f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x41000000    # 8.0f

    .line 366
    .line 367
    const/high16 v18, 0x41000000    # 8.0f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, 0x408d70a4    # 4.42f

    .line 371
    .line 372
    .line 373
    const v15, 0x40651eb8    # 3.58f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x41000000    # 8.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x3f9ae148    # -3.58f

    .line 382
    .line 383
    .line 384
    const/high16 v2, -0x3f000000    # -8.0f

    .line 385
    .line 386
    const/high16 v4, 0x41000000    # 8.0f

    .line 387
    .line 388
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x4180a3d7    # 16.08f

    .line 392
    .line 393
    .line 394
    const v18, 0x40a3851f    # 5.11f

    .line 395
    .line 396
    .line 397
    const/high16 v13, 0x41a00000    # 20.0f

    .line 398
    .line 399
    const v14, 0x41111eb8    # 9.07f

    .line 400
    .line 401
    .line 402
    const v15, 0x41935c29    # 18.42f

    .line 403
    .line 404
    .line 405
    const v16, 0x40d051ec    # 6.51f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41900000    # 18.0f

    .line 415
    .line 416
    const/high16 v2, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x3f400000    # -6.0f

    .line 422
    .line 423
    const/high16 v18, 0x40c00000    # 6.0f

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const v14, 0x4053d70a    # 3.31f

    .line 427
    .line 428
    .line 429
    const v15, -0x3fd3d70a    # -2.69f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x40c00000    # 6.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3fd3d70a    # -2.69f

    .line 438
    .line 439
    .line 440
    const/high16 v2, -0x3f400000    # -6.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x401eb852    # 2.48f

    .line 446
    .line 447
    .line 448
    const v18, -0x3f647ae1    # -4.86f

    .line 449
    .line 450
    .line 451
    const/high16 v14, -0x40000000    # -2.0f

    .line 452
    .line 453
    const v15, 0x3f7ae148    # 0.98f

    .line 454
    .line 455
    .line 456
    const v16, -0x3f8eb852    # -3.77f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3f266666    # 0.65f

    .line 463
    .line 464
    .line 465
    const v18, 0x40047ae1    # 2.07f

    .line 466
    .line 467
    .line 468
    const v13, 0x3e6b851f    # 0.23f

    .line 469
    .line 470
    .line 471
    const v14, 0x3f4f5c29    # 0.81f

    .line 472
    .line 473
    .line 474
    const v15, 0x3f266666    # 0.65f

    .line 475
    .line 476
    .line 477
    const v16, 0x40047ae1    # 2.07f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x41000000    # 8.0f

    .line 484
    .line 485
    const/high16 v18, 0x41400000    # 12.0f

    .line 486
    .line 487
    const v13, 0x4106e148    # 8.43f

    .line 488
    .line 489
    .line 490
    const v14, 0x411ee148    # 9.93f

    .line 491
    .line 492
    .line 493
    const/high16 v15, 0x41000000    # 8.0f

    .line 494
    .line 495
    const v16, 0x412eb852    # 10.92f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, 0x40800000    # 4.0f

    .line 502
    .line 503
    const/high16 v18, 0x40800000    # 4.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const v14, 0x400d70a4    # 2.21f

    .line 507
    .line 508
    .line 509
    const v15, 0x3fe51eb8    # 1.79f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x40800000    # 4.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x401ae148    # -1.79f

    .line 518
    .line 519
    .line 520
    const/high16 v2, -0x3f800000    # -4.0f

    .line 521
    .line 522
    const/high16 v4, 0x40800000    # 4.0f

    .line 523
    .line 524
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, -0x406f5c29    # -1.13f

    .line 528
    .line 529
    .line 530
    const v18, -0x3fcd70a4    # -2.79f

    .line 531
    .line 532
    .line 533
    const v14, -0x4075c28f    # -1.08f

    .line 534
    .line 535
    .line 536
    const v15, -0x4123d70a    # -0.43f

    .line 537
    .line 538
    .line 539
    const v16, -0x3ffb851f    # -2.07f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x3f266666    # 0.65f

    .line 546
    .line 547
    .line 548
    const v18, -0x3ffb851f    # -2.07f

    .line 549
    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    const v15, 0x3ed1eb85    # 0.41f

    .line 553
    .line 554
    .line 555
    const v16, -0x4063d70a    # -1.22f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x41900000    # 18.0f

    .line 562
    .line 563
    const/high16 v18, 0x41400000    # 12.0f

    .line 564
    .line 565
    const v13, 0x418828f6    # 17.02f

    .line 566
    .line 567
    .line 568
    const v14, 0x4103ae14    # 8.23f

    .line 569
    .line 570
    .line 571
    const/high16 v15, 0x41900000    # 18.0f

    .line 572
    .line 573
    const/high16 v16, 0x41200000    # 10.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/16 v16, 0x3800

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v8, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v9, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v12, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/sharp/CrisisAlertKt;->_crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
