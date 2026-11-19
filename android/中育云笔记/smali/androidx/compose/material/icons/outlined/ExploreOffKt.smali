.class public final Landroidx/compose/material/icons/outlined/ExploreOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExploreOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ExploreOff"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/high16 v18, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v13, 0x408d1eb8    # 4.41f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x41000000    # 8.0f

    .line 86
    .line 87
    const v16, 0x4065c28f    # 3.59f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x4070a3d7    # -1.12f

    .line 94
    .line 95
    .line 96
    const v18, 0x4081eb85    # 4.06f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3fbd70a4    # 1.48f

    .line 101
    .line 102
    .line 103
    const v15, -0x412e147b    # -0.41f

    .line 104
    .line 105
    .line 106
    const v16, 0x40370a3d    # 2.86f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3fbae148    # 1.46f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, 0x41b00000    # 22.0f

    .line 119
    .line 120
    const/high16 v18, 0x41400000    # 12.0f

    .line 121
    .line 122
    const v13, 0x41ab1eb8    # 21.39f

    .line 123
    .line 124
    .line 125
    const v14, 0x417ee148    # 15.93f

    .line 126
    .line 127
    .line 128
    const/high16 v15, 0x41b00000    # 22.0f

    .line 129
    .line 130
    const v16, 0x4160a3d7    # 14.04f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 137
    .line 138
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, -0x3f4f5c29    # -5.52f

    .line 142
    .line 143
    .line 144
    const v15, -0x3f70a3d7    # -4.48f

    .line 145
    .line 146
    .line 147
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x3f4fae14    # -5.51f

    .line 153
    .line 154
    .line 155
    const v18, 0x3fd47ae1    # 1.66f

    .line 156
    .line 157
    .line 158
    const v13, -0x3ffd70a4    # -2.04f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const v15, -0x3f847ae1    # -3.93f

    .line 163
    .line 164
    .line 165
    const v16, 0x3f1c28f6    # 0.61f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x41400000    # 12.0f

    .line 175
    .line 176
    const/high16 v18, 0x40800000    # 4.0f

    .line 177
    .line 178
    const v13, 0x41123d71    # 9.14f

    .line 179
    .line 180
    .line 181
    const v14, 0x408d1eb8    # 4.41f

    .line 182
    .line 183
    .line 184
    const v15, 0x412851ec    # 10.52f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x416e8f5c    # 14.91f

    .line 196
    .line 197
    .line 198
    const v2, 0x414147ae    # 12.08f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x418c0000    # 17.5f

    .line 205
    .line 206
    const/high16 v2, 0x40d00000    # 6.5f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x3f4d70a4    # -5.58f

    .line 212
    .line 213
    .line 214
    const v2, 0x4025c28f    # 2.59f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x403f5c29    # 2.99f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x409dc28f    # 4.93f

    .line 230
    .line 231
    .line 232
    const v2, 0x40066666    # 2.1f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3fc7ae14    # 1.56f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40000000    # 2.0f

    .line 245
    .line 246
    const/high16 v18, 0x41400000    # 12.0f

    .line 247
    .line 248
    const v13, 0x40270a3d    # 2.61f

    .line 249
    .line 250
    .line 251
    const v14, 0x41011eb8    # 8.07f

    .line 252
    .line 253
    .line 254
    const/high16 v15, 0x40000000    # 2.0f

    .line 255
    .line 256
    const v16, 0x411f5c29    # 9.96f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x41200000    # 10.0f

    .line 263
    .line 264
    const/high16 v18, 0x41200000    # 10.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, 0x40b0a3d7    # 5.52f

    .line 268
    .line 269
    .line 270
    const v15, 0x408f5c29    # 4.48f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x41200000    # 10.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x40b051ec    # 5.51f

    .line 279
    .line 280
    .line 281
    const v18, -0x402b851f    # -1.66f

    .line 282
    .line 283
    .line 284
    const v13, 0x40028f5c    # 2.04f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, 0x407b851f    # 3.93f

    .line 289
    .line 290
    .line 291
    const v16, -0x40e3d70a    # -0.61f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x3fb47ae1    # 1.41f

    .line 301
    .line 302
    .line 303
    const v2, -0x404b851f    # -1.41f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x4060a3d7    # 3.51f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x409dc28f    # 4.93f

    .line 316
    .line 317
    .line 318
    const v2, 0x40066666    # 2.1f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x40a3d70a    # 5.12f

    .line 328
    .line 329
    .line 330
    const v2, 0x40fe147b    # 7.94f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x407eb852    # 3.98f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x3fd9999a    # -2.6f

    .line 343
    .line 344
    .line 345
    const v2, 0x40b28f5c    # 5.58f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x3fda3d71    # -2.59f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x407eb852    # 3.98f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x3f7e147b    # -4.06f

    .line 364
    .line 365
    .line 366
    const v18, 0x3f8e147b    # 1.11f

    .line 367
    .line 368
    .line 369
    const v13, -0x40666666    # -1.2f

    .line 370
    .line 371
    .line 372
    const v14, 0x3f333333    # 0.7f

    .line 373
    .line 374
    .line 375
    const v15, -0x3fdae148    # -2.58f

    .line 376
    .line 377
    .line 378
    const v16, 0x3f8e147b    # 1.11f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, -0x3f000000    # -8.0f

    .line 385
    .line 386
    const/high16 v18, -0x3f000000    # -8.0f

    .line 387
    .line 388
    const v13, -0x3f72e148    # -4.41f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/high16 v15, -0x3f000000    # -8.0f

    .line 393
    .line 394
    const v16, -0x3f9a3d71    # -3.59f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x3f8f5c29    # 1.12f

    .line 401
    .line 402
    .line 403
    const v18, -0x3f7e147b    # -4.06f

    .line 404
    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const v14, -0x40428f5c    # -1.48f

    .line 408
    .line 409
    .line 410
    const v15, 0x3ed1eb85    # 0.41f

    .line 411
    .line 412
    .line 413
    const v16, -0x3fc8f5c3    # -2.86f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/16 v16, 0x3800

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v8, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const/high16 v9, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/high16 v12, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    const-string v4, ""

    .line 442
    .line 443
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sput-object v0, Landroidx/compose/material/icons/outlined/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 452
    .line 453
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    return-object v0
.end method
