.class public final Landroidx/compose/material/icons/rounded/AddLinkKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addLink:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddLink(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddLinkKt;->_addLink:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddLink"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, -0x40800000    # -1.0f

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, 0x3f0ccccd    # 0.55f

    .line 106
    .line 107
    .line 108
    const v15, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x41100000    # 9.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v18, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v13, -0x40f33333    # -0.55f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/high16 v15, -0x40800000    # -1.0f

    .line 128
    .line 129
    const v16, -0x4119999a    # -0.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x41100000    # 9.0f

    .line 140
    .line 141
    const/high16 v18, 0x41300000    # 11.0f

    .line 142
    .line 143
    const/high16 v13, 0x41000000    # 8.0f

    .line 144
    .line 145
    const v14, 0x41373333    # 11.45f

    .line 146
    .line 147
    .line 148
    const v15, 0x41073333    # 8.45f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x41300000    # 11.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x41a770a4    # 20.93f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x41400000    # 12.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x3f6e147b    # 0.93f

    .line 171
    .line 172
    .line 173
    const v18, -0x4067ae14    # -1.19f

    .line 174
    .line 175
    .line 176
    const v13, 0x3f1eb852    # 0.62f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const v15, 0x3f88f5c3    # 1.07f

    .line 181
    .line 182
    .line 183
    const v16, -0x40e8f5c3    # -0.59f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41880000    # 17.0f

    .line 190
    .line 191
    const/high16 v18, 0x40e00000    # 7.0f

    .line 192
    .line 193
    const v13, 0x41aa8f5c    # 21.32f

    .line 194
    .line 195
    .line 196
    const v14, 0x4109eb85    # 8.62f

    .line 197
    .line 198
    .line 199
    const v15, 0x419acccd    # 19.35f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x40e00000    # 7.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x3fbccccd    # -3.05f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x41500000    # 13.0f

    .line 214
    .line 215
    const v18, 0x40fe6666    # 7.95f

    .line 216
    .line 217
    .line 218
    const v13, 0x4156e148    # 13.43f

    .line 219
    .line 220
    .line 221
    const/high16 v14, 0x40e00000    # 7.0f

    .line 222
    .line 223
    const/high16 v15, 0x41500000    # 13.0f

    .line 224
    .line 225
    const v16, 0x40edc28f    # 7.43f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3f733333    # 0.95f

    .line 236
    .line 237
    .line 238
    const v18, 0x3f733333    # 0.95f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3f051eb8    # 0.52f

    .line 243
    .line 244
    .line 245
    const v15, 0x3edc28f6    # 0.43f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f733333    # 0.95f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41880000    # 17.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x4040a3d7    # 3.01f

    .line 260
    .line 261
    .line 262
    const v18, 0x4015c28f    # 2.34f

    .line 263
    .line 264
    .line 265
    const v13, 0x3fb9999a    # 1.45f

    .line 266
    .line 267
    .line 268
    const/4 v14, 0x0

    .line 269
    const v15, 0x402ae148    # 2.67f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x41a770a4    # 20.93f

    .line 278
    .line 279
    .line 280
    const/high16 v18, 0x41400000    # 12.0f

    .line 281
    .line 282
    const v13, 0x41a0f5c3    # 20.12f

    .line 283
    .line 284
    .line 285
    const v14, 0x413ae148    # 11.68f

    .line 286
    .line 287
    .line 288
    const v15, 0x41a3d70a    # 20.48f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x41400000    # 12.0f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x407d70a4    # 3.96f

    .line 300
    .line 301
    .line 302
    const v2, 0x4136147b    # 11.38f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x40e3d70a    # 7.12f

    .line 309
    .line 310
    .line 311
    const v18, 0x410e6666    # 8.9f

    .line 312
    .line 313
    .line 314
    const v13, 0x4087ae14    # 4.24f

    .line 315
    .line 316
    .line 317
    const v14, 0x411e8f5c    # 9.91f

    .line 318
    .line 319
    .line 320
    const v15, 0x40b3d70a    # 5.62f

    .line 321
    .line 322
    .line 323
    const v16, 0x410e6666    # 8.9f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x403b851f    # 2.93f

    .line 330
    .line 331
    .line 332
    const/4 v2, 0x0

    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x41300000    # 11.0f

    .line 337
    .line 338
    const v18, 0x40fe6666    # 7.95f

    .line 339
    .line 340
    .line 341
    const v13, 0x41291eb8    # 10.57f

    .line 342
    .line 343
    .line 344
    const v14, 0x410e6666    # 8.9f

    .line 345
    .line 346
    .line 347
    const/high16 v15, 0x41300000    # 11.0f

    .line 348
    .line 349
    const v16, 0x4107851f    # 8.47f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/4 v0, 0x0

    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x4120cccd    # 10.05f

    .line 360
    .line 361
    .line 362
    const/high16 v18, 0x40e00000    # 7.0f

    .line 363
    .line 364
    const/high16 v13, 0x41300000    # 11.0f

    .line 365
    .line 366
    const v14, 0x40edc28f    # 7.43f

    .line 367
    .line 368
    .line 369
    const v15, 0x41291eb8    # 10.57f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x40e00000    # 7.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40e70a3d    # 7.22f

    .line 378
    .line 379
    .line 380
    const/high16 v2, 0x40e00000    # 7.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, -0x3f59eb85    # -5.19f

    .line 386
    .line 387
    .line 388
    const v18, 0x409051ec    # 4.51f

    .line 389
    .line 390
    .line 391
    const v13, -0x3fd8f5c3    # -2.61f

    .line 392
    .line 393
    .line 394
    const/4 v14, 0x0

    .line 395
    const v15, -0x3f61eb85    # -4.94f

    .line 396
    .line 397
    .line 398
    const v16, 0x3ff47ae1    # 1.91f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x40e00000    # 7.0f

    .line 405
    .line 406
    const/high16 v18, 0x41880000    # 17.0f

    .line 407
    .line 408
    const v13, 0x3fdeb852    # 1.74f

    .line 409
    .line 410
    .line 411
    const v14, 0x4167d70a    # 14.49f

    .line 412
    .line 413
    .line 414
    const v15, 0x40828f5c    # 4.08f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x41880000    # 17.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40433333    # 3.05f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x3f733333    # 0.95f

    .line 429
    .line 430
    .line 431
    const v18, -0x408ccccd    # -0.95f

    .line 432
    .line 433
    .line 434
    const v13, 0x3f051eb8    # 0.52f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const v15, 0x3f733333    # 0.95f

    .line 439
    .line 440
    .line 441
    const v16, -0x4123d70a    # -0.43f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/4 v0, 0x0

    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, -0x408ccccd    # -0.95f

    .line 452
    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, -0x40fae148    # -0.52f

    .line 456
    .line 457
    .line 458
    const v15, -0x4123d70a    # -0.43f

    .line 459
    .line 460
    .line 461
    const v16, -0x408ccccd    # -0.95f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40e00000    # 7.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x407d70a4    # 3.96f

    .line 473
    .line 474
    .line 475
    const v18, 0x4136147b    # 11.38f

    .line 476
    .line 477
    .line 478
    const v13, 0x40a2e148    # 5.09f

    .line 479
    .line 480
    .line 481
    const v14, 0x4171999a    # 15.1f

    .line 482
    .line 483
    .line 484
    const v15, 0x40651eb8    # 3.58f

    .line 485
    .line 486
    .line 487
    const v16, 0x4155c28f    # 13.36f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41900000    # 18.0f

    .line 497
    .line 498
    const/high16 v2, 0x41400000    # 12.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, -0x40800000    # -1.0f

    .line 507
    .line 508
    const/high16 v18, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const v13, -0x40f33333    # -0.55f

    .line 511
    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    const/high16 v15, -0x40800000    # -1.0f

    .line 515
    .line 516
    const v16, 0x3ee66666    # 0.45f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40000000    # 2.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, -0x40000000    # -2.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/4 v0, 0x0

    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v17, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const v14, 0x3f0ccccd    # 0.55f

    .line 543
    .line 544
    .line 545
    const v15, 0x3ee66666    # 0.45f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x3f800000    # 1.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x40000000    # 2.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/4 v0, 0x0

    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v18, -0x40800000    # -1.0f

    .line 569
    .line 570
    const v13, 0x3f0ccccd    # 0.55f

    .line 571
    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    const/high16 v15, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const v16, -0x4119999a    # -0.45f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, -0x40000000    # -2.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x40000000    # 2.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/4 v0, 0x0

    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v17, -0x40800000    # -1.0f

    .line 600
    .line 601
    const/4 v13, 0x0

    .line 602
    const v14, -0x40f33333    # -0.55f

    .line 603
    .line 604
    .line 605
    const v15, -0x4119999a    # -0.45f

    .line 606
    .line 607
    .line 608
    const/high16 v16, -0x40800000    # -1.0f

    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, -0x40000000    # -2.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, 0x41900000    # 18.0f

    .line 622
    .line 623
    const/high16 v18, 0x41400000    # 12.0f

    .line 624
    .line 625
    const/high16 v13, 0x41980000    # 19.0f

    .line 626
    .line 627
    const v14, 0x41473333    # 12.45f

    .line 628
    .line 629
    .line 630
    const v15, 0x41946666    # 18.55f

    .line 631
    .line 632
    .line 633
    const/high16 v16, 0x41400000    # 12.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/16 v16, 0x3800

    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    const/high16 v6, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/high16 v8, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v7, 0x0

    .line 654
    const/high16 v9, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const/4 v14, 0x0

    .line 660
    const/4 v15, 0x0

    .line 661
    const-string v4, ""

    .line 662
    .line 663
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    sput-object v0, Landroidx/compose/material/icons/rounded/AddLinkKt;->_addLink:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method
