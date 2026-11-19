.class public final Landroidx/compose/material/icons/rounded/ForkLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _forkLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForkLeft(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ForkLeftKt;->_forkLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ForkLeft"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v18, -0x40800000    # -1.0f

    .line 94
    .line 95
    const v13, -0x40f33333    # -0.55f

    .line 96
    .line 97
    .line 98
    const/4 v14, 0x0

    .line 99
    const/high16 v15, -0x40800000    # -1.0f

    .line 100
    .line 101
    const v16, -0x4119999a    # -0.45f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, -0x3f5a8f5c    # -5.17f

    .line 113
    .line 114
    .line 115
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 116
    .line 117
    const v13, -0x40c51eb8    # -0.73f

    .line 118
    .line 119
    .line 120
    const v14, -0x3fdae148    # -2.58f

    .line 121
    .line 122
    .line 123
    const v15, -0x3fbb851f    # -3.07f

    .line 124
    .line 125
    .line 126
    const v16, -0x3fa1eb85    # -3.47f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x3f6147ae    # 0.88f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const v18, 0x3fb47ae1    # 1.41f

    .line 141
    .line 142
    .line 143
    const v13, 0x3ec7ae14    # 0.39f

    .line 144
    .line 145
    .line 146
    const v14, 0x3ec7ae14    # 0.39f

    .line 147
    .line 148
    .line 149
    const v15, 0x3ec7ae14    # 0.39f

    .line 150
    .line 151
    .line 152
    const v16, 0x3f828f5c    # 1.02f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, -0x404b851f    # -1.41f

    .line 159
    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const v13, -0x413851ec    # -0.39f

    .line 164
    .line 165
    .line 166
    const v15, -0x407d70a4    # -1.02f

    .line 167
    .line 168
    .line 169
    const v16, 0x3ec7ae14    # 0.39f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x3fda3d71    # -2.59f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const v18, -0x404b851f    # -1.41f

    .line 184
    .line 185
    .line 186
    const v14, -0x413851ec    # -0.39f

    .line 187
    .line 188
    .line 189
    const v15, -0x413851ec    # -0.39f

    .line 190
    .line 191
    .line 192
    const v16, -0x407d70a4    # -1.02f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x4025c28f    # 2.59f

    .line 199
    .line 200
    .line 201
    const v2, -0x3fda3d71    # -2.59f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x3fb47ae1    # 1.41f

    .line 208
    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const v13, 0x3ec7ae14    # 0.39f

    .line 213
    .line 214
    .line 215
    const v15, 0x3f828f5c    # 1.02f

    .line 216
    .line 217
    .line 218
    const v16, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v18, 0x3fb47ae1    # 1.41f

    .line 227
    .line 228
    .line 229
    const v14, 0x3ec7ae14    # 0.39f

    .line 230
    .line 231
    .line 232
    const v15, 0x3ec7ae14    # 0.39f

    .line 233
    .line 234
    .line 235
    const v16, 0x3f828f5c    # 1.02f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x40fa8f5c    # 7.83f

    .line 242
    .line 243
    .line 244
    const/high16 v2, 0x41400000    # 12.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x40a570a4    # 5.17f

    .line 250
    .line 251
    .line 252
    const v18, 0x3fae147b    # 1.36f

    .line 253
    .line 254
    .line 255
    const v13, 0x3fc147ae    # 1.51f

    .line 256
    .line 257
    .line 258
    const v14, -0x41570a3d    # -0.33f

    .line 259
    .line 260
    .line 261
    const v15, 0x406eb852    # 3.73f

    .line 262
    .line 263
    .line 264
    const v16, 0x3da3d70a    # 0.08f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/4 v0, 0x0

    .line 271
    const v2, -0x3f2f0a3d    # -6.53f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x409eb852    # -0.88f

    .line 278
    .line 279
    .line 280
    const v2, 0x3f6147ae    # 0.88f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x404b851f    # -1.41f

    .line 287
    .line 288
    .line 289
    const/16 v18, 0x0

    .line 290
    .line 291
    const v13, -0x413851ec    # -0.39f

    .line 292
    .line 293
    .line 294
    const v14, 0x3ec7ae14    # 0.39f

    .line 295
    .line 296
    .line 297
    const v15, -0x407d70a4    # -1.02f

    .line 298
    .line 299
    .line 300
    const v16, 0x3ec7ae14    # 0.39f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const v18, -0x404b851f    # -1.41f

    .line 309
    .line 310
    .line 311
    const v14, -0x413851ec    # -0.39f

    .line 312
    .line 313
    .line 314
    const v15, -0x413851ec    # -0.39f

    .line 315
    .line 316
    .line 317
    const v16, -0x407d70a4    # -1.02f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x4025c28f    # 2.59f

    .line 324
    .line 325
    .line 326
    const v2, -0x3fda3d71    # -2.59f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3fb47ae1    # 1.41f

    .line 333
    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const v13, 0x3ec7ae14    # 0.39f

    .line 338
    .line 339
    .line 340
    const v15, 0x3f828f5c    # 1.02f

    .line 341
    .line 342
    .line 343
    const v16, -0x413851ec    # -0.39f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const v18, 0x3fb47ae1    # 1.41f

    .line 355
    .line 356
    .line 357
    const v14, 0x3ec7ae14    # 0.39f

    .line 358
    .line 359
    .line 360
    const v15, 0x3ec7ae14    # 0.39f

    .line 361
    .line 362
    .line 363
    const v16, 0x3f828f5c    # 1.02f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x404b851f    # -1.41f

    .line 370
    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, -0x413851ec    # -0.39f

    .line 375
    .line 376
    .line 377
    const v15, -0x407d70a4    # -1.02f

    .line 378
    .line 379
    .line 380
    const v16, 0x3ec7ae14    # 0.39f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x40da8f5c    # 6.83f

    .line 387
    .line 388
    .line 389
    const/high16 v2, 0x41700000    # 15.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41a00000    # 20.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const/16 v16, 0x3800

    .line 407
    .line 408
    const/16 v17, 0x0

    .line 409
    .line 410
    const/high16 v6, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/high16 v8, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/4 v7, 0x0

    .line 415
    const/high16 v9, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v12, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/ForkLeftKt;->_forkLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 433
    .line 434
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    return-object v0
.end method
