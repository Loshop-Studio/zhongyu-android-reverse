.class public final Landroidx/compose/material/icons/outlined/WashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWash(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Wash"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a60000    # 20.75f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 78
    .line 79
    const/high16 v18, -0x40600000    # -1.25f

    .line 80
    .line 81
    const v13, 0x3f30a3d7    # 0.69f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 86
    .line 87
    const v16, -0x40f0a3d7    # -0.56f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x40f0a3d7    # -0.56f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40600000    # -1.25f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x40800000    # -1.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x40d80000    # 6.75f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, -0x4068f5c3    # -1.18f

    .line 120
    .line 121
    .line 122
    const v18, -0x406147ae    # -1.24f

    .line 123
    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const v14, -0x40d47ae1    # -0.67f

    .line 127
    .line 128
    .line 129
    const v15, -0x40f851ec    # -0.53f

    .line 130
    .line 131
    .line 132
    const v16, -0x40666666    # -1.2f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x410deb85    # 8.87f

    .line 139
    .line 140
    .line 141
    const/high16 v2, 0x41200000    # 10.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x3fbd70a4    # 1.48f

    .line 147
    .line 148
    .line 149
    const v2, -0x3fd9999a    # -2.6f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3e0f5c29    # 0.14f

    .line 156
    .line 157
    .line 158
    const v18, -0x40f5c28f    # -0.54f

    .line 159
    .line 160
    .line 161
    const v13, 0x3db851ec    # 0.09f

    .line 162
    .line 163
    .line 164
    const v14, -0x41d1eb85    # -0.17f

    .line 165
    .line 166
    .line 167
    const v15, 0x3e0f5c29    # 0.14f

    .line 168
    .line 169
    .line 170
    const v16, -0x4151eb85    # -0.34f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x417ae148    # -0.26f

    .line 177
    .line 178
    .line 179
    const v18, -0x40cccccd    # -0.7f

    .line 180
    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const v14, -0x417ae148    # -0.26f

    .line 184
    .line 185
    .line 186
    const v15, -0x4247ae14    # -0.09f

    .line 187
    .line 188
    .line 189
    const/high16 v16, -0x41000000    # -0.5f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x4111eb85    # 9.12f

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x40a00000    # 5.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x3f1a3d71    # -7.18f

    .line 203
    .line 204
    .line 205
    const v2, 0x40d9999a    # 6.8f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const v18, 0x415f851f    # 13.97f

    .line 214
    .line 215
    .line 216
    const v13, 0x3fab851f    # 1.34f

    .line 217
    .line 218
    .line 219
    const v14, 0x4145c28f    # 12.36f

    .line 220
    .line 221
    .line 222
    const/high16 v15, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const v16, 0x41526666    # 13.15f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41a00000    # 20.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x40400000    # 3.0f

    .line 236
    .line 237
    const/high16 v18, 0x40400000    # 3.0f

    .line 238
    .line 239
    const/4 v13, 0x0

    .line 240
    const v14, 0x3fd47ae1    # 1.66f

    .line 241
    .line 242
    .line 243
    const v15, 0x3fab851f    # 1.34f

    .line 244
    .line 245
    .line 246
    const/high16 v16, 0x40400000    # 3.0f

    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x415c0000    # 13.75f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 257
    .line 258
    const/high16 v18, -0x40600000    # -1.25f

    .line 259
    .line 260
    const v13, 0x3f30a3d7    # 0.69f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 265
    .line 266
    const v16, -0x40f0a3d7    # -0.56f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, -0x40f0a3d7    # -0.56f

    .line 273
    .line 274
    .line 275
    const/high16 v2, -0x40600000    # -1.25f

    .line 276
    .line 277
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41400000    # 12.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x40800000    # -1.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40f80000    # 7.75f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x41a3851f    # 20.44f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x419e0000    # 19.75f

    .line 302
    .line 303
    const/high16 v4, 0x41880000    # 17.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41400000    # 12.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, -0x40800000    # -1.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41a60000    # 20.75f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41200000    # 10.0f

    .line 327
    .line 328
    const/high16 v2, 0x41a80000    # 21.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x40800000    # 4.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, -0x40800000    # -1.0f

    .line 339
    .line 340
    const/high16 v18, -0x40800000    # -1.0f

    .line 341
    .line 342
    const v13, -0x40f33333    # -0.55f

    .line 343
    .line 344
    .line 345
    const/high16 v15, -0x40800000    # -1.0f

    .line 346
    .line 347
    const v16, -0x4119999a    # -0.45f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, -0x3f400000    # -6.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x3eb851ec    # 0.36f

    .line 359
    .line 360
    .line 361
    const/high16 v18, -0x40c00000    # -0.75f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, -0x413851ec    # -0.39f

    .line 365
    .line 366
    .line 367
    const v15, 0x3e6b851f    # 0.23f

    .line 368
    .line 369
    .line 370
    const v16, -0x40dc28f6    # -0.64f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40e00000    # 7.0f

    .line 377
    .line 378
    const v2, 0x411deb85    # 9.87f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x40400000    # 3.0f

    .line 390
    .line 391
    const/4 v2, 0x0

    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41a80000    # 21.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41580000    # 13.5f

    .line 404
    .line 405
    const/high16 v2, 0x41100000    # 9.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x41700000    # 15.0f

    .line 411
    .line 412
    const/high16 v18, 0x40f00000    # 7.5f

    .line 413
    .line 414
    const v13, 0x416547ae    # 14.33f

    .line 415
    .line 416
    .line 417
    const/high16 v14, 0x41100000    # 9.0f

    .line 418
    .line 419
    const/high16 v15, 0x41700000    # 15.0f

    .line 420
    .line 421
    const v16, 0x410547ae    # 8.33f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x41580000    # 13.5f

    .line 428
    .line 429
    const/high16 v18, 0x40a00000    # 5.0f

    .line 430
    .line 431
    const/high16 v13, 0x41700000    # 15.0f

    .line 432
    .line 433
    const v14, 0x40d51eb8    # 6.66f

    .line 434
    .line 435
    .line 436
    const/high16 v15, 0x41580000    # 13.5f

    .line 437
    .line 438
    const/high16 v16, 0x40a00000    # 5.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40d51eb8    # 6.66f

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x40f00000    # 7.5f

    .line 447
    .line 448
    const/high16 v4, 0x41400000    # 12.0f

    .line 449
    .line 450
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v18, 0x41100000    # 9.0f

    .line 454
    .line 455
    const/high16 v13, 0x41400000    # 12.0f

    .line 456
    .line 457
    const v14, 0x410547ae    # 8.33f

    .line 458
    .line 459
    .line 460
    const v15, 0x414ab852    # 12.67f

    .line 461
    .line 462
    .line 463
    const/high16 v16, 0x41100000    # 9.0f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v2, 0x41940000    # 18.5f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 479
    .line 480
    const/high16 v18, 0x40900000    # 4.5f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 485
    .line 486
    const v16, 0x40351eb8    # 2.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x41940000    # 18.5f

    .line 493
    .line 494
    const/high16 v18, 0x41000000    # 8.0f

    .line 495
    .line 496
    const/high16 v13, 0x41800000    # 16.0f

    .line 497
    .line 498
    const v14, 0x40dc28f6    # 6.88f

    .line 499
    .line 500
    .line 501
    const v15, 0x4188f5c3    # 17.12f

    .line 502
    .line 503
    .line 504
    const/high16 v16, 0x41000000    # 8.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x40dc28f6    # 6.88f

    .line 510
    .line 511
    .line 512
    const/high16 v2, 0x40b00000    # 5.5f

    .line 513
    .line 514
    const/high16 v4, 0x41a80000    # 21.0f

    .line 515
    .line 516
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v18, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v13, 0x41a80000    # 21.0f

    .line 522
    .line 523
    const v14, 0x40751eb8    # 3.83f

    .line 524
    .line 525
    .line 526
    const/high16 v15, 0x41940000    # 18.5f

    .line 527
    .line 528
    const/high16 v16, 0x3f800000    # 1.0f

    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x40d00000    # 6.5f

    .line 537
    .line 538
    const/high16 v2, 0x41940000    # 18.5f

    .line 539
    .line 540
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, -0x40800000    # -1.0f

    .line 544
    .line 545
    const/high16 v18, -0x40800000    # -1.0f

    .line 546
    .line 547
    const v13, -0x40f33333    # -0.55f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const/high16 v15, -0x40800000    # -1.0f

    .line 552
    .line 553
    const v16, -0x4119999a    # -0.45f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v17, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const v18, -0x3ffccccd    # -2.05f

    .line 562
    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const v14, -0x41333333    # -0.4f

    .line 566
    .line 567
    .line 568
    const v15, 0x3edc28f6    # 0.43f

    .line 569
    .line 570
    .line 571
    const v16, -0x4063d70a    # -1.22f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v18, 0x40033333    # 2.05f

    .line 578
    .line 579
    .line 580
    const v13, 0x3f11eb85    # 0.57f

    .line 581
    .line 582
    .line 583
    const v14, 0x3f547ae1    # 0.83f

    .line 584
    .line 585
    .line 586
    const/high16 v15, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const v16, 0x3fd33333    # 1.65f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v17, 0x41940000    # 18.5f

    .line 595
    .line 596
    const/high16 v18, 0x40d00000    # 6.5f

    .line 597
    .line 598
    const/high16 v13, 0x419c0000    # 19.5f

    .line 599
    .line 600
    const v14, 0x40c1999a    # 6.05f

    .line 601
    .line 602
    .line 603
    const v15, 0x41986666    # 19.05f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x40d00000    # 6.5f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    const/16 v16, 0x3800

    .line 619
    .line 620
    const/16 v17, 0x0

    .line 621
    .line 622
    const/high16 v6, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/high16 v8, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    const/high16 v9, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/high16 v12, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v13, 0x0

    .line 632
    const/4 v14, 0x0

    .line 633
    const/4 v15, 0x0

    .line 634
    const-string v4, ""

    .line 635
    .line 636
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    sput-object v0, Landroidx/compose/material/icons/outlined/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    return-object v0
.end method
