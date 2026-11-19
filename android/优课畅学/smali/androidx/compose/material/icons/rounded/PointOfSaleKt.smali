.class public final Landroidx/compose/material/icons/rounded/PointOfSaleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPointOfSale(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PointOfSale"

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
    const/high16 v0, 0x41840000    # 16.5f

    .line 165
    .line 166
    const/high16 v2, 0x40c00000    # 6.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40e00000    # 7.0f

    .line 177
    .line 178
    const/high16 v18, 0x40b00000    # 5.5f

    .line 179
    .line 180
    const v13, 0x40e70a3d    # 7.22f

    .line 181
    .line 182
    .line 183
    const/high16 v14, 0x40c00000    # 6.0f

    .line 184
    .line 185
    const/high16 v15, 0x40e00000    # 7.0f

    .line 186
    .line 187
    const v16, 0x40b8f5c3    # 5.78f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, -0x40800000    # -1.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x40f00000    # 7.5f

    .line 199
    .line 200
    const/high16 v18, 0x40800000    # 4.0f

    .line 201
    .line 202
    const/high16 v13, 0x40e00000    # 7.0f

    .line 203
    .line 204
    const v14, 0x40870a3d    # 4.22f

    .line 205
    .line 206
    .line 207
    const v15, 0x40e70a3d    # 7.22f

    .line 208
    .line 209
    .line 210
    const/high16 v16, 0x40800000    # 4.0f

    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41100000    # 9.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x41880000    # 17.0f

    .line 221
    .line 222
    const/high16 v18, 0x40900000    # 4.5f

    .line 223
    .line 224
    const v13, 0x41863d71    # 16.78f

    .line 225
    .line 226
    .line 227
    const/high16 v14, 0x40800000    # 4.0f

    .line 228
    .line 229
    const/high16 v15, 0x41880000    # 17.0f

    .line 230
    .line 231
    const v16, 0x40870a3d    # 4.22f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x3f800000    # 1.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x41840000    # 16.5f

    .line 243
    .line 244
    const/high16 v18, 0x40c00000    # 6.0f

    .line 245
    .line 246
    const/high16 v13, 0x41880000    # 17.0f

    .line 247
    .line 248
    const v14, 0x40b8f5c3    # 5.78f

    .line 249
    .line 250
    .line 251
    const v15, 0x41863d71    # 16.78f

    .line 252
    .line 253
    .line 254
    const/high16 v16, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41b00000    # 22.0f

    .line 263
    .line 264
    const/high16 v2, 0x41a00000    # 20.0f

    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x40800000    # 4.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40000000    # -2.0f

    .line 275
    .line 276
    const/high16 v18, -0x40000000    # -2.0f

    .line 277
    .line 278
    const v13, -0x40733333    # -1.1f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, -0x40000000    # -2.0f

    .line 283
    .line 284
    const v16, -0x4099999a    # -0.9f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, -0x40800000    # -1.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41a00000    # 20.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x3f800000    # 1.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x41a00000    # 20.0f

    .line 306
    .line 307
    const/high16 v18, 0x41b00000    # 22.0f

    .line 308
    .line 309
    const/high16 v13, 0x41b00000    # 22.0f

    .line 310
    .line 311
    const v14, 0x41a8cccd    # 21.1f

    .line 312
    .line 313
    .line 314
    const v15, 0x41a8cccd    # 21.1f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x41b00000    # 22.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x41230a3d    # 10.19f

    .line 326
    .line 327
    .line 328
    const v2, 0x41943d71    # 18.53f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x4185999a    # 16.7f

    .line 335
    .line 336
    .line 337
    const/high16 v18, 0x41100000    # 9.0f

    .line 338
    .line 339
    const v13, 0x4191ae14    # 18.21f

    .line 340
    .line 341
    .line 342
    const v14, 0x4117851f    # 9.47f

    .line 343
    .line 344
    .line 345
    const v15, 0x418beb85    # 17.49f

    .line 346
    .line 347
    .line 348
    const/high16 v16, 0x41100000    # 9.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x40e9999a    # 7.3f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x4015c28f    # -1.83f

    .line 360
    .line 361
    .line 362
    const v18, 0x3f9851ec    # 1.19f

    .line 363
    .line 364
    .line 365
    const v13, -0x40b5c28f    # -0.79f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const v15, -0x403eb852    # -1.51f

    .line 370
    .line 371
    .line 372
    const v16, 0x3ef0a3d7    # 0.47f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41900000    # 18.0f

    .line 379
    .line 380
    const/high16 v2, 0x40000000    # 2.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41a00000    # 20.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x41230a3d    # 10.19f

    .line 391
    .line 392
    .line 393
    const v2, 0x41943d71    # 18.53f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41800000    # 16.0f

    .line 403
    .line 404
    const/high16 v2, 0x41180000    # 9.5f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, -0x40800000    # -1.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41000000    # 8.0f

    .line 415
    .line 416
    const/high16 v18, 0x41780000    # 15.5f

    .line 417
    .line 418
    const v13, 0x4103851f    # 8.22f

    .line 419
    .line 420
    .line 421
    const/high16 v14, 0x41800000    # 16.0f

    .line 422
    .line 423
    const/high16 v15, 0x41000000    # 8.0f

    .line 424
    .line 425
    const v16, 0x417c7ae1    # 15.78f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x41080000    # 8.5f

    .line 432
    .line 433
    const/high16 v18, 0x41700000    # 15.0f

    .line 434
    .line 435
    const/high16 v13, 0x41000000    # 8.0f

    .line 436
    .line 437
    const v14, 0x4173851f    # 15.22f

    .line 438
    .line 439
    .line 440
    const v15, 0x4103851f    # 8.22f

    .line 441
    .line 442
    .line 443
    const/high16 v16, 0x41700000    # 15.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x3f800000    # 1.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x3f000000    # 0.5f

    .line 454
    .line 455
    const/high16 v18, 0x3f000000    # 0.5f

    .line 456
    .line 457
    const v13, 0x3e8f5c29    # 0.28f

    .line 458
    .line 459
    .line 460
    const/4 v14, 0x0

    .line 461
    const/high16 v15, 0x3f000000    # 0.5f

    .line 462
    .line 463
    const v16, 0x3e6147ae    # 0.22f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x41180000    # 9.5f

    .line 470
    .line 471
    const/high16 v18, 0x41800000    # 16.0f

    .line 472
    .line 473
    const/high16 v13, 0x41200000    # 10.0f

    .line 474
    .line 475
    const v14, 0x417c7ae1    # 15.78f

    .line 476
    .line 477
    .line 478
    const v15, 0x411c7ae1    # 9.78f

    .line 479
    .line 480
    .line 481
    const/high16 v16, 0x41800000    # 16.0f

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41600000    # 14.0f

    .line 490
    .line 491
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, -0x40800000    # -1.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x41000000    # 8.0f

    .line 500
    .line 501
    const/high16 v18, 0x41580000    # 13.5f

    .line 502
    .line 503
    const v13, 0x4103851f    # 8.22f

    .line 504
    .line 505
    .line 506
    const/high16 v14, 0x41600000    # 14.0f

    .line 507
    .line 508
    const/high16 v15, 0x41000000    # 8.0f

    .line 509
    .line 510
    const v16, 0x415c7ae1    # 13.78f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41080000    # 8.5f

    .line 517
    .line 518
    const/high16 v18, 0x41500000    # 13.0f

    .line 519
    .line 520
    const/high16 v13, 0x41000000    # 8.0f

    .line 521
    .line 522
    const v14, 0x4153851f    # 13.22f

    .line 523
    .line 524
    .line 525
    const v15, 0x4103851f    # 8.22f

    .line 526
    .line 527
    .line 528
    const/high16 v16, 0x41500000    # 13.0f

    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x3f800000    # 1.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x3f000000    # 0.5f

    .line 539
    .line 540
    const/high16 v18, 0x3f000000    # 0.5f

    .line 541
    .line 542
    const v13, 0x3e8f5c29    # 0.28f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const/high16 v15, 0x3f000000    # 0.5f

    .line 547
    .line 548
    const v16, 0x3e6147ae    # 0.22f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x41180000    # 9.5f

    .line 555
    .line 556
    const/high16 v18, 0x41600000    # 14.0f

    .line 557
    .line 558
    const/high16 v13, 0x41200000    # 10.0f

    .line 559
    .line 560
    const v14, 0x415c7ae1    # 13.78f

    .line 561
    .line 562
    .line 563
    const v15, 0x411c7ae1    # 9.78f

    .line 564
    .line 565
    .line 566
    const/high16 v16, 0x41600000    # 14.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41400000    # 12.0f

    .line 575
    .line 576
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, -0x40800000    # -1.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41000000    # 8.0f

    .line 585
    .line 586
    const/high16 v18, 0x41380000    # 11.5f

    .line 587
    .line 588
    const v13, 0x4103851f    # 8.22f

    .line 589
    .line 590
    .line 591
    const/high16 v14, 0x41400000    # 12.0f

    .line 592
    .line 593
    const/high16 v15, 0x41000000    # 8.0f

    .line 594
    .line 595
    const v16, 0x413c7ae1    # 11.78f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x41080000    # 8.5f

    .line 602
    .line 603
    const/high16 v18, 0x41300000    # 11.0f

    .line 604
    .line 605
    const/high16 v13, 0x41000000    # 8.0f

    .line 606
    .line 607
    const v14, 0x4133851f    # 11.22f

    .line 608
    .line 609
    .line 610
    const v15, 0x4103851f    # 8.22f

    .line 611
    .line 612
    .line 613
    const/high16 v16, 0x41300000    # 11.0f

    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x3f800000    # 1.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, 0x3f000000    # 0.5f

    .line 624
    .line 625
    const/high16 v18, 0x3f000000    # 0.5f

    .line 626
    .line 627
    const v13, 0x3e8f5c29    # 0.28f

    .line 628
    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    const/high16 v15, 0x3f000000    # 0.5f

    .line 632
    .line 633
    const v16, 0x3e6147ae    # 0.22f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41180000    # 9.5f

    .line 640
    .line 641
    const/high16 v18, 0x41400000    # 12.0f

    .line 642
    .line 643
    const/high16 v13, 0x41200000    # 10.0f

    .line 644
    .line 645
    const v14, 0x413c7ae1    # 11.78f

    .line 646
    .line 647
    .line 648
    const v15, 0x411c7ae1    # 9.78f

    .line 649
    .line 650
    .line 651
    const/high16 v16, 0x41400000    # 12.0f

    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41480000    # 12.5f

    .line 660
    .line 661
    const/high16 v2, 0x41800000    # 16.0f

    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, -0x40800000    # -1.0f

    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, -0x41000000    # -0.5f

    .line 672
    .line 673
    const/high16 v18, -0x41000000    # -0.5f

    .line 674
    .line 675
    const v13, -0x4170a3d7    # -0.28f

    .line 676
    .line 677
    .line 678
    const/4 v14, 0x0

    .line 679
    const/high16 v15, -0x41000000    # -0.5f

    .line 680
    .line 681
    const v16, -0x419eb852    # -0.22f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v17, 0x3f000000    # 0.5f

    .line 688
    .line 689
    const/4 v13, 0x0

    .line 690
    const v14, -0x4170a3d7    # -0.28f

    .line 691
    .line 692
    .line 693
    const v15, 0x3e6147ae    # 0.22f

    .line 694
    .line 695
    .line 696
    const/high16 v16, -0x41000000    # -0.5f

    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x3f800000    # 1.0f

    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v18, 0x3f000000    # 0.5f

    .line 707
    .line 708
    const v13, 0x3e8f5c29    # 0.28f

    .line 709
    .line 710
    .line 711
    const/4 v14, 0x0

    .line 712
    const/high16 v15, 0x3f000000    # 0.5f

    .line 713
    .line 714
    const v16, 0x3e6147ae    # 0.22f

    .line 715
    .line 716
    .line 717
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v17, 0x41480000    # 12.5f

    .line 721
    .line 722
    const/high16 v18, 0x41800000    # 16.0f

    .line 723
    .line 724
    const/high16 v13, 0x41500000    # 13.0f

    .line 725
    .line 726
    const v14, 0x417c7ae1    # 15.78f

    .line 727
    .line 728
    .line 729
    const v15, 0x414c7ae1    # 12.78f

    .line 730
    .line 731
    .line 732
    const/high16 v16, 0x41800000    # 16.0f

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41480000    # 12.5f

    .line 741
    .line 742
    const/high16 v2, 0x41600000    # 14.0f

    .line 743
    .line 744
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v0, -0x40800000    # -1.0f

    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v17, -0x41000000    # -0.5f

    .line 753
    .line 754
    const/high16 v18, -0x41000000    # -0.5f

    .line 755
    .line 756
    const v13, -0x4170a3d7    # -0.28f

    .line 757
    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    const/high16 v15, -0x41000000    # -0.5f

    .line 761
    .line 762
    const v16, -0x419eb852    # -0.22f

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x3f000000    # 0.5f

    .line 769
    .line 770
    const/4 v13, 0x0

    .line 771
    const v14, -0x4170a3d7    # -0.28f

    .line 772
    .line 773
    .line 774
    const v15, 0x3e6147ae    # 0.22f

    .line 775
    .line 776
    .line 777
    const/high16 v16, -0x41000000    # -0.5f

    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const/high16 v0, 0x3f800000    # 1.0f

    .line 783
    .line 784
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v18, 0x3f000000    # 0.5f

    .line 788
    .line 789
    const v13, 0x3e8f5c29    # 0.28f

    .line 790
    .line 791
    .line 792
    const/4 v14, 0x0

    .line 793
    const/high16 v15, 0x3f000000    # 0.5f

    .line 794
    .line 795
    const v16, 0x3e6147ae    # 0.22f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v17, 0x41480000    # 12.5f

    .line 802
    .line 803
    const/high16 v18, 0x41600000    # 14.0f

    .line 804
    .line 805
    const/high16 v13, 0x41500000    # 13.0f

    .line 806
    .line 807
    const v14, 0x415c7ae1    # 13.78f

    .line 808
    .line 809
    .line 810
    const v15, 0x414c7ae1    # 12.78f

    .line 811
    .line 812
    .line 813
    const/high16 v16, 0x41600000    # 14.0f

    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v0, 0x41480000    # 12.5f

    .line 822
    .line 823
    const/high16 v2, 0x41400000    # 12.0f

    .line 824
    .line 825
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v0, -0x40800000    # -1.0f

    .line 829
    .line 830
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v17, -0x41000000    # -0.5f

    .line 834
    .line 835
    const/high16 v18, -0x41000000    # -0.5f

    .line 836
    .line 837
    const v13, -0x4170a3d7    # -0.28f

    .line 838
    .line 839
    .line 840
    const/4 v14, 0x0

    .line 841
    const/high16 v15, -0x41000000    # -0.5f

    .line 842
    .line 843
    const v16, -0x419eb852    # -0.22f

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const/high16 v17, 0x3f000000    # 0.5f

    .line 850
    .line 851
    const/4 v13, 0x0

    .line 852
    const v14, -0x4170a3d7    # -0.28f

    .line 853
    .line 854
    .line 855
    const v15, 0x3e6147ae    # 0.22f

    .line 856
    .line 857
    .line 858
    const/high16 v16, -0x41000000    # -0.5f

    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x3f800000    # 1.0f

    .line 864
    .line 865
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v18, 0x3f000000    # 0.5f

    .line 869
    .line 870
    const v13, 0x3e8f5c29    # 0.28f

    .line 871
    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    const/high16 v15, 0x3f000000    # 0.5f

    .line 875
    .line 876
    const v16, 0x3e6147ae    # 0.22f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v17, 0x41480000    # 12.5f

    .line 883
    .line 884
    const/high16 v18, 0x41400000    # 12.0f

    .line 885
    .line 886
    const/high16 v13, 0x41500000    # 13.0f

    .line 887
    .line 888
    const v14, 0x413c7ae1    # 11.78f

    .line 889
    .line 890
    .line 891
    const v15, 0x414c7ae1    # 12.78f

    .line 892
    .line 893
    .line 894
    const/high16 v16, 0x41400000    # 12.0f

    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v0, 0x41780000    # 15.5f

    .line 903
    .line 904
    const/high16 v2, 0x41800000    # 16.0f

    .line 905
    .line 906
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v0, -0x40800000    # -1.0f

    .line 910
    .line 911
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v17, -0x41000000    # -0.5f

    .line 915
    .line 916
    const/high16 v18, -0x41000000    # -0.5f

    .line 917
    .line 918
    const v13, -0x4170a3d7    # -0.28f

    .line 919
    .line 920
    .line 921
    const/4 v14, 0x0

    .line 922
    const/high16 v15, -0x41000000    # -0.5f

    .line 923
    .line 924
    const v16, -0x419eb852    # -0.22f

    .line 925
    .line 926
    .line 927
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v17, 0x3f000000    # 0.5f

    .line 931
    .line 932
    const/4 v13, 0x0

    .line 933
    const v14, -0x4170a3d7    # -0.28f

    .line 934
    .line 935
    .line 936
    const v15, 0x3e6147ae    # 0.22f

    .line 937
    .line 938
    .line 939
    const/high16 v16, -0x41000000    # -0.5f

    .line 940
    .line 941
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v0, 0x3f800000    # 1.0f

    .line 945
    .line 946
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v18, 0x3f000000    # 0.5f

    .line 950
    .line 951
    const v13, 0x3e8f5c29    # 0.28f

    .line 952
    .line 953
    .line 954
    const/4 v14, 0x0

    .line 955
    const/high16 v15, 0x3f000000    # 0.5f

    .line 956
    .line 957
    const v16, 0x3e6147ae    # 0.22f

    .line 958
    .line 959
    .line 960
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v17, 0x41780000    # 15.5f

    .line 964
    .line 965
    const/high16 v18, 0x41800000    # 16.0f

    .line 966
    .line 967
    const/high16 v13, 0x41800000    # 16.0f

    .line 968
    .line 969
    const v14, 0x417c7ae1    # 15.78f

    .line 970
    .line 971
    .line 972
    const v15, 0x417c7ae1    # 15.78f

    .line 973
    .line 974
    .line 975
    const/high16 v16, 0x41800000    # 16.0f

    .line 976
    .line 977
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v0, 0x41780000    # 15.5f

    .line 984
    .line 985
    const/high16 v2, 0x41600000    # 14.0f

    .line 986
    .line 987
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    const/high16 v0, -0x40800000    # -1.0f

    .line 991
    .line 992
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const/high16 v17, -0x41000000    # -0.5f

    .line 996
    .line 997
    const/high16 v18, -0x41000000    # -0.5f

    .line 998
    .line 999
    const v13, -0x4170a3d7    # -0.28f

    .line 1000
    .line 1001
    .line 1002
    const/4 v14, 0x0

    .line 1003
    const/high16 v15, -0x41000000    # -0.5f

    .line 1004
    .line 1005
    const v16, -0x419eb852    # -0.22f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1012
    .line 1013
    const/4 v13, 0x0

    .line 1014
    const v14, -0x4170a3d7    # -0.28f

    .line 1015
    .line 1016
    .line 1017
    const v15, 0x3e6147ae    # 0.22f

    .line 1018
    .line 1019
    .line 1020
    const/high16 v16, -0x41000000    # -0.5f

    .line 1021
    .line 1022
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1026
    .line 1027
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1031
    .line 1032
    const v13, 0x3e8f5c29    # 0.28f

    .line 1033
    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1037
    .line 1038
    const v16, 0x3e6147ae    # 0.22f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const/high16 v17, 0x41780000    # 15.5f

    .line 1045
    .line 1046
    const/high16 v18, 0x41600000    # 14.0f

    .line 1047
    .line 1048
    const/high16 v13, 0x41800000    # 16.0f

    .line 1049
    .line 1050
    const v14, 0x415c7ae1    # 13.78f

    .line 1051
    .line 1052
    .line 1053
    const v15, 0x417c7ae1    # 15.78f

    .line 1054
    .line 1055
    .line 1056
    const/high16 v16, 0x41600000    # 14.0f

    .line 1057
    .line 1058
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const/high16 v0, 0x41780000    # 15.5f

    .line 1065
    .line 1066
    const/high16 v2, 0x41400000    # 12.0f

    .line 1067
    .line 1068
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const/high16 v0, -0x40800000    # -1.0f

    .line 1072
    .line 1073
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const/high16 v17, -0x41000000    # -0.5f

    .line 1077
    .line 1078
    const/high16 v18, -0x41000000    # -0.5f

    .line 1079
    .line 1080
    const v13, -0x4170a3d7    # -0.28f

    .line 1081
    .line 1082
    .line 1083
    const/4 v14, 0x0

    .line 1084
    const/high16 v15, -0x41000000    # -0.5f

    .line 1085
    .line 1086
    const v16, -0x419eb852    # -0.22f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1093
    .line 1094
    const/4 v13, 0x0

    .line 1095
    const v14, -0x4170a3d7    # -0.28f

    .line 1096
    .line 1097
    .line 1098
    const v15, 0x3e6147ae    # 0.22f

    .line 1099
    .line 1100
    .line 1101
    const/high16 v16, -0x41000000    # -0.5f

    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1107
    .line 1108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1112
    .line 1113
    const v13, 0x3e8f5c29    # 0.28f

    .line 1114
    .line 1115
    .line 1116
    const/4 v14, 0x0

    .line 1117
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1118
    .line 1119
    const v16, 0x3e6147ae    # 0.22f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v17, 0x41780000    # 15.5f

    .line 1126
    .line 1127
    const/high16 v18, 0x41400000    # 12.0f

    .line 1128
    .line 1129
    const/high16 v13, 0x41800000    # 16.0f

    .line 1130
    .line 1131
    const v14, 0x413c7ae1    # 11.78f

    .line 1132
    .line 1133
    .line 1134
    const v15, 0x417c7ae1    # 15.78f

    .line 1135
    .line 1136
    .line 1137
    const/high16 v16, 0x41400000    # 12.0f

    .line 1138
    .line 1139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    const/16 v16, 0x3800

    .line 1150
    .line 1151
    const/16 v17, 0x0

    .line 1152
    .line 1153
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1154
    .line 1155
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1156
    .line 1157
    const/4 v7, 0x0

    .line 1158
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1159
    .line 1160
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1161
    .line 1162
    const/4 v13, 0x0

    .line 1163
    const/4 v14, 0x0

    .line 1164
    const/4 v15, 0x0

    .line 1165
    const-string v4, ""

    .line 1166
    .line 1167
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    sput-object v0, Landroidx/compose/material/icons/rounded/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1176
    .line 1177
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    return-object v0
.end method
