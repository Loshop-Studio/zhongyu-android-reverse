.class public final Landroidx/compose/material/icons/filled/SouthAmericaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSouthAmerica(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SouthAmericaKt;->_southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SouthAmerica"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41200000    # 10.0f

    .line 95
    .line 96
    const/high16 v18, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x40b0a3d7    # 5.52f

    .line 100
    .line 101
    .line 102
    const v15, 0x408f5c29    # 4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v16, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, -0x3f70a3d7    # -4.48f

    .line 111
    .line 112
    .line 113
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 114
    .line 115
    const/high16 v4, 0x41200000    # 10.0f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v18, 0x40000000    # 2.0f

    .line 123
    .line 124
    const/high16 v13, 0x41b00000    # 22.0f

    .line 125
    .line 126
    const v14, 0x40cf5c29    # 6.48f

    .line 127
    .line 128
    .line 129
    const v15, 0x418c28f6    # 17.52f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x40800000    # 4.0f

    .line 141
    .line 142
    const/high16 v2, 0x41400000    # 12.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x3fef5c29    # 1.87f

    .line 148
    .line 149
    .line 150
    const v18, -0x3f5bd70a    # -5.13f

    .line 151
    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const v14, -0x40066666    # -1.95f

    .line 155
    .line 156
    .line 157
    const v15, 0x3f333333    # 0.7f

    .line 158
    .line 159
    .line 160
    const v16, -0x3f90a3d7    # -3.74f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41100000    # 9.0f

    .line 167
    .line 168
    const/high16 v2, 0x41200000    # 10.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x3f800000    # 1.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, 0x40000000    # 2.0f

    .line 179
    .line 180
    const/high16 v18, 0x40000000    # 2.0f

    .line 181
    .line 182
    const v14, 0x3f8ccccd    # 1.1f

    .line 183
    .line 184
    .line 185
    const v15, 0x3f666666    # 0.9f

    .line 186
    .line 187
    .line 188
    const/high16 v16, 0x40000000    # 2.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x40b2e148    # 5.59f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3e947ae1    # 0.29f

    .line 200
    .line 201
    .line 202
    const v18, 0x3f35c28f    # 0.71f

    .line 203
    .line 204
    .line 205
    const v14, 0x3e8a3d71    # 0.27f

    .line 206
    .line 207
    .line 208
    const v15, 0x3de147ae    # 0.11f

    .line 209
    .line 210
    .line 211
    const v16, 0x3f051eb8    # 0.52f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41a00000    # 20.0f

    .line 218
    .line 219
    const/high16 v2, 0x41400000    # 12.0f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v18, 0x41400000    # 12.0f

    .line 227
    .line 228
    const v13, 0x40f28f5c    # 7.58f

    .line 229
    .line 230
    .line 231
    const/high16 v14, 0x41a00000    # 20.0f

    .line 232
    .line 233
    const/high16 v15, 0x40800000    # 4.0f

    .line 234
    .line 235
    const v16, 0x41835c29    # 16.42f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41500000    # 13.0f

    .line 245
    .line 246
    const v2, 0x419f851f    # 19.94f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41900000    # 18.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40700000    # 3.75f

    .line 258
    .line 259
    const v2, -0x3f4c28f6    # -5.62f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x3e800000    # 0.25f

    .line 266
    .line 267
    const v18, -0x40ab851f    # -0.83f

    .line 268
    .line 269
    .line 270
    const v13, 0x3e23d70a    # 0.16f

    .line 271
    .line 272
    .line 273
    const/high16 v14, -0x41800000    # -0.25f

    .line 274
    .line 275
    const/high16 v15, 0x3e800000    # 0.25f

    .line 276
    .line 277
    const v16, -0x40f5c28f    # -0.54f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x41280000    # 10.5f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, -0x40800000    # -1.0f

    .line 289
    .line 290
    const/high16 v18, -0x40800000    # -1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x40f33333    # -0.55f

    .line 294
    .line 295
    .line 296
    const v15, -0x4119999a    # -0.45f

    .line 297
    .line 298
    .line 299
    const/high16 v16, -0x40800000    # -1.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, -0x40400000    # -1.5f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x404ccccd    # -1.4f

    .line 310
    .line 311
    .line 312
    const/high16 v2, -0x40200000    # -1.75f

    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x4138a3d7    # 11.54f

    .line 318
    .line 319
    .line 320
    const/high16 v18, 0x40e00000    # 7.0f

    .line 321
    .line 322
    const v13, 0x414b851f    # 12.72f

    .line 323
    .line 324
    .line 325
    const v14, 0x40e8f5c3    # 7.28f

    .line 326
    .line 327
    .line 328
    const v15, 0x41426666    # 12.15f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x40e00000    # 7.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41000000    # 8.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x40a23d71    # 5.07f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41400000    # 12.0f

    .line 348
    .line 349
    const/high16 v18, 0x40800000    # 4.0f

    .line 350
    .line 351
    const v13, 0x4112e148    # 9.18f

    .line 352
    .line 353
    .line 354
    const v14, 0x408c7ae1    # 4.39f

    .line 355
    .line 356
    .line 357
    const v15, 0x4128a3d7    # 10.54f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x40800000    # 4.0f

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
    const v13, 0x408d1eb8    # 4.41f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/high16 v15, 0x41000000    # 8.0f

    .line 374
    .line 375
    const v16, 0x4065c28f    # 3.59f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x41500000    # 13.0f

    .line 382
    .line 383
    const v18, 0x419f851f    # 19.94f

    .line 384
    .line 385
    .line 386
    const/high16 v13, 0x41a00000    # 20.0f

    .line 387
    .line 388
    const v14, 0x41808f5c    # 16.07f

    .line 389
    .line 390
    .line 391
    const v15, 0x4187851f    # 16.94f

    .line 392
    .line 393
    .line 394
    const v16, 0x419b851f    # 19.44f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const/16 v16, 0x3800

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v8, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    const/high16 v9, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/high16 v12, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v13, 0x0

    .line 421
    const/4 v14, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const-string v4, ""

    .line 424
    .line 425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    sput-object v0, Landroidx/compose/material/icons/filled/SouthAmericaKt;->_southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 434
    .line 435
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    return-object v0
.end method
