.class public final Landroidx/compose/material/icons/rounded/MasksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _masks:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMasks(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Masks"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fe147ae    # -2.48f

    .line 78
    .line 79
    .line 80
    const v18, 0x40133333    # 2.3f

    .line 81
    .line 82
    .line 83
    const v13, -0x405851ec    # -1.31f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fe851ec    # -2.37f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f8147ae    # 1.01f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v18, 0x40d00000    # 6.5f

    .line 99
    .line 100
    const v13, 0x41723d71    # 15.14f

    .line 101
    .line 102
    .line 103
    const v14, 0x40f9999a    # 7.8f

    .line 104
    .line 105
    .line 106
    const v15, 0x4162e148    # 14.18f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40d00000    # 6.5f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x3f5f5c29    # -5.02f

    .line 115
    .line 116
    .line 117
    const v18, 0x3fe66666    # 1.8f

    .line 118
    .line 119
    .line 120
    const v13, -0x3ff3d70a    # -2.19f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x3fb70a3d    # -3.14f

    .line 125
    .line 126
    .line 127
    const v16, 0x3fa66666    # 1.3f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x40900000    # 4.5f

    .line 134
    .line 135
    const/high16 v18, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v13, 0x40dbd70a    # 6.87f

    .line 138
    .line 139
    .line 140
    const v14, 0x40e0a3d7    # 7.02f

    .line 141
    .line 142
    .line 143
    const v15, 0x40b9eb85    # 5.81f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40c00000    # 6.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x40000000    # 2.0f

    .line 152
    .line 153
    const/high16 v18, 0x41080000    # 8.5f

    .line 154
    .line 155
    const v13, 0x4047ae14    # 3.12f

    .line 156
    .line 157
    .line 158
    const/high16 v14, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v15, 0x40000000    # 2.0f

    .line 161
    .line 162
    const v16, 0x40e3d70a    # 7.12f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41100000    # 9.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x40d0a3d7    # 6.52f

    .line 174
    .line 175
    .line 176
    const v18, 0x40ff5c29    # 7.98f

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const v15, 0x40666666    # 3.6f

    .line 181
    .line 182
    .line 183
    const v16, 0x40f9eb85    # 7.81f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41400000    # 12.0f

    .line 190
    .line 191
    const/high16 v18, 0x41900000    # 18.0f

    .line 192
    .line 193
    const v13, 0x41187ae1    # 9.53f

    .line 194
    .line 195
    .line 196
    const v14, 0x418cf5c3    # 17.62f

    .line 197
    .line 198
    .line 199
    const v15, 0x412b851f    # 10.72f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x41900000    # 18.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x405eb852    # 3.48f

    .line 208
    .line 209
    .line 210
    const v2, -0x407d70a4    # -1.02f

    .line 211
    .line 212
    .line 213
    const v4, 0x401e147b    # 2.47f

    .line 214
    .line 215
    .line 216
    const v6, -0x413d70a4    # -0.38f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41b00000    # 22.0f

    .line 223
    .line 224
    const/high16 v18, 0x41100000    # 9.0f

    .line 225
    .line 226
    const v13, 0x41933333    # 18.4f

    .line 227
    .line 228
    .line 229
    const v14, 0x41867ae1    # 16.81f

    .line 230
    .line 231
    .line 232
    const/high16 v15, 0x41b00000    # 22.0f

    .line 233
    .line 234
    const/high16 v16, 0x41700000    # 15.0f

    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41080000    # 8.5f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x419c0000    # 19.5f

    .line 245
    .line 246
    const/high16 v18, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v13, 0x41b00000    # 22.0f

    .line 249
    .line 250
    const v14, 0x40e3d70a    # 7.12f

    .line 251
    .line 252
    .line 253
    const v15, 0x41a70a3d    # 20.88f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x40c00000    # 6.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40600000    # 3.5f

    .line 265
    .line 266
    const/high16 v2, 0x41100000    # 9.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41080000    # 8.5f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v18, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ee66666    # 0.45f

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
    const v0, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    const/high16 v2, 0x3f800000    # 1.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40400000    # 3.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f8147ae    # 1.01f

    .line 306
    .line 307
    .line 308
    const v18, 0x405eb852    # 3.48f

    .line 309
    .line 310
    .line 311
    const v14, 0x3fa3d70a    # 1.28f

    .line 312
    .line 313
    .line 314
    const v15, 0x3ec28f5c    # 0.38f

    .line 315
    .line 316
    .line 317
    const v16, 0x401e147b    # 2.47f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40600000    # 3.5f

    .line 324
    .line 325
    const/high16 v18, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v13, 0x409fae14    # 4.99f

    .line 328
    .line 329
    .line 330
    const v14, 0x416451ec    # 14.27f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x40600000    # 3.5f

    .line 334
    .line 335
    const v16, 0x414a6666    # 12.65f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x4164cccd    # 14.3f

    .line 345
    .line 346
    .line 347
    const v2, 0x413028f6    # 11.01f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, -0x407eb852    # -1.01f

    .line 354
    .line 355
    .line 356
    const v18, -0x40f851ec    # -0.53f

    .line 357
    .line 358
    .line 359
    const v13, -0x41333333    # -0.4f

    .line 360
    .line 361
    .line 362
    const v14, -0x41d1eb85    # -0.17f

    .line 363
    .line 364
    .line 365
    const v15, -0x40c7ae14    # -0.72f

    .line 366
    .line 367
    .line 368
    const v16, -0x4147ae14    # -0.36f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x41400000    # 12.0f

    .line 375
    .line 376
    const/high16 v18, 0x41200000    # 10.0f

    .line 377
    .line 378
    const v13, 0x414d47ae    # 12.83f

    .line 379
    .line 380
    .line 381
    const v14, 0x41233333    # 10.2f

    .line 382
    .line 383
    .line 384
    const v15, 0x4147d70a    # 12.49f

    .line 385
    .line 386
    .line 387
    const/high16 v16, 0x41200000    # 10.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x405851ec    # -1.31f

    .line 393
    .line 394
    .line 395
    const v18, 0x3ef5c28f    # 0.48f

    .line 396
    .line 397
    .line 398
    const v13, -0x41051eb8    # -0.49f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const v15, -0x40a8f5c3    # -0.84f

    .line 403
    .line 404
    .line 405
    const v16, 0x3e4ccccd    # 0.2f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x40851eb8    # -0.98f

    .line 412
    .line 413
    .line 414
    const v18, 0x3f028f5c    # 0.51f

    .line 415
    .line 416
    .line 417
    const v13, -0x4170a3d7    # -0.28f

    .line 418
    .line 419
    .line 420
    const v14, 0x3e2e147b    # 0.17f

    .line 421
    .line 422
    .line 423
    const v15, -0x40e66666    # -0.6f

    .line 424
    .line 425
    .line 426
    const v16, 0x3eb33333    # 0.35f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41100000    # 9.0f

    .line 433
    .line 434
    const v18, 0x4128a3d7    # 10.54f

    .line 435
    .line 436
    .line 437
    const v13, 0x4115eb85    # 9.37f

    .line 438
    .line 439
    .line 440
    const v14, 0x41323d71    # 11.14f

    .line 441
    .line 442
    .line 443
    const/high16 v15, 0x41100000    # 9.0f

    .line 444
    .line 445
    const v16, 0x412e8f5c    # 10.91f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/4 v0, 0x0

    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x3e947ae1    # 0.29f

    .line 456
    .line 457
    .line 458
    const v18, -0x4119999a    # -0.45f

    .line 459
    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, -0x41b33333    # -0.2f

    .line 463
    .line 464
    .line 465
    const v15, 0x3de147ae    # 0.11f

    .line 466
    .line 467
    .line 468
    const v16, -0x413d70a4    # -0.38f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3f6147ae    # 0.88f

    .line 475
    .line 476
    .line 477
    const v18, -0x41147ae1    # -0.46f

    .line 478
    .line 479
    .line 480
    const v13, 0x3eae147b    # 0.34f

    .line 481
    .line 482
    .line 483
    const v14, -0x41f0a3d7    # -0.14f

    .line 484
    .line 485
    .line 486
    const v15, 0x3f1eb852    # 0.62f

    .line 487
    .line 488
    .line 489
    const v16, -0x416147ae    # -0.31f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, 0x41400000    # 12.0f

    .line 496
    .line 497
    const/high16 v18, 0x41100000    # 9.0f

    .line 498
    .line 499
    const v13, 0x412b851f    # 10.72f

    .line 500
    .line 501
    .line 502
    const v14, 0x4114cccd    # 9.3f

    .line 503
    .line 504
    .line 505
    const v15, 0x4133ae14    # 11.23f

    .line 506
    .line 507
    .line 508
    const/high16 v16, 0x41100000    # 9.0f

    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x3fe66666    # 1.8f

    .line 514
    .line 515
    .line 516
    const v2, 0x3f1eb852    # 0.62f

    .line 517
    .line 518
    .line 519
    const v4, 0x3fa28f5c    # 1.27f

    .line 520
    .line 521
    .line 522
    const v6, 0x3e99999a    # 0.3f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3f666666    # 0.9f

    .line 529
    .line 530
    .line 531
    const v18, 0x3ef5c28f    # 0.48f

    .line 532
    .line 533
    .line 534
    const v13, 0x3e8a3d71    # 0.27f

    .line 535
    .line 536
    .line 537
    const v14, 0x3e23d70a    # 0.16f

    .line 538
    .line 539
    .line 540
    const v15, 0x3f0ccccd    # 0.55f

    .line 541
    .line 542
    .line 543
    const v16, 0x3ea8f5c3    # 0.33f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x3e947ae1    # 0.29f

    .line 550
    .line 551
    .line 552
    const v18, 0x3ee66666    # 0.45f

    .line 553
    .line 554
    .line 555
    const v13, 0x3e3851ec    # 0.18f

    .line 556
    .line 557
    .line 558
    const v14, 0x3da3d70a    # 0.08f

    .line 559
    .line 560
    .line 561
    const v15, 0x3e947ae1    # 0.29f

    .line 562
    .line 563
    .line 564
    const v16, 0x3e851eb8    # 0.26f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x4164cccd    # 14.3f

    .line 571
    .line 572
    .line 573
    const v18, 0x413028f6    # 11.01f

    .line 574
    .line 575
    .line 576
    const/high16 v13, 0x41700000    # 15.0f

    .line 577
    .line 578
    const v14, 0x412e8f5c    # 10.91f

    .line 579
    .line 580
    .line 581
    const v15, 0x416a147b    # 14.63f

    .line 582
    .line 583
    .line 584
    const v16, 0x41326666    # 11.15f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41a40000    # 20.5f

    .line 594
    .line 595
    const/high16 v2, 0x41100000    # 9.0f

    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, -0x3fbf5c29    # -3.01f

    .line 601
    .line 602
    .line 603
    const v18, 0x40bf5c29    # 5.98f

    .line 604
    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const v14, 0x4069999a    # 3.65f

    .line 608
    .line 609
    .line 610
    const v15, -0x404147ae    # -1.49f

    .line 611
    .line 612
    .line 613
    const v16, 0x40a8a3d7    # 5.27f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, 0x3f8147ae    # 1.01f

    .line 620
    .line 621
    .line 622
    const v18, -0x3fa147ae    # -3.48f

    .line 623
    .line 624
    .line 625
    const v13, 0x3f23d70a    # 0.64f

    .line 626
    .line 627
    .line 628
    const v14, -0x407eb852    # -1.01f

    .line 629
    .line 630
    .line 631
    const v15, 0x3f8147ae    # 1.01f

    .line 632
    .line 633
    .line 634
    const v16, -0x3ff33333    # -2.2f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/high16 v18, -0x40800000    # -1.0f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const v14, -0x40f33333    # -0.55f

    .line 651
    .line 652
    .line 653
    const v15, 0x3ee66666    # 0.45f

    .line 654
    .line 655
    .line 656
    const/high16 v16, -0x40800000    # -1.0f

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3ee66666    # 0.45f

    .line 662
    .line 663
    .line 664
    const/high16 v2, 0x3f800000    # 1.0f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41100000    # 9.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const/16 v16, 0x3800

    .line 682
    .line 683
    const/16 v17, 0x0

    .line 684
    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/high16 v8, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/4 v7, 0x0

    .line 690
    const/high16 v9, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v12, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    const/4 v15, 0x0

    .line 696
    const-string v4, ""

    .line 697
    .line 698
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    sput-object v0, Landroidx/compose/material/icons/rounded/MasksKt;->_masks:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    return-object v0
.end method
