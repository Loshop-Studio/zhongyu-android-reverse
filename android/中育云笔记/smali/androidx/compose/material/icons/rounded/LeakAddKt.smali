.class public final Landroidx/compose/material/icons/rounded/LeakAddKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _leakAdd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLeakAdd(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LeakAddKt;->_leakAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LeakAdd"

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
    const v0, 0x4130cccd    # 11.05f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a80000    # 21.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f7d70a4    # 0.99f

    .line 79
    .line 80
    .line 81
    const v18, -0x40a147ae    # -0.87f

    .line 82
    .line 83
    .line 84
    const/high16 v13, 0x3f000000    # 0.5f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3f70a3d7    # 0.94f

    .line 88
    .line 89
    .line 90
    const v16, -0x41428f5c    # -0.37f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x410147ae    # 8.08f

    .line 97
    .line 98
    .line 99
    const v18, -0x3efeb852    # -8.08f

    .line 100
    .line 101
    .line 102
    const v13, 0x3ed1eb85    # 0.41f

    .line 103
    .line 104
    .line 105
    const v14, -0x3f775c29    # -4.27f

    .line 106
    .line 107
    .line 108
    const v15, 0x4073d70a    # 3.81f

    .line 109
    .line 110
    .line 111
    const v16, -0x3f0a8f5c    # -7.67f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3f6147ae    # 0.88f

    .line 118
    .line 119
    .line 120
    const v18, -0x40828f5c    # -0.99f

    .line 121
    .line 122
    .line 123
    const/high16 v13, 0x3f000000    # 0.5f

    .line 124
    .line 125
    const v14, -0x42b33333    # -0.05f

    .line 126
    .line 127
    .line 128
    const v15, 0x3f6147ae    # 0.88f

    .line 129
    .line 130
    .line 131
    const v16, -0x410a3d71    # -0.48f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x40733333    # -1.1f

    .line 138
    .line 139
    .line 140
    const/high16 v18, -0x40800000    # -1.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, -0x40e8f5c3    # -0.59f

    .line 144
    .line 145
    .line 146
    const v15, -0x40fd70a4    # -0.51f

    .line 147
    .line 148
    .line 149
    const v16, -0x407851ec    # -1.06f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x3ee28f5c    # -9.84f

    .line 156
    .line 157
    .line 158
    const v18, 0x411d47ae    # 9.83f

    .line 159
    .line 160
    .line 161
    const v13, -0x3f59eb85    # -5.19f

    .line 162
    .line 163
    .line 164
    const v14, 0x3f051eb8    # 0.52f

    .line 165
    .line 166
    .line 167
    const v15, -0x3eeae148    # -9.32f

    .line 168
    .line 169
    .line 170
    const v16, 0x4094cccd    # 4.65f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3f7d70a4    # 0.99f

    .line 177
    .line 178
    .line 179
    const v18, 0x3f8e147b    # 1.11f

    .line 180
    .line 181
    .line 182
    const v13, -0x428a3d71    # -0.06f

    .line 183
    .line 184
    .line 185
    const v14, 0x3f170a3d    # 0.59f

    .line 186
    .line 187
    .line 188
    const v15, 0x3ecccccd    # 0.4f

    .line 189
    .line 190
    .line 191
    const v16, 0x3f8e147b    # 1.11f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x41900000    # 18.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40400000    # 3.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 216
    .line 217
    const/high16 v18, 0x40400000    # 3.0f

    .line 218
    .line 219
    const v13, -0x402b851f    # -1.66f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 224
    .line 225
    const v16, 0x3fab851f    # 1.34f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x417170a4    # 15.09f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3f7ae148    # 0.98f

    .line 241
    .line 242
    .line 243
    const v18, -0x40a66666    # -0.85f

    .line 244
    .line 245
    .line 246
    const v13, 0x3efae148    # 0.49f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f666666    # 0.9f

    .line 250
    .line 251
    .line 252
    const v16, -0x4147ae14    # -0.36f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x40828f5c    # 4.08f

    .line 259
    .line 260
    .line 261
    const v18, -0x3f7d70a4    # -4.08f

    .line 262
    .line 263
    .line 264
    const v13, 0x3eb851ec    # 0.36f

    .line 265
    .line 266
    .line 267
    const v14, -0x3ffae148    # -2.08f

    .line 268
    .line 269
    .line 270
    const/high16 v15, 0x40000000    # 2.0f

    .line 271
    .line 272
    const v16, -0x3f91eb85    # -3.72f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3f59999a    # 0.85f

    .line 279
    .line 280
    .line 281
    const v18, -0x40851eb8    # -0.98f

    .line 282
    .line 283
    .line 284
    const v13, 0x3efae148    # 0.49f

    .line 285
    .line 286
    .line 287
    const v14, -0x425c28f6    # -0.08f

    .line 288
    .line 289
    .line 290
    const v15, 0x3f59999a    # 0.85f

    .line 291
    .line 292
    .line 293
    const v16, -0x41051eb8    # -0.49f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x406e147b    # -1.14f

    .line 300
    .line 301
    .line 302
    const/high16 v18, -0x40800000    # -1.0f

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const v14, -0x40e3d70a    # -0.61f

    .line 306
    .line 307
    .line 308
    const v15, -0x40f5c28f    # -0.54f

    .line 309
    .line 310
    .line 311
    const v16, -0x40747ae1    # -1.09f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x3f475c29    # -5.77f

    .line 318
    .line 319
    .line 320
    const v18, 0x40b8a3d7    # 5.77f

    .line 321
    .line 322
    .line 323
    const v13, -0x3fc28f5c    # -2.96f

    .line 324
    .line 325
    .line 326
    const v14, 0x3ef5c28f    # 0.48f

    .line 327
    .line 328
    .line 329
    const v15, -0x3f56b852    # -5.29f

    .line 330
    .line 331
    .line 332
    const v16, 0x4033d70a    # 2.81f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const v18, 0x3f91eb85    # 1.14f

    .line 341
    .line 342
    .line 343
    const v13, -0x42333333    # -0.1f

    .line 344
    .line 345
    .line 346
    const v14, 0x3f19999a    # 0.6f

    .line 347
    .line 348
    .line 349
    const v15, 0x3ec7ae14    # 0.39f

    .line 350
    .line 351
    .line 352
    const v16, 0x3f91eb85    # 1.14f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x414f851f    # 12.97f

    .line 362
    .line 363
    .line 364
    const v2, 0x404147ae    # 3.02f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x40828f5c    # -0.99f

    .line 371
    .line 372
    .line 373
    const v18, 0x3f5eb852    # 0.87f

    .line 374
    .line 375
    .line 376
    const/high16 v13, -0x41000000    # -0.5f

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const v15, -0x408f5c29    # -0.94f

    .line 380
    .line 381
    .line 382
    const v16, 0x3ebd70a4    # 0.37f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, -0x3efeb852    # -8.08f

    .line 389
    .line 390
    .line 391
    const v18, 0x410147ae    # 8.08f

    .line 392
    .line 393
    .line 394
    const v13, -0x412e147b    # -0.41f

    .line 395
    .line 396
    .line 397
    const v14, 0x4088a3d7    # 4.27f

    .line 398
    .line 399
    .line 400
    const v15, -0x3f8c28f6    # -3.81f

    .line 401
    .line 402
    .line 403
    const v16, 0x40f570a4    # 7.67f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x409eb852    # -0.88f

    .line 410
    .line 411
    .line 412
    const v18, 0x3f7d70a4    # 0.99f

    .line 413
    .line 414
    .line 415
    const/high16 v13, -0x41000000    # -0.5f

    .line 416
    .line 417
    const v14, 0x3d4ccccd    # 0.05f

    .line 418
    .line 419
    .line 420
    const v15, -0x409eb852    # -0.88f

    .line 421
    .line 422
    .line 423
    const v16, 0x3ef5c28f    # 0.48f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x3f8ccccd    # 1.1f

    .line 430
    .line 431
    .line 432
    const/high16 v18, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, 0x3f170a3d    # 0.59f

    .line 436
    .line 437
    .line 438
    const v15, 0x3f028f5c    # 0.51f

    .line 439
    .line 440
    .line 441
    const v16, 0x3f87ae14    # 1.06f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x411d70a4    # 9.84f

    .line 448
    .line 449
    .line 450
    const v18, -0x3ee2b852    # -9.83f

    .line 451
    .line 452
    .line 453
    const v13, 0x40a6147b    # 5.19f

    .line 454
    .line 455
    .line 456
    const v14, -0x40fae148    # -0.52f

    .line 457
    .line 458
    .line 459
    const v15, 0x41151eb8    # 9.32f

    .line 460
    .line 461
    .line 462
    const v16, -0x3f6b3333    # -4.65f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, -0x40828f5c    # -0.99f

    .line 469
    .line 470
    .line 471
    const v18, -0x4071eb85    # -1.11f

    .line 472
    .line 473
    .line 474
    const v13, 0x3d8f5c29    # 0.07f

    .line 475
    .line 476
    .line 477
    const v14, -0x40eb851f    # -0.58f

    .line 478
    .line 479
    .line 480
    const v15, -0x413851ec    # -0.39f

    .line 481
    .line 482
    .line 483
    const v16, -0x4071eb85    # -1.11f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x40c0f5c3    # 6.03f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x40400000    # 3.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x40400000    # 3.0f

    .line 509
    .line 510
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 511
    .line 512
    const v13, 0x3fd47ae1    # 1.66f

    .line 513
    .line 514
    .line 515
    const/4 v14, 0x0

    .line 516
    const/high16 v15, 0x40400000    # 3.0f

    .line 517
    .line 518
    const v16, -0x40547ae1    # -1.34f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x410f0a3d    # 8.94f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, -0x40851eb8    # -0.98f

    .line 534
    .line 535
    .line 536
    const v18, 0x3f59999a    # 0.85f

    .line 537
    .line 538
    .line 539
    const v13, -0x41051eb8    # -0.49f

    .line 540
    .line 541
    .line 542
    const v15, -0x4099999a    # -0.9f

    .line 543
    .line 544
    .line 545
    const v16, 0x3eb851ec    # 0.36f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x3f7d70a4    # -4.08f

    .line 552
    .line 553
    .line 554
    const v18, 0x40828f5c    # 4.08f

    .line 555
    .line 556
    .line 557
    const v13, -0x4147ae14    # -0.36f

    .line 558
    .line 559
    .line 560
    const v14, 0x40051eb8    # 2.08f

    .line 561
    .line 562
    .line 563
    const/high16 v15, -0x40000000    # -2.0f

    .line 564
    .line 565
    const v16, 0x406e147b    # 3.72f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x40a66666    # -0.85f

    .line 572
    .line 573
    .line 574
    const v18, 0x3f7d70a4    # 0.99f

    .line 575
    .line 576
    .line 577
    const v13, -0x41051eb8    # -0.49f

    .line 578
    .line 579
    .line 580
    const v14, 0x3db851ec    # 0.09f

    .line 581
    .line 582
    .line 583
    const v15, -0x40a66666    # -0.85f

    .line 584
    .line 585
    .line 586
    const v16, 0x3efae148    # 0.49f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, 0x3f91eb85    # 1.14f

    .line 593
    .line 594
    .line 595
    const/high16 v18, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const v14, 0x3f1c28f6    # 0.61f

    .line 599
    .line 600
    .line 601
    const v15, 0x3f0a3d71    # 0.54f

    .line 602
    .line 603
    .line 604
    const v16, 0x3f8b851f    # 1.09f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, 0x40b8a3d7    # 5.77f

    .line 611
    .line 612
    .line 613
    const v18, -0x3f475c29    # -5.77f

    .line 614
    .line 615
    .line 616
    const v13, 0x403d70a4    # 2.96f

    .line 617
    .line 618
    .line 619
    const v14, -0x410a3d71    # -0.48f

    .line 620
    .line 621
    .line 622
    const v15, 0x40a947ae    # 5.29f

    .line 623
    .line 624
    .line 625
    const v16, -0x3fcc28f6    # -2.81f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v17, -0x40800000    # -1.0f

    .line 632
    .line 633
    const v18, -0x406ccccd    # -1.15f

    .line 634
    .line 635
    .line 636
    const v13, 0x3db851ec    # 0.09f

    .line 637
    .line 638
    .line 639
    const v14, -0x40e3d70a    # -0.61f

    .line 640
    .line 641
    .line 642
    const v15, -0x41333333    # -0.4f

    .line 643
    .line 644
    .line 645
    const v16, -0x406ccccd    # -1.15f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    const/16 v16, 0x3800

    .line 659
    .line 660
    const/16 v17, 0x0

    .line 661
    .line 662
    const/high16 v6, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v8, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const/high16 v9, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v12, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v13, 0x0

    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sput-object v0, Landroidx/compose/material/icons/rounded/LeakAddKt;->_leakAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    return-object v0
.end method
