.class public final Landroidx/compose/material/icons/rounded/UsbOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _usbOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUsbOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UsbOffKt;->_usbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.UsbOff"

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
    const v0, 0x4119999a    # 9.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x40a66666    # 5.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fd51eb8    # -2.67f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x3f4ccccd    # 0.8f

    .line 88
    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const v13, 0x3e4ccccd    # 0.2f

    .line 93
    .line 94
    .line 95
    const v14, -0x4175c28f    # -0.27f

    .line 96
    .line 97
    .line 98
    const v15, 0x3f19999a    # 0.6f

    .line 99
    .line 100
    .line 101
    const v16, -0x4175c28f    # -0.27f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x402ae148    # 2.67f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x41600000    # 14.0f

    .line 114
    .line 115
    const/high16 v18, 0x40c00000    # 6.0f

    .line 116
    .line 117
    const v13, 0x416a6666    # 14.65f

    .line 118
    .line 119
    .line 120
    const v14, 0x40b0f5c3    # 5.53f

    .line 121
    .line 122
    .line 123
    const v15, 0x41668f5c    # 14.41f

    .line 124
    .line 125
    .line 126
    const/high16 v16, 0x40c00000    # 6.0f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x408570a4    # 4.17f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x40000000    # -2.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x40c00000    # 6.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, -0x40800000    # -1.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x4119999a    # 9.6f

    .line 158
    .line 159
    .line 160
    const v18, 0x40a66666    # 5.2f

    .line 161
    .line 162
    .line 163
    const v13, 0x411970a4    # 9.59f

    .line 164
    .line 165
    .line 166
    const/high16 v14, 0x40c00000    # 6.0f

    .line 167
    .line 168
    const v15, 0x4115999a    # 9.35f

    .line 169
    .line 170
    .line 171
    const v16, 0x40b0f5c3    # 5.53f

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 181
    .line 182
    const/high16 v2, 0x41400000    # 12.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41800000    # 16.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3f95c28f    # 1.17f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x3fe28f5c    # 1.77f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41900000    # 18.0f

    .line 205
    .line 206
    const/high16 v18, 0x41600000    # 14.0f

    .line 207
    .line 208
    const v13, 0x418f47ae    # 17.91f

    .line 209
    .line 210
    .line 211
    const v14, 0x416a8f5c    # 14.66f

    .line 212
    .line 213
    .line 214
    const/high16 v15, 0x41900000    # 18.0f

    .line 215
    .line 216
    const v16, 0x416570a4    # 14.34f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, -0x40000000    # -2.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x3f000000    # 0.5f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x3f000000    # 0.5f

    .line 233
    .line 234
    const/high16 v18, -0x41000000    # -0.5f

    .line 235
    .line 236
    const v13, 0x3e8f5c29    # 0.28f

    .line 237
    .line 238
    .line 239
    const/4 v14, 0x0

    .line 240
    const/high16 v15, 0x3f000000    # 0.5f

    .line 241
    .line 242
    const v16, -0x419eb852    # -0.22f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x41940000    # 18.5f

    .line 254
    .line 255
    const/high16 v18, 0x41000000    # 8.0f

    .line 256
    .line 257
    const/high16 v13, 0x41980000    # 19.0f

    .line 258
    .line 259
    const v14, 0x4103851f    # 8.22f

    .line 260
    .line 261
    .line 262
    const v15, 0x41963d71    # 18.78f

    .line 263
    .line 264
    .line 265
    const/high16 v16, 0x41000000    # 8.0f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x41700000    # 15.0f

    .line 274
    .line 275
    const/high16 v18, 0x41080000    # 8.5f

    .line 276
    .line 277
    const v13, 0x4173851f    # 15.22f

    .line 278
    .line 279
    .line 280
    const/high16 v14, 0x41000000    # 8.0f

    .line 281
    .line 282
    const/high16 v15, 0x41700000    # 15.0f

    .line 283
    .line 284
    const v16, 0x4103851f    # 8.22f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40400000    # 3.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, 0x41780000    # 15.5f

    .line 296
    .line 297
    const/high16 v18, 0x41400000    # 12.0f

    .line 298
    .line 299
    const/high16 v13, 0x41700000    # 15.0f

    .line 300
    .line 301
    const v14, 0x413c7ae1    # 11.78f

    .line 302
    .line 303
    .line 304
    const v15, 0x4173851f    # 15.22f

    .line 305
    .line 306
    .line 307
    const/high16 v16, 0x41400000    # 12.0f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x41af3333    # 21.9f

    .line 316
    .line 317
    .line 318
    const v2, 0x41a3eb85    # 20.49f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x404b851f    # -1.41f

    .line 328
    .line 329
    .line 330
    const/16 v18, 0x0

    .line 331
    .line 332
    const v13, -0x413851ec    # -0.39f

    .line 333
    .line 334
    .line 335
    const v14, 0x3ec7ae14    # 0.39f

    .line 336
    .line 337
    .line 338
    const v15, -0x407d70a4    # -1.02f

    .line 339
    .line 340
    .line 341
    const v16, 0x3ec7ae14    # 0.39f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x3f433333    # -5.9f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41500000    # 13.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x4011eb85    # 2.28f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const v18, 0x3fdc28f6    # 1.72f

    .line 367
    .line 368
    .line 369
    const v13, 0x3f19999a    # 0.6f

    .line 370
    .line 371
    .line 372
    const v14, 0x3eae147b    # 0.34f

    .line 373
    .line 374
    .line 375
    const/high16 v15, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const v16, 0x3f7ae148    # 0.98f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, -0x3fec28f6    # -2.31f

    .line 384
    .line 385
    .line 386
    const v18, 0x3ffd70a4    # 1.98f

    .line 387
    .line 388
    .line 389
    const/4 v13, 0x0

    .line 390
    const v14, 0x3f99999a    # 1.2f

    .line 391
    .line 392
    .line 393
    const v15, -0x40770a3d    # -1.07f

    .line 394
    .line 395
    .line 396
    const v16, 0x400a3d71    # 2.16f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x4028f5c3    # -1.68f

    .line 403
    .line 404
    .line 405
    const v18, -0x401d70a4    # -1.77f

    .line 406
    .line 407
    .line 408
    const v13, -0x409eb852    # -0.88f

    .line 409
    .line 410
    .line 411
    const v14, -0x41fae148    # -0.13f

    .line 412
    .line 413
    .line 414
    const v15, -0x40347ae1    # -1.59f

    .line 415
    .line 416
    .line 417
    const v16, -0x409eb852    # -0.88f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, 0x3f7d70a4    # 0.99f

    .line 424
    .line 425
    .line 426
    const v18, -0x4008f5c3    # -1.93f

    .line 427
    .line 428
    .line 429
    const v13, -0x425c28f6    # -0.08f

    .line 430
    .line 431
    .line 432
    const v14, -0x40ab851f    # -0.83f

    .line 433
    .line 434
    .line 435
    const v15, 0x3ea8f5c3    # 0.33f

    .line 436
    .line 437
    .line 438
    const v16, -0x4039999a    # -1.55f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41800000    # 16.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41000000    # 8.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, -0x40000000    # -2.0f

    .line 455
    .line 456
    const/high16 v18, -0x40000000    # -2.0f

    .line 457
    .line 458
    const v13, -0x40733333    # -1.1f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const/high16 v15, -0x40000000    # -2.0f

    .line 463
    .line 464
    const v16, -0x4099999a    # -0.9f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x3fee147b    # -2.28f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x40a00000    # 5.0f

    .line 477
    .line 478
    const/high16 v18, 0x41200000    # 10.0f

    .line 479
    .line 480
    const v13, 0x40accccd    # 5.4f

    .line 481
    .line 482
    .line 483
    const v14, 0x4136147b    # 11.38f

    .line 484
    .line 485
    .line 486
    const/high16 v15, 0x40a00000    # 5.0f

    .line 487
    .line 488
    const v16, 0x412bd70a    # 10.74f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x3f2e147b    # 0.68f

    .line 495
    .line 496
    .line 497
    const/high16 v18, -0x40400000    # -1.5f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const v14, -0x40e8f5c3    # -0.59f

    .line 501
    .line 502
    .line 503
    const v15, 0x3e851eb8    # 0.26f

    .line 504
    .line 505
    .line 506
    const v16, -0x406f5c29    # -1.13f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x40066666    # 2.1f

    .line 513
    .line 514
    .line 515
    const v2, 0x409dc28f    # 4.93f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const v18, -0x404b851f    # -1.41f

    .line 524
    .line 525
    .line 526
    const v13, -0x413851ec    # -0.39f

    .line 527
    .line 528
    .line 529
    const v14, -0x413851ec    # -0.39f

    .line 530
    .line 531
    .line 532
    const v15, -0x413851ec    # -0.39f

    .line 533
    .line 534
    .line 535
    const v16, -0x407d70a4    # -1.02f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3fb47ae1    # 1.41f

    .line 542
    .line 543
    .line 544
    const/16 v18, 0x0

    .line 545
    .line 546
    const v13, 0x3ec7ae14    # 0.39f

    .line 547
    .line 548
    .line 549
    const v15, 0x3f828f5c    # 1.02f

    .line 550
    .line 551
    .line 552
    const v16, -0x413851ec    # -0.39f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x4187c28f    # 16.97f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, 0x41a3eb85    # 20.49f

    .line 565
    .line 566
    .line 567
    const v18, 0x41af3333    # 21.9f

    .line 568
    .line 569
    .line 570
    const v13, 0x41a70a3d    # 20.88f

    .line 571
    .line 572
    .line 573
    const v14, 0x41a70a3d    # 20.88f

    .line 574
    .line 575
    .line 576
    const v15, 0x41a70a3d    # 20.88f

    .line 577
    .line 578
    .line 579
    const v16, 0x41ac147b    # 21.51f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41300000    # 11.0f

    .line 589
    .line 590
    const v2, 0x415d47ae    # 13.83f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x3fdf5c29    # -2.51f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, -0x41051eb8    # -0.49f

    .line 603
    .line 604
    .line 605
    const v18, 0x3ecccccd    # 0.4f

    .line 606
    .line 607
    .line 608
    const v13, -0x41f0a3d7    # -0.14f

    .line 609
    .line 610
    .line 611
    const v14, 0x3e23d70a    # 0.16f

    .line 612
    .line 613
    .line 614
    const v15, -0x416147ae    # -0.31f

    .line 615
    .line 616
    .line 617
    const v16, 0x3e947ae1    # 0.29f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x41600000    # 14.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40400000    # 3.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, 0x415d47ae    # 13.83f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/16 v16, 0x3800

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/high16 v6, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/high16 v8, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v7, 0x0

    .line 655
    const/high16 v9, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/high16 v12, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v13, 0x0

    .line 660
    const/4 v14, 0x0

    .line 661
    const/4 v15, 0x0

    .line 662
    const-string v4, ""

    .line 663
    .line 664
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    sput-object v0, Landroidx/compose/material/icons/rounded/UsbOffKt;->_usbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 673
    .line 674
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    return-object v0
.end method
