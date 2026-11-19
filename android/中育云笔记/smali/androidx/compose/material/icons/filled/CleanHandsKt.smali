.class public final Landroidx/compose/material/icons/filled/CleanHandsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCleanHands(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.CleanHands"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const v2, 0x4187eb85    # 16.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x3faf5c29    # 1.37f

    .line 79
    .line 80
    .line 81
    const v2, 0x3f2147ae    # 0.63f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, 0x4197eb85    # 18.99f

    .line 88
    .line 89
    .line 90
    const/high16 v2, 0x40e00000    # 7.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, -0x4050a3d7    # -1.37f

    .line 96
    .line 97
    .line 98
    const v2, 0x3f2147ae    # 0.63f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41100000    # 9.0f

    .line 105
    .line 106
    const v2, 0x4187eb85    # 16.99f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x40deb852    # -0.63f

    .line 113
    .line 114
    .line 115
    const v2, -0x4050a3d7    # -1.37f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x416fd70a    # 14.99f

    .line 122
    .line 123
    .line 124
    const/high16 v2, 0x40e00000    # 7.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, -0x40deb852    # -0.63f

    .line 130
    .line 131
    .line 132
    const v2, 0x3faf5c29    # 1.37f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40a00000    # 5.0f

    .line 139
    .line 140
    const v2, 0x4187eb85    # 16.99f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40c428f6    # 6.13f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41300000    # 11.0f

    .line 150
    .line 151
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x3fc66666    # 1.55f

    .line 165
    .line 166
    .line 167
    const v18, 0x3ee66666    # 0.45f

    .line 168
    .line 169
    .line 170
    const v13, 0x3f11eb85    # 0.57f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const v15, 0x3f8ccccd    # 1.1f

    .line 175
    .line 176
    .line 177
    const v16, 0x3e2e147b    # 0.17f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x3fb70a3d    # 1.43f

    .line 184
    .line 185
    .line 186
    const v2, -0x4048f5c3    # -1.43f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v17, 0x41500000    # 13.0f

    .line 193
    .line 194
    const/high16 v18, 0x40000000    # 2.0f

    .line 195
    .line 196
    const v13, 0x41726666    # 15.15f

    .line 197
    .line 198
    .line 199
    const v14, 0x4018f5c3    # 2.39f

    .line 200
    .line 201
    .line 202
    const v15, 0x4162147b    # 14.13f

    .line 203
    .line 204
    .line 205
    const/high16 v16, 0x40000000    # 2.0f

    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x3f500000    # -5.5f

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const v13, -0x40428f5c    # -1.48f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/high16 v15, -0x3f500000    # -5.5f

    .line 219
    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40000000    # 2.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41100000    # 9.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x4008f5c3    # 2.14f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x40a851ec    # 5.26f

    .line 242
    .line 243
    .line 244
    const/high16 v18, 0x41180000    # 9.5f

    .line 245
    .line 246
    const v13, 0x40e75c29    # 7.23f

    .line 247
    .line 248
    .line 249
    const v14, 0x40d051ec    # 6.51f

    .line 250
    .line 251
    .line 252
    const v15, 0x40b9eb85    # 5.81f

    .line 253
    .line 254
    .line 255
    const v16, 0x40f9999a    # 7.8f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x407eb852    # 3.98f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41700000    # 15.0f

    .line 268
    .line 269
    const v2, 0x413a6666    # 11.65f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x40e147ae    # -0.62f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x41300000    # 11.0f

    .line 282
    .line 283
    const v18, 0x40c428f6    # 6.13f

    .line 284
    .line 285
    .line 286
    const/high16 v13, 0x41700000    # 15.0f

    .line 287
    .line 288
    const v14, 0x4109c28f    # 8.61f

    .line 289
    .line 290
    .line 291
    const v15, 0x41547ae1    # 13.28f

    .line 292
    .line 293
    .line 294
    const v16, 0x40d2e148    # 6.59f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v2, 0x41b00000    # 22.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x40800000    # 4.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41300000    # 11.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x3f800000    # 1.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x41b00000    # 22.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41880000    # 17.0f

    .line 334
    .line 335
    const/high16 v2, 0x41a00000    # 20.0f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, -0x3f200000    # -7.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x3ffa3d71    # -2.09f

    .line 346
    .line 347
    .line 348
    const v2, -0x40c51eb8    # -0.73f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3ea8f5c3    # 0.33f

    .line 355
    .line 356
    .line 357
    const v2, -0x408f5c29    # -0.94f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41500000    # 13.0f

    .line 364
    .line 365
    const/high16 v2, 0x41800000    # 16.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x40347ae1    # 2.82f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3f970a3d    # 1.18f

    .line 377
    .line 378
    .line 379
    const v18, -0x4068f5c3    # -1.18f

    .line 380
    .line 381
    .line 382
    const v13, 0x3f266666    # 0.65f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const v15, 0x3f970a3d    # 1.18f

    .line 387
    .line 388
    .line 389
    const v16, -0x40f851ec    # -0.53f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/4 v0, 0x0

    .line 396
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, -0x40bae148    # -0.77f

    .line 400
    .line 401
    .line 402
    const v18, -0x4071eb85    # -1.11f

    .line 403
    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const v14, -0x41051eb8    # -0.49f

    .line 407
    .line 408
    .line 409
    const v15, -0x416147ae    # -0.31f

    .line 410
    .line 411
    .line 412
    const v16, -0x4091eb85    # -0.93f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x410f851f    # 8.97f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x41300000    # 11.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x40e00000    # 7.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x411051ec    # 9.02f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41600000    # 14.0f

    .line 438
    .line 439
    const/high16 v2, 0x41b00000    # 22.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41000000    # 8.0f

    .line 445
    .line 446
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/4 v0, 0x0

    .line 452
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, 0x41a00000    # 20.0f

    .line 456
    .line 457
    const/high16 v18, 0x41880000    # 17.0f

    .line 458
    .line 459
    const v13, 0x41afeb85    # 21.99f

    .line 460
    .line 461
    .line 462
    const v14, 0x418f3333    # 17.9f

    .line 463
    .line 464
    .line 465
    const v15, 0x41a8e148    # 21.11f

    .line 466
    .line 467
    .line 468
    const/high16 v16, 0x41880000    # 17.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41600000    # 14.0f

    .line 477
    .line 478
    const/high16 v2, 0x41a00000    # 20.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x40000000    # 2.0f

    .line 484
    .line 485
    const/high16 v18, -0x40000000    # -2.0f

    .line 486
    .line 487
    const v13, 0x3f8ccccd    # 1.1f

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const/high16 v15, 0x40000000    # 2.0f

    .line 492
    .line 493
    const v16, -0x4099999a    # -0.9f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, -0x40000000    # -2.0f

    .line 500
    .line 501
    const/high16 v18, -0x3f800000    # -4.0f

    .line 502
    .line 503
    const/4 v13, 0x0

    .line 504
    const v14, -0x40733333    # -1.1f

    .line 505
    .line 506
    .line 507
    const/high16 v15, -0x40000000    # -2.0f

    .line 508
    .line 509
    const/high16 v16, -0x3f800000    # -4.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x4039999a    # 2.9f

    .line 515
    .line 516
    .line 517
    const/high16 v2, -0x40000000    # -2.0f

    .line 518
    .line 519
    const/high16 v4, 0x40800000    # 4.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x41a00000    # 20.0f

    .line 525
    .line 526
    const/high16 v18, 0x41600000    # 14.0f

    .line 527
    .line 528
    const/high16 v13, 0x41900000    # 18.0f

    .line 529
    .line 530
    const v14, 0x4151999a    # 13.1f

    .line 531
    .line 532
    .line 533
    const v15, 0x41973333    # 18.9f

    .line 534
    .line 535
    .line 536
    const/high16 v16, 0x41600000    # 14.0f

    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v8, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    sput-object v0, Landroidx/compose/material/icons/filled/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0
.end method
