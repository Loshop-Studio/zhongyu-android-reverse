.class public final Landroidx/compose/material/icons/twotone/KeyOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/KeyOffKt;->_keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.KeyOff"

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
    const v4, 0x41587ae1    # 13.53f

    .line 71
    .line 72
    .line 73
    const v6, 0x412b3333    # 10.7f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x40251eb8    # -1.71f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v25, 0x41100000    # 9.0f

    .line 86
    .line 87
    const/high16 v26, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v21, 0x41100000    # 9.0f

    .line 90
    .line 91
    const v22, 0x413e147b    # 11.88f

    .line 92
    .line 93
    .line 94
    const/high16 v23, 0x41100000    # 9.0f

    .line 95
    .line 96
    const v24, 0x413f0a3d    # 11.94f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v26, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, -0x4099999a    # -0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, -0x4099999a    # -0.9f

    .line 122
    .line 123
    .line 124
    const/high16 v6, -0x40000000    # -2.0f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v6, 0x3f666666    # 0.9f

    .line 132
    .line 133
    .line 134
    const/high16 v7, -0x40000000    # -2.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x3e3851ec    # 0.18f

    .line 140
    .line 141
    .line 142
    const v26, 0x3c23d70a    # 0.01f

    .line 143
    .line 144
    .line 145
    const v21, 0x3d75c28f    # 0.06f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const v23, 0x3df5c28f    # 0.12f

    .line 151
    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x4104cccd    # 8.3f

    .line 159
    .line 160
    .line 161
    const v6, 0x40af0a3d    # 5.47f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x40400000    # 3.0f

    .line 168
    .line 169
    const/high16 v26, 0x41400000    # 12.0f

    .line 170
    .line 171
    const v21, 0x4080a3d7    # 4.02f

    .line 172
    .line 173
    .line 174
    const v22, 0x410e6666    # 8.9f

    .line 175
    .line 176
    .line 177
    const/high16 v23, 0x40400000    # 3.0f

    .line 178
    .line 179
    const v24, 0x412547ae    # 10.33f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, 0x40800000    # 4.0f

    .line 186
    .line 187
    const/high16 v26, 0x40800000    # 4.0f

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const v22, 0x400d70a4    # 2.21f

    .line 192
    .line 193
    .line 194
    const v23, 0x3fe51eb8    # 1.79f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x40800000    # 4.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v25, 0x412b3333    # 10.7f

    .line 203
    .line 204
    .line 205
    const v26, 0x41587ae1    # 13.53f

    .line 206
    .line 207
    .line 208
    const v21, 0x410ab852    # 8.67f

    .line 209
    .line 210
    .line 211
    const/high16 v22, 0x41800000    # 16.0f

    .line 212
    .line 213
    const v23, 0x4121999a    # 10.1f

    .line 214
    .line 215
    .line 216
    const v24, 0x416fae14    # 14.98f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x4156e148    # 13.43f

    .line 226
    .line 227
    .line 228
    const v6, 0x4182147b    # 16.26f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, -0x4091eb85    # -0.93f

    .line 235
    .line 236
    .line 237
    const v6, 0x3f9eb852    # 1.24f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x3fae147b    # 1.36f

    .line 244
    .line 245
    .line 246
    const v6, 0x3fe7ae14    # 1.81f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x41400000    # 12.0f

    .line 253
    .line 254
    const v6, 0x41a95c29    # 21.17f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, -0x40800000    # -1.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, -0x3f351eb8    # -6.34f

    .line 266
    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x4156e148    # 13.43f

    .line 273
    .line 274
    .line 275
    const v6, 0x4182147b    # 16.26f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/16 v16, 0x3800

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const v6, 0x3e99999a    # 0.3f

    .line 293
    .line 294
    .line 295
    const v8, 0x3e99999a    # 0.3f

    .line 296
    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    const/high16 v9, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/high16 v12, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const v0, 0x41587ae1    # 13.53f

    .line 339
    .line 340
    .line 341
    const v2, 0x412b3333    # 10.7f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x40251eb8    # -1.71f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x41100000    # 9.0f

    .line 354
    .line 355
    const/high16 v18, 0x41400000    # 12.0f

    .line 356
    .line 357
    const/high16 v13, 0x41100000    # 9.0f

    .line 358
    .line 359
    const v14, 0x413e147b    # 11.88f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x41100000    # 9.0f

    .line 363
    .line 364
    const v16, 0x413f0a3d    # 11.94f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x40000000    # -2.0f

    .line 371
    .line 372
    const/high16 v18, 0x40000000    # 2.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x3f8ccccd    # 1.1f

    .line 376
    .line 377
    .line 378
    const v15, -0x4099999a    # -0.9f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x40000000    # 2.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x4099999a    # -0.9f

    .line 387
    .line 388
    .line 389
    const/high16 v2, -0x40000000    # -2.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x40000000    # 2.0f

    .line 395
    .line 396
    const v2, 0x3f666666    # 0.9f

    .line 397
    .line 398
    .line 399
    const/high16 v4, -0x40000000    # -2.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3e3851ec    # 0.18f

    .line 405
    .line 406
    .line 407
    const v18, 0x3c23d70a    # 0.01f

    .line 408
    .line 409
    .line 410
    const v13, 0x3d75c28f    # 0.06f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, 0x3df5c28f    # 0.12f

    .line 415
    .line 416
    .line 417
    const/16 v16, 0x0

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x4104cccd    # 8.3f

    .line 423
    .line 424
    .line 425
    const v2, 0x40af0a3d    # 5.47f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x40400000    # 3.0f

    .line 432
    .line 433
    const/high16 v18, 0x41400000    # 12.0f

    .line 434
    .line 435
    const v13, 0x4080a3d7    # 4.02f

    .line 436
    .line 437
    .line 438
    const v14, 0x410e6666    # 8.9f

    .line 439
    .line 440
    .line 441
    const/high16 v15, 0x40400000    # 3.0f

    .line 442
    .line 443
    const v16, 0x412547ae    # 10.33f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x40800000    # 4.0f

    .line 450
    .line 451
    const/high16 v18, 0x40800000    # 4.0f

    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const v14, 0x400d70a4    # 2.21f

    .line 455
    .line 456
    .line 457
    const v15, 0x3fe51eb8    # 1.79f

    .line 458
    .line 459
    .line 460
    const/high16 v16, 0x40800000    # 4.0f

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, 0x412b3333    # 10.7f

    .line 466
    .line 467
    .line 468
    const v18, 0x41587ae1    # 13.53f

    .line 469
    .line 470
    .line 471
    const v13, 0x410ab852    # 8.67f

    .line 472
    .line 473
    .line 474
    const/high16 v14, 0x41800000    # 16.0f

    .line 475
    .line 476
    const v15, 0x4121999a    # 10.1f

    .line 477
    .line 478
    .line 479
    const v16, 0x416fae14    # 14.98f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x41430a3d    # 12.19f

    .line 489
    .line 490
    .line 491
    const v2, 0x417051ec    # 15.02f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x40e00000    # 7.0f

    .line 498
    .line 499
    const/high16 v18, 0x41900000    # 18.0f

    .line 500
    .line 501
    const v13, 0x41326666    # 11.15f

    .line 502
    .line 503
    .line 504
    const v14, 0x41866666    # 16.8f

    .line 505
    .line 506
    .line 507
    const v15, 0x41135c29    # 9.21f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x41900000    # 18.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, -0x3f400000    # -6.0f

    .line 516
    .line 517
    const/high16 v18, -0x3f400000    # -6.0f

    .line 518
    .line 519
    const v13, -0x3fac28f6    # -3.31f

    .line 520
    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    const/high16 v15, -0x3f400000    # -6.0f

    .line 524
    .line 525
    const v16, -0x3fd3d70a    # -2.69f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x403eb852    # 2.98f

    .line 532
    .line 533
    .line 534
    const v18, -0x3f59eb85    # -5.19f

    .line 535
    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const v14, -0x3ff28f5c    # -2.21f

    .line 539
    .line 540
    .line 541
    const v15, 0x3f99999a    # 1.2f

    .line 542
    .line 543
    .line 544
    const v16, -0x3f7b3333    # -4.15f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x3fb1eb85    # 1.39f

    .line 551
    .line 552
    .line 553
    const v2, 0x40870a3d    # 4.22f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3fb47ae1    # 1.41f

    .line 560
    .line 561
    .line 562
    const v2, -0x404b851f    # -1.41f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x41930a3d    # 18.38f

    .line 569
    .line 570
    .line 571
    const v2, 0x41930a3d    # 18.38f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x404b851f    # -1.41f

    .line 578
    .line 579
    .line 580
    const v2, 0x3fb47ae1    # 1.41f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x41430a3d    # 12.19f

    .line 587
    .line 588
    .line 589
    const v2, 0x417051ec    # 15.02f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x4156e148    # 13.43f

    .line 599
    .line 600
    .line 601
    const v2, 0x4182147b    # 16.26f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, -0x4091eb85    # -0.93f

    .line 608
    .line 609
    .line 610
    const v2, 0x3f9eb852    # 1.24f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x3fae147b    # 1.36f

    .line 617
    .line 618
    .line 619
    const v2, 0x3fe7ae14    # 1.81f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x41400000    # 12.0f

    .line 626
    .line 627
    const v2, 0x41a95c29    # 21.17f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, -0x40800000    # -1.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, -0x3f351eb8    # -6.34f

    .line 639
    .line 640
    .line 641
    const/4 v2, 0x0

    .line 642
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, -0x40000000    # -2.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41a80000    # 21.0f

    .line 651
    .line 652
    const/high16 v2, 0x41100000    # 9.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/4 v0, 0x0

    .line 658
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v0, 0x40400000    # 3.0f

    .line 662
    .line 663
    const/high16 v2, 0x40400000    # 3.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, -0x3f700000    # -4.5f

    .line 669
    .line 670
    const/high16 v2, 0x40900000    # 4.5f

    .line 671
    .line 672
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, -0x40cf5c29    # -0.69f

    .line 676
    .line 677
    .line 678
    const v2, -0x40fd70a4    # -0.51f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x4156e148    # 13.43f

    .line 685
    .line 686
    .line 687
    const v2, 0x4182147b    # 16.26f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v8, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    const/high16 v12, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v14, 0x0

    .line 712
    const/4 v15, 0x0

    .line 713
    const-string v4, ""

    .line 714
    .line 715
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    sput-object v0, Landroidx/compose/material/icons/twotone/KeyOffKt;->_keyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 724
    .line 725
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    return-object v0
.end method
