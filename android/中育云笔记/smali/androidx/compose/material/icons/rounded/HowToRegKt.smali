.class public final Landroidx/compose/material/icons/rounded/HowToRegKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHowToReg(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HowToRegKt;->_howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HowToReg"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x40a3d70a    # -0.86f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x3ca3d70a    # 0.02f

    .line 84
    .line 85
    .line 86
    const v26, -0x3f77ae14    # -4.26f

    .line 87
    .line 88
    .line 89
    const v21, -0x4068f5c3    # -1.18f

    .line 90
    .line 91
    .line 92
    const v22, -0x4068f5c3    # -1.18f

    .line 93
    .line 94
    .line 95
    const v23, -0x406a3d71    # -1.17f

    .line 96
    .line 97
    .line 98
    const v24, -0x3fb9999a    # -3.1f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x3f570a3d    # 0.84f

    .line 107
    .line 108
    .line 109
    const v6, -0x40ae147b    # -0.82f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v25, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v26, -0x428a3d71    # -0.06f

    .line 118
    .line 119
    .line 120
    const v21, -0x413851ec    # -0.39f

    .line 121
    .line 122
    .line 123
    const v22, -0x42dc28f6    # -0.04f

    .line 124
    .line 125
    .line 126
    const v23, -0x40d1eb85    # -0.68f

    .line 127
    .line 128
    .line 129
    const v24, -0x428a3d71    # -0.06f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, -0x3f000000    # -8.0f

    .line 136
    .line 137
    const/high16 v26, 0x40800000    # 4.0f

    .line 138
    .line 139
    const v21, -0x3fd51eb8    # -2.67f

    .line 140
    .line 141
    .line 142
    const/16 v22, 0x0

    .line 143
    .line 144
    const/high16 v23, -0x3f000000    # -8.0f

    .line 145
    .line 146
    const v24, 0x3fab851f    # 1.34f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x41100000    # 9.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41300000    # 11.0f

    .line 166
    .line 167
    const/high16 v6, 0x41400000    # 12.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x40800000    # 4.0f

    .line 173
    .line 174
    const/high16 v26, -0x3f800000    # -4.0f

    .line 175
    .line 176
    const v21, 0x400d70a4    # 2.21f

    .line 177
    .line 178
    .line 179
    const/high16 v23, 0x40800000    # 4.0f

    .line 180
    .line 181
    const v24, -0x401ae148    # -1.79f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x401ae148    # -1.79f

    .line 188
    .line 189
    .line 190
    const/high16 v6, -0x3f800000    # -4.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x3fe51eb8    # 1.79f

    .line 196
    .line 197
    .line 198
    const/high16 v6, 0x40800000    # 4.0f

    .line 199
    .line 200
    const/high16 v7, -0x3f800000    # -4.0f

    .line 201
    .line 202
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/high16 v8, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const v0, 0x418170a4    # 16.18f

    .line 261
    .line 262
    .line 263
    const v2, 0x419e3d71    # 19.78f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x404a3d71    # -1.42f

    .line 270
    .line 271
    .line 272
    const/16 v18, 0x0

    .line 273
    .line 274
    const v13, -0x413851ec    # -0.39f

    .line 275
    .line 276
    .line 277
    const v14, 0x3ec7ae14    # 0.39f

    .line 278
    .line 279
    .line 280
    const v15, -0x407c28f6    # -1.03f

    .line 281
    .line 282
    .line 283
    const v16, 0x3ec7ae14    # 0.39f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x3ffb851f    # -2.07f

    .line 290
    .line 291
    .line 292
    const v2, -0x3ffa3d71    # -2.09f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/16 v17, 0x0

    .line 299
    .line 300
    const v18, -0x404e147b    # -1.39f

    .line 301
    .line 302
    .line 303
    const v13, -0x413d70a4    # -0.38f

    .line 304
    .line 305
    .line 306
    const v14, -0x413851ec    # -0.39f

    .line 307
    .line 308
    .line 309
    const v15, -0x413d70a4    # -0.38f

    .line 310
    .line 311
    .line 312
    const v16, -0x407eb852    # -1.01f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, -0x43dc28f6    # -0.01f

    .line 319
    .line 320
    .line 321
    const v2, 0x3c23d70a    # 0.01f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3fb33333    # 1.4f

    .line 328
    .line 329
    .line 330
    const/16 v18, 0x0

    .line 331
    .line 332
    const v13, 0x3ec7ae14    # 0.39f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f828f5c    # 1.02f

    .line 336
    .line 337
    .line 338
    const v16, -0x413851ec    # -0.39f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3faf5c29    # 1.37f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x408dc28f    # 4.43f

    .line 351
    .line 352
    .line 353
    const v2, -0x3f7147ae    # -4.46f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x3fb47ae1    # 1.41f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3c23d70a    # 0.01f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const v18, 0x3fb1eb85    # 1.39f

    .line 374
    .line 375
    .line 376
    const v13, 0x3ec28f5c    # 0.38f

    .line 377
    .line 378
    .line 379
    const v14, 0x3ec7ae14    # 0.39f

    .line 380
    .line 381
    .line 382
    const v15, 0x3ec28f5c    # 0.38f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f8147ae    # 1.01f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, -0x3f5b851f    # -5.14f

    .line 392
    .line 393
    .line 394
    const v2, 0x40a5c28f    # 5.18f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v7, 0x0

    .line 414
    const/high16 v12, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const/4 v14, 0x0

    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v4, ""

    .line 420
    .line 421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sput-object v0, Landroidx/compose/material/icons/rounded/HowToRegKt;->_howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method
