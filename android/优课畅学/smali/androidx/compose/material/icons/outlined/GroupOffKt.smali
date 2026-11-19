.class public final Landroidx/compose/material/icons/outlined/GroupOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroupOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.GroupOff"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x4055c28f    # -1.33f

    .line 78
    .line 79
    .line 80
    const v18, -0x3f8f5c29    # -3.76f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x404a3d71    # -1.42f

    .line 85
    .line 86
    .line 87
    const/high16 v15, -0x41000000    # -0.5f

    .line 88
    .line 89
    const v16, -0x3fd147ae    # -2.73f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, 0x41700000    # 15.0f

    .line 96
    .line 97
    const/high16 v18, 0x40800000    # 4.0f

    .line 98
    .line 99
    const v13, 0x416170a4    # 14.09f

    .line 100
    .line 101
    .line 102
    const v14, 0x40833333    # 4.1f

    .line 103
    .line 104
    .line 105
    const v15, 0x41687ae1    # 14.53f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x40800000    # 4.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x40800000    # 4.0f

    .line 114
    .line 115
    const v13, 0x400d70a4    # 2.21f

    .line 116
    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    const/high16 v15, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v16, 0x3fe51eb8    # 1.79f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, -0x401ae148    # -1.79f

    .line 128
    .line 129
    .line 130
    const/high16 v2, -0x3f800000    # -4.0f

    .line 131
    .line 132
    const/high16 v4, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x41c7ae14    # -0.18f

    .line 138
    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const v13, -0x428a3d71    # -0.06f

    .line 143
    .line 144
    .line 145
    const v15, -0x420a3d71    # -0.12f

    .line 146
    .line 147
    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x40bae148    # -0.77f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v18, 0x41000000    # 8.0f

    .line 162
    .line 163
    const v13, 0x416a6666    # 14.65f

    .line 164
    .line 165
    .line 166
    const v14, 0x4124a3d7    # 10.29f

    .line 167
    .line 168
    .line 169
    const/high16 v15, 0x41700000    # 15.0f

    .line 170
    .line 171
    const v16, 0x4112e148    # 9.18f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x41b6a3d7    # 22.83f

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x41a00000    # 20.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41b80000    # 23.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3f351eb8    # -6.34f

    .line 199
    .line 200
    .line 201
    const v18, -0x3f8851ec    # -3.87f

    .line 202
    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    const v14, -0x3ff47ae1    # -2.18f

    .line 206
    .line 207
    .line 208
    const v15, -0x3f9ae148    # -3.58f

    .line 209
    .line 210
    .line 211
    const v16, -0x3fa1eb85    # -3.47f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x400eb852    # 2.23f

    .line 218
    .line 219
    .line 220
    const v18, 0x403c28f6    # 2.94f

    .line 221
    .line 222
    .line 223
    const v13, 0x3f8ccccd    # 1.1f

    .line 224
    .line 225
    .line 226
    const/high16 v14, 0x3f400000    # 0.75f

    .line 227
    .line 228
    const v15, 0x3ff9999a    # 1.95f

    .line 229
    .line 230
    .line 231
    const v16, 0x3fdae148    # 1.71f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x41b6a3d7    # 22.83f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v2, 0x41100000    # 9.0f

    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x410d70a4    # 8.84f

    .line 254
    .line 255
    .line 256
    const v18, 0x40c051ec    # 6.01f

    .line 257
    .line 258
    .line 259
    const v13, 0x410f0a3d    # 8.94f

    .line 260
    .line 261
    .line 262
    const/high16 v14, 0x40c00000    # 6.0f

    .line 263
    .line 264
    const v15, 0x410e3d71    # 8.89f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x40c00000    # 6.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, -0x40333333    # -1.6f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x41100000    # 9.0f

    .line 279
    .line 280
    const/high16 v18, 0x40800000    # 4.0f

    .line 281
    .line 282
    const v13, 0x40f8a3d7    # 7.77f

    .line 283
    .line 284
    .line 285
    const v14, 0x4084cccd    # 4.15f

    .line 286
    .line 287
    .line 288
    const v15, 0x4105eb85    # 8.37f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x40800000    # 4.0f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40800000    # 4.0f

    .line 297
    .line 298
    const v13, 0x400d70a4    # 2.21f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/high16 v15, 0x40800000    # 4.0f

    .line 303
    .line 304
    const v16, 0x3fe51eb8    # 1.79f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x412e147b    # -0.41f

    .line 311
    .line 312
    .line 313
    const v18, 0x3fe147ae    # 1.76f

    .line 314
    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, 0x3f2147ae    # 0.63f

    .line 318
    .line 319
    .line 320
    const v15, -0x41e66666    # -0.15f

    .line 321
    .line 322
    .line 323
    const v16, 0x3f9d70a4    # 1.23f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41300000    # 11.0f

    .line 333
    .line 334
    const/high16 v18, 0x41000000    # 8.0f

    .line 335
    .line 336
    const/high16 v13, 0x41300000    # 11.0f

    .line 337
    .line 338
    const v14, 0x4101c28f    # 8.11f

    .line 339
    .line 340
    .line 341
    const/high16 v15, 0x41300000    # 11.0f

    .line 342
    .line 343
    const v16, 0x4100f5c3    # 8.06f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41100000    # 9.0f

    .line 350
    .line 351
    const/high16 v18, 0x40c00000    # 6.0f

    .line 352
    .line 353
    const v14, 0x40dccccd    # 6.9f

    .line 354
    .line 355
    .line 356
    const v15, 0x4121999a    # 10.1f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x40c00000    # 6.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x4112b852    # 9.17f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v18, 0x41400000    # 12.0f

    .line 376
    .line 377
    const v13, 0x4111c28f    # 9.11f

    .line 378
    .line 379
    .line 380
    const/high16 v14, 0x41400000    # 12.0f

    .line 381
    .line 382
    const v15, 0x4110f5c3    # 9.06f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x41400000    # 12.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, -0x3f800000    # -4.0f

    .line 391
    .line 392
    const/high16 v18, -0x3f800000    # -4.0f

    .line 393
    .line 394
    const v13, -0x3ff28f5c    # -2.21f

    .line 395
    .line 396
    .line 397
    const/4 v14, 0x0

    .line 398
    const/high16 v15, -0x3f800000    # -4.0f

    .line 399
    .line 400
    const v16, -0x401ae148    # -1.79f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const v18, -0x41d1eb85    # -0.17f

    .line 409
    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, -0x428a3d71    # -0.06f

    .line 413
    .line 414
    .line 415
    const/4 v15, 0x0

    .line 416
    const v16, -0x421eb852    # -0.11f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3f30a3d7    # 0.69f

    .line 423
    .line 424
    .line 425
    const v2, 0x4060a3d7    # 3.51f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x40066666    # 2.1f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x419e6666    # 19.8f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x404b851f    # -1.41f

    .line 444
    .line 445
    .line 446
    const v2, 0x3fb47ae1    # 1.41f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41880000    # 17.0f

    .line 453
    .line 454
    const v2, 0x419ea3d7    # 19.83f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41a00000    # 20.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x3f800000    # 1.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x41000000    # 8.0f

    .line 476
    .line 477
    const/high16 v18, -0x3f800000    # -4.0f

    .line 478
    .line 479
    const v14, -0x3fd5c28f    # -2.66f

    .line 480
    .line 481
    .line 482
    const v15, 0x40aa8f5c    # 5.33f

    .line 483
    .line 484
    .line 485
    const/high16 v16, -0x3f800000    # -4.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 491
    .line 492
    const v18, 0x3da3d70a    # 0.08f

    .line 493
    .line 494
    .line 495
    const v13, 0x3ebd70a4    # 0.37f

    .line 496
    .line 497
    .line 498
    const/4 v14, 0x0

    .line 499
    const v15, 0x3f4ccccd    # 0.8f

    .line 500
    .line 501
    .line 502
    const v16, 0x3cf5c28f    # 0.03f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x4112b852    # 9.17f

    .line 509
    .line 510
    .line 511
    const/high16 v2, 0x41400000    # 12.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41100000    # 9.0f

    .line 520
    .line 521
    const/high16 v2, 0x41700000    # 15.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, -0x3f400000    # -6.0f

    .line 527
    .line 528
    const v18, 0x4000a3d7    # 2.01f

    .line 529
    .line 530
    .line 531
    const v13, -0x3fd33333    # -2.7f

    .line 532
    .line 533
    .line 534
    const v15, -0x3f466666    # -5.8f

    .line 535
    .line 536
    .line 537
    const v16, 0x3fa51eb8    # 1.29f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41900000    # 18.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x41400000    # 12.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x41d1eb85    # -0.17f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, -0x3ff8f5c3    # -2.11f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41100000    # 9.0f

    .line 566
    .line 567
    const/high16 v18, 0x41700000    # 15.0f

    .line 568
    .line 569
    const v13, 0x413c28f6    # 11.76f

    .line 570
    .line 571
    .line 572
    const v14, 0x4174f5c3    # 15.31f

    .line 573
    .line 574
    .line 575
    const v15, 0x412547ae    # 10.33f

    .line 576
    .line 577
    .line 578
    const/high16 v16, 0x41700000    # 15.0f

    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    const/16 v16, 0x3800

    .line 591
    .line 592
    const/16 v17, 0x0

    .line 593
    .line 594
    const/high16 v6, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v8, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const/high16 v9, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/high16 v12, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const/4 v14, 0x0

    .line 605
    const/4 v15, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    sput-object v0, Landroidx/compose/material/icons/outlined/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    return-object v0
.end method
