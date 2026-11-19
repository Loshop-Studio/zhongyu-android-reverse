.class public final Landroidx/compose/material/icons/twotone/VisibilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _visibility:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibility(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VisibilityKt;->_visibility:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Visibility"

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
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3ef2e148    # -8.82f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x40b00000    # 5.5f

    .line 81
    .line 82
    const v21, -0x3f8d70a4    # -3.79f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x3f1a8f5c    # -7.17f

    .line 88
    .line 89
    .line 90
    const v24, 0x400851ec    # 2.13f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/high16 v26, 0x41880000    # 17.0f

    .line 101
    .line 102
    const v21, 0x409a8f5c    # 4.83f

    .line 103
    .line 104
    .line 105
    const v22, 0x416deb85    # 14.87f

    .line 106
    .line 107
    .line 108
    const v23, 0x41035c29    # 8.21f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x41880000    # 17.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x3ff7ae14    # -2.13f

    .line 117
    .line 118
    .line 119
    const/high16 v6, -0x3f500000    # -5.5f

    .line 120
    .line 121
    const v7, 0x410d1eb8    # 8.82f

    .line 122
    .line 123
    .line 124
    const v8, 0x40e570a4    # 7.17f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v26, 0x40c00000    # 6.0f

    .line 131
    .line 132
    const v21, 0x41995c29    # 19.17f

    .line 133
    .line 134
    .line 135
    const v22, 0x4102147b    # 8.13f

    .line 136
    .line 137
    .line 138
    const v23, 0x417ca3d7    # 15.79f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x40c00000    # 6.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41800000    # 16.0f

    .line 150
    .line 151
    const/high16 v6, 0x41400000    # 12.0f

    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, -0x3f700000    # -4.5f

    .line 157
    .line 158
    const/high16 v26, -0x3f700000    # -4.5f

    .line 159
    .line 160
    const v21, -0x3fe147ae    # -2.48f

    .line 161
    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const/high16 v23, -0x3f700000    # -4.5f

    .line 166
    .line 167
    const v24, -0x3ffeb852    # -2.02f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x411851ec    # 9.52f

    .line 174
    .line 175
    .line 176
    const/high16 v6, 0x40e00000    # 7.0f

    .line 177
    .line 178
    const/high16 v7, 0x41400000    # 12.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x400147ae    # 2.02f

    .line 184
    .line 185
    .line 186
    const/high16 v6, 0x40900000    # 4.5f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x4167ae14    # 14.48f

    .line 192
    .line 193
    .line 194
    const/high16 v6, 0x41800000    # 16.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const/16 v16, 0x3800

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const v6, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    const v8, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    const/high16 v9, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v12, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const-string v4, ""

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    const/4 v0, 0x0

    .line 240
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x40800000    # 4.0f

    .line 257
    .line 258
    const/high16 v2, 0x41400000    # 12.0f

    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/high16 v18, 0x41380000    # 11.5f

    .line 266
    .line 267
    const/high16 v13, 0x40e00000    # 7.0f

    .line 268
    .line 269
    const/high16 v14, 0x40800000    # 4.0f

    .line 270
    .line 271
    const v15, 0x402eb852    # 2.73f

    .line 272
    .line 273
    .line 274
    const v16, 0x40e3851f    # 7.11f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41400000    # 12.0f

    .line 281
    .line 282
    const/high16 v18, 0x41980000    # 19.0f

    .line 283
    .line 284
    const v13, 0x402eb852    # 2.73f

    .line 285
    .line 286
    .line 287
    const v14, 0x417e3d71    # 15.89f

    .line 288
    .line 289
    .line 290
    const/high16 v15, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/high16 v16, 0x41980000    # 19.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x41300000    # 11.0f

    .line 298
    .line 299
    const/high16 v2, -0x3f100000    # -7.5f

    .line 300
    .line 301
    const v4, 0x411451ec    # 9.27f

    .line 302
    .line 303
    .line 304
    const v6, -0x3fb8f5c3    # -3.11f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x40800000    # 4.0f

    .line 311
    .line 312
    const v13, 0x41aa28f6    # 21.27f

    .line 313
    .line 314
    .line 315
    const v14, 0x40e3851f    # 7.11f

    .line 316
    .line 317
    .line 318
    const/high16 v15, 0x41880000    # 17.0f

    .line 319
    .line 320
    const/high16 v16, 0x40800000    # 4.0f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41880000    # 17.0f

    .line 329
    .line 330
    const/high16 v2, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, -0x3ef2e148    # -8.82f

    .line 336
    .line 337
    .line 338
    const/high16 v18, -0x3f500000    # -5.5f

    .line 339
    .line 340
    const v13, -0x3f8d70a4    # -3.79f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const v15, -0x3f1a8f5c    # -7.17f

    .line 345
    .line 346
    .line 347
    const v16, -0x3ff7ae14    # -2.13f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x41400000    # 12.0f

    .line 354
    .line 355
    const/high16 v18, 0x40c00000    # 6.0f

    .line 356
    .line 357
    const v13, 0x409a8f5c    # 4.83f

    .line 358
    .line 359
    .line 360
    const v14, 0x4102147b    # 8.13f

    .line 361
    .line 362
    .line 363
    const v15, 0x41035c29    # 8.21f

    .line 364
    .line 365
    .line 366
    const/high16 v16, 0x40c00000    # 6.0f

    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x400851ec    # 2.13f

    .line 372
    .line 373
    .line 374
    const/high16 v2, 0x40b00000    # 5.5f

    .line 375
    .line 376
    const v4, 0x410d1eb8    # 8.82f

    .line 377
    .line 378
    .line 379
    const v6, 0x40e570a4    # 7.17f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v18, 0x41880000    # 17.0f

    .line 386
    .line 387
    const v13, 0x41995c29    # 19.17f

    .line 388
    .line 389
    .line 390
    const v14, 0x416deb85    # 14.87f

    .line 391
    .line 392
    .line 393
    const v15, 0x417ca3d7    # 15.79f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x41880000    # 17.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x40e00000    # 7.0f

    .line 405
    .line 406
    const/high16 v2, 0x41400000    # 12.0f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, -0x3f700000    # -4.5f

    .line 412
    .line 413
    const/high16 v18, 0x40900000    # 4.5f

    .line 414
    .line 415
    const v13, -0x3fe147ae    # -2.48f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const/high16 v15, -0x3f700000    # -4.5f

    .line 420
    .line 421
    const v16, 0x400147ae    # 2.02f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x411851ec    # 9.52f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x41800000    # 16.0f

    .line 431
    .line 432
    const/high16 v4, 0x41400000    # 12.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3ffeb852    # -2.02f

    .line 438
    .line 439
    .line 440
    const/high16 v2, -0x3f700000    # -4.5f

    .line 441
    .line 442
    const/high16 v4, 0x40900000    # 4.5f

    .line 443
    .line 444
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x4167ae14    # 14.48f

    .line 448
    .line 449
    .line 450
    const/high16 v2, 0x40e00000    # 7.0f

    .line 451
    .line 452
    const/high16 v4, 0x41400000    # 12.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41600000    # 14.0f

    .line 461
    .line 462
    const/high16 v2, 0x41400000    # 12.0f

    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 468
    .line 469
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 470
    .line 471
    const v13, -0x404f5c29    # -1.38f

    .line 472
    .line 473
    .line 474
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 475
    .line 476
    const v16, -0x4070a3d7    # -1.12f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x4129eb85    # 10.62f

    .line 483
    .line 484
    .line 485
    const/high16 v2, 0x41100000    # 9.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3f8f5c29    # 1.12f

    .line 491
    .line 492
    .line 493
    const/high16 v2, 0x40200000    # 2.5f

    .line 494
    .line 495
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x4156147b    # 13.38f

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x41600000    # 14.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    const/16 v16, 0x3800

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    const/high16 v6, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/high16 v8, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const/high16 v12, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const/4 v15, 0x0

    .line 526
    const-string v4, ""

    .line 527
    .line 528
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    sput-object v0, Landroidx/compose/material/icons/twotone/VisibilityKt;->_visibility:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 537
    .line 538
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    return-object v0
.end method
