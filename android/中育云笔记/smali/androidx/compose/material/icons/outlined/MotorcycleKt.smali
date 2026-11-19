.class public final Landroidx/compose/material/icons/outlined/MotorcycleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotorcycle(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MotorcycleKt;->_motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Motorcycle"

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
    const v0, 0x414b851f    # 12.72f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, -0x40000000    # -2.0f

    .line 79
    .line 80
    const/high16 v2, 0x40000000    # 2.0f

    .line 81
    .line 82
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v0, -0x40bae148    # -0.77f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, -0x41800000    # -0.25f

    .line 92
    .line 93
    const v2, -0x40cf5c29    # -0.69f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x40c7ae14    # -0.72f

    .line 100
    .line 101
    .line 102
    const v18, -0x405851ec    # -1.31f

    .line 103
    .line 104
    .line 105
    const v13, -0x41c7ae14    # -0.18f

    .line 106
    .line 107
    .line 108
    const v14, -0x410a3d71    # -0.48f

    .line 109
    .line 110
    .line 111
    const v15, -0x4128f5c3    # -0.42f

    .line 112
    .line 113
    .line 114
    const v16, -0x40947ae1    # -0.92f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x406f5c29    # 3.74f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x402c28f6    # 2.69f

    .line 127
    .line 128
    .line 129
    const/high16 v2, -0x3f400000    # -6.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41300000    # 11.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x4065c28f    # 3.59f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x40000000    # 2.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x40a00000    # 5.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v17, -0x3f600000    # -5.0f

    .line 161
    .line 162
    const/high16 v18, 0x40a00000    # 5.0f

    .line 163
    .line 164
    const v13, -0x3fcccccd    # -2.8f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const/high16 v15, -0x3f600000    # -5.0f

    .line 169
    .line 170
    const v16, 0x400ccccd    # 2.2f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x400ccccd    # 2.2f

    .line 177
    .line 178
    .line 179
    const/high16 v2, 0x40a00000    # 5.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x409ccccd    # 4.9f

    .line 185
    .line 186
    .line 187
    const/high16 v18, -0x3f800000    # -4.0f

    .line 188
    .line 189
    const v13, 0x401d70a4    # 2.46f

    .line 190
    .line 191
    .line 192
    const v15, 0x408e6666    # 4.45f

    .line 193
    .line 194
    .line 195
    const v16, -0x4027ae14    # -1.69f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x3fd33333    # 1.65f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x403147ae    # 2.77f

    .line 208
    .line 209
    .line 210
    const v2, -0x3fceb852    # -2.77f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, -0x415c28f6    # -0.32f

    .line 217
    .line 218
    .line 219
    const v18, 0x3fe28f5c    # 1.77f

    .line 220
    .line 221
    .line 222
    const v13, -0x41a8f5c3    # -0.21f

    .line 223
    .line 224
    .line 225
    const v14, 0x3f0a3d71    # 0.54f

    .line 226
    .line 227
    .line 228
    const v15, -0x415c28f6    # -0.32f

    .line 229
    .line 230
    .line 231
    const v16, 0x3f91eb85    # 1.14f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x40a00000    # 5.0f

    .line 238
    .line 239
    const/high16 v18, 0x40a00000    # 5.0f

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x40333333    # 2.8f

    .line 243
    .line 244
    .line 245
    const v15, 0x400ccccd    # 2.2f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x40a00000    # 5.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x3ff33333    # -2.2f

    .line 254
    .line 255
    .line 256
    const/high16 v2, -0x3f600000    # -5.0f

    .line 257
    .line 258
    const/high16 v4, 0x40a00000    # 5.0f

    .line 259
    .line 260
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x3f6e147b    # -4.56f

    .line 264
    .line 265
    .line 266
    const v18, -0x3f60f5c3    # -4.97f

    .line 267
    .line 268
    .line 269
    const v14, -0x3fd66666    # -2.65f

    .line 270
    .line 271
    .line 272
    const v15, -0x4003d70a    # -1.97f

    .line 273
    .line 274
    .line 275
    const v16, -0x3f675c29    # -4.77f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x41768f5c    # 15.41f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x40a00000    # 5.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41980000    # 19.0f

    .line 293
    .line 294
    const/high16 v2, 0x41880000    # 17.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 300
    .line 301
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 302
    .line 303
    const v13, -0x402b851f    # -1.66f

    .line 304
    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 308
    .line 309
    const v16, -0x40547ae1    # -1.34f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x3fab851f    # 1.34f

    .line 316
    .line 317
    .line 318
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 319
    .line 320
    const/high16 v4, 0x40400000    # 3.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v2, 0x40400000    # 3.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x40547ae1    # -1.34f

    .line 331
    .line 332
    .line 333
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41880000    # 17.0f

    .line 342
    .line 343
    const/high16 v2, 0x40a00000    # 5.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v13, -0x402f5c29    # -1.63f

    .line 349
    .line 350
    .line 351
    const v16, -0x4050a3d7    # -1.37f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3faf5c29    # 1.37f

    .line 358
    .line 359
    .line 360
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x40347ae1    # 2.82f

    .line 366
    .line 367
    .line 368
    const/high16 v18, 0x40000000    # 2.0f

    .line 369
    .line 370
    const v13, 0x3fa3d70a    # 1.28f

    .line 371
    .line 372
    .line 373
    const v15, 0x4019999a    # 2.4f

    .line 374
    .line 375
    .line 376
    const v16, 0x3f59999a    # 0.85f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x40a00000    # 5.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40000000    # 2.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x40347ae1    # 2.82f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x40a00000    # 5.0f

    .line 399
    .line 400
    const/high16 v18, 0x41880000    # 17.0f

    .line 401
    .line 402
    const v13, 0x40eccccd    # 7.4f

    .line 403
    .line 404
    .line 405
    const v14, 0x41813333    # 16.15f

    .line 406
    .line 407
    .line 408
    const v15, 0x40c8f5c3    # 6.28f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x41880000    # 17.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/16 v16, 0x3800

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/high16 v6, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/high16 v8, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    const/high16 v9, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/high16 v12, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    const/4 v15, 0x0

    .line 439
    const-string v4, ""

    .line 440
    .line 441
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    sput-object v0, Landroidx/compose/material/icons/outlined/MotorcycleKt;->_motorcycle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 450
    .line 451
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    return-object v0
.end method
