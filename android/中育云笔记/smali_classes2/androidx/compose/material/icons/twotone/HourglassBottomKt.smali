.class public final Landroidx/compose/material/icons/twotone/HourglassBottomKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hourglassBottom:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHourglassBottom(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 31

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HourglassBottomKt;->_hourglassBottom:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HourglassBottom"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v7, 0x41840000    # 16.5f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v8, -0x3f800000    # -4.0f

    .line 78
    .line 79
    invoke-virtual {v4, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v9, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/high16 v13, 0x40600000    # 3.5f

    .line 89
    .line 90
    invoke-virtual {v4, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v14, 0x41000000    # 8.0f

    .line 94
    .line 95
    invoke-virtual {v4, v14, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/16 v16, 0x3800

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    move-object v15, v2

    .line 110
    move-object v2, v4

    .line 111
    const-string v4, ""

    .line 112
    .line 113
    move/from16 v20, v6

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    move/from16 v21, v7

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    move/from16 v22, v8

    .line 122
    .line 123
    const v8, 0x3e99999a    # 0.3f

    .line 124
    .line 125
    .line 126
    move/from16 v23, v9

    .line 127
    .line 128
    const/high16 v9, 0x3f800000    # 1.0f

    .line 129
    .line 130
    move/from16 v24, v12

    .line 131
    .line 132
    const/high16 v12, 0x3f800000    # 1.0f

    .line 133
    .line 134
    move/from16 v25, v13

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    move/from16 v26, v14

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    move-object/from16 v27, v15

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    move-object/from16 p0, v0

    .line 144
    .line 145
    move-object/from16 v0, v27

    .line 146
    .line 147
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 155
    .line 156
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41800000    # 16.0f

    .line 177
    .line 178
    const/high16 v6, 0x41840000    # 16.5f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, -0x3f800000    # -4.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v7, 0x40800000    # 4.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v8, 0x40600000    # 3.5f

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    invoke-virtual {v2, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v12, 0x41000000    # 8.0f

    .line 200
    .line 201
    invoke-virtual {v2, v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    move/from16 v30, v4

    .line 212
    .line 213
    const-string v4, ""

    .line 214
    .line 215
    move/from16 v21, v6

    .line 216
    .line 217
    const v6, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    move/from16 v29, v7

    .line 221
    .line 222
    const/4 v7, 0x0

    .line 223
    move/from16 v25, v8

    .line 224
    .line 225
    const v8, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const/high16 v9, 0x3f800000    # 1.0f

    .line 229
    .line 230
    move/from16 v28, v12

    .line 231
    .line 232
    const/high16 v12, 0x3f800000    # 1.0f

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x40c00000    # 6.0f

    .line 264
    .line 265
    const/high16 v4, 0x41b00000    # 22.0f

    .line 266
    .line 267
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v6, 0x41400000    # 12.0f

    .line 271
    .line 272
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v7, -0x3f400000    # -6.0f

    .line 276
    .line 277
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v7, -0x3f800000    # -4.0f

    .line 281
    .line 282
    invoke-virtual {v0, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v8, -0x3f7fae14    # -4.01f

    .line 286
    .line 287
    .line 288
    const v9, 0x407f5c29    # 3.99f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v8, 0x41900000    # 18.0f

    .line 295
    .line 296
    const/high16 v12, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v0, v8, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v2, 0x3c23d70a    # 0.01f

    .line 305
    .line 306
    .line 307
    const v8, 0x40bfae14    # 5.99f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v2, 0x41200000    # 10.0f

    .line 314
    .line 315
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v7, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x40f00000    # 7.5f

    .line 328
    .line 329
    const/high16 v12, 0x41000000    # 8.0f

    .line 330
    .line 331
    invoke-virtual {v0, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x40800000    # 4.0f

    .line 335
    .line 336
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v8, 0x40600000    # 3.5f

    .line 343
    .line 344
    invoke-virtual {v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v6, 0x41840000    # 16.5f

    .line 357
    .line 358
    invoke-virtual {v0, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v2, 0x41a00000    # 20.0f

    .line 368
    .line 369
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    const/high16 v6, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const/high16 v8, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v9, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    sput-object v0, Landroidx/compose/material/icons/twotone/HourglassBottomKt;->_hourglassBottom:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 405
    .line 406
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-object v0
.end method
