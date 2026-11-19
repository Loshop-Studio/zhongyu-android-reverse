.class public final Landroidx/compose/material/icons/outlined/CoPresentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoPresent(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CoPresentKt;->_coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CoPresent"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x3ff33333    # 1.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40a00000    # 5.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41900000    # 18.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/high16 v26, -0x40000000    # -2.0f

    .line 129
    .line 130
    const v21, 0x3f8ccccd    # 1.1f

    .line 131
    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const/high16 v23, 0x40000000    # 2.0f

    .line 136
    .line 137
    const v24, -0x4099999a    # -0.9f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40a00000    # 5.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x41a80000    # 21.0f

    .line 149
    .line 150
    const/high16 v26, 0x40400000    # 3.0f

    .line 151
    .line 152
    const/high16 v21, 0x41b80000    # 23.0f

    .line 153
    .line 154
    const v22, 0x4079999a    # 3.9f

    .line 155
    .line 156
    .line 157
    const v23, 0x41b0cccd    # 22.1f

    .line 158
    .line 159
    .line 160
    const/high16 v24, 0x40400000    # 3.0f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const/16 v16, 0x3800

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const/high16 v6, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v8, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 221
    .line 222
    const/high16 v6, 0x41200000    # 10.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, -0x3f800000    # -4.0f

    .line 228
    .line 229
    const/high16 v26, -0x3f800000    # -4.0f

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const v22, -0x3ff28f5c    # -2.21f

    .line 234
    .line 235
    .line 236
    const v23, -0x401ae148    # -1.79f

    .line 237
    .line 238
    .line 239
    const/high16 v24, -0x3f800000    # -4.0f

    .line 240
    .line 241
    move-object/from16 v20, v2

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x3fe51eb8    # 1.79f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/high16 v7, -0x3f800000    # -4.0f

    .line 252
    .line 253
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, 0x40800000    # 4.0f

    .line 257
    .line 258
    const/high16 v26, 0x40800000    # 4.0f

    .line 259
    .line 260
    const v22, 0x400d70a4    # 2.21f

    .line 261
    .line 262
    .line 263
    const v23, 0x3fe51eb8    # 1.79f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x40800000    # 4.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x41435c29    # 12.21f

    .line 272
    .line 273
    .line 274
    const/high16 v6, 0x41500000    # 13.0f

    .line 275
    .line 276
    const/high16 v7, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40e00000    # 7.0f

    .line 285
    .line 286
    const/high16 v6, 0x41200000    # 10.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x40000000    # 2.0f

    .line 292
    .line 293
    const/high16 v26, -0x40000000    # -2.0f

    .line 294
    .line 295
    const v22, -0x40733333    # -1.1f

    .line 296
    .line 297
    .line 298
    const v23, 0x3f666666    # 0.9f

    .line 299
    .line 300
    .line 301
    const/high16 v24, -0x40000000    # -2.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x3f666666    # 0.9f

    .line 307
    .line 308
    .line 309
    const/high16 v6, 0x40000000    # 2.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v25, -0x40000000    # -2.0f

    .line 315
    .line 316
    const/high16 v26, 0x40000000    # 2.0f

    .line 317
    .line 318
    const v22, 0x3f8ccccd    # 1.1f

    .line 319
    .line 320
    .line 321
    const v23, -0x4099999a    # -0.9f

    .line 322
    .line 323
    .line 324
    const/high16 v24, 0x40000000    # 2.0f

    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x4131999a    # 11.1f

    .line 330
    .line 331
    .line 332
    const/high16 v6, 0x40e00000    # 7.0f

    .line 333
    .line 334
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    const/high16 v6, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    const-string v4, ""

    .line 348
    .line 349
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 350
    .line 351
    .line 352
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 357
    .line 358
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 359
    .line 360
    .line 361
    move-result-wide v6

    .line 362
    const/4 v0, 0x0

    .line 363
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    const v0, 0x41763d71    # 15.39f

    .line 380
    .line 381
    .line 382
    const v2, 0x41847ae1    # 16.56f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x41100000    # 9.0f

    .line 389
    .line 390
    const/high16 v18, 0x41700000    # 15.0f

    .line 391
    .line 392
    const v13, 0x415b5c29    # 13.71f

    .line 393
    .line 394
    .line 395
    const v14, 0x417b3333    # 15.7f

    .line 396
    .line 397
    .line 398
    const v15, 0x41387ae1    # 11.53f

    .line 399
    .line 400
    .line 401
    const/high16 v16, 0x41700000    # 15.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, -0x3f33851f    # -6.39f

    .line 407
    .line 408
    .line 409
    const v18, 0x3fc7ae14    # 1.56f

    .line 410
    .line 411
    .line 412
    const v13, -0x3fde147b    # -2.53f

    .line 413
    .line 414
    .line 415
    const/4 v14, 0x0

    .line 416
    const v15, -0x3f6947ae    # -4.71f

    .line 417
    .line 418
    .line 419
    const v16, 0x3f333333    # 0.7f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const v18, 0x4199c28f    # 19.22f

    .line 428
    .line 429
    .line 430
    const v13, 0x3fce147b    # 1.61f

    .line 431
    .line 432
    .line 433
    const v14, 0x41888f5c    # 17.07f

    .line 434
    .line 435
    .line 436
    const/high16 v15, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const v16, 0x4190cccd    # 18.1f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41b00000    # 22.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41800000    # 16.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x3fce147b    # -2.78f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x41763d71    # 15.39f

    .line 461
    .line 462
    .line 463
    const v18, 0x41847ae1    # 16.56f

    .line 464
    .line 465
    .line 466
    const/high16 v13, 0x41880000    # 17.0f

    .line 467
    .line 468
    const v14, 0x4190cccd    # 18.1f

    .line 469
    .line 470
    .line 471
    const v15, 0x41831eb8    # 16.39f

    .line 472
    .line 473
    .line 474
    const v16, 0x41888f5c    # 17.07f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41700000    # 15.0f

    .line 484
    .line 485
    const/high16 v2, 0x41a00000    # 20.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x40400000    # 3.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x3f051eb8    # 0.52f

    .line 496
    .line 497
    .line 498
    const v18, -0x402b851f    # -1.66f

    .line 499
    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    const v14, -0x40c7ae14    # -0.72f

    .line 503
    .line 504
    .line 505
    const v15, -0x42333333    # -0.1f

    .line 506
    .line 507
    .line 508
    const v16, -0x40547ae1    # -1.34f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x41100000    # 9.0f

    .line 515
    .line 516
    const/high16 v18, 0x41880000    # 17.0f

    .line 517
    .line 518
    const v13, 0x4096b852    # 4.71f

    .line 519
    .line 520
    .line 521
    const v14, 0x418dd70a    # 17.73f

    .line 522
    .line 523
    .line 524
    const v15, 0x40d428f6    # 6.63f

    .line 525
    .line 526
    .line 527
    const/high16 v16, 0x41880000    # 17.0f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x40af5c29    # 5.48f

    .line 533
    .line 534
    .line 535
    const v18, 0x3fab851f    # 1.34f

    .line 536
    .line 537
    .line 538
    const v13, 0x4017ae14    # 2.37f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const v15, 0x408947ae    # 4.29f

    .line 543
    .line 544
    .line 545
    const v16, 0x3f3ae148    # 0.73f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x41700000    # 15.0f

    .line 552
    .line 553
    const/high16 v18, 0x41a00000    # 20.0f

    .line 554
    .line 555
    const v13, 0x4171c28f    # 15.11f

    .line 556
    .line 557
    .line 558
    const v14, 0x419547ae    # 18.66f

    .line 559
    .line 560
    .line 561
    const/high16 v15, 0x41700000    # 15.0f

    .line 562
    .line 563
    const v16, 0x419a51ec    # 19.29f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    const/16 v16, 0x3800

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const/high16 v6, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v7, 0x0

    .line 583
    const/high16 v12, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const/4 v14, 0x0

    .line 587
    const/4 v15, 0x0

    .line 588
    const-string v4, ""

    .line 589
    .line 590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    sput-object v0, Landroidx/compose/material/icons/outlined/CoPresentKt;->_coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 599
    .line 600
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-object v0
.end method
