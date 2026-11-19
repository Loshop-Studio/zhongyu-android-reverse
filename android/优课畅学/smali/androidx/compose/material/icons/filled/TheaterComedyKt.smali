.class public final Landroidx/compose/material/icons/filled/TheaterComedyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTheaterComedy(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/TheaterComedyKt;->_theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.TheaterComedy"

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40f00000    # 7.5f

    .line 78
    .line 79
    const/high16 v26, 0x41b00000    # 22.0f

    .line 80
    .line 81
    const/high16 v21, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v22, 0x419c51ec    # 19.54f

    .line 84
    .line 85
    .line 86
    const v23, 0x408eb852    # 4.46f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x41b00000    # 22.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3fe28f5c    # -2.46f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x3f500000    # -5.5f

    .line 100
    .line 101
    const/high16 v7, 0x40b00000    # 5.5f

    .line 102
    .line 103
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41200000    # 10.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41840000    # 16.5f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40f00000    # 7.5f

    .line 125
    .line 126
    const/high16 v6, 0x41940000    # 18.5f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x40a00000    # 5.0f

    .line 132
    .line 133
    const/high16 v26, 0x41880000    # 17.0f

    .line 134
    .line 135
    const v21, 0x40c3d70a    # 6.12f

    .line 136
    .line 137
    .line 138
    const/high16 v22, 0x41940000    # 18.5f

    .line 139
    .line 140
    const/high16 v23, 0x40a00000    # 5.0f

    .line 141
    .line 142
    const v24, 0x418ea3d7    # 17.83f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x40a00000    # 5.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x40f00000    # 7.5f

    .line 154
    .line 155
    const/high16 v26, 0x41940000    # 18.5f

    .line 156
    .line 157
    const/high16 v21, 0x41200000    # 10.0f

    .line 158
    .line 159
    const v22, 0x418ea3d7    # 17.83f

    .line 160
    .line 161
    .line 162
    const v23, 0x410e147b    # 8.88f

    .line 163
    .line 164
    .line 165
    const/high16 v24, 0x41940000    # 18.5f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41500000    # 13.0f

    .line 174
    .line 175
    const/high16 v6, 0x41200000    # 10.0f

    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/high16 v26, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const v21, 0x3f0ccccd    # 0.55f

    .line 185
    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/high16 v23, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v24, 0x3ee66666    # 0.45f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const v22, 0x3f0ccccd    # 0.55f

    .line 202
    .line 203
    .line 204
    const v23, -0x4119999a    # -0.45f

    .line 205
    .line 206
    .line 207
    const/high16 v24, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, -0x4119999a    # -0.45f

    .line 213
    .line 214
    .line 215
    const/high16 v6, -0x40800000    # -1.0f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x41200000    # 10.0f

    .line 221
    .line 222
    const/high16 v26, 0x41500000    # 13.0f

    .line 223
    .line 224
    const/high16 v21, 0x41100000    # 9.0f

    .line 225
    .line 226
    const v22, 0x41573333    # 13.45f

    .line 227
    .line 228
    .line 229
    const v23, 0x41173333    # 9.45f

    .line 230
    .line 231
    .line 232
    const/high16 v24, 0x41500000    # 13.0f

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41500000    # 13.0f

    .line 241
    .line 242
    const/high16 v6, 0x40a00000    # 5.0f

    .line 243
    .line 244
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v26, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const v21, 0x3f0ccccd    # 0.55f

    .line 252
    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/high16 v23, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const v24, 0x3ee66666    # 0.45f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v25, -0x40800000    # -1.0f

    .line 265
    .line 266
    const/16 v21, 0x0

    .line 267
    .line 268
    const v22, 0x3f0ccccd    # 0.55f

    .line 269
    .line 270
    .line 271
    const v23, -0x4119999a    # -0.45f

    .line 272
    .line 273
    .line 274
    const/high16 v24, 0x3f800000    # 1.0f

    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    const/high16 v6, -0x40800000    # -1.0f

    .line 283
    .line 284
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, 0x40a00000    # 5.0f

    .line 288
    .line 289
    const/high16 v26, 0x41500000    # 13.0f

    .line 290
    .line 291
    const/high16 v21, 0x40800000    # 4.0f

    .line 292
    .line 293
    const v22, 0x41573333    # 13.45f

    .line 294
    .line 295
    .line 296
    const v23, 0x408e6666    # 4.45f

    .line 297
    .line 298
    .line 299
    const/high16 v24, 0x41500000    # 13.0f

    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/16 v16, 0x3800

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/high16 v6, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v8, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const/high16 v9, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/high16 v12, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const/4 v14, 0x0

    .line 326
    const/4 v15, 0x0

    .line 327
    const-string v4, ""

    .line 328
    .line 329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 330
    .line 331
    .line 332
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 339
    .line 340
    .line 341
    move-result-wide v6

    .line 342
    const/4 v0, 0x0

    .line 343
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41300000    # 11.0f

    .line 360
    .line 361
    const/high16 v2, 0x40400000    # 3.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40c00000    # 6.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x40400000    # 3.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40200000    # 2.5f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x40200000    # 2.5f

    .line 382
    .line 383
    const/high16 v18, -0x40400000    # -1.5f

    .line 384
    .line 385
    const v14, -0x40ab851f    # -0.83f

    .line 386
    .line 387
    .line 388
    const v15, 0x3f8f5c29    # 1.12f

    .line 389
    .line 390
    .line 391
    const/high16 v16, -0x40400000    # -1.5f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 397
    .line 398
    const v13, 0x3fb0a3d7    # 1.38f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, 0x40200000    # 2.5f

    .line 403
    .line 404
    const v16, 0x3f2b851f    # 0.67f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, -0x3f600000    # -5.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41600000    # 14.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3ec7ae14    # 0.39f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v18, 0x3f1c28f6    # 0.61f

    .line 427
    .line 428
    .line 429
    const/high16 v13, 0x3f400000    # 0.75f

    .line 430
    .line 431
    const v14, 0x3ec28f5c    # 0.38f

    .line 432
    .line 433
    .line 434
    const v15, 0x3fcccccd    # 1.6f

    .line 435
    .line 436
    .line 437
    const v16, 0x3f1c28f6    # 0.61f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x40b00000    # 5.5f

    .line 444
    .line 445
    const/high16 v18, -0x3f500000    # -5.5f

    .line 446
    .line 447
    const v13, 0x40428f5c    # 3.04f

    .line 448
    .line 449
    .line 450
    const/4 v14, 0x0

    .line 451
    const/high16 v15, 0x40b00000    # 5.5f

    .line 452
    .line 453
    const v16, -0x3fe28f5c    # -2.46f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x40400000    # 3.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41300000    # 11.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x410147ae    # 8.08f

    .line 473
    .line 474
    .line 475
    const/high16 v2, 0x41600000    # 14.0f

    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, -0x40800000    # -1.0f

    .line 481
    .line 482
    const/high16 v18, -0x40800000    # -1.0f

    .line 483
    .line 484
    const v13, -0x40f33333    # -0.55f

    .line 485
    .line 486
    .line 487
    const/high16 v15, -0x40800000    # -1.0f

    .line 488
    .line 489
    const v16, -0x4119999a    # -0.45f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x40f33333    # -0.55f

    .line 499
    .line 500
    .line 501
    const v15, 0x3ee66666    # 0.45f

    .line 502
    .line 503
    .line 504
    const/high16 v16, -0x40800000    # -1.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x3ee66666    # 0.45f

    .line 510
    .line 511
    .line 512
    const/high16 v2, 0x3f800000    # 1.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x41600000    # 14.0f

    .line 518
    .line 519
    const v18, 0x410147ae    # 8.08f

    .line 520
    .line 521
    .line 522
    const/high16 v13, 0x41700000    # 15.0f

    .line 523
    .line 524
    const v14, 0x40f47ae1    # 7.64f

    .line 525
    .line 526
    .line 527
    const v15, 0x4168cccd    # 14.55f

    .line 528
    .line 529
    .line 530
    const v16, 0x410147ae    # 8.08f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41980000    # 19.0f

    .line 540
    .line 541
    const v2, 0x410147ae    # 8.08f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, -0x40800000    # -1.0f

    .line 548
    .line 549
    const/high16 v18, -0x40800000    # -1.0f

    .line 550
    .line 551
    const v13, -0x40f33333    # -0.55f

    .line 552
    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    const/high16 v15, -0x40800000    # -1.0f

    .line 556
    .line 557
    const v16, -0x4119999a    # -0.45f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, -0x40f33333    # -0.55f

    .line 567
    .line 568
    .line 569
    const v15, 0x3ee66666    # 0.45f

    .line 570
    .line 571
    .line 572
    const/high16 v16, -0x40800000    # -1.0f

    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x3ee66666    # 0.45f

    .line 578
    .line 579
    .line 580
    const/high16 v2, 0x3f800000    # 1.0f

    .line 581
    .line 582
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, 0x41980000    # 19.0f

    .line 586
    .line 587
    const v18, 0x410147ae    # 8.08f

    .line 588
    .line 589
    .line 590
    const/high16 v13, 0x41a00000    # 20.0f

    .line 591
    .line 592
    const v14, 0x40f47ae1    # 7.64f

    .line 593
    .line 594
    .line 595
    const v15, 0x419c6666    # 19.55f

    .line 596
    .line 597
    .line 598
    const v16, 0x410147ae    # 8.08f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    const/16 v16, 0x3800

    .line 612
    .line 613
    const/16 v17, 0x0

    .line 614
    .line 615
    const/high16 v6, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const/high16 v12, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const/4 v14, 0x0

    .line 622
    const/4 v15, 0x0

    .line 623
    const-string v4, ""

    .line 624
    .line 625
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    sput-object v0, Landroidx/compose/material/icons/filled/TheaterComedyKt;->_theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 634
    .line 635
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    return-object v0
.end method
