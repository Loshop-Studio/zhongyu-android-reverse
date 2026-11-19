.class public final Landroidx/compose/material/icons/twotone/SupervisorAccountKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupervisorAccount(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SupervisorAccountKt;->_supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SupervisorAccount"

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
    const/high16 v4, 0x41080000    # 8.5f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40400000    # -1.5f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 88
    .line 89
    const/high16 v22, 0x3fc00000    # 1.5f

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
    const/high16 v26, -0x3fc00000    # -3.0f

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
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const v4, 0x4098a3d7    # 4.77f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x41880000    # 17.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x4088f5c3    # 4.28f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x3e947ae1    # 0.29f

    .line 176
    .line 177
    .line 178
    const v26, -0x40828f5c    # -0.99f

    .line 179
    .line 180
    .line 181
    const v21, 0x3c23d70a    # 0.01f

    .line 182
    .line 183
    .line 184
    const v22, -0x428a3d71    # -0.06f

    .line 185
    .line 186
    .line 187
    const v23, 0x3df5c28f    # 0.12f

    .line 188
    .line 189
    .line 190
    const v24, -0x40eb851f    # -0.58f

    .line 191
    .line 192
    .line 193
    move-object/from16 v20, v2

    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v25, -0x4151eb85    # -0.34f

    .line 199
    .line 200
    .line 201
    const v26, -0x43dc28f6    # -0.01f

    .line 202
    .line 203
    .line 204
    const v21, -0x421eb852    # -0.11f

    .line 205
    .line 206
    .line 207
    const/16 v22, 0x0

    .line 208
    .line 209
    const v23, -0x41947ae1    # -0.23f

    .line 210
    .line 211
    .line 212
    const v24, -0x43dc28f6    # -0.01f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3f78a3d7    # -4.23f

    .line 219
    .line 220
    .line 221
    const/high16 v26, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const v21, -0x403c28f6    # -1.53f

    .line 224
    .line 225
    .line 226
    const/high16 v23, -0x3fb00000    # -3.25f

    .line 227
    .line 228
    const/high16 v24, 0x3f000000    # 0.5f

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const v6, 0x3e99999a    # 0.3f

    .line 241
    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const-string v4, ""

    .line 245
    .line 246
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 247
    .line 248
    .line 249
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 254
    .line 255
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 256
    .line 257
    .line 258
    move-result-wide v6

    .line 259
    const/4 v0, 0x0

    .line 260
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41400000    # 12.0f

    .line 277
    .line 278
    const/high16 v2, 0x41100000    # 9.0f

    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x40600000    # 3.5f

    .line 284
    .line 285
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 286
    .line 287
    const v13, 0x3ff70a3d    # 1.93f

    .line 288
    .line 289
    .line 290
    const/high16 v15, 0x40600000    # 3.5f

    .line 291
    .line 292
    const v16, -0x40370a3d    # -1.57f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x412ee148    # 10.93f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x40a00000    # 5.0f

    .line 302
    .line 303
    const/high16 v4, 0x41100000    # 9.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40d23d71    # 6.57f

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x40b00000    # 5.5f

    .line 312
    .line 313
    const/high16 v4, 0x41080000    # 8.5f

    .line 314
    .line 315
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40e23d71    # 7.07f

    .line 319
    .line 320
    .line 321
    const/high16 v2, 0x41400000    # 12.0f

    .line 322
    .line 323
    const/high16 v4, 0x41100000    # 9.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40e00000    # 7.0f

    .line 332
    .line 333
    const/high16 v2, 0x41100000    # 9.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 339
    .line 340
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 341
    .line 342
    const v13, 0x3f547ae1    # 0.83f

    .line 343
    .line 344
    .line 345
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 346
    .line 347
    const v16, 0x3f2b851f    # 0.67f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x411d47ae    # 9.83f

    .line 354
    .line 355
    .line 356
    const/high16 v2, 0x41200000    # 10.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, -0x40d47ae1    # -0.67f

    .line 362
    .line 363
    .line 364
    const/high16 v2, -0x40400000    # -1.5f

    .line 365
    .line 366
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x4102b852    # 8.17f

    .line 370
    .line 371
    .line 372
    const/high16 v2, 0x40e00000    # 7.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x4110cccd    # 9.05f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x41880000    # 17.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4098a3d7    # 4.77f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x40875c29    # 4.23f

    .line 395
    .line 396
    .line 397
    const/high16 v18, -0x40800000    # -1.0f

    .line 398
    .line 399
    const v13, 0x3f7d70a4    # 0.99f

    .line 400
    .line 401
    .line 402
    const/high16 v14, -0x41000000    # -0.5f

    .line 403
    .line 404
    const v15, 0x402ccccd    # 2.7f

    .line 405
    .line 406
    .line 407
    const/high16 v16, -0x40800000    # -1.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3eae147b    # 0.34f

    .line 413
    .line 414
    .line 415
    const v18, 0x3c23d70a    # 0.01f

    .line 416
    .line 417
    .line 418
    const v13, 0x3de147ae    # 0.11f

    .line 419
    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const v15, 0x3e6b851f    # 0.23f

    .line 423
    .line 424
    .line 425
    const v16, 0x3c23d70a    # 0.01f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3fd1eb85    # 1.64f

    .line 432
    .line 433
    .line 434
    const v18, -0x401851ec    # -1.81f

    .line 435
    .line 436
    .line 437
    const v13, 0x3eae147b    # 0.34f

    .line 438
    .line 439
    .line 440
    const v14, -0x40c51eb8    # -0.73f

    .line 441
    .line 442
    .line 443
    const v15, 0x3f6e147b    # 0.93f

    .line 444
    .line 445
    .line 446
    const v16, -0x4055c28f    # -1.33f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x40028f5c    # -1.98f

    .line 453
    .line 454
    .line 455
    const v18, -0x41b33333    # -0.2f

    .line 456
    .line 457
    .line 458
    const v13, -0x40c51eb8    # -0.73f

    .line 459
    .line 460
    .line 461
    const v14, -0x41fae148    # -0.13f

    .line 462
    .line 463
    .line 464
    const v15, -0x404a3d71    # -1.42f

    .line 465
    .line 466
    .line 467
    const v16, -0x41b33333    # -0.2f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x3f200000    # -7.0f

    .line 474
    .line 475
    const/high16 v18, 0x40600000    # 3.5f

    .line 476
    .line 477
    const v13, -0x3fea3d71    # -2.34f

    .line 478
    .line 479
    .line 480
    const/4 v14, 0x0

    .line 481
    const/high16 v15, -0x3f200000    # -7.0f

    .line 482
    .line 483
    const v16, 0x3f95c28f    # 1.17f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40000000    # 2.0f

    .line 490
    .line 491
    const/high16 v2, 0x41980000    # 19.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x40e00000    # 7.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, -0x40400000    # -1.5f

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x3d4ccccd    # 0.05f

    .line 507
    .line 508
    .line 509
    const/high16 v18, -0x41000000    # -0.5f

    .line 510
    .line 511
    const/4 v13, 0x0

    .line 512
    const v14, -0x41d1eb85    # -0.17f

    .line 513
    .line 514
    .line 515
    const v15, 0x3ca3d70a    # 0.02f

    .line 516
    .line 517
    .line 518
    const v16, -0x4151eb85    # -0.34f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41840000    # 16.5f

    .line 528
    .line 529
    const/high16 v2, 0x41680000    # 14.5f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, -0x3f500000    # -5.5f

    .line 535
    .line 536
    const/high16 v18, 0x40400000    # 3.0f

    .line 537
    .line 538
    const v13, -0x40147ae1    # -1.84f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const/high16 v15, -0x3f500000    # -5.5f

    .line 543
    .line 544
    const v16, 0x3f8147ae    # 1.01f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x41300000    # 11.0f

    .line 551
    .line 552
    const/high16 v2, 0x41980000    # 19.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, -0x40400000    # -1.5f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const v14, -0x400147ae    # -1.99f

    .line 569
    .line 570
    .line 571
    const v15, -0x3f95c28f    # -3.66f

    .line 572
    .line 573
    .line 574
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x418dae14    # 17.71f

    .line 583
    .line 584
    .line 585
    const v2, 0x414ae148    # 12.68f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, 0x3fa51eb8    # 1.29f

    .line 592
    .line 593
    .line 594
    const v18, -0x3ff47ae1    # -2.18f

    .line 595
    .line 596
    .line 597
    const v13, 0x3f428f5c    # 0.76f

    .line 598
    .line 599
    .line 600
    const v14, -0x4123d70a    # -0.43f

    .line 601
    .line 602
    .line 603
    const v15, 0x3fa51eb8    # 1.29f

    .line 604
    .line 605
    .line 606
    const v16, -0x406147ae    # -1.24f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v17, 0x41840000    # 16.5f

    .line 613
    .line 614
    const/high16 v18, 0x41000000    # 8.0f

    .line 615
    .line 616
    const/high16 v13, 0x41980000    # 19.0f

    .line 617
    .line 618
    const v14, 0x4111eb85    # 9.12f

    .line 619
    .line 620
    .line 621
    const v15, 0x418f0a3d    # 17.88f

    .line 622
    .line 623
    .line 624
    const/high16 v16, 0x41000000    # 8.0f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x4111eb85    # 9.12f

    .line 630
    .line 631
    .line 632
    const/high16 v2, 0x41280000    # 10.5f

    .line 633
    .line 634
    const/high16 v4, 0x41600000    # 14.0f

    .line 635
    .line 636
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3fa51eb8    # 1.29f

    .line 640
    .line 641
    .line 642
    const v18, 0x400b851f    # 2.18f

    .line 643
    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, 0x3f70a3d7    # 0.94f

    .line 647
    .line 648
    .line 649
    const v15, 0x3f07ae14    # 0.53f

    .line 650
    .line 651
    .line 652
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, 0x3f9ae148    # 1.21f

    .line 658
    .line 659
    .line 660
    const v18, 0x3ea3d70a    # 0.32f

    .line 661
    .line 662
    .line 663
    const v13, 0x3eb851ec    # 0.36f

    .line 664
    .line 665
    .line 666
    const v14, 0x3e4ccccd    # 0.2f

    .line 667
    .line 668
    .line 669
    const v15, 0x3f451eb8    # 0.77f

    .line 670
    .line 671
    .line 672
    const v16, 0x3ea3d70a    # 0.32f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x3f9ae148    # 1.21f

    .line 679
    .line 680
    .line 681
    const v2, -0x415c28f6    # -0.32f

    .line 682
    .line 683
    .line 684
    const v4, 0x3f59999a    # 0.85f

    .line 685
    .line 686
    .line 687
    const v6, -0x420a3d71    # -0.12f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v8, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    const/high16 v12, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v13, 0x0

    .line 712
    const/4 v14, 0x0

    .line 713
    const/4 v15, 0x0

    .line 714
    const-string v4, ""

    .line 715
    .line 716
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    sput-object v0, Landroidx/compose/material/icons/twotone/SupervisorAccountKt;->_supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    return-object v0
.end method
