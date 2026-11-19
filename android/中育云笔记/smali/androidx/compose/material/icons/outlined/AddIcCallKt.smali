.class public final Landroidx/compose/material/icons/outlined/AddIcCallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddIcCall(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AddIcCallKt;->_addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AddIcCall"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const v2, 0x41773333    # 15.45f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3f9b851f    # -3.57f

    .line 79
    .line 80
    .line 81
    const v18, -0x40ee147b    # -0.57f

    .line 82
    .line 83
    .line 84
    const/high16 v13, -0x40600000    # -1.25f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fe33333    # -2.45f

    .line 88
    .line 89
    .line 90
    const v16, -0x41b33333    # -0.2f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x416147ae    # -0.31f

    .line 97
    .line 98
    .line 99
    const v18, -0x42b33333    # -0.05f

    .line 100
    .line 101
    .line 102
    const v13, -0x42333333    # -0.1f

    .line 103
    .line 104
    .line 105
    const v14, -0x430a3d71    # -0.03f

    .line 106
    .line 107
    .line 108
    const v15, -0x41a8f5c3    # -0.21f

    .line 109
    .line 110
    .line 111
    const v16, -0x42b33333    # -0.05f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40ca3d71    # -0.71f

    .line 118
    .line 119
    .line 120
    const v18, 0x3e947ae1    # 0.29f

    .line 121
    .line 122
    .line 123
    const v13, -0x417ae148    # -0.26f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x40fd70a4    # -0.51f

    .line 128
    .line 129
    .line 130
    const v16, 0x3dcccccd    # 0.1f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, -0x3ff33333    # -2.2f

    .line 137
    .line 138
    .line 139
    const v2, 0x400ccccd    # 2.2f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x3f2d1eb8    # -6.59f

    .line 146
    .line 147
    .line 148
    const v18, -0x3f2d1eb8    # -6.59f

    .line 149
    .line 150
    .line 151
    const v13, -0x3fcae148    # -2.83f

    .line 152
    .line 153
    .line 154
    const v14, -0x4047ae14    # -1.44f

    .line 155
    .line 156
    .line 157
    const v15, -0x3f5b3333    # -5.15f

    .line 158
    .line 159
    .line 160
    const/high16 v16, -0x3f900000    # -3.75f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x3ff28f5c    # -2.21f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x3e800000    # 0.25f

    .line 172
    .line 173
    const/high16 v18, -0x40800000    # -1.0f

    .line 174
    .line 175
    const v13, 0x3e8f5c29    # 0.28f

    .line 176
    .line 177
    .line 178
    const v14, -0x417ae148    # -0.26f

    .line 179
    .line 180
    .line 181
    const v15, 0x3eb851ec    # 0.36f

    .line 182
    .line 183
    .line 184
    const v16, -0x40d9999a    # -0.65f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x41080000    # 8.5f

    .line 191
    .line 192
    const v18, 0x407ccccd    # 3.95f

    .line 193
    .line 194
    .line 195
    const v13, 0x410b3333    # 8.7f

    .line 196
    .line 197
    .line 198
    const v14, 0x40cccccd    # 6.4f

    .line 199
    .line 200
    .line 201
    const/high16 v15, 0x41080000    # 8.5f

    .line 202
    .line 203
    const v16, 0x40a66666    # 5.2f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, -0x40800000    # -1.0f

    .line 210
    .line 211
    const/high16 v18, -0x40800000    # -1.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const v14, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    const v15, -0x4119999a    # -0.45f

    .line 218
    .line 219
    .line 220
    const/high16 v16, -0x40800000    # -1.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40800000    # 4.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v18, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const v13, -0x40f33333    # -0.55f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/high16 v15, -0x40800000    # -1.0f

    .line 237
    .line 238
    const v16, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x41880000    # 17.0f

    .line 245
    .line 246
    const/high16 v18, 0x41880000    # 17.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, 0x41163d71    # 9.39f

    .line 250
    .line 251
    .line 252
    const v15, 0x40f3851f    # 7.61f

    .line 253
    .line 254
    .line 255
    const/high16 v16, 0x41880000    # 17.0f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/high16 v18, -0x40800000    # -1.0f

    .line 263
    .line 264
    const v13, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const/high16 v15, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v16, -0x4119999a    # -0.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, -0x40800000    # -1.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const v14, -0x40f33333    # -0.55f

    .line 285
    .line 286
    .line 287
    const v15, -0x4119999a    # -0.45f

    .line 288
    .line 289
    .line 290
    const/high16 v16, -0x40800000    # -1.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x40a0f5c3    # 5.03f

    .line 299
    .line 300
    .line 301
    const v2, 0x409e6666    # 4.95f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    const v18, 0x40251eb8    # 2.58f

    .line 316
    .line 317
    .line 318
    const v13, 0x3d8f5c29    # 0.07f

    .line 319
    .line 320
    .line 321
    const v14, 0x3f6147ae    # 0.88f

    .line 322
    .line 323
    .line 324
    const v15, 0x3e6147ae    # 0.22f

    .line 325
    .line 326
    .line 327
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x3f9ae148    # 1.21f

    .line 333
    .line 334
    .line 335
    const v2, -0x40666666    # -1.2f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, -0x40c00000    # -0.75f

    .line 342
    .line 343
    const v18, -0x3f8d70a4    # -3.79f

    .line 344
    .line 345
    .line 346
    const v13, -0x41333333    # -0.4f

    .line 347
    .line 348
    .line 349
    const v14, -0x40651eb8    # -1.21f

    .line 350
    .line 351
    .line 352
    const v15, -0x40d70a3d    # -0.66f

    .line 353
    .line 354
    .line 355
    const v16, -0x3fe1eb85    # -2.47f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x41980000    # 19.0f

    .line 365
    .line 366
    const v2, 0x41975c29    # 18.92f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x3f8ccccd    # -3.8f

    .line 373
    .line 374
    .line 375
    const v18, -0x40bd70a4    # -0.76f

    .line 376
    .line 377
    .line 378
    const v13, -0x40570a3d    # -1.32f

    .line 379
    .line 380
    .line 381
    const v14, -0x4247ae14    # -0.09f

    .line 382
    .line 383
    .line 384
    const v15, -0x3fd9999a    # -2.6f

    .line 385
    .line 386
    .line 387
    const v16, -0x414ccccd    # -0.35f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x3f99999a    # 1.2f

    .line 394
    .line 395
    .line 396
    const v2, -0x40666666    # -1.2f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40266666    # 2.6f

    .line 403
    .line 404
    .line 405
    const v18, 0x3ee66666    # 0.45f

    .line 406
    .line 407
    .line 408
    const v13, 0x3f59999a    # 0.85f

    .line 409
    .line 410
    .line 411
    const v14, 0x3e75c28f    # 0.24f

    .line 412
    .line 413
    .line 414
    const v15, 0x3fdc28f6    # 1.72f

    .line 415
    .line 416
    .line 417
    const v16, 0x3ec7ae14    # 0.39f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3fc147ae    # 1.51f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41900000    # 18.0f

    .line 433
    .line 434
    const v2, 0x40be6666    # 5.95f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, -0x40000000    # -2.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x40400000    # 3.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x40000000    # 2.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x40400000    # 3.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40400000    # 3.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, -0x40000000    # -2.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/outlined/AddIcCallKt;->_addIcCall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 527
    .line 528
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-object v0
.end method
