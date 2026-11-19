.class public final Landroidx/compose/material/icons/outlined/SportsBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBar(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsBar"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, -0x3f2bd70a    # -6.63f

    .line 83
    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v17, 0x403147ae    # 2.77f

    .line 90
    .line 91
    .line 92
    const v18, -0x400147ae    # -1.99f

    .line 93
    .line 94
    .line 95
    const v13, 0x3fa147ae    # 1.26f

    .line 96
    .line 97
    .line 98
    const v14, -0x4151eb85    # -0.34f

    .line 99
    .line 100
    .line 101
    const v15, 0x40070a3d    # 2.11f

    .line 102
    .line 103
    .line 104
    const v16, -0x405d70a4    # -1.27f

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, 0x41500000    # 13.0f

    .line 111
    .line 112
    const/high16 v18, 0x41100000    # 9.0f

    .line 113
    .line 114
    const v13, 0x4139999a    # 11.6f

    .line 115
    .line 116
    .line 117
    const v14, 0x4117851f    # 9.47f

    .line 118
    .line 119
    .line 120
    const v15, 0x414147ae    # 12.08f

    .line 121
    .line 122
    .line 123
    const/high16 v16, 0x41100000    # 9.0f

    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    const/high16 v2, 0x40000000    # 2.0f

    .line 130
    .line 131
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41980000    # 19.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x400147ae    # 2.02f

    .line 143
    .line 144
    .line 145
    const/high16 v2, 0x41200000    # 10.0f

    .line 146
    .line 147
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, -0x3f775c29    # -4.27f

    .line 151
    .line 152
    .line 153
    const v18, 0x402d70a4    # 2.71f

    .line 154
    .line 155
    .line 156
    const v13, -0x400e147b    # -1.89f

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const v15, -0x3f9f5c29    # -3.51f

    .line 161
    .line 162
    .line 163
    const v16, 0x3f8e147b    # 1.11f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40400000    # 3.0f

    .line 170
    .line 171
    const/high16 v18, 0x41080000    # 8.5f

    .line 172
    .line 173
    const v13, 0x4084cccd    # 4.15f

    .line 174
    .line 175
    .line 176
    const v14, 0x40a851ec    # 5.26f

    .line 177
    .line 178
    .line 179
    const/high16 v15, 0x40400000    # 3.0f

    .line 180
    .line 181
    const v16, 0x40d7ae14    # 6.74f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v18, 0x40770a3d    # 3.86f

    .line 188
    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const v14, 0x3fee147b    # 1.86f

    .line 192
    .line 193
    .line 194
    const v15, 0x3fa3d70a    # 1.28f

    .line 195
    .line 196
    .line 197
    const v16, 0x405a3d71    # 3.41f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41a80000    # 21.0f

    .line 204
    .line 205
    const/high16 v2, 0x40c00000    # 6.0f

    .line 206
    .line 207
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41300000    # 11.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, -0x40000000    # -2.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x40000000    # 2.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, 0x40000000    # 2.0f

    .line 226
    .line 227
    const/high16 v18, -0x40000000    # -2.0f

    .line 228
    .line 229
    const v13, 0x3f8ccccd    # 1.1f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const/high16 v15, 0x40000000    # 2.0f

    .line 234
    .line 235
    const v16, -0x4099999a    # -0.9f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, -0x3f400000    # -6.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, -0x40000000    # -2.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, -0x40733333    # -1.1f

    .line 250
    .line 251
    .line 252
    const v15, -0x4099999a    # -0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v16, -0x40000000    # -2.0f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x403851ec    # -1.56f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x41900000    # 18.0f

    .line 267
    .line 268
    const/high16 v18, 0x40e00000    # 7.0f

    .line 269
    .line 270
    const v13, 0x418e51ec    # 17.79f

    .line 271
    .line 272
    .line 273
    const v14, 0x41068f5c    # 8.41f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x41900000    # 18.0f

    .line 277
    .line 278
    const v16, 0x40f75c29    # 7.73f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, -0x3f800000    # -4.0f

    .line 285
    .line 286
    const/high16 v18, -0x3f800000    # -4.0f

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, -0x3ff28f5c    # -2.21f

    .line 290
    .line 291
    .line 292
    const v15, -0x401ae148    # -1.79f

    .line 293
    .line 294
    .line 295
    const/high16 v16, -0x3f800000    # -4.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x40851eb8    # -0.98f

    .line 301
    .line 302
    .line 303
    const v18, 0x3e051eb8    # 0.13f

    .line 304
    .line 305
    .line 306
    const v13, -0x4151eb85    # -0.34f

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const v15, -0x40d70a3d    # -0.66f

    .line 311
    .line 312
    .line 313
    const v16, 0x3d4ccccd    # 0.05f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x41200000    # 10.0f

    .line 320
    .line 321
    const v18, 0x400147ae    # 2.02f

    .line 322
    .line 323
    .line 324
    const v13, 0x41433333    # 12.2f

    .line 325
    .line 326
    .line 327
    const v14, 0x401ccccd    # 2.45f

    .line 328
    .line 329
    .line 330
    const v15, 0x41328f5c    # 11.16f

    .line 331
    .line 332
    .line 333
    const v16, 0x400147ae    # 2.02f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x400147ae    # 2.02f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x41200000    # 10.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41280000    # 10.5f

    .line 351
    .line 352
    const/high16 v2, 0x40e00000    # 7.0f

    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, -0x40000000    # -2.0f

    .line 358
    .line 359
    const/high16 v18, -0x40000000    # -2.0f

    .line 360
    .line 361
    const v13, -0x40733333    # -1.1f

    .line 362
    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    const/high16 v15, -0x40000000    # -2.0f

    .line 366
    .line 367
    const v16, -0x4099999a    # -0.9f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, 0x3faf5c29    # 1.37f

    .line 374
    .line 375
    .line 376
    const v18, -0x400f5c29    # -1.88f

    .line 377
    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const v14, -0x40a66666    # -0.85f

    .line 381
    .line 382
    .line 383
    const v15, 0x3f0ccccd    # 0.55f

    .line 384
    .line 385
    .line 386
    const v16, -0x40333333    # -1.6f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3f4ccccd    # 0.8f

    .line 393
    .line 394
    .line 395
    const v2, -0x4175c28f    # -0.27f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x3eb851ec    # 0.36f

    .line 402
    .line 403
    .line 404
    const v2, -0x40bd70a4    # -0.76f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x41200000    # 10.0f

    .line 411
    .line 412
    const v18, 0x4080a3d7    # 4.02f

    .line 413
    .line 414
    .line 415
    const/high16 v13, 0x41000000    # 8.0f

    .line 416
    .line 417
    const v14, 0x4093d70a    # 4.62f

    .line 418
    .line 419
    .line 420
    const v15, 0x410f0a3d    # 8.94f

    .line 421
    .line 422
    .line 423
    const v16, 0x4080a3d7    # 4.02f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x3fdeb852    # 1.74f

    .line 430
    .line 431
    .line 432
    const v18, 0x3f266666    # 0.65f

    .line 433
    .line 434
    .line 435
    const v13, 0x3f4a3d71    # 0.79f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const v15, 0x3fb1eb85    # 1.39f

    .line 440
    .line 441
    .line 442
    const v16, 0x3eb33333    # 0.35f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3f47ae14    # 0.78f

    .line 449
    .line 450
    .line 451
    const v2, 0x3f266666    # 0.65f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3fbc28f6    # 1.47f

    .line 458
    .line 459
    .line 460
    const v18, -0x415c28f6    # -0.32f

    .line 461
    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const v15, 0x3f23d70a    # 0.64f

    .line 465
    .line 466
    .line 467
    const v16, -0x415c28f6    # -0.32f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x40000000    # 2.0f

    .line 474
    .line 475
    const/high16 v18, 0x40000000    # 2.0f

    .line 476
    .line 477
    const v13, 0x3f8ccccd    # 1.1f

    .line 478
    .line 479
    .line 480
    const/high16 v15, 0x40000000    # 2.0f

    .line 481
    .line 482
    const v16, 0x3f666666    # 0.9f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 494
    .line 495
    const/16 v16, 0x0

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x40e00000    # 7.0f

    .line 501
    .line 502
    const/high16 v18, 0x41280000    # 10.5f

    .line 503
    .line 504
    const v13, 0x411ab852    # 9.67f

    .line 505
    .line 506
    .line 507
    const/high16 v14, 0x40e00000    # 7.0f

    .line 508
    .line 509
    const v15, 0x41126666    # 9.15f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x41280000    # 10.5f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v13, 0x40e00000    # 7.0f

    .line 518
    .line 519
    const/high16 v14, 0x41280000    # 10.5f

    .line 520
    .line 521
    const/high16 v15, 0x40e00000    # 7.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41280000    # 10.5f

    .line 527
    .line 528
    const/high16 v2, 0x40e00000    # 7.0f

    .line 529
    .line 530
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41880000    # 17.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, -0x3f400000    # -6.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x40000000    # 2.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x40c00000    # 6.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41880000    # 17.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/16 v16, 0x3800

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    const/high16 v6, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v8, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/4 v7, 0x0

    .line 580
    const/high16 v9, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/high16 v12, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    const/4 v14, 0x0

    .line 586
    const/4 v15, 0x0

    .line 587
    const-string v4, ""

    .line 588
    .line 589
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsBarKt;->_sportsBar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    return-object v0
.end method
