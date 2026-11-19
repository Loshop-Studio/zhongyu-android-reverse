.class public final Landroidx/compose/material/icons/sharp/SickKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sick:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSick(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Sick"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, 0x40000000    # 2.0f

    .line 94
    .line 95
    const/high16 v18, -0x3f800000    # -4.0f

    .line 96
    .line 97
    const/4 v13, 0x0

    .line 98
    const v14, -0x40733333    # -1.1f

    .line 99
    .line 100
    .line 101
    const/high16 v15, 0x40000000    # 2.0f

    .line 102
    .line 103
    const/high16 v16, -0x3f800000    # -4.0f

    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x4039999a    # 2.9f

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x40800000    # 4.0f

    .line 112
    .line 113
    const/high16 v4, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, 0x41a80000    # 21.0f

    .line 119
    .line 120
    const/high16 v18, 0x41100000    # 9.0f

    .line 121
    .line 122
    const/high16 v13, 0x41b80000    # 23.0f

    .line 123
    .line 124
    const v14, 0x4101999a    # 8.1f

    .line 125
    .line 126
    .line 127
    const v15, 0x41b0cccd    # 22.1f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x41100000    # 9.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x418c0000    # 17.5f

    .line 139
    .line 140
    const/high16 v2, 0x40e00000    # 7.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3f6b851f    # 0.92f

    .line 146
    .line 147
    .line 148
    const v18, -0x3fd5c28f    # -2.66f

    .line 149
    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, -0x40c51eb8    # -0.73f

    .line 153
    .line 154
    .line 155
    const v15, 0x3ed1eb85    # 0.41f

    .line 156
    .line 157
    .line 158
    const v16, -0x40251eb8    # -1.71f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x413fd70a    # 11.99f

    .line 165
    .line 166
    .line 167
    const/high16 v18, 0x40000000    # 2.0f

    .line 168
    .line 169
    const v13, 0x418570a4    # 16.68f

    .line 170
    .line 171
    .line 172
    const v14, 0x403851ec    # 2.88f

    .line 173
    .line 174
    .line 175
    const v15, 0x41670a3d    # 14.44f

    .line 176
    .line 177
    .line 178
    const/high16 v16, 0x40000000    # 2.0f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x40000000    # 2.0f

    .line 184
    .line 185
    const/high16 v18, 0x41400000    # 12.0f

    .line 186
    .line 187
    const v13, 0x40cf0a3d    # 6.47f

    .line 188
    .line 189
    .line 190
    const/high16 v14, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v15, 0x40000000    # 2.0f

    .line 193
    .line 194
    const v16, 0x40cf5c29    # 6.48f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x411fd70a    # 9.99f

    .line 201
    .line 202
    .line 203
    const/high16 v18, 0x41200000    # 10.0f

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const v14, 0x40b0a3d7    # 5.52f

    .line 207
    .line 208
    .line 209
    const v15, 0x408f0a3d    # 4.47f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x41200000    # 10.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41b00000    # 22.0f

    .line 218
    .line 219
    const/high16 v18, 0x41400000    # 12.0f

    .line 220
    .line 221
    const v13, 0x418c28f6    # 17.52f

    .line 222
    .line 223
    .line 224
    const/high16 v14, 0x41b00000    # 22.0f

    .line 225
    .line 226
    const/high16 v15, 0x41b00000    # 22.0f

    .line 227
    .line 228
    const v16, 0x418c28f6    # 17.52f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x41f0a3d7    # -0.14f

    .line 235
    .line 236
    .line 237
    const v18, -0x4030a3d7    # -1.62f

    .line 238
    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, -0x40f33333    # -0.55f

    .line 242
    .line 243
    .line 244
    const v15, -0x428a3d71    # -0.06f

    .line 245
    .line 246
    .line 247
    const v16, -0x40747ae1    # -1.09f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x41a80000    # 21.0f

    .line 254
    .line 255
    const/high16 v18, 0x41280000    # 10.5f

    .line 256
    .line 257
    const v13, 0x41aca3d7    # 21.58f

    .line 258
    .line 259
    .line 260
    const v14, 0x41273333    # 10.45f

    .line 261
    .line 262
    .line 263
    const v15, 0x41aa6666    # 21.3f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x41280000    # 10.5f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x418c0000    # 17.5f

    .line 272
    .line 273
    const/high16 v18, 0x40e00000    # 7.0f

    .line 274
    .line 275
    const v13, 0x41988f5c    # 19.07f

    .line 276
    .line 277
    .line 278
    const/high16 v14, 0x41280000    # 10.5f

    .line 279
    .line 280
    const/high16 v15, 0x418c0000    # 17.5f

    .line 281
    .line 282
    const v16, 0x410ee148    # 8.93f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x40ec28f6    # 7.38f

    .line 292
    .line 293
    .line 294
    const v2, 0x4179eb85    # 15.62f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x3f87ae14    # 1.06f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x4179eb85    # 15.62f

    .line 307
    .line 308
    .line 309
    const/high16 v2, 0x41180000    # 9.5f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x3f87ae14    # 1.06f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, -0x407851ec    # -1.06f

    .line 321
    .line 322
    .line 323
    const v2, 0x3f87ae14    # 1.06f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41580000    # 13.5f

    .line 330
    .line 331
    const/high16 v2, 0x41180000    # 9.5f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x40ec28f6    # 7.38f

    .line 337
    .line 338
    .line 339
    const v2, 0x4179eb85    # 15.62f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x41070a3d    # 8.44f

    .line 349
    .line 350
    .line 351
    const v2, 0x40ea3d71    # 7.32f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x407851ec    # -1.06f

    .line 358
    .line 359
    .line 360
    const v2, 0x3f87ae14    # 1.06f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41280000    # 10.5f

    .line 367
    .line 368
    const/high16 v2, 0x41180000    # 9.5f

    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, -0x3ff851ec    # -2.12f

    .line 374
    .line 375
    .line 376
    const v2, 0x4007ae14    # 2.12f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x407851ec    # -1.06f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4106147b    # 8.38f

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x41180000    # 9.5f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x41070a3d    # 8.44f

    .line 397
    .line 398
    .line 399
    const v2, 0x40ea3d71    # 7.32f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41880000    # 17.0f

    .line 409
    .line 410
    const v2, 0x41770a3d    # 15.44f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, -0x3fa3d70a    # -3.44f

    .line 417
    .line 418
    .line 419
    const/high16 v18, -0x40000000    # -2.0f

    .line 420
    .line 421
    const v13, -0x40cf5c29    # -0.69f

    .line 422
    .line 423
    .line 424
    const v14, -0x4067ae14    # -1.19f

    .line 425
    .line 426
    .line 427
    const v15, -0x4003d70a    # -1.97f

    .line 428
    .line 429
    .line 430
    const/high16 v16, -0x40000000    # -2.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3f4f5c29    # 0.81f

    .line 436
    .line 437
    .line 438
    const v2, -0x3fa3d70a    # -3.44f

    .line 439
    .line 440
    .line 441
    const/high16 v6, -0x3fd00000    # -2.75f

    .line 442
    .line 443
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x40dc28f6    # 6.88f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3fab851f    # 1.34f

    .line 453
    .line 454
    .line 455
    const v18, -0x400147ae    # -1.99f

    .line 456
    .line 457
    .line 458
    const v13, 0x3e99999a    # 0.3f

    .line 459
    .line 460
    .line 461
    const v14, -0x40bd70a4    # -0.76f

    .line 462
    .line 463
    .line 464
    const v15, 0x3f428f5c    # 0.76f

    .line 465
    .line 466
    .line 467
    const v16, -0x4048f5c3    # -1.43f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x40a7ae14    # 5.24f

    .line 474
    .line 475
    .line 476
    const v2, 0x4154cccd    # 13.3f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x404147ae    # -1.49f

    .line 483
    .line 484
    .line 485
    const/16 v18, 0x0

    .line 486
    .line 487
    const v13, -0x4119999a    # -0.45f

    .line 488
    .line 489
    .line 490
    const v14, 0x3e851eb8    # 0.26f

    .line 491
    .line 492
    .line 493
    const v15, -0x407eb852    # -1.01f

    .line 494
    .line 495
    .line 496
    const v16, 0x3e8f5c29    # 0.28f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x40f33333    # -0.55f

    .line 503
    .line 504
    .line 505
    const v18, -0x3ffccccd    # -2.05f

    .line 506
    .line 507
    .line 508
    const v13, -0x40c7ae14    # -0.72f

    .line 509
    .line 510
    .line 511
    const v14, -0x412e147b    # -0.41f

    .line 512
    .line 513
    .line 514
    const v15, -0x408a3d71    # -0.96f

    .line 515
    .line 516
    .line 517
    const v16, -0x4055c28f    # -1.33f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x40033333    # 2.05f

    .line 524
    .line 525
    .line 526
    const v18, -0x40f33333    # -0.55f

    .line 527
    .line 528
    .line 529
    const v13, 0x3ed1eb85    # 0.41f

    .line 530
    .line 531
    .line 532
    const v14, -0x40c7ae14    # -0.72f

    .line 533
    .line 534
    .line 535
    const v15, 0x3faa3d71    # 1.33f

    .line 536
    .line 537
    .line 538
    const v16, -0x408a3d71    # -0.96f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3f3d70a4    # 0.74f

    .line 545
    .line 546
    .line 547
    const v18, 0x3fa51eb8    # 1.29f

    .line 548
    .line 549
    .line 550
    const v13, 0x3ef5c28f    # 0.48f

    .line 551
    .line 552
    .line 553
    const v14, 0x3e8f5c29    # 0.28f

    .line 554
    .line 555
    .line 556
    const v15, 0x3f3d70a4    # 0.74f

    .line 557
    .line 558
    .line 559
    const v16, 0x3f47ae14    # 0.78f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40651eb8    # 3.58f

    .line 566
    .line 567
    .line 568
    const v2, 0x40047ae1    # 2.07f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x401b851f    # 2.43f

    .line 575
    .line 576
    .line 577
    const v18, -0x40f0a3d7    # -0.56f

    .line 578
    .line 579
    .line 580
    const v13, 0x3f3ae148    # 0.73f

    .line 581
    .line 582
    .line 583
    const v14, -0x4147ae14    # -0.36f

    .line 584
    .line 585
    .line 586
    const v15, 0x3fc66666    # 1.55f

    .line 587
    .line 588
    .line 589
    const v16, -0x40f0a3d7    # -0.56f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, 0x40a3d70a    # 5.12f

    .line 596
    .line 597
    .line 598
    const/high16 v18, 0x40600000    # 3.5f

    .line 599
    .line 600
    const v13, 0x40151eb8    # 2.33f

    .line 601
    .line 602
    .line 603
    const/4 v14, 0x0

    .line 604
    const v15, 0x408a3d71    # 4.32f

    .line 605
    .line 606
    .line 607
    const v16, 0x3fb9999a    # 1.45f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x41770a3d    # 15.44f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/16 v16, 0x3800

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const/high16 v9, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v12, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v13, 0x0

    .line 640
    const/4 v15, 0x0

    .line 641
    const-string v4, ""

    .line 642
    .line 643
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    sput-object v0, Landroidx/compose/material/icons/sharp/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 652
    .line 653
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    return-object v0
.end method
