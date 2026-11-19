.class public final Landroidx/compose/material/icons/outlined/SettingsSystemDaydreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSystemDaydream(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SettingsSystemDaydream"

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v2, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3f800000    # -4.0f

    .line 83
    .line 84
    const/high16 v18, -0x3f800000    # -4.0f

    .line 85
    .line 86
    const v13, -0x3ff28f5c    # -2.21f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x3f800000    # -4.0f

    .line 91
    .line 92
    const v16, -0x401ae148    # -1.79f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x404e147b    # 3.22f

    .line 99
    .line 100
    .line 101
    const v18, -0x3f851eb8    # -3.92f

    .line 102
    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, -0x4008f5c3    # -1.93f

    .line 106
    .line 107
    .line 108
    const v15, 0x3fae147b    # 1.36f

    .line 109
    .line 110
    .line 111
    const v16, -0x3f9c28f6    # -3.56f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v18, 0x40e00000    # 7.0f

    .line 120
    .line 121
    const v13, 0x4110a3d7    # 9.04f

    .line 122
    .line 123
    .line 124
    const v14, 0x40f9999a    # 7.8f

    .line 125
    .line 126
    .line 127
    const v15, 0x4127851f    # 10.47f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x408851ec    # 4.26f

    .line 136
    .line 137
    .line 138
    const v18, 0x4045c28f    # 3.09f

    .line 139
    .line 140
    .line 141
    const v13, 0x3ff9999a    # 1.95f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const v15, 0x406a3d71    # 3.66f

    .line 146
    .line 147
    .line 148
    const v16, 0x3fa3d70a    # 1.28f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x402f5c29    # 2.74f

    .line 155
    .line 156
    .line 157
    const v18, 0x405a3d71    # 3.41f

    .line 158
    .line 159
    .line 160
    const v13, 0x3fca3d71    # 1.58f

    .line 161
    .line 162
    .line 163
    const v14, 0x3eb851ec    # 0.36f

    .line 164
    .line 165
    .line 166
    const v15, 0x402f5c29    # 2.74f

    .line 167
    .line 168
    .line 169
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 175
    .line 176
    const/high16 v18, 0x40600000    # 3.5f

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const v14, 0x3ff70a3d    # 1.93f

    .line 180
    .line 181
    .line 182
    const v15, -0x40370a3d    # -1.57f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x40600000    # 3.5f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x410bd70a    # 8.74f

    .line 194
    .line 195
    .line 196
    const v2, 0x413051ec    # 11.02f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, 0x40e00000    # 7.0f

    .line 203
    .line 204
    const/high16 v18, 0x41500000    # 13.0f

    .line 205
    .line 206
    const v13, 0x40f7ae14    # 7.74f

    .line 207
    .line 208
    .line 209
    const v14, 0x41326666    # 11.15f

    .line 210
    .line 211
    .line 212
    const/high16 v15, 0x40e00000    # 7.0f

    .line 213
    .line 214
    const v16, 0x413fd70a    # 11.99f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x40000000    # 2.0f

    .line 221
    .line 222
    const/high16 v18, 0x40000000    # 2.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const v14, 0x3f8ccccd    # 1.1f

    .line 226
    .line 227
    .line 228
    const v15, 0x3f666666    # 0.9f

    .line 229
    .line 230
    .line 231
    const/high16 v16, 0x40000000    # 2.0f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x40d00000    # 6.5f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 242
    .line 243
    const/high16 v18, -0x40400000    # -1.5f

    .line 244
    .line 245
    const v13, 0x3f547ae1    # 0.83f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 250
    .line 251
    const v16, -0x40d47ae1    # -0.67f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x40d47ae1    # -0.67f

    .line 258
    .line 259
    .line 260
    const/high16 v2, -0x40400000    # -1.5f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, -0x40a147ae    # -0.87f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, -0x41d1eb85    # -0.17f

    .line 272
    .line 273
    .line 274
    const v2, -0x40a3d70a    # -0.86f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41400000    # 12.0f

    .line 281
    .line 282
    const/high16 v18, 0x41100000    # 9.0f

    .line 283
    .line 284
    const v13, 0x4164a3d7    # 14.29f

    .line 285
    .line 286
    .line 287
    const v14, 0x411eb852    # 9.92f

    .line 288
    .line 289
    .line 290
    const v15, 0x4153ae14    # 13.23f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x41100000    # 9.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x3fef5c29    # -2.26f

    .line 299
    .line 300
    .line 301
    const v18, 0x3fb9999a    # 1.45f

    .line 302
    .line 303
    .line 304
    const v13, -0x408a3d71    # -0.96f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const v15, -0x40147ae1    # -1.84f

    .line 309
    .line 310
    .line 311
    const v16, 0x3f11eb85    # 0.57f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, -0x4175c28f    # -0.27f

    .line 318
    .line 319
    .line 320
    const v2, 0x3f11eb85    # 0.57f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x40c51eb8    # -0.73f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41a80000    # 21.0f

    .line 336
    .line 337
    const/high16 v2, 0x40400000    # 3.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40400000    # 3.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, -0x40000000    # -2.0f

    .line 348
    .line 349
    const/high16 v18, 0x40000000    # 2.0f

    .line 350
    .line 351
    const v13, -0x40733333    # -1.1f

    .line 352
    .line 353
    .line 354
    const/high16 v15, -0x40000000    # -2.0f

    .line 355
    .line 356
    const v16, 0x3f666666    # 0.9f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41600000    # 14.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x40000000    # 2.0f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, 0x3f8ccccd    # 1.1f

    .line 371
    .line 372
    .line 373
    const v15, 0x3f666666    # 0.9f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x40000000    # 2.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41900000    # 18.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v18, -0x40000000    # -2.0f

    .line 387
    .line 388
    const v13, 0x3f8ccccd    # 1.1f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/high16 v15, 0x40000000    # 2.0f

    .line 393
    .line 394
    const v16, -0x4099999a    # -0.9f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41b80000    # 23.0f

    .line 401
    .line 402
    const/high16 v2, 0x40a00000    # 5.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, -0x40000000    # -2.0f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, -0x40733333    # -1.1f

    .line 411
    .line 412
    .line 413
    const v15, -0x4099999a    # -0.9f

    .line 414
    .line 415
    .line 416
    const/high16 v16, -0x40000000    # -2.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4198147b    # 19.01f

    .line 425
    .line 426
    .line 427
    const/high16 v2, 0x41a80000    # 21.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x40400000    # 3.0f

    .line 433
    .line 434
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x409fae14    # 4.99f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x41900000    # 18.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x416051ec    # 14.02f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const/16 v16, 0x3800

    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    const/high16 v6, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v8, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const/high16 v9, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v12, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sput-object v0, Landroidx/compose/material/icons/outlined/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    return-object v0
.end method
