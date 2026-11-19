.class public final Landroidx/compose/material/icons/outlined/PersonOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PersonOffKt;->_personOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PersonOff"

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
    const v0, 0x41895c29    # 17.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a00000    # 20.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3fa851ec    # -3.37f

    .line 79
    .line 80
    .line 81
    const v2, -0x3fa7ae14    # -3.38f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x3fe28f5c    # 1.77f

    .line 88
    .line 89
    .line 90
    const v18, 0x3f428f5c    # 0.76f

    .line 91
    .line 92
    .line 93
    const v13, 0x3f23d70a    # 0.64f

    .line 94
    .line 95
    .line 96
    const v14, 0x3e6147ae    # 0.22f

    .line 97
    .line 98
    .line 99
    const v15, 0x3f9d70a4    # 1.23f

    .line 100
    .line 101
    .line 102
    const v16, 0x3ef5c28f    # 0.48f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x41a00000    # 20.0f

    .line 109
    .line 110
    const v18, 0x41895c29    # 17.17f

    .line 111
    .line 112
    .line 113
    const v13, 0x419af5c3    # 19.37f

    .line 114
    .line 115
    .line 116
    const v14, 0x4170f5c3    # 15.06f

    .line 117
    .line 118
    .line 119
    const v15, 0x419fd70a    # 19.98f

    .line 120
    .line 121
    .line 122
    const v16, 0x41808f5c    # 16.07f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x41a9851f    # 21.19f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x3fb47ae1    # 1.41f

    .line 138
    .line 139
    .line 140
    const v2, -0x404b851f    # -1.41f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x41895c29    # 17.17f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41a00000    # 20.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, -0x3fce147b    # -2.78f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3fce147b    # 1.61f

    .line 166
    .line 167
    .line 168
    const v18, -0x3fd5c28f    # -2.66f

    .line 169
    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const v14, -0x4070a3d7    # -1.12f

    .line 173
    .line 174
    .line 175
    const v15, 0x3f1c28f6    # 0.61f

    .line 176
    .line 177
    .line 178
    const v16, -0x3ff66666    # -2.15f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x409570a4    # 4.67f

    .line 185
    .line 186
    .line 187
    const v18, -0x40466666    # -1.45f

    .line 188
    .line 189
    .line 190
    const v13, 0x3fa51eb8    # 1.29f

    .line 191
    .line 192
    .line 193
    const v14, -0x40d70a3d    # -0.66f

    .line 194
    .line 195
    .line 196
    const v15, 0x4037ae14    # 2.87f

    .line 197
    .line 198
    .line 199
    const v16, -0x4063d70a    # -1.22f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x3fb1eb85    # 1.39f

    .line 206
    .line 207
    .line 208
    const v2, 0x40870a3d    # 4.22f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x3fb47ae1    # 1.41f

    .line 215
    .line 216
    .line 217
    const v2, -0x404b851f    # -1.41f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x41a9851f    # 21.19f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41900000    # 18.0f

    .line 233
    .line 234
    const v2, 0x4172b852    # 15.17f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, -0x41d1eb85    # -0.17f

    .line 246
    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    const v13, -0x428a3d71    # -0.06f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const v15, -0x421eb852    # -0.11f

    .line 255
    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, -0x3f50a3d7    # -5.48f

    .line 263
    .line 264
    .line 265
    const v18, 0x3fab851f    # 1.34f

    .line 266
    .line 267
    .line 268
    const v13, -0x3fe851ec    # -2.37f

    .line 269
    .line 270
    .line 271
    const v15, -0x3f76b852    # -4.29f

    .line 272
    .line 273
    .line 274
    const v16, 0x3f3ae148    # 0.73f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40c00000    # 6.0f

    .line 281
    .line 282
    const v18, 0x4189c28f    # 17.22f

    .line 283
    .line 284
    .line 285
    const v13, 0x40c66666    # 6.2f

    .line 286
    .line 287
    .line 288
    const/high16 v14, 0x41840000    # 16.5f

    .line 289
    .line 290
    const/high16 v15, 0x40c00000    # 6.0f

    .line 291
    .line 292
    const v16, 0x4186b852    # 16.84f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41900000    # 18.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x4172b852    # 15.17f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41400000    # 12.0f

    .line 313
    .line 314
    const/high16 v2, 0x40c00000    # 6.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x40000000    # 2.0f

    .line 320
    .line 321
    const/high16 v18, 0x40000000    # 2.0f

    .line 322
    .line 323
    const v13, 0x3f8ccccd    # 1.1f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x40000000    # 2.0f

    .line 328
    .line 329
    const v16, 0x3f666666    # 0.9f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, -0x4059999a    # -1.3f

    .line 336
    .line 337
    .line 338
    const v18, 0x3fef5c29    # 1.87f

    .line 339
    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const v14, 0x3f5c28f6    # 0.86f

    .line 343
    .line 344
    .line 345
    const v15, -0x40f5c28f    # -0.54f

    .line 346
    .line 347
    .line 348
    const v16, 0x3fcb851f    # 1.59f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3fbd70a4    # 1.48f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41800000    # 16.0f

    .line 361
    .line 362
    const/high16 v18, 0x41000000    # 8.0f

    .line 363
    .line 364
    const v13, 0x41747ae1    # 15.28f

    .line 365
    .line 366
    .line 367
    const v14, 0x412a3d71    # 10.64f

    .line 368
    .line 369
    .line 370
    const/high16 v15, 0x41800000    # 16.0f

    .line 371
    .line 372
    const v16, 0x41166666    # 9.4f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x3f800000    # -4.0f

    .line 379
    .line 380
    const/high16 v18, -0x3f800000    # -4.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const v14, -0x3ff28f5c    # -2.21f

    .line 384
    .line 385
    .line 386
    const v15, -0x401ae148    # -1.79f

    .line 387
    .line 388
    .line 389
    const/high16 v16, -0x3f800000    # -4.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x3fa9999a    # -3.35f

    .line 395
    .line 396
    .line 397
    const v18, 0x3fe8f5c3    # 1.82f

    .line 398
    .line 399
    .line 400
    const v13, -0x404ccccd    # -1.4f

    .line 401
    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const v15, -0x3fd70a3d    # -2.64f

    .line 405
    .line 406
    .line 407
    const v16, 0x3f3851ec    # 0.72f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41400000    # 12.0f

    .line 417
    .line 418
    const/high16 v18, 0x40c00000    # 6.0f

    .line 419
    .line 420
    const v13, 0x41268f5c    # 10.41f

    .line 421
    .line 422
    .line 423
    const v14, 0x40d147ae    # 6.54f

    .line 424
    .line 425
    .line 426
    const v15, 0x41323d71    # 11.14f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x40c00000    # 6.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const/16 v16, 0x3800

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/high16 v6, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v8, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    const/high16 v9, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/high16 v12, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Landroidx/compose/material/icons/outlined/PersonOffKt;->_personOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v0
.end method
