.class public final Landroidx/compose/material/icons/sharp/ReduceCapacityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _reduceCapacity:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReduceCapacity(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ReduceCapacityKt;->_reduceCapacity:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ReduceCapacity"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4099999a    # -0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40a33333    # 5.1f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40800000    # 4.0f

    .line 115
    .line 116
    const/high16 v4, 0x41800000    # 16.0f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x41a63d71    # 20.78f

    .line 125
    .line 126
    .line 127
    const v2, 0x40f28f5c    # 7.58f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x41900000    # 18.0f

    .line 134
    .line 135
    const/high16 v18, 0x40e00000    # 7.0f

    .line 136
    .line 137
    const v13, 0x419f70a4    # 19.93f

    .line 138
    .line 139
    .line 140
    const v14, 0x40e6b852    # 7.21f

    .line 141
    .line 142
    .line 143
    const v15, 0x4197eb85    # 18.99f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40e00000    # 7.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, -0x400a3d71    # -1.92f

    .line 152
    .line 153
    .line 154
    const v18, 0x3e8f5c29    # 0.28f

    .line 155
    .line 156
    .line 157
    const v13, -0x40d47ae1    # -0.67f

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const v15, -0x405851ec    # -1.31f

    .line 162
    .line 163
    .line 164
    const v16, 0x3dcccccd    # 0.1f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x41880000    # 17.0f

    .line 171
    .line 172
    const v18, 0x4116e148    # 9.43f

    .line 173
    .line 174
    .line 175
    const v13, 0x418547ae    # 16.66f

    .line 176
    .line 177
    .line 178
    const v14, 0x40fa8f5c    # 7.83f

    .line 179
    .line 180
    .line 181
    const/high16 v15, 0x41880000    # 17.0f

    .line 182
    .line 183
    const v16, 0x4109999a    # 8.6f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41200000    # 10.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40a00000    # 5.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x4116e148    # 9.43f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x41a63d71    # 20.78f

    .line 206
    .line 207
    .line 208
    const v18, 0x40f28f5c    # 7.58f

    .line 209
    .line 210
    .line 211
    const/high16 v13, 0x41b00000    # 22.0f

    .line 212
    .line 213
    const v14, 0x4109eb85    # 8.62f

    .line 214
    .line 215
    .line 216
    const v15, 0x41ac28f6    # 21.52f

    .line 217
    .line 218
    .line 219
    const v16, 0x40fccccd    # 7.9f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40c00000    # 6.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40000000    # 2.0f

    .line 234
    .line 235
    const/high16 v18, -0x40000000    # -2.0f

    .line 236
    .line 237
    const v13, 0x3f8ccccd    # 1.1f

    .line 238
    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const/high16 v15, 0x40000000    # 2.0f

    .line 242
    .line 243
    const v16, -0x4099999a    # -0.9f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x40e33333    # 7.1f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x40c00000    # 6.0f

    .line 253
    .line 254
    const/high16 v4, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x4039999a    # 2.9f

    .line 260
    .line 261
    .line 262
    const/high16 v2, 0x40800000    # 4.0f

    .line 263
    .line 264
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x409ccccd    # 4.9f

    .line 268
    .line 269
    .line 270
    const/high16 v2, 0x40c00000    # 6.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x40fd70a4    # 7.92f

    .line 279
    .line 280
    .line 281
    const v2, 0x40e8f5c3    # 7.28f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x40c00000    # 6.0f

    .line 288
    .line 289
    const/high16 v18, 0x40e00000    # 7.0f

    .line 290
    .line 291
    const v13, 0x40e9eb85    # 7.31f

    .line 292
    .line 293
    .line 294
    const v14, 0x40e33333    # 7.1f

    .line 295
    .line 296
    .line 297
    const v15, 0x40d570a4    # 6.67f

    .line 298
    .line 299
    .line 300
    const/high16 v16, 0x40e00000    # 7.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x404e147b    # 3.22f

    .line 306
    .line 307
    .line 308
    const v18, 0x40f28f5c    # 7.58f

    .line 309
    .line 310
    .line 311
    const v13, 0x40a051ec    # 5.01f

    .line 312
    .line 313
    .line 314
    const/high16 v14, 0x40e00000    # 7.0f

    .line 315
    .line 316
    const v15, 0x40823d71    # 4.07f

    .line 317
    .line 318
    .line 319
    const v16, 0x40e6b852    # 7.21f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40000000    # 2.0f

    .line 326
    .line 327
    const v18, 0x4116e148    # 9.43f

    .line 328
    .line 329
    .line 330
    const v13, 0x401eb852    # 2.48f

    .line 331
    .line 332
    .line 333
    const v14, 0x40fccccd    # 7.9f

    .line 334
    .line 335
    .line 336
    const/high16 v15, 0x40000000    # 2.0f

    .line 337
    .line 338
    const v16, 0x4109eb85    # 8.62f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41200000    # 10.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x40a00000    # 5.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x4116e148    # 9.43f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x40fd70a4    # 7.92f

    .line 361
    .line 362
    .line 363
    const v18, 0x40e8f5c3    # 7.28f

    .line 364
    .line 365
    .line 366
    const/high16 v13, 0x40e00000    # 7.0f

    .line 367
    .line 368
    const v14, 0x4109999a    # 8.6f

    .line 369
    .line 370
    .line 371
    const v15, 0x40eae148    # 7.34f

    .line 372
    .line 373
    .line 374
    const v16, 0x40fa8f5c    # 7.83f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41200000    # 10.0f

    .line 384
    .line 385
    const/high16 v2, 0x40800000    # 4.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x40000000    # 2.0f

    .line 391
    .line 392
    const/high16 v18, -0x40000000    # -2.0f

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const v14, -0x40733333    # -1.1f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f666666    # 0.9f

    .line 399
    .line 400
    .line 401
    const/high16 v16, -0x40000000    # -2.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3f666666    # 0.9f

    .line 407
    .line 408
    .line 409
    const/high16 v2, 0x40000000    # 2.0f

    .line 410
    .line 411
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x4099999a    # -0.9f

    .line 415
    .line 416
    .line 417
    const/high16 v2, -0x40000000    # -2.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40a33333    # 5.1f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x41200000    # 10.0f

    .line 426
    .line 427
    const/high16 v4, 0x40800000    # 4.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41200000    # 10.0f

    .line 436
    .line 437
    const/high16 v2, 0x41800000    # 16.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41000000    # 8.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x4116e148    # 9.43f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x4113851f    # 9.22f

    .line 454
    .line 455
    .line 456
    const v18, 0x40f28f5c    # 7.58f

    .line 457
    .line 458
    .line 459
    const/high16 v13, 0x41000000    # 8.0f

    .line 460
    .line 461
    const v14, 0x4109eb85    # 8.62f

    .line 462
    .line 463
    .line 464
    const v15, 0x4107ae14    # 8.48f

    .line 465
    .line 466
    .line 467
    const v16, 0x40fccccd    # 7.9f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x41400000    # 12.0f

    .line 474
    .line 475
    const/high16 v18, 0x40e00000    # 7.0f

    .line 476
    .line 477
    const v13, 0x41211eb8    # 10.07f

    .line 478
    .line 479
    .line 480
    const v14, 0x40e6b852    # 7.21f

    .line 481
    .line 482
    .line 483
    const v15, 0x413028f6    # 11.01f

    .line 484
    .line 485
    .line 486
    const/high16 v16, 0x40e00000    # 7.0f

    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x4031eb85    # 2.78f

    .line 492
    .line 493
    .line 494
    const v18, 0x3f147ae1    # 0.58f

    .line 495
    .line 496
    .line 497
    const v13, 0x3f7d70a4    # 0.99f

    .line 498
    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const v15, 0x3ff70a3d    # 1.93f

    .line 502
    .line 503
    .line 504
    const v16, 0x3e570a3d    # 0.21f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x41800000    # 16.0f

    .line 511
    .line 512
    const v18, 0x4116e148    # 9.43f

    .line 513
    .line 514
    .line 515
    const v13, 0x417851ec    # 15.52f

    .line 516
    .line 517
    .line 518
    const v14, 0x40fccccd    # 7.9f

    .line 519
    .line 520
    .line 521
    const/high16 v15, 0x41800000    # 16.0f

    .line 522
    .line 523
    const v16, 0x4109eb85    # 8.62f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41200000    # 10.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x41700000    # 15.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x40000000    # 2.0f

    .line 543
    .line 544
    const/high16 v18, -0x40000000    # -2.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const v14, -0x40733333    # -1.1f

    .line 548
    .line 549
    .line 550
    const v15, 0x3f666666    # 0.9f

    .line 551
    .line 552
    .line 553
    const/high16 v16, -0x40000000    # -2.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x3f666666    # 0.9f

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, -0x4099999a    # -0.9f

    .line 567
    .line 568
    .line 569
    const/high16 v2, -0x40000000    # -2.0f

    .line 570
    .line 571
    const/high16 v4, 0x40000000    # 2.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x4188cccd    # 17.1f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x41700000    # 15.0f

    .line 580
    .line 581
    const/high16 v4, 0x41800000    # 16.0f

    .line 582
    .line 583
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x41a80000    # 21.0f

    .line 590
    .line 591
    const/high16 v2, 0x41b00000    # 22.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, -0x3f000000    # -8.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, -0x40ee147b    # -0.57f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, 0x3f9c28f6    # 1.22f

    .line 608
    .line 609
    .line 610
    const v18, -0x40133333    # -1.85f

    .line 611
    .line 612
    .line 613
    const v14, -0x40b0a3d7    # -0.81f

    .line 614
    .line 615
    .line 616
    const v15, 0x3ef5c28f    # 0.48f

    .line 617
    .line 618
    .line 619
    const v16, -0x403c28f6    # -1.53f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x41880000    # 17.0f

    .line 626
    .line 627
    const/high16 v18, 0x41980000    # 19.0f

    .line 628
    .line 629
    const v13, 0x41711eb8    # 15.07f

    .line 630
    .line 631
    .line 632
    const v14, 0x4199ae14    # 19.21f

    .line 633
    .line 634
    .line 635
    const v15, 0x4180147b    # 16.01f

    .line 636
    .line 637
    .line 638
    const/high16 v16, 0x41980000    # 19.0f

    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, 0x4031eb85    # 2.78f

    .line 644
    .line 645
    .line 646
    const v18, 0x3f147ae1    # 0.58f

    .line 647
    .line 648
    .line 649
    const v13, 0x3f7d70a4    # 0.99f

    .line 650
    .line 651
    .line 652
    const/4 v14, 0x0

    .line 653
    const v15, 0x3ff70a3d    # 1.93f

    .line 654
    .line 655
    .line 656
    const v16, 0x3e570a3d    # 0.21f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x41a80000    # 21.0f

    .line 663
    .line 664
    const v18, 0x41ab70a4    # 21.43f

    .line 665
    .line 666
    .line 667
    const v13, 0x41a428f6    # 20.52f

    .line 668
    .line 669
    .line 670
    const v14, 0x419f3333    # 19.9f

    .line 671
    .line 672
    .line 673
    const/high16 v15, 0x41a80000    # 21.0f

    .line 674
    .line 675
    const v16, 0x41a4f5c3    # 20.62f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x41b00000    # 22.0f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v0, 0x40a00000    # 5.0f

    .line 690
    .line 691
    const/high16 v2, 0x41800000    # 16.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v17, 0x40000000    # 2.0f

    .line 697
    .line 698
    const/high16 v18, -0x40000000    # -2.0f

    .line 699
    .line 700
    const/4 v13, 0x0

    .line 701
    const v14, -0x40733333    # -1.1f

    .line 702
    .line 703
    .line 704
    const v15, 0x3f666666    # 0.9f

    .line 705
    .line 706
    .line 707
    const/high16 v16, -0x40000000    # -2.0f

    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x3f666666    # 0.9f

    .line 713
    .line 714
    .line 715
    const/high16 v2, 0x40000000    # 2.0f

    .line 716
    .line 717
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, -0x4099999a    # -0.9f

    .line 721
    .line 722
    .line 723
    const/high16 v2, -0x40000000    # -2.0f

    .line 724
    .line 725
    const/high16 v4, 0x40000000    # 2.0f

    .line 726
    .line 727
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, 0x4188cccd    # 17.1f

    .line 731
    .line 732
    .line 733
    const/high16 v2, 0x40a00000    # 5.0f

    .line 734
    .line 735
    const/high16 v4, 0x41800000    # 16.0f

    .line 736
    .line 737
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, 0x41300000    # 11.0f

    .line 744
    .line 745
    const/high16 v2, 0x41b00000    # 22.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x40400000    # 3.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, -0x40ee147b    # -0.57f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, 0x3f9c28f6    # 1.22f

    .line 762
    .line 763
    .line 764
    const v18, -0x40133333    # -1.85f

    .line 765
    .line 766
    .line 767
    const v14, -0x40b0a3d7    # -0.81f

    .line 768
    .line 769
    .line 770
    const v15, 0x3ef5c28f    # 0.48f

    .line 771
    .line 772
    .line 773
    const v16, -0x403c28f6    # -1.53f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v17, 0x40e00000    # 7.0f

    .line 780
    .line 781
    const/high16 v18, 0x41980000    # 19.0f

    .line 782
    .line 783
    const v13, 0x40a23d71    # 5.07f

    .line 784
    .line 785
    .line 786
    const v14, 0x4199ae14    # 19.21f

    .line 787
    .line 788
    .line 789
    const v15, 0x40c051ec    # 6.01f

    .line 790
    .line 791
    .line 792
    const/high16 v16, 0x41980000    # 19.0f

    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x4031eb85    # 2.78f

    .line 798
    .line 799
    .line 800
    const v18, 0x3f147ae1    # 0.58f

    .line 801
    .line 802
    .line 803
    const v13, 0x3f7d70a4    # 0.99f

    .line 804
    .line 805
    .line 806
    const/4 v14, 0x0

    .line 807
    const v15, 0x3ff70a3d    # 1.93f

    .line 808
    .line 809
    .line 810
    const v16, 0x3e570a3d    # 0.21f

    .line 811
    .line 812
    .line 813
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const/high16 v17, 0x41300000    # 11.0f

    .line 817
    .line 818
    const v18, 0x41ab70a4    # 21.43f

    .line 819
    .line 820
    .line 821
    const v13, 0x412851ec    # 10.52f

    .line 822
    .line 823
    .line 824
    const v14, 0x419f3333    # 19.9f

    .line 825
    .line 826
    .line 827
    const/high16 v15, 0x41300000    # 11.0f

    .line 828
    .line 829
    const v16, 0x41a4f5c3    # 20.62f

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v0, 0x41b00000    # 22.0f

    .line 836
    .line 837
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v0, 0x41500000    # 13.0f

    .line 844
    .line 845
    const/high16 v2, 0x414c0000    # 12.75f

    .line 846
    .line 847
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v0, -0x40000000    # -2.0f

    .line 851
    .line 852
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v0, -0x40400000    # -1.5f

    .line 856
    .line 857
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const/high16 v0, 0x40000000    # 2.0f

    .line 861
    .line 862
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const/high16 v0, 0x41100000    # 9.0f

    .line 866
    .line 867
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v0, 0x40400000    # 3.0f

    .line 871
    .line 872
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 876
    .line 877
    const/high16 v2, 0x40400000    # 3.0f

    .line 878
    .line 879
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v0, 0x414c0000    # 12.75f

    .line 883
    .line 884
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    const/16 v16, 0x3800

    .line 895
    .line 896
    const/16 v17, 0x0

    .line 897
    .line 898
    const/high16 v6, 0x3f800000    # 1.0f

    .line 899
    .line 900
    const/high16 v8, 0x3f800000    # 1.0f

    .line 901
    .line 902
    const/4 v7, 0x0

    .line 903
    const/high16 v9, 0x3f800000    # 1.0f

    .line 904
    .line 905
    const/high16 v12, 0x3f800000    # 1.0f

    .line 906
    .line 907
    const/4 v13, 0x0

    .line 908
    const/4 v14, 0x0

    .line 909
    const/4 v15, 0x0

    .line 910
    const-string v4, ""

    .line 911
    .line 912
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    sput-object v0, Landroidx/compose/material/icons/sharp/ReduceCapacityKt;->_reduceCapacity:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 921
    .line 922
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    return-object v0
.end method
