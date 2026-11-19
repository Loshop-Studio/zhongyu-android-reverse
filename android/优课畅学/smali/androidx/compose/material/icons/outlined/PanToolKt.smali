.class public final Landroidx/compose/material/icons/outlined/PanToolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panTool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanTool(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PanToolKt;->_panTool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PanTool"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f2e6666    # -6.55f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3fc70a3d    # -2.89f

    .line 84
    .line 85
    .line 86
    const v18, -0x40628f5c    # -1.23f

    .line 87
    .line 88
    .line 89
    const v13, -0x4075c28f    # -1.08f

    .line 90
    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    const v15, -0x3ff70a3d    # -2.14f

    .line 94
    .line 95
    .line 96
    const v16, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f166666    # -7.3f

    .line 103
    .line 104
    .line 105
    const v2, -0x3f0c7ae1    # -7.61f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40047ae1    # 2.07f

    .line 112
    .line 113
    .line 114
    const v2, -0x4015c28f    # -1.83f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, 0x4010a3d7    # 2.26f

    .line 121
    .line 122
    .line 123
    const v18, -0x4175c28f    # -0.27f

    .line 124
    .line 125
    .line 126
    const v13, 0x3f1eb852    # 0.62f

    .line 127
    .line 128
    .line 129
    const v14, -0x40f33333    # -0.55f

    .line 130
    .line 131
    .line 132
    const v15, 0x3fc3d70a    # 1.53f

    .line 133
    .line 134
    .line 135
    const v16, -0x40d70a3d    # -0.66f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41000000    # 8.0f

    .line 142
    .line 143
    const v2, 0x416570a4    # 14.34f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x409947ae    # 4.79f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x40200000    # 2.5f

    .line 156
    .line 157
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const v14, -0x404f5c29    # -1.38f

    .line 161
    .line 162
    .line 163
    const v15, 0x3f8f5c29    # 1.12f

    .line 164
    .line 165
    .line 166
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x3f028f5c    # 0.51f

    .line 172
    .line 173
    .line 174
    const v18, 0x3d4ccccd    # 0.05f

    .line 175
    .line 176
    .line 177
    const v13, 0x3e2e147b    # 0.17f

    .line 178
    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const v15, 0x3eae147b    # 0.34f

    .line 182
    .line 183
    .line 184
    const v16, 0x3ca3d70a    # 0.02f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x401f5c29    # 2.49f

    .line 191
    .line 192
    .line 193
    const v18, -0x3feae148    # -2.33f

    .line 194
    .line 195
    .line 196
    const v13, 0x3db851ec    # 0.09f

    .line 197
    .line 198
    .line 199
    const v14, -0x4059999a    # -1.3f

    .line 200
    .line 201
    .line 202
    const v15, 0x3f95c28f    # 1.17f

    .line 203
    .line 204
    .line 205
    const v16, -0x3feae148    # -2.33f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x4003d70a    # 2.06f

    .line 212
    .line 213
    .line 214
    const v18, 0x3f8b851f    # 1.09f

    .line 215
    .line 216
    .line 217
    const v13, 0x3f5c28f6    # 0.86f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const v15, 0x3fce147b    # 1.61f

    .line 222
    .line 223
    .line 224
    const v16, 0x3edc28f6    # 0.43f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f70a3d7    # 0.94f

    .line 231
    .line 232
    .line 233
    const v18, -0x41c7ae14    # -0.18f

    .line 234
    .line 235
    .line 236
    const v13, 0x3e947ae1    # 0.29f

    .line 237
    .line 238
    .line 239
    const v14, -0x420a3d71    # -0.12f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f1c28f6    # 0.61f

    .line 243
    .line 244
    .line 245
    const v16, -0x41c7ae14    # -0.18f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x40200000    # 2.5f

    .line 252
    .line 253
    const/high16 v18, 0x40200000    # 2.5f

    .line 254
    .line 255
    const v13, 0x3fb0a3d7    # 1.38f

    .line 256
    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/high16 v15, 0x40200000    # 2.5f

    .line 260
    .line 261
    const v16, 0x3f8f5c29    # 1.12f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x3e8f5c29    # 0.28f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x3f000000    # 0.5f

    .line 274
    .line 275
    const v18, -0x42b33333    # -0.05f

    .line 276
    .line 277
    .line 278
    const v13, 0x3e23d70a    # 0.16f

    .line 279
    .line 280
    .line 281
    const v14, -0x430a3d71    # -0.03f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ea8f5c3    # 0.33f

    .line 285
    .line 286
    .line 287
    const v16, -0x42b33333    # -0.05f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x40200000    # 2.5f

    .line 294
    .line 295
    const/high16 v18, 0x40200000    # 2.5f

    .line 296
    .line 297
    const v13, 0x3fb0a3d7    # 1.38f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const/high16 v15, 0x40200000    # 2.5f

    .line 302
    .line 303
    const v16, 0x3f8f5c29    # 1.12f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x41a00000    # 20.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, -0x3f800000    # -4.0f

    .line 315
    .line 316
    const/high16 v18, 0x40800000    # 4.0f

    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const v14, 0x400d70a4    # 2.21f

    .line 320
    .line 321
    .line 322
    const v15, -0x401ae148    # -1.79f

    .line 323
    .line 324
    .line 325
    const/high16 v16, 0x40800000    # 4.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x40847ae1    # 4.14f

    .line 334
    .line 335
    .line 336
    const v2, 0x41747ae1    # 15.28f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x40bb851f    # 5.86f

    .line 343
    .line 344
    .line 345
    const v2, 0x40c33333    # 6.1f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3fb851ec    # 1.44f

    .line 352
    .line 353
    .line 354
    const v18, 0x3f1eb852    # 0.62f

    .line 355
    .line 356
    .line 357
    const v13, 0x3ec28f5c    # 0.38f

    .line 358
    .line 359
    .line 360
    const v14, 0x3ec7ae14    # 0.39f

    .line 361
    .line 362
    .line 363
    const v15, 0x3f666666    # 0.9f

    .line 364
    .line 365
    .line 366
    const v16, 0x3f1eb852    # 0.62f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41900000    # 18.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x40000000    # 2.0f

    .line 378
    .line 379
    const/high16 v18, -0x40000000    # -2.0f

    .line 380
    .line 381
    const v13, 0x3f8ccccd    # 1.1f

    .line 382
    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const/high16 v15, 0x40000000    # 2.0f

    .line 386
    .line 387
    const v16, -0x4099999a    # -0.9f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x40c4cccd    # 6.15f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, -0x41000000    # -0.5f

    .line 400
    .line 401
    const/high16 v18, -0x41000000    # -0.5f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x4170a3d7    # -0.28f

    .line 405
    .line 406
    .line 407
    const v15, -0x419eb852    # -0.22f

    .line 408
    .line 409
    .line 410
    const/high16 v16, -0x41000000    # -0.5f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x3e6147ae    # 0.22f

    .line 416
    .line 417
    .line 418
    const/high16 v2, 0x3f000000    # 0.5f

    .line 419
    .line 420
    const/high16 v4, -0x41000000    # -0.5f

    .line 421
    .line 422
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, -0x40000000    # -2.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x405ae148    # 3.42f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3e6147ae    # 0.22f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41400000    # 12.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, -0x40000000    # -2.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x4020a3d7    # 2.51f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3e6147ae    # 0.22f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41400000    # 12.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, -0x40000000    # -2.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x409947ae    # 4.79f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x3e6b851f    # 0.23f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x414deb85    # 12.87f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x3f54cccd    # -5.35f

    .line 507
    .line 508
    .line 509
    const v2, -0x3fcae148    # -2.83f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, -0x40fd70a4    # -0.51f

    .line 516
    .line 517
    .line 518
    const v2, 0x3ee66666    # 0.45f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/16 v16, 0x3800

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/high16 v8, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v7, 0x0

    .line 540
    const/high16 v9, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v12, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sput-object v0, Landroidx/compose/material/icons/outlined/PanToolKt;->_panTool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-object v0
.end method
