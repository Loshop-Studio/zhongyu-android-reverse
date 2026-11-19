.class public final Landroidx/compose/material/icons/twotone/PhotoCameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _photoCamera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhotoCamera(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhotoCameraKt;->_photoCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhotoCamera"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3f7e6666    # -4.05f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x4015c28f    # -1.83f

    .line 84
    .line 85
    .line 86
    const/high16 v6, -0x40000000    # -2.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v4, 0x411e147b    # 9.88f

    .line 92
    .line 93
    .line 94
    const/high16 v6, 0x40800000    # 4.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x4100cccd    # 8.05f

    .line 100
    .line 101
    .line 102
    const/high16 v6, 0x40c00000    # 6.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const/high16 v6, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x41400000    # 12.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x41800000    # 16.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41a00000    # 20.0f

    .line 125
    .line 126
    const/high16 v6, 0x40c00000    # 6.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41880000    # 17.0f

    .line 135
    .line 136
    const/high16 v6, 0x41400000    # 12.0f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, -0x3f600000    # -5.0f

    .line 142
    .line 143
    const/high16 v26, -0x3f600000    # -5.0f

    .line 144
    .line 145
    const v21, -0x3fcf5c29    # -2.76f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const/high16 v23, -0x3f600000    # -5.0f

    .line 151
    .line 152
    const v24, -0x3ff0a3d7    # -2.24f

    .line 153
    .line 154
    .line 155
    move-object/from16 v20, v2

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x400f5c29    # 2.24f

    .line 161
    .line 162
    .line 163
    const/high16 v6, -0x3f600000    # -5.0f

    .line 164
    .line 165
    const/high16 v7, 0x40a00000    # 5.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v6, 0x40a00000    # 5.0f

    .line 171
    .line 172
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, -0x3ff0a3d7    # -2.24f

    .line 176
    .line 177
    .line 178
    const/high16 v6, -0x3f600000    # -5.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const v6, 0x3e99999a    # 0.3f

    .line 195
    .line 196
    .line 197
    const v8, 0x3e99999a    # 0.3f

    .line 198
    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    const/high16 v9, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/high16 v12, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    const-string v4, ""

    .line 209
    .line 210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    const/4 v0, 0x0

    .line 224
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x41a00000    # 20.0f

    .line 241
    .line 242
    const/high16 v2, 0x40800000    # 4.0f

    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41800000    # 16.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x40000000    # 2.0f

    .line 253
    .line 254
    const/high16 v18, -0x40000000    # -2.0f

    .line 255
    .line 256
    const v13, 0x3f8ccccd    # 1.1f

    .line 257
    .line 258
    .line 259
    const/high16 v15, 0x40000000    # 2.0f

    .line 260
    .line 261
    const v16, -0x4099999a    # -0.9f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41b00000    # 22.0f

    .line 268
    .line 269
    const/high16 v2, 0x40c00000    # 6.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40000000    # -2.0f

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const v14, -0x40733333    # -1.1f

    .line 278
    .line 279
    .line 280
    const v15, -0x4099999a    # -0.9f

    .line 281
    .line 282
    .line 283
    const/high16 v16, -0x40000000    # -2.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x3fb51eb8    # -3.17f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41700000    # 15.0f

    .line 295
    .line 296
    const/high16 v2, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41100000    # 9.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x40e570a4    # 7.17f

    .line 307
    .line 308
    .line 309
    const/high16 v2, 0x40800000    # 4.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40800000    # 4.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v18, 0x40000000    # 2.0f

    .line 320
    .line 321
    const v13, -0x40733333    # -1.1f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const/high16 v15, -0x40000000    # -2.0f

    .line 326
    .line 327
    const v16, 0x3f666666    # 0.9f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41400000    # 12.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x40000000    # 2.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x3f8ccccd    # 1.1f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f666666    # 0.9f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40c00000    # 6.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x4081999a    # 4.05f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x3fea3d71    # 1.83f

    .line 367
    .line 368
    .line 369
    const/high16 v2, -0x40000000    # -2.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4087ae14    # 4.24f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fea3d71    # 1.83f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x40000000    # 2.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41a00000    # 20.0f

    .line 389
    .line 390
    const/high16 v2, 0x40c00000    # 6.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41400000    # 12.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41900000    # 18.0f

    .line 401
    .line 402
    const/high16 v2, 0x40800000    # 4.0f

    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40c00000    # 6.0f

    .line 408
    .line 409
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x40e00000    # 7.0f

    .line 416
    .line 417
    const/high16 v2, 0x41400000    # 12.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x3f600000    # -5.0f

    .line 423
    .line 424
    const/high16 v18, 0x40a00000    # 5.0f

    .line 425
    .line 426
    const v13, -0x3fcf5c29    # -2.76f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, -0x3f600000    # -5.0f

    .line 431
    .line 432
    const v16, 0x400f5c29    # 2.24f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x400f5c29    # 2.24f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x40a00000    # 5.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x3ff0a3d7    # -2.24f

    .line 447
    .line 448
    .line 449
    const/high16 v2, -0x3f600000    # -5.0f

    .line 450
    .line 451
    const/high16 v4, 0x40a00000    # 5.0f

    .line 452
    .line 453
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41700000    # 15.0f

    .line 463
    .line 464
    const/high16 v2, 0x41400000    # 12.0f

    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 470
    .line 471
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 472
    .line 473
    const v13, -0x402ccccd    # -1.65f

    .line 474
    .line 475
    .line 476
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 477
    .line 478
    const v16, -0x40533333    # -1.35f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x3faccccd    # 1.35f

    .line 485
    .line 486
    .line 487
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 488
    .line 489
    const/high16 v4, 0x40400000    # 3.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v2, 0x40400000    # 3.0f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x40533333    # -1.35f

    .line 500
    .line 501
    .line 502
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    const/16 v16, 0x3800

    .line 515
    .line 516
    const/16 v17, 0x0

    .line 517
    .line 518
    const/high16 v6, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/high16 v8, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v7, 0x0

    .line 523
    const/high16 v12, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const/4 v15, 0x0

    .line 527
    const-string v4, ""

    .line 528
    .line 529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    sput-object v0, Landroidx/compose/material/icons/twotone/PhotoCameraKt;->_photoCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-object v0
.end method
