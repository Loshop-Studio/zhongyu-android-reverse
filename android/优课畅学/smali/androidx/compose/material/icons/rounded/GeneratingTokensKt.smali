.class public final Landroidx/compose/material/icons/rounded/GeneratingTokensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _generatingTokens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGeneratingTokens(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GeneratingTokensKt;->_generatingTokens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GeneratingTokens"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v18, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v13, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3f000000    # -8.0f

    .line 86
    .line 87
    const v16, 0x40651eb8    # 3.58f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, 0x41000000    # 8.0f

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, 0x408d70a4    # 4.42f

    .line 97
    .line 98
    .line 99
    const v15, 0x40651eb8    # 3.58f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x41000000    # 8.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, -0x3f9ae148    # -3.58f

    .line 108
    .line 109
    .line 110
    const/high16 v2, -0x3f000000    # -8.0f

    .line 111
    .line 112
    const/high16 v4, 0x41000000    # 8.0f

    .line 113
    .line 114
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41100000    # 9.0f

    .line 118
    .line 119
    const/high16 v18, 0x40800000    # 4.0f

    .line 120
    .line 121
    const/high16 v13, 0x41880000    # 17.0f

    .line 122
    .line 123
    const v14, 0x40f28f5c    # 7.58f

    .line 124
    .line 125
    .line 126
    const v15, 0x4156b852    # 13.42f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x40800000    # 4.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x41780000    # 15.5f

    .line 138
    .line 139
    const/high16 v2, 0x41100000    # 9.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, -0x40800000    # -1.0f

    .line 145
    .line 146
    const/high16 v18, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v13, -0x40f33333    # -0.55f

    .line 149
    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const/high16 v15, -0x40800000    # -1.0f

    .line 153
    .line 154
    const v16, -0x4119999a    # -0.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, -0x3f800000    # -4.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40d80000    # 6.75f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x40c00000    # 6.0f

    .line 171
    .line 172
    const/high16 v18, 0x411c0000    # 9.75f

    .line 173
    .line 174
    const v13, 0x40cae148    # 6.34f

    .line 175
    .line 176
    .line 177
    const/high16 v14, 0x41280000    # 10.5f

    .line 178
    .line 179
    const/high16 v15, 0x40c00000    # 6.0f

    .line 180
    .line 181
    const v16, 0x41228f5c    # 10.16f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x40cae148    # 6.34f

    .line 188
    .line 189
    .line 190
    const/high16 v2, 0x40d80000    # 6.75f

    .line 191
    .line 192
    const/high16 v4, 0x41100000    # 9.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40900000    # 4.5f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, 0x41400000    # 12.0f

    .line 203
    .line 204
    const v13, 0x413a8f5c    # 11.66f

    .line 205
    .line 206
    .line 207
    const/high16 v14, 0x41100000    # 9.0f

    .line 208
    .line 209
    const/high16 v15, 0x41400000    # 12.0f

    .line 210
    .line 211
    const v16, 0x411570a4    # 9.34f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, -0x4151eb85    # -0.34f

    .line 218
    .line 219
    .line 220
    const/high16 v2, -0x40c00000    # -0.75f

    .line 221
    .line 222
    const/high16 v4, 0x3f400000    # 0.75f

    .line 223
    .line 224
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41200000    # 10.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x40800000    # 4.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41100000    # 9.0f

    .line 238
    .line 239
    const/high16 v18, 0x41780000    # 15.5f

    .line 240
    .line 241
    const/high16 v13, 0x41200000    # 10.0f

    .line 242
    .line 243
    const v14, 0x4170cccd    # 15.05f

    .line 244
    .line 245
    .line 246
    const v15, 0x4118cccd    # 9.55f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x41780000    # 15.5f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40700000    # 3.75f

    .line 258
    .line 259
    const/high16 v2, 0x41a20000    # 20.25f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x409147ae    # 4.54f

    .line 265
    .line 266
    .line 267
    const/high16 v2, 0x41b00000    # 22.0f

    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const v18, 0x3f68f5c3    # 0.91f

    .line 275
    .line 276
    .line 277
    const v13, 0x3ec7ae14    # 0.39f

    .line 278
    .line 279
    .line 280
    const v14, 0x3e3851ec    # 0.18f

    .line 281
    .line 282
    .line 283
    const v15, 0x3ec7ae14    # 0.39f

    .line 284
    .line 285
    .line 286
    const v16, 0x3f3ae148    # 0.73f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3f4a3d71    # 0.79f

    .line 293
    .line 294
    .line 295
    const/high16 v2, -0x40200000    # -1.75f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x419bae14    # 19.46f

    .line 301
    .line 302
    .line 303
    const/high16 v2, 0x41000000    # 8.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x40970a3d    # -0.91f

    .line 309
    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const v13, -0x41c7ae14    # -0.18f

    .line 314
    .line 315
    .line 316
    const v14, 0x3ec7ae14    # 0.39f

    .line 317
    .line 318
    .line 319
    const v15, -0x40c51eb8    # -0.73f

    .line 320
    .line 321
    .line 322
    const v16, 0x3ec7ae14    # 0.39f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, -0x40b5c28f    # -0.79f

    .line 329
    .line 330
    .line 331
    const/high16 v2, -0x40200000    # -1.75f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x40aeb852    # 5.46f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x41800000    # 16.0f

    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    const v18, -0x40970a3d    # -0.91f

    .line 347
    .line 348
    .line 349
    const v13, -0x413851ec    # -0.39f

    .line 350
    .line 351
    .line 352
    const v14, -0x41c7ae14    # -0.18f

    .line 353
    .line 354
    .line 355
    const v15, -0x413851ec    # -0.39f

    .line 356
    .line 357
    .line 358
    const v16, -0x40c51eb8    # -0.73f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 365
    .line 366
    const v2, -0x40b5c28f    # -0.79f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x40000000    # 2.0f

    .line 373
    .line 374
    const v2, 0x419451ec    # 18.54f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3f68f5c3    # 0.91f

    .line 381
    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    const v13, 0x3e3851ec    # 0.18f

    .line 386
    .line 387
    .line 388
    const v14, -0x413851ec    # -0.39f

    .line 389
    .line 390
    .line 391
    const v15, 0x3f3ae148    # 0.73f

    .line 392
    .line 393
    .line 394
    const v16, -0x413851ec    # -0.39f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40700000    # 3.75f

    .line 401
    .line 402
    const/high16 v2, 0x41a20000    # 20.25f

    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x418e0000    # 17.75f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x419451ec    # 18.54f

    .line 416
    .line 417
    .line 418
    const/high16 v2, 0x41b00000    # 22.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const v18, 0x3f68f5c3    # 0.91f

    .line 426
    .line 427
    .line 428
    const v13, 0x3ec7ae14    # 0.39f

    .line 429
    .line 430
    .line 431
    const v14, 0x3e3851ec    # 0.18f

    .line 432
    .line 433
    .line 434
    const v15, 0x3ec7ae14    # 0.39f

    .line 435
    .line 436
    .line 437
    const v16, 0x3f3ae148    # 0.73f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3f4a3d71    # 0.79f

    .line 444
    .line 445
    .line 446
    const/high16 v2, -0x40200000    # -1.75f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x419bae14    # 19.46f

    .line 452
    .line 453
    .line 454
    const/high16 v2, 0x41b00000    # 22.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x40970a3d    # -0.91f

    .line 460
    .line 461
    .line 462
    const/16 v18, 0x0

    .line 463
    .line 464
    const v13, -0x41c7ae14    # -0.18f

    .line 465
    .line 466
    .line 467
    const v14, 0x3ec7ae14    # 0.39f

    .line 468
    .line 469
    .line 470
    const v15, -0x40c51eb8    # -0.73f

    .line 471
    .line 472
    .line 473
    const v16, 0x3ec7ae14    # 0.39f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, -0x40b5c28f    # -0.79f

    .line 480
    .line 481
    .line 482
    const/high16 v2, -0x40200000    # -1.75f

    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x41800000    # 16.0f

    .line 488
    .line 489
    const v2, 0x419bae14    # 19.46f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const v18, -0x40970a3d    # -0.91f

    .line 498
    .line 499
    .line 500
    const v13, -0x413851ec    # -0.39f

    .line 501
    .line 502
    .line 503
    const v14, -0x41c7ae14    # -0.18f

    .line 504
    .line 505
    .line 506
    const v15, -0x413851ec    # -0.39f

    .line 507
    .line 508
    .line 509
    const v16, -0x40c51eb8    # -0.73f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 516
    .line 517
    const v2, -0x40b5c28f    # -0.79f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x419451ec    # 18.54f

    .line 524
    .line 525
    .line 526
    const/high16 v2, 0x41800000    # 16.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3f68f5c3    # 0.91f

    .line 532
    .line 533
    .line 534
    const/16 v18, 0x0

    .line 535
    .line 536
    const v13, 0x3e3851ec    # 0.18f

    .line 537
    .line 538
    .line 539
    const v14, -0x413851ec    # -0.39f

    .line 540
    .line 541
    .line 542
    const v15, 0x3f3ae148    # 0.73f

    .line 543
    .line 544
    .line 545
    const v16, -0x413851ec    # -0.39f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x418e0000    # 17.75f

    .line 552
    .line 553
    const/high16 v2, 0x41a20000    # 20.25f

    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const/16 v16, 0x3800

    .line 566
    .line 567
    const/16 v17, 0x0

    .line 568
    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v8, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const/high16 v9, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/high16 v12, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const/4 v14, 0x0

    .line 580
    const/4 v15, 0x0

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sput-object v0, Landroidx/compose/material/icons/rounded/GeneratingTokensKt;->_generatingTokens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-object v0
.end method
