.class public final Landroidx/compose/material/icons/rounded/DirectionsRunKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsRun:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsRun(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DirectionsRunKt;->_directionsRun:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DirectionsRun"

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
    const v0, 0x4157d70a    # 13.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x40af5c29    # 5.48f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/high16 v18, -0x40000000    # -2.0f

    .line 82
    .line 83
    const v13, 0x3f8ccccd    # 1.1f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const/high16 v15, 0x40000000    # 2.0f

    .line 88
    .line 89
    const v16, -0x4099999a    # -0.9f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, -0x4099999a    # -0.9f

    .line 96
    .line 97
    .line 98
    const/high16 v2, -0x40000000    # -2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x3f666666    # 0.9f

    .line 104
    .line 105
    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v4, -0x40000000    # -2.0f

    .line 109
    .line 110
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x41251eb8    # 10.32f

    .line 120
    .line 121
    .line 122
    const v2, 0x418bd70a    # 17.48f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x3f11eb85    # 0.57f

    .line 129
    .line 130
    .line 131
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40066666    # 2.1f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40a00000    # 5.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/high16 v18, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const v14, 0x3f0ccccd    # 0.55f

    .line 155
    .line 156
    .line 157
    const v15, 0x3ee66666    # 0.45f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x3f800000    # 1.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x4119999a    # -0.45f

    .line 166
    .line 167
    .line 168
    const/high16 v2, -0x40800000    # -1.0f

    .line 169
    .line 170
    const/high16 v4, 0x3f800000    # 1.0f

    .line 171
    .line 172
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x3f4b851f    # -5.64f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x40e147ae    # -0.62f

    .line 182
    .line 183
    .line 184
    const v18, -0x40466666    # -1.45f

    .line 185
    .line 186
    .line 187
    const v14, -0x40f33333    # -0.55f

    .line 188
    .line 189
    .line 190
    const v15, -0x419eb852    # -0.22f

    .line 191
    .line 192
    .line 193
    const v16, -0x40770a3d    # -1.07f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, -0x40428f5c    # -1.48f

    .line 200
    .line 201
    .line 202
    const v2, -0x404b851f    # -1.41f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3f19999a    # 0.6f

    .line 209
    .line 210
    .line 211
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x408b851f    # 4.36f

    .line 217
    .line 218
    .line 219
    const v18, 0x401a3d71    # 2.41f

    .line 220
    .line 221
    .line 222
    const v13, 0x3f88f5c3    # 1.07f

    .line 223
    .line 224
    .line 225
    const v14, 0x3f9eb852    # 1.24f

    .line 226
    .line 227
    .line 228
    const v15, 0x4027ae14    # 2.62f

    .line 229
    .line 230
    .line 231
    const v16, 0x400851ec    # 2.13f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3f91eb85    # 1.14f

    .line 238
    .line 239
    .line 240
    const/high16 v18, -0x40800000    # -1.0f

    .line 241
    .line 242
    const v13, 0x3f19999a    # 0.6f

    .line 243
    .line 244
    .line 245
    const v14, 0x3db851ec    # 0.09f

    .line 246
    .line 247
    .line 248
    const v15, 0x3f91eb85    # 1.14f

    .line 249
    .line 250
    .line 251
    const v16, -0x413851ec    # -0.39f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x40a66666    # -0.85f

    .line 258
    .line 259
    .line 260
    const v18, -0x40851eb8    # -0.98f

    .line 261
    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, -0x41051eb8    # -0.49f

    .line 265
    .line 266
    .line 267
    const v15, -0x4147ae14    # -0.36f

    .line 268
    .line 269
    .line 270
    const v16, -0x4099999a    # -0.9f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x3fa33333    # -3.45f

    .line 277
    .line 278
    .line 279
    const v18, -0x3feae148    # -2.33f

    .line 280
    .line 281
    .line 282
    const v13, -0x403d70a4    # -1.52f

    .line 283
    .line 284
    .line 285
    const/high16 v14, -0x41800000    # -0.25f

    .line 286
    .line 287
    const v15, -0x3fce147b    # -2.78f

    .line 288
    .line 289
    .line 290
    const v16, -0x406ccccd    # -1.15f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, -0x40333333    # -1.6f

    .line 297
    .line 298
    .line 299
    const/high16 v2, -0x40800000    # -1.0f

    .line 300
    .line 301
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, -0x40266666    # -1.7f

    .line 305
    .line 306
    .line 307
    const/high16 v18, -0x40800000    # -1.0f

    .line 308
    .line 309
    const v13, -0x41333333    # -0.4f

    .line 310
    .line 311
    .line 312
    const v14, -0x40e66666    # -0.6f

    .line 313
    .line 314
    .line 315
    const/high16 v15, -0x40800000    # -1.0f

    .line 316
    .line 317
    const/high16 v16, -0x40800000    # -1.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x40b33333    # -0.8f

    .line 323
    .line 324
    .line 325
    const v18, 0x3dcccccd    # 0.1f

    .line 326
    .line 327
    .line 328
    const v13, -0x41666666    # -0.3f

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/high16 v15, -0x41000000    # -0.5f

    .line 333
    .line 334
    const v16, 0x3dcccccd    # 0.1f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x40e6b852    # 7.21f

    .line 341
    .line 342
    .line 343
    const v2, 0x40f851ec    # 7.76f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x4063d70a    # -1.22f

    .line 350
    .line 351
    .line 352
    const v18, 0x3feccccd    # 1.85f

    .line 353
    .line 354
    .line 355
    const v13, -0x40c28f5c    # -0.74f

    .line 356
    .line 357
    .line 358
    const v14, 0x3ea3d70a    # 0.32f

    .line 359
    .line 360
    .line 361
    const v15, -0x4063d70a    # -1.22f

    .line 362
    .line 363
    .line 364
    const v16, 0x3f851eb8    # 1.04f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4017ae14    # 2.37f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/high16 v18, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const v14, 0x3f0ccccd    # 0.55f

    .line 382
    .line 383
    .line 384
    const v15, 0x3ee66666    # 0.45f

    .line 385
    .line 386
    .line 387
    const/high16 v16, 0x3f800000    # 1.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x4119999a    # -0.45f

    .line 393
    .line 394
    .line 395
    const/high16 v2, -0x40800000    # -1.0f

    .line 396
    .line 397
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x3fe66666    # -2.4f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3fe66666    # 1.8f

    .line 407
    .line 408
    .line 409
    const v2, -0x40cccccd    # -0.7f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x4101999a    # 8.1f

    .line 416
    .line 417
    .line 418
    const v2, -0x40333333    # -1.6f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x3f851eb8    # -3.92f

    .line 425
    .line 426
    .line 427
    const v2, -0x40b33333    # -0.8f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x4068f5c3    # -1.18f

    .line 434
    .line 435
    .line 436
    const v18, 0x3f47ae14    # 0.78f

    .line 437
    .line 438
    .line 439
    const v13, -0x40f5c28f    # -0.54f

    .line 440
    .line 441
    .line 442
    const v14, -0x421eb852    # -0.11f

    .line 443
    .line 444
    .line 445
    const v15, -0x40770a3d    # -1.07f

    .line 446
    .line 447
    .line 448
    const v16, 0x3e75c28f    # 0.24f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x4045c28f    # 3.09f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x41880000    # 17.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3f47ae14    # 0.78f

    .line 463
    .line 464
    .line 465
    const v18, 0x3f970a3d    # 1.18f

    .line 466
    .line 467
    .line 468
    const v13, -0x421eb852    # -0.11f

    .line 469
    .line 470
    .line 471
    const v14, 0x3f0a3d71    # 0.54f

    .line 472
    .line 473
    .line 474
    const v15, 0x3e75c28f    # 0.24f

    .line 475
    .line 476
    .line 477
    const v16, 0x3f88f5c3    # 1.07f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x4083851f    # 4.11f

    .line 484
    .line 485
    .line 486
    const v2, 0x3f51eb85    # 0.82f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x4015c28f    # 2.34f

    .line 493
    .line 494
    .line 495
    const v18, -0x403d70a4    # -1.52f

    .line 496
    .line 497
    .line 498
    const v13, 0x3f87ae14    # 1.06f

    .line 499
    .line 500
    .line 501
    const v14, 0x3e570a3d    # 0.21f

    .line 502
    .line 503
    .line 504
    const v15, 0x40066666    # 2.1f

    .line 505
    .line 506
    .line 507
    const v16, -0x41147ae1    # -0.46f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    const/16 v16, 0x3800

    .line 521
    .line 522
    const/16 v17, 0x0

    .line 523
    .line 524
    const/high16 v6, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/high16 v8, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const/high16 v9, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v12, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v13, 0x0

    .line 534
    const/4 v14, 0x0

    .line 535
    const/4 v15, 0x0

    .line 536
    const-string v4, ""

    .line 537
    .line 538
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    sput-object v0, Landroidx/compose/material/icons/rounded/DirectionsRunKt;->_directionsRun:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    return-object v0
.end method

.method public static synthetic getDirectionsRun$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
