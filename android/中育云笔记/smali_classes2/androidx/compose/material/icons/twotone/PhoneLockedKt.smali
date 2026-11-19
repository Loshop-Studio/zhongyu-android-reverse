.class public final Landroidx/compose/material/icons/twotone/PhoneLockedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneLocked:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneLocked(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhoneLockedKt;->_phoneLocked:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhoneLocked"

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v23, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x40000000    # -2.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v6, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v7, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x40800000    # -1.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40a00000    # 5.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40c00000    # 6.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40a00000    # 5.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41a00000    # 20.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x41980000    # 19.0f

    .line 145
    .line 146
    const/high16 v6, 0x40a00000    # 5.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x40000000    # -2.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40800000    # 4.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v26, -0x40800000    # -1.0f

    .line 164
    .line 165
    const v22, -0x40f33333    # -0.55f

    .line 166
    .line 167
    .line 168
    const v23, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    const/high16 v24, -0x40800000    # -1.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x3ee66666    # 0.45f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x3f800000    # 1.0f

    .line 180
    .line 181
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40a00000    # 5.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v16, 0x3800

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/high16 v8, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const/high16 v9, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const-string v4, ""

    .line 211
    .line 212
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const v4, 0x418ea3d7    # 17.83f

    .line 243
    .line 244
    .line 245
    const/high16 v6, 0x41700000    # 15.0f

    .line 246
    .line 247
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x40800000    # 4.0f

    .line 251
    .line 252
    const v26, 0x3f88f5c3    # 1.07f

    .line 253
    .line 254
    .line 255
    const v21, 0x3fa51eb8    # 1.29f

    .line 256
    .line 257
    .line 258
    const v22, 0x3f0a3d71    # 0.54f

    .line 259
    .line 260
    .line 261
    const v23, 0x402851ec    # 2.63f

    .line 262
    .line 263
    .line 264
    const v24, 0x3f63d70a    # 0.89f

    .line 265
    .line 266
    .line 267
    move-object/from16 v20, v2

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, -0x3ff147ae    # -2.23f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, -0x3fe9999a    # -2.35f

    .line 279
    .line 280
    .line 281
    const v6, -0x410f5c29    # -0.47f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v4, 0x418ea3d7    # 17.83f

    .line 288
    .line 289
    .line 290
    const/high16 v6, 0x41700000    # 15.0f

    .line 291
    .line 292
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const v6, 0x3e99999a    # 0.3f

    .line 303
    .line 304
    .line 305
    const v8, 0x3e99999a    # 0.3f

    .line 306
    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    const-string v4, ""

    .line 310
    .line 311
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 312
    .line 313
    .line 314
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 319
    .line 320
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 321
    .line 322
    .line 323
    move-result-wide v6

    .line 324
    const/4 v2, 0x0

    .line 325
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 339
    .line 340
    .line 341
    const v4, 0x40ea8f5c    # 7.33f

    .line 342
    .line 343
    .line 344
    const/high16 v6, 0x40a00000    # 5.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x40a33333    # 5.1f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, 0x3f88f5c3    # 1.07f

    .line 356
    .line 357
    .line 358
    const/high16 v26, 0x40800000    # 4.0f

    .line 359
    .line 360
    const v21, 0x3e3851ec    # 0.18f

    .line 361
    .line 362
    .line 363
    const v22, 0x3faf5c29    # 1.37f

    .line 364
    .line 365
    .line 366
    const v23, 0x3f07ae14    # 0.53f

    .line 367
    .line 368
    .line 369
    const v24, 0x402ccccd    # 2.7f

    .line 370
    .line 371
    .line 372
    move-object/from16 v20, v2

    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, 0x40eb3333    # 7.35f

    .line 378
    .line 379
    .line 380
    const v6, 0x40f9999a    # 7.8f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v4, 0x40ea8f5c    # 7.33f

    .line 387
    .line 388
    .line 389
    const/high16 v6, 0x40a00000    # 5.0f

    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const v6, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const/4 v7, 0x0

    .line 405
    const-string v4, ""

    .line 406
    .line 407
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 415
    .line 416
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 417
    .line 418
    .line 419
    move-result-wide v6

    .line 420
    const/4 v0, 0x0

    .line 421
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 429
    .line 430
    .line 431
    move-result v11

    .line 432
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 435
    .line 436
    .line 437
    const v0, 0x41a1999a    # 20.2f

    .line 438
    .line 439
    .line 440
    const v2, 0x416deb85    # 14.87f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x3f951eb8    # -3.67f

    .line 447
    .line 448
    .line 449
    const v2, -0x40c51eb8    # -0.73f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, -0x4099999a    # -0.9f

    .line 456
    .line 457
    .line 458
    const v18, 0x3e8a3d71    # 0.27f

    .line 459
    .line 460
    .line 461
    const/high16 v13, -0x41000000    # -0.5f

    .line 462
    .line 463
    const v14, -0x42333333    # -0.1f

    .line 464
    .line 465
    .line 466
    const v15, -0x40ab851f    # -0.83f

    .line 467
    .line 468
    .line 469
    const v16, 0x3e4ccccd    # 0.2f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40200000    # 2.5f

    .line 476
    .line 477
    const v2, -0x3fdeb852    # -2.52f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, -0x3f400000    # -6.0f

    .line 484
    .line 485
    const/high16 v18, -0x3f400000    # -6.0f

    .line 486
    .line 487
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 488
    .line 489
    const v14, -0x4048f5c3    # -1.43f

    .line 490
    .line 491
    .line 492
    const v15, -0x3f6dc28f    # -4.57f

    .line 493
    .line 494
    .line 495
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x3e8a3d71    # 0.27f

    .line 504
    .line 505
    .line 506
    const v18, -0x4099999a    # -0.9f

    .line 507
    .line 508
    .line 509
    const v13, 0x3e6b851f    # 0.23f

    .line 510
    .line 511
    .line 512
    const v14, -0x418a3d71    # -0.24f

    .line 513
    .line 514
    .line 515
    const v15, 0x3ea8f5c3    # 0.33f

    .line 516
    .line 517
    .line 518
    const v16, -0x40ee147b    # -0.57f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x4112147b    # 9.13f

    .line 525
    .line 526
    .line 527
    const v2, 0x40733333    # 3.8f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x41026666    # 8.15f

    .line 534
    .line 535
    .line 536
    const/high16 v18, 0x40400000    # 3.0f

    .line 537
    .line 538
    const v13, 0x4110a3d7    # 9.04f

    .line 539
    .line 540
    .line 541
    const v14, 0x4055c28f    # 3.34f

    .line 542
    .line 543
    .line 544
    const v15, 0x410a147b    # 8.63f

    .line 545
    .line 546
    .line 547
    const/high16 v16, 0x40400000    # 3.0f

    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x40800000    # 4.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v17, 0x40400000    # 3.0f

    .line 558
    .line 559
    const v18, 0x4080f5c3    # 4.03f

    .line 560
    .line 561
    .line 562
    const v13, 0x405c28f6    # 3.44f

    .line 563
    .line 564
    .line 565
    const/high16 v14, 0x40400000    # 3.0f

    .line 566
    .line 567
    const v15, 0x403e147b    # 2.97f

    .line 568
    .line 569
    .line 570
    const v16, 0x405e147b    # 3.47f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, 0x40adc28f    # 5.43f

    .line 577
    .line 578
    .line 579
    const/high16 v18, 0x41400000    # 12.0f

    .line 580
    .line 581
    const v13, 0x404ae148    # 3.17f

    .line 582
    .line 583
    .line 584
    const v14, 0x40dd70a4    # 6.92f

    .line 585
    .line 586
    .line 587
    const v15, 0x4081999a    # 4.05f

    .line 588
    .line 589
    .line 590
    const v16, 0x411a147b    # 9.63f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x40d23d71    # 6.57f

    .line 597
    .line 598
    .line 599
    const v18, 0x40d23d71    # 6.57f

    .line 600
    .line 601
    .line 602
    const v13, 0x3fca3d71    # 1.58f

    .line 603
    .line 604
    .line 605
    const v14, 0x402eb852    # 2.73f

    .line 606
    .line 607
    .line 608
    const v15, 0x40766666    # 3.85f

    .line 609
    .line 610
    .line 611
    const v16, 0x409fae14    # 4.99f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x40ff0a3d    # 7.97f

    .line 618
    .line 619
    .line 620
    const v18, 0x401b851f    # 2.43f

    .line 621
    .line 622
    .line 623
    const v13, 0x4017ae14    # 2.37f

    .line 624
    .line 625
    .line 626
    const v14, 0x3faf5c29    # 1.37f

    .line 627
    .line 628
    .line 629
    const v15, 0x40a28f5c    # 5.08f

    .line 630
    .line 631
    .line 632
    const v16, 0x4010a3d7    # 2.26f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x3f83d70a    # 1.03f

    .line 639
    .line 640
    .line 641
    const/high16 v18, -0x40800000    # -1.0f

    .line 642
    .line 643
    const v13, 0x3f0ccccd    # 0.55f

    .line 644
    .line 645
    .line 646
    const v14, 0x3cf5c28f    # 0.03f

    .line 647
    .line 648
    .line 649
    const v15, 0x3f83d70a    # 1.03f

    .line 650
    .line 651
    .line 652
    const v16, -0x4123d70a    # -0.43f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, -0x3f7b3333    # -4.15f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x41a1999a    # 20.2f

    .line 665
    .line 666
    .line 667
    const v18, 0x416deb85    # 14.87f

    .line 668
    .line 669
    .line 670
    const/high16 v13, 0x41a80000    # 21.0f

    .line 671
    .line 672
    const v14, 0x4175eb85    # 15.37f

    .line 673
    .line 674
    .line 675
    const v15, 0x41a547ae    # 20.66f

    .line 676
    .line 677
    .line 678
    const v16, 0x416f5c29    # 14.96f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x40a33333    # 5.1f

    .line 688
    .line 689
    .line 690
    const/high16 v2, 0x40a00000    # 5.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x400eb852    # 2.23f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x40eb3333    # 7.35f

    .line 702
    .line 703
    .line 704
    const v2, 0x40f9999a    # 7.8f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, 0x40c570a4    # 6.17f

    .line 711
    .line 712
    .line 713
    const/high16 v2, 0x41100000    # 9.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v17, 0x40a33333    # 5.1f

    .line 719
    .line 720
    .line 721
    const/high16 v18, 0x40a00000    # 5.0f

    .line 722
    .line 723
    const v13, 0x40b428f6    # 5.63f

    .line 724
    .line 725
    .line 726
    const v14, 0x40f66666    # 7.7f

    .line 727
    .line 728
    .line 729
    const v15, 0x40a8a3d7    # 5.27f

    .line 730
    .line 731
    .line 732
    const v16, 0x40cbd70a    # 6.37f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v0, 0x41973333    # 18.9f

    .line 742
    .line 743
    .line 744
    const/high16 v2, 0x41980000    # 19.0f

    .line 745
    .line 746
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v17, -0x3f800000    # -4.0f

    .line 750
    .line 751
    const v18, -0x40770a3d    # -1.07f

    .line 752
    .line 753
    .line 754
    const v13, -0x4050a3d7    # -1.37f

    .line 755
    .line 756
    .line 757
    const v14, -0x41c7ae14    # -0.18f

    .line 758
    .line 759
    .line 760
    const v15, -0x3fd33333    # -2.7f

    .line 761
    .line 762
    .line 763
    const v16, -0x40f851ec    # -0.53f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3fd33333    # 1.65f

    .line 770
    .line 771
    .line 772
    const v2, -0x402f5c29    # -1.63f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, 0x41855c29    # 16.67f

    .line 779
    .line 780
    .line 781
    const/high16 v2, 0x41980000    # 19.0f

    .line 782
    .line 783
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v0, 0x41973333    # 18.9f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    const/16 v16, 0x3800

    .line 800
    .line 801
    const/16 v17, 0x0

    .line 802
    .line 803
    const/high16 v6, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/high16 v8, 0x3f800000    # 1.0f

    .line 806
    .line 807
    const/4 v7, 0x0

    .line 808
    const/high16 v12, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v13, 0x0

    .line 811
    const/4 v14, 0x0

    .line 812
    const/4 v15, 0x0

    .line 813
    const-string v4, ""

    .line 814
    .line 815
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    sput-object v0, Landroidx/compose/material/icons/twotone/PhoneLockedKt;->_phoneLocked:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 824
    .line 825
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    return-object v0
.end method
