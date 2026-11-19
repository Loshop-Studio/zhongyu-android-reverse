.class public final Landroidx/compose/material/icons/twotone/BugReportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBugReport(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BugReport"

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
    const v4, 0x417d47ae    # 15.83f

    .line 71
    .line 72
    .line 73
    const v6, 0x411a6666    # 9.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x41775c29    # 15.46f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41100000    # 9.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v25, -0x40651eb8    # -1.21f

    .line 88
    .line 89
    .line 90
    const v26, -0x405851ec    # -1.31f

    .line 91
    .line 92
    .line 93
    const v21, -0x41666666    # -0.3f

    .line 94
    .line 95
    .line 96
    const v22, -0x40f851ec    # -0.53f

    .line 97
    .line 98
    .line 99
    const v23, -0x40ca3d71    # -0.71f

    .line 100
    .line 101
    .line 102
    const v24, -0x408a3d71    # -0.96f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40e3d70a    # -0.61f

    .line 111
    .line 112
    .line 113
    const v6, -0x4128f5c3    # -0.42f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, -0x40d1eb85    # -0.68f

    .line 120
    .line 121
    .line 122
    const v6, -0x41dc28f6    # -0.16f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, 0x41400000    # 12.0f

    .line 129
    .line 130
    const/high16 v26, 0x40e00000    # 7.0f

    .line 131
    .line 132
    const v21, 0x414a147b    # 12.63f

    .line 133
    .line 134
    .line 135
    const v22, 0x40e147ae    # 7.04f

    .line 136
    .line 137
    .line 138
    const v23, 0x41451eb8    # 12.32f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x40e00000    # 7.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, -0x408f5c29    # -0.94f

    .line 147
    .line 148
    .line 149
    const v26, 0x3de147ae    # 0.11f

    .line 150
    .line 151
    .line 152
    const v21, -0x416147ae    # -0.31f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const v23, -0x40deb852    # -0.63f

    .line 158
    .line 159
    .line 160
    const v24, 0x3d23d70a    # 0.04f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, -0x40c28f5c    # -0.74f

    .line 167
    .line 168
    .line 169
    const v6, 0x3e3851ec    # 0.18f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, -0x40ee147b    # -0.57f

    .line 176
    .line 177
    .line 178
    const v6, 0x3ecccccd    # 0.4f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, -0x40651eb8    # -1.21f

    .line 185
    .line 186
    .line 187
    const v26, 0x3fa7ae14    # 1.31f

    .line 188
    .line 189
    .line 190
    const v21, -0x41051eb8    # -0.49f

    .line 191
    .line 192
    .line 193
    const v22, 0x3eae147b    # 0.34f

    .line 194
    .line 195
    .line 196
    const v23, -0x40970a3d    # -0.91f

    .line 197
    .line 198
    .line 199
    const v24, 0x3f4a3d71    # 0.79f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, -0x41428f5c    # -0.37f

    .line 206
    .line 207
    .line 208
    const v6, 0x3f266666    # 0.65f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, -0x42333333    # -0.1f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, -0x4270a3d7    # -0.07f

    .line 221
    .line 222
    .line 223
    const v26, 0x3f333333    # 0.7f

    .line 224
    .line 225
    .line 226
    const v21, -0x42dc28f6    # -0.04f

    .line 227
    .line 228
    .line 229
    const v22, 0x3e6b851f    # 0.23f

    .line 230
    .line 231
    .line 232
    const v23, -0x4270a3d7    # -0.07f

    .line 233
    .line 234
    .line 235
    const v24, 0x3ef5c28f    # 0.48f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x40800000    # 4.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, 0x3d8f5c29    # 0.07f

    .line 247
    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const v22, 0x3e6147ae    # 0.22f

    .line 252
    .line 253
    .line 254
    const v23, 0x3cf5c28f    # 0.03f

    .line 255
    .line 256
    .line 257
    const v24, 0x3ef0a3d7    # 0.47f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x3dcccccd    # 0.1f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x3ebd70a4    # 0.37f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x405d70a4    # 3.46f

    .line 276
    .line 277
    .line 278
    const/high16 v26, 0x40000000    # 2.0f

    .line 279
    .line 280
    const v21, 0x3f3851ec    # 0.72f

    .line 281
    .line 282
    .line 283
    const v22, 0x3f9eb852    # 1.24f

    .line 284
    .line 285
    .line 286
    const v23, 0x40028f5c    # 2.04f

    .line 287
    .line 288
    .line 289
    const/high16 v24, 0x40000000    # 2.0f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x402f5c29    # 2.74f

    .line 295
    .line 296
    .line 297
    const v6, 0x405d70a4    # 3.46f

    .line 298
    .line 299
    .line 300
    const v7, -0x40bae148    # -0.77f

    .line 301
    .line 302
    .line 303
    const/high16 v8, -0x40000000    # -2.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, -0x40dc28f6    # -0.64f

    .line 309
    .line 310
    .line 311
    const v6, 0x3ebd70a4    # 0.37f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x3dcccccd    # 0.1f

    .line 318
    .line 319
    .line 320
    const v6, -0x40d9999a    # -0.65f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x3d8f5c29    # 0.07f

    .line 327
    .line 328
    .line 329
    const v26, -0x40ca3d71    # -0.71f

    .line 330
    .line 331
    .line 332
    const v21, 0x3d23d70a    # 0.04f

    .line 333
    .line 334
    .line 335
    const v22, -0x418a3d71    # -0.24f

    .line 336
    .line 337
    .line 338
    const v23, 0x3d8f5c29    # 0.07f

    .line 339
    .line 340
    .line 341
    const v24, -0x41051eb8    # -0.49f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, -0x3f800000    # -4.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v25, -0x4270a3d7    # -0.07f

    .line 353
    .line 354
    .line 355
    const v26, -0x40cccccd    # -0.7f

    .line 356
    .line 357
    .line 358
    const/16 v21, 0x0

    .line 359
    .line 360
    const v22, -0x419eb852    # -0.22f

    .line 361
    .line 362
    .line 363
    const v23, -0x430a3d71    # -0.03f

    .line 364
    .line 365
    .line 366
    const v24, -0x410f5c29    # -0.47f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v4, -0x42333333    # -0.1f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41800000    # 16.0f

    .line 382
    .line 383
    const/high16 v6, 0x41600000    # 14.0f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, -0x3f800000    # -4.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v4, -0x40000000    # -2.0f

    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x40800000    # 4.0f

    .line 399
    .line 400
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v4, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x41400000    # 12.0f

    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, -0x3f800000    # -4.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, -0x40000000    # -2.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x40800000    # 4.0f

    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, 0x40000000    # 2.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/16 v16, 0x3800

    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    const v6, 0x3e99999a    # 0.3f

    .line 448
    .line 449
    .line 450
    const v8, 0x3e99999a    # 0.3f

    .line 451
    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const/high16 v9, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v12, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const-string v4, ""

    .line 462
    .line 463
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 464
    .line 465
    .line 466
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 471
    .line 472
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 473
    .line 474
    .line 475
    move-result-wide v6

    .line 476
    const/4 v0, 0x0

    .line 477
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41000000    # 8.0f

    .line 494
    .line 495
    const/high16 v2, 0x41a00000    # 20.0f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, -0x3fcc28f6    # -2.81f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x40170a3d    # -1.82f

    .line 507
    .line 508
    .line 509
    const v18, -0x40051eb8    # -1.96f

    .line 510
    .line 511
    .line 512
    const v13, -0x4119999a    # -0.45f

    .line 513
    .line 514
    .line 515
    const v14, -0x40b851ec    # -0.78f

    .line 516
    .line 517
    .line 518
    const v15, -0x40770a3d    # -1.07f

    .line 519
    .line 520
    .line 521
    const v16, -0x40466666    # -1.45f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41880000    # 17.0f

    .line 528
    .line 529
    const v2, 0x408d1eb8    # 4.41f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x417970a4    # 15.59f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x40400000    # 3.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, -0x3ff51eb8    # -2.17f

    .line 544
    .line 545
    .line 546
    const v2, 0x400ae148    # 2.17f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41400000    # 12.0f

    .line 553
    .line 554
    const/high16 v18, 0x40a00000    # 5.0f

    .line 555
    .line 556
    const v13, 0x414f5c29    # 12.96f

    .line 557
    .line 558
    .line 559
    const v14, 0x40a1eb85    # 5.06f

    .line 560
    .line 561
    .line 562
    const v15, 0x4147d70a    # 12.49f

    .line 563
    .line 564
    .line 565
    const/high16 v16, 0x40a00000    # 5.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x404b851f    # -1.41f

    .line 571
    .line 572
    .line 573
    const v2, 0x3e2e147b    # 0.17f

    .line 574
    .line 575
    .line 576
    const v4, -0x408a3d71    # -0.96f

    .line 577
    .line 578
    .line 579
    const v6, 0x3d75c28f    # 0.06f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x41068f5c    # 8.41f

    .line 586
    .line 587
    .line 588
    const/high16 v2, 0x40400000    # 3.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x40e00000    # 7.0f

    .line 594
    .line 595
    const v2, 0x408d1eb8    # 4.41f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x3fcf5c29    # 1.62f

    .line 602
    .line 603
    .line 604
    const v2, 0x3fd0a3d7    # 1.63f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, 0x40d9eb85    # 6.81f

    .line 611
    .line 612
    .line 613
    const/high16 v18, 0x41000000    # 8.0f

    .line 614
    .line 615
    const v13, 0x40fc28f6    # 7.88f

    .line 616
    .line 617
    .line 618
    const v14, 0x40d1999a    # 6.55f

    .line 619
    .line 620
    .line 621
    const v15, 0x40e851ec    # 7.26f

    .line 622
    .line 623
    .line 624
    const v16, 0x40e70a3d    # 7.22f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41000000    # 8.0f

    .line 631
    .line 632
    const/high16 v2, 0x40800000    # 4.0f

    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x40000000    # 2.0f

    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x4005c28f    # 2.09f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v17, -0x4247ae14    # -0.09f

    .line 649
    .line 650
    .line 651
    const/high16 v18, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const v13, -0x42b33333    # -0.05f

    .line 654
    .line 655
    .line 656
    const v14, 0x3ea8f5c3    # 0.33f

    .line 657
    .line 658
    .line 659
    const v15, -0x4247ae14    # -0.09f

    .line 660
    .line 661
    .line 662
    const v16, 0x3f28f5c3    # 0.66f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x3f800000    # 1.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, 0x41400000    # 12.0f

    .line 674
    .line 675
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x40000000    # 2.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x3f800000    # 1.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, 0x3db851ec    # 0.09f

    .line 692
    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const v14, 0x3eae147b    # 0.34f

    .line 696
    .line 697
    .line 698
    const v15, 0x3d23d70a    # 0.04f

    .line 699
    .line 700
    .line 701
    const v16, 0x3f2b851f    # 0.67f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v0, 0x41800000    # 16.0f

    .line 708
    .line 709
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v0, 0x40000000    # 2.0f

    .line 713
    .line 714
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x4033d70a    # 2.81f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v17, 0x40a6147b    # 5.19f

    .line 724
    .line 725
    .line 726
    const/high16 v18, 0x40400000    # 3.0f

    .line 727
    .line 728
    const v13, 0x3f851eb8    # 1.04f

    .line 729
    .line 730
    .line 731
    const v14, 0x3fe51eb8    # 1.79f

    .line 732
    .line 733
    .line 734
    const v15, 0x403e147b    # 2.97f

    .line 735
    .line 736
    .line 737
    const/high16 v16, 0x40400000    # 3.0f

    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x40a6147b    # 5.19f

    .line 743
    .line 744
    .line 745
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 746
    .line 747
    const v4, 0x4084cccd    # 4.15f

    .line 748
    .line 749
    .line 750
    const v6, -0x40651eb8    # -1.21f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x41900000    # 18.0f

    .line 757
    .line 758
    const/high16 v2, 0x41a00000    # 20.0f

    .line 759
    .line 760
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, -0x40000000    # -2.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, -0x3ffa3d71    # -2.09f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v17, 0x3db851ec    # 0.09f

    .line 775
    .line 776
    .line 777
    const/high16 v18, -0x40800000    # -1.0f

    .line 778
    .line 779
    const v13, 0x3d4ccccd    # 0.05f

    .line 780
    .line 781
    .line 782
    const v14, -0x41570a3d    # -0.33f

    .line 783
    .line 784
    .line 785
    const v15, 0x3db851ec    # 0.09f

    .line 786
    .line 787
    .line 788
    const v16, -0x40d70a3d    # -0.66f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v0, -0x40800000    # -1.0f

    .line 795
    .line 796
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/high16 v0, 0x40000000    # 2.0f

    .line 800
    .line 801
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v0, -0x40000000    # -2.0f

    .line 805
    .line 806
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v0, -0x40800000    # -1.0f

    .line 813
    .line 814
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, -0x4247ae14    # -0.09f

    .line 818
    .line 819
    .line 820
    const/4 v13, 0x0

    .line 821
    const v14, -0x4151eb85    # -0.34f

    .line 822
    .line 823
    .line 824
    const v15, -0x42dc28f6    # -0.04f

    .line 825
    .line 826
    .line 827
    const v16, -0x40d47ae1    # -0.67f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x41200000    # 10.0f

    .line 834
    .line 835
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x41000000    # 8.0f

    .line 839
    .line 840
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v0, 0x41400000    # 12.0f

    .line 847
    .line 848
    const/high16 v2, 0x41800000    # 16.0f

    .line 849
    .line 850
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x40400000    # 3.0f

    .line 854
    .line 855
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v17, -0x4270a3d7    # -0.07f

    .line 859
    .line 860
    .line 861
    const v18, 0x3f333333    # 0.7f

    .line 862
    .line 863
    .line 864
    const v14, 0x3e6147ae    # 0.22f

    .line 865
    .line 866
    .line 867
    const v15, -0x430a3d71    # -0.03f

    .line 868
    .line 869
    .line 870
    const v16, 0x3ef0a3d7    # 0.47f

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, -0x42333333    # -0.1f

    .line 877
    .line 878
    .line 879
    const v2, 0x3f266666    # 0.65f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v0, -0x41428f5c    # -0.37f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, -0x3fa28f5c    # -3.46f

    .line 892
    .line 893
    .line 894
    const/high16 v18, 0x40000000    # 2.0f

    .line 895
    .line 896
    const v13, -0x40c7ae14    # -0.72f

    .line 897
    .line 898
    .line 899
    const v14, 0x3f9eb852    # 1.24f

    .line 900
    .line 901
    .line 902
    const v15, -0x3ffd70a4    # -2.04f

    .line 903
    .line 904
    .line 905
    const/high16 v16, 0x40000000    # 2.0f

    .line 906
    .line 907
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v0, -0x3fd0a3d7    # -2.74f

    .line 911
    .line 912
    .line 913
    const v2, -0x3fa28f5c    # -3.46f

    .line 914
    .line 915
    .line 916
    const v4, -0x40bae148    # -0.77f

    .line 917
    .line 918
    .line 919
    const/high16 v6, -0x40000000    # -2.0f

    .line 920
    .line 921
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, -0x40dc28f6    # -0.64f

    .line 925
    .line 926
    .line 927
    const v2, -0x41428f5c    # -0.37f

    .line 928
    .line 929
    .line 930
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, -0x42333333    # -0.1f

    .line 934
    .line 935
    .line 936
    const v2, -0x40d9999a    # -0.65f

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const/high16 v17, 0x41000000    # 8.0f

    .line 943
    .line 944
    const/high16 v18, 0x41700000    # 15.0f

    .line 945
    .line 946
    const v13, 0x41007ae1    # 8.03f

    .line 947
    .line 948
    .line 949
    const v14, 0x4177851f    # 15.47f

    .line 950
    .line 951
    .line 952
    const/high16 v15, 0x41000000    # 8.0f

    .line 953
    .line 954
    const v16, 0x4173851f    # 15.22f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v0, -0x3f800000    # -4.0f

    .line 961
    .line 962
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v17, 0x3d8f5c29    # 0.07f

    .line 966
    .line 967
    .line 968
    const v18, -0x40cccccd    # -0.7f

    .line 969
    .line 970
    .line 971
    const/4 v13, 0x0

    .line 972
    const v14, -0x419eb852    # -0.22f

    .line 973
    .line 974
    .line 975
    const v15, 0x3cf5c28f    # 0.03f

    .line 976
    .line 977
    .line 978
    const v16, -0x410f5c29    # -0.47f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const v0, 0x3dcccccd    # 0.1f

    .line 985
    .line 986
    .line 987
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    const v0, 0x3ebd70a4    # 0.37f

    .line 991
    .line 992
    .line 993
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, 0x3f9ae148    # 1.21f

    .line 997
    .line 998
    .line 999
    const v18, -0x405851ec    # -1.31f

    .line 1000
    .line 1001
    .line 1002
    const v13, 0x3e99999a    # 0.3f

    .line 1003
    .line 1004
    .line 1005
    const v14, -0x40fae148    # -0.52f

    .line 1006
    .line 1007
    .line 1008
    const v15, 0x3f3851ec    # 0.72f

    .line 1009
    .line 1010
    .line 1011
    const v16, -0x4087ae14    # -0.97f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v0, 0x3f11eb85    # 0.57f

    .line 1018
    .line 1019
    .line 1020
    const v2, -0x413851ec    # -0.39f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const v0, 0x3f3d70a4    # 0.74f

    .line 1027
    .line 1028
    .line 1029
    const v2, -0x41c7ae14    # -0.18f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const v17, 0x3f70a3d7    # 0.94f

    .line 1036
    .line 1037
    .line 1038
    const v18, -0x420a3d71    # -0.12f

    .line 1039
    .line 1040
    .line 1041
    const v13, 0x3e9eb852    # 0.31f

    .line 1042
    .line 1043
    .line 1044
    const v14, -0x425c28f6    # -0.08f

    .line 1045
    .line 1046
    .line 1047
    const v15, 0x3f2147ae    # 0.63f

    .line 1048
    .line 1049
    .line 1050
    const v16, -0x420a3d71    # -0.12f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v17, 0x3f733333    # 0.95f

    .line 1057
    .line 1058
    .line 1059
    const v18, 0x3df5c28f    # 0.12f

    .line 1060
    .line 1061
    .line 1062
    const v13, 0x3ea3d70a    # 0.32f

    .line 1063
    .line 1064
    .line 1065
    const/4 v14, 0x0

    .line 1066
    const v16, 0x3d23d70a    # 0.04f

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const v0, 0x3f2e147b    # 0.68f

    .line 1073
    .line 1074
    .line 1075
    const v2, 0x3e23d70a    # 0.16f

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v0, 0x3f1c28f6    # 0.61f

    .line 1082
    .line 1083
    .line 1084
    const v2, 0x3ed70a3d    # 0.42f

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const v17, 0x3f9ae148    # 1.21f

    .line 1091
    .line 1092
    .line 1093
    const v18, 0x3fa7ae14    # 1.31f

    .line 1094
    .line 1095
    .line 1096
    const/high16 v13, 0x3f000000    # 0.5f

    .line 1097
    .line 1098
    const v14, 0x3eae147b    # 0.34f

    .line 1099
    .line 1100
    .line 1101
    const v15, 0x3f68f5c3    # 0.91f

    .line 1102
    .line 1103
    .line 1104
    const v16, 0x3f47ae14    # 0.78f

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    const v0, 0x3ec28f5c    # 0.38f

    .line 1111
    .line 1112
    .line 1113
    const v2, 0x3f266666    # 0.65f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const v0, 0x3dcccccd    # 0.1f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v17, 0x3d8f5c29    # 0.07f

    .line 1126
    .line 1127
    .line 1128
    const v18, 0x3f30a3d7    # 0.69f

    .line 1129
    .line 1130
    .line 1131
    const v13, 0x3d23d70a    # 0.04f

    .line 1132
    .line 1133
    .line 1134
    const v14, 0x3e6147ae    # 0.22f

    .line 1135
    .line 1136
    .line 1137
    const v15, 0x3d8f5c29    # 0.07f

    .line 1138
    .line 1139
    .line 1140
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1147
    .line 1148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const/high16 v0, 0x41600000    # 14.0f

    .line 1155
    .line 1156
    const/high16 v2, 0x41200000    # 10.0f

    .line 1157
    .line 1158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const/high16 v0, 0x40800000    # 4.0f

    .line 1162
    .line 1163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const/high16 v0, 0x40000000    # 2.0f

    .line 1167
    .line 1168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v0, -0x3f800000    # -4.0f

    .line 1172
    .line 1173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    const/high16 v0, 0x41200000    # 10.0f

    .line 1180
    .line 1181
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1182
    .line 1183
    .line 1184
    const/high16 v0, 0x40800000    # 4.0f

    .line 1185
    .line 1186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1187
    .line 1188
    .line 1189
    const/high16 v0, 0x40000000    # 2.0f

    .line 1190
    .line 1191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1192
    .line 1193
    .line 1194
    const/high16 v0, -0x3f800000    # -4.0f

    .line 1195
    .line 1196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v2

    .line 1206
    const/16 v16, 0x3800

    .line 1207
    .line 1208
    const/16 v17, 0x0

    .line 1209
    .line 1210
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1211
    .line 1212
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1213
    .line 1214
    const/4 v7, 0x0

    .line 1215
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1216
    .line 1217
    const/4 v13, 0x0

    .line 1218
    const/4 v14, 0x0

    .line 1219
    const/4 v15, 0x0

    .line 1220
    const-string v4, ""

    .line 1221
    .line 1222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    sput-object v0, Landroidx/compose/material/icons/twotone/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1231
    .line 1232
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1233
    .line 1234
    .line 1235
    return-object v0
.end method
