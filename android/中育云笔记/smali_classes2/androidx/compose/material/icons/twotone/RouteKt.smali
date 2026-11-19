.class public final Landroidx/compose/material/icons/twotone/RouteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _route:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRoute(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RouteKt;->_route:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Route"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/high16 v6, -0x40800000    # -1.0f

    .line 77
    .line 78
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const/high16 v22, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v6, 0x3e99999a    # 0.3f

    .line 114
    .line 115
    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41900000    # 18.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/4 v4, 0x0

    .line 165
    const/high16 v6, -0x40800000    # -1.0f

    .line 166
    .line 167
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v26, 0x40000000    # 2.0f

    .line 171
    .line 172
    move-object/from16 v20, v2

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v26, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const v6, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const-string v4, ""

    .line 191
    .line 192
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    const/4 v0, 0x0

    .line 206
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    const v0, 0x4172e148    # 15.18f

    .line 223
    .line 224
    .line 225
    const/high16 v2, 0x41980000    # 19.0f

    .line 226
    .line 227
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x40e00000    # 7.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, -0x3f800000    # -4.0f

    .line 236
    .line 237
    const/high16 v18, -0x3f800000    # -4.0f

    .line 238
    .line 239
    const v14, -0x3ff28f5c    # -2.21f

    .line 240
    .line 241
    .line 242
    const v15, -0x401ae148    # -1.79f

    .line 243
    .line 244
    .line 245
    const/high16 v16, -0x3f800000    # -4.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x3fe51eb8    # 1.79f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x40800000    # 4.0f

    .line 254
    .line 255
    const/high16 v4, -0x3f800000    # -4.0f

    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41200000    # 10.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, -0x40000000    # -2.0f

    .line 266
    .line 267
    const/high16 v18, 0x40000000    # 2.0f

    .line 268
    .line 269
    const v14, 0x3f8ccccd    # 1.1f

    .line 270
    .line 271
    .line 272
    const v15, -0x4099999a    # -0.9f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x4099999a    # -0.9f

    .line 281
    .line 282
    .line 283
    const/high16 v2, -0x40000000    # -2.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x410d1eb8    # 8.82f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x41100000    # 9.0f

    .line 295
    .line 296
    const/high16 v18, 0x40c00000    # 6.0f

    .line 297
    .line 298
    const v13, 0x41028f5c    # 8.16f

    .line 299
    .line 300
    .line 301
    const v14, 0x41066666    # 8.4f

    .line 302
    .line 303
    .line 304
    const/high16 v15, 0x41100000    # 9.0f

    .line 305
    .line 306
    const v16, 0x40e9999a    # 7.3f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 313
    .line 314
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, -0x402b851f    # -1.66f

    .line 318
    .line 319
    .line 320
    const v15, -0x40547ae1    # -1.34f

    .line 321
    .line 322
    .line 323
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x408ae148    # 4.34f

    .line 329
    .line 330
    .line 331
    const/high16 v2, 0x40400000    # 3.0f

    .line 332
    .line 333
    const/high16 v4, 0x40c00000    # 6.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x40000000    # 2.0f

    .line 339
    .line 340
    const v18, 0x40347ae1    # 2.82f

    .line 341
    .line 342
    .line 343
    const v14, 0x3fa66666    # 1.3f

    .line 344
    .line 345
    .line 346
    const v15, 0x3f570a3d    # 0.84f

    .line 347
    .line 348
    .line 349
    const v16, 0x4019999a    # 2.4f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41880000    # 17.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x40800000    # 4.0f

    .line 361
    .line 362
    const/high16 v18, 0x40800000    # 4.0f

    .line 363
    .line 364
    const v14, 0x400d70a4    # 2.21f

    .line 365
    .line 366
    .line 367
    const v15, 0x3fe51eb8    # 1.79f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x40800000    # 4.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x401ae148    # -1.79f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x40800000    # 4.0f

    .line 379
    .line 380
    const/high16 v4, -0x3f800000    # -4.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40e00000    # 7.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x40000000    # 2.0f

    .line 391
    .line 392
    const/high16 v18, -0x40000000    # -2.0f

    .line 393
    .line 394
    const v14, -0x40733333    # -1.1f

    .line 395
    .line 396
    .line 397
    const v15, 0x3f666666    # 0.9f

    .line 398
    .line 399
    .line 400
    const/high16 v16, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3f666666    # 0.9f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x40000000    # 2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x4102e148    # 8.18f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, -0x40000000    # -2.0f

    .line 420
    .line 421
    const v18, 0x40347ae1    # 2.82f

    .line 422
    .line 423
    .line 424
    const v13, -0x406b851f    # -1.16f

    .line 425
    .line 426
    .line 427
    const v14, 0x3ed1eb85    # 0.41f

    .line 428
    .line 429
    .line 430
    const/high16 v15, -0x40000000    # -2.0f

    .line 431
    .line 432
    const v16, 0x3fc147ae    # 1.51f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x40400000    # 3.0f

    .line 439
    .line 440
    const/high16 v18, 0x40400000    # 3.0f

    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, 0x3fd47ae1    # 1.66f

    .line 444
    .line 445
    .line 446
    const v15, 0x3fab851f    # 1.34f

    .line 447
    .line 448
    .line 449
    const/high16 v16, 0x40400000    # 3.0f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x40547ae1    # -1.34f

    .line 455
    .line 456
    .line 457
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 458
    .line 459
    const/high16 v4, 0x40400000    # 3.0f

    .line 460
    .line 461
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, 0x41980000    # 19.0f

    .line 465
    .line 466
    const v18, 0x4172e148    # 15.18f

    .line 467
    .line 468
    .line 469
    const/high16 v13, 0x41a80000    # 21.0f

    .line 470
    .line 471
    const v14, 0x4185999a    # 16.7f

    .line 472
    .line 473
    .line 474
    const v15, 0x41a147ae    # 20.16f

    .line 475
    .line 476
    .line 477
    const v16, 0x4179999a    # 15.6f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x40e00000    # 7.0f

    .line 487
    .line 488
    const/high16 v2, 0x40c00000    # 6.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x40a00000    # 5.0f

    .line 494
    .line 495
    const/high16 v18, 0x40c00000    # 6.0f

    .line 496
    .line 497
    const v13, 0x40ae6666    # 5.45f

    .line 498
    .line 499
    .line 500
    const/high16 v14, 0x40e00000    # 7.0f

    .line 501
    .line 502
    const/high16 v15, 0x40a00000    # 5.0f

    .line 503
    .line 504
    const v16, 0x40d1999a    # 6.55f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3ee66666    # 0.45f

    .line 511
    .line 512
    .line 513
    const/high16 v2, -0x40800000    # -1.0f

    .line 514
    .line 515
    const/high16 v4, 0x3f800000    # 1.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v2, 0x3f800000    # 1.0f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x40d1999a    # 6.55f

    .line 526
    .line 527
    .line 528
    const/high16 v2, 0x40e00000    # 7.0f

    .line 529
    .line 530
    const/high16 v4, 0x40c00000    # 6.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x41980000    # 19.0f

    .line 539
    .line 540
    const/high16 v2, 0x41900000    # 18.0f

    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, -0x40800000    # -1.0f

    .line 546
    .line 547
    const/high16 v18, -0x40800000    # -1.0f

    .line 548
    .line 549
    const v13, -0x40f33333    # -0.55f

    .line 550
    .line 551
    .line 552
    const/4 v14, 0x0

    .line 553
    const/high16 v15, -0x40800000    # -1.0f

    .line 554
    .line 555
    const v16, -0x4119999a    # -0.45f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3ee66666    # 0.45f

    .line 562
    .line 563
    .line 564
    const/high16 v2, -0x40800000    # -1.0f

    .line 565
    .line 566
    const/high16 v4, 0x3f800000    # 1.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v2, 0x3f800000    # 1.0f

    .line 572
    .line 573
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x41946666    # 18.55f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x41980000    # 19.0f

    .line 580
    .line 581
    const/high16 v4, 0x41900000    # 18.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    const/16 v16, 0x3800

    .line 594
    .line 595
    const/16 v17, 0x0

    .line 596
    .line 597
    const/high16 v6, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/high16 v8, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/4 v7, 0x0

    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v15, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    sput-object v0, Landroidx/compose/material/icons/twotone/RouteKt;->_route:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    return-object v0
.end method
