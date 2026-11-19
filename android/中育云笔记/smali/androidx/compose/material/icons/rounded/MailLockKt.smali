.class public final Landroidx/compose/material/icons/rounded/MailLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mailLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMailLock(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MailLockKt;->_mailLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MailLock"

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
    const v4, 0x411f851f    # 9.97f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41b00000    # 22.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40c00000    # 6.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, -0x40000000    # -2.0f

    .line 84
    .line 85
    const/high16 v26, -0x40000000    # -2.0f

    .line 86
    .line 87
    const/16 v21, 0x0

    .line 88
    .line 89
    const v22, -0x40733333    # -1.1f

    .line 90
    .line 91
    .line 92
    const v23, -0x4099999a    # -0.9f

    .line 93
    .line 94
    .line 95
    const/high16 v24, -0x40000000    # -2.0f

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x4000a3d7    # 2.01f

    .line 108
    .line 109
    .line 110
    const/high16 v26, 0x40c00000    # 6.0f

    .line 111
    .line 112
    const v21, 0x4039999a    # 2.9f

    .line 113
    .line 114
    .line 115
    const/high16 v22, 0x40800000    # 4.0f

    .line 116
    .line 117
    const v23, 0x4000a3d7    # 2.01f

    .line 118
    .line 119
    .line 120
    const v24, 0x409ccccd    # 4.9f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41900000    # 18.0f

    .line 127
    .line 128
    const/high16 v6, 0x40000000    # 2.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x40000000    # 2.0f

    .line 134
    .line 135
    const/high16 v26, 0x40000000    # 2.0f

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const v22, 0x3f8ccccd    # 1.1f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41400000    # 12.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, -0x3f5f0a3d    # -5.03f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x40a00000    # 5.0f

    .line 162
    .line 163
    const/high16 v26, -0x3f600000    # -5.0f

    .line 164
    .line 165
    const v22, -0x3fcf5c29    # -2.76f

    .line 166
    .line 167
    .line 168
    const v23, 0x400f5c29    # 2.24f

    .line 169
    .line 170
    .line 171
    const/high16 v24, -0x3f600000    # -5.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41b00000    # 22.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x419ccccd    # 19.6f

    .line 185
    .line 186
    .line 187
    const/high16 v6, 0x41040000    # 8.25f

    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x3f2eb852    # -6.54f

    .line 193
    .line 194
    .line 195
    const v6, 0x4082e148    # 4.09f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, -0x3ff851ec    # -2.12f

    .line 202
    .line 203
    .line 204
    const/16 v26, 0x0

    .line 205
    .line 206
    const v21, -0x40d9999a    # -0.65f

    .line 207
    .line 208
    .line 209
    const v22, 0x3ed1eb85    # 0.41f

    .line 210
    .line 211
    .line 212
    const v23, -0x4043d70a    # -1.47f

    .line 213
    .line 214
    .line 215
    const v24, 0x3ed1eb85    # 0.41f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x408ccccd    # 4.4f

    .line 222
    .line 223
    .line 224
    const/high16 v6, 0x41040000    # 8.25f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, 0x40800000    # 4.0f

    .line 230
    .line 231
    const v26, 0x40f0f5c3    # 7.53f

    .line 232
    .line 233
    .line 234
    const v21, 0x4084cccd    # 4.15f

    .line 235
    .line 236
    .line 237
    const v22, 0x410170a4    # 8.09f

    .line 238
    .line 239
    .line 240
    const/high16 v23, 0x40800000    # 4.0f

    .line 241
    .line 242
    const v24, 0x40fa3d71    # 7.82f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, 0x3fa66666    # 1.3f

    .line 253
    .line 254
    .line 255
    const v26, -0x40c7ae14    # -0.72f

    .line 256
    .line 257
    .line 258
    const/16 v21, 0x0

    .line 259
    .line 260
    const v22, -0x40d47ae1    # -0.67f

    .line 261
    .line 262
    .line 263
    const v23, 0x3f3ae148    # 0.73f

    .line 264
    .line 265
    .line 266
    const v24, -0x40770a3d    # -1.07f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x41300000    # 11.0f

    .line 273
    .line 274
    const/high16 v6, 0x41400000    # 12.0f

    .line 275
    .line 276
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, 0x40d66666    # 6.7f

    .line 280
    .line 281
    .line 282
    const v6, -0x3f79eb85    # -4.19f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v25, 0x41a00000    # 20.0f

    .line 289
    .line 290
    const v26, 0x40f0f5c3    # 7.53f

    .line 291
    .line 292
    .line 293
    const v21, 0x419a28f6    # 19.27f

    .line 294
    .line 295
    .line 296
    const v22, 0x40ceb852    # 6.46f

    .line 297
    .line 298
    .line 299
    const/high16 v23, 0x41a00000    # 20.0f

    .line 300
    .line 301
    const v24, 0x40db851f    # 6.86f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/4 v4, 0x0

    .line 308
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x419ccccd    # 19.6f

    .line 312
    .line 313
    .line 314
    const/high16 v26, 0x41040000    # 8.25f

    .line 315
    .line 316
    const/high16 v21, 0x41a00000    # 20.0f

    .line 317
    .line 318
    const v22, 0x40fa3d71    # 7.82f

    .line 319
    .line 320
    .line 321
    const v23, 0x419ecccd    # 19.85f

    .line 322
    .line 323
    .line 324
    const v24, 0x410170a4    # 8.09f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    const/16 v16, 0x3800

    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const/high16 v6, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/high16 v8, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    const/high16 v9, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v12, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    const/4 v14, 0x0

    .line 352
    const/4 v15, 0x0

    .line 353
    const-string v4, ""

    .line 354
    .line 355
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 356
    .line 357
    .line 358
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 363
    .line 364
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 365
    .line 366
    .line 367
    move-result-wide v6

    .line 368
    const/4 v0, 0x0

    .line 369
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 377
    .line 378
    .line 379
    move-result v11

    .line 380
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41b80000    # 23.0f

    .line 386
    .line 387
    const/high16 v2, 0x41700000    # 15.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, -0x40800000    # -1.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, -0x40000000    # -2.0f

    .line 398
    .line 399
    const/high16 v18, -0x40000000    # -2.0f

    .line 400
    .line 401
    const v14, -0x40733333    # -1.1f

    .line 402
    .line 403
    .line 404
    const v15, -0x4099999a    # -0.9f

    .line 405
    .line 406
    .line 407
    const/high16 v16, -0x40000000    # -2.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3f666666    # 0.9f

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x40000000    # 2.0f

    .line 416
    .line 417
    const/high16 v4, -0x40000000    # -2.0f

    .line 418
    .line 419
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x3f800000    # 1.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, -0x40800000    # -1.0f

    .line 428
    .line 429
    const/high16 v18, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const v13, -0x40f33333    # -0.55f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const/high16 v15, -0x40800000    # -1.0f

    .line 436
    .line 437
    const v16, 0x3ee66666    # 0.45f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40400000    # 3.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, 0x3f0ccccd    # 0.55f

    .line 452
    .line 453
    .line 454
    const v15, 0x3ee66666    # 0.45f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x3f800000    # 1.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40800000    # 4.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v18, -0x40800000    # -1.0f

    .line 468
    .line 469
    const v13, 0x3f0ccccd    # 0.55f

    .line 470
    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const/high16 v15, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const v16, -0x4119999a    # -0.45f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x41b80000    # 23.0f

    .line 487
    .line 488
    const/high16 v18, 0x41700000    # 15.0f

    .line 489
    .line 490
    const/high16 v13, 0x41c00000    # 24.0f

    .line 491
    .line 492
    const v14, 0x41773333    # 15.45f

    .line 493
    .line 494
    .line 495
    const v15, 0x41bc6666    # 23.55f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x41700000    # 15.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41700000    # 15.0f

    .line 507
    .line 508
    const/high16 v2, 0x41b00000    # 22.0f

    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, -0x40000000    # -2.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, -0x40800000    # -1.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v18, -0x40800000    # -1.0f

    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const v14, -0x40f33333    # -0.55f

    .line 529
    .line 530
    .line 531
    const v15, 0x3ee66666    # 0.45f

    .line 532
    .line 533
    .line 534
    const/high16 v16, -0x40800000    # -1.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3ee66666    # 0.45f

    .line 540
    .line 541
    .line 542
    const/high16 v2, 0x3f800000    # 1.0f

    .line 543
    .line 544
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x41700000    # 15.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/16 v16, 0x3800

    .line 560
    .line 561
    const/16 v17, 0x0

    .line 562
    .line 563
    const/high16 v6, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v7, 0x0

    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/rounded/MailLockKt;->_mailLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method
