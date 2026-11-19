.class public final Landroidx/compose/material/icons/filled/PanoramaPhotosphereSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaPhotosphereSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaPhotosphereSelect(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaPhotosphereSelectKt;->_panoramaPhotosphereSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaPhotosphereSelect"

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
    const v0, 0x41b3eb85    # 22.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x410828f6    # 8.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x404ccccd    # -1.4f

    .line 80
    .line 81
    .line 82
    const v18, -0x40dc28f6    # -0.64f

    .line 83
    .line 84
    .line 85
    const v13, -0x410f5c29    # -0.47f

    .line 86
    .line 87
    .line 88
    const v14, -0x41947ae1    # -0.23f

    .line 89
    .line 90
    .line 91
    const v15, -0x4091eb85    # -0.93f

    .line 92
    .line 93
    .line 94
    const v16, -0x411eb852    # -0.44f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41400000    # 12.0f

    .line 101
    .line 102
    const/high16 v18, 0x40000000    # 2.0f

    .line 103
    .line 104
    const v13, 0x419c28f6    # 19.52f

    .line 105
    .line 106
    .line 107
    const v14, 0x408d1eb8    # 4.41f

    .line 108
    .line 109
    .line 110
    const v15, 0x41806666    # 16.05f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4039999a    # 2.9f

    .line 119
    .line 120
    .line 121
    const v2, 0x40fc28f6    # 7.88f

    .line 122
    .line 123
    .line 124
    const v4, 0x408f0a3d    # 4.47f

    .line 125
    .line 126
    .line 127
    const v6, 0x408d1eb8    # 4.41f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x404ccccd    # -1.4f

    .line 134
    .line 135
    .line 136
    const v18, 0x3f2147ae    # 0.63f

    .line 137
    .line 138
    .line 139
    const v13, -0x410f5c29    # -0.47f

    .line 140
    .line 141
    .line 142
    const v14, 0x3e4ccccd    # 0.2f

    .line 143
    .line 144
    .line 145
    const v15, -0x4091eb85    # -0.93f

    .line 146
    .line 147
    .line 148
    const v16, 0x3ed1eb85    # 0.41f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, -0x41000000    # -0.5f

    .line 155
    .line 156
    const v18, 0x3f547ae1    # 0.83f

    .line 157
    .line 158
    .line 159
    const v13, -0x416147ae    # -0.31f

    .line 160
    .line 161
    .line 162
    const v14, 0x3e19999a    # 0.15f

    .line 163
    .line 164
    .line 165
    const/high16 v15, -0x41000000    # -0.5f

    .line 166
    .line 167
    const v16, 0x3ef5c28f    # 0.48f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x40aa3d71    # 5.32f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x3f028f5c    # 0.51f

    .line 180
    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const v14, 0x3eb33333    # 0.35f

    .line 184
    .line 185
    .line 186
    const v15, 0x3e428f5c    # 0.19f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f2e147b    # 0.68f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x3fb1eb85    # 1.39f

    .line 196
    .line 197
    .line 198
    const v18, 0x3f23d70a    # 0.64f

    .line 199
    .line 200
    .line 201
    const v13, 0x3ef0a3d7    # 0.47f

    .line 202
    .line 203
    .line 204
    const v14, 0x3e6b851f    # 0.23f

    .line 205
    .line 206
    .line 207
    const v15, 0x3f6e147b    # 0.93f

    .line 208
    .line 209
    .line 210
    const v16, 0x3ee147ae    # 0.44f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x4191999a    # 18.2f

    .line 217
    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    const v13, 0x40633333    # 3.55f

    .line 222
    .line 223
    .line 224
    const v14, 0x40fa8f5c    # 7.83f

    .line 225
    .line 226
    .line 227
    const v15, 0x416a6666    # 14.65f

    .line 228
    .line 229
    .line 230
    const v16, 0x40fa3d71    # 7.82f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3fb1eb85    # 1.39f

    .line 237
    .line 238
    .line 239
    const v18, -0x40deb852    # -0.63f

    .line 240
    .line 241
    .line 242
    const v13, 0x3ef0a3d7    # 0.47f

    .line 243
    .line 244
    .line 245
    const v14, -0x41b33333    # -0.2f

    .line 246
    .line 247
    .line 248
    const v15, 0x3f6e147b    # 0.93f

    .line 249
    .line 250
    .line 251
    const v16, -0x412e147b    # -0.41f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3f028f5c    # 0.51f

    .line 258
    .line 259
    .line 260
    const v18, -0x40a8f5c3    # -0.84f

    .line 261
    .line 262
    .line 263
    const v13, 0x3e9eb852    # 0.31f

    .line 264
    .line 265
    .line 266
    const v14, -0x41d1eb85    # -0.17f

    .line 267
    .line 268
    .line 269
    const v15, 0x3f028f5c    # 0.51f

    .line 270
    .line 271
    .line 272
    const v16, -0x41051eb8    # -0.49f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x411570a4    # 9.34f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x40fd70a4    # -0.51f

    .line 285
    .line 286
    .line 287
    const v18, -0x40ab851f    # -0.83f

    .line 288
    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x414ccccd    # -0.35f

    .line 292
    .line 293
    .line 294
    const v15, -0x41bd70a4    # -0.19f

    .line 295
    .line 296
    .line 297
    const v16, -0x40d1eb85    # -0.68f

    .line 298
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
    const/high16 v0, 0x41400000    # 12.0f

    .line 307
    .line 308
    const v2, 0x40733333    # 3.8f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x40cd1eb8    # 6.41f

    .line 315
    .line 316
    .line 317
    const v18, 0x4047ae14    # 3.12f

    .line 318
    .line 319
    .line 320
    const v13, 0x40266666    # 2.6f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const v15, 0x409d1eb8    # 4.91f

    .line 325
    .line 326
    .line 327
    const v16, 0x3f9d70a4    # 1.23f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x3eb2b852    # -12.83f

    .line 334
    .line 335
    .line 336
    const v18, 0x3c23d70a    # 0.01f

    .line 337
    .line 338
    .line 339
    const v13, -0x3f7ccccd    # -4.1f

    .line 340
    .line 341
    .line 342
    const v14, -0x4067ae14    # -1.19f

    .line 343
    .line 344
    .line 345
    const v15, -0x3ef851ec    # -8.48f

    .line 346
    .line 347
    .line 348
    const v16, -0x405eb852    # -1.26f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x41400000    # 12.0f

    .line 355
    .line 356
    const v18, 0x40733333    # 3.8f

    .line 357
    .line 358
    .line 359
    const v13, 0x40e28f5c    # 7.08f

    .line 360
    .line 361
    .line 362
    const v14, 0x40a0f5c3    # 5.03f

    .line 363
    .line 364
    .line 365
    const v15, 0x41166666    # 9.4f

    .line 366
    .line 367
    .line 368
    const v16, 0x40733333    # 3.8f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40b33333    # 5.6f

    .line 378
    .line 379
    .line 380
    const v2, 0x4188a3d7    # 17.08f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x414d1eb8    # 12.82f

    .line 387
    .line 388
    .line 389
    const v18, -0x43dc28f6    # -0.01f

    .line 390
    .line 391
    .line 392
    const v13, 0x4086147b    # 4.19f

    .line 393
    .line 394
    .line 395
    const v14, 0x3f9c28f6    # 1.22f

    .line 396
    .line 397
    .line 398
    const v15, 0x41091eb8    # 8.57f

    .line 399
    .line 400
    .line 401
    const v16, 0x3f9d70a4    # 1.23f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x3f32e148    # -6.41f

    .line 408
    .line 409
    .line 410
    const v18, 0x404851ec    # 3.13f

    .line 411
    .line 412
    .line 413
    const v13, -0x403ae148    # -1.54f

    .line 414
    .line 415
    .line 416
    const v14, 0x3ffc28f6    # 1.97f

    .line 417
    .line 418
    .line 419
    const v15, -0x3f866666    # -3.9f

    .line 420
    .line 421
    .line 422
    const v16, 0x404851ec    # 3.13f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v18, -0x3fb851ec    # -3.12f

    .line 429
    .line 430
    .line 431
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const v15, -0x3f6428f6    # -4.87f

    .line 435
    .line 436
    .line 437
    const v16, -0x406ccccd    # -1.15f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const/16 v16, 0x3800

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v8, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    const/high16 v9, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v12, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaPhotosphereSelectKt;->_panoramaPhotosphereSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v0
.end method
