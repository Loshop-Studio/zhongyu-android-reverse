.class public final Landroidx/compose/material/icons/twotone/SportsSoccerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsSoccer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsSoccer(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsSoccerKt;->_sportsSoccer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsSoccer"

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
    const v4, 0x4117d70a    # 9.49f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e051ec    # 7.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40d66666    # 6.7f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41300000    # 11.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x40a9999a    # 5.3f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x408b3333    # 4.35f

    .line 94
    .line 95
    .line 96
    const v6, 0x411a6666    # 9.65f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x40a8a3d7    # 5.27f

    .line 103
    .line 104
    .line 105
    const v26, 0x40f6147b    # 7.69f

    .line 106
    .line 107
    .line 108
    const v21, 0x40fa8f5c    # 7.83f

    .line 109
    .line 110
    .line 111
    const v22, 0x409d70a4    # 4.92f

    .line 112
    .line 113
    .line 114
    const v23, 0x40c8f5c3    # 6.28f

    .line 115
    .line 116
    .line 117
    const v24, 0x40c3d70a    # 6.12f

    .line 118
    .line 119
    .line 120
    move-object/from16 v20, v2

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x3fab851f    # 1.34f

    .line 126
    .line 127
    .line 128
    const v6, 0x3ec7ae14    # 0.39f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x4117d70a    # 9.49f

    .line 135
    .line 136
    .line 137
    const v6, 0x40e051ec    # 7.01f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/16 v16, 0x3800

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const v6, 0x3e99999a    # 0.3f

    .line 155
    .line 156
    .line 157
    const v8, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    const/high16 v9, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v12, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const-string v4, ""

    .line 169
    .line 170
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    const/4 v2, 0x0

    .line 184
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const v4, 0x412eb852    # 10.92f

    .line 201
    .line 202
    .line 203
    const v6, 0x40a051ec    # 5.01f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x3f3ae148    # 0.73f

    .line 210
    .line 211
    .line 212
    const/high16 v6, -0x40800000    # -1.0f

    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x40800000    # 4.0f

    .line 218
    .line 219
    const/high16 v26, 0x41400000    # 12.0f

    .line 220
    .line 221
    const v21, 0x408051ec    # 4.01f

    .line 222
    .line 223
    .line 224
    const v22, 0x413c51ec    # 11.77f

    .line 225
    .line 226
    .line 227
    const/high16 v23, 0x40800000    # 4.0f

    .line 228
    .line 229
    const v24, 0x413e147b    # 11.88f

    .line 230
    .line 231
    .line 232
    move-object/from16 v20, v2

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, 0x3ff851ec    # 1.94f

    .line 238
    .line 239
    .line 240
    const v26, 0x40a6b852    # 5.21f

    .line 241
    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const v22, 0x3ffeb852    # 1.99f

    .line 246
    .line 247
    .line 248
    const v23, 0x3f3ae148    # 0.73f

    .line 249
    .line 250
    .line 251
    const v24, 0x4073d70a    # 3.81f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, -0x42333333    # -0.1f

    .line 258
    .line 259
    .line 260
    const v6, 0x3f91eb85    # 1.14f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, 0x3f4a3d71    # 0.79f

    .line 267
    .line 268
    .line 269
    const v6, -0x4050a3d7    # -1.37f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, 0x40cccccd    # 6.4f

    .line 276
    .line 277
    .line 278
    const v6, 0x41366666    # 11.4f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x412eb852    # 10.92f

    .line 285
    .line 286
    .line 287
    const v6, 0x40a051ec    # 5.01f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const v6, 0x3e99999a    # 0.3f

    .line 301
    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    const-string v4, ""

    .line 305
    .line 306
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 307
    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 316
    .line 317
    .line 318
    move-result-wide v6

    .line 319
    const/4 v2, 0x0

    .line 320
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const v4, 0x4192b852    # 18.34f

    .line 337
    .line 338
    .line 339
    const v6, 0x41107ae1    # 9.03f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, -0x40547ae1    # -1.34f

    .line 346
    .line 347
    .line 348
    const v6, 0x3ec7ae14    # 0.39f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, -0x3f73d70a    # -4.38f

    .line 355
    .line 356
    .line 357
    const v26, -0x3faa3d71    # -3.34f

    .line 358
    .line 359
    .line 360
    const v21, -0x407eb852    # -1.01f

    .line 361
    .line 362
    .line 363
    const v22, -0x40370a3d    # -1.57f

    .line 364
    .line 365
    .line 366
    const v23, -0x3fdccccd    # -2.55f

    .line 367
    .line 368
    .line 369
    const v24, -0x3fceb852    # -2.77f

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 378
    .line 379
    const v6, 0x40a9999a    # 5.3f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v4, 0x3fb33333    # 1.4f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v4, 0x407f5c29    # 3.99f

    .line 392
    .line 393
    .line 394
    const v6, 0x40328f5c    # 2.79f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, 0x4192b852    # 18.34f

    .line 401
    .line 402
    .line 403
    const v6, 0x41107ae1    # 9.03f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const v6, 0x3e99999a    # 0.3f

    .line 417
    .line 418
    .line 419
    const/4 v7, 0x0

    .line 420
    const-string v4, ""

    .line 421
    .line 422
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 423
    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 430
    .line 431
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 432
    .line 433
    .line 434
    move-result-wide v6

    .line 435
    const/4 v2, 0x0

    .line 436
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 450
    .line 451
    .line 452
    const v4, 0x4105eb85    # 8.37f

    .line 453
    .line 454
    .line 455
    const v6, 0x412fae14    # 10.98f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v4, 0x3fae147b    # 1.36f

    .line 462
    .line 463
    .line 464
    const v6, 0x4080a3d7    # 4.02f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, 0x409147ae    # 4.54f

    .line 471
    .line 472
    .line 473
    const/4 v6, 0x0

    .line 474
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x3fae147b    # 1.36f

    .line 478
    .line 479
    .line 480
    const v6, -0x3f7f5c29    # -4.02f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, -0x3f97ae14    # -3.63f

    .line 487
    .line 488
    .line 489
    const v6, -0x3fdd70a4    # -2.54f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const v6, 0x3e99999a    # 0.3f

    .line 503
    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    const/4 v2, 0x0

    .line 522
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41880000    # 17.0f

    .line 539
    .line 540
    const v6, 0x41173333    # 9.45f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v4, -0x40dc28f6    # -0.64f

    .line 547
    .line 548
    .line 549
    const v6, 0x3f8e147b    # 1.11f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x3f30a3d7    # 0.69f

    .line 556
    .line 557
    .line 558
    const v6, 0x3fbeb852    # 1.49f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v25, 0x41400000    # 12.0f

    .line 565
    .line 566
    const/high16 v26, 0x41a00000    # 20.0f

    .line 567
    .line 568
    const v21, 0x4124a3d7    # 10.29f

    .line 569
    .line 570
    .line 571
    const v22, 0x419ecccd    # 19.85f

    .line 572
    .line 573
    .line 574
    const v23, 0x4132147b    # 11.13f

    .line 575
    .line 576
    .line 577
    const/high16 v24, 0x41a00000    # 20.0f

    .line 578
    .line 579
    move-object/from16 v20, v2

    .line 580
    .line 581
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v4, 0x40200000    # 2.5f

    .line 585
    .line 586
    const v6, -0x412e147b    # -0.41f

    .line 587
    .line 588
    .line 589
    const v7, 0x3fdae148    # 1.71f

    .line 590
    .line 591
    .line 592
    const v8, -0x41e66666    # -0.15f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v4, 0x3f30a3d7    # 0.69f

    .line 599
    .line 600
    .line 601
    const v6, -0x404147ae    # -1.49f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v4, 0x4168cccd    # 14.55f

    .line 608
    .line 609
    .line 610
    const/high16 v6, 0x41880000    # 17.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v4, 0x41173333    # 9.45f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const v6, 0x3e99999a    # 0.3f

    .line 629
    .line 630
    .line 631
    const v8, 0x3e99999a    # 0.3f

    .line 632
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
    const/4 v2, 0x0

    .line 651
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    const v4, 0x419fd70a    # 19.98f

    .line 668
    .line 669
    .line 670
    const v6, 0x413a6666    # 11.65f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v4, -0x40c51eb8    # -0.73f

    .line 677
    .line 678
    .line 679
    const/high16 v6, -0x40800000    # -1.0f

    .line 680
    .line 681
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v4, 0x418ccccd    # 17.6f

    .line 685
    .line 686
    .line 687
    const v6, 0x41366666    # 11.4f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v4, -0x40451eb8    # -1.46f

    .line 694
    .line 695
    .line 696
    const v6, 0x408ae148    # 4.34f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v4, 0x3f4a3d71    # 0.79f

    .line 703
    .line 704
    .line 705
    const v6, 0x3faf5c29    # 1.37f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v4, 0x3dcccccd    # 0.1f

    .line 712
    .line 713
    .line 714
    const v6, 0x3f91eb85    # 1.14f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v25, 0x41a00000    # 20.0f

    .line 721
    .line 722
    const/high16 v26, 0x41400000    # 12.0f

    .line 723
    .line 724
    const v21, 0x419a28f6    # 19.27f

    .line 725
    .line 726
    .line 727
    const v22, 0x417cf5c3    # 15.81f

    .line 728
    .line 729
    .line 730
    const/high16 v23, 0x41a00000    # 20.0f

    .line 731
    .line 732
    const v24, 0x415fd70a    # 13.99f

    .line 733
    .line 734
    .line 735
    move-object/from16 v20, v2

    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v25, 0x419fd70a    # 19.98f

    .line 741
    .line 742
    .line 743
    const v26, 0x413a6666    # 11.65f

    .line 744
    .line 745
    .line 746
    const/high16 v21, 0x41a00000    # 20.0f

    .line 747
    .line 748
    const v22, 0x413e147b    # 11.88f

    .line 749
    .line 750
    .line 751
    const v23, 0x419feb85    # 19.99f

    .line 752
    .line 753
    .line 754
    const v24, 0x413c51ec    # 11.77f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    const v6, 0x3e99999a    # 0.3f

    .line 768
    .line 769
    .line 770
    const/4 v7, 0x0

    .line 771
    const-string v4, ""

    .line 772
    .line 773
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 774
    .line 775
    .line 776
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 781
    .line 782
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 783
    .line 784
    .line 785
    move-result-wide v6

    .line 786
    const/4 v0, 0x0

    .line 787
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 791
    .line 792
    .line 793
    move-result v10

    .line 794
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 795
    .line 796
    .line 797
    move-result v11

    .line 798
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 801
    .line 802
    .line 803
    const/high16 v0, 0x41400000    # 12.0f

    .line 804
    .line 805
    const/high16 v2, 0x40000000    # 2.0f

    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v17, 0x40000000    # 2.0f

    .line 811
    .line 812
    const/high16 v18, 0x41400000    # 12.0f

    .line 813
    .line 814
    const v13, 0x40cf5c29    # 6.48f

    .line 815
    .line 816
    .line 817
    const/high16 v14, 0x40000000    # 2.0f

    .line 818
    .line 819
    const/high16 v15, 0x40000000    # 2.0f

    .line 820
    .line 821
    const v16, 0x40cf5c29    # 6.48f

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v17, 0x41200000    # 10.0f

    .line 828
    .line 829
    const/high16 v18, 0x41200000    # 10.0f

    .line 830
    .line 831
    const/4 v13, 0x0

    .line 832
    const v14, 0x40b0a3d7    # 5.52f

    .line 833
    .line 834
    .line 835
    const v15, 0x408f5c29    # 4.48f

    .line 836
    .line 837
    .line 838
    const/high16 v16, 0x41200000    # 10.0f

    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v0, 0x41200000    # 10.0f

    .line 844
    .line 845
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 846
    .line 847
    const/high16 v4, 0x41200000    # 10.0f

    .line 848
    .line 849
    const v6, -0x3f70a3d7    # -4.48f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v17, 0x41400000    # 12.0f

    .line 856
    .line 857
    const/high16 v18, 0x40000000    # 2.0f

    .line 858
    .line 859
    const/high16 v13, 0x41b00000    # 22.0f

    .line 860
    .line 861
    const v14, 0x40cf5c29    # 6.48f

    .line 862
    .line 863
    .line 864
    const v15, 0x418c28f6    # 17.52f

    .line 865
    .line 866
    .line 867
    const/high16 v16, 0x40000000    # 2.0f

    .line 868
    .line 869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/high16 v0, 0x41500000    # 13.0f

    .line 876
    .line 877
    const v2, 0x40a9999a    # 5.3f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, 0x3faccccd    # 1.35f

    .line 884
    .line 885
    .line 886
    const v2, -0x408ccccd    # -0.95f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v17, 0x408c28f6    # 4.38f

    .line 893
    .line 894
    .line 895
    const v18, 0x4055c28f    # 3.34f

    .line 896
    .line 897
    .line 898
    const v13, 0x3fe8f5c3    # 1.82f

    .line 899
    .line 900
    .line 901
    const v14, 0x3f0f5c29    # 0.56f

    .line 902
    .line 903
    .line 904
    const v15, 0x4057ae14    # 3.37f

    .line 905
    .line 906
    .line 907
    const v16, 0x3fe147ae    # 1.76f

    .line 908
    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, -0x413851ec    # -0.39f

    .line 914
    .line 915
    .line 916
    const v2, 0x3fab851f    # 1.34f

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, -0x40533333    # -1.35f

    .line 923
    .line 924
    .line 925
    const v2, 0x3eeb851f    # 0.46f

    .line 926
    .line 927
    .line 928
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v0, 0x40d66666    # 6.7f

    .line 932
    .line 933
    .line 934
    const/high16 v2, 0x41500000    # 13.0f

    .line 935
    .line 936
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v0, 0x40a9999a    # 5.3f

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const v0, 0x408b3333    # 4.35f

    .line 949
    .line 950
    .line 951
    const v2, 0x411a6666    # 9.65f

    .line 952
    .line 953
    .line 954
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v0, 0x41300000    # 11.0f

    .line 958
    .line 959
    const v2, 0x40a9999a    # 5.3f

    .line 960
    .line 961
    .line 962
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v0, 0x3fb33333    # 1.4f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v0, 0x4117d70a    # 9.49f

    .line 972
    .line 973
    .line 974
    const v2, 0x40e051ec    # 7.01f

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const v0, 0x40b51eb8    # 5.66f

    .line 981
    .line 982
    .line 983
    const v2, 0x41107ae1    # 9.03f

    .line 984
    .line 985
    .line 986
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v0, 0x40a8a3d7    # 5.27f

    .line 990
    .line 991
    .line 992
    const v2, 0x40f6147b    # 7.69f

    .line 993
    .line 994
    .line 995
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v17, 0x411a6666    # 9.65f

    .line 999
    .line 1000
    .line 1001
    const v18, 0x408b3333    # 4.35f

    .line 1002
    .line 1003
    .line 1004
    const v13, 0x40c8f5c3    # 6.28f

    .line 1005
    .line 1006
    .line 1007
    const v14, 0x40c3d70a    # 6.12f

    .line 1008
    .line 1009
    .line 1010
    const v15, 0x40fa8f5c    # 7.83f

    .line 1011
    .line 1012
    .line 1013
    const v16, 0x409d70a4    # 4.92f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x40e28f5c    # 7.08f

    .line 1023
    .line 1024
    .line 1025
    const v2, 0x4188e148    # 17.11f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, -0x406e147b    # -1.14f

    .line 1032
    .line 1033
    .line 1034
    const v2, 0x3dcccccd    # 0.1f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const/high16 v17, 0x40800000    # 4.0f

    .line 1041
    .line 1042
    const/high16 v18, 0x41400000    # 12.0f

    .line 1043
    .line 1044
    const v13, 0x40975c29    # 4.73f

    .line 1045
    .line 1046
    .line 1047
    const v14, 0x417cf5c3    # 15.81f

    .line 1048
    .line 1049
    .line 1050
    const/high16 v15, 0x40800000    # 4.0f

    .line 1051
    .line 1052
    const v16, 0x415fd70a    # 13.99f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v17, 0x3ca3d70a    # 0.02f

    .line 1059
    .line 1060
    .line 1061
    const v18, -0x414ccccd    # -0.35f

    .line 1062
    .line 1063
    .line 1064
    const/4 v13, 0x0

    .line 1065
    const v14, -0x420a3d71    # -0.12f

    .line 1066
    .line 1067
    .line 1068
    const v15, 0x3c23d70a    # 0.01f

    .line 1069
    .line 1070
    .line 1071
    const v16, -0x41947ae1    # -0.23f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1078
    .line 1079
    const v2, -0x40c51eb8    # -0.73f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v0, 0x40cccccd    # 6.4f

    .line 1086
    .line 1087
    .line 1088
    const v2, 0x41366666    # 11.4f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const v0, 0x3fbae148    # 1.46f

    .line 1095
    .line 1096
    .line 1097
    const v2, 0x408ae148    # 4.34f

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const v0, 0x40e28f5c    # 7.08f

    .line 1104
    .line 1105
    .line 1106
    const v2, 0x4188e148    # 17.11f

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const/high16 v0, 0x41680000    # 14.5f

    .line 1116
    .line 1117
    const v2, 0x419cb852    # 19.59f

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/high16 v17, 0x41400000    # 12.0f

    .line 1124
    .line 1125
    const/high16 v18, 0x41a00000    # 20.0f

    .line 1126
    .line 1127
    const v13, 0x415b5c29    # 13.71f

    .line 1128
    .line 1129
    .line 1130
    const v14, 0x419ecccd    # 19.85f

    .line 1131
    .line 1132
    .line 1133
    const v15, 0x414deb85    # 12.87f

    .line 1134
    .line 1135
    .line 1136
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1137
    .line 1138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1142
    .line 1143
    const v2, -0x412e147b    # -0.41f

    .line 1144
    .line 1145
    .line 1146
    const v4, -0x40251eb8    # -1.71f

    .line 1147
    .line 1148
    .line 1149
    const v6, -0x41e66666    # -0.15f

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const v0, -0x40cf5c29    # -0.69f

    .line 1156
    .line 1157
    .line 1158
    const v2, -0x404147ae    # -1.49f

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const/high16 v0, 0x41880000    # 17.0f

    .line 1165
    .line 1166
    const v2, 0x41173333    # 9.45f

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1170
    .line 1171
    .line 1172
    const v0, 0x40a3851f    # 5.11f

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v0, 0x3f23d70a    # 0.64f

    .line 1179
    .line 1180
    .line 1181
    const v2, 0x3f8e147b    # 1.11f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const/high16 v0, 0x41680000    # 14.5f

    .line 1188
    .line 1189
    const v2, 0x419cb852    # 19.59f

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1196
    .line 1197
    .line 1198
    const v0, 0x416451ec    # 14.27f

    .line 1199
    .line 1200
    .line 1201
    const/high16 v2, 0x41700000    # 15.0f

    .line 1202
    .line 1203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v0, 0x411bae14    # 9.73f

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1210
    .line 1211
    .line 1212
    const v0, -0x40533333    # -1.35f

    .line 1213
    .line 1214
    .line 1215
    const v2, -0x3f7f5c29    # -4.02f

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1219
    .line 1220
    .line 1221
    const/high16 v0, 0x41400000    # 12.0f

    .line 1222
    .line 1223
    const v2, 0x41070a3d    # 8.44f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v0, 0x406851ec    # 3.63f

    .line 1230
    .line 1231
    .line 1232
    const v2, 0x40228f5c    # 2.54f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    const v0, 0x416451ec    # 14.27f

    .line 1239
    .line 1240
    .line 1241
    const/high16 v2, 0x41700000    # 15.0f

    .line 1242
    .line 1243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const v0, 0x41907ae1    # 18.06f

    .line 1250
    .line 1251
    .line 1252
    const v2, 0x4189ae14    # 17.21f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const v0, -0x406e147b    # -1.14f

    .line 1259
    .line 1260
    .line 1261
    const v2, -0x42333333    # -0.1f

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const v0, -0x40b5c28f    # -0.79f

    .line 1268
    .line 1269
    .line 1270
    const v2, -0x4050a3d7    # -1.37f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const v0, 0x3fbae148    # 1.46f

    .line 1277
    .line 1278
    .line 1279
    const v2, -0x3f751eb8    # -4.34f

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const v0, 0x3fb1eb85    # 1.39f

    .line 1286
    .line 1287
    .line 1288
    const v2, -0x410f5c29    # -0.47f

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1295
    .line 1296
    const v2, 0x3f3ae148    # 0.73f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    const/high16 v17, 0x41a00000    # 20.0f

    .line 1303
    .line 1304
    const/high16 v18, 0x41400000    # 12.0f

    .line 1305
    .line 1306
    const v13, 0x419feb85    # 19.99f

    .line 1307
    .line 1308
    .line 1309
    const v14, 0x413c51ec    # 11.77f

    .line 1310
    .line 1311
    .line 1312
    const/high16 v15, 0x41a00000    # 20.0f

    .line 1313
    .line 1314
    const v16, 0x413e147b    # 11.88f

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    const v17, 0x41907ae1    # 18.06f

    .line 1321
    .line 1322
    .line 1323
    const v18, 0x4189ae14    # 17.21f

    .line 1324
    .line 1325
    .line 1326
    const/high16 v13, 0x41a00000    # 20.0f

    .line 1327
    .line 1328
    const v14, 0x415fd70a    # 13.99f

    .line 1329
    .line 1330
    .line 1331
    const v15, 0x419a28f6    # 19.27f

    .line 1332
    .line 1333
    .line 1334
    const v16, 0x417cf5c3    # 15.81f

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    const/16 v16, 0x3800

    .line 1348
    .line 1349
    const/16 v17, 0x0

    .line 1350
    .line 1351
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1352
    .line 1353
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1354
    .line 1355
    const/4 v7, 0x0

    .line 1356
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1357
    .line 1358
    const/4 v13, 0x0

    .line 1359
    const/4 v14, 0x0

    .line 1360
    const/4 v15, 0x0

    .line 1361
    const-string v4, ""

    .line 1362
    .line 1363
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsSoccerKt;->_sportsSoccer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1372
    .line 1373
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1374
    .line 1375
    .line 1376
    return-object v0
.end method
