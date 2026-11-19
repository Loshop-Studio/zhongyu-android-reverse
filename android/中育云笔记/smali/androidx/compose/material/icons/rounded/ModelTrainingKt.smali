.class public final Landroidx/compose/material/icons/rounded/ModelTrainingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getModelTraining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ModelTrainingKt;->_modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ModelTraining"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v18, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, 0x3f0ccccd    # 0.55f

    .line 167
    .line 168
    .line 169
    const v15, 0x3ee66666    # 0.45f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x3f800000    # 1.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v18, -0x40800000    # -1.0f

    .line 182
    .line 183
    const v13, 0x3f0ccccd    # 0.55f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/high16 v15, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const v16, -0x4119999a    # -0.45f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x419c0000    # 19.5f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41980000    # 19.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x4070a3d7    # -1.12f

    .line 209
    .line 210
    .line 211
    const v18, 0x4071eb85    # 3.78f

    .line 212
    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const v14, 0x3fb1eb85    # 1.39f

    .line 216
    .line 217
    .line 218
    const v15, -0x412e147b    # -0.41f

    .line 219
    .line 220
    .line 221
    const v16, 0x402c28f6    # 2.69f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x3e0f5c29    # 0.14f

    .line 228
    .line 229
    .line 230
    const v18, 0x3f9eb852    # 1.24f

    .line 231
    .line 232
    .line 233
    const/high16 v13, -0x41800000    # -0.25f

    .line 234
    .line 235
    const v14, 0x3ec7ae14    # 0.39f

    .line 236
    .line 237
    .line 238
    const v15, -0x41bd70a4    # -0.19f

    .line 239
    .line 240
    .line 241
    const v16, 0x3f68f5c3    # 0.91f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x3fc51eb8    # 1.54f

    .line 252
    .line 253
    .line 254
    const v18, -0x41e66666    # -0.15f

    .line 255
    .line 256
    .line 257
    const v13, 0x3ee147ae    # 0.44f

    .line 258
    .line 259
    .line 260
    const v14, 0x3ee147ae    # 0.44f

    .line 261
    .line 262
    .line 263
    const v15, 0x3f99999a    # 1.2f

    .line 264
    .line 265
    .line 266
    const v16, 0x3ec28f5c    # 0.38f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x41a80000    # 21.0f

    .line 273
    .line 274
    const/high16 v18, 0x41500000    # 13.0f

    .line 275
    .line 276
    const v13, 0x41a3c28f    # 20.47f

    .line 277
    .line 278
    .line 279
    const v14, 0x4183c28f    # 16.47f

    .line 280
    .line 281
    .line 282
    const/high16 v15, 0x41a80000    # 21.0f

    .line 283
    .line 284
    const v16, 0x416ccccd    # 14.8f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x3fe66666    # -2.4f

    .line 291
    .line 292
    .line 293
    const v18, -0x3f3c28f6    # -6.12f

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, -0x3fe8f5c3    # -2.36f

    .line 298
    .line 299
    .line 300
    const v15, -0x40970a3d    # -0.91f

    .line 301
    .line 302
    .line 303
    const v16, -0x3f6fae14    # -4.51f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x40466666    # -1.45f

    .line 310
    .line 311
    .line 312
    const v18, -0x430a3d71    # -0.03f

    .line 313
    .line 314
    .line 315
    const v13, -0x413851ec    # -0.39f

    .line 316
    .line 317
    .line 318
    const v14, -0x4128f5c3    # -0.42f

    .line 319
    .line 320
    .line 321
    const v15, -0x4079999a    # -1.05f

    .line 322
    .line 323
    .line 324
    const v16, -0x4123d70a    # -0.43f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x435c28f6    # -0.02f

    .line 334
    .line 335
    .line 336
    const v18, 0x3fb1eb85    # 1.39f

    .line 337
    .line 338
    .line 339
    const v13, -0x413d70a4    # -0.38f

    .line 340
    .line 341
    .line 342
    const v14, 0x3ec28f5c    # 0.38f

    .line 343
    .line 344
    .line 345
    const v15, -0x413d70a4    # -0.38f

    .line 346
    .line 347
    .line 348
    const v16, 0x3f7d70a4    # 0.99f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x41980000    # 19.0f

    .line 355
    .line 356
    const/high16 v18, 0x41500000    # 13.0f

    .line 357
    .line 358
    const v13, 0x419251ec    # 18.29f

    .line 359
    .line 360
    .line 361
    const v14, 0x4117d70a    # 9.49f

    .line 362
    .line 363
    .line 364
    const/high16 v15, 0x41980000    # 19.0f

    .line 365
    .line 366
    const v16, 0x41328f5c    # 11.16f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x417a6666    # 15.65f

    .line 376
    .line 377
    .line 378
    const v2, 0x4094cccd    # 4.65f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x3fcd70a4    # -2.79f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x41400000    # 12.0f

    .line 391
    .line 392
    const v18, 0x400d70a4    # 2.21f

    .line 393
    .line 394
    .line 395
    const v13, 0x4148a3d7    # 12.54f

    .line 396
    .line 397
    .line 398
    const v14, 0x3fc51eb8    # 1.54f

    .line 399
    .line 400
    .line 401
    const/high16 v15, 0x41400000    # 12.0f

    .line 402
    .line 403
    const v16, 0x3fe147ae    # 1.76f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x40800000    # 4.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 419
    .line 420
    const/high16 v18, 0x41100000    # 9.0f

    .line 421
    .line 422
    const v13, -0x3f60f5c3    # -4.97f

    .line 423
    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 427
    .line 428
    const v16, 0x4080f5c3    # 4.03f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x3fb851ec    # 1.44f

    .line 435
    .line 436
    .line 437
    const v18, 0x409c28f6    # 4.88f

    .line 438
    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const v14, 0x3fe66666    # 1.8f

    .line 442
    .line 443
    .line 444
    const v15, 0x3f07ae14    # 0.53f

    .line 445
    .line 446
    .line 447
    const v16, 0x405e147b    # 3.47f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3fc51eb8    # 1.54f

    .line 454
    .line 455
    .line 456
    const v18, 0x3e19999a    # 0.15f

    .line 457
    .line 458
    .line 459
    const v13, 0x3eae147b    # 0.34f

    .line 460
    .line 461
    .line 462
    const v14, 0x3f07ae14    # 0.53f

    .line 463
    .line 464
    .line 465
    const v15, 0x3f8ccccd    # 1.1f

    .line 466
    .line 467
    .line 468
    const v16, 0x3f170a3d    # 0.59f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3e0f5c29    # 0.14f

    .line 478
    .line 479
    .line 480
    const v18, -0x40628f5c    # -1.23f

    .line 481
    .line 482
    .line 483
    const v13, 0x3ea8f5c3    # 0.33f

    .line 484
    .line 485
    .line 486
    const v14, -0x41570a3d    # -0.33f

    .line 487
    .line 488
    .line 489
    const v15, 0x3ec7ae14    # 0.39f

    .line 490
    .line 491
    .line 492
    const v16, -0x40a8f5c3    # -0.84f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x40c80000    # 6.25f

    .line 499
    .line 500
    const v18, 0x410ccccd    # 8.8f

    .line 501
    .line 502
    .line 503
    const v13, 0x40975c29    # 4.73f

    .line 504
    .line 505
    .line 506
    const v14, 0x416a6666    # 14.65f

    .line 507
    .line 508
    .line 509
    const v15, 0x408f5c29    # 4.48f

    .line 510
    .line 511
    .line 512
    const v16, 0x413b3333    # 11.7f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x41400000    # 12.0f

    .line 519
    .line 520
    const/high16 v18, 0x40c00000    # 6.0f

    .line 521
    .line 522
    const v13, 0x40ee6666    # 7.45f

    .line 523
    .line 524
    .line 525
    const v14, 0x40db3333    # 6.85f

    .line 526
    .line 527
    .line 528
    const v15, 0x411b5c29    # 9.71f

    .line 529
    .line 530
    .line 531
    const v16, 0x40b9eb85    # 5.81f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x3fe51eb8    # 1.79f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x3f59999a    # 0.85f

    .line 547
    .line 548
    .line 549
    const v18, 0x3eb33333    # 0.35f

    .line 550
    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const v14, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    const v15, 0x3f0a3d71    # 0.54f

    .line 557
    .line 558
    .line 559
    const v16, 0x3f2b851f    # 0.67f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40328f5c    # 2.79f

    .line 566
    .line 567
    .line 568
    const v2, -0x3fcd70a4    # -2.79f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x417a6666    # 15.65f

    .line 575
    .line 576
    .line 577
    const v18, 0x4094cccd    # 4.65f

    .line 578
    .line 579
    .line 580
    const v13, 0x417d70a4    # 15.84f

    .line 581
    .line 582
    .line 583
    const v14, 0x40a51eb8    # 5.16f

    .line 584
    .line 585
    .line 586
    const v15, 0x417d70a4    # 15.84f

    .line 587
    .line 588
    .line 589
    const v16, 0x409ae148    # 4.84f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/16 v16, 0x3800

    .line 603
    .line 604
    const/16 v17, 0x0

    .line 605
    .line 606
    const/high16 v6, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/high16 v8, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    const/high16 v9, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sput-object v0, Landroidx/compose/material/icons/rounded/ModelTrainingKt;->_modelTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method
