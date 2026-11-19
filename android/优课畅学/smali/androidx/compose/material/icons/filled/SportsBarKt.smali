.class public final Landroidx/compose/material/icons/filled/SportsBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBar(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SportsBar"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x403851ec    # -1.56f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x41900000    # 18.0f

    .line 84
    .line 85
    const/high16 v18, 0x40e00000    # 7.0f

    .line 86
    .line 87
    const v13, 0x418e51ec    # 17.79f

    .line 88
    .line 89
    .line 90
    const v14, 0x41068f5c    # 8.41f

    .line 91
    .line 92
    .line 93
    const/high16 v15, 0x41900000    # 18.0f

    .line 94
    .line 95
    const v16, 0x40f75c29    # 7.73f

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x3f800000    # -4.0f

    .line 102
    .line 103
    const/high16 v18, -0x3f800000    # -4.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, -0x3ff28f5c    # -2.21f

    .line 107
    .line 108
    .line 109
    const v15, -0x401ae148    # -1.79f

    .line 110
    .line 111
    .line 112
    const/high16 v16, -0x3f800000    # -4.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40851eb8    # -0.98f

    .line 118
    .line 119
    .line 120
    const v18, 0x3e051eb8    # 0.13f

    .line 121
    .line 122
    .line 123
    const v13, -0x4151eb85    # -0.34f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x40d70a3d    # -0.66f

    .line 128
    .line 129
    .line 130
    const v16, 0x3d4ccccd    # 0.05f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x41200000    # 10.0f

    .line 137
    .line 138
    const v18, 0x400147ae    # 2.02f

    .line 139
    .line 140
    .line 141
    const v13, 0x41433333    # 12.2f

    .line 142
    .line 143
    .line 144
    const v14, 0x401ccccd    # 2.45f

    .line 145
    .line 146
    .line 147
    const v15, 0x41328f5c    # 11.16f

    .line 148
    .line 149
    .line 150
    const v16, 0x400147ae    # 2.02f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x3f775c29    # -4.27f

    .line 157
    .line 158
    .line 159
    const v18, 0x402d70a4    # 2.71f

    .line 160
    .line 161
    .line 162
    const v13, -0x400e147b    # -1.89f

    .line 163
    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const v15, -0x3f9f5c29    # -3.51f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f8e147b    # 1.11f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, 0x40400000    # 3.0f

    .line 176
    .line 177
    const/high16 v18, 0x41080000    # 8.5f

    .line 178
    .line 179
    const v13, 0x4084cccd    # 4.15f

    .line 180
    .line 181
    .line 182
    const v14, 0x40a851ec    # 5.26f

    .line 183
    .line 184
    .line 185
    const/high16 v15, 0x40400000    # 3.0f

    .line 186
    .line 187
    const v16, 0x40d7ae14    # 6.74f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v18, 0x40770a3d    # 3.86f

    .line 194
    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const v14, 0x3fee147b    # 1.86f

    .line 198
    .line 199
    .line 200
    const v15, 0x3fa3d70a    # 1.28f

    .line 201
    .line 202
    .line 203
    const v16, 0x405a3d71    # 3.41f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40c00000    # 6.0f

    .line 210
    .line 211
    const/high16 v2, 0x41a80000    # 21.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41300000    # 11.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, -0x40000000    # -2.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40000000    # 2.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x40000000    # 2.0f

    .line 232
    .line 233
    const/high16 v18, -0x40000000    # -2.0f

    .line 234
    .line 235
    const v13, 0x3f8ccccd    # 1.1f

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    const/high16 v15, 0x40000000    # 2.0f

    .line 240
    .line 241
    const v16, -0x4099999a    # -0.9f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, -0x3f400000    # -6.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x41980000    # 19.0f

    .line 253
    .line 254
    const/high16 v18, 0x41100000    # 9.0f

    .line 255
    .line 256
    const/high16 v13, 0x41a80000    # 21.0f

    .line 257
    .line 258
    const v14, 0x411e6666    # 9.9f

    .line 259
    .line 260
    .line 261
    const v15, 0x41a0cccd    # 20.1f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x41100000    # 9.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40e00000    # 7.0f

    .line 273
    .line 274
    const/high16 v2, 0x41280000    # 10.5f

    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, -0x40000000    # -2.0f

    .line 280
    .line 281
    const/high16 v18, -0x40000000    # -2.0f

    .line 282
    .line 283
    const v13, -0x40733333    # -1.1f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const/high16 v15, -0x40000000    # -2.0f

    .line 288
    .line 289
    const v16, -0x4099999a    # -0.9f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x3faf5c29    # 1.37f

    .line 296
    .line 297
    .line 298
    const v18, -0x400f5c29    # -1.88f

    .line 299
    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, -0x40a66666    # -0.85f

    .line 303
    .line 304
    .line 305
    const v15, 0x3f0ccccd    # 0.55f

    .line 306
    .line 307
    .line 308
    const v16, -0x40333333    # -1.6f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x3f4ccccd    # 0.8f

    .line 315
    .line 316
    .line 317
    const v2, -0x4175c28f    # -0.27f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3eb851ec    # 0.36f

    .line 324
    .line 325
    .line 326
    const v2, -0x40bd70a4    # -0.76f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41200000    # 10.0f

    .line 333
    .line 334
    const v18, 0x4080a3d7    # 4.02f

    .line 335
    .line 336
    .line 337
    const/high16 v13, 0x41000000    # 8.0f

    .line 338
    .line 339
    const v14, 0x4093d70a    # 4.62f

    .line 340
    .line 341
    .line 342
    const v15, 0x410f0a3d    # 8.94f

    .line 343
    .line 344
    .line 345
    const v16, 0x4080a3d7    # 4.02f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3fdeb852    # 1.74f

    .line 352
    .line 353
    .line 354
    const v18, 0x3f266666    # 0.65f

    .line 355
    .line 356
    .line 357
    const v13, 0x3f4a3d71    # 0.79f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const v15, 0x3fb1eb85    # 1.39f

    .line 362
    .line 363
    .line 364
    const v16, 0x3eb33333    # 0.35f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3f47ae14    # 0.78f

    .line 371
    .line 372
    .line 373
    const v2, 0x3f266666    # 0.65f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3fbc28f6    # 1.47f

    .line 380
    .line 381
    .line 382
    const v18, -0x415c28f6    # -0.32f

    .line 383
    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const v15, 0x3f23d70a    # 0.64f

    .line 387
    .line 388
    .line 389
    const v16, -0x415c28f6    # -0.32f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x40000000    # 2.0f

    .line 396
    .line 397
    const/high16 v18, 0x40000000    # 2.0f

    .line 398
    .line 399
    const v13, 0x3f8ccccd    # 1.1f

    .line 400
    .line 401
    .line 402
    const/high16 v15, 0x40000000    # 2.0f

    .line 403
    .line 404
    const v16, 0x3f666666    # 0.9f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 411
    .line 412
    const/16 v18, 0x0

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 416
    .line 417
    const/16 v16, 0x0

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, 0x40e00000    # 7.0f

    .line 423
    .line 424
    const/high16 v18, 0x41280000    # 10.5f

    .line 425
    .line 426
    const v13, 0x411ab852    # 9.67f

    .line 427
    .line 428
    .line 429
    const/high16 v14, 0x40e00000    # 7.0f

    .line 430
    .line 431
    const v15, 0x41126666    # 9.15f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x41280000    # 10.5f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41880000    # 17.0f

    .line 443
    .line 444
    const/high16 v2, 0x41980000    # 19.0f

    .line 445
    .line 446
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, -0x40000000    # -2.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, -0x3f400000    # -6.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x40000000    # 2.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41880000    # 17.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    const/16 v16, 0x3800

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/high16 v8, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const/high16 v9, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/high16 v12, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    const/4 v14, 0x0

    .line 491
    const/4 v15, 0x0

    .line 492
    const-string v4, ""

    .line 493
    .line 494
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sput-object v0, Landroidx/compose/material/icons/filled/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-object v0
.end method
