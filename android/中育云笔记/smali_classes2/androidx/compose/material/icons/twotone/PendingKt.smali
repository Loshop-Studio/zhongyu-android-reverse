.class public final Landroidx/compose/material/icons/twotone/PendingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pending:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPending(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PendingKt;->_pending:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Pending"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x408d70a4    # 4.42f

    .line 101
    .line 102
    .line 103
    const v23, 0x40651eb8    # 3.58f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x3f9ae148    # -3.58f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x3f000000    # -8.0f

    .line 115
    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41400000    # 12.0f

    .line 122
    .line 123
    const/high16 v26, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v21, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const v22, 0x40f28f5c    # 7.58f

    .line 128
    .line 129
    .line 130
    const v23, 0x41835c29    # 16.42f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40e00000    # 7.0f

    .line 142
    .line 143
    const/high16 v6, 0x41580000    # 13.5f

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, -0x40400000    # -1.5f

    .line 149
    .line 150
    const/high16 v26, -0x40400000    # -1.5f

    .line 151
    .line 152
    const v21, -0x40ab851f    # -0.83f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const/high16 v23, -0x40400000    # -1.5f

    .line 158
    .line 159
    const v24, -0x40d47ae1    # -0.67f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const v22, -0x40ab851f    # -0.83f

    .line 170
    .line 171
    .line 172
    const v23, 0x3f2b851f    # 0.67f

    .line 173
    .line 174
    .line 175
    const/high16 v24, -0x40400000    # -1.5f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, 0x3f2b851f    # 0.67f

    .line 181
    .line 182
    .line 183
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 184
    .line 185
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x40e00000    # 7.0f

    .line 189
    .line 190
    const/high16 v26, 0x41580000    # 13.5f

    .line 191
    .line 192
    const/high16 v21, 0x41080000    # 8.5f

    .line 193
    .line 194
    const v22, 0x414d47ae    # 12.83f

    .line 195
    .line 196
    .line 197
    const v23, 0x40fa8f5c    # 7.83f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x41580000    # 13.5f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41580000    # 13.5f

    .line 209
    .line 210
    const/high16 v6, 0x41400000    # 12.0f

    .line 211
    .line 212
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, -0x40400000    # -1.5f

    .line 216
    .line 217
    const/high16 v26, -0x40400000    # -1.5f

    .line 218
    .line 219
    const v21, -0x40ab851f    # -0.83f

    .line 220
    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const/high16 v23, -0x40400000    # -1.5f

    .line 225
    .line 226
    const v24, -0x40d47ae1    # -0.67f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const v22, -0x40ab851f    # -0.83f

    .line 237
    .line 238
    .line 239
    const v23, 0x3f2b851f    # 0.67f

    .line 240
    .line 241
    .line 242
    const/high16 v24, -0x40400000    # -1.5f

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x3f2b851f    # 0.67f

    .line 248
    .line 249
    .line 250
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 251
    .line 252
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x41400000    # 12.0f

    .line 256
    .line 257
    const/high16 v26, 0x41580000    # 13.5f

    .line 258
    .line 259
    const/high16 v21, 0x41580000    # 13.5f

    .line 260
    .line 261
    const v22, 0x414d47ae    # 12.83f

    .line 262
    .line 263
    .line 264
    const v23, 0x414d47ae    # 12.83f

    .line 265
    .line 266
    .line 267
    const/high16 v24, 0x41580000    # 13.5f

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x41880000    # 17.0f

    .line 276
    .line 277
    const/high16 v6, 0x41580000    # 13.5f

    .line 278
    .line 279
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v25, -0x40400000    # -1.5f

    .line 283
    .line 284
    const/high16 v26, -0x40400000    # -1.5f

    .line 285
    .line 286
    const v21, -0x40ab851f    # -0.83f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/high16 v23, -0x40400000    # -1.5f

    .line 292
    .line 293
    const v24, -0x40d47ae1    # -0.67f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 300
    .line 301
    const/16 v21, 0x0

    .line 302
    .line 303
    const v22, -0x40ab851f    # -0.83f

    .line 304
    .line 305
    .line 306
    const v23, 0x3f2b851f    # 0.67f

    .line 307
    .line 308
    .line 309
    const/high16 v24, -0x40400000    # -1.5f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x3f2b851f    # 0.67f

    .line 315
    .line 316
    .line 317
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v25, 0x41880000    # 17.0f

    .line 323
    .line 324
    const/high16 v26, 0x41580000    # 13.5f

    .line 325
    .line 326
    const/high16 v21, 0x41940000    # 18.5f

    .line 327
    .line 328
    const v22, 0x414d47ae    # 12.83f

    .line 329
    .line 330
    .line 331
    const v23, 0x418ea3d7    # 17.83f

    .line 332
    .line 333
    .line 334
    const/high16 v24, 0x41580000    # 13.5f

    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const v6, 0x3e99999a    # 0.3f

    .line 351
    .line 352
    .line 353
    const v8, 0x3e99999a    # 0.3f

    .line 354
    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const/high16 v9, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v12, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    const/4 v15, 0x0

    .line 364
    const-string v4, ""

    .line 365
    .line 366
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 367
    .line 368
    .line 369
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 374
    .line 375
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 376
    .line 377
    .line 378
    move-result-wide v6

    .line 379
    const/4 v2, 0x0

    .line 380
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x40000000    # 2.0f

    .line 397
    .line 398
    const/high16 v6, 0x41400000    # 12.0f

    .line 399
    .line 400
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v25, 0x40000000    # 2.0f

    .line 404
    .line 405
    const/high16 v26, 0x41400000    # 12.0f

    .line 406
    .line 407
    const v21, 0x40cf5c29    # 6.48f

    .line 408
    .line 409
    .line 410
    const/high16 v22, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/high16 v23, 0x40000000    # 2.0f

    .line 413
    .line 414
    const v24, 0x40cf5c29    # 6.48f

    .line 415
    .line 416
    .line 417
    move-object/from16 v20, v2

    .line 418
    .line 419
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v25, 0x41200000    # 10.0f

    .line 423
    .line 424
    const/high16 v26, 0x41200000    # 10.0f

    .line 425
    .line 426
    const/16 v21, 0x0

    .line 427
    .line 428
    const v22, 0x40b0a3d7    # 5.52f

    .line 429
    .line 430
    .line 431
    const v23, 0x408f5c29    # 4.48f

    .line 432
    .line 433
    .line 434
    const/high16 v24, 0x41200000    # 10.0f

    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v4, -0x3f70a3d7    # -4.48f

    .line 440
    .line 441
    .line 442
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 443
    .line 444
    const/high16 v7, 0x41200000    # 10.0f

    .line 445
    .line 446
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v25, 0x41400000    # 12.0f

    .line 450
    .line 451
    const/high16 v26, 0x40000000    # 2.0f

    .line 452
    .line 453
    const/high16 v21, 0x41b00000    # 22.0f

    .line 454
    .line 455
    const v22, 0x40cf5c29    # 6.48f

    .line 456
    .line 457
    .line 458
    const v23, 0x418c28f6    # 17.52f

    .line 459
    .line 460
    .line 461
    const/high16 v24, 0x40000000    # 2.0f

    .line 462
    .line 463
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, 0x41a00000    # 20.0f

    .line 470
    .line 471
    const/high16 v6, 0x41400000    # 12.0f

    .line 472
    .line 473
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, -0x3f000000    # -8.0f

    .line 477
    .line 478
    const/high16 v26, -0x3f000000    # -8.0f

    .line 479
    .line 480
    const v21, -0x3f728f5c    # -4.42f

    .line 481
    .line 482
    .line 483
    const/16 v22, 0x0

    .line 484
    .line 485
    const/high16 v23, -0x3f000000    # -8.0f

    .line 486
    .line 487
    const v24, -0x3f9ae148    # -3.58f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v25, 0x41000000    # 8.0f

    .line 494
    .line 495
    const/16 v21, 0x0

    .line 496
    .line 497
    const v22, -0x3f728f5c    # -4.42f

    .line 498
    .line 499
    .line 500
    const v23, 0x40651eb8    # 3.58f

    .line 501
    .line 502
    .line 503
    const/high16 v24, -0x3f000000    # -8.0f

    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v4, 0x40651eb8    # 3.58f

    .line 509
    .line 510
    .line 511
    const/high16 v6, 0x41000000    # 8.0f

    .line 512
    .line 513
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v25, 0x41400000    # 12.0f

    .line 517
    .line 518
    const/high16 v26, 0x41a00000    # 20.0f

    .line 519
    .line 520
    const/high16 v21, 0x41a00000    # 20.0f

    .line 521
    .line 522
    const v22, 0x41835c29    # 16.42f

    .line 523
    .line 524
    .line 525
    const v23, 0x41835c29    # 16.42f

    .line 526
    .line 527
    .line 528
    const/high16 v24, 0x41a00000    # 20.0f

    .line 529
    .line 530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    const/high16 v6, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v8, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const-string v4, ""

    .line 546
    .line 547
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 548
    .line 549
    .line 550
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 555
    .line 556
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 557
    .line 558
    .line 559
    move-result-wide v6

    .line 560
    const/4 v2, 0x0

    .line 561
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 565
    .line 566
    .line 567
    move-result v10

    .line 568
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 569
    .line 570
    .line 571
    move-result v11

    .line 572
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 575
    .line 576
    .line 577
    const/high16 v4, 0x40e00000    # 7.0f

    .line 578
    .line 579
    const/high16 v6, 0x41400000    # 12.0f

    .line 580
    .line 581
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/4 v4, 0x0

    .line 585
    const/high16 v6, -0x40400000    # -1.5f

    .line 586
    .line 587
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v26, 0x40400000    # 3.0f

    .line 591
    .line 592
    const/16 v27, 0x0

    .line 593
    .line 594
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 595
    .line 596
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 597
    .line 598
    const/16 v23, 0x0

    .line 599
    .line 600
    const/16 v24, 0x1

    .line 601
    .line 602
    const/16 v25, 0x1

    .line 603
    .line 604
    move-object/from16 v20, v2

    .line 605
    .line 606
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 610
    .line 611
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const-string v4, ""

    .line 622
    .line 623
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 624
    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 633
    .line 634
    .line 635
    move-result-wide v6

    .line 636
    const/4 v2, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const/high16 v4, 0x41400000    # 12.0f

    .line 654
    .line 655
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/4 v4, 0x0

    .line 659
    const/high16 v6, -0x40400000    # -1.5f

    .line 660
    .line 661
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v26, 0x40400000    # 3.0f

    .line 665
    .line 666
    move-object/from16 v20, v2

    .line 667
    .line 668
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 672
    .line 673
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    const/high16 v6, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v7, 0x0

    .line 683
    const-string v4, ""

    .line 684
    .line 685
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 686
    .line 687
    .line 688
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 689
    .line 690
    .line 691
    move-result v3

    .line 692
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 693
    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 695
    .line 696
    .line 697
    move-result-wide v6

    .line 698
    const/4 v0, 0x0

    .line 699
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 703
    .line 704
    .line 705
    move-result v10

    .line 706
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 707
    .line 708
    .line 709
    move-result v11

    .line 710
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x41880000    # 17.0f

    .line 716
    .line 717
    const/high16 v2, 0x41400000    # 12.0f

    .line 718
    .line 719
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/4 v0, 0x0

    .line 723
    const/high16 v2, -0x40400000    # -1.5f

    .line 724
    .line 725
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v18, 0x40400000    # 3.0f

    .line 729
    .line 730
    const/16 v19, 0x0

    .line 731
    .line 732
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 733
    .line 734
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 735
    .line 736
    const/16 v16, 0x1

    .line 737
    .line 738
    const/16 v17, 0x1

    .line 739
    .line 740
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 744
    .line 745
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/16 v16, 0x3800

    .line 753
    .line 754
    const/16 v17, 0x0

    .line 755
    .line 756
    const/high16 v6, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/4 v7, 0x0

    .line 759
    const/high16 v12, 0x3f800000    # 1.0f

    .line 760
    .line 761
    const/4 v13, 0x0

    .line 762
    const/4 v14, 0x0

    .line 763
    const-string v4, ""

    .line 764
    .line 765
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    sput-object v0, Landroidx/compose/material/icons/twotone/PendingKt;->_pending:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    return-object v0
.end method
