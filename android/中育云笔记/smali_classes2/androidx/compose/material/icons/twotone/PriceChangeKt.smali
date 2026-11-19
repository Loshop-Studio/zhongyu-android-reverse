.class public final Landroidx/compose/material/icons/twotone/PriceChangeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _priceChange:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPriceChange(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PriceChangeKt;->_priceChange:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PriceChange"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40800000    # 4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41900000    # 18.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41800000    # 16.0f

    .line 101
    .line 102
    const/high16 v6, 0x41000000    # 8.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, -0x3f800000    # -4.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x41800000    # 16.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41640000    # 14.25f

    .line 126
    .line 127
    const/high16 v6, 0x41900000    # 18.0f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, -0x40000000    # -2.0f

    .line 133
    .line 134
    const/high16 v6, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x41900000    # 18.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41600000    # 14.0f

    .line 151
    .line 152
    const/high16 v6, 0x40c00000    # 6.0f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x40800000    # 4.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, -0x40800000    # -1.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, -0x40800000    # -1.0f

    .line 173
    .line 174
    const/high16 v26, -0x40800000    # -1.0f

    .line 175
    .line 176
    const v21, -0x40f33333    # -0.55f

    .line 177
    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    const/high16 v23, -0x40800000    # -1.0f

    .line 182
    .line 183
    const v24, -0x4119999a    # -0.45f

    .line 184
    .line 185
    .line 186
    move-object/from16 v20, v2

    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x41100000    # 9.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const v22, -0x40f33333    # -0.55f

    .line 201
    .line 202
    .line 203
    const v23, 0x3ee66666    # 0.45f

    .line 204
    .line 205
    .line 206
    const/high16 v24, -0x40800000    # -1.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x3f800000    # 1.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x40e00000    # 7.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x3f800000    # 1.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x40000000    # 2.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x41000000    # 8.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x3f800000    # 1.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x40400000    # 3.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v26, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const v21, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    const/high16 v23, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const v24, 0x3ee66666    # 0.45f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, -0x40800000    # -1.0f

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const v22, 0x3f0ccccd    # 0.55f

    .line 277
    .line 278
    .line 279
    const v23, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    const/high16 v24, 0x3f800000    # 1.0f

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x3f800000    # 1.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, 0x41000000    # 8.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, -0x40800000    # -1.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40c00000    # 6.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x41600000    # 14.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const/16 v16, 0x3800

    .line 325
    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const v6, 0x3e99999a    # 0.3f

    .line 329
    .line 330
    .line 331
    const v8, 0x3e99999a    # 0.3f

    .line 332
    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const/high16 v9, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/high16 v12, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const/4 v14, 0x0

    .line 341
    const/4 v15, 0x0

    .line 342
    const-string v4, ""

    .line 343
    .line 344
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 345
    .line 346
    .line 347
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    const/4 v2, 0x0

    .line 358
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x41a00000    # 20.0f

    .line 375
    .line 376
    const/high16 v6, 0x40800000    # 4.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x40800000    # 4.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v25, 0x4000a3d7    # 2.01f

    .line 387
    .line 388
    .line 389
    const/high16 v26, 0x40c00000    # 6.0f

    .line 390
    .line 391
    const v21, 0x4038f5c3    # 2.89f

    .line 392
    .line 393
    .line 394
    const/high16 v22, 0x40800000    # 4.0f

    .line 395
    .line 396
    const v23, 0x4000a3d7    # 2.01f

    .line 397
    .line 398
    .line 399
    const v24, 0x409c7ae1    # 4.89f

    .line 400
    .line 401
    .line 402
    move-object/from16 v20, v2

    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x41900000    # 18.0f

    .line 408
    .line 409
    const/high16 v6, 0x40000000    # 2.0f

    .line 410
    .line 411
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v25, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/high16 v26, 0x40000000    # 2.0f

    .line 417
    .line 418
    const/16 v21, 0x0

    .line 419
    .line 420
    const v22, 0x3f8e147b    # 1.11f

    .line 421
    .line 422
    .line 423
    const v23, 0x3f63d70a    # 0.89f

    .line 424
    .line 425
    .line 426
    const/high16 v24, 0x40000000    # 2.0f

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, 0x41800000    # 16.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v26, -0x40000000    # -2.0f

    .line 437
    .line 438
    const v21, 0x3f8e147b    # 1.11f

    .line 439
    .line 440
    .line 441
    const/16 v22, 0x0

    .line 442
    .line 443
    const/high16 v23, 0x40000000    # 2.0f

    .line 444
    .line 445
    const v24, -0x409c28f6    # -0.89f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, 0x40c00000    # 6.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, 0x41a00000    # 20.0f

    .line 457
    .line 458
    const/high16 v26, 0x40800000    # 4.0f

    .line 459
    .line 460
    const/high16 v21, 0x41b00000    # 22.0f

    .line 461
    .line 462
    const v22, 0x409c7ae1    # 4.89f

    .line 463
    .line 464
    .line 465
    const v23, 0x41a8e148    # 21.11f

    .line 466
    .line 467
    .line 468
    const/high16 v24, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x41a00000    # 20.0f

    .line 477
    .line 478
    const/high16 v6, 0x41900000    # 18.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v4, 0x40800000    # 4.0f

    .line 484
    .line 485
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v4, 0x40c00000    # 6.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x41800000    # 16.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x41900000    # 18.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    const/high16 v6, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v8, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v7, 0x0

    .line 515
    const-string v4, ""

    .line 516
    .line 517
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 518
    .line 519
    .line 520
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 525
    .line 526
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 527
    .line 528
    .line 529
    move-result-wide v6

    .line 530
    const/4 v2, 0x0

    .line 531
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 539
    .line 540
    .line 541
    move-result v11

    .line 542
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 545
    .line 546
    .line 547
    const/high16 v4, 0x41880000    # 17.0f

    .line 548
    .line 549
    const/high16 v6, 0x41000000    # 8.0f

    .line 550
    .line 551
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x40000000    # 2.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, -0x40800000    # -1.0f

    .line 560
    .line 561
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x3f800000    # 1.0f

    .line 565
    .line 566
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v25, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v26, -0x40800000    # -1.0f

    .line 572
    .line 573
    const v21, 0x3f0ccccd    # 0.55f

    .line 574
    .line 575
    .line 576
    const/16 v22, 0x0

    .line 577
    .line 578
    const/high16 v23, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const v24, -0x4119999a    # -0.45f

    .line 581
    .line 582
    .line 583
    move-object/from16 v20, v2

    .line 584
    .line 585
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 589
    .line 590
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v25, -0x40800000    # -1.0f

    .line 594
    .line 595
    const/16 v21, 0x0

    .line 596
    .line 597
    const v22, -0x40f33333    # -0.55f

    .line 598
    .line 599
    .line 600
    const v23, -0x4119999a    # -0.45f

    .line 601
    .line 602
    .line 603
    const/high16 v24, -0x40800000    # -1.0f

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v4, 0x41000000    # 8.0f

    .line 609
    .line 610
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v4, -0x40800000    # -1.0f

    .line 614
    .line 615
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x40800000    # 4.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v4, 0x41000000    # 8.0f

    .line 624
    .line 625
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v4, -0x40000000    # -2.0f

    .line 629
    .line 630
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v4, 0x40e00000    # 7.0f

    .line 634
    .line 635
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v4, 0x41000000    # 8.0f

    .line 639
    .line 640
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v4, 0x3f800000    # 1.0f

    .line 644
    .line 645
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v4, 0x40e00000    # 7.0f

    .line 649
    .line 650
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v25, 0x40c00000    # 6.0f

    .line 654
    .line 655
    const/high16 v26, 0x41100000    # 9.0f

    .line 656
    .line 657
    const v21, 0x40ce6666    # 6.45f

    .line 658
    .line 659
    .line 660
    const/high16 v22, 0x41000000    # 8.0f

    .line 661
    .line 662
    const/high16 v23, 0x40c00000    # 6.0f

    .line 663
    .line 664
    const v24, 0x41073333    # 8.45f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v4, 0x40400000    # 3.0f

    .line 671
    .line 672
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v25, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/high16 v26, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const v22, 0x3f0ccccd    # 0.55f

    .line 682
    .line 683
    .line 684
    const v23, 0x3ee66666    # 0.45f

    .line 685
    .line 686
    .line 687
    const/high16 v24, 0x3f800000    # 1.0f

    .line 688
    .line 689
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, 0x3f800000    # 1.0f

    .line 696
    .line 697
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v4, 0x40c00000    # 6.0f

    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v4, 0x40000000    # 2.0f

    .line 706
    .line 707
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v4, 0x41880000    # 17.0f

    .line 714
    .line 715
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    const/high16 v6, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/4 v7, 0x0

    .line 728
    const-string v4, ""

    .line 729
    .line 730
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 731
    .line 732
    .line 733
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 738
    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 740
    .line 741
    .line 742
    move-result-wide v6

    .line 743
    const/4 v2, 0x0

    .line 744
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 748
    .line 749
    .line 750
    move-result v10

    .line 751
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 752
    .line 753
    .line 754
    move-result v11

    .line 755
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 758
    .line 759
    .line 760
    const/high16 v4, 0x41800000    # 16.0f

    .line 761
    .line 762
    const/high16 v6, 0x41000000    # 8.0f

    .line 763
    .line 764
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v4, -0x40000000    # -2.0f

    .line 768
    .line 769
    const/high16 v6, 0x40000000    # 2.0f

    .line 770
    .line 771
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/4 v4, 0x0

    .line 775
    const/high16 v6, 0x40800000    # 4.0f

    .line 776
    .line 777
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    const/high16 v6, 0x3f800000    # 1.0f

    .line 788
    .line 789
    const/4 v7, 0x0

    .line 790
    const-string v4, ""

    .line 791
    .line 792
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 793
    .line 794
    .line 795
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 800
    .line 801
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 802
    .line 803
    .line 804
    move-result-wide v6

    .line 805
    const/4 v0, 0x0

    .line 806
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 810
    .line 811
    .line 812
    move-result v10

    .line 813
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 814
    .line 815
    .line 816
    move-result v11

    .line 817
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 820
    .line 821
    .line 822
    const/high16 v2, 0x41640000    # 14.25f

    .line 823
    .line 824
    const/high16 v4, 0x41900000    # 18.0f

    .line 825
    .line 826
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/4 v2, 0x0

    .line 830
    const/high16 v4, -0x3f800000    # -4.0f

    .line 831
    .line 832
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v2, 0x40000000    # 2.0f

    .line 836
    .line 837
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    const/high16 v6, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/4 v7, 0x0

    .line 850
    const-string v4, ""

    .line 851
    .line 852
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    sput-object v0, Landroidx/compose/material/icons/twotone/PriceChangeKt;->_priceChange:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 861
    .line 862
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    return-object v0
.end method
