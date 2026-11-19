.class public final Landroidx/compose/material/icons/filled/ScreenLockRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenLockRotation(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ScreenLockRotationKt;->_screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ScreenLockRotation"

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
    const/high16 v0, 0x41ba0000    # 23.25f

    .line 71
    .line 72
    const v2, 0x414c51ec    # 12.77f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3fdb851f    # -2.57f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, 0x3fb47ae1    # 1.41f

    .line 85
    .line 86
    .line 87
    const v2, -0x404b851f    # -1.41f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x400e147b    # 2.22f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x40b51eb8    # 5.66f

    .line 100
    .line 101
    .line 102
    const v2, -0x3f4ae148    # -5.66f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x409051ec    # 4.51f

    .line 109
    .line 110
    .line 111
    const v2, 0x4102b852    # 8.17f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x40b51eb8    # 5.66f

    .line 118
    .line 119
    .line 120
    const v2, -0x3f4ae148    # -5.66f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x40066666    # 2.1f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x3fb47ae1    # 1.41f

    .line 133
    .line 134
    .line 135
    const v2, -0x404b851f    # -1.41f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x4133ae14    # 11.23f

    .line 142
    .line 143
    .line 144
    const/high16 v2, 0x3f400000    # 0.75f

    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x3ff851ec    # -2.12f

    .line 150
    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const v13, -0x40e8f5c3    # -0.59f

    .line 155
    .line 156
    .line 157
    const v14, -0x40e8f5c3    # -0.59f

    .line 158
    .line 159
    .line 160
    const v15, -0x403ae148    # -1.54f

    .line 161
    .line 162
    .line 163
    const v16, -0x40e8f5c3    # -0.59f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x40300000    # 2.75f

    .line 170
    .line 171
    const v2, 0x40e3851f    # 7.11f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const v18, 0x4007ae14    # 2.12f

    .line 180
    .line 181
    .line 182
    const v14, 0x3f170a3d    # 0.59f

    .line 183
    .line 184
    .line 185
    const v15, -0x40e8f5c3    # -0.59f

    .line 186
    .line 187
    .line 188
    const v16, 0x3fc51eb8    # 1.54f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x414051ec    # 12.02f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x4007ae14    # 2.12f

    .line 201
    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const v13, 0x3f170a3d    # 0.59f

    .line 206
    .line 207
    .line 208
    const v15, 0x3fc51eb8    # 1.54f

    .line 209
    .line 210
    .line 211
    const v16, 0x3f170a3d    # 0.59f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40cb851f    # 6.36f

    .line 218
    .line 219
    .line 220
    const v2, -0x3f347ae1    # -6.36f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const v18, -0x3ff851ec    # -2.12f

    .line 229
    .line 230
    .line 231
    const v14, -0x40e8f5c3    # -0.59f

    .line 232
    .line 233
    .line 234
    const v15, 0x3f170a3d    # 0.59f

    .line 235
    .line 236
    .line 237
    const v16, -0x403ae148    # -1.54f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x4107851f    # 8.47f

    .line 247
    .line 248
    .line 249
    const v2, 0x41a3d70a    # 20.48f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x40200000    # 2.5f

    .line 256
    .line 257
    const/high16 v18, 0x41400000    # 12.0f

    .line 258
    .line 259
    const v13, 0x40a66666    # 5.2f

    .line 260
    .line 261
    .line 262
    const v14, 0x4197851f    # 18.94f

    .line 263
    .line 264
    .line 265
    const v15, 0x40370a3d    # 2.86f

    .line 266
    .line 267
    .line 268
    const v16, 0x417c28f6    # 15.76f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v2, 0x41400000    # 12.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x413f3333    # 11.95f

    .line 282
    .line 283
    .line 284
    const/high16 v18, 0x41300000    # 11.0f

    .line 285
    .line 286
    const v13, 0x3f028f5c    # 0.51f

    .line 287
    .line 288
    .line 289
    const v14, 0x40c51eb8    # 6.16f

    .line 290
    .line 291
    .line 292
    const v15, 0x40b51eb8    # 5.66f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x41300000    # 11.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x3f28f5c3    # 0.66f

    .line 301
    .line 302
    .line 303
    const v2, -0x430a3d71    # -0.03f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x3f8c28f6    # -3.81f

    .line 310
    .line 311
    .line 312
    const v2, -0x3f8b851f    # -3.82f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, -0x4055c28f    # -1.33f

    .line 319
    .line 320
    .line 321
    const v2, 0x3faa3d71    # 1.33f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41100000    # 9.0f

    .line 331
    .line 332
    const/high16 v2, 0x41800000    # 16.0f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x40a00000    # 5.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/high16 v18, -0x40800000    # -1.0f

    .line 345
    .line 346
    const v13, 0x3f0ccccd    # 0.55f

    .line 347
    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const/high16 v15, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const v16, -0x4119999a    # -0.45f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41b00000    # 22.0f

    .line 359
    .line 360
    const/high16 v2, 0x40800000    # 4.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, -0x40800000    # -1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x40f33333    # -0.55f

    .line 369
    .line 370
    .line 371
    const v15, -0x4119999a    # -0.45f

    .line 372
    .line 373
    .line 374
    const/high16 v16, -0x40800000    # -1.0f

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, -0x41000000    # -0.5f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x41940000    # 18.5f

    .line 385
    .line 386
    const/16 v18, 0x0

    .line 387
    .line 388
    const/high16 v13, 0x41a80000    # 21.0f

    .line 389
    .line 390
    const v14, 0x3f8f5c29    # 1.12f

    .line 391
    .line 392
    .line 393
    const v15, 0x419f0a3d    # 19.88f

    .line 394
    .line 395
    .line 396
    const/16 v16, 0x0

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x3f8f5c29    # 1.12f

    .line 402
    .line 403
    .line 404
    const/high16 v2, 0x40200000    # 2.5f

    .line 405
    .line 406
    const/high16 v4, 0x41800000    # 16.0f

    .line 407
    .line 408
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x40400000    # 3.0f

    .line 412
    .line 413
    const/high16 v2, 0x41800000    # 16.0f

    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, -0x40800000    # -1.0f

    .line 419
    .line 420
    const/high16 v18, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const v13, -0x40f33333    # -0.55f

    .line 423
    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const/high16 v15, -0x40800000    # -1.0f

    .line 427
    .line 428
    const v16, 0x3ee66666    # 0.45f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40800000    # 4.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, 0x3f0ccccd    # 0.55f

    .line 443
    .line 444
    .line 445
    const v15, 0x3ee66666    # 0.45f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x3f800000    # 1.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x41866666    # 16.8f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x40200000    # 2.5f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x3fd9999a    # 1.7f

    .line 465
    .line 466
    .line 467
    const v18, -0x40266666    # -1.7f

    .line 468
    .line 469
    .line 470
    const v14, -0x408f5c29    # -0.94f

    .line 471
    .line 472
    .line 473
    const v15, 0x3f428f5c    # 0.76f

    .line 474
    .line 475
    .line 476
    const v16, -0x40266666    # -1.7f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3f428f5c    # 0.76f

    .line 483
    .line 484
    .line 485
    const v2, 0x3fd9999a    # 1.7f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x41a1999a    # 20.2f

    .line 492
    .line 493
    .line 494
    const/high16 v2, 0x40400000    # 3.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x3fa66666    # -3.4f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, -0x41000000    # -0.5f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const/16 v16, 0x3800

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const/high16 v6, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v8, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v7, 0x0

    .line 526
    const/high16 v9, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/high16 v12, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    sput-object v0, Landroidx/compose/material/icons/filled/ScreenLockRotationKt;->_screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    return-object v0
.end method
