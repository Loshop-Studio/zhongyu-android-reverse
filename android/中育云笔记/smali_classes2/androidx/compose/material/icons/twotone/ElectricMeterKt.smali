.class public final Landroidx/compose/material/icons/twotone/ElectricMeterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricMeter(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ElectricMeterKt;->_electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ElectricMeter"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

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
    const v4, 0x417dc28f    # 15.86f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 128
    .line 129
    const/high16 v6, 0x41640000    # 14.25f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40400000    # 3.0f

    .line 135
    .line 136
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, -0x40400000    # -1.5f

    .line 142
    .line 143
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41300000    # 11.0f

    .line 147
    .line 148
    const/high16 v6, 0x41640000    # 14.25f

    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x411c0000    # 9.75f

    .line 154
    .line 155
    const/high16 v6, 0x41500000    # 13.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x40400000    # 3.0f

    .line 161
    .line 162
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x414c0000    # 12.75f

    .line 173
    .line 174
    const/high16 v6, 0x41500000    # 13.0f

    .line 175
    .line 176
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x41600000    # 14.0f

    .line 180
    .line 181
    const/high16 v6, 0x41640000    # 14.25f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41800000    # 16.0f

    .line 190
    .line 191
    const/high16 v6, 0x41100000    # 9.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x41000000    # 8.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x40e00000    # 7.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41000000    # 8.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x41100000    # 9.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const/16 v16, 0x3800

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const v6, 0x3e99999a    # 0.3f

    .line 228
    .line 229
    .line 230
    const v8, 0x3e99999a    # 0.3f

    .line 231
    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/high16 v9, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v12, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    const/4 v15, 0x0

    .line 241
    const-string v4, ""

    .line 242
    .line 243
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    const/4 v2, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x40000000    # 2.0f

    .line 274
    .line 275
    const/high16 v6, 0x41400000    # 12.0f

    .line 276
    .line 277
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 281
    .line 282
    const/high16 v26, 0x41100000    # 9.0f

    .line 283
    .line 284
    const v21, -0x3f60f5c3    # -4.97f

    .line 285
    .line 286
    .line 287
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 288
    .line 289
    const v24, 0x4080f5c3    # 4.03f

    .line 290
    .line 291
    .line 292
    move-object/from16 v20, v2

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, 0x40c00000    # 6.0f

    .line 298
    .line 299
    const v26, 0x4107ae14    # 8.48f

    .line 300
    .line 301
    .line 302
    const/16 v21, 0x0

    .line 303
    .line 304
    const v22, 0x407ae148    # 3.92f

    .line 305
    .line 306
    .line 307
    const v23, 0x4020a3d7    # 2.51f

    .line 308
    .line 309
    .line 310
    const v24, 0x40e7ae14    # 7.24f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, 0x41b00000    # 22.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x40000000    # 2.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v4, -0x3ffc28f6    # -2.06f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v26, 0x3d75c28f    # 0.06f

    .line 335
    .line 336
    .line 337
    const v21, 0x3ea8f5c3    # 0.33f

    .line 338
    .line 339
    .line 340
    const v22, 0x3d23d70a    # 0.04f

    .line 341
    .line 342
    .line 343
    const v23, 0x3f28f5c3    # 0.66f

    .line 344
    .line 345
    .line 346
    const v24, 0x3d75c28f    # 0.06f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const v6, -0x428a3d71    # -0.06f

    .line 355
    .line 356
    .line 357
    const v7, 0x3f2b851f    # 0.67f

    .line 358
    .line 359
    .line 360
    const v8, -0x435c28f6    # -0.02f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x41b00000    # 22.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x40000000    # 2.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v4, -0x3fdeb852    # -2.52f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, 0x40c00000    # 6.0f

    .line 383
    .line 384
    const v26, -0x3ef851ec    # -8.48f

    .line 385
    .line 386
    .line 387
    const v21, 0x405f5c29    # 3.49f

    .line 388
    .line 389
    .line 390
    const v22, -0x406147ae    # -1.24f

    .line 391
    .line 392
    .line 393
    const/high16 v23, 0x40c00000    # 6.0f

    .line 394
    .line 395
    const v24, -0x3f6e147b    # -4.56f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, 0x41400000    # 12.0f

    .line 402
    .line 403
    const/high16 v26, 0x40000000    # 2.0f

    .line 404
    .line 405
    const/high16 v21, 0x41a80000    # 21.0f

    .line 406
    .line 407
    const v22, 0x40c0f5c3    # 6.03f

    .line 408
    .line 409
    .line 410
    const v23, 0x4187c28f    # 16.97f

    .line 411
    .line 412
    .line 413
    const/high16 v24, 0x40000000    # 2.0f

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x41900000    # 18.0f

    .line 422
    .line 423
    const/high16 v6, 0x41400000    # 12.0f

    .line 424
    .line 425
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v25, -0x3f200000    # -7.0f

    .line 429
    .line 430
    const/high16 v26, -0x3f200000    # -7.0f

    .line 431
    .line 432
    const v21, -0x3f88f5c3    # -3.86f

    .line 433
    .line 434
    .line 435
    const/16 v22, 0x0

    .line 436
    .line 437
    const/high16 v23, -0x3f200000    # -7.0f

    .line 438
    .line 439
    const v24, -0x3fb70a3d    # -3.14f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v4, -0x3f200000    # -7.0f

    .line 446
    .line 447
    const v6, 0x4048f5c3    # 3.14f

    .line 448
    .line 449
    .line 450
    const/high16 v7, 0x40e00000    # 7.0f

    .line 451
    .line 452
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v4, 0x4048f5c3    # 3.14f

    .line 456
    .line 457
    .line 458
    const/high16 v6, 0x40e00000    # 7.0f

    .line 459
    .line 460
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v4, 0x417dc28f    # 15.86f

    .line 464
    .line 465
    .line 466
    const/high16 v6, 0x41900000    # 18.0f

    .line 467
    .line 468
    const/high16 v7, 0x41400000    # 12.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/high16 v8, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    const/4 v2, 0x0

    .line 501
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x41000000    # 8.0f

    .line 518
    .line 519
    const/high16 v6, 0x40e00000    # 7.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v4, 0x40000000    # 2.0f

    .line 528
    .line 529
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v4, -0x3f000000    # -8.0f

    .line 533
    .line 534
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/high16 v6, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 557
    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 559
    .line 560
    .line 561
    move-result-wide v6

    .line 562
    const/4 v0, 0x0

    .line 563
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 571
    .line 572
    .line 573
    move-result v11

    .line 574
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x41200000    # 10.0f

    .line 580
    .line 581
    const/high16 v4, 0x414c0000    # 12.75f

    .line 582
    .line 583
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v2, 0x40400000    # 3.0f

    .line 587
    .line 588
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 589
    .line 590
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 594
    .line 595
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v2, -0x40600000    # -1.25f

    .line 599
    .line 600
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 601
    .line 602
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 606
    .line 607
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v2, 0x40400000    # 3.0f

    .line 611
    .line 612
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 613
    .line 614
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v2, -0x40600000    # -1.25f

    .line 618
    .line 619
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 623
    .line 624
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const/high16 v6, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v7, 0x0

    .line 637
    const-string v4, ""

    .line 638
    .line 639
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    sput-object v0, Landroidx/compose/material/icons/twotone/ElectricMeterKt;->_electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v0
.end method
