.class public final Landroidx/compose/material/icons/outlined/InterpreterModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInterpreterMode(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/InterpreterModeKt;->_interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.InterpreterMode"

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
    const/high16 v0, 0x41a40000    # 20.5f

    .line 71
    .line 72
    const/high16 v2, 0x41840000    # 16.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40400000    # -1.5f

    .line 78
    .line 79
    const/high16 v18, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v13, -0x40ab851f    # -0.83f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40400000    # -1.5f

    .line 86
    .line 87
    const v16, -0x40d47ae1    # -0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, -0x40ab851f    # -0.83f

    .line 102
    .line 103
    .line 104
    const v15, 0x3f2b851f    # 0.67f

    .line 105
    .line 106
    .line 107
    const/high16 v16, -0x40400000    # -1.5f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3f2b851f    # 0.67f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 116
    .line 117
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41700000    # 15.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41a40000    # 20.5f

    .line 126
    .line 127
    const/high16 v18, 0x41840000    # 16.5f

    .line 128
    .line 129
    const/high16 v13, 0x41b00000    # 22.0f

    .line 130
    .line 131
    const v14, 0x417d47ae    # 15.83f

    .line 132
    .line 133
    .line 134
    const v15, 0x41aaa3d7    # 21.33f

    .line 135
    .line 136
    .line 137
    const/high16 v16, 0x41840000    # 16.5f

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41a00000    # 20.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x3f800000    # 1.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v18, -0x403ae148    # -1.54f

    .line 158
    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const v16, -0x403ae148    # -1.54f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40400000    # 3.0f

    .line 170
    .line 171
    const v18, -0x3fa28f5c    # -3.46f

    .line 172
    .line 173
    .line 174
    const v13, 0x3fd851ec    # 1.69f

    .line 175
    .line 176
    .line 177
    const v14, -0x418a3d71    # -0.24f

    .line 178
    .line 179
    .line 180
    const/high16 v15, 0x40400000    # 3.0f

    .line 181
    .line 182
    const v16, -0x40266666    # -1.7f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x40800000    # -1.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 194
    .line 195
    const/high16 v18, 0x40200000    # 2.5f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, 0x3fb0a3d7    # 1.38f

    .line 199
    .line 200
    .line 201
    const v15, -0x4070a3d7    # -1.12f

    .line 202
    .line 203
    .line 204
    const/high16 v16, 0x40200000    # 2.5f

    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x41830a3d    # 16.38f

    .line 210
    .line 211
    .line 212
    const/high16 v2, 0x41900000    # 18.0f

    .line 213
    .line 214
    const/high16 v4, 0x41700000    # 15.0f

    .line 215
    .line 216
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, -0x40800000    # -1.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x40400000    # 3.0f

    .line 225
    .line 226
    const v18, 0x405d70a4    # 3.46f

    .line 227
    .line 228
    .line 229
    const v14, 0x3fe147ae    # 1.76f

    .line 230
    .line 231
    .line 232
    const v15, 0x3fa7ae14    # 1.31f

    .line 233
    .line 234
    .line 235
    const v16, 0x404e147b    # 3.22f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x41a00000    # 20.0f

    .line 242
    .line 243
    const/high16 v18, 0x41a00000    # 20.0f

    .line 244
    .line 245
    const/high16 v13, 0x41a00000    # 20.0f

    .line 246
    .line 247
    const v14, 0x4193ae14    # 18.46f

    .line 248
    .line 249
    .line 250
    const/high16 v15, 0x41a00000    # 20.0f

    .line 251
    .line 252
    const/high16 v16, 0x41a00000    # 20.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41100000    # 9.0f

    .line 261
    .line 262
    const/high16 v2, 0x41400000    # 12.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, -0x3f800000    # -4.0f

    .line 268
    .line 269
    const/high16 v18, -0x3f800000    # -4.0f

    .line 270
    .line 271
    const v13, -0x3ff28f5c    # -2.21f

    .line 272
    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    const/high16 v15, -0x3f800000    # -4.0f

    .line 276
    .line 277
    const v16, -0x401ae148    # -1.79f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x40800000    # 4.0f

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, -0x3ff28f5c    # -2.21f

    .line 287
    .line 288
    .line 289
    const v15, 0x3fe51eb8    # 1.79f

    .line 290
    .line 291
    .line 292
    const/high16 v16, -0x3f800000    # -4.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3fab851f    # 1.34f

    .line 298
    .line 299
    .line 300
    const v18, 0x3e6b851f    # 0.23f

    .line 301
    .line 302
    .line 303
    const v13, 0x3ef0a3d7    # 0.47f

    .line 304
    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const v15, 0x3f6b851f    # 0.92f

    .line 308
    .line 309
    .line 310
    const v16, 0x3da3d70a    # 0.08f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x41100000    # 9.0f

    .line 317
    .line 318
    const/high16 v18, 0x41000000    # 8.0f

    .line 319
    .line 320
    const/high16 v13, 0x41180000    # 9.5f

    .line 321
    .line 322
    const v14, 0x40a851ec    # 5.26f

    .line 323
    .line 324
    .line 325
    const/high16 v15, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v16, 0x40d23d71    # 6.57f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3fab851f    # 1.34f

    .line 334
    .line 335
    .line 336
    const v18, 0x407147ae    # 3.77f

    .line 337
    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, 0x3fb70a3d    # 1.43f

    .line 341
    .line 342
    .line 343
    const/high16 v15, 0x3f000000    # 0.5f

    .line 344
    .line 345
    const v16, 0x402f5c29    # 2.74f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x41100000    # 9.0f

    .line 352
    .line 353
    const/high16 v18, 0x41400000    # 12.0f

    .line 354
    .line 355
    const v13, 0x411eb852    # 9.92f

    .line 356
    .line 357
    .line 358
    const v14, 0x413eb852    # 11.92f

    .line 359
    .line 360
    .line 361
    const v15, 0x4117851f    # 9.47f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x41400000    # 12.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40e3851f    # 7.11f

    .line 373
    .line 374
    .line 375
    const v2, 0x4152147b    # 13.13f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x40a00000    # 5.0f

    .line 382
    .line 383
    const v18, 0x4189c28f    # 17.22f

    .line 384
    .line 385
    .line 386
    const v13, 0x40b947ae    # 5.79f

    .line 387
    .line 388
    .line 389
    const v14, 0x4160cccd    # 14.05f

    .line 390
    .line 391
    .line 392
    const/high16 v15, 0x40a00000    # 5.0f

    .line 393
    .line 394
    const v16, 0x41791eb8    # 15.57f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41a00000    # 20.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x3f800000    # 1.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x3fce147b    # -2.78f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x3fce147b    # 1.61f

    .line 417
    .line 418
    .line 419
    const v18, -0x3fd5c28f    # -2.66f

    .line 420
    .line 421
    .line 422
    const/4 v13, 0x0

    .line 423
    const v14, -0x4070a3d7    # -1.12f

    .line 424
    .line 425
    .line 426
    const v15, 0x3f1c28f6    # 0.61f

    .line 427
    .line 428
    .line 429
    const v16, -0x3ff66666    # -2.15f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x40e3851f    # 7.11f

    .line 436
    .line 437
    .line 438
    const v18, 0x4152147b    # 13.13f

    .line 439
    .line 440
    .line 441
    const v13, 0x40766666    # 3.85f

    .line 442
    .line 443
    .line 444
    const v14, 0x415eb852    # 13.92f

    .line 445
    .line 446
    .line 447
    const v15, 0x40abd70a    # 5.37f

    .line 448
    .line 449
    .line 450
    const v16, 0x4155eb85    # 13.37f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41300000    # 11.0f

    .line 460
    .line 461
    const/high16 v2, 0x41000000    # 8.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x40800000    # 4.0f

    .line 467
    .line 468
    const/high16 v18, -0x3f800000    # -4.0f

    .line 469
    .line 470
    const/4 v13, 0x0

    .line 471
    const v14, -0x3ff28f5c    # -2.21f

    .line 472
    .line 473
    .line 474
    const v15, 0x3fe51eb8    # 1.79f

    .line 475
    .line 476
    .line 477
    const/high16 v16, -0x3f800000    # -4.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3fe51eb8    # 1.79f

    .line 483
    .line 484
    .line 485
    const/high16 v2, 0x40800000    # 4.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x3f800000    # -4.0f

    .line 491
    .line 492
    const/high16 v18, 0x40800000    # 4.0f

    .line 493
    .line 494
    const v14, 0x400d70a4    # 2.21f

    .line 495
    .line 496
    .line 497
    const v15, -0x401ae148    # -1.79f

    .line 498
    .line 499
    .line 500
    const/high16 v16, 0x40800000    # 4.0f

    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x41235c29    # 10.21f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x41300000    # 11.0f

    .line 509
    .line 510
    const/high16 v4, 0x41000000    # 8.0f

    .line 511
    .line 512
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41500000    # 13.0f

    .line 519
    .line 520
    const/high16 v2, 0x41000000    # 8.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/high16 v18, 0x40000000    # 2.0f

    .line 528
    .line 529
    const v14, 0x3f8ccccd    # 1.1f

    .line 530
    .line 531
    .line 532
    const v15, 0x3f666666    # 0.9f

    .line 533
    .line 534
    .line 535
    const/high16 v16, 0x40000000    # 2.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, -0x4099999a    # -0.9f

    .line 541
    .line 542
    .line 543
    const/high16 v2, -0x40000000    # -2.0f

    .line 544
    .line 545
    const/high16 v4, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, -0x40000000    # -2.0f

    .line 551
    .line 552
    const/high16 v18, -0x40000000    # -2.0f

    .line 553
    .line 554
    const v14, -0x40733333    # -1.1f

    .line 555
    .line 556
    .line 557
    const v15, -0x4099999a    # -0.9f

    .line 558
    .line 559
    .line 560
    const/high16 v16, -0x40000000    # -2.0f

    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40dccccd    # 6.9f

    .line 566
    .line 567
    .line 568
    const/high16 v2, 0x41500000    # 13.0f

    .line 569
    .line 570
    const/high16 v4, 0x41000000    # 8.0f

    .line 571
    .line 572
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41700000    # 15.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x3f50a3d7    # -5.48f

    .line 584
    .line 585
    .line 586
    const v18, 0x3fab851f    # 1.34f

    .line 587
    .line 588
    .line 589
    const v13, -0x3fe851ec    # -2.37f

    .line 590
    .line 591
    .line 592
    const/4 v14, 0x0

    .line 593
    const v15, -0x3f76b852    # -4.29f

    .line 594
    .line 595
    .line 596
    const v16, 0x3f3ae148    # 0.73f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, 0x41100000    # 9.0f

    .line 603
    .line 604
    const v18, 0x4189c28f    # 17.22f

    .line 605
    .line 606
    .line 607
    const v13, 0x41133333    # 9.2f

    .line 608
    .line 609
    .line 610
    const/high16 v14, 0x41840000    # 16.5f

    .line 611
    .line 612
    const/high16 v15, 0x41100000    # 9.0f

    .line 613
    .line 614
    const v16, 0x4186b852    # 16.84f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x41900000    # 18.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x40e570a4    # 7.17f

    .line 626
    .line 627
    .line 628
    const/4 v2, 0x0

    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x4009999a    # 2.15f

    .line 633
    .line 634
    .line 635
    const/high16 v18, 0x40000000    # 2.0f

    .line 636
    .line 637
    const/high16 v13, 0x3f000000    # 0.5f

    .line 638
    .line 639
    const v14, 0x3f5c28f6    # 0.86f

    .line 640
    .line 641
    .line 642
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 643
    .line 644
    const v16, 0x3fc7ae14    # 1.56f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x40e00000    # 7.0f

    .line 651
    .line 652
    const/high16 v2, 0x41a00000    # 20.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x3fce147b    # -2.78f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x3fce147b    # 1.61f

    .line 664
    .line 665
    .line 666
    const v18, -0x3fd5c28f    # -2.66f

    .line 667
    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    const v14, -0x4070a3d7    # -1.12f

    .line 671
    .line 672
    .line 673
    const v15, 0x3f1c28f6    # 0.61f

    .line 674
    .line 675
    .line 676
    const v16, -0x3ff66666    # -2.15f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v17, 0x41700000    # 15.0f

    .line 683
    .line 684
    const/high16 v18, 0x41500000    # 13.0f

    .line 685
    .line 686
    const v13, 0x4124a3d7    # 10.29f

    .line 687
    .line 688
    .line 689
    const v14, 0x415b3333    # 13.7f

    .line 690
    .line 691
    .line 692
    const v15, 0x4147851f    # 12.47f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x41500000    # 13.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, 0x3f91eb85    # 1.14f

    .line 701
    .line 702
    .line 703
    const v18, 0x3d4ccccd    # 0.05f

    .line 704
    .line 705
    .line 706
    const v13, 0x3ec7ae14    # 0.39f

    .line 707
    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    const v15, 0x3f451eb8    # 0.77f

    .line 711
    .line 712
    .line 713
    const v16, 0x3ca3d70a    # 0.02f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, -0x40e147ae    # -0.62f

    .line 720
    .line 721
    .line 722
    const v18, 0x3ffae148    # 1.96f

    .line 723
    .line 724
    .line 725
    const v13, -0x41570a3d    # -0.33f

    .line 726
    .line 727
    .line 728
    const v14, 0x3f170a3d    # 0.59f

    .line 729
    .line 730
    .line 731
    const v15, -0x40f33333    # -0.55f

    .line 732
    .line 733
    .line 734
    const v16, 0x3fa147ae    # 1.26f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v17, 0x41700000    # 15.0f

    .line 741
    .line 742
    const/high16 v18, 0x41700000    # 15.0f

    .line 743
    .line 744
    const v13, 0x4175999a    # 15.35f

    .line 745
    .line 746
    .line 747
    const/high16 v14, 0x41700000    # 15.0f

    .line 748
    .line 749
    const v15, 0x4172e148    # 15.18f

    .line 750
    .line 751
    .line 752
    const/high16 v16, 0x41700000    # 15.0f

    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    const/16 v16, 0x3800

    .line 765
    .line 766
    const/16 v17, 0x0

    .line 767
    .line 768
    const/high16 v6, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/high16 v8, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/4 v7, 0x0

    .line 773
    const/high16 v9, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/high16 v12, 0x3f800000    # 1.0f

    .line 776
    .line 777
    const/4 v13, 0x0

    .line 778
    const/4 v14, 0x0

    .line 779
    const/4 v15, 0x0

    .line 780
    const-string v4, ""

    .line 781
    .line 782
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    sput-object v0, Landroidx/compose/material/icons/outlined/InterpreterModeKt;->_interpreterMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 791
    .line 792
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    return-object v0
.end method
