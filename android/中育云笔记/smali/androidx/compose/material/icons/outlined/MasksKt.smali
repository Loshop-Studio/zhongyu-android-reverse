.class public final Landroidx/compose/material/icons/outlined/MasksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _masks:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMasks(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Masks"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fe147ae    # -2.48f

    .line 78
    .line 79
    .line 80
    const v18, 0x40133333    # 2.3f

    .line 81
    .line 82
    .line 83
    const v13, -0x405851ec    # -1.31f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fe851ec    # -2.37f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f8147ae    # 1.01f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v18, 0x40d00000    # 6.5f

    .line 99
    .line 100
    const v13, 0x41723d71    # 15.14f

    .line 101
    .line 102
    .line 103
    const v14, 0x40f9999a    # 7.8f

    .line 104
    .line 105
    .line 106
    const v15, 0x4162e148    # 14.18f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40d00000    # 6.5f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x3f5f5c29    # -5.02f

    .line 115
    .line 116
    .line 117
    const v18, 0x3fe66666    # 1.8f

    .line 118
    .line 119
    .line 120
    const v13, -0x3ff3d70a    # -2.19f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x3fb70a3d    # -3.14f

    .line 125
    .line 126
    .line 127
    const v16, 0x3fa66666    # 1.3f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x40900000    # 4.5f

    .line 134
    .line 135
    const/high16 v18, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v13, 0x40dbd70a    # 6.87f

    .line 138
    .line 139
    .line 140
    const v14, 0x40e0a3d7    # 7.02f

    .line 141
    .line 142
    .line 143
    const v15, 0x40b9eb85    # 5.81f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40c00000    # 6.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x40000000    # 2.0f

    .line 152
    .line 153
    const/high16 v18, 0x41080000    # 8.5f

    .line 154
    .line 155
    const v13, 0x4047ae14    # 3.12f

    .line 156
    .line 157
    .line 158
    const/high16 v14, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v15, 0x40000000    # 2.0f

    .line 161
    .line 162
    const v16, 0x40e3d70a    # 7.12f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41100000    # 9.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x40d0a3d7    # 6.52f

    .line 174
    .line 175
    .line 176
    const v18, 0x40ff5c29    # 7.98f

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const v15, 0x40666666    # 3.6f

    .line 181
    .line 182
    .line 183
    const v16, 0x40f9eb85    # 7.81f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41400000    # 12.0f

    .line 190
    .line 191
    const/high16 v18, 0x41900000    # 18.0f

    .line 192
    .line 193
    const v13, 0x41187ae1    # 9.53f

    .line 194
    .line 195
    .line 196
    const v14, 0x418cf5c3    # 17.62f

    .line 197
    .line 198
    .line 199
    const v15, 0x412b851f    # 10.72f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x41900000    # 18.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x405eb852    # 3.48f

    .line 208
    .line 209
    .line 210
    const v2, -0x407d70a4    # -1.02f

    .line 211
    .line 212
    .line 213
    const v4, 0x401e147b    # 2.47f

    .line 214
    .line 215
    .line 216
    const v6, -0x413d70a4    # -0.38f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41b00000    # 22.0f

    .line 223
    .line 224
    const/high16 v18, 0x41100000    # 9.0f

    .line 225
    .line 226
    const v13, 0x41933333    # 18.4f

    .line 227
    .line 228
    .line 229
    const v14, 0x41867ae1    # 16.81f

    .line 230
    .line 231
    .line 232
    const/high16 v15, 0x41b00000    # 22.0f

    .line 233
    .line 234
    const/high16 v16, 0x41700000    # 15.0f

    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41080000    # 8.5f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x419c0000    # 19.5f

    .line 245
    .line 246
    const/high16 v18, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v13, 0x41b00000    # 22.0f

    .line 249
    .line 250
    const v14, 0x40e3d70a    # 7.12f

    .line 251
    .line 252
    .line 253
    const v15, 0x41a70a3d    # 20.88f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x40c00000    # 6.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40600000    # 3.5f

    .line 265
    .line 266
    const/high16 v2, 0x41100000    # 9.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41080000    # 8.5f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v18, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ee66666    # 0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    const/high16 v2, 0x3f800000    # 1.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40400000    # 3.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f8147ae    # 1.01f

    .line 306
    .line 307
    .line 308
    const v18, 0x405eb852    # 3.48f

    .line 309
    .line 310
    .line 311
    const v14, 0x3fa3d70a    # 1.28f

    .line 312
    .line 313
    .line 314
    const v15, 0x3ec28f5c    # 0.38f

    .line 315
    .line 316
    .line 317
    const v16, 0x401e147b    # 2.47f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40600000    # 3.5f

    .line 324
    .line 325
    const/high16 v18, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v13, 0x409fae14    # 4.99f

    .line 328
    .line 329
    .line 330
    const v14, 0x416451ec    # 14.27f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x40600000    # 3.5f

    .line 334
    .line 335
    const v16, 0x414a6666    # 12.65f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41380000    # 11.5f

    .line 345
    .line 346
    const/high16 v2, 0x40e00000    # 7.0f

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x411d999a    # 9.85f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x402a3d71    # 2.66f

    .line 358
    .line 359
    .line 360
    const v18, -0x4075c28f    # -1.08f

    .line 361
    .line 362
    .line 363
    const v13, 0x3f8f5c29    # 1.12f

    .line 364
    .line 365
    .line 366
    const v14, -0x41947ae1    # -0.23f

    .line 367
    .line 368
    .line 369
    const v15, 0x3ff9999a    # 1.95f

    .line 370
    .line 371
    .line 372
    const v16, -0x40cf5c29    # -0.69f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41400000    # 12.0f

    .line 379
    .line 380
    const/high16 v18, 0x41000000    # 8.0f

    .line 381
    .line 382
    const v13, 0x4127ae14    # 10.48f

    .line 383
    .line 384
    .line 385
    const v14, 0x410547ae    # 8.33f

    .line 386
    .line 387
    .line 388
    const v15, 0x41311eb8    # 11.07f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x41000000    # 8.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x4015c28f    # 2.34f

    .line 397
    .line 398
    .line 399
    const v18, 0x3f47ae14    # 0.78f

    .line 400
    .line 401
    .line 402
    const v13, 0x3f6e147b    # 0.93f

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    const v15, 0x3fc28f5c    # 1.52f

    .line 407
    .line 408
    .line 409
    const v16, 0x3ea8f5c3    # 0.33f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x402a3d71    # 2.66f

    .line 416
    .line 417
    .line 418
    const v18, 0x3f8a3d71    # 1.08f

    .line 419
    .line 420
    .line 421
    const v13, 0x3f35c28f    # 0.71f

    .line 422
    .line 423
    .line 424
    const v14, 0x3ec7ae14    # 0.39f

    .line 425
    .line 426
    .line 427
    const v15, 0x3fc51eb8    # 1.54f

    .line 428
    .line 429
    .line 430
    const v16, 0x3f570a3d    # 0.84f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3fd33333    # 1.65f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, -0x3f600000    # -5.0f

    .line 443
    .line 444
    const/high16 v18, 0x40a00000    # 5.0f

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const v14, 0x4030a3d7    # 2.76f

    .line 448
    .line 449
    .line 450
    const v15, -0x3ff0a3d7    # -2.24f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40a00000    # 5.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x416428f6    # 14.26f

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x41380000    # 11.5f

    .line 462
    .line 463
    const/high16 v4, 0x40e00000    # 7.0f

    .line 464
    .line 465
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41a40000    # 20.5f

    .line 472
    .line 473
    const/high16 v2, 0x41100000    # 9.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, -0x3fbf5c29    # -3.01f

    .line 479
    .line 480
    .line 481
    const v18, 0x40bf5c29    # 5.98f

    .line 482
    .line 483
    .line 484
    const v14, 0x4069999a    # 3.65f

    .line 485
    .line 486
    .line 487
    const v15, -0x404147ae    # -1.49f

    .line 488
    .line 489
    .line 490
    const v16, 0x40a8a3d7    # 5.27f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3f8147ae    # 1.01f

    .line 497
    .line 498
    .line 499
    const v18, -0x3fa147ae    # -3.48f

    .line 500
    .line 501
    .line 502
    const v13, 0x3f23d70a    # 0.64f

    .line 503
    .line 504
    .line 505
    const v14, -0x407eb852    # -1.01f

    .line 506
    .line 507
    .line 508
    const v15, 0x3f8147ae    # 1.01f

    .line 509
    .line 510
    .line 511
    const v16, -0x3ff33333    # -2.2f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/high16 v18, -0x40800000    # -1.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const v14, -0x40f33333    # -0.55f

    .line 528
    .line 529
    .line 530
    const v15, 0x3ee66666    # 0.45f

    .line 531
    .line 532
    .line 533
    const/high16 v16, -0x40800000    # -1.0f

    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    const/high16 v2, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41100000    # 9.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x412b0a3d    # 10.69f

    .line 555
    .line 556
    .line 557
    const v2, 0x4127ae14    # 10.48f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, -0x4027ae14    # -1.69f

    .line 564
    .line 565
    .line 566
    const v18, 0x3f428f5c    # 0.76f

    .line 567
    .line 568
    .line 569
    const v13, -0x411eb852    # -0.44f

    .line 570
    .line 571
    .line 572
    const v14, 0x3e851eb8    # 0.26f

    .line 573
    .line 574
    .line 575
    const v15, -0x408a3d71    # -0.96f

    .line 576
    .line 577
    .line 578
    const v16, 0x3f0f5c29    # 0.56f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x41233333    # 10.2f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, 0x3f970a3d    # 1.18f

    .line 591
    .line 592
    .line 593
    const v18, -0x40eb851f    # -0.58f

    .line 594
    .line 595
    .line 596
    const v13, 0x3ef5c28f    # 0.48f

    .line 597
    .line 598
    .line 599
    const v14, -0x41d1eb85    # -0.17f

    .line 600
    .line 601
    .line 602
    const v15, 0x3f570a3d    # 0.84f

    .line 603
    .line 604
    .line 605
    const v16, -0x413d70a4    # -0.38f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, 0x41400000    # 12.0f

    .line 612
    .line 613
    const/high16 v18, 0x41100000    # 9.0f

    .line 614
    .line 615
    const v13, 0x412b851f    # 10.72f

    .line 616
    .line 617
    .line 618
    const v14, 0x4114cccd    # 9.3f

    .line 619
    .line 620
    .line 621
    const v15, 0x4133ae14    # 11.23f

    .line 622
    .line 623
    .line 624
    const/high16 v16, 0x41100000    # 9.0f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x3fe66666    # 1.8f

    .line 630
    .line 631
    .line 632
    const v2, 0x3f1eb852    # 0.62f

    .line 633
    .line 634
    .line 635
    const v4, 0x3fa28f5c    # 1.27f

    .line 636
    .line 637
    .line 638
    const v6, 0x3e99999a    # 0.3f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, 0x3f99999a    # 1.2f

    .line 645
    .line 646
    .line 647
    const v18, 0x3f170a3d    # 0.59f

    .line 648
    .line 649
    .line 650
    const v13, 0x3eae147b    # 0.34f

    .line 651
    .line 652
    .line 653
    const v14, 0x3e4ccccd    # 0.2f

    .line 654
    .line 655
    .line 656
    const v15, 0x3f35c28f    # 0.71f

    .line 657
    .line 658
    .line 659
    const v16, 0x3ed70a3d    # 0.42f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x3f851eb8    # 1.04f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, -0x40251eb8    # -1.71f

    .line 672
    .line 673
    .line 674
    const v18, -0x40b851ec    # -0.78f

    .line 675
    .line 676
    .line 677
    const/high16 v13, -0x40c00000    # -0.75f

    .line 678
    .line 679
    const v14, -0x41a8f5c3    # -0.21f

    .line 680
    .line 681
    .line 682
    const v15, -0x405eb852    # -1.26f

    .line 683
    .line 684
    .line 685
    const v16, -0x40fd70a4    # -0.51f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v17, 0x41400000    # 12.0f

    .line 692
    .line 693
    const/high16 v18, 0x41200000    # 10.0f

    .line 694
    .line 695
    const v13, 0x414d47ae    # 12.83f

    .line 696
    .line 697
    .line 698
    const v14, 0x41233333    # 10.2f

    .line 699
    .line 700
    .line 701
    const v15, 0x4147d70a    # 12.49f

    .line 702
    .line 703
    .line 704
    const/high16 v16, 0x41200000    # 10.0f

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x412b0a3d    # 10.69f

    .line 710
    .line 711
    .line 712
    const v18, 0x4127ae14    # 10.48f

    .line 713
    .line 714
    .line 715
    const v13, 0x413828f6    # 11.51f

    .line 716
    .line 717
    .line 718
    const/high16 v14, 0x41200000    # 10.0f

    .line 719
    .line 720
    const v15, 0x41328f5c    # 11.16f

    .line 721
    .line 722
    .line 723
    const v16, 0x41233333    # 10.2f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const/16 v16, 0x3800

    .line 737
    .line 738
    const/16 v17, 0x0

    .line 739
    .line 740
    const/high16 v6, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const/high16 v8, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v9, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/high16 v12, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/4 v13, 0x0

    .line 750
    const/4 v14, 0x0

    .line 751
    const/4 v15, 0x0

    .line 752
    const-string v4, ""

    .line 753
    .line 754
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    sput-object v0, Landroidx/compose/material/icons/outlined/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 763
    .line 764
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    return-object v0
.end method
