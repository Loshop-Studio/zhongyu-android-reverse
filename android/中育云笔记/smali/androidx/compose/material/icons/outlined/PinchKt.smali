.class public final Landroidx/compose/material/icons/outlined/PinchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pinch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPinch(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PinchKt;->_pinch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Pinch"

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
    const/high16 v0, 0x40200000    # 2.5f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x41180000    # 9.5f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x4063d70a    # 3.56f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x41180000    # 9.5f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40c00000    # 6.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x41300000    # 11.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x3f800000    # 1.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x401c28f6    # 2.44f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x41070a3d    # 8.44f

    .line 138
    .line 139
    .line 140
    const/high16 v2, 0x40200000    # 2.5f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x40c00000    # 6.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x41af1eb8    # 21.89f

    .line 154
    .line 155
    .line 156
    const v2, 0x415c51ec    # 13.77f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x3f8ccccd    # -3.8f

    .line 163
    .line 164
    .line 165
    const v2, -0x402a3d71    # -1.67f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x418d3333    # 17.65f

    .line 172
    .line 173
    .line 174
    const/high16 v18, 0x41400000    # 12.0f

    .line 175
    .line 176
    const v13, 0x418fae14    # 17.96f

    .line 177
    .line 178
    .line 179
    const v14, 0x4140a3d7    # 12.04f

    .line 180
    .line 181
    .line 182
    const v15, 0x418e7ae1    # 17.81f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x41400000    # 12.0f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41880000    # 17.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x40f00000    # 7.5f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41680000    # 14.5f

    .line 201
    .line 202
    const/high16 v18, 0x40a00000    # 5.0f

    .line 203
    .line 204
    const/high16 v13, 0x41880000    # 17.0f

    .line 205
    .line 206
    const v14, 0x40c3d70a    # 6.12f

    .line 207
    .line 208
    .line 209
    const v15, 0x417e147b    # 15.88f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40c3d70a    # 6.12f

    .line 218
    .line 219
    .line 220
    const/high16 v2, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v4, 0x40f00000    # 7.5f

    .line 223
    .line 224
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x41026666    # 8.15f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, -0x4010a3d7    # -1.87f

    .line 234
    .line 235
    .line 236
    const v2, -0x41333333    # -0.4f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, -0x40228f5c    # -1.73f

    .line 243
    .line 244
    .line 245
    const v18, 0x3f0f5c29    # 0.56f

    .line 246
    .line 247
    .line 248
    const v13, -0x41bd70a4    # -0.19f

    .line 249
    .line 250
    .line 251
    const v14, -0x430a3d71    # -0.03f

    .line 252
    .line 253
    .line 254
    const v15, -0x407d70a4    # -1.02f

    .line 255
    .line 256
    .line 257
    const v16, -0x41e66666    # -0.15f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40e00000    # 7.0f

    .line 264
    .line 265
    const v2, 0x4189c28f    # 17.22f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40a3d70a    # 5.12f

    .line 272
    .line 273
    .line 274
    const v2, 0x40a6147b    # 5.19f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x41587ae1    # 13.53f

    .line 281
    .line 282
    .line 283
    const/high16 v18, 0x41b80000    # 23.0f

    .line 284
    .line 285
    const v13, 0x4147d70a    # 12.49f

    .line 286
    .line 287
    .line 288
    const v14, 0x41b651ec    # 22.79f

    .line 289
    .line 290
    .line 291
    const/high16 v15, 0x41500000    # 13.0f

    .line 292
    .line 293
    const/high16 v16, 0x41b80000    # 23.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x40d1999a    # 6.55f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x3ffc28f6    # 1.97f

    .line 305
    .line 306
    .line 307
    const v18, -0x402a3d71    # -1.67f

    .line 308
    .line 309
    .line 310
    const v13, 0x3f7ae148    # 0.98f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const v15, 0x3fe7ae14    # 1.81f

    .line 315
    .line 316
    .line 317
    const v16, -0x40cccccd    # -0.7f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3f6b851f    # 0.92f

    .line 324
    .line 325
    .line 326
    const v2, -0x3f51eb85    # -5.44f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x41af1eb8    # 21.89f

    .line 333
    .line 334
    .line 335
    const v18, 0x415c51ec    # 13.77f

    .line 336
    .line 337
    .line 338
    const v13, 0x41b8f5c3    # 23.12f

    .line 339
    .line 340
    .line 341
    const v14, 0x41707ae1    # 15.03f

    .line 342
    .line 343
    .line 344
    const v15, 0x41b570a4    # 22.68f

    .line 345
    .line 346
    .line 347
    const v16, 0x4162b852    # 14.17f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x41a0a3d7    # 20.08f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x41a80000    # 21.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, -0x3f2e6666    # -6.55f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x3f933333    # -3.7f

    .line 371
    .line 372
    .line 373
    const v2, -0x3f8e147b    # -3.78f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41600000    # 14.0f

    .line 380
    .line 381
    const v2, 0x4190e148    # 18.11f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40f00000    # 7.5f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x41680000    # 14.5f

    .line 393
    .line 394
    const/high16 v18, 0x40e00000    # 7.0f

    .line 395
    .line 396
    const/high16 v13, 0x41600000    # 14.0f

    .line 397
    .line 398
    const v14, 0x40e70a3d    # 7.22f

    .line 399
    .line 400
    .line 401
    const v15, 0x4163851f    # 14.22f

    .line 402
    .line 403
    .line 404
    const/high16 v16, 0x40e00000    # 7.0f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x40e70a3d    # 7.22f

    .line 410
    .line 411
    .line 412
    const/high16 v2, 0x41700000    # 15.0f

    .line 413
    .line 414
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x40c5c28f    # 6.18f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3fe147ae    # 1.76f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x4178f5c3    # 15.56f

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x41a80000    # 21.0f

    .line 433
    .line 434
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x41a0a3d7    # 20.08f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const/16 v16, 0x3800

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v8, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    const/high16 v9, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v12, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v14, 0x0

    .line 465
    const/4 v15, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sput-object v0, Landroidx/compose/material/icons/outlined/PinchKt;->_pinch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 477
    .line 478
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-object v0
.end method
