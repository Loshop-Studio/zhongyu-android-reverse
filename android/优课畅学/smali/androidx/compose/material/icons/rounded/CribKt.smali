.class public final Landroidx/compose/material/icons/rounded/CribKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _crib:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrib(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CribKt;->_crib:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Crib"

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
    const v0, 0x41928f5c    # 18.32f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v17, -0x405851ec    # -1.31f

    .line 77
    .line 78
    .line 79
    const v18, -0x425c28f6    # -0.08f

    .line 80
    .line 81
    .line 82
    const v13, -0x4147ae14    # -0.36f

    .line 83
    .line 84
    .line 85
    const v14, -0x4147ae14    # -0.36f

    .line 86
    .line 87
    .line 88
    const v15, -0x40947ae1    # -0.92f

    .line 89
    .line 90
    .line 91
    const v16, -0x41333333    # -0.4f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, -0x40800000    # -1.0f

    .line 98
    .line 99
    const v18, 0x3f30a3d7    # 0.69f

    .line 100
    .line 101
    .line 102
    const v13, -0x415c28f6    # -0.32f

    .line 103
    .line 104
    .line 105
    const/high16 v14, 0x3e800000    # 0.25f

    .line 106
    .line 107
    const v15, -0x40d9999a    # -0.65f

    .line 108
    .line 109
    .line 110
    const v16, 0x3ef5c28f    # 0.48f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x41800000    # 16.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40000000    # 2.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/high16 v18, -0x40000000    # -2.0f

    .line 129
    .line 130
    const v13, 0x3f8ccccd    # 1.1f

    .line 131
    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    const/high16 v15, 0x40000000    # 2.0f

    .line 135
    .line 136
    const v16, -0x4099999a    # -0.9f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x40000000    # -2.0f

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, -0x40733333    # -1.1f

    .line 151
    .line 152
    .line 153
    const v15, -0x4099999a    # -0.9f

    .line 154
    .line 155
    .line 156
    const/high16 v16, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, -0x3f400000    # -6.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40c00000    # 6.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41000000    # 8.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40800000    # 4.0f

    .line 180
    .line 181
    const/high16 v18, 0x41000000    # 8.0f

    .line 182
    .line 183
    const v13, 0x40b947ae    # 5.79f

    .line 184
    .line 185
    .line 186
    const/high16 v14, 0x40800000    # 4.0f

    .line 187
    .line 188
    const/high16 v15, 0x40800000    # 4.0f

    .line 189
    .line 190
    const v16, 0x40b947ae    # 5.79f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x40c00000    # 6.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x40000000    # 2.0f

    .line 202
    .line 203
    const/high16 v18, 0x40000000    # 2.0f

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const v14, 0x3f8ccccd    # 1.1f

    .line 207
    .line 208
    .line 209
    const v15, 0x3f666666    # 0.9f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x40000000    # 2.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x40000000    # 2.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x403b851f    # 2.93f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v18, -0x40cf5c29    # -0.69f

    .line 231
    .line 232
    .line 233
    const v13, -0x414ccccd    # -0.35f

    .line 234
    .line 235
    .line 236
    const v14, -0x41b33333    # -0.2f

    .line 237
    .line 238
    .line 239
    const v15, -0x40cf5c29    # -0.69f

    .line 240
    .line 241
    .line 242
    const v16, -0x4123d70a    # -0.43f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x405851ec    # -1.31f

    .line 249
    .line 250
    .line 251
    const v18, 0x3da3d70a    # 0.08f

    .line 252
    .line 253
    .line 254
    const v13, -0x413851ec    # -0.39f

    .line 255
    .line 256
    .line 257
    const v14, -0x415c28f6    # -0.32f

    .line 258
    .line 259
    .line 260
    const v15, -0x408a3d71    # -0.96f

    .line 261
    .line 262
    .line 263
    const v16, -0x4175c28f    # -0.27f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3da3d70a    # 0.08f

    .line 270
    .line 271
    .line 272
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 273
    .line 274
    const v13, -0x4128f5c3    # -0.42f

    .line 275
    .line 276
    .line 277
    const v14, 0x3ed70a3d    # 0.42f

    .line 278
    .line 279
    .line 280
    const v15, -0x413851ec    # -0.39f

    .line 281
    .line 282
    .line 283
    const v16, 0x3f8f5c29    # 1.12f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x41400000    # 12.0f

    .line 290
    .line 291
    const/high16 v18, 0x41b00000    # 22.0f

    .line 292
    .line 293
    const v13, 0x40ef0a3d    # 7.47f

    .line 294
    .line 295
    .line 296
    const v14, 0x41a970a4    # 21.18f

    .line 297
    .line 298
    .line 299
    const v15, 0x411a3d71    # 9.64f

    .line 300
    .line 301
    .line 302
    const/high16 v16, 0x41b00000    # 22.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x40c7ae14    # 6.24f

    .line 308
    .line 309
    .line 310
    const v18, -0x3ff47ae1    # -2.18f

    .line 311
    .line 312
    .line 313
    const v13, 0x40170a3d    # 2.36f

    .line 314
    .line 315
    .line 316
    const/4 v14, 0x0

    .line 317
    const v15, 0x4090f5c3    # 4.53f

    .line 318
    .line 319
    .line 320
    const v16, -0x40ae147b    # -0.82f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x41928f5c    # 18.32f

    .line 327
    .line 328
    .line 329
    const v18, 0x41928f5c    # 18.32f

    .line 330
    .line 331
    .line 332
    const v13, 0x4195ae14    # 18.71f

    .line 333
    .line 334
    .line 335
    const v14, 0x419b851f    # 19.44f

    .line 336
    .line 337
    .line 338
    const v15, 0x4195eb85    # 18.74f

    .line 339
    .line 340
    .line 341
    const v16, 0x4195eb85    # 18.74f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41600000    # 14.0f

    .line 351
    .line 352
    const/high16 v2, 0x419e0000    # 19.75f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41400000    # 12.0f

    .line 358
    .line 359
    const/high16 v18, 0x41a00000    # 20.0f

    .line 360
    .line 361
    const v13, 0x4155c28f    # 13.36f

    .line 362
    .line 363
    .line 364
    const v14, 0x419f47ae    # 19.91f

    .line 365
    .line 366
    .line 367
    const v15, 0x414b0a3d    # 12.69f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x41a00000    # 20.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x40000000    # -2.0f

    .line 376
    .line 377
    const/high16 v18, -0x41800000    # -0.25f

    .line 378
    .line 379
    const v13, -0x40cf5c29    # -0.69f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const v15, -0x4051eb85    # -1.36f

    .line 384
    .line 385
    .line 386
    const v16, -0x4247ae14    # -0.09f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41800000    # 16.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40800000    # 4.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x419e0000    # 19.75f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    const/16 v16, 0x3800

    .line 415
    .line 416
    const/16 v17, 0x0

    .line 417
    .line 418
    const/high16 v6, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/high16 v8, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/4 v7, 0x0

    .line 423
    const/high16 v9, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/high16 v12, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/CribKt;->_crib:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 440
    .line 441
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v0
.end method
