.class public final Landroidx/compose/material/icons/rounded/PolicyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _policy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPolicy(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Policy"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v6, 0x40c9999a    # 6.3f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x4067ae14    # -1.19f

    .line 79
    .line 80
    .line 81
    const v26, -0x4015c28f    # -1.83f

    .line 82
    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, -0x40b5c28f    # -0.79f

    .line 87
    .line 88
    .line 89
    const v23, -0x410f5c29    # -0.47f

    .line 90
    .line 91
    .line 92
    const v24, -0x403eb852    # -1.51f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x3fb8f5c3    # -3.11f

    .line 101
    .line 102
    .line 103
    const/high16 v6, -0x3f200000    # -7.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x4030a3d7    # -1.62f

    .line 109
    .line 110
    .line 111
    const/16 v26, 0x0

    .line 112
    .line 113
    const v21, -0x40fae148    # -0.52f

    .line 114
    .line 115
    .line 116
    const v22, -0x41947ae1    # -0.23f

    .line 117
    .line 118
    .line 119
    const v23, -0x4071eb85    # -1.11f

    .line 120
    .line 121
    .line 122
    const v24, -0x41947ae1    # -0.23f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x40470a3d    # 3.11f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x40400000    # 3.0f

    .line 135
    .line 136
    const v26, 0x40c9999a    # 6.3f

    .line 137
    .line 138
    .line 139
    const v21, 0x405e147b    # 3.47f

    .line 140
    .line 141
    .line 142
    const v22, 0x409947ae    # 4.79f

    .line 143
    .line 144
    .line 145
    const/high16 v23, 0x40400000    # 3.0f

    .line 146
    .line 147
    const v24, 0x40b051ec    # 5.51f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41300000    # 11.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x41100000    # 9.0f

    .line 159
    .line 160
    const/high16 v26, 0x41400000    # 12.0f

    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x40b1999a    # 5.55f

    .line 165
    .line 166
    .line 167
    const v23, 0x4075c28f    # 3.84f

    .line 168
    .line 169
    .line 170
    const v24, 0x412bd70a    # 10.74f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x40bc28f6    # 5.88f

    .line 177
    .line 178
    .line 179
    const v26, -0x3f928f5c    # -3.71f

    .line 180
    .line 181
    .line 182
    const v21, 0x40133333    # 2.3f

    .line 183
    .line 184
    .line 185
    const v22, -0x40f0a3d7    # -0.56f

    .line 186
    .line 187
    .line 188
    const v23, 0x408a8f5c    # 4.33f

    .line 189
    .line 190
    .line 191
    const v24, -0x400ccccd    # -1.9f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, -0x3fb851ec    # -3.12f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v25, -0x3f36b852    # -6.29f

    .line 204
    .line 205
    .line 206
    const v26, -0x40dc28f6    # -0.64f

    .line 207
    .line 208
    .line 209
    const v21, -0x4007ae14    # -1.94f

    .line 210
    .line 211
    .line 212
    const v22, 0x3fa51eb8    # 1.29f

    .line 213
    .line 214
    .line 215
    const v23, -0x3f6d70a4    # -4.58f

    .line 216
    .line 217
    .line 218
    const v24, 0x3f88f5c3    # 1.07f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/16 v25, 0x0

    .line 225
    .line 226
    const v26, -0x3f1dc28f    # -7.07f

    .line 227
    .line 228
    .line 229
    const v21, -0x40066666    # -1.95f

    .line 230
    .line 231
    .line 232
    const v22, -0x40066666    # -1.95f

    .line 233
    .line 234
    .line 235
    const v23, -0x40066666    # -1.95f

    .line 236
    .line 237
    .line 238
    const v24, -0x3f5c28f6    # -5.12f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, 0x40e23d71    # 7.07f

    .line 245
    .line 246
    .line 247
    const/16 v26, 0x0

    .line 248
    .line 249
    const v21, 0x3ff9999a    # 1.95f

    .line 250
    .line 251
    .line 252
    const v23, 0x40a3d70a    # 5.12f

    .line 253
    .line 254
    .line 255
    const v24, -0x40066666    # -1.95f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v25, 0x3f23d70a    # 0.64f

    .line 262
    .line 263
    .line 264
    const v26, 0x40c947ae    # 6.29f

    .line 265
    .line 266
    .line 267
    const v21, 0x3fdae148    # 1.71f

    .line 268
    .line 269
    .line 270
    const v22, 0x3fdae148    # 1.71f

    .line 271
    .line 272
    .line 273
    const v23, 0x3ff5c28f    # 1.92f

    .line 274
    .line 275
    .line 276
    const v24, 0x408b3333    # 4.35f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, 0x4039999a    # 2.9f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v25, 0x41a80000    # 21.0f

    .line 289
    .line 290
    const/high16 v26, 0x41300000    # 11.0f

    .line 291
    .line 292
    const v21, 0x41a251ec    # 20.29f

    .line 293
    .line 294
    .line 295
    const v22, 0x417b0a3d    # 15.69f

    .line 296
    .line 297
    .line 298
    const/high16 v23, 0x41a80000    # 21.0f

    .line 299
    .line 300
    const v24, 0x4156147b    # 13.38f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x40c9999a    # 6.3f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const/16 v16, 0x3800

    .line 320
    .line 321
    const/16 v17, 0x0

    .line 322
    .line 323
    const/high16 v6, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/high16 v8, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/4 v7, 0x0

    .line 328
    const/high16 v9, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/high16 v12, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const/4 v14, 0x0

    .line 334
    const/4 v15, 0x0

    .line 335
    const-string v4, ""

    .line 336
    .line 337
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 338
    .line 339
    .line 340
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    const/4 v0, 0x0

    .line 351
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41400000    # 12.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 373
    .line 374
    const/4 v2, 0x0

    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x40c00000    # 6.0f

    .line 379
    .line 380
    const/16 v19, 0x0

    .line 381
    .line 382
    const/high16 v13, 0x40400000    # 3.0f

    .line 383
    .line 384
    const/high16 v14, 0x40400000    # 3.0f

    .line 385
    .line 386
    const/16 v16, 0x1

    .line 387
    .line 388
    const/16 v17, 0x1

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v18, -0x3f400000    # -6.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    const/16 v16, 0x3800

    .line 403
    .line 404
    const/16 v17, 0x0

    .line 405
    .line 406
    const/high16 v6, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const/high16 v12, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    const-string v4, ""

    .line 414
    .line 415
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    sput-object v0, Landroidx/compose/material/icons/rounded/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 424
    .line 425
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    return-object v0
.end method
