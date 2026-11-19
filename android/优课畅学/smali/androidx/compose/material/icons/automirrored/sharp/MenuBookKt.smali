.class public final Landroidx/compose/material/icons/automirrored/sharp/MenuBookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMenuBook(Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/sharp/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Sharp.MenuBook"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 78
    .line 79
    const/high16 v26, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v21, -0x4071eb85    # -1.11f

    .line 82
    .line 83
    .line 84
    const v22, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const v23, -0x3feae148    # -2.33f

    .line 88
    .line 89
    .line 90
    const/high16 v24, -0x41000000    # -0.5f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x3f500000    # -5.5f

    .line 98
    .line 99
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 100
    .line 101
    const v21, -0x40066666    # -1.95f

    .line 102
    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const v23, -0x3f7e6666    # -4.05f

    .line 107
    .line 108
    .line 109
    const v24, 0x3ecccccd    # 0.4f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v26, -0x40400000    # -1.5f

    .line 116
    .line 117
    const v21, -0x40466666    # -1.45f

    .line 118
    .line 119
    .line 120
    const v22, -0x40733333    # -1.1f

    .line 121
    .line 122
    .line 123
    const v23, -0x3f9ccccd    # -3.55f

    .line 124
    .line 125
    .line 126
    const/high16 v24, -0x40400000    # -1.5f

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x409ccccd    # 4.9f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v7, 0x40c00000    # 6.0f

    .line 137
    .line 138
    const v8, 0x401ccccd    # 2.45f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x41780000    # 15.5f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, 0x40d00000    # 6.5f

    .line 150
    .line 151
    const/high16 v26, 0x41a00000    # 20.0f

    .line 152
    .line 153
    const v21, 0x401ccccd    # 2.45f

    .line 154
    .line 155
    .line 156
    const v22, 0x41a33333    # 20.4f

    .line 157
    .line 158
    .line 159
    const v23, 0x4091999a    # 4.55f

    .line 160
    .line 161
    .line 162
    const/high16 v24, 0x41a00000    # 20.0f

    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40b00000    # 5.5f

    .line 168
    .line 169
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 170
    .line 171
    const v7, 0x4081999a    # 4.05f

    .line 172
    .line 173
    .line 174
    const v8, 0x3ecccccd    # 0.4f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, 0x40b00000    # 5.5f

    .line 181
    .line 182
    const/high16 v26, -0x40400000    # -1.5f

    .line 183
    .line 184
    const v21, 0x3fb9999a    # 1.45f

    .line 185
    .line 186
    .line 187
    const v22, -0x40733333    # -1.1f

    .line 188
    .line 189
    .line 190
    const v23, 0x40633333    # 3.55f

    .line 191
    .line 192
    .line 193
    const/high16 v24, -0x40400000    # -1.5f

    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x40600000    # 3.5f

    .line 199
    .line 200
    const/high16 v26, 0x3f000000    # 0.5f

    .line 201
    .line 202
    const v21, 0x3f95c28f    # 1.17f

    .line 203
    .line 204
    .line 205
    const/16 v22, 0x0

    .line 206
    .line 207
    const v23, 0x4018f5c3    # 2.39f

    .line 208
    .line 209
    .line 210
    const v24, 0x3e19999a    # 0.15f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x40000000    # 2.0f

    .line 217
    .line 218
    const/high16 v26, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v21, 0x3f400000    # 0.75f

    .line 221
    .line 222
    const/high16 v22, 0x3e800000    # 0.25f

    .line 223
    .line 224
    const v23, 0x3fb33333    # 1.4f

    .line 225
    .line 226
    .line 227
    const v24, 0x3f0ccccd    # 0.55f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40c00000    # 6.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, 0x41a80000    # 21.0f

    .line 239
    .line 240
    const/high16 v26, 0x40a00000    # 5.0f

    .line 241
    .line 242
    const v21, 0x41b33333    # 22.4f

    .line 243
    .line 244
    .line 245
    const v22, 0x40b1999a    # 5.55f

    .line 246
    .line 247
    .line 248
    const/high16 v23, 0x41ae0000    # 21.75f

    .line 249
    .line 250
    const/high16 v24, 0x40a80000    # 5.25f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41940000    # 18.5f

    .line 259
    .line 260
    const/high16 v6, 0x41a80000    # 21.0f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 266
    .line 267
    const/high16 v26, -0x41000000    # -0.5f

    .line 268
    .line 269
    const v21, -0x40733333    # -1.1f

    .line 270
    .line 271
    .line 272
    const v22, -0x414ccccd    # -0.35f

    .line 273
    .line 274
    .line 275
    const v23, -0x3feccccd    # -2.3f

    .line 276
    .line 277
    .line 278
    const/high16 v24, -0x41000000    # -0.5f

    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, -0x3f500000    # -5.5f

    .line 284
    .line 285
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 286
    .line 287
    const v21, -0x40266666    # -1.7f

    .line 288
    .line 289
    .line 290
    const/16 v22, 0x0

    .line 291
    .line 292
    const v23, -0x3f7b3333    # -4.15f

    .line 293
    .line 294
    .line 295
    const v24, 0x3f266666    # 0.65f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41000000    # 8.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v25, 0x40b00000    # 5.5f

    .line 307
    .line 308
    const/high16 v26, -0x40400000    # -1.5f

    .line 309
    .line 310
    const v21, 0x3faccccd    # 1.35f

    .line 311
    .line 312
    .line 313
    const v22, -0x40a66666    # -0.85f

    .line 314
    .line 315
    .line 316
    const v23, 0x40733333    # 3.8f

    .line 317
    .line 318
    .line 319
    const/high16 v24, -0x40400000    # -1.5f

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, 0x40600000    # 3.5f

    .line 325
    .line 326
    const/high16 v26, 0x3f000000    # 0.5f

    .line 327
    .line 328
    const v21, 0x3f99999a    # 1.2f

    .line 329
    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const v23, 0x4019999a    # 2.4f

    .line 334
    .line 335
    .line 336
    const v24, 0x3e19999a    # 0.15f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x41940000    # 18.5f

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const/16 v16, 0x3800

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v8, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const/high16 v9, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v12, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const-string v4, ""

    .line 371
    .line 372
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 382
    .line 383
    .line 384
    move-result-wide v6

    .line 385
    const/4 v2, 0x0

    .line 386
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const/high16 v4, 0x41280000    # 10.5f

    .line 403
    .line 404
    const/high16 v6, 0x418c0000    # 17.5f

    .line 405
    .line 406
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v25, 0x40200000    # 2.5f

    .line 410
    .line 411
    const v26, 0x3e851eb8    # 0.26f

    .line 412
    .line 413
    .line 414
    const v21, 0x3f6147ae    # 0.88f

    .line 415
    .line 416
    .line 417
    const v23, 0x3fdd70a4    # 1.73f

    .line 418
    .line 419
    .line 420
    const v24, 0x3db851ec    # 0.09f

    .line 421
    .line 422
    .line 423
    move-object/from16 v20, v2

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v4, 0x4113d70a    # 9.24f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v25, 0x418c0000    # 17.5f

    .line 435
    .line 436
    const/high16 v26, 0x41100000    # 9.0f

    .line 437
    .line 438
    const v21, 0x4199ae14    # 19.21f

    .line 439
    .line 440
    .line 441
    const v22, 0x411170a4    # 9.09f

    .line 442
    .line 443
    .line 444
    const v23, 0x4192e148    # 18.36f

    .line 445
    .line 446
    .line 447
    const/high16 v24, 0x41100000    # 9.0f

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v25, -0x3f700000    # -4.5f

    .line 453
    .line 454
    const v26, 0x3f547ae1    # 0.83f

    .line 455
    .line 456
    .line 457
    const v21, -0x40266666    # -1.7f

    .line 458
    .line 459
    .line 460
    const/16 v22, 0x0

    .line 461
    .line 462
    const v23, -0x3fb0a3d7    # -3.24f

    .line 463
    .line 464
    .line 465
    const v24, 0x3e947ae1    # 0.29f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x3fd47ae1    # 1.66f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v25, 0x418c0000    # 17.5f

    .line 478
    .line 479
    const/high16 v26, 0x41280000    # 10.5f

    .line 480
    .line 481
    const v21, 0x4162147b    # 14.13f

    .line 482
    .line 483
    .line 484
    const v22, 0x412d999a    # 10.85f

    .line 485
    .line 486
    .line 487
    const v23, 0x417b3333    # 15.7f

    .line 488
    .line 489
    .line 490
    const/high16 v24, 0x41280000    # 10.5f

    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const/high16 v6, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    const-string v4, ""

    .line 506
    .line 507
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 508
    .line 509
    .line 510
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 515
    .line 516
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 517
    .line 518
    .line 519
    move-result-wide v6

    .line 520
    const/4 v2, 0x0

    .line 521
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 529
    .line 530
    .line 531
    move-result v11

    .line 532
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 535
    .line 536
    .line 537
    const/high16 v4, 0x41500000    # 13.0f

    .line 538
    .line 539
    const v6, 0x4147d70a    # 12.49f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x3fd47ae1    # 1.66f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v25, 0x40900000    # 4.5f

    .line 552
    .line 553
    const v26, -0x40828f5c    # -0.99f

    .line 554
    .line 555
    .line 556
    const v21, 0x3f90a3d7    # 1.13f

    .line 557
    .line 558
    .line 559
    const v22, -0x40dc28f6    # -0.64f

    .line 560
    .line 561
    .line 562
    const v23, 0x402ccccd    # 2.7f

    .line 563
    .line 564
    .line 565
    const v24, -0x40828f5c    # -0.99f

    .line 566
    .line 567
    .line 568
    move-object/from16 v20, v2

    .line 569
    .line 570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v25, 0x40200000    # 2.5f

    .line 574
    .line 575
    const v26, 0x3e851eb8    # 0.26f

    .line 576
    .line 577
    .line 578
    const v21, 0x3f6147ae    # 0.88f

    .line 579
    .line 580
    .line 581
    const/16 v22, 0x0

    .line 582
    .line 583
    const v23, 0x3fdd70a4    # 1.73f

    .line 584
    .line 585
    .line 586
    const v24, 0x3db851ec    # 0.09f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v4, 0x413e6666    # 11.9f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 599
    .line 600
    const v26, -0x418a3d71    # -0.24f

    .line 601
    .line 602
    .line 603
    const v21, -0x40b5c28f    # -0.79f

    .line 604
    .line 605
    .line 606
    const v22, -0x41e66666    # -0.15f

    .line 607
    .line 608
    .line 609
    const v23, -0x402e147b    # -1.64f

    .line 610
    .line 611
    .line 612
    const v24, -0x418a3d71    # -0.24f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v25, 0x41500000    # 13.0f

    .line 619
    .line 620
    const v26, 0x4147d70a    # 12.49f

    .line 621
    .line 622
    .line 623
    const v21, 0x417ccccd    # 15.8f

    .line 624
    .line 625
    .line 626
    const v22, 0x413a8f5c    # 11.66f

    .line 627
    .line 628
    .line 629
    const v23, 0x416428f6    # 14.26f

    .line 630
    .line 631
    .line 632
    const v24, 0x413f5c29    # 11.96f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/high16 v6, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v7, 0x0

    .line 648
    const-string v4, ""

    .line 649
    .line 650
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 651
    .line 652
    .line 653
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 658
    .line 659
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 660
    .line 661
    .line 662
    move-result-wide v6

    .line 663
    const/4 v0, 0x0

    .line 664
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 668
    .line 669
    .line 670
    move-result v10

    .line 671
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 672
    .line 673
    .line 674
    move-result v11

    .line 675
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 678
    .line 679
    .line 680
    const v0, 0x416547ae    # 14.33f

    .line 681
    .line 682
    .line 683
    const/high16 v2, 0x418c0000    # 17.5f

    .line 684
    .line 685
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, -0x3f700000    # -4.5f

    .line 689
    .line 690
    const v18, 0x3f547ae1    # 0.83f

    .line 691
    .line 692
    .line 693
    const v13, -0x40266666    # -1.7f

    .line 694
    .line 695
    .line 696
    const v15, -0x3fb0a3d7    # -3.24f

    .line 697
    .line 698
    .line 699
    const v16, 0x3e947ae1    # 0.29f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x3fd47ae1    # 1.66f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, 0x40900000    # 4.5f

    .line 712
    .line 713
    const v18, -0x40828f5c    # -0.99f

    .line 714
    .line 715
    .line 716
    const v13, 0x3f90a3d7    # 1.13f

    .line 717
    .line 718
    .line 719
    const v14, -0x40dc28f6    # -0.64f

    .line 720
    .line 721
    .line 722
    const v15, 0x402ccccd    # 2.7f

    .line 723
    .line 724
    .line 725
    const v16, -0x40828f5c    # -0.99f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v17, 0x40200000    # 2.5f

    .line 732
    .line 733
    const v18, 0x3e851eb8    # 0.26f

    .line 734
    .line 735
    .line 736
    const v13, 0x3f6147ae    # 0.88f

    .line 737
    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const v15, 0x3fdd70a4    # 1.73f

    .line 741
    .line 742
    .line 743
    const v16, 0x3db851ec    # 0.09f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v0, -0x403d70a4    # -1.52f

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v17, 0x418c0000    # 17.5f

    .line 756
    .line 757
    const v18, 0x416547ae    # 14.33f

    .line 758
    .line 759
    .line 760
    const v13, 0x4199ae14    # 19.21f

    .line 761
    .line 762
    .line 763
    const v14, 0x41668f5c    # 14.41f

    .line 764
    .line 765
    .line 766
    const v15, 0x4192e148    # 18.36f

    .line 767
    .line 768
    .line 769
    const v16, 0x416547ae    # 14.33f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const/16 v16, 0x3800

    .line 783
    .line 784
    const/16 v17, 0x0

    .line 785
    .line 786
    const/high16 v6, 0x3f800000    # 1.0f

    .line 787
    .line 788
    const/4 v7, 0x0

    .line 789
    const/high16 v12, 0x3f800000    # 1.0f

    .line 790
    .line 791
    const/4 v13, 0x0

    .line 792
    const/4 v14, 0x0

    .line 793
    const/4 v15, 0x0

    .line 794
    const-string v4, ""

    .line 795
    .line 796
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    sput-object v0, Landroidx/compose/material/icons/automirrored/sharp/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 805
    .line 806
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    return-object v0
.end method
