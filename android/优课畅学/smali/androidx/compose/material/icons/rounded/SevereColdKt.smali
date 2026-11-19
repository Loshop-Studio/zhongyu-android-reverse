.class public final Landroidx/compose/material/icons/rounded/SevereColdKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _severeCold:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSevereCold(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SevereColdKt;->_severeCold:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SevereCold"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v21, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v24, 0x3ee66666    # 0.45f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40400000    # 3.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x3f0ccccd    # 0.55f

    .line 106
    .line 107
    .line 108
    const v23, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v26, -0x40800000    # -1.0f

    .line 117
    .line 118
    const v21, 0x3f0ccccd    # 0.55f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/high16 v23, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const v24, -0x4119999a    # -0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x41a00000    # 20.0f

    .line 135
    .line 136
    const/high16 v26, 0x40000000    # 2.0f

    .line 137
    .line 138
    const/high16 v21, 0x41a80000    # 21.0f

    .line 139
    .line 140
    const v22, 0x401ccccd    # 2.45f

    .line 141
    .line 142
    .line 143
    const v23, 0x41a46666    # 20.55f

    .line 144
    .line 145
    .line 146
    const/high16 v24, 0x40000000    # 2.0f

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const/16 v16, 0x3800

    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    const/high16 v6, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v8, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/high16 v9, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const/high16 v12, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    const-string v4, ""

    .line 175
    .line 176
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41100000    # 9.0f

    .line 207
    .line 208
    const/high16 v6, 0x41a00000    # 20.0f

    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, -0x40800000    # -1.0f

    .line 214
    .line 215
    const/4 v6, 0x0

    .line 216
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/16 v27, 0x0

    .line 220
    .line 221
    const/high16 v21, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v22, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    const/16 v24, 0x1

    .line 228
    .line 229
    const/16 v25, 0x1

    .line 230
    .line 231
    move-object/from16 v20, v2

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v26, -0x40000000    # -2.0f

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const/high16 v6, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const-string v4, ""

    .line 249
    .line 250
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v6

    .line 263
    const/4 v0, 0x0

    .line 264
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const v0, 0x41268f5c    # 10.41f

    .line 281
    .line 282
    .line 283
    const/high16 v2, 0x41400000    # 12.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x3fad70a4    # -3.29f

    .line 289
    .line 290
    .line 291
    const v2, 0x40528f5c    # 3.29f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    const v18, -0x404b851f    # -1.41f

    .line 300
    .line 301
    .line 302
    const v13, 0x3ec7ae14    # 0.39f

    .line 303
    .line 304
    .line 305
    const v14, -0x413851ec    # -0.39f

    .line 306
    .line 307
    .line 308
    const v15, 0x3ec7ae14    # 0.39f

    .line 309
    .line 310
    .line 311
    const v16, -0x407d70a4    # -1.02f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/4 v0, 0x0

    .line 318
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x404b851f    # -1.41f

    .line 322
    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    const v13, -0x413851ec    # -0.39f

    .line 327
    .line 328
    .line 329
    const v15, -0x407d70a4    # -1.02f

    .line 330
    .line 331
    .line 332
    const v16, -0x413851ec    # -0.39f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x40f2e148    # 7.59f

    .line 339
    .line 340
    .line 341
    const/high16 v2, 0x41400000    # 12.0f

    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40a00000    # 5.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, -0x40800000    # -1.0f

    .line 352
    .line 353
    const/high16 v18, -0x40800000    # -1.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const v14, -0x40f33333    # -0.55f

    .line 357
    .line 358
    .line 359
    const v15, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    const/high16 v16, -0x40800000    # -1.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v18, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const v13, -0x40f33333    # -0.55f

    .line 374
    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const/high16 v15, -0x40800000    # -1.0f

    .line 378
    .line 379
    const v16, 0x3ee66666    # 0.45f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x4025c28f    # 2.59f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x4101eb85    # 8.12f

    .line 392
    .line 393
    .line 394
    const v2, 0x40b6b852    # 5.71f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, -0x404b851f    # -1.41f

    .line 401
    .line 402
    .line 403
    const/16 v18, 0x0

    .line 404
    .line 405
    const v13, -0x413851ec    # -0.39f

    .line 406
    .line 407
    .line 408
    const v14, -0x413851ec    # -0.39f

    .line 409
    .line 410
    .line 411
    const v15, -0x407d70a4    # -1.02f

    .line 412
    .line 413
    .line 414
    const v16, -0x413851ec    # -0.39f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/4 v0, 0x0

    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    const v18, 0x3fb47ae1    # 1.41f

    .line 427
    .line 428
    .line 429
    const v14, 0x3ec7ae14    # 0.39f

    .line 430
    .line 431
    .line 432
    const v15, -0x413851ec    # -0.39f

    .line 433
    .line 434
    .line 435
    const v16, 0x3f828f5c    # 1.02f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41200000    # 10.0f

    .line 442
    .line 443
    const v2, 0x41268f5c    # 10.41f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41400000    # 12.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x41068f5c    # 8.41f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x40a3d70a    # 5.12f

    .line 461
    .line 462
    .line 463
    const v2, 0x410b5c29    # 8.71f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x404b851f    # -1.41f

    .line 470
    .line 471
    .line 472
    const/16 v18, 0x0

    .line 473
    .line 474
    const v14, -0x413851ec    # -0.39f

    .line 475
    .line 476
    .line 477
    const v15, -0x407d70a4    # -1.02f

    .line 478
    .line 479
    .line 480
    const v16, -0x413851ec    # -0.39f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/4 v0, 0x0

    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/16 v17, 0x0

    .line 491
    .line 492
    const v18, 0x3fb47ae1    # 1.41f

    .line 493
    .line 494
    .line 495
    const v14, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v15, -0x413851ec    # -0.39f

    .line 499
    .line 500
    .line 501
    const v16, 0x3f828f5c    # 1.02f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x40b2e148    # 5.59f

    .line 508
    .line 509
    .line 510
    const/high16 v2, 0x41400000    # 12.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40400000    # 3.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, -0x40800000    # -1.0f

    .line 521
    .line 522
    const/high16 v18, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const v13, -0x40f33333    # -0.55f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const/high16 v15, -0x40800000    # -1.0f

    .line 529
    .line 530
    const v16, 0x3ee66666    # 0.45f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/4 v0, 0x0

    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f0ccccd    # 0.55f

    .line 544
    .line 545
    .line 546
    const v15, 0x3ee66666    # 0.45f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x4025c28f    # 2.59f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, -0x400f5c29    # -1.88f

    .line 561
    .line 562
    .line 563
    const v2, 0x3ff0a3d7    # 1.88f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const v18, 0x3fb47ae1    # 1.41f

    .line 572
    .line 573
    .line 574
    const v13, -0x413851ec    # -0.39f

    .line 575
    .line 576
    .line 577
    const v14, 0x3ec7ae14    # 0.39f

    .line 578
    .line 579
    .line 580
    const v15, -0x413851ec    # -0.39f

    .line 581
    .line 582
    .line 583
    const v16, 0x3f828f5c    # 1.02f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/4 v0, 0x0

    .line 590
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, 0x3fb47ae1    # 1.41f

    .line 594
    .line 595
    .line 596
    const/16 v18, 0x0

    .line 597
    .line 598
    const v13, 0x3ec7ae14    # 0.39f

    .line 599
    .line 600
    .line 601
    const v15, 0x3f828f5c    # 1.02f

    .line 602
    .line 603
    .line 604
    const v16, 0x3ec7ae14    # 0.39f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x41068f5c    # 8.41f

    .line 611
    .line 612
    .line 613
    const/high16 v2, 0x41600000    # 14.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41200000    # 10.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x3fcb851f    # 1.59f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x3fad70a4    # -3.29f

    .line 630
    .line 631
    .line 632
    const v2, 0x40528f5c    # 3.29f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/16 v17, 0x0

    .line 639
    .line 640
    const v18, 0x3fb47ae1    # 1.41f

    .line 641
    .line 642
    .line 643
    const v13, -0x413851ec    # -0.39f

    .line 644
    .line 645
    .line 646
    const v15, -0x413851ec    # -0.39f

    .line 647
    .line 648
    .line 649
    const v16, 0x3f828f5c    # 1.02f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/4 v0, 0x0

    .line 656
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, 0x3fb47ae1    # 1.41f

    .line 660
    .line 661
    .line 662
    const/16 v18, 0x0

    .line 663
    .line 664
    const v13, 0x3ec7ae14    # 0.39f

    .line 665
    .line 666
    .line 667
    const v15, 0x3f828f5c    # 1.02f

    .line 668
    .line 669
    .line 670
    const v16, 0x3ec7ae14    # 0.39f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x419347ae    # 18.41f

    .line 677
    .line 678
    .line 679
    const/high16 v2, 0x41200000    # 10.0f

    .line 680
    .line 681
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x41a80000    # 21.0f

    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/high16 v18, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const v14, 0x3f0ccccd    # 0.55f

    .line 695
    .line 696
    .line 697
    const v15, 0x3ee66666    # 0.45f

    .line 698
    .line 699
    .line 700
    const/high16 v16, 0x3f800000    # 1.0f

    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/4 v0, 0x0

    .line 706
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v18, -0x40800000    # -1.0f

    .line 710
    .line 711
    const v13, 0x3f0ccccd    # 0.55f

    .line 712
    .line 713
    .line 714
    const/4 v14, 0x0

    .line 715
    const/high16 v15, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const v16, -0x4119999a    # -0.45f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, -0x3fda3d71    # -2.59f

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x3ff0a3d7    # 1.88f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v17, 0x3fb47ae1    # 1.41f

    .line 736
    .line 737
    .line 738
    const/16 v18, 0x0

    .line 739
    .line 740
    const v13, 0x3ec7ae14    # 0.39f

    .line 741
    .line 742
    .line 743
    const v14, 0x3ec7ae14    # 0.39f

    .line 744
    .line 745
    .line 746
    const v15, 0x3f828f5c    # 1.02f

    .line 747
    .line 748
    .line 749
    const v16, 0x3ec7ae14    # 0.39f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/4 v0, 0x0

    .line 756
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/16 v17, 0x0

    .line 760
    .line 761
    const v18, -0x404b851f    # -1.41f

    .line 762
    .line 763
    .line 764
    const v14, -0x413851ec    # -0.39f

    .line 765
    .line 766
    .line 767
    const v15, 0x3ec7ae14    # 0.39f

    .line 768
    .line 769
    .line 770
    const v16, -0x407d70a4    # -1.02f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x417970a4    # 15.59f

    .line 777
    .line 778
    .line 779
    const/high16 v2, 0x41400000    # 12.0f

    .line 780
    .line 781
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x41600000    # 14.0f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x3fcb851f    # 1.59f

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v0, 0x40528f5c    # 3.29f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x3fb47ae1    # 1.41f

    .line 802
    .line 803
    .line 804
    const/16 v18, 0x0

    .line 805
    .line 806
    const v14, 0x3ec7ae14    # 0.39f

    .line 807
    .line 808
    .line 809
    const v15, 0x3f828f5c    # 1.02f

    .line 810
    .line 811
    .line 812
    const v16, 0x3ec7ae14    # 0.39f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/4 v0, 0x0

    .line 819
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/16 v17, 0x0

    .line 823
    .line 824
    const v18, -0x404b851f    # -1.41f

    .line 825
    .line 826
    .line 827
    const v14, -0x413851ec    # -0.39f

    .line 828
    .line 829
    .line 830
    const v15, 0x3ec7ae14    # 0.39f

    .line 831
    .line 832
    .line 833
    const v16, -0x407d70a4    # -1.02f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v0, 0x418347ae    # 16.41f

    .line 840
    .line 841
    .line 842
    const/high16 v2, 0x41600000    # 14.0f

    .line 843
    .line 844
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v0, 0x41980000    # 19.0f

    .line 848
    .line 849
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v17, 0x3f800000    # 1.0f

    .line 853
    .line 854
    const/high16 v18, -0x40800000    # -1.0f

    .line 855
    .line 856
    const v13, 0x3f0ccccd    # 0.55f

    .line 857
    .line 858
    .line 859
    const/4 v14, 0x0

    .line 860
    const/high16 v15, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const v16, -0x4119999a    # -0.45f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/4 v0, 0x0

    .line 869
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v17, -0x40800000    # -1.0f

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    const v14, -0x40f33333    # -0.55f

    .line 876
    .line 877
    .line 878
    const v15, -0x4119999a    # -0.45f

    .line 879
    .line 880
    .line 881
    const/high16 v16, -0x40800000    # -1.0f

    .line 882
    .line 883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v0, -0x3f200000    # -7.0f

    .line 887
    .line 888
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x41268f5c    # 10.41f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    const/16 v16, 0x3800

    .line 905
    .line 906
    const/16 v17, 0x0

    .line 907
    .line 908
    const/high16 v6, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/4 v7, 0x0

    .line 911
    const/high16 v12, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/4 v14, 0x0

    .line 914
    const/4 v15, 0x0

    .line 915
    const-string v4, ""

    .line 916
    .line 917
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    sput-object v0, Landroidx/compose/material/icons/rounded/SevereColdKt;->_severeCold:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 926
    .line 927
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-object v0
.end method
