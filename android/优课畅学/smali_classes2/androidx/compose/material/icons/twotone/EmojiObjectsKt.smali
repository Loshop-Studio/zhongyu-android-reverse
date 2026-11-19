.class public final Landroidx/compose/material/icons/twotone/EmojiObjectsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emojiObjects:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmojiObjects(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EmojiObjectsKt;->_emojiObjects:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EmojiObjects"

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
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3f800000    # -4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const v6, 0x3e99999a    # 0.3f

    .line 104
    .line 105
    .line 106
    const v8, 0x3e99999a    # 0.3f

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    const/high16 v9, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/high16 v12, 0x3f800000    # 1.0f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const-string v4, ""

    .line 118
    .line 119
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41800000    # 16.0f

    .line 150
    .line 151
    const/high16 v6, 0x41200000    # 10.0f

    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40800000    # 4.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, -0x3f800000    # -4.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const v6, 0x3e99999a    # 0.3f

    .line 179
    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const-string v4, ""

    .line 183
    .line 184
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x41400000    # 12.0f

    .line 215
    .line 216
    const/high16 v6, 0x40400000    # 3.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x404ccccd    # -1.4f

    .line 222
    .line 223
    .line 224
    const v26, 0x3e0f5c29    # 0.14f

    .line 225
    .line 226
    .line 227
    const v21, -0x41147ae1    # -0.46f

    .line 228
    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    const v23, -0x4091eb85    # -0.93f

    .line 233
    .line 234
    .line 235
    const v24, 0x3d23d70a    # 0.04f

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x40a3d70a    # 5.12f

    .line 244
    .line 245
    .line 246
    const v26, 0x410a8f5c    # 8.66f

    .line 247
    .line 248
    .line 249
    const v21, 0x40fae148    # 7.84f

    .line 250
    .line 251
    .line 252
    const v22, 0x406ae148    # 3.67f

    .line 253
    .line 254
    .line 255
    const v23, 0x40b47ae1    # 5.64f

    .line 256
    .line 257
    .line 258
    const v24, 0x40bccccd    # 5.9f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v25, 0x400e147b    # 2.22f

    .line 265
    .line 266
    .line 267
    const v26, 0x40d1eb85    # 6.56f

    .line 268
    .line 269
    .line 270
    const v21, -0x410a3d71    # -0.48f

    .line 271
    .line 272
    .line 273
    const v22, 0x40270a3d    # 2.61f

    .line 274
    .line 275
    .line 276
    const v23, 0x3ef5c28f    # 0.48f

    .line 277
    .line 278
    .line 279
    const v24, 0x40a051ec    # 5.01f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, 0x41000000    # 8.0f

    .line 286
    .line 287
    const v26, 0x4185851f    # 16.69f

    .line 288
    .line 289
    .line 290
    const v21, 0x40f8a3d7    # 7.77f

    .line 291
    .line 292
    .line 293
    const v22, 0x4179999a    # 15.6f

    .line 294
    .line 295
    .line 296
    const/high16 v23, 0x41000000    # 8.0f

    .line 297
    .line 298
    const v24, 0x41810a3d    # 16.13f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x41980000    # 19.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x40000000    # 2.0f

    .line 310
    .line 311
    const/high16 v26, 0x40000000    # 2.0f

    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const v22, 0x3f8ccccd    # 1.1f

    .line 316
    .line 317
    .line 318
    const v23, 0x3f666666    # 0.9f

    .line 319
    .line 320
    .line 321
    const/high16 v24, 0x40000000    # 2.0f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v4, 0x3e8f5c29    # 0.28f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v25, 0x3fdc28f6    # 1.72f

    .line 333
    .line 334
    .line 335
    const/high16 v26, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const v21, 0x3eb33333    # 0.35f

    .line 338
    .line 339
    .line 340
    const v22, 0x3f19999a    # 0.6f

    .line 341
    .line 342
    .line 343
    const v23, 0x3f7ae148    # 0.98f

    .line 344
    .line 345
    .line 346
    const/high16 v24, 0x3f800000    # 1.0f

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, -0x41333333    # -0.4f

    .line 352
    .line 353
    .line 354
    const v6, 0x3fdc28f6    # 1.72f

    .line 355
    .line 356
    .line 357
    const/high16 v7, -0x40800000    # -1.0f

    .line 358
    .line 359
    const v8, 0x3fb0a3d7    # 1.38f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41600000    # 14.0f

    .line 366
    .line 367
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v25, 0x40000000    # 2.0f

    .line 371
    .line 372
    const/high16 v26, -0x40000000    # -2.0f

    .line 373
    .line 374
    const v21, 0x3f8ccccd    # 1.1f

    .line 375
    .line 376
    .line 377
    const/16 v22, 0x0

    .line 378
    .line 379
    const/high16 v23, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v24, -0x4099999a    # -0.9f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, -0x3fec28f6    # -2.31f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, 0x3f23d70a    # 0.64f

    .line 394
    .line 395
    .line 396
    const v26, -0x40451eb8    # -1.46f

    .line 397
    .line 398
    .line 399
    const/16 v21, 0x0

    .line 400
    .line 401
    const v22, -0x40f33333    # -0.55f

    .line 402
    .line 403
    .line 404
    const v23, 0x3e6147ae    # 0.22f

    .line 405
    .line 406
    .line 407
    const v24, -0x40747ae1    # -1.09f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x41980000    # 19.0f

    .line 414
    .line 415
    const/high16 v26, 0x41200000    # 10.0f

    .line 416
    .line 417
    const v21, 0x4190b852    # 18.09f

    .line 418
    .line 419
    .line 420
    const v22, 0x415f3333    # 13.95f

    .line 421
    .line 422
    .line 423
    const/high16 v23, 0x41980000    # 19.0f

    .line 424
    .line 425
    const v24, 0x414147ae    # 12.08f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v25, 0x41400000    # 12.0f

    .line 432
    .line 433
    const/high16 v26, 0x40400000    # 3.0f

    .line 434
    .line 435
    const/high16 v21, 0x41980000    # 19.0f

    .line 436
    .line 437
    const v22, 0x40c428f6    # 6.13f

    .line 438
    .line 439
    .line 440
    const v23, 0x417deb85    # 15.87f

    .line 441
    .line 442
    .line 443
    const/high16 v24, 0x40400000    # 3.0f

    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, 0x41600000    # 14.0f

    .line 452
    .line 453
    const/high16 v6, 0x41980000    # 19.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v4, -0x3f800000    # -4.0f

    .line 459
    .line 460
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, -0x40800000    # -1.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x41980000    # 19.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x41880000    # 17.0f

    .line 482
    .line 483
    const/high16 v6, 0x41600000    # 14.0f

    .line 484
    .line 485
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v4, -0x3f800000    # -4.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, -0x40800000    # -1.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x40800000    # 4.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, 0x41880000    # 17.0f

    .line 504
    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x4174f5c3    # 15.31f

    .line 512
    .line 513
    .line 514
    const v6, 0x415bd70a    # 13.74f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v25, -0x418a3d71    # -0.24f

    .line 521
    .line 522
    .line 523
    const v26, 0x3e851eb8    # 0.26f

    .line 524
    .line 525
    .line 526
    const v21, -0x4247ae14    # -0.09f

    .line 527
    .line 528
    .line 529
    const v22, 0x3da3d70a    # 0.08f

    .line 530
    .line 531
    .line 532
    const v23, -0x41dc28f6    # -0.16f

    .line 533
    .line 534
    .line 535
    const v24, 0x3e3851ec    # 0.18f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v4, 0x410eb852    # 8.92f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v26, -0x4175c28f    # -0.27f

    .line 548
    .line 549
    .line 550
    const v21, -0x425c28f6    # -0.08f

    .line 551
    .line 552
    .line 553
    const v22, -0x4247ae14    # -0.09f

    .line 554
    .line 555
    .line 556
    const v23, -0x41e66666    # -0.15f

    .line 557
    .line 558
    .line 559
    const v24, -0x41bd70a4    # -0.19f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v25, -0x40347ae1    # -1.59f

    .line 566
    .line 567
    .line 568
    const v26, -0x3f69999a    # -4.7f

    .line 569
    .line 570
    .line 571
    const v21, -0x40570a3d    # -1.32f

    .line 572
    .line 573
    .line 574
    const v22, -0x4068f5c3    # -1.18f

    .line 575
    .line 576
    .line 577
    const v23, -0x400b851f    # -1.91f

    .line 578
    .line 579
    .line 580
    const v24, -0x3fc3d70a    # -2.94f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v25, 0x4078f5c3    # 3.89f

    .line 587
    .line 588
    .line 589
    const v26, -0x3f847ae1    # -3.93f

    .line 590
    .line 591
    .line 592
    const v21, 0x3eb851ec    # 0.36f

    .line 593
    .line 594
    .line 595
    const v22, -0x4007ae14    # -1.94f

    .line 596
    .line 597
    .line 598
    const v23, 0x3ffae148    # 1.96f

    .line 599
    .line 600
    .line 601
    const v24, -0x3f9ccccd    # -3.55f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v25, 0x41400000    # 12.0f

    .line 608
    .line 609
    const/high16 v26, 0x40a00000    # 5.0f

    .line 610
    .line 611
    const v21, 0x41351eb8    # 11.32f

    .line 612
    .line 613
    .line 614
    const v22, 0x40a0f5c3    # 5.03f

    .line 615
    .line 616
    .line 617
    const v23, 0x413a8f5c    # 11.66f

    .line 618
    .line 619
    .line 620
    const/high16 v24, 0x40a00000    # 5.0f

    .line 621
    .line 622
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v25, 0x40a00000    # 5.0f

    .line 626
    .line 627
    const v21, 0x4030a3d7    # 2.76f

    .line 628
    .line 629
    .line 630
    const/16 v22, 0x0

    .line 631
    .line 632
    const/high16 v23, 0x40a00000    # 5.0f

    .line 633
    .line 634
    const v24, 0x400f5c29    # 2.24f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v25, 0x4174f5c3    # 15.31f

    .line 641
    .line 642
    .line 643
    const v26, 0x415bd70a    # 13.74f

    .line 644
    .line 645
    .line 646
    const/high16 v21, 0x41880000    # 17.0f

    .line 647
    .line 648
    const v22, 0x4136e148    # 11.43f

    .line 649
    .line 650
    .line 651
    const v23, 0x41831eb8    # 16.39f

    .line 652
    .line 653
    .line 654
    const v24, 0x414ca3d7    # 12.79f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/high16 v6, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v8, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 682
    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 684
    .line 685
    .line 686
    move-result-wide v6

    .line 687
    const/4 v2, 0x0

    .line 688
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 702
    .line 703
    .line 704
    const/high16 v4, 0x41380000    # 11.5f

    .line 705
    .line 706
    const/high16 v6, 0x41300000    # 11.0f

    .line 707
    .line 708
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v4, 0x3f800000    # 1.0f

    .line 712
    .line 713
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, 0x40400000    # 3.0f

    .line 717
    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v4, -0x40800000    # -1.0f

    .line 722
    .line 723
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    const/high16 v6, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v7, 0x0

    .line 736
    const-string v4, ""

    .line 737
    .line 738
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 739
    .line 740
    .line 741
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 746
    .line 747
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 748
    .line 749
    .line 750
    move-result-wide v6

    .line 751
    const/4 v2, 0x0

    .line 752
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 756
    .line 757
    .line 758
    move-result v10

    .line 759
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 760
    .line 761
    .line 762
    move-result v11

    .line 763
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 766
    .line 767
    .line 768
    const v4, 0x411ac083    # 9.672f

    .line 769
    .line 770
    .line 771
    const v6, 0x41194bc7    # 9.581f

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v4, -0x40cb020c    # -0.707f

    .line 778
    .line 779
    .line 780
    const v6, 0x3f34fdf4    # 0.707f

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v4, 0x4007be77    # 2.121f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v4, -0x40cb020c    # -0.707f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    const/high16 v6, 0x3f800000    # 1.0f

    .line 806
    .line 807
    const/4 v7, 0x0

    .line 808
    const-string v4, ""

    .line 809
    .line 810
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 811
    .line 812
    .line 813
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 818
    .line 819
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 820
    .line 821
    .line 822
    move-result-wide v6

    .line 823
    const/4 v0, 0x0

    .line 824
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 828
    .line 829
    .line 830
    move-result v10

    .line 831
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 832
    .line 833
    .line 834
    move-result v11

    .line 835
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 838
    .line 839
    .line 840
    const v2, 0x414353f8    # 12.208f

    .line 841
    .line 842
    .line 843
    const v4, 0x413b645a    # 11.712f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v2, -0x40cb020c    # -0.707f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v2, -0x3ff84189    # -2.121f

    .line 856
    .line 857
    .line 858
    const v4, 0x4007be77    # 2.121f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v2, 0x3f34fdf4    # 0.707f

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    const/high16 v6, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/4 v7, 0x0

    .line 880
    const-string v4, ""

    .line 881
    .line 882
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    sput-object v0, Landroidx/compose/material/icons/twotone/EmojiObjectsKt;->_emojiObjects:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 891
    .line 892
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    return-object v0
.end method
