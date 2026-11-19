.class public final Landroidx/compose/material/icons/sharp/SearchOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _searchOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSearchOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SearchOffKt;->_searchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SearchOff"

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
    const/high16 v4, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x40b5c28f    # -0.79f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x4170a3d7    # -0.28f

    .line 84
    .line 85
    .line 86
    const v6, -0x4175c28f    # -0.27f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x41800000    # 16.0f

    .line 93
    .line 94
    const/high16 v26, 0x41180000    # 9.5f

    .line 95
    .line 96
    const v21, 0x41768f5c    # 15.41f

    .line 97
    .line 98
    .line 99
    const v22, 0x414970a4    # 12.59f

    .line 100
    .line 101
    .line 102
    const/high16 v23, 0x41800000    # 16.0f

    .line 103
    .line 104
    const v24, 0x4131c28f    # 11.11f

    .line 105
    .line 106
    .line 107
    move-object/from16 v20, v2

    .line 108
    .line 109
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v25, 0x41180000    # 9.5f

    .line 113
    .line 114
    const/high16 v26, 0x40400000    # 3.0f

    .line 115
    .line 116
    const/high16 v21, 0x41800000    # 16.0f

    .line 117
    .line 118
    const v22, 0x40bd1eb8    # 5.91f

    .line 119
    .line 120
    .line 121
    const v23, 0x415170a4    # 13.09f

    .line 122
    .line 123
    .line 124
    const/high16 v24, 0x40400000    # 3.0f

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, 0x4041eb85    # 3.03f

    .line 130
    .line 131
    .line 132
    const/high16 v26, 0x41100000    # 9.0f

    .line 133
    .line 134
    const v21, 0x40c28f5c    # 6.08f

    .line 135
    .line 136
    .line 137
    const/high16 v22, 0x40400000    # 3.0f

    .line 138
    .line 139
    const v23, 0x4051eb85    # 3.28f

    .line 140
    .line 141
    .line 142
    const v24, 0x40b47ae1    # 5.64f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x400147ae    # 2.02f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41180000    # 9.5f

    .line 155
    .line 156
    const/high16 v26, 0x40a00000    # 5.0f

    .line 157
    .line 158
    const v21, 0x40a9999a    # 5.3f

    .line 159
    .line 160
    .line 161
    const/high16 v22, 0x40d80000    # 6.75f

    .line 162
    .line 163
    const v23, 0x40e5c28f    # 7.18f

    .line 164
    .line 165
    .line 166
    const/high16 v24, 0x40a00000    # 5.0f

    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x41600000    # 14.0f

    .line 172
    .line 173
    const/high16 v26, 0x41180000    # 9.5f

    .line 174
    .line 175
    const v21, 0x413fd70a    # 11.99f

    .line 176
    .line 177
    .line 178
    const/high16 v22, 0x40a00000    # 5.0f

    .line 179
    .line 180
    const/high16 v23, 0x41600000    # 14.0f

    .line 181
    .line 182
    const v24, 0x40e051ec    # 7.01f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x413fd70a    # 11.99f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x41180000    # 9.5f

    .line 192
    .line 193
    const/high16 v7, 0x41600000    # 14.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, -0x41000000    # -0.5f

    .line 199
    .line 200
    const v26, -0x42b33333    # -0.05f

    .line 201
    .line 202
    .line 203
    const v21, -0x41d1eb85    # -0.17f

    .line 204
    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const v23, -0x41570a3d    # -0.33f

    .line 209
    .line 210
    .line 211
    const v24, -0x430a3d71    # -0.03f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x400147ae    # 2.02f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v25, 0x41180000    # 9.5f

    .line 224
    .line 225
    const/high16 v26, 0x41800000    # 16.0f

    .line 226
    .line 227
    const v21, 0x4112b852    # 9.17f

    .line 228
    .line 229
    .line 230
    const v22, 0x417fd70a    # 15.99f

    .line 231
    .line 232
    .line 233
    const v23, 0x411547ae    # 9.33f

    .line 234
    .line 235
    .line 236
    const/high16 v24, 0x41800000    # 16.0f

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x40875c29    # 4.23f

    .line 242
    .line 243
    .line 244
    const v26, -0x40370a3d    # -1.57f

    .line 245
    .line 246
    .line 247
    const v21, 0x3fce147b    # 1.61f

    .line 248
    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const v23, 0x4045c28f    # 3.09f

    .line 253
    .line 254
    .line 255
    const v24, -0x40e8f5c3    # -0.59f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x416b5c29    # 14.71f

    .line 262
    .line 263
    .line 264
    const/high16 v6, 0x41600000    # 14.0f

    .line 265
    .line 266
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x3f4a3d71    # 0.79f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x40a00000    # 5.0f

    .line 276
    .line 277
    const v6, 0x409fae14    # 4.99f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, 0x41a3eb85    # 20.49f

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x41980000    # 19.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x41780000    # 15.5f

    .line 292
    .line 293
    const/high16 v6, 0x41600000    # 14.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    const/16 v16, 0x3800

    .line 306
    .line 307
    const/16 v17, 0x0

    .line 308
    .line 309
    const/high16 v6, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/high16 v8, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/4 v7, 0x0

    .line 314
    const/high16 v9, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/high16 v12, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const/4 v14, 0x0

    .line 320
    const/4 v15, 0x0

    .line 321
    const-string v4, ""

    .line 322
    .line 323
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 324
    .line 325
    .line 326
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 331
    .line 332
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 333
    .line 334
    .line 335
    move-result-wide v6

    .line 336
    const/4 v0, 0x0

    .line 337
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 351
    .line 352
    .line 353
    const v2, 0x40cf0a3d    # 6.47f

    .line 354
    .line 355
    .line 356
    const v4, 0x412d1eb8    # 10.82f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v2, 0x401e147b    # 2.47f

    .line 363
    .line 364
    .line 365
    const v4, -0x3fe1eb85    # -2.47f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v2, -0x3fe1eb85    # -2.47f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v2, -0x40ca3d71    # -0.71f

    .line 378
    .line 379
    .line 380
    const v4, 0x3f35c28f    # 0.71f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v2, 0x401e147b    # 2.47f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, -0x3fe1eb85    # -2.47f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v2, 0x3f35c28f    # 0.71f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v2, 0x401e147b    # 2.47f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v2, -0x40ca3d71    # -0.71f

    .line 414
    .line 415
    .line 416
    const v4, 0x3f35c28f    # 0.71f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v2, -0x3fe1eb85    # -2.47f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v2, 0x401e147b    # 2.47f

    .line 429
    .line 430
    .line 431
    const v4, -0x3fe1eb85    # -2.47f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    const/high16 v6, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    const-string v4, ""

    .line 448
    .line 449
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    sput-object v0, Landroidx/compose/material/icons/sharp/SearchOffKt;->_searchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-object v0
.end method
