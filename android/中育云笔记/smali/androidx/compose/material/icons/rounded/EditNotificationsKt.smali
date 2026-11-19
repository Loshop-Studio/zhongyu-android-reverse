.class public final Landroidx/compose/material/icons/rounded/EditNotificationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _editNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEditNotifications(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EditNotificationsKt;->_editNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EditNotifications"

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
    const/high16 v0, 0x40c80000    # 6.25f

    .line 71
    .line 72
    const v2, 0x418ca3d7    # 17.58f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x3fe28f5c    # 1.77f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, -0x3f651eb8    # -4.84f

    .line 85
    .line 86
    .line 87
    const v2, 0x409ae148    # 4.84f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, 0x41628f5c    # 14.16f

    .line 94
    .line 95
    .line 96
    const/high16 v18, 0x41500000    # 13.0f

    .line 97
    .line 98
    const v13, 0x4166b852    # 14.42f

    .line 99
    .line 100
    .line 101
    const v14, 0x414f3333    # 12.95f

    .line 102
    .line 103
    .line 104
    const v15, 0x4164a3d7    # 14.29f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x41500000    # 13.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x4151999a    # 13.1f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, -0x41000000    # -0.5f

    .line 119
    .line 120
    const/high16 v18, -0x41000000    # -0.5f

    .line 121
    .line 122
    const v13, -0x4170a3d7    # -0.28f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const/high16 v15, -0x41000000    # -0.5f

    .line 127
    .line 128
    const v16, -0x419eb852    # -0.22f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, -0x407851ec    # -1.06f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3e19999a    # 0.15f

    .line 141
    .line 142
    .line 143
    const v18, -0x414ccccd    # -0.35f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, -0x41fae148    # -0.13f

    .line 148
    .line 149
    .line 150
    const v15, 0x3d4ccccd    # 0.05f

    .line 151
    .line 152
    .line 153
    const v16, -0x417ae148    # -0.26f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40c80000    # 6.25f

    .line 160
    .line 161
    const v2, 0x418ca3d7    # 17.58f

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
    const v0, 0x41a6cccd    # 20.85f

    .line 171
    .line 172
    .line 173
    const v2, 0x40b9eb85    # 5.81f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x407851ec    # -1.06f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, -0x40ca3d71    # -0.71f

    .line 186
    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const v13, -0x41b33333    # -0.2f

    .line 191
    .line 192
    .line 193
    const v14, -0x41b33333    # -0.2f

    .line 194
    .line 195
    .line 196
    const v15, -0x40fd70a4    # -0.51f

    .line 197
    .line 198
    .line 199
    const v16, -0x41b33333    # -0.2f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x3f59999a    # 0.85f

    .line 206
    .line 207
    .line 208
    const v2, -0x40a66666    # -0.85f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x3fe28f5c    # 1.77f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3f59999a    # 0.85f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x41a6cccd    # 20.85f

    .line 227
    .line 228
    .line 229
    const v18, 0x40b9eb85    # 5.81f

    .line 230
    .line 231
    .line 232
    const v13, 0x41a86666    # 21.05f

    .line 233
    .line 234
    .line 235
    const v14, 0x40ca3d71    # 6.32f

    .line 236
    .line 237
    .line 238
    const v15, 0x41a86666    # 21.05f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x40c00000    # 6.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41900000    # 18.0f

    .line 250
    .line 251
    const/high16 v2, 0x41a00000    # 20.0f

    .line 252
    .line 253
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, -0x40800000    # -1.0f

    .line 257
    .line 258
    const/high16 v18, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, 0x3f0ccccd    # 0.55f

    .line 262
    .line 263
    .line 264
    const v15, -0x4119999a    # -0.45f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x3f800000    # 1.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40a00000    # 5.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v18, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v13, -0x40f33333    # -0.55f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const/high16 v15, -0x40800000    # -1.0f

    .line 284
    .line 285
    const v16, -0x4119999a    # -0.45f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x3ee66666    # 0.45f

    .line 292
    .line 293
    .line 294
    const/high16 v2, -0x40800000    # -1.0f

    .line 295
    .line 296
    const/high16 v4, 0x3f800000    # 1.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, -0x3f200000    # -7.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x40900000    # 4.5f

    .line 312
    .line 313
    const v18, -0x3f466666    # -5.8f

    .line 314
    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, -0x3fcd70a4    # -2.79f

    .line 318
    .line 319
    .line 320
    const v15, 0x3ff47ae1    # 1.91f

    .line 321
    .line 322
    .line 323
    const v16, -0x3f5b851f    # -5.14f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x40600000    # 3.5f

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, 0x41400000    # 12.0f

    .line 335
    .line 336
    const/high16 v18, 0x40000000    # 2.0f

    .line 337
    .line 338
    const/high16 v13, 0x41280000    # 10.5f

    .line 339
    .line 340
    const v14, 0x402ae148    # 2.67f

    .line 341
    .line 342
    .line 343
    const v15, 0x4132b852    # 11.17f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x40000000    # 2.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x3f2b851f    # 0.67f

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 355
    .line 356
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x3f333333    # 0.7f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x400d70a4    # 2.21f

    .line 366
    .line 367
    .line 368
    const v18, 0x3f8b851f    # 1.09f

    .line 369
    .line 370
    .line 371
    const v13, 0x3f51eb85    # 0.82f

    .line 372
    .line 373
    .line 374
    const v14, 0x3e570a3d    # 0.21f

    .line 375
    .line 376
    .line 377
    const v15, 0x3fc8f5c3    # 1.57f

    .line 378
    .line 379
    .line 380
    const v16, 0x3f170a3d    # 0.59f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x3f6f5c29    # -4.52f

    .line 387
    .line 388
    .line 389
    const v2, 0x4090a3d7    # 4.52f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x40e8f5c3    # -0.59f

    .line 396
    .line 397
    .line 398
    const v18, 0x3fb47ae1    # 1.41f

    .line 399
    .line 400
    .line 401
    const v13, -0x413d70a4    # -0.38f

    .line 402
    .line 403
    .line 404
    const v14, 0x3ec28f5c    # 0.38f

    .line 405
    .line 406
    .line 407
    const v15, -0x40e8f5c3    # -0.59f

    .line 408
    .line 409
    .line 410
    const v16, 0x3f6147ae    # 0.88f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41500000    # 13.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40000000    # 2.0f

    .line 422
    .line 423
    const/high16 v18, 0x40000000    # 2.0f

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const v14, 0x3f8ccccd    # 1.1f

    .line 427
    .line 428
    .line 429
    const v15, 0x3f666666    # 0.9f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3fe28f5c    # 1.77f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3fb47ae1    # 1.41f

    .line 444
    .line 445
    .line 446
    const v18, -0x40e8f5c3    # -0.59f

    .line 447
    .line 448
    .line 449
    const v13, 0x3f07ae14    # 0.53f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const v15, 0x3f851eb8    # 1.04f

    .line 454
    .line 455
    .line 456
    const v16, -0x41a8f5c3    # -0.21f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x41433333    # 12.2f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x41900000    # 18.0f

    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x41880000    # 17.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x3f800000    # 1.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41a00000    # 20.0f

    .line 481
    .line 482
    const/high16 v18, 0x41900000    # 18.0f

    .line 483
    .line 484
    const v13, 0x419c6666    # 19.55f

    .line 485
    .line 486
    .line 487
    const/high16 v14, 0x41880000    # 17.0f

    .line 488
    .line 489
    const/high16 v15, 0x41a00000    # 20.0f

    .line 490
    .line 491
    const v16, 0x418b999a    # 17.45f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41200000    # 10.0f

    .line 501
    .line 502
    const/high16 v2, 0x41a00000    # 20.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x40800000    # 4.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, -0x40000000    # -2.0f

    .line 513
    .line 514
    const/high16 v18, 0x40000000    # 2.0f

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const v14, 0x3f8ccccd    # 1.1f

    .line 518
    .line 519
    .line 520
    const v15, -0x4099999a    # -0.9f

    .line 521
    .line 522
    .line 523
    const/high16 v16, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x41a8cccd    # 21.1f

    .line 529
    .line 530
    .line 531
    const/high16 v2, 0x41200000    # 10.0f

    .line 532
    .line 533
    const/high16 v4, 0x41a00000    # 20.0f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    const/16 v16, 0x3800

    .line 546
    .line 547
    const/16 v17, 0x0

    .line 548
    .line 549
    const/high16 v6, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/high16 v8, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v7, 0x0

    .line 554
    const/high16 v9, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/high16 v12, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const/4 v15, 0x0

    .line 560
    const-string v4, ""

    .line 561
    .line 562
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sput-object v0, Landroidx/compose/material/icons/rounded/EditNotificationsKt;->_editNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    return-object v0
.end method
