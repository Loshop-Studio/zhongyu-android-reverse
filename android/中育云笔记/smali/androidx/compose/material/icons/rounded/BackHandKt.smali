.class public final Landroidx/compose/material/icons/rounded/BackHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _backHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBackHand(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BackHand"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

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
    const/4 v13, 0x0

    .line 82
    const v14, 0x408d70a4    # 4.42f

    .line 83
    .line 84
    .line 85
    const v15, -0x3f9ae148    # -3.58f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x41000000    # 8.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x3f133333    # -7.4f

    .line 94
    .line 95
    .line 96
    const v18, -0x3f5f5c29    # -5.02f

    .line 97
    .line 98
    .line 99
    const v13, -0x3faf5c29    # -3.26f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const v15, -0x3f39eb85    # -6.19f

    .line 104
    .line 105
    .line 106
    const v16, -0x400147ae    # -1.99f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3fbe147b    # -3.03f

    .line 113
    .line 114
    .line 115
    const v2, -0x3f0c7ae1    # -7.61f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x4073d70a    # 3.81f

    .line 122
    .line 123
    .line 124
    const v18, 0x4120cccd    # 10.05f

    .line 125
    .line 126
    .line 127
    const v13, 0x4010a3d7    # 2.26f

    .line 128
    .line 129
    .line 130
    const v14, 0x412947ae    # 10.58f

    .line 131
    .line 132
    .line 133
    const/high16 v15, 0x40400000    # 3.0f

    .line 134
    .line 135
    const v16, 0x411ca3d7    # 9.79f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x3f4a3d71    # 0.79f

    .line 142
    .line 143
    .line 144
    const v2, 0x3e851eb8    # 0.26f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, 0x3f9eb852    # 1.24f

    .line 151
    .line 152
    .line 153
    const v18, 0x3f947ae1    # 1.16f

    .line 154
    .line 155
    .line 156
    const v13, 0x3f0f5c29    # 0.56f

    .line 157
    .line 158
    .line 159
    const v14, 0x3e3851ec    # 0.18f

    .line 160
    .line 161
    .line 162
    const v15, 0x3f828f5c    # 1.02f

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
    const v0, 0x3fa3d70a    # 1.28f

    .line 172
    .line 173
    .line 174
    const v2, 0x404d70a4    # 3.21f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x40f28f5c    # 7.58f

    .line 181
    .line 182
    .line 183
    const/high16 v18, 0x41700000    # 15.0f

    .line 184
    .line 185
    const v13, 0x40e66666    # 7.2f

    .line 186
    .line 187
    .line 188
    const v14, 0x416e147b    # 14.88f

    .line 189
    .line 190
    .line 191
    const v15, 0x40ec28f6    # 7.38f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x41700000    # 15.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41000000    # 8.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40500000    # 3.25f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x41140000    # 9.25f

    .line 210
    .line 211
    const/high16 v18, 0x40000000    # 2.0f

    .line 212
    .line 213
    const/high16 v13, 0x41000000    # 8.0f

    .line 214
    .line 215
    const v14, 0x4023d70a    # 2.56f

    .line 216
    .line 217
    .line 218
    const v15, 0x4108f5c3    # 8.56f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f0f5c29    # 0.56f

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41040000    # 8.25f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x3f000000    # 0.5f

    .line 240
    .line 241
    const/high16 v18, 0x3f000000    # 0.5f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const v14, 0x3e8f5c29    # 0.28f

    .line 245
    .line 246
    .line 247
    const v15, 0x3e6147ae    # 0.22f

    .line 248
    .line 249
    .line 250
    const/high16 v16, 0x3f000000    # 0.5f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v18, -0x41000000    # -0.5f

    .line 260
    .line 261
    const v13, 0x3e8f5c29    # 0.28f

    .line 262
    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const/high16 v15, 0x3f000000    # 0.5f

    .line 266
    .line 267
    const v16, -0x419eb852    # -0.22f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x414c0000    # 12.75f

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/high16 v13, 0x41380000    # 11.5f

    .line 283
    .line 284
    const v14, 0x3f0f5c29    # 0.56f

    .line 285
    .line 286
    .line 287
    const v15, 0x4140f5c3    # 12.06f

    .line 288
    .line 289
    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41600000    # 14.0f

    .line 296
    .line 297
    const v2, 0x3f0f5c29    # 0.56f

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41380000    # 11.5f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x3f000000    # 0.5f

    .line 311
    .line 312
    const/high16 v18, 0x3f000000    # 0.5f

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, 0x3e8f5c29    # 0.28f

    .line 316
    .line 317
    .line 318
    const v15, 0x3e6147ae    # 0.22f

    .line 319
    .line 320
    .line 321
    const/high16 v16, 0x3f000000    # 0.5f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/4 v0, 0x0

    .line 327
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v18, -0x41000000    # -0.5f

    .line 331
    .line 332
    const v13, 0x3e8f5c29    # 0.28f

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const/high16 v15, 0x3f000000    # 0.5f

    .line 337
    .line 338
    const v16, -0x419eb852    # -0.22f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40300000    # 2.75f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 350
    .line 351
    const/high16 v18, -0x40600000    # -1.25f

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const v14, -0x40cf5c29    # -0.69f

    .line 355
    .line 356
    .line 357
    const v15, 0x3f0f5c29    # 0.56f

    .line 358
    .line 359
    .line 360
    const/high16 v16, -0x40600000    # -1.25f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 366
    .line 367
    const v13, 0x3f30a3d7    # 0.69f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 372
    .line 373
    const v16, 0x3f0f5c29    # 0.56f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x410c0000    # 8.75f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x3f000000    # 0.5f

    .line 385
    .line 386
    const/high16 v18, 0x3f000000    # 0.5f

    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const v14, 0x3e8f5c29    # 0.28f

    .line 390
    .line 391
    .line 392
    const v15, 0x3e6147ae    # 0.22f

    .line 393
    .line 394
    .line 395
    const/high16 v16, 0x3f000000    # 0.5f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/4 v0, 0x0

    .line 401
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v18, -0x41000000    # -0.5f

    .line 405
    .line 406
    const v13, 0x3e8f5c29    # 0.28f

    .line 407
    .line 408
    .line 409
    const/4 v14, 0x0

    .line 410
    const/high16 v15, 0x3f000000    # 0.5f

    .line 411
    .line 412
    const v16, -0x419eb852    # -0.22f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40b80000    # 5.75f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 424
    .line 425
    const/high16 v18, -0x40600000    # -1.25f

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, -0x40cf5c29    # -0.69f

    .line 429
    .line 430
    .line 431
    const v15, 0x3f0f5c29    # 0.56f

    .line 432
    .line 433
    .line 434
    const/high16 v16, -0x40600000    # -1.25f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40a1eb85    # 5.06f

    .line 440
    .line 441
    .line 442
    const/high16 v2, 0x40b80000    # 5.75f

    .line 443
    .line 444
    const/high16 v4, 0x41a80000    # 21.0f

    .line 445
    .line 446
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41800000    # 16.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const/16 v16, 0x3800

    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    const/high16 v6, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v8, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const/high16 v9, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v12, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sput-object v0, Landroidx/compose/material/icons/rounded/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    return-object v0
.end method
