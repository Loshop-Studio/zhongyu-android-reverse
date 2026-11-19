.class public final Landroidx/compose/material/icons/outlined/RemoveShoppingCartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRemoveShoppingCart(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.RemoveShoppingCart"

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
    const v0, 0x3f90a3d7    # 1.13f

    .line 71
    .line 72
    .line 73
    const v2, 0x3fb47ae1    # 1.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    const v2, 0x40228f5c    # 2.54f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, 0x408c7ae1    # 4.39f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v0, 0x400d70a4    # 2.21f

    .line 93
    .line 94
    .line 95
    const v2, 0x40951eb8    # 4.66f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x40533333    # -1.35f

    .line 102
    .line 103
    .line 104
    const v2, 0x401ccccd    # 2.45f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, -0x41800000    # -0.25f

    .line 111
    .line 112
    const v18, 0x3f75c28f    # 0.96f

    .line 113
    .line 114
    .line 115
    const v13, -0x41dc28f6    # -0.16f

    .line 116
    .line 117
    .line 118
    const v14, 0x3e8f5c29    # 0.28f

    .line 119
    .line 120
    .line 121
    const/high16 v15, -0x41800000    # -0.25f

    .line 122
    .line 123
    const v16, 0x3f1c28f6    # 0.61f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x40000000    # 2.0f

    .line 130
    .line 131
    const/high16 v18, 0x40000000    # 2.0f

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3f8ccccd    # 1.1f

    .line 135
    .line 136
    .line 137
    const v15, 0x3f666666    # 0.9f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x40000000    # 2.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x40eeb852    # 7.46f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3fb0a3d7    # 1.38f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x40ab851f    # -0.83f

    .line 158
    .line 159
    .line 160
    const v18, 0x3fcf5c29    # 1.62f

    .line 161
    .line 162
    .line 163
    const/high16 v13, -0x41000000    # -0.5f

    .line 164
    .line 165
    const v14, 0x3eb851ec    # 0.36f

    .line 166
    .line 167
    .line 168
    const v15, -0x40ab851f    # -0.83f

    .line 169
    .line 170
    .line 171
    const v16, 0x3f733333    # 0.95f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3ffeb852    # 1.99f

    .line 178
    .line 179
    .line 180
    const/high16 v18, 0x40000000    # 2.0f

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const v14, 0x3f8ccccd    # 1.1f

    .line 184
    .line 185
    .line 186
    const v15, 0x3f63d70a    # 0.89f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x40000000    # 2.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x3fcf5c29    # 1.62f

    .line 195
    .line 196
    .line 197
    const v18, -0x40a8f5c3    # -0.84f

    .line 198
    .line 199
    .line 200
    const v13, 0x3f2b851f    # 0.67f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const v15, 0x3fa147ae    # 1.26f

    .line 205
    .line 206
    .line 207
    const v16, -0x41570a3d    # -0.33f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x41abae14    # 21.46f

    .line 214
    .line 215
    .line 216
    const/high16 v2, 0x41c00000    # 24.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, -0x404b851f    # -1.41f

    .line 222
    .line 223
    .line 224
    const v2, 0x3fb47ae1    # 1.41f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x3f90a3d7    # 1.13f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41700000    # 15.0f

    .line 240
    .line 241
    const/high16 v2, 0x40e00000    # 7.0f

    .line 242
    .line 243
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x3f8ccccd    # 1.1f

    .line 247
    .line 248
    .line 249
    const/high16 v2, -0x40000000    # -2.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x40170a3d    # 2.36f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40000000    # 2.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40e00000    # 7.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41a00000    # 20.0f

    .line 274
    .line 275
    const/high16 v2, 0x40800000    # 4.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x40e3d70a    # 7.12f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x40000000    # 2.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x41130a3d    # 9.19f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3fcf5c29    # -2.76f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x40a00000    # 5.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x4047ae14    # -1.44f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x3ff851ec    # 1.94f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 318
    .line 319
    const v18, -0x4087ae14    # -0.97f

    .line 320
    .line 321
    .line 322
    const v13, 0x3f0a3d71    # 0.54f

    .line 323
    .line 324
    .line 325
    const v14, -0x41f0a3d7    # -0.14f

    .line 326
    .line 327
    .line 328
    const v15, 0x3f7d70a4    # 0.99f

    .line 329
    .line 330
    .line 331
    const v16, -0x41051eb8    # -0.49f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x40651eb8    # 3.58f

    .line 338
    .line 339
    .line 340
    const v2, -0x3f3051ec    # -6.49f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41a00000    # 20.0f

    .line 347
    .line 348
    const/high16 v18, 0x40800000    # 4.0f

    .line 349
    .line 350
    const/high16 v13, 0x41aa0000    # 21.25f

    .line 351
    .line 352
    const v14, 0x409a3d71    # 4.82f

    .line 353
    .line 354
    .line 355
    const v15, 0x41a6147b    # 20.76f

    .line 356
    .line 357
    .line 358
    const/high16 v16, 0x40800000    # 4.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41900000    # 18.0f

    .line 367
    .line 368
    const/high16 v2, 0x40e00000    # 7.0f

    .line 369
    .line 370
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x400147ae    # -1.99f

    .line 374
    .line 375
    .line 376
    const/high16 v18, 0x40000000    # 2.0f

    .line 377
    .line 378
    const v13, -0x40733333    # -1.1f

    .line 379
    .line 380
    .line 381
    const/4 v14, 0x0

    .line 382
    const v15, -0x400147ae    # -1.99f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f666666    # 0.9f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40bccccd    # 5.9f

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x41b00000    # 22.0f

    .line 395
    .line 396
    const/high16 v4, 0x40e00000    # 7.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x4099999a    # -0.9f

    .line 402
    .line 403
    .line 404
    const/high16 v2, -0x40000000    # -2.0f

    .line 405
    .line 406
    const/high16 v4, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/16 v16, 0x3800

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const/high16 v6, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v8, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v7, 0x0

    .line 430
    const/high16 v9, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v12, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sput-object v0, Landroidx/compose/material/icons/outlined/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-object v0
.end method
