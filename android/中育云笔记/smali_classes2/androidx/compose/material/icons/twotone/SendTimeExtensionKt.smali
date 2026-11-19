.class public final Landroidx/compose/material/icons/twotone/SendTimeExtensionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSendTimeExtension(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SendTimeExtensionKt;->_sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SendTimeExtension"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x41000000    # -0.5f

    .line 83
    .line 84
    const/high16 v26, -0x41000000    # -0.5f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x4170a3d7    # -0.28f

    .line 89
    .line 90
    .line 91
    const v23, -0x419eb852    # -0.22f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x41000000    # -0.5f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x406e147b    # 3.72f

    .line 102
    .line 103
    .line 104
    const/high16 v6, 0x41300000    # 11.0f

    .line 105
    .line 106
    const/high16 v7, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x40a051ec    # 5.01f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x400851ec    # 2.13f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, 0x41000000    # 8.0f

    .line 129
    .line 130
    const/high16 v26, 0x41480000    # 12.5f

    .line 131
    .line 132
    const v21, 0x40e570a4    # 7.17f

    .line 133
    .line 134
    .line 135
    const v22, 0x410f0a3d    # 8.94f

    .line 136
    .line 137
    .line 138
    const/high16 v23, 0x41000000    # 8.0f

    .line 139
    .line 140
    const v24, 0x413028f6    # 11.01f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 147
    .line 148
    const v26, 0x408bd70a    # 4.37f

    .line 149
    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 154
    .line 155
    const v23, -0x40ab851f    # -0.83f

    .line 156
    .line 157
    .line 158
    const v24, 0x40647ae1    # 3.57f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x41980000    # 19.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x400851ec    # 2.13f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x4077ae14    # 3.87f

    .line 176
    .line 177
    .line 178
    const v26, -0x3fc1eb85    # -2.97f

    .line 179
    .line 180
    .line 181
    const v21, 0x3f35c28f    # 0.71f

    .line 182
    .line 183
    .line 184
    const v22, -0x4008f5c3    # -1.93f

    .line 185
    .line 186
    .line 187
    const v23, 0x401c28f6    # 2.44f

    .line 188
    .line 189
    .line 190
    const v24, -0x3fcccccd    # -2.8f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x410c28f6    # 8.76f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x4038f5c3    # 2.89f

    .line 208
    .line 209
    .line 210
    const v6, 0x3fb9999a    # 1.45f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41900000    # 18.0f

    .line 217
    .line 218
    const v6, 0x414428f6    # 12.26f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, 0x40c00000    # 6.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x41400000    # 12.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    const/16 v16, 0x3800

    .line 242
    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const v6, 0x3e99999a    # 0.3f

    .line 246
    .line 247
    .line 248
    const v8, 0x3e99999a    # 0.3f

    .line 249
    .line 250
    .line 251
    const/4 v7, 0x0

    .line 252
    const/high16 v9, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v12, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const/4 v14, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    const-string v4, ""

    .line 260
    .line 261
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 269
    .line 270
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 271
    .line 272
    .line 273
    move-result-wide v6

    .line 274
    const/4 v2, 0x0

    .line 275
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const v4, 0x40e428f6    # 7.13f

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x41980000    # 19.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x40a00000    # 5.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v4, -0x3ff7ae14    # -2.13f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v25, 0x40400000    # 3.0f

    .line 311
    .line 312
    const v26, -0x3f7428f6    # -4.37f

    .line 313
    .line 314
    .line 315
    const v21, 0x400ae148    # 2.17f

    .line 316
    .line 317
    .line 318
    const v22, -0x40b33333    # -0.8f

    .line 319
    .line 320
    .line 321
    const/high16 v23, 0x40400000    # 3.0f

    .line 322
    .line 323
    const v24, -0x3fc851ec    # -2.87f

    .line 324
    .line 325
    .line 326
    move-object/from16 v20, v2

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x3fc0a3d7    # -2.99f

    .line 332
    .line 333
    .line 334
    const/16 v21, 0x0

    .line 335
    .line 336
    const v22, -0x404147ae    # -1.49f

    .line 337
    .line 338
    .line 339
    const v23, -0x40ab851f    # -0.83f

    .line 340
    .line 341
    .line 342
    const v24, -0x3f9c28f6    # -3.56f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x40c00000    # 6.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x41300000    # 11.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x40800000    # 4.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x3f000000    # 0.5f

    .line 364
    .line 365
    const/high16 v26, -0x41000000    # -0.5f

    .line 366
    .line 367
    const v22, -0x4170a3d7    # -0.28f

    .line 368
    .line 369
    .line 370
    const v23, 0x3e6147ae    # 0.22f

    .line 371
    .line 372
    .line 373
    const/high16 v24, -0x41000000    # -0.5f

    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v4, 0x406e147b    # 3.72f

    .line 379
    .line 380
    .line 381
    const/high16 v6, 0x41400000    # 12.0f

    .line 382
    .line 383
    const/high16 v7, 0x40800000    # 4.0f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x40000000    # 2.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v4, 0x40c00000    # 6.0f

    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x40c851ec    # 6.26f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/high16 v6, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x40c00000    # 6.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v25, -0x40000000    # -2.0f

    .line 417
    .line 418
    const/high16 v26, -0x40000000    # -2.0f

    .line 419
    .line 420
    const v22, -0x40733333    # -1.1f

    .line 421
    .line 422
    .line 423
    const v23, -0x4099999a    # -0.9f

    .line 424
    .line 425
    .line 426
    const/high16 v24, -0x40000000    # -2.0f

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, -0x3f800000    # -4.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 437
    .line 438
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 439
    .line 440
    const v22, -0x404f5c29    # -1.38f

    .line 441
    .line 442
    .line 443
    const v23, -0x4070a3d7    # -1.12f

    .line 444
    .line 445
    .line 446
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x4027ae14    # 2.62f

    .line 452
    .line 453
    .line 454
    const/high16 v6, 0x41100000    # 9.0f

    .line 455
    .line 456
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x40a051ec    # 5.01f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, -0x40000000    # -2.0f

    .line 466
    .line 467
    const/high16 v26, 0x40000000    # 2.0f

    .line 468
    .line 469
    const v21, -0x40733333    # -1.1f

    .line 470
    .line 471
    .line 472
    const/16 v22, 0x0

    .line 473
    .line 474
    const/high16 v23, -0x40000000    # -2.0f

    .line 475
    .line 476
    const v24, 0x3f666666    # 0.9f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v4, 0x40733333    # 3.8f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v25, 0x40c00000    # 6.0f

    .line 489
    .line 490
    const/high16 v26, 0x41480000    # 12.5f

    .line 491
    .line 492
    const v21, 0x40b66666    # 5.7f

    .line 493
    .line 494
    .line 495
    const v22, 0x411ccccd    # 9.8f

    .line 496
    .line 497
    .line 498
    const/high16 v23, 0x40c00000    # 6.0f

    .line 499
    .line 500
    const v24, 0x413f5c29    # 11.96f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 507
    .line 508
    const v26, 0x402ccccd    # 2.7f

    .line 509
    .line 510
    .line 511
    const/16 v21, 0x0

    .line 512
    .line 513
    const v22, 0x3f0a3d71    # 0.54f

    .line 514
    .line 515
    .line 516
    const v23, -0x416b851f    # -0.29f

    .line 517
    .line 518
    .line 519
    const v24, 0x402ccccd    # 2.7f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v4, 0x41980000    # 19.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v25, 0x40000000    # 2.0f

    .line 531
    .line 532
    const/high16 v26, 0x40000000    # 2.0f

    .line 533
    .line 534
    const v22, 0x3f8ccccd    # 1.1f

    .line 535
    .line 536
    .line 537
    const v23, 0x3f666666    # 0.9f

    .line 538
    .line 539
    .line 540
    const/high16 v24, 0x40000000    # 2.0f

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x40733333    # 3.8f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, 0x400ccccd    # 2.2f

    .line 552
    .line 553
    .line 554
    const v26, -0x3fc3d70a    # -2.94f

    .line 555
    .line 556
    .line 557
    const v22, -0x3ff5c28f    # -2.16f

    .line 558
    .line 559
    .line 560
    const v23, 0x3faf5c29    # 1.37f

    .line 561
    .line 562
    .line 563
    const v24, -0x3fce147b    # -2.78f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v4, -0x3ffe147b    # -2.03f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v25, 0x40e428f6    # 7.13f

    .line 576
    .line 577
    .line 578
    const/high16 v26, 0x41980000    # 19.0f

    .line 579
    .line 580
    const v21, 0x41191eb8    # 9.57f

    .line 581
    .line 582
    .line 583
    const v22, 0x4181999a    # 16.2f

    .line 584
    .line 585
    .line 586
    const v23, 0x40fb3333    # 7.85f

    .line 587
    .line 588
    .line 589
    const v24, 0x41888f5c    # 17.07f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/high16 v6, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/high16 v8, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 617
    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 619
    .line 620
    .line 621
    move-result-wide v6

    .line 622
    const/4 v0, 0x0

    .line 623
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 631
    .line 632
    .line 633
    move-result v11

    .line 634
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    const/high16 v2, 0x41500000    # 13.0f

    .line 640
    .line 641
    const/high16 v4, 0x41400000    # 12.0f

    .line 642
    .line 643
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/4 v2, 0x0

    .line 647
    const/high16 v4, 0x40800000    # 4.0f

    .line 648
    .line 649
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x3f800000    # 1.0f

    .line 653
    .line 654
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v2, -0x3f800000    # -4.0f

    .line 658
    .line 659
    const/high16 v4, 0x3f800000    # 1.0f

    .line 660
    .line 661
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/4 v2, 0x0

    .line 665
    const/high16 v4, 0x40800000    # 4.0f

    .line 666
    .line 667
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v2, 0x41200000    # 10.0f

    .line 671
    .line 672
    const/high16 v4, -0x3f600000    # -5.0f

    .line 673
    .line 674
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sput-object v0, Landroidx/compose/material/icons/twotone/SendTimeExtensionKt;->_sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    return-object v0
.end method
