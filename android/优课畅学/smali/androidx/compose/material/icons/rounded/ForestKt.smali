.class public final Landroidx/compose/material/icons/rounded/ForestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _forest:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForest(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ForestKt;->_forest:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Forest"

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
    const v4, 0x41623d71    # 14.14f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x428a3d71    # -0.06f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x3f51eb85    # 0.82f

    .line 85
    .line 86
    .line 87
    const v26, -0x40370a3d    # -1.57f

    .line 88
    .line 89
    .line 90
    const v21, 0x3f4f5c29    # 0.81f

    .line 91
    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const v23, 0x3fa3d70a    # 1.28f

    .line 96
    .line 97
    .line 98
    const v24, -0x40970a3d    # -0.91f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x411d1eb8    # 9.82f

    .line 107
    .line 108
    .line 109
    const v6, 0x404ae148    # 3.17f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, -0x402e147b    # -1.64f

    .line 116
    .line 117
    .line 118
    const/16 v26, 0x0

    .line 119
    .line 120
    const v21, -0x41333333    # -0.4f

    .line 121
    .line 122
    .line 123
    const v22, -0x40ee147b    # -0.57f

    .line 124
    .line 125
    .line 126
    const v23, -0x406147ae    # -1.24f

    .line 127
    .line 128
    .line 129
    const v24, -0x40ee147b    # -0.57f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x40466666    # 3.1f

    .line 136
    .line 137
    .line 138
    const v6, 0x4126e148    # 10.43f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x407ae148    # 3.92f

    .line 145
    .line 146
    .line 147
    const/high16 v26, 0x41400000    # 12.0f

    .line 148
    .line 149
    const v21, 0x4028f5c3    # 2.64f

    .line 150
    .line 151
    .line 152
    const v22, 0x413170a4    # 11.09f

    .line 153
    .line 154
    .line 155
    const v23, 0x40470a3d    # 3.11f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x41400000    # 12.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x40770a3d    # 3.86f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, -0x3fc851ec    # -2.87f

    .line 170
    .line 171
    .line 172
    const v6, 0x408eb852    # 4.46f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x3fea3d71    # 1.83f

    .line 179
    .line 180
    .line 181
    const/high16 v26, 0x41900000    # 18.0f

    .line 182
    .line 183
    const v21, 0x3f0f5c29    # 0.56f

    .line 184
    .line 185
    .line 186
    const v22, 0x4188f5c3    # 17.12f

    .line 187
    .line 188
    .line 189
    const v23, 0x3f851eb8    # 1.04f

    .line 190
    .line 191
    .line 192
    const/high16 v24, 0x41900000    # 18.0f

    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x40e00000    # 7.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v25, 0x40000000    # 2.0f

    .line 208
    .line 209
    const/high16 v26, 0x40000000    # 2.0f

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const v22, 0x3f8ccccd    # 1.1f

    .line 214
    .line 215
    .line 216
    const v23, 0x3f666666    # 0.9f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, -0x4099999a    # -0.9f

    .line 225
    .line 226
    .line 227
    const/high16 v6, -0x40000000    # -2.0f

    .line 228
    .line 229
    const/high16 v7, 0x40000000    # 2.0f

    .line 230
    .line 231
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, -0x40000000    # -2.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x40a570a4    # 5.17f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x3f570a3d    # 0.84f

    .line 246
    .line 247
    .line 248
    const v26, -0x403ae148    # -1.54f

    .line 249
    .line 250
    .line 251
    const v21, 0x3f4a3d71    # 0.79f

    .line 252
    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const v23, 0x3fa28f5c    # 1.27f

    .line 257
    .line 258
    .line 259
    const v24, -0x409eb852    # -0.88f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, 0x41623d71    # 14.14f

    .line 266
    .line 267
    .line 268
    const/high16 v6, 0x41400000    # 12.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const/16 v16, 0x3800

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/high16 v6, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/high16 v8, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/high16 v9, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v12, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const v4, 0x41b8147b    # 23.01f

    .line 329
    .line 330
    .line 331
    const v6, 0x4183ae14    # 16.46f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x41a11eb8    # 20.14f

    .line 338
    .line 339
    .line 340
    const/high16 v6, 0x41400000    # 12.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, -0x428a3d71    # -0.06f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v25, 0x3f51eb85    # 0.82f

    .line 352
    .line 353
    .line 354
    const v26, -0x40370a3d    # -1.57f

    .line 355
    .line 356
    .line 357
    const v21, 0x3f4f5c29    # 0.81f

    .line 358
    .line 359
    .line 360
    const v23, 0x3fa3d70a    # 1.28f

    .line 361
    .line 362
    .line 363
    const v24, -0x40970a3d    # -0.91f

    .line 364
    .line 365
    .line 366
    move-object/from16 v20, v2

    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, -0x3f5d70a4    # -5.08f

    .line 372
    .line 373
    .line 374
    const v6, -0x3f17ae14    # -7.26f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v25, -0x402e147b    # -1.64f

    .line 381
    .line 382
    .line 383
    const/16 v26, 0x0

    .line 384
    .line 385
    const v21, -0x41333333    # -0.4f

    .line 386
    .line 387
    .line 388
    const v22, -0x40ee147b    # -0.57f

    .line 389
    .line 390
    .line 391
    const v23, -0x406147ae    # -1.24f

    .line 392
    .line 393
    .line 394
    const v24, -0x40ee147b    # -0.57f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, -0x40370a3d    # -1.57f

    .line 401
    .line 402
    .line 403
    const v6, 0x400f5c29    # 2.24f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x40470a3d    # 3.11f

    .line 410
    .line 411
    .line 412
    const v6, 0x408e147b    # 4.44f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x3e0f5c29    # 0.14f

    .line 419
    .line 420
    .line 421
    const v26, 0x40047ae1    # 2.07f

    .line 422
    .line 423
    .line 424
    const v21, 0x3edc28f6    # 0.43f

    .line 425
    .line 426
    .line 427
    const v22, 0x3f1c28f6    # 0.61f

    .line 428
    .line 429
    .line 430
    const v23, 0x3ef5c28f    # 0.48f

    .line 431
    .line 432
    .line 433
    const v24, 0x3fb47ae1    # 1.41f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v25, -0x41666666    # -0.3f

    .line 440
    .line 441
    .line 442
    const v26, 0x3edc28f6    # 0.43f

    .line 443
    .line 444
    .line 445
    const v21, -0x425c28f6    # -0.08f

    .line 446
    .line 447
    .line 448
    const v22, 0x3e23d70a    # 0.16f

    .line 449
    .line 450
    .line 451
    const v23, -0x41c7ae14    # -0.18f

    .line 452
    .line 453
    .line 454
    const v24, 0x3e99999a    # 0.3f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, 0x40128f5c    # 2.29f

    .line 461
    .line 462
    .line 463
    const v6, 0x40647ae1    # 3.57f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v25, 0x3d8f5c29    # 0.07f

    .line 470
    .line 471
    .line 472
    const v26, 0x40028f5c    # 2.04f

    .line 473
    .line 474
    .line 475
    const v21, 0x3ecccccd    # 0.4f

    .line 476
    .line 477
    .line 478
    const v22, 0x3f1eb852    # 0.62f

    .line 479
    .line 480
    .line 481
    const v23, 0x3ed70a3d    # 0.42f

    .line 482
    .line 483
    .line 484
    const v24, 0x3fb33333    # 1.4f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, -0x430a3d71    # -0.03f

    .line 491
    .line 492
    .line 493
    const v26, 0x3d23d70a    # 0.04f

    .line 494
    .line 495
    .line 496
    const v21, -0x43dc28f6    # -0.01f

    .line 497
    .line 498
    .line 499
    const v22, 0x3ca3d70a    # 0.02f

    .line 500
    .line 501
    .line 502
    const v23, -0x435c28f6    # -0.02f

    .line 503
    .line 504
    .line 505
    const v24, 0x3cf5c28f    # 0.03f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x4088f5c3    # 4.28f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v25, 0x41b8147b    # 23.01f

    .line 518
    .line 519
    .line 520
    const v26, 0x4183ae14    # 16.46f

    .line 521
    .line 522
    .line 523
    const v21, 0x41b7ae14    # 22.96f

    .line 524
    .line 525
    .line 526
    const/high16 v22, 0x41900000    # 18.0f

    .line 527
    .line 528
    const v23, 0x41bb851f    # 23.44f

    .line 529
    .line 530
    .line 531
    const v24, 0x4188f5c3    # 17.12f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/high16 v6, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 557
    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 559
    .line 560
    .line 561
    move-result-wide v6

    .line 562
    const/4 v0, 0x0

    .line 563
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 571
    .line 572
    .line 573
    move-result v11

    .line 574
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41500000    # 13.0f

    .line 580
    .line 581
    const/high16 v2, 0x41a00000    # 20.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x40000000    # 2.0f

    .line 587
    .line 588
    const/high16 v18, 0x40000000    # 2.0f

    .line 589
    .line 590
    const v14, 0x3f8ccccd    # 1.1f

    .line 591
    .line 592
    .line 593
    const v15, 0x3f666666    # 0.9f

    .line 594
    .line 595
    .line 596
    const/high16 v16, 0x40000000    # 2.0f

    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, -0x4099999a    # -0.9f

    .line 602
    .line 603
    .line 604
    const/high16 v2, -0x40000000    # -2.0f

    .line 605
    .line 606
    const/high16 v4, 0x40000000    # 2.0f

    .line 607
    .line 608
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, -0x40800000    # -1.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, -0x3f800000    # -4.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x41a00000    # 20.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    const/16 v16, 0x3800

    .line 634
    .line 635
    const/16 v17, 0x0

    .line 636
    .line 637
    const/high16 v6, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v12, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/4 v15, 0x0

    .line 644
    const-string v4, ""

    .line 645
    .line 646
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sput-object v0, Landroidx/compose/material/icons/rounded/ForestKt;->_forest:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 655
    .line 656
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    return-object v0
.end method
