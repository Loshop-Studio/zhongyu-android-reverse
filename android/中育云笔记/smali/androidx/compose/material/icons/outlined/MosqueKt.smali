.class public final Landroidx/compose/material/icons/outlined/MosqueKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mosque:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMosque(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MosqueKt;->_mosque:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Mosque"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 88
    .line 89
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v0, 0x3ff33333    # 1.9f

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x40400000    # 3.0f

    .line 96
    .line 97
    const/high16 v4, -0x40000000    # -2.0f

    .line 98
    .line 99
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x3f800000    # 1.0f

    .line 103
    .line 104
    const v18, 0x3fdc28f6    # 1.72f

    .line 105
    .line 106
    .line 107
    const v14, 0x3f3d70a4    # 0.74f

    .line 108
    .line 109
    .line 110
    const v15, 0x3ecccccd    # 0.4f

    .line 111
    .line 112
    .line 113
    const v16, 0x3fb0a3d7    # 1.38f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41500000    # 13.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x40000000    # -2.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x4039999a    # -1.55f

    .line 133
    .line 134
    .line 135
    const v18, -0x4007ae14    # -1.94f

    .line 136
    .line 137
    .line 138
    const v14, -0x408ccccd    # -0.95f

    .line 139
    .line 140
    .line 141
    const v15, -0x40d70a3d    # -0.66f

    .line 142
    .line 143
    .line 144
    const v16, -0x402147ae    # -1.74f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41900000    # 18.0f

    .line 151
    .line 152
    const v18, 0x40e2e148    # 7.09f

    .line 153
    .line 154
    .line 155
    const v13, 0x418e51ec    # 17.79f

    .line 156
    .line 157
    .line 158
    const v14, 0x4107ae14    # 8.48f

    .line 159
    .line 160
    .line 161
    const/high16 v15, 0x41900000    # 18.0f

    .line 162
    .line 163
    const v16, 0x40f9eb85    # 7.81f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x402147ae    # -1.74f

    .line 170
    .line 171
    .line 172
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 173
    .line 174
    const/4 v13, 0x0

    .line 175
    const v14, -0x405851ec    # -1.31f

    .line 176
    .line 177
    .line 178
    const v15, -0x40d9999a    # -0.65f

    .line 179
    .line 180
    .line 181
    const v16, -0x3fde147b    # -2.53f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41400000    # 12.0f

    .line 188
    .line 189
    const/high16 v2, 0x3f800000    # 1.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x40f7ae14    # 7.74f

    .line 195
    .line 196
    .line 197
    const v2, 0x4075c28f    # 3.84f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v17, 0x40c00000    # 6.0f

    .line 204
    .line 205
    const v18, 0x40e2e148    # 7.09f

    .line 206
    .line 207
    .line 208
    const v13, 0x40d4cccd    # 6.65f

    .line 209
    .line 210
    .line 211
    const v14, 0x4091eb85    # 4.56f

    .line 212
    .line 213
    .line 214
    const/high16 v15, 0x40c00000    # 6.0f

    .line 215
    .line 216
    const v16, 0x40b8f5c3    # 5.78f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x3f0ccccd    # 0.55f

    .line 223
    .line 224
    .line 225
    const v18, 0x3ffae148    # 1.96f

    .line 226
    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x3f3851ec    # 0.72f

    .line 230
    .line 231
    .line 232
    const v15, 0x3e570a3d    # 0.21f

    .line 233
    .line 234
    .line 235
    const v16, 0x3fb1eb85    # 1.39f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40a00000    # 5.0f

    .line 242
    .line 243
    const/high16 v18, 0x41300000    # 11.0f

    .line 244
    .line 245
    const v13, 0x40b51eb8    # 5.66f

    .line 246
    .line 247
    .line 248
    const v14, 0x411428f6    # 9.26f

    .line 249
    .line 250
    .line 251
    const/high16 v15, 0x40a00000    # 5.0f

    .line 252
    .line 253
    const v16, 0x4120cccd    # 10.05f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40000000    # 2.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40400000    # 3.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x410b851f    # 8.72f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x40800000    # 4.0f

    .line 276
    .line 277
    const/high16 v18, 0x40e00000    # 7.0f

    .line 278
    .line 279
    const v13, 0x40666666    # 3.6f

    .line 280
    .line 281
    .line 282
    const v14, 0x4106147b    # 8.38f

    .line 283
    .line 284
    .line 285
    const/high16 v15, 0x40800000    # 4.0f

    .line 286
    .line 287
    const v16, 0x40f7ae14    # 7.74f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, -0x40000000    # -2.0f

    .line 294
    .line 295
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const v14, -0x40733333    # -1.1f

    .line 299
    .line 300
    .line 301
    const/high16 v15, -0x40000000    # -2.0f

    .line 302
    .line 303
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40bccccd    # 5.9f

    .line 309
    .line 310
    .line 311
    const/4 v2, 0x0

    .line 312
    const/high16 v4, 0x40e00000    # 7.0f

    .line 313
    .line 314
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const v18, 0x3fdc28f6    # 1.72f

    .line 320
    .line 321
    .line 322
    const v14, 0x3f3d70a4    # 0.74f

    .line 323
    .line 324
    .line 325
    const v15, 0x3ecccccd    # 0.4f

    .line 326
    .line 327
    .line 328
    const v16, 0x3fb0a3d7    # 1.38f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41a80000    # 21.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41200000    # 10.0f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, -0x3f800000    # -4.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v18, -0x40800000    # -1.0f

    .line 350
    .line 351
    const v14, -0x40f33333    # -0.55f

    .line 352
    .line 353
    .line 354
    const v15, 0x3ee66666    # 0.45f

    .line 355
    .line 356
    .line 357
    const/high16 v16, -0x40800000    # -1.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x3ee66666    # 0.45f

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x3f800000    # 1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40800000    # 4.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41200000    # 10.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x410b851f    # 8.72f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41c00000    # 24.0f

    .line 387
    .line 388
    const/high16 v18, 0x40e00000    # 7.0f

    .line 389
    .line 390
    const v13, 0x41bccccd    # 23.6f

    .line 391
    .line 392
    .line 393
    const v14, 0x4106147b    # 8.38f

    .line 394
    .line 395
    .line 396
    const/high16 v15, 0x41c00000    # 24.0f

    .line 397
    .line 398
    const v16, 0x40f7ae14    # 7.74f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x410d999a    # 8.85f

    .line 408
    .line 409
    .line 410
    const/high16 v2, 0x40b00000    # 5.5f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x4059999a    # 3.4f

    .line 416
    .line 417
    .line 418
    const/high16 v2, 0x41400000    # 12.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4049999a    # 3.15f

    .line 424
    .line 425
    .line 426
    const v2, 0x40066666    # 2.1f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41800000    # 16.0f

    .line 433
    .line 434
    const v18, 0x40e2e148    # 7.09f

    .line 435
    .line 436
    .line 437
    const v13, 0x417ae148    # 15.68f

    .line 438
    .line 439
    .line 440
    const v14, 0x40bb851f    # 5.86f

    .line 441
    .line 442
    .line 443
    const/high16 v15, 0x41800000    # 16.0f

    .line 444
    .line 445
    const v16, 0x40ce6666    # 6.45f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x416170a4    # 14.09f

    .line 452
    .line 453
    .line 454
    const/high16 v18, 0x41100000    # 9.0f

    .line 455
    .line 456
    const/high16 v13, 0x41800000    # 16.0f

    .line 457
    .line 458
    const v14, 0x41023d71    # 8.14f

    .line 459
    .line 460
    .line 461
    const v15, 0x41723d71    # 15.14f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x41100000    # 9.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x411e8f5c    # 9.91f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x41000000    # 8.0f

    .line 476
    .line 477
    const v18, 0x40e2e148    # 7.09f

    .line 478
    .line 479
    .line 480
    const v13, 0x410dc28f    # 8.86f

    .line 481
    .line 482
    .line 483
    const/high16 v14, 0x41100000    # 9.0f

    .line 484
    .line 485
    const/high16 v15, 0x41000000    # 8.0f

    .line 486
    .line 487
    const v16, 0x41023d71    # 8.14f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x410d999a    # 8.85f

    .line 494
    .line 495
    .line 496
    const/high16 v18, 0x40b00000    # 5.5f

    .line 497
    .line 498
    const/high16 v13, 0x41000000    # 8.0f

    .line 499
    .line 500
    const v14, 0x40ce6666    # 6.45f

    .line 501
    .line 502
    .line 503
    const v15, 0x41051eb8    # 8.32f

    .line 504
    .line 505
    .line 506
    const v16, 0x40bb851f    # 5.86f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41980000    # 19.0f

    .line 516
    .line 517
    const/high16 v2, 0x41a80000    # 21.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, -0x3f400000    # -6.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, -0x40000000    # -2.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 533
    .line 534
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 535
    .line 536
    const/4 v13, 0x0

    .line 537
    const v14, -0x402ccccd    # -1.65f

    .line 538
    .line 539
    .line 540
    const v15, -0x40533333    # -1.35f

    .line 541
    .line 542
    .line 543
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v18, 0x40400000    # 3.0f

    .line 549
    .line 550
    const v13, -0x402ccccd    # -1.65f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 555
    .line 556
    const v16, 0x3faccccd    # 1.35f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x40000000    # 2.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40400000    # 3.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, -0x3f800000    # -4.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40800000    # 4.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, -0x3f800000    # -4.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41200000    # 10.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40800000    # 4.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x41980000    # 19.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/16 v16, 0x3800

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const/high16 v6, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v8, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const/high16 v9, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v12, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const/4 v15, 0x0

    .line 627
    const-string v4, ""

    .line 628
    .line 629
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    sput-object v0, Landroidx/compose/material/icons/outlined/MosqueKt;->_mosque:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 638
    .line 639
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-object v0
.end method
