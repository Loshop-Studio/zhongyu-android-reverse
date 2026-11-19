.class public final Landroidx/compose/material/icons/filled/TempleBuddhistKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTempleBuddhist(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/TempleBuddhistKt;->_templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.TempleBuddhist"

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
    const v4, 0x411051ec    # 9.02f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41a80000    # 21.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x40028f5c    # -1.98f

    .line 79
    .line 80
    .line 81
    const v26, 0x3ffd70a4    # 1.98f

    .line 82
    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, 0x3f8b851f    # 1.09f

    .line 87
    .line 88
    .line 89
    const v23, -0x409c28f6    # -0.89f

    .line 90
    .line 91
    .line 92
    const v24, 0x3ffd70a4    # 1.98f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x409f5c29    # 4.98f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40400000    # 3.0f

    .line 107
    .line 108
    const v26, 0x411051ec    # 9.02f

    .line 109
    .line 110
    .line 111
    const v21, 0x4078f5c3    # 3.89f

    .line 112
    .line 113
    .line 114
    const/high16 v22, 0x41300000    # 11.0f

    .line 115
    .line 116
    const/high16 v23, 0x40400000    # 3.0f

    .line 117
    .line 118
    const v24, 0x4121c28f    # 10.11f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x3f800000    # 1.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v26, 0x4075c28f    # 3.84f

    .line 130
    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    const v22, 0x3fee147b    # 1.86f

    .line 135
    .line 136
    .line 137
    const v23, 0x3fa3d70a    # 1.28f

    .line 138
    .line 139
    .line 140
    const v24, 0x4059999a    # 3.4f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41b00000    # 22.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x40c00000    # 6.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x40000000    # 2.0f

    .line 162
    .line 163
    const/high16 v26, -0x40000000    # -2.0f

    .line 164
    .line 165
    const v22, -0x40733333    # -1.1f

    .line 166
    .line 167
    .line 168
    const v23, 0x3f666666    # 0.9f

    .line 169
    .line 170
    .line 171
    const/high16 v24, -0x40000000    # -2.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x3f666666    # 0.9f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x40000000    # 2.0f

    .line 180
    .line 181
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40400000    # 3.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x40c00000    # 6.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, -0x3eedc28f    # -9.14f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, 0x40400000    # 3.0f

    .line 201
    .line 202
    const v26, -0x3f88f5c3    # -3.86f

    .line 203
    .line 204
    .line 205
    const v21, 0x3f0ccccd    # 0.55f

    .line 206
    .line 207
    .line 208
    const v22, -0x41f0a3d7    # -0.14f

    .line 209
    .line 210
    .line 211
    const/high16 v23, 0x40400000    # 3.0f

    .line 212
    .line 213
    const v24, -0x407ae148    # -1.04f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x411051ec    # 9.02f

    .line 220
    .line 221
    .line 222
    const/high16 v6, 0x41a80000    # 21.0f

    .line 223
    .line 224
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    const/16 v16, 0x3800

    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const/high16 v6, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v8, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    const/high16 v9, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/high16 v12, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    const-string v4, ""

    .line 251
    .line 252
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    const/4 v2, 0x0

    .line 266
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    const v4, 0x410dc28f    # 8.86f

    .line 283
    .line 284
    .line 285
    const/high16 v6, 0x40c00000    # 6.0f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41200000    # 10.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41400000    # 12.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x410dc28f    # 8.86f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    move-object/from16 v20, v2

    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v4, -0x40000000    # -2.0f

    .line 312
    .line 313
    const v6, 0x3ca3d70a    # 0.02f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x418828f6    # 17.02f

    .line 320
    .line 321
    .line 322
    const/high16 v26, 0x40e00000    # 7.0f

    .line 323
    .line 324
    const/high16 v21, 0x41980000    # 19.0f

    .line 325
    .line 326
    const v22, 0x40c3851f    # 6.11f

    .line 327
    .line 328
    .line 329
    const v23, 0x4190e148    # 18.11f

    .line 330
    .line 331
    .line 332
    const/high16 v24, 0x40e00000    # 7.0f

    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x40df5c29    # 6.98f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v25, 0x40a00000    # 5.0f

    .line 344
    .line 345
    const v26, 0x40a0a3d7    # 5.02f

    .line 346
    .line 347
    .line 348
    const v21, 0x40bc7ae1    # 5.89f

    .line 349
    .line 350
    .line 351
    const/high16 v22, 0x40e00000    # 7.0f

    .line 352
    .line 353
    const/high16 v23, 0x40a00000    # 5.0f

    .line 354
    .line 355
    const v24, 0x40c3851f    # 6.11f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x40400000    # 3.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, 0x40c00000    # 6.0f

    .line 367
    .line 368
    const v26, 0x410dc28f    # 8.86f

    .line 369
    .line 370
    .line 371
    const/high16 v21, 0x40400000    # 3.0f

    .line 372
    .line 373
    const v22, 0x40dbd70a    # 6.87f

    .line 374
    .line 375
    .line 376
    const v23, 0x4088f5c3    # 4.28f

    .line 377
    .line 378
    .line 379
    const v24, 0x4106b852    # 8.42f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/high16 v6, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    const-string v4, ""

    .line 396
    .line 397
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 398
    .line 399
    .line 400
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 405
    .line 406
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 407
    .line 408
    .line 409
    move-result-wide v6

    .line 410
    const/4 v0, 0x0

    .line 411
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 419
    .line 420
    .line 421
    move-result v11

    .line 422
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 425
    .line 426
    .line 427
    const/high16 v2, 0x41400000    # 12.0f

    .line 428
    .line 429
    const/high16 v4, 0x3f800000    # 1.0f

    .line 430
    .line 431
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v2, -0x3f900000    # -3.75f

    .line 435
    .line 436
    const/high16 v4, 0x40a00000    # 5.0f

    .line 437
    .line 438
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x40f00000    # 7.5f

    .line 442
    .line 443
    const/4 v4, 0x0

    .line 444
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Landroidx/compose/material/icons/filled/TempleBuddhistKt;->_templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v0
.end method
