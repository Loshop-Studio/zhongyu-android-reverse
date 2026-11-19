.class public final Landroidx/compose/material/icons/sharp/UpcomingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUpcoming(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/UpcomingKt;->_upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Upcoming"

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
    const v4, 0x41a947ae    # 21.16f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e851ec    # 7.26f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x404b851f    # -1.41f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v4, 0x4181851f    # 16.19f

    .line 86
    .line 87
    .line 88
    const v6, 0x41166666    # 9.4f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x3fb47ae1    # 1.41f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, 0x41a947ae    # 21.16f

    .line 101
    .line 102
    .line 103
    const v26, 0x40e851ec    # 7.26f

    .line 104
    .line 105
    .line 106
    const v21, 0x418ccccd    # 17.6f

    .line 107
    .line 108
    .line 109
    const v22, 0x412cf5c3    # 10.81f

    .line 110
    .line 111
    .line 112
    const v23, 0x41a86666    # 21.05f

    .line 113
    .line 114
    .line 115
    const v24, 0x40e947ae    # 7.29f

    .line 116
    .line 117
    .line 118
    move-object/from16 v20, v2

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const/16 v16, 0x3800

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v8, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/high16 v9, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-string v4, ""

    .line 147
    .line 148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    const/4 v2, 0x0

    .line 162
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41300000    # 11.0f

    .line 179
    .line 180
    const/high16 v6, 0x40400000    # 3.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x40000000    # 2.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40a00000    # 5.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, -0x40000000    # -2.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/high16 v6, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    const-string v4, ""

    .line 211
    .line 212
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const v4, 0x40cccccd    # 6.4f

    .line 243
    .line 244
    .line 245
    const v6, 0x412cf5c3    # 10.81f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x40f9eb85    # 7.81f

    .line 252
    .line 253
    .line 254
    const v6, 0x41166666    # 9.4f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, 0x408851ec    # 4.26f

    .line 261
    .line 262
    .line 263
    const v6, 0x40bae148    # 5.84f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x4035c28f    # 2.84f

    .line 270
    .line 271
    .line 272
    const v6, 0x40e851ec    # 7.26f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, 0x40cccccd    # 6.4f

    .line 279
    .line 280
    .line 281
    const v26, 0x412cf5c3    # 10.81f

    .line 282
    .line 283
    .line 284
    const v21, 0x403ccccd    # 2.95f

    .line 285
    .line 286
    .line 287
    const v22, 0x40e947ae    # 7.29f

    .line 288
    .line 289
    .line 290
    const v23, 0x40cccccd    # 6.4f

    .line 291
    .line 292
    .line 293
    const v24, 0x412cf5c3    # 10.81f

    .line 294
    .line 295
    .line 296
    move-object/from16 v20, v2

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const/high16 v6, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const-string v4, ""

    .line 312
    .line 313
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 314
    .line 315
    .line 316
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 321
    .line 322
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 323
    .line 324
    .line 325
    move-result-wide v6

    .line 326
    const/4 v0, 0x0

    .line 327
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x41b00000    # 22.0f

    .line 344
    .line 345
    const/high16 v2, 0x41400000    # 12.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, -0x3f200000    # -7.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 356
    .line 357
    const/high16 v18, 0x40400000    # 3.0f

    .line 358
    .line 359
    const v14, 0x3fd47ae1    # 1.66f

    .line 360
    .line 361
    .line 362
    const v15, -0x40547ae1    # -1.34f

    .line 363
    .line 364
    .line 365
    const/high16 v16, 0x40400000    # 3.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x40547ae1    # -1.34f

    .line 371
    .line 372
    .line 373
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x40000000    # 2.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41100000    # 9.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41a00000    # 20.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41400000    # 12.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const/16 v16, 0x3800

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const/high16 v6, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v7, 0x0

    .line 412
    const/high16 v12, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const/4 v15, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    sput-object v0, Landroidx/compose/material/icons/sharp/UpcomingKt;->_upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 427
    .line 428
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return-object v0
.end method
