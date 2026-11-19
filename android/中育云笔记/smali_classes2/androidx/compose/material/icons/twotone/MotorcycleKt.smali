.class public final Landroidx/compose/material/icons/twotone/MotorcycleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotorcycle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MotorcycleKt;->_motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Motorcycle"

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
    const v4, 0x411b3333    # 9.7f

    .line 71
    .line 72
    .line 73
    const v6, 0x4144f5c3    # 12.31f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x3e800000    # 0.25f

    .line 80
    .line 81
    const v6, 0x3f30a3d7    # 0.69f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x3f451eb8    # 0.77f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, -0x40000000    # -2.0f

    .line 94
    .line 95
    const/high16 v6, 0x40000000    # 2.0f

    .line 96
    .line 97
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x410fae14    # 8.98f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x3f3851ec    # 0.72f

    .line 107
    .line 108
    .line 109
    const v26, 0x3fa7ae14    # 1.31f

    .line 110
    .line 111
    .line 112
    const v21, 0x3e99999a    # 0.3f

    .line 113
    .line 114
    .line 115
    const v22, 0x3ec7ae14    # 0.39f

    .line 116
    .line 117
    .line 118
    const v23, 0x3f0a3d71    # 0.54f

    .line 119
    .line 120
    .line 121
    const v24, 0x3f547ae1    # 0.83f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const/16 v16, 0x3800

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const v6, 0x3e99999a    # 0.3f

    .line 141
    .line 142
    .line 143
    const v8, 0x3e99999a    # 0.3f

    .line 144
    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/high16 v9, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/high16 v12, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v14, 0x0

    .line 153
    const/4 v15, 0x0

    .line 154
    const-string v4, ""

    .line 155
    .line 156
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 164
    .line 165
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 166
    .line 167
    .line 168
    move-result-wide v6

    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const v0, 0x419b851f    # 19.44f

    .line 187
    .line 188
    .line 189
    const v2, 0x41107ae1    # 9.03f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x41768f5c    # 15.41f

    .line 196
    .line 197
    .line 198
    const/high16 v2, 0x40a00000    # 5.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41300000    # 11.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40000000    # 2.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x4065c28f    # 3.59f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41100000    # 9.0f

    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, -0x3f600000    # -5.0f

    .line 230
    .line 231
    const/high16 v18, 0x40a00000    # 5.0f

    .line 232
    .line 233
    const v13, -0x3fcccccd    # -2.8f

    .line 234
    .line 235
    .line 236
    const/high16 v15, -0x3f600000    # -5.0f

    .line 237
    .line 238
    const v16, 0x400ccccd    # 2.2f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x400ccccd    # 2.2f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x409ccccd    # 4.9f

    .line 251
    .line 252
    .line 253
    const/high16 v18, -0x3f800000    # -4.0f

    .line 254
    .line 255
    const v13, 0x401d70a4    # 2.46f

    .line 256
    .line 257
    .line 258
    const v15, 0x408e6666    # 4.45f

    .line 259
    .line 260
    .line 261
    const v16, -0x4027ae14    # -1.69f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x3fd33333    # 1.65f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x403147ae    # 2.77f

    .line 274
    .line 275
    .line 276
    const v2, -0x3fceb852    # -2.77f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, -0x415c28f6    # -0.32f

    .line 283
    .line 284
    .line 285
    const v18, 0x3fe28f5c    # 1.77f

    .line 286
    .line 287
    .line 288
    const v13, -0x41a8f5c3    # -0.21f

    .line 289
    .line 290
    .line 291
    const v14, 0x3f0a3d71    # 0.54f

    .line 292
    .line 293
    .line 294
    const v15, -0x415c28f6    # -0.32f

    .line 295
    .line 296
    .line 297
    const v16, 0x3f91eb85    # 1.14f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40a00000    # 5.0f

    .line 304
    .line 305
    const/high16 v18, 0x40a00000    # 5.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const v14, 0x40333333    # 2.8f

    .line 309
    .line 310
    .line 311
    const v15, 0x400ccccd    # 2.2f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x40a00000    # 5.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x3ff33333    # -2.2f

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x3f600000    # -5.0f

    .line 323
    .line 324
    const/high16 v4, 0x40a00000    # 5.0f

    .line 325
    .line 326
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x3f6e147b    # -4.56f

    .line 330
    .line 331
    .line 332
    const v18, -0x3f60f5c3    # -4.97f

    .line 333
    .line 334
    .line 335
    const v14, -0x3fd66666    # -2.65f

    .line 336
    .line 337
    .line 338
    const v15, -0x4003d70a    # -1.97f

    .line 339
    .line 340
    .line 341
    const v16, -0x3f675c29    # -4.77f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x40fa3d71    # 7.82f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x41700000    # 15.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x40a00000    # 5.0f

    .line 359
    .line 360
    const/high16 v18, 0x41880000    # 17.0f

    .line 361
    .line 362
    const v13, 0x40eccccd    # 7.4f

    .line 363
    .line 364
    .line 365
    const v14, 0x41813333    # 16.15f

    .line 366
    .line 367
    .line 368
    const v15, 0x40c8f5c3    # 6.28f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x41880000    # 17.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 377
    .line 378
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 379
    .line 380
    const v13, -0x402f5c29    # -1.63f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 385
    .line 386
    const v16, -0x4050a3d7    # -1.37f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3faf5c29    # 1.37f

    .line 393
    .line 394
    .line 395
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 396
    .line 397
    const/high16 v4, 0x40400000    # 3.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40347ae1    # 2.82f

    .line 403
    .line 404
    .line 405
    const/high16 v18, 0x40000000    # 2.0f

    .line 406
    .line 407
    const v13, 0x3fa3d70a    # 1.28f

    .line 408
    .line 409
    .line 410
    const v15, 0x4019999a    # 2.4f

    .line 411
    .line 412
    .line 413
    const v16, 0x3f59999a    # 0.85f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41500000    # 13.0f

    .line 420
    .line 421
    const/high16 v2, 0x40a00000    # 5.0f

    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x40000000    # 2.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x40347ae1    # 2.82f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x412b851f    # 10.72f

    .line 441
    .line 442
    .line 443
    const/high16 v2, 0x41500000    # 13.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x40bae148    # -0.77f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, -0x41800000    # -0.25f

    .line 455
    .line 456
    const v2, -0x40cf5c29    # -0.69f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, -0x40c7ae14    # -0.72f

    .line 463
    .line 464
    .line 465
    const v18, -0x405851ec    # -1.31f

    .line 466
    .line 467
    .line 468
    const v13, -0x41c7ae14    # -0.18f

    .line 469
    .line 470
    .line 471
    const v14, -0x410a3d71    # -0.48f

    .line 472
    .line 473
    .line 474
    const v15, -0x4128f5c3    # -0.42f

    .line 475
    .line 476
    .line 477
    const v16, -0x40947ae1    # -0.92f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x406f5c29    # 3.74f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, -0x40000000    # -2.0f

    .line 490
    .line 491
    const/high16 v2, 0x40000000    # 2.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41980000    # 19.0f

    .line 500
    .line 501
    const/high16 v2, 0x41880000    # 17.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 507
    .line 508
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 509
    .line 510
    const v13, -0x402b851f    # -1.66f

    .line 511
    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 515
    .line 516
    const v16, -0x40547ae1    # -1.34f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x3fab851f    # 1.34f

    .line 523
    .line 524
    .line 525
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x40400000    # 3.0f

    .line 531
    .line 532
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, -0x40547ae1    # -1.34f

    .line 536
    .line 537
    .line 538
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    const/16 v16, 0x3800

    .line 551
    .line 552
    const/16 v17, 0x0

    .line 553
    .line 554
    const/high16 v6, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/high16 v8, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/4 v7, 0x0

    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v15, 0x0

    .line 563
    const-string v4, ""

    .line 564
    .line 565
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    sput-object v0, Landroidx/compose/material/icons/twotone/MotorcycleKt;->_motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 574
    .line 575
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    return-object v0
.end method
