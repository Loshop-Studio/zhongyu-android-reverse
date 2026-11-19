.class public final Landroidx/compose/material/icons/rounded/LeakRemoveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLeakRemove(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LeakRemove"

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
    const v0, 0x41a0f5c3    # 20.12f

    .line 71
    .line 72
    .line 73
    const v2, 0x4140a3d7    # 12.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f6147ae    # 0.88f

    .line 80
    .line 81
    .line 82
    const v18, -0x40828f5c    # -0.99f

    .line 83
    .line 84
    .line 85
    const/high16 v13, 0x3f000000    # 0.5f

    .line 86
    .line 87
    const v14, -0x42b33333    # -0.05f

    .line 88
    .line 89
    .line 90
    const v15, 0x3f6147ae    # 0.88f

    .line 91
    .line 92
    .line 93
    const v16, -0x410a3d71    # -0.48f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x40733333    # -1.1f

    .line 100
    .line 101
    .line 102
    const/high16 v18, -0x40800000    # -1.0f

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, -0x40e8f5c3    # -0.59f

    .line 106
    .line 107
    .line 108
    const v15, -0x40fd70a4    # -0.51f

    .line 109
    .line 110
    .line 111
    const v16, -0x407851ec    # -1.06f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3f7ae148    # -4.16f

    .line 118
    .line 119
    .line 120
    const v18, 0x3fa66666    # 1.3f

    .line 121
    .line 122
    .line 123
    const/high16 v13, -0x40400000    # -1.5f

    .line 124
    .line 125
    const v14, 0x3e19999a    # 0.15f

    .line 126
    .line 127
    .line 128
    const v15, -0x3fc66666    # -2.9f

    .line 129
    .line 130
    .line 131
    const v16, 0x3f1c28f6    # 0.61f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x3fbd70a4    # 1.48f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x4039999a    # 2.9f

    .line 144
    .line 145
    .line 146
    const v18, -0x40b5c28f    # -0.79f

    .line 147
    .line 148
    .line 149
    const v13, 0x3f666666    # 0.9f

    .line 150
    .line 151
    .line 152
    const v14, -0x412e147b    # -0.41f

    .line 153
    .line 154
    .line 155
    const v15, 0x3fef5c29    # 1.87f

    .line 156
    .line 157
    .line 158
    const v16, -0x40cf5c29    # -0.69f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x41a80000    # 21.0f

    .line 168
    .line 169
    const v2, 0x417170a4    # 15.09f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x406e147b    # -1.14f

    .line 176
    .line 177
    .line 178
    const/high16 v18, -0x40800000    # -1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x40e3d70a    # -0.61f

    .line 182
    .line 183
    .line 184
    const v15, -0x40f5c28f    # -0.54f

    .line 185
    .line 186
    .line 187
    const v16, -0x40747ae1    # -1.09f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x4071eb85    # -1.11f

    .line 194
    .line 195
    .line 196
    const v18, 0x3e8f5c29    # 0.28f

    .line 197
    .line 198
    .line 199
    const v13, -0x413d70a4    # -0.38f

    .line 200
    .line 201
    .line 202
    const v14, 0x3d75c28f    # 0.06f

    .line 203
    .line 204
    .line 205
    const/high16 v15, -0x40c00000    # -0.75f

    .line 206
    .line 207
    const v16, 0x3e23d70a    # 0.16f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3fcf5c29    # 1.62f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3f2147ae    # 0.63f

    .line 220
    .line 221
    .line 222
    const v18, -0x4099999a    # -0.9f

    .line 223
    .line 224
    .line 225
    const v13, 0x3ebd70a4    # 0.37f

    .line 226
    .line 227
    .line 228
    const v14, -0x41e66666    # -0.15f

    .line 229
    .line 230
    .line 231
    const v15, 0x3f2147ae    # 0.63f

    .line 232
    .line 233
    .line 234
    const v16, -0x41051eb8    # -0.49f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x415f851f    # 13.97f

    .line 244
    .line 245
    .line 246
    const v2, 0x40847ae1    # 4.14f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v18, -0x4071eb85    # -1.11f

    .line 255
    .line 256
    .line 257
    const v13, 0x3d75c28f    # 0.06f

    .line 258
    .line 259
    .line 260
    const v14, -0x40e8f5c3    # -0.59f

    .line 261
    .line 262
    .line 263
    const v15, -0x41333333    # -0.4f

    .line 264
    .line 265
    .line 266
    const v16, -0x4071eb85    # -1.11f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x40828f5c    # -0.99f

    .line 273
    .line 274
    .line 275
    const v18, 0x3f5eb852    # 0.87f

    .line 276
    .line 277
    .line 278
    const/high16 v13, -0x41000000    # -0.5f

    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const v15, -0x408f5c29    # -0.94f

    .line 282
    .line 283
    .line 284
    const v16, 0x3ebd70a4    # 0.37f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x40b5c28f    # -0.79f

    .line 291
    .line 292
    .line 293
    const v18, 0x403a3d71    # 2.91f

    .line 294
    .line 295
    .line 296
    const v13, -0x42333333    # -0.1f

    .line 297
    .line 298
    .line 299
    const v14, 0x3f83d70a    # 1.03f

    .line 300
    .line 301
    .line 302
    const v15, -0x413d70a4    # -0.38f

    .line 303
    .line 304
    .line 305
    const v16, 0x4000a3d7    # 2.01f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x3fbd70a4    # 1.48f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3fa66666    # 1.3f

    .line 318
    .line 319
    .line 320
    const v18, -0x3f7b3333    # -4.15f

    .line 321
    .line 322
    .line 323
    const v13, 0x3f30a3d7    # 0.69f

    .line 324
    .line 325
    .line 326
    const v14, -0x405eb852    # -1.26f

    .line 327
    .line 328
    .line 329
    const v15, 0x3f933333    # 1.15f

    .line 330
    .line 331
    .line 332
    const v16, -0x3fd5c28f    # -2.66f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x411ee148    # 9.93f

    .line 342
    .line 343
    .line 344
    const v2, 0x40851eb8    # 4.16f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, -0x40800000    # -1.0f

    .line 351
    .line 352
    const v18, -0x406e147b    # -1.14f

    .line 353
    .line 354
    .line 355
    const v13, 0x3dcccccd    # 0.1f

    .line 356
    .line 357
    .line 358
    const v14, -0x40e66666    # -0.6f

    .line 359
    .line 360
    .line 361
    const v15, -0x413851ec    # -0.39f

    .line 362
    .line 363
    .line 364
    const v16, -0x406e147b    # -1.14f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x4099999a    # -0.9f

    .line 371
    .line 372
    .line 373
    const v18, 0x3f1eb852    # 0.62f

    .line 374
    .line 375
    .line 376
    const v13, -0x412e147b    # -0.41f

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/high16 v15, -0x40c00000    # -0.75f

    .line 381
    .line 382
    const v16, 0x3e851eb8    # 0.26f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x3fcf5c29    # 1.62f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x3e8f5c29    # 0.28f

    .line 395
    .line 396
    .line 397
    const v18, -0x40733333    # -1.1f

    .line 398
    .line 399
    .line 400
    const v13, 0x3e051eb8    # 0.13f

    .line 401
    .line 402
    .line 403
    const v14, -0x414ccccd    # -0.35f

    .line 404
    .line 405
    .line 406
    const v15, 0x3e6147ae    # 0.22f

    .line 407
    .line 408
    .line 409
    const v16, -0x40c7ae14    # -0.72f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x41a3851f    # 20.44f

    .line 419
    .line 420
    .line 421
    const v2, 0x41970a3d    # 18.88f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x40a3d70a    # 5.12f

    .line 428
    .line 429
    .line 430
    const v2, 0x4063d70a    # 3.56f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, -0x404b851f    # -1.41f

    .line 437
    .line 438
    .line 439
    const/16 v18, 0x0

    .line 440
    .line 441
    const v13, -0x413851ec    # -0.39f

    .line 442
    .line 443
    .line 444
    const v14, -0x413851ec    # -0.39f

    .line 445
    .line 446
    .line 447
    const v15, -0x407d70a4    # -1.02f

    .line 448
    .line 449
    .line 450
    const v16, -0x413851ec    # -0.39f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const v18, 0x3fb47ae1    # 1.41f

    .line 459
    .line 460
    .line 461
    const v14, 0x3ec7ae14    # 0.39f

    .line 462
    .line 463
    .line 464
    const v15, -0x413851ec    # -0.39f

    .line 465
    .line 466
    .line 467
    const v16, 0x3f828f5c    # 1.02f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x4009999a    # 2.15f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, -0x400147ae    # -1.99f

    .line 480
    .line 481
    .line 482
    const v18, 0x3f51eb85    # 0.82f

    .line 483
    .line 484
    .line 485
    const v13, -0x40e8f5c3    # -0.59f

    .line 486
    .line 487
    .line 488
    const v14, 0x3ed1eb85    # 0.41f

    .line 489
    .line 490
    .line 491
    const v15, -0x405eb852    # -1.26f

    .line 492
    .line 493
    .line 494
    const v16, 0x3f333333    # 0.7f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, -0x40a8f5c3    # -0.84f

    .line 501
    .line 502
    .line 503
    const/high16 v18, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const v13, -0x410a3d71    # -0.48f

    .line 506
    .line 507
    .line 508
    const v14, 0x3dcccccd    # 0.1f

    .line 509
    .line 510
    .line 511
    const v15, -0x40a8f5c3    # -0.84f

    .line 512
    .line 513
    .line 514
    const/high16 v16, 0x3f000000    # 0.5f

    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x3f91eb85    # 1.14f

    .line 520
    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const v14, 0x3f1c28f6    # 0.61f

    .line 524
    .line 525
    .line 526
    const v15, 0x3f0a3d71    # 0.54f

    .line 527
    .line 528
    .line 529
    const v16, 0x3f8b851f    # 1.09f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x404851ec    # 3.13f

    .line 536
    .line 537
    .line 538
    const v18, -0x4050a3d7    # -1.37f

    .line 539
    .line 540
    .line 541
    const v13, 0x3f95c28f    # 1.17f

    .line 542
    .line 543
    .line 544
    const v14, -0x41bd70a4    # -0.19f

    .line 545
    .line 546
    .line 547
    const v15, 0x400eb852    # 2.23f

    .line 548
    .line 549
    .line 550
    const v16, -0x40d1eb85    # -0.68f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x410bae14    # 8.73f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x41200000    # 10.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x3f66147b    # -4.81f

    .line 565
    .line 566
    .line 567
    const v18, 0x3ffeb852    # 1.99f

    .line 568
    .line 569
    .line 570
    const v13, -0x40547ae1    # -1.34f

    .line 571
    .line 572
    .line 573
    const v14, 0x3f8ccccd    # 1.1f

    .line 574
    .line 575
    .line 576
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 577
    .line 578
    const v16, 0x3fe8f5c3    # 1.82f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x409eb852    # -0.88f

    .line 585
    .line 586
    .line 587
    const v18, 0x3f7d70a4    # 0.99f

    .line 588
    .line 589
    .line 590
    const/high16 v13, -0x41000000    # -0.5f

    .line 591
    .line 592
    const v14, 0x3d4ccccd    # 0.05f

    .line 593
    .line 594
    .line 595
    const v15, -0x409eb852    # -0.88f

    .line 596
    .line 597
    .line 598
    const v16, 0x3ef5c28f    # 0.48f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, 0x3f8ccccd    # 1.1f

    .line 605
    .line 606
    .line 607
    const/high16 v18, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const v14, 0x3f170a3d    # 0.59f

    .line 611
    .line 612
    .line 613
    const v15, 0x3f028f5c    # 0.51f

    .line 614
    .line 615
    .line 616
    const v16, 0x3f87ae14    # 1.06f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x40c051ec    # 6.01f

    .line 623
    .line 624
    .line 625
    const v18, -0x3fdc28f6    # -2.56f

    .line 626
    .line 627
    .line 628
    const v13, 0x4011eb85    # 2.28f

    .line 629
    .line 630
    .line 631
    const v14, -0x41947ae1    # -0.23f

    .line 632
    .line 633
    .line 634
    const v15, 0x408b851f    # 4.36f

    .line 635
    .line 636
    .line 637
    const v16, -0x406ccccd    # -1.15f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x401eb852    # 2.48f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, -0x3fdc28f6    # -2.56f

    .line 650
    .line 651
    .line 652
    const/high16 v18, 0x40c00000    # 6.0f

    .line 653
    .line 654
    const v13, -0x404ccccd    # -1.4f

    .line 655
    .line 656
    .line 657
    const v14, 0x3fd33333    # 1.65f

    .line 658
    .line 659
    .line 660
    const v15, -0x3feae148    # -2.33f

    .line 661
    .line 662
    .line 663
    const v16, 0x406e147b    # 3.72f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v17, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const v18, 0x3f8e147b    # 1.11f

    .line 672
    .line 673
    .line 674
    const v13, -0x428a3d71    # -0.06f

    .line 675
    .line 676
    .line 677
    const v14, 0x3f170a3d    # 0.59f

    .line 678
    .line 679
    .line 680
    const v15, 0x3ecccccd    # 0.4f

    .line 681
    .line 682
    .line 683
    const v16, 0x3f8e147b    # 1.11f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x3f7d70a4    # 0.99f

    .line 690
    .line 691
    .line 692
    const v18, -0x40a147ae    # -0.87f

    .line 693
    .line 694
    .line 695
    const/high16 v13, 0x3f000000    # 0.5f

    .line 696
    .line 697
    const/4 v14, 0x0

    .line 698
    const v15, 0x3f70a3d7    # 0.94f

    .line 699
    .line 700
    .line 701
    const v16, -0x41428f5c    # -0.37f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v17, 0x3ffeb852    # 1.99f

    .line 708
    .line 709
    .line 710
    const v18, -0x3f65c28f    # -4.82f

    .line 711
    .line 712
    .line 713
    const v13, 0x3e3851ec    # 0.18f

    .line 714
    .line 715
    .line 716
    const v14, -0x40170a3d    # -1.82f

    .line 717
    .line 718
    .line 719
    const v15, 0x3f666666    # 0.9f

    .line 720
    .line 721
    .line 722
    const v16, -0x3fa147ae    # -3.48f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v0, 0x3fb70a3d    # 1.43f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v17, -0x4050a3d7    # -1.37f

    .line 735
    .line 736
    .line 737
    const v18, 0x404851ec    # 3.13f

    .line 738
    .line 739
    .line 740
    const v13, -0x40cf5c29    # -0.69f

    .line 741
    .line 742
    .line 743
    const v14, 0x3f666666    # 0.9f

    .line 744
    .line 745
    .line 746
    const v15, -0x4068f5c3    # -1.18f

    .line 747
    .line 748
    .line 749
    const v16, 0x3ffae148    # 1.96f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v17, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const v18, 0x3f91eb85    # 1.14f

    .line 758
    .line 759
    .line 760
    const v13, -0x42333333    # -0.1f

    .line 761
    .line 762
    .line 763
    const v14, 0x3f19999a    # 0.6f

    .line 764
    .line 765
    .line 766
    const v15, 0x3ec7ae14    # 0.39f

    .line 767
    .line 768
    .line 769
    const v16, 0x3f91eb85    # 1.14f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v17, 0x3f7ae148    # 0.98f

    .line 776
    .line 777
    .line 778
    const v18, -0x40a66666    # -0.85f

    .line 779
    .line 780
    .line 781
    const v13, 0x3efae148    # 0.49f

    .line 782
    .line 783
    .line 784
    const/4 v14, 0x0

    .line 785
    const v15, 0x3f666666    # 0.9f

    .line 786
    .line 787
    .line 788
    const v16, -0x4147ae14    # -0.36f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, 0x3f51eb85    # 0.82f

    .line 795
    .line 796
    .line 797
    const v18, -0x400147ae    # -1.99f

    .line 798
    .line 799
    .line 800
    const v13, 0x3df5c28f    # 0.12f

    .line 801
    .line 802
    .line 803
    const v14, -0x40c51eb8    # -0.73f

    .line 804
    .line 805
    .line 806
    const v15, 0x3ed70a3d    # 0.42f

    .line 807
    .line 808
    .line 809
    const v16, -0x404ccccd    # -1.4f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x400851ec    # 2.13f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v17, 0x3fb47ae1    # 1.41f

    .line 822
    .line 823
    .line 824
    const/16 v18, 0x0

    .line 825
    .line 826
    const v13, 0x3ec7ae14    # 0.39f

    .line 827
    .line 828
    .line 829
    const v14, 0x3ec7ae14    # 0.39f

    .line 830
    .line 831
    .line 832
    const v15, 0x3f828f5c    # 1.02f

    .line 833
    .line 834
    .line 835
    const v16, 0x3ec7ae14    # 0.39f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v17, -0x43dc28f6    # -0.01f

    .line 842
    .line 843
    .line 844
    const v18, -0x4048f5c3    # -1.43f

    .line 845
    .line 846
    .line 847
    const v13, 0x3ec28f5c    # 0.38f

    .line 848
    .line 849
    .line 850
    const v14, -0x412e147b    # -0.41f

    .line 851
    .line 852
    .line 853
    const v15, 0x3ec28f5c    # 0.38f

    .line 854
    .line 855
    .line 856
    const v16, -0x407ae148    # -1.04f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const/16 v16, 0x3800

    .line 870
    .line 871
    const/16 v17, 0x0

    .line 872
    .line 873
    const/high16 v6, 0x3f800000    # 1.0f

    .line 874
    .line 875
    const/high16 v8, 0x3f800000    # 1.0f

    .line 876
    .line 877
    const/4 v7, 0x0

    .line 878
    const/high16 v9, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const/high16 v12, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v13, 0x0

    .line 883
    const/4 v14, 0x0

    .line 884
    const/4 v15, 0x0

    .line 885
    const-string v4, ""

    .line 886
    .line 887
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    sput-object v0, Landroidx/compose/material/icons/rounded/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 896
    .line 897
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    return-object v0
.end method
