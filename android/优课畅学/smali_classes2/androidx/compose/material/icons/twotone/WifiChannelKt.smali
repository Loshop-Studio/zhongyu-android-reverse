.class public final Landroidx/compose/material/icons/twotone/WifiChannelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiChannel(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WifiChannelKt;->_wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WifiChannel"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f400000    # -6.0f

    .line 80
    .line 81
    const/high16 v21, 0x3f000000    # 0.5f

    .line 82
    .line 83
    const v22, -0x3fde147b    # -2.53f

    .line 84
    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const/high16 v24, -0x3f400000    # -6.0f

    .line 89
    .line 90
    move-object/from16 v20, v2

    .line 91
    .line 92
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x40c00000    # 6.0f

    .line 96
    .line 97
    const v6, 0x4061eb85    # 3.53f

    .line 98
    .line 99
    .line 100
    const/high16 v7, 0x40200000    # 2.5f

    .line 101
    .line 102
    const/high16 v8, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v2, v7, v6, v8, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41500000    # 13.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x40a051ec    # 5.01f

    .line 116
    .line 117
    .line 118
    const/high16 v6, 0x41a80000    # 21.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, 0x403f5c29    # 2.99f

    .line 124
    .line 125
    .line 126
    const v26, -0x3ed2147b    # -10.87f

    .line 127
    .line 128
    .line 129
    const v21, 0x3f1c28f6    # 0.61f

    .line 130
    .line 131
    .line 132
    const v22, -0x3f575c29    # -5.27f

    .line 133
    .line 134
    .line 135
    const v24, -0x3ee2e148    # -9.82f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v26, 0x412deb85    # 10.87f

    .line 142
    .line 143
    .line 144
    const v21, 0x3f7ae148    # 0.98f

    .line 145
    .line 146
    .line 147
    const v22, 0x3f866666    # 1.05f

    .line 148
    .line 149
    .line 150
    const v23, 0x401851ec    # 2.38f

    .line 151
    .line 152
    .line 153
    const v24, 0x40b3851f    # 5.61f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41800000    # 16.0f

    .line 166
    .line 167
    const/high16 v6, 0x41500000    # 13.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 173
    .line 174
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 175
    .line 176
    const v21, -0x40828f5c    # -0.99f

    .line 177
    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    const v23, -0x40170a3d    # -1.82f

    .line 182
    .line 183
    .line 184
    const v24, 0x3f1eb852    # 0.62f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x40200000    # 2.5f

    .line 191
    .line 192
    const v26, -0x3ee8f5c3    # -9.44f

    .line 193
    .line 194
    .line 195
    const v21, 0x3f11eb85    # 0.57f

    .line 196
    .line 197
    .line 198
    const v22, -0x3f675c29    # -4.77f

    .line 199
    .line 200
    .line 201
    const v23, 0x3fc51eb8    # 1.54f

    .line 202
    .line 203
    .line 204
    const v24, -0x3ef6147b    # -8.62f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, 0x401f5c29    # 2.49f

    .line 211
    .line 212
    .line 213
    const v26, 0x4116e148    # 9.43f

    .line 214
    .line 215
    .line 216
    const v21, 0x3f7851ec    # 0.97f

    .line 217
    .line 218
    .line 219
    const v22, 0x3f4f5c29    # 0.81f

    .line 220
    .line 221
    .line 222
    const v23, 0x3ff47ae1    # 1.91f

    .line 223
    .line 224
    .line 225
    const v24, 0x409570a4    # 4.67f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x41800000    # 16.0f

    .line 232
    .line 233
    const/high16 v26, 0x41500000    # 13.0f

    .line 234
    .line 235
    const v21, 0x418e7ae1    # 17.81f

    .line 236
    .line 237
    .line 238
    const v22, 0x4159eb85    # 13.62f

    .line 239
    .line 240
    .line 241
    const v23, 0x4187d70a    # 16.98f

    .line 242
    .line 243
    .line 244
    const/high16 v24, 0x41500000    # 13.0f

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const/16 v16, 0x3800

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    const v6, 0x3e99999a    # 0.3f

    .line 261
    .line 262
    .line 263
    const v8, 0x3e99999a    # 0.3f

    .line 264
    .line 265
    .line 266
    const/4 v7, 0x0

    .line 267
    const/high16 v9, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v12, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    const-string v4, ""

    .line 275
    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/4 v0, 0x0

    .line 290
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41800000    # 16.0f

    .line 307
    .line 308
    const/high16 v2, 0x40400000    # 3.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x3f733333    # -4.4f

    .line 314
    .line 315
    .line 316
    const v18, 0x41291eb8    # 10.57f

    .line 317
    .line 318
    .line 319
    const v13, -0x3fdf5c29    # -2.51f

    .line 320
    .line 321
    .line 322
    const v15, -0x3f8eb852    # -3.77f

    .line 323
    .line 324
    .line 325
    const v16, 0x40b3851f    # 5.61f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41000000    # 8.0f

    .line 332
    .line 333
    const/high16 v18, 0x41000000    # 8.0f

    .line 334
    .line 335
    const v13, 0x412ca3d7    # 10.79f

    .line 336
    .line 337
    .line 338
    const v14, 0x412a8f5c    # 10.66f

    .line 339
    .line 340
    .line 341
    const v15, 0x4119c28f    # 9.61f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41000000    # 8.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x40400000    # 3.0f

    .line 350
    .line 351
    const/high16 v18, 0x41a80000    # 21.0f

    .line 352
    .line 353
    const v13, 0x408dc28f    # 4.43f

    .line 354
    .line 355
    .line 356
    const/high16 v14, 0x41000000    # 8.0f

    .line 357
    .line 358
    const/high16 v15, 0x40400000    # 3.0f

    .line 359
    .line 360
    const/high16 v16, 0x41a80000    # 21.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x4000a3d7    # 2.01f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x403f5c29    # 2.99f

    .line 372
    .line 373
    .line 374
    const v18, -0x3ed2147b    # -10.87f

    .line 375
    .line 376
    .line 377
    const v13, 0x3f1c28f6    # 0.61f

    .line 378
    .line 379
    .line 380
    const v14, -0x3f575c29    # -5.27f

    .line 381
    .line 382
    .line 383
    const/high16 v15, 0x40000000    # 2.0f

    .line 384
    .line 385
    const v16, -0x3ee2e148    # -9.82f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v18, 0x412deb85    # 10.87f

    .line 392
    .line 393
    .line 394
    const v13, 0x3f7ae148    # 0.98f

    .line 395
    .line 396
    .line 397
    const v14, 0x3f866666    # 1.05f

    .line 398
    .line 399
    .line 400
    const v15, 0x401851ec    # 2.38f

    .line 401
    .line 402
    .line 403
    const v16, 0x40b3851f    # 5.61f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41500000    # 13.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x40400000    # 3.0f

    .line 415
    .line 416
    const/high16 v18, -0x3f400000    # -6.0f

    .line 417
    .line 418
    const/high16 v13, 0x3f000000    # 0.5f

    .line 419
    .line 420
    const v14, -0x3fde147b    # -2.53f

    .line 421
    .line 422
    .line 423
    const/high16 v15, 0x40000000    # 2.0f

    .line 424
    .line 425
    const/high16 v16, -0x3f400000    # -6.0f

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40c00000    # 6.0f

    .line 431
    .line 432
    const v2, 0x4061eb85    # 3.53f

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x40200000    # 2.5f

    .line 436
    .line 437
    const/high16 v6, 0x40400000    # 3.0f

    .line 438
    .line 439
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x40000000    # 2.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x41800000    # 16.0f

    .line 448
    .line 449
    const/high16 v18, 0x40400000    # 3.0f

    .line 450
    .line 451
    const/high16 v13, 0x41a80000    # 21.0f

    .line 452
    .line 453
    const/high16 v14, 0x41a80000    # 21.0f

    .line 454
    .line 455
    const/high16 v15, 0x41a40000    # 20.5f

    .line 456
    .line 457
    const/high16 v16, 0x40400000    # 3.0f

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 466
    .line 467
    const/high16 v2, 0x41500000    # 13.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 473
    .line 474
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 475
    .line 476
    const v13, -0x40828f5c    # -0.99f

    .line 477
    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    const v15, -0x40170a3d    # -1.82f

    .line 481
    .line 482
    .line 483
    const v16, 0x3f1eb852    # 0.62f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40200000    # 2.5f

    .line 490
    .line 491
    const v18, -0x3ee8f5c3    # -9.44f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f11eb85    # 0.57f

    .line 495
    .line 496
    .line 497
    const v14, -0x3f675c29    # -4.77f

    .line 498
    .line 499
    .line 500
    const v15, 0x3fc51eb8    # 1.54f

    .line 501
    .line 502
    .line 503
    const v16, -0x3ef6147b    # -8.62f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v17, 0x401f5c29    # 2.49f

    .line 510
    .line 511
    .line 512
    const v18, 0x4116e148    # 9.43f

    .line 513
    .line 514
    .line 515
    const v13, 0x3f7851ec    # 0.97f

    .line 516
    .line 517
    .line 518
    const v14, 0x3f4f5c29    # 0.81f

    .line 519
    .line 520
    .line 521
    const v15, 0x3ff47ae1    # 1.91f

    .line 522
    .line 523
    .line 524
    const v16, 0x409570a4    # 4.67f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, 0x41800000    # 16.0f

    .line 531
    .line 532
    const/high16 v18, 0x41500000    # 13.0f

    .line 533
    .line 534
    const v13, 0x418e7ae1    # 17.81f

    .line 535
    .line 536
    .line 537
    const v14, 0x4159eb85    # 13.62f

    .line 538
    .line 539
    .line 540
    const v15, 0x4187d70a    # 16.98f

    .line 541
    .line 542
    .line 543
    const/high16 v16, 0x41500000    # 13.0f

    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v12, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/4 v13, 0x0

    .line 567
    const/4 v14, 0x0

    .line 568
    const/4 v15, 0x0

    .line 569
    const-string v4, ""

    .line 570
    .line 571
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    sput-object v0, Landroidx/compose/material/icons/twotone/WifiChannelKt;->_wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 580
    .line 581
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    return-object v0
.end method
