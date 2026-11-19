.class public final Landroidx/compose/material/icons/twotone/PermCameraMicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermCameraMic(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PermCameraMicKt;->_permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PermCameraMic"

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
    const v4, 0x4180e148    # 16.11f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x40e8f5c3    # -0.59f

    .line 79
    .line 80
    .line 81
    const v6, -0x40d9999a    # -0.65f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x41647ae1    # 14.28f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x40a00000    # 5.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, -0x3f7851ec    # -4.24f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x410cf5c3    # 8.81f

    .line 102
    .line 103
    .line 104
    const v6, 0x40cb3333    # 6.35f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40e66666    # -0.6f

    .line 111
    .line 112
    .line 113
    const v6, 0x3f266666    # 0.65f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x40800000    # 4.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41400000    # 12.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x40e00000    # 7.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, -0x40747ae1    # -1.09f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, -0x3f600000    # -5.0f

    .line 141
    .line 142
    const v26, -0x3f42e148    # -5.91f

    .line 143
    .line 144
    .line 145
    const v21, -0x3fcae148    # -2.83f

    .line 146
    .line 147
    .line 148
    const v22, -0x410a3d71    # -0.48f

    .line 149
    .line 150
    .line 151
    const/high16 v23, -0x3f600000    # -5.0f

    .line 152
    .line 153
    const v24, -0x3fc3d70a    # -2.94f

    .line 154
    .line 155
    .line 156
    move-object/from16 v20, v2

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x40800000    # 4.0f

    .line 167
    .line 168
    const/high16 v26, 0x40800000    # 4.0f

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const v22, 0x400d70a4    # 2.21f

    .line 173
    .line 174
    .line 175
    const v23, 0x3fe51eb8    # 1.79f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x40800000    # 4.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x401ae148    # -1.79f

    .line 184
    .line 185
    .line 186
    const/high16 v6, -0x3f800000    # -4.0f

    .line 187
    .line 188
    const/high16 v7, 0x40800000    # 4.0f

    .line 189
    .line 190
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, -0x3f600000    # -5.0f

    .line 199
    .line 200
    const v26, 0x40bd1eb8    # 5.91f

    .line 201
    .line 202
    .line 203
    const v22, 0x403e147b    # 2.97f

    .line 204
    .line 205
    .line 206
    const v23, -0x3ff51eb8    # -2.17f

    .line 207
    .line 208
    .line 209
    const v24, 0x40adc28f    # 5.43f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41980000    # 19.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x40e00000    # 7.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, -0x3f870a3d    # -3.89f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x41600000    # 14.0f

    .line 238
    .line 239
    const/high16 v6, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v25, -0x40000000    # -2.0f

    .line 245
    .line 246
    const/high16 v26, 0x40000000    # 2.0f

    .line 247
    .line 248
    const v22, 0x3f8ccccd    # 1.1f

    .line 249
    .line 250
    .line 251
    const v23, -0x4099999a    # -0.9f

    .line 252
    .line 253
    .line 254
    const/high16 v24, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, -0x4099999a    # -0.9f

    .line 260
    .line 261
    .line 262
    const/high16 v6, -0x40000000    # -2.0f

    .line 263
    .line 264
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41000000    # 8.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/high16 v26, -0x40000000    # -2.0f

    .line 275
    .line 276
    const v22, -0x40733333    # -1.1f

    .line 277
    .line 278
    .line 279
    const v23, 0x3f666666    # 0.9f

    .line 280
    .line 281
    .line 282
    const/high16 v24, -0x40000000    # -2.0f

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v4, 0x3f666666    # 0.9f

    .line 288
    .line 289
    .line 290
    const/high16 v6, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40800000    # 4.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const/16 v16, 0x3800

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const v6, 0x3e99999a    # 0.3f

    .line 312
    .line 313
    .line 314
    const v8, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const/high16 v9, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/high16 v12, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const/4 v14, 0x0

    .line 324
    const/4 v15, 0x0

    .line 325
    const-string v4, ""

    .line 326
    .line 327
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 328
    .line 329
    .line 330
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 335
    .line 336
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 337
    .line 338
    .line 339
    move-result-wide v6

    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x40c00000    # 6.0f

    .line 358
    .line 359
    const/high16 v2, 0x41400000    # 12.0f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, -0x40000000    # -2.0f

    .line 365
    .line 366
    const/high16 v18, 0x40000000    # 2.0f

    .line 367
    .line 368
    const v13, -0x40733333    # -1.1f

    .line 369
    .line 370
    .line 371
    const/high16 v15, -0x40000000    # -2.0f

    .line 372
    .line 373
    const v16, 0x3f666666    # 0.9f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40800000    # 4.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x40000000    # 2.0f

    .line 385
    .line 386
    const/4 v13, 0x0

    .line 387
    const v14, 0x3f8ccccd    # 1.1f

    .line 388
    .line 389
    .line 390
    const v15, 0x3f666666    # 0.9f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x40000000    # 2.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x4099999a    # -0.9f

    .line 399
    .line 400
    .line 401
    const/high16 v2, -0x40000000    # -2.0f

    .line 402
    .line 403
    const/high16 v4, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41000000    # 8.0f

    .line 409
    .line 410
    const/high16 v2, 0x41600000    # 14.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, -0x40000000    # -2.0f

    .line 416
    .line 417
    const/high16 v18, -0x40000000    # -2.0f

    .line 418
    .line 419
    const v14, -0x40733333    # -1.1f

    .line 420
    .line 421
    .line 422
    const v15, -0x4099999a    # -0.9f

    .line 423
    .line 424
    .line 425
    const/high16 v16, -0x40000000    # -2.0f

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41a00000    # 20.0f

    .line 434
    .line 435
    const/high16 v2, 0x40a00000    # 5.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x3fb51eb8    # -3.17f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x4011eb85    # -1.86f

    .line 447
    .line 448
    .line 449
    const/high16 v2, -0x40000000    # -2.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x410f5c29    # 8.96f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x40400000    # 3.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x40e570a4    # 7.17f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x40a00000    # 5.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x40a00000    # 5.0f

    .line 471
    .line 472
    const/high16 v2, 0x40800000    # 4.0f

    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v18, 0x40000000    # 2.0f

    .line 478
    .line 479
    const v13, -0x40733333    # -1.1f

    .line 480
    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const/high16 v15, -0x40000000    # -2.0f

    .line 484
    .line 485
    const v16, 0x3f666666    # 0.9f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x41400000    # 12.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x40000000    # 2.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, 0x3f8ccccd    # 1.1f

    .line 500
    .line 501
    .line 502
    const v15, 0x3f666666    # 0.9f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41800000    # 16.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v18, -0x40000000    # -2.0f

    .line 516
    .line 517
    const v13, 0x3f8ccccd    # 1.1f

    .line 518
    .line 519
    .line 520
    const/4 v14, 0x0

    .line 521
    const/high16 v15, 0x40000000    # 2.0f

    .line 522
    .line 523
    const v16, -0x4099999a    # -0.9f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41b00000    # 22.0f

    .line 530
    .line 531
    const/high16 v2, 0x40e00000    # 7.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, -0x40000000    # -2.0f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const v14, -0x40733333    # -1.1f

    .line 540
    .line 541
    .line 542
    const v15, -0x4099999a    # -0.9f

    .line 543
    .line 544
    .line 545
    const/high16 v16, -0x40000000    # -2.0f

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x41a00000    # 20.0f

    .line 554
    .line 555
    const/high16 v2, 0x41980000    # 19.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, -0x3f200000    # -7.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, -0x40747ae1    # -1.09f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, 0x40a00000    # 5.0f

    .line 572
    .line 573
    const v18, -0x3f42e148    # -5.91f

    .line 574
    .line 575
    .line 576
    const v13, 0x40351eb8    # 2.83f

    .line 577
    .line 578
    .line 579
    const v14, -0x410a3d71    # -0.48f

    .line 580
    .line 581
    .line 582
    const/high16 v15, 0x40a00000    # 5.0f

    .line 583
    .line 584
    const v16, -0x3fc3d70a    # -2.94f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, -0x40000000    # -2.0f

    .line 591
    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v17, -0x3f800000    # -4.0f

    .line 596
    .line 597
    const/high16 v18, 0x40800000    # 4.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const v14, 0x400d70a4    # 2.21f

    .line 601
    .line 602
    .line 603
    const v15, -0x401ae148    # -1.79f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x40800000    # 4.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, -0x401ae148    # -1.79f

    .line 612
    .line 613
    .line 614
    const/high16 v2, -0x3f800000    # -4.0f

    .line 615
    .line 616
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x40c00000    # 6.0f

    .line 620
    .line 621
    const/high16 v2, 0x41400000    # 12.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x40a00000    # 5.0f

    .line 627
    .line 628
    const v18, 0x40bd1eb8    # 5.91f

    .line 629
    .line 630
    .line 631
    const v14, 0x403e147b    # 2.97f

    .line 632
    .line 633
    .line 634
    const v15, 0x400ae148    # 2.17f

    .line 635
    .line 636
    .line 637
    const v16, 0x40adc28f    # 5.43f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x41300000    # 11.0f

    .line 644
    .line 645
    const/high16 v2, 0x41980000    # 19.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41980000    # 19.0f

    .line 651
    .line 652
    const/high16 v2, 0x40800000    # 4.0f

    .line 653
    .line 654
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x40e00000    # 7.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x4086b852    # 4.21f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x3f170a3d    # 0.59f

    .line 669
    .line 670
    .line 671
    const v2, -0x40d9999a    # -0.65f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x4120a3d7    # 10.04f

    .line 678
    .line 679
    .line 680
    const/high16 v2, 0x40a00000    # 5.0f

    .line 681
    .line 682
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v0, 0x4087ae14    # 4.24f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3f9eb852    # 1.24f

    .line 692
    .line 693
    .line 694
    const v2, 0x3faccccd    # 1.35f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3f170a3d    # 0.59f

    .line 701
    .line 702
    .line 703
    const v2, 0x3f266666    # 0.65f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x41a00000    # 20.0f

    .line 710
    .line 711
    const/high16 v2, 0x40e00000    # 7.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, 0x41400000    # 12.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    const/16 v16, 0x3800

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/high16 v6, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v8, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    const/high16 v12, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const/4 v15, 0x0

    .line 741
    const-string v4, ""

    .line 742
    .line 743
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    sput-object v0, Landroidx/compose/material/icons/twotone/PermCameraMicKt;->_permCameraMic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 752
    .line 753
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    return-object v0
.end method
