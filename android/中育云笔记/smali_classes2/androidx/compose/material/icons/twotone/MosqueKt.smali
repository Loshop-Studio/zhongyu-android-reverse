.class public final Landroidx/compose/material/icons/twotone/MosqueKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mosque:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMosque(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MosqueKt;->_mosque:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Mosque"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const v6, 0x411e8f5c    # 9.91f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x4085c28f    # 4.18f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41800000    # 16.0f

    .line 85
    .line 86
    const v26, 0x40e2e148    # 7.09f

    .line 87
    .line 88
    .line 89
    const v21, 0x41723d71    # 15.14f

    .line 90
    .line 91
    .line 92
    const/high16 v22, 0x41100000    # 9.0f

    .line 93
    .line 94
    const/high16 v23, 0x41800000    # 16.0f

    .line 95
    .line 96
    const v24, 0x41023d71    # 8.14f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, -0x40a66666    # -0.85f

    .line 105
    .line 106
    .line 107
    const v26, -0x40347ae1    # -1.59f

    .line 108
    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, -0x40dc28f6    # -0.64f

    .line 113
    .line 114
    .line 115
    const v23, -0x415c28f6    # -0.32f

    .line 116
    .line 117
    .line 118
    const v24, -0x40628f5c    # -1.23f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x4059999a    # 3.4f

    .line 125
    .line 126
    .line 127
    const/high16 v6, 0x41400000    # 12.0f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x40b00000    # 5.5f

    .line 133
    .line 134
    const v6, 0x410d999a    # 8.85f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41000000    # 8.0f

    .line 141
    .line 142
    const v26, 0x40e2e148    # 7.09f

    .line 143
    .line 144
    .line 145
    const v21, 0x41051eb8    # 8.32f

    .line 146
    .line 147
    .line 148
    const v22, 0x40bb851f    # 5.86f

    .line 149
    .line 150
    .line 151
    const/high16 v23, 0x41000000    # 8.0f

    .line 152
    .line 153
    const v24, 0x40ce6666    # 6.45f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x411e8f5c    # 9.91f

    .line 160
    .line 161
    .line 162
    const/high16 v26, 0x41100000    # 9.0f

    .line 163
    .line 164
    const/high16 v21, 0x41000000    # 8.0f

    .line 165
    .line 166
    const v22, 0x41023d71    # 8.14f

    .line 167
    .line 168
    .line 169
    const v23, 0x410dc28f    # 8.86f

    .line 170
    .line 171
    .line 172
    const/high16 v24, 0x41100000    # 9.0f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const/16 v16, 0x3800

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const v6, 0x3e99999a    # 0.3f

    .line 189
    .line 190
    .line 191
    const v8, 0x3e99999a    # 0.3f

    .line 192
    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    const/high16 v9, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/high16 v12, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    const-string v4, ""

    .line 203
    .line 204
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 214
    .line 215
    .line 216
    move-result-wide v6

    .line 217
    const/4 v2, 0x0

    .line 218
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x41880000    # 17.0f

    .line 235
    .line 236
    const/high16 v6, 0x41300000    # 11.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x40e00000    # 7.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x40800000    # 4.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40400000    # 3.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x40800000    # 4.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x40c00000    # 6.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, -0x40000000    # -2.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, 0x40400000    # 3.0f

    .line 272
    .line 273
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    const v22, -0x402ccccd    # -1.65f

    .line 278
    .line 279
    .line 280
    const v23, 0x3faccccd    # 1.35f

    .line 281
    .line 282
    .line 283
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 284
    .line 285
    move-object/from16 v20, v2

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v26, 0x40400000    # 3.0f

    .line 291
    .line 292
    const v21, 0x3fd33333    # 1.65f

    .line 293
    .line 294
    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const/high16 v23, 0x40400000    # 3.0f

    .line 298
    .line 299
    const v24, 0x3faccccd    # 1.35f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40000000    # 2.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x40c00000    # 6.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, -0x3f800000    # -4.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x41300000    # 11.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const v6, 0x3e99999a    # 0.3f

    .line 336
    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const-string v4, ""

    .line 340
    .line 341
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v6

    .line 354
    const/4 v0, 0x0

    .line 355
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41b00000    # 22.0f

    .line 372
    .line 373
    const/high16 v2, 0x40800000    # 4.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x40000000    # -2.0f

    .line 379
    .line 380
    const/high16 v18, 0x40400000    # 3.0f

    .line 381
    .line 382
    const/high16 v15, -0x40000000    # -2.0f

    .line 383
    .line 384
    const v16, 0x3ff33333    # 1.9f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const v18, 0x3fdc28f6    # 1.72f

    .line 393
    .line 394
    .line 395
    const v14, 0x3f3d70a4    # 0.74f

    .line 396
    .line 397
    .line 398
    const v15, 0x3ecccccd    # 0.4f

    .line 399
    .line 400
    .line 401
    const v16, 0x3fb0a3d7    # 1.38f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41500000    # 13.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, -0x40000000    # -2.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x4039999a    # -1.55f

    .line 421
    .line 422
    .line 423
    const v18, -0x4007ae14    # -1.94f

    .line 424
    .line 425
    .line 426
    const v14, -0x408ccccd    # -0.95f

    .line 427
    .line 428
    .line 429
    const v15, -0x40d70a3d    # -0.66f

    .line 430
    .line 431
    .line 432
    const v16, -0x402147ae    # -1.74f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x41900000    # 18.0f

    .line 439
    .line 440
    const v18, 0x40e2e148    # 7.09f

    .line 441
    .line 442
    .line 443
    const v13, 0x418e51ec    # 17.79f

    .line 444
    .line 445
    .line 446
    const v14, 0x4107ae14    # 8.48f

    .line 447
    .line 448
    .line 449
    const/high16 v15, 0x41900000    # 18.0f

    .line 450
    .line 451
    const v16, 0x40f9eb85    # 7.81f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, -0x402147ae    # -1.74f

    .line 458
    .line 459
    .line 460
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, -0x405851ec    # -1.31f

    .line 464
    .line 465
    .line 466
    const v15, -0x40d9999a    # -0.65f

    .line 467
    .line 468
    .line 469
    const v16, -0x3fde147b    # -2.53f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41400000    # 12.0f

    .line 476
    .line 477
    const/high16 v2, 0x3f800000    # 1.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x40f7ae14    # 7.74f

    .line 483
    .line 484
    .line 485
    const v2, 0x4075c28f    # 3.84f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, 0x40c00000    # 6.0f

    .line 492
    .line 493
    const v18, 0x40e2e148    # 7.09f

    .line 494
    .line 495
    .line 496
    const v13, 0x40d4cccd    # 6.65f

    .line 497
    .line 498
    .line 499
    const v14, 0x4091eb85    # 4.56f

    .line 500
    .line 501
    .line 502
    const/high16 v15, 0x40c00000    # 6.0f

    .line 503
    .line 504
    const v16, 0x40b8f5c3    # 5.78f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x3f0ccccd    # 0.55f

    .line 511
    .line 512
    .line 513
    const v18, 0x3ffae148    # 1.96f

    .line 514
    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const v14, 0x3f3851ec    # 0.72f

    .line 518
    .line 519
    .line 520
    const v15, 0x3e570a3d    # 0.21f

    .line 521
    .line 522
    .line 523
    const v16, 0x3fb1eb85    # 1.39f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, 0x40a00000    # 5.0f

    .line 530
    .line 531
    const/high16 v18, 0x41300000    # 11.0f

    .line 532
    .line 533
    const v13, 0x40b51eb8    # 5.66f

    .line 534
    .line 535
    .line 536
    const v14, 0x411428f6    # 9.26f

    .line 537
    .line 538
    .line 539
    const/high16 v15, 0x40a00000    # 5.0f

    .line 540
    .line 541
    const v16, 0x4120cccd    # 10.05f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x40000000    # 2.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x40400000    # 3.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x410b851f    # 8.72f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x40800000    # 4.0f

    .line 564
    .line 565
    const/high16 v18, 0x40e00000    # 7.0f

    .line 566
    .line 567
    const v13, 0x40666666    # 3.6f

    .line 568
    .line 569
    .line 570
    const v14, 0x4106147b    # 8.38f

    .line 571
    .line 572
    .line 573
    const/high16 v15, 0x40800000    # 4.0f

    .line 574
    .line 575
    const v16, 0x40f7ae14    # 7.74f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, -0x40000000    # -2.0f

    .line 582
    .line 583
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const v14, -0x40733333    # -1.1f

    .line 587
    .line 588
    .line 589
    const/high16 v15, -0x40000000    # -2.0f

    .line 590
    .line 591
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x40bccccd    # 5.9f

    .line 597
    .line 598
    .line 599
    const/4 v2, 0x0

    .line 600
    const/high16 v4, 0x40e00000    # 7.0f

    .line 601
    .line 602
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const v18, 0x3fdc28f6    # 1.72f

    .line 608
    .line 609
    .line 610
    const v14, 0x3f3d70a4    # 0.74f

    .line 611
    .line 612
    .line 613
    const v15, 0x3ecccccd    # 0.4f

    .line 614
    .line 615
    .line 616
    const v16, 0x3fb0a3d7    # 1.38f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x41a80000    # 21.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v0, 0x41200000    # 10.0f

    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, -0x3f800000    # -4.0f

    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v18, -0x40800000    # -1.0f

    .line 638
    .line 639
    const v14, -0x40f33333    # -0.55f

    .line 640
    .line 641
    .line 642
    const v15, 0x3ee66666    # 0.45f

    .line 643
    .line 644
    .line 645
    const/high16 v16, -0x40800000    # -1.0f

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x3ee66666    # 0.45f

    .line 651
    .line 652
    .line 653
    const/high16 v2, 0x3f800000    # 1.0f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x40800000    # 4.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x41200000    # 10.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x410b851f    # 8.72f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v18, -0x4023d70a    # -1.72f

    .line 675
    .line 676
    .line 677
    const v13, 0x3f19999a    # 0.6f

    .line 678
    .line 679
    .line 680
    const v14, -0x414ccccd    # -0.35f

    .line 681
    .line 682
    .line 683
    const/high16 v15, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const v16, -0x40851eb8    # -0.98f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v17, 0x41b00000    # 22.0f

    .line 692
    .line 693
    const/high16 v18, 0x40800000    # 4.0f

    .line 694
    .line 695
    const/high16 v13, 0x41c00000    # 24.0f

    .line 696
    .line 697
    const v14, 0x40bccccd    # 5.9f

    .line 698
    .line 699
    .line 700
    const/high16 v15, 0x41b00000    # 22.0f

    .line 701
    .line 702
    const/high16 v16, 0x40800000    # 4.0f

    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x40b00000    # 5.5f

    .line 711
    .line 712
    const v2, 0x410d999a    # 8.85f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, 0x4059999a    # 3.4f

    .line 719
    .line 720
    .line 721
    const/high16 v2, 0x41400000    # 12.0f

    .line 722
    .line 723
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x4049999a    # 3.15f

    .line 727
    .line 728
    .line 729
    const v2, 0x40066666    # 2.1f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v17, 0x41800000    # 16.0f

    .line 736
    .line 737
    const v18, 0x40e2e148    # 7.09f

    .line 738
    .line 739
    .line 740
    const v13, 0x417ae148    # 15.68f

    .line 741
    .line 742
    .line 743
    const v14, 0x40bb851f    # 5.86f

    .line 744
    .line 745
    .line 746
    const/high16 v15, 0x41800000    # 16.0f

    .line 747
    .line 748
    const v16, 0x40ce6666    # 6.45f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, 0x416170a4    # 14.09f

    .line 755
    .line 756
    .line 757
    const/high16 v18, 0x41100000    # 9.0f

    .line 758
    .line 759
    const/high16 v13, 0x41800000    # 16.0f

    .line 760
    .line 761
    const v14, 0x41023d71    # 8.14f

    .line 762
    .line 763
    .line 764
    const v15, 0x41723d71    # 15.14f

    .line 765
    .line 766
    .line 767
    const/high16 v16, 0x41100000    # 9.0f

    .line 768
    .line 769
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, 0x411e8f5c    # 9.91f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v17, 0x41000000    # 8.0f

    .line 779
    .line 780
    const v18, 0x40e2e148    # 7.09f

    .line 781
    .line 782
    .line 783
    const v13, 0x410dc28f    # 8.86f

    .line 784
    .line 785
    .line 786
    const/high16 v14, 0x41100000    # 9.0f

    .line 787
    .line 788
    const/high16 v15, 0x41000000    # 8.0f

    .line 789
    .line 790
    const v16, 0x41023d71    # 8.14f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v17, 0x410d999a    # 8.85f

    .line 797
    .line 798
    .line 799
    const/high16 v18, 0x40b00000    # 5.5f

    .line 800
    .line 801
    const/high16 v13, 0x41000000    # 8.0f

    .line 802
    .line 803
    const v14, 0x40ce6666    # 6.45f

    .line 804
    .line 805
    .line 806
    const v15, 0x41051eb8    # 8.32f

    .line 807
    .line 808
    .line 809
    const v16, 0x40bb851f    # 5.86f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v0, 0x41980000    # 19.0f

    .line 819
    .line 820
    const/high16 v2, 0x41a80000    # 21.0f

    .line 821
    .line 822
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, -0x3f400000    # -6.0f

    .line 826
    .line 827
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v0, -0x40000000    # -2.0f

    .line 831
    .line 832
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 836
    .line 837
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 838
    .line 839
    const/4 v13, 0x0

    .line 840
    const v14, -0x402ccccd    # -1.65f

    .line 841
    .line 842
    .line 843
    const v15, -0x40533333    # -1.35f

    .line 844
    .line 845
    .line 846
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v18, 0x40400000    # 3.0f

    .line 852
    .line 853
    const v13, -0x402ccccd    # -1.65f

    .line 854
    .line 855
    .line 856
    const/4 v14, 0x0

    .line 857
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 858
    .line 859
    const v16, 0x3faccccd    # 1.35f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const/high16 v0, 0x40000000    # 2.0f

    .line 866
    .line 867
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v0, 0x40400000    # 3.0f

    .line 871
    .line 872
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/high16 v0, -0x3f800000    # -4.0f

    .line 876
    .line 877
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v0, 0x40800000    # 4.0f

    .line 881
    .line 882
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v0, -0x3f800000    # -4.0f

    .line 886
    .line 887
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v0, 0x41200000    # 10.0f

    .line 891
    .line 892
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v0, 0x40800000    # 4.0f

    .line 896
    .line 897
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v0, 0x41980000    # 19.0f

    .line 904
    .line 905
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    const/16 v16, 0x3800

    .line 916
    .line 917
    const/16 v17, 0x0

    .line 918
    .line 919
    const/high16 v6, 0x3f800000    # 1.0f

    .line 920
    .line 921
    const/high16 v8, 0x3f800000    # 1.0f

    .line 922
    .line 923
    const/4 v7, 0x0

    .line 924
    const/high16 v12, 0x3f800000    # 1.0f

    .line 925
    .line 926
    const/4 v13, 0x0

    .line 927
    const/4 v15, 0x0

    .line 928
    const-string v4, ""

    .line 929
    .line 930
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    sput-object v0, Landroidx/compose/material/icons/twotone/MosqueKt;->_mosque:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 939
    .line 940
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    return-object v0
.end method
