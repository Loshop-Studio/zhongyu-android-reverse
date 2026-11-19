.class public final Landroidx/compose/material/icons/outlined/AgricultureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAgriculture(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Agriculture"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v23, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x40000000    # -2.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40400000    # 3.0f

    .line 107
    .line 108
    const/high16 v26, 0x41000000    # 8.0f

    .line 109
    .line 110
    const v21, 0x405ccccd    # 3.45f

    .line 111
    .line 112
    .line 113
    const/high16 v22, 0x40e00000    # 7.0f

    .line 114
    .line 115
    const/high16 v23, 0x40400000    # 3.0f

    .line 116
    .line 117
    const v24, 0x40ee6666    # 7.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v26, 0x41100000    # 9.0f

    .line 126
    .line 127
    const/high16 v21, 0x40400000    # 3.0f

    .line 128
    .line 129
    const v22, 0x4108cccd    # 8.55f

    .line 130
    .line 131
    .line 132
    const v23, 0x405ccccd    # 3.45f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x41100000    # 9.0f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v16, 0x3800

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/high16 v6, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41b00000    # 22.0f

    .line 196
    .line 197
    const v2, 0x4160f5c3    # 14.06f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41000000    # 8.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40000000    # -2.0f

    .line 209
    .line 210
    const/high16 v18, -0x40000000    # -2.0f

    .line 211
    .line 212
    const v14, -0x40733333    # -1.1f

    .line 213
    .line 214
    .line 215
    const v15, -0x4099999a    # -0.9f

    .line 216
    .line 217
    .line 218
    const/high16 v16, -0x40000000    # -2.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, -0x3f36b852    # -6.29f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x407851ec    # -1.06f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, -0x404b851f    # -1.41f

    .line 236
    .line 237
    .line 238
    const v2, 0x3fb47ae1    # 1.41f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x40ca3d71    # -0.71f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x411d1eb8    # 9.82f

    .line 251
    .line 252
    .line 253
    const v2, 0x40cb3333    # 6.35f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3f35c28f    # 0.71f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, -0x404b851f    # -1.41f

    .line 266
    .line 267
    .line 268
    const v2, 0x3fb47ae1    # 1.41f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x40d6b852    # 6.71f

    .line 275
    .line 276
    .line 277
    const/high16 v2, 0x41500000    # 13.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41100000    # 9.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v18, 0x40000000    # 2.0f

    .line 288
    .line 289
    const v14, 0x3f8ccccd    # 1.1f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x40000000    # 2.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x410f5c29    # 8.96f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x40cf5c29    # -0.69f

    .line 304
    .line 305
    .line 306
    const v18, -0x4123d70a    # -0.43f

    .line 307
    .line 308
    .line 309
    const v13, -0x419eb852    # -0.22f

    .line 310
    .line 311
    .line 312
    const v14, -0x41dc28f6    # -0.16f

    .line 313
    .line 314
    .line 315
    const v15, -0x4119999a    # -0.45f

    .line 316
    .line 317
    .line 318
    const v16, -0x41666666    # -0.3f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3f63d70a    # 0.89f

    .line 325
    .line 326
    .line 327
    const v2, -0x41333333    # -0.4f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x41a8f5c3    # -0.21f

    .line 334
    .line 335
    .line 336
    const v2, -0x41147ae1    # -0.46f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x4099999a    # -0.9f

    .line 343
    .line 344
    .line 345
    const v2, 0x3ecccccd    # 0.4f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x40c00000    # 6.0f

    .line 352
    .line 353
    const/high16 v18, 0x41200000    # 10.0f

    .line 354
    .line 355
    const v13, 0x40e851ec    # 7.26f

    .line 356
    .line 357
    .line 358
    const v14, 0x4122147b    # 10.13f

    .line 359
    .line 360
    .line 361
    const v15, 0x40d47ae1    # 6.64f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x41200000    # 10.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x403d70a4    # -1.52f

    .line 370
    .line 371
    .line 372
    const v18, 0x3e851eb8    # 0.26f

    .line 373
    .line 374
    .line 375
    const v13, -0x40f851ec    # -0.53f

    .line 376
    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const v15, -0x407ae148    # -1.04f

    .line 380
    .line 381
    .line 382
    const v16, 0x3de147ae    # 0.11f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x3f68f5c3    # 0.91f

    .line 389
    .line 390
    .line 391
    const v2, 0x3eae147b    # 0.34f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x410f5c29    # -0.47f

    .line 398
    .line 399
    .line 400
    const v2, 0x3e3851ec    # 0.18f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x4126b852    # 10.42f

    .line 407
    .line 408
    .line 409
    const/high16 v2, 0x40800000    # 4.0f

    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x3fe47ae1    # -2.43f

    .line 415
    .line 416
    .line 417
    const v18, 0x4013d70a    # 2.31f

    .line 418
    .line 419
    .line 420
    const v13, -0x407851ec    # -1.06f

    .line 421
    .line 422
    .line 423
    const v14, 0x3eeb851f    # 0.46f

    .line 424
    .line 425
    .line 426
    const v15, -0x400b851f    # -1.91f

    .line 427
    .line 428
    .line 429
    const v16, 0x3fa3d70a    # 1.28f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3f63d70a    # 0.89f

    .line 436
    .line 437
    .line 438
    const v2, 0x3ecccccd    # 0.4f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3eeb851f    # 0.46f

    .line 445
    .line 446
    .line 447
    const v2, -0x41a8f5c3    # -0.21f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, -0x4099999a    # -0.9f

    .line 454
    .line 455
    .line 456
    const v2, -0x41333333    # -0.4f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/high16 v18, 0x41700000    # 15.0f

    .line 465
    .line 466
    const v13, 0x3f90a3d7    # 1.13f

    .line 467
    .line 468
    .line 469
    const v14, 0x415bd70a    # 13.74f

    .line 470
    .line 471
    .line 472
    const/high16 v15, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const v16, 0x4165c28f    # 14.36f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x3e851eb8    # 0.26f

    .line 481
    .line 482
    .line 483
    const v18, 0x3fc28f5c    # 1.52f

    .line 484
    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const v14, 0x3f07ae14    # 0.53f

    .line 488
    .line 489
    .line 490
    const v15, 0x3de147ae    # 0.11f

    .line 491
    .line 492
    .line 493
    const v16, 0x3f851eb8    # 1.04f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x3f68f5c3    # 0.91f

    .line 500
    .line 501
    .line 502
    const v2, -0x4151eb85    # -0.34f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x3e3851ec    # 0.18f

    .line 509
    .line 510
    .line 511
    const v2, 0x3ef0a3d7    # 0.47f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3fb5c28f    # 1.42f

    .line 518
    .line 519
    .line 520
    const/high16 v2, 0x41880000    # 17.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x4013d70a    # 2.31f

    .line 526
    .line 527
    .line 528
    const v18, 0x401b851f    # 2.43f

    .line 529
    .line 530
    .line 531
    const v13, 0x3eeb851f    # 0.46f

    .line 532
    .line 533
    .line 534
    const v14, 0x3f87ae14    # 1.06f

    .line 535
    .line 536
    .line 537
    const v15, 0x3fa3d70a    # 1.28f

    .line 538
    .line 539
    .line 540
    const v16, 0x3ff47ae1    # 1.91f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, -0x409c28f6    # -0.89f

    .line 547
    .line 548
    .line 549
    const v2, 0x3ecccccd    # 0.4f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3eeb851f    # 0.46f

    .line 556
    .line 557
    .line 558
    const v2, 0x3e570a3d    # 0.21f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x3f666666    # 0.9f

    .line 565
    .line 566
    .line 567
    const v2, -0x41333333    # -0.4f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v17, 0x40c00000    # 6.0f

    .line 574
    .line 575
    const/high16 v18, 0x41a00000    # 20.0f

    .line 576
    .line 577
    const v13, 0x4097ae14    # 4.74f

    .line 578
    .line 579
    .line 580
    const v14, 0x419ef5c3    # 19.87f

    .line 581
    .line 582
    .line 583
    const v15, 0x40ab851f    # 5.36f

    .line 584
    .line 585
    .line 586
    const/high16 v16, 0x41a00000    # 20.0f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, 0x3fc28f5c    # 1.52f

    .line 592
    .line 593
    .line 594
    const v18, -0x417ae148    # -0.26f

    .line 595
    .line 596
    .line 597
    const v13, 0x3f07ae14    # 0.53f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const v15, 0x3f851eb8    # 1.04f

    .line 602
    .line 603
    .line 604
    const v16, -0x421eb852    # -0.11f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, -0x4151eb85    # -0.34f

    .line 611
    .line 612
    .line 613
    const v2, -0x40970a3d    # -0.91f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x3ef0a3d7    # 0.47f

    .line 620
    .line 621
    .line 622
    const v2, -0x41c7ae14    # -0.18f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x419ca3d7    # 19.58f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x41000000    # 8.0f

    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, 0x401b851f    # 2.43f

    .line 637
    .line 638
    .line 639
    const v18, -0x3fec28f6    # -2.31f

    .line 640
    .line 641
    .line 642
    const v13, 0x3f87ae14    # 1.06f

    .line 643
    .line 644
    .line 645
    const v14, -0x41147ae1    # -0.46f

    .line 646
    .line 647
    .line 648
    const v15, 0x3ff47ae1    # 1.91f

    .line 649
    .line 650
    .line 651
    const v16, -0x405c28f6    # -1.28f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x409c28f6    # -0.89f

    .line 658
    .line 659
    .line 660
    const v2, -0x41333333    # -0.4f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v0, 0x3e570a3d    # 0.21f

    .line 667
    .line 668
    .line 669
    const v2, -0x41147ae1    # -0.46f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x3f666666    # 0.9f

    .line 676
    .line 677
    .line 678
    const v2, 0x3ecccccd    # 0.4f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, 0x3e75c28f    # 0.24f

    .line 685
    .line 686
    .line 687
    const v18, -0x40ae147b    # -0.82f

    .line 688
    .line 689
    .line 690
    const v13, 0x3dcccccd    # 0.1f

    .line 691
    .line 692
    .line 693
    const v14, -0x417ae148    # -0.26f

    .line 694
    .line 695
    .line 696
    const v15, 0x3e3851ec    # 0.18f

    .line 697
    .line 698
    .line 699
    const v16, -0x40f5c28f    # -0.54f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x40a51eb8    # 5.16f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, 0x41800000    # 16.0f

    .line 712
    .line 713
    const/high16 v18, 0x41840000    # 16.5f

    .line 714
    .line 715
    const v13, 0x41803d71    # 16.03f

    .line 716
    .line 717
    .line 718
    const v14, 0x418147ae    # 16.16f

    .line 719
    .line 720
    .line 721
    const/high16 v15, 0x41800000    # 16.0f

    .line 722
    .line 723
    const v16, 0x4182a3d7    # 16.33f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v17, 0x40600000    # 3.5f

    .line 730
    .line 731
    const/high16 v18, 0x40600000    # 3.5f

    .line 732
    .line 733
    const/4 v13, 0x0

    .line 734
    const v14, 0x3ff70a3d    # 1.93f

    .line 735
    .line 736
    .line 737
    const v15, 0x3fc8f5c3    # 1.57f

    .line 738
    .line 739
    .line 740
    const/high16 v16, 0x40600000    # 3.5f

    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x40600000    # 3.5f

    .line 746
    .line 747
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 748
    .line 749
    const/high16 v4, 0x40600000    # 3.5f

    .line 750
    .line 751
    const v6, -0x40370a3d    # -1.57f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v17, 0x41b00000    # 22.0f

    .line 758
    .line 759
    const v18, 0x4160f5c3    # 14.06f

    .line 760
    .line 761
    .line 762
    const/high16 v13, 0x41b80000    # 23.0f

    .line 763
    .line 764
    const v14, 0x4178cccd    # 15.55f

    .line 765
    .line 766
    .line 767
    const v15, 0x41b4f5c3    # 22.62f

    .line 768
    .line 769
    .line 770
    const v16, 0x416b0a3d    # 14.69f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v0, 0x40c00000    # 6.0f

    .line 780
    .line 781
    const/high16 v2, 0x41900000    # 18.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 787
    .line 788
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 789
    .line 790
    const v13, -0x402b851f    # -1.66f

    .line 791
    .line 792
    .line 793
    const/4 v14, 0x0

    .line 794
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 795
    .line 796
    const v16, -0x40547ae1    # -1.34f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 803
    .line 804
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 805
    .line 806
    const/high16 v4, 0x40400000    # 3.0f

    .line 807
    .line 808
    const v6, 0x3fab851f    # 1.34f

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, 0x3fab851f    # 1.34f

    .line 815
    .line 816
    .line 817
    const/high16 v2, 0x40400000    # 3.0f

    .line 818
    .line 819
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x40f51eb8    # 7.66f

    .line 823
    .line 824
    .line 825
    const/high16 v2, 0x40c00000    # 6.0f

    .line 826
    .line 827
    const/high16 v4, 0x41900000    # 18.0f

    .line 828
    .line 829
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v0, 0x412deb85    # 10.87f

    .line 836
    .line 837
    .line 838
    const/high16 v2, 0x41600000    # 14.0f

    .line 839
    .line 840
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v17, -0x41fae148    # -0.13f

    .line 844
    .line 845
    .line 846
    const v18, -0x40fae148    # -0.52f

    .line 847
    .line 848
    .line 849
    const v13, -0x42dc28f6    # -0.04f

    .line 850
    .line 851
    .line 852
    const v14, -0x41c7ae14    # -0.18f

    .line 853
    .line 854
    .line 855
    const v15, -0x425c28f6    # -0.08f

    .line 856
    .line 857
    .line 858
    const v16, -0x414ccccd    # -0.35f

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v0, -0x40970a3d    # -0.91f

    .line 865
    .line 866
    .line 867
    const v2, 0x3eae147b    # 0.34f

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, -0x41c7ae14    # -0.18f

    .line 874
    .line 875
    .line 876
    const v2, -0x410f5c29    # -0.47f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, 0x412947ae    # 10.58f

    .line 883
    .line 884
    .line 885
    const/high16 v2, 0x41500000    # 13.0f

    .line 886
    .line 887
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v17, 0x3ed70a3d    # 0.42f

    .line 891
    .line 892
    .line 893
    const/16 v18, 0x0

    .line 894
    .line 895
    const/4 v13, 0x0

    .line 896
    const/4 v14, 0x0

    .line 897
    const v15, 0x3ed70a3d    # 0.42f

    .line 898
    .line 899
    .line 900
    const/16 v16, 0x0

    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v17, 0x40800000    # 4.0f

    .line 906
    .line 907
    const/high16 v18, -0x3f800000    # -4.0f

    .line 908
    .line 909
    const v13, 0x400d70a4    # 2.21f

    .line 910
    .line 911
    .line 912
    const/high16 v15, 0x40800000    # 4.0f

    .line 913
    .line 914
    const v16, -0x401ae148    # -1.79f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/high16 v0, 0x41000000    # 8.0f

    .line 921
    .line 922
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v0, 0x40a00000    # 5.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, 0x40a1999a    # 5.05f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v17, 0x419c0000    # 19.5f

    .line 937
    .line 938
    const/high16 v18, 0x41500000    # 13.0f

    .line 939
    .line 940
    const v13, 0x419eb852    # 19.84f

    .line 941
    .line 942
    .line 943
    const v14, 0x41507ae1    # 13.03f

    .line 944
    .line 945
    .line 946
    const v15, 0x419d5c29    # 19.67f

    .line 947
    .line 948
    .line 949
    const/high16 v16, 0x41500000    # 13.0f

    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v17, -0x3fe3d70a    # -2.44f

    .line 955
    .line 956
    .line 957
    const/high16 v18, 0x3f800000    # 1.0f

    .line 958
    .line 959
    const v13, -0x408ccccd    # -0.95f

    .line 960
    .line 961
    .line 962
    const/4 v14, 0x0

    .line 963
    const v15, -0x401851ec    # -1.81f

    .line 964
    .line 965
    .line 966
    const v16, 0x3ec28f5c    # 0.38f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v0, 0x412deb85    # 10.87f

    .line 973
    .line 974
    .line 975
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v0, 0x419c0000    # 19.5f

    .line 982
    .line 983
    const/high16 v2, 0x41900000    # 18.0f

    .line 984
    .line 985
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const/high16 v17, -0x40400000    # -1.5f

    .line 989
    .line 990
    const/high16 v18, -0x40400000    # -1.5f

    .line 991
    .line 992
    const v13, -0x40ab851f    # -0.83f

    .line 993
    .line 994
    .line 995
    const/high16 v15, -0x40400000    # -1.5f

    .line 996
    .line 997
    const v16, -0x40d47ae1    # -0.67f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const/high16 v0, -0x40400000    # -1.5f

    .line 1004
    .line 1005
    const/high16 v2, -0x40400000    # -1.5f

    .line 1006
    .line 1007
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1008
    .line 1009
    const v6, 0x3f2b851f    # 0.67f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v0, 0x3f2b851f    # 0.67f

    .line 1016
    .line 1017
    .line 1018
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1019
    .line 1020
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const v0, 0x41a2a3d7    # 20.33f

    .line 1024
    .line 1025
    .line 1026
    const/high16 v2, 0x419c0000    # 19.5f

    .line 1027
    .line 1028
    const/high16 v4, 0x41900000    # 18.0f

    .line 1029
    .line 1030
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    const/16 v16, 0x3800

    .line 1041
    .line 1042
    const/16 v17, 0x0

    .line 1043
    .line 1044
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1045
    .line 1046
    const/4 v7, 0x0

    .line 1047
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1048
    .line 1049
    const/4 v13, 0x0

    .line 1050
    const/4 v15, 0x0

    .line 1051
    const-string v4, ""

    .line 1052
    .line 1053
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    sput-object v0, Landroidx/compose/material/icons/outlined/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1062
    .line 1063
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    return-object v0
.end method
