.class public final Landroidx/compose/material/icons/rounded/LiquorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _liquor:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLiquor(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LiquorKt;->_liquor:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Liquor"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const v26, 0x40347ae1    # 2.82f

    .line 80
    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const v22, 0x3fa66666    # 1.3f

    .line 85
    .line 86
    .line 87
    const v23, 0x3f570a3d    # 0.84f

    .line 88
    .line 89
    .line 90
    const v24, 0x4019999a    # 2.4f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41a00000    # 20.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, -0x40800000    # -1.0f

    .line 109
    .line 110
    const/high16 v26, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const v21, -0x40f33333    # -0.55f

    .line 113
    .line 114
    .line 115
    const/16 v22, 0x0

    .line 116
    .line 117
    const/high16 v23, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v24, 0x3ee66666    # 0.45f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const v22, 0x3f0ccccd    # 0.55f

    .line 134
    .line 135
    .line 136
    const v23, 0x3ee66666    # 0.45f

    .line 137
    .line 138
    .line 139
    const/high16 v24, 0x3f800000    # 1.0f

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v26, -0x40800000    # -1.0f

    .line 150
    .line 151
    const v21, 0x3f0ccccd    # 0.55f

    .line 152
    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/high16 v23, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const v24, -0x4119999a    # -0.45f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/4 v4, 0x0

    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, -0x40800000    # -1.0f

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const v22, -0x40f33333    # -0.55f

    .line 173
    .line 174
    .line 175
    const v23, -0x4119999a    # -0.45f

    .line 176
    .line 177
    .line 178
    const/high16 v24, -0x40800000    # -1.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x40e00000    # 7.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, -0x3fb47ae1    # -3.18f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x41100000    # 9.0f

    .line 195
    .line 196
    const/high16 v26, 0x41600000    # 14.0f

    .line 197
    .line 198
    const v21, 0x41028f5c    # 8.16f

    .line 199
    .line 200
    .line 201
    const v22, 0x41833333    # 16.4f

    .line 202
    .line 203
    .line 204
    const/high16 v23, 0x41100000    # 9.0f

    .line 205
    .line 206
    const v24, 0x4174cccd    # 15.3f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40e00000    # 7.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, -0x40800000    # -1.0f

    .line 218
    .line 219
    const/high16 v26, -0x40800000    # -1.0f

    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const v22, -0x40f33333    # -0.55f

    .line 224
    .line 225
    .line 226
    const v23, -0x4119999a    # -0.45f

    .line 227
    .line 228
    .line 229
    const/high16 v24, -0x40800000    # -1.0f

    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x40800000    # 4.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v25, 0x40400000    # 3.0f

    .line 240
    .line 241
    const/high16 v26, 0x40e00000    # 7.0f

    .line 242
    .line 243
    const v21, 0x405ccccd    # 3.45f

    .line 244
    .line 245
    .line 246
    const/high16 v22, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v23, 0x40400000    # 3.0f

    .line 249
    .line 250
    const v24, 0x40ce6666    # 6.45f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41600000    # 14.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41000000    # 8.0f

    .line 265
    .line 266
    const/high16 v6, 0x40a00000    # 5.0f

    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x40400000    # 3.0f

    .line 277
    .line 278
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v4, 0x40a00000    # 5.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x41000000    # 8.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const/16 v16, 0x3800

    .line 299
    .line 300
    const/16 v17, 0x0

    .line 301
    .line 302
    const/high16 v6, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/high16 v8, 0x3f800000    # 1.0f

    .line 305
    .line 306
    const/4 v7, 0x0

    .line 307
    const/high16 v9, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v12, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v14, 0x0

    .line 313
    const/4 v15, 0x0

    .line 314
    const-string v4, ""

    .line 315
    .line 316
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 317
    .line 318
    .line 319
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 326
    .line 327
    .line 328
    move-result-wide v6

    .line 329
    const/4 v0, 0x0

    .line 330
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    const v0, 0x41a51eb8    # 20.64f

    .line 347
    .line 348
    .line 349
    const v2, 0x4108a3d7    # 8.54f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x415c28f6    # -0.32f

    .line 356
    .line 357
    .line 358
    const v2, -0x408a3d71    # -0.96f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41980000    # 19.0f

    .line 365
    .line 366
    const v18, 0x40e8a3d7    # 7.27f

    .line 367
    .line 368
    .line 369
    const v13, 0x419a28f6    # 19.27f

    .line 370
    .line 371
    .line 372
    const v14, 0x410147ae    # 8.08f

    .line 373
    .line 374
    .line 375
    const/high16 v15, 0x41980000    # 19.0f

    .line 376
    .line 377
    const v16, 0x40f66666    # 7.7f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40400000    # 3.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, -0x40800000    # -1.0f

    .line 389
    .line 390
    const/high16 v18, -0x40800000    # -1.0f

    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const v14, -0x40f33333    # -0.55f

    .line 394
    .line 395
    .line 396
    const v15, -0x4119999a    # -0.45f

    .line 397
    .line 398
    .line 399
    const/high16 v16, -0x40800000    # -1.0f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v18, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const v13, -0x40f33333    # -0.55f

    .line 412
    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const/high16 v15, -0x40800000    # -1.0f

    .line 416
    .line 417
    const v16, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4088f5c3    # 4.28f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x40d1eb85    # -0.68f

    .line 430
    .line 431
    .line 432
    const v18, 0x3f733333    # 0.95f

    .line 433
    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const v14, 0x3edc28f6    # 0.43f

    .line 437
    .line 438
    .line 439
    const v15, -0x4175c28f    # -0.27f

    .line 440
    .line 441
    .line 442
    const v16, 0x3f4f5c29    # 0.81f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3ea3d70a    # 0.32f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41300000    # 11.0f

    .line 455
    .line 456
    const v18, 0x41273333    # 10.45f

    .line 457
    .line 458
    .line 459
    const v13, 0x4138cccd    # 11.55f

    .line 460
    .line 461
    .line 462
    const v14, 0x410d47ae    # 8.83f

    .line 463
    .line 464
    .line 465
    const/high16 v15, 0x41300000    # 11.0f

    .line 466
    .line 467
    const v16, 0x411970a4    # 9.59f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41a00000    # 20.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, 0x40000000    # 2.0f

    .line 479
    .line 480
    const/high16 v18, 0x40000000    # 2.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const v14, 0x3f8ccccd    # 1.1f

    .line 484
    .line 485
    .line 486
    const v15, 0x3f666666    # 0.9f

    .line 487
    .line 488
    .line 489
    const/high16 v16, 0x40000000    # 2.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x40e00000    # 7.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v18, -0x40000000    # -2.0f

    .line 500
    .line 501
    const v13, 0x3f8ccccd    # 1.1f

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const/high16 v15, 0x40000000    # 2.0f

    .line 506
    .line 507
    const v16, -0x4099999a    # -0.9f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x3ee70a3d    # -9.56f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x41a51eb8    # 20.64f

    .line 520
    .line 521
    .line 522
    const v18, 0x4108a3d7    # 8.54f

    .line 523
    .line 524
    .line 525
    const/high16 v13, 0x41b00000    # 22.0f

    .line 526
    .line 527
    const v14, 0x411947ae    # 9.58f

    .line 528
    .line 529
    .line 530
    const v15, 0x41ab999a    # 21.45f

    .line 531
    .line 532
    .line 533
    const v16, 0x410d1eb8    # 8.82f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v0, 0x41800000    # 16.0f

    .line 543
    .line 544
    const/high16 v2, 0x40800000    # 4.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x40800000    # -1.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x40800000    # 4.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x41500000    # 13.0f

    .line 571
    .line 572
    const v2, 0x41270a3d    # 10.44f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x3f733333    # 0.95f

    .line 579
    .line 580
    .line 581
    const v2, -0x415c28f6    # -0.32f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v17, 0x41800000    # 16.0f

    .line 588
    .line 589
    const v18, 0x40e8f5c3    # 7.28f

    .line 590
    .line 591
    .line 592
    const v13, 0x4172e148    # 15.18f

    .line 593
    .line 594
    .line 595
    const v14, 0x411b851f    # 9.72f

    .line 596
    .line 597
    .line 598
    const/high16 v15, 0x41800000    # 16.0f

    .line 599
    .line 600
    const v16, 0x41091eb8    # 8.57f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x40e00000    # 7.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x3f800000    # 1.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x3e8f5c29    # 0.28f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x40033333    # 2.05f

    .line 623
    .line 624
    .line 625
    const v18, 0x40366666    # 2.85f

    .line 626
    .line 627
    .line 628
    const/4 v13, 0x0

    .line 629
    const v14, 0x3fa51eb8    # 1.29f

    .line 630
    .line 631
    .line 632
    const v15, 0x3f51eb85    # 0.82f

    .line 633
    .line 634
    .line 635
    const v16, 0x401c28f6    # 2.44f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x41270a3d    # 10.44f

    .line 642
    .line 643
    .line 644
    const/high16 v2, 0x41a00000    # 20.0f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41400000    # 12.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v0, -0x3f200000    # -7.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x41270a3d    # 10.44f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x41a00000    # 20.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, -0x3f200000    # -7.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, -0x40000000    # -2.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x40e00000    # 7.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x41a00000    # 20.0f

    .line 689
    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const/high16 v12, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    const/4 v15, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    sput-object v0, Landroidx/compose/material/icons/rounded/LiquorKt;->_liquor:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    return-object v0
.end method
