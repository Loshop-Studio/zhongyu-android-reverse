.class public final Landroidx/compose/material/icons/outlined/BrunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrunchDining(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BrunchDiningKt;->_brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BrunchDining"

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
    const/high16 v4, 0x41ac0000    # 21.5f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x401f5c29    # 2.49f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x41b00000    # 22.0f

    .line 81
    .line 82
    const/high16 v21, 0x40000000    # 2.0f

    .line 83
    .line 84
    const v22, 0x41ae3d71    # 21.78f

    .line 85
    .line 86
    .line 87
    const v23, 0x400e147b    # 2.22f

    .line 88
    .line 89
    .line 90
    const/high16 v24, 0x41b00000    # 22.0f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x415051ec    # 13.02f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v25, 0x3efae148    # 0.49f

    .line 104
    .line 105
    .line 106
    const/high16 v26, -0x41000000    # -0.5f

    .line 107
    .line 108
    const v21, 0x3e8a3d71    # 0.27f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, 0x3efae148    # 0.49f

    .line 114
    .line 115
    .line 116
    const v24, -0x419eb852    # -0.22f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x41a00000    # 20.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41ac0000    # 21.5f

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/16 v16, 0x3800

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/high16 v6, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const/high16 v8, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/4 v7, 0x0

    .line 153
    const/high16 v9, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/high16 v12, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x0

    .line 160
    const-string v4, ""

    .line 161
    .line 162
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 163
    .line 164
    .line 165
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41780000    # 15.5f

    .line 193
    .line 194
    const/high16 v6, 0x41800000    # 16.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x41300000    # 11.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, -0x40000000    # -2.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x40e00000    # 7.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40000000    # 2.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x40200000    # 2.5f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, 0x40000000    # 2.0f

    .line 225
    .line 226
    const/high16 v26, 0x41840000    # 16.5f

    .line 227
    .line 228
    const v21, 0x400e147b    # 2.22f

    .line 229
    .line 230
    .line 231
    const/high16 v22, 0x41800000    # 16.0f

    .line 232
    .line 233
    const/high16 v23, 0x40000000    # 2.0f

    .line 234
    .line 235
    const v24, 0x4181c28f    # 16.22f

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x41900000    # 18.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x41600000    # 14.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v4, -0x40400000    # -1.5f

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41780000    # 15.5f

    .line 259
    .line 260
    const/high16 v26, 0x41800000    # 16.0f

    .line 261
    .line 262
    const/high16 v21, 0x41800000    # 16.0f

    .line 263
    .line 264
    const v22, 0x4181c28f    # 16.22f

    .line 265
    .line 266
    .line 267
    const v23, 0x417c7ae1    # 15.78f

    .line 268
    .line 269
    .line 270
    const/high16 v24, 0x41800000    # 16.0f

    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/high16 v6, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const-string v4, ""

    .line 286
    .line 287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 288
    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 295
    .line 296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 297
    .line 298
    .line 299
    move-result-wide v6

    .line 300
    const/4 v0, 0x0

    .line 301
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const v0, 0x41773333    # 15.45f

    .line 318
    .line 319
    .line 320
    const v2, 0x41a3c28f    # 20.47f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x3fc3d70a    # 1.53f

    .line 327
    .line 328
    .line 329
    const v18, -0x3f83d70a    # -3.94f

    .line 330
    .line 331
    .line 332
    const v13, 0x3f7d70a4    # 0.99f

    .line 333
    .line 334
    .line 335
    const v14, -0x40770a3d    # -1.07f

    .line 336
    .line 337
    .line 338
    const v15, 0x3fc3d70a    # 1.53f

    .line 339
    .line 340
    .line 341
    const v16, -0x3fe147ae    # -2.48f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, -0x3f400000    # -6.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x4117851f    # 9.47f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x3fcccccd    # 1.6f

    .line 364
    .line 365
    .line 366
    const/high16 v18, 0x40800000    # 4.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, 0x3fbd70a4    # 1.48f

    .line 370
    .line 371
    .line 372
    const v15, 0x3f147ae1    # 0.58f

    .line 373
    .line 374
    .line 375
    const v16, 0x403ae148    # 2.92f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x3ecccccd    # 0.4f

    .line 382
    .line 383
    .line 384
    const v2, 0x3ed70a3d    # 0.42f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41b00000    # 22.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40800000    # 4.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x3f7f0a3d    # -4.03f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x41773333    # 15.45f

    .line 415
    .line 416
    .line 417
    const v2, 0x41a3c28f    # 20.47f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x41900000    # 18.0f

    .line 427
    .line 428
    const/high16 v2, 0x40800000    # 4.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40000000    # 2.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40800000    # 4.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, -0x40000000    # -2.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40800000    # 4.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x41983d71    # 19.03f

    .line 457
    .line 458
    .line 459
    const v2, 0x41611eb8    # 14.07f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, -0x407c28f6    # -1.03f

    .line 466
    .line 467
    .line 468
    const v18, -0x3fd9999a    # -2.6f

    .line 469
    .line 470
    .line 471
    const v13, -0x40d9999a    # -0.65f

    .line 472
    .line 473
    .line 474
    const v14, -0x40ca3d71    # -0.71f

    .line 475
    .line 476
    .line 477
    const v15, -0x407c28f6    # -1.03f

    .line 478
    .line 479
    .line 480
    const v16, -0x402ccccd    # -1.65f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41200000    # 10.0f

    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x40000000    # 2.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x3fc147ae    # 1.51f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x41983d71    # 19.03f

    .line 503
    .line 504
    .line 505
    const v18, 0x41611eb8    # 14.07f

    .line 506
    .line 507
    .line 508
    const/high16 v13, 0x41a00000    # 20.0f

    .line 509
    .line 510
    const v14, 0x41475c29    # 12.46f

    .line 511
    .line 512
    .line 513
    const v15, 0x419d47ae    # 19.66f

    .line 514
    .line 515
    .line 516
    const v16, 0x4155c28f    # 13.36f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/16 v16, 0x3800

    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const/high16 v6, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/high16 v12, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const/4 v14, 0x0

    .line 540
    const/4 v15, 0x0

    .line 541
    const-string v4, ""

    .line 542
    .line 543
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, Landroidx/compose/material/icons/outlined/BrunchDiningKt;->_brunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 552
    .line 553
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-object v0
.end method
