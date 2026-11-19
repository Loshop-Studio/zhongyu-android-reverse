.class public final Landroidx/compose/material/icons/twotone/ModelTrainingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getModelTraining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ModelTrainingKt;->_modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ModelTraining"

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
    const/high16 v2, 0x41580000    # 13.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 78
    .line 79
    const/high16 v18, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const/high16 v14, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 85
    .line 86
    const/high16 v16, 0x40600000    # 3.5f

    .line 87
    .line 88
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, -0x40000000    # -2.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v18, -0x3f600000    # -5.0f

    .line 97
    .line 98
    const/high16 v14, -0x40400000    # -1.5f

    .line 99
    .line 100
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40600000    # 3.5f

    .line 106
    .line 107
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 108
    .line 109
    const v14, -0x4008f5c3    # -1.93f

    .line 110
    .line 111
    .line 112
    const v15, 0x3fc8f5c3    # 1.57f

    .line 113
    .line 114
    .line 115
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x41780000    # 15.5f

    .line 125
    .line 126
    const/high16 v18, 0x41580000    # 13.5f

    .line 127
    .line 128
    const v13, 0x415ee148    # 13.93f

    .line 129
    .line 130
    .line 131
    const/high16 v14, 0x41200000    # 10.0f

    .line 132
    .line 133
    const/high16 v15, 0x41780000    # 15.5f

    .line 134
    .line 135
    const v16, 0x41391eb8    # 11.57f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x419c0000    # 19.5f

    .line 145
    .line 146
    const/high16 v2, 0x41500000    # 13.0f

    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, -0x40000000    # -2.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41a80000    # 21.0f

    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x419c0000    # 19.5f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41980000    # 19.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x4035c28f    # -1.58f

    .line 180
    .line 181
    .line 182
    const v18, 0x408d70a4    # 4.42f

    .line 183
    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, 0x3fd70a3d    # 1.68f

    .line 187
    .line 188
    .line 189
    const v15, -0x40e8f5c3    # -0.59f

    .line 190
    .line 191
    .line 192
    const v16, 0x404d70a4    # 3.21f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x3fb5c28f    # 1.42f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41a80000    # 21.0f

    .line 205
    .line 206
    const/high16 v18, 0x41500000    # 13.0f

    .line 207
    .line 208
    const v13, 0x41a170a4    # 20.18f

    .line 209
    .line 210
    .line 211
    const v14, 0x418a28f6    # 17.27f

    .line 212
    .line 213
    .line 214
    const/high16 v15, 0x41a80000    # 21.0f

    .line 215
    .line 216
    const v16, 0x4173ae14    # 15.23f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x3fb5c28f    # -3.16f

    .line 223
    .line 224
    .line 225
    const v18, -0x3f251eb8    # -6.84f

    .line 226
    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, -0x3fd0a3d7    # -2.74f

    .line 230
    .line 231
    .line 232
    const v15, -0x40628f5c    # -1.23f

    .line 233
    .line 234
    .line 235
    const v16, -0x3f59eb85    # -5.19f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x404a3d71    # -1.42f

    .line 242
    .line 243
    .line 244
    const v2, 0x3fb5c28f    # 1.42f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x41980000    # 19.0f

    .line 251
    .line 252
    const/high16 v18, 0x41500000    # 13.0f

    .line 253
    .line 254
    const v13, 0x418feb85    # 17.99f

    .line 255
    .line 256
    .line 257
    const v14, 0x410dc28f    # 8.86f

    .line 258
    .line 259
    .line 260
    const/high16 v15, 0x41980000    # 19.0f

    .line 261
    .line 262
    const v16, 0x412d1eb8    # 10.82f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x40a00000    # 5.0f

    .line 272
    .line 273
    const/high16 v2, 0x41800000    # 16.0f

    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, -0x3f800000    # -4.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const/4 v14, 0x0

    .line 294
    const/4 v15, 0x0

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 301
    .line 302
    const/high16 v18, 0x41100000    # 9.0f

    .line 303
    .line 304
    const v13, -0x3f60f5c3    # -4.97f

    .line 305
    .line 306
    .line 307
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 308
    .line 309
    const v16, 0x4080f5c3    # 4.03f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x400a3d71    # 2.16f

    .line 316
    .line 317
    .line 318
    const v18, 0x40bae148    # 5.84f

    .line 319
    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const v14, 0x400eb852    # 2.23f

    .line 323
    .line 324
    .line 325
    const v15, 0x3f51eb85    # 0.82f

    .line 326
    .line 327
    .line 328
    const v16, 0x4088a3d7    # 4.27f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x404a3d71    # -1.42f

    .line 335
    .line 336
    .line 337
    const v2, 0x3fb5c28f    # 1.42f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x40a00000    # 5.0f

    .line 344
    .line 345
    const/high16 v18, 0x41500000    # 13.0f

    .line 346
    .line 347
    const v13, 0x40b2e148    # 5.59f

    .line 348
    .line 349
    .line 350
    const v14, 0x4181ae14    # 16.21f

    .line 351
    .line 352
    .line 353
    const/high16 v15, 0x40a00000    # 5.0f

    .line 354
    .line 355
    const v16, 0x416ae148    # 14.68f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x40e00000    # 7.0f

    .line 362
    .line 363
    const/high16 v18, -0x3f200000    # -7.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x3f88f5c3    # -3.86f

    .line 367
    .line 368
    .line 369
    const v15, 0x4048f5c3    # 3.14f

    .line 370
    .line 371
    .line 372
    const/high16 v16, -0x3f200000    # -7.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    const/16 v18, 0x0

    .line 380
    .line 381
    const/4 v14, 0x0

    .line 382
    const/4 v15, 0x0

    .line 383
    const/16 v16, 0x0

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x40400000    # 3.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x40a00000    # 5.0f

    .line 394
    .line 395
    const/high16 v2, 0x41800000    # 16.0f

    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const-string v4, ""

    .line 421
    .line 422
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    sput-object v0, Landroidx/compose/material/icons/twotone/ModelTrainingKt;->_modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 431
    .line 432
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    return-object v0
.end method
