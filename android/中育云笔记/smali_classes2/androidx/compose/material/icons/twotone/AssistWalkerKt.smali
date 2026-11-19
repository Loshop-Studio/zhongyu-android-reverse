.class public final Landroidx/compose/material/icons/twotone/AssistWalkerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssistWalker(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AssistWalkerKt;->_assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AssistWalker"

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
    const/high16 v4, 0x41480000    # 12.5f

    .line 71
    .line 72
    const/high16 v6, 0x40900000    # 4.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40000000    # -2.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v0, 0x419e28f6    # 19.77f

    .line 160
    .line 161
    .line 162
    const v2, 0x418dc28f    # 17.72f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, -0x40dc28f6    # -0.64f

    .line 169
    .line 170
    .line 171
    const v2, -0x3f3428f6    # -6.37f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x418d1eb8    # 17.64f

    .line 178
    .line 179
    .line 180
    const/high16 v18, 0x41200000    # 10.0f

    .line 181
    .line 182
    const v13, 0x41987ae1    # 19.06f

    .line 183
    .line 184
    .line 185
    const v14, 0x412947ae    # 10.58f

    .line 186
    .line 187
    .line 188
    const v15, 0x419347ae    # 18.41f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x41200000    # 10.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x41800000    # 16.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x3f8f5c29    # -3.76f

    .line 202
    .line 203
    .line 204
    const v18, -0x4047ae14    # -1.44f

    .line 205
    .line 206
    .line 207
    const/high16 v13, -0x40400000    # -1.5f

    .line 208
    .line 209
    const v14, -0x435c28f6    # -0.02f

    .line 210
    .line 211
    .line 212
    const v15, -0x3fc8f5c3    # -2.86f

    .line 213
    .line 214
    .line 215
    const v16, -0x40f5c28f    # -0.54f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, -0x40028f5c    # -1.98f

    .line 222
    .line 223
    .line 224
    const/high16 v2, -0x40000000    # -2.0f

    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x410d47ae    # 8.83f

    .line 230
    .line 231
    .line 232
    const/high16 v18, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const v13, 0x412147ae    # 10.08f

    .line 235
    .line 236
    .line 237
    const v14, 0x40cd70a4    # 6.42f

    .line 238
    .line 239
    .line 240
    const v15, 0x4119eb85    # 9.62f

    .line 241
    .line 242
    .line 243
    const/high16 v16, 0x40c00000    # 6.0f

    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x40ed70a4    # 7.42f

    .line 249
    .line 250
    .line 251
    const v18, 0x40d2e148    # 6.59f

    .line 252
    .line 253
    .line 254
    const v13, 0x41051eb8    # 8.32f

    .line 255
    .line 256
    .line 257
    const/high16 v14, 0x40c00000    # 6.0f

    .line 258
    .line 259
    const v15, 0x40f9eb85    # 7.81f

    .line 260
    .line 261
    .line 262
    const v16, 0x40c66666    # 6.2f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x40828f5c    # 4.08f

    .line 269
    .line 270
    .line 271
    const v2, 0x411e8f5c    # 9.91f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x41a8f5c3    # -0.21f

    .line 278
    .line 279
    .line 280
    const v18, 0x400851ec    # 2.13f

    .line 281
    .line 282
    .line 283
    const v13, -0x40f851ec    # -0.53f

    .line 284
    .line 285
    .line 286
    const v14, 0x3f2e147b    # 0.68f

    .line 287
    .line 288
    .line 289
    const v15, -0x40fd70a4    # -0.51f

    .line 290
    .line 291
    .line 292
    const v16, 0x3fc8f5c3    # 1.57f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3fb70a3d    # 1.43f

    .line 299
    .line 300
    .line 301
    const v2, 0x40333333    # 2.8f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, -0x3fb66666    # -3.15f

    .line 308
    .line 309
    .line 310
    const v2, 0x4081999a    # 4.05f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x3fc8f5c3    # 1.57f

    .line 317
    .line 318
    .line 319
    const v2, 0x3f9eb852    # 1.24f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x406b851f    # 3.68f

    .line 326
    .line 327
    .line 328
    const v2, -0x3f68a3d7    # -4.73f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x41d1eb85    # -0.17f

    .line 335
    .line 336
    .line 337
    const v2, -0x4051eb85    # -1.36f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x41000000    # 8.0f

    .line 344
    .line 345
    const/high16 v2, 0x416c0000    # 14.75f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41a00000    # 20.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40000000    # 2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x3f3c28f6    # -6.12f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, -0x3ff851ec    # -2.12f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40170a3d    # 2.36f

    .line 373
    .line 374
    .line 375
    const v2, -0x3fe8f5c3    # -2.36f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x4065c28f    # 3.59f

    .line 382
    .line 383
    .line 384
    const v18, 0x40147ae1    # 2.32f

    .line 385
    .line 386
    .line 387
    const v13, 0x3f70a3d7    # 0.94f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f70a3d7    # 0.94f

    .line 391
    .line 392
    .line 393
    const v15, 0x3fdc28f6    # 1.72f

    .line 394
    .line 395
    .line 396
    const v16, 0x3fe8f5c3    # 1.82f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41500000    # 13.0f

    .line 403
    .line 404
    const/high16 v2, 0x41a00000    # 20.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 415
    .line 416
    const v2, 0x3ed1eb85    # 0.41f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x404b851f    # 3.18f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x3e0f5c29    # 0.14f

    .line 429
    .line 430
    .line 431
    const v2, 0x3f9c28f6    # 1.22f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x40c51eb8    # -0.73f

    .line 438
    .line 439
    .line 440
    const v18, 0x3fa3d70a    # 1.28f

    .line 441
    .line 442
    .line 443
    const v13, -0x411eb852    # -0.44f

    .line 444
    .line 445
    .line 446
    const v14, 0x3e851eb8    # 0.26f

    .line 447
    .line 448
    .line 449
    const v15, -0x40c51eb8    # -0.73f

    .line 450
    .line 451
    .line 452
    const v16, 0x3f3d70a4    # 0.74f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 459
    .line 460
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, 0x3f547ae1    # 0.83f

    .line 464
    .line 465
    .line 466
    const v15, 0x3f2b851f    # 0.67f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, -0x40d47ae1    # -0.67f

    .line 475
    .line 476
    .line 477
    const/high16 v2, -0x40400000    # -1.5f

    .line 478
    .line 479
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 480
    .line 481
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, 0x419e28f6    # 19.77f

    .line 485
    .line 486
    .line 487
    const v18, 0x418dc28f    # 17.72f

    .line 488
    .line 489
    .line 490
    const/high16 v13, 0x41a40000    # 20.5f

    .line 491
    .line 492
    const v14, 0x4193ae14    # 18.46f

    .line 493
    .line 494
    .line 495
    const v15, 0x41a1ae14    # 20.21f

    .line 496
    .line 497
    .line 498
    const v16, 0x418fd70a    # 17.98f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41700000    # 15.0f

    .line 508
    .line 509
    const v2, 0x417170a4    # 15.09f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 516
    .line 517
    const v2, 0x3ed1eb85    # 0.41f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x40600000    # 3.5f

    .line 529
    .line 530
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x417170a4    # 15.09f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    const/16 v16, 0x3800

    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const/high16 v6, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/high16 v12, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const/4 v14, 0x0

    .line 557
    const/4 v15, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    sput-object v0, Landroidx/compose/material/icons/twotone/AssistWalkerKt;->_assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-object v0
.end method
