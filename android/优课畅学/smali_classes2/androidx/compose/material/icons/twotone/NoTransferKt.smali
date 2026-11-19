.class public final Landroidx/compose/material/icons/twotone/NoTransferKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoTransfer(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoTransfer"

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
    const v4, 0x416d47ae    # 14.83f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41900000    # 18.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x404ae148    # 3.17f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x416d47ae    # 14.83f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x4112b852    # 9.17f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x40a00000    # 5.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x40d428f6    # 6.63f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x416b851f    # -0.29f

    .line 116
    .line 117
    .line 118
    const v6, -0x4175c28f    # -0.27f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x40c00000    # 6.0f

    .line 125
    .line 126
    const/high16 v26, 0x41800000    # 16.0f

    .line 127
    .line 128
    const v21, 0x40c6b852    # 6.21f

    .line 129
    .line 130
    .line 131
    const v22, 0x4184f5c3    # 16.62f

    .line 132
    .line 133
    .line 134
    const/high16 v23, 0x40c00000    # 6.0f

    .line 135
    .line 136
    const v24, 0x4182f5c3    # 16.37f

    .line 137
    .line 138
    .line 139
    move-object/from16 v20, v2

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, -0x3f800000    # -4.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x4112b852    # 9.17f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41680000    # 14.5f

    .line 159
    .line 160
    const/high16 v6, 0x41200000    # 10.0f

    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, -0x40400000    # -1.5f

    .line 166
    .line 167
    const/high16 v26, -0x40400000    # -1.5f

    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    const v22, -0x40ab851f    # -0.83f

    .line 172
    .line 173
    .line 174
    const v23, -0x40d47ae1    # -0.67f

    .line 175
    .line 176
    .line 177
    const/high16 v24, -0x40400000    # -1.5f

    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x415ab852    # 13.67f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x40e00000    # 7.0f

    .line 186
    .line 187
    const/high16 v7, 0x41680000    # 14.5f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, 0x41080000    # 8.5f

    .line 193
    .line 194
    const/high16 v26, 0x41800000    # 16.0f

    .line 195
    .line 196
    const/high16 v21, 0x40e00000    # 7.0f

    .line 197
    .line 198
    const v22, 0x417547ae    # 15.33f

    .line 199
    .line 200
    .line 201
    const v23, 0x40f570a4    # 7.67f

    .line 202
    .line 203
    .line 204
    const/high16 v24, 0x41800000    # 16.0f

    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x417547ae    # 15.33f

    .line 210
    .line 211
    .line 212
    const/high16 v6, 0x41680000    # 14.5f

    .line 213
    .line 214
    const/high16 v7, 0x41200000    # 10.0f

    .line 215
    .line 216
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x409fae14    # 4.99f

    .line 223
    .line 224
    .line 225
    const v6, 0x40fa3d71    # 7.82f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, 0x411d47ae    # 9.83f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v25, 0x41400000    # 12.0f

    .line 238
    .line 239
    const/high16 v26, 0x40800000    # 4.0f

    .line 240
    .line 241
    const v21, 0x4188e148    # 17.11f

    .line 242
    .line 243
    .line 244
    const v22, 0x408eb852    # 4.46f

    .line 245
    .line 246
    .line 247
    const v23, 0x417b0a3d    # 15.69f

    .line 248
    .line 249
    .line 250
    const/high16 v24, 0x40800000    # 4.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, 0x40e9eb85    # 7.31f

    .line 256
    .line 257
    .line 258
    const v26, 0x408f5c29    # 4.48f

    .line 259
    .line 260
    .line 261
    const v21, 0x4119999a    # 9.6f

    .line 262
    .line 263
    .line 264
    const/high16 v22, 0x40800000    # 4.0f

    .line 265
    .line 266
    const v23, 0x4102b852    # 8.17f

    .line 267
    .line 268
    .line 269
    const v24, 0x40866666    # 4.2f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, 0x409fae14    # 4.99f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/16 v16, 0x3800

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const v6, 0x3e99999a    # 0.3f

    .line 293
    .line 294
    .line 295
    const v8, 0x3e99999a    # 0.3f

    .line 296
    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    const/high16 v9, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/high16 v12, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x41500000    # 13.0f

    .line 339
    .line 340
    const/high16 v2, 0x41080000    # 8.5f

    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 346
    .line 347
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 348
    .line 349
    const v13, 0x3f547ae1    # 0.83f

    .line 350
    .line 351
    .line 352
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 353
    .line 354
    const v16, 0x3f2b851f    # 0.67f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x411547ae    # 9.33f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x41800000    # 16.0f

    .line 364
    .line 365
    const/high16 v4, 0x41080000    # 8.5f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x417547ae    # 15.33f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x40e00000    # 7.0f

    .line 374
    .line 375
    const/high16 v4, 0x41680000    # 14.5f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40f570a4    # 7.67f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x41500000    # 13.0f

    .line 384
    .line 385
    const/high16 v4, 0x41080000    # 8.5f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x408f5c29    # 4.48f

    .line 394
    .line 395
    .line 396
    const v2, 0x40e9eb85    # 7.31f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x41400000    # 12.0f

    .line 403
    .line 404
    const/high16 v18, 0x40800000    # 4.0f

    .line 405
    .line 406
    const v13, 0x4102b852    # 8.17f

    .line 407
    .line 408
    .line 409
    const v14, 0x40866666    # 4.2f

    .line 410
    .line 411
    .line 412
    const v15, 0x4119999a    # 9.6f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x40800000    # 4.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x40b51eb8    # 5.66f

    .line 421
    .line 422
    .line 423
    const v18, 0x3f7d70a4    # 0.99f

    .line 424
    .line 425
    .line 426
    const v13, 0x406c28f6    # 3.69f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const v15, 0x40a3851f    # 5.11f

    .line 431
    .line 432
    .line 433
    const v16, 0x3eeb851f    # 0.46f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40fa3d71    # 7.82f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40000000    # 2.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41900000    # 18.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x41200000    # 10.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, -0x3f5a8f5c    # -5.17f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40000000    # 2.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41900000    # 18.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x404ae148    # 3.17f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3fe7ae14    # 1.81f

    .line 483
    .line 484
    .line 485
    const v2, 0x3fe7ae14    # 1.81f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, 0x41a00000    # 20.0f

    .line 492
    .line 493
    const/high16 v18, 0x41800000    # 16.0f

    .line 494
    .line 495
    const v13, 0x419f5c29    # 19.92f

    .line 496
    .line 497
    .line 498
    const v14, 0x41855c29    # 16.67f

    .line 499
    .line 500
    .line 501
    const/high16 v15, 0x41a00000    # 20.0f

    .line 502
    .line 503
    const v16, 0x4182cccd    # 16.35f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x40c00000    # 6.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, -0x3f000000    # -8.0f

    .line 515
    .line 516
    const/high16 v18, -0x3f800000    # -4.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/high16 v14, -0x3fa00000    # -3.5f

    .line 520
    .line 521
    const v15, -0x3f9ae148    # -3.58f

    .line 522
    .line 523
    .line 524
    const/high16 v16, -0x3f800000    # -4.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x40b8f5c3    # 5.78f

    .line 530
    .line 531
    .line 532
    const v18, 0x403ccccd    # 2.95f

    .line 533
    .line 534
    .line 535
    const v13, 0x4117ae14    # 9.48f

    .line 536
    .line 537
    .line 538
    const/high16 v14, 0x40000000    # 2.0f

    .line 539
    .line 540
    const v15, 0x40e7ae14    # 7.24f

    .line 541
    .line 542
    .line 543
    const v16, 0x400a3d71    # 2.16f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x408f5c29    # 4.48f

    .line 550
    .line 551
    .line 552
    const v2, 0x40e9eb85    # 7.31f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x419e3d71    # 19.78f

    .line 562
    .line 563
    .line 564
    const v2, 0x41b4e148    # 22.61f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x402e147b    # -1.64f

    .line 571
    .line 572
    .line 573
    const v2, -0x402e147b    # -1.64f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x41900000    # 18.0f

    .line 580
    .line 581
    const/high16 v18, 0x41a80000    # 21.0f

    .line 582
    .line 583
    const v13, 0x4190b852    # 18.09f

    .line 584
    .line 585
    .line 586
    const v14, 0x41a7d70a    # 20.98f

    .line 587
    .line 588
    .line 589
    const v15, 0x41906666    # 18.05f

    .line 590
    .line 591
    .line 592
    const/high16 v16, 0x41a80000    # 21.0f

    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, -0x40800000    # -1.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, -0x40800000    # -1.0f

    .line 603
    .line 604
    const/high16 v18, -0x40800000    # -1.0f

    .line 605
    .line 606
    const v13, -0x40f33333    # -0.55f

    .line 607
    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    const/high16 v15, -0x40800000    # -1.0f

    .line 611
    .line 612
    const v16, -0x4119999a    # -0.45f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x41000000    # 8.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x3f800000    # 1.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v18, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v13, 0x0

    .line 634
    const v14, 0x3f0ccccd    # 0.55f

    .line 635
    .line 636
    .line 637
    const v15, -0x4119999a    # -0.45f

    .line 638
    .line 639
    .line 640
    const/high16 v16, 0x3f800000    # 1.0f

    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, 0x40c00000    # 6.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v18, -0x40800000    # -1.0f

    .line 651
    .line 652
    const v13, -0x40f33333    # -0.55f

    .line 653
    .line 654
    .line 655
    const/4 v14, 0x0

    .line 656
    const/high16 v15, -0x40800000    # -1.0f

    .line 657
    .line 658
    const v16, -0x4119999a    # -0.45f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, -0x401c28f6    # -1.78f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, 0x40800000    # 4.0f

    .line 671
    .line 672
    const/high16 v18, 0x41800000    # 16.0f

    .line 673
    .line 674
    const v13, 0x408c7ae1    # 4.39f

    .line 675
    .line 676
    .line 677
    const v14, 0x418d5c29    # 17.67f

    .line 678
    .line 679
    .line 680
    const/high16 v15, 0x40800000    # 4.0f

    .line 681
    .line 682
    const v16, 0x41870a3d    # 16.88f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x40da8f5c    # 6.83f

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x3fb1eb85    # 1.39f

    .line 695
    .line 696
    .line 697
    const v2, 0x40870a3d    # 4.22f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x3fb47ae1    # 1.41f

    .line 704
    .line 705
    .line 706
    const v2, -0x404b851f    # -1.41f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x41930a3d    # 18.38f

    .line 713
    .line 714
    .line 715
    const v2, 0x41930a3d    # 18.38f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x419e3d71    # 19.78f

    .line 722
    .line 723
    .line 724
    const v2, 0x41b4e148    # 22.61f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x410d47ae    # 8.83f

    .line 734
    .line 735
    .line 736
    const/high16 v2, 0x40c00000    # 6.0f

    .line 737
    .line 738
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x41200000    # 10.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x3f95c28f    # 1.17f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x410d47ae    # 8.83f

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x4162b852    # 14.17f

    .line 762
    .line 763
    .line 764
    const/high16 v2, 0x41880000    # 17.0f

    .line 765
    .line 766
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v0, -0x3f600000    # -5.0f

    .line 770
    .line 771
    const/high16 v2, -0x3f600000    # -5.0f

    .line 772
    .line 773
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v0, 0x40c00000    # 6.0f

    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v0, 0x40800000    # 4.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v17, 0x3eae147b    # 0.34f

    .line 787
    .line 788
    .line 789
    const v18, 0x3f3ae148    # 0.73f

    .line 790
    .line 791
    .line 792
    const/4 v13, 0x0

    .line 793
    const v14, 0x3ebd70a4    # 0.37f

    .line 794
    .line 795
    .line 796
    const v15, 0x3e570a3d    # 0.21f

    .line 797
    .line 798
    .line 799
    const v16, 0x3f1eb852    # 0.62f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v0, 0x41880000    # 17.0f

    .line 806
    .line 807
    const v2, 0x40d428f6    # 6.63f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v0, 0x41000000    # 8.0f

    .line 814
    .line 815
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x4162b852    # 14.17f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    const/16 v16, 0x3800

    .line 832
    .line 833
    const/16 v17, 0x0

    .line 834
    .line 835
    const/high16 v6, 0x3f800000    # 1.0f

    .line 836
    .line 837
    const/high16 v8, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v7, 0x0

    .line 840
    const/high16 v12, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/4 v14, 0x0

    .line 843
    const/4 v15, 0x0

    .line 844
    const-string v4, ""

    .line 845
    .line 846
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    sput-object v0, Landroidx/compose/material/icons/twotone/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 855
    .line 856
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    return-object v0
.end method
