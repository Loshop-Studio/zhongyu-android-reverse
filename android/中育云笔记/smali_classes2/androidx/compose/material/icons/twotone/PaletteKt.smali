.class public final Landroidx/compose/material/icons/twotone/PaletteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _palette:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPalette(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Palette"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x3f000000    # 0.5f

    .line 105
    .line 106
    const/high16 v26, -0x41000000    # -0.5f

    .line 107
    .line 108
    const v21, 0x3e8f5c29    # 0.28f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x3f000000    # 0.5f

    .line 112
    .line 113
    const v24, -0x419eb852    # -0.22f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x41f0a3d7    # -0.14f

    .line 120
    .line 121
    .line 122
    const v26, -0x414ccccd    # -0.35f

    .line 123
    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x41dc28f6    # -0.16f

    .line 128
    .line 129
    .line 130
    const v23, -0x425c28f6    # -0.08f

    .line 131
    .line 132
    .line 133
    const v24, -0x4170a3d7    # -0.28f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, -0x40deb852    # -0.63f

    .line 140
    .line 141
    .line 142
    const v26, -0x402ccccd    # -1.65f

    .line 143
    .line 144
    .line 145
    const v21, -0x412e147b    # -0.41f

    .line 146
    .line 147
    .line 148
    const v22, -0x41147ae1    # -0.46f

    .line 149
    .line 150
    .line 151
    const v23, -0x40deb852    # -0.63f

    .line 152
    .line 153
    .line 154
    const v24, -0x4079999a    # -1.05f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v25, 0x40200000    # 2.5f

    .line 161
    .line 162
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    const v22, -0x404f5c29    # -1.38f

    .line 167
    .line 168
    .line 169
    const v23, 0x3f8f5c29    # 1.12f

    .line 170
    .line 171
    .line 172
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x41800000    # 16.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x40800000    # 4.0f

    .line 183
    .line 184
    const/high16 v26, -0x3f800000    # -4.0f

    .line 185
    .line 186
    const v21, 0x400d70a4    # 2.21f

    .line 187
    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const/high16 v23, 0x40800000    # 4.0f

    .line 192
    .line 193
    const v24, -0x401ae148    # -1.79f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, 0x41400000    # 12.0f

    .line 200
    .line 201
    const/high16 v26, 0x40800000    # 4.0f

    .line 202
    .line 203
    const/high16 v21, 0x41a00000    # 20.0f

    .line 204
    .line 205
    const v22, 0x40e47ae1    # 7.14f

    .line 206
    .line 207
    .line 208
    const v23, 0x418347ae    # 16.41f

    .line 209
    .line 210
    .line 211
    const/high16 v24, 0x40800000    # 4.0f

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x41500000    # 13.0f

    .line 220
    .line 221
    const/high16 v6, 0x40d00000    # 6.5f

    .line 222
    .line 223
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x40a00000    # 5.0f

    .line 227
    .line 228
    const/high16 v26, 0x41380000    # 11.5f

    .line 229
    .line 230
    const v21, 0x40b570a4    # 5.67f

    .line 231
    .line 232
    .line 233
    const/high16 v22, 0x41500000    # 13.0f

    .line 234
    .line 235
    const/high16 v23, 0x40a00000    # 5.0f

    .line 236
    .line 237
    const v24, 0x414547ae    # 12.33f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x40b570a4    # 5.67f

    .line 244
    .line 245
    .line 246
    const/high16 v7, 0x41200000    # 10.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x412ab852    # 10.67f

    .line 252
    .line 253
    .line 254
    const/high16 v6, 0x41380000    # 11.5f

    .line 255
    .line 256
    const/high16 v7, 0x41000000    # 8.0f

    .line 257
    .line 258
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x40ea8f5c    # 7.33f

    .line 262
    .line 263
    .line 264
    const/high16 v6, 0x41500000    # 13.0f

    .line 265
    .line 266
    const/high16 v7, 0x40d00000    # 6.5f

    .line 267
    .line 268
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x41180000    # 9.5f

    .line 275
    .line 276
    const/high16 v6, 0x41100000    # 9.0f

    .line 277
    .line 278
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, 0x41000000    # 8.0f

    .line 282
    .line 283
    const/high16 v26, 0x40f00000    # 7.5f

    .line 284
    .line 285
    const v21, 0x410ab852    # 8.67f

    .line 286
    .line 287
    .line 288
    const/high16 v22, 0x41100000    # 9.0f

    .line 289
    .line 290
    const/high16 v23, 0x41000000    # 8.0f

    .line 291
    .line 292
    const v24, 0x410547ae    # 8.33f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x410ab852    # 8.67f

    .line 299
    .line 300
    .line 301
    const/high16 v6, 0x40c00000    # 6.0f

    .line 302
    .line 303
    const/high16 v7, 0x41180000    # 9.5f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, 0x40d570a4    # 6.67f

    .line 309
    .line 310
    .line 311
    const/high16 v6, 0x41300000    # 11.0f

    .line 312
    .line 313
    const/high16 v7, 0x40f00000    # 7.5f

    .line 314
    .line 315
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x412547ae    # 10.33f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x41180000    # 9.5f

    .line 322
    .line 323
    const/high16 v7, 0x41100000    # 9.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41680000    # 14.5f

    .line 332
    .line 333
    const/high16 v6, 0x41100000    # 9.0f

    .line 334
    .line 335
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x41500000    # 13.0f

    .line 339
    .line 340
    const v21, 0x415ab852    # 13.67f

    .line 341
    .line 342
    .line 343
    const/high16 v23, 0x41500000    # 13.0f

    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v4, 0x415ab852    # 13.67f

    .line 349
    .line 350
    .line 351
    const/high16 v6, 0x41680000    # 14.5f

    .line 352
    .line 353
    const/high16 v7, 0x40c00000    # 6.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, 0x40d570a4    # 6.67f

    .line 359
    .line 360
    .line 361
    const/high16 v6, 0x40f00000    # 7.5f

    .line 362
    .line 363
    const/high16 v7, 0x41800000    # 16.0f

    .line 364
    .line 365
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x417547ae    # 15.33f

    .line 369
    .line 370
    .line 371
    const/high16 v6, 0x41680000    # 14.5f

    .line 372
    .line 373
    const/high16 v7, 0x41100000    # 9.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41980000    # 19.0f

    .line 382
    .line 383
    const/high16 v6, 0x41380000    # 11.5f

    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v25, -0x40400000    # -1.5f

    .line 389
    .line 390
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const v22, 0x3f547ae1    # 0.83f

    .line 395
    .line 396
    .line 397
    const v23, -0x40d47ae1    # -0.67f

    .line 398
    .line 399
    .line 400
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x414547ae    # 12.33f

    .line 406
    .line 407
    .line 408
    const/high16 v7, 0x41800000    # 16.0f

    .line 409
    .line 410
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v4, 0x3f2b851f    # 0.67f

    .line 414
    .line 415
    .line 416
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 417
    .line 418
    const/high16 v7, -0x40400000    # -1.5f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, 0x412ab852    # 10.67f

    .line 424
    .line 425
    .line 426
    const/high16 v6, 0x41980000    # 19.0f

    .line 427
    .line 428
    const/high16 v7, 0x41380000    # 11.5f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    const/16 v16, 0x3800

    .line 441
    .line 442
    const/16 v17, 0x0

    .line 443
    .line 444
    const v6, 0x3e99999a    # 0.3f

    .line 445
    .line 446
    .line 447
    const v8, 0x3e99999a    # 0.3f

    .line 448
    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    const/high16 v9, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/high16 v12, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const/4 v14, 0x0

    .line 457
    const/4 v15, 0x0

    .line 458
    const-string v4, ""

    .line 459
    .line 460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 461
    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 468
    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    const/4 v2, 0x0

    .line 474
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 482
    .line 483
    .line 484
    move-result v11

    .line 485
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x40000000    # 2.0f

    .line 491
    .line 492
    const/high16 v6, 0x41400000    # 12.0f

    .line 493
    .line 494
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v25, 0x40000000    # 2.0f

    .line 498
    .line 499
    const/high16 v26, 0x41400000    # 12.0f

    .line 500
    .line 501
    const v21, 0x40cfae14    # 6.49f

    .line 502
    .line 503
    .line 504
    const/high16 v22, 0x40000000    # 2.0f

    .line 505
    .line 506
    const/high16 v23, 0x40000000    # 2.0f

    .line 507
    .line 508
    const v24, 0x40cfae14    # 6.49f

    .line 509
    .line 510
    .line 511
    move-object/from16 v20, v2

    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v4, 0x408fae14    # 4.49f

    .line 517
    .line 518
    .line 519
    const/high16 v6, 0x41200000    # 10.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v25, 0x40200000    # 2.5f

    .line 525
    .line 526
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 527
    .line 528
    const v21, 0x3fb0a3d7    # 1.38f

    .line 529
    .line 530
    .line 531
    const/16 v22, 0x0

    .line 532
    .line 533
    const/high16 v23, 0x40200000    # 2.5f

    .line 534
    .line 535
    const v24, -0x4070a3d7    # -1.12f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v25, -0x40dc28f6    # -0.64f

    .line 542
    .line 543
    .line 544
    const v26, -0x402a3d71    # -1.67f

    .line 545
    .line 546
    .line 547
    const/16 v21, 0x0

    .line 548
    .line 549
    const v22, -0x40e3d70a    # -0.61f

    .line 550
    .line 551
    .line 552
    const v23, -0x41947ae1    # -0.23f

    .line 553
    .line 554
    .line 555
    const v24, -0x40651eb8    # -1.21f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v25, -0x41fae148    # -0.13f

    .line 562
    .line 563
    .line 564
    const v26, -0x41570a3d    # -0.33f

    .line 565
    .line 566
    .line 567
    const v21, -0x425c28f6    # -0.08f

    .line 568
    .line 569
    .line 570
    const v22, -0x4247ae14    # -0.09f

    .line 571
    .line 572
    .line 573
    const v23, -0x41fae148    # -0.13f

    .line 574
    .line 575
    .line 576
    const v24, -0x41a8f5c3    # -0.21f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v25, 0x3f000000    # 0.5f

    .line 583
    .line 584
    const/high16 v26, -0x41000000    # -0.5f

    .line 585
    .line 586
    const/16 v21, 0x0

    .line 587
    .line 588
    const v22, -0x4170a3d7    # -0.28f

    .line 589
    .line 590
    .line 591
    const v23, 0x3e6147ae    # 0.22f

    .line 592
    .line 593
    .line 594
    const/high16 v24, -0x41000000    # -0.5f

    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x41800000    # 16.0f

    .line 600
    .line 601
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v25, 0x40c00000    # 6.0f

    .line 605
    .line 606
    const/high16 v26, -0x3f400000    # -6.0f

    .line 607
    .line 608
    const v21, 0x4053d70a    # 3.31f

    .line 609
    .line 610
    .line 611
    const/16 v22, 0x0

    .line 612
    .line 613
    const/high16 v23, 0x40c00000    # 6.0f

    .line 614
    .line 615
    const v24, -0x3fd3d70a    # -2.69f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v25, 0x41400000    # 12.0f

    .line 622
    .line 623
    const/high16 v26, 0x40000000    # 2.0f

    .line 624
    .line 625
    const/high16 v21, 0x41b00000    # 22.0f

    .line 626
    .line 627
    const v22, 0x40c147ae    # 6.04f

    .line 628
    .line 629
    .line 630
    const v23, 0x418c147b    # 17.51f

    .line 631
    .line 632
    .line 633
    const/high16 v24, 0x40000000    # 2.0f

    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v4, 0x41700000    # 15.0f

    .line 642
    .line 643
    const/high16 v6, 0x41800000    # 16.0f

    .line 644
    .line 645
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v4, -0x401d70a4    # -1.77f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 655
    .line 656
    const/high16 v26, 0x40200000    # 2.5f

    .line 657
    .line 658
    const v21, -0x404f5c29    # -1.38f

    .line 659
    .line 660
    .line 661
    const/16 v22, 0x0

    .line 662
    .line 663
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 664
    .line 665
    const v24, 0x3f8f5c29    # 1.12f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v25, 0x3f2147ae    # 0.63f

    .line 672
    .line 673
    .line 674
    const v26, 0x3fd33333    # 1.65f

    .line 675
    .line 676
    .line 677
    const/16 v21, 0x0

    .line 678
    .line 679
    const v22, 0x3f1c28f6    # 0.61f

    .line 680
    .line 681
    .line 682
    const v23, 0x3e6147ae    # 0.22f

    .line 683
    .line 684
    .line 685
    const v24, 0x3f9851ec    # 1.19f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v25, 0x3e0f5c29    # 0.14f

    .line 692
    .line 693
    .line 694
    const v26, 0x3eb33333    # 0.35f

    .line 695
    .line 696
    .line 697
    const v21, 0x3d75c28f    # 0.06f

    .line 698
    .line 699
    .line 700
    const v22, 0x3d8f5c29    # 0.07f

    .line 701
    .line 702
    .line 703
    const v23, 0x3e0f5c29    # 0.14f

    .line 704
    .line 705
    .line 706
    const v24, 0x3e428f5c    # 0.19f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v25, -0x41000000    # -0.5f

    .line 713
    .line 714
    const/high16 v26, 0x3f000000    # 0.5f

    .line 715
    .line 716
    const/16 v21, 0x0

    .line 717
    .line 718
    const v22, 0x3e8f5c29    # 0.28f

    .line 719
    .line 720
    .line 721
    const v23, -0x419eb852    # -0.22f

    .line 722
    .line 723
    .line 724
    const/high16 v24, 0x3f000000    # 0.5f

    .line 725
    .line 726
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v25, -0x3f000000    # -8.0f

    .line 730
    .line 731
    const/high16 v26, -0x3f000000    # -8.0f

    .line 732
    .line 733
    const v21, -0x3f72e148    # -4.41f

    .line 734
    .line 735
    .line 736
    const/16 v22, 0x0

    .line 737
    .line 738
    const/high16 v23, -0x3f000000    # -8.0f

    .line 739
    .line 740
    const v24, -0x3f9a3d71    # -3.59f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v4, -0x3f000000    # -8.0f

    .line 747
    .line 748
    const v6, 0x4065c28f    # 3.59f

    .line 749
    .line 750
    .line 751
    const/high16 v7, 0x41000000    # 8.0f

    .line 752
    .line 753
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v4, 0x4048f5c3    # 3.14f

    .line 757
    .line 758
    .line 759
    const/high16 v6, 0x40e00000    # 7.0f

    .line 760
    .line 761
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v25, 0x41800000    # 16.0f

    .line 765
    .line 766
    const/high16 v26, 0x41700000    # 15.0f

    .line 767
    .line 768
    const/high16 v21, 0x41a00000    # 20.0f

    .line 769
    .line 770
    const v22, 0x41535c29    # 13.21f

    .line 771
    .line 772
    .line 773
    const v23, 0x4191ae14    # 18.21f

    .line 774
    .line 775
    .line 776
    const/high16 v24, 0x41700000    # 15.0f

    .line 777
    .line 778
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    const/high16 v6, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/high16 v8, 0x3f800000    # 1.0f

    .line 791
    .line 792
    const/4 v7, 0x0

    .line 793
    const-string v4, ""

    .line 794
    .line 795
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 796
    .line 797
    .line 798
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 803
    .line 804
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 805
    .line 806
    .line 807
    move-result-wide v6

    .line 808
    const/4 v2, 0x0

    .line 809
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 813
    .line 814
    .line 815
    move-result v10

    .line 816
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 817
    .line 818
    .line 819
    move-result v11

    .line 820
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 823
    .line 824
    .line 825
    const/high16 v4, 0x40d00000    # 6.5f

    .line 826
    .line 827
    const/high16 v6, 0x41380000    # 11.5f

    .line 828
    .line 829
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/4 v4, 0x0

    .line 833
    const/high16 v6, -0x40400000    # -1.5f

    .line 834
    .line 835
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v26, 0x40400000    # 3.0f

    .line 839
    .line 840
    const/16 v27, 0x0

    .line 841
    .line 842
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 843
    .line 844
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 845
    .line 846
    const/16 v23, 0x0

    .line 847
    .line 848
    const/16 v24, 0x1

    .line 849
    .line 850
    const/16 v25, 0x1

    .line 851
    .line 852
    move-object/from16 v20, v2

    .line 853
    .line 854
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 858
    .line 859
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    const/high16 v6, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/4 v7, 0x0

    .line 869
    const-string v4, ""

    .line 870
    .line 871
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 872
    .line 873
    .line 874
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 875
    .line 876
    .line 877
    move-result v3

    .line 878
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 879
    .line 880
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 881
    .line 882
    .line 883
    move-result-wide v6

    .line 884
    const/4 v2, 0x0

    .line 885
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 889
    .line 890
    .line 891
    move-result v10

    .line 892
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 893
    .line 894
    .line 895
    move-result v11

    .line 896
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 899
    .line 900
    .line 901
    const/high16 v4, 0x40f00000    # 7.5f

    .line 902
    .line 903
    const/high16 v6, 0x41180000    # 9.5f

    .line 904
    .line 905
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const/4 v4, 0x0

    .line 909
    const/high16 v6, -0x40400000    # -1.5f

    .line 910
    .line 911
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v26, 0x40400000    # 3.0f

    .line 915
    .line 916
    move-object/from16 v20, v2

    .line 917
    .line 918
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 922
    .line 923
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    const/high16 v6, 0x3f800000    # 1.0f

    .line 931
    .line 932
    const/4 v7, 0x0

    .line 933
    const-string v4, ""

    .line 934
    .line 935
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 936
    .line 937
    .line 938
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 939
    .line 940
    .line 941
    move-result v3

    .line 942
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 943
    .line 944
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 945
    .line 946
    .line 947
    move-result-wide v6

    .line 948
    const/4 v2, 0x0

    .line 949
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 953
    .line 954
    .line 955
    move-result v10

    .line 956
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 957
    .line 958
    .line 959
    move-result v11

    .line 960
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 963
    .line 964
    .line 965
    const/high16 v4, 0x41680000    # 14.5f

    .line 966
    .line 967
    const/high16 v6, 0x40f00000    # 7.5f

    .line 968
    .line 969
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const/4 v4, 0x0

    .line 973
    const/high16 v6, -0x40400000    # -1.5f

    .line 974
    .line 975
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const/high16 v26, 0x40400000    # 3.0f

    .line 979
    .line 980
    move-object/from16 v20, v2

    .line 981
    .line 982
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 986
    .line 987
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    const/high16 v6, 0x3f800000    # 1.0f

    .line 995
    .line 996
    const/4 v7, 0x0

    .line 997
    const-string v4, ""

    .line 998
    .line 999
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1000
    .line 1001
    .line 1002
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1003
    .line 1004
    .line 1005
    move-result v3

    .line 1006
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1007
    .line 1008
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v6

    .line 1012
    const/4 v0, 0x0

    .line 1013
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1017
    .line 1018
    .line 1019
    move-result v10

    .line 1020
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1021
    .line 1022
    .line 1023
    move-result v11

    .line 1024
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1027
    .line 1028
    .line 1029
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1030
    .line 1031
    const/high16 v2, 0x41380000    # 11.5f

    .line 1032
    .line 1033
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const/4 v0, 0x0

    .line 1037
    const/high16 v2, -0x40400000    # -1.5f

    .line 1038
    .line 1039
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/high16 v18, 0x40400000    # 3.0f

    .line 1043
    .line 1044
    const/16 v19, 0x0

    .line 1045
    .line 1046
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 1047
    .line 1048
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 1049
    .line 1050
    const/16 v16, 0x1

    .line 1051
    .line 1052
    const/16 v17, 0x1

    .line 1053
    .line 1054
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 1058
    .line 1059
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    const/16 v16, 0x3800

    .line 1067
    .line 1068
    const/16 v17, 0x0

    .line 1069
    .line 1070
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1071
    .line 1072
    const/4 v7, 0x0

    .line 1073
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1074
    .line 1075
    const/4 v13, 0x0

    .line 1076
    const/4 v14, 0x0

    .line 1077
    const-string v4, ""

    .line 1078
    .line 1079
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    sput-object v0, Landroidx/compose/material/icons/twotone/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1088
    .line 1089
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1090
    .line 1091
    .line 1092
    return-object v0
.end method
