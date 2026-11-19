.class public final Landroidx/compose/material/icons/rounded/WhatsappKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _whatsapp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWhatsapp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WhatsappKt;->_whatsapp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Whatsapp"

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
    const v0, 0x41986666    # 19.05f

    .line 71
    .line 72
    .line 73
    const v2, 0x409d1eb8    # 4.91f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4140a3d7    # 12.04f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x40000000    # 2.0f

    .line 83
    .line 84
    const v13, 0x418970a4    # 17.18f

    .line 85
    .line 86
    .line 87
    const v14, 0x4041eb85    # 3.03f

    .line 88
    .line 89
    .line 90
    const v15, 0x416b0a3d    # 14.69f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x40000000    # 2.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3ee170a4    # -9.91f

    .line 99
    .line 100
    .line 101
    const v18, 0x411e8f5c    # 9.91f

    .line 102
    .line 103
    .line 104
    const v13, -0x3f5147ae    # -5.46f

    .line 105
    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    const v15, -0x3ee170a4    # -9.91f

    .line 109
    .line 110
    .line 111
    const v16, 0x408e6666    # 4.45f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3fa8f5c3    # 1.32f

    .line 118
    .line 119
    .line 120
    const v18, 0x409e6666    # 4.95f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 125
    .line 126
    const v15, 0x3eeb851f    # 0.46f

    .line 127
    .line 128
    .line 129
    const v16, 0x405ccccd    # 3.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x40033333    # 2.05f

    .line 136
    .line 137
    .line 138
    const/high16 v2, 0x41b00000    # 22.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x40a80000    # 5.25f

    .line 144
    .line 145
    const v2, -0x404f5c29    # -1.38f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, 0x4097ae14    # 4.74f

    .line 152
    .line 153
    .line 154
    const v18, 0x3f9ae148    # 1.21f

    .line 155
    .line 156
    .line 157
    const v13, 0x3fb9999a    # 1.45f

    .line 158
    .line 159
    .line 160
    const v14, 0x3f4a3d71    # 0.79f

    .line 161
    .line 162
    .line 163
    const v15, 0x40451eb8    # 3.08f

    .line 164
    .line 165
    .line 166
    const v16, 0x3f9ae148    # 1.21f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x411e8f5c    # 9.91f

    .line 189
    .line 190
    .line 191
    const v18, -0x3ee170a4    # -9.91f

    .line 192
    .line 193
    .line 194
    const v13, 0x40aeb852    # 5.46f

    .line 195
    .line 196
    .line 197
    const v15, 0x411e8f5c    # 9.91f

    .line 198
    .line 199
    .line 200
    const v16, -0x3f71999a    # -4.45f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x41986666    # 19.05f

    .line 207
    .line 208
    .line 209
    const v18, 0x409d1eb8    # 4.91f

    .line 210
    .line 211
    .line 212
    const v13, 0x41af999a    # 21.95f

    .line 213
    .line 214
    .line 215
    const v14, 0x411451ec    # 9.27f

    .line 216
    .line 217
    .line 218
    const v15, 0x41a75c29    # 20.92f

    .line 219
    .line 220
    .line 221
    const v16, 0x40d8f5c3    # 6.78f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x41a13333    # 20.15f

    .line 231
    .line 232
    .line 233
    const v2, 0x4140a3d7    # 12.04f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, -0x3f79999a    # -4.2f

    .line 243
    .line 244
    .line 245
    const v18, -0x406ccccd    # -1.15f

    .line 246
    .line 247
    .line 248
    const v13, -0x40428f5c    # -1.48f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const v15, -0x3fc47ae1    # -2.93f

    .line 253
    .line 254
    .line 255
    const v16, -0x41333333    # -0.4f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x41666666    # -0.3f

    .line 262
    .line 263
    .line 264
    const v2, -0x41c7ae14    # -0.18f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x3fb851ec    # -3.12f

    .line 271
    .line 272
    .line 273
    const v2, 0x3f51eb85    # 0.82f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3f547ae1    # 0.83f

    .line 280
    .line 281
    .line 282
    const v2, -0x3fbd70a4    # -3.04f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x41b33333    # -0.2f

    .line 289
    .line 290
    .line 291
    const v2, -0x416147ae    # -0.31f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x405eb852    # -1.26f

    .line 298
    .line 299
    .line 300
    const v18, -0x3f73d70a    # -4.38f

    .line 301
    .line 302
    .line 303
    const v13, -0x40ae147b    # -0.82f

    .line 304
    .line 305
    .line 306
    const v14, -0x405851ec    # -1.31f

    .line 307
    .line 308
    .line 309
    const v15, -0x405eb852    # -1.26f

    .line 310
    .line 311
    .line 312
    const v16, -0x3fcae148    # -2.83f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x4103d70a    # 8.24f

    .line 319
    .line 320
    .line 321
    const v18, -0x3efc28f6    # -8.24f

    .line 322
    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, -0x3f6eb852    # -4.54f

    .line 326
    .line 327
    .line 328
    const v15, 0x406ccccd    # 3.7f

    .line 329
    .line 330
    .line 331
    const v16, -0x3efc28f6    # -8.24f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40ba3d71    # 5.82f

    .line 338
    .line 339
    .line 340
    const v18, 0x401ae148    # 2.42f

    .line 341
    .line 342
    .line 343
    const v13, 0x400ccccd    # 2.2f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const v15, 0x4088a3d7    # 4.27f

    .line 348
    .line 349
    .line 350
    const v16, 0x3f5c28f6    # 0.86f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x401a3d71    # 2.41f

    .line 357
    .line 358
    .line 359
    const v18, 0x40ba8f5c    # 5.83f

    .line 360
    .line 361
    .line 362
    const v13, 0x3fc7ae14    # 1.56f

    .line 363
    .line 364
    .line 365
    const v14, 0x3fc7ae14    # 1.56f

    .line 366
    .line 367
    .line 368
    const v15, 0x401a3d71    # 2.41f

    .line 369
    .line 370
    .line 371
    const v16, 0x406851ec    # 3.63f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x4140a3d7    # 12.04f

    .line 378
    .line 379
    .line 380
    const v18, 0x41a13333    # 20.15f

    .line 381
    .line 382
    .line 383
    const v13, 0x41a23d71    # 20.28f

    .line 384
    .line 385
    .line 386
    const v14, 0x4183ae14    # 16.46f

    .line 387
    .line 388
    .line 389
    const v15, 0x4184a3d7    # 16.58f

    .line 390
    .line 391
    .line 392
    const v16, 0x41a13333    # 20.15f

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
    const v0, 0x415fd70a    # 13.99f

    .line 402
    .line 403
    .line 404
    const v2, 0x41847ae1    # 16.56f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x4027ae14    # -1.69f

    .line 411
    .line 412
    .line 413
    const v18, -0x40b0a3d7    # -0.81f

    .line 414
    .line 415
    .line 416
    const/high16 v13, -0x41800000    # -0.25f

    .line 417
    .line 418
    const v14, -0x420a3d71    # -0.12f

    .line 419
    .line 420
    .line 421
    const v15, -0x4043d70a    # -1.47f

    .line 422
    .line 423
    .line 424
    const v16, -0x40c7ae14    # -0.72f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x40f0a3d7    # -0.56f

    .line 431
    .line 432
    .line 433
    const v18, 0x3df5c28f    # 0.12f

    .line 434
    .line 435
    .line 436
    const v13, -0x41947ae1    # -0.23f

    .line 437
    .line 438
    .line 439
    const v14, -0x425c28f6    # -0.08f

    .line 440
    .line 441
    .line 442
    const v15, -0x413851ec    # -0.39f

    .line 443
    .line 444
    .line 445
    const v16, -0x420a3d71    # -0.12f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, -0x40b851ec    # -0.78f

    .line 452
    .line 453
    .line 454
    const v18, 0x3f7851ec    # 0.97f

    .line 455
    .line 456
    .line 457
    const v13, -0x41d1eb85    # -0.17f

    .line 458
    .line 459
    .line 460
    const/high16 v14, 0x3e800000    # 0.25f

    .line 461
    .line 462
    const v15, -0x40dc28f6    # -0.64f

    .line 463
    .line 464
    .line 465
    const v16, 0x3f4f5c29    # 0.81f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, -0x40f5c28f    # -0.54f

    .line 472
    .line 473
    .line 474
    const v18, 0x3d75c28f    # 0.06f

    .line 475
    .line 476
    .line 477
    const v13, -0x41f0a3d7    # -0.14f

    .line 478
    .line 479
    .line 480
    const v14, 0x3e2e147b    # 0.17f

    .line 481
    .line 482
    .line 483
    const v15, -0x416b851f    # -0.29f

    .line 484
    .line 485
    .line 486
    const v16, 0x3e428f5c    # 0.19f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x400147ae    # -1.99f

    .line 493
    .line 494
    .line 495
    const v18, -0x40628f5c    # -1.23f

    .line 496
    .line 497
    .line 498
    const/high16 v13, -0x41800000    # -0.25f

    .line 499
    .line 500
    const v14, -0x420a3d71    # -0.12f

    .line 501
    .line 502
    .line 503
    const v15, -0x4079999a    # -1.05f

    .line 504
    .line 505
    .line 506
    const v16, -0x413851ec    # -0.39f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, -0x404f5c29    # -1.38f

    .line 513
    .line 514
    .line 515
    const v18, -0x4023d70a    # -1.72f

    .line 516
    .line 517
    .line 518
    const v13, -0x40c28f5c    # -0.74f

    .line 519
    .line 520
    .line 521
    const v14, -0x40d70a3d    # -0.66f

    .line 522
    .line 523
    .line 524
    const v15, -0x40628f5c    # -1.23f

    .line 525
    .line 526
    .line 527
    const v16, -0x4043d70a    # -1.47f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3de147ae    # 0.11f

    .line 534
    .line 535
    .line 536
    const v18, -0x40fd70a4    # -0.51f

    .line 537
    .line 538
    .line 539
    const v13, -0x41f0a3d7    # -0.14f

    .line 540
    .line 541
    .line 542
    const/high16 v14, -0x41800000    # -0.25f

    .line 543
    .line 544
    const v15, -0x435c28f6    # -0.02f

    .line 545
    .line 546
    .line 547
    const v16, -0x413d70a4    # -0.38f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, 0x3ebd70a4    # 0.37f

    .line 554
    .line 555
    .line 556
    const v18, -0x4123d70a    # -0.43f

    .line 557
    .line 558
    .line 559
    const v13, 0x3de147ae    # 0.11f

    .line 560
    .line 561
    .line 562
    const v14, -0x421eb852    # -0.11f

    .line 563
    .line 564
    .line 565
    const/high16 v15, 0x3e800000    # 0.25f

    .line 566
    .line 567
    const v16, -0x416b851f    # -0.29f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v17, 0x3e800000    # 0.25f

    .line 574
    .line 575
    const v18, -0x412e147b    # -0.41f

    .line 576
    .line 577
    .line 578
    const v13, 0x3df5c28f    # 0.12f

    .line 579
    .line 580
    .line 581
    const v14, -0x41f0a3d7    # -0.14f

    .line 582
    .line 583
    .line 584
    const v15, 0x3e2e147b    # 0.17f

    .line 585
    .line 586
    .line 587
    const/high16 v16, -0x41800000    # -0.25f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, -0x435c28f6    # -0.02f

    .line 593
    .line 594
    .line 595
    const v18, -0x4123d70a    # -0.43f

    .line 596
    .line 597
    .line 598
    const v13, 0x3da3d70a    # 0.08f

    .line 599
    .line 600
    .line 601
    const v14, -0x41d1eb85    # -0.17f

    .line 602
    .line 603
    .line 604
    const v15, 0x3d23d70a    # 0.04f

    .line 605
    .line 606
    .line 607
    const v16, -0x416147ae    # -0.31f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x40bd70a4    # -0.76f

    .line 614
    .line 615
    .line 616
    const v18, -0x40147ae1    # -1.84f

    .line 617
    .line 618
    .line 619
    const v13, -0x428a3d71    # -0.06f

    .line 620
    .line 621
    .line 622
    const v14, -0x420a3d71    # -0.12f

    .line 623
    .line 624
    .line 625
    const v15, -0x40f0a3d7    # -0.56f

    .line 626
    .line 627
    .line 628
    const v16, -0x40547ae1    # -1.34f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, -0x40f0a3d7    # -0.56f

    .line 635
    .line 636
    .line 637
    const v18, -0x4123d70a    # -0.43f

    .line 638
    .line 639
    .line 640
    const v13, -0x41b33333    # -0.2f

    .line 641
    .line 642
    .line 643
    const v14, -0x410a3d71    # -0.48f

    .line 644
    .line 645
    .line 646
    const v15, -0x412e147b    # -0.41f

    .line 647
    .line 648
    .line 649
    const v16, -0x4128f5c3    # -0.42f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x41087ae1    # 8.53f

    .line 656
    .line 657
    .line 658
    const v18, 0x40ea8f5c    # 7.33f

    .line 659
    .line 660
    .line 661
    const v13, 0x410dc28f    # 8.86f

    .line 662
    .line 663
    .line 664
    const v14, 0x40ea8f5c    # 7.33f

    .line 665
    .line 666
    .line 667
    const v15, 0x410b3333    # 8.7f

    .line 668
    .line 669
    .line 670
    const v16, 0x40ea8f5c    # 7.33f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, -0x40d70a3d    # -0.66f

    .line 677
    .line 678
    .line 679
    const v18, 0x3e9eb852    # 0.31f

    .line 680
    .line 681
    .line 682
    const v13, -0x41d1eb85    # -0.17f

    .line 683
    .line 684
    .line 685
    const/4 v14, 0x0

    .line 686
    const v15, -0x4123d70a    # -0.43f

    .line 687
    .line 688
    .line 689
    const v16, 0x3d75c28f    # 0.06f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x40e051ec    # 7.01f

    .line 696
    .line 697
    .line 698
    const v18, 0x411b5c29    # 9.71f

    .line 699
    .line 700
    .line 701
    const v13, 0x40f4cccd    # 7.65f

    .line 702
    .line 703
    .line 704
    const v14, 0x40fc7ae1    # 7.89f

    .line 705
    .line 706
    .line 707
    const v15, 0x40e051ec    # 7.01f

    .line 708
    .line 709
    .line 710
    const v16, 0x4107d70a    # 8.49f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, 0x3f8147ae    # 1.01f

    .line 717
    .line 718
    .line 719
    const v18, 0x4023d70a    # 2.56f

    .line 720
    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const v14, 0x3f9c28f6    # 1.22f

    .line 724
    .line 725
    .line 726
    const v15, 0x3f63d70a    # 0.89f

    .line 727
    .line 728
    .line 729
    const v16, 0x4019999a    # 2.4f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v17, 0x40875c29    # 4.23f

    .line 736
    .line 737
    .line 738
    const v18, 0x406f5c29    # 3.74f

    .line 739
    .line 740
    .line 741
    const v13, 0x3df5c28f    # 0.12f

    .line 742
    .line 743
    .line 744
    const v14, 0x3e2e147b    # 0.17f

    .line 745
    .line 746
    .line 747
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 748
    .line 749
    const v16, 0x402ae148    # 2.67f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v17, 0x3fb47ae1    # 1.41f

    .line 756
    .line 757
    .line 758
    const v18, 0x3f051eb8    # 0.52f

    .line 759
    .line 760
    .line 761
    const v13, 0x3f170a3d    # 0.59f

    .line 762
    .line 763
    .line 764
    const v14, 0x3e851eb8    # 0.26f

    .line 765
    .line 766
    .line 767
    const v15, 0x3f866666    # 1.05f

    .line 768
    .line 769
    .line 770
    const v16, 0x3ed1eb85    # 0.41f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v17, 0x3fc7ae14    # 1.56f

    .line 777
    .line 778
    .line 779
    const v18, 0x3dcccccd    # 0.1f

    .line 780
    .line 781
    .line 782
    const v14, 0x3e428f5c    # 0.19f

    .line 783
    .line 784
    .line 785
    const v15, 0x3f90a3d7    # 1.13f

    .line 786
    .line 787
    .line 788
    const v16, 0x3e23d70a    # 0.16f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, 0x3fd5c28f    # 1.67f

    .line 795
    .line 796
    .line 797
    const v18, -0x4068f5c3    # -1.18f

    .line 798
    .line 799
    .line 800
    const v13, 0x3ef5c28f    # 0.48f

    .line 801
    .line 802
    .line 803
    const v14, -0x4270a3d7    # -0.07f

    .line 804
    .line 805
    .line 806
    const v15, 0x3fbc28f6    # 1.47f

    .line 807
    .line 808
    .line 809
    const v16, -0x40e66666    # -0.6f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v17, 0x3e0f5c29    # 0.14f

    .line 816
    .line 817
    .line 818
    const v13, 0x3e570a3d    # 0.21f

    .line 819
    .line 820
    .line 821
    const v14, -0x40eb851f    # -0.58f

    .line 822
    .line 823
    .line 824
    const v15, 0x3e570a3d    # 0.21f

    .line 825
    .line 826
    .line 827
    const v16, -0x40770a3d    # -1.07f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x41867ae1    # 16.81f

    .line 834
    .line 835
    .line 836
    const v2, 0x4161c28f    # 14.11f

    .line 837
    .line 838
    .line 839
    const v4, 0x415fd70a    # 13.99f

    .line 840
    .line 841
    .line 842
    const v6, 0x41847ae1    # 16.56f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    const/16 v16, 0x3800

    .line 856
    .line 857
    const/16 v17, 0x0

    .line 858
    .line 859
    const/high16 v6, 0x3f800000    # 1.0f

    .line 860
    .line 861
    const/high16 v8, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/4 v7, 0x0

    .line 864
    const/high16 v9, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/high16 v12, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/4 v13, 0x0

    .line 869
    const/4 v14, 0x0

    .line 870
    const/4 v15, 0x0

    .line 871
    const-string v4, ""

    .line 872
    .line 873
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    sput-object v0, Landroidx/compose/material/icons/rounded/WhatsappKt;->_whatsapp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 882
    .line 883
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    return-object v0
.end method
