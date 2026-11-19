.class public final Landroidx/compose/material/icons/rounded/KeyOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KeyOffKt;->_keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.KeyOff"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const v2, 0x414d47ae    # 12.83f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x4082e148    # 4.09f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v0, 0x41880000    # 17.0f

    .line 85
    .line 86
    const/high16 v2, 0x41600000    # 14.0f

    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, 0x3fa51eb8    # 1.29f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x3fb5c28f    # 1.42f

    .line 98
    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const v13, 0x3ec7ae14    # 0.39f

    .line 103
    .line 104
    .line 105
    const v14, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f83d70a    # 1.03f

    .line 109
    .line 110
    .line 111
    const v16, 0x3ec7ae14    # 0.39f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x4025c28f    # 2.59f

    .line 118
    .line 119
    .line 120
    const v2, -0x3fd8f5c3    # -2.61f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, -0x43dc28f6    # -0.01f

    .line 127
    .line 128
    .line 129
    const v18, -0x404a3d71    # -1.42f

    .line 130
    .line 131
    .line 132
    const v14, -0x413851ec    # -0.39f

    .line 133
    .line 134
    .line 135
    const v15, 0x3ec7ae14    # 0.39f

    .line 136
    .line 137
    .line 138
    const v16, -0x407c28f6    # -1.03f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, -0x40828f5c    # -0.99f

    .line 145
    .line 146
    .line 147
    const v2, -0x4087ae14    # -0.97f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, 0x41a4b852    # 20.59f

    .line 154
    .line 155
    .line 156
    const/high16 v18, 0x41200000    # 10.0f

    .line 157
    .line 158
    const v13, 0x41a8cccd    # 21.1f

    .line 159
    .line 160
    .line 161
    const v14, 0x4121999a    # 10.1f

    .line 162
    .line 163
    .line 164
    const v15, 0x41a6cccd    # 20.85f

    .line 165
    .line 166
    .line 167
    const/high16 v16, 0x41200000    # 10.0f

    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x414d47ae    # 12.83f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x41af3333    # 21.9f

    .line 182
    .line 183
    .line 184
    const v2, 0x41988f5c    # 19.07f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3fb47ae1    # 1.41f

    .line 191
    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    const v13, 0x3ec7ae14    # 0.39f

    .line 196
    .line 197
    .line 198
    const v14, 0x3ec7ae14    # 0.39f

    .line 199
    .line 200
    .line 201
    const v15, 0x3f828f5c    # 1.02f

    .line 202
    .line 203
    .line 204
    const v16, 0x3ec7ae14    # 0.39f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    const v2, -0x404b851f    # -1.41f

    .line 212
    .line 213
    .line 214
    const v4, 0x3ec7ae14    # 0.39f

    .line 215
    .line 216
    .line 217
    const v6, -0x407d70a4    # -1.02f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x4060a3d7    # 3.51f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x404b851f    # -1.41f

    .line 230
    .line 231
    .line 232
    const v13, -0x413851ec    # -0.39f

    .line 233
    .line 234
    .line 235
    const v14, -0x413851ec    # -0.39f

    .line 236
    .line 237
    .line 238
    const v15, -0x407d70a4    # -1.02f

    .line 239
    .line 240
    .line 241
    const v16, -0x413851ec    # -0.39f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const v18, 0x3fb47ae1    # 1.41f

    .line 250
    .line 251
    .line 252
    const v14, 0x3ec7ae14    # 0.39f

    .line 253
    .line 254
    .line 255
    const v15, -0x413851ec    # -0.39f

    .line 256
    .line 257
    .line 258
    const v16, 0x3f828f5c    # 1.02f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x3ff0a3d7    # 1.88f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/high16 v18, 0x41400000    # 12.0f

    .line 273
    .line 274
    const v13, 0x400ccccd    # 2.2f

    .line 275
    .line 276
    .line 277
    const v14, 0x40fb3333    # 7.85f

    .line 278
    .line 279
    .line 280
    const/high16 v15, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const v16, 0x411ca3d7    # 9.79f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x40c00000    # 6.0f

    .line 289
    .line 290
    const/high16 v18, 0x40c00000    # 6.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, 0x4053d70a    # 3.31f

    .line 294
    .line 295
    .line 296
    const v15, 0x402c28f6    # 2.69f

    .line 297
    .line 298
    .line 299
    const/high16 v16, 0x40c00000    # 6.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x40a5c28f    # 5.18f

    .line 305
    .line 306
    .line 307
    const v18, -0x3fc0a3d7    # -2.99f

    .line 308
    .line 309
    .line 310
    const v13, 0x400d70a4    # 2.21f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const v15, 0x4084cccd    # 4.15f

    .line 315
    .line 316
    .line 317
    const v16, -0x40666666    # -1.2f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x41af3333    # 21.9f

    .line 324
    .line 325
    .line 326
    const v2, 0x41988f5c    # 19.07f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x414bd70a    # 12.74f

    .line 336
    .line 337
    .line 338
    const v2, 0x411e8f5c    # 9.91f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x40e00000    # 7.0f

    .line 345
    .line 346
    const/high16 v18, 0x41700000    # 15.0f

    .line 347
    .line 348
    const v13, 0x411947ae    # 9.58f

    .line 349
    .line 350
    .line 351
    const v14, 0x41607ae1    # 14.03f

    .line 352
    .line 353
    .line 354
    const v15, 0x41066666    # 8.4f

    .line 355
    .line 356
    .line 357
    const/high16 v16, 0x41700000    # 15.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 363
    .line 364
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 365
    .line 366
    const v13, -0x402ccccd    # -1.65f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 371
    .line 372
    const v16, -0x40533333    # -1.35f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x4010a3d7    # 2.26f

    .line 379
    .line 380
    .line 381
    const v18, -0x3fc5c28f    # -2.91f

    .line 382
    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, -0x404ccccd    # -1.4f

    .line 386
    .line 387
    .line 388
    const v15, 0x3f7851ec    # 0.97f

    .line 389
    .line 390
    .line 391
    const v16, -0x3fdae148    # -2.58f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const/16 v16, 0x3800

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v8, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    const/high16 v9, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/high16 v12, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const-string v4, ""

    .line 423
    .line 424
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    sput-object v0, Landroidx/compose/material/icons/rounded/KeyOffKt;->_keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 433
    .line 434
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    return-object v0
.end method
