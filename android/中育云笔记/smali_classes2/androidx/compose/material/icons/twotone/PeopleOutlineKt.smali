.class public final Landroidx/compose/material/icons/twotone/PeopleOutlineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _peopleOutline:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPeopleOutline(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PeopleOutlineKt;->_peopleOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PeopleOutline"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 162
    .line 163
    const v6, 0x408ae148    # 4.34f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x41151eb8    # 9.32f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, -0x3f6ae148    # -4.66f

    .line 176
    .line 177
    .line 178
    const/high16 v26, -0x40600000    # -1.25f

    .line 179
    .line 180
    const v21, -0x40a8f5c3    # -0.84f

    .line 181
    .line 182
    .line 183
    const v22, -0x40eb851f    # -0.58f

    .line 184
    .line 185
    .line 186
    const v23, -0x3fc851ec    # -2.87f

    .line 187
    .line 188
    .line 189
    const/high16 v24, -0x40600000    # -1.25f

    .line 190
    .line 191
    move-object/from16 v20, v2

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, -0x3f8b851f    # -3.82f

    .line 197
    .line 198
    .line 199
    const v6, -0x3f6ae148    # -4.66f

    .line 200
    .line 201
    .line 202
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 203
    .line 204
    const v8, 0x3f2b851f    # 0.67f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const v6, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const v8, 0x3e99999a    # 0.3f

    .line 221
    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const-string v4, ""

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    const/4 v0, 0x0

    .line 240
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41400000    # 12.0f

    .line 257
    .line 258
    const/high16 v2, 0x41100000    # 9.0f

    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40600000    # 3.5f

    .line 264
    .line 265
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 266
    .line 267
    const v13, 0x3ff70a3d    # 1.93f

    .line 268
    .line 269
    .line 270
    const/high16 v15, 0x40600000    # 3.5f

    .line 271
    .line 272
    const v16, -0x40370a3d    # -1.57f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x412ee148    # 10.93f

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x40a00000    # 5.0f

    .line 282
    .line 283
    const/high16 v4, 0x41100000    # 9.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40d23d71    # 6.57f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x40b00000    # 5.5f

    .line 292
    .line 293
    const/high16 v4, 0x41080000    # 8.5f

    .line 294
    .line 295
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x40e23d71    # 7.07f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x41400000    # 12.0f

    .line 302
    .line 303
    const/high16 v4, 0x41100000    # 9.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v2, 0x41100000    # 9.0f

    .line 314
    .line 315
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 319
    .line 320
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 321
    .line 322
    const v13, 0x3f547ae1    # 0.83f

    .line 323
    .line 324
    .line 325
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 326
    .line 327
    const v16, 0x3f2b851f    # 0.67f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x411d47ae    # 9.83f

    .line 334
    .line 335
    .line 336
    const/high16 v2, 0x41200000    # 10.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x40d47ae1    # -0.67f

    .line 342
    .line 343
    .line 344
    const/high16 v2, -0x40400000    # -1.5f

    .line 345
    .line 346
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x4102b852    # 8.17f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x40e00000    # 7.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x415c0000    # 13.75f

    .line 361
    .line 362
    const/high16 v2, 0x41100000    # 9.0f

    .line 363
    .line 364
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, -0x3f200000    # -7.0f

    .line 368
    .line 369
    const/high16 v18, 0x40600000    # 3.5f

    .line 370
    .line 371
    const v13, -0x3fea3d71    # -2.34f

    .line 372
    .line 373
    .line 374
    const/high16 v15, -0x3f200000    # -7.0f

    .line 375
    .line 376
    const v16, 0x3f95c28f    # 1.17f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/high16 v2, 0x41980000    # 19.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41600000    # 14.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, -0x40200000    # -1.75f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, -0x3feae148    # -2.33f

    .line 403
    .line 404
    .line 405
    const v15, -0x3f6ae148    # -4.66f

    .line 406
    .line 407
    .line 408
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41880000    # 17.0f

    .line 417
    .line 418
    const v2, 0x408ae148    # 4.34f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x40951eb8    # 4.66f

    .line 425
    .line 426
    .line 427
    const/high16 v18, -0x40600000    # -1.25f

    .line 428
    .line 429
    const v13, 0x3f570a3d    # 0.84f

    .line 430
    .line 431
    .line 432
    const v14, -0x40eb851f    # -0.58f

    .line 433
    .line 434
    .line 435
    const v15, 0x4037ae14    # 2.87f

    .line 436
    .line 437
    .line 438
    const/high16 v16, -0x40600000    # -1.25f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40747ae1    # 3.82f

    .line 444
    .line 445
    .line 446
    const v2, 0x40951eb8    # 4.66f

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 450
    .line 451
    const v6, 0x3f2b851f    # 0.67f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41880000    # 17.0f

    .line 458
    .line 459
    const v2, 0x408ae148    # 4.34f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x418051ec    # 16.04f

    .line 469
    .line 470
    .line 471
    const v2, 0x415cf5c3    # 13.81f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3ffae148    # 1.96f

    .line 478
    .line 479
    .line 480
    const v18, 0x405c28f6    # 3.44f

    .line 481
    .line 482
    .line 483
    const v13, 0x3f947ae1    # 1.16f

    .line 484
    .line 485
    .line 486
    const v14, 0x3f570a3d    # 0.84f

    .line 487
    .line 488
    .line 489
    const v15, 0x3ffae148    # 1.96f

    .line 490
    .line 491
    .line 492
    const v16, 0x3ffae148    # 1.96f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x41900000    # 18.0f

    .line 499
    .line 500
    const/high16 v2, 0x41980000    # 19.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40800000    # 4.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, -0x40200000    # -1.75f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, -0x3f4147ae    # -5.96f

    .line 516
    .line 517
    .line 518
    const v18, -0x3fa3d70a    # -3.44f

    .line 519
    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const v14, -0x3ffeb852    # -2.02f

    .line 523
    .line 524
    .line 525
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 526
    .line 527
    const v16, -0x3fb51eb8    # -3.17f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41700000    # 15.0f

    .line 537
    .line 538
    const/high16 v2, 0x41400000    # 12.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, 0x40600000    # 3.5f

    .line 544
    .line 545
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 546
    .line 547
    const v13, 0x3ff70a3d    # 1.93f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const/high16 v15, 0x40600000    # 3.5f

    .line 552
    .line 553
    const v16, -0x40370a3d    # -1.57f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x418770a4    # 16.93f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x41700000    # 15.0f

    .line 563
    .line 564
    const/high16 v4, 0x40a00000    # 5.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, -0x40400000    # -1.5f

    .line 570
    .line 571
    const v18, 0x3eb33333    # 0.35f

    .line 572
    .line 573
    .line 574
    const v13, -0x40f5c28f    # -0.54f

    .line 575
    .line 576
    .line 577
    const v15, -0x407ae148    # -1.04f

    .line 578
    .line 579
    .line 580
    const v16, 0x3e051eb8    # 0.13f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const v18, 0x4049999a    # 3.15f

    .line 589
    .line 590
    .line 591
    const v13, 0x3f2147ae    # 0.63f

    .line 592
    .line 593
    .line 594
    const v14, 0x3f63d70a    # 0.89f

    .line 595
    .line 596
    .line 597
    const/high16 v15, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const v16, 0x3ffd70a4    # 1.98f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, -0x40800000    # -1.0f

    .line 606
    .line 607
    const v2, 0x4049999a    # 3.15f

    .line 608
    .line 609
    .line 610
    const v4, -0x41428f5c    # -0.37f

    .line 611
    .line 612
    .line 613
    const v6, 0x4010a3d7    # 2.26f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 620
    .line 621
    const v18, 0x3eb33333    # 0.35f

    .line 622
    .line 623
    .line 624
    const v13, 0x3eeb851f    # 0.46f

    .line 625
    .line 626
    .line 627
    const v14, 0x3e6147ae    # 0.22f

    .line 628
    .line 629
    .line 630
    const v15, 0x3f75c28f    # 0.96f

    .line 631
    .line 632
    .line 633
    const v16, 0x3eb33333    # 0.35f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/16 v16, 0x3800

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/high16 v6, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/high16 v8, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v7, 0x0

    .line 655
    const/high16 v12, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/4 v13, 0x0

    .line 658
    const/4 v14, 0x0

    .line 659
    const/4 v15, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    sput-object v0, Landroidx/compose/material/icons/twotone/PeopleOutlineKt;->_peopleOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    return-object v0
.end method
