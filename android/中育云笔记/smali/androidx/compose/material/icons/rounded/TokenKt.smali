.class public final Landroidx/compose/material/icons/rounded/TokenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _token:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getToken(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TokenKt;->_token:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Token"

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
    const v0, 0x40228f5c    # 2.54f

    .line 71
    .line 72
    .line 73
    const v2, 0x414f851f    # 12.97f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4007ae14    # -1.94f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x40e66666    # -0.6f

    .line 85
    .line 86
    .line 87
    const v14, -0x4151eb85    # -0.34f

    .line 88
    .line 89
    .line 90
    const v15, -0x40547ae1    # -1.34f

    .line 91
    .line 92
    .line 93
    const v16, -0x4151eb85    # -0.34f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, -0x3f200000    # -7.0f

    .line 100
    .line 101
    const v2, 0x4078f5c3    # 3.89f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x4111999a    # 9.1f

    .line 108
    .line 109
    .line 110
    const v2, 0x4113d70a    # 9.24f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x41400000    # 12.0f

    .line 117
    .line 118
    const/high16 v18, 0x41000000    # 8.0f

    .line 119
    .line 120
    const v13, 0x411d47ae    # 9.83f

    .line 121
    .line 122
    .line 123
    const v14, 0x4107ae14    # 8.48f

    .line 124
    .line 125
    .line 126
    const v15, 0x412dc28f    # 10.86f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41000000    # 8.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x4039999a    # 2.9f

    .line 135
    .line 136
    .line 137
    const v2, 0x3f9eb852    # 1.24f

    .line 138
    .line 139
    .line 140
    const v4, 0x400ae148    # 2.17f

    .line 141
    .line 142
    .line 143
    const v6, 0x3ef5c28f    # 0.48f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x40a23d71    # 5.07f

    .line 150
    .line 151
    .line 152
    const v2, -0x3fcb851f    # -2.82f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x40228f5c    # 2.54f

    .line 159
    .line 160
    .line 161
    const v2, 0x414f851f    # 12.97f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41400000    # 12.0f

    .line 171
    .line 172
    const/high16 v2, 0x41200000    # 10.0f

    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x40000000    # 2.0f

    .line 178
    .line 179
    const/high16 v18, -0x40000000    # -2.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const v14, -0x40733333    # -1.1f

    .line 183
    .line 184
    .line 185
    const v15, 0x3f666666    # 0.9f

    .line 186
    .line 187
    .line 188
    const/high16 v16, -0x40000000    # -2.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x3f666666    # 0.9f

    .line 194
    .line 195
    .line 196
    const/high16 v2, 0x40000000    # 2.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, -0x4099999a    # -0.9f

    .line 202
    .line 203
    .line 204
    const/high16 v2, -0x40000000    # -2.0f

    .line 205
    .line 206
    const/high16 v4, 0x40000000    # 2.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x4151999a    # 13.1f

    .line 212
    .line 213
    .line 214
    const/high16 v2, 0x41400000    # 12.0f

    .line 215
    .line 216
    const/high16 v4, 0x41200000    # 10.0f

    .line 217
    .line 218
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x40400000    # 3.0f

    .line 225
    .line 226
    const v2, 0x41023d71    # 8.14f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x40a428f6    # 5.13f

    .line 233
    .line 234
    .line 235
    const v2, 0x40366666    # 2.85f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x41000000    # 8.0f

    .line 242
    .line 243
    const/high16 v18, 0x41400000    # 12.0f

    .line 244
    .line 245
    const v13, 0x4100a3d7    # 8.04f

    .line 246
    .line 247
    .line 248
    const v14, 0x4134f5c3    # 11.31f

    .line 249
    .line 250
    .line 251
    const/high16 v15, 0x41000000    # 8.0f

    .line 252
    .line 253
    const v16, 0x413a6666    # 11.65f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40400000    # 3.0f

    .line 260
    .line 261
    const v18, 0x4077ae14    # 3.87f

    .line 262
    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const v14, 0x3fee147b    # 1.86f

    .line 266
    .line 267
    .line 268
    const v15, 0x3fa28f5c    # 1.27f

    .line 269
    .line 270
    .line 271
    const v16, 0x405b851f    # 3.43f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x40b23d71    # 5.57f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, -0x3f20f5c3    # -6.97f

    .line 284
    .line 285
    .line 286
    const v2, -0x3f8851ec    # -3.87f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v18, 0x417d1eb8    # 15.82f

    .line 293
    .line 294
    .line 295
    const v13, 0x4058f5c3    # 3.39f

    .line 296
    .line 297
    .line 298
    const v14, 0x4189c28f    # 17.22f

    .line 299
    .line 300
    .line 301
    const/high16 v15, 0x40400000    # 3.0f

    .line 302
    .line 303
    const v16, 0x41846666    # 16.55f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x41023d71    # 8.14f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x41ab851f    # 21.44f

    .line 319
    .line 320
    .line 321
    const/high16 v2, 0x41500000    # 13.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x3f4dc28f    # -5.57f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v18, -0x3f8851ec    # -3.87f

    .line 333
    .line 334
    .line 335
    const v13, 0x3fdd70a4    # 1.73f

    .line 336
    .line 337
    .line 338
    const v14, -0x411eb852    # -0.44f

    .line 339
    .line 340
    .line 341
    const v16, -0x3fff5c29    # -2.01f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x41fae148    # -0.13f

    .line 348
    .line 349
    .line 350
    const v18, -0x407eb852    # -1.01f

    .line 351
    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const v14, -0x414ccccd    # -0.35f

    .line 355
    .line 356
    .line 357
    const v15, -0x42dc28f6    # -0.04f

    .line 358
    .line 359
    .line 360
    const v16, -0x40cf5c29    # -0.69f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41a80000    # 21.0f

    .line 367
    .line 368
    const v2, 0x41023d71    # 8.14f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/4 v0, 0x0

    .line 375
    const v2, 0x40f5c28f    # 7.68f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x407c28f6    # -1.03f

    .line 382
    .line 383
    .line 384
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 385
    .line 386
    const v14, 0x3f3ae148    # 0.73f

    .line 387
    .line 388
    .line 389
    const v15, -0x413851ec    # -0.39f

    .line 390
    .line 391
    .line 392
    const v16, 0x3fb33333    # 1.4f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x41ab851f    # 21.44f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41500000    # 13.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

    .line 427
    const/4 v15, 0x0

    .line 428
    const-string v4, ""

    .line 429
    .line 430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    sput-object v0, Landroidx/compose/material/icons/rounded/TokenKt;->_token:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    return-object v0
.end method
