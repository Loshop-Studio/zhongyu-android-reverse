.class public final Landroidx/compose/material/icons/outlined/DoNotTouchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotTouch(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DoNotTouchKt;->_doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DoNotTouch"

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
    const v0, 0x4033d70a    # 2.81f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x3fb1eb85    # 1.39f

    .line 77
    .line 78
    .line 79
    const v2, 0x40870a3d    # 4.22f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x40e00000    # 7.0f

    .line 86
    .line 87
    const v2, 0x411d47ae    # 9.83f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x4089999a    # 4.3f

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, -0x3fd9999a    # -2.6f

    .line 101
    .line 102
    .line 103
    const v2, -0x40428f5c    # -1.48f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x40f5c28f    # -0.54f

    .line 110
    .line 111
    .line 112
    const v18, -0x41f0a3d7    # -0.14f

    .line 113
    .line 114
    .line 115
    const v13, -0x41d1eb85    # -0.17f

    .line 116
    .line 117
    .line 118
    const v14, -0x4247ae14    # -0.09f

    .line 119
    .line 120
    .line 121
    const v15, -0x4151eb85    # -0.34f

    .line 122
    .line 123
    .line 124
    const v16, -0x41f0a3d7    # -0.14f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x40cccccd    # -0.7f

    .line 131
    .line 132
    .line 133
    const v18, 0x3e851eb8    # 0.26f

    .line 134
    .line 135
    .line 136
    const v13, -0x417ae148    # -0.26f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, -0x41000000    # -0.5f

    .line 141
    .line 142
    const v16, 0x3db851ec    # 0.09f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40000000    # 2.0f

    .line 149
    .line 150
    const v2, 0x415e147b    # 13.88f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x40d9999a    # 6.8f

    .line 157
    .line 158
    .line 159
    const v2, 0x40e5c28f    # 7.18f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x400b851f    # 2.18f

    .line 166
    .line 167
    .line 168
    const v18, 0x3f70a3d7    # 0.94f

    .line 169
    .line 170
    .line 171
    const v13, 0x3f11eb85    # 0.57f

    .line 172
    .line 173
    .line 174
    const v14, 0x3f19999a    # 0.6f

    .line 175
    .line 176
    .line 177
    const v15, 0x3faccccd    # 1.35f

    .line 178
    .line 179
    .line 180
    const v16, 0x3f70a3d7    # 0.94f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41880000    # 17.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3fd47ae1    # 1.66f

    .line 192
    .line 193
    .line 194
    const v18, -0x40fae148    # -0.52f

    .line 195
    .line 196
    .line 197
    const v13, 0x3f1eb852    # 0.62f

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    const v15, 0x3f970a3d    # 1.18f

    .line 202
    .line 203
    .line 204
    const v16, -0x41bd70a4    # -0.19f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x3f8f5c29    # 1.12f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x3fb47ae1    # 1.41f

    .line 217
    .line 218
    .line 219
    const v2, -0x404b851f    # -1.41f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x4033d70a    # 2.81f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41880000    # 17.0f

    .line 235
    .line 236
    const/high16 v2, 0x41a00000    # 20.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, -0x3f400000    # -6.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, -0x40c00000    # -0.75f

    .line 247
    .line 248
    const v18, -0x4147ae14    # -0.36f

    .line 249
    .line 250
    .line 251
    const v13, -0x413851ec    # -0.39f

    .line 252
    .line 253
    .line 254
    const v15, -0x40dc28f6    # -0.64f

    .line 255
    .line 256
    .line 257
    const v16, -0x41947ae1    # -0.23f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x40dbd70a    # 6.87f

    .line 264
    .line 265
    .line 266
    const/high16 v2, 0x41800000    # 16.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41100000    # 9.0f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, -0x3f7a8f5c    # -4.17f

    .line 277
    .line 278
    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x41023d71    # 8.14f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x41880000    # 17.0f

    .line 290
    .line 291
    const/high16 v18, 0x41a00000    # 20.0f

    .line 292
    .line 293
    const v13, 0x4188b852    # 17.09f

    .line 294
    .line 295
    .line 296
    const v14, 0x419fd70a    # 19.98f

    .line 297
    .line 298
    .line 299
    const v15, 0x41886666    # 17.05f

    .line 300
    .line 301
    .line 302
    const/high16 v16, 0x41a00000    # 20.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x415d47ae    # 13.83f

    .line 311
    .line 312
    .line 313
    const/high16 v2, 0x41300000    # 11.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41600000    # 14.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x40500000    # 3.25f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x41740000    # 15.25f

    .line 329
    .line 330
    const/high16 v18, 0x40000000    # 2.0f

    .line 331
    .line 332
    const/high16 v13, 0x41600000    # 14.0f

    .line 333
    .line 334
    const v14, 0x4023d70a    # 2.56f

    .line 335
    .line 336
    .line 337
    const v15, 0x4168f5c3    # 14.56f

    .line 338
    .line 339
    .line 340
    const/high16 v16, 0x40000000    # 2.0f

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3f0f5c29    # 0.56f

    .line 346
    .line 347
    .line 348
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 349
    .line 350
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41300000    # 11.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x3f800000    # 1.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x40a80000    # 5.25f

    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x41960000    # 18.75f

    .line 369
    .line 370
    const/high16 v18, 0x40800000    # 4.0f

    .line 371
    .line 372
    const/high16 v13, 0x418c0000    # 17.5f

    .line 373
    .line 374
    const v14, 0x4091eb85    # 4.56f

    .line 375
    .line 376
    .line 377
    const v15, 0x41907ae1    # 18.06f

    .line 378
    .line 379
    .line 380
    const/high16 v16, 0x40800000    # 4.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x4091eb85    # 4.56f

    .line 386
    .line 387
    .line 388
    const/high16 v2, 0x40a80000    # 5.25f

    .line 389
    .line 390
    const/high16 v4, 0x41a00000    # 20.0f

    .line 391
    .line 392
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x413eb852    # 11.92f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, -0x40000000    # -2.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41500000    # 13.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x3ff51eb8    # -2.17f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x415d47ae    # 13.83f

    .line 418
    .line 419
    .line 420
    const/high16 v2, 0x41300000    # 11.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x4122b852    # 10.17f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x41500000    # 13.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x40100000    # 2.25f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x413c0000    # 11.75f

    .line 442
    .line 443
    const/high16 v18, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/high16 v13, 0x41500000    # 13.0f

    .line 446
    .line 447
    const v14, 0x3fc7ae14    # 1.56f

    .line 448
    .line 449
    .line 450
    const v15, 0x41470a3d    # 12.44f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x3f800000    # 1.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3fc7ae14    # 1.56f

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x41280000    # 10.5f

    .line 462
    .line 463
    const/high16 v4, 0x40100000    # 2.25f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40ad70a4    # 5.42f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x4122b852    # 10.17f

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x41500000    # 13.0f

    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x40d570a4    # 6.67f

    .line 486
    .line 487
    .line 488
    const/high16 v2, 0x41180000    # 9.5f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x40880000    # 4.25f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x41040000    # 8.25f

    .line 499
    .line 500
    const/high16 v18, 0x40400000    # 3.0f

    .line 501
    .line 502
    const/high16 v13, 0x41180000    # 9.5f

    .line 503
    .line 504
    const v14, 0x4063d70a    # 3.56f

    .line 505
    .line 506
    .line 507
    const v15, 0x410f0a3d    # 8.94f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x40400000    # 3.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, -0x406147ae    # -1.24f

    .line 516
    .line 517
    .line 518
    const v18, 0x3f970a3d    # 1.18f

    .line 519
    .line 520
    .line 521
    const v13, -0x40d47ae1    # -0.67f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const v15, -0x40666666    # -1.2f

    .line 526
    .line 527
    .line 528
    const v16, 0x3f07ae14    # 0.53f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x40d570a4    # 6.67f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const/16 v16, 0x3800

    .line 552
    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    const/high16 v6, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/high16 v8, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/4 v7, 0x0

    .line 560
    const/high16 v9, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/high16 v12, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const/4 v15, 0x0

    .line 566
    const-string v4, ""

    .line 567
    .line 568
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    sput-object v0, Landroidx/compose/material/icons/outlined/DoNotTouchKt;->_doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    return-object v0
.end method
