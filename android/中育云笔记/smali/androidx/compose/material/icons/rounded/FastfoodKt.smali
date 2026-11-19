.class public final Landroidx/compose/material/icons/rounded/FastfoodKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fastfood:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFastfood(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FastfoodKt;->_fastfood:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Fastfood"

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
    const v0, 0x41af3333    # 21.9f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41900000    # 18.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40000000    # 2.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, -0x40800000    # -1.0f

    .line 89
    .line 90
    const/high16 v18, -0x40800000    # -1.0f

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const v14, -0x40f33333    # -0.55f

    .line 94
    .line 95
    .line 96
    const v15, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v16, -0x40800000    # -1.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x3ee66666    # 0.45f

    .line 105
    .line 106
    .line 107
    const/high16 v2, 0x3f800000    # 1.0f

    .line 108
    .line 109
    const/high16 v4, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40400000    # 3.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f866666    # -3.9f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v18, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const v13, -0x40e8f5c3    # -0.59f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const v15, -0x4079999a    # -1.05f

    .line 133
    .line 134
    .line 135
    const v16, 0x3f028f5c    # 0.51f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x3df5c28f    # 0.12f

    .line 142
    .line 143
    .line 144
    const v2, 0x3f9ae148    # 1.21f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41900000    # 18.0f

    .line 151
    .line 152
    const/high16 v18, 0x41700000    # 15.0f

    .line 153
    .line 154
    const v13, 0x416e6666    # 14.9f

    .line 155
    .line 156
    .line 157
    const v14, 0x41028f5c    # 8.16f

    .line 158
    .line 159
    .line 160
    const/high16 v15, 0x41900000    # 18.0f

    .line 161
    .line 162
    const v16, 0x412c51ec    # 10.77f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x3ca3d70a    # 0.02f

    .line 169
    .line 170
    .line 171
    const/high16 v2, 0x41000000    # 8.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x3fd9999a    # 1.7f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3fd0a3d7    # 1.63f

    .line 183
    .line 184
    .line 185
    const v18, -0x4043d70a    # -1.47f

    .line 186
    .line 187
    .line 188
    const v13, 0x3f570a3d    # 0.84f

    .line 189
    .line 190
    .line 191
    const/4 v14, 0x0

    .line 192
    const v15, 0x3fc3d70a    # 1.53f

    .line 193
    .line 194
    .line 195
    const v16, -0x40d9999a    # -0.65f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41b71eb8    # 22.89f

    .line 202
    .line 203
    .line 204
    const v2, 0x40c33333    # 6.1f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x40828f5c    # -0.99f

    .line 211
    .line 212
    .line 213
    const v18, -0x40733333    # -1.1f

    .line 214
    .line 215
    .line 216
    const v13, 0x3d75c28f    # 0.06f

    .line 217
    .line 218
    .line 219
    const v14, -0x40e8f5c3    # -0.59f

    .line 220
    .line 221
    .line 222
    const v15, -0x41333333    # -0.4f

    .line 223
    .line 224
    .line 225
    const v16, -0x40733333    # -1.1f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41a80000    # 21.0f

    .line 235
    .line 236
    const/high16 v2, 0x41700000    # 15.0f

    .line 237
    .line 238
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x40000000    # 2.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, -0x40800000    # -1.0f

    .line 247
    .line 248
    const/high16 v18, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const v13, -0x40f33333    # -0.55f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const/high16 v15, -0x40800000    # -1.0f

    .line 255
    .line 256
    const v16, 0x3ee66666    # 0.45f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x3ee66666    # 0.45f

    .line 263
    .line 264
    .line 265
    const/high16 v2, 0x3f800000    # 1.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41500000    # 13.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/high16 v18, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v13, 0x3f0ccccd    # 0.55f

    .line 280
    .line 281
    .line 282
    const/high16 v15, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const v16, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x4119999a    # -0.45f

    .line 291
    .line 292
    .line 293
    const/high16 v2, -0x40800000    # -1.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x40066666    # 2.1f

    .line 302
    .line 303
    .line 304
    const/high16 v2, 0x41700000    # 15.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x414ccccd    # 12.8f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3f7d70a4    # 0.99f

    .line 316
    .line 317
    .line 318
    const v18, -0x406b851f    # -1.16f

    .line 319
    .line 320
    .line 321
    const v13, 0x3f1eb852    # 0.62f

    .line 322
    .line 323
    .line 324
    const v15, 0x3f8e147b    # 1.11f

    .line 325
    .line 326
    .line 327
    const v16, -0x40f0a3d7    # -0.56f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x3f13851f    # -7.39f

    .line 334
    .line 335
    .line 336
    const v18, -0x3f64cccd    # -4.85f

    .line 337
    .line 338
    .line 339
    const v13, -0x40d9999a    # -0.65f

    .line 340
    .line 341
    .line 342
    const v14, -0x3fb147ae    # -3.23f

    .line 343
    .line 344
    .line 345
    const v15, -0x3f7f5c29    # -4.02f

    .line 346
    .line 347
    .line 348
    const v16, -0x3f64cccd    # -4.85f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, -0x3f13851f    # -7.39f

    .line 355
    .line 356
    .line 357
    const v2, 0x409b3333    # 4.85f

    .line 358
    .line 359
    .line 360
    const v4, -0x3f28a3d7    # -6.73f

    .line 361
    .line 362
    .line 363
    const v6, 0x3fcf5c29    # 1.62f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x3f7d70a4    # 0.99f

    .line 370
    .line 371
    .line 372
    const v18, 0x3f947ae1    # 1.16f

    .line 373
    .line 374
    .line 375
    const v13, -0x420a3d71    # -0.12f

    .line 376
    .line 377
    .line 378
    const v14, 0x3f19999a    # 0.6f

    .line 379
    .line 380
    .line 381
    const v15, 0x3ec28f5c    # 0.38f

    .line 382
    .line 383
    .line 384
    const v16, 0x3f947ae1    # 1.16f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41880000    # 17.0f

    .line 394
    .line 395
    const/high16 v2, 0x41700000    # 15.0f

    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40000000    # 2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40800000    # -1.0f

    .line 406
    .line 407
    const/high16 v18, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const v13, -0x40f33333    # -0.55f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, -0x40800000    # -1.0f

    .line 414
    .line 415
    const v16, 0x3ee66666    # 0.45f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x3f800000    # 1.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x41500000    # 13.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v18, -0x40800000    # -1.0f

    .line 437
    .line 438
    const v13, 0x3f0ccccd    # 0.55f

    .line 439
    .line 440
    .line 441
    const/high16 v15, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const v16, -0x4119999a    # -0.45f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x4119999a    # -0.45f

    .line 450
    .line 451
    .line 452
    const/high16 v2, -0x40800000    # -1.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    const/16 v16, 0x3800

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    const/high16 v6, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/high16 v8, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    const/high16 v9, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v12, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const/4 v15, 0x0

    .line 479
    const-string v4, ""

    .line 480
    .line 481
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    sput-object v0, Landroidx/compose/material/icons/rounded/FastfoodKt;->_fastfood:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 490
    .line 491
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object v0
.end method
