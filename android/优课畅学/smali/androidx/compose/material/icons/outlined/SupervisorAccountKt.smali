.class public final Landroidx/compose/material/icons/outlined/SupervisorAccountKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupervisorAccount(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SupervisorAccountKt;->_supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SupervisorAccount"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40600000    # 3.5f

    .line 78
    .line 79
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 80
    .line 81
    const v13, 0x3ff70a3d    # 1.93f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40600000    # 3.5f

    .line 86
    .line 87
    const v16, -0x40370a3d    # -1.57f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x412ee148    # 10.93f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40a00000    # 5.0f

    .line 97
    .line 98
    const/high16 v4, 0x41100000    # 9.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x40d23d71    # 6.57f

    .line 104
    .line 105
    .line 106
    const/high16 v2, 0x41080000    # 8.5f

    .line 107
    .line 108
    const/high16 v4, 0x40b00000    # 5.5f

    .line 109
    .line 110
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x40e23d71    # 7.07f

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x41400000    # 12.0f

    .line 117
    .line 118
    const/high16 v4, 0x41100000    # 9.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x40e00000    # 7.0f

    .line 127
    .line 128
    const/high16 v2, 0x41100000    # 9.0f

    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 134
    .line 135
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    const v13, 0x3f547ae1    # 0.83f

    .line 138
    .line 139
    .line 140
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 141
    .line 142
    const v16, 0x3f2b851f    # 0.67f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x411d47ae    # 9.83f

    .line 149
    .line 150
    .line 151
    const/high16 v2, 0x41200000    # 10.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, -0x40d47ae1    # -0.67f

    .line 157
    .line 158
    .line 159
    const/high16 v2, -0x40400000    # -1.5f

    .line 160
    .line 161
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x4102b852    # 8.17f

    .line 165
    .line 166
    .line 167
    const/high16 v2, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4110cccd    # 9.05f

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x41880000    # 17.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x4098a3d7    # 4.77f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x40875c29    # 4.23f

    .line 190
    .line 191
    .line 192
    const/high16 v18, -0x40800000    # -1.0f

    .line 193
    .line 194
    const v13, 0x3f7d70a4    # 0.99f

    .line 195
    .line 196
    .line 197
    const/high16 v14, -0x41000000    # -0.5f

    .line 198
    .line 199
    const v15, 0x402ccccd    # 2.7f

    .line 200
    .line 201
    .line 202
    const/high16 v16, -0x40800000    # -1.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x3eae147b    # 0.34f

    .line 208
    .line 209
    .line 210
    const v18, 0x3c23d70a    # 0.01f

    .line 211
    .line 212
    .line 213
    const v13, 0x3de147ae    # 0.11f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, 0x3e6b851f    # 0.23f

    .line 218
    .line 219
    .line 220
    const v16, 0x3c23d70a    # 0.01f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x3fd1eb85    # 1.64f

    .line 227
    .line 228
    .line 229
    const v18, -0x401851ec    # -1.81f

    .line 230
    .line 231
    .line 232
    const v13, 0x3eae147b    # 0.34f

    .line 233
    .line 234
    .line 235
    const v14, -0x40c51eb8    # -0.73f

    .line 236
    .line 237
    .line 238
    const v15, 0x3f6e147b    # 0.93f

    .line 239
    .line 240
    .line 241
    const v16, -0x4055c28f    # -1.33f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x40028f5c    # -1.98f

    .line 248
    .line 249
    .line 250
    const v18, -0x41b33333    # -0.2f

    .line 251
    .line 252
    .line 253
    const v13, -0x40c51eb8    # -0.73f

    .line 254
    .line 255
    .line 256
    const v14, -0x41fae148    # -0.13f

    .line 257
    .line 258
    .line 259
    const v15, -0x404a3d71    # -1.42f

    .line 260
    .line 261
    .line 262
    const v16, -0x41b33333    # -0.2f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x3f200000    # -7.0f

    .line 269
    .line 270
    const/high16 v18, 0x40600000    # 3.5f

    .line 271
    .line 272
    const v13, -0x3fea3d71    # -2.34f

    .line 273
    .line 274
    .line 275
    const/4 v14, 0x0

    .line 276
    const/high16 v15, -0x3f200000    # -7.0f

    .line 277
    .line 278
    const v16, 0x3f95c28f    # 1.17f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x40000000    # 2.0f

    .line 285
    .line 286
    const/high16 v2, 0x41980000    # 19.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x40e00000    # 7.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, -0x40400000    # -1.5f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x3d4ccccd    # 0.05f

    .line 302
    .line 303
    .line 304
    const/high16 v18, -0x41000000    # -0.5f

    .line 305
    .line 306
    const/4 v13, 0x0

    .line 307
    const v14, -0x41d1eb85    # -0.17f

    .line 308
    .line 309
    .line 310
    const v15, 0x3ca3d70a    # 0.02f

    .line 311
    .line 312
    .line 313
    const v16, -0x4151eb85    # -0.34f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41840000    # 16.5f

    .line 323
    .line 324
    const/high16 v2, 0x41680000    # 14.5f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x3f500000    # -5.5f

    .line 330
    .line 331
    const/high16 v18, 0x40400000    # 3.0f

    .line 332
    .line 333
    const v13, -0x40147ae1    # -1.84f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const/high16 v15, -0x3f500000    # -5.5f

    .line 338
    .line 339
    const v16, 0x3f8147ae    # 1.01f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41300000    # 11.0f

    .line 346
    .line 347
    const/high16 v2, 0x41980000    # 19.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, -0x40400000    # -1.5f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x400147ae    # -1.99f

    .line 364
    .line 365
    .line 366
    const v15, -0x3f95c28f    # -3.66f

    .line 367
    .line 368
    .line 369
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x418dae14    # 17.71f

    .line 378
    .line 379
    .line 380
    const v2, 0x414ae148    # 12.68f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3fa51eb8    # 1.29f

    .line 387
    .line 388
    .line 389
    const v18, -0x3ff47ae1    # -2.18f

    .line 390
    .line 391
    .line 392
    const v13, 0x3f428f5c    # 0.76f

    .line 393
    .line 394
    .line 395
    const v14, -0x4123d70a    # -0.43f

    .line 396
    .line 397
    .line 398
    const v15, 0x3fa51eb8    # 1.29f

    .line 399
    .line 400
    .line 401
    const v16, -0x406147ae    # -1.24f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x41840000    # 16.5f

    .line 408
    .line 409
    const/high16 v18, 0x41000000    # 8.0f

    .line 410
    .line 411
    const/high16 v13, 0x41980000    # 19.0f

    .line 412
    .line 413
    const v14, 0x4111eb85    # 9.12f

    .line 414
    .line 415
    .line 416
    const v15, 0x418f0a3d    # 17.88f

    .line 417
    .line 418
    .line 419
    const/high16 v16, 0x41000000    # 8.0f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4111eb85    # 9.12f

    .line 425
    .line 426
    .line 427
    const/high16 v2, 0x41280000    # 10.5f

    .line 428
    .line 429
    const/high16 v4, 0x41600000    # 14.0f

    .line 430
    .line 431
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x3fa51eb8    # 1.29f

    .line 435
    .line 436
    .line 437
    const v18, 0x400b851f    # 2.18f

    .line 438
    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const v14, 0x3f70a3d7    # 0.94f

    .line 442
    .line 443
    .line 444
    const v15, 0x3f07ae14    # 0.53f

    .line 445
    .line 446
    .line 447
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3f9ae148    # 1.21f

    .line 453
    .line 454
    .line 455
    const v18, 0x3ea3d70a    # 0.32f

    .line 456
    .line 457
    .line 458
    const v13, 0x3eb851ec    # 0.36f

    .line 459
    .line 460
    .line 461
    const v14, 0x3e4ccccd    # 0.2f

    .line 462
    .line 463
    .line 464
    const v15, 0x3f451eb8    # 0.77f

    .line 465
    .line 466
    .line 467
    const v16, 0x3ea3d70a    # 0.32f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x3f9ae148    # 1.21f

    .line 474
    .line 475
    .line 476
    const v2, -0x415c28f6    # -0.32f

    .line 477
    .line 478
    .line 479
    const v4, 0x3f59999a    # 0.85f

    .line 480
    .line 481
    .line 482
    const v6, -0x420a3d71    # -0.12f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const/16 v16, 0x3800

    .line 496
    .line 497
    const/16 v17, 0x0

    .line 498
    .line 499
    const/high16 v6, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v8, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const/high16 v9, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/high16 v12, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const/4 v14, 0x0

    .line 510
    const/4 v15, 0x0

    .line 511
    const-string v4, ""

    .line 512
    .line 513
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    sput-object v0, Landroidx/compose/material/icons/outlined/SupervisorAccountKt;->_supervisorAccount:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 522
    .line 523
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    return-object v0
.end method
