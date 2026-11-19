.class public final Landroidx/compose/material/icons/twotone/PersonAddAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonAddAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonAddAltKt;->_personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonAddAlt"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

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
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
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
    const v4, 0x4167ae14    # 14.48f

    .line 162
    .line 163
    .line 164
    const v6, 0x4182b852    # 16.34f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, 0x41100000    # 9.0f

    .line 171
    .line 172
    const/high16 v26, 0x41700000    # 15.0f

    .line 173
    .line 174
    const v21, 0x4154a3d7    # 13.29f

    .line 175
    .line 176
    .line 177
    const v22, 0x417bae14    # 15.73f

    .line 178
    .line 179
    .line 180
    const v23, 0x4135eb85    # 11.37f

    .line 181
    .line 182
    .line 183
    const/high16 v24, 0x41700000    # 15.0f

    .line 184
    .line 185
    move-object/from16 v20, v2

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, -0x3f50a3d7    # -5.48f

    .line 191
    .line 192
    .line 193
    const v26, 0x3fab851f    # 1.34f

    .line 194
    .line 195
    .line 196
    const v21, -0x3fe851ec    # -2.37f

    .line 197
    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const v23, -0x3f76b852    # -4.29f

    .line 202
    .line 203
    .line 204
    const v24, 0x3f3ae148    # 0.73f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x40400000    # 3.0f

    .line 211
    .line 212
    const v26, 0x4189c28f    # 17.22f

    .line 213
    .line 214
    .line 215
    const v21, 0x404ccccd    # 3.2f

    .line 216
    .line 217
    .line 218
    const/high16 v22, 0x41840000    # 16.5f

    .line 219
    .line 220
    const/high16 v23, 0x40400000    # 3.0f

    .line 221
    .line 222
    const v24, 0x4186b852    # 16.84f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41900000    # 18.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41400000    # 12.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, -0x40b851ec    # -0.78f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, 0x4167ae14    # 14.48f

    .line 245
    .line 246
    .line 247
    const v26, 0x4182b852    # 16.34f

    .line 248
    .line 249
    .line 250
    const/high16 v21, 0x41700000    # 15.0f

    .line 251
    .line 252
    const v22, 0x4186b852    # 16.84f

    .line 253
    .line 254
    .line 255
    const v23, 0x416ccccd    # 14.8f

    .line 256
    .line 257
    .line 258
    const/high16 v24, 0x41840000    # 16.5f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const-string v4, ""

    .line 275
    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/4 v2, 0x0

    .line 290
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x41400000    # 12.0f

    .line 307
    .line 308
    const/high16 v6, 0x41100000    # 9.0f

    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v25, 0x40800000    # 4.0f

    .line 314
    .line 315
    const/high16 v26, -0x3f800000    # -4.0f

    .line 316
    .line 317
    const v21, 0x400d70a4    # 2.21f

    .line 318
    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/high16 v23, 0x40800000    # 4.0f

    .line 323
    .line 324
    const v24, -0x401ae148    # -1.79f

    .line 325
    .line 326
    .line 327
    move-object/from16 v20, v2

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, -0x3f800000    # -4.0f

    .line 333
    .line 334
    const/16 v21, 0x0

    .line 335
    .line 336
    const v22, -0x3ff28f5c    # -2.21f

    .line 337
    .line 338
    .line 339
    const v23, -0x401ae148    # -1.79f

    .line 340
    .line 341
    .line 342
    const/high16 v24, -0x3f800000    # -4.0f

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v4, 0x40b947ae    # 5.79f

    .line 348
    .line 349
    .line 350
    const/high16 v6, 0x40a00000    # 5.0f

    .line 351
    .line 352
    const/high16 v7, 0x41000000    # 8.0f

    .line 353
    .line 354
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, 0x41100000    # 9.0f

    .line 358
    .line 359
    const/high16 v26, 0x41400000    # 12.0f

    .line 360
    .line 361
    const/high16 v21, 0x40a00000    # 5.0f

    .line 362
    .line 363
    const v22, 0x41235c29    # 10.21f

    .line 364
    .line 365
    .line 366
    const v23, 0x40d947ae    # 6.79f

    .line 367
    .line 368
    .line 369
    const/high16 v24, 0x41400000    # 12.0f

    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v4, 0x40c00000    # 6.0f

    .line 378
    .line 379
    const/high16 v6, 0x41100000    # 9.0f

    .line 380
    .line 381
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v25, 0x40000000    # 2.0f

    .line 385
    .line 386
    const/high16 v26, 0x40000000    # 2.0f

    .line 387
    .line 388
    const v21, 0x3f8ccccd    # 1.1f

    .line 389
    .line 390
    .line 391
    const/16 v22, 0x0

    .line 392
    .line 393
    const/high16 v23, 0x40000000    # 2.0f

    .line 394
    .line 395
    const v24, 0x3f666666    # 0.9f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, -0x40000000    # -2.0f

    .line 402
    .line 403
    const/16 v21, 0x0

    .line 404
    .line 405
    const v22, 0x3f8ccccd    # 1.1f

    .line 406
    .line 407
    .line 408
    const v23, -0x4099999a    # -0.9f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x40000000    # 2.0f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v4, 0x4111999a    # 9.1f

    .line 417
    .line 418
    .line 419
    const/high16 v6, 0x40e00000    # 7.0f

    .line 420
    .line 421
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v25, 0x41100000    # 9.0f

    .line 425
    .line 426
    const/high16 v26, 0x40c00000    # 6.0f

    .line 427
    .line 428
    const/high16 v21, 0x40e00000    # 7.0f

    .line 429
    .line 430
    const v22, 0x40dccccd    # 6.9f

    .line 431
    .line 432
    .line 433
    const v23, 0x40fccccd    # 7.9f

    .line 434
    .line 435
    .line 436
    const/high16 v24, 0x40c00000    # 6.0f

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/high16 v6, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/high16 v8, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v7, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 463
    .line 464
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 465
    .line 466
    .line 467
    move-result-wide v6

    .line 468
    const/4 v2, 0x0

    .line 469
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 483
    .line 484
    .line 485
    const/high16 v4, 0x41a00000    # 20.0f

    .line 486
    .line 487
    const/high16 v6, 0x41100000    # 9.0f

    .line 488
    .line 489
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 493
    .line 494
    const/4 v6, 0x0

    .line 495
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, -0x40000000    # -2.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, 0x40400000    # 3.0f

    .line 504
    .line 505
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 509
    .line 510
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x40000000    # 2.0f

    .line 514
    .line 515
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x40400000    # 3.0f

    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v4, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 532
    .line 533
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x40400000    # 3.0f

    .line 537
    .line 538
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, -0x40000000    # -2.0f

    .line 542
    .line 543
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const/high16 v6, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v7, 0x0

    .line 556
    const-string v4, ""

    .line 557
    .line 558
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 559
    .line 560
    .line 561
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 566
    .line 567
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 568
    .line 569
    .line 570
    move-result-wide v6

    .line 571
    const/4 v0, 0x0

    .line 572
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 580
    .line 581
    .line 582
    move-result v11

    .line 583
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    const v0, 0x41763d71    # 15.39f

    .line 589
    .line 590
    .line 591
    const v2, 0x4168f5c3    # 14.56f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x41100000    # 9.0f

    .line 598
    .line 599
    const/high16 v18, 0x41500000    # 13.0f

    .line 600
    .line 601
    const v13, 0x415b5c29    # 13.71f

    .line 602
    .line 603
    .line 604
    const v14, 0x415b3333    # 13.7f

    .line 605
    .line 606
    .line 607
    const v15, 0x41387ae1    # 11.53f

    .line 608
    .line 609
    .line 610
    const/high16 v16, 0x41500000    # 13.0f

    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x3f33851f    # -6.39f

    .line 616
    .line 617
    .line 618
    const v18, 0x3fc7ae14    # 1.56f

    .line 619
    .line 620
    .line 621
    const v13, -0x3fde147b    # -2.53f

    .line 622
    .line 623
    .line 624
    const/4 v14, 0x0

    .line 625
    const v15, -0x3f6947ae    # -4.71f

    .line 626
    .line 627
    .line 628
    const v16, 0x3f333333    # 0.7f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v17, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const v18, 0x4189c28f    # 17.22f

    .line 637
    .line 638
    .line 639
    const v13, 0x3fce147b    # 1.61f

    .line 640
    .line 641
    .line 642
    const v14, 0x41711eb8    # 15.07f

    .line 643
    .line 644
    .line 645
    const/high16 v15, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const v16, 0x4180cccd    # 16.1f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41a00000    # 20.0f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41800000    # 16.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, -0x3fce147b    # -2.78f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v17, 0x41763d71    # 15.39f

    .line 670
    .line 671
    .line 672
    const v18, 0x4168f5c3    # 14.56f

    .line 673
    .line 674
    .line 675
    const/high16 v13, 0x41880000    # 17.0f

    .line 676
    .line 677
    const v14, 0x4180cccd    # 16.1f

    .line 678
    .line 679
    .line 680
    const v15, 0x41831eb8    # 16.39f

    .line 681
    .line 682
    .line 683
    const v16, 0x41711eb8    # 15.07f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, 0x41700000    # 15.0f

    .line 693
    .line 694
    const/high16 v2, 0x41900000    # 18.0f

    .line 695
    .line 696
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, 0x40400000    # 3.0f

    .line 700
    .line 701
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, -0x40b851ec    # -0.78f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x3f051eb8    # 0.52f

    .line 711
    .line 712
    .line 713
    const v18, -0x409eb852    # -0.88f

    .line 714
    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const v14, -0x413d70a4    # -0.38f

    .line 718
    .line 719
    .line 720
    const v15, 0x3e4ccccd    # 0.2f

    .line 721
    .line 722
    .line 723
    const v16, -0x40c7ae14    # -0.72f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v17, 0x41100000    # 9.0f

    .line 730
    .line 731
    const/high16 v18, 0x41700000    # 15.0f

    .line 732
    .line 733
    const v13, 0x4096b852    # 4.71f

    .line 734
    .line 735
    .line 736
    const v14, 0x417bae14    # 15.73f

    .line 737
    .line 738
    .line 739
    const v15, 0x40d428f6    # 6.63f

    .line 740
    .line 741
    .line 742
    const/high16 v16, 0x41700000    # 15.0f

    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, 0x40af5c29    # 5.48f

    .line 748
    .line 749
    .line 750
    const v18, 0x3fab851f    # 1.34f

    .line 751
    .line 752
    .line 753
    const v13, 0x4017ae14    # 2.37f

    .line 754
    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    const v15, 0x408947ae    # 4.29f

    .line 758
    .line 759
    .line 760
    const v16, 0x3f3ae148    # 0.73f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, 0x41700000    # 15.0f

    .line 767
    .line 768
    const v18, 0x4189c28f    # 17.22f

    .line 769
    .line 770
    .line 771
    const v13, 0x416ccccd    # 14.8f

    .line 772
    .line 773
    .line 774
    const/high16 v14, 0x41840000    # 16.5f

    .line 775
    .line 776
    const/high16 v15, 0x41700000    # 15.0f

    .line 777
    .line 778
    const v16, 0x4186b852    # 16.84f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x41900000    # 18.0f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    const/16 v16, 0x3800

    .line 797
    .line 798
    const/16 v17, 0x0

    .line 799
    .line 800
    const/high16 v6, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const/4 v7, 0x0

    .line 803
    const/high16 v12, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v13, 0x0

    .line 806
    const/4 v14, 0x0

    .line 807
    const/4 v15, 0x0

    .line 808
    const-string v4, ""

    .line 809
    .line 810
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonAddAltKt;->_personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 819
    .line 820
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    return-object v0
.end method
