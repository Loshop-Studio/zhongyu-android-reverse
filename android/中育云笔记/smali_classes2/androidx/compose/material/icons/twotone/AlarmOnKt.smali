.class public final Landroidx/compose/material/icons/twotone/AlarmOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarmOn(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AlarmOnKt;->_alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AlarmOn"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f200000    # -7.0f

    .line 78
    .line 79
    const/high16 v26, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const v21, -0x3f88f5c3    # -3.86f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f200000    # -7.0f

    .line 87
    .line 88
    const v24, 0x4048f5c3    # 3.14f

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
    const v4, 0x4048f5c3    # 3.14f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40e00000    # 7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3fb70a3d    # -3.14f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f200000    # -7.0f

    .line 108
    .line 109
    const/high16 v7, 0x40e00000    # 7.0f

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
    const v4, 0x41287ae1    # 10.53f

    .line 121
    .line 122
    .line 123
    const v6, 0x41851eb8    # 16.64f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x3fb47ae1    # -3.18f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, -0x407851ec    # -1.06f

    .line 136
    .line 137
    .line 138
    const v6, 0x3f87ae14    # 1.06f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x400851ec    # 2.13f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x409dc28f    # 4.93f

    .line 151
    .line 152
    .line 153
    const v6, -0x3f61999a    # -4.95f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x3f87ae14    # 1.06f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, -0x3f400000    # -6.0f

    .line 166
    .line 167
    const/high16 v6, 0x40c00000    # 6.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const/16 v16, 0x3800

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const v6, 0x3e99999a    # 0.3f

    .line 184
    .line 185
    .line 186
    const v8, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const/4 v0, 0x0

    .line 213
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const v0, 0x4128a3d7    # 10.54f

    .line 230
    .line 231
    .line 232
    const v2, 0x41687ae1    # 14.53f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x41068f5c    # 8.41f

    .line 239
    .line 240
    .line 241
    const v2, 0x41466666    # 12.4f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x407851ec    # -1.06f

    .line 248
    .line 249
    .line 250
    const v2, 0x3f87ae14    # 1.06f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x404b851f    # 3.18f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, -0x3f400000    # -6.0f

    .line 263
    .line 264
    const/high16 v2, 0x40c00000    # 6.0f

    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x407851ec    # -1.06f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x418ab22d    # 17.337f

    .line 279
    .line 280
    .line 281
    const v2, 0x3fe7ae14    # 1.81f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x40936c8b    # 4.607f

    .line 288
    .line 289
    .line 290
    const v2, 0x4076147b    # 3.845f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3fc47ae1    # 1.535f

    .line 297
    .line 298
    .line 299
    const v2, -0x405c28f6    # -1.28f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x3f6c7ae1    # -4.61f

    .line 306
    .line 307
    .line 308
    const v2, -0x3f8a0c4a    # -3.843f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x40d5374c    # 6.663f

    .line 318
    .line 319
    .line 320
    const v2, 0x3fe7ae14    # 1.81f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x3fa41893    # 1.282f

    .line 327
    .line 328
    .line 329
    const v2, 0x3fc49ba6    # 1.536f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x40559168    # 3.337f

    .line 336
    .line 337
    .line 338
    const v2, 0x40e6147b    # 7.19f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, -0x403b645a    # -1.536f

    .line 345
    .line 346
    .line 347
    const v2, -0x405c28f6    # -1.28f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x40800000    # 4.0f

    .line 357
    .line 358
    const/high16 v2, 0x41400000    # 12.0f

    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 364
    .line 365
    const/high16 v18, 0x41100000    # 9.0f

    .line 366
    .line 367
    const v13, -0x3f60f5c3    # -4.97f

    .line 368
    .line 369
    .line 370
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 371
    .line 372
    const v16, 0x4080f5c3    # 4.03f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x4080f5c3    # 4.03f

    .line 379
    .line 380
    .line 381
    const/high16 v2, 0x41100000    # 9.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x3f7f0a3d    # -4.03f

    .line 387
    .line 388
    .line 389
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 390
    .line 391
    const/high16 v4, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41a00000    # 20.0f

    .line 403
    .line 404
    const/high16 v2, 0x41400000    # 12.0f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, -0x3f200000    # -7.0f

    .line 410
    .line 411
    const/high16 v18, -0x3f200000    # -7.0f

    .line 412
    .line 413
    const v13, -0x3f88f5c3    # -3.86f

    .line 414
    .line 415
    .line 416
    const/high16 v15, -0x3f200000    # -7.0f

    .line 417
    .line 418
    const v16, -0x3fb70a3d    # -3.14f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4048f5c3    # 3.14f

    .line 425
    .line 426
    .line 427
    const/high16 v2, -0x3f200000    # -7.0f

    .line 428
    .line 429
    const/high16 v4, 0x40e00000    # 7.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x40e00000    # 7.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, -0x3fb70a3d    # -3.14f

    .line 440
    .line 441
    .line 442
    const/high16 v2, -0x3f200000    # -7.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/16 v16, 0x3800

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/high16 v6, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v8, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v7, 0x0

    .line 463
    const/high16 v12, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v15, 0x0

    .line 467
    const-string v4, ""

    .line 468
    .line 469
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    sput-object v0, Landroidx/compose/material/icons/twotone/AlarmOnKt;->_alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-object v0
.end method
