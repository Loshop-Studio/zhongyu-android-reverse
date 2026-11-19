.class public final Landroidx/compose/material/icons/sharp/ManageAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getManageAccounts(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ManageAccounts"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x411428f6    # 9.26f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, 0x41200000    # 10.0f

    .line 150
    .line 151
    const/high16 v26, 0x41800000    # 16.0f

    .line 152
    .line 153
    const v21, 0x4127851f    # 10.47f

    .line 154
    .line 155
    .line 156
    const v22, 0x4196f5c3    # 18.87f

    .line 157
    .line 158
    .line 159
    const/high16 v23, 0x41200000    # 10.0f

    .line 160
    .line 161
    const v24, 0x418beb85    # 17.49f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, 0x412ab852    # 10.67f

    .line 168
    .line 169
    .line 170
    const v26, 0x415051ec    # 13.02f

    .line 171
    .line 172
    .line 173
    const/high16 v21, 0x41200000    # 10.0f

    .line 174
    .line 175
    const v22, 0x416ee148    # 14.93f

    .line 176
    .line 177
    .line 178
    const/high16 v23, 0x41240000    # 10.25f

    .line 179
    .line 180
    const v24, 0x415ee148    # 13.93f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    const/16 v16, 0x3800

    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const/high16 v6, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/high16 v8, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v7, 0x0

    .line 202
    const/high16 v9, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/high16 v12, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const-string v4, ""

    .line 210
    .line 211
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 219
    .line 220
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    const/4 v2, 0x0

    .line 225
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x41200000    # 10.0f

    .line 242
    .line 243
    const/high16 v6, 0x41000000    # 8.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, -0x3f800000    # -4.0f

    .line 249
    .line 250
    const/4 v6, 0x0

    .line 251
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v26, 0x41000000    # 8.0f

    .line 255
    .line 256
    const/16 v27, 0x0

    .line 257
    .line 258
    const/high16 v21, 0x40800000    # 4.0f

    .line 259
    .line 260
    const/high16 v22, 0x40800000    # 4.0f

    .line 261
    .line 262
    const/16 v23, 0x0

    .line 263
    .line 264
    const/16 v24, 0x1

    .line 265
    .line 266
    const/16 v25, 0x1

    .line 267
    .line 268
    move-object/from16 v20, v2

    .line 269
    .line 270
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v26, -0x3f000000    # -8.0f

    .line 274
    .line 275
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/high16 v6, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const-string v4, ""

    .line 286
    .line 287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 288
    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 295
    .line 296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 297
    .line 298
    .line 299
    move-result-wide v6

    .line 300
    const/4 v0, 0x0

    .line 301
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41a60000    # 20.75f

    .line 318
    .line 319
    const/high16 v2, 0x41800000    # 16.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x428a3d71    # -0.06f

    .line 325
    .line 326
    .line 327
    const v18, -0x40deb852    # -0.63f

    .line 328
    .line 329
    .line 330
    const v14, -0x419eb852    # -0.22f

    .line 331
    .line 332
    .line 333
    const v15, -0x430a3d71    # -0.03f

    .line 334
    .line 335
    .line 336
    const v16, -0x4128f5c3    # -0.42f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x407eb852    # -1.01f

    .line 343
    .line 344
    .line 345
    const v2, 0x3f91eb85    # 1.14f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x40228f5c    # -1.73f

    .line 352
    .line 353
    .line 354
    const/high16 v2, -0x40800000    # -1.0f

    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x3efae148    # 0.49f

    .line 360
    .line 361
    .line 362
    const v2, -0x40466666    # -1.45f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, -0x4075c28f    # -1.08f

    .line 369
    .line 370
    .line 371
    const v13, -0x415c28f6    # -0.32f

    .line 372
    .line 373
    .line 374
    const v14, -0x4175c28f    # -0.27f

    .line 375
    .line 376
    .line 377
    const v15, -0x40d1eb85    # -0.68f

    .line 378
    .line 379
    .line 380
    const v16, -0x410a3d71    # -0.48f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41300000    # 11.0f

    .line 387
    .line 388
    const/high16 v2, 0x41900000    # 18.0f

    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, -0x40000000    # -2.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x41666666    # -0.3f

    .line 399
    .line 400
    .line 401
    const v2, 0x3fbeb852    # 1.49f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v18, 0x3f2147ae    # 0.63f

    .line 408
    .line 409
    .line 410
    const v13, -0x41333333    # -0.4f

    .line 411
    .line 412
    .line 413
    const v14, 0x3e19999a    # 0.15f

    .line 414
    .line 415
    .line 416
    const v15, -0x40bd70a4    # -0.76f

    .line 417
    .line 418
    .line 419
    const v16, 0x3eb851ec    # 0.36f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x41051eb8    # -0.49f

    .line 426
    .line 427
    .line 428
    const v2, -0x40466666    # -1.45f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x3fdd70a4    # 1.73f

    .line 435
    .line 436
    .line 437
    const/high16 v2, -0x40800000    # -1.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f8147ae    # 1.01f

    .line 443
    .line 444
    .line 445
    const v2, 0x3f91eb85    # 1.14f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, -0x428a3d71    # -0.06f

    .line 452
    .line 453
    .line 454
    const v13, -0x430a3d71    # -0.03f

    .line 455
    .line 456
    .line 457
    const v14, 0x3e570a3d    # 0.21f

    .line 458
    .line 459
    .line 460
    const v15, -0x428a3d71    # -0.06f

    .line 461
    .line 462
    .line 463
    const v16, 0x3ed1eb85    # 0.41f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3d75c28f    # 0.06f

    .line 470
    .line 471
    .line 472
    const v2, 0x3f2147ae    # 0.63f

    .line 473
    .line 474
    .line 475
    const v4, 0x3cf5c28f    # 0.03f

    .line 476
    .line 477
    .line 478
    const v6, 0x3ed70a3d    # 0.42f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x406e147b    # -1.14f

    .line 485
    .line 486
    .line 487
    const v2, 0x3f8147ae    # 1.01f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const v2, 0x3fdd70a4    # 1.73f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3fb9999a    # 1.45f

    .line 502
    .line 503
    .line 504
    const v2, -0x41051eb8    # -0.49f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x3f8a3d71    # 1.08f

    .line 511
    .line 512
    .line 513
    const v13, 0x3ea3d70a    # 0.32f

    .line 514
    .line 515
    .line 516
    const v14, 0x3e8a3d71    # 0.27f

    .line 517
    .line 518
    .line 519
    const v15, 0x3f2e147b    # 0.68f

    .line 520
    .line 521
    .line 522
    const v16, 0x3ef5c28f    # 0.48f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41a80000    # 21.0f

    .line 529
    .line 530
    const/high16 v2, 0x41800000    # 16.0f

    .line 531
    .line 532
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40000000    # 2.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x3e99999a    # 0.3f

    .line 541
    .line 542
    .line 543
    const v2, -0x404147ae    # -1.49f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v18, -0x40deb852    # -0.63f

    .line 550
    .line 551
    .line 552
    const v13, 0x3ecccccd    # 0.4f

    .line 553
    .line 554
    .line 555
    const v14, -0x41e66666    # -0.15f

    .line 556
    .line 557
    .line 558
    const v15, 0x3f428f5c    # 0.76f

    .line 559
    .line 560
    .line 561
    const v16, -0x4147ae14    # -0.36f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x3fb9999a    # 1.45f

    .line 568
    .line 569
    .line 570
    const v2, 0x3efae148    # 0.49f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const v2, -0x40228f5c    # -1.73f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x406e147b    # -1.14f

    .line 585
    .line 586
    .line 587
    const v2, -0x407eb852    # -1.01f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v17, 0x41a60000    # 20.75f

    .line 594
    .line 595
    const/high16 v18, 0x41800000    # 16.0f

    .line 596
    .line 597
    const v13, 0x41a5c28f    # 20.72f

    .line 598
    .line 599
    .line 600
    const v14, 0x41835c29    # 16.42f

    .line 601
    .line 602
    .line 603
    const/high16 v15, 0x41a60000    # 20.75f

    .line 604
    .line 605
    const v16, 0x4181c28f    # 16.22f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41880000    # 17.0f

    .line 615
    .line 616
    const/high16 v2, 0x41900000    # 18.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, -0x40000000    # -2.0f

    .line 622
    .line 623
    const/high16 v18, -0x40000000    # -2.0f

    .line 624
    .line 625
    const v13, -0x40733333    # -1.1f

    .line 626
    .line 627
    .line 628
    const/4 v14, 0x0

    .line 629
    const/high16 v15, -0x40000000    # -2.0f

    .line 630
    .line 631
    const v16, -0x4099999a    # -0.9f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x3f666666    # 0.9f

    .line 638
    .line 639
    .line 640
    const/high16 v2, -0x40000000    # -2.0f

    .line 641
    .line 642
    const/high16 v4, 0x40000000    # 2.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v2, 0x40000000    # 2.0f

    .line 648
    .line 649
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x4190cccd    # 18.1f

    .line 653
    .line 654
    .line 655
    const/high16 v2, 0x41880000    # 17.0f

    .line 656
    .line 657
    const/high16 v4, 0x41900000    # 18.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/16 v16, 0x3800

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const/high16 v6, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/4 v7, 0x0

    .line 676
    const/high16 v12, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v13, 0x0

    .line 679
    const/4 v15, 0x0

    .line 680
    const-string v4, ""

    .line 681
    .line 682
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    sput-object v0, Landroidx/compose/material/icons/sharp/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 691
    .line 692
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    return-object v0
.end method
