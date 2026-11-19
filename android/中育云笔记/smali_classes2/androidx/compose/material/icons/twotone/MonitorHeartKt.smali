.class public final Landroidx/compose/material/icons/twotone/MonitorHeartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonitorHeart(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MonitorHeartKt;->_monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MonitorHeart"

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
    const v4, 0x4171c28f    # 15.11f

    .line 71
    .line 72
    .line 73
    const v6, 0x41473333    # 12.45f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4123d70a    # 10.24f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, -0x3fb8f5c3    # -3.11f

    .line 88
    .line 89
    .line 90
    const v6, 0x40c6b852    # 6.21f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/high16 v26, 0x41880000    # 17.0f

    .line 99
    .line 100
    const v21, 0x412b851f    # 10.72f

    .line 101
    .line 102
    .line 103
    const v22, 0x418651ec    # 16.79f

    .line 104
    .line 105
    .line 106
    const v23, 0x4126147b    # 10.38f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x41880000    # 17.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x40c7ae14    # -0.72f

    .line 117
    .line 118
    .line 119
    const v6, -0x409c28f6    # -0.89f

    .line 120
    .line 121
    .line 122
    const v7, -0x40f33333    # -0.55f

    .line 123
    .line 124
    .line 125
    const v8, -0x41a8f5c3    # -0.21f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x40ec28f6    # 7.38f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x41500000    # 13.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x40400000    # 3.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x41800000    # 16.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, -0x40000000    # -2.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, -0x3f400000    # -6.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x4171c28f    # 15.11f

    .line 181
    .line 182
    .line 183
    const v26, 0x41473333    # 12.45f

    .line 184
    .line 185
    .line 186
    const v21, 0x4179eb85    # 15.62f

    .line 187
    .line 188
    .line 189
    const/high16 v22, 0x41500000    # 13.0f

    .line 190
    .line 191
    const v23, 0x41747ae1    # 15.28f

    .line 192
    .line 193
    .line 194
    const v24, 0x414ca3d7    # 12.79f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/16 v16, 0x3800

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v6, 0x3e99999a    # 0.3f

    .line 212
    .line 213
    .line 214
    const v8, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const/high16 v9, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v12, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const-string v4, ""

    .line 226
    .line 227
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    const/4 v2, 0x0

    .line 241
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x41a00000    # 20.0f

    .line 258
    .line 259
    const/high16 v6, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x40800000    # 4.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x40400000    # 3.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x40000000    # 2.0f

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40c00000    # 6.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, 0x3f63d70a    # 0.89f

    .line 288
    .line 289
    .line 290
    const v26, 0x3f0ccccd    # 0.55f

    .line 291
    .line 292
    .line 293
    const v21, 0x3ec28f5c    # 0.38f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const v23, 0x3f3851ec    # 0.72f

    .line 299
    .line 300
    .line 301
    const v24, 0x3e570a3d    # 0.21f

    .line 302
    .line 303
    .line 304
    move-object/from16 v20, v2

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x415c28f6    # 13.76f

    .line 310
    .line 311
    .line 312
    const/high16 v6, 0x41200000    # 10.0f

    .line 313
    .line 314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x40470a3d    # 3.11f

    .line 318
    .line 319
    .line 320
    const v6, -0x3f3947ae    # -6.21f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x3fe51eb8    # 1.79f

    .line 327
    .line 328
    .line 329
    const/16 v26, 0x0

    .line 330
    .line 331
    const v21, 0x3eae147b    # 0.34f

    .line 332
    .line 333
    .line 334
    const v22, -0x40d1eb85    # -0.68f

    .line 335
    .line 336
    .line 337
    const v23, 0x3fb9999a    # 1.45f

    .line 338
    .line 339
    .line 340
    const v24, -0x40d1eb85    # -0.68f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x4184f5c3    # 16.62f

    .line 347
    .line 348
    .line 349
    const/high16 v6, 0x41300000    # 11.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x41b00000    # 22.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, 0x41100000    # 9.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v4, -0x40000000    # -2.0f

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40c00000    # 6.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const v6, 0x3e99999a    # 0.3f

    .line 382
    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    const/4 v2, 0x0

    .line 401
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const/high16 v4, 0x41a00000    # 20.0f

    .line 418
    .line 419
    const/high16 v6, 0x40800000    # 4.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v4, 0x40800000    # 4.0f

    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v25, 0x40000000    # 2.0f

    .line 430
    .line 431
    const/high16 v26, 0x40c00000    # 6.0f

    .line 432
    .line 433
    const v21, 0x4039999a    # 2.9f

    .line 434
    .line 435
    .line 436
    const/high16 v22, 0x40800000    # 4.0f

    .line 437
    .line 438
    const/high16 v23, 0x40000000    # 2.0f

    .line 439
    .line 440
    const v24, 0x409ccccd    # 4.9f

    .line 441
    .line 442
    .line 443
    move-object/from16 v20, v2

    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v4, 0x40400000    # 3.0f

    .line 449
    .line 450
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x40000000    # 2.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v4, 0x40c00000    # 6.0f

    .line 459
    .line 460
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x41800000    # 16.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40400000    # 3.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x40c00000    # 6.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v25, 0x41a00000    # 20.0f

    .line 484
    .line 485
    const/high16 v26, 0x40800000    # 4.0f

    .line 486
    .line 487
    const/high16 v21, 0x41b00000    # 22.0f

    .line 488
    .line 489
    const v22, 0x409ccccd    # 4.9f

    .line 490
    .line 491
    .line 492
    const v23, 0x41a8cccd    # 21.1f

    .line 493
    .line 494
    .line 495
    const/high16 v24, 0x40800000    # 4.0f

    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    const/high16 v6, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const/high16 v8, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/4 v7, 0x0

    .line 512
    const-string v4, ""

    .line 513
    .line 514
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 515
    .line 516
    .line 517
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 522
    .line 523
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 524
    .line 525
    .line 526
    move-result-wide v6

    .line 527
    const/4 v2, 0x0

    .line 528
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 536
    .line 537
    .line 538
    move-result v11

    .line 539
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 542
    .line 543
    .line 544
    const/high16 v4, 0x41900000    # 18.0f

    .line 545
    .line 546
    const/high16 v6, 0x41a00000    # 20.0f

    .line 547
    .line 548
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v4, 0x40800000    # 4.0f

    .line 552
    .line 553
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 557
    .line 558
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v4, 0x40400000    # 3.0f

    .line 567
    .line 568
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v25, 0x40000000    # 2.0f

    .line 572
    .line 573
    const/high16 v26, 0x40000000    # 2.0f

    .line 574
    .line 575
    const/16 v21, 0x0

    .line 576
    .line 577
    const v22, 0x3f8ccccd    # 1.1f

    .line 578
    .line 579
    .line 580
    const v23, 0x3f666666    # 0.9f

    .line 581
    .line 582
    .line 583
    const/high16 v24, 0x40000000    # 2.0f

    .line 584
    .line 585
    move-object/from16 v20, v2

    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v4, 0x41800000    # 16.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v26, -0x40000000    # -2.0f

    .line 596
    .line 597
    const v21, 0x3f8ccccd    # 1.1f

    .line 598
    .line 599
    .line 600
    const/16 v22, 0x0

    .line 601
    .line 602
    const/high16 v23, 0x40000000    # 2.0f

    .line 603
    .line 604
    const v24, -0x4099999a    # -0.9f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v4, -0x40000000    # -2.0f

    .line 616
    .line 617
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v4, 0x41900000    # 18.0f

    .line 621
    .line 622
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    const/high16 v6, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const-string v4, ""

    .line 636
    .line 637
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 638
    .line 639
    .line 640
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 647
    .line 648
    .line 649
    move-result-wide v6

    .line 650
    const/4 v0, 0x0

    .line 651
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    const v0, 0x40f1999a    # 7.55f

    .line 668
    .line 669
    .line 670
    const v2, 0x416e3d71    # 14.89f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, -0x401ae148    # -1.79f

    .line 677
    .line 678
    .line 679
    const/16 v18, 0x0

    .line 680
    .line 681
    const v13, -0x4151eb85    # -0.34f

    .line 682
    .line 683
    .line 684
    const v14, -0x40d1eb85    # -0.68f

    .line 685
    .line 686
    .line 687
    const v15, -0x40466666    # -1.45f

    .line 688
    .line 689
    .line 690
    const v16, -0x40d1eb85    # -0.68f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v0, 0x415c28f6    # 13.76f

    .line 697
    .line 698
    .line 699
    const/high16 v2, 0x41200000    # 10.0f

    .line 700
    .line 701
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, -0x4071eb85    # -1.11f

    .line 705
    .line 706
    .line 707
    const v2, -0x3ff28f5c    # -2.21f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v17, 0x41000000    # 8.0f

    .line 714
    .line 715
    const/high16 v18, 0x41300000    # 11.0f

    .line 716
    .line 717
    const v13, 0x410b851f    # 8.72f

    .line 718
    .line 719
    .line 720
    const v14, 0x41335c29    # 11.21f

    .line 721
    .line 722
    .line 723
    const v15, 0x4106147b    # 8.38f

    .line 724
    .line 725
    .line 726
    const/high16 v16, 0x41300000    # 11.0f

    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x40000000    # 2.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, 0x40ac28f6    # 5.38f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x3fdc28f6    # 1.72f

    .line 746
    .line 747
    .line 748
    const v2, 0x405ccccd    # 3.45f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v17, 0x41200000    # 10.0f

    .line 755
    .line 756
    const/high16 v18, 0x41880000    # 17.0f

    .line 757
    .line 758
    const v13, 0x41147ae1    # 9.28f

    .line 759
    .line 760
    .line 761
    const v14, 0x418651ec    # 16.79f

    .line 762
    .line 763
    .line 764
    const v15, 0x4119eb85    # 9.62f

    .line 765
    .line 766
    .line 767
    const/high16 v16, 0x41880000    # 17.0f

    .line 768
    .line 769
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, 0x3f3851ec    # 0.72f

    .line 773
    .line 774
    .line 775
    const v2, 0x3f63d70a    # 0.89f

    .line 776
    .line 777
    .line 778
    const v4, -0x40f33333    # -0.55f

    .line 779
    .line 780
    .line 781
    const v6, -0x41a8f5c3    # -0.21f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x4123d70a    # 10.24f

    .line 788
    .line 789
    .line 790
    const/high16 v2, 0x41600000    # 14.0f

    .line 791
    .line 792
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v0, 0x3f8e147b    # 1.11f

    .line 796
    .line 797
    .line 798
    const v2, 0x400d70a4    # 2.21f

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v17, 0x41800000    # 16.0f

    .line 805
    .line 806
    const/high16 v18, 0x41500000    # 13.0f

    .line 807
    .line 808
    const v13, 0x41747ae1    # 15.28f

    .line 809
    .line 810
    .line 811
    const v14, 0x414ca3d7    # 12.79f

    .line 812
    .line 813
    .line 814
    const v15, 0x4179eb85    # 15.62f

    .line 815
    .line 816
    .line 817
    const/high16 v16, 0x41500000    # 13.0f

    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v0, 0x40c00000    # 6.0f

    .line 823
    .line 824
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v0, -0x40000000    # -2.0f

    .line 828
    .line 829
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v0, -0x3f53d70a    # -5.38f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v0, 0x40f1999a    # 7.55f

    .line 839
    .line 840
    .line 841
    const v2, 0x416e3d71    # 14.89f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    const/16 v16, 0x3800

    .line 855
    .line 856
    const/16 v17, 0x0

    .line 857
    .line 858
    const/high16 v6, 0x3f800000    # 1.0f

    .line 859
    .line 860
    const/4 v7, 0x0

    .line 861
    const/high16 v12, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/4 v13, 0x0

    .line 864
    const/4 v14, 0x0

    .line 865
    const/4 v15, 0x0

    .line 866
    const-string v4, ""

    .line 867
    .line 868
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sput-object v0, Landroidx/compose/material/icons/twotone/MonitorHeartKt;->_monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 877
    .line 878
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-object v0
.end method
