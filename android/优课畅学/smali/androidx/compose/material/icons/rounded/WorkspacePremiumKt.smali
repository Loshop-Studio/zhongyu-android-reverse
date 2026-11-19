.class public final Landroidx/compose/material/icons/rounded/WorkspacePremiumKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _workspacePremium:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWorkspacePremium(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WorkspacePremiumKt;->_workspacePremium:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WorkspacePremium"

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
    const v0, 0x412eb852    # 10.92f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x414c0000    # 12.75f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x413ee148    # 11.93f

    .line 79
    .line 80
    .line 81
    const/high16 v2, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, 0x3f88f5c3    # 1.07f

    .line 87
    .line 88
    .line 89
    const v2, 0x3f4f5c29    # 0.81f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, 0x3f47ae14    # 0.78f

    .line 96
    .line 97
    .line 98
    const v18, -0x40f33333    # -0.55f

    .line 99
    .line 100
    .line 101
    const v13, 0x3ec7ae14    # 0.39f

    .line 102
    .line 103
    .line 104
    const v14, 0x3e947ae1    # 0.29f

    .line 105
    .line 106
    .line 107
    const v15, 0x3f6b851f    # 0.92f

    .line 108
    .line 109
    .line 110
    const v16, -0x425c28f6    # -0.08f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, -0x4051eb85    # -1.36f

    .line 117
    .line 118
    .line 119
    const v2, -0x4128f5c3    # -0.42f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x3f99999a    # 1.2f

    .line 126
    .line 127
    .line 128
    const v2, -0x408ccccd    # -0.95f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, 0x4164f5c3    # 14.31f

    .line 135
    .line 136
    .line 137
    const/high16 v18, 0x41100000    # 9.0f

    .line 138
    .line 139
    const/high16 v13, 0x41700000    # 15.0f

    .line 140
    .line 141
    const v14, 0x4119999a    # 9.6f

    .line 142
    .line 143
    .line 144
    const v15, 0x416ca3d7    # 14.79f

    .line 145
    .line 146
    .line 147
    const/high16 v16, 0x41100000    # 9.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, -0x404ccccd    # -1.4f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x4123d70a    # -0.43f

    .line 159
    .line 160
    .line 161
    const v2, -0x40547ae1    # -1.34f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, -0x408ccccd    # -0.95f

    .line 168
    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    const v13, -0x41e66666    # -0.15f

    .line 173
    .line 174
    .line 175
    const v14, -0x41147ae1    # -0.46f

    .line 176
    .line 177
    .line 178
    const v15, -0x40b33333    # -0.8f

    .line 179
    .line 180
    .line 181
    const v16, -0x41147ae1    # -0.46f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x413170a4    # 11.09f

    .line 188
    .line 189
    .line 190
    const/high16 v2, 0x41100000    # 9.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x411ae148    # 9.68f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x4115eb85    # 9.37f

    .line 202
    .line 203
    .line 204
    const v18, 0x411e3d71    # 9.89f

    .line 205
    .line 206
    .line 207
    const v13, 0x41135c29    # 9.21f

    .line 208
    .line 209
    .line 210
    const/high16 v14, 0x41100000    # 9.0f

    .line 211
    .line 212
    const/high16 v15, 0x41100000    # 9.0f

    .line 213
    .line 214
    const v16, 0x4119999a    # 9.6f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3f9851ec    # 1.19f

    .line 221
    .line 222
    .line 223
    const v2, 0x3f733333    # 0.95f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x3fae147b    # 1.36f

    .line 230
    .line 231
    .line 232
    const v2, -0x4128f5c3    # -0.42f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x412eb852    # 10.92f

    .line 239
    .line 240
    .line 241
    const/high16 v18, 0x414c0000    # 12.75f

    .line 242
    .line 243
    const/high16 v13, 0x41200000    # 10.0f

    .line 244
    .line 245
    const v14, 0x414ab852    # 12.67f

    .line 246
    .line 247
    .line 248
    const v15, 0x41287ae1    # 10.53f

    .line 249
    .line 250
    .line 251
    const v16, 0x4150a3d7    # 13.04f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x41ace148    # 21.61f

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x40c00000    # 6.0f

    .line 264
    .line 265
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3fa8f5c3    # 1.32f

    .line 269
    .line 270
    .line 271
    const v18, 0x3f733333    # 0.95f

    .line 272
    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const v14, 0x3f2e147b    # 0.68f

    .line 276
    .line 277
    .line 278
    const v15, 0x3f2b851f    # 0.67f

    .line 279
    .line 280
    .line 281
    const v16, 0x3f947ae1    # 1.16f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41a80000    # 21.0f

    .line 288
    .line 289
    const/high16 v2, 0x41400000    # 12.0f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x4095c28f    # 4.68f

    .line 295
    .line 296
    .line 297
    const v2, 0x3fc7ae14    # 1.56f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41900000    # 18.0f

    .line 304
    .line 305
    const v18, 0x41ace148    # 21.61f

    .line 306
    .line 307
    .line 308
    const v13, 0x418aa3d7    # 17.33f

    .line 309
    .line 310
    .line 311
    const v14, 0x41b63d71    # 22.78f

    .line 312
    .line 313
    .line 314
    const/high16 v15, 0x41900000    # 18.0f

    .line 315
    .line 316
    const v16, 0x41b26666    # 22.3f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x3f3570a4    # -6.33f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x40000000    # 2.0f

    .line 329
    .line 330
    const v18, -0x3f570a3d    # -5.28f

    .line 331
    .line 332
    .line 333
    const v13, 0x3f9eb852    # 1.24f

    .line 334
    .line 335
    .line 336
    const v14, -0x404b851f    # -1.41f

    .line 337
    .line 338
    .line 339
    const/high16 v15, 0x40000000    # 2.0f

    .line 340
    .line 341
    const/high16 v16, -0x3fb00000    # -3.25f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, -0x3f000000    # -8.0f

    .line 347
    .line 348
    const/high16 v18, -0x3f000000    # -8.0f

    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    const v14, -0x3f728f5c    # -4.42f

    .line 352
    .line 353
    .line 354
    const v15, -0x3f9ae148    # -3.58f

    .line 355
    .line 356
    .line 357
    const/high16 v16, -0x3f000000    # -8.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x40651eb8    # 3.58f

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x41000000    # 8.0f

    .line 366
    .line 367
    const/high16 v4, -0x3f000000    # -8.0f

    .line 368
    .line 369
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x40000000    # 2.0f

    .line 373
    .line 374
    const v18, 0x40a8f5c3    # 5.28f

    .line 375
    .line 376
    .line 377
    const v14, 0x4001eb85    # 2.03f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f428f5c    # 0.76f

    .line 381
    .line 382
    .line 383
    const v16, 0x4077ae14    # 3.87f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x41ace148    # 21.61f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40800000    # 4.0f

    .line 399
    .line 400
    const/high16 v2, 0x41400000    # 12.0f

    .line 401
    .line 402
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x40c00000    # 6.0f

    .line 406
    .line 407
    const/high16 v18, 0x40c00000    # 6.0f

    .line 408
    .line 409
    const v13, 0x4053d70a    # 3.31f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, 0x40c00000    # 6.0f

    .line 414
    .line 415
    const v16, 0x402c28f6    # 2.69f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, -0x3fd3d70a    # -2.69f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x40c00000    # 6.0f

    .line 425
    .line 426
    const/high16 v4, -0x3f400000    # -6.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v2, -0x3f400000    # -6.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x410b0a3d    # 8.69f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x40800000    # 4.0f

    .line 440
    .line 441
    const/high16 v4, 0x41400000    # 12.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/WorkspacePremiumKt;->_workspacePremium:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 479
    .line 480
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v0
.end method
