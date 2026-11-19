.class public final Landroidx/compose/material/icons/rounded/AddChartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addChart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddChart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddChartKt;->_addChart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddChart"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, -0x40800000    # -1.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, -0x40f33333    # -0.55f

    .line 106
    .line 107
    .line 108
    const v23, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v24, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x3ee66666    # 0.45f

    .line 117
    .line 118
    .line 119
    const/high16 v6, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v7, -0x40800000    # -1.0f

    .line 122
    .line 123
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x41800000    # 16.0f

    .line 132
    .line 133
    const/high16 v26, 0x41880000    # 17.0f

    .line 134
    .line 135
    const/high16 v21, 0x41700000    # 15.0f

    .line 136
    .line 137
    const v22, 0x41846666    # 16.55f

    .line 138
    .line 139
    .line 140
    const v23, 0x41773333    # 15.45f

    .line 141
    .line 142
    .line 143
    const/high16 v24, 0x41880000    # 17.0f

    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const/16 v16, 0x3800

    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const/high16 v8, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    const/high16 v9, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v12, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    const-string v4, ""

    .line 170
    .line 171
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    const/4 v2, 0x0

    .line 185
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x41a00000    # 20.0f

    .line 202
    .line 203
    const/high16 v6, 0x41200000    # 10.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/high16 v26, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const v21, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    const/16 v22, 0x0

    .line 216
    .line 217
    const/high16 v23, -0x40800000    # -1.0f

    .line 218
    .line 219
    const v24, 0x3ee66666    # 0.45f

    .line 220
    .line 221
    .line 222
    move-object/from16 v20, v2

    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41000000    # 8.0f

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x40a00000    # 5.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41000000    # 8.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v26, -0x40800000    # -1.0f

    .line 248
    .line 249
    const v21, 0x3f0ccccd    # 0.55f

    .line 250
    .line 251
    .line 252
    const/high16 v23, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const v24, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v6, -0x40800000    # -1.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40a00000    # 5.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, 0x40400000    # 3.0f

    .line 274
    .line 275
    const/high16 v26, 0x40a00000    # 5.0f

    .line 276
    .line 277
    const v21, 0x4079999a    # 3.9f

    .line 278
    .line 279
    .line 280
    const/high16 v22, 0x40400000    # 3.0f

    .line 281
    .line 282
    const/high16 v23, 0x40400000    # 3.0f

    .line 283
    .line 284
    const v24, 0x4079999a    # 3.9f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41600000    # 14.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x40000000    # 2.0f

    .line 296
    .line 297
    const/high16 v26, 0x40000000    # 2.0f

    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const v22, 0x3f8ccccd    # 1.1f

    .line 302
    .line 303
    .line 304
    const v23, 0x3f666666    # 0.9f

    .line 305
    .line 306
    .line 307
    const/high16 v24, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v26, -0x40000000    # -2.0f

    .line 316
    .line 317
    const v21, 0x3f8ccccd    # 1.1f

    .line 318
    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/high16 v23, 0x40000000    # 2.0f

    .line 323
    .line 324
    const v24, -0x4099999a    # -0.9f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, -0x3f000000    # -8.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, 0x41a00000    # 20.0f

    .line 336
    .line 337
    const/high16 v26, 0x41200000    # 10.0f

    .line 338
    .line 339
    const/high16 v21, 0x41a80000    # 21.0f

    .line 340
    .line 341
    const v22, 0x41273333    # 10.45f

    .line 342
    .line 343
    .line 344
    const v23, 0x41a46666    # 20.55f

    .line 345
    .line 346
    .line 347
    const/high16 v24, 0x41200000    # 10.0f

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41300000    # 11.0f

    .line 395
    .line 396
    const/high16 v6, 0x40e00000    # 7.0f

    .line 397
    .line 398
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40a00000    # 5.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v25, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v26, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/16 v21, 0x0

    .line 411
    .line 412
    const v22, 0x3f0ccccd    # 0.55f

    .line 413
    .line 414
    .line 415
    const v23, 0x3ee66666    # 0.45f

    .line 416
    .line 417
    .line 418
    const/high16 v24, 0x3f800000    # 1.0f

    .line 419
    .line 420
    move-object/from16 v20, v2

    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, -0x4119999a    # -0.45f

    .line 426
    .line 427
    .line 428
    const/high16 v6, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/high16 v7, -0x40800000    # -1.0f

    .line 431
    .line 432
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, -0x3f600000    # -5.0f

    .line 436
    .line 437
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v25, -0x40800000    # -1.0f

    .line 441
    .line 442
    const/high16 v26, -0x40800000    # -1.0f

    .line 443
    .line 444
    const v22, -0x40f33333    # -0.55f

    .line 445
    .line 446
    .line 447
    const v23, -0x4119999a    # -0.45f

    .line 448
    .line 449
    .line 450
    const/high16 v24, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v4, 0x41273333    # 10.45f

    .line 456
    .line 457
    .line 458
    const/high16 v6, 0x41300000    # 11.0f

    .line 459
    .line 460
    const/high16 v7, 0x40e00000    # 7.0f

    .line 461
    .line 462
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const-string v4, ""

    .line 476
    .line 477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 478
    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 485
    .line 486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 487
    .line 488
    .line 489
    move-result-wide v6

    .line 490
    const/4 v2, 0x0

    .line 491
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x41300000    # 11.0f

    .line 508
    .line 509
    const/high16 v6, 0x41000000    # 8.0f

    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x41000000    # 8.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v26, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const v22, 0x3f0ccccd    # 0.55f

    .line 524
    .line 525
    .line 526
    const v23, 0x3ee66666    # 0.45f

    .line 527
    .line 528
    .line 529
    const/high16 v24, 0x3f800000    # 1.0f

    .line 530
    .line 531
    move-object/from16 v20, v2

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v4, -0x4119999a    # -0.45f

    .line 537
    .line 538
    .line 539
    const/high16 v6, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v7, -0x40800000    # -1.0f

    .line 542
    .line 543
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v4, 0x41000000    # 8.0f

    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v25, -0x40800000    # -1.0f

    .line 552
    .line 553
    const/high16 v26, -0x40800000    # -1.0f

    .line 554
    .line 555
    const v22, -0x40f33333    # -0.55f

    .line 556
    .line 557
    .line 558
    const v23, -0x4119999a    # -0.45f

    .line 559
    .line 560
    .line 561
    const/high16 v24, -0x40800000    # -1.0f

    .line 562
    .line 563
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v4, 0x40ee6666    # 7.45f

    .line 567
    .line 568
    .line 569
    const/high16 v6, 0x41300000    # 11.0f

    .line 570
    .line 571
    const/high16 v7, 0x41000000    # 8.0f

    .line 572
    .line 573
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 596
    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 598
    .line 599
    .line 600
    move-result-wide v6

    .line 601
    const/4 v0, 0x0

    .line 602
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 610
    .line 611
    .line 612
    move-result v11

    .line 613
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41800000    # 16.0f

    .line 619
    .line 620
    const/high16 v2, 0x40e00000    # 7.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x3f800000    # 1.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/high16 v18, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const v14, 0x3f0ccccd    # 0.55f

    .line 638
    .line 639
    .line 640
    const v15, 0x3ee66666    # 0.45f

    .line 641
    .line 642
    .line 643
    const/high16 v16, 0x3f800000    # 1.0f

    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, -0x4119999a    # -0.45f

    .line 649
    .line 650
    .line 651
    const/high16 v2, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/high16 v4, -0x40800000    # -1.0f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x40e00000    # 7.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x3f800000    # 1.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v18, -0x40800000    # -1.0f

    .line 669
    .line 670
    const v13, 0x3f0ccccd    # 0.55f

    .line 671
    .line 672
    .line 673
    const/4 v14, 0x0

    .line 674
    const/high16 v15, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const v16, -0x4119999a    # -0.45f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x4119999a    # -0.45f

    .line 683
    .line 684
    .line 685
    const/high16 v2, -0x40800000    # -1.0f

    .line 686
    .line 687
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, -0x40800000    # -1.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x40800000    # 4.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v17, -0x40800000    # -1.0f

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    const v14, -0x40f33333    # -0.55f

    .line 704
    .line 705
    .line 706
    const v15, -0x4119999a    # -0.45f

    .line 707
    .line 708
    .line 709
    const/high16 v16, -0x40800000    # -1.0f

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, 0x3ee66666    # 0.45f

    .line 715
    .line 716
    .line 717
    const/high16 v2, 0x3f800000    # 1.0f

    .line 718
    .line 719
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x3f800000    # 1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, -0x40800000    # -1.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v18, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const v13, -0x40f33333    # -0.55f

    .line 735
    .line 736
    .line 737
    const/4 v14, 0x0

    .line 738
    const/high16 v15, -0x40800000    # -1.0f

    .line 739
    .line 740
    const v16, 0x3ee66666    # 0.45f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x41773333    # 15.45f

    .line 747
    .line 748
    .line 749
    const/high16 v2, 0x41800000    # 16.0f

    .line 750
    .line 751
    const/high16 v4, 0x40e00000    # 7.0f

    .line 752
    .line 753
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/16 v16, 0x3800

    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    const/high16 v6, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v7, 0x0

    .line 770
    const/high16 v12, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const/4 v15, 0x0

    .line 774
    const-string v4, ""

    .line 775
    .line 776
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    sput-object v0, Landroidx/compose/material/icons/rounded/AddChartKt;->_addChart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 785
    .line 786
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    return-object v0
.end method
