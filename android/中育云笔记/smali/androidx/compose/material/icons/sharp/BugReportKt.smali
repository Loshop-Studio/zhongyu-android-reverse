.class public final Landroidx/compose/material/icons/sharp/BugReportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBugReport(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.BugReport"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fcc28f6    # -2.81f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40170a3d    # -1.82f

    .line 84
    .line 85
    .line 86
    const v18, -0x40051eb8    # -1.96f

    .line 87
    .line 88
    .line 89
    const v13, -0x4119999a    # -0.45f

    .line 90
    .line 91
    .line 92
    const v14, -0x40b851ec    # -0.78f

    .line 93
    .line 94
    .line 95
    const v15, -0x40770a3d    # -1.07f

    .line 96
    .line 97
    .line 98
    const v16, -0x40466666    # -1.45f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41880000    # 17.0f

    .line 105
    .line 106
    const v2, 0x408d1eb8    # 4.41f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x417970a4    # 15.59f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x40400000    # 3.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, -0x3ff51eb8    # -2.17f

    .line 121
    .line 122
    .line 123
    const v2, 0x400ae148    # 2.17f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x41400000    # 12.0f

    .line 130
    .line 131
    const/high16 v18, 0x40a00000    # 5.0f

    .line 132
    .line 133
    const v13, 0x414f5c29    # 12.96f

    .line 134
    .line 135
    .line 136
    const v14, 0x40a1eb85    # 5.06f

    .line 137
    .line 138
    .line 139
    const v15, 0x4147d70a    # 12.49f

    .line 140
    .line 141
    .line 142
    const/high16 v16, 0x40a00000    # 5.0f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, -0x404b851f    # -1.41f

    .line 148
    .line 149
    .line 150
    const v2, 0x3e2e147b    # 0.17f

    .line 151
    .line 152
    .line 153
    const v4, -0x408a3d71    # -0.96f

    .line 154
    .line 155
    .line 156
    const v6, 0x3d75c28f    # 0.06f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x41068f5c    # 8.41f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x40400000    # 3.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x40e00000    # 7.0f

    .line 171
    .line 172
    const v2, 0x408d1eb8    # 4.41f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x3fcf5c29    # 1.62f

    .line 179
    .line 180
    .line 181
    const v2, 0x3fd0a3d7    # 1.63f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x40d9eb85    # 6.81f

    .line 188
    .line 189
    .line 190
    const/high16 v18, 0x41000000    # 8.0f

    .line 191
    .line 192
    const v13, 0x40fc28f6    # 7.88f

    .line 193
    .line 194
    .line 195
    const v14, 0x40d1999a    # 6.55f

    .line 196
    .line 197
    .line 198
    const v15, 0x40e851ec    # 7.26f

    .line 199
    .line 200
    .line 201
    const v16, 0x40e70a3d    # 7.22f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41000000    # 8.0f

    .line 208
    .line 209
    const/high16 v2, 0x40800000    # 4.0f

    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x40000000    # 2.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x4005c28f    # 2.09f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, -0x4247ae14    # -0.09f

    .line 226
    .line 227
    .line 228
    const/high16 v18, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const v13, -0x42b33333    # -0.05f

    .line 231
    .line 232
    .line 233
    const v14, 0x3ea8f5c3    # 0.33f

    .line 234
    .line 235
    .line 236
    const v15, -0x4247ae14    # -0.09f

    .line 237
    .line 238
    .line 239
    const v16, 0x3f28f5c3    # 0.66f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x3f800000    # 1.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41400000    # 12.0f

    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3db851ec    # 0.09f

    .line 269
    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    const v14, 0x3eae147b    # 0.34f

    .line 273
    .line 274
    .line 275
    const v15, 0x3d23d70a    # 0.04f

    .line 276
    .line 277
    .line 278
    const v16, 0x3f2b851f    # 0.67f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41800000    # 16.0f

    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x40000000    # 2.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x4033d70a    # 2.81f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x40a6147b    # 5.19f

    .line 301
    .line 302
    .line 303
    const/high16 v18, 0x40400000    # 3.0f

    .line 304
    .line 305
    const v13, 0x3f851eb8    # 1.04f

    .line 306
    .line 307
    .line 308
    const v14, 0x3fe51eb8    # 1.79f

    .line 309
    .line 310
    .line 311
    const v15, 0x403e147b    # 2.97f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x40400000    # 3.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x40a6147b    # 5.19f

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 323
    .line 324
    const v4, 0x4084cccd    # 4.15f

    .line 325
    .line 326
    .line 327
    const v6, -0x40651eb8    # -1.21f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41900000    # 18.0f

    .line 334
    .line 335
    const/high16 v2, 0x41a00000    # 20.0f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, -0x40000000    # -2.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x3ffa3d71    # -2.09f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3db851ec    # 0.09f

    .line 352
    .line 353
    .line 354
    const/high16 v18, -0x40800000    # -1.0f

    .line 355
    .line 356
    const v13, 0x3d4ccccd    # 0.05f

    .line 357
    .line 358
    .line 359
    const v14, -0x41570a3d    # -0.33f

    .line 360
    .line 361
    .line 362
    const v15, 0x3db851ec    # 0.09f

    .line 363
    .line 364
    .line 365
    const v16, -0x40d70a3d    # -0.66f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40000000    # 2.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, -0x40000000    # -2.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, -0x40800000    # -1.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x4247ae14    # -0.09f

    .line 395
    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, -0x4151eb85    # -0.34f

    .line 399
    .line 400
    .line 401
    const v15, -0x42dc28f6    # -0.04f

    .line 402
    .line 403
    .line 404
    const v16, -0x40d47ae1    # -0.67f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41200000    # 10.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41000000    # 8.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41600000    # 14.0f

    .line 424
    .line 425
    const/high16 v2, 0x41800000    # 16.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, -0x3f800000    # -4.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, -0x40000000    # -2.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x40800000    # 4.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40000000    # 2.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41600000    # 14.0f

    .line 454
    .line 455
    const/high16 v2, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, -0x3f800000    # -4.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, -0x40000000    # -2.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x40800000    # 4.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sput-object v0, Landroidx/compose/material/icons/sharp/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
