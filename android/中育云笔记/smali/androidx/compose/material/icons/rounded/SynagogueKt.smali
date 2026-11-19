.class public final Landroidx/compose/material/icons/rounded/SynagogueKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSynagogue(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SynagogueKt;->_synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Synagogue"

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
    const v6, 0x410f0a3d    # 8.94f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41a80000    # 21.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40800000    # 4.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const v6, -0x3f63851f    # -4.89f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v25, 0x3fd47ae1    # 1.66f

    .line 96
    .line 97
    .line 98
    const v26, -0x3ffae148    # -2.08f

    .line 99
    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const/high16 v22, -0x40800000    # -1.0f

    .line 104
    .line 105
    const v23, 0x3f2e147b    # 0.68f

    .line 106
    .line 107
    .line 108
    const v24, -0x400a3d71    # -1.92f

    .line 109
    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41600000    # 14.0f

    .line 117
    .line 118
    const/high16 v26, 0x41800000    # 16.0f

    .line 119
    .line 120
    const v21, 0x414eb852    # 12.92f

    .line 121
    .line 122
    .line 123
    const v22, 0x415d1eb8    # 13.82f

    .line 124
    .line 125
    .line 126
    const/high16 v23, 0x41600000    # 14.0f

    .line 127
    .line 128
    const v24, 0x416ca3d7    # 14.79f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40a00000    # 5.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x410f0a3d    # 8.94f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, -0x40c7ae14    # -0.72f

    .line 151
    .line 152
    .line 153
    const v26, -0x403ae148    # -1.54f

    .line 154
    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const v22, -0x40e8f5c3    # -0.59f

    .line 159
    .line 160
    .line 161
    const v23, -0x417ae148    # -0.26f

    .line 162
    .line 163
    .line 164
    const v24, -0x406b851f    # -1.16f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, -0x3faae148    # -3.33f

    .line 171
    .line 172
    .line 173
    const/high16 v6, -0x3f800000    # -4.0f

    .line 174
    .line 175
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, -0x3fdc28f6    # -2.56f

    .line 179
    .line 180
    .line 181
    const/16 v26, 0x0

    .line 182
    .line 183
    const v21, -0x40c28f5c    # -0.74f

    .line 184
    .line 185
    .line 186
    const v22, -0x40e147ae    # -0.62f

    .line 187
    .line 188
    .line 189
    const v23, -0x40170a3d    # -1.82f

    .line 190
    .line 191
    .line 192
    const v24, -0x40e147ae    # -0.62f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x40551eb8    # 3.33f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v25, 0x40c00000    # 6.0f

    .line 205
    .line 206
    const v26, 0x410f0a3d    # 8.94f

    .line 207
    .line 208
    .line 209
    const v21, 0x40c851ec    # 6.26f

    .line 210
    .line 211
    .line 212
    const v22, 0x40f8f5c3    # 7.78f

    .line 213
    .line 214
    .line 215
    const/high16 v23, 0x40c00000    # 6.0f

    .line 216
    .line 217
    const v24, 0x410570a4    # 8.34f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41200000    # 10.0f

    .line 227
    .line 228
    const/high16 v6, 0x41580000    # 13.5f

    .line 229
    .line 230
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, -0x40400000    # -1.5f

    .line 234
    .line 235
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const v22, 0x3f547ae1    # 0.83f

    .line 240
    .line 241
    .line 242
    const v23, -0x40d47ae1    # -0.67f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v4, -0x40d47ae1    # -0.67f

    .line 251
    .line 252
    .line 253
    const/high16 v6, -0x40400000    # -1.5f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x3f2b851f    # 0.67f

    .line 259
    .line 260
    .line 261
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 262
    .line 263
    const/high16 v7, -0x40400000    # -1.5f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x4112b852    # 9.17f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x41200000    # 10.0f

    .line 272
    .line 273
    const/high16 v7, 0x41580000    # 13.5f

    .line 274
    .line 275
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const/16 v16, 0x3800

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    const/high16 v6, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v8, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    const/high16 v9, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/high16 v12, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const/4 v14, 0x0

    .line 300
    const/4 v15, 0x0

    .line 301
    const-string v4, ""

    .line 302
    .line 303
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 304
    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 311
    .line 312
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 313
    .line 314
    .line 315
    move-result-wide v6

    .line 316
    const/4 v2, 0x0

    .line 317
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 325
    .line 326
    .line 327
    move-result v11

    .line 328
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x40400000    # 3.0f

    .line 334
    .line 335
    const/high16 v6, 0x40a00000    # 5.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v25, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v26, 0x40e00000    # 7.0f

    .line 343
    .line 344
    const v21, 0x3ff33333    # 1.9f

    .line 345
    .line 346
    .line 347
    const/high16 v22, 0x40a00000    # 5.0f

    .line 348
    .line 349
    const/high16 v23, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v24, 0x40bccccd    # 5.9f

    .line 352
    .line 353
    .line 354
    move-object/from16 v20, v2

    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, 0x3f800000    # 1.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x40800000    # 4.0f

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40e00000    # 7.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x40400000    # 3.0f

    .line 375
    .line 376
    const/high16 v26, 0x40a00000    # 5.0f

    .line 377
    .line 378
    const/high16 v21, 0x40a00000    # 5.0f

    .line 379
    .line 380
    const v22, 0x40bccccd    # 5.9f

    .line 381
    .line 382
    .line 383
    const v23, 0x40833333    # 4.1f

    .line 384
    .line 385
    .line 386
    const/high16 v24, 0x40a00000    # 5.0f

    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const/high16 v6, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const-string v4, ""

    .line 402
    .line 403
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 404
    .line 405
    .line 406
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 411
    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 413
    .line 414
    .line 415
    move-result-wide v6

    .line 416
    const/4 v2, 0x0

    .line 417
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 421
    .line 422
    .line 423
    move-result v10

    .line 424
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 425
    .line 426
    .line 427
    move-result v11

    .line 428
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x40400000    # 3.0f

    .line 434
    .line 435
    const/high16 v6, 0x41a80000    # 21.0f

    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x40000000    # 2.0f

    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v4, 0x41100000    # 9.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, 0x3f800000    # 1.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x41200000    # 10.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v26, 0x41a80000    # 21.0f

    .line 461
    .line 462
    const/high16 v21, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const v22, 0x41a0cccd    # 20.1f

    .line 465
    .line 466
    .line 467
    const v23, 0x3ff33333    # 1.9f

    .line 468
    .line 469
    .line 470
    const/high16 v24, 0x41a80000    # 21.0f

    .line 471
    .line 472
    move-object/from16 v20, v2

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v7, 0x0

    .line 487
    const-string v4, ""

    .line 488
    .line 489
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 490
    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 497
    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 499
    .line 500
    .line 501
    move-result-wide v6

    .line 502
    const/4 v2, 0x0

    .line 503
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 511
    .line 512
    .line 513
    move-result v11

    .line 514
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x40a00000    # 5.0f

    .line 520
    .line 521
    const/high16 v6, 0x41a80000    # 21.0f

    .line 522
    .line 523
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v25, -0x40000000    # -2.0f

    .line 527
    .line 528
    const/high16 v26, 0x40000000    # 2.0f

    .line 529
    .line 530
    const v21, -0x40733333    # -1.1f

    .line 531
    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    const/high16 v23, -0x40000000    # -2.0f

    .line 536
    .line 537
    const v24, 0x3f666666    # 0.9f

    .line 538
    .line 539
    .line 540
    move-object/from16 v20, v2

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v4, 0x3f800000    # 1.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x40800000    # 4.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v4, 0x40e00000    # 7.0f

    .line 556
    .line 557
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v25, 0x41a80000    # 21.0f

    .line 561
    .line 562
    const/high16 v26, 0x40a00000    # 5.0f

    .line 563
    .line 564
    const/high16 v21, 0x41b80000    # 23.0f

    .line 565
    .line 566
    const v22, 0x40bccccd    # 5.9f

    .line 567
    .line 568
    .line 569
    const v23, 0x41b0cccd    # 22.1f

    .line 570
    .line 571
    .line 572
    const/high16 v24, 0x40a00000    # 5.0f

    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const/high16 v6, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v7, 0x0

    .line 587
    const-string v4, ""

    .line 588
    .line 589
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 590
    .line 591
    .line 592
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 597
    .line 598
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 599
    .line 600
    .line 601
    move-result-wide v6

    .line 602
    const/4 v0, 0x0

    .line 603
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 607
    .line 608
    .line 609
    move-result v10

    .line 610
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 611
    .line 612
    .line 613
    move-result v11

    .line 614
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x41980000    # 19.0f

    .line 620
    .line 621
    const/high16 v2, 0x41a80000    # 21.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x40000000    # 2.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v17, 0x40000000    # 2.0f

    .line 632
    .line 633
    const/high16 v18, -0x40000000    # -2.0f

    .line 634
    .line 635
    const v13, 0x3f8ccccd    # 1.1f

    .line 636
    .line 637
    .line 638
    const/high16 v15, 0x40000000    # 2.0f

    .line 639
    .line 640
    const v16, -0x4099999a    # -0.9f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x41100000    # 9.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, -0x3f800000    # -4.0f

    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x41a80000    # 21.0f

    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    const/16 v16, 0x3800

    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    const/high16 v6, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    const/high16 v12, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v13, 0x0

    .line 678
    const/4 v15, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, Landroidx/compose/material/icons/rounded/SynagogueKt;->_synagogue:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    return-object v0
.end method
