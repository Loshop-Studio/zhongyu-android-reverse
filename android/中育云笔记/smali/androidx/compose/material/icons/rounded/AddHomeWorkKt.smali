.class public final Landroidx/compose/material/icons/rounded/AddHomeWorkKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addHomeWork:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddHomeWork(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddHomeWorkKt;->_addHomeWork:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddHomeWork"

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
    const v4, 0x416f5c29    # 14.96f

    .line 71
    .line 72
    .line 73
    const v6, 0x413b3333    # 11.7f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x40b33333    # -0.8f

    .line 80
    .line 81
    .line 82
    const v26, -0x4059999a    # -1.3f

    .line 83
    .line 84
    .line 85
    const v21, -0x4247ae14    # -0.09f

    .line 86
    .line 87
    .line 88
    const v22, -0x40fae148    # -0.52f

    .line 89
    .line 90
    .line 91
    const v23, -0x4147ae14    # -0.36f

    .line 92
    .line 93
    .line 94
    const v24, -0x40828f5c    # -0.99f

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
    const v4, -0x3f9b851f    # -3.57f

    .line 103
    .line 104
    .line 105
    const/high16 v6, -0x3f600000    # -5.0f

    .line 106
    .line 107
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v25, -0x3feb851f    # -2.32f

    .line 111
    .line 112
    .line 113
    const/16 v26, 0x0

    .line 114
    .line 115
    const v21, -0x40cccccd    # -0.7f

    .line 116
    .line 117
    .line 118
    const/high16 v22, -0x41000000    # -0.5f

    .line 119
    .line 120
    const v23, -0x402f5c29    # -1.63f

    .line 121
    .line 122
    .line 123
    const/high16 v24, -0x41000000    # -0.5f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x40647ae1    # 3.57f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const v26, 0x41407ae1    # 12.03f

    .line 137
    .line 138
    .line 139
    const v21, 0x3fa7ae14    # 1.31f

    .line 140
    .line 141
    .line 142
    const v22, 0x412c7ae1    # 10.78f

    .line 143
    .line 144
    .line 145
    const/high16 v23, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const v24, 0x4136147b    # 11.38f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41980000    # 19.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x40000000    # 2.0f

    .line 159
    .line 160
    const/high16 v26, 0x40000000    # 2.0f

    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x3f8ccccd    # 1.1f

    .line 165
    .line 166
    .line 167
    const v23, 0x3f666666    # 0.9f

    .line 168
    .line 169
    .line 170
    const/high16 v24, 0x40000000    # 2.0f

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40400000    # 3.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, -0x3f400000    # -6.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x40800000    # 4.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x3fd70a3d    # 1.68f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, 0x41300000    # 11.0f

    .line 202
    .line 203
    const/high16 v26, 0x41900000    # 18.0f

    .line 204
    .line 205
    const/high16 v21, 0x41340000    # 11.25f

    .line 206
    .line 207
    const v22, 0x41a0b852    # 20.09f

    .line 208
    .line 209
    .line 210
    const/high16 v23, 0x41300000    # 11.0f

    .line 211
    .line 212
    const v24, 0x4198a3d7    # 19.08f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x416f5c29    # 14.96f

    .line 219
    .line 220
    .line 221
    const v26, 0x413b3333    # 11.7f

    .line 222
    .line 223
    .line 224
    const/high16 v21, 0x41300000    # 11.0f

    .line 225
    .line 226
    const v22, 0x4173851f    # 15.22f

    .line 227
    .line 228
    .line 229
    const v23, 0x4149eb85    # 12.62f

    .line 230
    .line 231
    .line 232
    const v24, 0x414d47ae    # 12.83f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const/16 v16, 0x3800

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v8, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    const/high16 v9, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/high16 v12, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    const/4 v14, 0x0

    .line 260
    const/4 v15, 0x0

    .line 261
    const-string v4, ""

    .line 262
    .line 263
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const v4, 0x4151c28f    # 13.11f

    .line 294
    .line 295
    .line 296
    const/high16 v6, 0x41b80000    # 23.0f

    .line 297
    .line 298
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x409f0a3d    # 4.97f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, 0x41a83d71    # 21.03f

    .line 308
    .line 309
    .line 310
    const/high16 v26, 0x40400000    # 3.0f

    .line 311
    .line 312
    const/high16 v21, 0x41b80000    # 23.0f

    .line 313
    .line 314
    const v22, 0x407851ec    # 3.88f

    .line 315
    .line 316
    .line 317
    const v23, 0x41b0f5c3    # 22.12f

    .line 318
    .line 319
    .line 320
    const/high16 v24, 0x40400000    # 3.0f

    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, -0x3eef0a3d    # -9.06f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v25, 0x41200000    # 10.0f

    .line 334
    .line 335
    const v26, 0x409f0a3d    # 4.97f

    .line 336
    .line 337
    .line 338
    const v21, 0x412e147b    # 10.88f

    .line 339
    .line 340
    .line 341
    const/high16 v22, 0x40400000    # 3.0f

    .line 342
    .line 343
    const/high16 v23, 0x41200000    # 10.0f

    .line 344
    .line 345
    const v24, 0x407851ec    # 3.88f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, 0x3ca3d70a    # 0.02f

    .line 352
    .line 353
    .line 354
    const v6, 0x3d4ccccd    # 0.05f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, 0x3e99999a    # 0.3f

    .line 361
    .line 362
    .line 363
    const v26, 0x3e3851ec    # 0.18f

    .line 364
    .line 365
    .line 366
    const v21, 0x3dcccccd    # 0.1f

    .line 367
    .line 368
    .line 369
    const v22, 0x3d75c28f    # 0.06f

    .line 370
    .line 371
    .line 372
    const v23, 0x3e570a3d    # 0.21f

    .line 373
    .line 374
    .line 375
    const v24, 0x3de147ae    # 0.11f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x40647ae1    # 3.57f

    .line 382
    .line 383
    .line 384
    const/high16 v6, 0x40a00000    # 5.0f

    .line 385
    .line 386
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v25, 0x3fc7ae14    # 1.56f

    .line 390
    .line 391
    .line 392
    const v26, 0x40147ae1    # 2.32f

    .line 393
    .line 394
    .line 395
    const v21, 0x3f4a3d71    # 0.79f

    .line 396
    .line 397
    .line 398
    const v22, 0x3f0f5c29    # 0.56f

    .line 399
    .line 400
    .line 401
    const v23, 0x3fab851f    # 1.34f

    .line 402
    .line 403
    .line 404
    const v24, 0x3fb33333    # 1.4f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x41900000    # 18.0f

    .line 411
    .line 412
    const/high16 v26, 0x41300000    # 11.0f

    .line 413
    .line 414
    const/high16 v21, 0x418a0000    # 17.25f

    .line 415
    .line 416
    const v22, 0x4130a3d7    # 11.04f

    .line 417
    .line 418
    .line 419
    const v23, 0x418cf5c3    # 17.62f

    .line 420
    .line 421
    .line 422
    const/high16 v24, 0x41300000    # 11.0f

    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v25, 0x41b80000    # 23.0f

    .line 428
    .line 429
    const v26, 0x4151c28f    # 13.11f

    .line 430
    .line 431
    .line 432
    const v21, 0x419fae14    # 19.96f

    .line 433
    .line 434
    .line 435
    const/high16 v22, 0x41300000    # 11.0f

    .line 436
    .line 437
    const v23, 0x41add70a    # 21.73f

    .line 438
    .line 439
    .line 440
    const v24, 0x413cf5c3    # 11.81f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x41880000    # 17.0f

    .line 450
    .line 451
    const/high16 v6, 0x40e00000    # 7.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x40000000    # 2.0f

    .line 457
    .line 458
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, -0x40000000    # -2.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, 0x40e00000    # 7.0f

    .line 470
    .line 471
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v7, 0x0

    .line 484
    const-string v4, ""

    .line 485
    .line 486
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 487
    .line 488
    .line 489
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 494
    .line 495
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 496
    .line 497
    .line 498
    move-result-wide v6

    .line 499
    const/4 v0, 0x0

    .line 500
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41900000    # 18.0f

    .line 517
    .line 518
    const/high16 v2, 0x41b80000    # 23.0f

    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, -0x3f600000    # -5.0f

    .line 524
    .line 525
    const/high16 v18, -0x3f600000    # -5.0f

    .line 526
    .line 527
    const v14, -0x3fcf5c29    # -2.76f

    .line 528
    .line 529
    .line 530
    const v15, -0x3ff0a3d7    # -2.24f

    .line 531
    .line 532
    .line 533
    const/high16 v16, -0x3f600000    # -5.0f

    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x400f5c29    # 2.24f

    .line 539
    .line 540
    .line 541
    const/high16 v2, -0x3f600000    # -5.0f

    .line 542
    .line 543
    const/high16 v4, 0x40a00000    # 5.0f

    .line 544
    .line 545
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v2, 0x40a00000    # 5.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x41a6147b    # 20.76f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x41900000    # 18.0f

    .line 557
    .line 558
    const/high16 v4, 0x41b80000    # 23.0f

    .line 559
    .line 560
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x418c0000    # 17.5f

    .line 567
    .line 568
    const/high16 v2, 0x41a80000    # 21.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41700000    # 15.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, -0x40800000    # -1.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x40200000    # 2.5f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41700000    # 15.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x3f800000    # 1.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x40200000    # 2.5f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41a80000    # 21.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, 0x3f800000    # 1.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x41a80000    # 21.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x418c0000    # 17.5f

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const/16 v16, 0x3800

    .line 641
    .line 642
    const/16 v17, 0x0

    .line 643
    .line 644
    const/high16 v6, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v12, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v14, 0x0

    .line 650
    const/4 v15, 0x0

    .line 651
    const-string v4, ""

    .line 652
    .line 653
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    sput-object v0, Landroidx/compose/material/icons/rounded/AddHomeWorkKt;->_addHomeWork:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 662
    .line 663
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    return-object v0
.end method
