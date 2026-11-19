.class public final Landroidx/compose/material/icons/twotone/Brightness2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrightness2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Brightness2Kt;->_brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Brightness2"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f000000    # -8.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x3f72e148    # -4.41f

    .line 84
    .line 85
    .line 86
    const v23, -0x3f9a3d71    # -3.59f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x3f000000    # -8.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, -0x407eb852    # -1.01f

    .line 97
    .line 98
    .line 99
    const v26, 0x3d8f5c29    # 0.07f

    .line 100
    .line 101
    .line 102
    const v21, -0x4151eb85    # -0.34f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const v23, -0x40d1eb85    # -0.68f

    .line 108
    .line 109
    .line 110
    const v24, 0x3ca3d70a    # 0.02f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41400000    # 12.0f

    .line 117
    .line 118
    const/high16 v26, 0x41400000    # 12.0f

    .line 119
    .line 120
    const v21, 0x412e6666    # 10.9f

    .line 121
    .line 122
    .line 123
    const v22, 0x40c75c29    # 6.23f

    .line 124
    .line 125
    .line 126
    const/high16 v23, 0x41400000    # 12.0f

    .line 127
    .line 128
    const v24, 0x4110cccd    # 9.05f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, -0x3fbf5c29    # -3.01f

    .line 135
    .line 136
    .line 137
    const v26, 0x40fdc28f    # 7.93f

    .line 138
    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, 0x403ccccd    # 2.95f

    .line 143
    .line 144
    .line 145
    const v23, -0x40733333    # -1.1f

    .line 146
    .line 147
    .line 148
    const v24, 0x40b8a3d7    # 5.77f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x3f8147ae    # 1.01f

    .line 155
    .line 156
    .line 157
    const v26, 0x3d8f5c29    # 0.07f

    .line 158
    .line 159
    .line 160
    const v21, 0x3ea8f5c3    # 0.33f

    .line 161
    .line 162
    .line 163
    const v22, 0x3d4ccccd    # 0.05f

    .line 164
    .line 165
    .line 166
    const v23, 0x3f2b851f    # 0.67f

    .line 167
    .line 168
    .line 169
    const v24, 0x3d8f5c29    # 0.07f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v25, 0x41000000    # 8.0f

    .line 176
    .line 177
    const/high16 v26, -0x3f000000    # -8.0f

    .line 178
    .line 179
    const v21, 0x408d1eb8    # 4.41f

    .line 180
    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    const/high16 v23, 0x41000000    # 8.0f

    .line 185
    .line 186
    const v24, -0x3f9a3d71    # -3.59f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const/16 v16, 0x3800

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const v6, 0x3e99999a    # 0.3f

    .line 204
    .line 205
    .line 206
    const v8, 0x3e99999a    # 0.3f

    .line 207
    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    const/high16 v9, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v12, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v15, 0x0

    .line 217
    const-string v4, ""

    .line 218
    .line 219
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 227
    .line 228
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 229
    .line 230
    .line 231
    move-result-wide v6

    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const v2, 0x41a53333    # 20.65f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41200000    # 10.0f

    .line 258
    .line 259
    const/high16 v18, 0x41b00000    # 22.0f

    .line 260
    .line 261
    const v13, 0x40cf0a3d    # 6.47f

    .line 262
    .line 263
    .line 264
    const/high16 v14, 0x41ac0000    # 21.5f

    .line 265
    .line 266
    const v15, 0x4102e148    # 8.18f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x41b00000    # 22.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 275
    .line 276
    const v13, 0x40b0a3d7    # 5.52f

    .line 277
    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const/high16 v15, 0x41200000    # 10.0f

    .line 281
    .line 282
    const v16, -0x3f70a3d7    # -4.48f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x417851ec    # 15.52f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x41200000    # 10.0f

    .line 292
    .line 293
    const/high16 v4, 0x40000000    # 2.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, -0x3f600000    # -5.0f

    .line 299
    .line 300
    const v18, 0x3faccccd    # 1.35f

    .line 301
    .line 302
    .line 303
    const v13, -0x40170a3d    # -1.82f

    .line 304
    .line 305
    .line 306
    const v15, -0x3f9e147b    # -3.53f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x3f000000    # 0.5f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x41200000    # 10.0f

    .line 315
    .line 316
    const/high16 v18, 0x41400000    # 12.0f

    .line 317
    .line 318
    const v13, 0x40ffae14    # 7.99f

    .line 319
    .line 320
    .line 321
    const v14, 0x40a28f5c    # 5.08f

    .line 322
    .line 323
    .line 324
    const/high16 v15, 0x41200000    # 10.0f

    .line 325
    .line 326
    const v16, 0x4104cccd    # 8.3f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, -0x3f600000    # -5.0f

    .line 333
    .line 334
    const v2, 0x410a6666    # 8.65f

    .line 335
    .line 336
    .line 337
    const v4, -0x3fff5c29    # -2.01f

    .line 338
    .line 339
    .line 340
    const v6, 0x40dd70a4    # 6.92f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41400000    # 12.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x3fbf5c29    # -3.01f

    .line 355
    .line 356
    .line 357
    const v18, -0x3f023d71    # -7.93f

    .line 358
    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const v14, -0x3fc33333    # -2.95f

    .line 362
    .line 363
    .line 364
    const v15, -0x40733333    # -1.1f

    .line 365
    .line 366
    .line 367
    const v16, -0x3f475c29    # -5.77f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x41200000    # 10.0f

    .line 374
    .line 375
    const/high16 v18, 0x40800000    # 4.0f

    .line 376
    .line 377
    const v13, 0x41151eb8    # 9.32f

    .line 378
    .line 379
    .line 380
    const v14, 0x4080a3d7    # 4.02f

    .line 381
    .line 382
    .line 383
    const v15, 0x411a8f5c    # 9.66f

    .line 384
    .line 385
    .line 386
    const/high16 v16, 0x40800000    # 4.0f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x41000000    # 8.0f

    .line 392
    .line 393
    const/high16 v18, 0x41000000    # 8.0f

    .line 394
    .line 395
    const v13, 0x408d1eb8    # 4.41f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const/high16 v15, 0x41000000    # 8.0f

    .line 400
    .line 401
    const v16, 0x4065c28f    # 3.59f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x3f9a3d71    # -3.59f

    .line 408
    .line 409
    .line 410
    const/high16 v2, -0x3f000000    # -8.0f

    .line 411
    .line 412
    const/high16 v4, 0x41000000    # 8.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x407eb852    # -1.01f

    .line 418
    .line 419
    .line 420
    const v18, -0x4270a3d7    # -0.07f

    .line 421
    .line 422
    .line 423
    const v13, -0x4151eb85    # -0.34f

    .line 424
    .line 425
    .line 426
    const v15, -0x40d1eb85    # -0.68f

    .line 427
    .line 428
    .line 429
    const v16, -0x435c28f6    # -0.02f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x41400000    # 12.0f

    .line 436
    .line 437
    const/high16 v18, 0x41400000    # 12.0f

    .line 438
    .line 439
    const v13, 0x412e6666    # 10.9f

    .line 440
    .line 441
    .line 442
    const v14, 0x418e28f6    # 17.77f

    .line 443
    .line 444
    .line 445
    const/high16 v15, 0x41400000    # 12.0f

    .line 446
    .line 447
    const v16, 0x416f3333    # 14.95f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const/16 v16, 0x3800

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/high16 v6, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v8, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    const/high16 v12, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const/4 v14, 0x0

    .line 473
    const/4 v15, 0x0

    .line 474
    const-string v4, ""

    .line 475
    .line 476
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    sput-object v0, Landroidx/compose/material/icons/twotone/Brightness2Kt;->_brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 485
    .line 486
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    return-object v0
.end method
