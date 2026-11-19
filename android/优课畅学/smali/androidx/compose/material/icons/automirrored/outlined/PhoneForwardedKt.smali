.class public final Landroidx/compose/material/icons/automirrored/outlined/PhoneForwardedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneForwarded(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/outlined/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Outlined.PhoneForwarded"

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
    const/high16 v2, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f9b851f    # -3.57f

    .line 78
    .line 79
    .line 80
    const v18, -0x40ee147b    # -0.57f

    .line 81
    .line 82
    .line 83
    const/high16 v13, -0x40600000    # -1.25f

    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3fe33333    # -2.45f

    .line 87
    .line 88
    .line 89
    const v16, -0x41b33333    # -0.2f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, -0x416147ae    # -0.31f

    .line 96
    .line 97
    .line 98
    const v18, -0x42b33333    # -0.05f

    .line 99
    .line 100
    .line 101
    const v13, -0x42333333    # -0.1f

    .line 102
    .line 103
    .line 104
    const v14, -0x430a3d71    # -0.03f

    .line 105
    .line 106
    .line 107
    const v15, -0x41a8f5c3    # -0.21f

    .line 108
    .line 109
    .line 110
    const v16, -0x42b33333    # -0.05f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x40ca3d71    # -0.71f

    .line 117
    .line 118
    .line 119
    const v18, 0x3e947ae1    # 0.29f

    .line 120
    .line 121
    .line 122
    const v13, -0x417ae148    # -0.26f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x40fd70a4    # -0.51f

    .line 127
    .line 128
    .line 129
    const v16, 0x3dcccccd    # 0.1f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x3ff33333    # -2.2f

    .line 136
    .line 137
    .line 138
    const v2, 0x400ccccd    # 2.2f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x3f2d1eb8    # -6.59f

    .line 145
    .line 146
    .line 147
    const v18, -0x3f2d1eb8    # -6.59f

    .line 148
    .line 149
    .line 150
    const v13, -0x3fcae148    # -2.83f

    .line 151
    .line 152
    .line 153
    const v14, -0x4047ae14    # -1.44f

    .line 154
    .line 155
    .line 156
    const v15, -0x3f5b3333    # -5.15f

    .line 157
    .line 158
    .line 159
    const/high16 v16, -0x3f900000    # -3.75f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x3ff28f5c    # -2.21f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x3e800000    # 0.25f

    .line 171
    .line 172
    const/high16 v18, -0x40800000    # -1.0f

    .line 173
    .line 174
    const v13, 0x3e8f5c29    # 0.28f

    .line 175
    .line 176
    .line 177
    const v14, -0x417ae148    # -0.26f

    .line 178
    .line 179
    .line 180
    const v15, 0x3eb851ec    # 0.36f

    .line 181
    .line 182
    .line 183
    const v16, -0x40d9999a    # -0.65f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41080000    # 8.5f

    .line 190
    .line 191
    const/high16 v18, 0x40800000    # 4.0f

    .line 192
    .line 193
    const v13, 0x410b3333    # 8.7f

    .line 194
    .line 195
    .line 196
    const v14, 0x40ce6666    # 6.45f

    .line 197
    .line 198
    .line 199
    const/high16 v15, 0x41080000    # 8.5f

    .line 200
    .line 201
    const/high16 v16, 0x40a80000    # 5.25f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, -0x40800000    # -1.0f

    .line 207
    .line 208
    const/high16 v18, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x40f33333    # -0.55f

    .line 212
    .line 213
    .line 214
    const v15, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    const/high16 v16, -0x40800000    # -1.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, 0x40800000    # 4.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v18, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const v13, -0x40f33333    # -0.55f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const/high16 v15, -0x40800000    # -1.0f

    .line 234
    .line 235
    const v16, 0x3ee66666    # 0.45f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x41880000    # 17.0f

    .line 242
    .line 243
    const/high16 v18, 0x41880000    # 17.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, 0x41163d71    # 9.39f

    .line 247
    .line 248
    .line 249
    const v15, 0x40f3851f    # 7.61f

    .line 250
    .line 251
    .line 252
    const/high16 v16, 0x41880000    # 17.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v18, -0x40800000    # -1.0f

    .line 260
    .line 261
    const v13, 0x3f0ccccd    # 0.55f

    .line 262
    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const/high16 v15, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v16, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x40a0f5c3    # 5.03f

    .line 296
    .line 297
    .line 298
    const/high16 v2, 0x40a00000    # 5.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3ee66666    # 0.45f

    .line 309
    .line 310
    .line 311
    const v18, 0x40251eb8    # 2.58f

    .line 312
    .line 313
    .line 314
    const v13, 0x3d8f5c29    # 0.07f

    .line 315
    .line 316
    .line 317
    const v14, 0x3f6147ae    # 0.88f

    .line 318
    .line 319
    .line 320
    const v15, 0x3e6147ae    # 0.22f

    .line 321
    .line 322
    .line 323
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x3f9ae148    # 1.21f

    .line 329
    .line 330
    .line 331
    const v2, -0x40666666    # -1.2f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x40c00000    # -0.75f

    .line 338
    .line 339
    const v18, -0x3f8d70a4    # -3.79f

    .line 340
    .line 341
    .line 342
    const v13, -0x41333333    # -0.4f

    .line 343
    .line 344
    .line 345
    const v14, -0x40651eb8    # -1.21f

    .line 346
    .line 347
    .line 348
    const v15, -0x40d70a3d    # -0.66f

    .line 349
    .line 350
    .line 351
    const v16, -0x3fe1eb85    # -2.47f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41980000    # 19.0f

    .line 361
    .line 362
    const v2, 0x4197c28f    # 18.97f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, -0x3f8ccccd    # -3.8f

    .line 369
    .line 370
    .line 371
    const v18, -0x40bd70a4    # -0.76f

    .line 372
    .line 373
    .line 374
    const v13, -0x40570a3d    # -1.32f

    .line 375
    .line 376
    .line 377
    const v14, -0x4247ae14    # -0.09f

    .line 378
    .line 379
    .line 380
    const v15, -0x3fd9999a    # -2.6f

    .line 381
    .line 382
    .line 383
    const v16, -0x414ccccd    # -0.35f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f99999a    # 1.2f

    .line 390
    .line 391
    .line 392
    const v2, -0x40666666    # -1.2f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x40266666    # 2.6f

    .line 399
    .line 400
    .line 401
    const v18, 0x3ee66666    # 0.45f

    .line 402
    .line 403
    .line 404
    const v13, 0x3f59999a    # 0.85f

    .line 405
    .line 406
    .line 407
    const v14, 0x3e75c28f    # 0.24f

    .line 408
    .line 409
    .line 410
    const v15, 0x3fdc28f6    # 1.72f

    .line 411
    .line 412
    .line 413
    const v16, 0x3ec7ae14    # 0.39f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3fc147ae    # 1.51f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41900000    # 18.0f

    .line 429
    .line 430
    const/high16 v2, 0x41300000    # 11.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40a00000    # 5.0f

    .line 436
    .line 437
    const/high16 v2, -0x3f600000    # -5.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, -0x3f600000    # -5.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40400000    # 3.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, -0x3f800000    # -4.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x40800000    # 4.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    const/16 v16, 0x3800

    .line 473
    .line 474
    const/16 v17, 0x0

    .line 475
    .line 476
    const/high16 v6, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v8, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v7, 0x0

    .line 481
    const/high16 v9, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v12, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    const/4 v14, 0x0

    .line 487
    const/4 v15, 0x0

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    sput-object v0, Landroidx/compose/material/icons/automirrored/outlined/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    return-object v0
.end method
