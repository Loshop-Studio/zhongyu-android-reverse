.class public final Landroidx/compose/material/icons/twotone/AdminPanelSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdminPanelSettings(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AdminPanelSettings"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const v6, 0x40f28f5c    # 7.58f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, -0x3f500000    # -5.5f

    .line 79
    .line 80
    const v6, -0x3fe66666    # -2.4f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, 0x40a00000    # 5.0f

    .line 87
    .line 88
    const v6, 0x40f28f5c    # 7.58f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x40666666    # 3.6f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v25, 0x40b00000    # 5.5f

    .line 101
    .line 102
    const v26, 0x40f7ae14    # 7.74f

    .line 103
    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const/high16 v22, 0x40600000    # 3.5f

    .line 108
    .line 109
    const v23, 0x40151eb8    # 2.33f

    .line 110
    .line 111
    .line 112
    const v24, 0x40d7ae14    # 6.74f

    .line 113
    .line 114
    .line 115
    move-object/from16 v20, v2

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x3f3ae148    # 0.73f

    .line 121
    .line 122
    .line 123
    const v26, -0x41666666    # -0.3f

    .line 124
    .line 125
    .line 126
    const/high16 v21, 0x3e800000    # 0.25f

    .line 127
    .line 128
    const v22, -0x425c28f6    # -0.08f

    .line 129
    .line 130
    .line 131
    const v23, 0x3efae148    # 0.49f

    .line 132
    .line 133
    .line 134
    const v24, -0x41b33333    # -0.2f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41300000    # 11.0f

    .line 141
    .line 142
    const/high16 v26, 0x41880000    # 17.0f

    .line 143
    .line 144
    const v21, 0x413147ae    # 11.08f

    .line 145
    .line 146
    .line 147
    const v22, 0x4190e148    # 18.11f

    .line 148
    .line 149
    .line 150
    const/high16 v23, 0x41300000    # 11.0f

    .line 151
    .line 152
    const v24, 0x418c7ae1    # 17.56f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x40a00000    # 5.0f

    .line 159
    .line 160
    const v26, -0x3f42e148    # -5.91f

    .line 161
    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const v22, -0x3fc1eb85    # -2.97f

    .line 166
    .line 167
    .line 168
    const v23, 0x400a3d71    # 2.16f

    .line 169
    .line 170
    .line 171
    const v24, -0x3f523d71    # -5.43f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x40f28f5c    # 7.58f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const v6, 0x3e99999a    # 0.3f

    .line 195
    .line 196
    .line 197
    const v8, 0x3e99999a    # 0.3f

    .line 198
    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    const/high16 v9, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/high16 v12, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    const-string v4, ""

    .line 209
    .line 210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    const/4 v2, 0x0

    .line 224
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41500000    # 13.0f

    .line 241
    .line 242
    const/high16 v6, 0x41880000    # 17.0f

    .line 243
    .line 244
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, -0x3f800000    # -4.0f

    .line 248
    .line 249
    const/high16 v26, 0x40800000    # 4.0f

    .line 250
    .line 251
    const v21, -0x3ff28f5c    # -2.21f

    .line 252
    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/high16 v23, -0x3f800000    # -4.0f

    .line 257
    .line 258
    const v24, 0x3fe51eb8    # 1.79f

    .line 259
    .line 260
    .line 261
    move-object/from16 v20, v2

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x40800000    # 4.0f

    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    .line 270
    const v22, 0x400d70a4    # 2.21f

    .line 271
    .line 272
    .line 273
    const v23, 0x3fe51eb8    # 1.79f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x40800000    # 4.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, -0x401ae148    # -1.79f

    .line 282
    .line 283
    .line 284
    const/high16 v6, -0x3f800000    # -4.0f

    .line 285
    .line 286
    const/high16 v7, 0x40800000    # 4.0f

    .line 287
    .line 288
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v26, 0x41500000    # 13.0f

    .line 294
    .line 295
    const/high16 v21, 0x41a80000    # 21.0f

    .line 296
    .line 297
    const v22, 0x416ca3d7    # 14.79f

    .line 298
    .line 299
    .line 300
    const v23, 0x4199ae14    # 19.21f

    .line 301
    .line 302
    .line 303
    const/high16 v24, 0x41500000    # 13.0f

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x4166147b    # 14.38f

    .line 312
    .line 313
    .line 314
    const/high16 v6, 0x41880000    # 17.0f

    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x3f8f5c29    # 1.12f

    .line 320
    .line 321
    .line 322
    const v26, 0x3f8f5c29    # 1.12f

    .line 323
    .line 324
    .line 325
    const v21, 0x3f1eb852    # 0.62f

    .line 326
    .line 327
    .line 328
    const/16 v22, 0x0

    .line 329
    .line 330
    const v23, 0x3f8f5c29    # 1.12f

    .line 331
    .line 332
    .line 333
    const v24, 0x3f028f5c    # 0.51f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x3f8f5c29    # 1.12f

    .line 340
    .line 341
    .line 342
    const v6, -0x40fd70a4    # -0.51f

    .line 343
    .line 344
    .line 345
    const v7, -0x4070a3d7    # -1.12f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, -0x40fd70a4    # -0.51f

    .line 352
    .line 353
    .line 354
    const v6, -0x4070a3d7    # -1.12f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v4, 0x41830a3d    # 16.38f

    .line 361
    .line 362
    .line 363
    const v6, 0x4166147b    # 14.38f

    .line 364
    .line 365
    .line 366
    const/high16 v7, 0x41880000    # 17.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x419e0000    # 19.75f

    .line 375
    .line 376
    const/high16 v6, 0x41880000    # 17.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v25, -0x3ff0a3d7    # -2.24f

    .line 382
    .line 383
    .line 384
    const v26, -0x406a3d71    # -1.17f

    .line 385
    .line 386
    .line 387
    const v21, -0x4091eb85    # -0.93f

    .line 388
    .line 389
    .line 390
    const v23, -0x402147ae    # -1.74f

    .line 391
    .line 392
    .line 393
    const v24, -0x41147ae1    # -0.46f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x400f5c29    # 2.24f

    .line 400
    .line 401
    .line 402
    const v26, -0x4075c28f    # -1.08f

    .line 403
    .line 404
    .line 405
    const v21, 0x3d4ccccd    # 0.05f

    .line 406
    .line 407
    .line 408
    const v22, -0x40c7ae14    # -0.72f

    .line 409
    .line 410
    .line 411
    const v23, 0x3fc147ae    # 1.51f

    .line 412
    .line 413
    .line 414
    const v24, -0x4075c28f    # -1.08f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, 0x3eb851ec    # 0.36f

    .line 421
    .line 422
    .line 423
    const v6, 0x3f8a3d71    # 1.08f

    .line 424
    .line 425
    .line 426
    const v7, 0x400f5c29    # 2.24f

    .line 427
    .line 428
    .line 429
    const v8, 0x400c28f6    # 2.19f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x41880000    # 17.0f

    .line 436
    .line 437
    const/high16 v26, 0x419e0000    # 19.75f

    .line 438
    .line 439
    const v21, 0x4195eb85    # 18.74f

    .line 440
    .line 441
    .line 442
    const v22, 0x419a51ec    # 19.29f

    .line 443
    .line 444
    .line 445
    const v23, 0x418f70a4    # 17.93f

    .line 446
    .line 447
    .line 448
    const/high16 v24, 0x419e0000    # 19.75f

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const v6, 0x3e99999a    # 0.3f

    .line 461
    .line 462
    .line 463
    const v8, 0x3e99999a    # 0.3f

    .line 464
    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    const-string v4, ""

    .line 468
    .line 469
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 470
    .line 471
    .line 472
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 477
    .line 478
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 479
    .line 480
    .line 481
    move-result-wide v6

    .line 482
    const/4 v2, 0x0

    .line 483
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 487
    .line 488
    .line 489
    move-result v10

    .line 490
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x41780000    # 15.5f

    .line 500
    .line 501
    const/high16 v6, 0x41880000    # 17.0f

    .line 502
    .line 503
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/4 v4, 0x0

    .line 507
    const v6, -0x4070a3d7    # -1.12f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v26, 0x400f5c29    # 2.24f

    .line 514
    .line 515
    .line 516
    const/16 v27, 0x0

    .line 517
    .line 518
    const v21, 0x3f8f5c29    # 1.12f

    .line 519
    .line 520
    .line 521
    const v22, 0x3f8f5c29    # 1.12f

    .line 522
    .line 523
    .line 524
    const/16 v23, 0x0

    .line 525
    .line 526
    const/16 v24, 0x1

    .line 527
    .line 528
    const/16 v25, 0x1

    .line 529
    .line 530
    move-object/from16 v20, v2

    .line 531
    .line 532
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v26, -0x3ff0a3d7    # -2.24f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    const/high16 v6, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/high16 v8, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 560
    .line 561
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 562
    .line 563
    .line 564
    move-result-wide v6

    .line 565
    const/4 v2, 0x0

    .line 566
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 580
    .line 581
    .line 582
    const/high16 v4, 0x41900000    # 18.0f

    .line 583
    .line 584
    const v6, 0x413170a4    # 11.09f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v4, 0x40c8a3d7    # 6.27f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v4, 0x41280000    # 10.5f

    .line 597
    .line 598
    const/high16 v6, 0x40400000    # 3.0f

    .line 599
    .line 600
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v4, 0x40400000    # 3.0f

    .line 604
    .line 605
    const v6, 0x40c8a3d7    # 6.27f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v4, 0x409d1eb8    # 4.91f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v25, 0x40f00000    # 7.5f

    .line 618
    .line 619
    const v26, 0x411d1eb8    # 9.82f

    .line 620
    .line 621
    .line 622
    const/16 v21, 0x0

    .line 623
    .line 624
    const v22, 0x409147ae    # 4.54f

    .line 625
    .line 626
    .line 627
    const v23, 0x404ccccd    # 3.2f

    .line 628
    .line 629
    .line 630
    const v24, 0x410ca3d7    # 8.79f

    .line 631
    .line 632
    .line 633
    move-object/from16 v20, v2

    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v25, 0x3fcccccd    # 1.6f

    .line 639
    .line 640
    .line 641
    const v26, -0x40f33333    # -0.55f

    .line 642
    .line 643
    .line 644
    const v21, 0x3f0ccccd    # 0.55f

    .line 645
    .line 646
    .line 647
    const v22, -0x41fae148    # -0.13f

    .line 648
    .line 649
    .line 650
    const v23, 0x3f8a3d71    # 1.08f

    .line 651
    .line 652
    .line 653
    const v24, -0x415c28f6    # -0.32f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v25, 0x41880000    # 17.0f

    .line 660
    .line 661
    const/high16 v26, 0x41b80000    # 23.0f

    .line 662
    .line 663
    const v21, 0x4152e148    # 13.18f

    .line 664
    .line 665
    .line 666
    const v22, 0x41afeb85    # 21.99f

    .line 667
    .line 668
    .line 669
    const v23, 0x416f851f    # 14.97f

    .line 670
    .line 671
    .line 672
    const/high16 v24, 0x41b80000    # 23.0f

    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v25, 0x40c00000    # 6.0f

    .line 678
    .line 679
    const/high16 v26, -0x3f400000    # -6.0f

    .line 680
    .line 681
    const v21, 0x4053d70a    # 3.31f

    .line 682
    .line 683
    .line 684
    const/16 v22, 0x0

    .line 685
    .line 686
    const/high16 v23, 0x40c00000    # 6.0f

    .line 687
    .line 688
    const v24, -0x3fd3d70a    # -2.69f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v25, 0x41900000    # 18.0f

    .line 695
    .line 696
    const v26, 0x413170a4    # 11.09f

    .line 697
    .line 698
    .line 699
    const/high16 v21, 0x41b80000    # 23.0f

    .line 700
    .line 701
    const v22, 0x41607ae1    # 14.03f

    .line 702
    .line 703
    .line 704
    const v23, 0x41a6b852    # 20.84f

    .line 705
    .line 706
    .line 707
    const v24, 0x41391eb8    # 11.57f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, 0x41300000    # 11.0f

    .line 717
    .line 718
    const/high16 v6, 0x41880000    # 17.0f

    .line 719
    .line 720
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v25, 0x3e6b851f    # 0.23f

    .line 724
    .line 725
    .line 726
    const v26, 0x3fcf5c29    # 1.62f

    .line 727
    .line 728
    .line 729
    const/16 v21, 0x0

    .line 730
    .line 731
    const v22, 0x3f0f5c29    # 0.56f

    .line 732
    .line 733
    .line 734
    const v23, 0x3da3d70a    # 0.08f

    .line 735
    .line 736
    .line 737
    const v24, 0x3f8e147b    # 1.11f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v25, -0x40c51eb8    # -0.73f

    .line 744
    .line 745
    .line 746
    const v26, 0x3e99999a    # 0.3f

    .line 747
    .line 748
    .line 749
    const v21, -0x418a3d71    # -0.24f

    .line 750
    .line 751
    .line 752
    const v22, 0x3de147ae    # 0.11f

    .line 753
    .line 754
    .line 755
    const v23, -0x410a3d71    # -0.48f

    .line 756
    .line 757
    .line 758
    const v24, 0x3e6147ae    # 0.22f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v25, -0x3f500000    # -5.5f

    .line 765
    .line 766
    const v26, -0x3f0851ec    # -7.74f

    .line 767
    .line 768
    .line 769
    const v21, -0x3fb51eb8    # -3.17f

    .line 770
    .line 771
    .line 772
    const/high16 v22, -0x40800000    # -1.0f

    .line 773
    .line 774
    const/high16 v23, -0x3f500000    # -5.5f

    .line 775
    .line 776
    const v24, -0x3f7851ec    # -4.24f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v4, -0x3f99999a    # -3.6f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v4, 0x40b00000    # 5.5f

    .line 789
    .line 790
    const v6, -0x3fe66666    # -2.4f

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v4, 0x4019999a    # 2.4f

    .line 797
    .line 798
    .line 799
    const/high16 v6, 0x40b00000    # 5.5f

    .line 800
    .line 801
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v4, 0x4060a3d7    # 3.51f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v25, 0x41300000    # 11.0f

    .line 811
    .line 812
    const/high16 v26, 0x41880000    # 17.0f

    .line 813
    .line 814
    const v21, 0x41528f5c    # 13.16f

    .line 815
    .line 816
    .line 817
    const v22, 0x41391eb8    # 11.57f

    .line 818
    .line 819
    .line 820
    const/high16 v23, 0x41300000    # 11.0f

    .line 821
    .line 822
    const v24, 0x41607ae1    # 14.03f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v4, 0x41a80000    # 21.0f

    .line 832
    .line 833
    const/high16 v6, 0x41880000    # 17.0f

    .line 834
    .line 835
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v25, -0x3f800000    # -4.0f

    .line 839
    .line 840
    const/high16 v26, -0x3f800000    # -4.0f

    .line 841
    .line 842
    const v21, -0x3ff28f5c    # -2.21f

    .line 843
    .line 844
    .line 845
    const/16 v22, 0x0

    .line 846
    .line 847
    const/high16 v23, -0x3f800000    # -4.0f

    .line 848
    .line 849
    const v24, -0x401ae148    # -1.79f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v25, 0x40800000    # 4.0f

    .line 856
    .line 857
    const/16 v21, 0x0

    .line 858
    .line 859
    const v22, -0x3ff28f5c    # -2.21f

    .line 860
    .line 861
    .line 862
    const v23, 0x3fe51eb8    # 1.79f

    .line 863
    .line 864
    .line 865
    const/high16 v24, -0x3f800000    # -4.0f

    .line 866
    .line 867
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v4, 0x3fe51eb8    # 1.79f

    .line 871
    .line 872
    .line 873
    const/high16 v6, 0x40800000    # 4.0f

    .line 874
    .line 875
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v25, 0x41880000    # 17.0f

    .line 879
    .line 880
    const/high16 v26, 0x41a80000    # 21.0f

    .line 881
    .line 882
    const/high16 v21, 0x41a80000    # 21.0f

    .line 883
    .line 884
    const v22, 0x4199ae14    # 19.21f

    .line 885
    .line 886
    .line 887
    const v23, 0x4199ae14    # 19.21f

    .line 888
    .line 889
    .line 890
    const/high16 v24, 0x41a80000    # 21.0f

    .line 891
    .line 892
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    const/high16 v6, 0x3f800000    # 1.0f

    .line 903
    .line 904
    const/4 v7, 0x0

    .line 905
    const-string v4, ""

    .line 906
    .line 907
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 908
    .line 909
    .line 910
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 915
    .line 916
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 917
    .line 918
    .line 919
    move-result-wide v6

    .line 920
    const/4 v0, 0x0

    .line 921
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 922
    .line 923
    .line 924
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 925
    .line 926
    .line 927
    move-result v10

    .line 928
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 929
    .line 930
    .line 931
    move-result v11

    .line 932
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x418c0000    # 17.5f

    .line 938
    .line 939
    const/high16 v2, 0x41880000    # 17.0f

    .line 940
    .line 941
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v17, -0x3ff0a3d7    # -2.24f

    .line 945
    .line 946
    .line 947
    const v18, 0x3f8a3d71    # 1.08f

    .line 948
    .line 949
    .line 950
    const v13, -0x40c51eb8    # -0.73f

    .line 951
    .line 952
    .line 953
    const v15, -0x3ff3d70a    # -2.19f

    .line 954
    .line 955
    .line 956
    const v16, 0x3eb851ec    # 0.36f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v17, 0x400f5c29    # 2.24f

    .line 963
    .line 964
    .line 965
    const v18, 0x3f95c28f    # 1.17f

    .line 966
    .line 967
    .line 968
    const/high16 v13, 0x3f000000    # 0.5f

    .line 969
    .line 970
    const v14, 0x3f35c28f    # 0.71f

    .line 971
    .line 972
    .line 973
    const v15, 0x3fa8f5c3    # 1.32f

    .line 974
    .line 975
    .line 976
    const v16, 0x3f95c28f    # 1.17f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v0, -0x41147ae1    # -0.46f

    .line 983
    .line 984
    .line 985
    const v2, -0x406a3d71    # -1.17f

    .line 986
    .line 987
    .line 988
    const v4, 0x400f5c29    # 2.24f

    .line 989
    .line 990
    .line 991
    const v6, 0x3fdeb852    # 1.74f

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const/high16 v17, 0x41880000    # 17.0f

    .line 998
    .line 999
    const/high16 v18, 0x418c0000    # 17.5f

    .line 1000
    .line 1001
    const v13, 0x4199851f    # 19.19f

    .line 1002
    .line 1003
    .line 1004
    const v14, 0x418ee148    # 17.86f

    .line 1005
    .line 1006
    .line 1007
    const v15, 0x418dd70a    # 17.73f

    .line 1008
    .line 1009
    .line 1010
    const/high16 v16, 0x418c0000    # 17.5f

    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    const/16 v16, 0x3800

    .line 1023
    .line 1024
    const/16 v17, 0x0

    .line 1025
    .line 1026
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1027
    .line 1028
    const/4 v7, 0x0

    .line 1029
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1030
    .line 1031
    const/4 v13, 0x0

    .line 1032
    const/4 v14, 0x0

    .line 1033
    const/4 v15, 0x0

    .line 1034
    const-string v4, ""

    .line 1035
    .line 1036
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    sput-object v0, Landroidx/compose/material/icons/twotone/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1045
    .line 1046
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1047
    .line 1048
    .line 1049
    return-object v0
.end method
