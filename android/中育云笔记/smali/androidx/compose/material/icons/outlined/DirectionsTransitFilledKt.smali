.class public final Landroidx/compose/material/icons/outlined/DirectionsTransitFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsTransitFilled(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DirectionsTransitFilledKt;->_directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DirectionsTransitFilled"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/high16 v21, 0x41000000    # 8.0f

    .line 82
    .line 83
    const/high16 v22, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v23, 0x40800000    # 4.0f

    .line 86
    .line 87
    const/high16 v24, 0x40200000    # 2.5f

    .line 88
    .line 89
    move-object/from16 v20, v2

    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41180000    # 9.5f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40f00000    # 7.5f

    .line 100
    .line 101
    const/high16 v26, 0x41980000    # 19.0f

    .line 102
    .line 103
    const/high16 v21, 0x40800000    # 4.0f

    .line 104
    .line 105
    const v22, 0x418b70a4    # 17.43f

    .line 106
    .line 107
    .line 108
    const v23, 0x40b23d71    # 5.57f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x41980000    # 19.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41a00000    # 20.0f

    .line 117
    .line 118
    const/high16 v6, 0x40c00000    # 6.0f

    .line 119
    .line 120
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x3f800000    # 1.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41400000    # 12.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v6, -0x40400000    # -1.5f

    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x40600000    # 3.5f

    .line 144
    .line 145
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 146
    .line 147
    const v21, 0x3ff70a3d    # 1.93f

    .line 148
    .line 149
    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    const/high16 v23, 0x40600000    # 3.5f

    .line 153
    .line 154
    const v24, -0x40370a3d    # -1.57f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x40c00000    # 6.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x41400000    # 12.0f

    .line 166
    .line 167
    const/high16 v26, 0x40000000    # 2.0f

    .line 168
    .line 169
    const/high16 v21, 0x41a00000    # 20.0f

    .line 170
    .line 171
    const/high16 v22, 0x40200000    # 2.5f

    .line 172
    .line 173
    const v23, 0x41835c29    # 16.42f

    .line 174
    .line 175
    .line 176
    const/high16 v24, 0x40000000    # 2.0f

    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40800000    # 4.0f

    .line 185
    .line 186
    const/high16 v6, 0x41400000    # 12.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x40b570a4    # 5.67f

    .line 192
    .line 193
    .line 194
    const/high16 v26, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const v21, 0x406d70a4    # 3.71f

    .line 197
    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const v23, 0x40a428f6    # 5.13f

    .line 202
    .line 203
    .line 204
    const v24, 0x3eeb851f    # 0.46f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41500000    # 13.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, -0x40000000    # -2.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x40cdc28f    # 6.43f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x41400000    # 12.0f

    .line 227
    .line 228
    const/high16 v26, 0x40800000    # 4.0f

    .line 229
    .line 230
    const v21, 0x40e0f5c3    # 7.03f

    .line 231
    .line 232
    .line 233
    const v22, 0x408f5c29    # 4.48f

    .line 234
    .line 235
    .line 236
    const v23, 0x4107ae14    # 8.48f

    .line 237
    .line 238
    .line 239
    const/high16 v24, 0x40800000    # 4.0f

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x40e00000    # 7.0f

    .line 248
    .line 249
    const/high16 v6, 0x40c00000    # 6.0f

    .line 250
    .line 251
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40a00000    # 5.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x40400000    # 3.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x40c00000    # 6.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x40e00000    # 7.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41900000    # 18.0f

    .line 278
    .line 279
    const/high16 v6, 0x41780000    # 15.5f

    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v25, -0x40400000    # -1.5f

    .line 285
    .line 286
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 287
    .line 288
    const/16 v21, 0x0

    .line 289
    .line 290
    const v22, 0x3f547ae1    # 0.83f

    .line 291
    .line 292
    .line 293
    const v23, -0x40d47ae1    # -0.67f

    .line 294
    .line 295
    .line 296
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v25, 0x40c00000    # 6.0f

    .line 307
    .line 308
    const/high16 v26, 0x41780000    # 15.5f

    .line 309
    .line 310
    const v21, 0x40d570a4    # 6.67f

    .line 311
    .line 312
    .line 313
    const/high16 v22, 0x41880000    # 17.0f

    .line 314
    .line 315
    const/high16 v23, 0x40c00000    # 6.0f

    .line 316
    .line 317
    const v24, 0x4182a3d7    # 16.33f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x41400000    # 12.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41780000    # 15.5f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v4, 0x41200000    # 10.0f

    .line 340
    .line 341
    const/high16 v6, 0x41900000    # 18.0f

    .line 342
    .line 343
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v4, -0x3f600000    # -5.0f

    .line 347
    .line 348
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x40e00000    # 7.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x40a00000    # 5.0f

    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x41200000    # 10.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/16 v16, 0x3800

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const/high16 v6, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v8, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/4 v7, 0x0

    .line 382
    const/high16 v9, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/high16 v12, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/4 v13, 0x0

    .line 387
    const/4 v14, 0x0

    .line 388
    const/4 v15, 0x0

    .line 389
    const-string v4, ""

    .line 390
    .line 391
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 392
    .line 393
    .line 394
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 399
    .line 400
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 401
    .line 402
    .line 403
    move-result-wide v6

    .line 404
    const/4 v2, 0x0

    .line 405
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x41080000    # 8.5f

    .line 422
    .line 423
    const/high16 v6, 0x41680000    # 14.5f

    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/4 v4, 0x0

    .line 429
    const/high16 v6, -0x40400000    # -1.5f

    .line 430
    .line 431
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v26, 0x40400000    # 3.0f

    .line 435
    .line 436
    const/16 v27, 0x0

    .line 437
    .line 438
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 439
    .line 440
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 441
    .line 442
    const/16 v23, 0x0

    .line 443
    .line 444
    const/16 v24, 0x1

    .line 445
    .line 446
    const/16 v25, 0x1

    .line 447
    .line 448
    move-object/from16 v20, v2

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 454
    .line 455
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/high16 v6, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/4 v7, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 475
    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 477
    .line 478
    .line 479
    move-result-wide v6

    .line 480
    const/4 v0, 0x0

    .line 481
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41680000    # 14.5f

    .line 498
    .line 499
    const/high16 v2, 0x41780000    # 15.5f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/4 v0, 0x0

    .line 505
    const/high16 v2, -0x40400000    # -1.5f

    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v18, 0x40400000    # 3.0f

    .line 511
    .line 512
    const/16 v19, 0x0

    .line 513
    .line 514
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 515
    .line 516
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 517
    .line 518
    const/16 v16, 0x1

    .line 519
    .line 520
    const/16 v17, 0x1

    .line 521
    .line 522
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/16 v16, 0x3800

    .line 535
    .line 536
    const/16 v17, 0x0

    .line 537
    .line 538
    const/high16 v6, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const/high16 v12, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    const/4 v14, 0x0

    .line 545
    const-string v4, ""

    .line 546
    .line 547
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    sput-object v0, Landroidx/compose/material/icons/outlined/DirectionsTransitFilledKt;->_directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 556
    .line 557
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    return-object v0
.end method
