.class public final Landroidx/compose/material/icons/rounded/AlternateEmailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlternateEmail(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AlternateEmailKt;->_alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AlternateEmail"

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
    const v0, 0x414b851f    # 12.72f

    .line 71
    .line 72
    .line 73
    const v2, 0x4001eb85    # 2.03f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4001eb85    # 2.03f

    .line 80
    .line 81
    .line 82
    const v18, 0x414b851f    # 12.72f

    .line 83
    .line 84
    .line 85
    const v13, 0x40d428f6    # 6.63f

    .line 86
    .line 87
    .line 88
    const v14, 0x3fcccccd    # 1.6f

    .line 89
    .line 90
    .line 91
    const v15, 0x3fcccccd    # 1.6f

    .line 92
    .line 93
    .line 94
    const v16, 0x40d428f6    # 6.63f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x4144f5c3    # 12.31f

    .line 101
    .line 102
    .line 103
    const/high16 v18, 0x41b00000    # 22.0f

    .line 104
    .line 105
    const v13, 0x4018f5c3    # 2.39f

    .line 106
    .line 107
    .line 108
    const v14, 0x4190147b    # 18.01f

    .line 109
    .line 110
    .line 111
    const v15, 0x40e051ec    # 7.01f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x41b00000    # 22.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41800000    # 16.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/high16 v18, -0x40800000    # -1.0f

    .line 127
    .line 128
    const v13, 0x3f0ccccd    # 0.55f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/high16 v15, 0x3f800000    # 1.0f

    .line 133
    .line 134
    const v16, -0x4119999a    # -0.45f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, -0x4119999a    # -0.45f

    .line 141
    .line 142
    .line 143
    const/high16 v2, -0x40800000    # -1.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x3f951eb8    # -3.67f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, -0x3efeb852    # -8.08f

    .line 155
    .line 156
    .line 157
    const v18, -0x3f3f0a3d    # -6.03f

    .line 158
    .line 159
    .line 160
    const v13, -0x3f9147ae    # -3.73f

    .line 161
    .line 162
    .line 163
    const v15, -0x3f1b3333    # -7.15f

    .line 164
    .line 165
    .line 166
    const v16, -0x3fe51eb8    # -2.42f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x411b5c29    # 9.71f

    .line 173
    .line 174
    .line 175
    const v18, -0x3ee4a3d7    # -9.71f

    .line 176
    .line 177
    .line 178
    const v13, -0x404147ae    # -1.49f

    .line 179
    .line 180
    .line 181
    const v14, -0x3f466666    # -5.8f

    .line 182
    .line 183
    .line 184
    const v15, 0x407a3d71    # 3.91f

    .line 185
    .line 186
    .line 187
    const v16, -0x3ecca3d7    # -11.21f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x41a00000    # 20.0f

    .line 194
    .line 195
    const v18, 0x414547ae    # 12.33f

    .line 196
    .line 197
    .line 198
    const v13, 0x418ca3d7    # 17.58f

    .line 199
    .line 200
    .line 201
    const v14, 0x40a5c28f    # 5.18f

    .line 202
    .line 203
    .line 204
    const/high16 v15, 0x41a00000    # 20.0f

    .line 205
    .line 206
    const v16, 0x4109999a    # 8.6f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3f8ccccd    # 1.1f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x40400000    # -1.5f

    .line 219
    .line 220
    const v18, 0x3fc8f5c3    # 1.57f

    .line 221
    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, 0x3f4a3d71    # 0.79f

    .line 225
    .line 226
    .line 227
    const v15, -0x40ca3d71    # -0.71f

    .line 228
    .line 229
    .line 230
    const v16, 0x3fc8f5c3    # 1.57f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x40b851ec    # -0.78f

    .line 237
    .line 238
    .line 239
    const v2, -0x40370a3d    # -1.57f

    .line 240
    .line 241
    .line 242
    const/high16 v4, -0x40400000    # -1.5f

    .line 243
    .line 244
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, -0x40600000    # -1.25f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x3f77ae14    # -4.26f

    .line 253
    .line 254
    .line 255
    const v18, -0x3f5c28f6    # -5.12f

    .line 256
    .line 257
    .line 258
    const v14, -0x3fdf5c29    # -2.51f

    .line 259
    .line 260
    .line 261
    const v15, -0x401c28f6    # -1.78f

    .line 262
    .line 263
    .line 264
    const v16, -0x3f675c29    # -4.77f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x3f4ae148    # -5.66f

    .line 271
    .line 272
    .line 273
    const v18, 0x40bbd70a    # 5.87f

    .line 274
    .line 275
    .line 276
    const v13, -0x3fa66666    # -3.4f

    .line 277
    .line 278
    .line 279
    const v14, -0x41051eb8    # -0.49f

    .line 280
    .line 281
    .line 282
    const v15, -0x3f375c29    # -6.27f

    .line 283
    .line 284
    .line 285
    const v16, 0x401ccccd    # 2.45f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, 0x406e147b    # 3.72f

    .line 292
    .line 293
    .line 294
    const v18, 0x407c28f6    # 3.94f

    .line 295
    .line 296
    .line 297
    const v13, 0x3eae147b    # 0.34f

    .line 298
    .line 299
    .line 300
    const v14, 0x3ff47ae1    # 1.91f

    .line 301
    .line 302
    .line 303
    const v15, 0x3fea3d71    # 1.83f

    .line 304
    .line 305
    .line 306
    const v16, 0x405f5c29    # 3.49f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x4097ae14    # 4.74f

    .line 313
    .line 314
    .line 315
    const v18, -0x4055c28f    # -1.33f

    .line 316
    .line 317
    .line 318
    const v13, 0x3feb851f    # 1.84f

    .line 319
    .line 320
    .line 321
    const v14, 0x3edc28f6    # 0.43f

    .line 322
    .line 323
    .line 324
    const v15, 0x4065c28f    # 3.59f

    .line 325
    .line 326
    .line 327
    const v16, -0x41dc28f6    # -0.16f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x4089999a    # 4.3f

    .line 334
    .line 335
    .line 336
    const v18, 0x3f9ae148    # 1.21f

    .line 337
    .line 338
    .line 339
    const v13, 0x3f63d70a    # 0.89f

    .line 340
    .line 341
    .line 342
    const v14, 0x3f9c28f6    # 1.22f

    .line 343
    .line 344
    .line 345
    const v15, 0x402ae148    # 2.67f

    .line 346
    .line 347
    .line 348
    const v16, 0x3fee147b    # 1.86f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x400a3d71    # 2.16f

    .line 355
    .line 356
    .line 357
    const v18, -0x3faa3d71    # -3.34f

    .line 358
    .line 359
    .line 360
    const v13, 0x3fab851f    # 1.34f

    .line 361
    .line 362
    .line 363
    const v14, -0x40f851ec    # -0.53f

    .line 364
    .line 365
    .line 366
    const v15, 0x400a3d71    # 2.16f

    .line 367
    .line 368
    .line 369
    const v16, -0x400ccccd    # -1.9f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x40747ae1    # -1.09f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x3eeb851f    # -9.28f

    .line 382
    .line 383
    .line 384
    const v18, -0x3edb5c29    # -10.29f

    .line 385
    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    const v14, -0x3f56147b    # -5.31f

    .line 389
    .line 390
    .line 391
    const v15, -0x3f80a3d7    # -3.99f

    .line 392
    .line 393
    .line 394
    const v16, -0x3ee11eb8    # -9.93f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41400000    # 12.0f

    .line 404
    .line 405
    const/high16 v2, 0x41700000    # 15.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 411
    .line 412
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 413
    .line 414
    const v13, -0x402b851f    # -1.66f

    .line 415
    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 419
    .line 420
    const v16, -0x40547ae1    # -1.34f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3fab851f    # 1.34f

    .line 427
    .line 428
    .line 429
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 430
    .line 431
    const/high16 v4, 0x40400000    # 3.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x40400000    # 3.0f

    .line 437
    .line 438
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x40547ae1    # -1.34f

    .line 442
    .line 443
    .line 444
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    const/16 v16, 0x3800

    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    const/high16 v6, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/high16 v8, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/4 v7, 0x0

    .line 465
    const/high16 v9, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v12, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const/4 v15, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    sput-object v0, Landroidx/compose/material/icons/rounded/AlternateEmailKt;->_alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-object v0
.end method
