.class public final Landroidx/compose/material/icons/outlined/DrawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _draw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDraw(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Draw"

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
    const v0, 0x41263d71    # 10.39f

    .line 71
    .line 72
    .line 73
    const v2, 0x4196cccd    # 18.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x407851ec    # -1.06f

    .line 80
    .line 81
    .line 82
    const v2, 0x3f87ae14    # 1.06f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, -0x3fcae148    # -2.83f

    .line 91
    .line 92
    .line 93
    const v13, 0x3f47ae14    # 0.78f

    .line 94
    .line 95
    .line 96
    const v14, -0x40b851ec    # -0.78f

    .line 97
    .line 98
    .line 99
    const v15, 0x3f47ae14    # 0.78f

    .line 100
    .line 101
    .line 102
    const v16, -0x3ffccccd    # -2.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41940000    # 18.5f

    .line 109
    .line 110
    const v2, 0x40a2e148    # 5.09f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3fcae148    # -2.83f

    .line 117
    .line 118
    .line 119
    const/16 v18, 0x0

    .line 120
    .line 121
    const v13, -0x40b851ec    # -0.78f

    .line 122
    .line 123
    .line 124
    const v15, -0x3ffccccd    # -2.05f

    .line 125
    .line 126
    .line 127
    const v16, -0x40b851ec    # -0.78f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x407851ec    # -1.06f

    .line 134
    .line 135
    .line 136
    const v2, 0x3f87ae14    # 1.06f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x41263d71    # 10.39f

    .line 143
    .line 144
    .line 145
    const v2, 0x4196cccd    # 18.85f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x413cf5c3    # 11.81f

    .line 155
    .line 156
    .line 157
    const v2, 0x4169c28f    # 14.61f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x40ed1eb8    # 7.41f

    .line 164
    .line 165
    .line 166
    const/high16 v2, 0x41980000    # 19.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40c00000    # 6.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, -0x404b851f    # -1.41f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x40e6147b    # 7.19f

    .line 183
    .line 184
    .line 185
    const v2, -0x3f19eb85    # -7.19f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x413cf5c3    # 11.81f

    .line 192
    .line 193
    .line 194
    const v2, 0x4169c28f    # 14.61f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x40f1eb85    # 7.56f

    .line 204
    .line 205
    .line 206
    const v2, 0x41530a3d    # 13.19f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40800000    # 4.0f

    .line 213
    .line 214
    const v2, 0x4186147b    # 16.76f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x41a80000    # 21.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x4087ae14    # 4.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x41130a3d    # 9.19f

    .line 232
    .line 233
    .line 234
    const v2, -0x3eecf5c3    # -9.19f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x40f1eb85    # 7.56f

    .line 241
    .line 242
    .line 243
    const v2, 0x41530a3d    # 13.19f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x418c0000    # 17.5f

    .line 256
    .line 257
    const/high16 v2, 0x41980000    # 19.0f

    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x3f600000    # -5.0f

    .line 263
    .line 264
    const/high16 v18, 0x40600000    # 3.5f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, 0x400c28f6    # 2.19f

    .line 268
    .line 269
    .line 270
    const v15, -0x3fdd70a4    # -2.54f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x40600000    # 3.5f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/high16 v18, -0x40800000    # -1.0f

    .line 281
    .line 282
    const v13, -0x40f33333    # -0.55f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40800000    # -1.0f

    .line 287
    .line 288
    const v16, -0x4119999a    # -0.45f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v4, -0x40800000    # -1.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x40400000    # 3.0f

    .line 305
    .line 306
    const/high16 v18, -0x40400000    # -1.5f

    .line 307
    .line 308
    const v13, 0x3fc51eb8    # 1.54f

    .line 309
    .line 310
    .line 311
    const/high16 v15, 0x40400000    # 3.0f

    .line 312
    .line 313
    const v16, -0x40c51eb8    # -0.73f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x40628f5c    # -1.23f

    .line 320
    .line 321
    .line 322
    const v18, -0x40666666    # -1.2f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x410f5c29    # -0.47f

    .line 327
    .line 328
    .line 329
    const v15, -0x410a3d71    # -0.48f

    .line 330
    .line 331
    .line 332
    const v16, -0x40a147ae    # -0.87f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3fbd70a4    # 1.48f

    .line 339
    .line 340
    .line 341
    const v2, -0x40428f5c    # -1.48f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41980000    # 19.0f

    .line 348
    .line 349
    const/high16 v18, 0x418c0000    # 17.5f

    .line 350
    .line 351
    const v13, 0x41928f5c    # 18.32f

    .line 352
    .line 353
    .line 354
    const v14, 0x41773333    # 15.45f

    .line 355
    .line 356
    .line 357
    const/high16 v15, 0x41980000    # 19.0f

    .line 358
    .line 359
    const v16, 0x418251ec    # 16.29f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x4155999a    # 13.35f

    .line 369
    .line 370
    .line 371
    const v2, 0x40928f5c    # 4.58f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x40400000    # 3.0f

    .line 378
    .line 379
    const/high16 v18, 0x41300000    # 11.0f

    .line 380
    .line 381
    const v13, 0x40670a3d    # 3.61f

    .line 382
    .line 383
    .line 384
    const v14, 0x414ca3d7    # 12.79f

    .line 385
    .line 386
    .line 387
    const/high16 v15, 0x40400000    # 3.0f

    .line 388
    .line 389
    const v16, 0x4140f5c3    # 12.06f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x4063d70a    # 3.56f

    .line 396
    .line 397
    .line 398
    const v18, -0x3fa8f5c3    # -3.36f

    .line 399
    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, -0x4019999a    # -1.8f

    .line 403
    .line 404
    .line 405
    const v15, 0x3ff1eb85    # 1.89f

    .line 406
    .line 407
    .line 408
    const v16, -0x3fd7ae14    # -2.63f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41100000    # 9.0f

    .line 415
    .line 416
    const/high16 v18, 0x40c00000    # 6.0f

    .line 417
    .line 418
    const v13, 0x40f2e148    # 7.59f

    .line 419
    .line 420
    .line 421
    const v14, 0x40e5c28f    # 7.18f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x41100000    # 9.0f

    .line 425
    .line 426
    const v16, 0x40d1eb85    # 6.56f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, -0x40000000    # -2.0f

    .line 433
    .line 434
    const/high16 v18, -0x40800000    # -1.0f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x412e147b    # -0.41f

    .line 438
    .line 439
    .line 440
    const v15, -0x40b851ec    # -0.78f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x40800000    # -1.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x40a570a4    # 5.17f

    .line 449
    .line 450
    .line 451
    const v18, 0x40b47ae1    # 5.64f

    .line 452
    .line 453
    .line 454
    const v13, 0x40b7ae14    # 5.74f

    .line 455
    .line 456
    .line 457
    const/high16 v14, 0x40a00000    # 5.0f

    .line 458
    .line 459
    const v15, 0x40a66666    # 5.2f

    .line 460
    .line 461
    .line 462
    const v16, 0x40b3851f    # 5.61f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x407147ae    # 3.77f

    .line 469
    .line 470
    .line 471
    const v18, 0x40b851ec    # 5.76f

    .line 472
    .line 473
    .line 474
    const v13, 0x409a3d71    # 4.82f

    .line 475
    .line 476
    .line 477
    const v14, 0x40c1999a    # 6.05f

    .line 478
    .line 479
    .line 480
    const v15, 0x4086147b    # 4.19f

    .line 481
    .line 482
    .line 483
    const v16, 0x40c33333    # 6.1f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x4067ae14    # 3.62f

    .line 490
    .line 491
    .line 492
    const v18, 0x408c28f6    # 4.38f

    .line 493
    .line 494
    .line 495
    const v13, 0x40570a3d    # 3.36f

    .line 496
    .line 497
    .line 498
    const v14, 0x40ad70a4    # 5.42f

    .line 499
    .line 500
    .line 501
    const v15, 0x4051eb85    # 3.28f

    .line 502
    .line 503
    .line 504
    const v16, 0x4099eb85    # 4.81f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x40e00000    # 7.0f

    .line 511
    .line 512
    const/high16 v18, 0x40400000    # 3.0f

    .line 513
    .line 514
    const v13, 0x406eb852    # 3.73f

    .line 515
    .line 516
    .line 517
    const v14, 0x4087ae14    # 4.24f

    .line 518
    .line 519
    .line 520
    const v15, 0x409851ec    # 4.76f

    .line 521
    .line 522
    .line 523
    const/high16 v16, 0x40400000    # 3.0f

    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v17, 0x40800000    # 4.0f

    .line 529
    .line 530
    const v13, 0x400f5c29    # 2.24f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const/high16 v15, 0x40800000    # 4.0f

    .line 535
    .line 536
    const v16, 0x3fa8f5c3    # 1.32f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, -0x3f970a3d    # -3.64f

    .line 543
    .line 544
    .line 545
    const v18, 0x405e147b    # 3.47f

    .line 546
    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const v14, 0x3fef5c29    # 1.87f

    .line 550
    .line 551
    .line 552
    const v15, -0x4008f5c3    # -1.93f

    .line 553
    .line 554
    .line 555
    const v16, 0x402e147b    # 2.72f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x40a00000    # 5.0f

    .line 562
    .line 563
    const/high16 v18, 0x41300000    # 11.0f

    .line 564
    .line 565
    const v13, 0x40cd70a4    # 6.42f

    .line 566
    .line 567
    .line 568
    const v14, 0x411e147b    # 9.88f

    .line 569
    .line 570
    .line 571
    const/high16 v15, 0x40a00000    # 5.0f

    .line 572
    .line 573
    const/high16 v16, 0x41280000    # 10.5f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x3f88f5c3    # 1.07f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f5c28f6    # 0.86f

    .line 582
    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    const v14, 0x3e9eb852    # 0.31f

    .line 586
    .line 587
    .line 588
    const v15, 0x3edc28f6    # 0.43f

    .line 589
    .line 590
    .line 591
    const v16, 0x3f19999a    # 0.6f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/16 v16, 0x3800

    .line 608
    .line 609
    const/16 v17, 0x0

    .line 610
    .line 611
    const/high16 v6, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v8, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    const/high16 v9, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v12, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const/4 v15, 0x0

    .line 622
    const-string v4, ""

    .line 623
    .line 624
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    sput-object v0, Landroidx/compose/material/icons/outlined/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 633
    .line 634
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    return-object v0
.end method
