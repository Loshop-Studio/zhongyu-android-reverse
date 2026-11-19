.class public final Landroidx/compose/material/icons/twotone/FindInPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _findInPage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFindInPage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FindInPageKt;->_findInPage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FindInPage"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, 0x4139999a    # 11.6f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x3fc9999a    # -2.85f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v25, -0x3fd00000    # -2.75f

    .line 95
    .line 96
    const v26, 0x3f547ae1    # 0.83f

    .line 97
    .line 98
    .line 99
    const v21, -0x40ab851f    # -0.83f

    .line 100
    .line 101
    .line 102
    const v22, 0x3f0ccccd    # 0.55f

    .line 103
    .line 104
    .line 105
    const v23, -0x401ae148    # -1.79f

    .line 106
    .line 107
    .line 108
    const v24, 0x3f547ae1    # 0.83f

    .line 109
    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, -0x3f9e147b    # -3.53f

    .line 117
    .line 118
    .line 119
    const v26, -0x40451eb8    # -1.46f

    .line 120
    .line 121
    .line 122
    const v21, -0x405c28f6    # -1.28f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const v23, -0x3fdccccd    # -2.55f

    .line 128
    .line 129
    .line 130
    const v24, -0x41051eb8    # -0.49f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v25, 0x0

    .line 137
    .line 138
    const v26, -0x3f1e6666    # -7.05f

    .line 139
    .line 140
    .line 141
    const v21, -0x40066666    # -1.95f

    .line 142
    .line 143
    .line 144
    const v22, -0x40066666    # -1.95f

    .line 145
    .line 146
    .line 147
    const v23, -0x40066666    # -1.95f

    .line 148
    .line 149
    .line 150
    const v24, -0x3f5c7ae1    # -5.11f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, 0x41400000    # 12.0f

    .line 157
    .line 158
    const/high16 v26, 0x41000000    # 8.0f

    .line 159
    .line 160
    const v21, 0x41173333    # 9.45f

    .line 161
    .line 162
    .line 163
    const v22, 0x4107d70a    # 8.49f

    .line 164
    .line 165
    .line 166
    const v23, 0x412b851f    # 10.72f

    .line 167
    .line 168
    .line 169
    const/high16 v24, 0x41000000    # 8.0f

    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, 0x4061eb85    # 3.53f

    .line 175
    .line 176
    .line 177
    const v26, 0x3fbae148    # 1.46f

    .line 178
    .line 179
    .line 180
    const v21, 0x3fa3d70a    # 1.28f

    .line 181
    .line 182
    .line 183
    const/16 v22, 0x0

    .line 184
    .line 185
    const v23, 0x40233333    # 2.55f

    .line 186
    .line 187
    .line 188
    const v24, 0x3efae148    # 0.49f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, 0x3f23d70a    # 0.64f

    .line 195
    .line 196
    .line 197
    const v26, 0x40c8f5c3    # 6.28f

    .line 198
    .line 199
    .line 200
    const v21, 0x3fdae148    # 1.71f

    .line 201
    .line 202
    .line 203
    const v22, 0x3fdae148    # 1.71f

    .line 204
    .line 205
    .line 206
    const v23, 0x3ff5c28f    # 1.92f

    .line 207
    .line 208
    .line 209
    const v24, 0x408ae148    # 4.34f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x418ca3d7    # 17.58f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x41900000    # 18.0f

    .line 219
    .line 220
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x41100000    # 9.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, -0x3f600000    # -5.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40c00000    # 6.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const/16 v16, 0x3800

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const v6, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    const v8, 0x3e99999a    # 0.3f

    .line 253
    .line 254
    .line 255
    const/4 v7, 0x0

    .line 256
    const/high16 v9, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/high16 v12, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const/4 v14, 0x0

    .line 262
    const/4 v15, 0x0

    .line 263
    const-string v4, ""

    .line 264
    .line 265
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 266
    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    const/4 v0, 0x0

    .line 279
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41600000    # 14.0f

    .line 296
    .line 297
    const/high16 v2, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40000000    # 2.0f

    .line 303
    .line 304
    const/high16 v2, 0x40c00000    # 6.0f

    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x400147ae    # -1.99f

    .line 310
    .line 311
    .line 312
    const/high16 v18, 0x40000000    # 2.0f

    .line 313
    .line 314
    const v13, -0x40733333    # -1.1f

    .line 315
    .line 316
    .line 317
    const v15, -0x400147ae    # -1.99f

    .line 318
    .line 319
    .line 320
    const v16, 0x3f666666    # 0.9f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x40800000    # 4.0f

    .line 327
    .line 328
    const/high16 v2, 0x41a00000    # 20.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3ffeb852    # 1.99f

    .line 334
    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, 0x3f8ccccd    # 1.1f

    .line 338
    .line 339
    .line 340
    const v15, 0x3f63d70a    # 0.89f

    .line 341
    .line 342
    .line 343
    const/high16 v16, 0x40000000    # 2.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41b00000    # 22.0f

    .line 349
    .line 350
    const/high16 v2, 0x41900000    # 18.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40000000    # 2.0f

    .line 356
    .line 357
    const/high16 v18, -0x40000000    # -2.0f

    .line 358
    .line 359
    const v13, 0x3f8ccccd    # 1.1f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, 0x40000000    # 2.0f

    .line 364
    .line 365
    const v16, -0x4099999a    # -0.9f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41000000    # 8.0f

    .line 372
    .line 373
    const/high16 v2, 0x41a00000    # 20.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, -0x3f400000    # -6.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x418ca3d7    # 17.58f

    .line 387
    .line 388
    .line 389
    const/high16 v2, 0x41900000    # 18.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, -0x40147ae1    # -1.84f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, -0x40dc28f6    # -0.64f

    .line 401
    .line 402
    .line 403
    const v18, -0x3f370a3d    # -6.28f

    .line 404
    .line 405
    .line 406
    const v13, 0x3fa3d70a    # 1.28f

    .line 407
    .line 408
    .line 409
    const v14, -0x4007ae14    # -1.94f

    .line 410
    .line 411
    .line 412
    const v15, 0x3f88f5c3    # 1.07f

    .line 413
    .line 414
    .line 415
    const v16, -0x3f6dc28f    # -4.57f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41400000    # 12.0f

    .line 422
    .line 423
    const/high16 v18, 0x41000000    # 8.0f

    .line 424
    .line 425
    const v13, 0x4168cccd    # 14.55f

    .line 426
    .line 427
    .line 428
    const v14, 0x4107d70a    # 8.49f

    .line 429
    .line 430
    .line 431
    const v15, 0x41547ae1    # 13.28f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x41000000    # 8.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x3f9e147b    # -3.53f

    .line 440
    .line 441
    .line 442
    const v18, 0x3fbae148    # 1.46f

    .line 443
    .line 444
    .line 445
    const v13, -0x405c28f6    # -1.28f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x3fdccccd    # -2.55f

    .line 450
    .line 451
    .line 452
    const v16, 0x3efae148    # 0.49f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    const v18, 0x40e1999a    # 7.05f

    .line 461
    .line 462
    .line 463
    const v13, -0x40066666    # -1.95f

    .line 464
    .line 465
    .line 466
    const v14, 0x3ff9999a    # 1.95f

    .line 467
    .line 468
    .line 469
    const v15, -0x40066666    # -1.95f

    .line 470
    .line 471
    .line 472
    const v16, 0x40a3851f    # 5.11f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, 0x4061eb85    # 3.53f

    .line 479
    .line 480
    .line 481
    const v18, 0x3fbae148    # 1.46f

    .line 482
    .line 483
    .line 484
    const v13, 0x3f7851ec    # 0.97f

    .line 485
    .line 486
    .line 487
    const v14, 0x3f7851ec    # 0.97f

    .line 488
    .line 489
    .line 490
    const/high16 v15, 0x40100000    # 2.25f

    .line 491
    .line 492
    const v16, 0x3fbae148    # 1.46f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x40300000    # 2.75f

    .line 499
    .line 500
    const v18, -0x40ab851f    # -0.83f

    .line 501
    .line 502
    .line 503
    const v13, 0x3f75c28f    # 0.96f

    .line 504
    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    const v15, 0x3ff5c28f    # 1.92f

    .line 508
    .line 509
    .line 510
    const v16, -0x4170a3d7    # -0.28f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x418ccccd    # 17.6f

    .line 517
    .line 518
    .line 519
    const/high16 v2, 0x41a00000    # 20.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41a00000    # 20.0f

    .line 525
    .line 526
    const/high16 v2, 0x40c00000    # 6.0f

    .line 527
    .line 528
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40800000    # 4.0f

    .line 532
    .line 533
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x40e00000    # 7.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x40a00000    # 5.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x410947ae    # 8.58f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x416fd70a    # 14.99f

    .line 556
    .line 557
    .line 558
    const v2, 0x414fd70a    # 12.99f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x409eb852    # -0.88f

    .line 565
    .line 566
    .line 567
    const v18, 0x40070a3d    # 2.11f

    .line 568
    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const v14, 0x3f4ccccd    # 0.8f

    .line 572
    .line 573
    .line 574
    const v15, -0x416147ae    # -0.31f

    .line 575
    .line 576
    .line 577
    const v16, 0x3fc66666    # 1.55f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x3ff8f5c3    # -2.11f

    .line 584
    .line 585
    .line 586
    const v18, 0x3f6147ae    # 0.88f

    .line 587
    .line 588
    .line 589
    const v13, -0x40f0a3d7    # -0.56f

    .line 590
    .line 591
    .line 592
    const v14, 0x3f0f5c29    # 0.56f

    .line 593
    .line 594
    .line 595
    const v15, -0x405851ec    # -1.31f

    .line 596
    .line 597
    .line 598
    const v16, 0x3f6147ae    # 0.88f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, -0x416147ae    # -0.31f

    .line 605
    .line 606
    .line 607
    const v2, -0x409eb852    # -0.88f

    .line 608
    .line 609
    .line 610
    const v4, -0x3ff8f5c3    # -2.11f

    .line 611
    .line 612
    .line 613
    const v6, -0x4039999a    # -1.55f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, -0x409eb852    # -0.88f

    .line 620
    .line 621
    .line 622
    const v18, -0x3ff8f5c3    # -2.11f

    .line 623
    .line 624
    .line 625
    const v14, -0x40f0a3d7    # -0.56f

    .line 626
    .line 627
    .line 628
    const v15, -0x409eb852    # -0.88f

    .line 629
    .line 630
    .line 631
    const v16, -0x405851ec    # -1.31f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x3f6147ae    # 0.88f

    .line 638
    .line 639
    .line 640
    const v2, 0x3e9eb852    # 0.31f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x41333333    # 11.2f

    .line 647
    .line 648
    .line 649
    const/high16 v2, 0x41400000    # 12.0f

    .line 650
    .line 651
    const/high16 v4, 0x41200000    # 10.0f

    .line 652
    .line 653
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x3fc66666    # 1.55f

    .line 657
    .line 658
    .line 659
    const v2, 0x40070a3d    # 2.11f

    .line 660
    .line 661
    .line 662
    const v4, 0x3f6147ae    # 0.88f

    .line 663
    .line 664
    .line 665
    const v6, 0x3e9eb852    # 0.31f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x3f6147ae    # 0.88f

    .line 672
    .line 673
    .line 674
    const v18, 0x40070a3d    # 2.11f

    .line 675
    .line 676
    .line 677
    const v13, 0x3f11eb85    # 0.57f

    .line 678
    .line 679
    .line 680
    const v14, 0x3f0f5c29    # 0.56f

    .line 681
    .line 682
    .line 683
    const v15, 0x3f6147ae    # 0.88f

    .line 684
    .line 685
    .line 686
    const v16, 0x3fa7ae14    # 1.31f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    const/16 v16, 0x3800

    .line 700
    .line 701
    const/16 v17, 0x0

    .line 702
    .line 703
    const/high16 v6, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/high16 v8, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/4 v7, 0x0

    .line 708
    const/high16 v12, 0x3f800000    # 1.0f

    .line 709
    .line 710
    const/4 v13, 0x0

    .line 711
    const/4 v14, 0x0

    .line 712
    const/4 v15, 0x0

    .line 713
    const-string v4, ""

    .line 714
    .line 715
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    sput-object v0, Landroidx/compose/material/icons/twotone/FindInPageKt;->_findInPage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 724
    .line 725
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    return-object v0
.end method
