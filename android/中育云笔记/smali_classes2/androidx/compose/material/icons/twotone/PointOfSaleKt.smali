.class public final Landroidx/compose/material/icons/twotone/PointOfSaleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPointOfSale(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PointOfSale"

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
    const/high16 v4, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x41000000    # 8.0f

    .line 83
    .line 84
    const/high16 v26, 0x41780000    # 15.5f

    .line 85
    .line 86
    const v21, 0x4103851f    # 8.22f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x41800000    # 16.0f

    .line 90
    .line 91
    const/high16 v23, 0x41000000    # 8.0f

    .line 92
    .line 93
    const v24, 0x417c7ae1    # 15.78f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x41080000    # 8.5f

    .line 102
    .line 103
    const/high16 v26, 0x41700000    # 15.0f

    .line 104
    .line 105
    const/high16 v21, 0x41000000    # 8.0f

    .line 106
    .line 107
    const v22, 0x4173851f    # 15.22f

    .line 108
    .line 109
    .line 110
    const v23, 0x4103851f    # 8.22f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x41700000    # 15.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x3f800000    # 1.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x3f000000    # 0.5f

    .line 124
    .line 125
    const/high16 v26, 0x3f000000    # 0.5f

    .line 126
    .line 127
    const v21, 0x3e8f5c29    # 0.28f

    .line 128
    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const/high16 v23, 0x3f000000    # 0.5f

    .line 133
    .line 134
    const v24, 0x3e6147ae    # 0.22f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41180000    # 9.5f

    .line 141
    .line 142
    const/high16 v26, 0x41800000    # 16.0f

    .line 143
    .line 144
    const/high16 v21, 0x41200000    # 10.0f

    .line 145
    .line 146
    const v22, 0x417c7ae1    # 15.78f

    .line 147
    .line 148
    .line 149
    const v23, 0x411c7ae1    # 9.78f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x41800000    # 16.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x41580000    # 13.5f

    .line 161
    .line 162
    const/high16 v6, 0x41200000    # 10.0f

    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, -0x41000000    # -0.5f

    .line 168
    .line 169
    const/high16 v26, -0x41000000    # -0.5f

    .line 170
    .line 171
    const/16 v21, 0x0

    .line 172
    .line 173
    const v22, -0x4170a3d7    # -0.28f

    .line 174
    .line 175
    .line 176
    const v23, -0x419eb852    # -0.22f

    .line 177
    .line 178
    .line 179
    const/high16 v24, -0x41000000    # -0.5f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, -0x40800000    # -1.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, 0x41000000    # 8.0f

    .line 190
    .line 191
    const/high16 v26, 0x41580000    # 13.5f

    .line 192
    .line 193
    const v21, 0x4103851f    # 8.22f

    .line 194
    .line 195
    .line 196
    const/high16 v22, 0x41500000    # 13.0f

    .line 197
    .line 198
    const/high16 v23, 0x41000000    # 8.0f

    .line 199
    .line 200
    const v24, 0x4153851f    # 13.22f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x41080000    # 8.5f

    .line 207
    .line 208
    const/high16 v26, 0x41600000    # 14.0f

    .line 209
    .line 210
    const/high16 v21, 0x41000000    # 8.0f

    .line 211
    .line 212
    const v22, 0x415c7ae1    # 13.78f

    .line 213
    .line 214
    .line 215
    const v23, 0x4103851f    # 8.22f

    .line 216
    .line 217
    .line 218
    const/high16 v24, 0x41600000    # 14.0f

    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x3f800000    # 1.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x41200000    # 10.0f

    .line 229
    .line 230
    const/high16 v26, 0x41580000    # 13.5f

    .line 231
    .line 232
    const v21, 0x411c7ae1    # 9.78f

    .line 233
    .line 234
    .line 235
    const/high16 v22, 0x41600000    # 14.0f

    .line 236
    .line 237
    const/high16 v23, 0x41200000    # 10.0f

    .line 238
    .line 239
    const v24, 0x415c7ae1    # 13.78f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x41380000    # 11.5f

    .line 249
    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, -0x41000000    # -0.5f

    .line 254
    .line 255
    const/high16 v26, -0x41000000    # -0.5f

    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const v22, -0x4170a3d7    # -0.28f

    .line 260
    .line 261
    .line 262
    const v23, -0x419eb852    # -0.22f

    .line 263
    .line 264
    .line 265
    const/high16 v24, -0x41000000    # -0.5f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x41000000    # 8.0f

    .line 276
    .line 277
    const/high16 v26, 0x41380000    # 11.5f

    .line 278
    .line 279
    const v21, 0x4103851f    # 8.22f

    .line 280
    .line 281
    .line 282
    const/high16 v22, 0x41300000    # 11.0f

    .line 283
    .line 284
    const/high16 v23, 0x41000000    # 8.0f

    .line 285
    .line 286
    const v24, 0x4133851f    # 11.22f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x41080000    # 8.5f

    .line 293
    .line 294
    const/high16 v26, 0x41400000    # 12.0f

    .line 295
    .line 296
    const/high16 v21, 0x41000000    # 8.0f

    .line 297
    .line 298
    const v22, 0x413c7ae1    # 11.78f

    .line 299
    .line 300
    .line 301
    const v23, 0x4103851f    # 8.22f

    .line 302
    .line 303
    .line 304
    const/high16 v24, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x3f800000    # 1.0f

    .line 310
    .line 311
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v25, 0x41200000    # 10.0f

    .line 315
    .line 316
    const/high16 v26, 0x41380000    # 11.5f

    .line 317
    .line 318
    const v21, 0x411c7ae1    # 9.78f

    .line 319
    .line 320
    .line 321
    const/high16 v22, 0x41400000    # 12.0f

    .line 322
    .line 323
    const/high16 v23, 0x41200000    # 10.0f

    .line 324
    .line 325
    const v24, 0x413c7ae1    # 11.78f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x41500000    # 13.0f

    .line 335
    .line 336
    const/high16 v6, 0x41780000    # 15.5f

    .line 337
    .line 338
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v25, -0x41000000    # -0.5f

    .line 342
    .line 343
    const/high16 v26, -0x41000000    # -0.5f

    .line 344
    .line 345
    const/16 v21, 0x0

    .line 346
    .line 347
    const v22, -0x4170a3d7    # -0.28f

    .line 348
    .line 349
    .line 350
    const v23, -0x419eb852    # -0.22f

    .line 351
    .line 352
    .line 353
    const/high16 v24, -0x41000000    # -0.5f

    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, -0x40800000    # -1.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v26, 0x3f000000    # 0.5f

    .line 364
    .line 365
    const v21, -0x4170a3d7    # -0.28f

    .line 366
    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    const/high16 v23, -0x41000000    # -0.5f

    .line 371
    .line 372
    const v24, 0x3e6147ae    # 0.22f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v25, 0x3f000000    # 0.5f

    .line 379
    .line 380
    const/16 v21, 0x0

    .line 381
    .line 382
    const v22, 0x3e8f5c29    # 0.28f

    .line 383
    .line 384
    .line 385
    const v23, 0x3e6147ae    # 0.22f

    .line 386
    .line 387
    .line 388
    const/high16 v24, 0x3f000000    # 0.5f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v4, 0x3f800000    # 1.0f

    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, 0x41500000    # 13.0f

    .line 399
    .line 400
    const/high16 v26, 0x41780000    # 15.5f

    .line 401
    .line 402
    const v21, 0x414c7ae1    # 12.78f

    .line 403
    .line 404
    .line 405
    const/high16 v22, 0x41800000    # 16.0f

    .line 406
    .line 407
    const/high16 v23, 0x41500000    # 13.0f

    .line 408
    .line 409
    const v24, 0x417c7ae1    # 15.78f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x41500000    # 13.0f

    .line 419
    .line 420
    const/high16 v6, 0x41580000    # 13.5f

    .line 421
    .line 422
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v25, -0x41000000    # -0.5f

    .line 426
    .line 427
    const/high16 v26, -0x41000000    # -0.5f

    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    const v22, -0x4170a3d7    # -0.28f

    .line 432
    .line 433
    .line 434
    const v23, -0x419eb852    # -0.22f

    .line 435
    .line 436
    .line 437
    const/high16 v24, -0x41000000    # -0.5f

    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v4, -0x40800000    # -1.0f

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v26, 0x3f000000    # 0.5f

    .line 448
    .line 449
    const v21, -0x4170a3d7    # -0.28f

    .line 450
    .line 451
    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const/high16 v23, -0x41000000    # -0.5f

    .line 455
    .line 456
    const v24, 0x3e6147ae    # 0.22f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v25, 0x3f000000    # 0.5f

    .line 463
    .line 464
    const/16 v21, 0x0

    .line 465
    .line 466
    const v22, 0x3e8f5c29    # 0.28f

    .line 467
    .line 468
    .line 469
    const v23, 0x3e6147ae    # 0.22f

    .line 470
    .line 471
    .line 472
    const/high16 v24, 0x3f000000    # 0.5f

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x3f800000    # 1.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v25, 0x41500000    # 13.0f

    .line 483
    .line 484
    const/high16 v26, 0x41580000    # 13.5f

    .line 485
    .line 486
    const v21, 0x414c7ae1    # 12.78f

    .line 487
    .line 488
    .line 489
    const/high16 v22, 0x41600000    # 14.0f

    .line 490
    .line 491
    const/high16 v23, 0x41500000    # 13.0f

    .line 492
    .line 493
    const v24, 0x415c7ae1    # 13.78f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v4, 0x41500000    # 13.0f

    .line 503
    .line 504
    const/high16 v6, 0x41380000    # 11.5f

    .line 505
    .line 506
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, -0x41000000    # -0.5f

    .line 510
    .line 511
    const/high16 v26, -0x41000000    # -0.5f

    .line 512
    .line 513
    const/16 v21, 0x0

    .line 514
    .line 515
    const v22, -0x4170a3d7    # -0.28f

    .line 516
    .line 517
    .line 518
    const v23, -0x419eb852    # -0.22f

    .line 519
    .line 520
    .line 521
    const/high16 v24, -0x41000000    # -0.5f

    .line 522
    .line 523
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v4, -0x40800000    # -1.0f

    .line 527
    .line 528
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v26, 0x3f000000    # 0.5f

    .line 532
    .line 533
    const v21, -0x4170a3d7    # -0.28f

    .line 534
    .line 535
    .line 536
    const/16 v22, 0x0

    .line 537
    .line 538
    const/high16 v23, -0x41000000    # -0.5f

    .line 539
    .line 540
    const v24, 0x3e6147ae    # 0.22f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v25, 0x3f000000    # 0.5f

    .line 547
    .line 548
    const/16 v21, 0x0

    .line 549
    .line 550
    const v22, 0x3e8f5c29    # 0.28f

    .line 551
    .line 552
    .line 553
    const v23, 0x3e6147ae    # 0.22f

    .line 554
    .line 555
    .line 556
    const/high16 v24, 0x3f000000    # 0.5f

    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x3f800000    # 1.0f

    .line 562
    .line 563
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v25, 0x41500000    # 13.0f

    .line 567
    .line 568
    const/high16 v26, 0x41380000    # 11.5f

    .line 569
    .line 570
    const v21, 0x414c7ae1    # 12.78f

    .line 571
    .line 572
    .line 573
    const/high16 v22, 0x41400000    # 12.0f

    .line 574
    .line 575
    const/high16 v23, 0x41500000    # 13.0f

    .line 576
    .line 577
    const v24, 0x413c7ae1    # 11.78f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v4, 0x41780000    # 15.5f

    .line 587
    .line 588
    const/high16 v6, 0x41800000    # 16.0f

    .line 589
    .line 590
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v25, -0x41000000    # -0.5f

    .line 594
    .line 595
    const/high16 v26, -0x41000000    # -0.5f

    .line 596
    .line 597
    const/16 v21, 0x0

    .line 598
    .line 599
    const v22, -0x4170a3d7    # -0.28f

    .line 600
    .line 601
    .line 602
    const v23, -0x419eb852    # -0.22f

    .line 603
    .line 604
    .line 605
    const/high16 v24, -0x41000000    # -0.5f

    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v4, -0x40800000    # -1.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v26, 0x3f000000    # 0.5f

    .line 616
    .line 617
    const v21, -0x4170a3d7    # -0.28f

    .line 618
    .line 619
    .line 620
    const/16 v22, 0x0

    .line 621
    .line 622
    const/high16 v23, -0x41000000    # -0.5f

    .line 623
    .line 624
    const v24, 0x3e6147ae    # 0.22f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v25, 0x3f000000    # 0.5f

    .line 631
    .line 632
    const/16 v21, 0x0

    .line 633
    .line 634
    const v22, 0x3e8f5c29    # 0.28f

    .line 635
    .line 636
    .line 637
    const v23, 0x3e6147ae    # 0.22f

    .line 638
    .line 639
    .line 640
    const/high16 v24, 0x3f000000    # 0.5f

    .line 641
    .line 642
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v4, 0x3f800000    # 1.0f

    .line 646
    .line 647
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v25, 0x41800000    # 16.0f

    .line 651
    .line 652
    const/high16 v26, 0x41780000    # 15.5f

    .line 653
    .line 654
    const v21, 0x417c7ae1    # 15.78f

    .line 655
    .line 656
    .line 657
    const/high16 v22, 0x41800000    # 16.0f

    .line 658
    .line 659
    const/high16 v23, 0x41800000    # 16.0f

    .line 660
    .line 661
    const v24, 0x417c7ae1    # 15.78f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v4, 0x41580000    # 13.5f

    .line 671
    .line 672
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v25, -0x41000000    # -0.5f

    .line 676
    .line 677
    const/high16 v26, -0x41000000    # -0.5f

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const v22, -0x4170a3d7    # -0.28f

    .line 682
    .line 683
    .line 684
    const v23, -0x419eb852    # -0.22f

    .line 685
    .line 686
    .line 687
    const/high16 v24, -0x41000000    # -0.5f

    .line 688
    .line 689
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v4, -0x40800000    # -1.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v26, 0x3f000000    # 0.5f

    .line 698
    .line 699
    const v21, -0x4170a3d7    # -0.28f

    .line 700
    .line 701
    .line 702
    const/16 v22, 0x0

    .line 703
    .line 704
    const/high16 v23, -0x41000000    # -0.5f

    .line 705
    .line 706
    const v24, 0x3e6147ae    # 0.22f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v25, 0x3f000000    # 0.5f

    .line 713
    .line 714
    const/16 v21, 0x0

    .line 715
    .line 716
    const v22, 0x3e8f5c29    # 0.28f

    .line 717
    .line 718
    .line 719
    const v23, 0x3e6147ae    # 0.22f

    .line 720
    .line 721
    .line 722
    const/high16 v24, 0x3f000000    # 0.5f

    .line 723
    .line 724
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v4, 0x3f800000    # 1.0f

    .line 728
    .line 729
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v25, 0x41800000    # 16.0f

    .line 733
    .line 734
    const/high16 v26, 0x41580000    # 13.5f

    .line 735
    .line 736
    const v21, 0x417c7ae1    # 15.78f

    .line 737
    .line 738
    .line 739
    const/high16 v22, 0x41600000    # 14.0f

    .line 740
    .line 741
    const/high16 v23, 0x41800000    # 16.0f

    .line 742
    .line 743
    const v24, 0x415c7ae1    # 13.78f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v4, 0x41380000    # 11.5f

    .line 753
    .line 754
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v25, -0x41000000    # -0.5f

    .line 758
    .line 759
    const/high16 v26, -0x41000000    # -0.5f

    .line 760
    .line 761
    const/16 v21, 0x0

    .line 762
    .line 763
    const v22, -0x4170a3d7    # -0.28f

    .line 764
    .line 765
    .line 766
    const v23, -0x419eb852    # -0.22f

    .line 767
    .line 768
    .line 769
    const/high16 v24, -0x41000000    # -0.5f

    .line 770
    .line 771
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v4, -0x40800000    # -1.0f

    .line 775
    .line 776
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v26, 0x3f000000    # 0.5f

    .line 780
    .line 781
    const v21, -0x4170a3d7    # -0.28f

    .line 782
    .line 783
    .line 784
    const/16 v22, 0x0

    .line 785
    .line 786
    const/high16 v23, -0x41000000    # -0.5f

    .line 787
    .line 788
    const v24, 0x3e6147ae    # 0.22f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v25, 0x3f000000    # 0.5f

    .line 795
    .line 796
    const/16 v21, 0x0

    .line 797
    .line 798
    const v22, 0x3e8f5c29    # 0.28f

    .line 799
    .line 800
    .line 801
    const v23, 0x3e6147ae    # 0.22f

    .line 802
    .line 803
    .line 804
    const/high16 v24, 0x3f000000    # 0.5f

    .line 805
    .line 806
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const/high16 v4, 0x3f800000    # 1.0f

    .line 810
    .line 811
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v25, 0x41800000    # 16.0f

    .line 815
    .line 816
    const/high16 v26, 0x41380000    # 11.5f

    .line 817
    .line 818
    const v21, 0x417c7ae1    # 15.78f

    .line 819
    .line 820
    .line 821
    const/high16 v22, 0x41400000    # 12.0f

    .line 822
    .line 823
    const/high16 v23, 0x41800000    # 16.0f

    .line 824
    .line 825
    const v24, 0x413c7ae1    # 11.78f

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v4, 0x41880000    # 17.0f

    .line 835
    .line 836
    const/high16 v6, 0x40800000    # 4.0f

    .line 837
    .line 838
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v4, 0x40e00000    # 7.0f

    .line 842
    .line 843
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v4, 0x40000000    # 2.0f

    .line 847
    .line 848
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v4, 0x41200000    # 10.0f

    .line 852
    .line 853
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v4, 0x40800000    # 4.0f

    .line 857
    .line 858
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    const/16 v16, 0x3800

    .line 869
    .line 870
    const/16 v17, 0x0

    .line 871
    .line 872
    const v6, 0x3e99999a    # 0.3f

    .line 873
    .line 874
    .line 875
    const v8, 0x3e99999a    # 0.3f

    .line 876
    .line 877
    .line 878
    const/4 v7, 0x0

    .line 879
    const/high16 v9, 0x3f800000    # 1.0f

    .line 880
    .line 881
    const/high16 v12, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const/4 v14, 0x0

    .line 885
    const/4 v15, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 896
    .line 897
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 898
    .line 899
    .line 900
    move-result-wide v6

    .line 901
    const/4 v0, 0x0

    .line 902
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 906
    .line 907
    .line 908
    move-result v10

    .line 909
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 910
    .line 911
    .line 912
    move-result v11

    .line 913
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 916
    .line 917
    .line 918
    const/high16 v0, 0x41880000    # 17.0f

    .line 919
    .line 920
    const/high16 v2, 0x40000000    # 2.0f

    .line 921
    .line 922
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v0, 0x40e00000    # 7.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v17, 0x40a00000    # 5.0f

    .line 931
    .line 932
    const/high16 v18, 0x40800000    # 4.0f

    .line 933
    .line 934
    const v13, 0x40bccccd    # 5.9f

    .line 935
    .line 936
    .line 937
    const/high16 v14, 0x40000000    # 2.0f

    .line 938
    .line 939
    const/high16 v15, 0x40a00000    # 5.0f

    .line 940
    .line 941
    const v16, 0x4039999a    # 2.9f

    .line 942
    .line 943
    .line 944
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v0, 0x40000000    # 2.0f

    .line 948
    .line 949
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const/high16 v17, 0x40000000    # 2.0f

    .line 953
    .line 954
    const/high16 v18, 0x40000000    # 2.0f

    .line 955
    .line 956
    const/4 v13, 0x0

    .line 957
    const v14, 0x3f8ccccd    # 1.1f

    .line 958
    .line 959
    .line 960
    const v15, 0x3f666666    # 0.9f

    .line 961
    .line 962
    .line 963
    const/high16 v16, 0x40000000    # 2.0f

    .line 964
    .line 965
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const/high16 v0, 0x41200000    # 10.0f

    .line 969
    .line 970
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const/high16 v18, -0x40000000    # -2.0f

    .line 974
    .line 975
    const v13, 0x3f8ccccd    # 1.1f

    .line 976
    .line 977
    .line 978
    const/4 v14, 0x0

    .line 979
    const/high16 v15, 0x40000000    # 2.0f

    .line 980
    .line 981
    const v16, -0x4099999a    # -0.9f

    .line 982
    .line 983
    .line 984
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const/high16 v0, 0x40800000    # 4.0f

    .line 988
    .line 989
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const/high16 v17, 0x41880000    # 17.0f

    .line 993
    .line 994
    const/high16 v18, 0x40000000    # 2.0f

    .line 995
    .line 996
    const/high16 v13, 0x41980000    # 19.0f

    .line 997
    .line 998
    const v14, 0x4039999a    # 2.9f

    .line 999
    .line 1000
    .line 1001
    const v15, 0x4190cccd    # 18.1f

    .line 1002
    .line 1003
    .line 1004
    const/high16 v16, 0x40000000    # 2.0f

    .line 1005
    .line 1006
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    const/high16 v0, 0x40c00000    # 6.0f

    .line 1013
    .line 1014
    const/high16 v2, 0x41880000    # 17.0f

    .line 1015
    .line 1016
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1020
    .line 1021
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const/high16 v0, 0x40800000    # 4.0f

    .line 1025
    .line 1026
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1027
    .line 1028
    .line 1029
    const/high16 v0, 0x41200000    # 10.0f

    .line 1030
    .line 1031
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const/high16 v0, 0x40c00000    # 6.0f

    .line 1035
    .line 1036
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/high16 v0, 0x41b00000    # 22.0f

    .line 1043
    .line 1044
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1045
    .line 1046
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const/high16 v0, 0x40800000    # 4.0f

    .line 1050
    .line 1051
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const/high16 v17, -0x40000000    # -2.0f

    .line 1055
    .line 1056
    const/high16 v18, -0x40000000    # -2.0f

    .line 1057
    .line 1058
    const v13, -0x40733333    # -1.1f

    .line 1059
    .line 1060
    .line 1061
    const/4 v14, 0x0

    .line 1062
    const/high16 v15, -0x40000000    # -2.0f

    .line 1063
    .line 1064
    const v16, -0x4099999a    # -0.9f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const/high16 v0, -0x40800000    # -1.0f

    .line 1071
    .line 1072
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    .line 1075
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1076
    .line 1077
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1081
    .line 1082
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v17, 0x41a00000    # 20.0f

    .line 1086
    .line 1087
    const/high16 v18, 0x41b00000    # 22.0f

    .line 1088
    .line 1089
    const/high16 v13, 0x41b00000    # 22.0f

    .line 1090
    .line 1091
    const v14, 0x41a8cccd    # 21.1f

    .line 1092
    .line 1093
    .line 1094
    const v15, 0x41a8cccd    # 21.1f

    .line 1095
    .line 1096
    .line 1097
    const/high16 v16, 0x41b00000    # 22.0f

    .line 1098
    .line 1099
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const v0, 0x41230a3d    # 10.19f

    .line 1106
    .line 1107
    .line 1108
    const v2, 0x41943d71    # 18.53f

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    const v17, 0x4185999a    # 16.7f

    .line 1115
    .line 1116
    .line 1117
    const/high16 v18, 0x41100000    # 9.0f

    .line 1118
    .line 1119
    const v13, 0x4191ae14    # 18.21f

    .line 1120
    .line 1121
    .line 1122
    const v14, 0x4117851f    # 9.47f

    .line 1123
    .line 1124
    .line 1125
    const v15, 0x418beb85    # 17.49f

    .line 1126
    .line 1127
    .line 1128
    const/high16 v16, 0x41100000    # 9.0f

    .line 1129
    .line 1130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const v0, 0x40e9999a    # 7.3f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v17, -0x4015c28f    # -1.83f

    .line 1140
    .line 1141
    .line 1142
    const v18, 0x3f9851ec    # 1.19f

    .line 1143
    .line 1144
    .line 1145
    const v13, -0x40b5c28f    # -0.79f

    .line 1146
    .line 1147
    .line 1148
    const/4 v14, 0x0

    .line 1149
    const v15, -0x403eb852    # -1.51f

    .line 1150
    .line 1151
    .line 1152
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const/high16 v0, 0x41900000    # 18.0f

    .line 1159
    .line 1160
    const/high16 v2, 0x40000000    # 2.0f

    .line 1161
    .line 1162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1166
    .line 1167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1168
    .line 1169
    .line 1170
    const v0, 0x41230a3d    # 10.19f

    .line 1171
    .line 1172
    .line 1173
    const v2, 0x41943d71    # 18.53f

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const/high16 v0, 0x41180000    # 9.5f

    .line 1183
    .line 1184
    const/high16 v2, 0x41800000    # 16.0f

    .line 1185
    .line 1186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1187
    .line 1188
    .line 1189
    const/high16 v0, -0x40800000    # -1.0f

    .line 1190
    .line 1191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1192
    .line 1193
    .line 1194
    const/high16 v17, 0x41000000    # 8.0f

    .line 1195
    .line 1196
    const/high16 v18, 0x41780000    # 15.5f

    .line 1197
    .line 1198
    const v13, 0x4103851f    # 8.22f

    .line 1199
    .line 1200
    .line 1201
    const/high16 v14, 0x41800000    # 16.0f

    .line 1202
    .line 1203
    const/high16 v15, 0x41000000    # 8.0f

    .line 1204
    .line 1205
    const v16, 0x417c7ae1    # 15.78f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const/high16 v17, 0x41080000    # 8.5f

    .line 1212
    .line 1213
    const/high16 v18, 0x41700000    # 15.0f

    .line 1214
    .line 1215
    const/high16 v13, 0x41000000    # 8.0f

    .line 1216
    .line 1217
    const v14, 0x4173851f    # 15.22f

    .line 1218
    .line 1219
    .line 1220
    const v15, 0x4103851f    # 8.22f

    .line 1221
    .line 1222
    .line 1223
    const/high16 v16, 0x41700000    # 15.0f

    .line 1224
    .line 1225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1226
    .line 1227
    .line 1228
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1229
    .line 1230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1234
    .line 1235
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1236
    .line 1237
    const v13, 0x3e8f5c29    # 0.28f

    .line 1238
    .line 1239
    .line 1240
    const/4 v14, 0x0

    .line 1241
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1242
    .line 1243
    const v16, 0x3e6147ae    # 0.22f

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const/high16 v17, 0x41180000    # 9.5f

    .line 1250
    .line 1251
    const/high16 v18, 0x41800000    # 16.0f

    .line 1252
    .line 1253
    const/high16 v13, 0x41200000    # 10.0f

    .line 1254
    .line 1255
    const v14, 0x417c7ae1    # 15.78f

    .line 1256
    .line 1257
    .line 1258
    const v15, 0x411c7ae1    # 9.78f

    .line 1259
    .line 1260
    .line 1261
    const/high16 v16, 0x41800000    # 16.0f

    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1267
    .line 1268
    .line 1269
    const/high16 v0, 0x41600000    # 14.0f

    .line 1270
    .line 1271
    const/high16 v2, 0x41180000    # 9.5f

    .line 1272
    .line 1273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const/high16 v0, -0x40800000    # -1.0f

    .line 1277
    .line 1278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1279
    .line 1280
    .line 1281
    const/high16 v17, 0x41000000    # 8.0f

    .line 1282
    .line 1283
    const/high16 v18, 0x41580000    # 13.5f

    .line 1284
    .line 1285
    const v13, 0x4103851f    # 8.22f

    .line 1286
    .line 1287
    .line 1288
    const/high16 v14, 0x41600000    # 14.0f

    .line 1289
    .line 1290
    const/high16 v15, 0x41000000    # 8.0f

    .line 1291
    .line 1292
    const v16, 0x415c7ae1    # 13.78f

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    const/high16 v17, 0x41080000    # 8.5f

    .line 1299
    .line 1300
    const/high16 v18, 0x41500000    # 13.0f

    .line 1301
    .line 1302
    const/high16 v13, 0x41000000    # 8.0f

    .line 1303
    .line 1304
    const v14, 0x4153851f    # 13.22f

    .line 1305
    .line 1306
    .line 1307
    const v15, 0x4103851f    # 8.22f

    .line 1308
    .line 1309
    .line 1310
    const/high16 v16, 0x41500000    # 13.0f

    .line 1311
    .line 1312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1313
    .line 1314
    .line 1315
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1316
    .line 1317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1321
    .line 1322
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1323
    .line 1324
    const v13, 0x3e8f5c29    # 0.28f

    .line 1325
    .line 1326
    .line 1327
    const/4 v14, 0x0

    .line 1328
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1329
    .line 1330
    const v16, 0x3e6147ae    # 0.22f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    const/high16 v17, 0x41180000    # 9.5f

    .line 1337
    .line 1338
    const/high16 v18, 0x41600000    # 14.0f

    .line 1339
    .line 1340
    const/high16 v13, 0x41200000    # 10.0f

    .line 1341
    .line 1342
    const v14, 0x415c7ae1    # 13.78f

    .line 1343
    .line 1344
    .line 1345
    const v15, 0x411c7ae1    # 9.78f

    .line 1346
    .line 1347
    .line 1348
    const/high16 v16, 0x41600000    # 14.0f

    .line 1349
    .line 1350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const/high16 v0, 0x41400000    # 12.0f

    .line 1357
    .line 1358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1359
    .line 1360
    .line 1361
    const/high16 v0, -0x40800000    # -1.0f

    .line 1362
    .line 1363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1364
    .line 1365
    .line 1366
    const/high16 v17, 0x41000000    # 8.0f

    .line 1367
    .line 1368
    const/high16 v18, 0x41380000    # 11.5f

    .line 1369
    .line 1370
    const v13, 0x4103851f    # 8.22f

    .line 1371
    .line 1372
    .line 1373
    const/high16 v14, 0x41400000    # 12.0f

    .line 1374
    .line 1375
    const/high16 v15, 0x41000000    # 8.0f

    .line 1376
    .line 1377
    const v16, 0x413c7ae1    # 11.78f

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1381
    .line 1382
    .line 1383
    const/high16 v17, 0x41080000    # 8.5f

    .line 1384
    .line 1385
    const/high16 v18, 0x41300000    # 11.0f

    .line 1386
    .line 1387
    const/high16 v13, 0x41000000    # 8.0f

    .line 1388
    .line 1389
    const v14, 0x4133851f    # 11.22f

    .line 1390
    .line 1391
    .line 1392
    const v15, 0x4103851f    # 8.22f

    .line 1393
    .line 1394
    .line 1395
    const/high16 v16, 0x41300000    # 11.0f

    .line 1396
    .line 1397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1398
    .line 1399
    .line 1400
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1401
    .line 1402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1403
    .line 1404
    .line 1405
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1406
    .line 1407
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1408
    .line 1409
    const v13, 0x3e8f5c29    # 0.28f

    .line 1410
    .line 1411
    .line 1412
    const/4 v14, 0x0

    .line 1413
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1414
    .line 1415
    const v16, 0x3e6147ae    # 0.22f

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1419
    .line 1420
    .line 1421
    const/high16 v17, 0x41180000    # 9.5f

    .line 1422
    .line 1423
    const/high16 v18, 0x41400000    # 12.0f

    .line 1424
    .line 1425
    const/high16 v13, 0x41200000    # 10.0f

    .line 1426
    .line 1427
    const v14, 0x413c7ae1    # 11.78f

    .line 1428
    .line 1429
    .line 1430
    const v15, 0x411c7ae1    # 9.78f

    .line 1431
    .line 1432
    .line 1433
    const/high16 v16, 0x41400000    # 12.0f

    .line 1434
    .line 1435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1439
    .line 1440
    .line 1441
    const/high16 v0, 0x41480000    # 12.5f

    .line 1442
    .line 1443
    const/high16 v2, 0x41800000    # 16.0f

    .line 1444
    .line 1445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1446
    .line 1447
    .line 1448
    const/high16 v0, -0x40800000    # -1.0f

    .line 1449
    .line 1450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1451
    .line 1452
    .line 1453
    const/high16 v17, -0x41000000    # -0.5f

    .line 1454
    .line 1455
    const/high16 v18, -0x41000000    # -0.5f

    .line 1456
    .line 1457
    const v13, -0x4170a3d7    # -0.28f

    .line 1458
    .line 1459
    .line 1460
    const/4 v14, 0x0

    .line 1461
    const/high16 v15, -0x41000000    # -0.5f

    .line 1462
    .line 1463
    const v16, -0x419eb852    # -0.22f

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1467
    .line 1468
    .line 1469
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1470
    .line 1471
    const/4 v13, 0x0

    .line 1472
    const v14, -0x4170a3d7    # -0.28f

    .line 1473
    .line 1474
    .line 1475
    const v15, 0x3e6147ae    # 0.22f

    .line 1476
    .line 1477
    .line 1478
    const/high16 v16, -0x41000000    # -0.5f

    .line 1479
    .line 1480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1481
    .line 1482
    .line 1483
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1484
    .line 1485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1486
    .line 1487
    .line 1488
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1489
    .line 1490
    const v13, 0x3e8f5c29    # 0.28f

    .line 1491
    .line 1492
    .line 1493
    const/4 v14, 0x0

    .line 1494
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1495
    .line 1496
    const v16, 0x3e6147ae    # 0.22f

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1500
    .line 1501
    .line 1502
    const/high16 v17, 0x41480000    # 12.5f

    .line 1503
    .line 1504
    const/high16 v18, 0x41800000    # 16.0f

    .line 1505
    .line 1506
    const/high16 v13, 0x41500000    # 13.0f

    .line 1507
    .line 1508
    const v14, 0x417c7ae1    # 15.78f

    .line 1509
    .line 1510
    .line 1511
    const v15, 0x414c7ae1    # 12.78f

    .line 1512
    .line 1513
    .line 1514
    const/high16 v16, 0x41800000    # 16.0f

    .line 1515
    .line 1516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1520
    .line 1521
    .line 1522
    const/high16 v0, 0x41480000    # 12.5f

    .line 1523
    .line 1524
    const/high16 v2, 0x41600000    # 14.0f

    .line 1525
    .line 1526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1527
    .line 1528
    .line 1529
    const/high16 v0, -0x40800000    # -1.0f

    .line 1530
    .line 1531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const/high16 v17, -0x41000000    # -0.5f

    .line 1535
    .line 1536
    const/high16 v18, -0x41000000    # -0.5f

    .line 1537
    .line 1538
    const v13, -0x4170a3d7    # -0.28f

    .line 1539
    .line 1540
    .line 1541
    const/4 v14, 0x0

    .line 1542
    const/high16 v15, -0x41000000    # -0.5f

    .line 1543
    .line 1544
    const v16, -0x419eb852    # -0.22f

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1548
    .line 1549
    .line 1550
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1551
    .line 1552
    const/4 v13, 0x0

    .line 1553
    const v14, -0x4170a3d7    # -0.28f

    .line 1554
    .line 1555
    .line 1556
    const v15, 0x3e6147ae    # 0.22f

    .line 1557
    .line 1558
    .line 1559
    const/high16 v16, -0x41000000    # -0.5f

    .line 1560
    .line 1561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1562
    .line 1563
    .line 1564
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1565
    .line 1566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1567
    .line 1568
    .line 1569
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1570
    .line 1571
    const v13, 0x3e8f5c29    # 0.28f

    .line 1572
    .line 1573
    .line 1574
    const/4 v14, 0x0

    .line 1575
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1576
    .line 1577
    const v16, 0x3e6147ae    # 0.22f

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1581
    .line 1582
    .line 1583
    const/high16 v17, 0x41480000    # 12.5f

    .line 1584
    .line 1585
    const/high16 v18, 0x41600000    # 14.0f

    .line 1586
    .line 1587
    const/high16 v13, 0x41500000    # 13.0f

    .line 1588
    .line 1589
    const v14, 0x415c7ae1    # 13.78f

    .line 1590
    .line 1591
    .line 1592
    const v15, 0x414c7ae1    # 12.78f

    .line 1593
    .line 1594
    .line 1595
    const/high16 v16, 0x41600000    # 14.0f

    .line 1596
    .line 1597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1601
    .line 1602
    .line 1603
    const/high16 v0, 0x41480000    # 12.5f

    .line 1604
    .line 1605
    const/high16 v2, 0x41400000    # 12.0f

    .line 1606
    .line 1607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1608
    .line 1609
    .line 1610
    const/high16 v0, -0x40800000    # -1.0f

    .line 1611
    .line 1612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1613
    .line 1614
    .line 1615
    const/high16 v17, -0x41000000    # -0.5f

    .line 1616
    .line 1617
    const/high16 v18, -0x41000000    # -0.5f

    .line 1618
    .line 1619
    const v13, -0x4170a3d7    # -0.28f

    .line 1620
    .line 1621
    .line 1622
    const/4 v14, 0x0

    .line 1623
    const/high16 v15, -0x41000000    # -0.5f

    .line 1624
    .line 1625
    const v16, -0x419eb852    # -0.22f

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1629
    .line 1630
    .line 1631
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1632
    .line 1633
    const/4 v13, 0x0

    .line 1634
    const v14, -0x4170a3d7    # -0.28f

    .line 1635
    .line 1636
    .line 1637
    const v15, 0x3e6147ae    # 0.22f

    .line 1638
    .line 1639
    .line 1640
    const/high16 v16, -0x41000000    # -0.5f

    .line 1641
    .line 1642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1643
    .line 1644
    .line 1645
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1646
    .line 1647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1648
    .line 1649
    .line 1650
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1651
    .line 1652
    const v13, 0x3e8f5c29    # 0.28f

    .line 1653
    .line 1654
    .line 1655
    const/4 v14, 0x0

    .line 1656
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1657
    .line 1658
    const v16, 0x3e6147ae    # 0.22f

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1662
    .line 1663
    .line 1664
    const/high16 v17, 0x41480000    # 12.5f

    .line 1665
    .line 1666
    const/high16 v18, 0x41400000    # 12.0f

    .line 1667
    .line 1668
    const/high16 v13, 0x41500000    # 13.0f

    .line 1669
    .line 1670
    const v14, 0x413c7ae1    # 11.78f

    .line 1671
    .line 1672
    .line 1673
    const v15, 0x414c7ae1    # 12.78f

    .line 1674
    .line 1675
    .line 1676
    const/high16 v16, 0x41400000    # 12.0f

    .line 1677
    .line 1678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1682
    .line 1683
    .line 1684
    const/high16 v0, 0x41780000    # 15.5f

    .line 1685
    .line 1686
    const/high16 v2, 0x41800000    # 16.0f

    .line 1687
    .line 1688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1689
    .line 1690
    .line 1691
    const/high16 v0, -0x40800000    # -1.0f

    .line 1692
    .line 1693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1694
    .line 1695
    .line 1696
    const/high16 v17, -0x41000000    # -0.5f

    .line 1697
    .line 1698
    const/high16 v18, -0x41000000    # -0.5f

    .line 1699
    .line 1700
    const v13, -0x4170a3d7    # -0.28f

    .line 1701
    .line 1702
    .line 1703
    const/4 v14, 0x0

    .line 1704
    const/high16 v15, -0x41000000    # -0.5f

    .line 1705
    .line 1706
    const v16, -0x419eb852    # -0.22f

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1710
    .line 1711
    .line 1712
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1713
    .line 1714
    const/4 v13, 0x0

    .line 1715
    const v14, -0x4170a3d7    # -0.28f

    .line 1716
    .line 1717
    .line 1718
    const v15, 0x3e6147ae    # 0.22f

    .line 1719
    .line 1720
    .line 1721
    const/high16 v16, -0x41000000    # -0.5f

    .line 1722
    .line 1723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1724
    .line 1725
    .line 1726
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1727
    .line 1728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1729
    .line 1730
    .line 1731
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1732
    .line 1733
    const v13, 0x3e8f5c29    # 0.28f

    .line 1734
    .line 1735
    .line 1736
    const/4 v14, 0x0

    .line 1737
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1738
    .line 1739
    const v16, 0x3e6147ae    # 0.22f

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1743
    .line 1744
    .line 1745
    const/high16 v17, 0x41780000    # 15.5f

    .line 1746
    .line 1747
    const/high16 v18, 0x41800000    # 16.0f

    .line 1748
    .line 1749
    const/high16 v13, 0x41800000    # 16.0f

    .line 1750
    .line 1751
    const v14, 0x417c7ae1    # 15.78f

    .line 1752
    .line 1753
    .line 1754
    const v15, 0x417c7ae1    # 15.78f

    .line 1755
    .line 1756
    .line 1757
    const/high16 v16, 0x41800000    # 16.0f

    .line 1758
    .line 1759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1763
    .line 1764
    .line 1765
    const/high16 v0, 0x41600000    # 14.0f

    .line 1766
    .line 1767
    const/high16 v2, 0x41780000    # 15.5f

    .line 1768
    .line 1769
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1770
    .line 1771
    .line 1772
    const/high16 v0, -0x40800000    # -1.0f

    .line 1773
    .line 1774
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1775
    .line 1776
    .line 1777
    const/high16 v17, -0x41000000    # -0.5f

    .line 1778
    .line 1779
    const/high16 v18, -0x41000000    # -0.5f

    .line 1780
    .line 1781
    const v13, -0x4170a3d7    # -0.28f

    .line 1782
    .line 1783
    .line 1784
    const/4 v14, 0x0

    .line 1785
    const/high16 v15, -0x41000000    # -0.5f

    .line 1786
    .line 1787
    const v16, -0x419eb852    # -0.22f

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1791
    .line 1792
    .line 1793
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1794
    .line 1795
    const/4 v13, 0x0

    .line 1796
    const v14, -0x4170a3d7    # -0.28f

    .line 1797
    .line 1798
    .line 1799
    const v15, 0x3e6147ae    # 0.22f

    .line 1800
    .line 1801
    .line 1802
    const/high16 v16, -0x41000000    # -0.5f

    .line 1803
    .line 1804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1805
    .line 1806
    .line 1807
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1808
    .line 1809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1810
    .line 1811
    .line 1812
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1813
    .line 1814
    const v13, 0x3e8f5c29    # 0.28f

    .line 1815
    .line 1816
    .line 1817
    const/4 v14, 0x0

    .line 1818
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1819
    .line 1820
    const v16, 0x3e6147ae    # 0.22f

    .line 1821
    .line 1822
    .line 1823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1824
    .line 1825
    .line 1826
    const/high16 v17, 0x41780000    # 15.5f

    .line 1827
    .line 1828
    const/high16 v18, 0x41600000    # 14.0f

    .line 1829
    .line 1830
    const/high16 v13, 0x41800000    # 16.0f

    .line 1831
    .line 1832
    const v14, 0x415c7ae1    # 13.78f

    .line 1833
    .line 1834
    .line 1835
    const v15, 0x417c7ae1    # 15.78f

    .line 1836
    .line 1837
    .line 1838
    const/high16 v16, 0x41600000    # 14.0f

    .line 1839
    .line 1840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1841
    .line 1842
    .line 1843
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1844
    .line 1845
    .line 1846
    const/high16 v0, 0x41400000    # 12.0f

    .line 1847
    .line 1848
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1849
    .line 1850
    .line 1851
    const/high16 v0, -0x40800000    # -1.0f

    .line 1852
    .line 1853
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1854
    .line 1855
    .line 1856
    const/high16 v17, -0x41000000    # -0.5f

    .line 1857
    .line 1858
    const/high16 v18, -0x41000000    # -0.5f

    .line 1859
    .line 1860
    const v13, -0x4170a3d7    # -0.28f

    .line 1861
    .line 1862
    .line 1863
    const/4 v14, 0x0

    .line 1864
    const/high16 v15, -0x41000000    # -0.5f

    .line 1865
    .line 1866
    const v16, -0x419eb852    # -0.22f

    .line 1867
    .line 1868
    .line 1869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1870
    .line 1871
    .line 1872
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1873
    .line 1874
    const/4 v13, 0x0

    .line 1875
    const v14, -0x4170a3d7    # -0.28f

    .line 1876
    .line 1877
    .line 1878
    const v15, 0x3e6147ae    # 0.22f

    .line 1879
    .line 1880
    .line 1881
    const/high16 v16, -0x41000000    # -0.5f

    .line 1882
    .line 1883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1884
    .line 1885
    .line 1886
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1887
    .line 1888
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1889
    .line 1890
    .line 1891
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1892
    .line 1893
    const v13, 0x3e8f5c29    # 0.28f

    .line 1894
    .line 1895
    .line 1896
    const/4 v14, 0x0

    .line 1897
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1898
    .line 1899
    const v16, 0x3e6147ae    # 0.22f

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1903
    .line 1904
    .line 1905
    const/high16 v17, 0x41780000    # 15.5f

    .line 1906
    .line 1907
    const/high16 v18, 0x41400000    # 12.0f

    .line 1908
    .line 1909
    const/high16 v13, 0x41800000    # 16.0f

    .line 1910
    .line 1911
    const v14, 0x413c7ae1    # 11.78f

    .line 1912
    .line 1913
    .line 1914
    const v15, 0x417c7ae1    # 15.78f

    .line 1915
    .line 1916
    .line 1917
    const/high16 v16, 0x41400000    # 12.0f

    .line 1918
    .line 1919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v2

    .line 1929
    const/16 v16, 0x3800

    .line 1930
    .line 1931
    const/16 v17, 0x0

    .line 1932
    .line 1933
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1934
    .line 1935
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1936
    .line 1937
    const/4 v7, 0x0

    .line 1938
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1939
    .line 1940
    const/4 v13, 0x0

    .line 1941
    const/4 v14, 0x0

    .line 1942
    const/4 v15, 0x0

    .line 1943
    const-string v4, ""

    .line 1944
    .line 1945
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v0

    .line 1953
    sput-object v0, Landroidx/compose/material/icons/twotone/PointOfSaleKt;->_pointOfSale:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1954
    .line 1955
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1956
    .line 1957
    .line 1958
    return-object v0
.end method
