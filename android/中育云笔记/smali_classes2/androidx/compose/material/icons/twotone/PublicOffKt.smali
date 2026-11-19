.class public final Landroidx/compose/material/icons/twotone/PublicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPublicOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PublicOffKt;->_publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PublicOff"

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
    const v4, 0x4102b852    # 8.17f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40fc28f6    # 7.88f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41a00000    # 20.0f

    .line 85
    .line 86
    const/high16 v26, 0x41400000    # 12.0f

    .line 87
    .line 88
    const v21, 0x419cb852    # 19.59f

    .line 89
    .line 90
    .line 91
    const v22, 0x416deb85    # 14.87f

    .line 92
    .line 93
    .line 94
    const/high16 v23, 0x41a00000    # 20.0f

    .line 95
    .line 96
    const v24, 0x4157ae14    # 13.48f

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
    const/high16 v25, -0x3f600000    # -5.0f

    .line 105
    .line 106
    const v26, -0x3f12e148    # -7.41f

    .line 107
    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const v22, -0x3fa9999a    # -3.35f

    .line 112
    .line 113
    .line 114
    const v23, -0x3ffb851f    # -2.07f

    .line 115
    .line 116
    .line 117
    const v24, -0x3f38f5c3    # -6.22f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40a00000    # 5.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, -0x40000000    # -2.0f

    .line 129
    .line 130
    const/high16 v26, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v22, 0x3f8ccccd    # 1.1f

    .line 133
    .line 134
    .line 135
    const v23, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x40000000    # 2.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, -0x40000000    # -2.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x4102b852    # 8.17f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x41900000    # 18.0f

    .line 158
    .line 159
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v26, -0x40000000    # -2.0f

    .line 163
    .line 164
    const v21, -0x40733333    # -1.1f

    .line 165
    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const/high16 v23, -0x40000000    # -2.0f

    .line 170
    .line 171
    const v24, -0x4099999a    # -0.9f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x3f66b852    # -4.79f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x40800000    # 4.0f

    .line 189
    .line 190
    const/high16 v26, 0x41400000    # 12.0f

    .line 191
    .line 192
    const v21, 0x40828f5c    # 4.08f

    .line 193
    .line 194
    .line 195
    const v22, 0x412ca3d7    # 10.79f

    .line 196
    .line 197
    .line 198
    const/high16 v23, 0x40800000    # 4.0f

    .line 199
    .line 200
    const v24, 0x4136147b    # 11.38f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x40e00000    # 7.0f

    .line 207
    .line 208
    const v26, 0x40fdc28f    # 7.93f

    .line 209
    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const v22, 0x40828f5c    # 4.08f

    .line 214
    .line 215
    .line 216
    const v23, 0x40433333    # 3.05f

    .line 217
    .line 218
    .line 219
    const v24, 0x40ee147b    # 7.44f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x41900000    # 18.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const/16 v16, 0x3800

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const v6, 0x3e99999a    # 0.3f

    .line 242
    .line 243
    .line 244
    const v8, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const/high16 v9, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v12, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const/4 v14, 0x0

    .line 254
    const/4 v15, 0x0

    .line 255
    const-string v4, ""

    .line 256
    .line 257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    const/4 v0, 0x0

    .line 271
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const v0, 0x4102b852    # 8.17f

    .line 288
    .line 289
    .line 290
    const/high16 v2, 0x41300000    # 11.0f

    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x40cfae14    # 6.49f

    .line 296
    .line 297
    .line 298
    const v2, 0x406a3d71    # 3.66f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x41400000    # 12.0f

    .line 305
    .line 306
    const/high16 v18, 0x40000000    # 2.0f

    .line 307
    .line 308
    const v13, 0x41011eb8    # 8.07f

    .line 309
    .line 310
    .line 311
    const v14, 0x40270a3d    # 2.61f

    .line 312
    .line 313
    .line 314
    const v15, 0x411f5c29    # 9.96f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x40000000    # 2.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x41200000    # 10.0f

    .line 323
    .line 324
    const/high16 v18, 0x41200000    # 10.0f

    .line 325
    .line 326
    const v13, 0x40b0a3d7    # 5.52f

    .line 327
    .line 328
    .line 329
    const/4 v14, 0x0

    .line 330
    const/high16 v15, 0x41200000    # 10.0f

    .line 331
    .line 332
    const v16, 0x408f5c29    # 4.48f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x402b851f    # -1.66f

    .line 339
    .line 340
    .line 341
    const v18, 0x40b051ec    # 5.51f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, 0x40028f5c    # 2.04f

    .line 346
    .line 347
    .line 348
    const v15, -0x40e3d70a    # -0.61f

    .line 349
    .line 350
    .line 351
    const v16, 0x407b851f    # 3.93f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x40451eb8    # -1.46f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x41a00000    # 20.0f

    .line 364
    .line 365
    const/high16 v18, 0x41400000    # 12.0f

    .line 366
    .line 367
    const v13, 0x419cb852    # 19.59f

    .line 368
    .line 369
    .line 370
    const v14, 0x416deb85    # 14.87f

    .line 371
    .line 372
    .line 373
    const/high16 v15, 0x41a00000    # 20.0f

    .line 374
    .line 375
    const v16, 0x4157ae14    # 13.48f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, -0x3f600000    # -5.0f

    .line 382
    .line 383
    const v18, -0x3f12e148    # -7.41f

    .line 384
    .line 385
    .line 386
    const/4 v13, 0x0

    .line 387
    const v14, -0x3fa9999a    # -3.35f

    .line 388
    .line 389
    .line 390
    const v15, -0x3ffb851f    # -2.07f

    .line 391
    .line 392
    .line 393
    const v16, -0x3f38f5c3    # -6.22f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40a00000    # 5.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, -0x40000000    # -2.0f

    .line 405
    .line 406
    const/high16 v18, 0x40000000    # 2.0f

    .line 407
    .line 408
    const v14, 0x3f8ccccd    # 1.1f

    .line 409
    .line 410
    .line 411
    const v15, -0x4099999a    # -0.9f

    .line 412
    .line 413
    .line 414
    const/high16 v16, 0x40000000    # 2.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, -0x40000000    # -2.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4102b852    # 8.17f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x41a9851f    # 21.19f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x3fb47ae1    # 1.41f

    .line 440
    .line 441
    .line 442
    const v2, -0x404b851f    # -1.41f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x3feeb852    # -2.27f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41400000    # 12.0f

    .line 455
    .line 456
    const/high16 v18, 0x41b00000    # 22.0f

    .line 457
    .line 458
    const v13, 0x417ee148    # 15.93f

    .line 459
    .line 460
    .line 461
    const v14, 0x41ab1eb8    # 21.39f

    .line 462
    .line 463
    .line 464
    const v15, 0x4160a3d7    # 14.04f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x41b00000    # 22.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x40000000    # 2.0f

    .line 473
    .line 474
    const/high16 v18, 0x41400000    # 12.0f

    .line 475
    .line 476
    const v13, 0x40cf5c29    # 6.48f

    .line 477
    .line 478
    .line 479
    const/high16 v14, 0x41b00000    # 22.0f

    .line 480
    .line 481
    const/high16 v15, 0x40000000    # 2.0f

    .line 482
    .line 483
    const v16, 0x418c28f6    # 17.52f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x3fd47ae1    # 1.66f

    .line 490
    .line 491
    .line 492
    const v18, -0x3f4fae14    # -5.51f

    .line 493
    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    const v14, -0x3ffd70a4    # -2.04f

    .line 497
    .line 498
    .line 499
    const v15, 0x3f1c28f6    # 0.61f

    .line 500
    .line 501
    .line 502
    const v16, -0x3f847ae1    # -3.93f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x3fb1eb85    # 1.39f

    .line 509
    .line 510
    .line 511
    const v2, 0x40870a3d    # 4.22f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3fb47ae1    # 1.41f

    .line 518
    .line 519
    .line 520
    const v2, -0x404b851f    # -1.41f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x41a9851f    # 21.19f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41900000    # 18.0f

    .line 536
    .line 537
    const/high16 v2, 0x41300000    # 11.0f

    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x40000000    # -2.0f

    .line 543
    .line 544
    const/high16 v18, -0x40000000    # -2.0f

    .line 545
    .line 546
    const v13, -0x40733333    # -1.1f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/high16 v15, -0x40000000    # -2.0f

    .line 551
    .line 552
    const v16, -0x4099999a    # -0.9f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x40800000    # -1.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, -0x3f66b852    # -4.79f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, 0x40800000    # 4.0f

    .line 570
    .line 571
    const/high16 v18, 0x41400000    # 12.0f

    .line 572
    .line 573
    const v13, 0x40828f5c    # 4.08f

    .line 574
    .line 575
    .line 576
    const v14, 0x412ca3d7    # 10.79f

    .line 577
    .line 578
    .line 579
    const/high16 v15, 0x40800000    # 4.0f

    .line 580
    .line 581
    const v16, 0x4136147b    # 11.38f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v17, 0x40e00000    # 7.0f

    .line 588
    .line 589
    const v18, 0x40fdc28f    # 7.93f

    .line 590
    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const v14, 0x40828f5c    # 4.08f

    .line 594
    .line 595
    .line 596
    const v15, 0x40433333    # 3.05f

    .line 597
    .line 598
    .line 599
    const v16, 0x40ee147b    # 7.44f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x41900000    # 18.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/16 v16, 0x3800

    .line 618
    .line 619
    const/16 v17, 0x0

    .line 620
    .line 621
    const/high16 v6, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v8, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v7, 0x0

    .line 626
    const/high16 v12, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v14, 0x0

    .line 629
    const/4 v15, 0x0

    .line 630
    const-string v4, ""

    .line 631
    .line 632
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    sput-object v0, Landroidx/compose/material/icons/twotone/PublicOffKt;->_publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v0
.end method
