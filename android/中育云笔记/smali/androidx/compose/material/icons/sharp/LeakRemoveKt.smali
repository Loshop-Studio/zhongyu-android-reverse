.class public final Landroidx/compose/material/icons/sharp/LeakRemoveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLeakRemove(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LeakRemove"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x40a8f5c3    # -0.84f

    .line 83
    .line 84
    .line 85
    const v18, 0x407147ae    # 3.77f

    .line 86
    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, 0x3faccccd    # 1.35f

    .line 90
    .line 91
    .line 92
    const v15, -0x416147ae    # -0.31f

    .line 93
    .line 94
    .line 95
    const v16, 0x402851ec    # 2.63f

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3fbeb852    # 1.49f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x41600000    # 14.0f

    .line 108
    .line 109
    const/high16 v18, 0x40400000    # 3.0f

    .line 110
    .line 111
    const v13, 0x415828f6    # 13.51f

    .line 112
    .line 113
    .line 114
    const v14, 0x40d66666    # 6.7f

    .line 115
    .line 116
    .line 117
    const/high16 v15, 0x41600000    # 14.0f

    .line 118
    .line 119
    const v16, 0x409d1eb8    # 4.91f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x41400000    # 12.0f

    .line 129
    .line 130
    const/high16 v2, 0x41a80000    # 21.0f

    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, -0x40000000    # -2.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x3f575c29    # -5.27f

    .line 141
    .line 142
    .line 143
    const v18, 0x3faccccd    # 1.35f

    .line 144
    .line 145
    .line 146
    const v13, -0x400b851f    # -1.91f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const v15, -0x3f933333    # -3.7f

    .line 151
    .line 152
    .line 153
    const v16, 0x3efae148    # 0.49f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3fbeb852    # 1.49f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x4071eb85    # 3.78f

    .line 166
    .line 167
    .line 168
    const v18, -0x40a8f5c3    # -0.84f

    .line 169
    .line 170
    .line 171
    const v13, 0x3f933333    # 1.15f

    .line 172
    .line 173
    .line 174
    const v14, -0x40f851ec    # -0.53f

    .line 175
    .line 176
    .line 177
    const v15, 0x401b851f    # 2.43f

    .line 178
    .line 179
    .line 180
    const v16, -0x40a8f5c3    # -0.84f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41800000    # 16.0f

    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, -0x40000000    # -2.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, -0x3ff0a3d7    # -2.24f

    .line 200
    .line 201
    .line 202
    const v18, 0x3ebd70a4    # 0.37f

    .line 203
    .line 204
    .line 205
    const v13, -0x40b5c28f    # -0.79f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const v15, -0x403ae148    # -1.54f

    .line 210
    .line 211
    .line 212
    const v16, 0x3e051eb8    # 0.13f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x3fd70a3d    # 1.68f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x3f0f5c29    # 0.56f

    .line 225
    .line 226
    .line 227
    const v18, -0x42b33333    # -0.05f

    .line 228
    .line 229
    .line 230
    const v13, 0x3e428f5c    # 0.19f

    .line 231
    .line 232
    .line 233
    const v14, -0x43dc28f6    # -0.01f

    .line 234
    .line 235
    .line 236
    const v15, 0x3ebd70a4    # 0.37f

    .line 237
    .line 238
    .line 239
    const v16, -0x42b33333    # -0.05f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41200000    # 10.0f

    .line 249
    .line 250
    const/high16 v2, 0x40400000    # 3.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x41000000    # 8.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, -0x428a3d71    # -0.06f

    .line 261
    .line 262
    .line 263
    const v18, 0x3f0f5c29    # 0.56f

    .line 264
    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, 0x3e428f5c    # 0.19f

    .line 268
    .line 269
    .line 270
    const v15, -0x42dc28f6    # -0.04f

    .line 271
    .line 272
    .line 273
    const v16, 0x3ebd70a4    # 0.37f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3fd70a3d    # 1.68f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x3ec28f5c    # 0.38f

    .line 286
    .line 287
    .line 288
    const v18, -0x3ff0a3d7    # -2.24f

    .line 289
    .line 290
    .line 291
    const/high16 v13, 0x3e800000    # 0.25f

    .line 292
    .line 293
    const v14, -0x40cccccd    # -0.7f

    .line 294
    .line 295
    .line 296
    const v15, 0x3ec28f5c    # 0.38f

    .line 297
    .line 298
    .line 299
    const v16, -0x40451eb8    # -1.46f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40370a3d    # 2.86f

    .line 309
    .line 310
    .line 311
    const v2, 0x408d1eb8    # 4.41f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x4088a3d7    # 4.27f

    .line 318
    .line 319
    .line 320
    const/high16 v2, 0x40400000    # 3.0f

    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x4035c28f    # 2.84f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x40400000    # 3.0f

    .line 332
    .line 333
    const/high16 v18, 0x41000000    # 8.0f

    .line 334
    .line 335
    const v13, 0x40a0f5c3    # 5.03f

    .line 336
    .line 337
    .line 338
    const v14, 0x40f570a4    # 7.67f

    .line 339
    .line 340
    .line 341
    const v15, 0x4081eb85    # 4.06f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41000000    # 8.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x40000000    # 2.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4088a3d7    # 4.27f

    .line 355
    .line 356
    .line 357
    const v18, -0x40451eb8    # -1.46f

    .line 358
    .line 359
    .line 360
    const v13, 0x3fce147b    # 1.61f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const v15, 0x4045c28f    # 3.09f

    .line 365
    .line 366
    .line 367
    const v16, -0x40f33333    # -0.55f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x410b3333    # 8.7f

    .line 374
    .line 375
    .line 376
    const v2, 0x411f851f    # 9.97f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x40400000    # 3.0f

    .line 383
    .line 384
    const/high16 v18, 0x41400000    # 12.0f

    .line 385
    .line 386
    const v13, 0x40e47ae1    # 7.14f

    .line 387
    .line 388
    .line 389
    const v14, 0x4133d70a    # 11.24f

    .line 390
    .line 391
    .line 392
    const v15, 0x40a51eb8    # 5.16f

    .line 393
    .line 394
    .line 395
    const/high16 v16, 0x41400000    # 12.0f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40000000    # 2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x40e3851f    # 7.11f

    .line 406
    .line 407
    .line 408
    const v18, -0x3fd851ec    # -2.62f

    .line 409
    .line 410
    .line 411
    const v13, 0x402e147b    # 2.72f

    .line 412
    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const v15, 0x40a66666    # 5.2f

    .line 416
    .line 417
    .line 418
    const v16, -0x40828f5c    # -0.99f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4020a3d7    # 2.51f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x41200000    # 10.0f

    .line 431
    .line 432
    const/high16 v18, 0x41a80000    # 21.0f

    .line 433
    .line 434
    const v13, 0x412fd70a    # 10.99f

    .line 435
    .line 436
    .line 437
    const v14, 0x417cf5c3    # 15.81f

    .line 438
    .line 439
    .line 440
    const/high16 v15, 0x41200000    # 10.0f

    .line 441
    .line 442
    const v16, 0x419251ec    # 18.29f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40000000    # 2.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x4001eb85    # 2.03f

    .line 454
    .line 455
    .line 456
    const v18, -0x3f49999a    # -5.7f

    .line 457
    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, -0x3ff5c28f    # -2.16f

    .line 461
    .line 462
    .line 463
    const v15, 0x3f428f5c    # 0.76f

    .line 464
    .line 465
    .line 466
    const v16, -0x3f7b851f    # -4.14f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3fb70a3d    # 1.43f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, 0x41600000    # 14.0f

    .line 479
    .line 480
    const/high16 v18, 0x41a80000    # 21.0f

    .line 481
    .line 482
    const v13, 0x4168cccd    # 14.55f

    .line 483
    .line 484
    .line 485
    const v14, 0x418f47ae    # 17.91f

    .line 486
    .line 487
    .line 488
    const/high16 v15, 0x41600000    # 14.0f

    .line 489
    .line 490
    const v16, 0x419b1eb8    # 19.39f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x40000000    # 2.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x3f63d70a    # 0.89f

    .line 502
    .line 503
    .line 504
    const v18, -0x3fca3d71    # -2.84f

    .line 505
    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const v14, -0x407851ec    # -1.06f

    .line 509
    .line 510
    .line 511
    const v15, 0x3ea8f5c3    # 0.33f

    .line 512
    .line 513
    .line 514
    const v16, -0x3ffe147b    # -2.03f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, 0x419dd70a    # 19.73f

    .line 521
    .line 522
    .line 523
    const/high16 v2, 0x41a80000    # 21.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x3fb47ae1    # 1.41f

    .line 529
    .line 530
    .line 531
    const v2, -0x404b851f    # -1.41f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x40370a3d    # 2.86f

    .line 538
    .line 539
    .line 540
    const v2, 0x408d1eb8    # 4.41f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const/16 v16, 0x3800

    .line 554
    .line 555
    const/16 v17, 0x0

    .line 556
    .line 557
    const/high16 v6, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v8, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v7, 0x0

    .line 562
    const/high16 v9, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/high16 v12, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/4 v14, 0x0

    .line 567
    const/4 v15, 0x0

    .line 568
    const-string v4, ""

    .line 569
    .line 570
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    sput-object v0, Landroidx/compose/material/icons/sharp/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 579
    .line 580
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    return-object v0
.end method
