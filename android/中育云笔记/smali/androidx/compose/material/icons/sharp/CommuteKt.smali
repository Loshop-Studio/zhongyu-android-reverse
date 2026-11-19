.class public final Landroidx/compose/material/icons/sharp/CommuteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _commute:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCommute(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/CommuteKt;->_commute:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Commute"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40e00000    # 7.0f

    .line 85
    .line 86
    const v13, 0x4055c28f    # 3.34f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40800000    # 4.0f

    .line 90
    .line 91
    const/high16 v15, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v16, 0x40aae148    # 5.34f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40400000    # 3.0f

    .line 105
    .line 106
    const/high16 v18, 0x40400000    # 3.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3fd47ae1    # 1.66f

    .line 110
    .line 111
    .line 112
    const v15, 0x3fab851f    # 1.34f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40400000    # 3.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, -0x40800000    # -1.0f

    .line 121
    .line 122
    const/high16 v2, 0x3f800000    # 1.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x3f800000    # 1.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, -0x40000000    # -2.0f

    .line 136
    .line 137
    const/high16 v2, 0x40000000    # 2.0f

    .line 138
    .line 139
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, -0x3f600000    # -5.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41500000    # 13.0f

    .line 153
    .line 154
    const/high16 v2, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40c00000    # 6.0f

    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41100000    # 9.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x41700000    # 15.0f

    .line 178
    .line 179
    const/high16 v2, 0x40e00000    # 7.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 185
    .line 186
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 187
    .line 188
    const v14, -0x402b851f    # -1.66f

    .line 189
    .line 190
    .line 191
    const v15, -0x40547ae1    # -1.34f

    .line 192
    .line 193
    .line 194
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41600000    # 14.0f

    .line 203
    .line 204
    const/high16 v2, 0x40a00000    # 5.0f

    .line 205
    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v18, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const v13, 0x3f0ccccd    # 0.55f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const/high16 v15, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const v16, 0x3ee66666    # 0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, -0x4119999a    # -0.45f

    .line 226
    .line 227
    .line 228
    const/high16 v2, -0x40800000    # -1.0f

    .line 229
    .line 230
    const/high16 v4, 0x3f800000    # 1.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x41a48f5c    # 20.57f

    .line 248
    .line 249
    .line 250
    const v2, 0x411a8f5c    # 9.66f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x4087ae14    # -0.97f

    .line 257
    .line 258
    .line 259
    const v18, -0x40d70a3d    # -0.66f

    .line 260
    .line 261
    .line 262
    const v13, -0x41f0a3d7    # -0.14f

    .line 263
    .line 264
    .line 265
    const v14, -0x41333333    # -0.4f

    .line 266
    .line 267
    .line 268
    const v15, -0x40fae148    # -0.52f

    .line 269
    .line 270
    .line 271
    const v16, -0x40d70a3d    # -0.66f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x3f19eb85    # -7.19f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x40851eb8    # -0.98f

    .line 284
    .line 285
    .line 286
    const v18, 0x3f28f5c3    # 0.66f

    .line 287
    .line 288
    .line 289
    const v13, -0x41147ae1    # -0.46f

    .line 290
    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const v15, -0x40ab851f    # -0.83f

    .line 294
    .line 295
    .line 296
    const v16, 0x3e851eb8    # 0.26f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x404a3d71    # -1.42f

    .line 303
    .line 304
    .line 305
    const v2, 0x4083851f    # 4.11f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x40b051ec    # 5.51f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3f30a3d7    # 0.69f

    .line 318
    .line 319
    .line 320
    const v18, 0x3f3851ec    # 0.72f

    .line 321
    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const v14, 0x3ec28f5c    # 0.38f

    .line 325
    .line 326
    .line 327
    const v15, 0x3e9eb852    # 0.31f

    .line 328
    .line 329
    .line 330
    const v16, 0x3f3851ec    # 0.72f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x3f1eb852    # 0.62f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x3f2e147b    # 0.68f

    .line 343
    .line 344
    .line 345
    const v18, -0x40bd70a4    # -0.76f

    .line 346
    .line 347
    .line 348
    const v13, 0x3ec28f5c    # 0.38f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const v15, 0x3f2e147b    # 0.68f

    .line 353
    .line 354
    .line 355
    const v16, -0x413d70a4    # -0.38f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41900000    # 18.0f

    .line 362
    .line 363
    const/high16 v2, 0x41400000    # 12.0f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41000000    # 8.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3f9eb852    # 1.24f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3f30a3d7    # 0.69f

    .line 380
    .line 381
    .line 382
    const v18, 0x3f428f5c    # 0.76f

    .line 383
    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const v14, 0x3ec28f5c    # 0.38f

    .line 387
    .line 388
    .line 389
    const v15, 0x3e9eb852    # 0.31f

    .line 390
    .line 391
    .line 392
    const v16, 0x3f428f5c    # 0.76f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x3f1c28f6    # 0.61f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v18, -0x40c7ae14    # -0.72f

    .line 405
    .line 406
    .line 407
    const v13, 0x3ec28f5c    # 0.38f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, 0x3f30a3d7    # 0.69f

    .line 412
    .line 413
    .line 414
    const v16, -0x4151eb85    # -0.34f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3c23d70a    # 0.01f

    .line 421
    .line 422
    .line 423
    const v2, -0x4050a3d7    # -1.37f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x3f7b851f    # -4.14f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x4048f5c3    # -1.43f

    .line 436
    .line 437
    .line 438
    const v2, -0x3f7c7ae1    # -4.11f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x41468f5c    # 12.41f

    .line 448
    .line 449
    .line 450
    const/high16 v2, 0x41200000    # 10.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x40e6147b    # 7.19f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x40400000    # 3.0f

    .line 462
    .line 463
    const v2, 0x3f83d70a    # 1.03f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, -0x3eec0000    # -9.25f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41800000    # 16.0f

    .line 483
    .line 484
    const/high16 v2, 0x41400000    # 12.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, -0x40800000    # -1.0f

    .line 490
    .line 491
    const/high16 v18, -0x40800000    # -1.0f

    .line 492
    .line 493
    const v13, -0x40f33333    # -0.55f

    .line 494
    .line 495
    .line 496
    const/high16 v15, -0x40800000    # -1.0f

    .line 497
    .line 498
    const v16, -0x4119999a    # -0.45f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3ee66666    # 0.45f

    .line 505
    .line 506
    .line 507
    const/high16 v2, -0x40800000    # -1.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v0, -0x4119999a    # -0.45f

    .line 518
    .line 519
    .line 520
    const/high16 v2, -0x40800000    # -1.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41a00000    # 20.0f

    .line 529
    .line 530
    const/high16 v2, 0x41800000    # 16.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    const/high16 v2, -0x40800000    # -1.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v2, 0x3f800000    # 1.0f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x4119999a    # -0.45f

    .line 552
    .line 553
    .line 554
    const/high16 v2, -0x40800000    # -1.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v16, 0x3800

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v8, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v7, 0x0

    .line 575
    const/high16 v9, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v12, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const/4 v15, 0x0

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sput-object v0, Landroidx/compose/material/icons/sharp/CommuteKt;->_commute:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-object v0
.end method
