.class public final Landroidx/compose/material/icons/twotone/VideoCameraFrontKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _videoCameraFront:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoCameraFront(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VideoCameraFrontKt;->_videoCameraFront:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VideoCameraFront"

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
    const v4, 0x4127ae14    # 10.48f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41900000    # 18.0f

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
    const/high16 v25, 0x40000000    # 2.0f

    .line 108
    .line 109
    const/high16 v26, 0x40c00000    # 6.0f

    .line 110
    .line 111
    const v21, 0x4039999a    # 2.9f

    .line 112
    .line 113
    .line 114
    const/high16 v22, 0x40800000    # 4.0f

    .line 115
    .line 116
    const/high16 v23, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v24, 0x409ccccd    # 4.9f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41400000    # 12.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v26, 0x40000000    # 2.0f

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const v22, 0x3f8ccccd    # 1.1f

    .line 134
    .line 135
    .line 136
    const v23, 0x3f666666    # 0.9f

    .line 137
    .line 138
    .line 139
    const/high16 v24, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v26, -0x40000000    # -2.0f

    .line 148
    .line 149
    const v21, 0x3f8ccccd    # 1.1f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const/high16 v23, 0x40000000    # 2.0f

    .line 155
    .line 156
    const v24, -0x4099999a    # -0.9f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x3f70a3d7    # -4.48f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, 0x407eb852    # 3.98f

    .line 169
    .line 170
    .line 171
    const/high16 v6, 0x40800000    # 4.0f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, 0x4127ae14    # 10.48f

    .line 182
    .line 183
    .line 184
    const/high16 v6, 0x41900000    # 18.0f

    .line 185
    .line 186
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41800000    # 16.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x40800000    # 4.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40c00000    # 6.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x41400000    # 12.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x41900000    # 18.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41200000    # 10.0f

    .line 221
    .line 222
    const/high16 v6, 0x41400000    # 12.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, -0x4099999a    # -0.9f

    .line 231
    .line 232
    .line 233
    const/high16 v6, -0x40000000    # -2.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x3f666666    # 0.9f

    .line 239
    .line 240
    .line 241
    const/high16 v6, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/high16 v7, -0x40000000    # -2.0f

    .line 244
    .line 245
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x410e6666    # 8.9f

    .line 249
    .line 250
    .line 251
    const/high16 v6, 0x41200000    # 10.0f

    .line 252
    .line 253
    const/high16 v7, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x41600000    # 14.0f

    .line 262
    .line 263
    const v6, 0x4176e148    # 15.43f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v25, -0x4063d70a    # -1.22f

    .line 270
    .line 271
    .line 272
    const v26, -0x40133333    # -1.85f

    .line 273
    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    const v22, -0x40b0a3d7    # -0.81f

    .line 278
    .line 279
    .line 280
    const v23, -0x410a3d71    # -0.48f

    .line 281
    .line 282
    .line 283
    const v24, -0x403c28f6    # -1.53f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x41200000    # 10.0f

    .line 290
    .line 291
    const/high16 v26, 0x41500000    # 13.0f

    .line 292
    .line 293
    const v21, 0x413ee148    # 11.93f

    .line 294
    .line 295
    .line 296
    const v22, 0x41535c29    # 13.21f

    .line 297
    .line 298
    .line 299
    const v23, 0x412fd70a    # 10.99f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x41500000    # 13.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, -0x3fce147b    # -2.78f

    .line 308
    .line 309
    .line 310
    const v26, 0x3f147ae1    # 0.58f

    .line 311
    .line 312
    .line 313
    const v21, -0x40828f5c    # -0.99f

    .line 314
    .line 315
    .line 316
    const/16 v22, 0x0

    .line 317
    .line 318
    const v23, -0x4008f5c3    # -1.93f

    .line 319
    .line 320
    .line 321
    const v24, 0x3e570a3d    # 0.21f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x40c00000    # 6.0f

    .line 328
    .line 329
    const v26, 0x4176e148    # 15.43f

    .line 330
    .line 331
    .line 332
    const v21, 0x40cf5c29    # 6.48f

    .line 333
    .line 334
    .line 335
    const v22, 0x415e6666    # 13.9f

    .line 336
    .line 337
    .line 338
    const/high16 v23, 0x40c00000    # 6.0f

    .line 339
    .line 340
    const v24, 0x4169eb85    # 14.62f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v4, 0x41800000    # 16.0f

    .line 347
    .line 348
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x41000000    # 8.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x4176e148    # 15.43f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v16, 0x3800

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/high16 v6, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v8, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const/high16 v9, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v12, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    const/4 v15, 0x0

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    const/4 v0, 0x0

    .line 401
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40800000    # 4.0f

    .line 418
    .line 419
    const/high16 v2, 0x41900000    # 18.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41400000    # 12.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x411b0a3d    # 9.69f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40c00000    # 6.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x40800000    # 4.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41900000    # 18.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41000000    # 8.0f

    .line 454
    .line 455
    const/high16 v2, 0x41200000    # 10.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x40000000    # 2.0f

    .line 461
    .line 462
    const/high16 v18, 0x40000000    # 2.0f

    .line 463
    .line 464
    const v13, 0x3f8ccccd    # 1.1f

    .line 465
    .line 466
    .line 467
    const/high16 v15, 0x40000000    # 2.0f

    .line 468
    .line 469
    const v16, 0x3f666666    # 0.9f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40000000    # 2.0f

    .line 476
    .line 477
    const v2, -0x4099999a    # -0.9f

    .line 478
    .line 479
    .line 480
    const/high16 v4, -0x40000000    # -2.0f

    .line 481
    .line 482
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x4099999a    # -0.9f

    .line 486
    .line 487
    .line 488
    const/high16 v2, -0x40000000    # -2.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x410e6666    # 8.9f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x41000000    # 8.0f

    .line 497
    .line 498
    const/high16 v4, 0x41200000    # 10.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4176e148    # 15.43f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x40c00000    # 6.0f

    .line 510
    .line 511
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x3f9c28f6    # 1.22f

    .line 515
    .line 516
    .line 517
    const v18, -0x40133333    # -1.85f

    .line 518
    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const v14, -0x40b0a3d7    # -0.81f

    .line 522
    .line 523
    .line 524
    const v15, 0x3ef5c28f    # 0.48f

    .line 525
    .line 526
    .line 527
    const v16, -0x403c28f6    # -1.53f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41200000    # 10.0f

    .line 534
    .line 535
    const/high16 v18, 0x41500000    # 13.0f

    .line 536
    .line 537
    const v13, 0x41011eb8    # 8.07f

    .line 538
    .line 539
    .line 540
    const v14, 0x41535c29    # 13.21f

    .line 541
    .line 542
    .line 543
    const v15, 0x411028f6    # 9.01f

    .line 544
    .line 545
    .line 546
    const/high16 v16, 0x41500000    # 13.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x4031eb85    # 2.78f

    .line 552
    .line 553
    .line 554
    const v18, 0x3f147ae1    # 0.58f

    .line 555
    .line 556
    .line 557
    const v13, 0x3f7d70a4    # 0.99f

    .line 558
    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    const v15, 0x3ff70a3d    # 1.93f

    .line 562
    .line 563
    .line 564
    const v16, 0x3e570a3d    # 0.21f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, 0x41600000    # 14.0f

    .line 571
    .line 572
    const v18, 0x4176e148    # 15.43f

    .line 573
    .line 574
    .line 575
    const v13, 0x415851ec    # 13.52f

    .line 576
    .line 577
    .line 578
    const v14, 0x415e6666    # 13.9f

    .line 579
    .line 580
    .line 581
    const/high16 v15, 0x41600000    # 14.0f

    .line 582
    .line 583
    const v16, 0x4169eb85    # 14.62f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x41800000    # 16.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x40c00000    # 6.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x4176e148    # 15.43f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/16 v16, 0x3800

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const v6, 0x3e99999a    # 0.3f

    .line 617
    .line 618
    .line 619
    const v8, 0x3e99999a    # 0.3f

    .line 620
    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    const/high16 v12, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const/4 v14, 0x0

    .line 627
    const/4 v15, 0x0

    .line 628
    const-string v4, ""

    .line 629
    .line 630
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    sput-object v0, Landroidx/compose/material/icons/twotone/VideoCameraFrontKt;->_videoCameraFront:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    return-object v0
.end method
