.class public final Landroidx/compose/material/icons/outlined/PointOfSaleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPointOfSale(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PointOfSale"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40a00000    # 5.0f

    .line 83
    .line 84
    const/high16 v18, 0x40800000    # 4.0f

    .line 85
    .line 86
    const v13, 0x40bccccd    # 5.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/high16 v15, 0x40a00000    # 5.0f

    .line 92
    .line 93
    const v16, 0x4039999a    # 2.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x40000000    # 2.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41200000    # 10.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v18, -0x40000000    # -2.0f

    .line 126
    .line 127
    const v13, 0x3f8ccccd    # 1.1f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const/high16 v15, 0x40000000    # 2.0f

    .line 132
    .line 133
    const v16, -0x4099999a    # -0.9f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, 0x41880000    # 17.0f

    .line 145
    .line 146
    const/high16 v18, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/high16 v13, 0x41980000    # 19.0f

    .line 149
    .line 150
    const v14, 0x4039999a    # 2.9f

    .line 151
    .line 152
    .line 153
    const v15, 0x4190cccd    # 18.1f

    .line 154
    .line 155
    .line 156
    const/high16 v16, 0x40000000    # 2.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x40c00000    # 6.0f

    .line 165
    .line 166
    const/high16 v2, 0x41880000    # 17.0f

    .line 167
    .line 168
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40e00000    # 7.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40800000    # 4.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41200000    # 10.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x40c00000    # 6.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41b00000    # 22.0f

    .line 195
    .line 196
    const/high16 v2, 0x41a00000    # 20.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40800000    # 4.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, -0x40000000    # -2.0f

    .line 207
    .line 208
    const/high16 v18, -0x40000000    # -2.0f

    .line 209
    .line 210
    const v13, -0x40733333    # -1.1f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const/high16 v15, -0x40000000    # -2.0f

    .line 215
    .line 216
    const v16, -0x4099999a    # -0.9f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, -0x40800000    # -1.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41a00000    # 20.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x3f800000    # 1.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41a00000    # 20.0f

    .line 238
    .line 239
    const/high16 v18, 0x41b00000    # 22.0f

    .line 240
    .line 241
    const/high16 v13, 0x41b00000    # 22.0f

    .line 242
    .line 243
    const v14, 0x41a8cccd    # 21.1f

    .line 244
    .line 245
    .line 246
    const v15, 0x41a8cccd    # 21.1f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x41b00000    # 22.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x41230a3d    # 10.19f

    .line 258
    .line 259
    .line 260
    const v2, 0x41943d71    # 18.53f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x4185999a    # 16.7f

    .line 267
    .line 268
    .line 269
    const/high16 v18, 0x41100000    # 9.0f

    .line 270
    .line 271
    const v13, 0x4191ae14    # 18.21f

    .line 272
    .line 273
    .line 274
    const v14, 0x4117851f    # 9.47f

    .line 275
    .line 276
    .line 277
    const v15, 0x418beb85    # 17.49f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x41100000    # 9.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x40e9999a    # 7.3f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x4015c28f    # -1.83f

    .line 292
    .line 293
    .line 294
    const v18, 0x3f9851ec    # 1.19f

    .line 295
    .line 296
    .line 297
    const v13, -0x40b5c28f    # -0.79f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const v15, -0x403eb852    # -1.51f

    .line 302
    .line 303
    .line 304
    const v16, 0x3ef0a3d7    # 0.47f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41900000    # 18.0f

    .line 311
    .line 312
    const/high16 v2, 0x40000000    # 2.0f

    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41a00000    # 20.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x41230a3d    # 10.19f

    .line 323
    .line 324
    .line 325
    const v2, 0x41943d71    # 18.53f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41800000    # 16.0f

    .line 335
    .line 336
    const/high16 v2, 0x41180000    # 9.5f

    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, -0x40800000    # -1.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41000000    # 8.0f

    .line 347
    .line 348
    const/high16 v18, 0x41780000    # 15.5f

    .line 349
    .line 350
    const v13, 0x4103851f    # 8.22f

    .line 351
    .line 352
    .line 353
    const/high16 v14, 0x41800000    # 16.0f

    .line 354
    .line 355
    const/high16 v15, 0x41000000    # 8.0f

    .line 356
    .line 357
    const v16, 0x417c7ae1    # 15.78f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x41080000    # 8.5f

    .line 364
    .line 365
    const/high16 v18, 0x41700000    # 15.0f

    .line 366
    .line 367
    const/high16 v13, 0x41000000    # 8.0f

    .line 368
    .line 369
    const v14, 0x4173851f    # 15.22f

    .line 370
    .line 371
    .line 372
    const v15, 0x4103851f    # 8.22f

    .line 373
    .line 374
    .line 375
    const/high16 v16, 0x41700000    # 15.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x3f800000    # 1.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x3f000000    # 0.5f

    .line 386
    .line 387
    const/high16 v18, 0x3f000000    # 0.5f

    .line 388
    .line 389
    const v13, 0x3e8f5c29    # 0.28f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const/high16 v15, 0x3f000000    # 0.5f

    .line 394
    .line 395
    const v16, 0x3e6147ae    # 0.22f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x41180000    # 9.5f

    .line 402
    .line 403
    const/high16 v18, 0x41800000    # 16.0f

    .line 404
    .line 405
    const/high16 v13, 0x41200000    # 10.0f

    .line 406
    .line 407
    const v14, 0x417c7ae1    # 15.78f

    .line 408
    .line 409
    .line 410
    const v15, 0x411c7ae1    # 9.78f

    .line 411
    .line 412
    .line 413
    const/high16 v16, 0x41800000    # 16.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41600000    # 14.0f

    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x40800000    # -1.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x41000000    # 8.0f

    .line 432
    .line 433
    const/high16 v18, 0x41580000    # 13.5f

    .line 434
    .line 435
    const v13, 0x4103851f    # 8.22f

    .line 436
    .line 437
    .line 438
    const/high16 v14, 0x41600000    # 14.0f

    .line 439
    .line 440
    const/high16 v15, 0x41000000    # 8.0f

    .line 441
    .line 442
    const v16, 0x415c7ae1    # 13.78f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x41080000    # 8.5f

    .line 449
    .line 450
    const/high16 v18, 0x41500000    # 13.0f

    .line 451
    .line 452
    const/high16 v13, 0x41000000    # 8.0f

    .line 453
    .line 454
    const v14, 0x4153851f    # 13.22f

    .line 455
    .line 456
    .line 457
    const v15, 0x4103851f    # 8.22f

    .line 458
    .line 459
    .line 460
    const/high16 v16, 0x41500000    # 13.0f

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x3f800000    # 1.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, 0x3f000000    # 0.5f

    .line 471
    .line 472
    const/high16 v18, 0x3f000000    # 0.5f

    .line 473
    .line 474
    const v13, 0x3e8f5c29    # 0.28f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const/high16 v15, 0x3f000000    # 0.5f

    .line 479
    .line 480
    const v16, 0x3e6147ae    # 0.22f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x41180000    # 9.5f

    .line 487
    .line 488
    const/high16 v18, 0x41600000    # 14.0f

    .line 489
    .line 490
    const/high16 v13, 0x41200000    # 10.0f

    .line 491
    .line 492
    const v14, 0x415c7ae1    # 13.78f

    .line 493
    .line 494
    .line 495
    const v15, 0x411c7ae1    # 9.78f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x41600000    # 14.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41400000    # 12.0f

    .line 507
    .line 508
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, -0x40800000    # -1.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41000000    # 8.0f

    .line 517
    .line 518
    const/high16 v18, 0x41380000    # 11.5f

    .line 519
    .line 520
    const v13, 0x4103851f    # 8.22f

    .line 521
    .line 522
    .line 523
    const/high16 v14, 0x41400000    # 12.0f

    .line 524
    .line 525
    const/high16 v15, 0x41000000    # 8.0f

    .line 526
    .line 527
    const v16, 0x413c7ae1    # 11.78f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41080000    # 8.5f

    .line 534
    .line 535
    const/high16 v18, 0x41300000    # 11.0f

    .line 536
    .line 537
    const/high16 v13, 0x41000000    # 8.0f

    .line 538
    .line 539
    const v14, 0x4133851f    # 11.22f

    .line 540
    .line 541
    .line 542
    const v15, 0x4103851f    # 8.22f

    .line 543
    .line 544
    .line 545
    const/high16 v16, 0x41300000    # 11.0f

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x3f800000    # 1.0f

    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x3f000000    # 0.5f

    .line 556
    .line 557
    const/high16 v18, 0x3f000000    # 0.5f

    .line 558
    .line 559
    const v13, 0x3e8f5c29    # 0.28f

    .line 560
    .line 561
    .line 562
    const/4 v14, 0x0

    .line 563
    const/high16 v15, 0x3f000000    # 0.5f

    .line 564
    .line 565
    const v16, 0x3e6147ae    # 0.22f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, 0x41180000    # 9.5f

    .line 572
    .line 573
    const/high16 v18, 0x41400000    # 12.0f

    .line 574
    .line 575
    const/high16 v13, 0x41200000    # 10.0f

    .line 576
    .line 577
    const v14, 0x413c7ae1    # 11.78f

    .line 578
    .line 579
    .line 580
    const v15, 0x411c7ae1    # 9.78f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x41400000    # 12.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x41480000    # 12.5f

    .line 592
    .line 593
    const/high16 v2, 0x41800000    # 16.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, -0x40800000    # -1.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, -0x41000000    # -0.5f

    .line 604
    .line 605
    const/high16 v18, -0x41000000    # -0.5f

    .line 606
    .line 607
    const v13, -0x4170a3d7    # -0.28f

    .line 608
    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    const/high16 v15, -0x41000000    # -0.5f

    .line 612
    .line 613
    const v16, -0x419eb852    # -0.22f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x3f000000    # 0.5f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const v14, -0x4170a3d7    # -0.28f

    .line 623
    .line 624
    .line 625
    const v15, 0x3e6147ae    # 0.22f

    .line 626
    .line 627
    .line 628
    const/high16 v16, -0x41000000    # -0.5f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x3f800000    # 1.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v18, 0x3f000000    # 0.5f

    .line 639
    .line 640
    const v13, 0x3e8f5c29    # 0.28f

    .line 641
    .line 642
    .line 643
    const/4 v14, 0x0

    .line 644
    const/high16 v15, 0x3f000000    # 0.5f

    .line 645
    .line 646
    const v16, 0x3e6147ae    # 0.22f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v17, 0x41480000    # 12.5f

    .line 653
    .line 654
    const/high16 v18, 0x41800000    # 16.0f

    .line 655
    .line 656
    const/high16 v13, 0x41500000    # 13.0f

    .line 657
    .line 658
    const v14, 0x417c7ae1    # 15.78f

    .line 659
    .line 660
    .line 661
    const v15, 0x414c7ae1    # 12.78f

    .line 662
    .line 663
    .line 664
    const/high16 v16, 0x41800000    # 16.0f

    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, 0x41480000    # 12.5f

    .line 673
    .line 674
    const/high16 v2, 0x41600000    # 14.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, -0x40800000    # -1.0f

    .line 680
    .line 681
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, -0x41000000    # -0.5f

    .line 685
    .line 686
    const/high16 v18, -0x41000000    # -0.5f

    .line 687
    .line 688
    const v13, -0x4170a3d7    # -0.28f

    .line 689
    .line 690
    .line 691
    const/4 v14, 0x0

    .line 692
    const/high16 v15, -0x41000000    # -0.5f

    .line 693
    .line 694
    const v16, -0x419eb852    # -0.22f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v17, 0x3f000000    # 0.5f

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    const v14, -0x4170a3d7    # -0.28f

    .line 704
    .line 705
    .line 706
    const v15, 0x3e6147ae    # 0.22f

    .line 707
    .line 708
    .line 709
    const/high16 v16, -0x41000000    # -0.5f

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x3f800000    # 1.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v18, 0x3f000000    # 0.5f

    .line 720
    .line 721
    const v13, 0x3e8f5c29    # 0.28f

    .line 722
    .line 723
    .line 724
    const/4 v14, 0x0

    .line 725
    const/high16 v15, 0x3f000000    # 0.5f

    .line 726
    .line 727
    const v16, 0x3e6147ae    # 0.22f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v17, 0x41480000    # 12.5f

    .line 734
    .line 735
    const/high16 v18, 0x41600000    # 14.0f

    .line 736
    .line 737
    const/high16 v13, 0x41500000    # 13.0f

    .line 738
    .line 739
    const v14, 0x415c7ae1    # 13.78f

    .line 740
    .line 741
    .line 742
    const v15, 0x414c7ae1    # 12.78f

    .line 743
    .line 744
    .line 745
    const/high16 v16, 0x41600000    # 14.0f

    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x41480000    # 12.5f

    .line 754
    .line 755
    const/high16 v2, 0x41400000    # 12.0f

    .line 756
    .line 757
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v0, -0x40800000    # -1.0f

    .line 761
    .line 762
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, -0x41000000    # -0.5f

    .line 766
    .line 767
    const/high16 v18, -0x41000000    # -0.5f

    .line 768
    .line 769
    const v13, -0x4170a3d7    # -0.28f

    .line 770
    .line 771
    .line 772
    const/4 v14, 0x0

    .line 773
    const/high16 v15, -0x41000000    # -0.5f

    .line 774
    .line 775
    const v16, -0x419eb852    # -0.22f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, 0x3f000000    # 0.5f

    .line 782
    .line 783
    const/4 v13, 0x0

    .line 784
    const v14, -0x4170a3d7    # -0.28f

    .line 785
    .line 786
    .line 787
    const v15, 0x3e6147ae    # 0.22f

    .line 788
    .line 789
    .line 790
    const/high16 v16, -0x41000000    # -0.5f

    .line 791
    .line 792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v0, 0x3f800000    # 1.0f

    .line 796
    .line 797
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v18, 0x3f000000    # 0.5f

    .line 801
    .line 802
    const v13, 0x3e8f5c29    # 0.28f

    .line 803
    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const/high16 v15, 0x3f000000    # 0.5f

    .line 807
    .line 808
    const v16, 0x3e6147ae    # 0.22f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v17, 0x41480000    # 12.5f

    .line 815
    .line 816
    const/high16 v18, 0x41400000    # 12.0f

    .line 817
    .line 818
    const/high16 v13, 0x41500000    # 13.0f

    .line 819
    .line 820
    const v14, 0x413c7ae1    # 11.78f

    .line 821
    .line 822
    .line 823
    const v15, 0x414c7ae1    # 12.78f

    .line 824
    .line 825
    .line 826
    const/high16 v16, 0x41400000    # 12.0f

    .line 827
    .line 828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v0, 0x41780000    # 15.5f

    .line 835
    .line 836
    const/high16 v2, 0x41800000    # 16.0f

    .line 837
    .line 838
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v0, -0x40800000    # -1.0f

    .line 842
    .line 843
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v17, -0x41000000    # -0.5f

    .line 847
    .line 848
    const/high16 v18, -0x41000000    # -0.5f

    .line 849
    .line 850
    const v13, -0x4170a3d7    # -0.28f

    .line 851
    .line 852
    .line 853
    const/4 v14, 0x0

    .line 854
    const/high16 v15, -0x41000000    # -0.5f

    .line 855
    .line 856
    const v16, -0x419eb852    # -0.22f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const/high16 v17, 0x3f000000    # 0.5f

    .line 863
    .line 864
    const/4 v13, 0x0

    .line 865
    const v14, -0x4170a3d7    # -0.28f

    .line 866
    .line 867
    .line 868
    const v15, 0x3e6147ae    # 0.22f

    .line 869
    .line 870
    .line 871
    const/high16 v16, -0x41000000    # -0.5f

    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v0, 0x3f800000    # 1.0f

    .line 877
    .line 878
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v18, 0x3f000000    # 0.5f

    .line 882
    .line 883
    const v13, 0x3e8f5c29    # 0.28f

    .line 884
    .line 885
    .line 886
    const/4 v14, 0x0

    .line 887
    const/high16 v15, 0x3f000000    # 0.5f

    .line 888
    .line 889
    const v16, 0x3e6147ae    # 0.22f

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v17, 0x41780000    # 15.5f

    .line 896
    .line 897
    const/high16 v18, 0x41800000    # 16.0f

    .line 898
    .line 899
    const/high16 v13, 0x41800000    # 16.0f

    .line 900
    .line 901
    const v14, 0x417c7ae1    # 15.78f

    .line 902
    .line 903
    .line 904
    const v15, 0x417c7ae1    # 15.78f

    .line 905
    .line 906
    .line 907
    const/high16 v16, 0x41800000    # 16.0f

    .line 908
    .line 909
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const/high16 v0, 0x41780000    # 15.5f

    .line 916
    .line 917
    const/high16 v2, 0x41600000    # 14.0f

    .line 918
    .line 919
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v0, -0x40800000    # -1.0f

    .line 923
    .line 924
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v17, -0x41000000    # -0.5f

    .line 928
    .line 929
    const/high16 v18, -0x41000000    # -0.5f

    .line 930
    .line 931
    const v13, -0x4170a3d7    # -0.28f

    .line 932
    .line 933
    .line 934
    const/4 v14, 0x0

    .line 935
    const/high16 v15, -0x41000000    # -0.5f

    .line 936
    .line 937
    const v16, -0x419eb852    # -0.22f

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/high16 v17, 0x3f000000    # 0.5f

    .line 944
    .line 945
    const/4 v13, 0x0

    .line 946
    const v14, -0x4170a3d7    # -0.28f

    .line 947
    .line 948
    .line 949
    const v15, 0x3e6147ae    # 0.22f

    .line 950
    .line 951
    .line 952
    const/high16 v16, -0x41000000    # -0.5f

    .line 953
    .line 954
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v0, 0x3f800000    # 1.0f

    .line 958
    .line 959
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v18, 0x3f000000    # 0.5f

    .line 963
    .line 964
    const v13, 0x3e8f5c29    # 0.28f

    .line 965
    .line 966
    .line 967
    const/4 v14, 0x0

    .line 968
    const/high16 v15, 0x3f000000    # 0.5f

    .line 969
    .line 970
    const v16, 0x3e6147ae    # 0.22f

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const/high16 v17, 0x41780000    # 15.5f

    .line 977
    .line 978
    const/high16 v18, 0x41600000    # 14.0f

    .line 979
    .line 980
    const/high16 v13, 0x41800000    # 16.0f

    .line 981
    .line 982
    const v14, 0x415c7ae1    # 13.78f

    .line 983
    .line 984
    .line 985
    const v15, 0x417c7ae1    # 15.78f

    .line 986
    .line 987
    .line 988
    const/high16 v16, 0x41600000    # 14.0f

    .line 989
    .line 990
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const/high16 v0, 0x41780000    # 15.5f

    .line 997
    .line 998
    const/high16 v2, 0x41400000    # 12.0f

    .line 999
    .line 1000
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const/high16 v0, -0x40800000    # -1.0f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const/high16 v17, -0x41000000    # -0.5f

    .line 1009
    .line 1010
    const/high16 v18, -0x41000000    # -0.5f

    .line 1011
    .line 1012
    const v13, -0x4170a3d7    # -0.28f

    .line 1013
    .line 1014
    .line 1015
    const/4 v14, 0x0

    .line 1016
    const/high16 v15, -0x41000000    # -0.5f

    .line 1017
    .line 1018
    const v16, -0x419eb852    # -0.22f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1025
    .line 1026
    const/4 v13, 0x0

    .line 1027
    const v14, -0x4170a3d7    # -0.28f

    .line 1028
    .line 1029
    .line 1030
    const v15, 0x3e6147ae    # 0.22f

    .line 1031
    .line 1032
    .line 1033
    const/high16 v16, -0x41000000    # -0.5f

    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1039
    .line 1040
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1044
    .line 1045
    const v13, 0x3e8f5c29    # 0.28f

    .line 1046
    .line 1047
    .line 1048
    const/4 v14, 0x0

    .line 1049
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1050
    .line 1051
    const v16, 0x3e6147ae    # 0.22f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/high16 v17, 0x41780000    # 15.5f

    .line 1058
    .line 1059
    const/high16 v18, 0x41400000    # 12.0f

    .line 1060
    .line 1061
    const/high16 v13, 0x41800000    # 16.0f

    .line 1062
    .line 1063
    const v14, 0x413c7ae1    # 11.78f

    .line 1064
    .line 1065
    .line 1066
    const v15, 0x417c7ae1    # 15.78f

    .line 1067
    .line 1068
    .line 1069
    const/high16 v16, 0x41400000    # 12.0f

    .line 1070
    .line 1071
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    const/16 v16, 0x3800

    .line 1082
    .line 1083
    const/16 v17, 0x0

    .line 1084
    .line 1085
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1086
    .line 1087
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1088
    .line 1089
    const/4 v7, 0x0

    .line 1090
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1091
    .line 1092
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1093
    .line 1094
    const/4 v13, 0x0

    .line 1095
    const/4 v14, 0x0

    .line 1096
    const/4 v15, 0x0

    .line 1097
    const-string v4, ""

    .line 1098
    .line 1099
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    sput-object v0, Landroidx/compose/material/icons/outlined/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1108
    .line 1109
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    return-object v0
.end method
