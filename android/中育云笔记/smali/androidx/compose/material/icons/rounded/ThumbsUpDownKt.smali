.class public final Landroidx/compose/material/icons/rounded/ThumbsUpDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbsUpDown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ThumbsUpDownKt;->_thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ThumbsUpDown"

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
    const v0, 0x4120f5c3    # 10.06f

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
    const v0, 0x40ba3d71    # 5.82f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, 0x3f28f5c3    # 0.66f

    .line 85
    .line 86
    .line 87
    const v2, -0x3fb47ae1    # -3.18f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x41666666    # -0.3f

    .line 94
    .line 95
    .line 96
    const v18, -0x407d70a4    # -1.02f

    .line 97
    .line 98
    .line 99
    const v13, 0x3da3d70a    # 0.08f

    .line 100
    .line 101
    .line 102
    const v14, -0x41428f5c    # -0.37f

    .line 103
    .line 104
    .line 105
    const v15, -0x42dc28f6    # -0.04f

    .line 106
    .line 107
    .line 108
    const/high16 v16, -0x40c00000    # -0.75f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x40933333    # 4.6f

    .line 114
    .line 115
    .line 116
    const v18, 0x3f4ccccd    # 0.8f

    .line 117
    .line 118
    .line 119
    const v13, 0x40b7ae14    # 5.74f

    .line 120
    .line 121
    .line 122
    const v14, 0x3eb851ec    # 0.36f

    .line 123
    .line 124
    .line 125
    const v15, 0x40a0f5c3    # 5.03f

    .line 126
    .line 127
    .line 128
    const v16, 0x3eb851ec    # 0.36f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40800000    # 4.0f

    .line 135
    .line 136
    const/high16 v2, -0x3f800000    # -4.0f

    .line 137
    .line 138
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x40e66666    # -0.6f

    .line 142
    .line 143
    .line 144
    const v18, 0x3fb47ae1    # 1.41f

    .line 145
    .line 146
    .line 147
    const v13, -0x413851ec    # -0.39f

    .line 148
    .line 149
    .line 150
    const v14, 0x3ebd70a4    # 0.37f

    .line 151
    .line 152
    .line 153
    const v15, -0x40e66666    # -0.6f

    .line 154
    .line 155
    .line 156
    const v16, 0x3f6147ae    # 0.88f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x41400000    # 12.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, 0x40000000    # 2.0f

    .line 168
    .line 169
    const/high16 v18, 0x40000000    # 2.0f

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const v14, 0x3f8ccccd    # 1.1f

    .line 173
    .line 174
    .line 175
    const v15, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    const/high16 v16, 0x40000000    # 2.0f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x40bd70a4    # 5.92f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3feb851f    # 1.84f

    .line 190
    .line 191
    .line 192
    const v18, -0x40651eb8    # -1.21f

    .line 193
    .line 194
    .line 195
    const v13, 0x3f4ccccd    # 0.8f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const v15, 0x3fc28f5c    # 1.52f

    .line 200
    .line 201
    .line 202
    const v16, -0x410a3d71    # -0.48f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x4008f5c3    # 2.14f

    .line 209
    .line 210
    .line 211
    const/high16 v2, -0x3f600000    # -5.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x4120f5c3    # 10.06f

    .line 217
    .line 218
    .line 219
    const/high16 v18, 0x40a00000    # 5.0f

    .line 220
    .line 221
    const v13, 0x41475c29    # 12.46f

    .line 222
    .line 223
    .line 224
    const v14, 0x40cf0a3d    # 6.47f

    .line 225
    .line 226
    .line 227
    const v15, 0x4137d70a    # 11.49f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x40a00000    # 5.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41b00000    # 22.0f

    .line 239
    .line 240
    const/high16 v2, 0x41200000    # 10.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x3f428f5c    # -5.92f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, -0x40147ae1    # -1.84f

    .line 252
    .line 253
    .line 254
    const v18, 0x3f9ae148    # 1.21f

    .line 255
    .line 256
    .line 257
    const v13, -0x40b33333    # -0.8f

    .line 258
    .line 259
    .line 260
    const/4 v14, 0x0

    .line 261
    const v15, -0x403d70a4    # -1.52f

    .line 262
    .line 263
    .line 264
    const v16, 0x3ef5c28f    # 0.48f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x3ff70a3d    # -2.14f

    .line 271
    .line 272
    .line 273
    const/high16 v2, 0x40a00000    # 5.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3feb851f    # 1.84f

    .line 279
    .line 280
    .line 281
    const v18, 0x40328f5c    # 2.79f

    .line 282
    .line 283
    .line 284
    const v13, -0x40f0a3d7    # -0.56f

    .line 285
    .line 286
    .line 287
    const v14, 0x3fa8f5c3    # 1.32f

    .line 288
    .line 289
    .line 290
    const v15, 0x3ecccccd    # 0.4f

    .line 291
    .line 292
    .line 293
    const v16, 0x40328f5c    # 2.79f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x4087ae14    # 4.24f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x40d70a3d    # -0.66f

    .line 306
    .line 307
    .line 308
    const v2, 0x404b851f    # 3.18f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const v18, 0x3f828f5c    # 1.02f

    .line 318
    .line 319
    .line 320
    const v13, -0x425c28f6    # -0.08f

    .line 321
    .line 322
    .line 323
    const v14, 0x3ebd70a4    # 0.37f

    .line 324
    .line 325
    .line 326
    const v15, 0x3d23d70a    # 0.04f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x3f400000    # 0.75f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x3fca3d71    # 1.58f

    .line 335
    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    const v13, 0x3ee147ae    # 0.44f

    .line 340
    .line 341
    .line 342
    const v14, 0x3ee147ae    # 0.44f

    .line 343
    .line 344
    .line 345
    const v15, 0x3f933333    # 1.15f

    .line 346
    .line 347
    .line 348
    const v16, 0x3ee147ae    # 0.44f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40800000    # 4.0f

    .line 355
    .line 356
    const/high16 v2, -0x3f800000    # -4.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3f170a3d    # 0.59f

    .line 362
    .line 363
    .line 364
    const v18, -0x404b851f    # -1.41f

    .line 365
    .line 366
    .line 367
    const v13, 0x3ec28f5c    # 0.38f

    .line 368
    .line 369
    .line 370
    const v14, -0x413d70a4    # -0.38f

    .line 371
    .line 372
    .line 373
    const v15, 0x3f170a3d    # 0.59f

    .line 374
    .line 375
    .line 376
    const v16, -0x409eb852    # -0.88f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41400000    # 12.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, -0x400147ae    # -1.99f

    .line 388
    .line 389
    .line 390
    const/high16 v18, -0x40000000    # -2.0f

    .line 391
    .line 392
    const v13, 0x3c23d70a    # 0.01f

    .line 393
    .line 394
    .line 395
    const v14, -0x40733333    # -1.1f

    .line 396
    .line 397
    .line 398
    const v15, -0x409c28f6    # -0.89f

    .line 399
    .line 400
    .line 401
    const/high16 v16, -0x40000000    # -2.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/16 v16, 0x3800

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const/high16 v6, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/high16 v8, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v7, 0x0

    .line 422
    const/high16 v9, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v12, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const/4 v14, 0x0

    .line 428
    const/4 v15, 0x0

    .line 429
    const-string v4, ""

    .line 430
    .line 431
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sput-object v0, Landroidx/compose/material/icons/rounded/ThumbsUpDownKt;->_thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 440
    .line 441
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v0
.end method
