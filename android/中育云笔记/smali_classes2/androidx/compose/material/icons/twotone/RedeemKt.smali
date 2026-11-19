.class public final Landroidx/compose/material/icons/twotone/RedeemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _redeem:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRedeem(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RedeemKt;->_redeem:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Redeem"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41980000    # 19.0f

    .line 88
    .line 89
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x41880000    # 17.0f

    .line 96
    .line 97
    const v6, 0x412d47ae    # 10.83f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v4, 0x4176147b    # 15.38f

    .line 104
    .line 105
    .line 106
    const/high16 v6, 0x41400000    # 12.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41500000    # 13.0f

    .line 112
    .line 113
    const v6, 0x410c28f6    # 8.76f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x40eccccd    # 7.4f

    .line 120
    .line 121
    .line 122
    const/high16 v6, 0x41400000    # 12.0f

    .line 123
    .line 124
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x3fae147b    # 1.36f

    .line 128
    .line 129
    .line 130
    const/high16 v6, -0x40800000    # -1.0f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x4109eb85    # 8.62f

    .line 136
    .line 137
    .line 138
    const/high16 v6, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40e00000    # 7.0f

    .line 144
    .line 145
    const v6, 0x412d47ae    # 10.83f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x411147ae    # 9.08f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41000000    # 8.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41000000    # 8.0f

    .line 160
    .line 161
    const/high16 v6, 0x40800000    # 4.0f

    .line 162
    .line 163
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40c00000    # 6.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x41800000    # 16.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41a00000    # 20.0f

    .line 177
    .line 178
    const/high16 v6, 0x41000000    # 8.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x3f5d70a4    # -5.08f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v16, 0x3800

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const v6, 0x3e99999a    # 0.3f

    .line 201
    .line 202
    .line 203
    const v8, 0x3e99999a    # 0.3f

    .line 204
    .line 205
    .line 206
    const/4 v7, 0x0

    .line 207
    const/high16 v9, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/high16 v12, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    const-string v4, ""

    .line 215
    .line 216
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 226
    .line 227
    .line 228
    move-result-wide v6

    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v2, 0x41a00000    # 20.0f

    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x3ff47ae1    # -2.18f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x3e3851ec    # 0.18f

    .line 260
    .line 261
    .line 262
    const/high16 v18, -0x40800000    # -1.0f

    .line 263
    .line 264
    const v13, 0x3de147ae    # 0.11f

    .line 265
    .line 266
    .line 267
    const v14, -0x416147ae    # -0.31f

    .line 268
    .line 269
    .line 270
    const v15, 0x3e3851ec    # 0.18f

    .line 271
    .line 272
    .line 273
    const v16, -0x40d9999a    # -0.65f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 280
    .line 281
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const v14, -0x402b851f    # -1.66f

    .line 285
    .line 286
    .line 287
    const v15, -0x40547ae1    # -1.34f

    .line 288
    .line 289
    .line 290
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 296
    .line 297
    const v18, 0x3faccccd    # 1.35f

    .line 298
    .line 299
    .line 300
    const v13, -0x4079999a    # -1.05f

    .line 301
    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    const v15, -0x40051eb8    # -1.96f

    .line 305
    .line 306
    .line 307
    const v16, 0x3f0a3d71    # 0.54f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x3f2b851f    # 0.67f

    .line 314
    .line 315
    .line 316
    const/high16 v2, -0x41000000    # -0.5f

    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x40d1eb85    # -0.68f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x41100000    # 9.0f

    .line 328
    .line 329
    const/high16 v18, 0x40000000    # 2.0f

    .line 330
    .line 331
    const v13, 0x412f5c29    # 10.96f

    .line 332
    .line 333
    .line 334
    const v14, 0x40228f5c    # 2.54f

    .line 335
    .line 336
    .line 337
    const v15, 0x4120cccd    # 10.05f

    .line 338
    .line 339
    .line 340
    const/high16 v16, 0x40000000    # 2.0f

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40c00000    # 6.0f

    .line 346
    .line 347
    const/high16 v18, 0x40a00000    # 5.0f

    .line 348
    .line 349
    const v13, 0x40eae148    # 7.34f

    .line 350
    .line 351
    .line 352
    const/high16 v14, 0x40000000    # 2.0f

    .line 353
    .line 354
    const/high16 v15, 0x40c00000    # 6.0f

    .line 355
    .line 356
    const v16, 0x4055c28f    # 3.34f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x3e3851ec    # 0.18f

    .line 363
    .line 364
    .line 365
    const/high16 v18, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, 0x3eb33333    # 0.35f

    .line 369
    .line 370
    .line 371
    const v15, 0x3d8f5c29    # 0.07f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f30a3d7    # 0.69f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40c00000    # 6.0f

    .line 381
    .line 382
    const/high16 v2, 0x40800000    # 4.0f

    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, -0x400147ae    # -1.99f

    .line 388
    .line 389
    .line 390
    const/high16 v18, 0x40000000    # 2.0f

    .line 391
    .line 392
    const v13, -0x4071eb85    # -1.11f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const v15, -0x400147ae    # -1.99f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f63d70a    # 0.89f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x40000000    # 2.0f

    .line 406
    .line 407
    const/high16 v2, 0x41980000    # 19.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x40000000    # 2.0f

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const v14, 0x3f8e147b    # 1.11f

    .line 416
    .line 417
    .line 418
    const v15, 0x3f63d70a    # 0.89f

    .line 419
    .line 420
    .line 421
    const/high16 v16, 0x40000000    # 2.0f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x41800000    # 16.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v18, -0x40000000    # -2.0f

    .line 432
    .line 433
    const v13, 0x3f8e147b    # 1.11f

    .line 434
    .line 435
    .line 436
    const/4 v14, 0x0

    .line 437
    const/high16 v15, 0x40000000    # 2.0f

    .line 438
    .line 439
    const v16, -0x409c28f6    # -0.89f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41b00000    # 22.0f

    .line 446
    .line 447
    const/high16 v2, 0x41000000    # 8.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, -0x40000000    # -2.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, -0x4071eb85    # -1.11f

    .line 456
    .line 457
    .line 458
    const v15, -0x409c28f6    # -0.89f

    .line 459
    .line 460
    .line 461
    const/high16 v16, -0x40000000    # -2.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x41700000    # 15.0f

    .line 470
    .line 471
    const/high16 v2, 0x40800000    # 4.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v18, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const v13, 0x3f0ccccd    # 0.55f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const/high16 v15, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const v16, 0x3ee66666    # 0.45f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x4119999a    # -0.45f

    .line 493
    .line 494
    .line 495
    const/high16 v2, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/high16 v4, -0x40800000    # -1.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v2, -0x40800000    # -1.0f

    .line 503
    .line 504
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3ee66666    # 0.45f

    .line 508
    .line 509
    .line 510
    const/high16 v2, 0x3f800000    # 1.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41100000    # 9.0f

    .line 519
    .line 520
    const/high16 v2, 0x40800000    # 4.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    const/high16 v2, 0x3f800000    # 1.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v2, -0x40800000    # -1.0f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x3ee66666    # 0.45f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x3f800000    # 1.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41980000    # 19.0f

    .line 553
    .line 554
    const/high16 v2, 0x41a00000    # 20.0f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x40800000    # 4.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, -0x40000000    # -2.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x41800000    # 16.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x40000000    # 2.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41600000    # 14.0f

    .line 583
    .line 584
    const/high16 v2, 0x41a00000    # 20.0f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v2, 0x40800000    # 4.0f

    .line 590
    .line 591
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x41000000    # 8.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x40a28f5c    # 5.08f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x40e00000    # 7.0f

    .line 606
    .line 607
    const v2, 0x412d47ae    # 10.83f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x4109eb85    # 8.62f

    .line 614
    .line 615
    .line 616
    const/high16 v2, 0x41400000    # 12.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x41300000    # 11.0f

    .line 622
    .line 623
    const v2, 0x410c28f6    # 8.76f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x4051eb85    # -1.36f

    .line 630
    .line 631
    .line 632
    const/high16 v2, 0x3f800000    # 1.0f

    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x3fae147b    # 1.36f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x4176147b    # 15.38f

    .line 644
    .line 645
    .line 646
    const/high16 v2, 0x41400000    # 12.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, 0x41880000    # 17.0f

    .line 652
    .line 653
    const v2, 0x412d47ae    # 10.83f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x416eb852    # 14.92f

    .line 660
    .line 661
    .line 662
    const/high16 v2, 0x41000000    # 8.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x41a00000    # 20.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, 0x40c00000    # 6.0f

    .line 673
    .line 674
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/16 v16, 0x3800

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const/high16 v6, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/high16 v8, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    const/high16 v12, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v13, 0x0

    .line 696
    const/4 v15, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sput-object v0, Landroidx/compose/material/icons/twotone/RedeemKt;->_redeem:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v0
.end method
