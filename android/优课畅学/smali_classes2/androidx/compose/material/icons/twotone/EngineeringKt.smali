.class public final Landroidx/compose/material/icons/twotone/EngineeringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _engineering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEngineering(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Engineering"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v21, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, -0x4099999a    # -0.9f

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x41100000    # 9.0f

    .line 102
    .line 103
    const/high16 v26, 0x41300000    # 11.0f

    .line 104
    .line 105
    const/high16 v21, 0x40e00000    # 7.0f

    .line 106
    .line 107
    const v22, 0x4121999a    # 10.1f

    .line 108
    .line 109
    .line 110
    const v23, 0x40fccccd    # 7.9f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x41300000    # 11.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/16 v16, 0x3800

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const v6, 0x3e99999a    # 0.3f

    .line 130
    .line 131
    .line 132
    const v8, 0x3e99999a    # 0.3f

    .line 133
    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    const/high16 v9, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/high16 v12, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const-string v4, ""

    .line 144
    .line 145
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40f00000    # 7.5f

    .line 176
    .line 177
    const/high16 v6, 0x40c00000    # 6.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x41000000    # 8.0f

    .line 183
    .line 184
    const/high16 v26, 0x40b00000    # 5.5f

    .line 185
    .line 186
    const v21, 0x40f8f5c3    # 7.78f

    .line 187
    .line 188
    .line 189
    const/high16 v22, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const/high16 v23, 0x41000000    # 8.0f

    .line 192
    .line 193
    const v24, 0x40b8f5c3    # 5.78f

    .line 194
    .line 195
    .line 196
    move-object/from16 v20, v2

    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x40847ae1    # 4.14f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v25, 0x40e00000    # 7.0f

    .line 208
    .line 209
    const v26, 0x4091999a    # 4.55f

    .line 210
    .line 211
    .line 212
    const v21, 0x40f47ae1    # 7.64f

    .line 213
    .line 214
    .line 215
    const v22, 0x40875c29    # 4.23f

    .line 216
    .line 217
    .line 218
    const v23, 0x40e9eb85    # 7.31f

    .line 219
    .line 220
    .line 221
    const v24, 0x408bd70a    # 4.37f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x40b00000    # 5.5f

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v25, 0x40f00000    # 7.5f

    .line 233
    .line 234
    const/high16 v26, 0x40c00000    # 6.0f

    .line 235
    .line 236
    const/high16 v21, 0x40e00000    # 7.0f

    .line 237
    .line 238
    const v22, 0x40b8f5c3    # 5.78f

    .line 239
    .line 240
    .line 241
    const v23, 0x40e70a3d    # 7.22f

    .line 242
    .line 243
    .line 244
    const/high16 v24, 0x40c00000    # 6.0f

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const v6, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41280000    # 10.5f

    .line 293
    .line 294
    const/high16 v6, 0x40c00000    # 6.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x41300000    # 11.0f

    .line 300
    .line 301
    const/high16 v26, 0x40b00000    # 5.5f

    .line 302
    .line 303
    const v21, 0x412c7ae1    # 10.78f

    .line 304
    .line 305
    .line 306
    const/high16 v22, 0x40c00000    # 6.0f

    .line 307
    .line 308
    const/high16 v23, 0x41300000    # 11.0f

    .line 309
    .line 310
    const v24, 0x40b8f5c3    # 5.78f

    .line 311
    .line 312
    .line 313
    move-object/from16 v20, v2

    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x4091999a    # 4.55f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, -0x40800000    # -1.0f

    .line 325
    .line 326
    const v26, -0x412e147b    # -0.41f

    .line 327
    .line 328
    .line 329
    const v21, -0x416147ae    # -0.31f

    .line 330
    .line 331
    .line 332
    const v22, -0x41c7ae14    # -0.18f

    .line 333
    .line 334
    .line 335
    const v23, -0x40dc28f6    # -0.64f

    .line 336
    .line 337
    .line 338
    const v24, -0x415c28f6    # -0.32f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x40b00000    # 5.5f

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, 0x41280000    # 10.5f

    .line 350
    .line 351
    const/high16 v26, 0x40c00000    # 6.0f

    .line 352
    .line 353
    const/high16 v21, 0x41200000    # 10.0f

    .line 354
    .line 355
    const v22, 0x40b8f5c3    # 5.78f

    .line 356
    .line 357
    .line 358
    const v23, 0x4123851f    # 10.22f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x40c00000    # 6.0f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const v6, 0x3e99999a    # 0.3f

    .line 374
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
    const/high16 v4, 0x41880000    # 17.0f

    .line 410
    .line 411
    const/high16 v6, 0x41100000    # 9.0f

    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v25, -0x3f400000    # -6.0f

    .line 417
    .line 418
    const/high16 v26, 0x40000000    # 2.0f

    .line 419
    .line 420
    const v21, -0x3fd3d70a    # -2.69f

    .line 421
    .line 422
    .line 423
    const/16 v22, 0x0

    .line 424
    .line 425
    const v23, -0x3f475c29    # -5.77f

    .line 426
    .line 427
    .line 428
    const v24, 0x3fa3d70a    # 1.28f

    .line 429
    .line 430
    .line 431
    move-object/from16 v20, v2

    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x41400000    # 12.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x41100000    # 9.0f

    .line 442
    .line 443
    const/high16 v26, 0x41880000    # 17.0f

    .line 444
    .line 445
    const v21, 0x416ccccd    # 14.8f

    .line 446
    .line 447
    .line 448
    const v22, 0x419251ec    # 18.29f

    .line 449
    .line 450
    .line 451
    const v23, 0x413b3333    # 11.7f

    .line 452
    .line 453
    .line 454
    const/high16 v24, 0x41880000    # 17.0f

    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const v6, 0x3e99999a    # 0.3f

    .line 467
    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const-string v4, ""

    .line 471
    .line 472
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 473
    .line 474
    .line 475
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 480
    .line 481
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 482
    .line 483
    .line 484
    move-result-wide v6

    .line 485
    const/4 v2, 0x0

    .line 486
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 494
    .line 495
    .line 496
    move-result v11

    .line 497
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 500
    .line 501
    .line 502
    const/high16 v4, 0x41700000    # 15.0f

    .line 503
    .line 504
    const/high16 v6, 0x41100000    # 9.0f

    .line 505
    .line 506
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, -0x3f000000    # -8.0f

    .line 510
    .line 511
    const/high16 v26, 0x40800000    # 4.0f

    .line 512
    .line 513
    const v21, -0x3fd51eb8    # -2.67f

    .line 514
    .line 515
    .line 516
    const/16 v22, 0x0

    .line 517
    .line 518
    const/high16 v23, -0x3f000000    # -8.0f

    .line 519
    .line 520
    const v24, 0x3fab851f    # 1.34f

    .line 521
    .line 522
    .line 523
    move-object/from16 v20, v2

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x40000000    # 2.0f

    .line 529
    .line 530
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v4, 0x41800000    # 16.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, -0x40000000    # -2.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v25, 0x41100000    # 9.0f

    .line 544
    .line 545
    const/high16 v26, 0x41700000    # 15.0f

    .line 546
    .line 547
    const/high16 v21, 0x41880000    # 17.0f

    .line 548
    .line 549
    const v22, 0x4182b852    # 16.34f

    .line 550
    .line 551
    .line 552
    const v23, 0x413ab852    # 11.67f

    .line 553
    .line 554
    .line 555
    const/high16 v24, 0x41700000    # 15.0f

    .line 556
    .line 557
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x41980000    # 19.0f

    .line 564
    .line 565
    const/high16 v6, 0x40400000    # 3.0f

    .line 566
    .line 567
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v25, 0x40c00000    # 6.0f

    .line 571
    .line 572
    const/high16 v26, -0x40000000    # -2.0f

    .line 573
    .line 574
    const v21, 0x3e6147ae    # 0.22f

    .line 575
    .line 576
    .line 577
    const v22, -0x40c7ae14    # -0.72f

    .line 578
    .line 579
    .line 580
    const v23, 0x4053d70a    # 3.31f

    .line 581
    .line 582
    .line 583
    const/high16 v24, -0x40000000    # -2.0f

    .line 584
    .line 585
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v26, 0x40000000    # 2.0f

    .line 589
    .line 590
    const v21, 0x402ccccd    # 2.7f

    .line 591
    .line 592
    .line 593
    const/16 v22, 0x0

    .line 594
    .line 595
    const v23, 0x40b9999a    # 5.8f

    .line 596
    .line 597
    .line 598
    const v24, 0x3fa51eb8    # 1.29f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x40400000    # 3.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/high16 v6, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v8, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const-string v4, ""

    .line 622
    .line 623
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 624
    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 633
    .line 634
    .line 635
    move-result-wide v6

    .line 636
    const/4 v2, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const v4, 0x4097ae14    # 4.74f

    .line 654
    .line 655
    .line 656
    const/high16 v6, 0x41100000    # 9.0f

    .line 657
    .line 658
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v4, 0x40a00000    # 5.0f

    .line 662
    .line 663
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v25, 0x40800000    # 4.0f

    .line 667
    .line 668
    const/high16 v26, 0x40800000    # 4.0f

    .line 669
    .line 670
    const/16 v21, 0x0

    .line 671
    .line 672
    const v22, 0x400d70a4    # 2.21f

    .line 673
    .line 674
    .line 675
    const v23, 0x3fe51eb8    # 1.79f

    .line 676
    .line 677
    .line 678
    const/high16 v24, 0x40800000    # 4.0f

    .line 679
    .line 680
    move-object/from16 v20, v2

    .line 681
    .line 682
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v4, -0x401ae148    # -1.79f

    .line 686
    .line 687
    .line 688
    const/high16 v6, -0x3f800000    # -4.0f

    .line 689
    .line 690
    const/high16 v7, 0x40800000    # 4.0f

    .line 691
    .line 692
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v4, 0x3e851eb8    # 0.26f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v25, 0x3efae148    # 0.49f

    .line 702
    .line 703
    .line 704
    const v26, -0x41051eb8    # -0.49f

    .line 705
    .line 706
    .line 707
    const v21, 0x3e8a3d71    # 0.27f

    .line 708
    .line 709
    .line 710
    const/16 v22, 0x0

    .line 711
    .line 712
    const v23, 0x3efae148    # 0.49f

    .line 713
    .line 714
    .line 715
    const v24, -0x419eb852    # -0.22f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v4, 0x4107d70a    # 8.49f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v25, -0x41051eb8    # -0.49f

    .line 728
    .line 729
    .line 730
    const/16 v21, 0x0

    .line 731
    .line 732
    const v22, -0x4175c28f    # -0.27f

    .line 733
    .line 734
    .line 735
    const v23, -0x419eb852    # -0.22f

    .line 736
    .line 737
    .line 738
    const v24, -0x41051eb8    # -0.49f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v4, 0x41500000    # 13.0f

    .line 745
    .line 746
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v25, -0x40000000    # -2.0f

    .line 750
    .line 751
    const v26, -0x3fa33333    # -3.45f

    .line 752
    .line 753
    .line 754
    const v22, -0x40428f5c    # -1.48f

    .line 755
    .line 756
    .line 757
    const v23, -0x40b0a3d7    # -0.81f

    .line 758
    .line 759
    .line 760
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 761
    .line 762
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v4, 0x40b00000    # 5.5f

    .line 766
    .line 767
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v25, 0x41280000    # 10.5f

    .line 771
    .line 772
    const/high16 v26, 0x40c00000    # 6.0f

    .line 773
    .line 774
    const/high16 v21, 0x41300000    # 11.0f

    .line 775
    .line 776
    const v22, 0x40b8f5c3    # 5.78f

    .line 777
    .line 778
    .line 779
    const v23, 0x412c7ae1    # 10.78f

    .line 780
    .line 781
    .line 782
    const/high16 v24, 0x40c00000    # 6.0f

    .line 783
    .line 784
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v4, 0x40b8f5c3    # 5.78f

    .line 788
    .line 789
    .line 790
    const/high16 v6, 0x41200000    # 10.0f

    .line 791
    .line 792
    const/high16 v7, 0x40b00000    # 5.5f

    .line 793
    .line 794
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v4, 0x40847ae1    # 4.14f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v25, 0x41100000    # 9.0f

    .line 804
    .line 805
    const/high16 v26, 0x40800000    # 4.0f

    .line 806
    .line 807
    const v21, 0x411ae148    # 9.68f

    .line 808
    .line 809
    .line 810
    const v22, 0x4081eb85    # 4.06f

    .line 811
    .line 812
    .line 813
    const v23, 0x4115999a    # 9.35f

    .line 814
    .line 815
    .line 816
    const/high16 v24, 0x40800000    # 4.0f

    .line 817
    .line 818
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v4, 0x4081eb85    # 4.06f

    .line 822
    .line 823
    .line 824
    const/high16 v6, 0x41000000    # 8.0f

    .line 825
    .line 826
    const v7, 0x40847ae1    # 4.14f

    .line 827
    .line 828
    .line 829
    const v8, 0x41051eb8    # 8.32f

    .line 830
    .line 831
    .line 832
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v4, 0x40b00000    # 5.5f

    .line 836
    .line 837
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v25, 0x40f00000    # 7.5f

    .line 841
    .line 842
    const/high16 v26, 0x40c00000    # 6.0f

    .line 843
    .line 844
    const/high16 v21, 0x41000000    # 8.0f

    .line 845
    .line 846
    const v22, 0x40b8f5c3    # 5.78f

    .line 847
    .line 848
    .line 849
    const v23, 0x40f8f5c3    # 7.78f

    .line 850
    .line 851
    .line 852
    const/high16 v24, 0x40c00000    # 6.0f

    .line 853
    .line 854
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v4, 0x40b8f5c3    # 5.78f

    .line 858
    .line 859
    .line 860
    const/high16 v6, 0x40e00000    # 7.0f

    .line 861
    .line 862
    const/high16 v7, 0x40b00000    # 5.5f

    .line 863
    .line 864
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v4, 0x4091999a    # 4.55f

    .line 868
    .line 869
    .line 870
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v25, 0x40a00000    # 5.0f

    .line 874
    .line 875
    const/high16 v26, 0x41000000    # 8.0f

    .line 876
    .line 877
    const v21, 0x40b9eb85    # 5.81f

    .line 878
    .line 879
    .line 880
    const/high16 v22, 0x40a80000    # 5.25f

    .line 881
    .line 882
    const/high16 v23, 0x40a00000    # 5.0f

    .line 883
    .line 884
    const v24, 0x40d0a3d7    # 6.52f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v4, 0x4097ae14    # 4.74f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v25, 0x40880000    # 4.25f

    .line 897
    .line 898
    const v26, 0x4107d70a    # 8.49f

    .line 899
    .line 900
    .line 901
    const v21, 0x408f0a3d    # 4.47f

    .line 902
    .line 903
    .line 904
    const/high16 v22, 0x41000000    # 8.0f

    .line 905
    .line 906
    const/high16 v23, 0x40880000    # 4.25f

    .line 907
    .line 908
    const v24, 0x4103851f    # 8.22f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v4, 0x3cf5c28f    # 0.03f

    .line 915
    .line 916
    .line 917
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const v25, 0x4097ae14    # 4.74f

    .line 921
    .line 922
    .line 923
    const/high16 v26, 0x41100000    # 9.0f

    .line 924
    .line 925
    const/high16 v21, 0x40880000    # 4.25f

    .line 926
    .line 927
    const v22, 0x410c7ae1    # 8.78f

    .line 928
    .line 929
    .line 930
    const v23, 0x408f0a3d    # 4.47f

    .line 931
    .line 932
    .line 933
    const/high16 v24, 0x41100000    # 9.0f

    .line 934
    .line 935
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const/high16 v4, 0x41300000    # 11.0f

    .line 942
    .line 943
    const/high16 v6, 0x41100000    # 9.0f

    .line 944
    .line 945
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const/high16 v25, -0x40000000    # -2.0f

    .line 949
    .line 950
    const/high16 v26, 0x40000000    # 2.0f

    .line 951
    .line 952
    const/16 v21, 0x0

    .line 953
    .line 954
    const v22, 0x3f8ccccd    # 1.1f

    .line 955
    .line 956
    .line 957
    const v23, -0x4099999a    # -0.9f

    .line 958
    .line 959
    .line 960
    const/high16 v24, 0x40000000    # 2.0f

    .line 961
    .line 962
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v4, -0x4099999a    # -0.9f

    .line 966
    .line 967
    .line 968
    const/high16 v6, -0x40000000    # -2.0f

    .line 969
    .line 970
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const/high16 v4, 0x41300000    # 11.0f

    .line 974
    .line 975
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    const/high16 v6, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const/high16 v8, 0x3f800000    # 1.0f

    .line 988
    .line 989
    const/4 v7, 0x0

    .line 990
    const-string v4, ""

    .line 991
    .line 992
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 993
    .line 994
    .line 995
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1000
    .line 1001
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v6

    .line 1005
    const/4 v2, 0x0

    .line 1006
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1010
    .line 1011
    .line 1012
    move-result v10

    .line 1013
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1014
    .line 1015
    .line 1016
    move-result v11

    .line 1017
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    const v4, 0x41afd70a    # 21.98f

    .line 1023
    .line 1024
    .line 1025
    const v6, 0x40c75c29    # 6.23f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v4, -0x40ab851f    # -0.83f

    .line 1032
    .line 1033
    .line 1034
    const v6, 0x3f6e147b    # 0.93f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const/high16 v4, -0x40c00000    # -0.75f

    .line 1041
    .line 1042
    const v6, -0x4059999a    # -1.3f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v4, -0x4067ae14    # -1.19f

    .line 1049
    .line 1050
    .line 1051
    const v6, 0x3ec7ae14    # 0.39f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const v25, -0x410f5c29    # -0.47f

    .line 1058
    .line 1059
    .line 1060
    const v26, -0x4175c28f    # -0.27f

    .line 1061
    .line 1062
    .line 1063
    const v21, -0x41f0a3d7    # -0.14f

    .line 1064
    .line 1065
    .line 1066
    const v22, -0x421eb852    # -0.11f

    .line 1067
    .line 1068
    .line 1069
    const v23, -0x41666666    # -0.3f

    .line 1070
    .line 1071
    .line 1072
    const v24, -0x41b33333    # -0.2f

    .line 1073
    .line 1074
    .line 1075
    move-object/from16 v20, v2

    .line 1076
    .line 1077
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const/high16 v4, 0x41a20000    # 20.25f

    .line 1081
    .line 1082
    const/high16 v6, 0x40400000    # 3.0f

    .line 1083
    .line 1084
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const/high16 v4, -0x40400000    # -1.5f

    .line 1088
    .line 1089
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const/high16 v4, 0x41940000    # 18.5f

    .line 1093
    .line 1094
    const v6, 0x40870a3d    # 4.22f

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const v25, -0x410a3d71    # -0.48f

    .line 1101
    .line 1102
    .line 1103
    const v26, 0x3e8a3d71    # 0.27f

    .line 1104
    .line 1105
    .line 1106
    const v21, -0x41d1eb85    # -0.17f

    .line 1107
    .line 1108
    .line 1109
    const v22, 0x3d8f5c29    # 0.07f

    .line 1110
    .line 1111
    .line 1112
    const v23, -0x41570a3d    # -0.33f

    .line 1113
    .line 1114
    .line 1115
    const v24, 0x3e23d70a    # 0.16f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v4, 0x4186b852    # 16.84f

    .line 1122
    .line 1123
    .line 1124
    const v6, 0x40833333    # 4.1f

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const/high16 v4, -0x40c00000    # -0.75f

    .line 1131
    .line 1132
    const v6, 0x3fa66666    # 1.3f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const v4, 0x3f547ae1    # 0.83f

    .line 1139
    .line 1140
    .line 1141
    const v6, 0x3f6e147b    # 0.93f

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    const v25, 0x418828f6    # 17.02f

    .line 1148
    .line 1149
    .line 1150
    const/high16 v26, 0x40d80000    # 6.75f

    .line 1151
    .line 1152
    const/high16 v21, 0x41880000    # 17.0f

    .line 1153
    .line 1154
    const v22, 0x40cccccd    # 6.4f

    .line 1155
    .line 1156
    .line 1157
    const/high16 v23, 0x41880000    # 17.0f

    .line 1158
    .line 1159
    const v24, 0x40d28f5c    # 6.58f

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v4, 0x4180b852    # 16.09f

    .line 1166
    .line 1167
    .line 1168
    const v6, 0x40f33333    # 7.6f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const/high16 v4, 0x3f400000    # 0.75f

    .line 1175
    .line 1176
    const v6, 0x3fa66666    # 1.3f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v4, 0x3f99999a    # 1.2f

    .line 1183
    .line 1184
    .line 1185
    const v6, -0x413d70a4    # -0.38f

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const v25, 0x3edc28f6    # 0.43f

    .line 1192
    .line 1193
    .line 1194
    const/high16 v26, 0x3e800000    # 0.25f

    .line 1195
    .line 1196
    const v21, 0x3e051eb8    # 0.13f

    .line 1197
    .line 1198
    .line 1199
    const v22, 0x3dcccccd    # 0.1f

    .line 1200
    .line 1201
    .line 1202
    const v23, 0x3e8f5c29    # 0.28f

    .line 1203
    .line 1204
    .line 1205
    const v24, 0x3e3851ec    # 0.18f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const/high16 v4, 0x41960000    # 18.75f

    .line 1212
    .line 1213
    const/high16 v6, 0x41200000    # 10.0f

    .line 1214
    .line 1215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1219
    .line 1220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    const v4, 0x3e8a3d71    # 0.27f

    .line 1224
    .line 1225
    .line 1226
    const v6, -0x4063d70a    # -1.22f

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    const v25, 0x3ee147ae    # 0.44f

    .line 1233
    .line 1234
    .line 1235
    const/high16 v26, -0x41800000    # -0.25f

    .line 1236
    .line 1237
    const v21, 0x3e23d70a    # 0.16f

    .line 1238
    .line 1239
    .line 1240
    const v22, -0x4270a3d7    # -0.07f

    .line 1241
    .line 1242
    .line 1243
    const v23, 0x3e99999a    # 0.3f

    .line 1244
    .line 1245
    .line 1246
    const v24, -0x41e66666    # -0.15f

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1250
    .line 1251
    .line 1252
    const v4, 0x3f9851ec    # 1.19f

    .line 1253
    .line 1254
    .line 1255
    const v6, 0x3ec28f5c    # 0.38f

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1259
    .line 1260
    .line 1261
    const/high16 v4, 0x3f400000    # 0.75f

    .line 1262
    .line 1263
    const v6, -0x4059999a    # -1.3f

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1267
    .line 1268
    .line 1269
    const v4, -0x40a66666    # -0.85f

    .line 1270
    .line 1271
    .line 1272
    const v6, -0x4091eb85    # -0.93f

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1276
    .line 1277
    .line 1278
    const v25, 0x41afd70a    # 21.98f

    .line 1279
    .line 1280
    .line 1281
    const v26, 0x40c75c29    # 6.23f

    .line 1282
    .line 1283
    .line 1284
    const/high16 v21, 0x41b00000    # 22.0f

    .line 1285
    .line 1286
    const v22, 0x40d23d71    # 6.57f

    .line 1287
    .line 1288
    .line 1289
    const v23, 0x41afeb85    # 21.99f

    .line 1290
    .line 1291
    .line 1292
    const v24, 0x40cccccd    # 6.4f

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1299
    .line 1300
    .line 1301
    const/high16 v4, 0x419c0000    # 19.5f

    .line 1302
    .line 1303
    const/high16 v6, 0x40f80000    # 7.75f

    .line 1304
    .line 1305
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1306
    .line 1307
    .line 1308
    const/high16 v25, -0x40600000    # -1.25f

    .line 1309
    .line 1310
    const/high16 v26, -0x40600000    # -1.25f

    .line 1311
    .line 1312
    const v21, -0x40cf5c29    # -0.69f

    .line 1313
    .line 1314
    .line 1315
    const/16 v22, 0x0

    .line 1316
    .line 1317
    const/high16 v23, -0x40600000    # -1.25f

    .line 1318
    .line 1319
    const v24, -0x40f0a3d7    # -0.56f

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1323
    .line 1324
    .line 1325
    const/high16 v4, -0x40600000    # -1.25f

    .line 1326
    .line 1327
    const/high16 v6, -0x40600000    # -1.25f

    .line 1328
    .line 1329
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 1330
    .line 1331
    const v8, 0x3f0f5c29    # 0.56f

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1335
    .line 1336
    .line 1337
    const v4, 0x3f0f5c29    # 0.56f

    .line 1338
    .line 1339
    .line 1340
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 1341
    .line 1342
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1343
    .line 1344
    .line 1345
    const v4, 0x41a1851f    # 20.19f

    .line 1346
    .line 1347
    .line 1348
    const/high16 v6, 0x419c0000    # 19.5f

    .line 1349
    .line 1350
    const/high16 v7, 0x40f80000    # 7.75f

    .line 1351
    .line 1352
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v2

    .line 1362
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1363
    .line 1364
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1365
    .line 1366
    const/4 v7, 0x0

    .line 1367
    const-string v4, ""

    .line 1368
    .line 1369
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1370
    .line 1371
    .line 1372
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1373
    .line 1374
    .line 1375
    move-result v3

    .line 1376
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1377
    .line 1378
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1379
    .line 1380
    .line 1381
    move-result-wide v6

    .line 1382
    const/4 v0, 0x0

    .line 1383
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1387
    .line 1388
    .line 1389
    move-result v10

    .line 1390
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1391
    .line 1392
    .line 1393
    move-result v11

    .line 1394
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1397
    .line 1398
    .line 1399
    const v0, 0x419a28f6    # 19.27f

    .line 1400
    .line 1401
    .line 1402
    const v2, 0x4144f5c3    # 12.31f

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1406
    .line 1407
    .line 1408
    const v0, 0x3f28f5c3    # 0.66f

    .line 1409
    .line 1410
    .line 1411
    const v2, -0x40e8f5c3    # -0.59f

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1415
    .line 1416
    .line 1417
    const v0, -0x40f5c28f    # -0.54f

    .line 1418
    .line 1419
    .line 1420
    const v2, -0x4091eb85    # -0.93f

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1424
    .line 1425
    .line 1426
    const v0, -0x40a66666    # -0.85f

    .line 1427
    .line 1428
    .line 1429
    const v2, 0x3e8f5c29    # 0.28f

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1433
    .line 1434
    .line 1435
    const v17, -0x41570a3d    # -0.33f

    .line 1436
    .line 1437
    .line 1438
    const v18, -0x41bd70a4    # -0.19f

    .line 1439
    .line 1440
    .line 1441
    const v13, -0x42333333    # -0.1f

    .line 1442
    .line 1443
    .line 1444
    const v14, -0x425c28f6    # -0.08f

    .line 1445
    .line 1446
    .line 1447
    const v15, -0x41a8f5c3    # -0.21f

    .line 1448
    .line 1449
    .line 1450
    const v16, -0x41f0a3d7    # -0.14f

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1454
    .line 1455
    .line 1456
    const v0, 0x419051ec    # 18.04f

    .line 1457
    .line 1458
    .line 1459
    const/high16 v2, 0x41200000    # 10.0f

    .line 1460
    .line 1461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    const v0, -0x40770a3d    # -1.07f

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    .line 1470
    const v0, -0x41c7ae14    # -0.18f

    .line 1471
    .line 1472
    .line 1473
    const v2, 0x3f5eb852    # 0.87f

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1477
    .line 1478
    .line 1479
    const v17, -0x4151eb85    # -0.34f

    .line 1480
    .line 1481
    .line 1482
    const v18, 0x3e428f5c    # 0.19f

    .line 1483
    .line 1484
    .line 1485
    const v13, -0x420a3d71    # -0.12f

    .line 1486
    .line 1487
    .line 1488
    const v14, 0x3d4ccccd    # 0.05f

    .line 1489
    .line 1490
    .line 1491
    const v15, -0x418a3d71    # -0.24f

    .line 1492
    .line 1493
    .line 1494
    const v16, 0x3df5c28f    # 0.12f

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1498
    .line 1499
    .line 1500
    const v0, -0x40a8f5c3    # -0.84f

    .line 1501
    .line 1502
    .line 1503
    const v2, -0x4170a3d7    # -0.28f

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1507
    .line 1508
    .line 1509
    const v0, -0x40f5c28f    # -0.54f

    .line 1510
    .line 1511
    .line 1512
    const v2, 0x3f6e147b    # 0.93f

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1516
    .line 1517
    .line 1518
    const v0, 0x3f28f5c3    # 0.66f

    .line 1519
    .line 1520
    .line 1521
    const v2, 0x3f170a3d    # 0.59f

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1525
    .line 1526
    .line 1527
    const/16 v17, 0x0

    .line 1528
    .line 1529
    const v18, 0x3ebd70a4    # 0.37f

    .line 1530
    .line 1531
    .line 1532
    const v13, -0x43dc28f6    # -0.01f

    .line 1533
    .line 1534
    .line 1535
    const v14, 0x3e051eb8    # 0.13f

    .line 1536
    .line 1537
    .line 1538
    const v15, -0x43dc28f6    # -0.01f

    .line 1539
    .line 1540
    .line 1541
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1542
    .line 1543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1544
    .line 1545
    .line 1546
    const v0, -0x40d70a3d    # -0.66f

    .line 1547
    .line 1548
    .line 1549
    const v2, 0x3f1c28f6    # 0.61f

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1553
    .line 1554
    .line 1555
    const v0, 0x3f0a3d71    # 0.54f

    .line 1556
    .line 1557
    .line 1558
    const v2, 0x3f6e147b    # 0.93f

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1562
    .line 1563
    .line 1564
    const v0, 0x3f5c28f6    # 0.86f

    .line 1565
    .line 1566
    .line 1567
    const v2, -0x4175c28f    # -0.27f

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1571
    .line 1572
    .line 1573
    const v17, 0x3e9eb852    # 0.31f

    .line 1574
    .line 1575
    .line 1576
    const v18, 0x3e3851ec    # 0.18f

    .line 1577
    .line 1578
    .line 1579
    const v13, 0x3dcccccd    # 0.1f

    .line 1580
    .line 1581
    .line 1582
    const v14, 0x3d8f5c29    # 0.07f

    .line 1583
    .line 1584
    .line 1585
    const v15, 0x3e4ccccd    # 0.2f

    .line 1586
    .line 1587
    .line 1588
    const v16, 0x3e051eb8    # 0.13f

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1592
    .line 1593
    .line 1594
    const v0, 0x4187ae14    # 16.96f

    .line 1595
    .line 1596
    .line 1597
    const/high16 v2, 0x41700000    # 15.0f

    .line 1598
    .line 1599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1600
    .line 1601
    .line 1602
    const v0, 0x3f88f5c3    # 1.07f

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1606
    .line 1607
    .line 1608
    const v0, 0x3e428f5c    # 0.19f

    .line 1609
    .line 1610
    .line 1611
    const v2, -0x40a147ae    # -0.87f

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1615
    .line 1616
    .line 1617
    const v17, 0x3ea3d70a    # 0.32f

    .line 1618
    .line 1619
    .line 1620
    const v18, -0x41c7ae14    # -0.18f

    .line 1621
    .line 1622
    .line 1623
    const v13, 0x3de147ae    # 0.11f

    .line 1624
    .line 1625
    .line 1626
    const v14, -0x42b33333    # -0.05f

    .line 1627
    .line 1628
    .line 1629
    const v15, 0x3e6147ae    # 0.22f

    .line 1630
    .line 1631
    .line 1632
    const v16, -0x421eb852    # -0.11f

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1636
    .line 1637
    .line 1638
    const v0, 0x3f59999a    # 0.85f

    .line 1639
    .line 1640
    .line 1641
    const v2, 0x3e8a3d71    # 0.27f

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1645
    .line 1646
    .line 1647
    const v0, 0x3f0a3d71    # 0.54f

    .line 1648
    .line 1649
    .line 1650
    const v2, -0x4091eb85    # -0.93f

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1654
    .line 1655
    .line 1656
    const v0, -0x40d70a3d    # -0.66f

    .line 1657
    .line 1658
    .line 1659
    const v2, -0x40e3d70a    # -0.61f

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1663
    .line 1664
    .line 1665
    const v17, 0x419a28f6    # 19.27f

    .line 1666
    .line 1667
    .line 1668
    const v18, 0x4144f5c3    # 12.31f

    .line 1669
    .line 1670
    .line 1671
    const v13, 0x419a3d71    # 19.28f

    .line 1672
    .line 1673
    .line 1674
    const v14, 0x4148cccd    # 12.55f

    .line 1675
    .line 1676
    .line 1677
    const v15, 0x419a3d71    # 19.28f

    .line 1678
    .line 1679
    .line 1680
    const v16, 0x4146e148    # 12.43f

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1687
    .line 1688
    .line 1689
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1690
    .line 1691
    const v2, 0x41563d71    # 13.39f

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1695
    .line 1696
    .line 1697
    const v17, -0x409c28f6    # -0.89f

    .line 1698
    .line 1699
    .line 1700
    const v18, -0x409c28f6    # -0.89f

    .line 1701
    .line 1702
    .line 1703
    const v13, -0x41051eb8    # -0.49f

    .line 1704
    .line 1705
    .line 1706
    const/4 v14, 0x0

    .line 1707
    const v15, -0x409c28f6    # -0.89f

    .line 1708
    .line 1709
    .line 1710
    const v16, -0x41333333    # -0.4f

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1714
    .line 1715
    .line 1716
    const v0, -0x409c28f6    # -0.89f

    .line 1717
    .line 1718
    .line 1719
    const v2, -0x409c28f6    # -0.89f

    .line 1720
    .line 1721
    .line 1722
    const v4, 0x3f63d70a    # 0.89f

    .line 1723
    .line 1724
    .line 1725
    const v6, 0x3ecccccd    # 0.4f

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1729
    .line 1730
    .line 1731
    const v0, 0x3ecccccd    # 0.4f

    .line 1732
    .line 1733
    .line 1734
    const v2, 0x3f63d70a    # 0.89f

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1738
    .line 1739
    .line 1740
    const v0, 0x418feb85    # 17.99f

    .line 1741
    .line 1742
    .line 1743
    const/high16 v2, 0x418c0000    # 17.5f

    .line 1744
    .line 1745
    const v4, 0x41563d71    # 13.39f

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v2

    .line 1758
    const/16 v16, 0x3800

    .line 1759
    .line 1760
    const/16 v17, 0x0

    .line 1761
    .line 1762
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1763
    .line 1764
    const/4 v7, 0x0

    .line 1765
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1766
    .line 1767
    const/4 v13, 0x0

    .line 1768
    const/4 v15, 0x0

    .line 1769
    const-string v4, ""

    .line 1770
    .line 1771
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    sput-object v0, Landroidx/compose/material/icons/twotone/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1780
    .line 1781
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1782
    .line 1783
    .line 1784
    return-object v0
.end method
