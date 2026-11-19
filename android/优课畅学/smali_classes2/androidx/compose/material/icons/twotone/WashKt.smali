.class public final Landroidx/compose/material/icons/twotone/WashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWash(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Wash"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v21, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40800000    # -1.0f

    .line 92
    .line 93
    const v24, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, -0x3f400000    # -6.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x3eb851ec    # 0.36f

    .line 107
    .line 108
    .line 109
    const/high16 v26, -0x40c00000    # -0.75f

    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const v22, -0x413851ec    # -0.39f

    .line 114
    .line 115
    .line 116
    const v23, 0x3e6b851f    # 0.23f

    .line 117
    .line 118
    .line 119
    const v24, -0x40dc28f6    # -0.64f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x411deb85    # 9.87f

    .line 126
    .line 127
    .line 128
    const/high16 v6, 0x40e00000    # 7.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41400000    # 12.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/high16 v6, 0x40400000    # 3.0f

    .line 140
    .line 141
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x41a80000    # 21.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40d00000    # 6.5f

    .line 153
    .line 154
    const/high16 v6, 0x41940000    # 18.5f

    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, -0x40800000    # -1.0f

    .line 160
    .line 161
    const/high16 v26, -0x40800000    # -1.0f

    .line 162
    .line 163
    const v21, -0x40f33333    # -0.55f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/high16 v23, -0x40800000    # -1.0f

    .line 169
    .line 170
    const v24, -0x4119999a    # -0.45f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const v26, -0x3ffccccd    # -2.05f

    .line 179
    .line 180
    .line 181
    const/16 v21, 0x0

    .line 182
    .line 183
    const v22, -0x41333333    # -0.4f

    .line 184
    .line 185
    .line 186
    const v23, 0x3edc28f6    # 0.43f

    .line 187
    .line 188
    .line 189
    const v24, -0x4063d70a    # -1.22f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v26, 0x40033333    # 2.05f

    .line 196
    .line 197
    .line 198
    const v21, 0x3f11eb85    # 0.57f

    .line 199
    .line 200
    .line 201
    const v22, 0x3f547ae1    # 0.83f

    .line 202
    .line 203
    .line 204
    const/high16 v23, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const v24, 0x3fd33333    # 1.65f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, 0x41940000    # 18.5f

    .line 213
    .line 214
    const/high16 v26, 0x40d00000    # 6.5f

    .line 215
    .line 216
    const/high16 v21, 0x419c0000    # 19.5f

    .line 217
    .line 218
    const v22, 0x40c1999a    # 6.05f

    .line 219
    .line 220
    .line 221
    const v23, 0x41986666    # 19.05f

    .line 222
    .line 223
    .line 224
    const/high16 v24, 0x40d00000    # 6.5f

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const/16 v16, 0x3800

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const v6, 0x3e99999a    # 0.3f

    .line 241
    .line 242
    .line 243
    const v8, 0x3e99999a    # 0.3f

    .line 244
    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const-string v4, ""

    .line 255
    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    const/4 v0, 0x0

    .line 270
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x41800000    # 16.0f

    .line 287
    .line 288
    const/high16 v2, 0x41a60000    # 20.75f

    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 294
    .line 295
    const/high16 v18, -0x40600000    # -1.25f

    .line 296
    .line 297
    const v13, 0x3f30a3d7    # 0.69f

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 301
    .line 302
    const v16, -0x40f0a3d7    # -0.56f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x40f0a3d7    # -0.56f

    .line 309
    .line 310
    .line 311
    const/high16 v2, -0x40600000    # -1.25f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41400000    # 12.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, -0x40800000    # -1.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x40d80000    # 6.75f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x4068f5c3    # -1.18f

    .line 335
    .line 336
    .line 337
    const v18, -0x406147ae    # -1.24f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, -0x40d47ae1    # -0.67f

    .line 342
    .line 343
    .line 344
    const v15, -0x40f851ec    # -0.53f

    .line 345
    .line 346
    .line 347
    const v16, -0x40666666    # -1.2f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x410deb85    # 8.87f

    .line 354
    .line 355
    .line 356
    const/high16 v2, 0x41200000    # 10.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x3fbd70a4    # 1.48f

    .line 362
    .line 363
    .line 364
    const v2, -0x3fd9999a    # -2.6f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3e0f5c29    # 0.14f

    .line 371
    .line 372
    .line 373
    const v18, -0x40f5c28f    # -0.54f

    .line 374
    .line 375
    .line 376
    const v13, 0x3db851ec    # 0.09f

    .line 377
    .line 378
    .line 379
    const v14, -0x41d1eb85    # -0.17f

    .line 380
    .line 381
    .line 382
    const v15, 0x3e0f5c29    # 0.14f

    .line 383
    .line 384
    .line 385
    const v16, -0x4151eb85    # -0.34f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x417ae148    # -0.26f

    .line 392
    .line 393
    .line 394
    const v18, -0x40cccccd    # -0.7f

    .line 395
    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, -0x417ae148    # -0.26f

    .line 399
    .line 400
    .line 401
    const v15, -0x4247ae14    # -0.09f

    .line 402
    .line 403
    .line 404
    const/high16 v16, -0x41000000    # -0.5f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x4111eb85    # 9.12f

    .line 410
    .line 411
    .line 412
    const/high16 v2, 0x40a00000    # 5.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x3f1a3d71    # -7.18f

    .line 418
    .line 419
    .line 420
    const v2, 0x40d9999a    # 6.8f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const v18, 0x415f851f    # 13.97f

    .line 429
    .line 430
    .line 431
    const v13, 0x3fab851f    # 1.34f

    .line 432
    .line 433
    .line 434
    const v14, 0x4145c28f    # 12.36f

    .line 435
    .line 436
    .line 437
    const/high16 v15, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const v16, 0x41526666    # 13.15f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41a00000    # 20.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x40400000    # 3.0f

    .line 451
    .line 452
    const/high16 v18, 0x40400000    # 3.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3fd47ae1    # 1.66f

    .line 456
    .line 457
    .line 458
    const v15, 0x3fab851f    # 1.34f

    .line 459
    .line 460
    .line 461
    const/high16 v16, 0x40400000    # 3.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x415c0000    # 13.75f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 472
    .line 473
    const/high16 v18, -0x40600000    # -1.25f

    .line 474
    .line 475
    const v13, 0x3f30a3d7    # 0.69f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 480
    .line 481
    const v16, -0x40f0a3d7    # -0.56f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x40f0a3d7    # -0.56f

    .line 488
    .line 489
    .line 490
    const/high16 v2, -0x40600000    # -1.25f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x41400000    # 12.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, -0x40800000    # -1.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40f80000    # 7.75f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x41a3851f    # 20.44f

    .line 514
    .line 515
    .line 516
    const/high16 v2, 0x419e0000    # 19.75f

    .line 517
    .line 518
    const/high16 v4, 0x41880000    # 17.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41400000    # 12.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, -0x40800000    # -1.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x41a60000    # 20.75f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41200000    # 10.0f

    .line 542
    .line 543
    const/high16 v2, 0x41a80000    # 21.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x40800000    # 4.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v17, -0x40800000    # -1.0f

    .line 554
    .line 555
    const/high16 v18, -0x40800000    # -1.0f

    .line 556
    .line 557
    const v13, -0x40f33333    # -0.55f

    .line 558
    .line 559
    .line 560
    const/high16 v15, -0x40800000    # -1.0f

    .line 561
    .line 562
    const v16, -0x4119999a    # -0.45f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, -0x3f400000    # -6.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x3eb851ec    # 0.36f

    .line 574
    .line 575
    .line 576
    const/high16 v18, -0x40c00000    # -0.75f

    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const v14, -0x413851ec    # -0.39f

    .line 580
    .line 581
    .line 582
    const v15, 0x3e6b851f    # 0.23f

    .line 583
    .line 584
    .line 585
    const v16, -0x40dc28f6    # -0.64f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x411deb85    # 9.87f

    .line 592
    .line 593
    .line 594
    const/high16 v2, 0x40e00000    # 7.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x41400000    # 12.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/4 v0, 0x0

    .line 605
    const/high16 v2, 0x40400000    # 3.0f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41a80000    # 21.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41580000    # 13.5f

    .line 619
    .line 620
    const/high16 v2, 0x41100000    # 9.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x41700000    # 15.0f

    .line 626
    .line 627
    const/high16 v18, 0x40f00000    # 7.5f

    .line 628
    .line 629
    const v13, 0x416547ae    # 14.33f

    .line 630
    .line 631
    .line 632
    const/high16 v14, 0x41100000    # 9.0f

    .line 633
    .line 634
    const/high16 v15, 0x41700000    # 15.0f

    .line 635
    .line 636
    const v16, 0x410547ae    # 8.33f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, 0x41580000    # 13.5f

    .line 643
    .line 644
    const/high16 v18, 0x40a00000    # 5.0f

    .line 645
    .line 646
    const/high16 v13, 0x41700000    # 15.0f

    .line 647
    .line 648
    const v14, 0x40d51eb8    # 6.66f

    .line 649
    .line 650
    .line 651
    const/high16 v15, 0x41580000    # 13.5f

    .line 652
    .line 653
    const/high16 v16, 0x40a00000    # 5.0f

    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x40d51eb8    # 6.66f

    .line 659
    .line 660
    .line 661
    const/high16 v2, 0x40f00000    # 7.5f

    .line 662
    .line 663
    const/high16 v4, 0x41400000    # 12.0f

    .line 664
    .line 665
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v18, 0x41100000    # 9.0f

    .line 669
    .line 670
    const/high16 v13, 0x41400000    # 12.0f

    .line 671
    .line 672
    const v14, 0x410547ae    # 8.33f

    .line 673
    .line 674
    .line 675
    const v15, 0x414ab852    # 12.67f

    .line 676
    .line 677
    .line 678
    const/high16 v16, 0x41100000    # 9.0f

    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/high16 v2, 0x41940000    # 18.5f

    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 694
    .line 695
    const/high16 v18, 0x40900000    # 4.5f

    .line 696
    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v14, 0x0

    .line 699
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 700
    .line 701
    const v16, 0x40351eb8    # 2.83f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, 0x41940000    # 18.5f

    .line 708
    .line 709
    const/high16 v18, 0x41000000    # 8.0f

    .line 710
    .line 711
    const/high16 v13, 0x41800000    # 16.0f

    .line 712
    .line 713
    const v14, 0x40dc28f6    # 6.88f

    .line 714
    .line 715
    .line 716
    const v15, 0x4188f5c3    # 17.12f

    .line 717
    .line 718
    .line 719
    const/high16 v16, 0x41000000    # 8.0f

    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, 0x40dc28f6    # 6.88f

    .line 725
    .line 726
    .line 727
    const/high16 v2, 0x40b00000    # 5.5f

    .line 728
    .line 729
    const/high16 v4, 0x41a80000    # 21.0f

    .line 730
    .line 731
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v18, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/high16 v13, 0x41a80000    # 21.0f

    .line 737
    .line 738
    const v14, 0x40751eb8    # 3.83f

    .line 739
    .line 740
    .line 741
    const/high16 v15, 0x41940000    # 18.5f

    .line 742
    .line 743
    const/high16 v16, 0x3f800000    # 1.0f

    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v0, 0x40d00000    # 6.5f

    .line 752
    .line 753
    const/high16 v2, 0x41940000    # 18.5f

    .line 754
    .line 755
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, -0x40800000    # -1.0f

    .line 759
    .line 760
    const/high16 v18, -0x40800000    # -1.0f

    .line 761
    .line 762
    const v13, -0x40f33333    # -0.55f

    .line 763
    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const/high16 v15, -0x40800000    # -1.0f

    .line 767
    .line 768
    const v16, -0x4119999a    # -0.45f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v17, 0x3f800000    # 1.0f

    .line 775
    .line 776
    const v18, -0x3ffccccd    # -2.05f

    .line 777
    .line 778
    .line 779
    const/4 v13, 0x0

    .line 780
    const v14, -0x41333333    # -0.4f

    .line 781
    .line 782
    .line 783
    const v15, 0x3edc28f6    # 0.43f

    .line 784
    .line 785
    .line 786
    const v16, -0x4063d70a    # -1.22f

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v18, 0x40033333    # 2.05f

    .line 793
    .line 794
    .line 795
    const v13, 0x3f11eb85    # 0.57f

    .line 796
    .line 797
    .line 798
    const v14, 0x3f547ae1    # 0.83f

    .line 799
    .line 800
    .line 801
    const/high16 v15, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const v16, 0x3fd33333    # 1.65f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const/high16 v17, 0x41940000    # 18.5f

    .line 810
    .line 811
    const/high16 v18, 0x40d00000    # 6.5f

    .line 812
    .line 813
    const/high16 v13, 0x419c0000    # 19.5f

    .line 814
    .line 815
    const v14, 0x40c1999a    # 6.05f

    .line 816
    .line 817
    .line 818
    const v15, 0x41986666    # 19.05f

    .line 819
    .line 820
    .line 821
    const/high16 v16, 0x40d00000    # 6.5f

    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const/16 v16, 0x3800

    .line 834
    .line 835
    const/16 v17, 0x0

    .line 836
    .line 837
    const/high16 v6, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/high16 v8, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/4 v7, 0x0

    .line 842
    const/high16 v12, 0x3f800000    # 1.0f

    .line 843
    .line 844
    const/4 v13, 0x0

    .line 845
    const/4 v14, 0x0

    .line 846
    const/4 v15, 0x0

    .line 847
    const-string v4, ""

    .line 848
    .line 849
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    sput-object v0, Landroidx/compose/material/icons/twotone/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 858
    .line 859
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    return-object v0
.end method
