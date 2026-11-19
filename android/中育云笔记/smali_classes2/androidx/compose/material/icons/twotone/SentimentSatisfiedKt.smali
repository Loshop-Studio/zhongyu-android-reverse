.class public final Landroidx/compose/material/icons/twotone/SentimentSatisfiedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sentimentSatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSentimentSatisfied(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SentimentSatisfiedKt;->_sentimentSatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SentimentSatisfied"

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
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

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
    const v4, 0x40651eb8    # 3.58f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9ae148    # -3.58f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41780000    # 15.5f

    .line 121
    .line 122
    const/high16 v6, 0x41000000    # 8.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 128
    .line 129
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 130
    .line 131
    const v21, 0x3f547ae1    # 0.83f

    .line 132
    .line 133
    .line 134
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    const v24, 0x3f2b851f    # 0.67f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x40d47ae1    # -0.67f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    const/high16 v7, -0x40400000    # -1.5f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v6, -0x40400000    # -1.5f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x3f2b851f    # 0.67f

    .line 158
    .line 159
    .line 160
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x41080000    # 8.5f

    .line 169
    .line 170
    const/high16 v6, 0x41000000    # 8.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x411547ae    # 9.33f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x41300000    # 11.0f

    .line 182
    .line 183
    const/high16 v7, 0x41080000    # 8.5f

    .line 184
    .line 185
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x412547ae    # 10.33f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x40e00000    # 7.0f

    .line 192
    .line 193
    const/high16 v7, 0x41180000    # 9.5f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x40f570a4    # 7.67f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x41080000    # 8.5f

    .line 202
    .line 203
    const/high16 v7, 0x41000000    # 8.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x418c0000    # 17.5f

    .line 212
    .line 213
    const/high16 v6, 0x41400000    # 12.0f

    .line 214
    .line 215
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3f5c28f6    # -5.12f

    .line 219
    .line 220
    .line 221
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 222
    .line 223
    const v21, -0x3feae148    # -2.33f

    .line 224
    .line 225
    .line 226
    const v23, -0x3f75c28f    # -4.32f

    .line 227
    .line 228
    .line 229
    const v24, -0x40466666    # -1.45f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3fd5c28f    # 1.67f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x405ccccd    # 3.45f

    .line 242
    .line 243
    .line 244
    const/high16 v26, 0x40000000    # 2.0f

    .line 245
    .line 246
    const v21, 0x3f333333    # 0.7f

    .line 247
    .line 248
    .line 249
    const v22, 0x3f9851ec    # 1.19f

    .line 250
    .line 251
    .line 252
    const v23, 0x3ffc28f6    # 1.97f

    .line 253
    .line 254
    .line 255
    const/high16 v24, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, 0x405ccccd    # 3.45f

    .line 261
    .line 262
    .line 263
    const/high16 v6, -0x40000000    # -2.0f

    .line 264
    .line 265
    const/high16 v7, 0x40300000    # 2.75f

    .line 266
    .line 267
    const v8, -0x40b0a3d7    # -0.81f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x3fd5c28f    # 1.67f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, -0x3f5c28f6    # -5.12f

    .line 280
    .line 281
    .line 282
    const/high16 v26, 0x40600000    # 3.5f

    .line 283
    .line 284
    const v21, -0x40b33333    # -0.8f

    .line 285
    .line 286
    .line 287
    const v22, 0x40033333    # 2.05f

    .line 288
    .line 289
    .line 290
    const v23, -0x3fcd70a4    # -2.79f

    .line 291
    .line 292
    .line 293
    const/high16 v24, 0x40600000    # 3.5f

    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    const/16 v16, 0x3800

    .line 306
    .line 307
    const/16 v17, 0x0

    .line 308
    .line 309
    const v6, 0x3e99999a    # 0.3f

    .line 310
    .line 311
    .line 312
    const v8, 0x3e99999a    # 0.3f

    .line 313
    .line 314
    .line 315
    const/4 v7, 0x0

    .line 316
    const/high16 v9, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/high16 v12, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const/4 v14, 0x0

    .line 322
    const/4 v15, 0x0

    .line 323
    const-string v4, ""

    .line 324
    .line 325
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 333
    .line 334
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 335
    .line 336
    .line 337
    move-result-wide v6

    .line 338
    const/4 v2, 0x0

    .line 339
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x41780000    # 15.5f

    .line 356
    .line 357
    const/high16 v6, 0x41180000    # 9.5f

    .line 358
    .line 359
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/4 v4, 0x0

    .line 363
    const/high16 v6, -0x40400000    # -1.5f

    .line 364
    .line 365
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v26, 0x40400000    # 3.0f

    .line 369
    .line 370
    const/16 v27, 0x0

    .line 371
    .line 372
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 373
    .line 374
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 375
    .line 376
    const/16 v23, 0x0

    .line 377
    .line 378
    const/16 v24, 0x1

    .line 379
    .line 380
    const/16 v25, 0x1

    .line 381
    .line 382
    move-object/from16 v20, v2

    .line 383
    .line 384
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 388
    .line 389
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    const/high16 v6, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v8, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const-string v4, ""

    .line 402
    .line 403
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 404
    .line 405
    .line 406
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 411
    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 413
    .line 414
    .line 415
    move-result-wide v6

    .line 416
    const/4 v2, 0x0

    .line 417
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 421
    .line 422
    .line 423
    move-result v10

    .line 424
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 425
    .line 426
    .line 427
    move-result v11

    .line 428
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x41180000    # 9.5f

    .line 434
    .line 435
    const/high16 v6, 0x41080000    # 8.5f

    .line 436
    .line 437
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/4 v4, 0x0

    .line 441
    const/high16 v6, -0x40400000    # -1.5f

    .line 442
    .line 443
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v26, 0x40400000    # 3.0f

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 498
    .line 499
    const/high16 v2, 0x41400000    # 12.0f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, -0x3fa33333    # -3.45f

    .line 505
    .line 506
    .line 507
    const/high16 v18, -0x40000000    # -2.0f

    .line 508
    .line 509
    const v13, -0x40428f5c    # -1.48f

    .line 510
    .line 511
    .line 512
    const/high16 v15, -0x3fd00000    # -2.75f

    .line 513
    .line 514
    const v16, -0x40b0a3d7    # -0.81f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, 0x40dc28f6    # 6.88f

    .line 521
    .line 522
    .line 523
    const/high16 v2, 0x41600000    # 14.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x40a3d70a    # 5.12f

    .line 529
    .line 530
    .line 531
    const/high16 v18, 0x40600000    # 3.5f

    .line 532
    .line 533
    const v13, 0x3f4ccccd    # 0.8f

    .line 534
    .line 535
    .line 536
    const v14, 0x40033333    # 2.05f

    .line 537
    .line 538
    .line 539
    const v15, 0x40328f5c    # 2.79f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x40600000    # 3.5f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x40a3d70a    # 5.12f

    .line 548
    .line 549
    .line 550
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 551
    .line 552
    const v4, 0x408a3d71    # 4.32f

    .line 553
    .line 554
    .line 555
    const v6, -0x40466666    # -1.45f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, -0x402a3d71    # -1.67f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, -0x3fa33333    # -3.45f

    .line 568
    .line 569
    .line 570
    const/high16 v18, 0x40000000    # 2.0f

    .line 571
    .line 572
    const v13, -0x40cccccd    # -0.7f

    .line 573
    .line 574
    .line 575
    const v14, 0x3f9851ec    # 1.19f

    .line 576
    .line 577
    .line 578
    const v15, -0x4003d70a    # -1.97f

    .line 579
    .line 580
    .line 581
    const/high16 v16, 0x40000000    # 2.0f

    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x413fd70a    # 11.99f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x40000000    # 2.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x40000000    # 2.0f

    .line 598
    .line 599
    const/high16 v18, 0x41400000    # 12.0f

    .line 600
    .line 601
    const v13, 0x40cf0a3d    # 6.47f

    .line 602
    .line 603
    .line 604
    const/high16 v14, 0x40000000    # 2.0f

    .line 605
    .line 606
    const/high16 v15, 0x40000000    # 2.0f

    .line 607
    .line 608
    const v16, 0x40cf5c29    # 6.48f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x408f0a3d    # 4.47f

    .line 615
    .line 616
    .line 617
    const v2, 0x411fd70a    # 9.99f

    .line 618
    .line 619
    .line 620
    const/high16 v4, 0x41200000    # 10.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x41b00000    # 22.0f

    .line 626
    .line 627
    const v13, 0x418c28f6    # 17.52f

    .line 628
    .line 629
    .line 630
    const/high16 v14, 0x41b00000    # 22.0f

    .line 631
    .line 632
    const/high16 v15, 0x41b00000    # 22.0f

    .line 633
    .line 634
    const v16, 0x418c28f6    # 17.52f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x418c28f6    # 17.52f

    .line 641
    .line 642
    .line 643
    const v2, 0x413fd70a    # 11.99f

    .line 644
    .line 645
    .line 646
    const/high16 v4, 0x40000000    # 2.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v0, 0x41a00000    # 20.0f

    .line 655
    .line 656
    const/high16 v2, 0x41400000    # 12.0f

    .line 657
    .line 658
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, -0x3f000000    # -8.0f

    .line 662
    .line 663
    const/high16 v18, -0x3f000000    # -8.0f

    .line 664
    .line 665
    const v13, -0x3f728f5c    # -4.42f

    .line 666
    .line 667
    .line 668
    const/4 v14, 0x0

    .line 669
    const/high16 v15, -0x3f000000    # -8.0f

    .line 670
    .line 671
    const v16, -0x3f9ae148    # -3.58f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x40651eb8    # 3.58f

    .line 678
    .line 679
    .line 680
    const/high16 v2, -0x3f000000    # -8.0f

    .line 681
    .line 682
    const/high16 v4, 0x41000000    # 8.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v2, 0x41000000    # 8.0f

    .line 688
    .line 689
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v0, -0x3f9ae148    # -3.58f

    .line 693
    .line 694
    .line 695
    const/high16 v2, -0x3f000000    # -8.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    const/high16 v12, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const/4 v15, 0x0

    .line 718
    const-string v4, ""

    .line 719
    .line 720
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    sput-object v0, Landroidx/compose/material/icons/twotone/SentimentSatisfiedKt;->_sentimentSatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 729
    .line 730
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    return-object v0
.end method
