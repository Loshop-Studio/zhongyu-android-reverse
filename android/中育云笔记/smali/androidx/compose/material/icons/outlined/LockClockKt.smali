.class public final Landroidx/compose/material/icons/outlined/LockClockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lockClock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLockClock(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LockClockKt;->_lockClock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LockClock"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x40000000    # 2.0f

    .line 93
    .line 94
    const v26, 0x3e947ae1    # 0.29f

    .line 95
    .line 96
    .line 97
    const v21, 0x3f333333    # 0.7f

    .line 98
    .line 99
    .line 100
    const/16 v22, 0x0

    .line 101
    .line 102
    const v23, 0x3faf5c29    # 1.37f

    .line 103
    .line 104
    .line 105
    const v24, 0x3dcccccd    # 0.1f

    .line 106
    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41200000    # 10.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, -0x40000000    # -2.0f

    .line 119
    .line 120
    const/high16 v26, -0x40000000    # -2.0f

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const v22, -0x40733333    # -1.1f

    .line 125
    .line 126
    .line 127
    const v23, -0x4099999a    # -0.9f

    .line 128
    .line 129
    .line 130
    const/high16 v24, -0x40000000    # -2.0f

    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, -0x40800000    # -1.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x40c00000    # 6.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, -0x3f600000    # -5.0f

    .line 146
    .line 147
    const/high16 v26, -0x3f600000    # -5.0f

    .line 148
    .line 149
    const v22, -0x3fcf5c29    # -2.76f

    .line 150
    .line 151
    .line 152
    const v23, -0x3ff0a3d7    # -2.24f

    .line 153
    .line 154
    .line 155
    const/high16 v24, -0x3f600000    # -5.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x404f5c29    # 3.24f

    .line 161
    .line 162
    .line 163
    const/high16 v6, 0x40e00000    # 7.0f

    .line 164
    .line 165
    const/high16 v7, 0x40c00000    # 6.0f

    .line 166
    .line 167
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x40000000    # 2.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40c00000    # 6.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, -0x40000000    # -2.0f

    .line 181
    .line 182
    const/high16 v26, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v21, -0x40733333    # -1.1f

    .line 185
    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/high16 v23, -0x40000000    # -2.0f

    .line 190
    .line 191
    const v24, 0x3f666666    # 0.9f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41200000    # 10.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x40000000    # 2.0f

    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const v22, 0x3f8ccccd    # 1.1f

    .line 207
    .line 208
    .line 209
    const v23, 0x3f666666    # 0.9f

    .line 210
    .line 211
    .line 212
    const/high16 v24, 0x40000000    # 2.0f

    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x40c851ec    # 6.26f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v25, -0x4087ae14    # -0.97f

    .line 224
    .line 225
    .line 226
    const/high16 v26, -0x40000000    # -2.0f

    .line 227
    .line 228
    const v21, -0x4128f5c3    # -0.42f

    .line 229
    .line 230
    .line 231
    const v22, -0x40e66666    # -0.6f

    .line 232
    .line 233
    .line 234
    const/high16 v23, -0x40c00000    # -0.75f

    .line 235
    .line 236
    const v24, -0x405c28f6    # -1.28f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x40c00000    # 6.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41100000    # 9.0f

    .line 251
    .line 252
    const/high16 v6, 0x40c00000    # 6.0f

    .line 253
    .line 254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v25, 0x40400000    # 3.0f

    .line 258
    .line 259
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    const v22, -0x402b851f    # -1.66f

    .line 264
    .line 265
    .line 266
    const v23, 0x3fab851f    # 1.34f

    .line 267
    .line 268
    .line 269
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, 0x3fab851f    # 1.34f

    .line 275
    .line 276
    .line 277
    const/high16 v6, 0x40400000    # 3.0f

    .line 278
    .line 279
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40000000    # 2.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x41100000    # 9.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x40c00000    # 6.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    const/16 v16, 0x3800

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const/high16 v6, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v8, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v7, 0x0

    .line 313
    const/high16 v9, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/high16 v12, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const/4 v14, 0x0

    .line 319
    const/4 v15, 0x0

    .line 320
    const-string v4, ""

    .line 321
    .line 322
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 332
    .line 333
    .line 334
    move-result-wide v6

    .line 335
    const/4 v0, 0x0

    .line 336
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41900000    # 18.0f

    .line 353
    .line 354
    const/high16 v2, 0x41500000    # 13.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, -0x3f600000    # -5.0f

    .line 360
    .line 361
    const/high16 v18, 0x40a00000    # 5.0f

    .line 362
    .line 363
    const v13, -0x3fcf5c29    # -2.76f

    .line 364
    .line 365
    .line 366
    const/high16 v15, -0x3f600000    # -5.0f

    .line 367
    .line 368
    const v16, 0x400f5c29    # 2.24f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x400f5c29    # 2.24f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x40a00000    # 5.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x3ff0a3d7    # -2.24f

    .line 383
    .line 384
    .line 385
    const/high16 v2, -0x3f600000    # -5.0f

    .line 386
    .line 387
    const/high16 v4, 0x40a00000    # 5.0f

    .line 388
    .line 389
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x41a6147b    # 20.76f

    .line 393
    .line 394
    .line 395
    const/high16 v2, 0x41900000    # 18.0f

    .line 396
    .line 397
    const/high16 v4, 0x41500000    # 13.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x41a2cccd    # 20.35f

    .line 406
    .line 407
    .line 408
    const v2, 0x419d3333    # 19.65f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x3ff66666    # -2.15f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41700000    # 15.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x3f800000    # 1.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x40328f5c    # 2.79f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3feccccd    # 1.85f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x41a2cccd    # 20.35f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/16 v16, 0x3800

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const/high16 v12, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const/4 v15, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sput-object v0, Landroidx/compose/material/icons/outlined/LockClockKt;->_lockClock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 477
    .line 478
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-object v0
.end method
