.class public final Landroidx/compose/material/icons/rounded/TapAndPlayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tapAndPlay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTapAndPlay(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TapAndPlayKt;->_tapAndPlay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TapAndPlay"

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
    const v0, 0x4048f5c3    # 3.14f

    .line 71
    .line 72
    .line 73
    const v2, 0x4180b852    # 16.09f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x406e147b    # -1.14f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const v13, -0x40e66666    # -0.6f

    .line 85
    .line 86
    .line 87
    const v14, -0x42333333    # -0.1f

    .line 88
    .line 89
    .line 90
    const v15, -0x406e147b    # -1.14f

    .line 91
    .line 92
    .line 93
    const v16, 0x3ec7ae14    # 0.39f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x3f59999a    # 0.85f

    .line 100
    .line 101
    .line 102
    const v18, 0x3f7ae148    # 0.98f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3efae148    # 0.49f

    .line 107
    .line 108
    .line 109
    const v15, 0x3eb851ec    # 0.36f

    .line 110
    .line 111
    .line 112
    const v16, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x40828f5c    # 4.08f

    .line 119
    .line 120
    .line 121
    const v18, 0x40828f5c    # 4.08f

    .line 122
    .line 123
    .line 124
    const v13, 0x40051eb8    # 2.08f

    .line 125
    .line 126
    .line 127
    const v14, 0x3eb851ec    # 0.36f

    .line 128
    .line 129
    .line 130
    const v15, 0x406e147b    # 3.72f

    .line 131
    .line 132
    .line 133
    const/high16 v16, 0x40000000    # 2.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3f7ae148    # 0.98f

    .line 139
    .line 140
    .line 141
    const v18, 0x3f59999a    # 0.85f

    .line 142
    .line 143
    .line 144
    const v13, 0x3da3d70a    # 0.08f

    .line 145
    .line 146
    .line 147
    const v14, 0x3efae148    # 0.49f

    .line 148
    .line 149
    .line 150
    const v15, 0x3efae148    # 0.49f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f59999a    # 0.85f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const v18, -0x406e147b    # -1.14f

    .line 162
    .line 163
    .line 164
    const v13, 0x3f1c28f6    # 0.61f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const v15, 0x3f8b851f    # 1.09f

    .line 169
    .line 170
    .line 171
    const v16, -0x40f5c28f    # -0.54f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, -0x3f475c29    # -5.77f

    .line 178
    .line 179
    .line 180
    const v18, -0x3f475c29    # -5.77f

    .line 181
    .line 182
    .line 183
    const v13, -0x410a3d71    # -0.48f

    .line 184
    .line 185
    .line 186
    const v14, -0x3fc33333    # -2.95f

    .line 187
    .line 188
    .line 189
    const v15, -0x3fcc28f6    # -2.81f

    .line 190
    .line 191
    .line 192
    const v16, -0x3f56b852    # -5.29f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40000000    # 2.0f

    .line 202
    .line 203
    const/high16 v2, 0x41a00000    # 20.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 217
    .line 218
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const v14, -0x402b851f    # -1.66f

    .line 222
    .line 223
    .line 224
    const v15, -0x40547ae1    # -1.34f

    .line 225
    .line 226
    .line 227
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x40470a3d    # 3.11f

    .line 236
    .line 237
    .line 238
    const v2, 0x4140f5c3    # 12.06f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x4071eb85    # -1.11f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f7d70a4    # 0.99f

    .line 248
    .line 249
    .line 250
    const v13, -0x40e8f5c3    # -0.59f

    .line 251
    .line 252
    .line 253
    const v14, -0x428a3d71    # -0.06f

    .line 254
    .line 255
    .line 256
    const v15, -0x4071eb85    # -1.11f

    .line 257
    .line 258
    .line 259
    const v16, 0x3ecccccd    # 0.4f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x3f5eb852    # 0.87f

    .line 266
    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/high16 v14, 0x3f000000    # 0.5f

    .line 270
    .line 271
    const v15, 0x3ebd70a4    # 0.37f

    .line 272
    .line 273
    .line 274
    const v16, 0x3f70a3d7    # 0.94f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x410147ae    # 8.08f

    .line 281
    .line 282
    .line 283
    const v18, 0x410147ae    # 8.08f

    .line 284
    .line 285
    .line 286
    const v13, 0x4088a3d7    # 4.27f

    .line 287
    .line 288
    .line 289
    const v14, 0x3ed1eb85    # 0.41f

    .line 290
    .line 291
    .line 292
    const v15, 0x40f570a4    # 7.67f

    .line 293
    .line 294
    .line 295
    const v16, 0x4073d70a    # 3.81f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x3f7d70a4    # 0.99f

    .line 302
    .line 303
    .line 304
    const v18, 0x3f6147ae    # 0.88f

    .line 305
    .line 306
    .line 307
    const v13, 0x3d4ccccd    # 0.05f

    .line 308
    .line 309
    .line 310
    const/high16 v14, 0x3f000000    # 0.5f

    .line 311
    .line 312
    const v15, 0x3ef5c28f    # 0.48f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f6147ae    # 0.88f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const v18, -0x40733333    # -1.1f

    .line 324
    .line 325
    .line 326
    const v13, 0x3f170a3d    # 0.59f

    .line 327
    .line 328
    .line 329
    const/4 v14, 0x0

    .line 330
    const v15, 0x3f87ae14    # 1.06f

    .line 331
    .line 332
    .line 333
    const v16, -0x40fd70a4    # -0.51f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x3ee2b852    # -9.83f

    .line 340
    .line 341
    .line 342
    const v18, -0x3ee28f5c    # -9.84f

    .line 343
    .line 344
    .line 345
    const v13, -0x40fd70a4    # -0.51f

    .line 346
    .line 347
    .line 348
    const v14, -0x3f59999a    # -5.2f

    .line 349
    .line 350
    .line 351
    const v15, -0x3f6bd70a    # -4.63f

    .line 352
    .line 353
    .line 354
    const v16, -0x3eeae148    # -9.32f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x3f8147ae    # 1.01f

    .line 364
    .line 365
    .line 366
    const/high16 v2, 0x41880000    # 17.0f

    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/high16 v2, 0x40e00000    # 7.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x40000000    # -2.0f

    .line 379
    .line 380
    const/high16 v18, 0x40000000    # 2.0f

    .line 381
    .line 382
    const v13, -0x40733333    # -1.1f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const/high16 v15, -0x40000000    # -2.0f

    .line 387
    .line 388
    const v16, 0x3f666666    # 0.9f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x40ebd70a    # 7.37f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x40000000    # 2.0f

    .line 401
    .line 402
    const v18, 0x3f23d70a    # 0.64f

    .line 403
    .line 404
    .line 405
    const v13, 0x3f30a3d7    # 0.69f

    .line 406
    .line 407
    .line 408
    const v14, 0x3e23d70a    # 0.16f

    .line 409
    .line 410
    .line 411
    const v15, 0x3fae147b    # 1.36f

    .line 412
    .line 413
    .line 414
    const v16, 0x3ebd70a4    # 0.37f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40a00000    # 5.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41200000    # 10.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41500000    # 13.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x3fbe147b    # -3.03f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3f733333    # 0.95f

    .line 442
    .line 443
    .line 444
    const/high16 v18, 0x40800000    # 4.0f

    .line 445
    .line 446
    const v13, 0x3f051eb8    # 0.52f

    .line 447
    .line 448
    .line 449
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 450
    .line 451
    const v15, 0x3f570a3d    # 0.84f

    .line 452
    .line 453
    .line 454
    const v16, 0x4025c28f    # 2.59f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41b00000    # 22.0f

    .line 461
    .line 462
    const/high16 v2, 0x41880000    # 17.0f

    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x40000000    # 2.0f

    .line 468
    .line 469
    const/high16 v18, -0x40000000    # -2.0f

    .line 470
    .line 471
    const v13, 0x3f8ccccd    # 1.1f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const/high16 v15, 0x40000000    # 2.0f

    .line 476
    .line 477
    const v16, -0x4099999a    # -0.9f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41980000    # 19.0f

    .line 484
    .line 485
    const/high16 v2, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40000000    # -2.0f

    .line 491
    .line 492
    const v18, -0x400147ae    # -1.99f

    .line 493
    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    const v14, -0x40733333    # -1.1f

    .line 497
    .line 498
    .line 499
    const v15, -0x4099999a    # -0.9f

    .line 500
    .line 501
    .line 502
    const v16, -0x400147ae    # -1.99f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const/16 v16, 0x3800

    .line 516
    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v8, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const/high16 v9, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/high16 v12, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x0

    .line 530
    const-string v4, ""

    .line 531
    .line 532
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    sput-object v0, Landroidx/compose/material/icons/rounded/TapAndPlayKt;->_tapAndPlay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    return-object v0
.end method
