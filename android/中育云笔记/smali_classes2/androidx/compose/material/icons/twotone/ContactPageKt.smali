.class public final Landroidx/compose/material/icons/twotone/ContactPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactPage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactPage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ContactPageKt;->_contactPage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ContactPage"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const v6, 0x4152b852    # 13.17f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x410d47ae    # 8.83f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x41900000    # 18.0f

    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, 0x41a00000    # 20.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x40c00000    # 6.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x4152b852    # 13.17f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41400000    # 12.0f

    .line 108
    .line 109
    const/high16 v6, 0x41600000    # 14.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x40000000    # 2.0f

    .line 115
    .line 116
    const/high16 v26, -0x40000000    # -2.0f

    .line 117
    .line 118
    const v21, 0x3f8ccccd    # 1.1f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/high16 v23, 0x40000000    # 2.0f

    .line 124
    .line 125
    const v24, -0x4099999a    # -0.9f

    .line 126
    .line 127
    .line 128
    move-object/from16 v20, v2

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, -0x40000000    # -2.0f

    .line 134
    .line 135
    const/16 v21, 0x0

    .line 136
    .line 137
    const v22, -0x40733333    # -1.1f

    .line 138
    .line 139
    .line 140
    const v23, -0x4099999a    # -0.9f

    .line 141
    .line 142
    .line 143
    const/high16 v24, -0x40000000    # -2.0f

    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x3f666666    # 0.9f

    .line 149
    .line 150
    .line 151
    const/high16 v6, -0x40000000    # -2.0f

    .line 152
    .line 153
    const/high16 v7, 0x40000000    # 2.0f

    .line 154
    .line 155
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x41400000    # 12.0f

    .line 159
    .line 160
    const/high16 v26, 0x41600000    # 14.0f

    .line 161
    .line 162
    const/high16 v21, 0x41200000    # 10.0f

    .line 163
    .line 164
    const v22, 0x4151999a    # 13.1f

    .line 165
    .line 166
    .line 167
    const v23, 0x412e6666    # 10.9f

    .line 168
    .line 169
    .line 170
    const/high16 v24, 0x41600000    # 14.0f

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41800000    # 16.0f

    .line 179
    .line 180
    const v6, 0x418b70a4    # 17.43f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v25, -0x4063d70a    # -1.22f

    .line 187
    .line 188
    .line 189
    const v26, -0x40133333    # -1.85f

    .line 190
    .line 191
    .line 192
    const/16 v21, 0x0

    .line 193
    .line 194
    const v22, -0x40b0a3d7    # -0.81f

    .line 195
    .line 196
    .line 197
    const v23, -0x410a3d71    # -0.48f

    .line 198
    .line 199
    .line 200
    const v24, -0x403c28f6    # -1.53f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x41400000    # 12.0f

    .line 207
    .line 208
    const/high16 v26, 0x41700000    # 15.0f

    .line 209
    .line 210
    const v21, 0x415ee148    # 13.93f

    .line 211
    .line 212
    .line 213
    const v22, 0x41735c29    # 15.21f

    .line 214
    .line 215
    .line 216
    const v23, 0x414fd70a    # 12.99f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x41700000    # 15.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, -0x3fce147b    # -2.78f

    .line 225
    .line 226
    .line 227
    const v26, 0x3f147ae1    # 0.58f

    .line 228
    .line 229
    .line 230
    const v21, -0x40828f5c    # -0.99f

    .line 231
    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const v23, -0x4008f5c3    # -1.93f

    .line 236
    .line 237
    .line 238
    const v24, 0x3e570a3d    # 0.21f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v25, 0x41000000    # 8.0f

    .line 245
    .line 246
    const v26, 0x418b70a4    # 17.43f

    .line 247
    .line 248
    .line 249
    const v21, 0x4107ae14    # 8.48f

    .line 250
    .line 251
    .line 252
    const v22, 0x417e6666    # 15.9f

    .line 253
    .line 254
    .line 255
    const/high16 v23, 0x41000000    # 8.0f

    .line 256
    .line 257
    const v24, 0x4184f5c3    # 16.62f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41900000    # 18.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x41000000    # 8.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x418b70a4    # 17.43f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/16 v16, 0x3800

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const v6, 0x3e99999a    # 0.3f

    .line 291
    .line 292
    .line 293
    const v8, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const/high16 v9, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v12, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    const-string v4, ""

    .line 305
    .line 306
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 307
    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 316
    .line 317
    .line 318
    move-result-wide v6

    .line 319
    const/4 v0, 0x0

    .line 320
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x40800000    # 4.0f

    .line 337
    .line 338
    const v2, 0x4152b852    # 13.17f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x410d47ae    # 8.83f

    .line 345
    .line 346
    .line 347
    const/high16 v2, 0x41900000    # 18.0f

    .line 348
    .line 349
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41a00000    # 20.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x40c00000    # 6.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x40800000    # 4.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x4152b852    # 13.17f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40000000    # 2.0f

    .line 374
    .line 375
    const/high16 v2, 0x41600000    # 14.0f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40c00000    # 6.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x40800000    # 4.0f

    .line 386
    .line 387
    const/high16 v18, 0x40800000    # 4.0f

    .line 388
    .line 389
    const v13, 0x409ccccd    # 4.9f

    .line 390
    .line 391
    .line 392
    const/high16 v14, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v15, 0x40800000    # 4.0f

    .line 395
    .line 396
    const v16, 0x4039999a    # 2.9f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41800000    # 16.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x40000000    # 2.0f

    .line 408
    .line 409
    const/high16 v18, 0x40000000    # 2.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, 0x3f8ccccd    # 1.1f

    .line 413
    .line 414
    .line 415
    const v15, 0x3f666666    # 0.9f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x40000000    # 2.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41400000    # 12.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v18, -0x40000000    # -2.0f

    .line 429
    .line 430
    const v13, 0x3f8ccccd    # 1.1f

    .line 431
    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const/high16 v15, 0x40000000    # 2.0f

    .line 435
    .line 436
    const v16, -0x4099999a    # -0.9f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41000000    # 8.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41400000    # 12.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, -0x40000000    # -2.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const v14, -0x40733333    # -1.1f

    .line 470
    .line 471
    .line 472
    const v15, -0x4099999a    # -0.9f

    .line 473
    .line 474
    .line 475
    const/high16 v16, -0x40000000    # -2.0f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x3f666666    # 0.9f

    .line 481
    .line 482
    .line 483
    const/high16 v2, -0x40000000    # -2.0f

    .line 484
    .line 485
    const/high16 v4, 0x40000000    # 2.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x41400000    # 12.0f

    .line 491
    .line 492
    const/high16 v18, 0x41600000    # 14.0f

    .line 493
    .line 494
    const/high16 v13, 0x41200000    # 10.0f

    .line 495
    .line 496
    const v14, 0x4151999a    # 13.1f

    .line 497
    .line 498
    .line 499
    const v15, 0x412e6666    # 10.9f

    .line 500
    .line 501
    .line 502
    const/high16 v16, 0x41600000    # 14.0f

    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41800000    # 16.0f

    .line 511
    .line 512
    const v2, 0x418b70a4    # 17.43f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, -0x4063d70a    # -1.22f

    .line 519
    .line 520
    .line 521
    const v18, -0x40133333    # -1.85f

    .line 522
    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const v14, -0x40b0a3d7    # -0.81f

    .line 526
    .line 527
    .line 528
    const v15, -0x410a3d71    # -0.48f

    .line 529
    .line 530
    .line 531
    const v16, -0x403c28f6    # -1.53f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x41400000    # 12.0f

    .line 538
    .line 539
    const/high16 v18, 0x41700000    # 15.0f

    .line 540
    .line 541
    const v13, 0x415ee148    # 13.93f

    .line 542
    .line 543
    .line 544
    const v14, 0x41735c29    # 15.21f

    .line 545
    .line 546
    .line 547
    const v15, 0x414fd70a    # 12.99f

    .line 548
    .line 549
    .line 550
    const/high16 v16, 0x41700000    # 15.0f

    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, -0x3fce147b    # -2.78f

    .line 556
    .line 557
    .line 558
    const v18, 0x3f147ae1    # 0.58f

    .line 559
    .line 560
    .line 561
    const v13, -0x40828f5c    # -0.99f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const v15, -0x4008f5c3    # -1.93f

    .line 566
    .line 567
    .line 568
    const v16, 0x3e570a3d    # 0.21f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, 0x41000000    # 8.0f

    .line 575
    .line 576
    const v18, 0x418b70a4    # 17.43f

    .line 577
    .line 578
    .line 579
    const v13, 0x4107ae14    # 8.48f

    .line 580
    .line 581
    .line 582
    const v14, 0x417e6666    # 15.9f

    .line 583
    .line 584
    .line 585
    const/high16 v15, 0x41000000    # 8.0f

    .line 586
    .line 587
    const v16, 0x4184f5c3    # 16.62f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41900000    # 18.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x41000000    # 8.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x418b70a4    # 17.43f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/16 v16, 0x3800

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const/high16 v6, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v8, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    const/high16 v12, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const/4 v14, 0x0

    .line 629
    const/4 v15, 0x0

    .line 630
    const-string v4, ""

    .line 631
    .line 632
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    sput-object v0, Landroidx/compose/material/icons/twotone/ContactPageKt;->_contactPage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v0
.end method
