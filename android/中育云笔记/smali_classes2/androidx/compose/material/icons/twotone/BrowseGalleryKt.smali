.class public final Landroidx/compose/material/icons/twotone/BrowseGalleryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrowseGallery(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BrowseGalleryKt;->_browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BrowseGallery"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f200000    # -7.0f

    .line 78
    .line 79
    const/high16 v26, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const v21, -0x3f88f5c3    # -3.86f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f200000    # -7.0f

    .line 87
    .line 88
    const v24, 0x4048f5c3    # 3.14f

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
    const v4, 0x4048f5c3    # 3.14f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40e00000    # 7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3fb70a3d    # -3.14f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f200000    # -7.0f

    .line 108
    .line 109
    const/high16 v7, 0x40e00000    # 7.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x414dc28f    # 12.86f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40a00000    # 5.0f

    .line 118
    .line 119
    const/high16 v7, 0x41100000    # 9.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x4181ae14    # 16.21f

    .line 128
    .line 129
    .line 130
    const v6, 0x413ca3d7    # 11.79f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41000000    # 8.0f

    .line 137
    .line 138
    const v6, 0x41468f5c    # 12.41f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40e00000    # 7.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x4092e148    # 4.59f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x404d70a4    # 3.21f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x4181ae14    # 16.21f

    .line 167
    .line 168
    .line 169
    const v6, 0x413ca3d7    # 11.79f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v16, 0x3800

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const v6, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const v8, 0x3e99999a    # 0.3f

    .line 190
    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const/high16 v9, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v12, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    const-string v4, ""

    .line 201
    .line 202
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    const/4 v2, 0x0

    .line 216
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x40400000    # 3.0f

    .line 233
    .line 234
    const/high16 v6, 0x41100000    # 9.0f

    .line 235
    .line 236
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 240
    .line 241
    const/high16 v26, 0x41100000    # 9.0f

    .line 242
    .line 243
    const v21, -0x3f60f5c3    # -4.97f

    .line 244
    .line 245
    .line 246
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 247
    .line 248
    const v24, 0x4080f5c3    # 4.03f

    .line 249
    .line 250
    .line 251
    move-object/from16 v20, v2

    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x4080f5c3    # 4.03f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x3f7f0a3d    # -4.03f

    .line 263
    .line 264
    .line 265
    const/high16 v6, -0x3ef00000    # -9.0f

    .line 266
    .line 267
    const/high16 v7, 0x41100000    # 9.0f

    .line 268
    .line 269
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x415f851f    # 13.97f

    .line 273
    .line 274
    .line 275
    const/high16 v6, 0x40400000    # 3.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41980000    # 19.0f

    .line 284
    .line 285
    const/high16 v6, 0x41100000    # 9.0f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, -0x3f200000    # -7.0f

    .line 291
    .line 292
    const/high16 v26, -0x3f200000    # -7.0f

    .line 293
    .line 294
    const v21, -0x3f88f5c3    # -3.86f

    .line 295
    .line 296
    .line 297
    const/high16 v23, -0x3f200000    # -7.0f

    .line 298
    .line 299
    const v24, -0x3fb70a3d    # -3.14f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, -0x3f200000    # -7.0f

    .line 306
    .line 307
    const v6, 0x4048f5c3    # 3.14f

    .line 308
    .line 309
    .line 310
    const/high16 v7, 0x40e00000    # 7.0f

    .line 311
    .line 312
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x4048f5c3    # 3.14f

    .line 316
    .line 317
    .line 318
    const/high16 v6, 0x40e00000    # 7.0f

    .line 319
    .line 320
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v4, 0x414dc28f    # 12.86f

    .line 324
    .line 325
    .line 326
    const/high16 v6, 0x41980000    # 19.0f

    .line 327
    .line 328
    const/high16 v7, 0x41100000    # 9.0f

    .line 329
    .line 330
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/high16 v6, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v8, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    const-string v4, ""

    .line 346
    .line 347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 348
    .line 349
    .line 350
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 357
    .line 358
    .line 359
    move-result-wide v6

    .line 360
    const/4 v2, 0x0

    .line 361
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const/high16 v4, 0x41200000    # 10.0f

    .line 378
    .line 379
    const/high16 v6, 0x40e00000    # 7.0f

    .line 380
    .line 381
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, -0x40000000    # -2.0f

    .line 385
    .line 386
    const/4 v6, 0x0

    .line 387
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v4, 0x40ad1eb8    # 5.41f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x40728f5c    # 3.79f

    .line 397
    .line 398
    .line 399
    const v6, 0x40733333    # 3.8f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x3fb5c28f    # 1.42f

    .line 406
    .line 407
    .line 408
    const v6, -0x404a3d71    # -1.42f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, -0x3fb28f5c    # -3.21f

    .line 415
    .line 416
    .line 417
    const v6, -0x3fb33333    # -3.2f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v7, 0x0

    .line 433
    const-string v4, ""

    .line 434
    .line 435
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 436
    .line 437
    .line 438
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 443
    .line 444
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 445
    .line 446
    .line 447
    move-result-wide v6

    .line 448
    const/4 v0, 0x0

    .line 449
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 463
    .line 464
    .line 465
    const v0, 0x418feb85    # 17.99f

    .line 466
    .line 467
    .line 468
    const v2, 0x406147ae    # 3.52f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x400a3d71    # 2.16f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41b00000    # 22.0f

    .line 481
    .line 482
    const/high16 v18, 0x41400000    # 12.0f

    .line 483
    .line 484
    const v13, 0x41a2e148    # 20.36f

    .line 485
    .line 486
    .line 487
    const v14, 0x40d9999a    # 6.8f

    .line 488
    .line 489
    .line 490
    const/high16 v15, 0x41b00000    # 22.0f

    .line 491
    .line 492
    const v16, 0x41135c29    # 9.21f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x3f7fae14    # -4.01f

    .line 499
    .line 500
    .line 501
    const v18, 0x40ca3d71    # 6.32f

    .line 502
    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, 0x40328f5c    # 2.79f

    .line 506
    .line 507
    .line 508
    const v15, -0x402e147b    # -1.64f

    .line 509
    .line 510
    .line 511
    const v16, 0x40a66666    # 5.2f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x41c00000    # 24.0f

    .line 521
    .line 522
    const/high16 v18, 0x41400000    # 12.0f

    .line 523
    .line 524
    const v13, 0x41abd70a    # 21.48f

    .line 525
    .line 526
    .line 527
    const v14, 0x4199eb85    # 19.24f

    .line 528
    .line 529
    .line 530
    const/high16 v15, 0x41c00000    # 24.0f

    .line 531
    .line 532
    const v16, 0x417e8f5c    # 15.91f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x418feb85    # 17.99f

    .line 539
    .line 540
    .line 541
    const v18, 0x406147ae    # 3.52f

    .line 542
    .line 543
    .line 544
    const/high16 v13, 0x41c00000    # 24.0f

    .line 545
    .line 546
    const v14, 0x410170a4    # 8.09f

    .line 547
    .line 548
    .line 549
    const v15, 0x41abd70a    # 21.48f

    .line 550
    .line 551
    .line 552
    const v16, 0x409851ec    # 4.76f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const/16 v16, 0x3800

    .line 566
    .line 567
    const/16 v17, 0x0

    .line 568
    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v7, 0x0

    .line 572
    const/high16 v12, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v13, 0x0

    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    const-string v4, ""

    .line 578
    .line 579
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sput-object v0, Landroidx/compose/material/icons/twotone/BrowseGalleryKt;->_browseGallery:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-object v0
.end method
