.class public final Landroidx/compose/material/icons/outlined/BlurOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBlurOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BlurOffKt;->_blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BlurOff"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40800000    # -1.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/high16 v22, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    sget-object v2, Lqc/q;->a:Lqc/q;

    .line 108
    .line 109
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const/16 v16, 0x3800

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/high16 v6, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v8, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const v4, 0x415ccccd    # 13.8f

    .line 162
    .line 163
    .line 164
    const v6, 0x4137ae14    # 11.48f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x3ca3d70a    # 0.02f

    .line 171
    .line 172
    .line 173
    const v6, 0x3e4ccccd    # 0.2f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 180
    .line 181
    const/high16 v26, -0x40400000    # -1.5f

    .line 182
    .line 183
    const v21, 0x3f547ae1    # 0.83f

    .line 184
    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 189
    .line 190
    const v24, -0x40d47ae1    # -0.67f

    .line 191
    .line 192
    .line 193
    move-object/from16 v20, v2

    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, -0x40d47ae1    # -0.67f

    .line 199
    .line 200
    .line 201
    const/high16 v6, -0x40400000    # -1.5f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, 0x3f2b851f    # 0.67f

    .line 207
    .line 208
    .line 209
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 210
    .line 211
    const/high16 v7, -0x40400000    # -1.5f

    .line 212
    .line 213
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, 0x3ca3d70a    # 0.02f

    .line 217
    .line 218
    .line 219
    const v6, 0x3e4ccccd    # 0.2f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, 0x3fa3d70a    # 1.28f

    .line 226
    .line 227
    .line 228
    const v26, 0x3fa3d70a    # 1.28f

    .line 229
    .line 230
    .line 231
    const v21, 0x3db851ec    # 0.09f

    .line 232
    .line 233
    .line 234
    const v22, 0x3f2b851f    # 0.67f

    .line 235
    .line 236
    .line 237
    const v23, 0x3f1c28f6    # 0.61f

    .line 238
    .line 239
    .line 240
    const v24, 0x3f9851ec    # 1.19f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x40600000    # 3.5f

    .line 250
    .line 251
    const/high16 v6, 0x41600000    # 14.0f

    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, 0x3f000000    # 0.5f

    .line 257
    .line 258
    const/high16 v26, -0x41000000    # -0.5f

    .line 259
    .line 260
    const v21, 0x3e8f5c29    # 0.28f

    .line 261
    .line 262
    .line 263
    const/16 v22, 0x0

    .line 264
    .line 265
    const/high16 v23, 0x3f000000    # 0.5f

    .line 266
    .line 267
    const v24, -0x419eb852    # -0.22f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, -0x419eb852    # -0.22f

    .line 274
    .line 275
    .line 276
    const/high16 v6, -0x41000000    # -0.5f

    .line 277
    .line 278
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, 0x3e6147ae    # 0.22f

    .line 282
    .line 283
    .line 284
    const/high16 v7, 0x3f000000    # 0.5f

    .line 285
    .line 286
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v6, 0x3f000000    # 0.5f

    .line 290
    .line 291
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, 0x40600000    # 3.5f

    .line 298
    .line 299
    const/high16 v6, 0x41200000    # 10.0f

    .line 300
    .line 301
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, -0x419eb852    # -0.22f

    .line 308
    .line 309
    .line 310
    const/high16 v6, -0x41000000    # -0.5f

    .line 311
    .line 312
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x3e6147ae    # 0.22f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x3f000000    # 0.5f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const/high16 v6, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v7, 0x0

    .line 336
    const-string v4, ""

    .line 337
    .line 338
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 339
    .line 340
    .line 341
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v6

    .line 351
    const/4 v2, 0x0

    .line 352
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x41900000    # 18.0f

    .line 369
    .line 370
    const/high16 v6, 0x41200000    # 10.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/4 v4, 0x0

    .line 376
    const/high16 v6, -0x40800000    # -1.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v26, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/high16 v21, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/high16 v22, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/16 v23, 0x0

    .line 388
    .line 389
    const/16 v24, 0x1

    .line 390
    .line 391
    const/16 v25, 0x1

    .line 392
    .line 393
    move-object/from16 v20, v2

    .line 394
    .line 395
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v26, -0x40000000    # -2.0f

    .line 399
    .line 400
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const/high16 v6, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/4 v7, 0x0

    .line 410
    const-string v4, ""

    .line 411
    .line 412
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v6

    .line 425
    const/4 v2, 0x0

    .line 426
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x41900000    # 18.0f

    .line 443
    .line 444
    const/high16 v6, 0x40c00000    # 6.0f

    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    const/high16 v6, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v26, 0x40000000    # 2.0f

    .line 456
    .line 457
    move-object/from16 v20, v2

    .line 458
    .line 459
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v26, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/high16 v6, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const-string v4, ""

    .line 475
    .line 476
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 484
    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 486
    .line 487
    .line 488
    move-result-wide v6

    .line 489
    const/4 v2, 0x0

    .line 490
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    const/high16 v4, 0x41280000    # 10.5f

    .line 507
    .line 508
    const/high16 v6, 0x41a80000    # 21.0f

    .line 509
    .line 510
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v25, 0x3f000000    # 0.5f

    .line 514
    .line 515
    const/high16 v26, -0x41000000    # -0.5f

    .line 516
    .line 517
    const v21, 0x3e8f5c29    # 0.28f

    .line 518
    .line 519
    .line 520
    const/16 v22, 0x0

    .line 521
    .line 522
    const/high16 v23, 0x3f000000    # 0.5f

    .line 523
    .line 524
    const v24, -0x419eb852    # -0.22f

    .line 525
    .line 526
    .line 527
    move-object/from16 v20, v2

    .line 528
    .line 529
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v4, -0x419eb852    # -0.22f

    .line 533
    .line 534
    .line 535
    const/high16 v6, -0x41000000    # -0.5f

    .line 536
    .line 537
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x3e6147ae    # 0.22f

    .line 541
    .line 542
    .line 543
    const/high16 v7, 0x3f000000    # 0.5f

    .line 544
    .line 545
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v6, 0x3f000000    # 0.5f

    .line 549
    .line 550
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const-string v4, ""

    .line 564
    .line 565
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 566
    .line 567
    .line 568
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 573
    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 575
    .line 576
    .line 577
    move-result-wide v6

    .line 578
    const/4 v2, 0x0

    .line 579
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 583
    .line 584
    .line 585
    move-result v10

    .line 586
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x41200000    # 10.0f

    .line 596
    .line 597
    const/high16 v6, 0x40c00000    # 6.0f

    .line 598
    .line 599
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/4 v4, 0x0

    .line 603
    const/high16 v6, -0x40800000    # -1.0f

    .line 604
    .line 605
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v26, 0x40000000    # 2.0f

    .line 609
    .line 610
    const/high16 v21, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/high16 v22, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/16 v23, 0x0

    .line 615
    .line 616
    const/16 v24, 0x1

    .line 617
    .line 618
    const/16 v25, 0x1

    .line 619
    .line 620
    move-object/from16 v20, v2

    .line 621
    .line 622
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v26, -0x40000000    # -2.0f

    .line 626
    .line 627
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 647
    .line 648
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 649
    .line 650
    .line 651
    move-result-wide v6

    .line 652
    const/4 v2, 0x0

    .line 653
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 657
    .line 658
    .line 659
    move-result v10

    .line 660
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 661
    .line 662
    .line 663
    move-result v11

    .line 664
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 667
    .line 668
    .line 669
    const/high16 v4, 0x41900000    # 18.0f

    .line 670
    .line 671
    const/high16 v6, 0x41600000    # 14.0f

    .line 672
    .line 673
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/4 v4, 0x0

    .line 677
    const/high16 v6, -0x40800000    # -1.0f

    .line 678
    .line 679
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v26, 0x40000000    # 2.0f

    .line 683
    .line 684
    move-object/from16 v20, v2

    .line 685
    .line 686
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v26, -0x40000000    # -2.0f

    .line 690
    .line 691
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const-string v4, ""

    .line 702
    .line 703
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 704
    .line 705
    .line 706
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 711
    .line 712
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 713
    .line 714
    .line 715
    move-result-wide v6

    .line 716
    const/4 v2, 0x0

    .line 717
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 721
    .line 722
    .line 723
    move-result v10

    .line 724
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 725
    .line 726
    .line 727
    move-result v11

    .line 728
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 731
    .line 732
    .line 733
    const/high16 v4, 0x41900000    # 18.0f

    .line 734
    .line 735
    const/high16 v6, 0x40c00000    # 6.0f

    .line 736
    .line 737
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/4 v4, 0x0

    .line 741
    const/high16 v6, -0x40800000    # -1.0f

    .line 742
    .line 743
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v26, 0x40000000    # 2.0f

    .line 747
    .line 748
    move-object/from16 v20, v2

    .line 749
    .line 750
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v26, -0x40000000    # -2.0f

    .line 754
    .line 755
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const/high16 v6, 0x3f800000    # 1.0f

    .line 763
    .line 764
    const/4 v7, 0x0

    .line 765
    const-string v4, ""

    .line 766
    .line 767
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 768
    .line 769
    .line 770
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 775
    .line 776
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 777
    .line 778
    .line 779
    move-result-wide v6

    .line 780
    const/4 v2, 0x0

    .line 781
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 785
    .line 786
    .line 787
    move-result v10

    .line 788
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 789
    .line 790
    .line 791
    move-result v11

    .line 792
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 795
    .line 796
    .line 797
    const/high16 v4, 0x41a40000    # 20.5f

    .line 798
    .line 799
    const/high16 v6, 0x41600000    # 14.0f

    .line 800
    .line 801
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v25, -0x41000000    # -0.5f

    .line 805
    .line 806
    const/high16 v26, 0x3f000000    # 0.5f

    .line 807
    .line 808
    const v21, -0x4170a3d7    # -0.28f

    .line 809
    .line 810
    .line 811
    const/16 v22, 0x0

    .line 812
    .line 813
    const/high16 v23, -0x41000000    # -0.5f

    .line 814
    .line 815
    const v24, 0x3e6147ae    # 0.22f

    .line 816
    .line 817
    .line 818
    move-object/from16 v20, v2

    .line 819
    .line 820
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v4, 0x3e6147ae    # 0.22f

    .line 824
    .line 825
    .line 826
    const/high16 v6, 0x3f000000    # 0.5f

    .line 827
    .line 828
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v4, -0x419eb852    # -0.22f

    .line 832
    .line 833
    .line 834
    const/high16 v6, -0x41000000    # -0.5f

    .line 835
    .line 836
    const/high16 v7, 0x3f000000    # 0.5f

    .line 837
    .line 838
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v4, 0x41580000    # 13.5f

    .line 848
    .line 849
    const/high16 v6, 0x41a80000    # 21.0f

    .line 850
    .line 851
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v4, 0x3e6147ae    # 0.22f

    .line 858
    .line 859
    .line 860
    const/high16 v6, 0x3f000000    # 0.5f

    .line 861
    .line 862
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v4, -0x419eb852    # -0.22f

    .line 866
    .line 867
    .line 868
    const/high16 v6, -0x41000000    # -0.5f

    .line 869
    .line 870
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v4, 0x40400000    # 3.0f

    .line 880
    .line 881
    const/high16 v6, 0x41580000    # 13.5f

    .line 882
    .line 883
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v4, 0x3e6147ae    # 0.22f

    .line 890
    .line 891
    .line 892
    const/high16 v6, 0x3f000000    # 0.5f

    .line 893
    .line 894
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v4, -0x419eb852    # -0.22f

    .line 898
    .line 899
    .line 900
    const/high16 v6, -0x41000000    # -0.5f

    .line 901
    .line 902
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    const/high16 v6, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/4 v7, 0x0

    .line 918
    const-string v4, ""

    .line 919
    .line 920
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 921
    .line 922
    .line 923
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 928
    .line 929
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 930
    .line 931
    .line 932
    move-result-wide v6

    .line 933
    const/4 v2, 0x0

    .line 934
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 938
    .line 939
    .line 940
    move-result v10

    .line 941
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 942
    .line 943
    .line 944
    move-result v11

    .line 945
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 948
    .line 949
    .line 950
    const/high16 v4, 0x41900000    # 18.0f

    .line 951
    .line 952
    const/high16 v6, 0x41200000    # 10.0f

    .line 953
    .line 954
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/4 v4, 0x0

    .line 958
    const/high16 v6, -0x40800000    # -1.0f

    .line 959
    .line 960
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v26, 0x40000000    # 2.0f

    .line 964
    .line 965
    const/high16 v21, 0x3f800000    # 1.0f

    .line 966
    .line 967
    const/high16 v22, 0x3f800000    # 1.0f

    .line 968
    .line 969
    const/16 v23, 0x0

    .line 970
    .line 971
    const/16 v24, 0x1

    .line 972
    .line 973
    const/16 v25, 0x1

    .line 974
    .line 975
    move-object/from16 v20, v2

    .line 976
    .line 977
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const/high16 v26, -0x40000000    # -2.0f

    .line 981
    .line 982
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    const/high16 v6, 0x3f800000    # 1.0f

    .line 990
    .line 991
    const/4 v7, 0x0

    .line 992
    const-string v4, ""

    .line 993
    .line 994
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 995
    .line 996
    .line 997
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 998
    .line 999
    .line 1000
    move-result v3

    .line 1001
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1002
    .line 1003
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v6

    .line 1007
    const/4 v2, 0x0

    .line 1008
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1016
    .line 1017
    .line 1018
    move-result v11

    .line 1019
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1022
    .line 1023
    .line 1024
    const/high16 v4, 0x41180000    # 9.5f

    .line 1025
    .line 1026
    const/high16 v6, 0x40400000    # 3.0f

    .line 1027
    .line 1028
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const/high16 v25, -0x41000000    # -0.5f

    .line 1032
    .line 1033
    const/high16 v26, 0x3f000000    # 0.5f

    .line 1034
    .line 1035
    const v21, -0x4170a3d7    # -0.28f

    .line 1036
    .line 1037
    .line 1038
    const/16 v22, 0x0

    .line 1039
    .line 1040
    const/high16 v23, -0x41000000    # -0.5f

    .line 1041
    .line 1042
    const v24, 0x3e6147ae    # 0.22f

    .line 1043
    .line 1044
    .line 1045
    move-object/from16 v20, v2

    .line 1046
    .line 1047
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v4, 0x3e6147ae    # 0.22f

    .line 1051
    .line 1052
    .line 1053
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1054
    .line 1055
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v4, -0x419eb852    # -0.22f

    .line 1059
    .line 1060
    .line 1061
    const/high16 v6, -0x41000000    # -0.5f

    .line 1062
    .line 1063
    const/high16 v7, 0x3f000000    # 0.5f

    .line 1064
    .line 1065
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const/high16 v4, 0x41a40000    # 20.5f

    .line 1075
    .line 1076
    const/high16 v6, 0x41200000    # 10.0f

    .line 1077
    .line 1078
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v4, 0x3e6147ae    # 0.22f

    .line 1085
    .line 1086
    .line 1087
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1088
    .line 1089
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v4, -0x419eb852    # -0.22f

    .line 1093
    .line 1094
    .line 1095
    const/high16 v6, -0x41000000    # -0.5f

    .line 1096
    .line 1097
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1111
    .line 1112
    const/4 v7, 0x0

    .line 1113
    const-string v4, ""

    .line 1114
    .line 1115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1116
    .line 1117
    .line 1118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1119
    .line 1120
    .line 1121
    move-result v3

    .line 1122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1123
    .line 1124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v6

    .line 1128
    const/4 v2, 0x0

    .line 1129
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1133
    .line 1134
    .line 1135
    move-result v10

    .line 1136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1137
    .line 1138
    .line 1139
    move-result v11

    .line 1140
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1143
    .line 1144
    .line 1145
    const/high16 v4, 0x41600000    # 14.0f

    .line 1146
    .line 1147
    const/high16 v6, 0x40c00000    # 6.0f

    .line 1148
    .line 1149
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1150
    .line 1151
    .line 1152
    const/4 v4, 0x0

    .line 1153
    const/high16 v6, -0x40800000    # -1.0f

    .line 1154
    .line 1155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const/high16 v26, 0x40000000    # 2.0f

    .line 1159
    .line 1160
    const/high16 v21, 0x3f800000    # 1.0f

    .line 1161
    .line 1162
    const/high16 v22, 0x3f800000    # 1.0f

    .line 1163
    .line 1164
    const/16 v23, 0x0

    .line 1165
    .line 1166
    const/16 v24, 0x1

    .line 1167
    .line 1168
    const/16 v25, 0x1

    .line 1169
    .line 1170
    move-object/from16 v20, v2

    .line 1171
    .line 1172
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1173
    .line 1174
    .line 1175
    const/high16 v26, -0x40000000    # -2.0f

    .line 1176
    .line 1177
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v2

    .line 1184
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1185
    .line 1186
    const/4 v7, 0x0

    .line 1187
    const-string v4, ""

    .line 1188
    .line 1189
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1190
    .line 1191
    .line 1192
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1193
    .line 1194
    .line 1195
    move-result v3

    .line 1196
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1197
    .line 1198
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1199
    .line 1200
    .line 1201
    move-result-wide v6

    .line 1202
    const/4 v0, 0x0

    .line 1203
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1207
    .line 1208
    .line 1209
    move-result v10

    .line 1210
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1211
    .line 1212
    .line 1213
    move-result v11

    .line 1214
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1217
    .line 1218
    .line 1219
    const v0, 0x40a8a3d7    # 5.27f

    .line 1220
    .line 1221
    .line 1222
    const/high16 v2, 0x40200000    # 2.5f

    .line 1223
    .line 1224
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1225
    .line 1226
    .line 1227
    const v0, 0x410c51ec    # 8.77f

    .line 1228
    .line 1229
    .line 1230
    const/high16 v2, 0x40c00000    # 6.0f

    .line 1231
    .line 1232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const v0, 0x3e8f5c29    # 0.28f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const/high16 v0, 0x41100000    # 9.0f

    .line 1242
    .line 1243
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    const/high16 v17, -0x40800000    # -1.0f

    .line 1247
    .line 1248
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1249
    .line 1250
    const v13, -0x40f33333    # -0.55f

    .line 1251
    .line 1252
    .line 1253
    const/high16 v15, -0x40800000    # -1.0f

    .line 1254
    .line 1255
    const v16, 0x3ee66666    # 0.45f

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1259
    .line 1260
    .line 1261
    const v0, 0x3ee66666    # 0.45f

    .line 1262
    .line 1263
    .line 1264
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1265
    .line 1266
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1267
    .line 1268
    .line 1269
    const v0, -0x4119999a    # -0.45f

    .line 1270
    .line 1271
    .line 1272
    const/high16 v4, -0x40800000    # -1.0f

    .line 1273
    .line 1274
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    const v17, -0x428a3d71    # -0.06f

    .line 1278
    .line 1279
    .line 1280
    const v18, -0x4170a3d7    # -0.28f

    .line 1281
    .line 1282
    .line 1283
    const/4 v13, 0x0

    .line 1284
    const v14, -0x42333333    # -0.1f

    .line 1285
    .line 1286
    .line 1287
    const v15, -0x430a3d71    # -0.03f

    .line 1288
    .line 1289
    .line 1290
    const v16, -0x41bd70a4    # -0.19f

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    const v0, 0x4033d70a    # 2.81f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    const/high16 v17, -0x40600000    # -1.25f

    .line 1303
    .line 1304
    const v18, 0x3fbc28f6    # 1.47f

    .line 1305
    .line 1306
    .line 1307
    const v13, -0x40ca3d71    # -0.71f

    .line 1308
    .line 1309
    .line 1310
    const v14, 0x3de147ae    # 0.11f

    .line 1311
    .line 1312
    .line 1313
    const/high16 v15, -0x40600000    # -1.25f

    .line 1314
    .line 1315
    const v16, 0x3f3ae148    # 0.73f

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1319
    .line 1320
    .line 1321
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 1322
    .line 1323
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1324
    .line 1325
    const/4 v13, 0x0

    .line 1326
    const v14, 0x3f547ae1    # 0.83f

    .line 1327
    .line 1328
    .line 1329
    const v15, 0x3f2b851f    # 0.67f

    .line 1330
    .line 1331
    .line 1332
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 1333
    .line 1334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1335
    .line 1336
    .line 1337
    const v17, 0x3fbc28f6    # 1.47f

    .line 1338
    .line 1339
    .line 1340
    const/high16 v18, -0x40600000    # -1.25f

    .line 1341
    .line 1342
    const v13, 0x3f3d70a4    # 0.74f

    .line 1343
    .line 1344
    .line 1345
    const/4 v14, 0x0

    .line 1346
    const v15, 0x3fae147b    # 1.36f

    .line 1347
    .line 1348
    .line 1349
    const v16, -0x40f5c28f    # -0.54f

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    const v17, -0x4170a3d7    # -0.28f

    .line 1359
    .line 1360
    .line 1361
    const v18, -0x428a3d71    # -0.06f

    .line 1362
    .line 1363
    .line 1364
    const v13, -0x4247ae14    # -0.09f

    .line 1365
    .line 1366
    .line 1367
    const v14, -0x430a3d71    # -0.03f

    .line 1368
    .line 1369
    .line 1370
    const v15, -0x41c7ae14    # -0.18f

    .line 1371
    .line 1372
    .line 1373
    const v16, -0x428a3d71    # -0.06f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const/high16 v17, -0x40800000    # -1.0f

    .line 1380
    .line 1381
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1382
    .line 1383
    const v13, -0x40f33333    # -0.55f

    .line 1384
    .line 1385
    .line 1386
    const/4 v14, 0x0

    .line 1387
    const/high16 v15, -0x40800000    # -1.0f

    .line 1388
    .line 1389
    const v16, 0x3ee66666    # 0.45f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v0, 0x3ee66666    # 0.45f

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1399
    .line 1400
    .line 1401
    const v0, -0x4119999a    # -0.45f

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1405
    .line 1406
    .line 1407
    const v17, -0x428a3d71    # -0.06f

    .line 1408
    .line 1409
    .line 1410
    const v18, -0x4170a3d7    # -0.28f

    .line 1411
    .line 1412
    .line 1413
    const/4 v13, 0x0

    .line 1414
    const v14, -0x42333333    # -0.1f

    .line 1415
    .line 1416
    .line 1417
    const v15, -0x430a3d71    # -0.03f

    .line 1418
    .line 1419
    .line 1420
    const v16, -0x41bd70a4    # -0.19f

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1424
    .line 1425
    .line 1426
    const v0, 0x4071eb85    # 3.78f

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1430
    .line 1431
    .line 1432
    const v0, 0x3c23d70a    # 0.01f

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1436
    .line 1437
    .line 1438
    const v0, 0x3fb47ae1    # 1.41f

    .line 1439
    .line 1440
    .line 1441
    const v2, -0x404b851f    # -1.41f

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1445
    .line 1446
    .line 1447
    const v0, 0x407a3d71    # 3.91f

    .line 1448
    .line 1449
    .line 1450
    const v2, 0x40770a3d    # 3.86f

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1454
    .line 1455
    .line 1456
    const v0, 0x40a8a3d7    # 5.27f

    .line 1457
    .line 1458
    .line 1459
    const/high16 v2, 0x40200000    # 2.5f

    .line 1460
    .line 1461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v2

    .line 1471
    const/16 v16, 0x3800

    .line 1472
    .line 1473
    const/16 v17, 0x0

    .line 1474
    .line 1475
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1476
    .line 1477
    const/4 v7, 0x0

    .line 1478
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1479
    .line 1480
    const/4 v14, 0x0

    .line 1481
    const/4 v15, 0x0

    .line 1482
    const-string v4, ""

    .line 1483
    .line 1484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    sput-object v0, Landroidx/compose/material/icons/outlined/BlurOffKt;->_blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1493
    .line 1494
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    return-object v0
.end method
