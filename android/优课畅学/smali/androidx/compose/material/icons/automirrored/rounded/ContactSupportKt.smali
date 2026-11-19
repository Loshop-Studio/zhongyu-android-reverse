.class public final Landroidx/compose/material/icons/automirrored/rounded/ContactSupportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactSupport(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "AutoMirrored.Rounded.ContactSupport"

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
    const/high16 v0, 0x41380000    # 11.5f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v18, 0x41280000    # 10.5f

    .line 80
    .line 81
    const v13, 0x40d9eb85    # 6.81f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40400000    # 3.0f

    .line 87
    .line 88
    const v16, 0x40b9eb85    # 5.81f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x40d9eb85    # 6.81f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41980000    # 19.0f

    .line 98
    .line 99
    const/high16 v4, 0x41380000    # 11.5f

    .line 100
    .line 101
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x3f000000    # 0.5f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x40400000    # 3.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, 0x41000000    # 8.0f

    .line 115
    .line 116
    const/high16 v18, -0x3ec80000    # -11.5f

    .line 117
    .line 118
    const v13, 0x409b851f    # 4.86f

    .line 119
    .line 120
    .line 121
    const v14, -0x3fea3d71    # -2.34f

    .line 122
    .line 123
    .line 124
    const/high16 v15, 0x41000000    # 8.0f

    .line 125
    .line 126
    const/high16 v16, -0x3f200000    # -7.0f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x41380000    # 11.5f

    .line 132
    .line 133
    const/high16 v18, 0x40000000    # 2.0f

    .line 134
    .line 135
    const/high16 v13, 0x41a00000    # 20.0f

    .line 136
    .line 137
    const v14, 0x40b9eb85    # 5.81f

    .line 138
    .line 139
    .line 140
    const v15, 0x4181851f    # 16.19f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x41480000    # 12.5f

    .line 152
    .line 153
    const/high16 v2, 0x41840000    # 16.5f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40000000    # 2.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x414e6666    # 12.9f

    .line 178
    .line 179
    .line 180
    const v2, 0x413b851f    # 11.72f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x430a3d71    # -0.03f

    .line 187
    .line 188
    .line 189
    const v18, 0x3d4ccccd    # 0.05f

    .line 190
    .line 191
    .line 192
    const v13, -0x43dc28f6    # -0.01f

    .line 193
    .line 194
    .line 195
    const v14, 0x3c23d70a    # 0.01f

    .line 196
    .line 197
    .line 198
    const v15, -0x435c28f6    # -0.02f

    .line 199
    .line 200
    .line 201
    const v16, 0x3cf5c28f    # 0.03f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x41f0a3d7    # -0.14f

    .line 208
    .line 209
    .line 210
    const v18, 0x3e75c28f    # 0.24f

    .line 211
    .line 212
    .line 213
    const v13, -0x42b33333    # -0.05f

    .line 214
    .line 215
    .line 216
    const v14, 0x3da3d70a    # 0.08f

    .line 217
    .line 218
    .line 219
    const v15, -0x42333333    # -0.1f

    .line 220
    .line 221
    .line 222
    const v16, 0x3e23d70a    # 0.16f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x42dc28f6    # -0.04f

    .line 229
    .line 230
    .line 231
    const v18, 0x3de147ae    # 0.11f

    .line 232
    .line 233
    .line 234
    const v13, -0x435c28f6    # -0.02f

    .line 235
    .line 236
    .line 237
    const v14, 0x3cf5c28f    # 0.03f

    .line 238
    .line 239
    .line 240
    const v15, -0x430a3d71    # -0.03f

    .line 241
    .line 242
    .line 243
    const v16, 0x3d8f5c29    # 0.07f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x425c28f6    # -0.08f

    .line 250
    .line 251
    .line 252
    const v18, 0x3e570a3d    # 0.21f

    .line 253
    .line 254
    .line 255
    const v13, -0x430a3d71    # -0.03f

    .line 256
    .line 257
    .line 258
    const v14, 0x3d8f5c29    # 0.07f

    .line 259
    .line 260
    .line 261
    const v15, -0x428a3d71    # -0.06f

    .line 262
    .line 263
    .line 264
    const v16, 0x3e0f5c29    # 0.14f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x42333333    # -0.1f

    .line 271
    .line 272
    .line 273
    const v18, 0x3f2e147b    # 0.68f

    .line 274
    .line 275
    .line 276
    const v13, -0x4270a3d7    # -0.07f

    .line 277
    .line 278
    .line 279
    const v14, 0x3e570a3d    # 0.21f

    .line 280
    .line 281
    .line 282
    const v15, -0x42333333    # -0.1f

    .line 283
    .line 284
    .line 285
    const v16, 0x3edc28f6    # 0.43f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41280000    # 10.5f

    .line 292
    .line 293
    const v2, 0x415028f6    # 13.01f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3e4ccccd    # 0.2f

    .line 300
    .line 301
    .line 302
    const v18, -0x4059999a    # -1.3f

    .line 303
    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const v14, -0x40fd70a4    # -0.51f

    .line 307
    .line 308
    .line 309
    const v15, 0x3da3d70a    # 0.08f

    .line 310
    .line 311
    .line 312
    const v16, -0x408f5c29    # -0.94f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x3c23d70a    # 0.01f

    .line 319
    .line 320
    .line 321
    const v18, -0x430a3d71    # -0.03f

    .line 322
    .line 323
    .line 324
    const v14, -0x43dc28f6    # -0.01f

    .line 325
    .line 326
    .line 327
    const/4 v15, 0x0

    .line 328
    const v16, -0x435c28f6    # -0.02f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x3d4ccccd    # 0.05f

    .line 335
    .line 336
    .line 337
    const v18, -0x42333333    # -0.1f

    .line 338
    .line 339
    .line 340
    const v13, 0x3c23d70a    # 0.01f

    .line 341
    .line 342
    .line 343
    const v14, -0x42dc28f6    # -0.04f

    .line 344
    .line 345
    .line 346
    const v15, 0x3d23d70a    # 0.04f

    .line 347
    .line 348
    .line 349
    const v16, -0x428a3d71    # -0.06f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x3e6147ae    # 0.22f

    .line 356
    .line 357
    .line 358
    const v18, -0x411eb852    # -0.44f

    .line 359
    .line 360
    .line 361
    const v13, 0x3d75c28f    # 0.06f

    .line 362
    .line 363
    .line 364
    const v14, -0x41dc28f6    # -0.16f

    .line 365
    .line 366
    .line 367
    const v15, 0x3e051eb8    # 0.13f

    .line 368
    .line 369
    .line 370
    const v16, -0x41666666    # -0.3f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3dcccccd    # 0.1f

    .line 377
    .line 378
    .line 379
    const v18, -0x41e66666    # -0.15f

    .line 380
    .line 381
    .line 382
    const v13, 0x3cf5c28f    # 0.03f

    .line 383
    .line 384
    .line 385
    const v14, -0x42b33333    # -0.05f

    .line 386
    .line 387
    .line 388
    const v15, 0x3d8f5c29    # 0.07f

    .line 389
    .line 390
    .line 391
    const v16, -0x42333333    # -0.1f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x3da3d70a    # 0.08f

    .line 398
    .line 399
    .line 400
    const v18, -0x420a3d71    # -0.12f

    .line 401
    .line 402
    .line 403
    const v14, -0x42dc28f6    # -0.04f

    .line 404
    .line 405
    .line 406
    const v15, 0x3d4ccccd    # 0.05f

    .line 407
    .line 408
    .line 409
    const v16, -0x4247ae14    # -0.09f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x3c23d70a    # 0.01f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x40147ae1    # 2.32f

    .line 422
    .line 423
    .line 424
    const v18, -0x3fd47ae1    # -2.68f

    .line 425
    .line 426
    .line 427
    const v13, 0x3f570a3d    # 0.84f

    .line 428
    .line 429
    .line 430
    const v14, -0x40733333    # -1.1f

    .line 431
    .line 432
    .line 433
    const v15, 0x400d70a4    # 2.21f

    .line 434
    .line 435
    .line 436
    const v16, -0x4047ae14    # -1.44f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x40370a3d    # -1.57f

    .line 443
    .line 444
    .line 445
    const v18, -0x3ff7ae14    # -2.13f

    .line 446
    .line 447
    .line 448
    const v13, 0x3db851ec    # 0.09f

    .line 449
    .line 450
    .line 451
    const v14, -0x40851eb8    # -0.98f

    .line 452
    .line 453
    .line 454
    const v15, -0x40e3d70a    # -0.61f

    .line 455
    .line 456
    .line 457
    const v16, -0x4008f5c3    # -1.93f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x3feccccd    # -2.3f

    .line 464
    .line 465
    .line 466
    const v18, 0x3fa3d70a    # 1.28f

    .line 467
    .line 468
    .line 469
    const v13, -0x407ae148    # -1.04f

    .line 470
    .line 471
    .line 472
    const v14, -0x419eb852    # -0.22f

    .line 473
    .line 474
    .line 475
    const v15, -0x40028f5c    # -1.98f

    .line 476
    .line 477
    .line 478
    const v16, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, -0x409eb852    # -0.88f

    .line 485
    .line 486
    .line 487
    const v18, 0x3f266666    # 0.65f

    .line 488
    .line 489
    .line 490
    const v13, -0x41f0a3d7    # -0.14f

    .line 491
    .line 492
    .line 493
    const v14, 0x3eb851ec    # 0.36f

    .line 494
    .line 495
    .line 496
    const v15, -0x410f5c29    # -0.47f

    .line 497
    .line 498
    .line 499
    const v16, 0x3f266666    # 0.65f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, -0x41b33333    # -0.2f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x40a147ae    # -0.87f

    .line 512
    .line 513
    .line 514
    const v18, -0x406a3d71    # -1.17f

    .line 515
    .line 516
    .line 517
    const v13, -0x40e66666    # -0.6f

    .line 518
    .line 519
    .line 520
    const/4 v14, 0x0

    .line 521
    const v15, -0x407ae148    # -1.04f

    .line 522
    .line 523
    .line 524
    const v16, -0x40e8f5c3    # -0.59f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x408dc28f    # 4.43f

    .line 531
    .line 532
    .line 533
    const v18, -0x3fcd70a4    # -2.79f

    .line 534
    .line 535
    .line 536
    const v13, 0x3f0ccccd    # 0.55f

    .line 537
    .line 538
    .line 539
    const v14, -0x40170a3d    # -1.82f

    .line 540
    .line 541
    .line 542
    const v15, 0x4017ae14    # 2.37f

    .line 543
    .line 544
    .line 545
    const v16, -0x3fba3d71    # -3.09f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x40551eb8    # 3.33f

    .line 552
    .line 553
    .line 554
    const v18, 0x40551eb8    # 3.33f

    .line 555
    .line 556
    .line 557
    const v13, 0x3fd851ec    # 1.69f

    .line 558
    .line 559
    .line 560
    const/high16 v14, 0x3e800000    # 0.25f

    .line 561
    .line 562
    const v15, 0x40428f5c    # 3.04f

    .line 563
    .line 564
    .line 565
    const v16, 0x3fd1eb85    # 1.64f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x3fde147b    # -2.53f

    .line 572
    .line 573
    .line 574
    const v18, 0x408b3333    # 4.35f

    .line 575
    .line 576
    .line 577
    const v13, 0x3ee147ae    # 0.44f

    .line 578
    .line 579
    .line 580
    const v14, 0x401c28f6    # 2.44f

    .line 581
    .line 582
    .line 583
    const v15, -0x402f5c29    # -1.63f

    .line 584
    .line 585
    .line 586
    const v16, 0x4041eb85    # 3.03f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/16 v16, 0x3800

    .line 600
    .line 601
    const/16 v17, 0x0

    .line 602
    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/high16 v8, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/4 v7, 0x0

    .line 608
    const/high16 v9, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/high16 v12, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v13, 0x0

    .line 613
    const/4 v14, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    const-string v4, ""

    .line 616
    .line 617
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    return-object v0
.end method
