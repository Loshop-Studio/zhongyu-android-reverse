.class public final Landroidx/compose/material/icons/filled/ThumbUpOffAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thumbUpOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbUpOffAlt(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ThumbUpOffAltKt;->_thumbUpOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ThumbUpOffAlt"

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
    const v0, 0x4151c28f    # 13.11f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b70a3d    # 5.72f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x40ee147b    # -0.57f

    .line 80
    .line 81
    .line 82
    const v2, 0x4038f5c3    # 2.89f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3ed70a3d    # 0.42f

    .line 89
    .line 90
    .line 91
    const v18, 0x3fd47ae1    # 1.66f

    .line 92
    .line 93
    .line 94
    const v13, -0x420a3d71    # -0.12f

    .line 95
    .line 96
    .line 97
    const v14, 0x3f170a3d    # 0.59f

    .line 98
    .line 99
    .line 100
    const v15, 0x3d23d70a    # 0.04f

    .line 101
    .line 102
    .line 103
    const v16, 0x3f99999a    # 1.2f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3fc51eb8    # 1.54f

    .line 110
    .line 111
    .line 112
    const v18, 0x3f3ae148    # 0.73f

    .line 113
    .line 114
    .line 115
    const v13, 0x3ec28f5c    # 0.38f

    .line 116
    .line 117
    .line 118
    const v14, 0x3eeb851f    # 0.46f

    .line 119
    .line 120
    .line 121
    const v15, 0x3f70a3d7    # 0.94f

    .line 122
    .line 123
    .line 124
    const v16, 0x3f3ae148    # 0.73f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x3f8a3d71    # 1.08f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x418b70a4    # 17.43f

    .line 142
    .line 143
    .line 144
    const/high16 v2, 0x41900000    # 18.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x411570a4    # 9.34f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x4151eb85    # -0.34f

    .line 156
    .line 157
    .line 158
    const v18, -0x4151eb85    # -0.34f

    .line 159
    .line 160
    .line 161
    const v13, -0x41c7ae14    # -0.18f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, -0x4151eb85    # -0.34f

    .line 166
    .line 167
    .line 168
    const v16, -0x41dc28f6    # -0.16f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x411d1eb8    # 9.82f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x4083851f    # 4.11f

    .line 181
    .line 182
    .line 183
    const v2, -0x3f7ccccd    # -4.1f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41600000    # 14.0f

    .line 190
    .line 191
    const/high16 v2, 0x40000000    # 2.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x40f2e148    # 7.59f

    .line 197
    .line 198
    .line 199
    const v2, 0x41068f5c    # 8.41f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x40e00000    # 7.0f

    .line 206
    .line 207
    const v18, 0x411d47ae    # 9.83f

    .line 208
    .line 209
    .line 210
    const v13, 0x40e6b852    # 7.21f

    .line 211
    .line 212
    .line 213
    const v14, 0x410ca3d7    # 8.79f

    .line 214
    .line 215
    .line 216
    const/high16 v15, 0x40e00000    # 7.0f

    .line 217
    .line 218
    const v16, 0x4114cccd    # 9.3f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x40fa8f5c    # 7.83f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x411570a4    # 9.34f

    .line 231
    .line 232
    .line 233
    const/high16 v18, 0x41a00000    # 20.0f

    .line 234
    .line 235
    const/high16 v13, 0x40e00000    # 7.0f

    .line 236
    .line 237
    const v14, 0x4197999a    # 18.95f

    .line 238
    .line 239
    .line 240
    const v15, 0x4100cccd    # 8.05f

    .line 241
    .line 242
    .line 243
    const/high16 v16, 0x41a00000    # 20.0f

    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x4101999a    # 8.1f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3fdc28f6    # 1.72f

    .line 255
    .line 256
    .line 257
    const v18, -0x4087ae14    # -0.97f

    .line 258
    .line 259
    .line 260
    const v13, 0x3f35c28f    # 0.71f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x3fae147b    # 1.36f

    .line 265
    .line 266
    .line 267
    const v16, -0x41428f5c    # -0.37f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x402ae148    # 2.67f

    .line 274
    .line 275
    .line 276
    const v2, -0x3f3b3333    # -6.15f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3e2e147b    # 0.17f

    .line 283
    .line 284
    .line 285
    const v18, -0x40b33333    # -0.8f

    .line 286
    .line 287
    .line 288
    const v13, 0x3de147ae    # 0.11f

    .line 289
    .line 290
    .line 291
    const/high16 v14, -0x41800000    # -0.25f

    .line 292
    .line 293
    const v15, 0x3e2e147b    # 0.17f

    .line 294
    .line 295
    .line 296
    const v16, -0x40fae148    # -0.52f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41300000    # 11.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, -0x40000000    # -2.0f

    .line 308
    .line 309
    const/high16 v18, -0x40000000    # -2.0f

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const v14, -0x40733333    # -1.1f

    .line 313
    .line 314
    .line 315
    const v15, -0x4099999a    # -0.9f

    .line 316
    .line 317
    .line 318
    const/high16 v16, -0x40000000    # -2.0f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, -0x3f500000    # -5.5f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x3f6b851f    # 0.92f

    .line 329
    .line 330
    .line 331
    const v2, -0x3f6b3333    # -4.65f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, -0x425c28f6    # -0.08f

    .line 338
    .line 339
    .line 340
    const v18, -0x40d70a3d    # -0.66f

    .line 341
    .line 342
    .line 343
    const v13, 0x3d4ccccd    # 0.05f

    .line 344
    .line 345
    .line 346
    const v14, -0x419eb852    # -0.22f

    .line 347
    .line 348
    .line 349
    const v15, 0x3ca3d70a    # 0.02f

    .line 350
    .line 351
    .line 352
    const v16, -0x41147ae1    # -0.46f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x409eb852    # -0.88f

    .line 359
    .line 360
    .line 361
    const v18, -0x4063d70a    # -1.22f

    .line 362
    .line 363
    .line 364
    const v13, -0x41947ae1    # -0.23f

    .line 365
    .line 366
    .line 367
    const v14, -0x4119999a    # -0.45f

    .line 368
    .line 369
    .line 370
    const v15, -0x40fae148    # -0.52f

    .line 371
    .line 372
    .line 373
    const v16, -0x40a3d70a    # -0.86f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41600000    # 14.0f

    .line 380
    .line 381
    const/high16 v2, 0x40000000    # 2.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x40800000    # 4.0f

    .line 390
    .line 391
    const/high16 v2, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40000000    # 2.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v18, -0x40800000    # -1.0f

    .line 414
    .line 415
    const v13, 0x3f0ccccd    # 0.55f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const/high16 v15, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const v16, -0x4119999a    # -0.45f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, -0x40800000    # -1.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, -0x40f33333    # -0.55f

    .line 436
    .line 437
    .line 438
    const v15, -0x4119999a    # -0.45f

    .line 439
    .line 440
    .line 441
    const/high16 v16, -0x40800000    # -1.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const/16 v16, 0x3800

    .line 454
    .line 455
    const/16 v17, 0x0

    .line 456
    .line 457
    const/high16 v6, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v8, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const/high16 v9, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/high16 v12, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const-string v4, ""

    .line 469
    .line 470
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    sput-object v0, Landroidx/compose/material/icons/filled/ThumbUpOffAltKt;->_thumbUpOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 479
    .line 480
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v0
.end method
