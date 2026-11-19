.class public final Landroidx/compose/material/icons/rounded/DiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DiningKt;->_dining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Dining"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40800000    # 4.0f

    .line 85
    .line 86
    const v13, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/high16 v15, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v16, 0x4039999a    # 2.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41800000    # 16.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, 0x3f8ccccd    # 1.1f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v18, -0x40000000    # -2.0f

    .line 122
    .line 123
    const v13, 0x3f8ccccd    # 1.1f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/high16 v15, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v16, -0x4099999a    # -0.9f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x40800000    # 4.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x41a00000    # 20.0f

    .line 141
    .line 142
    const/high16 v18, 0x40000000    # 2.0f

    .line 143
    .line 144
    const/high16 v13, 0x41b00000    # 22.0f

    .line 145
    .line 146
    const v14, 0x4039999a    # 2.9f

    .line 147
    .line 148
    .line 149
    const v15, 0x41a8cccd    # 21.1f

    .line 150
    .line 151
    .line 152
    const/high16 v16, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41300000    # 11.0f

    .line 161
    .line 162
    const v2, 0x4124cccd    # 10.3f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x40400000    # -1.5f

    .line 169
    .line 170
    const v18, 0x3ff70a3d    # 1.93f

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3f6e147b    # 0.93f

    .line 175
    .line 176
    .line 177
    const v15, -0x40dc28f6    # -0.64f

    .line 178
    .line 179
    .line 180
    const v16, 0x3fdae148    # 1.71f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40c0a3d7    # 6.02f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v17, 0x410c0000    # 8.75f

    .line 193
    .line 194
    const/high16 v18, 0x41980000    # 19.0f

    .line 195
    .line 196
    const/high16 v13, 0x41180000    # 9.5f

    .line 197
    .line 198
    const v14, 0x419547ae    # 18.66f

    .line 199
    .line 200
    .line 201
    const v15, 0x41128f5c    # 9.16f

    .line 202
    .line 203
    .line 204
    const/high16 v16, 0x41980000    # 19.0f

    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x41000000    # 8.0f

    .line 214
    .line 215
    const/high16 v18, 0x41920000    # 18.25f

    .line 216
    .line 217
    const v13, 0x410570a4    # 8.34f

    .line 218
    .line 219
    .line 220
    const/high16 v14, 0x41980000    # 19.0f

    .line 221
    .line 222
    const/high16 v15, 0x41000000    # 8.0f

    .line 223
    .line 224
    const v16, 0x419547ae    # 18.66f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x3f3f5c29    # -6.02f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, -0x40400000    # -1.5f

    .line 237
    .line 238
    const v18, -0x4008f5c3    # -1.93f

    .line 239
    .line 240
    .line 241
    const v13, -0x40a3d70a    # -0.86f

    .line 242
    .line 243
    .line 244
    const v14, -0x419eb852    # -0.22f

    .line 245
    .line 246
    .line 247
    const/high16 v15, -0x40400000    # -1.5f

    .line 248
    .line 249
    const/high16 v16, -0x40800000    # -1.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40d00000    # 6.5f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40e00000    # 7.0f

    .line 260
    .line 261
    const/high16 v18, 0x40c00000    # 6.0f

    .line 262
    .line 263
    const/high16 v13, 0x40d00000    # 6.5f

    .line 264
    .line 265
    const v14, 0x40c70a3d    # 6.22f

    .line 266
    .line 267
    .line 268
    const v15, 0x40d70a3d    # 6.72f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x40c00000    # 6.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3e6147ae    # 0.22f

    .line 277
    .line 278
    .line 279
    const/high16 v2, 0x3f000000    # 0.5f

    .line 280
    .line 281
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41100000    # 9.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x3f400000    # 0.75f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40d00000    # 6.5f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x3f000000    # 0.5f

    .line 300
    .line 301
    const/high16 v18, -0x41000000    # -0.5f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const v14, -0x4170a3d7    # -0.28f

    .line 305
    .line 306
    .line 307
    const v15, 0x3e6147ae    # 0.22f

    .line 308
    .line 309
    .line 310
    const/high16 v16, -0x41000000    # -0.5f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x3e6147ae    # 0.22f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41100000    # 9.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41200000    # 10.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40d00000    # 6.5f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x41280000    # 10.5f

    .line 337
    .line 338
    const/high16 v18, 0x40c00000    # 6.0f

    .line 339
    .line 340
    const/high16 v13, 0x41200000    # 10.0f

    .line 341
    .line 342
    const v14, 0x40c70a3d    # 6.22f

    .line 343
    .line 344
    .line 345
    const v15, 0x4123ae14    # 10.23f

    .line 346
    .line 347
    .line 348
    const/high16 v16, 0x40c00000    # 6.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x41300000    # 11.0f

    .line 354
    .line 355
    const/high16 v18, 0x40d00000    # 6.5f

    .line 356
    .line 357
    const v13, 0x412c7ae1    # 10.78f

    .line 358
    .line 359
    .line 360
    const/high16 v14, 0x40c00000    # 6.0f

    .line 361
    .line 362
    const/high16 v15, 0x41300000    # 11.0f

    .line 363
    .line 364
    const v16, 0x40c70a3d    # 6.22f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4124cccd    # 10.3f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x417947ae    # 15.58f

    .line 380
    .line 381
    .line 382
    const v2, 0x414970a4    # 12.59f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x3cf5c28f    # 0.03f

    .line 389
    .line 390
    .line 391
    const v2, -0x425c28f6    # -0.08f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x40b428f6    # 5.63f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, -0x40c00000    # -0.75f

    .line 404
    .line 405
    const/high16 v18, 0x3f400000    # 0.75f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, 0x3ed1eb85    # 0.41f

    .line 409
    .line 410
    .line 411
    const v15, -0x4151eb85    # -0.34f

    .line 412
    .line 413
    .line 414
    const/high16 v16, 0x3f400000    # 0.75f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/4 v0, 0x0

    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41600000    # 14.0f

    .line 424
    .line 425
    const/high16 v18, 0x41920000    # 18.25f

    .line 426
    .line 427
    const v13, 0x416570a4    # 14.34f

    .line 428
    .line 429
    .line 430
    const/high16 v14, 0x41980000    # 19.0f

    .line 431
    .line 432
    const/high16 v15, 0x41600000    # 14.0f

    .line 433
    .line 434
    const v16, 0x419547ae    # 18.66f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x3f4bd70a    # -5.63f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x42dc28f6    # -0.04f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x402a3d71    # -1.67f

    .line 453
    .line 454
    .line 455
    const v18, -0x3fb47ae1    # -3.18f

    .line 456
    .line 457
    .line 458
    const v13, -0x4087ae14    # -0.97f

    .line 459
    .line 460
    .line 461
    const v14, -0x410f5c29    # -0.47f

    .line 462
    .line 463
    .line 464
    const v15, -0x402a3d71    # -1.67f

    .line 465
    .line 466
    .line 467
    const v16, -0x40266666    # -1.7f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x40200000    # 2.5f

    .line 474
    .line 475
    const v18, -0x3fa66666    # -3.4f

    .line 476
    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, -0x400f5c29    # -1.88f

    .line 480
    .line 481
    .line 482
    const v15, 0x3f90a3d7    # 1.13f

    .line 483
    .line 484
    .line 485
    const v16, -0x3fa66666    # -3.4f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v18, 0x405a3d71    # 3.41f

    .line 492
    .line 493
    .line 494
    const v13, 0x3fb0a3d7    # 1.38f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, 0x40200000    # 2.5f

    .line 499
    .line 500
    const v16, 0x3fc3d70a    # 1.53f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x417947ae    # 15.58f

    .line 507
    .line 508
    .line 509
    const v18, 0x414970a4    # 12.59f

    .line 510
    .line 511
    .line 512
    const/high16 v13, 0x418a0000    # 17.25f

    .line 513
    .line 514
    const v14, 0x412e3d71    # 10.89f

    .line 515
    .line 516
    .line 517
    const v15, 0x41846666    # 16.55f

    .line 518
    .line 519
    .line 520
    const v16, 0x4141eb85    # 12.12f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v9, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v14, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    const-string v4, ""

    .line 550
    .line 551
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, Landroidx/compose/material/icons/rounded/DiningKt;->_dining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-object v0
.end method
