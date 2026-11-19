.class public final Landroidx/compose/material/icons/rounded/WaterfallChartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _waterfallChart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaterfallChart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WaterfallChartKt;->_waterfallChart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WaterfallChart"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x41a80000    # 21.0f

    .line 81
    .line 82
    const/high16 v18, 0x40b00000    # 5.5f

    .line 83
    .line 84
    const v13, 0x41a2a3d7    # 20.33f

    .line 85
    .line 86
    .line 87
    const/high16 v14, 0x40800000    # 4.0f

    .line 88
    .line 89
    const/high16 v15, 0x41a80000    # 21.0f

    .line 90
    .line 91
    const v16, 0x409570a4    # 4.67f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x41500000    # 13.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, -0x40400000    # -1.5f

    .line 103
    .line 104
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, 0x3f547ae1    # 0.83f

    .line 108
    .line 109
    .line 110
    const v15, -0x40d47ae1    # -0.67f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v18, -0x40400000    # -1.5f

    .line 123
    .line 124
    const v13, -0x40ab851f    # -0.83f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, -0x40400000    # -1.5f

    .line 129
    .line 130
    const v16, -0x40d47ae1    # -0.67f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, -0x3eb00000    # -13.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x419c0000    # 19.5f

    .line 142
    .line 143
    const/high16 v18, 0x40800000    # 4.0f

    .line 144
    .line 145
    const/high16 v13, 0x41900000    # 18.0f

    .line 146
    .line 147
    const v14, 0x409570a4    # 4.67f

    .line 148
    .line 149
    .line 150
    const v15, 0x41955c29    # 18.67f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x40800000    # 4.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40900000    # 4.5f

    .line 162
    .line 163
    const/high16 v2, 0x41500000    # 13.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x40c00000    # 6.0f

    .line 172
    .line 173
    const/high16 v18, 0x41680000    # 14.5f

    .line 174
    .line 175
    const v13, 0x40aa8f5c    # 5.33f

    .line 176
    .line 177
    .line 178
    const/high16 v14, 0x41500000    # 13.0f

    .line 179
    .line 180
    const/high16 v15, 0x40c00000    # 6.0f

    .line 181
    .line 182
    const v16, 0x415ab852    # 13.67f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x40800000    # 4.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40900000    # 4.5f

    .line 194
    .line 195
    const/high16 v18, 0x41a00000    # 20.0f

    .line 196
    .line 197
    const/high16 v13, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v14, 0x419aa3d7    # 19.33f

    .line 200
    .line 201
    .line 202
    const v15, 0x40aa8f5c    # 5.33f

    .line 203
    .line 204
    .line 205
    const/high16 v16, 0x41a00000    # 20.0f

    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v17, 0x40400000    # 3.0f

    .line 215
    .line 216
    const/high16 v18, 0x41940000    # 18.5f

    .line 217
    .line 218
    const v13, 0x406ae148    # 3.67f

    .line 219
    .line 220
    .line 221
    const/high16 v14, 0x41a00000    # 20.0f

    .line 222
    .line 223
    const/high16 v15, 0x40400000    # 3.0f

    .line 224
    .line 225
    const v16, 0x419aa3d7    # 19.33f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, -0x3f800000    # -4.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x40900000    # 4.5f

    .line 237
    .line 238
    const/high16 v18, 0x41500000    # 13.0f

    .line 239
    .line 240
    const/high16 v13, 0x40400000    # 3.0f

    .line 241
    .line 242
    const v14, 0x415ab852    # 13.67f

    .line 243
    .line 244
    .line 245
    const v15, 0x406ae148    # 3.67f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x41500000    # 13.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41780000    # 15.5f

    .line 257
    .line 258
    const/high16 v2, 0x40800000    # 4.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x41880000    # 17.0f

    .line 267
    .line 268
    const/high16 v18, 0x40b00000    # 5.5f

    .line 269
    .line 270
    const v13, 0x4182a3d7    # 16.33f

    .line 271
    .line 272
    .line 273
    const/high16 v14, 0x40800000    # 4.0f

    .line 274
    .line 275
    const/high16 v15, 0x41880000    # 17.0f

    .line 276
    .line 277
    const v16, 0x409570a4    # 4.67f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x41780000    # 15.5f

    .line 288
    .line 289
    const/high16 v18, 0x40e00000    # 7.0f

    .line 290
    .line 291
    const/high16 v13, 0x41880000    # 17.0f

    .line 292
    .line 293
    const v14, 0x40ca8f5c    # 6.33f

    .line 294
    .line 295
    .line 296
    const v15, 0x4182a3d7    # 16.33f

    .line 297
    .line 298
    .line 299
    const/high16 v16, 0x40e00000    # 7.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x41600000    # 14.0f

    .line 308
    .line 309
    const/high16 v18, 0x40b00000    # 5.5f

    .line 310
    .line 311
    const v13, 0x416ab852    # 14.67f

    .line 312
    .line 313
    .line 314
    const/high16 v14, 0x40e00000    # 7.0f

    .line 315
    .line 316
    const/high16 v15, 0x41600000    # 14.0f

    .line 317
    .line 318
    const v16, 0x40ca8f5c    # 6.33f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x41780000    # 15.5f

    .line 328
    .line 329
    const/high16 v18, 0x40800000    # 4.0f

    .line 330
    .line 331
    const/high16 v13, 0x41600000    # 14.0f

    .line 332
    .line 333
    const v14, 0x409570a4    # 4.67f

    .line 334
    .line 335
    .line 336
    const v15, 0x416ab852    # 14.67f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x40800000    # 4.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40a00000    # 5.0f

    .line 348
    .line 349
    const/high16 v2, 0x41380000    # 11.5f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41500000    # 13.0f

    .line 358
    .line 359
    const/high16 v18, 0x40d00000    # 6.5f

    .line 360
    .line 361
    const v13, 0x414547ae    # 12.33f

    .line 362
    .line 363
    .line 364
    const/high16 v14, 0x40a00000    # 5.0f

    .line 365
    .line 366
    const/high16 v15, 0x41500000    # 13.0f

    .line 367
    .line 368
    const v16, 0x40b570a4    # 5.67f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x3f800000    # 1.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x41380000    # 11.5f

    .line 380
    .line 381
    const/high16 v18, 0x41100000    # 9.0f

    .line 382
    .line 383
    const/high16 v13, 0x41500000    # 13.0f

    .line 384
    .line 385
    const v14, 0x410547ae    # 8.33f

    .line 386
    .line 387
    .line 388
    const v15, 0x414547ae    # 12.33f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/4 v0, 0x0

    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x41200000    # 10.0f

    .line 401
    .line 402
    const/high16 v18, 0x40f00000    # 7.5f

    .line 403
    .line 404
    const v13, 0x412ab852    # 10.67f

    .line 405
    .line 406
    .line 407
    const/high16 v14, 0x41100000    # 9.0f

    .line 408
    .line 409
    const/high16 v15, 0x41200000    # 10.0f

    .line 410
    .line 411
    const v16, 0x410547ae    # 8.33f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, -0x40800000    # -1.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, 0x41380000    # 11.5f

    .line 423
    .line 424
    const/high16 v18, 0x40a00000    # 5.0f

    .line 425
    .line 426
    const/high16 v13, 0x41200000    # 10.0f

    .line 427
    .line 428
    const v14, 0x40b570a4    # 5.67f

    .line 429
    .line 430
    .line 431
    const v15, 0x412ab852    # 10.67f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x40a00000    # 5.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41200000    # 10.0f

    .line 443
    .line 444
    const/high16 v2, 0x41080000    # 8.5f

    .line 445
    .line 446
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 453
    .line 454
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 455
    .line 456
    const v13, 0x3f547ae1    # 0.83f

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 461
    .line 462
    const v16, 0x3f2b851f    # 0.67f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x3f800000    # 1.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x40400000    # -1.5f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x3f547ae1    # 0.83f

    .line 477
    .line 478
    .line 479
    const v15, -0x40d47ae1    # -0.67f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/4 v0, 0x0

    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, 0x40e00000    # 7.0f

    .line 492
    .line 493
    const/high16 v18, 0x41480000    # 12.5f

    .line 494
    .line 495
    const v13, 0x40f570a4    # 7.67f

    .line 496
    .line 497
    .line 498
    const/high16 v14, 0x41600000    # 14.0f

    .line 499
    .line 500
    const/high16 v15, 0x40e00000    # 7.0f

    .line 501
    .line 502
    const v16, 0x415547ae    # 13.33f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, -0x40800000    # -1.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x41080000    # 8.5f

    .line 514
    .line 515
    const/high16 v18, 0x41200000    # 10.0f

    .line 516
    .line 517
    const/high16 v13, 0x40e00000    # 7.0f

    .line 518
    .line 519
    const v14, 0x412ab852    # 10.67f

    .line 520
    .line 521
    .line 522
    const v15, 0x40f570a4    # 7.67f

    .line 523
    .line 524
    .line 525
    const/high16 v16, 0x41200000    # 10.0f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v9, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/rounded/WaterfallChartKt;->_waterfallChart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
