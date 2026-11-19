.class public final Landroidx/compose/material/icons/rounded/HighlightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _highlight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHighlight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HighlightKt;->_highlight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Highlight"

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
    const v0, 0x40c947ae    # 6.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x4164a3d7    # 14.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41880000    # 17.0f

    .line 80
    .line 81
    const/high16 v2, 0x41100000    # 9.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40800000    # 4.0f

    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v17, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const/high16 v18, 0x3f800000    # 1.0f

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, 0x3f0ccccd    # 0.55f

    .line 97
    .line 98
    .line 99
    const v15, 0x3ee66666    # 0.45f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x3f800000    # 1.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v18, -0x40800000    # -1.0f

    .line 111
    .line 112
    const v13, 0x3f0ccccd    # 0.55f

    .line 113
    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const/high16 v15, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const v16, -0x4119999a    # -0.45f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x3f800000    # -4.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x402d70a4    # 2.71f

    .line 130
    .line 131
    .line 132
    const v2, -0x3fd28f5c    # -2.71f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3e947ae1    # 0.29f

    .line 139
    .line 140
    .line 141
    const v18, -0x40ca3d71    # -0.71f

    .line 142
    .line 143
    .line 144
    const v13, 0x3e428f5c    # 0.19f

    .line 145
    .line 146
    .line 147
    const v14, -0x41bd70a4    # -0.19f

    .line 148
    .line 149
    .line 150
    const v15, 0x3e947ae1    # 0.29f

    .line 151
    .line 152
    .line 153
    const v16, -0x411eb852    # -0.44f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41900000    # 18.0f

    .line 160
    .line 161
    const/high16 v2, 0x41200000    # 10.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, -0x40800000    # -1.0f

    .line 167
    .line 168
    const/high16 v18, -0x40800000    # -1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    const v15, -0x4119999a    # -0.45f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x40e00000    # 7.0f

    .line 183
    .line 184
    const/high16 v2, 0x41100000    # 9.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v18, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v13, -0x40f33333    # -0.55f

    .line 192
    .line 193
    .line 194
    const/4 v14, 0x0

    .line 195
    const/high16 v15, -0x40800000    # -1.0f

    .line 196
    .line 197
    const v16, 0x3ee66666    # 0.45f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x4065c28f    # 3.59f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3e947ae1    # 0.29f

    .line 210
    .line 211
    .line 212
    const v18, 0x3f333333    # 0.7f

    .line 213
    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const v14, 0x3e851eb8    # 0.26f

    .line 217
    .line 218
    .line 219
    const v15, 0x3de147ae    # 0.11f

    .line 220
    .line 221
    .line 222
    const v16, 0x3f051eb8    # 0.52f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41400000    # 12.0f

    .line 232
    .line 233
    const/high16 v2, 0x40000000    # 2.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v18, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const v13, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v16, 0x3ee66666    # 0.45f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x3f800000    # 1.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x40800000    # -1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const v15, -0x4119999a    # -0.45f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x3f800000    # 1.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, -0x4119999a    # -0.45f

    .line 274
    .line 275
    .line 276
    const/high16 v2, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41300000    # 11.0f

    .line 282
    .line 283
    const/high16 v2, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v18, -0x40800000    # -1.0f

    .line 291
    .line 292
    const v14, -0x40f33333    # -0.55f

    .line 293
    .line 294
    .line 295
    const v15, 0x3ee66666    # 0.45f

    .line 296
    .line 297
    .line 298
    const/high16 v16, -0x40800000    # -1.0f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x4086b852    # 4.21f

    .line 307
    .line 308
    .line 309
    const v2, 0x40a570a4    # 5.17f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3fb5c28f    # 1.42f

    .line 316
    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const v13, 0x3ec7ae14    # 0.39f

    .line 321
    .line 322
    .line 323
    const v14, -0x413851ec    # -0.39f

    .line 324
    .line 325
    .line 326
    const v15, 0x3f828f5c    # 1.02f

    .line 327
    .line 328
    .line 329
    const v16, -0x413851ec    # -0.39f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3f35c28f    # 0.71f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/16 v17, 0x0

    .line 342
    .line 343
    const v18, 0x3fb47ae1    # 1.41f

    .line 344
    .line 345
    .line 346
    const v14, 0x3ec7ae14    # 0.39f

    .line 347
    .line 348
    .line 349
    const v15, 0x3ec7ae14    # 0.39f

    .line 350
    .line 351
    .line 352
    const v16, 0x3f828f5c    # 1.02f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x404b851f    # -1.41f

    .line 359
    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    const v13, -0x413851ec    # -0.39f

    .line 364
    .line 365
    .line 366
    const v15, -0x407d70a4    # -1.02f

    .line 367
    .line 368
    .line 369
    const v16, 0x3ec7ae14    # 0.39f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x40c7ae14    # -0.72f

    .line 376
    .line 377
    .line 378
    const v2, -0x40ca3d71    # -0.71f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const v18, -0x404b851f    # -1.41f

    .line 387
    .line 388
    .line 389
    const v14, -0x413851ec    # -0.39f

    .line 390
    .line 391
    .line 392
    const v15, -0x413851ec    # -0.39f

    .line 393
    .line 394
    .line 395
    const v16, -0x407d70a4    # -1.02f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x418d5c29    # 17.67f

    .line 405
    .line 406
    .line 407
    const v2, 0x40bc28f6    # 5.88f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, -0x40ca3d71    # -0.71f

    .line 414
    .line 415
    .line 416
    const v2, 0x3f35c28f    # 0.71f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x3fb47ae1    # 1.41f

    .line 423
    .line 424
    .line 425
    const/16 v18, 0x0

    .line 426
    .line 427
    const v13, 0x3ec7ae14    # 0.39f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f828f5c    # 1.02f

    .line 431
    .line 432
    .line 433
    const v16, -0x413851ec    # -0.39f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const v18, 0x3fb47ae1    # 1.41f

    .line 442
    .line 443
    .line 444
    const v14, 0x3ec7ae14    # 0.39f

    .line 445
    .line 446
    .line 447
    const v15, 0x3ec7ae14    # 0.39f

    .line 448
    .line 449
    .line 450
    const v16, 0x3f828f5c    # 1.02f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x404b851f    # -1.41f

    .line 460
    .line 461
    .line 462
    const/16 v18, 0x0

    .line 463
    .line 464
    const v13, -0x413851ec    # -0.39f

    .line 465
    .line 466
    .line 467
    const v15, -0x407d70a4    # -1.02f

    .line 468
    .line 469
    .line 470
    const v16, 0x3ec7ae14    # 0.39f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/16 v17, 0x0

    .line 477
    .line 478
    const v18, -0x404b851f    # -1.41f

    .line 479
    .line 480
    .line 481
    const v14, -0x413851ec    # -0.39f

    .line 482
    .line 483
    .line 484
    const v15, -0x413851ec    # -0.39f

    .line 485
    .line 486
    .line 487
    const v16, -0x407d70a4    # -1.02f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    const/16 v16, 0x3800

    .line 501
    .line 502
    const/16 v17, 0x0

    .line 503
    .line 504
    const/high16 v6, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/high16 v8, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/4 v7, 0x0

    .line 509
    const/high16 v9, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/high16 v12, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/4 v13, 0x0

    .line 514
    const/4 v14, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const-string v4, ""

    .line 517
    .line 518
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sput-object v0, Landroidx/compose/material/icons/rounded/HighlightKt;->_highlight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 527
    .line 528
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-object v0
.end method
