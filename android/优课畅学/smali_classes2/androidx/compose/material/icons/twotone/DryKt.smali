.class public final Landroidx/compose/material/icons/twotone/DryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dry:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDry(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DryKt;->_dry:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Dry"

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
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const/16 v16, 0x3800

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v6, 0x3e99999a    # 0.3f

    .line 161
    .line 162
    .line 163
    const v8, 0x3e99999a    # 0.3f

    .line 164
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
    const/4 v0, 0x0

    .line 190
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x41800000    # 16.0f

    .line 207
    .line 208
    const/high16 v2, 0x41a60000    # 20.75f

    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 214
    .line 215
    const/high16 v18, -0x40600000    # -1.25f

    .line 216
    .line 217
    const v13, 0x3f30a3d7    # 0.69f

    .line 218
    .line 219
    .line 220
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 221
    .line 222
    const v16, -0x40f0a3d7    # -0.56f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x40f0a3d7    # -0.56f

    .line 229
    .line 230
    .line 231
    const/high16 v2, -0x40600000    # -1.25f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41400000    # 12.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, -0x40800000    # -1.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40d80000    # 6.75f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x4068f5c3    # -1.18f

    .line 255
    .line 256
    .line 257
    const v18, -0x406147ae    # -1.24f

    .line 258
    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, -0x40d47ae1    # -0.67f

    .line 262
    .line 263
    .line 264
    const v15, -0x40f851ec    # -0.53f

    .line 265
    .line 266
    .line 267
    const v16, -0x40666666    # -1.2f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x410deb85    # 8.87f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3fbd70a4    # 1.48f

    .line 282
    .line 283
    .line 284
    const v2, -0x3fd9999a    # -2.6f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x3e0f5c29    # 0.14f

    .line 291
    .line 292
    .line 293
    const v18, -0x40f5c28f    # -0.54f

    .line 294
    .line 295
    .line 296
    const v13, 0x3db851ec    # 0.09f

    .line 297
    .line 298
    .line 299
    const v14, -0x41d1eb85    # -0.17f

    .line 300
    .line 301
    .line 302
    const v15, 0x3e0f5c29    # 0.14f

    .line 303
    .line 304
    .line 305
    const v16, -0x4151eb85    # -0.34f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x417ae148    # -0.26f

    .line 312
    .line 313
    .line 314
    const v18, -0x40cccccd    # -0.7f

    .line 315
    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const v14, -0x417ae148    # -0.26f

    .line 319
    .line 320
    .line 321
    const v15, -0x4247ae14    # -0.09f

    .line 322
    .line 323
    .line 324
    const/high16 v16, -0x41000000    # -0.5f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x4111eb85    # 9.12f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x40a00000    # 5.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, -0x3f1a3d71    # -7.18f

    .line 338
    .line 339
    .line 340
    const v2, 0x40d9999a    # 6.8f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const v18, 0x415f851f    # 13.97f

    .line 349
    .line 350
    .line 351
    const v13, 0x3fab851f    # 1.34f

    .line 352
    .line 353
    .line 354
    const v14, 0x4145c28f    # 12.36f

    .line 355
    .line 356
    .line 357
    const/high16 v15, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const v16, 0x41526666    # 13.15f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40400000    # 3.0f

    .line 371
    .line 372
    const/high16 v18, 0x40400000    # 3.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x3fd47ae1    # 1.66f

    .line 376
    .line 377
    .line 378
    const v15, 0x3fab851f    # 1.34f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x40400000    # 3.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x415c0000    # 13.75f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 392
    .line 393
    const/high16 v18, -0x40600000    # -1.25f

    .line 394
    .line 395
    const v13, 0x3f30a3d7    # 0.69f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 400
    .line 401
    const v16, -0x40f0a3d7    # -0.56f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x40f0a3d7    # -0.56f

    .line 408
    .line 409
    .line 410
    const/high16 v2, -0x40600000    # -1.25f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41400000    # 12.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, -0x40800000    # -1.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40f80000    # 7.75f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x41a3851f    # 20.44f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x419e0000    # 19.75f

    .line 437
    .line 438
    const/high16 v4, 0x41880000    # 17.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x41400000    # 12.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, -0x40800000    # -1.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41a60000    # 20.75f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41200000    # 10.0f

    .line 462
    .line 463
    const/high16 v2, 0x41a80000    # 21.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x40800000    # -1.0f

    .line 474
    .line 475
    const/high16 v18, -0x40800000    # -1.0f

    .line 476
    .line 477
    const v13, -0x40f33333    # -0.55f

    .line 478
    .line 479
    .line 480
    const/high16 v15, -0x40800000    # -1.0f

    .line 481
    .line 482
    const v16, -0x4119999a    # -0.45f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, -0x3f400000    # -6.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x3eb851ec    # 0.36f

    .line 494
    .line 495
    .line 496
    const/high16 v18, -0x40c00000    # -0.75f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, -0x413851ec    # -0.39f

    .line 500
    .line 501
    .line 502
    const v15, 0x3e6b851f    # 0.23f

    .line 503
    .line 504
    .line 505
    const v16, -0x40dc28f6    # -0.64f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x411deb85    # 9.87f

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x40e00000    # 7.0f

    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41400000    # 12.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/4 v0, 0x0

    .line 525
    const/high16 v2, 0x40400000    # 3.0f

    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x41a80000    # 21.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x417a6666    # 15.65f

    .line 539
    .line 540
    .line 541
    const v2, 0x409b851f    # 4.86f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x4270a3d7    # -0.07f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, -0x40d47ae1    # -0.67f

    .line 554
    .line 555
    .line 556
    const v18, -0x3ff33333    # -2.2f

    .line 557
    .line 558
    .line 559
    const v13, -0x40ee147b    # -0.57f

    .line 560
    .line 561
    .line 562
    const v14, -0x40e147ae    # -0.62f

    .line 563
    .line 564
    .line 565
    const v15, -0x40ae147b    # -0.82f

    .line 566
    .line 567
    .line 568
    const v16, -0x404b851f    # -1.41f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41700000    # 15.0f

    .line 575
    .line 576
    const/high16 v2, 0x40000000    # 2.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, -0x400e147b    # -1.89f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x3edc28f6    # 0.43f

    .line 588
    .line 589
    .line 590
    const v2, -0x428a3d71    # -0.06f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x3fa66666    # 1.3f

    .line 597
    .line 598
    .line 599
    const v18, 0x406e147b    # 3.72f

    .line 600
    .line 601
    .line 602
    const v13, -0x41b33333    # -0.2f

    .line 603
    .line 604
    .line 605
    const v14, 0x3fae147b    # 1.36f

    .line 606
    .line 607
    .line 608
    const v15, 0x3e8a3d71    # 0.27f

    .line 609
    .line 610
    .line 611
    const v16, 0x402d70a4    # 2.71f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, 0x3d8f5c29    # 0.07f

    .line 618
    .line 619
    .line 620
    const v2, 0x3d75c28f    # 0.06f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x3f2b851f    # 0.67f

    .line 627
    .line 628
    .line 629
    const v18, 0x400ccccd    # 2.2f

    .line 630
    .line 631
    .line 632
    const v13, 0x3f11eb85    # 0.57f

    .line 633
    .line 634
    .line 635
    const v14, 0x3f1eb852    # 0.62f

    .line 636
    .line 637
    .line 638
    const v15, 0x3f51eb85    # 0.82f

    .line 639
    .line 640
    .line 641
    const v16, 0x3fb47ae1    # 1.41f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x416fae14    # 14.98f

    .line 648
    .line 649
    .line 650
    const/high16 v2, 0x41100000    # 9.0f

    .line 651
    .line 652
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x3ff47ae1    # 1.91f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, -0x4123d70a    # -0.43f

    .line 662
    .line 663
    .line 664
    const v2, 0x3d75c28f    # 0.06f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x417a6666    # 15.65f

    .line 671
    .line 672
    .line 673
    const v18, 0x409b851f    # 4.86f

    .line 674
    .line 675
    .line 676
    const v13, 0x418947ae    # 17.16f

    .line 677
    .line 678
    .line 679
    const v14, 0x40e6b852    # 7.21f

    .line 680
    .line 681
    .line 682
    const v15, 0x418570a4    # 16.68f

    .line 683
    .line 684
    .line 685
    const v16, 0x40bb851f    # 5.86f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x419d3333    # 19.65f

    .line 695
    .line 696
    .line 697
    const v2, 0x409b851f    # 4.86f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, -0x4270a3d7    # -0.07f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, -0x40d47ae1    # -0.67f

    .line 710
    .line 711
    .line 712
    const v18, -0x3ff33333    # -2.2f

    .line 713
    .line 714
    .line 715
    const v13, -0x40ee147b    # -0.57f

    .line 716
    .line 717
    .line 718
    const v14, -0x40e147ae    # -0.62f

    .line 719
    .line 720
    .line 721
    const v15, -0x40ae147b    # -0.82f

    .line 722
    .line 723
    .line 724
    const v16, -0x404b851f    # -1.41f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v0, 0x41980000    # 19.0f

    .line 731
    .line 732
    const/high16 v2, 0x40000000    # 2.0f

    .line 733
    .line 734
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, -0x400e147b    # -1.89f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x3edc28f6    # 0.43f

    .line 744
    .line 745
    .line 746
    const v2, -0x428a3d71    # -0.06f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v17, 0x3fa66666    # 1.3f

    .line 753
    .line 754
    .line 755
    const v18, 0x406e147b    # 3.72f

    .line 756
    .line 757
    .line 758
    const v13, -0x41b33333    # -0.2f

    .line 759
    .line 760
    .line 761
    const v14, 0x3fae147b    # 1.36f

    .line 762
    .line 763
    .line 764
    const v15, 0x3e8a3d71    # 0.27f

    .line 765
    .line 766
    .line 767
    const v16, 0x402d70a4    # 2.71f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, 0x3d8f5c29    # 0.07f

    .line 774
    .line 775
    .line 776
    const v2, 0x3d75c28f    # 0.06f

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, 0x3f2b851f    # 0.67f

    .line 783
    .line 784
    .line 785
    const v18, 0x400ccccd    # 2.2f

    .line 786
    .line 787
    .line 788
    const v13, 0x3f11eb85    # 0.57f

    .line 789
    .line 790
    .line 791
    const v14, 0x3f1eb852    # 0.62f

    .line 792
    .line 793
    .line 794
    const v15, 0x3f51eb85    # 0.82f

    .line 795
    .line 796
    .line 797
    const v16, 0x3fb47ae1    # 1.41f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v0, 0x4197d70a    # 18.98f

    .line 804
    .line 805
    .line 806
    const/high16 v2, 0x41100000    # 9.0f

    .line 807
    .line 808
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v0, 0x3ff47ae1    # 1.91f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v0, -0x4123d70a    # -0.43f

    .line 818
    .line 819
    .line 820
    const v2, 0x3d75c28f    # 0.06f

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, 0x419d3333    # 19.65f

    .line 827
    .line 828
    .line 829
    const v18, 0x409b851f    # 4.86f

    .line 830
    .line 831
    .line 832
    const v13, 0x41a947ae    # 21.16f

    .line 833
    .line 834
    .line 835
    const v14, 0x40e6b852    # 7.21f

    .line 836
    .line 837
    .line 838
    const v15, 0x41a570a4    # 20.68f

    .line 839
    .line 840
    .line 841
    const v16, 0x40bb851f    # 5.86f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    const/16 v16, 0x3800

    .line 855
    .line 856
    const/16 v17, 0x0

    .line 857
    .line 858
    const/high16 v6, 0x3f800000    # 1.0f

    .line 859
    .line 860
    const/high16 v8, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/4 v7, 0x0

    .line 863
    const/high16 v12, 0x3f800000    # 1.0f

    .line 864
    .line 865
    const/4 v13, 0x0

    .line 866
    const/4 v14, 0x0

    .line 867
    const/4 v15, 0x0

    .line 868
    const-string v4, ""

    .line 869
    .line 870
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    sput-object v0, Landroidx/compose/material/icons/twotone/DryKt;->_dry:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 879
    .line 880
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    return-object v0
.end method
