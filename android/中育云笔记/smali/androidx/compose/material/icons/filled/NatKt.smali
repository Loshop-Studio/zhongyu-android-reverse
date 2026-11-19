.class public final Landroidx/compose/material/icons/filled/NatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNat(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/NatKt;->_nat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Nat"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v6, 0x40da3d71    # 6.82f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41300000    # 11.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x40000000    # -2.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x40da3d71    # 6.82f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v25, 0x40800000    # 4.0f

    .line 95
    .line 96
    const/high16 v26, 0x41100000    # 9.0f

    .line 97
    .line 98
    const v21, 0x40cccccd    # 6.4f

    .line 99
    .line 100
    .line 101
    const v22, 0x411d70a4    # 9.84f

    .line 102
    .line 103
    .line 104
    const v23, 0x40a9999a    # 5.3f

    .line 105
    .line 106
    .line 107
    const/high16 v24, 0x41100000    # 9.0f

    .line 108
    .line 109
    move-object/from16 v20, v2

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 115
    .line 116
    const/high16 v26, 0x40400000    # 3.0f

    .line 117
    .line 118
    const v21, -0x402b851f    # -1.66f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 124
    .line 125
    const v24, 0x3fab851f    # 1.34f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x3fab851f    # 1.34f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x40400000    # 3.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x40da3d71    # 6.82f

    .line 140
    .line 141
    .line 142
    const/high16 v26, 0x41500000    # 13.0f

    .line 143
    .line 144
    const v21, 0x40a9999a    # 5.3f

    .line 145
    .line 146
    .line 147
    const/high16 v22, 0x41700000    # 15.0f

    .line 148
    .line 149
    const v23, 0x40cccccd    # 6.4f

    .line 150
    .line 151
    .line 152
    const v24, 0x41628f5c    # 14.16f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x40800000    # 4.0f

    .line 162
    .line 163
    const/high16 v6, 0x41500000    # 13.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, -0x40800000    # -1.0f

    .line 169
    .line 170
    const/high16 v26, -0x40800000    # -1.0f

    .line 171
    .line 172
    const v21, -0x40f33333    # -0.55f

    .line 173
    .line 174
    .line 175
    const/16 v22, 0x0

    .line 176
    .line 177
    const/high16 v23, -0x40800000    # -1.0f

    .line 178
    .line 179
    const v24, -0x4119999a    # -0.45f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/16 v21, 0x0

    .line 188
    .line 189
    const v22, -0x40f33333    # -0.55f

    .line 190
    .line 191
    .line 192
    const v23, 0x3ee66666    # 0.45f

    .line 193
    .line 194
    .line 195
    const/high16 v24, -0x40800000    # -1.0f

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x3ee66666    # 0.45f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x3f800000    # 1.0f

    .line 204
    .line 205
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x40800000    # 4.0f

    .line 209
    .line 210
    const/high16 v26, 0x41500000    # 13.0f

    .line 211
    .line 212
    const/high16 v21, 0x40a00000    # 5.0f

    .line 213
    .line 214
    const v22, 0x4148cccd    # 12.55f

    .line 215
    .line 216
    .line 217
    const v23, 0x4091999a    # 4.55f

    .line 218
    .line 219
    .line 220
    const/high16 v24, 0x41500000    # 13.0f

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const/16 v16, 0x3800

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    const/high16 v8, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const/high16 v9, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v12, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    const-string v4, ""

    .line 247
    .line 248
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 256
    .line 257
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 258
    .line 259
    .line 260
    move-result-wide v6

    .line 261
    const/4 v0, 0x0

    .line 262
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41400000    # 12.0f

    .line 279
    .line 280
    const/high16 v2, 0x41b80000    # 23.0f

    .line 281
    .line 282
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x3f800000    # -4.0f

    .line 286
    .line 287
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x40000000    # 2.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3f7e6666    # -4.05f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40a00000    # 5.0f

    .line 304
    .line 305
    const/high16 v18, 0x40000000    # 2.0f

    .line 306
    .line 307
    const v13, 0x41673333    # 14.45f

    .line 308
    .line 309
    .line 310
    const v14, 0x40be6666    # 5.95f

    .line 311
    .line 312
    .line 313
    const v15, 0x41230a3d    # 10.19f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x40000000    # 2.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x40000000    # 2.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x41000000    # 8.0f

    .line 327
    .line 328
    const/high16 v18, 0x41000000    # 8.0f

    .line 329
    .line 330
    const v13, 0x408d70a4    # 4.42f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const/high16 v15, 0x41000000    # 8.0f

    .line 335
    .line 336
    const v16, 0x40651eb8    # 3.58f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x3f9ae148    # -3.58f

    .line 343
    .line 344
    .line 345
    const/high16 v2, -0x3f000000    # -8.0f

    .line 346
    .line 347
    const/high16 v4, 0x41000000    # 8.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40000000    # 2.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x411f3333    # 9.95f

    .line 358
    .line 359
    .line 360
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 361
    .line 362
    const v13, 0x40a6147b    # 5.19f

    .line 363
    .line 364
    .line 365
    const v15, 0x41173333    # 9.45f

    .line 366
    .line 367
    .line 368
    const v16, -0x3f833333    # -3.95f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41980000    # 19.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40000000    # 2.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41400000    # 12.0f

    .line 385
    .line 386
    const/high16 v2, 0x41b80000    # 23.0f

    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const/16 v16, 0x3800

    .line 399
    .line 400
    const/16 v17, 0x0

    .line 401
    .line 402
    const/high16 v6, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/4 v7, 0x0

    .line 405
    const/high16 v12, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const/4 v15, 0x0

    .line 409
    const-string v4, ""

    .line 410
    .line 411
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sput-object v0, Landroidx/compose/material/icons/filled/NatKt;->_nat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 420
    .line 421
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    return-object v0
.end method
