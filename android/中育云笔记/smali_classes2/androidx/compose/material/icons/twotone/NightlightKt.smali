.class public final Landroidx/compose/material/icons/twotone/NightlightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightlight(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Nightlight"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41000000    # 8.0f

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
    const v23, 0x4065c28f    # 3.59f

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
    const v25, 0x3f8147ae    # 1.01f

    .line 97
    .line 98
    .line 99
    const v26, 0x3d8f5c29    # 0.07f

    .line 100
    .line 101
    .line 102
    const v21, 0x3eae147b    # 0.34f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const v23, 0x3f2e147b    # 0.68f

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
    const v21, 0x4151999a    # 13.1f

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
    const v4, 0x4040a3d7    # 3.01f

    .line 135
    .line 136
    .line 137
    const v6, 0x40fdc28f    # 7.93f

    .line 138
    .line 139
    .line 140
    const v7, 0x3f8ccccd    # 1.1f

    .line 141
    .line 142
    .line 143
    const v8, 0x40b8a3d7    # 5.77f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, 0x41600000    # 14.0f

    .line 150
    .line 151
    const/high16 v26, 0x41a00000    # 20.0f

    .line 152
    .line 153
    const v21, 0x416ae148    # 14.68f

    .line 154
    .line 155
    .line 156
    const v22, 0x419fd70a    # 19.98f

    .line 157
    .line 158
    .line 159
    const v23, 0x416570a4    # 14.34f

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
    const/high16 v25, 0x40c00000    # 6.0f

    .line 168
    .line 169
    const/high16 v26, 0x41400000    # 12.0f

    .line 170
    .line 171
    const v21, 0x411970a4    # 9.59f

    .line 172
    .line 173
    .line 174
    const/high16 v22, 0x41a00000    # 20.0f

    .line 175
    .line 176
    const/high16 v23, 0x40c00000    # 6.0f

    .line 177
    .line 178
    const v24, 0x418347ae    # 16.41f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const/16 v16, 0x3800

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const v6, 0x3e99999a    # 0.3f

    .line 196
    .line 197
    .line 198
    const v8, 0x3e99999a    # 0.3f

    .line 199
    .line 200
    .line 201
    const/4 v7, 0x0

    .line 202
    const/high16 v9, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/high16 v12, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const-string v4, ""

    .line 210
    .line 211
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 219
    .line 220
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x41600000    # 14.0f

    .line 242
    .line 243
    const/high16 v2, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x40a00000    # 5.0f

    .line 249
    .line 250
    const v18, -0x3ef5999a    # -8.65f

    .line 251
    .line 252
    .line 253
    const v14, -0x3f933333    # -3.7f

    .line 254
    .line 255
    .line 256
    const v15, 0x4000a3d7    # 2.01f

    .line 257
    .line 258
    .line 259
    const v16, -0x3f228f5c    # -6.92f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x41600000    # 14.0f

    .line 266
    .line 267
    const/high16 v18, 0x40000000    # 2.0f

    .line 268
    .line 269
    const v13, 0x418c3d71    # 17.53f

    .line 270
    .line 271
    .line 272
    const/high16 v14, 0x40200000    # 2.5f

    .line 273
    .line 274
    const v15, 0x417d1eb8    # 15.82f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x40800000    # 4.0f

    .line 283
    .line 284
    const/high16 v18, 0x41400000    # 12.0f

    .line 285
    .line 286
    const v13, 0x4107ae14    # 8.48f

    .line 287
    .line 288
    .line 289
    const/high16 v14, 0x40000000    # 2.0f

    .line 290
    .line 291
    const/high16 v15, 0x40800000    # 4.0f

    .line 292
    .line 293
    const v16, 0x40cf5c29    # 6.48f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x408f5c29    # 4.48f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x41200000    # 10.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x40a00000    # 5.0f

    .line 308
    .line 309
    const v18, -0x40533333    # -1.35f

    .line 310
    .line 311
    .line 312
    const v13, 0x3fe8f5c3    # 1.82f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const v15, 0x4061eb85    # 3.53f

    .line 317
    .line 318
    .line 319
    const/high16 v16, -0x41000000    # -0.5f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x41600000    # 14.0f

    .line 325
    .line 326
    const/high16 v18, 0x41400000    # 12.0f

    .line 327
    .line 328
    const v13, 0x4180147b    # 16.01f

    .line 329
    .line 330
    .line 331
    const v14, 0x41975c29    # 18.92f

    .line 332
    .line 333
    .line 334
    const/high16 v15, 0x41600000    # 14.0f

    .line 335
    .line 336
    const v16, 0x417b3333    # 15.7f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x419f70a4    # 19.93f

    .line 346
    .line 347
    .line 348
    const v2, 0x417028f6    # 15.01f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v18, 0x41a00000    # 20.0f

    .line 355
    .line 356
    const v13, 0x416ae148    # 14.68f

    .line 357
    .line 358
    .line 359
    const v14, 0x419fd70a    # 19.98f

    .line 360
    .line 361
    .line 362
    const v15, 0x416570a4    # 14.34f

    .line 363
    .line 364
    .line 365
    const/high16 v16, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x3f000000    # -8.0f

    .line 371
    .line 372
    const/high16 v18, -0x3f000000    # -8.0f

    .line 373
    .line 374
    const v13, -0x3f72e148    # -4.41f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, -0x3f000000    # -8.0f

    .line 379
    .line 380
    const v16, -0x3f9a3d71    # -3.59f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x4065c28f    # 3.59f

    .line 387
    .line 388
    .line 389
    const/high16 v2, 0x41000000    # 8.0f

    .line 390
    .line 391
    const/high16 v4, -0x3f000000    # -8.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3f8147ae    # 1.01f

    .line 397
    .line 398
    .line 399
    const v18, 0x3d8f5c29    # 0.07f

    .line 400
    .line 401
    .line 402
    const v13, 0x3eae147b    # 0.34f

    .line 403
    .line 404
    .line 405
    const v15, 0x3f2e147b    # 0.68f

    .line 406
    .line 407
    .line 408
    const v16, 0x3ca3d70a    # 0.02f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41400000    # 12.0f

    .line 415
    .line 416
    const/high16 v18, 0x41400000    # 12.0f

    .line 417
    .line 418
    const v13, 0x4151999a    # 13.1f

    .line 419
    .line 420
    .line 421
    const v14, 0x40c75c29    # 6.23f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x41400000    # 12.0f

    .line 425
    .line 426
    const v16, 0x4110cccd    # 9.05f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x4151999a    # 13.1f

    .line 433
    .line 434
    .line 435
    const v2, 0x418e28f6    # 17.77f

    .line 436
    .line 437
    .line 438
    const v4, 0x419f70a4    # 19.93f

    .line 439
    .line 440
    .line 441
    const v6, 0x417028f6    # 15.01f

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/16 v16, 0x3800

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/high16 v6, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v8, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v7, 0x0

    .line 463
    const/high16 v12, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const-string v4, ""

    .line 469
    .line 470
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    sput-object v0, Landroidx/compose/material/icons/twotone/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 479
    .line 480
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v0
.end method
