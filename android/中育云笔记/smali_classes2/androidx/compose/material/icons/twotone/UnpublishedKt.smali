.class public final Landroidx/compose/material/icons/twotone/UnpublishedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUnpublished(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/UnpublishedKt;->_unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Unpublished"

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
    const v4, 0x412c28f6    # 10.76f

    .line 71
    .line 72
    .line 73
    const v6, 0x415970a4    # 13.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fd66666    # -2.65f

    .line 80
    .line 81
    .line 82
    const v6, 0x4029999a    # 2.65f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x3fb47ae1    # 1.41f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3fd66666    # -2.65f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x407851ec    # 3.88f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x41a00000    # 20.0f

    .line 107
    .line 108
    const/high16 v26, 0x41400000    # 12.0f

    .line 109
    .line 110
    const v21, 0x419cb852    # 19.59f

    .line 111
    .line 112
    .line 113
    const v22, 0x416dc28f    # 14.86f

    .line 114
    .line 115
    .line 116
    const/high16 v23, 0x41a00000    # 20.0f

    .line 117
    .line 118
    const v24, 0x4157ae14    # 13.48f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, -0x3f000000    # -8.0f

    .line 127
    .line 128
    const/high16 v26, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    const v22, -0x3f72e148    # -4.41f

    .line 133
    .line 134
    .line 135
    const v23, -0x3f9a3d71    # -3.59f

    .line 136
    .line 137
    .line 138
    const/high16 v24, -0x3f000000    # -8.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, -0x3f7e147b    # -4.06f

    .line 144
    .line 145
    .line 146
    const v26, 0x3f8f5c29    # 1.12f

    .line 147
    .line 148
    .line 149
    const v21, -0x40428f5c    # -1.48f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const v23, -0x3fc8f5c3    # -2.86f

    .line 155
    .line 156
    .line 157
    const v24, 0x3ed1eb85    # 0.41f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x412c28f6    # 10.76f

    .line 164
    .line 165
    .line 166
    const v6, 0x415970a4    # 13.59f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, 0x41187ae1    # 9.53f

    .line 176
    .line 177
    .line 178
    const v6, 0x418d47ae    # 17.66f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, -0x404b851f    # -1.41f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, -0x3fd66666    # -2.65f

    .line 191
    .line 192
    .line 193
    const v6, 0x4029999a    # 2.65f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x3fb47ae1    # 1.41f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, 0x41187ae1    # 9.53f

    .line 206
    .line 207
    .line 208
    const v6, 0x418d47ae    # 17.66f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x41970a3d    # 18.88f

    .line 218
    .line 219
    .line 220
    const v6, 0x41807ae1    # 16.06f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, -0x3f87ae14    # -3.88f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, 0x3fcb851f    # 1.59f

    .line 233
    .line 234
    .line 235
    const v6, -0x40347ae1    # -1.59f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, -0x3f7851ec    # -4.24f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, -0x404b851f    # -1.41f

    .line 248
    .line 249
    .line 250
    const v6, 0x3fb47ae1    # 1.41f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x40351eb8    # 2.83f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x41c7ae14    # -0.18f

    .line 263
    .line 264
    .line 265
    const v6, 0x3e3851ec    # 0.18f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x40fe147b    # 7.94f

    .line 272
    .line 273
    .line 274
    const v6, 0x40a3d70a    # 5.12f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, 0x40800000    # 4.0f

    .line 281
    .line 282
    const/high16 v26, 0x41400000    # 12.0f

    .line 283
    .line 284
    const v21, 0x408d1eb8    # 4.41f

    .line 285
    .line 286
    .line 287
    const v22, 0x41123d71    # 9.14f

    .line 288
    .line 289
    .line 290
    const/high16 v23, 0x40800000    # 4.0f

    .line 291
    .line 292
    const v24, 0x412851ec    # 10.52f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x41000000    # 8.0f

    .line 299
    .line 300
    const/high16 v26, 0x41000000    # 8.0f

    .line 301
    .line 302
    const/16 v21, 0x0

    .line 303
    .line 304
    const v22, 0x408d1eb8    # 4.41f

    .line 305
    .line 306
    .line 307
    const v23, 0x4065c28f    # 3.59f

    .line 308
    .line 309
    .line 310
    const/high16 v24, 0x41000000    # 8.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, 0x41807ae1    # 16.06f

    .line 316
    .line 317
    .line 318
    const v26, 0x41970a3d    # 18.88f

    .line 319
    .line 320
    .line 321
    const v21, 0x4157ae14    # 13.48f

    .line 322
    .line 323
    .line 324
    const/high16 v22, 0x41a00000    # 20.0f

    .line 325
    .line 326
    const v23, 0x416dc28f    # 14.86f

    .line 327
    .line 328
    .line 329
    const v24, 0x419cb852    # 19.59f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    const/16 v16, 0x3800

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    const v6, 0x3e99999a    # 0.3f

    .line 347
    .line 348
    .line 349
    const v8, 0x3e99999a    # 0.3f

    .line 350
    .line 351
    .line 352
    const/4 v7, 0x0

    .line 353
    const/high16 v9, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/high16 v12, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    const/4 v15, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v6

    .line 375
    const/4 v0, 0x0

    .line 376
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const v0, 0x40fe147b    # 7.94f

    .line 393
    .line 394
    .line 395
    const v2, 0x40a3d70a    # 5.12f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x40cfae14    # 6.49f

    .line 402
    .line 403
    .line 404
    const v2, 0x406a3d71    # 3.66f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x41400000    # 12.0f

    .line 411
    .line 412
    const/high16 v18, 0x40000000    # 2.0f

    .line 413
    .line 414
    const v13, 0x41011eb8    # 8.07f

    .line 415
    .line 416
    .line 417
    const v14, 0x40270a3d    # 2.61f

    .line 418
    .line 419
    .line 420
    const v15, 0x411f5c29    # 9.96f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x40000000    # 2.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x41200000    # 10.0f

    .line 429
    .line 430
    const/high16 v18, 0x41200000    # 10.0f

    .line 431
    .line 432
    const v13, 0x40b0a3d7    # 5.52f

    .line 433
    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const/high16 v15, 0x41200000    # 10.0f

    .line 437
    .line 438
    const v16, 0x408f5c29    # 4.48f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x402b851f    # -1.66f

    .line 445
    .line 446
    .line 447
    const v18, 0x40b051ec    # 5.51f

    .line 448
    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, 0x40028f5c    # 2.04f

    .line 452
    .line 453
    .line 454
    const v15, -0x40e3d70a    # -0.61f

    .line 455
    .line 456
    .line 457
    const v16, 0x407b851f    # 3.93f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, -0x40451eb8    # -1.46f

    .line 464
    .line 465
    .line 466
    const v2, -0x40451eb8    # -1.46f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x41a00000    # 20.0f

    .line 473
    .line 474
    const/high16 v18, 0x41400000    # 12.0f

    .line 475
    .line 476
    const v13, 0x419cb852    # 19.59f

    .line 477
    .line 478
    .line 479
    const v14, 0x416dc28f    # 14.86f

    .line 480
    .line 481
    .line 482
    const/high16 v15, 0x41a00000    # 20.0f

    .line 483
    .line 484
    const v16, 0x4157ae14    # 13.48f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x3f000000    # -8.0f

    .line 491
    .line 492
    const/high16 v18, -0x3f000000    # -8.0f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, -0x3f72e148    # -4.41f

    .line 496
    .line 497
    .line 498
    const v15, -0x3f9a3d71    # -3.59f

    .line 499
    .line 500
    .line 501
    const/high16 v16, -0x3f000000    # -8.0f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x40fe147b    # 7.94f

    .line 507
    .line 508
    .line 509
    const v18, 0x40a3d70a    # 5.12f

    .line 510
    .line 511
    .line 512
    const v13, 0x412851ec    # 10.52f

    .line 513
    .line 514
    .line 515
    const/high16 v14, 0x40800000    # 4.0f

    .line 516
    .line 517
    const v15, 0x41123d71    # 9.14f

    .line 518
    .line 519
    .line 520
    const v16, 0x408d1eb8    # 4.41f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x41187ae1    # 9.53f

    .line 530
    .line 531
    .line 532
    const v2, 0x418d47ae    # 17.66f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, -0x404b851f    # -1.41f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x3fd66666    # -2.65f

    .line 545
    .line 546
    .line 547
    const v2, 0x4029999a    # 2.65f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3fb47ae1    # 1.41f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x41187ae1    # 9.53f

    .line 560
    .line 561
    .line 562
    const v2, 0x418d47ae    # 17.66f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x419e3d71    # 19.78f

    .line 572
    .line 573
    .line 574
    const v2, 0x41b4e148    # 22.61f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, -0x3feeb852    # -2.27f

    .line 581
    .line 582
    .line 583
    const v2, -0x3feeb852    # -2.27f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x41400000    # 12.0f

    .line 590
    .line 591
    const/high16 v18, 0x41b00000    # 22.0f

    .line 592
    .line 593
    const v13, 0x417ee148    # 15.93f

    .line 594
    .line 595
    .line 596
    const v14, 0x41ab1eb8    # 21.39f

    .line 597
    .line 598
    .line 599
    const v15, 0x4160a3d7    # 14.04f

    .line 600
    .line 601
    .line 602
    const/high16 v16, 0x41b00000    # 22.0f

    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, 0x40000000    # 2.0f

    .line 608
    .line 609
    const/high16 v18, 0x41400000    # 12.0f

    .line 610
    .line 611
    const v13, 0x40cf5c29    # 6.48f

    .line 612
    .line 613
    .line 614
    const/high16 v14, 0x41b00000    # 22.0f

    .line 615
    .line 616
    const/high16 v15, 0x40000000    # 2.0f

    .line 617
    .line 618
    const v16, 0x418c28f6    # 17.52f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x3fd47ae1    # 1.66f

    .line 625
    .line 626
    .line 627
    const v18, -0x3f4fae14    # -5.51f

    .line 628
    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const v14, -0x3ffd70a4    # -2.04f

    .line 632
    .line 633
    .line 634
    const v15, 0x3f1c28f6    # 0.61f

    .line 635
    .line 636
    .line 637
    const v16, -0x3f847ae1    # -3.93f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3fb1eb85    # 1.39f

    .line 644
    .line 645
    .line 646
    const v2, 0x40870a3d    # 4.22f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, -0x404b851f    # -1.41f

    .line 653
    .line 654
    .line 655
    const v2, 0x3fb47ae1    # 1.41f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x41930a3d    # 18.38f

    .line 662
    .line 663
    .line 664
    const v2, 0x41930a3d    # 18.38f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x419e3d71    # 19.78f

    .line 671
    .line 672
    .line 673
    const v2, 0x41b4e148    # 22.61f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x41970a3d    # 18.88f

    .line 683
    .line 684
    .line 685
    const v2, 0x41807ae1    # 16.06f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, -0x3f87ae14    # -3.88f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, 0x3fcb851f    # 1.59f

    .line 698
    .line 699
    .line 700
    const v2, -0x40347ae1    # -1.59f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, -0x3f7851ec    # -4.24f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, -0x404b851f    # -1.41f

    .line 713
    .line 714
    .line 715
    const v2, 0x3fb47ae1    # 1.41f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x40351eb8    # 2.83f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, -0x41c7ae14    # -0.18f

    .line 728
    .line 729
    .line 730
    const v2, 0x3e3851ec    # 0.18f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x40fe147b    # 7.94f

    .line 737
    .line 738
    .line 739
    const v2, 0x40a3d70a    # 5.12f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x40800000    # 4.0f

    .line 746
    .line 747
    const/high16 v18, 0x41400000    # 12.0f

    .line 748
    .line 749
    const v13, 0x408d1eb8    # 4.41f

    .line 750
    .line 751
    .line 752
    const v14, 0x41123d71    # 9.14f

    .line 753
    .line 754
    .line 755
    const/high16 v15, 0x40800000    # 4.0f

    .line 756
    .line 757
    const v16, 0x412851ec    # 10.52f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x41000000    # 8.0f

    .line 764
    .line 765
    const/high16 v18, 0x41000000    # 8.0f

    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    const v14, 0x408d1eb8    # 4.41f

    .line 769
    .line 770
    .line 771
    const v15, 0x4065c28f    # 3.59f

    .line 772
    .line 773
    .line 774
    const/high16 v16, 0x41000000    # 8.0f

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v17, 0x41807ae1    # 16.06f

    .line 780
    .line 781
    .line 782
    const v18, 0x41970a3d    # 18.88f

    .line 783
    .line 784
    .line 785
    const v13, 0x4157ae14    # 13.48f

    .line 786
    .line 787
    .line 788
    const/high16 v14, 0x41a00000    # 20.0f

    .line 789
    .line 790
    const v15, 0x416dc28f    # 14.86f

    .line 791
    .line 792
    .line 793
    const v16, 0x419cb852    # 19.59f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    const/16 v16, 0x3800

    .line 807
    .line 808
    const/16 v17, 0x0

    .line 809
    .line 810
    const/high16 v6, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const/high16 v8, 0x3f800000    # 1.0f

    .line 813
    .line 814
    const/4 v7, 0x0

    .line 815
    const/high16 v12, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const/4 v14, 0x0

    .line 819
    const/4 v15, 0x0

    .line 820
    const-string v4, ""

    .line 821
    .line 822
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    sput-object v0, Landroidx/compose/material/icons/twotone/UnpublishedKt;->_unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    return-object v0
.end method
