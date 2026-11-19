.class public final Landroidx/compose/material/icons/filled/BluetoothDriveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bluetoothDrive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBluetoothDrive(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/BluetoothDriveKt;->_bluetoothDrive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.BluetoothDrive"

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
    const/high16 v6, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x4099eb85    # 4.81f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x3f851eb8    # 1.04f

    .line 84
    .line 85
    .line 86
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x41700000    # 15.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40b00000    # 5.5f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x40828f5c    # 4.08f

    .line 107
    .line 108
    .line 109
    const v26, 0x40c051ec    # 6.01f

    .line 110
    .line 111
    .line 112
    const v21, 0x409ae148    # 4.84f

    .line 113
    .line 114
    .line 115
    const/high16 v22, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const v23, 0x408947ae    # 4.29f

    .line 118
    .line 119
    .line 120
    const v24, 0x40ad70a4    # 5.42f

    .line 121
    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v6, 0x41400000    # 12.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41000000    # 8.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/high16 v26, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const v22, 0x3f0ccccd    # 0.55f

    .line 147
    .line 148
    .line 149
    const v23, 0x3ee66666    # 0.45f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x3f800000    # 1.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v26, -0x40800000    # -1.0f

    .line 163
    .line 164
    const v21, 0x3f0ccccd    # 0.55f

    .line 165
    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const/high16 v23, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v24, -0x4119999a    # -0.45f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x41400000    # 12.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x3f800000    # 1.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v26, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/16 v21, 0x0

    .line 195
    .line 196
    const v22, 0x3f0ccccd    # 0.55f

    .line 197
    .line 198
    .line 199
    const v23, 0x3ee66666    # 0.45f

    .line 200
    .line 201
    .line 202
    const/high16 v24, 0x3f800000    # 1.0f

    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v26, -0x40800000    # -1.0f

    .line 211
    .line 212
    const v21, 0x3f0ccccd    # 0.55f

    .line 213
    .line 214
    .line 215
    const/16 v22, 0x0

    .line 216
    .line 217
    const/high16 v23, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const v24, -0x4119999a    # -0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, -0x3f000000    # -8.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v25, 0x41700000    # 15.0f

    .line 236
    .line 237
    const/high16 v26, 0x41200000    # 10.0f

    .line 238
    .line 239
    const v21, 0x417e6666    # 15.9f

    .line 240
    .line 241
    .line 242
    const/high16 v22, 0x41400000    # 12.0f

    .line 243
    .line 244
    const/high16 v23, 0x41700000    # 15.0f

    .line 245
    .line 246
    const v24, 0x4131999a    # 11.1f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x40d00000    # 6.5f

    .line 256
    .line 257
    const/high16 v6, 0x41800000    # 16.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v25, 0x40a00000    # 5.0f

    .line 263
    .line 264
    const/high16 v26, 0x41680000    # 14.5f

    .line 265
    .line 266
    const v21, 0x40b570a4    # 5.67f

    .line 267
    .line 268
    .line 269
    const/high16 v22, 0x41800000    # 16.0f

    .line 270
    .line 271
    const/high16 v23, 0x40a00000    # 5.0f

    .line 272
    .line 273
    const v24, 0x417547ae    # 15.33f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, 0x40b570a4    # 5.67f

    .line 280
    .line 281
    .line 282
    const/high16 v6, 0x41500000    # 13.0f

    .line 283
    .line 284
    const/high16 v7, 0x40d00000    # 6.5f

    .line 285
    .line 286
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x415ab852    # 13.67f

    .line 290
    .line 291
    .line 292
    const/high16 v6, 0x41680000    # 14.5f

    .line 293
    .line 294
    const/high16 v7, 0x41000000    # 8.0f

    .line 295
    .line 296
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x40ea8f5c    # 7.33f

    .line 300
    .line 301
    .line 302
    const/high16 v6, 0x40d00000    # 6.5f

    .line 303
    .line 304
    const/high16 v7, 0x41800000    # 16.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x41780000    # 15.5f

    .line 313
    .line 314
    const/high16 v6, 0x41800000    # 16.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, -0x40400000    # -1.5f

    .line 320
    .line 321
    const/high16 v26, -0x40400000    # -1.5f

    .line 322
    .line 323
    const v21, -0x40ab851f    # -0.83f

    .line 324
    .line 325
    .line 326
    const/16 v22, 0x0

    .line 327
    .line 328
    const/high16 v23, -0x40400000    # -1.5f

    .line 329
    .line 330
    const v24, -0x40d47ae1    # -0.67f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, -0x40400000    # -1.5f

    .line 337
    .line 338
    const v6, 0x3f2b851f    # 0.67f

    .line 339
    .line 340
    .line 341
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 342
    .line 343
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x3f2b851f    # 0.67f

    .line 347
    .line 348
    .line 349
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 350
    .line 351
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, 0x4182a3d7    # 16.33f

    .line 355
    .line 356
    .line 357
    const/high16 v6, 0x41780000    # 15.5f

    .line 358
    .line 359
    const/high16 v7, 0x41800000    # 16.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const/16 v16, 0x3800

    .line 372
    .line 373
    const/16 v17, 0x0

    .line 374
    .line 375
    const/high16 v6, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/high16 v8, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const/high16 v9, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/high16 v12, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const/4 v14, 0x0

    .line 386
    const/4 v15, 0x0

    .line 387
    const-string v4, ""

    .line 388
    .line 389
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 390
    .line 391
    .line 392
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 397
    .line 398
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 399
    .line 400
    .line 401
    move-result-wide v6

    .line 402
    const/4 v0, 0x0

    .line 403
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 411
    .line 412
    .line 413
    move-result v11

    .line 414
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 417
    .line 418
    .line 419
    const v2, 0x40766666    # 3.85f

    .line 420
    .line 421
    .line 422
    const/high16 v4, 0x41b00000    # 22.0f

    .line 423
    .line 424
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v2, 0x41993333    # 19.15f

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v2, -0x41000000    # -0.5f

    .line 436
    .line 437
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v2, 0x40728f5c    # 3.79f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v2, -0x3fed70a4    # -2.29f

    .line 447
    .line 448
    .line 449
    const v4, -0x3feccccd    # -2.3f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v2, -0x40cccccd    # -0.7f

    .line 456
    .line 457
    .line 458
    const v4, 0x3f333333    # 0.7f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v2, 0x4193851f    # 18.44f

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x40c00000    # 6.0f

    .line 468
    .line 469
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v2, -0x3fcd70a4    # -2.79f

    .line 473
    .line 474
    .line 475
    const v4, 0x40328f5c    # 2.79f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v2, 0x3f35c28f    # 0.71f

    .line 482
    .line 483
    .line 484
    const v4, 0x3f333333    # 0.7f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v2, 0x40133333    # 2.3f

    .line 491
    .line 492
    .line 493
    const v4, -0x3feccccd    # -2.3f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v2, 0x41300000    # 11.0f

    .line 500
    .line 501
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v2, 0x3f000000    # 0.5f

    .line 505
    .line 506
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v2, 0x41023d71    # 8.14f

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x41b00000    # 22.0f

    .line 513
    .line 514
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v2, 0x419ecccd    # 19.85f

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x40c00000    # 6.0f

    .line 521
    .line 522
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v2, 0x40766666    # 3.85f

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41b00000    # 22.0f

    .line 529
    .line 530
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v2, 0x419d3333    # 19.65f

    .line 537
    .line 538
    .line 539
    const v4, 0x403a3d71    # 2.91f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v2, 0x3f70a3d7    # 0.94f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v2, -0x408f5c29    # -0.94f

    .line 552
    .line 553
    .line 554
    const v4, 0x3f70a3d7    # 0.94f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v2, 0x403a3d71    # 2.91f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v2, 0x41a4b852    # 20.59f

    .line 570
    .line 571
    .line 572
    const v4, 0x41023d71    # 8.14f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v2, -0x408f5c29    # -0.94f

    .line 579
    .line 580
    .line 581
    const v4, 0x3f70a3d7    # 0.94f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v2, 0x40e66666    # 7.2f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v2, 0x41a4b852    # 20.59f

    .line 594
    .line 595
    .line 596
    const v4, 0x41023d71    # 8.14f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    const/high16 v6, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const-string v4, ""

    .line 613
    .line 614
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    sput-object v0, Landroidx/compose/material/icons/filled/BluetoothDriveKt;->_bluetoothDrive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 623
    .line 624
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    return-object v0
.end method
