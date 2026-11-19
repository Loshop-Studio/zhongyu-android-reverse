.class public final Landroidx/compose/material/icons/twotone/ShapeLineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShapeLine(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ShapeLineKt;->_shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ShapeLine"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x40a00000    # 5.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x3f600000    # -5.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const/16 v16, 0x3800

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const v6, 0x3e99999a    # 0.3f

    .line 100
    .line 101
    .line 102
    const v8, 0x3e99999a    # 0.3f

    .line 103
    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    const/high16 v9, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/high16 v12, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x40c00000    # 6.0f

    .line 146
    .line 147
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v26, 0x40c00000    # 6.0f

    .line 157
    .line 158
    const/16 v27, 0x0

    .line 159
    .line 160
    const/high16 v21, 0x40400000    # 3.0f

    .line 161
    .line 162
    const/high16 v22, 0x40400000    # 3.0f

    .line 163
    .line 164
    const/16 v23, 0x0

    .line 165
    .line 166
    const/16 v24, 0x1

    .line 167
    .line 168
    const/16 v25, 0x1

    .line 169
    .line 170
    move-object/from16 v20, v2

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v26, -0x3f400000    # -6.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const v6, 0x3e99999a    # 0.3f

    .line 185
    .line 186
    .line 187
    const/4 v7, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41300000    # 11.0f

    .line 221
    .line 222
    const/high16 v6, 0x40c00000    # 6.0f

    .line 223
    .line 224
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, 0x40a00000    # 5.0f

    .line 228
    .line 229
    const/high16 v26, -0x3f600000    # -5.0f

    .line 230
    .line 231
    const v21, 0x4030a3d7    # 2.76f

    .line 232
    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const/high16 v23, 0x40a00000    # 5.0f

    .line 237
    .line 238
    const v24, -0x3ff0a3d7    # -2.24f

    .line 239
    .line 240
    .line 241
    move-object/from16 v20, v2

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x410c28f6    # 8.76f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v7, 0x40c00000    # 6.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x404f5c29    # 3.24f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v6, 0x41300000    # 11.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x40c00000    # 6.0f

    .line 271
    .line 272
    const/high16 v6, 0x40400000    # 3.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, 0x40400000    # 3.0f

    .line 278
    .line 279
    const/high16 v26, 0x40400000    # 3.0f

    .line 280
    .line 281
    const v21, 0x3fd33333    # 1.65f

    .line 282
    .line 283
    .line 284
    const/high16 v23, 0x40400000    # 3.0f

    .line 285
    .line 286
    const v24, 0x3faccccd    # 1.35f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 293
    .line 294
    const/16 v21, 0x0

    .line 295
    .line 296
    const v22, 0x3fd33333    # 1.65f

    .line 297
    .line 298
    .line 299
    const v23, -0x40533333    # -1.35f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x40400000    # 3.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, 0x40f4cccd    # 7.65f

    .line 308
    .line 309
    .line 310
    const/high16 v6, 0x40c00000    # 6.0f

    .line 311
    .line 312
    const/high16 v7, 0x40400000    # 3.0f

    .line 313
    .line 314
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v25, 0x40c00000    # 6.0f

    .line 318
    .line 319
    const/high16 v21, 0x40400000    # 3.0f

    .line 320
    .line 321
    const v22, 0x408b3333    # 4.35f

    .line 322
    .line 323
    .line 324
    const v23, 0x408b3333    # 4.35f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    const/high16 v6, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/high16 v8, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v7, 0x0

    .line 342
    const-string v4, ""

    .line 343
    .line 344
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 345
    .line 346
    .line 347
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    const/4 v2, 0x0

    .line 358
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x41600000    # 14.0f

    .line 375
    .line 376
    const/high16 v6, 0x41a80000    # 21.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, -0x3f600000    # -5.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v25, -0x40000000    # -2.0f

    .line 387
    .line 388
    const/high16 v26, 0x40000000    # 2.0f

    .line 389
    .line 390
    const v21, -0x40733333    # -1.1f

    .line 391
    .line 392
    .line 393
    const/16 v22, 0x0

    .line 394
    .line 395
    const/high16 v23, -0x40000000    # -2.0f

    .line 396
    .line 397
    const v24, 0x3f666666    # 0.9f

    .line 398
    .line 399
    .line 400
    move-object/from16 v20, v2

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x40a00000    # 5.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    const v22, 0x3f8ccccd    # 1.1f

    .line 415
    .line 416
    .line 417
    const v23, 0x3f666666    # 0.9f

    .line 418
    .line 419
    .line 420
    const/high16 v24, 0x40000000    # 2.0f

    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v26, -0x40000000    # -2.0f

    .line 429
    .line 430
    const v21, 0x3f8ccccd    # 1.1f

    .line 431
    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    const/high16 v23, 0x40000000    # 2.0f

    .line 436
    .line 437
    const v24, -0x4099999a    # -0.9f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, -0x3f600000    # -5.0f

    .line 444
    .line 445
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v25, 0x41a80000    # 21.0f

    .line 449
    .line 450
    const/high16 v26, 0x41600000    # 14.0f

    .line 451
    .line 452
    const/high16 v21, 0x41b80000    # 23.0f

    .line 453
    .line 454
    const v22, 0x416e6666    # 14.9f

    .line 455
    .line 456
    .line 457
    const v23, 0x41b0cccd    # 22.1f

    .line 458
    .line 459
    .line 460
    const/high16 v24, 0x41600000    # 14.0f

    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x41a80000    # 21.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, -0x3f600000    # -5.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x40a00000    # 5.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v4, 0x41a80000    # 21.0f

    .line 487
    .line 488
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v0, 0x0

    .line 517
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    const v0, 0x40f66666    # 7.7f

    .line 534
    .line 535
    .line 536
    const v2, 0x418dae14    # 17.71f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41980000    # 19.0f

    .line 543
    .line 544
    const/high16 v18, 0x41000000    # 8.0f

    .line 545
    .line 546
    const v13, 0x4190e148    # 18.11f

    .line 547
    .line 548
    .line 549
    const v14, 0x40fc7ae1    # 7.89f

    .line 550
    .line 551
    .line 552
    const v15, 0x419451ec    # 18.54f

    .line 553
    .line 554
    .line 555
    const/high16 v16, 0x41000000    # 8.0f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, 0x40400000    # 3.0f

    .line 561
    .line 562
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 563
    .line 564
    const v13, 0x3fd33333    # 1.65f

    .line 565
    .line 566
    .line 567
    const/4 v14, 0x0

    .line 568
    const/high16 v15, 0x40400000    # 3.0f

    .line 569
    .line 570
    const v16, -0x40533333    # -1.35f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, -0x40533333    # -1.35f

    .line 577
    .line 578
    .line 579
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x3faccccd    # 1.35f

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x40400000    # 3.0f

    .line 588
    .line 589
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, 0x3e99999a    # 0.3f

    .line 593
    .line 594
    .line 595
    const v18, 0x3fa51eb8    # 1.29f

    .line 596
    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const v14, 0x3eeb851f    # 0.46f

    .line 600
    .line 601
    .line 602
    const v15, 0x3de147ae    # 0.11f

    .line 603
    .line 604
    .line 605
    const v16, 0x3f63d70a    # 0.89f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x40c947ae    # 6.29f

    .line 612
    .line 613
    .line 614
    const v2, 0x41826666    # 16.3f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x40a00000    # 5.0f

    .line 621
    .line 622
    const/high16 v18, 0x41800000    # 16.0f

    .line 623
    .line 624
    const v13, 0x40bc7ae1    # 5.89f

    .line 625
    .line 626
    .line 627
    const v14, 0x4180e148    # 16.11f

    .line 628
    .line 629
    .line 630
    const v15, 0x40aeb852    # 5.46f

    .line 631
    .line 632
    .line 633
    const/high16 v16, 0x41800000    # 16.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 639
    .line 640
    const/high16 v18, 0x40400000    # 3.0f

    .line 641
    .line 642
    const v13, -0x402ccccd    # -1.65f

    .line 643
    .line 644
    .line 645
    const/4 v14, 0x0

    .line 646
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 647
    .line 648
    const v16, 0x3faccccd    # 1.35f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x3faccccd    # 1.35f

    .line 655
    .line 656
    .line 657
    const/high16 v2, 0x40400000    # 3.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x40533333    # -1.35f

    .line 663
    .line 664
    .line 665
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 666
    .line 667
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, -0x41666666    # -0.3f

    .line 671
    .line 672
    .line 673
    const v18, -0x405ae148    # -1.29f

    .line 674
    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const v14, -0x41147ae1    # -0.46f

    .line 678
    .line 679
    .line 680
    const v15, -0x421eb852    # -0.11f

    .line 681
    .line 682
    .line 683
    const v16, -0x409c28f6    # -0.89f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x40f66666    # 7.7f

    .line 690
    .line 691
    .line 692
    const v2, 0x418dae14    # 17.71f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const/16 v16, 0x3800

    .line 706
    .line 707
    const/16 v17, 0x0

    .line 708
    .line 709
    const/high16 v6, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v7, 0x0

    .line 712
    const/high16 v12, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/4 v14, 0x0

    .line 715
    const/4 v15, 0x0

    .line 716
    const-string v4, ""

    .line 717
    .line 718
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    sput-object v0, Landroidx/compose/material/icons/twotone/ShapeLineKt;->_shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 727
    .line 728
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    return-object v0
.end method
