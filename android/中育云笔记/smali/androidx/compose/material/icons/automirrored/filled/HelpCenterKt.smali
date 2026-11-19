.class public final Landroidx/compose/material/icons/automirrored/filled/HelpCenterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHelpCenter(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/filled/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Filled.HelpCenter"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x414028f6    # 12.01f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41900000    # 18.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x405eb852    # -1.26f

    .line 171
    .line 172
    .line 173
    const v18, -0x405eb852    # -1.26f

    .line 174
    .line 175
    .line 176
    const v13, -0x40cccccd    # -0.7f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const v15, -0x405eb852    # -1.26f

    .line 181
    .line 182
    .line 183
    const v16, -0x40f0a3d7    # -0.56f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3fa147ae    # 1.26f

    .line 190
    .line 191
    .line 192
    const/high16 v18, -0x40600000    # -1.25f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const v14, -0x40ca3d71    # -0.71f

    .line 196
    .line 197
    .line 198
    const v15, 0x3f0f5c29    # 0.56f

    .line 199
    .line 200
    .line 201
    const/high16 v16, -0x40600000    # -1.25f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 207
    .line 208
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 209
    .line 210
    const v13, 0x3f35c28f    # 0.71f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 215
    .line 216
    const v16, 0x3f0a3d71    # 0.54f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x414028f6    # 12.01f

    .line 223
    .line 224
    .line 225
    const/high16 v18, 0x41900000    # 18.0f

    .line 226
    .line 227
    const/high16 v13, 0x41540000    # 13.25f

    .line 228
    .line 229
    const v14, 0x418b70a4    # 17.43f

    .line 230
    .line 231
    .line 232
    const v15, 0x414b851f    # 12.72f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x41900000    # 18.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x417051ec    # 15.02f

    .line 244
    .line 245
    .line 246
    const v2, 0x4129999a    # 10.6f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x4010a3d7    # -1.87f

    .line 253
    .line 254
    .line 255
    const v18, 0x400ae148    # 2.17f

    .line 256
    .line 257
    .line 258
    const v13, -0x40bd70a4    # -0.76f

    .line 259
    .line 260
    .line 261
    const v14, 0x3f8e147b    # 1.11f

    .line 262
    .line 263
    .line 264
    const v15, -0x40428f5c    # -1.48f

    .line 265
    .line 266
    .line 267
    const v16, 0x3fbae148    # 1.46f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x419eb852    # -0.22f

    .line 274
    .line 275
    .line 276
    const v18, 0x3fb47ae1    # 1.41f

    .line 277
    .line 278
    .line 279
    const v13, -0x41dc28f6    # -0.16f

    .line 280
    .line 281
    .line 282
    const v14, 0x3e947ae1    # 0.29f

    .line 283
    .line 284
    .line 285
    const v15, -0x419eb852    # -0.22f

    .line 286
    .line 287
    .line 288
    const v16, 0x3ef5c28f    # 0.48f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, -0x40170a3d    # -1.82f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x3e9eb852    # 0.31f

    .line 301
    .line 302
    .line 303
    const v18, -0x40028f5c    # -1.98f

    .line 304
    .line 305
    .line 306
    const/4 v13, 0x0

    .line 307
    const v14, -0x41051eb8    # -0.49f

    .line 308
    .line 309
    .line 310
    const v15, -0x425c28f6    # -0.08f

    .line 311
    .line 312
    .line 313
    const v16, -0x405ae148    # -1.29f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3ffae148    # 1.96f

    .line 320
    .line 321
    .line 322
    const v18, -0x3ff5c28f    # -2.16f

    .line 323
    .line 324
    .line 325
    const v13, 0x3efae148    # 0.49f

    .line 326
    .line 327
    .line 328
    const v14, -0x40a147ae    # -0.87f

    .line 329
    .line 330
    .line 331
    const v15, 0x3fb5c28f    # 1.42f

    .line 332
    .line 333
    .line 334
    const v16, -0x404e147b    # -1.39f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, -0x4050a3d7    # -1.37f

    .line 341
    .line 342
    .line 343
    const v18, -0x3feae148    # -2.33f

    .line 344
    .line 345
    .line 346
    const v13, 0x3f11eb85    # 0.57f

    .line 347
    .line 348
    .line 349
    const v14, -0x40b0a3d7    # -0.81f

    .line 350
    .line 351
    .line 352
    const/high16 v15, 0x3e800000    # 0.25f

    .line 353
    .line 354
    const v16, -0x3feae148    # -2.33f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, -0x4019999a    # -1.8f

    .line 361
    .line 362
    .line 363
    const v18, 0x3fbd70a4    # 1.48f

    .line 364
    .line 365
    .line 366
    const v13, -0x407851ec    # -1.06f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, -0x4035c28f    # -1.58f

    .line 371
    .line 372
    .line 373
    const v16, 0x3f4ccccd    # 0.8f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x4108f5c3    # 8.56f

    .line 380
    .line 381
    .line 382
    const v2, 0x4107d70a    # 8.49f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, 0x413fd70a    # 11.99f

    .line 389
    .line 390
    .line 391
    const/high16 v18, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const v13, 0x411028f6    # 9.01f

    .line 394
    .line 395
    .line 396
    const v14, 0x40e4cccd    # 7.15f

    .line 397
    .line 398
    .line 399
    const v15, 0x4123851f    # 10.22f

    .line 400
    .line 401
    .line 402
    const/high16 v16, 0x40c00000    # 6.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, 0x4040a3d7    # 3.01f

    .line 408
    .line 409
    .line 410
    const v18, 0x3fc28f5c    # 1.52f

    .line 411
    .line 412
    .line 413
    const v13, 0x3fbd70a4    # 1.48f

    .line 414
    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    const v15, 0x401f5c29    # 2.49f

    .line 418
    .line 419
    .line 420
    const v16, 0x3f2b851f    # 0.67f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, 0x417051ec    # 15.02f

    .line 427
    .line 428
    .line 429
    const v18, 0x4129999a    # 10.6f

    .line 430
    .line 431
    .line 432
    const v13, 0x41770a3d    # 15.44f

    .line 433
    .line 434
    .line 435
    const v14, 0x4103d70a    # 8.24f

    .line 436
    .line 437
    .line 438
    const v15, 0x417b3333    # 15.7f

    .line 439
    .line 440
    .line 441
    const v16, 0x411970a4    # 9.59f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/16 v16, 0x3800

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/high16 v6, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v8, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v7, 0x0

    .line 463
    const/high16 v9, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/high16 v12, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const/4 v14, 0x0

    .line 469
    const/4 v15, 0x0

    .line 470
    const-string v4, ""

    .line 471
    .line 472
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    sput-object v0, Landroidx/compose/material/icons/automirrored/filled/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 481
    .line 482
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-object v0
.end method
