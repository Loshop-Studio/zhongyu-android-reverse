.class public final Landroidx/compose/material/icons/twotone/SportsBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBar(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsBar"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, -0x3f2bd70a    # -6.63f

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v25, 0x403147ae    # 2.77f

    .line 90
    .line 91
    .line 92
    const v26, -0x400147ae    # -1.99f

    .line 93
    .line 94
    .line 95
    const v21, 0x3fa147ae    # 1.26f

    .line 96
    .line 97
    .line 98
    const v22, -0x4151eb85    # -0.34f

    .line 99
    .line 100
    .line 101
    const v23, 0x40070a3d    # 2.11f

    .line 102
    .line 103
    .line 104
    const v24, -0x405d70a4    # -1.27f

    .line 105
    .line 106
    .line 107
    move-object/from16 v20, v2

    .line 108
    .line 109
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v25, 0x41500000    # 13.0f

    .line 113
    .line 114
    const/high16 v26, 0x41100000    # 9.0f

    .line 115
    .line 116
    const v21, 0x4139999a    # 11.6f

    .line 117
    .line 118
    .line 119
    const v22, 0x4117851f    # 9.47f

    .line 120
    .line 121
    .line 122
    const v23, 0x414147ae    # 12.08f

    .line 123
    .line 124
    .line 125
    const/high16 v24, 0x41100000    # 9.0f

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41980000    # 19.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41280000    # 10.5f

    .line 144
    .line 145
    const/high16 v6, 0x40e00000    # 7.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, -0x40000000    # -2.0f

    .line 151
    .line 152
    const/high16 v26, -0x40000000    # -2.0f

    .line 153
    .line 154
    const v21, -0x40733333    # -1.1f

    .line 155
    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/high16 v23, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v24, -0x4099999a    # -0.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, 0x3faf5c29    # 1.37f

    .line 168
    .line 169
    .line 170
    const v26, -0x400f5c29    # -1.88f

    .line 171
    .line 172
    .line 173
    const/16 v21, 0x0

    .line 174
    .line 175
    const v22, -0x40a66666    # -0.85f

    .line 176
    .line 177
    .line 178
    const v23, 0x3f0ccccd    # 0.55f

    .line 179
    .line 180
    .line 181
    const v24, -0x40333333    # -1.6f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x4175c28f    # -0.27f

    .line 188
    .line 189
    .line 190
    const v6, 0x3f4ccccd    # 0.8f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, -0x40bd70a4    # -0.76f

    .line 197
    .line 198
    .line 199
    const v6, 0x3eb851ec    # 0.36f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v25, 0x41200000    # 10.0f

    .line 206
    .line 207
    const v26, 0x4080a3d7    # 4.02f

    .line 208
    .line 209
    .line 210
    const/high16 v21, 0x41000000    # 8.0f

    .line 211
    .line 212
    const v22, 0x4093d70a    # 4.62f

    .line 213
    .line 214
    .line 215
    const v23, 0x410f0a3d    # 8.94f

    .line 216
    .line 217
    .line 218
    const v24, 0x4080a3d7    # 4.02f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x3fdeb852    # 1.74f

    .line 225
    .line 226
    .line 227
    const v26, 0x3f266666    # 0.65f

    .line 228
    .line 229
    .line 230
    const v21, 0x3f4a3d71    # 0.79f

    .line 231
    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const v23, 0x3fb1eb85    # 1.39f

    .line 236
    .line 237
    .line 238
    const v24, 0x3eb33333    # 0.35f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x3f266666    # 0.65f

    .line 245
    .line 246
    .line 247
    const v6, 0x3f47ae14    # 0.78f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, 0x3fbc28f6    # 1.47f

    .line 254
    .line 255
    .line 256
    const v26, -0x415c28f6    # -0.32f

    .line 257
    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const v23, 0x3f23d70a    # 0.64f

    .line 262
    .line 263
    .line 264
    const v24, -0x415c28f6    # -0.32f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, 0x40000000    # 2.0f

    .line 271
    .line 272
    const/high16 v26, 0x40000000    # 2.0f

    .line 273
    .line 274
    const v21, 0x3f8ccccd    # 1.1f

    .line 275
    .line 276
    .line 277
    const/high16 v23, 0x40000000    # 2.0f

    .line 278
    .line 279
    const v24, 0x3f666666    # 0.9f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 286
    .line 287
    const/16 v26, 0x0

    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 292
    .line 293
    const/16 v24, 0x0

    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x40e00000    # 7.0f

    .line 299
    .line 300
    const/high16 v26, 0x41280000    # 10.5f

    .line 301
    .line 302
    const v21, 0x411ab852    # 9.67f

    .line 303
    .line 304
    .line 305
    const/high16 v22, 0x40e00000    # 7.0f

    .line 306
    .line 307
    const v23, 0x41126666    # 9.15f

    .line 308
    .line 309
    .line 310
    const/high16 v24, 0x41280000    # 10.5f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v21, 0x40e00000    # 7.0f

    .line 316
    .line 317
    const/high16 v22, 0x41280000    # 10.5f

    .line 318
    .line 319
    const/high16 v23, 0x40e00000    # 7.0f

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v4, 0x41280000    # 10.5f

    .line 325
    .line 326
    const/high16 v6, 0x40e00000    # 7.0f

    .line 327
    .line 328
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/16 v16, 0x3800

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const v6, 0x3e99999a    # 0.3f

    .line 343
    .line 344
    .line 345
    const v8, 0x3e99999a    # 0.3f

    .line 346
    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/high16 v9, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v12, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    const/4 v15, 0x0

    .line 356
    const-string v4, ""

    .line 357
    .line 358
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 359
    .line 360
    .line 361
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41700000    # 15.0f

    .line 389
    .line 390
    const/high16 v2, 0x41980000    # 19.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41000000    # 8.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x3f2bd70a    # -6.63f

    .line 401
    .line 402
    .line 403
    const/4 v2, 0x0

    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, 0x403147ae    # 2.77f

    .line 408
    .line 409
    .line 410
    const v18, -0x400147ae    # -1.99f

    .line 411
    .line 412
    .line 413
    const v13, 0x3fa147ae    # 1.26f

    .line 414
    .line 415
    .line 416
    const v14, -0x4151eb85    # -0.34f

    .line 417
    .line 418
    .line 419
    const v15, 0x40070a3d    # 2.11f

    .line 420
    .line 421
    .line 422
    const v16, -0x405d70a4    # -1.27f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x41500000    # 13.0f

    .line 429
    .line 430
    const/high16 v18, 0x41100000    # 9.0f

    .line 431
    .line 432
    const v13, 0x4139999a    # 11.6f

    .line 433
    .line 434
    .line 435
    const v14, 0x4117851f    # 9.47f

    .line 436
    .line 437
    .line 438
    const v15, 0x414147ae    # 12.08f

    .line 439
    .line 440
    .line 441
    const/high16 v16, 0x41100000    # 9.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41980000    # 19.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x400147ae    # 2.02f

    .line 460
    .line 461
    .line 462
    const/high16 v2, 0x41200000    # 10.0f

    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, -0x3f775c29    # -4.27f

    .line 468
    .line 469
    .line 470
    const v18, 0x402d70a4    # 2.71f

    .line 471
    .line 472
    .line 473
    const v13, -0x400e147b    # -1.89f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const v15, -0x3f9f5c29    # -3.51f

    .line 478
    .line 479
    .line 480
    const v16, 0x3f8e147b    # 1.11f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x40400000    # 3.0f

    .line 487
    .line 488
    const/high16 v18, 0x41080000    # 8.5f

    .line 489
    .line 490
    const v13, 0x4084cccd    # 4.15f

    .line 491
    .line 492
    .line 493
    const v14, 0x40a851ec    # 5.26f

    .line 494
    .line 495
    .line 496
    const/high16 v15, 0x40400000    # 3.0f

    .line 497
    .line 498
    const v16, 0x40d7ae14    # 6.74f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v18, 0x40770a3d    # 3.86f

    .line 505
    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const v14, 0x3fee147b    # 1.86f

    .line 509
    .line 510
    .line 511
    const v15, 0x3fa3d70a    # 1.28f

    .line 512
    .line 513
    .line 514
    const v16, 0x405a3d71    # 3.41f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x41a80000    # 21.0f

    .line 521
    .line 522
    const/high16 v2, 0x40c00000    # 6.0f

    .line 523
    .line 524
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41300000    # 11.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, -0x40000000    # -2.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x40000000    # 2.0f

    .line 543
    .line 544
    const/high16 v18, -0x40000000    # -2.0f

    .line 545
    .line 546
    const v13, 0x3f8ccccd    # 1.1f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/high16 v15, 0x40000000    # 2.0f

    .line 551
    .line 552
    const v16, -0x4099999a    # -0.9f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x3f400000    # -6.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, -0x40000000    # -2.0f

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, -0x40733333    # -1.1f

    .line 567
    .line 568
    .line 569
    const v15, -0x4099999a    # -0.9f

    .line 570
    .line 571
    .line 572
    const/high16 v16, -0x40000000    # -2.0f

    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x403851ec    # -1.56f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v17, 0x41900000    # 18.0f

    .line 584
    .line 585
    const/high16 v18, 0x40e00000    # 7.0f

    .line 586
    .line 587
    const v13, 0x418e51ec    # 17.79f

    .line 588
    .line 589
    .line 590
    const v14, 0x41068f5c    # 8.41f

    .line 591
    .line 592
    .line 593
    const/high16 v15, 0x41900000    # 18.0f

    .line 594
    .line 595
    const v16, 0x40f75c29    # 7.73f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, -0x3f800000    # -4.0f

    .line 602
    .line 603
    const/high16 v18, -0x3f800000    # -4.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const v14, -0x3ff28f5c    # -2.21f

    .line 607
    .line 608
    .line 609
    const v15, -0x401ae148    # -1.79f

    .line 610
    .line 611
    .line 612
    const/high16 v16, -0x3f800000    # -4.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, -0x40851eb8    # -0.98f

    .line 618
    .line 619
    .line 620
    const v18, 0x3e051eb8    # 0.13f

    .line 621
    .line 622
    .line 623
    const v13, -0x4151eb85    # -0.34f

    .line 624
    .line 625
    .line 626
    const/4 v14, 0x0

    .line 627
    const v15, -0x40d70a3d    # -0.66f

    .line 628
    .line 629
    .line 630
    const v16, 0x3d4ccccd    # 0.05f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x41200000    # 10.0f

    .line 637
    .line 638
    const v18, 0x400147ae    # 2.02f

    .line 639
    .line 640
    .line 641
    const v13, 0x41433333    # 12.2f

    .line 642
    .line 643
    .line 644
    const v14, 0x401ccccd    # 2.45f

    .line 645
    .line 646
    .line 647
    const v15, 0x41328f5c    # 11.16f

    .line 648
    .line 649
    .line 650
    const v16, 0x400147ae    # 2.02f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x400147ae    # 2.02f

    .line 657
    .line 658
    .line 659
    const/high16 v2, 0x41200000    # 10.0f

    .line 660
    .line 661
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x41280000    # 10.5f

    .line 668
    .line 669
    const/high16 v2, 0x40e00000    # 7.0f

    .line 670
    .line 671
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, -0x40000000    # -2.0f

    .line 675
    .line 676
    const/high16 v18, -0x40000000    # -2.0f

    .line 677
    .line 678
    const v13, -0x40733333    # -1.1f

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x0

    .line 682
    const/high16 v15, -0x40000000    # -2.0f

    .line 683
    .line 684
    const v16, -0x4099999a    # -0.9f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, 0x3faf5c29    # 1.37f

    .line 691
    .line 692
    .line 693
    const v18, -0x400f5c29    # -1.88f

    .line 694
    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const v14, -0x40a66666    # -0.85f

    .line 698
    .line 699
    .line 700
    const v15, 0x3f0ccccd    # 0.55f

    .line 701
    .line 702
    .line 703
    const v16, -0x40333333    # -1.6f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v0, -0x4175c28f    # -0.27f

    .line 710
    .line 711
    .line 712
    const v2, 0x3f4ccccd    # 0.8f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, -0x40bd70a4    # -0.76f

    .line 719
    .line 720
    .line 721
    const v2, 0x3eb851ec    # 0.36f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v17, 0x41200000    # 10.0f

    .line 728
    .line 729
    const v18, 0x4080a3d7    # 4.02f

    .line 730
    .line 731
    .line 732
    const/high16 v13, 0x41000000    # 8.0f

    .line 733
    .line 734
    const v14, 0x4093d70a    # 4.62f

    .line 735
    .line 736
    .line 737
    const v15, 0x410f0a3d    # 8.94f

    .line 738
    .line 739
    .line 740
    const v16, 0x4080a3d7    # 4.02f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v17, 0x3fdeb852    # 1.74f

    .line 747
    .line 748
    .line 749
    const v18, 0x3f266666    # 0.65f

    .line 750
    .line 751
    .line 752
    const v13, 0x3f4a3d71    # 0.79f

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const v15, 0x3fb1eb85    # 1.39f

    .line 757
    .line 758
    .line 759
    const v16, 0x3eb33333    # 0.35f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x3f266666    # 0.65f

    .line 766
    .line 767
    .line 768
    const v2, 0x3f47ae14    # 0.78f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v17, 0x3fbc28f6    # 1.47f

    .line 775
    .line 776
    .line 777
    const v18, -0x415c28f6    # -0.32f

    .line 778
    .line 779
    .line 780
    const/4 v13, 0x0

    .line 781
    const v15, 0x3f23d70a    # 0.64f

    .line 782
    .line 783
    .line 784
    const v16, -0x415c28f6    # -0.32f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v17, 0x40000000    # 2.0f

    .line 791
    .line 792
    const/high16 v18, 0x40000000    # 2.0f

    .line 793
    .line 794
    const v13, 0x3f8ccccd    # 1.1f

    .line 795
    .line 796
    .line 797
    const/high16 v15, 0x40000000    # 2.0f

    .line 798
    .line 799
    const v16, 0x3f666666    # 0.9f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 806
    .line 807
    const/16 v18, 0x0

    .line 808
    .line 809
    const/4 v13, 0x0

    .line 810
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 811
    .line 812
    const/16 v16, 0x0

    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const/high16 v17, 0x40e00000    # 7.0f

    .line 818
    .line 819
    const/high16 v18, 0x41280000    # 10.5f

    .line 820
    .line 821
    const v13, 0x411ab852    # 9.67f

    .line 822
    .line 823
    .line 824
    const/high16 v14, 0x40e00000    # 7.0f

    .line 825
    .line 826
    const v15, 0x41126666    # 9.15f

    .line 827
    .line 828
    .line 829
    const/high16 v16, 0x41280000    # 10.5f

    .line 830
    .line 831
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v13, 0x40e00000    # 7.0f

    .line 835
    .line 836
    const/high16 v14, 0x41280000    # 10.5f

    .line 837
    .line 838
    const/high16 v15, 0x40e00000    # 7.0f

    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v0, 0x41280000    # 10.5f

    .line 844
    .line 845
    const/high16 v2, 0x40e00000    # 7.0f

    .line 846
    .line 847
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x41880000    # 17.0f

    .line 854
    .line 855
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const/high16 v0, -0x3f400000    # -6.0f

    .line 859
    .line 860
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x40000000    # 2.0f

    .line 864
    .line 865
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, 0x40c00000    # 6.0f

    .line 869
    .line 870
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v0, 0x41880000    # 17.0f

    .line 874
    .line 875
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    const/16 v16, 0x3800

    .line 889
    .line 890
    const/16 v17, 0x0

    .line 891
    .line 892
    const/high16 v6, 0x3f800000    # 1.0f

    .line 893
    .line 894
    const/high16 v8, 0x3f800000    # 1.0f

    .line 895
    .line 896
    const/4 v7, 0x0

    .line 897
    const/high16 v12, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v13, 0x0

    .line 900
    const/4 v14, 0x0

    .line 901
    const/4 v15, 0x0

    .line 902
    const-string v4, ""

    .line 903
    .line 904
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 913
    .line 914
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    return-object v0
.end method
