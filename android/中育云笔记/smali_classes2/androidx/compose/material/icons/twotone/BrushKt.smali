.class public final Landroidx/compose/material/icons/twotone/BrushKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _brush:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrush(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BrushKt;->_brush:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Brush"

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
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40f33333    # -0.55f

    .line 84
    .line 85
    .line 86
    const v23, -0x4119999a    # -0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40800000    # -1.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x3ee66666    # 0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x40800000    # -1.0f

    .line 100
    .line 101
    const/high16 v7, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, -0x41000000    # -0.5f

    .line 107
    .line 108
    const v26, 0x3ff9999a    # 1.95f

    .line 109
    .line 110
    .line 111
    const v22, 0x3f3d70a4    # 0.74f

    .line 112
    .line 113
    .line 114
    const v23, -0x41bd70a4    # -0.19f

    .line 115
    .line 116
    .line 117
    const v24, 0x3fb33333    # 1.4f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x3f000000    # 0.5f

    .line 124
    .line 125
    const v26, 0x3d4ccccd    # 0.05f

    .line 126
    .line 127
    .line 128
    const v21, 0x3e2e147b    # 0.17f

    .line 129
    .line 130
    .line 131
    const v22, 0x3cf5c28f    # 0.03f

    .line 132
    .line 133
    .line 134
    const v23, 0x3ea8f5c3    # 0.33f

    .line 135
    .line 136
    .line 137
    const v24, 0x3d4ccccd    # 0.05f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x40000000    # 2.0f

    .line 144
    .line 145
    const/high16 v26, -0x40000000    # -2.0f

    .line 146
    .line 147
    const v21, 0x3f8ccccd    # 1.1f

    .line 148
    .line 149
    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    const/high16 v23, 0x40000000    # 2.0f

    .line 153
    .line 154
    const v24, -0x4099999a    # -0.9f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const v6, 0x3e99999a    # 0.3f

    .line 172
    .line 173
    .line 174
    const v8, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    const/high16 v9, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/high16 v12, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const-string v4, ""

    .line 186
    .line 187
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 188
    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    const/4 v0, 0x0

    .line 201
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41700000    # 15.0f

    .line 218
    .line 219
    const/high16 v2, 0x413c0000    # 11.75f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x410f5c29    # 8.96f

    .line 225
    .line 226
    .line 227
    const v2, -0x3ef0a3d7    # -8.96f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const v18, -0x404b851f    # -1.41f

    .line 236
    .line 237
    .line 238
    const v13, 0x3ec7ae14    # 0.39f

    .line 239
    .line 240
    .line 241
    const v14, -0x413851ec    # -0.39f

    .line 242
    .line 243
    .line 244
    const v15, 0x3ec7ae14    # 0.39f

    .line 245
    .line 246
    .line 247
    const v16, -0x407d70a4    # -1.02f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x40547ae1    # -1.34f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x40cccccd    # -0.7f

    .line 260
    .line 261
    .line 262
    const v18, -0x416b851f    # -0.29f

    .line 263
    .line 264
    .line 265
    const v13, -0x41b33333    # -0.2f

    .line 266
    .line 267
    .line 268
    const v14, -0x41b33333    # -0.2f

    .line 269
    .line 270
    .line 271
    const v15, -0x4119999a    # -0.45f

    .line 272
    .line 273
    .line 274
    const v16, -0x416b851f    # -0.29f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x40ca3d71    # -0.71f

    .line 281
    .line 282
    .line 283
    const v2, 0x3e947ae1    # 0.29f

    .line 284
    .line 285
    .line 286
    const v4, -0x40fd70a4    # -0.51f

    .line 287
    .line 288
    .line 289
    const v6, 0x3dcccccd    # 0.1f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41100000    # 9.0f

    .line 296
    .line 297
    const/high16 v2, 0x41440000    # 12.25f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41700000    # 15.0f

    .line 303
    .line 304
    const/high16 v2, 0x413c0000    # 11.75f

    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41a80000    # 21.0f

    .line 313
    .line 314
    const/high16 v2, 0x40c00000    # 6.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x40800000    # 4.0f

    .line 320
    .line 321
    const/high16 v18, -0x3f800000    # -4.0f

    .line 322
    .line 323
    const v13, 0x400d70a4    # 2.21f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x40800000    # 4.0f

    .line 328
    .line 329
    const v16, -0x401ae148    # -1.79f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 336
    .line 337
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, -0x402b851f    # -1.66f

    .line 341
    .line 342
    .line 343
    const v15, -0x40547ae1    # -1.34f

    .line 344
    .line 345
    .line 346
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x3fab851f    # 1.34f

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x40400000    # 3.0f

    .line 355
    .line 356
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 357
    .line 358
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40000000    # -2.0f

    .line 362
    .line 363
    const/high16 v18, 0x40000000    # 2.0f

    .line 364
    .line 365
    const v14, 0x3fa7ae14    # 1.31f

    .line 366
    .line 367
    .line 368
    const v15, -0x406b851f    # -1.16f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x40000000    # 2.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x40800000    # 4.0f

    .line 377
    .line 378
    const v13, 0x3f6b851f    # 0.92f

    .line 379
    .line 380
    .line 381
    const v14, 0x3f9c28f6    # 1.22f

    .line 382
    .line 383
    .line 384
    const v15, 0x401f5c29    # 2.49f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x40c00000    # 6.0f

    .line 394
    .line 395
    const/high16 v2, 0x41880000    # 17.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/high16 v18, -0x40800000    # -1.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x40f33333    # -0.55f

    .line 406
    .line 407
    .line 408
    const v15, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    const/high16 v16, -0x40800000    # -1.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x3ee66666    # 0.45f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x3f800000    # 1.0f

    .line 420
    .line 421
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, -0x40000000    # -2.0f

    .line 425
    .line 426
    const/high16 v18, 0x40000000    # 2.0f

    .line 427
    .line 428
    const v14, 0x3f8ccccd    # 1.1f

    .line 429
    .line 430
    .line 431
    const v15, -0x4099999a    # -0.9f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x40000000    # 2.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, -0x41000000    # -0.5f

    .line 440
    .line 441
    const v18, -0x42b33333    # -0.05f

    .line 442
    .line 443
    .line 444
    const v13, -0x41d1eb85    # -0.17f

    .line 445
    .line 446
    .line 447
    const/4 v14, 0x0

    .line 448
    const v15, -0x41570a3d    # -0.33f

    .line 449
    .line 450
    .line 451
    const v16, -0x435c28f6    # -0.02f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f000000    # 0.5f

    .line 458
    .line 459
    const v18, -0x40066666    # -1.95f

    .line 460
    .line 461
    .line 462
    const v13, 0x3e9eb852    # 0.31f

    .line 463
    .line 464
    .line 465
    const v14, -0x40f33333    # -0.55f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x3f000000    # 0.5f

    .line 469
    .line 470
    const v16, -0x40651eb8    # -1.21f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const/16 v16, 0x3800

    .line 484
    .line 485
    const/16 v17, 0x0

    .line 486
    .line 487
    const/high16 v6, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/high16 v8, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v7, 0x0

    .line 492
    const/high16 v12, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const/4 v14, 0x0

    .line 496
    const/4 v15, 0x0

    .line 497
    const-string v4, ""

    .line 498
    .line 499
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    sput-object v0, Landroidx/compose/material/icons/twotone/BrushKt;->_brush:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 508
    .line 509
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    return-object v0
.end method
