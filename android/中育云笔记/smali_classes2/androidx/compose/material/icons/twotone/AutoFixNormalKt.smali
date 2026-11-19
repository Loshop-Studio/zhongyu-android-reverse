.class public final Landroidx/compose/material/icons/twotone/AutoFixNormalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixNormal(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AutoFixNormalKt;->_autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AutoFixNormal"

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
    const v4, 0x408d47ae    # 4.415f

    .line 71
    .line 72
    .line 73
    const v6, 0x41915604    # 18.167f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f1a8f5c    # -7.17f

    .line 80
    .line 81
    .line 82
    const v6, 0x40e570a4    # 7.17f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x3fb4fdf4    # 1.414f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3f1a8f5c    # -7.17f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/16 v16, 0x3800

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const v6, 0x3e99999a    # 0.3f

    .line 112
    .line 113
    .line 114
    const v8, 0x3e99999a    # 0.3f

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x41a00000    # 20.0f

    .line 158
    .line 159
    const/high16 v6, 0x40e00000    # 7.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x3f70a3d7    # 0.94f

    .line 165
    .line 166
    .line 167
    const v6, -0x3ffc28f6    # -2.06f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x4003d70a    # 2.06f

    .line 174
    .line 175
    .line 176
    const v6, -0x408f5c29    # -0.94f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x408f5c29    # -0.94f

    .line 183
    .line 184
    .line 185
    const v6, -0x3ffc28f6    # -2.06f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x4003d70a    # 2.06f

    .line 195
    .line 196
    .line 197
    const v6, -0x408f5c29    # -0.94f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x3f70a3d7    # 0.94f

    .line 204
    .line 205
    .line 206
    const v6, -0x3ffc28f6    # -2.06f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x4003d70a    # 2.06f

    .line 213
    .line 214
    .line 215
    const v6, 0x3f70a3d7    # 0.94f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const/high16 v6, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v8, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const-string v4, ""

    .line 234
    .line 235
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 236
    .line 237
    .line 238
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 245
    .line 246
    .line 247
    move-result-wide v6

    .line 248
    const/4 v0, 0x0

    .line 249
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const v0, 0x418dae14    # 17.71f

    .line 266
    .line 267
    .line 268
    const v2, 0x4111eb85    # 9.12f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x3fcae148    # -2.83f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x4162b852    # 14.17f

    .line 281
    .line 282
    .line 283
    const/high16 v18, 0x40c00000    # 6.0f

    .line 284
    .line 285
    const v13, 0x416ae148    # 14.68f

    .line 286
    .line 287
    .line 288
    const v14, 0x40c33333    # 6.1f

    .line 289
    .line 290
    .line 291
    const v15, 0x4166e148    # 14.43f

    .line 292
    .line 293
    .line 294
    const/high16 v16, 0x40c00000    # 6.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x40ca3d71    # -0.71f

    .line 300
    .line 301
    .line 302
    const v18, 0x3e947ae1    # 0.29f

    .line 303
    .line 304
    .line 305
    const v13, -0x417ae148    # -0.26f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, -0x40fd70a4    # -0.51f

    .line 310
    .line 311
    .line 312
    const v16, 0x3dcccccd    # 0.1f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40128f5c    # 2.29f

    .line 319
    .line 320
    .line 321
    const v2, 0x418bae14    # 17.46f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/16 v17, 0x0

    .line 328
    .line 329
    const v18, 0x3fb47ae1    # 1.41f

    .line 330
    .line 331
    .line 332
    const v13, -0x413851ec    # -0.39f

    .line 333
    .line 334
    .line 335
    const v14, 0x3ec7ae14    # 0.39f

    .line 336
    .line 337
    .line 338
    const v15, -0x413851ec    # -0.39f

    .line 339
    .line 340
    .line 341
    const v16, 0x3f828f5c    # 1.02f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x40351eb8    # 2.83f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x40ba8f5c    # 5.83f

    .line 354
    .line 355
    .line 356
    const/high16 v18, 0x41b00000    # 22.0f

    .line 357
    .line 358
    const v13, 0x40aa3d71    # 5.32f

    .line 359
    .line 360
    .line 361
    const v14, 0x41af3333    # 21.9f

    .line 362
    .line 363
    .line 364
    const v15, 0x40b23d71    # 5.57f

    .line 365
    .line 366
    .line 367
    const/high16 v16, 0x41b00000    # 22.0f

    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3f35c28f    # 0.71f

    .line 373
    .line 374
    .line 375
    const v2, -0x416b851f    # -0.29f

    .line 376
    .line 377
    .line 378
    const v4, 0x3f028f5c    # 0.51f

    .line 379
    .line 380
    .line 381
    const v6, -0x42333333    # -0.1f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x4132b852    # 11.17f

    .line 388
    .line 389
    .line 390
    const v2, -0x3ecd47ae    # -11.17f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x418dae14    # 17.71f

    .line 397
    .line 398
    .line 399
    const v18, 0x4111eb85    # 9.12f

    .line 400
    .line 401
    .line 402
    const v13, 0x4190cccd    # 18.1f

    .line 403
    .line 404
    .line 405
    const v14, 0x41226666    # 10.15f

    .line 406
    .line 407
    .line 408
    const v15, 0x4190cccd    # 18.1f

    .line 409
    .line 410
    .line 411
    const v16, 0x411828f6    # 9.51f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x419cb852    # 19.59f

    .line 421
    .line 422
    .line 423
    const v2, 0x40ba8f5c    # 5.83f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x404b851f    # -1.41f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x413970a4    # 11.59f

    .line 436
    .line 437
    .line 438
    const/high16 v2, 0x41300000    # 11.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x41468f5c    # 12.41f

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x41500000    # 13.0f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x419cb852    # 19.59f

    .line 452
    .line 453
    .line 454
    const v2, 0x40ba8f5c    # 5.83f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x41668f5c    # 14.41f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x41300000    # 11.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x411970a4    # 9.59f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x41500000    # 13.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x3f95c28f    # 1.17f

    .line 480
    .line 481
    .line 482
    const v2, -0x406a3d71    # -1.17f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x3fb47ae1    # 1.41f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x41668f5c    # 14.41f

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x41300000    # 11.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/16 v16, 0x3800

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/high16 v6, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    const/high16 v12, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/4 v14, 0x0

    .line 520
    const/4 v15, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sput-object v0, Landroidx/compose/material/icons/twotone/AutoFixNormalKt;->_autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    return-object v0
.end method
