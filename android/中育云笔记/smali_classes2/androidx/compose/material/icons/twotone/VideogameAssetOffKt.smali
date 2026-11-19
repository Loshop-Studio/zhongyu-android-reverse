.class public final Landroidx/compose/material/icons/twotone/VideogameAssetOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _videogameAssetOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideogameAssetOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VideogameAssetOffKt;->_videogameAssetOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VideogameAssetOff"

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
    const v4, 0x412d47ae    # 10.83f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41000000    # 8.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41a00000    # 20.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x41000000    # 8.0f

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x412d47ae    # 10.83f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41400000    # 12.0f

    .line 103
    .line 104
    const/high16 v6, 0x418c0000    # 17.5f

    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v25, -0x40400000    # -1.5f

    .line 110
    .line 111
    const/high16 v26, -0x40400000    # -1.5f

    .line 112
    .line 113
    const v21, -0x40ab851f    # -0.83f

    .line 114
    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    const/high16 v23, -0x40400000    # -1.5f

    .line 119
    .line 120
    const v24, -0x40d47ae1    # -0.67f

    .line 121
    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x41855c29    # 16.67f

    .line 129
    .line 130
    .line 131
    const/high16 v7, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x411ab852    # 9.67f

    .line 137
    .line 138
    .line 139
    const/high16 v6, 0x41280000    # 10.5f

    .line 140
    .line 141
    const/high16 v7, 0x41980000    # 19.0f

    .line 142
    .line 143
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v4, 0x4192a3d7    # 18.33f

    .line 147
    .line 148
    .line 149
    const/high16 v6, 0x41400000    # 12.0f

    .line 150
    .line 151
    const/high16 v7, 0x418c0000    # 17.5f

    .line 152
    .line 153
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41800000    # 16.0f

    .line 160
    .line 161
    const v6, 0x4152b852    # 13.17f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x41100000    # 9.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x40000000    # 2.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x40e00000    # 7.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, -0x40000000    # -2.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x40a00000    # 5.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, -0x40000000    # -2.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x411d47ae    # 9.83f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x40a570a4    # 5.17f

    .line 214
    .line 215
    .line 216
    const/high16 v6, 0x41000000    # 8.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40800000    # 4.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41000000    # 8.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, 0x4152b852    # 13.17f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const/16 v16, 0x3800

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const v6, 0x3e99999a    # 0.3f

    .line 249
    .line 250
    .line 251
    const v8, 0x3e99999a    # 0.3f

    .line 252
    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const/high16 v9, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/high16 v12, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    const/4 v14, 0x0

    .line 261
    const/4 v15, 0x0

    .line 262
    const-string v4, ""

    .line 263
    .line 264
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 272
    .line 273
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    const/4 v0, 0x0

    .line 278
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 286
    .line 287
    .line 288
    move-result v11

    .line 289
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x418c0000    # 17.5f

    .line 295
    .line 296
    const/high16 v2, 0x41100000    # 9.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 302
    .line 303
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 304
    .line 305
    const v13, 0x3f547ae1    # 0.83f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 309
    .line 310
    const v16, 0x3f2b851f    # 0.67f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4192a3d7    # 18.33f

    .line 317
    .line 318
    .line 319
    const/high16 v2, 0x41400000    # 12.0f

    .line 320
    .line 321
    const/high16 v4, 0x418c0000    # 17.5f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x413547ae    # 11.33f

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x41280000    # 10.5f

    .line 330
    .line 331
    const/high16 v4, 0x41800000    # 16.0f

    .line 332
    .line 333
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x41855c29    # 16.67f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x418c0000    # 17.5f

    .line 340
    .line 341
    const/high16 v4, 0x41100000    # 9.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x412d47ae    # 10.83f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x41000000    # 8.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41a00000    # 20.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41000000    # 8.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x406a3d71    # -1.17f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3fef5c29    # 1.87f

    .line 374
    .line 375
    .line 376
    const v2, 0x3fef5c29    # 1.87f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x41b00000    # 22.0f

    .line 383
    .line 384
    const/high16 v18, 0x41800000    # 16.0f

    .line 385
    .line 386
    const v13, 0x41ab999a    # 21.45f

    .line 387
    .line 388
    .line 389
    const v14, 0x418ca3d7    # 17.58f

    .line 390
    .line 391
    .line 392
    const/high16 v15, 0x41b00000    # 22.0f

    .line 393
    .line 394
    const v16, 0x4186cccd    # 16.85f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41000000    # 8.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40000000    # -2.0f

    .line 406
    .line 407
    const/high16 v18, -0x40000000    # -2.0f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, -0x40733333    # -1.1f

    .line 411
    .line 412
    .line 413
    const v15, -0x4099999a    # -0.9f

    .line 414
    .line 415
    .line 416
    const/high16 v16, -0x40000000    # -2.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x410d47ae    # 8.83f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x412d47ae    # 10.83f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x41000000    # 8.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x419e3d71    # 19.78f

    .line 439
    .line 440
    .line 441
    const v2, 0x41b4e148    # 22.61f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x4172b852    # 15.17f

    .line 448
    .line 449
    .line 450
    const/high16 v2, 0x41900000    # 18.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40800000    # 4.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v13, -0x40733333    # -1.1f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const/high16 v15, -0x40000000    # -2.0f

    .line 465
    .line 466
    const v16, -0x4099999a    # -0.9f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x41000000    # 8.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3fa66666    # 1.3f

    .line 478
    .line 479
    .line 480
    const v18, -0x4010a3d7    # -1.87f

    .line 481
    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const v14, -0x40a66666    # -0.85f

    .line 485
    .line 486
    .line 487
    const v15, 0x3f0ccccd    # 0.55f

    .line 488
    .line 489
    .line 490
    const v16, -0x4035c28f    # -1.58f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x3fb1eb85    # 1.39f

    .line 497
    .line 498
    .line 499
    const v2, 0x40870a3d    # 4.22f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x3fb47ae1    # 1.41f

    .line 506
    .line 507
    .line 508
    const v2, -0x404b851f    # -1.41f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x41930a3d    # 18.38f

    .line 515
    .line 516
    .line 517
    const v2, 0x41930a3d    # 18.38f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x419e3d71    # 19.78f

    .line 524
    .line 525
    .line 526
    const v2, 0x41b4e148    # 22.61f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41800000    # 16.0f

    .line 536
    .line 537
    const v2, 0x4152b852    # 13.17f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x41100000    # 9.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x40000000    # 2.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x40e00000    # 7.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, -0x40000000    # -2.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x40a00000    # 5.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, -0x40000000    # -2.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x40000000    # 2.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x411d47ae    # 9.83f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40a570a4    # 5.17f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x41000000    # 8.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40800000    # 4.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x41000000    # 8.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x4152b852    # 13.17f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const/16 v16, 0x3800

    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/high16 v8, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    const/high16 v12, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v14, 0x0

    .line 632
    const/4 v15, 0x0

    .line 633
    const-string v4, ""

    .line 634
    .line 635
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    sput-object v0, Landroidx/compose/material/icons/twotone/VideogameAssetOffKt;->_videogameAssetOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    return-object v0
.end method
