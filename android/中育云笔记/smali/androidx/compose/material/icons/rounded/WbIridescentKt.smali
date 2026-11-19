.class public final Landroidx/compose/material/icons/rounded/WbIridescentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wbIridescent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbIridescent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WbIridescentKt;->_wbIridescent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WbIridescent"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41400000    # 12.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x3f833333    # -3.95f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, -0x40800000    # -1.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, -0x40f33333    # -0.55f

    .line 108
    .line 109
    .line 110
    const v15, -0x4119999a    # -0.45f

    .line 111
    .line 112
    .line 113
    const/high16 v16, -0x40800000    # -1.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4110cccd    # 9.05f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v18, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const v13, -0x40f33333    # -0.55f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v16, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40a00000    # 5.0f

    .line 139
    .line 140
    const/high16 v2, 0x41600000    # 14.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const v14, 0x3f0ccccd    # 0.55f

    .line 149
    .line 150
    .line 151
    const v15, 0x3ee66666    # 0.45f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x3f800000    # 1.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40000000    # 2.0f

    .line 163
    .line 164
    const/high16 v2, 0x41300000    # 11.0f

    .line 165
    .line 166
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x3f866666    # 1.05f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v18, 0x3f733333    # 0.95f

    .line 176
    .line 177
    .line 178
    const v16, 0x3f733333    # 0.95f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, -0x41333333    # -0.4f

    .line 185
    .line 186
    .line 187
    const v2, -0x408ccccd    # -0.95f

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x3f800000    # 1.0f

    .line 191
    .line 192
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41500000    # 13.0f

    .line 196
    .line 197
    const/high16 v2, 0x40000000    # 2.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, -0x40800000    # -1.0f

    .line 203
    .line 204
    const/high16 v18, -0x40800000    # -1.0f

    .line 205
    .line 206
    const v14, -0x40f33333    # -0.55f

    .line 207
    .line 208
    .line 209
    const v15, -0x4119999a    # -0.45f

    .line 210
    .line 211
    .line 212
    const/high16 v16, -0x40800000    # -1.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x3ee66666    # 0.45f

    .line 218
    .line 219
    .line 220
    const/high16 v2, -0x40800000    # -1.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x4192b852    # 18.34f

    .line 229
    .line 230
    .line 231
    const v2, 0x4089999a    # 4.3f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x413d70a4    # -0.38f

    .line 238
    .line 239
    .line 240
    const v2, 0x3ec28f5c    # 0.38f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const v18, 0x3fb47ae1    # 1.41f

    .line 249
    .line 250
    .line 251
    const v13, -0x413851ec    # -0.39f

    .line 252
    .line 253
    .line 254
    const v14, 0x3ec7ae14    # 0.39f

    .line 255
    .line 256
    .line 257
    const v15, -0x413851ec    # -0.39f

    .line 258
    .line 259
    .line 260
    const v16, 0x3f828f5c    # 1.02f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3fb47ae1    # 1.41f

    .line 267
    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    const v13, 0x3ec7ae14    # 0.39f

    .line 272
    .line 273
    .line 274
    const v15, 0x3f828f5c    # 1.02f

    .line 275
    .line 276
    .line 277
    const v16, 0x3ec7ae14    # 0.39f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const v18, -0x404b851f    # -1.41f

    .line 289
    .line 290
    .line 291
    const v14, -0x413851ec    # -0.39f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ec7ae14    # 0.39f

    .line 295
    .line 296
    .line 297
    const v16, -0x407d70a4    # -1.02f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x404b851f    # -1.41f

    .line 304
    .line 305
    .line 306
    const/16 v18, 0x0

    .line 307
    .line 308
    const v13, -0x413851ec    # -0.39f

    .line 309
    .line 310
    .line 311
    const v15, -0x407d70a4    # -1.02f

    .line 312
    .line 313
    .line 314
    const v16, -0x413851ec    # -0.39f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41b00000    # 22.0f

    .line 324
    .line 325
    const/high16 v2, 0x41500000    # 13.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x408a3d71    # -0.96f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, -0x40800000    # -1.0f

    .line 337
    .line 338
    const/high16 v18, -0x40800000    # -1.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, -0x40f33333    # -0.55f

    .line 342
    .line 343
    .line 344
    const v15, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    const/high16 v16, -0x40800000    # -1.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x3ee66666    # 0.45f

    .line 353
    .line 354
    .line 355
    const/high16 v2, -0x40800000    # -1.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41b00000    # 22.0f

    .line 361
    .line 362
    const/high16 v2, 0x41300000    # 11.0f

    .line 363
    .line 364
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v18, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const v14, 0x3f0ccccd    # 0.55f

    .line 372
    .line 373
    .line 374
    const v15, 0x3ee66666    # 0.45f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x3f800000    # 1.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x4119999a    # -0.45f

    .line 383
    .line 384
    .line 385
    const/high16 v2, -0x40800000    # -1.0f

    .line 386
    .line 387
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x419deb85    # 19.74f

    .line 394
    .line 395
    .line 396
    const v2, 0x41931eb8    # 18.39f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, -0x413851ec    # -0.39f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, -0x404b851f    # -1.41f

    .line 409
    .line 410
    .line 411
    const/16 v18, 0x0

    .line 412
    .line 413
    const v13, -0x413851ec    # -0.39f

    .line 414
    .line 415
    .line 416
    const v14, -0x413851ec    # -0.39f

    .line 417
    .line 418
    .line 419
    const v15, -0x407d70a4    # -1.02f

    .line 420
    .line 421
    .line 422
    const v16, -0x413851ec    # -0.39f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const v18, 0x3fb47ae1    # 1.41f

    .line 431
    .line 432
    .line 433
    const v14, 0x3ec7ae14    # 0.39f

    .line 434
    .line 435
    .line 436
    const v15, -0x413851ec    # -0.39f

    .line 437
    .line 438
    .line 439
    const v16, 0x3f828f5c    # 1.02f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x3ec7ae14    # 0.39f

    .line 446
    .line 447
    .line 448
    const v2, 0x3ec28f5c    # 0.38f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x3fb47ae1    # 1.41f

    .line 455
    .line 456
    .line 457
    const/16 v18, 0x0

    .line 458
    .line 459
    const v13, 0x3ec7ae14    # 0.39f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f828f5c    # 1.02f

    .line 463
    .line 464
    .line 465
    const v16, 0x3ec7ae14    # 0.39f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x3c23d70a    # 0.01f

    .line 472
    .line 473
    .line 474
    const v2, -0x43dc28f6    # -0.01f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const v18, -0x404ccccd    # -1.4f

    .line 483
    .line 484
    .line 485
    const v14, -0x413d70a4    # -0.38f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ec7ae14    # 0.39f

    .line 489
    .line 490
    .line 491
    const v16, -0x407d70a4    # -1.02f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x40880000    # 4.25f

    .line 501
    .line 502
    const v2, 0x40b6b852    # 5.71f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x3ec7ae14    # 0.39f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x3fb47ae1    # 1.41f

    .line 515
    .line 516
    .line 517
    const/16 v18, 0x0

    .line 518
    .line 519
    const v14, 0x3ec7ae14    # 0.39f

    .line 520
    .line 521
    .line 522
    const v15, 0x3f828f5c    # 1.02f

    .line 523
    .line 524
    .line 525
    const v16, 0x3ec7ae14    # 0.39f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const v18, -0x404b851f    # -1.41f

    .line 534
    .line 535
    .line 536
    const v14, -0x413851ec    # -0.39f

    .line 537
    .line 538
    .line 539
    const v15, 0x3ec7ae14    # 0.39f

    .line 540
    .line 541
    .line 542
    const v16, -0x407d70a4    # -1.02f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, -0x413851ec    # -0.39f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, -0x404b851f    # -1.41f

    .line 555
    .line 556
    .line 557
    const/16 v18, 0x0

    .line 558
    .line 559
    const v13, -0x413851ec    # -0.39f

    .line 560
    .line 561
    .line 562
    const v15, -0x407d70a4    # -1.02f

    .line 563
    .line 564
    .line 565
    const v16, -0x413851ec    # -0.39f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const v18, 0x3fb47ae1    # 1.41f

    .line 574
    .line 575
    .line 576
    const v13, -0x413d70a4    # -0.38f

    .line 577
    .line 578
    .line 579
    const v14, 0x3ec7ae14    # 0.39f

    .line 580
    .line 581
    .line 582
    const v15, -0x413d70a4    # -0.38f

    .line 583
    .line 584
    .line 585
    const v16, 0x3f83d70a    # 1.03f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x40b570a4    # 5.67f

    .line 595
    .line 596
    .line 597
    const v2, 0x419e51ec    # 19.79f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, -0x413d70a4    # -0.38f

    .line 604
    .line 605
    .line 606
    const v2, 0x3ec28f5c    # 0.38f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v18, -0x404b851f    # -1.41f

    .line 613
    .line 614
    .line 615
    const v13, 0x3ec7ae14    # 0.39f

    .line 616
    .line 617
    .line 618
    const v14, -0x413851ec    # -0.39f

    .line 619
    .line 620
    .line 621
    const v15, 0x3ec7ae14    # 0.39f

    .line 622
    .line 623
    .line 624
    const v16, -0x407d70a4    # -1.02f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v17, -0x404b851f    # -1.41f

    .line 631
    .line 632
    .line 633
    const/16 v18, 0x0

    .line 634
    .line 635
    const v13, -0x413851ec    # -0.39f

    .line 636
    .line 637
    .line 638
    const v15, -0x407d70a4    # -1.02f

    .line 639
    .line 640
    .line 641
    const v16, -0x413851ec    # -0.39f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/16 v17, 0x0

    .line 651
    .line 652
    const v18, 0x3fb47ae1    # 1.41f

    .line 653
    .line 654
    .line 655
    const v14, 0x3ec7ae14    # 0.39f

    .line 656
    .line 657
    .line 658
    const v15, -0x413851ec    # -0.39f

    .line 659
    .line 660
    .line 661
    const v16, 0x3f828f5c    # 1.02f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3fb47ae1    # 1.41f

    .line 668
    .line 669
    .line 670
    const/16 v18, 0x0

    .line 671
    .line 672
    const v13, 0x3ec28f5c    # 0.38f

    .line 673
    .line 674
    .line 675
    const v15, 0x3f828f5c    # 1.02f

    .line 676
    .line 677
    .line 678
    const v16, 0x3ec7ae14    # 0.39f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    const/16 v16, 0x3800

    .line 692
    .line 693
    const/16 v17, 0x0

    .line 694
    .line 695
    const/high16 v6, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/high16 v8, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const/4 v7, 0x0

    .line 700
    const/high16 v9, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/high16 v12, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v13, 0x0

    .line 705
    const/4 v14, 0x0

    .line 706
    const/4 v15, 0x0

    .line 707
    const-string v4, ""

    .line 708
    .line 709
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    sput-object v0, Landroidx/compose/material/icons/rounded/WbIridescentKt;->_wbIridescent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    return-object v0
.end method
