.class public final Landroidx/compose/material/icons/filled/PanoramaVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaVertical(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaVertical"

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
    const v0, 0x419f851f    # 19.94f

    .line 71
    .line 72
    .line 73
    const v2, 0x41a8f5c3    # 21.12f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x402e147b    # -1.64f

    .line 80
    .line 81
    .line 82
    const v18, -0x3eee147b    # -9.12f

    .line 83
    .line 84
    .line 85
    const v13, -0x40733333    # -1.1f

    .line 86
    .line 87
    .line 88
    const v14, -0x3fc3d70a    # -2.94f

    .line 89
    .line 90
    .line 91
    const v15, -0x402e147b    # -1.64f

    .line 92
    .line 93
    .line 94
    const v16, -0x3f3f0a3d    # -6.03f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3fd1eb85    # 1.64f

    .line 101
    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const v14, -0x3fba3d71    # -3.09f

    .line 105
    .line 106
    .line 107
    const v15, 0x3f0ccccd    # 0.55f

    .line 108
    .line 109
    .line 110
    const v16, -0x3f3a3d71    # -6.18f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3d75c28f    # 0.06f

    .line 117
    .line 118
    .line 119
    const v18, -0x416147ae    # -0.31f

    .line 120
    .line 121
    .line 122
    const v13, 0x3d23d70a    # 0.04f

    .line 123
    .line 124
    .line 125
    const v14, -0x421eb852    # -0.11f

    .line 126
    .line 127
    .line 128
    const v15, 0x3d75c28f    # 0.06f

    .line 129
    .line 130
    .line 131
    const v16, -0x419eb852    # -0.22f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x40deb852    # -0.63f

    .line 138
    .line 139
    .line 140
    const v18, -0x40ee147b    # -0.57f

    .line 141
    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x4151eb85    # -0.34f

    .line 145
    .line 146
    .line 147
    const v15, -0x41947ae1    # -0.23f

    .line 148
    .line 149
    .line 150
    const v16, -0x40ee147b    # -0.57f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x409428f6    # 4.63f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v18, 0x3f11eb85    # 0.57f

    .line 163
    .line 164
    .line 165
    const v13, -0x41333333    # -0.4f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const v15, -0x40deb852    # -0.63f

    .line 170
    .line 171
    .line 172
    const v16, 0x3e6b851f    # 0.23f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x3d75c28f    # 0.06f

    .line 179
    .line 180
    .line 181
    const v18, 0x3e9eb852    # 0.31f

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, 0x3dcccccd    # 0.1f

    .line 186
    .line 187
    .line 188
    const v15, 0x3ca3d70a    # 0.02f

    .line 189
    .line 190
    .line 191
    const v16, 0x3e4ccccd    # 0.2f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x40b6b852    # 5.71f

    .line 198
    .line 199
    .line 200
    const/high16 v18, 0x41400000    # 12.0f

    .line 201
    .line 202
    const v13, 0x40a51eb8    # 5.16f

    .line 203
    .line 204
    .line 205
    const v14, 0x40ba3d71    # 5.82f

    .line 206
    .line 207
    .line 208
    const v15, 0x40b6b852    # 5.71f

    .line 209
    .line 210
    .line 211
    const v16, 0x410e8f5c    # 8.91f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, -0x402e147b    # -1.64f

    .line 218
    .line 219
    .line 220
    const v18, 0x4111eb85    # 9.12f

    .line 221
    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, 0x4045c28f    # 3.09f

    .line 225
    .line 226
    .line 227
    const v15, -0x40f33333    # -0.55f

    .line 228
    .line 229
    .line 230
    const v16, 0x40c5c28f    # 6.18f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x4270a3d7    # -0.07f

    .line 237
    .line 238
    .line 239
    const v18, 0x3e9eb852    # 0.31f

    .line 240
    .line 241
    .line 242
    const v13, -0x42b33333    # -0.05f

    .line 243
    .line 244
    .line 245
    const v14, 0x3de147ae    # 0.11f

    .line 246
    .line 247
    .line 248
    const v15, -0x4270a3d7    # -0.07f

    .line 249
    .line 250
    .line 251
    const v16, 0x3e6147ae    # 0.22f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3f2147ae    # 0.63f

    .line 258
    .line 259
    .line 260
    const v18, 0x3f11eb85    # 0.57f

    .line 261
    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x3ea8f5c3    # 0.33f

    .line 265
    .line 266
    .line 267
    const v15, 0x3e6b851f    # 0.23f

    .line 268
    .line 269
    .line 270
    const v16, 0x3f11eb85    # 0.57f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x416c0000    # 14.75f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v18, -0x40ee147b    # -0.57f

    .line 282
    .line 283
    .line 284
    const v13, 0x3ec7ae14    # 0.39f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, 0x3f2147ae    # 0.63f

    .line 289
    .line 290
    .line 291
    const v16, -0x418a3d71    # -0.24f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x4270a3d7    # -0.07f

    .line 298
    .line 299
    .line 300
    const v18, -0x416147ae    # -0.31f

    .line 301
    .line 302
    .line 303
    const v13, -0x43dc28f6    # -0.01f

    .line 304
    .line 305
    .line 306
    const v14, -0x42333333    # -0.1f

    .line 307
    .line 308
    .line 309
    const v15, -0x430a3d71    # -0.03f

    .line 310
    .line 311
    .line 312
    const v16, -0x41b33333    # -0.2f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41a00000    # 20.0f

    .line 322
    .line 323
    const v2, 0x40d147ae    # 6.54f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3f947ae1    # 1.16f

    .line 330
    .line 331
    .line 332
    const/high16 v18, -0x3f000000    # -8.0f

    .line 333
    .line 334
    const v13, 0x3f451eb8    # 0.77f

    .line 335
    .line 336
    .line 337
    const v14, -0x3fd9999a    # -2.6f

    .line 338
    .line 339
    .line 340
    const v15, 0x3f947ae1    # 1.16f

    .line 341
    .line 342
    .line 343
    const v16, -0x3f570a3d    # -5.28f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x406b851f    # -1.16f

    .line 350
    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const v14, -0x3fd1eb85    # -2.72f

    .line 354
    .line 355
    .line 356
    const v15, -0x413851ec    # -0.39f

    .line 357
    .line 358
    .line 359
    const v16, -0x3f533333    # -5.4f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x412e8f5c    # 10.91f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v18, 0x41000000    # 8.0f

    .line 372
    .line 373
    const v13, -0x40bae148    # -0.77f

    .line 374
    .line 375
    .line 376
    const v14, 0x40266666    # 2.6f

    .line 377
    .line 378
    .line 379
    const v15, -0x406b851f    # -1.16f

    .line 380
    .line 381
    .line 382
    const v16, 0x40a8f5c3    # 5.28f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, 0x3f947ae1    # 1.16f

    .line 389
    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, 0x402e147b    # 2.72f

    .line 393
    .line 394
    .line 395
    const v15, 0x3ec7ae14    # 0.39f

    .line 396
    .line 397
    .line 398
    const v16, 0x40accccd    # 5.4f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x40d147ae    # 6.54f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const/16 v16, 0x3800

    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const/high16 v6, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v8, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const/high16 v9, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/high16 v12, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const-string v4, ""

    .line 433
    .line 434
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return-object v0
.end method
