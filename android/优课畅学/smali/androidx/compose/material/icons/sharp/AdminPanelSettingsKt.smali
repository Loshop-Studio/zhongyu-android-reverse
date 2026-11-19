.class public final Landroidx/compose/material/icons/sharp/AdminPanelSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdminPanelSettings(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.AdminPanelSettings"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const v26, 0x3db851ec    # 0.09f

    .line 80
    .line 81
    .line 82
    const v21, 0x3eae147b    # 0.34f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v24, 0x3d23d70a    # 0.04f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x40c8a3d7    # 6.27f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41280000    # 10.5f

    .line 105
    .line 106
    const/high16 v6, 0x40400000    # 3.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40400000    # 3.0f

    .line 112
    .line 113
    const v6, 0x40c8a3d7    # 6.27f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x409d1eb8    # 4.91f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x40f00000    # 7.5f

    .line 126
    .line 127
    const v26, 0x411d1eb8    # 9.82f

    .line 128
    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    const v22, 0x409147ae    # 4.54f

    .line 133
    .line 134
    .line 135
    const v23, 0x404ccccd    # 3.2f

    .line 136
    .line 137
    .line 138
    const v24, 0x410ca3d7    # 8.79f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x3fcccccd    # 1.6f

    .line 145
    .line 146
    .line 147
    const v26, -0x40f33333    # -0.55f

    .line 148
    .line 149
    .line 150
    const v21, 0x3f0ccccd    # 0.55f

    .line 151
    .line 152
    .line 153
    const v22, -0x41fae148    # -0.13f

    .line 154
    .line 155
    .line 156
    const v23, 0x3f8a3d71    # 1.08f

    .line 157
    .line 158
    .line 159
    const v24, -0x415c28f6    # -0.32f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x41300000    # 11.0f

    .line 166
    .line 167
    const/high16 v26, 0x41880000    # 17.0f

    .line 168
    .line 169
    const v21, 0x41368f5c    # 11.41f

    .line 170
    .line 171
    .line 172
    const v22, 0x419bc28f    # 19.47f

    .line 173
    .line 174
    .line 175
    const/high16 v23, 0x41300000    # 11.0f

    .line 176
    .line 177
    const v24, 0x41923d71    # 18.28f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v25, 0x41880000    # 17.0f

    .line 184
    .line 185
    const/high16 v26, 0x41300000    # 11.0f

    .line 186
    .line 187
    const/high16 v21, 0x41300000    # 11.0f

    .line 188
    .line 189
    const v22, 0x415b0a3d    # 13.69f

    .line 190
    .line 191
    .line 192
    const v23, 0x415b0a3d    # 13.69f

    .line 193
    .line 194
    .line 195
    const/high16 v24, 0x41300000    # 11.0f

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/16 v16, 0x3800

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/high16 v6, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v8, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    const/high16 v9, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/high16 v12, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const-string v4, ""

    .line 224
    .line 225
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 226
    .line 227
    .line 228
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 233
    .line 234
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    const/4 v0, 0x0

    .line 239
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x41500000    # 13.0f

    .line 256
    .line 257
    const/high16 v2, 0x41880000    # 17.0f

    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x3f800000    # -4.0f

    .line 263
    .line 264
    const/high16 v18, 0x40800000    # 4.0f

    .line 265
    .line 266
    const v13, -0x3ff28f5c    # -2.21f

    .line 267
    .line 268
    .line 269
    const/high16 v15, -0x3f800000    # -4.0f

    .line 270
    .line 271
    const v16, 0x3fe51eb8    # 1.79f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x40800000    # 4.0f

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, 0x400d70a4    # 2.21f

    .line 281
    .line 282
    .line 283
    const v15, 0x3fe51eb8    # 1.79f

    .line 284
    .line 285
    .line 286
    const/high16 v16, 0x40800000    # 4.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, -0x401ae148    # -1.79f

    .line 292
    .line 293
    .line 294
    const/high16 v2, -0x3f800000    # -4.0f

    .line 295
    .line 296
    const/high16 v4, 0x40800000    # 4.0f

    .line 297
    .line 298
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41880000    # 17.0f

    .line 302
    .line 303
    const/high16 v18, 0x41500000    # 13.0f

    .line 304
    .line 305
    const/high16 v13, 0x41a80000    # 21.0f

    .line 306
    .line 307
    const v14, 0x416ca3d7    # 14.79f

    .line 308
    .line 309
    .line 310
    const v15, 0x4199ae14    # 19.21f

    .line 311
    .line 312
    .line 313
    const/high16 v16, 0x41500000    # 13.0f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x4166147b    # 14.38f

    .line 322
    .line 323
    .line 324
    const/high16 v2, 0x41880000    # 17.0f

    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3f8f5c29    # 1.12f

    .line 330
    .line 331
    .line 332
    const v18, 0x3f8f5c29    # 1.12f

    .line 333
    .line 334
    .line 335
    const v13, 0x3f1eb852    # 0.62f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const v15, 0x3f8f5c29    # 1.12f

    .line 340
    .line 341
    .line 342
    const v16, 0x3f028f5c    # 0.51f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x3f8f5c29    # 1.12f

    .line 349
    .line 350
    .line 351
    const v2, -0x40fd70a4    # -0.51f

    .line 352
    .line 353
    .line 354
    const v4, -0x4070a3d7    # -1.12f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x40fd70a4    # -0.51f

    .line 361
    .line 362
    .line 363
    const v2, -0x4070a3d7    # -1.12f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x41830a3d    # 16.38f

    .line 370
    .line 371
    .line 372
    const v2, 0x4166147b    # 14.38f

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41880000    # 17.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x419e0000    # 19.75f

    .line 384
    .line 385
    const/high16 v2, 0x41880000    # 17.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x3ff0a3d7    # -2.24f

    .line 391
    .line 392
    .line 393
    const v18, -0x406a3d71    # -1.17f

    .line 394
    .line 395
    .line 396
    const v13, -0x4091eb85    # -0.93f

    .line 397
    .line 398
    .line 399
    const v15, -0x402147ae    # -1.74f

    .line 400
    .line 401
    .line 402
    const v16, -0x41147ae1    # -0.46f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x400f5c29    # 2.24f

    .line 409
    .line 410
    .line 411
    const v18, -0x4075c28f    # -1.08f

    .line 412
    .line 413
    .line 414
    const v13, 0x3d4ccccd    # 0.05f

    .line 415
    .line 416
    .line 417
    const v14, -0x40c7ae14    # -0.72f

    .line 418
    .line 419
    .line 420
    const v15, 0x3fc147ae    # 1.51f

    .line 421
    .line 422
    .line 423
    const v16, -0x4075c28f    # -1.08f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x400f5c29    # 2.24f

    .line 430
    .line 431
    .line 432
    const v2, 0x3f8a3d71    # 1.08f

    .line 433
    .line 434
    .line 435
    const v4, 0x400c28f6    # 2.19f

    .line 436
    .line 437
    .line 438
    const v6, 0x3eb851ec    # 0.36f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x41880000    # 17.0f

    .line 445
    .line 446
    const/high16 v18, 0x419e0000    # 19.75f

    .line 447
    .line 448
    const v13, 0x4195eb85    # 18.74f

    .line 449
    .line 450
    .line 451
    const v14, 0x419a51ec    # 19.29f

    .line 452
    .line 453
    .line 454
    const v15, 0x418f70a4    # 17.93f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x419e0000    # 19.75f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const/4 v14, 0x0

    .line 480
    const/4 v15, 0x0

    .line 481
    const-string v4, ""

    .line 482
    .line 483
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    sput-object v0, Landroidx/compose/material/icons/sharp/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    return-object v0
.end method
