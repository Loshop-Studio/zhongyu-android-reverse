.class public final Landroidx/compose/material/icons/rounded/SettingsEthernetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsEthernet:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsEthernet(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsEthernetKt;->_settingsEthernet:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsEthernet"

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
    const v0, 0x40f6b852    # 7.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x40d6b852    # 6.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x407d70a4    # -1.02f

    .line 94
    .line 95
    .line 96
    const v16, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x4092e148    # 4.59f

    .line 103
    .line 104
    .line 105
    const v2, -0x3f6d1eb8    # -4.59f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v18, 0x3fb47ae1    # 1.41f

    .line 114
    .line 115
    .line 116
    const v14, 0x3ec7ae14    # 0.39f

    .line 117
    .line 118
    .line 119
    const v15, -0x413851ec    # -0.39f

    .line 120
    .line 121
    .line 122
    const v16, 0x3f828f5c    # 1.02f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3fb47ae1    # 1.41f

    .line 132
    .line 133
    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    const v13, 0x3ec7ae14    # 0.39f

    .line 137
    .line 138
    .line 139
    const v15, 0x3f828f5c    # 1.02f

    .line 140
    .line 141
    .line 142
    const v16, 0x3ec7ae14    # 0.39f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const v18, -0x404b851f    # -1.41f

    .line 155
    .line 156
    .line 157
    const v14, -0x413851ec    # -0.39f

    .line 158
    .line 159
    .line 160
    const v15, 0x3ec7ae14    # 0.39f

    .line 161
    .line 162
    .line 163
    const v16, -0x407d70a4    # -1.02f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x40751eb8    # 3.83f

    .line 170
    .line 171
    .line 172
    const/high16 v2, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, -0x3f87ae14    # -3.88f

    .line 178
    .line 179
    .line 180
    const v2, 0x407851ec    # 3.88f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x40f6b852    # 7.71f

    .line 187
    .line 188
    .line 189
    const v18, 0x40d6b852    # 6.71f

    .line 190
    .line 191
    .line 192
    const v13, 0x410170a4    # 8.09f

    .line 193
    .line 194
    .line 195
    const v14, 0x40f75c29    # 7.73f

    .line 196
    .line 197
    .line 198
    const v15, 0x410170a4    # 8.09f

    .line 199
    .line 200
    .line 201
    const v16, 0x40e2e148    # 7.09f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x418251ec    # 16.29f

    .line 211
    .line 212
    .line 213
    const v2, 0x40d6b852    # 6.71f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const v18, 0x3fb47ae1    # 1.41f

    .line 225
    .line 226
    .line 227
    const v13, -0x413851ec    # -0.39f

    .line 228
    .line 229
    .line 230
    const v14, 0x3ec7ae14    # 0.39f

    .line 231
    .line 232
    .line 233
    const v15, -0x413851ec    # -0.39f

    .line 234
    .line 235
    .line 236
    const v16, 0x3f828f5c    # 1.02f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x41a15c29    # 20.17f

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x41400000    # 12.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x3f87ae14    # -3.88f

    .line 251
    .line 252
    .line 253
    const v2, 0x407851ec    # 3.88f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/4 v0, 0x0

    .line 263
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3fb47ae1    # 1.41f

    .line 267
    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    const v13, 0x3ec7ae14    # 0.39f

    .line 272
    .line 273
    .line 274
    const v15, 0x3f828f5c    # 1.02f

    .line 275
    .line 276
    .line 277
    const v16, 0x3ec7ae14    # 0.39f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x4092e148    # 4.59f

    .line 284
    .line 285
    .line 286
    const v2, -0x3f6d1eb8    # -4.59f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const v18, -0x404b851f    # -1.41f

    .line 295
    .line 296
    .line 297
    const v14, -0x413851ec    # -0.39f

    .line 298
    .line 299
    .line 300
    const v15, 0x3ec7ae14    # 0.39f

    .line 301
    .line 302
    .line 303
    const v16, -0x407d70a4    # -1.02f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x3f6d1eb8    # -4.59f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x418251ec    # 16.29f

    .line 316
    .line 317
    .line 318
    const v18, 0x40d6b852    # 6.71f

    .line 319
    .line 320
    .line 321
    const v13, 0x418a8f5c    # 17.32f

    .line 322
    .line 323
    .line 324
    const v14, 0x40ca3d71    # 6.32f

    .line 325
    .line 326
    .line 327
    const v15, 0x418570a4    # 16.68f

    .line 328
    .line 329
    .line 330
    const v16, 0x40ca3d71    # 6.32f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41000000    # 8.0f

    .line 340
    .line 341
    const/high16 v2, 0x41500000    # 13.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v18, -0x40800000    # -1.0f

    .line 352
    .line 353
    const v13, 0x3f0ccccd    # 0.55f

    .line 354
    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    const/high16 v15, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const v16, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/4 v0, 0x0

    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, -0x40800000    # -1.0f

    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const v14, -0x40f33333    # -0.55f

    .line 373
    .line 374
    .line 375
    const v15, -0x4119999a    # -0.45f

    .line 376
    .line 377
    .line 378
    const/high16 v16, -0x40800000    # -1.0f

    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v18, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const v13, -0x40f33333    # -0.55f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/high16 v15, -0x40800000    # -1.0f

    .line 393
    .line 394
    const v16, 0x3ee66666    # 0.45f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41000000    # 8.0f

    .line 404
    .line 405
    const/high16 v18, 0x41500000    # 13.0f

    .line 406
    .line 407
    const/high16 v13, 0x40e00000    # 7.0f

    .line 408
    .line 409
    const v14, 0x4148cccd    # 12.55f

    .line 410
    .line 411
    .line 412
    const v15, 0x40ee6666    # 7.45f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x41500000    # 13.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41500000    # 13.0f

    .line 424
    .line 425
    const/high16 v2, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/high16 v18, -0x40800000    # -1.0f

    .line 436
    .line 437
    const v13, 0x3f0ccccd    # 0.55f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const/high16 v15, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const v16, -0x4119999a    # -0.45f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/4 v0, 0x0

    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, -0x40800000    # -1.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, -0x40f33333    # -0.55f

    .line 457
    .line 458
    .line 459
    const v15, -0x4119999a    # -0.45f

    .line 460
    .line 461
    .line 462
    const/high16 v16, -0x40800000    # -1.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v18, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const v13, -0x40f33333    # -0.55f

    .line 473
    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    const/high16 v15, -0x40800000    # -1.0f

    .line 477
    .line 478
    const v16, 0x3ee66666    # 0.45f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, 0x41400000    # 12.0f

    .line 488
    .line 489
    const/high16 v18, 0x41500000    # 13.0f

    .line 490
    .line 491
    const/high16 v13, 0x41300000    # 11.0f

    .line 492
    .line 493
    const v14, 0x4148cccd    # 12.55f

    .line 494
    .line 495
    .line 496
    const v15, 0x41373333    # 11.45f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x41500000    # 13.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41300000    # 11.0f

    .line 508
    .line 509
    const/high16 v2, 0x41800000    # 16.0f

    .line 510
    .line 511
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, -0x40800000    # -1.0f

    .line 518
    .line 519
    const/high16 v18, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v13, -0x40f33333    # -0.55f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, -0x40800000    # -1.0f

    .line 526
    .line 527
    const v16, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/4 v0, 0x0

    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const v14, 0x3f0ccccd    # 0.55f

    .line 541
    .line 542
    .line 543
    const v15, 0x3ee66666    # 0.45f

    .line 544
    .line 545
    .line 546
    const/high16 v16, 0x3f800000    # 1.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v18, -0x40800000    # -1.0f

    .line 555
    .line 556
    const v13, 0x3f0ccccd    # 0.55f

    .line 557
    .line 558
    .line 559
    const/4 v14, 0x0

    .line 560
    const/high16 v15, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const v16, -0x4119999a    # -0.45f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, 0x41800000    # 16.0f

    .line 572
    .line 573
    const/high16 v18, 0x41300000    # 11.0f

    .line 574
    .line 575
    const/high16 v13, 0x41880000    # 17.0f

    .line 576
    .line 577
    const v14, 0x41373333    # 11.45f

    .line 578
    .line 579
    .line 580
    const v15, 0x41846666    # 16.55f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x41300000    # 11.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const/16 v16, 0x3800

    .line 596
    .line 597
    const/16 v17, 0x0

    .line 598
    .line 599
    const/high16 v6, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/high16 v8, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    const/high16 v9, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v12, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const/4 v14, 0x0

    .line 610
    const/4 v15, 0x0

    .line 611
    const-string v4, ""

    .line 612
    .line 613
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsEthernetKt;->_settingsEthernet:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 622
    .line 623
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    return-object v0
.end method
