.class public final Landroidx/compose/material/icons/twotone/MicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMic(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MicKt;->_mic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Mic"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v25, 0x3f800000    # 1.0f

    .line 76
    .line 77
    const/high16 v26, -0x40800000    # -1.0f

    .line 78
    .line 79
    const v21, 0x3f0ccccd    # 0.55f

    .line 80
    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const/high16 v23, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v24, -0x4119999a    # -0.45f

    .line 87
    .line 88
    .line 89
    move-object/from16 v20, v2

    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40a00000    # 5.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, -0x40800000    # -1.0f

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v23, -0x4119999a    # -0.45f

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
    const v4, 0x3ee66666    # 0.45f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v7, -0x40800000    # -1.0f

    .line 120
    .line 121
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x41400000    # 12.0f

    .line 130
    .line 131
    const/high16 v26, 0x41400000    # 12.0f

    .line 132
    .line 133
    const/high16 v21, 0x41300000    # 11.0f

    .line 134
    .line 135
    const v22, 0x4138cccd    # 11.55f

    .line 136
    .line 137
    .line 138
    const v23, 0x41373333    # 11.45f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x41400000    # 12.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const/16 v16, 0x3800

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v6, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    const v8, 0x3e99999a    # 0.3f

    .line 161
    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const/high16 v9, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v12, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const-string v4, ""

    .line 172
    .line 173
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 174
    .line 175
    .line 176
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 181
    .line 182
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    const/4 v2, 0x0

    .line 187
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x41600000    # 14.0f

    .line 204
    .line 205
    const/high16 v6, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x40400000    # 3.0f

    .line 211
    .line 212
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 213
    .line 214
    const v21, 0x3fd47ae1    # 1.66f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const/high16 v23, 0x40400000    # 3.0f

    .line 220
    .line 221
    const v24, -0x40547ae1    # -1.34f

    .line 222
    .line 223
    .line 224
    move-object/from16 v20, v2

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x40a00000    # 5.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 235
    .line 236
    const/16 v21, 0x0

    .line 237
    .line 238
    const v22, -0x402b851f    # -1.66f

    .line 239
    .line 240
    .line 241
    const v23, -0x40547ae1    # -1.34f

    .line 242
    .line 243
    .line 244
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x4055c28f    # 3.34f

    .line 250
    .line 251
    .line 252
    const/high16 v6, 0x41100000    # 9.0f

    .line 253
    .line 254
    const/high16 v7, 0x40a00000    # 5.0f

    .line 255
    .line 256
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v25, 0x41400000    # 12.0f

    .line 265
    .line 266
    const/high16 v26, 0x41600000    # 14.0f

    .line 267
    .line 268
    const/high16 v21, 0x41100000    # 9.0f

    .line 269
    .line 270
    const v22, 0x414a8f5c    # 12.66f

    .line 271
    .line 272
    .line 273
    const v23, 0x412570a4    # 10.34f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x41600000    # 14.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x41300000    # 11.0f

    .line 285
    .line 286
    const/high16 v6, 0x40a00000    # 5.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v26, -0x40800000    # -1.0f

    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const v22, -0x40f33333    # -0.55f

    .line 298
    .line 299
    .line 300
    const v23, 0x3ee66666    # 0.45f

    .line 301
    .line 302
    .line 303
    const/high16 v24, -0x40800000    # -1.0f

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, 0x3ee66666    # 0.45f

    .line 309
    .line 310
    .line 311
    const/high16 v6, 0x3f800000    # 1.0f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, 0x40c00000    # 6.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, -0x40800000    # -1.0f

    .line 322
    .line 323
    const/high16 v26, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const v22, 0x3f0ccccd    # 0.55f

    .line 326
    .line 327
    .line 328
    const v23, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    const/high16 v24, 0x3f800000    # 1.0f

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, -0x4119999a    # -0.45f

    .line 337
    .line 338
    .line 339
    const/high16 v6, -0x40800000    # -1.0f

    .line 340
    .line 341
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x40a00000    # 5.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    const/high16 v6, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v8, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    const-string v4, ""

    .line 362
    .line 363
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 371
    .line 372
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 373
    .line 374
    .line 375
    move-result-wide v6

    .line 376
    const/4 v0, 0x0

    .line 377
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41880000    # 17.0f

    .line 394
    .line 395
    const/high16 v2, 0x41300000    # 11.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, -0x3f600000    # -5.0f

    .line 401
    .line 402
    const/high16 v18, 0x40a00000    # 5.0f

    .line 403
    .line 404
    const v14, 0x4030a3d7    # 2.76f

    .line 405
    .line 406
    .line 407
    const v15, -0x3ff0a3d7    # -2.24f

    .line 408
    .line 409
    .line 410
    const/high16 v16, 0x40a00000    # 5.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, -0x3ff0a3d7    # -2.24f

    .line 416
    .line 417
    .line 418
    const/high16 v2, -0x3f600000    # -5.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x40a00000    # 5.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x40c00000    # 6.0f

    .line 429
    .line 430
    const v18, 0x40dd70a4    # 6.92f

    .line 431
    .line 432
    .line 433
    const v14, 0x4061eb85    # 3.53f

    .line 434
    .line 435
    .line 436
    const v15, 0x40270a3d    # 2.61f

    .line 437
    .line 438
    .line 439
    const v16, 0x40cdc28f    # 6.43f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41a80000    # 21.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x40000000    # 2.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, -0x3fbae148    # -3.08f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v18, -0x3f228f5c    # -6.92f

    .line 462
    .line 463
    .line 464
    const v13, 0x4058f5c3    # 3.39f

    .line 465
    .line 466
    .line 467
    const v14, -0x41051eb8    # -0.49f

    .line 468
    .line 469
    .line 470
    const/high16 v15, 0x40c00000    # 6.0f

    .line 471
    .line 472
    const v16, -0x3fa70a3d    # -3.39f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x41880000    # 17.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/16 v16, 0x3800

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/high16 v6, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/high16 v12, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sput-object v0, Landroidx/compose/material/icons/twotone/MicKt;->_mic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
