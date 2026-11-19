.class public final Landroidx/compose/material/icons/rounded/FlareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlare(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FlareKt;->_flare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Flare"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40800000    # -1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x3ee66666    # 0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const/high16 v18, -0x40800000    # -1.0f

    .line 114
    .line 115
    const v13, 0x3f0ccccd    # 0.55f

    .line 116
    .line 117
    .line 118
    const/high16 v15, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const v16, -0x4119999a    # -0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, -0x40800000    # -1.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x4107851f    # 8.47f

    .line 138
    .line 139
    .line 140
    const v2, 0x40e1eb85    # 7.06f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, -0x40c7ae14    # -0.72f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x404b851f    # -1.41f

    .line 153
    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const v13, -0x413851ec    # -0.39f

    .line 158
    .line 159
    .line 160
    const v14, -0x413851ec    # -0.39f

    .line 161
    .line 162
    .line 163
    const v15, -0x407d70a4    # -1.02f

    .line 164
    .line 165
    .line 166
    const v16, -0x413851ec    # -0.39f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const v18, 0x3fb47ae1    # 1.41f

    .line 175
    .line 176
    .line 177
    const v14, 0x3ec7ae14    # 0.39f

    .line 178
    .line 179
    .line 180
    const v15, -0x413851ec    # -0.39f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f828f5c    # 1.02f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x3f35c28f    # 0.71f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x3fb47ae1    # 1.41f

    .line 196
    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const v13, 0x3ec7ae14    # 0.39f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f828f5c    # 1.02f

    .line 204
    .line 205
    .line 206
    const v16, 0x3ec7ae14    # 0.39f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x3c23d70a    # 0.01f

    .line 213
    .line 214
    .line 215
    const v18, -0x404ccccd    # -1.4f

    .line 216
    .line 217
    .line 218
    const v14, -0x413d70a4    # -0.38f

    .line 219
    .line 220
    .line 221
    const v15, 0x3ec7ae14    # 0.39f

    .line 222
    .line 223
    .line 224
    const v16, -0x407d70a4    # -1.02f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41400000    # 12.0f

    .line 234
    .line 235
    const/high16 v2, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x40800000    # -1.0f

    .line 241
    .line 242
    const/high16 v18, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const v13, -0x40f0a3d7    # -0.56f

    .line 245
    .line 246
    .line 247
    const/4 v14, 0x0

    .line 248
    const/high16 v15, -0x40800000    # -1.0f

    .line 249
    .line 250
    const v16, 0x3ee66666    # 0.45f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x40800000    # 4.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const v15, 0x3ee66666    # 0.45f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x3f800000    # 1.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x4119999a    # -0.45f

    .line 276
    .line 277
    .line 278
    const/high16 v4, -0x40800000    # -1.0f

    .line 279
    .line 280
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x41500000    # 13.0f

    .line 284
    .line 285
    const/high16 v2, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, -0x40800000    # -1.0f

    .line 291
    .line 292
    const/high16 v18, -0x40800000    # -1.0f

    .line 293
    .line 294
    const v14, -0x40f33333    # -0.55f

    .line 295
    .line 296
    .line 297
    const v15, -0x4119999a    # -0.45f

    .line 298
    .line 299
    .line 300
    const/high16 v16, -0x40800000    # -1.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x418d47ae    # 17.66f

    .line 309
    .line 310
    .line 311
    const v2, 0x40cb3333    # 6.35f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x404b851f    # -1.41f

    .line 318
    .line 319
    .line 320
    const/16 v18, 0x0

    .line 321
    .line 322
    const v13, -0x413851ec    # -0.39f

    .line 323
    .line 324
    .line 325
    const v14, -0x413851ec    # -0.39f

    .line 326
    .line 327
    .line 328
    const v15, -0x407d70a4    # -1.02f

    .line 329
    .line 330
    .line 331
    const v16, -0x413851ec    # -0.39f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, -0x40ca3d71    # -0.71f

    .line 338
    .line 339
    .line 340
    const v2, 0x3f35c28f    # 0.71f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    const v18, 0x3fb47ae1    # 1.41f

    .line 349
    .line 350
    .line 351
    const v14, 0x3ec7ae14    # 0.39f

    .line 352
    .line 353
    .line 354
    const v15, -0x413851ec    # -0.39f

    .line 355
    .line 356
    .line 357
    const v16, 0x3f828f5c    # 1.02f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x3fb47ae1    # 1.41f

    .line 364
    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const v13, 0x3ec7ae14    # 0.39f

    .line 369
    .line 370
    .line 371
    const v15, 0x3f828f5c    # 1.02f

    .line 372
    .line 373
    .line 374
    const v16, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v18, -0x404b851f    # -1.41f

    .line 386
    .line 387
    .line 388
    const v13, 0x3ec28f5c    # 0.38f

    .line 389
    .line 390
    .line 391
    const v14, -0x413851ec    # -0.39f

    .line 392
    .line 393
    .line 394
    const v15, 0x3ec28f5c    # 0.38f

    .line 395
    .line 396
    .line 397
    const v16, -0x407c28f6    # -1.03f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41880000    # 17.0f

    .line 407
    .line 408
    const/high16 v2, 0x41400000    # 12.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v18, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, 0x3f0f5c29    # 0.56f

    .line 419
    .line 420
    .line 421
    const v15, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x3f800000    # 1.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x40800000    # 4.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v18, -0x40800000    # -1.0f

    .line 435
    .line 436
    const v13, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/high16 v15, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v16, -0x4119999a    # -0.45f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x4119999a    # -0.45f

    .line 449
    .line 450
    .line 451
    const/high16 v2, -0x40800000    # -1.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, -0x3f800000    # -4.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, -0x40800000    # -1.0f

    .line 462
    .line 463
    const/high16 v18, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const v13, -0x40f33333    # -0.55f

    .line 466
    .line 467
    .line 468
    const/high16 v15, -0x40800000    # -1.0f

    .line 469
    .line 470
    const v16, 0x3ee66666    # 0.45f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41100000    # 9.0f

    .line 480
    .line 481
    const/high16 v2, 0x41400000    # 12.0f

    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 487
    .line 488
    const/high16 v18, 0x40400000    # 3.0f

    .line 489
    .line 490
    const v13, -0x402b851f    # -1.66f

    .line 491
    .line 492
    .line 493
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 494
    .line 495
    const v16, 0x3fab851f    # 1.34f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3fab851f    # 1.34f

    .line 502
    .line 503
    .line 504
    const/high16 v2, 0x40400000    # 3.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x40547ae1    # -1.34f

    .line 510
    .line 511
    .line 512
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 513
    .line 514
    const/high16 v4, 0x40400000    # 3.0f

    .line 515
    .line 516
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x41787ae1    # 15.53f

    .line 526
    .line 527
    .line 528
    const v2, 0x4187851f    # 16.94f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x3f35c28f    # 0.71f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3fb47ae1    # 1.41f

    .line 541
    .line 542
    .line 543
    const/16 v18, 0x0

    .line 544
    .line 545
    const v13, 0x3ec7ae14    # 0.39f

    .line 546
    .line 547
    .line 548
    const v14, 0x3ec7ae14    # 0.39f

    .line 549
    .line 550
    .line 551
    const v15, 0x3f828f5c    # 1.02f

    .line 552
    .line 553
    .line 554
    const v16, 0x3ec7ae14    # 0.39f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/16 v17, 0x0

    .line 561
    .line 562
    const v18, -0x404b851f    # -1.41f

    .line 563
    .line 564
    .line 565
    const v14, -0x413851ec    # -0.39f

    .line 566
    .line 567
    .line 568
    const v15, 0x3ec7ae14    # 0.39f

    .line 569
    .line 570
    .line 571
    const v16, -0x407d70a4    # -1.02f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x40ca3d71    # -0.71f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x404b851f    # -1.41f

    .line 584
    .line 585
    .line 586
    const/16 v18, 0x0

    .line 587
    .line 588
    const v13, -0x413851ec    # -0.39f

    .line 589
    .line 590
    .line 591
    const v15, -0x407d70a4    # -1.02f

    .line 592
    .line 593
    .line 594
    const v16, -0x413851ec    # -0.39f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    const v18, 0x3fb47ae1    # 1.41f

    .line 603
    .line 604
    .line 605
    const v13, -0x413d70a4    # -0.38f

    .line 606
    .line 607
    .line 608
    const v14, 0x3ec7ae14    # 0.39f

    .line 609
    .line 610
    .line 611
    const v15, -0x413d70a4    # -0.38f

    .line 612
    .line 613
    .line 614
    const v16, 0x3f83d70a    # 1.03f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40cae148    # 6.34f

    .line 624
    .line 625
    .line 626
    const v2, 0x418d3333    # 17.65f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x3fb47ae1    # 1.41f

    .line 633
    .line 634
    .line 635
    const/16 v18, 0x0

    .line 636
    .line 637
    const v13, 0x3ec7ae14    # 0.39f

    .line 638
    .line 639
    .line 640
    const v15, 0x3f828f5c    # 1.02f

    .line 641
    .line 642
    .line 643
    const v16, 0x3ec7ae14    # 0.39f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, -0x40ca3d71    # -0.71f

    .line 650
    .line 651
    .line 652
    const v2, 0x3f35c28f    # 0.71f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    const v18, -0x404b851f    # -1.41f

    .line 661
    .line 662
    .line 663
    const v14, -0x413851ec    # -0.39f

    .line 664
    .line 665
    .line 666
    const v15, 0x3ec7ae14    # 0.39f

    .line 667
    .line 668
    .line 669
    const v16, -0x407d70a4    # -1.02f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v17, -0x404b851f    # -1.41f

    .line 676
    .line 677
    .line 678
    const/16 v18, 0x0

    .line 679
    .line 680
    const v13, -0x413851ec    # -0.39f

    .line 681
    .line 682
    .line 683
    const v15, -0x407d70a4    # -1.02f

    .line 684
    .line 685
    .line 686
    const v16, -0x413851ec    # -0.39f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/16 v17, 0x0

    .line 696
    .line 697
    const v18, 0x3fb47ae1    # 1.41f

    .line 698
    .line 699
    .line 700
    const v13, -0x413d70a4    # -0.38f

    .line 701
    .line 702
    .line 703
    const v14, 0x3ec7ae14    # 0.39f

    .line 704
    .line 705
    .line 706
    const v15, -0x413d70a4    # -0.38f

    .line 707
    .line 708
    .line 709
    const v16, 0x3f83d70a    # 1.03f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, 0x41b80000    # 23.0f

    .line 719
    .line 720
    const/high16 v2, 0x41400000    # 12.0f

    .line 721
    .line 722
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v17, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/high16 v18, -0x40800000    # -1.0f

    .line 728
    .line 729
    const v13, 0x3f0f5c29    # 0.56f

    .line 730
    .line 731
    .line 732
    const/4 v14, 0x0

    .line 733
    const/high16 v15, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const v16, -0x4119999a    # -0.45f

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, -0x3f800000    # -4.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v17, -0x40800000    # -1.0f

    .line 747
    .line 748
    const/4 v13, 0x0

    .line 749
    const v14, -0x40f33333    # -0.55f

    .line 750
    .line 751
    .line 752
    const v15, -0x4119999a    # -0.45f

    .line 753
    .line 754
    .line 755
    const/high16 v16, -0x40800000    # -1.0f

    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, 0x3ee66666    # 0.45f

    .line 761
    .line 762
    .line 763
    const/high16 v2, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v4, -0x40800000    # -1.0f

    .line 766
    .line 767
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v0, 0x40800000    # 4.0f

    .line 771
    .line 772
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v17, 0x3f800000    # 1.0f

    .line 776
    .line 777
    const/high16 v18, 0x3f800000    # 1.0f

    .line 778
    .line 779
    const v14, 0x3f0ccccd    # 0.55f

    .line 780
    .line 781
    .line 782
    const v15, 0x3ee66666    # 0.45f

    .line 783
    .line 784
    .line 785
    const/high16 v16, 0x3f800000    # 1.0f

    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    const/16 v16, 0x3800

    .line 798
    .line 799
    const/16 v17, 0x0

    .line 800
    .line 801
    const/high16 v6, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const/high16 v8, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v7, 0x0

    .line 806
    const/high16 v9, 0x3f800000    # 1.0f

    .line 807
    .line 808
    const/high16 v12, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v14, 0x0

    .line 811
    const/4 v15, 0x0

    .line 812
    const-string v4, ""

    .line 813
    .line 814
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    sput-object v0, Landroidx/compose/material/icons/rounded/FlareKt;->_flare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 823
    .line 824
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    return-object v0
.end method
