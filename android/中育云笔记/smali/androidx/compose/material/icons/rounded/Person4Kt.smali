.class public final Landroidx/compose/material/icons/rounded/Person4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _person4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson4(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Person4Kt;->_person4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Person4"

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
    const v4, 0x41931eb8    # 18.39f

    .line 71
    .line 72
    .line 73
    const v6, 0x4168f5c3    # 14.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x41500000    # 13.0f

    .line 82
    .line 83
    const v21, 0x4185ae14    # 16.71f

    .line 84
    .line 85
    .line 86
    const v22, 0x415b3333    # 13.7f

    .line 87
    .line 88
    .line 89
    const v23, 0x41687ae1    # 14.53f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41500000    # 13.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f33851f    # -6.39f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fc7ae14    # 1.56f

    .line 103
    .line 104
    .line 105
    const v21, -0x3fde147b    # -2.53f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3f6947ae    # -4.71f

    .line 111
    .line 112
    .line 113
    const v24, 0x3f333333    # 0.7f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v26, 0x4189c28f    # 17.22f

    .line 122
    .line 123
    .line 124
    const v21, 0x4093851f    # 4.61f

    .line 125
    .line 126
    .line 127
    const v22, 0x41711eb8    # 15.07f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x40800000    # 4.0f

    .line 131
    .line 132
    const v24, 0x4180cccd    # 16.1f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40800000    # 4.0f

    .line 139
    .line 140
    const/high16 v6, 0x41900000    # 18.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, 0x40000000    # 2.0f

    .line 146
    .line 147
    const/high16 v26, 0x40000000    # 2.0f

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    const v22, 0x3f8ccccd    # 1.1f

    .line 152
    .line 153
    .line 154
    const v23, 0x3f666666    # 0.9f

    .line 155
    .line 156
    .line 157
    const/high16 v24, 0x40000000    # 2.0f

    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x41400000    # 12.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v26, -0x40000000    # -2.0f

    .line 168
    .line 169
    const v21, 0x3f8ccccd    # 1.1f

    .line 170
    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const/high16 v23, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v24, -0x4099999a    # -0.9f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const v6, -0x40b851ec    # -0.78f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, 0x41931eb8    # 18.39f

    .line 190
    .line 191
    .line 192
    const v26, 0x4168f5c3    # 14.56f

    .line 193
    .line 194
    .line 195
    const/high16 v21, 0x41a00000    # 20.0f

    .line 196
    .line 197
    const v22, 0x4180cccd    # 16.1f

    .line 198
    .line 199
    .line 200
    const v23, 0x419b1eb8    # 19.39f

    .line 201
    .line 202
    .line 203
    const v24, 0x41711eb8    # 15.07f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/16 v16, 0x3800

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/high16 v6, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v8, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/high16 v9, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v12, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v0, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x40800000    # 4.0f

    .line 270
    .line 271
    const/high16 v18, -0x3f800000    # -4.0f

    .line 272
    .line 273
    const v13, 0x400d70a4    # 2.21f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x40800000    # 4.0f

    .line 277
    .line 278
    const v16, -0x401ae148    # -1.79f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, -0x4050a3d7    # -1.37f

    .line 290
    .line 291
    .line 292
    const/4 v15, 0x0

    .line 293
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41680000    # 14.5f

    .line 299
    .line 300
    const/high16 v18, 0x40400000    # 3.0f

    .line 301
    .line 302
    const/high16 v13, 0x41800000    # 16.0f

    .line 303
    .line 304
    const v14, 0x406ae148    # 3.67f

    .line 305
    .line 306
    .line 307
    const v15, 0x417547ae    # 15.33f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x40400000    # 3.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x40600000    # -1.25f

    .line 316
    .line 317
    const v18, 0x3f2b851f    # 0.67f

    .line 318
    .line 319
    .line 320
    const v13, -0x40fae148    # -0.52f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const v15, -0x40851eb8    # -0.98f

    .line 325
    .line 326
    .line 327
    const v16, 0x3e8a3d71    # 0.27f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v17, 0x41400000    # 12.0f

    .line 334
    .line 335
    const/high16 v18, 0x40400000    # 3.0f

    .line 336
    .line 337
    const v13, 0x414fae14    # 12.98f

    .line 338
    .line 339
    .line 340
    const v14, 0x405147ae    # 3.27f

    .line 341
    .line 342
    .line 343
    const v15, 0x414851ec    # 12.52f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x40400000    # 3.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, -0x40600000    # -1.25f

    .line 352
    .line 353
    const v2, 0x3f2b851f    # 0.67f

    .line 354
    .line 355
    .line 356
    const v4, -0x40851eb8    # -0.98f

    .line 357
    .line 358
    .line 359
    const v6, 0x3e8a3d71    # 0.27f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x41180000    # 9.5f

    .line 366
    .line 367
    const v13, 0x4127ae14    # 10.48f

    .line 368
    .line 369
    .line 370
    const v15, 0x412051ec    # 10.02f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x41000000    # 8.0f

    .line 377
    .line 378
    const/high16 v18, 0x40900000    # 4.5f

    .line 379
    .line 380
    const v13, 0x410ab852    # 8.67f

    .line 381
    .line 382
    .line 383
    const/high16 v14, 0x40400000    # 3.0f

    .line 384
    .line 385
    const/high16 v15, 0x41000000    # 8.0f

    .line 386
    .line 387
    const v16, 0x406ae148    # 3.67f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    const/high16 v18, 0x40600000    # 3.5f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const v16, 0x4007ae14    # 2.12f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x41400000    # 12.0f

    .line 407
    .line 408
    const/high16 v18, 0x41400000    # 12.0f

    .line 409
    .line 410
    const/high16 v13, 0x41000000    # 8.0f

    .line 411
    .line 412
    const v14, 0x41235c29    # 10.21f

    .line 413
    .line 414
    .line 415
    const v15, 0x411ca3d7    # 9.79f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x41400000    # 12.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    const/16 v16, 0x3800

    .line 431
    .line 432
    const/16 v17, 0x0

    .line 433
    .line 434
    const/high16 v6, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/4 v7, 0x0

    .line 437
    const/high16 v12, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v13, 0x0

    .line 440
    const/4 v14, 0x0

    .line 441
    const/4 v15, 0x0

    .line 442
    const-string v4, ""

    .line 443
    .line 444
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    sput-object v0, Landroidx/compose/material/icons/rounded/Person4Kt;->_person4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 453
    .line 454
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    return-object v0
.end method
