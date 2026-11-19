.class public final Landroidx/compose/material/icons/twotone/GradeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _grade:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGrade(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GradeKt;->_grade:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Grade"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x4188e148    # 17.11f

    .line 71
    .line 72
    .line 73
    const v7, 0x412d47ae    # 10.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v6, -0x3fe1eb85    # -2.47f

    .line 80
    .line 81
    .line 82
    const v7, -0x41a8f5c3    # -0.21f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v8, -0x40666666    # -1.2f

    .line 89
    .line 90
    .line 91
    const v9, -0x42333333    # -0.1f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v12, -0x410f5c29    # -0.47f

    .line 98
    .line 99
    .line 100
    const v13, -0x4071eb85    # -1.11f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v14, 0x40e428f6    # 7.13f

    .line 107
    .line 108
    .line 109
    const/high16 v15, 0x41400000    # 12.0f

    .line 110
    .line 111
    invoke-virtual {v4, v15, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v14, -0x4087ae14    # -0.97f

    .line 115
    .line 116
    .line 117
    const v2, 0x4011eb85    # 2.28f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v2, 0x3f8e147b    # 1.11f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v12, 0x3dcccccd    # 0.1f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v8, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v8, 0x3e570a3d    # 0.21f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v6, 0x3ff0a3d7    # 1.88f

    .line 142
    .line 143
    .line 144
    const v14, 0x3fd0a3d7    # 1.63f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v6, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v6, 0x3f68f5c3    # 0.91f

    .line 151
    .line 152
    .line 153
    const v7, 0x3f4a3d71    # 0.79f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v2, 0x3f95c28f    # 1.17f

    .line 160
    .line 161
    .line 162
    const v7, -0x4175c28f    # -0.27f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v2, 0x401ae148    # 2.42f

    .line 169
    .line 170
    .line 171
    const v8, -0x40ee147b    # -0.57f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v8, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v2, 0x400851ec    # 2.13f

    .line 178
    .line 179
    .line 180
    const v9, -0x405c28f6    # -1.28f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v2, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v9, -0x40deb852    # -0.63f

    .line 187
    .line 188
    .line 189
    const v12, 0x3f83d70a    # 1.03f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v9, 0x3f2147ae    # 0.63f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v9, 0x3fa3d70a    # 1.28f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v2, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v2, -0x3fe51eb8    # -2.42f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v8, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v2, -0x406a3d71    # -1.17f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v2, -0x40b5c28f    # -0.79f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const v4, -0x41a8f5c3    # -0.21f

    .line 233
    .line 234
    .line 235
    const/16 v16, 0x3800

    .line 236
    .line 237
    const v6, 0x3f8e147b    # 1.11f

    .line 238
    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    move v7, v4

    .line 243
    const-string v4, ""

    .line 244
    .line 245
    move v8, v6

    .line 246
    const v6, 0x3e99999a    # 0.3f

    .line 247
    .line 248
    .line 249
    move v12, v7

    .line 250
    const/4 v7, 0x0

    .line 251
    move/from16 v20, v8

    .line 252
    .line 253
    const v8, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    move/from16 v21, v9

    .line 257
    .line 258
    const/high16 v9, 0x3f800000    # 1.0f

    .line 259
    .line 260
    move/from16 v22, v12

    .line 261
    .line 262
    const/high16 v12, 0x3f800000    # 1.0f

    .line 263
    .line 264
    move/from16 v23, v13

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    move/from16 v24, v14

    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    move/from16 v25, v15

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    move-object/from16 v26, v0

    .line 274
    .line 275
    const/4 v0, 0x0

    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const/high16 v2, 0x41b00000    # 22.0f

    .line 306
    .line 307
    const v4, 0x4113d70a    # 9.24f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v2, -0x3f19eb85    # -7.19f

    .line 314
    .line 315
    .line 316
    const v6, -0x40e3d70a    # -0.61f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v2, 0x40000000    # 2.0f

    .line 323
    .line 324
    const/high16 v6, 0x41400000    # 12.0f

    .line 325
    .line 326
    invoke-virtual {v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v2, 0x41130a3d    # 9.19f

    .line 330
    .line 331
    .line 332
    const v7, 0x410a147b    # 8.63f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v2, 0x40000000    # 2.0f

    .line 339
    .line 340
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v2, 0x40aeb852    # 5.46f

    .line 344
    .line 345
    .line 346
    const v7, 0x40975c29    # 4.73f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v2, 0x40ba3d71    # 5.82f

    .line 353
    .line 354
    .line 355
    const/high16 v7, 0x41a80000    # 21.0f

    .line 356
    .line 357
    invoke-virtual {v0, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v2, 0x418a28f6    # 17.27f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v2, 0x419170a4    # 18.18f

    .line 367
    .line 368
    .line 369
    const/high16 v6, 0x41a80000    # 21.0f

    .line 370
    .line 371
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v2, -0x402e147b    # -1.64f

    .line 375
    .line 376
    .line 377
    const v6, -0x3f1f0a3d    # -7.03f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x41b00000    # 22.0f

    .line 384
    .line 385
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v2, 0x416970a4    # 14.59f

    .line 392
    .line 393
    .line 394
    const v4, 0x4166b852    # 14.42f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v2, 0x3f0f5c29    # 0.56f

    .line 401
    .line 402
    .line 403
    const v4, 0x401a3d71    # 2.41f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v2, -0x3ff851ec    # -2.12f

    .line 410
    .line 411
    .line 412
    const v4, -0x405c28f6    # -1.28f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v2, -0x407c28f6    # -1.03f

    .line 419
    .line 420
    .line 421
    const v4, -0x40e147ae    # -0.62f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, 0x3f1eb852    # 0.62f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v2, -0x3ff851ec    # -2.12f

    .line 434
    .line 435
    .line 436
    const v4, 0x3fa3d70a    # 1.28f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v2, 0x3f0f5c29    # 0.56f

    .line 443
    .line 444
    .line 445
    const v4, -0x3fe5c28f    # -2.41f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v2, 0x3e8a3d71    # 0.27f

    .line 452
    .line 453
    .line 454
    const v4, -0x4068f5c3    # -1.18f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v2, -0x40970a3d    # -0.91f

    .line 461
    .line 462
    .line 463
    const v4, -0x40b5c28f    # -0.79f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v2, -0x400f5c29    # -1.88f

    .line 470
    .line 471
    .line 472
    const v4, -0x402f5c29    # -1.63f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v2, 0x401e147b    # 2.47f

    .line 479
    .line 480
    .line 481
    const v4, -0x41a8f5c3    # -0.21f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v2, 0x3f99999a    # 1.2f

    .line 488
    .line 489
    .line 490
    const v4, -0x42333333    # -0.1f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v2, 0x3ef0a3d7    # 0.47f

    .line 497
    .line 498
    .line 499
    const v4, -0x4071eb85    # -1.11f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v2, 0x3f7851ec    # 0.97f

    .line 506
    .line 507
    .line 508
    const v4, -0x3feeb852    # -2.27f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x40128f5c    # 2.29f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v2, 0x3ef0a3d7    # 0.47f

    .line 521
    .line 522
    .line 523
    const v6, 0x3f8e147b    # 1.11f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v2, 0x3f99999a    # 1.2f

    .line 530
    .line 531
    .line 532
    const v4, 0x3dcccccd    # 0.1f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v2, 0x401e147b    # 2.47f

    .line 539
    .line 540
    .line 541
    const v4, 0x3e570a3d    # 0.21f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v2, -0x400f5c29    # -1.88f

    .line 548
    .line 549
    .line 550
    const v4, 0x3fd0a3d7    # 1.63f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v2, -0x40970a3d    # -0.91f

    .line 557
    .line 558
    .line 559
    const v4, 0x3f4a3d71    # 0.79f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v2, 0x3e8a3d71    # 0.27f

    .line 566
    .line 567
    .line 568
    const v4, 0x3f947ae1    # 1.16f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const/high16 v8, 0x3f800000    # 1.0f

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    sput-object v0, Landroidx/compose/material/icons/twotone/GradeKt;->_grade:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 597
    .line 598
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    return-object v0
.end method
