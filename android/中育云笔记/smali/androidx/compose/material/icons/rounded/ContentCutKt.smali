.class public final Landroidx/compose/material/icons/rounded/ContentCutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contentCut:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContentCut(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ContentCutKt;->_contentCut:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ContentCut"

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
    const v0, 0x40f47ae1    # 7.64f

    .line 71
    .line 72
    .line 73
    const v2, 0x411a3d71    # 9.64f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3eae147b    # 0.34f

    .line 80
    .line 81
    .line 82
    const v18, -0x3ffa3d71    # -2.09f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e947ae1    # 0.29f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e147ae    # -0.62f

    .line 89
    .line 90
    .line 91
    const v15, 0x3ed70a3d    # 0.42f

    .line 92
    .line 93
    .line 94
    const v16, -0x4055c28f    # -1.33f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3faf5c29    # -3.26f

    .line 101
    .line 102
    .line 103
    const v18, -0x3fa0a3d7    # -3.49f

    .line 104
    .line 105
    .line 106
    const v13, -0x41bd70a4    # -0.19f

    .line 107
    .line 108
    .line 109
    const v14, -0x40228f5c    # -1.73f

    .line 110
    .line 111
    .line 112
    const v15, -0x403ae148    # -1.54f

    .line 113
    .line 114
    .line 115
    const v16, -0x3fb33333    # -3.2f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x3f6ae148    # -4.66f

    .line 122
    .line 123
    .line 124
    const v18, 0x4094cccd    # 4.65f

    .line 125
    .line 126
    .line 127
    const v13, -0x3fceb852    # -2.77f

    .line 128
    .line 129
    .line 130
    const v14, -0x410a3d71    # -0.48f

    .line 131
    .line 132
    .line 133
    const v15, -0x3f5b851f    # -5.14f

    .line 134
    .line 135
    .line 136
    const v16, 0x3ff1eb85    # 1.89f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x405f5c29    # 3.49f

    .line 143
    .line 144
    .line 145
    const v18, 0x4050a3d7    # 3.26f

    .line 146
    .line 147
    .line 148
    const v13, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const v14, 0x3fdc28f6    # 1.72f

    .line 152
    .line 153
    .line 154
    const v15, 0x3fe147ae    # 1.76f

    .line 155
    .line 156
    .line 157
    const v16, 0x40447ae1    # 3.07f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x4005c28f    # 2.09f

    .line 164
    .line 165
    .line 166
    const v18, -0x4151eb85    # -0.34f

    .line 167
    .line 168
    .line 169
    const v13, 0x3f428f5c    # 0.76f

    .line 170
    .line 171
    .line 172
    const v14, 0x3da3d70a    # 0.08f

    .line 173
    .line 174
    .line 175
    const v15, 0x3fbae148    # 1.46f

    .line 176
    .line 177
    .line 178
    const v16, -0x42b33333    # -0.05f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, 0x41200000    # 10.0f

    .line 185
    .line 186
    const/high16 v2, 0x41400000    # 12.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, -0x3fe8f5c3    # -2.36f

    .line 192
    .line 193
    .line 194
    const v2, 0x40170a3d    # 2.36f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, -0x3ffa3d71    # -2.09f

    .line 201
    .line 202
    .line 203
    const v13, -0x40e147ae    # -0.62f

    .line 204
    .line 205
    .line 206
    const v14, -0x416b851f    # -0.29f

    .line 207
    .line 208
    .line 209
    const v15, -0x4055c28f    # -1.33f

    .line 210
    .line 211
    .line 212
    const v16, -0x4128f5c3    # -0.42f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x3fa0a3d7    # -3.49f

    .line 219
    .line 220
    .line 221
    const v18, 0x4050a3d7    # 3.26f

    .line 222
    .line 223
    .line 224
    const v13, -0x40228f5c    # -1.73f

    .line 225
    .line 226
    .line 227
    const v14, 0x3e428f5c    # 0.19f

    .line 228
    .line 229
    .line 230
    const v15, -0x3fb33333    # -3.2f

    .line 231
    .line 232
    .line 233
    const v16, 0x3fc51eb8    # 1.54f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x4094cccd    # 4.65f

    .line 240
    .line 241
    .line 242
    const v18, 0x4094cccd    # 4.65f

    .line 243
    .line 244
    .line 245
    const v13, -0x410a3d71    # -0.48f

    .line 246
    .line 247
    .line 248
    const v14, 0x403147ae    # 2.77f

    .line 249
    .line 250
    .line 251
    const v15, 0x3ff1eb85    # 1.89f

    .line 252
    .line 253
    .line 254
    const v16, 0x40a428f6    # 5.13f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x4050a3d7    # 3.26f

    .line 261
    .line 262
    .line 263
    const v18, -0x3fa0a3d7    # -3.49f

    .line 264
    .line 265
    .line 266
    const v13, 0x3fdc28f6    # 1.72f

    .line 267
    .line 268
    .line 269
    const v14, -0x41666666    # -0.3f

    .line 270
    .line 271
    .line 272
    const v15, 0x40447ae1    # 3.07f

    .line 273
    .line 274
    .line 275
    const v16, -0x401eb852    # -1.76f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x4151eb85    # -0.34f

    .line 282
    .line 283
    .line 284
    const v18, -0x3ffa3d71    # -2.09f

    .line 285
    .line 286
    .line 287
    const v13, 0x3da3d70a    # 0.08f

    .line 288
    .line 289
    .line 290
    const v14, -0x40bd70a4    # -0.76f

    .line 291
    .line 292
    .line 293
    const v15, -0x42b33333    # -0.05f

    .line 294
    .line 295
    .line 296
    const v16, -0x40451eb8    # -1.46f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41600000    # 14.0f

    .line 303
    .line 304
    const/high16 v2, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x40f2e148    # 7.59f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x401a3d71    # 2.41f

    .line 316
    .line 317
    .line 318
    const/high16 v18, -0x40800000    # -1.0f

    .line 319
    .line 320
    const v13, 0x3f63d70a    # 0.89f

    .line 321
    .line 322
    .line 323
    const v14, 0x3f63d70a    # 0.89f

    .line 324
    .line 325
    .line 326
    const v15, 0x401a3d71    # 2.41f

    .line 327
    .line 328
    .line 329
    const v16, 0x3e851eb8    # 0.26f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, -0x43dc28f6    # -0.01f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x412e147b    # -0.41f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x41428f5c    # -0.37f

    .line 346
    .line 347
    .line 348
    const v15, -0x41e66666    # -0.15f

    .line 349
    .line 350
    .line 351
    const v16, -0x40c51eb8    # -0.73f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40f47ae1    # 7.64f

    .line 358
    .line 359
    .line 360
    const v2, 0x411a3d71    # 9.64f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x41000000    # 8.0f

    .line 370
    .line 371
    const/high16 v2, 0x40c00000    # 6.0f

    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, -0x40000000    # -2.0f

    .line 377
    .line 378
    const/high16 v18, -0x40000000    # -2.0f

    .line 379
    .line 380
    const v13, -0x40733333    # -1.1f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const/high16 v15, -0x40000000    # -2.0f

    .line 385
    .line 386
    const v16, -0x409c28f6    # -0.89f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3f666666    # 0.9f

    .line 393
    .line 394
    .line 395
    const/high16 v2, -0x40000000    # -2.0f

    .line 396
    .line 397
    const/high16 v4, 0x40000000    # 2.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3f63d70a    # 0.89f

    .line 403
    .line 404
    .line 405
    const/high16 v2, 0x40000000    # 2.0f

    .line 406
    .line 407
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x4099999a    # -0.9f

    .line 411
    .line 412
    .line 413
    const/high16 v2, -0x40000000    # -2.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41a00000    # 20.0f

    .line 422
    .line 423
    const/high16 v2, 0x40c00000    # 6.0f

    .line 424
    .line 425
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x3f666666    # 0.9f

    .line 432
    .line 433
    .line 434
    const/high16 v2, -0x40000000    # -2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x3f63d70a    # 0.89f

    .line 440
    .line 441
    .line 442
    const/high16 v2, 0x40000000    # 2.0f

    .line 443
    .line 444
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x4099999a    # -0.9f

    .line 448
    .line 449
    .line 450
    const/high16 v2, -0x40000000    # -2.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41480000    # 12.5f

    .line 459
    .line 460
    const/high16 v2, 0x41400000    # 12.0f

    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, -0x41000000    # -0.5f

    .line 466
    .line 467
    const/high16 v18, -0x41000000    # -0.5f

    .line 468
    .line 469
    const v13, -0x4170a3d7    # -0.28f

    .line 470
    .line 471
    .line 472
    const/high16 v15, -0x41000000    # -0.5f

    .line 473
    .line 474
    const v16, -0x419eb852    # -0.22f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x3e6147ae    # 0.22f

    .line 481
    .line 482
    .line 483
    const/high16 v2, -0x41000000    # -0.5f

    .line 484
    .line 485
    const/high16 v4, 0x3f000000    # 0.5f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v2, 0x3f000000    # 0.5f

    .line 491
    .line 492
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x419eb852    # -0.22f

    .line 496
    .line 497
    .line 498
    const/high16 v2, -0x41000000    # -0.5f

    .line 499
    .line 500
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x419cb852    # 19.59f

    .line 507
    .line 508
    .line 509
    const v2, 0x401a3d71    # 2.41f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41500000    # 13.0f

    .line 516
    .line 517
    const/high16 v2, 0x41100000    # 9.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40000000    # 2.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x40d2e148    # 6.59f

    .line 528
    .line 529
    .line 530
    const v2, -0x3f2d1eb8    # -6.59f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x3ed1eb85    # 0.41f

    .line 537
    .line 538
    .line 539
    const/high16 v18, -0x40800000    # -1.0f

    .line 540
    .line 541
    const v13, 0x3e851eb8    # 0.26f

    .line 542
    .line 543
    .line 544
    const v14, -0x417ae148    # -0.26f

    .line 545
    .line 546
    .line 547
    const v15, 0x3ed1eb85    # 0.41f

    .line 548
    .line 549
    .line 550
    const v16, -0x40e147ae    # -0.62f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41b00000    # 22.0f

    .line 557
    .line 558
    const v2, 0x4059999a    # 3.4f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x3fe5c28f    # -2.41f

    .line 565
    .line 566
    .line 567
    const v18, -0x40828f5c    # -0.99f

    .line 568
    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const/high16 v14, -0x40600000    # -1.25f

    .line 572
    .line 573
    const v15, -0x403d70a4    # -1.52f

    .line 574
    .line 575
    .line 576
    const v16, -0x400f5c29    # -1.88f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/16 v16, 0x3800

    .line 590
    .line 591
    const/16 v17, 0x0

    .line 592
    .line 593
    const/high16 v6, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v8, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/high16 v9, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v12, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v14, 0x0

    .line 603
    const/4 v15, 0x0

    .line 604
    const-string v4, ""

    .line 605
    .line 606
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    sput-object v0, Landroidx/compose/material/icons/rounded/ContentCutKt;->_contentCut:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 615
    .line 616
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    return-object v0
.end method
