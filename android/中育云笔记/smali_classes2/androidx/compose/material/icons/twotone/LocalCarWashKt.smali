.class public final Landroidx/compose/material/icons/twotone/LocalCarWashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalCarWash(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalCarWash"

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
    const v4, 0x40a3d70a    # 5.12f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x3eae147b    # 0.34f

    .line 79
    .line 80
    .line 81
    const v6, -0x420a3d71    # -0.12f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    const/high16 v6, 0x41980000    # 19.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41600000    # 14.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x3f6ae148    # -4.66f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, -0x4151eb85    # -0.34f

    .line 106
    .line 107
    .line 108
    const v6, -0x420a3d71    # -0.12f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x40a3d70a    # 5.12f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41600000    # 14.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41900000    # 18.0f

    .line 126
    .line 127
    const/high16 v6, 0x40f00000    # 7.5f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, -0x40400000    # -1.5f

    .line 133
    .line 134
    const/high16 v26, -0x40400000    # -1.5f

    .line 135
    .line 136
    const v21, -0x40ab851f    # -0.83f

    .line 137
    .line 138
    .line 139
    const/16 v22, 0x0

    .line 140
    .line 141
    const/high16 v23, -0x40400000    # -1.5f

    .line 142
    .line 143
    const v24, -0x40d47ae1    # -0.67f

    .line 144
    .line 145
    .line 146
    move-object/from16 v20, v2

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40d570a4    # 6.67f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41700000    # 15.0f

    .line 155
    .line 156
    const/high16 v7, 0x40f00000    # 7.5f

    .line 157
    .line 158
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x3f2b851f    # 0.67f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x410547ae    # 8.33f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x41900000    # 18.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x41840000    # 16.5f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x3f2b851f    # 0.67f

    .line 189
    .line 190
    .line 191
    const/high16 v6, -0x40400000    # -1.5f

    .line 192
    .line 193
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 194
    .line 195
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 199
    .line 200
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, -0x40d47ae1    # -0.67f

    .line 204
    .line 205
    .line 206
    const/high16 v6, -0x40400000    # -1.5f

    .line 207
    .line 208
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    const/16 v16, 0x3800

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const v6, 0x3e99999a    # 0.3f

    .line 223
    .line 224
    .line 225
    const v8, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const/4 v7, 0x0

    .line 229
    const/high16 v9, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v12, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    const-string v4, ""

    .line 237
    .line 238
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x41780000    # 15.5f

    .line 269
    .line 270
    const/high16 v6, 0x40600000    # 3.5f

    .line 271
    .line 272
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 276
    .line 277
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, 0x3f547ae1    # 0.83f

    .line 282
    .line 283
    .line 284
    const v23, 0x3f2b851f    # 0.67f

    .line 285
    .line 286
    .line 287
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 288
    .line 289
    move-object/from16 v20, v2

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, -0x40d47ae1    # -0.67f

    .line 295
    .line 296
    .line 297
    const/high16 v6, -0x40400000    # -1.5f

    .line 298
    .line 299
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 300
    .line 301
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v25, -0x40400000    # -1.5f

    .line 305
    .line 306
    const v26, -0x3fd33333    # -2.7f

    .line 307
    .line 308
    .line 309
    const/high16 v22, -0x40800000    # -1.0f

    .line 310
    .line 311
    const/high16 v23, -0x40400000    # -1.5f

    .line 312
    .line 313
    const v24, -0x3fd33333    # -2.7f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x402ccccd    # 2.7f

    .line 320
    .line 321
    .line 322
    const v6, 0x3fd9999a    # 1.7f

    .line 323
    .line 324
    .line 325
    const/high16 v7, -0x40400000    # -1.5f

    .line 326
    .line 327
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x41580000    # 13.5f

    .line 334
    .line 335
    const/high16 v6, 0x40600000    # 3.5f

    .line 336
    .line 337
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v4, 0x402ccccd    # 2.7f

    .line 344
    .line 345
    .line 346
    const v6, 0x3fd9999a    # 1.7f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 353
    .line 354
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 355
    .line 356
    const v22, 0x3f547ae1    # 0.83f

    .line 357
    .line 358
    .line 359
    const v23, 0x3f2b851f    # 0.67f

    .line 360
    .line 361
    .line 362
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, -0x40d47ae1    # -0.67f

    .line 368
    .line 369
    .line 370
    const/high16 v6, -0x40400000    # -1.5f

    .line 371
    .line 372
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 373
    .line 374
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41080000    # 8.5f

    .line 381
    .line 382
    const/high16 v6, 0x40600000    # 3.5f

    .line 383
    .line 384
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v25, 0x40e00000    # 7.0f

    .line 388
    .line 389
    const v26, 0x3f4ccccd    # 0.8f

    .line 390
    .line 391
    .line 392
    const/high16 v21, 0x41080000    # 8.5f

    .line 393
    .line 394
    const/high16 v22, 0x40200000    # 2.5f

    .line 395
    .line 396
    const/high16 v23, 0x40e00000    # 7.0f

    .line 397
    .line 398
    const v24, 0x3f4ccccd    # 0.8f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x40200000    # 2.5f

    .line 405
    .line 406
    const/high16 v6, 0x40b00000    # 5.5f

    .line 407
    .line 408
    const/high16 v7, 0x40600000    # 3.5f

    .line 409
    .line 410
    const/high16 v8, 0x40b00000    # 5.5f

    .line 411
    .line 412
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v26, 0x40a00000    # 5.0f

    .line 416
    .line 417
    const/high16 v21, 0x40b00000    # 5.5f

    .line 418
    .line 419
    const v22, 0x408a8f5c    # 4.33f

    .line 420
    .line 421
    .line 422
    const v23, 0x40c570a4    # 6.17f

    .line 423
    .line 424
    .line 425
    const/high16 v24, 0x40a00000    # 5.0f

    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, -0x40d47ae1    # -0.67f

    .line 431
    .line 432
    .line 433
    const/high16 v6, -0x40400000    # -1.5f

    .line 434
    .line 435
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 436
    .line 437
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x41a80000    # 21.0f

    .line 444
    .line 445
    const/high16 v6, 0x41600000    # 14.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v4, -0x3ffae148    # -2.08f

    .line 451
    .line 452
    .line 453
    const v6, -0x3f4051ec    # -5.99f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v25, 0x418c0000    # 17.5f

    .line 460
    .line 461
    const/high16 v26, 0x40e00000    # 7.0f

    .line 462
    .line 463
    const v21, 0x4195c28f    # 18.72f

    .line 464
    .line 465
    .line 466
    const v22, 0x40ed70a4    # 7.42f

    .line 467
    .line 468
    .line 469
    const v23, 0x419147ae    # 18.16f

    .line 470
    .line 471
    .line 472
    const/high16 v24, 0x40e00000    # 7.0f

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v25, -0x404a3d71    # -1.42f

    .line 483
    .line 484
    .line 485
    const v26, 0x3f8147ae    # 1.01f

    .line 486
    .line 487
    .line 488
    const v21, -0x40d70a3d    # -0.66f

    .line 489
    .line 490
    .line 491
    const/16 v22, 0x0

    .line 492
    .line 493
    const v23, -0x40651eb8    # -1.21f

    .line 494
    .line 495
    .line 496
    const v24, 0x3ed70a3d    # 0.42f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v4, 0x40400000    # 3.0f

    .line 503
    .line 504
    const/high16 v6, 0x41600000    # 14.0f

    .line 505
    .line 506
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v4, 0x41000000    # 8.0f

    .line 510
    .line 511
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v25, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/high16 v26, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/16 v21, 0x0

    .line 519
    .line 520
    const v22, 0x3f0ccccd    # 0.55f

    .line 521
    .line 522
    .line 523
    const v23, 0x3ee66666    # 0.45f

    .line 524
    .line 525
    .line 526
    const/high16 v24, 0x3f800000    # 1.0f

    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x3f800000    # 1.0f

    .line 532
    .line 533
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v26, -0x40800000    # -1.0f

    .line 537
    .line 538
    const v21, 0x3f0ccccd    # 0.55f

    .line 539
    .line 540
    .line 541
    const/16 v22, 0x0

    .line 542
    .line 543
    const/high16 v23, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const v24, -0x4119999a    # -0.45f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v4, -0x40800000    # -1.0f

    .line 552
    .line 553
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v4, 0x41400000    # 12.0f

    .line 557
    .line 558
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x3f800000    # 1.0f

    .line 562
    .line 563
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v26, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/16 v21, 0x0

    .line 569
    .line 570
    const v22, 0x3f0ccccd    # 0.55f

    .line 571
    .line 572
    .line 573
    const v23, 0x3ee66666    # 0.45f

    .line 574
    .line 575
    .line 576
    const/high16 v24, 0x3f800000    # 1.0f

    .line 577
    .line 578
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v26, -0x40800000    # -1.0f

    .line 585
    .line 586
    const v21, 0x3f0ccccd    # 0.55f

    .line 587
    .line 588
    .line 589
    const/16 v22, 0x0

    .line 590
    .line 591
    const/high16 v23, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const v24, -0x4119999a    # -0.45f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v4, -0x3f000000    # -8.0f

    .line 600
    .line 601
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v4, 0x40db3333    # 6.85f

    .line 608
    .line 609
    .line 610
    const/high16 v6, 0x41100000    # 9.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v4, 0x4124a3d7    # 10.29f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v4, 0x3f851eb8    # 1.04f

    .line 622
    .line 623
    .line 624
    const/high16 v6, 0x40400000    # 3.0f

    .line 625
    .line 626
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v4, 0x40b9eb85    # 5.81f

    .line 630
    .line 631
    .line 632
    const/high16 v6, 0x41400000    # 12.0f

    .line 633
    .line 634
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v4, 0x3f851eb8    # 1.04f

    .line 638
    .line 639
    .line 640
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 641
    .line 642
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v4, 0x41980000    # 19.0f

    .line 649
    .line 650
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v4, 0x40a00000    # 5.0f

    .line 654
    .line 655
    const/high16 v6, 0x41980000    # 19.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v4, -0x3f6ae148    # -4.66f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v4, 0x3df5c28f    # 0.12f

    .line 667
    .line 668
    .line 669
    const v6, -0x4151eb85    # -0.34f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v4, 0x415c51ec    # 13.77f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v4, 0x3de147ae    # 0.11f

    .line 682
    .line 683
    .line 684
    const v6, 0x3eae147b    # 0.34f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41980000    # 19.0f

    .line 691
    .line 692
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    const/high16 v6, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/high16 v8, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const-string v4, ""

    .line 708
    .line 709
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 710
    .line 711
    .line 712
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 717
    .line 718
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 719
    .line 720
    .line 721
    move-result-wide v6

    .line 722
    const/4 v2, 0x0

    .line 723
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 727
    .line 728
    .line 729
    move-result v10

    .line 730
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 731
    .line 732
    .line 733
    move-result v11

    .line 734
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 737
    .line 738
    .line 739
    const/high16 v4, 0x41840000    # 16.5f

    .line 740
    .line 741
    const/high16 v6, 0x40f00000    # 7.5f

    .line 742
    .line 743
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/4 v4, 0x0

    .line 747
    const/high16 v6, -0x40400000    # -1.5f

    .line 748
    .line 749
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v26, 0x40400000    # 3.0f

    .line 753
    .line 754
    const/16 v27, 0x0

    .line 755
    .line 756
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 757
    .line 758
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 759
    .line 760
    const/16 v23, 0x0

    .line 761
    .line 762
    const/16 v24, 0x1

    .line 763
    .line 764
    const/16 v25, 0x1

    .line 765
    .line 766
    move-object/from16 v20, v2

    .line 767
    .line 768
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 772
    .line 773
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const/high16 v6, 0x3f800000    # 1.0f

    .line 781
    .line 782
    const/4 v7, 0x0

    .line 783
    const-string v4, ""

    .line 784
    .line 785
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 786
    .line 787
    .line 788
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 789
    .line 790
    .line 791
    move-result v3

    .line 792
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 793
    .line 794
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 795
    .line 796
    .line 797
    move-result-wide v6

    .line 798
    const/4 v0, 0x0

    .line 799
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 803
    .line 804
    .line 805
    move-result v10

    .line 806
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 807
    .line 808
    .line 809
    move-result v11

    .line 810
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x41840000    # 16.5f

    .line 816
    .line 817
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const/4 v0, 0x0

    .line 821
    const/high16 v2, -0x40400000    # -1.5f

    .line 822
    .line 823
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v18, 0x40400000    # 3.0f

    .line 827
    .line 828
    const/16 v19, 0x0

    .line 829
    .line 830
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 831
    .line 832
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 833
    .line 834
    const/16 v16, 0x1

    .line 835
    .line 836
    const/16 v17, 0x1

    .line 837
    .line 838
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 842
    .line 843
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    const/16 v16, 0x3800

    .line 851
    .line 852
    const/16 v17, 0x0

    .line 853
    .line 854
    const/high16 v6, 0x3f800000    # 1.0f

    .line 855
    .line 856
    const/4 v7, 0x0

    .line 857
    const/high16 v12, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const/4 v13, 0x0

    .line 860
    const/4 v14, 0x0

    .line 861
    const-string v4, ""

    .line 862
    .line 863
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 872
    .line 873
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    return-object v0
.end method
