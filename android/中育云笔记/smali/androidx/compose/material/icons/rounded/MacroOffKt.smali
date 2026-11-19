.class public final Landroidx/compose/material/icons/rounded/MacroOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMacroOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MacroOff"

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
    const v4, 0x40866666    # 4.2f

    .line 71
    .line 72
    .line 73
    const v6, 0x415147ae    # 13.08f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x4070a3d7    # -1.12f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f8f5c29    # 1.12f

    .line 83
    .line 84
    .line 85
    const v21, -0x40dc28f6    # -0.64f

    .line 86
    .line 87
    .line 88
    const v22, -0x4247ae14    # -0.09f

    .line 89
    .line 90
    .line 91
    const v23, -0x40651eb8    # -1.21f

    .line 92
    .line 93
    .line 94
    const v24, 0x3ef5c28f    # 0.48f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41400000    # 12.0f

    .line 103
    .line 104
    const/high16 v26, 0x41b00000    # 22.0f

    .line 105
    .line 106
    const v21, 0x406ae148    # 3.67f

    .line 107
    .line 108
    .line 109
    const v22, 0x4194cccd    # 18.6f

    .line 110
    .line 111
    .line 112
    const v23, 0x40ee147b    # 7.44f

    .line 113
    .line 114
    .line 115
    const/high16 v24, 0x41b00000    # 22.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x40866666    # 4.2f

    .line 121
    .line 122
    .line 123
    const v26, 0x415147ae    # 13.08f

    .line 124
    .line 125
    .line 126
    const/high16 v21, 0x41400000    # 12.0f

    .line 127
    .line 128
    const v22, 0x418b851f    # 17.44f

    .line 129
    .line 130
    .line 131
    const v23, 0x4109999a    # 8.6f

    .line 132
    .line 133
    .line 134
    const v24, 0x415ab852    # 13.67f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v16, 0x3800

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/high16 v6, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41400000    # 12.0f

    .line 196
    .line 197
    const/high16 v6, 0x40b00000    # 5.5f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x40200000    # 2.5f

    .line 203
    .line 204
    const/high16 v26, 0x40200000    # 2.5f

    .line 205
    .line 206
    const v21, 0x3fb0a3d7    # 1.38f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/high16 v23, 0x40200000    # 2.5f

    .line 212
    .line 213
    const v24, 0x3f8f5c29    # 1.12f

    .line 214
    .line 215
    .line 216
    move-object/from16 v20, v2

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x404a3d71    # -1.42f

    .line 222
    .line 223
    .line 224
    const/high16 v26, 0x40100000    # 2.25f

    .line 225
    .line 226
    const/16 v21, 0x0

    .line 227
    .line 228
    const v22, 0x3f7d70a4    # 0.99f

    .line 229
    .line 230
    .line 231
    const v23, -0x40eb851f    # -0.58f

    .line 232
    .line 233
    .line 234
    const v24, 0x3feb851f    # 1.84f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x401eb852    # 2.48f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, 0x3eb33333    # 0.35f

    .line 247
    .line 248
    .line 249
    const v26, 0x3cf5c28f    # 0.03f

    .line 250
    .line 251
    .line 252
    const v21, 0x3de147ae    # 0.11f

    .line 253
    .line 254
    .line 255
    const v22, 0x3ca3d70a    # 0.02f

    .line 256
    .line 257
    .line 258
    const v23, 0x3e6b851f    # 0.23f

    .line 259
    .line 260
    .line 261
    const v24, 0x3cf5c28f    # 0.03f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v25, 0x40200000    # 2.5f

    .line 268
    .line 269
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 270
    .line 271
    const v21, 0x3fb0a3d7    # 1.38f

    .line 272
    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    const/high16 v23, 0x40200000    # 2.5f

    .line 277
    .line 278
    const v24, -0x4070a3d7    # -1.12f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, -0x4048f5c3    # -1.43f

    .line 285
    .line 286
    .line 287
    const/high16 v26, -0x3ff00000    # -2.25f

    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const/high16 v22, -0x40800000    # -1.0f

    .line 292
    .line 293
    const v23, -0x40e8f5c3    # -0.59f

    .line 294
    .line 295
    .line 296
    const v24, -0x40133333    # -1.85f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, 0x3fb70a3d    # 1.43f

    .line 303
    .line 304
    .line 305
    const v21, 0x3f570a3d    # 0.84f

    .line 306
    .line 307
    .line 308
    const v22, -0x41333333    # -0.4f

    .line 309
    .line 310
    .line 311
    const v23, 0x3fb70a3d    # 1.43f

    .line 312
    .line 313
    .line 314
    const/high16 v24, -0x40600000    # -1.25f

    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 320
    .line 321
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 322
    .line 323
    const/16 v21, 0x0

    .line 324
    .line 325
    const v22, -0x404f5c29    # -1.38f

    .line 326
    .line 327
    .line 328
    const v23, -0x4070a3d7    # -1.12f

    .line 329
    .line 330
    .line 331
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x404a3d71    # -1.42f

    .line 337
    .line 338
    .line 339
    const v26, 0x3ee147ae    # 0.44f

    .line 340
    .line 341
    .line 342
    const v21, -0x40f851ec    # -0.53f

    .line 343
    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const v23, -0x407eb852    # -1.01f

    .line 348
    .line 349
    .line 350
    const v24, 0x3e23d70a    # 0.16f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x41680000    # 14.5f

    .line 357
    .line 358
    const/high16 v6, 0x40600000    # 3.5f

    .line 359
    .line 360
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x41400000    # 12.0f

    .line 364
    .line 365
    const/high16 v26, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v21, 0x41680000    # 14.5f

    .line 368
    .line 369
    const v22, 0x4007ae14    # 2.12f

    .line 370
    .line 371
    .line 372
    const v23, 0x4156147b    # 13.38f

    .line 373
    .line 374
    .line 375
    const/high16 v24, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x4007ae14    # 2.12f

    .line 381
    .line 382
    .line 383
    const/high16 v7, 0x41180000    # 9.5f

    .line 384
    .line 385
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, 0x3e428f5c    # 0.19f

    .line 389
    .line 390
    .line 391
    const v6, 0x3ca3d70a    # 0.02f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v25, 0x4101999a    # 8.1f

    .line 398
    .line 399
    .line 400
    const/high16 v26, 0x40500000    # 3.25f

    .line 401
    .line 402
    const v21, 0x4111eb85    # 9.12f

    .line 403
    .line 404
    .line 405
    const v22, 0x405a3d71    # 3.41f

    .line 406
    .line 407
    .line 408
    const v23, 0x410a147b    # 8.63f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x40500000    # 3.25f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v25, -0x403eb852    # -1.51f

    .line 417
    .line 418
    .line 419
    const v26, 0x3f051eb8    # 0.52f

    .line 420
    .line 421
    .line 422
    const v21, -0x40ee147b    # -0.57f

    .line 423
    .line 424
    .line 425
    const/16 v22, 0x0

    .line 426
    .line 427
    const v23, -0x40747ae1    # -1.09f

    .line 428
    .line 429
    .line 430
    const v24, 0x3e4ccccd    # 0.2f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x404a3d71    # 3.16f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v25, 0x41400000    # 12.0f

    .line 443
    .line 444
    const/high16 v26, 0x40b00000    # 5.5f

    .line 445
    .line 446
    const v21, 0x41228f5c    # 10.16f

    .line 447
    .line 448
    .line 449
    const v22, 0x40c28f5c    # 6.08f

    .line 450
    .line 451
    .line 452
    const v23, 0x413028f6    # 11.01f

    .line 453
    .line 454
    .line 455
    const/high16 v24, 0x40b00000    # 5.5f

    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    const/high16 v6, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const-string v4, ""

    .line 471
    .line 472
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 473
    .line 474
    .line 475
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 480
    .line 481
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 482
    .line 483
    .line 484
    move-result-wide v6

    .line 485
    const/4 v2, 0x0

    .line 486
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 494
    .line 495
    .line 496
    move-result v11

    .line 497
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 500
    .line 501
    .line 502
    const v4, 0x41893333    # 17.15f

    .line 503
    .line 504
    .line 505
    const v6, 0x419fd70a    # 19.98f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v25, 0x3f70a3d7    # 0.94f

    .line 512
    .line 513
    .line 514
    const v26, -0x3fc33333    # -2.95f

    .line 515
    .line 516
    .line 517
    const v21, 0x3ef0a3d7    # 0.47f

    .line 518
    .line 519
    .line 520
    const v22, -0x40970a3d    # -0.91f

    .line 521
    .line 522
    .line 523
    const v23, 0x3f4ccccd    # 0.8f

    .line 524
    .line 525
    .line 526
    const v24, -0x400ccccd    # -1.9f

    .line 527
    .line 528
    .line 529
    move-object/from16 v20, v2

    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v25, -0x4070a3d7    # -1.12f

    .line 535
    .line 536
    .line 537
    const v26, -0x4070a3d7    # -1.12f

    .line 538
    .line 539
    .line 540
    const v21, 0x3db851ec    # 0.09f

    .line 541
    .line 542
    .line 543
    const v22, -0x40dc28f6    # -0.64f

    .line 544
    .line 545
    .line 546
    const v23, -0x410a3d71    # -0.48f

    .line 547
    .line 548
    .line 549
    const v24, -0x40651eb8    # -1.21f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v25, -0x3fc33333    # -2.95f

    .line 556
    .line 557
    .line 558
    const v26, 0x3f70a3d7    # 0.94f

    .line 559
    .line 560
    .line 561
    const v21, -0x4079999a    # -1.05f

    .line 562
    .line 563
    .line 564
    const v22, 0x3e0f5c29    # 0.14f

    .line 565
    .line 566
    .line 567
    const v23, -0x3ffccccd    # -2.05f

    .line 568
    .line 569
    .line 570
    const v24, 0x3ef0a3d7    # 0.47f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/high16 v6, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v7, 0x0

    .line 589
    const-string v4, ""

    .line 590
    .line 591
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 592
    .line 593
    .line 594
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 599
    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 601
    .line 602
    .line 603
    move-result-wide v6

    .line 604
    const/4 v0, 0x0

    .line 605
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 619
    .line 620
    .line 621
    const v0, 0x40066666    # 2.1f

    .line 622
    .line 623
    .line 624
    const v2, 0x4060a3d7    # 3.51f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const v18, 0x3fb47ae1    # 1.41f

    .line 636
    .line 637
    .line 638
    const v13, -0x413851ec    # -0.39f

    .line 639
    .line 640
    .line 641
    const v14, 0x3ec7ae14    # 0.39f

    .line 642
    .line 643
    .line 644
    const v15, -0x413851ec    # -0.39f

    .line 645
    .line 646
    .line 647
    const v16, 0x3f828f5c    # 1.02f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x407b851f    # 3.93f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, -0x413d70a4    # -0.38f

    .line 660
    .line 661
    .line 662
    const v18, 0x3ff1eb85    # 1.89f

    .line 663
    .line 664
    .line 665
    const v13, -0x414ccccd    # -0.35f

    .line 666
    .line 667
    .line 668
    const v14, 0x3f051eb8    # 0.52f

    .line 669
    .line 670
    .line 671
    const v15, -0x40f851ec    # -0.53f

    .line 672
    .line 673
    .line 674
    const v16, 0x3f95c28f    # 1.17f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v17, 0x401a3d71    # 2.41f

    .line 681
    .line 682
    .line 683
    const/high16 v18, 0x40000000    # 2.0f

    .line 684
    .line 685
    const v13, 0x3e6147ae    # 0.22f

    .line 686
    .line 687
    .line 688
    const v14, 0x3f90a3d7    # 1.13f

    .line 689
    .line 690
    .line 691
    const v15, 0x3fa147ae    # 1.26f

    .line 692
    .line 693
    .line 694
    const v16, 0x3ffd70a4    # 1.98f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, 0x3fb851ec    # 1.44f

    .line 701
    .line 702
    .line 703
    const v18, -0x4123d70a    # -0.43f

    .line 704
    .line 705
    .line 706
    const v13, 0x3f0a3d71    # 0.54f

    .line 707
    .line 708
    .line 709
    const v14, 0x3c23d70a    # 0.01f

    .line 710
    .line 711
    .line 712
    const v15, 0x3f828f5c    # 1.02f

    .line 713
    .line 714
    .line 715
    const v16, -0x41e66666    # -0.15f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x3ca3d70a    # 0.02f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x41480000    # 12.5f

    .line 728
    .line 729
    const/high16 v2, 0x41180000    # 9.5f

    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v17, 0x40200000    # 2.5f

    .line 735
    .line 736
    const/high16 v18, 0x40200000    # 2.5f

    .line 737
    .line 738
    const/4 v13, 0x0

    .line 739
    const v14, 0x3fb0a3d7    # 1.38f

    .line 740
    .line 741
    .line 742
    const v15, 0x3f8f5c29    # 1.12f

    .line 743
    .line 744
    .line 745
    const/high16 v16, 0x40200000    # 2.5f

    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, 0x3e23d70a    # 0.16f

    .line 751
    .line 752
    .line 753
    const v18, -0x435c28f6    # -0.02f

    .line 754
    .line 755
    .line 756
    const v13, 0x3d4ccccd    # 0.05f

    .line 757
    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    const v15, 0x3dcccccd    # 0.1f

    .line 761
    .line 762
    .line 763
    const v16, -0x43dc28f6    # -0.01f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3fd1eb85    # 1.64f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v17, 0x41400000    # 12.0f

    .line 776
    .line 777
    const/high16 v18, 0x41b00000    # 22.0f

    .line 778
    .line 779
    const v13, 0x414ab852    # 12.67f

    .line 780
    .line 781
    .line 782
    const v14, 0x4190f5c3    # 18.12f

    .line 783
    .line 784
    .line 785
    const/high16 v15, 0x41400000    # 12.0f

    .line 786
    .line 787
    const v16, 0x419fd70a    # 19.98f

    .line 788
    .line 789
    .line 790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v17, 0x40ac28f6    # 5.38f

    .line 794
    .line 795
    .line 796
    const v18, -0x401ae148    # -1.79f

    .line 797
    .line 798
    .line 799
    const v13, 0x400147ae    # 2.02f

    .line 800
    .line 801
    .line 802
    const/4 v14, 0x0

    .line 803
    const v15, 0x407851ec    # 3.88f

    .line 804
    .line 805
    .line 806
    const v16, -0x40d47ae1    # -0.67f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, 0x3fd851ec    # 1.69f

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v17, 0x3fb47ae1    # 1.41f

    .line 819
    .line 820
    .line 821
    const/16 v18, 0x0

    .line 822
    .line 823
    const v13, 0x3ec7ae14    # 0.39f

    .line 824
    .line 825
    .line 826
    const v14, 0x3ec7ae14    # 0.39f

    .line 827
    .line 828
    .line 829
    const v15, 0x3f828f5c    # 1.02f

    .line 830
    .line 831
    .line 832
    const v16, 0x3ec7ae14    # 0.39f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/4 v0, 0x0

    .line 839
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/16 v17, 0x0

    .line 843
    .line 844
    const v18, -0x404b851f    # -1.41f

    .line 845
    .line 846
    .line 847
    const v14, -0x413851ec    # -0.39f

    .line 848
    .line 849
    .line 850
    const v15, 0x3ec7ae14    # 0.39f

    .line 851
    .line 852
    .line 853
    const v16, -0x407d70a4    # -1.02f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v0, 0x4060a3d7    # 3.51f

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v17, 0x40066666    # 2.1f

    .line 866
    .line 867
    .line 868
    const v18, 0x4060a3d7    # 3.51f

    .line 869
    .line 870
    .line 871
    const v13, 0x4047ae14    # 3.12f

    .line 872
    .line 873
    .line 874
    const v14, 0x4047ae14    # 3.12f

    .line 875
    .line 876
    .line 877
    const v15, 0x401f5c29    # 2.49f

    .line 878
    .line 879
    .line 880
    const v16, 0x4047ae14    # 3.12f

    .line 881
    .line 882
    .line 883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    const/16 v16, 0x3800

    .line 894
    .line 895
    const/16 v17, 0x0

    .line 896
    .line 897
    const/high16 v6, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v7, 0x0

    .line 900
    const/high16 v12, 0x3f800000    # 1.0f

    .line 901
    .line 902
    const/4 v13, 0x0

    .line 903
    const/4 v14, 0x0

    .line 904
    const/4 v15, 0x0

    .line 905
    const-string v4, ""

    .line 906
    .line 907
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    sput-object v0, Landroidx/compose/material/icons/rounded/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 916
    .line 917
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    return-object v0
.end method
