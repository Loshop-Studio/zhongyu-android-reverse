.class public final Landroidx/compose/material/icons/twotone/DirectionsCarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsCar(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsCarKt;->_directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsCar"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, -0x3f600000    # -5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41400000    # 12.0f

    .line 88
    .line 89
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41840000    # 16.5f

    .line 101
    .line 102
    const/high16 v6, 0x41500000    # 13.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 108
    .line 109
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 110
    .line 111
    const v21, 0x3f547ae1    # 0.83f

    .line 112
    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    const v24, 0x3f2b851f    # 0.67f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, -0x40d47ae1    # -0.67f

    .line 127
    .line 128
    .line 129
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 130
    .line 131
    const/high16 v7, -0x40400000    # -1.5f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v6, -0x40400000    # -1.5f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x3f2b851f    # 0.67f

    .line 142
    .line 143
    .line 144
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40f00000    # 7.5f

    .line 153
    .line 154
    const/high16 v6, 0x41500000    # 13.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x410547ae    # 8.33f

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x41800000    # 16.0f

    .line 166
    .line 167
    const/high16 v7, 0x40f00000    # 7.5f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x417547ae    # 15.33f

    .line 173
    .line 174
    .line 175
    const/high16 v6, 0x40c00000    # 6.0f

    .line 176
    .line 177
    const/high16 v7, 0x41680000    # 14.5f

    .line 178
    .line 179
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x40d570a4    # 6.67f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x40f00000    # 7.5f

    .line 186
    .line 187
    const/high16 v7, 0x41500000    # 13.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const/16 v16, 0x3800

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const v6, 0x3e99999a    # 0.3f

    .line 204
    .line 205
    .line 206
    const v8, 0x3e99999a    # 0.3f

    .line 207
    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    const/high16 v9, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v12, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v15, 0x0

    .line 217
    const-string v4, ""

    .line 218
    .line 219
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 227
    .line 228
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 229
    .line 230
    .line 231
    move-result-wide v6

    .line 232
    const/4 v2, 0x0

    .line 233
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const v4, 0x41975c29    # 18.92f

    .line 250
    .line 251
    .line 252
    const v6, 0x40c051ec    # 6.01f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x418c0000    # 17.5f

    .line 259
    .line 260
    const/high16 v26, 0x40a00000    # 5.0f

    .line 261
    .line 262
    const v21, 0x4195c28f    # 18.72f

    .line 263
    .line 264
    .line 265
    const v22, 0x40ad70a4    # 5.42f

    .line 266
    .line 267
    .line 268
    const v23, 0x419147ae    # 18.16f

    .line 269
    .line 270
    .line 271
    const/high16 v24, 0x40a00000    # 5.0f

    .line 272
    .line 273
    move-object/from16 v20, v2

    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v25, -0x404a3d71    # -1.42f

    .line 284
    .line 285
    .line 286
    const v26, 0x3f8147ae    # 1.01f

    .line 287
    .line 288
    .line 289
    const v21, -0x40d70a3d    # -0.66f

    .line 290
    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    const v23, -0x40651eb8    # -1.21f

    .line 295
    .line 296
    .line 297
    const v24, 0x3ed70a3d    # 0.42f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40400000    # 3.0f

    .line 304
    .line 305
    const/high16 v6, 0x41400000    # 12.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41000000    # 8.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v25, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v26, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/16 v21, 0x0

    .line 320
    .line 321
    const v22, 0x3f0ccccd    # 0.55f

    .line 322
    .line 323
    .line 324
    const v23, 0x3ee66666    # 0.45f

    .line 325
    .line 326
    .line 327
    const/high16 v24, 0x3f800000    # 1.0f

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x3f800000    # 1.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v26, -0x40800000    # -1.0f

    .line 338
    .line 339
    const v21, 0x3f0ccccd    # 0.55f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/high16 v23, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const v24, -0x4119999a    # -0.45f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, -0x40800000    # -1.0f

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, 0x41400000    # 12.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x3f800000    # 1.0f

    .line 363
    .line 364
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v26, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/16 v21, 0x0

    .line 370
    .line 371
    const v22, 0x3f0ccccd    # 0.55f

    .line 372
    .line 373
    .line 374
    const v23, 0x3ee66666    # 0.45f

    .line 375
    .line 376
    .line 377
    const/high16 v24, 0x3f800000    # 1.0f

    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v26, -0x40800000    # -1.0f

    .line 386
    .line 387
    const v21, 0x3f0ccccd    # 0.55f

    .line 388
    .line 389
    .line 390
    const/16 v22, 0x0

    .line 391
    .line 392
    const/high16 v23, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const v24, -0x4119999a    # -0.45f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, -0x3f000000    # -8.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, -0x3ffae148    # -2.08f

    .line 406
    .line 407
    .line 408
    const v6, -0x3f4051ec    # -5.99f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v4, 0x40e00000    # 7.0f

    .line 418
    .line 419
    const v6, 0x40db3333    # 6.85f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, 0x4124a3d7    # 10.29f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v4, 0x3f8a3d71    # 1.08f

    .line 432
    .line 433
    .line 434
    const v6, 0x40470a3d    # 3.11f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x40b8a3d7    # 5.77f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x40e00000    # 7.0f

    .line 447
    .line 448
    const v6, 0x40db3333    # 6.85f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v4, 0x41980000    # 19.0f

    .line 458
    .line 459
    const/high16 v6, 0x41880000    # 17.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, 0x40a00000    # 5.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, -0x3f600000    # -5.0f

    .line 470
    .line 471
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x41600000    # 14.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v4, 0x40a00000    # 5.0f

    .line 480
    .line 481
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 506
    .line 507
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 508
    .line 509
    .line 510
    move-result-wide v6

    .line 511
    const/4 v2, 0x0

    .line 512
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41680000    # 14.5f

    .line 529
    .line 530
    const/high16 v6, 0x40f00000    # 7.5f

    .line 531
    .line 532
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/4 v4, 0x0

    .line 536
    const/high16 v6, -0x40400000    # -1.5f

    .line 537
    .line 538
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v26, 0x40400000    # 3.0f

    .line 542
    .line 543
    const/16 v27, 0x0

    .line 544
    .line 545
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 546
    .line 547
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 548
    .line 549
    const/16 v23, 0x0

    .line 550
    .line 551
    const/16 v24, 0x1

    .line 552
    .line 553
    const/16 v25, 0x1

    .line 554
    .line 555
    move-object/from16 v20, v2

    .line 556
    .line 557
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 561
    .line 562
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v7, 0x0

    .line 572
    const-string v4, ""

    .line 573
    .line 574
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 575
    .line 576
    .line 577
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 582
    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 584
    .line 585
    .line 586
    move-result-wide v6

    .line 587
    const/4 v0, 0x0

    .line 588
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 592
    .line 593
    .line 594
    move-result v10

    .line 595
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41840000    # 16.5f

    .line 605
    .line 606
    const/high16 v2, 0x41680000    # 14.5f

    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/4 v0, 0x0

    .line 612
    const/high16 v2, -0x40400000    # -1.5f

    .line 613
    .line 614
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v18, 0x40400000    # 3.0f

    .line 618
    .line 619
    const/16 v19, 0x0

    .line 620
    .line 621
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 622
    .line 623
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 624
    .line 625
    const/16 v16, 0x1

    .line 626
    .line 627
    const/16 v17, 0x1

    .line 628
    .line 629
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    const/16 v16, 0x3800

    .line 642
    .line 643
    const/16 v17, 0x0

    .line 644
    .line 645
    const/high16 v6, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v7, 0x0

    .line 648
    const/high16 v12, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const-string v4, ""

    .line 653
    .line 654
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsCarKt;->_directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    return-object v0
.end method
