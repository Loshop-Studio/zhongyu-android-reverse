.class public final Landroidx/compose/material/icons/twotone/HouseboatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHouseboat(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HouseboatKt;->_houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Houseboat"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, -0x40000000    # -2.0f

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x40000000    # 2.0f

    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, -0x40000000    # -2.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3f65c28f    # -4.82f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x3ff33333    # -2.2f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x40400000    # 3.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, 0x400ccccd    # 2.2f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x409a3d71    # 4.82f

    .line 115
    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/16 v16, 0x3800

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const v6, 0x3e99999a    # 0.3f

    .line 133
    .line 134
    .line 135
    const v8, 0x3e99999a    # 0.3f

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/high16 v9, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-string v4, ""

    .line 147
    .line 148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41800000    # 16.0f

    .line 179
    .line 180
    const/high16 v2, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, -0x3faa3d71    # -3.34f

    .line 186
    .line 187
    .line 188
    const/high16 v18, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const v13, -0x40066666    # -1.95f

    .line 191
    .line 192
    .line 193
    const v15, -0x3ff9999a    # -2.1f

    .line 194
    .line 195
    .line 196
    const/high16 v16, 0x3f800000    # 1.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x3faae148    # -3.33f

    .line 202
    .line 203
    .line 204
    const/high16 v18, -0x40800000    # -1.0f

    .line 205
    .line 206
    const v13, -0x4067ae14    # -1.19f

    .line 207
    .line 208
    .line 209
    const v15, -0x404a3d71    # -1.42f

    .line 210
    .line 211
    .line 212
    const/high16 v16, -0x40800000    # -1.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/high16 v18, 0x41880000    # 17.0f

    .line 220
    .line 221
    const v13, 0x405851ec    # 3.38f

    .line 222
    .line 223
    .line 224
    const/high16 v14, 0x41800000    # 16.0f

    .line 225
    .line 226
    const v15, 0x404f5c29    # 3.24f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x41880000    # 17.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40000000    # 2.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x40566666    # 3.35f

    .line 240
    .line 241
    .line 242
    const/high16 v18, -0x40800000    # -1.0f

    .line 243
    .line 244
    const v13, 0x3ff33333    # 1.9f

    .line 245
    .line 246
    .line 247
    const/4 v14, 0x0

    .line 248
    const v15, 0x400ae148    # 2.17f

    .line 249
    .line 250
    .line 251
    const/high16 v16, -0x40800000    # -1.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x40551eb8    # 3.33f

    .line 257
    .line 258
    .line 259
    const/high16 v18, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const v13, 0x3f9851ec    # 1.19f

    .line 262
    .line 263
    .line 264
    const v15, 0x3fb5c28f    # 1.42f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x3f800000    # 1.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x40547ae1    # 3.32f

    .line 273
    .line 274
    .line 275
    const/high16 v18, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v13, 0x3ff9999a    # 1.95f

    .line 278
    .line 279
    .line 280
    const v15, 0x40051eb8    # 2.08f

    .line 281
    .line 282
    .line 283
    const/high16 v16, -0x40800000    # -1.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40547ae1    # 3.32f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const v4, 0x3faf5c29    # 1.37f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x40551eb8    # 3.33f

    .line 300
    .line 301
    .line 302
    const v13, 0x3ff47ae1    # 1.91f

    .line 303
    .line 304
    .line 305
    const v15, 0x4008f5c3    # 2.14f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x40566666    # 3.35f

    .line 312
    .line 313
    .line 314
    const/high16 v18, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const v13, 0x3f970a3d    # 1.18f

    .line 317
    .line 318
    .line 319
    const v15, 0x3fb9999a    # 1.45f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x3f800000    # 1.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, -0x40000000    # -2.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x3faae148    # -3.33f

    .line 333
    .line 334
    .line 335
    const/high16 v18, -0x40800000    # -1.0f

    .line 336
    .line 337
    const v13, -0x406147ae    # -1.24f

    .line 338
    .line 339
    .line 340
    const v15, -0x404f5c29    # -1.38f

    .line 341
    .line 342
    .line 343
    const/high16 v16, -0x40800000    # -1.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v18, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const v13, -0x400b851f    # -1.91f

    .line 351
    .line 352
    .line 353
    const v15, -0x3ff70a3d    # -2.14f

    .line 354
    .line 355
    .line 356
    const/high16 v16, 0x3f800000    # 1.0f

    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x41400000    # 12.0f

    .line 362
    .line 363
    const/high16 v18, 0x41800000    # 16.0f

    .line 364
    .line 365
    const v13, 0x4161999a    # 14.1f

    .line 366
    .line 367
    .line 368
    const/high16 v14, 0x41880000    # 17.0f

    .line 369
    .line 370
    const v15, 0x415f3333    # 13.95f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x41800000    # 16.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x413570a4    # 11.34f

    .line 382
    .line 383
    .line 384
    const v2, 0x41a2b852    # 20.34f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x4050a3d7    # -1.37f

    .line 391
    .line 392
    .line 393
    const v2, 0x3faf5c29    # 1.37f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x4192147b    # 18.26f

    .line 400
    .line 401
    .line 402
    const/high16 v18, 0x41500000    # 13.0f

    .line 403
    .line 404
    const v13, 0x41963d71    # 18.78f

    .line 405
    .line 406
    .line 407
    const v14, 0x414e3d71    # 12.89f

    .line 408
    .line 409
    .line 410
    const v15, 0x419428f6    # 18.52f

    .line 411
    .line 412
    .line 413
    const/high16 v16, 0x41500000    # 13.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x41880000    # 17.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x411a6666    # 9.65f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3fa8f5c3    # 1.32f

    .line 430
    .line 431
    .line 432
    const v2, 0x3f7851ec    # 0.97f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x419c0000    # 19.5f

    .line 439
    .line 440
    const/high16 v2, 0x41100000    # 9.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40600000    # 3.5f

    .line 446
    .line 447
    const/high16 v2, 0x41400000    # 12.0f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x40900000    # 4.5f

    .line 453
    .line 454
    const/high16 v2, 0x41100000    # 9.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x3f970a3d    # 1.18f

    .line 460
    .line 461
    .line 462
    const v2, 0x3fce147b    # 1.61f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x40e00000    # 7.0f

    .line 469
    .line 470
    const v2, 0x411a6666    # 9.65f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41500000    # 13.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40b7ae14    # 5.74f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x40ca3d71    # -0.71f

    .line 488
    .line 489
    .line 490
    const v18, -0x416b851f    # -0.29f

    .line 491
    .line 492
    .line 493
    const v13, -0x4175c28f    # -0.27f

    .line 494
    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const v15, -0x40fae148    # -0.52f

    .line 498
    .line 499
    .line 500
    const v16, -0x421eb852    # -0.11f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x4050a3d7    # -1.37f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, -0x404b851f    # -1.41f

    .line 513
    .line 514
    .line 515
    const v2, 0x3fb47ae1    # 1.41f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3faf5c29    # 1.37f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x40b7ae14    # 5.74f

    .line 528
    .line 529
    .line 530
    const/high16 v18, 0x41700000    # 15.0f

    .line 531
    .line 532
    const v13, 0x4085c28f    # 4.18f

    .line 533
    .line 534
    .line 535
    const v14, 0x416ae148    # 14.68f

    .line 536
    .line 537
    .line 538
    const v15, 0x409e6666    # 4.95f

    .line 539
    .line 540
    .line 541
    const/high16 v16, 0x41700000    # 15.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x414828f6    # 12.51f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x4007ae14    # 2.12f

    .line 553
    .line 554
    .line 555
    const v18, -0x409eb852    # -0.88f

    .line 556
    .line 557
    .line 558
    const v13, 0x3f4ccccd    # 0.8f

    .line 559
    .line 560
    .line 561
    const/4 v14, 0x0

    .line 562
    const v15, 0x3fc7ae14    # 1.56f

    .line 563
    .line 564
    .line 565
    const v16, -0x415c28f6    # -0.32f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x4050a3d7    # -1.37f

    .line 572
    .line 573
    .line 574
    const v2, 0x3faf5c29    # 1.37f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x413570a4    # 11.34f

    .line 581
    .line 582
    .line 583
    const v2, 0x41a2b852    # 20.34f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41500000    # 13.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, -0x40000000    # -2.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x40000000    # 2.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41100000    # 9.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, 0x4102e148    # 8.18f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, -0x3ff33333    # -2.2f

    .line 622
    .line 623
    .line 624
    const/high16 v2, 0x40400000    # 3.0f

    .line 625
    .line 626
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x400ccccd    # 2.2f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v0, 0x41500000    # 13.0f

    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const/16 v16, 0x3800

    .line 651
    .line 652
    const/16 v17, 0x0

    .line 653
    .line 654
    const/high16 v6, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v8, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    const/high16 v12, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    const/4 v15, 0x0

    .line 663
    const-string v4, ""

    .line 664
    .line 665
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    sput-object v0, Landroidx/compose/material/icons/twotone/HouseboatKt;->_houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 674
    .line 675
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    return-object v0
.end method
