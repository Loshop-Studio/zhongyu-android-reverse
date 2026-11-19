.class public final Landroidx/compose/material/icons/twotone/EmergencyShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergencyShare(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EmergencyShare"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const v26, 0x4084cccd    # 4.15f

    .line 80
    .line 81
    .line 82
    const v21, -0x4007ae14    # -1.94f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const/high16 v23, -0x3f800000    # -4.0f

    .line 88
    .line 89
    const v24, 0x3fb9999a    # 1.45f

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
    const/high16 v25, 0x40800000    # 4.0f

    .line 98
    .line 99
    const v26, 0x40c570a4    # 6.17f

    .line 100
    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, 0x3f70a3d7    # 0.94f

    .line 105
    .line 106
    .line 107
    const v23, 0x3f0ccccd    # 0.55f

    .line 108
    .line 109
    .line 110
    const v24, 0x403b851f    # 2.93f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v26, -0x3f3a8f5c    # -6.17f

    .line 117
    .line 118
    .line 119
    const v21, 0x405ccccd    # 3.45f

    .line 120
    .line 121
    .line 122
    const v22, -0x3fb0a3d7    # -3.24f

    .line 123
    .line 124
    .line 125
    const/high16 v23, 0x40800000    # 4.0f

    .line 126
    .line 127
    const v24, -0x3f58a3d7    # -5.23f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x41400000    # 12.0f

    .line 134
    .line 135
    const/high16 v26, 0x41300000    # 11.0f

    .line 136
    .line 137
    const/high16 v21, 0x41800000    # 16.0f

    .line 138
    .line 139
    const v22, 0x41473333    # 12.45f

    .line 140
    .line 141
    .line 142
    const v23, 0x415f0a3d    # 13.94f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x41300000    # 11.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41840000    # 16.5f

    .line 154
    .line 155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, -0x40400000    # -1.5f

    .line 159
    .line 160
    const/high16 v26, -0x40400000    # -1.5f

    .line 161
    .line 162
    const v21, -0x40ab851f    # -0.83f

    .line 163
    .line 164
    .line 165
    const/16 v22, 0x0

    .line 166
    .line 167
    const/high16 v23, -0x40400000    # -1.5f

    .line 168
    .line 169
    const v24, -0x40d47ae1    # -0.67f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, -0x40400000    # -1.5f

    .line 176
    .line 177
    const v6, 0x3f2b851f    # 0.67f

    .line 178
    .line 179
    .line 180
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x3f2b851f    # 0.67f

    .line 186
    .line 187
    .line 188
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 189
    .line 190
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x414d47ae    # 12.83f

    .line 194
    .line 195
    .line 196
    const/high16 v6, 0x41840000    # 16.5f

    .line 197
    .line 198
    const/high16 v7, 0x41400000    # 12.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const v6, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const v8, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40800000    # 4.0f

    .line 261
    .line 262
    const/high16 v2, 0x41400000    # 12.0f

    .line 263
    .line 264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x409e6666    # 4.95f

    .line 268
    .line 269
    .line 270
    const v18, 0x40033333    # 2.05f

    .line 271
    .line 272
    .line 273
    const v13, 0x3ff70a3d    # 1.93f

    .line 274
    .line 275
    .line 276
    const v15, 0x406b851f    # 3.68f

    .line 277
    .line 278
    .line 279
    const v16, 0x3f47ae14    # 0.78f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x3fb47ae1    # 1.41f

    .line 286
    .line 287
    .line 288
    const v2, -0x404b851f    # -1.41f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x41400000    # 12.0f

    .line 295
    .line 296
    const/high16 v18, 0x40c00000    # 6.0f

    .line 297
    .line 298
    const v13, 0x416a147b    # 14.63f

    .line 299
    .line 300
    .line 301
    const v14, 0x40d1eb85    # 6.56f

    .line 302
    .line 303
    .line 304
    const v15, 0x4156147b    # 13.38f

    .line 305
    .line 306
    .line 307
    const/high16 v16, 0x40c00000    # 6.0f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x41075c29    # 8.46f

    .line 313
    .line 314
    .line 315
    const v2, 0x40eeb852    # 7.46f

    .line 316
    .line 317
    .line 318
    const v4, 0x4115eb85    # 9.37f

    .line 319
    .line 320
    .line 321
    const v6, 0x40d1eb85    # 6.56f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x40e1999a    # 7.05f

    .line 328
    .line 329
    .line 330
    const v2, 0x40c1999a    # 6.05f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v18, 0x40800000    # 4.0f

    .line 337
    .line 338
    const v13, 0x41051eb8    # 8.32f

    .line 339
    .line 340
    .line 341
    const v14, 0x4098f5c3    # 4.78f

    .line 342
    .line 343
    .line 344
    const v15, 0x41211eb8    # 10.07f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x40800000    # 4.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x404eb852    # 3.23f

    .line 356
    .line 357
    .line 358
    const v2, 0x419e3d71    # 19.78f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fb47ae1    # 1.41f

    .line 365
    .line 366
    .line 367
    const v2, -0x404b851f    # -1.41f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, 0x414028f6    # 12.01f

    .line 374
    .line 375
    .line 376
    const/high16 v18, 0x40000000    # 2.0f

    .line 377
    .line 378
    const v13, 0x4185eb85    # 16.74f

    .line 379
    .line 380
    .line 381
    const v14, 0x4040a3d7    # 3.01f

    .line 382
    .line 383
    .line 384
    const v15, 0x4167d70a    # 14.49f

    .line 385
    .line 386
    .line 387
    const/high16 v16, 0x40000000    # 2.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x40b47ae1    # 5.64f

    .line 393
    .line 394
    .line 395
    const v2, 0x409428f6    # 4.63f

    .line 396
    .line 397
    .line 398
    const v4, 0x40e8a3d7    # 7.27f

    .line 399
    .line 400
    .line 401
    const v6, 0x4040a3d7    # 3.01f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x40870a3d    # 4.22f

    .line 408
    .line 409
    .line 410
    const v2, 0x404e147b    # 3.22f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const v13, 0x40c70a3d    # 6.22f

    .line 419
    .line 420
    .line 421
    const v14, 0x3f9d70a4    # 1.23f

    .line 422
    .line 423
    .line 424
    const v15, 0x410f851f    # 8.97f

    .line 425
    .line 426
    .line 427
    const/16 v16, 0x0

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x418e51ec    # 17.79f

    .line 433
    .line 434
    .line 435
    const v2, 0x3f9d70a4    # 1.23f

    .line 436
    .line 437
    .line 438
    const v4, 0x404eb852    # 3.23f

    .line 439
    .line 440
    .line 441
    const v6, 0x419e3d71    # 19.78f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41300000    # 11.0f

    .line 451
    .line 452
    const/high16 v2, 0x41400000    # 12.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40800000    # 4.0f

    .line 458
    .line 459
    const v18, 0x4084cccd    # 4.15f

    .line 460
    .line 461
    .line 462
    const v13, 0x3ff851ec    # 1.94f

    .line 463
    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    const/high16 v15, 0x40800000    # 4.0f

    .line 467
    .line 468
    const v16, 0x3fb9999a    # 1.45f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x3f800000    # -4.0f

    .line 475
    .line 476
    const v18, 0x40c570a4    # 6.17f

    .line 477
    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const v14, 0x3f70a3d7    # 0.94f

    .line 481
    .line 482
    .line 483
    const v15, -0x40f33333    # -0.55f

    .line 484
    .line 485
    .line 486
    const v16, 0x403b851f    # 2.93f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v18, -0x3f3a8f5c    # -6.17f

    .line 493
    .line 494
    .line 495
    const v13, -0x3fa33333    # -3.45f

    .line 496
    .line 497
    .line 498
    const v14, -0x3fb0a3d7    # -3.24f

    .line 499
    .line 500
    .line 501
    const/high16 v15, -0x3f800000    # -4.0f

    .line 502
    .line 503
    const v16, -0x3f58a3d7    # -5.23f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, 0x41400000    # 12.0f

    .line 510
    .line 511
    const/high16 v18, 0x41300000    # 11.0f

    .line 512
    .line 513
    const/high16 v13, 0x41000000    # 8.0f

    .line 514
    .line 515
    const v14, 0x41473333    # 12.45f

    .line 516
    .line 517
    .line 518
    const v15, 0x4120f5c3    # 10.06f

    .line 519
    .line 520
    .line 521
    const/high16 v16, 0x41300000    # 11.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41100000    # 9.0f

    .line 530
    .line 531
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, -0x3f400000    # -6.0f

    .line 535
    .line 536
    const v18, 0x40c4cccd    # 6.15f

    .line 537
    .line 538
    .line 539
    const v13, -0x3fb66666    # -3.15f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const/high16 v15, -0x3f400000    # -6.0f

    .line 544
    .line 545
    const v16, 0x401a3d71    # 2.41f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x40c00000    # 6.0f

    .line 552
    .line 553
    const v18, 0x410d999a    # 8.85f

    .line 554
    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const v14, 0x401f5c29    # 2.49f

    .line 558
    .line 559
    .line 560
    const/high16 v15, 0x40000000    # 2.0f

    .line 561
    .line 562
    const v16, 0x40ae147b    # 5.44f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v18, -0x3ef26666    # -8.85f

    .line 569
    .line 570
    .line 571
    const/high16 v13, 0x40800000    # 4.0f

    .line 572
    .line 573
    const v14, -0x3fa5c28f    # -3.41f

    .line 574
    .line 575
    .line 576
    const/high16 v15, 0x40c00000    # 6.0f

    .line 577
    .line 578
    const v16, -0x3f347ae1    # -6.36f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41400000    # 12.0f

    .line 585
    .line 586
    const/high16 v18, 0x41100000    # 9.0f

    .line 587
    .line 588
    const/high16 v13, 0x41900000    # 18.0f

    .line 589
    .line 590
    const v14, 0x41368f5c    # 11.41f

    .line 591
    .line 592
    .line 593
    const v15, 0x41726666    # 15.15f

    .line 594
    .line 595
    .line 596
    const/high16 v16, 0x41100000    # 9.0f

    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41580000    # 13.5f

    .line 605
    .line 606
    const/high16 v2, 0x41700000    # 15.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, -0x40400000    # -1.5f

    .line 612
    .line 613
    const/high16 v18, -0x40400000    # -1.5f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const v14, -0x40ab851f    # -0.83f

    .line 617
    .line 618
    .line 619
    const v15, -0x40d47ae1    # -0.67f

    .line 620
    .line 621
    .line 622
    const/high16 v16, -0x40400000    # -1.5f

    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 628
    .line 629
    const v13, -0x40ab851f    # -0.83f

    .line 630
    .line 631
    .line 632
    const/4 v14, 0x0

    .line 633
    const/high16 v15, -0x40400000    # -1.5f

    .line 634
    .line 635
    const v16, 0x3f2b851f    # 0.67f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 642
    .line 643
    const/4 v13, 0x0

    .line 644
    const v14, 0x3f547ae1    # 0.83f

    .line 645
    .line 646
    .line 647
    const v15, 0x3f2b851f    # 0.67f

    .line 648
    .line 649
    .line 650
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x41580000    # 13.5f

    .line 656
    .line 657
    const/high16 v18, 0x41700000    # 15.0f

    .line 658
    .line 659
    const v13, 0x414d47ae    # 12.83f

    .line 660
    .line 661
    .line 662
    const/high16 v14, 0x41840000    # 16.5f

    .line 663
    .line 664
    const/high16 v15, 0x41580000    # 13.5f

    .line 665
    .line 666
    const v16, 0x417d47ae    # 15.83f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    const/16 v16, 0x3800

    .line 680
    .line 681
    const/16 v17, 0x0

    .line 682
    .line 683
    const/high16 v6, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/high16 v8, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    const/high16 v12, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/4 v13, 0x0

    .line 691
    const/4 v14, 0x0

    .line 692
    const/4 v15, 0x0

    .line 693
    const-string v4, ""

    .line 694
    .line 695
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    sput-object v0, Landroidx/compose/material/icons/twotone/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    return-object v0
.end method
