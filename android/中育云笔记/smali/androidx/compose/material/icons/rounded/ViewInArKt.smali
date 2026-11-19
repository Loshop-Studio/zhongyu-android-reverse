.class public final Landroidx/compose/material/icons/rounded/ViewInArKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getViewInAr(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ViewInArKt;->_viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ViewInAr"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v21, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x3f800000    # 1.0f

    .line 87
    .line 88
    const v24, -0x4119999a    # -0.45f

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v23, 0x3ee66666    # 0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v24, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x3f800000    # 1.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v21, 0x3f0ccccd    # 0.55f

    .line 120
    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const/high16 v23, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const v24, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x40b1999a    # 5.55f

    .line 133
    .line 134
    .line 135
    const/high16 v6, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const/high16 v7, 0x3f800000    # 1.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x40800000    # 4.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v26, 0x40800000    # 4.0f

    .line 148
    .line 149
    const v21, 0x4015c28f    # 2.34f

    .line 150
    .line 151
    .line 152
    const/high16 v22, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const v24, 0x4015c28f    # 2.34f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x3f800000    # 1.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x40000000    # 2.0f

    .line 166
    .line 167
    const/high16 v26, 0x40c00000    # 6.0f

    .line 168
    .line 169
    const/high16 v21, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v22, 0x40b1999a    # 5.55f

    .line 172
    .line 173
    .line 174
    const v23, 0x3fb9999a    # 1.45f

    .line 175
    .line 176
    .line 177
    const/high16 v24, 0x40c00000    # 6.0f

    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const/16 v16, 0x3800

    .line 190
    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    const/high16 v6, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v8, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/high16 v9, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/high16 v12, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    const-string v4, ""

    .line 206
    .line 207
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 215
    .line 216
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 217
    .line 218
    .line 219
    move-result-wide v6

    .line 220
    const/4 v2, 0x0

    .line 221
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x41a80000    # 21.0f

    .line 238
    .line 239
    const/high16 v6, 0x40a00000    # 5.0f

    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x40800000    # 4.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, -0x40800000    # -1.0f

    .line 250
    .line 251
    const/high16 v26, -0x40800000    # -1.0f

    .line 252
    .line 253
    const v21, -0x40f33333    # -0.55f

    .line 254
    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const/high16 v23, -0x40800000    # -1.0f

    .line 259
    .line 260
    const v24, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    move-object/from16 v20, v2

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, -0x40800000    # -1.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/16 v21, 0x0

    .line 274
    .line 275
    const v22, -0x40f33333    # -0.55f

    .line 276
    .line 277
    .line 278
    const v23, -0x4119999a    # -0.45f

    .line 279
    .line 280
    .line 281
    const/high16 v24, -0x40800000    # -1.0f

    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v26, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const v21, -0x40f33333    # -0.55f

    .line 289
    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    const/high16 v23, -0x40800000    # -1.0f

    .line 294
    .line 295
    const v24, 0x3ee66666    # 0.45f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v25, 0x40400000    # 3.0f

    .line 307
    .line 308
    const/high16 v26, 0x40400000    # 3.0f

    .line 309
    .line 310
    const/16 v21, 0x0

    .line 311
    .line 312
    const v22, 0x3fd47ae1    # 1.66f

    .line 313
    .line 314
    .line 315
    const v23, 0x3fab851f    # 1.34f

    .line 316
    .line 317
    .line 318
    const/high16 v24, 0x40400000    # 3.0f

    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v25, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v26, -0x40800000    # -1.0f

    .line 329
    .line 330
    const v21, 0x3f0ccccd    # 0.55f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const/high16 v23, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const v24, -0x4119999a    # -0.45f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v4, 0x40b1999a    # 5.55f

    .line 344
    .line 345
    .line 346
    const/high16 v6, 0x41a80000    # 21.0f

    .line 347
    .line 348
    const/high16 v7, 0x40a00000    # 5.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const/high16 v6, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const-string v4, ""

    .line 364
    .line 365
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 366
    .line 367
    .line 368
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 375
    .line 376
    .line 377
    move-result-wide v6

    .line 378
    const/4 v2, 0x0

    .line 379
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 387
    .line 388
    .line 389
    move-result v11

    .line 390
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x41a00000    # 20.0f

    .line 396
    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v4, -0x40800000    # -1.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v25, -0x40800000    # -1.0f

    .line 408
    .line 409
    const/high16 v26, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const v21, -0x40f33333    # -0.55f

    .line 412
    .line 413
    .line 414
    const/high16 v23, -0x40800000    # -1.0f

    .line 415
    .line 416
    const v24, 0x3ee66666    # 0.45f

    .line 417
    .line 418
    .line 419
    move-object/from16 v20, v2

    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v4, 0x3ee66666    # 0.45f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const v21, 0x3f0ccccd    # 0.55f

    .line 438
    .line 439
    .line 440
    const/high16 v23, 0x3f800000    # 1.0f

    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/16 v21, 0x0

    .line 449
    .line 450
    const v22, 0x3f0ccccd    # 0.55f

    .line 451
    .line 452
    .line 453
    const v23, 0x3ee66666    # 0.45f

    .line 454
    .line 455
    .line 456
    const/high16 v24, 0x3f800000    # 1.0f

    .line 457
    .line 458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v26, -0x40800000    # -1.0f

    .line 462
    .line 463
    const v21, 0x3f0ccccd    # 0.55f

    .line 464
    .line 465
    .line 466
    const/16 v22, 0x0

    .line 467
    .line 468
    const/high16 v23, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const v24, -0x4119999a    # -0.45f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x40800000    # 4.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v25, 0x41a00000    # 20.0f

    .line 482
    .line 483
    const/high16 v26, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/high16 v21, 0x41b80000    # 23.0f

    .line 486
    .line 487
    const v22, 0x4015c28f    # 2.34f

    .line 488
    .line 489
    .line 490
    const v23, 0x41ad47ae    # 21.66f

    .line 491
    .line 492
    .line 493
    const/high16 v24, 0x3f800000    # 1.0f

    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const/4 v7, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    const/4 v2, 0x0

    .line 522
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41b00000    # 22.0f

    .line 539
    .line 540
    const/high16 v6, 0x41900000    # 18.0f

    .line 541
    .line 542
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v25, -0x40800000    # -1.0f

    .line 546
    .line 547
    const v21, -0x40f33333    # -0.55f

    .line 548
    .line 549
    .line 550
    const/16 v22, 0x0

    .line 551
    .line 552
    const/high16 v23, -0x40800000    # -1.0f

    .line 553
    .line 554
    const v24, 0x3ee66666    # 0.45f

    .line 555
    .line 556
    .line 557
    move-object/from16 v20, v2

    .line 558
    .line 559
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x3f800000    # 1.0f

    .line 563
    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/16 v21, 0x0

    .line 568
    .line 569
    const v22, 0x3f0ccccd    # 0.55f

    .line 570
    .line 571
    .line 572
    const v23, -0x4119999a    # -0.45f

    .line 573
    .line 574
    .line 575
    const/high16 v24, 0x3f800000    # 1.0f

    .line 576
    .line 577
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, -0x40800000    # -1.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v21, -0x40f33333    # -0.55f

    .line 586
    .line 587
    .line 588
    const/16 v22, 0x0

    .line 589
    .line 590
    const/high16 v23, -0x40800000    # -1.0f

    .line 591
    .line 592
    const v24, 0x3ee66666    # 0.45f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v4, 0x3ee66666    # 0.45f

    .line 599
    .line 600
    .line 601
    const/high16 v6, 0x3f800000    # 1.0f

    .line 602
    .line 603
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v4, 0x3f800000    # 1.0f

    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v25, 0x40400000    # 3.0f

    .line 612
    .line 613
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 614
    .line 615
    const v21, 0x3fd47ae1    # 1.66f

    .line 616
    .line 617
    .line 618
    const/high16 v23, 0x40400000    # 3.0f

    .line 619
    .line 620
    const v24, -0x40547ae1    # -1.34f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v4, -0x40800000    # -1.0f

    .line 627
    .line 628
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v25, 0x41b00000    # 22.0f

    .line 632
    .line 633
    const/high16 v26, 0x41900000    # 18.0f

    .line 634
    .line 635
    const/high16 v21, 0x41b80000    # 23.0f

    .line 636
    .line 637
    const v22, 0x4193999a    # 18.45f

    .line 638
    .line 639
    .line 640
    const v23, 0x41b46666    # 22.55f

    .line 641
    .line 642
    .line 643
    const/high16 v24, 0x41900000    # 18.0f

    .line 644
    .line 645
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    const/4 v7, 0x0

    .line 656
    const-string v4, ""

    .line 657
    .line 658
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 659
    .line 660
    .line 661
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 666
    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 668
    .line 669
    .line 670
    move-result-wide v6

    .line 671
    const/4 v0, 0x0

    .line 672
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 680
    .line 681
    .line 682
    move-result v11

    .line 683
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x41980000    # 19.0f

    .line 689
    .line 690
    const v2, 0x416deb85    # 14.87f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v0, 0x4112147b    # 9.13f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v17, -0x40800000    # -1.0f

    .line 703
    .line 704
    const v18, -0x40228f5c    # -1.73f

    .line 705
    .line 706
    .line 707
    const v14, -0x40c7ae14    # -0.72f

    .line 708
    .line 709
    .line 710
    const v15, -0x413d70a4    # -0.38f

    .line 711
    .line 712
    .line 713
    const v16, -0x404f5c29    # -1.38f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v0, -0x3f600000    # -5.0f

    .line 720
    .line 721
    const v2, -0x3fc7ae14    # -2.88f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v18, -0x4175c28f    # -0.27f

    .line 728
    .line 729
    .line 730
    const v13, -0x416147ae    # -0.31f

    .line 731
    .line 732
    .line 733
    const v14, -0x41c7ae14    # -0.18f

    .line 734
    .line 735
    .line 736
    const v15, -0x40d9999a    # -0.65f

    .line 737
    .line 738
    .line 739
    const v16, -0x4175c28f    # -0.27f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x3db851ec    # 0.09f

    .line 746
    .line 747
    .line 748
    const v2, 0x3e8a3d71    # 0.27f

    .line 749
    .line 750
    .line 751
    const/high16 v4, -0x40800000    # -1.0f

    .line 752
    .line 753
    const v6, -0x40cf5c29    # -0.69f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, 0x40ec7ae1    # 7.39f

    .line 760
    .line 761
    .line 762
    const/high16 v2, 0x40c00000    # 6.0f

    .line 763
    .line 764
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v17, 0x40a00000    # 5.0f

    .line 768
    .line 769
    const v18, 0x4112147b    # 9.13f

    .line 770
    .line 771
    .line 772
    const v13, 0x40ac28f6    # 5.38f

    .line 773
    .line 774
    .line 775
    const/high16 v14, 0x40f80000    # 7.75f

    .line 776
    .line 777
    const/high16 v15, 0x40a00000    # 5.0f

    .line 778
    .line 779
    const v16, 0x41068f5c    # 8.41f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x40b7ae14    # 5.74f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v17, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const v18, 0x3fdd70a4    # 1.73f

    .line 794
    .line 795
    .line 796
    const/4 v13, 0x0

    .line 797
    const v14, 0x3f3851ec    # 0.72f

    .line 798
    .line 799
    .line 800
    const v15, 0x3ec28f5c    # 0.38f

    .line 801
    .line 802
    .line 803
    const v16, 0x3fb0a3d7    # 1.38f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v0, 0x403851ec    # 2.88f

    .line 810
    .line 811
    .line 812
    const/high16 v2, 0x40a00000    # 5.0f

    .line 813
    .line 814
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v18, 0x3e8a3d71    # 0.27f

    .line 818
    .line 819
    .line 820
    const v13, 0x3e9eb852    # 0.31f

    .line 821
    .line 822
    .line 823
    const v14, 0x3e3851ec    # 0.18f

    .line 824
    .line 825
    .line 826
    const v15, 0x3f266666    # 0.65f

    .line 827
    .line 828
    .line 829
    const v16, 0x3e8a3d71    # 0.27f

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v0, -0x4247ae14    # -0.09f

    .line 836
    .line 837
    .line 838
    const v2, -0x4175c28f    # -0.27f

    .line 839
    .line 840
    .line 841
    const/high16 v4, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const v6, 0x3f30a3d7    # 0.69f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v0, -0x3fc7ae14    # -2.88f

    .line 850
    .line 851
    .line 852
    const/high16 v2, 0x40a00000    # 5.0f

    .line 853
    .line 854
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v17, 0x41980000    # 19.0f

    .line 858
    .line 859
    const v18, 0x416deb85    # 14.87f

    .line 860
    .line 861
    .line 862
    const v13, 0x4194f5c3    # 18.62f

    .line 863
    .line 864
    .line 865
    const/high16 v14, 0x41820000    # 16.25f

    .line 866
    .line 867
    const/high16 v15, 0x41980000    # 19.0f

    .line 868
    .line 869
    const v16, 0x417970a4    # 15.59f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v0, 0x41300000    # 11.0f

    .line 879
    .line 880
    const v2, 0x41895c29    # 17.17f

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v0, -0x3feccccd    # -2.3f

    .line 887
    .line 888
    .line 889
    const/high16 v2, -0x3f800000    # -4.0f

    .line 890
    .line 891
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v0, -0x3f6bd70a    # -4.63f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v0, 0x40151eb8    # 2.33f

    .line 901
    .line 902
    .line 903
    const/high16 v2, 0x40800000    # 4.0f

    .line 904
    .line 905
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v0, 0x41895c29    # 17.17f

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v0, 0x412d70a4    # 10.84f

    .line 918
    .line 919
    .line 920
    const/high16 v2, 0x41400000    # 12.0f

    .line 921
    .line 922
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, 0x4100a3d7    # 8.04f

    .line 926
    .line 927
    .line 928
    const v2, 0x41087ae1    # 8.53f

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const/high16 v0, 0x40c80000    # 6.25f

    .line 935
    .line 936
    const/high16 v2, 0x41400000    # 12.0f

    .line 937
    .line 938
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, 0x407d70a4    # 3.96f

    .line 942
    .line 943
    .line 944
    const v2, 0x4011eb85    # 2.28f

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v0, 0x412d70a4    # 10.84f

    .line 951
    .line 952
    .line 953
    const/high16 v2, 0x41400000    # 12.0f

    .line 954
    .line 955
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v0, 0x41880000    # 17.0f

    .line 962
    .line 963
    const v2, 0x416deb85    # 14.87f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v0, 0x40133333    # 2.3f

    .line 970
    .line 971
    .line 972
    const/high16 v2, -0x3f800000    # -4.0f

    .line 973
    .line 974
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v0, -0x3f6ccccd    # -4.6f

    .line 978
    .line 979
    .line 980
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const v0, -0x3feae148    # -2.33f

    .line 984
    .line 985
    .line 986
    const/high16 v2, 0x40800000    # 4.0f

    .line 987
    .line 988
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    const v0, 0x416deb85    # 14.87f

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    const/16 v16, 0x3800

    .line 1005
    .line 1006
    const/16 v17, 0x0

    .line 1007
    .line 1008
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1009
    .line 1010
    const/4 v7, 0x0

    .line 1011
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1012
    .line 1013
    const/4 v13, 0x0

    .line 1014
    const/4 v14, 0x0

    .line 1015
    const/4 v15, 0x0

    .line 1016
    const-string v4, ""

    .line 1017
    .line 1018
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    sput-object v0, Landroidx/compose/material/icons/rounded/ViewInArKt;->_viewInAr:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1027
    .line 1028
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    return-object v0
.end method
