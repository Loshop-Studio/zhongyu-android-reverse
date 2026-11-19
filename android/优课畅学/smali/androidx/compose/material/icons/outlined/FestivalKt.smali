.class public final Landroidx/compose/material/icons/outlined/FestivalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _festival:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFestival(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Festival"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 83
    .line 84
    const/high16 v18, -0x3f200000    # -7.0f

    .line 85
    .line 86
    const/high16 v13, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const/high16 v14, -0x40000000    # -2.0f

    .line 89
    .line 90
    const/high16 v15, -0x3ed00000    # -11.0f

    .line 91
    .line 92
    const/high16 v16, -0x3f200000    # -7.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x3f800000    # 1.0f

    .line 98
    .line 99
    const/high16 v2, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const/high16 v4, 0x41100000    # 9.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x400f5c29    # 2.24f

    .line 112
    .line 113
    .line 114
    const v18, 0x4050a3d7    # 3.26f

    .line 115
    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const v14, 0x3fbeb852    # 1.49f

    .line 119
    .line 120
    .line 121
    const v15, 0x3f6e147b    # 0.93f

    .line 122
    .line 123
    .line 124
    const/high16 v16, 0x40300000    # 2.75f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x40000000    # 2.0f

    .line 130
    .line 131
    const/high16 v18, 0x41b00000    # 22.0f

    .line 132
    .line 133
    const v13, 0x404ccccd    # 3.2f

    .line 134
    .line 135
    .line 136
    const v14, 0x4186147b    # 16.76f

    .line 137
    .line 138
    .line 139
    const v15, 0x403ae148    # 2.92f

    .line 140
    .line 141
    .line 142
    const v16, 0x419d851f    # 19.69f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x41a00000    # 20.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x406147ae    # -1.24f

    .line 154
    .line 155
    .line 156
    const v18, -0x3f0851ec    # -7.74f

    .line 157
    .line 158
    .line 159
    const v13, -0x40947ae1    # -0.92f

    .line 160
    .line 161
    .line 162
    const v14, -0x3fec28f6    # -2.31f

    .line 163
    .line 164
    .line 165
    const v15, -0x40666666    # -1.2f

    .line 166
    .line 167
    .line 168
    const v16, -0x3f5851ec    # -5.24f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x41b80000    # 23.0f

    .line 175
    .line 176
    const/high16 v18, 0x41300000    # 11.0f

    .line 177
    .line 178
    const v13, 0x41b08f5c    # 22.07f

    .line 179
    .line 180
    .line 181
    const/high16 v14, 0x415c0000    # 13.75f

    .line 182
    .line 183
    const/high16 v15, 0x41b80000    # 23.0f

    .line 184
    .line 185
    const v16, 0x4147d70a    # 12.49f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41400000    # 12.0f

    .line 195
    .line 196
    const v2, 0x4096b852    # 4.71f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x40c3851f    # 6.11f

    .line 203
    .line 204
    .line 205
    const v18, 0x408947ae    # 4.29f

    .line 206
    .line 207
    .line 208
    const v13, 0x3faa3d71    # 1.33f

    .line 209
    .line 210
    .line 211
    const v14, 0x3f91eb85    # 1.14f

    .line 212
    .line 213
    .line 214
    const v15, 0x405f5c29    # 3.49f

    .line 215
    .line 216
    .line 217
    const v16, 0x4035c28f    # 2.84f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x40bc7ae1    # 5.89f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x41400000    # 12.0f

    .line 230
    .line 231
    const v18, 0x4096b852    # 4.71f

    .line 232
    .line 233
    .line 234
    const v13, 0x410828f6    # 8.51f

    .line 235
    .line 236
    .line 237
    const v14, 0x40f1999a    # 7.55f

    .line 238
    .line 239
    .line 240
    const v15, 0x412ab852    # 10.67f

    .line 241
    .line 242
    .line 243
    const v16, 0x40bb3333    # 5.85f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41500000    # 13.0f

    .line 253
    .line 254
    const/high16 v2, 0x41300000    # 11.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40400000    # 3.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, -0x40400000    # -1.5f

    .line 265
    .line 266
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const v14, 0x3f547ae1    # 0.83f

    .line 270
    .line 271
    .line 272
    const v15, -0x40d47ae1    # -0.67f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x413d47ae    # 11.83f

    .line 281
    .line 282
    .line 283
    const/high16 v2, 0x41500000    # 13.0f

    .line 284
    .line 285
    const/high16 v4, 0x41300000    # 11.0f

    .line 286
    .line 287
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41180000    # 9.5f

    .line 294
    .line 295
    const/high16 v2, 0x41480000    # 12.5f

    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x41000000    # 8.0f

    .line 301
    .line 302
    const/high16 v18, 0x41300000    # 11.0f

    .line 303
    .line 304
    const v13, 0x410ab852    # 8.67f

    .line 305
    .line 306
    .line 307
    const/high16 v14, 0x41480000    # 12.5f

    .line 308
    .line 309
    const/high16 v15, 0x41000000    # 8.0f

    .line 310
    .line 311
    const v16, 0x413d47ae    # 11.83f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x40400000    # 3.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x41180000    # 9.5f

    .line 323
    .line 324
    const/high16 v18, 0x41480000    # 12.5f

    .line 325
    .line 326
    const/high16 v13, 0x41300000    # 11.0f

    .line 327
    .line 328
    const v14, 0x413d47ae    # 11.83f

    .line 329
    .line 330
    .line 331
    const v15, 0x412547ae    # 10.33f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x41480000    # 12.5f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40c00000    # 6.0f

    .line 343
    .line 344
    const/high16 v2, 0x41300000    # 11.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, -0x40400000    # -1.5f

    .line 350
    .line 351
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const v14, 0x3f547ae1    # 0.83f

    .line 355
    .line 356
    .line 357
    const v15, -0x40d47ae1    # -0.67f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x413d47ae    # 11.83f

    .line 366
    .line 367
    .line 368
    const/high16 v2, 0x40400000    # 3.0f

    .line 369
    .line 370
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40c00000    # 6.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x40951eb8    # 4.66f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41a00000    # 20.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x3f11eb85    # 0.57f

    .line 390
    .line 391
    .line 392
    const v18, -0x3f4d70a4    # -5.58f

    .line 393
    .line 394
    .line 395
    const v13, 0x3ec7ae14    # 0.39f

    .line 396
    .line 397
    .line 398
    const v14, -0x4011eb85    # -1.86f

    .line 399
    .line 400
    .line 401
    const v15, 0x3f0a3d71    # 0.54f

    .line 402
    .line 403
    .line 404
    const v16, -0x3f8b851f    # -3.82f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3fe147ae    # 1.76f

    .line 411
    .line 412
    .line 413
    const v18, -0x40851eb8    # -0.98f

    .line 414
    .line 415
    .line 416
    const v13, 0x3f2e147b    # 0.68f

    .line 417
    .line 418
    .line 419
    const v14, -0x41e66666    # -0.15f

    .line 420
    .line 421
    .line 422
    const v15, 0x3fa51eb8    # 1.29f

    .line 423
    .line 424
    .line 425
    const v16, -0x41051eb8    # -0.49f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3f59999a    # 0.85f

    .line 432
    .line 433
    .line 434
    const v18, 0x3f1eb852    # 0.62f

    .line 435
    .line 436
    .line 437
    const/high16 v13, 0x3e800000    # 0.25f

    .line 438
    .line 439
    const/high16 v14, 0x3e800000    # 0.25f

    .line 440
    .line 441
    const v15, 0x3f0a3d71    # 0.54f

    .line 442
    .line 443
    .line 444
    const v16, 0x3ee66666    # 0.45f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x40fae148    # -0.52f

    .line 451
    .line 452
    .line 453
    const v18, 0x40bdc28f    # 5.93f

    .line 454
    .line 455
    .line 456
    const v13, -0x42333333    # -0.1f

    .line 457
    .line 458
    .line 459
    const v14, 0x3fef5c29    # 1.87f

    .line 460
    .line 461
    .line 462
    const v15, -0x417ae148    # -0.26f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x40800000    # 4.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x4115999a    # 9.35f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x3ef5c28f    # 0.48f

    .line 483
    .line 484
    .line 485
    const v18, -0x3f4f0a3d    # -5.53f

    .line 486
    .line 487
    .line 488
    const v13, 0x3e75c28f    # 0.24f

    .line 489
    .line 490
    .line 491
    const v14, -0x4015c28f    # -1.83f

    .line 492
    .line 493
    .line 494
    const v15, 0x3ec7ae14    # 0.39f

    .line 495
    .line 496
    .line 497
    const v16, -0x3f8e147b    # -3.78f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x400ae148    # 2.17f

    .line 504
    .line 505
    .line 506
    const v18, -0x407d70a4    # -1.02f

    .line 507
    .line 508
    .line 509
    const v13, 0x3f570a3d    # 0.84f

    .line 510
    .line 511
    .line 512
    const v14, -0x425c28f6    # -0.08f

    .line 513
    .line 514
    .line 515
    const v15, 0x3fce147b    # 1.61f

    .line 516
    .line 517
    .line 518
    const v16, -0x4119999a    # -0.45f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v18, 0x3f828f5c    # 1.02f

    .line 525
    .line 526
    .line 527
    const v13, 0x3f0f5c29    # 0.56f

    .line 528
    .line 529
    .line 530
    const v14, 0x3f11eb85    # 0.57f

    .line 531
    .line 532
    .line 533
    const v15, 0x3fa8f5c3    # 1.32f

    .line 534
    .line 535
    .line 536
    const v16, 0x3f70a3d7    # 0.94f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x3ef5c28f    # 0.48f

    .line 543
    .line 544
    .line 545
    const v18, 0x40b0f5c3    # 5.53f

    .line 546
    .line 547
    .line 548
    const v13, 0x3dcccccd    # 0.1f

    .line 549
    .line 550
    .line 551
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 552
    .line 553
    const v15, 0x3e75c28f    # 0.24f

    .line 554
    .line 555
    .line 556
    const v16, 0x406ccccd    # 3.7f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x41855c29    # 16.67f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, -0x40fae148    # -0.52f

    .line 575
    .line 576
    .line 577
    const v18, -0x3f423d71    # -5.93f

    .line 578
    .line 579
    .line 580
    const v13, -0x4175c28f    # -0.27f

    .line 581
    .line 582
    .line 583
    const v14, -0x4007ae14    # -1.94f

    .line 584
    .line 585
    .line 586
    const v15, -0x4123d70a    # -0.43f

    .line 587
    .line 588
    .line 589
    const v16, -0x3f7dc28f    # -4.07f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, 0x3f59999a    # 0.85f

    .line 596
    .line 597
    .line 598
    const v18, -0x40e147ae    # -0.62f

    .line 599
    .line 600
    .line 601
    const v13, 0x3e9eb852    # 0.31f

    .line 602
    .line 603
    .line 604
    const v14, -0x41d1eb85    # -0.17f

    .line 605
    .line 606
    .line 607
    const v15, 0x3f1c28f6    # 0.61f

    .line 608
    .line 609
    .line 610
    const v16, -0x41428f5c    # -0.37f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, 0x3fe147ae    # 1.76f

    .line 617
    .line 618
    .line 619
    const v18, 0x3f7ae148    # 0.98f

    .line 620
    .line 621
    .line 622
    const v13, 0x3ef0a3d7    # 0.47f

    .line 623
    .line 624
    .line 625
    const v14, 0x3ef5c28f    # 0.48f

    .line 626
    .line 627
    .line 628
    const v15, 0x3f8a3d71    # 1.08f

    .line 629
    .line 630
    .line 631
    const v16, 0x3f547ae1    # 0.83f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x3f11eb85    # 0.57f

    .line 638
    .line 639
    .line 640
    const v18, 0x40b28f5c    # 5.58f

    .line 641
    .line 642
    .line 643
    const v13, 0x3cf5c28f    # 0.03f

    .line 644
    .line 645
    .line 646
    const v14, 0x3fe147ae    # 1.76f

    .line 647
    .line 648
    .line 649
    const v15, 0x3e3851ec    # 0.18f

    .line 650
    .line 651
    .line 652
    const v16, 0x406e147b    # 3.72f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x419c0000    # 19.5f

    .line 665
    .line 666
    const/high16 v2, 0x41480000    # 12.5f

    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, -0x40400000    # -1.5f

    .line 672
    .line 673
    const/high16 v18, -0x40400000    # -1.5f

    .line 674
    .line 675
    const v13, -0x40ab851f    # -0.83f

    .line 676
    .line 677
    .line 678
    const/4 v14, 0x0

    .line 679
    const/high16 v15, -0x40400000    # -1.5f

    .line 680
    .line 681
    const v16, -0x40d47ae1    # -0.67f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x40400000    # 3.0f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x419c0000    # 19.5f

    .line 693
    .line 694
    const/high16 v18, 0x41480000    # 12.5f

    .line 695
    .line 696
    const/high16 v13, 0x41a80000    # 21.0f

    .line 697
    .line 698
    const v14, 0x413d47ae    # 11.83f

    .line 699
    .line 700
    .line 701
    const v15, 0x41a2a3d7    # 20.33f

    .line 702
    .line 703
    .line 704
    const/high16 v16, 0x41480000    # 12.5f

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/high16 v8, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v7, 0x0

    .line 725
    const/high16 v9, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/high16 v12, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/4 v13, 0x0

    .line 730
    const/4 v14, 0x0

    .line 731
    const/4 v15, 0x0

    .line 732
    const-string v4, ""

    .line 733
    .line 734
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    sput-object v0, Landroidx/compose/material/icons/outlined/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    return-object v0
.end method
