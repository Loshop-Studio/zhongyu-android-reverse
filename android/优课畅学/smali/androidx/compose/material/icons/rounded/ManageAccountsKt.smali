.class public final Landroidx/compose/material/icons/rounded/ManageAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getManageAccounts(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ManageAccounts"

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
    const v4, 0x412ab852    # 10.67f

    .line 71
    .line 72
    .line 73
    const v6, 0x415051ec    # 13.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41200000    # 10.0f

    .line 80
    .line 81
    const/high16 v26, 0x41500000    # 13.0f

    .line 82
    .line 83
    const v21, 0x41273333    # 10.45f

    .line 84
    .line 85
    .line 86
    const v22, 0x415028f6    # 13.01f

    .line 87
    .line 88
    .line 89
    const v23, 0x4123ae14    # 10.23f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41500000    # 13.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f2c7ae1    # -6.61f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fe8f5c3    # 1.82f

    .line 103
    .line 104
    .line 105
    const v21, -0x3fe51eb8    # -2.42f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3f6a3d71    # -4.68f

    .line 111
    .line 112
    .line 113
    const v24, 0x3f2b851f    # 0.67f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40000000    # 2.0f

    .line 120
    .line 121
    const v26, 0x418acccd    # 17.35f

    .line 122
    .line 123
    .line 124
    const v21, 0x4020a3d7    # 2.51f

    .line 125
    .line 126
    .line 127
    const v22, 0x417570a4    # 15.34f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v24, 0x41828f5c    # 16.32f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41980000    # 19.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/high16 v26, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const v22, 0x3f0ccccd    # 0.55f

    .line 150
    .line 151
    .line 152
    const v23, 0x3ee66666    # 0.45f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x410428f6    # 8.26f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41200000    # 10.0f

    .line 167
    .line 168
    const/high16 v26, 0x41800000    # 16.0f

    .line 169
    .line 170
    const v21, 0x4127851f    # 10.47f

    .line 171
    .line 172
    .line 173
    const v22, 0x4196f5c3    # 18.87f

    .line 174
    .line 175
    .line 176
    const/high16 v23, 0x41200000    # 10.0f

    .line 177
    .line 178
    const v24, 0x418beb85    # 17.49f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, 0x412ab852    # 10.67f

    .line 185
    .line 186
    .line 187
    const v26, 0x415051ec    # 13.02f

    .line 188
    .line 189
    .line 190
    const/high16 v21, 0x41200000    # 10.0f

    .line 191
    .line 192
    const v22, 0x416ee148    # 14.93f

    .line 193
    .line 194
    .line 195
    const/high16 v23, 0x41240000    # 10.25f

    .line 196
    .line 197
    const v24, 0x415ee148    # 13.93f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/high16 v6, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v8, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41200000    # 10.0f

    .line 259
    .line 260
    const/high16 v6, 0x41000000    # 8.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, -0x3f800000    # -4.0f

    .line 266
    .line 267
    const/4 v6, 0x0

    .line 268
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v26, 0x41000000    # 8.0f

    .line 272
    .line 273
    const/16 v27, 0x0

    .line 274
    .line 275
    const/high16 v21, 0x40800000    # 4.0f

    .line 276
    .line 277
    const/high16 v22, 0x40800000    # 4.0f

    .line 278
    .line 279
    const/16 v23, 0x0

    .line 280
    .line 281
    const/16 v24, 0x1

    .line 282
    .line 283
    const/16 v25, 0x1

    .line 284
    .line 285
    move-object/from16 v20, v2

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v26, -0x3f000000    # -8.0f

    .line 291
    .line 292
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/high16 v6, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v7, 0x0

    .line 302
    const-string v4, ""

    .line 303
    .line 304
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 312
    .line 313
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    const/4 v0, 0x0

    .line 318
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41a60000    # 20.75f

    .line 335
    .line 336
    const/high16 v2, 0x41800000    # 16.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x428a3d71    # -0.06f

    .line 342
    .line 343
    .line 344
    const v18, -0x40deb852    # -0.63f

    .line 345
    .line 346
    .line 347
    const v14, -0x419eb852    # -0.22f

    .line 348
    .line 349
    .line 350
    const v15, -0x430a3d71    # -0.03f

    .line 351
    .line 352
    .line 353
    const v16, -0x4128f5c3    # -0.42f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x40c51eb8    # -0.73f

    .line 360
    .line 361
    .line 362
    const v2, 0x3f570a3d    # 0.84f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3dcccccd    # 0.1f

    .line 369
    .line 370
    .line 371
    const v13, 0x3e3851ec    # 0.18f

    .line 372
    .line 373
    .line 374
    const v14, -0x41dc28f6    # -0.16f

    .line 375
    .line 376
    .line 377
    const v15, 0x3e6147ae    # 0.22f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x407d70a4    # -1.02f

    .line 384
    .line 385
    .line 386
    const v2, -0x40e8f5c3    # -0.59f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x40e8f5c3    # -0.59f

    .line 393
    .line 394
    .line 395
    const v18, -0x419eb852    # -0.22f

    .line 396
    .line 397
    .line 398
    const v13, -0x420a3d71    # -0.12f

    .line 399
    .line 400
    .line 401
    const v14, -0x41a8f5c3    # -0.21f

    .line 402
    .line 403
    .line 404
    const v15, -0x41428f5c    # -0.37f

    .line 405
    .line 406
    .line 407
    const v16, -0x41666666    # -0.3f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x3eb851ec    # 0.36f

    .line 414
    .line 415
    .line 416
    const v2, -0x407851ec    # -1.06f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x4075c28f    # -1.08f

    .line 423
    .line 424
    .line 425
    const v18, -0x40deb852    # -0.63f

    .line 426
    .line 427
    .line 428
    const v13, -0x415c28f6    # -0.32f

    .line 429
    .line 430
    .line 431
    const v14, -0x4175c28f    # -0.27f

    .line 432
    .line 433
    .line 434
    const v15, -0x40d1eb85    # -0.68f

    .line 435
    .line 436
    .line 437
    const v16, -0x410a3d71    # -0.48f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x40747ae1    # -1.09f

    .line 444
    .line 445
    .line 446
    const v2, -0x419eb852    # -0.22f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x41051eb8    # -0.49f

    .line 453
    .line 454
    .line 455
    const v18, -0x41333333    # -0.4f

    .line 456
    .line 457
    .line 458
    const v13, -0x42b33333    # -0.05f

    .line 459
    .line 460
    .line 461
    const v14, -0x41947ae1    # -0.23f

    .line 462
    .line 463
    .line 464
    const/high16 v15, -0x41800000    # -0.25f

    .line 465
    .line 466
    const v16, -0x41333333    # -0.4f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x4068f5c3    # -1.18f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v18, 0x3ecccccd    # 0.4f

    .line 479
    .line 480
    .line 481
    const v13, -0x418a3d71    # -0.24f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const v15, -0x411eb852    # -0.44f

    .line 486
    .line 487
    .line 488
    const v16, 0x3e2e147b    # 0.17f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x3f8b851f    # 1.09f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, -0x4075c28f    # -1.08f

    .line 501
    .line 502
    .line 503
    const v18, 0x3f2147ae    # 0.63f

    .line 504
    .line 505
    .line 506
    const v13, -0x41333333    # -0.4f

    .line 507
    .line 508
    .line 509
    const v14, 0x3e19999a    # 0.15f

    .line 510
    .line 511
    .line 512
    const v15, -0x40bd70a4    # -0.76f

    .line 513
    .line 514
    .line 515
    const v16, 0x3eb851ec    # 0.36f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x4147ae14    # -0.36f

    .line 522
    .line 523
    .line 524
    const v2, -0x407851ec    # -1.06f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x40e8f5c3    # -0.59f

    .line 531
    .line 532
    .line 533
    const v18, 0x3e6147ae    # 0.22f

    .line 534
    .line 535
    .line 536
    const v13, -0x41947ae1    # -0.23f

    .line 537
    .line 538
    .line 539
    const v14, -0x425c28f6    # -0.08f

    .line 540
    .line 541
    .line 542
    const v15, -0x410f5c29    # -0.47f

    .line 543
    .line 544
    .line 545
    const v16, 0x3ca3d70a    # 0.02f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3f828f5c    # 1.02f

    .line 552
    .line 553
    .line 554
    const v2, -0x40e8f5c3    # -0.59f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x3dcccccd    # 0.1f

    .line 561
    .line 562
    .line 563
    const v18, 0x3f2147ae    # 0.63f

    .line 564
    .line 565
    .line 566
    const v13, -0x420a3d71    # -0.12f

    .line 567
    .line 568
    .line 569
    const v14, 0x3e570a3d    # 0.21f

    .line 570
    .line 571
    .line 572
    const v15, -0x425c28f6    # -0.08f

    .line 573
    .line 574
    .line 575
    const v16, 0x3ef0a3d7    # 0.47f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x3f3ae148    # 0.73f

    .line 582
    .line 583
    .line 584
    const v2, 0x3f570a3d    # 0.84f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, -0x428a3d71    # -0.06f

    .line 591
    .line 592
    .line 593
    const v13, -0x430a3d71    # -0.03f

    .line 594
    .line 595
    .line 596
    const v15, -0x428a3d71    # -0.06f

    .line 597
    .line 598
    .line 599
    const v16, 0x3ed1eb85    # 0.41f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3d75c28f    # 0.06f

    .line 606
    .line 607
    .line 608
    const v2, 0x3f2147ae    # 0.63f

    .line 609
    .line 610
    .line 611
    const v4, 0x3cf5c28f    # 0.03f

    .line 612
    .line 613
    .line 614
    const v6, 0x3ed70a3d    # 0.42f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, -0x40a8f5c3    # -0.84f

    .line 621
    .line 622
    .line 623
    const v2, 0x3f3ae148    # 0.73f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, -0x42333333    # -0.1f

    .line 630
    .line 631
    .line 632
    const v13, -0x41c7ae14    # -0.18f

    .line 633
    .line 634
    .line 635
    const v14, 0x3e23d70a    # 0.16f

    .line 636
    .line 637
    .line 638
    const v15, -0x419eb852    # -0.22f

    .line 639
    .line 640
    .line 641
    const v16, 0x3ed70a3d    # 0.42f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x3f170a3d    # 0.59f

    .line 648
    .line 649
    .line 650
    const v2, 0x3f828f5c    # 1.02f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x3f170a3d    # 0.59f

    .line 657
    .line 658
    .line 659
    const v18, 0x3e6147ae    # 0.22f

    .line 660
    .line 661
    .line 662
    const v13, 0x3df5c28f    # 0.12f

    .line 663
    .line 664
    .line 665
    const v14, 0x3e570a3d    # 0.21f

    .line 666
    .line 667
    .line 668
    const v15, 0x3ebd70a4    # 0.37f

    .line 669
    .line 670
    .line 671
    const v16, 0x3e99999a    # 0.3f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x3f87ae14    # 1.06f

    .line 678
    .line 679
    .line 680
    const v2, -0x4147ae14    # -0.36f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v17, 0x3f8a3d71    # 1.08f

    .line 687
    .line 688
    .line 689
    const v18, 0x3f2147ae    # 0.63f

    .line 690
    .line 691
    .line 692
    const v13, 0x3ea3d70a    # 0.32f

    .line 693
    .line 694
    .line 695
    const v14, 0x3e8a3d71    # 0.27f

    .line 696
    .line 697
    .line 698
    const v15, 0x3f2e147b    # 0.68f

    .line 699
    .line 700
    .line 701
    const v16, 0x3ef5c28f    # 0.48f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x3e6147ae    # 0.22f

    .line 708
    .line 709
    .line 710
    const v2, 0x3f8b851f    # 1.09f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, 0x3efae148    # 0.49f

    .line 717
    .line 718
    .line 719
    const v18, 0x3ecccccd    # 0.4f

    .line 720
    .line 721
    .line 722
    const v13, 0x3d4ccccd    # 0.05f

    .line 723
    .line 724
    .line 725
    const v14, 0x3e6b851f    # 0.23f

    .line 726
    .line 727
    .line 728
    const/high16 v15, 0x3e800000    # 0.25f

    .line 729
    .line 730
    const v16, 0x3ecccccd    # 0.4f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x3f970a3d    # 1.18f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v18, -0x41333333    # -0.4f

    .line 743
    .line 744
    .line 745
    const v13, 0x3e75c28f    # 0.24f

    .line 746
    .line 747
    .line 748
    const/4 v14, 0x0

    .line 749
    const v15, 0x3ee147ae    # 0.44f

    .line 750
    .line 751
    .line 752
    const v16, -0x41d1eb85    # -0.17f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v0, 0x3e6147ae    # 0.22f

    .line 759
    .line 760
    .line 761
    const v2, -0x40747ae1    # -1.09f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x3f8a3d71    # 1.08f

    .line 768
    .line 769
    .line 770
    const v18, -0x40deb852    # -0.63f

    .line 771
    .line 772
    .line 773
    const v13, 0x3ecccccd    # 0.4f

    .line 774
    .line 775
    .line 776
    const v14, -0x41e66666    # -0.15f

    .line 777
    .line 778
    .line 779
    const v15, 0x3f428f5c    # 0.76f

    .line 780
    .line 781
    .line 782
    const v16, -0x4147ae14    # -0.36f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, 0x3f87ae14    # 1.06f

    .line 789
    .line 790
    .line 791
    const v2, 0x3eb851ec    # 0.36f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x3f170a3d    # 0.59f

    .line 798
    .line 799
    .line 800
    const v18, -0x419eb852    # -0.22f

    .line 801
    .line 802
    .line 803
    const v13, 0x3e6b851f    # 0.23f

    .line 804
    .line 805
    .line 806
    const v14, 0x3da3d70a    # 0.08f

    .line 807
    .line 808
    .line 809
    const v15, 0x3ef0a3d7    # 0.47f

    .line 810
    .line 811
    .line 812
    const v16, -0x435c28f6    # -0.02f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x3f170a3d    # 0.59f

    .line 819
    .line 820
    .line 821
    const v2, -0x407d70a4    # -1.02f

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v17, -0x42333333    # -0.1f

    .line 828
    .line 829
    .line 830
    const v18, -0x40deb852    # -0.63f

    .line 831
    .line 832
    .line 833
    const v13, 0x3df5c28f    # 0.12f

    .line 834
    .line 835
    .line 836
    const v14, -0x41a8f5c3    # -0.21f

    .line 837
    .line 838
    .line 839
    const v15, 0x3da3d70a    # 0.08f

    .line 840
    .line 841
    .line 842
    const v16, -0x410f5c29    # -0.47f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, -0x40a8f5c3    # -0.84f

    .line 849
    .line 850
    .line 851
    const v2, -0x40c51eb8    # -0.73f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v17, 0x41a60000    # 20.75f

    .line 858
    .line 859
    const/high16 v18, 0x41800000    # 16.0f

    .line 860
    .line 861
    const v13, 0x41a5c28f    # 20.72f

    .line 862
    .line 863
    .line 864
    const v14, 0x41835c29    # 16.42f

    .line 865
    .line 866
    .line 867
    const/high16 v15, 0x41a60000    # 20.75f

    .line 868
    .line 869
    const v16, 0x4181c28f    # 16.22f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v0, 0x41880000    # 17.0f

    .line 879
    .line 880
    const/high16 v2, 0x41900000    # 18.0f

    .line 881
    .line 882
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v17, -0x40000000    # -2.0f

    .line 886
    .line 887
    const/high16 v18, -0x40000000    # -2.0f

    .line 888
    .line 889
    const v13, -0x40733333    # -1.1f

    .line 890
    .line 891
    .line 892
    const/4 v14, 0x0

    .line 893
    const/high16 v15, -0x40000000    # -2.0f

    .line 894
    .line 895
    const v16, -0x4099999a    # -0.9f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v0, -0x40000000    # -2.0f

    .line 902
    .line 903
    const/high16 v2, -0x40000000    # -2.0f

    .line 904
    .line 905
    const v4, 0x3f666666    # 0.9f

    .line 906
    .line 907
    .line 908
    const/high16 v6, 0x40000000    # 2.0f

    .line 909
    .line 910
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, 0x3f666666    # 0.9f

    .line 914
    .line 915
    .line 916
    const/high16 v2, 0x40000000    # 2.0f

    .line 917
    .line 918
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v0, 0x4190cccd    # 18.1f

    .line 922
    .line 923
    .line 924
    const/high16 v2, 0x41880000    # 17.0f

    .line 925
    .line 926
    const/high16 v4, 0x41900000    # 18.0f

    .line 927
    .line 928
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    const/16 v16, 0x3800

    .line 939
    .line 940
    const/16 v17, 0x0

    .line 941
    .line 942
    const/high16 v6, 0x3f800000    # 1.0f

    .line 943
    .line 944
    const/4 v7, 0x0

    .line 945
    const/high16 v12, 0x3f800000    # 1.0f

    .line 946
    .line 947
    const/4 v13, 0x0

    .line 948
    const/4 v15, 0x0

    .line 949
    const-string v4, ""

    .line 950
    .line 951
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    sput-object v0, Landroidx/compose/material/icons/rounded/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 960
    .line 961
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 962
    .line 963
    .line 964
    return-object v0
.end method
