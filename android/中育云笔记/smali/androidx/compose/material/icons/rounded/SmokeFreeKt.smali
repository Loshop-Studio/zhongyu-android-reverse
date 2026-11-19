.class public final Landroidx/compose/material/icons/rounded/SmokeFreeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _smokeFree:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSmokeFree(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SmokeFreeKt;->_smokeFree:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SmokeFree"

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
    const/high16 v0, 0x41a40000    # 20.5f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41b00000    # 22.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x40400000    # -1.5f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x41900000    # 18.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x40400000    # 3.0f

    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x41900000    # 18.0f

    .line 111
    .line 112
    const/high16 v2, 0x41800000    # 16.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41880000    # 17.0f

    .line 121
    .line 122
    const/high16 v2, 0x41680000    # 14.5f

    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, -0x40400000    # -1.5f

    .line 128
    .line 129
    const/high16 v18, -0x40400000    # -1.5f

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const v14, -0x40ab851f    # -0.83f

    .line 133
    .line 134
    .line 135
    const v15, -0x40d47ae1    # -0.67f

    .line 136
    .line 137
    .line 138
    const/high16 v16, -0x40400000    # -1.5f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, -0x40a8f5c3    # -0.84f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x400b851f    # 2.18f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3e23d70a    # 0.16f

    .line 156
    .line 157
    .line 158
    const v18, -0x40d1eb85    # -0.68f

    .line 159
    .line 160
    .line 161
    const v13, 0x3dcccccd    # 0.1f

    .line 162
    .line 163
    .line 164
    const v14, -0x41a8f5c3    # -0.21f

    .line 165
    .line 166
    .line 167
    const v15, 0x3e23d70a    # 0.16f

    .line 168
    .line 169
    .line 170
    const v16, -0x411eb852    # -0.44f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x4197ae14    # 18.96f

    .line 180
    .line 181
    .line 182
    const v2, 0x40166666    # 2.35f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41980000    # 19.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x42dc28f6    # -0.04f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x4196cccd    # 18.85f

    .line 203
    .line 204
    .line 205
    const v2, 0x40975c29    # 4.73f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3f570a3d    # 0.84f

    .line 212
    .line 213
    .line 214
    const v18, -0x40533333    # -1.35f

    .line 215
    .line 216
    .line 217
    const v13, 0x3ec28f5c    # 0.38f

    .line 218
    .line 219
    .line 220
    const v14, -0x413d70a4    # -0.38f

    .line 221
    .line 222
    .line 223
    const v15, 0x3f2b851f    # 0.67f

    .line 224
    .line 225
    .line 226
    const v16, -0x40a8f5c3    # -0.84f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x40ca3d71    # -0.71f

    .line 233
    .line 234
    .line 235
    const v18, -0x407d70a4    # -1.02f

    .line 236
    .line 237
    .line 238
    const v13, 0x3e23d70a    # 0.16f

    .line 239
    .line 240
    .line 241
    const/high16 v14, -0x41000000    # -0.5f

    .line 242
    .line 243
    const v15, -0x41bd70a4    # -0.19f

    .line 244
    .line 245
    .line 246
    const v16, -0x407eb852    # -1.01f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x40c7ae14    # -0.72f

    .line 253
    .line 254
    .line 255
    const v18, 0x3f147ae1    # 0.58f

    .line 256
    .line 257
    .line 258
    const v13, -0x4151eb85    # -0.34f

    .line 259
    .line 260
    .line 261
    const v14, 0x3c23d70a    # 0.01f

    .line 262
    .line 263
    .line 264
    const v15, -0x40e3d70a    # -0.61f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x3e800000    # 0.25f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x406a3d71    # -1.17f

    .line 273
    .line 274
    .line 275
    const v18, 0x3f95c28f    # 1.17f

    .line 276
    .line 277
    .line 278
    const v13, -0x41c7ae14    # -0.18f

    .line 279
    .line 280
    .line 281
    const v14, 0x3f0ccccd    # 0.55f

    .line 282
    .line 283
    .line 284
    const v15, -0x40e147ae    # -0.62f

    .line 285
    .line 286
    .line 287
    const v16, 0x3f7d70a4    # 0.99f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x40e8f5c3    # -0.59f

    .line 294
    .line 295
    .line 296
    const v18, 0x3f3d70a4    # 0.74f

    .line 297
    .line 298
    .line 299
    const v13, -0x4151eb85    # -0.34f

    .line 300
    .line 301
    .line 302
    const v14, 0x3de147ae    # 0.11f

    .line 303
    .line 304
    .line 305
    const v15, -0x40e8f5c3    # -0.59f

    .line 306
    .line 307
    .line 308
    const v16, 0x3ec7ae14    # 0.39f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41840000    # 16.5f

    .line 315
    .line 316
    const/high16 v2, 0x40a00000    # 5.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3f23d70a    # 0.64f

    .line 322
    .line 323
    .line 324
    const/high16 v18, 0x3f400000    # 0.75f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const v14, 0x3ebd70a4    # 0.37f

    .line 328
    .line 329
    .line 330
    const v15, 0x3e8a3d71    # 0.27f

    .line 331
    .line 332
    .line 333
    const v16, 0x3f30a3d7    # 0.69f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x40570a3d    # 3.36f

    .line 340
    .line 341
    .line 342
    const v18, 0x4080a3d7    # 4.02f

    .line 343
    .line 344
    .line 345
    const v13, 0x3ff70a3d    # 1.93f

    .line 346
    .line 347
    .line 348
    const v14, 0x3e9eb852    # 0.31f

    .line 349
    .line 350
    .line 351
    const v15, 0x40570a3d    # 3.36f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x40000000    # 2.0f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x3fbd70a4    # 1.48f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x3f400000    # 0.75f

    .line 366
    .line 367
    const/high16 v18, 0x3f400000    # 0.75f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, 0x3ed1eb85    # 0.41f

    .line 371
    .line 372
    .line 373
    const v15, 0x3eae147b    # 0.34f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x3f400000    # 0.75f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x4151eb85    # -0.34f

    .line 382
    .line 383
    .line 384
    const/high16 v2, -0x40c00000    # -0.75f

    .line 385
    .line 386
    const/high16 v4, 0x3f400000    # 0.75f

    .line 387
    .line 388
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x411c28f6    # 9.76f

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x41b00000    # 22.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, -0x3fb66666    # -3.15f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f5f0a3d    # -5.03f

    .line 403
    .line 404
    .line 405
    const v14, -0x3ff1eb85    # -2.22f

    .line 406
    .line 407
    .line 408
    const v15, -0x405c28f6    # -1.28f

    .line 409
    .line 410
    .line 411
    const v16, -0x3f7b851f    # -4.14f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x4169c28f    # 14.61f

    .line 421
    .line 422
    .line 423
    const v2, 0x410a6666    # 8.65f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3fb5c28f    # 1.42f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3ffc28f6    # 1.97f

    .line 436
    .line 437
    .line 438
    const v18, 0x40033333    # 2.05f

    .line 439
    .line 440
    .line 441
    const v13, 0x3f866666    # 1.05f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const v15, 0x3ffc28f6    # 1.97f

    .line 446
    .line 447
    .line 448
    const v16, 0x3f3d70a4    # 0.74f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x3f0ccccd    # 0.55f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x3f400000    # 0.75f

    .line 461
    .line 462
    const/high16 v18, 0x3f400000    # 0.75f

    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const v14, 0x3ed1eb85    # 0.41f

    .line 466
    .line 467
    .line 468
    const v15, 0x3ea8f5c3    # 0.33f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x3f400000    # 0.75f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3c23d70a    # 0.01f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v18, -0x40c00000    # -0.75f

    .line 483
    .line 484
    const v13, 0x3ed1eb85    # 0.41f

    .line 485
    .line 486
    .line 487
    const/4 v14, 0x0

    .line 488
    const/high16 v15, 0x3f400000    # 0.75f

    .line 489
    .line 490
    const v16, -0x41570a3d    # -0.33f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, -0x409c28f6    # -0.89f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x3fa1eb85    # -3.47f

    .line 503
    .line 504
    .line 505
    const v18, -0x3fb5c28f    # -3.16f

    .line 506
    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const v14, -0x401851ec    # -1.81f

    .line 510
    .line 511
    .line 512
    const v15, -0x40333333    # -1.6f

    .line 513
    .line 514
    .line 515
    const v16, -0x3fb5c28f    # -3.16f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x4059999a    # -1.3f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, -0x3ffb851f    # -2.07f

    .line 528
    .line 529
    .line 530
    const/high16 v18, -0x40200000    # -1.75f

    .line 531
    .line 532
    const v13, -0x407d70a4    # -1.02f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const v15, -0x4007ae14    # -1.94f

    .line 537
    .line 538
    .line 539
    const v16, -0x40c51eb8    # -0.73f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x3fa66666    # 1.3f

    .line 546
    .line 547
    .line 548
    const v18, -0x4008f5c3    # -1.93f

    .line 549
    .line 550
    .line 551
    const v13, -0x420a3d71    # -0.12f

    .line 552
    .line 553
    .line 554
    const v14, -0x408ccccd    # -0.95f

    .line 555
    .line 556
    .line 557
    const v15, 0x3eeb851f    # 0.46f

    .line 558
    .line 559
    .line 560
    const v16, -0x40266666    # -1.7f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, 0x3f0a3d71    # 0.54f

    .line 567
    .line 568
    .line 569
    const v18, -0x40c7ae14    # -0.72f

    .line 570
    .line 571
    .line 572
    const v13, 0x3ea3d70a    # 0.32f

    .line 573
    .line 574
    .line 575
    const v14, -0x4247ae14    # -0.09f

    .line 576
    .line 577
    .line 578
    const v15, 0x3f0a3d71    # 0.54f

    .line 579
    .line 580
    .line 581
    const v16, -0x413d70a4    # -0.38f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, -0x4091eb85    # -0.93f

    .line 588
    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const v14, -0x41051eb8    # -0.49f

    .line 592
    .line 593
    .line 594
    const v15, -0x41147ae1    # -0.46f

    .line 595
    .line 596
    .line 597
    const v16, -0x40a3d70a    # -0.86f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x3fe51eb8    # -2.42f

    .line 604
    .line 605
    .line 606
    const v18, 0x4051eb85    # 3.28f

    .line 607
    .line 608
    .line 609
    const v13, -0x404a3d71    # -1.42f

    .line 610
    .line 611
    .line 612
    const v14, 0x3ed1eb85    # 0.41f

    .line 613
    .line 614
    .line 615
    const v15, -0x3fe33333    # -2.45f

    .line 616
    .line 617
    .line 618
    const v16, 0x3fdd70a4    # 1.73f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x405ccccd    # 3.45f

    .line 625
    .line 626
    .line 627
    const v18, 0x40528f5c    # 3.29f

    .line 628
    .line 629
    .line 630
    const v13, 0x3ca3d70a    # 0.02f

    .line 631
    .line 632
    .line 633
    const v14, 0x3feccccd    # 1.85f

    .line 634
    .line 635
    .line 636
    const v15, 0x3fce147b    # 1.61f

    .line 637
    .line 638
    .line 639
    const v16, 0x40528f5c    # 3.29f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x40a947ae    # 5.29f

    .line 649
    .line 650
    .line 651
    const v2, 0x4083d70a    # 4.12f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, -0x404b851f    # -1.41f

    .line 658
    .line 659
    .line 660
    const/16 v18, 0x0

    .line 661
    .line 662
    const v13, -0x413851ec    # -0.39f

    .line 663
    .line 664
    .line 665
    const v14, -0x413851ec    # -0.39f

    .line 666
    .line 667
    .line 668
    const v15, -0x407d70a4    # -1.02f

    .line 669
    .line 670
    .line 671
    const v16, -0x413851ec    # -0.39f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const v18, 0x3fb47ae1    # 1.41f

    .line 680
    .line 681
    .line 682
    const v14, 0x3ec7ae14    # 0.39f

    .line 683
    .line 684
    .line 685
    const v15, -0x413851ec    # -0.39f

    .line 686
    .line 687
    .line 688
    const v16, 0x3f828f5c    # 1.02f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v0, 0x41100000    # 9.0f

    .line 695
    .line 696
    const/high16 v2, 0x41500000    # 13.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x40600000    # 3.5f

    .line 702
    .line 703
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, -0x40400000    # -1.5f

    .line 707
    .line 708
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 709
    .line 710
    const v13, -0x40ab851f    # -0.83f

    .line 711
    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/high16 v15, -0x40400000    # -1.5f

    .line 715
    .line 716
    const v16, 0x3f2b851f    # 0.67f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x402ae148    # 2.67f

    .line 723
    .line 724
    .line 725
    const/high16 v2, 0x40600000    # 3.5f

    .line 726
    .line 727
    const/high16 v4, 0x41800000    # 16.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v0, 0x41400000    # 12.0f

    .line 733
    .line 734
    const/high16 v2, 0x41800000    # 16.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, 0x40c947ae    # 6.29f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v17, 0x3fb47ae1    # 1.41f

    .line 746
    .line 747
    .line 748
    const/16 v18, 0x0

    .line 749
    .line 750
    const v13, 0x3ec7ae14    # 0.39f

    .line 751
    .line 752
    .line 753
    const v14, 0x3ec7ae14    # 0.39f

    .line 754
    .line 755
    .line 756
    const v15, 0x3f828f5c    # 1.02f

    .line 757
    .line 758
    .line 759
    const v16, 0x3ec7ae14    # 0.39f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    const v18, -0x404b851f    # -1.41f

    .line 768
    .line 769
    .line 770
    const v14, -0x413851ec    # -0.39f

    .line 771
    .line 772
    .line 773
    const v15, 0x3ec7ae14    # 0.39f

    .line 774
    .line 775
    .line 776
    const v16, -0x407d70a4    # -1.02f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x40a947ae    # 5.29f

    .line 783
    .line 784
    .line 785
    const v2, 0x4083d70a    # 4.12f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    const/16 v16, 0x3800

    .line 799
    .line 800
    const/16 v17, 0x0

    .line 801
    .line 802
    const/high16 v6, 0x3f800000    # 1.0f

    .line 803
    .line 804
    const/high16 v8, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    const/high16 v9, 0x3f800000    # 1.0f

    .line 808
    .line 809
    const/high16 v12, 0x3f800000    # 1.0f

    .line 810
    .line 811
    const/4 v13, 0x0

    .line 812
    const/4 v14, 0x0

    .line 813
    const/4 v15, 0x0

    .line 814
    const-string v4, ""

    .line 815
    .line 816
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    sput-object v0, Landroidx/compose/material/icons/rounded/SmokeFreeKt;->_smokeFree:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 825
    .line 826
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    return-object v0
.end method
