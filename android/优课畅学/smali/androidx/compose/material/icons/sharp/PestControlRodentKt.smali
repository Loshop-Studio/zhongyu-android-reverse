.class public final Landroidx/compose/material/icons/sharp/PestControlRodentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControlRodent(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PestControlRodent"

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
    const v0, 0x41aa7ae1    # 21.31f

    .line 71
    .line 72
    .line 73
    const v2, 0x418b0a3d    # 17.38f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fe70a3d    # -2.39f

    .line 80
    .line 81
    .line 82
    const v2, -0x3ff7ae14    # -2.13f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41780000    # 15.5f

    .line 89
    .line 90
    const/high16 v18, 0x41300000    # 11.0f

    .line 91
    .line 92
    const v13, 0x419b851f    # 19.44f

    .line 93
    .line 94
    .line 95
    const v14, 0x414e3d71    # 12.89f

    .line 96
    .line 97
    .line 98
    const v15, 0x418c7ae1    # 17.56f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x41300000    # 11.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 107
    .line 108
    const/high16 v18, 0x40600000    # 3.5f

    .line 109
    .line 110
    const v13, -0x406b851f    # -1.16f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 115
    .line 116
    const v16, 0x3f666666    # 0.9f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x3f83d70a    # 1.03f

    .line 123
    .line 124
    .line 125
    const v18, 0x401e147b    # 2.47f

    .line 126
    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, 0x3f7851ec    # 0.97f

    .line 130
    .line 131
    .line 132
    const v15, 0x3ec7ae14    # 0.39f

    .line 133
    .line 134
    .line 135
    const v16, 0x3feb851f    # 1.84f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, -0x40ca3d71    # -0.71f

    .line 142
    .line 143
    .line 144
    const v2, 0x3f35c28f    # 0.71f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41300000    # 11.0f

    .line 151
    .line 152
    const/high16 v18, 0x41680000    # 14.5f

    .line 153
    .line 154
    const/high16 v13, 0x41380000    # 11.5f

    .line 155
    .line 156
    const v14, 0x4186f5c3    # 16.87f

    .line 157
    .line 158
    .line 159
    const/high16 v15, 0x41300000    # 11.0f

    .line 160
    .line 161
    const v16, 0x417bd70a    # 15.74f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x40166666    # 2.35f

    .line 168
    .line 169
    .line 170
    const v18, -0x3f847ae1    # -3.93f

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, -0x40266666    # -1.7f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f75c28f    # 0.96f

    .line 178
    .line 179
    .line 180
    const v16, -0x3fb51eb8    # -3.17f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x3fee147b    # -2.28f

    .line 187
    .line 188
    .line 189
    const v18, -0x40ee147b    # -0.57f

    .line 190
    .line 191
    .line 192
    const v13, -0x40cccccd    # -0.7f

    .line 193
    .line 194
    .line 195
    const v14, -0x4147ae14    # -0.36f

    .line 196
    .line 197
    .line 198
    const v15, -0x40428f5c    # -1.48f

    .line 199
    .line 200
    .line 201
    const v16, -0x40ee147b    # -0.57f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x3f62e148    # -4.91f

    .line 208
    .line 209
    .line 210
    const v18, 0x4077ae14    # 3.87f

    .line 211
    .line 212
    .line 213
    const v13, -0x3fe7ae14    # -2.38f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, -0x3f7428f6    # -4.37f

    .line 218
    .line 219
    .line 220
    const v16, 0x3fd33333    # 1.65f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x40800000    # 4.0f

    .line 227
    .line 228
    const/high16 v18, 0x41300000    # 11.0f

    .line 229
    .line 230
    const v13, 0x409d1eb8    # 4.91f

    .line 231
    .line 232
    .line 233
    const/high16 v14, 0x41580000    # 13.5f

    .line 234
    .line 235
    const/high16 v15, 0x40800000    # 4.0f

    .line 236
    .line 237
    const v16, 0x4145c28f    # 12.36f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x40400000    # 3.0f

    .line 244
    .line 245
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const v14, -0x402b851f    # -1.66f

    .line 249
    .line 250
    .line 251
    const v15, 0x3fab851f    # 1.34f

    .line 252
    .line 253
    .line 254
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40200000    # 2.5f

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    const v13, 0x3f70a3d7    # 0.94f

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const v15, 0x3fc7ae14    # 1.56f

    .line 268
    .line 269
    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x41400000    # 12.0f

    .line 276
    .line 277
    const/high16 v18, 0x40b00000    # 5.5f

    .line 278
    .line 279
    const v13, 0x412e147b    # 10.88f

    .line 280
    .line 281
    .line 282
    const/high16 v14, 0x41000000    # 8.0f

    .line 283
    .line 284
    const/high16 v15, 0x41400000    # 12.0f

    .line 285
    .line 286
    const v16, 0x40dc28f6    # 6.88f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x41180000    # 9.5f

    .line 293
    .line 294
    const/high16 v18, 0x40400000    # 3.0f

    .line 295
    .line 296
    const/high16 v13, 0x41400000    # 12.0f

    .line 297
    .line 298
    const v14, 0x4083d70a    # 4.12f

    .line 299
    .line 300
    .line 301
    const v15, 0x412e147b    # 10.88f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x40400000    # 3.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40e00000    # 7.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40000000    # 2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40200000    # 2.5f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x41200000    # 10.0f

    .line 325
    .line 326
    const/high16 v18, 0x40b00000    # 5.5f

    .line 327
    .line 328
    const v13, 0x411c7ae1    # 9.78f

    .line 329
    .line 330
    .line 331
    const/high16 v14, 0x40a00000    # 5.0f

    .line 332
    .line 333
    const/high16 v15, 0x41200000    # 10.0f

    .line 334
    .line 335
    const v16, 0x40a70a3d    # 5.22f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x41180000    # 9.5f

    .line 342
    .line 343
    const/high16 v18, 0x40c00000    # 6.0f

    .line 344
    .line 345
    const/high16 v13, 0x41200000    # 10.0f

    .line 346
    .line 347
    const v14, 0x40b8f5c3    # 5.78f

    .line 348
    .line 349
    .line 350
    const v15, 0x411c7ae1    # 9.78f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x40c00000    # 6.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x40e00000    # 7.0f

    .line 359
    .line 360
    const v13, 0x4117851f    # 9.47f

    .line 361
    .line 362
    .line 363
    const/high16 v14, 0x40c00000    # 6.0f

    .line 364
    .line 365
    const/high16 v15, 0x41100000    # 9.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x3f600000    # -5.0f

    .line 371
    .line 372
    const/high16 v18, 0x40a00000    # 5.0f

    .line 373
    .line 374
    const v13, -0x3fcf5c29    # -2.76f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, -0x3f600000    # -5.0f

    .line 379
    .line 380
    const v16, 0x400f5c29    # 2.24f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x40800000    # 4.0f

    .line 387
    .line 388
    const v18, 0x409ccccd    # 4.9f

    .line 389
    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, 0x401ae148    # 2.42f

    .line 393
    .line 394
    .line 395
    const v15, 0x3fdc28f6    # 1.72f

    .line 396
    .line 397
    .line 398
    const v16, 0x408e147b    # 4.44f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3cf5c28f    # 0.03f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x41311eb8    # 11.07f

    .line 411
    .line 412
    .line 413
    const/high16 v18, 0x41a80000    # 21.0f

    .line 414
    .line 415
    const/high16 v13, 0x40c00000    # 6.0f

    .line 416
    .line 417
    const v14, 0x4195d70a    # 18.73f

    .line 418
    .line 419
    .line 420
    const v15, 0x410451ec    # 8.27f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x41a80000    # 21.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x410dc28f    # 8.86f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x41aa7ae1    # 21.31f

    .line 435
    .line 436
    .line 437
    const v18, 0x418b0a3d    # 17.38f

    .line 438
    .line 439
    .line 440
    const v13, 0x41ae6666    # 21.8f

    .line 441
    .line 442
    .line 443
    const/high16 v14, 0x41a80000    # 21.0f

    .line 444
    .line 445
    const v15, 0x41b5eb85    # 22.74f

    .line 446
    .line 447
    .line 448
    const v16, 0x419547ae    # 18.66f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41900000    # 18.0f

    .line 458
    .line 459
    const/high16 v2, 0x41980000    # 19.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x40800000    # -1.0f

    .line 465
    .line 466
    const/high16 v18, -0x40800000    # -1.0f

    .line 467
    .line 468
    const v13, -0x40f33333    # -0.55f

    .line 469
    .line 470
    .line 471
    const/4 v14, 0x0

    .line 472
    const/high16 v15, -0x40800000    # -1.0f

    .line 473
    .line 474
    const v16, -0x4119999a    # -0.45f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const v14, -0x40f33333    # -0.55f

    .line 484
    .line 485
    .line 486
    const v15, 0x3ee66666    # 0.45f

    .line 487
    .line 488
    .line 489
    const/high16 v16, -0x40800000    # -1.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x3ee66666    # 0.45f

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x3f800000    # 1.0f

    .line 498
    .line 499
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x41900000    # 18.0f

    .line 503
    .line 504
    const/high16 v18, 0x41980000    # 19.0f

    .line 505
    .line 506
    const/high16 v13, 0x41980000    # 19.0f

    .line 507
    .line 508
    const v14, 0x41946666    # 18.55f

    .line 509
    .line 510
    .line 511
    const v15, 0x41946666    # 18.55f

    .line 512
    .line 513
    .line 514
    const/high16 v16, 0x41980000    # 19.0f

    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    const/16 v16, 0x3800

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const/high16 v6, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/high16 v8, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const/high16 v9, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/high16 v12, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/4 v14, 0x0

    .line 541
    const/4 v15, 0x0

    .line 542
    const-string v4, ""

    .line 543
    .line 544
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    sput-object v0, Landroidx/compose/material/icons/sharp/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    return-object v0
.end method
