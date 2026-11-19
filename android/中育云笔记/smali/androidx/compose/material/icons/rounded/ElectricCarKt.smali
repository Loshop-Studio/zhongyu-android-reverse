.class public final Landroidx/compose/material/icons/rounded/ElectricCarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricCar(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElectricCarKt;->_electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ElectricCar"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x4000a3d7    # 2.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x41975c29    # 18.92f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x418c0000    # 17.5f

    .line 80
    .line 81
    const/high16 v26, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v21, 0x4195c28f    # 18.72f

    .line 84
    .line 85
    .line 86
    const v22, 0x3fb5c28f    # 1.42f

    .line 87
    .line 88
    .line 89
    const v23, 0x419147ae    # 18.16f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x3f800000    # 1.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, 0x40a28f5c    # 5.08f

    .line 105
    .line 106
    .line 107
    const v26, 0x4000a3d7    # 2.01f

    .line 108
    .line 109
    .line 110
    const v21, 0x40bae148    # 5.84f

    .line 111
    .line 112
    .line 113
    const/high16 v22, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v23, 0x40a947ae    # 5.29f

    .line 116
    .line 117
    .line 118
    const v24, 0x3fb5c28f    # 1.42f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x40470a3d    # 3.11f

    .line 125
    .line 126
    .line 127
    const v6, 0x40f5c28f    # 7.68f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x40400000    # 3.0f

    .line 134
    .line 135
    const v26, 0x410570a4    # 8.34f

    .line 136
    .line 137
    .line 138
    const v21, 0x40428f5c    # 3.04f

    .line 139
    .line 140
    .line 141
    const v22, 0x40fc7ae1    # 7.89f

    .line 142
    .line 143
    .line 144
    const/high16 v23, 0x40400000    # 3.0f

    .line 145
    .line 146
    const v24, 0x4101c28f    # 8.11f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x40e51eb8    # 7.16f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x40900000    # 4.5f

    .line 159
    .line 160
    const/high16 v26, 0x41880000    # 17.0f

    .line 161
    .line 162
    const/high16 v21, 0x40400000    # 3.0f

    .line 163
    .line 164
    const v22, 0x4182a3d7    # 16.33f

    .line 165
    .line 166
    .line 167
    const v23, 0x406ae148    # 3.67f

    .line 168
    .line 169
    .line 170
    const/high16 v24, 0x41880000    # 17.0f

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, 0x40c00000    # 6.0f

    .line 180
    .line 181
    const/high16 v26, 0x41780000    # 15.5f

    .line 182
    .line 183
    const v21, 0x40aa8f5c    # 5.33f

    .line 184
    .line 185
    .line 186
    const/high16 v22, 0x41880000    # 17.0f

    .line 187
    .line 188
    const/high16 v23, 0x40c00000    # 6.0f

    .line 189
    .line 190
    const v24, 0x4182a3d7    # 16.33f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x41700000    # 15.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x41400000    # 12.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x3f000000    # 0.5f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 212
    .line 213
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 214
    .line 215
    const/16 v21, 0x0

    .line 216
    .line 217
    const v22, 0x3f51eb85    # 0.82f

    .line 218
    .line 219
    .line 220
    const v23, 0x3f2b851f    # 0.67f

    .line 221
    .line 222
    .line 223
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/4 v4, 0x0

    .line 229
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v26, -0x40400000    # -1.5f

    .line 233
    .line 234
    const v21, 0x3f51eb85    # 0.82f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 240
    .line 241
    const v24, -0x40d47ae1    # -0.67f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x410570a4    # 8.34f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, -0x421eb852    # -0.11f

    .line 254
    .line 255
    .line 256
    const v26, -0x40d70a3d    # -0.66f

    .line 257
    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const v22, -0x419eb852    # -0.22f

    .line 262
    .line 263
    .line 264
    const v23, -0x42dc28f6    # -0.04f

    .line 265
    .line 266
    .line 267
    const v24, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x4000a3d7    # 2.01f

    .line 274
    .line 275
    .line 276
    const v6, 0x41975c29    # 18.92f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x40d00000    # 6.5f

    .line 286
    .line 287
    const/high16 v6, 0x41400000    # 12.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x40a00000    # 5.0f

    .line 293
    .line 294
    const/high16 v26, 0x41280000    # 10.5f

    .line 295
    .line 296
    const v21, 0x40b570a4    # 5.67f

    .line 297
    .line 298
    .line 299
    const/high16 v22, 0x41400000    # 12.0f

    .line 300
    .line 301
    const/high16 v23, 0x40a00000    # 5.0f

    .line 302
    .line 303
    const v24, 0x413547ae    # 11.33f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x40b570a4    # 5.67f

    .line 310
    .line 311
    .line 312
    const/high16 v6, 0x40d00000    # 6.5f

    .line 313
    .line 314
    const/high16 v7, 0x41100000    # 9.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41280000    # 10.5f

    .line 320
    .line 321
    const v6, 0x411ab852    # 9.67f

    .line 322
    .line 323
    .line 324
    const/high16 v7, 0x41000000    # 8.0f

    .line 325
    .line 326
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x40ea8f5c    # 7.33f

    .line 330
    .line 331
    .line 332
    const/high16 v6, 0x40d00000    # 6.5f

    .line 333
    .line 334
    const/high16 v7, 0x41400000    # 12.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x418c0000    # 17.5f

    .line 343
    .line 344
    const/high16 v6, 0x41400000    # 12.0f

    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, -0x40400000    # -1.5f

    .line 350
    .line 351
    const/high16 v26, -0x40400000    # -1.5f

    .line 352
    .line 353
    const v21, -0x40ab851f    # -0.83f

    .line 354
    .line 355
    .line 356
    const/16 v22, 0x0

    .line 357
    .line 358
    const/high16 v23, -0x40400000    # -1.5f

    .line 359
    .line 360
    const v24, -0x40d47ae1    # -0.67f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x41855c29    # 16.67f

    .line 367
    .line 368
    .line 369
    const/high16 v6, 0x418c0000    # 17.5f

    .line 370
    .line 371
    const/high16 v7, 0x41100000    # 9.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x41280000    # 10.5f

    .line 377
    .line 378
    const v6, 0x411ab852    # 9.67f

    .line 379
    .line 380
    .line 381
    const/high16 v7, 0x41980000    # 19.0f

    .line 382
    .line 383
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v4, 0x4192a3d7    # 18.33f

    .line 387
    .line 388
    .line 389
    const/high16 v6, 0x418c0000    # 17.5f

    .line 390
    .line 391
    const/high16 v7, 0x41400000    # 12.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x40a00000    # 5.0f

    .line 400
    .line 401
    const/high16 v6, 0x40e00000    # 7.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x3fa28f5c    # 1.27f

    .line 407
    .line 408
    .line 409
    const v6, -0x3f8b851f    # -3.82f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, 0x40e70a3d    # 7.22f

    .line 416
    .line 417
    .line 418
    const/high16 v26, 0x40200000    # 2.5f

    .line 419
    .line 420
    const v21, 0x40cd1eb8    # 6.41f

    .line 421
    .line 422
    .line 423
    const v22, 0x4031eb85    # 2.78f

    .line 424
    .line 425
    .line 426
    const v23, 0x40d947ae    # 6.79f

    .line 427
    .line 428
    .line 429
    const/high16 v24, 0x40200000    # 2.5f

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x4118f5c3    # 9.56f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v25, 0x3f733333    # 0.95f

    .line 441
    .line 442
    .line 443
    const v26, 0x3f2e147b    # 0.68f

    .line 444
    .line 445
    .line 446
    const v21, 0x3edc28f6    # 0.43f

    .line 447
    .line 448
    .line 449
    const/16 v22, 0x0

    .line 450
    .line 451
    const v23, 0x3f4f5c29    # 0.81f

    .line 452
    .line 453
    .line 454
    const v24, 0x3e8f5c29    # 0.28f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v4, 0x40e00000    # 7.0f

    .line 461
    .line 462
    const/high16 v6, 0x41980000    # 19.0f

    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x40a00000    # 5.0f

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    const/16 v16, 0x3800

    .line 480
    .line 481
    const/16 v17, 0x0

    .line 482
    .line 483
    const/high16 v6, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/high16 v8, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/4 v7, 0x0

    .line 488
    const/high16 v9, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/high16 v12, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    const/4 v15, 0x0

    .line 495
    const-string v4, ""

    .line 496
    .line 497
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 498
    .line 499
    .line 500
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 505
    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 507
    .line 508
    .line 509
    move-result-wide v6

    .line 510
    const/4 v0, 0x0

    .line 511
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 525
    .line 526
    .line 527
    const/high16 v2, 0x41a00000    # 20.0f

    .line 528
    .line 529
    const/high16 v4, 0x40e00000    # 7.0f

    .line 530
    .line 531
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v2, 0x40800000    # 4.0f

    .line 535
    .line 536
    const/4 v4, 0x0

    .line 537
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v2, -0x40000000    # -2.0f

    .line 541
    .line 542
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v2, 0x40c00000    # 6.0f

    .line 546
    .line 547
    const/high16 v4, 0x40400000    # 3.0f

    .line 548
    .line 549
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v2, -0x3f800000    # -4.0f

    .line 553
    .line 554
    const/4 v4, 0x0

    .line 555
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v2, 0x40000000    # 2.0f

    .line 559
    .line 560
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const-string v4, ""

    .line 574
    .line 575
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    sput-object v0, Landroidx/compose/material/icons/rounded/ElectricCarKt;->_electricCar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    return-object v0
.end method
