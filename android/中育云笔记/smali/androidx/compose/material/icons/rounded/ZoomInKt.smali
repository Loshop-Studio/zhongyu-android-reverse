.class public final Landroidx/compose/material/icons/rounded/ZoomInKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _zoomIn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getZoomIn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ZoomInKt;->_zoomIn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ZoomIn"

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x40b5c28f    # -0.79f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x4170a3d7    # -0.28f

    .line 84
    .line 85
    .line 86
    const v2, -0x4175c28f    # -0.27f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, 0x3fbd70a4    # 1.48f

    .line 93
    .line 94
    .line 95
    const v18, -0x3f551eb8    # -5.34f

    .line 96
    .line 97
    .line 98
    const v13, 0x3f99999a    # 1.2f

    .line 99
    .line 100
    .line 101
    const v14, -0x404ccccd    # -1.4f

    .line 102
    .line 103
    .line 104
    const v15, 0x3fe8f5c3    # 1.82f

    .line 105
    .line 106
    .line 107
    const v16, -0x3fac28f6    # -3.31f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x3f4d1eb8    # -5.59f

    .line 114
    .line 115
    .line 116
    const v13, -0x410f5c29    # -0.47f

    .line 117
    .line 118
    .line 119
    const v14, -0x3fce147b    # -2.78f

    .line 120
    .line 121
    .line 122
    const v15, -0x3fcd70a4    # -2.79f

    .line 123
    .line 124
    .line 125
    const/high16 v16, -0x3f600000    # -5.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x3f175c29    # -7.27f

    .line 131
    .line 132
    .line 133
    const v18, 0x40e8a3d7    # 7.27f

    .line 134
    .line 135
    .line 136
    const v13, -0x3f78a3d7    # -4.23f

    .line 137
    .line 138
    .line 139
    const v14, -0x40fae148    # -0.52f

    .line 140
    .line 141
    .line 142
    const v15, -0x3f070a3d    # -7.78f

    .line 143
    .line 144
    .line 145
    const v16, 0x40428f5c    # 3.04f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, 0x40aae148    # 5.34f

    .line 152
    .line 153
    .line 154
    const v18, 0x40b2e148    # 5.59f

    .line 155
    .line 156
    .line 157
    const v13, 0x3eae147b    # 0.34f

    .line 158
    .line 159
    .line 160
    const v14, 0x40333333    # 2.8f

    .line 161
    .line 162
    .line 163
    const v15, 0x4023d70a    # 2.56f

    .line 164
    .line 165
    .line 166
    const v16, 0x40a3d70a    # 5.12f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v18, -0x40428f5c    # -1.48f

    .line 173
    .line 174
    .line 175
    const v13, 0x4001eb85    # 2.03f

    .line 176
    .line 177
    .line 178
    const v14, 0x3eae147b    # 0.34f

    .line 179
    .line 180
    .line 181
    const v15, 0x407c28f6    # 3.94f

    .line 182
    .line 183
    .line 184
    const v16, -0x4170a3d7    # -0.28f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x3e8a3d71    # 0.27f

    .line 191
    .line 192
    .line 193
    const v2, 0x3e8f5c29    # 0.28f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x3f4a3d71    # 0.79f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x408851ec    # 4.26f

    .line 206
    .line 207
    .line 208
    const/high16 v2, 0x40880000    # 4.25f

    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x3fbd70a4    # 1.48f

    .line 214
    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    const v13, 0x3ed1eb85    # 0.41f

    .line 219
    .line 220
    .line 221
    const v14, 0x3ed1eb85    # 0.41f

    .line 222
    .line 223
    .line 224
    const v15, 0x3f88f5c3    # 1.07f

    .line 225
    .line 226
    .line 227
    const v16, 0x3ed1eb85    # 0.41f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x3c23d70a    # 0.01f

    .line 234
    .line 235
    .line 236
    const v2, -0x43dc28f6    # -0.01f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const v18, -0x40428f5c    # -1.48f

    .line 245
    .line 246
    .line 247
    const v14, -0x412e147b    # -0.41f

    .line 248
    .line 249
    .line 250
    const v15, 0x3ed1eb85    # 0.41f

    .line 251
    .line 252
    .line 253
    const v16, -0x40770a3d    # -1.07f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41780000    # 15.5f

    .line 260
    .line 261
    const/high16 v2, 0x41600000    # 14.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x41180000    # 9.5f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x40a00000    # 5.0f

    .line 275
    .line 276
    const/high16 v18, 0x41180000    # 9.5f

    .line 277
    .line 278
    const v13, 0x40e051ec    # 7.01f

    .line 279
    .line 280
    .line 281
    const/high16 v14, 0x41600000    # 14.0f

    .line 282
    .line 283
    const/high16 v15, 0x40a00000    # 5.0f

    .line 284
    .line 285
    const v16, 0x413fd70a    # 11.99f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x40a00000    # 5.0f

    .line 292
    .line 293
    const v2, 0x40e051ec    # 7.01f

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41180000    # 9.5f

    .line 297
    .line 298
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x40e051ec    # 7.01f

    .line 302
    .line 303
    .line 304
    const/high16 v2, 0x41180000    # 9.5f

    .line 305
    .line 306
    const/high16 v4, 0x41600000    # 14.0f

    .line 307
    .line 308
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x413fd70a    # 11.99f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x40e00000    # 7.0f

    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, -0x41000000    # -0.5f

    .line 326
    .line 327
    const/high16 v18, 0x3f000000    # 0.5f

    .line 328
    .line 329
    const v13, -0x4170a3d7    # -0.28f

    .line 330
    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const/high16 v15, -0x41000000    # -0.5f

    .line 334
    .line 335
    const v16, 0x3e6147ae    # 0.22f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41100000    # 9.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40f00000    # 7.5f

    .line 347
    .line 348
    const/high16 v2, 0x41100000    # 9.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x3e6147ae    # 0.22f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x3f000000    # 0.5f

    .line 360
    .line 361
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x41200000    # 10.0f

    .line 365
    .line 366
    const/high16 v2, 0x41100000    # 9.0f

    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x3f000000    # 0.5f

    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, 0x3e8f5c29    # 0.28f

    .line 380
    .line 381
    .line 382
    const v15, 0x3e6147ae    # 0.22f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x3f000000    # 0.5f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x419eb852    # -0.22f

    .line 391
    .line 392
    .line 393
    const/high16 v2, -0x41000000    # -0.5f

    .line 394
    .line 395
    const/high16 v4, 0x3f000000    # 0.5f

    .line 396
    .line 397
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41200000    # 10.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v18, -0x41000000    # -0.5f

    .line 411
    .line 412
    const v13, 0x3e8f5c29    # 0.28f

    .line 413
    .line 414
    .line 415
    const/4 v14, 0x0

    .line 416
    const/high16 v15, 0x3f000000    # 0.5f

    .line 417
    .line 418
    const v16, -0x419eb852    # -0.22f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x419eb852    # -0.22f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41200000    # 10.0f

    .line 431
    .line 432
    const/high16 v2, 0x41100000    # 9.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40f00000    # 7.5f

    .line 438
    .line 439
    const/high16 v2, 0x41200000    # 10.0f

    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, -0x41000000    # -0.5f

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const v14, -0x4170a3d7    # -0.28f

    .line 448
    .line 449
    .line 450
    const v15, -0x419eb852    # -0.22f

    .line 451
    .line 452
    .line 453
    const/high16 v16, -0x41000000    # -0.5f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/16 v16, 0x3800

    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const/high16 v6, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v8, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const/high16 v9, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/4 v15, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    sput-object v0, Landroidx/compose/material/icons/rounded/ZoomInKt;->_zoomIn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    return-object v0
.end method
