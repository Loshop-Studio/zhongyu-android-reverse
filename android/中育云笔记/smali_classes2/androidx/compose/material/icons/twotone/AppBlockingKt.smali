.class public final Landroidx/compose/material/icons/twotone/AppBlockingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _appBlocking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppBlocking(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AppBlockingKt;->_appBlocking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AppBlocking"

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
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x3fe51eb8    # 1.79f

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
    const/high16 v25, 0x40800000    # 4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x400d70a4    # 2.21f

    .line 101
    .line 102
    .line 103
    const v23, 0x3fe51eb8    # 1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x401ae148    # -1.79f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x3f800000    # -4.0f

    .line 115
    .line 116
    const/high16 v7, 0x40800000    # 4.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41900000    # 18.0f

    .line 122
    .line 123
    const/high16 v26, 0x41000000    # 8.0f

    .line 124
    .line 125
    const/high16 v21, 0x41b00000    # 22.0f

    .line 126
    .line 127
    const v22, 0x411ca3d7    # 9.79f

    .line 128
    .line 129
    .line 130
    const v23, 0x41a1ae14    # 20.21f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x41000000    # 8.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41780000    # 15.5f

    .line 142
    .line 143
    const/high16 v6, 0x41400000    # 12.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x40200000    # 2.5f

    .line 149
    .line 150
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const v22, -0x404f5c29    # -1.38f

    .line 155
    .line 156
    .line 157
    const v23, 0x3f8f5c29    # 1.12f

    .line 158
    .line 159
    .line 160
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x3f933333    # 1.15f

    .line 166
    .line 167
    .line 168
    const v26, 0x3e947ae1    # 0.29f

    .line 169
    .line 170
    .line 171
    const v21, 0x3ed70a3d    # 0.42f

    .line 172
    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const v23, 0x3f4ccccd    # 0.8f

    .line 177
    .line 178
    .line 179
    const v24, 0x3de147ae    # 0.11f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x40570a3d    # 3.36f

    .line 186
    .line 187
    .line 188
    const v6, -0x3fa8f5c3    # -3.36f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x41780000    # 15.5f

    .line 195
    .line 196
    const/high16 v26, 0x41400000    # 12.0f

    .line 197
    .line 198
    const v21, 0x4179c28f    # 15.61f

    .line 199
    .line 200
    .line 201
    const v22, 0x414ccccd    # 12.8f

    .line 202
    .line 203
    .line 204
    const/high16 v23, 0x41780000    # 15.5f

    .line 205
    .line 206
    const v24, 0x4146b852    # 12.42f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41680000    # 14.5f

    .line 216
    .line 217
    const/high16 v6, 0x41900000    # 18.0f

    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, -0x406ccccd    # -1.15f

    .line 223
    .line 224
    .line 225
    const v26, -0x416b851f    # -0.29f

    .line 226
    .line 227
    .line 228
    const v21, -0x4128f5c3    # -0.42f

    .line 229
    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    const v23, -0x40b33333    # -0.8f

    .line 234
    .line 235
    .line 236
    const v24, -0x421eb852    # -0.11f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, 0x40570a3d    # 3.36f

    .line 243
    .line 244
    .line 245
    const v6, -0x3fa8f5c3    # -3.36f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, 0x3e947ae1    # 0.29f

    .line 252
    .line 253
    .line 254
    const v26, 0x3f933333    # 1.15f

    .line 255
    .line 256
    .line 257
    const v21, 0x3e3851ec    # 0.18f

    .line 258
    .line 259
    .line 260
    const v22, 0x3eb33333    # 0.35f

    .line 261
    .line 262
    .line 263
    const v23, 0x3e947ae1    # 0.29f

    .line 264
    .line 265
    .line 266
    const v24, 0x3f3ae148    # 0.73f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x41900000    # 18.0f

    .line 273
    .line 274
    const/high16 v26, 0x41680000    # 14.5f

    .line 275
    .line 276
    const/high16 v21, 0x41a40000    # 20.5f

    .line 277
    .line 278
    const v22, 0x4156147b    # 13.38f

    .line 279
    .line 280
    .line 281
    const v23, 0x419b0a3d    # 19.38f

    .line 282
    .line 283
    .line 284
    const/high16 v24, 0x41680000    # 14.5f

    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const/16 v16, 0x3800

    .line 297
    .line 298
    const/16 v17, 0x0

    .line 299
    .line 300
    const/high16 v6, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v8, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const/high16 v9, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v12, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const/4 v14, 0x0

    .line 311
    const/4 v15, 0x0

    .line 312
    const-string v4, ""

    .line 313
    .line 314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 322
    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 324
    .line 325
    .line 326
    move-result-wide v6

    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x41880000    # 17.0f

    .line 345
    .line 346
    const/high16 v6, 0x41900000    # 18.0f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x40e00000    # 7.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x40c00000    # 6.0f

    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x41200000    # 10.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x3f800000    # 1.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x40000000    # 2.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x40c00000    # 6.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x40a00000    # 5.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x40400000    # 3.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v25, -0x40000000    # -2.0f

    .line 392
    .line 393
    const/high16 v26, -0x40000000    # -2.0f

    .line 394
    .line 395
    const/16 v21, 0x0

    .line 396
    .line 397
    const v22, -0x40733333    # -1.1f

    .line 398
    .line 399
    .line 400
    const v23, -0x4099999a    # -0.9f

    .line 401
    .line 402
    .line 403
    const/high16 v24, -0x40000000    # -2.0f

    .line 404
    .line 405
    move-object/from16 v20, v2

    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x40e00000    # 7.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v25, 0x40a00000    # 5.0f

    .line 416
    .line 417
    const/high16 v26, 0x40400000    # 3.0f

    .line 418
    .line 419
    const v21, 0x40bccccd    # 5.9f

    .line 420
    .line 421
    .line 422
    const/high16 v22, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v23, 0x40a00000    # 5.0f

    .line 425
    .line 426
    const v24, 0x3ff33333    # 1.9f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x41900000    # 18.0f

    .line 433
    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v25, 0x40000000    # 2.0f

    .line 438
    .line 439
    const/high16 v26, 0x40000000    # 2.0f

    .line 440
    .line 441
    const/16 v21, 0x0

    .line 442
    .line 443
    const v22, 0x3f8ccccd    # 1.1f

    .line 444
    .line 445
    .line 446
    const v23, 0x3f666666    # 0.9f

    .line 447
    .line 448
    .line 449
    const/high16 v24, 0x40000000    # 2.0f

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41200000    # 10.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v26, -0x40000000    # -2.0f

    .line 460
    .line 461
    const v21, 0x3f8ccccd    # 1.1f

    .line 462
    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/high16 v23, 0x40000000    # 2.0f

    .line 467
    .line 468
    const v24, -0x4099999a    # -0.9f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, -0x40000000    # -2.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v4, -0x40800000    # -1.0f

    .line 480
    .line 481
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v4, -0x40000000    # -2.0f

    .line 488
    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x41900000    # 18.0f

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x40400000    # 3.0f

    .line 501
    .line 502
    const/high16 v6, 0x40e00000    # 7.0f

    .line 503
    .line 504
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x41200000    # 10.0f

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x3f800000    # 1.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x40e00000    # 7.0f

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x40400000    # 3.0f

    .line 523
    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, 0x41a80000    # 21.0f

    .line 531
    .line 532
    const/high16 v6, 0x41880000    # 17.0f

    .line 533
    .line 534
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v4, 0x40e00000    # 7.0f

    .line 538
    .line 539
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v4, -0x40800000    # -1.0f

    .line 543
    .line 544
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v4, 0x41200000    # 10.0f

    .line 548
    .line 549
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v4, 0x41a80000    # 21.0f

    .line 553
    .line 554
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    const/high16 v6, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/4 v7, 0x0

    .line 567
    const-string v4, ""

    .line 568
    .line 569
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 570
    .line 571
    .line 572
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 577
    .line 578
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 579
    .line 580
    .line 581
    move-result-wide v6

    .line 582
    const/4 v2, 0x0

    .line 583
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 587
    .line 588
    .line 589
    move-result v10

    .line 590
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 591
    .line 592
    .line 593
    move-result v11

    .line 594
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x40400000    # 3.0f

    .line 600
    .line 601
    const/high16 v6, 0x40e00000    # 7.0f

    .line 602
    .line 603
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v4, 0x41200000    # 10.0f

    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x3f800000    # 1.0f

    .line 612
    .line 613
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const v6, 0x3e99999a    # 0.3f

    .line 629
    .line 630
    .line 631
    const v8, 0x3e99999a    # 0.3f

    .line 632
    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const-string v4, ""

    .line 636
    .line 637
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 638
    .line 639
    .line 640
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 647
    .line 648
    .line 649
    move-result-wide v6

    .line 650
    const/4 v0, 0x0

    .line 651
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    const/high16 v2, 0x41a00000    # 20.0f

    .line 668
    .line 669
    const/high16 v4, 0x40e00000    # 7.0f

    .line 670
    .line 671
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v2, 0x41200000    # 10.0f

    .line 675
    .line 676
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v2, 0x3f800000    # 1.0f

    .line 680
    .line 681
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 685
    .line 686
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    const v6, 0x3e99999a    # 0.3f

    .line 697
    .line 698
    .line 699
    const/4 v7, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/twotone/AppBlockingKt;->_appBlocking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 711
    .line 712
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    return-object v0
.end method
