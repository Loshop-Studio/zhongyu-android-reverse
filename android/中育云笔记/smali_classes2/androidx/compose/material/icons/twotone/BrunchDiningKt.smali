.class public final Landroidx/compose/material/icons/twotone/BrunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrunchDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BrunchDiningKt;->_brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BrunchDining"

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
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, 0x3fbc28f6    # 1.47f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x3f83d70a    # 1.03f

    .line 89
    .line 90
    .line 91
    const v26, 0x40266666    # 2.6f

    .line 92
    .line 93
    .line 94
    const/16 v21, 0x0

    .line 95
    .line 96
    const v22, 0x3f733333    # 0.95f

    .line 97
    .line 98
    .line 99
    const v23, 0x3ebd70a4    # 0.37f

    .line 100
    .line 101
    .line 102
    const v24, 0x3ff1eb85    # 1.89f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v25, 0x3f7851ec    # 0.97f

    .line 111
    .line 112
    .line 113
    const v26, -0x3fdc28f6    # -2.56f

    .line 114
    .line 115
    .line 116
    const v21, 0x3f2147ae    # 0.63f

    .line 117
    .line 118
    .line 119
    const v22, -0x40ca3d71    # -0.71f

    .line 120
    .line 121
    .line 122
    const v23, 0x3f7851ec    # 0.97f

    .line 123
    .line 124
    .line 125
    const v24, -0x4031eb85    # -1.61f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41200000    # 10.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/16 v16, 0x3800

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const v6, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    const v8, 0x3e99999a    # 0.3f

    .line 151
    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    const/high16 v9, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/high16 v12, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    const-string v4, ""

    .line 162
    .line 163
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 164
    .line 165
    .line 166
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 171
    .line 172
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    const/4 v2, 0x0

    .line 177
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x41ac0000    # 21.5f

    .line 194
    .line 195
    const/high16 v6, 0x40000000    # 2.0f

    .line 196
    .line 197
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v25, 0x401f5c29    # 2.49f

    .line 201
    .line 202
    .line 203
    const/high16 v26, 0x41b00000    # 22.0f

    .line 204
    .line 205
    const/high16 v21, 0x40000000    # 2.0f

    .line 206
    .line 207
    const v22, 0x41ae3d71    # 21.78f

    .line 208
    .line 209
    .line 210
    const v23, 0x400e147b    # 2.22f

    .line 211
    .line 212
    .line 213
    const/high16 v24, 0x41b00000    # 22.0f

    .line 214
    .line 215
    move-object/from16 v20, v2

    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x415051ec    # 13.02f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v25, 0x3efae148    # 0.49f

    .line 227
    .line 228
    .line 229
    const/high16 v26, -0x41000000    # -0.5f

    .line 230
    .line 231
    const v21, 0x3e8a3d71    # 0.27f

    .line 232
    .line 233
    .line 234
    const/16 v22, 0x0

    .line 235
    .line 236
    const v23, 0x3efae148    # 0.49f

    .line 237
    .line 238
    .line 239
    const v24, -0x419eb852    # -0.22f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41a00000    # 20.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x41ac0000    # 21.5f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const/high16 v6, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v8, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const-string v4, ""

    .line 273
    .line 274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 282
    .line 283
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    const/4 v2, 0x0

    .line 288
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const v4, 0x41773333    # 15.45f

    .line 305
    .line 306
    .line 307
    const v6, 0x41a3c28f    # 20.47f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v25, 0x3fc3d70a    # 1.53f

    .line 314
    .line 315
    .line 316
    const v26, -0x3f83d70a    # -3.94f

    .line 317
    .line 318
    .line 319
    const v21, 0x3f7d70a4    # 0.99f

    .line 320
    .line 321
    .line 322
    const v22, -0x40770a3d    # -1.07f

    .line 323
    .line 324
    .line 325
    const v23, 0x3fc3d70a    # 1.53f

    .line 326
    .line 327
    .line 328
    const v24, -0x3fe147ae    # -2.48f

    .line 329
    .line 330
    .line 331
    move-object/from16 v20, v2

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, 0x40000000    # 2.0f

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v4, -0x3f400000    # -6.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x4117851f    # 9.47f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v25, 0x3fcccccd    # 1.6f

    .line 353
    .line 354
    .line 355
    const/high16 v26, 0x40800000    # 4.0f

    .line 356
    .line 357
    const/16 v21, 0x0

    .line 358
    .line 359
    const v22, 0x3fbd70a4    # 1.48f

    .line 360
    .line 361
    .line 362
    const v23, 0x3f147ae1    # 0.58f

    .line 363
    .line 364
    .line 365
    const v24, 0x403ae148    # 2.92f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x3ecccccd    # 0.4f

    .line 372
    .line 373
    .line 374
    const v6, 0x3ed70a3d    # 0.42f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41b00000    # 22.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x40800000    # 4.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v4, -0x40000000    # -2.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, -0x3f7f0a3d    # -4.03f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, 0x41773333    # 15.45f

    .line 405
    .line 406
    .line 407
    const v6, 0x41a3c28f    # 20.47f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x41900000    # 18.0f

    .line 417
    .line 418
    const/high16 v6, 0x40800000    # 4.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x40000000    # 2.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x40800000    # 4.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, -0x40000000    # -2.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x40800000    # 4.0f

    .line 439
    .line 440
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v4, 0x41983d71    # 19.03f

    .line 447
    .line 448
    .line 449
    const v6, 0x41611eb8    # 14.07f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v25, -0x407c28f6    # -1.03f

    .line 456
    .line 457
    .line 458
    const v26, -0x3fd9999a    # -2.6f

    .line 459
    .line 460
    .line 461
    const v21, -0x40d9999a    # -0.65f

    .line 462
    .line 463
    .line 464
    const v22, -0x40ca3d71    # -0.71f

    .line 465
    .line 466
    .line 467
    const v23, -0x407c28f6    # -1.03f

    .line 468
    .line 469
    .line 470
    const v24, -0x402ccccd    # -1.65f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x41200000    # 10.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x40000000    # 2.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x3fc147ae    # 1.51f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v25, 0x41983d71    # 19.03f

    .line 493
    .line 494
    .line 495
    const v26, 0x41611eb8    # 14.07f

    .line 496
    .line 497
    .line 498
    const/high16 v21, 0x41a00000    # 20.0f

    .line 499
    .line 500
    const v22, 0x41475c29    # 12.46f

    .line 501
    .line 502
    .line 503
    const v23, 0x419d47ae    # 19.66f

    .line 504
    .line 505
    .line 506
    const v24, 0x4155c28f    # 13.36f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 532
    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 534
    .line 535
    .line 536
    move-result-wide v6

    .line 537
    const/4 v0, 0x0

    .line 538
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x41780000    # 15.5f

    .line 555
    .line 556
    const/high16 v2, 0x41800000    # 16.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41300000    # 11.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, -0x40000000    # -2.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x40e00000    # 7.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x40000000    # 2.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v0, 0x40200000    # 2.5f

    .line 582
    .line 583
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x40000000    # 2.0f

    .line 587
    .line 588
    const/high16 v18, 0x41840000    # 16.5f

    .line 589
    .line 590
    const v13, 0x400e147b    # 2.22f

    .line 591
    .line 592
    .line 593
    const/high16 v14, 0x41800000    # 16.0f

    .line 594
    .line 595
    const/high16 v15, 0x40000000    # 2.0f

    .line 596
    .line 597
    const v16, 0x4181c28f    # 16.22f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41900000    # 18.0f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41600000    # 14.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, -0x40400000    # -1.5f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x41780000    # 15.5f

    .line 619
    .line 620
    const/high16 v18, 0x41800000    # 16.0f

    .line 621
    .line 622
    const/high16 v13, 0x41800000    # 16.0f

    .line 623
    .line 624
    const v14, 0x4181c28f    # 16.22f

    .line 625
    .line 626
    .line 627
    const v15, 0x417c7ae1    # 15.78f

    .line 628
    .line 629
    .line 630
    const/high16 v16, 0x41800000    # 16.0f

    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    const/16 v16, 0x3800

    .line 643
    .line 644
    const/16 v17, 0x0

    .line 645
    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/4 v7, 0x0

    .line 649
    const/high16 v12, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v13, 0x0

    .line 652
    const/4 v14, 0x0

    .line 653
    const/4 v15, 0x0

    .line 654
    const-string v4, ""

    .line 655
    .line 656
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    sput-object v0, Landroidx/compose/material/icons/twotone/BrunchDiningKt;->_brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 665
    .line 666
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    return-object v0
.end method
