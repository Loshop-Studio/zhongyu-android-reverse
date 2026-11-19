.class public final Landroidx/compose/material/icons/rounded/HotTubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHotTub(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HotTubKt;->_hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HotTub"

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
    const/high16 v6, 0x40e00000    # 7.0f

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41a80000    # 21.0f

    .line 160
    .line 161
    const/high16 v2, 0x41400000    # 12.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x3ee26666    # -9.85f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40ae147b    # -0.82f

    .line 173
    .line 174
    .line 175
    const v18, -0x40c7ae14    # -0.72f

    .line 176
    .line 177
    .line 178
    const v13, -0x416147ae    # -0.31f

    .line 179
    .line 180
    .line 181
    const v14, -0x419eb852    # -0.22f

    .line 182
    .line 183
    .line 184
    const v15, -0x40e8f5c3    # -0.59f

    .line 185
    .line 186
    .line 187
    const v16, -0x41147ae1    # -0.46f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x404ccccd    # -1.4f

    .line 194
    .line 195
    .line 196
    const v2, -0x4039999a    # -1.55f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x40cf5c29    # -0.69f

    .line 203
    .line 204
    .line 205
    const/high16 v18, -0x41000000    # -0.5f

    .line 206
    .line 207
    const v13, -0x41bd70a4    # -0.19f

    .line 208
    .line 209
    .line 210
    const v14, -0x41a8f5c3    # -0.21f

    .line 211
    .line 212
    .line 213
    const v15, -0x4123d70a    # -0.43f

    .line 214
    .line 215
    .line 216
    const v16, -0x413d70a4    # -0.38f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x408a3d71    # -0.96f

    .line 223
    .line 224
    .line 225
    const v18, -0x41947ae1    # -0.23f

    .line 226
    .line 227
    .line 228
    const v13, -0x416b851f    # -0.29f

    .line 229
    .line 230
    .line 231
    const v14, -0x41f0a3d7    # -0.14f

    .line 232
    .line 233
    .line 234
    const v15, -0x40e147ae    # -0.62f

    .line 235
    .line 236
    .line 237
    const v16, -0x41947ae1    # -0.23f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, -0x430a3d71    # -0.03f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const/high16 v18, 0x41340000    # 11.25f

    .line 252
    .line 253
    const v13, 0x40c051ec    # 6.01f

    .line 254
    .line 255
    .line 256
    const/high16 v14, 0x41100000    # 9.0f

    .line 257
    .line 258
    const/high16 v15, 0x40a00000    # 5.0f

    .line 259
    .line 260
    const v16, 0x412028f6    # 10.01f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x40a00000    # 5.0f

    .line 267
    .line 268
    const/high16 v2, 0x41400000    # 12.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x40400000    # 3.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/high16 v18, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const v13, -0x40f33333    # -0.55f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40800000    # -1.0f

    .line 287
    .line 288
    const v16, 0x3ee66666    # 0.45f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40e00000    # 7.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x40000000    # 2.0f

    .line 300
    .line 301
    const/high16 v18, 0x40000000    # 2.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const v14, 0x3f8ccccd    # 1.1f

    .line 305
    .line 306
    .line 307
    const v15, 0x3f666666    # 0.9f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x40000000    # 2.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41800000    # 16.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v18, -0x40000000    # -2.0f

    .line 321
    .line 322
    const v13, 0x3f8ccccd    # 1.1f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/high16 v15, 0x40000000    # 2.0f

    .line 327
    .line 328
    const v16, -0x4099999a    # -0.9f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, -0x3f200000    # -7.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, -0x40800000    # -1.0f

    .line 340
    .line 341
    const/high16 v18, -0x40800000    # -1.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const v14, -0x40f33333    # -0.55f

    .line 345
    .line 346
    .line 347
    const v15, -0x4119999a    # -0.45f

    .line 348
    .line 349
    .line 350
    const/high16 v16, -0x40800000    # -1.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40e00000    # 7.0f

    .line 359
    .line 360
    const/high16 v2, 0x41980000    # 19.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v18, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const v14, 0x3f0ccccd    # 0.55f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x4119999a    # -0.45f

    .line 376
    .line 377
    .line 378
    const/high16 v2, -0x40800000    # -1.0f

    .line 379
    .line 380
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, -0x3f800000    # -4.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/high16 v18, -0x40800000    # -1.0f

    .line 391
    .line 392
    const v14, -0x40f33333    # -0.55f

    .line 393
    .line 394
    .line 395
    const v15, 0x3ee66666    # 0.45f

    .line 396
    .line 397
    .line 398
    const/high16 v16, -0x40800000    # -1.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x3ee66666    # 0.45f

    .line 404
    .line 405
    .line 406
    const/high16 v2, 0x3f800000    # 1.0f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x40800000    # 4.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41300000    # 11.0f

    .line 420
    .line 421
    const/high16 v2, 0x41980000    # 19.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, -0x40800000    # -1.0f

    .line 427
    .line 428
    const/high16 v18, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const v14, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const v15, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x3f800000    # 1.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x4119999a    # -0.45f

    .line 442
    .line 443
    .line 444
    const/high16 v2, -0x40800000    # -1.0f

    .line 445
    .line 446
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, -0x3f800000    # -4.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v18, -0x40800000    # -1.0f

    .line 457
    .line 458
    const v14, -0x40f33333    # -0.55f

    .line 459
    .line 460
    .line 461
    const v15, 0x3ee66666    # 0.45f

    .line 462
    .line 463
    .line 464
    const/high16 v16, -0x40800000    # -1.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3ee66666    # 0.45f

    .line 470
    .line 471
    .line 472
    const/high16 v2, 0x3f800000    # 1.0f

    .line 473
    .line 474
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40800000    # 4.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41700000    # 15.0f

    .line 486
    .line 487
    const/high16 v2, 0x41980000    # 19.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x40800000    # -1.0f

    .line 493
    .line 494
    const/high16 v18, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const v14, 0x3f0ccccd    # 0.55f

    .line 497
    .line 498
    .line 499
    const v15, -0x4119999a    # -0.45f

    .line 500
    .line 501
    .line 502
    const/high16 v16, 0x3f800000    # 1.0f

    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, -0x4119999a    # -0.45f

    .line 508
    .line 509
    .line 510
    const/high16 v2, -0x40800000    # -1.0f

    .line 511
    .line 512
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, -0x3f800000    # -4.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v18, -0x40800000    # -1.0f

    .line 523
    .line 524
    const v14, -0x40f33333    # -0.55f

    .line 525
    .line 526
    .line 527
    const v15, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    const/high16 v16, -0x40800000    # -1.0f

    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x3ee66666    # 0.45f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x3f800000    # 1.0f

    .line 539
    .line 540
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x40800000    # 4.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x41980000    # 19.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, -0x40800000    # -1.0f

    .line 557
    .line 558
    const/high16 v18, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const v14, 0x3f0ccccd    # 0.55f

    .line 561
    .line 562
    .line 563
    const v15, -0x4119999a    # -0.45f

    .line 564
    .line 565
    .line 566
    const/high16 v16, 0x3f800000    # 1.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x4119999a    # -0.45f

    .line 572
    .line 573
    .line 574
    const/high16 v2, -0x40800000    # -1.0f

    .line 575
    .line 576
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, -0x3f800000    # -4.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v18, -0x40800000    # -1.0f

    .line 587
    .line 588
    const v14, -0x40f33333    # -0.55f

    .line 589
    .line 590
    .line 591
    const v15, 0x3ee66666    # 0.45f

    .line 592
    .line 593
    .line 594
    const/high16 v16, -0x40800000    # -1.0f

    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3ee66666    # 0.45f

    .line 600
    .line 601
    .line 602
    const/high16 v2, 0x3f800000    # 1.0f

    .line 603
    .line 604
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40800000    # 4.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, 0x4170f5c3    # 15.06f

    .line 616
    .line 617
    .line 618
    const/high16 v2, 0x41200000    # 10.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, 0x3f70a3d7    # 0.94f

    .line 624
    .line 625
    .line 626
    const v18, -0x409c28f6    # -0.89f

    .line 627
    .line 628
    .line 629
    const/high16 v13, 0x3f000000    # 0.5f

    .line 630
    .line 631
    const/4 v14, 0x0

    .line 632
    const v15, 0x3f6e147b    # 0.93f

    .line 633
    .line 634
    .line 635
    const v16, -0x413851ec    # -0.39f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, -0x40533333    # -1.35f

    .line 642
    .line 643
    .line 644
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 645
    .line 646
    const v13, 0x3d23d70a    # 0.04f

    .line 647
    .line 648
    .line 649
    const v14, -0x404ccccd    # -1.4f

    .line 650
    .line 651
    .line 652
    const v15, -0x40eb851f    # -0.58f

    .line 653
    .line 654
    .line 655
    const v16, -0x3fe147ae    # -2.48f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, -0x40bae148    # -0.77f

    .line 662
    .line 663
    .line 664
    const v18, -0x400b851f    # -1.91f

    .line 665
    .line 666
    .line 667
    const v13, -0x40d9999a    # -0.65f

    .line 668
    .line 669
    .line 670
    const v14, -0x40c7ae14    # -0.72f

    .line 671
    .line 672
    .line 673
    const v15, -0x40b33333    # -0.8f

    .line 674
    .line 675
    .line 676
    const v16, -0x405d70a4    # -1.27f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, -0x408f5c29    # -0.94f

    .line 683
    .line 684
    .line 685
    const v18, -0x408ccccd    # -0.95f

    .line 686
    .line 687
    .line 688
    const v13, 0x3ca3d70a    # 0.02f

    .line 689
    .line 690
    .line 691
    const v14, -0x40fae148    # -0.52f

    .line 692
    .line 693
    .line 694
    const v15, -0x412e147b    # -0.41f

    .line 695
    .line 696
    .line 697
    const v16, -0x408ccccd    # -0.95f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v18, 0x3f666666    # 0.9f

    .line 704
    .line 705
    .line 706
    const/high16 v13, -0x41000000    # -0.5f

    .line 707
    .line 708
    const/4 v14, 0x0

    .line 709
    const v15, -0x4091eb85    # -0.93f

    .line 710
    .line 711
    .line 712
    const v16, 0x3ecccccd    # 0.4f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v17, 0x3faccccd    # 1.35f

    .line 719
    .line 720
    .line 721
    const/high16 v18, 0x40500000    # 3.25f

    .line 722
    .line 723
    const v13, -0x430a3d71    # -0.03f

    .line 724
    .line 725
    .line 726
    const v14, 0x3fa51eb8    # 1.29f

    .line 727
    .line 728
    .line 729
    const/high16 v15, 0x3f000000    # 0.5f

    .line 730
    .line 731
    const v16, 0x401b851f    # 2.43f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v17, 0x3f47ae14    # 0.78f

    .line 738
    .line 739
    .line 740
    const v18, 0x3ff1eb85    # 1.89f

    .line 741
    .line 742
    .line 743
    const v13, 0x3f1c28f6    # 0.61f

    .line 744
    .line 745
    .line 746
    const v14, 0x3f170a3d    # 0.59f

    .line 747
    .line 748
    .line 749
    const v15, 0x3f47ae14    # 0.78f

    .line 750
    .line 751
    .line 752
    const v16, 0x3fa28f5c    # 1.27f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v17, 0x3f6e147b    # 0.93f

    .line 759
    .line 760
    .line 761
    const v18, 0x3f75c28f    # 0.96f

    .line 762
    .line 763
    .line 764
    const v13, -0x43dc28f6    # -0.01f

    .line 765
    .line 766
    .line 767
    const v14, 0x3f051eb8    # 0.52f

    .line 768
    .line 769
    .line 770
    const v15, 0x3ecccccd    # 0.4f

    .line 771
    .line 772
    .line 773
    const v16, 0x3f75c28f    # 0.96f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x41987ae1    # 19.06f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v17, 0x3f70a3d7    # 0.94f

    .line 789
    .line 790
    .line 791
    const v18, -0x409c28f6    # -0.89f

    .line 792
    .line 793
    .line 794
    const/high16 v13, 0x3f000000    # 0.5f

    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    const v15, 0x3f6e147b    # 0.93f

    .line 798
    .line 799
    .line 800
    const v16, -0x413851ec    # -0.39f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, -0x40533333    # -1.35f

    .line 807
    .line 808
    .line 809
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 810
    .line 811
    const v13, 0x3d23d70a    # 0.04f

    .line 812
    .line 813
    .line 814
    const v14, -0x404ccccd    # -1.4f

    .line 815
    .line 816
    .line 817
    const v15, -0x40eb851f    # -0.58f

    .line 818
    .line 819
    .line 820
    const v16, -0x3fe147ae    # -2.48f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, -0x40bae148    # -0.77f

    .line 827
    .line 828
    .line 829
    const v18, -0x400b851f    # -1.91f

    .line 830
    .line 831
    .line 832
    const v13, -0x40d9999a    # -0.65f

    .line 833
    .line 834
    .line 835
    const v14, -0x40c7ae14    # -0.72f

    .line 836
    .line 837
    .line 838
    const v15, -0x40b33333    # -0.8f

    .line 839
    .line 840
    .line 841
    const v16, -0x405d70a4    # -1.27f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v17, -0x408f5c29    # -0.94f

    .line 848
    .line 849
    .line 850
    const v18, -0x408ccccd    # -0.95f

    .line 851
    .line 852
    .line 853
    const v13, 0x3ca3d70a    # 0.02f

    .line 854
    .line 855
    .line 856
    const v14, -0x40fae148    # -0.52f

    .line 857
    .line 858
    .line 859
    const v15, -0x412e147b    # -0.41f

    .line 860
    .line 861
    .line 862
    const v16, -0x408ccccd    # -0.95f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const v18, 0x3f666666    # 0.9f

    .line 869
    .line 870
    .line 871
    const/high16 v13, -0x41000000    # -0.5f

    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    const v15, -0x4091eb85    # -0.93f

    .line 875
    .line 876
    .line 877
    const v16, 0x3ecccccd    # 0.4f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v17, 0x3faccccd    # 1.35f

    .line 884
    .line 885
    .line 886
    const/high16 v18, 0x40500000    # 3.25f

    .line 887
    .line 888
    const v13, -0x430a3d71    # -0.03f

    .line 889
    .line 890
    .line 891
    const v14, 0x3fa51eb8    # 1.29f

    .line 892
    .line 893
    .line 894
    const/high16 v15, 0x3f000000    # 0.5f

    .line 895
    .line 896
    const v16, 0x401b851f    # 2.43f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, 0x3f47ae14    # 0.78f

    .line 903
    .line 904
    .line 905
    const v18, 0x3ff1eb85    # 1.89f

    .line 906
    .line 907
    .line 908
    const v13, 0x3f1c28f6    # 0.61f

    .line 909
    .line 910
    .line 911
    const v14, 0x3f170a3d    # 0.59f

    .line 912
    .line 913
    .line 914
    const v15, 0x3f47ae14    # 0.78f

    .line 915
    .line 916
    .line 917
    const v16, 0x3fa28f5c    # 1.27f

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v17, 0x3f6e147b    # 0.93f

    .line 924
    .line 925
    .line 926
    const v18, 0x3f75c28f    # 0.96f

    .line 927
    .line 928
    .line 929
    const v13, -0x43dc28f6    # -0.01f

    .line 930
    .line 931
    .line 932
    const v14, 0x3f051eb8    # 0.52f

    .line 933
    .line 934
    .line 935
    const v15, 0x3ecccccd    # 0.4f

    .line 936
    .line 937
    .line 938
    const v16, 0x3f75c28f    # 0.96f

    .line 939
    .line 940
    .line 941
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    const/16 v16, 0x3800

    .line 952
    .line 953
    const/16 v17, 0x0

    .line 954
    .line 955
    const/high16 v6, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const/4 v7, 0x0

    .line 958
    const/high16 v12, 0x3f800000    # 1.0f

    .line 959
    .line 960
    const/4 v13, 0x0

    .line 961
    const/4 v14, 0x0

    .line 962
    const/4 v15, 0x0

    .line 963
    const-string v4, ""

    .line 964
    .line 965
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    sput-object v0, Landroidx/compose/material/icons/rounded/HotTubKt;->_hotTub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 974
    .line 975
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0
.end method
