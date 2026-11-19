.class public final Landroidx/compose/material/icons/outlined/NoFlashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoFlash(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.NoFlash"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x40b33333    # 5.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x41a33333    # 20.4f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41b00000    # 22.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v0, 0x41980000    # 19.0f

    .line 85
    .line 86
    const/high16 v2, 0x41300000    # 11.0f

    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, 0x40e00000    # 7.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, -0x40800000    # -1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40b33333    # 5.6f

    .line 112
    .line 113
    .line 114
    const v2, 0x41a33333    # 20.4f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x41366666    # 11.4f

    .line 124
    .line 125
    .line 126
    const/high16 v2, 0x41800000    # 16.0f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    const v2, 0x3fe28f5c    # 1.77f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40000000    # 2.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x41300000    # 11.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x40333333    # -1.6f

    .line 149
    .line 150
    .line 151
    const v18, -0x40333333    # -1.6f

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const v14, -0x409eb852    # -0.88f

    .line 156
    .line 157
    .line 158
    const v15, -0x40c7ae14    # -0.72f

    .line 159
    .line 160
    .line 161
    const v16, -0x40333333    # -1.6f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x3fdd70a4    # -2.54f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x414947ae    # 12.58f

    .line 174
    .line 175
    .line 176
    const/high16 v2, 0x41000000    # 8.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, -0x40200000    # -1.75f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x4059999a    # 3.4f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41800000    # 16.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x40066666    # 2.1f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x3f30a3d7    # 0.69f

    .line 207
    .line 208
    .line 209
    const v2, 0x4060a3d7    # 3.51f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x40b51eb8    # 5.66f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x40c47ae1    # 6.14f

    .line 222
    .line 223
    .line 224
    const v2, 0x41166666    # 9.4f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x40666666    # 3.6f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x40000000    # 2.0f

    .line 237
    .line 238
    const/high16 v18, 0x41300000    # 11.0f

    .line 239
    .line 240
    const v13, 0x402e147b    # 2.72f

    .line 241
    .line 242
    .line 243
    const v14, 0x41166666    # 9.4f

    .line 244
    .line 245
    .line 246
    const/high16 v15, 0x40000000    # 2.0f

    .line 247
    .line 248
    const v16, 0x4121eb85    # 10.12f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x41166666    # 9.4f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x40666666    # 3.6f

    .line 261
    .line 262
    .line 263
    const/high16 v18, 0x41b00000    # 22.0f

    .line 264
    .line 265
    const/high16 v13, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v14, 0x41aa3d71    # 21.28f

    .line 268
    .line 269
    .line 270
    const v15, 0x402e147b    # 2.72f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x41b00000    # 22.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x414ccccd    # 12.8f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3fc66666    # 1.55f

    .line 285
    .line 286
    .line 287
    const v18, -0x4063d70a    # -1.22f

    .line 288
    .line 289
    .line 290
    const/high16 v13, 0x3f400000    # 0.75f

    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const v15, 0x3fb0a3d7    # 1.38f

    .line 294
    .line 295
    .line 296
    const v16, -0x40fae148    # -0.52f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x40228f5c    # 2.54f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x3fb47ae1    # 1.41f

    .line 309
    .line 310
    .line 311
    const v2, -0x404b851f    # -1.41f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x40066666    # 2.1f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41780000    # 15.5f

    .line 327
    .line 328
    const/high16 v2, 0x41380000    # 11.5f

    .line 329
    .line 330
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v17, -0x40400000    # -1.5f

    .line 334
    .line 335
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, 0x3f547ae1    # 0.83f

    .line 339
    .line 340
    .line 341
    const v15, -0x40d47ae1    # -0.67f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, -0x40d47ae1    # -0.67f

    .line 350
    .line 351
    .line 352
    const/high16 v2, -0x40400000    # -1.5f

    .line 353
    .line 354
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x4112b852    # 9.17f

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x41200000    # 10.0f

    .line 361
    .line 362
    const/high16 v4, 0x41600000    # 14.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x416ab852    # 14.67f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x41780000    # 15.5f

    .line 371
    .line 372
    const/high16 v4, 0x41380000    # 11.5f

    .line 373
    .line 374
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41a00000    # 20.0f

    .line 381
    .line 382
    const v2, 0x417f5c29    # 15.96f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x40800000    # 4.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x3ef66666    # -8.6f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x4008f5c3    # 2.14f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3f6147ae    # 0.88f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3f170a3d    # 0.59f

    .line 412
    .line 413
    .line 414
    const v2, -0x40d9999a    # -0.65f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3e19999a    # 0.15f

    .line 421
    .line 422
    .line 423
    const v2, -0x41dc28f6    # -0.16f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x40d00000    # 6.5f

    .line 435
    .line 436
    const/high16 v18, 0x41780000    # 15.5f

    .line 437
    .line 438
    const v13, 0x40f5c28f    # 7.68f

    .line 439
    .line 440
    .line 441
    const v14, 0x4146e148    # 12.43f

    .line 442
    .line 443
    .line 444
    const/high16 v15, 0x40d00000    # 6.5f

    .line 445
    .line 446
    const v16, 0x415d1eb8    # 13.82f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x40600000    # 3.5f

    .line 453
    .line 454
    const/high16 v18, 0x40600000    # 3.5f

    .line 455
    .line 456
    const/4 v13, 0x0

    .line 457
    const v14, 0x3ff70a3d    # 1.93f

    .line 458
    .line 459
    .line 460
    const v15, 0x3fc8f5c3    # 1.57f

    .line 461
    .line 462
    .line 463
    const/high16 v16, 0x40600000    # 3.5f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x405ae148    # 3.42f

    .line 469
    .line 470
    .line 471
    const v18, -0x3fcf5c29    # -2.76f

    .line 472
    .line 473
    .line 474
    const v13, 0x3fd70a3d    # 1.68f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const v15, 0x40447ae1    # 3.07f

    .line 479
    .line 480
    .line 481
    const v16, -0x4068f5c3    # -1.18f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x40233333    # 2.55f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41a00000    # 20.0f

    .line 494
    .line 495
    const v2, 0x417f5c29    # 15.96f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/16 v16, 0x3800

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const/high16 v6, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/high16 v8, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const/high16 v9, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/high16 v12, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v15, 0x0

    .line 523
    const-string v4, ""

    .line 524
    .line 525
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    sput-object v0, Landroidx/compose/material/icons/outlined/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 534
    .line 535
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    return-object v0
.end method
