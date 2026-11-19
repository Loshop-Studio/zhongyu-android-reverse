.class public final Landroidx/compose/material/icons/twotone/PanToolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panTool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanTool(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanToolKt;->_panTool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanTool"

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
    const v4, 0x40b4cccd    # 5.65f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x419c0000    # 19.5f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, -0x41000000    # -0.5f

    .line 79
    .line 80
    const/high16 v26, 0x3f000000    # 0.5f

    .line 81
    .line 82
    const v21, -0x4170a3d7    # -0.28f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const/high16 v23, -0x41000000    # -0.5f

    .line 88
    .line 89
    const v24, 0x3e6147ae    # 0.22f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x405ae148    # 3.42f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v26, -0x41000000    # -0.5f

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const v22, -0x4170a3d7    # -0.28f

    .line 118
    .line 119
    .line 120
    const v23, -0x419eb852    # -0.22f

    .line 121
    .line 122
    .line 123
    const/high16 v24, -0x41000000    # -0.5f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3e6147ae    # 0.22f

    .line 129
    .line 130
    .line 131
    const/high16 v6, -0x41000000    # -0.5f

    .line 132
    .line 133
    const/high16 v7, 0x3f000000    # 0.5f

    .line 134
    .line 135
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, -0x40000000    # -2.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x4020a3d7    # 2.51f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x3e6147ae    # 0.22f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x41400000    # 12.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, -0x40000000    # -2.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x409947ae    # 4.79f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x3e6b851f    # 0.23f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x414deb85    # 12.87f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, -0x3f54cccd    # -5.35f

    .line 195
    .line 196
    .line 197
    const v6, -0x3fcae148    # -2.83f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, -0x40fd70a4    # -0.51f

    .line 204
    .line 205
    .line 206
    const v6, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x40bb851f    # 5.86f

    .line 213
    .line 214
    .line 215
    const v6, 0x40c33333    # 6.1f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, 0x3fb851ec    # 1.44f

    .line 222
    .line 223
    .line 224
    const v26, 0x3f1eb852    # 0.62f

    .line 225
    .line 226
    .line 227
    const v21, 0x3ec28f5c    # 0.38f

    .line 228
    .line 229
    .line 230
    const v22, 0x3ec7ae14    # 0.39f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f666666    # 0.9f

    .line 234
    .line 235
    .line 236
    const v24, 0x3f1eb852    # 0.62f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x41900000    # 18.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, 0x40000000    # 2.0f

    .line 248
    .line 249
    const/high16 v26, -0x40000000    # -2.0f

    .line 250
    .line 251
    const v21, 0x3f8ccccd    # 1.1f

    .line 252
    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/high16 v23, 0x40000000    # 2.0f

    .line 257
    .line 258
    const v24, -0x4099999a    # -0.9f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x40c4cccd    # 6.15f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, -0x41000000    # -0.5f

    .line 271
    .line 272
    const/high16 v26, -0x41000000    # -0.5f

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const v22, -0x4170a3d7    # -0.28f

    .line 277
    .line 278
    .line 279
    const v23, -0x419eb852    # -0.22f

    .line 280
    .line 281
    .line 282
    const/high16 v24, -0x41000000    # -0.5f

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/16 v16, 0x3800

    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const v6, 0x3e99999a    # 0.3f

    .line 299
    .line 300
    .line 301
    const v8, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const/high16 v9, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v12, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const/4 v14, 0x0

    .line 311
    const/4 v15, 0x0

    .line 312
    const-string v4, ""

    .line 313
    .line 314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 322
    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 324
    .line 325
    .line 326
    move-result-wide v6

    .line 327
    const/4 v0, 0x0

    .line 328
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const v0, 0x4069999a    # 3.65f

    .line 345
    .line 346
    .line 347
    const/high16 v2, 0x419c0000    # 19.5f

    .line 348
    .line 349
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x41000000    # -0.5f

    .line 353
    .line 354
    const v18, 0x3d4ccccd    # 0.05f

    .line 355
    .line 356
    .line 357
    const v13, -0x41d1eb85    # -0.17f

    .line 358
    .line 359
    .line 360
    const v15, -0x4151eb85    # -0.34f

    .line 361
    .line 362
    .line 363
    const v16, 0x3ca3d70a    # 0.02f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x4170a3d7    # -0.28f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 376
    .line 377
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const v14, -0x404f5c29    # -1.38f

    .line 381
    .line 382
    .line 383
    const v15, -0x4070a3d7    # -1.12f

    .line 384
    .line 385
    .line 386
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x408f5c29    # -0.94f

    .line 392
    .line 393
    .line 394
    const v18, 0x3e3851ec    # 0.18f

    .line 395
    .line 396
    .line 397
    const v13, -0x41570a3d    # -0.33f

    .line 398
    .line 399
    .line 400
    const/4 v14, 0x0

    .line 401
    const v15, -0x40d9999a    # -0.65f

    .line 402
    .line 403
    .line 404
    const v16, 0x3d75c28f    # 0.06f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x41580000    # 13.5f

    .line 411
    .line 412
    const v18, 0x3c23d70a    # 0.01f

    .line 413
    .line 414
    .line 415
    const v13, 0x4171c28f    # 15.11f

    .line 416
    .line 417
    .line 418
    const v14, 0x3ee147ae    # 0.44f

    .line 419
    .line 420
    .line 421
    const v15, 0x4165999a    # 14.35f

    .line 422
    .line 423
    .line 424
    const v16, 0x3c23d70a    # 0.01f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x3fe0a3d7    # -2.49f

    .line 431
    .line 432
    .line 433
    const v18, 0x40151eb8    # 2.33f

    .line 434
    .line 435
    .line 436
    const v13, -0x40570a3d    # -1.32f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const v15, -0x3fe5c28f    # -2.41f

    .line 441
    .line 442
    .line 443
    const v16, 0x3f83d70a    # 1.03f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x40fd70a4    # -0.51f

    .line 450
    .line 451
    .line 452
    const v18, -0x42b33333    # -0.05f

    .line 453
    .line 454
    .line 455
    const v13, -0x41dc28f6    # -0.16f

    .line 456
    .line 457
    .line 458
    const v14, -0x430a3d71    # -0.03f

    .line 459
    .line 460
    .line 461
    const v15, -0x41570a3d    # -0.33f

    .line 462
    .line 463
    .line 464
    const v16, -0x42b33333    # -0.05f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 471
    .line 472
    const/high16 v18, 0x40200000    # 2.5f

    .line 473
    .line 474
    const v13, -0x404f5c29    # -1.38f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 479
    .line 480
    const v16, 0x3f8f5c29    # 1.12f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x4118cccd    # 9.55f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x3fe5c28f    # -2.41f

    .line 493
    .line 494
    .line 495
    const v2, -0x405c28f6    # -1.28f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x3fef5c29    # -2.26f

    .line 502
    .line 503
    .line 504
    const v18, 0x3e8a3d71    # 0.27f

    .line 505
    .line 506
    .line 507
    const v13, -0x40c51eb8    # -0.73f

    .line 508
    .line 509
    .line 510
    const v14, -0x413851ec    # -0.39f

    .line 511
    .line 512
    .line 513
    const v15, -0x402e147b    # -1.64f

    .line 514
    .line 515
    .line 516
    const v16, -0x4170a3d7    # -0.28f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, -0x3ffb851f    # -2.07f

    .line 523
    .line 524
    .line 525
    const v2, 0x3fea3d71    # 1.83f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x40e9999a    # 7.3f

    .line 532
    .line 533
    .line 534
    const v2, 0x40f3851f    # 7.61f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x4038f5c3    # 2.89f

    .line 541
    .line 542
    .line 543
    const v18, 0x3f9d70a4    # 1.23f

    .line 544
    .line 545
    .line 546
    const/high16 v13, 0x3f400000    # 0.75f

    .line 547
    .line 548
    const v14, 0x3f47ae14    # 0.78f

    .line 549
    .line 550
    .line 551
    const v15, 0x3fe66666    # 1.8f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f9d70a4    # 1.23f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x41900000    # 18.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x40800000    # 4.0f

    .line 566
    .line 567
    const/high16 v18, -0x3f800000    # -4.0f

    .line 568
    .line 569
    const v13, 0x400d70a4    # 2.21f

    .line 570
    .line 571
    .line 572
    const/4 v14, 0x0

    .line 573
    const/high16 v15, 0x40800000    # 4.0f

    .line 574
    .line 575
    const v16, -0x401ae148    # -1.79f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x40c4cccd    # 6.15f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 588
    .line 589
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const v14, -0x404f5c29    # -1.38f

    .line 593
    .line 594
    .line 595
    const v15, -0x4070a3d7    # -1.12f

    .line 596
    .line 597
    .line 598
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41a00000    # 20.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, -0x40000000    # -2.0f

    .line 612
    .line 613
    const/high16 v18, 0x40000000    # 2.0f

    .line 614
    .line 615
    const v14, 0x3f8ccccd    # 1.1f

    .line 616
    .line 617
    .line 618
    const v15, -0x4099999a    # -0.9f

    .line 619
    .line 620
    .line 621
    const/high16 v16, 0x40000000    # 2.0f

    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, -0x3f2e6666    # -6.55f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, -0x4047ae14    # -1.44f

    .line 633
    .line 634
    .line 635
    const v18, -0x40e147ae    # -0.62f

    .line 636
    .line 637
    .line 638
    const v13, -0x40f5c28f    # -0.54f

    .line 639
    .line 640
    .line 641
    const/4 v14, 0x0

    .line 642
    const v15, -0x40770a3d    # -1.07f

    .line 643
    .line 644
    .line 645
    const v16, -0x419eb852    # -0.22f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x3f447ae1    # -5.86f

    .line 652
    .line 653
    .line 654
    const v2, -0x3f3c7ae1    # -6.11f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x3f028f5c    # 0.51f

    .line 661
    .line 662
    .line 663
    const v2, -0x4119999a    # -0.45f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41200000    # 10.0f

    .line 670
    .line 671
    const v2, 0x418d47ae    # 17.66f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x409947ae    # 4.79f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x3f000000    # 0.5f

    .line 684
    .line 685
    const/high16 v18, -0x41000000    # -0.5f

    .line 686
    .line 687
    const/4 v13, 0x0

    .line 688
    const v14, -0x4170a3d7    # -0.28f

    .line 689
    .line 690
    .line 691
    const v15, 0x3e6147ae    # 0.22f

    .line 692
    .line 693
    .line 694
    const/high16 v16, -0x41000000    # -0.5f

    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x3e6b851f    # 0.23f

    .line 700
    .line 701
    .line 702
    const/high16 v2, 0x3f000000    # 0.5f

    .line 703
    .line 704
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v0, 0x41400000    # 12.0f

    .line 708
    .line 709
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v0, 0x40000000    # 2.0f

    .line 713
    .line 714
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x4020a3d7    # 2.51f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x3e6147ae    # 0.22f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v0, 0x41400000    # 12.0f

    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x40000000    # 2.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x405ae148    # 3.42f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x3e6147ae    # 0.22f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v0, 0x41400000    # 12.0f

    .line 758
    .line 759
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v0, 0x40000000    # 2.0f

    .line 763
    .line 764
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v0, 0x40c4cccd    # 6.15f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x3e6147ae    # 0.22f

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const/high16 v0, 0x41a00000    # 20.0f

    .line 783
    .line 784
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    const/16 v16, 0x3800

    .line 795
    .line 796
    const/16 v17, 0x0

    .line 797
    .line 798
    const/high16 v6, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/high16 v8, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const/4 v7, 0x0

    .line 803
    const/high16 v12, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const/4 v15, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    sput-object v0, Landroidx/compose/material/icons/twotone/PanToolKt;->_panTool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 818
    .line 819
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    return-object v0
.end method
