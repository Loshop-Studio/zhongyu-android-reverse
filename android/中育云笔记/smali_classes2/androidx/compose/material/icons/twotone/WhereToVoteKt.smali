.class public final Landroidx/compose/material/icons/twotone/WhereToVoteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _whereToVote:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWhereToVote(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WhereToVoteKt;->_whereToVote:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WhereToVote"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const/high16 v26, 0x41100000    # 9.0f

    .line 80
    .line 81
    const v21, 0x410b0a3d    # 8.69f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40400000    # 3.0f

    .line 85
    .line 86
    const/high16 v23, 0x40c00000    # 6.0f

    .line 87
    .line 88
    const v24, 0x40b6147b    # 5.69f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v26, 0x4137851f    # 11.47f

    .line 97
    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const v22, 0x40628f5c    # 3.54f

    .line 102
    .line 103
    .line 104
    const v23, 0x40747ae1    # 3.82f

    .line 105
    .line 106
    .line 107
    const v24, 0x410dc28f    # 8.86f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v26, -0x3ec87ae1    # -11.47f

    .line 114
    .line 115
    .line 116
    const/high16 v21, 0x3fe00000    # 1.75f

    .line 117
    .line 118
    const v22, -0x3ff8f5c3    # -2.11f

    .line 119
    .line 120
    .line 121
    const/high16 v23, 0x40c00000    # 6.0f

    .line 122
    .line 123
    const v24, -0x3f0bd70a    # -7.63f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, -0x3f400000    # -6.0f

    .line 130
    .line 131
    const/high16 v26, -0x3f400000    # -6.0f

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    const v22, -0x3fac28f6    # -3.31f

    .line 136
    .line 137
    .line 138
    const v23, -0x3fd3d70a    # -2.69f

    .line 139
    .line 140
    .line 141
    const/high16 v24, -0x3f400000    # -6.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41600000    # 14.0f

    .line 150
    .line 151
    const v6, 0x4127851f    # 10.47f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, -0x3fb47ae1    # -3.18f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x41166666    # 9.4f

    .line 164
    .line 165
    .line 166
    const v6, 0x410b5c29    # 8.71f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x3fe28f5c    # 1.77f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, -0x3f6ccccd    # -4.6f

    .line 179
    .line 180
    .line 181
    const v6, 0x40933333    # 4.6f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, 0x3fb47ae1    # 1.41f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x41600000    # 14.0f

    .line 194
    .line 195
    const v6, 0x4127851f    # 10.47f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const/16 v16, 0x3800

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const v6, 0x3e99999a    # 0.3f

    .line 213
    .line 214
    .line 215
    const v8, 0x3e99999a    # 0.3f

    .line 216
    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v0, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v2, 0x41400000    # 12.0f

    .line 261
    .line 262
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40800000    # 4.0f

    .line 266
    .line 267
    const/high16 v18, 0x41100000    # 9.0f

    .line 268
    .line 269
    const v13, 0x40f2e148    # 7.59f

    .line 270
    .line 271
    .line 272
    const/high16 v14, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/high16 v15, 0x40800000    # 4.0f

    .line 275
    .line 276
    const v16, 0x4092e148    # 4.59f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x40e851ec    # 7.26f

    .line 283
    .line 284
    .line 285
    const v18, 0x415ab852    # 13.67f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, 0x40b23d71    # 5.57f

    .line 290
    .line 291
    .line 292
    const v15, 0x40deb852    # 6.96f

    .line 293
    .line 294
    .line 295
    const v16, 0x415570a4    # 13.34f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x3f51eb85    # 0.82f

    .line 302
    .line 303
    .line 304
    const v2, 0x3f3d70a4    # 0.74f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, -0x40ae147b    # -0.82f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x41a00000    # 20.0f

    .line 317
    .line 318
    const/high16 v18, 0x41100000    # 9.0f

    .line 319
    .line 320
    const v13, 0x4150a3d7    # 13.04f

    .line 321
    .line 322
    .line 323
    const v14, 0x41b2b852    # 22.34f

    .line 324
    .line 325
    .line 326
    const/high16 v15, 0x41a00000    # 20.0f

    .line 327
    .line 328
    const v16, 0x41691eb8    # 14.57f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x3f000000    # -8.0f

    .line 335
    .line 336
    const/high16 v18, -0x3f000000    # -8.0f

    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, -0x3f72e148    # -4.41f

    .line 340
    .line 341
    .line 342
    const v15, -0x3f9a3d71    # -3.59f

    .line 343
    .line 344
    .line 345
    const/high16 v16, -0x3f000000    # -8.0f

    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x41a3c28f    # 20.47f

    .line 354
    .line 355
    .line 356
    const/high16 v2, 0x41400000    # 12.0f

    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x40c00000    # 6.0f

    .line 362
    .line 363
    const/high16 v18, 0x41100000    # 9.0f

    .line 364
    .line 365
    const v13, 0x411d1eb8    # 9.82f

    .line 366
    .line 367
    .line 368
    const v14, 0x418ee148    # 17.86f

    .line 369
    .line 370
    .line 371
    const/high16 v15, 0x40c00000    # 6.0f

    .line 372
    .line 373
    const v16, 0x4148a3d7    # 12.54f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v18, -0x3f400000    # -6.0f

    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const v14, -0x3fac28f6    # -3.31f

    .line 383
    .line 384
    .line 385
    const v15, 0x402c28f6    # 2.69f

    .line 386
    .line 387
    .line 388
    const/high16 v16, -0x3f400000    # -6.0f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x402c28f6    # 2.69f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x40c00000    # 6.0f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, -0x3f400000    # -6.0f

    .line 402
    .line 403
    const v18, 0x4137851f    # 11.47f

    .line 404
    .line 405
    .line 406
    const v14, 0x40751eb8    # 3.83f

    .line 407
    .line 408
    .line 409
    const/high16 v15, -0x3f780000    # -4.25f

    .line 410
    .line 411
    const v16, 0x4115c28f    # 9.36f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x41711eb8    # 15.07f

    .line 421
    .line 422
    .line 423
    const v2, 0x40d23d71    # 6.57f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x3f6ccccd    # -4.6f

    .line 430
    .line 431
    .line 432
    const v2, 0x40933333    # 4.6f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x41166666    # 9.4f

    .line 439
    .line 440
    .line 441
    const v2, 0x410b5c29    # 8.71f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x404a3d71    # -1.42f

    .line 448
    .line 449
    .line 450
    const v2, 0x3fb5c28f    # 1.42f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41600000    # 14.0f

    .line 457
    .line 458
    const v2, 0x4127851f    # 10.47f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x40c051ec    # 6.01f

    .line 465
    .line 466
    .line 467
    const v2, -0x3f3fae14    # -6.01f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/16 v16, 0x3800

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v8, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/high16 v12, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/twotone/WhereToVoteKt;->_whereToVote:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method
