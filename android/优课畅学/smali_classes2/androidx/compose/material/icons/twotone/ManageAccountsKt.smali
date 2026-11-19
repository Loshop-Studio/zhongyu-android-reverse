.class public final Landroidx/compose/material/icons/twotone/ManageAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getManageAccounts(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ManageAccounts"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40000000    # -2.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41800000    # 16.0f

    .line 162
    .line 163
    const/high16 v6, 0x41200000    # 10.0f

    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x3da3d70a    # 0.08f

    .line 169
    .line 170
    .line 171
    const v26, -0x40828f5c    # -0.99f

    .line 172
    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const v22, -0x4151eb85    # -0.34f

    .line 177
    .line 178
    .line 179
    const v23, 0x3cf5c28f    # 0.03f

    .line 180
    .line 181
    .line 182
    const v24, -0x40d47ae1    # -0.67f

    .line 183
    .line 184
    .line 185
    move-object/from16 v20, v2

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x41200000    # 10.0f

    .line 191
    .line 192
    const/high16 v26, 0x41700000    # 15.0f

    .line 193
    .line 194
    const v21, 0x4120cccd    # 10.05f

    .line 195
    .line 196
    .line 197
    const/high16 v22, 0x41700000    # 15.0f

    .line 198
    .line 199
    const v23, 0x41207ae1    # 10.03f

    .line 200
    .line 201
    .line 202
    const/high16 v24, 0x41700000    # 15.0f

    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, -0x3f4d1eb8    # -5.59f

    .line 208
    .line 209
    .line 210
    const v26, 0x3fc51eb8    # 1.54f

    .line 211
    .line 212
    .line 213
    const v21, -0x4003d70a    # -1.97f

    .line 214
    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    const v23, -0x3f866666    # -3.9f

    .line 219
    .line 220
    .line 221
    const v24, 0x3f07ae14    # 0.53f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, 0x40800000    # 4.0f

    .line 228
    .line 229
    const v26, 0x418acccd    # 17.35f

    .line 230
    .line 231
    .line 232
    const v21, 0x40851eb8    # 4.16f

    .line 233
    .line 234
    .line 235
    const v22, 0x418570a4    # 16.68f

    .line 236
    .line 237
    .line 238
    const/high16 v23, 0x40800000    # 4.0f

    .line 239
    .line 240
    const/high16 v24, 0x41880000    # 17.0f

    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41900000    # 18.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v4, 0x40c947ae    # 6.29f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, 0x41200000    # 10.0f

    .line 257
    .line 258
    const/high16 v26, 0x41800000    # 16.0f

    .line 259
    .line 260
    const v21, 0x4121999a    # 10.1f

    .line 261
    .line 262
    .line 263
    const v22, 0x418af5c3    # 17.37f

    .line 264
    .line 265
    .line 266
    const/high16 v23, 0x41200000    # 10.0f

    .line 267
    .line 268
    const v24, 0x4185999a    # 16.7f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const v6, 0x3e99999a    # 0.3f

    .line 282
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
    const/4 v2, 0x0

    .line 301
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x40800000    # 4.0f

    .line 318
    .line 319
    const/high16 v6, 0x41900000    # 18.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, -0x40d9999a    # -0.65f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, 0x3ed1eb85    # 0.41f

    .line 331
    .line 332
    .line 333
    const v26, -0x40b0a3d7    # -0.81f

    .line 334
    .line 335
    .line 336
    const/16 v21, 0x0

    .line 337
    .line 338
    const v22, -0x4151eb85    # -0.34f

    .line 339
    .line 340
    .line 341
    const v23, 0x3e23d70a    # 0.16f

    .line 342
    .line 343
    .line 344
    const v24, -0x40d70a3d    # -0.66f

    .line 345
    .line 346
    .line 347
    move-object/from16 v20, v2

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x41200000    # 10.0f

    .line 353
    .line 354
    const/high16 v26, 0x41700000    # 15.0f

    .line 355
    .line 356
    const v21, 0x40c33333    # 6.1f

    .line 357
    .line 358
    .line 359
    const v22, 0x41787ae1    # 15.53f

    .line 360
    .line 361
    .line 362
    const v23, 0x41007ae1    # 8.03f

    .line 363
    .line 364
    .line 365
    const/high16 v24, 0x41700000    # 15.0f

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, 0x3da3d70a    # 0.08f

    .line 371
    .line 372
    .line 373
    const v26, 0x3c23d70a    # 0.01f

    .line 374
    .line 375
    .line 376
    const v21, 0x3cf5c28f    # 0.03f

    .line 377
    .line 378
    .line 379
    const/16 v22, 0x0

    .line 380
    .line 381
    const v23, 0x3d4ccccd    # 0.05f

    .line 382
    .line 383
    .line 384
    const/16 v24, 0x0

    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v25, 0x3f170a3d    # 0.59f

    .line 390
    .line 391
    .line 392
    const v26, -0x40028f5c    # -1.98f

    .line 393
    .line 394
    .line 395
    const v21, 0x3dcccccd    # 0.1f

    .line 396
    .line 397
    .line 398
    const v22, -0x40cccccd    # -0.7f

    .line 399
    .line 400
    .line 401
    const v23, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const v24, -0x4050a3d7    # -1.37f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x41200000    # 10.0f

    .line 411
    .line 412
    const/high16 v26, 0x41500000    # 13.0f

    .line 413
    .line 414
    const v21, 0x41273333    # 10.45f

    .line 415
    .line 416
    .line 417
    const v22, 0x415028f6    # 13.01f

    .line 418
    .line 419
    .line 420
    const v23, 0x4123ae14    # 10.23f

    .line 421
    .line 422
    .line 423
    const/high16 v24, 0x41500000    # 13.0f

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v25, -0x3f2c7ae1    # -6.61f

    .line 429
    .line 430
    .line 431
    const v26, 0x3fe8f5c3    # 1.82f

    .line 432
    .line 433
    .line 434
    const v21, -0x3fe51eb8    # -2.42f

    .line 435
    .line 436
    .line 437
    const/16 v22, 0x0

    .line 438
    .line 439
    const v23, -0x3f6a3d71    # -4.68f

    .line 440
    .line 441
    .line 442
    const v24, 0x3f2b851f    # 0.67f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v25, 0x40000000    # 2.0f

    .line 449
    .line 450
    const v26, 0x418acccd    # 17.35f

    .line 451
    .line 452
    .line 453
    const v21, 0x4020a3d7    # 2.51f

    .line 454
    .line 455
    .line 456
    const v22, 0x417570a4    # 15.34f

    .line 457
    .line 458
    .line 459
    const/high16 v23, 0x40000000    # 2.0f

    .line 460
    .line 461
    const v24, 0x41828f5c    # 16.32f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x41a00000    # 20.0f

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, 0x411428f6    # 9.26f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v25, -0x4087ae14    # -0.97f

    .line 479
    .line 480
    .line 481
    const/high16 v26, -0x40000000    # -2.0f

    .line 482
    .line 483
    const v21, -0x4128f5c3    # -0.42f

    .line 484
    .line 485
    .line 486
    const v22, -0x40e66666    # -0.6f

    .line 487
    .line 488
    .line 489
    const/high16 v23, -0x40c00000    # -0.75f

    .line 490
    .line 491
    const v24, -0x405c28f6    # -1.28f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x40800000    # 4.0f

    .line 498
    .line 499
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v4, 0x41400000    # 12.0f

    .line 506
    .line 507
    const/high16 v6, 0x41200000    # 10.0f

    .line 508
    .line 509
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v25, 0x40800000    # 4.0f

    .line 513
    .line 514
    const/high16 v26, -0x3f800000    # -4.0f

    .line 515
    .line 516
    const v21, 0x400d70a4    # 2.21f

    .line 517
    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    const/high16 v23, 0x40800000    # 4.0f

    .line 522
    .line 523
    const v24, -0x401ae148    # -1.79f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v4, -0x401ae148    # -1.79f

    .line 530
    .line 531
    .line 532
    const/high16 v6, -0x3f800000    # -4.0f

    .line 533
    .line 534
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v4, 0x40b947ae    # 5.79f

    .line 538
    .line 539
    .line 540
    const/high16 v6, 0x40c00000    # 6.0f

    .line 541
    .line 542
    const/high16 v7, 0x41000000    # 8.0f

    .line 543
    .line 544
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v4, 0x40f947ae    # 7.79f

    .line 548
    .line 549
    .line 550
    const/high16 v6, 0x41400000    # 12.0f

    .line 551
    .line 552
    const/high16 v7, 0x41200000    # 10.0f

    .line 553
    .line 554
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v4, 0x40c00000    # 6.0f

    .line 561
    .line 562
    const/high16 v6, 0x41200000    # 10.0f

    .line 563
    .line 564
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v25, 0x40000000    # 2.0f

    .line 568
    .line 569
    const/high16 v26, 0x40000000    # 2.0f

    .line 570
    .line 571
    const v21, 0x3f8ccccd    # 1.1f

    .line 572
    .line 573
    .line 574
    const/high16 v23, 0x40000000    # 2.0f

    .line 575
    .line 576
    const v24, 0x3f666666    # 0.9f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, -0x4099999a    # -0.9f

    .line 583
    .line 584
    .line 585
    const/high16 v6, -0x40000000    # -2.0f

    .line 586
    .line 587
    const/high16 v7, 0x40000000    # 2.0f

    .line 588
    .line 589
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v4, 0x4111999a    # 9.1f

    .line 593
    .line 594
    .line 595
    const/high16 v6, 0x41000000    # 8.0f

    .line 596
    .line 597
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, 0x410e6666    # 8.9f

    .line 601
    .line 602
    .line 603
    const/high16 v6, 0x40c00000    # 6.0f

    .line 604
    .line 605
    const/high16 v7, 0x41200000    # 10.0f

    .line 606
    .line 607
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/high16 v6, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const/high16 v8, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v7, 0x0

    .line 622
    const-string v4, ""

    .line 623
    .line 624
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 625
    .line 626
    .line 627
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 632
    .line 633
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 634
    .line 635
    .line 636
    move-result-wide v6

    .line 637
    const/4 v0, 0x0

    .line 638
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 642
    .line 643
    .line 644
    move-result v10

    .line 645
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 646
    .line 647
    .line 648
    move-result v11

    .line 649
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 652
    .line 653
    .line 654
    const v0, 0x414a147b    # 12.63f

    .line 655
    .line 656
    .line 657
    const v2, 0x41a6a3d7    # 20.83f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x3efae148    # 0.49f

    .line 664
    .line 665
    .line 666
    const v2, -0x40466666    # -1.45f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, -0x4075c28f    # -1.08f

    .line 673
    .line 674
    .line 675
    const v18, -0x40deb852    # -0.63f

    .line 676
    .line 677
    .line 678
    const v13, -0x415c28f6    # -0.32f

    .line 679
    .line 680
    .line 681
    const v14, -0x4175c28f    # -0.27f

    .line 682
    .line 683
    .line 684
    const v15, -0x40d1eb85    # -0.68f

    .line 685
    .line 686
    .line 687
    const v16, -0x410a3d71    # -0.48f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v0, 0x41300000    # 11.0f

    .line 694
    .line 695
    const/high16 v2, 0x41900000    # 18.0f

    .line 696
    .line 697
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, -0x40000000    # -2.0f

    .line 701
    .line 702
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, -0x41666666    # -0.3f

    .line 706
    .line 707
    .line 708
    const v2, 0x3fbeb852    # 1.49f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v18, 0x3f2147ae    # 0.63f

    .line 715
    .line 716
    .line 717
    const v13, -0x41333333    # -0.4f

    .line 718
    .line 719
    .line 720
    const v14, 0x3e19999a    # 0.15f

    .line 721
    .line 722
    .line 723
    const v15, -0x40bd70a4    # -0.76f

    .line 724
    .line 725
    .line 726
    const v16, 0x3eb851ec    # 0.36f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, -0x41051eb8    # -0.49f

    .line 733
    .line 734
    .line 735
    const v2, -0x40466666    # -1.45f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v0, 0x3fdd70a4    # 1.73f

    .line 742
    .line 743
    .line 744
    const/high16 v2, -0x40800000    # -1.0f

    .line 745
    .line 746
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v0, 0x3f91eb85    # 1.14f

    .line 750
    .line 751
    .line 752
    const/high16 v2, 0x3f800000    # 1.0f

    .line 753
    .line 754
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, -0x428a3d71    # -0.06f

    .line 758
    .line 759
    .line 760
    const v13, -0x430a3d71    # -0.03f

    .line 761
    .line 762
    .line 763
    const v14, 0x3e570a3d    # 0.21f

    .line 764
    .line 765
    .line 766
    const v15, -0x428a3d71    # -0.06f

    .line 767
    .line 768
    .line 769
    const v16, 0x3ed1eb85    # 0.41f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x3d75c28f    # 0.06f

    .line 776
    .line 777
    .line 778
    const v2, 0x3f2147ae    # 0.63f

    .line 779
    .line 780
    .line 781
    const v4, 0x3cf5c28f    # 0.03f

    .line 782
    .line 783
    .line 784
    const v6, 0x3ed70a3d    # 0.42f

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, -0x406e147b    # -1.14f

    .line 791
    .line 792
    .line 793
    const/high16 v2, 0x3f800000    # 1.0f

    .line 794
    .line 795
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x3fdd70a4    # 1.73f

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x3fb9999a    # 1.45f

    .line 805
    .line 806
    .line 807
    const v2, -0x41051eb8    # -0.49f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v17, 0x3f8a3d71    # 1.08f

    .line 814
    .line 815
    .line 816
    const v13, 0x3ea3d70a    # 0.32f

    .line 817
    .line 818
    .line 819
    const v14, 0x3e8a3d71    # 0.27f

    .line 820
    .line 821
    .line 822
    const v15, 0x3f2e147b    # 0.68f

    .line 823
    .line 824
    .line 825
    const v16, 0x3ef5c28f    # 0.48f

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, 0x41a80000    # 21.0f

    .line 832
    .line 833
    const/high16 v2, 0x41800000    # 16.0f

    .line 834
    .line 835
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x40000000    # 2.0f

    .line 839
    .line 840
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x3e99999a    # 0.3f

    .line 844
    .line 845
    .line 846
    const v2, -0x404147ae    # -1.49f

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v18, -0x40deb852    # -0.63f

    .line 853
    .line 854
    .line 855
    const v13, 0x3ecccccd    # 0.4f

    .line 856
    .line 857
    .line 858
    const v14, -0x41e66666    # -0.15f

    .line 859
    .line 860
    .line 861
    const v15, 0x3f428f5c    # 0.76f

    .line 862
    .line 863
    .line 864
    const v16, -0x4147ae14    # -0.36f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, 0x3fb9999a    # 1.45f

    .line 871
    .line 872
    .line 873
    const v2, 0x3efae148    # 0.49f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v0, -0x40228f5c    # -1.73f

    .line 880
    .line 881
    .line 882
    const/high16 v2, 0x3f800000    # 1.0f

    .line 883
    .line 884
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, -0x406e147b    # -1.14f

    .line 888
    .line 889
    .line 890
    const/high16 v2, -0x40800000    # -1.0f

    .line 891
    .line 892
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const v17, 0x3d75c28f    # 0.06f

    .line 896
    .line 897
    .line 898
    const v13, 0x3cf5c28f    # 0.03f

    .line 899
    .line 900
    .line 901
    const v14, -0x41a8f5c3    # -0.21f

    .line 902
    .line 903
    .line 904
    const v15, 0x3d75c28f    # 0.06f

    .line 905
    .line 906
    .line 907
    const v16, -0x412e147b    # -0.41f

    .line 908
    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, -0x428a3d71    # -0.06f

    .line 914
    .line 915
    .line 916
    const v2, -0x40deb852    # -0.63f

    .line 917
    .line 918
    .line 919
    const v4, -0x430a3d71    # -0.03f

    .line 920
    .line 921
    .line 922
    const v6, -0x4128f5c3    # -0.42f

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, 0x3f91eb85    # 1.14f

    .line 929
    .line 930
    .line 931
    const/high16 v2, -0x40800000    # -1.0f

    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v0, 0x414a147b    # 12.63f

    .line 937
    .line 938
    .line 939
    const v2, 0x41a6a3d7    # 20.83f

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const/high16 v0, 0x41880000    # 17.0f

    .line 949
    .line 950
    const/high16 v2, 0x41900000    # 18.0f

    .line 951
    .line 952
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const/high16 v17, -0x40000000    # -2.0f

    .line 956
    .line 957
    const/high16 v18, -0x40000000    # -2.0f

    .line 958
    .line 959
    const v13, -0x40733333    # -1.1f

    .line 960
    .line 961
    .line 962
    const/4 v14, 0x0

    .line 963
    const/high16 v15, -0x40000000    # -2.0f

    .line 964
    .line 965
    const v16, -0x4099999a    # -0.9f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v17, 0x40000000    # 2.0f

    .line 972
    .line 973
    const/4 v13, 0x0

    .line 974
    const v14, -0x40733333    # -1.1f

    .line 975
    .line 976
    .line 977
    const v15, 0x3f666666    # 0.9f

    .line 978
    .line 979
    .line 980
    const/high16 v16, -0x40000000    # -2.0f

    .line 981
    .line 982
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v0, 0x3f666666    # 0.9f

    .line 986
    .line 987
    .line 988
    const/high16 v2, 0x40000000    # 2.0f

    .line 989
    .line 990
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v17, 0x41880000    # 17.0f

    .line 994
    .line 995
    const/high16 v18, 0x41900000    # 18.0f

    .line 996
    .line 997
    const/high16 v13, 0x41980000    # 19.0f

    .line 998
    .line 999
    const v14, 0x4188cccd    # 17.1f

    .line 1000
    .line 1001
    .line 1002
    const v15, 0x4190cccd    # 18.1f

    .line 1003
    .line 1004
    .line 1005
    const/high16 v16, 0x41900000    # 18.0f

    .line 1006
    .line 1007
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    const/16 v16, 0x3800

    .line 1018
    .line 1019
    const/16 v17, 0x0

    .line 1020
    .line 1021
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1022
    .line 1023
    const/4 v7, 0x0

    .line 1024
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1025
    .line 1026
    const/4 v13, 0x0

    .line 1027
    const/4 v14, 0x0

    .line 1028
    const/4 v15, 0x0

    .line 1029
    const-string v4, ""

    .line 1030
    .line 1031
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    sput-object v0, Landroidx/compose/material/icons/twotone/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1040
    .line 1041
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    return-object v0
.end method
