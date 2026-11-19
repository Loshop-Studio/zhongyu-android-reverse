.class public final Landroidx/compose/material/icons/filled/LeakRemoveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLeakRemove(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LeakRemove"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x420a3d71    # -0.12f

    .line 83
    .line 84
    .line 85
    const v18, 0x3f87ae14    # 1.06f

    .line 86
    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, 0x3ebd70a4    # 0.37f

    .line 90
    .line 91
    .line 92
    const v15, -0x42dc28f6    # -0.04f

    .line 93
    .line 94
    .line 95
    const v16, 0x3f3851ec    # 0.72f

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3fcb851f    # 1.59f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x41200000    # 10.0f

    .line 108
    .line 109
    const/high16 v18, 0x40400000    # 3.0f

    .line 110
    .line 111
    const v13, 0x411cf5c3    # 9.81f

    .line 112
    .line 113
    .line 114
    const v14, 0x409ae148    # 4.84f

    .line 115
    .line 116
    .line 117
    const/high16 v15, 0x41200000    # 10.0f

    .line 118
    .line 119
    const v16, 0x407c28f6    # 3.94f

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
    const v0, 0x4088a3d7    # 4.27f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x4035c28f    # 2.84f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x40400000    # 3.0f

    .line 141
    .line 142
    const/high16 v18, 0x41000000    # 8.0f

    .line 143
    .line 144
    const v13, 0x40a0f5c3    # 5.03f

    .line 145
    .line 146
    .line 147
    const v14, 0x40f570a4    # 7.67f

    .line 148
    .line 149
    .line 150
    const v15, 0x4081eb85    # 4.06f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x4088a3d7    # 4.27f

    .line 164
    .line 165
    .line 166
    const v18, -0x40451eb8    # -1.46f

    .line 167
    .line 168
    .line 169
    const v13, 0x3fce147b    # 1.61f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x4045c28f    # 3.09f

    .line 174
    .line 175
    .line 176
    const v16, -0x40f33333    # -0.55f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x410b3333    # 8.7f

    .line 183
    .line 184
    .line 185
    const v2, 0x411f851f    # 9.97f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x40400000    # 3.0f

    .line 192
    .line 193
    const/high16 v18, 0x41400000    # 12.0f

    .line 194
    .line 195
    const v13, 0x40e47ae1    # 7.14f

    .line 196
    .line 197
    .line 198
    const v14, 0x4133d70a    # 11.24f

    .line 199
    .line 200
    .line 201
    const v15, 0x40a51eb8    # 5.16f

    .line 202
    .line 203
    .line 204
    const/high16 v16, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x40e3851f    # 7.11f

    .line 215
    .line 216
    .line 217
    const v18, -0x3fd851ec    # -2.62f

    .line 218
    .line 219
    .line 220
    const v13, 0x402d70a4    # 2.71f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const v15, 0x40a6147b    # 5.19f

    .line 225
    .line 226
    .line 227
    const v16, -0x40828f5c    # -0.99f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x40200000    # 2.5f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41200000    # 10.0f

    .line 239
    .line 240
    const/high16 v18, 0x41a80000    # 21.0f

    .line 241
    .line 242
    const v13, 0x412fd70a    # 10.99f

    .line 243
    .line 244
    .line 245
    const v14, 0x417cf5c3    # 15.81f

    .line 246
    .line 247
    .line 248
    const/high16 v15, 0x41200000    # 10.0f

    .line 249
    .line 250
    const v16, 0x419251ec    # 18.29f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x40000000    # 2.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x4001eb85    # 2.03f

    .line 262
    .line 263
    .line 264
    const v18, -0x3f49eb85    # -5.69f

    .line 265
    .line 266
    .line 267
    const/4 v13, 0x0

    .line 268
    const v14, -0x3ff5c28f    # -2.16f

    .line 269
    .line 270
    .line 271
    const v15, 0x3f428f5c    # 0.76f

    .line 272
    .line 273
    .line 274
    const v16, -0x3f7b851f    # -4.14f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x3fb70a3d    # 1.43f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x41600000    # 14.0f

    .line 287
    .line 288
    const/high16 v18, 0x41a80000    # 21.0f

    .line 289
    .line 290
    const v13, 0x4168cccd    # 14.55f

    .line 291
    .line 292
    .line 293
    const v14, 0x418f47ae    # 17.91f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x41600000    # 14.0f

    .line 297
    .line 298
    const v16, 0x419b1eb8    # 19.39f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x3f63d70a    # 0.89f

    .line 310
    .line 311
    .line 312
    const v18, -0x3fca3d71    # -2.84f

    .line 313
    .line 314
    .line 315
    const/4 v13, 0x0

    .line 316
    const v14, -0x407851ec    # -1.06f

    .line 317
    .line 318
    .line 319
    const v15, 0x3ea8f5c3    # 0.33f

    .line 320
    .line 321
    .line 322
    const v16, -0x3ffe147b    # -2.03f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41a80000    # 21.0f

    .line 329
    .line 330
    const v2, 0x419dd70a    # 19.73f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4088a3d7    # 4.27f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x40400000    # 3.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41600000    # 14.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, -0x40000000    # -2.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x407d70a4    # -1.02f

    .line 364
    .line 365
    .line 366
    const v18, 0x40851eb8    # 4.16f

    .line 367
    .line 368
    .line 369
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 370
    .line 371
    const v15, -0x41428f5c    # -0.37f

    .line 372
    .line 373
    .line 374
    const v16, 0x403a3d71    # 2.91f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fbae148    # 1.46f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41600000    # 14.0f

    .line 387
    .line 388
    const/high16 v18, 0x40400000    # 3.0f

    .line 389
    .line 390
    const v13, 0x4156b852    # 13.42f

    .line 391
    .line 392
    .line 393
    const v14, 0x40df5c29    # 6.98f

    .line 394
    .line 395
    .line 396
    const/high16 v15, 0x41600000    # 14.0f

    .line 397
    .line 398
    const v16, 0x40a1eb85    # 5.06f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x419f851f    # 19.94f

    .line 408
    .line 409
    .line 410
    const v2, 0x4180f5c3    # 16.12f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x3f87ae14    # 1.06f

    .line 417
    .line 418
    .line 419
    const v18, -0x420a3d71    # -0.12f

    .line 420
    .line 421
    .line 422
    const v13, 0x3eae147b    # 0.34f

    .line 423
    .line 424
    .line 425
    const v14, -0x425c28f6    # -0.08f

    .line 426
    .line 427
    .line 428
    const v15, 0x3f30a3d7    # 0.69f

    .line 429
    .line 430
    .line 431
    const v16, -0x420a3d71    # -0.12f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, -0x40000000    # -2.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x3fd5c28f    # -2.66f

    .line 443
    .line 444
    .line 445
    const v18, 0x3f051eb8    # 0.52f

    .line 446
    .line 447
    .line 448
    const v13, -0x408f5c29    # -0.94f

    .line 449
    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const v15, -0x40147ae1    # -1.84f

    .line 453
    .line 454
    .line 455
    const v16, 0x3e428f5c    # 0.19f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x3fcccccd    # 1.6f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x4176147b    # 15.38f

    .line 471
    .line 472
    .line 473
    const v2, 0x4138f5c3    # 11.56f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x3fbae148    # 1.46f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x41a80000    # 21.0f

    .line 486
    .line 487
    const/high16 v18, 0x41400000    # 12.0f

    .line 488
    .line 489
    const v13, 0x4190b852    # 18.09f

    .line 490
    .line 491
    .line 492
    const v14, 0x4145eb85    # 12.37f

    .line 493
    .line 494
    .line 495
    const/high16 v15, 0x419c0000    # 19.5f

    .line 496
    .line 497
    const/high16 v16, 0x41400000    # 12.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, -0x40000000    # -2.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x3f4c28f6    # -5.62f

    .line 508
    .line 509
    .line 510
    const v18, 0x3fc7ae14    # 1.56f

    .line 511
    .line 512
    .line 513
    const v13, -0x3ffc28f6    # -2.06f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const v15, -0x3f8147ae    # -3.98f

    .line 518
    .line 519
    .line 520
    const v16, 0x3f147ae1    # 0.58f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v9, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v15, 0x0

    .line 548
    const-string v4, ""

    .line 549
    .line 550
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    sput-object v0, Landroidx/compose/material/icons/filled/LeakRemoveKt;->_leakRemove:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-object v0
.end method
