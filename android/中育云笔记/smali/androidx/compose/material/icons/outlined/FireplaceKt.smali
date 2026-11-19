.class public final Landroidx/compose/material/icons/outlined/FireplaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireplace(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Fireplace"

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
    const v4, 0x414028f6    # 12.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x41475c29    # 12.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x425c28f6    # -0.08f

    .line 80
    .line 81
    .line 82
    const v26, 0x3fa3d70a    # 1.28f

    .line 83
    .line 84
    .line 85
    const v21, -0x41e66666    # -0.15f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ed70a3d    # 0.42f

    .line 89
    .line 90
    .line 91
    const v23, -0x41e66666    # -0.15f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f51eb85    # 0.82f

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
    const v25, 0x3e4ccccd    # 0.2f

    .line 103
    .line 104
    .line 105
    const v26, 0x3fcccccd    # 1.6f

    .line 106
    .line 107
    .line 108
    const v21, 0x3dcccccd    # 0.1f

    .line 109
    .line 110
    .line 111
    const v22, 0x3f0ccccd    # 0.55f

    .line 112
    .line 113
    .line 114
    const v23, 0x3ea8f5c3    # 0.33f

    .line 115
    .line 116
    .line 117
    const v24, 0x3f851eb8    # 1.04f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x403c28f6    # -1.53f

    .line 124
    .line 125
    .line 126
    const v26, 0x3fd0a3d7    # 1.63f

    .line 127
    .line 128
    .line 129
    const v21, -0x41fae148    # -0.13f

    .line 130
    .line 131
    .line 132
    const v22, 0x3f170a3d    # 0.59f

    .line 133
    .line 134
    .line 135
    const v23, -0x40bae148    # -0.77f

    .line 136
    .line 137
    .line 138
    const v24, 0x3fb0a3d7    # 1.38f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x4058f5c3    # 3.39f

    .line 145
    .line 146
    .line 147
    const v26, -0x40570a3d    # -1.32f

    .line 148
    .line 149
    .line 150
    const v21, 0x3fa3d70a    # 1.28f

    .line 151
    .line 152
    .line 153
    const v22, 0x3f866666    # 1.05f

    .line 154
    .line 155
    .line 156
    const v23, 0x404ccccd    # 3.2f

    .line 157
    .line 158
    .line 159
    const v24, 0x3ebd70a4    # 0.37f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x414028f6    # 12.01f

    .line 166
    .line 167
    .line 168
    const v26, 0x41475c29    # 12.46f

    .line 169
    .line 170
    .line 171
    const v21, 0x41628f5c    # 14.16f

    .line 172
    .line 173
    .line 174
    const v22, 0x4161c28f    # 14.11f

    .line 175
    .line 176
    .line 177
    const v23, 0x4148cccd    # 12.55f

    .line 178
    .line 179
    .line 180
    const v24, 0x415ab852    # 13.67f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    const/16 v16, 0x3800

    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const/high16 v6, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/high16 v8, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v7, 0x0

    .line 202
    const/high16 v9, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/high16 v12, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const-string v4, ""

    .line 210
    .line 211
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 219
    .line 220
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x40000000    # 2.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x41a00000    # 20.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41400000    # 12.0f

    .line 266
    .line 267
    const/high16 v2, 0x41900000    # 18.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 273
    .line 274
    const v18, -0x3fbc28f6    # -3.06f

    .line 275
    .line 276
    .line 277
    const v13, -0x4035c28f    # -1.58f

    .line 278
    .line 279
    .line 280
    const v15, -0x3fc1eb85    # -2.97f

    .line 281
    .line 282
    .line 283
    const v16, -0x400f5c29    # -1.88f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x43dc28f6    # -0.01f

    .line 290
    .line 291
    .line 292
    const v18, -0x419eb852    # -0.22f

    .line 293
    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, -0x42b33333    # -0.05f

    .line 297
    .line 298
    .line 299
    const v15, -0x43dc28f6    # -0.01f

    .line 300
    .line 301
    .line 302
    const v16, -0x41fae148    # -0.13f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x401e147b    # 2.47f

    .line 309
    .line 310
    .line 311
    const v18, -0x3f7428f6    # -4.37f

    .line 312
    .line 313
    .line 314
    const v13, -0x41fae148    # -0.13f

    .line 315
    .line 316
    .line 317
    const v14, -0x40228f5c    # -1.73f

    .line 318
    .line 319
    .line 320
    const/high16 v15, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const v16, -0x3fb33333    # -3.2f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x40247ae1    # 2.57f

    .line 329
    .line 330
    .line 331
    const v18, 0x403ae148    # 2.92f

    .line 332
    .line 333
    .line 334
    const v13, 0x3ef0a3d7    # 0.47f

    .line 335
    .line 336
    .line 337
    const v14, 0x3f8147ae    # 1.01f

    .line 338
    .line 339
    .line 340
    const v15, 0x3fa28f5c    # 1.27f

    .line 341
    .line 342
    .line 343
    const v16, 0x4001eb85    # 2.03f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41700000    # 15.0f

    .line 350
    .line 351
    const/high16 v18, 0x41700000    # 15.0f

    .line 352
    .line 353
    const v13, 0x4169c28f    # 14.61f

    .line 354
    .line 355
    .line 356
    const v14, 0x415b0a3d    # 13.69f

    .line 357
    .line 358
    .line 359
    const/high16 v15, 0x41700000    # 15.0f

    .line 360
    .line 361
    const v16, 0x4162147b    # 14.13f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x41400000    # 12.0f

    .line 368
    .line 369
    const/high16 v18, 0x41900000    # 18.0f

    .line 370
    .line 371
    const/high16 v13, 0x41700000    # 15.0f

    .line 372
    .line 373
    const v14, 0x41853333    # 16.65f

    .line 374
    .line 375
    .line 376
    const v15, 0x415a6666    # 13.65f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x41900000    # 18.0f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41a00000    # 20.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, -0x40000000    # -2.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x3ffeb852    # -2.02f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x3f828f5c    # 1.02f

    .line 407
    .line 408
    .line 409
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 410
    .line 411
    const v13, 0x3f2147ae    # 0.63f

    .line 412
    .line 413
    .line 414
    const v14, -0x40a8f5c3    # -0.84f

    .line 415
    .line 416
    .line 417
    const v15, 0x3f828f5c    # 1.02f

    .line 418
    .line 419
    .line 420
    const v16, -0x4010a3d7    # -1.87f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, -0x40133333    # -1.85f

    .line 427
    .line 428
    .line 429
    const v18, -0x3fa851ec    # -3.37f

    .line 430
    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const v14, -0x400e147b    # -1.89f

    .line 434
    .line 435
    .line 436
    const v15, -0x40747ae1    # -1.09f

    .line 437
    .line 438
    .line 439
    const v16, -0x3fc9999a    # -2.85f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x41500000    # 13.0f

    .line 446
    .line 447
    const/high16 v18, 0x40e00000    # 7.0f

    .line 448
    .line 449
    const v13, 0x41433333    # 12.2f

    .line 450
    .line 451
    .line 452
    const v14, 0x4119c28f    # 9.61f

    .line 453
    .line 454
    .line 455
    const/high16 v15, 0x41500000    # 13.0f

    .line 456
    .line 457
    const/high16 v16, 0x40e00000    # 7.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, -0x3f400000    # -6.0f

    .line 463
    .line 464
    const/high16 v18, 0x41000000    # 8.0f

    .line 465
    .line 466
    const v13, -0x3f28a3d7    # -6.73f

    .line 467
    .line 468
    .line 469
    const v14, 0x40647ae1    # 3.57f

    .line 470
    .line 471
    .line 472
    const v15, -0x3f3f5c29    # -6.02f

    .line 473
    .line 474
    .line 475
    const v16, 0x40ef0a3d    # 7.47f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x3f9d70a4    # 1.23f

    .line 482
    .line 483
    .line 484
    const/high16 v18, 0x40400000    # 3.0f

    .line 485
    .line 486
    const v13, 0x3cf5c28f    # 0.03f

    .line 487
    .line 488
    .line 489
    const v14, 0x3f75c28f    # 0.96f

    .line 490
    .line 491
    .line 492
    const v15, 0x3efae148    # 0.49f

    .line 493
    .line 494
    .line 495
    const v16, 0x40047ae1    # 2.07f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, 0x40c00000    # 6.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x40000000    # 2.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x40800000    # 4.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41800000    # 16.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41a00000    # 20.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    const/16 v16, 0x3800

    .line 537
    .line 538
    const/16 v17, 0x0

    .line 539
    .line 540
    const/high16 v6, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/4 v7, 0x0

    .line 543
    const/high16 v12, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const/4 v14, 0x0

    .line 547
    const/4 v15, 0x0

    .line 548
    const-string v4, ""

    .line 549
    .line 550
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    sput-object v0, Landroidx/compose/material/icons/outlined/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-object v0
.end method
