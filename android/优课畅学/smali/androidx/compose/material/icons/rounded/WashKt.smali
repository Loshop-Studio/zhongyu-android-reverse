.class public final Landroidx/compose/material/icons/rounded/WashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWash(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Wash"

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
    const v0, 0x413ca3d7    # 11.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x3ff851ec    # 1.94f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v18, 0x415f851f    # 13.97f

    .line 82
    .line 83
    .line 84
    const v13, 0x3fab851f    # 1.34f

    .line 85
    .line 86
    .line 87
    const v14, 0x4145999a    # 12.35f

    .line 88
    .line 89
    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, 0x41523d71    # 13.14f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41a00000    # 20.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40400000    # 3.0f

    .line 104
    .line 105
    const/high16 v18, 0x40400000    # 3.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3fd47ae1    # 1.66f

    .line 109
    .line 110
    .line 111
    const v15, 0x3fab851f    # 1.34f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40400000    # 3.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x415ae148    # 13.68f

    .line 120
    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x3fa8f5c3    # 1.32f

    .line 127
    .line 128
    .line 129
    const v18, -0x4070a3d7    # -1.12f

    .line 130
    .line 131
    .line 132
    const v13, 0x3f266666    # 0.65f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 137
    .line 138
    const v16, -0x410f5c29    # -0.47f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x406147ae    # -1.24f

    .line 145
    .line 146
    .line 147
    const v18, -0x404f5c29    # -1.38f

    .line 148
    .line 149
    .line 150
    const v13, 0x3da3d70a    # 0.08f

    .line 151
    .line 152
    .line 153
    const/high16 v14, -0x40c00000    # -0.75f

    .line 154
    .line 155
    const v15, -0x40fd70a4    # -0.51f

    .line 156
    .line 157
    .line 158
    const v16, -0x404f5c29    # -1.38f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41480000    # 12.5f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, -0x41000000    # -0.5f

    .line 170
    .line 171
    const/high16 v18, -0x41000000    # -0.5f

    .line 172
    .line 173
    const v13, -0x4170a3d7    # -0.28f

    .line 174
    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const/high16 v15, -0x41000000    # -0.5f

    .line 178
    .line 179
    const v16, -0x419eb852    # -0.22f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x3f000000    # 0.5f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const v14, -0x4170a3d7    # -0.28f

    .line 193
    .line 194
    .line 195
    const v15, 0x3e6147ae    # 0.22f

    .line 196
    .line 197
    .line 198
    const/high16 v16, -0x41000000    # -0.5f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x40e5c28f    # 7.18f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3fa8f5c3    # 1.32f

    .line 210
    .line 211
    .line 212
    const v18, -0x4070a3d7    # -1.12f

    .line 213
    .line 214
    .line 215
    const v13, 0x3f266666    # 0.65f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 220
    .line 221
    const v16, -0x410f5c29    # -0.47f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x406147ae    # -1.24f

    .line 228
    .line 229
    .line 230
    const v18, -0x404f5c29    # -1.38f

    .line 231
    .line 232
    .line 233
    const v13, 0x3da3d70a    # 0.08f

    .line 234
    .line 235
    .line 236
    const/high16 v14, -0x40c00000    # -0.75f

    .line 237
    .line 238
    const v15, -0x40fd70a4    # -0.51f

    .line 239
    .line 240
    .line 241
    const v16, -0x404f5c29    # -1.38f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41480000    # 12.5f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, -0x41000000    # -0.5f

    .line 253
    .line 254
    const/high16 v18, -0x41000000    # -0.5f

    .line 255
    .line 256
    const v13, -0x4170a3d7    # -0.28f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/high16 v15, -0x41000000    # -0.5f

    .line 261
    .line 262
    const v16, -0x419eb852    # -0.22f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/4 v0, 0x0

    .line 269
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x3f000000    # 0.5f

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const v14, -0x4170a3d7    # -0.28f

    .line 276
    .line 277
    .line 278
    const v15, 0x3e6147ae    # 0.22f

    .line 279
    .line 280
    .line 281
    const/high16 v16, -0x41000000    # -0.5f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x4102e148    # 8.18f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3fa8f5c3    # 1.32f

    .line 293
    .line 294
    .line 295
    const v18, -0x4070a3d7    # -1.12f

    .line 296
    .line 297
    .line 298
    const v13, 0x3f266666    # 0.65f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 303
    .line 304
    const v16, -0x410f5c29    # -0.47f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x406147ae    # -1.24f

    .line 311
    .line 312
    .line 313
    const v18, -0x404f5c29    # -1.38f

    .line 314
    .line 315
    .line 316
    const v13, 0x3da3d70a    # 0.08f

    .line 317
    .line 318
    .line 319
    const/high16 v14, -0x40c00000    # -0.75f

    .line 320
    .line 321
    const v15, -0x40fd70a4    # -0.51f

    .line 322
    .line 323
    .line 324
    const v16, -0x404f5c29    # -1.38f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41480000    # 12.5f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, -0x41000000    # -0.5f

    .line 336
    .line 337
    const/high16 v18, -0x41000000    # -0.5f

    .line 338
    .line 339
    const v13, -0x4170a3d7    # -0.28f

    .line 340
    .line 341
    .line 342
    const/4 v14, 0x0

    .line 343
    const/high16 v15, -0x41000000    # -0.5f

    .line 344
    .line 345
    const v16, -0x419eb852    # -0.22f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/4 v0, 0x0

    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x3f000000    # 0.5f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const v14, -0x4170a3d7    # -0.28f

    .line 359
    .line 360
    .line 361
    const v15, 0x3e6147ae    # 0.22f

    .line 362
    .line 363
    .line 364
    const/high16 v16, -0x41000000    # -0.5f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40c5c28f    # 6.18f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x3fa8f5c3    # 1.32f

    .line 376
    .line 377
    .line 378
    const v18, -0x4070a3d7    # -1.12f

    .line 379
    .line 380
    .line 381
    const v13, 0x3f266666    # 0.65f

    .line 382
    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 386
    .line 387
    const v16, -0x410f5c29    # -0.47f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x406147ae    # -1.24f

    .line 394
    .line 395
    .line 396
    const v18, -0x404f5c29    # -1.38f

    .line 397
    .line 398
    .line 399
    const v13, 0x3da3d70a    # 0.08f

    .line 400
    .line 401
    .line 402
    const/high16 v14, -0x40c00000    # -0.75f

    .line 403
    .line 404
    const v15, -0x40fd70a4    # -0.51f

    .line 405
    .line 406
    .line 407
    const v16, -0x404f5c29    # -1.38f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x410dc28f    # 8.86f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3fbeb852    # 1.49f

    .line 420
    .line 421
    .line 422
    const v2, -0x3fd8f5c3    # -2.61f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x3e0f5c29    # 0.14f

    .line 429
    .line 430
    .line 431
    const v18, -0x40f851ec    # -0.53f

    .line 432
    .line 433
    .line 434
    const v13, 0x3db851ec    # 0.09f

    .line 435
    .line 436
    .line 437
    const v14, -0x41dc28f6    # -0.16f

    .line 438
    .line 439
    .line 440
    const v15, 0x3e0f5c29    # 0.14f

    .line 441
    .line 442
    .line 443
    const v16, -0x41570a3d    # -0.33f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x417ae148    # -0.26f

    .line 450
    .line 451
    .line 452
    const v18, -0x40cccccd    # -0.7f

    .line 453
    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, -0x417ae148    # -0.26f

    .line 457
    .line 458
    .line 459
    const v15, -0x4247ae14    # -0.09f

    .line 460
    .line 461
    .line 462
    const/high16 v16, -0x41000000    # -0.5f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x411cf5c3    # 9.81f

    .line 468
    .line 469
    .line 470
    const v2, 0x40b6b852    # 5.71f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x41066666    # 8.4f

    .line 477
    .line 478
    .line 479
    const v18, 0x40b5c28f    # 5.68f

    .line 480
    .line 481
    .line 482
    const v13, 0x4116e148    # 9.43f

    .line 483
    .line 484
    .line 485
    const v14, 0x40aa3d71    # 5.32f

    .line 486
    .line 487
    .line 488
    const v15, 0x410ccccd    # 8.8f

    .line 489
    .line 490
    .line 491
    const v16, 0x40a9999a    # 5.3f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x413ca3d7    # 11.79f

    .line 498
    .line 499
    .line 500
    const v2, 0x3ff851ec    # 1.94f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x41940000    # 18.5f

    .line 510
    .line 511
    const/high16 v2, 0x41000000    # 8.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41a80000    # 21.0f

    .line 517
    .line 518
    const/high16 v18, 0x40b00000    # 5.5f

    .line 519
    .line 520
    const v13, 0x419f0a3d    # 19.88f

    .line 521
    .line 522
    .line 523
    const/high16 v14, 0x41000000    # 8.0f

    .line 524
    .line 525
    const/high16 v15, 0x41a80000    # 21.0f

    .line 526
    .line 527
    const v16, 0x40dc28f6    # 6.88f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, -0x3ff8f5c3    # -2.11f

    .line 534
    .line 535
    .line 536
    const v18, -0x3f7eb852    # -4.04f

    .line 537
    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/high16 v14, -0x40600000    # -1.25f

    .line 541
    .line 542
    const v15, -0x404b851f    # -1.41f

    .line 543
    .line 544
    .line 545
    const v16, -0x3fb5c28f    # -3.16f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x40bae148    # -0.77f

    .line 552
    .line 553
    .line 554
    const/16 v18, 0x0

    .line 555
    .line 556
    const v13, -0x41b33333    # -0.2f

    .line 557
    .line 558
    .line 559
    const/high16 v14, -0x41800000    # -0.25f

    .line 560
    .line 561
    const v15, -0x40ee147b    # -0.57f

    .line 562
    .line 563
    .line 564
    const/high16 v16, -0x41800000    # -0.25f

    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, 0x41800000    # 16.0f

    .line 570
    .line 571
    const/high16 v18, 0x40b00000    # 5.5f

    .line 572
    .line 573
    const v13, 0x418b47ae    # 17.41f

    .line 574
    .line 575
    .line 576
    const v14, 0x4015c28f    # 2.34f

    .line 577
    .line 578
    .line 579
    const/high16 v15, 0x41800000    # 16.0f

    .line 580
    .line 581
    const/high16 v16, 0x40880000    # 4.25f

    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x41940000    # 18.5f

    .line 587
    .line 588
    const/high16 v18, 0x41000000    # 8.0f

    .line 589
    .line 590
    const/high16 v13, 0x41800000    # 16.0f

    .line 591
    .line 592
    const v14, 0x40dc28f6    # 6.88f

    .line 593
    .line 594
    .line 595
    const v15, 0x4188f5c3    # 17.12f

    .line 596
    .line 597
    .line 598
    const/high16 v16, 0x41000000    # 8.0f

    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41580000    # 13.5f

    .line 607
    .line 608
    const/high16 v2, 0x41100000    # 9.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v17, 0x41700000    # 15.0f

    .line 614
    .line 615
    const/high16 v18, 0x40f00000    # 7.5f

    .line 616
    .line 617
    const v13, 0x416547ae    # 14.33f

    .line 618
    .line 619
    .line 620
    const/high16 v14, 0x41100000    # 9.0f

    .line 621
    .line 622
    const/high16 v15, 0x41700000    # 15.0f

    .line 623
    .line 624
    const v16, 0x410547ae    # 8.33f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v17, -0x4071eb85    # -1.11f

    .line 631
    .line 632
    .line 633
    const v18, -0x3ffd70a4    # -2.04f

    .line 634
    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const v14, -0x40f0a3d7    # -0.56f

    .line 638
    .line 639
    .line 640
    const v15, -0x40d47ae1    # -0.67f

    .line 641
    .line 642
    .line 643
    const v16, -0x404147ae    # -1.49f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, -0x40bae148    # -0.77f

    .line 650
    .line 651
    .line 652
    const/16 v18, 0x0

    .line 653
    .line 654
    const v13, -0x41b33333    # -0.2f

    .line 655
    .line 656
    .line 657
    const/high16 v14, -0x41800000    # -0.25f

    .line 658
    .line 659
    const v15, -0x40eb851f    # -0.58f

    .line 660
    .line 661
    .line 662
    const/high16 v16, -0x41800000    # -0.25f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v17, 0x41400000    # 12.0f

    .line 668
    .line 669
    const/high16 v18, 0x40f00000    # 7.5f

    .line 670
    .line 671
    const v13, 0x414ab852    # 12.67f

    .line 672
    .line 673
    .line 674
    const v14, 0x40c051ec    # 6.01f

    .line 675
    .line 676
    .line 677
    const/high16 v15, 0x41400000    # 12.0f

    .line 678
    .line 679
    const v16, 0x40de147b    # 6.94f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, 0x41580000    # 13.5f

    .line 686
    .line 687
    const/high16 v18, 0x41100000    # 9.0f

    .line 688
    .line 689
    const/high16 v13, 0x41400000    # 12.0f

    .line 690
    .line 691
    const v14, 0x410547ae    # 8.33f

    .line 692
    .line 693
    .line 694
    const v15, 0x414ab852    # 12.67f

    .line 695
    .line 696
    .line 697
    const/high16 v16, 0x41100000    # 9.0f

    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    const/16 v16, 0x3800

    .line 710
    .line 711
    const/16 v17, 0x0

    .line 712
    .line 713
    const/high16 v6, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/high16 v8, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/4 v7, 0x0

    .line 718
    const/high16 v9, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/high16 v12, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const/4 v14, 0x0

    .line 724
    const/4 v15, 0x0

    .line 725
    const-string v4, ""

    .line 726
    .line 727
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    sput-object v0, Landroidx/compose/material/icons/rounded/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 736
    .line 737
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    return-object v0
.end method
