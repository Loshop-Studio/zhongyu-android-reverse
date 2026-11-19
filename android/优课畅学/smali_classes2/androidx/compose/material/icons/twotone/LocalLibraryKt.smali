.class public final Landroidx/compose/material/icons/twotone/LocalLibraryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localLibrary:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalLibrary(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalLibraryKt;->_localLibrary:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalLibrary"

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
    const v4, 0x41890a3d    # 17.13f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3f21999a    # -6.95f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x3f4b851f    # -5.64f

    .line 85
    .line 86
    .line 87
    const v26, 0x40351eb8    # 2.83f

    .line 88
    .line 89
    .line 90
    const v21, -0x3ff9999a    # -2.1f

    .line 91
    .line 92
    .line 93
    const v22, 0x3ec28f5c    # 0.38f

    .line 94
    .line 95
    .line 96
    const v23, -0x3f7e6666    # -4.05f

    .line 97
    .line 98
    .line 99
    const v24, 0x3faccccd    # 1.35f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x41647ae1    # 14.28f

    .line 108
    .line 109
    .line 110
    const/high16 v6, 0x41400000    # 12.0f

    .line 111
    .line 112
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x4051eb85    # -1.36f

    .line 116
    .line 117
    .line 118
    const v6, -0x405d70a4    # -1.27f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const v26, 0x4122e148    # 10.18f

    .line 127
    .line 128
    .line 129
    const v21, 0x4110cccd    # 9.05f

    .line 130
    .line 131
    .line 132
    const v22, 0x41387ae1    # 11.53f

    .line 133
    .line 134
    .line 135
    const v23, 0x40e33333    # 7.1f

    .line 136
    .line 137
    .line 138
    const v24, 0x4128f5c3    # 10.56f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x40de6666    # 6.95f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x40e00000    # 7.0f

    .line 151
    .line 152
    const v26, 0x40351eb8    # 2.83f

    .line 153
    .line 154
    .line 155
    const v21, 0x4021eb85    # 2.53f

    .line 156
    .line 157
    .line 158
    const v22, 0x3eae147b    # 0.34f

    .line 159
    .line 160
    .line 161
    const v23, 0x409e147b    # 4.94f

    .line 162
    .line 163
    .line 164
    const v24, 0x3fa66666    # 1.3f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v26, -0x3fcae148    # -2.83f

    .line 171
    .line 172
    .line 173
    const v21, 0x40047ae1    # 2.07f

    .line 174
    .line 175
    .line 176
    const v22, -0x403d70a4    # -1.52f

    .line 177
    .line 178
    .line 179
    const v23, 0x408f0a3d    # 4.47f

    .line 180
    .line 181
    .line 182
    const v24, -0x3fe0a3d7    # -2.49f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/16 v16, 0x3800

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    const v6, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const v8, 0x3e99999a    # 0.3f

    .line 203
    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    const/high16 v9, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/high16 v12, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const/4 v14, 0x0

    .line 212
    const/4 v15, 0x0

    .line 213
    const-string v4, ""

    .line 214
    .line 215
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v6

    .line 228
    const/4 v2, 0x0

    .line 229
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41400000    # 12.0f

    .line 246
    .line 247
    const/high16 v6, 0x40a00000    # 5.0f

    .line 248
    .line 249
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    const/high16 v6, -0x40000000    # -2.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v26, 0x40800000    # 4.0f

    .line 259
    .line 260
    const/16 v27, 0x0

    .line 261
    .line 262
    const/high16 v21, 0x40000000    # 2.0f

    .line 263
    .line 264
    const/high16 v22, 0x40000000    # 2.0f

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x1

    .line 269
    .line 270
    const/16 v25, 0x1

    .line 271
    .line 272
    move-object/from16 v20, v2

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v26, -0x3f800000    # -4.0f

    .line 278
    .line 279
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const v6, 0x3e99999a    # 0.3f

    .line 287
    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    const-string v4, ""

    .line 291
    .line 292
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 293
    .line 294
    .line 295
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 302
    .line 303
    .line 304
    move-result-wide v6

    .line 305
    const/4 v0, 0x0

    .line 306
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 310
    .line 311
    .line 312
    move-result v10

    .line 313
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41800000    # 16.0f

    .line 323
    .line 324
    const/high16 v2, 0x40a00000    # 5.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x3f800000    # -4.0f

    .line 330
    .line 331
    const/high16 v18, -0x3f800000    # -4.0f

    .line 332
    .line 333
    const v14, -0x3ff28f5c    # -2.21f

    .line 334
    .line 335
    .line 336
    const v15, -0x401ae148    # -1.79f

    .line 337
    .line 338
    .line 339
    const/high16 v16, -0x3f800000    # -4.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x40328f5c    # 2.79f

    .line 345
    .line 346
    .line 347
    const/high16 v2, 0x41000000    # 8.0f

    .line 348
    .line 349
    const/high16 v4, 0x40a00000    # 5.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3fe51eb8    # 1.79f

    .line 355
    .line 356
    .line 357
    const/high16 v2, 0x40800000    # 4.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x401ae148    # -1.79f

    .line 363
    .line 364
    .line 365
    const/high16 v2, -0x3f800000    # -4.0f

    .line 366
    .line 367
    const/high16 v4, 0x40800000    # 4.0f

    .line 368
    .line 369
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41200000    # 10.0f

    .line 376
    .line 377
    const/high16 v2, 0x40a00000    # 5.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/high16 v18, -0x40000000    # -2.0f

    .line 385
    .line 386
    const v14, -0x40733333    # -1.1f

    .line 387
    .line 388
    .line 389
    const v15, 0x3f666666    # 0.9f

    .line 390
    .line 391
    .line 392
    const/high16 v16, -0x40000000    # -2.0f

    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3f666666    # 0.9f

    .line 398
    .line 399
    .line 400
    const/high16 v2, 0x40000000    # 2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, -0x4099999a    # -0.9f

    .line 406
    .line 407
    .line 408
    const/high16 v4, -0x40000000    # -2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v2, -0x40000000    # -2.0f

    .line 414
    .line 415
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x40400000    # 3.0f

    .line 422
    .line 423
    const/high16 v2, 0x41980000    # 19.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x41100000    # 9.0f

    .line 429
    .line 430
    const v18, 0x40633333    # 3.55f

    .line 431
    .line 432
    .line 433
    const v13, 0x405eb852    # 3.48f

    .line 434
    .line 435
    .line 436
    const/4 v14, 0x0

    .line 437
    const v15, 0x40d47ae1    # 6.64f

    .line 438
    .line 439
    .line 440
    const v16, 0x3faccccd    # 1.35f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v18, -0x3f9ccccd    # -3.55f

    .line 447
    .line 448
    .line 449
    const v13, 0x40170a3d    # 2.36f

    .line 450
    .line 451
    .line 452
    const v14, -0x3ff3d70a    # -2.19f

    .line 453
    .line 454
    .line 455
    const v15, 0x40b0a3d7    # 5.52f

    .line 456
    .line 457
    .line 458
    const v16, -0x3f9ccccd    # -3.55f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41a80000    # 21.0f

    .line 465
    .line 466
    const/high16 v2, 0x41000000    # 8.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 472
    .line 473
    const v18, 0x40633333    # 3.55f

    .line 474
    .line 475
    .line 476
    const v13, -0x3fa147ae    # -3.48f

    .line 477
    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    const v15, -0x3f2b851f    # -6.64f

    .line 481
    .line 482
    .line 483
    const v16, 0x3faccccd    # 1.35f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40400000    # 3.0f

    .line 490
    .line 491
    const/high16 v18, 0x41000000    # 8.0f

    .line 492
    .line 493
    const v13, 0x411a3d71    # 9.64f

    .line 494
    .line 495
    .line 496
    const v14, 0x4115999a    # 9.35f

    .line 497
    .line 498
    .line 499
    const v15, 0x40cf5c29    # 6.48f

    .line 500
    .line 501
    .line 502
    const/high16 v16, 0x41000000    # 8.0f

    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41300000    # 11.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x4122e148    # 10.18f

    .line 516
    .line 517
    .line 518
    const/high16 v2, 0x40a00000    # 5.0f

    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x40b47ae1    # 5.64f

    .line 524
    .line 525
    .line 526
    const v18, 0x40351eb8    # 2.83f

    .line 527
    .line 528
    .line 529
    const v13, 0x40066666    # 2.1f

    .line 530
    .line 531
    .line 532
    const v14, 0x3ec28f5c    # 0.38f

    .line 533
    .line 534
    .line 535
    const v15, 0x4081999a    # 4.05f

    .line 536
    .line 537
    .line 538
    const v16, 0x3faccccd    # 1.35f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x41647ae1    # 14.28f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x41400000    # 12.0f

    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x3fae147b    # 1.36f

    .line 553
    .line 554
    .line 555
    const v2, -0x405d70a4    # -1.27f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v18, -0x3fcae148    # -2.83f

    .line 562
    .line 563
    .line 564
    const v13, 0x3fcb851f    # 1.59f

    .line 565
    .line 566
    .line 567
    const v14, -0x40428f5c    # -1.48f

    .line 568
    .line 569
    .line 570
    const v15, 0x40628f5c    # 3.54f

    .line 571
    .line 572
    .line 573
    const v16, -0x3fe33333    # -2.45f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x40de6666    # 6.95f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, -0x3f200000    # -7.0f

    .line 586
    .line 587
    const v18, 0x40347ae1    # 2.82f

    .line 588
    .line 589
    .line 590
    const v13, -0x3fde147b    # -2.53f

    .line 591
    .line 592
    .line 593
    const v14, 0x3eae147b    # 0.34f

    .line 594
    .line 595
    .line 596
    const v15, -0x3f623d71    # -4.93f

    .line 597
    .line 598
    .line 599
    const v16, 0x3fa66666    # 1.3f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v18, -0x3fcae148    # -2.83f

    .line 606
    .line 607
    .line 608
    const v13, -0x3ffc28f6    # -2.06f

    .line 609
    .line 610
    .line 611
    const v14, -0x403d70a4    # -1.52f

    .line 612
    .line 613
    .line 614
    const v15, -0x3f70f5c3    # -4.47f

    .line 615
    .line 616
    .line 617
    const v16, -0x3fe0a3d7    # -2.49f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, -0x3f21eb85    # -6.94f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    const/16 v16, 0x3800

    .line 637
    .line 638
    const/16 v17, 0x0

    .line 639
    .line 640
    const/high16 v6, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v8, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/4 v7, 0x0

    .line 645
    const/high16 v12, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v13, 0x0

    .line 648
    const/4 v14, 0x0

    .line 649
    const/4 v15, 0x0

    .line 650
    const-string v4, ""

    .line 651
    .line 652
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalLibraryKt;->_localLibrary:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 661
    .line 662
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    return-object v0
.end method
