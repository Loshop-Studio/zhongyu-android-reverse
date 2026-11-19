.class public final Landroidx/compose/material/icons/outlined/OnDeviceTrainingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOnDeviceTraining(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/OnDeviceTrainingKt;->_onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.OnDeviceTraining"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/high16 v6, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/high16 v8, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41300000    # 11.0f

    .line 148
    .line 149
    const/high16 v6, 0x41400000    # 12.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, -0x40000000    # -2.0f

    .line 155
    .line 156
    const/high16 v26, 0x40000000    # 2.0f

    .line 157
    .line 158
    const v21, -0x40733333    # -1.1f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const/high16 v23, -0x40000000    # -2.0f

    .line 164
    .line 165
    const v24, 0x3f666666    # 0.9f

    .line 166
    .line 167
    .line 168
    move-object/from16 v20, v2

    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const v26, 0x3fdc28f6    # 1.72f

    .line 176
    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    const v22, 0x3f3d70a4    # 0.74f

    .line 181
    .line 182
    .line 183
    const v23, 0x3ecccccd    # 0.4f

    .line 184
    .line 185
    .line 186
    const v24, 0x3fb0a3d7    # 1.38f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x3f47ae14    # 0.78f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, -0x40b851ec    # -0.78f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v26, -0x4023d70a    # -1.72f

    .line 210
    .line 211
    .line 212
    const v21, 0x3f19999a    # 0.6f

    .line 213
    .line 214
    .line 215
    const v22, -0x414ccccd    # -0.35f

    .line 216
    .line 217
    .line 218
    const/high16 v23, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const v24, -0x40851eb8    # -0.98f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x41400000    # 12.0f

    .line 227
    .line 228
    const/high16 v26, 0x41300000    # 11.0f

    .line 229
    .line 230
    const/high16 v21, 0x41600000    # 14.0f

    .line 231
    .line 232
    const v22, 0x413e6666    # 11.9f

    .line 233
    .line 234
    .line 235
    const v23, 0x4151999a    # 13.1f

    .line 236
    .line 237
    .line 238
    const/high16 v24, 0x41300000    # 11.0f

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    const/high16 v6, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const-string v4, ""

    .line 254
    .line 255
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 256
    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    const/4 v2, 0x0

    .line 269
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const v4, 0x3f8147ae    # 1.01f

    .line 286
    .line 287
    .line 288
    const/high16 v6, 0x41900000    # 18.0f

    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v6, 0x40c00000    # 6.0f

    .line 296
    .line 297
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v25, 0x40800000    # 4.0f

    .line 301
    .line 302
    const/high16 v26, 0x40400000    # 3.0f

    .line 303
    .line 304
    const v21, 0x409ccccd    # 4.9f

    .line 305
    .line 306
    .line 307
    const/high16 v22, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v23, 0x40800000    # 4.0f

    .line 310
    .line 311
    const v24, 0x3ff33333    # 1.9f

    .line 312
    .line 313
    .line 314
    move-object/from16 v20, v2

    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41900000    # 18.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, 0x40000000    # 2.0f

    .line 325
    .line 326
    const/high16 v26, 0x40000000    # 2.0f

    .line 327
    .line 328
    const/16 v21, 0x0

    .line 329
    .line 330
    const v22, 0x3f8ccccd    # 1.1f

    .line 331
    .line 332
    .line 333
    const v23, 0x3f666666    # 0.9f

    .line 334
    .line 335
    .line 336
    const/high16 v24, 0x40000000    # 2.0f

    .line 337
    .line 338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v4, 0x41400000    # 12.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v26, -0x40000000    # -2.0f

    .line 347
    .line 348
    const v21, 0x3f8ccccd    # 1.1f

    .line 349
    .line 350
    .line 351
    const/16 v22, 0x0

    .line 352
    .line 353
    const/high16 v23, 0x40000000    # 2.0f

    .line 354
    .line 355
    const v24, -0x4099999a    # -0.9f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x40400000    # 3.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, 0x41900000    # 18.0f

    .line 367
    .line 368
    const v26, 0x3f8147ae    # 1.01f

    .line 369
    .line 370
    .line 371
    const/high16 v21, 0x41a00000    # 20.0f

    .line 372
    .line 373
    const v22, 0x3ff33333    # 1.9f

    .line 374
    .line 375
    .line 376
    const v23, 0x4198cccd    # 19.1f

    .line 377
    .line 378
    .line 379
    const v24, 0x3f8147ae    # 1.01f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x41a80000    # 21.0f

    .line 389
    .line 390
    const/high16 v6, 0x41900000    # 18.0f

    .line 391
    .line 392
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x40c00000    # 6.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, -0x40800000    # -1.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41400000    # 12.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41a80000    # 21.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x41900000    # 18.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x40c00000    # 6.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, 0x41400000    # 12.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x41900000    # 18.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v4, 0x40800000    # 4.0f

    .line 445
    .line 446
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x40c00000    # 6.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x40400000    # 3.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41400000    # 12.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, 0x40800000    # 4.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    const/high16 v6, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v7, 0x0

    .line 479
    const-string v4, ""

    .line 480
    .line 481
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 482
    .line 483
    .line 484
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 489
    .line 490
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 491
    .line 492
    .line 493
    move-result-wide v6

    .line 494
    const/4 v2, 0x0

    .line 495
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 499
    .line 500
    .line 501
    move-result v10

    .line 502
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 503
    .line 504
    .line 505
    move-result v11

    .line 506
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 509
    .line 510
    .line 511
    const v4, 0x417f3333    # 15.95f

    .line 512
    .line 513
    .line 514
    const v6, 0x4180147b    # 16.01f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v25, 0x41880000    # 17.0f

    .line 521
    .line 522
    const/high16 v26, 0x41500000    # 13.0f

    .line 523
    .line 524
    const v21, 0x41850a3d    # 16.63f

    .line 525
    .line 526
    .line 527
    const v22, 0x4171eb85    # 15.12f

    .line 528
    .line 529
    .line 530
    const/high16 v23, 0x41880000    # 17.0f

    .line 531
    .line 532
    const v24, 0x4161c28f    # 14.11f

    .line 533
    .line 534
    .line 535
    move-object/from16 v20, v2

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, -0x40828f5c    # -0.99f

    .line 541
    .line 542
    .line 543
    const v6, -0x3fc33333    # -2.95f

    .line 544
    .line 545
    .line 546
    const v7, -0x41428f5c    # -0.37f

    .line 547
    .line 548
    .line 549
    const v8, -0x3ff851ec    # -2.12f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, -0x40770a3d    # -1.07f

    .line 556
    .line 557
    .line 558
    const v6, 0x3f88f5c3    # 1.07f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v25, 0x3f0f5c29    # 0.56f

    .line 565
    .line 566
    .line 567
    const v26, 0x3ff0a3d7    # 1.88f

    .line 568
    .line 569
    .line 570
    const v21, 0x3eb33333    # 0.35f

    .line 571
    .line 572
    .line 573
    const v22, 0x3f0a3d71    # 0.54f

    .line 574
    .line 575
    .line 576
    const v23, 0x3f0f5c29    # 0.56f

    .line 577
    .line 578
    .line 579
    const v24, 0x3f9851ec    # 1.19f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v4, -0x40f0a3d7    # -0.56f

    .line 586
    .line 587
    .line 588
    const v6, 0x3ff0a3d7    # 1.88f

    .line 589
    .line 590
    .line 591
    const v7, -0x41a8f5c3    # -0.21f

    .line 592
    .line 593
    .line 594
    const v8, 0x3fab851f    # 1.34f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, 0x417f3333    # 15.95f

    .line 601
    .line 602
    .line 603
    const v6, 0x4180147b    # 16.01f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v0, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const v0, 0x416e147b    # 14.88f

    .line 654
    .line 655
    .line 656
    const v2, 0x4110f5c3    # 9.06f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x41080000    # 8.5f

    .line 663
    .line 664
    const/high16 v18, 0x41500000    # 13.0f

    .line 665
    .line 666
    const v13, 0x410b5c29    # 8.71f

    .line 667
    .line 668
    .line 669
    const v14, 0x416570a4    # 14.34f

    .line 670
    .line 671
    .line 672
    const/high16 v15, 0x41080000    # 8.5f

    .line 673
    .line 674
    const v16, 0x415b0a3d    # 13.69f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v17, 0x40600000    # 3.5f

    .line 681
    .line 682
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const v14, -0x4008f5c3    # -1.93f

    .line 686
    .line 687
    .line 688
    const v15, 0x3fc8f5c3    # 1.57f

    .line 689
    .line 690
    .line 691
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x40100000    # 2.25f

    .line 702
    .line 703
    const/high16 v2, -0x40000000    # -2.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 709
    .line 710
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x41000000    # 8.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v17, -0x3f600000    # -5.0f

    .line 719
    .line 720
    const/high16 v18, 0x40a00000    # 5.0f

    .line 721
    .line 722
    const v13, -0x3fcf5c29    # -2.76f

    .line 723
    .line 724
    .line 725
    const/4 v14, 0x0

    .line 726
    const/high16 v15, -0x3f600000    # -5.0f

    .line 727
    .line 728
    const v16, 0x400f5c29    # 2.24f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v17, 0x3f7d70a4    # 0.99f

    .line 735
    .line 736
    .line 737
    const v18, 0x403ccccd    # 2.95f

    .line 738
    .line 739
    .line 740
    const/4 v13, 0x0

    .line 741
    const v14, 0x3f8e147b    # 1.11f

    .line 742
    .line 743
    .line 744
    const v15, 0x3ebd70a4    # 0.37f

    .line 745
    .line 746
    .line 747
    const v16, 0x4007ae14    # 2.12f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x416e147b    # 14.88f

    .line 754
    .line 755
    .line 756
    const v2, 0x4110f5c3    # 9.06f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    const/16 v16, 0x3800

    .line 770
    .line 771
    const/16 v17, 0x0

    .line 772
    .line 773
    const/high16 v6, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/4 v7, 0x0

    .line 776
    const/high16 v12, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/4 v14, 0x0

    .line 779
    const/4 v15, 0x0

    .line 780
    const-string v4, ""

    .line 781
    .line 782
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    sput-object v0, Landroidx/compose/material/icons/outlined/OnDeviceTrainingKt;->_onDeviceTraining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 791
    .line 792
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    return-object v0
.end method
