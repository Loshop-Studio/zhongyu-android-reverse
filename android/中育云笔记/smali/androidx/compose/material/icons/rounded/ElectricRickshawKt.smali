.class public final Landroidx/compose/material/icons/rounded/ElectricRickshawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricRickshaw(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ElectricRickshaw"

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
    const v4, 0x41933333    # 18.4f

    .line 281
    .line 282
    .line 283
    const/high16 v6, 0x41100000    # 9.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x41800000    # 16.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, 0x40c3d70a    # 6.12f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x41933333    # 18.4f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x40a00000    # 5.0f

    .line 309
    .line 310
    const/high16 v6, 0x40800000    # 4.0f

    .line 311
    .line 312
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40400000    # 3.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x40800000    # 4.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x40400000    # 3.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x40c00000    # 6.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, 0x40800000    # 4.0f

    .line 336
    .line 337
    const/high16 v26, 0x40a00000    # 5.0f

    .line 338
    .line 339
    const/high16 v21, 0x40400000    # 3.0f

    .line 340
    .line 341
    const v22, 0x40ae6666    # 5.45f

    .line 342
    .line 343
    .line 344
    const v23, 0x405ccccd    # 3.45f

    .line 345
    .line 346
    .line 347
    const/high16 v24, 0x40a00000    # 5.0f

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v6, 0x41700000    # 15.0f

    .line 356
    .line 357
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v25, -0x40800000    # -1.0f

    .line 361
    .line 362
    const/high16 v26, -0x40800000    # -1.0f

    .line 363
    .line 364
    const v21, -0x40f33333    # -0.55f

    .line 365
    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const/high16 v23, -0x40800000    # -1.0f

    .line 370
    .line 371
    const v24, -0x4119999a    # -0.45f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v4, -0x40800000    # -1.0f

    .line 378
    .line 379
    const v6, 0x3ee66666    # 0.45f

    .line 380
    .line 381
    .line 382
    const/high16 v7, 0x3f800000    # 1.0f

    .line 383
    .line 384
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, 0x3ee66666    # 0.45f

    .line 388
    .line 389
    .line 390
    const/high16 v6, 0x3f800000    # 1.0f

    .line 391
    .line 392
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x40d1999a    # 6.55f

    .line 396
    .line 397
    .line 398
    const/high16 v6, 0x40c00000    # 6.0f

    .line 399
    .line 400
    const/high16 v7, 0x41700000    # 15.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41500000    # 13.0f

    .line 409
    .line 410
    const/high16 v6, 0x41100000    # 9.0f

    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v4, -0x40000000    # -2.0f

    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v4, 0x40000000    # 2.0f

    .line 421
    .line 422
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v25, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const v21, 0x3f0ccccd    # 0.55f

    .line 428
    .line 429
    .line 430
    const/high16 v23, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/4 v4, 0x0

    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v25, -0x40800000    # -1.0f

    .line 440
    .line 441
    const/16 v21, 0x0

    .line 442
    .line 443
    const v22, -0x40f33333    # -0.55f

    .line 444
    .line 445
    .line 446
    const v23, -0x4119999a    # -0.45f

    .line 447
    .line 448
    .line 449
    const/high16 v24, -0x40800000    # -1.0f

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41100000    # 9.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x40a00000    # 5.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, 0x40800000    # 4.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v25, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v26, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const v21, 0x3f0ccccd    # 0.55f

    .line 474
    .line 475
    .line 476
    const/16 v22, 0x0

    .line 477
    .line 478
    const/high16 v23, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const v24, 0x3ee66666    # 0.45f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v4, 0x40e00000    # 7.0f

    .line 487
    .line 488
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v4, 0x41100000    # 9.0f

    .line 492
    .line 493
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x41a00000    # 20.0f

    .line 500
    .line 501
    const/high16 v6, 0x41700000    # 15.0f

    .line 502
    .line 503
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v25, -0x40800000    # -1.0f

    .line 507
    .line 508
    const/high16 v26, -0x40800000    # -1.0f

    .line 509
    .line 510
    const v21, -0x40f33333    # -0.55f

    .line 511
    .line 512
    .line 513
    const/high16 v23, -0x40800000    # -1.0f

    .line 514
    .line 515
    const v24, -0x4119999a    # -0.45f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v4, -0x40800000    # -1.0f

    .line 522
    .line 523
    const v6, 0x3ee66666    # 0.45f

    .line 524
    .line 525
    .line 526
    const/high16 v7, 0x3f800000    # 1.0f

    .line 527
    .line 528
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x3ee66666    # 0.45f

    .line 532
    .line 533
    .line 534
    const/high16 v6, 0x3f800000    # 1.0f

    .line 535
    .line 536
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v4, 0x41a46666    # 20.55f

    .line 540
    .line 541
    .line 542
    const/high16 v6, 0x41a00000    # 20.0f

    .line 543
    .line 544
    const/high16 v7, 0x41700000    # 15.0f

    .line 545
    .line 546
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    const/16 v16, 0x3800

    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/high16 v8, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/4 v7, 0x0

    .line 565
    const/high16 v9, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/high16 v12, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const/4 v14, 0x0

    .line 571
    const/4 v15, 0x0

    .line 572
    const-string v4, ""

    .line 573
    .line 574
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 575
    .line 576
    .line 577
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 582
    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 584
    .line 585
    .line 586
    move-result-wide v6

    .line 587
    const/4 v0, 0x0

    .line 588
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 592
    .line 593
    .line 594
    move-result v10

    .line 595
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    const/high16 v2, 0x40e00000    # 7.0f

    .line 605
    .line 606
    const/high16 v4, 0x41a00000    # 20.0f

    .line 607
    .line 608
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v2, 0x40800000    # 4.0f

    .line 612
    .line 613
    const/4 v4, 0x0

    .line 614
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v2, -0x40000000    # -2.0f

    .line 618
    .line 619
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v2, 0x40c00000    # 6.0f

    .line 623
    .line 624
    const/high16 v4, 0x40400000    # 3.0f

    .line 625
    .line 626
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v2, -0x3f800000    # -4.0f

    .line 630
    .line 631
    const/4 v4, 0x0

    .line 632
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v2, 0x40000000    # 2.0f

    .line 636
    .line 637
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    const/high16 v6, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    const-string v4, ""

    .line 651
    .line 652
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    sput-object v0, Landroidx/compose/material/icons/rounded/ElectricRickshawKt;->_electricRickshaw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 661
    .line 662
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    return-object v0
.end method
