.class public final Landroidx/compose/material/icons/twotone/PublicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _public:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPublic(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PublicKt;->_public:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Public"

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
    const v4, 0x416fd70a    # 14.99f

    .line 71
    .line 72
    .line 73
    const v6, 0x4092e148    # 4.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v26, 0x40000000    # 2.0f

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const v22, 0x3f8ccccd    # 1.1f

    .line 91
    .line 92
    .line 93
    const v23, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v24, 0x40000000    # 2.0f

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, -0x40000000    # -2.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x40000000    # 2.0f

    .line 109
    .line 110
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, -0x40800000    # -1.0f

    .line 114
    .line 115
    const/high16 v26, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const v22, 0x3f0ccccd    # 0.55f

    .line 118
    .line 119
    .line 120
    const v23, -0x4119999a    # -0.45f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x3f800000    # 1.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, -0x40000000    # -2.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x40000000    # 2.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const v21, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const/high16 v23, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const v24, 0x3ee66666    # 0.45f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x3f800000    # 1.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x3ff33333    # 1.9f

    .line 169
    .line 170
    .line 171
    const v26, 0x3fb33333    # 1.4f

    .line 172
    .line 173
    .line 174
    const v21, 0x3f63d70a    # 0.89f

    .line 175
    .line 176
    .line 177
    const v23, 0x3fd1eb85    # 1.64f

    .line 178
    .line 179
    .line 180
    const v24, 0x3f170a3d    # 0.59f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x41a00000    # 20.0f

    .line 187
    .line 188
    const/high16 v26, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v21, 0x4199851f    # 19.19f

    .line 191
    .line 192
    .line 193
    const v22, 0x417fae14    # 15.98f

    .line 194
    .line 195
    .line 196
    const/high16 v23, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const v24, 0x416147ae    # 14.08f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v25, -0x3f5fae14    # -5.01f

    .line 205
    .line 206
    .line 207
    const v26, -0x3f12e148    # -7.41f

    .line 208
    .line 209
    .line 210
    const/16 v21, 0x0

    .line 211
    .line 212
    const v22, -0x3fa9999a    # -3.35f

    .line 213
    .line 214
    .line 215
    const v23, -0x3ffae148    # -2.08f

    .line 216
    .line 217
    .line 218
    const v24, -0x3f38a3d7    # -6.23f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41800000    # 16.0f

    .line 228
    .line 229
    const v6, 0x410fd70a    # 8.99f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, -0x40800000    # -1.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, -0x3f670a3d    # -4.78f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v25, 0x40800000    # 4.0f

    .line 247
    .line 248
    const/high16 v26, 0x41400000    # 12.0f

    .line 249
    .line 250
    const v21, 0x40828f5c    # 4.08f

    .line 251
    .line 252
    .line 253
    const v22, 0x412ca3d7    # 10.79f

    .line 254
    .line 255
    .line 256
    const/high16 v23, 0x40800000    # 4.0f

    .line 257
    .line 258
    const v24, 0x41363d71    # 11.39f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v25, 0x40dfae14    # 6.99f

    .line 265
    .line 266
    .line 267
    const v26, 0x40fdc28f    # 7.93f

    .line 268
    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const v22, 0x40823d71    # 4.07f

    .line 273
    .line 274
    .line 275
    const v23, 0x4043d70a    # 3.06f

    .line 276
    .line 277
    .line 278
    const v24, 0x40edc28f    # 7.43f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x41900000    # 18.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, -0x40000000    # -2.0f

    .line 290
    .line 291
    const/high16 v26, -0x40000000    # -2.0f

    .line 292
    .line 293
    const v21, -0x40733333    # -1.1f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/high16 v23, -0x40000000    # -2.0f

    .line 299
    .line 300
    const v24, -0x4099999a    # -0.9f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/16 v16, 0x3800

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const v6, 0x3e99999a    # 0.3f

    .line 318
    .line 319
    .line 320
    const v8, 0x3e99999a    # 0.3f

    .line 321
    .line 322
    .line 323
    const/4 v7, 0x0

    .line 324
    const/high16 v9, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v12, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const/4 v14, 0x0

    .line 330
    const/4 v15, 0x0

    .line 331
    const-string v4, ""

    .line 332
    .line 333
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 334
    .line 335
    .line 336
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 341
    .line 342
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 343
    .line 344
    .line 345
    move-result-wide v6

    .line 346
    const/4 v0, 0x0

    .line 347
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41400000    # 12.0f

    .line 364
    .line 365
    const/high16 v2, 0x40000000    # 2.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40000000    # 2.0f

    .line 371
    .line 372
    const/high16 v18, 0x41400000    # 12.0f

    .line 373
    .line 374
    const v13, 0x40cf5c29    # 6.48f

    .line 375
    .line 376
    .line 377
    const/high16 v14, 0x40000000    # 2.0f

    .line 378
    .line 379
    const/high16 v15, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v16, 0x40cf5c29    # 6.48f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x408f5c29    # 4.48f

    .line 388
    .line 389
    .line 390
    const/high16 v2, 0x41200000    # 10.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, -0x3f70a3d7    # -4.48f

    .line 396
    .line 397
    .line 398
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 399
    .line 400
    const/high16 v4, 0x41200000    # 10.0f

    .line 401
    .line 402
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x418c28f6    # 17.52f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x41400000    # 12.0f

    .line 409
    .line 410
    const/high16 v4, 0x40000000    # 2.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x419f70a4    # 19.93f

    .line 419
    .line 420
    .line 421
    const v2, 0x412fd70a    # 10.99f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x40800000    # 4.0f

    .line 428
    .line 429
    const v13, 0x40e1eb85    # 7.06f

    .line 430
    .line 431
    .line 432
    const v14, 0x419b70a4    # 19.43f

    .line 433
    .line 434
    .line 435
    const/high16 v15, 0x40800000    # 4.0f

    .line 436
    .line 437
    const v16, 0x41808f5c    # 16.07f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3e570a3d    # 0.21f

    .line 444
    .line 445
    .line 446
    const v18, -0x401c28f6    # -1.78f

    .line 447
    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const v14, -0x40e3d70a    # -0.61f

    .line 451
    .line 452
    .line 453
    const v15, 0x3da3d70a    # 0.08f

    .line 454
    .line 455
    .line 456
    const v16, -0x40651eb8    # -1.21f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41700000    # 15.0f

    .line 463
    .line 464
    const v2, 0x410fd70a    # 8.99f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x3f800000    # 1.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x40000000    # 2.0f

    .line 476
    .line 477
    const/high16 v18, 0x40000000    # 2.0f

    .line 478
    .line 479
    const v14, 0x3f8ccccd    # 1.1f

    .line 480
    .line 481
    .line 482
    const v15, 0x3f666666    # 0.9f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x40000000    # 2.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3ff70a3d    # 1.93f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x418f1eb8    # 17.89f

    .line 500
    .line 501
    .line 502
    const v2, 0x418b3333    # 17.4f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, -0x400ccccd    # -1.9f

    .line 509
    .line 510
    .line 511
    const v18, -0x404ccccd    # -1.4f

    .line 512
    .line 513
    .line 514
    const v13, -0x417ae148    # -0.26f

    .line 515
    .line 516
    .line 517
    const v14, -0x40b0a3d7    # -0.81f

    .line 518
    .line 519
    .line 520
    const/high16 v15, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v16, -0x404ccccd    # -1.4f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, -0x40800000    # -1.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, -0x40800000    # -1.0f

    .line 539
    .line 540
    const/high16 v18, -0x40800000    # -1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, -0x40f33333    # -0.55f

    .line 544
    .line 545
    .line 546
    const v15, -0x4119999a    # -0.45f

    .line 547
    .line 548
    .line 549
    const/high16 v16, -0x40800000    # -1.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, -0x3f400000    # -6.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, -0x40000000    # -2.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x40000000    # 2.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const v13, 0x3f0ccccd    # 0.55f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const/high16 v15, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const v16, -0x4119999a    # -0.45f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x40e00000    # 7.0f

    .line 584
    .line 585
    const v2, 0x412fd70a    # 10.99f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40000000    # 2.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x40000000    # 2.0f

    .line 597
    .line 598
    const/high16 v18, -0x40000000    # -2.0f

    .line 599
    .line 600
    const v13, 0x3f8ccccd    # 1.1f

    .line 601
    .line 602
    .line 603
    const/high16 v15, 0x40000000    # 2.0f

    .line 604
    .line 605
    const v16, -0x4099999a    # -0.9f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, -0x412e147b    # -0.41f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x41a00000    # 20.0f

    .line 618
    .line 619
    const/high16 v18, 0x41400000    # 12.0f

    .line 620
    .line 621
    const v13, 0x418f5c29    # 17.92f

    .line 622
    .line 623
    .line 624
    const v14, 0x40b8a3d7    # 5.77f

    .line 625
    .line 626
    .line 627
    const/high16 v15, 0x41a00000    # 20.0f

    .line 628
    .line 629
    const v16, 0x410a6666    # 8.65f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x3ff8f5c3    # -2.11f

    .line 636
    .line 637
    .line 638
    const v18, 0x40accccd    # 5.4f

    .line 639
    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    const v14, 0x40051eb8    # 2.08f

    .line 643
    .line 644
    .line 645
    const v15, -0x40b0a3d7    # -0.81f

    .line 646
    .line 647
    .line 648
    const v16, 0x407eb852    # 3.98f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    const/16 v16, 0x3800

    .line 662
    .line 663
    const/16 v17, 0x0

    .line 664
    .line 665
    const/high16 v6, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/high16 v8, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v7, 0x0

    .line 670
    const/high16 v12, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sput-object v0, Landroidx/compose/material/icons/twotone/PublicKt;->_public:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    return-object v0
.end method
