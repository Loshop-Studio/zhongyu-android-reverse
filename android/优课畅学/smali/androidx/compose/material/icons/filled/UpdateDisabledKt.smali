.class public final Landroidx/compose/material/icons/filled/UpdateDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUpdateDisabled(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/UpdateDisabledKt;->_updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.UpdateDisabled"

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
    const v0, 0x40bae148    # 5.84f

    .line 71
    .line 72
    .line 73
    const v2, 0x410ab852    # 8.67f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40e70a3d    # 7.22f

    .line 80
    .line 81
    .line 82
    const v2, 0x408c7ae1    # 4.39f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41400000    # 12.0f

    .line 89
    .line 90
    const/high16 v18, 0x40400000    # 3.0f

    .line 91
    .line 92
    const v13, 0x4109999a    # 8.6f

    .line 93
    .line 94
    .line 95
    const v14, 0x4060a3d7    # 3.51f

    .line 96
    .line 97
    .line 98
    const v15, 0x4123d70a    # 10.24f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x40400000    # 3.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v17, 0x40dae148    # 6.84f

    .line 107
    .line 108
    .line 109
    const v18, 0x404a3d71    # 3.16f

    .line 110
    .line 111
    .line 112
    const v13, 0x402f5c29    # 2.74f

    .line 113
    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const v15, 0x40a6147b    # 5.19f

    .line 117
    .line 118
    .line 119
    const v16, 0x3f9d70a4    # 1.23f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41a80000    # 21.0f

    .line 126
    .line 127
    const/high16 v2, 0x40800000    # 4.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x40c00000    # 6.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, -0x3f400000    # -6.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x401a3d71    # 2.41f

    .line 143
    .line 144
    .line 145
    const v2, -0x3fe5c28f    # -2.41f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x41400000    # 12.0f

    .line 152
    .line 153
    const/high16 v18, 0x40a00000    # 5.0f

    .line 154
    .line 155
    const v13, 0x4180f5c3    # 16.12f

    .line 156
    .line 157
    .line 158
    const v14, 0x40c0a3d7    # 6.02f

    .line 159
    .line 160
    .line 161
    const v15, 0x4162e148    # 14.18f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x40a00000    # 5.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x410ab852    # 8.67f

    .line 170
    .line 171
    .line 172
    const v18, 0x40bae148    # 5.84f

    .line 173
    .line 174
    .line 175
    const v13, 0x412ccccd    # 10.8f

    .line 176
    .line 177
    .line 178
    const/high16 v14, 0x40a00000    # 5.0f

    .line 179
    .line 180
    const v15, 0x411a8f5c    # 9.66f

    .line 181
    .line 182
    .line 183
    const v16, 0x40a9eb85    # 5.31f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x40e00000    # 7.0f

    .line 193
    .line 194
    const/high16 v2, 0x41500000    # 13.0f

    .line 195
    .line 196
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, -0x40000000    # -2.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x3f95c28f    # 1.17f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x40000000    # 2.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x40e00000    # 7.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x41b4e148    # 22.61f

    .line 224
    .line 225
    .line 226
    const v2, 0x419e3d71    # 19.78f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41400000    # 12.0f

    .line 238
    .line 239
    const/high16 v18, 0x41a80000    # 21.0f

    .line 240
    .line 241
    const v13, 0x41763d71    # 15.39f

    .line 242
    .line 243
    .line 244
    const v14, 0x41a3d70a    # 20.48f

    .line 245
    .line 246
    .line 247
    const v15, 0x415c28f6    # 13.76f

    .line 248
    .line 249
    .line 250
    const/high16 v16, 0x41a80000    # 21.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 256
    .line 257
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 258
    .line 259
    const v13, -0x3f60f5c3    # -4.97f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 264
    .line 265
    const v16, -0x3f7f0a3d    # -4.03f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x3fb1eb85    # 1.39f

    .line 272
    .line 273
    .line 274
    const v18, -0x3f670a3d    # -4.78f

    .line 275
    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const v14, -0x401eb852    # -1.76f

    .line 279
    .line 280
    .line 281
    const v15, 0x3f028f5c    # 0.51f

    .line 282
    .line 283
    .line 284
    const v16, -0x3fa66666    # -3.4f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x3fb1eb85    # 1.39f

    .line 291
    .line 292
    .line 293
    const v2, 0x40870a3d    # 4.22f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3fb47ae1    # 1.41f

    .line 300
    .line 301
    .line 302
    const v2, -0x404b851f    # -1.41f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x41930a3d    # 18.38f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x41b4e148    # 22.61f

    .line 315
    .line 316
    .line 317
    const v2, 0x419e3d71    # 19.78f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x41751eb8    # 15.32f

    .line 327
    .line 328
    .line 329
    const v2, 0x41913333    # 18.15f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x40bae148    # 5.84f

    .line 336
    .line 337
    .line 338
    const v2, 0x410ab852    # 8.67f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x40a00000    # 5.0f

    .line 345
    .line 346
    const/high16 v18, 0x41400000    # 12.0f

    .line 347
    .line 348
    const v13, 0x40a9eb85    # 5.31f

    .line 349
    .line 350
    .line 351
    const v14, 0x411a8f5c    # 9.66f

    .line 352
    .line 353
    .line 354
    const/high16 v15, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const v16, 0x412ccccd    # 10.8f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x40e00000    # 7.0f

    .line 363
    .line 364
    const/high16 v18, 0x40e00000    # 7.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, 0x40770a3d    # 3.86f

    .line 368
    .line 369
    .line 370
    const v15, 0x4048f5c3    # 3.14f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x40e00000    # 7.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x41751eb8    # 15.32f

    .line 379
    .line 380
    .line 381
    const v18, 0x41913333    # 18.15f

    .line 382
    .line 383
    .line 384
    const v13, 0x41533333    # 13.2f

    .line 385
    .line 386
    .line 387
    const/high16 v14, 0x41980000    # 19.0f

    .line 388
    .line 389
    const v15, 0x416570a4    # 14.34f

    .line 390
    .line 391
    .line 392
    const v16, 0x4195851f    # 18.69f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x41a7851f    # 20.94f

    .line 402
    .line 403
    .line 404
    const/high16 v2, 0x41500000    # 13.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, -0x3ffeb852    # -2.02f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x40bae148    # -0.77f

    .line 416
    .line 417
    .line 418
    const v18, 0x40147ae1    # 2.32f

    .line 419
    .line 420
    .line 421
    const v13, -0x420a3d71    # -0.12f

    .line 422
    .line 423
    .line 424
    const v14, 0x3f547ae1    # 0.83f

    .line 425
    .line 426
    .line 427
    const v15, -0x413851ec    # -0.39f

    .line 428
    .line 429
    .line 430
    const v16, 0x3fce147b    # 1.61f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3fbc28f6    # 1.47f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x41a7851f    # 20.94f

    .line 443
    .line 444
    .line 445
    const/high16 v18, 0x41500000    # 13.0f

    .line 446
    .line 447
    const v13, 0x41a28f5c    # 20.32f

    .line 448
    .line 449
    .line 450
    const v14, 0x417ab852    # 15.67f

    .line 451
    .line 452
    .line 453
    const v15, 0x41a651ec    # 20.79f

    .line 454
    .line 455
    .line 456
    const v16, 0x4166147b    # 14.38f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const/high16 v9, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, Landroidx/compose/material/icons/filled/UpdateDisabledKt;->_updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-object v0
.end method
