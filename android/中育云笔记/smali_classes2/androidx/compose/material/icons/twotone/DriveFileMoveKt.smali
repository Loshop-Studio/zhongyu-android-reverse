.class public final Landroidx/compose/material/icons/twotone/DriveFileMoveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _driveFileMove:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDriveFileMove(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DriveFileMoveKt;->_driveFileMove:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DriveFileMove"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3f000000    # -8.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40800000    # 4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x40000000    # 2.0f

    .line 93
    .line 94
    const/high16 v26, 0x40c00000    # 6.0f

    .line 95
    .line 96
    const v21, 0x4039999a    # 2.9f

    .line 97
    .line 98
    .line 99
    const/high16 v22, 0x40800000    # 4.0f

    .line 100
    .line 101
    const/high16 v23, 0x40000000    # 2.0f

    .line 102
    .line 103
    const v24, 0x409ccccd    # 4.9f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41400000    # 12.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v26, 0x40000000    # 2.0f

    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const v22, 0x3f8ccccd    # 1.1f

    .line 121
    .line 122
    .line 123
    const v23, 0x3f666666    # 0.9f

    .line 124
    .line 125
    .line 126
    const/high16 v24, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41800000    # 16.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v26, -0x40000000    # -2.0f

    .line 137
    .line 138
    const v21, 0x3f8ccccd    # 1.1f

    .line 139
    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const/high16 v23, 0x40000000    # 2.0f

    .line 144
    .line 145
    const v24, -0x4099999a    # -0.9f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x41000000    # 8.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, 0x41a00000    # 20.0f

    .line 157
    .line 158
    const/high16 v26, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v21, 0x41b00000    # 22.0f

    .line 161
    .line 162
    const v22, 0x40dccccd    # 6.9f

    .line 163
    .line 164
    .line 165
    const v23, 0x41a8cccd    # 21.1f

    .line 166
    .line 167
    .line 168
    const/high16 v24, 0x40c00000    # 6.0f

    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41900000    # 18.0f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40800000    # 4.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40c00000    # 6.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x40a570a4    # 5.17f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x3fb47ae1    # 1.41f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x4132b852    # 11.17f

    .line 204
    .line 205
    .line 206
    const/high16 v6, 0x41000000    # 8.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x41a00000    # 20.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41900000    # 18.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const/16 v16, 0x3800

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const/high16 v6, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/high16 v8, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    const/high16 v9, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v12, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    const/4 v15, 0x0

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
    const/4 v2, 0x0

    .line 260
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x41600000    # 14.0f

    .line 277
    .line 278
    const/high16 v6, 0x41000000    # 8.0f

    .line 279
    .line 280
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/4 v4, 0x0

    .line 284
    const/high16 v6, 0x40800000    # 4.0f

    .line 285
    .line 286
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v4, 0x40400000    # 3.0f

    .line 290
    .line 291
    const/4 v6, 0x0

    .line 292
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, -0x3f800000    # -4.0f

    .line 296
    .line 297
    const/high16 v6, 0x40800000    # 4.0f

    .line 298
    .line 299
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40400000    # 3.0f

    .line 306
    .line 307
    const/4 v6, 0x0

    .line 308
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    const/high16 v6, -0x3f800000    # -4.0f

    .line 313
    .line 314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const/high16 v6, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    const-string v4, ""

    .line 328
    .line 329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 330
    .line 331
    .line 332
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 339
    .line 340
    .line 341
    move-result-wide v6

    .line 342
    const/4 v0, 0x0

    .line 343
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 357
    .line 358
    .line 359
    const v2, 0x40ed1eb8    # 7.41f

    .line 360
    .line 361
    .line 362
    const v4, 0x412970a4    # 10.59f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v2, 0x4112b852    # 9.17f

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x40c00000    # 6.0f

    .line 372
    .line 373
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v2, 0x40800000    # 4.0f

    .line 377
    .line 378
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v2, 0x41400000    # 12.0f

    .line 382
    .line 383
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v2, 0x41800000    # 16.0f

    .line 387
    .line 388
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x41000000    # 8.0f

    .line 392
    .line 393
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v2, -0x3ef2b852    # -8.83f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v2, 0x40ed1eb8    # 7.41f

    .line 403
    .line 404
    .line 405
    const v4, 0x412970a4    # 10.59f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x41100000    # 9.0f

    .line 415
    .line 416
    const/high16 v4, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x40800000    # 4.0f

    .line 422
    .line 423
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v2, -0x3f800000    # -4.0f

    .line 427
    .line 428
    const/high16 v4, 0x40800000    # 4.0f

    .line 429
    .line 430
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 434
    .line 435
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v2, 0x41000000    # 8.0f

    .line 439
    .line 440
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v2, -0x40000000    # -2.0f

    .line 444
    .line 445
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v2, 0x40800000    # 4.0f

    .line 449
    .line 450
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v2, 0x41100000    # 9.0f

    .line 454
    .line 455
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const v6, 0x3e99999a    # 0.3f

    .line 466
    .line 467
    .line 468
    const v8, 0x3e99999a    # 0.3f

    .line 469
    .line 470
    .line 471
    const/4 v7, 0x0

    .line 472
    const-string v4, ""

    .line 473
    .line 474
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    sput-object v0, Landroidx/compose/material/icons/twotone/DriveFileMoveKt;->_driveFileMove:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 483
    .line 484
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-object v0
.end method

.method public static synthetic getDriveFileMove$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
