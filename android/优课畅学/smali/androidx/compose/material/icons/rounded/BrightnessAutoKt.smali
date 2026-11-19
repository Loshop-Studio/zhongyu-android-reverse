.class public final Landroidx/compose/material/icons/rounded/BrightnessAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _brightnessAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrightnessAuto(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BrightnessAutoKt;->_brightnessAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BrightnessAuto"

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
    const v0, 0x412d999a    # 10.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x414a6666    # 12.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40133333    # 2.3f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x41400000    # 12.0f

    .line 86
    .line 87
    const/high16 v2, 0x41100000    # 9.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v0, -0x406ccccd    # -1.15f

    .line 93
    .line 94
    .line 95
    const v2, 0x4069999a    # 3.65f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x410b0a3d    # 8.69f

    .line 105
    .line 106
    .line 107
    const/high16 v2, 0x41a00000    # 20.0f

    .line 108
    .line 109
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40c00000    # 6.0f

    .line 113
    .line 114
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, -0x40000000    # -2.0f

    .line 118
    .line 119
    const/high16 v18, -0x40000000    # -2.0f

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const v14, -0x40733333    # -1.1f

    .line 123
    .line 124
    .line 125
    const v15, -0x4099999a    # -0.9f

    .line 126
    .line 127
    .line 128
    const/high16 v16, -0x40000000    # -2.0f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x3fd3d70a    # -2.69f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x400ccccd    # -1.9f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x3fcae148    # -2.83f

    .line 146
    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const v13, -0x40b851ec    # -0.78f

    .line 151
    .line 152
    .line 153
    const v14, -0x40b851ec    # -0.78f

    .line 154
    .line 155
    .line 156
    const v15, -0x3ffccccd    # -2.05f

    .line 157
    .line 158
    .line 159
    const v16, -0x40b851ec    # -0.78f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40800000    # 4.0f

    .line 166
    .line 167
    const v2, 0x410b0a3d    # 8.69f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const/high16 v2, 0x40800000    # 4.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, -0x40000000    # -2.0f

    .line 181
    .line 182
    const/high16 v18, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v13, -0x40733333    # -1.1f

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const/high16 v15, -0x40000000    # -2.0f

    .line 189
    .line 190
    const v16, 0x3f666666    # 0.9f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x402c28f6    # 2.69f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x400ccccd    # -1.9f

    .line 203
    .line 204
    .line 205
    const v2, 0x3ff33333    # 1.9f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v18, 0x40351eb8    # 2.83f

    .line 214
    .line 215
    .line 216
    const v13, -0x40b851ec    # -0.78f

    .line 217
    .line 218
    .line 219
    const v14, 0x3f47ae14    # 0.78f

    .line 220
    .line 221
    .line 222
    const v15, -0x40b851ec    # -0.78f

    .line 223
    .line 224
    .line 225
    const v16, 0x40033333    # 2.05f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x3ff33333    # 1.9f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x41900000    # 18.0f

    .line 238
    .line 239
    const/high16 v2, 0x40800000    # 4.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40000000    # 2.0f

    .line 245
    .line 246
    const/high16 v18, 0x40000000    # 2.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, 0x3f8ccccd    # 1.1f

    .line 250
    .line 251
    .line 252
    const v15, 0x3f666666    # 0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v16, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x402c28f6    # 2.69f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x3ff33333    # 1.9f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x40351eb8    # 2.83f

    .line 273
    .line 274
    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    const v13, 0x3f47ae14    # 0.78f

    .line 278
    .line 279
    .line 280
    const v14, 0x3f47ae14    # 0.78f

    .line 281
    .line 282
    .line 283
    const v15, 0x40033333    # 2.05f

    .line 284
    .line 285
    .line 286
    const v16, 0x3f47ae14    # 0.78f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, -0x400ccccd    # -1.9f

    .line 293
    .line 294
    .line 295
    const v2, 0x3ff33333    # 1.9f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41900000    # 18.0f

    .line 302
    .line 303
    const/high16 v2, 0x41a00000    # 20.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x40000000    # 2.0f

    .line 309
    .line 310
    const/high16 v18, -0x40000000    # -2.0f

    .line 311
    .line 312
    const v13, 0x3f8ccccd    # 1.1f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/high16 v15, 0x40000000    # 2.0f

    .line 317
    .line 318
    const v16, -0x4099999a    # -0.9f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x3fd3d70a    # -2.69f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x400ccccd    # -1.9f

    .line 331
    .line 332
    .line 333
    const v2, 0x3ff33333    # 1.9f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const v18, -0x3fcae148    # -2.83f

    .line 342
    .line 343
    .line 344
    const v13, 0x3f47ae14    # 0.78f

    .line 345
    .line 346
    .line 347
    const v14, -0x40b851ec    # -0.78f

    .line 348
    .line 349
    .line 350
    const v15, 0x3f47ae14    # 0.78f

    .line 351
    .line 352
    .line 353
    const v16, -0x3ffccccd    # -2.05f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x410b0a3d    # 8.69f

    .line 360
    .line 361
    .line 362
    const/high16 v2, 0x41a00000    # 20.0f

    .line 363
    .line 364
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x416170a4    # 14.09f

    .line 371
    .line 372
    .line 373
    const v2, 0x41766666    # 15.4f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x4159999a    # 13.6f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x41600000    # 14.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x3fb33333    # -3.2f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x41051eb8    # -0.49f

    .line 394
    .line 395
    .line 396
    const v2, 0x3fb33333    # 1.4f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x40a8f5c3    # -0.84f

    .line 403
    .line 404
    .line 405
    const v18, 0x3f19999a    # 0.6f

    .line 406
    .line 407
    .line 408
    const v13, -0x41fae148    # -0.13f

    .line 409
    .line 410
    .line 411
    const v14, 0x3eb851ec    # 0.36f

    .line 412
    .line 413
    .line 414
    const v15, -0x41147ae1    # -0.46f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f19999a    # 0.6f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v18, -0x4067ae14    # -1.19f

    .line 424
    .line 425
    .line 426
    const v13, -0x40e147ae    # -0.62f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const v15, -0x4079999a    # -1.05f

    .line 431
    .line 432
    .line 433
    const v16, -0x40e3d70a    # -0.61f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, -0x3f247ae1    # -6.86f

    .line 440
    .line 441
    .line 442
    const v2, 0x401c28f6    # 2.44f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3faa3d71    # 1.33f

    .line 449
    .line 450
    .line 451
    const v18, -0x408ccccd    # -0.95f

    .line 452
    .line 453
    .line 454
    const v13, 0x3e4ccccd    # 0.2f

    .line 455
    .line 456
    .line 457
    const v14, -0x40ee147b    # -0.57f

    .line 458
    .line 459
    .line 460
    const v15, 0x3f3ae148    # 0.73f

    .line 461
    .line 462
    .line 463
    const v16, -0x408ccccd    # -0.95f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x3fab851f    # 1.34f

    .line 470
    .line 471
    .line 472
    const v18, 0x3f70a3d7    # 0.94f

    .line 473
    .line 474
    .line 475
    const v13, 0x3f19999a    # 0.6f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const v15, 0x3f90a3d7    # 1.13f

    .line 480
    .line 481
    .line 482
    const v16, 0x3ec28f5c    # 0.38f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x40db851f    # 6.86f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x40a8f5c3    # -0.84f

    .line 495
    .line 496
    .line 497
    const v18, 0x3f9851ec    # 1.19f

    .line 498
    .line 499
    .line 500
    const v13, 0x3e570a3d    # 0.21f

    .line 501
    .line 502
    .line 503
    const v14, 0x3f147ae1    # 0.58f

    .line 504
    .line 505
    .line 506
    const v15, -0x419eb852    # -0.22f

    .line 507
    .line 508
    .line 509
    const v16, 0x3f9851ec    # 1.19f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, -0x40a66666    # -0.85f

    .line 516
    .line 517
    .line 518
    const v18, -0x40e8f5c3    # -0.59f

    .line 519
    .line 520
    .line 521
    const v13, -0x413851ec    # -0.39f

    .line 522
    .line 523
    .line 524
    const v14, 0x3c23d70a    # 0.01f

    .line 525
    .line 526
    .line 527
    const v15, -0x40c7ae14    # -0.72f

    .line 528
    .line 529
    .line 530
    const v16, -0x41947ae1    # -0.23f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/16 v16, 0x3800

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v8, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v7, 0x0

    .line 552
    const/high16 v9, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v12, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const/4 v14, 0x0

    .line 558
    const/4 v15, 0x0

    .line 559
    const-string v4, ""

    .line 560
    .line 561
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sput-object v0, Landroidx/compose/material/icons/rounded/BrightnessAutoKt;->_brightnessAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v0
.end method
