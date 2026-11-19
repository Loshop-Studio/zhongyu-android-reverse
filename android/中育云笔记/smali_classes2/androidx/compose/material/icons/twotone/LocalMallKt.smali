.class public final Landroidx/compose/material/icons/twotone/LocalMallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localMall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalMall(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalMallKt;->_localMall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalMall"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41400000    # 12.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41980000    # 19.0f

    .line 88
    .line 89
    const/high16 v6, 0x41000000    # 8.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41000000    # 8.0f

    .line 95
    .line 96
    const/high16 v6, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41600000    # 14.0f

    .line 105
    .line 106
    const/high16 v6, 0x41400000    # 12.0f

    .line 107
    .line 108
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, -0x3f600000    # -5.0f

    .line 112
    .line 113
    const/high16 v26, -0x3f600000    # -5.0f

    .line 114
    .line 115
    const v21, -0x3fcf5c29    # -2.76f

    .line 116
    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    const/high16 v23, -0x3f600000    # -5.0f

    .line 121
    .line 122
    const v24, -0x3ff0a3d7    # -2.24f

    .line 123
    .line 124
    .line 125
    move-object/from16 v20, v2

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x40400000    # 3.0f

    .line 136
    .line 137
    const/high16 v26, 0x40400000    # 3.0f

    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const v22, 0x3fd47ae1    # 1.66f

    .line 142
    .line 143
    .line 144
    const v23, 0x3fab851f    # 1.34f

    .line 145
    .line 146
    .line 147
    const/high16 v24, 0x40400000    # 3.0f

    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, -0x40547ae1    # -1.34f

    .line 153
    .line 154
    .line 155
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 156
    .line 157
    const/high16 v7, 0x40400000    # 3.0f

    .line 158
    .line 159
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40000000    # 2.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, -0x3f600000    # -5.0f

    .line 168
    .line 169
    const/high16 v26, 0x40a00000    # 5.0f

    .line 170
    .line 171
    const v22, 0x4030a3d7    # 2.76f

    .line 172
    .line 173
    .line 174
    const v23, -0x3ff0a3d7    # -2.24f

    .line 175
    .line 176
    .line 177
    const/high16 v24, 0x40a00000    # 5.0f

    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const/16 v16, 0x3800

    .line 190
    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    const v6, 0x3e99999a    # 0.3f

    .line 194
    .line 195
    .line 196
    const v8, 0x3e99999a    # 0.3f

    .line 197
    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    const/high16 v9, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/high16 v12, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    const/4 v14, 0x0

    .line 206
    const/4 v15, 0x0

    .line 207
    const-string v4, ""

    .line 208
    .line 209
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 210
    .line 211
    .line 212
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 217
    .line 218
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 219
    .line 220
    .line 221
    move-result-wide v6

    .line 222
    const/4 v0, 0x0

    .line 223
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41880000    # 17.0f

    .line 240
    .line 241
    const/high16 v2, 0x40c00000    # 6.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, -0x3f600000    # -5.0f

    .line 247
    .line 248
    const/high16 v18, -0x3f600000    # -5.0f

    .line 249
    .line 250
    const v14, -0x3fcf5c29    # -2.76f

    .line 251
    .line 252
    .line 253
    const v15, -0x3ff0a3d7    # -2.24f

    .line 254
    .line 255
    .line 256
    const/high16 v16, -0x3f600000    # -5.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x404f5c29    # 3.24f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x40e00000    # 7.0f

    .line 265
    .line 266
    const/high16 v4, 0x40c00000    # 6.0f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x40c00000    # 6.0f

    .line 272
    .line 273
    const/high16 v2, 0x40a00000    # 5.0f

    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40000000    # -2.0f

    .line 279
    .line 280
    const/high16 v18, 0x40000000    # 2.0f

    .line 281
    .line 282
    const v13, -0x40733333    # -1.1f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40000000    # -2.0f

    .line 287
    .line 288
    const v16, 0x3f666666    # 0.9f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41400000    # 12.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x40000000    # 2.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, 0x3f8ccccd    # 1.1f

    .line 303
    .line 304
    .line 305
    const v15, 0x3f666666    # 0.9f

    .line 306
    .line 307
    .line 308
    const/high16 v16, 0x40000000    # 2.0f

    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41600000    # 14.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v18, -0x40000000    # -2.0f

    .line 319
    .line 320
    const v13, 0x3f8ccccd    # 1.1f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const/high16 v15, 0x40000000    # 2.0f

    .line 325
    .line 326
    const v16, -0x4099999a    # -0.9f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41a80000    # 21.0f

    .line 333
    .line 334
    const/high16 v2, 0x41000000    # 8.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, -0x40000000    # -2.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const v14, -0x40733333    # -1.1f

    .line 343
    .line 344
    .line 345
    const v15, -0x4099999a    # -0.9f

    .line 346
    .line 347
    .line 348
    const/high16 v16, -0x40000000    # -2.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, -0x40000000    # -2.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x40400000    # 3.0f

    .line 362
    .line 363
    const/high16 v2, 0x41400000    # 12.0f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x40400000    # 3.0f

    .line 369
    .line 370
    const/high16 v18, 0x40400000    # 3.0f

    .line 371
    .line 372
    const v13, 0x3fd47ae1    # 1.66f

    .line 373
    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const/high16 v15, 0x40400000    # 3.0f

    .line 377
    .line 378
    const v16, 0x3fab851f    # 1.34f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41100000    # 9.0f

    .line 385
    .line 386
    const/high16 v2, 0x40c00000    # 6.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, -0x402b851f    # -1.66f

    .line 395
    .line 396
    .line 397
    const v15, 0x3fab851f    # 1.34f

    .line 398
    .line 399
    .line 400
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41a00000    # 20.0f

    .line 409
    .line 410
    const/high16 v2, 0x41980000    # 19.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x40a00000    # 5.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41000000    # 8.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41600000    # 14.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41400000    # 12.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 442
    .line 443
    const v13, -0x402b851f    # -1.66f

    .line 444
    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 448
    .line 449
    const v16, -0x40547ae1    # -1.34f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x41100000    # 9.0f

    .line 456
    .line 457
    const/high16 v2, 0x40e00000    # 7.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x40a00000    # 5.0f

    .line 463
    .line 464
    const/high16 v18, 0x40a00000    # 5.0f

    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, 0x4030a3d7    # 2.76f

    .line 468
    .line 469
    .line 470
    const v15, 0x400f5c29    # 2.24f

    .line 471
    .line 472
    .line 473
    const/high16 v16, 0x40a00000    # 5.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, -0x3ff0a3d7    # -2.24f

    .line 479
    .line 480
    .line 481
    const/high16 v2, -0x3f600000    # -5.0f

    .line 482
    .line 483
    const/high16 v4, 0x40a00000    # 5.0f

    .line 484
    .line 485
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, -0x40000000    # -2.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 494
    .line 495
    const/high16 v18, 0x40400000    # 3.0f

    .line 496
    .line 497
    const v14, 0x3fd47ae1    # 1.66f

    .line 498
    .line 499
    .line 500
    const v15, -0x40547ae1    # -1.34f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x40400000    # 3.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const/16 v16, 0x3800

    .line 516
    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v8, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const/high16 v12, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v14, 0x0

    .line 527
    const/4 v15, 0x0

    .line 528
    const-string v4, ""

    .line 529
    .line 530
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalMallKt;->_localMall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method
