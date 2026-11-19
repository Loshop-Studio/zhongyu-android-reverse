.class public final Landroidx/compose/material/icons/twotone/LockPersonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLockPerson(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LockPersonKt;->_lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LockPerson"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const v4, 0x40a947ae    # 5.29f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v25, 0x41300000    # 11.0f

    .line 87
    .line 88
    const/high16 v26, 0x41900000    # 18.0f

    .line 89
    .line 90
    const v21, 0x4131999a    # 11.1f

    .line 91
    .line 92
    .line 93
    const v22, 0x419af5c3    # 19.37f

    .line 94
    .line 95
    .line 96
    const/high16 v23, 0x41300000    # 11.0f

    .line 97
    .line 98
    const v24, 0x4195999a    # 18.7f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40e00000    # 7.0f

    .line 107
    .line 108
    const/high16 v26, -0x3f200000    # -7.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, -0x3f8851ec    # -3.87f

    .line 113
    .line 114
    .line 115
    const v23, 0x404851ec    # 3.13f

    .line 116
    .line 117
    .line 118
    const/high16 v24, -0x3f200000    # -7.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, -0x40800000    # -1.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const/16 v16, 0x3800

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const v6, 0x3e99999a    # 0.3f

    .line 145
    .line 146
    .line 147
    const v8, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    const/high16 v9, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v12, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    const-string v4, ""

    .line 159
    .line 160
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    const/4 v2, 0x0

    .line 174
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x41a00000    # 20.0f

    .line 191
    .line 192
    const/high16 v6, 0x40c00000    # 6.0f

    .line 193
    .line 194
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41200000    # 10.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v26, 0x3e947ae1    # 0.29f

    .line 215
    .line 216
    .line 217
    const v21, 0x3f333333    # 0.7f

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const v23, 0x3faf5c29    # 1.37f

    .line 223
    .line 224
    .line 225
    const v24, 0x3dcccccd    # 0.1f

    .line 226
    .line 227
    .line 228
    move-object/from16 v20, v2

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41200000    # 10.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/high16 v26, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/16 v21, 0x0

    .line 243
    .line 244
    const v22, -0x40733333    # -1.1f

    .line 245
    .line 246
    .line 247
    const v23, -0x4099999a    # -0.9f

    .line 248
    .line 249
    .line 250
    const/high16 v24, -0x40000000    # -2.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, -0x40800000    # -1.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x40c00000    # 6.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, -0x3f600000    # -5.0f

    .line 266
    .line 267
    const/high16 v26, -0x3f600000    # -5.0f

    .line 268
    .line 269
    const v22, -0x3fcf5c29    # -2.76f

    .line 270
    .line 271
    .line 272
    const v23, -0x3ff0a3d7    # -2.24f

    .line 273
    .line 274
    .line 275
    const/high16 v24, -0x3f600000    # -5.0f

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v4, 0x404f5c29    # 3.24f

    .line 281
    .line 282
    .line 283
    const/high16 v6, 0x40e00000    # 7.0f

    .line 284
    .line 285
    const/high16 v7, 0x40c00000    # 6.0f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40c00000    # 6.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v25, -0x40000000    # -2.0f

    .line 301
    .line 302
    const/high16 v26, 0x40000000    # 2.0f

    .line 303
    .line 304
    const v21, -0x40733333    # -1.1f

    .line 305
    .line 306
    .line 307
    const/16 v22, 0x0

    .line 308
    .line 309
    const/high16 v23, -0x40000000    # -2.0f

    .line 310
    .line 311
    const v24, 0x3f666666    # 0.9f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41200000    # 10.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v25, 0x40000000    # 2.0f

    .line 323
    .line 324
    const/16 v21, 0x0

    .line 325
    .line 326
    const v22, 0x3f8ccccd    # 1.1f

    .line 327
    .line 328
    .line 329
    const v23, 0x3f666666    # 0.9f

    .line 330
    .line 331
    .line 332
    const/high16 v24, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x40c851ec    # 6.26f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v25, -0x4087ae14    # -0.97f

    .line 344
    .line 345
    .line 346
    const/high16 v26, -0x40000000    # -2.0f

    .line 347
    .line 348
    const v21, -0x4128f5c3    # -0.42f

    .line 349
    .line 350
    .line 351
    const v22, -0x40e66666    # -0.6f

    .line 352
    .line 353
    .line 354
    const/high16 v23, -0x40c00000    # -0.75f

    .line 355
    .line 356
    const v24, -0x405c28f6    # -1.28f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x40c00000    # 6.0f

    .line 363
    .line 364
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x41100000    # 9.0f

    .line 371
    .line 372
    const/high16 v6, 0x40c00000    # 6.0f

    .line 373
    .line 374
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v25, 0x40400000    # 3.0f

    .line 378
    .line 379
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 380
    .line 381
    const/16 v21, 0x0

    .line 382
    .line 383
    const v22, -0x402b851f    # -1.66f

    .line 384
    .line 385
    .line 386
    const v23, 0x3fab851f    # 1.34f

    .line 387
    .line 388
    .line 389
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v4, 0x3fab851f    # 1.34f

    .line 395
    .line 396
    .line 397
    const/high16 v6, 0x40400000    # 3.0f

    .line 398
    .line 399
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v4, 0x40000000    # 2.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x41100000    # 9.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x40c00000    # 6.0f

    .line 413
    .line 414
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    const/high16 v6, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v8, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const-string v4, ""

    .line 430
    .line 431
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 432
    .line 433
    .line 434
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 439
    .line 440
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 441
    .line 442
    .line 443
    move-result-wide v6

    .line 444
    const/4 v0, 0x0

    .line 445
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41500000    # 13.0f

    .line 462
    .line 463
    const/high16 v2, 0x41900000    # 18.0f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, -0x3f600000    # -5.0f

    .line 469
    .line 470
    const/high16 v18, 0x40a00000    # 5.0f

    .line 471
    .line 472
    const v13, -0x3fcf5c29    # -2.76f

    .line 473
    .line 474
    .line 475
    const/high16 v15, -0x3f600000    # -5.0f

    .line 476
    .line 477
    const v16, 0x400f5c29    # 2.24f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x400f5c29    # 2.24f

    .line 484
    .line 485
    .line 486
    const/high16 v2, 0x40a00000    # 5.0f

    .line 487
    .line 488
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, -0x3ff0a3d7    # -2.24f

    .line 492
    .line 493
    .line 494
    const/high16 v2, -0x3f600000    # -5.0f

    .line 495
    .line 496
    const/high16 v4, 0x40a00000    # 5.0f

    .line 497
    .line 498
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x41a6147b    # 20.76f

    .line 502
    .line 503
    .line 504
    const/high16 v2, 0x41500000    # 13.0f

    .line 505
    .line 506
    const/high16 v4, 0x41900000    # 18.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41700000    # 15.0f

    .line 515
    .line 516
    const/high16 v2, 0x41900000    # 18.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 522
    .line 523
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 524
    .line 525
    const v13, 0x3f547ae1    # 0.83f

    .line 526
    .line 527
    .line 528
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 529
    .line 530
    const v16, 0x3f2b851f    # 0.67f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x4196a3d7    # 18.83f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x40d47ae1    # -0.67f

    .line 543
    .line 544
    .line 545
    const/high16 v2, -0x40400000    # -1.5f

    .line 546
    .line 547
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x41895c29    # 17.17f

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x41700000    # 15.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41a80000    # 21.0f

    .line 562
    .line 563
    const/high16 v2, 0x41900000    # 18.0f

    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x3fe147ae    # -2.48f

    .line 569
    .line 570
    .line 571
    const v18, -0x40570a3d    # -1.32f

    .line 572
    .line 573
    .line 574
    const v13, -0x407c28f6    # -1.03f

    .line 575
    .line 576
    .line 577
    const v15, -0x4007ae14    # -1.94f

    .line 578
    .line 579
    .line 580
    const v16, -0x40fae148    # -0.52f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x41900000    # 18.0f

    .line 587
    .line 588
    const/high16 v18, 0x41980000    # 19.0f

    .line 589
    .line 590
    const/high16 v13, 0x41820000    # 16.25f

    .line 591
    .line 592
    const v14, 0x419a147b    # 19.26f

    .line 593
    .line 594
    .line 595
    const v15, 0x4188b852    # 17.09f

    .line 596
    .line 597
    .line 598
    const/high16 v16, 0x41980000    # 19.0f

    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x401eb852    # 2.48f

    .line 604
    .line 605
    .line 606
    const v2, 0x3f2e147b    # 0.68f

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 610
    .line 611
    const v6, 0x3e851eb8    # 0.26f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v18, 0x41a80000    # 21.0f

    .line 618
    .line 619
    const v13, 0x419f851f    # 19.94f

    .line 620
    .line 621
    .line 622
    const v14, 0x41a3d70a    # 20.48f

    .line 623
    .line 624
    .line 625
    const v15, 0x41983d71    # 19.03f

    .line 626
    .line 627
    .line 628
    const/high16 v16, 0x41a80000    # 21.0f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const/16 v16, 0x3800

    .line 641
    .line 642
    const/16 v17, 0x0

    .line 643
    .line 644
    const/high16 v6, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v12, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const/4 v14, 0x0

    .line 651
    const/4 v15, 0x0

    .line 652
    const-string v4, ""

    .line 653
    .line 654
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    sput-object v0, Landroidx/compose/material/icons/twotone/LockPersonKt;->_lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    return-object v0
.end method
