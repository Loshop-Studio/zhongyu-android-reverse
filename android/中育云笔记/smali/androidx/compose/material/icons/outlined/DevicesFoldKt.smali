.class public final Landroidx/compose/material/icons/outlined/DevicesFoldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _devicesFold:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDevicesFold(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DevicesFoldKt;->_devicesFold:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DevicesFold"

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
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v25, -0x3fcd70a4    # -2.79f

    .line 83
    .line 84
    .line 85
    const v26, -0x40147ae1    # -1.84f

    .line 86
    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const v22, -0x4047ae14    # -1.44f

    .line 91
    .line 92
    .line 93
    const v23, -0x4043d70a    # -1.47f

    .line 94
    .line 95
    .line 96
    const v24, -0x3fe66666    # -2.4f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x3fa51eb8    # 1.29f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v25, 0x41200000    # 10.0f

    .line 113
    .line 114
    const v26, 0x408947ae    # 4.29f

    .line 115
    .line 116
    .line 117
    const v21, 0x4127ae14    # 10.48f

    .line 118
    .line 119
    .line 120
    const v22, 0x4030a3d7    # 2.76f

    .line 121
    .line 122
    .line 123
    const/high16 v23, 0x41200000    # 10.0f

    .line 124
    .line 125
    const v24, 0x405f5c29    # 3.49f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41980000    # 19.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x40000000    # 2.0f

    .line 137
    .line 138
    const/high16 v26, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, 0x3f8ccccd    # 1.1f

    .line 143
    .line 144
    .line 145
    const v23, 0x3f666666    # 0.9f

    .line 146
    .line 147
    .line 148
    const/high16 v24, 0x40000000    # 2.0f

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v26, -0x40000000    # -2.0f

    .line 159
    .line 160
    const v21, 0x3f8ccccd    # 1.1f

    .line 161
    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const/high16 v23, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v24, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v25, 0x41a00000    # 20.0f

    .line 179
    .line 180
    const/high16 v26, 0x40400000    # 3.0f

    .line 181
    .line 182
    const/high16 v21, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const v22, 0x4079999a    # 3.9f

    .line 185
    .line 186
    .line 187
    const v23, 0x41a8cccd    # 21.1f

    .line 188
    .line 189
    .line 190
    const/high16 v24, 0x40400000    # 3.0f

    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x418570a4    # 16.68f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x41700000    # 15.0f

    .line 202
    .line 203
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, 0x3fa51eb8    # 1.29f

    .line 207
    .line 208
    .line 209
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 210
    .line 211
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x408947ae    # 4.29f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41700000    # 15.0f

    .line 221
    .line 222
    const/high16 v6, 0x40400000    # 3.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v4, 0x418570a4    # 16.68f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41a00000    # 20.0f

    .line 237
    .line 238
    const/high16 v6, 0x41980000    # 19.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, -0x3f5570a4    # -5.33f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x3f8f5c29    # 1.12f

    .line 250
    .line 251
    .line 252
    const v6, -0x410a3d71    # -0.48f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41880000    # 17.0f

    .line 259
    .line 260
    const v26, 0x418570a4    # 16.68f

    .line 261
    .line 262
    .line 263
    const v21, 0x418428f6    # 16.52f

    .line 264
    .line 265
    .line 266
    const v22, 0x4191999a    # 18.2f

    .line 267
    .line 268
    .line 269
    const/high16 v23, 0x41880000    # 17.0f

    .line 270
    .line 271
    const v24, 0x418bd70a    # 17.48f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x40a00000    # 5.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40400000    # 3.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x41980000    # 19.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/16 v16, 0x3800

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v8, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    const/high16 v9, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v12, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const/4 v15, 0x0

    .line 315
    const-string v4, ""

    .line 316
    .line 317
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    const/4 v2, 0x0

    .line 331
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x40400000    # 3.0f

    .line 348
    .line 349
    const/high16 v6, 0x40000000    # 2.0f

    .line 350
    .line 351
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x40000000    # 2.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, -0x40000000    # -2.0f

    .line 363
    .line 364
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const/high16 v6, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v7, 0x0

    .line 377
    const-string v4, ""

    .line 378
    .line 379
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 380
    .line 381
    .line 382
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 387
    .line 388
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 389
    .line 390
    .line 391
    move-result-wide v6

    .line 392
    const/4 v2, 0x0

    .line 393
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 397
    .line 398
    .line 399
    move-result v10

    .line 400
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 401
    .line 402
    .line 403
    move-result v11

    .line 404
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 407
    .line 408
    .line 409
    const/high16 v4, 0x41980000    # 19.0f

    .line 410
    .line 411
    const/high16 v6, 0x40000000    # 2.0f

    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x40000000    # 2.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v4, -0x40000000    # -2.0f

    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/high16 v6, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    const-string v4, ""

    .line 440
    .line 441
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 442
    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 451
    .line 452
    .line 453
    move-result-wide v6

    .line 454
    const/4 v2, 0x0

    .line 455
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    const/high16 v4, 0x41700000    # 15.0f

    .line 472
    .line 473
    const/high16 v6, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x40000000    # 2.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v4, -0x40000000    # -2.0f

    .line 487
    .line 488
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    const/high16 v6, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const-string v4, ""

    .line 502
    .line 503
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 504
    .line 505
    .line 506
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 511
    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 513
    .line 514
    .line 515
    move-result-wide v6

    .line 516
    const/4 v2, 0x0

    .line 517
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 525
    .line 526
    .line 527
    move-result v11

    .line 528
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    const/high16 v4, 0x41300000    # 11.0f

    .line 534
    .line 535
    const/high16 v6, 0x40000000    # 2.0f

    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v4, 0x40000000    # 2.0f

    .line 541
    .line 542
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v4, -0x40000000    # -2.0f

    .line 549
    .line 550
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const-string v4, ""

    .line 564
    .line 565
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 566
    .line 567
    .line 568
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 573
    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 575
    .line 576
    .line 577
    move-result-wide v6

    .line 578
    const/4 v2, 0x0

    .line 579
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 583
    .line 584
    .line 585
    move-result v10

    .line 586
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x40e00000    # 7.0f

    .line 596
    .line 597
    const/high16 v6, 0x40000000    # 2.0f

    .line 598
    .line 599
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x40000000    # 2.0f

    .line 603
    .line 604
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v4, -0x40000000    # -2.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const/high16 v6, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    const-string v4, ""

    .line 626
    .line 627
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 628
    .line 629
    .line 630
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 631
    .line 632
    .line 633
    move-result v3

    .line 634
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 635
    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 637
    .line 638
    .line 639
    move-result-wide v6

    .line 640
    const/4 v2, 0x0

    .line 641
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 645
    .line 646
    .line 647
    move-result v10

    .line 648
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 649
    .line 650
    .line 651
    move-result v11

    .line 652
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 655
    .line 656
    .line 657
    const/high16 v4, 0x40c00000    # 6.0f

    .line 658
    .line 659
    const/high16 v6, 0x40400000    # 3.0f

    .line 660
    .line 661
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v4, 0x40000000    # 2.0f

    .line 665
    .line 666
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v4, -0x40000000    # -2.0f

    .line 673
    .line 674
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 697
    .line 698
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v6

    .line 702
    const/4 v0, 0x0

    .line 703
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    const/high16 v2, 0x40c00000    # 6.0f

    .line 720
    .line 721
    const/high16 v4, 0x41980000    # 19.0f

    .line 722
    .line 723
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v2, 0x40000000    # 2.0f

    .line 727
    .line 728
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v2, -0x40000000    # -2.0f

    .line 735
    .line 736
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/high16 v6, 0x3f800000    # 1.0f

    .line 747
    .line 748
    const/4 v7, 0x0

    .line 749
    const-string v4, ""

    .line 750
    .line 751
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    sput-object v0, Landroidx/compose/material/icons/outlined/DevicesFoldKt;->_devicesFold:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 760
    .line 761
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    return-object v0
.end method
