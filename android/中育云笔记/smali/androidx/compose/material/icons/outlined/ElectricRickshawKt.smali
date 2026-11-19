.class public final Landroidx/compose/material/icons/outlined/ElectricRickshawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricRickshaw(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ElectricRickshaw"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v6, 0x4132e148    # 11.18f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x411b851f    # 9.72f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x41147ae1    # -0.46f

    .line 85
    .line 86
    .line 87
    const v26, -0x405c28f6    # -1.28f

    .line 88
    .line 89
    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const v22, -0x410f5c29    # -0.47f

    .line 93
    .line 94
    .line 95
    const v23, -0x41dc28f6    # -0.16f

    .line 96
    .line 97
    .line 98
    const v24, -0x40947ae1    # -0.92f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x4184cccd    # 16.6f

    .line 107
    .line 108
    .line 109
    const v6, 0x406e147b    # 3.72f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, 0x4170f5c3    # 15.06f

    .line 116
    .line 117
    .line 118
    const/high16 v26, 0x40400000    # 3.0f

    .line 119
    .line 120
    const v21, 0x4181c28f    # 16.22f

    .line 121
    .line 122
    .line 123
    const v22, 0x4050a3d7    # 3.26f

    .line 124
    .line 125
    .line 126
    const v23, 0x417a8f5c    # 15.66f

    .line 127
    .line 128
    .line 129
    const/high16 v24, 0x40400000    # 3.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40400000    # 3.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v26, 0x40a00000    # 5.0f

    .line 142
    .line 143
    const v21, 0x3ff33333    # 1.9f

    .line 144
    .line 145
    .line 146
    const/high16 v22, 0x40400000    # 3.0f

    .line 147
    .line 148
    const/high16 v23, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const v24, 0x4079999a    # 3.9f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41000000    # 8.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x40000000    # 2.0f

    .line 162
    .line 163
    const/high16 v26, 0x40000000    # 2.0f

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const v22, 0x3f8ccccd    # 1.1f

    .line 168
    .line 169
    .line 170
    const v23, 0x3f666666    # 0.9f

    .line 171
    .line 172
    .line 173
    const/high16 v24, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x3e3851ec    # 0.18f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x40c00000    # 6.0f

    .line 185
    .line 186
    const/high16 v26, 0x41880000    # 17.0f

    .line 187
    .line 188
    const v21, 0x40666666    # 3.6f

    .line 189
    .line 190
    .line 191
    const v22, 0x418147ae    # 16.16f

    .line 192
    .line 193
    .line 194
    const v23, 0x40966666    # 4.7f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x41880000    # 17.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, -0x40a8f5c3    # -0.84f

    .line 203
    .line 204
    .line 205
    const v6, 0x40347ae1    # 2.82f

    .line 206
    .line 207
    .line 208
    const/high16 v7, -0x40000000    # -2.0f

    .line 209
    .line 210
    const v8, 0x4019999a    # 2.4f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, 0x4105eb85    # 8.37f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, 0x40347ae1    # 2.82f

    .line 223
    .line 224
    .line 225
    const/high16 v26, 0x40000000    # 2.0f

    .line 226
    .line 227
    const v21, 0x3ed1eb85    # 0.41f

    .line 228
    .line 229
    .line 230
    const v22, 0x3f947ae1    # 1.16f

    .line 231
    .line 232
    .line 233
    const v23, 0x3fc147ae    # 1.51f

    .line 234
    .line 235
    .line 236
    const/high16 v24, 0x40000000    # 2.0f

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x40400000    # 3.0f

    .line 242
    .line 243
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 244
    .line 245
    const v21, 0x3fd47ae1    # 1.66f

    .line 246
    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const/high16 v23, 0x40400000    # 3.0f

    .line 251
    .line 252
    const v24, -0x40547ae1    # -1.34f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41a80000    # 21.0f

    .line 259
    .line 260
    const v26, 0x4132e148    # 11.18f

    .line 261
    .line 262
    .line 263
    const/high16 v21, 0x41b80000    # 23.0f

    .line 264
    .line 265
    const v22, 0x414b3333    # 12.7f

    .line 266
    .line 267
    .line 268
    const v23, 0x41b147ae    # 22.16f

    .line 269
    .line 270
    .line 271
    const v24, 0x4139999a    # 11.6f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40c00000    # 6.0f

    .line 281
    .line 282
    const/high16 v6, 0x41700000    # 15.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, -0x40800000    # -1.0f

    .line 288
    .line 289
    const/high16 v26, -0x40800000    # -1.0f

    .line 290
    .line 291
    const v21, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/high16 v23, -0x40800000    # -1.0f

    .line 297
    .line 298
    const v24, -0x4119999a    # -0.45f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, -0x40800000    # -1.0f

    .line 305
    .line 306
    const v6, 0x3ee66666    # 0.45f

    .line 307
    .line 308
    .line 309
    const/high16 v7, 0x3f800000    # 1.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x3ee66666    # 0.45f

    .line 315
    .line 316
    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v4, 0x40d1999a    # 6.55f

    .line 323
    .line 324
    .line 325
    const/high16 v6, 0x40c00000    # 6.0f

    .line 326
    .line 327
    const/high16 v7, 0x41700000    # 15.0f

    .line 328
    .line 329
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, 0x4132b852    # 11.17f

    .line 336
    .line 337
    .line 338
    const/high16 v6, 0x40e00000    # 7.0f

    .line 339
    .line 340
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v25, 0x40c00000    # 6.0f

    .line 344
    .line 345
    const/high16 v26, 0x41300000    # 11.0f

    .line 346
    .line 347
    const v21, 0x40d6147b    # 6.69f

    .line 348
    .line 349
    .line 350
    const v22, 0x4130f5c3    # 11.06f

    .line 351
    .line 352
    .line 353
    const v23, 0x40cb3333    # 6.35f

    .line 354
    .line 355
    .line 356
    const/high16 v24, 0x41300000    # 11.0f

    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v25, -0x3fcae148    # -2.83f

    .line 362
    .line 363
    .line 364
    const/high16 v26, 0x40000000    # 2.0f

    .line 365
    .line 366
    const v21, -0x4059999a    # -1.3f

    .line 367
    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const v23, -0x3fe51eb8    # -2.42f

    .line 372
    .line 373
    .line 374
    const v24, 0x3f570a3d    # 0.84f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x40400000    # 3.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v4, 0x40800000    # 4.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x4132b852    # 11.17f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x40e00000    # 7.0f

    .line 405
    .line 406
    const/high16 v6, 0x41000000    # 8.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x40400000    # 3.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x40a00000    # 5.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x40800000    # 4.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x41000000    # 8.0f

    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x41600000    # 14.0f

    .line 435
    .line 436
    const/high16 v6, 0x41500000    # 13.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41100000    # 9.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, 0x40400000    # 3.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x41000000    # 8.0f

    .line 457
    .line 458
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v4, 0x41100000    # 9.0f

    .line 462
    .line 463
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v4, 0x40a00000    # 5.0f

    .line 467
    .line 468
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x41500000    # 13.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v4, 0x40c3d70a    # 6.12f

    .line 483
    .line 484
    .line 485
    const/high16 v6, 0x41800000    # 16.0f

    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v4, 0x41933333    # 18.4f

    .line 491
    .line 492
    .line 493
    const/high16 v6, 0x41100000    # 9.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x41800000    # 16.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v4, 0x40c3d70a    # 6.12f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v4, 0x41895c29    # 17.17f

    .line 513
    .line 514
    .line 515
    const/high16 v6, 0x41500000    # 13.0f

    .line 516
    .line 517
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x41800000    # 16.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v4, -0x40000000    # -2.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, 0x40400000    # 3.0f

    .line 531
    .line 532
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v4, 0x3e2e147b    # 0.17f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v25, 0x41895c29    # 17.17f

    .line 542
    .line 543
    .line 544
    const/high16 v26, 0x41500000    # 13.0f

    .line 545
    .line 546
    const v21, 0x41913333    # 18.15f

    .line 547
    .line 548
    .line 549
    const v22, 0x4137851f    # 11.47f

    .line 550
    .line 551
    .line 552
    const v23, 0x418bc28f    # 17.47f

    .line 553
    .line 554
    .line 555
    const v24, 0x41426666    # 12.15f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x41a00000    # 20.0f

    .line 565
    .line 566
    const/high16 v6, 0x41700000    # 15.0f

    .line 567
    .line 568
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v25, -0x40800000    # -1.0f

    .line 572
    .line 573
    const/high16 v26, -0x40800000    # -1.0f

    .line 574
    .line 575
    const v21, -0x40f33333    # -0.55f

    .line 576
    .line 577
    .line 578
    const/16 v22, 0x0

    .line 579
    .line 580
    const/high16 v23, -0x40800000    # -1.0f

    .line 581
    .line 582
    const v24, -0x4119999a    # -0.45f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, -0x40800000    # -1.0f

    .line 589
    .line 590
    const v6, 0x3ee66666    # 0.45f

    .line 591
    .line 592
    .line 593
    const/high16 v7, 0x3f800000    # 1.0f

    .line 594
    .line 595
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v4, 0x3ee66666    # 0.45f

    .line 599
    .line 600
    .line 601
    const/high16 v6, 0x3f800000    # 1.0f

    .line 602
    .line 603
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v4, 0x41a46666    # 20.55f

    .line 607
    .line 608
    .line 609
    const/high16 v6, 0x41a00000    # 20.0f

    .line 610
    .line 611
    const/high16 v7, 0x41700000    # 15.0f

    .line 612
    .line 613
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    const/16 v16, 0x3800

    .line 624
    .line 625
    const/16 v17, 0x0

    .line 626
    .line 627
    const/high16 v6, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/high16 v8, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v7, 0x0

    .line 632
    const/high16 v9, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/high16 v12, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const/4 v14, 0x0

    .line 638
    const/4 v15, 0x0

    .line 639
    const-string v4, ""

    .line 640
    .line 641
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 642
    .line 643
    .line 644
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 649
    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 651
    .line 652
    .line 653
    move-result-wide v6

    .line 654
    const/4 v0, 0x0

    .line 655
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 659
    .line 660
    .line 661
    move-result v10

    .line 662
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 663
    .line 664
    .line 665
    move-result v11

    .line 666
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    const/high16 v2, 0x41a00000    # 20.0f

    .line 672
    .line 673
    const/high16 v4, 0x40e00000    # 7.0f

    .line 674
    .line 675
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v2, 0x40800000    # 4.0f

    .line 679
    .line 680
    const/4 v4, 0x0

    .line 681
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v2, -0x40000000    # -2.0f

    .line 685
    .line 686
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v2, 0x40c00000    # 6.0f

    .line 690
    .line 691
    const/high16 v4, 0x40400000    # 3.0f

    .line 692
    .line 693
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v2, -0x3f800000    # -4.0f

    .line 697
    .line 698
    const/4 v4, 0x0

    .line 699
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v2, 0x40000000    # 2.0f

    .line 703
    .line 704
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const/high16 v6, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v7, 0x0

    .line 717
    const-string v4, ""

    .line 718
    .line 719
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    sput-object v0, Landroidx/compose/material/icons/outlined/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 728
    .line 729
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    return-object v0
.end method
