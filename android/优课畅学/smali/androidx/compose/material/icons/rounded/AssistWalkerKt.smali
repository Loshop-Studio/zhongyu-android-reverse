.class public final Landroidx/compose/material/icons/rounded/AssistWalkerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssistWalker(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AssistWalkerKt;->_assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AssistWalker"

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
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x40300000    # 2.75f

    .line 308
    .line 309
    const v2, 0x4190cccd    # 18.1f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3e2e147b    # 0.17f

    .line 316
    .line 317
    .line 318
    const v18, 0x3fb33333    # 1.4f

    .line 319
    .line 320
    .line 321
    const v13, -0x4151eb85    # -0.34f

    .line 322
    .line 323
    .line 324
    const v14, 0x3edc28f6    # 0.43f

    .line 325
    .line 326
    .line 327
    const v15, -0x417ae148    # -0.26f

    .line 328
    .line 329
    .line 330
    const v16, 0x3f87ae14    # 1.06f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/4 v0, 0x0

    .line 337
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, 0x3fb47ae1    # 1.41f

    .line 341
    .line 342
    .line 343
    const v18, -0x41d1eb85    # -0.17f

    .line 344
    .line 345
    .line 346
    const v13, 0x3ee147ae    # 0.44f

    .line 347
    .line 348
    .line 349
    const v14, 0x3eae147b    # 0.34f

    .line 350
    .line 351
    .line 352
    const v15, 0x3f88f5c3    # 1.07f

    .line 353
    .line 354
    .line 355
    const v16, 0x3e851eb8    # 0.26f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x4023d70a    # 2.56f

    .line 362
    .line 363
    .line 364
    const v2, -0x3fad70a4    # -3.29f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3ed1eb85    # 0.41f

    .line 371
    .line 372
    .line 373
    const v18, -0x40428f5c    # -1.48f

    .line 374
    .line 375
    .line 376
    const v13, 0x3ea8f5c3    # 0.33f

    .line 377
    .line 378
    .line 379
    const v14, -0x4128f5c3    # -0.42f

    .line 380
    .line 381
    .line 382
    const v15, 0x3ef0a3d7    # 0.47f

    .line 383
    .line 384
    .line 385
    const v16, -0x408ccccd    # -0.95f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, -0x4270a3d7    # -0.07f

    .line 392
    .line 393
    .line 394
    const v2, -0x40f851ec    # -0.53f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41000000    # 8.0f

    .line 401
    .line 402
    const/high16 v2, 0x416c0000    # 14.75f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41980000    # 19.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/high16 v18, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const v14, 0x3f0ccccd    # 0.55f

    .line 418
    .line 419
    .line 420
    const v15, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x3f800000    # 1.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/4 v0, 0x0

    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v18, -0x40800000    # -1.0f

    .line 433
    .line 434
    const v13, 0x3f0ccccd    # 0.55f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const v16, -0x4119999a    # -0.45f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x3f76b852    # -4.29f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x40e8f5c3    # -0.59f

    .line 453
    .line 454
    .line 455
    const v18, -0x404b851f    # -1.41f

    .line 456
    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const v14, -0x40f851ec    # -0.53f

    .line 460
    .line 461
    .line 462
    const v15, -0x41a8f5c3    # -0.21f

    .line 463
    .line 464
    .line 465
    const v16, -0x407ae148    # -1.04f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x403c28f6    # -1.53f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x40170a3d    # 2.36f

    .line 478
    .line 479
    .line 480
    const v2, -0x3fe8f5c3    # -2.36f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x4065c28f    # 3.59f

    .line 487
    .line 488
    .line 489
    const v18, 0x40147ae1    # 2.32f

    .line 490
    .line 491
    .line 492
    const v13, 0x3f70a3d7    # 0.94f

    .line 493
    .line 494
    .line 495
    const v14, 0x3f70a3d7    # 0.94f

    .line 496
    .line 497
    .line 498
    const v15, 0x3fdc28f6    # 1.72f

    .line 499
    .line 500
    .line 501
    const v16, 0x3fe8f5c3    # 1.82f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, -0x40c00000    # -0.75f

    .line 508
    .line 509
    const v2, 0x40eeb852    # 7.46f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x3f400000    # 0.75f

    .line 516
    .line 517
    const v18, 0x3f547ae1    # 0.83f

    .line 518
    .line 519
    .line 520
    const v13, -0x42dc28f6    # -0.04f

    .line 521
    .line 522
    .line 523
    const v14, 0x3ee147ae    # 0.44f

    .line 524
    .line 525
    .line 526
    const v15, 0x3e99999a    # 0.3f

    .line 527
    .line 528
    .line 529
    const v16, 0x3f547ae1    # 0.83f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/4 v0, 0x0

    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v18, -0x40d70a3d    # -0.66f

    .line 540
    .line 541
    .line 542
    const v13, 0x3ec28f5c    # 0.38f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const v15, 0x3f333333    # 0.7f

    .line 547
    .line 548
    .line 549
    const v16, -0x416b851f    # -0.29f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3ea8f5c3    # 0.33f

    .line 556
    .line 557
    .line 558
    const v2, -0x3fca3d71    # -2.84f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x404b851f    # 3.18f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x3e0f5c29    # 0.14f

    .line 571
    .line 572
    .line 573
    const v2, 0x3f9c28f6    # 1.22f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, -0x40c51eb8    # -0.73f

    .line 580
    .line 581
    .line 582
    const v18, 0x3fa3d70a    # 1.28f

    .line 583
    .line 584
    .line 585
    const v13, -0x411eb852    # -0.44f

    .line 586
    .line 587
    .line 588
    const v14, 0x3e851eb8    # 0.26f

    .line 589
    .line 590
    .line 591
    const v15, -0x40c51eb8    # -0.73f

    .line 592
    .line 593
    .line 594
    const v16, 0x3f3d70a4    # 0.74f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, 0x3f547ae1    # 0.83f

    .line 606
    .line 607
    .line 608
    const v15, 0x3f2b851f    # 0.67f

    .line 609
    .line 610
    .line 611
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, -0x40d47ae1    # -0.67f

    .line 617
    .line 618
    .line 619
    const/high16 v2, -0x40400000    # -1.5f

    .line 620
    .line 621
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 622
    .line 623
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x419e28f6    # 19.77f

    .line 627
    .line 628
    .line 629
    const v18, 0x418dc28f    # 17.72f

    .line 630
    .line 631
    .line 632
    const/high16 v13, 0x41a40000    # 20.5f

    .line 633
    .line 634
    const v14, 0x4193ae14    # 18.46f

    .line 635
    .line 636
    .line 637
    const v15, 0x41a1ae14    # 20.21f

    .line 638
    .line 639
    .line 640
    const v16, 0x418fd70a    # 17.98f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41700000    # 15.0f

    .line 650
    .line 651
    const v2, 0x417170a4    # 15.09f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 658
    .line 659
    const v2, 0x3ed1eb85    # 0.41f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x40000000    # 2.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x40600000    # 3.5f

    .line 671
    .line 672
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x417170a4    # 15.09f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    const/16 v16, 0x3800

    .line 689
    .line 690
    const/16 v17, 0x0

    .line 691
    .line 692
    const/high16 v6, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v7, 0x0

    .line 695
    const/high16 v12, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v14, 0x0

    .line 699
    const/4 v15, 0x0

    .line 700
    const-string v4, ""

    .line 701
    .line 702
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sput-object v0, Landroidx/compose/material/icons/rounded/AssistWalkerKt;->_assistWalker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 711
    .line 712
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    return-object v0
.end method
